package com.tencent.p014mm.modelcdntran;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92738a;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C87412m;
import h81.C32735h;
import p1081gi.C98122e;
import p1081gi.C98123f;
import p1081gi.C98124g;
import p663qo.C101213l;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.modelcdntran.d */
public final /* synthetic */ class C92752d extends C24565l implements C32226l<C92738a.C92739a, Integer> {
    public C92752d(Object obj) {
        super(1, obj, C92738a.class, "doStart", "doStart(Lcom/tencent/mm/modelcdntran/CdnFSC$RunningObj;)I", 0);
    }

    public Object invoke(Object obj) {
        int i;
        C92738a.C92739a aVar = (C92738a.C92739a) obj;
        C87412m.m108594g(aVar, "p0");
        ((C92738a) this.receiver).getClass();
        ((C101213l) C86312j.m106911c(C101213l.class)).Xk0();
        C98124g gVar = aVar.f266935a;
        int i2 = gVar.field_fileType;
        if (i2 == 40001) {
            i = C92779i0.Dx0().mo127047p(gVar.field_mediaId, gVar.f287672s, gVar.field_fullpath, gVar.field_fileType, gVar.field_aesKey, gVar.field_authKey, gVar.field_totalLen, false);
        } else if (i2 == 19) {
            i = C92779i0.Dx0().mo127047p(gVar.field_mediaId, gVar.f287672s, gVar.field_fullpath, gVar.field_fileType, gVar.field_aesKey, gVar.field_authKey, gVar.field_totalLen, ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enterprise_file_download_use_cronet, false));
        } else if (i2 == 30001 || i2 == 30003 || i2 == 31000) {
            i = C92779i0.Dx0().mo127046o(gVar.field_mediaId, gVar.f287672s, gVar.field_fullpath, gVar.field_fileType, gVar.f287673t, gVar.f287674u, (String[]) null, gVar.f287675v, false, false, gVar.f287652I);
        } else if (gVar.f287677x) {
            i = C92779i0.Dx0().mo127026i(gVar.field_mediaId, gVar.field_fullpath, gVar.f287672s, gVar.f287644A, gVar.f287645B, gVar.f287678y, gVar.f287673t, gVar.f287674u, gVar.f287679z, gVar.f287676w, (String[]) null);
        } else if (gVar.f287646C) {
            i = gVar instanceof C98122e ? C92779i0.Dx0().mo127043l((C98122e) gVar) : gVar instanceof C98123f ? C92779i0.Dx0().mo127044m((C98123f) gVar) : -1;
        } else if (gVar.f287663g != 3 || gVar.f287661e) {
            i = gVar.f287661e ? C92779i0.Dx0().mo127050s(gVar) : C92779i0.Dx0().mo127049r(gVar);
        } else {
            C92796u Dx0 = C92779i0.Dx0();
            Dx0.getClass();
            Log.m105925i("MicroMsg.CdnTransportEngine", "startDownload: biz:%d, mediaid:%s, savepath:%s", Integer.valueOf(gVar.f287663g), gVar.field_mediaId, gVar.field_fullpath);
            CdnLogic.C2CDownloadRequest b = Dx0.mo127018b(gVar);
            if (C90188n0.f258910D && C90188n0.f258911E.length() > 0) {
                b.debugIP = C90188n0.f258911E;
                Log.m105928w("MicroMsg.CdnTransportEngine", "debugip " + b.debugIP);
            }
            int i3 = b.bizid;
            if (i3 != -3) {
                if (!(i3 == 1 || i3 == 2)) {
                    if (!(i3 == 3 || i3 == 4)) {
                        if (i3 != 5) {
                            i = CdnLogic.startURLDownload(b, Dx0);
                        }
                    }
                }
                i = CdnLogic.startC2CDownload(b, Dx0);
            }
            i = CdnLogic.startSNSDownload(b, Dx0, Dx0, 0);
        }
        return Integer.valueOf(i);
    }
}
