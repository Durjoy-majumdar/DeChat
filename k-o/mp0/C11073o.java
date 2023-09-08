package mp0;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: mp0.o */
public final class C11073o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f32850d;

    public C11073o(Activity activity) {
        this.f32850d = activity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/menu/devtools/SecondaryMenuDelegate_GameGlyphBitmap$attachOnRootView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Activity activity = this.f32850d;
        Log.m105924i("MicroMsg.GameGlyphBitmap", "dl: attachOnRootView");
        View findViewById = activity.findViewById(16908290);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) findViewById;
        frameLayout.removeViewAt(frameLayout.getChildCount() - 1);
        frameLayout.removeViewAt(frameLayout.getChildCount() - 1);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/menu/devtools/SecondaryMenuDelegate_GameGlyphBitmap$attachOnRootView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
