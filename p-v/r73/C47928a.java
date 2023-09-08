package r73;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import r73.C47929b;

/* renamed from: r73.a */
public abstract class C47928a<T extends C47929b> {

    /* renamed from: a */
    public final String f128613a;

    /* renamed from: b */
    public final T f128614b;

    /* renamed from: c */
    public final String f128615c;

    public C47928a(String str, T t) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(t, "context");
        this.f128613a = str;
        this.f128614b = t;
        this.f128615c = "MicroMsg.JSAPI." + getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR_CHAR + t.getClass().getSimpleName();
    }

    /* renamed from: a */
    public final void mo72687a(C83165i iVar) {
        C87412m.m108594g(iVar, "jsRuntime");
        iVar.addJavascriptInterface(this, this.f128613a);
    }
}
