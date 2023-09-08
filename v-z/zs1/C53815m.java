package zs1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.finder.webview.C41646v;
import com.tencent.p014mm.plugin.finder.webview.RelativeInterceptScrollLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.CenterScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebViewCallbackClient;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rr3.C110622b;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: zs1.m */
public final class C53815m {

    /* renamed from: a */
    public final C41646v f151018a;

    /* renamed from: b */
    public FrameLayout f151019b;

    /* renamed from: c */
    public RelativeInterceptScrollLayout f151020c;

    /* renamed from: d */
    public MMWebView f151021d;

    /* renamed from: e */
    public MMProcessBar f151022e;

    /* renamed from: f */
    public View f151023f;

    /* renamed from: g */
    public ImageView f151024g;

    /* renamed from: h */
    public ImageView f151025h;

    /* renamed from: i */
    public MultiCodeMaskView f151026i;

    /* renamed from: j */
    public Context f151027j;

    /* renamed from: k */
    public View.OnClickListener f151028k;

    /* renamed from: l */
    public final ScrollFrameLayout f151029l;

    /* renamed from: m */
    public C32226l<? super C39445a, C13598b0> f151030m;

    /* renamed from: n */
    public final C53816b f151031n;

    /* renamed from: zs1.m$a */
    public static final class C39445a {

        /* renamed from: a */
        public final String f105951a;

        public C39445a(String str) {
            C87412m.m108594g(str, "webUrl");
            this.f105951a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C39445a) && C87412m.m108589b(this.f105951a, ((C39445a) obj).f105951a);
        }

        public int hashCode() {
            return this.f105951a.hashCode();
        }

        public String toString() {
            return "DebugInfo(webUrl=" + this.f105951a + ')';
        }
    }

    /* renamed from: zs1.m$b */
    public static final class C53816b implements WebViewCallbackClient {

        /* renamed from: a */
        public final /* synthetic */ C53815m f151032a;

        public C53816b(C53815m mVar) {
            this.f151032a = mVar;
        }

        public void onContentHeightChanged(int i) {
        }

        public void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
            Log.m105924i("Finder.DialogScrollViewHelper", "onOverScrolled: scrollX:" + i + " scrollY:" + i2 + " clampedX:" + z + " clampedY:" + z2);
            if (z2 && i2 < 200) {
                this.f151032a.f151029l.setAllowVerticalIntercept(true);
            } else if (z && i < 100) {
                this.f151032a.f151029l.setAllowHorizontalIntercept(true);
            }
        }

        public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
            Log.m105924i("Finder.DialogScrollViewHelper", "onScrollChanged l:" + i + ", t:" + i2 + "  oldl:" + i3 + " oldt:" + i4);
        }

        public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
            Log.m105924i("Finder.DialogScrollViewHelper", "overScrollBy: deltaX：" + i + " deltaY：" + i2 + " scrollX：" + i3 + " scrollY:" + i4 + "  scrollRangeX:" + i5 + " scrollRangeY:" + i6 + " maxOverScrollX:" + i7 + " maxOverScrollY:" + i8 + " isTouchEvent:" + z);
            return false;
        }
    }

    public C53815m(C41646v vVar) {
        C87412m.m108594g(vVar, "dialogWrapper");
        this.f151018a = vVar;
        this.f151027j = vVar.mo64703a().context();
        ScrollFrameLayout p = vVar.mo64703a().mo74382p();
        this.f151029l = p;
        View findViewById = p.findViewById(C0966R.C0970id.beq);
        C87412m.m108593f(findViewById, "container.findViewById(R.id.close_img)");
        this.f151019b = (FrameLayout) findViewById;
        View findViewById2 = p.findViewById(C0966R.C0970id.lm9);
        C87412m.m108593f(findViewById2, "container.findViewById(R.id.webview_container)");
        this.f151020c = (RelativeInterceptScrollLayout) findViewById2;
        this.f151022e = (MMProcessBar) p.findViewById(C0966R.C0970id.e8q);
        View findViewById3 = p.findViewById(C0966R.C0970id.e8r);
        C87412m.m108593f(findViewById3, "container.findViewById(R…inder_webview_tips_retry)");
        this.f151023f = findViewById3;
        View findViewById4 = p.findViewById(C0966R.C0970id.h2z);
        C87412m.m108593f(findViewById4, "container.findViewById(R.id.multi_code_mask_view)");
        this.f151026i = (MultiCodeMaskView) findViewById4;
        this.f151024g = (ImageView) p.findViewById(C0966R.C0970id.bea);
        this.f151025h = (ImageView) p.findViewById(C0966R.C0970id.bet);
        C65849b bVar = new C65849b();
        Resources resources = this.f151027j.getResources();
        int i = 0;
        int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(C0966R.dimen.f3753d4) : 0;
        Resources resources2 = this.f151027j.getResources();
        i = resources2 != null ? resources2.getDimensionPixelSize(C0966R.dimen.f3736cp) : i;
        Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, i, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(Color.parseColor("#CCFDFDFD"));
        bVar.mo89891b(createBitmap);
        bVar.f189363b = dimensionPixelSize;
        bVar.f189364c = i;
        C110622b b = bVar.f189366e.f334033b.mo154922b();
        b.mo162186d(40.0f);
        b.mo162187e(5.0f);
        bVar.mo89890a(new C53821r(this));
        ImageView imageView = this.f151025h;
        if (imageView != null) {
            imageView.setImageDrawable(new ColorDrawable(this.f151027j.getResources().getColor(C0966R.color.f2934i)));
        }
        FrameLayout frameLayout = this.f151019b;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new C53818o(this));
            View view = this.f151023f;
            if (view != null) {
                view.setOnClickListener(new C53819p(this));
                FrameLayout frameLayout2 = this.f151019b;
                if (frameLayout2 != null) {
                    frameLayout2.setOnLongClickListener(new C53820q(this));
                    ScrollFrameLayout p2 = vVar.mo64703a().mo74382p();
                    if (p2 instanceof ExpandableScrollFrameLayout) {
                        p2.setDialog(vVar.mo64703a());
                    } else if (p2 instanceof CenterScrollFrameLayout) {
                        p2.setDialog(vVar.mo64703a());
                    }
                    mo74432a();
                    this.f151031n = new C53816b(this);
                    return;
                }
                C87412m.m108603p("mCloseView");
                throw null;
            }
            C87412m.m108603p("mRetryContainer");
            throw null;
        }
        C87412m.m108603p("mCloseView");
        throw null;
    }

    /* renamed from: a */
    public void mo74432a() {
        Log.m105924i("Finder.DialogScrollViewHelper", "showProgress");
        RelativeInterceptScrollLayout relativeInterceptScrollLayout = this.f151020c;
        if (relativeInterceptScrollLayout != null) {
            relativeInterceptScrollLayout.setVisibility(4);
            View view = this.f151023f;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                MMProcessBar mMProcessBar = this.f151022e;
                if (mMProcessBar != null) {
                    mMProcessBar.setVisibility(0);
                }
                MMProcessBar mMProcessBar2 = this.f151022e;
                if (mMProcessBar2 != null) {
                    mMProcessBar2.mo82303c();
                }
                this.f151029l.setForceHandleEvent(true);
                return;
            }
            C87412m.m108603p("mRetryContainer");
            throw null;
        }
        C87412m.m108603p("mWebViewContainer");
        throw null;
    }
}
