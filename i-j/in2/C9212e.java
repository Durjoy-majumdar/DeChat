package in2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;

/* renamed from: in2.e */
public abstract class C9212e {

    /* renamed from: a */
    public final String f28961a;

    /* renamed from: b */
    public C9205a f28962b;

    /* renamed from: c */
    public View f28963c;

    /* renamed from: d */
    public boolean f28964d;

    public C9212e(String str) {
        C87412m.m108594g(str, "key");
        this.f28961a = str;
    }

    /* renamed from: a */
    public abstract int mo9229a();

    /* renamed from: b */
    public final View mo10018b() {
        View view = this.f28963c;
        if (view == null) {
            view = LayoutInflater.from(MMApplicationContext.getContext()).inflate(mo9229a(), (ViewGroup) null, false);
            this.f28963c = view;
        }
        C87412m.m108593f(view, "view");
        mo9230c(view);
        return view;
    }

    /* renamed from: c */
    public abstract void mo9230c(View view);
}
