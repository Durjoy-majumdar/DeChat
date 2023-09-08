package p172io.flutter.embedding.engine;

import a10.C112725w;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import android.content.Context;
import f14.C58901s;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p172io.flutter.FlutterInjector;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.loader.FlutterLoader;
import rx3.C13598b0;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00018B-\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b6\u00107J'\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u000f\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0010J%\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0014\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00038\u0002XD¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0$8\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0002\u0004\n\u0002\b\u0019¨\u00069"}, mo182094d2 = {"Lio/flutter/embedding/engine/MMFlutterEngineGroup;", "", "", "", "dartVmArgs", "", "sharedIsolateMode", "Lio/flutter/embedding/engine/FlutterShellArgs;", "createFlutterShellArgs", "([Ljava/lang/String;Z)Lio/flutter/embedding/engine/FlutterShellArgs;", "La10/w;", "createAndRunDefaultEngine", "(Lwx3/d;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/MMFlutterEngineGroup$Options;", "options", "createAndRunEngine", "(Lio/flutter/embedding/engine/MMFlutterEngineGroup$Options;Lwx3/d;)Ljava/lang/Object;", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "dartEntrypoint", "initialRoute", "automaticallyRegisterPlugins", "Lkotlin/Function1;", "Lrx3/b0;", "engineSetup", "(Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;Ljava/lang/String;ZLfy3/l;Lwx3/d;)Ljava/lang/Object;", "createAndRunEngineAsync", "Landroid/content/Context;", "context", "Lio/flutter/embedding/engine/FlutterEngine;", "createEngine", "(Landroid/content/Context;ZLwx3/d;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "TAG", "Ljava/lang/String;", "", "activeEngines", "Ljava/util/List;", "getActiveEngines", "()Ljava/util/List;", "getActiveEngines$annotations", "()V", "", "destroyEngineCount", "I", "getDestroyEngineCount", "()I", "setDestroyEngineCount", "(I)V", "rootEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "isShareIsolateMode", "Z", "<init>", "(Landroid/content/Context;[Ljava/lang/String;Z)V", "Options", "mm_foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup */
public final class MMFlutterEngineGroup {
    /* access modifiers changed from: private */
    public final String TAG;
    private final List<FlutterEngine> activeEngines;
    private final Context context;
    private int destroyEngineCount;
    /* access modifiers changed from: private */
    public final boolean isShareIsolateMode;
    /* access modifiers changed from: private */
    public FlutterEngine rootEngine;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\n\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u001c\u0010\u0012\u001a\u00020\u00002\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR4\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000b8\u0006@BX\u000e¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R@\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, mo182094d2 = {"Lio/flutter/embedding/engine/MMFlutterEngineGroup$Options;", "", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "dartEntrypoint", "setDartEntrypoint", "", "initialRoute", "setInitialRoute", "", "dartEntrypointArgs", "setDartEntrypointArgs", "", "automaticallyRegisterPlugins", "setAutomaticallyRegisterPlugins", "Lkotlin/Function1;", "La10/w;", "Lrx3/b0;", "engineSetup", "setEngineSetup", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<set-?>", "Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "getDartEntrypoint", "()Lio/flutter/embedding/engine/dart/DartExecutor$DartEntrypoint;", "Ljava/lang/String;", "getInitialRoute", "()Ljava/lang/String;", "Ljava/util/List;", "getDartEntrypointArgs", "()Ljava/util/List;", "Z", "getAutomaticallyRegisterPlugins", "()Z", "Lfy3/l;", "getEngineSetup", "()Lfy3/l;", "<init>", "(Landroid/content/Context;)V", "mm_foundation_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
    /* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$Options */
    public static final class Options {
        private boolean automaticallyRegisterPlugins;
        private final Context context;
        private DartExecutor.DartEntrypoint dartEntrypoint;
        private List<String> dartEntrypointArgs;
        private C32226l<? super C112725w, C13598b0> engineSetup;
        private String initialRoute;

        public Options(Context context2) {
            C87412m.m108594g(context2, "context");
            this.context = context2;
        }

        public final boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public final Context getContext() {
            return this.context;
        }

        public final DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public final List<String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public final C32226l<C112725w, C13598b0> getEngineSetup() {
            return this.engineSetup;
        }

        public final String getInitialRoute() {
            return this.initialRoute;
        }

        public final Options setAutomaticallyRegisterPlugins(boolean z) {
            this.automaticallyRegisterPlugins = z;
            return this;
        }

        public final Options setDartEntrypoint(DartExecutor.DartEntrypoint dartEntrypoint2) {
            this.dartEntrypoint = dartEntrypoint2;
            return this;
        }

        public final Options setDartEntrypointArgs(List<String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public final Options setEngineSetup(C32226l<? super C112725w, C13598b0> lVar) {
            this.engineSetup = lVar;
            return this;
        }

        public final Options setInitialRoute(String str) {
            this.initialRoute = str;
            return this;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup(Context context2) {
        this(context2, (String[]) null, false, 6, (C8480h) null);
        C87412m.m108594g(context2, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup(Context context2, String[] strArr) {
        this(context2, strArr, false, 4, (C8480h) null);
        C87412m.m108594g(context2, "context");
    }

    public MMFlutterEngineGroup(Context context2, String[] strArr, boolean z) {
        C87412m.m108594g(context2, "context");
        this.context = context2;
        this.TAG = "MicroMsg.MMFlutterEngineGroup";
        this.activeEngines = new ArrayList();
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        C87412m.m108593f(flutterLoader, "instance().flutterLoader()");
        this.isShareIsolateMode = z;
        if (!flutterLoader.initialized()) {
            FlutterShellArgs createFlutterShellArgs = createFlutterShellArgs(strArr, z);
            flutterLoader.startInitialization(context2.getApplicationContext());
            flutterLoader.ensureInitializationComplete(context2.getApplicationContext(), createFlutterShellArgs.toArray());
        }
    }

    public static /* synthetic */ Object createAndRunEngine$default(MMFlutterEngineGroup mMFlutterEngineGroup, DartExecutor.DartEntrypoint dartEntrypoint, String str, boolean z, C32226l lVar, C15601d dVar, int i, Object obj) {
        return mMFlutterEngineGroup.createAndRunEngine(dartEntrypoint, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : lVar, dVar);
    }

    private final FlutterShellArgs createFlutterShellArgs(String[] strArr, boolean z) {
        if (strArr == null) {
            strArr = new String[0];
        }
        return new FlutterShellArgs(strArr);
    }

    public static /* synthetic */ void getActiveEngines$annotations() {
    }

    public final Object createAndRunDefaultEngine(C15601d<? super C112725w> dVar) {
        return createAndRunEngine$default(this, (DartExecutor.DartEntrypoint) null, (String) null, false, (C32226l) null, dVar, 14, (Object) null);
    }

    public final Object createAndRunEngine(Options options, C15601d<? super C112725w> dVar) {
        return createAndRunEngineAsync(options, dVar);
    }

    public final Object createAndRunEngineAsync(Options options, C15601d<? super C112725w> dVar) {
        C53896h0 h0Var = C53872d1.f151117a;
        return C53895h.m60469g(C58901s.f168555a, new MMFlutterEngineGroup$createAndRunEngineAsync$2(options, this, (C15601d<? super MMFlutterEngineGroup$createAndRunEngineAsync$2>) null), dVar);
    }

    public final Object createEngine(Context context2, boolean z, C15601d<? super FlutterEngine> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new MMFlutterEngineGroup$createEngine$2(context2, z, this, (C15601d<? super MMFlutterEngineGroup$createEngine$2>) null), dVar);
    }

    public final List<FlutterEngine> getActiveEngines() {
        return this.activeEngines;
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getDestroyEngineCount() {
        return this.destroyEngineCount;
    }

    public final void setDestroyEngineCount(int i) {
        this.destroyEngineCount = i;
    }

    public final Object createAndRunEngine(DartExecutor.DartEntrypoint dartEntrypoint, String str, boolean z, C32226l<? super C112725w, C13598b0> lVar, C15601d<? super C112725w> dVar) {
        return createAndRunEngineAsync(new Options(getContext()).setDartEntrypoint(dartEntrypoint).setInitialRoute(str).setAutomaticallyRegisterPlugins(z).setEngineSetup(lVar), dVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMFlutterEngineGroup(Context context2, String[] strArr, boolean z, int i, C8480h hVar) {
        this(context2, (i & 2) != 0 ? null : strArr, (i & 4) != 0 ? false : z);
    }
}
