import org.apache.log4j.Logger;

/**
 * Created by vig on 1/20/17.
 */
public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("debug");
        LOG.info("debug");
        LOG.trace("debug");
        LOG.warn("debug");
        LOG.error("debug");
        LOG.fatal("debug");
    }
}
