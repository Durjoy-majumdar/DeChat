package mm1;

import android.graphics.Rect;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fe1.C8014g;
import gg1.C32444a;
import gy3.C87412m;
import ht1.C60200t1;
import te3.C51942x91;

/* renamed from: mm1.a */
public final class C10934a {

    /* renamed from: a */
    public static final C10934a f32583a = new C10934a();

    /* renamed from: b */
    public static final boolean f32584b = (C32444a.f86077L0.mo60266n().intValue() == 0);

    static {
        C32444a aVar = C32444a.f86121a;
    }

    /* renamed from: a */
    public final boolean mo11132a(String str, C51942x91 x912, int i) {
        C87412m.m108594g(str, "invokeSource");
        if (((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H()) {
            return true;
        }
        if (i != -1) {
            if (i == 9500001 || i == 9500002 || i == 9500004 || i == 9500003) {
                return true;
            }
        }
        if (!(x912 != null && x912.f144531d == 88889)) {
            return true;
        }
        Log.m105928w(str, "canLoadNearbyCityFeeds FINDER_LIVE_SQUARE_TAB_NEARBY_CITY");
        return false;
    }

    /* renamed from: b */
    public final float mo11133b(int i) {
        return (float) MMApplicationContext.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3723cd);
    }

    /* renamed from: c */
    public final boolean mo11134c(int i, View view, float f) {
        C87412m.m108594g(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return (((float) rect.height()) * 1.0f) / ((float) view.getHeight()) < f || (((float) rect.width()) * 1.0f) / ((float) view.getWidth()) < f;
    }
}
