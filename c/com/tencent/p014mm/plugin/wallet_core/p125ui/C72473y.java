package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletChangeBankcardUI;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.FavourLayout;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.y */
public class C72473y extends BaseAdapter {

    /* renamed from: d */
    public Context f210817d;

    /* renamed from: e */
    public ArrayList<Bankcard> f210818e;

    /* renamed from: f */
    public int f210819f;

    /* renamed from: g */
    public Orders f210820g;

    /* renamed from: h */
    public String f210821h = "";

    /* renamed from: i */
    public BankcardLogoHelper f210822i;

    /* renamed from: j */
    public boolean f210823j = true;

    /* renamed from: n */
    public boolean f210824n = false;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.y$a */
    public class C72474a implements View.OnClickListener {
        public C72474a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof String) {
                Intent intent = new Intent();
                String str = (String) view.getTag();
                Log.m105925i("MicroMsg.WalletChangeBankcardAdapter", "go to url %s", str);
                intent.putExtra("rawUrl", str);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                intent.putExtra("pay_channel", 1);
                Context context = C72473y.this.f210817d;
                int i = WalletChangeBankcardUI.f208532z;
                C75228t.m90218K(context, intent, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.y$b */
    public class C72475b {

        /* renamed from: a */
        public TextView f210826a;

        /* renamed from: b */
        public TextView f210827b;

        /* renamed from: c */
        public FavourLayout f210828c;

        /* renamed from: d */
        public CdnImageView f210829d;

        /* renamed from: e */
        public View f210830e;

        /* renamed from: f */
        public ImageView f210831f;

        /* renamed from: g */
        public ImageView f210832g;

        public C72475b(C72473y yVar) {
        }
    }

    public C72473y(Context context, ArrayList<Bankcard> arrayList, int i, Orders orders) {
        this.f210817d = context;
        this.f210818e = arrayList;
        this.f210819f = i;
        this.f210820g = orders;
        BankcardLogoHelper bankcardLogoHelper = new BankcardLogoHelper();
        this.f210822i = bankcardLogoHelper;
        bankcardLogoHelper.mo99892c(this.f210817d, this.f210818e);
        if (orders != null && orders.f209551T == 1) {
            this.f210824n = true;
        }
    }

    /* renamed from: a */
    public Bankcard getItem(int i) {
        if (this.f210824n) {
            return this.f210818e.get(i);
        }
        int count = getCount();
        Orders orders = this.f210820g;
        if (orders == null || !orders.f209536G.equals("CFT")) {
            count--;
        }
        if (i < count) {
            return this.f210818e.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public void mo99881b(ArrayList<Bankcard> arrayList, boolean z) {
        if (arrayList == null) {
            this.f210818e = new ArrayList<>();
        } else {
            this.f210818e = arrayList;
        }
        this.f210823j = z;
        if (this.f210818e.size() > 0) {
            this.f210822i.mo99892c(this.f210817d, this.f210818e);
        }
        notifyDataSetChanged();
    }

    public int getCount() {
        int i = 0;
        if (this.f210824n) {
            ArrayList<Bankcard> arrayList = this.f210818e;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }
        Orders orders = this.f210820g;
        if (orders == null || !orders.f209536G.equals("CFT")) {
            i = 1;
        }
        ArrayList<Bankcard> arrayList2 = this.f210818e;
        return arrayList2 != null ? i + arrayList2.size() : i;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.tencent.mm.plugin.wallet_core.ui.y$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = 0
            java.lang.String r2 = ""
            if (r19 != 0) goto L_0x0069
            android.content.Context r3 = r0.f210817d
            r4 = 2131498208(0x7f0c14e0, float:1.862003E38)
            android.view.View r3 = android.view.View.inflate(r3, r4, r1)
            com.tencent.mm.plugin.wallet_core.ui.y$b r4 = new com.tencent.mm.plugin.wallet_core.ui.y$b
            r4.<init>(r0)
            r5 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f210826a = r5
            r5 = 2131314717(0x7f09481d, float:1.8247867E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.f210827b = r5
            r5 = 2131297626(0x7f09055a, float:1.8213202E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r5
            r4.f210829d = r5
            r5 = 2131302257(0x7f091771, float:1.8222595E38)
            android.view.View r5 = r3.findViewById(r5)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r5 = (com.tencent.p014mm.plugin.wallet_core.p125ui.view.FavourLayout) r5
            r4.f210828c = r5
            r5 = 2131316899(0x7f0950a3, float:1.8252293E38)
            android.view.View r5 = r3.findViewById(r5)
            r4.f210830e = r5
            r5 = 2131297680(0x7f090590, float:1.8213312E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f210831f = r5
            r5 = 2131310102(0x7f093616, float:1.8238507E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.f210832g = r5
            android.widget.TextView r5 = r4.f210827b
            r5.setText(r2)
            r3.setTag(r4)
            goto L_0x0072
        L_0x0069:
            java.lang.Object r3 = r19.getTag()
            r4 = r3
            com.tencent.mm.plugin.wallet_core.ui.y$b r4 = (com.tencent.p014mm.plugin.wallet_core.p125ui.C72473y.C72475b) r4
            r3 = r19
        L_0x0072:
            int r5 = r17.getCount()
            r6 = 1
            int r5 = r5 - r6
            r7 = 0
            r8 = r18
            if (r8 != r5) goto L_0x009c
            android.view.View r5 = r4.f210830e
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r9 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L_0x00ba
            r9 = r5
            android.widget.LinearLayout$LayoutParams r9 = (android.widget.LinearLayout.LayoutParams) r9
            r9.leftMargin = r7
            android.content.Context r10 = r0.f210817d
            r11 = 16
            int r10 = kg3.C76577a.m92151b(r10, r11)
            r9.bottomMargin = r10
            android.view.View r9 = r4.f210830e
            r9.setLayoutParams(r5)
            goto L_0x00ba
        L_0x009c:
            android.view.View r5 = r4.f210830e
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r9 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L_0x00ba
            r9 = r5
            android.widget.LinearLayout$LayoutParams r9 = (android.widget.LinearLayout.LayoutParams) r9
            android.content.Context r10 = r0.f210817d
            r11 = 40
            int r10 = kg3.C76577a.m92151b(r10, r11)
            r9.leftMargin = r10
            r9.bottomMargin = r7
            android.view.View r9 = r4.f210830e
            r9.setLayoutParams(r5)
        L_0x00ba:
            android.widget.TextView r5 = r4.f210827b
            android.content.res.Resources r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r10 = 2131100909(0x7f0604ed, float:1.7814213E38)
            int r9 = r9.getColor(r10)
            r5.setTextColor(r9)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r5 = r4.f210828c
            r9 = 8
            r5.setVisibility(r9)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r17.getItem(r18)
            if (r5 != 0) goto L_0x0136
            android.widget.TextView r1 = r4.f210827b
            r1.setVisibility(r9)
            android.widget.TextView r1 = r4.f210826a
            r2 = 2131839491(0x7f114a03, float:1.9312235E38)
            r1.setText(r2)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r4.f210829d
            r1.setVisibility(r9)
            android.widget.ImageView r1 = r4.f210832g
            r1.setVisibility(r7)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r0.f210820g
            if (r2 == 0) goto L_0x011b
            y43.l r2 = r2.f209543N
            if (r2 == 0) goto L_0x011b
            y43.a r2 = r2.f232082u
            if (r2 == 0) goto L_0x011b
            y43.v r2 = r2.f191294e
            if (r2 == 0) goto L_0x011b
            java.util.LinkedList<y43.w> r2 = r2.f191306d
            java.util.Iterator r2 = r2.iterator()
        L_0x0109:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x011b
            java.lang.Object r5 = r2.next()
            y43.w r5 = (y43.C66504w) r5
            java.lang.String r5 = r5.f191307d
            r1.add(r5)
            goto L_0x0109
        L_0x011b:
            boolean r2 = r0.f210823j
            if (r2 == 0) goto L_0x041d
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x041d
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r2 = r4.f210828c
            r2.setVisibility(r7)
            android.widget.TextView r2 = r4.f210827b
            r2.setVisibility(r9)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r2 = r4.f210828c
            r2.setWording(r1)
            goto L_0x041d
        L_0x0136:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r11 = r4.f210829d
            r11.setVisibility(r7)
            android.widget.ImageView r11 = r4.f210832g
            r11.setVisibility(r9)
            android.widget.TextView r11 = r4.f210827b
            r11.setVisibility(r7)
            android.widget.TextView r11 = r4.f210827b
            r11.setText(r2)
            boolean r2 = r5.mo99392r2()
            if (r2 == 0) goto L_0x016c
            android.widget.TextView r2 = r4.f210826a
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ny.h r11 = (p629ny.C76979h) r11
            android.content.Context r12 = r0.f210817d
            java.lang.String r13 = r5.field_desc
            android.widget.TextView r14 = r4.f210826a
            float r14 = r14.getTextSize()
            android.text.SpannableString r11 = r11.yp0(r12, r13, r14)
            r2.setText(r11)
            goto L_0x0173
        L_0x016c:
            android.widget.TextView r2 = r4.f210826a
            java.lang.String r11 = r5.field_desc
            r2.setText(r11)
        L_0x0173:
            boolean r2 = r5.mo99388n2()
            r11 = 2131839131(0x7f11489b, float:1.9311505E38)
            r12 = 0
            if (r2 == 0) goto L_0x01d2
            java.lang.Class<yz.v> r2 = p281yz.C79173v.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            yz.v r2 = (p281yz.C79173v) r2
            b63.s0 r2 = r2.Ex0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.f192955h
            java.lang.String r14 = r2.f209416k2
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x019d
            android.widget.TextView r11 = r4.f210826a
            java.lang.String r2 = r2.f209416k2
            r11.setText(r2)
            goto L_0x0210
        L_0x019d:
            double r14 = r2.f209415j2
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 < 0) goto L_0x01c6
            android.widget.TextView r11 = r4.f210826a
            android.content.Context r12 = r0.f210817d
            boolean r13 = eb0.C75592q0.m90763K()
            if (r13 == 0) goto L_0x01b1
            r13 = 2131839003(0x7f11481b, float:1.9311245E38)
            goto L_0x01b4
        L_0x01b1:
            r13 = 2131839002(0x7f11481a, float:1.9311243E38)
        L_0x01b4:
            java.lang.Object[] r14 = new java.lang.Object[r6]
            double r1 = r2.f209415j2
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r1)
            r14[r7] = r1
            java.lang.String r1 = r12.getString(r13, r14)
            r11.setText(r1)
            goto L_0x0210
        L_0x01c6:
            android.widget.TextView r1 = r4.f210826a
            android.content.Context r2 = r0.f210817d
            java.lang.CharSequence r2 = r2.getText(r11)
            r1.setText(r2)
            goto L_0x0210
        L_0x01d2:
            boolean r1 = r5.mo99393s2()
            if (r1 == 0) goto L_0x0210
            java.lang.String r1 = r5.f209416k2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x01e8
            android.widget.TextView r1 = r4.f210826a
            java.lang.String r2 = r5.f209416k2
            r1.setText(r2)
            goto L_0x0210
        L_0x01e8:
            double r1 = r5.f209415j2
            int r14 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x0205
            android.widget.TextView r11 = r4.f210826a
            android.content.Context r12 = r0.f210817d
            r13 = 2131839224(0x7f1148f8, float:1.9311693E38)
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r1)
            r14[r7] = r1
            java.lang.String r1 = r12.getString(r13, r14)
            r11.setText(r1)
            goto L_0x0210
        L_0x0205:
            android.widget.TextView r1 = r4.f210826a
            android.content.Context r2 = r0.f210817d
            java.lang.CharSequence r2 = r2.getText(r11)
            r1.setText(r2)
        L_0x0210:
            android.widget.TextView r1 = r4.f210827b
            r1.setVisibility(r7)
            int r1 = r0.f210819f
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r0.f210820g
            int r1 = r5.mo99387l2(r1, r2)
            switch(r1) {
                case 1: goto L_0x026e;
                case 2: goto L_0x0265;
                case 3: goto L_0x025c;
                case 4: goto L_0x0253;
                case 5: goto L_0x024a;
                case 6: goto L_0x0241;
                case 7: goto L_0x0238;
                case 8: goto L_0x0230;
                default: goto L_0x0220;
            }
        L_0x0220:
            java.lang.String r1 = r5.field_tips
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0277
            android.widget.TextView r1 = r4.f210827b
            java.lang.String r2 = r5.field_tips
            r1.setText(r2)
            goto L_0x027c
        L_0x0230:
            android.widget.TextView r1 = r4.f210827b
            java.lang.String r2 = r5.field_forbidWord
            r1.setText(r2)
            goto L_0x027c
        L_0x0238:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839506(0x7f114a12, float:1.9312265E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x0241:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839501(0x7f114a0d, float:1.9312255E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x024a:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839495(0x7f114a07, float:1.9312243E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x0253:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839499(0x7f114a0b, float:1.9312251E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x025c:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839508(0x7f114a14, float:1.931227E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x0265:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839503(0x7f114a0f, float:1.931226E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x026e:
            android.widget.TextView r1 = r4.f210827b
            r2 = 2131839497(0x7f114a09, float:1.9312247E38)
            r1.setText(r2)
            goto L_0x027c
        L_0x0277:
            android.widget.TextView r1 = r4.f210827b
            r1.setVisibility(r9)
        L_0x027c:
            android.widget.TextView r1 = r4.f210827b
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            android.widget.TextView r2 = r4.f210826a
            android.content.Context r11 = r0.f210817d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131101252(0x7f060644, float:1.7814908E38)
            int r11 = r11.getColor(r12)
            r2.setTextColor(r11)
            boolean r2 = r17.isEnabled(r18)
            if (r2 != 0) goto L_0x02ad
            android.widget.TextView r2 = r4.f210826a
            android.content.Context r8 = r0.f210817d
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r10)
            r2.setTextColor(r8)
        L_0x02ad:
            java.lang.String r2 = r0.f210821h
            if (r2 == 0) goto L_0x02bf
            java.lang.String r8 = r5.field_bindSerial
            boolean r2 = r2.equalsIgnoreCase(r8)
            if (r2 == 0) goto L_0x02bf
            android.widget.ImageView r2 = r4.f210831f
            r2.setVisibility(r7)
            goto L_0x02c4
        L_0x02bf:
            android.widget.ImageView r2 = r4.f210831f
            r2.setVisibility(r9)
        L_0x02c4:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            r8 = 2131316711(0x7f094fe7, float:1.8251911E38)
            r10 = 0
            r2.setTag(r8, r10)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            r2.setTag(r10)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            r2.setImageDrawable(r10)
            android.widget.TextView r2 = r4.f210827b
            r2.setOnClickListener(r10)
            boolean r2 = r5.mo99388n2()
            if (r2 == 0) goto L_0x02f5
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r2 = r0.f210822i
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r4.f210829d
            r2.getClass()
            if (r6 == 0) goto L_0x033f
            r6.setTag(r8, r10)
            r2 = 2131235559(0x7f0812e7, float:1.8087315E38)
            r6.setImageResource(r2)
            goto L_0x033f
        L_0x02f5:
            boolean r2 = r5.mo99393s2()
            if (r2 == 0) goto L_0x0303
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r2 = r0.f210822i
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r4.f210829d
            r2.mo99895f(r5, r6)
            goto L_0x033f
        L_0x0303:
            boolean r2 = r5.mo99392r2()
            if (r2 == 0) goto L_0x0336
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r10 = 0
            r11 = 2131755844(0x7f100344, float:1.9142579E38)
            android.graphics.drawable.Drawable r8 = hi3.C87515a.m108835e(r8, r11, r10)
            r2.setImageDrawable(r8)
            java.lang.String r2 = r5.f209391D2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x033f
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            r2.setUseSdcardCache(r6)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            java.lang.String r6 = e63.C75556b.f221973a
            r2.setImgSavedPath(r6)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r4.f210829d
            java.lang.String r6 = r5.f209391D2
            r2.mo100288c(r6, r7, r7, r11)
            goto L_0x033f
        L_0x0336:
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r2 = r0.f210822i
            android.content.Context r6 = r0.f210817d
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r8 = r4.f210829d
            r2.mo99894e(r6, r5, r8)
        L_0x033f:
            java.lang.String r2 = r5.field_forbid_title
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03b1
            java.lang.String r2 = r5.field_forbid_url
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03b1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "  "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            java.lang.String r7 = r5.field_forbid_title
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            android.widget.TextView r6 = r4.f210827b
            com.tencent.mm.plugin.wallet_core.ui.y$a r7 = new com.tencent.mm.plugin.wallet_core.ui.y$a
            r7.<init>()
            r6.setOnClickListener(r7)
            int r6 = r1.length()
            int r1 = r1.length()
            java.lang.String r7 = r5.field_forbid_title
            int r7 = r7.length()
            int r1 = r1 + r7
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r9 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r8 = r8.getColor(r9)
            r7.<init>(r8)
            r8 = 34
            r2.setSpan(r7, r6, r1, r8)
            android.widget.TextView r1 = r4.f210827b
            r1.setText(r2)
            android.widget.TextView r1 = r4.f210827b
            java.lang.String r2 = r5.field_forbid_url
            r1.setTag(r2)
            goto L_0x041d
        L_0x03b1:
            boolean r2 = r0.f210823j
            if (r2 == 0) goto L_0x041d
            java.lang.String r2 = r5.field_forbidWord
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x041d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x041d
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r0.f210820g
            if (r2 == 0) goto L_0x0408
            y43.l r2 = r2.f209543N
            if (r2 == 0) goto L_0x0408
            y43.a r2 = r2.f232082u
            if (r2 == 0) goto L_0x0408
            java.util.LinkedList<y43.c> r2 = r2.f191293d
            java.util.Iterator r2 = r2.iterator()
        L_0x03da:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0408
            java.lang.Object r6 = r2.next()
            y43.c r6 = (y43.C66498c) r6
            java.lang.String r8 = r6.f191295d
            java.lang.String r10 = r5.field_bindSerial
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x03da
            java.util.LinkedList<y43.d> r2 = r6.f191296e
            java.util.Iterator r2 = r2.iterator()
        L_0x03f6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0408
            java.lang.Object r5 = r2.next()
            y43.d r5 = (y43.C66499d) r5
            java.lang.String r5 = r5.f191297d
            r1.add(r5)
            goto L_0x03f6
        L_0x0408:
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x041d
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r2 = r4.f210828c
            r2.setVisibility(r7)
            android.widget.TextView r2 = r4.f210827b
            r2.setVisibility(r9)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r2 = r4.f210828c
            r2.setWording(r1)
        L_0x041d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.C72473y.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean isEnabled(int i) {
        Bankcard a = getItem(i);
        return a == null || a.mo99387l2(this.f210819f, this.f210820g) == 0;
    }
}
