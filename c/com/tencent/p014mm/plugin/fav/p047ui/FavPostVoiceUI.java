package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p375qh.C101196q;
import p492dn.C97498p;
import p492dn.C97500q;
import p910lj.C76701a;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI */
public class FavPostVoiceUI extends MMBaseActivity {

    /* renamed from: C */
    public static final int[] f269760C = {0, 15, 30, 45, 60, 75, 90, 100};

    /* renamed from: D */
    public static final int[] f269761D = {C0966R.C0969drawable.bdc, C0966R.C0969drawable.bdd, C0966R.C0969drawable.bde, C0966R.C0969drawable.bdf, C0966R.C0969drawable.bdg, C0966R.C0969drawable.bdh, C0966R.C0969drawable.bdi};

    /* renamed from: A */
    public final MTimerHandler f269762A = new MTimerHandler(new C93439c(), true);

    /* renamed from: B */
    public boolean f269763B = false;

    /* renamed from: e */
    public Button f269764e;

    /* renamed from: f */
    public boolean f269765f;

    /* renamed from: g */
    public long f269766g;

    /* renamed from: h */
    public long f269767h;

    /* renamed from: i */
    public boolean f269768i;

    /* renamed from: j */
    public long f269769j = -1;

    /* renamed from: n */
    public Toast f269770n;

    /* renamed from: o */
    public View f269771o;

    /* renamed from: p */
    public View f269772p;

    /* renamed from: q */
    public ImageView f269773q;

    /* renamed from: r */
    public View f269774r;

    /* renamed from: s */
    public View f269775s;

    /* renamed from: t */
    public int f269776t;

    /* renamed from: u */
    public TextView f269777u;

    /* renamed from: v */
    public View f269778v;

    /* renamed from: w */
    public C97498p f269779w;

    /* renamed from: x */
    public String f269780x;

    /* renamed from: y */
    public final MTimerHandler f269781y = new MTimerHandler(new C93437a(), true);

    /* renamed from: z */
    public final MMHandler f269782z = new C93438b();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI$a */
    public class C93437a implements MTimerHandler.CallBack {
        public C93437a() {
        }

        public boolean onTimerExpired() {
            int i;
            C101196q qVar = (C101196q) FavPostVoiceUI.this.f269779w;
            int i2 = 0;
            if (qVar.f296209e == 1) {
                int a = qVar.f296206b.mo140626a();
                if (a > C101196q.f296204f) {
                    C101196q.f296204f = a;
                }
                i = (a * 100) / C101196q.f296204f;
            } else {
                i = 0;
            }
            while (true) {
                int[] iArr = FavPostVoiceUI.f269761D;
                if (i2 >= 7) {
                    break;
                }
                int[] iArr2 = FavPostVoiceUI.f269760C;
                if (i >= iArr2[i2] && i < iArr2[i2 + 1]) {
                    FavPostVoiceUI.this.f269773q.setBackgroundResource(iArr[i2]);
                    break;
                }
                i2++;
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI$b */
    public class C93438b extends MMHandler {
        public C93438b() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            FavPostVoiceUI.this.mo128291H7();
            FavPostVoiceUI.this.f269764e.setBackgroundResource(C0966R.C0969drawable.aob);
            FavPostVoiceUI.this.f269764e.setEnabled(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI$c */
    public class C93439c implements MTimerHandler.CallBack {
        public C93439c() {
        }

        public boolean onTimerExpired() {
            FavPostVoiceUI favPostVoiceUI = FavPostVoiceUI.this;
            if (favPostVoiceUI.f269769j == -1) {
                favPostVoiceUI.f269769j = Util.currentTicks();
            }
            long ticksToNow = Util.ticksToNow(FavPostVoiceUI.this.f269769j);
            if (ticksToNow >= 3590000 && ticksToNow <= 3600000) {
                FavPostVoiceUI favPostVoiceUI2 = FavPostVoiceUI.this;
                Toast toast = favPostVoiceUI2.f269770n;
                if (toast == null) {
                    favPostVoiceUI2.f269770n = C76701a.makeText((Context) favPostVoiceUI2, (CharSequence) favPostVoiceUI2.getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}), 0);
                } else {
                    toast.setText(favPostVoiceUI2.getString(C0966R.string.cmu, new Object[]{Integer.valueOf((int) ((3600000 - ticksToNow) / 1000))}));
                }
                FavPostVoiceUI.this.f269770n.show();
            }
            if (ticksToNow < 3600000) {
                return true;
            }
            Log.m105926v("MicroMsg.FavPostVoiceUI", "record stop on countdown");
            FavPostVoiceUI favPostVoiceUI3 = FavPostVoiceUI.this;
            favPostVoiceUI3.f269768i = true;
            favPostVoiceUI3.mo128289F7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI$d */
    public class C93440d implements Animation.AnimationListener {

        /* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI$d$a */
        public class C93441a implements Runnable {
            public C93441a() {
            }

            public void run() {
                FavPostVoiceUI.this.setResult(0);
                FavPostVoiceUI.this.finish();
                BackwardSupportUtil.AnimationHelper.overridePendingTransition(FavPostVoiceUI.this, 0, 0);
            }
        }

        public C93440d() {
        }

        public void onAnimationEnd(Animation animation) {
            FavPostVoiceUI.this.f269774r.post(new C93441a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: E7 */
    public static void m118036E7(FavPostVoiceUI favPostVoiceUI) {
        favPostVoiceUI.f269764e.setKeepScreenOn(false);
        ((C101196q) favPostVoiceUI.f269779w).mo140642b();
        favPostVoiceUI.f269781y.stopTimer();
        favPostVoiceUI.f269762A.stopTimer();
        C86009m1 m1Var = new C86009m1(favPostVoiceUI.f269780x);
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        favPostVoiceUI.mo128291H7();
    }

    /* renamed from: F7 */
    public final void mo128289F7() {
        if (this.f269765f) {
            this.f269764e.setKeepScreenOn(true);
            this.f269764e.setBackgroundResource(C0966R.C0969drawable.aoa);
            this.f269764e.setText(C0966R.string.cpy);
            ((C101196q) this.f269779w).mo140642b();
            long j = this.f269766g;
            long j2 = 0;
            if (j != 0) {
                j2 = Util.ticksToNow(j);
            }
            this.f269767h = j2;
            boolean z = j2 < 800;
            this.f269781y.stopTimer();
            this.f269762A.stopTimer();
            if (!z) {
                long j3 = this.f269767h;
                long j4 = j3 / 1000;
                String str = this.f269780x;
                int i = (int) j3;
                if (Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.FavPostLogic", "postVoice path null");
                } else {
                    C100755z zVar = new C100755z();
                    zVar.field_type = 3;
                    zVar.field_sourceType = 6;
                    C93689q0.m118393e(zVar);
                    C101834rc0 rc02 = new C101834rc0();
                    rc02.f299284V = str;
                    rc02.mo141266v(i);
                    rc02.mo141232F(true);
                    rc02.mo141260p(zVar.field_type);
                    rc02.mo141261q("amr");
                    zVar.field_favProto.f298618f.add(rc02);
                    C93658i.m118346a(zVar);
                    C115669n.INSTANCE.mo160131h(10648, 1, 0);
                }
                setResult(-1);
                finish();
                BackwardSupportUtil.AnimationHelper.overridePendingTransition(this, 0, 0);
            } else {
                C86009m1 m1Var = new C86009m1(this.f269780x);
                if (m1Var.mo119967g()) {
                    m1Var.mo119966f();
                }
                this.f269764e.setEnabled(false);
                this.f269764e.setBackgroundResource(C0966R.C0969drawable.ao_);
                View view = this.f269772p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f269771o;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f269782z.sendEmptyMessageDelayed(0, 500);
            }
            this.f269765f = false;
        }
    }

    /* renamed from: G7 */
    public final void mo128290G7() {
        if (!this.f269763B) {
            this.f269763B = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(300);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            translateAnimation.setAnimationListener(new C93440d());
            View findViewById = findViewById(C0966R.C0970id.lb6);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.cvz);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view = this.f269778v;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f269778v.startAnimation(alphaAnimation);
            findViewById(C0966R.C0970id.lb6).startAnimation(alphaAnimation);
            findViewById(C0966R.C0970id.cvz).startAnimation(translateAnimation);
        }
    }

    /* renamed from: H7 */
    public void mo128291H7() {
        View view = this.f269771o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f269772p;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f269775s;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view5 = this.f269774r;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f269777u.setText(C0966R.string.cmt);
        this.f269764e.setBackgroundResource(C0966R.C0969drawable.aob);
        this.f269764e.setText(C0966R.string.cpy);
        this.f269773q.setVisibility(4);
        this.f269765f = false;
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        super.onCreate(bundle);
        setContentView(C85868k2.m106137b(this).inflate(C0966R.C0971layout.a77, (ViewGroup) null));
        this.f269773q = (ImageView) findViewById(C0966R.C0970id.lb7);
        this.f269774r = findViewById(C0966R.C0970id.lb8);
        this.f269775s = findViewById(C0966R.C0970id.lb_);
        this.f269771o = findViewById(C0966R.C0970id.lbd);
        this.f269772p = findViewById(C0966R.C0970id.lbe);
        this.f269777u = (TextView) findViewById(C0966R.C0970id.lbf);
        this.f269778v = findViewById(C0966R.C0970id.lb9);
        View findViewById = findViewById(C0966R.C0970id.lb6);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view = this.f269778v;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(C0966R.C0970id.lb6).setOnTouchListener(new C93696r0(this));
        View findViewById2 = findViewById(C0966R.C0970id.cvz);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar3.mo10232b(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C97498p Aq = ((C97500q) C86312j.m106911c(C97500q.class)).mo126428Aq();
        ((C101196q) Aq).f296208d = new C93699t0(this);
        this.f269779w = Aq;
        Button button = (Button) findViewById(C0966R.C0970id.cvy);
        this.f269764e = button;
        button.setOnTouchListener(new C93701u0(this));
        mo128291H7();
        String B = C100734q.m131811B();
        Uri n = C116299g2.m163858n(B);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0 f0Var = C116281f0.C116289i.f348994a;
        C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        do {
            str = B + "/" + System.currentTimeMillis();
            Uri n2 = C116299g2.m163858n(str);
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l3 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
            if (!l3.mo177810a()) {
                z = false;
                continue;
            } else {
                z = l3.f348991a.mo119948x(l3.f348992b);
                continue;
            }
        } while (z);
        this.f269780x = str;
        this.f269777u.post(new C41402s0(this));
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return super.onKeyDown(i, keyEvent);
        }
        mo128290G7();
        return true;
    }

    public void onPause() {
        super.onPause();
        mo128289F7();
    }

    public void onResume() {
        super.onResume();
    }
}
