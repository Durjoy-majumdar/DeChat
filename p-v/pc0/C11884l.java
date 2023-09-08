package pc0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import te3.C50194ky2;
import te3.C50327ly2;
import te3.C50377mb;
import te3.C50518nb;

/* renamed from: pc0.l */
public class C11884l extends C117747y implements C1311n {

    /* renamed from: d */
    public List<String> f34721d;

    /* renamed from: e */
    public List<String> f34722e = new LinkedList();

    /* renamed from: f */
    public int f34723f;

    /* renamed from: g */
    public int f34724g;

    /* renamed from: h */
    public C11385n f34725h;

    /* renamed from: i */
    public C47350c f34726i;

    /* renamed from: j */
    public int f34727j;

    /* renamed from: n */
    public int f34728n;

    public C11884l(List<String> list, int i, int i2, int i3) {
        this.f34721d = list;
        this.f34723f = i;
        this.f34724g = i2;
        this.f34728n = list.size();
        this.f34727j = i3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f34725h = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchmodcontacttype";
        bVar.f127069d = 3990;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127066a = new C50377mb();
        bVar.f127067b = new C50518nb();
        C47350c a = bVar.mo72403a();
        this.f34726i = a;
        C50377mb mbVar = (C50377mb) a.f127055a.f127080a;
        mbVar.f137933e = new LinkedList<>();
        for (int i = 0; i < this.f34727j && this.f34721d.size() > 0; i++) {
            C50194ky2 ky22 = new C50194ky2();
            ky22.f137101d = this.f34721d.remove(0);
            ky22.f137102e = this.f34723f;
            ky22.f137103f = this.f34724g;
            mbVar.f137933e.add(ky22);
        }
        mbVar.f137932d = mbVar.f137933e.size();
        int i2 = this.f34723f;
        if (i2 == 134217728 || i2 == 33554432) {
            mbVar.f137934f = 1;
        }
        return dispatch(gVar, this.f34726i, this);
    }

    public int getType() {
        return 3990;
    }

    /* renamed from: j1 */
    public C50518nb mo11760j1() {
        return (C50518nb) this.f34726i.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C75700k0.class;
        int i4 = 0;
        Log.m105925i("MicroMsg.NetSceneBatchModContactType", "errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            Iterator<C50327ly2> it = ((C50518nb) this.f34726i.f127056b.f127083a).f138522e.iterator();
            while (it.hasNext()) {
                C50327ly2 next = it.next();
                if (next.f137715d == 0) {
                    C86709a0.m107528h();
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(next.f137716e.f137101d);
                    if (z1Var != null && z1Var.mo62927s3()) {
                        C50194ky2 ky22 = next.f137716e;
                        int i5 = ky22.f137102e;
                        if (i5 != 8388608) {
                            if (i5 != 33554432) {
                                if (i5 == 134217728) {
                                    if (ky22.f137103f == 1) {
                                        z1Var.setType(z1Var.getType() | 134217728);
                                    } else {
                                        z1Var.setType(z1Var.getType() & -134217729);
                                    }
                                }
                            } else if (ky22.f137103f == 1) {
                                z1Var.setType(z1Var.getType() | TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                            } else {
                                z1Var.setType(z1Var.getType() & -33554433);
                            }
                        } else if (ky22.f137103f == 1) {
                            z1Var.mo62910j4();
                        } else {
                            z1Var.setType(z1Var.getType() & -8388609);
                        }
                        C86709a0.m107528h();
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69719p3(z1Var.getUsername(), z1Var);
                        ((LinkedList) this.f34722e).add(z1Var.getUsername());
                    }
                } else {
                    i4++;
                }
            }
            if (i4 == 0 && this.f34721d.size() > 0) {
                if (doScene(dispatcher(), this.f34725h) < 0) {
                    Log.m105920e("MicroMsg.NetSceneBatchModContactType", "onGYNetEnd : doScene fail");
                    this.f34725h.onSceneEnd(3, -1, "", this);
                    return;
                }
                return;
            }
        }
        C11385n nVar = this.f34725h;
        if (i4 > 0) {
            i3 = -3500;
        }
        nVar.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
