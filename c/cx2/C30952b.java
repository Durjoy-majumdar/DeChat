package cx2;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import di3.C86301e;
import dx2.C31342c;
import dx2.C31343d;
import ei3.C86522b;
import ex2.C7946b;
import gy3.C87412m;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: cx2.b */
public final class C30952b extends C86301e {
    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        C30650a.m39147b(new C7946b(), "//surface");
        C31343d dVar = C31343d.f83890a;
        ((C119157j) C119157j.f356862d).mo183879j(C31342c.f83889d, 15000, "PackageDownloadManager");
    }
}
