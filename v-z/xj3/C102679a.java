package xj3;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoPlayReportStruct;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.p136ui.chatting.gallery.C73703d;
import com.tencent.p014mm.p136ui.chatting.gallery.C97035b;
import com.tencent.p014mm.p136ui.chatting.gallery.C97039c;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.chatting.gallery.C97100o;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import e11.C97576e;
import e11.C97582g;
import eb0.C97625j3;
import ei3.C86522b;
import f03.C97787h;
import f40.C86709a0;
import hd0.C98408n0;
import hd0.C98442x0;
import jp3.C9486a;
import l03.C99277b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p682rz.C101491u;
import p749xh.C78817m;
import p775zi.C103032d;
import qg2.C77334n;
import qg2.C77335p;
import qg2.p$$e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xj3.a */
public class C102679a extends C86301e implements C103032d {

    /* renamed from: xj3.a$a */
    public class C102680a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ String f303289d;

        /* renamed from: e */
        public final /* synthetic */ C103032d.C103034b f303290e;

        public C102680a(C102679a aVar, String str, C103032d.C103034b bVar) {
            this.f303289d = str;
            this.f303290e = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "tryInitAttachInfo errType:%d errCode:%d, errMsg:%s type:%d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
            if (yVar.getType() == 728) {
                C77334n nVar = (C77334n) yVar;
                String str2 = this.f303289d;
                C72683d dVar = nVar.f225459f;
                String str3 = "";
                if (!str2.equals(dVar != null ? dVar.field_mediaSvrId : str3)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = this.f303289d;
                    C72683d dVar2 = nVar.f225459f;
                    if (dVar2 != null) {
                        str3 = dVar2.field_mediaSvrId;
                    }
                    objArr[1] = str3;
                    Log.m105929w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", objArr);
                    return;
                }
                C97625j3.m125815e().mo123470p(728, this);
                if (i == 0 && i2 == 0) {
                    C103032d.C103034b bVar = this.f303290e;
                    if (bVar != null) {
                        ((C97576e.C97577a) bVar).mo136845a(0, str3);
                        return;
                    }
                    return;
                }
                C103032d.C103034b bVar2 = this.f303290e;
                if (bVar2 != null) {
                    ((C97576e.C97577a) bVar2).mo136845a(i2, str);
                }
            }
        }
    }

    /* renamed from: xj3.a$b */
    public class C102681b implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ String f303291d;

        /* renamed from: e */
        public final /* synthetic */ C103032d.C103033a f303292e;

        /* renamed from: f */
        public final /* synthetic */ long f303293f;

        public C102681b(C102679a aVar, String str, C103032d.C103033a aVar2, long j) {
            this.f303291d = str;
            this.f303292e = aVar2;
            this.f303293f = j;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C103032d.C103033a aVar;
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect errType:%d errCode:%d, errMsg:%s type:%d", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
            if (yVar.getType() == 221) {
                C77335p pVar = (C77335p) yVar;
                if (!this.f303291d.equals(pVar.mo107462n1())) {
                    Log.m105929w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", this.f303291d, pVar.mo107462n1());
                    return;
                }
                C97625j3.m125815e().mo123470p(221, this);
                if (i == 0 && i2 == 0) {
                    int i3 = pVar.f225475s;
                    Log.m105925i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect retCode:%d", Integer.valueOf(i3));
                    if (i3 < 0 && (aVar = this.f303292e) != null) {
                        aVar.mo136846a(i3, "");
                        return;
                    }
                    return;
                }
                C72683d f = C72695v.m85064f(this.f303291d, this.f303293f);
                if (f == null || f.field_status != 102) {
                    C103032d.C103033a aVar2 = this.f303292e;
                    if (aVar2 != null) {
                        aVar2.mo136846a(-1, str);
                        return;
                    }
                    return;
                }
                C103032d.C103033a aVar3 = this.f303292e;
                if (aVar3 != null) {
                    aVar3.mo136846a(1, str);
                }
            }
        }
    }

    /* renamed from: xj3.a$c */
    public class C102682c implements C47355o {

        /* renamed from: d */
        public final /* synthetic */ C103032d.C103033a f303294d;

        public C102682c(C102679a aVar, C103032d.C103033a aVar2) {
            this.f303294d = aVar2;
        }

        /* renamed from: m */
        public void mo26221m(int i, int i2, C117747y yVar) {
            C103032d.C103033a aVar;
            C103032d.C103033a aVar2 = this.f303294d;
            if (aVar2 != null) {
                aVar2.mo136847b(i, i2, yVar);
            }
            if (i >= i2 && (aVar = this.f303294d) != null) {
                aVar.mo136846a(0, "");
            }
        }
    }

    /* renamed from: xj3.a$d */
    public class C102683d implements C9486a {

        /* renamed from: d */
        public final /* synthetic */ C77335p f303295d;

        public C102683d(C102679a aVar, C77335p pVar) {
            this.f303295d = pVar;
        }

        public void dead() {
            this.f303295d.mo107463o1((p$$e) null);
            C86709a0.m107524d().mo123458d(this.f303295d);
        }
    }

    /* renamed from: xj3.a$e */
    public class C102684e implements C72695v.C72701f {

        /* renamed from: a */
        public final /* synthetic */ C103032d.C103033a f303296a;

        public C102684e(C102679a aVar, C103032d.C103033a aVar2) {
            this.f303296a = aVar2;
        }

        /* renamed from: m */
        public void mo100168m(int i, int i2, C117747y yVar) {
            C103032d.C103033a aVar;
            C103032d.C103033a aVar2 = this.f303296a;
            if (aVar2 != null) {
                aVar2.mo136847b(i, i2, yVar);
            }
            if (i >= i2 && (aVar = this.f303296a) != null) {
                aVar.mo136846a(0, "");
            }
        }
    }

    /* renamed from: xj3.a$f */
    public class C102685f implements C97787h.C97791d {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f303297d;

        /* renamed from: e */
        public final /* synthetic */ C103032d.C103035c f303298e;

        public C102685f(C102679a aVar, C72963f4 f4Var, C103032d.C103035c cVar) {
            this.f303297d = f4Var;
            this.f303298e = cVar;
        }

        /* renamed from: a */
        public void mo135904a(Long l, long j, long j2) {
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onMoovReady, it's not origin video task, return");
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "onMoovReady msgId:%d", l);
        }

        /* renamed from: b */
        public void mo135905b(Long l, long j, long j2) {
            C103032d.C103035c cVar;
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onDownloadProgress, it's not origin video task, return");
            } else if (C73703d.f216412a.mo102767a(l.longValue()) == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
            } else if (l.longValue() == this.f303297d.getMsgId() && j2 > 0 && (cVar = this.f303298e) != null) {
                C97582g.this.mo136837b((int) j, (int) j2);
            }
        }

        /* renamed from: c */
        public void mo135906c(Long l) {
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onStartDownload, it's not origin video task, return");
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "onStartDownload msgId:%d", l);
        }

        /* renamed from: d */
        public void mo135907d(Long l, long j, long j2) {
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable, it's not origin video task, return");
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable msgId:%d", l);
        }

        /* renamed from: e */
        public void mo135908e(Long l, int i) {
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, it's not origin video task, return");
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload msgId:%d", l);
            CdnVideoResourceDownloader b = C73703d.f216412a.mo102768b(l.longValue());
            if (b == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
                return;
            }
            b.f282445j = null;
            C103032d.C103035c cVar = this.f303298e;
            if (cVar != null) {
                ((C97582g.C97583a) cVar).mo136851a(i, "", b.mo134538j());
            }
        }

        /* renamed from: f */
        public void mo135909f(Long l) {
            if (l == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onStopDownload, it's not origin video task, return");
                return;
            }
            Log.m105925i("MicroMsg.ChooseMsgFileCompat", "onStopDownload msgId:%d", l);
            CdnVideoResourceDownloader b = C73703d.f216412a.mo102768b(l.longValue());
            if (b == null) {
                Log.m105924i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
            } else {
                b.f282445j = null;
            }
        }
    }

    /* renamed from: CK */
    public void mo142486CK(C78817m mVar) {
        if (mVar != null) {
            mVar.field_status = 101;
            mVar.field_lastModifyTime = Util.nowSecond();
            C72709y1.vx0().update((C72683d) mVar, new String[0]);
        }
    }

    /* renamed from: Cq */
    public void mo142487Cq(C72963f4 f4Var, C103032d.C103035c cVar) {
        C98408n0 Zd = !C97056h.m124955K(f4Var) ? null : ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
        if (Zd == null) {
            Log.m105924i("MicroMsg.ChooseMsgFileCompat", "no video info for download origin video");
            return;
        }
        C98442x0 b = C98442x0.f288734i.mo137781b(Zd.mo137705i());
        if (b == null || Util.isNullOrNil(b.f288740d)) {
            Log.m105924i("MicroMsg.ChooseMsgFileCompat", "no origin video cdn url");
            return;
        }
        C97039c cVar2 = new C97039c(f4Var, Zd, new C99277b(Util.nowMilliSecond()), b);
        C97035b bVar = new C97035b(f4Var, Zd.mo137700d(), true);
        CdnVideoResourceDownloader cdnVideoResourceDownloader = new CdnVideoResourceDownloader(cVar2);
        cdnVideoResourceDownloader.mo134540m(bVar);
        cdnVideoResourceDownloader.f282445j = new C102685f(this, f4Var, cVar);
        boolean start = cdnVideoResourceDownloader.start();
        Log.m105925i("MicroMsg.ChooseMsgFileCompat", "downloadRawVideo msgId:%d start:%b", Long.valueOf(f4Var.getMsgId()), Boolean.valueOf(start));
        if (start) {
            C73703d dVar = C73703d.f216412a;
            C73703d.f216413b.put(Long.valueOf(f4Var.getMsgId()), cdnVideoResourceDownloader);
            new VideoPlayReportStruct();
            System.currentTimeMillis();
        } else if (cVar != null) {
            ((C97582g.C97583a) cVar).mo136851a(-1, "", "");
        }
    }

    /* renamed from: Cs */
    public C9486a mo142488Cs(long j, String str, C103032d.C103033a aVar) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect() mediaId is null, return");
            return null;
        }
        C97625j3.m125815e().mo123455a(221, new C102681b(this, str, aVar, j));
        C77335p pVar = new C77335p(j, str, new C102682c(this, aVar));
        C97625j3.m125815e().mo123460f(pVar);
        return new C102683d(this, pVar);
    }

    public C92836k Dt0(C72963f4 f4Var) {
        return C97100o.m125011p(f4Var);
    }

    /* renamed from: FV */
    public boolean mo142490FV(C72963f4 f4Var) {
        return C97056h.m124955K(f4Var);
    }

    /* renamed from: MU */
    public void mo142491MU(C72963f4 f4Var, C103032d.C103033a aVar) {
        C72695v.m85062d(f4Var, new C102684e(this, aVar));
    }

    /* renamed from: NT */
    public C78817m mo142492NT(String str, long j) {
        return C72695v.m85064f(str, j);
    }

    /* renamed from: VS */
    public String mo142493VS(C72963f4 f4Var) {
        return C97056h.m124960s(f4Var);
    }

    /* renamed from: hI */
    public boolean mo142494hI(C72963f4 f4Var, C78817m mVar) {
        return C72695v.m85074p(f4Var, (C72683d) mVar);
    }

    /* renamed from: iO */
    public boolean mo142495iO(String str, C72963f4 f4Var, C103032d.C103034b bVar) {
        if (Util.isNullOrNil(str) || f4Var == null) {
            Log.m105921e("MicroMsg.ChooseMsgFileCompat", "mediaId:%s or msg is null, err", str);
            return false;
        }
        C102680a aVar = new C102680a(this, str, bVar);
        C97625j3.m125815e().mo123455a(728, aVar);
        if (!(!C72695v.m85057J(str, f4Var))) {
            if (bVar != null) {
                ((C97576e.C97577a) bVar).mo136845a(0, "");
            }
            C97625j3.m125815e().mo123470p(728, aVar);
        }
        return true;
    }

    public boolean q20(C72963f4 f4Var) {
        return C97056h.m124953H(f4Var);
    }

    public String yo0(C72963f4 f4Var, C92836k kVar) {
        return C97100o.m125012r(f4Var, kVar, false);
    }
}
