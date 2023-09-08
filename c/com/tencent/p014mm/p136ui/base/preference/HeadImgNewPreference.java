package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import tl3.C78039a;

/* renamed from: com.tencent.mm.ui.base.preference.HeadImgNewPreference */
public final class HeadImgNewPreference extends Preference {

    /* renamed from: J */
    public int f24236J;

    /* renamed from: K */
    public ImageView f24237K;

    /* renamed from: L */
    public TextView f24238L;

    /* renamed from: M */
    public View f24239M;

    /* renamed from: N */
    public String f24240N;

    /* renamed from: P */
    public boolean f24241P;

    /* renamed from: Q */
    public View.OnClickListener f24242Q;

    /* renamed from: R */
    public boolean f24243R;

    /* renamed from: S */
    public C6760a f24244S;

    /* renamed from: com.tencent.mm.ui.base.preference.HeadImgNewPreference$a */
    public interface C6760a {
        /* renamed from: a */
        void mo4113a(String str, ImageView imageView, boolean z);
    }

    public HeadImgNewPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public void mo7739I(String str) {
        this.f24240N = null;
        ImageView imageView = this.f24237K;
        if (imageView != null) {
            C6760a aVar = this.f24244S;
            if (aVar != null) {
                aVar.mo4113a(str, imageView, this.f24241P);
            } else if (this.f24241P) {
                C78039a.m94190b(imageView, str);
            } else {
                C78039a.m94189a(imageView, str);
            }
        } else {
            this.f24240N = str;
        }
        if (str == null) {
            this.f24243R = false;
        } else {
            this.f24243R = true;
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        if (this.f24237K == null) {
            this.f24237K = (ImageView) view.findViewById(C0966R.C0970id.f4h);
        }
        if (this.f24238L == null) {
            this.f24238L = (TextView) view.findViewById(C0966R.C0970id.hgg);
        }
        if (this.f24239M == null) {
            this.f24239M = view.findViewById(C0966R.C0970id.gon);
        }
        View.OnClickListener onClickListener = this.f24242Q;
        if (onClickListener != null) {
            this.f24239M.setOnClickListener(onClickListener);
        }
        String str = this.f24240N;
        if (str != null) {
            C6760a aVar = this.f24244S;
            if (aVar != null) {
                aVar.mo4113a(str, this.f24237K, this.f24241P);
            } else if (this.f24241P) {
                C78039a.m94190b(this.f24237K, str);
            } else {
                C78039a.m94189a(this.f24237K, str);
            }
            this.f24240N = null;
        }
        if (!this.f24243R) {
            View view2 = this.f24239M;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f24238L.setVisibility(0);
        } else {
            this.f24238L.setVisibility(8);
            View view4 = this.f24239M;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f24241P) {
                this.f24239M.setBackground(this.f121274d.getDrawable(C0966R.C0969drawable.aqw));
            } else {
                this.f24239M.setBackground(this.f121274d.getDrawable(C0966R.C0969drawable.aqu));
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C0966R.C0970id.gv6);
        int i = this.f24236J;
        if (i != -1) {
            relativeLayout.setMinimumHeight(i);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, C0966R.C0971layout.bdd, viewGroup2);
        this.f24237K = (ImageView) x.findViewById(C0966R.C0970id.f4h);
        this.f24238L = (TextView) x.findViewById(C0966R.C0970id.hgg);
        this.f24239M = x.findViewById(C0966R.C0970id.gon);
        return x;
    }

    public HeadImgNewPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeadImgNewPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24236J = -1;
        this.f24243R = false;
        this.f24244S = null;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
