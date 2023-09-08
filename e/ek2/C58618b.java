package ek2;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import ck2.C54914j0;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import ek2.C58619c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import wj2.C66132f;

/* renamed from: ek2.b */
public final class C58618b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58615a f167836d;

    /* renamed from: e */
    public final /* synthetic */ C66132f f167837e;

    public C58618b(C58615a aVar, C66132f fVar) {
        this.f167836d = aVar;
        this.f167837e = fVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C66132f fVar = this.f167836d.f167830h;
        boolean z = true;
        if (fVar == null || !fVar.f190091n) {
            z = false;
        }
        if (!z) {
            if (this.f167837e.mo90179j()) {
                C39818r rVar = C39818r.f106831a;
                C39622i0 a = rVar.mo62443b(this.f167836d.f167829g).mo75002a(RingtoneDataUIC.class);
                C87412m.m108593f(a, "UICProvider.of(mContext)…gtoneDataUIC::class.java)");
                RingtoneDataUIC.m66025e3((RingtoneDataUIC) a, this.f167837e, 39, 22, 0, (String) null, 0, 56, (Object) null);
                ((C54914j0) rVar.mo62443b(this.f167836d.f167829g).mo75002a(C54914j0.class)).mo75843c3(this.f167837e, "");
            } else {
                C58619c.C58621b.m68074a(this.f167836d, C58619c.C58620a.PLAY, (Bundle) null, 2, (Object) null);
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/widget/CommonRingtoneLayout$refreshCommonRingBackInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
