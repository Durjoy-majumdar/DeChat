package jq2;

import ad0.C91999u;
import android.text.TextUtils;
import android.widget.ImageView;
import co2.C92444l;
import co2.C92448q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.anim.C94724k;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.C95301a;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import do2.C97503a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jq2.C99009x;
import lo2.C99556n;
import os2.C100413l;
import os2.C100419u;
import os2.C62176t;
import ps2.C100850a0;
import ps2.C100880k;
import ps2.C100891r;
import rq2.C101425k;
import rq2.C63489a;
import sf0.C48374j0;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C48952c4;
import vr2.C102236a0;
import vr2.C102268v;
import wo2.C102477l;

/* renamed from: jq2.u */
public class C99001u {

    /* renamed from: a */
    public static C100850a0 f290265a;

    /* renamed from: b */
    public static Set<String> f290266b = Collections.synchronizedSet(new HashSet());

    /* renamed from: jq2.u$a */
    public class C99002a implements C100850a0.C100851a {
        /* renamed from: a */
        public void mo138358a(C100850a0.C100852b bVar) {
            SnsMethodCalculate.markStartTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
            Log.m105918d("TimeLineAdPreloadHelper", "onParseResItem:" + bVar);
            int i = bVar.f295364a;
            if (i == 1) {
                C99001u.m128920f(bVar.f295365b, "", bVar.f295366c, true);
            } else if (i == 2) {
                try {
                    if (C86013q1.m106450k(C100891r.m132218m("adId", bVar.f295365b))) {
                        SnsMethodCalculate.markEndTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
                        return;
                    }
                    C94724k.m119921a(bVar.f295365b);
                } catch (Throwable th) {
                    Log.m105920e("TimeLineAdPreloadHelper", "onPreloadPagFile, exp=" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("onParseResItem", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
        }
    }

    /* renamed from: jq2.u$b */
    public class C99003b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f290267d;

        /* renamed from: e */
        public final /* synthetic */ C101804kv2 f290268e;

        public C99003b(String str, C101804kv2 kv22) {
            this.f290267d = str;
            this.f290268e = kv22;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$2");
            try {
                Log.m105924i("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, snsId=" + this.f290267d + ", mediaId=" + this.f290268e.f298689d);
                C94866e1.Vx0().mo130979d(this.f290268e, 4, (C102268v) null, C96983o3.f284139k);
                C115669n.INSTANCE.mo175911u(1697, 33);
            } catch (Throwable th) {
                Log.m105920e("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$2");
        }
    }

    /* renamed from: jq2.u$c */
    public class C99004c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f290269d;

        /* renamed from: e */
        public final /* synthetic */ C101804kv2 f290270e;

        public C99004c(String str, C101804kv2 kv22) {
            this.f290269d = str;
            this.f290270e = kv22;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$3");
            try {
                Log.m105924i("TimeLineAdPreloadHelper", "startPreloadThumb, snsId=" + this.f290269d + ", mediaId=" + this.f290270e.f298689d);
                C102268v vVar = new C102268v(this.f290270e);
                int i = 1;
                vVar.mo141832d(1);
                vVar.mo141833e(this.f290270e.f298689d);
                C94853e Vx0 = C94866e1.Vx0();
                C101804kv2 kv22 = this.f290270e;
                if (kv22.f298690e == 6) {
                    i = 5;
                }
                Vx0.mo130979d(kv22, i, vVar, C96983o3.f284139k);
            } catch (Throwable th) {
                Log.m105920e("TimeLineAdPreloadHelper", "startPreloadThumb exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$3");
        }
    }

    /* renamed from: jq2.u$d */
    public class C99005d implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f290271a;

        /* renamed from: b */
        public final /* synthetic */ String f290272b;

        /* renamed from: c */
        public final /* synthetic */ String f290273c;

        public C99005d(String str, String str2, String str3) {
            this.f290271a = str;
            this.f290272b = str2;
            this.f290273c = str3;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
            Log.m105920e("TimeLineAdPreloadHelper", this.f290271a + " cdn failed, snsid=" + this.f290272b + ", url=" + this.f290273c);
            C99001u.m128915a().remove(this.f290273c);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
            Log.m105924i("TimeLineAdPreloadHelper", this.f290271a + " cdn succ, snsid=" + this.f290272b + ", url=" + this.f290273c);
            C99001u.m128915a().remove(this.f290273c);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        }
    }

    /* renamed from: jq2.u$e */
    public class C99006e implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f290274a;

        /* renamed from: b */
        public final /* synthetic */ String f290275b;

        /* renamed from: c */
        public final /* synthetic */ String f290276c;

        public C99006e(String str, String str2, String str3) {
            this.f290274a = str;
            this.f290275b = str2;
            this.f290276c = str3;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
            Log.m105920e("TimeLineAdPreloadHelper", this.f290274a + " failed, snsid=" + this.f290275b + ", url=" + this.f290276c);
            C99001u.m128915a().remove(this.f290276c);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
            Log.m105924i("TimeLineAdPreloadHelper", this.f290274a + " succ, snsid=" + this.f290275b + ", url=" + this.f290276c);
            C99001u.m128915a().remove(this.f290276c);
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$5");
        }
    }

    static {
        C100850a0 a0Var = new C100850a0("timeline");
        f290265a = a0Var;
        C99002a aVar = new C99002a();
        SnsMethodCalculate.markStartTimeMs("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
        a0Var.f295363b = aVar;
        SnsMethodCalculate.markEndTimeMs("setAdPreloadAnnoListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor");
    }

    /* renamed from: a */
    public static /* synthetic */ Set m128915a() {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        Set<String> set = f290266b;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return set;
    }

    /* renamed from: b */
    public static boolean m128916b() {
        SnsMethodCalculate.markStartTimeMs("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        boolean z = NetStatusUtil.isWifi(MMApplicationContext.getContext()) || NetStatusUtil.is4G(MMApplicationContext.getContext()) || NetStatusUtil.is5G(MMApplicationContext.getContext());
        SnsMethodCalculate.markEndTimeMs("checkNetStatus", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return z;
    }

    /* renamed from: c */
    public static boolean m128917c(TimeLineObject timeLineObject, ADXml aDXml, ADInfo aDInfo, int i) {
        SnsMethodCalculate.markStartTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
            C99007v.m128936b(i);
            m128921g();
            if (!m128916b()) {
                Log.m105928w("TimeLineAdPreloadHelper", "checkPreloadAdResource, network is not wifi or 4G,5G");
                SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            m128919e(timeLineObject, aDXml, aDInfo, i);
            SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        } catch (Throwable th) {
            Log.m105920e("TimeLineAdPreloadHelper", "checkPreloadAdResource, exp=" + th.toString());
        }
    }

    /* renamed from: d */
    public static boolean m128918d(C48952c4 c4Var, int i) {
        LinkedList<C101804kv2> linkedList;
        C101804kv2 kv22;
        SnsMethodCalculate.markStartTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        try {
            C99007v.m128936b(i);
            m128921g();
            String f = C48374j0.m53717f(c4Var.f131489d.f134464d.ObjectDesc);
            String g = C48374j0.m53718g(c4Var.f131489d.f134465e);
            String g2 = C48374j0.m53718g(c4Var.f131490e);
            TimeLineObject q = C91999u.m115571q(f);
            C101789j00 j002 = q.ContentObj;
            if (!(j002 == null || (linkedList = j002.f298427h) == null || linkedList.size() <= 0 || (kv22 = q.ContentObj.f298427h.get(0)) == null)) {
                kv22.f298681N = true;
            }
            ADXml aDXml = new ADXml(g);
            ADInfo aDInfo = new ADInfo(g2);
            C99007v.m128935a(i, aDXml, q);
            if (!m128916b()) {
                Log.m105928w("TimeLineAdPreloadHelper", "checkPreloadAdResource, network is not wifi or 4G,5G");
                SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            m128919e(q, aDXml, aDInfo, i);
            SnsMethodCalculate.markEndTimeMs("checkPreloadAdResource", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        } catch (Throwable th) {
            Log.m105920e("TimeLineAdPreloadHelper", "checkPreloadAdResource, exp2=" + th.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:184:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03c9  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m128919e(com.tencent.p014mm.protocal.protobuf.TimeLineObject r16, com.tencent.p014mm.plugin.sns.storage.ADXml r17, com.tencent.p014mm.plugin.sns.storage.ADInfo r18, int r19) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            java.lang.String r5 = "doPreload"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            if (r3 != 0) goto L_0x0013
            r0 = 0
            goto L_0x0017
        L_0x0013:
            bo2.a r0 = r18.getAdPreloadConfig()
        L_0x0017:
            r8 = -1
            if (r0 == 0) goto L_0x0023
            boolean r8 = r0.f264107a
            int r10 = r0.f264108b
            boolean r11 = r0.f264109c
            int r12 = r0.f264110d
            goto L_0x0027
        L_0x0023:
            r8 = 0
            r10 = -1
            r11 = 0
            r12 = -1
        L_0x0027:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "adVideoPreload, doPreload, scene="
            r13.append(r14)
            r13.append(r4)
            java.lang.String r14 = ", snsId="
            r13.append(r14)
            java.lang.String r15 = r1.f283893Id
            r13.append(r15)
            java.lang.String r15 = ", timelineForbid="
            r13.append(r15)
            r13.append(r8)
            java.lang.String r15 = ", timelineRatio="
            r13.append(r15)
            r13.append(r10)
            java.lang.String r15 = ", landingpageForbid="
            r13.append(r15)
            r13.append(r11)
            java.lang.String r15 = ", landingpageRatio="
            r13.append(r15)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = "TimeLineAdPreloadHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            r13 = 1697(0x6a1, float:2.378E-42)
            if (r0 == 0) goto L_0x00a5
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 41
            r0.mo175911u(r13, r7)
            r7 = 36
            r9 = 37
            if (r8 == 0) goto L_0x007c
            r0.mo175911u(r13, r9)
            goto L_0x007f
        L_0x007c:
            r0.mo175911u(r13, r7)
        L_0x007f:
            r9 = 38
            if (r10 <= 0) goto L_0x0087
            r0.mo175911u(r13, r9)
            goto L_0x008c
        L_0x0087:
            r10 = 39
            r0.mo175911u(r13, r10)
        L_0x008c:
            r10 = 1720(0x6b8, float:2.41E-42)
            if (r11 == 0) goto L_0x0094
            r0.mo175911u(r10, r7)
            goto L_0x0099
        L_0x0094:
            r7 = 35
            r0.mo175911u(r10, r7)
        L_0x0099:
            if (r12 <= 0) goto L_0x00a1
            r7 = 37
            r0.mo175911u(r10, r7)
            goto L_0x00ac
        L_0x00a1:
            r0.mo175911u(r10, r9)
            goto L_0x00ac
        L_0x00a5:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 42
            r0.mo175911u(r13, r7)
        L_0x00ac:
            java.lang.String r7 = "preloadAdVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            te3.j00 r0 = r1.ContentObj     // Catch:{ all -> 0x01cd }
            int r9 = r0.f298424e     // Catch:{ all -> 0x01cd }
            r10 = 15
            if (r9 == r10) goto L_0x00d6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r0.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = "preloadAdVideo, ContentStyle is not video, snsId="
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x01ea
        L_0x00d6:
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x01b2
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x00e2
            goto L_0x01b2
        L_0x00e2:
            java.lang.String r0 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            boolean r0 = m128925k(r2, r0, r8)     // Catch:{ all -> 0x01cd }
            r9 = 31
            if (r0 == 0) goto L_0x010d
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01cd }
            r0.mo175911u(r13, r9)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r0.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = "the sns info is topic card info, snsId="
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x01ea
        L_0x010d:
            java.lang.String r0 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            boolean r0 = m128924j(r2, r0, r8)     // Catch:{ all -> 0x01cd }
            if (r0 == 0) goto L_0x0136
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01cd }
            r0.mo175911u(r13, r9)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r0.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = "the sns info is slide full card info, snsId = "
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x01ea
        L_0x0136:
            te3.j00 r0 = r1.ContentObj     // Catch:{ all -> 0x01cd }
            java.util.LinkedList<te3.kv2> r0 = r0.f298427h     // Catch:{ all -> 0x01cd }
            r10 = 0
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x01cd }
            te3.kv2 r0 = (te3.C101804kv2) r0     // Catch:{ all -> 0x01cd }
            boolean r10 = jq2.C98993j.m128900b(r16, r17)     // Catch:{ all -> 0x01cd }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r11.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r12 = "adVideoPreload, preloadAdVideo, isOnlineVideo="
            r11.append(r12)     // Catch:{ all -> 0x01cd }
            r11.append(r10)     // Catch:{ all -> 0x01cd }
            r11.append(r14)     // Catch:{ all -> 0x01cd }
            java.lang.String r12 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            r11.append(r12)     // Catch:{ all -> 0x01cd }
            java.lang.String r12 = ", forbidPreloadVideo="
            r11.append(r12)     // Catch:{ all -> 0x01cd }
            r11.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r11)     // Catch:{ all -> 0x01cd }
            if (r10 != 0) goto L_0x019d
            if (r2 == 0) goto L_0x018d
            boolean r10 = r17.isFullCardAd()     // Catch:{ all -> 0x01cd }
            if (r10 == 0) goto L_0x0183
            java.lang.String r10 = "preloadAdVideo, !isOnlineVideo, isFullCard, checkH265"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)     // Catch:{ all -> 0x01cd }
            java.lang.String r10 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            lo2.C99556n.m129939b(r2, r0, r10)     // Catch:{ all -> 0x01cd }
            r10 = 0
            m128922h(r1, r2, r10)     // Catch:{ all -> 0x01cd }
            goto L_0x018d
        L_0x0183:
            java.lang.String r10 = "preloadAdVideo, !isOnlineVideo, !isFullCard, disableH265"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r10)     // Catch:{ all -> 0x01cd }
            r10 = 0
            lo2.C99556n.m129946i(r0, r10)     // Catch:{ all -> 0x01cd }
        L_0x018d:
            java.lang.String r10 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            m128927m(r0, r10, r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            m128926l(r0, r8)     // Catch:{ all -> 0x01cd }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01cd }
            r0.mo175911u(r13, r9)     // Catch:{ all -> 0x01cd }
            goto L_0x01ae
        L_0x019d:
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            lo2.C99556n.m129939b(r2, r0, r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            m128926l(r0, r8)     // Catch:{ all -> 0x01cd }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x01cd }
            r8 = 32
            r0.mo175911u(r13, r8)     // Catch:{ all -> 0x01cd }
        L_0x01ae:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x01ea
        L_0x01b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cd }
            r0.<init>()     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = "preloadAdVideo, MediaObjList is empty, snsId="
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r8 = r1.f283893Id     // Catch:{ all -> 0x01cd }
            r0.append(r8)     // Catch:{ all -> 0x01cd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r0)     // Catch:{ all -> 0x01cd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            goto L_0x01ea
        L_0x01cd:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "preloadAdVideo, doCheckVideo  Ad exp="
            r8.append(r9)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
        L_0x01ea:
            ps2.a0 r0 = f290265a
            r0.getClass()
            java.lang.String r7 = "checkPreloadRes"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdPreloadAnnoProcessor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = ""
            r0.mo140320a(r2, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.GridItemInfo"
            if (r2 == 0) goto L_0x02b3
            com.tencent.mm.plugin.sns.storage.ADXml$b r7 = r2.adScanJumpInfo
            if (r7 == 0) goto L_0x020b
            java.lang.String r8 = r1.f283893Id
            m128923i(r7, r8)
        L_0x020b:
            co2.n r7 = r2.adLiveInfo
            r8 = 1
            if (r7 == 0) goto L_0x0241
            java.lang.String r9 = r1.f283893Id
            java.lang.String r10 = "preloadLivingAnimIcon"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r6)
            java.util.List<co2.n$a> r11 = r7.f264564j
            if (r11 == 0) goto L_0x023e
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x023e
            java.util.List<co2.n$a> r7 = r7.f264564j
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x022c:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x023e
            java.lang.Object r11 = r7.next()
            co2.n$a r11 = (co2.C92445n.C92446a) r11
            java.lang.String r11 = r11.f264565a
            m128920f(r11, r9, r10, r8)
            goto L_0x022c
        L_0x023e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r6)
        L_0x0241:
            boolean r7 = lo2.C46881t0.m52211b()
            if (r7 == 0) goto L_0x025a
            com.tencent.mm.plugin.sns.ad.adxml.a$a r7 = r2.adFinderLivePreviewInfo
            if (r7 != 0) goto L_0x0257
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r7 = r2.adCardActionBtnInfo
            if (r7 == 0) goto L_0x025a
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r7.clickActionInfo
            if (r7 == 0) goto L_0x025a
            boolean r7 = r7.f273629Q
            if (r7 == 0) goto L_0x025a
        L_0x0257:
            lo2.C46881t0.m52210a()
        L_0x025a:
            boolean r7 = r17.isCombinedGridAD()
            if (r7 == 0) goto L_0x02b3
            os2.f r7 = r2.adCombinedGridInfo
            if (r7 == 0) goto L_0x02b3
            java.util.List r7 = r7.mo139844b()
            if (r7 == 0) goto L_0x02b3
            os2.f r7 = r2.adCombinedGridInfo
            java.util.List r7 = r7.mo139844b()
            r10 = 0
        L_0x0271:
            int r9 = r7.size()
            if (r10 >= r9) goto L_0x0292
            java.lang.Object r9 = r7.get(r10)
            os2.o r9 = (os2.C100414o) r9
            r9.getClass()
            java.lang.String r11 = "getMedia"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            te3.kv2 r9 = r9.f294174a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
            java.lang.String r11 = r1.f283893Id
            m128926l(r9, r11)
            int r10 = r10 + 1
            goto L_0x0271
        L_0x0292:
            te3.j00 r7 = r1.ContentObj
            int r9 = r7.f298424e
            if (r9 != r8) goto L_0x02b3
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            if (r7 == 0) goto L_0x02b3
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x02b3
            te3.j00 r7 = r1.ContentObj
            java.util.LinkedList<te3.kv2> r7 = r7.f298427h
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            te3.kv2 r7 = (te3.C101804kv2) r7
            java.lang.String r1 = r1.f283893Id
            m128926l(r7, r1)
            goto L_0x02b4
        L_0x02b3:
            r8 = 0
        L_0x02b4:
            java.lang.String r1 = "doPreloadClickActionInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r6)
            if (r2 == 0) goto L_0x03b0
            if (r3 != 0) goto L_0x02bf
            goto L_0x03b0
        L_0x02bf:
            com.tencent.mm.plugin.sns.storage.ADXml$a r7 = r2.adFinderInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02cc
            boolean r9 = r3.preloadFinderFeed     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x02cc
            java.lang.String r7 = r7.f164346c     // Catch:{ all -> 0x03a4 }
            lo2.C99544i0.m129921h(r7)     // Catch:{ all -> 0x03a4 }
        L_0x02cc:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r2.adActionLinkClickInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02d3
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x02d3:
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r7 = r2.adCardActionBtnInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02de
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r7.clickActionInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02de
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x02de:
            co2.s r7 = r2.adTagBtnInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02e9
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r7.f264599o     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02e9
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x02e9:
            com.tencent.mm.plugin.sns.storage.ADXml$h r7 = r17.getAdSelectInfo()     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02fd
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r9 = r7.f275707c     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x02f6
            r9.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x02f6:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r7.f275708d     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x02fd
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x02fd:
            co2.r r7 = r2.adSliderFullCardInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x0334
            java.util.List<co2.q> r7 = r7.f264582a     // Catch:{ all -> 0x03a4 }
            boolean r7 = rq2.C101425k.m133097a(r7)     // Catch:{ all -> 0x03a4 }
            if (r7 != 0) goto L_0x0334
            co2.r r7 = r2.adSliderFullCardInfo     // Catch:{ all -> 0x03a4 }
            java.util.List<co2.q> r7 = r7.f264582a     // Catch:{ all -> 0x03a4 }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ all -> 0x03a4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x03a4 }
        L_0x0313:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0334
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x03a4 }
            co2.q r9 = (co2.C92448q) r9     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0313
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = r9.f264578f     // Catch:{ all -> 0x03a4 }
            if (r10 == 0) goto L_0x0328
            r10.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x0328:
            co2.t r9 = r9.f264579g     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0313
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r9 = r9.f264603c     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0313
            r9.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
            goto L_0x0313
        L_0x0334:
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r7 = r3.adClickActionInfoList     // Catch:{ all -> 0x03a4 }
            boolean r7 = rq2.C101425k.m133097a(r7)     // Catch:{ all -> 0x03a4 }
            if (r7 != 0) goto L_0x0354
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r7 = r3.adClickActionInfoList     // Catch:{ all -> 0x03a4 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x03a4 }
        L_0x0342:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0354
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x03a4 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r9 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r9     // Catch:{ all -> 0x03a4 }
            if (r9 == 0) goto L_0x0342
            r9.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
            goto L_0x0342
        L_0x0354:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r2.headAdClickActionInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x035b
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x035b:
            com.tencent.mm.plugin.sns.storage.a r7 = r2.adBreakFrameInfo     // Catch:{ all -> 0x03a4 }
            java.lang.String r9 = "getClickActionInfo"
            if (r7 == 0) goto L_0x0375
            os2.a r7 = r7.mo132013b()     // Catch:{ all -> 0x03a4 }
            r7.getClass()     // Catch:{ all -> 0x03a4 }
            java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.AdBreakFrameClickInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)     // Catch:{ all -> 0x03a4 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r7 = r7.f294081g     // Catch:{ all -> 0x03a4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)     // Catch:{ all -> 0x03a4 }
            r7.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
        L_0x0375:
            os2.f r7 = r2.adCombinedGridInfo     // Catch:{ all -> 0x03a4 }
            if (r7 == 0) goto L_0x03ac
            java.util.List r7 = r7.mo139844b()     // Catch:{ all -> 0x03a4 }
        L_0x037d:
            int r10 = r7.size()     // Catch:{ all -> 0x03a4 }
            if (r8 >= r10) goto L_0x039a
            java.lang.Object r10 = r7.get(r8)     // Catch:{ all -> 0x03a4 }
            os2.o r10 = (os2.C100414o) r10     // Catch:{ all -> 0x03a4 }
            r10.getClass()     // Catch:{ all -> 0x03a4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)     // Catch:{ all -> 0x03a4 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r10 = r10.f294175b     // Catch:{ all -> 0x03a4 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)     // Catch:{ all -> 0x03a4 }
            r10.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
            int r8 = r8 + 1
            goto L_0x037d
        L_0x039a:
            os2.f r0 = r2.adCombinedGridInfo     // Catch:{ all -> 0x03a4 }
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r0 = r0.mo139843a()     // Catch:{ all -> 0x03a4 }
            r0.mo130141c(r3)     // Catch:{ all -> 0x03a4 }
            goto L_0x03ac
        L_0x03a4:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x03ac:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
            goto L_0x03b3
        L_0x03b0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r6)
        L_0x03b3:
            java.lang.String r0 = "preloadUserAvatar"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.helper.TimelineAdUserAvatarHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r7 = "AdUserAvatarHelper"
            if (r2 != 0) goto L_0x03c9
            java.lang.String r2 = "the ad xml is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x0402
        L_0x03c9:
            boolean r8 = r2.usePreferedInfo
            if (r8 == 0) goto L_0x03ff
            java.lang.String r8 = r2.preferAvatar
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x03ff
            boolean r8 = jq2.C99009x.m128943d()
            if (r8 == 0) goto L_0x03ff
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "ready to preload preferAvatar: "
            r8.append(r9)
            java.lang.String r9 = r2.preferAvatar
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            java.lang.String r2 = r2.preferAvatar
            jq2.x$b r7 = new jq2.x$b
            r8 = 0
            r7.<init>(r8)
            java.lang.String r8 = "adId"
            ps2.C100891r.m132209d(r8, r2, r7)
        L_0x03ff:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x0402:
            if (r3 == 0) goto L_0x0430
            java.lang.String r0 = r3.uxInfo
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0430
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateWuid, scene="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", uxInfo="
            r0.append(r1)
            java.lang.String r1 = r3.uxInfo
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            java.lang.String r0 = r3.uxInfo
            jq2.C88011l.m109542d(r0)
        L_0x0430:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jq2.C99001u.m128919e(com.tencent.mm.protocal.protobuf.TimeLineObject, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.ADInfo, int):void");
    }

    /* renamed from: f */
    public static void m128920f(String str, String str2, String str3, boolean z) {
        SnsMethodCalculate.markStartTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("TimeLineAdPreloadHelper", str3 + " url is empty, snsid=" + str2);
            SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        String d = z ? C63489a.m74829d(str) : C100891r.m132217l("adId", str);
        if (!TextUtils.isEmpty(d) && C86013q1.m106450k(d)) {
            Log.m105924i("TimeLineAdPreloadHelper", str3 + " file exists, snsid=" + str2 + ", filePath=" + d);
            SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        } else if (f290266b.contains(str)) {
            Log.m105928w("TimeLineAdPreloadHelper", str3 + " is in downloading, snsid=" + str2);
            SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        } else {
            f290266b.add(str);
            C115669n.INSTANCE.mo175911u(1697, 34);
            if (z) {
                C63489a.m74828c(str, new C99005d(str3, str2, str));
            } else {
                C100891r.m132206a(str, true, 41, 0, new C99006e(str3, str2, str));
            }
            SnsMethodCalculate.markEndTimeMs("downloadImage", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        }
    }

    /* renamed from: g */
    public static void m128921g() {
        String nullAsNil;
        SnsMethodCalculate.markStartTimeMs("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (C97503a.class) {
            SnsMethodCalculate.markStartTimeMs("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
            C97503a.C97504a aVar = new C97503a.C97504a();
            C97503a.C97504a.m125624a(aVar, true, true);
            nullAsNil = Util.nullAsNil(C97503a.C97504a.m125625b(aVar));
            SnsMethodCalculate.markEndTimeMs("preloadDeviceInfo", "com.tencent.mm.plugin.sns.ad.device.AdDeviceInfo");
        }
        Log.m105924i("TimeLineAdPreloadHelper", "AdDeviceInfo.preloadDeviceInfo, timeCost = " + (System.currentTimeMillis() - currentTimeMillis) + ", ret = " + nullAsNil);
        SnsMethodCalculate.markEndTimeMs("preloadAdDeviceInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    /* renamed from: h */
    public static void m128922h(TimeLineObject timeLineObject, ADXml aDXml, boolean z) {
        TimeLineObject timeLineObject2 = timeLineObject;
        ADXml aDXml2 = aDXml;
        boolean z2 = z;
        SnsMethodCalculate.markStartTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (aDXml2 == null) {
            SnsMethodCalculate.markEndTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return;
        }
        C95301a aVar = aDXml2.adBreakFrameInfo;
        if (aVar != null) {
            C100413l a = aVar.mo132012a();
            a.getClass();
            SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            C101804kv2 kv22 = a.f294169a;
            SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            if (kv22 != null) {
                kv22.f298681N = true;
            }
            C101804kv2 a2 = aVar.mo132012a().mo139876a();
            C100413l a3 = aVar.mo132012a();
            a3.getClass();
            SnsMethodCalculate.markStartTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            C101804kv2 kv23 = a3.f294171c;
            SnsMethodCalculate.markEndTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
            if (a2 != null) {
                a2.f298681N = true;
            }
            if (kv23 != null) {
                kv23.f298681N = true;
            }
            if (!(aVar.mo132012a() == null || aVar.mo132012a().mo139877b() == null || aVar.mo132012a().mo139877b().mo139881b() == null)) {
                C100419u b = aVar.mo132012a().mo139877b().mo139881b();
                SnsMethodCalculate.markStartTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                SnsMethodCalculate.markStartTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                C87412m.m108594g(b, "stateInfo");
                Log.m105924i("PlayStateInfo", "preloadIcon start");
                C62176t.C62177a aVar2 = C62176t.f176778d;
                aVar2.mo87233b(b.mo139882a());
                aVar2.mo87233b(b.mo139884c());
                SnsMethodCalculate.markStartTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                C62176t tVar = b.f294185d;
                SnsMethodCalculate.markEndTimeMs("getLikeState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                aVar2.mo87233b(tVar);
                SnsMethodCalculate.markStartTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                C62176t tVar2 = b.f294186e;
                SnsMethodCalculate.markEndTimeMs("getCommentState", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
                aVar2.mo87233b(tVar2);
                C62176t b2 = b.mo139883b();
                if (b2 != null) {
                    aVar2.mo87233b(b2);
                }
                SnsMethodCalculate.markEndTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo$Companion");
                SnsMethodCalculate.markEndTimeMs("preloadIcon", "com.tencent.mm.plugin.sns.storage.PlayStateInfo");
            }
        }
        if ((aDXml.isAdBreakFrameVideo() || aDXml.isAdIpInteractVideo()) && aVar != null) {
            if (aVar.mo132012a().mo139878c() == 1) {
                C101804kv2 a4 = aVar.mo132012a().mo139876a();
                if (a4 == null || !C102477l.f301757a.mo142086c(2880, 1080)) {
                    C100413l a5 = aVar.mo132012a();
                    a5.getClass();
                    SnsMethodCalculate.markStartTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    C101804kv2 kv24 = a5.f294171c;
                    SnsMethodCalculate.markEndTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                    if (kv24 != null) {
                        C99556n.m129939b(aDXml2, kv24, timeLineObject2.f283893Id);
                        m128927m(kv24, timeLineObject2.f283893Id, z2);
                    }
                } else {
                    C99556n.m129939b(aDXml2, a4, timeLineObject2.f283893Id);
                    m128927m(a4, timeLineObject2.f283893Id, z2);
                }
            } else {
                C100413l a6 = aVar.mo132012a();
                a6.getClass();
                SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                C101804kv2 kv25 = a6.f294169a;
                SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                if (kv25 != null) {
                    C99556n.m129939b(aDXml2, kv25, timeLineObject2.f283893Id);
                    m128927m(kv25, timeLineObject2.f283893Id, z2);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("preloadBreakVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    /* renamed from: i */
    public static void m128923i(ADXml.C85461b bVar, String str) {
        SnsMethodCalculate.markStartTimeMs("preloadScanRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (bVar != null) {
            String str2 = bVar.f249071a;
            SnsMethodCalculate.markStartTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            m128920f(str2, str, "preloadScanRes bgImage", false);
            SnsMethodCalculate.markEndTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            String str3 = bVar.f249073c;
            SnsMethodCalculate.markStartTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            m128920f(str3, str, "preloadScanRes descIcon", false);
            SnsMethodCalculate.markEndTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            String str4 = bVar.f249074d;
            SnsMethodCalculate.markStartTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            m128920f(str4, str, "preloadScanRes succIcon", false);
            SnsMethodCalculate.markEndTimeMs("downloadImageByHttp", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        }
        SnsMethodCalculate.markEndTimeMs("preloadScanRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
    }

    /* renamed from: j */
    public static boolean m128924j(ADXml aDXml, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (aDXml == null || aDXml.adSliderFullCardInfo == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            List<C92448q> list = aDXml.adSliderFullCardInfo.f264582a;
            if (C101425k.m133097a(list)) {
                SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C92448q qVar = (C92448q) it.next();
                if (qVar != null) {
                    String str2 = qVar.f264581i;
                    SnsMethodCalculate.markStartTimeMs("doPreloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                    if (!Util.isNullOrNil(str2)) {
                        C100891r.m132209d("adId", str2, new C99009x.C99011b((ImageView) null));
                    }
                    SnsMethodCalculate.markEndTimeMs("doPreloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                    String str3 = qVar.f264580h;
                    SnsMethodCalculate.markStartTimeMs("doPreloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                    if (!Util.isNullOrNil(str3)) {
                        C100891r.m132209d("adId", str3, new C99009x.C99011b((ImageView) null));
                    }
                    SnsMethodCalculate.markEndTimeMs("doPreloadImg", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                    if (qVar.mo126435a()) {
                        if (C98993j.m128902d()) {
                            C99556n.m129939b(aDXml, qVar.f264577e, str);
                            m128927m(qVar.f264577e, str, z);
                        }
                        m128926l(qVar.f264577e, str);
                    } else {
                        C100891r.m132209d("adId", qVar.f264577e.f298694i, new C99009x.C99011b((ImageView) null));
                    }
                }
            }
            Log.m105918d("TimeLineAdPreloadHelper", "the slide full card resource preloaded!");
            SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (Throwable th) {
            Log.m105920e("TimeLineAdPreloadHelper", "preloadSlideFullCardRes exp = " + th.toString());
            SnsMethodCalculate.markEndTimeMs("preloadSlideFullCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m128925k(ADXml aDXml, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (aDXml == null || aDXml.adFinderTopicInfo == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        try {
            List<C92444l> list = aDXml.adFinderTopicInfo.f264544f;
            if (C101425k.m133097a(list)) {
                SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
                return false;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C92444l lVar = (C92444l) it.next();
                if (lVar != null && lVar.mo126434a()) {
                    m128927m(lVar.f264553i, str, z);
                    m128926l(lVar.f264553i, str);
                }
            }
            Log.m105918d("TimeLineAdPreloadHelper", "the topic card resource preloaded!");
            SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return true;
        } catch (Throwable th) {
            Log.m105920e("TimeLineAdPreloadHelper", "preloadTopicCardRes exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("preloadTopicCardRes", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
    }

    /* renamed from: l */
    public static boolean m128926l(C101804kv2 kv22, String str) {
        SnsMethodCalculate.markStartTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
        String X = C102236a0.m134729X(kv22);
        if (C86013q1.m106450k(e + X)) {
            Log.m105928w("TimeLineAdPreloadHelper", "startPreloadThumb, file Exists, snsId=" + str + ", mediaId=" + kv22.f298689d);
            SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        C115669n.INSTANCE.mo175911u(1697, 34);
        MMHandlerThread.postToMainThread(new C99004c(str, kv22));
        SnsMethodCalculate.markEndTimeMs("startPreloadThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return true;
    }

    /* renamed from: m */
    public static boolean m128927m(C101804kv2 kv22, String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        if (z) {
            Log.m105928w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, forbidden, snsId=" + str + ", mediaId=" + kv22.f298689d);
            SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        String str2 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134725T(kv22);
        if (C86013q1.m106450k(str2)) {
            Log.m105928w("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, file Exists, snsId=" + str + ", mediaId=" + kv22.f298689d + ", filePath=" + str2);
            SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
            return false;
        }
        MMHandlerThread.postToMainThread(new C99003b(str, kv22));
        SnsMethodCalculate.markEndTimeMs("startPreloadVideo", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper");
        return true;
    }
}
