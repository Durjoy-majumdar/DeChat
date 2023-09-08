package d72;

import b72.C16752a;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import iy3.C60641c;
import java.io.ByteArrayOutputStream;
import java.util.List;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p663qo.C101211h;
import rx3.C13598b0;
import t62.C22438a;

/* renamed from: d72.a */
public final class C20446a extends C16752a implements C98124g.C98125a, C98124g.C98126b {
    /* renamed from: b */
    public void mo31987b(String str, C98121d dVar) {
        C13598b0 b0Var;
        C87412m.m108594g(str, "mediaId");
        if (dVar != null && dVar.field_retCode == -21112) {
            mo31989m(str);
        } else if (dVar == null) {
            Log.m105920e(mo17757c(), "onPreloadCompleted sceneResult == null");
            mo31988l(str, "onPreloadCompleted sceneResult null");
        } else {
            long[] jArr = new long[3];
            CdnLogic.queryDownloadedSize(str, jArr);
            long j = jArr[0];
            long j2 = dVar.field_recvedBytes;
            if (j < j2) {
                j = j2;
            }
            long j3 = dVar.field_fileLength;
            if (j <= 0 || j3 <= 0) {
                mo31988l(str, "start ret:$");
                String c = mo17757c();
                Log.m105920e(c, "onPreloadCompleted ERROR! mediaId=" + str + " recvedBytes=" + j + " fileLength=" + j3 + " fileFormat=" + dVar.field_videoFlag + " videoFormat=" + dVar.field_videoFormat);
                return;
            }
            this.f45278j.mo22526i(j, j3, j3 <= j ? 3 : 2);
            this.f45278j.mo22523g(dVar.field_videoFormat);
            String str2 = dVar.field_videoFlag;
            if (str2 != null) {
                this.f45278j.mo22520d(str2);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C22438a aVar = this.f45278j;
                String str3 = this.f45273e.f191770c.f287699a1;
                C87412m.m108593f(str3, "mediaSource.taskInfo.videoFlag");
                aVar.mo22520d(str3);
            }
            float f = (((float) j) * 100.0f) / ((float) j3);
            C60641c.m70921b(f);
            mo17756a(C16752a.C16753a.SUCCESS);
            this.f45272d.mo22573V2().mo17766d(this);
            String c2 = mo17757c();
            Log.m105924i(c2, "onPreloadCompleted successfully! mediaId=" + str + " receivedBytes=" + j + " fileLength=" + j3 + " result=" + ((int) f) + "% fileFormat=" + dVar.field_videoFlag + " videoFormat=" + dVar.field_videoFormat);
        }
    }

    /* renamed from: f */
    public boolean mo17759f(C98127h hVar) {
        Class cls = C101211h.class;
        C87412m.m108594g(hVar, "task");
        if (!this.f45272d.mo22573V2().mo17764b(this)) {
            String c = mo17757c();
            Log.m105928w(c, "startPreloadInternal failed for submitTask task:" + hVar);
            mo31988l(this.f45275g, "submitTask failed");
            return false;
        }
        C98127h hVar2 = this.f45273e.f191770c;
        hVar2.f287662f = this;
        hVar2.f287656M = this;
        int Xi0 = ((C101211h) C86312j.m106911c(cls)).Xi0(hVar);
        if (Xi0 == -21006) {
            String c2 = mo17757c();
            Log.m105928w(c2, "startPreloadInternal duplicate download ret:" + Xi0 + " task:" + hVar);
            mo17761k();
            Xi0 = ((C101211h) C86312j.m106911c(cls)).Xi0(hVar);
        }
        if (Xi0 != 0) {
            String c3 = mo17757c();
            Log.m105924i(c3, "startPreloadInternal failed ret:" + Xi0 + " task:" + hVar);
            String str = this.f45275g;
            StringBuilder sb = new StringBuilder();
            sb.append("start failed ret:");
            sb.append(Xi0);
            mo31988l(str, sb.toString());
            return false;
        }
        String c4 = mo17757c();
        Log.m105924i(c4, "startPreloadInternal success ret:" + Xi0 + " task:" + hVar);
        return true;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C13598b0 b0Var;
        String str2;
        C87412m.m108594g(str, "mediaId");
        if (dVar != null && dVar.field_retCode == -21112) {
            mo31989m(str);
            return -1;
        }
        if (cVar != null) {
            long j = cVar.field_toltalLength;
            if (j > 0) {
                long j2 = cVar.field_finishedLength;
                float f = (float) j2;
                float f2 = (float) j;
                int i2 = (int) ((f / f2) * ((float) 100));
                C98127h hVar = this.f45273e.f191770c;
                this.f45278j.mo22526i(j2, j, (i2 < hVar.f287692W0 || j2 >= j || hVar.f287671r > j2) ? j2 >= j ? 3 : 1 : 2);
                if (dVar == null || (str2 = dVar.field_videoFlag) == null) {
                    b0Var = null;
                } else {
                    this.f45278j.mo22520d(str2);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    C22438a aVar = this.f45278j;
                    String str3 = this.f45273e.f191770c.f287699a1;
                    C87412m.m108593f(str3, "mediaSource.taskInfo.videoFlag");
                    aVar.mo22520d(str3);
                }
                C60641c.m70921b((f * 100.0f) / f2);
                return 0;
            }
        }
        if (i != 0) {
            String c = mo17757c();
            Log.m105920e(c, "[VideoTaskCallTask] error! startRet=" + i + " mediaId=" + str);
            if (-21006 != i) {
                this.f45278j.mo22526i(0, 0, -1);
                mo31988l(str, "startRet:" + i);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }

    /* renamed from: k */
    public void mo17761k() {
        C98121d dVar = new C98121d();
        List<C16752a> a = this.f45272d.mo22573V2().mo17763a(this.f45275g);
        if (a.isEmpty()) {
            String c = mo17757c();
            Log.m105924i(c, "stopPreloadInternal fake stop taskId:" + this.f45276h + " list:" + a);
            return;
        }
        int yY = ((C101211h) C86312j.m106911c(C101211h.class)).mo140296yY(this.f45275g, dVar);
        String c2 = mo17757c();
        Log.m105924i(c2, "stopPreloadInternal real stop ret:" + yY + " taskId:" + this.f45276h);
        this.f45272d.mo22573V2().mo17766d(this);
    }

    /* renamed from: l */
    public final void mo31988l(String str, String str2) {
        mo17756a(C16752a.C16753a.FAILED);
        this.f45272d.mo22573V2().mo17766d(this);
    }

    /* renamed from: m */
    public final void mo31989m(String str) {
        String c = mo17757c();
        Log.m105920e(c, "onFormatChange delete mediaId=" + str);
        mo17760i();
        C86013q1.m106447h(this.f45278j.getFilePath());
        this.f45278j.mo22526i(0, 0, -2);
    }

    public void run() {
    }
}
