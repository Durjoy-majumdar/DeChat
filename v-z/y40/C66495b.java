package y40;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.live.view.BaseLivePluginLayout;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: y40.b */
public final class C66495b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C66491a f191291d;

    /* renamed from: y40.b$a */
    public static final class C66496a implements C7020t0 {

        /* renamed from: d */
        public final /* synthetic */ C66491a f191292d;

        public C66496a(C66491a aVar) {
            this.f191292d = aVar;
        }

        /* renamed from: Q1 */
        public final void mo531Q1(int i, boolean z) {
            String str = this.f191292d.f191278e;
            Log.m105924i(str, "onKeyboardHeightChanged, height:" + i + ", isResized:" + z);
            C66491a aVar = this.f191292d;
            boolean z2 = i > 0;
            if (aVar.f191284k != z2) {
                aVar.f191284k = z2;
                BaseLivePluginLayout baseLivePluginLayout = aVar.f191283j;
                if (baseLivePluginLayout != null) {
                    baseLivePluginLayout.keyboardChange(z2, i);
                }
            }
        }
    }

    public C66495b(C66491a aVar) {
        this.f191291d = aVar;
    }

    public final void run() {
        C66491a aVar = this.f191291d;
        if (aVar.f191285l == null) {
            Context context = aVar.f191274a;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            aVar.f191285l = new KeyboardHeightProvider((Activity) context);
            C66491a aVar2 = this.f191291d;
            KeyboardHeightProvider keyboardHeightProvider = aVar2.f191285l;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.f220015b = new C66496a(aVar2);
            }
        }
        KeyboardHeightProvider keyboardHeightProvider2 = this.f191291d.f191285l;
        if (keyboardHeightProvider2 != null) {
            keyboardHeightProvider2.mo104022e();
        }
    }
}
