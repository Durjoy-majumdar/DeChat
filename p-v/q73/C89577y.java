package q73;

import com.github.henryye.nativeiv.ImageDecodeConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.io.InputStream;
import p1030s6.C90132b;
import z04.C112551y;

/* renamed from: q73.y */
public final class C89577y implements C90132b {

    /* renamed from: a */
    public final /* synthetic */ C89567w f257775a;

    public C89577y(C89567w wVar) {
        this.f257775a = wVar;
    }

    /* renamed from: a */
    public String mo109801a() {
        return "appbrand_file";
    }

    public boolean accept(Object obj) {
        C87412m.m108594g(obj, "obj");
        return true;
    }

    /* renamed from: b */
    public C90132b.C90133a mo109803b(Object obj, ImageDecodeConfig imageDecodeConfig) {
        C87412m.m108594g(obj, "path");
        C90132b.C90133a aVar = new C90132b.C90133a();
        if (!(obj instanceof String)) {
            Log.m105925i(this.f257775a.f257756F, "fetch path %s not string", obj);
            return aVar;
        }
        String str = (String) obj;
        if (C112551y.m153819s(str, "data:image", false)) {
            Log.m105920e(this.f257775a.f257756F, "fetch fail not my path");
            return aVar;
        }
        Log.m105925i(this.f257775a.f257756F, "fetch path %s", obj);
        InputStream a = this.f257775a.f257753C.mo63188a(str);
        aVar.f258828a = a;
        if (a == null) {
            aVar.f258828a = this.f257775a.f257754D.mo63188a(str);
        }
        if (aVar.f258828a == null) {
            Log.m105921e(this.f257775a.f257756F, "fetch fail %s", obj);
            aVar.f258829b = "read fail";
        }
        return aVar;
    }
}
