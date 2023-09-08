package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import sj0.C90211g;
import te3.C50890py3;
import te3.C51031qy3;
import te3.io4;
import te3.ko4;

/* renamed from: xm2.r */
public class C53387r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150221d;

    /* renamed from: e */
    public String f150222e;

    /* renamed from: f */
    public C51031qy3 f150223f;

    /* renamed from: g */
    public byte[] f150224g;

    /* renamed from: h */
    public boolean f150225h;

    public C53387r(String str, byte[] bArr, boolean z) {
        this.f150222e = str;
        this.f150224g = bArr;
        this.f150225h = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150221d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50890py3 py32 = new C50890py3();
        py32.f140052d = this.f150222e;
        py32.f140054f = this.f150225h;
        byte[] bArr = this.f150224g;
        if (bArr != null) {
            py32.f140053e = C48374j0.m53712a(bArr).f140574f;
        }
        bVar.f127066a = py32;
        bVar.f127067b = new C51031qy3();
        bVar.f127069d = C90211g.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/searchuserauth";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return dispatch(gVar, bVar.mo72403a(), this);
    }

    public int getType() {
        return C90211g.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51031qy3 qy32 = (C51031qy3) ((C47350c) uVar).f127056b.f127083a;
        this.f150223f = qy32;
        if (qy32 != null) {
            Object[] objArr = new Object[3];
            int i4 = 0;
            objArr[0] = qy32.f140618f;
            objArr[1] = Integer.valueOf(qy32.f140619g);
            LinkedList<io4> linkedList = this.f150223f.f140617e;
            if (linkedList != null) {
                i4 = linkedList.size();
            }
            objArr[2] = Integer.valueOf(i4);
            Log.m105925i("MicroMsg.NetSceneSearchUserAuth", "searchUserAuth nextPageData: %s, flag: %s, size: %s", objArr);
        }
        ko4 ko4 = this.f150223f.f140616d;
        if (ko4 != null) {
            i3 = ko4.f136919d;
            str = ko4.f136920e;
        }
        this.f150221d.onSceneEnd(i2, i3, str, this);
    }
}
