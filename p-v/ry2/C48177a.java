package ry2;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C45081s1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32228q;
import fz2.C45867c;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import kg3.C76577a;
import o40.C61926c;
import p192l4.C10461a;
import p192l4.C10462b;
import p629ny.C76979h;
import p739wi.C53170a;
import p773yy.C79168k;
import qy2.C63347a;
import rx3.C13598b0;
import rz2.C48212k;
import sx3.C110818d0;
import tl3.C78039a;
import uy2.C52657a;
import uy2.C52660e;
import vy2.C53042b;
import xy2.C53477h;
import yy2.C53659b;
import z04.C112551y;

/* renamed from: ry2.a */
public final class C48177a extends BasePrivateMsgConvListFragment.C40273a<C52657a> {

    /* renamed from: e */
    public LinkedList<C52657a> f129126e = new LinkedList<>();

    /* renamed from: f */
    public HashMap<String, C52657a> f129127f = new HashMap<>();

    /* renamed from: g */
    public C32228q<? super View, ? super Integer, ? super C52657a, C13598b0> f129128g;

    /* renamed from: h */
    public C32228q<? super View, ? super Integer, ? super C52657a, C13598b0> f129129h;

    /* renamed from: ry2.a$a */
    public static final class C48178a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f129130d;

        /* renamed from: e */
        public final /* synthetic */ C48177a f129131e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<C52657a> f129132f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48178a(MStorageEventData mStorageEventData, C48177a aVar, C8479f0<C52657a> f0Var) {
            super(0);
            this.f129130d = mStorageEventData;
            this.f129131e = aVar;
            this.f129132f = f0Var;
        }

        public Object invoke() {
            Log.m105924i("MicroMsg.TextStatus.TextStatusConversationAdapter", "[onConversationStorageChange] eventData.eventId = " + this.f129130d.eventId + ',');
            int i = this.f129130d.eventId;
            if (i == 1 || i == 2) {
                C48177a.m53514g5(this.f129131e, (C52657a) this.f129132f.f27484d);
            } else if (i == 5) {
                C48177a aVar = this.f129131e;
                C52657a aVar2 = (C52657a) this.f129132f.f27484d;
                int P = C110818d0.m150918P(aVar.f129126e, aVar.f129127f.get(aVar2.field_sessionId));
                aVar2.mo73602l2();
                if (P >= 0 && P < aVar.f129126e.size()) {
                    aVar.f129126e.set(P, aVar2);
                    HashMap<String, C52657a> hashMap = aVar.f129127f;
                    String str = aVar2.field_sessionId;
                    C87412m.m108593f(str, "conv.field_sessionId");
                    hashMap.put(str, aVar2);
                    if (P >= 0 && P < aVar.f129126e.size()) {
                        aVar.notifyItemChanged(P);
                    }
                }
            } else if (i == 6) {
                C48177a aVar3 = this.f129131e;
                C52657a aVar4 = (C52657a) this.f129132f.f27484d;
                int P2 = C110818d0.m150918P(aVar3.f129126e, aVar3.f129127f.get(aVar4.field_sessionId));
                if (P2 >= 0 && P2 < aVar3.f129126e.size()) {
                    aVar3.f129126e.remove(P2);
                    aVar3.f129127f.remove(aVar4.field_sessionId);
                    aVar3.notifyItemRemoved(P2);
                }
            } else if (i == 7) {
                C48177a.m53514g5(this.f129131e, (C52657a) this.f129132f.f27484d);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ry2.a$b */
    public static final class C48179b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48177a f129133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48179b(C48177a aVar) {
            super(0);
            this.f129133d = aVar;
        }

        public Object invoke() {
            C48177a.m53515u5(this.f129133d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ry2.a$c */
    public static final class C48180c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f129134d;

        /* renamed from: e */
        public final /* synthetic */ C48177a f129135e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48180c(MStorageEventData mStorageEventData, C48177a aVar) {
            super(0);
            this.f129134d = mStorageEventData;
            this.f129135e = aVar;
        }

        public Object invoke() {
            int i = this.f129134d.eventId;
            if (i == 2 || i == 5) {
                C48177a.m53515u5(this.f129135e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ry2.a$d */
    public static final class C48181d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C48177a f129136d;

        /* renamed from: e */
        public final /* synthetic */ MStorageEventData f129137e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48181d(C48177a aVar, MStorageEventData mStorageEventData) {
            super(0);
            this.f129136d = aVar;
            this.f129137e = mStorageEventData;
        }

        public Object invoke() {
            C48177a aVar = this.f129136d;
            Object obj = this.f129137e.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.TextStatusStrangerContact");
            C52657a aVar2 = aVar.f129127f.get(((C48212k) obj).field_sessionId);
            int P = C110818d0.m150918P(aVar.f129126e, aVar2);
            if (aVar2 != null) {
                aVar2.mo73602l2();
            }
            aVar.notifyItemChanged(P);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: g5 */
    public static final void m53514g5(C48177a aVar, C52657a aVar2) {
        int i;
        int i2;
        boolean z;
        int P = C110818d0.m150918P(aVar.f129126e, aVar.f129127f.get(aVar2.field_sessionId));
        if (P >= 0) {
            aVar.f129126e.remove(P);
            aVar.notifyItemRemoved(P);
        }
        aVar2.mo73602l2();
        LinkedList<C52657a> linkedList = aVar.f129126e;
        ListIterator<C52657a> listIterator = linkedList.listIterator(linkedList.size());
        while (true) {
            i = 0;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            C52657a previous = listIterator.previous();
            if (previous.field_placedFlag > 0 || C87412m.m108589b(previous.field_sessionId, "textstatussayhisessionholder")) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        if (i2 >= 0) {
            i = i2 + 1;
        }
        aVar.f129126e.add(i, aVar2);
        aVar.notifyItemInserted(i);
        aVar.f129127f.remove(aVar2.field_sessionId);
        HashMap<String, C52657a> hashMap = aVar.f129127f;
        String str = aVar2.field_sessionId;
        C87412m.m108593f(str, "conv.field_sessionId");
        hashMap.put(str, aVar2);
    }

    /* renamed from: u5 */
    public static final void m53515u5(C48177a aVar) {
        aVar.getClass();
        C39674e.f106452d.mo62243O().getClass();
        if (aVar.f129126e.size() > 0) {
            C52657a aVar2 = aVar.f129126e.get(0);
            C87412m.m108593f(aVar2, "dataList[0]");
            if (C53042b.m59369a(aVar2)) {
                aVar.f129126e.remove(0);
                aVar.notifyItemRemoved(0);
            }
        }
    }

    /* renamed from: F4 */
    public List<C52657a> mo62831F4() {
        return this.f129126e;
    }

    /* renamed from: G4 */
    public void mo62832G4(boolean z, List<C52657a> list) {
        C87412m.m108594g(list, "convs");
        C61926c.m72668M(new C48184d(this, list));
    }

    /* renamed from: O4 */
    public boolean mo62833O4(String str, MStorageEventData mStorageEventData) {
        if (str == null || mStorageEventData == null) {
            return false;
        }
        if (mStorageEventData.obj instanceof C52657a) {
            C8479f0 f0Var = new C8479f0();
            T t = mStorageEventData.obj;
            C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
            f0Var.f27484d = (C52657a) t;
            C61926c.m72668M(new C48178a(mStorageEventData, this, f0Var));
        } else {
            String str2 = mStorageEventData.event;
            String[] strArr = C53659b.f150723e;
            if (C87412m.m108589b(str2, C53659b.f150724f)) {
                C61926c.m72668M(new C48179b(this));
            } else {
                Object obj = mStorageEventData.obj;
                if (obj instanceof C52660e) {
                    C61926c.m72668M(new C48180c(mStorageEventData, this));
                } else if (!(obj instanceof C48212k)) {
                    return false;
                } else {
                    C61926c.m72668M(new C48181d(this, mStorageEventData));
                }
            }
        }
        return true;
    }

    public int getItemCount() {
        return this.f129126e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        CharSequence charSequence;
        C53170a aVar = (C53170a) zVar;
        C87412m.m108594g(aVar, "holder");
        View view = aVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C10461a aVar2 = aVar.f173501C;
        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.databinding.TextStatusConversationItemBinding");
        C45867c cVar = (C45867c) aVar2;
        C52657a aVar3 = this.f129126e.get(i);
        C87412m.m108593f(aVar3, "dataList[position]");
        C52657a aVar4 = aVar3;
        aVar.f173503E = aVar4;
        int i2 = 0;
        if (C53042b.m59369a(aVar4)) {
            cVar.f123812b.setText(aVar4.f147041R0);
            TextView textView = cVar.f123813c;
            C39674e eVar = C39674e.f106452d;
            C52660e Lo = eVar.mo62243O().mo74249Lo();
            String str = "";
            if (Lo != null) {
                C48212k wx02 = ((C53477h) C86312j.m106911c(C53477h.class)).wx0(Lo.field_session_id);
                String str2 = wx02 != null ? wx02.field_nickname : null;
                if (str2 != null) {
                    str = str2;
                }
                str = str + 65306 + Lo.field_plain;
            }
            textView.setText(str);
            int jo = C53659b.m60196jo(eVar.mo62243O(), 0, 1, (Object) null);
            TextView textView2 = cVar.f123816f;
            if (jo <= 0) {
                i2 = 8;
            }
            textView2.setVisibility(i2);
            cVar.f123815e.setVisibility(8);
            C78039a.m94189a(cVar.f123811a, aVar4.field_sessionId);
            return;
        }
        C78039a.m94189a(cVar.f123811a, aVar4.field_sessionId);
        TextView textView3 = cVar.f123812b;
        cVar.f123812b.setText(((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe(textView3, aVar4.field_sessionId, aVar4.f147040Q0, C63347a.C47892c.PRIVATE_CONVERSATION_LIST, textView3.getTextSize()));
        TextView textView4 = cVar.f123813c;
        Class cls = C76979h.class;
        Context context = MMApplicationContext.getContext();
        String str3 = aVar4.field_editingMsg;
        if (str3 == null || C112551y.m153811k(str3)) {
            charSequence = ((C76979h) C86312j.m106911c(cls)).mo107057T1(context, aVar4.field_digest);
            C87412m.m108593f(charSequence, "getService(ISpannableSer…ey(context, field_digest)");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(C0966R.string.k0u));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(C0966R.color.a_3)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append(" ").append(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, aVar4.field_editingMsg));
            charSequence = spannableStringBuilder;
        }
        textView4.setText(charSequence);
        TextView textView5 = cVar.f123814d;
        Context context2 = view.getContext();
        C87412m.m108593f(context2, "itemView.context");
        textView5.setText(String.valueOf(aVar4.field_status == 1 ? context2.getString(C0966R.string.jzf) : C72715f.m85112e(context2, aVar4.field_updateTime, true)));
        cVar.f123815e.setVisibility((aVar4.field_unReadCount <= 0 || aVar4.field_readStatus != 0) ? 8 : 0);
        cVar.f123815e.setText(String.valueOf(aVar4.field_unReadCount));
        cVar.f123815e.setBackgroundResource(C45081s1.m49933b(view.getContext(), aVar4.field_unReadCount));
        cVar.f123815e.setTextSize(0, ((float) C76577a.m92155f(view.getContext(), C0966R.dimen.ary)) * C76577a.m92161l(view.getContext()));
        if (cVar.f123815e.getVisibility() != 0 && aVar4.field_readStatus == 0 && aVar4.field_isRedDot == 1) {
            cVar.f123816f.setVisibility(0);
        } else {
            cVar.f123816f.setVisibility(8);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f360031c90, viewGroup, false);
        int i2 = C0966R.C0970id.a1r;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.a1r);
        if (imageView != null) {
            i2 = C0966R.C0970id.btb;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.btb);
            if (textView != null) {
                i2 = C0966R.C0970id.f357849c24;
                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f357849c24);
                if (textView2 != null) {
                    i2 = C0966R.C0970id.kkm;
                    TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkm);
                    if (textView3 != null) {
                        i2 = C0966R.C0970id.km8;
                        TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km8);
                        if (textView4 != null) {
                            i2 = C0966R.C0970id.km9;
                            TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km9);
                            if (textView5 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                C45867c cVar = new C45867c(relativeLayout, imageView, textView, textView2, textView3, textView4, textView5);
                                C87412m.m108593f(relativeLayout, "itemBinding.root");
                                C53170a aVar = new C53170a(relativeLayout, cVar);
                                relativeLayout.setOnClickListener(new C48182b(aVar, this));
                                relativeLayout.setOnLongClickListener(new C48183c(aVar, this));
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
