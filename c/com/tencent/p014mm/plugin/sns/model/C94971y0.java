package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94928p2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95003w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import hd0.C98394e0;
import java.io.ByteArrayOutputStream;
import os2.C100406i0;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101211h;
import p663qo.C101213l;
import p823sg.C90193h;
import te3.C101783gu2;
import te3.C101821nv2;
import te3.C64376fv2;
import xb0.C102609h;

/* renamed from: com.tencent.mm.plugin.sns.model.y0 */
public class C94971y0 {

    /* renamed from: a */
    public String f275324a;

    /* renamed from: b */
    public String f275325b;

    /* renamed from: c */
    public C100406i0 f275326c;

    /* renamed from: d */
    public int f275327d;

    /* renamed from: e */
    public C94973b f275328e;

    /* renamed from: f */
    public String f275329f = "";

    /* renamed from: g */
    public long f275330g = 0;

    /* renamed from: h */
    public String f275331h = "";

    /* renamed from: i */
    public C101821nv2 f275332i = new C101821nv2();

    /* renamed from: j */
    public int f275333j;

    /* renamed from: k */
    public C98124g.C98125a f275334k = new C94972a();

    /* renamed from: com.tencent.mm.plugin.sns.model.y0$a */
    public class C94972a implements C98124g.C98125a {
        public C94972a() {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C101821nv2 nv22;
            int i2 = i;
            C98121d dVar2 = dVar;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            if (i2 == -21005) {
                C94971y0.m120638c(C94971y0.this);
                Log.m105919d("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, Integer.valueOf(i), cVar, dVar2);
                C95003w.m120753a(C94971y0.m120639d(C94971y0.this), 3, -1);
                ((C94928p2.C94932d) C94971y0.m120640e(C94971y0.this)).mo131212a(true, C94971y0.this);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode == 0) {
                C94971y0.m120638c(C94971y0.this);
                Log.m105925i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, Integer.valueOf(i), cVar, dVar2);
                C94971y0 y0Var = C94971y0.this;
                String str2 = dVar2.field_fileUrl;
                String str3 = dVar2.field_thumbUrl;
                C94971y0.m120638c(y0Var);
                SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                C100406i0 LL = C94866e1.ay0().mo139867LL((long) y0Var.f275327d);
                Log.m105918d("MicroMsg.SightCdnUpload", "upload ok " + str2 + "  " + "upload_null" + "  " + 1);
                LL.mo139856j("upload_null");
                try {
                    nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
                } catch (Exception unused) {
                    nv22 = null;
                }
                if (nv22 == null) {
                    nv22 = new C101821nv2();
                }
                C64376fv2 fv22 = new C64376fv2();
                fv22.f183229e = 1;
                fv22.f183228d = str2;
                nv22.f298916g = fv22;
                nv22.f298920n = 0;
                String k7 = ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(y0Var.f275324a);
                nv22.f298910A = k7;
                Log.m105925i("MicroMsg.SightCdnUpload", "onPostScene videomd5 %s", k7);
                if (!Util.isNullOrNil(str3)) {
                    C64376fv2 fv23 = new C64376fv2();
                    fv23.f183229e = 1;
                    fv23.f183228d = str3;
                    nv22.f298918i.add(fv23);
                }
                try {
                    LL.mo139858l(nv22.toByteArray());
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SightCdnUpload", e, "", new Object[0]);
                }
                LL.mo139859m();
                C94866e1.ay0().r50(y0Var.f275327d, LL);
                C94866e1.Rx0().mo130965x(y0Var.f275327d);
                if (C94866e1.gy0() != null) {
                    C94866e1.gy0().mo131192c();
                }
                SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                C98394e0 vx02 = C98394e0.vx0();
                int d = C94971y0.m120639d(C94971y0.this);
                C94971y0 y0Var2 = C94971y0.this;
                SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                int i3 = y0Var2.f275333j;
                SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                vx02.getClass();
                String str4 = dVar2.field_fileUrl;
                String str5 = d + "";
                C98394e0.C98396b bVar = vx02.f288469d.get(str5);
                if (bVar == null) {
                    bVar = new C98394e0.C98396b(vx02);
                }
                bVar.f288478d = "";
                bVar.f288477c = "";
                bVar.f288475a = "";
                bVar.f288482h = i3;
                bVar.f288481g = 1;
                bVar.f288480f = dVar2;
                bVar.f288483i = Util.nowMilliSecond();
                vx02.f288469d.put(str5, bVar);
                Log.m105925i("MicroMsg.SubCoreMediaRpt", "note sns video sendScene %d snsKey[%s] url[%s]", Integer.valueOf(i3), str5, str4);
                C95003w.m120753a(C94971y0.m120639d(C94971y0.this), 0, 0);
                ((C94928p2.C94932d) C94971y0.m120640e(C94971y0.this)).mo131212a(true, C94971y0.this);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            } else if (dVar2 != null && dVar2.field_retCode != 0) {
                C94971y0.m120638c(C94971y0.this);
                Log.m105925i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, Integer.valueOf(i), cVar, dVar2);
                C94971y0 y0Var3 = C94971y0.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                y0Var3.mo131301h(0);
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                C95003w.m120753a(C94971y0.m120639d(C94971y0.this), 3, -1);
                ((C94928p2.C94932d) C94971y0.m120640e(C94971y0.this)).mo131212a(false, C94971y0.this);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            } else if (i2 != 0) {
                C94971y0.m120638c(C94971y0.this);
                Log.m105925i("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, Integer.valueOf(i), cVar, dVar2);
                C94971y0 y0Var4 = C94971y0.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                y0Var4.mo131301h(0);
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                C95003w.m120753a(C94971y0.m120639d(C94971y0.this), 3, -1);
                ((C94928p2.C94932d) C94971y0.m120640e(C94971y0.this)).mo131212a(false, C94971y0.this);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            } else {
                C94971y0.m120638c(C94971y0.this);
                Log.m105919d("MicroMsg.SightCdnUpload", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", null, Integer.valueOf(i), cVar, dVar2);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            SnsMethodCalculate.markStartTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            SnsMethodCalculate.markEndTimeMs("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            SnsMethodCalculate.markStartTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            SnsMethodCalculate.markEndTimeMs("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.SightCdnUpload$4");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.y0$b */
    public interface C94973b {
    }

    public C94971y0(int i, C100406i0 i0Var, String str, String str2, C94973b bVar) {
        System.currentTimeMillis();
        this.f275324a = str;
        this.f275325b = str2;
        this.f275328e = bVar;
        this.f275327d = i;
        this.f275326c = i0Var;
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(i0Var.mo139854h());
            this.f275332i = nv22;
            String str3 = nv22.f298922p;
            this.f275329f = str3;
            this.f275331h = nv22.f298929w;
            if (Util.isNullOrNil(str3)) {
                String f = C90193h.m112878f(("" + Util.currentTicks()).getBytes());
                this.f275329f = f;
                C101821nv2 nv23 = this.f275332i;
                nv23.f298922p = f;
                try {
                    i0Var.mo139858l(nv23.toByteArray());
                    C94866e1.ay0().r50(i0Var.mo139849c(), i0Var);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SightCdnUpload", e, "", new Object[0]);
                }
            }
            Log.m105925i("MicroMsg.SightCdnUpload", "sightupload %d videopath %s sightFileSize %d md5 %s", Integer.valueOf(i), str, Integer.valueOf((int) C86013q1.m106451l(str)), this.f275331h);
            C95003w.m120755c(this.f275327d);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
        }
    }

    /* renamed from: a */
    public static void m120636a(C94971y0 y0Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        y0Var.getClass();
        SnsMethodCalculate.markStartTimeMs("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        try {
            y0Var.f275332i = (C101821nv2) new C101821nv2().parseFrom(y0Var.f275326c.mo139854h());
            String q = C86013q1.m106456q(y0Var.f275324a);
            y0Var.f275331h = q;
            C101821nv2 nv22 = y0Var.f275332i;
            nv22.f298929w = q;
            y0Var.f275326c.mo139858l(nv22.toByteArray());
            Log.m105925i("MicroMsg.SightCdnUpload", "new md5 is %s %s", y0Var.f275324a, y0Var.f275331h);
            C94866e1.ay0().r50(y0Var.f275326c.mo139849c(), y0Var.f275326c);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in updateMd5Info %s", e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("updateMd5Info", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }

    /* renamed from: b */
    public static /* synthetic */ C100406i0 m120637b(C94971y0 y0Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        C100406i0 i0Var = y0Var.f275326c;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return i0Var;
    }

    /* renamed from: c */
    public static /* synthetic */ String m120638c(C94971y0 y0Var) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        y0Var.getClass();
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return null;
    }

    /* renamed from: d */
    public static /* synthetic */ int m120639d(C94971y0 y0Var) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        int i = y0Var.f275327d;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ C94973b m120640e(C94971y0 y0Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        C94973b bVar = y0Var.f275328e;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        return bVar;
    }

    /* renamed from: f */
    public final boolean mo131299f(C101783gu2 gu22, String str) {
        C101783gu2 gu23 = gu22;
        SnsMethodCalculate.markStartTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        if (this.f275330g == 0) {
            this.f275330g = Util.nowMilliSecond();
        }
        String str2 = this.f275329f;
        if (Util.isNullOrNil(str2)) {
            Log.m105928w("MicroMsg.SightCdnUpload", "cdntra genClientId failed not use cdn");
            SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        }
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_NetSceneSnsUpload_2";
        gVar.f287662f = this.f275334k;
        gVar.field_mediaId = str2;
        gVar.field_fullpath = this.f275324a;
        gVar.field_thumbpath = this.f275325b;
        gVar.field_fileType = 20202;
        gVar.field_talker = "";
        gVar.field_priority = 2;
        gVar.field_needStorage = true;
        gVar.field_isStreamMedia = false;
        gVar.field_appType = 102;
        gVar.field_bzScene = 1;
        if (!Util.isNullOrNil(str)) {
            gVar.field_largesvideo = MultiProcessMMKV.getSingleMMKV("OpenSdkVideoTime").decodeInt(str, 10);
        } else if (gu23.f298317p) {
            gVar.field_largesvideo = C102609h.Fx0().xx0(C102609h.Fx0().Hx0());
        } else {
            gVar.field_largesvideo = C102609h.Fx0().xx0(gu23.f298309e ? C102609h.Fx0().mo142239cw() : C102609h.Fx0().Gx0());
        }
        String str3 = this.f275324a;
        long l = C86013q1.m106451l(str3);
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_sns_100_video, true);
        Log.m105925i("MicroMsg.VideoUploadConfig", "SNS send big file:%s size:%s enable:%s", str3, Long.valueOf(l), Boolean.valueOf(wf));
        if (l >= 25165824 && wf) {
            C115669n.INSTANCE.idkeyStat(106, 31, 1, false);
        }
        String q = C86013q1.m106456q(this.f275324a);
        if (!Util.isNullOrNil(this.f275331h) && !this.f275331h.equals(q)) {
            Log.m105925i("MicroMsg.SightCdnUpload", "isNotSafeSightVideo old srcmd5 %s newmd5 %s ", this.f275331h, q);
            mo131301h(-2);
            ((C94928p2.C94932d) this.f275328e).mo131212a(false, this);
            SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        } else if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar)) {
            Log.m105921e("MicroMsg.SightCdnUpload", "cdntra addSendTask failed. clientid:%s", str2);
            SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return false;
        } else {
            this.f275333j = (gu23 == null || !gu23.f298309e) ? 5 : 4;
            SnsMethodCalculate.markEndTimeMs("doupload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
            return true;
        }
    }

    /* renamed from: g */
    public final void mo131300g() {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        Log.m105924i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) this.f275327d);
        LL.mo139855i(0);
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
            nv22.f298922p = "";
            C101783gu2 gu22 = nv22.f298911B;
            if (gu22 != null) {
                gu22.f298310f = 0;
            }
            LL.mo139858l(nv22.toByteArray());
            C94866e1.ay0().r50(this.f275327d, LL);
            C94866e1.Rx0().mo130965x(this.f275327d);
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.SightCdnUpload", "parseFrom MediaUploadInfo error in NetSceneSnsUpload");
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        }
    }

    /* renamed from: h */
    public final void mo131301h(int i) {
        SnsMethodCalculate.markStartTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
        Log.m105924i("MicroMsg.SightCdnUpload", "snsupload sight by cdn error!");
        C100406i0 LL = C94866e1.ay0().mo139867LL((long) this.f275327d);
        try {
            C101821nv2 nv22 = (C101821nv2) new C101821nv2().parseFrom(LL.mo139854h());
            nv22.f298920n = 1;
            nv22.f298925s = i;
            C101783gu2 gu22 = this.f275332i.f298911B;
            if (gu22 != null) {
                gu22.f298310f = 0;
            }
            LL.mo139858l(nv22.toByteArray());
        } catch (Exception unused) {
        }
        C94866e1.Rx0().mo130965x(this.f275327d);
        C94866e1.ay0().r50(this.f275327d, LL);
        SnsMethodCalculate.markEndTimeMs("onErrorServer", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
    }
}
