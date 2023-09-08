package hd0;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1081gi.C98121d;
import te3.C101809m04;
import te3.C50476n04;
import te3.dh4;

/* renamed from: hd0.o */
public class C98409o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f288580d;

    /* renamed from: e */
    public C47350c f288581e;

    /* renamed from: f */
    public long f288582f = -1;

    /* renamed from: g */
    public C98408n0 f288583g = null;

    /* renamed from: h */
    public C98121d f288584h = null;

    /* renamed from: i */
    public String f288585i = "";

    public C98409o(long j, C98408n0 n0Var, C98121d dVar, String str) {
        Log.m105925i("MicroMsg.NetSceneMassUploadSight", "massSendId %d, clientId %s", Long.valueOf(j), str);
        this.f288582f = j;
        this.f288583g = n0Var;
        this.f288584h = dVar;
        this.f288585i = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f288580d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C101809m04();
        bVar.f127067b = new C50476n04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendsight";
        bVar.f127069d = WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES;
        C47350c a = bVar.mo72403a();
        this.f288581e = a;
        C101809m04 m042 = (C101809m04) a.f127055a.f127080a;
        m042.f298766g = this.f288584h.field_aesKey;
        m042.f298764e = this.f288585i;
        C98408n0 n0Var = this.f288583g;
        m042.f298765f = n0Var.f288579z;
        m042.f298770n = n0Var.f288566m;
        String r = C98398h0.Bx0().mo137729r(this.f288583g.mo137700d());
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(r);
        if (imageOptions != null) {
            m042.f298772p = imageOptions.outWidth;
            m042.f298771o = imageOptions.outHeight;
        } else {
            Log.m105929w("MicroMsg.NetSceneMassUploadSight", "sight send getImageOptions for thumb failed path:%s", r);
        }
        C98408n0 n0Var2 = this.f288583g;
        m042.f298769j = n0Var2.f288561h;
        String[] split = Util.nullAs(n0Var2.f288578y, "").split(",");
        if (split == null || split.length <= 0) {
            Log.m105921e("MicroMsg.NetSceneMassUploadSight", "cdn upload video done, massSendId[%d], split username fail", Long.valueOf(this.f288582f));
            return -1;
        }
        for (String str : split) {
            dh4 dh4 = new dh4();
            dh4.f132333d = str;
            m042.f298763d.add(dh4);
        }
        m042.f298767h = this.f288584h.field_fileId;
        m042.f298768i = this.f288583g.f288559f;
        return dispatch(gVar, this.f288581e, this);
    }

    public int getType() {
        return WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneMassUploadSight", "cdntra onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " useCdnTransClientId:" + this.f288585i + " massSendId " + this.f288582f);
        this.f288580d.onSceneEnd(i2, i3, str, this);
    }
}
