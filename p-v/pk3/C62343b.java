package pk3;

import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.chatting.search.multi.fragment.FTSMultiNormalResultFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import ok3.C62070e;
import ok3.C62074i;
import sk3.C63994l0;

/* renamed from: pk3.b */
public final class C62343b<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ FTSMultiNormalResultFragment f177195d;

    public C62343b(FTSMultiNormalResultFragment fTSMultiNormalResultFragment) {
        this.f177195d = fTSMultiNormalResultFragment;
    }

    public void onChanged(Object obj) {
        C62074i iVar = (C62074i) obj;
        Log.m105924i("MicroMsg.FTSMultiNormalResultFragment", "observe >> " + this.f177195d.f165127j + ", searchState: " + iVar);
        C63994l0 S = this.f177195d.mo82059S();
        ArrayList<C62070e> arrayList = S != null ? S.f181421j : null;
        if (iVar == C62074i.FINISH) {
            this.f177195d.mo82058R(arrayList);
            return;
        }
        RecyclerView recyclerView = this.f177195d.f165129o;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        TextView textView = this.f177195d.f165130p;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }
}
