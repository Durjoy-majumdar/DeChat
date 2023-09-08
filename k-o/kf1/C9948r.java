package kf1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: kf1.r */
public final class C9948r extends C87413o implements C32226l<View, Boolean> {

    /* renamed from: d */
    public static final C9948r f30590d = new C9948r();

    public C9948r() {
        super(1);
    }

    public Object invoke(Object obj) {
        View view = (View) obj;
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        Context context = view.getContext();
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        return Boolean.valueOf(appCompatActivity == null || appCompatActivity.getLifecycle().getCurrentState() == C39623j.C39626c.RESUMED);
    }
}
