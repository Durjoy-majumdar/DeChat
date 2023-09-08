package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.Serializable;
import nj3.C76912y0;
import qs2.C101271i0;
import qs2.C101283p;
import te3.C49788i22;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x1 */
public class C95282x1 extends C95108i0 implements Serializable {

    /* renamed from: B */
    public C101283p f276539B;

    /* renamed from: C */
    public AdLandingPagesProxy.C94830p f276540C = new C85468a();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x1$a */
    public class C85468a implements AdLandingPagesProxy.C94830p {

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x1$a$a */
        public class C85469a implements Runnable {
            public C85469a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1$1");
                C76912y0.makeText(C95282x1.this.f276579d, (int) C0966R.string.ja5, 0).show();
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1$1");
            }
        }

        public C85468a() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
            Log.m105924i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "onCallback, errType=" + i + ", errNo=" + i2);
            if (i == 0 && i2 == 0) {
                C49788i22 i222 = new C49788i22();
                try {
                    i222.parseFrom((byte[]) obj);
                    String str = i222.f135036d;
                    Log.m105924i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "full_number=" + str + ", dial_id=" + i222.f135037e);
                    AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity) C95282x1.this.f276579d, str);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AdLandingPageSmartPhoneBtnComp", Util.stackTraceToString(e));
                }
            } else {
                MMHandlerThread.postToMainThread(new C85469a());
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp$1");
        }
    }

    public C95282x1(Context context, C101283p pVar, ViewGroup viewGroup) {
        super(context, pVar, viewGroup);
        this.f276539B = pVar;
        C101271i0 m = mo131854m();
        this.f276539B.f296669b0 = Util.safeParseLong(m.mo140735b());
        this.f276539B.f296671d0 = Util.nullAsNil(m.mo140745l());
        this.f276539B.f296670c0 = Util.nullAsNil(m.mo140743j());
        this.f276539B.f296672e0 = Util.nullAsNil(m.mo140739f());
        Log.m105924i("MicroMsg.AdLandingPageSmartPhoneBtnComp", "btnInfo=" + this.f276539B);
        this.f276010t.mo90728b("smartphoneID", (long) pVar.f296667Z);
    }

    /* renamed from: P */
    public void mo130182P() {
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
        AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
        C101283p pVar = this.f276539B;
        instance.doGetSmartPhoneScene(pVar.f296669b0, pVar.f296668a0, pVar.f296670c0, pVar.f296671d0, pVar.f296667Z, pVar.f296672e0, this.f276540C);
        mo131613G();
        SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSmartPhoneBtnComp");
    }
}
