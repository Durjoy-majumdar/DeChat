package com.tencent.p014mm.plugin.appbrand.page.capsulebar;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import qq0.C36066u;
import sx3.C64197v;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0014\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandSingleCloseCapsuleBar;", "Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "", "Landroid/view/View;", "getViewsNeedResponseAlphaAnimation", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "", "name", "Lrx3/b0;", "setTitle", "Landroid/view/View$OnClickListener;", "listener", "setCloseBtnListener", "setShareBtnListener", "f", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lqq0/u;", "value", "q", "Lqq0/u;", "getCloseBtnType", "()Lqq0/u;", "setCloseBtnType", "(Lqq0/u;)V", "closeBtnType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandSingleCloseCapsuleBar */
public final class AppBrandSingleCloseCapsuleBar extends BaseAppBrandSingleCloseCapsuleBar {

    /* renamed from: f */
    public final String f244530f = "MicroMsg.AppBrandSingleCloseCapsuleBar";

    /* renamed from: g */
    public View f244531g;

    /* renamed from: h */
    public WeImageView f244532h;

    /* renamed from: i */
    public WeImageView f244533i;

    /* renamed from: j */
    public TextView f244534j;

    /* renamed from: n */
    public ImageView f244535n;

    /* renamed from: o */
    public LinearLayout f244536o;

    /* renamed from: p */
    public boolean f244537p;

    /* renamed from: q */
    public C36066u f244538q;

    /* renamed from: r */
    public List<? extends View> f244539r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6506go, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244531g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244532h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.jho);
        C87412m.m108593f(findViewById3, "findViewById(R.id.share)");
        this.f244533i = (WeImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById4, "findViewById(R.id.name)");
        this.f244534j = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById5, "findViewById(R.id.icon)");
        this.f244535n = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById6, "findViewById<LinearLayout>(R.id.button_group)");
        this.f244536o = (LinearLayout) findViewById6;
        this.f244538q = C36066u.NORMAL;
        this.f244539r = C64197v.m75537f(this.f244533i, this.f244534j, this.f244535n);
        this.f244536o.setLayoutTransition(new LayoutTransition());
    }

    /* renamed from: a */
    public void mo116120a(boolean z) {
        int i = 0;
        if ((z ? 0 : 8) != this.f244532h.getVisibility()) {
            WeImageView weImageView = this.f244532h;
            if (!z) {
                i = 8;
            }
            weImageView.setVisibility(i);
            this.f244536o.requestLayout();
        }
    }

    /* renamed from: b */
    public boolean mo116121b() {
        return (this.f244539r.isEmpty() ^ true) && ((View) this.f244539r.get(0)).getAlpha() == 0.0f;
    }

    /* renamed from: c */
    public float mo116122c() {
        return this.f244535n.getAlpha();
    }

    /* renamed from: d */
    public void mo116123d(boolean z) {
        int i = 0;
        if ((z ? 0 : 8) != this.f244533i.getVisibility()) {
            WeImageView weImageView = this.f244533i;
            if (!z) {
                i = 8;
            }
            weImageView.setVisibility(i);
            this.f244536o.requestLayout();
        }
    }

    /* renamed from: f */
    public int mo116124f(int i) {
        return this.f244537p ? i == C0966R.color.f3133gi ? C0966R.color.BW_0 : i == C0966R.color.al6 ? C0966R.color.f2975b6 : i : i;
    }

    /* renamed from: g */
    public final void mo116125g() {
        C36066u uVar = C36066u.WITH_ROUND_CIRCLE;
        boolean z = this.f244537p;
        int i = C0966R.raw.app_brand_half_screen_capsule_bar_close_light;
        int i2 = C0966R.C0969drawable.cki;
        if (z) {
            if (this.f244538q == uVar) {
                this.f244532h.setImageResource(C0966R.raw.app_brand_half_screen_capsule_bar_close_light);
                this.f244532h.setIconColor(0);
                mo116131h(C79406f.m96347a(getContext(), 32.0f), C79406f.m96347a(getContext(), 32.0f));
                return;
            }
            mo116131h(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv), getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
            this.f244532h.setIconColor(getContext().getResources().getColor(C0966R.color.BW_0));
            this.f244532h.setImageResource(C0966R.C0969drawable.cki);
        } else if (this.f244538q == uVar) {
            WeImageView weImageView = this.f244532h;
            if (C85875k4.m106211z()) {
                i = C0966R.raw.app_brand_half_screen_capsule_bar_close_dark;
            }
            weImageView.setImageResource(i);
            this.f244532h.setIconColor(0);
            mo116131h(C79406f.m96347a(getContext(), 32.0f), C79406f.m96347a(getContext(), 32.0f));
        } else {
            this.f244532h.setLayoutParams(new LinearLayout.LayoutParams(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv), getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv)));
            WeImageView weImageView2 = this.f244532h;
            if (C85875k4.m106211z()) {
                i2 = C0966R.C0969drawable.ckh;
            }
            weImageView2.setImageResource(i2);
            mo116131h(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv), getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
        }
    }

    public final C36066u getCloseBtnType() {
        return this.f244538q;
    }

    public View getCloseButton() {
        return this.f244532h;
    }

    public String getTAG() {
        return this.f244530f;
    }

    public List<View> getViewsNeedResponseAlphaAnimation() {
        return this.f244539r;
    }

    public ImageView getWxaIcon() {
        return this.f244535n;
    }

    /* renamed from: h */
    public final void mo116131h(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.f244532h.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            layoutParams.width = i2;
        }
        this.f244532h.requestLayout();
    }

    public void setCloseBtnListener(View.OnClickListener onClickListener) {
        this.f244532h.setOnClickListener(onClickListener);
    }

    public final void setCloseBtnType(C36066u uVar) {
        C87412m.m108594g(uVar, "value");
        this.f244538q = uVar;
        mo116125g();
    }

    public void setShareBtnListener(View.OnClickListener onClickListener) {
        this.f244533i.setOnClickListener(onClickListener);
    }

    public void setTitle(String str) {
        TextView textView = this.f244534j;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6506go, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244531g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244532h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.jho);
        C87412m.m108593f(findViewById3, "findViewById(R.id.share)");
        this.f244533i = (WeImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById4, "findViewById(R.id.name)");
        this.f244534j = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById5, "findViewById(R.id.icon)");
        this.f244535n = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById6, "findViewById<LinearLayout>(R.id.button_group)");
        this.f244536o = (LinearLayout) findViewById6;
        this.f244538q = C36066u.NORMAL;
        this.f244539r = C64197v.m75537f(this.f244533i, this.f244534j, this.f244535n);
        this.f244536o.setLayoutTransition(new LayoutTransition());
        this.f244537p = z;
        this.f244531g.setBackgroundColor(getContext().getResources().getColor(mo116124f(C0966R.color.ahf)));
        this.f244534j.setTextColor(getContext().getResources().getColor(mo116124f(C0966R.color.f3133gi)));
        mo116125g();
        this.f244533i.setImageResource(C0966R.raw.app_brand_half_screenc_capsule_bar_share);
        if (this.f244537p) {
            this.f244533i.setIconColor(getContext().getResources().getColor(C0966R.color.BW_0));
        } else {
            this.f244533i.setIconColor(getContext().getResources().getColor(C0966R.color.f3131gg));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandSingleCloseCapsuleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6506go, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244531g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244532h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.jho);
        C87412m.m108593f(findViewById3, "findViewById(R.id.share)");
        this.f244533i = (WeImageView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById4, "findViewById(R.id.name)");
        this.f244534j = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById5, "findViewById(R.id.icon)");
        this.f244535n = (ImageView) findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById6, "findViewById<LinearLayout>(R.id.button_group)");
        this.f244536o = (LinearLayout) findViewById6;
        this.f244538q = C36066u.NORMAL;
        this.f244539r = C64197v.m75537f(this.f244533i, this.f244534j, this.f244535n);
        this.f244536o.setLayoutTransition(new LayoutTransition());
    }
}
