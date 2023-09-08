package il1;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.u2 */
public final class C9124u2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveFansClubTagWidget f28750d;

    /* renamed from: il1.u2$a */
    public static final class C9125a extends C87413o implements C32226l<Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFansClubTagWidget f28751d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9125a(FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
            super(1);
            this.f28751d = finderLiveFansClubTagWidget;
        }

        public Object invoke(Object obj) {
            if (((Number) obj).floatValue() >= 1.0f) {
                this.f28751d.getTagTv().setVisibility(8);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.u2$b */
    public static final class C9126b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFansClubTagWidget f28752d;

        public C9126b(FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
            this.f28752d = finderLiveFansClubTagWidget;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f28752d.getHitRect(rect);
            int i = -MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
            rect.inset(i, i);
            ViewParent parent = this.f28752d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f28752d));
        }
    }

    public C9124u2(FinderLiveFansClubTagWidget finderLiveFansClubTagWidget) {
        this.f28750d = finderLiveFansClubTagWidget;
    }

    public final void run() {
        C58739j4.m68252m(C58739j4.f168176a, this.f28750d.getTagTv(), this.f28750d.getTagTv().getMeasuredWidth(), 0, 0, new C9125a(this.f28750d), 8, (Object) null);
        Log.m105924i("FinderLiveFansClubTagWidget", "showTag reset tag!");
        FinderLiveFansClubTagWidget finderLiveFansClubTagWidget = this.f28750d;
        finderLiveFansClubTagWidget.post(new C9126b(finderLiveFansClubTagWidget));
    }
}
