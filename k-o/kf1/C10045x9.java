package kf1;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: kf1.x9 */
public final class C10045x9 extends C87413o implements C32226l<View, Boolean> {

    /* renamed from: d */
    public static final C10045x9 f30785d = new C10045x9();

    public C10045x9() {
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
