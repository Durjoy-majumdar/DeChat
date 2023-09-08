package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c42.C67339b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HKCashierJSApiPayResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.HbSessionReportStruct;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.luckymoney.model.C42514c2;
import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import com.tencent.p014mm.plugin.luckymoney.model.C69228h1;
import com.tencent.p014mm.plugin.luckymoney.model.C69233i2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69275y1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69554a;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyAutoScrollView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75122k;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p008bq.C67303a1;
import p008bq.C67304c1;
import p008bq.C67305d1;
import p248ug.C78158s0;
import p286zl.C16292g;
import p911ml.C76777a;
import p911ml.C76778b;
import qo3.C77407n;
import w32.C78512f;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI */
public class LuckyMoneyNewYearSendUI extends LuckyMoneyBaseUI {

    /* renamed from: a1 */
    public static final /* synthetic */ int f200198a1 = 0;

    /* renamed from: A */
    public TextView f200199A;

    /* renamed from: B */
    public Button f200200B;

    /* renamed from: C */
    public String f200201C;

    /* renamed from: D */
    public int f200202D;

    /* renamed from: E */
    public String f200203E;

    /* renamed from: F */
    public Dialog f200204F = null;

    /* renamed from: G */
    public int f200205G;

    /* renamed from: H */
    public String f200206H;

    /* renamed from: I */
    public int f200207I;

    /* renamed from: J */
    public boolean f200208J = true;

    /* renamed from: K */
    public int f200209K = 0;

    /* renamed from: L */
    public int f200210L = 0;

    /* renamed from: M */
    public LinkedList<C69228h1> f200211M;

    /* renamed from: N */
    public int f200212N = 0;

    /* renamed from: P */
    public ChatFooterPanel f200213P;

    /* renamed from: Q */
    public C69554a f200214Q;

    /* renamed from: Q0 */
    public int f200215Q0;

    /* renamed from: R */
    public ViewGroup f200216R;

    /* renamed from: R0 */
    public long f200217R0;

    /* renamed from: S */
    public View f200218S;

    /* renamed from: S0 */
    public boolean f200219S0;

    /* renamed from: T */
    public IEmojiInfo f200220T;

    /* renamed from: T0 */
    public String f200221T0;

    /* renamed from: U */
    public IEmojiInfo f200222U;

    /* renamed from: U0 */
    public String f200223U0;

    /* renamed from: V */
    public HBReportNewStruct f200224V;

    /* renamed from: V0 */
    public final IListener f200225V0;

    /* renamed from: W */
    public HbSessionReportStruct f200226W;

    /* renamed from: W0 */
    public View.OnClickListener f200227W0;

    /* renamed from: X */
    public int f200228X;

    /* renamed from: X0 */
    public int f200229X0;

    /* renamed from: Y */
    public int f200230Y;

    /* renamed from: Y0 */
    public C76777a f200231Y0;

    /* renamed from: Z */
    public int f200232Z;

    /* renamed from: Z0 */
    public int f200233Z0;

    /* renamed from: g */
    public View f200234g;

    /* renamed from: h */
    public ImageView f200235h;

    /* renamed from: i */
    public View f200236i;

    /* renamed from: j */
    public TextView f200237j;

    /* renamed from: n */
    public View f200238n;

    /* renamed from: o */
    public BaseEmojiView f200239o;

    /* renamed from: p */
    public ImageView f200240p;

    /* renamed from: p0 */
    public int f200241p0;

    /* renamed from: q */
    public ImageView f200242q;

    /* renamed from: r */
    public TextView f200243r;

    /* renamed from: s */
    public LinearLayout f200244s;

    /* renamed from: t */
    public MMAnimateView f200245t;

    /* renamed from: u */
    public TextView f200246u;

    /* renamed from: v */
    public LinearLayout f200247v;

    /* renamed from: w */
    public LinearLayout f200248w;

    /* renamed from: x */
    public TextView f200249x;

    /* renamed from: x0 */
    public int f200250x0;

    /* renamed from: y */
    public TextView f200251y;

    /* renamed from: y0 */
    public int f200252y0;

    /* renamed from: z */
    public LuckyMoneyAutoScrollView f200253z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$a */
    public class C69438a implements C75122k {
        public C69438a() {
        }

        /* renamed from: a */
        public void mo95653a(int i, String str) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onNext()");
            if (Util.isEqual(i, 2) && Util.isEqual(str, "requestwxhb")) {
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
                int i2 = LuckyMoneyNewYearSendUI.f200198a1;
                luckyMoneyNewYearSendUI.mo95645K7(1);
            } else if (Util.isEqual(i, 1)) {
                ((C16292g) C86312j.m106911c(C16292g.class)).nr0(LuckyMoneyNewYearSendUI.this, str, 0, true);
            }
        }

        public void onCancel() {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onCancel()");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$b */
    public class C69439b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f200255d;

        public C69439b(C117747y yVar) {
            this.f200255d = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (C69224g2.m81567m1(this.f200255d)) {
                LuckyMoneyNewYearSendUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$c */
    public class C69440c implements DialogInterface.OnClickListener {
        public C69440c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LuckyMoneyNewYearSendUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$d */
    public class C69441d implements C76777a {
        public C69441d() {
        }

        /* renamed from: a */
        public void mo95657a(long j, boolean z, String str) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", Long.valueOf(LuckyMoneyNewYearSendUI.this.f200217R0), Long.valueOf(j), Boolean.valueOf(z), str);
            if (Util.isEqual(LuckyMoneyNewYearSendUI.this.f200217R0, j)) {
                if (z) {
                    LuckyMoneyNewYearSendUI.this.mo95649O7(str);
                } else if (!Util.isEqual(LuckyMoneyNewYearSendUI.this.f200229X0, 0) || !((C67305d1) C86312j.m106911c(C67305d1.class)).f10(LuckyMoneyNewYearSendUI.this.f200217R0)) {
                    LuckyMoneyNewYearSendUI.this.mo95647M7(5);
                } else {
                    LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
                    luckyMoneyNewYearSendUI.f200229X0++;
                    luckyMoneyNewYearSendUI.mo95647M7(3);
                    return;
                }
                LuckyMoneyNewYearSendUI.this.mo95651Q7(true);
                C76778b bVar = C76778b.f224582a;
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI2 = LuckyMoneyNewYearSendUI.this;
                bVar.mo107031b(luckyMoneyNewYearSendUI2.f200217R0, luckyMoneyNewYearSendUI2.f200231Y0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$e */
    public class C69442e implements View.OnClickListener {
        public C69442e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
            C67339b.m79676a(luckyMoneyNewYearSendUI, luckyMoneyNewYearSendUI.f200213P);
            luckyMoneyNewYearSendUI.f200214Q.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$f */
    public class C69443f implements C69554a.C69555a {
        public C69443f() {
        }

        /* renamed from: a */
        public void mo95566a() {
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
            C67339b.m79676a(luckyMoneyNewYearSendUI, luckyMoneyNewYearSendUI.f200213P);
            luckyMoneyNewYearSendUI.f200214Q.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$g */
    public class C69444g implements View.OnClickListener {
        public C69444g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.f358686gh0) {
                C115669n.INSTANCE.mo160131h(13079, 5, 1);
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "mSendBtn click!");
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
                int i = LuckyMoneyNewYearSendUI.f200198a1;
                luckyMoneyNewYearSendUI.mo95645K7(0);
            } else if (view.getId() == C0966R.C0970id.f358688gh2) {
                LuckyMoneyNewYearSendUI.this.finish();
                C115669n.INSTANCE.mo160131h(13079, 6, 1);
                LuckyMoneyNewYearSendUI.this.f200224V = new HBReportNewStruct();
                HBReportNewStruct hBReportNewStruct = LuckyMoneyNewYearSendUI.this.f200224V;
                hBReportNewStruct.f194229d = 11;
                hBReportNewStruct.mo86054n();
                LuckyMoneyNewYearSendUI.this.mo95648N7(2);
            } else if (view.getId() == C0966R.C0970id.ggo || view.getId() == C0966R.C0970id.ggt) {
                LuckyMoneyNewYearSendUI.this.f200224V = new HBReportNewStruct();
                HBReportNewStruct hBReportNewStruct2 = LuckyMoneyNewYearSendUI.this.f200224V;
                hBReportNewStruct2.f194229d = 3;
                hBReportNewStruct2.mo86054n();
                LuckyMoneyNewYearSendUI.m81829J7(LuckyMoneyNewYearSendUI.this);
            } else if (view.getId() == C0966R.C0970id.ggq) {
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI2 = LuckyMoneyNewYearSendUI.this;
                luckyMoneyNewYearSendUI2.f200220T = null;
                luckyMoneyNewYearSendUI2.f200222U = null;
                luckyMoneyNewYearSendUI2.mo95647M7(0);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, "");
                C115669n.INSTANCE.mo160131h(13079, 3, 1);
                LuckyMoneyNewYearSendUI.this.f200224V = new HBReportNewStruct();
                HBReportNewStruct hBReportNewStruct3 = LuckyMoneyNewYearSendUI.this.f200224V;
                hBReportNewStruct3.f194229d = 5;
                hBReportNewStruct3.mo86054n();
            } else if (view.getId() == C0966R.C0970id.ggx) {
                LuckyMoneyNewYearSendUI.this.f200253z.mo95513b();
                LuckyMoneyNewYearSendUI.this.mo95646L7();
                C115669n.INSTANCE.mo160131h(13079, 4, 1);
                LuckyMoneyNewYearSendUI.this.f200224V = new HBReportNewStruct();
                HBReportNewStruct hBReportNewStruct4 = LuckyMoneyNewYearSendUI.this.f200224V;
                hBReportNewStruct4.f194229d = 2;
                hBReportNewStruct4.mo86054n();
            } else if (view.getId() == C0966R.C0970id.ggy) {
                ((C67304c1) C86312j.m106911c(C67304c1.class)).mo55780KT(LuckyMoneyNewYearSendUI.this.f200217R0);
                LuckyMoneyNewYearSendUI.this.mo95651Q7(false);
                LuckyMoneyNewYearSendUI.this.mo95647M7(4);
            } else if (view.getId() == C0966R.C0970id.ggn) {
                LuckyMoneyNewYearSendUI.m81829J7(LuckyMoneyNewYearSendUI.this);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$h */
    public class C69445h implements C78158s0.C78159a {
        public C69445h() {
        }

        /* renamed from: a */
        public void mo68482a(IEmojiInfo iEmojiInfo) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
            int i = LuckyMoneyNewYearSendUI.f200198a1;
            if (iEmojiInfo == null) {
                luckyMoneyNewYearSendUI.mo95647M7(0);
            } else {
                luckyMoneyNewYearSendUI.getClass();
                luckyMoneyNewYearSendUI.mo95649O7(iEmojiInfo.getMd5());
            }
            onHide();
        }

        public void onHide() {
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
            C67339b.m79676a(luckyMoneyNewYearSendUI, luckyMoneyNewYearSendUI.f200213P);
            luckyMoneyNewYearSendUI.f200214Q.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$i */
    public class C69446i implements LuckyMoneyAutoScrollView.C69337a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$i$a */
        public class C69447a implements Animation.AnimationListener {
            public C69447a() {
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                LuckyMoneyNewYearSendUI.this.f200199A.setVisibility(0);
            }
        }

        public C69446i() {
        }

        /* renamed from: a */
        public void mo95516a() {
            LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = LuckyMoneyNewYearSendUI.this;
            if (luckyMoneyNewYearSendUI.f200208J) {
                luckyMoneyNewYearSendUI.f200199A.setVisibility(4);
                AppCompatActivity context = LuckyMoneyNewYearSendUI.this.getContext();
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI2 = LuckyMoneyNewYearSendUI.this;
                C69242l1.m81616v(context, luckyMoneyNewYearSendUI2.f200199A, luckyMoneyNewYearSendUI2.f200206H);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500);
                alphaAnimation.setAnimationListener(new C69447a());
                LuckyMoneyNewYearSendUI.this.f200199A.startAnimation(alphaAnimation);
                LuckyMoneyNewYearSendUI.this.f200208J = false;
            } else {
                AppCompatActivity context2 = luckyMoneyNewYearSendUI.getContext();
                LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI3 = LuckyMoneyNewYearSendUI.this;
                C69242l1.m81616v(context2, luckyMoneyNewYearSendUI3.f200199A, luckyMoneyNewYearSendUI3.f200206H);
                LuckyMoneyNewYearSendUI.this.f200199A.invalidate();
            }
            LuckyMoneyNewYearSendUI.this.mo95651Q7(true);
            LuckyMoneyNewYearSendUI.this.f200253z.setFocusable(true);
            LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = LuckyMoneyNewYearSendUI.this.f200253z;
            luckyMoneyAutoScrollView.setContentDescription("" + (((double) LuckyMoneyNewYearSendUI.this.f200207I) / 100.0d));
        }
    }

    public LuckyMoneyNewYearSendUI() {
        new MMHandler();
        this.f200228X = 1;
        this.f200230Y = 0;
        this.f200232Z = 0;
        this.f200241p0 = 0;
        this.f200250x0 = 0;
        this.f200252y0 = 0;
        this.f200215Q0 = 0;
        this.f200217R0 = 0;
        this.f200219S0 = false;
        this.f200221T0 = "";
        this.f200223U0 = "";
        this.f200225V0 = new IListener<HKCashierJSApiPayResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1594159370;
            }

            public boolean callback(IEvent iEvent) {
                HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent = (HKCashierJSApiPayResultEvent) iEvent;
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback");
                if (hKCashierJSApiPayResultEvent.f9311d.f9312a == 1) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "hkCashierPayResultIListener callback paysucc");
                    hKCashierJSApiPayResultEvent.f9311d.f9313b = 1;
                    C119179t tVar = C119157j.f356862d;
                    LuckyMoneyNewYearSendUI$1$$a luckyMoneyNewYearSendUI$1$$a = new LuckyMoneyNewYearSendUI$1$$a(this);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(luckyMoneyNewYearSendUI$1$$a, 200, false);
                }
                LuckyMoneyNewYearSendUI.this.f200225V0.dead();
                return true;
            }
        };
        this.f200227W0 = new C69444g();
        this.f200229X0 = 0;
        this.f200231Y0 = new C69441d();
        this.f200233Z0 = 0;
    }

    /* renamed from: J7 */
    public static void m81829J7(LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        if (!Util.isEqual(luckyMoneyNewYearSendUI.f200210L, 1)) {
            return;
        }
        if (!Util.isEqual(luckyMoneyNewYearSendUI.f200209K, 1)) {
            luckyMoneyNewYearSendUI.mo95650P7();
            return;
        }
        C77407n nVar = new C77407n((Context) luckyMoneyNewYearSendUI.getContext(), 1, false);
        nVar.f225771i = new C69576c2(luckyMoneyNewYearSendUI);
        nVar.f225782p = new C69581d2(luckyMoneyNewYearSendUI);
        nVar.mo107573q();
    }

    /* renamed from: K7 */
    public final void mo95645K7(int i) {
        int i2;
        String str;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend()");
        C115669n.INSTANCE.mo160131h(11701, 15, 3, 0, 1, 1);
        Dialog dialog = this.f200204F;
        if (dialog == null) {
            this.f200204F = C75197d0.m90164e(getContext(), true, new C69584e2(this));
        } else if (!dialog.isShowing()) {
            this.f200204F.show();
        }
        String s = C75592q0.m90789s();
        IEmojiInfo iEmojiInfo = this.f200220T;
        if (iEmojiInfo != null) {
            str = iEmojiInfo.getMd5();
            i2 = this.f200220T.getType();
        } else {
            str = "";
            i2 = 0;
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "doSend() mUniqueId:%s userConfirmJump:%s lastPayResult:%s mSendId:%s", this.f200223U0, Integer.valueOf(i), Integer.valueOf(this.f200233Z0), this.f200221T0);
        if (this.f200219S0) {
            int i3 = this.f200207I;
            long j = (long) i3;
            long j2 = (long) i3;
            String str2 = this.f200206H;
            doSceneProgress(new C69275y1(1, j, j2, 3, str2, this.f200201C, C69242l1.m81601g(), C75592q0.m90789s(), 2), false);
            return;
        }
        doSceneProgress(new C69233i2(this.f200207I, this.f200206H, C69242l1.m81599e(s), this.f200201C, s, C75592q0.m90783m(), this.f200202D, str, i2, this.f200223U0, i, this.f200233Z0, this.f200221T0, (C69233i2.C69234a) null), false);
    }

    /* renamed from: L7 */
    public final void mo95646L7() {
        int i;
        this.f200232Z++;
        LinkedList<C69228h1> linkedList = this.f200211M;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
            i = -1;
        } else {
            C86709a0.m107528h();
            int g = C86709a0.m107523b().mo121110g();
            int size = this.f200211M.size();
            i = (((int) (System.currentTimeMillis() % ((long) size))) + new Random((long) g).nextInt(size)) % size;
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:" + i);
        }
        this.f200212N = i;
        if (i >= 0 && i < this.f200211M.size()) {
            this.f200207I = this.f200211M.get(this.f200212N).f199192a;
            this.f200206H = this.f200211M.get(this.f200212N).f199193b;
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.f200212N + " randomAmount:" + this.f200207I + " randomWishing:" + this.f200206H);
        this.f200253z.setFinalText(C75228t.m90260n(((double) this.f200207I) / 100.0d));
        mo95651Q7(false);
        this.f200253z.setFocusable(false);
        this.f200253z.setContentDescription("");
        LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f200253z;
        luckyMoneyAutoScrollView.f199659y = new C69446i();
        MMHandlerThread.postToMainThread(new C69572c(luckyMoneyAutoScrollView));
    }

    /* renamed from: M7 */
    public final void mo95647M7(int i) {
        int i2 = i;
        Class cls = C67305d1.class;
        if (Util.isEqual(this.f200210L, 0)) {
            this.f200235h.setVisibility(0);
            View view = this.f200236i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f200238n;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f200235h.setVisibility(8);
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "exchangeExpressionState() state:%s", Integer.valueOf(i));
        if (i2 == 0) {
            View view5 = this.f200236i;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200237j.setText(C0966R.string.gem);
            View view7 = this.f200238n;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i2 == 1) {
            View view9 = this.f200236i;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = this.f200238n;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200240p.setVisibility(0);
            this.f200239o.setVisibility(8);
            this.f200242q.setVisibility(8);
            this.f200243r.setVisibility(8);
            this.f200244s.setVisibility(8);
        } else if (i2 == 2) {
            if (this.f200222U != null) {
                HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
                this.f200224V = hBReportNewStruct;
                hBReportNewStruct.f194229d = 4;
                hBReportNewStruct.mo86054n();
            }
            this.f200222U = this.f200220T;
            int i3 = this.f200230Y;
            if (i3 == 0) {
                if (((C67305d1) C86312j.m106911c(cls)).mo91430hJ(this.f200220T)) {
                    this.f200228X = 2;
                } else if (((C67305d1) C86312j.m106911c(cls)).mo91433yi(this.f200220T)) {
                    this.f200228X = 4;
                } else {
                    this.f200228X = 3;
                }
            } else if (i3 == 1) {
                this.f200228X = 2;
                this.f200241p0++;
            } else if (i3 == 2) {
                if (((C67305d1) C86312j.m106911c(cls)).mo91430hJ(this.f200220T)) {
                    this.f200228X = 2;
                    this.f200215Q0++;
                } else if (((C67305d1) C86312j.m106911c(cls)).mo91433yi(this.f200220T)) {
                    this.f200228X = 4;
                    this.f200252y0++;
                } else {
                    this.f200228X = 3;
                    this.f200250x0++;
                }
            }
            View view13 = this.f200236i;
            C9556a aVar7 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar7.mo10233c(8);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view15 = this.f200238n;
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(0);
            View view16 = view15;
            C117292a.m165358d(view16, aVar8.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view15.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200240p.setVisibility(8);
            this.f200239o.setVisibility(0);
            this.f200242q.setVisibility(0);
            this.f200243r.setVisibility(8);
            this.f200244s.setVisibility(8);
        } else if (i2 == 3) {
            View view17 = this.f200236i;
            C9556a aVar9 = new C9556a();
            ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
            aVar9.mo10233c(8);
            View view18 = view17;
            C117292a.m165358d(view18, aVar9.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view17.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
            C117292a.m165359e(view18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view19 = this.f200238n;
            C9556a aVar10 = new C9556a();
            aVar10.mo10233c(0);
            View view20 = view19;
            C117292a.m165358d(view20, aVar10.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view19.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
            C117292a.m165359e(view20, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200240p.setVisibility(8);
            this.f200239o.setVisibility(8);
            this.f200242q.setVisibility(8);
            this.f200243r.setVisibility(0);
            this.f200244s.setVisibility(8);
        } else if (i2 == 4) {
            View view21 = this.f200236i;
            C9556a aVar11 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar11.mo10233c(8);
            View view22 = view21;
            C117292a.m165358d(view22, aVar11.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view21.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
            C117292a.m165359e(view22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view23 = this.f200238n;
            C9556a aVar12 = new C9556a();
            aVar12.mo10233c(0);
            View view24 = view23;
            C117292a.m165358d(view24, aVar12.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view23.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
            C117292a.m165359e(view24, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200240p.setVisibility(8);
            this.f200239o.setVisibility(8);
            this.f200242q.setVisibility(8);
            this.f200243r.setVisibility(8);
            this.f200244s.setVisibility(0);
            this.f200245t.setImageResource(C0966R.raw.lucky_money_newyear_creat_loading);
        } else if (i2 == 5) {
            View view25 = this.f200236i;
            C9556a aVar13 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar13.mo10233c(0);
            View view26 = view25;
            C117292a.m165358d(view26, aVar13.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view25.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view26, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200237j.setText(C0966R.string.ghk);
            View view27 = this.f200238n;
            C9556a aVar14 = new C9556a();
            aVar14.mo10233c(8);
            View view28 = view27;
            C117292a.m165358d(view28, aVar14.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view27.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view28, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI", "exchangeExpressionState", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: N7 */
    public final void mo95648N7(int i) {
        HbSessionReportStruct hbSessionReportStruct = new HbSessionReportStruct();
        this.f200226W = hbSessionReportStruct;
        hbSessionReportStruct.f194230d = (long) i;
        hbSessionReportStruct.f194231e = (long) this.f200228X;
        hbSessionReportStruct.f194232f = (long) this.f200232Z;
        hbSessionReportStruct.f194233g = (long) this.f200241p0;
        hbSessionReportStruct.f194234h = (long) this.f200250x0;
        hbSessionReportStruct.f194237k = (long) this.f200252y0;
        hbSessionReportStruct.f194235i = (long) this.f200215Q0;
        IEmojiInfo iEmojiInfo = this.f200220T;
        hbSessionReportStruct.f194236j = hbSessionReportStruct.mo86045b("EmoticonMd5", iEmojiInfo == null ? "" : iEmojiInfo.getMd5(), true);
        this.f200226W.mo86054n();
    }

    /* renamed from: O7 */
    public final void mo95649O7(String str) {
        IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(str);
        this.f200220T = r2;
        this.f200239o.setEmojiInfo(r2);
        mo95647M7(2);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, str);
    }

    /* renamed from: P7 */
    public final void mo95650P7() {
        int i;
        HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
        this.f200224V = hBReportNewStruct;
        hBReportNewStruct.f194229d = 10;
        hBReportNewStruct.mo86054n();
        this.f200230Y = 2;
        this.f200214Q.show();
        if (Util.isEqual(this.f200209K, 1)) {
            int i2 = ChatFooterPanel.f211589f;
            i = 9;
        } else {
            int i3 = ChatFooterPanel.f211589f;
            i = 12;
        }
        C67339b.m79677b(this.f200216R, this.f200213P, i, new C69445h());
    }

    /* renamed from: Q7 */
    public final void mo95651Q7(boolean z) {
        this.f200200B.setClickable(z);
        if (z) {
            if (!(this.f200200B.getBackground() == null || this.f200200B.getBackground().mutate() == null)) {
                this.f200200B.getBackground().mutate().setAlpha(255);
            }
            this.f200200B.setTextColor(getResources().getColor(C0966R.color.a3d));
            return;
        }
        if (!(this.f200200B.getBackground() == null || this.f200200B.getBackground().mutate() == null)) {
            this.f200200B.getBackground().mutate().setAlpha(128);
        }
        this.f200200B.setTextColor(getResources().getColor(C0966R.color.a3e));
    }

    /* renamed from: R7 */
    public void mo95652R7() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
        LinkedList<C69228h1> linkedList = this.f200211M;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
            this.f200247v.setVisibility(8);
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
            this.f200247v.setVisibility(0);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200199A.getLayoutParams();
        this.f200199A.setTextSize(1, 21.0f);
        this.f200246u.setTextSize(1, 15.0f);
        this.f200253z.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357048af2), getResources().getDimensionPixelOffset(C0966R.dimen.aey));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f200253z.getLayoutParams();
        layoutParams2.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.ael);
        this.f200253z.setLayoutParams(layoutParams2);
        this.f200253z.invalidate();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f200247v.getLayoutParams();
        layoutParams3.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.aeo);
        this.f200247v.setLayoutParams(layoutParams3);
        this.f200247v.invalidate();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_3;
    }

    public void initView() {
        setActionbarColor(-839716110);
        setContentViewVisibility(8);
        this.f200234g = findViewById(C0966R.C0970id.ghf);
        this.f200246u = (TextView) findViewById(C0966R.C0970id.gbt);
        this.f200253z = (LuckyMoneyAutoScrollView) findViewById(C0966R.C0970id.ggl);
        this.f200199A = (TextView) findViewById(C0966R.C0970id.f358689gh3);
        Button button = (Button) findViewById(C0966R.C0970id.f358686gh0);
        this.f200200B = button;
        button.setOnClickListener(this.f200227W0);
        ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).setOnClickListener(this.f200227W0);
        this.f200235h = (ImageView) findViewById(C0966R.C0970id.ggu);
        this.f200236i = findViewById(C0966R.C0970id.ggs);
        this.f200237j = (TextView) findViewById(C0966R.C0970id.ggt);
        ((ImageView) findViewById(C0966R.C0970id.ggo)).setOnClickListener(this.f200227W0);
        ((TextView) findViewById(C0966R.C0970id.ggt)).setOnClickListener(this.f200227W0);
        this.f200238n = findViewById(C0966R.C0970id.ggr);
        BaseEmojiView baseEmojiView = (BaseEmojiView) findViewById(C0966R.C0970id.ggn);
        this.f200239o = baseEmojiView;
        baseEmojiView.setOnClickListener(this.f200227W0);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ggq);
        this.f200242q = imageView;
        imageView.setOnClickListener(this.f200227W0);
        this.f200240p = (ImageView) findViewById(C0966R.C0970id.ggp);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ggy);
        this.f200243r = textView;
        textView.setOnClickListener(this.f200227W0);
        this.f200244s = (LinearLayout) findViewById(C0966R.C0970id.ggm);
        this.f200245t = (MMAnimateView) findViewById(C0966R.C0970id.g3c);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ggx);
        this.f200247v = linearLayout;
        linearLayout.setOnClickListener(this.f200227W0);
        this.f200214Q = new C69554a(this);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.b9n, (ViewGroup) null);
        this.f200218S = inflate;
        this.f200214Q.setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f200218S.findViewById(C0966R.C0970id.ge_).setOnClickListener(new C69442e());
        this.f200214Q.f200845f = new C69443f();
        this.f200216R = (ViewGroup) this.f200218S.findViewById(C0966R.C0970id.geb);
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f200213P = si02;
        si02.setTalkerName(this.f200201C);
        this.f200213P.setShowSmiley(false);
        this.f200248w = (LinearLayout) findViewById(C0966R.C0970id.ggv);
        this.f200249x = (TextView) findViewById(C0966R.C0970id.gfe);
        this.f200251y = (TextView) findViewById(C0966R.C0970id.gfd);
        if (this.f200219S0) {
            this.f200248w.setVisibility(4);
            this.f200234g.setBackgroundResource(C0966R.C0969drawable.c78);
            this.f200249x.setVisibility(0);
            this.f200251y.setVisibility(4);
            this.f200246u.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        r0 = (com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) r3.getParcelableExtra("key_realname_guide_helper");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = -1
            r9 = 5
            r10 = 4
            r11 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.String r15 = "MicroMsg.LuckyMoneyNewYearSendUI"
            r7 = 1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
            if (r0 == r7) goto L_0x00c1
            if (r0 == r9) goto L_0x0070
            r5 = 1111(0x457, float:1.557E-42)
            if (r0 == r5) goto L_0x0031
            goto L_0x0242
        L_0x0031:
            if (r2 != r8) goto L_0x0069
            r5 = 0
            if (r3 == 0) goto L_0x003f
            java.lang.String r0 = "key_enter_time"
            long r2 = r3.getLongExtra(r0, r5)
            r1.f200217R0 = r2
        L_0x003f:
            long r2 = r1.f200217R0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((long) r2, (long) r5)
            if (r0 != 0) goto L_0x0062
            r1.mo95647M7(r10)
            r1.mo95651Q7(r4)
            ml.b r0 = p911ml.C76778b.f224582a
            long r2 = r1.f200217R0
            ml.a r0 = r1.f200231Y0
            java.lang.String r4 = "callback"
            gy3.C87412m.m108594g(r0, r4)
            ml.c r4 = new ml.c
            r4.<init>(r2, r0)
            o40.C61926c.m72668M(r4)
            goto L_0x0242
        L_0x0062:
            java.lang.String r0 = "mTimeEnter == 0L go emoji capture failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0242
        L_0x0069:
            java.lang.String r0 = "go emoji capture failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0242
        L_0x0070:
            if (r3 == 0) goto L_0x0242
            java.lang.String r0 = "result_data"
            boolean r2 = r3.hasExtra(r0)
            if (r2 == 0) goto L_0x0242
            android.os.Bundle r0 = r3.getBundleExtra(r0)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r2 = "payState"
            java.lang.String r3 = "2"
            java.lang.String r0 = r0.getString(r2, r3)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onActivityResult REQUEST_CODE_H5_PAY payState is "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            if (r0 != 0) goto L_0x0242
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r4] = r6
            r2[r7] = r14
            r2[r11] = r5
            r2[r13] = r17
            r2[r10] = r12
            r3 = 11701(0x2db5, float:1.6397E-41)
            r0.mo160131h(r3, r2)
            r22.finish()
            goto L_0x0242
        L_0x00ba:
            java.lang.String r0 = "onActivityResult REQUEST_CODE_H5_PAY bundle is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x0242
        L_0x00c1:
            if (r2 != r8) goto L_0x01d5
            java.lang.String r0 = "do pay success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r4] = r6
            r9[r7] = r14
            r9[r11] = r5
            r9[r13] = r17
            r9[r10] = r12
            r5 = 11701(0x2db5, float:1.6397E-41)
            r0.mo160131h(r5, r9)
            r5 = 0
            if (r3 == 0) goto L_0x00fa
            java.lang.String r0 = "key_realname_guide_helper"
            boolean r6 = r3.hasExtra(r0)
            if (r6 == 0) goto L_0x00fa
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper r0 = (com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) r0
            if (r0 == 0) goto L_0x00fa
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$c r6 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI$c
            r6.<init>()
            boolean r0 = r0.mo99370a(r1, r5, r6, r5)
            r0 = r0 ^ r7
            r6 = r0
            goto L_0x00fb
        L_0x00fa:
            r6 = 0
        L_0x00fb:
            com.tencent.mm.api.IEmojiInfo r0 = r1.f200220T
            if (r0 != 0) goto L_0x0105
            java.lang.String r0 = "dealXmlAddEmojiInfo() mEmojiInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            goto L_0x0164
        L_0x0105:
            java.lang.String r0 = r1.f200203E     // Catch:{ Exception -> 0x0156 }
            java.lang.String r9 = "<wcpayinfo>"
            int r0 = r0.indexOf(r9)     // Catch:{ Exception -> 0x0156 }
            if (r0 <= 0) goto L_0x0150
            java.lang.String r9 = r1.f200203E     // Catch:{ Exception -> 0x0156 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0156 }
            if (r0 >= r9) goto L_0x0150
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0156 }
            r9.<init>()     // Catch:{ Exception -> 0x0156 }
            com.tencent.mm.api.IEmojiInfo r12 = r1.f200220T     // Catch:{ Exception -> 0x0156 }
            if (r12 != 0) goto L_0x012c
            java.lang.Class<bq.p0> r12 = p008bq.C0363p0.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x0156 }
            bq.p0 r12 = (p008bq.C0363p0) r12     // Catch:{ Exception -> 0x0156 }
            com.tencent.mm.api.IEmojiInfo r12 = r12.mo404zE()     // Catch:{ Exception -> 0x0156 }
        L_0x012c:
            f32.C45746f.m51029a(r9, r12, r4)     // Catch:{ Exception -> 0x0156 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0156 }
            java.lang.String r14 = r1.f200203E     // Catch:{ Exception -> 0x0156 }
            java.lang.String r14 = r14.substring(r4, r0)     // Catch:{ Exception -> 0x0156 }
            r12.<init>(r14)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r14 = r1.f200203E     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r14.substring(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0156 }
            r12.append(r9)     // Catch:{ Exception -> 0x0156 }
            r12.append(r0)     // Catch:{ Exception -> 0x0156 }
            java.lang.String r0 = r12.toString()     // Catch:{ Exception -> 0x0156 }
            r1.f200203E = r0     // Catch:{ Exception -> 0x0156 }
        L_0x0150:
            java.lang.String r0 = "dealXmlAddEmojiInfo() success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)     // Catch:{ Exception -> 0x0156 }
            goto L_0x0164
        L_0x0156:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r9[r4] = r0
            java.lang.String r0 = "dealXmlAddEmojiInfo() Exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r0, r9)
        L_0x0164:
            java.lang.String r0 = r1.f200203E
            java.lang.String r9 = "msg"
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r9, r5)
            if (r0 != 0) goto L_0x0177
            java.lang.String r0 = "luckymoneyNewYearSendUI onActivityResult values is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            r22.finish()
            return
        L_0x0177:
            java.lang.String r5 = ".msg.appmsg.wcpayinfo.paymsgid"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
            g32.b r5 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.a1 r5 = r5.Bx0()
            boolean r0 = r5.mo57182a(r0)
            if (r0 == 0) goto L_0x01a0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r5 = r1.f200203E
            r0[r4] = r5
            java.lang.String r5 = "sendLocalMsg() for hb! mMsgXml:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r5, r0)
            java.lang.String r0 = r1.f200203E
            java.lang.String r5 = r1.f200201C
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81614t(r0, r5, r13)
            goto L_0x01a5
        L_0x01a0:
            java.lang.String r0 = "it is a duplicate msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x01a5:
            if (r6 != 0) goto L_0x01aa
            r22.finish()
        L_0x01aa:
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct
            r0.<init>()
            r1.f200224V = r0
            int r5 = r1.f200228X
            if (r5 != r7) goto L_0x01ba
            r5 = 8
            r0.f194229d = r5
            goto L_0x01ce
        L_0x01ba:
            if (r5 != r11) goto L_0x01c1
            r5 = 6
            r0.f194229d = r5
            goto L_0x01ce
        L_0x01c1:
            if (r5 != r13) goto L_0x01c8
            r5 = 7
            r0.f194229d = r5
            goto L_0x01ce
        L_0x01c8:
            if (r5 != r10) goto L_0x01ce
            r5 = 14
            r0.f194229d = r5
        L_0x01ce:
            r0.mo86054n()
            r1.mo95648N7(r7)
            goto L_0x01da
        L_0x01d5:
            java.lang.String r0 = "do pay cancel or failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
        L_0x01da:
            java.lang.String r20 = eb0.C75592q0.m90789s()
            if (r2 != r8) goto L_0x01ff
            java.lang.String r0 = "onActivityResult() resultCode == RESULT_OK"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            r1.f200233Z0 = r7
            com.tencent.mm.plugin.luckymoney.model.c2 r0 = new com.tencent.mm.plugin.luckymoney.model.c2
            java.lang.String r2 = r1.f200221T0
            java.lang.String r3 = r1.f200223U0
            r19 = 1
            java.lang.String r4 = r1.f200201C
            java.lang.String r21 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r16 = r0
            r17 = r2
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0239
        L_0x01ff:
            if (r3 == 0) goto L_0x020a
            java.lang.String r0 = "key_pay_reslut_type"
            int r0 = r3.getIntExtra(r0, r13)
            r1.f200233Z0 = r0
            goto L_0x0211
        L_0x020a:
            java.lang.String r0 = "doNetSceneLuckyMoneyReport() data == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            r1.f200233Z0 = r13
        L_0x0211:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r2 = r1.f200233Z0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r4] = r2
            java.lang.String r2 = "onActivityResult() resultCode != RESULT_OK  payType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r0)
            com.tencent.mm.plugin.luckymoney.model.c2 r0 = new com.tencent.mm.plugin.luckymoney.model.c2
            java.lang.String r2 = r1.f200221T0
            java.lang.String r3 = r1.f200223U0
            int r4 = r1.f200233Z0
            java.lang.String r5 = r1.f200201C
            java.lang.String r21 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r16 = r0
            r17 = r2
            r18 = r3
            r19 = r4
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0239:
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            r2.mo123460f(r0)
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearSendUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        mo95648N7(2);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
        this.f200201C = getIntent().getStringExtra("key_username");
        this.f200202D = getIntent().getIntExtra("key_way", 0);
        this.f200205G = getIntent().getIntExtra("pay_channel", -1);
        if (Util.isNullOrNil(this.f200201C)) {
            Log.m105928w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
            finish();
        }
        this.f200219S0 = C69242l1.m81607m();
        initView();
        if (this.f200219S0) {
            doSceneProgress(new C78512f());
            this.f200225V0.alive();
        } else {
            doSceneProgress(new C69271w1(8, "v1.0", ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue()));
            this.f200225V0.dead();
        }
        C115669n.INSTANCE.mo160131h(13079, 1, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f200204F;
        if (dialog != null && dialog.isShowing()) {
            this.f200204F.dismiss();
        }
        if (this.f200213P != null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "commentfooter release");
            this.f200213P.mo100196h();
            this.f200213P.mo100200l();
            this.f200213P.mo100189b();
        }
        C76778b.f224582a.mo107031b(this.f200217R0, this.f200231Y0);
        this.f200225V0.dead();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        boolean z = false;
        if (yVar instanceof C69271w1) {
            if (i == 0 && i2 == 0) {
                C69271w1 w1Var = (C69271w1) yVar;
                this.f200207I = w1Var.f199356j;
                this.f200206H = w1Var.f199354h;
                int i3 = w1Var.f199369z;
                this.f200209K = i3;
                this.f200210L = w1Var.f199346A;
                this.f200223U0 = w1Var.f199362s;
                this.f200211M = w1Var.f199349D;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUI", "enableSelfIe is %s", Integer.valueOf(i3));
                mo95646L7();
                mo95652R7();
                String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_STRING, "");
                if (Util.isNullOrNil(str2)) {
                    mo95647M7(0);
                } else {
                    mo95649O7(str2);
                }
                setContentViewVisibility(0);
                C69242l1.m81613s(this.f200234g, (Animation.AnimationListener) null);
                return true;
            }
            finish();
        } else if (yVar instanceof C78512f) {
            if (i == 0 && i2 == 0) {
                C78512f fVar = (C78512f) yVar;
                int i4 = fVar.f229965p;
                if (i4 == 1) {
                    this.f200207I = fVar.f229962j;
                    this.f200206H = fVar.f229963n;
                    this.f200211M = fVar.f229966q;
                    mo95646L7();
                    mo95652R7();
                    setContentViewVisibility(0);
                    C69242l1.m81613s(this.f200234g, (Animation.AnimationListener) null);
                    return true;
                }
                Log.m105921e("MicroMsg.LuckyMoneyNewYearSendUI", "hk sceneSwitch is %d", Integer.valueOf(i4));
                finish();
            } else {
                finish();
            }
        } else if (yVar instanceof C69275y1) {
            Dialog dialog = this.f200204F;
            if (dialog != null && dialog.isShowing()) {
                this.f200204F.dismiss();
            }
            if (i == 0 && i2 == 0) {
                String str3 = ((C69275y1) yVar).f199392h;
                if (!Util.isNullOrNil(str3)) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is not null");
                    C75228t.m90220M(getContext(), str3, false, 5);
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUI", "payUrl is null");
                }
            }
        } else if (yVar instanceof C69224g2) {
            Dialog dialog2 = this.f200204F;
            if (dialog2 != null && dialog2.isShowing()) {
                this.f200204F.dismiss();
            }
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                C69224g2 g2Var = (C69224g2) yVar;
                this.f200203E = g2Var.f199184j;
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = g2Var.f199183i;
                payInfo.f212587e = 37;
                payInfo.f212589g = this.f200205G;
                C76331i.m91761e(this, payInfo, 1);
                return true;
            }
            Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
        } else if (yVar instanceof C69233i2) {
            Dialog dialog3 = this.f200204F;
            if (dialog3 != null && dialog3.isShowing()) {
                this.f200204F.dismiss();
            }
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
                C69233i2 i2Var = (C69233i2) yVar;
                this.f200203E = i2Var.f199206j;
                this.f200221T0 = i2Var.f199204h;
                if (i2Var.f199284f != null) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() NetScenePrepareNewYearLuckyMoney show JumpRemind Alert");
                    i2Var.f199284f.mo104783g(this, new C69438a());
                    return true;
                }
                PayInfo payInfo2 = new PayInfo();
                payInfo2.f212592j = i2Var.f199205i;
                payInfo2.f212587e = 37;
                payInfo2.f212589g = this.f200205G;
                C76331i.m91761e(this, payInfo2, 1);
                return true;
            } else if (i2 == 268502454) {
                C76879j.m92749t(this, str, "", new C69439b(yVar));
                return true;
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
                this.f200233Z0 = 2;
                if (TextUtils.isEmpty(str)) {
                    str = getString(C0966R.string.l_3);
                }
                setContentViewVisibility(4);
                C76879j.m92713G(this, str, (String) null, false, new C69567b2(this, this));
                return true;
            }
        } else if (yVar instanceof C42514c2) {
            return true;
        }
        return false;
    }
}
