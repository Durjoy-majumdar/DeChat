package p172io.flutter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import p172io.flutter.embedding.engine.loader.FlutterLoader;

/* renamed from: io.flutter.FlutterInjector */
public final class FlutterInjector {
    private static boolean accessed;
    private static FlutterInjector instance;
    private DeferredComponentManager deferredComponentManager;
    private ExecutorService executorService;
    private FlutterJNI.Factory flutterJniFactory;
    private FlutterLoader flutterLoader;

    /* renamed from: io.flutter.FlutterInjector$Builder */
    public static final class Builder {
        private DeferredComponentManager deferredComponentManager;
        private ExecutorService executorService;
        private FlutterJNI.Factory flutterJniFactory;
        private FlutterLoader flutterLoader;

        /* renamed from: io.flutter.FlutterInjector$Builder$NamedThreadFactory */
        public class NamedThreadFactory implements ThreadFactory {
            private int threadId;

            private NamedThreadFactory() {
                this.threadId = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i = this.threadId;
                this.threadId = i + 1;
                sb.append(i);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void fillDefaults() {
            if (this.flutterJniFactory == null) {
                this.flutterJniFactory = new FlutterJNI.Factory();
            }
            if (this.executorService == null) {
                this.executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
            }
            if (this.flutterLoader == null) {
                this.flutterLoader = new FlutterLoader(this.flutterJniFactory.provideFlutterJNI(), this.executorService);
            }
        }

        public FlutterInjector build() {
            fillDefaults();
            return new FlutterInjector(this.flutterLoader, this.deferredComponentManager, this.flutterJniFactory, this.executorService);
        }

        public Builder setDeferredComponentManager(DeferredComponentManager deferredComponentManager2) {
            this.deferredComponentManager = deferredComponentManager2;
            return this;
        }

        public Builder setExecutorService(ExecutorService executorService2) {
            this.executorService = executorService2;
            return this;
        }

        public Builder setFlutterJNIFactory(FlutterJNI.Factory factory) {
            this.flutterJniFactory = factory;
            return this;
        }

        public Builder setFlutterLoader(FlutterLoader flutterLoader2) {
            this.flutterLoader = flutterLoader2;
            return this;
        }
    }

    public static FlutterInjector instance() {
        accessed = true;
        if (instance == null) {
            instance = new Builder().build();
        }
        return instance;
    }

    public static void reset() {
        accessed = false;
        instance = null;
    }

    public static void setInstance(FlutterInjector flutterInjector) {
        if (!accessed) {
            instance = flutterInjector;
            return;
        }
        throw new IllegalStateException("Cannot change the FlutterInjector instance once it's been read. If you're trying to dependency inject, be sure to do so at the beginning of the program");
    }

    public DeferredComponentManager deferredComponentManager() {
        return this.deferredComponentManager;
    }

    public ExecutorService executorService() {
        return this.executorService;
    }

    public FlutterLoader flutterLoader() {
        return this.flutterLoader;
    }

    public FlutterJNI.Factory getFlutterJNIFactory() {
        return this.flutterJniFactory;
    }

    private FlutterInjector(FlutterLoader flutterLoader2, DeferredComponentManager deferredComponentManager2, FlutterJNI.Factory factory, ExecutorService executorService2) {
        this.flutterLoader = flutterLoader2;
        this.deferredComponentManager = deferredComponentManager2;
        this.flutterJniFactory = factory;
        this.executorService = executorService2;
    }
}
