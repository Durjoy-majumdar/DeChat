package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.account.ui.WelcomeSelectView */
public class WelcomeSelectView extends WelcomeView {

    /* renamed from: d */
    public View f345077d;

    /* renamed from: e */
    public Button f345078e;

    /* renamed from: f */
    public Button f345079f;

    /* renamed from: g */
    public TextView f345080g;

    /* renamed from: h */
    public Context f345081h;

    public WelcomeSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo174849b(context);
    }

    /* renamed from: b */
    public final void mo174849b(Context context) {
        this.f345081h = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cij, this);
        this.f345077d = inflate.findViewById(C0966R.C0970id.j__);
        this.f345078e = (Button) inflate.findViewById(C0966R.C0970id.j_9);
        this.f345079f = (Button) inflate.findViewById(C0966R.C0970id.j_r);
        this.f345080g = (TextView) inflate.findViewById(C0966R.C0970id.f359586lp1);
        View view = this.f345077d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/account/ui/WelcomeSelectView", "initView", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f345080g.setVisibility(8);
        this.f345080g.setText(LocaleUtil.getLanguageName(context, C0966R.array.f2581p, C0966R.string.f8037zz));
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public WelcomeSelectView(Context context) {
        super(context);
        mo174849b(context);
    }
}
