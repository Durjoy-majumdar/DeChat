package bl3;

import android.view.View;

/* renamed from: bl3.o */
public abstract class C54493o extends C54495t {
    public <T extends View> T findViewById(int i) {
        View findViewIdRootView = getFindViewIdRootView();
        return findViewIdRootView != null ? findViewIdRootView.findViewById(i) : findViewByIdByActivity(i);
    }

    public abstract <T extends View> T findViewByIdByActivity(int i);

    public abstract View getFindViewIdRootView();
}
