package com.tencent.p014mm.plugin.finder.preload.tabPreload;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import pl1.C62367r0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore */
public final class FinderPlayerPreloadCore {

    /* renamed from: a */
    public static final FinderPlayerPreloadCore f160325a = new FinderPlayerPreloadCore();

    /* renamed from: b */
    public static FinderThumbPlayerProxy f160326b;

    /* renamed from: c */
    public static C62367r0 f160327c;

    /* renamed from: d */
    public static FeedData f160328d;

    /* renamed from: e */
    public static FrameLayout f160329e;

    /* renamed from: f */
    public static C0124r f160330f;

    /* renamed from: com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore$a */
    public static final class C56187a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C56187a f160331d = new C56187a();

        public C56187a() {
            super(0);
        }

        public Object invoke() {
            C39623j lifecycle;
            FinderThumbPlayerProxy finderThumbPlayerProxy = FinderPlayerPreloadCore.f160326b;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.stop();
                finderThumbPlayerProxy.mo78609d();
            }
            FinderPlayerPreloadCore.f160326b = null;
            FinderPlayerPreloadCore.f160327c = null;
            FinderPlayerPreloadCore.f160328d = null;
            FrameLayout frameLayout = FinderPlayerPreloadCore.f160329e;
            if (frameLayout != null) {
                C0124r rVar = FinderPlayerPreloadCore.f160330f;
                if (rVar != null) {
                    Context context = frameLayout.getContext();
                    AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                    if (!(appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null)) {
                        lifecycle.removeObserver(rVar);
                    }
                }
                FinderPlayerPreloadCore.f160330f = null;
                frameLayout.removeAllViews();
                ViewParent parent = frameLayout.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(frameLayout);
                }
            }
            FinderPlayerPreloadCore.f160329e = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo78450a(String str) {
        String str2;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        StringBuilder sb = new StringBuilder();
        sb.append("clearCache: source=");
        sb.append(str);
        sb.append(", cacheMedia=");
        FeedData feedData = f160328d;
        String str3 = null;
        String description = feedData != null ? feedData.getDescription() : null;
        if (description == null || TextUtils.isEmpty(description)) {
            str2 = "";
        } else {
            str2 = description.substring(0, Math.min(4 + 0, description.length()));
            C87412m.m108593f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb.append(str2);
        sb.append('.');
        C62367r0 r0Var = f160327c;
        if (r0Var != null) {
            str3 = r0Var.mo11841b();
        }
        sb.append(str3);
        Log.m105924i("FinderPlayerPreloadCore", sb.toString());
        C61926c.m72668M(C56187a.f160331d);
    }

    /* renamed from: b */
    public final boolean mo78451b(String str) {
        C87412m.m108594g(str, "mediaId");
        C62367r0 r0Var = f160327c;
        return C87412m.m108589b(str, r0Var != null ? r0Var.mo11841b() : null);
    }

    /* renamed from: c */
    public final void mo78452c(AppCompatActivity appCompatActivity) {
        C39623j lifecycle;
        C0124r rVar = f160330f;
        if (rVar != null) {
            FrameLayout frameLayout = f160329e;
            Context context = frameLayout != null ? frameLayout.getContext() : null;
            AppCompatActivity appCompatActivity2 = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (!(appCompatActivity2 == null || (lifecycle = appCompatActivity2.getLifecycle()) == null)) {
                lifecycle.removeObserver(rVar);
            }
        }
        f160330f = null;
        FrameLayout frameLayout2 = new FrameLayout(appCompatActivity);
        frameLayout2.setAlpha(0.0f);
        f160329e = frameLayout2;
        FinderPlayerPreloadCore$newPlaceHolderView$3 finderPlayerPreloadCore$newPlaceHolderView$3 = new FinderPlayerPreloadCore$newPlaceHolderView$3(appCompatActivity);
        f160330f = finderPlayerPreloadCore$newPlaceHolderView$3;
        appCompatActivity.getLifecycle().addObserver(finderPlayerPreloadCore$newPlaceHolderView$3);
    }
}
