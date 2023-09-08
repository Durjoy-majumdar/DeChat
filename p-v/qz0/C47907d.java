package qz0;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C46153l0;
import oz0.C47407b;

/* renamed from: qz0.d */
public class C47907d {

    /* renamed from: a */
    public MMActivity f128528a;

    /* renamed from: b */
    public View f128529b;

    /* renamed from: c */
    public C47407b f128530c;

    /* renamed from: d */
    public ImageView f128531d;

    /* renamed from: e */
    public LinearLayout f128532e;

    /* renamed from: f */
    public LinearLayout f128533f;

    /* renamed from: g */
    public TextView f128534g;

    public C47907d(MMActivity mMActivity, View view) {
        this.f128528a = mMActivity;
    }

    /* renamed from: a */
    public void mo72673a() {
        Integer num = (Integer) C46153l0.yx0().mo71382a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        C47407b bVar = this.f128530c;
        if (bVar == null || !bVar.mo72439k() || (!(num.intValue() == 1 || num.intValue() == 4) || !C47407b.m52741c())) {
            this.f128534g.setVisibility(8);
            C47407b bVar2 = this.f128530c;
            if (bVar2 != null) {
                Log.m105919d("MicroMsg.ShareCardFooterController", "updateView isLocalEnd %s isOtherEnd %s ", Boolean.valueOf(bVar2.mo72439k()), Boolean.valueOf(this.f128530c.mo72440l()));
                if (!this.f128530c.mo72439k() || !this.f128530c.mo72440l()) {
                    this.f128532e.setVisibility(0);
                    this.f128533f.setVisibility(8);
                } else if (this.f128530c.mo72439k() && this.f128530c.mo72440l()) {
                    this.f128532e.setVisibility(8);
                    this.f128533f.setVisibility(8);
                }
            } else {
                this.f128532e.setVisibility(8);
                this.f128533f.setVisibility(8);
            }
        } else {
            this.f128534g.setVisibility(0);
            this.f128532e.setVisibility(8);
            this.f128533f.setVisibility(8);
        }
    }
}
