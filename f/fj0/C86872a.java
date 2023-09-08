package fj0;

import android.text.TextUtils;
import cj0.C80039a;
import com.google.android.gms.stats.CodePackage;
import ej0.C86524b;
import hj0.C87532b;
import java.io.IOException;
import java.net.URL;
import l34.C117453e;
import l34.C117458j;

/* renamed from: fj0.a */
public class C86872a implements C117453e.C88376a<C86524b> {

    /* renamed from: d */
    public final /* synthetic */ C87532b f252162d;

    public C86872a(C86875d dVar, C87532b bVar) {
        this.f252162d = bVar;
    }

    public void call(Object obj) {
        C117458j jVar = (C117458j) obj;
        String a = this.f252162d.mo122001a(CodePackage.LOCATION);
        if (TextUtils.isEmpty(a)) {
            jVar.onError(new Throwable("mDevice location is empty"));
            return;
        }
        try {
            URL url = new URL(a);
            C86524b c = new C86907u().mo121358c(url.openStream());
            if (c != null) {
                c.f251372a = a;
                c.f251373b = url.getHost();
                c.f251374c = url.getPort();
            }
            jVar.mo122781b(c);
            jVar.mo122780a();
        } catch (IOException e) {
            jVar.onError(e.getCause());
            C80039a.m97318c("DlnaRepositoryImpl", e, "");
        }
    }
}
