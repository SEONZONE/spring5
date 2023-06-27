package spring5fs.core.chap04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring5fs.core.chap04.spring.*;

@Configuration
public class AppCtx {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberRegisterService memberRegisterService() {
        return new MemberRegisterService();
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        ChangePasswordService pwdSvc = new ChangePasswordService();
        return pwdSvc;
    }

    @Bean
    public MemberPrinter memberPrinter() {
        return new MemberPrinter();
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        return infoPrinter;
    }

    @Bean
    public VersionPrinter versionPrinter() {
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }

    @Bean
    public MemberListPrinter listPrinter() {
        return new MemberListPrinter();
    }


}
