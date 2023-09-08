package p172io.flutter.util;

import java.util.concurrent.Executor;

/* renamed from: io.flutter.util.ImmediateExecutor */
public class ImmediateExecutor implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
