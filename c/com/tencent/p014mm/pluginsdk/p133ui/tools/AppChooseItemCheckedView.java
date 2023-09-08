package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nR#\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0015\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/AppChooseItemCheckedView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getRoot", "Landroid/widget/ImageView;", "getIconImg", "Landroid/widget/TextView;", "getTitleTv", "getCheckImg", "", "checked", "Lrx3/b0;", "setChecked", "e", "Lrx3/g;", "getNotSetRoot", "()Landroid/view/View;", "notSetRoot", "f", "getAppRoot", "appRoot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-appchooser_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView */
public final class AppChooseItemCheckedView extends FrameLayout {

    /* renamed from: d */
    public boolean f120993d;

    /* renamed from: e */
    public final C13601g f120994e = C36568h.m40985a(new C44633d(this));

    /* renamed from: f */
    public final C13601g f120995f = C36568h.m40985a(new C44624c(this));

    /* renamed from: g */
    public boolean f120996g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppChooseItemCheckedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.czk, this, false);
        setSelected(false);
    }

    private final View getAppRoot() {
        return (View) this.f120995f.getValue();
    }

    private final View getNotSetRoot() {
        return (View) this.f120994e.getValue();
    }

    /* renamed from: a */
    public final void mo69409a() {
        View root = getRoot();
        int i = 0;
        if (getChildCount() == 0 || !C87412m.m108589b(getChildAt(0), root)) {
            removeAllViews();
            addView(root);
        }
        ImageView checkImg = getCheckImg();
        if (!this.f120996g) {
            i = 8;
        }
        checkImg.setVisibility(i);
    }

    public final ImageView getCheckImg() {
        View findViewById = getRoot().findViewById(C0966R.C0970id.ndt);
        C87412m.m108593f(findViewById, "getRoot().findViewById(R….file_choose_checked_img)");
        return (ImageView) findViewById;
    }

    public final ImageView getIconImg() {
        return (ImageView) getRoot().findViewById(C0966R.C0970id.ndy);
    }

    public final View getRoot() {
        return this.f120993d ? getAppRoot() : getNotSetRoot();
    }

    public final TextView getTitleTv() {
        View findViewById = getRoot().findViewById(C0966R.C0970id.ne5);
        C87412m.m108593f(findViewById, "getRoot().findViewById(R.id.file_choose_title_tv)");
        return (TextView) findViewById;
    }

    public final void setChecked(boolean z) {
        this.f120996g = z;
        setSelected(z);
        if (z) {
            getCheckImg().setVisibility(0);
        } else {
            getCheckImg().setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppChooseItemCheckedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.czk, this, false);
        setSelected(false);
    }
}
