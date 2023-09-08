package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.webview.RelativeInterceptScrollLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebViewCallbackClient;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rr3.C110622b;
import vp3.C65849b;
import zs1.C53812i;

/* renamed from: com.tencent.mm.plugin.finder.view.c */
public final class C41569c {

    /* renamed from: a */
    public final ScrollFrameLayout f111888a;

    /* renamed from: b */
    public RelativeInterceptScrollLayout f111889b;

    /* renamed from: c */
    public MMWebView f111890c;

    /* renamed from: d */
    public MMProcessBar f111891d;

    /* renamed from: e */
    public View f111892e;

    /* renamed from: f */
    public ImageView f111893f;

    /* renamed from: g */
    public ImageView f111894g;

    /* renamed from: h */
    public MultiCodeMaskView f111895h;

    /* renamed from: i */
    public Context f111896i;

    /* renamed from: j */
    public View.OnClickListener f111897j;

    /* renamed from: k */
    public final C41570a f111898k;

    /* renamed from: com.tencent.mm.plugin.finder.view.c$a */
    public static final class C41570a implements WebViewCallbackClient {

        /* renamed from: a */
        public final /* synthetic */ C41569c f111899a;

        public C41570a(C41569c cVar) {
            this.f111899a = cVar;
        }

        public void onContentHeightChanged(int i) {
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            Log.m105924i("Finder.AnnounceWebViewDialogHelper", "onOverScrolled: scrollX:" + i + " scrollY:" + i2 + " clampedX:" + z + " clampedY:" + z2);
            if (z2 && i2 < 200) {
                this.f111899a.f111888a.setAllowVerticalIntercept(true);
            } else if (z && i < 100) {
                this.f111899a.f111888a.setAllowHorizontalIntercept(true);
            }
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            Log.m105924i("Finder.AnnounceWebViewDialogHelper", "onScrollChanged l:" + i + ", t:" + i2 + "  oldl:" + i3 + " oldt:" + i4);
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            Log.m105924i("Finder.AnnounceWebViewDialogHelper", "overScrollBy: deltaX：" + i + " deltaY：" + i2 + " scrollX：" + i3 + " scrollY:" + i4 + "  scrollRangeX:" + i5 + " scrollRangeY:" + i6 + " maxOverScrollX:" + i7 + " maxOverScrollY:" + i8 + " isTouchEvent:" + z);
            return false;
        }
    }

    public C41569c(C53812i iVar, ScrollFrameLayout scrollFrameLayout) {
        C87412m.m108594g(iVar, "dialog");
        C87412m.m108594g(scrollFrameLayout, "container");
        this.f111888a = scrollFrameLayout;
        this.f111896i = iVar.context();
        View findViewById = scrollFrameLayout.findViewById(C0966R.C0970id.lm9);
        C87412m.m108593f(findViewById, "container.findViewById(R.id.webview_container)");
        this.f111889b = (RelativeInterceptScrollLayout) findViewById;
        this.f111891d = (MMProcessBar) scrollFrameLayout.findViewById(C0966R.C0970id.e8q);
        View findViewById2 = scrollFrameLayout.findViewById(C0966R.C0970id.e8r);
        C87412m.m108593f(findViewById2, "container.findViewById(R…inder_webview_tips_retry)");
        this.f111892e = findViewById2;
        View findViewById3 = scrollFrameLayout.findViewById(C0966R.C0970id.h2z);
        C87412m.m108593f(findViewById3, "container.findViewById(R.id.multi_code_mask_view)");
        this.f111895h = (MultiCodeMaskView) findViewById3;
        this.f111893f = (ImageView) scrollFrameLayout.findViewById(C0966R.C0970id.bea);
        this.f111894g = (ImageView) scrollFrameLayout.findViewById(C0966R.C0970id.bet);
        C65849b bVar = new C65849b();
        Resources resources = this.f111896i.getResources();
        int i = 0;
        int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(C0966R.dimen.f3753d4) : 0;
        Resources resources2 = this.f111896i.getResources();
        i = resources2 != null ? resources2.getDimensionPixelSize(C0966R.dimen.f3736cp) : i;
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, i, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(Color.parseColor("#CCFDFDFD"));
        bVar.mo89891b(createBitmap);
        bVar.f189363b = dimensionPixelSize;
        bVar.f189364c = i;
        C110622b b = bVar.f189366e.f334033b.mo154922b();
        b.mo162186d(40.0f);
        b.mo162187e(5.0f);
        bVar.mo89890a(new C41572e(this));
        ImageView imageView = this.f111894g;
        if (imageView != null) {
            imageView.setImageDrawable(new ColorDrawable(this.f111896i.getResources().getColor(C0966R.color.f2934i)));
        }
        View view = this.f111892e;
        if (view != null) {
            view.setOnClickListener(new C41571d(this));
            scrollFrameLayout.setDialog(iVar);
            mo64656a();
            this.f111898k = new C41570a(this);
            return;
        }
        C87412m.m108603p("mRetryContainer");
        throw null;
    }

    /* renamed from: a */
    public void mo64656a() {
        Log.m105924i("Finder.AnnounceWebViewDialogHelper", "showProgress");
        RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f111889b;
        if (relativeInterceptScrollLayout != null) {
            relativeInterceptScrollLayout.setVisibility(4);
            View view = this.f111892e;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/AnnounceWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MMProcessBar mMProcessBar = this.f111891d;
                if (mMProcessBar != null) {
                    mMProcessBar.setVisibility(0);
                }
                MMProcessBar mMProcessBar2 = this.f111891d;
                if (mMProcessBar2 != null) {
                    mMProcessBar2.mo82303c();
                    return;
                }
                return;
            }
            C87412m.m108603p("mRetryContainer");
            throw null;
        }
        C87412m.m108603p("mWebViewContainer");
        throw null;
    }
}
