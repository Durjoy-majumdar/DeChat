package wi0;

import com.tencent.p014mm.plugin.appbrand.config.C81662k;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Objects;
import junit.framework.Assert;
import lp3.C88629c;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C90422jy;
import te3.m55;
import te3.o55;
import za0.C91626a;
import zp0.C39425a;
import zp0.C91823b;

/* renamed from: wi0.o */
public class C90990o extends C91823b<o55> {

    /* renamed from: p */
    public final C47350c f261077p;

    /* renamed from: wi0.o$a */
    public class C90991a implements C88629c.C88630a<C89132b.C89134c<o55>> {
        public C90991a() {
        }

        public Object call() {
            return C89132b.C89134c.m111401a(4, -2, "", null, (C117747y) null, C90990o.this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90990o(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            te3.jy r6 = new te3.jy
            r6.<init>()
            r0 = 1
            r6.f259641f = r0
            r4 = 0
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C90990o.<init>(java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: h */
    public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        super.mo10094h(i, i2, str, (o55) eu32, yVar);
        Log.m105925i("MicroMsg.CgiWxaAttrSync", "onCgiBack errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* renamed from: q */
    public C89059e<C89132b.C89134c<o55>> mo109760q() {
        C47465a aVar = this.f261077p.f127055a.f127080a;
        if (!C39425a.m42111a(((m55) aVar).f137854f, ((m55) aVar).f137852d)) {
            return C89060f.m111325d(new C90991a());
        }
        return null;
    }

    public C90990o(String str, String str2, boolean z, String str3, int i, C90422jy jyVar) {
        super(str2, str);
        C89349b bVar;
        if (BuildInfo.DEBUG && Util.isNullOrNil(str) && Util.isNullOrNil(str2)) {
            Assert.fail("username and appId should not be null or nil!");
        }
        if (BuildInfo.DEBUG && !Util.isNullOrNil(str) && !str.endsWith("@app")) {
            Assert.fail("username should end with '@app', call @smoothieli to fix this");
        }
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        m55 m55 = new m55();
        m55.f137852d = str;
        if (z) {
            bVar = null;
        } else {
            bVar = Util.isNullOrNil(str) ? C81662k.m100188g(str2) : C81662k.m100187f(str);
        }
        m55.f137853e = bVar;
        m55.f137854f = str2;
        m55.f137855g = str3;
        m55.f137856h = i;
        Objects.requireNonNull(jyVar);
        m55.f137857i = jyVar;
        bVar2.mo72405c(m55);
        bVar2.mo72407e(new o55());
        bVar2.mo72404b(1151);
        bVar2.mo72409g("/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync");
        C47350c a = bVar2.mo72403a();
        this.f261077p = a;
        mo123453j(a);
        Log.m105925i("MicroMsg.CgiWxaAttrSync", "<init> hash:%d, username:%s, appId:%s, cleanUpdate:%b, instanceId:%s, scene:%d, source:%s", Integer.valueOf(hashCode()), str, str2, Boolean.valueOf(z), str3, Integer.valueOf(i), C91626a.m114981a(jyVar));
    }
}
