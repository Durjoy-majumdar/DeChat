package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;
import f40.C86709a0;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import ob0.y$$d;
import qe3.C89628v0;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.modelsimple.n0 */
public class C81015n0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f237949d;

    /* renamed from: e */
    public C114799u f237950e;

    /* renamed from: f */
    public int f237951f;

    /* renamed from: g */
    public int f237952g;

    /* renamed from: h */
    public String f237953h;

    /* renamed from: i */
    public int f237954i;

    /* renamed from: j */
    public String f237955j;

    /* renamed from: n */
    public int f237956n;

    /* renamed from: o */
    public C51018qv3 f237957o;

    /* renamed from: p */
    public byte[] f237958p;

    public C81015n0(int i, int i2, String str, int i3, C51018qv3 qv32, byte[] bArr, int i4) {
        String str2 = str;
        C51018qv3 qv33 = qv32;
        byte[] bArr2 = bArr;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = str2;
        objArr[2] = Integer.valueOf(i3);
        int i5 = -1;
        objArr[3] = Integer.valueOf(qv33 == null ? -1 : qv33.f140572d);
        objArr[4] = Integer.valueOf(bArr2 != null ? bArr2.length : i5);
        Log.m105925i("MicroMsg.NetsceneAxAuth", "summerauthax NetsceneAxAuth funcId[%d] uri[%s], bType[%d] ticket[%d] randomKey[%d]", objArr);
        this.f237951f = i;
        int i6 = i2;
        this.f237954i = i6;
        this.f237955j = str2;
        int i7 = i3;
        this.f237956n = i7;
        this.f237957o = qv33;
        this.f237958p = bArr2;
        this.f237950e = new C89628v0(i6, str, i7, qv32, bArr);
        this.f237952g = i4;
        this.f237953h = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f237949d = nVar;
        int i = this.f237952g + 1;
        this.f237952g = i;
        Log.m105925i("MicroMsg.NetsceneAxAuth", "summerauthax doScene callback[%s] retry count %d , uri %s ", nVar, Integer.valueOf(i), this.f237953h);
        C117407d.INSTANCE.idkeyStat(148, 129, 1, false);
        return dispatch(gVar, this.f237950e, this);
    }

    public int getType() {
        return ((C89628v0) this.f237950e).f257852c;
    }

    /* renamed from: j1 */
    public final void mo112886j1(int i) {
        int i2 = i;
        if (i2 == -446) {
            C117407d.INSTANCE.idkeyStat(148, 137, 1, false);
        } else if (i2 == -104) {
            C117407d.INSTANCE.idkeyStat(148, 136, 1, false);
        } else if (i2 == -13) {
            C117407d.INSTANCE.idkeyStat(148, 135, 1, false);
        } else if (i2 == -3) {
            C117407d.INSTANCE.idkeyStat(148, 134, 1, false);
        } else if (i2 == -2) {
            C117407d.INSTANCE.idkeyStat(148, 133, 1, false);
        } else if (i2 == -1) {
            C117407d.INSTANCE.idkeyStat(148, 132, 1, false);
        } else if (i2 != 0) {
            C117407d.INSTANCE.idkeyStat(148, 138, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(148, 130, 1, false);
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.NetsceneAxAuth", "summerauthax type [%d], onGYNetEnd [%d, %d, %s], retry count %d, uri %s ", Integer.valueOf(getType()), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(this.f237952g), this.f237953h);
        if (!(i4 == 0 && i5 == 0) && this.f237952g < 3) {
            mo112886j1(i5);
            if (i5 == -1 || i5 == -446) {
                Log.m105924i("MicroMsg.NetsceneAxAuth", "summerauth do NetsceneAxAuth");
                C89137b0 d = C86709a0.m107524d();
                C81015n0 n0Var = r11;
                C81015n0 n0Var2 = new C81015n0(this.f237951f, this.f237954i, this.f237955j, this.f237956n, this.f237957o, this.f237958p, this.f237952g);
                if (!d.mo123461g(n0Var, 0)) {
                    Log.m105925i("MicroMsg.NetsceneAxAuth", "send axauth failed %s ", this.f237953h);
                    this.f237949d.onSceneEnd(3, -1, "", this);
                    return;
                }
            }
        }
        int i6 = this.f237952g;
        if (i6 >= 3) {
            Log.m105921e("MicroMsg.NetsceneAxAuth", "axauth retry reach max times %d, uri is %s ", Integer.valueOf(i6), this.f237953h);
        }
        C86709a0.m107524d().mo123460f(new C75576f4(new C81014m0(this, ((C89628v0.C89630b) uVar.getRespObj()).f257857a, bArr), (String) null));
        this.f237949d.onSceneEnd(i4, i5, str2, this);
        mo112886j1(i4);
        if (i4 != 0) {
            C117407d.INSTANCE.idkeyStat(148, 131, 1, false);
        }
    }

    public int securityLimitCount() {
        return 3;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
