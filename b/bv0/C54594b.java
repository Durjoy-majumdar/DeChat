package bv0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import te3.C49249e9;
import te3.C64278c9;
import te3.C64844xz;
import yu0.C102910f;

/* renamed from: bv0.b */
public class C54594b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f153089d;

    /* renamed from: e */
    public C11385n f153090e;

    public C54594b(LinkedList<C64844xz> linkedList, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64278c9();
        bVar.f127067b = new C49249e9();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bakchatcreateqrcode";
        bVar.f127069d = 704;
        C47350c a = bVar.mo72403a();
        this.f153089d = a;
        C64278c9 c9Var = (C64278c9) a.f127055a.f127080a;
        c9Var.f182437d = linkedList.size();
        c9Var.f182438e = linkedList;
        c9Var.f182440g = C75592q0.m90789s();
        c9Var.f182439f = C87203t.m108278n();
        c9Var.f182443j = str;
        c9Var.f182442i = 0;
        c9Var.f182441h = 2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f153090e = nVar;
        C47350c cVar = this.f153089d;
        C64278c9 c9Var = (C64278c9) cVar.f127055a.f127080a;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 704;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.BackupCreateQRCodeScene", "err: %d, %d, %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C49249e9 e9Var = (C49249e9) this.f153089d.f127056b.f127083a;
            Log.m105925i("MicroMsg.BackupCreateQRCodeScene", "onGYNetEnd QRCodeUrl:%s", e9Var.f132796f);
            C102910f.f303739h = e9Var.f132797g.f140574f.f257327a;
            this.f153090e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f153090e.onSceneEnd(i2, i3, str, this);
    }
}
