package com.tencent.p014mm.plugin.card.base;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.p031ui.C40859c;
import com.tencent.p014mm.plugin.card.p031ui.C40861d;
import com.tencent.p014mm.plugin.card.p031ui.C40868m0;
import com.tencent.p014mm.plugin.card.p031ui.C40887x;
import com.tencent.p014mm.plugin.card.p031ui.C40888y;
import com.tencent.p014mm.plugin.card.p031ui.CardDetailUI;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.ShareCardListUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import dz0.C20483c;
import dz0.C45496a;
import dz0.C45497b;
import f40.C86709a0;
import gz0.C45998p;
import hl0.C87552j;
import hz0.C46142c0;
import hz0.C46145e0;
import hz0.C46153l0;
import hz0.C46154m;
import hz0.C46156r;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import p680ru.C101464l;
import pz0.C47717b;
import qo3.C89779i0;
import qz0.C12936f;
import qz0.C47905b;
import qz0.C47906c;
import qz0.C47909g;
import te3.C22500hn;
import wd3.C15148g1;
import wd3.C65953v0;
import wz0.C53246b;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI */
public abstract class CardBaseUI extends MMActivity implements C11385n, MMActivity.C6739d {

    /* renamed from: v */
    public static final /* synthetic */ int f109698v = 0;

    /* renamed from: d */
    public ListView f109699d = null;

    /* renamed from: e */
    public BaseAdapter f109700e = null;

    /* renamed from: f */
    public RelativeLayout f109701f = null;

    /* renamed from: g */
    public C89779i0 f109702g = null;

    /* renamed from: h */
    public LinearLayout f109703h;

    /* renamed from: i */
    public LinearLayout f109704i;

    /* renamed from: j */
    public boolean f109705j = false;

    /* renamed from: n */
    public boolean f109706n = true;

    /* renamed from: o */
    public C45497b f109707o = null;

    /* renamed from: p */
    public CardInfo f109708p;

    /* renamed from: q */
    public C92411b f109709q;

    /* renamed from: r */
    public float f109710r = -85.0f;

    /* renamed from: s */
    public float f109711s = -1000.0f;

    /* renamed from: t */
    public boolean f109712t = false;

    /* renamed from: u */
    public C92411b.C92412a f109713u = new C40826f();

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$a */
    public class C40821a implements MenuItem.OnMenuItemClickListener {
        public C40821a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardBaseUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$b */
    public class C40822b implements AdapterView.OnItemClickListener {
        public C40822b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/base/CardBaseUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i == 0) {
                Log.m105924i("MicroMsg.CardBaseUI", "onItemClick pos is 0, onListHeaderItemClick()");
                CardBaseUI.this.mo63754P7();
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/base/CardBaseUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (i > 0) {
                i--;
            }
            if (i >= CardBaseUI.this.f109700e.getCount()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/base/CardBaseUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            CardBaseUI.this.mo63755Q7(CardBaseUI.this.f109707o.getItem(i), i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/base/CardBaseUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$c */
    public class C40823c implements AdapterView.OnItemLongClickListener {
        public C40823c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i == 0) {
                Log.m105924i("MicroMsg.CardBaseUI", "onItemLongClick pos is 0");
                return true;
            }
            if (i > 0) {
                i--;
            }
            if (i >= CardBaseUI.this.f109700e.getCount()) {
                return true;
            }
            CardBaseUI.this.mo63756R7(CardBaseUI.this.f109707o.getItem(i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$d */
    public class C40824d implements C76879j.C11180n {

        /* renamed from: a */
        public final /* synthetic */ C20483c f109717a;

        /* renamed from: b */
        public final /* synthetic */ String f109718b;

        public C40824d(C20483c cVar, String str) {
            this.f109717a = cVar;
            this.f109718b = str;
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (this.f109717a.mo23294v()) {
                if (i == 0) {
                    CardBaseUI.this.mo63752N7((CardInfo) this.f109717a);
                } else if (i == 1) {
                    CardBaseUI cardBaseUI = CardBaseUI.this;
                    String str = this.f109718b;
                    int i2 = CardBaseUI.f109698v;
                    cardBaseUI.getClass();
                    C53248d.m59682b(cardBaseUI, str, "", new C45496a(cardBaseUI, str));
                }
            } else if (i == 0) {
                CardBaseUI cardBaseUI2 = CardBaseUI.this;
                String str2 = this.f109718b;
                int i3 = CardBaseUI.f109698v;
                cardBaseUI2.getClass();
                C53248d.m59682b(cardBaseUI2, str2, "", new C45496a(cardBaseUI2, str2));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$e */
    public class C40825e implements C65953v0 {

        /* renamed from: a */
        public final /* synthetic */ String f109720a;

        /* renamed from: b */
        public final /* synthetic */ boolean f109721b;

        public C40825e(String str, boolean z) {
            this.f109720a = str;
            this.f109721b = z;
        }

        /* renamed from: a */
        public void mo23a(boolean z, String str, int i) {
            if (z) {
                CardBaseUI cardBaseUI = CardBaseUI.this;
                String str2 = this.f109720a;
                int i2 = CardBaseUI.f109698v;
                cardBaseUI.mo63761W7(true);
                C86709a0.m107529k().f251779b.mo123460f(new C46145e0(cardBaseUI.f109708p.field_card_id, str2, 17));
                CardBaseUI cardBaseUI2 = CardBaseUI.this;
                C76879j.m92726T(cardBaseUI2, cardBaseUI2.getResources().getString(C0966R.string.f360220ay1));
                if (this.f109721b) {
                    CardBaseUI.this.finish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$f */
    public class C40826f implements C92411b.C92412a {
        public C40826f() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (!z) {
                CardBaseUI.this.mo63757S7();
                return true;
            }
            if (!(f2 == -85.0f || f == -1000.0f)) {
                CardBaseUI cardBaseUI = CardBaseUI.this;
                cardBaseUI.f109710r = f2;
                cardBaseUI.f109711s = f;
                C45998p Jx0 = C46153l0.Jx0();
                CardBaseUI cardBaseUI2 = CardBaseUI.this;
                float f3 = cardBaseUI2.f109710r;
                float f4 = cardBaseUI2.f109711s;
                Jx0.f124035d = f3;
                Jx0.f124036e = f4;
                Jx0.f124037f = System.currentTimeMillis() / 1000;
                CardBaseUI.this.mo63758T7();
            }
            CardBaseUI cardBaseUI3 = CardBaseUI.this;
            if (cardBaseUI3.f109712t) {
                return false;
            }
            cardBaseUI3.f109712t = true;
            ((C101464l) C86312j.m106911c(C101464l.class)).mo140963f9(2010, f, f2, (int) d2);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.base.CardBaseUI$g */
    public class C40827g implements DialogInterface.OnClickListener {
        public C40827g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(CardBaseUI.this.getContext());
        }
    }

    /* renamed from: H7 */
    public BaseAdapter mo63746H7() {
        return new C40859c(this, mo63747I7());
    }

    /* renamed from: I7 */
    public C46154m mo63747I7() {
        return C46154m.NORMAL_TYPE;
    }

    /* renamed from: J7 */
    public abstract void mo63748J7();

    /* renamed from: K7 */
    public boolean mo63749K7() {
        return true;
    }

    /* renamed from: L7 */
    public boolean mo63750L7() {
        return !(this instanceof ShareCardListUI);
    }

    /* renamed from: M7 */
    public void mo63751M7() {
    }

    /* renamed from: N7 */
    public void mo63752N7(CardInfo cardInfo) {
        this.f109708p = cardInfo;
        C53246b.m59669a(this, 0, this);
    }

    /* renamed from: O7 */
    public void mo63753O7(C20483c cVar, int i) {
        Intent intent = new Intent(this, CardDetailUI.class);
        intent.putExtra("key_card_id", cVar.getCardId());
        intent.addFlags(131072);
        intent.putExtra("key_from_scene", 3);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/card/base/CardBaseUI", "onGotoCardDetailUI", "(Lcom/tencent/mm/plugin/card/base/ICardInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (mo63747I7() == C46154m.HOME_MEMBER_CARD_TYPE) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11324, "ClickMemberCard", 0, "", "", 0, 0, "", 0, 0);
            nVar.mo160131h(15767, Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_HOME_PAGE_CARD_NUM_INT_SYNC, 3)).intValue()), Integer.valueOf(i + 1));
        } else if (mo63747I7() == C46154m.MEMBER_CARD_TYPE) {
            C115669n.INSTANCE.mo160131h(11324, "ClickMemberCard", 0, "", "", 0, 1, "", 0, 0);
        }
    }

    /* renamed from: P7 */
    public void mo63754P7() {
    }

    /* renamed from: Q7 */
    public void mo63755Q7(C20483c cVar, int i) {
        if (!mo63749K7()) {
            Log.m105920e("MicroMsg.CardBaseUI", "isItemClickable return false");
        } else if (cVar == null) {
            Log.m105920e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
        } else if (!cVar.getCardId().equals("PRIVATE_TICKET_TITLE") && !cVar.getCardId().equals("PRIVATE_INVOICE_TITLE")) {
            if (cVar.mo23266N0()) {
                mo63753O7(cVar, i);
            } else if (!TextUtils.isEmpty(cVar.mo23264L0().f64103A)) {
                C53246b.m59678j(this, cVar.mo23264L0().f64103A, 0);
            }
        }
    }

    /* renamed from: R7 */
    public void mo63756R7(C20483c cVar) {
        if (!mo63750L7()) {
            Log.m105920e("MicroMsg.CardBaseUI", "isItemClickable return false");
        } else if (cVar == null) {
            Log.m105920e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
        } else {
            ArrayList arrayList = new ArrayList();
            if (cVar.mo23294v()) {
                if (!Util.isNullOrNil(cVar.mo23264L0().f64127U0)) {
                    arrayList.add(cVar.mo23264L0().f64127U0);
                } else if (cVar.mo23285h2()) {
                    arrayList.add(getResources().getString(C0966R.string.azw));
                } else {
                    arrayList.add(getResources().getString(C0966R.string.azv));
                }
            }
            arrayList.add(getResources().getString(C0966R.string.f7944x1));
            String cardId = cVar.getCardId();
            C76879j.m92736g(this, cVar.mo23264L0().f64156y, (String[]) arrayList.toArray(new String[arrayList.size()]), (String) null, new C40824d(cVar, cardId));
        }
    }

    /* renamed from: S7 */
    public void mo63757S7() {
    }

    /* renamed from: T7 */
    public void mo63758T7() {
    }

    /* renamed from: U7 */
    public void mo63759U7() {
    }

    /* renamed from: V7 */
    public void mo63760V7() {
        C92411b bVar = this.f109709q;
        if (bVar != null) {
            bVar.mo126408b(this.f109713u);
        }
    }

    /* renamed from: W7 */
    public void mo63761W7(boolean z) {
        if (z) {
            this.f109702g = C89779i0.m112248e(this, getString(C0966R.string.a4d), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f109702g;
        if (i0Var != null && i0Var.isShowing()) {
            this.f109702g.dismiss();
            this.f109702g = null;
        }
    }

    /* renamed from: X7 */
    public void mo63762X7(String str, int i, boolean z) {
        CardInfo cardInfo = this.f109708p;
        if (cardInfo == null) {
            Log.m105920e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
        } else if (cardInfo.mo23264L0() == null) {
            Log.m105920e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
        } else {
            StringBuilder sb = new StringBuilder();
            if (i == 0) {
                if (TextUtils.isEmpty(this.f109708p.mo23293u0().f133848d) || this.f109708p.mo23285h2()) {
                    sb.append(getString(C0966R.string.jgc));
                } else {
                    sb.append(this.f109708p.mo23293u0().f133848d);
                }
                C115669n nVar = C115669n.INSTANCE;
                CardInfo cardInfo2 = this.f109708p;
                nVar.mo160131h(11582, "OperGift", 2, Integer.valueOf(this.f109708p.mo23264L0().f64141i), cardInfo2.field_card_tp_id, cardInfo2.field_card_id, str);
            } else if (i == 1) {
                sb.append(getString(C0966R.string.axf, new Object[]{this.f109708p.mo23264L0().f64156y}));
                C115669n nVar2 = C115669n.INSTANCE;
                CardInfo cardInfo3 = this.f109708p;
                nVar2.mo160131h(11582, "OperGift", 3, Integer.valueOf(this.f109708p.mo23264L0().f64141i), cardInfo3.field_card_tp_id, cardInfo3.field_card_id, str);
            }
            C15148g1.C15149a.f41275a.Sk0(getController(), sb.toString(), this.f109708p.mo23264L0().f64137e, this.f109708p.mo23264L0().f64143n + "\n" + this.f109708p.mo23264L0().f64142j, (String) null, false, getResources().getString(C0966R.string.a2s), new C40825e(str, z));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6743nb;
    }

    public void initView() {
        setBackBtn(new C40821a());
        this.f109699d = (ListView) findViewById(16908298);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.bs9);
        this.f109701f = relativeLayout;
        if (relativeLayout != null) {
            this.f109699d.setEmptyView(relativeLayout);
        }
        this.f109703h = (LinearLayout) View.inflate(getBaseContext(), C0966R.C0971layout.f6752nk, (ViewGroup) null);
        this.f109704i = (LinearLayout) View.inflate(getBaseContext(), C0966R.C0971layout.f6749nh, (ViewGroup) null);
        this.f109699d.addHeaderView(this.f109703h);
        this.f109699d.addFooterView(this.f109704i);
        BaseAdapter H7 = mo63746H7();
        this.f109700e = H7;
        boolean z = H7 instanceof C40868m0;
        this.f109699d.setAdapter(H7);
        this.f109699d.setOnItemClickListener(new C40822b());
        this.f109699d.setOnItemLongClickListener(new C40823c());
        C86709a0.m107529k().f251779b.mo123455a(C87552j.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123455a(1046, this);
        BaseAdapter baseAdapter = this.f109700e;
        C45497b dVar = baseAdapter instanceof C40859c ? new C40861d((C40859c) baseAdapter) : baseAdapter instanceof C47905b ? new C47906c((C47905b) baseAdapter) : baseAdapter instanceof C12936f ? new C47909g((C12936f) baseAdapter) : new C40888y((C40887x) baseAdapter);
        this.f109707o = dVar;
        dVar.onCreate();
        mo63748J7();
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            mo63762X7(intent.getStringExtra("Select_Conv_User"), 0, false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.CardBaseUI", "destroy card");
        C86709a0.m107529k().f251779b.mo123470p(C87552j.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(1046, this);
        C45497b bVar = this.f109707o;
        if (bVar != null) {
            bVar.onDestroy();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        this.f109706n = false;
        C86709a0.m107529k().f251779b.mo123470p(1045, this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.CardBaseUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.CardBaseUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 69) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.bj_), false, new C40827g(), (DialogInterface.OnClickListener) null);
                return;
            }
            mo63759U7();
        }
    }

    public void onResume() {
        super.onResume();
        this.f109706n = true;
        C86709a0.m107529k().f251779b.mo123455a(1045, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            mo63761W7(false);
            if (yVar instanceof C46145e0) {
                C46145e0 e0Var = (C46145e0) yVar;
                int i3 = e0Var.f124359h;
                String str2 = e0Var.f124358g;
                if (i3 == 10000) {
                    if (TextUtils.isEmpty(str2)) {
                        str2 = getString(C0966R.string.axg);
                    }
                    str = str2;
                }
            }
            if (!(yVar instanceof C46142c0) && !(yVar instanceof C47717b) && this.f109706n) {
                C53248d.m59684d(this, str, i2);
            }
        } else if (yVar instanceof C46156r) {
            mo63761W7(false);
            C76879j.m92726T(this, getResources().getString(C0966R.string.aws));
            C46153l0.vx0().mo58722a(4);
            this.f109707o.onNotify();
            mo63751M7();
        } else if (yVar instanceof C46145e0) {
            mo63761W7(false);
            C46145e0 e0Var2 = (C46145e0) yVar;
            int i4 = e0Var2.f124359h;
            String str3 = e0Var2.f124358g;
            if (i4 == 10000) {
                if (TextUtils.isEmpty(str3)) {
                    str3 = getString(C0966R.string.axg);
                }
                C53248d.m59684d(this, str3, i4);
                return;
            }
            CardInfo cardInfo = this.f109708p;
            if (cardInfo != null) {
                C22500hn J0 = cardInfo.mo23263J0();
                J0.f63942d = 3;
                this.f109708p.mo23273U0(J0);
                if (!C46153l0.Gx0().update(this.f109708p, new String[0])) {
                    Log.m105921e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", this.f109708p.field_card_id);
                }
            }
            this.f109707o.onNotify();
            mo63751M7();
        }
    }
}
