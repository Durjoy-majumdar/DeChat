package gr1;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;

/* renamed from: gr1.p1 */
public final class C8420p1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f27416d;

    public C8420p1(FinderVideoLayout finderVideoLayout) {
        this.f27416d = finderVideoLayout;
    }

    public final void run() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.f27416d.getLoading().getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FinderVideoLayout finderVideoLayout = this.f27416d;
            if (finderVideoLayout.f161871h) {
                int dimension = (int) finderVideoLayout.getLoading().getContext().getResources().getDimension(C0966R.dimen.f3749d0);
                layoutParams.width = dimension;
                layoutParams.height = dimension;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = 0;
                layoutParams2.setMarginEnd(0);
                i = 17;
            } else {
                int dimension2 = (int) finderVideoLayout.getLoading().getContext().getResources().getDimension(C0966R.dimen.f3743cv);
                layoutParams.width = dimension2;
                layoutParams.height = dimension2;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams3.topMargin = dimension2;
                layoutParams3.setMarginEnd(dimension2);
                i = 8388661;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            if (i != layoutParams4.gravity) {
                layoutParams4.gravity = i;
                this.f27416d.getLoading().requestLayout();
            }
        }
        FinderVideoLayout finderVideoLayout2 = this.f27416d;
        finderVideoLayout2.getClass();
        finderVideoLayout2.mo79545I(new C8433y1(finderVideoLayout2));
    }
}
