package spring5fs.core.chap07;

public class ExeTimeCalculator implements Calculator{
    private Calculator delegate;

    public ExeTimeCalculator(Calculator delegate) {
        this.delegate = delegate;
    }

    @Override
    public long factoria(long num) {
        long start = System.nanoTime();
        long result = delegate.factoria(num);
        long end = System.nanoTime();

        System.out.printf("%s.facotria(%d) 실행 시간 = %d\n",delegate.getClass().getSimpleName(),num,(end - start));
        return result;
    }
}
