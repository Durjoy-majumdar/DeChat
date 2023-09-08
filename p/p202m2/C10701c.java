package p202m2;

import java.util.concurrent.Executor;

/* renamed from: m2.c */
public enum C10701c implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
