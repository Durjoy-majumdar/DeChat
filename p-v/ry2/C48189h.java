package ry2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import fz2.C45869e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import p192l4.C10461a;
import p192l4.C10462b;
import p739wi.C53170a;
import p773yy.C79168k;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48212k;
import sx3.C64197v;
import tl3.C78039a;
import uy2.C52657a;
import uy2.C52660e;
import xy2.C53477h;

/* renamed from: ry2.h */
public final class C48189h extends BasePrivateMsgConvListFragment.C40273a<C52660e> {

    /* renamed from: e */
    public LinkedList<C52660e> f129153e = new LinkedList<>();

    /* renamed from: f */
    public C32228q<? super View, ? super Integer, ? super C52660e, C13598b0> f129154f;

    /* renamed from: g */
    public C32228q<? super View, ? super Integer, ? super C52660e, Boolean> f129155g;

    /* renamed from: ry2.h$a */
    public static final class C48190a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f129156d;

        /* renamed from: e */
        public final /* synthetic */ C48189h f129157e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48190a(MStorageEventData mStorageEventData, C48189h hVar) {
            super(0);
            this.f129156d = mStorageEventData;
            this.f129157e = hVar;
        }

        public Object invoke() {
            Object obj = this.f129156d.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusGreetingItem");
            C52660e eVar = (C52660e) obj;
            int i = this.f129156d.eventId;
            int i2 = 0;
            if (i == 2) {
                C48189h hVar = this.f129157e;
                hVar.f129153e.add(0, eVar);
                hVar.notifyItemInserted(0);
            } else if (i == 5) {
                C48189h hVar2 = this.f129157e;
                LinkedList<C52660e> linkedList = hVar2.f129153e;
                C87412m.m108594g(linkedList, "<this>");
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    T next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C64197v.m75542k();
                        throw null;
                    } else if (((C52660e) next).field_newMsgId == eVar.field_newMsgId) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
                if (i2 >= 0 && i2 < hVar2.f129153e.size()) {
                    hVar2.f129153e.remove(i2);
                    hVar2.notifyItemRemoved(i2);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ry2.h$b */
    public static final class C48191b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f129158d;

        /* renamed from: e */
        public final /* synthetic */ C48189h f129159e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48191b(MStorageEventData mStorageEventData, C48189h hVar) {
            super(0);
            this.f129158d = mStorageEventData;
            this.f129159e = hVar;
        }

        public Object invoke() {
            Object obj = this.f129158d.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.TextStatusStrangerContact");
            C48212k kVar = (C48212k) obj;
            int i = this.f129158d.eventId;
            if (i == 2 || i == 3) {
                C48189h hVar = this.f129159e;
                LinkedList<C52660e> linkedList = hVar.f129153e;
                C87412m.m108594g(linkedList, "<this>");
                LinkedList<Number> linkedList2 = new LinkedList<>();
                int i2 = 0;
                for (T next : linkedList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (C87412m.m108589b(((C52660e) next).field_session_id, kVar.field_sessionId)) {
                            linkedList2.add(Integer.valueOf(i2));
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                for (Number intValue : linkedList2) {
                    int intValue2 = intValue.intValue();
                    if (intValue2 >= 0 && intValue2 < hVar.f129153e.size()) {
                        hVar.notifyItemChanged(intValue2);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ry2.h$c */
    public static final class C48192c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f129160d;

        /* renamed from: e */
        public final /* synthetic */ C48189h f129161e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48192c(MStorageEventData mStorageEventData, C48189h hVar) {
            super(0);
            this.f129160d = mStorageEventData;
            this.f129161e = hVar;
        }

        public Object invoke() {
            Object obj = this.f129160d.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
            C52657a aVar = (C52657a) obj;
            C48189h hVar = this.f129161e;
            LinkedList<C52660e> linkedList = hVar.f129153e;
            C87412m.m108594g(linkedList, "<this>");
            Iterator<T> it = linkedList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                T next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C64197v.m75542k();
                    throw null;
                } else if (C87412m.m108589b(((C52660e) next).field_session_id, aVar.field_sessionId)) {
                    break;
                } else {
                    i = i2;
                }
            }
            if (i >= 0 && i < hVar.f129153e.size()) {
                hVar.notifyItemChanged(i);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: F4 */
    public List<C52660e> mo62831F4() {
        return this.f129153e;
    }

    /* renamed from: G4 */
    public void mo62832G4(boolean z, List<C52660e> list) {
        C87412m.m108594g(list, "convs");
        int itemCount = getItemCount();
        this.f129153e.addAll(list);
        notifyItemRangeInserted(itemCount, list.size());
    }

    /* renamed from: O4 */
    public boolean mo62833O4(String str, MStorageEventData mStorageEventData) {
        if (str == null || mStorageEventData == null) {
            return false;
        }
        Log.m105924i("MicroMsg.TextStatus.TextStatusGreetingAdapter", "[onConversationStorageChange] eventData.eventId = " + mStorageEventData.eventId + ",obj=" + mStorageEventData.obj);
        Object obj = mStorageEventData.obj;
        if (obj instanceof C52660e) {
            C61926c.m72668M(new C48190a(mStorageEventData, this));
        } else if (obj instanceof C48212k) {
            C61926c.m72668M(new C48191b(mStorageEventData, this));
        } else if (!(obj instanceof C52657a)) {
            return false;
        } else {
            C61926c.m72668M(new C48192c(mStorageEventData, this));
        }
        return true;
    }

    public int getItemCount() {
        return this.f129153e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C53170a aVar = (C53170a) zVar;
        Class cls = C53477h.class;
        C87412m.m108594g(aVar, "holder");
        C87412m.m108593f(aVar.f44854d, "holder.itemView");
        C10461a aVar2 = aVar.f173501C;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusGreetingItemBinding");
        C45869e eVar = (C45869e) aVar2;
        C52660e eVar2 = this.f129153e.get(i);
        C87412m.m108593f(eVar2, "dataList[position]");
        C52660e eVar3 = eVar2;
        aVar.f173503E = eVar3;
        C78039a.m94189a(eVar.f123821a, eVar3.field_session_id);
        TextView textView = eVar.f123825e;
        int i2 = eVar3.f147047M;
        boolean z = false;
        if (i2 == 0) {
            textView.setVisibility(8);
        } else if (i2 == 1) {
            textView.setVisibility(0);
            textView.setText(C0966R.string.k0q);
        } else if (i2 == 2) {
            textView.setVisibility(0);
            textView.setText(C0966R.string.k1f);
        }
        C48212k wx02 = ((C53477h) C86312j.m106911c(cls)).wx0(eVar3.field_session_id);
        C79168k kVar = (C79168k) C86312j.m106911c(C79168k.class);
        TextView textView2 = eVar.f123823c;
        String str = eVar3.field_session_id;
        String str2 = wx02 != null ? wx02.field_nickname : null;
        if (str2 == null) {
            str2 = "";
        }
        eVar.f123823c.setText(kVar.mo74108Fe(textView2, str, str2, C63347a.C47892c.PRIVATE_CONVERSATION_LIST, textView2.getTextSize()));
        eVar.f123824d.setText(eVar3.field_plain);
        Button button = eVar.f123822b;
        C48212k wx03 = ((C53477h) C86312j.m106911c(cls)).wx0(eVar3.field_session_id);
        if (wx03 != null && wx03.field_canTalk == 1) {
            z = true;
        }
        button.setText(aVar.f173499A.getResources().getString(z ? C0966R.string.k0l : C0966R.string.k0m));
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.c9b, viewGroup, false);
        int i2 = C0966R.C0970id.a1r;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.a1r);
        if (imageView != null) {
            i2 = C0966R.C0970id.f357579al0;
            Button button = (Button) C10462b.m10395a(inflate, C0966R.C0970id.f357579al0);
            if (button != null) {
                i2 = C0966R.C0970id.btb;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.btb);
                if (textView != null) {
                    i2 = C0966R.C0970id.f357849c24;
                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f357849c24);
                    if (textView2 != null) {
                        i2 = C0966R.C0970id.kkj;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkj);
                        if (textView3 != null) {
                            i2 = C0966R.C0970id.km9;
                            TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km9);
                            if (textView4 != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                C45869e eVar = new C45869e(linearLayout, imageView, button, textView, textView2, textView3, textView4);
                                C87412m.m108593f(linearLayout, "itemBinding.root");
                                C53170a aVar = new C53170a(linearLayout, eVar);
                                linearLayout.setOnClickListener(new C48193i(aVar, this));
                                linearLayout.setOnLongClickListener(new C48194j(aVar, this));
                                button.setOnClickListener(new C13607k(linearLayout));
                                return aVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
