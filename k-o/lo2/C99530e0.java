package lo2;

import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import rq2.C101425k;
import rq2.C63505q;
import vr2.C102236a0;

/* renamed from: lo2.e0 */
public class C99530e0 {

    /* renamed from: lo2.e0$a */
    public static class C99531a extends C63505q.C63507b {

        /* renamed from: a */
        public final List<C99533c> f291772a;

        public C99531a(List<C99533c> list) {
            this.f291772a = list;
        }

        /* renamed from: a */
        public void mo75423a(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            try {
                jSONObject.putOpt("snsId", "");
                jSONObject.putOpt("uxinfo", "");
                jSONObject.putOpt("adExtInfo", "");
                jSONObject.putOpt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("fillBaseJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
        }

        /* renamed from: b */
        public void mo75424b(JSONObject jSONObject) {
            SnsMethodCalculate.markStartTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            try {
                if (C101425k.m133097a(this.f291772a)) {
                    SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                jSONObject.putOpt("totalCount", Integer.valueOf(this.f291772a.size()));
                jSONObject.putOpt("reportItemList", jSONArray);
                int i = 0;
                for (C99533c c : this.f291772a) {
                    mo138926c(jSONArray, c);
                    i++;
                    if (i >= 10) {
                        break;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("fillExtJsonObject", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            } catch (Throwable unused) {
            }
        }

        /* renamed from: c */
        public final void mo138926c(JSONArray jSONArray, C99533c cVar) {
            SnsMethodCalculate.markStartTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            if (cVar == null) {
                SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("snsId", C102236a0.m134765q0(cVar.f291777b));
                jSONObject.putOpt("reserveSnsId", C102236a0.m134765q0(cVar.f291776a));
                jSONArray.put(jSONObject);
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("fillReportItem", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
        }

        public String getChannel() {
            SnsMethodCalculate.markStartTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            SnsMethodCalculate.markEndTimeMs("getChannel", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper$AdChannel");
            return "sns_ad_remove_consecutive_ad_report";
        }
    }

    /* renamed from: lo2.e0$b */
    public static class C99532b {

        /* renamed from: a */
        public int f291773a;

        /* renamed from: b */
        public long f291774b;

        /* renamed from: c */
        public int f291775c = 0;

        public C99532b(int i, long j) {
            this.f291773a = i;
            this.f291774b = j;
        }
    }

    /* renamed from: lo2.e0$c */
    public static class C99533c {

        /* renamed from: a */
        public final long f291776a;

        /* renamed from: b */
        public final long f291777b;

        public C99533c(long j, long j2) {
            this.f291776a = j;
            this.f291777b = j2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m129887a(android.database.Cursor r21, zh3.C91753f r22, java.lang.String r23) {
        /*
            r1 = r21
            r2 = r22
            java.lang.String r3 = "deleteConsecutiveAd"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r5 = 0
            java.lang.String r6 = "ConsecutiveAdHelper"
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = "deleteConsecutiveAd, cursor==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r5
        L_0x0019:
            java.lang.String r0 = "isDelConsecutiveAdByTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            r7 = 0
            java.lang.Class<h81.h> r9 = h81.C32735h.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ all -> 0x004c }
            h81.h r9 = (h81.C32735h) r9     // Catch:{ all -> 0x004c }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_ad_consecutive_del_by_time     // Catch:{ all -> 0x004c }
            int r9 = r9.mo58779Qe(r10, r7)     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r10.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r11 = "isDelConsecutiveAdByTime, exptValue="
            r10.append(r11)     // Catch:{ all -> 0x004c }
            r10.append(r9)     // Catch:{ all -> 0x004c }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x004c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)     // Catch:{ all -> 0x004c }
            if (r9 <= 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            goto L_0x0050
        L_0x004c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            r9 = 1
        L_0x0050:
            java.lang.String r0 = "the snsid index or source type index is invalid!"
            java.lang.String r12 = "sourceType"
            java.lang.String r13 = "snsId"
            java.lang.String r14 = "isAd"
            if (r9 == 0) goto L_0x00dd
            java.lang.String r9 = "filterConsecutiveAdByTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            int r13 = r1.getColumnIndex(r13)     // Catch:{ all -> 0x00bf }
            int r12 = r1.getColumnIndex(r12)     // Catch:{ all -> 0x00bf }
            if (r13 < 0) goto L_0x00b7
            if (r12 >= 0) goto L_0x0070
            goto L_0x00b7
        L_0x0070:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            r15 = 0
        L_0x0076:
            boolean r16 = r21.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r16 == 0) goto L_0x00a2
            long r7 = r1.getLong(r13)     // Catch:{ all -> 0x00bf }
            int r18 = r1.getInt(r12)     // Catch:{ all -> 0x00bf }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)     // Catch:{ all -> 0x00bf }
            r18 = r18 & 32
            if (r18 <= 0) goto L_0x008e
            r18 = 1
            goto L_0x0090
        L_0x008e:
            r18 = 0
        L_0x0090:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)     // Catch:{ all -> 0x00bf }
            if (r18 == 0) goto L_0x009d
            lo2.e0$b r5 = new lo2.e0$b     // Catch:{ all -> 0x00bf }
            r5.<init>(r15, r7)     // Catch:{ all -> 0x00bf }
            r0.add(r5)     // Catch:{ all -> 0x00bf }
        L_0x009d:
            int r15 = r15 + 1
            r5 = 0
            r7 = 0
            goto L_0x0076
        L_0x00a2:
            int r5 = r0.size()     // Catch:{ all -> 0x00bf }
            r7 = 2
            if (r5 >= r7) goto L_0x00ae
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0159
        L_0x00ae:
            java.util.List r0 = m129888b(r0)     // Catch:{ all -> 0x00bf }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x015a
        L_0x00b7:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)     // Catch:{ all -> 0x00bf }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0159
        L_0x00bf:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "filterConsecutiveAdByTime, exp="
            r5.append(r7)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0159
        L_0x00dd:
            java.lang.String r5 = "filterConsecutiveAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            int r7 = r1.getColumnIndex(r13)
            int r8 = r1.getColumnIndex(r12)
            if (r7 < 0) goto L_0x0153
            if (r8 >= 0) goto L_0x00ef
            goto L_0x0153
        L_0x00ef:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x00f4:
            r12 = 0
        L_0x00f6:
            boolean r9 = r21.moveToNext()
            if (r9 == 0) goto L_0x014f
            long r10 = r1.getLong(r7)
            int r9 = r1.getInt(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            r9 = r9 & 32
            if (r9 <= 0) goto L_0x010d
            r9 = 1
            goto L_0x010e
        L_0x010d:
            r9 = 0
        L_0x010e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            if (r9 != 0) goto L_0x0114
            goto L_0x00f4
        L_0x0114:
            r19 = 0
            int r9 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r9 != 0) goto L_0x0131
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "there is first ad sns id is "
            r9.append(r12)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            r12 = r10
            goto L_0x00f6
        L_0x0131:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r15 = "there is consecutive ad sns id is "
            r9.append(r15)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            lo2.e0$c r9 = new lo2.e0$c
            r9.<init>(r12, r10)
            r0.add(r9)
            goto L_0x00f6
        L_0x014f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            goto L_0x015a
        L_0x0153:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
        L_0x0159:
            r0 = 0
        L_0x015a:
            boolean r5 = rq2.C101425k.m133097a(r0)
            if (r5 == 0) goto L_0x0167
            r21.moveToFirst()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r1
        L_0x0167:
            r21.close()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            boolean r1 = rq2.C101425k.m133097a(r0)
            if (r1 == 0) goto L_0x0177
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x01b7
        L_0x0177:
            java.util.Iterator r1 = r0.iterator()
        L_0x017b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x01b4
            java.lang.Object r5 = r1.next()
            lo2.e0$c r5 = (lo2.C99530e0.C99533c) r5
            long r7 = r5.f291777b
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x017b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "delete sns id "
            r5.append(r11)
            java.lang.String r11 = vr2.C102236a0.m134765q0(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            rq2.C101418d.m133072b(r7)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 1907(0x773, float:2.672E-42)
            r8 = 8
            r5.mo175911u(r7, r8)
            goto L_0x017b
        L_0x01b4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x01b7:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 1612(0x64c, double:7.964E-321)
            r14 = 30
            int r1 = r0.size()
            long r7 = (long) r1
            r16 = r7
            r11.mo175913w(r12, r14, r16)
            lo2.e0$a r1 = new lo2.e0$a
            r1.<init>(r0)
            rq2.C63505q.m74843b(r1)
            java.lang.String r0 = "deleteConsecutiveAd, query again!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.String r0 = "queryAgain"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            if (r2 == 0) goto L_0x01e7
            r1 = r23
            r5 = 0
            android.database.Cursor r5 = r2.rawQuery(r1, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            goto L_0x01eb
        L_0x01e7:
            r5 = 0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
        L_0x01eb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C99530e0.m129887a(android.database.Cursor, zh3.f, java.lang.String):android.database.Cursor");
    }

    /* renamed from: b */
    public static List<C99533c> m129888b(List<C99532b> list) {
        SnsMethodCalculate.markStartTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        C99532b bVar = null;
        for (int i = 0; i < list.size(); i++) {
            C99532b bVar2 = list.get(i);
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(bVar2.f291774b);
            String q0 = C102236a0.m134765q0(bVar2.f291774b);
            if (jo != null) {
                bVar2.f291775c = jo.field_createAdTime;
            } else {
                Log.m105920e("ConsecutiveAdHelper", "getDelAdByTime, no ad, snsId=" + q0);
            }
            Log.m105924i("ConsecutiveAdHelper", "getDelAdByTime, snsId=" + q0 + ", idx=" + bVar2.f291773a + ", time=" + bVar2.f291775c);
            if (bVar != null && bVar2.f291773a - bVar.f291773a == 1) {
                if (bVar2.f291775c > bVar.f291775c) {
                    arrayList.add(new C99533c(0, bVar.f291774b));
                } else {
                    arrayList.add(new C99533c(0, bVar2.f291774b));
                    bVar.f291773a = bVar2.f291773a;
                }
            }
            bVar = bVar2;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        Log.m105924i("ConsecutiveAdHelper", "getDelAdByTime, cost=" + (currentTimeMillis2 - currentTimeMillis) + ", adCount=" + list.size() + ", delCount=" + arrayList.size());
        SnsMethodCalculate.markEndTimeMs("getDelAdByTime", "com.tencent.mm.plugin.sns.ad.helper.ConsecutiveAdDataHelper");
        return arrayList;
    }
}
