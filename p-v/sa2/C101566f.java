package sa2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;
import sa2.C101563e;

/* renamed from: sa2.f */
public class C101566f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f297334d;

    /* renamed from: e */
    public final /* synthetic */ C101563e.C101565b f297335e;

    public C101566f(C101563e.C101565b bVar, int i) {
        this.f297335e = bVar;
        this.f297334d = i;
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.h4i), 0).show();
        C101563e eVar = C101563e.this;
        C101563e.m133349C(eVar, eVar.f297323q, this.f297334d);
    }
}
