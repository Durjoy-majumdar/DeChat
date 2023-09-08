package rb0;

import android.content.Context;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.Date;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qe3.C89625d;
import te3.C51118rj3;
import te3.C51255sj3;

/* renamed from: rb0.m0 */
public class C47993m0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128713d;

    /* renamed from: e */
    public C47350c f128714e;

    /* renamed from: f */
    public Object f128715f;

    public C47993m0(C47969h hVar, int i, int i2, int i3, int i4, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51118rj3();
        bVar.f127067b = new C51255sj3();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/reportpluginstat";
        bVar.f127069d = 2805;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128714e = a;
        C51118rj3 rj32 = (C51118rj3) a.f127055a.f127080a;
        rj32.f140949d = i;
        rj32.f140950e = hVar.field_wwCorpId;
        rj32.f140952g = hVar.field_wwUserVid;
        rj32.f140953h = C86709a0.m107523b().mo121110g();
        rj32.f140954i = i3;
        rj32.f140955j = i2;
        rj32.f140956n = (long) i4;
        rj32.f140957o = new Date().getTime();
        rj32.f140958p = 1;
        rj32.f140959q = ChannelUtil.formatVersion((Context) null, C89625d.f257841g);
        this.f128715f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128713d = nVar;
        Log.m105924i("MicroMsg.NetSceneEnterprisePushStat", "do scene");
        return dispatch(gVar, this.f128714e, this);
    }

    public int getType() {
        return 2805;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneEnterprisePushStat", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f128713d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
