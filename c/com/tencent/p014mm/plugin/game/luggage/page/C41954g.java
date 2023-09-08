package com.tencent.p014mm.plugin.game.luggage.page;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43661n0;
import com.tencent.p014mm.plugin.webview.luggage.DownloadProgressImageView;
import com.tencent.p014mm.plugin.webview.luggage.RedDotView;
import com.tencent.p014mm.plugin.webview.luggage.menu.C43656s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import e51.C45548j;
import ex0.C45696d;
import ey1.C45718a;
import ey1.C45719b;
import f40.C86709a0;
import fy1.C45847c;
import fy1.C45850f;
import jy1.C9544f;
import p237sp.C36754a0;
import p237sp.C48458z;
import q20.C89449a;
import qo3.C77407n;
import x93.C53306f;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.g */
public class C41954g extends C43661n0 {

    /* renamed from: F */
    public GameWebPage f113009F;

    /* renamed from: G */
    public C45847c f113010G;

    /* renamed from: H */
    public C45719b f113011H;

    /* renamed from: I */
    public C45850f f113012I;

    /* renamed from: J */
    public View f113013J;

    /* renamed from: K */
    public DownloadProgressImageView f113014K;

    /* renamed from: L */
    public RedDotView f113015L;

    /* renamed from: M */
    public C45548j f113016M;

    /* renamed from: N */
    public View f113017N;

    /* renamed from: P */
    public View f113018P;

    /* renamed from: Q */
    public TextView f113019Q;

    /* renamed from: R */
    public String f113020R;

    /* renamed from: S */
    public String f113021S;

    /* renamed from: T */
    public int f113022T;

    /* renamed from: U */
    public String f113023U;

    /* renamed from: V */
    public String f113024V;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.g$a */
    public class C41955a implements C48458z.C48459a {
        public C41955a() {
        }

        /* renamed from: a */
        public void mo65731a(String str) {
            Log.m105920e("MicroMsg.GameWebActionBar", str);
            GameWebPage gameWebPage = C41954g.this.f113009F;
            gameWebPage.mo67938q(!(gameWebPage instanceof C41942a));
        }

        public void onDismiss() {
            GameWebPage gameWebPage = C41954g.this.f113009F;
            gameWebPage.mo67938q(!(gameWebPage instanceof C41942a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.g$b */
    public class C41956b implements Runnable {
        public C41956b() {
        }

        public void run() {
            if (Util.isNullOrNil(C41954g.this.f113009F.f148261n.getString("game_hv_menu_appid"))) {
                C41954g gVar = C41954g.this;
                gVar.f113011H = new C45719b(gVar.f113009F, 0, gVar.getMenuHelp());
                return;
            }
            C41954g gVar2 = C41954g.this;
            gVar2.f113012I = new C45850f(gVar2.f113009F, gVar2.getH5GameMenuHelp());
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.g$c */
    public class C41957c implements C45548j {

        /* renamed from: com.tencent.mm.plugin.game.luggage.page.g$c$a */
        public class C41958a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f113028d;

            public C41958a(boolean z) {
                this.f113028d = z;
            }

            public void run() {
                if (this.f113028d) {
                    C41954g.this.f113015L.setVisibility(0);
                } else {
                    C41954g.this.f113015L.setVisibility(8);
                }
            }
        }

        public C41957c() {
        }

        /* renamed from: a */
        public void mo65854a(boolean z) {
            C41954g.this.post(new C41958a(z));
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.luggage.page.g$d */
    public static final class C41959d implements C80883e<Bundle, Object> {
        private C41959d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            Class cls = C45696d.class;
            if (bundle != null) {
                String string = bundle.getString("userName");
                String string2 = bundle.getString("exportId");
                String string3 = bundle.getString("byPass");
                ((C45696d) C86709a0.m107533q(cls)).mo70956DY(MMApplicationContext.getContext(), string, string2, 9, ((C45696d) C86709a0.m107533q(cls)).gg0(string), string3);
                return;
            }
            Log.m105920e("MicroMsg.GameWebActionBar", "InvokeTask, mm received invalid data");
        }
    }

    public C41954g(GameWebPage gameWebPage) {
        super(gameWebPage);
        this.f113009F = gameWebPage;
        if (gameWebPage.f148261n.getBoolean("from_find_more_friend", false)) {
            mo65850m();
        }
        if (!(gameWebPage.f148261n.getInt("share_report_from_scene", -1) >= 0)) {
            setBackBtn(C0966R.raw.actionbar_icon_light_back);
        }
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f359813ax1, this.f117994g, false);
        this.f113017N = inflate;
        this.f113018P = inflate.findViewById(C0966R.C0970id.ln6);
        this.f113019Q = (TextView) this.f113017N.findViewById(C0966R.C0970id.hg4);
    }

    /* access modifiers changed from: private */
    public C45847c getH5GameMenuHelp() {
        if (this.f113010G == null) {
            this.f113010G = new C45847c(this.f113009F.f148261n.getString("game_hv_menu_appid"));
        }
        return this.f113010G;
    }

    /* renamed from: c */
    public void mo65843c() {
        C53306f fVar;
        C77407n nVar;
        C45719b bVar = this.f113011H;
        if (!(bVar == null || (nVar = bVar.f118058c) == null)) {
            nVar.mo107572p();
        }
        C45850f fVar2 = this.f113012I;
        if (fVar2 != null && (fVar = fVar2.f123796c) != null) {
            fVar.mo73932b();
        }
    }

    /* renamed from: d */
    public void mo65844d() {
        if (!C9544f.m9234b(this.f113009F)) {
            GameWebPage gameWebPage = this.f113009F;
            gameWebPage.mo67938q(!(gameWebPage instanceof C41942a));
        } else if (C9544f.f29738d != 0) {
            ((C36754a0) C86312j.m106911c(C36754a0.class)).mo60674nx().mo62505a(this.f117993f, C9544f.f29736b, C9544f.f29737c, 1, new C41955a());
        }
    }

    /* renamed from: e */
    public void mo65845e() {
        ((C45547h) C86312j.m106911c(C45547h.class)).mo70796in(this.f113016M);
    }

    /* renamed from: f */
    public void mo65846f() {
        mo65851n();
    }

    /* renamed from: g */
    public void mo65847g(boolean z) {
        super.mo65847g(z);
        DownloadProgressImageView downloadProgressImageView = this.f113014K;
        if (downloadProgressImageView != null) {
            downloadProgressImageView.setDarkMode(z);
        }
    }

    public C43656s getMenuHelp() {
        if (this.f118003s == null) {
            this.f118003s = new C45718a();
        }
        return this.f118003s;
    }

    /* renamed from: k */
    public void mo65849k() {
        MMHandlerThread.postToMainThreadDelayed(new C41956b(), getContext() instanceof MMActivity ? ((MMActivity) getContext()).hideVKBHavingResult() : false ? 100 : 0);
    }

    /* renamed from: m */
    public final synchronized void mo65850m() {
        if (this.f113013J == null) {
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.au6, this.f117999o, false);
            this.f113013J = inflate;
            this.f113014K = (DownloadProgressImageView) inflate.findViewById(C0966R.C0970id.c_d);
            this.f113015L = (RedDotView) this.f113013J.findViewById(C0966R.C0970id.c_f);
            this.f117999o.addView(this.f113013J, 0);
            mo65851n();
            this.f113016M = new C41957c();
            ((C45547h) C86312j.m106911c(C45547h.class)).Xh0(this.f113016M);
        }
    }

    /* renamed from: n */
    public void mo65851n() {
        if (this.f113015L != null) {
            if (((C45547h) C86312j.m106911c(C45547h.class)).Kq0()) {
                this.f113015L.setVisibility(0);
            } else {
                this.f113015L.setVisibility(8);
            }
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        if (f == 0.0f) {
            f = 1.0f;
        }
        if (f >= 0.0f && f <= 1.0f) {
            int i = (int) (f * 255.0f);
            DownloadProgressImageView downloadProgressImageView = this.f113014K;
            if (downloadProgressImageView != null) {
                downloadProgressImageView.setImageAlpha(i);
            }
        }
    }
}
