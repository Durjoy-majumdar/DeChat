package el1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import nj3.C76912y0;
import sx3.C110818d0;
import te3.C50555nj3;

/* renamed from: el1.o */
public final class C7754o<T> implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C7741d f26250a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList<String> f26251b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList<List<String>> f26252c;

    public C7754o(C7741d dVar, ArrayList<String> arrayList, ArrayList<List<String>> arrayList2) {
        this.f26250a = dVar;
        this.f26251b = arrayList;
        this.f26252c = arrayList2;
    }

    public final void onResult(boolean z, Object obj, Object obj2) {
        C7045j jVar = this.f26250a.f26236y;
        if (jVar != null) {
            jVar.mo8101d();
        }
        if (z) {
            try {
                ArrayList<String> arrayList = this.f26251b;
                C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int P = C110818d0.m150918P(arrayList, (CharSequence) obj);
                List<String> list = this.f26252c.get(P);
                C87412m.m108593f(list, "minuteList[firstChosenIndex]");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = list.indexOf((CharSequence) obj2);
                int i = (P * 3600) + (indexOf * 60);
                StringBuilder sb = new StringBuilder();
                sb.append("chosen time:");
                sb.append(obj);
                sb.append(' ');
                sb.append(obj2);
                sb.append(",firstChosenIndex:");
                sb.append(P);
                sb.append(",secChosenIndex:");
                sb.append(indexOf);
                sb.append(",duration:");
                sb.append(i);
                sb.append(",preview_type:");
                C50555nj3 nj32 = this.f26250a.f26214A.f140583g;
                sb.append(nj32 != null ? Integer.valueOf(nj32.f138632d) : null);
                Log.m105924i("FinderLiveChargeWhiteListUIC", sb.toString());
                if (i <= 0) {
                    C76912y0.m92773l(this.f26250a.getActivity(), this.f26250a.getActivity().getResources().getString(C0966R.string.n7e));
                    return;
                }
                C7741d dVar = this.f26250a;
                boolean z2 = true;
                dVar.f26215B = true;
                C50555nj3 nj33 = dVar.f26214A.f140583g;
                if (nj33 == null || nj33.f138632d != 2) {
                    z2 = false;
                }
                if (z2) {
                    if (nj33 != null) {
                        nj33.f138634f = i;
                    }
                } else if (nj33 != null) {
                    nj33.f138633e = i;
                }
                dVar.mo8864f3();
            } catch (Throwable th) {
                Log.m105924i("FinderLiveChargeWhiteListUIC", th.getMessage());
            }
        }
    }
}
