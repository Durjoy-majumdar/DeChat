package ht1;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;

/* renamed from: ht1.e2 */
public interface C60162e2 {

    /* renamed from: ht1.e2$a */
    public static abstract class C60163a<V extends C60164b> {
        /* renamed from: b */
        public abstract int mo85137b(int i);

        /* renamed from: c */
        public abstract int mo85138c();

        /* renamed from: d */
        public abstract void mo85139d(View view, int i, C60164b bVar);

        /* renamed from: e */
        public abstract V mo85140e(LayoutInflater layoutInflater, FrameLayout frameLayout, int i);
    }

    /* renamed from: ht1.e2$b */
    public static abstract class C60164b {

        /* renamed from: a */
        public final View f171709a;

        public C60164b(View view) {
            C87412m.m108594g(view, "itemView");
            this.f171709a = view;
        }
    }

    void setAdapter(C60163a<? extends C60164b> aVar);

    void setItemViewWidth(int i);
}
