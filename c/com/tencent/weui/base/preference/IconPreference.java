package com.tencent.weui.base.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public class IconPreference extends Preference {

    /* renamed from: A */
    public View f25013A;

    /* renamed from: B */
    public TextView f25014B;

    /* renamed from: C */
    public TextView f25015C;

    /* renamed from: D */
    public TextView f25016D;

    /* renamed from: E */
    public TextView f25017E;

    /* renamed from: F */
    public ImageView f25018F;

    /* renamed from: G */
    public int f25019G;

    /* renamed from: H */
    public Context f25020H;

    /* renamed from: I */
    public int f25021I;

    /* renamed from: d */
    public int f25022d;

    /* renamed from: e */
    public ImageView f25023e;

    /* renamed from: f */
    public Drawable f25024f;

    /* renamed from: g */
    public String f25025g;

    /* renamed from: h */
    public int f25026h;

    /* renamed from: i */
    public int f25027i;

    /* renamed from: j */
    public int f25028j;

    /* renamed from: n */
    public int f25029n;

    /* renamed from: o */
    public String f25030o;

    /* renamed from: p */
    public String f25031p;

    /* renamed from: q */
    public int f25032q;

    /* renamed from: r */
    public int f25033r;

    /* renamed from: s */
    public int f25034s;

    /* renamed from: t */
    public int f25035t;

    /* renamed from: u */
    public int f25036u;

    /* renamed from: v */
    public int f25037v;

    /* renamed from: w */
    public int f25038w;

    /* renamed from: x */
    public ImageView f25039x;

    /* renamed from: y */
    public ViewGroup f25040y;

    /* renamed from: z */
    public View f25041z;

    public IconPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onBindView(View view) {
        super.onBindView(view);
        ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f4k);
        this.f25018F = imageView;
        if (imageView != null) {
            Drawable drawable = this.f25024f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                this.f25018F.setVisibility(0);
            } else if (getIcon() != null) {
                ImageView imageView2 = this.f25018F;
                Drawable icon = getIcon();
                this.f25024f = icon;
                imageView2.setImageDrawable(icon);
                this.f25018F.setVisibility(0);
            } else {
                this.f25018F.setVisibility(8);
            }
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gv6);
        linearLayout.setMinimumHeight(view.getResources().getDimensionPixelSize(C0966R.dimen.f3955ld));
        int i = this.f25019G;
        if (i != -1) {
            linearLayout.setMinimumHeight(i);
        }
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.kiq);
        this.f25017E = textView;
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f25017E.setVisibility(this.f25027i);
            this.f25017E.setText(this.f25025g);
            if (this.f25026h != -1) {
                this.f25017E.setBackgroundDrawable(this.f25020H.getResources().getDrawable(this.f25026h));
            }
        }
        TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.kis);
        this.f25016D = textView2;
        if (textView2 != null) {
            textView2.setVisibility(this.f25033r);
            this.f25016D.setText(this.f25031p);
            if (this.f25032q != -1) {
                this.f25016D.setBackgroundDrawable(this.f25020H.getResources().getDrawable(this.f25032q));
            }
            int i2 = this.f25034s;
            if (i2 != -1) {
                this.f25016D.setTextColor(i2);
            }
            this.f25016D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        ImageView imageView3 = (ImageView) view.findViewById(C0966R.C0970id.kij);
        this.f25039x = imageView3;
        imageView3.setVisibility(this.f25028j);
        int i3 = this.f25021I;
        if (i3 != -1) {
            this.f25039x.setImageResource(i3);
        }
        this.f25023e = (ImageView) view.findViewById(C0966R.C0970id.f57);
        this.f25040y = (ViewGroup) view.findViewById(C0966R.C0970id.ity);
        View findViewById = view.findViewById(C0966R.C0970id.ith);
        this.f25013A = findViewById;
        int i4 = this.f25038w;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i4));
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.itw);
        this.f25041z = findViewById2;
        int i5 = this.f25037v;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(Integer.valueOf(i5));
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/weui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((ImageView) view.findViewById(C0966R.C0970id.isy)).setVisibility(0);
        int i6 = this.f25022d;
        if (i6 != -1) {
            this.f25023e.setImageResource(i6);
        }
        this.f25023e.setVisibility(this.f25035t);
        this.f25040y.setVisibility(this.f25036u);
        this.f25014B = (TextView) view.findViewById(16908310);
        TextView textView3 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
        this.f25015C = textView3;
        if (textView3 != null) {
            textView3.setVisibility(this.f25029n);
            this.f25015C.setText(this.f25030o);
            this.f25015C.setTextColor(this.f25020H.getResources().getColor(C0966R.color.f3563xt));
        }
        TextView textView4 = this.f25014B;
        if (textView4 != null) {
            textView4.setTextColor(this.f25020H.getResources().getColor(C0966R.color.a7f));
        }
        view.setEnabled(true);
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) onCreateView.findViewById(C0966R.C0970id.br8);
        viewGroup2.removeAllViews();
        View.inflate(getContext(), C0966R.C0971layout.bnj, viewGroup2);
        return onCreateView;
    }

    public IconPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25022d = -1;
        this.f25023e = null;
        this.f25025g = "";
        this.f25026h = -1;
        this.f25027i = 8;
        this.f25028j = 8;
        this.f25029n = 8;
        this.f25030o = "";
        this.f25031p = "";
        this.f25032q = -1;
        this.f25033r = 8;
        this.f25034s = -1;
        this.f25035t = 8;
        this.f25036u = 8;
        this.f25037v = 8;
        this.f25038w = 8;
        this.f25039x = null;
        this.f25040y = null;
        this.f25041z = null;
        this.f25013A = null;
        this.f25019G = -1;
        this.f25021I = -1;
        this.f25020H = context;
        setLayoutResource(C0966R.C0971layout.bcy);
    }
}
