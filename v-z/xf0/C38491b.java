package xf0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86709a0;
import hp3.C87581a;
import p910lj.C76701a;
import yf0.C53518j;
import yf0.C53519k;

/* renamed from: xf0.b */
public class C38491b implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C53519k f101502a;

    public C38491b(C53321c cVar, C53519k kVar) {
        this.f101502a = kVar;
    }

    public Object call(Object obj) {
        Log.m105925i("CloseAAEventIListener", "close aa success: %s", (Boolean) obj);
        C53518j jVar = this.f101502a.f150483a;
        jVar.getClass();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1530, jVar);
        C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.bfi, 0).show();
        return null;
    }
}
