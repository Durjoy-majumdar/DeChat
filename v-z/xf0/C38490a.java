package xf0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import lp3.C88631d;
import p910lj.C76701a;
import yf0.C53518j;
import yf0.C53519k;

/* renamed from: xf0.a */
public class C38490a implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C53519k f101501a;

    public C38490a(C53321c cVar, C53519k kVar) {
        this.f101501a = kVar;
    }

    /* renamed from: a */
    public void mo1720a(Object obj) {
        if (obj instanceof String) {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) obj.toString(), 0).show();
        } else {
            Log.m105921e("CloseAAEventIListener", "close aa failed: %s", obj);
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.bfl, 1).show();
        }
        C53518j jVar = this.f101501a.f150483a;
        jVar.getClass();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1530, jVar);
    }
}
