package qo2;

import co2.C92442i;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95136l;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import qs2.C101271i0;
import us2.C102077f;

/* renamed from: qo2.a */
public final class C101214a {

    /* renamed from: a */
    public static final C101214a f296353a = new C101214a();

    /* renamed from: qo2.a$a */
    public static final class C101215a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ C102077f f296354a;

        /* renamed from: b */
        public final /* synthetic */ String f296355b;

        /* renamed from: c */
        public final /* synthetic */ C101271i0 f296356c;

        /* renamed from: d */
        public final /* synthetic */ C92442i f296357d;

        public C101215a(C102077f fVar, String str, C101271i0 i0Var, C92442i iVar) {
            this.f296354a = fVar;
            this.f296355b = str;
            this.f296356c = i0Var;
            this.f296357d = iVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ all -> 0x008e }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[Catch:{ all -> 0x008e }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10855a(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.String r0 = "OpFinderJsapiHandler"
                java.lang.String r1 = "follow failed"
                java.lang.String r2 = "onCallback"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r4 = -1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
                r5.<init>()     // Catch:{ all -> 0x008e }
                java.lang.String r6 = "opFinderFollow, ret="
                r5.append(r6)     // Catch:{ all -> 0x008e }
                r5.append(r14)     // Catch:{ all -> 0x008e }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x008e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x008e }
                boolean r5 = r14 instanceof java.lang.String     // Catch:{ all -> 0x008e }
                if (r5 == 0) goto L_0x0029
                java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x008e }
                goto L_0x002a
            L_0x0029:
                r14 = 0
            L_0x002a:
                r5 = 0
                if (r14 == 0) goto L_0x0036
                int r6 = r14.length()     // Catch:{ all -> 0x008e }
                if (r6 != 0) goto L_0x0034
                goto L_0x0036
            L_0x0034:
                r6 = 0
                goto L_0x0037
            L_0x0036:
                r6 = 1
            L_0x0037:
                if (r6 == 0) goto L_0x0046
                qo2.a r14 = qo2.C101214a.f296353a     // Catch:{ all -> 0x008e }
                us2.f r5 = r13.f296354a     // Catch:{ all -> 0x008e }
                java.lang.String r6 = r13.f296355b     // Catch:{ all -> 0x008e }
                qo2.C101214a.m132753a(r14, r5, r6, r4, r1)     // Catch:{ all -> 0x008e }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x008e }
                return
            L_0x0046:
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x008e }
                r6.<init>(r14)     // Catch:{ all -> 0x008e }
                qs2.i0 r14 = r13.f296356c     // Catch:{ all -> 0x008e }
                java.lang.String r7 = r14.mo140740g()     // Catch:{ all -> 0x008e }
                qs2.i0 r14 = r13.f296356c     // Catch:{ all -> 0x008e }
                java.lang.String r8 = r14.mo140745l()     // Catch:{ all -> 0x008e }
                qs2.i0 r14 = r13.f296356c     // Catch:{ all -> 0x008e }
                java.lang.String r9 = r14.mo140734a()     // Catch:{ all -> 0x008e }
                java.lang.String r14 = "followRet"
                boolean r14 = r6.optBoolean(r14)     // Catch:{ all -> 0x008e }
                if (r14 == 0) goto L_0x007b
                co2.i r14 = r13.f296357d     // Catch:{ all -> 0x008e }
                java.lang.String r10 = r14.f264532a     // Catch:{ all -> 0x008e }
                r11 = 0
                r12 = 3
                jq2.C60887c.m71301b(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x008e }
                qo2.a r14 = qo2.C101214a.f296353a     // Catch:{ all -> 0x008e }
                us2.f r6 = r13.f296354a     // Catch:{ all -> 0x008e }
                java.lang.String r7 = r13.f296355b     // Catch:{ all -> 0x008e }
                java.lang.String r8 = "ok"
                qo2.C101214a.m132753a(r14, r6, r7, r5, r8)     // Catch:{ all -> 0x008e }
                goto L_0x00ad
            L_0x007b:
                co2.i r14 = r13.f296357d     // Catch:{ all -> 0x008e }
                java.lang.String r10 = r14.f264532a     // Catch:{ all -> 0x008e }
                r11 = 1
                r12 = 3
                jq2.C60887c.m71301b(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x008e }
                qo2.a r14 = qo2.C101214a.f296353a     // Catch:{ all -> 0x008e }
                us2.f r5 = r13.f296354a     // Catch:{ all -> 0x008e }
                java.lang.String r6 = r13.f296355b     // Catch:{ all -> 0x008e }
                qo2.C101214a.m132753a(r14, r5, r6, r4, r1)     // Catch:{ all -> 0x008e }
                goto L_0x00ad
            L_0x008e:
                r14 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "opFinderFollow, exp="
                r5.append(r6)
                r5.append(r14)
                java.lang.String r14 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r14)
                qo2.a r14 = qo2.C101214a.f296353a
                us2.f r0 = r13.f296354a
                java.lang.String r5 = r13.f296355b
                qo2.C101214a.m132753a(r14, r0, r5, r4, r1)
            L_0x00ad:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo2.C101214a.C101215a.mo10855a(java.lang.Object):void");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opFinderFollow$1");
        }
    }

    /* renamed from: qo2.a$b */
    public static final class C101216b implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ C102077f f296358a;

        /* renamed from: b */
        public final /* synthetic */ String f296359b;

        public C101216b(C102077f fVar, String str) {
            this.f296358a = fVar;
            this.f296359b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[Catch:{ all -> 0x00c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0048 A[Catch:{ all -> 0x00c9 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10855a(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.String r0 = "query failed"
                java.lang.String r1 = "OpFinderJsapiHandler"
                java.lang.String r2 = "onCallback"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r4 = -1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
                r5.<init>()     // Catch:{ all -> 0x00c9 }
                java.lang.String r6 = "opQueryFinderFollowState, ret="
                r5.append(r6)     // Catch:{ all -> 0x00c9 }
                r5.append(r11)     // Catch:{ all -> 0x00c9 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ all -> 0x00c9 }
                boolean r5 = r11 instanceof java.lang.String     // Catch:{ all -> 0x00c9 }
                if (r5 == 0) goto L_0x002a
                java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00c9 }
                goto L_0x002b
            L_0x002a:
                r11 = 0
            L_0x002b:
                r5 = 1
                r6 = 0
                if (r11 == 0) goto L_0x0038
                int r7 = r11.length()     // Catch:{ all -> 0x00c9 }
                if (r7 != 0) goto L_0x0036
                goto L_0x0038
            L_0x0036:
                r7 = 0
                goto L_0x0039
            L_0x0038:
                r7 = 1
            L_0x0039:
                if (r7 == 0) goto L_0x0048
                qo2.a r11 = qo2.C101214a.f296353a     // Catch:{ all -> 0x00c9 }
                us2.f r5 = r10.f296358a     // Catch:{ all -> 0x00c9 }
                java.lang.String r6 = r10.f296359b     // Catch:{ all -> 0x00c9 }
                qo2.C101214a.m132753a(r11, r5, r6, r4, r0)     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x00c9 }
                return
            L_0x0048:
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x00c9 }
                r7.<init>(r11)     // Catch:{ all -> 0x00c9 }
                java.lang.String r11 = "errCode"
                int r11 = r7.optInt(r11)     // Catch:{ all -> 0x00c9 }
                if (r11 == 0) goto L_0x0065
                qo2.a r11 = qo2.C101214a.f296353a     // Catch:{ all -> 0x00c9 }
                us2.f r5 = r10.f296358a     // Catch:{ all -> 0x00c9 }
                java.lang.String r6 = r10.f296359b     // Catch:{ all -> 0x00c9 }
                java.lang.String r7 = "server failed"
                qo2.C101214a.m132753a(r11, r5, r6, r4, r7)     // Catch:{ all -> 0x00c9 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ all -> 0x00c9 }
                return
            L_0x0065:
                org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x00c9 }
                r11.<init>()     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "followFlg"
                int r8 = r7.optInt(r8)     // Catch:{ all -> 0x00c9 }
                r9 = 2
                if (r8 != r9) goto L_0x0074
                r8 = 0
            L_0x0074:
                java.lang.String r9 = "followState"
                r11.put(r9, r8)     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "friendFollowCount"
                java.lang.String r9 = "followNum"
                int r9 = r7.optInt(r9)     // Catch:{ all -> 0x00c9 }
                r11.put(r8, r9)     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "feedCount"
                java.lang.String r9 = "feedNum"
                int r7 = r7.optInt(r9)     // Catch:{ all -> 0x00c9 }
                r11.put(r8, r7)     // Catch:{ all -> 0x00c9 }
                java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x00c9 }
                r7.<init>()     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "ret"
                java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00c9 }
                r7.put(r8, r9)     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "err_msg"
                java.lang.String r9 = "ok"
                r7.put(r8, r9)     // Catch:{ all -> 0x00c9 }
                java.lang.String r8 = "result"
                r7.put(r8, r11)     // Catch:{ all -> 0x00c9 }
                java.lang.String r11 = r10.f296359b     // Catch:{ all -> 0x00c9 }
                if (r11 == 0) goto L_0x00b8
                int r11 = r11.length()     // Catch:{ all -> 0x00c9 }
                if (r11 != 0) goto L_0x00b7
                goto L_0x00b8
            L_0x00b7:
                r5 = 0
            L_0x00b8:
                if (r5 != 0) goto L_0x00e8
                us2.f r11 = r10.f296358a     // Catch:{ all -> 0x00c9 }
                if (r11 == 0) goto L_0x00e8
                java.lang.String r5 = r10.f296359b     // Catch:{ all -> 0x00c9 }
                java.lang.String r6 = "retCode"
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l r11 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95136l) r11     // Catch:{ all -> 0x00c9 }
                r11.mo131653O(r5, r6, r7)     // Catch:{ all -> 0x00c9 }
                goto L_0x00e8
            L_0x00c9:
                r11 = move-exception
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "opQueryFinderFollowState, exp="
                r5.append(r6)
                r5.append(r11)
                java.lang.String r11 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
                qo2.a r11 = qo2.C101214a.f296353a
                us2.f r1 = r10.f296358a
                java.lang.String r5 = r10.f296359b
                qo2.C101214a.m132753a(r11, r1, r5, r4, r0)
            L_0x00e8:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qo2.C101214a.C101216b.mo10855a(java.lang.Object):void");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler$opQueryFinderFollowState$1");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m132753a(C101214a aVar, C102077f fVar, String str, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("access$callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
        aVar.mo140654b(fVar, str, i, str2);
        SnsMethodCalculate.markEndTimeMs("access$callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060 A[Catch:{ all -> 0x0070 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m132754c(java.lang.String r7, org.json.JSONObject r8, us2.C102077f r9, qs2.C101271i0 r10) {
        /*
            java.lang.String r0 = "OpFinderJsapiHandler"
            java.lang.String r1 = "opFinderFollow"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "paramsJson"
            gy3.C87412m.m108594g(r8, r3)
            java.lang.String r3 = "callbacker"
            gy3.C87412m.m108594g(r9, r3)
            java.lang.String r3 = "landingPageData"
            gy3.C87412m.m108594g(r10, r3)
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r4.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "opFinderFollow, paramsJson="
            r4.append(r5)     // Catch:{ all -> 0x0070 }
            r4.append(r8)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x0070 }
            co2.i r4 = new co2.i     // Catch:{ all -> 0x0070 }
            r4.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "finderUsername"
            java.lang.String r8 = r8.optString(r5)     // Catch:{ all -> 0x0070 }
            r4.f264532a = r8     // Catch:{ all -> 0x0070 }
            r5 = 1
            if (r8 == 0) goto L_0x004a
            int r8 = r8.length()     // Catch:{ all -> 0x0070 }
            if (r8 != 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            r8 = 0
            goto L_0x004b
        L_0x004a:
            r8 = 1
        L_0x004b:
            if (r8 == 0) goto L_0x0060
            qo2.a r8 = f296353a     // Catch:{ all -> 0x0070 }
            r10 = -2
            java.lang.String r4 = "param err"
            r8.mo140654b(r9, r7, r10, r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = "opFinderFollow， finderUsername empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0070 }
            return r3
        L_0x0060:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r8 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch:{ all -> 0x0070 }
            qo2.a$a r6 = new qo2.a$a     // Catch:{ all -> 0x0070 }
            r6.<init>(r9, r7, r10, r4)     // Catch:{ all -> 0x0070 }
            r8.addAdFinderContract(r4, r5, r6)     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0070 }
            return r5
        L_0x0070:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "opFinderFollow, exp="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.C101214a.m132754c(java.lang.String, org.json.JSONObject, us2.f, qs2.i0):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048 A[Catch:{ all -> 0x008f }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m132755d(android.content.Context r11, java.lang.String r12, org.json.JSONObject r13, us2.C102077f r14, qs2.C101271i0 r15) {
        /*
            java.lang.String r0 = "OpFinderJsapiHandler"
            java.lang.String r1 = "opOpenFinderProfile"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "context"
            gy3.C87412m.m108594g(r11, r3)
            java.lang.String r3 = "paramsJson"
            gy3.C87412m.m108594g(r13, r3)
            java.lang.String r3 = "callbacker"
            gy3.C87412m.m108594g(r14, r3)
            java.lang.String r3 = "landingPageData"
            gy3.C87412m.m108594g(r15, r3)
            r3 = 0
            java.lang.String r4 = "finderUsername"
            java.lang.String r7 = r13.optString(r4)     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0032
            int r4 = r7.length()     // Catch:{ all -> 0x008f }
            if (r4 != 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            if (r4 == 0) goto L_0x0048
            qo2.a r11 = f296353a     // Catch:{ all -> 0x008f }
            r13 = -2
            java.lang.String r15 = "param err"
            r11.mo140654b(r14, r12, r13, r15)     // Catch:{ all -> 0x008f }
            java.lang.String r11 = "opOpenFinderProfile， finderUsername empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)     // Catch:{ all -> 0x008f }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x008f }
            return r3
        L_0x0048:
            java.lang.String r8 = r15.mo140745l()     // Catch:{ all -> 0x008f }
            java.lang.String r9 = r15.mo140740g()     // Catch:{ all -> 0x008f }
            r10 = 7
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r5 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch:{ all -> 0x008f }
            r6 = r11
            boolean r11 = r5.doJumpToFinderProfileUI(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r15.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r4 = "opOpenFinderProfile， paramsJson="
            r15.append(r4)     // Catch:{ all -> 0x008f }
            r15.append(r13)     // Catch:{ all -> 0x008f }
            java.lang.String r13 = ", ret="
            r15.append(r13)     // Catch:{ all -> 0x008f }
            r15.append(r11)     // Catch:{ all -> 0x008f }
            java.lang.String r13 = r15.toString()     // Catch:{ all -> 0x008f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0082
            qo2.a r13 = f296353a     // Catch:{ all -> 0x008f }
            java.lang.String r15 = "ok"
            r13.mo140654b(r14, r12, r3, r15)     // Catch:{ all -> 0x008f }
            goto L_0x008b
        L_0x0082:
            qo2.a r13 = f296353a     // Catch:{ all -> 0x008f }
            r15 = -1
            java.lang.String r4 = "jump failed"
            r13.mo140654b(r14, r12, r15, r4)     // Catch:{ all -> 0x008f }
        L_0x008b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x008f }
            return r11
        L_0x008f:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "opOpenFinderProfile, exp="
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.C101214a.m132755d(android.content.Context, java.lang.String, org.json.JSONObject, us2.f, qs2.i0):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059 A[Catch:{ all -> 0x0069 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m132756e(java.lang.String r6, org.json.JSONObject r7, us2.C102077f r8, qs2.C101271i0 r9) {
        /*
            java.lang.String r0 = "OpFinderJsapiHandler"
            java.lang.String r1 = "opQueryFinderFollowState"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "paramsJson"
            gy3.C87412m.m108594g(r7, r3)
            java.lang.String r3 = "callbacker"
            gy3.C87412m.m108594g(r8, r3)
            java.lang.String r3 = "landingPageData"
            gy3.C87412m.m108594g(r9, r3)
            r9 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r3.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = "opQueryFinderFollowState, paramsJson="
            r3.append(r4)     // Catch:{ all -> 0x0069 }
            r3.append(r7)     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "finderUsername"
            java.lang.String r7 = r7.optString(r3)     // Catch:{ all -> 0x0069 }
            r3 = 1
            if (r7 == 0) goto L_0x0043
            int r4 = r7.length()     // Catch:{ all -> 0x0069 }
            if (r4 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            if (r4 == 0) goto L_0x0059
            qo2.a r7 = f296353a     // Catch:{ all -> 0x0069 }
            r3 = -2
            java.lang.String r4 = "param err"
            r7.mo140654b(r8, r6, r3, r4)     // Catch:{ all -> 0x0069 }
            java.lang.String r6 = "opQueryFinderFollowState， finderUsername empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0069 }
            return r9
        L_0x0059:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r4 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch:{ all -> 0x0069 }
            qo2.a$b r5 = new qo2.a$b     // Catch:{ all -> 0x0069 }
            r5.<init>(r8, r6)     // Catch:{ all -> 0x0069 }
            r4.getAdFinderContact(r7, r5)     // Catch:{ all -> 0x0069 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)     // Catch:{ all -> 0x0069 }
            return r3
        L_0x0069:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "opQueryFinderFollowState out, exp="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.C101214a.m132756e(java.lang.String, org.json.JSONObject, us2.f, qs2.i0):boolean");
    }

    /* renamed from: b */
    public final void mo140654b(C102077f fVar, String str, int i, String str2) {
        SnsMethodCalculate.markStartTimeMs("callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
        Log.m105924i("OpFinderJsapiHandler", "callbackJs, retcode=" + i + ", errMsg=" + str2 + ", callbackId=" + str);
        HashMap hashMap = new HashMap();
        hashMap.put("ret", Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("err_msg", str2);
        if (!(str == null || str.length() == 0)) {
            ((C95136l) fVar).mo131653O(str, "retCode", hashMap);
        }
        SnsMethodCalculate.markEndTimeMs("callbackJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h5comp.OpFinderJsapiHandler");
    }
}
