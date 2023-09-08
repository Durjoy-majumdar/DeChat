package pk3;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiAllResultFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ok3.C62074i;
import sk3.C64024v;

/* renamed from: pk3.a */
public final class C62342a<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FTSMultiAllResultFragment f177194d;

    public C62342a(FTSMultiAllResultFragment fTSMultiAllResultFragment) {
        this.f177194d = fTSMultiAllResultFragment;
    }

    public void onChanged(Object obj) {
        C62074i iVar = (C62074i) obj;
        Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> " + this.f177194d.f165125q);
        if (this.f177194d.f165125q) {
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> " + iVar);
            if (iVar == C62074i.FINISH) {
                C39818r rVar = C39818r.f106831a;
                FragmentActivity activity = this.f177194d.getActivity();
                C87412m.m108591d(activity);
                this.f177194d.mo82056R(((C64024v) rVar.mo62443b(activity).mo75002a(C64024v.class)).mo88780e3());
                this.f177194d.f165125q = false;
                return;
            }
            Log.m105924i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> setResult to gone");
            TextView textView = this.f177194d.f165123o;
            if (textView != null) {
                textView.setVisibility(8);
            }
            RecyclerView recyclerView = this.f177194d.f165122n;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        }
    }
}
