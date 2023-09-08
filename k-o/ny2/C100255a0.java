package ny2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TempSecureEditText;
import gy3.C87412m;

/* renamed from: ny2.a0 */
public final class C100255a0 implements View.OnFocusChangeListener {

    /* renamed from: d */
    public final /* synthetic */ TeenModePrivatePwdUI f293720d;

    /* renamed from: e */
    public final /* synthetic */ boolean f293721e;

    /* renamed from: f */
    public final /* synthetic */ View.OnFocusChangeListener f293722f;

    /* renamed from: g */
    public final /* synthetic */ int f293723g;

    /* renamed from: h */
    public final /* synthetic */ TempSecureEditText f293724h;

    /* renamed from: ny2.a0$a */
    public static final class C100256a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f293725d;

        /* renamed from: e */
        public final /* synthetic */ View f293726e;

        /* renamed from: f */
        public final /* synthetic */ int f293727f;

        public C100256a(TeenModePrivatePwdUI teenModePrivatePwdUI, View view, int i) {
            this.f293725d = teenModePrivatePwdUI;
            this.f293726e = view;
            this.f293727f = i;
        }

        public final void run() {
            View view = this.f293725d.f282427n;
            if (view != null) {
                if (!view.isShown() && this.f293726e.isShown()) {
                    this.f293725d.showTenpayKB();
                }
                TeenModePrivatePwdUI teenModePrivatePwdUI = this.f293725d;
                int i = this.f293727f;
                MyKeyboardWindow myKeyboardWindow = teenModePrivatePwdUI.f282426j;
                if (myKeyboardWindow != null) {
                    myKeyboardWindow.setXMode(i);
                    MyKeyboardWindow myKeyboardWindow2 = this.f293725d.f282426j;
                    if (myKeyboardWindow2 != null) {
                        View view2 = this.f293726e;
                        C87412m.m108592e(view2, "null cannot be cast to non-null type android.widget.EditText");
                        myKeyboardWindow2.setInputEditText((EditText) view2);
                        Object systemService = this.f293725d.getContext().getSystemService("input_method");
                        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f293726e.getWindowToken(), 0);
                        return;
                    }
                    C87412m.m108603p("mKeyboard");
                    throw null;
                }
                C87412m.m108603p("mKeyboard");
                throw null;
            }
            C87412m.m108603p("mKBLayout");
            throw null;
        }
    }

    /* renamed from: ny2.a0$b */
    public static final class C100257b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TeenModePrivatePwdUI f293728d;

        /* renamed from: e */
        public final /* synthetic */ boolean f293729e;

        /* renamed from: f */
        public final /* synthetic */ TempSecureEditText f293730f;

        public C100257b(TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z, TempSecureEditText tempSecureEditText) {
            this.f293728d = teenModePrivatePwdUI;
            this.f293729e = z;
            this.f293730f = tempSecureEditText;
        }

        public final void run() {
            this.f293728d.hideTenpayKB();
            if (this.f293729e) {
                Object systemService = this.f293728d.getContext().getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.f293730f, 0);
            }
        }
    }

    public C100255a0(TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z, View.OnFocusChangeListener onFocusChangeListener, int i, TempSecureEditText tempSecureEditText) {
        this.f293720d = teenModePrivatePwdUI;
        this.f293721e = z;
        this.f293722f = onFocusChangeListener;
        this.f293723g = i;
        this.f293724h = tempSecureEditText;
    }

    public final void onFocusChange(View view, boolean z) {
        this.f293720d.hideVKB();
        if (!view.isFocused() || this.f293721e) {
            new MMHandler().postDelayed(new C100257b(this.f293720d, this.f293721e, this.f293724h), 200);
        } else {
            Object systemService = this.f293720d.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new MMHandler().postDelayed(new C100256a(this.f293720d, view, this.f293723g), 300);
        }
        View.OnFocusChangeListener onFocusChangeListener = this.f293722f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }
}
