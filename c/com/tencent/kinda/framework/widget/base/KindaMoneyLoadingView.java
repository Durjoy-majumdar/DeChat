package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.KMoneyLoadingView;
import com.tencent.kinda.gen.TextAlign;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.math.RoundingMode;
import kotlin.Metadata;
import rx3.C13598b0;
import z04.C112551y;
import zp3.C79406f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0014\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\u001f\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020#H\u0016R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaMoneyLoadingView;", "Lcom/tencent/kinda/framework/widget/base/MMKView;", "Landroid/view/View;", "Lcom/tencent/kinda/gen/KMoneyLoadingView;", "Landroid/content/Context;", "", "dp", "", "dp2Px", "", "fontName", "", "isFont", "context", "createView", "Lrx3/b0;", "setFont", "", "money", "animated", "setMoney", "startLoading", "stopLoading", "value", "setCurrencySymbol", "getCurrencySymbol", "setTextSize", "getTextSize", "value2", "setTextSizeNotScaleable", "Lcom/tencent/kinda/gen/DynamicColor;", "setTextColor", "getTextColor", "setAnimationDuration", "getAnimationDuration", "Lcom/tencent/kinda/gen/TextAlign;", "updateTextAlignment", "Lcom/tencent/mm/plugin/wallet_core/ui/view/WcPayMoneyLoadingView;", "loadingView", "Lcom/tencent/mm/plugin/wallet_core/ui/view/WcPayMoneyLoadingView;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "currencySymbol", "Ljava/lang/String;", "textSize", "F", "textColor", "Lcom/tencent/kinda/gen/DynamicColor;", "Landroid/graphics/Typeface;", "customTypeface", "Landroid/graphics/Typeface;", "animationDurationInMillis", "J", "textAlign", "Lcom/tencent/kinda/gen/TextAlign;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class KindaMoneyLoadingView extends MMKView<View> implements KMoneyLoadingView {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "KindaMoneyLoadingView";
    private long animationDurationInMillis;
    private String currencySymbol = "¥";
    private Typeface customTypeface;
    private WcPayMoneyLoadingView loadingView;
    private ProgressBar progressBar;
    private TextAlign textAlign;
    private DynamicColor textColor = new DynamicColor();
    private float textSize = 15.0f;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaMoneyLoadingView$Companion;", "", "()V", "TAG", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    private final int dp2Px(Context context, float f) {
        return C79406f.m96347a(context, f);
    }

    private final boolean isFont(String str, String str2) {
        return C112551y.m153809i(str, str2, true);
    }

    public View createView(Context context) {
        if (context == null) {
            View createView = super.createView(context);
            C87412m.m108593f(createView, "super.createView(context)");
            return createView;
        }
        ProgressBar progressBar2 = new ProgressBar(new ContextThemeWrapper(context, C0966R.style.a5t));
        progressBar2.setVisibility(8);
        this.progressBar = progressBar2;
        WcPayMoneyLoadingView wcPayMoneyLoadingView = new WcPayMoneyLoadingView(context);
        wcPayMoneyLoadingView.setId(View.generateViewId());
        wcPayMoneyLoadingView.setPrefixSymbol(this.currencySymbol);
        setTextColor(this.textColor);
        wcPayMoneyLoadingView.setAnimationDuration(this.animationDurationInMillis);
        Typeface typeface = this.customTypeface;
        if (typeface != null) {
            wcPayMoneyLoadingView.setTypeface(typeface);
        }
        int childCount = wcPayMoneyLoadingView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = wcPayMoneyLoadingView.getChildAt(i);
            if (childAt != null) {
                childAt.setImportantForAccessibility(2);
            }
        }
        wcPayMoneyLoadingView.setLoadingPb(this.progressBar);
        wcPayMoneyLoadingView.setProgressBarStyle(1);
        this.loadingView = wcPayMoneyLoadingView;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.loadingView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout.setGravity(1);
        layoutParams.addRule(13, -1);
        C13598b0 b0Var = C13598b0.f38549a;
        relativeLayout.addView(wcPayMoneyLoadingView2, layoutParams);
        ProgressBar progressBar3 = this.progressBar;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dp2Px(context, 16.0f), dp2Px(context, 16.0f));
        layoutParams2.setMargins(dp2Px(context, 8.0f), 0, 0, 0);
        relativeLayout.setGravity(16);
        layoutParams2.addRule(15, -1);
        WcPayMoneyLoadingView wcPayMoneyLoadingView3 = this.loadingView;
        C87412m.m108591d(wcPayMoneyLoadingView3);
        layoutParams2.addRule(1, wcPayMoneyLoadingView3.getId());
        relativeLayout.addView(progressBar3, layoutParams2);
        return relativeLayout;
    }

    public float getAnimationDuration() {
        return ((float) this.animationDurationInMillis) / 1000.0f;
    }

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public DynamicColor getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setAnimationDuration(float f) {
        long c = C60641c.m70922c((double) (f * 1000.0f));
        this.animationDurationInMillis = c;
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.setAnimationDuration(c);
        }
    }

    public void setCurrencySymbol(String str) {
        if (str != null) {
            this.currencySymbol = str;
            WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
            if (wcPayMoneyLoadingView != null) {
                wcPayMoneyLoadingView.setPrefixSymbol(str);
            }
        }
    }

    public void setFont(String str) {
        if (str != null) {
            int i = isFont(str, "WeChat-Sans-SS-Light") ? 2 : isFont(str, "WeChat-Sans-SS-Medium") ? 0 : isFont(str, "WeChat-Sans-SS-Regular") ? 3 : isFont(str, "WeChat-Sans-SS-Bold") ? 1 : isFont(str, "WeChat-Sans-Std-Medium") ? 4 : isFont(str, "WeChat-Sans-Std-Light") ? 6 : isFont(str, "WeChat-Sans-Std-Bold") ? 5 : isFont(str, "WeChat-Sans-Std-Regular") ? 7 : -1;
            if (i != -1) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(MMApplicationContext.getContext().getAssets(), C75228t.m90273v(i));
                    this.customTypeface = createFromAsset;
                    WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
                    if (wcPayMoneyLoadingView != null) {
                        wcPayMoneyLoadingView.setTypeface(createFromAsset);
                    }
                } catch (Exception e) {
                    Log.m105921e(TAG, "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
        }
    }

    public void setMoney(long j, boolean z) {
        String n = C75228t.m90260n(C75228t.m90248h(String.valueOf(j), "100", 2, RoundingMode.HALF_UP).doubleValue());
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.mo99856e(n, true, z);
        }
    }

    public void setTextColor(DynamicColor dynamicColor) {
        if (dynamicColor != null) {
            this.textColor = dynamicColor;
            WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
            if (wcPayMoneyLoadingView != null) {
                wcPayMoneyLoadingView.setTextColor((int) ColorUtil.getColorByMode(dynamicColor));
            }
        }
    }

    public void setTextSize(float f) {
        this.textSize = f;
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
        if (wcPayMoneyLoadingView != null) {
            Context context = this.mContext;
            C87412m.m108593f(context, "mContext");
            wcPayMoneyLoadingView.setTextSize((float) dp2Px(context, this.textSize));
        }
    }

    public void setTextSizeNotScaleable(float f, boolean z) {
        this.textSize = f;
        if (z) {
            WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
            if (wcPayMoneyLoadingView != null) {
                Context context = this.mContext;
                C87412m.m108593f(context, "mContext");
                wcPayMoneyLoadingView.setTextSizeNotScaled((float) dp2Px(context, this.textSize));
                return;
            }
            return;
        }
        WcPayMoneyLoadingView wcPayMoneyLoadingView2 = this.loadingView;
        if (wcPayMoneyLoadingView2 != null) {
            Context context2 = this.mContext;
            C87412m.m108593f(context2, "mContext");
            wcPayMoneyLoadingView2.setTextSize((float) dp2Px(context2, this.textSize));
        }
    }

    public void startLoading() {
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
        if (wcPayMoneyLoadingView != null) {
            Log.m105924i("MicroMsg.WcPayMoneyLoadingView", "show loading pb");
            ProgressBar progressBar2 = wcPayMoneyLoadingView.f210802e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        }
    }

    public void stopLoading() {
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.loadingView;
        if (wcPayMoneyLoadingView != null) {
            Log.m105924i("MicroMsg.WcPayMoneyLoadingView", "hide loading pb");
            ProgressBar progressBar2 = wcPayMoneyLoadingView.f210802e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            wcPayMoneyLoadingView.removeCallbacks(wcPayMoneyLoadingView.f210806i);
        }
    }

    public void updateTextAlignment(TextAlign textAlign2) {
        C87412m.m108594g(textAlign2, "value");
        this.textAlign = textAlign2;
    }
}
