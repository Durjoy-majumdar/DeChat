package fg2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import qo3.C77398g;

/* renamed from: fg2.l */
public final class C75760l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222362d;

    public C75760l(RadarMemberView radarMemberView) {
        this.f222362d = radarMemberView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f222362d.f203317y;
        if (gVar != null) {
            if (gVar != null) {
                gVar.dismiss();
            }
            this.f222362d.f203317y = null;
        }
        RadarMemberView.m82917a(this.f222362d);
    }
}
