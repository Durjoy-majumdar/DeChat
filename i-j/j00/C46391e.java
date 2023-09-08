package j00;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import j00.C46392g;
import kb3.C46667c;
import kb3.C46668d;

@C86522b
/* renamed from: j00.e */
public class C46391e extends C86301e implements C46392g {
    /* renamed from: IE */
    public void mo71796IE(C46392g.C46393a aVar) {
        String str = C46668d.f125638a;
        if (!C80907o.m98784g(MMApplicationContext.getMainProcessName())) {
            C44536d.m48915a("", new C46667c(aVar));
        } else {
            C46668d.m51977a(aVar);
        }
    }

    public void destroy() {
        C46668d.f125639b.mo71929h(false);
    }
}
