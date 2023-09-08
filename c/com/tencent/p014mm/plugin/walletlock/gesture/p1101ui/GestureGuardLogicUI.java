package com.tencent.p014mm.plugin.walletlock.gesture.p1101ui;

import al3.C0086a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;
import b73.C28273c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.widget.PatternLockView;
import com.tencent.p014mm.plugin.walletlock.model.C106560i;
import com.tencent.p014mm.plugin.walletlock.model.C106561j;
import com.tencent.p014mm.plugin.walletlock.p951ui.C85509a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import g73.C107759d;
import g73.C107761f;
import g73.C107762g;
import g73.C75893h;
import g73.C8245c;
import h73.C108152d;
import h73.C108153e;
import h73.C108154f;
import h73.C108155g;
import h73.C108156h;
import h73.C108157i;
import h73.C108158j;
import h73.C108159k;
import h73.C108160l;
import h73.C108161m;
import h73.C108162n;
import h73.C108163o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p154fy.C87121j;
import p910lj.C76701a;
import qo3.C77389a;
import qo3.C77398g;
import te3.C49666h63;
import te3.C50166kq3;
import te3.C51018qv3;
import te3.C64437i63;
import te3.C64533lq3;
import tj0.C90507c;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI */
public class GestureGuardLogicUI extends MMActivity implements PatternLockView.C106552a, View.OnClickListener, C85509a {

    /* renamed from: y */
    public static final /* synthetic */ int f318298y = 0;

    /* renamed from: d */
    public int f318299d = 0;

    /* renamed from: e */
    public int f318300e = 0;

    /* renamed from: f */
    public int f318301f;

    /* renamed from: g */
    public int f318302g = 0;

    /* renamed from: h */
    public C108163o[] f318303h = null;

    /* renamed from: i */
    public Animation f318304i = null;

    /* renamed from: j */
    public List<C75893h> f318305j = null;

    /* renamed from: n */
    public List<C75893h> f318306n = null;

    /* renamed from: o */
    public boolean f318307o = false;

    /* renamed from: p */
    public int f318308p = 0;

    /* renamed from: q */
    public String f318309q = null;

    /* renamed from: r */
    public ViewFlipper f318310r = null;

    /* renamed from: s */
    public MMHandler f318311s = new MMHandler(Looper.getMainLooper());

    /* renamed from: t */
    public Dialog f318312t = null;

    /* renamed from: u */
    public boolean f318313u = true;

    /* renamed from: v */
    public boolean f318314v = false;

    /* renamed from: w */
    public String f318315w;

    /* renamed from: x */
    public int f318316x = -1;

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$a */
    public class C106536a implements DialogInterface.OnCancelListener {
        public C106536a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
            gestureGuardLogicUI.f318303h[gestureGuardLogicUI.f318302g].f323888c.mo153225b();
            GestureGuardLogicUI.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$b */
    public class C106537b implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ l0$$e f318318d;

        public C106537b(l0$$e l0__e) {
            this.f318318d = l0__e;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}));
            GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
            int i3 = GestureGuardLogicUI.f318298y;
            gestureGuardLogicUI.mo153206I7();
            if (i == 0 && i2 == 0) {
                C107761f.m145992i(((C64533lq3) cVar.f127056b.f127083a).f184152d);
                GestureGuardLogicUI.m143838H7(GestureGuardLogicUI.this);
                ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91359l(1);
            }
            C106561j.INSTANCE.mo153262e();
            l0$$e l0__e = this.f318318d;
            if (l0__e != null) {
                return l0__e.mo1488a(i, i2, str, cVar, yVar);
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$c */
    public class C106538c implements MenuItem.OnMenuItemClickListener {
        public C106538c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
            int i = GestureGuardLogicUI.f318298y;
            if (gestureGuardLogicUI.mo153207J7()) {
                return true;
            }
            GestureGuardLogicUI.this.mo153212O7(0, 4, "user cancel when setting gesture");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$d */
    public class C106539d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C106549m f318321a;

        public C106539d(C106549m mVar) {
            this.f318321a = mVar;
        }

        public void onAnimationEnd(Animation animation) {
            GestureGuardLogicUI.this.f318304i.setAnimationListener((Animation.AnimationListener) null);
            C106549m mVar = this.f318321a;
            if (mVar != null) {
                mVar.onDone();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$e */
    public class C106540e implements l0$$e {
        public C106540e() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i2 == 0) {
                C107761f.m145989f();
                C107761f.m145987d();
                C107761f.m145988e();
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fei), 0).show();
            } else {
                GestureGuardLogicUI gestureGuardLogicUI2 = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI2, (CharSequence) gestureGuardLogicUI2.getString(C0966R.string.f360856fe1), 0).show();
            }
            GestureGuardLogicUI gestureGuardLogicUI3 = GestureGuardLogicUI.this;
            gestureGuardLogicUI3.f318309q = null;
            gestureGuardLogicUI3.getClass();
            GestureGuardLogicUI.this.finish();
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$f */
    public class C106541f implements l0$$e {
        public C106541f() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i2 == 0) {
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fek), 0).show();
                C115669n.INSTANCE.mo160131h(11474, new Object[0]);
            } else {
                GestureGuardLogicUI gestureGuardLogicUI2 = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI2, (CharSequence) gestureGuardLogicUI2.getString(C0966R.string.f360856fe1), 0).show();
            }
            GestureGuardLogicUI gestureGuardLogicUI3 = GestureGuardLogicUI.this;
            gestureGuardLogicUI3.f318309q = null;
            gestureGuardLogicUI3.f318305j = null;
            gestureGuardLogicUI3.finish();
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$g */
    public class C106542g implements l0$$e {
        public C106542g() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i2 == 0) {
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fek), 0).show();
            } else {
                GestureGuardLogicUI gestureGuardLogicUI2 = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI2, (CharSequence) gestureGuardLogicUI2.getString(C0966R.string.f360856fe1), 0).show();
            }
            GestureGuardLogicUI gestureGuardLogicUI3 = GestureGuardLogicUI.this;
            gestureGuardLogicUI3.f318306n = null;
            gestureGuardLogicUI3.f318305j = null;
            gestureGuardLogicUI3.finish();
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$h */
    public class C106543h implements l0$$e {
        public C106543h() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
            gestureGuardLogicUI.f318309q = null;
            gestureGuardLogicUI.f318305j = null;
            if (i2 == 0) {
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fej), 0).show();
                GestureGuardLogicUI.this.mo153212O7(-1, 0, "open gesture ok");
            } else {
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.f360856fe1), 0).show();
                GestureGuardLogicUI.this.mo153212O7(-1, -1, "open gesture failed");
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$i */
    public class C106544i implements l0$$e {
        public C106544i() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i2 == 0) {
                C107761f.f322498a = SystemClock.elapsedRealtime();
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fek), 0).show();
                GestureGuardLogicUI gestureGuardLogicUI2 = GestureGuardLogicUI.this;
                int i3 = GestureGuardLogicUI.f318298y;
                gestureGuardLogicUI2.mo153209L7();
            } else {
                GestureGuardLogicUI gestureGuardLogicUI3 = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI3, (CharSequence) gestureGuardLogicUI3.getString(C0966R.string.f360856fe1), 0).show();
            }
            GestureGuardLogicUI gestureGuardLogicUI4 = GestureGuardLogicUI.this;
            gestureGuardLogicUI4.f318309q = null;
            gestureGuardLogicUI4.f318305j = null;
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$j */
    public class C106545j implements C106549m {

        /* renamed from: a */
        public final /* synthetic */ C108163o f318328a;

        /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$j$a */
        public class C106546a implements Runnable {
            public C106546a() {
            }

            public void run() {
                GestureGuardLogicUI.this.f318311s.removeCallbacks(this);
                C106545j.this.f318328a.f323888c.mo153225b();
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                gestureGuardLogicUI.f318301f = 16;
                gestureGuardLogicUI.mo153213P7(1, true);
                GestureGuardLogicUI.this.mo153210M7();
            }
        }

        public C106545j(C108163o oVar) {
            this.f318328a = oVar;
        }

        public void onDone() {
            GestureGuardLogicUI.this.f318311s.postDelayed(new C106546a(), 500);
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$k */
    public class C106547k implements l0$$e {
        public C106547k() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            if (i2 == 0) {
                GestureGuardLogicUI gestureGuardLogicUI = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI, (CharSequence) gestureGuardLogicUI.getString(C0966R.string.fei), 0).show();
            } else {
                GestureGuardLogicUI gestureGuardLogicUI2 = GestureGuardLogicUI.this;
                C76701a.makeText((Context) gestureGuardLogicUI2, (CharSequence) gestureGuardLogicUI2.getString(C0966R.string.f360856fe1), 0).show();
            }
            GestureGuardLogicUI gestureGuardLogicUI3 = GestureGuardLogicUI.this;
            gestureGuardLogicUI3.f318306n = null;
            gestureGuardLogicUI3.finish();
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$l */
    public class C106548l implements C106549m {

        /* renamed from: a */
        public final /* synthetic */ C108163o f318332a;

        public C106548l(C108163o oVar) {
            this.f318332a = oVar;
        }

        public void onDone() {
            GestureGuardLogicUI.this.f318301f = 0;
            this.f318332a.f323888c.mo153225b();
            this.f318332a.f323888c.setEnableInput(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI$m */
    public interface C106549m {
        void onDone();
    }

    /* renamed from: H7 */
    public static void m143838H7(GestureGuardLogicUI gestureGuardLogicUI) {
        gestureGuardLogicUI.getClass();
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71223wE(C75592q0.m90789s(), 9, "PatternLockUpdate", "");
        C115669n.INSTANCE.mo160131h(11473, new Object[0]);
    }

    /* renamed from: I7 */
    public final void mo153206I7() {
        Dialog dialog = this.f318312t;
        if (dialog != null && dialog.isShowing()) {
            this.f318312t.dismiss();
        }
    }

    /* renamed from: J7 */
    public final boolean mo153207J7() {
        int i = this.f318301f;
        if (i == 20 || i == 0 || i == 2 || i == 1) {
            mo153208K7();
            return false;
        }
        if (this.f318313u) {
            String stringExtra = getIntent().getStringExtra("next_action");
            String string = "next_action.modify_pattern".equals(stringExtra) ? getString(C0966R.string.fdy) : "next_action.switch_on_pattern".equals(stringExtra) ? getString(C0966R.string.fdz) : getString(C0966R.string.fdy);
            C77389a aVar = new C77389a();
            aVar.f225668y = false;
            aVar.f225660q = string;
            aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.fdw);
            aVar.f225620C = new C108162n(this);
            aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.fdu);
            aVar.f225621D = new C108161m(this);
            C77398g gVar = new C77398g(this, C0966R.style.a66);
            gVar.mo107525e(aVar);
            gVar.show();
        } else {
            C77389a aVar2 = new C77389a();
            aVar2.f225668y = true;
            aVar2.f225660q = C0086a.m38a(this).getString(C0966R.string.f360855fe0);
            aVar2.f225663t = C0086a.m38a(this).getString(C0966R.string.fdv);
            aVar2.f225620C = new C108160l(this);
            C77398g gVar2 = new C77398g(this, C0966R.style.a66);
            gVar2.mo107525e(aVar2);
            gVar2.show();
        }
        return true;
    }

    /* renamed from: K7 */
    public final void mo153208K7() {
        String stringExtra = getIntent().getStringExtra("next_action");
        if (this.f318301f == 20 || "next_action.goto_protected_page".equals(stringExtra)) {
            C106561j.INSTANCE.mo153260b();
        }
    }

    /* renamed from: L7 */
    public final void mo153209L7() {
        Intent intent = (Intent) getIntent().getParcelableExtra("page_intent");
        if (intent != null) {
            C106561j jVar = C106561j.INSTANCE;
            jVar.mo153263f(true);
            jVar.mo153264g(true);
            intent.addFlags(131072);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "doGotoProtectedPage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            Log.m105924i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
        }
        finish();
    }

    /* renamed from: M7 */
    public final void mo153210M7() {
        PatternLockView.C106553b bVar = PatternLockView.C106553b.Wrong;
        C108163o[] oVarArr = this.f318303h;
        if (oVarArr != null) {
            C108163o oVar = oVarArr[this.f318302g];
            int i = this.f318301f;
            if (i == 0) {
                setMMTitle(getString(C0966R.string.feh));
                this.f318307o = false;
                oVar.f323888c.setEnableInput(true);
                oVar.f323888c.setOnPatternListener(this);
                if (!"next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
                    oVar.f323887b.setText(getString(C0966R.string.fec));
                } else if (!Util.isNullOrNil(this.f318315w)) {
                    oVar.f323887b.setText(this.f318315w);
                } else {
                    oVar.f323887b.setText(getString(C0966R.string.fed));
                }
                oVar.f323887b.setTextColor(this.f318299d);
                if (oVar.f323889d.getVisibility() != 0) {
                    oVar.f323889d.setVisibility(0);
                }
            } else if (i == 1) {
                String stringExtra = getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    oVar.f323888c.mo153225b();
                    mo153213P7(1, true);
                    this.f318301f = 16;
                    mo153210M7();
                } else if ("next_action.switch_off_pattern".equals(stringExtra)) {
                    List<C75893h> list = this.f318306n;
                    C106547k kVar = new C106547k();
                    mo153215R7(new C108154f(this));
                    C47350c.C47352b bVar2 = new C47350c.C47352b();
                    bVar2.f127066a = new C49666h63();
                    bVar2.f127067b = new C64437i63();
                    bVar2.f127069d = 689;
                    bVar2.f127068c = "/cgi-bin/micromsg-bin/oppatternlock";
                    C47350c a = bVar2.mo72403a();
                    C49666h63 h632 = (C49666h63) a.f127055a.f127080a;
                    h632.f134461d = 3;
                    C51018qv3 qv32 = new C51018qv3();
                    qv32.mo73350k(C107762g.m145995c(list));
                    h632.f134462e = qv32;
                    C89144l0.m111429e(a, new C108155g(this, kVar), false);
                } else if ("next_action.goto_protected_page".equals(stringExtra)) {
                    C107761f.f322498a = SystemClock.elapsedRealtime();
                    mo153209L7();
                    C106560i.m143897c(this.f318316x, 1, 0);
                }
            } else if (i != 2) {
                String str = "next_action.modify_pattern";
                switch (i) {
                    case 16:
                        String stringExtra2 = getIntent().getStringExtra("next_action");
                        if (str.equals(stringExtra2)) {
                            setMMTitle(getString(C0966R.string.fef));
                            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                            wCPaySaftyClickReportStruct.f194681d = 5;
                            wCPaySaftyClickReportStruct.f194682e = 1;
                            wCPaySaftyClickReportStruct.mo86054n();
                        } else if ("next_action.switch_on_pattern".equals(stringExtra2)) {
                            setMMTitle(getString(C0966R.string.feg));
                            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new WCPaySaftyClickReportStruct();
                            wCPaySaftyClickReportStruct2.f194681d = 4;
                            wCPaySaftyClickReportStruct2.f194682e = 1;
                            wCPaySaftyClickReportStruct2.mo86054n();
                        } else {
                            setMMTitle(getString(C0966R.string.fef));
                            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new WCPaySaftyClickReportStruct();
                            wCPaySaftyClickReportStruct3.f194681d = 5;
                            wCPaySaftyClickReportStruct3.f194682e = 1;
                            wCPaySaftyClickReportStruct3.mo86054n();
                        }
                        this.f318307o = false;
                        oVar.f323888c.setEnableInput(true);
                        oVar.f323888c.setOnPatternListener(this);
                        oVar.f323887b.setText(getString(C0966R.string.feb));
                        oVar.f323887b.setTextColor(getResources().getColor(C0966R.color.a7f));
                        if (oVar.f323889d.getVisibility() != 8) {
                            oVar.f323889d.setVisibility(8);
                            return;
                        }
                        return;
                    case 17:
                        oVar.f323887b.setText(getResources().getString(C0966R.string.fe_));
                        oVar.f323887b.setTextColor(this.f318299d);
                        oVar.f323888c.mo153225b();
                        oVar.f323888c.setEnableInput(true);
                        if (oVar.f323889d.getVisibility() != 8) {
                            oVar.f323889d.setVisibility(8);
                            return;
                        }
                        return;
                    case 18:
                        String stringExtra3 = getIntent().getStringExtra("next_action");
                        if (str.equals(stringExtra3)) {
                            if (this.f318314v) {
                                this.f318314v = false;
                                mo153211N7(this.f318309q, this.f318305j, new C106541f());
                                return;
                            }
                            List<C75893h> list2 = this.f318306n;
                            List<C75893h> list3 = this.f318305j;
                            C106542g gVar = new C106542g();
                            C47350c.C47352b bVar3 = new C47350c.C47352b();
                            mo153215R7(new C108152d(this));
                            bVar3.f127066a = new C49666h63();
                            bVar3.f127067b = new C64437i63();
                            bVar3.f127069d = 689;
                            bVar3.f127068c = "/cgi-bin/micromsg-bin/oppatternlock";
                            C47350c a2 = bVar3.mo72403a();
                            C49666h63 h633 = (C49666h63) a2.f127055a.f127080a;
                            h633.f134461d = 1;
                            C51018qv3 qv33 = new C51018qv3();
                            qv33.mo73350k(C107762g.m145995c(list2));
                            h633.f134462e = qv33;
                            C51018qv3 qv34 = new C51018qv3();
                            qv34.mo73350k(C107762g.m145995c(list3));
                            h633.f134463f = qv34;
                            C89144l0.m111429e(a2, new C108153e(this, gVar), false);
                            return;
                        } else if ("next_action.switch_on_pattern".equals(stringExtra3)) {
                            mo153211N7(this.f318309q, this.f318305j, new C106543h());
                            return;
                        } else if ("next_action.goto_protected_page".equals(stringExtra3)) {
                            mo153211N7(this.f318309q, this.f318305j, new C106544i());
                            return;
                        } else {
                            return;
                        }
                    case 19:
                        oVar.f323888c.setEnableInput(false);
                        oVar.f323888c.setDisplayMode(bVar);
                        mo153214Q7(getResources().getString(C0966R.string.fea), new C106545j(oVar));
                        return;
                    case 20:
                        setMMTitle(getString(C0966R.string.fee));
                        setMMTitle(getString(C0966R.string.fef));
                        int i2 = this.f318316x;
                        if (i2 == 1) {
                            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct4 = new WCPaySaftyClickReportStruct();
                            wCPaySaftyClickReportStruct4.f194681d = 8;
                            wCPaySaftyClickReportStruct4.f194682e = 1;
                            wCPaySaftyClickReportStruct4.mo86054n();
                        } else if (i2 == 2) {
                            WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct5 = new WCPaySaftyClickReportStruct();
                            wCPaySaftyClickReportStruct5.f194681d = 10;
                            wCPaySaftyClickReportStruct5.f194682e = 1;
                            wCPaySaftyClickReportStruct5.mo86054n();
                        }
                        this.f318307o = true;
                        oVar.f323888c.setEnableInput(false);
                        oVar.f323888c.setOnPatternListener((PatternLockView.C106552a) null);
                        oVar.f323887b.setText(String.format(getString(C0966R.string.fe8), new Object[]{Long.valueOf((long) Math.ceil(((double) (600 - (C107761f.m145984a().f322500b / 1000))) / 60.0d))}));
                        oVar.f323887b.setTextColor(getResources().getColor(C0966R.color.a_3));
                        return;
                    default:
                        return;
                }
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C107761f.m145991h(elapsedRealtime, 0);
                int i3 = this.f318308p;
                C85801v1 i4 = C86709a0.m107535s().mo121142i();
                if (i4 != null) {
                    i4.mo119676J(339972, Integer.valueOf(i3));
                    i4.mo119681a(true);
                }
                C107761f.f322498a = -1;
                if (this.f318308p == 5) {
                    this.f318307o = true;
                    C107761f.m145990g(elapsedRealtime, 0);
                    oVar.f323888c.mo153225b();
                    oVar.f323888c.setEnableInput(false);
                    this.f318301f = 20;
                    mo153210M7();
                    C77389a aVar = new C77389a();
                    aVar.f225668y = false;
                    aVar.f225660q = String.format(getString(C0966R.string.fdx), new Object[]{10L});
                    aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.fdt);
                    aVar.f225620C = new C108158j(this);
                    aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.fds);
                    aVar.f225621D = new C108159k(this);
                    C77398g gVar2 = new C77398g(this, C0966R.style.a66);
                    gVar2.mo107525e(aVar);
                    gVar2.show();
                } else {
                    oVar.f323888c.setEnableInput(false);
                    oVar.f323888c.setDisplayMode(bVar);
                    mo153214Q7(String.format(getResources().getString(C0966R.string.fe4), new Object[]{Integer.valueOf(5 - this.f318308p)}), new C106548l(oVar));
                }
                String stringExtra4 = getIntent().getStringExtra("next_action");
                Log.m105925i("MicroMsg.GestureGuardLogicUI", "alvinluo nextAction: %s", stringExtra4);
                if (!"next_action.goto_protected_page".equals(stringExtra4)) {
                    return;
                }
                if (this.f318308p == 5) {
                    C106560i.m143897c(this.f318316x, 1, 2);
                } else {
                    C106560i.m143897c(this.f318316x, 1, 1);
                }
            }
        }
    }

    /* renamed from: N7 */
    public final void mo153211N7(String str, List<C75893h> list, l0$$e l0__e) {
        mo153215R7(new C106536a());
        if (str == null) {
            mo153206I7();
            if (l0__e != null) {
                l0__e.mo1488a(3, -6, getString(C0966R.string.f360858fe3), (C47350c) null, (C117747y) null);
                return;
            }
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50166kq3();
        bVar.f127067b = new C64533lq3();
        bVar.f127069d = C90507c.CTRL_INDEX;
        bVar.f127068c = "/cgi-bin/micromsg-bin/registernewpatternlock";
        C47350c a = bVar.mo72403a();
        C50166kq3 kq32 = (C50166kq3) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(str.getBytes());
        kq32.f136989d = qv32;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(C107762g.m145995c(list));
        kq32.f136990e = qv33;
        C89144l0.m111429e(a, new C106537b(l0__e), false);
    }

    /* renamed from: O7 */
    public final void mo153212O7(int i, int i2, String str) {
        Log.m105924i("MicroMsg.GestureGuardLogicUI", "alvinluo gesture finishWithResult");
        Intent intent = new Intent();
        intent.putExtra("key_err_code", i2);
        intent.putExtra("key_err_msg", str);
        setResult(i, intent);
        finish();
        if (i2 == 4 || i2 == 0) {
            WalletLockProtectEvent walletLockProtectEvent = new WalletLockProtectEvent();
            WalletLockProtectEvent.C104598a aVar = walletLockProtectEvent.f310017d;
            aVar.f310019a = i2 == 4 ? 5 : 6;
            aVar.f310020b = this;
            walletLockProtectEvent.publish();
        }
    }

    /* renamed from: P7 */
    public final void mo153213P7(int i, boolean z) {
        int i2 = i - this.f318302g;
        if (i2 != 0) {
            this.f318302g = i;
            if (!z) {
                this.f318310r.setInAnimation((Animation) null);
                this.f318310r.setOutAnimation((Animation) null);
            } else if (i2 > 0) {
                this.f318310r.setInAnimation(this, C0966R.C0968anim.f2503er);
                this.f318310r.setOutAnimation(this, C0966R.C0968anim.f2498em);
            } else {
                this.f318310r.setInAnimation(this, C0966R.C0968anim.f2496ek);
                this.f318310r.setOutAnimation(this, C0966R.C0968anim.f2506eu);
            }
            if (i2 > 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    this.f318310r.showNext();
                }
                return;
            }
            while (i2 < 0) {
                this.f318310r.showPrevious();
                i2++;
            }
        }
    }

    /* renamed from: Q7 */
    public final void mo153214Q7(String str, C106549m mVar) {
        TextView textView = this.f318303h[this.f318302g].f323887b;
        textView.getText().toString();
        textView.setText(str);
        textView.setTextColor(this.f318300e);
        textView.startAnimation(this.f318304i);
        this.f318304i.setAnimationListener(new C106539d(mVar));
    }

    /* renamed from: R7 */
    public final void mo153215R7(DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialog = this.f318312t;
        if (dialog == null) {
            this.f318312t = C76879j.m92723Q(this, "", getString(C0966R.string.fe6), false, false, onCancelListener);
            return;
        }
        dialog.show();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1p;
    }

    public void initView() {
        hideVKB();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f318304i = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2486ea);
        this.f318299d = getResources().getColor(C0966R.color.a7f);
        this.f318300e = getResources().getColor(C0966R.color.a_3);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("action");
        intent.getStringExtra("next_action");
        if ("action.switch_on_pattern".equals(stringExtra)) {
            this.f318301f = 16;
            mo153213P7(1, false);
        } else if ("action.verify_pattern".equals(stringExtra)) {
            if (C107759d.m145972b()) {
                this.f318307o = true;
                this.f318301f = 20;
            } else {
                this.f318307o = false;
                this.f318301f = 0;
            }
            mo153213P7(0, false);
        }
        setBackBtn(new C106538c());
        Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", new Object[]{Integer.valueOf(this.f318301f)}));
        mo153210M7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (intent == null) {
            Log.m105920e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
            return;
        }
        int intExtra = intent.getIntExtra("key_err_code", 0);
        if (intExtra == 0) {
            this.f318309q = intent.getStringExtra("key_token");
            intent.getStringExtra("key_type");
            String stringExtra = getIntent().getStringExtra("next_action");
            if ("next_action.goto_protected_page".equals(stringExtra) || "next_action.modify_pattern".equals(stringExtra)) {
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    this.f318314v = true;
                }
                this.f318313u = false;
                setBackBtn((MenuItem.OnMenuItemClickListener) null);
                setBackBtnVisible(false);
                this.f318301f = 16;
                mo153213P7(1, false);
            } else if ("next_action.switch_off_pattern".equals(stringExtra)) {
                String str = this.f318309q;
                C106540e eVar = new C106540e();
                mo153215R7(new C108156h(this));
                if (str == null) {
                    mo153206I7();
                    eVar.mo1488a(3, -6, getString(C0966R.string.f360858fe3), (C47350c) null, (C117747y) null);
                } else {
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new C50166kq3();
                    bVar.f127067b = new C64533lq3();
                    bVar.f127069d = C90507c.CTRL_INDEX;
                    bVar.f127068c = "/cgi-bin/micromsg-bin/registernewpatternlock";
                    C47350c a = bVar.mo72403a();
                    C50166kq3 kq32 = (C50166kq3) a.f127055a.f127080a;
                    C51018qv3 qv32 = new C51018qv3();
                    qv32.mo73350k(str.getBytes());
                    kq32.f136989d = qv32;
                    kq32.f136991f = 3;
                    C89144l0.m111429e(a, new C108157i(this, eVar), false);
                }
            } else {
                this.f318301f = 1;
            }
            mo153210M7();
        } else if (intExtra == -1) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f360856fe1), 0).show();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.kwh) {
            Intent intent = new Intent();
            intent.putExtra("action", "action.verify_paypwd");
            intent.putExtra("key_wallet_lock_type", 1);
            C88144b.m109795m(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", intent, 1001);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/walletlock/gesture/ui/GestureGuardLogicUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
        Intent intent = getIntent();
        if (!MMApplicationContext.getPackageName().equals(intent.getPackage()) || Util.isNullOrNil(intent.getStringExtra("action")) || Util.isNullOrNil(intent.getStringExtra("next_action"))) {
            Log.m105928w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
            finish();
            return;
        }
        this.f318310r = new ViewFlipper(this);
        C108163o[] oVarArr = {new C108163o(this), new C108163o(this), new C108163o(this)};
        this.f318303h = oVarArr;
        for (int i = 0; i < 3; i++) {
            C108163o oVar = oVarArr[i];
            this.f318310r.addView(oVar.f323886a);
            oVar.f323888c.setOnPatternListener(this);
            oVar.f323889d.setOnClickListener(this);
        }
        setContentView((View) this.f318310r);
        this.f318309q = getIntent().getStringExtra(XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        getIntent().getStringExtra("type");
        this.f318315w = getIntent().getStringExtra("verify_title");
        this.f318316x = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action"))) {
            long currentTimeMillis = System.currentTimeMillis();
            C106560i.f318384a = currentTimeMillis;
            Log.m105925i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report create session: %d", Long.valueOf(currentTimeMillis));
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f318312t;
        if (dialog != null && dialog.isShowing()) {
            this.f318312t.dismiss();
        }
        ViewFlipper viewFlipper = this.f318310r;
        if (viewFlipper != null) {
            viewFlipper.removeAllViews();
            this.f318310r = null;
        }
        int i = 0;
        while (true) {
            C108163o[] oVarArr = this.f318303h;
            if (i < oVarArr.length) {
                C108163o oVar = oVarArr[i];
                oVar.f323888c.setOnClickListener((View.OnClickListener) null);
                oVar.f323889d.setOnClickListener((View.OnClickListener) null);
                oVar.f323886a = null;
                oVar.f323887b = null;
                oVar.f323888c = null;
                oVar.f323889d = null;
                this.f318303h[i] = null;
                i++;
            } else {
                this.f318303h = null;
                return;
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (mo153207J7()) {
            return false;
        }
        mo153212O7(0, 4, "user cancel when setting gesture");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r0 = r0.mo119684e(339972, (java.lang.Object) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            int r0 = r10.f318301f
            if (r0 != 0) goto L_0x0081
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 0
            if (r0 != 0) goto L_0x0018
            g73.i r0 = new g73.i
            r0.<init>()
            goto L_0x0036
        L_0x0018:
            r2 = 339971(0x53003, float:4.76401E-40)
            java.lang.Object r0 = r0.mo119684e(r2, r1)
            if (r0 != 0) goto L_0x0027
            g73.i r0 = new g73.i
            r0.<init>()
            goto L_0x0036
        L_0x0027:
            g73.i r2 = new g73.i
            r2.<init>()
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = g73.C107762g.m145998f(r0)
            r2.mo158190a(r0)
            r0 = r2
        L_0x0036:
            long r2 = r0.f322499a
            r4 = -1
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0058
            g73.C107762g.m145994b(r0)
            long r2 = r0.f322500b
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r2 / r4
            r7 = 600(0x258, double:2.964E-321)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0055
            long r4 = r0.f322499a
            g73.C107761f.m145991h(r4, r2)
            r0 = 1
            goto L_0x0059
        L_0x0055:
            g73.C107761f.m145988e()
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x007f
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = -1
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            r0 = -1
            goto L_0x0078
        L_0x0068:
            r3 = 339972(0x53004, float:4.76402E-40)
            java.lang.Object r0 = r0.mo119684e(r3, r1)
            if (r0 != 0) goto L_0x0072
            goto L_0x0066
        L_0x0072:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0078:
            r10.f318308p = r0
            if (r0 != r2) goto L_0x0081
            r10.f318308p = r6
            goto L_0x0081
        L_0x007f:
            r10.f318308p = r6
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI.onResume():void");
    }

    public void onWindowFocusChanged(boolean z) {
        PatternLockView patternLockView = this.f318303h[this.f318302g].f323888c;
        if (patternLockView != null) {
            patternLockView.setEnableInput(z && !this.f318307o);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C8245c.class);
    }
}
