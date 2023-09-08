package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42086p0;
import com.tencent.p014mm.plugin.game.model.C42088q0;
import com.tencent.p014mm.plugin.game.p061ui.C42314f;
import com.tencent.p014mm.plugin.game.p061ui.C42319g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import te3.C50300lr1;
import te3.C50582nr1;
import te3.C50719or1;
import te3.C50864pr1;
import te3.C51001qr1;
import te3.C51144rr1;
import te3.C51287sr1;
import te3.C51434tr1;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI */
public class GameSearchUI extends MMActivity implements C11385n, C106742j1.C106756o {

    /* renamed from: x */
    public static final Pattern f114153x = Pattern.compile("\\s+");

    /* renamed from: d */
    public C106742j1 f114154d;

    /* renamed from: e */
    public ViewGroup f114155e;

    /* renamed from: f */
    public TextView f114156f;

    /* renamed from: g */
    public ProgressBar f114157g;

    /* renamed from: h */
    public ListView f114158h;

    /* renamed from: i */
    public ListView f114159i;

    /* renamed from: j */
    public View f114160j;

    /* renamed from: n */
    public C42314f f114161n;

    /* renamed from: o */
    public C42319g f114162o;

    /* renamed from: p */
    public String f114163p;

    /* renamed from: q */
    public LinkedList<String> f114164q;

    /* renamed from: r */
    public String f114165r;

    /* renamed from: s */
    public LinkedList<C117747y> f114166s = new LinkedList<>();

    /* renamed from: t */
    public boolean f114167t = false;

    /* renamed from: u */
    public int f114168u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f114169v = new C42237e();

    /* renamed from: w */
    public AdapterView.OnItemClickListener f114170w = new C42238f();

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$a */
    public class C42233a implements MenuItem.OnMenuItemClickListener {
        public C42233a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameSearchUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$b */
    public class C42234b implements View.OnTouchListener {
        public C42234b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GameSearchUI.this.f114158h.clearFocus();
            GameSearchUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/GameSearchUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$c */
    public class C42235c implements AbsListView.OnScrollListener {
        public C42235c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                GameSearchUI gameSearchUI = GameSearchUI.this;
                if (gameSearchUI.f114161n.f114425q) {
                    View view = gameSearchUI.f114160j;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    GameSearchUI gameSearchUI2 = GameSearchUI.this;
                    gameSearchUI2.mo66267H7(gameSearchUI2.f114164q, 0, false);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$d */
    public class C42236d implements View.OnTouchListener {
        public C42236d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSearchUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            GameSearchUI.this.f114159i.clearFocus();
            GameSearchUI.this.hideVKB();
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/game/ui/GameSearchUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$e */
    public class C42237e implements AdapterView.OnItemClickListener {
        public C42237e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r26, android.view.View r27, int r28, long r29) {
            /*
                r25 = this;
                r6 = r25
                r7 = r28
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r26
                r0.add(r1)
                r1 = r27
                r0.add(r1)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
                r0.add(r1)
                java.lang.Long r1 = java.lang.Long.valueOf(r29)
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/game/ui/GameSearchUI$5"
                java.lang.String r1 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r2 = "onItemClick"
                java.lang.String r3 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r4 = r25
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                com.tencent.mm.plugin.game.ui.GameSearchUI r0 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                com.tencent.mm.plugin.game.ui.f r0 = r0.f114161n
                r1 = 0
                if (r7 < 0) goto L_0x004c
                int r2 = r0.getCount()
                if (r7 < r2) goto L_0x0043
                goto L_0x004f
            L_0x0043:
                java.lang.Object r0 = r0.getItem(r7)
                com.tencent.mm.plugin.game.ui.f$b r0 = (com.tencent.p014mm.plugin.game.p061ui.C42314f.C42316b) r0
                com.tencent.mm.plugin.game.ui.f$c r0 = r0.f114449m
                goto L_0x0050
            L_0x004c:
                r0.getClass()
            L_0x004f:
                r0 = r1
            L_0x0050:
                java.lang.String r2 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r5 = "com/tencent/mm/plugin/game/ui/GameSearchUI$5"
                if (r0 != 0) goto L_0x005e
                j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                return
            L_0x005e:
                int r7 = r0.f114450a
                r8 = 1
                java.lang.String r9 = "keyword"
                java.lang.String r10 = "funtion_value"
                java.lang.String r11 = "search"
                java.lang.String r12 = "function_type"
                if (r7 != r8) goto L_0x00bf
                java.lang.String r7 = r0.f114451b
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x00bf
                android.os.Bundle r7 = new android.os.Bundle
                r7.<init>()
                java.lang.String r8 = r0.f114451b
                java.lang.String r13 = "game_app_id"
                r7.putCharSequence(r13, r8)
                int r8 = r0.f114455f
                java.lang.String r13 = "game_report_from_scene"
                r7.putInt(r13, r8)
                com.tencent.mm.plugin.game.ui.GameSearchUI r8 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                java.lang.String r13 = r0.f114451b
                r14 = 0
                int r19 = uy1.C52642c.m58996n(r8, r13, r1, r7, r14)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r1.put(r12, r11)
                java.lang.String r7 = r0.f114456g
                r1.put(r10, r7)
                com.tencent.mm.plugin.game.ui.GameSearchUI r7 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                java.lang.String r7 = r7.f114163p
                r1.put(r9, r7)
                java.lang.String r22 = qy1.C12934a.m12381c(r1)
                com.tencent.mm.plugin.game.ui.GameSearchUI r15 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                r16 = 14
                int r1 = r0.f114455f
                int r7 = r0.f114457h
                java.lang.String r0 = r0.f114451b
                int r8 = r15.f114168u
                r17 = r1
                r18 = r7
                r20 = r0
                r21 = r8
                com.tencent.p014mm.game.report.C40314g.m43487f(r15, r16, r17, r18, r19, r20, r21, r22)
                goto L_0x0111
            L_0x00bf:
                int r1 = r0.f114450a
                r7 = 2
                if (r1 != r7) goto L_0x0111
                java.lang.String r1 = r0.f114452c
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0111
                com.tencent.mm.plugin.game.ui.GameSearchUI r1 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                java.lang.String r7 = r0.f114452c
                java.lang.String r8 = "game_center_detail"
                int r17 = uy1.C52642c.m59002t(r1, r7, r8)
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r1.put(r12, r11)
                java.lang.String r7 = r0.f114456g
                r1.put(r10, r7)
                com.tencent.mm.plugin.game.ui.GameSearchUI r7 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                java.lang.String r7 = r7.f114163p
                r1.put(r9, r7)
                java.lang.String r24 = qy1.C12934a.m12381c(r1)
                com.tencent.mm.plugin.game.ui.GameSearchUI r13 = com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.this
                r14 = 14
                int r15 = r0.f114455f
                int r1 = r0.f114457h
                r18 = 0
                java.lang.String r7 = r0.f114451b
                int r8 = r13.f114168u
                int r9 = r0.f114453d
                int r0 = r0.f114454e
                java.lang.String r22 = java.lang.String.valueOf(r0)
                r23 = 0
                r16 = r1
                r19 = r7
                r20 = r8
                r21 = r9
                com.tencent.p014mm.game.report.C40314g.m43485d(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            L_0x0111:
                j20.C117292a.m165361g(r6, r5, r4, r3, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameSearchUI.C42237e.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI$f */
    public class C42238f implements AdapterView.OnItemClickListener {
        public C42238f() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C42319g.C42320a aVar = ((C42319g) adapterView.getAdapter()).f114462f.get(i);
            if (Util.isNullOrNil(aVar.f114464b)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (Util.isNullOrNil(aVar.f114465c)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(aVar.f114464b);
                GameSearchUI gameSearchUI = GameSearchUI.this;
                Pattern pattern = GameSearchUI.f114153x;
                gameSearchUI.mo66267H7(linkedList, 2, true);
                GameSearchUI.this.mo66268I7(1);
            } else {
                int i2 = aVar.f114467e;
                if (i2 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("game_app_id", aVar.f114465c);
                    bundle.putInt("game_report_from_scene", 1402);
                    int n = C52642c.m58996n(GameSearchUI.this, aVar.f114465c, (String) null, bundle, 0);
                    GameSearchUI gameSearchUI2 = GameSearchUI.this;
                    C40314g.m43487f(gameSearchUI2, 14, 1402, i, n, aVar.f114465c, gameSearchUI2.f114168u, (String) null);
                } else if (i2 != 2) {
                    Log.m105920e("MicroMsg.GameSearchUI", "unknowed actionType : " + aVar.f114467e);
                } else {
                    int t = C52642c.m59002t(GameSearchUI.this.getContext(), aVar.f114468f, "game_center_detail");
                    GameSearchUI gameSearchUI3 = GameSearchUI.this;
                    C40314g.m43487f(gameSearchUI3, 14, 1402, i, t, aVar.f114465c, gameSearchUI3.f114168u, (String) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameSearchUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        hideVKB();
        onBackPressed();
    }

    /* renamed from: H7 */
    public final void mo66267H7(LinkedList<String> linkedList, int i, boolean z) {
        while (!this.f114166s.isEmpty()) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123458d(this.f114166s.pop());
        }
        if (z) {
            C42314f fVar = this.f114161n;
            fVar.f114424p = 0;
            fVar.f114425q = false;
        }
        this.f114164q = linkedList;
        C42086p0 p0Var = new C42086p0(LocaleUtil.getApplicationLanguage(), linkedList, C42046d.m45746e(this), this.f114161n.f114424p);
        C86709a0.m107524d().mo123460f(p0Var);
        this.f114166s.add(p0Var);
        Iterator<String> it = linkedList.iterator();
        this.f114163p = "";
        while (it.hasNext()) {
            this.f114163p += " " + it.next();
        }
        String trim = this.f114163p.trim();
        this.f114163p = trim;
        if (i == 1 || i == 2) {
            this.f114167t = true;
            this.f114154d.mo23884r(trim);
        }
    }

    /* renamed from: I7 */
    public final void mo66268I7(int i) {
        switch (i) {
            case 0:
                this.f114155e.setVisibility(8);
                this.f114156f.setVisibility(8);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(8);
                return;
            case 1:
                hideVKB();
                ListView listView = this.f114158h;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                ListView listView2 = listView;
                C117292a.m165358d(listView2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(listView2, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f114154d.mo153849a();
                this.f114155e.setVisibility(8);
                this.f114156f.setVisibility(8);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(0);
                return;
            case 2:
                this.f114155e.setVisibility(8);
                if (this.f114161n.getCount() > 0) {
                    this.f114156f.setVisibility(8);
                    this.f114158h.setVisibility(0);
                } else {
                    this.f114156f.setVisibility(0);
                    this.f114158h.setVisibility(8);
                }
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(8);
                return;
            case 3:
                this.f114155e.setVisibility(0);
                this.f114156f.setVisibility(8);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(8);
                return;
            case 4:
                this.f114155e.setVisibility(8);
                this.f114156f.setVisibility(0);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(8);
                return;
            case 5:
                this.f114155e.setVisibility(8);
                this.f114156f.setVisibility(8);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(0);
                this.f114157g.setVisibility(8);
                return;
            case 6:
                ListView listView3 = this.f114158h;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                ListView listView4 = listView3;
                C117292a.m165358d(listView4, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView3.smoothScrollToPosition(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(listView4, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f114155e.setVisibility(8);
                this.f114156f.setVisibility(8);
                this.f114158h.setVisibility(8);
                this.f114159i.setVisibility(8);
                this.f114157g.setVisibility(0);
                return;
            default:
                return;
        }
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        if (Util.isNullOrNil(str)) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        String[] split = f114153x.split(str.replace('*', ' '));
        for (String add : split) {
            linkedList.add(add);
        }
        mo66267H7(linkedList, 0, true);
        mo66268I7(1);
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.axp;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    public void initView() {
        setBackBtn(new C42233a());
        C106742j1 j1Var = new C106742j1();
        this.f114154d = j1Var;
        j1Var.mo153851c(true);
        this.f114154d.f319122j = this;
        this.f114155e = (ViewGroup) findViewById(C0966R.C0970id.f359523lc2);
        this.f114157g = (ProgressBar) findViewById(C0966R.C0970id.j6q);
        this.f114156f = (TextView) findViewById(C0966R.C0970id.hgp);
        this.f114158h = (ListView) findViewById(C0966R.C0970id.j6t);
        C42314f fVar = new C42314f(this, (ArrayList<C42314f.C42316b>) null);
        this.f114161n = fVar;
        this.f114158h.setAdapter(fVar);
        this.f114158h.setOnItemClickListener(this.f114169v);
        this.f114158h.setOnTouchListener(new C42234b());
        this.f114158h.setOnScrollListener(new C42235c());
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.awy, this.f114158h, false);
        this.f114160j = inflate;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f114158h.addFooterView(this.f114160j);
        this.f114159i = (ListView) findViewById(C0966R.C0970id.j6r);
        C42319g gVar = new C42319g(this);
        this.f114162o = gVar;
        this.f114159i.setAdapter(gVar);
        this.f114159i.setOnItemClickListener(this.f114170w);
        this.f114159i.setOnTouchListener(new C42236d());
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        if (this.f114167t) {
            this.f114167t = false;
            return;
        }
        String str2 = this.f114165r;
        if (str2 == null || !str2.equals(Util.nullAsNil(str))) {
            this.f114165r = str;
            if (Util.isNullOrNil(str)) {
                while (!this.f114166s.isEmpty()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123458d(this.f114166s.pop());
                }
                C42088q0 q0Var = new C42088q0(LocaleUtil.getApplicationLanguage(), str, C42046d.m45746e(this));
                C86709a0.m107524d().mo123460f(q0Var);
                this.f114166s.add(q0Var);
                return;
            }
            LinkedList linkedList = new LinkedList();
            String[] split = f114153x.split(str.replace('*', ' '));
            for (String add : split) {
                linkedList.add(add);
            }
            mo66267H7(linkedList, 0, true);
            mo66268I7(6);
            return;
        }
        Log.m105918d("MicroMsg.GameSearchUI", "repeat searchChange");
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        long currentTimeMillis = System.currentTimeMillis();
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameSearchUI", "account not ready");
            finish();
            return;
        }
        C41864d.m45384a(this);
        C86709a0.m107524d().mo123455a(1328, this);
        C86709a0.m107524d().mo123455a(1329, this);
        this.f114168u = getIntent().getIntExtra("game_report_from_scene", 0);
        initView();
        C40314g.m43484c(this, 14, 1401, 0, 2, this.f114168u, (String) null);
        Log.m105924i("MicroMsg.GameSearchUI", "[onCreate] time:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.f114154d.mo23882j(this, menu);
        this.f114154d.mo153859q("");
        return true;
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameSearchUI", "onDestroy");
        super.onDestroy();
        C41864d.m45388e(this);
        C86709a0.m107524d().mo123470p(1328, this);
        C86709a0.m107524d().mo123470p(1329, this);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.f114154d.mo153858m(this, menu);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<C51434tr1> linkedList;
        LinkedList<C50300lr1> linkedList2;
        LinkedList<C51287sr1> linkedList3;
        String str2;
        C117747y yVar2 = yVar;
        if (!yVar.isCanceled()) {
            if (this.f114166s.contains(yVar2)) {
                this.f114166s.remove(yVar2);
            }
            View view = this.f114160j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int i3 = 0;
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int type = yVar.getType();
            if (type == 1328) {
                C42086p0 p0Var = (C42086p0) yVar2;
                C50864pr1 pr12 = (C50864pr1) p0Var.f113386e.f127055a.f127080a;
                Log.m105919d("MicroMsg.GameSearchUI", "keywords = %s, offset = %d", pr12.f139911d, Integer.valueOf(pr12.f139915h));
                if (i == 0 && i2 == 0) {
                    C51001qr1 qr12 = (C51001qr1) p0Var.f113386e.f127056b.f127083a;
                    LinkedList<C51144rr1> linkedList4 = qr12 != null ? qr12.f140507d : null;
                    if (!Util.isNullOrNil((List) linkedList4)) {
                        String str3 = this.f114163p;
                        C42314f fVar = this.f114161n;
                        if (fVar.f114424p != 0) {
                            Iterator<C51144rr1> it = linkedList4.iterator();
                            while (it.hasNext()) {
                                C51144rr1 next = it.next();
                                if (next.f141088e != 3 || Util.isNullOrNil((List) next.f141090g)) {
                                    fVar.f114425q = false;
                                } else {
                                    fVar.f114424p = next.f141094n;
                                    fVar.f114425q = next.f141095o;
                                    Iterator<C51434tr1> it4 = next.f141090g.iterator();
                                    while (it4.hasNext()) {
                                        C42314f.C42316b a = C42314f.C42316b.m46011a(it4.next());
                                        C42314f.C42317c cVar = a.f114449m;
                                        cVar.f114451b = a.f114437a;
                                        cVar.f114453d = a.f114445i;
                                        cVar.f114454e = a.f114446j;
                                        cVar.f114456g = "2";
                                        int i4 = fVar.f114420i;
                                        fVar.f114420i = i4 + 1;
                                        cVar.f114457h = i4 + 301;
                                        cVar.f114455f = fVar.f114415d ? 1403 : 1405;
                                        fVar.f114422n.add(a);
                                    }
                                }
                            }
                        } else {
                            if (fVar.f114422n == null) {
                                fVar.f114422n = new ArrayList<>();
                            }
                            fVar.f114417f = 0;
                            fVar.f114418g = 0;
                            fVar.f114419h = 0;
                            fVar.f114420i = 0;
                            fVar.f114415d = false;
                            fVar.f114416e = false;
                            fVar.f114425q = false;
                            fVar.f114424p = 0;
                            fVar.f114422n.clear();
                            fVar.f114426r = false;
                            Iterator<C51144rr1> it5 = linkedList4.iterator();
                            while (it5.hasNext()) {
                                C51144rr1 next2 = it5.next();
                                LinkedList<C50300lr1> linkedList5 = next2.f141089f;
                                boolean z = linkedList5 == null || linkedList5.size() == 0;
                                LinkedList<C51434tr1> linkedList6 = next2.f141090g;
                                boolean z2 = linkedList6 == null || linkedList6.size() == 0;
                                LinkedList<C51287sr1> linkedList7 = next2.f141093j;
                                if (!(z && z2 && (linkedList7 == null || linkedList7.size() == 0))) {
                                    ArrayList<C42314f.C42316b> arrayList = fVar.f114422n;
                                    String str4 = next2.f141087d;
                                    C42314f.C42316b bVar = new C42314f.C42316b();
                                    bVar.f114447k = i3;
                                    bVar.f114438b = str4;
                                    bVar.f114449m = new C42314f.C42317c();
                                    arrayList.add(bVar);
                                    if (!fVar.f114426r) {
                                        ArrayList<C42314f.C42316b> arrayList2 = fVar.f114422n;
                                        arrayList2.get(arrayList2.size() - 1).f114448l = true;
                                        fVar.f114426r = true;
                                    }
                                    if (next2.f141088e == 4 && (linkedList3 = next2.f141093j) != null) {
                                        Iterator<C51287sr1> it6 = linkedList3.iterator();
                                        while (it6.hasNext()) {
                                            C51287sr1 next3 = it6.next();
                                            C42314f.C42316b bVar2 = new C42314f.C42316b();
                                            bVar2.f114447k = 3;
                                            C50300lr1 lr12 = next3.f141698d;
                                            String str5 = lr12.f137611d;
                                            bVar2.f114437a = str5;
                                            bVar2.f114438b = lr12.f137612e;
                                            bVar2.f114439c = lr12.f137613f;
                                            bVar2.f114440d = lr12.f137614g;
                                            bVar2.f114441e = lr12.f137615h;
                                            int i5 = lr12.f137617j;
                                            String str6 = lr12.f137618n;
                                            bVar2.f114444h = next3.f141699e;
                                            C42314f.C42317c cVar2 = new C42314f.C42317c(i5, 4, str5, str6);
                                            bVar2.f114449m = cVar2;
                                            cVar2.f114456g = "3";
                                            int i6 = fVar.f114419h;
                                            fVar.f114419h = i6 + 1;
                                            cVar2.f114457h = i6 + 601;
                                            fVar.f114422n.add(bVar2);
                                        }
                                    }
                                    int i7 = next2.f141088e;
                                    if ((i7 == 1 || i7 == 2) && (linkedList2 = next2.f141089f) != null) {
                                        Iterator<C50300lr1> it7 = linkedList2.iterator();
                                        while (it7.hasNext()) {
                                            C50300lr1 next4 = it7.next();
                                            C42314f.C42316b bVar3 = new C42314f.C42316b();
                                            bVar3.f114447k = 1;
                                            String str7 = next4.f137611d;
                                            bVar3.f114437a = str7;
                                            bVar3.f114438b = next4.f137612e;
                                            bVar3.f114439c = next4.f137613f;
                                            bVar3.f114440d = next4.f137614g;
                                            bVar3.f114441e = next4.f137615h;
                                            C42314f.C42317c cVar3 = new C42314f.C42317c(next4.f137617j, 1, str7, next4.f137618n);
                                            bVar3.f114449m = cVar3;
                                            int i8 = next2.f141088e;
                                            if (i8 == 1) {
                                                fVar.f114415d = true;
                                                int i9 = fVar.f114417f + 1;
                                                fVar.f114417f = i9;
                                                cVar3.f114457h = i9;
                                            } else if (i8 == 2) {
                                                fVar.f114416e = true;
                                                int i15 = fVar.f114418g + 1;
                                                fVar.f114418g = i15;
                                                cVar3.f114457h = i15;
                                            }
                                            cVar3.f114456g = "1";
                                            fVar.f114422n.add(bVar3);
                                        }
                                    } else if (i7 == 3 && (linkedList = next2.f141090g) != null) {
                                        fVar.f114424p = next2.f141094n;
                                        fVar.f114425q = next2.f141095o;
                                        Iterator<C51434tr1> it8 = linkedList.iterator();
                                        while (it8.hasNext()) {
                                            C42314f.C42316b a2 = C42314f.C42316b.m46011a(it8.next());
                                            C42314f.C42317c cVar4 = a2.f114449m;
                                            cVar4.f114451b = a2.f114437a;
                                            cVar4.f114453d = a2.f114445i;
                                            cVar4.f114454e = a2.f114446j;
                                            cVar4.f114456g = "2";
                                            int i16 = fVar.f114420i;
                                            fVar.f114420i = i16 + 1;
                                            cVar4.f114457h = i16 + 301;
                                            fVar.f114422n.add(a2);
                                        }
                                    }
                                    if (!Util.isNullOrNil(next2.f141091h) && !Util.isNullOrNil(next2.f141092i) && next2.f141088e == 1) {
                                        String str8 = next2.f141091h;
                                        String str9 = next2.f141092i;
                                        C42314f.C42316b bVar4 = new C42314f.C42316b();
                                        bVar4.f114447k = 5;
                                        bVar4.f114438b = str8;
                                        C42314f.C42317c cVar5 = new C42314f.C42317c(2, str9);
                                        bVar4.f114449m = cVar5;
                                        cVar5.f114451b = "wx62d9035fd4fd2059";
                                        cVar5.f114456g = "1";
                                        cVar5.f114457h = 300;
                                        fVar.f114422n.add(bVar4);
                                    }
                                    i3 = 0;
                                } else if (next2.f141088e == 1) {
                                    if (!Util.isNullOrNil(str3)) {
                                        Context context = fVar.f114421j;
                                        Object[] objArr = new Object[1];
                                        objArr[i3] = str3;
                                        str2 = context.getString(C0966R.string.fbq, objArr);
                                    } else {
                                        str2 = fVar.f114421j.getString(C0966R.string.fbp);
                                    }
                                    ArrayList<C42314f.C42316b> arrayList3 = fVar.f114422n;
                                    C42314f.C42316b bVar5 = new C42314f.C42316b();
                                    bVar5.f114447k = 6;
                                    bVar5.f114438b = str2;
                                    bVar5.f114449m = new C42314f.C42317c();
                                    arrayList3.add(bVar5);
                                    fVar.f114426r = true;
                                }
                            }
                            Iterator<C42314f.C42316b> it9 = fVar.f114422n.iterator();
                            while (it9.hasNext()) {
                                C42314f.C42316b next5 = it9.next();
                                if (fVar.f114415d) {
                                    next5.f114449m.f114455f = 1403;
                                } else if (fVar.f114416e) {
                                    next5.f114449m.f114455f = 1404;
                                } else {
                                    next5.f114449m.f114455f = 1405;
                                }
                            }
                            fVar.notifyDataSetChanged();
                        }
                    }
                }
                mo66268I7(2);
            } else if (type == 1329 && i == 0 && i2 == 0) {
                C42088q0 q0Var = (C42088q0) yVar2;
                String str10 = q0Var.f113392f;
                C50582nr1 nr12 = (C50582nr1) q0Var.f113391e.f127056b.f127083a;
                String str11 = nr12.f138734d;
                LinkedList<C50719or1> linkedList8 = nr12.f138739i;
                C42319g gVar = this.f114162o;
                gVar.getClass();
                if (!Util.isNullOrNil((List) linkedList8)) {
                    gVar.f114461e = str10;
                    gVar.f114462f.clear();
                    if (Util.isNullOrNil(str10)) {
                        C42319g.C42320a aVar2 = new C42319g.C42320a();
                        aVar2.f114463a = 1;
                        if (!Util.isNullOrNil(str11)) {
                            aVar2.f114464b = str11;
                        } else {
                            aVar2.f114464b = gVar.f114460d.getString(C0966R.string.fbr);
                        }
                        gVar.f114462f.add(aVar2);
                    }
                    Iterator<C50719or1> it10 = linkedList8.iterator();
                    while (it10.hasNext()) {
                        C50719or1 next6 = it10.next();
                        C42319g.C42320a aVar3 = new C42319g.C42320a();
                        aVar3.f114463a = Util.isNullOrNil(str10) ? 2 : 3;
                        aVar3.f114465c = next6.f139331d;
                        aVar3.f114464b = next6.f139332e;
                        aVar3.f114466d = next6.f139333f;
                        aVar3.f114467e = next6.f139334g;
                        aVar3.f114468f = next6.f139335h;
                        gVar.f114462f.add(aVar3);
                    }
                    gVar.notifyDataSetChanged();
                }
                mo66268I7(5);
            }
        }
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
