package com.tencent.p014mm.plugin.profile.p088ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.profile.ui.DialogContactInfoUI */
public class DialogContactInfoUI extends ContactInfoUI {

    /* renamed from: Q */
    public int f202567Q;

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
    }

    public void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2469dt);
        super.onCreate(bundle);
        if (!isFragmentMode()) {
            int j = C76577a.m92159j(MMApplicationContext.getContext());
            ViewGroup viewGroup2 = (ViewGroup) findViewById(16908290);
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = (j / 4) * 3;
            viewGroup2.setLayoutParams(layoutParams);
            Window window = getWindow();
            C46746a aVar = C46746a.f125826a;
            aVar.mo71977j(window.getDecorView(), (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
            window.setBackgroundDrawableResource(C0966R.color.ahf);
            window.getDecorView().setBackgroundColor(C76577a.m92153d(this, C0966R.color.ahf));
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            getWindow().setLayout(-1, -2);
            setFinishOnTouchOutside(true);
            AppBarLayout appBarLayout = (AppBarLayout) findViewById(C0966R.C0970id.aal);
            if (appBarLayout != null) {
                appBarLayout.mo146159a(new DialogContactInfoUI$$a(this));
                C70285m2 m2Var = new C70285m2(this, new DialogContactInfoUI$$b(this));
                Activity activity = m2Var.f203048g;
                if (activity != null) {
                    View decorView = activity.getWindow().getDecorView();
                    C87412m.m108592e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup3 = (ViewGroup) decorView;
                    m2Var.f203046e = viewGroup3;
                    View childAt = viewGroup3.getChildAt(0);
                    m2Var.f203047f = childAt;
                    ViewGroup viewGroup4 = m2Var.f203046e;
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(childAt);
                        m2Var.addView(m2Var.f203047f);
                        ViewGroup viewGroup5 = m2Var.f203046e;
                        if (viewGroup5 != null) {
                            viewGroup5.addView(m2Var);
                            aVar.mo71977j(m2Var.f203047f, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
                            int j2 = C76577a.m92159j(MMApplicationContext.getContext());
                            m2Var.f203051j = j2;
                            m2Var.f203050i = ((float) j2) * 0.3f;
                            aVar.mo71977j(m2Var, (float) C76577a.m92151b(MMApplicationContext.getContext(), 12), true, false);
                        } else {
                            C87412m.m108603p("mDecorView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mDecorView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mActivity");
                    throw null;
                }
            }
        }
        WeImageView weImageView = getController().f348069J;
        if (weImageView != null) {
            weImageView.clearColorFilter();
        }
        WeImageView weImageView2 = getController().f348069J;
        if (weImageView2 != null) {
            weImageView2.setEnableColorFilter(false);
        }
        getController().mo177052J0(C76577a.m92158i(this, C85875k4.m106211z() ? C0966R.C0969drawable.bah : C0966R.C0969drawable.bai));
        WeImageView weImageView3 = getController().f348069J;
        if (weImageView3 != null) {
            weImageView3.clearColorFilter();
        }
        WeImageView weImageView4 = getController().f348069J;
        if (weImageView4 != null) {
            weImageView4.setEnableColorFilter(false);
        }
        AppBarLayout appBarLayout2 = (AppBarLayout) findViewById(C0966R.C0970id.aal);
        if (appBarLayout2 != null) {
            appBarLayout2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
        }
        View findViewById = findViewById(C0966R.C0970id.njc);
        if (findViewById != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.njf);
            View findViewById3 = findViewById(C0966R.C0970id.nje);
            findViewById.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer");
            findViewById2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine");
            findViewById3.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow");
        }
        int b = C76577a.m92151b(this, 64);
        if (isFragmentMode() && (viewGroup = (ViewGroup) findViewById(C0966R.C0970id.fjx)) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = b;
            viewGroup.setLayoutParams(layoutParams2);
        }
        getController().mo177084l0(C76577a.m92151b(this, 64), true);
    }
}
