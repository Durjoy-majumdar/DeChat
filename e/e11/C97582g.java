package e11;

import android.os.Looper;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f11.C97792a;
import g11.C98068c;
import hc0.C20937c;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98442x0;
import jp3.C9487b;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p775zi.C103032d;

/* renamed from: e11.g */
public class C97582g extends C97573c {

    /* renamed from: j */
    public C72963f4 f286306j;

    /* renamed from: n */
    public C98408n0 f286307n;

    /* renamed from: o */
    public boolean f286308o;

    /* renamed from: e11.g$a */
    public class C97583a implements C103032d.C103035c {
        public C97583a() {
        }

        /* renamed from: a */
        public void mo136851a(int i, String str, String str2) {
            Log.m105925i("MicroMsg.MsgFileWorker_Video", "onDownloadCallback errCode:%d, errMsg:%s", Integer.valueOf(i), str);
            if (i == 0) {
                C97582g gVar = C97582g.this;
                gVar.mo136850i(gVar.f286307n, str2);
                return;
            }
            Log.m105920e("MicroMsg.MsgFileWorker_Video", "download fail");
            C97582g.this.mo136836a();
        }
    }

    /* renamed from: e11.g$b */
    public class C97584b implements C101489t.C77595a {
        public C97584b() {
        }

        /* renamed from: d5 */
        public void mo102579d5(C101489t.C77595a.C77596a aVar) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            if (Zd != null) {
                C97582g.this.mo136837b(Zd.f288558e, Zd.f288559f);
                if (Zd.mo137710n()) {
                    String q = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137728q(C97582g.this.f286306j.mo108765s2());
                    if (C86013q1.m106450k(q)) {
                        C97582g.this.mo136850i(Zd, q);
                        return;
                    }
                    Log.m105920e("MicroMsg.MsgFileWorker_Video", "video isn't exist, return");
                    C97582g.this.mo136836a();
                }
            }
        }
    }

    public C97582g(C97792a aVar, C97571a aVar2, C9487b bVar) {
        super(aVar, aVar2, bVar);
    }

    /* renamed from: f */
    public boolean mo136839f() {
        Class cls = C101488s.class;
        if (this.f286288d.mo137116a().f287513c) {
            C98442x0 b = C98442x0.f288734i.mo137781b(this.f286307n.mo137705i());
            if (b == null || Util.isNullOrNil(b.f288740d)) {
                this.f286308o = false;
                Log.m105929w("MicroMsg.MsgFileWorker_Video", "%s no origin video cdn url", this.f286288d);
            } else {
                Log.m105924i("MicroMsg.MsgFileWorker_Video", "no origin video cdn url");
                String str = this.f286307n.f288546N;
                if (Util.isNullOrNil(str)) {
                    this.f286308o = true;
                    return false;
                }
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
                if (Zd == null) {
                    this.f286308o = true;
                    return false;
                }
                String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(str);
                if (!C86013q1.m106450k(q)) {
                    this.f286308o = true;
                    return false;
                } else if (C86013q1.m106451l(q) == ((long) Zd.f288559f)) {
                    mo136850i(Zd, q);
                    this.f286308o = true;
                    return true;
                } else {
                    this.f286308o = true;
                    return false;
                }
            }
        } else {
            this.f286308o = false;
        }
        if (this.f286307n.mo137710n()) {
            String q2 = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f286306j.mo108765s2());
            if (C86013q1.m106450k(q2)) {
                mo136850i(this.f286307n, q2);
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo136840g() {
        C72963f4 f4Var;
        C97792a aVar = this.f286288d;
        if (aVar == null || (f4Var = aVar.f286878b) == null) {
            Log.m105920e("MicroMsg.MsgFileWorker_Video", "mMsgInfo is null, return");
            return false;
        }
        this.f286306j = f4Var;
        if (f4Var.mo100972K3()) {
            Log.m105921e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is clean, return", this.f286306j);
            return false;
        } else if (!((C103032d) C86312j.m106911c(C103032d.class)).mo142490FV(this.f286306j)) {
            Log.m105921e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s is not video, return", this.f286306j);
            return false;
        } else {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(this.f286306j.mo108765s2());
            this.f286307n = Zd;
            if (Zd == null) {
                Log.m105921e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is null, return", this.f286306j);
                return false;
            } else if (Zd.f288562i != 198) {
                return true;
            } else {
                Log.m105921e("MicroMsg.MsgFileWorker_Video", "mMsgInfo:%s videoInfo is invalid, return", this.f286306j);
                return false;
            }
        }
    }

    /* renamed from: h */
    public void mo136841h() {
        Class cls = C101491u.class;
        if (this.f286308o) {
            ((C103032d) C86312j.m106911c(C103032d.class)).mo142487Cq(this.f286306j, new C97583a());
            return;
        }
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(new C97584b(), Looper.getMainLooper());
        if (this.f286307n.mo137711o()) {
            Log.m105924i("MicroMsg.MsgFileWorker_Video", "start complete online video");
            ((C101491u) C86312j.m106911c(cls)).mo140797FT(this.f286306j.mo108765s2());
            return;
        }
        Log.m105924i("MicroMsg.MsgFileWorker_Video", "start complete offline video");
        ((C101491u) C86312j.m106911c(cls)).Tk0(this.f286306j.mo108765s2(), 10);
        ((C101491u) C86312j.m106911c(cls)).M00(this.f286306j.mo108765s2());
    }

    /* renamed from: i */
    public final void mo136850i(C98408n0 n0Var, String str) {
        int lastIndexOf;
        MsgFile msgFile = new MsgFile();
        msgFile.f237615d = (int) C86013q1.m106451l(str);
        msgFile.f237616e = str;
        LruCache<Integer, C20937c> lruCache = C98068c.f287519a;
        String str2 = "";
        if (!Util.isNullOrNil(str) && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
            str2 = str.substring(lastIndexOf + 1);
        }
        msgFile.f237620i = str2;
        msgFile.f237619h = "video";
        msgFile.f237617f = n0Var.mo137700d() + "." + msgFile.f237620i;
        msgFile.f237618g = n0Var.f288563j;
        mo136838c(msgFile);
    }
}
