package d00;

import android.content.Context;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C6360x;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import e00.C7576p0;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;
import te3.a35;

@C86522b
/* renamed from: d00.a1 */
public final class C7156a1 extends C86301e implements C7576p0 {
    public String ms0(String str) {
        a35 e;
        if (C6360x.f23276k == null) {
            synchronized (C6360x.class) {
                if (C6360x.f23276k == null) {
                    Context context = MMApplicationContext.getContext();
                    C87412m.m108593f(context, "getContext()");
                    C6360x xVar = new C6360x(context, (C8480h) null);
                    C6360x.f23276k = xVar;
                    IListener<MusicPlayerEvent> iListener = xVar.f23281e;
                    if (iListener != null) {
                        iListener.alive();
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
        C6360x xVar2 = C6360x.f23276k;
        if (xVar2 == null || (e = xVar2.mo7355e(str)) == null) {
            return null;
        }
        return e.f130282f;
    }
}
