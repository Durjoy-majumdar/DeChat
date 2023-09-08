package ko2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102236a0;

/* renamed from: ko2.b */
public class C99151b implements Runnable {

    /* renamed from: d */
    public final String f290719d;

    /* renamed from: e */
    public final C99152c f290720e;

    public C99151b(C99152c cVar, String str) {
        this.f290720e = cVar;
        this.f290719d = str;
    }

    /* renamed from: a */
    public final String mo138520a(int i, AdClickActionInfo adClickActionInfo, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
        if (adClickActionInfo == null) {
            SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        } else if (adClickActionInfo.f273641b != 0) {
            SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return "";
        } else {
            String str = adClickActionInfo.f273643c;
            if (TextUtils.isEmpty(str)) {
                SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
                return "";
            }
            ADInfo adInfo = snsInfo.getAdInfo(i);
            if (adInfo != null) {
                str = C102236a0.m134734b(str, adInfo.uxInfo);
            }
            String b = C46734a.m52029b(str);
            Log.m105918d("SnsAd.H5PrefetchTask", "doClickBtnUrl: the url is " + b);
            SnsMethodCalculate.markEndTimeMs("doClickBtnUrl", "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask");
            return b;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0204  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTask"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "AdH5PrefetchTask is running, the task key is "
            r2.append(r3)
            java.lang.String r3 = r13.f290719d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SnsAd.H5PrefetchTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
            java.lang.String r2 = r13.f290719d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0031
            java.lang.String r2 = "AdH5PrefetchTask: the task key is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0031:
            ko2.c r2 = r13.f290720e
            java.lang.String r4 = r13.f290719d
            r2.getClass()
            java.lang.String r5 = "fetchTask"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.h5.prefetch.AdH5PrefetchTaskManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            r8 = 0
            if (r7 != 0) goto L_0x0054
            java.util.Map<java.lang.String, ko2.c$b> r2 = r2.f290721a
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            java.lang.Object r2 = r2.remove(r4)
            ko2.c$b r2 = (ko2.C99152c.C99154b) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            goto L_0x0058
        L_0x0054:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r2 = r8
        L_0x0058:
            if (r2 == 0) goto L_0x0282
            ko2.c r4 = r13.f290720e
            r4.getClass()
            java.lang.String r5 = "recordPrefetch"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.String r7 = r2.f290725a
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x008d
            ko2.c$a r7 = new ko2.c$a
            r7.<init>()
            java.lang.String r9 = r2.f290725a
            r7.f290723a = r9
            long r9 = java.lang.System.currentTimeMillis()
            r7.f290724b = r9
            java.util.Map<java.lang.String, ko2.c$a> r4 = r4.f290722b
            java.lang.String r9 = r7.f290723a
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            r4.put(r9, r7)
            java.lang.String r4 = "SnsAd.H5Prefetch"
            java.lang.String r7 = "the prefetch info is recorded"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
        L_0x008d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            java.lang.String r4 = "doPrefetch"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            int r5 = r2.f290726b
            if (r5 != 0) goto L_0x025a
            java.lang.String r5 = "doPrefetchOuter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            int r6 = r2.f290729e
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.f290728d
            if (r2 != 0) goto L_0x00ae
            java.lang.String r2 = "doPrefetch: the snsInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x027f
        L_0x00ae:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.lang.String r9 = "doTextAdLink"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            java.lang.String r10 = r2.getAdInfoLink()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x00c6
            java.lang.String r10 = r2.getAdLink()
        L_0x00c6:
            com.tencent.mm.plugin.sns.storage.ADInfo r11 = r2.getAdInfo(r6)
            if (r11 == 0) goto L_0x00d2
            java.lang.String r11 = r11.uxInfo
            java.lang.String r10 = vr2.C102236a0.m134734b(r10, r11)
        L_0x00d2:
            java.lang.String r10 = ko2.C46734a.m52029b(r10)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "doTextAdLink: the url is "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x00f6
            r7.add(r10)
        L_0x00f6:
            java.lang.String r9 = "doActionBtnUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r2.getAdXml()
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x0108
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            r10 = r11
            goto L_0x0117
        L_0x0108:
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r10 = r10.adCardActionBtnInfo
            if (r10 == 0) goto L_0x010f
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = r10.clickActionInfo
            goto L_0x0110
        L_0x010f:
            r10 = r8
        L_0x0110:
            java.lang.String r10 = r13.mo138520a(r6, r10, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
        L_0x0117:
            boolean r9 = android.text.TextUtils.isEmpty(r10)
            if (r9 != 0) goto L_0x0120
            r7.add(r10)
        L_0x0120:
            java.lang.String r9 = "doTagBtnUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r2.getAdXml()
            if (r10 != 0) goto L_0x0130
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            r8 = r11
            goto L_0x013d
        L_0x0130:
            co2.s r10 = r10.adTagBtnInfo
            if (r10 == 0) goto L_0x0136
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r8 = r10.f264599o
        L_0x0136:
            java.lang.String r8 = r13.mo138520a(r6, r8, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
        L_0x013d:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0146
            r7.add(r8)
        L_0x0146:
            java.lang.String r8 = "doWebViewOnePlusOne"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r1)
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r2.getAdXml()
            if (r9 == 0) goto L_0x0186
            com.tencent.mm.plugin.sns.storage.ADXml$n r9 = r9.adFloatWebViewInfo
            if (r9 == 0) goto L_0x0186
            java.lang.String r9 = r9.f82062a
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0161
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
            goto L_0x0189
        L_0x0161:
            com.tencent.mm.plugin.sns.storage.ADInfo r10 = r2.getAdInfo()
            if (r10 == 0) goto L_0x016d
            java.lang.String r10 = r10.uxInfo
            java.lang.String r9 = vr2.C102236a0.m134734b(r9, r10)
        L_0x016d:
            java.lang.String r9 = ko2.C46734a.m52029b(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "doWebViewOnePlusOne: the url is "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r10)
            r11 = r9
        L_0x0186:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r1)
        L_0x0189:
            boolean r3 = android.text.TextUtils.isEmpty(r11)
            if (r3 != 0) goto L_0x0192
            r7.add(r11)
        L_0x0192:
            java.lang.String r3 = "doSlideFullCardUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r2.getAdXml()
            if (r9 == 0) goto L_0x01fb
            co2.r r9 = r9.adSliderFullCardInfo
            if (r9 == 0) goto L_0x01fb
            java.util.List<co2.q> r9 = r9.f264582a
            if (r9 == 0) goto L_0x01fb
            boolean r10 = rq2.C101425k.m133097a(r9)
            if (r10 == 0) goto L_0x01b4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            goto L_0x01fe
        L_0x01b4:
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x01ba:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01fb
            java.lang.Object r10 = r9.next()
            co2.q r10 = (co2.C92448q) r10
            if (r10 == 0) goto L_0x01ba
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r11 = r10.f264578f
            if (r11 == 0) goto L_0x01df
            java.lang.String r11 = r13.mo138520a(r6, r11, r2)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x01df
            boolean r12 = r8.contains(r11)
            if (r12 != 0) goto L_0x01df
            r8.add(r11)
        L_0x01df:
            co2.t r10 = r10.f264579g
            if (r10 == 0) goto L_0x01ba
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = r10.f264603c
            if (r10 == 0) goto L_0x01ba
            java.lang.String r10 = r13.mo138520a(r6, r10, r2)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x01ba
            boolean r11 = r8.contains(r10)
            if (r11 != 0) goto L_0x01ba
            r8.add(r10)
            goto L_0x01ba
        L_0x01fb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
        L_0x01fe:
            boolean r3 = rq2.C101425k.m133097a(r8)
            if (r3 != 0) goto L_0x0207
            r7.addAll(r8)
        L_0x0207:
            java.lang.String r3 = "doClickActionInfoListUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            com.tencent.mm.plugin.sns.storage.ADInfo r9 = r2.getAdInfo(r6)
            if (r9 == 0) goto L_0x0247
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r10 = r9.adClickActionInfoList
            boolean r10 = rq2.C101425k.m133097a(r10)
            if (r10 != 0) goto L_0x0247
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r9 = r9.adClickActionInfoList
            java.util.Iterator r9 = r9.iterator()
        L_0x0225:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0247
            java.lang.Object r10 = r9.next()
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r10
            if (r10 == 0) goto L_0x0225
            java.lang.String r10 = r13.mo138520a(r6, r10, r2)
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0225
            boolean r11 = r8.contains(r10)
            if (r11 != 0) goto L_0x0225
            r8.add(r10)
            goto L_0x0225
        L_0x0247:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            boolean r2 = rq2.C101425k.m133097a(r8)
            if (r2 != 0) goto L_0x0253
            r7.addAll(r8)
        L_0x0253:
            ko2.C46734a.m52030c(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x027f
        L_0x025a:
            r6 = 1
            if (r5 != r6) goto L_0x027f
            java.lang.String r5 = "doPrefetchNativeLanding"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.String[] r6 = r2.f290727c
            boolean r6 = rq2.C101425k.m133099c(r6)
            if (r6 == 0) goto L_0x0273
            java.lang.String r2 = "doPrefetchNativeLanding: the task is null or urls is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto L_0x027f
        L_0x0273:
            java.lang.String[] r2 = r2.f290727c
            java.util.List r2 = java.util.Arrays.asList(r2)
            ko2.C46734a.m52030c(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
        L_0x027f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x0282:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ko2.C99151b.run():void");
    }
}
