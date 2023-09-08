package p283z4;

import java.util.concurrent.Executor;

/* renamed from: z4.b */
public enum C16099b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
