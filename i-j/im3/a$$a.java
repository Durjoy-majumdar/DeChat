package im3;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import nj3.C76912y0;

public final /* synthetic */ class a$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f28944d;

    /* renamed from: e */
    public final /* synthetic */ int f28945e;

    public /* synthetic */ a$$a(String str, int i) {
        this.f28944d = str;
        this.f28945e = i;
    }

    public final void run() {
        C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) this.f28944d, this.f28945e).show();
    }
}
