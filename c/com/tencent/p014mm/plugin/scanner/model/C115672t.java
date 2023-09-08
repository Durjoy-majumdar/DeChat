package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C118462r33;
import te3.C64648q33;
import te3.bk4;

/* renamed from: com.tencent.mm.plugin.scanner.model.t */
public class C115672t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f347012d;

    /* renamed from: e */
    public C47350c f347013e;

    /* renamed from: f */
    public float f347014f;

    /* renamed from: g */
    public List<bk4> f347015g;

    /* renamed from: h */
    public int f347016h;

    /* renamed from: i */
    public long f347017i;

    /* renamed from: j */
    public int f347018j;

    /* renamed from: n */
    public boolean f347019n;

    /* renamed from: o */
    public String f347020o;

    /* renamed from: p */
    public String f347021p;

    /* renamed from: q */
    public int f347022q;

    /* renamed from: r */
    public float f347023r;

    /* renamed from: s */
    public String f347024s;

    /* renamed from: t */
    public String f347025t;

    /* renamed from: u */
    public String f347026u;

    public C115672t(int i, int i2, String str, String str2, int i3, int i4) {
        this(0, i, i2, str, str2, i3, i4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f347012d = nVar;
        this.f347017i = System.currentTimeMillis();
        return dispatch(gVar, this.f347013e, this);
    }

    public int getType() {
        if (this.f347018j == 0) {
            return JsApiOperateRecorder.CTRL_INDEX;
        }
        return 294;
    }

    /* renamed from: j1 */
    public float mo175931j1() {
        return this.f347019n ? this.f347023r : this.f347014f;
    }

    /* renamed from: k1 */
    public String mo175932k1() {
        return this.f347019n ? this.f347025t : ((C118462r33) this.f347013e.f127056b.f127083a).f354303i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C118462r33 r332 = (C118462r33) ((C47350c) uVar).f127056b.f127083a;
        this.f347014f = r332.f354301g;
        this.f347015g = r332.f354299e;
        boolean z = r332.f354305n;
        this.f347019n = z;
        if (z) {
            this.f347020o = r332.f354306o.mo123705h();
            this.f347021p = r332.f354307p.mo123705h();
            this.f347022q = r332.f354308q;
            this.f347023r = r332.f354309r;
            this.f347024s = r332.f354310s.mo123705h();
            this.f347025t = r332.f354311t.mo123705h();
            this.f347026u = r332.f354312u.mo123705h();
        }
        this.f347012d.onSceneEnd(i2, i3, str, this);
    }

    public C115672t(int i, int i2, int i3, String str, String str2, int i4, int i5) {
        this.f347019n = false;
        this.f347020o = "";
        this.f347021p = "";
        this.f347022q = 0;
        this.f347023r = 0.0f;
        this.f347024s = "";
        this.f347025t = "";
        this.f347026u = "";
        this.f347018j = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64648q33 q332 = new C64648q33();
        q332.f184951d = i2;
        q332.f184952e = i3;
        q332.f184957j = str;
        q332.f184958n = str2;
        q332.f184959o = i;
        q332.f184960p = i4;
        q332.f184961q = i5;
        bVar.f127066a = q332;
        bVar.f127067b = new C118462r33();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newocrtranslation";
        bVar.f127069d = getType();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f347013e = bVar.mo72403a();
        this.f347016h = i2;
    }
}
