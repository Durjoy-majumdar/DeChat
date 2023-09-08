package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.card.model.CardInfo;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import hz0.C46139a0;
import hz0.C46153l0;
import hz0.C46155p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import pz0.C22061g;
import qo3.C89779i0;
import te3.C51854wn;
import te3.n44;
import te3.xa4;
import te3.y34;
import wz0.C22943h;
import wz0.C22945n;
import wz0.C53248d;
import wz0.C53260j;

/* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI */
public class CardAcceptCardListUI extends MMActivity implements C11385n, MMActivity.C6739d {

    /* renamed from: M */
    public static final /* synthetic */ int f51685M = 0;

    /* renamed from: A */
    public String f51686A = "";

    /* renamed from: B */
    public String f51687B = "";

    /* renamed from: C */
    public boolean f51688C = false;

    /* renamed from: D */
    public int f51689D = 0;

    /* renamed from: E */
    public String f51690E = "";

    /* renamed from: F */
    public String f51691F = "";

    /* renamed from: G */
    public ArrayList<String> f51692G = new ArrayList<>();

    /* renamed from: H */
    public ArrayList<String> f51693H = new ArrayList<>();

    /* renamed from: I */
    public LinkedList<C51854wn> f51694I = new LinkedList<>();

    /* renamed from: J */
    public LinkedList<String> f51695J = new LinkedList<>();

    /* renamed from: K */
    public HashMap<String, Integer> f51696K = new HashMap<>();

    /* renamed from: L */
    public String f51697L = "";

    /* renamed from: d */
    public View f51698d;

    /* renamed from: e */
    public View f51699e;

    /* renamed from: f */
    public View f51700f;

    /* renamed from: g */
    public ListView f51701g = null;

    /* renamed from: h */
    public C18593a f51702h = null;

    /* renamed from: i */
    public C89779i0 f51703i = null;

    /* renamed from: j */
    public View f51704j;

    /* renamed from: n */
    public Button f51705n;

    /* renamed from: o */
    public View f51706o;

    /* renamed from: p */
    public TextView f51707p;

    /* renamed from: q */
    public Button f51708q;

    /* renamed from: r */
    public LinkedList<C51854wn> f51709r = new LinkedList<>();

    /* renamed from: s */
    public String f51710s = "";

    /* renamed from: t */
    public int f51711t;

    /* renamed from: u */
    public String f51712u;

    /* renamed from: v */
    public int f51713v;

    /* renamed from: w */
    public String f51714w;

    /* renamed from: x */
    public int f51715x = 8;

    /* renamed from: y */
    public int f51716y = 7;

    /* renamed from: z */
    public String f51717z = "";

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$a */
    public class C18554a implements MenuItem.OnMenuItemClickListener {
        public C18554a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105926v("MicroMsg.CardAcceptCardListUI", "setBackBtn cancel");
            CardAcceptCardListUI cardAcceptCardListUI = CardAcceptCardListUI.this;
            int i = CardAcceptCardListUI.f51685M;
            cardAcceptCardListUI.mo23329I7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$c */
    public class C18555c implements View.OnClickListener {
        public C18555c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CardAcceptCardListUI cardAcceptCardListUI = CardAcceptCardListUI.this;
            if (cardAcceptCardListUI.f51688C) {
                LinkedList H7 = CardAcceptCardListUI.m19311H7(cardAcceptCardListUI);
                cardAcceptCardListUI.mo23332L7(true);
                LinkedList linkedList = new LinkedList();
                for (int i = 0; i < H7.size(); i++) {
                    C51854wn wnVar = (C51854wn) H7.get(i);
                    y34 y34 = new y34();
                    y34.f64816e = wnVar.f144151d;
                    y34.f64817f = wnVar.f144152e;
                    y34.f64819h = cardAcceptCardListUI.f51717z;
                    y34.f64818g = cardAcceptCardListUI.f51686A;
                    y34.f64820i = cardAcceptCardListUI.f51716y;
                    linkedList.add(y34);
                }
                n44 o = C22945n.m27015o(cardAcceptCardListUI.f51689D, cardAcceptCardListUI.f51692G, cardAcceptCardListUI.f51693H);
                xa4 xa4 = new xa4();
                xa4.f144572d = cardAcceptCardListUI.f51697L;
                C86709a0.m107529k().f251779b.mo123460f(new C22061g(0, linkedList, "", cardAcceptCardListUI.f51687B, o, cardAcceptCardListUI.f51715x, xa4));
            } else {
                LinkedList H72 = CardAcceptCardListUI.m19311H7(cardAcceptCardListUI);
                cardAcceptCardListUI.mo23332L7(true);
                C86709a0.m107529k().f251779b.mo123460f(new C46155p(H72, cardAcceptCardListUI.f51715x, cardAcceptCardListUI.f51717z, cardAcceptCardListUI.f51686A, cardAcceptCardListUI.f51716y));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$d */
    public class C18556d implements View.OnClickListener {
        public C18556d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CardAcceptCardListUI cardAcceptCardListUI = CardAcceptCardListUI.this;
            int i = CardAcceptCardListUI.f51685M;
            cardAcceptCardListUI.getClass();
            Log.m105924i("MicroMsg.CardAcceptCardListUI", "doSelectShareUser");
            C115669n.INSTANCE.mo160131h(11582, "OpenShareUserSelectView", 0, "", "", "", "");
            Intent intent = new Intent();
            intent.putExtra("KLabel_range_index", cardAcceptCardListUI.f51689D);
            intent.putExtra("Klabel_name_list", cardAcceptCardListUI.f51690E);
            intent.putExtra("Kother_user_name_list", cardAcceptCardListUI.f51691F);
            intent.putExtra("k_sns_label_ui_title", cardAcceptCardListUI.getString(C0966R.string.b15));
            intent.putExtra("k_sns_label_ui_style", 0);
            intent.putExtra("KLabel_is_filter_private", true);
            C88144b.m109795m(cardAcceptCardListUI, "sns", ".ui.SnsLabelUI", intent, 2);
            cardAcceptCardListUI.mmSetOnActivityResultCallback(cardAcceptCardListUI);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$e */
    public class C18557e implements DialogInterface.OnClickListener {
        public C18557e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CardAcceptCardListUI cardAcceptCardListUI = CardAcceptCardListUI.this;
            int i2 = CardAcceptCardListUI.f51685M;
            cardAcceptCardListUI.mo23329I7(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$f */
    public class C18558f implements DialogInterface.OnClickListener {
        public C18558f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CardAcceptCardListUI cardAcceptCardListUI = CardAcceptCardListUI.this;
            int i2 = CardAcceptCardListUI.f51685M;
            cardAcceptCardListUI.mo23329I7(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardAcceptCardListUI$b */
    public class C18559b implements AdapterView.OnItemClickListener {
        public C18559b(CardAcceptCardListUI cardAcceptCardListUI) {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: H7 */
    public static LinkedList m19311H7(CardAcceptCardListUI cardAcceptCardListUI) {
        cardAcceptCardListUI.getClass();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < cardAcceptCardListUI.f51709r.size(); i++) {
            linkedList.add(cardAcceptCardListUI.f51709r.get(i));
        }
        return linkedList;
    }

    /* renamed from: I7 */
    public final void mo23329I7(int i) {
        Log.m105924i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + i);
        Intent intent = new Intent();
        intent.putExtra("card_list", this.f51710s);
        intent.putExtra("result_code", i);
        setResult(0, intent);
        finish();
    }

    /* renamed from: J7 */
    public final String mo23330J7() {
        if (TextUtils.isEmpty(this.f51690E) || TextUtils.isEmpty(this.f51691F)) {
            return !TextUtils.isEmpty(this.f51690E) ? this.f51690E : !TextUtils.isEmpty(this.f51691F) ? C22945n.m27010j(this.f51691F) : "";
        }
        return this.f51690E + "," + C22945n.m27010j(this.f51691F);
    }

    /* renamed from: K7 */
    public final void mo23331K7() {
        if (!TextUtils.isEmpty(this.f51714w)) {
            this.f51707p.setText(this.f51714w);
        } else {
            this.f51707p.setText(C0966R.string.f360231b12);
        }
    }

    /* renamed from: L7 */
    public void mo23332L7(boolean z) {
        if (z) {
            this.f51703i = C89779i0.m112248e(this, getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f51703i;
        if (i0Var != null && i0Var.isShowing()) {
            this.f51703i.dismiss();
            this.f51703i = null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6685lq;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.avp);
        setBackBtn(new C18554a());
        this.f51698d = findViewById(C0966R.C0970id.arp);
        this.f51699e = findViewById(C0966R.C0970id.krl);
        this.f51700f = findViewById(C0966R.C0970id.fp_);
        View view = this.f51699e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f51701g = (ListView) findViewById(16908298);
        this.f51701g.setEmptyView((RelativeLayout) findViewById(C0966R.C0970id.bs9));
        C18593a aVar2 = new C18593a(this);
        this.f51702h = aVar2;
        this.f51701g.setAdapter(aVar2);
        this.f51701g.setOnItemClickListener(new C18559b(this));
        this.f51704j = findViewById(C0966R.C0970id.art);
        Button button = (Button) findViewById(C0966R.C0970id.ark);
        this.f51705n = button;
        button.setOnClickListener(new C18555c());
        this.f51705n.setEnabled(false);
        this.f51706o = findViewById(C0966R.C0970id.awn);
        this.f51707p = (TextView) findViewById(C0966R.C0970id.awo);
        Button button2 = (Button) findViewById(C0966R.C0970id.awm);
        this.f51708q = button2;
        button2.setOnClickListener(new C18556d());
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
            mo23329I7(2);
            return;
        }
        Log.m105924i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
        String stringExtra = intent.getStringExtra("key_in_card_list");
        this.f51715x = intent.getIntExtra("key_from_scene", 8);
        String stringExtra2 = intent.getStringExtra("key_package_name");
        String stringExtra3 = intent.getStringExtra("key_sign");
        this.f51716y = getIntent().getIntExtra("key_stastic_scene", 7);
        this.f51717z = getIntent().getStringExtra("src_username");
        this.f51686A = getIntent().getStringExtra("js_url");
        this.f51687B = getIntent().getStringExtra("key_consumed_card_id");
        this.f51697L = getIntent().getStringExtra("key_template_id");
        ArrayList<C51854wn> a = C53260j.m59691a(stringExtra, this.f51715x);
        if (a == null || a.size() == 0) {
            Log.m105920e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
            mo23329I7(2);
            return;
        }
        this.f51709r.clear();
        this.f51709r.addAll(a);
        this.f51694I.clear();
        this.f51695J.clear();
        this.f51696K.clear();
        LinkedList<C51854wn> linkedList = this.f51709r;
        mo23332L7(true);
        C86709a0.m107529k().f251779b.mo123460f(new C46139a0(linkedList, this.f51715x, stringExtra2, stringExtra3, this.f51717z, this.f51686A, this.f51687B, this.f51716y));
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.f51689D = intExtra;
            Log.m105925i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", Integer.valueOf(intExtra));
            if (this.f51689D >= 2) {
                this.f51690E = intent.getStringExtra("Klabel_name_list");
                this.f51691F = intent.getStringExtra("Kother_user_name_list");
                Log.m105919d("MicroMsg.CardAcceptCardListUI", "mPrivateSelect : %d, names : %s", Integer.valueOf(this.f51689D), this.f51690E);
                if (!TextUtils.isEmpty(this.f51690E) || !TextUtils.isEmpty(this.f51691F)) {
                    List asList = Arrays.asList(this.f51690E.split(","));
                    this.f51693H = C22945n.m27008h(asList);
                    this.f51692G = C22945n.m27009i(asList);
                    String str = this.f51691F;
                    if (str != null && str.length() > 0) {
                        this.f51692G.addAll(Arrays.asList(this.f51691F.split(",")));
                    }
                    if (this.f51693H != null) {
                        Log.m105924i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.f51693H.size());
                    }
                    if (this.f51692G != null) {
                        Log.m105924i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.f51692G.size());
                        Iterator<String> it = this.f51692G.iterator();
                        while (it.hasNext()) {
                            Log.m105919d("MicroMsg.CardAcceptCardListUI", "username : %s", it.next());
                        }
                    }
                    if (!TextUtils.isEmpty(this.f51690E)) {
                        int i3 = this.f51689D;
                        if (i3 == 2) {
                            this.f51707p.setText(getString(C0966R.string.f360233b14, new Object[]{mo23330J7()}));
                        } else if (i3 == 3) {
                            this.f51707p.setText(getString(C0966R.string.f360232b13, new Object[]{mo23330J7()}));
                        }
                    } else {
                        mo23331K7();
                    }
                } else {
                    Log.m105920e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
                    mo23331K7();
                }
            } else {
                mo23331K7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107529k().f251779b.mo123455a(1079, this);
        C86709a0.m107529k().f251779b.mo123455a(1049, this);
        C86709a0.m107529k().f251779b.mo123455a(C82613z.CTRL_INDEX, this);
        initView();
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(1079, this);
        C86709a0.m107529k().f251779b.mo123470p(1049, this);
        C86709a0.m107529k().f251779b.mo123470p(C82613z.CTRL_INDEX, this);
        this.f51709r.clear();
        C18593a aVar = this.f51702h;
        ((ArrayList) aVar.f51906d).clear();
        aVar.f51908f = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105924i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
            mo23329I7(1);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        if (i3 == 0 && i4 == 0) {
            ArrayList arrayList = null;
            if (yVar2 instanceof C46139a0) {
                mo23332L7(false);
                C46139a0 a0Var = (C46139a0) yVar2;
                String str3 = a0Var.f124332f;
                this.f51711t = a0Var.f124333g;
                this.f51712u = a0Var.f124334h;
                this.f51713v = a0Var.f124335i;
                this.f51714w = a0Var.f124336j;
                Log.m105924i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.f51711t + "  accept_button_wording: " + this.f51712u);
                Log.m105924i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.f51713v + "  private_wording: " + this.f51714w);
                ArrayList<CardInfo> c = C22943h.m26966c(str3);
                if (c == null || c.size() == 0) {
                    Log.m105920e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
                } else {
                    this.f51694I.clear();
                    this.f51695J.clear();
                    this.f51696K.clear();
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < c.size(); i5++) {
                        CardInfo cardInfo = c.get(i5);
                        if (this.f51695J.contains(cardInfo.field_card_tp_id)) {
                            this.f51696K.put(cardInfo.field_card_tp_id, Integer.valueOf(this.f51696K.get(cardInfo.field_card_tp_id).intValue() + 1));
                        } else {
                            arrayList.add(cardInfo);
                            this.f51696K.put(cardInfo.field_card_tp_id, 1);
                            this.f51695J.add(cardInfo.field_card_tp_id);
                        }
                    }
                }
                if (c == null || c.size() <= 0) {
                    Log.m105920e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
                } else {
                    Log.m105924i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + c.size());
                    if (arrayList != null && arrayList.size() > 0) {
                        C18593a aVar = this.f51702h;
                        HashMap<String, Integer> hashMap = this.f51696K;
                        ((ArrayList) aVar.f51906d).clear();
                        ((ArrayList) aVar.f51906d).addAll(arrayList);
                        aVar.f51907e.putAll(hashMap);
                    }
                    this.f51702h.notifyDataSetChanged();
                    if (c.get(0).mo23272T0()) {
                        this.f51688C = true;
                    }
                }
                View view = this.f51699e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f51702h.getCount() > 0) {
                    CardInfo cardInfo2 = (CardInfo) ((ArrayList) this.f51702h.f51906d).get(0);
                    setActionbarColor(C22945n.m27004d(cardInfo2.mo23264L0().f64145p));
                    this.f51698d.setBackgroundColor(C22945n.m27004d(cardInfo2.mo23264L0().f64145p));
                    View view3 = this.f51704j;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0966R.dimen.f4232x0);
                    if (this.f51711t == 1) {
                        this.f51705n.setEnabled(true);
                        ShapeDrawable n = C22945n.m27014n(this, C22945n.m27004d(cardInfo2.mo23264L0().f64145p), dimensionPixelOffset);
                        int[] iArr = {16842919};
                        stateListDrawable.addState(iArr, C22945n.m27014n(this, C22945n.m27005e(cardInfo2.mo23264L0().f64145p, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO), dimensionPixelOffset));
                        stateListDrawable.addState(new int[0], n);
                    } else {
                        this.f51705n.setEnabled(false);
                        stateListDrawable.addState(new int[0], C22945n.m27014n(this, C22945n.m27005e(cardInfo2.mo23264L0().f64145p, WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO), dimensionPixelOffset));
                    }
                    this.f51705n.setBackgroundDrawable(stateListDrawable);
                    if (!TextUtils.isEmpty(this.f51712u)) {
                        this.f51705n.setText(this.f51712u);
                    }
                    if (this.f51713v == 1) {
                        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C0966R.dimen.f3926j6);
                        ShapeDrawable l = C22945n.m27012l(this, getResources().getColor(C0966R.color.al6), dimensionPixelOffset2);
                        ShapeDrawable n2 = C22945n.m27014n(this, getResources().getColor(C0966R.color.al6), dimensionPixelOffset2);
                        StateListDrawable stateListDrawable2 = new StateListDrawable();
                        stateListDrawable2.addState(new int[]{16842919}, n2);
                        stateListDrawable2.addState(new int[0], l);
                        this.f51708q.setBackgroundDrawable(stateListDrawable2);
                        int[] iArr2 = {C22945n.m27004d(cardInfo2.mo23264L0().f64145p), getResources().getColor(C0966R.color.al6)};
                        this.f51708q.setTextColor(new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[0]}, iArr2));
                        View view5 = this.f51706o;
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (!TextUtils.isEmpty(this.f51714w)) {
                            this.f51707p.setText(this.f51714w);
                        } else {
                            this.f51707p.setText(C0966R.string.f360231b12);
                        }
                    } else {
                        View view7 = this.f51706o;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(8);
                        C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f51699e.getLayoutParams();
                        layoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
                        layoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3899i_);
                        this.f51699e.setLayoutParams(layoutParams);
                        this.f51699e.invalidate();
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f51704j.getLayoutParams();
                        layoutParams2.addRule(8, C0966R.C0970id.fp_);
                        this.f51704j.setLayoutParams(layoutParams2);
                        this.f51704j.invalidate();
                    }
                } else {
                    View view8 = this.f51704j;
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(8);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view10 = this.f51706o;
                    C9556a aVar7 = new C9556a();
                    aVar7.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar7.mo10232b(), "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/card/ui/CardAcceptCardListUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f51698d.setBackgroundColor(getResources().getColor(C0966R.color.f3199ip));
                }
            } else if (yVar2 instanceof C46155p) {
                mo23332L7(false);
                C46155p pVar = (C46155p) yVar2;
                if (pVar.f124422g != 0) {
                    String str4 = pVar.f124423h;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = getString(C0966R.string.aw4);
                    }
                    C76879j.m92713G(this, str4, (String) null, false, new C18557e());
                    this.f51710s = pVar.f124421f;
                    return;
                }
                C76879j.m92726T(this, getResources().getString(C0966R.string.f360219ay0));
                Intent intent = new Intent();
                intent.putExtra("card_list", pVar.f124421f);
                setResult(-1, intent);
                Log.m105924i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
                C22945n.m26997J();
                finish();
            } else if (yVar2 instanceof C22061g) {
                mo23332L7(false);
                C22061g gVar = (C22061g) yVar2;
                String str5 = gVar.f62438f;
                int i6 = gVar.f62439g;
                String str6 = gVar.f62440h;
                this.f51710s = str5;
                if (i6 != 0) {
                    if (TextUtils.isEmpty(str6)) {
                        str6 = getString(C0966R.string.b1c);
                    }
                    C76879j.m92713G(this, str6, (String) null, false, new C18558f());
                    return;
                }
                C76879j.m92726T(this, getResources().getString(C0966R.string.avv));
                Intent intent2 = new Intent();
                intent2.putExtra("card_list", this.f51710s);
                setResult(-1, intent2);
                Log.m105924i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
                C22945n.m26998K();
                ShareCardInfo shareCardInfo = new ShareCardInfo();
                C22943h.m26980q(shareCardInfo, str5);
                C22945n.m26992E(shareCardInfo);
                C46153l0.Kx0().mo60218c();
                finish();
            }
        } else {
            Log.m105920e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + yVar.getType() + "errType = " + i3 + " errCode = " + i4);
            mo23332L7(false);
            C53248d.m59684d(this, str2, i4);
            if (yVar2 instanceof C46155p) {
                this.f51710s = str2;
            } else if (yVar2 instanceof C22061g) {
                this.f51710s = "";
            }
        }
    }
}
