package mv2;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1706k2;
import ob0.C117746w;
import qe3.C89631w;

/* renamed from: mv2.b */
public final class C47102b extends C117746w {

    /* renamed from: a */
    public C47103c f126573a = new C47103c();

    /* renamed from: b */
    public C47104d f126574b = new C47104d();

    public int getOptions() {
        return 1;
    }

    public C89631w.C89634d getReqObjImp() {
        return this.f126573a;
    }

    public C89631w.C89636e getRespObj() {
        return this.f126574b;
    }

    public int getType() {
        return C1706k2.CTRL_INDEX;
    }

    public String getUri() {
        return "/cgi-bin/micromsg-bin/updatesoteraskrsa";
    }
}
