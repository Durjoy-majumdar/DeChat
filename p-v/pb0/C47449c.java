package pb0;

import c14.C54637q;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qb0.C47798b;
import te3.C49335eu3;

/* renamed from: pb0.c */
public final class C47449c<T extends C49335eu3> extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f127272d;

    /* renamed from: e */
    public final C54637q<C47445a<T>> f127273e;

    public C47449c(C47350c cVar, C54637q<C47445a<T>> qVar) {
        C87412m.m108594g(cVar, "reqResp");
        C87412m.m108594g(qVar, "channel");
        this.f127272d = cVar;
        this.f127273e = qVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        if (gVar == null) {
            return -1;
        }
        int dispatch = dispatch(gVar, this.f127272d, this);
        if (!this.f127273e.mo75535h()) {
            this.f127273e.mo75539t(new C47445a(C47798b.DoScene, dispatch, -1, -1, "", this, null));
        }
        Log.m105924i("MicroMsg.Mvvm.FlowNetScene", "doScene, netId:" + dispatch);
        return dispatch;
    }

    public int getType() {
        return this.f127272d.f127058d;
    }

    public boolean needCheckCallback() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r10, int r11, int r12, java.lang.String r13, com.tencent.p014mm.network.C114799u r14, byte[] r15) {
        /*
            r9 = this;
            r15 = 0
            if (r14 == 0) goto L_0x001b
            boolean r0 = r14 instanceof ob0.C47350c
            if (r0 == 0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r14 = r15
        L_0x0009:
            if (r14 == 0) goto L_0x001b
            ob0.c r14 = (ob0.C47350c) r14
            ob0.c$d r14 = r14.f127056b
            pe3.a r14 = r14.f127083a
            boolean r0 = r14 instanceof te3.C49335eu3
            if (r0 == 0) goto L_0x0018
            te3.eu3 r14 = (te3.C49335eu3) r14
            goto L_0x0019
        L_0x0018:
            r14 = r15
        L_0x0019:
            r7 = r14
            goto L_0x001c
        L_0x001b:
            r7 = r15
        L_0x001c:
            c14.q<pb0.a<T>> r14 = r9.f127273e
            boolean r14 = r14.mo75535h()
            if (r14 != 0) goto L_0x003c
            c14.q<pb0.a<T>> r14 = r9.f127273e
            pb0.a r8 = new pb0.a
            qb0.b r1 = qb0.C47798b.OnEnd
            if (r13 != 0) goto L_0x0030
            java.lang.String r0 = ""
            r5 = r0
            goto L_0x0031
        L_0x0030:
            r5 = r13
        L_0x0031:
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.mo75539t(r8)
        L_0x003c:
            c14.q<pb0.a<T>> r14 = r9.f127273e
            r0 = 1
            c14.C54612b0.C54613a.m61404a(r14, r15, r0, r15)
            ob0.b0 r2 = f40.C86709a0.m107524d()
            com.tencent.mm.sdk.platformtools.MMHandler r14 = r2.f256814i
            ob0.d0 r15 = new ob0.d0
            r1 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r14.post(r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "onGYNetEnd, netId:"
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = " errType:"
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = " errCode:"
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = " errMsg:"
            r14.append(r10)
            r14.append(r13)
            java.lang.String r10 = r14.toString()
            java.lang.String r11 = "MicroMsg.Mvvm.FlowNetScene"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pb0.C47449c.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
