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
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47355o;
import ob0.C89137b0;
import p158gt.C98201k;
import p158gt.C98203p;
import xe2.C102630a;

/* renamed from: ve2.d */
public final class C102178d extends C102179e implements C11385n, C47355o {

    /* renamed from: h */
    public C98203p f300867h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102178d(C102630a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "msgDbItem");
    }

    /* renamed from: a */
    public void mo141716a(int i) {
        if (this.f300867h != null) {
            C89137b0 d = C86709a0.m107524d();
            C98203p pVar = this.f300867h;
            C87412m.m108592e(pVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d.mo123458d((C117747y) pVar);
            C102179e.m134640e(this, i, 0, 2, (Object) null);
            C86709a0.m107524d().mo123470p(109, this);
            Log.m105924i("MicroMsg.C2CImageMsgTask", "c2c pre download mid image task cancel: msgSvrId:" + this.f300869f + ", msgId:" + this.f300868e.getMsgId());
        }
    }

    /* renamed from: c */
    public void mo141717c() {
        Class cls = C98201k.class;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(this.f300868e.mo142473o2(), this.f300869f);
        C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(h302.mo108768t(), h302.mo108774y2());
        if (((C92822e) ((C98201k) C86312j.m106911c(cls)).Jp0()).mo127105g(NQ.f267374a, h302.getMsgId(), NQ.f267381h)) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "already in downloading, msgId:" + this.f300869f);
            C102179e.m134640e(this, 7, 0, 2, (Object) null);
        } else if (NQ.f267392s == 1) {
            Log.m105924i("MicroMsg.C2CImageMsgTask", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId:" + h302.getMsgId());
            C102179e.m134640e(this, 5, 0, 2, (Object) null);
        } else {
            C98203p CF = ((C98201k) C86312j.m106911c(cls)).mo137273CF(NQ.f267374a, h302.getMsgId(), 0, this);
            this.f300867h = CF;
            if (CF != null) {
                if (this.f300868e.mo142472n2() == 1) {
                    ((C92805a0) CF).f267207E = 1;
                } else {
                    ((C92805a0) CF).f267207E = 2;
                }
                C86709a0.m107524d().mo123455a(109, this);
                C86709a0.m107524d().mo123460f((C117747y) CF);
            }
            long j = this.f300869f;
            String o2 = this.f300868e.mo142473o2();
            C87412m.m108593f(o2, "msgDbItem.fromUser");
            ((C98590g) C86312j.m106911c(C98590g.class)).mo137961JT(1, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
        }
    }

    /* renamed from: m */
    public void mo26221m(int i, int i2, C117747y yVar) {
        Log.m105924i("MicroMsg.C2CImageMsgTask", "c2c mid image pre download onProgress, msgId:" + this.f300868e.getMsgId() + ", msgSvrId:" + this.f300869f + ", offset:" + i + ", totalLen:" + i2);
        this.f300870g = (long) i;
        mo141720f();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        if (yVar2 != null && yVar.getType() == 109 && C87412m.m108589b(yVar2, this.f300867h)) {
            C86709a0.m107524d().mo123470p(109, this);
            if (i == 0 && i3 == 0) {
                C102179e.m134640e(this, 1, 0, 2, (Object) null);
                long j = this.f300869f;
                String o2 = this.f300868e.mo142473o2();
                C87412m.m108593f(o2, "msgDbItem.fromUser");
                ((C98590g) C86312j.m106911c(C98590g.class)).bq0(1, j, o2, (long) this.f300868e.mo142471m2(), (long) this.f300868e.mo142480u2(), (long) this.f300868e.mo142472n2(), this.f300868e.getCreateTime());
                return;
            }
            mo141719d(2, i3);
        }
    }
}
