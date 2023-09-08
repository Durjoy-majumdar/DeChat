package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.FaceHeaderPreference */
public final class FaceHeaderPreference extends Preference {

    /* renamed from: J */
    public MMActivity f12394J;

    /* renamed from: K */
    public TextView f12395K;

    /* renamed from: L */
    public Button f12396L;

    /* renamed from: M */
    public View f12397M;

    /* renamed from: N */
    public View.OnClickListener f12398N;

    /* renamed from: P */
    public String f12399P;

    public FaceHeaderPreference(Context context) {
        this(context, (AttributeSet) null);
        this.f12394J = (MMActivity) context;
    }

    /* renamed from: I */
    public void mo2175I(View.OnClickListener onClickListener) {
        this.f12398N = onClickListener;
        Button button = this.f12396L;
        if (button != null && this.f12397M != null) {
            if (button == null || onClickListener == null) {
                button.setVisibility(8);
                View view = this.f12397M;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            button.setOnClickListener(onClickListener);
            this.f12396L.setVisibility(0);
            View view3 = this.f12397M;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "setButtonOnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: J */
    public void mo2176J(String str, String str2) {
        this.f12399P = str;
        if (this.f12395K == null) {
            return;
        }
        if (!Util.isNullOrNil(str)) {
            this.f12395K.setText(this.f12399P);
            this.f12395K.setVisibility(0);
            return;
        }
        this.f12395K.setVisibility(8);
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View.OnClickListener onClickListener;
        View view2 = view;
        super.mo1086w(view);
        ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.cqk);
        this.f12395K = (TextView) view2.findViewById(C0966R.C0970id.cql);
        this.f12396L = (Button) view2.findViewById(C0966R.C0970id.itd);
        this.f12397M = view2.findViewById(C0966R.C0970id.aon);
        if (!Util.isNullOrNil(this.f12399P)) {
            this.f12395K.setText(this.f12399P);
            this.f12395K.setVisibility(0);
        } else {
            this.f12395K.setVisibility(8);
        }
        Button button = this.f12396L;
        if (button == null || (onClickListener = this.f12398N) == null) {
            if (button != null) {
                button.setVisibility(8);
            }
            View view3 = this.f12397M;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        button.setOnClickListener(onClickListener);
        this.f12396L.setVisibility(0);
        View view5 = this.f12397M;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/facedetect/ui/FaceHeaderPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public FaceHeaderPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f12394J = (MMActivity) context;
    }

    public FaceHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12398N = null;
        this.f12399P = "";
        this.f12394J = (MMActivity) context;
        this.f121271G = C0966R.C0971layout.a5x;
    }
}
