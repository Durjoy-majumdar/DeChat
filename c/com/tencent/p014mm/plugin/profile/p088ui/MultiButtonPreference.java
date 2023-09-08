package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.MultiButtonPreference */
public class MultiButtonPreference extends Preference {

    /* renamed from: J */
    public String f20206J;

    /* renamed from: K */
    public String f20207K;

    /* renamed from: L */
    public View.OnClickListener f20208L;

    /* renamed from: M */
    public View.OnClickListener f20209M;

    public MultiButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121271G = C0966R.C0971layout.bol;
    }

    /* renamed from: I */
    public void mo5915I(String str, View.OnClickListener onClickListener) {
        this.f20206J = str;
        this.f20208L = onClickListener;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Integer num;
        Integer num2;
        int i;
        Button button;
        int i2;
        Button button2;
        Integer num3;
        View view2 = view;
        super.mo1086w(view);
        Button button3 = (Button) view2.findViewById(C0966R.C0970id.anx);
        View findViewById = view2.findViewById(C0966R.C0970id.anz);
        Button button4 = (Button) view2.findViewById(C0966R.C0970id.f357597ao0);
        View findViewById2 = view2.findViewById(C0966R.C0970id.f357598ao1);
        Button button5 = (Button) view2.findViewById(C0966R.C0970id.f357599ao2);
        view2.setBackgroundColor(0);
        if (!Util.isNullOrNil(this.f20206J)) {
            button3.setVisibility(0);
            button3.setText(this.f20206J);
        } else {
            button3.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f20207K)) {
            if (Util.isNullOrNil(this.f20206J)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = findViewById;
                num3 = 8;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                num2 = null;
            } else {
                num3 = 8;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c((Object) null);
                View view4 = findViewById;
                num2 = null;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            button4.setVisibility(0);
            button4.setText(this.f20207K);
            num = num3;
            i = 8;
        } else {
            num2 = 0;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = findViewById;
            num = 8;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i = 8;
            button4.setVisibility(8);
        }
        if (!Util.isNullOrNil((String) null)) {
            if (Util.isNullOrNil(this.f20207K)) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(num);
                View view6 = findViewById2;
                C117292a.m165358d(findViewById2, aVar4.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                button2 = button5;
                i2 = 0;
                C117292a.m165359e(view6, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                button2 = button5;
                View view7 = findViewById2;
                i2 = 0;
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(num2);
                C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            button2.setVisibility(i2);
            button2.setText((CharSequence) null);
            button = button2;
        } else {
            View view8 = findViewById2;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(num);
            C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            button = button5;
            C117292a.m165359e(view8, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            button.setVisibility(i);
        }
        button3.setOnClickListener(this.f20208L);
        button4.setOnClickListener(this.f20209M);
        button.setOnClickListener((View.OnClickListener) null);
    }

    public MultiButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f121271G = C0966R.C0971layout.bol;
    }

    public MultiButtonPreference(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bol;
    }
}
