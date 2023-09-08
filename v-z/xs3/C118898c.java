package xs3;

import android.text.TextUtils;
import ft3.C116895f;
import java.util.ArrayList;
import java.util.List;
import ys3.C118992d;

/* renamed from: xs3.c */
public class C118898c implements C118897b {

    /* renamed from: a */
    public final List<C118992d.C118993a> f356181a = new ArrayList();

    /* renamed from: a */
    public void mo183595a(C118992d.C118993a aVar) {
        if (aVar.f356426c == 0 && !TextUtils.isEmpty(aVar.f356428e) && "u:r:zygote:s0".equals(aVar.f356428e) && !TextUtils.isEmpty(aVar.f356427d) && !"zygote".equals(aVar.f356427d) && !"zygote64".equals(aVar.f356427d)) {
            C116895f.m164890b("JavaProcessAnalyzer match : " + aVar.toString());
            ((ArrayList) this.f356181a).add(aVar);
        }
    }

    /* renamed from: b */
    public boolean mo183596b() {
        return ((ArrayList) this.f356181a).size() > 0;
    }
}
