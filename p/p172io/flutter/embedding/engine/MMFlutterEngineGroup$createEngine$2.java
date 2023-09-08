package p172io.flutter.embedding.engine;

import a14.C0000n0;
import android.content.Context;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import kotlin.ResultKt;
import p172io.flutter.Log;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo182094d2 = {"La14/n0;", "Lio/flutter/embedding/engine/FlutterEngine;", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 6, 0})
@C91590f(mo125468c = "io.flutter.embedding.engine.MMFlutterEngineGroup$createEngine$2", mo125469f = "MMFlutterEngineGroup.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: io.flutter.embedding.engine.MMFlutterEngineGroup$createEngine$2 */
public final class MMFlutterEngineGroup$createEngine$2 extends C91594j implements C32227p<C0000n0, C15601d<? super FlutterEngine>, Object> {
    public final /* synthetic */ boolean $automaticallyRegisterPlugins;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ MMFlutterEngineGroup this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFlutterEngineGroup$createEngine$2(Context context, boolean z, MMFlutterEngineGroup mMFlutterEngineGroup, C15601d<? super MMFlutterEngineGroup$createEngine$2> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$automaticallyRegisterPlugins = z;
        this.this$0 = mMFlutterEngineGroup;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new MMFlutterEngineGroup$createEngine$2(this.$context, this.$automaticallyRegisterPlugins, this.this$0, dVar);
    }

    public final Object invoke(C0000n0 n0Var, C15601d<? super FlutterEngine> dVar) {
        return ((MMFlutterEngineGroup$createEngine$2) create(n0Var, dVar)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            long currentTimeMillis = System.currentTimeMillis();
            Context context = this.$context;
            C87412m.m108591d(context);
            FlutterEngine flutterEngine = new FlutterEngine(context, (String[]) null, this.$automaticallyRegisterPlugins);
            Log.m165288i(this.this$0.TAG, C87412m.m108600m("create engine cost:", new Long(System.currentTimeMillis() - currentTimeMillis)));
            return flutterEngine;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
