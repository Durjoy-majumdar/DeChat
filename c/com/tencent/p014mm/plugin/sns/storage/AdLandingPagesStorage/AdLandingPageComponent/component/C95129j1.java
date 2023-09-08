package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.io.Serializable;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import org.json.JSONObject;
import qo3.C89779i0;
import qs2.C101281n;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j1 */
public class C95129j1 extends C95108i0 implements Serializable {

    /* renamed from: B */
    public C101281n f276079B;

    /* renamed from: C */
    public C89779i0 f276080C;

    /* renamed from: D */
    public String f276081D;

    /* renamed from: E */
    public AdLandingPagesProxy.C94830p f276082E = new C43061a();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j1$a */
    public class C43061a implements AdLandingPagesProxy.C94830p {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j1$a$a */
        public class C43062a implements Runnable {
            public C43062a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1$1");
                C76912y0.makeText(C95129j1.this.f276579d, (int) C0966R.string.ja5, 0).show();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1$1");
            }
        }

        public C43061a() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1");
            if (obj instanceof String) {
                try {
                    JSONObject jSONObject = new JSONObject((String) obj);
                    C95129j1 j1Var = C95129j1.this;
                    jSONObject.optString("username");
                    j1Var.getClass();
                    C95129j1.this.f276081D = jSONObject.optString("aliasname");
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "parse username exp=" + e.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1");
            Log.m105924i("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onCallback, errType=" + i + ", errNo=" + i2);
            Context context = C95129j1.this.f276579d;
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C95129j1 j1Var = C95129j1.this;
                j1Var.getClass();
                SnsMethodCalculate.markStartTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
                MMHandlerThread.postToMainThread(new C43063k1(j1Var));
                SnsMethodCalculate.markEndTimeMs("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
                if (i == 0 && i2 == 0 && (obj instanceof byte[])) {
                    Intent intent = new Intent(C95129j1.this.f276579d, SnsAdProxyUI.class);
                    intent.putExtra("action_type", 3);
                    intent.putExtra("searchContactResponseByte", (byte[]) obj);
                    intent.putExtra("searchWord", Util.nullAsNil(C95129j1.this.f276081D));
                    Context context2 = C95129j1.this.f276579d;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context3 = context2;
                    C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPagePersonalProfileBtnComp$1", "onCallback", "(IILjava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context3, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPagePersonalProfileBtnComp$1", "onCallback", "(IILjava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    MMHandlerThread.postToMainThread(new C43062a());
                }
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1");
                return;
            }
            Log.m105924i("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onCallback, isFinishing return");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp$1");
        }
    }

    public C95129j1(Context context, C101281n nVar, ViewGroup viewGroup) {
        super(context, nVar, viewGroup);
        this.f276079B = nVar;
        this.f276010t.mo90729c("wxGroupInfo", nVar.f296665Z);
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
        String nullAsNil = Util.nullAsNil(mo131854m().mo140745l());
        if (!TextUtils.isEmpty(this.f276079B.f296665Z)) {
            Log.m105924i("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, btnInfo=" + this.f276079B + ", uxinfo=" + nullAsNil);
            SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            try {
                if (this.f276080C == null) {
                    Context context = this.f276579d;
                    this.f276080C = C76879j.m92723Q(context, "", context.getString(C0966R.string.gas), true, true, (DialogInterface.OnCancelListener) null);
                }
                if (!this.f276080C.isShowing()) {
                    this.f276080C.show();
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "showLoading exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
            AdLandingPagesProxy.getInstance().getBtnPersonalWxUserName(nullAsNil, this.f276079B.f296665Z, this.f276082E);
        } else {
            Log.m105920e("MicroMsg.AdLandingPagePersonalProfileBtnComp", "onBtnClick, wxGroupInfo==null");
        }
        mo131613G();
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePersonalProfileBtnComp");
    }
}
