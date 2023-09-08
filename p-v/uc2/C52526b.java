package uc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;
import pe3.C89349b;
import qe3.C47812i0;
import qe3.C47813j0;
import qe3.C47814k0;

/* renamed from: uc2.b */
public class C52526b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146714d;

    /* renamed from: e */
    public final C114799u f146715e;

    /* renamed from: f */
    public boolean f146716f;

    /* renamed from: g */
    public int f146717g = 0;

    public C52526b(boolean z, byte[] bArr) {
        this.f146716f = z;
        C47812i0 i0Var = new C47812i0(z);
        this.f146715e = i0Var;
        ((C47813j0) i0Var.getReqObj()).f128377b.f143957e = C89349b.m111674a(bArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146714d = nVar;
        this.f146717g++;
        return dispatch(gVar, this.f146715e, this);
    }

    public int getType() {
        return this.f146716f ? 3789 : 3644;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47814k0 k0Var = (C47814k0) uVar.getRespObj();
            C11385n nVar = this.f146714d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
        } else if (this.f146717g >= 2) {
            C11385n nVar2 = this.f146714d;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i2, i3, str, this);
            }
        } else if (doScene(dispatcher(), this.f146714d) < 0) {
            this.f146714d.onSceneEnd(3, -1, "", this);
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
