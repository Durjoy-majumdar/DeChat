package ny2;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TempSecureEditText;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ny2.b0 */
public final class C100258b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TeenModePrivatePwdUI f293731d;

    /* renamed from: e */
    public final /* synthetic */ boolean f293732e;

    /* renamed from: f */
    public final /* synthetic */ int f293733f;

    /* renamed from: g */
    public final /* synthetic */ TempSecureEditText f293734g;

    public C100258b0(TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z, int i, TempSecureEditText tempSecureEditText) {
        this.f293731d = teenModePrivatePwdUI;
        this.f293732e = z;
        this.f293733f = i;
        this.f293734g = tempSecureEditText;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View view2 = this.f293731d.f282427n;
        if (view2 != null) {
            if (!view2.isShown() && !this.f293732e) {
                this.f293731d.showTenpayKB();
                TeenModePrivatePwdUI teenModePrivatePwdUI = this.f293731d;
                int i = this.f293733f;
                MyKeyboardWindow myKeyboardWindow = teenModePrivatePwdUI.f282426j;
                if (myKeyboardWindow != null) {
                    myKeyboardWindow.setXMode(i);
                } else {
                    C87412m.m108603p("mKeyboard");
                    throw null;
                }
            } else if (this.f293732e) {
                this.f293731d.hideTenpayKB();
                Object systemService = this.f293731d.getContext().getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(this.f293734g, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("mKBLayout");
        throw null;
    }
}
