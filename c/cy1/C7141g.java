package cy1;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import sw1.C48478n;

/* renamed from: cy1.g */
public final class C7141g<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C48478n.C13791d f25111d;

    public C7141g(C48478n.C13791d dVar) {
        this.f25111d = dVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("appid");
            String string2 = bundle.getString("path");
            bundle.getString("wepkg_id");
            C48478n.C13791d dVar = this.f25111d;
            if (dVar != null) {
                C48478n.C13790c cVar = new C48478n.C13790c();
                cVar.f38905a = string;
                cVar.f38906b = string2;
                dVar.mo5391a(cVar);
                return;
            }
            return;
        }
        C48478n.C13791d dVar2 = this.f25111d;
        if (dVar2 != null) {
            dVar2.mo5391a((C48478n.C13790c) null);
        }
    }
}
