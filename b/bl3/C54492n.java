package bl3;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: bl3.n */
public abstract class C54492n extends C54493o {
    public static final C39817a Companion = new C39817a((C8480h) null);
    public static final String TAG = "SimpleUIComponent";
    public AppCompatActivity activity;
    private Fragment fragment;

    /* renamed from: bl3.n$a */
    public static final class C39817a {
        public C39817a(C8480h hVar) {
        }
    }

    public C54492n(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        setActivity(appCompatActivity);
    }

    public <T extends View> T findViewByIdByActivity(int i) {
        return getActivity().findViewById(i);
    }

    public final AppCompatActivity getActivity() {
        AppCompatActivity appCompatActivity = this.activity;
        if (appCompatActivity != null) {
            return appCompatActivity;
        }
        C87412m.m108603p(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        throw null;
    }

    public final int getColor(int i) {
        return getResources().getColor(i);
    }

    public final float getDimension(int i) {
        return getResources().getDimension(i);
    }

    public View getFindViewIdRootView() {
        Fragment fragment2 = this.fragment;
        if (fragment2 == null || fragment2 == null) {
            return null;
        }
        return fragment2.getView();
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final Intent getIntent() {
        Intent intent = getActivity().getIntent();
        C87412m.m108593f(intent, "activity.intent");
        return intent;
    }

    public final C39623j getLifecycle() {
        Fragment fragment2 = this.fragment;
        C39623j lifecycle = fragment2 != null ? fragment2.getLifecycle() : null;
        if (lifecycle != null) {
            return lifecycle;
        }
        C39623j lifecycle2 = getActivity().getLifecycle();
        C87412m.m108593f(lifecycle2, "activity.lifecycle");
        return lifecycle2;
    }

    public final Resources getResources() {
        Resources resources = getActivity().getResources();
        C87412m.m108593f(resources, "activity.resources");
        return resources;
    }

    public final String getString(int i) {
        String string = getResources().getString(i);
        C87412m.m108593f(string, "resources.getString(id)");
        return string;
    }

    public void onCleared() {
        super.onCleared();
        StringBuilder sb = new StringBuilder();
        sb.append("[onCleared] fragment=");
        Fragment fragment2 = this.fragment;
        sb.append(fragment2 != null ? fragment2.getClass().getName() : null);
        sb.append(" activity=");
        sb.append(getActivity().getClass().getName());
        Log.m105924i(TAG, sb.toString());
    }

    public final void setActivity(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "<set-?>");
        this.activity = appCompatActivity;
    }

    public final void setFragment(Fragment fragment2) {
        this.fragment = fragment2;
    }

    public String toString() {
        return getClass().getName() + '@' + hashCode();
    }

    public final int getColor(int i, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return getResources().getColor(i, theme);
        }
        return getColor(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54492n(androidx.fragment.app.Fragment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            gy3.C87412m.m108594g(r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            gy3.C87412m.m108592e(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            r2.<init>((androidx.appcompat.app.AppCompatActivity) r0)
            r2.fragment = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl3.C54492n.<init>(androidx.fragment.app.Fragment):void");
    }

    public C54492n() {
    }
}
