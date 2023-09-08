package p172io.flutter.embedding.engine;

import a10.C112725w;
import a14.C0000n0;
import android.content.Context;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.MMFlutterEngineGroup;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "La10/w;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 6, 0})
@C91590f(mo125468c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2", mo125469f = "MMFlutterEngineGroup.kt", mo125470l = {78}, mo125471m = "invokeSuspend")
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$createAndRunEngineAsync$2 */
public final class MMFlutterEngineGroup$createAndRunEngineAsync$2 extends C91594j implements C32227p<C0000n0, C15601d<? super C112725w>, Object> {
    public final /* synthetic */ MMFlutterEngineGroup.Options $options;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ MMFlutterEngineGroup this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createAndRunEngineAsync$2(MMFlutterEngineGroup.Options options, MMFlutterEngineGroup mMFlutterEngineGroup, C15601d<? super MMFlutterEngineGroup$createAndRunEngineAsync$2> dVar) {
        super(2, dVar);
        this.$options = options;
        this.this$0 = mMFlutterEngineGroup;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new MMFlutterEngineGroup$createAndRunEngineAsync$2(this.$options, this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super C112725w> dVar) {
        return ((MMFlutterEngineGroup$createAndRunEngineAsync$2) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C112725w wVar;
        final C8479f0 f0Var;
        String str;
        long j;
        C8479f0 f0Var2;
        DartExecutor.DartEntrypoint dartEntrypoint;
        Object obj2;
        List<String> list;
        String uuid;
        String uuid2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long currentTimeMillis = System.currentTimeMillis();
            f0Var = new C8479f0();
            Context context = this.$options.getContext();
            DartExecutor.DartEntrypoint dartEntrypoint2 = this.$options.getDartEntrypoint();
            String initialRoute = this.$options.getInitialRoute();
            List<String> dartEntrypointArgs = this.$options.getDartEntrypointArgs();
            boolean automaticallyRegisterPlugins = this.$options.getAutomaticallyRegisterPlugins();
            if (dartEntrypoint2 == null) {
                dartEntrypoint2 = DartExecutor.DartEntrypoint.createDefault();
            }
            DartExecutor.DartEntrypoint dartEntrypoint3 = dartEntrypoint2;
            if (this.this$0.getActiveEngines().size() == 0) {
                MMFlutterEngineGroup mMFlutterEngineGroup = this.this$0;
                this.L$0 = f0Var;
                this.L$1 = dartEntrypoint3;
                this.L$2 = initialRoute;
                this.L$3 = dartEntrypointArgs;
                this.L$4 = f0Var;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                obj2 = mMFlutterEngineGroup.createEngine(context, automaticallyRegisterPlugins, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                j = currentTimeMillis;
                dartEntrypoint = dartEntrypoint3;
                str = initialRoute;
                list = dartEntrypointArgs;
                f0Var2 = f0Var;
            } else {
                FlutterEngine flutterEngine = this.this$0.getActiveEngines().get(0);
                C87412m.m108591d(flutterEngine);
                f0Var.f27484d = flutterEngine.spawn(context, dartEntrypoint3, initialRoute, dartEntrypointArgs, automaticallyRegisterPlugins, this.this$0.isShareIsolateMode);
                if (this.this$0.isShareIsolateMode) {
                    DartExecutor dartExecutor = ((FlutterEngine) f0Var.f27484d).getDartExecutor();
                    FlutterEngine access$getRootEngine$p = this.this$0.rootEngine;
                    C87412m.m108591d(access$getRootEngine$p);
                    dartExecutor.setSharedBinaryMessenger(access$getRootEngine$p.getDartExecutor().getSharedBinaryMessenger());
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                FlutterEngine flutterEngine2 = (FlutterEngine) f0Var.f27484d;
                C87412m.m108594g(flutterEngine2, "engine");
                do {
                    uuid2 = UUID.randomUUID().toString();
                    C87412m.m108593f(uuid2, "randomUUID().toString()");
                } while (FlutterEngineCache.getInstance().contains(uuid2));
                FlutterEngineCache.getInstance().put(uuid2, flutterEngine2);
                wVar = new C112725w(uuid2, flutterEngine2);
                wVar.f337502c = currentTimeMillis;
                wVar.f337503d = currentTimeMillis2;
                C32226l<C112725w, C13598b0> engineSetup = this.$options.getEngineSetup();
                if (engineSetup != null) {
                    engineSetup.invoke(wVar);
                }
                this.this$0.getActiveEngines().add(f0Var.f27484d);
                final MMFlutterEngineGroup mMFlutterEngineGroup2 = this.this$0;
                ((FlutterEngine) f0Var.f27484d).addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() {
                    public void onEngineWillDestroy() {
                        mMFlutterEngineGroup2.getActiveEngines().remove(f0Var.f27484d);
                        if (mMFlutterEngineGroup2.getActiveEngines().size() == 0) {
                            mMFlutterEngineGroup2.rootEngine = null;
                        }
                        MMFlutterEngineGroup mMFlutterEngineGroup = mMFlutterEngineGroup2;
                        mMFlutterEngineGroup.setDestroyEngineCount(mMFlutterEngineGroup.getDestroyEngineCount() + 1);
                    }

                    public void onPreEngineRestart() {
                    }
                });
                return wVar;
            }
        } else if (i == 1) {
            long j2 = this.J$0;
            ResultKt.throwOnFailure(obj);
            str = (String) this.L$2;
            f0Var2 = (C8479f0) this.L$0;
            obj2 = obj;
            long j3 = j2;
            f0Var = (C8479f0) this.L$4;
            list = (List) this.L$3;
            dartEntrypoint = (DartExecutor.DartEntrypoint) this.L$1;
            j = j3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f0Var.f27484d = obj2;
        long currentTimeMillis3 = System.currentTimeMillis();
        FlutterEngine flutterEngine3 = (FlutterEngine) f0Var2.f27484d;
        C87412m.m108594g(flutterEngine3, "engine");
        do {
            uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
        } while (FlutterEngineCache.getInstance().contains(uuid));
        FlutterEngineCache.getInstance().put(uuid, flutterEngine3);
        C112725w wVar2 = new C112725w(uuid, flutterEngine3);
        wVar2.f337502c = j;
        wVar2.f337503d = currentTimeMillis3;
        C32226l<C112725w, C13598b0> engineSetup2 = this.$options.getEngineSetup();
        if (engineSetup2 != null) {
            engineSetup2.invoke(wVar2);
        }
        if (str != null) {
            ((FlutterEngine) f0Var2.f27484d).getNavigationChannel().setInitialRoute(str);
        }
        ((FlutterEngine) f0Var2.f27484d).getDartExecutor().executeDartEntrypoint(dartEntrypoint, list);
        this.this$0.rootEngine = (FlutterEngine) f0Var2.f27484d;
        wVar = wVar2;
        f0Var = f0Var2;
        this.this$0.getActiveEngines().add(f0Var.f27484d);
        final MMFlutterEngineGroup mMFlutterEngineGroup22 = this.this$0;
        ((FlutterEngine) f0Var.f27484d).addEngineLifecycleListener(new FlutterEngine.EngineLifecycleListener() {
            public void onEngineWillDestroy() {
                mMFlutterEngineGroup22.getActiveEngines().remove(f0Var.f27484d);
                if (mMFlutterEngineGroup22.getActiveEngines().size() == 0) {
                    mMFlutterEngineGroup22.rootEngine = null;
                }
                MMFlutterEngineGroup mMFlutterEngineGroup = mMFlutterEngineGroup22;
                mMFlutterEngineGroup.setDestroyEngineCount(mMFlutterEngineGroup.getDestroyEngineCount() + 1);
            }

            public void onPreEngineRestart() {
            }
        });
        return wVar;
    }
}
