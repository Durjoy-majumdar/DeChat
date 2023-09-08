package com.tencent.p014mm.live.p016ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.xweb.WebSettings;
import fy3.C32224a;
import g60.C75868j;
import g60.C75869k;
import g60.C75870l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;
import y50.C66524m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0017R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/dialog/LiveVisitorGuideView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "j", "Lfy3/a;", "getOnHideListener", "()Lfy3/a;", "setOnHideListener", "(Lfy3/a;)V", "onHideListener", "n", "getOnOkListener", "setOnOkListener", "onOkListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.dialog.LiveVisitorGuideView */
public final class LiveVisitorGuideView extends RelativeLayout {

    /* renamed from: d */
    public final ImageView f195341d;

    /* renamed from: e */
    public final Button f195342e;

    /* renamed from: f */
    public final View f195343f;

    /* renamed from: g */
    public final View f195344g;

    /* renamed from: h */
    public final View f195345h;

    /* renamed from: i */
    public boolean f195346i;

    /* renamed from: j */
    public C32224a<C13598b0> f195347j;

    /* renamed from: n */
    public C32224a<C13598b0> f195348n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveVisitorGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.b7o, this);
        MMWebView mMWebView = (MMWebView) findViewById(C0966R.C0970id.g0o);
        mMWebView.getClass();
        View findViewById = findViewById(C0966R.C0970id.g0m);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_visitor_guide_action_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.f195341d = imageView;
        View findViewById2 = findViewById(C0966R.C0970id.g0n);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_visitor_guide_action_tv)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.g0j);
        C87412m.m108593f(findViewById3, "findViewById(R.id.live_visitor_guide_action_btn)");
        Button button = (Button) findViewById3;
        this.f195342e = button;
        View findViewById4 = findViewById(C0966R.C0970id.g0s);
        C87412m.m108593f(findViewById4, "findViewById(R.id.live_visitor_guide_title_icon)");
        View findViewById5 = findViewById(C0966R.C0970id.g0k);
        C87412m.m108593f(findViewById5, "findViewById(R.id.live_v…_guide_action_desc_group)");
        this.f195343f = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.g0p);
        C87412m.m108593f(findViewById6, "findViewById(R.id.live_v…itor_guide_content_group)");
        this.f195344g = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.g0q);
        C87412m.m108593f(findViewById7, "findViewById(R.id.live_visitor_guide_mask)");
        this.f195345h = findViewById7;
        findViewById6.getLayoutParams().height = (C75044y4.m89990b(context).y * 3) / 4;
        WebSettings settings = mMWebView.getSettings();
        C87412m.m108593f(settings, "webView.getSettings()");
        settings.setJavaScriptEnabled(true);
        mMWebView.loadUrl(C66524m.f191364b);
        ((WeImageView) findViewById4).setOnClickListener(new C75870l(this));
        imageView.setImageResource(C0966R.C0969drawable.f4823ny);
        findViewById5.setOnClickListener(new C75868j(this));
        button.setEnabled(false);
        button.setOnClickListener(new C75869k(this));
        if (C85875k4.m106211z()) {
            findViewById7.setBackground(getContext().getResources().getDrawable(C0966R.raw.live_visitor_guide_mask_dark));
        } else {
            findViewById7.setBackground(getContext().getResources().getDrawable(C0966R.raw.live_visitor_guide_mask_normal));
        }
    }

    public final C32224a<C13598b0> getOnHideListener() {
        return this.f195347j;
    }

    public final C32224a<C13598b0> getOnOkListener() {
        return this.f195348n;
    }

    public final void setOnHideListener(C32224a<C13598b0> aVar) {
        this.f195347j = aVar;
    }

    public final void setOnOkListener(C32224a<C13598b0> aVar) {
        this.f195348n = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LiveVisitorGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
