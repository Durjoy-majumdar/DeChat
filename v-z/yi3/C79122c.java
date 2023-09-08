package yi3;

import android.app.Activity;
import android.view.ActionMode;
import android.view.Window;
import p990k.C108791h;

/* renamed from: yi3.c */
public class C79122c extends C108791h {

    /* renamed from: e */
    public Activity f232347e;

    public C79122c(Window.Callback callback, Activity activity) {
        super(callback);
        this.f232347e = activity;
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f232347e.onWindowStartingActionMode(callback);
    }
}
