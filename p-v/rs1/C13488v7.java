package rs1;

import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import zc1.C66785b;

/* renamed from: rs1.v7 */
public final class C13488v7 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13521w7 f38218d;

    public C13488v7(C13521w7 w7Var) {
        this.f38218d = w7Var;
    }

    public final void run() {
        C13521w7 w7Var = this.f38218d;
        w7Var.getClass();
        Log.m105924i("Finder.PostQualityUIC", "showBottomSheet");
        if (C66785b.f191882e.mo90662O5().length() > 0) {
            Log.m105924i("Finder.PostQualityUIC", "showBottomSheet return ,finder account exit");
            return;
        }
        C4191v0 v0Var = new C4191v0(w7Var.getActivity());
        v0Var.mo5070e(C0966R.C0971layout.abm);
        v0Var.f18463f.findViewById(C0966R.C0970id.ep6).setOnClickListener(new C13532x7(v0Var));
        int i = C0966R.C0969drawable.ch4;
        if (C85875k4.m106211z()) {
            i = C0966R.C0969drawable.ch5;
        }
        ((ImageView) v0Var.f18463f.findViewById(C0966R.C0970id.ep8)).setImageResource(i);
        v0Var.mo5073h();
        w7Var.f38350d = null;
    }
}
