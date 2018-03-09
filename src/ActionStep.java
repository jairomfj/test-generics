public abstract class ActionStep<T> {

    public CrawlerResponse<T> response;

    public abstract T run();

    class CrawlerResponse<T> {
        final T value;

        public CrawlerResponse(T value) {
            this.value = value;
        }
    }
}
