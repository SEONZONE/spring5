# Spring 5 공부기록 

- ## @Component

  - #### @Component

    - @Component 애노테이션은 해당 클래스를 스캔 대상으로 표시한다.

  - #### @ComponentScan

    - @Component 애노테이션을 붙인 클래스를 스캔해서 스프링 빈으로 등록하려면 설정 클래스에 @ComponentScan 애노테이션을 적용해야 한다.

    - 스캔 대상에서 제외하거나 포함할 경우

      - 제외

        - `FilterType.REGX` 를 사용한다.

        ```java
        excludeFilters = @Filter(type=FilterType.REGX.pattern = "spring\\..*Dao");
        ```

      - 포함

        - `FilterType.ASPECTJ` 사용

        ```java
        excludeFilters = @Filter(type=FilterType.ASPECTJ.pattern="spirng.*Dao");
        ```

        - 해당 기능을 사용하려면 의존성을 추가해야 함 

        ```xml
        <dependency>
        	<groupId>org.aspectj</groupId>
          <artifactId>aspectjweaver</artifactId>
          <version>해당 버전 </version>
        </dependency>
        ```

  - Component Scan을 사용하려면 중복된 빈 이름이 있어서는 안된다. 

  - 수동 등록한 빈과 충돌하지 않으려면 `@Quailfer` 를 사용해야 한다.

    

- ## 빈 라이프사이클과 범위

  - ### 초기화

    - ```java
      AnnotaionConfigApplication ctx = new AnnotaionConfigApplicationContext(Context.class);
      ```

      

  - ### 사용

    - ```java
      Greeter g = ctx.getBean("greeter",Greeter.class);
      String msg = g.greet("스프링");
      ```

      

  - ### 종료

    - ```java
      ctx.close();
      ```

  - ### 스프링 빈 객체의 라이플 사이클 

    객체 생성 -> 의존 설정 -> 초기화 -> 소멸 

  

  
