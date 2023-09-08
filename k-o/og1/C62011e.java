package og1;

import android.view.View;
import androidx.transition.C103834d;
import androidx.transition.Transition;
import com.tencent.p014mm.plugin.finder.live.bubble.FrameBubbleContentLayout;
import com.tencent.p014mm.plugin.finder.live.bubble.LinearBubbleAnimateContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;

/* renamed from: og1.e */
public final class C62011e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FrameBubbleContentLayout f176280d;

    /* renamed from: e */
    public final /* synthetic */ LinearBubbleAnimateContainer f176281e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62011e(FrameBubbleContentLayout frameBubbleContentLayout, LinearBubbleAnimateContainer linearBubbleAnimateContainer) {
        super(0);
        this.f176280d = frameBubbleContentLayout;
        this.f176281e = linearBubbleAnimateContainer;
    }

    public Object invoke() {
        Log.m105924i("LinearBubbleAnimateContainer", "requestBubbleHide curContent: " + this.f176280d);
        this.f176281e.f159282d.remove(this.f176280d);
        this.f176281e.f159283e.remove(this.f176280d);
        if (this.f176280d.getVisibility() != 8) {
            FrameBubbleContentLayout frameBubbleContentLayout = this.f176280d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145208c(frameBubbleContentLayout)) {
                LinearBubbleAnimateContainer linearBubbleAnimateContainer = this.f176281e;
                FrameBubbleContentLayout frameBubbleContentLayout2 = this.f176280d;
                linearBubbleAnimateContainer.getClass();
                C103834d.m138407a(linearBubbleAnimateContainer, (Transition) null);
                frameBubbleContentLayout2.setVisibility(8);
            } else {
                this.f176280d.setVisibility(8);
            }
        }
        return C13598b0.f38549a;
    }
}
