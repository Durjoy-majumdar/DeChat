package as0;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import rx3.C13598b0;
import vo3.C78461f;

/* renamed from: as0.c */
public final class C39635c {
    /* renamed from: a */
    public static final MMActivity m42237a(MMFragment mMFragment) {
        C87412m.m108594g(mMFragment, "<this>");
        FragmentActivity thisActivity = mMFragment.thisActivity();
        if (thisActivity instanceof MMActivity) {
            return (MMActivity) thisActivity;
        }
        return null;
    }

    /* renamed from: b */
    public static final C13598b0 m42238b(MMFragment mMFragment) {
        C87412m.m108594g(mMFragment, "<this>");
        MMActivity a = m42237a(mMFragment);
        if (a == null) {
            return null;
        }
        a.hideActionbarLine();
        return C13598b0.f38549a;
    }

    /* renamed from: c */
    public static final void m42239c(Intent intent, Class<? extends MMFragment> cls) {
        C87412m.m108594g(intent, "<this>");
        C87412m.m108594g(cls, "clazz");
        String name = cls.getName();
        Log.m105924i("MicroMsg.AppBrand.Privacy.MMFragmentExt", "putMMFragment, className: " + name);
        intent.putExtra("MMFragment_ClassName", name);
    }

    /* renamed from: d */
    public static final Context m42240d(MMFragment mMFragment) {
        C87412m.m108594g(mMFragment, "<this>");
        MMActivity a = m42237a(mMFragment);
        if (a != null) {
            return a;
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        return context;
    }

    /* renamed from: e */
    public static final void m42241e(MMFragment mMFragment, int i) {
        C78461f bounceView;
        C87412m.m108594g(mMFragment, "<this>");
        MMActivity a = m42237a(mMFragment);
        if (a != null) {
            a.setActionbarColor(i);
            C13598b0 b0Var = C13598b0.f38549a;
            if (-1 == mMFragment.getCustomBounceId() && (bounceView = mMFragment.getBounceView()) != null) {
                bounceView.setStart2EndBgColorByActionBar(i);
            }
        }
    }

    /* renamed from: f */
    public static final void m42242f(MMFragment mMFragment, int i) {
        C78461f bounceView;
        C87412m.m108594g(mMFragment, "<this>");
        MMActivity a = m42237a(mMFragment);
        if (a != null) {
            a.setNavigationbarColor(i);
            C13598b0 b0Var = C13598b0.f38549a;
            if (-1 == mMFragment.getCustomBounceId() && (bounceView = mMFragment.getBounceView()) != null) {
                bounceView.setEnd2StartBgColorByNavigationBar(i);
            }
        }
    }
}
