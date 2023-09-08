package bt0;

import android.text.TextUtils;
import android.view.View;

/* renamed from: bt0.i */
public interface C79815i {

    /* renamed from: bt0.i$a */
    public enum C79816a {
        BLACK(-16777216),
        WHITE(-1);
        

        /* renamed from: d */
        public final int f233934d;

        /* access modifiers changed from: public */
        C79816a(int i) {
            this.f233934d = i;
        }

        /* renamed from: a */
        public static C79816a m96974a(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (C79816a aVar : values()) {
                    if (aVar.name().equalsIgnoreCase(str)) {
                        return aVar;
                    }
                }
            }
            return WHITE;
        }
    }

    /* renamed from: d */
    void mo109614d(boolean z);

    View getActionView();

    int getBackgroundColor();

    void setBackButtonClickListener(View.OnClickListener onClickListener);

    void setBackgroundColor(int i);

    void setCloseButtonClickListener(View.OnClickListener onClickListener);

    void setForegroundColor(int i);

    void setForegroundStyle(String str);

    void setLoadingIconVisibility(boolean z);

    void setMainTitle(CharSequence charSequence);

    void setNavHidden(boolean z);
}
