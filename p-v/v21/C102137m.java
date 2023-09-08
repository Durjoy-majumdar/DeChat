package v21;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: v21.m */
public class C102137m implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300786d;

    public C102137m(C102132i iVar) {
        this.f300786d = iVar;
    }

    public boolean onTimerExpired() {
        C102125b bVar;
        Log.m105918d("MicroMsg.Editor.EditorSelectManager", "onTimerExpired: ");
        RecyclerView i = this.f300786d.mo141660i();
        C102132i iVar = this.f300786d;
        C102125b bVar2 = iVar.f300777x;
        boolean z = bVar2 != null && bVar2.f300723c < ((float) iVar.mo141662k(i));
        C102132i iVar2 = this.f300786d;
        C102125b bVar3 = iVar2.f300777x;
        boolean z2 = bVar3 != null && bVar3.f300723c > ((float) iVar2.mo141661j());
        if (!C102132i.f300744K || i == null || (bVar = this.f300786d.f300777x) == null || bVar.mo141641a() != 1 || (!z && !z2)) {
            MTimerHandler mTimerHandler = this.f300786d.f300778y;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        } else if (z && i.canScrollVertically(-1)) {
            C102132i iVar3 = this.f300786d;
            if (iVar3.f300777x.f300721a == 3) {
                iVar3.mo141654b();
            }
            this.f300786d.mo141653G(false);
            this.f300786d.mo141665n();
            this.f300786d.mo141667p();
            i.smoothScrollBy(0, -300);
        } else if (z2 && i.canScrollVertically(1)) {
            this.f300786d.mo141653G(false);
            this.f300786d.mo141665n();
            this.f300786d.mo141667p();
            i.smoothScrollBy(0, 300);
        }
        return true;
    }
}
