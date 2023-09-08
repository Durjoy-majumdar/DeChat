package sa2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;
import sa2.C101563e;

/* renamed from: sa2.d */
public class C36648d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101563e.C101564a f97413d;

    public C36648d(C101563e.C101564a aVar) {
        this.f97413d = aVar;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        C101563e.C101564a aVar = this.f97413d;
        if (currentTimeMillis - aVar.f297331a > 10000) {
            aVar.f297331a = System.currentTimeMillis();
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.h29), 0).show();
        }
    }
}
