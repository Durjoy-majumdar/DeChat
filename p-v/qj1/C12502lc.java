package qj1;

import android.widget.RelativeLayout;
import androidx.lifecycle.C0120a0;
import cl1.C39975j;

/* renamed from: qj1.lc */
public final class C12502lc<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12475jc f35954d;

    public C12502lc(C12475jc jcVar) {
        this.f35954d = jcVar;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (((C39975j) this.f35954d.mo87696x0(C39975j.class)).mo62578e3()) {
            this.f35954d.mo12130Z0();
        } else if (this.f35954d.mo12134d1()) {
            C12475jc jcVar = this.f35954d;
            jcVar.mo12132b1(-2);
            jcVar.f35888r.requestLayout();
            RelativeLayout relativeLayout = jcVar.f35890t;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
        } else {
            this.f35954d.mo12131a1();
        }
    }
}
