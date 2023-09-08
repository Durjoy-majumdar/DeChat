package rs1;

import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import bl3.C54492n;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: rs1.y8 */
public final class C13552y8<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C13146c9 f38435d;

    public C13552y8(C13146c9 c9Var) {
        this.f38435d = c9Var;
    }

    public void onChanged(Object obj) {
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("[SHOW NEW] red=");
        boolean z = true;
        sb.append(aVar != null && aVar.f12908a);
        Log.m105924i(C54492n.TAG, sb.toString());
        if (aVar == null || !aVar.f12908a) {
            z = false;
        }
        if (z) {
            TextView textView = this.f38435d.f37417j;
            if (textView != null) {
                textView.setVisibility(0);
            } else {
                C87412m.m108603p("finderCanPostNoContact");
                throw null;
            }
        } else {
            TextView textView2 = this.f38435d.f37417j;
            if (textView2 != null) {
                textView2.setVisibility(8);
            } else {
                C87412m.m108603p("finderCanPostNoContact");
                throw null;
            }
        }
    }
}
