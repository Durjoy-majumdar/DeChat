package com.tencent.p014mm.plugin.game.p061ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42068j0;
import com.tencent.p014mm.plugin.game.model.C42113t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import pe3.C47465a;
import py1.C47541a0;
import py1.C47564d2;
import ry1.C48100a0;
import ry1.C48107b0;
import sw1.C48483p;
import sw1.C48484q;
import uy1.C52638a;
import uy1.C52642c;

/* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI */
public class GameDownloadGuidanceUI extends GameCenterBaseUI implements C11385n {

    /* renamed from: r */
    public Dialog f113829r;

    /* renamed from: s */
    public LinearLayout f113830s;

    /* renamed from: t */
    public TextView f113831t;

    /* renamed from: u */
    public TextView f113832u;

    /* renamed from: v */
    public TextView f113833v;

    /* renamed from: w */
    public boolean f113834w;

    /* renamed from: x */
    public String f113835x = "";

    /* renamed from: y */
    public C47564d2 f113836y;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI$a */
    public class C42184a implements MenuItem.OnMenuItemClickListener {
        public C42184a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GameDownloadGuidanceUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI$b */
    public class C42185b implements Runnable {
        public C42185b() {
        }

        public void run() {
            ((C48484q) C86312j.m106911c(C48484q.class)).mo66106SL().mo57119qq("pb_over_sea", GameDownloadGuidanceUI.this.f113836y);
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI$c */
    public class C42186c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C47465a f113839d;

        /* renamed from: e */
        public final /* synthetic */ long f113840e;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameDownloadGuidanceUI$c$a */
        public class C42187a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C42068j0 f113842d;

            public C42187a(C42068j0 j0Var) {
                this.f113842d = j0Var;
            }

            public void run() {
                try {
                    GameDownloadGuidanceUI.this.mo66167N7(this.f113842d, 2);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI crash, %s", e.getMessage());
                    GameDownloadGuidanceUI.this.finish();
                }
                Dialog dialog = GameDownloadGuidanceUI.this.f113829r;
                if (dialog != null) {
                    dialog.dismiss();
                }
                Log.m105925i("MicroMsg.GameDownloadGuidanceUI", "Server data parsing time: %d", Long.valueOf(System.currentTimeMillis() - C42186c.this.f113840e));
            }
        }

        public C42186c(C47465a aVar, long j) {
            this.f113839d = aVar;
            this.f113840e = j;
        }

        public void run() {
            C47465a aVar = this.f113839d;
            if (aVar == null) {
                GameDownloadGuidanceUI.this.f113836y = new C47564d2();
            } else {
                GameDownloadGuidanceUI.this.f113836y = (C47564d2) aVar;
            }
            MMHandlerThread.postToMainThread(new C42187a(new C42068j0(this.f113839d)));
        }
    }

    /* renamed from: N7 */
    public void mo66167N7(C42068j0 j0Var, int i) {
        if (isFinishing()) {
            Log.m105928w("MicroMsg.GameDownloadGuidanceUI", "GameDownloadGuidanceUI hasFinished");
            return;
        }
        if (j0Var != null) {
            C47564d2 d2Var = j0Var.f113347a;
            C47541a0 a0Var = null;
            if ((d2Var != null ? d2Var.f127638d : null) != null) {
                if ((d2Var != null ? d2Var.f127639e : null) != null) {
                    this.f113835x = (d2Var != null ? d2Var.f127639e : null).f127886d;
                } else {
                    this.f113835x = "";
                }
                if (!Util.isNullOrNil(this.f113835x)) {
                    if (!this.f113834w) {
                        addIconOptionMenu(0, C0966R.raw.actionbar_setting_icon, new C48107b0(this));
                        this.f113834w = true;
                    }
                } else if (this.f113834w) {
                    removeOptionMenu(0);
                    this.f113834w = false;
                }
                this.f113830s.setVisibility(0);
                C47564d2 d2Var2 = j0Var.f113347a;
                if (d2Var2 != null) {
                    a0Var = d2Var2.f127638d;
                }
                if (!Util.isNullOrNil(a0Var.f127552d)) {
                    this.f113831t.setText(a0Var.f127552d);
                    this.f113831t.setVisibility(0);
                } else {
                    this.f113831t.setVisibility(8);
                }
                if (!Util.isNullOrNil(a0Var.f127553e)) {
                    this.f113832u.setText(a0Var.f127553e);
                    this.f113832u.setVisibility(0);
                } else {
                    this.f113832u.setVisibility(8);
                }
                if (!Util.isNullOrNil(a0Var.f127554f)) {
                    this.f113833v.setText(a0Var.f127554f);
                    this.f113833v.setVisibility(0);
                } else {
                    this.f113833v.setVisibility(8);
                }
                if (i == 2) {
                    C52642c.m58994l().postToWorker(new C42185b());
                    return;
                }
                return;
            }
        }
        Log.m105920e("MicroMsg.GameDownloadGuidanceUI", "Null data");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.awg;
    }

    public void initView() {
        setBackBtn(new C42184a());
        setMMTitle((int) C0966R.string.fcu);
        this.f113830s = (LinearLayout) findViewById(C0966R.C0970id.f357785br0);
        this.f113831t = (TextView) findViewById(C0966R.C0970id.gkr);
        this.f113832u = (TextView) findViewById(C0966R.C0970id.j7m);
        this.f113833v = (TextView) findViewById(C0966R.C0970id.j7d);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(2586, this);
        initView();
        C52642c.m58994l().postToWorker(new C48100a0(this));
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.GameDownloadGuidanceUI", "onDestroy");
        super.onDestroy();
        C52638a.C52640b.f146975a.mo73588a();
        C86709a0.m107524d().mo123470p(2586, this);
        ((C48483p) C86312j.m106911c(C48483p.class)).xg0().mo65970a();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GameDownloadGuidanceUI", "errType: %d errCode: %d, scene: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.hashCode()));
        if (i != 0 || i2 != 0) {
            if (!((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f_l, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
            Dialog dialog = this.f113829r;
            if (dialog != null) {
                dialog.cancel();
            }
        } else if (yVar.getType() == 2586) {
            long currentTimeMillis = System.currentTimeMillis();
            C52642c.m58994l().postToWorker(new C42186c(((C42113t0) yVar).f113427d.f127056b.f127083a, currentTimeMillis));
        }
    }
}
