package bb3;

import android.content.Context;
import p910lj.C76701a;

/* renamed from: bb3.h */
public class C54445h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f152695d;

    /* renamed from: e */
    public final /* synthetic */ String f152696e;

    public C54445h(C92226g gVar, Context context, String str) {
        this.f152695d = context;
        this.f152696e = str;
    }

    public void run() {
        C76701a.makeText(this.f152695d, (CharSequence) this.f152696e, 0).show();
    }
}
