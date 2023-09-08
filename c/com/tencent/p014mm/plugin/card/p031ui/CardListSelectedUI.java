package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.ChooseCardFromWXCardPackage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gz0.C45991n;
import hz0.C46153l0;
import hz0.C87604a;
import hz0.C87605i0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import kk0.C88185j;
import ob0.C11385n;
import p763ym.C79138l;
import pe3.C89349b;
import qo3.C89779i0;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53248d;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI */
public class CardListSelectedUI extends MMActivity implements C11385n, C45991n.C45993b {

    /* renamed from: K */
    public static final /* synthetic */ int f248036K = 0;

    /* renamed from: A */
    public String f248037A;

    /* renamed from: B */
    public String f248038B;

    /* renamed from: C */
    public String f248039C;

    /* renamed from: D */
    public int f248040D;

    /* renamed from: E */
    public String f248041E;

    /* renamed from: F */
    public String f248042F = "";

    /* renamed from: G */
    public String f248043G;

    /* renamed from: H */
    public boolean f248044H = false;

    /* renamed from: I */
    public int f248045I = 0;

    /* renamed from: J */
    public C87604a f248046J;

    /* renamed from: d */
    public C89779i0 f248047d = null;

    /* renamed from: e */
    public ListView f248048e;

    /* renamed from: f */
    public View f248049f;

    /* renamed from: g */
    public RelativeLayout f248050g;

    /* renamed from: h */
    public TextView f248051h;

    /* renamed from: i */
    public TextView f248052i;

    /* renamed from: j */
    public BaseAdapter f248053j;

    /* renamed from: n */
    public boolean f248054n = false;

    /* renamed from: o */
    public LinkedList<C87604a> f248055o = new LinkedList<>();

    /* renamed from: p */
    public HashMap<Integer, Boolean> f248056p = new HashMap<>();

    /* renamed from: q */
    public boolean f248057q = true;

    /* renamed from: r */
    public C89349b f248058r = null;

    /* renamed from: s */
    public boolean f248059s = false;

    /* renamed from: t */
    public boolean f248060t;

    /* renamed from: u */
    public boolean f248061u;

    /* renamed from: v */
    public String f248062v;

    /* renamed from: w */
    public int f248063w;

    /* renamed from: x */
    public String f248064x;

    /* renamed from: y */
    public String f248065y;

    /* renamed from: z */
    public int f248066z;

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$a */
    public class C85130a implements MenuItem.OnMenuItemClickListener {
        public C85130a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardListSelectedUI.this.setResult(0);
            CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
            int i = CardListSelectedUI.f248036K;
            cardListSelectedUI.mo118144J7(0, "");
            CardListSelectedUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$b */
    public class C85131b implements MenuItem.OnMenuItemClickListener {
        public C85131b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
            if (cardListSelectedUI.f248054n) {
                cardListSelectedUI.mo118145q();
            } else if (cardListSelectedUI.f248046J.f253717o) {
                cardListSelectedUI.mo118143I7(true);
                C45991n Ax0 = C46153l0.Ax0();
                C87604a aVar = CardListSelectedUI.this.f248046J;
                Ax0.mo71397b(aVar.f253712j, C22945n.m27026z(aVar.f253710h), 1, 3);
            } else {
                cardListSelectedUI.mo118145q();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$c */
    public class C85132c implements AdapterView.OnItemClickListener {
        public C85132c() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (view.getAlpha() != 1.0f) {
                Log.m105918d("MicroMsg.CardListSelectedUI", "item view is gray, cannot click, do nothing return！");
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
            if (cardListSelectedUI.f248054n) {
                CardListSelectedUI.this.f248056p.put(Integer.valueOf(i), Boolean.valueOf(!cardListSelectedUI.f248056p.get(Integer.valueOf(i)).booleanValue()));
            } else {
                for (int i2 = 0; i2 < CardListSelectedUI.this.f248055o.size(); i2++) {
                    CardListSelectedUI.this.f248056p.put(Integer.valueOf(i2), Boolean.FALSE);
                }
                CardListSelectedUI.this.f248056p.put(Integer.valueOf(i), Boolean.TRUE);
                CardListSelectedUI cardListSelectedUI2 = CardListSelectedUI.this;
                cardListSelectedUI2.f248046J = cardListSelectedUI2.f248055o.get(i);
            }
            CardListSelectedUI.this.f248053j.notifyDataSetChanged();
            CardListSelectedUI cardListSelectedUI3 = CardListSelectedUI.this;
            for (int i3 = 0; i3 < cardListSelectedUI3.f248055o.size(); i3++) {
                Boolean bool = cardListSelectedUI3.f248056p.get(Integer.valueOf(i3));
                if (bool != null && bool.booleanValue()) {
                    cardListSelectedUI3.enableOptionMenu(true);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$3", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$d */
    public class C85133d implements AbsListView.OnScrollListener {
        public C85133d() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1 && !CardListSelectedUI.this.f248057q) {
                Log.m105918d("MicroMsg.CardListSelectedUI", "onScroll() >> doGetCardList()");
                CardListSelectedUI.this.mo118142H7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$4", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$4", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$e */
    public class C85134e implements View.OnClickListener {
        public C85134e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(CardListSelectedUI.this.f248041E)) {
                CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
                C53246b.m59679k(cardListSelectedUI, cardListSelectedUI.f248041E, cardListSelectedUI.getString(C0966R.string.az4));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$f */
    public class C85135f implements View.OnClickListener {
        public C85135f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardListSelectedUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
            int i = CardListSelectedUI.f248036K;
            cardListSelectedUI.mo118145q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardListSelectedUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$g */
    public class C85136g extends BaseAdapter {
        public C85136g() {
        }

        public int getCount() {
            return CardListSelectedUI.this.f248055o.size();
        }

        public Object getItem(int i) {
            return CardListSelectedUI.this.f248055o.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C85139j jVar;
            C87604a aVar = CardListSelectedUI.this.f248055o.get(i);
            if (view == null) {
                view = View.inflate(CardListSelectedUI.this, C0966R.C0971layout.f6771o3, (ViewGroup) null);
                jVar = new C85139j(CardListSelectedUI.this);
                jVar.f248082a = (ImageView) view.findViewById(C0966R.C0970id.g6j);
                jVar.f248083b = (TextView) view.findViewById(C0966R.C0970id.knx);
                jVar.f248084c = (TextView) view.findViewById(C0966R.C0970id.k9m);
                jVar.f248085d = (TextView) view.findViewById(C0966R.C0970id.a1n);
                jVar.f248086e = (TextView) view.findViewById(C0966R.C0970id.ay5);
                jVar.f248087f = view.findViewById(C0966R.C0970id.afw);
                jVar.f248088g = (ImageView) view.findViewById(C0966R.C0970id.f357636ax3);
                view.setTag(jVar);
            } else {
                jVar = (C85139j) view.getTag();
            }
            if (C22945n.m26989B(aVar.f253704b)) {
                jVar.f248083b.setText(aVar.f253707e);
                int i2 = 0;
                if (!TextUtils.isEmpty(aVar.f253706d)) {
                    jVar.f248084c.setVisibility(0);
                    jVar.f248084c.setText(aVar.f253706d);
                } else {
                    jVar.f248084c.setVisibility(8);
                }
                if (!TextUtils.isEmpty(aVar.f253708f)) {
                    jVar.f248085d.setVisibility(0);
                    jVar.f248085d.setText(aVar.f253708f);
                } else {
                    jVar.f248085d.setVisibility(8);
                }
                TextView textView = jVar.f248086e;
                if (Util.isNullOrNil(aVar.f253718p)) {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                jVar.f248086e.setText(aVar.f253718p);
                int dimensionPixelSize = CardListSelectedUI.this.getBaseContext().getResources().getDimensionPixelSize(C0966R.dimen.f4242xb);
                CardListSelectedUI cardListSelectedUI = CardListSelectedUI.this;
                ImageView imageView = jVar.f248082a;
                String str = aVar.f253705c;
                cardListSelectedUI.getClass();
                C53263p.m59701b(imageView, str, dimensionPixelSize, C0966R.C0969drawable.f357296c91, true);
                Boolean bool = CardListSelectedUI.this.f248056p.get(Integer.valueOf(i));
                if (bool == null || !bool.booleanValue()) {
                    jVar.f248088g.setImageResource(C0966R.C0969drawable.f4686k0);
                } else {
                    jVar.f248088g.setImageResource(C0966R.C0969drawable.f4685jz);
                }
            } else {
                Log.m105924i("MicroMsg.CardListSelectedUI", "not support type");
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$h */
    public class C85137h extends BaseAdapter {
        public C85137h() {
        }

        public int getCount() {
            return CardListSelectedUI.this.f248055o.size();
        }

        public Object getItem(int i) {
            return CardListSelectedUI.this.f248055o.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.tencent.mm.plugin.card.ui.CardListSelectedUI$i} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
            /*
                r23 = this;
                r0 = r23
                com.tencent.mm.plugin.card.ui.CardListSelectedUI r1 = com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.this
                java.util.LinkedList<hz0.a> r1 = r1.f248055o
                r2 = r24
                java.lang.Object r1 = r1.get(r2)
                hz0.a r1 = (hz0.C87604a) r1
                if (r25 != 0) goto L_0x0070
                com.tencent.mm.plugin.card.ui.CardListSelectedUI r3 = com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.this
                r4 = 2131493534(0x7f0c029e, float:1.861055E38)
                r5 = 0
                android.view.View r3 = android.view.View.inflate(r3, r4, r5)
                com.tencent.mm.plugin.card.ui.CardListSelectedUI$i r4 = new com.tencent.mm.plugin.card.ui.CardListSelectedUI$i
                com.tencent.mm.plugin.card.ui.CardListSelectedUI r5 = com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.this
                r4.<init>(r5)
                r5 = 2131298880(0x7f090a40, float:1.8215746E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r4.f248075a = r5
                r5 = 2131306542(0x7f09282e, float:1.8231286E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f248076b = r5
                r5 = 2131315360(0x7f094aa0, float:1.8249171E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f248077c = r5
                r5 = 2131314662(0x7f0947e6, float:1.8247755E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f248078d = r5
                r5 = 2131316063(0x7f094d5f, float:1.8250597E38)
                android.view.View r5 = r3.findViewById(r5)
                r4.f248079e = r5
                r5 = 2131306546(0x7f092832, float:1.8231294E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f248080f = r5
                r5 = 2131306534(0x7f092826, float:1.823127E38)
                android.view.View r5 = r3.findViewById(r5)
                android.widget.TextView r5 = (android.widget.TextView) r5
                r4.f248081g = r5
                r3.setTag(r4)
                goto L_0x0079
            L_0x0070:
                java.lang.Object r3 = r25.getTag()
                r4 = r3
                com.tencent.mm.plugin.card.ui.CardListSelectedUI$i r4 = (com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.C85138i) r4
                r3 = r25
            L_0x0079:
                int r5 = r1.f253704b
                boolean r5 = wz0.C22945n.m26989B(r5)
                if (r5 == 0) goto L_0x026c
                java.lang.String r5 = r1.f253706d
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                r13 = 8
                r14 = 0
                if (r5 != 0) goto L_0x0099
                android.widget.TextView r5 = r4.f248077c
                r5.setVisibility(r14)
                android.widget.TextView r5 = r4.f248077c
                java.lang.String r6 = r1.f253706d
                r5.setText(r6)
                goto L_0x009e
            L_0x0099:
                android.widget.TextView r5 = r4.f248077c
                r5.setVisibility(r13)
            L_0x009e:
                java.lang.String r5 = r1.f253707e
                boolean r5 = android.text.TextUtils.isEmpty(r5)
                if (r5 != 0) goto L_0x00b3
                android.widget.TextView r5 = r4.f248078d
                r5.setVisibility(r14)
                android.widget.TextView r5 = r4.f248078d
                java.lang.String r6 = r1.f253707e
                r5.setText(r6)
                goto L_0x00b8
            L_0x00b3:
                android.widget.TextView r5 = r4.f248078d
                r5.setVisibility(r13)
            L_0x00b8:
                int r5 = r1.f253713k
                if (r5 != 0) goto L_0x0132
                r5 = 1065353216(0x3f800000, float:1.0)
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                r15.mo10233c(r5)
                java.lang.Object[] r6 = r15.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setAlpha"
                java.lang.String r12 = "(F)V"
                r5 = r3
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r5 = r15.mo10231a(r14)
                java.lang.Float r5 = (java.lang.Float) r5
                float r5 = r5.floatValue()
                r3.setAlpha(r5)
                java.lang.String r6 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r7 = "getView"
                java.lang.String r8 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setAlpha"
                java.lang.String r11 = "(F)V"
                r5 = r3
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.widget.ImageView r5 = r4.f248075a
                r5.setVisibility(r14)
                android.widget.TextView r5 = r4.f248076b
                r5.setVisibility(r13)
                com.tencent.mm.plugin.card.ui.CardListSelectedUI r5 = com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.this
                java.util.HashMap<java.lang.Integer, java.lang.Boolean> r5 = r5.f248056p
                java.lang.Integer r2 = java.lang.Integer.valueOf(r24)
                java.lang.Object r2 = r5.get(r2)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0129
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0129
                android.widget.ImageView r2 = r4.f248075a
                r5 = 2131231461(0x7f0802e5, float:1.8079004E38)
                r2.setImageResource(r5)
                goto L_0x01a2
            L_0x0129:
                android.widget.ImageView r2 = r4.f248075a
                r5 = 2131231462(0x7f0802e6, float:1.8079006E38)
                r2.setImageResource(r5)
                goto L_0x01a2
            L_0x0132:
                r2 = 1
                if (r5 != r2) goto L_0x0198
                r2 = 1045220557(0x3e4ccccd, float:0.2)
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r15.mo10233c(r2)
                java.lang.Object[] r6 = r15.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setAlpha"
                java.lang.String r12 = "(F)V"
                r5 = r3
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r2 = r15.mo10231a(r14)
                java.lang.Float r2 = (java.lang.Float) r2
                float r2 = r2.floatValue()
                r3.setAlpha(r2)
                java.lang.String r6 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r7 = "getView"
                java.lang.String r8 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setAlpha"
                java.lang.String r11 = "(F)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                android.widget.ImageView r2 = r4.f248075a
                r2.setVisibility(r13)
                java.lang.String r2 = r1.f253716n
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x0192
                android.widget.TextView r2 = r4.f248076b
                r2.setVisibility(r14)
                android.widget.TextView r2 = r4.f248076b
                java.lang.String r5 = r1.f253716n
                r2.setText(r5)
                goto L_0x01a2
            L_0x0192:
                android.widget.TextView r2 = r4.f248076b
                r2.setVisibility(r13)
                goto L_0x01a2
            L_0x0198:
                android.widget.ImageView r2 = r4.f248075a
                r2.setVisibility(r13)
                android.widget.TextView r2 = r4.f248076b
                r2.setVisibility(r13)
            L_0x01a2:
                java.lang.String r2 = r1.f253714l
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x01b7
                android.widget.TextView r2 = r4.f248080f
                r2.setVisibility(r14)
                android.widget.TextView r2 = r4.f248080f
                java.lang.String r5 = r1.f253714l
                r2.setText(r5)
                goto L_0x01bc
            L_0x01b7:
                android.widget.TextView r2 = r4.f248080f
                r2.setVisibility(r13)
            L_0x01bc:
                java.lang.String r2 = r1.f253715m
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 != 0) goto L_0x01d1
                android.widget.TextView r2 = r4.f248081g
                r2.setVisibility(r14)
                android.widget.TextView r2 = r4.f248081g
                java.lang.String r5 = r1.f253715m
                r2.setText(r5)
                goto L_0x01d6
            L_0x01d1:
                android.widget.TextView r2 = r4.f248081g
                r2.setVisibility(r13)
            L_0x01d6:
                java.lang.String r2 = r1.f253714l
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0229
                java.lang.String r1 = r1.f253715m
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x0229
                android.view.View r1 = r4.f248079e
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
                r2.mo10233c(r4)
                java.lang.Object[] r6 = r2.mo10232b()
                java.lang.String r7 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r8 = "getView"
                java.lang.String r9 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r10 = "android/view/View_EXEC_"
                java.lang.String r11 = "setVisibility"
                java.lang.String r12 = "(I)V"
                r5 = r1
                j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
                java.lang.Object r2 = r2.mo10231a(r14)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r1.setVisibility(r2)
                java.lang.String r6 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r7 = "getView"
                java.lang.String r8 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r9 = "android/view/View_EXEC_"
                java.lang.String r10 = "setVisibility"
                java.lang.String r11 = "(I)V"
                j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0273
            L_0x0229:
                android.view.View r12 = r4.f248079e
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
                r1.mo10233c(r2)
                java.lang.Object[] r16 = r1.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r18 = "getView"
                java.lang.String r19 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r12
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r1 = r1.mo10231a(r14)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r12.setVisibility(r1)
                java.lang.String r13 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI$CardInvoiceAdapter"
                java.lang.String r14 = "getView"
                java.lang.String r15 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x0273
            L_0x026c:
                java.lang.String r1 = "MicroMsg.CardListSelectedUI"
                java.lang.String r2 = "not support type"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            L_0x0273:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.C85137h.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$i */
    public class C85138i {

        /* renamed from: a */
        public ImageView f248075a;

        /* renamed from: b */
        public TextView f248076b;

        /* renamed from: c */
        public TextView f248077c;

        /* renamed from: d */
        public TextView f248078d;

        /* renamed from: e */
        public View f248079e;

        /* renamed from: f */
        public TextView f248080f;

        /* renamed from: g */
        public TextView f248081g;

        public C85138i(CardListSelectedUI cardListSelectedUI) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardListSelectedUI$j */
    public class C85139j {

        /* renamed from: a */
        public ImageView f248082a;

        /* renamed from: b */
        public TextView f248083b;

        /* renamed from: c */
        public TextView f248084c;

        /* renamed from: d */
        public TextView f248085d;

        /* renamed from: e */
        public TextView f248086e;

        /* renamed from: f */
        public View f248087f;

        /* renamed from: g */
        public ImageView f248088g;

        public C85139j(CardListSelectedUI cardListSelectedUI) {
        }
    }

    /* renamed from: H7 */
    public final void mo118142H7() {
        if (this.f248059s) {
            Log.m105920e("MicroMsg.CardListSelectedUI", "doNetSceneGetShareCardsLayout, isDoingGetData is true");
            return;
        }
        if (this.f248058r == null) {
            this.f248060t = false;
            this.f248061u = false;
        }
        C86709a0.m107529k().f251779b.mo123455a(C88185j.CTRL_INDEX, this);
        C86709a0.m107529k().f251779b.mo123460f(new C87605i0(this.f248062v, this.f248063w, this.f248064x, this.f248065y, this.f248066z, this.f248037A, this.f248038B, this.f248039C, this.f248058r));
        mo118143I7(true);
        this.f248059s = true;
        if (this.f248040D == 1) {
            this.f248054n = true;
        }
    }

    /* renamed from: I7 */
    public void mo118143I7(boolean z) {
        if (z) {
            this.f248047d = C89779i0.m112248e(this, getString(C0966R.string.gas), false, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        C89779i0 i0Var = this.f248047d;
        if (i0Var != null && i0Var.isShowing()) {
            this.f248047d.dismiss();
            this.f248047d = null;
        }
    }

    /* renamed from: J7 */
    public final void mo118144J7(int i, String str) {
        if (this.f248045I != 8) {
            Log.m105920e("MicroMsg.CardListSelectedUI", "setResultToSDK need MM_CARD_ITEM_FROM_SCENE_OPENAPI scene, the fromscene is " + this.f248045I);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_wxapi_choose_card_from_wx_card_list", str);
        C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(this.f248062v);
        ChooseCardFromWXCardPackage.Resp resp = new ChooseCardFromWXCardPackage.Resp(bundle);
        if (appInfo != null) {
            resp.openId = appInfo.field_openId;
        }
        String str2 = this.f248043G;
        resp.transaction = str2;
        Object[] objArr = new Object[4];
        objArr[0] = this.f248062v;
        String str3 = "null appinfo";
        objArr[1] = appInfo == null ? str3 : appInfo.field_appName;
        if (appInfo != null) {
            str3 = appInfo.field_openId;
        }
        objArr[2] = str3;
        objArr[3] = str2;
        Log.m105925i("MicroMsg.CardListSelectedUI", "setResultToSDK, appid : %s, appname : %s, openid : %s, transcation : %s", objArr);
        resp.toBundle(bundle);
        Log.m105924i("MicroMsg.CardListSelectedUI", "setResultToSDK result:" + i);
        Log.m105918d("MicroMsg.CardListSelectedUI", "setResultToSDK card_list:" + str);
        if (i == -1) {
            resp.errCode = 0;
        } else {
            resp.errCode = -2;
        }
        MMessageActV2.Args args = new MMessageActV2.Args();
        args.targetPkgName = this.f248042F;
        args.bundle = bundle;
        C72688j0.m85024j(args);
        C72688j0.m85021g(bundle);
        C72688j0.m85022h(bundle);
        MMessageActV2.send(MMApplicationContext.getContext(), args);
    }

    /* renamed from: Q0 */
    public void mo23350Q0(String str, C45991n.C45994c cVar) {
    }

    /* renamed from: d2 */
    public void mo23354d2(String str, C45991n.C45994c cVar, String str2) {
        mo118143I7(false);
        if (TextUtils.isEmpty(str) || str.equals(this.f248046J.f253712j)) {
            Log.m105924i("MicroMsg.CardListSelectedUI", "onMarkFail()");
            if (TextUtils.isEmpty(str2)) {
                str2 = getString(C0966R.string.azl);
            }
            C53248d.m59683c(this, str2);
            return;
        }
        Log.m105920e("MicroMsg.CardListSelectedUI", "onMarkFail(), the mark card id is diff from current id!");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6754nm;
    }

    public void initView() {
        if (this.f248044H) {
            setMMTitle((int) C0966R.string.azg);
            setMMSubTitle((int) C0966R.string.aze);
        } else {
            setMMTitle((int) C0966R.string.azf);
        }
        setBackBtn(new C85130a());
        if (!this.f248044H) {
            addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C85131b());
            enableOptionMenu(false);
        }
        this.f248048e = (ListView) findViewById(C0966R.C0970id.avk);
        if (this.f248044H) {
            this.f248053j = new C85137h();
        } else {
            this.f248053j = new C85136g();
        }
        this.f248048e.setAdapter(this.f248053j);
        this.f248048e.setOnItemClickListener(new C85132c());
        this.f248048e.setOnScrollListener(new C85133d());
        this.f248049f = findViewById(C0966R.C0970id.bs9);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hga);
        if (this.f248044H) {
            textView.setText(getString(C0966R.string.b0k));
        }
        this.f248050g = (RelativeLayout) findViewById(C0966R.C0970id.f9n);
        this.f248051h = (TextView) findViewById(C0966R.C0970id.f_4);
        this.f248052i = (TextView) findViewById(C0966R.C0970id.f9z);
        if (this.f248044H) {
            this.f248050g.setVisibility(0);
            this.f248051h.setOnClickListener(new C85134e());
            this.f248052i.setOnClickListener(new C85135f());
            return;
        }
        this.f248050g.setVisibility(8);
    }

    /* renamed from: l6 */
    public void mo23355l6(String str, C45991n.C45994c cVar) {
        mo118143I7(false);
        if (TextUtils.isEmpty(str) || str.equals(this.f248046J.f253712j)) {
            Log.m105924i("MicroMsg.CardListSelectedUI", "onMarkSuccess()");
            Log.m105924i("MicroMsg.CardListSelectedUI", "markSucc:" + cVar.f124028b + " markCardId: " + cVar.f124029c);
            if (cVar.f124028b == 1) {
                if (TextUtils.isEmpty(cVar.f124029c) || str.equals(cVar.f124029c)) {
                    Log.m105924i("MicroMsg.CardListSelectedUI", "markCardId is same as now id!");
                } else {
                    Log.m105924i("MicroMsg.CardListSelectedUI", "markCardId is diff as now id!");
                    int i = 0;
                    while (true) {
                        if (i >= this.f248055o.size()) {
                            break;
                        } else if (this.f248055o.get(i).f253712j == cVar.f124029c) {
                            for (int i2 = 0; i2 < this.f248055o.size(); i2++) {
                                this.f248056p.put(Integer.valueOf(i2), Boolean.FALSE);
                            }
                            this.f248056p.put(Integer.valueOf(i), Boolean.TRUE);
                        } else {
                            i++;
                        }
                    }
                }
                mo118145q();
                return;
            }
            C53248d.m59683c(this, getString(C0966R.string.azm));
            return;
        }
        Log.m105920e("MicroMsg.CardListSelectedUI", "onMarkSuccess(), the mark card id is diff from current id!");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45991n Ax0 = C46153l0.Ax0();
        if (Ax0.f124017d == null) {
            Ax0.f124017d = new ArrayList();
        }
        ((ArrayList) Ax0.f124017d).add(new WeakReference(this));
        Intent intent = getIntent();
        Log.m105924i("MicroMsg.CardListSelectedUI", "initData()");
        if (intent == null) {
            Log.m105920e("MicroMsg.CardListSelectedUI", "doGetCardList()  intent == null");
            setResult(1);
            mo118144J7(1, "");
            finish();
        } else {
            this.f248045I = intent.getIntExtra("key_from_scene", 0);
            Log.m105924i("MicroMsg.CardListSelectedUI", "mFromScene:" + this.f248045I);
            this.f248062v = intent.getStringExtra("app_id");
            this.f248063w = intent.getIntExtra("shop_id", 0);
            this.f248064x = intent.getStringExtra("sign_type");
            this.f248065y = intent.getStringExtra("card_sign");
            this.f248066z = intent.getIntExtra("time_stamp", 0);
            this.f248037A = intent.getStringExtra("nonce_str");
            this.f248038B = intent.getStringExtra("card_tp_id");
            this.f248039C = intent.getStringExtra("card_type");
            this.f248040D = intent.getIntExtra("can_multi_select", 0);
            this.f248042F = intent.getStringExtra("key_package_name");
            this.f248043G = intent.getStringExtra("key_transaction");
            Log.m105924i("MicroMsg.CardListSelectedUI", "app_id:" + this.f248062v + " shop_id:" + this.f248063w + " sign_type:" + this.f248064x + " time_stamp:" + this.f248066z);
            Log.m105924i("MicroMsg.CardListSelectedUI", "nonce_str:" + this.f248037A + " card_tp_id:" + this.f248038B + " card_type:" + this.f248039C + " canMultiSelect:" + this.f248040D + " packateName:" + this.f248042F);
            if ("INVOICE".equalsIgnoreCase(this.f248039C)) {
                this.f248044H = true;
            }
            if (TextUtils.isEmpty(this.f248062v)) {
                Log.m105920e("MicroMsg.CardListSelectedUI", "doGetCardList()  app_id is nulls");
                setResult(1);
                mo118144J7(1, "app_id  or card_sign is empty!");
                finish();
            }
        }
        mo118142H7();
        initView();
    }

    public void onDestroy() {
        C46153l0.Ax0().mo71401f(this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            setResult(0);
            mo118144J7(0, "");
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[SYNTHETIC, Splitter:B:15:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b A[SYNTHETIC, Splitter:B:21:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r10, int r11, java.lang.String r12, ob0.C117747y r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof hz0.C87605i0
            if (r0 == 0) goto L_0x01ce
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 1059(0x423, float:1.484E-42)
            r0.mo123470p(r1, r9)
            r0 = 0
            r9.mo118143I7(r0)
            if (r10 != 0) goto L_0x0130
            if (r11 != 0) goto L_0x0130
            hz0.i0 r13 = (hz0.C87605i0) r13
            java.lang.String r10 = r13.f253721f
            java.lang.String r11 = "MicroMsg.CardListSelectedUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r10)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r1 = "MicroMsg.AvailableCardItem"
            java.lang.String r2 = ""
            r3 = 0
            if (r12 == 0) goto L_0x002d
        L_0x002b:
            r12 = r3
            goto L_0x0044
        L_0x002d:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003d }
            r12.<init>(r10)     // Catch:{ JSONException -> 0x003d }
            java.lang.String r4 = "available_cards"
            org.json.JSONArray r12 = r12.optJSONArray(r4)     // Catch:{ JSONException -> 0x003d }
            java.util.LinkedList r12 = hz0.C87604a.m108956a(r12, r0)     // Catch:{ JSONException -> 0x003d }
            goto L_0x0044
        L_0x003d:
            r12 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r12, r2, r4)
            goto L_0x002b
        L_0x0044:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            r5 = 1
            if (r4 == 0) goto L_0x004d
        L_0x004b:
            r1 = r3
            goto L_0x0064
        L_0x004d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005d }
            r4.<init>(r10)     // Catch:{ JSONException -> 0x005d }
            java.lang.String r6 = "available_share_cards"
            org.json.JSONArray r4 = r4.optJSONArray(r6)     // Catch:{ JSONException -> 0x005d }
            java.util.LinkedList r1 = hz0.C87604a.m108956a(r4, r5)     // Catch:{ JSONException -> 0x005d }
            goto L_0x0064
        L_0x005d:
            r4 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r2, r6)
            goto L_0x004b
        L_0x0064:
            boolean r4 = android.text.TextUtils.isEmpty(r10)
            if (r4 == 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0078 }
            r4.<init>(r10)     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r10 = "rule_url"
            java.lang.String r3 = r4.optString(r10)     // Catch:{ JSONException -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r10 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r2, r4)
        L_0x007e:
            r9.f248041E = r3
            pe3.b r10 = r9.f248058r
            if (r10 != 0) goto L_0x0092
            if (r12 != 0) goto L_0x0088
            if (r1 == 0) goto L_0x0092
        L_0x0088:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r10 = r9.f248056p
            r10.clear()
            java.util.LinkedList<hz0.a> r10 = r9.f248055o
            r10.clear()
        L_0x0092:
            if (r12 == 0) goto L_0x00e4
            int r10 = r12.size()
            if (r10 <= 0) goto L_0x00c3
            boolean r10 = r9.f248060t
            if (r10 != 0) goto L_0x00c3
            r9.f248060t = r5
            boolean r10 = r9.f248044H
            if (r10 == 0) goto L_0x00b4
            java.lang.Object r10 = r12.get(r0)
            hz0.a r10 = (hz0.C87604a) r10
            r11 = 2131823180(0x7f110a4c, float:1.9279152E38)
            java.lang.String r11 = r9.getString(r11)
            r10.f253718p = r11
            goto L_0x00c3
        L_0x00b4:
            java.lang.Object r10 = r12.get(r0)
            hz0.a r10 = (hz0.C87604a) r10
            r11 = 2131823179(0x7f110a4b, float:1.927915E38)
            java.lang.String r11 = r9.getString(r11)
            r10.f253718p = r11
        L_0x00c3:
            java.util.LinkedList<hz0.a> r10 = r9.f248055o
            int r10 = r10.size()
            java.util.LinkedList<hz0.a> r11 = r9.f248055o
            r11.addAll(r12)
        L_0x00ce:
            java.util.LinkedList<hz0.a> r11 = r9.f248055o
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x00e4
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r11 = r9.f248056p
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r11.put(r12, r2)
            int r10 = r10 + 1
            goto L_0x00ce
        L_0x00e4:
            if (r1 == 0) goto L_0x0122
            int r10 = r1.size()
            if (r10 <= 0) goto L_0x0101
            boolean r10 = r9.f248061u
            if (r10 != 0) goto L_0x0101
            r9.f248061u = r5
            java.lang.Object r10 = r1.get(r0)
            hz0.a r10 = (hz0.C87604a) r10
            r11 = 2131823025(0x7f1109b1, float:1.9278838E38)
            java.lang.String r11 = r9.getString(r11)
            r10.f253718p = r11
        L_0x0101:
            java.util.LinkedList<hz0.a> r10 = r9.f248055o
            int r10 = r10.size()
            java.util.LinkedList<hz0.a> r11 = r9.f248055o
            r11.addAll(r1)
        L_0x010c:
            java.util.LinkedList<hz0.a> r11 = r9.f248055o
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x0122
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r11 = r9.f248056p
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r11.put(r12, r1)
            int r10 = r10 + 1
            goto L_0x010c
        L_0x0122:
            boolean r10 = r13.f253723h
            r9.f248057q = r10
            pe3.b r10 = r13.f253722g
            r9.f248058r = r10
            android.widget.BaseAdapter r10 = r9.f248053j
            r10.notifyDataSetChanged()
            goto L_0x0133
        L_0x0130:
            wz0.C53248d.m59684d(r9, r12, r11)
        L_0x0133:
            java.util.LinkedList<hz0.a> r10 = r9.f248055o
            int r10 = r10.size()
            r11 = 8
            if (r10 == 0) goto L_0x0185
            android.view.View r10 = r9.f248049f
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r11)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r10
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = r12.mo10231a(r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r2 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ListView r10 = r9.f248048e
            r10.setVisibility(r0)
            goto L_0x01cc
        L_0x0185:
            android.view.View r10 = r9.f248049f
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12.mo10233c(r13)
            java.lang.Object[] r2 = r12.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI"
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r10
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r12 = r12.mo10231a(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10.setVisibility(r12)
            java.lang.String r2 = "com/tencent/mm/plugin/card/ui/CardListSelectedUI"
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.widget.ListView r10 = r9.f248048e
            r10.setVisibility(r11)
        L_0x01cc:
            r9.f248059s = r0
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.CardListSelectedUI.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: q */
    public final void mo118145q() {
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f248055o.size(); i++) {
            Boolean bool = this.f248056p.get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                arrayList.add(this.f248055o.get(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            C87604a aVar = (C87604a) arrayList.get(i2);
            sb.append("{");
            sb.append("\"card_id\":");
            sb.append(FastJsonResponse.QUOTE + aVar.f253703a + FastJsonResponse.QUOTE);
            sb.append(",");
            sb.append("\"encrypt_code\":");
            sb.append(FastJsonResponse.QUOTE + aVar.f253709g + FastJsonResponse.QUOTE);
            if (this.f248044H) {
                sb.append(",");
                sb.append("\"app_id\":");
                sb.append(FastJsonResponse.QUOTE + aVar.f253711i + FastJsonResponse.QUOTE);
            }
            sb.append("}");
        }
        sb.append("]");
        String sb4 = sb.toString();
        if (this.f248044H) {
            intent.putExtra("choose_invoice_info", sb4);
        } else {
            intent.putExtra("choose_card_info", sb4);
        }
        setResult(-1, intent);
        mo118144J7(-1, sb4);
        finish();
    }
}
