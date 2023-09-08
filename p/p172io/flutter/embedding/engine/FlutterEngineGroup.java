package p172io.flutter.embedding.engine;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.loader.FlutterLoader;

/* renamed from: io.flutter.embedding.engine.FlutterEngineGroup */
public class FlutterEngineGroup {
    public final List<FlutterEngine> activeEngines;
    private boolean isShareIsolateMode;
    /* access modifiers changed from: private */
    public FlutterEngine rootEngine;

    /* renamed from: io.flutter.embedding.engine.FlutterEngineGroup$Options */
    public static class Options {
        private boolean automaticallyRegisterPlugins;
        private Context context;
        private DartExecutor.DartEntrypoint dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private String initialRoute;

        public Options(Context context2) {
            this.context = context2;
        }

        public boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public Context getContext() {
            return this.context;
        }

        public DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public String getInitialRoute() {
            return this.initialRoute;
        }

        public Options setAutomaticallyRegisterPlugins(boolean z) {
            this.automaticallyRegisterPlugins = z;
            return this;
        }

        public Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint2) {
            this.dartEntrypoint = dartEntrypoint2;
            return this;
        }

        public Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    public FlutterEngineGroup(Context context) {
        this(context, (String[]) null);
    }

    private FlutterShellArgs createFlutterShellArgs(String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = new String[0];
        }
        return new FlutterShellArgs(strArr);
    }

    public FlutterEngine createAndRunDefaultEngine(Context context) {
        return createAndRunEngine(context, (DartExecutor.DartEntrypoint) null);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, (String) null);
    }

    public FlutterEngine createEngine(Context context, boolean z) {
        return new FlutterEngine(context, (String[]) null, z);
    }

    public FlutterEngineGroup(Context context, String[] strArr) {
        this(context, strArr, false);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str) {
        return createAndRunEngine(context, dartEntrypoint, str, true);
    }

    public FlutterEngineGroup(Context context, String[] strArr, boolean z) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        this.isShareIsolateMode = z;
        if (!flutterLoader.initialized()) {
            FlutterShellArgs createFlutterShellArgs = createFlutterShellArgs(strArr, z);
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context.getApplicationContext(), createFlutterShellArgs.toArray());
        }
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str, boolean z) {
        return createAndRunEngine(new Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str).setAutomaticallyRegisterPlugins(z));
    }

    public FlutterEngine createAndRunEngine(Options options) {
        final FlutterEngine flutterEngine;
        Context context = options.getContext();
        DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        String initialRoute = options.getInitialRoute();
        List<String> dartEntrypointArgs = options.getDartEntrypointArgs();
        boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
        DartExecutor.DartEntrypoint createDefault = dartEntrypoint == null ? DartExecutor.DartEntrypoint.createDefault() : dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            flutterEngine = createEngine(context, automaticallyRegisterPlugins);
            if (initialRoute != null) {
                flutterEngine.getNavigationChannel().setInitialRoute(initialRoute);
            }
            flutterEngine.getDartExecutor().executeDartEntrypoint(createDefault, dartEntrypointArgs);
            this.rootEngine = flutterEngine;
        } else {
            flutterEngine = this.activeEngines.get(0).spawn(context, createDefault, initialRoute, dartEntrypointArgs, automaticallyRegisterPlugins, this.isShareIsolateMode);
            if (this.isShareIsolateMode) {
                flutterEngine.getDartExecutor().setSharedBinaryMessenger(this.rootEngine.getDartExecutor().getSharedBinaryMessenger());
            }
        }
        this.activeEngines.add(flutterEngine);
        flutterEngine.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() {
            public void onEngineWillDestroy() {
                FlutterEngineGroup.this.activeEngines.remove(flutterEngine);
                if (FlutterEngineGroup.this.activeEngines.size() == 0) {
                    FlutterEngine unused = FlutterEngineGroup.this.rootEngine = null;
                }
            }

            public void onPreEngineRestart() {
            }
        });
        return flutterEngine;
    }
}
