package com.tencent.p014mm.plugin.collect.p038ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import b21.C113081b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import e21.C45533f0;
import e21.C75479d;
import e21.C75482m0;
import e21.C75485o0;
import e21.C75492u;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h21.C76098a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import nj3.C11184p0;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import tc0.C77885p;
import te3.C48665a5;
import te3.C64334dz2;

/* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI */
public class CollectBillUI extends WalletBaseUI {

    /* renamed from: A */
    public long f197768A;

    /* renamed from: B */
    public C11385n f197769B = new C40907a();

    /* renamed from: C */
    public C11184p0 f197770C = new C68837g();

    /* renamed from: d */
    public ListView f197771d;

    /* renamed from: e */
    public C76098a f197772e;

    /* renamed from: f */
    public View f197773f;

    /* renamed from: g */
    public LinearLayout f197774g;

    /* renamed from: h */
    public CollectBillHeaderView f197775h;

    /* renamed from: i */
    public ImageView f197776i;

    /* renamed from: j */
    public MMSwitchBtn f197777j;

    /* renamed from: n */
    public ImageView f197778n;

    /* renamed from: o */
    public MMSwitchBtn f197779o;

    /* renamed from: p */
    public TextView f197780p;

    /* renamed from: q */
    public C45082x0 f197781q;

    /* renamed from: r */
    public boolean f197782r = false;

    /* renamed from: s */
    public boolean f197783s = false;

    /* renamed from: t */
    public boolean f197784t = false;

    /* renamed from: u */
    public boolean f197785u = true;

    /* renamed from: v */
    public String f197786v;

    /* renamed from: w */
    public int f197787w;

    /* renamed from: x */
    public int f197788x;

    /* renamed from: y */
    public long f197789y;

    /* renamed from: z */
    public int f197790z = 20;

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$a */
    public class C40907a implements C11385n {

        /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$a$a */
        public class C40908a extends C7089c0 {

            /* renamed from: g */
            public final /* synthetic */ C48665a5 f110042g;

            public C40908a(C48665a5 a5Var) {
                this.f110042g = a5Var;
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                if (!Util.isNullOrNil(this.f110042g.f130314f)) {
                    C75228t.m90219L(CollectBillUI.this.getContext(), this.f110042g.f130314f, true);
                }
            }
        }

        public C40907a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C45533f0) {
                C45533f0 f0Var = (C45533f0) yVar;
                if (i == 0 && i2 == 0) {
                    LinkedList<C48665a5> linkedList = f0Var.f123203f.f133045d;
                    if (linkedList == null || linkedList.isEmpty()) {
                        CollectBillUI.this.f197780p.setVisibility(8);
                        return;
                    }
                    for (C48665a5 next : linkedList) {
                        if (next.f130312d == 1 && !Util.isNullOrNil(next.f130313e)) {
                            Log.m105924i("MicroMsg.CollectBillUI", "show notice");
                            CollectBillUI.this.f197780p.setText(next.f130313e);
                            CollectBillUI.this.f197780p.setOnClickListener(new C40908a(next));
                            CollectBillUI.this.f197780p.setVisibility(0);
                            return;
                        }
                    }
                    CollectBillUI.this.f197780p.setVisibility(8);
                    return;
                }
                Log.m105921e("MicroMsg.CollectBillUI", "net error: %s", f0Var);
                CollectBillUI.this.f197780p.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$b */
    public class C68832b implements AbsListView.OnScrollListener {
        public C68832b() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            if (CollectBillUI.this.f197771d.getLastVisiblePosition() == CollectBillUI.this.f197772e.getCount() && CollectBillUI.this.f197772e.getCount() > 0) {
                CollectBillUI collectBillUI = CollectBillUI.this;
                if (!collectBillUI.f197784t && !collectBillUI.f197783s) {
                    if (!collectBillUI.f197782r) {
                        Log.m105918d("MicroMsg.CollectBillUI", "show loading");
                        collectBillUI.f197771d.addFooterView(collectBillUI.f197773f, (Object) null, false);
                        collectBillUI.f197782r = true;
                    }
                    CollectBillUI collectBillUI2 = CollectBillUI.this;
                    if (!collectBillUI2.f197784t) {
                        collectBillUI2.doSceneForceProgress(new C75485o0(collectBillUI2.f197787w, collectBillUI2.f197789y, collectBillUI2.f197786v, collectBillUI2.f197790z));
                        collectBillUI2.f197783s = true;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$c */
    public class C68833c implements AdapterView.OnItemClickListener {
        public C68833c() {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/collect/ui/CollectBillUI$3"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.String r9 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r11 = "onItemClick"
                java.lang.String r12 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r0 = "com/tencent/mm/plugin/collect/ui/CollectBillUI$3"
                r1 = 1
                r2 = 0
                r3 = 2
                java.lang.String r4 = "MicroMsg.CollectBillUI"
                if (r10 < 0) goto L_0x008d
                android.widget.Adapter r5 = r8.getAdapter()
                int r5 = r5.getCount()
                if (r10 < r5) goto L_0x0046
                goto L_0x008d
            L_0x0046:
                com.tencent.mm.plugin.collect.ui.CollectBillUI r8 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.this
                android.widget.ListView r8 = r8.f197771d
                java.lang.Object r8 = r8.getItemAtPosition(r10)
                e21.d r8 = (e21.C75479d) r8
                if (r8 != 0) goto L_0x0060
                java.lang.Object[] r8 = new java.lang.Object[r1]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r8[r2] = r10
                java.lang.String r10 = "invalid position: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r10, r8)
                goto L_0x0089
            L_0x0060:
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                java.lang.String r1 = "scene"
                r10.putExtra(r1, r3)
                java.lang.String r1 = r8.f221801b
                java.lang.String r2 = "trans_id"
                r10.putExtra(r2, r1)
                java.lang.String r8 = r8.f221800a
                java.lang.String r1 = "bill_id"
                r10.putExtra(r1, r8)
                com.tencent.mm.plugin.collect.ui.CollectBillUI r8 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.this
                androidx.appcompat.app.AppCompatActivity r8 = r8.getContext()
                r1 = 0
                java.lang.String r2 = "order"
                java.lang.String r3 = ".ui.MallOrderTransactionInfoUI"
                ke3.C88144b.m109791i(r8, r2, r3, r10, r1)
            L_0x0089:
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            L_0x008d:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r3[r2] = r10
                android.widget.Adapter r8 = r8.getAdapter()
                int r8 = r8.getCount()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r3[r1] = r8
                java.lang.String r8 = "illegal position: %s, count: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r3)
                j20.C117292a.m165361g(r7, r0, r12, r11, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.C68833c.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$d */
    public class C68834d implements AdapterView.OnItemLongClickListener {
        public C68834d() {
        }

        /* JADX WARNING: type inference failed for: r10v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onItemLongClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
            /*
                r9 = this;
                r0 = 1
                if (r12 < 0) goto L_0x001b
                android.widget.Adapter r1 = r10.getAdapter()
                int r1 = r1.getCount()
                if (r12 < r1) goto L_0x000e
                goto L_0x001b
            L_0x000e:
                com.tencent.mm.plugin.collect.ui.CollectBillUI r7 = com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.this
                com.tencent.mm.ui.tools.x0 r2 = r7.f197781q
                nj3.p0 r8 = r7.f197770C
                r3 = r11
                r4 = r12
                r5 = r13
                r2.mo70437c(r3, r4, r5, r7, r8)
                return r0
            L_0x001b:
                r11 = 2
                java.lang.Object[] r11 = new java.lang.Object[r11]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r13 = 0
                r11[r13] = r12
                android.widget.Adapter r10 = r10.getAdapter()
                int r10 = r10.getCount()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r11[r0] = r10
                java.lang.String r10 = "MicroMsg.CollectBillUI"
                java.lang.String r12 = "illegal position: %s, count: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.collect.p038ui.CollectBillUI.C68834d.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$e */
    public class C68835e implements MenuItem.OnMenuItemClickListener {
        public C68835e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent(CollectBillUI.this.getContext(), CollectBillListUI.class);
            CollectBillUI collectBillUI = CollectBillUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            CollectBillUI collectBillUI2 = collectBillUI;
            C117292a.m165358d(collectBillUI2, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectBillUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            collectBillUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(collectBillUI2, "com/tencent/mm/plugin/collect/ui/CollectBillUI$5", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$f */
    public class C68836f implements MMSwitchBtn.C7041b {
        public C68836f() {
        }

        public void onStatusChange(boolean z) {
            int i;
            Log.m105925i("MicroMsg.CollectBillUI", "update switch: %B", Boolean.valueOf(z));
            CollectBillUI.this.f197777j.setCheck(z);
            CollectBillUI.this.f197779o.setCheck(z);
            if (z) {
                CollectBillUI collectBillUI = CollectBillUI.this;
                collectBillUI.f197768A = 32768 | collectBillUI.f197768A;
                collectBillUI.f197776i.setImageResource(C0966R.raw.collect_sound_on);
                CollectBillUI.this.f197778n.setImageResource(C0966R.raw.collect_sound_on);
                C76701a.makeText((Context) CollectBillUI.this.getContext(), (int) C0966R.string.bgp, 1).show();
                C115669n.INSTANCE.mo160131h(13944, 11);
                i = 1;
            } else {
                CollectBillUI collectBillUI2 = CollectBillUI.this;
                collectBillUI2.f197768A = -32769 & collectBillUI2.f197768A;
                i = 2;
                collectBillUI2.f197776i.setImageResource(C0966R.raw.collect_sound_off);
                CollectBillUI.this.f197778n.setImageResource(C0966R.raw.collect_sound_off);
                C76701a.makeText((Context) CollectBillUI.this.getContext(), (int) C0966R.string.bgf, 1).show();
                C115669n.INSTANCE.mo160131h(13944, 12);
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(CollectBillUI.this.f197768A));
            C64334dz2 dz22 = new C64334dz2();
            dz22.f182905d = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(209, dz22));
            if (i == 1) {
                C113081b.yx0().wx0();
            } else {
                C113081b.yx0().vx0();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.collect.ui.CollectBillUI$g */
    public class C68837g implements C11184p0 {
        public C68837g() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C75479d dVar;
            if (menuItem.getItemId() == 0 && (dVar = (C75479d) CollectBillUI.this.f197771d.getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position)) != null) {
                CollectBillUI collectBillUI = CollectBillUI.this;
                String str = dVar.f221800a;
                long j = dVar.f221802c;
                collectBillUI.getClass();
                Log.m105925i("MicroMsg.CollectBillUI", "do delete, billid: %s, timestamp: %s", str, Long.valueOf(j));
                C75482m0 m0Var = new C75482m0(str, collectBillUI.f197787w, j);
                collectBillUI.f197785u = true;
                collectBillUI.doSceneForceProgress(m0Var);
            }
        }
    }

    /* renamed from: H7 */
    public final void mo94684H7() {
        this.f197771d.setVisibility(8);
        this.f197774g.setVisibility(0);
        View findViewById = findViewById(C0966R.C0970id.bgn);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: I7 */
    public final void mo94685I7(int i, int i2, long j) {
        if (this.f197785u) {
            CollectBillHeaderView collectBillHeaderView = this.f197775h;
            collectBillHeaderView.f197749d.setText(C75492u.m90528a(collectBillHeaderView.getContext(), j, this.f197787w));
            collectBillHeaderView.f197750e.setText(C75492u.m90529b(i2));
            collectBillHeaderView.f197751f.setText(collectBillHeaderView.getContext().getString(C0966R.string.bg5, new Object[]{Integer.valueOf(i)}));
            this.f197785u = false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f7010uu;
    }

    public void initView() {
        this.f197771d = (ListView) findViewById(C0966R.C0970id.f357728bh0);
        this.f197774g = (LinearLayout) findViewById(C0966R.C0970id.bgm);
        this.f197780p = (TextView) findViewById(C0966R.C0970id.bgj);
        this.f197773f = C85868k2.m106137b(this).inflate(C0966R.C0971layout.f7017v1, this.f197771d, false);
        CollectBillHeaderView collectBillHeaderView = new CollectBillHeaderView(this);
        this.f197775h = collectBillHeaderView;
        this.f197771d.addHeaderView(collectBillHeaderView, (Object) null, false);
        C76098a aVar = new C76098a(this);
        this.f197772e = aVar;
        this.f197771d.setAdapter(aVar);
        this.f197771d.setOnScrollListener(new C68832b());
        this.f197781q = new C45082x0(this);
        this.f197771d.setOnItemClickListener(new C68833c());
        this.f197771d.setOnItemLongClickListener(new C68834d());
        if (this.f197788x != 2) {
            addTextOptionMenu(0, getString(C0966R.string.f360281bg0), new C68835e());
        }
        if (this.f197788x == 2) {
            View findViewById = this.f197775h.findViewById(C0966R.C0970id.big);
            View findViewById2 = this.f197774g.findViewById(C0966R.C0970id.bif);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/collect/ui/CollectBillUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f197776i = (ImageView) this.f197775h.findViewById(C0966R.C0970id.bid);
        this.f197777j = (MMSwitchBtn) this.f197775h.findViewById(C0966R.C0970id.bie);
        this.f197778n = (ImageView) this.f197774g.findViewById(C0966R.C0970id.bid);
        this.f197779o = (MMSwitchBtn) this.f197774g.findViewById(C0966R.C0970id.bie);
        if (C113081b.yx0().Ax0()) {
            this.f197777j.setCheck(true);
            this.f197779o.setCheck(true);
            this.f197776i.setImageResource(C0966R.raw.collect_sound_on);
            this.f197778n.setImageResource(C0966R.raw.collect_sound_on);
        } else {
            this.f197777j.setCheck(false);
            this.f197779o.setCheck(false);
            this.f197776i.setImageResource(C0966R.raw.collect_sound_off);
            this.f197778n.setImageResource(C0966R.raw.collect_sound_off);
        }
        C68836f fVar = new C68836f();
        this.f197777j.setSwitchListener(fVar);
        this.f197779o.setSwitchListener(fVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f197768A = C75592q0.m90781k();
        this.f197788x = getIntent().getIntExtra("key_from_scene", 0);
        this.f197787w = getIntent().getIntExtra("key_type", 0);
        this.f197789y = getIntent().getLongExtra("key_timestamp", System.currentTimeMillis() / 1000);
        if (!this.f197784t) {
            doSceneForceProgress(new C75485o0(this.f197787w, this.f197789y, this.f197786v, this.f197790z));
            this.f197783s = true;
        }
        initView();
        setMMTitle((int) C0966R.string.bg4);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(1256, this.f197769B);
        C45533f0 f0Var = new C45533f0();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(f0Var);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, C0966R.string.f360282bg1);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(1256, this.f197769B);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C75485o0) {
            C75485o0 o0Var = (C75485o0) yVar;
            if (this.f197782r) {
                this.f197771d.removeFooterView(this.f197773f);
                this.f197782r = false;
            }
            if (i == 0 && i2 == 0) {
                this.f197784t = o0Var.f221844j;
                this.f197787w = o0Var.f221841g;
                long j = o0Var.f221840f;
                this.f197789y = j;
                mo94685I7(o0Var.f221838d, o0Var.f221839e, j);
                if (!((ArrayList) o0Var.f221842h).isEmpty()) {
                    if (Util.isNullOrNil(this.f197786v)) {
                        Log.m105918d("MicroMsg.CollectBillUI", "first query, hide block view");
                        this.f197771d.setVisibility(0);
                        this.f197774g.setVisibility(8);
                    }
                    C76098a aVar = this.f197772e;
                    ((ArrayList) aVar.f223009e).addAll(o0Var.f221842h);
                    aVar.notifyDataSetChanged();
                    List<C75479d> list = o0Var.f221842h;
                    this.f197786v = ((C75479d) ((ArrayList) list).get(((ArrayList) list).size() - 1)).f221800a;
                } else {
                    this.f197784t = true;
                    if (Util.isNullOrNil(this.f197786v)) {
                        Log.m105924i("MicroMsg.CollectBillUI", "no record, show empty view");
                        mo94684H7();
                    }
                }
                this.f197783s = false;
                return true;
            }
            Log.m105924i("MicroMsg.CollectBillUI", "net error!");
            this.f197783s = false;
            C76701a.makeText((Context) this, (int) C0966R.string.bfx, 1).show();
            if (Util.isNullOrNil(this.f197786v)) {
                Log.m105924i("MicroMsg.CollectBillUI", "first query failed, finish activity!");
            }
            return true;
        }
        if (yVar instanceof C75482m0) {
            C75482m0 m0Var = (C75482m0) yVar;
            if (i == 0 && i2 == 0) {
                C76098a aVar2 = this.f197772e;
                String str2 = m0Var.f221828f;
                Iterator it = ((ArrayList) aVar2.f223009e).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C75479d dVar = (C75479d) it.next();
                    if (dVar.f221800a.equals(str2)) {
                        ((ArrayList) aVar2.f223009e).remove(dVar);
                        aVar2.notifyDataSetChanged();
                        break;
                    }
                }
                if (this.f197772e.getCount() <= 0) {
                    Log.m105924i("MicroMsg.CollectBillUI", "delete all records");
                    mo94684H7();
                } else {
                    mo94685I7(m0Var.f221826d, m0Var.f221827e, this.f197789y);
                }
                return false;
            }
            Log.m105925i("MicroMsg.CollectBillUI", "net error, errType: %s, errCode: %s, errMsg: %s, billId: %s", Integer.valueOf(i), Integer.valueOf(i2), str, m0Var.f221828f);
            C76701a.makeText((Context) this, (int) C0966R.string.bfw, 1).show();
        }
        return false;
    }
}
