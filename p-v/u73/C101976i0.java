package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101772du2;
import te3.C49334eu2;
import te3.C49768hy;

/* renamed from: u73.i0 */
public class C101976i0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300265d;

    /* renamed from: e */
    public C47350c f300266e;

    /* renamed from: f */
    public C49334eu2 f300267f;

    /* renamed from: g */
    public int f300268g;

    /* renamed from: h */
    public int f300269h;

    /* renamed from: i */
    public String f300270i;

    /* renamed from: j */
    public String f300271j;

    public C101976i0(int i, int i2, int i3, int i4, String str, long j, String str2, String str3, String str4) {
        this(i, i2, i3, i4, str, j, str2, str3, str4, (List<C49768hy>) null);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300265d = nVar;
        return dispatch(gVar, this.f300266e, this);
    }

    public int getType() {
        return 1048;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2);
        if (i4 == 0 && i5 == 0) {
            this.f300267f = (C49334eu2) this.f300266e.f127056b.f127083a;
            C14136q0.m13474f(207, this.f300269h, this.f300271j, "", "", 0, true, this.f300270i, true, "", "", 1048);
            this.f300265d.onSceneEnd(i4, i5, str2, this);
            return;
        }
        C14136q0.m13474f(207, this.f300269h, this.f300271j, "", "", 0, true, this.f300270i, false, "", "", 1048);
        this.f300265d.onSceneEnd(i4, i5, str2, this);
    }

    public C101976i0(int i, int i2, int i3, int i4, String str, long j, String str2, String str3, String str4, List<C49768hy> list) {
        int i5 = i;
        int i6 = i2;
        String str5 = str3;
        List<C49768hy> list2 = list;
        this.f300269h = i5;
        this.f300268g = i6;
        this.f300270i = str2;
        this.f300271j = str5;
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1048;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchguide";
        bVar.f127066a = new C101772du2();
        bVar.f127067b = new C49334eu2();
        C47350c a = bVar.mo72403a();
        this.f300266e = a;
        C101772du2 du22 = (C101772du2) a.f127055a.f127080a;
        du22.f298139d = i5;
        du22.f298140e = i3;
        du22.f298141f = C101987v0.m134273g();
        du22.f298142g = i6;
        du22.f298143h = str;
        du22.f298144i = j;
        du22.f298145j = str5;
        du22.f298146n = str4;
        du22.f298147o = C101987v0.m134272f();
        if (list2 != null) {
            du22.f298148p.addAll(list2);
        }
        C14136q0.m13474f(204, i, str3, "", "", 0, true, str2, true, (String) null, "", i2);
    }
}
