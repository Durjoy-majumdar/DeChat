package mk2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.LinkedList;
import ob0.C11385n;
import te3.C90430p93;
import te3.C90435r93;
import y02.C91357a;
import y02.C91363f;

/* renamed from: mk2.c */
public class C88740c extends C91357a implements C88739b {
    public C88740c(String str, String str2, boolean z) {
        this.f262030i = "rtosconfig";
        this.f262027f = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(BuildInfo.IS_ARM64 ? "_arm64-v8a" : "_armeabi-v7a");
        this.f262028g = sb.toString();
        LinkedList<C90430p93> b = C91363f.m114614b();
        this.f262029h = b;
        C90430p93 p932 = new C90430p93();
        p932.f259737d = "patchId";
        p932.f259738e = MultiProcessMMKV.getDefault().getString("patch_id", "").toString();
        b.add(p932);
        this.f262033o = z ^ true ? 1 : 0;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.Rtos.NetSceneCheckSoRes", "doScene type:%s, baseId:%s, patchId:%s, scene:%d", this.f262030i, this.f262027f, this.f262028g, Integer.valueOf(this.f262033o));
        return super.doScene(gVar, nVar);
    }

    public C90435r93 getResponse() {
        return (C90435r93) this.f262025d.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Rtos.NetSceneCheckSoRes", "errType:%d errCode:%d errMsg:%s ", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f262026e.onSceneEnd(i2, i3, str, this);
    }
}
