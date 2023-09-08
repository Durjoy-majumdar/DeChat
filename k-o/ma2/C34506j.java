package ma2;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p910lj.C76701a;

/* renamed from: ma2.j */
public class C34506j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f92864d;

    public C34506j(C99803i iVar, String str) {
        this.f92864d = str;
    }

    public void run() {
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f92864d, 0).show();
    }
}
