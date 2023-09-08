package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39552d;
import af2.C67033e;
import af2.C67035g;
import af2.C67036o;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import bf2.C39768m;
import bf2.C67224c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.product.p087ui.MallProductHelper;
import com.tencent.p014mm.plugin.product.p087ui.MallProductSelectAmountView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.LinkedList;
import p755xs.C102720b;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI */
public class MallProductSelectSkuUI extends MallBaseUI implements C102720b.C78973a {

    /* renamed from: t */
    public static final /* synthetic */ int f202290t = 0;

    /* renamed from: e */
    public ImageView f202291e;

    /* renamed from: f */
    public TextView f202292f;

    /* renamed from: g */
    public TextView f202293g;

    /* renamed from: h */
    public TextView f202294h;

    /* renamed from: i */
    public Button f202295i;

    /* renamed from: j */
    public ListView f202296j;

    /* renamed from: n */
    public MallProductSelectAmountView f202297n = null;

    /* renamed from: o */
    public C70116n f202298o = null;

    /* renamed from: p */
    public C67033e f202299p;

    /* renamed from: q */
    public C67036o f202300q;

    /* renamed from: r */
    public C67035g f202301r;

    /* renamed from: s */
    public MallProductHelper f202302s;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI$a */
    public class C70081a implements MallProductHelper.C70078a {
        public C70081a() {
        }

        /* renamed from: a */
        public void mo96460a(int i, int i2, String str) {
            if (i == 0 && i2 == 0) {
                MallProductSelectSkuUI mallProductSelectSkuUI = MallProductSelectSkuUI.this;
                int i3 = MallProductSelectSkuUI.f202290t;
                mallProductSelectSkuUI.mo96468H7();
                return;
            }
            MallProductSelectSkuUI mallProductSelectSkuUI2 = MallProductSelectSkuUI.this;
            mallProductSelectSkuUI2.f202266d = str;
            mallProductSelectSkuUI2.showDialog(-10001);
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI$b */
    public class C70082b implements AdapterView.OnItemClickListener {
        public C70082b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: af2.g} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
                r0.add(r8)
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.Object r8 = r9.getTag()
                android.util.Pair r8 = (android.util.Pair) r8
                com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI r9 = com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.this
                af2.e r10 = r9.f202299p
                java.lang.Object r11 = r8.first
                java.lang.String r11 = (java.lang.String) r11
                java.lang.Object r8 = r8.second
                java.lang.String r8 = (java.lang.String) r8
                r10.getClass()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r0 = "selectSkuInfo ("
                r12.append(r0)
                r12.append(r11)
                java.lang.String r0 = " , "
                r12.append(r0)
                r12.append(r8)
                java.lang.String r0 = ")"
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                java.lang.String r1 = "MicroMsg.MallProductManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r12)
                java.util.Map<java.lang.String, java.lang.String> r12 = r10.f192546o
                java.util.HashMap r12 = (java.util.HashMap) r12
                boolean r12 = r12.containsKey(r11)
                r2 = 0
                if (r12 == 0) goto L_0x00a0
                java.util.Map<java.lang.String, java.lang.String> r12 = r10.f192546o
                java.util.HashMap r12 = (java.util.HashMap) r12
                java.lang.Object r12 = r12.get(r11)
                java.lang.String r12 = (java.lang.String) r12
                boolean r12 = r12.equals(r8)
                if (r12 == 0) goto L_0x00a0
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f192546o
                java.util.HashMap r8 = (java.util.HashMap) r8
                r8.remove(r11)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f192546o
                java.lang.String r8 = af2.C67033e.m79195m(r8)
                r10.f192538g = r8
                java.util.Map<java.lang.String, af2.g> r11 = r10.f192545n
                if (r11 == 0) goto L_0x009d
                java.util.HashMap r11 = (java.util.HashMap) r11
                java.lang.Object r8 = r11.get(r8)
                r2 = r8
                af2.g r2 = (af2.C67035g) r2
            L_0x009d:
                r10.f192549r = r2
                goto L_0x00d8
            L_0x00a0:
                java.util.Map<java.lang.String, java.lang.String> r12 = r10.f192546o
                java.util.HashMap r12 = (java.util.HashMap) r12
                r12.put(r11, r8)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f192546o
                java.lang.String r8 = af2.C67033e.m79195m(r8)
                r10.f192538g = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r11 = "getSkuInfoId ("
                r8.append(r11)
                java.lang.String r11 = r10.f192538g
                r8.append(r11)
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r8)
                java.util.Map<java.lang.String, af2.g> r8 = r10.f192545n
                if (r8 == 0) goto L_0x00dd
                java.lang.String r11 = r10.f192538g
                java.util.HashMap r8 = (java.util.HashMap) r8
                java.lang.Object r8 = r8.get(r11)
                af2.g r8 = (af2.C67035g) r8
                r10.f192549r = r8
            L_0x00d8:
                r10.mo91018v()
                af2.g r2 = r10.f192549r
            L_0x00dd:
                r9.f202301r = r2
                com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI r8 = com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.this
                r8.mo96468H7()
                java.lang.String r8 = "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$2"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.C70082b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI$c */
    public class C70083c implements MallProductSelectAmountView.C70080a {
        public C70083c() {
        }

        /* renamed from: a */
        public void mo96470a(int i) {
            MallProductSelectSkuUI mallProductSelectSkuUI = MallProductSelectSkuUI.this;
            mallProductSelectSkuUI.f202299p.f192537f = i;
            mallProductSelectSkuUI.f202294h.setVisibility(8);
        }

        /* renamed from: b */
        public void mo96471b(int i, int i2) {
            if (i2 == 1) {
                MallProductSelectSkuUI.this.f202294h.setText(C0966R.string.f361017go2);
                MallProductSelectSkuUI.this.f202294h.setVisibility(0);
            } else if (i2 == 3) {
                MallProductSelectSkuUI mallProductSelectSkuUI = MallProductSelectSkuUI.this;
                mallProductSelectSkuUI.f202294h.setText(mallProductSelectSkuUI.getString(C0966R.string.f361018go3, new Object[]{Integer.valueOf(i)}));
                MallProductSelectSkuUI.this.f202294h.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI$d */
    public class C70084d implements View.OnClickListener {
        public C70084d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI r8 = com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.this
                com.tencent.mm.plugin.product.ui.MallProductHelper r8 = r8.f202302s
                boolean r0 = r8.f202271e
                r1 = 1
                if (r0 == 0) goto L_0x0033
                android.app.Activity r8 = r8.f202270d
                r0 = 2131832714(0x7f112f8a, float:1.929849E38)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (int) r0, (int) r1)
                r8.show()
                goto L_0x00b9
            L_0x0033:
                af2.e r0 = r8.f202273g
                boolean r0 = r0.mo90998a()
                if (r0 == 0) goto L_0x0066
                af2.e r0 = r8.f202273g
                te3.b4 r0 = r0.f192540i
                if (r0 == 0) goto L_0x005b
                f40.C86709a0.m107528h()
                f40.g r0 = f40.C86709a0.m107529k()
                ob0.b0 r0 = r0.f251779b
                af2.l r1 = new af2.l
                af2.e r8 = r8.f202273g
                java.util.LinkedList r8 = r8.mo91006i()
                int r2 = com.tencent.p014mm.plugin.product.p087ui.MallProductHelper.f202269j
                r1.<init>(r8, r2)
                r0.mo123460f(r1)
                goto L_0x00b9
            L_0x005b:
                android.app.Activity r8 = r8.f202270d
                r0 = 2
                java.lang.String r1 = "address"
                java.lang.String r2 = ".ui.WalletAddAddressUI"
                ke3.C88144b.m109794l(r8, r1, r2, r0)
                goto L_0x00b9
            L_0x0066:
                af2.e r0 = r8.f202273g
                java.util.Map<java.lang.String, java.lang.String> r2 = r0.f192546o
                if (r2 == 0) goto L_0x009d
                java.util.HashMap r2 = (java.util.HashMap) r2
                int r2 = r2.size()
                int r3 = r0.f192544m
                if (r2 >= r3) goto L_0x009d
                if (r3 <= 0) goto L_0x009d
                af2.o r2 = r0.f192533b
                bf2.c r2 = r2.f192558e
                java.util.LinkedList<bf2.m> r2 = r2.f193037t
                java.util.Iterator r2 = r2.iterator()
            L_0x0082:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x009d
                java.lang.Object r3 = r2.next()
                bf2.m r3 = (bf2.C39768m) r3
                java.util.Map<java.lang.String, java.lang.String> r4 = r0.f192546o
                java.lang.String r5 = r3.f106723d
                java.util.HashMap r4 = (java.util.HashMap) r4
                boolean r4 = r4.containsKey(r5)
                if (r4 != 0) goto L_0x0082
                java.lang.String r0 = r3.f106724e
                goto L_0x009e
            L_0x009d:
                r0 = 0
            L_0x009e:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x00b9
                android.app.Activity r8 = r8.f202270d
                r2 = 2131832723(0x7f112f93, float:1.9298508E38)
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3 = 0
                r1[r3] = r0
                java.lang.String r0 = r8.getString(r2, r1)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r3)
                r8.show()
            L_0x00b9:
                java.lang.String r8 = "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.MallProductSelectSkuUI.C70084d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI$e */
    public class C70085e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f202307d;

        public C70085e(Bitmap bitmap) {
            this.f202307d = bitmap;
        }

        public void run() {
            MallProductSelectSkuUI.this.f202291e.setImageBitmap(this.f202307d);
        }
    }

    /* renamed from: H7 */
    public final void mo96468H7() {
        C67224c cVar;
        Class cls = C102720b.class;
        C67036o oVar = this.f202300q;
        if (oVar != null) {
            C67035g gVar = this.f202301r;
            if (gVar == null || (cVar = oVar.f192558e) == null) {
                TextView textView = this.f202293g;
                C67224c cVar2 = oVar.f192558e;
                textView.setText(C39552d.m42186c(cVar2.f193027g, cVar2.f193028h, cVar2.f193040w));
            } else {
                this.f202293g.setText(C39552d.m42186c(gVar.f192552i, gVar.f192553j, cVar.f193040w));
            }
            C67224c cVar3 = this.f202300q.f192558e;
            if (cVar3 != null) {
                this.f202292f.setText(cVar3.f193024d);
            }
        }
        if (!Util.isNullOrNil(this.f202299p.mo91002e())) {
            this.f202291e.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C70106c(this.f202299p.mo91002e())));
            ((C102720b) C86312j.m106911c(cls)).Lu0(this);
        }
        this.f202294h.setVisibility(8);
        MallProductSelectAmountView mallProductSelectAmountView = this.f202297n;
        int g = this.f202299p.mo91004g();
        int i = this.f202299p.f192533b.f192557d;
        if (g > i) {
            mallProductSelectAmountView.f202286h = 3;
            mallProductSelectAmountView.f202285g = i;
        } else {
            mallProductSelectAmountView.f202286h = 1;
            mallProductSelectAmountView.f202285g = g;
        }
        mallProductSelectAmountView.mo96462a();
        MallProductSelectAmountView.C70080a aVar = mallProductSelectAmountView.f202289n;
        if (aVar != null) {
            ((C70083c) aVar).mo96470a(mallProductSelectAmountView.f202288j);
        }
        this.f202298o.notifyDataSetChanged();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.boa;
    }

    public void initView() {
        C67224c cVar;
        LinkedList<C39768m> linkedList;
        setMMTitle((int) C0966R.string.go7);
        this.f202291e = (ImageView) findViewById(C0966R.C0970id.gmv);
        this.f202292f = (TextView) findViewById(C0966R.C0970id.gmz);
        this.f202293g = (TextView) findViewById(C0966R.C0970id.gmx);
        this.f202294h = (TextView) findViewById(C0966R.C0970id.gmu);
        this.f202295i = (Button) findViewById(C0966R.C0970id.gmw);
        this.f202296j = (ListView) findViewById(C0966R.C0970id.f358712gn2);
        MallProductSelectAmountView mallProductSelectAmountView = (MallProductSelectAmountView) findViewById(C0966R.C0970id.j94);
        this.f202297n = mallProductSelectAmountView;
        mallProductSelectAmountView.setAmount(this.f202299p.f192537f);
        C70116n nVar = new C70116n(this);
        this.f202298o = nVar;
        C67036o oVar = this.f202300q;
        if (oVar == null || (cVar = oVar.f192558e) == null || (linkedList = cVar.f193037t) == null) {
            Log.m105920e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
        } else {
            nVar.f202399e = linkedList;
        }
        C70116n nVar2 = this.f202298o;
        nVar2.f202400f = new C70082b();
        this.f202296j.setAdapter(nVar2);
        this.f202297n.setOnAmountChangeListener(new C70083c());
        this.f202295i.setOnClickListener(new C70084d());
        this.f202291e.setFocusable(true);
        this.f202291e.setFocusableInTouchMode(true);
        this.f202291e.requestFocus();
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", bitmap = ");
        sb.append(bitmap == null);
        Log.m105918d("MicroMsg.MallProductSelectSkuUI", sb.toString());
        if (!Util.isNullOrNil(this.f202299p.mo91002e())) {
            this.f202291e.post(new C70085e(bitmap));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f202302s.mo96457b(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f202302s = new MallProductHelper(getContext(), new C70081a());
        C67033e wx02 = C79322b.vx0().wx0();
        this.f202299p = wx02;
        this.f202300q = wx02.f192533b;
        initView();
        mo96468H7();
    }

    public void onStart() {
        this.f202302s.mo96458c();
        super.onStart();
    }

    public void onStop() {
        this.f202302s.mo96459d();
        super.onStop();
    }
}
