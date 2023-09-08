package k32;

import com.tencent.p014mm.sdk.platformtools.Log;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C51211s83;
import te3.C64725t83;

/* renamed from: k32.c */
public class C46638c extends C46637b<C51211s83, C64725t83> {
    public C46638c(String str, String str2, byte[] bArr) {
        Req s832 = new C51211s83();
        s832.f141374d = str;
        s832.f141375e = str2;
        s832.f141376f = C89349b.m111674a(bArr);
        this.f125572b = s832;
    }

    /* renamed from: b */
    public C49335eu3 mo71902b() {
        return new C64725t83();
    }

    /* renamed from: c */
    public int mo71903c() {
        return 2701;
    }

    /* renamed from: d */
    public String mo71904d() {
        return "/cgi-bin/mmbiz-bin/wxahb/openwxaapphb";
    }

    /* renamed from: e */
    public void mo71905e() {
        Log.m105924i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiEnd ");
    }

    /* renamed from: f */
    public void mo71906f() {
        Log.m105924i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiStart ");
    }
}
