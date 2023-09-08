package p714us;

import com.tencent.p014mm.modelsimple.C40368s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import ob0.C47350c;
import p728vs.C52989c;
import p728vs.C52990d;
import p728vs.C52991e;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C51874wt1;

@C86522b
/* renamed from: us.b */
public class C52603b extends C86301e implements C52989c, C52990d {
    /* renamed from: Kx */
    public C52991e mo73573Kx(String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, byte[] bArr, String str4, String str5) {
        C40368s sVar = new C40368s(str, i2);
        C51874wt1 wt12 = (C51874wt1) sVar.f108483e.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = i;
        wt12.f144276p = str2;
        wt12.f144259G = str4;
        wt12.f144260H = str5;
        wt12.f144279s = i2;
        wt12.f144283w = i3;
        wt12.f144284x = i4;
        wt12.f144285y = i5;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str3;
        rv33.f141176e = true;
        wt12.f144269f = rv33;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        wt12.f144254B = qv32;
        Log.m105918d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + str + ", username = " + str2 + ", scene = " + i + ", reason = " + i2 + ", codeType = " + i3 + ", codeVersion = " + i4 + ", requestId = " + i5 + ",msgUsername = " + str4 + ", svrMsgId = " + str5);
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", Util.encodeHexString(bArr));
        return sVar;
    }

    /* renamed from: Lx */
    public C52991e mo73574Lx(int i, int i2) {
        C40368s sVar = new C40368s();
        C51874wt1 wt12 = (C51874wt1) sVar.f108483e.f127055a.f127080a;
        wt12.f144267d = 3;
        wt12.f144275o = 5;
        wt12.f144274n = i;
        wt12.f144285y = i2;
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "dkwt geta8key friendQQNum:%d  a2key-len:%d requestId", Integer.valueOf(i), Integer.valueOf(wt12.f144268e.f140572d), Integer.valueOf(i2));
        return sVar;
    }

    public C52991e N60(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, String str5, int i5, byte[] bArr) {
        String str6 = str;
        String str7 = str2;
        int i6 = i2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        C40368s sVar = new C40368s(str6, i6);
        C51874wt1 wt12 = (C51874wt1) sVar.f108483e.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str6;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = i;
        wt12.f144276p = str7;
        wt12.f144279s = i6;
        wt12.f144281u = i3;
        wt12.f144282v = str8;
        wt12.f144285y = i4;
        wt12.f144286z = str10;
        wt12.f144253A = i5;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str9;
        rv33.f141176e = true;
        wt12.f144269f = rv33;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        wt12.f144254B = qv32;
        Log.m105925i("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = %s, username = %s, scene = %d, reason = %d, flag = %d, netType = %s, requestId = %d, appId = %s, functionId = %s, wallentRegion = %d, a8KeyCookie = %s", str6, str7, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str8, Integer.valueOf(i4), str9, str10, Integer.valueOf(i5), Util.encodeHexString(bArr));
        return sVar;
    }

    /* renamed from: cO */
    public C47350c mo73576cO(String str, int i) {
        return C40368s.C40369a.m43560b(str, i);
    }

    public C52991e nq0(String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, byte[] bArr) {
        C40368s sVar = new C40368s(str, i2);
        C51874wt1 wt12 = (C51874wt1) sVar.f108483e.f127055a.f127080a;
        wt12.f144267d = 2;
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        wt12.f144272i = rv32;
        wt12.f144275o = i;
        wt12.f144276p = str2;
        wt12.f144279s = i2;
        wt12.f144283w = i3;
        wt12.f144284x = i4;
        wt12.f144285y = i5;
        C51163rv3 rv33 = new C51163rv3();
        rv33.f141175d = str3;
        rv33.f141176e = true;
        wt12.f144269f = rv33;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        wt12.f144254B = qv32;
        Log.m105918d("MicroMsg.NetSceneGetA8Key", "get a8key reqUrl = " + str + ", username = " + str2 + ", scene = " + i + ", reason = " + i2 + ", codeType = " + i3 + ", codeVersion = " + i4 + ", requestId = " + i5);
        Log.m105919d("MicroMsg.NetSceneGetA8Key", "a8KeyCookie = %s", Util.encodeHexString(bArr));
        return sVar;
    }

    public C52991e uk0(String str, String str2, String str3, int i) {
        return new C40368s(str, str2, str3, i);
    }

    /* renamed from: xD */
    public C52991e mo73579xD(String str, String str2, int i, int i2, int i3, byte[] bArr) {
        return new C40368s(str, str2, i, i2, i3, bArr);
    }

    /* renamed from: xT */
    public C47350c mo73580xT(C47350c cVar) {
        C40368s.C40369a.m43559a(cVar);
        return cVar;
    }
}
