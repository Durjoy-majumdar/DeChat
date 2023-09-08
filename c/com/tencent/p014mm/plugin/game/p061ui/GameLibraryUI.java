package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1915z5;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42046d;
import com.tencent.p014mm.plugin.game.model.C42075l0;
import com.tencent.p014mm.plugin.game.model.C42118v0;
import com.tencent.p014mm.plugin.game.p061ui.C42307d;
import com.tencent.p014mm.plugin.game.p061ui.GameDropdownView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.soter.core.biometric.FaceManager;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import pe3.C47465a;
import ry1.C48130k0;
import ry1.C48132l0;
import sw1.C48484q;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI */
public class GameLibraryUI extends MMActivity implements C11385n {

    /* renamed from: J */
    public static final /* synthetic */ int f114010J = 0;

    /* renamed from: A */
    public int f114011A = 0;

    /* renamed from: B */
    public int f114012B = C1915z5.CTRL_INDEX;

    /* renamed from: C */
    public int f114013C = 0;

    /* renamed from: D */
    public C48130k0 f114014D = new C48130k0();

    /* renamed from: E */
    public C42307d.C42311d f114015E = new C42208c();

    /* renamed from: F */
    public View.OnClickListener f114016F = new C42209d();

    /* renamed from: G */
    public View.OnClickListener f114017G = new C42210e();

    /* renamed from: H */
    public GameDropdownView.C42191b f114018H = new C42211f();

    /* renamed from: I */
    public AbsListView.OnScrollListener f114019I = new C42212g();

    /* renamed from: d */
    public ListView f114020d;

    /* renamed from: e */
    public C42241c f114021e;

    /* renamed from: f */
    public GameBannerView f114022f;

    /* renamed from: g */
    public GameLibraryCategoriesView f114023g;

    /* renamed from: h */
    public View f114024h;

    /* renamed from: i */
    public TextView f114025i;

    /* renamed from: j */
    public View f114026j;

    /* renamed from: n */
    public GameDropdownView f114027n;

    /* renamed from: o */
    public HashMap<Integer, String> f114028o;

    /* renamed from: p */
    public int f114029p = 0;

    /* renamed from: q */
    public boolean f114030q = false;

    /* renamed from: r */
    public boolean f114031r = false;

    /* renamed from: s */
    public int f114032s = 0;

    /* renamed from: t */
    public boolean f114033t = true;

    /* renamed from: u */
    public View f114034u;

    /* renamed from: v */
    public View f114035v;

    /* renamed from: w */
    public Button f114036w;

    /* renamed from: x */
    public boolean f114037x = false;

    /* renamed from: y */
    public Dialog f114038y;

    /* renamed from: z */
    public boolean f114039z = true;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$a */
    public class C42206a implements MenuItem.OnMenuItemClickListener {
        public C42206a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameLibraryUI gameLibraryUI = GameLibraryUI.this;
            int i = GameLibraryUI.f114010J;
            gameLibraryUI.mo66229J7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$b */
    public class C42207b implements MenuItem.OnMenuItemClickListener {
        public C42207b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent intent = new Intent(GameLibraryUI.this, GameSearchUI.class);
            intent.putExtra("game_report_from_scene", 1109);
            GameLibraryUI gameLibraryUI = GameLibraryUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            GameLibraryUI gameLibraryUI2 = gameLibraryUI;
            C117292a.m165358d(gameLibraryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            gameLibraryUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(gameLibraryUI2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$c */
    public class C42208c implements C42307d.C42311d {
        public C42208c() {
        }

        /* renamed from: a */
        public void mo66127a(int i) {
            int firstVisiblePosition = GameLibraryUI.this.f114020d.getFirstVisiblePosition();
            GameLibraryUI gameLibraryUI = GameLibraryUI.this;
            int i2 = firstVisiblePosition - gameLibraryUI.f114013C;
            int lastVisiblePosition = gameLibraryUI.f114020d.getLastVisiblePosition();
            GameLibraryUI gameLibraryUI2 = GameLibraryUI.this;
            int i3 = lastVisiblePosition - gameLibraryUI2.f114013C;
            if (i >= i2 && i <= i3) {
                GameLibraryUI.this.f114021e.mo66380l(gameLibraryUI2.f114020d.getChildAt(i - i2), i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$d */
    public class C42209d implements View.OnClickListener {
        public C42209d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameLibraryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52642c.m58982C(view, GameLibraryUI.this);
            GameLibraryUI gameLibraryUI = GameLibraryUI.this;
            C40314g.m43484c(gameLibraryUI, 11, 1110, 999, 7, gameLibraryUI.f114011A, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$e */
    public class C42210e implements View.OnClickListener {
        public C42210e() {
        }

        public void onClick(View view) {
            int i;
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof String) {
                C52642c.m58982C(view2, GameLibraryUI.this);
                i = 7;
            } else {
                Intent intent = new Intent(GameLibraryUI.this, GameCategoryUI.class);
                intent.putExtra("extra_type", 2);
                intent.putExtra("extra_category_name", GameLibraryUI.this.getString(C0966R.string.f9u));
                intent.putExtra("game_report_from_scene", FaceManager.FACE_ACQUIRED_LEFT);
                GameLibraryUI gameLibraryUI = GameLibraryUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                GameLibraryUI gameLibraryUI2 = gameLibraryUI;
                C117292a.m165358d(gameLibraryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                gameLibraryUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(gameLibraryUI2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                i = 6;
            }
            GameLibraryUI gameLibraryUI3 = GameLibraryUI.this;
            C40314g.m43484c(gameLibraryUI3, 11, FaceManager.FACE_ACQUIRED_LEFT, 1, i, gameLibraryUI3.f114011A, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$f */
    public class C42211f implements GameDropdownView.C42191b {
        public C42211f() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$g */
    public class C42212g implements AbsListView.OnScrollListener {
        public C42212g() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            if (i == 0 && absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                GameLibraryUI gameLibraryUI = GameLibraryUI.this;
                if (!gameLibraryUI.f114033t || gameLibraryUI.f114031r) {
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
                    return;
                }
                View view = gameLibraryUI.f114034u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameLibraryUI.this.mo66228I7();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI$8", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$h */
    public class C42213h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f114047d;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameLibraryUI$h$a */
        public class C42214a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42075l0 f114049d;

            public C42214a(C42075l0 l0Var) {
                this.f114049d = l0Var;
            }

            public void run() {
                GameLibraryUI gameLibraryUI = GameLibraryUI.this;
                GameLibraryUI.m45881H7(gameLibraryUI, this.f114049d, gameLibraryUI.f114032s != 0);
                GameLibraryUI gameLibraryUI2 = GameLibraryUI.this;
                gameLibraryUI2.f114031r = false;
                View view = gameLibraryUI2.f114034u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameLibraryUI$9$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                GameLibraryUI gameLibraryUI3 = GameLibraryUI.this;
                gameLibraryUI3.f114032s += 15;
                Dialog dialog = gameLibraryUI3.f114038y;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public C42213h(C47465a aVar) {
            this.f114047d = aVar;
        }

        public void run() {
            C47465a aVar = this.f114047d;
            GameLibraryUI gameLibraryUI = GameLibraryUI.this;
            int i = gameLibraryUI.f114032s;
            C42075l0 l0Var = new C42075l0(aVar, i == 0 && !gameLibraryUI.f114030q, true, i);
            GameLibraryUI.this.f114030q = true;
            MMHandlerThread.postToMainThread(new C42214a(l0Var));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c6, code lost:
        r14 = r14.f127903e;
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45881H7(com.tencent.p014mm.plugin.game.p061ui.GameLibraryUI r12, com.tencent.p014mm.plugin.game.model.C42075l0 r13, boolean r14) {
        /*
            r12.getClass()
            py1.j2 r0 = r13.f113366a
            boolean r1 = r0.f127810f
            r12.f114033t = r1
            r1 = 1
            r2 = 0
            java.lang.String r3 = "MicroMsg.GameLibraryUI"
            if (r14 != 0) goto L_0x0257
            com.tencent.mm.plugin.game.ui.GameBannerView r14 = r12.f114022f
            py1.o3 r0 = r0.f127808d
            r4 = 0
            if (r0 == 0) goto L_0x005a
            java.util.LinkedList<py1.d> r0 = r0.f127902d
            if (r0 != 0) goto L_0x001b
            goto L_0x005a
        L_0x001b:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5 = 0
        L_0x0021:
            py1.j2 r6 = r13.f113366a
            py1.o3 r6 = r6.f127808d
            java.util.LinkedList<py1.d> r6 = r6.f127902d
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x0062
            com.tencent.mm.plugin.game.ui.GameBannerView$b r6 = new com.tencent.mm.plugin.game.ui.GameBannerView$b
            r6.<init>()
            py1.j2 r7 = r13.f113366a
            py1.o3 r7 = r7.f127808d
            java.util.LinkedList<py1.d> r7 = r7.f127902d
            java.lang.Object r7 = r7.get(r5)
            py1.d r7 = (py1.C47561d) r7
            py1.h r8 = r7.f127629d
            com.tencent.mm.plugin.game.model.b r8 = com.tencent.p014mm.plugin.game.model.C42056f0.m45762a(r8)
            if (r8 != 0) goto L_0x0047
            goto L_0x0057
        L_0x0047:
            uy1.C52644e.m59021b(r8)
            r6.f113634a = r8
            java.lang.String r8 = r7.f127630e
            r6.f113635b = r8
            java.lang.String r7 = r7.f127631f
            r6.f113636c = r7
            r0.add(r6)
        L_0x0057:
            int r5 = r5 + 1
            goto L_0x0021
        L_0x005a:
            java.lang.String r0 = "MicroMsg.GamePBDataLibrary"
            java.lang.String r5 = "Has no banner"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r5)
            r0 = r4
        L_0x0062:
            r14.setBannerList(r0)
            com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView r14 = r12.f114023g
            py1.j2 r0 = r13.f113366a
            py1.o3 r0 = r0.f127808d
            if (r0 == 0) goto L_0x00aa
            java.util.LinkedList<py1.v> r0 = r0.f127904f
            if (r0 != 0) goto L_0x0072
            goto L_0x00aa
        L_0x0072:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            py1.j2 r5 = r13.f113366a
            py1.o3 r5 = r5.f127808d
            java.util.LinkedList<py1.v> r5 = r5.f127904f
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0082:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r7 = r5.next()
            py1.v r7 = (py1.C47686v) r7
            com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView$a r8 = new com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView$a
            r8.<init>()
            int r9 = r7.f128065d
            r8.f114005a = r9
            java.lang.String r9 = r7.f128066e
            r8.f114007c = r9
            java.lang.String r9 = r7.f128068g
            r8.f114008d = r9
            java.lang.String r7 = r7.f128067f
            r8.f114006b = r7
            int r6 = r6 + r1
            r8.f114009e = r6
            r0.add(r8)
            goto L_0x0082
        L_0x00aa:
            r0 = r4
        L_0x00ab:
            r14.setData(r0)
            com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView r14 = r12.f114023g
            int r0 = r12.f114011A
            r14.setSourceScene(r0)
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.util.LinkedList<com.tencent.mm.plugin.game.model.b> r0 = r13.f113367b
            java.util.LinkedList<com.tencent.mm.plugin.game.model.b> r5 = r13.f113368c
            r14.addAll(r0)
            r14.addAll(r5)
            com.tencent.mm.plugin.game.ui.c r6 = r12.f114021e
            r6.getClass()
            ry1.n0 r7 = new ry1.n0
            r7.<init>(r6, r14)
            java.lang.String r14 = "game_get_download_info"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r7, r14)
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            int r6 = r0.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r2] = r6
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r14[r1] = r5
            java.lang.String r5 = "Initial new game list size: %d, initial all game list size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r14)
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>()
            py1.j2 r3 = r13.f113366a
            py1.o3 r3 = r3.f127808d
            if (r3 == 0) goto L_0x011b
            java.util.LinkedList<py1.q4> r3 = r3.f127906h
            if (r3 != 0) goto L_0x00ff
            goto L_0x011b
        L_0x00ff:
            java.util.Iterator r3 = r3.iterator()
        L_0x0103:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x011b
            java.lang.Object r5 = r3.next()
            py1.q4 r5 = (py1.C47657q4) r5
            int r6 = r5.f127951d
            java.lang.String r5 = r5.f127952e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.put(r6, r5)
            goto L_0x0103
        L_0x011b:
            r12.f114028o = r14
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r12.f114028o
            java.util.Collection r3 = r3.values()
            r14.addAll(r3)
            com.tencent.mm.plugin.game.ui.GameDropdownView r3 = r12.f114027n
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.HashMap<java.lang.Integer, java.lang.String> r6 = r12.f114028o
            java.util.Set r6 = r6.keySet()
            r5.addAll(r6)
            int r6 = r12.f114029p
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r5 = r5.indexOf(r6)
            r3.getClass()
            int r6 = r14.size()
            if (r6 != 0) goto L_0x0156
            java.lang.String r14 = "MicroMsg.GameDropdownView"
            java.lang.String r3 = "No menu item"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r3)
            goto L_0x01c0
        L_0x0156:
            r3.f113854f = r14
            int r6 = r14.size()
            int r6 = r6 + -1
            r3.f113856h = r6
            if (r5 < 0) goto L_0x0168
            if (r5 <= r6) goto L_0x0165
            goto L_0x0168
        L_0x0165:
            r3.f113855g = r5
            goto L_0x016a
        L_0x0168:
            r3.f113855g = r2
        L_0x016a:
            android.content.Context r5 = r3.f113852d
            java.lang.String r6 = "layout_inflater"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.LayoutInflater r5 = (android.view.LayoutInflater) r5
            r6 = 2131495854(0x7f0c0bae, float:1.8615256E38)
            android.view.View r6 = r5.inflate(r6, r4)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r7 = 0
        L_0x017e:
            int r8 = r14.size()
            if (r7 >= r8) goto L_0x01b8
            java.lang.Object r8 = r14.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            r9 = 2131495855(0x7f0c0baf, float:1.8615258E38)
            android.view.View r9 = r5.inflate(r9, r6, r2)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9.setText(r8)
            android.view.View$OnClickListener r10 = r3.f113859n
            r9.setOnClickListener(r10)
            int r10 = r3.f113855g
            if (r7 != r10) goto L_0x01b2
            android.content.Context r10 = r3.f113852d
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131101252(0x7f060644, float:1.7814908E38)
            int r10 = r10.getColor(r11)
            r9.setTextColor(r10)
            r3.setText(r8)
        L_0x01b2:
            r6.addView(r9)
            int r7 = r7 + 1
            goto L_0x017e
        L_0x01b8:
            com.tencent.mm.plugin.game.ui.GameDropdownView$c r14 = r3.f113853e
            r14.setContentView(r6)
            r3.setVisibility(r2)
        L_0x01c0:
            py1.j2 r14 = r13.f113366a
            py1.o3 r14 = r14.f127808d
            if (r14 == 0) goto L_0x01d5
            py1.z3 r14 = r14.f127903e
            if (r14 != 0) goto L_0x01cb
            goto L_0x01d5
        L_0x01cb:
            java.lang.String r3 = r14.f128186f
            java.lang.String r14 = r14.f128185e
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r3, r14)
            goto L_0x01d6
        L_0x01d5:
            r5 = r4
        L_0x01d6:
            if (r5 == 0) goto L_0x0202
            java.lang.Object r14 = r5.first
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0202
            java.lang.Object r14 = r5.second
            java.lang.String r14 = (java.lang.String) r14
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0202
            android.view.View r14 = r12.f114024h
            java.lang.Object r3 = r5.second
            r14.setTag(r3)
            android.widget.TextView r14 = r12.f114025i
            r14.setVisibility(r2)
            android.widget.TextView r14 = r12.f114025i
            java.lang.Object r3 = r5.first
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r14.setText(r3)
            goto L_0x020e
        L_0x0202:
            android.view.View r14 = r12.f114024h
            r14.setTag(r4)
            android.widget.TextView r14 = r12.f114025i
            r3 = 8
            r14.setVisibility(r3)
        L_0x020e:
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            int r3 = r0.size()
            if (r3 == 0) goto L_0x021e
            android.view.View r3 = r12.f114024h
            r14.put(r2, r3)
        L_0x021e:
            int r0 = r0.size()
            android.view.View r3 = r12.f114026j
            r14.put(r0, r3)
            com.tencent.mm.plugin.game.ui.c r0 = r12.f114021e
            r0.f114393s = r14
            r0.notifyDataSetChanged()
            py1.j2 r13 = r13.f113366a
            py1.o3 r13 = r13.f127808d
            if (r13 == 0) goto L_0x0242
            py1.u3 r13 = r13.f127905g
            if (r13 != 0) goto L_0x0239
            goto L_0x0242
        L_0x0239:
            java.lang.String r14 = r13.f128059d
            java.lang.String r13 = r13.f128060e
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r14, r13)
        L_0x0242:
            if (r4 == 0) goto L_0x027e
            android.widget.Button r13 = r12.f114036w
            java.lang.Object r14 = r4.first
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r13.setText(r14)
            android.widget.Button r13 = r12.f114036w
            java.lang.Object r14 = r4.second
            r13.setTag(r14)
            r12.f114037x = r1
            goto L_0x027e
        L_0x0257:
            java.util.LinkedList<com.tencent.mm.plugin.game.model.b> r13 = r13.f113368c
            com.tencent.mm.plugin.game.ui.c r14 = r12.f114021e
            r14.getClass()
            if (r13 != 0) goto L_0x0261
            goto L_0x026d
        L_0x0261:
            com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
            ry1.m0 r4 = new ry1.m0
            r4.<init>(r14, r13)
            r0.postToWorker(r4)
        L_0x026d:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r2] = r13
            java.lang.String r13 = "Appending list size: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r13, r14)
        L_0x027e:
            boolean r13 = r12.f114033t
            if (r13 != 0) goto L_0x02c6
            boolean r13 = r12.f114037x
            if (r13 == 0) goto L_0x02c6
            android.view.View r12 = r12.f114035v
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
            r13.mo10233c(r14)
            java.lang.Object[] r4 = r13.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/game/ui/GameLibraryUI"
            java.lang.String r6 = "setData"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataLibrary;Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r12
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r13 = r13.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r4 = "com/tencent/mm/plugin/game/ui/GameLibraryUI"
            java.lang.String r5 = "setData"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataLibrary;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x02c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameLibraryUI.m45881H7(com.tencent.mm.plugin.game.ui.GameLibraryUI, com.tencent.mm.plugin.game.model.l0, boolean):void");
    }

    /* renamed from: I7 */
    public final void mo66228I7() {
        LinkedList<String> e = C42046d.m45746e(this);
        int i = this.f114032s;
        C86709a0.m107524d().mo123460f(new C42118v0(i, 15, e, this.f114029p, i == 0));
        this.f114031r = true;
    }

    /* renamed from: J7 */
    public final void mo66229J7() {
        String stringExtra = getIntent().getStringExtra("jump_game_center");
        if (!Util.isNullOrNil(stringExtra) && stringExtra.equals("jump_game_center")) {
            Intent intent = new Intent(this, GameCenterUI.class);
            intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.awp;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f9r);
        setBackBtn(new C42206a());
        if (!Util.isNullOrNil("")) {
            addIconOptionMenu(0, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C42207b());
        }
        ListView listView = (ListView) findViewById(C0966R.C0970id.elu);
        this.f114020d = listView;
        listView.setOnItemClickListener(this.f114014D);
        this.f114014D.f129022d = this.f114011A;
        this.f114020d.setOnScrollListener(this.f114019I);
        C42241c cVar = new C42241c(this);
        this.f114021e = cVar;
        cVar.f114390p = this.f114011A;
        cVar.f114395u = this.f114015E;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.aww, this.f114020d, false);
        GameBannerView gameBannerView = (GameBannerView) inflate.findViewById(C0966R.C0970id.ely);
        this.f114022f = gameBannerView;
        gameBannerView.setSourceScene(this.f114011A);
        this.f114020d.addHeaderView(inflate);
        this.f114013C++;
        this.f114023g = (GameLibraryCategoriesView) layoutInflater.inflate(C0966R.C0971layout.awr, this.f114020d, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(this.f114023g);
        this.f114020d.addHeaderView(linearLayout);
        this.f114013C++;
        View inflate2 = layoutInflater.inflate(C0966R.C0971layout.awv, this.f114020d, false);
        this.f114024h = inflate2;
        inflate2.setOnClickListener(this.f114016F);
        this.f114025i = (TextView) this.f114024h.findViewById(C0966R.C0970id.elw);
        View inflate3 = layoutInflater.inflate(C0966R.C0971layout.awq, this.f114020d, false);
        this.f114026j = inflate3;
        inflate3.setOnClickListener((View.OnClickListener) null);
        GameDropdownView gameDropdownView = (GameDropdownView) this.f114026j.findViewById(C0966R.C0970id.elq);
        this.f114027n = gameDropdownView;
        gameDropdownView.setAnchorView(this.f114026j);
        this.f114027n.setOnSelectionChangedListener(this.f114018H);
        View inflate4 = layoutInflater.inflate(C0966R.C0971layout.awy, this.f114020d, false);
        this.f114034u = inflate4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate4;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate4.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.addView(this.f114034u);
        this.f114020d.addFooterView(linearLayout2);
        View inflate5 = layoutInflater.inflate(C0966R.C0971layout.awu, this.f114020d, false);
        this.f114035v = inflate5;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = inflate5;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/ui/GameLibraryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Button button = (Button) this.f114035v.findViewById(C0966R.C0970id.elv);
        this.f114036w = button;
        button.setOnClickListener(this.f114017G);
        this.f114020d.addFooterView(this.f114035v);
        this.f114020d.setAdapter(this.f114021e);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.GameLibraryUI", "requestCode = %d, resultCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            Log.m105920e("MicroMsg.GameLibraryUI", "error request code");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C41864d.m45384a(this);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameLibraryUI", "account not ready");
            finish();
            return;
        }
        boolean z = false;
        this.f114011A = getIntent().getIntExtra("game_report_from_scene", 0);
        C86709a0.m107524d().mo123455a(1218, this);
        initView();
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz("pb_library");
        if (Rz == null) {
            Log.m105924i("MicroMsg.GameLibraryUI", "No cache found");
        } else {
            C86709a0.m107525e().postToWorker(new C48132l0(this, Rz));
            z = true;
        }
        if (!z) {
            Dialog d = C52642c.m58986d(this);
            this.f114038y = d;
            d.show();
        }
        mo66228I7();
        C40314g.m43484c(this, 11, 1100, 0, 1, this.f114011A, (String) null);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameLibraryUI", "onDestroy");
        super.onDestroy();
        C41864d.m45388e(this);
        C86709a0.m107524d().mo123470p(1218, this);
        this.f114021e.mo66379i();
        GameBannerView gameBannerView = this.f114022f;
        if (gameBannerView != null) {
            gameBannerView.f113630j.stopTimer();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo66229J7();
        return true;
    }

    public void onPause() {
        MTimerHandler mTimerHandler;
        super.onPause();
        GameBannerView gameBannerView = this.f114022f;
        if (gameBannerView != null && (mTimerHandler = gameBannerView.f113630j) != null) {
            mTimerHandler.stopTimer();
            Log.m105924i("MicroMsg.GameBannerView", "Auto scroll stopped");
        }
    }

    public void onResume() {
        GameBannerView gameBannerView;
        MTimerHandler mTimerHandler;
        super.onResume();
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameLibraryUI", "account not ready");
            return;
        }
        this.f114021e.notifyDataSetChanged();
        if (!this.f114039z && (gameBannerView = this.f114022f) != null && (mTimerHandler = gameBannerView.f113630j) != null && mTimerHandler.stopped() && gameBannerView.f113629i.size() > 1) {
            gameBannerView.f113630j.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            Log.m105924i("MicroMsg.GameBannerView", "Auto scroll restarted");
        }
        if (this.f114039z) {
            this.f114039z = false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f_l, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
            Dialog dialog = this.f114038y;
            if (dialog != null) {
                dialog.cancel();
            }
        } else if (yVar.getType() == 1218) {
            C86709a0.m107525e().postToWorker(new C42213h(((C42118v0) yVar).f113438e.f127056b.f127083a));
        }
    }
}
