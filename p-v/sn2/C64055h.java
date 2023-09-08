package sn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C47350c;
import p680ru.C101464l;
import qc0.C77328l;
import te3.C49335eu3;
import te3.C51018qv3;
import te3.C64649q34;
import te3.C64672r34;

/* renamed from: sn2.h */
public class C64055h extends C48436g {

    /* renamed from: f */
    public C11385n f181598f;

    /* renamed from: g */
    public final C47350c f181599g;

    public C64055h(byte[] bArr, int i, long j, int i2, boolean z, int i3) {
        super(bArr, i, j, i2, z, i3);
        float f;
        float f2;
        float f3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64649q34();
        bVar.f127067b = new C64672r34();
        bVar.f127068c = "/cgi-bin/micromsg-bin/shakemusic";
        bVar.f127069d = 367;
        bVar.f127070e = WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL;
        bVar.f127071f = 1000000177;
        C47350c a = bVar.mo72403a();
        this.f181599g = a;
        C64649q34 q342 = (C64649q34) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        q342.f184962d = qv32;
        q342.f184963e = i2;
        q342.f184964f = z ? 1 : 0;
        q342.f184965g = (float) i;
        q342.f184966h = C114786m0.m161568a(MMApplicationContext.getContext()) ? 1 : 2;
        q342.f184967i = i3;
        int i4 = 0;
        float f4 = 0.0f;
        try {
            f = Util.getFloat((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_LATITUDE_STRING, (Object) null), 0.0f);
            try {
                f2 = Util.getFloat((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_LONGTITUDE_STRING, (Object) null), 0.0f);
                try {
                    i4 = Util.safeParseInt((String) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_SHAKE_TV_ACCURACY_STRING, (Object) null));
                } catch (Exception unused) {
                    float f5 = f;
                    f3 = f2;
                    f4 = f5;
                    float f6 = f3;
                    f = f4;
                    f2 = f6;
                    q342.f184969n = f;
                    q342.f184968j = f2;
                    q342.f184970o = true ^ C77328l.m93192a() ? 1 : 0;
                    q342.f184971p = C77328l.m93193b() ? 1 : 0;
                    ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2014, q342.f184968j, q342.f184969n, i4);
                }
            } catch (Exception unused2) {
                f4 = f;
                f3 = 0.0f;
                float f64 = f3;
                f = f4;
                f2 = f64;
                q342.f184969n = f;
                q342.f184968j = f2;
                q342.f184970o = true ^ C77328l.m93192a() ? 1 : 0;
                q342.f184971p = C77328l.m93193b() ? 1 : 0;
                ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2014, q342.f184968j, q342.f184969n, i4);
            }
        } catch (Exception unused3) {
            f3 = 0.0f;
            float f642 = f3;
            f = f4;
            f2 = f642;
            q342.f184969n = f;
            q342.f184968j = f2;
            q342.f184970o = true ^ C77328l.m93192a() ? 1 : 0;
            q342.f184971p = C77328l.m93193b() ? 1 : 0;
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2014, q342.f184968j, q342.f184969n, i4);
        }
        q342.f184969n = f;
        q342.f184968j = f2;
        q342.f184970o = true ^ C77328l.m93192a() ? 1 : 0;
        q342.f184971p = C77328l.m93193b() ? 1 : 0;
        ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2014, q342.f184968j, q342.f184969n, i4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C64649q34 q342 = (C64649q34) this.f181599g.f127055a.f127080a;
        Log.m105919d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder doscene dataid:%d data:%d endflag:%d voice:%f nettype:%d ver:%d", Integer.valueOf(q342.f184963e), Integer.valueOf(q342.f184962d.f140572d), Integer.valueOf(q342.f184964f), Float.valueOf(q342.f184965g), Integer.valueOf(q342.f184966h), Integer.valueOf(q342.f184967i));
        this.f181598f = nVar;
        return dispatch(gVar, this.f181599g, this);
    }

    public int getType() {
        return 367;
    }

    /* renamed from: j1 */
    public C49335eu3 mo73108j1() {
        return (C64672r34) this.f181599g.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar = this.f181599g;
        C64672r34 r342 = (C64672r34) cVar.f127056b.f127083a;
        Log.m105919d("MicroMsg.NetSceneShakeMusic", "MusicFingerPrintRecorder onGYNetEnd [%d,%d] dataid:%d endflag:%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(((C64649q34) cVar.f127055a.f127080a).f184963e), Integer.valueOf(r342.f185106d));
        if (i2 == 0 && i3 == 0 && r342.f185106d == 1) {
            this.f129614d = true;
        }
        this.f181598f.onSceneEnd(i2, i3, str, this);
    }
}
