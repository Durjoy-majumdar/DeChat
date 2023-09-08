package com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.WebViewSmileyViewPager;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import da3.C45319f;
import da3.C45320g;
import di3.C86312j;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p008bq.C39833l0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel */
public class WebViewSmileyPanel extends LinearLayout implements ViewPager.OnPageChangeListener, WebViewSmileyViewPager.C44297a {

    /* renamed from: d */
    public C44296a f120035d;

    /* renamed from: e */
    public boolean f120036e = false;

    /* renamed from: f */
    public C44304e f120037f;

    /* renamed from: g */
    public MMActivity f120038g = ((MMActivity) getContext());

    /* renamed from: h */
    public View f120039h = null;

    /* renamed from: i */
    public WebViewSmileyViewPager f120040i = null;

    /* renamed from: j */
    public MMDotView f120041j;

    /* renamed from: n */
    public boolean f120042n = true;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel$a */
    public interface C44296a {
    }

    public WebViewSmileyPanel(Context context) {
        super(context, (AttributeSet) null);
        C44304e eVar = new C44304e();
        this.f120037f = eVar;
        eVar.f120056b = getContext();
        this.f120037f.f120057c = this.f120035d;
    }

    /* renamed from: a */
    public final void mo69029a() {
        boolean isPortOrientation;
        if (this.f120041j != null && (isPortOrientation = KeyBoardUtil.isPortOrientation(getContext())) != this.f120042n) {
            if (isPortOrientation) {
                this.f120041j.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3913iq));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f120041j.getLayoutParams();
                layoutParams.bottomMargin = getContext().getResources().getDimensionPixelSize(C0966R.dimen.a4l);
                this.f120041j.setLayoutParams(layoutParams);
            } else {
                this.f120041j.setPadding(0, 0, 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3906ig));
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f120041j.getLayoutParams();
                layoutParams2.bottomMargin = 0;
                this.f120041j.setLayoutParams(layoutParams2);
            }
            this.f120042n = isPortOrientation;
        }
    }

    public final C44304e getManager() {
        return this.f120037f;
    }

    public void onMeasure(int i, int i2) {
        if (this.f120036e) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
        } else if (KeyBoardUtil.isPortOrientation(getContext())) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        int i2;
        C45319f a = this.f120037f.mo69040a(i);
        C45320g gVar = (C45320g) a;
        if (gVar.mo70876a() * gVar.mo70877b() < 1) {
            i2 = 0;
        } else {
            gVar.f122773b.getClass();
            List<SmileyPanelConfigInfo> list = ((C96926b0) ((C39833l0) C86312j.m106911c(C39833l0.class)).Vi0()).f283937d;
            i2 = (int) Math.ceil(((double) (list == null ? 0 : list.size())) / ((double) (gVar.mo70876a() * gVar.mo70877b())));
        }
        int i3 = i - a.f122774c;
        if (i2 <= 1) {
            this.f120041j.setVisibility(4);
            return;
        }
        this.f120041j.setVisibility(0);
        this.f120041j.setDotCount(i2);
        this.f120041j.setSelectedDot(i3);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo69029a();
    }

    public void setOnTextOperationListener(C44296a aVar) {
        this.f120035d = aVar;
        this.f120037f.f120057c = aVar;
    }

    public void setVisibility(int i) {
        if (i == 0) {
            this.f120036e = false;
        } else {
            this.f120036e = true;
        }
        super.setVisibility(i);
        if (!this.f120036e) {
            this.f120038g.hideVKB();
            if (this.f120039h == null || getChildCount() <= 0) {
                View view = this.f120039h;
                if (view == null) {
                    this.f120039h = View.inflate(MMApplicationContext.getContext(), C0966R.C0971layout.ci7, (ViewGroup) null);
                } else if (view.getParent() != null) {
                    ((ViewGroup) this.f120039h.getParent()).removeView(this.f120039h);
                }
                WebViewSmileyViewPager webViewSmileyViewPager = (WebViewSmileyViewPager) this.f120039h.findViewById(C0966R.C0970id.jnr);
                this.f120040i = webViewSmileyViewPager;
                webViewSmileyViewPager.setOnPageChangeListener(this);
                this.f120040i.setPanelManager(this.f120037f);
                this.f120040i.setOnSizeChangedListener(this);
                MMDotView mMDotView = (MMDotView) this.f120039h.findViewById(C0966R.C0970id.jno);
                this.f120041j = mMDotView;
                mMDotView.setDotCount(1);
                mo69029a();
                addView(this.f120039h, new LinearLayout.LayoutParams(-1, -1));
                return;
            }
            View view2 = this.f120039h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyPanel", "initShowState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public WebViewSmileyPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C44304e eVar = new C44304e();
        this.f120037f = eVar;
        eVar.f120056b = getContext();
        this.f120037f.f120057c = this.f120035d;
    }
}
