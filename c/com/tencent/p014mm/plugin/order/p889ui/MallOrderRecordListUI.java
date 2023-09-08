package com.tencent.p014mm.plugin.order.p889ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.base.MMLoadMoreListView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.xweb.WCWebUpdater;
import fm0.C86943h0;
import fm0.C86991y0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import nd2.C76852b;
import nd2.C76853c;
import nj3.C76879j;
import ob0.C117747y;
import pd2.C47463e;
import pd2.C62260b;
import pd2.C77081c;
import pd2.C77083g;
import pe3.C47465a;
import te3.C51374tb3;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI */
public class MallOrderRecordListUI extends WalletBaseUI {

    /* renamed from: d */
    public MMHandler f202221d = null;

    /* renamed from: e */
    public MMLoadMoreListView f202222e;

    /* renamed from: f */
    public C70069g f202223f = null;

    /* renamed from: g */
    public List<C77083g> f202224g = new ArrayList();

    /* renamed from: h */
    public boolean f202225h = true;

    /* renamed from: i */
    public int f202226i = 0;

    /* renamed from: j */
    public int f202227j = 0;

    /* renamed from: n */
    public String f202228n = null;

    /* renamed from: o */
    public boolean f202229o = false;

    /* renamed from: p */
    public boolean f202230p = false;

    /* renamed from: q */
    public Map<String, String> f202231q = new HashMap();

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$a */
    public class C70062a implements AdapterView.OnItemClickListener {
        public C70062a() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C77083g gVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MallOrderRecordListUI mallOrderRecordListUI = MallOrderRecordListUI.this;
            if (i < ((ArrayList) mallOrderRecordListUI.f202224g).size() && (gVar = (C77083g) ((ArrayList) mallOrderRecordListUI.f202224g).get(i)) != null) {
                Bundle input = mallOrderRecordListUI.getInput();
                input.putString("key_trans_id", gVar.f225149d);
                input.putInt("key_pay_type", gVar.f225157o);
                input.putString("bill_id", gVar.f225148A);
                C79143a.m95765d(mallOrderRecordListUI, input);
            }
            C75228t.m90243e0(26, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$b */
    public class C70063b implements AdapterView.OnItemLongClickListener {

        /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$b$a */
        public class C70064a implements C76879j.C11180n {

            /* renamed from: a */
            public final /* synthetic */ int f202234a;

            public C70064a(int i) {
                this.f202234a = i;
            }

            /* renamed from: j */
            public void mo782j(int i) {
                if (i == 0) {
                    C77083g gVar = (C77083g) ((ArrayList) MallOrderRecordListUI.this.f202224g).get(this.f202234a);
                    if (gVar != null) {
                        MallOrderRecordListUI.this.mo96415I7(gVar.f225149d, gVar.f225148A, 1);
                    }
                }
            }
        }

        public C70063b() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= ((ArrayList) MallOrderRecordListUI.this.f202224g).size()) {
                return true;
            }
            MallOrderRecordListUI mallOrderRecordListUI = MallOrderRecordListUI.this;
            C76879j.m92736g(mallOrderRecordListUI, mallOrderRecordListUI.getResources().getString(C0966R.string.l1d), (String[]) null, MallOrderRecordListUI.this.getResources().getString(C0966R.string.f7944x1), new C70064a(i));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$c */
    public class C70065c implements MMLoadMoreListView.C73175b {
        public C70065c() {
        }

        public void onLoadMore() {
            MallOrderRecordListUI mallOrderRecordListUI = MallOrderRecordListUI.this;
            if (!mallOrderRecordListUI.f202230p) {
                mallOrderRecordListUI.f202230p = true;
                mallOrderRecordListUI.f202227j += 10;
                mallOrderRecordListUI.mo96416J7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$d */
    public class C70066d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f202237d;

        public C70066d(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f202237d = walletGetBulletinEvent;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f202237d.f79043e.f79046a)) {
                WalletGetBulletinEvent.C28848b bVar = this.f202237d.f79043e;
                C75228t.m90247g0((View) null, (TextView) MallOrderRecordListUI.this.findViewById(C0966R.C0970id.a7l), bVar.f79046a, bVar.f79047b, bVar.f79048c);
                return;
            }
            Log.m105924i("MicroMsg.WalletOrderListUI", "no bulletin data");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$e */
    public class C70067e implements Runnable {
        public C70067e() {
        }

        public void run() {
            if (MallOrderRecordListUI.this.f202225h) {
                Log.m105926v("MicroMsg.WalletOrderListUI", "has more");
                MallOrderRecordListUI mallOrderRecordListUI = MallOrderRecordListUI.this;
                if (!mallOrderRecordListUI.f202229o) {
                    mallOrderRecordListUI.f202222e.mo101731g();
                    MallOrderRecordListUI mallOrderRecordListUI2 = MallOrderRecordListUI.this;
                    mallOrderRecordListUI2.f202222e.setAdapter(mallOrderRecordListUI2.f202223f);
                    MallOrderRecordListUI.this.f202229o = true;
                }
            } else {
                Log.m105926v("MicroMsg.WalletOrderListUI", "no more! dismiss footer view!");
                MallOrderRecordListUI.this.f202222e.mo101727b();
            }
            MallOrderRecordListUI.this.f202223f.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$f */
    public class C70068f implements Runnable {
        public C70068f() {
        }

        public void run() {
            MallOrderRecordListUI.this.f202223f.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$g */
    public class C70069g extends BaseAdapter {
        public C70069g() {
        }

        /* renamed from: a */
        public C77083g getItem(int i) {
            return MallOrderRecordListUI.this.f202224g.get(i);
        }

        public int getCount() {
            return MallOrderRecordListUI.this.f202224g.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x018f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x01ff A[SYNTHETIC, Splitter:B:29:0x01ff] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0249 A[SYNTHETIC, Splitter:B:35:0x0249] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0292  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r27, android.view.View r28, android.view.ViewGroup r29) {
            /*
                r26 = this;
                r0 = r26
                r1 = 0
                if (r28 != 0) goto L_0x006f
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r2 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                r3 = 2131496456(0x7f0c0e08, float:1.8616477E38)
                android.view.View r2 = android.view.View.inflate(r2, r3, r1)
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$h r3 = new com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$h
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r4 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                r3.<init>(r4, r1)
                r4 = 2131310617(0x7f093819, float:1.8239551E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202242a = r4
                r4 = 2131310616(0x7f093818, float:1.823955E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202244c = r4
                r4 = 2131310615(0x7f093817, float:1.8239547E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202243b = r4
                r4 = 2131310613(0x7f093815, float:1.8239543E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202245d = r4
                r4 = 2131310610(0x7f093812, float:1.8239537E38)
                android.view.View r4 = r2.findViewById(r4)
                r3.f202247f = r4
                r4 = 2131310612(0x7f093814, float:1.823954E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202248g = r4
                r4 = 2131310611(0x7f093813, float:1.8239539E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202249h = r4
                r4 = 2131310614(0x7f093816, float:1.8239545E38)
                android.view.View r4 = r2.findViewById(r4)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.f202246e = r4
                r2.setTag(r3)
                goto L_0x0078
            L_0x006f:
                java.lang.Object r2 = r28.getTag()
                r3 = r2
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$h r3 = (com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.C70070h) r3
                r2 = r28
            L_0x0078:
                pd2.g r4 = r26.getItem(r27)
                r5 = 2
                r6 = 1000(0x3e8, double:4.94E-321)
                r8 = 0
                r9 = 1
                if (r27 != 0) goto L_0x00a4
                pd2.g r1 = r0.getItem(r8)
                java.util.GregorianCalendar r10 = new java.util.GregorianCalendar
                r10.<init>()
                int r1 = r1.f225152g
                long r11 = (long) r1
                long r11 = r11 * r6
                r10.setTimeInMillis(r11)
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r1 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                int r11 = r10.get(r9)
                int r5 = r10.get(r5)
                int r5 = r5 + r9
                java.lang.String r1 = r1.mo96418L7(r11, r5)
                goto L_0x00f3
            L_0x00a4:
                pd2.g r10 = r26.getItem(r27)
                int r11 = r27 + -1
                pd2.g r11 = r0.getItem(r11)
                int r12 = r10.f225152g
                if (r12 <= 0) goto L_0x00f5
                int r12 = r11.f225152g
                if (r12 <= 0) goto L_0x00f5
                java.util.GregorianCalendar r12 = new java.util.GregorianCalendar
                r12.<init>()
                int r11 = r11.f225152g
                long r13 = (long) r11
                long r13 = r13 * r6
                r12.setTimeInMillis(r13)
                java.util.GregorianCalendar r11 = new java.util.GregorianCalendar
                r11.<init>()
                int r10 = r10.f225152g
                long r13 = (long) r10
                long r13 = r13 * r6
                r11.setTimeInMillis(r13)
                int r10 = r12.get(r9)
                int r13 = r11.get(r9)
                if (r10 != r13) goto L_0x00e4
                int r10 = r12.get(r5)
                int r12 = r11.get(r5)
                if (r10 == r12) goto L_0x00f5
            L_0x00e4:
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r1 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                int r10 = r11.get(r9)
                int r5 = r11.get(r5)
                int r5 = r5 + r9
                java.lang.String r1 = r1.mo96418L7(r10, r5)
            L_0x00f3:
                r5 = 1
                goto L_0x00f6
            L_0x00f5:
                r5 = 0
            L_0x00f6:
                java.lang.String r10 = ""
                if (r5 == 0) goto L_0x018f
                java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r11 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                r12 = 2131830397(0x7f11267d, float:1.929379E38)
                java.lang.Object[] r13 = new java.lang.Object[r9]
                r13[r8] = r10
                java.lang.String r11 = r11.getString(r12, r13)
                r5.<init>(r11)
                java.util.Date r11 = new java.util.Date
                pd2.g r12 = r26.getItem(r27)
                int r12 = r12.f225152g
                long r12 = (long) r12
                long r12 = r12 * r6
                r11.<init>(r12)
                java.lang.String r5 = r5.format(r11)
                android.widget.TextView r6 = r3.f202248g
                r6.setText(r5)
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r5 != 0) goto L_0x014c
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r5 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.f202231q
                java.util.HashMap r5 = (java.util.HashMap) r5
                java.lang.Object r5 = r5.get(r1)
                java.lang.String r5 = (java.lang.String) r5
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x014c
                android.widget.TextView r5 = r3.f202249h
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r6 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                java.util.Map<java.lang.String, java.lang.String> r6 = r6.f202231q
                java.util.HashMap r6 = (java.util.HashMap) r6
                java.lang.Object r1 = r6.get(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r5.setText(r1)
            L_0x014c:
                android.view.View r1 = r3.f202247f
                k20.a r5 = new k20.a
                r5.<init>()
                java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
                r5.mo10233c(r6)
                java.lang.Object[] r12 = r5.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$OrderListAdapter"
                java.lang.String r14 = "fillMonthInfo"
                java.lang.String r15 = "(ILcom/tencent/mm/plugin/order/ui/MallOrderRecordListUI$ViewHolder;)V"
                java.lang.String r16 = "android/view/View_EXEC_"
                java.lang.String r17 = "setVisibility"
                java.lang.String r18 = "(I)V"
                r11 = r1
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r5 = r5.mo10231a(r8)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r1.setVisibility(r5)
                java.lang.String r12 = "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$OrderListAdapter"
                java.lang.String r13 = "fillMonthInfo"
                java.lang.String r14 = "(ILcom/tencent/mm/plugin/order/ui/MallOrderRecordListUI$ViewHolder;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x01d4
            L_0x018f:
                android.view.View r1 = r3.f202247f
                r5 = 8
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6.mo10233c(r5)
                java.lang.Object[] r19 = r6.mo10232b()
                java.lang.String r20 = "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$OrderListAdapter"
                java.lang.String r21 = "fillMonthInfo"
                java.lang.String r22 = "(ILcom/tencent/mm/plugin/order/ui/MallOrderRecordListUI$ViewHolder;)V"
                java.lang.String r23 = "android/view/View_EXEC_"
                java.lang.String r24 = "setVisibility"
                java.lang.String r25 = "(I)V"
                r18 = r1
                j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
                java.lang.Object r5 = r6.mo10231a(r8)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r1.setVisibility(r5)
                java.lang.String r19 = "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI$OrderListAdapter"
                java.lang.String r20 = "fillMonthInfo"
                java.lang.String r21 = "(ILcom/tencent/mm/plugin/order/ui/MallOrderRecordListUI$ViewHolder;)V"
                java.lang.String r22 = "android/view/View_EXEC_"
                java.lang.String r23 = "setVisibility"
                java.lang.String r24 = "(I)V"
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            L_0x01d4:
                android.widget.TextView r1 = r3.f202242a
                java.lang.String r5 = r4.f225151f
                r1.setText(r5)
                android.widget.TextView r1 = r3.f202243b
                java.lang.String r5 = r4.f225153h
                r1.setText(r5)
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r1 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131101111(0x7f0605b7, float:1.7814622E38)
                int r1 = r1.getColor(r5)
                java.lang.String r5 = r4.f225166x
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                java.lang.String r6 = "Parse color exp. colortext="
                java.lang.String r7 = "MicroMsg.WalletOrderListUI"
                if (r5 != 0) goto L_0x021e
                java.lang.String r5 = r4.f225166x     // Catch:{ Exception -> 0x0206 }
                int r1 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46931b(r5, r9)     // Catch:{ Exception -> 0x0206 }
                goto L_0x021e
            L_0x0206:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                java.lang.String r11 = r4.f225166x
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            L_0x021e:
                android.widget.TextView r5 = r3.f202243b
                r5.setTextColor(r1)
                android.widget.TextView r1 = r3.f202244c
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r5 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                int r11 = r4.f225152g
                java.lang.String r5 = r5.mo96417K7(r11)
                r1.setText(r5)
                com.tencent.mm.plugin.order.ui.MallOrderRecordListUI r1 = com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.this
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r5 = 2131101113(0x7f0605b9, float:1.7814627E38)
                int r1 = r1.getColor(r5)
                java.lang.String r5 = r4.f225167y
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 != 0) goto L_0x0268
                java.lang.String r5 = r4.f225167y     // Catch:{ Exception -> 0x0250 }
                int r1 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46931b(r5, r9)     // Catch:{ Exception -> 0x0250 }
                goto L_0x0268
            L_0x0250:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r6)
                java.lang.String r6 = r4.f225167y
                java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
            L_0x0268:
                double r5 = r4.f225150e
                double r11 = r4.f225168z
                r13 = 4636737291354636288(0x4059000000000000, double:100.0)
                int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                if (r7 == 0) goto L_0x0292
                double r5 = r5 / r13
                java.lang.String r7 = r4.f225155j
                java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r7)
                android.text.SpannableString r6 = new android.text.SpannableString
                r6.<init>(r5)
                android.text.style.StrikethroughSpan r7 = new android.text.style.StrikethroughSpan
                r7.<init>()
                int r5 = r5.length()
                r9 = 33
                r6.setSpan(r7, r8, r5, r9)
                android.widget.TextView r5 = r3.f202245d
                r5.setText(r6)
                goto L_0x0297
            L_0x0292:
                android.widget.TextView r5 = r3.f202245d
                r5.setText(r10)
            L_0x0297:
                android.widget.TextView r5 = r3.f202246e
                r5.setTextColor(r1)
                android.widget.TextView r1 = r3.f202246e
                double r5 = r4.f225168z
                double r5 = r5 / r13
                java.lang.String r3 = r4.f225155j
                java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r5, r3)
                r1.setText(r3)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.C70069g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.order.ui.MallOrderRecordListUI$h */
    public class C70070h {

        /* renamed from: a */
        public TextView f202242a;

        /* renamed from: b */
        public TextView f202243b;

        /* renamed from: c */
        public TextView f202244c;

        /* renamed from: d */
        public TextView f202245d;

        /* renamed from: e */
        public TextView f202246e;

        /* renamed from: f */
        public View f202247f;

        /* renamed from: g */
        public TextView f202248g;

        /* renamed from: h */
        public TextView f202249h;

        public C70070h(MallOrderRecordListUI mallOrderRecordListUI, C70062a aVar) {
        }
    }

    /* renamed from: H7 */
    public void mo96414H7() {
        addSceneEndListener(C86943h0.CTRL_INDEX);
        addSceneEndListener(C86991y0.CTRL_INDEX);
    }

    /* renamed from: I7 */
    public void mo96415I7(String str, String str2, int i) {
        doSceneProgress(new C47463e(str, str2, i));
    }

    /* renamed from: J7 */
    public void mo96416J7() {
        doSceneProgress(new C77081c(10, this.f202227j, this.f202228n));
    }

    /* renamed from: K7 */
    public String mo96417K7(int i) {
        Pattern pattern = C75228t.f221346a;
        return C75228t.m90264p(i, new SimpleDateFormat("MM-dd HH:mm"), new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    }

    /* renamed from: L7 */
    public final String mo96418L7(int i, int i2) {
        return i + "-" + i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053 A[SYNTHETIC] */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo96419M7(java.util.List<pd2.C77083g> r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0056
            int r0 = r7.size()
            if (r0 != 0) goto L_0x0009
            goto L_0x0056
        L_0x0009:
            java.util.List<pd2.g> r0 = r6.f202224g
            if (r0 != 0) goto L_0x0014
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.f202224g = r0
        L_0x0014:
            r0 = 0
            r1 = 0
        L_0x0016:
            int r2 = r7.size()
            if (r1 >= r2) goto L_0x0056
            java.lang.Object r2 = r7.get(r1)
            pd2.g r2 = (pd2.C77083g) r2
            java.lang.String r3 = r2.f225149d
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x004c
        L_0x002c:
            r4 = 0
        L_0x002d:
            java.util.List<pd2.g> r5 = r6.f202224g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x002a
            java.util.List<pd2.g> r5 = r6.f202224g
            java.lang.Object r5 = r5.get(r4)
            pd2.g r5 = (pd2.C77083g) r5
            if (r5 == 0) goto L_0x0049
            java.lang.String r5 = r5.f225149d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0049
            r3 = 1
            goto L_0x004c
        L_0x0049:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x004c:
            if (r3 != 0) goto L_0x0053
            java.util.List<pd2.g> r3 = r6.f202224g
            r3.add(r2)
        L_0x0053:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.order.p889ui.MallOrderRecordListUI.mo96419M7(java.util.List):void");
    }

    /* renamed from: N7 */
    public void mo96420N7() {
        removeSceneEndListener(C86943h0.CTRL_INDEX);
        removeSceneEndListener(C86991y0.CTRL_INDEX);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bap;
    }

    public void initView() {
        C76853c.C76854a aVar;
        if (C79143a.m95768g(this) instanceof C76852b) {
            this.f202230p = true;
            mo96416J7();
        }
        setMMTitle((int) C0966R.string.gn5);
        this.f202222e = (MMLoadMoreListView) findViewById(C0966R.C0970id.gmd);
        C70069g gVar = new C70069g();
        this.f202223f = gVar;
        this.f202222e.setAdapter(gVar);
        this.f202222e.setOnItemClickListener(new C70062a());
        this.f202222e.setOnItemLongClickListener(new C70063b());
        this.f202222e.setOnLoadMoreListener(new C70065c());
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN;
        walletGetBulletinEvent.callback = new C70066d(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
        C76853c vx02 = C76853c.vx0();
        if (vx02.f224683g != null) {
            for (int i = 0; i < ((ArrayList) vx02.f224683g).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) vx02.f224683g).get(i);
                if (!(weakReference == null || (aVar = (C76853c.C76854a) weakReference.get()) == null)) {
                    aVar.onChange();
                }
            }
        }
        this.f202223f.notifyDataSetChanged();
        C115669n.INSTANCE.mo160131h(11036, Integer.valueOf(C76853c.vx0().wx0().mo96392b()));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f202221d = new MMHandler();
        mo96414H7();
        initView();
        this.f202227j = 0;
        this.f202228n = null;
    }

    public void onDestroy() {
        mo96420N7();
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C70069g gVar = this.f202223f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C77081c) {
            C77081c cVar = (C77081c) yVar2;
            this.f202228n = cVar.f225145g;
            mo96419M7(cVar.f225142d);
            List<C62260b> list = cVar.f225143e;
            if (list != null) {
                int i3 = 0;
                while (true) {
                    LinkedList linkedList = (LinkedList) list;
                    if (i3 >= linkedList.size()) {
                        break;
                    }
                    C62260b bVar = (C62260b) linkedList.get(i3);
                    if (bVar != null) {
                        ((HashMap) this.f202231q).put(mo96418L7(bVar.f176975d, bVar.f176976e), bVar.f176977f);
                    }
                    i3++;
                }
            }
            int size = ((ArrayList) this.f202224g).size();
            this.f202226i = size;
            this.f202225h = cVar.f225144f > size;
            this.f202223f.notifyDataSetChanged();
            Log.m105918d("MicroMsg.WalletOrderListUI", "orders list count: " + this.f202226i);
            Log.m105918d("MicroMsg.WalletOrderListUI", "orders list total record: " + cVar.f225144f);
            Log.m105918d("MicroMsg.WalletOrderListUI", "orders list has more: " + this.f202225h);
            this.f202221d.post(new C70067e());
            this.f202230p = false;
        } else if (yVar2 instanceof C47463e) {
            C47465a aVar = ((C47463e) yVar2).f127312e.f127055a.f127080a;
            if (((C51374tb3) aVar).f142103d == 2) {
                List<C77083g> list2 = this.f202224g;
                if (list2 != null) {
                    ((ArrayList) list2).clear();
                }
                this.f202226i = 0;
                this.f202225h = false;
                this.f202222e.mo101727b();
            } else {
                String str2 = ((C51374tb3) aVar).f142104e;
                Log.m105918d("MicroMsg.WalletOrderListUI", "delete transId:" + str2);
                if (!Util.isNullOrNil(str2)) {
                    Iterator it = ((ArrayList) this.f202224g).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C77083g gVar = (C77083g) it.next();
                        if (str2.equals(gVar.f225149d)) {
                            ((ArrayList) this.f202224g).remove(gVar);
                            this.f202226i = ((ArrayList) this.f202224g).size();
                            break;
                        }
                    }
                }
            }
            this.f202221d.post(new C70068f());
        }
        if (this.f202226i > 0 || ((ArrayList) this.f202224g).size() != 0) {
            showOptionMenu(true);
            View findViewById = findViewById(C0966R.C0970id.cj8);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            showOptionMenu(false);
            View findViewById2 = findViewById(C0966R.C0970id.cj8);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/order/ui/MallOrderRecordListUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }
}
