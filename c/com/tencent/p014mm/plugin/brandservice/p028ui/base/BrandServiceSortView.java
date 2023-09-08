package com.tencent.p014mm.plugin.brandservice.p028ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.plugin.brandservice.p028ui.BrandServiceLocalSearchUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C32208l;
import fx0.C32209n;
import fx0.C45833m;
import hx0.C46127b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import nj3.C11184p0;
import nj3.C76879j;
import nr3.C89060f;
import p248ug.C37468y;
import p248ug.C52558c;
import p629ny.C76979h;
import qj3.C47864f;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C48009v0;
import te3.C49566gj;
import uo3.C78253a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView */
public class BrandServiceSortView extends BaseSortView implements C32209n.C32210a, AdapterView.OnItemLongClickListener, View.OnCreateContextMenuListener, BaseSortView.C44719a {

    /* renamed from: I */
    public static final /* synthetic */ int f109200I = 0;

    /* renamed from: A */
    public C89779i0 f109201A;

    /* renamed from: B */
    public boolean f109202B = true;

    /* renamed from: C */
    public int f109203C = 0;

    /* renamed from: D */
    public int f109204D = 0;

    /* renamed from: E */
    public String f109205E;

    /* renamed from: F */
    public View f109206F;

    /* renamed from: G */
    public TextView f109207G;

    /* renamed from: H */
    public C11184p0 f109208H = new C40654d();

    /* renamed from: s */
    public HashMap<String, SpannableString> f109209s = new HashMap<>();

    /* renamed from: t */
    public C32209n f109210t = new C32209n();

    /* renamed from: u */
    public int f109211u = 251658241;

    /* renamed from: v */
    public C78253a f109212v;

    /* renamed from: w */
    public String f109213w;

    /* renamed from: x */
    public ListView f109214x;

    /* renamed from: y */
    public C40655e f109215y;

    /* renamed from: z */
    public boolean f109216z;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$a */
    public class C40651a implements Runnable {
        public C40651a() {
        }

        public void run() {
            if (BrandServiceSortView.this.f109202B) {
                C115669n.INSTANCE.idkeyStat(1378, 8, 1, false);
                BrandServiceSortView brandServiceSortView = BrandServiceSortView.this;
                brandServiceSortView.f109202B = false;
                brandServiceSortView.f109201A = C76879j.m92723Q(brandServiceSortView.getContext(), (String) null, BrandServiceSortView.this.getContext().getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$b */
    public class C40652b implements Runnable {
        public C40652b() {
        }

        public void run() {
            ArrayList arrayList;
            BrandServiceSortView brandServiceSortView = BrandServiceSortView.this;
            C32209n nVar = brandServiceSortView.f109210t;
            List<C49566gj> list = brandServiceSortView.f109211u != 2 ? nVar.f85616f : nVar.f85615e;
            brandServiceSortView.getClass();
            if (list != null) {
                arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    C49566gj gjVar = list.get(i);
                    if (!(gjVar == null || gjVar.f134063e == null)) {
                        C47864f fVar = new C47864f();
                        fVar.f128466b = gjVar;
                        int A2 = gjVar.f134063e.mo62845A2();
                        if (A2 >= 97 && A2 <= 122) {
                            A2 -= 32;
                        }
                        if (A2 < 65 || A2 > 90) {
                            fVar.f128465a = "#";
                        } else {
                            fVar.f128465a = ((char) A2) + "";
                        }
                        arrayList.add(fVar);
                    }
                }
            } else {
                arrayList = null;
            }
            brandServiceSortView.mo69938e(arrayList);
            BrandServiceSortView.m43896g(BrandServiceSortView.this);
            BrandServiceSortView brandServiceSortView2 = BrandServiceSortView.this;
            brandServiceSortView2.f109202B = false;
            C89779i0 i0Var = brandServiceSortView2.f109201A;
            if (i0Var != null && i0Var.isShowing()) {
                BrandServiceSortView.this.f109201A.dismiss();
                BrandServiceSortView.this.f109201A.setCancelMessage((Message) null);
                BrandServiceSortView.this.f109201A.setDismissMessage((Message) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$c */
    public class C40653c implements C44721b.C44723b {
        public C40653c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$f} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View mo63508a(qj3.C47864f r17, android.view.View r18, android.view.ViewGroup r19, int r20, int r21, boolean r22, boolean r23) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r4 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                android.content.Context r4 = r4.getContext()
                if (r18 != 0) goto L_0x0063
                android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
                r6 = 2131493421(0x7f0c022d, float:1.8610322E38)
                r7 = 0
                android.view.View r5 = r5.inflate(r6, r7)
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$f r6 = new com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$f
                r6.<init>()
                r7 = 2131298921(0x7f090a69, float:1.8215829E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r6.f109223c = r7
                r7 = 2131300376(0x7f091018, float:1.821878E38)
                android.view.View r7 = r5.findViewById(r7)
                r6.f109222b = r7
                r7 = 2131297010(0x7f0902f2, float:1.8211953E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r6.f109225e = r7
                r7 = 2131310173(0x7f09365d, float:1.823865E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.ImageView r7 = (android.widget.ImageView) r7
                r6.f109224d = r7
                r7 = 2131298308(0x7f090804, float:1.8214585E38)
                android.view.View r7 = r5.findViewById(r7)
                android.widget.TextView r7 = (android.widget.TextView) r7
                r6.f109226f = r7
                r7 = 2131313141(0x7f0941f5, float:1.824467E38)
                android.view.View r7 = r5.findViewById(r7)
                r6.f109227g = r7
                r5.setTag(r6)
                goto L_0x006c
            L_0x0063:
                java.lang.Object r5 = r18.getTag()
                r6 = r5
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$f r6 = (com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.C40656f) r6
                r5 = r18
            L_0x006c:
                java.lang.Object r7 = r1.f128466b
                te3.gj r7 = (te3.C49566gj) r7
                java.lang.String r8 = "MicroMsg.BrandServiceSortView"
                if (r7 != 0) goto L_0x007b
                java.lang.String r1 = "should not be empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
                return r5
            L_0x007b:
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r9 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                boolean r9 = r9.f121306p
                r10 = 8
                r11 = 0
                if (r9 == 0) goto L_0x0093
                if (r22 == 0) goto L_0x0093
                android.widget.TextView r9 = r6.f109223c
                java.lang.String r1 = r1.f128465a
                r9.setText(r1)
                android.widget.TextView r1 = r6.f109223c
                r1.setVisibility(r11)
                goto L_0x0098
            L_0x0093:
                android.widget.TextView r1 = r6.f109223c
                r1.setVisibility(r10)
            L_0x0098:
                java.lang.String r1 = r7.f134062d
                r6.f109221a = r1
                android.widget.ImageView r9 = r6.f109225e
                r9.setTag(r1)
                java.lang.Class<ln.f> r1 = p196ln.C76705f.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ln.f r1 = (p196ln.C76705f) r1
                android.widget.ImageView r9 = r6.f109225e
                java.lang.String r12 = r6.f109221a
                r1.mo106822J5(r9, r12)
                com.tencent.mm.storage.z1 r1 = r7.f134063e
                java.lang.String r1 = r1.mo62898f()
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r9 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                android.widget.TextView r12 = r6.f109226f
                float r13 = r12.getTextSize()
                int r13 = (int) r13
                int r14 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.f109200I
                r9.getClass()
                r14 = 1
                if (r12 != 0) goto L_0x00cd
                java.lang.String r1 = "display area is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
                goto L_0x011e
            L_0x00cd:
                boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r15 == 0) goto L_0x00da
                java.lang.String r1 = "remark is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
                goto L_0x011e
            L_0x00da:
                java.util.HashMap<java.lang.String, android.text.SpannableString> r15 = r9.f109209s
                java.lang.Object r15 = r15.get(r1)
                android.text.SpannableString r15 = (android.text.SpannableString) r15
                if (r15 != 0) goto L_0x0112
                java.lang.String r15 = "new one %s"
                java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0107 }
                r10[r11] = r1     // Catch:{ Exception -> 0x0107 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r15, r10)     // Catch:{ Exception -> 0x0107 }
                android.text.SpannableString r10 = new android.text.SpannableString     // Catch:{ Exception -> 0x0107 }
                java.lang.Class<ny.h> r15 = p629ny.C76979h.class
                di3.d r15 = di3.C86312j.m106911c(r15)     // Catch:{ Exception -> 0x0107 }
                ny.h r15 = (p629ny.C76979h) r15     // Catch:{ Exception -> 0x0107 }
                android.text.SpannableString r4 = r15.op0(r4, r1, r13)     // Catch:{ Exception -> 0x0107 }
                r10.<init>(r4)     // Catch:{ Exception -> 0x0107 }
                java.util.HashMap<java.lang.String, android.text.SpannableString> r4 = r9.f109209s     // Catch:{ Exception -> 0x0107 }
                r4.put(r1, r10)     // Catch:{ Exception -> 0x0107 }
                r12.setText(r10)     // Catch:{ Exception -> 0x0107 }
                goto L_0x011e
            L_0x0107:
                java.lang.String r1 = "error, set empty str"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
                java.lang.String r1 = ""
                r12.setText(r1)
                goto L_0x011e
            L_0x0112:
                java.lang.Object[] r4 = new java.lang.Object[r14]
                r4[r11] = r1
                java.lang.String r1 = "match one %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r1, r4)
                r12.setText(r15)
            L_0x011e:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                ug.c r4 = r7.f134064f
                int r4 = r4.field_status
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1[r11] = r4
                java.lang.String r4 = "bizinfo status%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r4, r1)
                android.widget.ImageView r1 = r6.f109224d
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r4 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                r4.getClass()
                r4 = 8
                r1.setVisibility(r4)
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r1 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                int r1 = r1.getMode()
                if (r1 != 0) goto L_0x014e
                if (r23 == 0) goto L_0x014e
                android.view.View r1 = r6.f109227g
                r4 = 2131231822(0x7f08044e, float:1.8079736E38)
                r1.setBackgroundResource(r4)
                goto L_0x0156
            L_0x014e:
                android.view.View r1 = r6.f109227g
                r4 = 2131233600(0x7f080b40, float:1.8083342E38)
                r1.setBackgroundResource(r4)
            L_0x0156:
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r1 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                boolean r1 = r1.f121307q
                if (r1 == 0) goto L_0x0184
                android.view.View r1 = r6.f109222b
                int r4 = r1.getPaddingLeft()
                android.view.View r7 = r6.f109222b
                int r7 = r7.getPaddingTop()
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r9 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                android.content.Context r9 = r9.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131165188(0x7f070004, float:1.7944586E38)
                float r9 = r9.getDimension(r10)
                int r9 = (int) r9
                android.view.View r6 = r6.f109222b
                int r6 = r6.getPaddingBottom()
                r1.setPadding(r4, r7, r9, r6)
                goto L_0x01ab
            L_0x0184:
                android.view.View r1 = r6.f109222b
                int r4 = r1.getPaddingLeft()
                android.view.View r7 = r6.f109222b
                int r7 = r7.getPaddingTop()
                com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView r9 = com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.this
                android.content.Context r9 = r9.getContext()
                android.content.res.Resources r9 = r9.getResources()
                r10 = 2131165590(0x7f070196, float:1.7945401E38)
                float r9 = r9.getDimension(r10)
                int r9 = (int) r9
                android.view.View r6 = r6.f109222b
                int r6 = r6.getPaddingBottom()
                r1.setPadding(r4, r7, r9, r6)
            L_0x01ab:
                java.lang.Object[] r1 = new java.lang.Object[r14]
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r1[r11] = r2
                java.lang.String r2 = "get view use %d ms"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView.C40653c.mo63508a(qj3.f, android.view.View, android.view.ViewGroup, int, int, boolean, boolean):android.view.View");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$d */
    public class C40654d implements C11184p0 {
        public C40654d() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (Util.isNullOrNil(BrandServiceSortView.this.f109213w)) {
                Log.m105924i("MicroMsg.BrandServiceSortView", "username is null or nil.");
            } else if (menuItem.getItemId() == 0) {
                Log.m105925i("MicroMsg.BrandServiceSortView", "Menu Item selected, pos(%d)", Integer.valueOf(i));
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(BrandServiceSortView.this.f109213w);
                C52558c b = C47984k.m53328b(BrandServiceSortView.this.f109213w);
                BrandServiceSortView brandServiceSortView = BrandServiceSortView.this;
                Context context = brandServiceSortView.getContext();
                int groupId = menuItem.getGroupId();
                brandServiceSortView.getClass();
                Log.m105924i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog");
                if (b == null || context == null || !(context instanceof Activity) || z1Var == null) {
                    Log.m105921e("MicroMsg.BrandServiceSortView", "bizInfo(%s) or context(%s) or contact(%s) is null", b, context, z1Var);
                    return;
                }
                ((C37468y) C86312j.m106911c(C37468y.class)).mo61114bs(b, (Activity) context, z1Var, false, new C46127b(brandServiceSortView, groupId));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$e */
    public interface C40655e {
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView$f */
    public static class C40656f {

        /* renamed from: a */
        public String f109221a;

        /* renamed from: b */
        public View f109222b;

        /* renamed from: c */
        public TextView f109223c;

        /* renamed from: d */
        public ImageView f109224d;

        /* renamed from: e */
        public ImageView f109225e;

        /* renamed from: f */
        public TextView f109226f;

        /* renamed from: g */
        public View f109227g;
    }

    public BrandServiceSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDataSetObserver(this);
        setShowFooterView(false);
        mo63548h();
        C32209n nVar = this.f109210t;
        if (!nVar.f85614d.contains(this)) {
            Log.m105924i("MicroMsg.BrandService.BrandServiceMgr", "addListener:add");
            nVar.f85614d.add(this);
        }
        this.f109212v = new C78253a(getContext());
        setOnItemClickListener(new C40657a(this));
        setOnItemLongClickListener(this);
    }

    /* renamed from: g */
    public static void m43896g(BrandServiceSortView brandServiceSortView) {
        C44721b bVar = brandServiceSortView.f121300g;
        bVar.mo69954b(bVar.f121310d);
    }

    /* renamed from: b */
    public View mo63491b() {
        return View.inflate(getContext(), C0966R.C0971layout.f6669la, this);
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        C72996z1 z1Var;
        if (!Util.isNullOrNil(str) && fVar != null) {
            this.f109205E = str;
            C49566gj gjVar = (C49566gj) fVar.f128466b;
            if (gjVar == null || (z1Var = gjVar.f134063e) == null) {
                Log.m105928w("MicroMsg.BrandServiceSortView", "BrandServiceItem or contact is null.");
            } else {
                String f = z1Var.mo62898f();
                String y2 = z1Var.mo62942y2();
                String z2 = z1Var.mo62945z2();
                String upperCase = str.toUpperCase();
                if (!Util.isNullOrNil(f) && f.toUpperCase().indexOf(upperCase) != -1) {
                    return true;
                }
                if (Util.isNullOrNil(y2) || y2.toUpperCase().indexOf(upperCase) == -1) {
                    return !Util.isNullOrNil(z2) && z2.toUpperCase().startsWith(upperCase);
                }
                return true;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f109203C = (int) motionEvent.getRawX();
            this.f109204D = (int) motionEvent.getRawY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C40655e getITransferToChildOnTouchListener() {
        return this.f109215y;
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C40653c();
    }

    public ListView getListView() {
        this.f109214x = (ListView) findViewById(C0966R.C0970id.fph);
        if (this.f109206F == null) {
            View inflate = View.inflate(getContext(), C0966R.C0971layout.f7099y_, (ViewGroup) null);
            this.f109206F = inflate;
            if (!(this.f109214x == null || inflate == null)) {
                this.f109207G = (TextView) inflate.findViewById(C0966R.C0970id.btz);
                this.f109214x.addFooterView(this.f109206F, (Object) null, false);
            }
        }
        return this.f109214x;
    }

    public View getNoResultView() {
        return findViewById(C0966R.C0970id.hgp);
    }

    public VerticalScrollBar getScrollBar() {
        return (VerticalScrollBar) findViewById(C0966R.C0970id.jkw);
    }

    /* renamed from: h */
    public void mo63548h() {
        C119179t tVar = C119157j.f356862d;
        C40651a aVar = new C40651a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 1000, false);
        C32209n nVar = this.f109210t;
        C40652b bVar = new C40652b();
        nVar.getClass();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C89060f.m111322a().mo123064p(new C45833m(nVar, linkedList, linkedList2)).mo123062e(new C32208l(nVar, linkedList, linkedList2, bVar));
    }

    /* renamed from: i */
    public void mo63549i() {
        if (C86709a0.m107522a()) {
            ((ArrayList) C48009v0.Lx0().f128790a).clear();
        }
        this.f109210t.getClass();
        C32209n nVar = this.f109210t;
        nVar.getClass();
        C86709a0.m107524d().mo123470p(387, nVar);
    }

    public void onChange() {
        mo63548h();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Object obj;
        if (contextMenuInfo == null) {
            Log.m105924i("MicroMsg.BrandServiceSortView", "menuInfo is null.");
            return;
        }
        Log.m105924i("MicroMsg.BrandServiceSortView", "onCreateContextMenu");
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        C47864f fVar = (C47864f) ((AdapterView) view).getItemAtPosition(adapterContextMenuInfo.position);
        if (fVar == null || (obj = fVar.f128466b) == null) {
            Log.m105925i("MicroMsg.BrandServiceSortView", "SortEntity(%s) is null or its data is null.", fVar);
            return;
        }
        C72996z1 z1Var = ((C49566gj) obj).f134063e;
        if (z1Var == null) {
            Log.m105920e("MicroMsg.BrandServiceSortView", "onCreateContextMenu, contact is null");
            return;
        }
        this.f109213w = z1Var.getUsername();
        contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), z1Var.mo62898f()));
        C52558c b = C47984k.m53328b(z1Var.getUsername());
        if (b != null && !b.mo73503u2()) {
            contextMenu.add(adapterContextMenuInfo.position, 0, 0, C0966R.string.glz);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C40655e eVar = this.f109215y;
        if (eVar != null) {
            ((BrandServiceLocalSearchUI) eVar).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        C78253a aVar = this.f109212v;
        aVar.f229248q = view;
        aVar.mo108272g(adapterView, i, j, this, this.f109208H, this.f109203C, this.f109204D);
        return true;
    }

    public void setITransferToChildOnTouchListener(C40655e eVar) {
        this.f109215y = eVar;
    }

    public void setReturnResult(boolean z) {
        this.f109216z = z;
    }

    public void setShowFooterView(boolean z) {
        mo69939f(this.f109207G, z);
    }
}
