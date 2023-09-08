package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74753e;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.MMFormVerifyCodeInputView;
import com.tencent.p014mm.plugin.appbrand.p026ui.autofill.AppBrandIDCardUI;
import com.tencent.p014mm.plugin.appbrand.widget.C84921b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tenpay.android.wechat.MyKeyboardWindow;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import oa1.C117731d;
import p206nj.C11171e;
import te3.C64439i8;
import te3.C64461j8;
import wr0.C118783s;
import xi3.C78844a;
import xi3.C78851l;
import xi3.C78852m;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag */
public class AppBrandIDCardVerifyPwdFrag extends MMFragment {

    /* renamed from: d */
    public AppBrandIDCardUI.C115272d f345467d;

    /* renamed from: e */
    public C64461j8 f345468e;

    /* renamed from: f */
    public C64439i8 f345469f;

    /* renamed from: g */
    public LinearLayout f345470g;

    /* renamed from: h */
    public View f345471h;

    /* renamed from: i */
    public C74753e f345472i;

    /* renamed from: j */
    public TextView f345473j;

    /* renamed from: n */
    public TextView f345474n;

    /* renamed from: o */
    public TextView f345475o;

    /* renamed from: p */
    public Button f345476p;

    /* renamed from: q */
    public MMFormVerifyCodeInputView f345477q;

    /* renamed from: r */
    public MyKeyboardWindow f345478r;

    public void dealContentView(View view) {
        C64461j8 j8Var;
        View.AccessibilityDelegate accessibilityDelegate;
        AppBrandIDCardUI.C115272d dVar = this.f345467d;
        if (dVar == null || (j8Var = AppBrandIDCardUI.this.f345450p) == null) {
            Log.m105920e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        LinkedList<C64439i8> linkedList = j8Var.f183767f;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sms.get(0) is null, err, return");
            return;
        }
        this.f345470g = (LinearLayout) view.findViewById(C0966R.C0970id.f5928sj);
        this.f345473j = (TextView) view.findViewById(C0966R.C0970id.f5925sg);
        this.f345474n = (TextView) view.findViewById(C0966R.C0970id.f5929sk);
        this.f345475o = (TextView) view.findViewById(C0966R.C0970id.f5930sl);
        this.f345476p = (Button) view.findViewById(C0966R.C0970id.f5914s6);
        this.f345477q = (MMFormVerifyCodeInputView) view.findViewById(C0966R.C0970id.f5926sh);
        this.f345478r = (MyKeyboardWindow) view.findViewById(C0966R.C0970id.f5927si);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6300b2, (ViewGroup) null);
        this.f345471h = inflate;
        inflate.setBackgroundColor(getResources().getColor(C0966R.color.a7_));
        this.f345472i = new C74753e(this.f345471h);
        boolean z = false;
        this.f345470g.addView(this.f345471h, 0, new LinearLayout.LayoutParams(-1, C84921b.m104660a(getActivity())));
        C64461j8 j8Var2 = AppBrandIDCardUI.this.f345450p;
        this.f345468e = j8Var2;
        this.f345472i.mo103920c(j8Var2.f183765d);
        C74753e eVar = this.f345472i;
        eVar.f219799a.setOnClickListener(new C115290r(this));
        this.f345473j.setText(this.f345468e.f183766e);
        this.f345469f = this.f345468e.f183767f.get(0);
        this.f345474n.setText(this.f345468e.f183767f.get(0).f183635e);
        if (this.f345468e.f183767f.size() > 1) {
            this.f345475o.setVisibility(0);
            this.f345475o.setOnClickListener(new C115291s(this));
        } else {
            this.f345475o.setVisibility(8);
        }
        this.f345477q.setVisibility(0);
        this.f345477q.setSendSmsBtnClickListener(new C115294t(this));
        this.f345477q.mo101692a(new C118783s(this));
        EditText contentEditText = this.f345477q.getContentEditText();
        if (contentEditText != null) {
            contentEditText.setShowSoftInputOnFocus(false);
        }
        if (this.f345477q.getText() == null || this.f345477q.getText().toString().length() <= 0) {
            this.f345476p.setEnabled(false);
        } else {
            this.f345476p.setEnabled(true);
        }
        this.f345476p.setVisibility(0);
        this.f345476p.setOnClickListener(new C115297u(this));
        this.f345478r.setXMode(0);
        this.f345478r.setInputEditText(this.f345477q.getContentEditText());
        int i = C78852m.f231676b;
        if (C117731d.m166007c().mo182443e("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) {
            z = true;
        }
        if (!z || !C11171e.m11046c(30) || !C78844a.C15689b.f42385a.mo108842h(true)) {
            accessibilityDelegate = new C78852m();
        } else {
            C117407d.INSTANCE.mo182088q(1624, 11);
            accessibilityDelegate = new C78851l();
        }
        this.f345478r.setAccessibilityDelegate(accessibilityDelegate);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6419ec;
    }

    public boolean noActionBar() {
        return true;
    }

    public void onResume() {
        super.onResume();
        if (isSupportNavigationSwipeBack()) {
            View contentView = getContentView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getSwipeBackLayout().setEnableGesture(true);
        }
    }

    public void onSwipeBack() {
        AppBrandIDCardUI.C115272d dVar = this.f345467d;
        if (dVar != null) {
            AppBrandIDCardUI.this.onSwipeBack();
            View contentView = getContentView();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (isSupportNavigationSwipeBack()) {
                getSwipeBackLayout().setEnableGesture(false);
            }
        }
    }
}
