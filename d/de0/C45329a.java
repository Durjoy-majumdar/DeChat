package de0;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.concurrent.atomic.AtomicBoolean;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49943j42;
import te3.C50079k42;

/* renamed from: de0.a */
public class C45329a extends C117747y implements C1311n {

    /* renamed from: f */
    public static AtomicBoolean f122787f = new AtomicBoolean(false);

    /* renamed from: d */
    public C47350c f122788d = null;

    /* renamed from: e */
    public C11385n f122789e;

    public C45329a() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 6238;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getnetworkinfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127077l = 0;
        bVar.f127079n = null;
        bVar.f127066a = new C49943j42();
        bVar.f127067b = new C50079k42();
        bVar.f127079n = null;
        this.f122788d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f122789e = nVar;
        C49943j42 j422 = (C49943j42) this.f122788d.f127055a.f127080a;
        try {
            String[] i5 = C86709a0.m107529k().f251779b.f256809d.mo55478i5("newdns");
            if (i5 != null) {
                if (i5.length == 3) {
                    j422.f135858d = TextUtils.isEmpty(i5[0]) ? "" : i5[0];
                    j422.f135859e = TextUtils.isEmpty(i5[1]) ? "" : i5[1];
                    j422.f135860f = TextUtils.isEmpty(i5[2]) ? "" : i5[2];
                    f122787f.set(true);
                    Log.m105924i("MicroMsg.MMNetIdRequest", "net id from newdns " + j422.f135858d + " client ip " + j422.f135860f);
                    return dispatch(gVar, this.f122788d, this);
                }
            }
            j422.f135858d = "";
            j422.f135859e = "";
            j422.f135860f = "";
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MMNetIdRequest", e.getLocalizedMessage());
            j422.f135858d = "";
            j422.f135859e = "";
            j422.f135860f = "";
        }
        f122787f.set(true);
        Log.m105924i("MicroMsg.MMNetIdRequest", "net id from newdns " + j422.f135858d + " client ip " + j422.f135860f);
        return dispatch(gVar, this.f122788d, this);
    }

    public int getType() {
        return 6238;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.MMNetIdRequest", "ErrType:" + i2 + "   errCode:" + i3 + " error msg " + str);
        f122787f.set(false);
        if (i3 == 0 && i2 == 0) {
            C50079k42 k422 = (C50079k42) ((C47350c) uVar).f127056b.f127083a;
            try {
                C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
                if (!(gVar == null || k422 == null)) {
                    Log.m105918d("MicroMsg.MMNetIdRequest", "receive netinfo id " + k422.f136543d + " clinet ip " + k422.f136546g + " isp " + k422.f136545f);
                    gVar.mo55464Y5(k422.f136543d, String.valueOf(k422.f136545f), k422.f136546g);
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MMNetIdRequest", e.getLocalizedMessage());
            }
        }
        this.f122789e.onSceneEnd(i2, i3, str, this);
    }
}
