package yj3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: yj3.d */
public class C79132d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int[] f232382d;

    /* renamed from: e */
    public final /* synthetic */ HomeUI.FitSystemWindowLayoutView f232383e;

    /* renamed from: f */
    public final /* synthetic */ ViewGroup f232384f;

    /* renamed from: g */
    public final /* synthetic */ C79123a f232385g;

    /* renamed from: yj3.d$a */
    public class C79133a implements View.OnApplyWindowInsetsListener {
        public C79133a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (windowInsets == null) {
                return null;
            }
            Log.m105925i("ChattingCompat", "OnApplyWindowInsetsListener %s", windowInsets);
            windowInsets.consumeSystemWindowInsets();
            C79132d dVar = C79132d.this;
            C79123a aVar = dVar.f232385g;
            HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = dVar.f232383e;
            windowInsets.getSystemWindowInsetTop();
            Rect rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            ViewGroup viewGroup = C79132d.this.f232384f;
            aVar.getClass();
            fitSystemWindowLayoutView.setActionBarContainer(viewGroup);
            fitSystemWindowLayoutView.fitSystemWindows(rect);
            return windowInsets;
        }
    }

    public C79132d(C79123a aVar, int[] iArr, HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, ViewGroup viewGroup) {
        this.f232385g = aVar;
        this.f232382d = iArr;
        this.f232383e = fitSystemWindowLayoutView;
        this.f232384f = viewGroup;
    }

    public void run() {
        this.f232385g.f232351e.mo91099j().getLocationInWindow(this.f232382d);
        int i = this.f232382d[1];
        if (i > 0) {
            C79123a aVar = this.f232385g;
            HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f232383e;
            Rect rect = new Rect(0, i, 0, 0);
            ViewGroup viewGroup = this.f232384f;
            aVar.getClass();
            fitSystemWindowLayoutView.setActionBarContainer(viewGroup);
            fitSystemWindowLayoutView.fitSystemWindows(rect);
            return;
        }
        this.f232383e.setOnApplyWindowInsetsListener(new C79133a());
    }
}
