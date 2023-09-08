package com.tencent.p014mm.plugin.multitalk.p078ui.widget;

import a82.C0016a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.voip.widget.MMCheckBox;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnClickListener;", "l", "Lrx3/b0;", "setOnClickListener", "", "isChecked", "setChecked", "enable", "setIconEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.MultiTalkControlIconLayout */
public final class MultiTalkControlIconLayout extends FrameLayout {

    /* renamed from: d */
    public MMCheckBox f201554d;

    /* renamed from: e */
    public ImageView f201555e;

    /* renamed from: f */
    public TextView f201556f;

    /* renamed from: g */
    public FrameLayout f201557g;

    /* renamed from: h */
    public final String f201558h;

    /* renamed from: i */
    public String f201559i;

    /* renamed from: j */
    public String f201560j;

    /* renamed from: n */
    public int f201561n;

    /* renamed from: o */
    public int f201562o;

    /* renamed from: p */
    public int f201563p;

    /* renamed from: q */
    public boolean f201564q;

    /* renamed from: r */
    public View f201565r;

    /* renamed from: s */
    public float f201566s;

    /* renamed from: t */
    public int f201567t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTalkControlIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bhg, this);
        C87412m.m108593f(inflate, "from(context).inflate(R.…italk_icons_layout, this)");
        this.f201565r = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0016a.f18b);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ultitalkControlIconStyle)");
        String string = obtainStyledAttributes.getString(4);
        this.f201558h = string;
        boolean z = true;
        String string2 = obtainStyledAttributes.getString(1);
        String str = "";
        this.f201559i = string2 == null ? str : string2;
        String string3 = obtainStyledAttributes.getString(9);
        this.f201560j = string3 != null ? string3 : str;
        this.f201562o = obtainStyledAttributes.getResourceId(0, -1);
        this.f201561n = obtainStyledAttributes.getInteger(5, -1);
        this.f201564q = obtainStyledAttributes.getBoolean(6, false);
        this.f201563p = obtainStyledAttributes.getResourceId(8, -1);
        this.f201566s = obtainStyledAttributes.getDimension(3, -1.0f);
        this.f201567t = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(C0966R.C0970id.f1m);
        C87412m.m108593f(findViewById, "findViewById(R.id.icon_checkbox)");
        this.f201554d = (MMCheckBox) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById2, "findViewById(R.id.icon_iv)");
        ImageView imageView = (ImageView) findViewById2;
        this.f201555e = imageView;
        int i = this.f201562o;
        if (i != -1) {
            if (this.f201564q) {
                imageView.setImageDrawable(C74933u4.m89768e(context, i, -16777216));
            } else {
                imageView.setImageDrawable(C74933u4.m89768e(context, i, -1));
            }
        }
        View findViewById3 = findViewById(C0966R.C0970id.f2i);
        C87412m.m108593f(findViewById3, "findViewById(R.id.icon_name)");
        TextView textView = (TextView) findViewById3;
        this.f201556f = textView;
        textView.setText(string);
        this.f201556f.setTextColor(this.f201561n);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(this.f201559i) && TextUtils.isEmpty(this.f201560j)) {
            this.f201555e.setVisibility(8);
        }
        View findViewById4 = findViewById(C0966R.C0970id.f2e);
        C87412m.m108593f(findViewById4, "findViewById(R.id.icon_main)");
        FrameLayout frameLayout = (FrameLayout) findViewById4;
        this.f201557g = frameLayout;
        if (!(this.f201566s != -1.0f ? false : z)) {
            frameLayout.setLayoutParams(new RelativeLayout.LayoutParams(C74942w4.m89784a(context, (int) this.f201566s), C74942w4.m89784a(context, (int) this.f201566s)));
        }
        if (this.f201567t != -1) {
            this.f201557g.setBackground(getResources().getDrawable(this.f201567t));
        }
        if (string != null) {
            this.f201556f.setText(this.f201559i);
        }
    }

    /* renamed from: a */
    public final boolean mo96157a() {
        return this.f201554d.isChecked();
    }

    public final void setChecked(boolean z) {
        this.f201554d.setChecked(z);
        this.f201557g.setSelected(z);
        if (this.f201562o != -1) {
            this.f201555e.setImageDrawable(mo96157a() ? this.f201564q ? C74933u4.m89768e(getContext(), this.f201563p, -1) : C74933u4.m89768e(getContext(), this.f201562o, -16777216) : this.f201564q ? C74933u4.m89768e(getContext(), this.f201562o, -16777216) : C74933u4.m89768e(getContext(), this.f201563p, -1));
        }
        if (this.f201558h == null) {
            this.f201556f.setText(mo96157a() ? this.f201559i : this.f201560j);
        }
    }

    public final void setIconEnabled(boolean z) {
        boolean z2 = z;
        this.f201554d.setEnabled(z2);
        if (z2) {
            View view = this.f201565r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            View view3 = this.f201565r;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.3f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (this.f201558h == null) {
            this.f201556f.setText(mo96157a() ? this.f201559i : this.f201560j);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f201554d.setOnClickListener(onClickListener);
    }
}
