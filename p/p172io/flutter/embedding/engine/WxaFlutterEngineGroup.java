package p172io.flutter.embedding.engine;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.loader.FlutterLoader;

/* renamed from: io.flutter.embedding.engine.WxaFlutterEngineGroup */
public class WxaFlutterEngineGroup {
    public final List<FlutterEngine> activeEngines;

    public WxaFlutterEngineGroup(Context context) {
        this(context, (String[]) null);
    }

    public FlutterEngine createAndRunDefaultEngine(Context context) {
        return createAndRunEngine(context, (DartExecutor.DartEntrypoint) null);
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, (String) null);
    }

    public FlutterEngine createEngine(Context context) {
        return new FlutterEngine(context, new String[0]);
    }

    public WxaFlutterEngineGroup(Context context, String[] strArr) {
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        if (!flutterLoader.initialized()) {
            flutterLoader.startInitialization(context.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context, strArr);
        }
    }

    public FlutterEngine createAndRunEngine(Context context, DartExecutor.DartEntrypoint dartEntrypoint, String str) {
        final FlutterEngine flutterEngine;
        if (dartEntrypoint == null) {
            dartEntrypoint = DartExecutor.DartEntrypoint.createDefault();
        }
        if (this.activeEngines.size() == 0) {
            flutterEngine = createEngine(context);
            if (str != null) {
                flutterEngine.getNavigationChannel().setInitialRoute(str);
            }
        } else {
            flutterEngine = this.activeEngines.get(0).spawn(context, dartEntrypoint, str, (List<String>) null);
        }
        this.activeEngines.add(flutterEngine);
        flutterEngine.addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() {
            public void onEngineWillDestroy() {
                WxaFlutterEngineGroup.this.activeEngines.remove(flutterEngine);
            }

            public void onPreEngineRestart() {
            }
        });
        return flutterEngine;
    }
}
