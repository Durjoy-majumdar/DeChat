package es0;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebFeature;
import java.util.ArrayList;
import java.util.Iterator;
import p213oh.C11412b;

/* renamed from: es0.k */
public class C58801k {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r11.f139002g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m68583a(long r9, te3.C50644o72 r11) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x000d
            java.util.LinkedList<te3.io3> r1 = r11.f139002g
            if (r1 != 0) goto L_0x0008
            goto L_0x000d
        L_0x0008:
            int r1 = r1.size()
            goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r3[r0] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r3[r4] = r1
            int r1 = p213oh.C11412b.f33577a
            java.lang.String r1 = "MicroMsg.Recommend.AppBrandRecommendIdkeyReport"
            java.lang.String r5 = "doReportCgiGet costTime:%d, list size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r3)
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r3 = 1043(0x413, float:1.462E-42)
            r1.SetID(r3)
            r1.SetKey(r0)
            r5 = 1
            r1.SetValue(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r1)
            if (r11 != 0) goto L_0x0055
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r3)
            r11.SetKey(r4)
            r11.SetValue(r5)
            r0.add(r11)
            goto L_0x0084
        L_0x0055:
            java.util.LinkedList<te3.io3> r11 = r11.f139002g
            if (r11 == 0) goto L_0x0073
            int r11 = r11.size()
            if (r11 != 0) goto L_0x0060
            goto L_0x0073
        L_0x0060:
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r3)
            r1 = 3
            r11.SetKey(r1)
            r11.SetValue(r5)
            r0.add(r11)
            goto L_0x0084
        L_0x0073:
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r3)
            r11.SetKey(r2)
            r11.SetValue(r5)
            r0.add(r11)
        L_0x0084:
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r3)
            r1 = 5
            r11.SetKey(r1)
            r11.SetValue(r5)
            r0.add(r11)
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r3)
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x00a4
            r9 = 6
            goto L_0x00d9
        L_0x00a4:
            r1 = 3
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00b0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x00b0
            r9 = 7
            goto L_0x00d9
        L_0x00b0:
            r7 = 5
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00bd
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x00bd
            r9 = 8
            goto L_0x00d9
        L_0x00bd:
            r1 = 10
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00ca
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x00ca
            r9 = 9
            goto L_0x00d9
        L_0x00ca:
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x00d7
            r1 = 20
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x00d7
            r9 = 10
            goto L_0x00d9
        L_0x00d7:
            r9 = 11
        L_0x00d9:
            r11.SetKey(r9)
            r11.SetValue(r5)
            r0.add(r11)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9.mo160124a(r0, r4)
            m68585c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: es0.C58801k.m68583a(long, te3.o72):void");
    }

    /* renamed from: b */
    public static void m68584b(int i) {
        int i2 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Recommend.AppBrandRecommendIdkeyReport", "doReportDataSource", (Object[]) null);
        IDKey iDKey = new IDKey();
        iDKey.SetID(XWebFeature.INTERFACE_CONFIGURE_V8_LITE);
        iDKey.SetKey(18);
        iDKey.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(XWebFeature.INTERFACE_CONFIGURE_V8_LITE);
        if (i == 1) {
            iDKey2.SetKey(19);
        } else {
            iDKey2.SetKey(20);
        }
        iDKey2.SetValue(1);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, true);
        m68585c(arrayList);
    }

    /* renamed from: c */
    public static void m68585c(ArrayList<IDKey> arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append("idkeyGroupStat:  id:1043");
        Iterator<IDKey> it = arrayList.iterator();
        while (it.hasNext()) {
            IDKey next = it.next();
            sb.append(", key:" + next.GetKey() + " value:" + next.GetValue());
        }
        String sb4 = sb.toString();
        int i = C11412b.f33577a;
        Log.m105925i("MicroMsg.Recommend.AppBrandRecommendIdkeyReport", sb4, (Object[]) null);
    }
}
