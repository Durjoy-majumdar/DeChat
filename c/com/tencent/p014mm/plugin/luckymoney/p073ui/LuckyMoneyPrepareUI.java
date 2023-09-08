package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a14.C0000n0;
import a14.C53930o0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import b42.C28255e;
import b63.C67175a;
import c42.C67339b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HKCashierJSApiPayResultEvent;
import com.tencent.p014mm.autogen.events.PayLoopInterruptEvent;
import com.tencent.p014mm.autogen.events.Show261AlertEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonDataStruct;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.luckymoney.model.C42514c2;
import com.tencent.p014mm.plugin.luckymoney.model.C42516e;
import com.tencent.p014mm.plugin.luckymoney.model.C42519p;
import com.tencent.p014mm.plugin.luckymoney.model.C42520s1;
import com.tencent.p014mm.plugin.luckymoney.model.C42521t1;
import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import com.tencent.p014mm.plugin.luckymoney.model.C69229h2;
import com.tencent.p014mm.plugin.luckymoney.model.C69230i;
import com.tencent.p014mm.plugin.luckymoney.model.C69239k1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69245l2;
import com.tencent.p014mm.plugin.luckymoney.model.C69247m1;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.model.C69258q;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.model.C69274y0;
import com.tencent.p014mm.plugin.luckymoney.model.C69275y1;
import com.tencent.p014mm.plugin.luckymoney.model.C69276z;
import com.tencent.p014mm.plugin.luckymoney.model.C69277z0;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69554a;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.plugin.wallet_core.utils.C72514w;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C30699x0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.model.C75122k;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7091p;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32226l;
import g32.C75846b;
import gc0.C20828a;
import go3.C8371g;
import h81.C32735h;
import hc0.C20937c;
import ht1.C60200t1;
import ie3.C76324c;
import ie3.C76331i;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l20.C21388a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import org.libpag.PAGView;
import p008bq.C67303a1;
import p008bq.C67305d1;
import p008bq.C67308r1;
import p248ug.C78158s0;
import p286zl.C16292g;
import p287zz.C79445i;
import p327ct.C30914c;
import p629ny.C76979h;
import qo3.C89779i0;
import r32.C47923d;
import rt3.C22252b;
import te3.C77933g43;
import te3.C77994sf2;
import te3.C78007w82;
import tl3.C78039a;
import ub3.C78144b;
import w32.C78509c;
import w32.C78512f;
import xb3.C15634g;
import yq3.C79144b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI */
public class LuckyMoneyPrepareUI extends LuckyMoneyBaseUI implements C69727y2, WcPayKeyboard.C75086f {

    /* renamed from: T1 */
    public static final String f200649T1 = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf7");

    /* renamed from: A */
    public TextView f200650A;

    /* renamed from: A1 */
    public WcPayKeyboard f200651A1;

    /* renamed from: B */
    public TextView f200652B;

    /* renamed from: B1 */
    public float f200653B1 = 0.0f;

    /* renamed from: C */
    public ImageView f200654C;

    /* renamed from: C1 */
    public float f200655C1;

    /* renamed from: D */
    public View f200656D;

    /* renamed from: D1 */
    public int f200657D1 = 1;

    /* renamed from: E */
    public PAGView f200658E;

    /* renamed from: E1 */
    public String f200659E1 = "";

    /* renamed from: F */
    public PAGView.PAGViewListener f200660F;

    /* renamed from: F1 */
    public IListener<PayLoopInterruptEvent> f200661F1;

    /* renamed from: G */
    public C0000n0 f200662G;

    /* renamed from: G1 */
    public final IListener f200663G1;

    /* renamed from: H */
    public boolean f200664H;

    /* renamed from: H1 */
    public int f200665H1;

    /* renamed from: I */
    public LinearLayout f200666I;

    /* renamed from: I1 */
    public String f200667I1;

    /* renamed from: J */
    public ImageView f200668J;

    /* renamed from: J1 */
    public int f200669J1;

    /* renamed from: K */
    public WeImageView f200670K;

    /* renamed from: K1 */
    public long f200671K1;

    /* renamed from: L */
    public TextView f200672L;

    /* renamed from: L1 */
    public long f200673L1;

    /* renamed from: M */
    public ViewGroup f200674M;

    /* renamed from: M1 */
    public String f200675M1;

    /* renamed from: N */
    public TextView f200676N;

    /* renamed from: N1 */
    public boolean f200677N1;

    /* renamed from: O1 */
    public boolean f200678O1;

    /* renamed from: P */
    public ViewGroup f200679P;

    /* renamed from: P1 */
    public boolean f200680P1;

    /* renamed from: Q */
    public TextView f200681Q;

    /* renamed from: Q0 */
    public int f200682Q0;

    /* renamed from: Q1 */
    public boolean f200683Q1;

    /* renamed from: R */
    public ImageView f200684R;

    /* renamed from: R0 */
    public C69273y f200685R0;

    /* renamed from: R1 */
    public IListener<Show261AlertEvent> f200686R1;

    /* renamed from: S */
    public TextView f200687S;

    /* renamed from: S0 */
    public C69230i f200688S0;

    /* renamed from: S1 */
    public int f200689S1;

    /* renamed from: T */
    public ViewGroup f200690T;

    /* renamed from: T0 */
    public String f200691T0;

    /* renamed from: U */
    public WeImageView f200692U;

    /* renamed from: U0 */
    public int f200693U0;

    /* renamed from: V */
    public TextView f200694V;

    /* renamed from: V0 */
    public MTimerHandler f200695V0 = null;

    /* renamed from: W */
    public WcPayBannerView f200696W;

    /* renamed from: W0 */
    public int f200697W0 = 1;

    /* renamed from: X */
    public C69631l1 f200698X = new C69631l1();

    /* renamed from: X0 */
    public String f200699X0 = C75228t.m90254k("CNY");

    /* renamed from: Y */
    public int f200700Y;

    /* renamed from: Y0 */
    public String f200701Y0 = null;

    /* renamed from: Z */
    public int f200702Z;

    /* renamed from: Z0 */
    public RealnameGuideHelper f200703Z0;

    /* renamed from: a1 */
    public String f200704a1 = "";

    /* renamed from: b1 */
    public String f200705b1;

    /* renamed from: c1 */
    public boolean f200706c1;

    /* renamed from: d1 */
    public String f200707d1;

    /* renamed from: e1 */
    public String f200708e1;

    /* renamed from: f1 */
    public String f200709f1;

    /* renamed from: g */
    public LuckyMoneyNumInputView f200710g = null;

    /* renamed from: g1 */
    public ChatFooterPanel f200711g1;

    /* renamed from: h */
    public LuckyMoneyMoneyInputView f200712h = null;

    /* renamed from: h1 */
    public C69554a f200713h1;

    /* renamed from: i */
    public LuckyMoneyTextInputView f200714i = null;

    /* renamed from: i1 */
    public ViewGroup f200715i1;

    /* renamed from: j */
    public TextView f200716j = null;

    /* renamed from: j1 */
    public View f200717j1;

    /* renamed from: k1 */
    public IEmojiInfo f200718k1;

    /* renamed from: l1 */
    public RedEnvSendWithEmoticonClickStruct f200719l1;

    /* renamed from: m1 */
    public RedEnvSendWithEmoticonDataStruct f200720m1;

    /* renamed from: n */
    public Button f200721n = null;

    /* renamed from: n1 */
    public int f200722n1;

    /* renamed from: o */
    public Button f200723o = null;

    /* renamed from: o1 */
    public int f200724o1 = 1;

    /* renamed from: p */
    public View f200725p;

    /* renamed from: p0 */
    public String f200726p0;

    /* renamed from: p1 */
    public int f200727p1 = 0;

    /* renamed from: q */
    public TextView f200728q;

    /* renamed from: q1 */
    public int f200729q1;

    /* renamed from: r */
    public Dialog f200730r = null;

    /* renamed from: r1 */
    public String f200731r1;

    /* renamed from: s */
    public Dialog f200732s = null;

    /* renamed from: s1 */
    public String f200733s1;

    /* renamed from: t */
    public Dialog f200734t = null;

    /* renamed from: t1 */
    public String f200735t1;

    /* renamed from: u */
    public View f200736u;

    /* renamed from: u1 */
    public boolean f200737u1 = false;

    /* renamed from: v */
    public View f200738v;

    /* renamed from: v1 */
    public boolean f200739v1;

    /* renamed from: w */
    public ViewGroup f200740w;

    /* renamed from: w1 */
    public boolean f200741w1 = false;

    /* renamed from: x */
    public MMScrollView f200742x;

    /* renamed from: x0 */
    public int f200743x0;

    /* renamed from: x1 */
    public boolean f200744x1 = false;

    /* renamed from: y */
    public TextView f200745y;

    /* renamed from: y0 */
    public boolean f200746y0;

    /* renamed from: y1 */
    public boolean f200747y1 = false;

    /* renamed from: z */
    public RelativeLayout f200748z;

    /* renamed from: z1 */
    public boolean f200749z1 = false;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$LuckyMoneyPrepareUIAccessibilityConfig */
    public static class LuckyMoneyPrepareUIAccessibilityConfig extends MMBaseAccessibilityConfig {
        public LuckyMoneyPrepareUIAccessibilityConfig(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.ghx);
            root.disable(C0966R.C0970id.ghq);
            root.disable(C0966R.C0970id.gj4);
            root.disable(C0966R.C0970id.gj5);
            root.disable(C0966R.C0970id.gfr);
            ViewSetter desc = root.view(C0966R.C0970id.gft).desc((int) C0966R.C0970id.gfu);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.gjm);
            root2.view(C0966R.C0970id.gj7).disable();
            root2.view(C0966R.C0970id.ge9).desc((int) C0966R.string.gem).type(viewType);
            root.view(C0966R.C0970id.get).desc((C32226l<? super View, String>) new C32226l<View, String>(this) {
                public Object invoke(Object obj) {
                    View view = (View) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(((TextView) view.findViewById(C0966R.C0970id.geu)).getText());
                    sb.append(((TextView) view.findViewById(C0966R.C0970id.gev)).getText());
                    return sb.toString();
                }
            }).type(viewType);
            root.view(C0966R.C0970id.geh).desc((C32226l<? super View, String>) new C32226l<View, String>(this) {
                public Object invoke(Object obj) {
                    View view = (View) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(((TextView) view.findViewById(C0966R.C0970id.gen)).getText());
                    sb.append(((TextView) view.findViewById(C0966R.C0970id.geo)).getText());
                    sb.append(((TextView) view.findViewById(C0966R.C0970id.gem)).getText());
                    return sb.toString();
                }
            }).type(viewType);
        }

        public void onResume() {
            super.onResume();
        }
    }

    public LuckyMoneyPrepareUI() {
        C40008f fVar = C40008f.f107254d;
        this.f200661F1 = new IListener<PayLoopInterruptEvent>(fVar) {
            {
                this.__eventId = 1264607315;
            }

            public boolean callback(IEvent iEvent) {
                if (1 != ((PayLoopInterruptEvent) iEvent).f193821d.f193822a) {
                    return false;
                }
                LuckyMoneyPrepareUI.this.finish();
                return false;
            }
        };
        this.f200663G1 = new IListener<HKCashierJSApiPayResultEvent>(fVar) {
            {
                this.__eventId = -1594159370;
            }

            public boolean callback(IEvent iEvent) {
                HKCashierJSApiPayResultEvent hKCashierJSApiPayResultEvent = (HKCashierJSApiPayResultEvent) iEvent;
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "hkCashierPayResultIListener callback");
                if (hKCashierJSApiPayResultEvent.f9311d.f9312a == 1) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "hkCashierPayResultIListener callback paysucc");
                    hKCashierJSApiPayResultEvent.f9311d.f9313b = 1;
                    C119179t tVar = C119157j.f356862d;
                    LuckyMoneyPrepareUI$2$$a luckyMoneyPrepareUI$2$$a = new LuckyMoneyPrepareUI$2$$a(this);
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(luckyMoneyPrepareUI$2$$a, 200, false);
                }
                LuckyMoneyPrepareUI.this.f200663G1.dead();
                return true;
            }
        };
        this.f200677N1 = false;
        this.f200678O1 = false;
        this.f200680P1 = false;
        this.f200683Q1 = false;
        this.f200686R1 = new IListener<Show261AlertEvent>(fVar) {
            {
                this.__eventId = -2016047906;
            }

            public boolean callback(IEvent iEvent) {
                Show261AlertEvent show261AlertEvent = (Show261AlertEvent) iEvent;
                Dialog dialog = LuckyMoneyPrepareUI.this.f200730r;
                if (dialog != null && dialog.isShowing()) {
                    LuckyMoneyPrepareUI.this.f200730r.dismiss();
                }
                final C67175a aVar = show261AlertEvent.f193934d.f193935a;
                if (aVar == null || !aVar.mo91283a()) {
                    return false;
                }
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "show 261 alert item");
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI.f200683Q1 = true;
                C76879j.m92707A(luckyMoneyPrepareUI.getContext(), aVar.f192844a, "", aVar.f192846c, aVar.f192845b, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "goto h5: %s", aVar.f192847d);
                        C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), aVar.f192847d, false);
                        LuckyMoneyPrepareUI.this.f200683Q1 = false;
                    }
                }, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        LuckyMoneyPrepareUI.this.f200683Q1 = false;
                    }
                });
                return false;
            }
        };
        this.f200689S1 = 0;
    }

    /* renamed from: J7 */
    public static void m81933J7(LuckyMoneyPrepareUI luckyMoneyPrepareUI, byte[] bArr, boolean z, boolean z2) {
        luckyMoneyPrepareUI.f200664H = true;
        Intent intent = new Intent(luckyMoneyPrepareUI.getContext(), LuckyMoneyPickEnvelopeUI.class);
        if (bArr != null && bArr.length > 0) {
            intent.putExtra("key_has_resp", true);
        }
        intent.putExtra("key_session_id", luckyMoneyPrepareUI.f200735t1);
        intent.putExtra("key_has_source", z);
        intent.putExtra("key_has_reddot", z2);
        intent.putExtra("key_exchange_title", luckyMoneyPrepareUI.f200731r1);
        intent.putExtra("key_exchange_url", luckyMoneyPrepareUI.f200733s1);
        luckyMoneyPrepareUI.startActivityForResult(intent, 5);
    }

    /* renamed from: K7 */
    public static void m81934K7(LuckyMoneyPrepareUI luckyMoneyPrepareUI) {
        int i;
        luckyMoneyPrepareUI.getClass();
        RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
        luckyMoneyPrepareUI.f200719l1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f194328d = 3;
        redEnvSendWithEmoticonClickStruct.mo86054n();
        luckyMoneyPrepareUI.hideTenpayKB();
        luckyMoneyPrepareUI.hideVKB();
        luckyMoneyPrepareUI.f200713h1.show();
        if (Util.isEqual(luckyMoneyPrepareUI.f200722n1, 1)) {
            int i2 = ChatFooterPanel.f211589f;
            i = 10;
        } else {
            int i3 = ChatFooterPanel.f211589f;
            i = 7;
        }
        C67339b.m79677b(luckyMoneyPrepareUI.f200715i1, luckyMoneyPrepareUI.f200711g1, i, new C78158s0.C78159a() {
            /* renamed from: a */
            public void mo68482a(IEmojiInfo iEmojiInfo) {
                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
                LuckyMoneyPrepareUI.this.f200718k1 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(iEmojiInfo.getMd5());
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                luckyMoneyPrepareUI.mo95776Y7(luckyMoneyPrepareUI.f200718k1);
                onHide();
            }

            public void onHide() {
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                C67339b.m79676a(luckyMoneyPrepareUI, luckyMoneyPrepareUI.f200711g1);
                luckyMoneyPrepareUI.f200713h1.dismiss();
            }
        });
    }

    /* renamed from: L7 */
    public final boolean mo95762L7() {
        C69273y yVar = this.f200685R0;
        return yVar != null && !Util.isNullOrNil(yVar.f199383s);
    }

    /* renamed from: M7 */
    public final void mo95763M7(String str) {
        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "do business callback");
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            doSceneProgress(new C42521t1(this.f200704a1, str, this.f200705b1), false);
        } else {
            doSceneProgress(new C42520s1(this.f200704a1, str, this.f200705b1), false);
        }
    }

    /* renamed from: N7 */
    public final void mo95764N7() {
        Dialog dialog = this.f200730r;
        if (dialog != null) {
            dialog.show();
            return;
        }
        Dialog e = C75197d0.m90164e(getContext(), true, new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                Dialog dialog = LuckyMoneyPrepareUI.this.f200730r;
                if (dialog != null && dialog.isShowing()) {
                    LuckyMoneyPrepareUI.this.f200730r.dismiss();
                }
                if (LuckyMoneyPrepareUI.this.getContentView().getVisibility() == 8 || LuckyMoneyPrepareUI.this.getContentView().getVisibility() == 4) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
                    LuckyMoneyPrepareUI.this.finish();
                }
                LuckyMoneyPrepareUI.this.forceCancel();
            }
        });
        this.f200730r = e;
        e.setCancelable(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ec  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95765O7(boolean r12) {
        /*
            r11 = this;
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_HAS_SOURCE_INT_SYNC
            java.lang.String r1 = "MicroMsg.LuckyMoneyPrepareUI"
            java.lang.String r2 = "do get config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r12 == 0) goto L_0x002a
            androidx.appcompat.app.AppCompatActivity r3 = r11.getContext()
            java.util.HashMap<java.lang.String, java.lang.Long> r12 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.f199264a
            r12 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r7 = r3.getString(r12)
            com.tencent.mm.plugin.luckymoney.model.m1 r10 = new com.tencent.mm.plugin.luckymoney.model.m1
            r10.<init>()
            r4 = 0
            r5 = 3
            r6 = 2131886550(0x7f1201d6, float:1.9407682E38)
            r8 = 1
            r9 = 0
            qo3.i0 r12 = nj3.C76879j.m92721O(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f200732s = r12
        L_0x002a:
            r12 = 1
            r11.f200678O1 = r12
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r2 = "key_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            boolean r1 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81609o(r1)
            java.lang.String r3 = "v1.0"
            r4 = 0
            if (r1 == 0) goto L_0x006b
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r12 = r12.mo119685f(r0, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.f200729q1 = r12
            com.tencent.mm.plugin.luckymoney.model.x1 r0 = new com.tencent.mm.plugin.luckymoney.model.x1
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r1 = r1.getStringExtra(r2)
            r0.<init>(r3, r12, r1)
            r11.doSceneProgress(r0, r4)
            goto L_0x00fc
        L_0x006b:
            int r1 = r11.f200682Q0
            r5 = 3
            if (r1 != r5) goto L_0x0093
            f40.o r12 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r12 = r12.mo121142i()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r12 = r12.mo119685f(r0, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.f200729q1 = r12
            w32.a r0 = new w32.a
            r1 = 23
            r0.<init>(r1, r3, r12)
            r11.doSceneProgress(r0, r4)
            goto L_0x00fc
        L_0x0093:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.mo119685f(r0, r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11.f200729q1 = r0
            int r1 = r11.f200682Q0
            if (r1 == r12) goto L_0x00b6
            r12 = 2
            if (r1 == r12) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            r12 = 24
            goto L_0x00cd
        L_0x00b6:
            int r1 = r11.f200702Z
            if (r1 == r12) goto L_0x00cc
            r12 = 9
            if (r1 == r12) goto L_0x00c2
            r12 = 11
            if (r1 != r12) goto L_0x00c9
        L_0x00c2:
            boolean r12 = r11.mo95771T7()
            if (r12 == 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            r12 = 25
            goto L_0x00cd
        L_0x00cc:
            r12 = 0
        L_0x00cd:
            java.lang.Class<zz.i> r1 = p287zz.C79445i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            zz.i r1 = (p287zz.C79445i) r1
            boolean r1 = r1.mo109188ae()
            if (r1 == 0) goto L_0x00ec
            w32.f r12 = new w32.f
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r0 = r0.getStringExtra(r2)
            r12.<init>(r0)
            r11.doSceneProgress(r12, r4)
            goto L_0x00fc
        L_0x00ec:
            com.tencent.mm.plugin.luckymoney.model.w1 r1 = new com.tencent.mm.plugin.luckymoney.model.w1
            android.content.Intent r5 = r11.getIntent()
            java.lang.String r2 = r5.getStringExtra(r2)
            r1.<init>(r12, r3, r0, r2)
            r11.doSceneProgress(r1, r4)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.mo95765O7(boolean):void");
    }

    /* renamed from: P7 */
    public final void mo95766P7(int i, Intent intent) {
        C42514c2 c2Var;
        String stringExtra = getIntent().getStringExtra("key_username");
        String s = C75592q0.m90789s();
        if (i == -1) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode == RESULT_OK");
            this.f200689S1 = 1;
            c2Var = new C42514c2(this.f200704a1, this.f200707d1, 1, s, Util.nullAsNil(stringExtra));
        } else {
            if (intent != null) {
                this.f200689S1 = intent.getIntExtra("key_pay_reslut_type", 3);
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "doNetSceneLuckyMoneyReport() data == null");
                this.f200689S1 = 3;
            }
            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult() resultCode != RESULT_OK  payType:%s", Integer.valueOf(this.f200689S1));
            c2Var = new C42514c2(this.f200704a1, this.f200707d1, this.f200689S1, s, Util.nullAsNil(stringExtra));
        }
        C86709a0.m107529k().f251779b.mo123460f(c2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0.f200709f1) != false) goto L_0x0102;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95263Q(boolean r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            android.content.Intent r1 = r18.getIntent()
            java.lang.String r2 = "key_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            boolean r1 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81609o(r1)
            r2 = 3
            if (r1 == 0) goto L_0x0022
            g32.b r1 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.k1 r1 = r1.yx0()
            com.tencent.mm.plugin.luckymoney.model.y r1 = r1.mo95393a()
            r0.f200685R0 = r1
            goto L_0x006a
        L_0x0022:
            int r1 = r0.f200682Q0
            if (r1 != r2) goto L_0x003a
            g32.b r1 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.z0 r1 = r1.xx0()
            com.tencent.mm.plugin.luckymoney.model.y r3 = r1.f199395a
            if (r3 != 0) goto L_0x0035
            r1.mo95416a()
        L_0x0035:
            com.tencent.mm.plugin.luckymoney.model.y r1 = r1.f199395a
            r0.f200685R0 = r1
            goto L_0x006a
        L_0x003a:
            java.lang.Class<zz.i> r1 = p287zz.C79445i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            zz.i r1 = (p287zz.C79445i) r1
            boolean r1 = r1.mo109188ae()
            if (r1 == 0) goto L_0x005c
            g32.b r1 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.y0 r1 = r1.wx0()
            com.tencent.mm.plugin.luckymoney.model.y r3 = r1.f199391a
            if (r3 != 0) goto L_0x0057
            r1.mo95412a()
        L_0x0057:
            com.tencent.mm.plugin.luckymoney.model.y r1 = r1.f199391a
            r0.f200685R0 = r1
            goto L_0x006a
        L_0x005c:
            g32.b r1 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.z r1 = r1.vx0()
            com.tencent.mm.plugin.luckymoney.model.y r1 = r1.mo95413a()
            r0.f200685R0 = r1
        L_0x006a:
            int r1 = r0.f200700Y
            r3 = 0
            java.lang.String r5 = ""
            r6 = 2
            if (r1 != r2) goto L_0x008b
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f200712h
            int r1 = r1.mo5753c()
            if (r1 == r2) goto L_0x008b
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f200712h
            double r7 = r1.getInput()
            java.lang.String r1 = r0.f200709f1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0105
            goto L_0x0102
        L_0x008b:
            int r1 = r0.f200700Y
            if (r1 == r2) goto L_0x0104
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f200712h
            int r1 = r1.mo5753c()
            if (r1 == r2) goto L_0x0104
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f200710g
            int r1 = r1.mo5753c()
            if (r1 == r2) goto L_0x0104
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f200710g
            int r1 = r1.getInput()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r7 = r0.f200712h
            double r7 = r7.getInput()
            int r9 = r0.f200700Y
            if (r9 != 0) goto L_0x00b9
            double r9 = (double) r1
            double r7 = r7 * r9
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f200712h
            double r9 = r1.getInput()
            goto L_0x0106
        L_0x00b9:
            if (r1 <= 0) goto L_0x0102
            int r9 = r0.f200682Q0
            boolean r9 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r9)
            if (r9 == 0) goto L_0x00d0
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f200685R0
            int r9 = r9.f199388x
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r9 = r9.length()
            goto L_0x00dc
        L_0x00d0:
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f200685R0
            int r9 = r9.f199371d
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r9 = r9.length()
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r5)
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            int r9 = r9 + r6
            java.math.RoundingMode r11 = java.math.RoundingMode.HALF_UP
            double r9 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90250i(r10, r1, r9, r11)
            goto L_0x0106
        L_0x0102:
            r9 = r3
            goto L_0x0106
        L_0x0104:
            r7 = r3
        L_0x0105:
            r9 = r7
        L_0x0106:
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f200698X
            boolean r11 = r1.f201002b
            r12 = r19
            r13 = r20
            boolean r1 = r1.mo95866a(r13, r12)
            java.lang.String r12 = "MicroMsg.LuckyMoneyPrepareUI"
            r13 = 1
            if (r1 == 0) goto L_0x0131
            java.lang.String r1 = "has error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            int r1 = r0.f200700Y
            if (r1 != r2) goto L_0x0125
            r0.mo95773V7(r13, r7, r11)
            goto L_0x0459
        L_0x0125:
            if (r1 != 0) goto L_0x012c
            r0.mo95773V7(r13, r9, r11)
            goto L_0x0459
        L_0x012c:
            r0.mo95773V7(r6, r7, r11)
            goto L_0x0459
        L_0x0131:
            int r1 = r0.f200682Q0
            boolean r1 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r1)
            if (r1 == 0) goto L_0x013e
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            double r14 = r1.f199370A
            goto L_0x0142
        L_0x013e:
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            double r14 = r1.f199372e
        L_0x0142:
            r1 = 0
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 == 0) goto L_0x044a
            int r16 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r16 != 0) goto L_0x014d
            goto L_0x044a
        L_0x014d:
            int r17 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0187
            int r17 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x0187
            com.tencent.mm.plugin.luckymoney.ui.l1 r2 = r0.f200698X
            r3 = 2131832550(0x7f112ee6, float:1.9298157E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            long r14 = java.lang.Math.round(r14)
            r9.append(r14)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r4[r1] = r9
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            java.lang.String r1 = r1.f199381q
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            r4[r13] = r1
            java.lang.String r1 = r0.getString(r3, r4)
            r2.mo95869d(r1)
            r0.mo95773V7(r6, r7, r11)
            goto L_0x044a
        L_0x0187:
            if (r16 <= 0) goto L_0x0447
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "perAmount "
            r14.append(r15)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)
            int r14 = r0.f200682Q0
            boolean r14 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r14)
            if (r14 == 0) goto L_0x01aa
            com.tencent.mm.plugin.luckymoney.model.y r14 = r0.f200685R0
            double r14 = r14.f199389y
            goto L_0x01ae
        L_0x01aa:
            com.tencent.mm.plugin.luckymoney.model.y r14 = r0.f200685R0
            double r14 = r14.f199375h
        L_0x01ae:
            int r6 = r0.f200700Y
            r13 = 2131832486(0x7f112ea6, float:1.9298027E38)
            if (r6 != 0) goto L_0x022b
            int r6 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r6 <= 0) goto L_0x0351
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x0351
            boolean r3 = r18.mo95762L7()
            if (r3 == 0) goto L_0x01f7
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199383s
            r4[r1] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            long r14 = java.lang.Math.round(r14)
            r6.append(r14)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r14 = 1
            r4[r14] = r6
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199381q
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r14 = 2
            r4[r14] = r6
            java.lang.String r4 = r0.getString(r13, r4)
            r3.mo95869d(r4)
            r13 = 1
            goto L_0x0226
        L_0x01f7:
            r3 = 2
            com.tencent.mm.plugin.luckymoney.ui.l1 r4 = r0.f200698X
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r13 = java.lang.Math.round(r14)
            r3.append(r13)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r6[r1] = r3
            com.tencent.mm.plugin.luckymoney.model.y r3 = r0.f200685R0
            java.lang.String r3 = r3.f199381q
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r5)
            r13 = 1
            r6[r13] = r3
            r3 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r3 = r0.getString(r3, r6)
            r4.mo95869d(r3)
        L_0x0226:
            r0.mo95773V7(r13, r9, r11)
            goto L_0x034f
        L_0x022b:
            if (r6 == r2) goto L_0x0351
            int r6 = r0.f200682Q0
            boolean r6 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r6)
            if (r6 == 0) goto L_0x02c3
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            double r14 = r6.f199389y
            int r17 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0351
            int r17 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x0351
            java.lang.String r3 = r6.f199383s
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0281
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199383s
            r4[r1] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r14 = r0.f200685R0
            double r14 = r14.f199389y
            long r14 = java.lang.Math.round(r14)
            r6.append(r14)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r14 = 1
            r4[r14] = r6
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199381q
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r14 = 2
            r4[r14] = r6
            java.lang.String r4 = r0.getString(r13, r4)
            r3.mo95869d(r4)
            r13 = 1
            goto L_0x02b4
        L_0x0281:
            r14 = 2
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r13 = r0.f200685R0
            double r13 = r13.f199389y
            long r13 = java.lang.Math.round(r13)
            r6.append(r13)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r4[r1] = r6
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199381q
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r13 = 1
            r4[r13] = r6
            r6 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r4 = r0.getString(r6, r4)
            r3.mo95869d(r4)
        L_0x02b4:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r3 = r0.f200710g
            r3.mo5751a()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r3 = r0.f200712h
            r3.mo5751a()
            r0.mo95773V7(r13, r9, r11)
            goto L_0x034f
        L_0x02c3:
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            double r14 = r6.f199376i
            int r17 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0351
            int r17 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x0351
            java.lang.String r3 = r6.f199383s
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x030f
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199383s
            r4[r1] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r14 = r0.f200685R0
            double r14 = r14.f199376i
            long r14 = java.lang.Math.round(r14)
            r6.append(r14)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r14 = 1
            r4[r14] = r6
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199381q
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r14 = 2
            r4[r14] = r6
            java.lang.String r4 = r0.getString(r13, r4)
            r3.mo95869d(r4)
            r13 = 1
            goto L_0x0342
        L_0x030f:
            r14 = 2
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r4 = new java.lang.Object[r14]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r13 = r0.f200685R0
            double r13 = r13.f199376i
            long r13 = java.lang.Math.round(r13)
            r6.append(r13)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r4[r1] = r6
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r6 = r6.f199381q
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r5)
            r13 = 1
            r4[r13] = r6
            r6 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r4 = r0.getString(r6, r4)
            r3.mo95869d(r4)
        L_0x0342:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r3 = r0.f200710g
            r3.mo5751a()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r3 = r0.f200712h
            r3.mo5751a()
            r0.mo95773V7(r13, r9, r11)
        L_0x034f:
            r14 = 1
            goto L_0x0352
        L_0x0351:
            r14 = 0
        L_0x0352:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "furtherCheckHasErr:"
            r3.append(r4)
            r3.append(r14)
            java.lang.String r6 = " for max value"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)
            if (r14 != 0) goto L_0x042e
            int r3 = r0.f200682Q0
            boolean r3 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r3)
            if (r3 == 0) goto L_0x037a
            com.tencent.mm.plugin.luckymoney.model.y r3 = r0.f200685R0
            double r1 = r3.f199390z
            goto L_0x037e
        L_0x037a:
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            double r1 = r1.f199377j
        L_0x037e:
            int r3 = r0.f200700Y
            r11 = 2131832488(0x7f112ea8, float:1.9298031E38)
            r13 = 2131832487(0x7f112ea7, float:1.929803E38)
            if (r3 != 0) goto L_0x03d7
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x042e
            boolean r3 = r18.mo95762L7()
            if (r3 == 0) goto L_0x03b8
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f200685R0
            java.lang.String r9 = r9.f199383s
            r10 = 0
            r6[r10] = r9
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r1)
            r2 = 1
            r6[r2] = r1
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            java.lang.String r1 = r1.f199381q
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            r9 = 2
            r6[r9] = r1
            java.lang.String r1 = r0.getString(r11, r6)
            r3.mo95869d(r1)
            goto L_0x042c
        L_0x03b8:
            r9 = 2
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f200698X
            java.lang.Object[] r6 = new java.lang.Object[r9]
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r1)
            r2 = 0
            r6[r2] = r1
            com.tencent.mm.plugin.luckymoney.model.y r1 = r0.f200685R0
            java.lang.String r1 = r1.f199381q
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r5)
            r2 = 1
            r6[r2] = r1
            java.lang.String r1 = r0.getString(r13, r6)
            r3.mo95869d(r1)
            goto L_0x042c
        L_0x03d7:
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x042e
            boolean r1 = r18.mo95762L7()
            java.lang.String r2 = "0.01"
            if (r1 == 0) goto L_0x0408
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f200698X
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.tencent.mm.plugin.luckymoney.model.y r6 = r0.f200685R0
            java.lang.String r9 = r6.f199383s
            r10 = 0
            r3[r10] = r9
            r9 = 1
            r3[r9] = r2
            java.lang.String r2 = r6.f199381q
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r5)
            r6 = 2
            r3[r6] = r2
            java.lang.String r2 = r0.getString(r11, r3)
            r1.mo95869d(r2)
            goto L_0x0422
        L_0x0408:
            r6 = 2
            r10 = 0
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f200698X
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r10] = r2
            com.tencent.mm.plugin.luckymoney.model.y r2 = r0.f200685R0
            java.lang.String r2 = r2.f199381q
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r5)
            r5 = 1
            r3[r5] = r2
            java.lang.String r2 = r0.getString(r13, r3)
            r1.mo95869d(r2)
        L_0x0422:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f200710g
            r1.mo5751a()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f200712h
            r1.mo5751a()
        L_0x042c:
            r1 = 1
            goto L_0x042f
        L_0x042e:
            r1 = r14
        L_0x042f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r3 = " for min value"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            goto L_0x044b
        L_0x0447:
            r10 = 0
            r1 = 0
            goto L_0x044b
        L_0x044a:
            r1 = 1
        L_0x044b:
            if (r1 == 0) goto L_0x044e
            goto L_0x0459
        L_0x044e:
            android.widget.Button r1 = r0.f200721n
            r2 = 1
            r1.setClickable(r2)
            android.widget.Button r1 = r0.f200721n
            r1.setEnabled(r2)
        L_0x0459:
            java.lang.String r1 = r0.f200699X0
            r0.mo95774W7(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.mo95263Q(boolean, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0101  */
    /* renamed from: Q7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95767Q7(int r26) {
        /*
            r25 = this;
            r9 = r25
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r8 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r1[r8] = r2
            java.lang.String r2 = "MicroMsg.LuckyMoneyPrepareUI"
            java.lang.String r4 = "doPrePareBtnClick() userConfirmJump:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4[r8] = r6
            r4[r0] = r3
            r7 = 2
            r4[r7] = r3
            int r3 = r25.mo95770S7()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 3
            r4[r10] = r3
            r4[r5] = r6
            r3 = 11701(0x2db5, float:1.6397E-41)
            r1.mo160131h(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            int r4 = r9.f200697W0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r0] = r4
            r4 = 15511(0x3c97, float:2.1736E-41)
            r1.mo160131h(r4, r3)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r9.f200712h
            int r1 = r1.mo5753c()
            if (r1 == 0) goto L_0x0067
            androidx.appcompat.app.AppCompatActivity r0 = r25.getContext()
            r1 = 2131838844(0x7f11477c, float:1.9310923E38)
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r1, (int) r8)
            r0.show()
            goto L_0x01f4
        L_0x0067:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r9.f200710g
            int r12 = r1.getInput()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r9.f200712h
            double r3 = r1.getInput()
            r13 = 0
            int r1 = r9.f200700Y
            if (r1 != r0) goto L_0x0098
            long r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90269r0(r3)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r6 = 356354(0x57002, float:4.99358E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r1.mo119676J(r6, r11)
        L_0x0092:
            r23 = r3
            r3 = r13
            r13 = r23
            goto L_0x00bf
        L_0x0098:
            if (r1 != r10) goto L_0x009f
            long r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90269r0(r3)
            goto L_0x0092
        L_0x009f:
            double r13 = (double) r12
            double r13 = r13 * r3
            long r13 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90269r0(r13)
            long r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90269r0(r3)
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            r6 = 356353(0x57001, float:4.99357E-40)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r1.mo119676J(r6, r11)
        L_0x00bf:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView r1 = r9.f200714i
            java.lang.String r1 = r1.getInput()
            java.lang.String r6 = "\r"
            java.lang.String r11 = ""
            java.lang.String r1 = r1.replace(r6, r11)
            java.lang.String r6 = "\n"
            java.lang.String r1 = r1.replace(r6, r11)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 == 0) goto L_0x00eb
            java.lang.String r1 = r9.f200701Y0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00e9
            r1 = 2131832362(0x7f112e2a, float:1.9297776E38)
            java.lang.String r1 = r9.getString(r1)
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r1 = r9.f200701Y0
        L_0x00eb:
            r15 = r1
            r25.hideTenpayKB()
            int r1 = r9.f200682Q0
            if (r1 != r7) goto L_0x0101
            r32.d r0 = new r32.d
            int r1 = (int) r13
            int r2 = r9.f200700Y
            int r4 = (int) r3
            r0.<init>(r12, r1, r2, r4)
            r9.doSceneProgress(r0, r8)
            goto L_0x01f1
        L_0x0101:
            android.content.Intent r1 = r25.getIntent()
            java.lang.String r6 = "key_username"
            java.lang.String r6 = r1.getStringExtra(r6)
            int r1 = r9.f200697W0
            if (r1 != r0) goto L_0x0189
            java.lang.Object[] r1 = new java.lang.Object[r5]
            boolean r5 = r9.f200677N1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r8] = r5
            java.lang.String r5 = r9.f200707d1
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r1[r0] = r5
            boolean r5 = r9.f200678O1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r7] = r5
            boolean r5 = r9.f200680P1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r10] = r5
            java.lang.String r5 = "doPrePareBtnClick() ifGetConfig=%s mUniqueId=%s waitingGetConfig=%s ifAutoRMBPrePareBtn=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            boolean r1 = r9.f200677N1
            if (r1 == 0) goto L_0x0148
            r0 = r25
            r1 = r26
            r2 = r6
            r10 = r3
            r3 = r12
            r4 = r13
            r6 = r10
            r8 = r15
            r0.mo95769R7(r1, r2, r3, r4, r6, r8)
            goto L_0x0183
        L_0x0148:
            r10 = r3
            r9.f200680P1 = r0
            r3 = r26
            r9.f200665H1 = r3
            r9.f200667I1 = r6
            r9.f200669J1 = r12
            r9.f200671K1 = r13
            r9.f200673L1 = r10
            r9.f200675M1 = r15
            android.app.Dialog r0 = r9.f200734t
            if (r0 == 0) goto L_0x0161
            r0.show()
            goto L_0x017c
        L_0x0161:
            r1 = 0
            r2 = 3
            r3 = 2131886550(0x7f1201d6, float:1.9407682E38)
            r0 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r4 = r9.getString(r0)
            r5 = 1
            r6 = 1
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$13 r7 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$13
            r7.<init>()
            r0 = r25
            qo3.i0 r0 = nj3.C76879j.m92721O(r0, r1, r2, r3, r4, r5, r6, r7)
            r9.f200734t = r0
        L_0x017c:
            boolean r0 = r9.f200678O1
            if (r0 != 0) goto L_0x0183
            r9.mo95765O7(r8)
        L_0x0183:
            com.tencent.mm.sdk.event.IListener r0 = r9.f200663G1
            r0.dead()
            return
        L_0x0189:
            r10 = r3
            r3 = r26
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r4[r0] = r1
            java.lang.String r0 = "currency=%s userConfiremJump:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            r0 = 1647(0x66f, float:2.308E-42)
            r9.addSceneEndListener(r0)
            com.tencent.mm.sdk.event.IListener r0 = r9.f200663G1
            r0.alive()
            boolean r0 = r9.f200746y0
            if (r0 == 0) goto L_0x01d1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r0 != 0) goto L_0x01d1
            com.tencent.mm.plugin.luckymoney.model.y1 r0 = new com.tencent.mm.plugin.luckymoney.model.y1
            int r1 = r9.f200700Y
            java.lang.String r20 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81601g()
            java.lang.String r21 = eb0.C75592q0.m90789s()
            int r2 = r9.f200697W0
            r3 = r10
            r11 = r0
            r5 = r15
            r15 = r3
            r17 = r1
            r18 = r5
            r19 = r6
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r18, r19, r20, r21, r22)
            goto L_0x01ee
        L_0x01d1:
            r3 = r10
            r5 = r15
            com.tencent.mm.plugin.luckymoney.model.y1 r0 = new com.tencent.mm.plugin.luckymoney.model.y1
            int r1 = r9.f200700Y
            r19 = 0
            java.lang.String r20 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81601g()
            java.lang.String r21 = eb0.C75592q0.m90789s()
            int r2 = r9.f200697W0
            r11 = r0
            r15 = r3
            r17 = r1
            r18 = r5
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r18, r19, r20, r21, r22)
        L_0x01ee:
            r9.doSceneProgress(r0, r8)
        L_0x01f1:
            r25.mo95764N7()
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.mo95767Q7(int):void");
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        if (f > 0.0f && this.f200653B1 <= 0.0f) {
            this.f200653B1 = f;
        }
        if (f <= 0.0f && this.f200653B1 > 0.0f) {
            this.f200653B1 = f;
            C115669n.INSTANCE.mo160131h(25925, 6, Integer.valueOf(this.f200657D1), Float.valueOf(this.f200655C1), this.f200712h.getEditText().getText(), this.f200710g.getEditText().getText());
        }
    }

    /* renamed from: R7 */
    public final void mo95769R7(int i, String str, int i2, long j, long j2, String str2) {
        int i3;
        String str3;
        C69224g2 g2Var;
        C69229h2 h2Var;
        IEmojiInfo iEmojiInfo = this.f200718k1;
        String str4 = "";
        if (iEmojiInfo != null) {
            str3 = iEmojiInfo.getMd5();
            i3 = this.f200718k1.getType();
        } else {
            str3 = str4;
            i3 = 0;
        }
        C69230i iVar = this.f200688S0;
        if (iVar != null) {
            str4 = iVar.f199198b;
        }
        Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "currency is RMB. userConfirmJump:%s lastPayResult:%s mSendId:%s mUniqueId:%s", Integer.valueOf(i), Integer.valueOf(this.f200689S1), this.f200704a1, this.f200707d1);
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "doRMBPrePareBtnClick use rtx luckmoney");
            if (!this.f200746y0 || Util.isNullOrNil(str)) {
                h2Var = new C69229h2(i2, j, j2, this.f200700Y, str2, C69242l1.m81601g(), (String) null, (String) null, C75592q0.m90789s(), C75592q0.m90783m(), this.f200702Z, str4, this.f200707d1, i, this.f200689S1, this.f200704a1, str3, i3);
            } else {
                h2Var = new C69229h2(i2, j, j2, this.f200700Y, str2, C69242l1.m81601g(), str, C69242l1.m81602h(str), C75592q0.m90789s(), C75592q0.m90783m(), this.f200702Z, str4, this.f200707d1, i, this.f200689S1, this.f200704a1, str3, i3);
            }
            doSceneProgress(h2Var, false);
        } else if (this.f200682Q0 == 3) {
            int i4 = i2;
            long j3 = j;
            long j4 = j2;
            String str5 = str2;
            String str6 = str;
            String str7 = str4;
            int i5 = i;
            doSceneProgress(new C78509c(i4, j3, j4, this.f200700Y, str5, C69242l1.m81601g(), str6, C69242l1.m81602h(str), C75592q0.m90789s(), C75592q0.m90783m(), this.f200702Z, str7, this.f200707d1, i5, this.f200689S1, this.f200704a1, str3, i3, this.f200709f1, getIntent().getStringExtra("key_live_id"), getIntent().getStringExtra("key_live_attach"), getIntent().getIntExtra("key_live_anchor_type", 0)), false);
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "doRMBPrePareBtnClick use normal luckmoney");
            if (!this.f200746y0 || Util.isNullOrNil(str)) {
                g2Var = new C69224g2(i2, j, j2, this.f200700Y, str2, C69242l1.m81601g(), (String) null, (String) null, C75592q0.m90789s(), C75592q0.m90783m(), this.f200702Z, str4, this.f200707d1, i, this.f200689S1, this.f200704a1, str3, i3, this.f200709f1);
            } else {
                g2Var = new C69224g2(i2, j, j2, this.f200700Y, str2, C69242l1.m81601g(), str, C69242l1.m81602h(str), C75592q0.m90789s(), C75592q0.m90783m(), this.f200702Z, str4, this.f200707d1, i, this.f200689S1, this.f200704a1, str3, i3, this.f200709f1);
            }
            doSceneProgress(g2Var, false);
        }
        if (!Util.isNullOrNil(str4)) {
            C115669n.INSTANCE.mo175911u(991, 11);
        }
        mo95764N7();
    }

    /* renamed from: S7 */
    public final int mo95770S7() {
        if (this.f200746y0) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    /* renamed from: T7 */
    public final boolean mo95771T7() {
        return this.f200746y0 && getIntent().getIntExtra("key_chatroom_num", 0) > 0;
    }

    /* renamed from: U7 */
    public void mo95772U7(int i, Intent intent) {
        C77994sf2 sf22;
        C77994sf2 sf23;
        Intent intent2 = intent;
        C69230i iVar = this.f200688S0;
        if (!(iVar == null || (sf23 = iVar.f199197a) == null)) {
            C115669n.INSTANCE.kvStat(22296, sf23.f228202f);
        }
        if (intent2 != null && intent2.hasExtra("key_realname_guide_helper")) {
            this.f200703Z0 = (RealnameGuideHelper) intent2.getParcelableExtra("key_realname_guide_helper");
        }
        if (i == -1) {
            String str = "";
            mo95763M7(intent2 != null ? intent2.getStringExtra("key_trans_id") : str);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95770S7()), 5);
            String stringExtra = getIntent().getStringExtra("key_username");
            if ((!this.f200746y0 || Util.isNullOrNil(stringExtra)) && this.f200682Q0 != 3) {
                mo95517H7();
                View findViewById = findViewById(C0966R.C0970id.ghw);
                View view = this.f200736u;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onResultPay", "(ILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onResultPay", "(ILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C69242l1.m81613s(findViewById, (Animation.AnimationListener) null);
                this.f200723o.setOnClickListener(new C7089c0() {
                    /* renamed from: a */
                    public void mo2066a(View view) {
                        C115669n nVar = C115669n.INSTANCE;
                        LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                        String str = LuckyMoneyPrepareUI.f200649T1;
                        nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(luckyMoneyPrepareUI.mo95770S7()), 6);
                        LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = LuckyMoneyPrepareUI.this;
                        C69242l1.m81603i(luckyMoneyPrepareUI2, 2, luckyMoneyPrepareUI2.f200700Y, luckyMoneyPrepareUI2.f200743x0, true);
                        LuckyMoneyPrepareUI.this.f200736u.postDelayed(new Runnable() {
                            public void run() {
                                View view = LuckyMoneyPrepareUI.this.f200736u;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$43$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$43$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                LuckyMoneyPrepareUI.this.mo95518I7();
                            }
                        }, 100);
                    }
                });
                ((ImageView) findViewById(C0966R.C0970id.ghn)).setOnClickListener(new C7089c0() {
                    /* renamed from: a */
                    public void mo2066a(View view) {
                        View view2 = LuckyMoneyPrepareUI.this.f200736u;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$44", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$44", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        LuckyMoneyPrepareUI.this.mo95518I7();
                    }
                });
                mo95766P7(i, intent);
                return;
            }
            C76879j.m92726T(this, getString(C0966R.string.fjh));
            Map<String, String> parseXml = XmlParser.parseXml(this.f200691T0, "msg", (String) null);
            if (parseXml == null) {
                Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                finish();
                return;
            }
            String str2 = parseXml.get(".msg.appmsg.wcpayinfo.paymsgid");
            if (C75846b.zx0().Bx0().mo57182a(str2)) {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                if (!C69242l1.m81614t(this.f200691T0, stringExtra, 1)) {
                    Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                    C75846b.zx0().Bx0().mo57183b(str2);
                }
            } else {
                Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
            }
            mo95766P7(i, intent);
            C28255e eVar = new C28255e();
            eVar.field_send_id = str2;
            if (!C75846b.zx0().Ax0().get(eVar, new String[0])) {
                eVar.field_open_count = 0;
                Log.m105919d("MicroMsg.LuckyMoneyPrepareUI", "insert record: %s, %s", str2, Boolean.valueOf(C75846b.zx0().Ax0().insert(eVar)));
            }
            if (mo95771T7()) {
                C75846b.f222485q = this.f200700Y;
            }
            if (this.f200741w1) {
                if (this.f200744x1) {
                    nVar.mo160131h(22237, 4);
                } else if (this.f200700Y != 1) {
                    nVar.mo160131h(22237, 3);
                }
            }
            RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct = new RedEnvSendWithEmoticonDataStruct();
            this.f200720m1 = redEnvSendWithEmoticonDataStruct;
            redEnvSendWithEmoticonDataStruct.f156788d = (long) this.f200724o1;
            IEmojiInfo iEmojiInfo = this.f200718k1;
            String md5 = iEmojiInfo == null ? str : iEmojiInfo.getMd5();
            RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct2 = this.f200720m1;
            redEnvSendWithEmoticonDataStruct2.f156789e = redEnvSendWithEmoticonDataStruct2.mo86045b("emoticonMd5", md5, true);
            this.f200720m1.mo86054n();
            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "Report RedEnvSendWithEmoticonDataStruct, Scene: %d, md5: %s", Integer.valueOf(this.f200724o1), md5);
            if (this.f200749z1) {
                String stringExtra2 = getIntent().getStringExtra("key_quick_send_packet_origin_materialid");
                C69230i iVar2 = this.f200688S0;
                if (!(iVar2 == null || (sf22 = iVar2.f199197a) == null || Util.isNullOrNil(sf22.f228202f))) {
                    str = this.f200688S0.f199197a.f228202f;
                }
                if (this.f200702Z == 11) {
                    nVar.mo160131h(27809, 5, stringExtra2, str, getIntent().getStringExtra("key_username"), this.f200735t1, Long.valueOf(System.currentTimeMillis()), 12);
                } else {
                    nVar.mo160131h(27809, 5, stringExtra2, str, getIntent().getStringExtra("key_username"), this.f200735t1, Long.valueOf(System.currentTimeMillis()), 10);
                }
                Intent intent3 = new Intent();
                intent3.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS");
                setResult(-1, intent3);
            }
            finish();
            return;
        }
        mo95766P7(i, intent);
    }

    /* renamed from: V7 */
    public final void mo95773V7(int i, double d, boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "has showing error tips, ignore repeat report");
            return;
        }
        int i2 = ((int) d) * 100;
        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "report scene = " + i + " amount =" + i2);
        C115669n.INSTANCE.mo160131h(22775, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: W7 */
    public void mo95774W7(double d, String str) {
        if (Util.isNullOrNil(str)) {
            this.f200716j.setText(C75228t.m90256l(d));
            return;
        }
        TextView textView = this.f200716j;
        textView.setText(str + C75228t.m90260n(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if (r0 != false) goto L_0x0058;
     */
    /* renamed from: X7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95775X7(final android.widget.EditText r8, final com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard r9, boolean r10, boolean r11, final boolean r12) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0068
            if (r8 != 0) goto L_0x0005
            goto L_0x0068
        L_0x0005:
            r0 = 0
            if (r11 == 0) goto L_0x000c
            android.view.View$OnFocusChangeListener r0 = r8.getOnFocusChangeListener()
        L_0x000c:
            r6 = r0
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90251i0(r8)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$45 r11 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$45
            r1 = r11
            r2 = r7
            r3 = r9
            r4 = r12
            r5 = r8
            r1.<init>(r3, r4, r5, r6)
            r8.setOnFocusChangeListener(r11)
            r11 = 28
            boolean r11 = p206nj.C11171e.m11046c(r11)
            if (r11 == 0) goto L_0x0060
            if (r10 == 0) goto L_0x0060
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 != 0) goto L_0x0058
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x0058
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r10 != 0) goto L_0x0058
            java.lang.Class<h81.h> r10 = h81.C32735h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            h81.h r10 = (h81.C32735h) r10
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_android_target28_pay_keyboard_focus
            r0 = 1
            int r10 = r10.mo58779Qe(r11, r0)
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r2 = 0
            r11[r2] = r1
            java.lang.String r1 = "MicroMsg.LuckyMoneyPrepareUI"
            java.lang.String r3 = "ifAutoReqFocusTarget28() swt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r11)
            if (r10 != r0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0060
        L_0x0058:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$46 r10 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$46
            r10.<init>(r7, r8)
            r8.post(r10)
        L_0x0060:
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$47 r10 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$47
            r10.<init>(r7, r9, r12)
            r8.setOnClickListener(r10)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.mo95775X7(android.widget.EditText, com.tencent.mm.wallet_core.keyboard.WcPayKeyboard, boolean, boolean, boolean):void");
    }

    /* renamed from: Y7 */
    public final void mo95776Y7(IEmojiInfo iEmojiInfo) {
        Class cls = C67305d1.class;
        LuckyMoneyTextInputView luckyMoneyTextInputView = this.f200714i;
        luckyMoneyTextInputView.f200809f.setTag("delete");
        luckyMoneyTextInputView.f200810g.setVisibility(8);
        luckyMoneyTextInputView.f200811h.setVisibility(0);
        luckyMoneyTextInputView.f200811h.setEmojiInfo(iEmojiInfo);
        int i = this.f200727p1;
        if (i == 0 || i == 2) {
            if (((C67305d1) C86312j.m106911c(cls)).mo91430hJ(iEmojiInfo)) {
                this.f200724o1 = 2;
            } else if (((C67305d1) C86312j.m106911c(cls)).mo91433yi(iEmojiInfo)) {
                this.f200724o1 = 4;
            } else {
                this.f200724o1 = 3;
            }
        } else if (i == 1) {
            this.f200724o1 = 2;
        }
        RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new RedEnvSendWithEmoticonClickStruct();
        this.f200719l1 = redEnvSendWithEmoticonClickStruct;
        redEnvSendWithEmoticonClickStruct.f194328d = 1;
        redEnvSendWithEmoticonClickStruct.mo86054n();
    }

    /* renamed from: Z7 */
    public void mo95777Z7(String str) {
        TextView textView = (TextView) this.f200740w.findViewById(C0966R.C0970id.gj_);
        if (textView != null && !Util.isNullOrNil(str)) {
            textView.setText(str);
        }
    }

    /* renamed from: a8 */
    public final void mo95778a8() {
        double d;
        double d2;
        double d3;
        int i;
        if (this.f200685R0 != null) {
            if (C69242l1.m81606l(this.f200682Q0)) {
                C69273y yVar = this.f200685R0;
                d3 = yVar.f199370A;
                d2 = yVar.f199389y;
                d = yVar.f199390z;
                i = yVar.f199388x;
            } else {
                C69273y yVar2 = this.f200685R0;
                d3 = yVar2.f199372e;
                d2 = yVar2.f199375h;
                d = yVar2.f199377j;
                i = yVar2.f199371d;
            }
            this.f200710g.setMaxNum(i);
            if (this.f200700Y == 1) {
                this.f200712h.setMaxAmount(d3);
            } else {
                this.f200712h.setMaxAmount(d2);
            }
            this.f200712h.setMinAmount(d);
            String str = this.f200685R0.f199380p;
            if (str == null || str.length() <= 0) {
                this.f200712h.setHint(getString(C0966R.string.f360989m23));
                this.f200712h.setCurrencyUnitPrefix(getString(C0966R.string.l7o));
                return;
            }
            LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f200712h;
            luckyMoneyMoneyInputView.setHint(str + getString(C0966R.string.ghc));
            this.f200712h.setCurrencyUnitPrefix(str);
            return;
        }
        this.f200712h.setHint(getString(C0966R.string.f360989m23));
        this.f200712h.setCurrencyUnitPrefix(getString(C0966R.string.l7o));
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v0, types: [boolean, int] */
    /* renamed from: b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95779b8(te3.C77994sf2 r28) {
        /*
            r27 = this;
            r10 = r27
            r11 = r28
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_ILLEGAL_STRING_SYNC
            java.lang.String r13 = "MicroMsg.LuckyMoneyPrepareUI"
            java.lang.String r0 = "update envelope"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            com.tencent.mm.plugin.luckymoney.model.i r0 = r10.f200688S0
            r14 = 3
            r15 = 2
            r9 = 1
            r8 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r6 = 0
            if (r0 == 0) goto L_0x0118
            if (r11 == 0) goto L_0x0118
            int r0 = r10.f200682Q0
            if (r0 == r15) goto L_0x0118
            android.widget.RelativeLayout r0 = r10.f200748z
            r0.setVisibility(r6)
            xb3.l r0 = xb3.C91164l.f261397a
            android.widget.RelativeLayout r1 = r10.f200748z
            r2 = 0
            r3 = 200(0xc8, double:9.9E-322)
            r16 = 1
            android.content.res.Resources r5 = r27.getResources()
            r8 = 2131101085(0x7f06059d, float:1.781457E38)
            int r8 = r5.getColor(r8)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            java.lang.String r5 = "ViewId_Luckymoney_Envelope_View"
            r15 = 0
            r6 = r27
            r18 = r7
            r7 = r16
            r16 = 1
            r9 = r17
            r0.mo125226e(r1, r2, r3, r5, r6, r7, r8, r9)
            java.lang.Class<ct.c> r0 = p327ct.C30914c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ct.c r0 = (p327ct.C30914c) r0
            ct.d r0 = r0.mo17862sM()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC
            l20.a r0 = (l20.C21388a) r0
            boolean r0 = r0.mo33498f(r1, r2)
            boolean r1 = r10.f200737u1
            if (r1 != 0) goto L_0x008c
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 18890(0x49ca, float:2.647E-41)
            java.lang.Object[] r3 = new java.lang.Object[r14]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3[r15] = r4
            if (r0 == 0) goto L_0x0079
            r9 = 2
            goto L_0x007a
        L_0x0079:
            r9 = 1
        L_0x007a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4 = 1
            r3[r4] = r0
            java.lang.String r0 = r10.f200735t1
            r5 = 2
            r3[r5] = r0
            r1.mo160131h(r2, r3)
            r10.f200737u1 = r4
            goto L_0x008d
        L_0x008c:
            r4 = 1
        L_0x008d:
            com.tencent.mm.plugin.luckymoney.model.i r0 = r10.f200688S0
            boolean r1 = r0.f199199c
            if (r1 == 0) goto L_0x0115
            java.lang.String r0 = r0.f199200d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0115
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            java.lang.String r1 = ""
            java.lang.Object r0 = r0.mo119685f(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ","
            java.util.List r0 = com.tencent.p014mm.sdk.platformtools.Util.stringToList(r0, r2)
            java.util.Iterator r3 = r0.iterator()
        L_0x00b5:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.plugin.luckymoney.model.i r6 = r10.f200688S0
            te3.sf2 r6 = r6.f199197a
            java.lang.String r6 = r6.f228202f
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x00b5
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r15] = r5
            java.lang.String r1 = "has alert illegal: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r1, r0)
            return
        L_0x00d7:
            com.tencent.mm.plugin.luckymoney.model.i r3 = r10.f200688S0
            te3.sf2 r3 = r3.f199197a
            java.lang.String r3 = r3.f228202f
            r0.add(r3)
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r2)
            r3.mo119677K(r12, r0)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.mm.plugin.luckymoney.model.i r2 = r10.f200688S0
            te3.sf2 r2 = r2.f199197a
            java.lang.String r2 = r2.f228202f
            r0[r15] = r2
            java.lang.String r2 = "show alert illegal: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r27.getContext()
            com.tencent.mm.plugin.luckymoney.model.i r2 = r10.f200688S0
            java.lang.String r2 = r2.f199200d
            r3 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r3 = r10.getString(r3)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$18 r5 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$18
            r5.<init>(r10)
            nj3.C76879j.m92754y(r0, r2, r1, r3, r5)
        L_0x0115:
            r1 = 8
            goto L_0x0123
        L_0x0118:
            r18 = r7
            r4 = 1
            r15 = 0
            android.widget.RelativeLayout r0 = r10.f200748z
            r1 = 8
            r0.setVisibility(r1)
        L_0x0123:
            r0 = 0
            if (r11 == 0) goto L_0x01a0
            int r2 = r11.f228196A
            if (r2 != r4) goto L_0x01a0
            android.widget.RelativeLayout r2 = r10.f200748z
            r2.setEnabled(r15)
            java.lang.String r2 = r11.f228197B
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x013e
            android.widget.TextView r2 = r10.f200650A
            java.lang.String r3 = r11.f228197B
            r2.setText(r3)
        L_0x013e:
            android.widget.ImageView r2 = r10.f200654C
            r2.setImageBitmap(r0)
            android.view.View r3 = r10.f200656D
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = r18
            r0.mo10233c(r2)
            java.lang.Object[] r20 = r0.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r22 = "updateEnvelopeLayout"
            java.lang.String r23 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r3
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r0 = r0.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r5 = "updateEnvelopeLayout"
            java.lang.String r6 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            android.widget.ImageView r0 = r10.f200668J
            r0.setVisibility(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f200670K
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.f200650A
            android.content.res.Resources r2 = r27.getResources()
            r3 = 2131099669(0x7f060015, float:1.7811698E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            goto L_0x036c
        L_0x01a0:
            r2 = r18
            r3 = 2131308575(0x7f09301f, float:1.823541E38)
            r5 = 0
            if (r11 == 0) goto L_0x02ee
            java.lang.String r6 = r11.f228200d
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x02ee
            r10.mo95780c8(r4)
            android.widget.RelativeLayout r0 = r10.f200748z
            r0.setEnabled(r4)
            android.widget.LinearLayout r0 = r10.f200666I
            r0.setVisibility(r15)
            java.lang.Class<f32.b> r0 = f32.C75672b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            f32.b r0 = (f32.C75672b) r0
            android.widget.ImageView r6 = r10.f200654C
            r0.mo95317Jk(r6, r11)
            android.widget.ImageView r0 = r10.f200668J
            r0.setVisibility(r15)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f200670K
            r0.setVisibility(r1)
            android.view.View r0 = r10.f200656D
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r6.mo10233c(r2)
            java.lang.Object[] r19 = r6.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r21 = "renderEnvelopDynamic"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r6.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r20 = "renderEnvelopDynamic"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            org.libpag.PAGView r0 = r10.f200658E
            r0.stop()
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.f199264a
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$b r2 = h81.C32735h.C32738b.clicfg_android_lucky_money_dynamic_prepare_close_switch
            boolean r0 = r0.mo58784wf(r2, r15)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r2[r15] = r6
            java.lang.String r6 = "MicroMsg.LuckyMoneyUtil"
            java.lang.String r7 = "needCloseLuckyMoneyDynamicConfigPrepare：%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r2)
            if (r0 != 0) goto L_0x029f
            te3.tf2 r0 = r11.f228203g
            java.lang.String r0 = r0.f228258v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0242
            goto L_0x029f
        L_0x0242:
            android.view.View r0 = r10.f200656D
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 4
            int r2 = kg3.C76577a.m92151b(r2, r6)
            float r2 = (float) r2
            if (r0 != 0) goto L_0x0251
            goto L_0x0259
        L_0x0251:
            zo3.a r6 = new zo3.a
            r6.<init>(r4, r4, r2)
            r0.setOutlineProvider(r6)
        L_0x0259:
            if (r0 != 0) goto L_0x025c
            goto L_0x025f
        L_0x025c:
            r0.setClipToOutline(r4)
        L_0x025f:
            org.libpag.PAGView$PAGViewListener r0 = r10.f200660F
            if (r0 != 0) goto L_0x0283
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$20 r0 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$20
            r0.<init>()
            r10.f200660F = r0
            org.libpag.PAGView r2 = r10.f200658E
            r2.addListener(r0)
            org.libpag.PAGView r0 = r10.f200658E
            r0.setRepeatCount(r4)
            org.libpag.PAGView r0 = r10.f200658E
            r0.setScaleMode(r14)
            org.libpag.PAGView r0 = r10.f200658E
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$21 r2 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$21
            r2.<init>(r10)
            r0.addPAGFlushListener(r2)
        L_0x0283:
            a14.n0 r0 = r10.f200662G
            if (r0 != 0) goto L_0x028f
            com.tencent.mm.wallet_core.model.u0 r0 = com.tencent.p014mm.wallet_core.model.C75142u0.f221103a
            a14.n0 r0 = r0.mo104865a()
            r10.f200662G = r0
        L_0x028f:
            long r6 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.luckymoney.model.d0 r0 = com.tencent.p014mm.plugin.luckymoney.model.C69198d0.f199107a
            a14.n0 r2 = r10.f200662G
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$22 r4 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$22
            r4.<init>(r6, r11)
            r0.mo95352b(r11, r14, r2, r4)
        L_0x029f:
            android.view.View r0 = r10.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r15)
            android.content.res.Resources r2 = r27.getResources()
            r3 = 2131101083(0x7f06059b, float:1.7814566E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            java.lang.String r2 = "#80000000"
            int r4 = android.graphics.Color.parseColor(r2)
            r6 = 1088421888(0x40e00000, float:7.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.setShadowLayer(r6, r5, r7, r4)
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106191k0(r0)
            android.widget.TextView r0 = r10.f200650A
            java.lang.String r4 = r11.f228200d
            r0.setText(r4)
            android.widget.TextView r0 = r10.f200650A
            r0.setVisibility(r15)
            android.widget.TextView r0 = r10.f200650A
            android.content.res.Resources r4 = r27.getResources()
            int r3 = r4.getColor(r3)
            r0.setTextColor(r3)
            android.widget.TextView r0 = r10.f200650A
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setShadowLayer(r6, r5, r7, r2)
            goto L_0x036c
        L_0x02ee:
            r10.mo95780c8(r15)
            android.widget.RelativeLayout r6 = r10.f200748z
            r6.setEnabled(r4)
            android.widget.ImageView r4 = r10.f200654C
            r4.setImageBitmap(r0)
            android.widget.LinearLayout r0 = r10.f200666I
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r10.f200668J
            r0.setVisibility(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r10.f200670K
            r0.setVisibility(r15)
            android.widget.TextView r0 = r10.f200650A
            r0.setVisibility(r1)
            android.view.View r0 = r10.f200656D
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r4.mo10233c(r2)
            java.lang.Object[] r19 = r4.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r21 = "updateEnvelopeLayout"
            java.lang.String r22 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r0
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r2 = r4.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI"
            java.lang.String r20 = "updateEnvelopeLayout"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            android.view.View r0 = r10.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r2 = r27.getResources()
            r3 = 2131101252(0x7f060644, float:1.7814908E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            r0.setShadowLayer(r5, r5, r5, r15)
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106193l0(r0)
        L_0x036c:
            if (r11 == 0) goto L_0x0379
            int r0 = r11.f228208o
            r2 = 2
            if (r0 != r2) goto L_0x0379
            android.widget.TextView r0 = r10.f200652B
            r0.setVisibility(r15)
            goto L_0x037e
        L_0x0379:
            android.widget.TextView r0 = r10.f200652B
            r0.setVisibility(r1)
        L_0x037e:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$19 r1 = new com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$19
            r1.<init>()
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.mo95779b8(te3.sf2):void");
    }

    /* renamed from: c8 */
    public final void mo95780c8(boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f200748z.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f200656D.getLayoutParams();
        int b = C76577a.m92151b(getContext(), 56);
        if (z) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "using new skin");
            int b2 = (int) (((float) (C75044y4.m89990b(getContext()).x - C76577a.m92151b(getContext(), 32))) * 0.2194f);
            layoutParams.height = b2;
            layoutParams2.height = b2;
            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "height is %d", Integer.valueOf(layoutParams.height));
        } else {
            layoutParams.height = b;
            layoutParams2.height = b;
        }
        this.f200748z.setLayoutParams(layoutParams);
        this.f200656D.setLayoutParams(layoutParams2);
    }

    /* renamed from: d8 */
    public final void mo95781d8(int i) {
        Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "update view by mode: %s, %s", Integer.valueOf(this.f200700Y), Integer.valueOf(i));
        int i2 = this.f200700Y;
        if (i != i2) {
            if (i2 == 0) {
                this.f200676N.setText(C0966R.string.gha);
                this.f200679P.setVisibility(8);
                this.f200710g.setVisibility(0);
                this.f200681Q.setVisibility(0);
                this.f200728q.setVisibility(8);
                ((LinkedList) this.f200698X.f201001a).clear();
                this.f200698X.mo95868c(this.f200710g);
                this.f200698X.mo95868c(this.f200712h);
                this.f200698X.mo95868c(this.f200714i);
                int input = this.f200710g.getInput();
                double input2 = this.f200712h.getInput();
                this.f200712h.setType(this.f200700Y);
                this.f200712h.setShowGroupIcon(false);
                this.f200712h.setTitle(getString(C0966R.string.gjq));
                if (input2 > 0.0d && input > 0) {
                    this.f200712h.setAmount(C75228t.m90260n(input2 / ((double) input)));
                }
                if (C69242l1.m81606l(this.f200682Q0)) {
                    this.f200712h.setMaxAmount(this.f200685R0.f199389y);
                } else {
                    this.f200712h.setMaxAmount(this.f200685R0.f199375h);
                }
                mo95777Z7(this.f200659E1);
            } else if (i2 == 1) {
                this.f200676N.setText(C0966R.string.gh_);
                this.f200679P.setVisibility(8);
                this.f200710g.setVisibility(0);
                this.f200681Q.setVisibility(0);
                this.f200728q.setVisibility(8);
                ((LinkedList) this.f200698X.f201001a).clear();
                this.f200698X.mo95868c(this.f200710g);
                this.f200698X.mo95868c(this.f200712h);
                this.f200698X.mo95868c(this.f200714i);
                int input3 = this.f200710g.getInput();
                double input4 = this.f200712h.getInput();
                this.f200712h.setType(this.f200700Y);
                if (C69242l1.m81606l(this.f200682Q0)) {
                    this.f200712h.setMaxAmount(this.f200685R0.f199370A);
                } else {
                    this.f200712h.setMaxAmount(this.f200685R0.f199372e);
                }
                this.f200712h.setTitle(getString(C0966R.string.gjp));
                this.f200712h.setShowGroupIcon(true);
                if (i == 3 && input4 > 0.0d) {
                    this.f200712h.setAmount(C75228t.m90260n(input4));
                } else if (input4 > 0.0d && input3 > 0) {
                    this.f200712h.setAmount(C75228t.m90260n(input4 * ((double) input3)));
                }
                mo95777Z7(this.f200659E1);
            } else if (i2 == 3) {
                this.f200676N.setText(C0966R.string.gh8);
                this.f200679P.setVisibility(0);
                this.f200710g.setVisibility(8);
                this.f200681Q.setVisibility(8);
                this.f200728q.setVisibility(8);
                ((LinkedList) this.f200698X.f201001a).clear();
                this.f200698X.mo95868c((C69637m1) this.f200679P);
                this.f200698X.mo95868c(this.f200712h);
                this.f200698X.mo95868c(this.f200714i);
                int input5 = this.f200710g.getInput();
                double input6 = this.f200712h.getInput();
                this.f200712h.setType(this.f200700Y);
                this.f200712h.setShowGroupIcon(false);
                this.f200712h.setTitle(getString(C0966R.string.gjn));
                if (i == 0 && input6 > 0.0d && input5 > 0) {
                    this.f200712h.setAmount(C75228t.m90260n(input6 * ((double) input5)));
                } else if (input6 > 0.0d) {
                    this.f200712h.setAmount(C75228t.m90260n(input6));
                }
                if (C69242l1.m81606l(this.f200682Q0)) {
                    this.f200712h.setMaxAmount(this.f200685R0.f199389y);
                } else {
                    this.f200712h.setMaxAmount(this.f200685R0.f199375h);
                }
                if (!this.f200739v1) {
                    this.f200679P.post(new Runnable() {
                        public void run() {
                            int left = (((ImageView) LuckyMoneyPrepareUI.this.findViewById(C0966R.C0970id.ger)).getLeft() - C76577a.m92151b(LuckyMoneyPrepareUI.this.getContext(), 8)) - (((TextView) LuckyMoneyPrepareUI.this.findViewById(C0966R.C0970id.geu)).getRight() + C76577a.m92151b(LuckyMoneyPrepareUI.this.getContext(), 52));
                            if (left > 0) {
                                Log.m105919d("MicroMsg.LuckyMoneyPrepareUI", "usernametv maxwidth: %s", Integer.valueOf(left));
                                LuckyMoneyPrepareUI.this.f200687S.setMaxWidth(left);
                            }
                        }
                    });
                    this.f200739v1 = true;
                }
                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_HONGBAO_EXCLUSIVE_FIRST_BOOLEAN_SYNC;
                if (((Boolean) i3.mo119685f(aVar, Boolean.TRUE)).booleanValue()) {
                    mo95777Z7(getResources().getString(C0966R.string.f360984n40));
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
                } else {
                    mo95777Z7(this.f200659E1);
                }
            }
            mo95263Q(true, 0);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f200736u.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        View view = this.f200736u;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo95518I7();
        return true;
    }

    public void finish() {
        if (this.f200703Z0 != null) {
            Intent intent = new Intent();
            intent.putExtra("key_realname_guide_helper", this.f200703Z0);
            C88144b.m109791i(this, "wallet_core", ".id_verify.RealnameDialogActivity", intent, (Bundle) null);
        }
        super.finish();
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_a;
    }

    public void hideTenpayKB() {
        View view = this.f200725p;
        if (view != null && view.isShown()) {
            View view2 = this.f200725p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void init() {
        C69258q qVar;
        if (this.f200697W0 == 1) {
            addIconOptionMenu(0, (int) C0966R.string.a0h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                    String str = LuckyMoneyPrepareUI.f200649T1;
                    luckyMoneyPrepareUI.getClass();
                    C8371g gVar = new C8371g((Context) luckyMoneyPrepareUI, 1, false);
                    gVar.f225771i = new C11182m0() {
                        public void onCreateMMMenu(C76874e0 e0Var) {
                            e0Var.add(0, 0, 0, (CharSequence) LuckyMoneyPrepareUI.this.getString(C0966R.string.gf4));
                            e0Var.add(0, 1, 0, (CharSequence) LuckyMoneyPrepareUI.this.getString(C0966R.string.ku_));
                        }
                    };
                    gVar.f225782p = new C11184p0() {
                        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                            if (i == 0) {
                                Intent intent = new Intent();
                                intent.setClass(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyMyRecordUI.class);
                                intent.putExtra("key_username", LuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username"));
                                intent.putExtra("key_type", 2);
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = luckyMoneyPrepareUI;
                                C117292a.m165358d(luckyMoneyPrepareUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$24", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                luckyMoneyPrepareUI.startActivity((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(luckyMoneyPrepareUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$24", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            } else if (i == 1) {
                                C115669n.INSTANCE.mo160131h(15511, Integer.valueOf(LuckyMoneyPrepareUI.this.f200697W0), 1);
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = LuckyMoneyPrepareUI.this;
                                if (luckyMoneyPrepareUI3.f200697W0 == 1) {
                                    C75228t.m90219L(luckyMoneyPrepareUI3.getContext(), LuckyMoneyPrepareUI.f200649T1, false);
                                    return;
                                }
                                Object[] objArr = new Object[1];
                                C69273y yVar = luckyMoneyPrepareUI3.f200685R0;
                                objArr[0] = yVar != null ? yVar.f199382r : "";
                                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "show qa foreign, config url: %s", objArr);
                                C69273y yVar2 = LuckyMoneyPrepareUI.this.f200685R0;
                                if (yVar2 == null || Util.isNullOrNil(yVar2.f199382r)) {
                                    C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
                                } else {
                                    C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyPrepareUI.this.f200685R0.f199382r, false);
                                }
                            }
                        }
                    };
                    gVar.mo107573q();
                    return true;
                }
            });
        } else {
            addIconOptionMenu(0, (int) C0966R.string.ku_, (int) C0966R.C0969drawable.f357261ae3, (MenuItem.OnMenuItemClickListener) new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    C69273y yVar = LuckyMoneyPrepareUI.this.f200685R0;
                    if (yVar == null || Util.isNullOrNil(yVar.f199382r)) {
                        C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), "https://hkwallet.moneydata.hk/hybrid/www/weixin/hongbao_hk_v2/zh_hk/faq.shtml", false);
                        return true;
                    }
                    C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyPrepareUI.this.f200685R0.f199382r, false);
                    return true;
                }
            });
        }
        Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "init custom envelope entrance: %s", Integer.valueOf(((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC, 0)).intValue()));
        C69273y yVar = this.f200685R0;
        if (yVar == null || (qVar = yVar.f199387w) == null || this.f200682Q0 == 2) {
            this.f200690T.setVisibility(8);
        } else if (!Util.isNullOrNil(qVar.f199293e)) {
            this.f200694V.setText(this.f200685R0.f199387w.f199293e);
            int A = C76577a.m92145A(getContext()) - C76577a.m92151b(getContext(), 70);
            if (A > 0) {
                this.f200694V.setMaxWidth(A);
            }
            this.f200690T.setVisibility(0);
            this.f200747y1 = true;
            if (!Util.isNullOrNil(this.f200685R0.f199387w.f199294f)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59351g = C75846b.zx0().Dx0();
                bVar.f59346b = true;
                bVar.f59364t = false;
                bVar.f59345a = true;
                C20828a.m22825b().mo32519h(this.f200685R0.f199387w.f199294f, this.f200692U, bVar.mo32666a());
            }
            this.f200690T.setOnClickListener(new C7089c0() {
                /* renamed from: a */
                public void mo2066a(View view) {
                    Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "jump to action type: %s", Integer.valueOf(LuckyMoneyPrepareUI.this.f200685R0.f199387w.f199295g));
                    LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                    C69258q qVar = luckyMoneyPrepareUI.f200685R0.f199387w;
                    switch (qVar.f199295g) {
                        case 1:
                            C75228t.m90219L(luckyMoneyPrepareUI.getContext(), LuckyMoneyPrepareUI.this.f200685R0.f199387w.f199296h, false);
                            return;
                        case 2:
                            C75228t.m90223P(luckyMoneyPrepareUI.getContext(), LuckyMoneyPrepareUI.this.f200685R0.f199387w.f199297i);
                            return;
                        case 3:
                            C75228t.m90224Q(qVar.f199297i, qVar.f199296h, 0, 1100);
                            return;
                        case 4:
                            Intent intent = new Intent();
                            intent.putExtra("finder_username", LuckyMoneyPrepareUI.this.f200685R0.f199387w.f199297i);
                            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(LuckyMoneyPrepareUI.this.getContext(), intent);
                            return;
                        case 5:
                        case 6:
                            Intent intent2 = new Intent();
                            intent2.putExtra("extra_id", LuckyMoneyPrepareUI.this.f200685R0.f199387w.f199297i);
                            intent2.putExtra("preceding_scence", 21);
                            C88144b.m109791i(LuckyMoneyPrepareUI.this.getContext(), "emoji", ".ui.EmojiStoreDetailUI", intent2, (Bundle) null);
                            return;
                        default:
                            return;
                    }
                }
            });
        } else {
            this.f200690T.setVisibility(8);
        }
    }

    public void initView() {
        int i;
        setBackBtn(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                LuckyMoneyPrepareUI.this.finish();
                return true;
            }
        });
        this.f200736u = findViewById(C0966R.C0970id.ghv);
        this.f200738v = findViewById(C0966R.C0970id.ghz);
        this.f200723o = (Button) findViewById(C0966R.C0970id.ghy);
        LuckyMoneyTextInputView luckyMoneyTextInputView = (LuckyMoneyTextInputView) findViewById(C0966R.C0970id.gjm);
        this.f200714i = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(C0966R.string.gf7));
        LuckyMoneyTextInputView luckyMoneyTextInputView2 = this.f200714i;
        C7091p pVar = new C7091p(75);
        InputFilter[] filters = luckyMoneyTextInputView2.f200807d.getFilters();
        InputFilter[] inputFilterArr = new InputFilter[(filters.length + 1)];
        System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
        inputFilterArr[filters.length] = pVar;
        luckyMoneyTextInputView2.f200807d.setFilters(inputFilterArr);
        this.f200721n = (Button) findViewById(C0966R.C0970id.ghm);
        MyKeyboardWindow myKeyboardWindow = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.f200725p = findViewById(C0966R.C0970id.f359359kh1);
        this.f200728q = (TextView) findViewById(C0966R.C0970id.ghk);
        this.f200710g = (LuckyMoneyNumInputView) findViewById(C0966R.C0970id.ghg);
        this.f200712h = (LuckyMoneyMoneyInputView) findViewById(C0966R.C0970id.gbq);
        this.f200716j = (TextView) findViewById(C0966R.C0970id.f358690gi0);
        this.f200740w = (ViewGroup) findViewById(C0966R.C0970id.ght);
        this.f200742x = (MMScrollView) findViewById(C0966R.C0970id.gj4);
        this.f200745y = (TextView) findViewById(C0966R.C0970id.ghr);
        this.f200748z = (RelativeLayout) findViewById(C0966R.C0970id.geh);
        this.f200650A = (TextView) findViewById(C0966R.C0970id.geo);
        this.f200652B = (TextView) findViewById(C0966R.C0970id.gem);
        this.f200654C = (ImageView) findViewById(C0966R.C0970id.geg);
        this.f200658E = (PAGView) findViewById(C0966R.C0970id.f358672o11);
        this.f200656D = findViewById(C0966R.C0970id.f358673o12);
        this.f200666I = (LinearLayout) findViewById(C0966R.C0970id.no_);
        this.f200668J = (ImageView) findViewById(C0966R.C0970id.o0y);
        this.f200670K = (WeImageView) findViewById(C0966R.C0970id.o0z);
        this.f200672L = (TextView) findViewById(C0966R.C0970id.gej);
        this.f200674M = (ViewGroup) findViewById(C0966R.C0970id.gft);
        this.f200676N = (TextView) findViewById(C0966R.C0970id.gfu);
        this.f200679P = (ViewGroup) findViewById(C0966R.C0970id.get);
        this.f200681Q = (TextView) findViewById(C0966R.C0970id.ghs);
        this.f200684R = (ImageView) findViewById(C0966R.C0970id.ges);
        this.f200687S = (TextView) findViewById(C0966R.C0970id.gev);
        this.f200690T = (ViewGroup) findViewById(C0966R.C0970id.gch);
        this.f200692U = (WeImageView) findViewById(C0966R.C0970id.gcg);
        this.f200694V = (TextView) findViewById(C0966R.C0970id.gci);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f200696W = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f200713h1 = new C69554a(this);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.b9n, (ViewGroup) null);
        this.f200717j1 = inflate;
        this.f200713h1.setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f200717j1.findViewById(C0966R.C0970id.ge_).setOnClickListener(new C7089c0() {
            /* renamed from: a */
            public void mo2066a(View view) {
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                C67339b.m79676a(luckyMoneyPrepareUI, luckyMoneyPrepareUI.f200711g1);
                luckyMoneyPrepareUI.f200713h1.dismiss();
            }
        });
        this.f200713h1.f200845f = new C69554a.C69555a() {
            /* renamed from: a */
            public void mo95566a() {
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                C67339b.m79676a(luckyMoneyPrepareUI, luckyMoneyPrepareUI.f200711g1);
                luckyMoneyPrepareUI.f200713h1.dismiss();
            }
        };
        this.f200715i1 = (ViewGroup) this.f200717j1.findViewById(C0966R.C0970id.geb);
        this.f200711g1 = C30699x0.m39154a().si0(getContext());
        String stringExtra = getIntent().getStringExtra("key_username");
        this.f200708e1 = stringExtra;
        this.f200711g1.setTalkerName(stringExtra);
        this.f200711g1.setShowSmiley(false);
        if (this.f200700Y == 1) {
            setMMTitle((int) C0966R.string.ggq);
            this.f200712h.setTitle(getString(C0966R.string.gjp));
            this.f200712h.setShowGroupIcon(true);
        } else {
            setMMTitle((int) C0966R.string.ghq);
            this.f200712h.setTitle(getString(C0966R.string.gjq));
            this.f200712h.setShowGroupIcon(false);
        }
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            this.f200712h.setRtxLuckyMoney(1);
        } else if (this.f200682Q0 == 3) {
            this.f200712h.setRtxLuckyMoney(2);
        } else {
            this.f200712h.setRtxLuckyMoney(0);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C76577a.m92157h(this, C0966R.dimen.aej));
        if (this.f200700Y == 1) {
            layoutParams.topMargin = C76577a.m92151b(getContext(), 13);
            layoutParams2.topMargin = C76577a.m92151b(getContext(), 13);
        } else {
            layoutParams.topMargin = C76577a.m92151b(getContext(), 16);
            layoutParams2.topMargin = C76577a.m92151b(getContext(), 16);
        }
        this.f200714i.setLayoutParams(layoutParams);
        this.f200748z.setLayoutParams(layoutParams2);
        this.f200712h.setOnInputValidChangerListener(this);
        mo95778a8();
        this.f200710g.setOnInputValidChangerListener(this);
        this.f200710g.setHint(getString(C0966R.string.ghs));
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            this.f200710g.setRtxLuckyMoney(1);
        } else if (this.f200682Q0 == 3) {
            this.f200710g.setRtxLuckyMoney(2);
        } else {
            this.f200710g.setRtxLuckyMoney(0);
        }
        this.f200714i.setOnInputValidChangerListener(this);
        if (!this.f200746y0) {
            this.f200710g.setNum("");
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            this.f200710g.setNum("");
        } else {
            this.f200710g.setNum("1");
        }
        if (C69242l1.m81606l(this.f200682Q0)) {
            this.f200710g.setMaxNum(this.f200685R0.f199388x);
        } else {
            this.f200710g.setMaxNum(this.f200685R0.f199371d);
        }
        if (this.f200700Y == 1) {
            this.f200710g.setMinNum(1);
        } else {
            this.f200710g.setMinNum(1);
        }
        Log.m105918d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.f200710g.getInput());
        this.f200712h.setMaxLen(12);
        if (mo95762L7()) {
            this.f200721n.setText(getString(C0966R.string.gii, new Object[]{this.f200685R0.f199383s}));
        }
        if (this.f200746y0 || (i = this.f200682Q0) == 2 || i == 3) {
            if (mo95762L7()) {
                setMMTitle(getString(C0966R.string.gjm, new Object[]{this.f200685R0.f199383s}));
            } else {
                setMMTitle((int) C0966R.string.gjl);
            }
            int intExtra = getIntent().getIntExtra("key_chatroom_num", 0);
            if (!this.f200746y0 || intExtra != 0) {
                if (getIntent().getIntExtra("key_chatroom_num", 0) > 0 || !this.f200746y0) {
                    this.f200674M.setVisibility(0);
                    mo95781d8(-1);
                    this.f200674M.setOnClickListener(new C7089c0() {
                        /* renamed from: a */
                        public void mo2066a(View view) {
                            LuckyMoneyPrepareUI.this.hideTenpayKB();
                            LuckyMoneyPrepareUI.this.hideVKB();
                            LuckyMoneyPrepareUI.this.f200651A1.mo104741f();
                            C8371g gVar = new C8371g((Context) LuckyMoneyPrepareUI.this.getContext(), false, 1);
                            gVar.f225771i = new C11182m0() {
                                /* JADX WARNING: Code restructure failed: missing block: B:6:0x0085, code lost:
                                    r3 = r7.f200752d.f200751g;
                                 */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public void onCreateMMMenu(nj3.C76874e0 r8) {
                                    /*
                                        r7 = this;
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        r1 = 2131832450(0x7f112e82, float:1.9297954E38)
                                        java.lang.String r0 = r0.getString(r1)
                                        r1 = 1
                                        r8.mo107142f(r1, r0)
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        r2 = 2131832451(0x7f112e83, float:1.9297956E38)
                                        java.lang.String r0 = r0.getString(r2)
                                        r2 = 2
                                        r8.mo107142f(r2, r0)
                                        java.lang.Class<h81.h> r0 = h81.C32735h.class
                                        di3.d r0 = di3.C86312j.m106911c(r0)
                                        h81.h r0 = (h81.C32735h) r0
                                        h81.h$c r3 = h81.C32735h.C32737c.clicfg_android_exclusive_lucky_money
                                        r4 = 0
                                        r0.mo58779Qe(r3, r4)
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        android.content.Intent r0 = r0.getIntent()
                                        java.lang.String r3 = "key_chatroom_num"
                                        int r0 = r0.getIntExtra(r3, r4)
                                        java.lang.Object[] r3 = new java.lang.Object[r2]
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r5 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r5 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        android.content.Intent r5 = r5.getIntent()
                                        java.lang.String r6 = "key_username"
                                        java.lang.String r5 = r5.getStringExtra(r6)
                                        r3[r4] = r5
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r4 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r4 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        android.content.Intent r4 = r4.getIntent()
                                        java.lang.String r4 = r4.getStringExtra(r6)
                                        boolean r4 = eb0.C45628s0.m50748M(r4)
                                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                                        r3[r1] = r4
                                        java.lang.String r4 = "MicroMsg.LuckyMoneyPrepareUI"
                                        java.lang.String r5 = "%s: isOpenImIncludeAssociateRoom:%s"
                                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r3)
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        com.tencent.mm.plugin.luckymoney.model.y r4 = r3.f200685R0
                                        boolean r4 = r4.f199386v
                                        if (r4 == 0) goto L_0x009c
                                        int r4 = r3.f200697W0
                                        if (r4 != r1) goto L_0x009c
                                        android.content.Intent r3 = r3.getIntent()
                                        java.lang.String r3 = r3.getStringExtra(r6)
                                        boolean r3 = eb0.C45628s0.m50748M(r3)
                                        if (r3 != 0) goto L_0x009c
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI$10 r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.this
                                        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                                        int r4 = r3.f200682Q0
                                        if (r4 == r2) goto L_0x009c
                                        r2 = 3
                                        if (r4 == r2) goto L_0x009c
                                        if (r0 <= r1) goto L_0x009c
                                        r0 = 2131832448(0x7f112e80, float:1.929795E38)
                                        java.lang.String r0 = r3.getString(r0)
                                        r8.mo107142f(r2, r0)
                                    L_0x009c:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C6950210.C695031.onCreateMMMenu(nj3.e0):void");
                                }
                            };
                            gVar.f225782p = new C11184p0() {
                                public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                                    int itemId = menuItem.getItemId();
                                    LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                    int i2 = luckyMoneyPrepareUI.f200700Y;
                                    if (itemId == 1) {
                                        luckyMoneyPrepareUI.f200700Y = 1;
                                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(LuckyMoneyPrepareUI.this.mo95770S7()), 2);
                                        LuckyMoneyPrepareUI.this.f200657D1 = 3;
                                    } else if (itemId == 2) {
                                        luckyMoneyPrepareUI.f200700Y = 0;
                                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(LuckyMoneyPrepareUI.this.mo95770S7()), 3);
                                        LuckyMoneyPrepareUI.this.f200657D1 = 2;
                                    } else if (itemId == 3) {
                                        luckyMoneyPrepareUI.f200700Y = 3;
                                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(LuckyMoneyPrepareUI.this.mo95770S7()), 13);
                                        LuckyMoneyPrepareUI.this.f200657D1 = 4;
                                    }
                                    LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = LuckyMoneyPrepareUI.this;
                                    if (luckyMoneyPrepareUI2.f200741w1 && i2 != luckyMoneyPrepareUI2.f200700Y) {
                                        C115669n.INSTANCE.mo160131h(22237, 2);
                                        LuckyMoneyPrepareUI.this.f200744x1 = true;
                                    }
                                    LuckyMoneyPrepareUI.this.mo95781d8(i2);
                                }
                            };
                            gVar.mo107573q();
                        }
                    });
                    this.f200679P.setOnClickListener(new C7089c0() {
                        /* renamed from: a */
                        public void mo2066a(View view) {
                            LuckyMoneyPrepareUI.this.hideTenpayKB();
                            LuckyMoneyPrepareUI.this.hideVKB();
                            LuckyMoneyPrepareUI.this.f200651A1.mo104741f();
                            Intent intent = new Intent(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyExclusiveSelectContactUI.class);
                            intent.putExtra("chatroomName", LuckyMoneyPrepareUI.this.f200708e1);
                            LuckyMoneyPrepareUI.this.startActivityForResult(intent, 6);
                        }
                    });
                } else {
                    this.f200674M.setVisibility(8);
                    this.f200679P.setVisibility(8);
                }
                if (this.f200746y0 && intExtra > 0) {
                    Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "group hb,%d people", Integer.valueOf(intExtra));
                    this.f200681Q.setText(getString(C0966R.string.ghr, new Object[]{Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8))}));
                } else if (this.f200682Q0 == 2) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "f2f hb");
                    this.f200714i.setVisibility(8);
                }
                this.f200712h.setGroupIconIv(C0966R.C0969drawable.f357260c73);
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "single hb");
                this.f200710g.setVisibility(8);
                this.f200674M.setVisibility(8);
                this.f200679P.setVisibility(8);
                this.f200698X.mo95868c(this.f200712h);
            }
        } else {
            int i2 = this.f200700Y;
            if (i2 == 1) {
                this.f200728q.setText(this.f200685R0.f199373f);
                this.f200728q.setVisibility(0);
            } else if (i2 == 0) {
                this.f200728q.setText(this.f200685R0.f199374g);
                this.f200728q.setVisibility(0);
            }
        }
        this.f200721n.setOnClickListener(new C30870z1() {
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c8, code lost:
                if (r9.f201003c != false) goto L_0x00ca;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo57772a(android.view.View r9) {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct
                    r0.<init>()
                    r9.f200719l1 = r0
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct r9 = r9.f200719l1
                    r0 = 6
                    r9.f194328d = r0
                    r9.mo86054n()
                    com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                    r0 = 25925(0x6545, float:3.6329E-41)
                    r1 = 5
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 8
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r4 = 0
                    r1[r4] = r3
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    int r3 = r3.f200657D1
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r5 = 1
                    r1[r5] = r3
                    r3 = 2
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r6 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    float r6 = r6.f200655C1
                    java.lang.Float r6 = java.lang.Float.valueOf(r6)
                    r1[r3] = r6
                    r3 = 3
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r6 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r6 = r6.f200712h
                    android.widget.EditText r6 = r6.getEditText()
                    android.text.Editable r6 = r6.getText()
                    r1[r3] = r6
                    r3 = 4
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r6 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r6 = r6.f200710g
                    android.widget.EditText r6 = r6.getEditText()
                    android.text.Editable r6 = r6.getText()
                    r1[r3] = r6
                    r9.mo160131h(r0, r1)
                    java.lang.Class<ie3.c> r0 = ie3.C76324c.class
                    di3.d r0 = di3.C86312j.m106911c(r0)
                    ie3.c r0 = (ie3.C76324c) r0
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r1 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    boolean r0 = r0.canOpenKindaCashier(r1)
                    java.lang.String r1 = "MicroMsg.LuckyMoneyPrepareUI"
                    if (r0 != 0) goto L_0x007a
                    java.lang.String r0 = "can not request hb while authen"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
                    r0 = 965(0x3c5, float:1.352E-42)
                    r1 = 55
                    r9.mo175911u(r0, r1)
                    return
                L_0x007a:
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.l1 r9 = r9.f200698X
                    boolean r0 = r9.f201002b
                    if (r0 == 0) goto L_0x0083
                    goto L_0x00ca
                L_0x0083:
                    r9.f201003c = r4
                    r9.f201002b = r4
                    r0 = 0
                L_0x0088:
                    java.util.List<com.tencent.mm.plugin.luckymoney.ui.m1> r3 = r9.f201001a
                    java.util.LinkedList r3 = (java.util.LinkedList) r3
                    int r3 = r3.size()
                    if (r0 >= r3) goto L_0x00b9
                    java.util.List<com.tencent.mm.plugin.luckymoney.ui.m1> r3 = r9.f201001a
                    java.util.LinkedList r3 = (java.util.LinkedList) r3
                    java.lang.Object r3 = r3.get(r0)
                    com.tencent.mm.plugin.luckymoney.ui.m1 r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69637m1) r3
                    int r6 = r3.mo5754d()
                    if (r6 == 0) goto L_0x00b3
                    boolean r7 = r9.f201003c
                    if (r7 != 0) goto L_0x00b3
                    r3.mo5751a()
                    java.lang.String r3 = r3.mo5755e(r6)
                    r9.mo95870e(r3)
                    r9.f201003c = r5
                    goto L_0x00b6
                L_0x00b3:
                    r3.mo5752b()
                L_0x00b6:
                    int r0 = r0 + 1
                    goto L_0x0088
                L_0x00b9:
                    boolean r0 = r9.f201003c
                    if (r0 != 0) goto L_0x00c6
                    android.widget.TextView r0 = r9.f201004d
                    if (r0 == 0) goto L_0x00c6
                    r0.setVisibility(r2)
                    r9.f201002b = r4
                L_0x00c6:
                    boolean r9 = r9.f201003c
                    if (r9 == 0) goto L_0x00cb
                L_0x00ca:
                    r5 = 0
                L_0x00cb:
                    if (r5 == 0) goto L_0x00da
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r9 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    r9.getClass()
                    java.lang.String r0 = "doPrePareBtnClick()"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    r9.mo95767Q7(r4)
                L_0x00da:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C695346.mo57772a(android.view.View):void");
            }
        });
        TextView textView = (TextView) findViewById(C0966R.C0970id.gho);
        C69631l1 l1Var = this.f200698X;
        if (textView != null) {
            l1Var.f201004d = textView;
        } else {
            l1Var.getClass();
        }
        this.f200695V0 = new MTimerHandler(new MTimerHandler.CallBack() {
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
                if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f200709f1) != false) goto L_0x003b;
             */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTimerExpired() {
                /*
                    r8 = this;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r0 = r0.f200712h
                    int r0 = r0.mo5753c()
                    r1 = 3
                    r2 = 0
                    if (r0 == r1) goto L_0x003b
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r0 = r0.f200710g
                    int r0 = r0.mo5753c()
                    if (r0 == r1) goto L_0x003b
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r0 = r0.f200710g
                    int r0 = r0.getInput()
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r4 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r4 = r4.f200712h
                    double r4 = r4.getInput()
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r6 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    int r7 = r6.f200700Y
                    if (r7 != 0) goto L_0x0031
                    double r0 = (double) r0
                    double r4 = r4 * r0
                    goto L_0x003c
                L_0x0031:
                    if (r7 != r1) goto L_0x003c
                    java.lang.String r0 = r6.f200709f1
                    boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                    if (r0 == 0) goto L_0x003c
                L_0x003b:
                    r4 = r2
                L_0x003c:
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    int r0 = r0.f200682Q0
                    boolean r0 = com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81606l(r0)
                    if (r0 == 0) goto L_0x004d
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.model.y r0 = r0.f200685R0
                    double r0 = r0.f199370A
                    goto L_0x0053
                L_0x004d:
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.model.y r0 = r0.f200685R0
                    double r0 = r0.f199372e
                L_0x0053:
                    int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                    if (r6 == 0) goto L_0x0075
                    int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                    if (r2 > 0) goto L_0x0075
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.l1 r0 = r0.f200698X
                    boolean r0 = r0.mo95867b()
                    if (r0 == 0) goto L_0x0066
                    goto L_0x0075
                L_0x0066:
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    android.widget.Button r0 = r0.f200721n
                    r1 = 1
                    r0.setClickable(r1)
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    android.widget.Button r0 = r0.f200721n
                    r0.setEnabled(r1)
                L_0x0075:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "onTimeExpired & check: amount="
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r1 = ", hasErr="
                    r0.append(r1)
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r1 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r1.f200698X
                    boolean r1 = r1.mo95867b()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "MicroMsg.LuckyMoneyPrepareUI"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI r0 = com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.this
                    com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f200695V0
                    r0.stopped()
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPrepareUI.C695357.onTimerExpired():boolean");
            }
        }, false);
        MMScrollView mMScrollView = this.f200742x;
        if (mMScrollView != null) {
            mMScrollView.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (motionEvent.getAction() == 0) {
                        LuckyMoneyPrepareUI.this.hideTenpayKB();
                        LuckyMoneyPrepareUI.this.hideVKB();
                        LuckyMoneyPrepareUI.this.f200651A1.mo104741f();
                    }
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        }
        this.f200712h.setType(this.f200700Y);
        init();
        final boolean f = ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33498f(C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
        this.f200748z.setOnClickListener(new C7089c0() {
            /* renamed from: a */
            public void mo2066a(View view) {
                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "click envelope layout: %s", Integer.valueOf(LuckyMoneyPrepareUI.this.f200729q1));
                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                if (luckyMoneyPrepareUI.f200729q1 == 0) {
                    LuckyMoneyPrepareUI.m81933J7(luckyMoneyPrepareUI, (byte[]) null, false, f);
                } else {
                    AppCompatActivity context = luckyMoneyPrepareUI.getContext();
                    HashMap<String, Long> hashMap = C69242l1.f199264a;
                    final C89779i0 O = C76879j.m92721O(context, (String) null, 3, C0966R.style.f8510l3, context.getString(C0966R.string.gas), true, false, new C69247m1());
                    C42519p g = C42519p.m46167g();
                    g.f221004c = new C42516e("", 1);
                    g.mo104792c(new C75097a.C75099b<C78007w82>() {
                        /* renamed from: a */
                        public /* bridge */ /* synthetic */ void mo67542a(Object obj) {
                            C78007w82 w822 = (C78007w82) obj;
                        }

                        /* renamed from: b */
                        public void mo67543b(Object obj, int i, int i2) {
                            C78007w82 w822 = (C78007w82) obj;
                            Dialog dialog = O;
                            if (dialog != null && dialog.isShowing()) {
                                O.dismiss();
                            }
                            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "do get show source net callback");
                            if (w822 != null) {
                                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "retcode: %s", Integer.valueOf(w822.f228340d));
                                if (w822.f228340d == 0) {
                                    try {
                                        byte[] byteArray = w822.toByteArray();
                                        C6950917 r1 = C6950917.this;
                                        LuckyMoneyPrepareUI.m81933J7(LuckyMoneyPrepareUI.this, byteArray, true, f);
                                    } catch (Exception e) {
                                        Log.printErrStackTrace("MicroMsg.LuckyMoneyPrepareUI", e, "", new Object[0]);
                                    }
                                    LuckyMoneyPrepareUI.this.f200672L.setVisibility(8);
                                    ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33501j(C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_STRING_SYNC, C72994y1.C72995a.USERINFO_LUCKY_MONEY_FIRST_NEW_FLAG_HOME_STRING_SYNC);
                                    return;
                                }
                                C75228t.m90210C(w822.f228341e);
                                return;
                            }
                            C75228t.m90209B(LuckyMoneyPrepareUI.this.getContext(), "");
                        }
                    }, true);
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[3];
                objArr[0] = 2;
                objArr[1] = Integer.valueOf(f ? 2 : 1);
                objArr[2] = LuckyMoneyPrepareUI.this.f200735t1;
                nVar.mo160131h(18890, objArr);
                nVar.mo160131h(16822, 1);
            }
        });
        if (f) {
            this.f200672L.setVisibility(0);
        }
        C69230i iVar = this.f200688S0;
        if (iVar != null) {
            mo95779b8(iVar.f199197a);
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "do not has envelopSourceMac");
            mo95779b8((C77994sf2) null);
        }
        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f200651A1 = wcPayKeyboard;
        wcPayKeyboard.setActionText(getString(C0966R.string.f360985m22));
        this.f200651A1.setActionBtnColor(C0966R.C0969drawable.f4663je);
        WcPayKeyboard wcPayKeyboard2 = this.f200651A1;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.setHeightListener(this);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f200651A1.getLayoutParams();
        if (layoutParams3 != null) {
            layoutParams3.addRule(12);
        }
        this.f200712h.getEditText().setOnEditorActionListener(new LuckyMoneyPrepareUI$$a(this));
        this.f200710g.getEditText().setOnEditorActionListener(new LuckyMoneyPrepareUI$$b(this));
        this.f200712h.getEditText().setTag("mAmountEt");
        this.f200710g.getEditText().setTag("mNumEt");
        mo95775X7(this.f200712h.getEditText(), this.f200651A1, false, true, false);
        mo95775X7(this.f200710g.getEditText(), this.f200651A1, false, true, true);
        final EditText editText = (EditText) this.f200712h.findViewById(C0966R.C0970id.geq);
        final EditText editText2 = (EditText) this.f200710g.findViewById(C0966R.C0970id.geq);
        C75228t.m90251i0(editText);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.addTextChangedListener(new TextWatcher(this) {
            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                Matcher matcher = Pattern.compile("(\\d+\\.?\\d{0,2})").matcher(obj);
                if (matcher.find()) {
                    String group = matcher.group();
                    if (!group.equals(obj) && !obj.startsWith(".")) {
                        editable.replace(0, editable.length(), group);
                        return;
                    }
                }
                if (obj.startsWith(".")) {
                    editable.insert(0, "0");
                } else if (WalletFormView.m90176e(obj, editText)) {
                    return;
                }
                String obj2 = editable.toString();
                int indexOf = obj2.indexOf(".");
                int length = obj2.length();
                if (indexOf >= 0 && length - indexOf > 3) {
                    editable.delete(indexOf + 3, length);
                } else if (indexOf > 6) {
                    editable.delete(6, indexOf);
                } else if (indexOf == -1 && length > 6) {
                    editable.delete(6, length);
                }
                editText.setContentDescription(editable.toString());
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        editText2.addTextChangedListener(new TextWatcher(this) {
            public void afterTextChanged(Editable editable) {
                editText2.setContentDescription(editable.toString());
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        C75228t.m90251i0(editText2);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        int intExtra2 = getIntent().getIntExtra("key_chatroom_num", 0);
        if (intExtra2 > 0) {
            this.f200710g.setGroupChatNumber(intExtra2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        String str = "";
        if (i3 != 1111) {
            switch (i3) {
                case 1:
                    if (intent2 != null && intent2.hasExtra("key_realname_guide_helper")) {
                        this.f200703Z0 = (RealnameGuideHelper) intent2.getParcelableExtra("key_realname_guide_helper");
                    }
                    if (i4 != -1) {
                        if (!C75157y0.m90140c(intent)) {
                            if (!C75157y0.m90141d(intent)) {
                                mo95766P7(i4, intent2);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            finish();
                            return;
                        }
                    } else {
                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95770S7()), 5);
                        String stringExtra = getIntent().getStringExtra("key_username");
                        if ((!this.f200746y0 || Util.isNullOrNil(stringExtra)) && this.f200682Q0 != 3) {
                            mo95517H7();
                            View findViewById = findViewById(C0966R.C0970id.ghw);
                            View view = this.f200736u;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C69242l1.m81613s(findViewById, (Animation.AnimationListener) null);
                            this.f200723o.setOnClickListener(new C7089c0() {
                                /* renamed from: a */
                                public void mo2066a(View view) {
                                    C115669n nVar = C115669n.INSTANCE;
                                    LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                    String str = LuckyMoneyPrepareUI.f200649T1;
                                    nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(luckyMoneyPrepareUI.mo95770S7()), 6);
                                    LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = LuckyMoneyPrepareUI.this;
                                    C69242l1.m81603i(luckyMoneyPrepareUI2, 2, luckyMoneyPrepareUI2.f200700Y, luckyMoneyPrepareUI2.f200743x0, true);
                                    LuckyMoneyPrepareUI.this.f200736u.postDelayed(new Runnable() {
                                        public void run() {
                                            View view = LuckyMoneyPrepareUI.this.f200736u;
                                            C9556a aVar = new C9556a();
                                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                            aVar.mo10233c(8);
                                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$41$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$41$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            LuckyMoneyPrepareUI.this.mo95518I7();
                                        }
                                    }, 100);
                                }
                            });
                            ((ImageView) findViewById(C0966R.C0970id.ghn)).setOnClickListener(new C7089c0() {
                                /* renamed from: a */
                                public void mo2066a(View view) {
                                    View view2 = LuckyMoneyPrepareUI.this.f200736u;
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(8);
                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$42", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$42", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    LuckyMoneyPrepareUI.this.mo95518I7();
                                }
                            });
                            mo95766P7(i4, intent2);
                        } else {
                            Map<String, String> parseXml = XmlParser.parseXml(this.f200691T0, "msg", (String) null);
                            if (parseXml == null) {
                                Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                                finish();
                                return;
                            }
                            String str2 = parseXml.get(".msg.appmsg.wcpayinfo.paymsgid");
                            if (C75846b.zx0().Bx0().mo57182a(str2)) {
                                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                                if (!C69242l1.m81614t(this.f200691T0, stringExtra, 1)) {
                                    Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                                    C75846b.zx0().Bx0().mo57183b(str2);
                                }
                            } else {
                                Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
                            }
                            mo95766P7(i4, intent2);
                            RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct = new RedEnvSendWithEmoticonDataStruct();
                            this.f200720m1 = redEnvSendWithEmoticonDataStruct;
                            redEnvSendWithEmoticonDataStruct.f156788d = (long) this.f200724o1;
                            IEmojiInfo iEmojiInfo = this.f200718k1;
                            String md5 = iEmojiInfo == null ? str : iEmojiInfo.getMd5();
                            RedEnvSendWithEmoticonDataStruct redEnvSendWithEmoticonDataStruct2 = this.f200720m1;
                            redEnvSendWithEmoticonDataStruct2.f156789e = redEnvSendWithEmoticonDataStruct2.mo86045b("emoticonMd5", md5, true);
                            this.f200720m1.mo86054n();
                            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "Report RedEnvSendWithEmoticonDataStruct, Scene: %d, md5: %s", Integer.valueOf(this.f200724o1), md5);
                            finish();
                        }
                        if (intent2 != null) {
                            str = intent2.getStringExtra("key_trans_id");
                        }
                        mo95763M7(str);
                        break;
                    }
                    break;
                case 2:
                    if (i4 != -1 || intent2 == null) {
                        if (i4 == 0) {
                            Intent intent3 = new Intent();
                            intent3.setClass(getContext(), LuckyMoneyMyRecordUI.class);
                            intent3.putExtra("key_username", getIntent().getStringExtra("key_username"));
                            intent3.putExtra("key_type", 1);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent3);
                            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            break;
                        }
                    } else {
                        String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95770S7()), 7, stringExtra2);
                        if (Util.isNullOrNil(stringExtra2)) {
                            finish();
                            break;
                        } else {
                            doSceneProgress(new C69245l2(stringExtra2.replaceAll(",", "|"), this.f200726p0, 1, "v1.0"));
                            break;
                        }
                    }
                    break;
                case 3:
                    if (intent2 != null && intent2.hasExtra("result_data")) {
                        Bundle bundleExtra = intent2.getBundleExtra("result_data");
                        if (bundleExtra == null) {
                            Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY bundle is null");
                            break;
                        } else {
                            int i5 = Util.getInt(bundleExtra.getString("payState", "2"), 0);
                            Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "onActivityResult REQUEST_CODE_H5_PAY payState is " + i5 + ";STATE_H5_PAY_SUCC=" + 0);
                            if (i5 == 0) {
                                int i6 = this.f200700Y;
                                C75846b.f222485q = i6;
                                if (this.f200741w1) {
                                    if (this.f200744x1) {
                                        C115669n.INSTANCE.mo160131h(22237, 4);
                                    } else if (i6 != 1) {
                                        C115669n.INSTANCE.mo160131h(22237, 3);
                                    }
                                }
                                finish();
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    if (i4 == -1) {
                        if (intent2 != null) {
                            str = intent2.getStringExtra("key_trans_id");
                        }
                        mo95763M7(str);
                    }
                    finish();
                    break;
                case 5:
                    if (i4 != -1) {
                        mo95765O7(false);
                        C115669n.INSTANCE.mo160131h(16822, 2);
                        break;
                    } else {
                        this.f200740w.removeAllViews();
                        mo95765O7(true);
                        break;
                    }
                case 6:
                    if (i4 == -1) {
                        String stringExtra3 = intent2.getStringExtra("Select_Contact");
                        this.f200709f1 = stringExtra3;
                        Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "select user: %s", stringExtra3);
                        if (!Util.isNullOrNil(this.f200709f1)) {
                            C78039a.m94189a(this.f200684R, this.f200709f1);
                            this.f200687S.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), C75228t.m90246g(((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(this.f200709f1, this.f200708e1), 8), this.f200687S.getTextSize()));
                            this.f200684R.setVisibility(0);
                            this.f200687S.setVisibility(0);
                        }
                    }
                    mo95263Q(true, 0);
                    break;
            }
        } else if (i4 == -1) {
            if (intent2 != null) {
                str = intent2.getStringExtra("gif_md5");
            }
            if (!Util.isNullOrNil(str)) {
                IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(str);
                this.f200718k1 = r2;
                mo95776Y7(r2);
            } else {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "md5 == null go emoji capture failed!");
            }
        } else {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "go emoji capture failed!");
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("KEY_FINISH_ACTIVITY_REASON", "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED");
        setResult(-1, intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.a37));
        setActionbarElementColor(getResources().getColor(C0966R.color.FG_0));
        hideActionbarLine();
        this.f200700Y = getIntent().getIntExtra("key_type", 1);
        this.f200702Z = getIntent().getIntExtra("key_way", 3);
        int intExtra = getIntent().getIntExtra("key_from", 0);
        this.f200682Q0 = intExtra;
        this.f200746y0 = intExtra == 1;
        this.f200693U0 = getIntent().getIntExtra("pay_channel", -1);
        this.f200735t1 = getIntent().getStringExtra("key_session_id");
        this.f200749z1 = getIntent().getBooleanExtra("key_enter_from_quick_send_packet", false);
        this.f200655C1 = C76577a.m92165p(MMApplicationContext.getContext());
        if (this.f200682Q0 == 1) {
            if (this.f200702Z == 1) {
                this.f200657D1 = 3;
                C115669n.INSTANCE.mo160131h(25925, 3, 3, Float.valueOf(this.f200655C1), 0, 0);
            } else {
                this.f200657D1 = 1;
                C115669n.INSTANCE.mo160131h(25925, 3, 1, Float.valueOf(this.f200655C1), 0, 0);
            }
        }
        mo95765O7(false);
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_revert_redenvelopes_launchmode_config, 1) == 1;
        if (mo95771T7() && (i = C75846b.f222485q) >= 0 && z) {
            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "use cached hb type: %s", Integer.valueOf(i));
            int i2 = C75846b.f222485q;
            this.f200700Y = i2;
            this.f200741w1 = true;
            if (i2 != 1) {
                C115669n.INSTANCE.mo160131h(22237, 1);
            }
        }
        if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
            this.f200685R0 = C75846b.zx0().yx0().mo95393a();
            C69239k1 yx02 = C75846b.zx0().yx0();
            if (yx02.f199261b == null) {
                yx02.mo95394b();
            }
            this.f200688S0 = yx02.f199261b;
        } else if (this.f200682Q0 == 3) {
            C69277z0 xx02 = C75846b.zx0().xx0();
            if (xx02.f199395a == null) {
                xx02.mo95416a();
            }
            this.f200685R0 = xx02.f199395a;
            C69277z0 xx03 = C75846b.zx0().xx0();
            if (xx03.f199396b == null) {
                xx03.mo95416a();
            }
            this.f200688S0 = xx03.f199396b;
        } else if (((C79445i) C86312j.m106911c(C79445i.class)).mo109188ae()) {
            C69274y0 wx02 = C75846b.zx0().wx0();
            if (wx02.f199391a == null) {
                wx02.mo95412a();
            }
            this.f200685R0 = wx02.f199391a;
        } else {
            this.f200685R0 = C75846b.zx0().vx0().mo95413a();
            C69276z vx02 = C75846b.zx0().vx0();
            if (vx02.f199394b == null) {
                vx02.mo95414b();
            }
            this.f200688S0 = vx02.f199394b;
        }
        if (this.f200682Q0 == 3) {
            setMMSubTitle((int) C0966R.string.f360988gh3);
        }
        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "mInWay:" + this.f200702Z + "mChannel:" + this.f200693U0);
        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.f200700Y + ", fromAppPanel=" + this.f200746y0 + ", config " + this.f200685R0);
        initView();
        this.f200686R1.alive();
        this.f200661F1.alive();
        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95770S7()), 1);
        C79144b.m95773a().getClass();
        this.f200706c1 = true;
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107985v6();
        C22252b.m25805b();
    }

    public void onDestroy() {
        super.onDestroy();
        C69631l1 l1Var = this.f200698X;
        ((LinkedList) l1Var.f201001a).clear();
        l1Var.f201004d = null;
        this.f200695V0.stopped();
        Dialog dialog = this.f200730r;
        if (dialog != null && dialog.isShowing()) {
            this.f200730r.dismiss();
        }
        if (this.f200711g1 != null) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "commentfooter release");
            this.f200711g1.mo100196h();
            this.f200711g1.mo100200l();
            this.f200711g1.mo100189b();
        }
        this.f200686R1.dead();
        this.f200661F1.dead();
        this.f200663G1.dead();
        if (this.f200747y1) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LUCKY_MONEY_CUSTOM_ENVELOPE_ENTRANCE_INT_SYNC;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(((Integer) i.mo119685f(aVar, 0)).intValue() + 1));
        }
        C115669n.INSTANCE.mo160131h(25925, 7, Integer.valueOf(this.f200657D1), Float.valueOf(this.f200655C1), this.f200712h.getEditText().getText(), this.f200710g.getEditText().getText());
        this.f200658E.stop();
        this.f200658E.removeListener(this.f200660F);
        this.f200660F = null;
        C75142u0 u0Var = C75142u0.f221103a;
        C0000n0 n0Var = this.f200662G;
        u0Var.getClass();
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f200662G = null;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View view = this.f200725p;
            if (view == null || !view.isShown()) {
                WcPayKeyboard wcPayKeyboard = this.f200651A1;
                if (wcPayKeyboard != null && wcPayKeyboard.isShown()) {
                    this.f200651A1.mo104741f();
                    return true;
                }
            } else {
                View view2 = this.f200725p;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (this.f200664H && this.f200656D != null) {
            this.f200658E.stop();
            View view = this.f200656D;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onPause", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f200664H = false;
        }
    }

    public void onResume() {
        super.onResume();
        this.f200664H = false;
        addSceneEndListener(1970);
        Button button = this.f200721n;
        if (300 > 0) {
            WeakReference weakReference = new WeakReference(button);
            WeakReference weakReference2 = new WeakReference(this);
            ((C119157j) C119157j.f356862d).mo183879j(new C15634g(weakReference2, weakReference, 0, "ViewId_Do_Luckymoney_Btn"), 300, "wcpay_report_check_btn_no_response");
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        final C117747y yVar2 = yVar;
        Class cls = C76324c.class;
        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "errType:" + i3 + " errCode:" + i4 + " errMsg:" + str2 + " scenetype:" + yVar.getType());
        boolean z = false;
        if (yVar2 instanceof C69224g2) {
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onsceneEnd： scene instanceof NetScenePrepareLuckyMoney");
            if (this.f200683Q1) {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "has show alert return");
                return true;
            }
            C69224g2 g2Var = (C69224g2) yVar2;
            if (i3 == 0 && i4 == 0) {
                boolean z2 = this.f200706c1;
                Dialog dialog = this.f200730r;
                if (dialog != null && dialog.isShowing() && !z2) {
                    this.f200730r.dismiss();
                }
                this.f200743x0 = g2Var.f199185n;
                String str3 = g2Var.f199182h;
                this.f200726p0 = str3;
                this.f200691T0 = g2Var.f199184j;
                this.f200704a1 = str3;
                this.f200705b1 = g2Var.f199186o;
                if (g2Var.f199284f != null) {
                    z = true;
                }
                if (z) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() NetScenePrepareLuckyMoney show JumpRemind Alert");
                    g2Var.f199284f.mo104783g(this, new C75122k() {
                        /* renamed from: a */
                        public void mo95653a(int i, String str) {
                            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onNext()");
                            if (Util.isEqual(i, 2) && Util.isEqual(str, "requestwxhb")) {
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                String str2 = LuckyMoneyPrepareUI.f200649T1;
                                luckyMoneyPrepareUI.mo95767Q7(1);
                            } else if (Util.isEqual(i, 1)) {
                                ((C16292g) C86312j.m106911c(C16292g.class)).nr0(LuckyMoneyPrepareUI.this, str, 0, true);
                            }
                        }

                        public void onCancel() {
                            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onCancel()");
                        }
                    });
                    return true;
                }
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = g2Var.f199183i;
                payInfo.f212587e = 37;
                payInfo.f212589g = this.f200693U0;
                String stringExtra = getIntent().getStringExtra("key_finder_live_username");
                if (Util.isNullOrNil(stringExtra)) {
                    stringExtra = this.f200708e1;
                }
                int i5 = (C45628s0.m50748M(stringExtra) ? WCPaySessionInfoRecorder.C72488a.EnterpriseGroup : C72996z1.m85843n5(stringExtra) ? WCPaySessionInfoRecorder.C72488a.EnterpriseSingle : C72996z1.m85807K5(stringExtra) ? WCPaySessionInfoRecorder.C72488a.Group : C72996z1.m85809L5(stringExtra) ? WCPaySessionInfoRecorder.C72488a.Single : WCPaySessionInfoRecorder.C72488a.Unknown).f210873d;
                Bundle bundle = new Bundle();
                payInfo.f212600u = bundle;
                bundle.putInt("chat_type", i5);
                payInfo.f212600u.putInt("send_type", 2);
                if (this.f200706c1) {
                    ((C76324c) C86312j.m106911c(cls)).startSNSPay(this, payInfo);
                } else {
                    C76331i.m91761e(this, payInfo, 1);
                }
                return true;
            }
            Dialog dialog2 = this.f200730r;
            if (dialog2 != null && dialog2.isShowing()) {
                this.f200730r.dismiss();
            }
            if (i4 == 401) {
                this.f200721n.setEnabled(false);
                this.f200721n.setClickable(false);
                this.f200695V0.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                C76879j.m92726T(this, str2);
                return true;
            } else if (i4 == 268502454) {
                C76879j.m92749t(this, str2, "", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (C69224g2.m81567m1(yVar2)) {
                            LuckyMoneyPrepareUI.this.finish();
                        }
                    }
                });
                return true;
            } else {
                this.f200689S1 = 2;
                C76879j.m92713G(this, TextUtils.isEmpty(str) ? getString(C0966R.string.l_3) : str2, (String) null, false, new DialogInterface.OnClickListener(this) {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                return true;
            }
        } else {
            if (yVar2 instanceof C69245l2) {
                if (i3 == 0 && i4 == 0) {
                    if (this.f200746y0) {
                        C75026b.m89951a(this, getString(C0966R.string.fjh));
                        MMHandlerThread.postToMainThreadDelayed(new Runnable() {
                            public void run() {
                                LuckyMoneyPrepareUI.this.finish();
                            }
                        }, 1800);
                    } else {
                        mo95517H7();
                        View view = this.f200738v;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f200738v.postDelayed(new Runnable() {
                            public void run() {
                                Intent intent = new Intent();
                                intent.putExtra("key_username", LuckyMoneyPrepareUI.this.f200708e1);
                                intent.setClass(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyIndexUI.class);
                                intent.addFlags(67108864);
                                AppCompatActivity context = LuckyMoneyPrepareUI.this.getContext();
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                AppCompatActivity appCompatActivity = context;
                                C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$33", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context.startActivity((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$33", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                LuckyMoneyPrepareUI.this.finish();
                            }
                        }, 1000);
                    }
                    return true;
                } else if (i4 == 402) {
                    C76879j.m92707A(getContext(), str, "", getString(C0966R.string.gj5), getString(C0966R.string.f7926wf), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent();
                            intent.setClass(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyMyRecordUI.class);
                            intent.putExtra("key_type", 1);
                            intent.putExtra("key_username", LuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username"));
                            LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                            C9556a aVar = new C9556a();
                            aVar.mo10233c(intent);
                            LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = luckyMoneyPrepareUI;
                            C117292a.m165358d(luckyMoneyPrepareUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$34", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            luckyMoneyPrepareUI.startActivity((Intent) aVar.mo10231a(0));
                            C117292a.m165359e(luckyMoneyPrepareUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$34", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }, new DialogInterface.OnClickListener(this) {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    return true;
                }
            } else if (yVar2 instanceof C69271w1) {
                Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig resp,errType=" + i3 + ";errCode=" + i4 + ";errMsg=" + str2);
                Dialog dialog3 = this.f200732s;
                if (dialog3 != null && dialog3.isShowing()) {
                    this.f200732s.dismiss();
                }
                Dialog dialog4 = this.f200734t;
                if (dialog4 != null && dialog4.isShowing()) {
                    this.f200734t.dismiss();
                }
                if (i3 == 0 && i4 == 0) {
                    final C69271w1 w1Var = (C69271w1) yVar2;
                    this.f200677N1 = true;
                    this.f200722n1 = w1Var.f199347B;
                    if (!Util.isEqual(w1Var.f199348C, 1)) {
                        this.f200714i.f200809f.setVisibility(8);
                    } else {
                        LuckyMoneyTextInputView luckyMoneyTextInputView = this.f200714i;
                        luckyMoneyTextInputView.f200809f.setVisibility(0);
                        luckyMoneyTextInputView.f200810g.setVisibility(0);
                        luckyMoneyTextInputView.f200811h.setVisibility(8);
                        IEmojiInfo iEmojiInfo = this.f200718k1;
                        if (iEmojiInfo != null && !Util.isNullOrNil(iEmojiInfo.getMd5())) {
                            LuckyMoneyTextInputView luckyMoneyTextInputView2 = this.f200714i;
                            IEmojiInfo iEmojiInfo2 = this.f200718k1;
                            luckyMoneyTextInputView2.f200809f.setTag("delete");
                            luckyMoneyTextInputView2.f200810g.setVisibility(8);
                            luckyMoneyTextInputView2.f200811h.setVisibility(0);
                            luckyMoneyTextInputView2.f200811h.setEmojiInfo(iEmojiInfo2);
                        }
                        this.f200714i.setmOnEmojiSelectClickListener(new C7089c0() {
                            /* renamed from: a */
                            public void mo2066a(View view) {
                                LuckyMoneyPrepareUI.this.f200719l1 = new RedEnvSendWithEmoticonClickStruct();
                                RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = LuckyMoneyPrepareUI.this.f200719l1;
                                redEnvSendWithEmoticonClickStruct.f194328d = 2;
                                redEnvSendWithEmoticonClickStruct.mo86054n();
                                final boolean isEqual = Util.isEqual(view.getTag(), (Object) "delete");
                                if (isEqual || Util.isEqual(w1Var.f199347B, 1)) {
                                    C8371g gVar = new C8371g((Context) LuckyMoneyPrepareUI.this.getContext(), 1, false);
                                    gVar.f225771i = new C11182m0() {
                                        public void onCreateMMMenu(C76874e0 e0Var) {
                                            if (!isEqual) {
                                                if (Util.isEqual(w1Var.f199347B, 1)) {
                                                    e0Var.mo107125a(1, C0966R.string.ghp);
                                                }
                                                e0Var.mo107125a(2, C0966R.string.giz);
                                                return;
                                            }
                                            e0Var.mo107140d(3, LuckyMoneyPrepareUI.this.getResources().getColor(C0966R.color.a3f), LuckyMoneyPrepareUI.this.getContext().getString(C0966R.string.gf8));
                                        }
                                    };
                                    gVar.f225782p = new C11184p0() {
                                        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                                            Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", Integer.valueOf(menuItem.getItemId()));
                                            int itemId = menuItem.getItemId();
                                            if (itemId == 1) {
                                                LuckyMoneyPrepareUI.this.f200727p1 = 1;
                                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                                ((C67308r1) C86312j.m106911c(C67308r1.class)).mo58290YL(luckyMoneyPrepareUI, 4, luckyMoneyPrepareUI.f200708e1);
                                                LuckyMoneyPrepareUI.this.f200719l1 = new RedEnvSendWithEmoticonClickStruct();
                                                RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = LuckyMoneyPrepareUI.this.f200719l1;
                                                redEnvSendWithEmoticonClickStruct.f194328d = 4;
                                                redEnvSendWithEmoticonClickStruct.mo86054n();
                                            } else if (itemId == 2) {
                                                LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = LuckyMoneyPrepareUI.this;
                                                luckyMoneyPrepareUI2.f200727p1 = 2;
                                                LuckyMoneyPrepareUI.m81934K7(luckyMoneyPrepareUI2);
                                            } else if (itemId == 3) {
                                                LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = LuckyMoneyPrepareUI.this;
                                                luckyMoneyPrepareUI3.f200724o1 = 1;
                                                LuckyMoneyTextInputView luckyMoneyTextInputView = luckyMoneyPrepareUI3.f200714i;
                                                luckyMoneyTextInputView.f200809f.setTag("");
                                                luckyMoneyTextInputView.f200810g.setVisibility(0);
                                                luckyMoneyTextInputView.f200811h.setVisibility(8);
                                                LuckyMoneyPrepareUI luckyMoneyPrepareUI4 = LuckyMoneyPrepareUI.this;
                                                luckyMoneyPrepareUI4.f200718k1 = null;
                                                luckyMoneyPrepareUI4.f200719l1 = new RedEnvSendWithEmoticonClickStruct();
                                                RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct2 = LuckyMoneyPrepareUI.this.f200719l1;
                                                redEnvSendWithEmoticonClickStruct2.f194328d = 5;
                                                redEnvSendWithEmoticonClickStruct2.mo86054n();
                                            }
                                        }
                                    };
                                    gVar.mo107573q();
                                    return;
                                }
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                luckyMoneyPrepareUI.f200727p1 = 2;
                                LuckyMoneyPrepareUI.m81934K7(luckyMoneyPrepareUI);
                            }
                        });
                    }
                    if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
                        this.f200685R0 = C75846b.zx0().yx0().mo95393a();
                    } else if (this.f200682Q0 == 3) {
                        C69277z0 xx02 = C75846b.zx0().xx0();
                        if (xx02.f199395a == null) {
                            xx02.mo95416a();
                        }
                        this.f200685R0 = xx02.f199395a;
                    } else {
                        this.f200685R0 = C75846b.zx0().vx0().mo95413a();
                    }
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.f200685R0);
                    this.f200699X0 = w1Var.f199360q;
                    this.f200697W0 = w1Var.f199359p;
                    this.f200701Y0 = w1Var.f199367x;
                    if (Util.isNullOrNil(this.f200707d1)) {
                        this.f200707d1 = w1Var.f199362s;
                    }
                    if (!Util.isNullOrNil(this.f200701Y0) && this.f200714i != null) {
                        MMHandlerThread.postToMainThread(new Runnable() {
                            public void run() {
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                luckyMoneyPrepareUI.f200714i.setHintText(luckyMoneyPrepareUI.f200701Y0);
                            }
                        });
                    }
                    if (w1Var.f199355i && this.f200746y0) {
                        TextView textView = (TextView) findViewById(C0966R.C0970id.ghp);
                        textView.setOnClickListener(new C7089c0() {
                            /* renamed from: a */
                            public void mo2066a(View view) {
                                C115669n nVar = C115669n.INSTANCE;
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI = LuckyMoneyPrepareUI.this;
                                String str = LuckyMoneyPrepareUI.f200649T1;
                                nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(luckyMoneyPrepareUI.mo95770S7()), 9);
                                Intent intent = new Intent();
                                intent.setClass(LuckyMoneyPrepareUI.this.getContext(), LuckyMoneyCanShareListUI.class);
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI2 = LuckyMoneyPrepareUI.this;
                                C9556a aVar = new C9556a();
                                aVar.mo10233c(intent);
                                LuckyMoneyPrepareUI luckyMoneyPrepareUI3 = luckyMoneyPrepareUI2;
                                C117292a.m165358d(luckyMoneyPrepareUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$38", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                luckyMoneyPrepareUI2.startActivity((Intent) aVar.mo10231a(0));
                                C117292a.m165359e(luckyMoneyPrepareUI3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPrepareUI$38", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        });
                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95770S7()), 8);
                        textView.setVisibility(8);
                    }
                    C77933g43 g432 = w1Var.f199353H;
                    if (g432 != null) {
                        this.f200696W.setBannerData(g432);
                    } else if (!Util.isNullOrNil(w1Var.f199357n)) {
                        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + w1Var.f199357n);
                        this.f200745y.setText(w1Var.f199357n);
                        if (!Util.isNullOrNil(w1Var.f199358o)) {
                            this.f200745y.setOnClickListener(new C7089c0() {
                                /* renamed from: a */
                                public void mo2066a(View view) {
                                    C75228t.m90219L(LuckyMoneyPrepareUI.this.getContext(), w1Var.f199358o, false);
                                }
                            });
                        }
                        this.f200745y.setVisibility(0);
                    } else {
                        this.f200745y.setVisibility(8);
                    }
                    C69558a3.C69561c cVar = new C69558a3.C69561c();
                    C69248m2 m2Var = w1Var.f199365v;
                    if (m2Var == null || Util.isNullOrNil(m2Var.f199273g)) {
                        cVar.f200852a = getResources().getColor(C0966R.color.f3552xi);
                    } else {
                        cVar.f200852a = getResources().getColor(C0966R.color.ajd);
                    }
                    this.f200740w.removeAllViews();
                    C69248m2 m2Var2 = w1Var.f199365v;
                    this.f200659E1 = m2Var2.f199271e;
                    C69558a3.m81995a(this, this.f200740w, m2Var2, cVar);
                    int i6 = this.f200700Y;
                    if (i6 == 1 || i6 == 3) {
                        mo95774W7(this.f200712h.getInput(), this.f200699X0);
                    }
                    mo95778a8();
                    if (C69242l1.m81609o(getIntent().getStringExtra("key_username"))) {
                        C69239k1 yx02 = C75846b.zx0().yx0();
                        if (yx02.f199261b == null) {
                            yx02.mo95394b();
                        }
                        this.f200688S0 = yx02.f199261b;
                    } else if (this.f200682Q0 == 3) {
                        C69277z0 xx03 = C75846b.zx0().xx0();
                        if (xx03.f199396b == null) {
                            xx03.mo95416a();
                        }
                        this.f200688S0 = xx03.f199396b;
                    } else {
                        C69276z vx02 = C75846b.zx0().vx0();
                        if (vx02.f199394b == null) {
                            vx02.mo95414b();
                        }
                        this.f200688S0 = vx02.f199394b;
                    }
                    init();
                    C69230i iVar = this.f200688S0;
                    if (iVar != null) {
                        C77994sf2 sf22 = iVar.f199197a;
                        if (sf22 != null) {
                            this.f200729q1 = sf22.f228218y;
                            this.f200731r1 = sf22.f228216w;
                            this.f200733s1 = sf22.f228217x;
                        }
                        mo95779b8(sf22);
                        C115669n.INSTANCE.mo175911u(991, 10);
                    } else {
                        mo95779b8((C77994sf2) null);
                    }
                    if (this.f200680P1) {
                        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "doRMBPrePareBtnClick()");
                        mo95769R7(this.f200665H1, this.f200667I1, this.f200669J1, this.f200671K1, this.f200673L1, this.f200675M1);
                    }
                } else if (this.f200680P1) {
                    C76912y0.makeText((Context) this, (CharSequence) Util.isNullOrNil(str) ? getString(C0966R.string.f7966xq) : str2, 0).show();
                }
                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfig waitingGetConfig:%s ifAutoRMBPrePareBtn:%s", Boolean.valueOf(this.f200678O1), Boolean.valueOf(this.f200680P1));
                this.f200678O1 = false;
                this.f200680P1 = false;
                return true;
            } else if (yVar2 instanceof C78512f) {
                Log.m105925i("MicroMsg.LuckyMoneyPrepareUI", "NetSceneLuckyMoneyGetConfigHK resp,errType = %s,errCode = %s, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str2);
                if (i3 == 0 && i4 == 0) {
                    C78512f fVar = (C78512f) yVar2;
                    this.f200699X0 = fVar.f229961i;
                    this.f200697W0 = fVar.f229960h;
                    mo95774W7(this.f200712h.getInput(), this.f200699X0);
                    C69274y0 wx02 = C75846b.zx0().wx0();
                    if (wx02.f199391a == null) {
                        wx02.mo95412a();
                    }
                    this.f200685R0 = wx02.f199391a;
                    mo95778a8();
                    init();
                    return true;
                }
            } else if (yVar2 instanceof C69275y1) {
                removeSceneEndListener(1647);
                Dialog dialog5 = this.f200730r;
                if (dialog5 != null && dialog5.isShowing()) {
                    this.f200730r.dismiss();
                }
                if (i3 == 0 && i4 == 0) {
                    String str4 = ((C69275y1) yVar2).f199392h;
                    if (!Util.isNullOrNil(str4)) {
                        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "payUrl is not null");
                        C75228t.m90220M(getContext(), str4, false, 3);
                    } else {
                        Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "payUrl is null");
                    }
                    return true;
                }
            } else if (yVar2 instanceof C47923d) {
                if (i3 == 0 && i4 == 0) {
                    boolean z3 = this.f200706c1;
                    Dialog dialog6 = this.f200730r;
                    if (dialog6 != null && dialog6.isShowing() && !z3) {
                        this.f200730r.dismiss();
                    }
                    C47923d dVar = (C47923d) yVar2;
                    if (C72506r.m84839e(dVar.f128600g.f142089i)) {
                        Dialog dialog7 = this.f200730r;
                        if (dialog7 != null) {
                            dialog7.dismiss();
                        }
                        C72506r rVar = new C72506r(this);
                        rVar.mo99913c(dVar.f128600g.f142089i, new C72514w(rVar));
                        return true;
                    }
                    this.f200704a1 = dVar.f128602i;
                    this.f200705b1 = dVar.f128603j;
                    PayInfo payInfo2 = new PayInfo();
                    String str5 = dVar.f128601h;
                    payInfo2.f212592j = str5;
                    payInfo2.f212587e = 37;
                    if (this.f200706c1) {
                        if (payInfo2.f212600u == null) {
                            payInfo2.f212600u = new Bundle();
                        }
                        payInfo2.f212600u.putBoolean("isF2FHongBao", true);
                        ((C76324c) C86312j.m106911c(cls)).startSNSPay(this, payInfo2);
                    } else {
                        C75155x0.m90137c(37, str5, i4);
                        C76331i.m91761e(this, payInfo2, 4);
                    }
                } else {
                    C75155x0.m90137c(37, "", i4);
                    if (!Util.isNullOrNil(str)) {
                        C76879j.m92748s(this, str2, getString(C0966R.string.get));
                    }
                    this.f200730r.dismiss();
                }
                return true;
            } else if (yVar2 instanceof C42514c2) {
                return true;
            }
            return false;
        }
    }

    public void onStop() {
        super.onStop();
        removeSceneEndListener(1970);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(LuckyMoneyPrepareUIAccessibilityConfig.class);
    }
}
