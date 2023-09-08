package ve2;

import com.tencent.p014mm.modelimage.C92805a0;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import i21.C98590g;
import ke2.C99129c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C89137b0;
import p158gt.C98201k;
import p158gt.C98203p;
import xe2.C102630a;
import xe2.C102631b;
import zt3.C119157j;

/* renamed from: ve2.c */
public final class C102176c extends C102179e implements C11385n, C47355o {

    /* renamed from: h */
    public C98203p f300861h;

    /* renamed from: i */
    public long f300862i;

    /* renamed from: j */
    public long f300863j;

    /* renamed from: ve2.c$a */
    public static final class C102177a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102176c f300864d;

        /* renamed from: e */
        public final /* synthetic */ C92836k f300865e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f300866f;

        public C102177a(C102176c cVar, C92836k kVar, C72963f4 f4Var) {
            this.f300864d = cVar;
            this.f300865e = kVar;
            this.f300866f = f4Var;
        }

        public final void run() {
            this.f300864d.f300861h = ((C98201k) C86312j.m106911c(C98201k.class)).mo137273CF(this.f300865e.f267374a, this.f300866f.getMsgId(), 1, this.f300864d);
            C102176c cVar = this.f300864d;
            C98203p pVar = cVar.f300861h;
            if (pVar != null) {
                if (cVar.f300868e.mo142472n2() == 1) {
                    ((C92805a0) pVar).f267207E = 1;
                } else {
                    ((C92805a0) pVar).f267207E = 2;
                }
                C86709a0.m107524d().mo123455a(109, cVar);
                C86709a0.m107524d().mo123460f((C117747y) pVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102176c(C102630a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "msgDbItem");
    }

    /* renamed from: a */
    public void mo141716a(int i) {
        if (this.f300861h != null) {
            C89137b0 d = C86709a0.m107524d();
            C98203p pVar = this.f300861h;
            C87412m.m108592e(pVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123458d((C117747y) pVar);
            C102179e.m134640e(this, i, 0, 2, (Object) null);
            C86709a0.m107524d().mo123470p(109, this);
            Log.m105924i("MicroMsg.C2CImageMsgTask", "c2c pre download large image task cancel: msgSvrId:" + this.f300869f + ", msgId:" + this.f300868e.getMsgId());
        }
    }

    /* renamed from: c */
    public void mo141717c() {
        Class cls = C98201k.class;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(this.f300868e.mo142473o2(), this.f300869f);
        if (h302.getMsgId() <= 0) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "msg delete, msgId:" + this.f300868e.getMsgId());
            C102179e.m134640e(this, 4, 0, 2, (Object) null);
            return;
        }
        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(h302.mo108768t(), h302.mo108774y2());
        if (NQ.f267374a <= 0) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + this.f300868e.getMsgId());
            C102179e.m134640e(this, 4, 0, 2, (Object) null);
            return;
        }
        if (((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127105g(NQ.f267374a, h302.getMsgId(), 1)) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "already in downloading, msgId:" + this.f300868e.getMsgId());
            C102179e.m134640e(this, 7, 0, 2, (Object) null);
            return;
        }
        C92836k TO = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127173TO(NQ.f267390q);
        if (TO.mo127146q()) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "already downloaded, msgId:" + this.f300868e.getMsgId());
            C102179e.m134640e(this, 7, 0, 2, (Object) null);
            return;
        }
        this.f300862i = NQ.f267374a;
        this.f300863j = TO.f267374a;
        ((C119157j) C119157j.f356862d).mo183875f(new C102177a(this, NQ, h302));
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C102631b bVar = cVar.f290673z;
        String r2 = this.f300868e.mo142476r2();
        C87412m.m108593f(r2, "msgDbItem.msgItemId");
        bVar.mo142290g3(r2, 2);
        long j = this.f300869f;
        String o2 = this.f300868e.mo142473o2();
        C87412m.m108593f(o2, "msgDbItem.fromUser");
        ((C98590g) C86312j.m106911c(C98590g.class)).mo137961JT(2, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        this.f300870g = (long) i;
        mo141720f();
        Log.m105924i("MicroMsg.C2CImageMsgTask", "c2c large image pre download onProgress, msgId:" + this.f300868e.getMsgId() + ", msgSvrId:" + this.f300869f + ", offset:" + i + ", totalLen:" + i2);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 != null && yVar.getType() == 109 && C87412m.m108589b(yVar2, this.f300861h)) {
            C86709a0.m107524d().mo123470p(109, this);
            if (i == 0 && i3 == 0) {
                Class cls = C99129c.class;
                Class cls2 = C98201k.class;
                C99129c cVar = (C99129c) C86312j.m106911c(cls);
                cVar.requireAccountInitialized();
                C102631b bVar = cVar.f290673z;
                C102630a d3 = bVar.mo142287d3(this.f300869f + "_1");
                if (d3 != null && d3.getStatus() == 1) {
                    C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
                    cVar2.requireAccountInitialized();
                    C102631b bVar2 = cVar2.f290673z;
                    String r2 = d3.mo142476r2();
                    C87412m.m108593f(r2, "midImgItem.msgItemId");
                    bVar2.mo142290g3(r2, 3);
                    C92836k nP = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127194nP(Long.valueOf(this.f300862i));
                    C92836k nP2 = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127194nP(Long.valueOf(this.f300863j));
                    if (nP2.f267374a <= 0 || nP.f267374a <= 0) {
                        Log.m105924i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + this.f300868e.getMsgId());
                    } else {
                        nP.mo127147r(nP2.f267378e);
                        nP.mo127128E(nP2.f267380g);
                        nP.mo127155z(nP2.f267379f);
                        nP.mo127152w(nP2.f267383j);
                        nP.mo127129F(nP2.f267377d);
                        nP.mo127126C(nP.f267377d);
                        nP.f267385l = nP2.f267385l;
                        nP.f267369L = true;
                        ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).Dx0(Long.valueOf(nP.f267374a), nP);
                    }
                }
                C102179e.m134640e(this, 1, 0, 2, (Object) null);
                long j = this.f300869f;
                String o2 = this.f300868e.mo142473o2();
                C87412m.m108593f(o2, "msgDbItem.fromUser");
                ((C98590g) C86312j.m106911c(C98590g.class)).bq0(2, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
                return;
            }
            mo141719d(2, i3);
        }
    }
}
