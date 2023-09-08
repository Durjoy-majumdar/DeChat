package zp2;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import io2.C98771b;
import nj3.C76912y0;
import tp2.C101914d;
import yp2.C102895a;

/* renamed from: zp2.b */
public class C103053b extends C102895a {

    /* renamed from: a */
    public C101914d f304043a;

    /* renamed from: zp2.b$a */
    public class C103054a implements C98771b.C98772a {

        /* renamed from: a */
        public final /* synthetic */ Context f304044a;

        public C103054a(Context context) {
            this.f304044a = context;
        }

        /* renamed from: a */
        public void mo130218a(String str, int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
            Log.m105924i("SnsAd.FinderLiveClick.AdFinderLiveClick", "showLivingRoom, the FinderLiveClick is called, snsId " + str + ", errorCode=" + i2 + ", actType=" + i);
            if (i2 != 0) {
                C103053b bVar = C103053b.this;
                Context context = this.f304044a;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
                try {
                    C76912y0.m92767f(context, "进入直播间失败");
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
                C115669n.INSTANCE.mo175911u(1837, 5);
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick$1");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0164  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142614c(android.view.View r28, int r29, com.tencent.p014mm.plugin.sns.storage.SnsInfo r30, com.tencent.p014mm.plugin.sns.storage.ADXml r31, tp2.C101914d r32) {
        /*
            r27 = this;
            r1 = r27
            r0 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            java.lang.String r5 = "doClick"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "AdFinderLiveRoomClick doClick, source="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "SnsAd.FinderLiveClick.AdFinderLiveClick"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            com.tencent.mm.plugin.sns.ad.adxml.a r7 = r3.adFinderLiveInfo
            r9 = 0
            if (r28 == 0) goto L_0x01fc
            if (r2 != 0) goto L_0x0030
            goto L_0x01fc
        L_0x0030:
            android.content.Context r10 = r28.getContext()
            if (r10 != 0) goto L_0x003f
            java.lang.String r0 = "context null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return r9
        L_0x003f:
            java.lang.String r11 = "isFinderRoomPreview"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
            r13 = 3
            r18 = 1
            if (r7 == 0) goto L_0x0069
            r14 = 4
            java.lang.String[] r14 = new java.lang.String[r14]
            java.lang.String r15 = r7.f273681a
            r14[r9] = r15
            java.lang.String r15 = r7.f273682b
            r14[r18] = r15
            r15 = 2
            java.lang.String r9 = r7.f273683c
            r14[r15] = r9
            java.lang.String r9 = r7.f273684d
            r14[r13] = r9
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r14)
            if (r9 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r9 = 0
            goto L_0x006a
        L_0x0069:
            r9 = 1
        L_0x006a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            if (r9 == 0) goto L_0x0164
            java.lang.String r0 = "click material, ready to jump FinderRoomPreview"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            if (r4 == 0) goto L_0x007d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.mo141404b(r11, r0)
            r1.f304043a = r4
        L_0x007d:
            com.tencent.mm.plugin.sns.ad.adxml.a$a r0 = r3.adFinderLivePreviewInfo
            if (r0 == 0) goto L_0x015d
            java.lang.String r3 = "parseFinderRoomPreviewInfoToJsonStr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r12)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x014a }
            r4.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "image"
            com.tencent.mm.plugin.sns.ad.adxml.a$a$b r8 = r0.f273688d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = r8.f273692a     // Catch:{ all -> 0x014a }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ all -> 0x014a }
            r4.put(r7, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "title"
            com.tencent.mm.plugin.sns.ad.adxml.a$a$b r8 = r0.f273688d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = r8.f273693b     // Catch:{ all -> 0x014a }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ all -> 0x014a }
            r4.put(r7, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "desc"
            com.tencent.mm.plugin.sns.ad.adxml.a$a$b r8 = r0.f273688d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = r8.f273694c     // Catch:{ all -> 0x014a }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ all -> 0x014a }
            r4.put(r7, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "actionTitle"
            com.tencent.mm.plugin.sns.ad.adxml.a$a$b r8 = r0.f273688d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = r8.f273695d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ all -> 0x014a }
            r4.put(r7, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "canvasId"
            com.tencent.mm.plugin.sns.ad.adxml.a$a$b r8 = r0.f273688d     // Catch:{ all -> 0x014a }
            java.lang.String r8 = r8.f273696e     // Catch:{ all -> 0x014a }
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)     // Catch:{ all -> 0x014a }
            r4.put(r7, r8)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = "uxInfo"
            java.lang.String r2 = r30.getUxinfo()     // Catch:{ all -> 0x014a }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ all -> 0x014a }
            r4.put(r7, r2)     // Catch:{ all -> 0x014a }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x014a }
            r2.<init>()     // Catch:{ all -> 0x014a }
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.a$a$a> r7 = r0.f273689e     // Catch:{ all -> 0x014a }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x014a }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x014a }
        L_0x00e9:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x011b
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x014a }
            com.tencent.mm.plugin.sns.ad.adxml.a$a$a r8 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.C94588a.C94589a.C94590a) r8     // Catch:{ all -> 0x014a }
            if (r8 == 0) goto L_0x00e9
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x014a }
            r9.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r11 = "iconUrl"
            java.lang.String r13 = r8.f273690a     // Catch:{ all -> 0x014a }
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)     // Catch:{ all -> 0x014a }
            r9.put(r11, r13)     // Catch:{ all -> 0x014a }
            java.lang.String r11 = "sampleRate"
            int r8 = r8.f273691b     // Catch:{ all -> 0x014a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x014a }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.Integer) r8)     // Catch:{ all -> 0x014a }
            r9.put(r11, r8)     // Catch:{ all -> 0x014a }
            r2.put(r9)     // Catch:{ all -> 0x014a }
            goto L_0x00e9
        L_0x011b:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x014a }
            r7.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r8 = "bgImage"
            java.lang.String r9 = r0.f273685a     // Catch:{ all -> 0x014a }
            r7.put(r8, r9)     // Catch:{ all -> 0x014a }
            java.lang.String r8 = "avatar"
            java.lang.String r9 = r0.f273686b     // Catch:{ all -> 0x014a }
            r7.put(r8, r9)     // Catch:{ all -> 0x014a }
            java.lang.String r8 = "nickname"
            java.lang.String r0 = r0.f273687c     // Catch:{ all -> 0x014a }
            r7.put(r8, r0)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "productInfo"
            r7.put(r0, r4)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = "liveCheerIconList"
            r7.put(r0, r2)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x014a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r12)
            goto L_0x0159
        L_0x014a:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "LiteAppPreviewHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r12)
            java.lang.String r0 = ""
        L_0x0159:
            lo2.C46881t0.m52212c(r10, r0)
            goto L_0x0160
        L_0x015d:
            lo2.C46881t0.m52214e(r10)
        L_0x0160:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return r18
        L_0x0164:
            java.lang.String r3 = vr2.C102236a0.m134728W(r30)
            java.lang.String r4 = "requestLiveStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            cq2.d r9 = cq2.C97354d.m125367c(r10)     // Catch:{ all -> 0x0175 }
            r9.mo136622a(r0, r2)     // Catch:{ all -> 0x0175 }
        L_0x0175:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            java.lang.String r0 = r30.getUxinfo()
            java.lang.String r0 = lo2.C99542h0.m129912j(r0, r3, r13)
            java.lang.String r4 = r7.f273681a
            t91.c$a r9 = t91.C64208c.f181951a
            r9.mo89032g(r0, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "doClick, setSnsAdData, snsAdInfo="
            r4.append(r9)
            r4.append(r0)
            java.lang.String r9 = ", finderUsername="
            r4.append(r9)
            java.lang.String r9 = r7.f273681a
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            java.lang.Object r4 = r28.getTag()
            int r8 = r2.localid
            boolean r9 = r4 instanceof com.tencent.p014mm.plugin.sns.p106ui.C96235u4
            if (r9 == 0) goto L_0x01b3
            com.tencent.mm.plugin.sns.ui.u4 r4 = (com.tencent.p014mm.plugin.sns.p106ui.C96235u4) r4
            int r8 = r4.f281208c
        L_0x01b3:
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r19 = r4
            ht1.t1 r19 = (ht1.C60200t1) r19
            long r11 = r2.field_snsId
            java.lang.String r2 = r7.f273682b
            long r22 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r2)
            java.lang.String r2 = r7.f273681a
            long r8 = (long) r8
            r20 = r11
            r24 = r2
            r25 = r8
            r19.hj0(r20, r22, r24, r25)
            android.util.ArrayMap r15 = new android.util.ArrayMap
            r15.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r4 = "is_from_ad"
            r15.put(r4, r2)
            java.lang.String r2 = "key_extra_info"
            r15.put(r2, r0)
            java.lang.String r11 = r7.f273681a
            java.lang.String r12 = r7.f273682b
            java.lang.String r13 = r7.f273683c
            java.lang.String r14 = r7.f273684d
            zp2.b$a r0 = new zp2.b$a
            r0.<init>(r10)
            r16 = r3
            r17 = r0
            io2.C98771b.m128555d(r10, r11, r12, r13, r14, r15, r16, r17)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return r18
        L_0x01fc:
            java.lang.String r0 = "info null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zp2.C103053b.mo142614c(android.view.View, int, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.ADXml, tp2.d):boolean");
    }

    /* renamed from: d */
    public int mo142615d() {
        SnsMethodCalculate.markStartTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        C101914d dVar = this.f304043a;
        if (dVar == null || !((Boolean) dVar.mo141403a("isFinderRoomPreview", Boolean.FALSE)).booleanValue()) {
            SnsMethodCalculate.markEndTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return 44;
        }
        SnsMethodCalculate.markEndTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        return 48;
    }
}
