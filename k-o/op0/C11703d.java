package op0;

import java.util.Objects;
import java.util.concurrent.Executor;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: op0.d */
public interface C11703d {

    /* renamed from: a */
    public static final Executor f34267a = new C11704a();

    /* renamed from: b */
    public static final Executor f34268b = new C11705b();

    /* renamed from: op0.d$a */
    public class C11704a implements Executor {
        public void execute(Runnable runnable) {
            Objects.requireNonNull(runnable);
            runnable.run();
        }

        public String toString() {
            return "ImmediateExecutor@" + hashCode();
        }
    }

    /* renamed from: op0.d$b */
    public class C11705b implements Executor {
        public void execute(Runnable runnable) {
            C119179t tVar = C119157j.f356862d;
            Objects.requireNonNull(runnable);
            ((C119157j) tVar).mo183875f(runnable);
        }

        public String toString() {
            return "ThreadPoolExecutor@" + hashCode();
        }
    }
}
