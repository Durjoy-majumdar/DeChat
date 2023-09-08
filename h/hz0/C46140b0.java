package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49346ex1;
import te3.C49484fx1;

/* renamed from: hz0.b0 */
public class C46140b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f124337d;

    /* renamed from: e */
    public C11385n f124338e;

    /* renamed from: f */
    public LinkedList<String> f124339f;

    /* renamed from: g */
    public int f124340g;

    /* renamed from: h */
    public int f124341h;

    /* renamed from: i */
    public int f124342i;

    public C46140b0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49346ex1();
        bVar.f127067b = new C49484fx1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcardserial";
        bVar.f127069d = 577;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f124337d = a;
        ((C49346ex1) a.f127055a.f127080a).f133160d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f124338e = nVar;
        return dispatch(gVar, this.f124337d, this);
    }

    public int getType() {
        return 577;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C49484fx1 fx12 = (C49484fx1) this.f124337d.f127056b.f127083a;
            this.f124339f = fx12.f133725d;
            this.f124340g = fx12.f133726e;
            this.f124341h = fx12.f133727f;
            this.f124342i = fx12.f133728g;
        }
        Log.m105925i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", Integer.valueOf(this.f124340g), Integer.valueOf(this.f124341h), Integer.valueOf(this.f124342i));
        if (this.f124339f != null) {
            Log.m105924i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.f124339f.size());
        }
        this.f124338e.onSceneEnd(i2, i3, str, this);
    }
}
