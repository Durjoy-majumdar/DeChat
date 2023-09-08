package p92;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.multitask.p079ui.MultiTaskFloatBallView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CopyOnWriteArraySet;
import kg3.C76577a;

/* renamed from: p92.d */
public final class C110204d {

    /* renamed from: a */
    public MultiTaskFloatBallView f329685a;

    /* renamed from: b */
    public ViewGroup f329686b;

    /* renamed from: c */
    public int f329687c = 1;

    public C110204d(Context context) {
        C87412m.m108594g(context, "context");
        C76577a.m92159j(context);
        MultiTaskFloatBallView multiTaskFloatBallView = new MultiTaskFloatBallView(context, (AttributeSet) null, 0, 6, (C8480h) null);
        this.f329685a = multiTaskFloatBallView;
        ((CopyOnWriteArraySet) multiTaskFloatBallView.f315142g).add(new C110203c(this));
    }

    /* renamed from: a */
    public final void mo161609a() {
        try {
            ViewGroup viewGroup = this.f329686b;
            if (viewGroup != null) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f329685a);
                }
                Log.m105924i("MicroMsg.FloatBallContainer", "detachFromWindowInternal, detach all views");
                return;
            }
            Log.m105920e("MicroMsg.FloatBallContainer", "detachFromWindowInternal, window manager is null");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FloatBallContainer", e, "detachFromWindowInternal exception", new Object[0]);
        }
    }
}
