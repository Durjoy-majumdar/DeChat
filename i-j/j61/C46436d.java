package j61;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.text.DecimalFormat;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50094k80;
import te3.C50642o7;
import te3.C50790p7;

/* renamed from: j61.d */
public class C46436d extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f125061d;

    /* renamed from: e */
    public C11385n f125062e;

    /* renamed from: f */
    public String f125063f;

    /* renamed from: g */
    public C50094k80 f125064g;

    /* renamed from: h */
    public final int f125065h;

    /* renamed from: i */
    public final int f125066i;

    public C46436d(String str, C50094k80 k802, int i, int i2) {
        this.f125065h = i;
        this.f125066i = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50642o7();
        bVar.f127067b = new C50790p7();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmaskforreward";
        bVar.f127069d = 830;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f125061d = bVar.mo72403a();
        this.f125063f = str;
        this.f125064g = k802;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125062e = nVar;
        C50642o7 o7Var = (C50642o7) this.f125061d.f127055a.f127080a;
        o7Var.f138993g = this.f125065h;
        o7Var.f138994h = this.f125066i;
        o7Var.f138990d = this.f125063f;
        C50094k80 k802 = new C50094k80();
        C50094k80 k803 = this.f125064g;
        k802.f136606d = k803.f136606d;
        k802.f136608f = k803.f136608f;
        try {
            k802.f136607e = new DecimalFormat("0.00").format(Float.valueOf(this.f125064g.f136607e));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.emoji.NetSceneAskForReward", e, "format error %s", this.f125064g.f136607e);
            k802.f136607e = "0.00";
        }
        Log.m105925i("MicroMsg.emoji.NetSceneAskForReward", "doScene scene:%s, enterScene:%s", Integer.valueOf(this.f125065h), Integer.valueOf(this.f125066i));
        o7Var.f138991e = k802;
        return dispatch(gVar, this.f125061d, this);
    }

    public int getType() {
        return 830;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.emoji.NetSceneAskForReward", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f125062e.onSceneEnd(i2, i3, str, this);
    }
}
