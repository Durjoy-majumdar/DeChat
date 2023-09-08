package p647po;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92796u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import ei3.C86522b;
import p1081gi.C98119b;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p663qo.C101210g;
import p663qo.C101211h;
import sf0.C90188n0;
import te3.C101795jm;

@C86522b
/* renamed from: po.a */
public class C100828a extends C86301e implements C101211h, C101210g {
    /* renamed from: B2 */
    public void mo140274B2(C98119b bVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.f267128u = bVar;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(Dx0.hashCode());
        if (bVar != null) {
            i = bVar.hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.CdnTransportEngine", "mmPlayerPreloadCallback hash[%d] cdnTransCallback[%d]", objArr);
    }

    /* renamed from: Gl */
    public boolean mo140275Gl() {
        return C92779i0.Dx0().f267114d == null;
    }

    /* renamed from: It */
    public boolean mo140276It() {
        int i;
        C92796u Dx0 = C92779i0.Dx0();
        synchronized (Dx0.f267122o) {
            i = Dx0.f267123p;
        }
        return i == 0;
    }

    /* renamed from: K1 */
    public void mo140277K1(C101211h.C101212a aVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.f267127t = aVar;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(Dx0.hashCode());
        if (aVar != null) {
            i = aVar.hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.CdnTransportEngine", "setMMPlayerDownloaderCallback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public void Nw0(C101211h.C101212a aVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.f267125r = aVar;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(Dx0.hashCode());
        if (aVar != null) {
            i = aVar.hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    public boolean Pi0(C101795jm jmVar, C101795jm jmVar2, C101795jm jmVar3, byte[] bArr, byte[] bArr2, C101795jm jmVar4) {
        return C92779i0.Dx0().mo127022f(jmVar, jmVar2, jmVar3, bArr, bArr2, jmVar4);
    }

    public int Xi0(C98127h hVar) {
        return C92779i0.Dx0().mo127025h(hVar);
    }

    /* renamed from: YZ */
    public int mo140281YZ(C98127h hVar) {
        return C92779i0.Dx0().mo127028k(hVar);
    }

    /* renamed from: Yg */
    public int mo140282Yg(C98124g gVar, int i) {
        return C92779i0.Dx0().mo127048q(gVar, i);
    }

    public int Yr0(C98127h hVar) {
        return C92779i0.Dx0().mo127027j(hVar);
    }

    /* renamed from: ZJ */
    public boolean mo140284ZJ(String str, long j, long j2) {
        C92779i0.Dx0().getClass();
        return CdnLogic.isVideoDataAvailable(str, j, j2);
    }

    public String aw0() {
        return C92779i0.Dx0().f267120j;
    }

    /* renamed from: bm */
    public int mo140286bm(String str, long j, long j2, int i) {
        C92779i0.Dx0().getClass();
        return CdnLogic.requestVideoData(str, j, j2, i);
    }

    public int cd0(C98127h hVar) {
        return C92779i0.Dx0().mo127045n(hVar);
    }

    /* renamed from: dC */
    public int mo140288dC(String str) {
        C92779i0.Dx0().getClass();
        return CdnLogic.calcFileCrc32(C86013q1.m106448i(str, false));
    }

    /* renamed from: dT */
    public void mo140289dT(C101211h.C101212a aVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.f267126s = aVar;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(Dx0.hashCode());
        if (aVar != null) {
            i = aVar.hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.CdnTransportEngine", "set cdn online video callback hash[%d] onlineVideoCallback[%d]", objArr);
    }

    /* renamed from: dp */
    public int mo140290dp(C98127h hVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.getClass();
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAdVideo;
        c2CDownloadRequest.concurrentCount = 10;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startHttpVideoStreamingDownload(c2CDownloadRequest, Dx0, Dx0, hVar.f287689V);
    }

    /* renamed from: f8 */
    public boolean mo140291f8() {
        return C92779i0.Dx0().f267126s == null;
    }

    /* renamed from: k7 */
    public String mo140292k7(String str) {
        C92779i0.Dx0().getClass();
        return CdnLogic.calcMP4IdentifyMD5(C86013q1.m106448i(str, false));
    }

    /* renamed from: rN */
    public String mo140293rN() {
        C92779i0.Dx0().getClass();
        return CdnLogic.createAeskey();
    }

    /* renamed from: xR */
    public int mo140294xR(C98127h hVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.getClass();
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.fileType = CdnLogic.kMediaTypeAdVideo;
        c2CDownloadRequest.fileKey = hVar.field_mediaId;
        c2CDownloadRequest.url = hVar.f287705p0;
        c2CDownloadRequest.referer = hVar.f287706x0;
        c2CDownloadRequest.setSavePath(hVar.field_fullpath);
        c2CDownloadRequest.isColdSnsData = hVar.f287684S0;
        c2CDownloadRequest.isHotSnsVideo = hVar.f287665i;
        c2CDownloadRequest.isHLSVideo = false;
        c2CDownloadRequest.hlsVideoFlag = hVar.f287666j;
        c2CDownloadRequest.signalQuality = hVar.f287686T0;
        c2CDownloadRequest.snsScene = hVar.f287688U0;
        c2CDownloadRequest.preloadRatio = hVar.field_preloadRatio;
        c2CDownloadRequest.preloadMinSize = hVar.f287671r;
        c2CDownloadRequest.requestVideoFormat = hVar.field_requestVideoFormat;
        c2CDownloadRequest.connectionCount = hVar.f287657N;
        c2CDownloadRequest.concurrentCount = hVar.f287696Y0;
        c2CDownloadRequest.downloadBehavior = hVar.f287664h;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CDownloadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CDownloadRequest.debugIP);
        }
        return CdnLogic.startSNSDownload(c2CDownloadRequest, Dx0, Dx0, hVar.f287689V);
    }

    public void y10(C98119b bVar) {
        C92796u Dx0 = C92779i0.Dx0();
        Dx0.f267115e = bVar;
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = Integer.valueOf(Dx0.hashCode());
        if (bVar != null) {
            i = bVar.hashCode();
        }
        objArr[1] = Integer.valueOf(i);
        Log.m105925i("MicroMsg.CdnTransportEngine", "set tp player cdn callback hash[%d] cdnTransCallback[%d]", objArr);
    }

    /* renamed from: yY */
    public int mo140296yY(String str, C98121d dVar) {
        return C92779i0.Dx0().mo127052u(str, dVar);
    }
}
