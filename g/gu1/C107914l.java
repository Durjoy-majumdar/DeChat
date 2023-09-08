package gu1;

import a14.C0000n0;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.plugin.flutter.p884ui.CachedFlutterActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.Map;
import k20.C9556a;
import kotlin.ResultKt;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$startRouteActivity$1", mo125469f = "CachedFlutterEngines.kt", mo125470l = {311}, mo125471m = "invokeSuspend")
/* renamed from: gu1.l */
public final class C107914l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f323113d;

    /* renamed from: e */
    public final /* synthetic */ String f323114e;

    /* renamed from: f */
    public final /* synthetic */ boolean f323115f;

    /* renamed from: g */
    public final /* synthetic */ Context f323116g;

    /* renamed from: h */
    public final /* synthetic */ Map<String, Object> f323117h;

    /* renamed from: gu1.l$a */
    public static final class C32535a extends C87413o implements C32227p<FlutterEngine, Map<String, Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Map<String, Object> f86394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32535a(Map<String, ? extends Object> map) {
            super(2);
            this.f86394d = map;
        }

        public Object invoke(Object obj, Object obj2) {
            Map map = (Map) obj2;
            C87412m.m108594g((FlutterEngine) obj, "<anonymous parameter 0>");
            C87412m.m108594g(map, "params");
            Map<String, Object> map2 = this.f86394d;
            if (map2 != null) {
                for (Map.Entry next : map2.entrySet()) {
                    map.put((String) next.getKey(), next.getValue());
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107914l(String str, boolean z, Context context, Map<String, ? extends Object> map, C15601d<? super C107914l> dVar) {
        super(2, dVar);
        this.f323114e = str;
        this.f323115f = z;
        this.f323116g = context;
        this.f323117h = map;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107914l(this.f323114e, this.f323115f, this.f323116g, this.f323117h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107914l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f323113d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.CachedFlutterEngines", "startRouteActivity entryPoint " + this.f323114e);
            CachedFlutterEngines cachedFlutterEngines = CachedFlutterEngines.f346097a;
            String str = this.f323114e;
            boolean z = this.f323115f;
            C32535a aVar2 = new C32535a(this.f323117h);
            this.f323113d = 1;
            obj = cachedFlutterEngines.mo175365c(str, "home", "/", z, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str2 = (String) ((C13604l) obj).f38555d;
        if (Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.CachedFlutterEngines", "startRouteActivity Preload a flutter engine error");
            return C13598b0.f38549a;
        }
        int i2 = CachedFlutterActivity.f313157e;
        C87412m.m108594g(str2, "cachedEngineId");
        Intent build = new PatchedFlutterActivity.CachedEngineIntentBuilder(CachedFlutterActivity.class, str2).destroyEngineWithActivity(true).build(this.f323116g);
        C87412m.m108593f(build, "CachedFlutterActivity.wi…          .build(context)");
        Context context = this.f323116g;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(build);
        Context context2 = context;
        C117292a.m165358d(context2, aVar3.mo10232b(), "com/tencent/mm/plugin/flutter/base/CachedFlutterEngines$startRouteActivity$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar3.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/flutter/base/CachedFlutterEngines$startRouteActivity$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return C13598b0.f38549a;
    }
}
