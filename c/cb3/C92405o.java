package cb3;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: cb3.o */
public class C92405o implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264456d;

    public C92405o(C92400k kVar) {
        this.f264456d = kVar;
    }

    public boolean onTimerExpired() {
        C92391b bVar;
        Log.m105918d("NoteSelectManager", "onTimerExpired: ");
        RecyclerView i = this.f264456d.mo126382i();
        C92400k kVar = this.f264456d;
        C92391b bVar2 = kVar.f264447x;
        boolean z = bVar2 != null && bVar2.f264384c < ((float) kVar.mo126384k(i));
        C92400k kVar2 = this.f264456d;
        C92391b bVar3 = kVar2.f264447x;
        boolean z2 = bVar3 != null && bVar3.f264384c > ((float) kVar2.mo126383j());
        if (!C92400k.f264411N || i == null || (bVar = this.f264456d.f264447x) == null || bVar.mo126355a() != 1 || (!z && !z2)) {
            MTimerHandler mTimerHandler = this.f264456d.f264448y;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        } else if (z && i.canScrollVertically(-1)) {
            C92400k kVar3 = this.f264456d;
            if (kVar3.f264447x.f264382a == 3) {
                kVar3.mo126376b();
            }
            this.f264456d.mo126375K(false);
            this.f264456d.mo126387n();
            this.f264456d.mo126389p();
            i.smoothScrollBy(0, -300);
        } else if (z2 && i.canScrollVertically(1)) {
            this.f264456d.mo126375K(false);
            this.f264456d.mo126387n();
            this.f264456d.mo126389p();
            i.smoothScrollBy(0, 300);
        }
        return true;
    }
}
