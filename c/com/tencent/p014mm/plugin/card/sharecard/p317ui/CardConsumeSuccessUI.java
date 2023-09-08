package com.tencent.p014mm.plugin.card.sharecard.p317ui;

import a70.C112760b;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ConsumedCouponCardCodeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import gc0.C20828a;
import hc0.C20937c;
import hz0.C46153l0;
import hz0.C76251l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jl0.C9464d;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;
import pz0.C22061g;
import pz0.C22062i;
import pz0.C22063p;
import pz0.C47718d;
import qo3.C89779i0;
import qz0.C22179a;
import te3.C22506ko;
import te3.n44;
import te3.xa4;
import te3.y34;
import wz0.C22943h;
import wz0.C22945n;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI */
public class CardConsumeSuccessUI extends MMActivity implements C11385n {

    /* renamed from: F */
    public static final /* synthetic */ int f51637F = 0;

    /* renamed from: A */
    public ArrayList<String> f51638A = new ArrayList<>();

    /* renamed from: B */
    public long f51639B = 0;

    /* renamed from: C */
    public MMHandler f51640C = new MMHandler(Looper.getMainLooper());

    /* renamed from: D */
    public C89779i0 f51641D = null;

    /* renamed from: E */
    public View.OnClickListener f51642E = new C18548b();

    /* renamed from: d */
    public View f51643d;

    /* renamed from: e */
    public TextView f51644e;

    /* renamed from: f */
    public TextView f51645f;

    /* renamed from: g */
    public TextView f51646g;

    /* renamed from: h */
    public TextView f51647h;

    /* renamed from: i */
    public TextView f51648i;

    /* renamed from: j */
    public ImageView f51649j;

    /* renamed from: n */
    public Button f51650n;

    /* renamed from: o */
    public CheckBox f51651o;

    /* renamed from: p */
    public C22062i f51652p;

    /* renamed from: q */
    public String f51653q = "";

    /* renamed from: r */
    public String f51654r = "";

    /* renamed from: s */
    public String f51655s = "";

    /* renamed from: t */
    public String f51656t = "";

    /* renamed from: u */
    public int f51657u = 0;

    /* renamed from: v */
    public int f51658v = 0;

    /* renamed from: w */
    public int f51659w = 0;

    /* renamed from: x */
    public String f51660x = "";

    /* renamed from: y */
    public String f51661y = "";

    /* renamed from: z */
    public ArrayList<String> f51662z = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI$a */
    public class C18547a implements MenuItem.OnMenuItemClickListener {
        public C18547a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardConsumeSuccessUI.this.finish();
            CardConsumeSuccessUI cardConsumeSuccessUI = CardConsumeSuccessUI.this;
            int i = CardConsumeSuccessUI.f51637F;
            cardConsumeSuccessUI.mo23316J7(0);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI$b */
    public class C18548b implements View.OnClickListener {
        public C18548b() {
        }

        public void onClick(View view) {
            ArrayList<C22063p> arrayList;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(view);
            Object[] array = arrayList2.toArray();
            arrayList2.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f5300bb) {
                CardConsumeSuccessUI cardConsumeSuccessUI = CardConsumeSuccessUI.this;
                C22062i iVar = cardConsumeSuccessUI.f51652p;
                if (iVar == null || (arrayList = iVar.f62441a) == null || arrayList.isEmpty()) {
                    Log.m105920e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list == null || mConsumedInfo.list.isEmpty()!");
                } else {
                    cardConsumeSuccessUI.mo23318L7(true);
                    LinkedList linkedList = new LinkedList();
                    for (int i = 0; i < cardConsumeSuccessUI.f51652p.f62441a.size(); i++) {
                        C22506ko koVar = cardConsumeSuccessUI.f51652p.f62441a.get(i).f62445a;
                        y34 y34 = new y34();
                        if (koVar != null) {
                            String str = koVar.f64136d;
                            y34.f64816e = str;
                            cardConsumeSuccessUI.f51655s = str;
                        }
                        y34.f64817f = cardConsumeSuccessUI.f51652p.f62441a.get(i).f62446b;
                        y34.f64819h = "";
                        y34.f64818g = "";
                        y34.f64820i = cardConsumeSuccessUI.f51658v;
                        linkedList.add(y34);
                    }
                    String str2 = cardConsumeSuccessUI.f51657u == 1 ? cardConsumeSuccessUI.f51652p.f62442b : cardConsumeSuccessUI.f51653q;
                    n44 o = C22945n.m27015o(cardConsumeSuccessUI.f51659w, cardConsumeSuccessUI.f51662z, cardConsumeSuccessUI.f51638A);
                    C22061g gVar = cardConsumeSuccessUI.f51651o.isChecked() ? new C22061g(0, linkedList, cardConsumeSuccessUI.f51652p.f62444d, str2, o, 20, (xa4) null) : new C22061g(0, linkedList, "", str2, o, 20, (xa4) null);
                    CheckBox checkBox = cardConsumeSuccessUI.f51651o;
                    if (checkBox != null && checkBox.getVisibility() == 0) {
                        if (cardConsumeSuccessUI.f51651o.isChecked()) {
                            C115669n.INSTANCE.mo160131h(11324, "CardConsumeSuccessFollowServices", 0, "", "", 0, 0, "", 0, "");
                        } else {
                            C115669n.INSTANCE.mo160131h(11324, "CardConsumeSuccessView", 0, "", "", 0, 0, "", 0, "");
                        }
                    }
                    C86709a0.m107529k().f251779b.mo123460f(gVar);
                }
            } else if (view.getId() == C0966R.C0970id.k_h) {
                Intent intent = new Intent();
                intent.putExtra("KLabel_range_index", CardConsumeSuccessUI.this.f51659w);
                intent.putExtra("Klabel_name_list", CardConsumeSuccessUI.this.f51660x);
                intent.putExtra("Kother_user_name_list", CardConsumeSuccessUI.this.f51661y);
                intent.putExtra("k_sns_label_ui_title", CardConsumeSuccessUI.this.getString(C0966R.string.b15));
                intent.putExtra("k_sns_label_ui_style", 0);
                intent.putExtra("KLabel_is_filter_private", true);
                C88144b.m109795m(CardConsumeSuccessUI.this, "sns", ".ui.SnsLabelUI", intent, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI$c */
    public class C18549c implements Runnable {
        public C18549c() {
        }

        public void run() {
            CardConsumeSuccessUI cardConsumeSuccessUI = CardConsumeSuccessUI.this;
            int i = CardConsumeSuccessUI.f51637F;
            cardConsumeSuccessUI.mo23320N7();
        }
    }

    /* renamed from: H7 */
    public final String mo23314H7() {
        if (TextUtils.isEmpty(this.f51660x) || TextUtils.isEmpty(this.f51661y)) {
            return !TextUtils.isEmpty(this.f51660x) ? this.f51660x : !TextUtils.isEmpty(this.f51661y) ? C22945n.m27010j(this.f51661y) : "";
        }
        return this.f51660x + "," + C22945n.m27010j(this.f51661y);
    }

    /* renamed from: I7 */
    public final boolean mo23315I7(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
            return false;
        }
        Log.m105924i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()");
        C22062i iVar = null;
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser json is empty");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C22062i iVar2 = new C22062i();
                iVar2.f62442b = jSONObject.optString("consumed_box_id");
                iVar2.f62443c = jSONObject.optString("subscribe_wording");
                iVar2.f62444d = jSONObject.optString("subscribe_app_username");
                JSONArray optJSONArray = jSONObject.optJSONArray("list");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList<C22063p> arrayList = new ArrayList<>();
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            C22063p pVar = new C22063p();
                            pVar.f62446b = optJSONObject.optString("card_ext");
                            pVar.f62445a = C22943h.m26974k(optJSONObject.optJSONObject("card_tp_info"));
                            arrayList.add(pVar);
                        }
                        iVar2.f62441a = arrayList;
                        Log.m105924i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser() tempList size is" + arrayList.size());
                        if (TextUtils.isEmpty(iVar2.f62442b)) {
                            Log.m105924i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  consumed_box_id is empty");
                        }
                        if (TextUtils.isEmpty(iVar2.f62443c)) {
                            Log.m105924i("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser()  subscribe_wording is empty");
                        }
                        iVar = iVar2;
                    }
                }
                Log.m105920e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser cardItemListJson is null");
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.ShareCardConsumedInfoParser", "parseShareCardConsumedInfoParser exception:" + e.getMessage());
                Log.printErrStackTrace("MicroMsg.ShareCardConsumedInfoParser", e, "", new Object[0]);
            }
        }
        this.f51652p = iVar;
        if (iVar != null) {
            return true;
        }
        Log.m105920e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + str);
        return false;
    }

    /* renamed from: J7 */
    public final void mo23316J7(int i) {
        Log.m105924i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + i);
        ConsumedCouponCardCodeEvent consumedCouponCardCodeEvent = new ConsumedCouponCardCodeEvent();
        consumedCouponCardCodeEvent.f193543d.f193544a = i;
        consumedCouponCardCodeEvent.publish();
    }

    /* renamed from: K7 */
    public final void mo23317K7() {
        getContentView().setBackgroundColor(getResources().getColor(C0966R.color.f3199ip));
        View findViewById = findViewById(C0966R.C0970id.iwe);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "resetBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: L7 */
    public final void mo23318L7(boolean z) {
        if (z) {
            this.f51641D = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f51641D;
        if (i0Var != null && i0Var.isShowing()) {
            this.f51641D.dismiss();
            this.f51641D = null;
        }
    }

    /* renamed from: M7 */
    public final void mo23319M7(String str) {
        int d = C22945n.m27004d(str);
        this.f51643d.setBackgroundColor(d);
        setActionbarColor(d);
        if (C11171e.m11046c(16)) {
            this.f51650n.setBackground(C22945n.m27014n(this, d, getResources().getDimensionPixelSize(C0966R.dimen.f4209w7) / 2));
        } else {
            this.f51650n.setBackgroundDrawable(C22945n.m27014n(this, d, getResources().getDimensionPixelSize(C0966R.dimen.f4209w7) / 2));
        }
        this.f51643d.invalidate();
    }

    /* renamed from: N7 */
    public final void mo23320N7() {
        if (this.f51652p == null) {
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
            return;
        }
        View findViewById = findViewById(C0966R.C0970id.iwe);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (TextUtils.isEmpty(this.f51652p.f62443c) || TextUtils.isEmpty(this.f51652p.f62444d)) {
            this.f51651o.setVisibility(8);
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
        } else {
            this.f51651o.setText(this.f51652p.f62443c);
            this.f51651o.setVisibility(0);
        }
        ArrayList<C22063p> arrayList = this.f51652p.f62441a;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f51650n.setEnabled(false);
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
            return;
        }
        this.f51646g.setText(getString(C0966R.string.awl, new Object[]{Integer.valueOf(this.f51652p.f62441a.size())}));
        C22506ko koVar = this.f51652p.f62441a.get(0).f62445a;
        if (koVar != null) {
            mo23319M7(koVar.f64145p);
            this.f51644e.setText(koVar.f64142j);
            this.f51645f.setText(koVar.f64143n);
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f4227wv);
            if (!TextUtils.isEmpty(koVar.f64137e)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C112760b.m154195C();
                bVar.f59350f = C76251l.m91644m(koVar.f64137e);
                bVar.f59346b = true;
                bVar.f59364t = true;
                bVar.f59345a = true;
                bVar.f59355k = dimensionPixelSize;
                bVar.f59354j = dimensionPixelSize;
                bVar.f59359o = C0966R.C0969drawable.f357296c91;
                C20828a.m22825b().mo32519h(koVar.f64137e, this.f51649j, bVar.mo32666a());
            } else {
                Log.m105920e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
                this.f51649j.setImageResource(C0966R.C0969drawable.f357296c91);
            }
            if (TextUtils.isEmpty(koVar.f64106D)) {
                this.f51650n.setText(C0966R.string.awi);
                return;
            }
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
            this.f51650n.setText(koVar.f64106D);
            return;
        }
        Log.m105920e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6701m6;
    }

    public void initView() {
        setBackBtn(new C18547a());
        this.f51643d = getContentView();
        this.f51644e = (TextView) findViewById(C0966R.C0970id.asp);
        this.f51645f = (TextView) findViewById(C0966R.C0970id.aw6);
        TextView textView = (TextView) findViewById(C0966R.C0970id.atn);
        this.f51646g = (TextView) findViewById(C0966R.C0970id.k_i);
        this.f51647h = (TextView) findViewById(C0966R.C0970id.k_h);
        this.f51648i = (TextView) findViewById(C0966R.C0970id.k_g);
        this.f51649j = (ImageView) findViewById(C0966R.C0970id.av8);
        this.f51650n = (Button) findViewById(C0966R.C0970id.f5300bb);
        this.f51651o = (CheckBox) findViewById(C0966R.C0970id.f6193zx);
        this.f51650n.setOnClickListener(this.f51642E);
        this.f51651o.setOnClickListener(this.f51642E);
        this.f51647h.setOnClickListener(this.f51642E);
        if (this.f51652p != null) {
            mo23320N7();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            int intExtra = intent.getIntExtra("Ktag_range_index", 0);
            this.f51659w = intExtra;
            Log.m105925i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", Integer.valueOf(intExtra));
            if (this.f51659w >= 2) {
                this.f51660x = intent.getStringExtra("Klabel_name_list");
                this.f51661y = intent.getStringExtra("Kother_user_name_list");
                Log.m105919d("MicroMsg.CardConsumeSuccessUI", "mPrivateSelect : %d, names : %s", Integer.valueOf(this.f51659w), this.f51660x);
                if (!TextUtils.isEmpty(this.f51660x) || !TextUtils.isEmpty(this.f51661y)) {
                    List asList = Arrays.asList(this.f51660x.split(","));
                    this.f51638A = C22945n.m27008h(asList);
                    this.f51662z = C22945n.m27009i(asList);
                    String str = this.f51661y;
                    if (str != null && str.length() > 0) {
                        this.f51662z.addAll(Arrays.asList(this.f51661y.split(",")));
                    }
                    if (this.f51638A != null) {
                        Log.m105924i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.f51638A.size());
                    }
                    if (this.f51662z != null) {
                        Log.m105924i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.f51662z.size());
                        Iterator<String> it = this.f51662z.iterator();
                        while (it.hasNext()) {
                            Log.m105919d("MicroMsg.CardConsumeSuccessUI", "username : %s", it.next());
                        }
                    }
                    int i3 = this.f51659w;
                    if (i3 == 2) {
                        this.f51648i.setVisibility(0);
                        this.f51648i.setText(getString(C0966R.string.f360233b14, new Object[]{mo23314H7()}));
                    } else if (i3 == 3) {
                        this.f51648i.setVisibility(0);
                        this.f51648i.setText(getString(C0966R.string.f360232b13, new Object[]{mo23314H7()}));
                    } else {
                        this.f51648i.setVisibility(8);
                    }
                } else {
                    Log.m105920e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
                }
            } else {
                this.f51648i.setVisibility(8);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0139, code lost:
        r12 = r11.f51652p.f62441a.get(0).f62445a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            java.lang.String r12 = "MicroMsg.CardConsumeSuccessUI"
            java.lang.String r0 = "onCreate()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            long r0 = java.lang.System.currentTimeMillis()
            r11.f51639B = r0
            java.lang.String r0 = ""
            r11.setMMTitle((java.lang.String) r0)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11.setResult(r1)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 902(0x386, float:1.264E-42)
            r3.mo123455a(r4, r11)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 910(0x38e, float:1.275E-42)
            r3.mo123455a(r4, r11)
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r4 = "key_from_scene"
            int r3 = r3.getIntExtra(r4, r1)
            r11.f51657u = r3
            r4 = 4
            r5 = 7
            r6 = 20
            r7 = 2
            r8 = 1
            if (r3 != r8) goto L_0x00ab
            java.lang.String r3 = "SCENE_FROM_JS"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r9 = "key_consumed_card_id"
            java.lang.String r3 = r3.getStringExtra(r9)
            r11.f51654r = r3
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r9 = "key_consumed_Code"
            java.lang.String r3 = r3.getStringExtra(r9)
            r11.f51656t = r3
            java.lang.String r3 = r11.f51654r
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0079
            java.lang.String r0 = "the mConsumdeCardId is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r11.mo23316J7(r1)
            r11.finish()
            return
        L_0x0079:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "the mConsumdeCode is "
            r3.append(r9)
            java.lang.String r9 = r11.f51656t
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            r11.mo23318L7(r8)
            pz0.d r12 = new pz0.d
            java.lang.String r3 = r11.f51654r
            java.lang.String r9 = r11.f51656t
            r12.<init>(r0, r6, r3, r9)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r3.mo123460f(r12)
            r11.mo23317K7()
            r11.f51658v = r5
            goto L_0x0100
        L_0x00ab:
            java.lang.String r9 = "the mCardId is empty!"
            if (r3 != r7) goto L_0x0102
            java.lang.String r3 = "SCENE_FROM_MSG_UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r10 = "key_card_id"
            java.lang.String r3 = r3.getStringExtra(r10)
            r11.f51653q = r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00d1
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r9)
            r11.mo23316J7(r1)
            r11.finish()
            return
        L_0x00d1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "the mCardId is "
            r3.append(r9)
            java.lang.String r9 = r11.f51653q
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            r11.mo23318L7(r8)
            pz0.d r12 = new pz0.d
            java.lang.String r3 = r11.f51653q
            r12.<init>(r3, r6, r0, r0)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r3.mo123460f(r12)
            r11.mo23317K7()
            r11.f51658v = r4
        L_0x0100:
            r12 = r0
            goto L_0x0167
        L_0x0102:
            java.lang.String r3 = "SCENE_FROM_CONSUMED_CODE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r6 = "KEY_CARD_ID"
            java.lang.String r3 = r3.getStringExtra(r6)
            r11.f51653q = r3
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r6 = "KEY_CARD_CONSUMED_JSON"
            java.lang.String r3 = r3.getStringExtra(r6)
            boolean r3 = r11.mo23315I7(r3)
            if (r3 != 0) goto L_0x012d
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r9)
            r11.mo23316J7(r1)
            r11.finish()
            return
        L_0x012d:
            pz0.i r12 = r11.f51652p
            if (r12 == 0) goto L_0x014a
            java.util.ArrayList<pz0.p> r12 = r12.f62441a
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r12)
            if (r12 != 0) goto L_0x014a
            pz0.i r12 = r11.f51652p
            java.util.ArrayList<pz0.p> r12 = r12.f62441a
            java.lang.Object r12 = r12.get(r1)
            pz0.p r12 = (pz0.C22063p) r12
            te3.ko r12 = r12.f62445a
            if (r12 == 0) goto L_0x014a
            java.lang.String r12 = r12.f64145p
            goto L_0x014b
        L_0x014a:
            r12 = r0
        L_0x014b:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r3 == 0) goto L_0x015b
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r3 = "KEY_CARD_COLOR"
            java.lang.String r12 = r12.getStringExtra(r3)
        L_0x015b:
            android.content.Intent r3 = r11.getIntent()
            java.lang.String r6 = "key_stastic_scene"
            int r3 = r3.getIntExtra(r6, r1)
            r11.f51658v = r3
        L_0x0167:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 11324(0x2c3c, float:1.5868E-41)
            r9 = 9
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "CardConsumeSuccessUI"
            r9[r1] = r10
            r9[r8] = r2
            r9[r7] = r0
            r1 = 3
            r9[r1] = r0
            r9[r4] = r2
            r1 = 5
            int r4 = r11.f51658v
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r1] = r4
            r1 = 6
            r9[r1] = r0
            r9[r5] = r2
            r1 = 8
            r9[r1] = r0
            r3.mo160131h(r6, r9)
            r11.initView()
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L_0x019d
            r11.mo23319M7(r12)
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.sharecard.p317ui.CardConsumeSuccessUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C86709a0.m107529k().f251779b.mo123470p(C82613z.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123470p(C9464d.CTRL_INDEX, this);
        long currentTimeMillis = System.currentTimeMillis() - this.f51639B;
        if (!TextUtils.isEmpty(this.f51653q)) {
            C115669n.INSTANCE.mo160131h(13219, "CardConsumeSuccessUI", Integer.valueOf(this.f51657u), this.f51655s, this.f51653q, Long.valueOf(currentTimeMillis));
        } else {
            C115669n.INSTANCE.mo160131h(13219, "CardConsumeSuccessUI", Integer.valueOf(this.f51657u), this.f51655s, this.f51654r, Long.valueOf(currentTimeMillis));
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105920e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
            mo23316J7(0);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + i + " errCode = " + i2 + " scene cmd is " + yVar.getType());
        mo23318L7(false);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C22061g) {
                C22061g gVar = (C22061g) yVar;
                if (gVar.f62439g == 0) {
                    C76879j.m92726T(this, getString(C0966R.string.avv));
                    setResult(-1);
                    this.f51650n.setEnabled(false);
                    C22945n.m26998K();
                    Log.m105924i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
                    mo23316J7(-1);
                    String str2 = gVar.f62438f;
                    ShareCardInfo shareCardInfo = new ShareCardInfo();
                    C22943h.m26980q(shareCardInfo, str2);
                    C22945n.m26992E(shareCardInfo);
                    C46153l0.Kx0().mo60218c();
                    finish();
                    return;
                }
                Log.m105920e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + gVar.f62439g);
                C53248d.m59683c(this, gVar.f62440h);
                C76879j.m92726T(this, getString(C0966R.string.avr));
            } else if (yVar instanceof C47718d) {
                C47718d dVar = (C47718d) yVar;
                if (TextUtils.isEmpty(dVar.f128200f) || !mo23315I7(dVar.f128200f)) {
                    Log.m105920e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
                    if (this.f51657u == 1) {
                        mo23316J7(0);
                        finish();
                        return;
                    }
                    mo23317K7();
                    String str3 = dVar.f128201g;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = getString(C0966R.string.avt);
                    }
                    C76879j.m92713G(this, str3, "", false, new C22179a(this));
                    if (Util.isNullOrNil(dVar.f128201g)) {
                        C76879j.m92726T(this, getString(C0966R.string.avt));
                    } else {
                        C76879j.m92726T(this, dVar.f128201g);
                    }
                } else {
                    Log.m105924i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
                    this.f51640C.post(new C18549c());
                }
            }
        } else if (!(yVar instanceof C47718d) || this.f51657u != 1) {
            C53248d.m59683c(this, str);
        } else {
            mo23316J7(0);
            finish();
        }
    }
}
