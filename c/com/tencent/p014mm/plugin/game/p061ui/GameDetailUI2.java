package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42062h0;
import com.tencent.p014mm.plugin.game.model.C42066i0;
import com.tencent.p014mm.plugin.game.model.C42090r0;
import com.tencent.p014mm.plugin.game.model.C42091s;
import com.tencent.p014mm.plugin.game.model.C42112t;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailRankUI;
import com.tencent.p014mm.plugin.game.widget.TextProgressBar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C86493v0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import p141db.C7257a;
import p214om.C11502f;
import p763ym.C79138l;
import p910lj.C76701a;
import pe3.C47465a;
import py1.C47643o4;
import ry1.C48122i;
import ry1.C48152r;
import ry1.C48154s;
import ry1.C48168x;
import ry1.C48170y;
import sw1.C48484q;
import uy1.C52642c;
import wd3.C15148g1;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2 */
public class GameDetailUI2 extends MMActivity implements C11385n {

    /* renamed from: V0 */
    public static final /* synthetic */ int f113761V0 = 0;

    /* renamed from: A */
    public LinearLayout f113762A;

    /* renamed from: B */
    public TextView f113763B;

    /* renamed from: C */
    public LinearLayout f113764C;

    /* renamed from: D */
    public TextView f113765D;

    /* renamed from: E */
    public LinearLayout f113766E;

    /* renamed from: F */
    public ImageView f113767F;

    /* renamed from: G */
    public View f113768G;

    /* renamed from: H */
    public TextView f113769H;

    /* renamed from: I */
    public TextView f113770I;

    /* renamed from: J */
    public View f113771J;

    /* renamed from: K */
    public TextView f113772K;

    /* renamed from: L */
    public ImageView f113773L;

    /* renamed from: M */
    public TextView f113774M;

    /* renamed from: N */
    public TextView f113775N;

    /* renamed from: P */
    public LinearLayout f113776P;

    /* renamed from: Q */
    public GameMediaList f113777Q;

    /* renamed from: Q0 */
    public View.OnClickListener f113778Q0 = new C42183k();

    /* renamed from: R */
    public TextView f113779R;

    /* renamed from: R0 */
    public View.OnClickListener f113780R0 = new C42172a();

    /* renamed from: S */
    public TextView f113781S;

    /* renamed from: S0 */
    public View.OnClickListener f113782S0 = new C42173b();

    /* renamed from: T */
    public TextView f113783T;

    /* renamed from: T0 */
    public View.OnClickListener f113784T0 = new C42174c();

    /* renamed from: U */
    public boolean f113785U = false;

    /* renamed from: U0 */
    public View.OnClickListener f113786U0 = new C42175d();

    /* renamed from: V */
    public LinearLayout f113787V;

    /* renamed from: W */
    public TextView f113788W;

    /* renamed from: X */
    public LinearLayout f113789X;

    /* renamed from: Y */
    public TextView f113790Y;

    /* renamed from: Z */
    public Dialog f113791Z;

    /* renamed from: d */
    public String f113792d = null;

    /* renamed from: e */
    public C42039b f113793e = null;

    /* renamed from: f */
    public String f113794f = null;

    /* renamed from: g */
    public String f113795g = null;

    /* renamed from: h */
    public int f113796h = 18;

    /* renamed from: i */
    public boolean f113797i;

    /* renamed from: j */
    public boolean f113798j;

    /* renamed from: n */
    public int f113799n = 0;

    /* renamed from: o */
    public C42091s.C42092a f113800o = null;

    /* renamed from: p */
    public C48122i f113801p = null;

    /* renamed from: p0 */
    public C47643o4 f113802p0;

    /* renamed from: q */
    public C42112t f113803q = null;

    /* renamed from: r */
    public ViewGroup f113804r;

    /* renamed from: s */
    public ImageView f113805s;

    /* renamed from: t */
    public ImageView f113806t;

    /* renamed from: u */
    public TextView f113807u;

    /* renamed from: v */
    public Button f113808v;

    /* renamed from: w */
    public TextProgressBar f113809w;

    /* renamed from: x */
    public TextView f113810x;

    /* renamed from: x0 */
    public DialogInterface.OnClickListener f113811x0 = new C42181i();

    /* renamed from: y */
    public LinearLayout f113812y;

    /* renamed from: y0 */
    public View.OnClickListener f113813y0 = new C42182j();

    /* renamed from: z */
    public GameDetailAutoScrollView f113814z;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$a */
    public class C42172a implements View.OnClickListener {
        public C42172a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52642c.m58982C(view, GameDetailUI2.this);
            AppCompatActivity context = GameDetailUI2.this.getContext();
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            C40314g.m43487f(context, 12, 1204, 999, 7, gameDetailUI2.f113792d, gameDetailUI2.f113799n, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$b */
    public class C42173b implements View.OnClickListener {
        public C42173b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52642c.m58982C(view, GameDetailUI2.this);
            AppCompatActivity context = GameDetailUI2.this.getContext();
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            C40314g.m43487f(context, 12, 1205, 1, 7, gameDetailUI2.f113792d, gameDetailUI2.f113799n, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$c */
    public class C42174c implements View.OnClickListener {
        public C42174c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52642c.m58982C(view, GameDetailUI2.this);
            AppCompatActivity context = GameDetailUI2.this.getContext();
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            C40314g.m43487f(context, 12, 1205, 999, 7, gameDetailUI2.f113792d, gameDetailUI2.f113799n, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$d */
    public class C42175d implements View.OnClickListener {
        public C42175d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C52642c.m58982C(view, GameDetailUI2.this);
            AppCompatActivity context = GameDetailUI2.this.getContext();
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            C40314g.m43487f(context, 12, 1206, 1, 7, gameDetailUI2.f113792d, gameDetailUI2.f113799n, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$e */
    public class C42176e implements MenuItem.OnMenuItemClickListener {
        public C42176e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            int i = GameDetailUI2.f113761V0;
            gameDetailUI2.mo66153I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$f */
    public class C42177f implements ViewTreeObserver.OnGlobalLayoutListener {
        public C42177f() {
        }

        public void onGlobalLayout() {
            if (GameDetailUI2.this.f113781S.getLineCount() > 3) {
                GameDetailUI2.this.f113783T.setVisibility(0);
            } else {
                GameDetailUI2.this.f113783T.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$g */
    public class C42178g implements View.OnClickListener {
        public C42178g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            if (!gameDetailUI2.f113785U) {
                gameDetailUI2.f113781S.setMaxLines(100);
                GameDetailUI2 gameDetailUI22 = GameDetailUI2.this;
                gameDetailUI22.f113783T.setText(gameDetailUI22.getResources().getText(C0966R.string.f8a));
                GameDetailUI2.this.f113785U = true;
            } else {
                gameDetailUI2.f113781S.setMaxLines(3);
                GameDetailUI2 gameDetailUI23 = GameDetailUI2.this;
                gameDetailUI23.f113783T.setText(gameDetailUI23.getResources().getText(C0966R.string.f8_));
                GameDetailUI2.this.f113785U = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$h */
    public class C42179h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f113822d;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$h$a */
        public class C42180a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42062h0 f113824d;

            public C42180a(C42062h0 h0Var) {
                this.f113824d = h0Var;
            }

            public void run() {
                GameDetailUI2.m45863H7(GameDetailUI2.this, this.f113824d);
                Dialog dialog = GameDetailUI2.this.f113791Z;
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }

        public C42179h(C47465a aVar) {
            this.f113822d = aVar;
        }

        public void run() {
            MMHandlerThread.postToMainThread(new C42180a(new C42062h0(this.f113822d)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$i */
    public class C42181i implements DialogInterface.OnClickListener {
        public C42181i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            GameDetailUI2.this.f113803q.mo66073b();
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            gameDetailUI2.f113801p.mo72864b(gameDetailUI2.f113809w, gameDetailUI2.f113808v, gameDetailUI2.f113793e, gameDetailUI2.f113803q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$j */
    public class C42182j implements View.OnClickListener {
        public C42182j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
            if (gameDetailUI2.f113793e == null) {
                Log.m105920e("MicroMsg.GameDetailUI2", "Null appInfo");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C42112t tVar = gameDetailUI2.f113803q;
            if (tVar == null) {
                Log.m105920e("MicroMsg.GameDetailUI2", "No DownloadInfo found");
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            tVar.mo66072a(gameDetailUI2.getContext());
            GameDetailUI2 gameDetailUI22 = GameDetailUI2.this;
            gameDetailUI22.f113801p.mo72863a(gameDetailUI22.f113793e, gameDetailUI22.f113803q);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDetailUI2$k */
    public class C42183k implements View.OnClickListener {
        public C42183k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameDetailUI2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() instanceof String) {
                C52642c.m58982C(view, GameDetailUI2.this);
                AppCompatActivity context = GameDetailUI2.this.getContext();
                GameDetailUI2 gameDetailUI2 = GameDetailUI2.this;
                C40314g.m43487f(context, 12, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, 999, 7, gameDetailUI2.f113792d, gameDetailUI2.f113799n, (String) null);
            } else {
                GameDetailRankUI.C42171c cVar = new GameDetailRankUI.C42171c();
                GameDetailUI2 gameDetailUI22 = GameDetailUI2.this;
                cVar.f113758a = gameDetailUI22.f113794f;
                cVar.f113759b = gameDetailUI22.f113795g;
                cVar.f113760c = gameDetailUI22.f113793e;
                String a = C86493v0.m107223a("rankData");
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                int i = GameDetailRankUI.f113751h;
                c.mo120962i("gameDetailRankDataKey", cVar);
                Intent intent = new Intent(GameDetailUI2.this.getContext(), GameDetailRankUI.class);
                intent.putExtra("extra_session_id", a);
                GameDetailUI2 gameDetailUI23 = GameDetailUI2.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                GameDetailUI2 gameDetailUI24 = gameDetailUI23;
                C117292a.m165358d(gameDetailUI24, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameDetailUI2$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                gameDetailUI23.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(gameDetailUI24, "com/tencent/mm/plugin/game/ui/GameDetailUI2$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                AppCompatActivity context2 = GameDetailUI2.this.getContext();
                GameDetailUI2 gameDetailUI25 = GameDetailUI2.this;
                C40314g.m43487f(context2, 12, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, 999, 6, gameDetailUI25.f113792d, gameDetailUI25.f113799n, (String) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0796  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07a2  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x07cf  */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m45863H7(com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2 r28, com.tencent.p014mm.plugin.game.model.C42062h0 r29) {
        /*
            r8 = r28
            r9 = r29
            boolean r0 = r28.isFinishing()
            java.lang.String r10 = "MicroMsg.GameDetailUI2"
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "GameDetailUI2 hasFinished"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x07e4
        L_0x0013:
            if (r9 != 0) goto L_0x001c
            java.lang.String r0 = "Null data"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x07e4
        L_0x001c:
            com.tencent.mm.plugin.game.model.b r0 = r9.f113325c
            r8.f113793e = r0
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            r11 = 0
            if (r0 != 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.lang.String r0 = r0.f127719h
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0032
        L_0x0030:
            r0 = r11
            goto L_0x0038
        L_0x0032:
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            java.lang.String r0 = r0.f127719h
        L_0x0038:
            r8.f113794f = r0
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            if (r0 != 0) goto L_0x0041
            goto L_0x0049
        L_0x0041:
            java.lang.String r0 = r0.f127720i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x004b
        L_0x0049:
            r0 = r11
            goto L_0x0051
        L_0x004b:
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            java.lang.String r0 = r0.f127720i
        L_0x0051:
            r8.f113795g = r0
            boolean r0 = r8.f113798j
            r12 = 1
            if (r0 == 0) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            r8.f113798j = r12
            r1 = 12
            r2 = 1200(0x4b0, float:1.682E-42)
            r3 = 0
            r4 = 1
            java.lang.String r5 = r8.f113792d
            int r6 = r8.f113799n
            r7 = 0
            r0 = r28
            com.tencent.p014mm.game.report.C40314g.m43487f(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x006b:
            com.tencent.mm.plugin.game.model.b r0 = r9.f113325c
            gc0.a r1 = gc0.C20828a.m22825b()
            py1.v1 r2 = r9.f113323a
            java.lang.String r2 = r2.f128072e
            android.widget.ImageView r3 = r8.f113805s
            hc0.c$b r4 = new hc0.c$b
            r4.<init>()
            r4.f59347c = r12
            hc0.c r4 = r4.mo32666a()
            r1.mo32519h(r2, r3, r4)
            android.widget.ImageView r1 = r8.f113806t
            java.lang.String r2 = r8.f113792d
            float r3 = kg3.C76577a.m92156g(r28)
            if (r1 == 0) goto L_0x00c8
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x0096
            goto L_0x00c8
        L_0x0096:
            java.lang.Class<ym.l> r4 = p763ym.C79138l.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.l r4 = (p763ym.C79138l) r4
            android.graphics.Bitmap r4 = r4.mo74018ub(r2, r12, r3)
            if (r4 == 0) goto L_0x00ae
            boolean r5 = r4.isRecycled()
            if (r5 != 0) goto L_0x00ae
            r1.setImageBitmap(r4)
            goto L_0x00c8
        L_0x00ae:
            r4 = 2131233201(0x7f0809b1, float:1.8082533E38)
            r1.setImageResource(r4)
            java.lang.Class<ym.s> r4 = p763ym.C53543s.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.s r4 = (p763ym.C53543s) r4
            ym.m r4 = r4.Gk0()
            ry1.f0 r5 = new ry1.f0
            r5.<init>(r2, r3, r1)
            r4.add(r5)
        L_0x00c8:
            android.widget.TextView r1 = r8.f113807u
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00d1
            java.lang.String r3 = r0.field_appName
            goto L_0x00d2
        L_0x00d1:
            r3 = r2
        L_0x00d2:
            r1.setText(r3)
            r1 = 8
            r3 = 0
            if (r0 == 0) goto L_0x00f0
            java.lang.String r4 = r0.f113248A1
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00e3
            goto L_0x00f0
        L_0x00e3:
            android.widget.TextView r4 = r8.f113810x
            java.lang.String r0 = r0.f113248A1
            r4.setText(r0)
            android.widget.TextView r0 = r8.f113810x
            r0.setVisibility(r3)
            goto L_0x00f5
        L_0x00f0:
            android.widget.TextView r0 = r8.f113810x
            r0.setVisibility(r1)
        L_0x00f5:
            com.tencent.mm.plugin.game.model.b r0 = r8.f113793e
            r4 = 2
            if (r0 != 0) goto L_0x0101
            android.widget.Button r0 = r8.f113808v
            r0.setVisibility(r1)
            goto L_0x0188
        L_0x0101:
            android.widget.Button r0 = r8.f113808v
            r0.setVisibility(r3)
            ry1.i r0 = r8.f113801p
            if (r0 != 0) goto L_0x011b
            ry1.i r0 = new ry1.i
            r0.<init>(r8)
            r8.f113801p = r0
            android.content.DialogInterface$OnClickListener r5 = r8.f113811x0
            r0.f129001f = r5
            int r5 = r8.f113799n
            r0.f129002g = r5
            r0.f129003h = r11
        L_0x011b:
            android.widget.Button r0 = r8.f113808v
            android.view.View$OnClickListener r5 = r8.f113813y0
            r0.setOnClickListener(r5)
            com.tencent.mm.plugin.game.widget.TextProgressBar r0 = r8.f113809w
            android.view.View$OnClickListener r5 = r8.f113813y0
            r0.setOnClickListener(r5)
            com.tencent.mm.plugin.game.model.t r0 = new com.tencent.mm.plugin.game.model.t
            com.tencent.mm.plugin.game.model.b r5 = r8.f113793e
            r0.<init>(r5)
            r8.f113803q = r0
            r0.mo66072a(r8)
            com.tencent.mm.plugin.game.model.t r0 = r8.f113803q
            r0.mo66073b()
            ry1.i r0 = r8.f113801p
            com.tencent.mm.plugin.game.widget.TextProgressBar r5 = r8.f113809w
            android.widget.Button r6 = r8.f113808v
            com.tencent.mm.plugin.game.model.b r7 = r8.f113793e
            com.tencent.mm.plugin.game.model.t r13 = r8.f113803q
            r0.mo72864b(r5, r6, r7, r13)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.plugin.game.model.b r5 = r8.f113793e
            int r5 = r5.f113270y1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r3] = r5
            com.tencent.mm.plugin.game.model.t r5 = r8.f113803q
            int r5 = r5.f113425c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r12] = r5
            com.tencent.mm.plugin.game.model.t r5 = r8.f113803q
            int r5 = r5.f113424b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r4] = r5
            java.lang.String r5 = "App Status: %d, Download Mode: %d, Download Status: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r0)
            java.lang.String r0 = r8.f113792d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0176
            goto L_0x0188
        L_0x0176:
            com.tencent.mm.plugin.game.model.s$a r0 = r8.f113800o
            if (r0 == 0) goto L_0x017e
            com.tencent.p014mm.plugin.game.model.C42091s.m45783a(r0)
            goto L_0x0188
        L_0x017e:
            ry1.u r0 = new ry1.u
            r0.<init>(r8)
            r8.f113800o = r0
            com.tencent.p014mm.plugin.game.model.C42091s.m45783a(r0)
        L_0x0188:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            py1.v1 r5 = r9.f113323a
            java.util.LinkedList<py1.l0> r5 = r5.f128078n
            if (r5 != 0) goto L_0x0194
            goto L_0x01ff
        L_0x0194:
            java.util.Iterator r5 = r5.iterator()
        L_0x0198:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01ff
            java.lang.Object r6 = r5.next()
            py1.l0 r6 = (py1.C47618l0) r6
            java.lang.String r7 = r6.f127848d
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x01f6
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            java.lang.String r10 = r6.f127848d
            com.tencent.mm.storage.z1 r7 = r7.get(r10)
            java.lang.String r10 = " "
            if (r7 == 0) goto L_0x01e1
            long r13 = r7.f108320R1
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x01e1
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r7 = r7.mo62898f()
            r13.append(r7)
            r13.append(r10)
            java.lang.String r7 = r13.toString()
            r0.add(r7)
            goto L_0x01f9
        L_0x01e1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = r6.f127848d
            r7.append(r13)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r0.add(r7)
            goto L_0x01f9
        L_0x01f6:
            r0.add(r2)
        L_0x01f9:
            java.lang.String r6 = r6.f127849e
            r0.add(r6)
            goto L_0x0198
        L_0x01ff:
            int r2 = r0.size()
            if (r2 == 0) goto L_0x0210
            com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView r2 = r8.f113814z
            r2.setVisibility(r3)
            com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView r2 = r8.f113814z
            r2.setText(r0)
            goto L_0x0215
        L_0x0210:
            com.tencent.mm.plugin.game.ui.GameDetailAutoScrollView r0 = r8.f113814z
            r0.setVisibility(r1)
        L_0x0215:
            com.tencent.mm.plugin.game.model.i0 r0 = r9.f113326d
            r8.mo66154J7(r0)
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            if (r0 != 0) goto L_0x0221
            goto L_0x0229
        L_0x0221:
            java.lang.String r0 = r0.f127717f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x022b
        L_0x0229:
            r0 = r11
            goto L_0x0231
        L_0x022b:
            py1.v1 r0 = r9.f113323a
            py1.g4 r0 = r0.f128077j
            java.lang.String r0 = r0.f127717f
        L_0x0231:
            py1.v1 r2 = r9.f113323a
            py1.g4 r2 = r2.f128077j
            if (r2 != 0) goto L_0x0238
            goto L_0x0240
        L_0x0238:
            java.lang.String r2 = r2.f127718g
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0242
        L_0x0240:
            r2 = r11
            goto L_0x0248
        L_0x0242:
            py1.v1 r2 = r9.f113323a
            py1.g4 r2 = r2.f128077j
            java.lang.String r2 = r2.f127718g
        L_0x0248:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x026c
            android.widget.TextView r5 = r8.f113763B
            r5.setText(r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x025f
            android.widget.TextView r0 = r8.f113763B
            r0.setTag(r2)
            goto L_0x0264
        L_0x025f:
            android.widget.TextView r0 = r8.f113763B
            r0.setTag(r11)
        L_0x0264:
            android.widget.TextView r0 = r8.f113763B
            android.view.View$OnClickListener r2 = r8.f113778Q0
            r0.setOnClickListener(r2)
            goto L_0x0271
        L_0x026c:
            android.widget.TextView r0 = r8.f113763B
            r0.setVisibility(r1)
        L_0x0271:
            com.tencent.mm.plugin.game.model.i0 r0 = r9.f113326d
            java.util.List<com.tencent.mm.plugin.game.model.i0$a> r0 = r0.f113339b
            if (r0 == 0) goto L_0x0282
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0280
            goto L_0x0282
        L_0x0280:
            r0 = r11
            goto L_0x0286
        L_0x0282:
            py1.v1 r0 = r9.f113323a
            java.util.LinkedList<py1.k0> r0 = r0.f128073f
        L_0x0286:
            if (r0 == 0) goto L_0x0312
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0290
            goto L_0x0312
        L_0x0290:
            android.widget.LinearLayout r2 = r8.f113812y
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r8.f113812y
            r2.removeAllViews()
            java.util.Iterator r0 = r0.iterator()
        L_0x029e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0317
            java.lang.Object r2 = r0.next()
            py1.k0 r2 = (py1.C47611k0) r2
            androidx.appcompat.app.AppCompatActivity r5 = r28.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131495812(0x7f0c0b84, float:1.8615171E38)
            android.widget.LinearLayout r7 = r8.f113812y
            android.view.View r5 = r5.inflate(r6, r7, r3)
            r6 = 2131305434(0x7f0923da, float:1.8229039E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 2131305435(0x7f0923db, float:1.822904E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r10 = 2131305433(0x7f0923d9, float:1.8229037E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.String r13 = r2.f127821d
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 != 0) goto L_0x02ee
            java.lang.Class<ln.f> r13 = p196ln.C76705f.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ln.f r13 = (p196ln.C76705f) r13
            java.lang.String r14 = r2.f127821d
            r15 = 1056964608(0x3f000000, float:0.5)
            r13.D20(r6, r14, r15)
            goto L_0x0302
        L_0x02ee:
            hc0.c$b r13 = new hc0.c$b
            r13.<init>()
            r13.f59364t = r12
            hc0.c r13 = r13.mo32666a()
            gc0.a r14 = gc0.C20828a.m22825b()
            java.lang.String r15 = r2.f127822e
            r14.mo32519h(r15, r6, r13)
        L_0x0302:
            java.lang.String r6 = r2.f127823f
            r7.setText(r6)
            java.lang.String r2 = r2.f127824g
            r10.setText(r2)
            android.widget.LinearLayout r2 = r8.f113812y
            r2.addView(r5)
            goto L_0x029e
        L_0x0312:
            android.widget.LinearLayout r0 = r8.f113812y
            r0.setVisibility(r1)
        L_0x0317:
            java.util.LinkedList r0 = r29.mo66033b()
            if (r0 == 0) goto L_0x04fd
            java.util.LinkedList r0 = r29.mo66033b()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04fd
            android.widget.LinearLayout r0 = r8.f113764C
            r0.setVisibility(r3)
            py1.v1 r0 = r9.f113323a
            py1.r2 r2 = r0.f128081q
            if (r2 == 0) goto L_0x0335
            java.lang.String r0 = r2.f127975h
            goto L_0x033d
        L_0x0335:
            py1.t2 r0 = r0.f128076i
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = r0.f128022d
            goto L_0x033d
        L_0x033c:
            r0 = r11
        L_0x033d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x035f
            android.widget.TextView r0 = r8.f113765D
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.f113765D
            py1.v1 r2 = r9.f113323a
            py1.r2 r5 = r2.f128081q
            if (r5 == 0) goto L_0x0353
            java.lang.String r2 = r5.f127975h
            goto L_0x035b
        L_0x0353:
            py1.t2 r2 = r2.f128076i
            if (r2 == 0) goto L_0x035a
            java.lang.String r2 = r2.f128022d
            goto L_0x035b
        L_0x035a:
            r2 = r11
        L_0x035b:
            r0.setText(r2)
            goto L_0x0364
        L_0x035f:
            android.widget.TextView r0 = r8.f113765D
            r0.setVisibility(r1)
        L_0x0364:
            android.widget.LinearLayout r0 = r8.f113766E
            r0.removeAllViews()
            py1.v1 r0 = r9.f113323a
            py1.r2 r0 = r0.f128081q
            if (r0 == 0) goto L_0x0371
            r0 = 2
            goto L_0x0372
        L_0x0371:
            r0 = 1
        L_0x0372:
            if (r0 != r12) goto L_0x0382
            android.widget.LinearLayout r0 = r8.f113766E
            r0.setOrientation(r12)
            r0 = 2131495804(0x7f0c0b7c, float:1.8615155E38)
            android.widget.ImageView r2 = r8.f113767F
            r2.setVisibility(r1)
            goto L_0x038f
        L_0x0382:
            android.widget.LinearLayout r0 = r8.f113766E
            r0.setOrientation(r3)
            r0 = 2131495803(0x7f0c0b7b, float:1.8615153E38)
            android.widget.ImageView r2 = r8.f113767F
            r2.setVisibility(r3)
        L_0x038f:
            java.util.LinkedList r2 = r29.mo66033b()
            if (r2 == 0) goto L_0x0407
            java.util.Iterator r2 = r2.iterator()
        L_0x0399:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0407
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.game.model.h0$b r5 = (com.tencent.p014mm.plugin.game.model.C42062h0.C42064b) r5
            androidx.appcompat.app.AppCompatActivity r6 = r28.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            android.widget.LinearLayout r7 = r8.f113766E
            android.view.View r6 = r6.inflate(r0, r7, r3)
            r7 = 2131305397(0x7f0923b5, float:1.8228964E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            gc0.a r10 = gc0.C20828a.m22825b()
            java.lang.String r13 = r5.f113330a
            r10.mo32518g(r13, r7)
            py1.v1 r7 = r9.f113323a
            py1.r2 r7 = r7.f128081q
            if (r7 == 0) goto L_0x03cd
            r7 = 2
            goto L_0x03ce
        L_0x03cd:
            r7 = 1
        L_0x03ce:
            if (r7 != r12) goto L_0x03de
            r7 = 2131305398(0x7f0923b6, float:1.8228966E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r10 = r5.f113331b
            r7.setText(r10)
        L_0x03de:
            r7 = 2131305396(0x7f0923b4, float:1.8228962E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r10 = r5.f113332c
            r7.setText(r10)
            py1.v1 r7 = r9.f113323a
            py1.r2 r7 = r7.f128081q
            if (r7 == 0) goto L_0x03f4
            r7 = 2
            goto L_0x03f5
        L_0x03f4:
            r7 = 1
        L_0x03f5:
            if (r7 != r12) goto L_0x0401
            java.lang.String r5 = r5.f113333d
            r6.setTag(r5)
            android.view.View$OnClickListener r5 = r8.f113780R0
            r6.setOnClickListener(r5)
        L_0x0401:
            android.widget.LinearLayout r5 = r8.f113766E
            r5.addView(r6)
            goto L_0x0399
        L_0x0407:
            py1.v1 r0 = r9.f113323a
            py1.r2 r2 = r0.f128081q
            if (r2 == 0) goto L_0x041f
            com.tencent.mm.plugin.game.model.h0$a r0 = new com.tencent.mm.plugin.game.model.h0$a
            r0.<init>()
            java.lang.String r4 = r2.f127971d
            r0.f113327a = r4
            java.lang.String r4 = r2.f127972e
            r0.f113328b = r4
            java.lang.String r2 = r2.f127974g
            r0.f113329c = r2
            goto L_0x044a
        L_0x041f:
            py1.t2 r0 = r0.f128076i
            if (r0 == 0) goto L_0x0449
            java.lang.String r0 = r0.f128024f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0449
            py1.v1 r0 = r9.f113323a
            py1.t2 r0 = r0.f128076i
            java.lang.String r0 = r0.f128025g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0449
            com.tencent.mm.plugin.game.model.h0$a r0 = new com.tencent.mm.plugin.game.model.h0$a
            r0.<init>()
            py1.v1 r2 = r9.f113323a
            py1.t2 r2 = r2.f128076i
            java.lang.String r4 = r2.f128024f
            r0.f113327a = r4
            java.lang.String r2 = r2.f128025g
            r0.f113329c = r2
            goto L_0x044a
        L_0x0449:
            r0 = r11
        L_0x044a:
            if (r0 == 0) goto L_0x04bc
            android.view.View r2 = r8.f113768G
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r5)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r16 = "setupGiftList"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r15 = "setupGiftList"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.widget.TextView r2 = r8.f113769H
            java.lang.String r4 = r0.f113327a
            r2.setText(r4)
            java.lang.String r2 = r0.f113328b
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x04a8
            android.widget.TextView r2 = r8.f113770I
            r2.setVisibility(r3)
            android.widget.TextView r2 = r8.f113770I
            java.lang.String r4 = r0.f113328b
            r2.setText(r4)
            goto L_0x04ad
        L_0x04a8:
            android.widget.TextView r2 = r8.f113770I
            r2.setVisibility(r1)
        L_0x04ad:
            android.view.View r2 = r8.f113768G
            java.lang.String r0 = r0.f113329c
            r2.setTag(r0)
            android.view.View r0 = r8.f113768G
            android.view.View$OnClickListener r2 = r8.f113780R0
            r0.setOnClickListener(r2)
            goto L_0x0502
        L_0x04bc:
            android.view.View r0 = r8.f113768G
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r4)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r16 = "setupGiftList"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r0
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r15 = "setupGiftList"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0502
        L_0x04fd:
            android.widget.LinearLayout r0 = r8.f113764C
            r0.setVisibility(r1)
        L_0x0502:
            py1.v1 r0 = r9.f113323a
            py1.j3 r0 = r0.f128074g
            if (r0 == 0) goto L_0x050c
            java.lang.String r0 = r0.f127812d
            if (r0 != 0) goto L_0x050d
        L_0x050c:
            r0 = r11
        L_0x050d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0585
            py1.v1 r0 = r9.f113323a
            py1.j3 r0 = r0.f128074g
            if (r0 == 0) goto L_0x051d
            java.lang.String r0 = r0.f127814f
            if (r0 != 0) goto L_0x051e
        L_0x051d:
            r0 = r11
        L_0x051e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0525
            goto L_0x0585
        L_0x0525:
            android.widget.LinearLayout r0 = r8.f113776P
            r0.setVisibility(r3)
            com.tencent.mm.plugin.game.ui.GameMediaList r0 = r8.f113777Q
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            py1.v1 r4 = r9.f113323a
            py1.j3 r4 = r4.f128074g
            if (r4 == 0) goto L_0x0561
            java.util.LinkedList<py1.s3> r4 = r4.f127813e
            if (r4 != 0) goto L_0x053c
            goto L_0x0561
        L_0x053c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0540:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0561
            java.lang.Object r5 = r4.next()
            py1.s3 r5 = (py1.C47670s3) r5
            com.tencent.mm.plugin.game.ui.GameMediaList$a r6 = new com.tencent.mm.plugin.game.ui.GameMediaList$a
            r6.<init>()
            int r7 = r5.f127997d
            r6.f114057a = r7
            java.lang.String r7 = r5.f127998e
            r6.f114059c = r7
            java.lang.String r5 = r5.f127999f
            r6.f114058b = r5
            r2.add(r6)
            goto L_0x0540
        L_0x0561:
            r0.setMediaList(r2)
            android.widget.TextView r0 = r8.f113779R
            py1.v1 r2 = r9.f113323a
            py1.j3 r2 = r2.f128074g
            if (r2 == 0) goto L_0x0570
            java.lang.String r2 = r2.f127812d
            if (r2 != 0) goto L_0x0571
        L_0x0570:
            r2 = r11
        L_0x0571:
            r0.setText(r2)
            android.widget.TextView r0 = r8.f113781S
            py1.v1 r2 = r9.f113323a
            py1.j3 r2 = r2.f128074g
            if (r2 == 0) goto L_0x0580
            java.lang.String r2 = r2.f127814f
            if (r2 != 0) goto L_0x0581
        L_0x0580:
            r2 = r11
        L_0x0581:
            r0.setText(r2)
            goto L_0x058a
        L_0x0585:
            android.widget.LinearLayout r0 = r8.f113776P
            r0.setVisibility(r1)
        L_0x058a:
            py1.v1 r0 = r9.f113323a
            py1.v2 r0 = r0.f128080p
            if (r0 != 0) goto L_0x05d2
            android.view.View r0 = r8.f113771J
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r4)
            java.lang.Object[] r14 = r2.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r16 = "setupGroupInfo"
            java.lang.String r17 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r0
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r15 = "setupGroupInfo"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0669
        L_0x05d2:
            android.view.View r0 = r8.f113771J
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r21 = r2.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r23 = "setupGroupInfo"
            java.lang.String r24 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r21 = "com/tencent/mm/plugin/game/ui/GameDetailUI2"
            java.lang.String r22 = "setupGroupInfo"
            java.lang.String r23 = "(Lcom/tencent/mm/plugin/game/model/GamePBDataDetail;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            android.widget.TextView r0 = r8.f113772K
            py1.v1 r2 = r9.f113323a
            py1.v2 r2 = r2.f128080p
            java.lang.String r2 = r2.f128082d
            r0.setText(r2)
            gc0.a r0 = gc0.C20828a.m22825b()
            py1.v1 r2 = r9.f113323a
            py1.v2 r2 = r2.f128080p
            java.lang.String r2 = r2.f128083e
            android.widget.ImageView r4 = r8.f113773L
            r0.mo32518g(r2, r4)
            android.widget.TextView r0 = r8.f113774M
            py1.v1 r2 = r9.f113323a
            py1.v2 r2 = r2.f128080p
            java.lang.String r2 = r2.f128084f
            r0.setText(r2)
            android.widget.TextView r0 = r8.f113775N
            py1.v1 r2 = r9.f113323a
            py1.v2 r2 = r2.f128080p
            java.lang.String r2 = r2.f128085g
            r0.setText(r2)
            android.widget.TextView r0 = r8.f113774M
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            py1.v1 r2 = r9.f113323a
            py1.v2 r2 = r2.f128080p
            java.lang.String r2 = r2.f128086h
            r0.setTag(r2)
            android.widget.TextView r0 = r8.f113774M
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View$OnClickListener r2 = r8.f113786U0
            r0.setOnClickListener(r2)
        L_0x0669:
            py1.v1 r0 = r9.f113323a
            py1.w2 r0 = r0.f128075h
            if (r0 != 0) goto L_0x0671
            r2 = r11
            goto L_0x0673
        L_0x0671:
            java.util.LinkedList<py1.x2> r2 = r0.f128113e
        L_0x0673:
            if (r2 == 0) goto L_0x0781
            if (r0 != 0) goto L_0x0679
            r0 = r11
            goto L_0x067b
        L_0x0679:
            java.util.LinkedList<py1.x2> r0 = r0.f128113e
        L_0x067b:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0781
            android.widget.LinearLayout r0 = r8.f113787V
            r0.setVisibility(r3)
            py1.v1 r0 = r9.f113323a
            py1.w2 r0 = r0.f128075h
            if (r0 != 0) goto L_0x068e
            r0 = r11
            goto L_0x0690
        L_0x068e:
            java.lang.String r0 = r0.f128112d
        L_0x0690:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x06ab
            android.widget.TextView r0 = r8.f113788W
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.f113788W
            py1.v1 r2 = r9.f113323a
            py1.w2 r2 = r2.f128075h
            if (r2 != 0) goto L_0x06a5
            r2 = r11
            goto L_0x06a7
        L_0x06a5:
            java.lang.String r2 = r2.f128112d
        L_0x06a7:
            r0.setText(r2)
            goto L_0x06b0
        L_0x06ab:
            android.widget.TextView r0 = r8.f113788W
            r0.setVisibility(r1)
        L_0x06b0:
            android.widget.LinearLayout r0 = r8.f113789X
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r8.f113789X
            r0.setOnClickListener(r11)
            py1.v1 r0 = r9.f113323a
            py1.w2 r0 = r0.f128075h
            if (r0 != 0) goto L_0x06c2
            r0 = r11
            goto L_0x06c4
        L_0x06c2:
            java.util.LinkedList<py1.x2> r0 = r0.f128113e
        L_0x06c4:
            java.util.Iterator r0 = r0.iterator()
        L_0x06c8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0731
            java.lang.Object r2 = r0.next()
            py1.x2 r2 = (py1.C47701x2) r2
            androidx.appcompat.app.AppCompatActivity r4 = r28.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131495805(0x7f0c0b7d, float:1.8615157E38)
            android.widget.LinearLayout r6 = r8.f113789X
            android.view.View r4 = r4.inflate(r5, r6, r3)
            r5 = 2131305410(0x7f0923c2, float:1.822899E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131305411(0x7f0923c3, float:1.8228992E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131305408(0x7f0923c0, float:1.8228986E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r10 = 2131305409(0x7f0923c1, float:1.8228988E38)
            android.view.View r10 = r4.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r13 = r2.f128142h
            r5.setText(r13)
            java.lang.String r5 = r2.f128139e
            r6.setText(r5)
            java.lang.String r5 = r2.f128140f
            r7.setText(r5)
            gc0.a r5 = gc0.C20828a.m22825b()
            java.lang.String r6 = r2.f128138d
            r5.mo32518g(r6, r10)
            java.lang.String r2 = r2.f128141g
            r4.setTag(r2)
            android.view.View$OnClickListener r2 = r8.f113782S0
            r4.setOnClickListener(r2)
            android.widget.LinearLayout r2 = r8.f113789X
            r2.addView(r4)
            goto L_0x06c8
        L_0x0731:
            py1.v1 r0 = r9.f113323a
            py1.t2 r2 = r0.f128076i
            if (r2 != 0) goto L_0x0738
            goto L_0x075c
        L_0x0738:
            py1.w2 r0 = r0.f128075h
            java.lang.String r0 = r0.f128112d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x075c
            py1.v1 r0 = r9.f113323a
            py1.w2 r0 = r0.f128075h
            java.lang.String r0 = r0.f128115g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x074f
            goto L_0x075c
        L_0x074f:
            android.util.Pair r11 = new android.util.Pair
            py1.v1 r0 = r9.f113323a
            py1.w2 r0 = r0.f128075h
            java.lang.String r2 = r0.f128114f
            java.lang.String r0 = r0.f128115g
            r11.<init>(r2, r0)
        L_0x075c:
            if (r11 == 0) goto L_0x077b
            android.widget.TextView r0 = r8.f113790Y
            r0.setVisibility(r3)
            android.widget.TextView r0 = r8.f113790Y
            java.lang.Object r1 = r11.first
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r0 = r8.f113790Y
            java.lang.Object r1 = r11.second
            r0.setTag(r1)
            android.widget.TextView r0 = r8.f113790Y
            android.view.View$OnClickListener r1 = r8.f113784T0
            r0.setOnClickListener(r1)
            goto L_0x0786
        L_0x077b:
            android.widget.TextView r0 = r8.f113790Y
            r0.setVisibility(r1)
            goto L_0x0786
        L_0x0781:
            android.widget.LinearLayout r0 = r8.f113787V
            r0.setVisibility(r1)
        L_0x0786:
            py1.v1 r0 = r9.f113323a
            py1.o4 r0 = r0.f128079o
            r8.f113802p0 = r0
            if (r0 == 0) goto L_0x07a2
            boolean r1 = r0.f127912i
            if (r1 != 0) goto L_0x0796
            boolean r0 = r0.f127913j
            if (r0 == 0) goto L_0x07a2
        L_0x0796:
            r0 = 2131756370(0x7f100552, float:1.9143646E38)
            ry1.z r1 = new ry1.z
            r1.<init>(r8)
            super.addIconOptionMenu(r3, r0, r1)
            goto L_0x07a5
        L_0x07a2:
            super.removeAllOptionMenu()
        L_0x07a5:
            android.view.ViewGroup r0 = r8.f113804r
            android.widget.LinearLayout r1 = r8.f113776P
            r0.removeView(r1)
            android.view.ViewGroup r0 = r8.f113804r
            android.view.View r1 = r8.f113771J
            r0.removeView(r1)
            android.view.ViewGroup r0 = r8.f113804r
            android.widget.LinearLayout r1 = r8.f113787V
            r0.removeView(r1)
            com.tencent.mm.plugin.game.model.b r0 = r9.f113325c
            int r0 = r0.f113270y1
            if (r0 != r12) goto L_0x07cf
            android.view.ViewGroup r0 = r8.f113804r
            android.view.View r1 = r8.f113771J
            r0.addView(r1)
            android.view.ViewGroup r0 = r8.f113804r
            android.widget.LinearLayout r1 = r8.f113776P
            r0.addView(r1)
            goto L_0x07dd
        L_0x07cf:
            android.view.ViewGroup r0 = r8.f113804r
            android.widget.LinearLayout r1 = r8.f113776P
            r0.addView(r1)
            android.view.ViewGroup r0 = r8.f113804r
            android.view.View r1 = r8.f113771J
            r0.addView(r1)
        L_0x07dd:
            android.view.ViewGroup r0 = r8.f113804r
            android.widget.LinearLayout r1 = r8.f113787V
            r0.addView(r1)
        L_0x07e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2.m45863H7(com.tencent.mm.plugin.game.ui.GameDetailUI2, com.tencent.mm.plugin.game.model.h0):void");
    }

    /* renamed from: I7 */
    public final void mo66153I7() {
        String stringExtra = getIntent().getStringExtra("jump_game_center");
        if (!Util.isNullOrNil(stringExtra) && stringExtra.equals("jump_game_center")) {
            Intent intent = new Intent(this, GameCenterUI.class);
            intent.putExtra("jump_find_more_friends", "jump_find_more_friends");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameDetailUI2", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/game/ui/GameDetailUI2", "backToGameCenterUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        finish();
    }

    /* renamed from: J7 */
    public final void mo66154J7(C42066i0 i0Var) {
        List<C42066i0.C42067a> list = i0Var.f113339b;
        if (list != null) {
            LinkedList linkedList = (LinkedList) list;
            if (linkedList.size() != 0) {
                int i = 0;
                this.f113762A.setVisibility(0);
                if (linkedList.size() > 3) {
                    this.f113763B.setVisibility(0);
                } else {
                    this.f113763B.setVisibility(8);
                }
                this.f113762A.removeAllViews();
                C48154s sVar = new C48154s(getContext());
                sVar.f129078e = C0966R.C0971layout.avr;
                sVar.f129079f = i0Var;
                MMHandlerThread.postToMainThread(new C48152r(sVar));
                sVar.f129080g = this.f113799n;
                while (i < linkedList.size() && i < 3) {
                    this.f113762A.addView(sVar.getView(i, (View) null, this.f113812y));
                    i++;
                }
                return;
            }
        }
        this.f113762A.setVisibility(8);
        this.f113763B.setVisibility(8);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.avj;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f8o);
        setBackBtn(new C42176e());
        this.f113804r = (ViewGroup) findViewById(C0966R.C0970id.eip);
        this.f113805s = (ImageView) findViewById(C0966R.C0970id.eiq);
        this.f113806t = (ImageView) findViewById(C0966R.C0970id.ekt);
        this.f113807u = (TextView) findViewById(C0966R.C0970id.emr);
        this.f113810x = (TextView) findViewById(C0966R.C0970id.f358351el0);
        this.f113808v = (Button) findViewById(C0966R.C0970id.ehv);
        TextProgressBar textProgressBar = (TextProgressBar) findViewById(C0966R.C0970id.en6);
        this.f113809w = textProgressBar;
        textProgressBar.setTextSize(this.f113796h);
        this.f113812y = (LinearLayout) findViewById(C0966R.C0970id.f358350ek3);
        this.f113814z = (GameDetailAutoScrollView) findViewById(C0966R.C0970id.f358349ek2);
        this.f113762A = (LinearLayout) findViewById(C0966R.C0970id.ejl);
        this.f113763B = (TextView) findViewById(C0966R.C0970id.ejn);
        this.f113764C = (LinearLayout) findViewById(C0966R.C0970id.eiy);
        this.f113765D = (TextView) findViewById(C0966R.C0970id.ej7);
        this.f113766E = (LinearLayout) findViewById(C0966R.C0970id.eiz);
        this.f113767F = (ImageView) findViewById(C0966R.C0970id.f358343ej0);
        this.f113768G = findViewById(C0966R.C0970id.f358344ej1);
        this.f113769H = (TextView) findViewById(C0966R.C0970id.f358346ej3);
        this.f113770I = (TextView) findViewById(C0966R.C0970id.f358345ej2);
        this.f113771J = findViewById(C0966R.C0970id.ej8);
        this.f113772K = (TextView) findViewById(C0966R.C0970id.ejb);
        this.f113773L = (ImageView) findViewById(C0966R.C0970id.eja);
        this.f113774M = (TextView) findViewById(C0966R.C0970id.ej9);
        this.f113775N = (TextView) findViewById(C0966R.C0970id.ej_);
        this.f113776P = (LinearLayout) findViewById(C0966R.C0970id.eiu);
        GameMediaList gameMediaList = (GameMediaList) findViewById(C0966R.C0970id.ejk);
        this.f113777Q = gameMediaList;
        String str = this.f113792d;
        int i = this.f113799n;
        gameMediaList.f114053f = str;
        gameMediaList.f114054g = 12;
        gameMediaList.f114055h = i;
        gameMediaList.f114056i = this;
        gameMediaList.setItemLayout(C0966R.C0971layout.ax4);
        this.f113779R = (TextView) findViewById(C0966R.C0970id.eiw);
        TextView textView = (TextView) findViewById(C0966R.C0970id.eiv);
        this.f113781S = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C42177f());
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.eix);
        this.f113783T = textView2;
        textView2.setOnClickListener(new C42178g());
        this.f113787V = (LinearLayout) findViewById(C0966R.C0970id.ejc);
        this.f113788W = (TextView) findViewById(C0966R.C0970id.ejj);
        this.f113789X = (LinearLayout) findViewById(C0966R.C0970id.ejd);
        this.f113790Y = (TextView) findViewById(C0966R.C0970id.eje);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C42112t tVar;
        C42112t tVar2;
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.GameDetailUI2", "requestCode = %d, resultCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Log.m105920e("MicroMsg.GameDetailUI2", "error request code");
                } else if (i2 == -1) {
                    C40314g.m43487f(getContext(), 12, C7257a.CTRL_INDEX, 2, 15, this.f113792d, this.f113799n, (String) null);
                }
            } else if (i2 == -1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (!Util.isNullOrNil(stringExtra)) {
                    String str = this.f113802p0.f127907d;
                    if (Util.isNullOrNil(str)) {
                        str = this.f113793e.field_appIconUrl;
                    }
                    String str2 = str;
                    C15148g1 g1Var = C15148g1.C15149a.f41275a;
                    MMActivityController mMActivityController = this.mController;
                    C47643o4 o4Var = this.f113802p0;
                    g1Var.Sk0(mMActivityController, o4Var.f127908e, str2, o4Var.f127909f, (String) null, true, getResources().getString(C0966R.string.a2s), new C48168x(this, stringExtra));
                }
            }
        } else if (i2 == 2) {
            C42039b bVar = this.f113793e;
            if (bVar != null && (tVar = this.f113803q) != null) {
                tVar.f113425c = 1;
                this.f113801p.mo72863a(bVar, tVar);
            }
        } else if (i2 == 3 && (tVar2 = this.f113803q) != null) {
            tVar2.mo66073b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.GameDetailUI2", "account not ready");
            finish();
            return;
        }
        this.f113797i = true;
        boolean z = false;
        this.f113798j = false;
        String stringExtra = getIntent().getStringExtra("game_app_id");
        this.f113792d = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.GameDetailUI2", "appid is null or nill");
            finish();
        } else {
            this.f113799n = getIntent().getIntExtra("game_report_from_scene", 0);
        }
        initView();
        C86709a0.m107524d().mo123455a(1217, this);
        byte[] Rz = ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57116Rz(this.f113792d);
        if (Rz == null || Rz.length == 0) {
            Log.m105924i("MicroMsg.GameDetailUI2", "No cache found");
        } else {
            C86709a0.m107525e().postToWorker(new C48170y(this, Rz));
            z = true;
        }
        if (!z) {
            Dialog d = C52642c.m58986d(this);
            this.f113791Z = d;
            d.show();
        }
        C86709a0.m107524d().mo123460f(new C42090r0(LocaleUtil.getApplicationLanguage(), this.f113792d, ((C79138l) C86312j.m106911c(C79138l.class)).Tb0(this, this.f113792d), true));
        C41864d.m45384a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
        C86709a0.m107524d().mo123470p(1217, this);
        C42091s.C42092a aVar = this.f113800o;
        if (aVar != null) {
            C42091s.m45785e(aVar);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo66153I7();
        return true;
    }

    public void onResume() {
        C42112t tVar;
        super.onResume();
        if (!(this.f113793e == null || (tVar = this.f113803q) == null)) {
            tVar.mo66073b();
            this.f113801p.mo72864b(this.f113809w, this.f113808v, this.f113793e, this.f113803q);
        }
        if (!this.f113797i) {
            mo66154J7(new C42066i0(this.f113792d));
        } else {
            this.f113797i = false;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f_l, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
            Dialog dialog = this.f113791Z;
            if (dialog != null) {
                dialog.cancel();
            }
        } else if (yVar.getType() == 1217) {
            C86709a0.m107525e().postToWorker(new C42179h(((C42090r0) yVar).f113395e.f127056b.f127083a));
        }
    }
}
