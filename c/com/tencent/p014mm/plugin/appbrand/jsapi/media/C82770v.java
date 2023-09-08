package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import a14.C0000n0;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import lp3.C46888b;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import rx3.C13598b0;
import sx3.C26236u;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.media.ChooseMediaWorkFlow$goSightCaptureUI$3$3", mo125469f = "ChooseMediaWorkFlow.kt", mo125470l = {297}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.v */
public final class C82770v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f242108d;

    /* renamed from: e */
    public final /* synthetic */ Activity f242109e;

    /* renamed from: f */
    public final /* synthetic */ RecordConfigProvider f242110f;

    /* renamed from: g */
    public final /* synthetic */ C46888b f242111g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82770v(Activity activity, RecordConfigProvider recordConfigProvider, C46888b bVar, C15601d<? super C82770v> dVar) {
        super(2, dVar);
        this.f242109e = activity;
        this.f242110f = recordConfigProvider;
        this.f242111g = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C82770v(this.f242109e, this.f242110f, this.f242111g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C82770v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f242108d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Activity activity = this.f242109e;
            C87412m.m108592e(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            RecordConfigProvider recordConfigProvider = this.f242110f;
            C87412m.m108593f(recordConfigProvider, "provider");
            this.f242108d = 1;
            obj = ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM((ComponentActivity) activity, recordConfigProvider, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C77575r rVar = (C77575r) obj;
        int i2 = rVar.f226147b;
        if (i2 == 0) {
            this.f242111g.mo72093c(C82739n.C82740a.f242060a);
        } else if (i2 == -1 && rVar.f226148c == 0) {
            C77574q qVar = rVar.f226149d;
            Log.m105924i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "print model info:" + qVar);
            C46888b bVar = this.f242111g;
            C87412m.m108591d(qVar);
            String str = qVar.f226143b;
            C87412m.m108591d(str);
            bVar.mo72093c(new C82739n.C82742c(C26236u.m33719b(new C86009m1(str)), 2));
        } else {
            this.f242111g.mo72093c(new C82739n.C82741b("get null sight capture result"));
        }
        return C13598b0.f38549a;
    }
}
