package sn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C47350c;
import p680ru.C101464l;
import te3.C49335eu3;
import te3.C51018qv3;
import te3.C51641v34;
import te3.C64743u34;

/* renamed from: sn2.j */
public class C64056j extends C48436g {

    /* renamed from: f */
    public C11385n f181600f;

    /* renamed from: g */
    public final C47350c f181601g;

    public C64056j(byte[] bArr, int i, long j, int i2, boolean z, int i3) {
        super(bArr, i, j, i2, z, i3);
        float f;
        float f2;
        float f3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64743u34();
        bVar.f127067b = new C51641v34();
        bVar.f127068c = "/cgi-bin/micromsg-bin/shaketv";
        bVar.f127069d = 408;
        int i4 = 0;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f181601g = a;
        C64743u34 u342 = (C64743u34) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        u342.f185699d = qv32;
        u342.f185700e = i2;
        u342.f185701f = z ? 1 : 0;
        u342.f185702g = (float) i;
        u342.f185703h = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
        u342.f185704i = i3;
        float f4 = 0.0f;
        try {
            f = Util.getFloat((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_LATITUDE_STRING, (Object) null), 0.0f);
            try {
                f2 = Util.getFloat((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_LONGTITUDE_STRING, (Object) null), 0.0f);
            } catch (Exception unused) {
                f4 = f;
                f3 = 0.0f;
                float f5 = f3;
                f = f4;
                f2 = f5;
                u342.f185706n = f;
                u342.f185705j = f2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2009, u342.f185705j, u342.f185706n, i4);
            }
            try {
                i4 = Util.safeParseInt((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_ACCURACY_STRING, (Object) null));
            } catch (Exception unused2) {
                float f6 = f;
                f3 = f2;
                f4 = f6;
                float f54 = f3;
                f = f4;
                f2 = f54;
                u342.f185706n = f;
                u342.f185705j = f2;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2009, u342.f185705j, u342.f185706n, i4);
            }
        } catch (Exception unused3) {
            f3 = 0.0f;
            float f542 = f3;
            f = f4;
            f2 = f542;
            u342.f185706n = f;
            u342.f185705j = f2;
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2009, u342.f185705j, u342.f185706n, i4);
        }
        u342.f185706n = f;
        u342.f185705j = f2;
        ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2009, u342.f185705j, u342.f185706n, i4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C64743u34 u342 = (C64743u34) this.f181601g.f127055a.f127080a;
        Log.m105919d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", Integer.valueOf(u342.f185700e), Integer.valueOf(u342.f185699d.f140572d), Integer.valueOf(u342.f185701f), Float.valueOf(u342.f185702g), Integer.valueOf(u342.f185703h), Integer.valueOf(u342.f185704i));
        this.f181600f = nVar;
        return dispatch(gVar, this.f181601g, this);
    }

    public int getType() {
        return 408;
    }

    /* renamed from: j1 */
    public C49335eu3 mo73108j1() {
        return (C51641v34) this.f181601g.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar = this.f181601g;
        C51641v34 v342 = (C51641v34) cVar.f127056b.f127083a;
        Log.m105919d("MicroMsg.NetSceneShakeTV", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(((C64743u34) cVar.f127055a.f127080a).f185700e), Integer.valueOf(v342.f143286d));
        if (i2 == 0 && i3 == 0 && v342.f143286d == 1) {
            this.f129614d = true;
        }
        this.f181600f.onSceneEnd(i2, i3, str, this);
    }
}
