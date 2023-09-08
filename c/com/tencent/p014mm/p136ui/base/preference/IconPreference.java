package com.tencent.p014mm.p136ui.base.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.base.preference.IconPreference */
public class IconPreference extends Preference {

    /* renamed from: J */
    public int f215049J;

    /* renamed from: K */
    public Drawable f215050K;

    /* renamed from: L */
    public ImageView f215051L;

    /* renamed from: M */
    public RelativeLayout.LayoutParams f215052M;

    /* renamed from: N */
    public Drawable f215053N;

    /* renamed from: P */
    public String f215054P;

    /* renamed from: Q */
    public int f215055Q;

    /* renamed from: Q0 */
    public int f215056Q0;

    /* renamed from: R */
    public int f215057R;

    /* renamed from: R0 */
    public ImageView f215058R0;

    /* renamed from: S */
    public int f215059S;

    /* renamed from: S0 */
    public ViewGroup f215060S0;

    /* renamed from: T */
    public int f215061T;

    /* renamed from: T0 */
    public View f215062T0;

    /* renamed from: U */
    public String f215063U;

    /* renamed from: U0 */
    public View f215064U0;

    /* renamed from: V */
    public String f215065V;

    /* renamed from: V0 */
    public TextView f215066V0;

    /* renamed from: W */
    public int f215067W;

    /* renamed from: W0 */
    public TextView f215068W0;

    /* renamed from: X */
    public int f215069X;

    /* renamed from: X0 */
    public TextView f215070X0;

    /* renamed from: Y */
    public int f215071Y;

    /* renamed from: Y0 */
    public TextView f215072Y0;

    /* renamed from: Z */
    public Bitmap f215073Z;

    /* renamed from: Z0 */
    public ImageView f215074Z0;

    /* renamed from: a1 */
    public boolean f215075a1;

    /* renamed from: b1 */
    public String f215076b1;

    /* renamed from: c1 */
    public int f215077c1;

    /* renamed from: d1 */
    public Context f215078d1;

    /* renamed from: e1 */
    public boolean f215079e1;

    /* renamed from: f1 */
    public boolean f215080f1;

    /* renamed from: g1 */
    public int f215081g1;

    /* renamed from: h1 */
    public boolean f215082h1;

    /* renamed from: i1 */
    public boolean f215083i1;

    /* renamed from: j1 */
    public View f215084j1;

    /* renamed from: k1 */
    public C73231a f215085k1;

    /* renamed from: p0 */
    public int f215086p0;

    /* renamed from: x0 */
    public int f215087x0;

    /* renamed from: y0 */
    public int f215088y0;

    /* renamed from: com.tencent.mm.ui.base.preference.IconPreference$a */
    public interface C73231a {
        /* renamed from: a */
        void mo24587a(View view);
    }

    public IconPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: I */
    public int mo96249I() {
        return C0966R.C0971layout.bdk;
    }

    /* renamed from: J */
    public void mo101928J(String str) {
        this.f215063U = str;
        TextView textView = this.f215068W0;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: K */
    public void mo101929K(int i) {
        this.f215061T = i;
        TextView textView = this.f215068W0;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: L */
    public void mo101930L(Bitmap bitmap) {
        this.f215073Z = bitmap;
        this.f215049J = -1;
        this.f215050K = null;
        ImageView imageView = this.f215051L;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: M */
    public void mo101931M(int i) {
        this.f215049J = i;
        this.f215073Z = null;
        ImageView imageView = this.f215051L;
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    /* renamed from: N */
    public void mo101932N(int i) {
        this.f215086p0 = i;
        ImageView imageView = this.f215051L;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    /* renamed from: P */
    public void mo101933P(int i) {
        this.f215088y0 = i;
        View view = this.f215062T0;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/IconPreference", "setRightProspectVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/IconPreference", "setRightProspectVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: R */
    public void mo101934R(int i) {
        this.f215087x0 = i;
        ViewGroup viewGroup = this.f215060S0;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }

    /* renamed from: S */
    public void mo101935S(int i, int i2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        this.f215052M = layoutParams;
        layoutParams.addRule(13);
        ImageView imageView = this.f215051L;
        if (imageView != null) {
            imageView.setLayoutParams(this.f215052M);
        }
    }

    /* renamed from: T */
    public void mo101936T(int i) {
        this.f215057R = i;
        TextView textView = this.f215072Y0;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: U */
    public void mo101937U(int i) {
        this.f215069X = i;
        TextView textView = this.f215070X0;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: V */
    public void mo96250V(int i) {
        this.f215059S = i;
        ImageView imageView = this.f215058R0;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    /* renamed from: W */
    public void mo101938W(String str, int i) {
        mo101939Y(str, i, this.f215071Y);
    }

    /* renamed from: Y */
    public void mo101939Y(String str, int i, int i2) {
        this.f215065V = str;
        this.f215067W = i;
        this.f215071Y = i2;
        TextView textView = this.f215070X0;
        if (textView != null) {
            textView.setText(str);
            if (i != -1) {
                this.f215070X0.setBackgroundDrawable(this.f215078d1.getResources().getDrawable(i));
            }
            if (i2 != -1) {
                this.f215070X0.setTextColor(i2);
            }
        }
    }

    /* renamed from: Z */
    public void mo101940Z(boolean z) {
        this.f215079e1 = z;
        TextView textView = this.f215070X0;
        if (textView == null) {
            return;
        }
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0966R.C0969drawable.az5, 0);
            this.f215070X0.setCompoundDrawablePadding((int) this.f215078d1.getResources().getDimension(C0966R.dimen.f3956le));
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }

    /* renamed from: a0 */
    public void mo101941a0(String str, int i) {
        this.f215054P = str;
        this.f215055Q = i;
        TextView textView = this.f215072Y0;
        if (textView != null) {
            if (str != null) {
                textView.setText(str);
            }
            if (this.f215055Q != -1) {
                this.f215072Y0.setBackgroundDrawable(this.f215078d1.getResources().getDrawable(this.f215055Q));
            }
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f215074Z0 = imageView;
        if (imageView != null) {
            Drawable drawable = this.f215053N;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                this.f215074Z0.setVisibility(0);
            } else if (this.f121282o != 0) {
                Drawable drawable2 = this.f121274d.getResources().getDrawable(this.f121282o);
                this.f215053N = drawable2;
                imageView.setImageDrawable(drawable2);
                this.f215074Z0.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            if (this.f121283p != 0) {
                this.f215074Z0.getDrawable().setColorFilter(this.f121283p, PorterDuff.Mode.SRC_ATOP);
            } else if (this.f215074Z0.getDrawable() != null) {
                this.f215074Z0.getDrawable().clearColorFilter();
            }
            if (this.f215075a1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f215074Z0.getLayoutParams();
                layoutParams.topMargin = C74942w4.m89786c(this.f121274d, C0966R.dimen.f3736cp);
                layoutParams.gravity = 48;
                this.f215074Z0.setLayoutParams(layoutParams);
            } else {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f215074Z0.getLayoutParams();
                layoutParams2.topMargin = 0;
                layoutParams2.gravity = 16;
                this.f215074Z0.setLayoutParams(layoutParams2);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        linearLayout.setMinimumHeight(view.getResources().getDimensionPixelSize(C0966R.dimen.f3904ie));
        int i = this.f215077c1;
        if (i != -1) {
            linearLayout.setMinimumHeight(i);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        this.f215072Y0 = textView;
        if (textView != null) {
            if (this.f215080f1) {
                textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.C0969drawable.az5, 0, 0, 0);
                this.f215072Y0.setCompoundDrawablePadding((int) this.f215078d1.getResources().getDimension(C0966R.dimen.f3956le));
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            this.f215072Y0.setVisibility(this.f215057R);
            this.f215072Y0.setText(this.f215054P);
            C85875k4.m106191k0(this.f215072Y0.getPaint());
            int i2 = this.f215055Q;
            if (i2 != -1) {
                if (i2 == C0966R.C0969drawable.ake) {
                    this.f215072Y0.setTextSize(0, ((float) C76577a.m92155f(this.f121274d, C0966R.dimen.arz)) * C76577a.m92161l(this.f215078d1));
                } else {
                    this.f215072Y0.setTextSize(0, ((float) C76577a.m92155f(this.f121274d, C0966R.dimen.ary)) * C76577a.m92161l(this.f215078d1));
                }
                this.f215072Y0.setBackgroundDrawable(this.f215078d1.getResources().getDrawable(this.f215055Q));
            }
        }
        TextView textView2 = (TextView) view.findViewById(this.f215083i1 ? C0966R.C0970id.kir : C0966R.C0970id.kis);
        this.f215070X0 = textView2;
        if (textView2 != null) {
            textView2.setVisibility(this.f215069X);
            this.f215070X0.setText(this.f215065V);
            if (this.f215067W != -1) {
                this.f215070X0.setBackgroundDrawable(this.f215078d1.getResources().getDrawable(this.f215067W));
                if (this.f215067W == C0966R.C0969drawable.ake) {
                    this.f215070X0.setTextSize(0, ((float) C76577a.m92155f(this.f215078d1, C0966R.dimen.arz)) * C76577a.m92161l(this.f215078d1));
                }
            }
            int i3 = this.f215071Y;
            if (i3 != -1) {
                this.f215070X0.setTextColor(i3);
            }
            if (this.f215079e1) {
                this.f215070X0.setCompoundDrawablesWithIntrinsicBounds(0, 0, C0966R.C0969drawable.az5, 0);
                this.f215070X0.setCompoundDrawablePadding((int) this.f215078d1.getResources().getDimension(C0966R.dimen.f3956le));
            } else {
                this.f215070X0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        ImageView imageView2 = (ImageView) view.findViewById(C0966R.C0970id.kij);
        this.f215058R0 = imageView2;
        imageView2.setVisibility(this.f215059S);
        int i4 = this.f215081g1;
        if (i4 != -1) {
            this.f215058R0.setImageResource(i4);
        }
        this.f215051L = (ImageView) view.findViewById(C0966R.C0970id.f57);
        this.f215060S0 = (ViewGroup) view.findViewById(C0966R.C0970id.ity);
        View findViewById = view.findViewById(C0966R.C0970id.ith);
        this.f215064U0 = findViewById;
        int i5 = this.f215056Q0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i5));
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.itw);
        this.f215062T0 = findViewById2;
        int i6 = this.f215088y0;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i6));
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Bitmap bitmap = this.f215073Z;
        if (bitmap != null) {
            this.f215051L.setImageBitmap(bitmap);
        } else {
            int i7 = this.f215049J;
            if (i7 != -1) {
                this.f215051L.setImageResource(i7);
            } else {
                Drawable drawable3 = this.f215050K;
                if (drawable3 != null) {
                    this.f215051L.setImageDrawable(drawable3);
                }
            }
        }
        this.f215051L.setVisibility(this.f215086p0);
        this.f215060S0.setVisibility(this.f215087x0);
        RelativeLayout.LayoutParams layoutParams3 = this.f215052M;
        if (layoutParams3 != null) {
            this.f215051L.setLayoutParams(layoutParams3);
        }
        this.f215066V0 = (TextView) view.findViewById(16908310);
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f215068W0 = textView3;
        if (textView3 != null) {
            textView3.setVisibility(this.f215061T);
            this.f215068W0.setText(this.f215063U);
            if (this.f215082h1) {
                this.f215068W0.setTextColor(this.f215078d1.getResources().getColor(C0966R.color.f3309nb));
            } else {
                this.f215068W0.setTextColor(this.f215078d1.getResources().getColor(C0966R.color.f3288ma));
            }
        }
        TextView textView4 = this.f215066V0;
        if (textView4 != null) {
            if (this.f215082h1) {
                textView4.setTextColor(this.f215078d1.getResources().getColor(C0966R.color.f3309nb));
            } else {
                textView4.setTextColor(this.f215078d1.getResources().getColor(C0966R.color.FG_0));
            }
        }
        view.setEnabled(!this.f215082h1);
        C73231a aVar3 = this.f215085k1;
        if (aVar3 != null) {
            aVar3.mo24587a(view);
        }
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        View x = super.mo1087x(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) x.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(this.f121274d, mo96249I(), viewGroup2);
        this.f215084j1 = x;
        String str = this.f215076b1;
        if (str != null && str.length() > 0) {
            this.f215084j1.setContentDescription(this.f215076b1);
        }
        return this.f215084j1;
    }

    public IconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f215049J = -1;
        this.f215051L = null;
        this.f215054P = "";
        this.f215055Q = -1;
        this.f215057R = 8;
        this.f215059S = 8;
        this.f215061T = 8;
        this.f215063U = "";
        this.f215065V = "";
        this.f215067W = -1;
        this.f215069X = 8;
        this.f215071Y = -1;
        this.f215073Z = null;
        this.f215086p0 = 8;
        this.f215087x0 = 8;
        this.f215088y0 = 8;
        this.f215056Q0 = 8;
        this.f215058R0 = null;
        this.f215060S0 = null;
        this.f215062T0 = null;
        this.f215064U0 = null;
        this.f215077c1 = -1;
        this.f215079e1 = false;
        this.f215080f1 = false;
        this.f215081g1 = -1;
        this.f215082h1 = false;
        this.f215083i1 = false;
        this.f215085k1 = null;
        this.f215078d1 = context;
        this.f121271G = C0966R.C0971layout.bcy;
    }
}
