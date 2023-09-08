package ve2;

import a70.C112760b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import i21.C98590g;
import ke2.C99129c;
import me2.C10783a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import p763ym.C53543s;
import qg2.C77335p;
import qg2.p$$e;
import xe2.C102630a;
import xe2.C102631b;

/* renamed from: ve2.b */
public final class C102175b extends C102179e implements C11385n, C47355o {

    /* renamed from: h */
    public C72683d f300859h;

    /* renamed from: i */
    public C77335p f300860i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102175b(C102630a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "msgDbItem");
    }

    /* renamed from: a */
    public void mo141716a(int i) {
        C77335p pVar = this.f300860i;
        if (pVar != null) {
            pVar.mo107463o1((p$$e) null);
            C86709a0.m107524d().mo123458d(this.f300860i);
            C102179e.m134640e(this, i, 0, 2, (Object) null);
            C86709a0.m107524d().mo123470p(221, this);
            Log.m105924i("MicroMsg.C2CFileMsgTask", "c2c pre download file task cancel: msgSvrId:" + this.f300869f + ", msgId:" + this.f300868e.getMsgId());
        }
    }

    /* renamed from: c */
    public void mo141717c() {
        Class cls = C53543s.class;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(this.f300868e.mo142473o2(), this.f300869f);
        boolean z = false;
        if (h302.getMsgId() <= 0) {
            Log.m105924i("MicroMsg.C2CFileMsgTask", "msg delete, msgId:" + this.f300868e.getMsgId() + ", msgSvrId:" + this.f300869f);
            C102179e.m134640e(this, 4, 0, 2, (Object) null);
            return;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u((!C72996z1.m85820U5(h302.mo108768t()) || h302.mo108769t2() != 0) ? h302.getContent() : C75604z3.m90849u(h302.getContent()), (String) null);
        if (u == null) {
            Log.m105924i("MicroMsg.C2CFileMsgTask", "appMsgContent is null");
            C102179e.m134640e(this, 4, 0, 2, (Object) null);
        } else if (u.f195582i != 6) {
            Log.m105924i("MicroMsg.C2CFileMsgTask", "appMsg type not support pre download");
            C102179e.m134640e(this, 4, 0, 2, (Object) null);
        } else {
            C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(h302.getMsgId());
            this.f300859h = Yt;
            if (Yt == null) {
                C72683d dVar = new C72683d();
                this.f300859h = dVar;
                dVar.field_fileFullPath = C10783a.m10757a(C112760b.m154247s(), u.f195570f, u.f195602n);
                C72683d dVar2 = this.f300859h;
                if (dVar2 != null) {
                    dVar2.field_appId = u.f195562d;
                }
                if (dVar2 != null) {
                    dVar2.field_sdkVer = (long) u.f195566e;
                }
                if (dVar2 != null) {
                    dVar2.field_mediaSvrId = u.f195606o;
                }
                if (dVar2 != null) {
                    dVar2.field_totalLen = (long) u.f195594l;
                }
                if (dVar2 != null) {
                    dVar2.field_status = 101;
                }
                if (dVar2 != null) {
                    dVar2.field_isUpload = false;
                }
                if (dVar2 != null) {
                    dVar2.field_createTime = C31543z5.m39451a();
                }
                C72683d dVar3 = this.f300859h;
                if (dVar3 != null) {
                    dVar3.field_lastModifyTime = Util.nowSecond();
                }
                C72683d dVar4 = this.f300859h;
                if (dVar4 != null) {
                    dVar4.field_msgInfoId = h302.getMsgId();
                }
                C72683d dVar5 = this.f300859h;
                if (dVar5 != null) {
                    dVar5.field_netTimes = 0;
                }
                if (dVar5 != null) {
                    dVar5.field_type = (long) u.f195626t;
                }
                ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100151bD(this.f300859h);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("filetype : ");
                C72683d dVar6 = this.f300859h;
                sb.append(dVar6 != null ? Long.valueOf(dVar6.field_status) : null);
                Log.m105924i("MicroMsg.C2CFileMsgTask", sb.toString());
            }
            C72683d dVar7 = this.f300859h;
            if (dVar7 != null) {
                C86009m1 m1Var = new C86009m1(dVar7.field_fileFullPath);
                if (m1Var.mo119967g() && m1Var.mo119980r() == dVar7.field_totalLen) {
                    C102179e.m134640e(this, 5, 0, 2, (Object) null);
                    return;
                }
            }
            C77335p pVar = new C77335p(h302.getMsgId(), u.f195606o, this);
            this.f300860i = pVar;
            if (this.f300868e.mo142472n2() == 1) {
                pVar.f225480x = 1;
            } else {
                pVar.f225480x = 2;
            }
            C86709a0.m107524d().mo123455a(221, this);
            C86709a0.m107524d().mo123460f(pVar);
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C102631b bVar = cVar.f290673z;
            String r2 = this.f300868e.mo142476r2();
            C87412m.m108593f(r2, "msgDbItem.msgItemId");
            bVar.mo142290g3(r2, 2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("c2c file pre download start, msgId:");
            sb4.append(h302.getMsgId());
            sb4.append(", msgSvrId:");
            sb4.append(this.f300869f);
            sb4.append(", downloadNow:");
            if (this.f300868e.mo142472n2() == 1) {
                z = true;
            }
            sb4.append(z);
            Log.m105924i("MicroMsg.C2CFileMsgTask", sb4.toString());
            long j = this.f300869f;
            String o2 = this.f300868e.mo142473o2();
            C87412m.m108593f(o2, "msgDbItem.fromUser");
            ((C98590g) C86312j.m106911c(C98590g.class)).mo137961JT(4, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
        }
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        Log.m105925i("MicroMsg.C2CFileMsgTask", "c2c file pre download onSceneProgressEnd msgSvrId:%s, msgId:%s, totalLen:%s, offset:%s", this.f300868e.mo142476r2(), Long.valueOf(this.f300868e.getMsgId()), Integer.valueOf(i2), Integer.valueOf(i));
        this.f300870g = (long) i;
        mo141720f();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        if (C87412m.m108589b(yVar, this.f300860i)) {
            C86709a0.m107524d().mo123470p(221, this);
            if (i3 == 0 && i4 == 0) {
                C102179e.m134640e(this, 1, 0, 2, (Object) null);
                Log.m105924i("MicroMsg.C2CFileMsgTask", "c2c file pre download end, msgId:" + this.f300868e.getMsgId() + ", msgSvrId_msgType:" + this.f300868e.mo142476r2());
                long j = this.f300869f;
                String o2 = this.f300868e.mo142473o2();
                C87412m.m108593f(o2, "msgDbItem.fromUser");
                ((C98590g) C86312j.m106911c(C98590g.class)).bq0(4, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
                return;
            }
            mo141719d(2, i4);
            Log.m105924i("MicroMsg.C2CFileMsgTask", "c2c file pre download failed, msgId:" + this.f300868e.getMsgId() + ", msgSvrId_msgType:" + this.f300868e.mo142476r2() + ", errType:" + i3 + ", errCode:" + i4);
        }
    }
}
