package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.model.C42039b;
import com.tencent.p014mm.plugin.game.model.C42056f0;
import com.tencent.p014mm.plugin.game.model.C42077m0;
import com.tencent.p014mm.plugin.game.model.C42115u0;
import com.tencent.p014mm.plugin.game.p061ui.GameInstalledView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import pe3.C47465a;
import py1.C47556c1;
import py1.C47578f2;
import py1.C47586g3;
import py1.C47593h3;
import py1.C47600i3;
import py1.C47649p3;
import ry1.C48130k0;
import ry1.C48138n0;
import ry1.C48158t0;
import ry1.C48163u0;
import ry1.C48165v0;
import sw1.C48483p;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI */
public class GameOverSeaCenterUI extends GameCenterBaseUI implements C11385n {

    /* renamed from: A */
    public C48130k0 f114103A = new C48130k0();

    /* renamed from: B */
    public boolean f114104B;

    /* renamed from: C */
    public String f114105C = "";

    /* renamed from: D */
    public boolean f114106D = true;

    /* renamed from: E */
    public View.OnClickListener f114107E = new C42224b();

    /* renamed from: r */
    public GameCenterListView f114108r;

    /* renamed from: s */
    public C42239a f114109s;

    /* renamed from: t */
    public GameInfoViewForeign f114110t;

    /* renamed from: u */
    public GameMessageBubbleView f114111u;

    /* renamed from: v */
    public GameInstalledView f114112v;

    /* renamed from: w */
    public View f114113w;

    /* renamed from: x */
    public TextView f114114x;

    /* renamed from: y */
    public Dialog f114115y;

    /* renamed from: z */
    public C47578f2 f114116z;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI$a */
    public class C42223a implements MenuItem.OnMenuItemClickListener {
        public C42223a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameOverSeaCenterUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI$b */
    public class C42224b implements View.OnClickListener {
        public C42224b() {
        }

        public void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object tag = view.getTag();
            if (tag != null && (tag instanceof String)) {
                String str = (String) tag;
                if (!Util.isNullOrNil(str)) {
                    i = C52642c.m59002t(GameOverSeaCenterUI.this.getContext(), str, "game_center_library");
                    C40314g.m43484c(GameOverSeaCenterUI.this.getContext(), 10, 1005, 1, i, GameOverSeaCenterUI.this.f113685i, (String) null);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
            Intent intent = new Intent(GameOverSeaCenterUI.this.getContext(), GameLibraryUI.class);
            intent.putExtra("game_report_from_scene", 1005);
            GameOverSeaCenterUI gameOverSeaCenterUI = GameOverSeaCenterUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            GameOverSeaCenterUI gameOverSeaCenterUI2 = gameOverSeaCenterUI;
            C117292a.m165358d(gameOverSeaCenterUI2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            gameOverSeaCenterUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(gameOverSeaCenterUI2, "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            i = 6;
            C40314g.m43484c(GameOverSeaCenterUI.this.getContext(), 10, 1005, 1, i, GameOverSeaCenterUI.this.f113685i, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI$c */
    public class C42225c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f114119d;

        /* renamed from: e */
        public final /* synthetic */ long f114120e;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameOverSeaCenterUI$c$a */
        public class C42226a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42077m0 f114122d;

            public C42226a(C42077m0 m0Var) {
                this.f114122d = m0Var;
            }

            public void run() {
                try {
                    GameOverSeaCenterUI.m45895N7(GameOverSeaCenterUI.this, this.f114122d, 2);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI crash, %s", e.getMessage());
                    GameOverSeaCenterUI.this.finish();
                }
                Dialog dialog = GameOverSeaCenterUI.this.f114115y;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m105925i("MicroMsg.GameOverSeaCenterUI", "Server data parsing time: %d", Long.valueOf(System.currentTimeMillis() - C42225c.this.f114120e));
            }
        }

        public C42225c(C47465a aVar, long j) {
            this.f114119d = aVar;
            this.f114120e = j;
        }

        public void run() {
            C47465a aVar = this.f114119d;
            if (aVar == null) {
                GameOverSeaCenterUI.this.f114116z = new C47578f2();
            } else {
                GameOverSeaCenterUI.this.f114116z = (C47578f2) aVar;
            }
            MMHandlerThread.postToMainThread(new C42226a(new C42077m0(this.f114119d, true)));
        }
    }

    /* renamed from: N7 */
    public static void m45895N7(GameOverSeaCenterUI gameOverSeaCenterUI, C42077m0 m0Var, int i) {
        LinkedList<C47593h3> linkedList;
        C42039b a;
        C47600i3 i3Var;
        C47556c1 c1Var;
        if (gameOverSeaCenterUI.isFinishing()) {
            Log.m105928w("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI hasFinished");
        } else if (m0Var == null) {
            Log.m105920e("MicroMsg.GameOverSeaCenterUI", "Null data");
        } else {
            C47578f2 f2Var = m0Var.f113371a;
            C47649p3 p3Var = null;
            if ((f2Var != null ? f2Var.f127690e : null) != null) {
                gameOverSeaCenterUI.f114105C = (f2Var != null ? f2Var.f127690e : null).f127886d;
            } else {
                gameOverSeaCenterUI.f114105C = "";
            }
            if (!Util.isNullOrNil(gameOverSeaCenterUI.f114105C)) {
                if (!gameOverSeaCenterUI.f114104B) {
                    gameOverSeaCenterUI.addIconOptionMenu(0, C0966R.raw.actionbar_setting_icon, new C48165v0(gameOverSeaCenterUI));
                    gameOverSeaCenterUI.f114104B = true;
                }
            } else if (gameOverSeaCenterUI.f114104B) {
                gameOverSeaCenterUI.removeOptionMenu(0);
                gameOverSeaCenterUI.f114104B = false;
            }
            C47578f2 f2Var2 = m0Var.f113371a;
            if (((f2Var2 == null || (c1Var = f2Var2.f127689d) == null) ? null : c1Var.f127615e) != null) {
                gameOverSeaCenterUI.f114110t.setSourceScene(gameOverSeaCenterUI.f113685i);
                gameOverSeaCenterUI.f114110t.setVisibility(0);
            } else {
                gameOverSeaCenterUI.f114110t.setVisibility(8);
            }
            gameOverSeaCenterUI.f114112v.setSourceScene(gameOverSeaCenterUI.f113685i);
            gameOverSeaCenterUI.f114112v.setVersionCodes(m0Var.f113374d);
            GameInstalledView gameInstalledView = gameOverSeaCenterUI.f114112v;
            GameInstalledView.C42204b bVar = new GameInstalledView.C42204b();
            C47586g3 g3Var = m0Var.f113371a.f127692g;
            if (!(g3Var == null || (i3Var = g3Var.f127714f) == null)) {
                bVar.f113997a = i3Var.f127786d;
                bVar.f113998b = i3Var.f127787e;
                bVar.f113999c = i3Var.f127788f;
            }
            gameInstalledView.setMoreGameInfo(bVar);
            GameInstalledView gameInstalledView2 = gameOverSeaCenterUI.f114112v;
            LinkedList linkedList2 = new LinkedList();
            C47586g3 g3Var2 = m0Var.f113371a.f127692g;
            if (!(g3Var2 == null || (linkedList = g3Var2.f127713e) == null)) {
                Iterator<C47593h3> it = linkedList.iterator();
                while (it.hasNext()) {
                    C47593h3 next = it.next();
                    if (!(next == null || (a = C42056f0.m45762a(next.f127755d)) == null)) {
                        a.f149245M = next.f127756e;
                        a.f149233A = true;
                        linkedList2.addFirst(a);
                    }
                }
            }
            gameInstalledView2.setInstalledGameInfo(linkedList2);
            gameOverSeaCenterUI.f114112v.mo66219b(true);
            if (gameOverSeaCenterUI.f113684h) {
                gameOverSeaCenterUI.f114111u.mo66241a();
            }
            C47578f2 f2Var3 = m0Var.f113371a;
            if (f2Var3 != null) {
                p3Var = f2Var3.f127693h;
            }
            if (p3Var == null || Util.isNullOrNil(p3Var.f127924d) || Util.isNullOrNil(p3Var.f127925e)) {
                View view = gameOverSeaCenterUI.f114113w;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataOverSea;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataOverSea;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view2 = gameOverSeaCenterUI.f114113w;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataOverSea;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/game/ui/GameOverSeaCenterUI", "setData", "(Lcom/tencent/mm/plugin/game/model/GamePBDataOverSea;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                gameOverSeaCenterUI.f114114x.setText(p3Var.f127924d);
                gameOverSeaCenterUI.f114113w.setTag(p3Var.f127925e);
                gameOverSeaCenterUI.f114113w.setOnClickListener(gameOverSeaCenterUI.f114107E);
            }
            C42239a aVar3 = gameOverSeaCenterUI.f114109s;
            aVar3.f114391q = i;
            LinkedList<C42039b> linkedList3 = m0Var.f113373c;
            if (linkedList3 != null) {
                ThreadPool.post(new C48138n0(aVar3, linkedList3), "game_get_download_info");
            }
            if (i == 2) {
                C52642c.m58994l().postToWorker(new C48163u0(gameOverSeaCenterUI));
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aut;
    }

    public void initView() {
        setBackBtn(new C42223a());
        setMMTitle((int) C0966R.string.fcu);
        GameCenterListView gameCenterListView = (GameCenterListView) findViewById(C0966R.C0970id.eia);
        this.f114108r = gameCenterListView;
        gameCenterListView.setOnItemClickListener(this.f114103A);
        this.f114103A.f129022d = this.f113685i;
        C42239a aVar = new C42239a(this);
        this.f114109s = aVar;
        aVar.f114390p = this.f113685i;
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.auv, this.f114108r, false);
        this.f114110t = (GameInfoViewForeign) inflate.findViewById(C0966R.C0970id.ei9);
        this.f114108r.addHeaderView(inflate);
        View inflate2 = layoutInflater.inflate(C0966R.C0971layout.aus, this.f114108r, false);
        this.f114111u = (GameMessageBubbleView) inflate2.findViewById(C0966R.C0970id.eml);
        this.f114108r.addHeaderView(inflate2);
        View inflate3 = layoutInflater.inflate(C0966R.C0971layout.auw, this.f114108r, false);
        this.f114112v = (GameInstalledView) inflate3.findViewById(C0966R.C0970id.elc);
        this.f114108r.addHeaderView(inflate3);
        View inflate4 = layoutInflater.inflate(C0966R.C0971layout.auu, this.f114108r, false);
        this.f114108r.addFooterView(inflate4);
        View findViewById = inflate4.findViewById(C0966R.C0970id.ekp);
        this.f114113w = findViewById;
        findViewById.setOnClickListener(this.f114107E);
        this.f114114x = (TextView) inflate4.findViewById(C0966R.C0970id.ekq);
        this.f114108r.setAdapter(this.f114109s);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.GameOverSeaCenterUI", "GameOverSeaCenterUI create");
        C86709a0.m107524d().mo123455a(2855, this);
        initView();
        C52642c.m58994l().postToWorker(new C48158t0(this));
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameOverSeaCenterUI", "onDestroy");
        super.onDestroy();
        C52638a.C52640b.f146975a.mo73588a();
        C86709a0.m107524d().mo123470p(2855, this);
        ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65970a();
    }

    public void onResume() {
        super.onResume();
        if (!this.f114106D) {
            if (this.f113684h) {
                this.f114111u.mo66241a();
            }
            this.f114110t.mo66215a();
        }
        this.f114106D = false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GameOverSeaCenterUI", "errType: %d errCode: %d, scene: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.hashCode()));
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f_l, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
            Dialog dialog = this.f114115y;
            if (dialog != null) {
                dialog.cancel();
            }
        } else if (yVar.getType() == 2855) {
            long currentTimeMillis = System.currentTimeMillis();
            C52642c.m58994l().postToWorker(new C42225c(((C42115u0) yVar).f113429d.f127056b.f127083a, currentTimeMillis));
        }
    }
}
