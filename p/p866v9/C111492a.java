package p866v9;

import android.view.View;
import vo3.C111567h;

/* renamed from: v9.a */
public final class C111492a implements C111567h {
    /* renamed from: a */
    public void mo89642a(View view, int i) {
        if (view != null) {
            view.setTranslationX((float) i);
        }
    }

    /* renamed from: b */
    public int mo89643b(View view) {
        if (view != null) {
            return (int) view.getTranslationX();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo89644c(View view) {
        return -(view != null ? view.getWidth() : 0);
    }

    /* renamed from: d */
    public int mo89645d(View view) {
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }
}
