package lo2;

import a14.C53916l;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: lo2.p0 */
public final class C10596p0 implements AdLandingPagesProxy.C94830p {

    /* renamed from: a */
    public final /* synthetic */ C53916l<Boolean> f31951a;

    public C10596p0(C53916l<? super Boolean> lVar) {
        this.f31951a = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[Catch:{ all -> 0x0093 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10855a(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "onCallback"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            a14.l<java.lang.Boolean> r2 = r10.f31951a
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.String r3 = "access$parseAdFinderIsFollowedData"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "FollowRequestHelper"
            java.lang.String r6 = "parseAdFinderIsFollowedData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r8.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r9 = "parseAdFinderIsFollowedData, ret="
            r8.append(r9)     // Catch:{ all -> 0x0093 }
            r8.append(r11)     // Catch:{ all -> 0x0093 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ all -> 0x0093 }
            boolean r8 = r11 instanceof java.lang.String     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x0038
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0093 }
            goto L_0x0039
        L_0x0038:
            r11 = 0
        L_0x0039:
            r8 = 1
            if (r11 == 0) goto L_0x0045
            int r9 = r11.length()     // Catch:{ all -> 0x0093 }
            if (r9 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r9 = 0
            goto L_0x0046
        L_0x0045:
            r9 = 1
        L_0x0046:
            if (r9 == 0) goto L_0x0052
            java.lang.String r11 = "parseAdFinderIsFollowedData, null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)     // Catch:{ all -> 0x0093 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x0093 }
            goto L_0x00ac
        L_0x0052:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0093 }
            r9.<init>(r11)     // Catch:{ all -> 0x0093 }
            java.lang.String r11 = "followType"
            int r11 = r9.optInt(r11)     // Catch:{ all -> 0x0093 }
            if (r11 == r8) goto L_0x0063
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x0093 }
            goto L_0x00ac
        L_0x0063:
            java.lang.String r11 = "errCode"
            int r11 = r9.optInt(r11)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x0084
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r8.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r9 = "parseAdFinderIsFollowedData, err! "
            r8.append(r9)     // Catch:{ all -> 0x0093 }
            r8.append(r11)     // Catch:{ all -> 0x0093 }
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x0093 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)     // Catch:{ all -> 0x0093 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x0093 }
            goto L_0x00ac
        L_0x0084:
            java.lang.String r11 = "followFlg"
            int r11 = r9.optInt(r11)     // Catch:{ all -> 0x0093 }
            if (r11 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r8 = 0
        L_0x008e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x0093 }
            r7 = r8
            goto L_0x00ac
        L_0x0093:
            r11 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "parseAdFinderIsFollowedData, exp="
            r8.append(r9)
            r8.append(r11)
            java.lang.String r11 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
        L_0x00ac:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r11 = kotlin.Result.m168114constructorimpl(r11)
            r2.resumeWith(r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C10596p0.mo10855a(java.lang.Object):void");
    }

    /* renamed from: b */
    public void mo10856b(int i, int i2, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getFinderFollowStatus$2$1");
    }
}
