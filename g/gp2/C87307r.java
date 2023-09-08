package gp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import e42.C7594e;
import hp2.C87579c;
import qo3.C77407n;

/* renamed from: gp2.r */
public final class C87307r<T extends C7594e> extends C87579c<T> {

    /* renamed from: gp2.r$a */
    public static final class C87308a implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ Activity f253036a;

        public C87308a(Activity activity) {
            this.f253036a = activity;
        }

        public final void onDismiss() {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiShowPhoneNumberMenu$doAction$2");
            Activity activity = this.f253036a;
            if (activity instanceof SnsAdNativeLandingPagesUI) {
                C95198o2.m121132d(activity);
            }
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiShowPhoneNumberMenu$doAction$2");
        }
    }

    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiShowPhoneNumberMenu");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiShowPhoneNumberMenu");
        return "showPhoneNumberMenu";
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo121698s(e42.C7596h r10) {
        /*
            r9 = this;
            java.lang.String r0 = "doAction"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiShowPhoneNumberMenu"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r10, r2)
            java.lang.String r2 = "phoneNumList"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            java.lang.String r2 = "there is no phone number!!"
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r10 == 0) goto L_0x00a1
            int r4 = r10.length()
            if (r4 > 0) goto L_0x002b
            e42.h r10 = r9.mo120842g(r3, r2)
            r9.mo122027r(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            r7 = 0
        L_0x0032:
            if (r7 >= r4) goto L_0x0040
            java.lang.String r8 = r10.optString(r7)
            if (r8 == 0) goto L_0x003d
            r5.add(r8)
        L_0x003d:
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0040:
            T r10 = r9.f251227a
            r4 = 0
            if (r10 == 0) goto L_0x004a
            android.app.Activity r10 = r10.mo8720e0()
            goto L_0x004b
        L_0x004a:
            r10 = r4
        L_0x004b:
            int r7 = r5.size()
            r8 = 1
            if (r7 <= r8) goto L_0x0078
            de3.g r2 = de3.C86258g.C86259a.f250859a
            if (r2 == 0) goto L_0x0068
            T r6 = r9.f251227a
            if (r6 == 0) goto L_0x005e
            android.app.Activity r4 = r6.mo8720e0()
        L_0x005e:
            gp2.r$a r6 = new gp2.r$a
            r6.<init>(r10)
            r2.mo10688Wu(r4, r5, r6)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0068:
            if (r4 != 0) goto L_0x008b
            java.lang.String r10 = "show phone menu failed!"
            e42.h r10 = r9.mo120842g(r3, r10)
            r9.mo122027r(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0078:
            int r4 = r5.size()
            if (r4 <= 0) goto L_0x0096
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
            java.lang.Object r3 = r5.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r2.confirmDialPhoneNum(r10, r3)
        L_0x008b:
            e42.h r10 = r9.mo120844i()
            r9.mo122027r(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0096:
            e42.h r10 = r9.mo120842g(r3, r2)
            r9.mo122027r(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00a1:
            e42.h r10 = r9.mo120842g(r3, r2)
            r9.mo122027r(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.C87307r.mo121698s(e42.h):void");
    }
}
