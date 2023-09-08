package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import te3.C77933g43;
import yq3.C79147d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/wallet_core/ui/WcPayBannerView;", "Landroid/widget/LinearLayout;", "Lte3/g43;", "bannerItem", "Lrx3/b0;", "setBannerData", "", "value", "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "textColor", "getTextColor", "setTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.wallet_core.ui.WcPayBannerView */
public final class WcPayBannerView extends LinearLayout {

    /* renamed from: d */
    public CdnImageView f221216d;

    /* renamed from: e */
    public TextView f221217e;

    /* renamed from: f */
    public WeImageView f221218f;

    /* renamed from: g */
    public LinearLayout f221219g;

    /* renamed from: h */
    public LinearLayout f221220h;

    /* renamed from: com.tencent.mm.wallet_core.ui.WcPayBannerView$a */
    public static final class C75188a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WcPayBannerView f221221d;

        /* renamed from: e */
        public final /* synthetic */ C77933g43 f221222e;

        public C75188a(WcPayBannerView wcPayBannerView, C77933g43 g432) {
            this.f221221d = wcPayBannerView;
            this.f221222e = g432;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75228t.m90219L(this.f221221d.getContext(), this.f221222e.f227434g, true);
            C115669n.INSTANCE.mo160131h(24273, this.f221222e.f227435h, 2);
            C117292a.m165361g(this, "com/tencent/mm/wallet_core/ui/WcPayBannerView$setBannerData$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WcPayBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = View.inflate(context, C0966R.C0971layout.f360066ch2, this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        this.f221219g = linearLayout;
        View findViewById = linearLayout.findViewById(C0966R.C0970id.lkv);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…c_pay_banner_view_layout)");
        this.f221220h = (LinearLayout) findViewById;
        LinearLayout linearLayout2 = this.f221219g;
        if (linearLayout2 != null) {
            View findViewById2 = linearLayout2.findViewById(C0966R.C0970id.lks);
            C87412m.m108593f(findViewById2, "rootView.findViewById(R.id.wc_pay_banner_icon_iv)");
            this.f221216d = (CdnImageView) findViewById2;
            LinearLayout linearLayout3 = this.f221219g;
            if (linearLayout3 != null) {
                View findViewById3 = linearLayout3.findViewById(C0966R.C0970id.lku);
                C87412m.m108593f(findViewById3, "rootView.findViewById(R.id.wc_pay_banner_title_tv)");
                this.f221217e = (TextView) findViewById3;
                LinearLayout linearLayout4 = this.f221219g;
                if (linearLayout4 != null) {
                    View findViewById4 = linearLayout4.findViewById(C0966R.C0970id.lkr);
                    C87412m.m108593f(findViewById4, "rootView.findViewById(R.id.wc_pay_banner_arrow_iv)");
                    this.f221218f = (WeImageView) findViewById4;
                    CdnImageView cdnImageView = this.f221216d;
                    if (cdnImageView != null) {
                        cdnImageView.setUseSdcardCache(true);
                        CdnImageView cdnImageView2 = this.f221216d;
                        if (cdnImageView2 != null) {
                            cdnImageView2.setImgSavedDir(C79147d.m95779a());
                        } else {
                            C87412m.m108603p("iconIv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("iconIv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            } else {
                C87412m.m108603p("rootView");
                throw null;
            }
        } else {
            C87412m.m108603p("rootView");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo105020a() {
        setBgColor(getResources().getColor(C0966R.color.f2960ag));
        setTextColor(getResources().getColor(C0966R.color.f2975b6));
    }

    public final int getBgColor() {
        return 0;
    }

    public final int getTextColor() {
        return 0;
    }

    public final void setBannerData(C77933g43 g432) {
        boolean z;
        boolean z2;
        if (g432 == null) {
            setVisibility(8);
        } else if (g432.f227431d == 0) {
            setVisibility(8);
        } else {
            setVisibility(0);
            TextView textView = this.f221217e;
            if (textView != null) {
                textView.setLineSpacing(2.0f, 1.0f);
                TextView textView2 = this.f221217e;
                if (textView2 != null) {
                    textView2.setText(g432.f227432e);
                    String str = g432.f227433f;
                    if (!(str == null || str.length() == 0)) {
                        CdnImageView cdnImageView = this.f221216d;
                        if (cdnImageView != null) {
                            cdnImageView.setUrl(g432.f227433f);
                            CdnImageView cdnImageView2 = this.f221216d;
                            if (cdnImageView2 != null) {
                                cdnImageView2.setVisibility(0);
                                z = true;
                            } else {
                                C87412m.m108603p("iconIv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("iconIv");
                            throw null;
                        }
                    } else {
                        CdnImageView cdnImageView3 = this.f221216d;
                        if (cdnImageView3 != null) {
                            cdnImageView3.setVisibility(8);
                            z = false;
                        } else {
                            C87412m.m108603p("iconIv");
                            throw null;
                        }
                    }
                    String str2 = g432.f227434g;
                    if (!(str2 == null || str2.length() == 0)) {
                        setOnClickListener(new C75188a(this, g432));
                        WeImageView weImageView = this.f221218f;
                        if (weImageView != null) {
                            weImageView.setVisibility(0);
                            if (Build.VERSION.SDK_INT >= 23) {
                                setForeground(getResources().getDrawable(C0966R.C0969drawable.b2_));
                            }
                            z2 = true;
                        } else {
                            C87412m.m108603p("arrowIv");
                            throw null;
                        }
                    } else {
                        WeImageView weImageView2 = this.f221218f;
                        if (weImageView2 != null) {
                            weImageView2.setVisibility(8);
                            z2 = false;
                        } else {
                            C87412m.m108603p("arrowIv");
                            throw null;
                        }
                    }
                    if (!z && !z2) {
                        TextView textView3 = this.f221217e;
                        if (textView3 != null) {
                            textView3.setGravity(1);
                        } else {
                            C87412m.m108603p("titleTv");
                            throw null;
                        }
                    }
                    C115669n.INSTANCE.mo160131h(24273, g432.f227435h, 1);
                    return;
                }
                C87412m.m108603p("titleTv");
                throw null;
            }
            C87412m.m108603p("titleTv");
            throw null;
        }
    }

    public final void setBgColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C76577a.m92151b(getContext(), 8));
        gradientDrawable.setColor(i);
        LinearLayout linearLayout = this.f221220h;
        if (linearLayout != null) {
            linearLayout.setBackground(gradientDrawable);
        } else {
            C87412m.m108603p("bannerLayout");
            throw null;
        }
    }

    public final void setTextColor(int i) {
        TextView textView = this.f221217e;
        if (textView != null) {
            textView.setTextColor(i);
            WeImageView weImageView = this.f221218f;
            if (weImageView != null) {
                weImageView.setIconColor(i);
            } else {
                C87412m.m108603p("arrowIv");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTv");
            throw null;
        }
    }
}
