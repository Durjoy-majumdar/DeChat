package p647po;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92779i0;
import com.tencent.p014mm.modelcdntran.C92796u;
import com.tencent.p014mm.modelcdntran.CdnTransportService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import sf0.C90188n0;

@C86522b
/* renamed from: po.i */
public class C100832i extends C86301e implements C101213l {
    /* renamed from: CA */
    public HashSet<String> mo140297CA() {
        return C92779i0.Ex0().f266896t;
    }

    public boolean Gm0(String str) {
        C92779i0.Ex0().mo126953i(str);
        return true;
    }

    /* renamed from: Lh */
    public boolean mo140299Lh(String str, C98121d dVar) {
        int i;
        CdnTransportService Ex0 = C92779i0.Ex0();
        C98124g gVar = (C98124g) ((ConcurrentHashMap) Ex0.f266894r).remove(str);
        if (gVar != null) {
            i = C92779i0.Dx0().mo127052u(str, dVar);
            C117407d.INSTANCE.mo160131h(10769, -10002, Integer.valueOf(gVar.field_fileType), Long.valueOf(Util.nowMilliSecond() - gVar.field_startTime));
        } else {
            i = 0;
        }
        ((HashMap) Ex0.f266893q).remove(str);
        ((HashMap) Ex0.f266895s).remove(str);
        Log.m105925i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", str, gVar, Integer.valueOf(i));
        return true;
    }

    /* renamed from: Og */
    public long mo140300Og() {
        return C92796u.f267112v;
    }

    public boolean R30(C98124g gVar) {
        CdnTransportService Ex0 = C92779i0.Ex0();
        Ex0.getClass();
        if (gVar == null) {
            Log.m105920e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
            return false;
        } else if (Util.isNullOrNil(gVar.field_mediaId)) {
            Log.m105920e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
            return false;
        } else {
            if (gVar.field_fileId == null) {
                gVar.field_fileId = "";
            }
            if (gVar.field_aesKey == null) {
                gVar.field_aesKey = "";
            }
            gVar.f287661e = false;
            Log.m105925i("MicroMsg.CdnTransportService", "CdnTransportService cdn thread run %s", gVar.field_mediaId);
            ((LinkedList) Ex0.f266892p).add(gVar.field_mediaId);
            ((HashMap) Ex0.f266893q).put(gVar.field_mediaId, gVar);
            Ex0.mo126958p(false);
            return true;
        }
    }

    public void Xk0() {
        C92779i0.Ex0().mo126950c();
    }

    /* renamed from: db */
    public int mo140303db(CdnLogic.CheckHitFileInfo[] checkHitFileInfoArr, CdnLogic.UploadCallback uploadCallback) {
        C92779i0.Dx0().getClass();
        CdnLogic.C2CUploadRequest c2CUploadRequest = new CdnLogic.C2CUploadRequest();
        c2CUploadRequest.batchCheckHitFiles = checkHitFileInfoArr;
        if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
            c2CUploadRequest.debugIP = C90188n0.f258911E;
            Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + c2CUploadRequest.debugIP);
        }
        return CdnLogic.startBatchCheckHitUpload(c2CUploadRequest, uploadCallback);
    }

    public boolean dm0(int i) {
        return C92779i0.Ex0().mo126959q(i);
    }

    /* renamed from: fF */
    public int mo140305fF() {
        int i;
        C92796u Dx0 = C92779i0.Dx0();
        synchronized (Dx0.f267122o) {
            i = Dx0.f267123p;
        }
        return i;
    }

    public boolean gn0(String str) {
        C92779i0.Ex0().mo126954k(str);
        return true;
    }

    public boolean if0(C98124g gVar) {
        return C92779i0.Ex0().mo126952f(gVar);
    }

    public boolean xf0(C98124g gVar) {
        return C92779i0.Ex0().mo126951e(gVar, -1);
    }
}
