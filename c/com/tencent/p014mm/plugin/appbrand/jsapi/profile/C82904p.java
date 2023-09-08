package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p239sv.C13782a;
import p239sv.C77793t;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.p */
public abstract class C82904p extends AppBrandProxyUIProcessTask {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.p$a */
    public static final class C82905a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C82904p f242380d;

        /* renamed from: e */
        public final /* synthetic */ C13782a f242381e;

        public C82905a(C82904p pVar, C13782a aVar) {
            this.f242380d = pVar;
            this.f242381e = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, cancel");
            this.f242380d.finishProcess(new JumpToProfileResult(C82903o.Cancel, ""));
            this.f242381e.cancel();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.p$b */
    public static final class C82906b implements C77793t {

        /* renamed from: a */
        public final /* synthetic */ C82904p f242382a;

        /* renamed from: b */
        public final /* synthetic */ C89779i0 f242383b;

        public C82906b(C82904p pVar, C89779i0 i0Var) {
            this.f242382a = pVar;
            this.f242383b = i0Var;
        }

        public final void onResult(boolean z, String str, String str2) {
            JumpToProfileResult jumpToProfileResult;
            Log.m105924i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, isSucceed: " + z + ", errMsg: " + str);
            C82904p pVar = this.f242382a;
            if (z) {
                jumpToProfileResult = new JumpToProfileResult(C82903o.Success, "");
            } else {
                if (str == null) {
                    str = "";
                }
                jumpToProfileResult = new JumpToProfileResult(C82903o.FailOthers, str);
            }
            pVar.finishProcess(jumpToProfileResult);
            this.f242383b.dismiss();
        }
    }

    /* renamed from: a */
    public abstract C13782a mo94300a(Context context, AppBrandProxyUIProcessTask.ProcessRequest processRequest, C77793t tVar);

    public void handleRequest(AppBrandProxyUIProcessTask.ProcessRequest processRequest) {
        C82903o oVar = C82903o.FailInternalError;
        if (processRequest == null) {
            Log.m105928w("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, request is null");
            finishProcess(new JumpToProfileResult(oVar, ""));
            return;
        }
        C89779i0 e = C89779i0.m112248e(getActivityContext(), getActivityContext().getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
        Log.m105924i("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, jumpToProfile");
        MMActivity activityContext = getActivityContext();
        C87412m.m108593f(activityContext, "activityContext");
        C13782a a = mo94300a(activityContext, processRequest, new C82906b(this, e));
        if (a == null) {
            Log.m105920e("MicroMsg.AppBrand.OpenWeComUserProfile", "handleRequest, jumpProfileTask is null");
            finishProcess(new JumpToProfileResult(oVar, ""));
            e.dismiss();
            return;
        }
        e.setOnCancelListener(new C82905a(this, a));
    }
}
