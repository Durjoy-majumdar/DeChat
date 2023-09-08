package com.tencent.p014mm.plugin.appbrand.page.capsulebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import sx3.C26236u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0015\u001a\u00020\b8\u0016XD¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar;", "Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "", "Landroid/view/View;", "getViewsNeedResponseAlphaAnimation", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "", "name", "Lrx3/b0;", "setTitle", "Landroid/view/View$OnClickListener;", "listener", "setCloseBtnListener", "setTitleClickListener", "setShareBtnListener", "f", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar */
public final class AppBrandeEmbedSingleCloseCapsuleBar extends BaseAppBrandSingleCloseCapsuleBar {

    /* renamed from: f */
    public final String f244540f = "MicroMsg.AppBrandSingleCloseCapsuleBar";

    /* renamed from: g */
    public View f244541g;

    /* renamed from: h */
    public WeImageView f244542h;

    /* renamed from: i */
    public TextView f244543i;

    /* renamed from: j */
    public ImageView f244544j;

    /* renamed from: n */
    public View f244545n;

    /* renamed from: o */
    public List<? extends View> f244546o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6505gn, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244541g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244542h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById3, "findViewById(R.id.name)");
        this.f244543i = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById4, "findViewById(R.id.icon)");
        this.f244544j = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.kp4);
        C87412m.m108593f(findViewById5, "findViewById(R.id.title_lv)");
        this.f244545n = findViewById5;
        this.f244546o = C26236u.m33719b(findViewById5);
        C85875k4.m106191k0(this.f244543i.getPaint());
        C85875k4.m106191k0(((TextView) findViewById(C0966R.C0970id.jcl)).getPaint());
    }

    /* renamed from: a */
    public void mo116120a(boolean z) {
    }

    /* renamed from: b */
    public boolean mo116121b() {
        return (this.f244546o.isEmpty() ^ true) && ((View) this.f244546o.get(0)).getAlpha() == 0.0f;
    }

    /* renamed from: c */
    public float mo116122c() {
        if (!this.f244546o.isEmpty()) {
            return ((View) this.f244546o.get(0)).getAlpha();
        }
        return 255.0f;
    }

    /* renamed from: d */
    public void mo116123d(boolean z) {
    }

    /* renamed from: f */
    public int mo116124f(int i) {
        return i;
    }

    public View getCloseButton() {
        return this.f244542h;
    }

    public String getTAG() {
        return this.f244540f;
    }

    public List<View> getViewsNeedResponseAlphaAnimation() {
        return this.f244546o;
    }

    public ImageView getWxaIcon() {
        return this.f244544j;
    }

    public void setCloseBtnListener(View.OnClickListener onClickListener) {
        this.f244542h.setOnClickListener(onClickListener);
    }

    public void setShareBtnListener(View.OnClickListener onClickListener) {
    }

    public void setTitle(String str) {
        TextView textView = this.f244543i;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public void setTitleClickListener(View.OnClickListener onClickListener) {
        super.setTitleClickListener(onClickListener);
        this.f244545n.setOnClickListener(onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(Context context, boolean z) {
        super(context);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6505gn, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244541g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244542h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById3, "findViewById(R.id.name)");
        this.f244543i = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById4, "findViewById(R.id.icon)");
        this.f244544j = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.kp4);
        C87412m.m108593f(findViewById5, "findViewById(R.id.title_lv)");
        this.f244545n = findViewById5;
        this.f244546o = C26236u.m33719b(findViewById5);
        C85875k4.m106191k0(this.f244543i.getPaint());
        C85875k4.m106191k0(((TextView) findViewById(C0966R.C0970id.jcl)).getPaint());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandeEmbedSingleCloseCapsuleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        C87412m.m108594g(context, "context");
        View findViewById = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f6505gn, this).findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "from(context).inflate(R.…ById(R.id.root_container)");
        this.f244541g = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById2, "findViewById(R.id.close)");
        this.f244542h = (WeImageView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.h_1);
        C87412m.m108593f(findViewById3, "findViewById(R.id.name)");
        this.f244543i = (TextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.f15);
        C87412m.m108593f(findViewById4, "findViewById(R.id.icon)");
        this.f244544j = (ImageView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.kp4);
        C87412m.m108593f(findViewById5, "findViewById(R.id.title_lv)");
        this.f244545n = findViewById5;
        this.f244546o = C26236u.m33719b(findViewById5);
        C85875k4.m106191k0(this.f244543i.getPaint());
        C85875k4.m106191k0(((TextView) findViewById(C0966R.C0970id.jcl)).getPaint());
    }
}
