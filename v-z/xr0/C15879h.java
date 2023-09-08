package xr0;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import p910lj.C76701a;

/* renamed from: xr0.h */
public class C15879h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f42736d;

    /* renamed from: e */
    public final /* synthetic */ boolean f42737e;

    public C15879h(Context context, boolean z) {
        this.f42736d = context;
        this.f42737e = z;
    }

    public void run() {
        Context context = this.f42736d;
        C76701a.makeText(context, (CharSequence) this.f42737e ? context.getString(C0966R.string.f7641mc) : context.getString(C0966R.string.f7639ma), 0).show();
    }
}
