package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.game.p061ui.message.C42355l;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import di3.C86312j;
import dz1.C45499b;
import gy3.C87412m;
import hz1.C46161a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import jz1.C46595b;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import mq3.C47093a;
import p192l4.C10461a;
import p192l4.C10462b;
import sw1.C48478n;
import sw1.C48484q;
import ux1.C52635a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "<init>", "()V", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment */
public final class GameMsgNoticeFragment extends AbsGameRoomFragment {

    /* renamed from: q */
    public static final /* synthetic */ int f114241q = 0;

    /* renamed from: d */
    public final String f114242d = "InteractiveMsg";

    /* renamed from: e */
    public C52635a f114243e;

    /* renamed from: f */
    public boolean f114244f = true;

    /* renamed from: g */
    public WxRefreshLayout f114245g;

    /* renamed from: h */
    public InteractiveMsgMRecycleView f114246h;

    /* renamed from: i */
    public C46595b.C46596a f114247i;

    /* renamed from: j */
    public int f114248j;

    /* renamed from: n */
    public int f114249n;

    /* renamed from: o */
    public int f114250o = 15;

    /* renamed from: p */
    public int f114251p = 15;

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment$a */
    public static final class C42257a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f114252d;

        /* renamed from: e */
        public final /* synthetic */ GameMsgNoticeFragment f114253e;

        public C42257a(View view, GameMsgNoticeFragment gameMsgNoticeFragment) {
            this.f114252d = view;
            this.f114253e = gameMsgNoticeFragment;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("game_msg_center_tab_type", 2);
            Integer num = null;
            C88144b.m109791i(this.f114252d.getContext(), "game", ".ui.message.GameMsgCenterUI", intent, (Bundle) null);
            Object tag = view.getTag();
            if (tag != null) {
                num = Integer.valueOf(tag instanceof Integer ? ((Number) tag).intValue() : 0);
            }
            C40314g.m43484c(MMApplicationContext.getContext(), 21, 2101, 2, 6, (int) C46161a.f124440a, this.f114253e.mo66305K(num));
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment$onBindHeaderViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment$b */
    public static final class C42258b extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ GameMsgNoticeFragment f114254a;

        public C42258b(GameMsgNoticeFragment gameMsgNoticeFragment) {
            this.f114254a = gameMsgNoticeFragment;
        }

        /* renamed from: b */
        public void mo2556b() {
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f114254a.f114246h;
            if (interactiveMsgMRecycleView != null) {
                RecyclerView.C16613e<?> adapter = interactiveMsgMRecycleView.getAdapter();
                C87412m.m108591d(adapter);
                if (adapter.getItemCount() <= 1) {
                    C52635a aVar = this.f114254a.f114243e;
                    C87412m.m108591d(aVar);
                    aVar.f146967b.setVisibility(0);
                    return;
                }
                C52635a aVar2 = this.f114254a.f114243e;
                C87412m.m108591d(aVar2);
                aVar2.f146967b.setVisibility(8);
                return;
            }
            C87412m.m108603p("gameInteractiveMsgView");
            throw null;
        }
    }

    /* renamed from: K */
    public final String mo66305K(Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        HashMap hashMap = new HashMap();
        if (intValue > 0) {
            hashMap.put("RedDot", "1");
        } else {
            hashMap.put("RedDot", "2");
        }
        hashMap.put("TotalNum", String.valueOf(intValue));
        String b = C40314g.m43483b(hashMap);
        C87412m.m108593f(b, "genExtInfo(map)");
        return b;
    }

    /* renamed from: L */
    public final void mo66306L(C46595b.C46596a aVar) {
        C46595b.C46596a aVar2 = aVar;
        Class cls = C48478n.class;
        C87412m.m108594g(aVar2, "holder");
        View view = aVar2.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C10461a aVar3 = aVar2.f173501C;
        C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        C45499b bVar = (C45499b) aVar3;
        View view2 = aVar2.f44854d;
        view2.setOnClickListener(new C42257a(view2, this));
        bVar.f123148b.setImageResource(C0966R.raw.game_notify_bell);
        view.setBackgroundResource(C0966R.C0969drawable.f4855pa);
        bVar.f123149c.setText(C0966R.string.fad);
        bVar.f123150d.setVisibility(0);
        bVar.f123154h.setVisibility(8);
        bVar.f123155i.setVisibility(8);
        bVar.f123156j.setVisibility(8);
        bVar.f123153g.setVisibility(0);
        View view3 = bVar.f123151e;
        C9556a aVar4 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar4.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = bVar.f123152f;
        C9556a aVar5 = new C9556a();
        aVar5.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int Fm0 = ((C48478n) C86312j.m106911c(cls)).Fm0(2);
        aVar2.f44854d.setTag(Integer.valueOf(Fm0));
        if (Fm0 > 0) {
            bVar.f123156j.setVisibility(0);
        }
        bVar.f123150d.setText(((C48478n) C86312j.m106911c(cls)).mo65677Jw(2));
        if (this.f114244f) {
            this.f114244f = false;
            C40314g.m43484c(MMApplicationContext.getContext(), 21, 2101, 2, 1, (int) C46161a.f124440a, mo66305K(Integer.valueOf(Fm0)));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f114249n = bundle.getInt("fromScene", 0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C87412m.m108594g(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0966R.C0971layout.d4v, viewGroup2, false);
        int i = C0966R.C0970id.nt5;
        LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.nt5);
        if (linearLayout != null) {
            i = C0966R.C0970id.nvx;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(inflate, C0966R.C0970id.nvx);
            if (frameLayout != null) {
                InteractiveMsgMRecycleView interactiveMsgMRecycleView = (InteractiveMsgMRecycleView) C10462b.m10395a(inflate, C0966R.C0970id.nvy);
                if (interactiveMsgMRecycleView != null) {
                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                    ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f3e);
                    if (imageView != null) {
                        WxRefreshLayout wxRefreshLayout = (WxRefreshLayout) C10462b.m10395a(inflate, C0966R.C0970id.g2u);
                        if (wxRefreshLayout != null) {
                            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.g2y);
                            if (textView != null) {
                                this.f114243e = new C52635a(linearLayout2, linearLayout, frameLayout, interactiveMsgMRecycleView, linearLayout2, imageView, wxRefreshLayout, textView);
                                C45499b a = C45499b.m50457a(layoutInflater2, viewGroup2, false);
                                LinearLayout linearLayout3 = a.f123147a;
                                C87412m.m108593f(linearLayout3, "itemBinding.root");
                                this.f114247i = new C46595b.C46596a(linearLayout3, a);
                                this.f114248j = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66010mL(1);
                                C46595b.C46596a aVar = this.f114247i;
                                if (aVar != null) {
                                    mo66306L(aVar);
                                    C52635a aVar2 = this.f114243e;
                                    C87412m.m108591d(aVar2);
                                    View findViewById = aVar2.f146966a.findViewById(C0966R.C0970id.nvy);
                                    C87412m.m108593f(findViewById, "binding.root.findViewByI…ame_interactive_msg_view)");
                                    InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = (InteractiveMsgMRecycleView) findViewById;
                                    this.f114246h = interactiveMsgMRecycleView2;
                                    interactiveMsgMRecycleView2.addHeaderView(linearLayout3);
                                    InteractiveMsgMRecycleView interactiveMsgMRecycleView3 = this.f114246h;
                                    if (interactiveMsgMRecycleView3 != null) {
                                        interactiveMsgMRecycleView3.setmContext(getContext());
                                        InteractiveMsgMRecycleView interactiveMsgMRecycleView4 = this.f114246h;
                                        if (interactiveMsgMRecycleView4 != null) {
                                            interactiveMsgMRecycleView4.setmFromScene(this.f114249n);
                                            InteractiveMsgMRecycleView interactiveMsgMRecycleView5 = this.f114246h;
                                            if (interactiveMsgMRecycleView5 != null) {
                                                RecyclerView.C16613e<?> adapter = interactiveMsgMRecycleView5.getAdapter();
                                                C87412m.m108591d(adapter);
                                                if (adapter.getItemCount() <= 1) {
                                                    C52635a aVar3 = this.f114243e;
                                                    C87412m.m108591d(aVar3);
                                                    aVar3.f146967b.setVisibility(0);
                                                }
                                                InteractiveMsgMRecycleView interactiveMsgMRecycleView6 = this.f114246h;
                                                if (interactiveMsgMRecycleView6 != null) {
                                                    RecyclerView.C16613e<?> adapter2 = interactiveMsgMRecycleView6.getAdapter();
                                                    C87412m.m108591d(adapter2);
                                                    adapter2.registerAdapterDataObserver(new C42258b(this));
                                                    if (C85875k4.m106211z()) {
                                                        C52635a aVar4 = this.f114243e;
                                                        C87412m.m108591d(aVar4);
                                                        ((ImageView) aVar4.f146967b.findViewById(C0966R.C0970id.f3e)).setImageResource(C0966R.C0969drawable.co_);
                                                    } else {
                                                        C52635a aVar5 = this.f114243e;
                                                        C87412m.m108591d(aVar5);
                                                        ((ImageView) aVar5.f146967b.findViewById(C0966R.C0970id.f3e)).setImageResource(C0966R.raw.game_interactive_empty);
                                                    }
                                                    C52635a aVar6 = this.f114243e;
                                                    C87412m.m108591d(aVar6);
                                                    View findViewById2 = aVar6.f146966a.findViewById(C0966R.C0970id.g2u);
                                                    C87412m.m108593f(findViewById2, "binding.root.findViewById(R.id.load_more_layout)");
                                                    WxRefreshLayout wxRefreshLayout2 = (WxRefreshLayout) findViewById2;
                                                    this.f114245g = wxRefreshLayout2;
                                                    C47093a aVar7 = new C47093a();
                                                    aVar7.f126539a = 0.5f;
                                                    aVar7.f126540b = 300;
                                                    aVar7.f126541c = true;
                                                    aVar7.f126543e = true;
                                                    aVar7.f126544f = true;
                                                    aVar7.f126545g = true;
                                                    aVar7.f126546h = false;
                                                    aVar7.f126547i = false;
                                                    aVar7.f126548j = true;
                                                    aVar7.f126549k = true;
                                                    aVar7.f126550l = true;
                                                    aVar7.f126551m = false;
                                                    aVar7.f126552n = false;
                                                    aVar7.f126553o = true;
                                                    aVar7.f126554p = false;
                                                    aVar7.f126555q = false;
                                                    wxRefreshLayout2.setCommonConfig(aVar7);
                                                    WxRefreshLayout wxRefreshLayout3 = this.f114245g;
                                                    if (wxRefreshLayout3 != null) {
                                                        wxRefreshLayout3.setOnSimpleAction(new C42295g(this));
                                                        C52635a aVar8 = this.f114243e;
                                                        C87412m.m108591d(aVar8);
                                                        LinearLayout linearLayout4 = aVar8.f146966a;
                                                        C87412m.m108593f(linearLayout4, "binding.root");
                                                        return linearLayout4;
                                                    }
                                                    C87412m.m108603p("refreshLayout");
                                                    throw null;
                                                }
                                                C87412m.m108603p("gameInteractiveMsgView");
                                                throw null;
                                            }
                                            C87412m.m108603p("gameInteractiveMsgView");
                                            throw null;
                                        }
                                        C87412m.m108603p("gameInteractiveMsgView");
                                        throw null;
                                    }
                                    C87412m.m108603p("gameInteractiveMsgView");
                                    throw null;
                                }
                                C87412m.m108603p("headerHolder");
                                throw null;
                            }
                            i = C0966R.C0970id.g2y;
                        } else {
                            i = C0966R.C0970id.g2u;
                        }
                    } else {
                        i = C0966R.C0970id.f3e;
                    }
                } else {
                    i = C0966R.C0970id.nvy;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public void onResume() {
        super.onResume();
        HashMap hashMap = new HashMap();
        hashMap.put("tab", "1");
        hashMap.put("newmsg", String.valueOf(this.f114248j));
        C40314g.m43484c(getContext(), 13, 1300, 0, 1, this.f114249n, C40314g.m43483b(hashMap));
        this.f114248j = 0;
        C46595b.C46596a aVar = this.f114247i;
        if (aVar != null) {
            mo66306L(aVar);
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f114246h;
            if (interactiveMsgMRecycleView != null) {
                ((C119157j) C119157j.f356862d).mo183875f(new C42355l(interactiveMsgMRecycleView));
                return;
            }
            C87412m.m108603p("gameInteractiveMsgView");
            throw null;
        }
        C87412m.m108603p("headerHolder");
        throw null;
    }
}
