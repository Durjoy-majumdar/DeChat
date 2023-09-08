package gu1;

import a14.C0000n0;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import fy3.C32227p;
import java.util.Map;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterEngine;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$createBlock$1", mo125469f = "CachedFlutterEngines.kt", mo125470l = {254}, mo125471m = "invokeSuspend")
/* renamed from: gu1.h */
public final class C107913h extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends String, ? extends FlutterEngine>>, Object> {

    /* renamed from: d */
    public int f323108d;

    /* renamed from: e */
    public final /* synthetic */ String f323109e;

    /* renamed from: f */
    public final /* synthetic */ String f323110f;

    /* renamed from: g */
    public final /* synthetic */ boolean f323111g;

    /* renamed from: h */
    public final /* synthetic */ C32227p<FlutterEngine, Map<String, Object>, C13598b0> f323112h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107913h(String str, String str2, boolean z, C32227p<? super FlutterEngine, ? super Map<String, Object>, C13598b0> pVar, C15601d<? super C107913h> dVar) {
        super(2, dVar);
        this.f323109e = str;
        this.f323110f = str2;
        this.f323111g = z;
        this.f323112h = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107913h(this.f323109e, this.f323110f, this.f323111g, this.f323112h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107913h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f323108d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CachedFlutterEngines cachedFlutterEngines = CachedFlutterEngines.f346097a;
            String str = this.f323109e;
            String str2 = this.f323110f;
            boolean z = this.f323111g;
            C32227p<FlutterEngine, Map<String, Object>, C13598b0> pVar = this.f323112h;
            this.f323108d = 1;
            obj = cachedFlutterEngines.mo175365c(str, "home", str2, z, pVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
