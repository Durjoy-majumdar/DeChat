package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gz0.C45995o;
import hz0.C46146f;
import hz0.C46150g;
import hz0.C46153l0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import wz0.C53246b;
import wz0.C53248d;

/* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI */
public class CardNewMsgUI extends MMActivity implements C45995o.C45997b {

    /* renamed from: n */
    public static final /* synthetic */ int f109790n = 0;

    /* renamed from: d */
    public ListView f109791d;

    /* renamed from: e */
    public C40843h f109792e;

    /* renamed from: f */
    public View f109793f;

    /* renamed from: g */
    public View f109794g;

    /* renamed from: h */
    public View f109795h = null;

    /* renamed from: i */
    public boolean f109796i = false;

    /* renamed from: j */
    public View.OnClickListener f109797j = new C40842g();

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$a */
    public class C40836a implements MenuItem.OnMenuItemClickListener {
        public C40836a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardNewMsgUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$b */
    public class C40837b implements AdapterView.OnItemClickListener {
        public C40837b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            int i3 = i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i3 == CardNewMsgUI.this.f109792e.getCount()) {
                if (C46153l0.Cx0().mo71599jo() > 0) {
                    C46153l0.Cx0().f124386d.execSQL("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
                    i2 = 1;
                } else {
                    i2 = CardNewMsgUI.this.f109792e.mo63799s();
                }
                CardNewMsgUI.this.f109792e.mo7991f();
                CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
                if (!cardNewMsgUI.f109796i) {
                    if (cardNewMsgUI.f109794g.getParent() != null) {
                        Log.m105918d("MicroMsg.CardNewMsgUI", "remove footer");
                        CardNewMsgUI cardNewMsgUI2 = CardNewMsgUI.this;
                        cardNewMsgUI2.f109791d.removeFooterView(cardNewMsgUI2.f109794g);
                    }
                    CardNewMsgUI cardNewMsgUI3 = CardNewMsgUI.this;
                    C40843h hVar = cardNewMsgUI3.f109792e;
                    if (!(hVar.f109805o >= hVar.f109806p) && cardNewMsgUI3.f109795h.getParent() == null && i2 > 0) {
                        CardNewMsgUI cardNewMsgUI4 = CardNewMsgUI.this;
                        cardNewMsgUI4.f109791d.addFooterView(cardNewMsgUI4.f109795h);
                        Log.m105924i("MicroMsg.CardNewMsgUI", "add mLoadingFooterView");
                    }
                }
                CardNewMsgUI cardNewMsgUI5 = CardNewMsgUI.this;
                cardNewMsgUI5.f109796i = true;
                View view2 = cardNewMsgUI5.f109794g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            CardNewMsgUI cardNewMsgUI6 = CardNewMsgUI.this;
            C46146f fVar = (C46146f) cardNewMsgUI6.f109792e.getItem(i3);
            if (fVar != null) {
                int i4 = fVar.field_jump_type;
                if (i4 == 3) {
                    if (!TextUtils.isEmpty(fVar.field_card_id)) {
                        cardNewMsgUI6.mo63789I7(fVar.field_card_id, false);
                    } else if (!TextUtils.isEmpty(fVar.field_card_tp_id)) {
                        cardNewMsgUI6.mo63789I7(fVar.field_card_tp_id, false);
                    } else {
                        Log.m105920e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    }
                } else if (i4 == 2) {
                    if (!TextUtils.isEmpty(fVar.field_url)) {
                        C53246b.m59678j(cardNewMsgUI6, fVar.field_url, 4);
                    } else {
                        Log.m105920e("MicroMsg.CardNewMsgUI", "field_url is null");
                    }
                } else if (i4 == 1) {
                    Log.m105924i("MicroMsg.CardNewMsgUI", "field_jump_type is MM_CARD_ITEM_XML_MSG_JUMP_TYPE_NO");
                } else if (i4 == 4) {
                    if (!TextUtils.isEmpty(fVar.field_card_id)) {
                        cardNewMsgUI6.mo63789I7(fVar.field_card_id, true);
                    } else if (!TextUtils.isEmpty(fVar.field_card_tp_id)) {
                        cardNewMsgUI6.mo63789I7(fVar.field_card_tp_id, true);
                    } else {
                        Log.m105920e("MicroMsg.CardNewMsgUI", "field_card_id and field_card_tp_id is null");
                    }
                }
                C115669n.INSTANCE.mo160131h(11941, Integer.valueOf(cardNewMsgUI6.getIntent().getBooleanExtra("from_menu", false) ? 7 : 1), fVar.field_card_id, fVar.field_card_tp_id, fVar.field_msg_id, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$c */
    public class C40838c implements AdapterView.OnItemLongClickListener {
        public C40838c() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
            int i2 = CardNewMsgUI.f109790n;
            C76879j.m92736g(cardNewMsgUI, cardNewMsgUI.getResources().getString(C0966R.string.f360226b01), (String[]) null, cardNewMsgUI.getResources().getString(C0966R.string.f7944x1), new C40860c0(cardNewMsgUI, i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$d */
    public class C40839d implements AbsListView.OnScrollListener {
        public C40839d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (!CardNewMsgUI.this.f109796i) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            } else if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                if (C46153l0.Cx0().mo71599jo() > 0) {
                    C46153l0.Cx0().f124386d.execSQL("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
                } else {
                    CardNewMsgUI.this.f109792e.mo63799s();
                }
                CardNewMsgUI.this.f109792e.mo7991f();
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            } else {
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$e */
    public class C40840e implements C6975i1.C6977b {
        public C40840e() {
        }

        /* renamed from: a */
        public void mo1327a(Object obj) {
            CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
            int i = CardNewMsgUI.f109790n;
            cardNewMsgUI.mo63788H7();
            C40843h hVar = CardNewMsgUI.this.f109792e;
            if ((hVar.f109805o >= hVar.f109806p) && C46153l0.Cx0().mo71599jo() == 0) {
                View view = CardNewMsgUI.this.f109794g;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: b */
        public void mo1328b(Object obj) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$f */
    public class C40841f implements MenuItem.OnMenuItemClickListener {
        public C40841f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n.INSTANCE.mo160131h(11582, "CardMsgClearMenu", 2, 0, "", "", "");
            CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
            int i = CardNewMsgUI.f109790n;
            cardNewMsgUI.getClass();
            C53248d.m59681a(cardNewMsgUI, new C40862d0(cardNewMsgUI));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$g */
    public class C40842g implements View.OnClickListener {
        public C40842g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f357952co1) {
                C46146f fVar = (C46146f) view.getTag();
                if (fVar == null || fVar.mo71597l2() == null) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(11941, 2, fVar.field_card_id, fVar.field_card_tp_id, fVar.field_msg_id, "");
                if (fVar.mo71597l2().f133590d == 0) {
                    Log.m105924i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_URL");
                    if (!TextUtils.isEmpty(fVar.mo71597l2().f133592f)) {
                        C53246b.m59678j(CardNewMsgUI.this, fVar.mo71597l2().f133592f, 2);
                    } else {
                        Log.m105920e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
                    }
                } else if (fVar.mo71597l2().f133590d == 1) {
                    Log.m105924i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_BUTTON_TYPE_SHOP");
                    Intent intent = new Intent();
                    intent.putExtra("KEY_CARD_ID", fVar.field_card_id);
                    intent.putExtra("KEY_CARD_TP_ID", fVar.field_card_tp_id);
                    intent.setClass(CardNewMsgUI.this, CardShopUI.class);
                    CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    CardNewMsgUI cardNewMsgUI2 = cardNewMsgUI;
                    C117292a.m165358d(cardNewMsgUI2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    cardNewMsgUI.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(cardNewMsgUI2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    nVar.mo160131h(11324, "UsedStoresView", Integer.valueOf(fVar.field_card_type), fVar.field_card_tp_id, fVar.field_card_id, 0, 0, "", 0, "");
                }
            } else if (view.getId() == C0966R.C0970id.hn6) {
                C46146f fVar2 = (C46146f) view.getTag();
                if (fVar2 == null || fVar2.mo71598m2() == null) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (fVar2.mo71598m2().f145413d == 0) {
                    Log.m105924i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_TEXT");
                    if (!TextUtils.isEmpty(fVar2.mo71598m2().f145415f)) {
                        C53246b.m59678j(CardNewMsgUI.this, fVar2.mo71598m2().f145415f, 2);
                    } else {
                        Log.m105920e("MicroMsg.CardNewMsgUI", "card msg oper region url is empty");
                    }
                } else if (fVar2.mo71598m2().f145413d == 1) {
                    Log.m105924i("MicroMsg.CardNewMsgUI", "card msg action_type is MM_CARD_ITEM_XML_MSG_OPERATION_REGION_TYPE_CARDS");
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$h */
    public class C40843h extends C6975i1<C46146f> {

        /* renamed from: o */
        public int f109805o = 10;

        /* renamed from: p */
        public int f109806p = 10;

        public C40843h() {
            super(CardNewMsgUI.this, new C46146f());
            mo7997q(true);
        }

        /* renamed from: d */
        public Object mo1330d(Object obj, Cursor cursor) {
            C46146f fVar = (C46146f) obj;
            if (fVar == null) {
                fVar = new C46146f();
            }
            fVar.convertFrom(cursor);
            return fVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.tencent.mm.plugin.card.ui.CardNewMsgUI$i} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r25, android.view.View r26, android.view.ViewGroup r27) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                java.lang.Object r2 = r24.getItem(r25)
                hz0.f r2 = (hz0.C46146f) r2
                r3 = 0
                if (r26 != 0) goto L_0x00a5
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r4 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                androidx.appcompat.app.AppCompatActivity r4 = r4.getContext()
                r5 = 2131493522(0x7f0c0292, float:1.8610527E38)
                android.view.View r4 = android.view.View.inflate(r4, r5, r3)
                com.tencent.mm.plugin.card.ui.CardNewMsgUI$i r5 = new com.tencent.mm.plugin.card.ui.CardNewMsgUI$i
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r6 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                r5.<init>(r6, r3)
                r6 = 2131308154(0x7f092e7a, float:1.8234556E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f109808a = r6
                r6 = 2131298902(0x7f090a56, float:1.821579E38)
                android.view.View r6 = r4.findViewById(r6)
                r5.f109809b = r6
                r6 = 2131298901(0x7f090a55, float:1.8215788E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.ImageView r6 = (android.widget.ImageView) r6
                r5.f109810c = r6
                r6 = 2131315432(0x7f094ae8, float:1.8249317E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109811d = r6
                r6 = 2131315233(0x7f094a21, float:1.8248913E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109812e = r6
                r6 = 2131300859(0x7f0911fb, float:1.821976E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109813f = r6
                r6 = 2131301825(0x7f0915c1, float:1.8221719E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109814g = r6
                r6 = 2131314258(0x7f094652, float:1.8246936E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109815h = r6
                r6 = 2131310572(0x7f0937ec, float:1.823946E38)
                android.view.View r6 = r4.findViewById(r6)
                r5.f109816i = r6
                r6 = 2131310573(0x7f0937ed, float:1.8239462E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                r5.f109817j = r6
                r6 = 2131296340(0x7f090054, float:1.8210594E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                r5.f109818k = r6
                r6 = 2131296341(0x7f090055, float:1.8210596E38)
                android.view.View r6 = r4.findViewById(r6)
                android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
                r5.f109819l = r6
                r4.setTag(r5)
                goto L_0x00ae
            L_0x00a5:
                java.lang.Object r4 = r26.getTag()
                r5 = r4
                com.tencent.mm.plugin.card.ui.CardNewMsgUI$i r5 = (com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.C40844i) r5
                r4 = r26
            L_0x00ae:
                android.widget.TextView r6 = r5.f109811d
                java.lang.String r7 = r2.field_title
                r6.setText(r7)
                int r6 = r2.field_time
                long r6 = (long) r6
                r8 = 1000(0x3e8, double:4.94E-321)
                long r6 = r6 * r8
                android.widget.TextView r8 = r5.f109812e
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r9 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                r10 = 1
                java.lang.CharSequence r6 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r9, r6, r10)
                r8.setText(r6)
                android.widget.TextView r6 = r5.f109813f
                java.lang.String r7 = r2.field_description
                r6.setText(r7)
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r6 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                android.content.res.Resources r6 = r6.getResources()
                r7 = 2131166095(0x7f07038f, float:1.7946426E38)
                int r14 = r6.getDimensionPixelSize(r7)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "CardNewMsgUI getView () position : "
                r6.append(r7)
                r6.append(r1)
                java.lang.String r8 = " logo_url :  "
                r6.append(r8)
                java.lang.String r8 = r2.field_logo_url
                r6.append(r8)
                java.lang.String r6 = r6.toString()
                java.lang.String r8 = "MicroMsg.CardNewMsgUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r6)
                java.lang.String r6 = r2.field_logo_color
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                r9 = 8
                r15 = 0
                if (r6 == 0) goto L_0x0161
                android.view.View r1 = r5.f109809b
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                r6.mo10233c(r7)
                java.lang.Object[] r17 = r6.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r1
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r6 = r6.mo10231a(r15)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r1.setVisibility(r6)
                java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r1 = r5.f109808a
                r1.setVisibility(r15)
                android.widget.ImageView r1 = r5.f109808a
                r6 = 2131234225(0x7f080db1, float:1.808461E38)
                r1.setImageResource(r6)
                android.widget.ImageView r1 = r5.f109808a
                java.lang.String r7 = r2.field_logo_url
                wz0.C53263p.m59701b(r1, r7, r14, r6, r10)
                r6 = 0
                goto L_0x01f5
            L_0x0161:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r7)
                r6.append(r1)
                java.lang.String r1 = " field_logo_color :  "
                r6.append(r1)
                java.lang.String r1 = r2.field_logo_color
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
                android.view.View r1 = r5.f109809b
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
                r6.mo10233c(r7)
                java.lang.Object[] r17 = r6.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r19 = "getView"
                java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r1
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r6 = r6.mo10231a(r15)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
                r1.setVisibility(r6)
                java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                android.widget.ImageView r1 = r5.f109808a
                r1.setVisibility(r9)
                java.lang.String r1 = r2.field_logo_url
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L_0x01e4
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r11 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                android.widget.ImageView r12 = r5.f109810c
                java.lang.String r13 = r2.field_logo_url
                r1 = 2131231525(0x7f080325, float:1.8079133E38)
                r16 = 0
                java.lang.String r6 = r2.field_logo_color
                int r17 = wz0.C22945n.m27004d(r6)
                r6 = 0
                r15 = r1
                wz0.C53263p.m59702c(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01f5
            L_0x01e4:
                r6 = 0
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r1 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                android.widget.ImageView r7 = r5.f109810c
                r8 = 2131231525(0x7f080325, float:1.8079133E38)
                java.lang.String r11 = r2.field_logo_color
                int r11 = wz0.C22945n.m27004d(r11)
                wz0.C53263p.m59703d(r1, r7, r8, r11)
            L_0x01f5:
                te3.fn r1 = r2.mo71597l2()
                if (r1 == 0) goto L_0x021e
                java.lang.String r7 = r1.f133591e
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x021e
                android.widget.TextView r7 = r5.f109814g
                java.lang.String r1 = r1.f133591e
                r7.setText(r1)
                android.widget.TextView r1 = r5.f109814g
                r1.setTag(r2)
                android.widget.TextView r1 = r5.f109814g
                r1.setVisibility(r6)
                android.widget.TextView r1 = r5.f109814g
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r7 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                android.view.View$OnClickListener r7 = r7.f109797j
                r1.setOnClickListener(r7)
                goto L_0x0223
            L_0x021e:
                android.widget.TextView r1 = r5.f109814g
                r1.setVisibility(r9)
            L_0x0223:
                te3.yn r1 = r2.mo71598m2()
                if (r1 == 0) goto L_0x028c
                java.lang.String r7 = r1.f145414e
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x028c
                android.widget.TextView r7 = r5.f109817j
                java.lang.String r1 = r1.f145414e
                r7.setText(r1)
                android.view.View r1 = r5.f109816i
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
                r7.mo10233c(r8)
                java.lang.Object[] r12 = r7.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r14 = "getView"
                java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r1
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r1.setVisibility(r7)
                java.lang.String r12 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                android.view.View r1 = r5.f109816i
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r7 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                android.view.View$OnClickListener r7 = r7.f109797j
                r1.setOnClickListener(r7)
                android.view.View r1 = r5.f109816i
                r1.setTag(r2)
                android.widget.TextView r1 = r5.f109815h
                r1.setVisibility(r6)
                goto L_0x02d1
            L_0x028c:
                android.view.View r1 = r5.f109816i
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r7.mo10233c(r8)
                java.lang.Object[] r12 = r7.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r14 = "getView"
                java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r1
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r7 = r7.mo10231a(r6)
                java.lang.Integer r7 = (java.lang.Integer) r7
                int r7 = r7.intValue()
                r1.setVisibility(r7)
                java.lang.String r12 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r13 = "getView"
                java.lang.String r14 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                android.widget.TextView r1 = r5.f109815h
                r1.setVisibility(r9)
            L_0x02d1:
                java.util.List<hz0.f$a> r1 = r2.f124369Z0
                java.lang.String r7 = ".title"
                java.lang.String r8 = ""
                r11 = 100
                if (r1 != 0) goto L_0x0404
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.f124369Z0 = r1
                java.lang.String r1 = r2.field_accept_buttons
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x02ec
                goto L_0x0404
            L_0x02ec:
                java.lang.String r1 = r2.field_accept_buttons
                java.lang.String r12 = "accept_buttons_list"
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r12, r3)
                if (r1 != 0) goto L_0x02f8
                goto L_0x0404
            L_0x02f8:
                r15 = 0
            L_0x02f9:
                if (r15 >= r11) goto L_0x0404
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = ".accept_buttons_list.accept_buttons"
                r12.append(r13)
                if (r15 <= 0) goto L_0x030c
                java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
                goto L_0x030d
            L_0x030c:
                r13 = r8
            L_0x030d:
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r12)
                java.lang.String r14 = ".card_id"
                r13.append(r14)
                java.lang.String r13 = r13.toString()
                java.lang.Object r13 = r1.get(r13)
                java.lang.String r13 = (java.lang.String) r13
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
                if (r13 == 0) goto L_0x034e
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r10 == 0) goto L_0x034e
                goto L_0x0404
            L_0x034e:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                java.lang.String r13 = ".end_time"
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)
                if (r10 == 0) goto L_0x0374
                long r9 = (long) r10
                long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                int r13 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
                if (r13 <= 0) goto L_0x03fd
            L_0x0374:
                hz0.f$a r9 = new hz0.f$a
                r9.<init>(r2)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                r9.f124375a = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                java.lang.String r13 = ".sub_title"
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                r9.f124376b = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                java.lang.String r13 = ".card_ext"
                r10.append(r13)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                r9.f124378d = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                r10.append(r14)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                r9.f124377c = r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r12)
                java.lang.String r12 = ".action_type"
                r10.append(r12)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)
                r9.f124379e = r10
                java.util.List<hz0.f$a> r10 = r2.f124369Z0
                java.util.ArrayList r10 = (java.util.ArrayList) r10
                r10.add(r9)
            L_0x03fd:
                int r15 = r15 + 1
                r9 = 8
                r10 = 1
                goto L_0x02f9
            L_0x0404:
                java.util.List<hz0.f$b> r1 = r2.f124370a1
                if (r1 != 0) goto L_0x04cf
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2.f124370a1 = r1
                java.lang.String r1 = r2.field_jump_buttons
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x0419
                goto L_0x04cf
            L_0x0419:
                java.lang.String r1 = r2.field_jump_buttons
                java.lang.String r9 = "jump_buttons_list"
                java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r9, r3)
                if (r1 != 0) goto L_0x0425
                goto L_0x04cf
            L_0x0425:
                r15 = 0
            L_0x0426:
                if (r15 >= r11) goto L_0x04cf
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = ".jump_buttons_list.jump_buttons"
                r9.append(r10)
                if (r15 <= 0) goto L_0x0439
                java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
                goto L_0x043a
            L_0x0439:
                r10 = r8
            L_0x043a:
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r10.append(r7)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r1.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                if (r10 == 0) goto L_0x045d
                goto L_0x04cf
            L_0x045d:
                hz0.f$b r10 = new hz0.f$b
                r10.<init>(r2)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r9)
                r12.append(r7)
                java.lang.String r12 = r12.toString()
                java.lang.Object r12 = r1.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                r10.f124380a = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r9)
                java.lang.String r13 = ".description"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.Object r12 = r1.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                r10.f124381b = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r9)
                java.lang.String r13 = ".button_wording"
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                java.lang.Object r12 = r1.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                r10.f124382c = r12
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r9)
                java.lang.String r9 = ".jump_url"
                r12.append(r9)
                java.lang.String r9 = r12.toString()
                java.lang.Object r9 = r1.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                r10.f124383d = r9
                java.util.List<hz0.f$b> r9 = r2.f124370a1
                java.util.ArrayList r9 = (java.util.ArrayList) r9
                r9.add(r10)
                int r15 = r15 + 1
                goto L_0x0426
            L_0x04cf:
                java.util.List<hz0.f$a> r1 = r2.f124369Z0
                java.util.List<hz0.f$b> r7 = r2.f124370a1
                android.widget.LinearLayout r8 = r5.f109818k
                r8.removeAllViews()
                r8 = 8
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                if (r1 == 0) goto L_0x04e9
                r8 = r1
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r8 = r8.size()
                if (r8 != 0) goto L_0x04f6
            L_0x04e9:
                if (r7 == 0) goto L_0x065e
                r8 = r7
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r8 = r8.size()
                if (r8 != 0) goto L_0x04f6
                goto L_0x065e
            L_0x04f6:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                r10 = 2131298679(0x7f090977, float:1.8215338E38)
                r11 = 2131493446(0x7f0c0246, float:1.8610372E38)
                r12 = 2131298677(0x7f090975, float:1.8215334E38)
                r14 = 2131298678(0x7f090976, float:1.8215336E38)
                if (r8 != 0) goto L_0x05b0
                r15 = 0
            L_0x0509:
                r8 = r1
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r13 = r8.size()
                if (r15 >= r13) goto L_0x05b0
                java.lang.Object r8 = r8.get(r15)
                hz0.f$a r8 = (hz0.C46146f.C46147a) r8
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r13 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                androidx.appcompat.app.AppCompatActivity r13 = r13.getContext()
                android.view.View r13 = android.view.View.inflate(r13, r11, r3)
                if (r15 != 0) goto L_0x0567
                android.view.View r3 = r13.findViewById(r12)
                k20.a r12 = new k20.a
                r12.<init>()
                java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
                r12.mo10233c(r9)
                java.lang.Object[] r17 = r12.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r19 = "renderAcceptButtonsLayout"
                java.lang.String r20 = "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r3
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r12 = r12.mo10231a(r6)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r12 = r12.intValue()
                r3.setVisibility(r12)
                java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r18 = "renderAcceptButtonsLayout"
                java.lang.String r19 = "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            L_0x0567:
                android.view.View r3 = r13.findViewById(r10)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r12 = r8.f124375a
                r3.setText(r12)
                android.view.View r3 = r13.findViewById(r14)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r12 = r8.f124376b
                r3.setText(r12)
                r3 = 2131298676(0x7f090974, float:1.8215332E38)
                android.view.View r12 = r13.findViewById(r3)
                android.widget.Button r12 = (android.widget.Button) r12
                com.tencent.mm.plugin.card.ui.e0 r3 = new com.tencent.mm.plugin.card.ui.e0
                r3.<init>(r0, r8, r2)
                r12.setOnClickListener(r3)
                int r3 = r8.f124379e
                if (r3 != 0) goto L_0x059a
                r3 = 2131822985(0x7f110989, float:1.9278757E38)
                r12.setText(r3)
                r8 = 1
                goto L_0x05a3
            L_0x059a:
                r8 = 1
                if (r3 != r8) goto L_0x05a3
                r3 = 2131822986(0x7f11098a, float:1.9278759E38)
                r12.setText(r3)
            L_0x05a3:
                android.widget.LinearLayout r3 = r5.f109818k
                r3.addView(r13)
                int r15 = r15 + 1
                r3 = 0
                r12 = 2131298677(0x7f090975, float:1.8215334E38)
                goto L_0x0509
            L_0x05b0:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r7)
                if (r2 != 0) goto L_0x0658
                r15 = 0
            L_0x05b7:
                r2 = r7
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                int r3 = r2.size()
                if (r15 >= r3) goto L_0x0658
                java.lang.Object r2 = r2.get(r15)
                hz0.f$b r2 = (hz0.C46146f.C46148b) r2
                com.tencent.mm.plugin.card.ui.CardNewMsgUI r3 = com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.this
                androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                r8 = 0
                android.view.View r3 = android.view.View.inflate(r3, r11, r8)
                if (r15 != 0) goto L_0x0620
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r12 == 0) goto L_0x0620
                r12 = 2131298677(0x7f090975, float:1.8215334E38)
                android.view.View r13 = r3.findViewById(r12)
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
                r8.mo10233c(r9)
                java.lang.Object[] r17 = r8.mo10232b()
                java.lang.String r18 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r19 = "renderAcceptButtonsLayout"
                java.lang.String r20 = "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r16 = r13
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
                java.lang.Object r8 = r8.mo10231a(r6)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r13.setVisibility(r8)
                java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper"
                java.lang.String r18 = "renderAcceptButtonsLayout"
                java.lang.String r19 = "(Ljava/util/List;Ljava/util/List;Lcom/tencent/mm/plugin/card/ui/CardNewMsgUI$ViewHolder;Lcom/tencent/mm/plugin/card/model/CardMsgInfo;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
                goto L_0x0623
            L_0x0620:
                r12 = 2131298677(0x7f090975, float:1.8215334E38)
            L_0x0623:
                android.view.View r8 = r3.findViewById(r10)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.String r13 = r2.f124380a
                r8.setText(r13)
                android.view.View r8 = r3.findViewById(r14)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.String r13 = r2.f124381b
                r8.setText(r13)
                r8 = 2131298676(0x7f090974, float:1.8215332E38)
                android.view.View r13 = r3.findViewById(r8)
                android.widget.Button r13 = (android.widget.Button) r13
                com.tencent.mm.plugin.card.ui.f0 r8 = new com.tencent.mm.plugin.card.ui.f0
                r8.<init>(r0, r2)
                r13.setOnClickListener(r8)
                java.lang.String r2 = r2.f124382c
                r13.setText(r2)
                android.widget.LinearLayout r2 = r5.f109818k
                r2.addView(r3)
                int r15 = r15 + 1
                goto L_0x05b7
            L_0x0658:
                android.widget.LinearLayout r1 = r5.f109819l
                r1.setVisibility(r6)
                goto L_0x0665
            L_0x065e:
                android.widget.LinearLayout r1 = r5.f109819l
                r2 = 8
                r1.setVisibility(r2)
            L_0x0665:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardNewMsgUI.C40843h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        /* renamed from: l */
        public void mo1332l() {
            mo5580b();
            mo1333o();
        }

        /* renamed from: o */
        public void mo1333o() {
            if (C46153l0.Cx0().mo71599jo() > 0) {
                mo7998r(C46153l0.Cx0().f124386d.rawQuery("select * from CardMsgInfo where read_state = ?  order by time desc", new String[]{"1"}));
            } else {
                this.f109806p = C46153l0.Cx0().getCount();
                C46150g Cx0 = C46153l0.Cx0();
                int i = this.f109805o;
                Cx0.getClass();
                mo7998r(Cx0.f124386d.rawQuery("select * from CardMsgInfo order by time desc LIMIT " + i, (String[]) null));
            }
            notifyDataSetChanged();
        }

        /* renamed from: s */
        public int mo63799s() {
            int i = this.f109805o;
            int i2 = this.f109806p;
            if (i >= i2) {
                if (CardNewMsgUI.this.f109795h.getParent() != null) {
                    CardNewMsgUI cardNewMsgUI = CardNewMsgUI.this;
                    cardNewMsgUI.f109791d.removeFooterView(cardNewMsgUI.f109795h);
                }
                return 0;
            }
            int i3 = i + 10;
            this.f109805o = i3;
            if (i3 <= i2) {
                return 10;
            }
            this.f109805o = i2;
            return i2 % 10;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardNewMsgUI$i */
    public class C40844i {

        /* renamed from: a */
        public ImageView f109808a;

        /* renamed from: b */
        public View f109809b;

        /* renamed from: c */
        public ImageView f109810c;

        /* renamed from: d */
        public TextView f109811d;

        /* renamed from: e */
        public TextView f109812e;

        /* renamed from: f */
        public TextView f109813f;

        /* renamed from: g */
        public TextView f109814g;

        /* renamed from: h */
        public TextView f109815h;

        /* renamed from: i */
        public View f109816i;

        /* renamed from: j */
        public TextView f109817j;

        /* renamed from: k */
        public LinearLayout f109818k;

        /* renamed from: l */
        public LinearLayout f109819l;

        public C40844i(CardNewMsgUI cardNewMsgUI, C40836a aVar) {
        }
    }

    /* renamed from: D7 */
    public void mo63787D7(C46146f fVar) {
        int i = fVar.field_msg_type;
        if ((i & 1) != 0 && (i & 3) != 0) {
            mo63788H7();
            this.f109792e.mo7991f();
        }
    }

    /* renamed from: H7 */
    public final void mo63788H7() {
        C45995o Bx0 = C46153l0.Bx0();
        List<C46146f> list = Bx0.f124033b;
        if (((list == null || ((ArrayList) list).isEmpty()) ? 0 : ((ArrayList) Bx0.f124033b).size()) > 0) {
            this.f109791d.setVisibility(0);
            View view = this.f109793f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(true);
        } else {
            this.f109791d.setVisibility(8);
            View view3 = this.f109793f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "doUpdate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            enableOptionMenu(false);
        }
        this.f109792e.notifyDataSetChanged();
    }

    /* renamed from: I7 */
    public void mo63789I7(String str, boolean z) {
        Intent intent = new Intent(this, CardDetailUI.class);
        intent.putExtra("key_card_id", str);
        intent.putExtra("key_is_share_card", z);
        intent.putExtra("key_from_scene", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "gotoCardDetailUI", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI", "gotoCardDetailUI", "(Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6760ns;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f360225b00);
        setBackBtn(new C40836a());
        this.f109791d = (ListView) findViewById(C0966R.C0970id.aw5);
        C40843h hVar = new C40843h();
        this.f109792e = hVar;
        this.f109791d.setAdapter(hVar);
        this.f109791d.setOnItemClickListener(new C40837b());
        this.f109791d.setOnItemLongClickListener(new C40838c());
        this.f109791d.setOnScrollListener(new C40839d());
        this.f109792e.f24699h = new C40840e();
        boolean z = false;
        addTextOptionMenu(0, getString(C0966R.string.aw9), new C40841f());
        this.f109793f = findViewById(C0966R.C0970id.bs9);
        mo63788H7();
        this.f109794g = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6757np, (ViewGroup) null);
        this.f109795h = C85868k2.m106137b(this).inflate(C0966R.C0971layout.bcf, (ViewGroup) null);
        int jo = C46153l0.Cx0().mo71599jo();
        if (jo > 0) {
            this.f109791d.addFooterView(this.f109794g);
            return;
        }
        C40843h hVar2 = this.f109792e;
        if ((hVar2.f109805o >= hVar2.f109806p) || jo != 0 || C46153l0.Cx0().getCount() <= 0) {
            C40843h hVar3 = this.f109792e;
            if (hVar3.f109805o >= hVar3.f109806p) {
                z = true;
            }
            if (z && jo == 0) {
                C46153l0.Cx0().getCount();
                return;
            }
            return;
        }
        this.f109791d.addFooterView(this.f109795h);
        this.f109796i = true;
    }

    public void onChange() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C45995o Bx0 = C46153l0.Bx0();
        if (Bx0.f124032a == null) {
            Bx0.f124032a = new ArrayList();
        }
        ((ArrayList) Bx0.f124032a).add(new WeakReference(this));
        C46153l0.Bx0().mo71405d();
    }

    public void onDestroy() {
        this.f109792e.mo5580b();
        C46153l0.Bx0().mo71407f(this);
        if (C46153l0.Cx0().mo71599jo() > 0) {
            C46153l0.Cx0().f124386d.execSQL("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
        }
        super.onDestroy();
    }
}
