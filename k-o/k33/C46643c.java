package k33;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import eb0.C45624q3;
import eb0.C45627r3;
import ob0.C117746w;
import qe3.C89631w;

/* renamed from: k33.c */
public final class C46643c extends C117746w {

    /* renamed from: a */
    public C45624q3 f125576a = new C45624q3();

    /* renamed from: b */
    public C45627r3 f125577b = new C45627r3();

    public int getOptions() {
        return 1;
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f125576a;
    }

    public C89631w.C89636e getRespObj() {
        return this.f125577b;
    }

    public int getType() {
        return C1884v4.CTRL_INDEX;
    }

    public String getUri() {
        return "/cgi-bin/micromsg-bin/getvoiceprintticketrsa";
    }
}
