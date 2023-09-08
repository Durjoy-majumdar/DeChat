package com.tencent.p014mm.plugin.product.p087ui;

import af2.C39552d;
import af2.C39558m;
import af2.C39559n;
import af2.C67033e;
import af2.C67035g;
import af2.C67036o;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bf2.C67225n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.ListViewInScrollView;
import com.tencent.p014mm.plugin.product.p087ui.MallProductHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ob0.C89137b0;
import p755xs.C102720b;
import qo3.C77389a;
import qo3.C77398g;
import te3.C49254ea0;
import te3.c64;
import ze2.C79322b;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI */
public class MallProductSubmitUI extends MallBaseUI implements C102720b.C78973a {

    /* renamed from: z */
    public static final /* synthetic */ int f202309z = 0;

    /* renamed from: e */
    public RelativeLayout f202310e;

    /* renamed from: f */
    public TextView f202311f;

    /* renamed from: g */
    public TextView f202312g;

    /* renamed from: h */
    public MallProductItemView f202313h;

    /* renamed from: i */
    public MallProductItemView f202314i;

    /* renamed from: j */
    public ImageView f202315j;

    /* renamed from: n */
    public TextView f202316n;

    /* renamed from: o */
    public TextView f202317o;

    /* renamed from: p */
    public TextView f202318p;

    /* renamed from: q */
    public TextView f202319q;

    /* renamed from: r */
    public TextView f202320r;

    /* renamed from: s */
    public TextView f202321s;

    /* renamed from: t */
    public ListView f202322t;

    /* renamed from: u */
    public C70104a f202323u;

    /* renamed from: v */
    public Button f202324v;

    /* renamed from: w */
    public C67033e f202325w;

    /* renamed from: x */
    public C67035g f202326x;

    /* renamed from: y */
    public MallProductHelper f202327y;

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$a */
    public class C70086a implements MallProductHelper.C70078a {
        public C70086a() {
        }

        /* renamed from: a */
        public void mo96460a(int i, int i2, String str) {
            if (i == 0 && i2 == 0) {
                MallProductSubmitUI mallProductSubmitUI = MallProductSubmitUI.this;
                int i3 = MallProductSubmitUI.f202309z;
                mallProductSubmitUI.mo96474H7();
                return;
            }
            MallProductSubmitUI mallProductSubmitUI2 = MallProductSubmitUI.this;
            mallProductSubmitUI2.f202266d = str;
            mallProductSubmitUI2.showDialog(-10001);
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$b */
    public class C70087b implements AdapterView.OnItemClickListener {
        public C70087b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C70105b bVar = (C70105b) view.getTag();
            int i2 = bVar.f202373f;
            if (i2 == 1) {
                Object obj = bVar.f202374g;
                if (obj instanceof String) {
                    MallProductSubmitUI.this.f202325w.f192543l = (String) obj;
                }
            } else if (i2 == 2) {
                C67036o oVar = MallProductSubmitUI.this.f202325w.f192533b;
                LinkedList<String> linkedList = oVar.f192558e.f193029i;
                if (linkedList != null && linkedList.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = oVar.f192558e.f193029i.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    bVar.f202374g = arrayList2;
                }
            }
            MallProductSubmitUI mallProductSubmitUI = MallProductSubmitUI.this;
            mallProductSubmitUI.f202323u.mo96490a(mallProductSubmitUI, view, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$c */
    public class C70088c implements View.OnClickListener {
        public C70088c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallProductHelper mallProductHelper = MallProductSubmitUI.this.f202327y;
            if (mallProductHelper.f202273g.mo90999b()) {
                String str = null;
                if (mallProductHelper.f202273g.mo91011o() == 0) {
                    C86709a0.m107528h();
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    c64 n = mallProductHelper.f202273g.mo91010n();
                    C67225n nVar = mallProductHelper.f202273g.f192533b.f192559f;
                    if (nVar != null) {
                        str = nVar.f193042d;
                    }
                    b0Var.mo123460f(new C39558m(n, str));
                } else {
                    C86709a0.m107528h();
                    C89137b0 b0Var2 = C86709a0.m107529k().f251779b;
                    c64 n2 = mallProductHelper.f202273g.mo91010n();
                    C67225n nVar2 = mallProductHelper.f202273g.f192533b.f192559f;
                    if (nVar2 != null) {
                        str = nVar2.f193042d;
                    }
                    b0Var2.mo123460f(new C39559n(n2, str));
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$d */
    public class C70089d implements View.OnClickListener {
        public C70089d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallProductHelper mallProductHelper = MallProductSubmitUI.this.f202327y;
            mallProductHelper.getClass();
            Intent intent = new Intent();
            intent.putExtra("launch_from_webview", true);
            C88144b.m109796n(mallProductHelper.f202270d, "address", ".ui.WalletSelectAddrUI", intent, 1, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$e */
    public class C70090e implements View.OnClickListener {
        public C70090e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallProductSubmitUI.this.showDialog(1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$f */
    public class C70091f implements View.OnClickListener {
        public C70091f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MallProductHelper mallProductHelper = MallProductSubmitUI.this.f202327y;
            mallProductHelper.getClass();
            Intent intent = new Intent(mallProductHelper.f202270d, MallProductReceiptUI.class);
            Activity activity = mallProductHelper.f202270d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "goEditInvoice", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$g */
    public class C70092g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f202334d;

        public C70092g(Bitmap bitmap) {
            this.f202334d = bitmap;
        }

        public void run() {
            MallProductSubmitUI.this.f202315j.setImageBitmap(this.f202334d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.MallProductSubmitUI$h */
    public class C70093h implements AdapterView.OnItemClickListener {
        public C70093h() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductSubmitUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            MallProductSubmitUI.this.dismissDialog(1);
            MallProductSubmitUI.this.f202325w.mo91016t(i);
            MallProductSubmitUI.this.mo96474H7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductSubmitUI$8", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0278  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96474H7() {
        /*
            r15 = this;
            java.lang.Class<xs.b> r0 = p755xs.C102720b.class
            af2.e r1 = r15.f202325w
            af2.o r1 = r1.f192533b
            af2.g r2 = r15.f202326x
            if (r2 == 0) goto L_0x0034
            android.widget.TextView r2 = r15.f202318p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            af2.g r4 = r15.f202326x
            int r4 = r4.f192552i
            bf2.c r5 = r1.f192558e
            java.lang.String r5 = r5.f193040w
            java.lang.String r4 = af2.C39552d.m42186c(r4, r4, r5)
            r3.append(r4)
            java.lang.String r4 = " x "
            r3.append(r4)
            af2.e r4 = r15.f202325w
            int r4 = r4.f192537f
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            goto L_0x0045
        L_0x0034:
            android.widget.TextView r2 = r15.f202318p
            bf2.c r3 = r1.f192558e
            int r4 = r3.f193027g
            int r5 = r3.f193028h
            java.lang.String r3 = r3.f193040w
            java.lang.String r3 = af2.C39552d.m42186c(r4, r5, r3)
            r2.setText(r3)
        L_0x0045:
            af2.e r2 = r15.f202325w
            java.lang.String r2 = r2.mo91002e()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0074
            di3.d r2 = di3.C86312j.m106911c(r0)
            xs.b r2 = (p755xs.C102720b) r2
            com.tencent.mm.plugin.product.ui.c r3 = new com.tencent.mm.plugin.product.ui.c
            af2.e r4 = r15.f202325w
            java.lang.String r4 = r4.mo91002e()
            r3.<init>(r4)
            android.graphics.Bitmap r2 = r2.mo142104N6(r3)
            android.widget.ImageView r3 = r15.f202315j
            r3.setImageBitmap(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            xs.b r0 = (p755xs.C102720b) r0
            r0.Lu0(r15)
        L_0x0074:
            android.widget.TextView r0 = r15.f202316n
            bf2.c r2 = r1.f192558e
            java.lang.String r2 = r2.f193024d
            r0.setText(r2)
            android.widget.TextView r0 = r15.f202317o
            af2.e r2 = r15.f202325w
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            af2.o r4 = r2.f192533b
            bf2.c r4 = r4.f192558e
            java.util.LinkedList<bf2.m> r4 = r4.f193037t
            java.util.Iterator r4 = r4.iterator()
        L_0x0090:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r4.next()
            bf2.m r5 = (bf2.C39768m) r5
            java.util.Map<java.lang.String, java.lang.String> r6 = r2.f192546o
            java.lang.String r7 = r5.f106723d
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0090
            java.util.LinkedList<bf2.h> r5 = r5.f106725f
            java.util.Iterator r5 = r5.iterator()
        L_0x00b0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0090
            java.lang.Object r7 = r5.next()
            bf2.h r7 = (bf2.C39765h) r7
            java.lang.String r8 = r7.f106715d
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x00b0
            java.lang.String r5 = r7.f106716e
            r3.append(r5)
            java.lang.String r5 = " "
            r3.append(r5)
            goto L_0x0090
        L_0x00cf:
            java.lang.String r2 = r3.toString()
            r0.setText(r2)
            af2.e r0 = r15.f202325w
            te3.wn3 r0 = r0.mo91005h()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00f0
            java.lang.String r3 = r0.f144161e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00f0
            com.tencent.mm.plugin.product.ui.MallProductItemView r3 = r15.f202314i
            java.lang.String r0 = r0.f144161e
            r3.setSummary((java.lang.String) r0)
            goto L_0x00f5
        L_0x00f0:
            com.tencent.mm.plugin.product.ui.MallProductItemView r0 = r15.f202314i
            r0.setSummary((java.lang.String) r2)
        L_0x00f5:
            af2.e r0 = r15.f202325w
            com.tencent.mm.plugin.product.ui.g r0 = r0.mo91001d()
            boolean r0 = r0.mo96502a()
            r3 = 8
            r4 = 1
            r5 = 0
            if (r0 != 0) goto L_0x0153
            af2.e r0 = r15.f202325w
            te3.ea0 r0 = r0.f192539h
            if (r0 == 0) goto L_0x0138
            com.tencent.mm.plugin.product.ui.MallProductItemView r6 = r15.f202313h
            r6.setEnabled(r4)
            com.tencent.mm.plugin.product.ui.MallProductItemView r6 = r15.f202313h
            r6.setClickable(r4)
            com.tencent.mm.plugin.product.ui.MallProductItemView r6 = r15.f202313h
            java.lang.String r7 = af2.C39552d.m42184a(r15, r0)
            r6.setSummary((java.lang.String) r7)
            r6 = 2131832740(0x7f112fa4, float:1.9298542E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r8 = r0.f132822e
            double r8 = (double) r8
            java.lang.String r0 = r0.f132823f
            java.lang.String r0 = af2.C39552d.m42185b(r8, r0)
            r7[r5] = r0
            java.lang.String r0 = r15.getString(r6, r7)
            android.widget.TextView r6 = r15.f202312g
            r6.setVisibility(r3)
            goto L_0x0154
        L_0x0138:
            com.tencent.mm.plugin.product.ui.MallProductItemView r0 = r15.f202313h
            r0.setEnabled(r5)
            com.tencent.mm.plugin.product.ui.MallProductItemView r0 = r15.f202313h
            r0.setClickable(r5)
            com.tencent.mm.plugin.product.ui.MallProductItemView r0 = r15.f202313h
            r6 = 2131832741(0x7f112fa5, float:1.9298544E38)
            java.lang.String r6 = r15.getString(r6)
            r0.setSummary((java.lang.String) r6)
            android.widget.TextView r0 = r15.f202312g
            r0.setVisibility(r5)
        L_0x0153:
            r0 = r2
        L_0x0154:
            af2.e r6 = r15.f202325w
            int r6 = r6.mo91003f()
            if (r6 <= 0) goto L_0x0173
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 2131832739(0x7f112fa3, float:1.929854E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            double r8 = (double) r6
            bf2.c r6 = r1.f192558e
            java.lang.String r6 = r6.f193040w
            java.lang.String r6 = af2.C39552d.m42185b(r8, r6)
            r7[r5] = r6
            java.lang.String r2 = r15.getString(r2, r7)
        L_0x0173:
            af2.e r6 = r15.f202325w
            r6.getClass()
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList<te3.h1> r8 = r6.f192548q
            if (r8 == 0) goto L_0x01fe
            java.util.Iterator r8 = r8.iterator()
        L_0x0185:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01fe
            java.lang.Object r9 = r8.next()
            te3.h1 r9 = (te3.C49638h1) r9
            bf2.a r10 = new bf2.a
            r10.<init>()
            java.lang.String r11 = r9.f134398d
            r10.f193019d = r11
            java.lang.String r11 = r9.f134399e
            r10.f193020e = r11
            java.lang.String r11 = r9.f134401g
            r10.f193022g = r11
            int r12 = r9.f134400f
            r10.f193021f = r12
            java.lang.String r9 = r9.f134402h
            r10.f193023h = r9
            if (r12 != r4) goto L_0x01fa
            java.util.Map<java.lang.String, java.util.LinkedList<te3.d50>> r9 = r6.f192551t
            if (r9 == 0) goto L_0x01df
            java.util.HashMap r9 = (java.util.HashMap) r9
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x01df
            java.util.Map<java.lang.String, java.util.LinkedList<te3.d50>> r9 = r6.f192551t
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r9 = r9.get(r11)
            java.util.LinkedList r9 = (java.util.LinkedList) r9
            if (r9 == 0) goto L_0x01df
            int r11 = r9.size()
            if (r11 <= 0) goto L_0x01df
            java.util.Iterator r9 = r9.iterator()
            r11 = 0
        L_0x01cf:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x01e0
            java.lang.Object r12 = r9.next()
            te3.d50 r12 = (te3.C49097d50) r12
            int r12 = r12.f132117e
            int r11 = r11 + r12
            goto L_0x01cf
        L_0x01df:
            r11 = 0
        L_0x01e0:
            if (r11 <= 0) goto L_0x01fa
            r9 = 2131832735(0x7f112f9f, float:1.9298532E38)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            double r13 = (double) r11
            af2.o r11 = r6.f192533b
            bf2.c r11 = r11.f192558e
            java.lang.String r11 = r11.f193040w
            java.lang.String r11 = af2.C39552d.m42185b(r13, r11)
            r12[r5] = r11
            java.lang.String r9 = r15.getString(r9, r12)
            r10.f193020e = r9
        L_0x01fa:
            r7.add(r10)
            goto L_0x0185
        L_0x01fe:
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x0214
            android.widget.ListView r6 = r15.f202322t
            r6.setVisibility(r5)
            com.tencent.mm.plugin.product.ui.a r6 = r15.f202323u
            r6.mo96491b(r7)
            com.tencent.mm.plugin.product.ui.a r6 = r15.f202323u
            r6.notifyDataSetChanged()
            goto L_0x0219
        L_0x0214:
            android.widget.ListView r6 = r15.f202322t
            r6.setVisibility(r3)
        L_0x0219:
            af2.e r6 = r15.f202325w
            te3.b4 r6 = r6.f192540i
            if (r6 == 0) goto L_0x0248
            android.widget.TextView r7 = r15.f202311f
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = r6.f226984h
            r8[r5] = r9
            java.lang.String r9 = r6.f226985i
            r8[r4] = r9
            r9 = 2
            java.lang.String r10 = r6.f226981e
            r8[r9] = r10
            r9 = 3
            java.lang.String r10 = r6.f226982f
            r8[r9] = r10
            r9 = 4
            java.lang.String r6 = r6.f226983g
            r8[r9] = r6
            java.lang.String r6 = "%s %s<br><br>%s %s %s"
            java.lang.String r6 = java.lang.String.format(r6, r8)
            android.text.Spanned r6 = android.text.Html.fromHtml(r6)
            r7.setText(r6)
        L_0x0248:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0278
            r2 = 2131832738(0x7f112fa2, float:1.9298538E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r5] = r0
            java.lang.String r0 = r15.getString(r2, r4)
            android.widget.TextView r2 = r15.f202319q
            r2.setText(r0)
            android.widget.TextView r0 = r15.f202320r
            r0.setVisibility(r3)
            android.widget.TextView r0 = r15.f202319q
            r0.setVisibility(r5)
            goto L_0x0282
        L_0x0278:
            android.widget.TextView r0 = r15.f202320r
            r0.setVisibility(r5)
            android.widget.TextView r0 = r15.f202319q
            r0.setVisibility(r3)
        L_0x0282:
            android.widget.TextView r0 = r15.f202321s
            af2.e r2 = r15.f202325w
            int r2 = r2.mo91011o()
            double r2 = (double) r2
            bf2.c r1 = r1.f192558e
            java.lang.String r1 = r1.f193040w
            java.lang.String r1 = af2.C39552d.m42185b(r2, r1)
            r0.setText(r1)
            android.widget.Button r0 = r15.f202324v
            af2.e r1 = r15.f202325w
            boolean r1 = r1.mo90999b()
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.product.p087ui.MallProductSubmitUI.mo96474H7():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bod;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.gop);
        this.f202310e = (RelativeLayout) findViewById(C0966R.C0970id.gn_);
        this.f202311f = (TextView) findViewById(C0966R.C0970id.gnb);
        this.f202312g = (TextView) findViewById(C0966R.C0970id.gna);
        this.f202313h = (MallProductItemView) findViewById(C0966R.C0970id.gnd);
        this.f202314i = (MallProductItemView) findViewById(C0966R.C0970id.gnf);
        this.f202315j = (ImageView) findViewById(C0966R.C0970id.gne);
        this.f202316n = (TextView) findViewById(C0966R.C0970id.gnm);
        this.f202317o = (TextView) findViewById(C0966R.C0970id.gng);
        this.f202318p = (TextView) findViewById(C0966R.C0970id.gnk);
        this.f202319q = (TextView) findViewById(C0966R.C0970id.gnj);
        this.f202320r = (TextView) findViewById(C0966R.C0970id.gni);
        this.f202321s = (TextView) findViewById(C0966R.C0970id.gnn);
        this.f202322t = (ListView) findViewById(C0966R.C0970id.gnh);
        C70104a aVar = new C70104a(this);
        this.f202323u = aVar;
        this.f202322t.setAdapter(aVar);
        this.f202322t.setOnItemClickListener(new C70087b());
        Button button = (Button) findViewById(C0966R.C0970id.gnl);
        this.f202324v = button;
        button.setOnClickListener(new C70088c());
        this.f202310e.setOnClickListener(new C70089d());
        this.f202313h.setOnClickListener(new C70090e());
        this.f202314i.setOnClickListener(new C70091f());
        MallProductItemView mallProductItemView = this.f202314i;
        boolean z = (this.f202325w.mo91001d().f202385b & 2) > 0;
        Log.m105918d("MicroMsg.MallProductConfig", "hasReceipt, ret = " + z);
        mallProductItemView.setVisibility(z ? 0 : 8);
        if (this.f202325w.mo91001d().mo96502a()) {
            this.f202313h.setEnabled(false);
            this.f202313h.setClickable(false);
            this.f202313h.setSummary(getString(C0966R.string.gon));
        }
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", bitmap = ");
        sb.append(bitmap == null);
        Log.m105918d("MicroMsg.MallProductSubmitUI", sb.toString());
        if (!Util.isNullOrNil(this.f202325w.mo91002e())) {
            this.f202315j.post(new C70092g(bitmap));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f202327y.mo96457b(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f202327y = new MallProductHelper(getContext(), new C70086a());
        C67033e wx02 = C79322b.vx0().wx0();
        this.f202325w = wx02;
        this.f202326x = wx02.f192549r;
        initView();
        mo96474H7();
    }

    public Dialog onCreateDialog(int i) {
        LinkedList<C49254ea0> linkedList;
        if (i != 1 || (linkedList = this.f202325w.f192547p) == null) {
            return super.onCreateDialog(i);
        }
        ArrayList arrayList = new ArrayList();
        for (C49254ea0 a : linkedList) {
            arrayList.add(C39552d.m42184a(this, a));
        }
        String string = getString(C0966R.string.goe);
        C70093h hVar = new C70093h();
        C70107e eVar = new C70107e(this, 1);
        ListViewInScrollView listViewInScrollView = (ListViewInScrollView) View.inflate(this, C0966R.C0971layout.bcq, (ViewGroup) null);
        listViewInScrollView.setOnItemClickListener(new C4931d(hVar, eVar));
        eVar.f202379f = arrayList;
        eVar.f202380g = 0;
        listViewInScrollView.setAdapter(eVar);
        C77389a aVar = new C77389a();
        aVar.f225644a = string;
        aVar.f225627J = listViewInScrollView;
        aVar.f225622E = null;
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return gVar;
    }

    public void onStart() {
        this.f202327y.mo96458c();
        super.onStart();
    }

    public void onStop() {
        this.f202327y.mo96459d();
        super.onStop();
    }
}
