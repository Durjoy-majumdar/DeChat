package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51368ta2;
import te3.C51517ua2;
import te3.ko4;

/* renamed from: xm2.o */
public class C53384o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150211d;

    /* renamed from: e */
    public C51517ua2 f150212e;

    /* renamed from: f */
    public byte[] f150213f;

    /* renamed from: g */
    public boolean f150214g;

    public C53384o(byte[] bArr) {
        this.f150213f = bArr;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150211d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C51368ta2 ta22 = new C51368ta2();
        byte[] bArr = this.f150213f;
        if (bArr != null) {
            ta22.f142078d = C48374j0.m53712a(bArr).f140574f;
        }
        ta22.f142079e = this.f150214g;
        bVar.f127066a = ta22;
        C51517ua2 ua22 = new C51517ua2();
        this.f150212e = ua22;
        bVar.f127067b = ua22;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/getuserauthlist";
        bVar.f127069d = 1146;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return 1146;
    }

    /* renamed from: j1 */
    public byte[] mo74032j1() {
        C51517ua2 ua22 = this.f150212e;
        if (ua22 == null || ua22.f142700g != 1) {
            return null;
        }
        return ua22.f142699f.mo123703f();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51517ua2 ua22 = (C51517ua2) ((C47350c) uVar).f127056b.f127083a;
        this.f150212e = ua22;
        ko4 ko4 = ua22.f142697d;
        if (ko4 != null) {
            i3 = ko4.f136919d;
            str = ko4.f136920e;
        }
        this.f150211d.onSceneEnd(i2, i3, str, this);
    }
}
