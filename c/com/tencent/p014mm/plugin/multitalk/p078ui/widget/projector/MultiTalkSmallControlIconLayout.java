package com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector;

import a82.C0016a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout;", "Landroid/widget/FrameLayout;", "", "isChecked", "Lrx3/b0;", "setChecked", "enable", "setIconEnabled", "j", "Z", "isChceked", "()Z", "setChceked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout */
public final class MultiTalkSmallControlIconLayout extends FrameLayout {

    /* renamed from: d */
    public ImageView f201573d;

    /* renamed from: e */
    public int f201574e;

    /* renamed from: f */
    public int f201575f;

    /* renamed from: g */
    public boolean f201576g;

    /* renamed from: h */
    public View f201577h;

    /* renamed from: i */
    public boolean f201578i;

    /* renamed from: j */
    public boolean f201579j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTalkSmallControlIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bi4, this);
        C87412m.m108593f(inflate, "from(context).inflate(R.…small_icons_layout, this)");
        this.f201577h = inflate;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0016a.f18b);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ultitalkControlIconStyle)");
        this.f201574e = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.getInteger(5, -1);
        this.f201576g = obtainStyledAttributes.getBoolean(6, false);
        this.f201575f = obtainStyledAttributes.getResourceId(8, -1);
        obtainStyledAttributes.getDimension(3, -1.0f);
        this.f201578i = obtainStyledAttributes.getBoolean(7, false);
        obtainStyledAttributes.recycle();
        View findViewById = findViewById(C0966R.C0970id.f2a);
        C87412m.m108593f(findViewById, "findViewById(R.id.icon_iv)");
        ImageView imageView = (ImageView) findViewById;
        this.f201573d = imageView;
        int i = this.f201574e;
        if (i == -1) {
            return;
        }
        if (this.f201576g) {
            imageView.setImageDrawable(C74933u4.m89768e(context, i, -16777216));
        } else {
            imageView.setImageDrawable(C74933u4.m89768e(context, i, -1));
        }
    }

    public final void setChceked(boolean z) {
        this.f201579j = z;
    }

    public final void setChecked(boolean z) {
        this.f201579j = z;
        setSelected(z);
        if ((!this.f201578i || !z) && this.f201574e != -1) {
            this.f201573d.setImageDrawable(this.f201579j ? this.f201576g ? C74933u4.m89768e(getContext(), this.f201575f, -1) : C74933u4.m89768e(getContext(), this.f201574e, -16777216) : this.f201576g ? C74933u4.m89768e(getContext(), this.f201574e, -16777216) : C74933u4.m89768e(getContext(), this.f201575f, -1));
        }
    }

    public final void setIconEnabled(boolean z) {
        if (z) {
            View view = this.f201577h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        View view3 = this.f201577h;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Float.valueOf(0.3f));
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
