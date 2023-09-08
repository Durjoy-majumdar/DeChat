package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C0000n0;
import com.tencent.luggage.sdk.processes.C80254f;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40323d;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C40426l;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C48988cd2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.launching.PrepareStepCheckDebugInfo$checkDebugInfo$1", mo125469f = "PrepareStepCheckDebugInfo.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.appbrand.launching.w3 */
public final class C83516w3 extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public int f243995d;

    /* renamed from: e */
    public final /* synthetic */ String f243996e;

    /* renamed from: f */
    public final /* synthetic */ int f243997f;

    /* renamed from: g */
    public final /* synthetic */ C83404p1 f243998g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83516w3(String str, int i, C83404p1 p1Var, C15601d<? super C83516w3> dVar) {
        super(2, dVar);
        this.f243996e = str;
        this.f243997f = i;
        this.f243998g = p1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C83516w3(this.f243996e, this.f243997f, this.f243998g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C83516w3) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f243995d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C40426l lVar = new C40426l(this.f243996e, this.f243997f);
            this.f243995d = 1;
            obj = lVar.mo63012d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (C40323d e) {
                C83454r3.m102416b("CgiGetWxaDebugInfo-ERROR-" + e, this.f243998g);
                return Boolean.FALSE;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C48988cd2 cd22 = (C48988cd2) obj;
        String str = cd22.f131668d;
        boolean z = false;
        if (str == null || str.length() == 0) {
            C83454r3.m102416b("CgiGetWxaDebugInfo-ext_json_empty", this.f243998g);
            return Boolean.FALSE;
        }
        try {
            jSONObject = new JSONObject(cd22.f131668d);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String str2 = this.f243996e;
            String optString = jSONObject.optString("checkSumMd5");
            String optString2 = jSONObject.optString("downloadURL");
            if (!(optString == null || optString.length() == 0)) {
                if (optString2 == null || optString2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C81161g2.requireAccountInitializedOnDemand();
                    C81161g2.f238471g.mo113526j(str2, 1, optString2, optString, 0, TimeUnit.HOURS.toSeconds(2) + Util.nowSecond());
                }
            }
        }
        if (((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56816qq(this.f243996e, 1, cd22.f131668d, true)) {
            C80254f.m97662v(AppBrandProcessesManager.f246131g.mo116962a(), this.f243996e, 1, false, 4, (Object) null);
        }
        return Boolean.TRUE;
    }
}
