package com.tencent.p014mm.plugin.card.p031ui.p032v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di0.C86299o;
import di0.C86300q;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kr0.C76630x0;
import kz0.C46818j;
import kz0.C46826p;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;
import sz0.C13809m;
import sz0.C13810n;
import sz0.C13813q;
import sz0.C48513k;
import sz0.C48514l;
import te3.C49232e42;
import te3.C50655oa3;
import te3.C50739ov2;
import te3.C50805pa3;
import te3.C50936qa3;
import te3.C51081ra3;
import te3.C51217sa3;
import te3.C51488u30;
import te3.C51997xn;
import uo3.C78253a;
import wz0.C102526o;
import wz0.C22945n;
import wz0.C53246b;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "a", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI */
public final class CardTicketListUI extends CardNewBaseUI {

    /* renamed from: A */
    public static final /* synthetic */ int f109930A = 0;

    /* renamed from: i */
    public LoadMoreRecyclerView f109931i;

    /* renamed from: j */
    public C48513k f109932j;

    /* renamed from: n */
    public int f109933n;

    /* renamed from: o */
    public int f109934o = 10;

    /* renamed from: p */
    public boolean f109935p;

    /* renamed from: q */
    public boolean f109936q;

    /* renamed from: r */
    public boolean f109937r = true;

    /* renamed from: s */
    public final ArrayList<C48514l> f109938s = new ArrayList<>();

    /* renamed from: t */
    public final ArrayList<C48514l> f109939t = new ArrayList<>();

    /* renamed from: u */
    public final ArrayList<C48514l> f109940u = new ArrayList<>();

    /* renamed from: v */
    public C48514l f109941v;

    /* renamed from: w */
    public boolean f109942w;

    /* renamed from: x */
    public C89779i0 f109943x;

    /* renamed from: y */
    public final C40884h f109944y = new C40884h(this);

    /* renamed from: z */
    public C46826p f109945z;

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$a */
    public static final class C2163a extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$a$a */
        public static final class C2164a extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2164a f12141d = new C2164a();

            public C2164a() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, "view");
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.f357718be3)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.f357715be0)).getText());
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$a$b */
        public static final class C2165b extends C87413o implements C32226l<View, String> {

            /* renamed from: d */
            public static final C2165b f12142d = new C2165b();

            public C2165b() {
                super(1);
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                C87412m.m108594g(view, "view");
                ViewGroup viewGroup = (ViewGroup) view.findViewById(C0966R.C0970id.bxi);
                StringBuilder sb = new StringBuilder();
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bxj)).getText());
                sb.append(((TextView) view.findViewById(C0966R.C0970id.bxg)).getText());
                C87412m.m108593f(viewGroup, "labelLayout");
                MapExpandKt.visitChild(viewGroup, new C2166a(sb));
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "sb.toString()");
                return sb4;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2163a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.f6747nf).view(C0966R.C0970id.f357717be2).desc((C32226l<? super View, String>) C2164a.f12141d);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0971layout.f6787oi).view(C0966R.C0970id.bcc).desc((C32226l<? super View, String>) C2165b.f12142d).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$b */
    public static final class C40878b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109946a;

        /* renamed from: b */
        public final /* synthetic */ String f109947b;

        public C40878b(CardTicketListUI cardTicketListUI, String str) {
            this.f109946a = cardTicketListUI;
            this.f109947b = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                CardTicketListUI cardTicketListUI = this.f109946a;
                String str = this.f109947b;
                C51488u30 u302 = (C51488u30) t;
                Log.m105925i("MicroMsg.CardTicketListUI", "retCode: %s", Integer.valueOf(u302.f142574d));
                if (u302.f142574d == 0) {
                    C48513k kVar = cardTicketListUI.f109932j;
                    if (kVar != null) {
                        kVar.mo73145O4(str);
                    } else {
                        C87412m.m108603p("mTicketAdapter");
                        throw null;
                    }
                } else {
                    C22945n.m27018r(cardTicketListUI, u302.f142575e);
                }
            } else {
                C22945n.m27017q(this.f109946a, "");
            }
            CardTicketListUI cardTicketListUI2 = this.f109946a;
            Boolean bool = Boolean.FALSE;
            int i = CardTicketListUI.f109930A;
            cardTicketListUI2.mo63850N7(bool);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$c */
    public static final class C40879c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109948a;

        /* renamed from: b */
        public final /* synthetic */ boolean f109949b;

        public C40879c(CardTicketListUI cardTicketListUI, boolean z) {
            this.f109948a = cardTicketListUI;
            this.f109949b = z;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.CardTicketListUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            CardTicketListUI cardTicketListUI = this.f109948a;
            cardTicketListUI.f109936q = false;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                boolean z = this.f109949b;
                C49232e42 e422 = (C49232e42) t;
                Log.m105925i("MicroMsg.CardTicketListUI", "retCode: %s", Integer.valueOf(e422.f132678d));
                if (e422.f132678d == 0) {
                    cardTicketListUI.f109933n = e422.f132680f;
                    boolean z2 = e422.f132681g == 1;
                    cardTicketListUI.f109935p = z2;
                    if (z2) {
                        LoadMoreRecyclerView loadMoreRecyclerView = cardTicketListUI.f109931i;
                        if (loadMoreRecyclerView != null) {
                            loadMoreRecyclerView.mo63430I(false);
                        } else {
                            C87412m.m108603p("mTicketRv");
                            throw null;
                        }
                    } else {
                        LoadMoreRecyclerView loadMoreRecyclerView2 = cardTicketListUI.f109931i;
                        if (loadMoreRecyclerView2 != null) {
                            loadMoreRecyclerView2.mo63430I(true);
                        } else {
                            C87412m.m108603p("mTicketRv");
                            throw null;
                        }
                    }
                    if (cardTicketListUI.f109937r || z) {
                        cardTicketListUI.f109940u.clear();
                        cardTicketListUI.f109938s.clear();
                        cardTicketListUI.f109939t.clear();
                        cardTicketListUI.f109941v = null;
                        cardTicketListUI.f109937r = false;
                    }
                    Log.m105919d("MicroMsg.CardTicketListUI", "page_under_list: %s", e422.f132685n);
                    cardTicketListUI.mo63851O7(e422.f132682h, e422.f132683i, e422.f132684j, e422.f132685n);
                    return t;
                }
                C22945n.m27018r(cardTicketListUI, e422.f132679e);
                if (!cardTicketListUI.f109937r) {
                    return t;
                }
                cardTicketListUI.f109937r = false;
                return t;
            }
            if (cardTicketListUI.f109937r) {
                cardTicketListUI.f109937r = false;
            }
            C22945n.m27017q(cardTicketListUI, "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$d */
    public static final class C40880d implements LoadMoreRecyclerView.C40579c {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109950a;

        public C40880d(CardTicketListUI cardTicketListUI) {
            this.f109950a = cardTicketListUI;
        }

        /* renamed from: a */
        public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
            CardTicketListUI cardTicketListUI = this.f109950a;
            int i = CardTicketListUI.f109930A;
            cardTicketListUI.mo63849M7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$e */
    public static final class C40881e implements MRecyclerView.C40583d {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109951a;

        public C40881e(CardTicketListUI cardTicketListUI) {
            this.f109951a = cardTicketListUI;
        }

        /* renamed from: a */
        public final void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
            C51997xn xnVar;
            C50739ov2 ov22;
            C51997xn xnVar2;
            Log.m105924i("MicroMsg.CardTicketListUI", "click item");
            C48513k kVar = this.f109951a.f109932j;
            if (kVar != null) {
                C48514l F4 = kVar.mo73143F4(i);
                if (F4 != null) {
                    CardTicketListUI cardTicketListUI = this.f109951a;
                    int i2 = F4.f129755a;
                    if (i2 == 1) {
                        C50805pa3 pa32 = F4.f129757c;
                        if (pa32 != null) {
                            int i3 = pa32.f139674g;
                            if (i3 == 1) {
                                C53246b.m59678j(cardTicketListUI, pa32.f139675h, 0);
                            } else if (i3 == 2 && (xnVar = pa32.f139676i) != null) {
                                C53246b.m59674f(xnVar.f144755d, xnVar.f144756e, xnVar.f144757f);
                            }
                        }
                        C115669n.INSTANCE.mo160131h(16322, 7);
                    } else if (i2 == 2) {
                        C50655oa3 oa32 = F4.f129758d;
                        if (oa32 != null) {
                            String str = oa32.f139060d;
                            C87412m.m108593f(str, "user_card_id");
                            cardTicketListUI.getClass();
                            Log.m105925i("MicroMsg.CardTicketListUI", "go to card detail: %s", str);
                            Intent intent = new Intent(cardTicketListUI.getContext(), CardDetailUI.class);
                            intent.putExtra("key_card_id", str);
                            intent.addFlags(131072);
                            intent.putExtra("key_from_scene", 3);
                            cardTicketListUI.startActivityForResult(intent, 256);
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(16322, 10);
                            Object[] objArr = new Object[4];
                            objArr[0] = Integer.valueOf(oa32.f139064h);
                            String str2 = oa32.f139060d;
                            objArr[1] = str2;
                            C48513k kVar2 = cardTicketListUI.f109932j;
                            if (kVar2 != null) {
                                C87412m.m108593f(str2, "user_card_id");
                                objArr[2] = Integer.valueOf(kVar2.mo73144G4(str2, oa32.f139064h));
                                objArr[3] = 1;
                                nVar.mo160131h(16326, objArr);
                                return;
                            }
                            C87412m.m108603p("mTicketAdapter");
                            throw null;
                        }
                    } else if (i2 == 3 && (ov22 = F4.f129759e) != null) {
                        int i4 = ov22.f139392g;
                        if (i4 == 1) {
                            C53246b.m59678j(cardTicketListUI, ov22.f139393h, 0);
                            cardTicketListUI.f109942w = true;
                        } else if (i4 == 2 && (xnVar2 = ov22.f139394i) != null) {
                            C86299o oVar = new C86299o();
                            oVar.f250929a = xnVar2.f144755d;
                            oVar.f250934f = xnVar2.f144756e;
                            oVar.f250932d = xnVar2.f144757f;
                            oVar.f250939k = 1028;
                            oVar.f250916E = cardTicketListUI.f109944y;
                            C13598b0 b0Var = C13598b0.f38549a;
                            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(cardTicketListUI, oVar);
                        }
                    }
                }
            } else {
                C87412m.m108603p("mTicketAdapter");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$f */
    public static final class C40882f implements MRecyclerView.C40584e {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109952a;

        public C40882f(CardTicketListUI cardTicketListUI) {
            this.f109952a = cardTicketListUI;
        }

        /* renamed from: a */
        public final boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
            Log.m105924i("MicroMsg.CardTicketListUI", "long click item");
            C48513k kVar = this.f109952a.f109932j;
            if (kVar != null) {
                C48514l F4 = kVar.mo73143F4(i);
                if (F4 != null) {
                    C50655oa3 oa32 = F4.f129758d;
                    if (F4.f129755a == 2) {
                        CardTicketListUI cardTicketListUI = this.f109952a;
                        C87412m.m108593f(view, "view");
                        if (oa32 != null) {
                            C78253a aVar = new C78253a(cardTicketListUI.getContext(), view);
                            aVar.f229249r = new C13809m(cardTicketListUI);
                            aVar.f229251t = new C13810n(cardTicketListUI, oa32);
                            Point a = C102526o.m135341a(view);
                            aVar.mo71743n(a.x, a.y);
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[4];
                            objArr[0] = Integer.valueOf(oa32.f139064h);
                            String str = oa32.f139060d;
                            objArr[1] = str;
                            C48513k kVar2 = cardTicketListUI.f109932j;
                            if (kVar2 != null) {
                                C87412m.m108593f(str, "user_card_id");
                                objArr[2] = Integer.valueOf(kVar2.mo73144G4(str, oa32.f139064h));
                                objArr[3] = 2;
                                nVar.mo160131h(16326, objArr);
                            } else {
                                C87412m.m108603p("mTicketAdapter");
                                throw null;
                            }
                        } else {
                            cardTicketListUI.getClass();
                        }
                    }
                }
                return false;
            }
            C87412m.m108603p("mTicketAdapter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$g */
    public static final class C40883g implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardTicketListUI f109953d;

        public C40883g(CardTicketListUI cardTicketListUI) {
            this.f109953d = cardTicketListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f109953d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardTicketListUI$h */
    public static final class C40884h implements C86300q {

        /* renamed from: a */
        public final /* synthetic */ CardTicketListUI f109954a;

        public C40884h(CardTicketListUI cardTicketListUI) {
            this.f109954a = cardTicketListUI;
        }

        /* renamed from: a */
        public void mo63853a() {
            Log.m105924i("MicroMsg.CardTicketListUI", "onAppBrandProcessDied");
            CardTicketListUI cardTicketListUI = this.f109954a;
            int i = CardTicketListUI.f109930A;
            cardTicketListUI.mo63849M7(true);
        }

        /* renamed from: b */
        public void mo63854b(String str) {
            Log.m105924i("MicroMsg.CardTicketListUI", "onTriggerHalfScreenShare");
        }

        /* renamed from: c */
        public void mo63855c() {
            Log.m105924i("MicroMsg.CardTicketListUI", "onAppBrandUIEnter");
        }

        /* renamed from: d */
        public /* synthetic */ void mo63856d() {
        }

        /* renamed from: e */
        public void mo63857e() {
            Log.m105924i("MicroMsg.CardTicketListUI", "onAppBrandPreconditionError");
        }

        /* renamed from: f */
        public void mo63858f(boolean z) {
            Log.m105924i("MicroMsg.CardTicketListUI", "onAppBrandUIExit(isFinish=" + z + ')');
            CardTicketListUI cardTicketListUI = this.f109954a;
            int i = CardTicketListUI.f109930A;
            cardTicketListUI.mo63849M7(true);
        }
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
        Log.m105925i("MicroMsg.CardTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", Float.valueOf(this.f52073d), Float.valueOf(this.f52074e), Integer.valueOf(i), Boolean.valueOf(z));
    }

    /* renamed from: L7 */
    public final void mo63848L7(String str) {
        Log.m105925i("MicroMsg.CardTicketListUI", "do delete ticket: %s", str);
        mo63850N7(Boolean.TRUE);
        new C46818j(str).mo9225i().mo123062e(new C40878b(this, str));
    }

    /* renamed from: M7 */
    public final void mo63849M7(boolean z) {
        Log.m105925i("MicroMsg.CardTicketListUI", "do get ticket: %s, %s, %s, %s", Integer.valueOf(this.f109933n), Integer.valueOf(this.f109934o), Boolean.valueOf(this.f109935p), Boolean.valueOf(this.f109936q));
        if (z || (!this.f109935p && !this.f109936q)) {
            this.f109936q = true;
            int i = this.f109934o;
            if (z) {
                int i2 = this.f109933n;
                if (i2 * 2 >= i) {
                    i = i2 * 2;
                }
                this.f109933n = 0;
            }
            C46826p pVar = new C46826p(this.f109933n, i, (double) this.f52073d, (double) this.f52074e);
            this.f109945z = pVar;
            pVar.mo9225i().mo123062e(new C40879c(this, z));
        }
    }

    /* renamed from: N7 */
    public final void mo63850N7(Boolean bool) {
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(getContext(), getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = this.f109943x;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            this.f109943x = i0Var;
        }
    }

    /* renamed from: O7 */
    public final void mo63851O7(C50936qa3 qa32, C51081ra3 ra32, C51081ra3 ra33, C51217sa3 sa32) {
        C50739ov2 ov22;
        if (qa32 != null) {
            this.f109940u.clear();
            LinkedList<C50805pa3> linkedList = qa32.f140212d;
            C87412m.m108593f(linkedList, "page_ticket_jump_element");
            if (!linkedList.isEmpty()) {
                Iterator<C50805pa3> it = qa32.f140212d.iterator();
                while (it.hasNext()) {
                    C48514l lVar = new C48514l();
                    lVar.f129757c = it.next();
                    lVar.f129755a = 1;
                    this.f109940u.add(lVar);
                }
            }
        }
        if (ra32 != null) {
            LinkedList<C50655oa3> linkedList2 = ra32.f140795d;
            C87412m.m108593f(linkedList2, "page_ticket_element");
            if (!linkedList2.isEmpty()) {
                Iterator<C50655oa3> it4 = ra32.f140795d.iterator();
                while (it4.hasNext()) {
                    C48514l lVar2 = new C48514l();
                    lVar2.f129758d = it4.next();
                    lVar2.f129755a = 2;
                    this.f109938s.add(lVar2);
                }
            }
        }
        if (ra33 != null) {
            LinkedList<C50655oa3> linkedList3 = ra33.f140795d;
            C87412m.m108593f(linkedList3, "page_ticket_element");
            if (!linkedList3.isEmpty()) {
                Iterator<C50655oa3> it5 = ra33.f140795d.iterator();
                while (it5.hasNext()) {
                    C48514l lVar3 = new C48514l();
                    lVar3.f129758d = it5.next();
                    lVar3.f129755a = 2;
                    this.f109939t.add(lVar3);
                }
            }
        }
        if (!(sa32 == null || (ov22 = sa32.f141410d) == null)) {
            C48514l lVar4 = new C48514l();
            this.f109941v = lVar4;
            lVar4.f129755a = 3;
            lVar4.f129759e = ov22;
        }
        if (((!this.f109940u.isEmpty()) || (!this.f109938s.isEmpty())) && ((!this.f109939t.isEmpty()) || this.f109941v != null)) {
            C48513k kVar = this.f109932j;
            if (kVar != null) {
                String string = getString(C0966R.string.b25);
                C87412m.m108593f(string, "getString(R.string.card_ticket_section_title)");
                kVar.mo73147u5(string);
                C48513k kVar2 = this.f109932j;
                if (kVar2 != null) {
                    String string2 = getString(C0966R.string.az6);
                    C87412m.m108593f(string2, "getString(R.string.card_license_section_title)");
                    kVar2.mo73146g5(string2);
                } else {
                    C87412m.m108603p("mTicketAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mTicketAdapter");
                throw null;
            }
        } else {
            C48513k kVar3 = this.f109932j;
            if (kVar3 != null) {
                kVar3.mo73147u5("");
                C48513k kVar4 = this.f109932j;
                if (kVar4 != null) {
                    kVar4.mo73146g5("");
                } else {
                    C87412m.m108603p("mTicketAdapter");
                    throw null;
                }
            } else {
                C87412m.m108603p("mTicketAdapter");
                throw null;
            }
        }
        C48513k kVar5 = this.f109932j;
        if (kVar5 != null) {
            ArrayList<C48514l> arrayList = this.f109940u;
            ArrayList<C48514l> arrayList2 = this.f109938s;
            ArrayList<C48514l> arrayList3 = this.f109939t;
            C48514l lVar5 = this.f109941v;
            kVar5.f129750f = arrayList;
            kVar5.f129748d = arrayList2;
            kVar5.f129749e = arrayList3;
            kVar5.f129753i = lVar5;
            kVar5.notifyDataSetChanged();
            return;
        }
        C87412m.m108603p("mTicketAdapter");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6789ok;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bxk);
        C87412m.m108593f(findViewById, "findViewById(R.id.ctlu_rv)");
        this.f109931i = (LoadMoreRecyclerView) findViewById;
        C48513k kVar = new C48513k(false);
        this.f109932j = kVar;
        kVar.setHasStableIds(true);
        LoadMoreRecyclerView loadMoreRecyclerView = this.f109931i;
        if (loadMoreRecyclerView != null) {
            C48513k kVar2 = this.f109932j;
            if (kVar2 != null) {
                loadMoreRecyclerView.setAdapter(kVar2);
                LoadMoreRecyclerView loadMoreRecyclerView2 = this.f109931i;
                if (loadMoreRecyclerView2 != null) {
                    loadMoreRecyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                    C0132m mVar = new C0132m(this, 1);
                    mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4698kc));
                    LoadMoreRecyclerView loadMoreRecyclerView3 = this.f109931i;
                    if (loadMoreRecyclerView3 != null) {
                        loadMoreRecyclerView3.mo17085h0(mVar);
                        LoadMoreRecyclerView loadMoreRecyclerView4 = this.f109931i;
                        if (loadMoreRecyclerView4 != null) {
                            loadMoreRecyclerView4.setLoadingView((int) C0966R.C0971layout.f6728mx);
                            View findViewById2 = findViewById(C0966R.C0970id.bbh);
                            C87412m.m108593f(findViewById2, "findViewById(R.id.chpe_root_layout)");
                            ViewGroup viewGroup = (ViewGroup) findViewById2;
                            LoadMoreRecyclerView loadMoreRecyclerView5 = this.f109931i;
                            if (loadMoreRecyclerView5 != null) {
                                loadMoreRecyclerView5.setEmptyView(viewGroup);
                                LoadMoreRecyclerView loadMoreRecyclerView6 = this.f109931i;
                                if (loadMoreRecyclerView6 != null) {
                                    loadMoreRecyclerView6.setOnLoadingStateChangedListener(new C40880d(this));
                                    LoadMoreRecyclerView loadMoreRecyclerView7 = this.f109931i;
                                    if (loadMoreRecyclerView7 != null) {
                                        loadMoreRecyclerView7.setOnItemClickListener(new C40881e(this));
                                        LoadMoreRecyclerView loadMoreRecyclerView8 = this.f109931i;
                                        if (loadMoreRecyclerView8 != null) {
                                            loadMoreRecyclerView8.setOnItemLongClickListener(new C40882f(this));
                                        } else {
                                            C87412m.m108603p("mTicketRv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("mTicketRv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mTicketRv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mTicketRv");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mTicketRv");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mTicketRv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mTicketRv");
                    throw null;
                }
            } else {
                C87412m.m108603p("mTicketAdapter");
                throw null;
            }
        } else {
            C87412m.m108603p("mTicketRv");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 256 && i2 == -1) {
            String str = null;
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("key_finish_action", -1)) : null;
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
                if (intent != null) {
                    str = intent.getStringExtra("key_card_id");
                }
                C87412m.m108591d(str);
                mo63848L7(str);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        if (this.f109937r) {
            Log.m105924i("MicroMsg.CardTicketListUI", "firstLoad doGetTicketHomePage");
            mo63849M7(false);
        }
        mo23460K7();
        C50936qa3 qa32 = new C50936qa3();
        C51081ra3 ra32 = new C51081ra3();
        C51081ra3 ra33 = new C51081ra3();
        C51217sa3 sa32 = new C51217sa3();
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load ticket page snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_JUMP_LIST_STRING_SYNC, (Object) null);
        if (str != null) {
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            qa32.parseFrom(bytes);
        }
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_TICKET_LIST_STRING_SYNC, (Object) null);
        if (str2 != null) {
            byte[] bytes2 = str2.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes2, "this as java.lang.String).getBytes(charset)");
            ra32.parseFrom(bytes2);
        }
        String str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, (Object) null);
        if (str3 != null) {
            byte[] bytes3 = str3.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes3, "this as java.lang.String).getBytes(charset)");
            ra33.parseFrom(bytes3);
        }
        String str4 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, (Object) null);
        if (str4 != null) {
            byte[] bytes4 = str4.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes4, "this as java.lang.String).getBytes(charset)");
            sa32.parseFrom(bytes4);
        }
        mo63851O7(qa32, ra32, ra33, sa32);
        setMMTitle((int) C0966R.string.k2i);
        setBackBtn(new C40883g(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C13813q(this));
        C115669n.INSTANCE.mo160131h(16322, 6);
    }

    public void onDestroy() {
        super.onDestroy();
        C46826p pVar = this.f109945z;
        if (pVar != null) {
            pVar.mo85581g();
        }
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this.f109944y);
        Log.m105924i("MicroMsg.CardTicketListUI", "do save snapshot");
        C50936qa3 qa32 = new C50936qa3();
        qa32.f140212d = new LinkedList<>();
        Iterator<C48514l> it = this.f109940u.iterator();
        while (it.hasNext()) {
            C50805pa3 pa32 = it.next().f129757c;
            if (pa32 != null) {
                qa32.f140212d.add(pa32);
            }
        }
        C51081ra3 ra32 = new C51081ra3();
        ra32.f140795d = new LinkedList<>();
        Iterator<C48514l> it4 = this.f109938s.iterator();
        while (it4.hasNext()) {
            C50655oa3 oa32 = it4.next().f129758d;
            if (oa32 != null) {
                ra32.f140795d.add(oa32);
            }
        }
        C51081ra3 ra33 = new C51081ra3();
        ra33.f140795d = new LinkedList<>();
        Iterator<C48514l> it5 = this.f109939t.iterator();
        while (it5.hasNext()) {
            C50655oa3 oa33 = it5.next().f129758d;
            if (oa33 != null) {
                ra33.f140795d.add(oa33);
            }
        }
        C51217sa3 sa32 = new C51217sa3();
        C48514l lVar = this.f109941v;
        if (lVar != null) {
            sa32.f141410d = lVar.f129759e;
        }
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save ticket page snapshot");
        byte[] byteArray = qa32.toByteArray();
        C87412m.m108593f(byteArray, "jumpList.toByteArray()");
        Charset charset = C119027c.f356489b;
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_JUMP_LIST_STRING_SYNC, new String(byteArray, charset));
        byte[] byteArray2 = ra32.toByteArray();
        C87412m.m108593f(byteArray2, "ticketList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_TICKET_LIST_STRING_SYNC, new String(byteArray2, charset));
        byte[] byteArray3 = ra33.toByteArray();
        C87412m.m108593f(byteArray3, "licenseList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_LICENSE_LIST_STRING_SYNC, new String(byteArray3, charset));
        byte[] byteArray4 = sa32.toByteArray();
        C87412m.m108593f(byteArray4, "underList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_UNDER_TICKET_LIST_STRING_SYNC, new String(byteArray4, charset));
    }

    public void onResume() {
        if (this.f109942w) {
            mo63849M7(true);
            this.f109942w = false;
        }
        super.onResume();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C2163a.class);
    }
}
