package b93;

import android.content.Context;
import p910lj.C76701a;

/* renamed from: b93.c */
public final class C0259c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f804d;

    /* renamed from: e */
    public final /* synthetic */ Context f805e;

    public C0259c(String str, Context context) {
        this.f804d = str;
        this.f805e = context;
    }

    public final void run() {
        C76701a.makeText(this.f805e, (CharSequence) "ad redirect, url=" + this.f804d, 0).show();
    }
}
