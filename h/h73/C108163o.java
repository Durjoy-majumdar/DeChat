package h73;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.widget.PatternLockView;

/* renamed from: h73.o */
public class C108163o {

    /* renamed from: a */
    public View f323886a = null;

    /* renamed from: b */
    public TextView f323887b = null;

    /* renamed from: c */
    public PatternLockView f323888c = null;

    /* renamed from: d */
    public TextView f323889d = null;

    public C108163o(Activity activity) {
        View inflate = View.inflate(activity, C0966R.C0971layout.b1p, (ViewGroup) null);
        this.f323886a = inflate;
        this.f323887b = (TextView) inflate.findViewById(C0966R.C0970id.kwv);
        FrameLayout frameLayout = (FrameLayout) this.f323886a.findViewById(C0966R.C0970id.hrs);
        this.f323888c = (PatternLockView) this.f323886a.findViewById(C0966R.C0970id.hrr);
        this.f323889d = (TextView) this.f323886a.findViewById(C0966R.C0970id.kwh);
    }
}
