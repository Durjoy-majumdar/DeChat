package lo2;

import a14.C53901i0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import rx3.C90107a;
import wx3.C66206a;
import wx3.C66212f;

/* renamed from: lo2.d */
public final class C99527d {

    /* renamed from: a */
    public static final C53901i0 f291768a = new C61319b(C53901i0.C39480a.f106019d);

    /* renamed from: lo2.d$b */
    public static final class C61319b extends C66206a implements C53901i0 {
        public C61319b(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$special$$inlined$CoroutineExceptionHandler$1");
            C53901i0 i0Var = C99527d.f291768a;
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            Log.m105920e("AdCombineFollowHfScreenHelper", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            } else {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$special$$inlined$CoroutineExceptionHandler$1");
            }
        }
    }

    /* renamed from: lo2.d$a */
    public static final class C99528a {

        /* renamed from: a */
        public final boolean f291769a;

        /* renamed from: b */
        public final boolean f291770b;

        public C99528a(boolean z, boolean z2) {
            this.f291769a = z;
            this.f291770b = z2;
        }

        /* renamed from: a */
        public final boolean mo138922a() {
            SnsMethodCalculate.markStartTimeMs("getFollowState", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            boolean z = this.f291770b;
            SnsMethodCalculate.markEndTimeMs("getFollowState", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            return z;
        }

        /* renamed from: b */
        public final boolean mo138923b() {
            SnsMethodCalculate.markStartTimeMs("getHasRequested", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            boolean z = this.f291769a;
            SnsMethodCalculate.markEndTimeMs("getHasRequested", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            return z;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            String str = "RequestResult(hasRequested=" + this.f291769a + ", followState=" + this.f291770b + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$RequestResult");
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r9 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("AdCombineFollowHfScreenHelper", "checkBtnEnable() called true");
        r11.mo140656b(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r7 != false) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m129883a(android.widget.CheckBox r8, com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0.C94606b r9, android.widget.CheckBox r10, qo3.C101218e0 r11) {
        /*
            java.lang.String r0 = "access$showHfScreen$checkBtnEnable"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "showHfScreen$checkBtnEnable"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r3 = 1
            r4 = 0
            if (r8 == 0) goto L_0x0019
            boolean r8 = r8.isChecked()
            if (r8 != r3) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            java.lang.String r5 = "AdCombineFollowHfScreenHelper"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus"
            if (r8 == 0) goto L_0x002f
            r9.getClass()
            java.lang.String r8 = "getBrandStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r6)
            boolean r7 = r9.f273780b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r6)
            if (r7 == 0) goto L_0x004b
        L_0x002f:
            if (r10 == 0) goto L_0x0039
            boolean r8 = r10.isChecked()
            if (r8 != r3) goto L_0x0039
            r8 = 1
            goto L_0x003a
        L_0x0039:
            r8 = 0
        L_0x003a:
            if (r8 == 0) goto L_0x0054
            r9.getClass()
            java.lang.String r8 = "getFinderStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r6)
            boolean r9 = r9.f273779a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r6)
            if (r9 != 0) goto L_0x0054
        L_0x004b:
            java.lang.String r8 = "checkBtnEnable() called true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            r11.mo140656b(r3)
            goto L_0x005c
        L_0x0054:
            java.lang.String r8 = "checkBtnEnable() called false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            r11.mo140656b(r4)
        L_0x005c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99527d.m129883a(android.widget.CheckBox, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$b, android.widget.CheckBox, qo3.e0):void");
    }
}
