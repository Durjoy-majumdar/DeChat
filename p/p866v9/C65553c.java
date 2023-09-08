package p866v9;

import android.view.View;
import vo3.C111567h;

/* renamed from: v9.c */
public final class C65553c implements C111567h {
    /* renamed from: a */
    public void mo89642a(View view, int i) {
        if (view != null) {
            float abs = ((float) Math.abs(i)) / ((float) view.getHeight());
            if (i > 0) {
                view.setPivotY(0.0f);
            } else {
                view.setPivotY((float) view.getHeight());
            }
            view.setScaleY(((float) 1) + abs);
        }
    }

    /* renamed from: b */
    public int mo89643b(View view) {
        if (view == null) {
            return 0;
        }
        float scaleY = (view.getScaleY() - ((float) 1)) * ((float) view.getHeight());
        return view.getPivotY() > 0.0f ? -((int) scaleY) : (int) scaleY;
    }

    /* renamed from: c */
    public int mo89644c(View view) {
        return -(view != null ? view.getHeight() : 0);
    }

    /* renamed from: d */
    public int mo89645d(View view) {
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }
}
