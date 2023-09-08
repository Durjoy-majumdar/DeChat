package com.tencent.p014mm.plugin.remittance.p098ui;

import al3.C0086a;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import b63.C67175a;
import bl3.C39818r;
import c53.C67342b;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.F2fPayCheckEvent;
import com.tencent.p014mm.autogen.events.RemittanceLargeMoneyPayEvent;
import com.tencent.p014mm.autogen.events.WalletErrorCodeDialogClickEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.remittance.model.C42839e0;
import com.tencent.p014mm.plugin.remittance.model.C42851q;
import com.tencent.p014mm.plugin.remittance.model.C42852q0;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.plugin.remittance.model.C5061w0;
import com.tencent.p014mm.plugin.remittance.model.C57179r0;
import com.tencent.p014mm.plugin.remittance.model.C70584f0;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;
import com.tencent.p014mm.plugin.remittance.model.C70614v0;
import com.tencent.p014mm.plugin.remittance.model.MsgCheckTaskMgr;
import com.tencent.p014mm.plugin.remittance.p098ui.C70905k0;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.plugin.wallet_payu.balance.p891ui.WalletPayUBalanceResultUI;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tenpay.android.wechat.MyKeyboardWindow;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import g63.C45890a;
import he0.C76158j;
import ie3.C76324c;
import j20.C117292a;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import oi2.C77010f;
import p196ln.C10579k;
import p196ln.C10581n;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p286zl.C16292g;
import p629ny.C76979h;
import p910lj.C76701a;
import q43.C77302a;
import qe0.C47806g;
import qo3.C101218e0;
import qo3.C47883u;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77426q;
import te3.C64737tr;
import te3.C77935gl2;
import te3.C77965lu;
import te3.yk4;
import ub3.C78144b;
import v53.C78348k0;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

@C88989a(2)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI */
public abstract class RemittanceNewBaseUI extends WalletBaseUI implements C10579k.C10580a, WcPayKeyboard.C75086f {

    /* renamed from: K1 */
    public static final /* synthetic */ int f204930K1 = 0;

    /* renamed from: A */
    public LinearLayout f204931A;

    /* renamed from: A1 */
    public boolean f204932A1;

    /* renamed from: B */
    public LinearLayout f204933B;

    /* renamed from: B1 */
    public IListener f204934B1;

    /* renamed from: C */
    public LinearLayout f204935C;

    /* renamed from: C1 */
    public C77965lu f204936C1;

    /* renamed from: D */
    public RelativeLayout f204937D;

    /* renamed from: D1 */
    public IListener f204938D1;

    /* renamed from: E */
    public TextView f204939E;

    /* renamed from: E1 */
    public int f204940E1;

    /* renamed from: F */
    public RelativeLayout f204941F;

    /* renamed from: F1 */
    public double f204942F1;

    /* renamed from: G */
    public String f204943G = "";

    /* renamed from: G1 */
    public String f204944G1;

    /* renamed from: H */
    public String f204945H = "";

    /* renamed from: H1 */
    public String f204946H1;

    /* renamed from: I */
    public String f204947I;

    /* renamed from: I1 */
    public String f204948I1;

    /* renamed from: J */
    public String f204949J;

    /* renamed from: J1 */
    public IListener<F2fPayCheckEvent> f204950J1;

    /* renamed from: K */
    public int f204951K;

    /* renamed from: L */
    public String f204952L;

    /* renamed from: M */
    public String f204953M = null;

    /* renamed from: N */
    public String f204954N = null;

    /* renamed from: P */
    public int f204955P;

    /* renamed from: Q */
    public int f204956Q;

    /* renamed from: Q0 */
    public C70587h0 f204957Q0;

    /* renamed from: R */
    public int f204958R = 4;

    /* renamed from: R0 */
    public C57179r0 f204959R0;

    /* renamed from: S */
    public int f204960S;

    /* renamed from: S0 */
    public WCPayLargeAmountTransferReportStruct f204961S0;

    /* renamed from: T */
    public String f204962T;

    /* renamed from: T0 */
    public boolean f204963T0 = false;

    /* renamed from: U */
    public String f204964U;

    /* renamed from: U0 */
    public String f204965U0;

    /* renamed from: V */
    public String f204966V;

    /* renamed from: V0 */
    public C101218e0 f204967V0;

    /* renamed from: W */
    public String f204968W;

    /* renamed from: W0 */
    public RemittanceRemarkInputHalfPage f204969W0;

    /* renamed from: X */
    public String f204970X = "";

    /* renamed from: X0 */
    public long f204971X0;

    /* renamed from: Y */
    public Map<String, PayCheckStrut> f204972Y = new HashMap();

    /* renamed from: Y0 */
    public String f204973Y0;

    /* renamed from: Z */
    public String f204974Z;

    /* renamed from: Z0 */
    public long f204975Z0;

    /* renamed from: a1 */
    public boolean f204976a1 = false;

    /* renamed from: b1 */
    public String f204977b1 = "";

    /* renamed from: c1 */
    public String f204978c1 = "";

    /* renamed from: d */
    public C77302a f204979d = null;

    /* renamed from: d1 */
    public int f204980d1 = 0;

    /* renamed from: e */
    public double f204981e;

    /* renamed from: e1 */
    public int f204982e1 = 2;

    /* renamed from: f */
    public String f204983f;

    /* renamed from: f1 */
    public boolean f204984f1 = true;

    /* renamed from: g */
    public String f204985g;

    /* renamed from: g1 */
    public LinearLayout f204986g1;

    /* renamed from: h */
    public String f204987h;

    /* renamed from: h1 */
    public LinearLayout f204988h1;

    /* renamed from: i */
    public int f204989i;

    /* renamed from: i1 */
    public TextView f204990i1;

    /* renamed from: j */
    public int f204991j;

    /* renamed from: j1 */
    public CdnImageView f204992j1;

    /* renamed from: k1 */
    public CdnImageView f204993k1;

    /* renamed from: l1 */
    public TextView f204994l1;

    /* renamed from: m1 */
    public LinearLayout f204995m1;

    /* renamed from: n */
    public int f204996n = -1;

    /* renamed from: n1 */
    public LinearLayout f204997n1;

    /* renamed from: o */
    public String f204998o;

    /* renamed from: o1 */
    public TextView f204999o1;

    /* renamed from: p */
    public WcPayKeyboard f205000p;

    /* renamed from: p0 */
    public String f205001p0;

    /* renamed from: p1 */
    public TextView f205002p1;

    /* renamed from: q */
    public WalletFormView f205003q;

    /* renamed from: q1 */
    public TextView f205004q1;

    /* renamed from: r */
    public ImageView f205005r;

    /* renamed from: r1 */
    public ProgressBar f205006r1;

    /* renamed from: s */
    public TextView f205007s;

    /* renamed from: s1 */
    public TextView f205008s1;

    /* renamed from: t */
    public TextView f205009t;

    /* renamed from: t1 */
    public boolean f205010t1 = false;

    /* renamed from: u */
    public TextView f205011u;

    /* renamed from: u1 */
    public int f205012u1 = 0;

    /* renamed from: v */
    public TextView f205013v;

    /* renamed from: v1 */
    public Runnable f205014v1 = new Runnable() {
        public void run() {
            RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
            if (remittanceNewBaseUI.f205012u1 == 2 && remittanceNewBaseUI.isHandleAutoShowNormalStWcKb()) {
                RemittanceNewBaseUI.this.showNormalStWcKb();
            }
        }
    };

    /* renamed from: w */
    public TextView f205015w;

    /* renamed from: w1 */
    public IListener f205016w1;

    /* renamed from: x */
    public TextView f205017x;

    /* renamed from: x0 */
    public boolean f205018x0 = false;

    /* renamed from: x1 */
    public boolean f205019x1;

    /* renamed from: y */
    public TextView f205020y;

    /* renamed from: y0 */
    public boolean f205021y0 = false;

    /* renamed from: y1 */
    public boolean f205022y1;

    /* renamed from: z */
    public ScrollView f205023z;

    /* renamed from: z1 */
    public boolean f205024z1;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$PayCheckStrut */
    public static class PayCheckStrut {

        /* renamed from: a */
        public String f205090a;

        /* renamed from: b */
        public String f205091b;

        /* renamed from: c */
        public String f205092c;

        /* renamed from: d */
        public String f205093d;

        /* renamed from: e */
        public int f205094e;

        /* renamed from: f */
        public String f205095f;

        /* renamed from: g */
        public String f205096g;

        /* renamed from: h */
        public String f205097h;

        /* renamed from: i */
        public long f205098i;

        public PayCheckStrut(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, long j) {
            this.f205090a = str;
            this.f205091b = str2;
            this.f205092c = str3;
            this.f205093d = str4;
            this.f205094e = i;
            this.f205095f = str5;
            this.f205096g = str6;
            this.f205097h = str7;
            this.f205098i = j;
        }
    }

    public RemittanceNewBaseUI() {
        C76577a.m92151b(MMApplicationContext.getContext(), 270);
        C40008f fVar = C40008f.f107254d;
        this.f205016w1 = new IListener<WalletErrorCodeDialogClickEvent>(fVar) {
            {
                this.__eventId = -260010650;
            }

            public boolean callback(IEvent iEvent) {
                WalletErrorCodeDialogClickEvent walletErrorCodeDialogClickEvent = (WalletErrorCodeDialogClickEvent) iEvent;
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f204976a1) {
                    C57179r0 r0Var = remittanceNewBaseUI.f204959R0;
                    if (r0Var == null || !Util.isEqual(r0Var.getReqResp().getUri(), walletErrorCodeDialogClickEvent.f194036d.f194037a) || !Util.isEqual(RemittanceNewBaseUI.this.f204959R0.f163881r.f185670n, 1)) {
                        return false;
                    }
                    RemittanceNewBaseUI.this.finish();
                    return false;
                }
                C70587h0 h0Var = remittanceNewBaseUI.f204957Q0;
                if (h0Var == null || !Util.isEqual(h0Var.getUri(), walletErrorCodeDialogClickEvent.f194036d.f194037a) || !Util.isEqual(RemittanceNewBaseUI.this.f204957Q0.f204089T, 1)) {
                    return false;
                }
                RemittanceNewBaseUI.this.finish();
                return false;
            }
        };
        this.f205019x1 = false;
        this.f205022y1 = false;
        this.f205024z1 = false;
        this.f204932A1 = false;
        this.f204934B1 = new IListener<RemittanceLargeMoneyPayEvent>(fVar) {
            {
                this.__eventId = -84556123;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceLargeMoneyPayEvent.C67776a aVar;
                RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent = (RemittanceLargeMoneyPayEvent) iEvent;
                if (remittanceLargeMoneyPayEvent == null || (aVar = remittanceLargeMoneyPayEvent.f193891d) == null) {
                    Log.m105924i("MicroMsg.RemittanceNewBaseUI", "event == null || event.data == null");
                } else {
                    Log.m105925i("MicroMsg.RemittanceNewBaseUI", "LargeMoney callback，mPlaceOrderAttach：%s event:%s", RemittanceNewBaseUI.this.f205001p0, aVar.f193892a);
                    if (Util.isNullOrNil(RemittanceNewBaseUI.this.f205001p0)) {
                        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "carsonhe mPlaceOrderAttach is null ");
                    } else if (!RemittanceNewBaseUI.this.f205001p0.equals(remittanceLargeMoneyPayEvent.f193891d.f193892a)) {
                        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "mPlaceOrderAttach not equals ");
                    } else {
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        remittanceNewBaseUI.f204981e = remittanceLargeMoneyPayEvent.f193891d.f193893b;
                        remittanceNewBaseUI.mo97428K7(remittanceNewBaseUI.f205001p0);
                    }
                }
                return false;
            }
        };
        this.f204936C1 = null;
        this.f204938D1 = new IListener<F2fDynamicStartPayEvent>(fVar) {
            {
                this.__eventId = -1113934945;
            }

            public boolean callback(IEvent iEvent) {
                F2fDynamicStartPayEvent f2fDynamicStartPayEvent = (F2fDynamicStartPayEvent) iEvent;
                if (f2fDynamicStartPayEvent.f193584d.f193587c == 1) {
                    C115669n.INSTANCE.mo160131h(15386, 4, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(15386, 5, 1);
                }
                F2fDynamicStartPayEvent.C67691a aVar = f2fDynamicStartPayEvent.f193584d;
                String str = aVar.f193585a;
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "receive dynamic req: %s, %s", Integer.valueOf(aVar.f193587c), str);
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f204991j == 33) {
                    String str2 = remittanceNewBaseUI.f204943G;
                    int i = remittanceNewBaseUI.f204996n;
                    remittanceNewBaseUI.getClass();
                    RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                    remittanceNewBaseUI.mo97430M7(str2, i, (String) null, (String) null, remittanceNewBaseUI2.f204945H, remittanceNewBaseUI2.f204947I, str, f2fDynamicStartPayEvent);
                } else {
                    String str3 = remittanceNewBaseUI.f204943G;
                    int i2 = remittanceNewBaseUI.f204996n;
                    remittanceNewBaseUI.getClass();
                    remittanceNewBaseUI.mo97430M7(str3, i2, (String) null, (String) null, RemittanceNewBaseUI.this.f204945H, (String) null, str, f2fDynamicStartPayEvent);
                }
                return false;
            }
        };
        this.f204940E1 = 0;
        this.f204942F1 = 0.0d;
        this.f204944G1 = "";
        this.f204946H1 = "";
        this.f204948I1 = "";
        this.f204950J1 = new IListener<F2fPayCheckEvent>(fVar) {
            {
                this.__eventId = 1822922800;
            }

            public boolean callback(IEvent iEvent) {
                F2fPayCheckEvent f2fPayCheckEvent = (F2fPayCheckEvent) iEvent;
                F2fPayCheckEvent.C67693a aVar = f2fPayCheckEvent.f193594d;
                String str = aVar.f193595a;
                if (aVar.f193598d) {
                    Log.m105922f("MicroMsg.RemittanceNewBaseUI", "F2fPayCheckEvent is from kinda");
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    remittanceNewBaseUI.f205021y0 = false;
                    MMHandlerThread.postToMainThreadDelayed(remittanceNewBaseUI.f205014v1, 300);
                    F2fPayCheckEvent.C67693a aVar2 = f2fPayCheckEvent.f193594d;
                    int i = aVar2.f193599e;
                    boolean z = true;
                    if (i == 1) {
                        RemittanceNewBaseUI.this.mo97427J7(str, aVar2.f193597c);
                        if (f2fPayCheckEvent.f193594d.f193600f != RemittanceNewBaseUI.this.getContext().hashCode()) {
                            Log.m105929w("MicroMsg.RemittanceNewBaseUI", "callback to wrong page: %s, %s", Integer.valueOf(f2fPayCheckEvent.f193594d.f193600f), Integer.valueOf(RemittanceNewBaseUI.this.getContext().hashCode()));
                        } else if (!Util.isNullOrNil(RemittanceNewBaseUI.this.f204968W)) {
                            C70614v0 xx02 = C77010f.vx0().xx0();
                            RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                            xx02.mo97262d(remittanceNewBaseUI2.f204974Z, remittanceNewBaseUI2.f204968W, remittanceNewBaseUI2.f204985g);
                        } else {
                            C70614v0 xx03 = C77010f.vx0().xx0();
                            RemittanceNewBaseUI remittanceNewBaseUI3 = RemittanceNewBaseUI.this;
                            xx03.mo97262d(remittanceNewBaseUI3.f204974Z, remittanceNewBaseUI3.f204985g, "");
                        }
                        RemittanceNewBaseUI remittanceNewBaseUI4 = RemittanceNewBaseUI.this;
                        if (remittanceNewBaseUI4.f204971X0 > 0) {
                            if (!Util.isNullOrNil(remittanceNewBaseUI4.f204968W)) {
                                MsgCheckTaskMgr msgCheckTaskMgr = MsgCheckTaskMgr.f115996b;
                                RemittanceNewBaseUI remittanceNewBaseUI5 = RemittanceNewBaseUI.this;
                                msgCheckTaskMgr.mo67014a(remittanceNewBaseUI5.f204968W, remittanceNewBaseUI5.f204971X0, remittanceNewBaseUI5.f204973Y0, remittanceNewBaseUI5.f204974Z, remittanceNewBaseUI5.f204975Z0);
                            } else {
                                MsgCheckTaskMgr msgCheckTaskMgr2 = MsgCheckTaskMgr.f115996b;
                                RemittanceNewBaseUI remittanceNewBaseUI6 = RemittanceNewBaseUI.this;
                                msgCheckTaskMgr2.mo67014a(remittanceNewBaseUI6.f204985g, remittanceNewBaseUI6.f204971X0, remittanceNewBaseUI6.f204973Y0, remittanceNewBaseUI6.f204974Z, remittanceNewBaseUI6.f204975Z0);
                            }
                        }
                    } else if (i == 2) {
                        RemittanceNewBaseUI remittanceNewBaseUI7 = RemittanceNewBaseUI.this;
                        int i2 = remittanceNewBaseUI7.f204989i;
                        if (!(i2 == 2 || i2 == 5)) {
                            z = false;
                        }
                        if (Util.isNullOrNil(remittanceNewBaseUI7.f204985g) || z) {
                            RemittanceNewBaseUI.this.finish();
                        } else {
                            Intent intent = new Intent();
                            intent.putExtra("Chat_User", RemittanceNewBaseUI.this.f204985g);
                            intent.putExtra("finish_direct", false);
                            C88144b.m109801s(RemittanceNewBaseUI.this, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                        }
                    }
                } else {
                    RemittanceNewBaseUI remittanceNewBaseUI8 = RemittanceNewBaseUI.this;
                    String str2 = aVar.f193597c;
                    int i3 = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI8.mo97427J7(str, str2);
                }
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m83299H7(RemittanceNewBaseUI remittanceNewBaseUI) {
        if (Util.isNullOrNil(remittanceNewBaseUI.f204943G)) {
            remittanceNewBaseUI.f205011u.setVisibility(8);
            if (remittanceNewBaseUI.f204989i == 1) {
                remittanceNewBaseUI.mo97440W7(remittanceNewBaseUI.getString(C0966R.string.hzm));
            } else {
                remittanceNewBaseUI.mo97440W7(remittanceNewBaseUI.getString(C0966R.string.hzl));
            }
            remittanceNewBaseUI.f205013v.setVisibility(0);
            return;
        }
        String string = remittanceNewBaseUI.getString(C0966R.string.i1o);
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(remittanceNewBaseUI, remittanceNewBaseUI.getString(C0966R.string.bgb, new Object[]{remittanceNewBaseUI.f204943G, string}));
        C75228t.m90253j0(remittanceNewBaseUI.f205011u, T1.toString(), T1.length() - string.length(), T1.length(), new C7092q((C7092q.C7093a) new C7092q.C7093a() {
            public void onClick(View view) {
                RemittanceNewBaseUI.m83300I7(RemittanceNewBaseUI.this);
            }
        }, true), remittanceNewBaseUI.getContext());
        remittanceNewBaseUI.f205013v.setVisibility(8);
        remittanceNewBaseUI.f205011u.setVisibility(0);
    }

    /* renamed from: I7 */
    public static void m83300I7(RemittanceNewBaseUI remittanceNewBaseUI) {
        remittanceNewBaseUI.showCircleStWcKb();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(12689, 9, 1);
        int i = remittanceNewBaseUI.f204989i;
        if (i == 1 || i == 6) {
            String string = remittanceNewBaseUI.getString(C0966R.string.hzm);
            String string2 = remittanceNewBaseUI.getString(C0966R.string.i0k);
            nVar.mo160131h(14074, 1);
            C45890a.m51175a(remittanceNewBaseUI, string, remittanceNewBaseUI.f204943G, string2, true, 20, new C76879j.C47267l() {
                public boolean onFinish(CharSequence charSequence) {
                    if (!Util.isNullOrNil(charSequence.toString())) {
                        RemittanceNewBaseUI.this.f204943G = charSequence.toString();
                    } else {
                        RemittanceNewBaseUI.this.f204943G = null;
                    }
                    RemittanceNewBaseUI.m83299H7(RemittanceNewBaseUI.this);
                    return true;
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    MMHandlerThread.postToMainThreadDelayed(new Runnable() {
                        public void run() {
                            RemittanceNewBaseUI.this.hideVKB();
                        }
                    }, 500);
                }
            });
            return;
        }
        if (remittanceNewBaseUI.f204969W0 == null) {
            remittanceNewBaseUI.f204969W0 = new RemittanceRemarkInputHalfPage(remittanceNewBaseUI, 60, remittanceNewBaseUI.f204970X, RemittanceRemarkInputHalfPage.C70828b.Remittance);
        }
        remittanceNewBaseUI.f204969W0.mo97491a(remittanceNewBaseUI.f204943G, remittanceNewBaseUI.getString(C0966R.string.i2o), new RemittanceRemarkInputHalfPage.C70829c() {
            public void onResult(boolean z, String str, String str2) {
                if (!z) {
                    RemittanceNewBaseUI.this.f204943G = str;
                    StringBuilder sb = new StringBuilder();
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    sb.append(remittanceNewBaseUI.f204945H);
                    sb.append(str2);
                    remittanceNewBaseUI.f204945H = sb.toString();
                    RemittanceNewBaseUI.m83299H7(RemittanceNewBaseUI.this);
                }
                RemittanceNewBaseUI.this.f205003q.mo105095m();
                RemittanceNewBaseUI.this.showNormalStWcKb();
            }
        });
    }

    /* renamed from: J7 */
    public final void mo97427J7(String str, String str2) {
        PayCheckStrut payCheckStrut = (PayCheckStrut) ((HashMap) this.f204972Y).get(str);
        Log.m105919d("MicroMsg.RemittanceNewBaseUI", "match reqKey: %s, %d", str, Integer.valueOf(((HashMap) this.f204972Y).size()));
        if (payCheckStrut == null) {
            Log.m105925i("MicroMsg.RemittanceNewBaseUI", "no data for: %s", str);
        } else {
            Log.m105925i("MicroMsg.RemittanceNewBaseUI", "pay check: %d", Integer.valueOf(this.f204991j));
            if (Util.isNullOrNil(payCheckStrut.f205096g)) {
                payCheckStrut.f205096g = str2;
            }
            if (Util.isNullOrNil(payCheckStrut.f205091b)) {
                payCheckStrut.f205091b = str2;
            }
            if (this.f204991j != 31) {
                C86709a0.m107524d().mo123460f(new C42851q(payCheckStrut.f205090a, payCheckStrut.f205091b, payCheckStrut.f205092c, payCheckStrut.f205093d, payCheckStrut.f205094e));
            } else if (this.f204976a1) {
                C86709a0.m107524d().mo123460f(new C42852q0(payCheckStrut.f205091b, this.f204968W));
            } else {
                C86709a0.m107524d().mo123460f(new C42839e0(str, payCheckStrut.f205095f, payCheckStrut.f205096g, payCheckStrut.f205097h, payCheckStrut.f205098i, payCheckStrut.f205092c));
            }
        }
        ((HashMap) this.f204972Y).clear();
    }

    /* renamed from: K7 */
    public void mo97428K7(String str) {
        if (this.f204991j == 33) {
            if (!this.f204976a1) {
                mo97431N7(this.f204943G, this.f204996n, (String) null, (String) null, this.f204945H, this.f204947I, "", (F2fDynamicStartPayEvent) null, str);
            }
        } else if (this.f204976a1) {
            mo97433P7(this.f204943G, this.f204945H);
        } else {
            mo97431N7(this.f204943G, this.f204996n, (String) null, (String) null, this.f204945H, (String) null, "", (F2fDynamicStartPayEvent) null, str);
        }
    }

    /* renamed from: L7 */
    public abstract void mo97429L7();

    /* renamed from: M7 */
    public abstract void mo97430M7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent);

    /* renamed from: N7 */
    public abstract void mo97431N7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent, String str7);

    /* renamed from: O7 */
    public abstract void mo97432O7();

    /* renamed from: P7 */
    public abstract void mo97433P7(String str, String str2);

    /* renamed from: Q7 */
    public Context mo97434Q7() {
        C70905k0.m83420b();
        Context context = C70905k0.C70906a.f205332a.f205331a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceControlLogic", "getContext() == null");
            context = null;
        }
        return context != null ? context : this;
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
    }

    /* renamed from: R7 */
    public final boolean mo97435R7(final C57179r0 r0Var) {
        if (C72506r.m84839e(r0Var.f163881r.f185665f)) {
            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "should intercept");
            new C72506r(this).mo99913c(r0Var.f163881r.f185665f, new C72506r.C72510d() {
                /* renamed from: a */
                public void mo95297a(C77935gl2 gl22) {
                    Log.m105925i("MicroMsg.RemittanceNewBaseUI", "click intercept button %s %s", Integer.valueOf(gl22.f227479e), gl22.f227478d);
                    int i = gl22.f227479e;
                    if (i == 0) {
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        String str = r0Var.f163881r.f185667h;
                        int i2 = RemittanceNewBaseUI.f204930K1;
                        remittanceNewBaseUI.mo97438U7(2, 2, str);
                    } else if (i == 1) {
                        RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                        String str2 = r0Var.f163881r.f185667h;
                        int i3 = RemittanceNewBaseUI.f204930K1;
                        remittanceNewBaseUI2.mo97438U7(2, 2, str2);
                        RemittanceNewBaseUI.this.finish();
                    } else if (i == 2) {
                        RemittanceNewBaseUI remittanceNewBaseUI3 = RemittanceNewBaseUI.this;
                        String str3 = r0Var.f163881r.f185667h;
                        int i4 = RemittanceNewBaseUI.f204930K1;
                        remittanceNewBaseUI3.mo97438U7(2, 3, str3);
                        RemittanceNewBaseUI remittanceNewBaseUI4 = RemittanceNewBaseUI.this;
                        if (remittanceNewBaseUI4.mKindaEnable) {
                            remittanceNewBaseUI4.showLoading();
                        }
                        RemittanceNewBaseUI.this.mo97448e8(r0Var);
                    }
                }
            });
            return true;
        } else if (Util.isNullOrNil(r0Var.f163881r.f185668i)) {
            return false;
        } else {
            String z = C75228t.m90277z(C75228t.m90268r(this.f204985g), 10);
            if (!Util.isNullOrNil(this.f204952L)) {
                z = getString(C0966R.string.i0b, new Object[]{z, this.f204952L});
            }
            String str = z;
            C64737tr trVar = r0Var.f163881r;
            String str2 = trVar.f185669j;
            String str3 = trVar.f185668i;
            mo97446c8(str2, str3, str, r0Var.f163882s + "", (C70587h0) null, r0Var);
            return true;
        }
    }

    /* renamed from: S7 */
    public final void mo97436S7(boolean z, Intent intent) {
        if (z) {
            if (this.f205018x0) {
                C115669n.INSTANCE.mo160131h(15386, 3, 1);
            }
            String stringExtra = intent.getStringExtra("key_trans_id");
            if (Util.isNullOrNil(this.f204974Z)) {
                this.f204974Z = stringExtra;
            }
            int i = this.f204991j;
            if (!(i == 33 || i == 32)) {
                C5061w0.m5169a(this.f204985g);
            }
            if (this.f204989i == 1) {
                C115669n.INSTANCE.mo160131h(12689, 17, 1);
            } else {
                C115669n.INSTANCE.mo160131h(12689, 8, 1);
            }
            finish();
        } else if (C75157y0.m90140c(intent)) {
            finish();
            return;
        } else if (!C75157y0.m90141d(intent)) {
            if (this.f204989i == 1) {
                C115669n.INSTANCE.mo160131h(12689, 16, 1);
            } else {
                C115669n.INSTANCE.mo160131h(12689, 7, 1);
            }
        } else {
            return;
        }
        if (Util.isEqual(this.f204996n, 0)) {
            if (z) {
                this.f204940E1 = 1;
            } else if (intent != null) {
                this.f204940E1 = intent.getIntExtra("key_pay_reslut_type", 3);
                this.f204942F1 = this.f204981e;
                this.f204944G1 = this.f204943G;
                this.f204946H1 = this.f204945H;
                this.f204948I1 = this.f204974Z;
            } else {
                return;
            }
            Log.m105925i("MicroMsg.RemittanceNewBaseUI", "savePayInfoInReRemittanceUI() mLastPayResult:%s mlastTotalFee:%s mLastDesc:%s mLastAddress:%s mLastTransferId:%s", Integer.valueOf(this.f204940E1), Double.valueOf(this.f204942F1), this.f204944G1, this.f204946H1, this.f204948I1);
        }
    }

    /* renamed from: T7 */
    public void mo97437T7() {
        C10581n eg;
        C68097n Lo;
        final String str;
        String str2;
        Class cls = C76979h.class;
        String q0 = C75228t.m90267q0(C75228t.m90268r(this.f204985g), 10);
        boolean z = false;
        if (!Util.isNullOrNil(this.f204952L)) {
            q0 = getString(C0966R.string.i0b, new Object[]{q0, this.f204952L});
        }
        int i = this.f204989i;
        if (i == 1) {
            q0 = getIntent().getStringExtra("receiver_tips");
            this.f205007s.setTextColor(getResources().getColor(C0966R.color.a7f));
            this.f205009t.setVisibility(0);
            if (Util.isNullOrNil(this.f204985g)) {
                str2 = getString(C0966R.string.i0e, new Object[]{this.f204952L});
            } else {
                str2 = getString(C0966R.string.i0d, new Object[]{C75228t.m90277z(C75228t.m90268r(this.f204985g), 10), this.f204952L});
            }
            this.f205009t.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, str2, this.f205009t.getTextSize()));
        } else if (i == 6) {
            String stringExtra = getIntent().getStringExtra("receiver_tips");
            if (Util.isNullOrNil(stringExtra)) {
                q0 = getString(C0966R.string.i0c, new Object[]{q0});
            } else {
                q0 = Util.safeFormatString(stringExtra, q0);
            }
        }
        Class cls2 = C78144b.class;
        if (this.f204976a1) {
            this.f204995m1.setVisibility(8);
            this.f204997n1.setVisibility(0);
            String str3 = (String) ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_TITLE_STRING_SYNC, (Object) null);
            String str4 = (String) ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_SUBTITLE_STRING_SYNC, (Object) null);
            String str5 = (String) ((C78144b) C86312j.m106911c(cls2)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_WALLET_UNION_TRANSFER_MERCHANT_STRING_SYNC, (Object) null);
            if (!Util.isNullOrNil(str3)) {
                this.f204999o1.setText(str3);
            }
            if (!Util.isNullOrNil(str4)) {
                this.f205002p1.setText(str4);
            }
            if (!Util.isNullOrNil(str5)) {
                this.f205004q1.setText(str5);
            }
            if (!Util.isNullOrNil(this.f204978c1)) {
                this.f205006r1.setVisibility(8);
                this.f205008s1.setVisibility(0);
                this.f205008s1.setText(this.f204978c1);
                this.f205008s1.setAlpha(0.0f);
                this.f205008s1.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null);
            } else if (!this.f205010t1) {
                this.f205010t1 = true;
                this.f205006r1.postDelayed(new Runnable() {
                    public void run() {
                        if (Util.isNullOrNil(RemittanceNewBaseUI.this.f204978c1)) {
                            RemittanceNewBaseUI.this.f205006r1.setVisibility(0);
                            RemittanceNewBaseUI.this.f205006r1.setAlpha(0.0f);
                            RemittanceNewBaseUI.this.f205006r1.animate().alpha(1.0f).setDuration(300).setListener((Animator.AnimatorListener) null);
                        }
                    }
                }, 350);
            }
            if (this.f204999o1.getText().toString().contains("{enterprise}")) {
                this.f204999o1.setText(this.f204999o1.getText().toString().replace("{enterprise}", this.f204977b1));
            }
            if (this.f205002p1.getText().toString().contains("{recver}")) {
                String charSequence = this.f205002p1.getText().toString();
                String r = C75228t.m90268r(this.f204985g);
                if (!Util.isNullOrNil(this.f204977b1)) {
                    str = "＠" + this.f204977b1;
                } else {
                    str = "";
                }
                final String replace = charSequence.replace("{recver}", r);
                if (this.f205002p1.getWidth() > 0) {
                    mo97454l8(this.f205002p1, replace, "", str);
                } else {
                    int textSize = (int) this.f205002p1.getTextSize();
                    int indexOf = charSequence.indexOf("{recver}") + r.length();
                    SpannableString T1 = ((C76979h) C86312j.m106911c(cls)).mo107057T1(this, charSequence.replace("{recver}", r + str));
                    ColorStateList e = C76577a.m92154e(this, C0966R.color.f2960ag);
                    T1.setSpan(new TextAppearanceSpan((String) null, 0, textSize, e, e), indexOf, str.length() + indexOf, 33);
                    this.f205002p1.setText(T1, TextView.BufferType.SPANNABLE);
                    this.f205002p1.post(new Runnable() {
                        public void run() {
                            RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                            remittanceNewBaseUI.mo97454l8(remittanceNewBaseUI.f205002p1, replace, "", str);
                        }
                    });
                }
            }
        } else {
            this.f204995m1.setVisibility(0);
            this.f204997n1.setVisibility(8);
            this.f205007s.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, q0, this.f205007s.getTextSize()));
        }
        C75228t.m90240d(this.f205007s);
        this.f205007s.setGravity(17);
        if (C86709a0.m107522a() && (eg = ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()) != null && !Util.isNullOrNil(this.f204985g) && ((Lo = ((C68098o) eg).mo93607Lo(this.f204985g)) == null || Util.isNullOrNil(Lo.mo93597f()))) {
            final long nowMilliSecond = Util.nowMilliSecond();
            C31519v2.m39436a().mo55988e(this.f204985g, "", new C75597w2.C31525a() {
                /* renamed from: a */
                public void mo1109a(String str, boolean z) {
                    if (z) {
                        Log.m105926v("MicroMsg.RemittanceNewBaseUI", "getContact suc; cost=" + (Util.nowMilliSecond() - nowMilliSecond) + " ms");
                        ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
                    } else {
                        Log.m105928w("MicroMsg.RemittanceNewBaseUI", "getContact failed");
                    }
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    int i = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI.mo97450g8();
                }
            });
            z = true;
        }
        if (!z) {
            mo97450g8();
        }
    }

    /* renamed from: U7 */
    public final void mo97438U7(int i, int i2, String str) {
        WCPayLargeAmountTransferReportStruct wCPayLargeAmountTransferReportStruct = new WCPayLargeAmountTransferReportStruct();
        this.f204961S0 = wCPayLargeAmountTransferReportStruct;
        wCPayLargeAmountTransferReportStruct.f194676d = (long) i;
        wCPayLargeAmountTransferReportStruct.f194677e = (long) i2;
        wCPayLargeAmountTransferReportStruct.f194678f = wCPayLargeAmountTransferReportStruct.mo86045b("OrderId", str, true);
        this.f204961S0.mo86054n();
    }

    /* renamed from: V7 */
    public final void mo97439V7(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("MicroMsg.RemittanceNewBaseUI", "msgxml is null");
            return;
        }
        String decode = URLDecoder.decode(str);
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "helios:" + decode);
        String str2 = XmlParser.parseXml(decode, "msg", (String) null).get(".msg.appmsg.wcpayinfo.transferid");
        if (TextUtils.isEmpty(str2)) {
            Log.m105920e("MicroMsg.RemittanceNewBaseUI", "paymsgid count't be null in appmsg");
            return;
        }
        C70614v0 xx02 = C77010f.vx0().xx0();
        xx02.getClass();
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(decode)) {
            Log.m105920e("MicroMsg.RemittanceLocalMsgMgr", "saveMsgContent param error");
        } else {
            xx02.f204300b.put(str2, decode);
        }
    }

    /* renamed from: W7 */
    public final void mo97440W7(String str) {
        C75228t.m90253j0(this.f205013v, str, 0, str.length(), new C7092q((C7092q.C7093a) new C7092q.C7093a() {
            public void onClick(View view) {
                RemittanceNewBaseUI.m83300I7(RemittanceNewBaseUI.this);
            }
        }, true), getContext());
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onGet");
        if (Util.nullAsNil(str).length() <= 0) {
            Log.m105920e("MicroMsg.RemittanceNewBaseUI", "notifyChanged: user = " + str);
        } else if (str.equals(this.f204985g)) {
            mo97450g8();
        }
    }

    /* renamed from: X7 */
    public final boolean mo97441X7(final C70587h0 h0Var) {
        C67175a aVar = h0Var.f204112z;
        if (aVar == null || !aVar.mo91283a()) {
            return false;
        }
        this.f204932A1 = true;
        Context Q7 = mo97434Q7();
        C67175a aVar2 = h0Var.f204112z;
        C76879j.m92707A(Q7, aVar2.f192844a, "", aVar2.f192846c, aVar2.f192845b, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "goto h5: %s", h0Var.f204112z.f192847d);
                C75228t.m90219L(RemittanceNewBaseUI.this.getContext(), h0Var.f204112z.f192847d, false);
            }
        }, new DialogInterface.OnClickListener(this) {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        return true;
    }

    /* renamed from: Y7 */
    public final Boolean mo97442Y7(C70587h0 h0Var) {
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "showAmountReInputPage");
        if (h0Var == null) {
            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "scene == null");
            return Boolean.FALSE;
        } else if (h0Var.f204096g == null) {
            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "scene.amountReInputPageInfo == null");
            return Boolean.FALSE;
        } else {
            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "goto large moneny ui");
            hideLoading();
            this.f204934B1.alive();
            Intent intent = new Intent();
            String q0 = C75228t.m90267q0(C75228t.m90268r(this.f204985g), 10);
            if (!Util.isNullOrNil(this.f204952L)) {
                q0 = getString(C0966R.string.i0b, new Object[]{q0, this.f204952L});
            }
            intent.putExtra("key_amount_remind_bit", this.f204958R);
            intent.putExtra("key_title", h0Var.f204096g.f204113a);
            if (!Util.isNullOrNil(h0Var.f204096g.f204114b) && !Util.isNullOrNil(q0)) {
                intent.putExtra("key_desc", h0Var.f204096g.f204114b.replace("${receiver_name}", q0));
            }
            intent.putExtra("key_display_name", q0);
            intent.putExtra("key_place_attach", this.f205001p0);
            intent.setClass(this, WalletPayUBalanceResultUI.class);
            startActivityForResult(intent, 7);
            return Boolean.TRUE;
        }
    }

    /* renamed from: Z7 */
    public void mo97443Z7(MMActivity mMActivity, String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = mMActivity.getString(C0966R.string.l_3);
        }
        C76879j.m92713G(mMActivity, str, (String) null, false, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                if (z) {
                    RemittanceNewBaseUI.this.finish();
                }
            }
        });
    }

    /* renamed from: a8 */
    public abstract void mo97444a8();

    /* renamed from: b8 */
    public final boolean mo97445b8(C70587h0 h0Var) {
        boolean z;
        final C70587h0 h0Var2 = h0Var;
        if (this.f205019x1 || Util.isNullOrNil(h0Var2.f204098i)) {
            z = false;
        } else {
            this.f205019x1 = true;
            mo97438U7(2, 1, h0Var2.f204074D);
            C76879j.m92707A(mo97434Q7(), h0Var2.f204098i, "", getString(C0966R.string.i0h), getString(C0966R.string.i1m), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    String str = h0Var2.f204074D;
                    int i2 = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI.mo97438U7(2, 3, str);
                    if (RemittanceNewBaseUI.this.mo97445b8(h0Var2)) {
                        return;
                    }
                    if (RemittanceNewBaseUI.this.mo97442Y7(h0Var2).booleanValue()) {
                        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "showAmountReInputPage success");
                        return;
                    }
                    RemittanceNewBaseUI.this.showLoading();
                    RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                    C70587h0 h0Var = h0Var2;
                    remittanceNewBaseUI2.mo97449f8(h0Var.f204093d, remittanceNewBaseUI2.f204985g, remittanceNewBaseUI2.f204952L, h0Var);
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    String str = h0Var2.f204074D;
                    int i2 = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI.mo97438U7(2, 2, str);
                    RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                    int i3 = remittanceNewBaseUI2.f204989i;
                    if (i3 == 1 || i3 == 6) {
                        C70584f0 f0Var = new C70584f0(remittanceNewBaseUI2.f204985g, remittanceNewBaseUI2.f204998o);
                        f0Var.setProcessName("RemittanceProcess");
                        remittanceNewBaseUI2.doSceneProgress(f0Var);
                        RemittanceNewBaseUI.this.finish();
                    } else if (i3 == 2 || i3 == 5) {
                        remittanceNewBaseUI2.finish();
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("recent_remittance_contact_list", C5061w0.m5170b());
                        intent.setClass(remittanceNewBaseUI2.getContext(), SelectRemittanceContactUI.class);
                        remittanceNewBaseUI2.startActivityForResult(intent, 2);
                    }
                    RemittanceNewBaseUI.this.getClass();
                }
            });
            z = true;
        }
        if (!z && !this.f205022y1) {
            if (h0Var2.f204094e > 0) {
                this.f205022y1 = true;
                if (h0Var2.f204095f != null) {
                    mo97447d8(mo97434Q7(), Util.isNullOrNil(h0Var2.f204095f.f204115a) ? getString(C0966R.string.i2q, new Object[]{Integer.valueOf(h0Var2.f204094e)}) : h0Var2.f204095f.f204115a, getString(C0966R.string.f361205i34), getString(C0966R.string.i0h), Util.isNullOrNil(h0Var2.f204095f.f204116b) ? getString(C0966R.string.i2a) : h0Var2.f204095f.f204116b, new C101218e0.C12907m() {
                        /* renamed from: a */
                        public void mo2001a() {
                            C101218e0 e0Var = RemittanceNewBaseUI.this.f204967V0;
                            if (e0Var != null) {
                                e0Var.mo140680z();
                                RemittanceNewBaseUI.this.f204967V0 = null;
                            }
                            if (!RemittanceNewBaseUI.this.mo97445b8(h0Var2)) {
                                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                                if (remittanceNewBaseUI.mKindaEnable) {
                                    remittanceNewBaseUI.showLoading();
                                }
                                RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                                C70587h0 h0Var = h0Var2;
                                remittanceNewBaseUI2.mo97449f8(h0Var.f204093d, remittanceNewBaseUI2.f204985g, remittanceNewBaseUI2.f204952L, h0Var);
                            }
                        }
                    }, new C101218e0.C12907m() {
                        /* renamed from: a */
                        public void mo2001a() {
                            C101218e0 e0Var = RemittanceNewBaseUI.this.f204967V0;
                            if (e0Var != null) {
                                e0Var.mo140680z();
                                RemittanceNewBaseUI.this.f204967V0 = null;
                            }
                            if (Util.isNullOrNil(h0Var2.f204095f.f204117c)) {
                                C79143a.m95772k(RemittanceNewBaseUI.this, "order", "ShowOrdersInfoProcess", (Bundle) null, (C79148e.C79149a) null);
                            } else {
                                ((C16292g) C86312j.m106911c(C16292g.class)).nr0(RemittanceNewBaseUI.this, h0Var2.f204095f.f204117c, 5, true);
                            }
                        }
                    });
                } else {
                    Log.m105924i("MicroMsg.RemittanceNewBaseUI", "scene.zaituMessage == null");
                    mo97447d8(mo97434Q7(), getString(C0966R.string.i2q, new Object[]{Integer.valueOf(h0Var2.f204094e)}), getString(C0966R.string.f361205i34), getString(C0966R.string.i0h), getString(C0966R.string.i2a), new C101218e0.C12907m() {
                        /* renamed from: a */
                        public void mo2001a() {
                            C101218e0 e0Var = RemittanceNewBaseUI.this.f204967V0;
                            if (e0Var != null) {
                                e0Var.mo140680z();
                                RemittanceNewBaseUI.this.f204967V0 = null;
                            }
                            if (!RemittanceNewBaseUI.this.mo97445b8(h0Var2)) {
                                RemittanceNewBaseUI.this.showLoading();
                                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                                C70587h0 h0Var = h0Var2;
                                remittanceNewBaseUI.mo97449f8(h0Var.f204093d, remittanceNewBaseUI.f204985g, remittanceNewBaseUI.f204952L, h0Var);
                            }
                        }
                    }, new C101218e0.C12907m() {
                        /* renamed from: a */
                        public void mo2001a() {
                            C101218e0 e0Var = RemittanceNewBaseUI.this.f204967V0;
                            if (e0Var != null) {
                                e0Var.mo140680z();
                                RemittanceNewBaseUI.this.f204967V0 = null;
                            }
                            C79143a.m95772k(RemittanceNewBaseUI.this, "order", "ShowOrdersInfoProcess", (Bundle) null, (C79148e.C79149a) null);
                        }
                    });
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (!z && !this.f205024z1) {
            if (h0Var2.f204102p) {
                this.f205024z1 = true;
                C70896i0.m83416c(mo97434Q7(), this.f204989i, this.f204981e, h0Var2.f204104r / 100.0d, (String) null, h0Var2.f204103q / 100.0d, h0Var2.f204100n / 100.0d, h0Var2.f204101o, new View.OnClickListener() {
                    public void onClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        RemittanceNewBaseUI.this.showLoading();
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        C70587h0 h0Var = h0Var2;
                        remittanceNewBaseUI.mo97449f8(h0Var.f204093d, remittanceNewBaseUI.f204985g, remittanceNewBaseUI.f204952L, h0Var);
                        if (RemittanceNewBaseUI.this.f204989i == 1) {
                            C115669n.INSTANCE.mo160131h(12689, 12, 1);
                        } else {
                            C115669n.INSTANCE.mo160131h(12689, 3, 1);
                        }
                        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$33", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                z = true;
            } else {
                z = false;
            }
        }
        if (!z && !this.f204932A1) {
            z = mo97441X7(h0Var);
        }
        if (z || Util.isNullOrNil(h0Var2.f204072B) || Util.isNullOrNil(h0Var2.f204073C)) {
            return z;
        }
        String z2 = C75228t.m90277z(C75228t.m90268r(this.f204985g), 10);
        if (!Util.isNullOrNil(this.f204952L)) {
            z2 = getString(C0966R.string.i0b, new Object[]{z2, this.f204952L});
        }
        mo97446c8(h0Var2.f204093d, h0Var2.f204073C, z2, h0Var2.f204072B, h0Var, (C57179r0) null);
        return true;
    }

    /* renamed from: c8 */
    public boolean mo97446c8(final String str, String str2, String str3, String str4, final C70587h0 h0Var, final C57179r0 r0Var) {
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.brw, (ViewGroup) null);
        final TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359112ix3);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f359111ix2);
        ((TextView) inflate.findViewById(C0966R.C0970id.ix4)).setText(str2);
        if (!this.f204976a1) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, str3, textView.getTextSize()));
        } else if (textView.getWidth() > 0) {
            mo97453k8(textView);
        } else {
            textView.post(new Runnable() {
                public void run() {
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    TextView textView = textView;
                    int i = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI.mo97453k8(textView);
                }
            });
        }
        textView2.setText(String.format("%s%.2f", new Object[]{C45121z0.m49962b(), Double.valueOf(Double.valueOf(Util.getDouble(str4, 0.0d)).doubleValue() / 100.0d)}));
        Context Q7 = mo97434Q7();
        C77389a aVar = new C77389a();
        aVar.f225668y = false;
        aVar.f225644a = C0086a.m38a(Q7).getString(C0966R.string.f361205i34);
        aVar.f225627J = inflate;
        aVar.f225663t = C0086a.m38a(Q7).getString(C0966R.string.i0h);
        aVar.f225664u = C0086a.m38a(Q7).getString(C0966R.string.atx);
        aVar.f225621D = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n.INSTANCE.mo160131h(23749, 2);
                RemittanceNewBaseUI.this.showNormalStWcKb();
            }
        };
        aVar.f225620C = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C115669n.INSTANCE.mo160131h(23749, 3);
                RemittanceNewBaseUI.this.showLoading();
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f204976a1) {
                    remittanceNewBaseUI.mo97448e8(r0Var);
                } else {
                    remittanceNewBaseUI.mo97449f8(str, remittanceNewBaseUI.f204985g, remittanceNewBaseUI.f204952L, h0Var);
                }
            }
        };
        C77398g gVar = new C77398g(Q7, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        C115669n.INSTANCE.mo160131h(23749, 1);
        return true;
    }

    /* renamed from: d8 */
    public void mo97447d8(Context context, String str, String str2, String str3, String str4, C101218e0.C12907m mVar, C101218e0.C12907m mVar2) {
        C101218e0 e0Var = this.f204967V0;
        if (e0Var != null) {
            e0Var.mo140680z();
            this.f204967V0 = null;
        }
        C101218e0 e0Var2 = new C101218e0(context, 1, 3);
        this.f204967V0 = e0Var2;
        e0Var2.mo140667n(str4, str3);
        C101218e0 e0Var3 = this.f204967V0;
        e0Var3.f296373D = mVar2;
        e0Var3.f296374E = mVar;
        View inflate = View.inflate(context, C0966R.C0971layout.brr, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.et6);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setText(str2);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.f358383et1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C101218e0 e0Var = RemittanceNewBaseUI.this.f204967V0;
                if (e0Var != null) {
                    e0Var.mo140680z();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f204967V0.mo140672r(inflate);
        View inflate2 = View.inflate(context, C0966R.C0971layout.brq, (ViewGroup) null);
        TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.f358384et2);
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        textView2.setText(str);
        this.f204967V0.mo140663j(inflate2);
        this.f204967V0.mo140655A();
    }

    /* renamed from: e8 */
    public void mo97448e8(C57179r0 r0Var) {
        Log.m105925i("MicroMsg.RemittanceNewBaseUI", "startPay prepayId:%s", r0Var.f163881r.f185669j);
        mo97439V7(this.f204949J);
        Bundle bundle = new Bundle();
        bundle.putString("prepayId", r0Var.f163881r.f185669j);
        bundle.putInt("payScene", 82);
        if (!Util.isNullOrNil(this.f204968W)) {
            bundle.putInt("payChannel", 58);
        } else {
            bundle.putInt("payChannel", 57);
        }
        bundle.putString("payee_enterprise_name", this.f204977b1);
        bundle.putString("payee_salesperson_nickname", C75228t.m90268r(this.f204985g));
        bundle.putInt("chatType", this.f204980d1);
        bundle.putInt("sendType", this.f204982e1);
        ((C76324c) C86312j.m106911c(C76324c.class)).startInWxAppPayUseCase(this, bundle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r10 = r6.f204087R;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x032a  */
    /* renamed from: f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97449f8(java.lang.String r17, java.lang.String r18, java.lang.String r19, com.tencent.p014mm.plugin.remittance.model.C70587h0 r20) {
        /*
            r16 = this;
            r7 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r3
            r5 = 1
            r1[r5] = r4
            r8 = 2
            r1[r8] = r19
            java.lang.String r9 = "MicroMsg.RemittanceNewBaseUI"
            java.lang.String r10 = "startPay reqKey:%s name:%s receiver_true_name:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r1)
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0111
            int r10 = r6.f204086Q
            if (r10 != r5) goto L_0x0028
            te3.lu r10 = r6.f204087R
            if (r10 != 0) goto L_0x0030
        L_0x0028:
            te3.lu r10 = r6.f204087R
            if (r10 == 0) goto L_0x0032
            int r10 = r10.f227826h
            if (r10 <= 0) goto L_0x0032
        L_0x0030:
            r10 = 1
            goto L_0x0033
        L_0x0032:
            r10 = 0
        L_0x0033:
            if (r10 == 0) goto L_0x0111
            te3.lu r10 = r6.f204087R
            int r10 = r10.f227826h
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r11[r2] = r12
            java.lang.String r2 = "show checkNameMessage，messgae_typee %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r11)
            if (r10 == 0) goto L_0x00ef
            if (r10 == r5) goto L_0x009c
            if (r10 == r8) goto L_0x007d
            if (r10 == r0) goto L_0x0057
            java.lang.String r0 = "unknown type"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x0110
        L_0x0057:
            te3.lu r4 = r6.f204087R
            r7.f204936C1 = r4
            int r2 = r6.f204110x
            java.lang.String r3 = r6.f204088S
            r0 = 2131834812(0x7f1137bc, float:1.9302745E38)
            java.lang.String r6 = r7.getString(r0)
            java.lang.String r0 = r7.f205001p0
            r7.f204963T0 = r5
            com.tencent.mm.plugin.remittance.ui.k r1 = new com.tencent.mm.plugin.remittance.ui.k
            android.content.Context r5 = r16.mo97434Q7()
            r1.<init>(r5)
            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$34 r5 = new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$34
            r5.<init>(r0)
            r1.mo97569a(r2, r3, r4, r5, r6)
            goto L_0x0110
        L_0x007d:
            android.content.Context r0 = r16.mo97434Q7()
            te3.lu r1 = r6.f204087R
            java.lang.String r2 = r1.f227823e
            java.lang.String r1 = r1.f227822d
            android.content.res.Resources r3 = r16.getResources()
            r4 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r3 = r3.getString(r4)
            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$37 r4 = new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$37
            r4.<init>()
            nj3.C76879j.m92754y(r0, r2, r1, r3, r4)
            goto L_0x0110
        L_0x009c:
            com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct
            r0.<init>()
            double r1 = r6.f204111y
            int r1 = (int) r1
            long r1 = (long) r1
            r0.f194689f = r1
            java.lang.String r1 = r6.f204088S
            r0.mo93202s(r1)
            r1 = 4
            r0.f194687d = r1
            r0.mo86054n()
            android.content.Context r8 = r16.mo97434Q7()
            te3.lu r0 = r6.f204087R
            java.lang.String r9 = r0.f227823e
            java.lang.String r10 = r0.f227822d
            android.content.res.Resources r0 = r16.getResources()
            r1 = 2131834814(0x7f1137be, float:1.9302749E38)
            java.lang.String r11 = r0.getString(r1)
            android.content.res.Resources r0 = r16.getResources()
            r1 = 2131834813(0x7f1137bd, float:1.9302747E38)
            java.lang.String r12 = r0.getString(r1)
            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$35 r13 = new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$35
            r0 = r13
            r1 = r16
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r0.<init>(r2, r3, r4, r5)
            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$36 r14 = new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$36
            r14.<init>(r6)
            r15 = 2131101337(0x7f060699, float:1.781508E38)
            nj3.C76879j.m92708B(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0110
        L_0x00ef:
            te3.lu r3 = r6.f204087R
            r7.f204936C1 = r3
            int r2 = r6.f204110x
            java.lang.String r4 = r6.f204088S
            r7.f204963T0 = r5
            com.tencent.mm.plugin.remittance.ui.k r0 = new com.tencent.mm.plugin.remittance.ui.k
            android.content.Context r5 = r16.mo97434Q7()
            r0.<init>(r5)
            com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$34 r5 = new com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI$34
            r5.<init>(r1)
            java.lang.String r6 = ""
            r1 = r2
            r2 = r4
            r4 = r5
            r5 = r6
            r0.mo97569a(r1, r2, r3, r4, r5)
        L_0x0110:
            return
        L_0x0111:
            java.lang.Boolean r0 = r7.mo97442Y7(r6)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0125
            r16.hideLoading()
            java.lang.String r0 = "showAmountReInputPage success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            return
        L_0x0125:
            com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.m83420b()
            com.tencent.mm.plugin.remittance.ui.k0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70905k0.C70906a.f205332a
            r0.mo97574a(r5)
            boolean r0 = r7.f204963T0
            if (r0 == 0) goto L_0x0147
            com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct
            r0.<init>()
            int r10 = r6.f204110x
            long r10 = (long) r10
            r0.f194689f = r10
            java.lang.String r10 = r6.f204088S
            r0.mo93202s(r10)
            r10 = 5
            r0.f194687d = r10
            r0.mo86054n()
        L_0x0147:
            r7.f204963T0 = r2
            int r0 = r7.f204991j
            r10 = 31
            if (r0 != r10) goto L_0x0154
            java.lang.String r0 = r7.f204949J
            r7.mo97439V7(r0)
        L_0x0154:
            com.tencent.mm.pluginsdk.wallet.PayInfo r12 = new com.tencent.mm.pluginsdk.wallet.PayInfo
            r12.<init>()
            r12.f212592j = r3
            int r0 = r7.f204991j
            r12.f212587e = r0
            int r0 = r7.f204951K
            if (r0 <= 0) goto L_0x0165
            r12.f212589g = r0
        L_0x0165:
            int r0 = r7.f204989i
            r3 = 5
            if (r0 == r8) goto L_0x016f
            if (r0 != r3) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r0 = 0
            goto L_0x0170
        L_0x016f:
            r0 = 1
        L_0x0170:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r11 = "extinfo_key_1"
            r10.putString(r11, r4)
            android.content.Intent r13 = r16.getIntent()
            java.lang.String r14 = "receiver_true_name"
            java.lang.String r13 = r13.getStringExtra(r14)
            java.lang.String r14 = "extinfo_key_2"
            r10.putString(r14, r13)
            java.lang.String r13 = r7.f204947I
            java.lang.String r15 = "extinfo_key_3"
            r10.putString(r15, r13)
            java.lang.String r13 = "extinfo_key_4"
            r10.putBoolean(r13, r0)
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r13 = "receiver_tips"
            java.lang.String r0 = r0.getStringExtra(r13)
            java.lang.String r13 = "extinfo_key_5"
            r10.putString(r13, r0)
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r13 = "payer_desc"
            java.lang.String r0 = r0.getStringExtra(r13)
            java.lang.String r13 = "extinfo_key_6"
            r10.putString(r13, r0)
            java.lang.String r0 = r7.f204943G
            java.lang.String r13 = "extinfo_key_7"
            r10.putString(r13, r0)
            android.content.Intent r0 = r16.getIntent()
            java.lang.String r13 = "rcvr_new_desc"
            java.lang.String r0 = r0.getStringExtra(r13)
            java.lang.String r13 = "extinfo_key_8"
            r10.putString(r13, r0)
            java.lang.String r0 = r7.f204974Z
            java.lang.String r13 = "extinfo_key_16"
            r10.putString(r13, r0)
            if (r6 == 0) goto L_0x01dd
            java.lang.String r0 = r6.f204083M
            java.lang.String r13 = "extinfo_key_19"
            r10.putString(r13, r0)
        L_0x01dd:
            int r0 = r7.f204989i
            if (r0 != r5) goto L_0x0210
            if (r6 == 0) goto L_0x0210
            java.lang.String r0 = r6.f204106t
            java.lang.String r13 = "extinfo_key_11"
            r10.putString(r13, r0)
            int r0 = r6.f204077G
            java.lang.String r13 = "extinfo_key_12"
            r10.putInt(r13, r0)
            java.lang.String r0 = r6.f204078H
            java.lang.String r13 = "extinfo_key_13"
            r10.putString(r13, r0)
            java.lang.String r0 = r6.f204079I
            java.lang.String r13 = "extinfo_key_14"
            r10.putString(r13, r0)
            java.lang.String r0 = r6.f204081K
            java.lang.String r13 = "extinfo_key_17"
            r10.putString(r13, r0)
            java.lang.String r0 = r6.f204082L
            java.lang.String r13 = "extinfo_key_18"
            r10.putString(r13, r0)
            int r0 = r6.f204080J
            goto L_0x0211
        L_0x0210:
            r0 = 0
        L_0x0211:
            if (r6 == 0) goto L_0x021a
            int r13 = r6.f204110x
            java.lang.String r15 = "extinfo_key_15"
            r10.putInt(r15, r13)
        L_0x021a:
            r12.f212600u = r10
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r10[r2] = r13
            java.lang.String r13 = "dynamic code flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r13, r10)
            if (r0 != r5) goto L_0x0290
            java.lang.Class<com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI> r0 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fDynamicCodeUI.class
            r15.setClass(r7, r0)
            java.lang.String r0 = "key_pay_info"
            r15.putExtra(r0, r12)
            java.lang.String r0 = r7.f204962T
            java.lang.String r1 = "key_rcvr_open_id"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r7.f204987h
            java.lang.String r1 = "key_mch_info"
            r15.putExtra(r1, r0)
            java.lang.String r0 = "from_patch_ui"
            r15.putExtra(r0, r5)
            java.lang.String r0 = r6.f204081K
            java.lang.String r1 = "get_dynamic_code_sign"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r6.f204082L
            java.lang.String r1 = "get_dynamic_code_extend"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r6.f204084N
            java.lang.String r1 = "dynamic_code_spam_wording"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r6.f204083M
            java.lang.String r1 = "show_paying_wording"
            r15.putExtra(r1, r0)
            java.lang.String r0 = r7.f204998o
            java.lang.String r1 = "key_transfer_qrcode_id"
            r15.putExtra(r1, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 15386(0x3c1a, float:2.156E-41)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r4[r2] = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r4[r5] = r2
            r0.mo160131h(r1, r4)
            com.tencent.mm.sdk.event.IListener r0 = r7.f204938D1
            r0.alive()
            r7.startActivityForResult((android.content.Intent) r15, (int) r3)
            goto L_0x039d
        L_0x0290:
            boolean r0 = r7.mKindaEnable
            if (r0 == 0) goto L_0x0369
            r0 = 2131839577(0x7f114a59, float:1.931241E38)
            java.lang.String r0 = r7.getString(r0)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r3 != 0) goto L_0x031e
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            com.tencent.mm.storage.u3 r3 = r3.mo96097Ni()
            com.tencent.mm.storage.z1 r3 = r3.mo69664N2(r4)
            if (r3 == 0) goto L_0x0306
            java.lang.String r3 = r3.mo62898f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r3)
            r6.append(r8)
            java.lang.String r8 = r7.f204952L
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x02cf
            goto L_0x02e7
        L_0x02cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "("
            r1.append(r8)
            java.lang.String r8 = r7.f204952L
            r1.append(r8)
            java.lang.String r8 = ")"
            r1.append(r8)
            java.lang.String r1 = r1.toString()
        L_0x02e7:
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r2] = r1
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r0, r6)
            r6 = 2131834795(0x7f1137ab, float:1.930271E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r3)
            r8[r2] = r3
            java.lang.String r2 = r7.getString(r6, r8)
            goto L_0x0326
        L_0x0306:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "can not found contact for user::"
            r0.append(r2)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x0324
        L_0x031e:
            java.lang.String r0 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
        L_0x0324:
            r0 = r1
            r2 = r0
        L_0x0326:
            android.os.Bundle r3 = r12.f212600u
            if (r3 != 0) goto L_0x0331
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r12.f212600u = r3
        L_0x0331:
            android.os.Bundle r3 = r12.f212600u
            r3.putString(r11, r4)
            java.lang.String r4 = r7.f204952L
            r3.putString(r14, r4)
            java.lang.String r4 = "cashier_desc"
            r3.putString(r4, r0)
            java.lang.String r0 = "prepay_page_payee"
            r3.putString(r0, r1)
            java.lang.String r0 = "succ_tip"
            r3.putString(r0, r2)
            int r0 = r7.f204980d1
            java.lang.String r1 = "chat_type"
            r3.putInt(r1, r0)
            int r0 = r7.f204982e1
            java.lang.String r1 = "send_type"
            r3.putInt(r1, r0)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            r0.startSNSPay(r7, r12)
            r7.f205021y0 = r5
            goto L_0x039d
        L_0x0369:
            r16.hideLoading()
            q43.a r0 = r7.f204979d
            q43.C77302a.m93125e(r0, r15)
            java.lang.String r0 = r7.f204965U0
            r12.f212583N = r0
            boolean r0 = r7.f205018x0
            r12.f212584P = r0
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent r0 = r6.f204085P
            if (r0 == 0) goto L_0x0390
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent$a r0 = r0.f193584d
            android.app.Activity r9 = r0.f193588d
            if (r9 == 0) goto L_0x0390
            r10 = 0
            int r0 = r0.f193586b
            java.lang.String r11 = ""
            r13 = r19
            r14 = r15
            r15 = r0
            ie3.C76331i.m91762f(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x039d
        L_0x0390:
            r1 = 0
            r6 = 1
            java.lang.String r2 = ""
            r0 = r16
            r3 = r12
            r4 = r19
            r5 = r15
            ie3.C76331i.m91762f(r0, r1, r2, r3, r4, r5, r6)
        L_0x039d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceNewBaseUI.mo97449f8(java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.remittance.model.h0):void");
    }

    public void finish() {
        C70905k0.m83420b();
        C70905k0.C70906a.f205332a.mo97574a(0);
        super.finish();
    }

    /* renamed from: g8 */
    public final void mo97450g8() {
        final C7078314 r0 = new Runnable() {
            public void run() {
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                ((C76705f) C86312j.m106911c(C76705f.class)).D20(remittanceNewBaseUI.f205005r, remittanceNewBaseUI.f204985g, 0.1f);
            }
        };
        if (MMHandlerThread.isMainThread()) {
            r0.run();
        } else {
            MMHandlerThread.postToMainThread(new Runnable(this) {
                public void run() {
                    r0.run();
                }
            });
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brs;
    }

    public void hideLoading() {
        super.hideLoading();
        C70905k0.m83420b();
        C70905k0 k0Var = C70905k0.C70906a.f205332a;
        Log.m105928w("MicroMsg.RemittanceControlLogic", "hideProgress()");
        Context context = k0Var.f205331a.get();
        if (context == null) {
            Log.m105924i("MicroMsg.RemittanceControlLogic", "getContext() == null");
        } else if (!(context instanceof RemittanceUI) && (context instanceof WalletBaseUI)) {
            ((WalletBaseUI) context).hideProgress();
        }
    }

    /* renamed from: i8 */
    public abstract void mo97451i8();

    public void initView() {
        hideActionbarLine();
        int i = this.f204991j;
        if (i == 33 || i == 32) {
            setMMTitle((int) C0966R.string.i05);
        } else {
            setMMTitle("");
        }
        setBackBtn(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                int i = remittanceNewBaseUI.f204989i;
                if (i == 1 || i == 6) {
                    C70584f0 f0Var = new C70584f0(remittanceNewBaseUI.f204985g, remittanceNewBaseUI.f204998o);
                    f0Var.setProcessName("RemittanceProcess");
                    remittanceNewBaseUI.doSceneProgress(f0Var);
                    RemittanceNewBaseUI.this.finish();
                } else if (i == 2 || i == 5) {
                    remittanceNewBaseUI.finish();
                } else {
                    Intent intent = new Intent();
                    intent.putExtra("recent_remittance_contact_list", C5061w0.m5170b());
                    intent.setClass(remittanceNewBaseUI.getContext(), SelectRemittanceContactUI.class);
                    remittanceNewBaseUI.startActivityForResult(intent, 2);
                }
                RemittanceNewBaseUI.this.getClass();
                return true;
            }
        });
        this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
        this.f205023z = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f205005r = (ImageView) findViewById(C0966R.C0970id.ing);
        this.f205007s = (TextView) findViewById(C0966R.C0970id.inh);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ini);
        this.f205009t = textView;
        textView.setVisibility(8);
        this.f204933B = (LinearLayout) findViewById(C0966R.C0970id.imt);
        this.f204931A = (LinearLayout) findViewById(C0966R.C0970id.imy);
        this.f205017x = (TextView) findViewById(C0966R.C0970id.imw);
        this.f205020y = (TextView) findViewById(C0966R.C0970id.imx);
        this.f205015w = (TextView) findViewById(C0966R.C0970id.imv);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.il_);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.h_c);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.f5618jz);
        this.f204994l1 = (TextView) findViewById(C0966R.C0970id.inz);
        this.f204995m1 = (LinearLayout) findViewById(C0966R.C0970id.euv);
        this.f204997n1 = (LinearLayout) findViewById(C0966R.C0970id.nzq);
        TextView textView4 = (TextView) findViewById(C0966R.C0970id.nzv);
        this.f204999o1 = textView4;
        C75228t.m90240d(textView4);
        this.f205002p1 = (TextView) findViewById(C0966R.C0970id.nzu);
        this.f205004q1 = (TextView) findViewById(C0966R.C0970id.nzt);
        this.f205006r1 = (ProgressBar) findViewById(C0966R.C0970id.nzs);
        this.f205008s1 = (TextView) findViewById(C0966R.C0970id.nzr);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0966R.C0970id.in9);
        this.f204986g1 = linearLayout2;
        this.f204988h1 = (LinearLayout) linearLayout2.findViewById(C0966R.C0970id.f359074io2);
        this.f204990i1 = (TextView) this.f204986g1.findViewById(C0966R.C0970id.io5);
        this.f204992j1 = (CdnImageView) this.f204986g1.findViewById(C0966R.C0970id.f359075io3);
        this.f204993k1 = (CdnImageView) this.f204986g1.findViewById(C0966R.C0970id.io4);
        this.f204994l1 = (TextView) findViewById(C0966R.C0970id.inz);
        mo97437T7();
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.gym);
        this.f205003q = walletFormView;
        if (this.f204991j == 33) {
            this.f205017x.setText(C75228t.m90260n(this.f204981e));
            this.f205020y.setText(C45121z0.m49962b());
            String stringExtra = getIntent().getStringExtra("desc");
            this.f204947I = stringExtra;
            if (!Util.isNullOrNil(stringExtra)) {
                this.f205015w.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f204947I, this.f205015w.getTextSize()));
                this.f205015w.setVisibility(0);
            } else {
                this.f205015w.setVisibility(8);
            }
            this.f204931A.setVisibility(0);
            this.f204933B.setVisibility(8);
        } else {
            walletFormView.getTitleTv().setText(String.format(getString(C0966R.string.i1s), new Object[]{"¥"}));
            this.f205003q.mo105069a(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                    int i = RemittanceNewBaseUI.f204930K1;
                    remittanceNewBaseUI.f205000p.mo104738c(true);
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            this.f205003q.mo105097o(7, 2);
            WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
            this.f205000p = wcPayKeyboard;
            wcPayKeyboard.mo104738c(true);
            setWPKeyboard(this.f205003q.getContentEt(), true, false);
            this.f205003q.post(new Runnable() {
                public void run() {
                    RemittanceNewBaseUI.this.f205003q.getContentEt().requestFocus();
                }
            });
            setWcKbHeightListener(this);
            this.f205000p.setActionText(getString(C0966R.string.i2_));
            ((C5058t0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5058t0.class)).setValue("keyboard_title_key", getString(C0966R.string.i2_));
            ((RelativeLayout.LayoutParams) this.f205000p.getLayoutParams()).addRule(12);
            TextView textView5 = (TextView) findViewById(C0966R.C0970id.hwo);
            View findViewById = findViewById(C0966R.C0970id.in8);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204931A.setVisibility(8);
            this.f204933B.setVisibility(0);
            setTenpayKBStateListener(new C75217h(this) {
                public void onVisibleStateChange(boolean z) {
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById2 = findViewById(C0966R.C0970id.lh_);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById3 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
        } else {
            View findViewById4 = findViewById(C0966R.C0970id.lh_);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById5 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view5 = findViewById5;
            C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
        }
        final C708003 r1 = new C7089c0() {
            /* renamed from: a */
            public void mo2066a(View view) {
                RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI.f204991j != 33) {
                    remittanceNewBaseUI.f204981e = Util.getDouble(remittanceNewBaseUI.f205003q.getText(), 0.0d);
                    if (!RemittanceNewBaseUI.this.f205003q.mo105094l()) {
                        RemittanceNewBaseUI remittanceNewBaseUI2 = RemittanceNewBaseUI.this;
                        Toast makeText = C76701a.makeText((Context) remittanceNewBaseUI2.getContext(), (CharSequence) "", 0);
                        View inflate = View.inflate(remittanceNewBaseUI2.getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
                        String string = remittanceNewBaseUI2.getContext().getResources().getString(C0966R.string.f361199i23);
                        ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_info);
                        ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(string);
                        makeText.setGravity(17, 0, 0);
                        makeText.setView(inflate);
                        makeText.show();
                        inflate.announceForAccessibility(string);
                    } else {
                        RemittanceNewBaseUI remittanceNewBaseUI3 = RemittanceNewBaseUI.this;
                        if (remittanceNewBaseUI3.f204981e < 0.01d) {
                            remittanceNewBaseUI3.mo97444a8();
                        } else {
                            remittanceNewBaseUI3.hideWcKb();
                            RemittanceNewBaseUI.this.f205003q.clearFocus();
                            RemittanceNewBaseUI remittanceNewBaseUI4 = RemittanceNewBaseUI.this;
                            if (remittanceNewBaseUI4.f204976a1) {
                                remittanceNewBaseUI4.mo97433P7(remittanceNewBaseUI4.f204943G, remittanceNewBaseUI4.f204945H);
                            } else {
                                String str = remittanceNewBaseUI4.f204943G;
                                int i = remittanceNewBaseUI4.f204996n;
                                remittanceNewBaseUI4.getClass();
                                RemittanceNewBaseUI.this.getClass();
                                remittanceNewBaseUI4.mo97430M7(str, i, (String) null, (String) null, RemittanceNewBaseUI.this.f204945H, (String) null, "", (F2fDynamicStartPayEvent) null);
                            }
                        }
                    }
                } else if (!remittanceNewBaseUI.f204976a1) {
                    String str2 = remittanceNewBaseUI.f204943G;
                    int i2 = remittanceNewBaseUI.f204996n;
                    remittanceNewBaseUI.getClass();
                    RemittanceNewBaseUI.this.getClass();
                    RemittanceNewBaseUI remittanceNewBaseUI5 = RemittanceNewBaseUI.this;
                    remittanceNewBaseUI.mo97430M7(str2, i2, (String) null, (String) null, remittanceNewBaseUI5.f204945H, remittanceNewBaseUI5.f204947I, "", (F2fDynamicStartPayEvent) null);
                }
                RemittanceNewBaseUI.this.getClass();
                if (RemittanceNewBaseUI.this.f204989i == 1) {
                    C115669n.INSTANCE.mo160131h(12689, 15, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(12689, 6, 1);
                }
                RemittanceNewBaseUI remittanceNewBaseUI6 = RemittanceNewBaseUI.this;
                if (remittanceNewBaseUI6.f204989i == 1 && !Util.isNullOrNil(remittanceNewBaseUI6.f204943G)) {
                    C115669n.INSTANCE.mo160131h(14074, 2);
                }
            }
        };
        this.f205003q.getContentEt().setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                    Log.m105924i("MicroMsg.RemittanceNewBaseUI", "click enter");
                    r1.onClick((View) null);
                }
                return true;
            }
        });
        this.f205003q.setmContentAbnormalMoneyCheck(true);
        this.f205003q.getContentEt().setTextSize(1, 56.0f);
        this.f205003q.getTitleTv().setTextSize(1, 56.0f);
        this.f205011u = (TextView) findViewById(C0966R.C0970id.f359066im2);
        this.f205013v = (TextView) findViewById(C0966R.C0970id.f5597je);
        this.f205011u.setClickable(true);
        this.f205013v.setClickable(true);
        C75228t.m90252j(this.f205011u, 50);
        C75228t.m90252j(this.f205013v, 50);
        int i2 = this.f204989i;
        if (i2 == 1 || i2 == 6) {
            mo97440W7(getString(C0966R.string.hzm));
        } else {
            mo97440W7(getString(C0966R.string.hzl));
        }
        if (!C75592q0.m90763K() && Util.isEqual(this.f204996n, 0)) {
            this.f204941F = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
            if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
                this.f204937D = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
                this.f204939E = (TextView) findViewById(C0966R.C0970id.lha);
                this.f204937D.post(new Runnable() {
                    public void run() {
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        remittanceNewBaseUI.f204960S = remittanceNewBaseUI.f204937D.getWidth();
                        RemittanceNewBaseUI.this.f204941F.setVisibility(8);
                        Log.m105919d("MicroMsg.RemittanceNewBaseUI", "post: mMaxUnitWidth:%s", Integer.valueOf(RemittanceNewBaseUI.this.f204960S));
                    }
                });
                this.f205003q.setmWalletFormViewListener(new WalletFormView.C75211e() {
                    /* renamed from: a */
                    public void mo93874a(CharSequence charSequence) {
                        if (Util.isEqual(RemittanceNewBaseUI.this.f204958R, 0)) {
                            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "mAmountRemindBit == 0");
                            RemittanceNewBaseUI.this.f204941F.setVisibility(8);
                            return;
                        }
                        long longValue = new Double(Util.getDouble(charSequence.toString(), 0.0d)).longValue();
                        int i = 0;
                        int i2 = 0;
                        while (longValue != 0) {
                            longValue /= 10;
                            i++;
                            i2 = (int) (longValue % 10);
                        }
                        RemittanceNewBaseUI remittanceNewBaseUI = RemittanceNewBaseUI.this;
                        if (i >= remittanceNewBaseUI.f204958R) {
                            int i3 = remittanceNewBaseUI.f205003q.mo105091i(charSequence, remittanceNewBaseUI.f204960S, i2);
                            if (i3 != 0) {
                                RemittanceNewBaseUI.this.f204941F.setVisibility(0);
                                RemittanceNewBaseUI.this.f204939E.setText(C75157y0.m90139b(i));
                                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceNewBaseUI.this.f204937D.getLayoutParams();
                                layoutParams.leftMargin = i3;
                                RemittanceNewBaseUI.this.f204937D.setLayoutParams(layoutParams);
                                return;
                            }
                            RemittanceNewBaseUI.this.f204941F.setVisibility(8);
                            return;
                        }
                        remittanceNewBaseUI.f204941F.setVisibility(8);
                    }
                });
            } else {
                this.f204941F.setVisibility(8);
            }
        }
        if (this.f204989i == 1) {
            C86709a0.m107528h();
            if (((String) C86709a0.m107535s().mo121142i().mo119684e(327732, "0")).equals("0")) {
                C76879j.m92742m(getContext(), C0966R.string.i1v, C0966R.string.i1w, new DialogInterface.OnClickListener(this) {
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(327732, "1");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
            }
        }
        this.f204935C = (LinearLayout) findViewById(C0966R.C0970id.in8);
        mo97455m8();
        mo97451i8();
        mo97452j8();
        int i3 = this.f204991j;
        if (i3 != 33 && i3 != 32) {
            this.f205023z.setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    RemittanceNewBaseUI.this.handleKeyboardTouchEvent(motionEvent);
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceNewBaseUI$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        }
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return this.mKindaEnable ? !this.f205021y0 && this.f205000p.mo104746j() : this.f205000p.mo104746j();
    }

    /* renamed from: j8 */
    public final void mo97452j8() {
        int i = this.f204989i;
        if (!(i == 0 || i == 2) || Util.isNullOrNil(this.f204954N) || this.f204956Q == 0 || this.f204955P != 1) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, C0966R.C0969drawable.cf_, new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    C75228t.m90219L(RemittanceNewBaseUI.this.getContext(), RemittanceNewBaseUI.this.f204954N, false);
                    return false;
                }
            });
        }
    }

    /* renamed from: k8 */
    public final void mo97453k8(TextView textView) {
        mo97454l8(textView, C75228t.m90268r(this.f204985g), this.f204952L, C47806g.m53116a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f204985g)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r2 < r5) goto L_0x0055;
     */
    /* renamed from: l8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97454l8(android.widget.TextView r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            android.text.TextPaint r0 = r10.getPaint()
            int r1 = r10.getWidth()
            float r2 = r10.getTextSize()
            int r6 = (int) r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0016
            r11 = r3
        L_0x0016:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r2 == 0) goto L_0x001e
            r12 = r3
            goto L_0x0034
        L_0x001e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "("
            r2.append(r4)
            r2.append(r12)
            java.lang.String r12 = ")"
            r2.append(r12)
            java.lang.String r12 = r2.toString()
        L_0x0034:
            if (r13 != 0) goto L_0x0037
            r13 = r3
        L_0x0037:
            float r2 = r0.measureText(r11)
            float r3 = r0.measureText(r12)
            float r4 = r0.measureText(r13)
            float r2 = r2 + r3
            float r4 = r4 + r2
            int r5 = r1 * 2
            float r5 = (float) r5
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0055
            float r5 = (float) r1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0078
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0078
        L_0x0055:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "\n"
            r2.append(r4)
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r13 = android.text.TextUtils.ellipsize(r13, r0, r1, r4)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            float r1 = r1 - r3
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r11 = android.text.TextUtils.ellipsize(r11, r0, r1, r2)
            java.lang.String r11 = r11.toString()
        L_0x0078:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r12)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ny.h r13 = (p629ny.C76979h) r13
            android.text.SpannableString r13 = r13.mo107057T1(r9, r12)
            r0 = 2131099865(0x7f0600d9, float:1.7812095E38)
            android.content.res.ColorStateList r8 = kg3.C76577a.m92154e(r9, r0)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r4 = 0
            r5 = 0
            r3 = r0
            r7 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            int r11 = r11.length()
            int r12 = r12.length()
            r1 = 33
            r13.setSpan(r0, r11, r12, r1)
            android.widget.TextView$BufferType r11 = android.widget.TextView.BufferType.SPANNABLE
            r10.setText(r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceNewBaseUI.mo97454l8(android.widget.TextView, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: m8 */
    public void mo97455m8() {
        int i;
        if (this.f204976a1) {
            this.f205000p.mo104740e();
        } else if (Util.isNullOrNil(this.f204953M) || (i = this.f204956Q) == 0) {
            Log.m105925i("MicroMsg.RemittanceNewBaseUI", "mComfirmWording: %s", this.f204953M);
            if (!this.f204984f1 || this.f204951K != 14) {
                this.f205000p.mo104740e();
            } else {
                this.f205000p.setTipText(getString(C0966R.string.n4d));
            }
        } else {
            Log.m105925i("MicroMsg.RemittanceNewBaseUI", "has resp, update placeholdertv, mComfirmWording: %s  mDelayMode: %s, flag: %s", this.f204953M, Integer.valueOf(i), Boolean.valueOf(this.f204984f1));
            int i2 = this.f204956Q == 1 ? 2 : 24;
            try {
                if (!this.f204984f1 || this.f204951K != 14) {
                    this.f205000p.setTipText(String.format(this.f204953M, new Object[]{Integer.valueOf(i2)}));
                    return;
                }
                Log.m105924i("MicroMsg.RemittanceNewBaseUI", "first group transfer");
                LinearLayout linearLayout = (LinearLayout) View.inflate(getContext(), C0966R.C0971layout.d5w, (ViewGroup) null);
                ((TextView) linearLayout.findViewById(C0966R.C0970id.o07)).setText(getString(C0966R.string.n4d));
                ((TextView) linearLayout.findViewById(C0966R.C0970id.o06)).setText(String.format(this.f204953M, new Object[]{Integer.valueOf(i2)}));
                this.f205000p.setToolBarContent(linearLayout);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "updatePlaceHolderTv() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                this.f205000p.setTipText(getString(C0966R.string.f361197i21, new Object[]{Integer.valueOf(i2)}));
            }
        }
    }

    public boolean needLockPage() {
        int i = this.f204991j;
        return i == 33 || i == 32;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "reqcode=" + i + ", resultCode=" + i2 + ", username=" + this.f204985g);
        C70905k0.m83420b();
        C70905k0.C70906a.f205332a.mo97575c(this);
        boolean z = false;
        if (i == 1) {
            if (i2 == -1) {
                z = true;
            }
            mo97436S7(z, intent);
        } else if (i != 2) {
            if (i == 5) {
                if (i2 == -1) {
                    z = true;
                }
                mo97436S7(z, intent);
            } else if (i == 7 && i2 == -1 && intent != null) {
                int intExtra = intent.getIntExtra("key_close_scene", 0);
                Log.m105925i("MicroMsg.RemittanceNewBaseUI", "closeScene is: %s", Integer.valueOf(intExtra));
                if (intExtra == 1) {
                    showLoading();
                } else if (intExtra != 2) {
                    Log.m105924i("MicroMsg.RemittanceNewBaseUI", "normal close");
                } else {
                    this.f205003q.getContentEt().setText("");
                }
            }
        } else if (i2 != -1 || intent == null) {
            finish();
        } else {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!Util.isNullOrNil(stringExtra)) {
                this.f204985g = stringExtra;
                mo97437T7();
            } else {
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        this.f204989i = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f204991j = getIntent().getIntExtra("pay_scene", 31);
        int i = this.f204989i;
        if (!(i == 0 || i == 2)) {
            String uuid = UUID.randomUUID().toString();
            this.f204965U0 = uuid;
            C67342b.m79685d(uuid);
        }
        if (this instanceof RemittanceUI) {
            this.f204996n = 0;
        }
        super.onCreate(bundle);
        addSceneEndListener(NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE);
        addSceneEndListener(2548);
        this.f204979d = C77302a.m93124d(getIntent());
        this.f204998o = getIntent().getStringExtra("scan_remittance_id");
        this.f204981e = getIntent().getDoubleExtra("fee", 0.0d);
        this.f204985g = getIntent().getStringExtra("receiver_name");
        getIntent().getStringExtra("receiver_nick_name");
        this.f204952L = getIntent().getStringExtra("receiver_true_name");
        this.f204983f = getIntent().getStringExtra("mch_name");
        this.f204987h = getIntent().getStringExtra("mch_info");
        this.f204951K = getIntent().getIntExtra("pay_channel", 0);
        this.f204962T = Util.nullAs(getIntent().getStringExtra("rcvr_open_id"), "");
        this.f204968W = getIntent().getStringExtra("key_group_name");
        this.f204976a1 = C72996z1.m85843n5(this.f204985g);
        if (Util.isNullOrNil(this.f204968W)) {
            this.f204951K = 11;
            if (this.f204976a1) {
                this.f204980d1 = 2;
            } else {
                this.f204980d1 = 1;
            }
        } else if (C45628s0.m50735A(this.f204968W)) {
            this.f204951K = 58;
            this.f204980d1 = 4;
        } else {
            this.f204951K = 14;
            this.f204980d1 = 3;
        }
        Log.m105925i("MicroMsg.RemittanceNewBaseUI", "mUserName:%s mSendType:%s mChatType:%s", this.f204985g, Integer.valueOf(this.f204982e1), Integer.valueOf(this.f204980d1));
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_GROUP_TRANSFER_KEYBOARD_TIPS_FIRST_SHOWN_BOOLEAN_SYNC;
        boolean booleanValue = ((Boolean) i2.mo119685f(aVar, Boolean.TRUE)).booleanValue();
        this.f204984f1 = booleanValue;
        if (booleanValue) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.FALSE);
        }
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        if ((16 & longValue) != 0) {
            this.f204956Q = 1;
        } else if ((longValue & 32) != 0) {
            this.f204956Q = 2;
        } else {
            this.f204956Q = 0;
        }
        if (this.f204976a1) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f204985g);
            String wo = ((C76158j) C86312j.m106911c(C76158j.class)).mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2());
            this.f204977b1 = wo;
            if (wo == null) {
                this.f204977b1 = "";
            }
            mo97432O7();
        } else {
            mo97429L7();
        }
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
        initView();
        this.f204950J1.alive();
        C79144b.m95773a().getClass();
        this.mKindaEnable = true;
        this.f205012u1 = 1;
        C70905k0.m83420b();
        C70905k0.C70906a.f205332a.mo97575c(this);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onDestroy()");
        MMHandlerThread.removeRunnable(this.f205014v1);
        this.f205016w1.dead();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
        this.f204950J1.dead();
        this.f204938D1.dead();
        this.f204934B1.dead();
        C67342b.m79684c(this.f204965U0);
        removeSceneEndListener(NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE);
        removeSceneEndListener(2548);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f205014v1, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.f205000p;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onPause()");
        if (!this.f205000p.mo104747k()) {
            this.f205012u1 = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onResume()");
        C70905k0.m83420b();
        C70905k0.C70906a.f205332a.mo97575c(this);
        if (this.f205012u1 == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
            this.f205003q.requestFocus();
        }
        this.f205012u1 = 2;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        int i4 = i2;
        final C117747y yVar2 = yVar;
        this.f204966V = "";
        if (i == 0 && i4 == 0) {
            if (yVar2 instanceof C70587h0) {
                C70587h0 h0Var = (C70587h0) yVar2;
                C75155x0.m90137c(this.f204991j, h0Var.f204093d, i4);
                this.f204949J = h0Var.f204099j;
                if (!Util.isNullOrNil(h0Var.f204105s)) {
                    this.f204952L = h0Var.f204105s;
                }
                int i5 = this.f204991j;
                if (i5 == 32 || i5 == 33) {
                    this.f204974Z = h0Var.f204107u;
                } else {
                    this.f204974Z = h0Var.f204074D;
                }
                this.f205001p0 = h0Var.f204097h;
                C77302a aVar = this.f204979d;
                if (aVar != null) {
                    aVar.mo107447b(10000, Integer.valueOf(i5), this.f204985g, Double.valueOf(h0Var.f204111y));
                }
                C77965lu luVar = h0Var.f204087R;
                this.f204964U = luVar == null ? "" : Util.isNullOrNil(luVar.f227825g) ? this.f204964U : h0Var.f204087R.f227825g;
                if (!mo97445b8(h0Var)) {
                    mo97449f8(h0Var.f204093d, this.f204985g, this.f204952L, h0Var);
                } else if (this.mKindaEnable) {
                    hideLoading();
                }
                ((HashMap) this.f204972Y).put(h0Var.f204093d, new PayCheckStrut(h0Var.f204106t, h0Var.f204107u, h0Var.f204108v, h0Var.f204109w, h0Var.f204110x, h0Var.f204074D, h0Var.f204075E, h0Var.f204076F, Util.getLong(h0Var.f204072B, 0)));
                long j = h0Var.f204091V;
                if (j <= 0 || j > 1800) {
                    this.f204971X0 = 0;
                    this.f204973Y0 = "";
                    this.f204975Z0 = 0;
                } else {
                    this.f204971X0 = j;
                    this.f204973Y0 = h0Var.f204090U;
                    this.f204975Z0 = Util.getLong(h0Var.f204072B, 0);
                }
            } else if (yVar2 instanceof C57179r0) {
                C57179r0 r0Var = (C57179r0) yVar2;
                C64737tr trVar = r0Var.f163881r;
                C75155x0.m90137c(this.f204991j, trVar.f185669j, i4);
                if (trVar.f185663d != 0) {
                    hideLoading();
                    mo97443Z7(this, trVar.f185664e, false);
                    return true;
                }
                if (Util.isNullOrNil(trVar.f185669j)) {
                    Log.m105924i("MicroMsg.RemittanceNewBaseUI", "UnionTransferPlaceOrder prepay_id is null");
                }
                this.f204949J = trVar.f185666g;
                this.f204974Z = trVar.f185667h;
                C77302a aVar2 = this.f204979d;
                if (aVar2 != null) {
                    aVar2.mo107447b(10000, Integer.valueOf(this.f204991j), this.f204985g, Double.valueOf(r0Var.f163882s));
                }
                if (!mo97435R7(r0Var)) {
                    mo97448e8(r0Var);
                } else if (this.mKindaEnable) {
                    hideLoading();
                }
                String str2 = trVar.f185667h;
                String str3 = this.f204985g;
                ((HashMap) this.f204972Y).put(trVar.f185669j, new PayCheckStrut("", str2, "", str3, 0, str2, str2, str3, 0));
                yk4 yk4 = trVar.f185671o;
                if (yk4 == null || (i3 = yk4.f145348d) <= 0 || i3 > 1800) {
                    this.f204971X0 = 0;
                    this.f204973Y0 = "";
                    this.f204975Z0 = 0;
                } else {
                    this.f204971X0 = (long) i3;
                    this.f204973Y0 = yk4.f145349e.mo123705h();
                    this.f204975Z0 = Math.round(r0Var.f163882s * 100.0d);
                }
            } else if (yVar2 instanceof C78348k0) {
                C78348k0 k0Var = (C78348k0) yVar2;
                this.f204953M = k0Var.f229585d;
                this.f204954N = k0Var.f229590i;
                this.f204955P = k0Var.f229591j;
                mo97455m8();
                mo97452j8();
            }
            return true;
        }
        if (yVar2 instanceof C78348k0) {
            Log.m105924i("MicroMsg.RemittanceNewBaseUI", "net error, use hardcode wording");
            this.mWcKeyboard.mo104740e();
        } else if (yVar2 instanceof C70587h0) {
            if (this.mKindaEnable) {
                hideLoading();
            }
            C70587h0 h0Var2 = (C70587h0) yVar2;
            this.f204957Q0 = h0Var2;
            this.f205016w1.alive();
            C75155x0.m90137c(this.f204991j, "", i4);
            if (mo97441X7(h0Var2)) {
                return true;
            }
            if (mo97434Q7() instanceof RemittanceLargeMoneyUI) {
                Log.m105924i("MicroMsg.RemittanceNewBaseUI", "Remittance LargeMoneyUI error process");
                C77426q qVar = new C77426q(mo97434Q7());
                qVar.mo107595g(Util.isNullOrNil(str) ? getContext().getString(C0966R.string.l_3) : str);
                qVar.mo107600l(new C47883u(this) {
                    /* renamed from: a */
                    public void mo353a(boolean z, String str) {
                        int i = ((C70587h0) yVar2).f204092W;
                        Log.m105925i("MicroMsg.RemittanceNewBaseUI", "error_retcode: %s", Integer.valueOf(i));
                        if (i == 268491141) {
                            C70905k0.m83420b();
                            C70905k0.C70906a.f205332a.mo97574a(2);
                            return;
                        }
                        C70905k0.m83420b();
                        C70905k0.C70906a.f205332a.mo97574a(0);
                    }
                });
                qVar.mo107602n(getContext().getString(C0966R.string.kke));
                qVar.mo107603o();
                return true;
            }
        } else if (yVar2 instanceof C57179r0) {
            if (this.mKindaEnable) {
                hideLoading();
            }
            C57179r0 r0Var2 = (C57179r0) yVar2;
            this.f204959R0 = r0Var2;
            this.f205016w1.alive();
            C75155x0.m90137c(this.f204991j, "", i4);
            if (!mo97435R7(r0Var2)) {
                mo97443Z7(this, str, false);
            }
        }
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        Log.m105924i("MicroMsg.RemittanceNewBaseUI", "onWindowFocusChanged");
        C101218e0 e0Var = this.f204967V0;
        if (e0Var != null && !e0Var.mo140661h()) {
            this.f204967V0.mo140680z();
            this.f204967V0 = null;
            Runnable runnable = this.f205014v1;
            if (runnable != null) {
                MMHandlerThread.postToMainThreadDelayed(runnable, 300);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5058t0.class);
    }
}
