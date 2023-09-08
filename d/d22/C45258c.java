package d22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72955b2;
import java.util.ArrayList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50625o20;
import te3.C50769p20;

/* renamed from: d22.c */
public class C45258c extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f122603d;

    /* renamed from: e */
    public C11385n f122604e;

    /* renamed from: f */
    public String f122605f = null;

    /* renamed from: g */
    public ArrayList<C72955b2> f122606g = new ArrayList<>();

    public C45258c(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50625o20();
        bVar.f127067b = new C50769p20();
        bVar.f127068c = "/cgi-bin/micromsg-bin/delcontactlabel";
        bVar.f127069d = 636;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f122603d = bVar.mo72403a();
        this.f122605f = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122604e = nVar;
        C50625o20 o202 = (C50625o20) this.f122603d.f127055a.f127080a;
        String str = this.f122605f;
        o202.f138911d = str;
        if (str == null || Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.Label.NetSceneDelContactLabel", "cpan[doScene] label id list is null.");
            nVar.onSceneEnd(3, -1, "[doScene]empty label is list.", this);
            return 0;
        }
        o202.f138911d = this.f122605f;
        return dispatch(gVar, this.f122603d, this);
    }

    public int getType() {
        return 636;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.Label.NetSceneDelContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f122604e.onSceneEnd(i2, i3, str, this);
    }
}
