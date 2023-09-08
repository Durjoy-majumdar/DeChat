package e11;

import com.tencent.p014mm.choosemsgfile.compat.MsgFile;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import f11.C97792a;
import jp3.C9486a;
import jp3.C9487b;
import ob0.C117747y;
import p749xh.C78817m;
import p775zi.C103032d;

/* renamed from: e11.e */
public class C97576e extends C97573c {

    /* renamed from: j */
    public C72963f4 f286295j;

    /* renamed from: n */
    public long f286296n;

    /* renamed from: o */
    public String f286297o;

    /* renamed from: p */
    public C9486a f286298p;

    /* renamed from: e11.e$a */
    public class C97577a implements C103032d.C103034b {

        /* renamed from: e11.e$a$a */
        public class C97578a implements C103032d.C103033a {

            /* renamed from: a */
            public final /* synthetic */ C78817m f286300a;

            public C97578a(C78817m mVar) {
                this.f286300a = mVar;
            }

            /* renamed from: a */
            public void mo136846a(int i, String str) {
                Log.m105925i("MicroMsg.MsgFileWorker_File", "DownloadCallback errCode:%d, errMsg:%s", Integer.valueOf(i), str);
                if (i == 0) {
                    MsgFile msgFile = new MsgFile();
                    msgFile.f237615d = C97576e.this.f286288d.mo137120e();
                    msgFile.f237616e = this.f286300a.field_fileFullPath;
                    msgFile.f237617f = C97576e.this.f286288d.mo137119d();
                    msgFile.f237619h = "file";
                    msgFile.f237620i = C97576e.this.f286288d.mo137118c();
                    msgFile.f237618g = C97576e.this.f286288d.mo137123g() / 1000;
                    C97576e.this.mo136838c(msgFile);
                } else if (i == 1) {
                    C97576e eVar = C97576e.this;
                    synchronized (eVar) {
                        Log.m105924i("MicroMsg.MsgFileWorker_Base", "onDownloadStop");
                        C97571a aVar = eVar.f286289e;
                        if (aVar != null) {
                            aVar.mo127398d();
                            eVar.f286289e = null;
                        }
                    }
                } else {
                    Log.m105921e("MicroMsg.MsgFileWorker_File", "download %s fail", C97576e.this.f286288d);
                    C97576e.this.mo136836a();
                }
            }

            /* renamed from: b */
            public void mo136847b(int i, int i2, C117747y yVar) {
                C97576e.this.mo136837b(i, i2);
            }
        }

        public C97577a() {
        }

        /* renamed from: a */
        public void mo136845a(int i, String str) {
            Class cls = C103032d.class;
            Log.m105925i("MicroMsg.MsgFileWorker_File", "InitAttachInfoCallback errCode:%d, errMsg:%s", Integer.valueOf(i), str);
            if (i == 0) {
                C97576e eVar = C97576e.this;
                C78817m NT = ((C103032d) C86312j.m106911c(cls)).mo142492NT(eVar.f286297o, eVar.f286296n);
                ((C103032d) C86312j.m106911c(cls)).mo142486CK(NT);
                C97576e eVar2 = C97576e.this;
                C97576e eVar3 = C97576e.this;
                eVar2.f286298p = ((C103032d) C86312j.m106911c(cls)).mo142488Cs(eVar3.f286296n, eVar3.f286297o, new C97578a(NT));
                return;
            }
            Log.m105921e("MicroMsg.MsgFileWorker_File", "init %s fail", C97576e.this.f286288d);
            C97576e.this.mo136836a();
        }
    }

    public C97576e(C97792a aVar, C97571a aVar2, C9487b bVar) {
        super(aVar, aVar2, bVar);
    }

    public void dead() {
        Log.m105924i("MicroMsg.MsgFileWorker_File", "dead");
        C9486a aVar = this.f286298p;
        if (aVar != null) {
            aVar.dead();
        }
    }

    /* renamed from: f */
    public boolean mo136839f() {
        Class cls = C103032d.class;
        C78817m NT = ((C103032d) C86312j.m106911c(cls)).mo142492NT(this.f286297o, this.f286296n);
        if (!((C103032d) C86312j.m106911c(cls)).mo142494hI(this.f286295j, NT)) {
            return false;
        }
        MsgFile msgFile = new MsgFile();
        msgFile.f237615d = this.f286288d.mo137120e();
        msgFile.f237616e = NT.field_fileFullPath;
        msgFile.f237617f = this.f286288d.mo137119d();
        msgFile.f237619h = "file";
        msgFile.f237620i = this.f286288d.mo137118c();
        msgFile.f237618g = this.f286288d.mo137123g() / 1000;
        mo136838c(msgFile);
        return true;
    }

    /* renamed from: g */
    public boolean mo136840g() {
        C72963f4 f4Var;
        Log.m105925i("MicroMsg.MsgFileWorker_File", "start %s", this);
        C97792a aVar = this.f286288d;
        if (aVar == null || (f4Var = aVar.f286878b) == null) {
            Log.m105920e("MicroMsg.MsgFileWorker_File", "mMsgInfo is null, err");
            return false;
        }
        this.f286295j = f4Var;
        this.f286296n = f4Var.getMsgId();
        C68070l.C68072b u = C68070l.C68072b.m80422u(this.f286295j.getContent(), (String) null);
        if (u == null) {
            Log.m105921e("MicroMsg.MsgFileWorker_File", "parse msgContent error, %s", this.f286295j.getContent());
            return false;
        }
        if (Util.isNullOrNil(u.f195606o) && !Util.isNullOrNil(u.f195500J)) {
            Log.m105921e("MicroMsg.MsgFileWorker_File", "msgContent format error, %s", this.f286295j.getContent());
            u.f195606o = "" + u.f195500J.hashCode();
        }
        String str = u.f195606o;
        this.f286297o = str;
        if (!Util.isNullOrNil(str)) {
            return true;
        }
        Log.m105920e("MicroMsg.MsgFileWorker_File", "MediaId is null, err return");
        return false;
    }

    /* renamed from: h */
    public void mo136841h() {
        boolean iO = ((C103032d) C86312j.m106911c(C103032d.class)).mo142495iO(this.f286297o, this.f286295j, new C97577a());
        Log.m105925i("MicroMsg.MsgFileWorker_File", "initOk:%b", Boolean.valueOf(iO));
        if (!iO) {
            Log.m105924i("MicroMsg.MsgFileWorker_File", "initOk fail");
            mo136836a();
        }
    }
}
