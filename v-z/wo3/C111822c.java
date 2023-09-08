package wo3;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;

/* renamed from: wo3.c */
public class C111822c extends C111821b implements Checkable {
    public C111822c(Context context) {
        super(context);
    }

    public boolean isChecked() {
        View childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            return ((Checkable) childAt).isChecked();
        }
        return false;
    }

    public void setChecked(boolean z) {
        View childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            ((Checkable) childAt).setChecked(z);
        }
    }

    public void toggle() {
        View childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            ((Checkable) childAt).toggle();
        }
    }
}
