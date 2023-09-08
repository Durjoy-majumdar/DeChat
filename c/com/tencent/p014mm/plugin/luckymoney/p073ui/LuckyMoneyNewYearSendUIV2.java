package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c42.C67339b;
import com.huawei.easygo.sdk.constant.EasyGoCode;
import com.tencent.mapsdk.internal.C0947jz;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.HBReportNewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.HbSessionReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LuckyMoneyNewYearReportStruct;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.luckymoney.model.C42514c2;
import com.tencent.p014mm.plugin.luckymoney.model.C69218g1;
import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import com.tencent.p014mm.plugin.luckymoney.model.C69228h1;
import com.tencent.p014mm.plugin.luckymoney.model.C69233i2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69275y1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyVoiceLayout;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import eb0.C75592q0;
import f32.C45746f;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import ie3.C76331i;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88494d;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.libpag.PAGView;
import p008bq.C0363p0;
import p008bq.C67303a1;
import p008bq.C67305d1;
import p375qh.C22086d;
import p911ml.C76777a;
import p911ml.C76778b;
import qo3.C77407n;
import vo3.C90852c;
import w32.C78512f;
import yq3.C79144b;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 */
public class LuckyMoneyNewYearSendUIV2 extends LuckyMoneyBaseUI {

    /* renamed from: V1 */
    public static final /* synthetic */ int f200265V1 = 0;

    /* renamed from: A */
    public LinearLayout f200266A;

    /* renamed from: A1 */
    public int f200267A1;

    /* renamed from: B */
    public TextView f200268B;

    /* renamed from: B1 */
    public String f200269B1;

    /* renamed from: C */
    public TextView f200270C;

    /* renamed from: C1 */
    public String f200271C1;

    /* renamed from: D */
    public LinearLayout f200272D;

    /* renamed from: D1 */
    public int f200273D1;

    /* renamed from: E */
    public ImageView f200274E;

    /* renamed from: E1 */
    public String f200275E1;

    /* renamed from: F */
    public LuckyMoneyAutoScrollView f200276F;

    /* renamed from: F1 */
    public String f200277F1;

    /* renamed from: G */
    public TextView f200278G;

    /* renamed from: G1 */
    public long f200279G1;

    /* renamed from: H */
    public Button f200280H;

    /* renamed from: H1 */
    public boolean f200281H1;

    /* renamed from: I */
    public RelativeLayout f200282I;

    /* renamed from: I1 */
    public long f200283I1;

    /* renamed from: J */
    public TextView f200284J;

    /* renamed from: J1 */
    public int f200285J1;

    /* renamed from: K */
    public TextView f200286K;

    /* renamed from: K1 */
    public final IListener f200287K1;

    /* renamed from: L */
    public Button f200288L;

    /* renamed from: L1 */
    public C22086d.C22087a f200289L1;

    /* renamed from: M */
    public LuckyMoneyVoiceLayout f200290M;

    /* renamed from: M1 */
    public C22086d.C22088b f200291M1;

    /* renamed from: N */
    public ImageView f200292N;

    /* renamed from: N1 */
    public C55384i f200293N1;

    /* renamed from: O1 */
    public final MTimerHandler f200294O1;

    /* renamed from: P */
    public ImageView f200295P;

    /* renamed from: P1 */
    public LuckyMoneyVoiceLayout.C69548f f200296P1;

    /* renamed from: Q */
    public View f200297Q;

    /* renamed from: Q0 */
    public String f200298Q0;

    /* renamed from: Q1 */
    public View.OnClickListener f200299Q1;

    /* renamed from: R */
    public PAGView f200300R;

    /* renamed from: R0 */
    public int f200301R0;

    /* renamed from: R1 */
    public int f200302R1;

    /* renamed from: S */
    public PAGView f200303S;

    /* renamed from: S0 */
    public String f200304S0;

    /* renamed from: S1 */
    public int f200305S1;

    /* renamed from: T */
    public PAGView.PAGViewListener f200306T;

    /* renamed from: T0 */
    public Dialog f200307T0 = null;

    /* renamed from: T1 */
    public C76777a f200308T1;

    /* renamed from: U */
    public PAGView.PAGViewListener f200309U;

    /* renamed from: U0 */
    public int f200310U0;

    /* renamed from: U1 */
    public int f200311U1;

    /* renamed from: V */
    public View f200312V;

    /* renamed from: V0 */
    public String f200313V0;

    /* renamed from: W */
    public PAGView f200314W;

    /* renamed from: W0 */
    public String f200315W0;

    /* renamed from: X */
    public PAGView f200316X;

    /* renamed from: X0 */
    public String f200317X0;

    /* renamed from: Y */
    public PAGView.PAGViewListener f200318Y;

    /* renamed from: Y0 */
    public String f200319Y0;

    /* renamed from: Z */
    public PAGView.PAGViewListener f200320Z;

    /* renamed from: Z0 */
    public int f200321Z0;

    /* renamed from: a1 */
    public boolean f200322a1 = true;

    /* renamed from: b1 */
    public int f200323b1 = 0;

    /* renamed from: c1 */
    public int f200324c1 = 0;

    /* renamed from: d1 */
    public LinkedList<C69228h1> f200325d1;

    /* renamed from: e1 */
    public int f200326e1 = -1;

    /* renamed from: f1 */
    public ChatFooterPanel f200327f1;

    /* renamed from: g */
    public View f200328g;

    /* renamed from: g1 */
    public C69554a f200329g1;

    /* renamed from: h */
    public View f200330h;

    /* renamed from: h1 */
    public ViewGroup f200331h1;

    /* renamed from: i */
    public ImageView f200332i;

    /* renamed from: i1 */
    public View f200333i1;

    /* renamed from: j */
    public View f200334j;

    /* renamed from: j1 */
    public IEmojiInfo f200335j1;

    /* renamed from: k1 */
    public IEmojiInfo f200336k1;

    /* renamed from: l1 */
    public HBReportNewStruct f200337l1;

    /* renamed from: m1 */
    public HbSessionReportStruct f200338m1;

    /* renamed from: n */
    public TextView f200339n;

    /* renamed from: n1 */
    public int f200340n1;

    /* renamed from: o */
    public View f200341o;

    /* renamed from: o1 */
    public int f200342o1;

    /* renamed from: p */
    public BaseEmojiView f200343p;

    /* renamed from: p0 */
    public String f200344p0;

    /* renamed from: p1 */
    public int f200345p1;

    /* renamed from: q */
    public RoundCornerRelativeLayout f200346q;

    /* renamed from: q1 */
    public int f200347q1;

    /* renamed from: r */
    public View f200348r;

    /* renamed from: r1 */
    public int f200349r1;

    /* renamed from: s */
    public ImageView f200350s;

    /* renamed from: s1 */
    public int f200351s1;

    /* renamed from: t */
    public View f200352t;

    /* renamed from: t1 */
    public int f200353t1;

    /* renamed from: u */
    public TextView f200354u;

    /* renamed from: u1 */
    public long f200355u1;

    /* renamed from: v */
    public LinearLayout f200356v;

    /* renamed from: v1 */
    public boolean f200357v1;

    /* renamed from: w */
    public MMAnimateView f200358w;

    /* renamed from: w1 */
    public boolean f200359w1;

    /* renamed from: x */
    public TextView f200360x;

    /* renamed from: x0 */
    public String f200361x0;

    /* renamed from: x1 */
    public String f200362x1;

    /* renamed from: y */
    public LinearLayout f200363y;

    /* renamed from: y0 */
    public String f200364y0;

    /* renamed from: y1 */
    public boolean f200365y1;

    /* renamed from: z */
    public View f200366z;

    /* renamed from: z1 */
    public C22086d f200367z1;

    public LuckyMoneyNewYearSendUIV2() {
        new MMHandler();
        this.f200340n1 = 1;
        this.f200342o1 = 0;
        this.f200345p1 = 0;
        this.f200347q1 = 0;
        this.f200349r1 = 0;
        this.f200351s1 = 0;
        this.f200353t1 = 0;
        this.f200355u1 = 0;
        this.f200357v1 = false;
        this.f200359w1 = false;
        this.f200362x1 = "";
        this.f200365y1 = false;
        this.f200267A1 = 10;
        this.f200269B1 = "";
        this.f200271C1 = "";
        this.f200273D1 = 1;
        this.f200275E1 = "";
        this.f200277F1 = "";
        this.f200279G1 = 0;
        this.f200281H1 = false;
        this.f200285J1 = 0;
        this.f200287K1 = new IListener<WxPayLuckMoneyNewYearDownloadPAGResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = -261846412;
            }

            public boolean callback(IEvent iEvent) {
                WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = (WxPayLuckMoneyNewYearDownloadPAGResultEvent) iEvent;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "downloadPAGResultIListener downloadret：%s unfoldret:%s", Boolean.valueOf(wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d.f194108a), Boolean.valueOf(wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d.f194109b));
                WxPayLuckMoneyNewYearDownloadPAGResultEvent.C67833a aVar = wxPayLuckMoneyNewYearDownloadPAGResultEvent.f194107d;
                if (aVar.f194108a) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "downloadPAGResult succ");
                } else if (!aVar.f194109b || !C69218g1.m81554a()) {
                    LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = LuckyMoneyNewYearSendUIV2.this;
                    int i = LuckyMoneyNewYearSendUIV2.f200265V1;
                    luckyMoneyNewYearSendUIV2.mo95668Q7(0);
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "zipPAGResult succ");
                    LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = LuckyMoneyNewYearSendUIV2.this;
                    luckyMoneyNewYearSendUIV22.f200364y0 = IXWebBroadcastListener.STAGE_START;
                    luckyMoneyNewYearSendUIV22.mo95668Q7(5);
                    LuckyMoneyNewYearSendUIV2.this.f200287K1.dead();
                }
                return true;
            }
        };
        this.f200289L1 = new LuckyMoneyNewYearSendUIV2$$m(this);
        this.f200291M1 = new LuckyMoneyNewYearSendUIV2$$n(this);
        this.f200293N1 = new LuckyMoneyNewYearSendUIV2$$a(this);
        this.f200294O1 = new MTimerHandler(new LuckyMoneyNewYearSendUIV2$$o(this), true);
        this.f200296P1 = new LuckyMoneyNewYearSendUIV2$$p(this);
        this.f200299Q1 = new LuckyMoneyNewYearSendUIV2$$q(this);
        this.f200302R1 = 0;
        this.f200305S1 = 0;
        this.f200308T1 = new LuckyMoneyNewYearSendUIV2$$j(this);
        this.f200311U1 = 0;
    }

    /* renamed from: J7 */
    public static void m81843J7(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        if (!Util.isEqual(luckyMoneyNewYearSendUIV2.f200324c1, 1)) {
            return;
        }
        if (!Util.isEqual(luckyMoneyNewYearSendUIV2.f200323b1, 1)) {
            luckyMoneyNewYearSendUIV2.mo95677Z7();
            return;
        }
        C77407n nVar = new C77407n((Context) luckyMoneyNewYearSendUIV2.getContext(), 1, false);
        nVar.f225771i = new C69602h2(luckyMoneyNewYearSendUIV2);
        nVar.f225782p = new C69609i2(luckyMoneyNewYearSendUIV2);
        nVar.mo107573q();
    }

    /* renamed from: K7 */
    public static void m81844K7(LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        View view = luckyMoneyNewYearSendUIV2.f200297Q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "hideAllPAGAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyNewYearSendUIV2.f200300R.removeListener(luckyMoneyNewYearSendUIV2.f200306T);
        luckyMoneyNewYearSendUIV2.f200303S.removeListener(luckyMoneyNewYearSendUIV2.f200309U);
        luckyMoneyNewYearSendUIV2.f200300R.setVisibility(8);
        luckyMoneyNewYearSendUIV2.f200303S.setVisibility(8);
        luckyMoneyNewYearSendUIV2.f200300R.stop();
        luckyMoneyNewYearSendUIV2.f200303S.stop();
        luckyMoneyNewYearSendUIV2.f200314W.removeListener(luckyMoneyNewYearSendUIV2.f200318Y);
        luckyMoneyNewYearSendUIV2.f200316X.removeListener(luckyMoneyNewYearSendUIV2.f200320Z);
        luckyMoneyNewYearSendUIV2.f200314W.setVisibility(8);
        luckyMoneyNewYearSendUIV2.f200316X.setVisibility(8);
        luckyMoneyNewYearSendUIV2.f200314W.stop();
        luckyMoneyNewYearSendUIV2.f200316X.stop();
    }

    /* renamed from: L7 */
    public final void mo95663L7() {
        if (this.f200335j1 == null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "dealXmlAddEmojiInfo() mEmojiInfo == null");
            return;
        }
        try {
            int indexOf = this.f200304S0.indexOf("<wcpayinfo>");
            if (indexOf > 0 && indexOf < this.f200304S0.length()) {
                StringBuilder sb = new StringBuilder();
                IEmojiInfo iEmojiInfo = this.f200335j1;
                if (iEmojiInfo == null) {
                    iEmojiInfo = ((C0363p0) C86312j.m106911c(C0363p0.class)).mo404zE();
                }
                C45746f.m51029a(sb, iEmojiInfo, 0);
                StringBuilder sb4 = new StringBuilder(this.f200304S0.substring(0, indexOf));
                String trim = this.f200304S0.substring(indexOf).trim();
                sb4.append(sb);
                sb4.append(trim);
                this.f200304S0 = sb4.toString();
            }
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "dealXmlAddEmojiInfo() success");
        } catch (Exception e) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "dealXmlAddEmojiInfo() Exception:%s", e.getMessage());
        }
    }

    /* renamed from: M7 */
    public final void mo95664M7(int i, Intent intent) {
        C42514c2 c2Var;
        String s = C75592q0.m90789s();
        if (i == -1) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onActivityResult() resultCode == RESULT_OK");
            this.f200311U1 = 1;
            c2Var = new C42514c2(this.f200269B1, this.f200271C1, 1, s, Util.nullAsNil(this.f200298Q0));
        } else {
            if (intent != null) {
                this.f200311U1 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "doNetSceneLuckyMoneyReport() data == null");
                this.f200311U1 = 3;
            }
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onActivityResult() resultCode != RESULT_OK  payType:%s", Integer.valueOf(this.f200311U1));
            c2Var = new C42514c2(this.f200269B1, this.f200271C1, this.f200311U1, s, Util.nullAsNil(this.f200298Q0));
        }
        C86709a0.m107529k().f251779b.mo123460f(c2Var);
    }

    /* renamed from: N7 */
    public final void mo95665N7(int i) {
        int i2;
        String str;
        C69233i2.C69234a aVar;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "doSend()");
        C115669n.INSTANCE.mo160131h(11701, 15, 3, 0, 1, 1);
        mo95679b8(true);
        mo95678a8();
        String s = C75592q0.m90789s();
        IEmojiInfo iEmojiInfo = this.f200335j1;
        if (iEmojiInfo != null) {
            str = iEmojiInfo.getMd5();
            i2 = this.f200335j1.getType();
        } else {
            str = "";
            i2 = 0;
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "doSend() mUniqueId:%s userConfirmJump:%s lastPayResult:%s mSendId:%s", this.f200271C1, Integer.valueOf(i), Integer.valueOf(this.f200311U1), this.f200269B1);
        if (this.f200357v1) {
            int i3 = this.f200321Z0;
            doSceneProgress(new C69275y1(1, (long) i3, (long) i3, 3, this.f200319Y0, this.f200298Q0, C69242l1.m81601g(), C75592q0.m90789s(), 2), false);
            return;
        }
        int i4 = this.f200273D1;
        if (i4 == 3) {
            C69233i2.C69234a aVar2 = new C69233i2.C69234a();
            aVar2.f199207a = this.f200277F1;
            aVar2.f199208b = this.f200275E1;
            aVar2.f199209c = this.f200279G1;
            aVar2.f199210d = this.f200290M.getUseTime();
            aVar = aVar2;
        } else {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "not use voice, because cdnUploadState is %s", Integer.valueOf(i4));
            aVar = null;
        }
        doSceneProgress(new C69233i2(this.f200321Z0, this.f200319Y0, C69242l1.m81599e(s), this.f200298Q0, s, C75592q0.m90783m(), this.f200301R0, str, i2, this.f200271C1, i, this.f200311U1, this.f200269B1, aVar), false);
    }

    /* renamed from: O7 */
    public final void mo95666O7() {
        int i;
        this.f200345p1++;
        this.f200326e1++;
        LinkedList<C69228h1> linkedList = this.f200325d1;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "genRandomAmountIndex yearMessList is empty!");
            i = -1;
        } else {
            i = this.f200326e1 < this.f200325d1.size() ? this.f200326e1 : 0;
        }
        this.f200326e1 = i;
        if (i >= 0 && i < this.f200325d1.size()) {
            this.f200321Z0 = this.f200325d1.get(this.f200326e1).f199192a;
            this.f200319Y0 = this.f200325d1.get(this.f200326e1).f199193b;
            this.f200313V0 = this.f200325d1.get(this.f200326e1).f199194c;
            this.f200315W0 = this.f200325d1.get(this.f200326e1).f199195d;
            this.f200317X0 = this.f200325d1.get(this.f200326e1).f199196e;
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "yearMessList.size():%s，mSelectIndex：%s, randomAmount:%s, randomWishing:%s, randomWishKeyWord:%s, randomPagName:%s", Integer.valueOf(this.f200325d1.size()), Integer.valueOf(this.f200326e1), Integer.valueOf(this.f200321Z0), this.f200319Y0, this.f200313V0, this.f200315W0);
        this.f200276F.setFinalText(C75228t.m90260n(((double) this.f200321Z0) / 100.0d));
        mo95680c8(false);
        this.f200276F.setFocusable(false);
        this.f200366z.setFocusable(false);
        this.f200366z.setClickable(false);
        this.f200363y.setFocusable(false);
        this.f200363y.setClickable(false);
        this.f200272D.setFocusable(false);
        this.f200272D.setClickable(false);
        this.f200276F.setContentDescription("");
        if (this.f200322a1) {
            C119179t tVar = C119157j.f356862d;
            LuckyMoneyNewYearSendUIV2$$f luckyMoneyNewYearSendUIV2$$f = new LuckyMoneyNewYearSendUIV2$$f(this);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(luckyMoneyNewYearSendUIV2$$f, 500, false);
            return;
        }
        C69218g1.m81561h(this.f200272D, 4);
        LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f200276F;
        luckyMoneyAutoScrollView.f199659y = new C69617j2(this);
        MMHandlerThread.postToMainThread(new C69572c(luckyMoneyAutoScrollView));
    }

    /* renamed from: P7 */
    public final void mo95667P7() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_NEW_STRING, "");
        if (!Util.isNullOrNil(str) && this.f200302R1 != 5) {
            mo95676Y7(str);
        } else if (C69218g1.m81554a()) {
            this.f200364y0 = IXWebBroadcastListener.STAGE_START;
            mo95668Q7(5);
        } else {
            mo95668Q7(6);
        }
    }

    /* renamed from: Q7 */
    public final void mo95668Q7(int i) {
        ((C119157j) C119157j.f356862d).mo183895z(new LuckyMoneyNewYearSendUIV2$$c(this, i));
    }

    /* renamed from: R7 */
    public final void mo95669R7() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "hideMaskPAGAnim");
        this.f200314W.setVisibility(8);
        this.f200316X.setVisibility(8);
        this.f200314W.stop();
        this.f200316X.stop();
    }

    /* renamed from: S7 */
    public final void mo95670S7() {
        if (this.f200359w1) {
            this.f200288L.setVisibility(0);
            this.f200274E.setVisibility(0);
            this.f200284J.setVisibility(0);
            this.f200290M.setVisibility(0);
            this.f200280H.setVisibility(8);
            this.f200363y.setVisibility(8);
            View view = this.f200312V;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "initViewWithVoice", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "initViewWithVoice", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200288L.setOnClickListener(this.f200299Q1);
            this.f200272D.setOnClickListener(this.f200299Q1);
            this.f200292N.setOnClickListener(this.f200299Q1);
            this.f200290M.f200823p = this.f200296P1;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).getLayoutParams();
            layoutParams.topMargin = C76577a.m92151b(getContext(), 26);
            findViewById(C0966R.C0970id.f358688gh2).setLayoutParams(layoutParams);
        } else {
            this.f200312V.setOnClickListener(this.f200299Q1);
            this.f200280H.setOnClickListener(this.f200299Q1);
            this.f200363y.setOnClickListener(this.f200299Q1);
        }
        mo95675X7();
    }

    /* renamed from: T7 */
    public final boolean mo95671T7() {
        C79144b.m95773a().getClass();
        boolean c = C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_open_kinda_wallet_luckymoney_newyear, false);
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[isOpenKinda} isKindaEnable: %s，isKindaWalletLuckyMoneyNewYear: %s", Boolean.TRUE, Boolean.valueOf(c));
        return c;
    }

    /* renamed from: U7 */
    public final void mo95672U7(int i) {
        mo95673V7(i, 0);
    }

    /* renamed from: V7 */
    public final void mo95673V7(int i, long j) {
        LuckyMoneyNewYearReportStruct luckyMoneyNewYearReportStruct = new LuckyMoneyNewYearReportStruct();
        luckyMoneyNewYearReportStruct.f194258h = luckyMoneyNewYearReportStruct.mo86045b("sessionid", this.f200271C1, true);
        luckyMoneyNewYearReportStruct.f194259i = luckyMoneyNewYearReportStruct.mo86045b("flistid", this.f200269B1, true);
        luckyMoneyNewYearReportStruct.f194257g = this.f200321Z0;
        luckyMoneyNewYearReportStruct.f194255e = 1;
        luckyMoneyNewYearReportStruct.f194260j = 1;
        luckyMoneyNewYearReportStruct.f194254d = (long) i;
        luckyMoneyNewYearReportStruct.f194256f = j;
        luckyMoneyNewYearReportStruct.mo86054n();
    }

    /* renamed from: W7 */
    public final void mo95674W7(int i) {
        HbSessionReportStruct hbSessionReportStruct = new HbSessionReportStruct();
        this.f200338m1 = hbSessionReportStruct;
        hbSessionReportStruct.f194230d = (long) i;
        hbSessionReportStruct.f194231e = (long) this.f200340n1;
        hbSessionReportStruct.f194232f = (long) this.f200345p1;
        hbSessionReportStruct.f194233g = (long) this.f200347q1;
        hbSessionReportStruct.f194234h = (long) this.f200349r1;
        hbSessionReportStruct.f194237k = (long) this.f200351s1;
        hbSessionReportStruct.f194235i = (long) this.f200353t1;
        IEmojiInfo iEmojiInfo = this.f200335j1;
        hbSessionReportStruct.f194236j = hbSessionReportStruct.mo86045b("EmoticonMd5", iEmojiInfo == null ? "" : iEmojiInfo.getMd5(), true);
        this.f200338m1.mo86054n();
    }

    /* renamed from: X7 */
    public final void mo95675X7() {
        int i;
        int i2;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "setBackgroundContainerSize");
        Point b = C75044y4.m89990b(getContext());
        int i3 = b.x;
        int i4 = b.y;
        int f = C75044y4.m89994f(getContext());
        int c = C75044y4.m89991c(getContext());
        int b2 = C76577a.m92151b(getContext(), C0947jz.f2205e);
        int b3 = C76577a.m92151b(getContext(), EasyGoCode.ReleaseErrCode.UNKNOWN_ERR);
        ViewGroup.LayoutParams layoutParams = this.f200330h.getLayoutParams();
        float f2 = C88494d.f255615g;
        float b4 = (float) C76577a.m92151b(getContext(), 48);
        if (f2 > 1.0f) {
            b4 /= f2;
        }
        if (this.f200359w1) {
            i2 = C76577a.m92151b(getContext(), 40);
            i = C76577a.m92151b(getContext(), 102);
        } else {
            i2 = C76577a.m92151b(getContext(), 40);
            i = C76577a.m92151b(getContext(), 40);
        }
        int i5 = i2 + i;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "screenWidth：%s containerRealWidth:%s minPadding:%s Density:%s", Integer.valueOf(i3), Integer.valueOf(b2), Float.valueOf(b4), Float.valueOf(C76577a.m92156g(getContext())));
        float f3 = (float) i3;
        if (f3 <= ((float) b2) + b4) {
            int i6 = (int) (f3 - b4);
            layoutParams.width = i6;
            Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "need adjust width to %s", Integer.valueOf(i6));
        }
        Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "screenHeight：%s  statusAndBottomHeight:%s containerRealHeight:%s buttonHeight:%s", Integer.valueOf(i4), Integer.valueOf(f + c), Integer.valueOf(b3), Integer.valueOf(i5));
        int i7 = (i4 - f) - c;
        if (i7 < b3 + i5) {
            if (this.f200359w1) {
                int b5 = i7 - (C76577a.m92151b(getContext(), 40) + C76577a.m92151b(getContext(), 80));
                int i8 = b3 - b5;
                if (i8 > 0) {
                    layoutParams.height = b5;
                }
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "need adjust height to %s, diff:%s", Integer.valueOf(b5), Integer.valueOf(i8));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f200272D.getLayoutParams();
                layoutParams2.bottomMargin = C76577a.m92151b(getContext(), 0);
                if (i8 > C76577a.m92151b(getContext(), 24)) {
                    layoutParams2.topMargin = C76577a.m92151b(getContext(), 0);
                    this.f200272D.setLayoutParams(layoutParams2);
                }
                int b6 = C76577a.m92151b(getContext(), 64) - i8;
                if (b6 < 0) {
                    Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "needTop:%s", Integer.valueOf(b6));
                    layoutParams2.topMargin = b6;
                    this.f200272D.setLayoutParams(layoutParams2);
                }
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f200288L.getLayoutParams();
                layoutParams3.topMargin = C76577a.m92151b(getContext(), 16);
                this.f200288L.setLayoutParams(layoutParams3);
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).getLayoutParams();
                layoutParams4.topMargin = C76577a.m92151b(getContext(), 16);
                ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).setLayoutParams(layoutParams4);
            } else {
                int i9 = i7 - i5;
                layoutParams.height = i9;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "need adjust height to %s", Integer.valueOf(i9));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f200272D.getLayoutParams();
                layoutParams5.bottomMargin = C76577a.m92151b(getContext(), 0);
                layoutParams5.topMargin = C76577a.m92151b(getContext(), 8);
                this.f200272D.setLayoutParams(layoutParams5);
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) this.f200280H.getLayoutParams();
                layoutParams6.bottomMargin = C76577a.m92151b(getContext(), 16);
                this.f200280H.setLayoutParams(layoutParams6);
                LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).getLayoutParams();
                layoutParams7.topMargin = C76577a.m92151b(getContext(), 24);
                ((ImageView) findViewById(C0966R.C0970id.f358688gh2)).setLayoutParams(layoutParams7);
            }
        }
        this.f200330h.setLayoutParams(layoutParams);
    }

    /* renamed from: Y7 */
    public final void mo95676Y7(String str) {
        this.f200335j1 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(str);
        if (((C67305d1) C86312j.m106911c(C67305d1.class)).mo91430hJ(this.f200335j1)) {
            this.f200343p.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else if (this.f200335j1.mo62678k()) {
            this.f200343p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            this.f200343p.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.f200343p.setEmojiInfo(this.f200335j1);
        mo95668Q7(1);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HONGBAO_NEW_YEAR_LAST_SEND_EMOJI_MD5_NEW_STRING, str);
    }

    /* renamed from: Z7 */
    public final void mo95677Z7() {
        int i;
        HBReportNewStruct hBReportNewStruct = new HBReportNewStruct();
        this.f200337l1 = hBReportNewStruct;
        hBReportNewStruct.f194229d = 10;
        hBReportNewStruct.mo86054n();
        this.f200342o1 = 2;
        this.f200329g1.show();
        if (Util.isEqual(this.f200323b1, 1)) {
            int i2 = ChatFooterPanel.f211589f;
            i = 9;
        } else {
            int i3 = ChatFooterPanel.f211589f;
            i = 12;
        }
        C67339b.m79677b(this.f200331h1, this.f200327f1, i, new LuckyMoneyNewYearSendUIV2$$b(this));
    }

    /* renamed from: a8 */
    public final void mo95678a8() {
        Dialog dialog = this.f200307T0;
        if (dialog == null) {
            this.f200307T0 = C75197d0.m90164e(getContext(), true, new LuckyMoneyNewYearSendUIV2$$e(this));
        } else if (!dialog.isShowing()) {
            this.f200307T0.show();
        }
    }

    /* renamed from: b8 */
    public final void mo95679b8(boolean z) {
        if (this.f200367z1 == null || !this.f200365y1) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "stopVoicePlay but no need");
            return;
        }
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "stopVoicePlay");
        if (z) {
            C69218g1.m81565l(this.f200292N);
        }
        this.f200367z1.stop();
        this.f200365y1 = false;
        long milliSecondsToNow = Util.milliSecondsToNow(this.f200283I1);
        this.f200283I1 = 0;
        mo95673V7(16, milliSecondsToNow);
    }

    /* renamed from: c8 */
    public final void mo95680c8(boolean z) {
        this.f200280H.setClickable(z);
        if (z) {
            if (!(this.f200280H.getBackground() == null || this.f200280H.getBackground().mutate() == null)) {
                this.f200280H.getBackground().mutate().setAlpha(255);
            }
            this.f200280H.setTextColor(getResources().getColor(C0966R.color.a3d));
        }
    }

    /* renamed from: d8 */
    public void mo95681d8() {
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "ljd:updateView");
        LinkedList<C69228h1> linkedList = this.f200325d1;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "ljd:year mess list is not valid!");
            if (!this.f200359w1) {
                this.f200363y.setVisibility(8);
            }
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "ljd:year mess list is valid!");
            if (!this.f200359w1) {
                this.f200363y.setVisibility(0);
            }
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200278G.getLayoutParams();
        this.f200278G.setTextSize(1, 17.0f);
        this.f200360x.setTextSize(1, 15.0f);
        this.f200276F.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357048af2), getResources().getDimensionPixelOffset(C0966R.dimen.aey));
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f200276F.getLayoutParams();
        layoutParams2.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.ael);
        this.f200276F.setLayoutParams(layoutParams2);
        this.f200276F.invalidate();
        if (!this.f200359w1) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f200363y.getLayoutParams();
            layoutParams3.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.avk);
            this.f200363y.setLayoutParams(layoutParams3);
            this.f200363y.invalidate();
        } else {
            int i = this.f200285J1;
            if (i == 1) {
                this.f200288L.setVisibility(0);
                this.f200274E.setVisibility(0);
                this.f200290M.setVisibility(0);
                this.f200272D.setVisibility(0);
                View view = this.f200366z;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200284J.setVisibility(0);
                this.f200286K.setVisibility(8);
                this.f200292N.setVisibility(8);
                mo95682e8(true, this.f200288L);
                mo95682e8(true, this.f200295P);
                mo95669R7();
                this.f200366z.postDelayed(new LuckyMoneyNewYearSendUIV2$$d(this), 300);
            } else if (i == 2) {
                C69218g1.m81562i(this.f200272D, 8);
                C69218g1.m81562i(this.f200366z, 8);
                C69218g1.m81562i(this.f200284J, 8);
                mo95682e8(false, this.f200288L);
                mo95682e8(false, this.f200295P);
            } else if (i == 3) {
                C69218g1.m81562i(this.f200292N, 0);
                C69218g1.m81562i(this.f200272D, 0);
                C69218g1.m81562i(this.f200366z, 0);
                this.f200290M.setVisibility(8);
                this.f200286K.setVisibility(8);
                this.f200284J.setVisibility(8);
                mo95682e8(true, this.f200288L);
                mo95682e8(true, this.f200295P);
            }
        }
        mo95675X7();
    }

    /* renamed from: e8 */
    public final void mo95682e8(boolean z, View view) {
        view.setClickable(z);
        if (view instanceof Button) {
            view.setEnabled(z);
        } else if (z) {
            if (view.getBackground() == null || view.getBackground().mutate() == null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateViewState", "(ZLandroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateViewState", "(ZLandroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            view.getBackground().mutate().setAlpha(255);
        } else if (view.getBackground() == null || view.getBackground().mutate() == null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.5f));
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateViewState", "(ZLandroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUIV2", "updateViewState", "(ZLandroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            view.getBackground().mutate().setAlpha(128);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.clz;
    }

    public void initView() {
        setActionbarColor(-839716110);
        setContentViewVisibility(8);
        this.f200328g = findViewById(C0966R.C0970id.m_c);
        if (C85875k4.m106211z()) {
            this.f200328g.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
            setActionbarColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
            setNavigationbarColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
        } else {
            this.f200328g.setBackgroundColor(-839716110);
            setActionbarColor(-839716110);
            setNavigationbarColor(-839716110);
        }
        this.f200330h = findViewById(C0966R.C0970id.ghf);
        this.f200360x = (TextView) findViewById(C0966R.C0970id.gbt);
        this.f200276F = (LuckyMoneyAutoScrollView) findViewById(C0966R.C0970id.ggl);
        this.f200272D = (LinearLayout) findViewById(C0966R.C0970id.ogt);
        this.f200274E = (ImageView) findViewById(C0966R.C0970id.ogu);
        this.f200278G = (TextView) findViewById(C0966R.C0970id.f358689gh3);
        this.f200280H = (Button) findViewById(C0966R.C0970id.f358686gh0);
        this.f200282I = (RelativeLayout) findViewById(C0966R.C0970id.ogq);
        this.f200284J = (TextView) findViewById(C0966R.C0970id.ogr);
        this.f200286K = (TextView) findViewById(C0966R.C0970id.ogp);
        this.f200288L = (Button) findViewById(C0966R.C0970id.ogs);
        this.f200290M = (LuckyMoneyVoiceLayout) findViewById(C0966R.C0970id.ogy);
        this.f200292N = (ImageView) findViewById(C0966R.C0970id.ogv);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f358688gh2);
        this.f200295P = imageView;
        imageView.setOnClickListener(this.f200299Q1);
        this.f200332i = (ImageView) findViewById(C0966R.C0970id.ggu);
        this.f200334j = findViewById(C0966R.C0970id.ggs);
        this.f200339n = (TextView) findViewById(C0966R.C0970id.ggt);
        ((ImageView) findViewById(C0966R.C0970id.ggo)).setOnClickListener(this.f200299Q1);
        ((TextView) findViewById(C0966R.C0970id.ggt)).setOnClickListener(this.f200299Q1);
        this.f200341o = findViewById(C0966R.C0970id.ggr);
        this.f200343p = (BaseEmojiView) findViewById(C0966R.C0970id.ggn);
        RoundCornerRelativeLayout roundCornerRelativeLayout = (RoundCornerRelativeLayout) findViewById(C0966R.C0970id.f358683m41);
        this.f200346q = roundCornerRelativeLayout;
        roundCornerRelativeLayout.setRadius((float) C76577a.m92151b(getContext(), 16));
        this.f200348r = findViewById(C0966R.C0970id.f358684m42);
        this.f200343p.setOnClickListener(this.f200299Q1);
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.ggq);
        View findViewById = findViewById(C0966R.C0970id.f358685m43);
        this.f200352t = findViewById;
        findViewById.setOnClickListener(this.f200299Q1);
        this.f200350s = (ImageView) findViewById(C0966R.C0970id.ggp);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ggy);
        this.f200354u = textView;
        textView.setOnClickListener(this.f200299Q1);
        this.f200356v = (LinearLayout) findViewById(C0966R.C0970id.ggm);
        this.f200358w = (MMAnimateView) findViewById(C0966R.C0970id.g3c);
        this.f200363y = (LinearLayout) findViewById(C0966R.C0970id.ggx);
        View findViewById2 = findViewById(C0966R.C0970id.m3y);
        this.f200366z = findViewById2;
        findViewById2.setOnClickListener(this.f200299Q1);
        this.f200329g1 = new C69554a(this);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.b9n, (ViewGroup) null);
        this.f200333i1 = inflate;
        this.f200329g1.setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f200333i1.findViewById(C0966R.C0970id.ge_).setOnClickListener(new LuckyMoneyNewYearSendUIV2$$k(this));
        this.f200329g1.f200845f = new LuckyMoneyNewYearSendUIV2$$l(this);
        this.f200331h1 = (ViewGroup) this.f200333i1.findViewById(C0966R.C0970id.geb);
        ChatFooterPanel si02 = C30699x0.m39154a().si0(getContext());
        this.f200327f1 = si02;
        si02.setTalkerName(this.f200298Q0);
        this.f200327f1.setShowSmiley(false);
        this.f200266A = (LinearLayout) findViewById(C0966R.C0970id.ggv);
        this.f200268B = (TextView) findViewById(C0966R.C0970id.gfe);
        this.f200270C = (TextView) findViewById(C0966R.C0970id.gfd);
        if (this.f200357v1) {
            this.f200266A.setVisibility(4);
            this.f200330h.setBackgroundResource(C0966R.C0969drawable.c78);
            this.f200268B.setVisibility(0);
            this.f200270C.setVisibility(4);
            this.f200360x.setVisibility(8);
        }
        this.f200297Q = findViewById(C0966R.C0970id.m47);
        this.f200312V = findViewById(C0966R.C0970id.m46);
        this.f200300R = (PAGView) findViewById(C0966R.C0970id.m44);
        this.f200303S = (PAGView) findViewById(C0966R.C0970id.m48);
        this.f200306T = new C69632l2(this);
        this.f200309U = new C69638m2(this);
        this.f200300R.addListener(this.f200306T);
        this.f200300R.setRepeatCount(1);
        this.f200300R.setScaleMode(3);
        this.f200303S.setRepeatCount(1);
        this.f200303S.setScaleMode(3);
        this.f200314W = (PAGView) findViewById(C0966R.C0970id.ogm);
        this.f200316X = (PAGView) findViewById(C0966R.C0970id.ogn);
        this.f200318Y = new C69650n2(this);
        this.f200320Z = new C69657o2(this);
        this.f200314W.addListener(this.f200318Y);
        this.f200314W.setRepeatCount(1);
        this.f200314W.setScaleMode(3);
        this.f200316X.setRepeatCount(1);
        this.f200316X.setScaleMode(3);
        mo95670S7();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00eb, code lost:
        r5 = (com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) r3.getParcelableExtra("key_realname_guide_helper");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r18, int r19, android.content.Intent r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = -1
            r9 = 4
            r10 = 5
            r11 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            java.lang.String r15 = "MicroMsg.LuckyMoneyNewYearSendUIV2"
            r7 = 1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            if (r1 == r7) goto L_0x00c1
            if (r1 == r10) goto L_0x0070
            r5 = 1111(0x457, float:1.557E-42)
            if (r1 == r5) goto L_0x0031
            goto L_0x017b
        L_0x0031:
            if (r2 != r8) goto L_0x0069
            r1 = 0
            if (r3 == 0) goto L_0x003f
            java.lang.String r5 = "key_enter_time"
            long r5 = r3.getLongExtra(r5, r1)
            r0.f200355u1 = r5
        L_0x003f:
            long r5 = r0.f200355u1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((long) r5, (long) r1)
            if (r1 != 0) goto L_0x0062
            r0.mo95668Q7(r13)
            r0.mo95680c8(r4)
            ml.b r1 = p911ml.C76778b.f224582a
            long r1 = r0.f200355u1
            ml.a r3 = r0.f200308T1
            java.lang.String r4 = "callback"
            gy3.C87412m.m108594g(r3, r4)
            ml.c r4 = new ml.c
            r4.<init>(r1, r3)
            o40.C61926c.m72668M(r4)
            goto L_0x017b
        L_0x0062:
            java.lang.String r1 = "mTimeEnter == 0L go emoji capture failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x017b
        L_0x0069:
            java.lang.String r1 = "go emoji capture failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            goto L_0x017b
        L_0x0070:
            if (r3 == 0) goto L_0x017b
            java.lang.String r1 = "result_data"
            boolean r2 = r3.hasExtra(r1)
            if (r2 == 0) goto L_0x017b
            android.os.Bundle r1 = r3.getBundleExtra(r1)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r2 = "payState"
            java.lang.String r3 = "2"
            java.lang.String r1 = r1.getString(r2, r3)
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onActivityResult REQUEST_CODE_H5_PAY payState is "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
            if (r1 != 0) goto L_0x017b
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r2 = new java.lang.Object[r10]
            r2[r4] = r6
            r2[r7] = r14
            r2[r11] = r5
            r2[r13] = r16
            r2[r9] = r12
            r3 = 11701(0x2db5, float:1.6397E-41)
            r1.mo160131h(r3, r2)
            r17.finish()
            goto L_0x017b
        L_0x00ba:
            java.lang.String r1 = "onActivityResult REQUEST_CODE_H5_PAY bundle is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            goto L_0x017b
        L_0x00c1:
            if (r2 != r8) goto L_0x0173
            java.lang.String r1 = "do pay success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
            r1 = 19
            r0.mo95672U7(r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r10]
            r8[r4] = r6
            r8[r7] = r14
            r8[r11] = r5
            r8[r13] = r16
            r8[r9] = r12
            r5 = 11701(0x2db5, float:1.6397E-41)
            r1.mo160131h(r5, r8)
            r1 = 0
            if (r3 == 0) goto L_0x00fe
            java.lang.String r5 = "key_realname_guide_helper"
            boolean r6 = r3.hasExtra(r5)
            if (r6 == 0) goto L_0x00fe
            android.os.Parcelable r5 = r3.getParcelableExtra(r5)
            com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper r5 = (com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper) r5
            if (r5 == 0) goto L_0x00fe
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$i r6 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2$$i
            r6.<init>(r0)
            boolean r5 = r5.mo99370a(r0, r1, r6, r1)
            r5 = r5 ^ r7
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            r17.mo95663L7()
            java.lang.String r6 = r0.f200304S0
            java.lang.String r8 = "msg"
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r1)
            if (r1 != 0) goto L_0x0115
            java.lang.String r1 = "LuckyMoneyNewYearSendUIV2 onActivityResult values is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
            r17.finish()
            return
        L_0x0115:
            java.lang.String r6 = ".msg.appmsg.wcpayinfo.paymsgid"
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            g32.b r6 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.a1 r6 = r6.Bx0()
            boolean r1 = r6.mo57182a(r1)
            if (r1 == 0) goto L_0x013e
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r6 = r0.f200304S0
            r1[r4] = r6
            java.lang.String r4 = "sendLocalMsg() for hb! mMsgXml:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r4, r1)
            java.lang.String r1 = r0.f200304S0
            java.lang.String r4 = r0.f200298Q0
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81614t(r1, r4, r13)
            goto L_0x0143
        L_0x013e:
            java.lang.String r1 = "it is a duplicate msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
        L_0x0143:
            if (r5 != 0) goto L_0x0148
            r17.finish()
        L_0x0148:
            com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct
            r1.<init>()
            r0.f200337l1 = r1
            int r4 = r0.f200340n1
            if (r4 != r7) goto L_0x0158
            r4 = 8
            r1.f194229d = r4
            goto L_0x016c
        L_0x0158:
            if (r4 != r11) goto L_0x015f
            r4 = 6
            r1.f194229d = r4
            goto L_0x016c
        L_0x015f:
            if (r4 != r13) goto L_0x0166
            r4 = 7
            r1.f194229d = r4
            goto L_0x016c
        L_0x0166:
            if (r4 != r9) goto L_0x016c
            r4 = 14
            r1.f194229d = r4
        L_0x016c:
            r1.mo86054n()
            r0.mo95674W7(r7)
            goto L_0x0178
        L_0x0173:
            java.lang.String r1 = "do pay cancel or failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
        L_0x0178:
            r0.mo95664M7(r2, r3)
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNewYearSendUIV2.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onBackPressed() {
        mo95674W7(2);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "lucky send ui create");
        this.f200298Q0 = getIntent().getStringExtra("key_username");
        this.f200301R0 = getIntent().getIntExtra("key_way", 0);
        this.f200310U0 = getIntent().getIntExtra("pay_channel", -1);
        if (mo95671T7()) {
            this.f200310U0 = 11;
        } else {
            this.f200310U0 = 0;
        }
        if (Util.isNullOrNil(this.f200298Q0)) {
            Log.m105928w("MicroMsg.LuckyMoneyNewYearSendUIV2", "name null finish");
            finish();
        }
        this.f200357v1 = C69242l1.m81607m();
        initView();
        if (this.f200357v1) {
            doSceneProgress(new C78512f());
        } else {
            doSceneProgress(new C69271w1(8, "v1.0", ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC, 0)).intValue()));
        }
        mo95672U7(1);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onDestroy");
        Dialog dialog = this.f200307T0;
        if (dialog != null && dialog.isShowing()) {
            this.f200307T0.dismiss();
        }
        if (this.f200327f1 != null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "commentfooter release");
            this.f200327f1.mo100196h();
            this.f200327f1.mo100200l();
            this.f200327f1.mo100189b();
        }
        MMAnimateView mMAnimateView = this.f200358w;
        if (mMAnimateView != null) {
            mMAnimateView.pause();
            this.f200358w.mo129237x();
        }
        mo95679b8(false);
        C69218g1.m81566m(this.f200300R, this.f200306T, this.f200309U);
        C69218g1.m81566m(this.f200303S, this.f200306T, this.f200309U);
        C69218g1.m81566m(this.f200314W, this.f200318Y, this.f200320Z);
        C69218g1.m81566m(this.f200316X, this.f200318Y, this.f200320Z);
        C76778b.f224582a.mo107031b(this.f200355u1, this.f200308T1);
        this.f200287K1.dead();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C76324c.class;
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() errType:" + i + " errCode:" + i2 + " errMsg:" + str + " netsceneType:" + yVar.getType());
        boolean z = false;
        if (yVar instanceof C69271w1) {
            if (i == 0 && i2 == 0) {
                C69271w1 w1Var = (C69271w1) yVar;
                this.f200321Z0 = w1Var.f199356j;
                this.f200319Y0 = w1Var.f199354h;
                int i3 = w1Var.f199369z;
                this.f200323b1 = i3;
                this.f200324c1 = w1Var.f199346A;
                this.f200271C1 = w1Var.f199362s;
                this.f200325d1 = w1Var.f199349D;
                this.f200344p0 = w1Var.f199350E;
                this.f200361x0 = w1Var.f199351F;
                this.f200359w1 = w1Var.f199352G;
                Log.m105925i("MicroMsg.LuckyMoneyNewYearSendUIV2", "enableSelfIe:%s enableYearVoice:%s", Integer.valueOf(i3), Boolean.valueOf(this.f200359w1));
                mo95670S7();
                mo95666O7();
                mo95681d8();
                mo95667P7();
                setContentViewVisibility(0);
                C69218g1.m81559f(this.f200330h, (Animation.AnimationListener) null);
                return true;
            }
            finish();
        } else if (yVar instanceof C78512f) {
            if (i == 0 && i2 == 0) {
                C78512f fVar = (C78512f) yVar;
                int i4 = fVar.f229965p;
                if (i4 == 1) {
                    this.f200321Z0 = fVar.f229962j;
                    this.f200319Y0 = fVar.f229963n;
                    this.f200325d1 = fVar.f229966q;
                    mo95666O7();
                    mo95667P7();
                    mo95681d8();
                    setContentViewVisibility(0);
                    C69218g1.m81559f(this.f200330h, (Animation.AnimationListener) null);
                    return true;
                }
                Log.m105921e("MicroMsg.LuckyMoneyNewYearSendUIV2", "hk sceneSwitch is %d", Integer.valueOf(i4));
                finish();
            } else {
                finish();
            }
        } else if (yVar instanceof C69275y1) {
            Dialog dialog = this.f200307T0;
            if (dialog != null && dialog.isShowing()) {
                this.f200307T0.dismiss();
            }
            if (i == 0 && i2 == 0) {
                String str2 = ((C69275y1) yVar).f199392h;
                if (!Util.isNullOrNil(str2)) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "payUrl is not null");
                    C75228t.m90220M(getContext(), str2, false, 5);
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "payUrl is null");
                }
            }
        } else if (yVar instanceof C69224g2) {
            Dialog dialog2 = this.f200307T0;
            if (dialog2 != null && dialog2.isShowing() && !mo95671T7()) {
                this.f200307T0.dismiss();
            }
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "send hb success!");
                C69224g2 g2Var = (C69224g2) yVar;
                this.f200304S0 = g2Var.f199184j;
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = g2Var.f199183i;
                payInfo.f212589g = this.f200310U0;
                if (mo95671T7()) {
                    payInfo.f212587e = 78;
                    ((C76324c) C86312j.m106911c(cls)).startSNSPay(this, payInfo);
                } else {
                    payInfo.f212587e = 37;
                    C76331i.m91761e(getContext(), payInfo, 1);
                }
                return true;
            }
            Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "send hb failed!");
        } else if (yVar instanceof C69233i2) {
            Dialog dialog3 = this.f200307T0;
            if (dialog3 != null && dialog3.isShowing() && !mo95671T7()) {
                this.f200307T0.dismiss();
            }
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "send hb success!");
                C69233i2 i2Var = (C69233i2) yVar;
                this.f200304S0 = i2Var.f199206j;
                this.f200269B1 = i2Var.f199204h;
                if (i2Var.f199284f != null) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() NetScenePrepareNewYearLuckyMoney show JumpRemind Alert");
                    i2Var.f199284f.mo104783g(this, new LuckyMoneyNewYearSendUIV2$$g(this));
                    return true;
                }
                PayInfo payInfo2 = new PayInfo();
                payInfo2.f212592j = i2Var.f199205i;
                payInfo2.f212589g = this.f200310U0;
                if (mo95671T7()) {
                    payInfo2.f212587e = 78;
                    ((C76324c) C86312j.m106911c(cls)).startSNSPay(this, payInfo2);
                } else {
                    payInfo2.f212587e = 37;
                    C76331i.m91761e(getContext(), payInfo2, 1);
                }
                return true;
            } else if (i2 == 268502454) {
                C76879j.m92749t(this, str, "", new LuckyMoneyNewYearSendUIV2$$h(this, yVar));
                return true;
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyNewYearSendUIV2", "send hb failed!");
                this.f200311U1 = 2;
                if (TextUtils.isEmpty(str)) {
                    str = getString(C0966R.string.l_3);
                }
                setContentViewVisibility(4);
                C76879j.m92713G(this, str, (String) null, false, new C69625k2(this, this));
                return true;
            }
        } else if (yVar instanceof C42514c2) {
            return true;
        }
        return false;
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onStop");
        mo95679b8(true);
    }
}
