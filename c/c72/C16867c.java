package c72;

import b72.C16752a;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.ExportErrorStatus;
import di3.C86312j;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p501dz.C58465g;
import sx3.C110818d0;
import t62.C22438a;
import te3.C64755uo;
import u62.C22583d;
import u62.C22595e;
import z62.C66735c;

/* renamed from: c72.c */
public final class C16867c extends C16752a implements C98127h.C98128a, C98124g.C98125a {

    /* renamed from: p */
    public final C22583d.C22586c f45589p;

    /* renamed from: q */
    public AtomicBoolean f45590q = new AtomicBoolean(false);

    /* renamed from: r */
    public boolean f45591r;

    /* renamed from: s */
    public C16868a f45592s;

    /* renamed from: t */
    public C16866b f45593t;

    /* renamed from: u */
    public C98121d f45594u;

    /* renamed from: c72.c$a */
    public static final class C16868a {

        /* renamed from: a */
        public final long f45595a;

        /* renamed from: b */
        public final long f45596b;

        public C16868a(long j, long j2) {
            this.f45595a = j;
            this.f45596b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16868a)) {
                return false;
            }
            C16868a aVar = (C16868a) obj;
            return this.f45595a == aVar.f45595a && this.f45596b == aVar.f45596b;
        }

        public int hashCode() {
            long j = this.f45595a;
            long j2 = this.f45596b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "RePlayOnMoovReady(offset=" + this.f45595a + ", length=" + this.f45596b + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16867c(C22595e eVar, C66735c cVar, C22583d.C22586c cVar2) {
        super(eVar, cVar);
        C87412m.m108594g(eVar, "onePlayContext");
        C87412m.m108594g(cVar, "mediaSource");
        this.f45589p = cVar2;
        this.f45274f = "MMMarsDownloaderTask";
    }

    /* renamed from: e */
    public void mo17917e(String str, long j, long j2) {
        C87412m.m108594g(str, "mediaId");
        String c = mo17757c();
        Log.m105924i(c, "onProgress start offset=" + j + " total=" + j2 + ' ' + this);
        this.f45278j.mo22526i(j, j2, 1);
        C22583d.C22586c cVar = this.f45589p;
        if (cVar != null) {
            cVar.mo24025v(this.f45273e, (int) j, (int) j2);
        }
        String c2 = mo17757c();
        Log.m105924i(c2, "onProgress end offset=" + j + " total=" + j2 + ' ' + this);
    }

    /* renamed from: f */
    public boolean mo17759f(C98127h hVar) {
        int i;
        C16868a aVar;
        C87412m.m108594g(hVar, "task");
        if (!this.f45272d.mo22573V2().mo17764b(this)) {
            String c = mo17757c();
            Log.m105928w(c, "startDownloadInternal failed for submitTask task:" + hVar);
            return false;
        }
        hVar.f287704f1 = this;
        this.f45593t = this.f45272d.mo22574f();
        List<C16752a> c2 = this.f45272d.mo22573V2().mo17765c(this.f45275g);
        ArrayList arrayList = new ArrayList();
        for (T next : c2) {
            if (true ^ C87412m.m108589b(((C16752a) next).f45276h, this.f45276h)) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                if (next2 instanceof C16867c) {
                    arrayList2.add(next2);
                }
            }
            C16867c cVar = (C16867c) C110818d0.m150914L(arrayList2);
            String c3 = mo17757c();
            Log.m105924i(c3, "syncDownloadTaskState source:" + this + " x[isMoovReady:" + this.f45591r + " taskState:" + this.f45277i + "] to target:" + cVar + " x[isMoovReady:" + cVar.f45591r + " taskState:" + cVar.f45277i + ']');
            boolean z = cVar.f45591r;
            if (z && !this.f45591r && (aVar = cVar.f45592s) != null) {
                this.f45592s = aVar;
            }
            this.f45591r = z;
            C16752a.C16753a aVar2 = cVar.f45277i;
            C87412m.m108594g(aVar2, "<set-?>");
            this.f45277i = aVar2;
            this.f45590q = cVar.f45590q;
            if (this.f45592s != null) {
                String c4 = mo17757c();
                StringBuilder sb = new StringBuilder();
                sb.append("onMoovReady rePlay offset=");
                C16868a aVar3 = this.f45592s;
                C87412m.m108591d(aVar3);
                sb.append(aVar3.f45595a);
                sb.append(" length=");
                C16868a aVar4 = this.f45592s;
                C87412m.m108591d(aVar4);
                sb.append(aVar4.f45596b);
                sb.append(' ');
                sb.append(this);
                Log.m105924i(c4, sb.toString());
                C22583d.C22586c cVar2 = this.f45589p;
                if (cVar2 != null) {
                    C66735c cVar3 = this.f45273e;
                    C16868a aVar5 = this.f45592s;
                    C87412m.m108591d(aVar5);
                    int i2 = (int) aVar5.f45595a;
                    C16868a aVar6 = this.f45592s;
                    C87412m.m108591d(aVar6);
                    cVar2.mo24024t(cVar3, i2, (int) aVar6.f45596b, false);
                }
            }
            String c5 = mo17757c();
            Log.m105924i(c5, "startDownloadInternal sync task:" + this + " list:" + arrayList);
        } else {
            int i3 = ExportErrorStatus.APPEND_VIDEO_SAMPLE_MAKE_CURRENT;
            C16866b bVar = this.f45593t;
            if (bVar != null) {
                C87412m.m108591d(bVar);
                i3 = bVar.mo17914c(hVar, hVar.f287689V);
            }
            if (i == -21006) {
                String c6 = mo17757c();
                Log.m105928w(c6, "startDownloadInternal duplicate download ret:" + i + " task:" + hVar);
                mo17761k();
                i = -1111;
                C16866b bVar2 = this.f45593t;
                if (bVar2 != null) {
                    C87412m.m108591d(bVar2);
                    i = bVar2.mo17914c(hVar, hVar.f287689V);
                }
                this.f45272d.mo22573V2().mo17764b(this);
            }
            if (i != 0) {
                String c7 = mo17757c();
                Log.m105924i(c7, "startDownloadInternal failed ret:" + i + " task:" + hVar);
                return false;
            }
        }
        C22583d.C22586c cVar4 = this.f45589p;
        if (cVar4 != null) {
            cVar4.mo24016g(this.f45273e);
        }
        String c8 = mo17757c();
        Log.m105924i(c8, "startDownloadInternal success task:" + hVar);
        return true;
    }

    /* renamed from: g */
    public void mo17918g(String str, int i, C98121d dVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(dVar, "sceneResult");
        String c = mo17757c();
        Log.m105924i(c, "onFinish mediaId=" + str + " ret=" + i + " recvBytes=" + dVar.field_recvedBytes + " fileLength=" + dVar.field_fileLength + " format:" + dVar.field_videoFormat);
        if (i != 0) {
            mo17756a(C16752a.C16753a.FAILED);
            this.f45278j.mo22525h(i);
        } else {
            this.f45594u = dVar;
            mo17756a(C16752a.C16753a.SUCCESS);
            C22438a aVar = this.f45278j;
            long j = dVar.field_fileLength;
            aVar.mo22526i(j, j, 3);
        }
        this.f45272d.mo22573V2().mo17766d(this);
        C98127h hVar = this.f45273e.f191770c;
        if (hVar.f287702d1 && dVar.field_retCode == 0) {
            C64755uo uoVar = new C64755uo();
            uoVar.f185780d = hVar.field_fullpath;
            uoVar.f185781e = dVar.field_fileLength;
            ((C58465g) C86312j.m106911c(C58465g.class)).mo82806zg(mo17757c(), hVar.field_mediaId, uoVar);
        }
        C22583d.C22586c cVar = this.f45589p;
        if (cVar != null) {
            cVar.mo24015e(this.f45273e, i, dVar);
        }
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        C87412m.m108594g(str, "mediaId");
        String c = mo17757c();
        StringBuilder sb = new StringBuilder();
        sb.append("downloaderOnStart mediaId=");
        sb.append(str);
        sb.append(" startRet=");
        sb.append(i);
        sb.append(" finishedLength=");
        sb.append(cVar != null ? Long.valueOf(cVar.field_finishedLength) : null);
        sb.append(" fileFormat=");
        sb.append(dVar != null ? dVar.field_videoFlag : null);
        sb.append(' ');
        sb.append(this);
        Log.m105924i(c, sb.toString());
        if (cVar != null) {
            if (!(i == 0 && cVar.field_finishedLength > 0)) {
                cVar = null;
            }
            if (cVar != null) {
                long j = cVar.field_finishedLength;
                long j2 = cVar.field_toltalLength;
                this.f45278j.mo22526i(j, j2, j >= j2 ? 3 : 1);
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }

    /* renamed from: k */
    public void mo17761k() {
        C98121d dVar;
        this.f45272d.mo22573V2().mo17766d(this);
        int i = 0;
        C98121d dVar2 = new C98121d();
        List<C16752a> c = this.f45272d.mo22573V2().mo17765c(this.f45275g);
        if (c.isEmpty()) {
            C16866b bVar = this.f45593t;
            i = bVar != null ? bVar.mo17915d(this.f45275g, dVar2) : ExportErrorStatus.RENDER_SAMPLE_BUFFER;
            String c2 = mo17757c();
            Log.m105924i(c2, "stopDownloadInternal real stop ret:" + i + " taskId:" + this.f45276h);
        } else {
            String c3 = mo17757c();
            Log.m105924i(c3, "stopDownloadInternal fake stop ret:" + 0 + " taskId:" + this.f45276h + " list:" + c);
        }
        if (!(i == 0 || (dVar = this.f45594u) == null || this.f45277i != C16752a.C16753a.SUCCESS)) {
            C87412m.m108591d(dVar);
            dVar2 = dVar;
        }
        C22583d.C22586c cVar = this.f45589p;
        if (cVar != null) {
            C66735c cVar2 = this.f45273e;
            cVar.mo24022r(cVar2, cVar2.f191770c, dVar2);
        }
    }

    /* renamed from: l */
    public final void mo17919l(boolean z) {
        String c = mo17757c();
        Log.m105924i(c, "updateRequestingData " + z + ' ' + this);
        this.f45590q.set(z);
    }

    public void onDataAvailable(String str, long j, long j2) {
        C87412m.m108594g(str, "mediaId");
        mo17919l(false);
        C22583d.C22586c cVar = this.f45589p;
        if (cVar != null) {
            cVar.mo24023s(this.f45273e, (int) j, (int) j2);
        }
        String c = mo17757c();
        Log.m105924i(c, "onDataAvailable offset=" + j + " length=" + j2 + ' ' + this + '}');
    }

    public void onM3U8Ready(String str, String str2) {
        C87412m.m108594g(str, "mediaId");
        String c = mo17757c();
        Log.m105924i(c, "mediaId:" + str + " m3u8:" + str2);
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        String str2 = videoInfo != null ? videoInfo.svrFlag : null;
        if (str2 == null) {
            str2 = "";
        }
        String c = mo17757c();
        Log.m105924i(c, "onMoovReady start offset=" + j + " length=" + j2 + " svrflag=" + str2 + ' ' + this);
        this.f45592s = new C16868a(j, j2);
        this.f45272d.mo35699c();
        boolean e = this.f45278j.mo22521e() ^ true;
        this.f45278j.mo22522f();
        this.f45278j.mo22520d(str2);
        C22583d.C22586c cVar = this.f45589p;
        if (cVar != null) {
            cVar.mo24024t(this.f45273e, (int) j, (int) j2, e);
        }
        String c2 = mo17757c();
        Log.m105924i(c2, "onMoovReady end offset=" + j + " length=" + j2 + " svrflag=" + str2 + ' ' + this);
    }

    public void run() {
    }
}
