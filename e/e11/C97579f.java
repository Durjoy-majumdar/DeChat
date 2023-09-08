package e11;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f11.C97792a;
import f11.C97793b;
import g11.C98068c;
import hc0.C20937c;
import jp3.C9487b;
import ob0.C117747y;
import p158gt.C76051j;
import p158gt.C98201k;
import p775zi.C103032d;

/* renamed from: e11.f */
public class C97579f extends C97573c {

    /* renamed from: j */
    public C72963f4 f286302j;

    /* renamed from: n */
    public C92836k f286303n;

    /* renamed from: e11.f$a */
    public class C97580a implements C103032d.C103033a {
        public C97580a() {
        }

        /* renamed from: a */
        public void mo136846a(int i, String str) {
            Log.m105925i("MicroMsg.MsgFileWorker_Image", "DownloadCallback errCode:%d, errMsg:%s", Integer.valueOf(i), str);
            if (i == 0) {
                C97579f fVar = C97579f.this;
                if (fVar.f286288d instanceof C97793b) {
                    Log.m105920e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
                    C97579f fVar2 = C97579f.this;
                    fVar2.mo136848i((C97793b) fVar2.f286288d);
                    return;
                }
                fVar.mo136836a();
                return;
            }
            Log.m105920e("MicroMsg.MsgFileWorker_Image", "download fail");
            C97579f.this.mo136836a();
        }

        /* renamed from: b */
        public void mo136847b(int i, int i2, C117747y yVar) {
            C97579f.this.mo136837b(i, i2);
        }
    }

    /* renamed from: e11.f$b */
    public class C97581b implements C76051j.C76052a {
        public C97581b() {
        }

        /* renamed from: T2 */
        public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
            Class cls = C103032d.class;
            Log.m105925i("MicroMsg.MsgFileWorker_Image", "[onImgTaskEnd] imgLocalId:%s msgLocalId:%s err[%s:%s:%s]", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4), str);
            String yo02 = ((C103032d) C86312j.m106911c(cls)).yo0(C97579f.this.f286302j, ((C103032d) C86312j.m106911c(cls)).Dt0(C97579f.this.f286302j));
            Log.m105925i("MicroMsg.MsgFileWorker_Image", "imgPath:%s", yo02);
            if (!Util.isNullOrNil(yo02)) {
                C97579f.this.mo136849j(yo02);
            } else {
                C97579f.this.mo136836a();
            }
        }

        /* renamed from: f0 */
        public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
            Log.m105919d("MicroMsg.MsgFileWorker_Image", "[onImgTaskProgress] offset:%s totalLen:%s", Integer.valueOf(i3), Integer.valueOf(i4));
            C97579f.this.mo136837b(i3, i4);
        }

        /* renamed from: x4 */
        public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
            C97579f.this.mo136836a();
        }
    }

    public C97579f(C97792a aVar, C97571a aVar2, C9487b bVar) {
        super(aVar, aVar2, bVar);
    }

    /* renamed from: f */
    public boolean mo136839f() {
        Class cls = C103032d.class;
        if (this.f286302j.getType() == 268435505) {
            if (!C86013q1.m106450k(((C103032d) C86312j.m106911c(cls)).mo142493VS(this.f286302j))) {
                return false;
            }
            C97792a aVar = this.f286288d;
            if (aVar instanceof C97793b) {
                mo136848i((C97793b) aVar);
            } else {
                Log.m105920e("MicroMsg.MsgFileWorker_Image", "mMsgItem isn't AppMsgImageMsgItem, err");
                mo136836a();
            }
            return true;
        } else if (!this.f286303n.mo127146q()) {
            return false;
        } else {
            String yo02 = ((C103032d) C86312j.m106911c(cls)).yo0(this.f286302j, this.f286303n);
            if (Util.isNullOrNil(yo02)) {
                return false;
            }
            mo136849j(yo02);
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo136840g() {
        C72963f4 f4Var;
        Class cls = C103032d.class;
        C97792a aVar = this.f286288d;
        if (aVar == null || (f4Var = aVar.f286878b) == null) {
            Log.m105920e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is null, return");
            mo136836a();
            return false;
        }
        this.f286302j = f4Var;
        if (f4Var.mo100972K3()) {
            Log.m105921e("MicroMsg.MsgFileWorker_Image", "mMsgInfo:%s is clean, return", this.f286302j);
            return false;
        } else if (!((C103032d) C86312j.m106911c(cls)).q20(this.f286302j)) {
            Log.m105920e("MicroMsg.MsgFileWorker_Image", "mMsgInfo is not img msg, return");
            return false;
        } else if (this.f286302j.getType() == 268435505) {
            return true;
        } else {
            C92836k Dt0 = ((C103032d) C86312j.m106911c(cls)).Dt0(this.f286302j);
            this.f286303n = Dt0;
            if (Dt0 != null) {
                return true;
            }
            Log.m105920e("MicroMsg.MsgFileWorker_Image", "mImgInfo is null, return");
            return false;
        }
    }

    /* renamed from: h */
    public void mo136841h() {
        if (this.f286302j.getType() == 268435505) {
            ((C103032d) C86312j.m106911c(C103032d.class)).mo142491MU(this.f286302j, new C97580a());
            return;
        }
        Log.m105925i("MicroMsg.MsgFileWorker_Image", "isOk:%b", Boolean.valueOf(((C92822e) ((C98201k) C86312j.m106911c(C98201k.class)).Jp0()).mo127101c(this.f286303n.f267374a, this.f286302j.getMsgId(), 0, Long.valueOf(this.f286302j.getMsgId()), C0966R.C0969drawable.by8, new C97581b())));
    }

    /* renamed from: i */
    public final void mo136848i(C97793b bVar) {
        MsgFile msgFile = new MsgFile();
        msgFile.f237615d = bVar.mo137120e();
        msgFile.f237616e = ((C103032d) C86312j.m106911c(C103032d.class)).mo142493VS(this.f286302j);
        msgFile.f237617f = bVar.mo137119d() + "." + msgFile.f237620i;
        msgFile.f237619h = "image";
        msgFile.f237620i = bVar.mo137118c();
        msgFile.f237618g = bVar.mo137123g();
        mo136838c(msgFile);
    }

    /* renamed from: j */
    public final void mo136849j(String str) {
        int lastIndexOf;
        MsgFile msgFile = new MsgFile();
        msgFile.f237615d = (int) C86013q1.m106451l(str);
        msgFile.f237616e = str;
        String str2 = this.f286303n.f267378e;
        msgFile.f237617f = str2;
        msgFile.f237619h = "image";
        LruCache<Integer, C20937c> lruCache = C98068c.f287519a;
        String str3 = "";
        if (!Util.isNullOrNil(str2) && (lastIndexOf = str2.lastIndexOf(".")) >= 0) {
            str3 = str2.substring(lastIndexOf + 1);
        }
        msgFile.f237620i = str3;
        msgFile.f237618g = (long) this.f286303n.f267386m;
        mo136838c(msgFile);
    }
}
