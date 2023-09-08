package cg2;

import ag2.C39599v0;
import ag2.C54030u0;
import android.net.Uri;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116299g2;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p213oh.C11412b;

/* renamed from: cg2.a */
public class C54716a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f153353d;

    /* renamed from: e */
    public C11385n f153354e;

    /* renamed from: f */
    public String f153355f;

    /* renamed from: g */
    public String f153356g;

    public C54716a(String str, int i, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 11665;
        bVar.f127068c = "/cgi-bin/xmmailbroker/mb_createuploadurl";
        this.f153355f = str;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C54030u0 u0Var = new C54030u0();
        u0Var.f151296d = (long) C86709a0.m107523b().mo121110g();
        String path2 = n.getPath();
        int lastIndexOf = path2.lastIndexOf("/");
        u0Var.f151297e = lastIndexOf >= 0 ? path2.substring(lastIndexOf + 1) : path2;
        u0Var.f151298f = i;
        u0Var.f151299g = str2;
        u0Var.f151300h = str3;
        this.f153356g = str2;
        bVar.f127066a = u0Var;
        bVar.f127067b = new C39599v0();
        this.f153353d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f153354e = nVar;
        return dispatch(gVar, this.f153353d, this);
    }

    public int getType() {
        return 11665;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.Mail.NetSceneCreateUploadUrl", "errType:%s errCode%s errMsg:%s", objArr);
        this.f153354e.onSceneEnd(i2, i3, str, this);
    }
}
