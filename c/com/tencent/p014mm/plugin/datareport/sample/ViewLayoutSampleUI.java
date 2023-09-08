package com.tencent.p014mm.plugin.datareport.sample;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import l31.C61212e;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI */
public class ViewLayoutSampleUI extends MMActivity implements View.OnClickListener {

    /* renamed from: d */
    public View f110044d;

    /* renamed from: e */
    public Button f110045e;

    /* renamed from: f */
    public Button f110046f;

    /* renamed from: g */
    public Button f110047g;

    /* renamed from: com.tencent.mm.plugin.datareport.sample.ViewLayoutSampleUI$a */
    public class C40909a implements MenuItem.OnMenuItemClickListener {
        public C40909a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ViewLayoutSampleUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cwa;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view2 == this.f110045e) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 1500.0f, 0, 0.0f, 0, 1500.0f);
            translateAnimation.setDuration(3000);
            translateAnimation.setRepeatCount(1);
            translateAnimation.setRepeatMode(2);
            this.f110044d.startAnimation(translateAnimation);
        } else if (view2 == this.f110046f) {
            if (this.f110044d.getAlpha() > 0.1f) {
                View view3 = this.f110044d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                View view5 = this.f110044d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view5.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else if (view2 == this.f110047g) {
            if (this.f110044d.getVisibility() == 0) {
                View view7 = this.f110044d;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view8 = view7;
                C117292a.m165358d(view8, aVar3.mo10232b(), "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view9 = this.f110044d;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar4.mo10232b(), "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/datareport/sample/ViewLayoutSampleUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        setMMTitle("测试layout");
        setBackBtn(new C40909a());
        this.f110044d = (View) mo176895$(C0966R.C0970id.n4f);
        this.f110045e = (Button) mo176895$(C0966R.C0970id.f357601jf0);
        this.f110046f = (Button) mo176895$(C0966R.C0970id.jck);
        this.f110047g = (Button) mo176895$(C0966R.C0970id.luu);
        this.f110045e.setOnClickListener(this);
        this.f110046f.setOnClickListener(this);
        this.f110047g.setOnClickListener(this);
        ((C61212e) C86312j.m106911c(cls)).o30(this.f110044d, "sample_test_view");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f110044d, 40, 24184);
    }
}
