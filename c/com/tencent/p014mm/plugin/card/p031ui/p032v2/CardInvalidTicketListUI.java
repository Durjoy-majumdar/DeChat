package com.tencent.p014mm.plugin.card.p031ui.p032v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.C0132m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kz0.C46825o;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;
import sz0.C13802f;
import sz0.C13803g;
import sz0.C13806j;
import sz0.C48513k;
import sz0.C48514l;
import te3.C48955c42;
import te3.C50655oa3;
import te3.C51081ra3;
import uo3.C78253a;
import wz0.C102526o;
import wz0.C22945n;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardInvalidTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "<init>", "()V", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI */
public final class CardInvalidTicketListUI extends CardNewBaseUI {

    /* renamed from: v */
    public static final /* synthetic */ int f109914v = 0;

    /* renamed from: i */
    public LoadMoreRecyclerView f109915i;

    /* renamed from: j */
    public C48513k f109916j;

    /* renamed from: n */
    public ArrayList<C48514l> f109917n = new ArrayList<>();

    /* renamed from: o */
    public int f109918o;

    /* renamed from: p */
    public int f109919p = 10;

    /* renamed from: q */
    public boolean f109920q;

    /* renamed from: r */
    public boolean f109921r;

    /* renamed from: s */
    public boolean f109922s;

    /* renamed from: t */
    public boolean f109923t = true;

    /* renamed from: u */
    public C89779i0 f109924u;

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI$a */
    public static final class C40873a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ CardInvalidTicketListUI f109925a;

        public C40873a(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f109925a = cardInvalidTicketListUI;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105925i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f109925a;
            cardInvalidTicketListUI.f109921r = false;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                T t = cVar.f256796d;
                C48955c42 c422 = (C48955c42) t;
                Log.m105925i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", Integer.valueOf(c422.f131497d));
                if (c422.f131497d == 0) {
                    cardInvalidTicketListUI.f109918o = c422.f131499f;
                    cardInvalidTicketListUI.f109920q = c422.f131500g == 1;
                    boolean z = c422.f131502i == 1;
                    cardInvalidTicketListUI.f109922s = z;
                    Log.m105925i("MicroMsg.CardInvalidTicketListUI", "update clear btn: %s", Boolean.valueOf(z));
                    if (cardInvalidTicketListUI.f109922s) {
                        cardInvalidTicketListUI.addTextOptionMenu(0, cardInvalidTicketListUI.getString(C0966R.string.aw9), new C13806j(cardInvalidTicketListUI));
                        if (cardInvalidTicketListUI.f109917n.isEmpty()) {
                            cardInvalidTicketListUI.enableOptionMenu(0, false);
                        } else {
                            cardInvalidTicketListUI.enableOptionMenu(0, true);
                        }
                    } else {
                        cardInvalidTicketListUI.removeOptionMenu(0);
                    }
                    if (cardInvalidTicketListUI.f109920q) {
                        cardInvalidTicketListUI.mo63844N7().mo63430I(false);
                    } else {
                        cardInvalidTicketListUI.mo63844N7().mo63430I(true);
                    }
                    if (cardInvalidTicketListUI.f109923t) {
                        cardInvalidTicketListUI.f109917n.clear();
                        cardInvalidTicketListUI.f109923t = false;
                    }
                    cardInvalidTicketListUI.mo63846P7(c422.f131501h);
                    return t;
                }
                if (cardInvalidTicketListUI.f109923t) {
                    cardInvalidTicketListUI.f109923t = false;
                }
                C22945n.m27018r(cardInvalidTicketListUI, c422.f131498e);
                return t;
            }
            if (cardInvalidTicketListUI.f109923t) {
                cardInvalidTicketListUI.f109923t = false;
            }
            C22945n.m27017q(cardInvalidTicketListUI, "");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI$b */
    public static final class C40874b implements LoadMoreRecyclerView.C40579c {

        /* renamed from: a */
        public final /* synthetic */ CardInvalidTicketListUI f109926a;

        public C40874b(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f109926a = cardInvalidTicketListUI;
        }

        /* renamed from: a */
        public final void mo23454a(LoadMoreRecyclerView loadMoreRecyclerView, RecyclerView.C16613e eVar) {
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f109926a;
            int i = CardInvalidTicketListUI.f109914v;
            cardInvalidTicketListUI.mo63842L7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI$c */
    public static final class C40875c implements MRecyclerView.C40583d {

        /* renamed from: a */
        public final /* synthetic */ CardInvalidTicketListUI f109927a;

        public C40875c(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f109927a = cardInvalidTicketListUI;
        }

        /* renamed from: a */
        public final void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
            C50655oa3 oa32;
            Log.m105924i("MicroMsg.CardInvalidTicketListUI", "click item");
            C48514l F4 = this.f109927a.mo63843M7().mo73143F4(i);
            if (F4 != null) {
                CardInvalidTicketListUI cardInvalidTicketListUI = this.f109927a;
                if (F4.f129755a == 2 && (oa32 = F4.f129758d) != null) {
                    String str = oa32.f139060d;
                    C87412m.m108593f(str, "user_card_id");
                    cardInvalidTicketListUI.getClass();
                    Log.m105925i("MicroMsg.CardTicketListUI", "go to card detail: %s", str);
                    Intent intent = new Intent(cardInvalidTicketListUI.getContext(), CardDetailUI.class);
                    intent.putExtra("key_card_id", str);
                    intent.addFlags(131072);
                    intent.putExtra("key_from_scene", 3);
                    cardInvalidTicketListUI.getContext().startActivityForResult(intent, 256);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI$d */
    public static final class C40876d implements MRecyclerView.C40584e {

        /* renamed from: a */
        public final /* synthetic */ CardInvalidTicketListUI f109928a;

        public C40876d(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f109928a = cardInvalidTicketListUI;
        }

        /* renamed from: a */
        public final boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
            Log.m105924i("MicroMsg.CardInvalidTicketListUI", "long click item");
            C48514l F4 = this.f109928a.mo63843M7().mo73143F4(i);
            if (F4 == null) {
                return false;
            }
            CardInvalidTicketListUI cardInvalidTicketListUI = this.f109928a;
            if (F4.f129755a != 2) {
                return false;
            }
            C50655oa3 oa32 = F4.f129758d;
            C87412m.m108593f(view, "view");
            if (oa32 != null) {
                C78253a aVar = new C78253a(cardInvalidTicketListUI.getContext(), view);
                aVar.f229249r = new C13802f(cardInvalidTicketListUI);
                aVar.f229251t = new C13803g(cardInvalidTicketListUI, oa32);
                Point a = C102526o.m135341a(view);
                aVar.mo71743n(a.x, a.y);
                return false;
            }
            cardInvalidTicketListUI.getClass();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI$e */
    public static final class C40877e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardInvalidTicketListUI f109929d;

        public C40877e(CardInvalidTicketListUI cardInvalidTicketListUI) {
            this.f109929d = cardInvalidTicketListUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f109929d.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public void mo23418H7(int i, boolean z) {
        Log.m105925i("MicroMsg.CardInvalidTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", Float.valueOf(this.f52073d), Float.valueOf(this.f52074e), Integer.valueOf(i), Boolean.valueOf(z));
        if (this.f109923t) {
            mo63842L7();
        } else if (!z) {
            mo23460K7();
        }
    }

    /* renamed from: L7 */
    public final void mo63842L7() {
        Log.m105925i("MicroMsg.CardInvalidTicketListUI", "do get invalid ticket: %s, %s, %s, %s", Integer.valueOf(this.f109918o), Integer.valueOf(this.f109919p), Boolean.valueOf(this.f109920q), Boolean.valueOf(this.f109921r));
        if (!this.f109920q && !this.f109921r) {
            this.f109921r = true;
            new C46825o(this.f109918o, this.f109919p, (double) this.f52073d, (double) this.f52074e).mo9225i().mo123062e(new C40873a(this));
        }
    }

    /* renamed from: M7 */
    public final C48513k mo63843M7() {
        C48513k kVar = this.f109916j;
        if (kVar != null) {
            return kVar;
        }
        C87412m.m108603p("mTicketAdapter");
        throw null;
    }

    /* renamed from: N7 */
    public final LoadMoreRecyclerView mo63844N7() {
        LoadMoreRecyclerView loadMoreRecyclerView = this.f109915i;
        if (loadMoreRecyclerView != null) {
            return loadMoreRecyclerView;
        }
        C87412m.m108603p("mTicketRv");
        throw null;
    }

    /* renamed from: O7 */
    public final void mo63845O7(Boolean bool) {
        if (bool != null) {
            C89779i0 i0Var = null;
            if (bool.booleanValue()) {
                i0Var = C89779i0.m112248e(getContext(), getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
            } else {
                C89779i0 i0Var2 = this.f109924u;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                }
            }
            this.f109924u = i0Var;
        }
    }

    /* renamed from: P7 */
    public final void mo63846P7(C51081ra3 ra32) {
        if (ra32 != null) {
            LinkedList<C50655oa3> linkedList = ra32.f140795d;
            C87412m.m108593f(linkedList, "page_ticket_element");
            if (!linkedList.isEmpty()) {
                Iterator<C50655oa3> it = ra32.f140795d.iterator();
                while (it.hasNext()) {
                    C48514l lVar = new C48514l();
                    lVar.f129758d = it.next();
                    lVar.f129755a = 2;
                    this.f109917n.add(lVar);
                }
            }
        }
        C48513k M7 = mo63843M7();
        ArrayList<C48514l> arrayList = this.f109917n;
        M7.f129750f = null;
        M7.f129748d = arrayList;
        M7.f129749e = null;
        M7.f129753i = null;
        M7.notifyDataSetChanged();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6789ok;
    }

    public void initView() {
        View findViewById = findViewById(C0966R.C0970id.bxk);
        C87412m.m108593f(findViewById, "findViewById(R.id.ctlu_rv)");
        this.f109915i = (LoadMoreRecyclerView) findViewById;
        this.f109916j = new C48513k(true);
        mo63843M7().setHasStableIds(true);
        mo63844N7().setAdapter(mo63843M7());
        mo63844N7().setLayoutManager(new LinearLayoutManager(getContext()));
        mo63844N7().setEmptyView(findViewById(C0966R.C0970id.bbh));
        ((TextView) mo63844N7().getEmptyView().findViewById(C0966R.C0970id.bbi)).setText(getString(C0966R.string.ayg));
        WeImageView weImageView = (WeImageView) mo63844N7().getEmptyView().findViewById(C0966R.C0970id.bbg);
        weImageView.setImageResource(C0966R.raw.icon_history_card_empty);
        weImageView.setIconColor(getResources().getColor(C0966R.color.FG_2));
        C0132m mVar = new C0132m(this, 1);
        mVar.mo128j(getResources().getDrawable(C0966R.C0969drawable.f4698kc));
        mo63844N7().mo17085h0(mVar);
        mo63844N7().setLoadingView((int) C0966R.C0971layout.f6728mx);
        mo63844N7().setOnLoadingStateChangedListener(new C40874b(this));
        mo63844N7().setOnItemClickListener(new C40875c(this));
        mo63844N7().setOnItemLongClickListener(new C40876d(this));
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        hideActionbarLine();
        initView();
        C51081ra3 ra32 = new C51081ra3();
        Log.m105918d("MicroMsg.CardSnapshotMgr", "load invalid ticket page snapshot");
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, (Object) null);
        if (str != null) {
            byte[] bytes = str.getBytes(C119027c.f356489b);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            ra32.parseFrom(bytes);
        }
        mo63846P7(ra32);
        setMMTitle((int) C0966R.string.k2h);
        setBackBtn(new C40877e(this));
        C115669n.INSTANCE.mo160131h(16322, 9);
    }

    public void onDestroy() {
        super.onDestroy();
        C51081ra3 ra32 = new C51081ra3();
        ra32.f140795d = new LinkedList<>();
        Iterator<C48514l> it = this.f109917n.iterator();
        while (it.hasNext()) {
            C50655oa3 oa32 = it.next().f129758d;
            if (oa32 != null) {
                ra32.f140795d.add(oa32);
            }
        }
        Log.m105918d("MicroMsg.CardSnapshotMgr", "save invalid ticket snapshot");
        byte[] byteArray = ra32.toByteArray();
        C87412m.m108593f(byteArray, "invalidTicketList.toByteArray()");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_INVALID_TICKET_STRING_SYNC, new String(byteArray, C119027c.f356489b));
    }
}
