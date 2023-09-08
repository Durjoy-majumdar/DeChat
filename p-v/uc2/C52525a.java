package uc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;
import pe3.C89349b;
import qe3.C47809f0;
import qe3.C47810g0;
import qe3.C47811h0;

/* renamed from: uc2.a */
public class C52525a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146710d;

    /* renamed from: e */
    public final C114799u f146711e;

    /* renamed from: f */
    public boolean f146712f;

    /* renamed from: g */
    public int f146713g = 0;

    public C52525a(boolean z, byte[] bArr) {
        this.f146712f = z;
        C47809f0 f0Var = new C47809f0(z);
        this.f146711e = f0Var;
        ((C47810g0) f0Var.getReqObj()).f128371b.f142718e = C89349b.m111674a(bArr);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146710d = nVar;
        this.f146713g++;
        return dispatch(gVar, this.f146711e, this);
    }

    public int getType() {
        return this.f146712f ? 3944 : 836;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            C47811h0 h0Var = (C47811h0) uVar.getRespObj();
            C11385n nVar = this.f146710d;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
        } else if (this.f146713g >= 2) {
            C11385n nVar2 = this.f146710d;
            if (nVar2 != null) {
                nVar2.onSceneEnd(i2, i3, str, this);
            }
        } else if (doScene(dispatcher(), this.f146710d) < 0) {
            this.f146710d.onSceneEnd(3, -1, "", this);
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
