package vf1;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import te3.C64638pv3;

/* renamed from: vf1.u4 */
public final class C65733u4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f189098d;

    public C65733u4(FinderSharePostUI finderSharePostUI) {
        this.f189098d = finderSharePostUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        C64638pv3 pv32 = this.f189098d.mo77442Q7().f184201e;
        String str3 = "";
        if (pv32 == null || (str = pv32.f184892d) == null) {
            str = str3;
        }
        C64638pv3 pv33 = this.f189098d.mo77442Q7().f184201e;
        if (!(pv33 == null || (str2 = pv33.f184893e) == null)) {
            str3 = str2;
        }
        this.f189098d.mo77441P7(-6, "teenmode", str, str3);
        this.f189098d.finish();
    }
}
