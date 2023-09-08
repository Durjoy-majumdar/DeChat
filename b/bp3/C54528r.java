package bp3;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: bp3.r */
public final class C54528r {

    /* renamed from: a */
    public final Activity f152884a;

    /* renamed from: b */
    public ViewTreeObserver.OnGlobalLayoutListener f152885b;

    /* renamed from: c */
    public int f152886c;

    /* renamed from: bp3.r$a */
    public static final class C54529a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ View f152887d;

        /* renamed from: e */
        public final /* synthetic */ C54528r f152888e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f152889f;

        public C54529a(View view, C54528r rVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f152887d = view;
            this.f152888e = rVar;
            this.f152889f = lVar;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f152887d.getWindowVisibleDisplayFrame(rect);
            int height = rect.height();
            Log.m105924i("MicroMsg.SoftKeyboardListener", "visibleHeight: " + height + ", rootHeight: " + this.f152888e.f152886c);
            C54528r rVar = this.f152888e;
            int i = rVar.f152886c;
            if (i == 0) {
                rVar.f152886c = height;
            } else if (i != height) {
                if (i - height > 200) {
                    rVar.f152886c = height;
                    this.f152889f.invoke(Boolean.TRUE);
                } else if (height - i > 200) {
                    rVar.f152886c = height;
                    this.f152889f.invoke(Boolean.FALSE);
                }
            }
        }
    }

    public C54528r(Activity activity, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(lVar, "keyboardCallback");
        this.f152884a = activity;
        View decorView = activity.getWindow().getDecorView();
        C54529a aVar = new C54529a(decorView, this, lVar);
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        this.f152885b = aVar;
    }
}
