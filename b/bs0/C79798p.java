package bs0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import rx3.C13604l;
import sx3.C64197v;

/* renamed from: bs0.p */
public final class C79798p extends RecyclerView.C16613e<C79796k> {

    /* renamed from: d */
    public final ArrayList<C79800r> f233860d = new ArrayList<>();

    /* renamed from: e */
    public final HashMap<String, C13604l<C79800r, Integer>> f233861e = new HashMap<>();

    /* renamed from: F4 */
    public final void mo109933F4(List<C79800r> list) {
        C87412m.m108594g(list, "fetchedUserAuthScopeList");
        int size = this.f233860d.size();
        int size2 = list.size();
        Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "appendFetchedUserAuthorizeScopeList, posInsert: " + size + ", insertCount: " + size2);
        this.f233860d.addAll(list);
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C79800r rVar = (C79800r) next;
                HashMap<String, C13604l<C79800r, Integer>> hashMap = this.f233861e;
                String str = rVar.f233864a.field_username;
                C87412m.m108593f(str, "authScopeInfo.wxaAttrs.field_username");
                hashMap.put(str, new C13604l(rVar, Integer.valueOf(i + size)));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        notifyItemRangeInserted(size, size2);
    }

    public int getItemCount() {
        return this.f233860d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C79796k kVar = (C79796k) zVar;
        C87412m.m108594g(kVar, "holder");
        try {
            C79800r rVar = this.f233860d.get(i);
            C87412m.m108593f(rVar, "try {\n                us…     return\n            }");
            ImageView imageView = kVar.f233856z;
            if (imageView != null) {
                String str = C88394b.f255384g;
                C88394b.C88418q.f255427a.mo122786b(imageView, rVar.f233864a.field_brandIconURL, C88393a.m110230a(), C88431k.f255437d);
            }
            TextView textView = kVar.f233853A;
            if (textView != null) {
                textView.setText(rVar.f233864a.field_nickname);
            }
            TextView textView2 = kVar.f233854B;
            if (textView2 != null) {
                textView2.post(new C79797o(kVar, this, rVar));
            }
            View view = kVar.f233855C;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.setMarginStart(i != this.f233860d.size() + -1 ? C76577a.m92155f(view.getContext(), C0966R.dimen.f357006av1) : 0);
                    view.setLayoutParams(layoutParams2);
                }
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrandPrivacyManagePage", "onBindViewHolder, get authScopeInfo fail since " + e + ", position: " + i);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        return new C79796k(viewGroup);
    }
}
