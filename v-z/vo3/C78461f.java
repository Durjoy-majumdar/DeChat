package vo3;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: vo3.f */
public interface C78461f {

    /* renamed from: vo3.f$a */
    public interface C78462a {
        /* renamed from: c3 */
        void mo6473c3(int i);

        /* renamed from: w4 */
        void mo6474w4(int i);
    }

    int getOffset();

    View getView();

    void setBg(Drawable drawable);

    void setBgColor(int i);

    void setBounceEnabled(boolean z);

    void setEnd2StartBgColor(int i);

    void setEnd2StartBgColorByNavigationBar(int i);

    void setStart2EndBgColor(int i);

    void setStart2EndBgColorByActionBar(int i);

    void setView(View view);
}
