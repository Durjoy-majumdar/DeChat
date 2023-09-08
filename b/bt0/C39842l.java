package bt0;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;

/* renamed from: bt0.l */
public class C39842l extends PopupWindow {

    /* renamed from: a */
    public Context f106856a;

    /* renamed from: b */
    public WindowManager f106857b;

    /* renamed from: c */
    public View f106858c;

    /* renamed from: d */
    public FrameLayout f106859d = new FrameLayout(this.f106856a);

    public C39842l(Context context) {
        super(context);
        this.f106856a = context;
        this.f106857b = (WindowManager) context.getSystemService("window");
    }

    public void dismiss() {
        View view = this.f106858c;
        if (view != null) {
            try {
                this.f106857b.removeViewImmediate(view);
            } catch (IllegalArgumentException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.MMPopupWindowWithMask", e, "removeMask protected", new Object[0]);
            }
            this.f106858c = null;
        }
        super.dismiss();
    }

    public void setContentView(View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        layoutParams.topMargin = C76577a.m92155f(this.f106856a, C0966R.dimen.f4067qd);
        layoutParams.rightMargin = C76577a.m92155f(this.f106856a, C0966R.dimen.f4066qc);
        layoutParams.leftMargin = C76577a.m92155f(this.f106856a, C0966R.dimen.f4066qc);
        this.f106859d.addView(view, layoutParams);
        super.setContentView(this.f106859d);
    }

    public void showAsDropDown(View view) {
        IBinder windowToken = view.getWindowToken();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.type = 1000;
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.token = windowToken;
        View view2 = new View(this.f106856a);
        this.f106858c = view2;
        view2.setBackgroundColor(2130706432);
        this.f106858c.setFitsSystemWindows(false);
        this.f106858c.setOnTouchListener(new C39840j(this));
        this.f106858c.setOnKeyListener(new C39841k(this));
        this.f106857b.addView(this.f106858c, layoutParams);
        super.showAsDropDown(view);
    }
}
