package pb1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51039r02;
import te3.C51184s02;

/* renamed from: pb1.q1 */
public class C47452q1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f127278d;

    /* renamed from: e */
    public C11385n f127279e = null;

    public C47452q1() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51039r02();
        bVar.f127067b = new C51184s02();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getfavinfo";
        bVar.f127069d = 438;
        bVar.f127070e = 217;
        bVar.f127071f = 1000000217;
        this.f127278d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127279e = nVar;
        return dispatch(gVar, this.f127278d, this);
    }

    public int getType() {
        return 438;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetFavInfo", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C51184s02 s022 = (C51184s02) ((C47350c) uVar).f127056b.f127083a;
            Log.m105927v("MicroMsg.NetSceneGetFavInfo", "used:%d  total:%d  mxDown:%d  mxUp:%d  mxFile:%d", Long.valueOf(s022.f141248d), Long.valueOf(s022.f141249e), Integer.valueOf(s022.f141252h), Integer.valueOf(s022.f141251g), Integer.valueOf(s022.f141250f));
            C100734q.m131869q0(s022.f141248d);
            long j = s022.f141249e;
            Log.m105925i("MicroMsg.Fav.FavApiLogic", "setTotalCapacity:%d", Long.valueOf(j));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERFINO_FAV_TOTAL_CAPACITY_LONG, Long.valueOf(j));
            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putLong("fav_mx_auto_download_size", (long) s022.f141252h).commit();
            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putLong("fav_mx_auto_upload_size", (long) s022.f141251g).commit();
            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putLong("fav_mx_file_size", (long) s022.f141250f).commit();
        }
        this.f127279e.onSceneEnd(i2, i3, str, this);
    }
}
