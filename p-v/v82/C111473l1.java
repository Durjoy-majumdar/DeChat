package v82;

import android.widget.TextView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultitalkFrameView;
import lu3.C109426i;
import z04.C66725r;

/* renamed from: v82.l1 */
public final class C111473l1 implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ MultitalkFrameView f333736d;

    public C111473l1(MultitalkFrameView multitalkFrameView) {
        this.f333736d = multitalkFrameView;
    }

    public String getKey() {
        return "refreshDebugInfo";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        MultitalkFrameView multitalkFrameView = this.f333736d;
        TextView textView = multitalkFrameView.f314982f;
        if (textView != null) {
            textView.setText(C66725r.m78728b("\n            mid: " + multitalkFrameView.f314992s + "\n            fps: " + multitalkFrameView.f314991r + "\n            size: " + multitalkFrameView.f314994u + 'x' + multitalkFrameView.f314995v + "\n            isILink: " + multitalkFrameView.f314993t + "\n            "));
        }
        multitalkFrameView.f314991r = 0;
    }
}
