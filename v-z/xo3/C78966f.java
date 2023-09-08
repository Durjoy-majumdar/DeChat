package xo3;

import android.widget.PopupWindow;

/* renamed from: xo3.f */
public class C78966f implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C78950d f231903d;

    public C78966f(C78950d dVar) {
        this.f231903d = dVar;
    }

    public void onDismiss() {
        C78950d dVar = this.f231903d;
        dVar.f231844f.setOnTouchListener(dVar.f231863y);
    }
}
