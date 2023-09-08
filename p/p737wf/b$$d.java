package p737wf;

import android.content.Context;
import p329d3.C116555h;
import p981ie.C117159b;

/* renamed from: wf.b$$d */
public final /* synthetic */ class b$$d implements C116555h {

    /* renamed from: a */
    public final /* synthetic */ Context f355313a;

    public /* synthetic */ b$$d(Context context) {
        this.f355313a = context;
    }

    public final Object get() {
        Context context = this.f355313a;
        if (!C117159b.m165218s(context)) {
            return null;
        }
        long e = C117159b.m165204e(context);
        if (e == -1) {
            return null;
        }
        return Boolean.valueOf(e > 0);
    }
}
