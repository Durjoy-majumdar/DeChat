package ue1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p192l4.C10461a;
import p192l4.C10462b;
import p739wi.C53170a;
import up1.C52593j;
import ye1.C53515f;
import ye1.C53516g;

/* renamed from: ue1.k */
public final class C52542k extends C52530g {

    /* renamed from: o */
    public ArrayList<C52528f> f146752o = new ArrayList<>();

    /* renamed from: N5 */
    public void mo73475N5(int i, int i2) {
        notifyItemRangeInserted(i + mo73487Q5(), i2);
    }

    /* renamed from: O5 */
    public void mo73476O5(int i) {
        notifyItemRemoved(i + mo73487Q5());
    }

    /* renamed from: P5 */
    public C53170a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i != 10000) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.cux, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.n4i);
        if (textView != null) {
            C53516g gVar = new C53516g(frameLayout, frameLayout, textView);
            C87412m.m108593f(frameLayout, "viewBinding.root");
            return new C53170a(frameLayout, gVar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0966R.C0970id.n4i)));
    }

    /* renamed from: Q5 */
    public final int mo73487Q5() {
        return this.f146752o.size();
    }

    /* renamed from: R5 */
    public final C52528f mo73488R5(int i) {
        ArrayList<C52528f> arrayList = this.f146752o;
        C52528f fVar = null;
        if (!(i >= 0 && i < arrayList.size())) {
            arrayList = null;
        }
        if (arrayList != null) {
            fVar = arrayList.get(i);
        }
        return fVar == null ? C52593j.f146894e.mo73554a() : fVar;
    }

    public int getItemCount() {
        return super.getItemCount() + mo73487Q5();
    }

    public int getItemViewType(int i) {
        return mo73478u5(i).field_type;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C53170a aVar = (C53170a) zVar;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108594g(list, "payloads");
        C52528f u5 = mo73478u5(i);
        if (i >= mo73487Q5()) {
            super.onBindViewHolder(aVar, i, list);
            C10461a aVar2 = aVar.f173501C;
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            C53515f fVar = (C53515f) aVar2;
            if (!C58784w3.f168295a.mo83889N0() && C87412m.m108589b(u5.field_sessionId, "findersayhisessionholder")) {
                fVar.f150475f.setVisibility(8);
                fVar.f150474e.setVisibility(8);
                fVar.f150473d.setVisibility(8);
                fVar.f150472c.setVisibility(0);
                fVar.f150472c.setText(aVar.f173499A.getResources().getString(C0966R.string.f360481md0));
            }
        } else if (C87412m.m108589b("finder_system_message", u5.field_sessionId)) {
            super.onBindViewHolder(aVar, i, list);
            C10461a aVar3 = aVar.f173501C;
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding");
            ((C53515f) aVar3).f150470a.setImageResource(C0966R.C0969drawable.a37);
        } else if (u5.field_type == 10000) {
            C10461a aVar4 = aVar.f173501C;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationSysTipsItemBinding");
            TextView textView = ((C53516g) aVar4).f150476a;
            String str = u5.f146723b1;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
    }

    /* renamed from: u5 */
    public C52528f mo73478u5(int i) {
        return (i < 0 || i >= mo73487Q5()) ? super.mo73478u5(i - mo73487Q5()) : mo73488R5(i);
    }

    /* renamed from: w5 */
    public void mo73479w5(int i) {
        notifyItemChanged(i + mo73487Q5());
    }

    /* renamed from: y5 */
    public void mo73480y5(int i) {
        if (i >= 0) {
            notifyItemInserted(i + mo73487Q5());
        } else {
            notifyItemInserted(1);
        }
    }
}
