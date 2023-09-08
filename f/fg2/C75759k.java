package fg2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import qo3.C77398g;

/* renamed from: fg2.k */
public final class C75759k implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222361d;

    public C75759k(RadarMemberView radarMemberView) {
        this.f222361d = radarMemberView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f222361d.f203317y;
        if (gVar != null) {
            gVar.dismiss();
        }
        this.f222361d.f203317y = null;
    }
}
