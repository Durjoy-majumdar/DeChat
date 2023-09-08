package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent;
import com.tencent.p014mm.autogen.events.WCPayUpdateSaveFetchUIEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71615a1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71617b1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71623c1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71624d1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71640l1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71642m1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71652v;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72504p;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import de3.C75355a0;
import di3.C86312j;
import ep3.C97688c;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import ie3.C76324c;
import j20.C117292a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k53.C76492a;
import kg3.C76577a;
import lg3.C88494d;
import lp3.C46888b;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p206nj.C11171e;
import qo3.C101218e0;
import qo3.C77389a;
import qo3.C77398g;
import r43.C12945b;
import te3.C51892wy;
import te3.C52159yr2;
import te3.C64705s9;
import te3.C64862yp3;
import te3.C77977pf3;
import te3.C78002u53;
import te3.C78008wk;
import te3.C78015xr2;
import te3.C78016y53;
import v53.C78342e0;
import y43.C79029b0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI */
public class WalletLqtSaveFetchUI extends WalletLqtBasePresenterUI implements WcPayKeyboard.C75086f {

    /* renamed from: m1 */
    public static final /* synthetic */ int f208151m1 = 0;

    /* renamed from: A */
    public LinearLayout f208152A;

    /* renamed from: B */
    public LinearLayout f208153B;

    /* renamed from: C */
    public LinearLayout f208154C;

    /* renamed from: D */
    public LinearLayout f208155D;

    /* renamed from: E */
    public TextView f208156E;

    /* renamed from: F */
    public TextView f208157F;

    /* renamed from: G */
    public boolean f208158G;

    /* renamed from: H */
    public WalletLqtArriveTimeLayout f208159H;

    /* renamed from: I */
    public ScrollView f208160I;

    /* renamed from: J */
    public TextView f208161J;

    /* renamed from: K */
    public TextView f208162K;

    /* renamed from: L */
    public LinearLayout f208163L;

    /* renamed from: M */
    public TextView f208164M;

    /* renamed from: N */
    public TextView f208165N;

    /* renamed from: P */
    public TextView f208166P;

    /* renamed from: Q */
    public LqtSaveKeyboardToolBarLayout f208167Q;

    /* renamed from: Q0 */
    public boolean f208168Q0;

    /* renamed from: R */
    public CharSequence f208169R;

    /* renamed from: R0 */
    public boolean f208170R0;

    /* renamed from: S */
    public Bankcard f208171S;

    /* renamed from: S0 */
    public boolean f208172S0;

    /* renamed from: T */
    public int f208173T;

    /* renamed from: T0 */
    public String f208174T0;

    /* renamed from: U */
    public long f208175U;

    /* renamed from: U0 */
    public boolean f208176U0;

    /* renamed from: V */
    public Bankcard f208177V;

    /* renamed from: V0 */
    public int f208178V0;

    /* renamed from: W */
    public boolean f208179W;

    /* renamed from: W0 */
    public String f208180W0;

    /* renamed from: X */
    public String f208181X;

    /* renamed from: X0 */
    public C43337b f208182X0;

    /* renamed from: Y */
    public Bankcard f208183Y;

    /* renamed from: Y0 */
    public boolean f208184Y0;

    /* renamed from: Z */
    public String f208185Z;

    /* renamed from: Z0 */
    public long f208186Z0;

    /* renamed from: a1 */
    public int f208187a1;

    /* renamed from: b1 */
    public C101218e0 f208188b1;

    /* renamed from: c1 */
    public boolean f208189c1;

    /* renamed from: d1 */
    public boolean f208190d1;

    /* renamed from: e */
    public C71615a1 f208191e = ((C71615a1) this.f207915d.mo136941c(this, C71615a1.class));

    /* renamed from: e1 */
    public C71654w.C71657c f208192e1;

    /* renamed from: f */
    public C71624d1 f208193f;

    /* renamed from: f1 */
    public HashMap<String, Integer> f208194f1;

    /* renamed from: g */
    public C71642m1 f208195g;

    /* renamed from: g1 */
    public final View.OnClickListener f208196g1;

    /* renamed from: h */
    public ViewGroup f208197h;

    /* renamed from: h1 */
    public IListener f208198h1;

    /* renamed from: i */
    public WalletFormView f208199i;

    /* renamed from: i1 */
    public int f208200i1;

    /* renamed from: j */
    public TextView f208201j;

    /* renamed from: j1 */
    public Runnable f208202j1;

    /* renamed from: k1 */
    public Runnable f208203k1;

    /* renamed from: l1 */
    public IListener<KindaBindCardEvent> f208204l1;

    /* renamed from: n */
    public TextView f208205n;

    /* renamed from: o */
    public TextView f208206o;

    /* renamed from: p */
    public ImageView f208207p;

    /* renamed from: p0 */
    public int f208208p0;

    /* renamed from: q */
    public TextView f208209q;

    /* renamed from: r */
    public TextView f208210r;

    /* renamed from: s */
    public ViewGroup f208211s;

    /* renamed from: t */
    public TextView f208212t;

    /* renamed from: u */
    public CheckBox f208213u;

    /* renamed from: v */
    public TextView f208214v;

    /* renamed from: w */
    public LinearLayout f208215w;

    /* renamed from: x */
    public LinearLayout f208216x;

    /* renamed from: x0 */
    public boolean f208217x0;

    /* renamed from: y */
    public LinearLayout f208218y;

    /* renamed from: y0 */
    public List<Bankcard> f208219y0;

    /* renamed from: z */
    public TextView f208220z;

    public WalletLqtSaveFetchUI() {
        C97688c cVar = this.f207915d;
        C71624d1 d1Var = new C71624d1(this.f208191e, (C71617b1) cVar.mo136940b(this, C71617b1.class), this, 1, 0);
        this.f208193f = d1Var;
        this.f208195g = new C71642m1(d1Var);
        this.f208175U = -1;
        this.f208179W = false;
        this.f208217x0 = false;
        this.f208168Q0 = false;
        this.f208170R0 = false;
        this.f208172S0 = false;
        this.f208174T0 = "";
        this.f208176U0 = false;
        this.f208178V0 = MMApplicationContext.getContext().getResources().getColor(C0966R.color.FG_1);
        this.f208180W0 = "";
        this.f208184Y0 = false;
        this.f208186Z0 = 0;
        this.f208189c1 = true;
        this.f208190d1 = false;
        this.f208192e1 = new WalletLqtSaveFetchUI$$l(this);
        this.f208194f1 = new HashMap<>();
        this.f208196g1 = new WalletLqtSaveFetchUI$$m(this);
        C40008f fVar = C40008f.f107254d;
        this.f208198h1 = new IListener<WCPayLqtSaveFetchUIShowDialogEvent>(fVar) {
            {
                this.__eventId = -2140026809;
            }

            public boolean callback(IEvent iEvent) {
                Long l;
                WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = (WCPayLqtSaveFetchUIShowDialogEvent) iEvent;
                WCPayLqtSaveFetchUIShowDialogEvent.C40181a aVar = wCPayLqtSaveFetchUIShowDialogEvent.f107805d;
                C52159yr2 yr22 = aVar.f107806a;
                if (yr22 != null) {
                    WalletLqtSaveFetchUI.this.f208182X0.mo67549a(yr22, new C43343g2(this));
                } else if (aVar.f107807b != null) {
                    long j = 0;
                    if (WalletLqtSaveFetchUI.this.f208186Z0 != 0) {
                        Log.m105920e("MicroMsg.WalletLqtSaveFetchUI", "last compliance usecase wast not stopped as expected!");
                    }
                    byte[] bArr = wCPayLqtSaveFetchUIShowDialogEvent.f107805d.f107807b;
                    C71799h2 h2Var = new C71799h2(this);
                    C87412m.m108594g(bArr, "data");
                    if (bArr.length == 0) {
                        l = null;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ITransmitKvData create = ITransmitKvData.create();
                        create.putBinary("half_page_view_data", bArr);
                        create.putLong("usecase_platform_session", currentTimeMillis);
                        C76324c cVar = (C76324c) C86312j.m106911c(C76324c.class);
                        if (cVar != null) {
                            cVar.startUseCase("complianceHalfPage", create, new C72504p(h2Var));
                        }
                        l = Long.valueOf(currentTimeMillis);
                    }
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI.this;
                    if (l != null) {
                        j = l.longValue();
                    }
                    walletLqtSaveFetchUI.f208186Z0 = j;
                }
                return false;
            }
        };
        this.f208200i1 = 0;
        this.f208202j1 = new WalletLqtSaveFetchUI$$v(this);
        this.f208203k1 = new WalletLqtSaveFetchUI$$w(this);
        this.f208204l1 = new IListener<KindaBindCardEvent>(fVar) {
            {
                this.__eventId = 572563856;
            }

            public boolean callback(IEvent iEvent) {
                KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
                Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent callback");
                if (kindaBindCardEvent == null) {
                    return false;
                }
                C75133p0.m90117a();
                KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
                if (aVar != null) {
                    if (aVar.f193699a) {
                        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent bindCard Succ");
                        WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI.this;
                        int i = WalletLqtSaveFetchUI.f208151m1;
                        List<Bankcard> P7 = walletLqtSaveFetchUI.mo98977P7();
                        WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = WalletLqtSaveFetchUI.this;
                        walletLqtSaveFetchUI2.f208195g.f207645d.mo98814b(walletLqtSaveFetchUI2.f208173T, walletLqtSaveFetchUI2.f208208p0, 1).mo123062e(new C71801i2(this, P7));
                    } else {
                        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "KindaBindCardEvent bindCard Cancel");
                    }
                }
                WalletLqtSaveFetchUI.this.f208204l1.dead();
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public static void m84234H7(WalletLqtSaveFetchUI walletLqtSaveFetchUI, int i) {
        walletLqtSaveFetchUI.getClass();
        if (i == 0) {
            C115669n.INSTANCE.mo160131h(20287, 15);
        } else if (i == 1) {
            C115669n.INSTANCE.mo160131h(17084, 27);
        } else if (i == 2) {
            C115669n.INSTANCE.mo160131h(17084, 29);
        }
    }

    /* renamed from: I7 */
    public static void m84235I7(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        boolean z = true;
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "reportSelectCardClicked, has show tips: %s", Boolean.valueOf(walletLqtSaveFetchUI.f208158G));
        if (walletLqtSaveFetchUI.f208158G) {
            walletLqtSaveFetchUI.f208158G = false;
            walletLqtSaveFetchUI.f208215w.setVisibility(8);
            C71654w wVar = C71654w.f207659q;
            if (walletLqtSaveFetchUI.f208173T != 1) {
                z = false;
            }
            wVar.mo98818a(z);
            C78015xr2 xr22 = z ? wVar.f207662a : wVar.f207663b;
            if (xr22 != null) {
                xr22.f228545q = null;
            }
        }
    }

    /* renamed from: J7 */
    public static void m84236J7(WalletLqtSaveFetchUI walletLqtSaveFetchUI, C101218e0 e0Var, C78008wk wkVar) {
        walletLqtSaveFetchUI.getClass();
        if (e0Var != null && wkVar != null) {
            int i = wkVar.f228351d;
            if (i == 1) {
                walletLqtSaveFetchUI.finish();
            } else if (i == 2) {
                C75228t.m90219L(walletLqtSaveFetchUI.getContext(), wkVar.f228352e, true);
            } else if (i == 3) {
                C75228t.m90224Q(wkVar.f228353f, wkVar.f228352e, 0, 1000);
            } else if (i != 4) {
                e0Var.mo140680z();
            } else {
                e0Var.mo140680z();
                if ("weixin://weui/selectbackcarddialog".equals(wkVar.f228352e)) {
                    C115669n.INSTANCE.mo160131h(20287, 14);
                    walletLqtSaveFetchUI.mo98984W7(walletLqtSaveFetchUI.f208180W0, 0);
                } else if ("weixin://mmpaylqt/lqtfetchui".equals(wkVar.f228352e)) {
                    C115669n.INSTANCE.mo160131h(20287, 13);
                    View.OnClickListener onClickListener = walletLqtSaveFetchUI.f208196g1;
                    if (onClickListener != null) {
                        onClickListener.onClick((View) null);
                    }
                } else if ("weixin://mmpaylqt/lqtsaveui".equals(wkVar.f228352e)) {
                    Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "bottom dialog click continue to save");
                    View.OnClickListener onClickListener2 = walletLqtSaveFetchUI.f208196g1;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick((View) null);
                    }
                }
            }
        }
    }

    /* renamed from: K7 */
    public final void mo98972K7(boolean z) {
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "check enable: %s, %s", Boolean.valueOf(z), Boolean.valueOf(this.f208168Q0));
        if (!z || this.f208168Q0) {
            mo98976O7(false);
        } else if (this.f208173T == 1) {
            if (this.f208211s.getVisibility() == 0) {
                if (!this.f208213u.isChecked() || !this.f208217x0) {
                    mo98976O7(false);
                } else {
                    mo98976O7(true);
                }
            } else if (this.f208217x0) {
                mo98976O7(true);
            }
        } else if (!this.f208217x0 || (this.f208159H.getSelectRedeemType() == null && this.f208159H.getRedeemTypeList() != null && !this.f208159H.getRedeemTypeList().isEmpty())) {
            mo98976O7(false);
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = this.f208159H.getSelectRedeemType() == null ? null : Integer.valueOf(this.f208159H.getSelectRedeemType().f186579d);
            Log.m105927v("MicroMsg.WalletLqtSaveFetchUI", "redeem type: %s", objArr);
            mo98976O7(true);
        }
    }

    /* renamed from: L7 */
    public final void mo98973L7() {
        WalletLqtArriveTimeLayout walletLqtArriveTimeLayout = this.f208159H;
        walletLqtArriveTimeLayout.f207907h = false;
        List<C64862yp3> list = walletLqtArriveTimeLayout.f207903d;
        if (list != null) {
            list.clear();
        }
        walletLqtArriveTimeLayout.f207905f = null;
        walletLqtArriveTimeLayout.f207904e.clear();
        walletLqtArriveTimeLayout.setVisibility(4);
    }

    /* renamed from: M7 */
    public final void mo98974M7(C101218e0 e0Var, C71652v vVar) {
        C77977pf3 pf32;
        C78008wk wkVar;
        if (e0Var != null) {
            long Y = C75228t.m90232Y(this.f208199i.getText() + "", "100");
            char c = 0;
            if (!(vVar == null || (pf32 = vVar.f207655a) == null || ((wkVar = pf32.f228014h) == null && pf32.f228015i == null))) {
                c = (wkVar == null || pf32.f228015i == null) ? (char) 2 : 1;
            }
            C77977pf3 pf33 = vVar.f207655a;
            if (c == 2) {
                e0Var.f296375F = new WalletLqtSaveFetchUI$$n(this, pf33, e0Var);
                return;
            }
            if (c == 1) {
                C101218e0 e0Var2 = e0Var;
                C77977pf3 pf34 = pf33;
                C71652v vVar2 = vVar;
                long j = Y;
                WalletLqtSaveFetchUI$$o walletLqtSaveFetchUI$$o = new WalletLqtSaveFetchUI$$o(this, e0Var2, pf34, vVar2, j);
                WalletLqtSaveFetchUI$$p walletLqtSaveFetchUI$$p = new WalletLqtSaveFetchUI$$p(this, e0Var2, pf34, vVar2, j);
                e0Var.f296373D = walletLqtSaveFetchUI$$o;
                e0Var.f296374E = walletLqtSaveFetchUI$$p;
            }
            e0Var.mo140665l(new WalletLqtSaveFetchUI$$q(this));
        }
    }

    /* renamed from: N7 */
    public final double mo98975N7(String str, String str2, int i) {
        try {
            return new BigDecimal(Util.getDouble(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new BigDecimal(str2.trim()), 5, i).doubleValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "", new Object[0]);
            return 0.0d;
        }
    }

    /* renamed from: O7 */
    public final void mo98976O7(boolean z) {
        this.mWcKeyboard.mo104738c(z);
    }

    /* renamed from: P7 */
    public final List<Bankcard> mo98977P7() {
        List<Bankcard> c = C71654w.f207659q.mo98820c(this.f208173T == 1);
        if (c == null || c.size() == 0) {
            c = C79029b0.vx0().wx0().mo91332n(true);
        }
        LinkedList linkedList = new LinkedList();
        for (Bankcard bankcard : c) {
            if (!bankcard.mo99388n2() || C79029b0.vx0().wx0().mo91343y()) {
                if (this.f208173T == 1 && (bankcard.field_support_lqt_turn_in == 1 || bankcard.mo99388n2())) {
                    linkedList.add(bankcard);
                }
                if (this.f208173T == 2 && (bankcard.field_support_lqt_turn_out == 1 || bankcard.mo99388n2())) {
                    linkedList.add(bankcard);
                }
            } else {
                linkedList.add(bankcard);
            }
        }
        return linkedList;
    }

    /* renamed from: Q7 */
    public final C78002u53 mo98978Q7() {
        int intExtra = getIntent().getIntExtra("entrance_type", 0);
        C71654w.f207659q.getClass();
        byte[] decode = Base64.decode(MultiProcessMMKV.getMMKV("WCPay.OnClickPurchaseRes").getString(((String) C86709a0.m107535s().mo121142i().mo119684e(2, "")) + intExtra, ""), 0);
        C78002u53 u532 = new C78002u53();
        if (decode.length > 0) {
            try {
                u532.parseFrom(decode);
            } catch (Exception unused) {
            }
        }
        return u532;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r4 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if ((r0 != null && (r0.isEmpty() ^ true)) != false) goto L_0x0039;
     */
    /* renamed from: R2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95768R2(float r7) {
        /*
            r6 = this;
            android.widget.ScrollView r0 = r6.f208160I
            if (r0 == 0) goto L_0x00c2
            com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout r0 = r6.f208167Q
            if (r0 == 0) goto L_0x00c2
            te3.hg2 r0 = r0.f207901G
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0060
        L_0x0011:
            int r4 = r0.f134614e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r4 != 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0022
            r4 = 1
            goto L_0x0023
        L_0x0022:
            r4 = 0
        L_0x0023:
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r0.f134615f
            if (r4 == 0) goto L_0x0036
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r4 != r3) goto L_0x0036
            r4 = 1
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r0 = 1
            goto L_0x0060
        L_0x003b:
            int r4 = r0.f134614e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r4 != 0) goto L_0x0044
            goto L_0x004c
        L_0x0044:
            int r4 = r4.intValue()
            if (r4 != r1) goto L_0x004c
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            if (r4 == 0) goto L_0x000f
            java.util.LinkedList<te3.do3> r0 = r0.f134616g
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 != r3) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x000f
            goto L_0x0039
        L_0x0060:
            if (r0 == 0) goto L_0x00c2
            int[] r0 = new int[r1]
            android.widget.ScrollView r4 = r6.f208160I
            r4.getLocationOnScreen(r0)
            r0 = r0[r3]
            android.widget.ScrollView r4 = r6.f208160I
            int r4 = r4.getHeight()
            int r0 = r0 + r4
            int r7 = (int) r7
            int r0 = r0 - r7
            int[] r4 = new int[r1]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r6.f208199i
            r5.getLocationOnScreen(r4)
            r4 = r4[r3]
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r5 = r6.f208199i
            int r5 = r5.getHeight()
            int r4 = r4 + r5
            java.lang.String r5 = "MicroMsg.WalletLqtSaveFetchUI"
            if (r7 == 0) goto L_0x00ae
            if (r0 < r4) goto L_0x008b
            goto L_0x00ae
        L_0x008b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r3] = r0
            java.lang.String r0 = "keyboard covered saveForm, %d < %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            android.widget.ScrollView r0 = r6.f208160I
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.bottomMargin = r7
            android.widget.ScrollView r7 = r6.f208160I
            r7.setLayoutParams(r0)
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r7 = "keyboard not covering saveForm, reset"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            android.widget.ScrollView r7 = r6.f208160I
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r7.bottomMargin = r2
            android.widget.ScrollView r0 = r6.f208160I
            r0.setLayoutParams(r7)
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI.mo95768R2(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0596, code lost:
        if ((r0 != null && r0.intValue() == 0) != false) goto L_0x0598;
     */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0813  */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98979R7(boolean r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.Class<xs.b> r0 = p755xs.C102720b.class
            int r2 = r1.f208173T
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 2131316741(0x7f095005, float:1.8251972E38)
            r6 = 2
            r7 = 0
            r8 = 2131308324(0x7f092f24, float:1.82349E38)
            if (r2 != r6) goto L_0x00ca
            if (r32 == 0) goto L_0x00ca
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r2 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.mo98819b(r7)
            r1.f208177V = r2
            if (r2 != 0) goto L_0x00ca
            android.widget.LinearLayout r0 = r1.f208216x
            r0.setVisibility(r7)
            android.widget.TextView r0 = r1.f208220z
            r2 = 2131839236(0x7f114904, float:1.9311718E38)
            java.lang.String r2 = r1.getString(r2)
            r0.setText(r2)
            android.widget.LinearLayout r0 = r1.f208218y
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r1.f208152A
            r0.setVisibility(r7)
            android.widget.LinearLayout r0 = r1.f208153B
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f208156E
            r2 = 2131839217(0x7f1148f1, float:1.931168E38)
            java.lang.String r2 = r1.getString(r2)
            r0.setText(r2)
            android.widget.TextView r0 = r1.f208205n
            r0.setClickable(r7)
            android.view.View r0 = r1.findViewById(r8)
            if (r0 == 0) goto L_0x0060
            android.view.View r0 = r1.findViewById(r8)
            r0.setClickable(r7)
        L_0x0060:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r1.f208199i
            r0.setContentClickable(r7)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r1.f208199i
            android.widget.EditText r0 = r0.getContentEt()
            if (r0 == 0) goto L_0x0070
            r0.setCursorVisible(r7)
        L_0x0070:
            android.view.View r0 = r1.findViewById(r5)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI"
            java.lang.String r11 = "updateFetchViewLoading"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI"
            java.lang.String r10 = "updateFetchViewLoading"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.LinearLayout r0 = r1.f208163L
            r0.setVisibility(r3)
            android.view.ViewGroup r0 = r1.f208211s
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f208210r
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r1.f208155D
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r1.f208215w
            r0.setVisibility(r3)
            return
        L_0x00ca:
            int r2 = r1.f208173T
            r9 = 1
            if (r2 != r6) goto L_0x00f1
            android.widget.TextView r2 = r1.f208205n
            r2.setClickable(r9)
            android.view.View r2 = r1.findViewById(r8)
            if (r2 == 0) goto L_0x00e1
            android.view.View r2 = r1.findViewById(r8)
            r2.setClickable(r9)
        L_0x00e1:
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r1.f208199i
            r2.setContentClickable(r9)
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r2 = r1.f208199i
            android.widget.EditText r2 = r2.getContentEt()
            if (r2 == 0) goto L_0x00f1
            r2.setCursorVisible(r9)
        L_0x00f1:
            android.widget.LinearLayout r2 = r1.f208216x
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r1.f208218y
            r2.setVisibility(r7)
            android.widget.LinearLayout r2 = r1.f208152A
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r1.f208153B
            r2.setVisibility(r7)
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r2 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            int r10 = r1.f208173T
            if (r10 != r9) goto L_0x010d
            r10 = 1
            goto L_0x010e
        L_0x010d:
            r10 = 0
        L_0x010e:
            java.util.List r2 = r2.mo98820c(r10)
            if (r2 == 0) goto L_0x011a
            int r10 = r2.size()
            if (r10 != 0) goto L_0x0126
        L_0x011a:
            y43.b0 r2 = y43.C79029b0.vx0()
            b63.s0 r2 = r2.wx0()
            java.util.ArrayList r2 = r2.mo91332n(r9)
        L_0x0126:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x012f:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L_0x016a
            java.lang.Object r11 = r2.next()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r11
            boolean r12 = r11.mo99388n2()
            if (r12 == 0) goto L_0x0153
            y43.b0 r12 = y43.C79029b0.vx0()
            b63.s0 r12 = r12.wx0()
            boolean r12 = r12.mo91343y()
            if (r12 != 0) goto L_0x0153
            r10.add(r11)
            goto L_0x012f
        L_0x0153:
            int r12 = r1.f208173T
            if (r12 != r9) goto L_0x015e
            int r12 = r11.field_support_lqt_turn_in
            if (r12 != r9) goto L_0x015e
            r10.add(r11)
        L_0x015e:
            int r12 = r1.f208173T
            if (r12 != r6) goto L_0x012f
            int r12 = r11.field_support_lqt_turn_out
            if (r12 != r9) goto L_0x012f
            r10.add(r11)
            goto L_0x012f
        L_0x016a:
            if (r32 == 0) goto L_0x01e3
            java.lang.String r2 = r1.f208185Z
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0198
            r2 = 0
        L_0x0175:
            int r11 = r10.size()
            if (r2 >= r11) goto L_0x0198
            java.lang.Object r11 = r10.get(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r11
            java.lang.String r12 = r11.field_bindSerial
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0195
            java.lang.String r12 = r1.f208185Z
            java.lang.String r13 = r11.field_bindSerial
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0195
            r1.f208177V = r11
        L_0x0195:
            int r2 = r2 + 1
            goto L_0x0175
        L_0x0198:
            java.lang.String r2 = r1.f208185Z
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01a4
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r1.f208177V
            if (r2 != 0) goto L_0x020f
        L_0x01a4:
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r2 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            int r11 = r1.f208173T
            if (r11 != r9) goto L_0x01ac
            r11 = 1
            goto L_0x01ad
        L_0x01ac:
            r11 = 0
        L_0x01ad:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r2.mo98819b(r11)
            r1.f208177V = r2
            java.lang.String r2 = r1.f208181X
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x020f
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r1.f208177V
            if (r2 != 0) goto L_0x020f
            r2 = 0
        L_0x01c0:
            int r11 = r10.size()
            if (r2 >= r11) goto L_0x020f
            java.lang.Object r11 = r10.get(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r11
            java.lang.String r12 = r11.field_bindSerial
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x01e0
            java.lang.String r12 = r1.f208181X
            java.lang.String r13 = r11.field_bindSerial
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x01e0
            r1.f208177V = r11
        L_0x01e0:
            int r2 = r2 + 1
            goto L_0x01c0
        L_0x01e3:
            java.lang.String r2 = r1.f208181X
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x020f
            r2 = 0
        L_0x01ec:
            int r11 = r10.size()
            if (r2 >= r11) goto L_0x020f
            java.lang.Object r11 = r10.get(r2)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r11
            java.lang.String r12 = r11.field_bindSerial
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x020c
            java.lang.String r12 = r1.f208181X
            java.lang.String r13 = r11.field_bindSerial
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x020c
            r1.f208177V = r11
        L_0x020c:
            int r2 = r2 + 1
            goto L_0x01ec
        L_0x020f:
            r2 = 3
            java.lang.Object[] r10 = new java.lang.Object[r2]
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = r1.f208177V
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x021b
            java.lang.String r11 = r11.field_bindSerial
            goto L_0x021c
        L_0x021b:
            r11 = r12
        L_0x021c:
            r10[r7] = r11
            java.lang.String r11 = r1.f208181X
            r10[r9] = r11
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r32)
            r10[r6] = r11
            java.lang.String r11 = "MicroMsg.WalletLqtSaveFetchUI"
            java.lang.String r13 = "defaultBankcard: %s, save mCurrentSerial: %s, useDefault: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r10)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r1.f208177V
            if (r10 != 0) goto L_0x0242
            y43.b0 r10 = y43.C79029b0.vx0()
            b63.s0 r10 = r10.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r10.f192955h
            r1.f208177V = r10
            if (r10 != 0) goto L_0x0242
            return
        L_0x0242:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r1.f208177V
            boolean r10 = r10.mo99388n2()
            if (r10 == 0) goto L_0x0254
            android.widget.TextView r10 = r1.f208205n
            com.tencent.mm.plugin.wallet_core.model.Bankcard r13 = r1.f208177V
            java.lang.String r13 = r13.field_desc
            r10.setText(r13)
            goto L_0x026c
        L_0x0254:
            android.widget.TextView r10 = r1.f208205n
            r13 = 2131838837(0x7f114775, float:1.9310909E38)
            java.lang.Object[] r14 = new java.lang.Object[r6]
            com.tencent.mm.plugin.wallet_core.model.Bankcard r15 = r1.f208177V
            java.lang.String r5 = r15.field_bankName
            r14[r7] = r5
            java.lang.String r5 = r15.field_bankcardTail
            r14[r9] = r5
            java.lang.String r5 = r1.getString(r13, r14)
            r10.setText(r5)
        L_0x026c:
            android.widget.TextView r5 = r1.f208205n
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r1.f208177V
            java.lang.String r10 = r10.field_desc
            r5.setText(r10)
            android.widget.TextView r5 = r1.f208205n
            r5.setVisibility(r7)
            android.widget.ImageView r5 = r1.f208207p
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = r1.f208177V
            java.lang.String r10 = r10.field_bindSerial
            r5.setTag(r10)
            android.widget.ImageView r5 = r1.f208207p
            r10 = 0
            if (r5 == 0) goto L_0x02eb
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r1.f208177V
            java.lang.String r13 = r5.field_bankcardType
            boolean r5 = r5.mo99394u2()
            b63.e r5 = e63.C75556b.m90593c(r1, r13, r5)
            if (r5 == 0) goto L_0x0299
            java.lang.String r5 = r5.f192875a
            goto L_0x029a
        L_0x0299:
            r5 = r12
        L_0x029a:
            android.widget.ImageView r13 = r1.f208207p
            r13.setImageBitmap(r10)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r13 = r1.f208177V
            boolean r13 = r13.mo99388n2()
            if (r13 == 0) goto L_0x02b0
            android.widget.ImageView r0 = r1.f208207p
            r5 = 2131235559(0x7f0812e7, float:1.8087315E38)
            r0.setImageResource(r5)
            goto L_0x02eb
        L_0x02b0:
            di3.d r13 = di3.C86312j.m106911c(r0)
            xs.b r13 = (p755xs.C102720b) r13
            g63.j r14 = new g63.j
            r14.<init>(r5)
            android.graphics.Bitmap r5 = r13.mo142104N6(r14)
            di3.d r0 = di3.C86312j.m106911c(r0)
            xs.b r0 = (p755xs.C102720b) r0
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b r13 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b
            r13.<init>(r1)
            r0.Lu0(r13)
            if (r5 == 0) goto L_0x02eb
            android.content.res.Resources r0 = r31.getResources()
            r13 = 2131167400(0x7f0708a8, float:1.7949073E38)
            int r0 = r0.getDimensionPixelOffset(r13)
            android.content.res.Resources r14 = r31.getResources()
            int r13 = r14.getDimensionPixelOffset(r13)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r5, r0, r13, r9, r7)
            android.widget.ImageView r5 = r1.f208207p
            r5.setImageBitmap(r0)
        L_0x02eb:
            android.widget.LinearLayout r0 = r1.f208155D
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r1.f208215w
            r0.setVisibility(r3)
            int r0 = r1.f208173T
            r5 = 128(0x80, float:1.794E-43)
            if (r0 != r6) goto L_0x0335
            com.tencent.mm.plugin.wallet.balance.model.lqt.n0 r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0.m84120b()
            te3.y53 r0 = r0.mo98815a()
            if (r0 == 0) goto L_0x0412
            com.tencent.mm.plugin.wallet_core.model.Bankcard r11 = r1.f208177V
            boolean r11 = r11.mo99388n2()
            if (r11 != 0) goto L_0x0412
            java.lang.String r11 = r0.f228565u
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x0412
            android.widget.LinearLayout r11 = r1.f208155D
            r11.setVisibility(r7)
            android.widget.TextView r11 = r1.f208214v
            java.lang.String r0 = r0.f228565u
            r11.setText(r0)
            android.widget.TextView r0 = r1.f208214v
            r0.setVisibility(r7)
            android.view.View r0 = r1.findViewById(r8)
            if (r0 == 0) goto L_0x0412
            android.view.View r0 = r1.findViewById(r8)
            r0.sendAccessibilityEvent(r5)
            goto L_0x0412
        L_0x0335:
            if (r0 != r9) goto L_0x0412
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f208177V
            boolean r0 = r0.mo99388n2()
            if (r0 != 0) goto L_0x0369
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f208177V
            java.lang.String r0 = r0.field_avail_save_wording
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0369
            android.widget.LinearLayout r0 = r1.f208155D
            r0.setVisibility(r7)
            android.widget.TextView r0 = r1.f208214v
            com.tencent.mm.plugin.wallet_core.model.Bankcard r13 = r1.f208177V
            java.lang.String r13 = r13.field_avail_save_wording
            r0.setText(r13)
            android.widget.TextView r0 = r1.f208214v
            r0.setVisibility(r7)
            android.view.View r0 = r1.findViewById(r8)
            if (r0 == 0) goto L_0x0369
            android.view.View r0 = r1.findViewById(r8)
            r0.sendAccessibilityEvent(r5)
        L_0x0369:
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            int r5 = r1.f208173T
            if (r5 != r9) goto L_0x0371
            r5 = 1
            goto L_0x0372
        L_0x0371:
            r5 = 0
        L_0x0372:
            r0.mo98818a(r5)
            if (r5 == 0) goto L_0x037a
            te3.xr2 r0 = r0.f207662a
            goto L_0x037c
        L_0x037a:
            te3.xr2 r0 = r0.f207663b
        L_0x037c:
            if (r0 != 0) goto L_0x0380
            goto L_0x0412
        L_0x0380:
            te3.wy r0 = r0.f228545q
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r1.f208177V
            if (r5 == 0) goto L_0x0412
            boolean r5 = r5.mo99388n2()
            if (r5 == 0) goto L_0x0412
            if (r0 == 0) goto L_0x0412
            com.tencent.mm.plugin.wallet.balance.model.lqt.m1 r5 = r1.f208195g
            com.tencent.mm.plugin.wallet.balance.model.lqt.m1$b r5 = r5.f207646e
            r5.mo67530b(r7, r9)
            r1.f208158G = r9
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 17084(0x42bc, float:2.394E-41)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            r14 = 25
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r7] = r14
            r5.mo160131h(r8, r13)
            java.lang.String r5 = r0.f144345d
            java.lang.String r8 = r0.f144346e
            java.lang.Object[] r13 = new java.lang.Object[r6]
            r13[r7] = r5
            r13[r9] = r8
            java.lang.String r14 = "tryShowSaveFromLqBubble, promptText: %s, jumpText: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r13)
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            r11 = r11 ^ r9
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            r13 = r13 ^ r9
            android.widget.LinearLayout r14 = r1.f208215w
            r15 = 2131311550(0x7f093bbe, float:1.8241443E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.widget.LinearLayout r15 = r1.f208215w
            r10 = 2131311548(0x7f093bbc, float:1.824144E38)
            android.view.View r10 = r15.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r15 = 4
            r14.setVisibility(r15)
            r10.setVisibility(r15)
            if (r11 != 0) goto L_0x03e3
            if (r13 == 0) goto L_0x03e8
        L_0x03e3:
            android.widget.LinearLayout r15 = r1.f208215w
            r15.setVisibility(r7)
        L_0x03e8:
            if (r11 == 0) goto L_0x03f0
            r14.setVisibility(r7)
            r14.setText(r5)
        L_0x03f0:
            if (r13 == 0) goto L_0x0412
            r10.setVisibility(r7)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.s1 r5 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.s1
            r5.<init>(r1, r0)
            r19 = 0
            int r20 = r8.length()
            com.tencent.mm.wallet_core.ui.q r0 = new com.tencent.mm.wallet_core.ui.q
            r0.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r5, (boolean) r9)
            androidx.appcompat.app.AppCompatActivity r22 = r31.getContext()
            r17 = r10
            r18 = r8
            r21 = r0
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r17, r18, r19, r20, r21, r22)
        L_0x0412:
            int r0 = r1.f208173T
            r10 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r0 != r9) goto L_0x0849
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            te3.u53 r0 = r31.mo98978Q7()
            java.util.LinkedList<te3.l50> r4 = r0.f228296u
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r4 == 0) goto L_0x0465
            int r13 = r4.size()
            if (r13 <= 0) goto L_0x0465
            java.util.Iterator r4 = r4.iterator()
        L_0x0435:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0465
            java.lang.Object r13 = r4.next()
            te3.l50 r13 = (te3.C64514l50) r13
            java.lang.String r14 = r13.f184038d
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0435
            java.lang.String r14 = r13.f184040f
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x0435
            java.lang.Object[] r14 = new java.lang.Object[r6]
            java.lang.String r15 = r13.f184038d
            r14[r7] = r15
            java.lang.String r13 = r13.f184040f
            r14[r9] = r13
            java.lang.String r13 = "%s||%s"
            java.lang.String r13 = java.lang.String.format(r13, r14)
            r11.add(r13)
            goto L_0x0435
        L_0x0465:
            boolean r4 = r0.f228294s
            boolean r0 = r0.f228295t
            int r13 = r11.size()
            r14 = 17
            if (r13 <= 0) goto L_0x04dd
            if (r4 == 0) goto L_0x04dd
            android.view.ViewGroup r4 = r1.f208211s
            r4.setVisibility(r7)
            android.widget.CheckBox r4 = r1.f208213u
            r4.setChecked(r0)
            android.view.ViewGroup r0 = r1.f208211s
            com.tencent.mm.plugin.wallet.balance.ui.lqt.v1 r4 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.v1
            r4.<init>(r1)
            r0.setOnClickListener(r4)
            android.widget.CheckBox r0 = r1.f208213u
            com.tencent.mm.plugin.wallet.balance.ui.lqt.w1 r4 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.w1
            r4.<init>(r1)
            r0.setOnCheckedChangeListener(r4)
            r0 = 2131839303(0x7f114947, float:1.9311854E38)
            java.lang.String r0 = r1.getString(r0)
            int r4 = r0.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            r0 = 2131839304(0x7f114948, float:1.9311856E38)
            java.lang.String r0 = r1.getString(r0)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.text.SpannableString r13 = new android.text.SpannableString
            r13.<init>(r0)
            com.tencent.mm.wallet_core.ui.q r0 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.wallet.balance.ui.lqt.x1 r15 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.x1
            r15.<init>(r1, r11)
            r0.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r15, (boolean) r9)
            int r11 = r13.length()
            r13.setSpan(r0, r4, r11, r14)
            android.widget.TextView r0 = r1.f208212t
            r0.setText(r13)
            android.widget.TextView r0 = r1.f208212t
            r0.setClickable(r9)
            android.widget.TextView r0 = r1.f208212t
            de3.a0 r4 = new de3.a0
            r4.<init>()
            r0.setOnTouchListener(r4)
            goto L_0x04e2
        L_0x04dd:
            android.view.ViewGroup r0 = r1.f208211s
            r0.setVisibility(r3)
        L_0x04e2:
            te3.u53 r0 = r31.mo98978Q7()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r1.f208183Y
            if (r4 != 0) goto L_0x04ec
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r1.f208177V
        L_0x04ec:
            java.util.LinkedList<te3.hg2> r11 = r0.f228300y
            int r11 = r11.size()
            if (r11 == 0) goto L_0x0831
            if (r4 != 0) goto L_0x04f8
            goto L_0x0831
        L_0x04f8:
            java.util.LinkedList<te3.hg2> r0 = r0.f228300y
            java.util.Iterator r0 = r0.iterator()
            r11 = 0
        L_0x04ff:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x0517
            java.lang.Object r13 = r0.next()
            te3.hg2 r13 = (te3.C49702hg2) r13
            java.lang.String r15 = r13.f134613d
            java.lang.String r8 = r4.field_bankcardType
            boolean r8 = r15.equals(r8)
            if (r8 == 0) goto L_0x04ff
            r11 = r13
            goto L_0x04ff
        L_0x0517:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout r4 = r1.f208167Q
            te3.hg2 r0 = r4.f207901G
            if (r0 == 0) goto L_0x0520
            java.lang.String r0 = r0.f134613d
            goto L_0x0521
        L_0x0520:
            r0 = 0
        L_0x0521:
            java.lang.String r8 = "<null>"
            if (r0 != 0) goto L_0x0526
            r0 = r8
        L_0x0526:
            if (r11 == 0) goto L_0x052b
            java.lang.String r13 = r11.f134613d
            goto L_0x052c
        L_0x052b:
            r13 = 0
        L_0x052c:
            if (r13 != 0) goto L_0x052f
            goto L_0x0530
        L_0x052f:
            r8 = r13
        L_0x0530:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "update: "
            r13.append(r15)
            r13.append(r0)
            r0 = 45
            r13.append(r0)
            r13.append(r8)
            r0 = 40
            r13.append(r0)
            if (r11 == 0) goto L_0x0550
            int r0 = r11.f134614e
            goto L_0x0551
        L_0x0550:
            r0 = 0
        L_0x0551:
            r13.append(r0)
            r0 = 41
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            java.lang.String r8 = "MicroMsg.LqtSaveKeyboardToolBarLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            te3.hg2 r0 = r4.f207901G
            boolean r13 = gy3.C87412m.m108589b(r11, r0)
            if (r13 == 0) goto L_0x056b
            goto L_0x0598
        L_0x056b:
            if (r11 == 0) goto L_0x059a
            if (r0 != 0) goto L_0x0570
            goto L_0x059a
        L_0x0570:
            int r13 = r11.f134614e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            if (r13 != 0) goto L_0x0579
            goto L_0x0581
        L_0x0579:
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x0581
            r13 = 1
            goto L_0x0582
        L_0x0581:
            r13 = 0
        L_0x0582:
            if (r13 == 0) goto L_0x059a
            int r0 = r0.f134614e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L_0x058d
            goto L_0x0595
        L_0x058d:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0595
            r0 = 1
            goto L_0x0596
        L_0x0595:
            r0 = 0
        L_0x0596:
            if (r0 == 0) goto L_0x059a
        L_0x0598:
            r0 = 1
            goto L_0x059b
        L_0x059a:
            r0 = 0
        L_0x059b:
            if (r0 == 0) goto L_0x05a1
            r4.f207901G = r11
            goto L_0x0811
        L_0x05a1:
            r4.f207901G = r11
            r4.removeAllViews()
            r4.setPadding(r7, r7, r7, r7)
            te3.hg2 r0 = r4.f207901G
            if (r0 != 0) goto L_0x05af
            goto L_0x0810
        L_0x05af:
            int r11 = r0.f134614e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r11 != 0) goto L_0x05b8
            goto L_0x05c0
        L_0x05b8:
            int r11 = r11.intValue()
            if (r11 != r9) goto L_0x05c0
            r11 = 1
            goto L_0x05c1
        L_0x05c0:
            r11 = 0
        L_0x05c1:
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r15 = "context"
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x065c
            java.lang.String r11 = r0.f134615f
            if (r11 == 0) goto L_0x05e0
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x05db
            r11 = 1
            goto L_0x05dc
        L_0x05db:
            r11 = 0
        L_0x05dc:
            if (r11 != r9) goto L_0x05e0
            r11 = 1
            goto L_0x05e1
        L_0x05e0:
            r11 = 0
        L_0x05e1:
            if (r11 == 0) goto L_0x065c
            r4.setColumnCount(r9)
            r4.setRowCount(r9)
            android.content.Context r8 = r4.getContext()
            gy3.C87412m.m108593f(r8, r15)
            android.content.res.Resources r8 = r8.getResources()
            float r5 = r8.getDimension(r5)
            int r5 = (int) r5
            android.content.Context r8 = r4.getContext()
            gy3.C87412m.m108593f(r8, r15)
            android.content.res.Resources r8 = r8.getResources()
            float r3 = r8.getDimension(r3)
            int r3 = (int) r3
            r4.setPadding(r7, r5, r7, r3)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r5 = r4.getContext()
            r3.<init>(r5)
            java.lang.String r0 = r0.f134615f
            r3.setText(r0)
            android.content.Context r0 = r3.getContext()
            float r0 = kg3.C76577a.m92165p(r0)
            r5 = 1096810496(0x41600000, float:14.0)
            float r0 = r0 * r5
            r3.setTextSize(r9, r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r9)
            r3.setTypeface(r0)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r10)
            r3.setTextColor(r0)
            r3.setGravity(r14)
            r3.setMaxLines(r6)
            androidx.gridlayout.widget.GridLayout$LayoutParams r0 = new androidx.gridlayout.widget.GridLayout$LayoutParams
            androidx.gridlayout.widget.GridLayout$h r5 = androidx.gridlayout.widget.GridLayout.f44587F
            androidx.gridlayout.widget.GridLayout$p r8 = androidx.gridlayout.widget.GridLayout.m15668l(r2, r9, r5, r13)
            androidx.gridlayout.widget.GridLayout$p r2 = androidx.gridlayout.widget.GridLayout.m15668l(r2, r9, r5, r13)
            r0.<init>((androidx.gridlayout.widget.GridLayout.C16595p) r8, (androidx.gridlayout.widget.GridLayout.C16595p) r2)
            r3.setLayoutParams(r0)
            r4.addView(r3)
            goto L_0x0810
        L_0x065c:
            int r11 = r0.f134614e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            if (r11 != 0) goto L_0x0665
            goto L_0x066d
        L_0x0665:
            int r11 = r11.intValue()
            if (r11 != r6) goto L_0x066d
            r11 = 1
            goto L_0x066e
        L_0x066d:
            r11 = 0
        L_0x066e:
            if (r11 == 0) goto L_0x0810
            java.util.LinkedList<te3.do3> r11 = r0.f134616g
            if (r11 == 0) goto L_0x067d
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r9
            if (r11 != r9) goto L_0x067d
            r11 = 1
            goto L_0x067e
        L_0x067d:
            r11 = 0
        L_0x067e:
            if (r11 == 0) goto L_0x0810
            r11 = 3
            r4.setColumnCount(r11)
            java.util.LinkedList<te3.do3> r11 = r0.f134616g
            int r11 = r11.size()
            int r16 = r4.getColumnCount()
            int r11 = r11 + r16
            int r11 = r11 - r9
            int r16 = r4.getColumnCount()
            int r11 = r11 / r16
            r4.setRowCount(r11)
            java.util.LinkedList<te3.do3> r0 = r0.f134616g
            java.lang.String r11 = "hint.recomm_list"
            gy3.C87412m.m108593f(r0, r11)
            r11 = 3
            java.util.List r0 = sx3.C110818d0.m150947s0(r0, r11)
            java.util.Iterator r11 = r0.iterator()
            r0 = 0
        L_0x06ab:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x0810
            java.lang.Object r16 = r11.next()
            int r20 = r0 + 1
            if (r0 < 0) goto L_0x080b
            r10 = r16
            te3.do3 r10 = (te3.C49175do3) r10
            java.lang.String r5 = "it"
            gy3.C87412m.m108593f(r10, r5)
            if (r0 == r6) goto L_0x06c6
            r5 = 1
            goto L_0x06c7
        L_0x06c6:
            r5 = 0
        L_0x06c7:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            android.content.Context r0 = r4.getContext()
            r6.<init>(r0)
            r6.setOrientation(r7)
            r6.setGravity(r14)
            androidx.gridlayout.widget.GridLayout$LayoutParams r0 = new androidx.gridlayout.widget.GridLayout$LayoutParams
            androidx.gridlayout.widget.GridLayout$h r14 = androidx.gridlayout.widget.GridLayout.f44587F
            androidx.gridlayout.widget.GridLayout$p r7 = androidx.gridlayout.widget.GridLayout.m15668l(r2, r9, r14, r13)
            androidx.gridlayout.widget.GridLayout$p r14 = androidx.gridlayout.widget.GridLayout.m15668l(r2, r9, r14, r13)
            r0.<init>((androidx.gridlayout.widget.GridLayout.C16595p) r7, (androidx.gridlayout.widget.GridLayout.C16595p) r14)
            r6.setLayoutParams(r0)
            android.content.Context r0 = r6.getContext()
            gy3.C87412m.m108593f(r0, r15)
            android.content.res.Resources r0 = r0.getResources()
            float r0 = r0.getDimension(r3)
            int r0 = (int) r0
            r7 = 0
            r6.setPadding(r7, r0, r7, r7)
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r0 = r4.getContext()
            r7.<init>(r0)
            java.lang.String r0 = r10.f132458e
            r7.setText(r0)
            r14 = 17
            r7.setGravity(r14)
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131233761(0x7f080be1, float:1.8083669E38)
            r3 = 0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2, r3)
            r7.setBackground(r0)
            android.content.Context r0 = r7.getContext()
            gy3.C87412m.m108593f(r0, r15)
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131165324(0x7f07008c, float:1.7944862E38)
            float r0 = r0.getDimension(r2)
            int r0 = (int) r0
            android.content.Context r3 = r7.getContext()
            gy3.C87412m.m108593f(r3, r15)
            android.content.res.Resources r3 = r3.getResources()
            float r3 = r3.getDimension(r2)
            int r3 = (int) r3
            r2 = 0
            r7.setPadding(r2, r0, r2, r3)
            android.content.Context r0 = r7.getContext()
            float r0 = kg3.C76577a.m92165p(r0)
            r2 = 1099431936(0x41880000, float:17.0)
            float r0 = r0 * r2
            r7.setTextSize(r9, r0)
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r2)
            r7.setTextColor(r0)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.e r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.e
            r0.<init>(r4, r10)
            r7.setOnClickListener(r0)
            r0 = 7
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90273v(r0)     // Catch:{ Exception -> 0x0787 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0787 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x0787 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r0)     // Catch:{ Exception -> 0x0787 }
            r7.setTypeface(r0)     // Catch:{ Exception -> 0x0787 }
            goto L_0x07b0
        L_0x0787:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "setTypeface() Exception:"
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
        L_0x07b0:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            r6.addView(r7, r0)
            if (r5 == 0) goto L_0x07f7
            android.view.View r0 = new android.view.View
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099808(0x7f0600a0, float:1.781198E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setBackground(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            android.content.Context r3 = r6.getContext()
            gy3.C87412m.m108593f(r3, r15)
            int r3 = zp3.C79406f.m96347a(r3, r13)
            android.content.Context r5 = r6.getContext()
            gy3.C87412m.m108593f(r5, r15)
            r7 = 1099956224(0x41900000, float:18.0)
            int r5 = zp3.C79406f.m96347a(r5, r7)
            r2.<init>(r3, r5)
            r6.addView(r0, r2)
        L_0x07f7:
            r4.addView(r6)
            r0 = r20
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r5 = 2131165324(0x7f07008c, float:1.7944862E38)
            r6 = 2
            r7 = 0
            r10 = 2131099804(0x7f06009c, float:1.7811972E38)
            goto L_0x06ab
        L_0x080b:
            sx3.C64197v.m75542k()
            r2 = 0
            throw r2
        L_0x0810:
            r7 = 1
        L_0x0811:
            if (r7 == 0) goto L_0x0968
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = r1.mWcKeyboard
            android.widget.LinearLayout r2 = r0.f220914u
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x0820
            goto L_0x0828
        L_0x0820:
            android.widget.LinearLayout r2 = r0.f220914u
            r2.setVisibility(r3)
            r0.mo104750n()
        L_0x0828:
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = r1.mWcKeyboard
            com.tencent.mm.plugin.wallet.balance.ui.lqt.LqtSaveKeyboardToolBarLayout r2 = r1.f208167Q
            r0.setToolBarContent(r2)
            goto L_0x0968
        L_0x0831:
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = r1.mWcKeyboard
            android.widget.LinearLayout r2 = r0.f220914u
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 != r3) goto L_0x083f
            goto L_0x0968
        L_0x083f:
            android.widget.LinearLayout r2 = r0.f220914u
            r2.setVisibility(r3)
            r0.mo104750n()
            goto L_0x0968
        L_0x0849:
            r2 = 2
            if (r0 != r2) goto L_0x0968
            r0 = 2131316741(0x7f095005, float:1.8251972E38)
            android.view.View r0 = r1.findViewById(r0)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r4)
            java.lang.Object[] r24 = r2.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI"
            java.lang.String r26 = "updateView"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r0
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r24 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI"
            java.lang.String r25 = "updateView"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            android.widget.LinearLayout r0 = r1.f208163L
            r2 = 8
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r1.f208211s
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.f208210r
            r0.setVisibility(r2)
            com.tencent.mm.plugin.wallet.balance.model.lqt.n0 r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0.m84120b()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r1.f208177V
            java.lang.String r3 = "100"
            if (r2 == 0) goto L_0x0922
            boolean r2 = r2.mo99388n2()
            if (r2 == 0) goto L_0x0922
            android.content.Intent r0 = r31.getIntent()
            java.lang.String r2 = "lqt_balance"
            r4 = 0
            int r0 = r0.getIntExtra(r2, r4)
            boolean r2 = sf0.C90188n0.f258933a
            if (r0 <= 0) goto L_0x0968
            r2 = 2131839252(0x7f114914, float:1.931175E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            r6 = 2
            double r7 = r1.mo98975N7(r5, r3, r6)
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r5 = 0
            r4[r5] = r3
            java.lang.String r2 = r1.getString(r2, r4)
            int r3 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            r2 = 2131839255(0x7f114917, float:1.9311756E38)
            java.lang.String r2 = r1.getString(r2)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r2)
            com.tencent.mm.wallet_core.ui.q r2 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.wallet.balance.ui.lqt.r1 r5 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.r1
            r5.<init>(r1, r0)
            r2.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r5, (boolean) r9)
            int r0 = r4.length()
            r5 = 18
            r4.setSpan(r2, r3, r0, r5)
            r1.f208169R = r4
            r1.mo98982U7(r4)
            goto L_0x0968
        L_0x0922:
            te3.y53 r2 = r0.mo98815a()
            if (r2 != 0) goto L_0x092a
            r2 = 0
            goto L_0x0930
        L_0x092a:
            te3.y53 r2 = r0.mo98815a()
            int r2 = r2.f228553f
        L_0x0930:
            te3.y53 r4 = r0.mo98815a()
            if (r4 != 0) goto L_0x0937
            goto L_0x093d
        L_0x0937:
            te3.y53 r0 = r0.mo98815a()
            int r0 = r0.f228555h
        L_0x093d:
            boolean r0 = sf0.C90188n0.f258933a
            r0 = 2131839223(0x7f1148f7, float:1.9311691E38)
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r12)
            java.lang.String r2 = r5.toString()
            r5 = 2
            double r2 = r1.mo98975N7(r2, r3, r5)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r3 = 0
            r4[r3] = r2
            java.lang.String r0 = r1.getString(r0, r4)
            r1.f208169R = r0
            r1.mo98982U7(r0)
        L_0x0968:
            int r0 = r1.f208173T
            if (r0 != r9) goto L_0x0a1d
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f208177V
            if (r0 == 0) goto L_0x0a13
            boolean r0 = r0.mo99388n2()
            if (r0 == 0) goto L_0x0a13
            java.lang.CharSequence r0 = r1.f208169R
            r1.mo98982U7(r0)
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            r0.mo98818a(r9)
            te3.xr2 r0 = r0.f207662a
            if (r0 != 0) goto L_0x0986
            goto L_0x0a1d
        L_0x0986:
            te3.ug4 r2 = r0.f228544p
            if (r2 == 0) goto L_0x09fe
            java.lang.String r2 = r2.f185737d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x09fe
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            te3.ug4 r3 = r0.f228544p
            java.lang.String r3 = r3.f185737d
            r2.<init>(r3)
            te3.ug4 r3 = r0.f228544p
            java.lang.String r3 = r3.f185738e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x09d2
            te3.ug4 r3 = r0.f228544p
            java.lang.String r3 = r3.f185739f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x09d2
            te3.ug4 r3 = r0.f228544p
            java.lang.String r3 = r3.f185738e
            r2.append(r3)
            com.tencent.mm.plugin.wallet_core.ui.y0 r3 = new com.tencent.mm.plugin.wallet_core.ui.y0
            com.tencent.mm.plugin.wallet.balance.ui.lqt.t1 r4 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.t1
            r4.<init>(r1, r0)
            r5 = 2
            r3.<init>((int) r5, (com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0.C72477a) r4)
            te3.ug4 r0 = r0.f228544p
            java.lang.String r0 = r0.f185737d
            int r0 = r0.length()
            int r4 = r2.length()
            r5 = 18
            r2.setSpan(r3, r0, r4, r5)
        L_0x09d2:
            android.widget.TextView r0 = r1.f208206o
            r0.setText(r2)
            android.widget.TextView r0 = r1.f208206o
            r0.setClickable(r9)
            android.widget.TextView r0 = r1.f208206o
            de3.a0 r2 = new de3.a0
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            r2.<init>(r3)
            r0.setOnTouchListener(r2)
            android.widget.TextView r0 = r1.f208206o
            r2 = 0
            r0.setVisibility(r2)
            android.content.res.Resources r0 = r31.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r2)
            r1.f208178V0 = r0
            goto L_0x0a1d
        L_0x09fe:
            android.widget.TextView r0 = r1.f208206o
            r2 = 8
            r0.setVisibility(r2)
            android.content.res.Resources r0 = r31.getResources()
            r2 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r0 = r0.getColor(r2)
            r1.f208178V0 = r0
            goto L_0x0a1d
        L_0x0a13:
            r2 = 8
            r1.mo98982U7(r12)
            android.widget.TextView r0 = r1.f208206o
            r0.setVisibility(r2)
        L_0x0a1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI.mo98979R7(boolean):void");
    }

    /* renamed from: S7 */
    public final int mo98980S7(String str, String str2) {
        try {
            double d = Util.getDouble(str, 0.0d);
            double d2 = Util.getDouble(str2, 0.0d);
            if (d == 0.0d) {
                str = "0";
            }
            BigDecimal bigDecimal = new BigDecimal(str);
            if (d2 == 0.0d) {
                str2 = "0";
            }
            return bigDecimal.multiply(new BigDecimal(str2)).intValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: T7 */
    public void mo98981T7() {
        MMHandlerThread.removeRunnable(this.f208202j1);
        MMHandlerThread.removeRunnable(this.f208203k1);
    }

    /* renamed from: U7 */
    public final void mo98982U7(CharSequence charSequence) {
        this.f208209q.setText(charSequence);
        if (Util.isNullOrNil(charSequence)) {
            this.f208209q.setVisibility(8);
        } else {
            this.f208209q.setVisibility(0);
        }
    }

    /* renamed from: V7 */
    public final void mo98983V7(String str, String str2, String str3, TextView textView, C7092q.C7093a aVar) {
        TextView textView2 = textView;
        if (str != null) {
            StringBuilder sb = new StringBuilder(str);
            if (Util.isNullOrNil(str2)) {
                textView2.setText(sb.toString());
                return;
            }
            int length = sb.length();
            sb.append(str2);
            textView2.setText(sb.toString());
            C75228t.m90253j0(textView, sb.toString(), length, sb.length(), new C7092q((C7092q.C7093a) new WalletLqtSaveFetchUI$$y(this, str, str2, str3, aVar), true), this);
        }
    }

    /* renamed from: W7 */
    public final void mo98984W7(String str, int i) {
        String str2 = str;
        int i2 = i;
        this.f208194f1.clear();
        C76492a aVar = new C76492a(this);
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false);
        C71654w wVar = C71654w.f207659q;
        int i3 = this.f208173T;
        wVar.getClass();
        List<Bankcard> c = wVar.mo98820c(i3 == 1);
        if (c == null || c.size() == 0) {
            c = C79029b0.vx0().wx0().mo91332n(true);
        }
        LinkedList linkedList = new LinkedList();
        for (Bankcard bankcard : c) {
            if (!bankcard.mo99388n2() || C79029b0.vx0().wx0().mo91343y()) {
                if (i3 == 1 && (bankcard.field_support_lqt_turn_in == 1 || bankcard.mo99388n2())) {
                    linkedList.add(bankcard);
                }
                if (i3 == 2 && (bankcard.field_support_lqt_turn_out == 1 || bankcard.mo99388n2())) {
                    linkedList.add(bankcard);
                }
            } else {
                linkedList.add(bankcard);
            }
        }
        this.f208219y0 = linkedList;
        C71654w wVar2 = C71654w.f207659q;
        boolean z = this.f208173T == 1;
        wVar2.mo98818a(z);
        C78015xr2 xr22 = z ? wVar2.f207662a : wVar2.f207663b;
        Bankcard bankcard2 = this.f208177V;
        String str3 = bankcard2 != null ? bankcard2.field_bindSerial : null;
        if (Util.isNullOrNil(str3)) {
            str3 = this.f208181X;
            if (Util.isNullOrNil(str3)) {
                C86709a0.m107528h();
                str3 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LQT_DEFAULTCARD_STRING_SYNC, "");
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= ((LinkedList) this.f208219y0).size()) {
                i4 = 0;
                break;
            }
            Bankcard bankcard3 = (Bankcard) ((LinkedList) this.f208219y0).get(i4);
            if (!Util.isNullOrNil(bankcard3.field_bindSerial) && str3.equals(bankcard3.field_bindSerial)) {
                break;
            }
            i4++;
        }
        aVar.f223923c = new WalletLqtSaveFetchUI$$c(this, aVar);
        if (wf) {
            aVar.f223924d = new WalletLqtSaveFetchUI$$d(this, aVar, i2, str2);
        } else {
            aVar.f223921a.f296375F = new WalletLqtSaveFetchUI$$e(this, aVar, i2, str2);
        }
        View inflate = View.inflate(this, C0966R.C0971layout.b98, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gbk);
        TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gbj);
        if (xr22 != null && !TextUtils.isEmpty(xr22.f228546r)) {
            textView.setText(xr22.f228546r);
            if (!TextUtils.isEmpty(xr22.f228547s)) {
                textView2.setText(xr22.f228547s);
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        } else if (this.f208173T == 1) {
            textView.setText(C0966R.string.kyp);
            textView2.setText(C0966R.string.kyo);
        } else {
            textView.setText(C0966R.string.kwp);
            textView2.setText(C0966R.string.kwo);
        }
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        View findViewById = inflate.findViewById(C0966R.C0970id.c4p);
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "showBankCardDialog", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "showBankCardDialog", "(Ljava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.findViewById(C0966R.C0970id.gal).setOnClickListener(new WalletLqtSaveFetchUI$$f(this, aVar));
        inflate.findViewById(C0966R.C0970id.gal).setContentDescription(getString(C0966R.string.kk5));
        C71654w wVar3 = C71654w.f207659q;
        boolean z2 = this.f208173T == 1;
        wVar3.mo98818a(z2);
        C78015xr2 xr23 = z2 ? wVar3.f207662a : wVar3.f207663b;
        if (xr23 != null ? xr23.f228537f : false) {
            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "isNoSupportLqtBank");
        } else {
            C76874e0 e0Var = new C76874e0(this);
            int i5 = this.f208173T;
            if (i5 == 1) {
                e0Var.mo107156p(0, getString(C0966R.string.kyv), (CharSequence) null, getResources().getDrawable(C0966R.raw.icons_outlined_pay_cards), getResources().getColor(C0966R.color.FG_2), false);
            } else if (i5 == 2) {
                e0Var.mo107156p(0, getString(C0966R.string.f361571kx0), (CharSequence) null, getResources().getDrawable(C0966R.raw.icons_outlined_pay_cards), getResources().getColor(C0966R.color.FG_2), false);
            }
            if (wf) {
                e0Var.mo107160r(1, "", true);
            }
            WalletLqtSaveFetchUI$$g walletLqtSaveFetchUI$$g = new WalletLqtSaveFetchUI$$g(this, aVar);
            aVar.f223927g = e0Var;
            aVar.f223925e = walletLqtSaveFetchUI$$g;
        }
        if (wf) {
            aVar.f223931k = false;
        } else {
            aVar.f223931k = true;
        }
        aVar.f223921a.mo140677w(getResources().getString(C0966R.string.kse));
        aVar.f223933m = i4;
        aVar.f223932l = true;
        aVar.f223921a.mo140673s(inflate);
        aVar.f223930j = inflate;
        aVar.mo106729d();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.g9o);
        linearLayout.setFocusable(true);
        linearLayout.setContentDescription(textView.getText().toString() + textView2.getText().toString());
        MMHandlerThread.postToMainThreadDelayed(new WalletLqtSaveFetchUI$$h(this, linearLayout), 500);
    }

    /* renamed from: X7 */
    public final void mo98985X7(TextView textView, boolean z, C51892wy wyVar, C101218e0 e0Var, C71652v vVar, C71652v vVar2, int i) {
        TextView textView2 = textView;
        C51892wy wyVar2 = wyVar;
        if (wyVar2 != null) {
            String str = (!z || TextUtils.isEmpty(wyVar2.f144345d)) ? "" : wyVar2.f144345d;
            if (!TextUtils.isEmpty(wyVar2.f144346e)) {
                String str2 = str + wyVar2.f144346e;
                C75228t.m90253j0(textView, str2, str.length(), str2.length(), new C7092q((C7092q.C7093a) new WalletLqtSaveFetchUI$$u(this, i, wyVar, vVar, vVar2, e0Var), true), getContext());
                textView.setVisibility(0);
            } else if (!TextUtils.isEmpty(str)) {
                textView.setVisibility(0);
                textView.setText(str);
            }
        }
    }

    /* renamed from: Y7 */
    public final C101218e0 mo98986Y7(C71652v vVar, C71652v vVar2, C71652v vVar3) {
        C77977pf3 pf32;
        int i;
        int i2;
        int i3;
        LinearLayout linearLayout;
        int i4;
        C78008wk wkVar;
        C71652v vVar4 = vVar2;
        if (vVar4 == null || (pf32 = vVar4.f207655a) == null) {
            return null;
        }
        int i5 = (pf32.f228012f != 0 || !TextUtils.isEmpty(pf32.f228010d)) ? 3 : 0;
        C77977pf3 pf33 = vVar4.f207655a;
        int i6 = (pf33 == null || ((wkVar = pf33.f228014h) == null && pf33.f228015i == null)) ? 0 : (wkVar == null || pf33.f228015i == null) ? 2 : 1;
        C101218e0 e0Var = new C101218e0(getContext(), i6, i5);
        if (i5 == 3) {
            if (pf32.f228012f == 0) {
                LinearLayout linearLayout2 = new LinearLayout(this);
                linearLayout2.setPadding(C76577a.m92155f(this, C0966R.dimen.f3743cv), C76577a.m92155f(this, C0966R.dimen.f3753d4), C76577a.m92155f(this, C0966R.dimen.f3743cv), C76577a.m92155f(this, C0966R.dimen.f3766df));
                linearLayout2.setOrientation(1);
                if (!TextUtils.isEmpty(pf32.f228010d)) {
                    TextView textView = new TextView(this);
                    linearLayout2.addView(textView);
                    textView.setGravity(3);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams());
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    layoutParams.gravity = 3;
                    textView.setTextSize(1, 17.0f);
                    textView.setTextColor(getResources().getColor(C0966R.color.f3139gn));
                    C85875k4.m106189j0(textView.getPaint(), 0.8f);
                    textView.setText(pf32.f228010d);
                    textView.setLayoutParams(layoutParams);
                }
                i = C0966R.dimen.f3753d4;
                linearLayout = linearLayout2;
            } else {
                View inflate = View.inflate(this, C0966R.C0971layout.b98, (ViewGroup) null);
                WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.gal);
                weImageView.setContentDescription(getString(C0966R.string.bfj));
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gbk);
                C85875k4.m106189j0(textView2.getPaint(), 0.8f);
                TextView textView3 = (TextView) inflate.findViewById(C0966R.C0970id.gbj);
                if (pf32.f228012f == 2) {
                    weImageView.setImageResource(C0966R.raw.icons_outlined_back);
                    weImageView.setIconColor(getResources().getColor(C0966R.color.FG_0));
                    weImageView.setContentDescription(getString(C0966R.string.f7574k3));
                }
                WalletLqtSaveFetchUI$$t walletLqtSaveFetchUI$$t = r0;
                TextView textView4 = textView3;
                TextView textView5 = textView2;
                View view = inflate;
                i = C0966R.dimen.f3753d4;
                WalletLqtSaveFetchUI$$t walletLqtSaveFetchUI$$t2 = new WalletLqtSaveFetchUI$$t(this, e0Var, pf32, vVar, vVar2);
                weImageView.setOnClickListener(walletLqtSaveFetchUI$$t);
                if (TextUtils.isEmpty(pf32.f228010d)) {
                    textView5.setVisibility(8);
                    i4 = 0;
                } else {
                    i4 = 0;
                    textView5.setVisibility(0);
                    textView5.setText(pf32.f228010d);
                }
                if (TextUtils.isEmpty(pf32.f228011e)) {
                    textView4.setVisibility(8);
                } else {
                    textView4.setVisibility(i4);
                    textView4.setText(pf32.f228011e);
                }
                linearLayout = view;
            }
            e0Var.mo140673s(linearLayout);
        } else {
            i = C0966R.dimen.f3753d4;
        }
        C51892wy wyVar = pf32.f228013g;
        if (wyVar != null) {
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            if (!TextUtils.isEmpty(wyVar.f144345d)) {
                TextView textView6 = new TextView(this);
                linearLayout3.addView(textView6);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(textView6.getLayoutParams());
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                if (TextUtils.isEmpty(pf32.f228010d)) {
                    layoutParams2.topMargin = C76577a.m92155f(this, i);
                    i3 = C0966R.dimen.f3766df;
                } else {
                    i3 = C0966R.dimen.f3766df;
                    layoutParams2.topMargin = C76577a.m92155f(this, C0966R.dimen.f3766df);
                }
                textView6.setTextColor(getResources().getColor(C0966R.color.f3139gn));
                if (pf32.f228012f != 0 || TextUtils.isEmpty(pf32.f228010d)) {
                    textView6.setTextSize(1, 17.0f);
                    C85875k4.m106189j0(textView6.getPaint(), 0.8f);
                } else {
                    textView6.setTextSize(1, 15.0f);
                }
                textView6.setText(wyVar.f144345d);
                textView6.setLayoutParams(layoutParams2);
            } else {
                i3 = C0966R.dimen.f3766df;
            }
            if (!TextUtils.isEmpty(wyVar.f144346e)) {
                TextView textView7 = new TextView(this);
                linearLayout3.addView(textView7);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(textView7.getLayoutParams());
                layoutParams3.width = -1;
                layoutParams3.height = -2;
                layoutParams3.topMargin = C76577a.m92155f(this, i3);
                textView7.setTextSize(1, 14.0f);
                C85875k4.m106189j0(textView7.getPaint(), 0.8f);
                textView7.setLayoutParams(layoutParams3);
                textView7.setText(wyVar.f144346e);
                mo98985X7(textView7, false, wyVar, e0Var, vVar2, vVar3, vVar4.f207656b);
                textView7.setClickable(true);
                textView7.setOnTouchListener(new C75355a0(this));
            }
            e0Var.mo140663j(linearLayout3);
            if (i6 == 0) {
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(linearLayout3.getLayoutParams());
                layoutParams4.bottomMargin = C76577a.m92155f(this, C0966R.dimen.f3761db);
                linearLayout3.setLayoutParams(layoutParams4);
            }
        }
        if (i6 == 2) {
            C78008wk wkVar2 = pf32.f228014h;
            if (wkVar2 != null) {
                e0Var.mo140677w(wkVar2.f228354g);
            }
            C78008wk wkVar3 = pf32.f228015i;
            if (wkVar3 != null) {
                e0Var.mo140677w(wkVar3.f228354g);
            }
            i2 = 1;
            e0Var.mo140676v(1);
        } else {
            i2 = 1;
        }
        if (i6 == i2) {
            e0Var.mo140667n(pf32.f228014h.f228354g, pf32.f228015i.f228354g);
        }
        return e0Var;
    }

    /* renamed from: Z7 */
    public final void mo98987Z7(String str) {
        C76879j.m92711E(getContext(), !Util.isNullOrNil(str) ? str : getString(C0966R.string.kws), "", getString(C0966R.string.ktq), false, new WalletLqtSaveFetchUI$$z(this));
    }

    /* renamed from: a8 */
    public final boolean mo98988a8(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("guide_flag");
                String optString2 = jSONObject.optString("guide_wording");
                String optString3 = jSONObject.optString("left_button_wording");
                String optString4 = jSONObject.optString("right_button_wording");
                String optString5 = jSONObject.optString("upload_credit_url");
                if ("2".equals(optString)) {
                    AppCompatActivity context = getContext();
                    C77389a aVar = new C77389a();
                    aVar.f225668y = false;
                    aVar.f225660q = optString2;
                    aVar.f225664u = optString3;
                    aVar.f225663t = optString4;
                    aVar.f225620C = new WalletLqtSaveFetchUI$$a0(this, optString5);
                    aVar.f225641X = true;
                    C77398g gVar = new C77398g(context, C0966R.style.a66);
                    gVar.mo107525e(aVar);
                    gVar.show();
                    return true;
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtSaveFetchUI", e, "", new Object[0]);
            }
        }
        return false;
    }

    /* renamed from: b8 */
    public final void mo98989b8(boolean z, String str) {
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "update arrive time layout: %s", Boolean.valueOf(z));
        if (this.f208173T == 2) {
            C78016y53 a = C71647n0.m84120b().mo98815a();
            if (this.f208159H.f207907h) {
                if (z) {
                    if (this.f208177V.mo99388n2()) {
                        Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "show balance arrive time");
                        this.f208159H.mo98907a(a.f228558n, true);
                    } else {
                        LinkedList<C64705s9> linkedList = a.f228559o;
                        if (linkedList != null) {
                            Iterator<C64705s9> it = linkedList.iterator();
                            while (it.hasNext()) {
                                C64705s9 next = it.next();
                                if (next.f185386d.equals(this.f208177V.field_bindSerial)) {
                                    Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "show bankcard arrive time");
                                    this.f208159H.mo98907a(next.f185387e, true);
                                }
                            }
                        }
                    }
                }
                this.f208159H.setVisibility(4);
                this.f208159H.mo98908b(str);
            } else if (a == null) {
                Log.m105928w("MicroMsg.WalletLqtSaveFetchUI", "no cache!");
            } else {
                Bankcard bankcard = this.f208177V;
                if (bankcard == null) {
                    Log.m105928w("MicroMsg.WalletLqtSaveFetchUI", "no mDefaultBankcard!");
                    return;
                }
                if (bankcard.mo99388n2()) {
                    Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "show balance arrive time");
                    this.f208159H.mo98907a(a.f228558n, false);
                    this.f208159H.mo98908b(str);
                } else {
                    LinkedList<C64705s9> linkedList2 = a.f228559o;
                    if (linkedList2 != null) {
                        Iterator<C64705s9> it4 = linkedList2.iterator();
                        while (it4.hasNext()) {
                            C64705s9 next2 = it4.next();
                            if (next2.f185386d.equals(this.f208177V.field_bindSerial)) {
                                Log.m105918d("MicroMsg.WalletLqtSaveFetchUI", "show bankcard arrive time");
                                this.f208159H.mo98907a(next2.f185387e, false);
                                this.f208159H.mo98908b(str);
                            }
                        }
                    }
                }
                this.f208159H.setVisibility(4);
                this.f208160I.postDelayed(new C71795e2(this), 100);
            }
        }
    }

    /* renamed from: c8 */
    public final void mo98990c8(String str, boolean z) {
        boolean z2;
        String str2 = str;
        boolean z3 = z;
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "update tips: %s", str2);
        long Y = C75228t.m90232Y(str2 + "", "100");
        if (Y > 0) {
            int i = this.f208173T;
            if (i == 1) {
                Bankcard bankcard = this.f208177V;
                if (bankcard == null) {
                    this.f208217x0 = true;
                    mo98972K7(true);
                } else if (bankcard.mo99388n2()) {
                    if (this.f208171S != null) {
                        if (Y > ((long) mo98980S7(this.f208171S.f209415j2 + "", "100"))) {
                            mo98982U7(getString(C0966R.string.kyr));
                            this.f208209q.setTextColor(getResources().getColor(C0966R.color.Red_100));
                            this.f208209q.announceForAccessibility(getContext().getString(C0966R.string.kyr));
                            this.f208217x0 = false;
                            mo98972K7(false);
                            return;
                        }
                    }
                    C71654w wVar = C71654w.f207659q;
                    int i2 = wVar.f207672k;
                    if (i2 < 0 || Y <= ((long) i2) || Util.isNullOrNil(wVar.f207669h) || Util.isNullOrNil(wVar.f207670i) || Util.isNullOrNil(wVar.f207671j)) {
                        mo98982U7(this.f208169R);
                        this.f208209q.setTextColor(this.f208178V0);
                        this.f208217x0 = true;
                        mo98972K7(true);
                        return;
                    }
                    C72476y0 y0Var = new C72476y0(2, (C72476y0.C72477a) new WalletLqtSaveFetchUI$$r(this));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(wVar.f207669h);
                    spannableStringBuilder.append(wVar.f207670i);
                    spannableStringBuilder.setSpan(y0Var, wVar.f207669h.length(), spannableStringBuilder.length(), 18);
                    if (this.f208209q.getText() == null || !this.f208209q.getText().equals(spannableStringBuilder.toString())) {
                        C115669n.INSTANCE.mo160131h(17084, 9);
                    }
                    this.f208209q.setOnTouchListener(new C75355a0(getContext()));
                    this.f208209q.setClickable(true);
                    mo98982U7(spannableStringBuilder);
                    this.f208209q.setTextColor(this.f208178V0);
                    this.f208217x0 = false;
                    mo98972K7(false);
                } else {
                    if (this.f208177V.field_dayQuotaKind > 0.0d) {
                        if (Y > ((long) mo98980S7("" + this.f208177V.field_dayQuotaKind, "100"))) {
                            mo98982U7(getString(C0966R.string.kys));
                            this.f208209q.setTextColor(getResources().getColor(C0966R.color.Red_100));
                            this.f208209q.announceForAccessibility(getContext().getString(C0966R.string.kys));
                            this.f208217x0 = false;
                            mo98972K7(false);
                            C115669n.INSTANCE.mo160131h(21467, this.f208177V.field_bankcardType, Long.valueOf(Y), 1, Double.valueOf(this.f208177V.field_dayQuotaKind));
                            return;
                        }
                    }
                    mo98982U7("");
                    this.f208217x0 = true;
                    mo98972K7(true);
                }
            } else if (i == 2) {
                C78016y53 a = C71647n0.m84120b().mo98815a();
                int i3 = a == null ? 0 : a.f228553f;
                int i4 = a == null ? 0 : a.f228555h;
                Bankcard bankcard2 = this.f208177V;
                if (bankcard2 == null || !bankcard2.mo99388n2()) {
                    z2 = false;
                } else {
                    i4 = getIntent().getIntExtra("lqt_balance", 0);
                    z2 = true;
                }
                if (!z2) {
                    C78016y53 y532 = a;
                    if (Y > ((long) i3)) {
                        mo98982U7(getString(C0966R.string.kwt));
                        this.f208209q.setTextColor(getResources().getColor(C0966R.color.Red_100));
                        this.f208209q.announceForAccessibility(getContext().getString(C0966R.string.kwt));
                        this.f208163L.setVisibility(8);
                        this.f208217x0 = false;
                        mo98973L7();
                        mo98972K7(false);
                        this.f208163L.setVisibility(8);
                        return;
                    }
                    long j = (long) i4;
                    if (Y > j) {
                        long Y2 = C75228t.m90232Y(this.f208174T0 + "", "100");
                        if (Y >= Y2) {
                            C115669n.INSTANCE.mo160131h(20287, 9);
                        }
                        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "balance > lqtBalance, balance: %s, previousBalance: %s", Long.valueOf(Y), Long.valueOf(Y2));
                        String string = getString(C0966R.string.kwe, new Object[]{Double.valueOf(mo98975N7(i3 + "", "100", 2))});
                        this.f208209q.setTextColor(this.f208178V0);
                        mo98982U7(string);
                        C78016y53 y533 = y532;
                        if (y532 == null || (TextUtils.isEmpty(y533.f228568x) && y533.f228569y == null)) {
                            this.f208163L.setVisibility(0);
                            String string2 = getString(C0966R.string.kx6, new Object[]{Double.valueOf(mo98975N7(i4 + "", "100", 2))});
                            String str3 = string2 + getString(C0966R.string.kx9);
                            C75228t.m90253j0(this.f208164M, str3, string2.length(), str3.length(), new C7092q((C7092q.C7093a) new WalletLqtSaveFetchUI$$s(this, y533), true), getContext());
                            this.f208165N.setVisibility(8);
                            this.f208163L.announceForAccessibility(this.f208164M.getText().toString());
                        } else {
                            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "balance > lqtBalance, go to new redeem to bank exceed tips");
                            StringBuffer stringBuffer = new StringBuffer();
                            if (!TextUtils.isEmpty(y533.f228568x)) {
                                this.f208163L.setVisibility(0);
                                String str4 = y533.f228568x;
                                try {
                                    str4 = String.format(str4, new Object[]{C75228t.m90260n(mo98975N7(i4 + "", "100", 2))});
                                } catch (Exception unused) {
                                }
                                this.f208165N.setText(str4);
                                this.f208165N.setVisibility(0);
                                stringBuffer.append(this.f208165N.getText().toString());
                            }
                            C51892wy wyVar = y533.f228569y;
                            if (wyVar != null && !TextUtils.isEmpty(wyVar.f144345d)) {
                                String str5 = wyVar.f144345d;
                                try {
                                    str5 = String.format(str5, new Object[]{C75228t.m90260n(mo98975N7((Y - j) + "", "100", 2))});
                                } catch (Exception unused2) {
                                }
                                C51892wy wyVar2 = new C51892wy();
                                wyVar2.f144345d = str5;
                                wyVar2.f144347f = wyVar.f144347f;
                                wyVar2.f144346e = wyVar.f144346e;
                                wyVar2.f144348g = wyVar.f144348g;
                                wyVar2.f144349h = wyVar.f144349h;
                                C77977pf3 pf32 = y533.f228570z;
                                C71652v.C71653a aVar = new C71652v.C71653a();
                                aVar.f207657a = pf32;
                                mo98985X7(this.f208164M, true, wyVar2, (C101218e0) null, (C71652v) null, new C71652v(aVar), 10);
                                stringBuffer.append(this.f208164M.getText().toString());
                            }
                            if (!Util.isNullOrNil(stringBuffer.toString())) {
                                this.f208163L.announceForAccessibility(stringBuffer.toString());
                            }
                        }
                        this.f208217x0 = false;
                        mo98973L7();
                        mo98972K7(false);
                        return;
                    }
                    Bankcard bankcard3 = this.f208177V;
                    if (bankcard3 != null && !bankcard3.mo99388n2() && this.f208177V.field_dayQuotaKind > 0.0d) {
                        if (Y > ((long) mo98980S7("" + this.f208177V.field_dayQuotaKind, "100"))) {
                            this.f208163L.setVisibility(0);
                            this.f208164M.setText(getString(C0966R.string.kww, new Object[]{Double.valueOf(this.f208177V.field_dayQuotaKind)}));
                            this.f208165N.setVisibility(8);
                            this.f208163L.announceForAccessibility(this.f208164M.getText().toString());
                            this.f208217x0 = false;
                            mo98973L7();
                            mo98972K7(false);
                            return;
                        }
                    }
                    mo98982U7(this.f208169R);
                    this.f208209q.setTextColor(this.f208178V0);
                    this.f208217x0 = true;
                    mo98989b8(z3, str2);
                    mo98972K7(true);
                    this.f208163L.setVisibility(8);
                } else if (Y > ((long) i4)) {
                    mo98982U7(getString(C0966R.string.kwt));
                    this.f208209q.setTextColor(getResources().getColor(C0966R.color.Red_100));
                    this.f208209q.announceForAccessibility(getContext().getString(C0966R.string.kwt));
                    this.f208217x0 = false;
                    mo98973L7();
                    mo98972K7(false);
                    this.f208163L.setVisibility(8);
                } else {
                    mo98982U7(this.f208169R);
                    this.f208209q.setTextColor(this.f208178V0);
                    this.f208217x0 = true;
                    mo98989b8(z3, str2);
                    mo98972K7(true);
                    this.f208163L.setVisibility(8);
                }
            }
        } else {
            if (this.f208173T == 1) {
                Bankcard bankcard4 = this.f208177V;
                if (bankcard4 == null || !bankcard4.mo99388n2()) {
                    mo98982U7("");
                } else {
                    mo98982U7(this.f208169R);
                }
            } else {
                mo98982U7(this.f208169R);
                mo98973L7();
            }
            this.f208209q.setTextColor(this.f208178V0);
            this.f208217x0 = false;
            mo98972K7(false);
        }
    }

    public void cleanUiData(int i) {
        View.OnClickListener onClickListener;
        if (i == 1 && (onClickListener = this.f208196g1) != null) {
            onClickListener.onClick((View) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02a1  */
    /* renamed from: d8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98991d8() {
        /*
            r17 = this;
            r6 = r17
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_FIRST_RELIEF_DIALOG_BOOLEAN_SYNC
            java.lang.Class<ub3.b> r8 = ub3.C78144b.class
            int r0 = r6.f208173T
            r9 = 2
            r10 = 8
            r11 = 0
            r12 = 1
            if (r0 != r12) goto L_0x01ff
            com.tencent.mm.plugin.wallet.balance.model.lqt.w r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71654w.f207659q
            r0.mo98818a(r12)
            te3.xr2 r1 = r0.f207662a
            if (r1 == 0) goto L_0x001f
            te3.h9 r1 = r1.f228538g
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = b63.C67196n0.m79475b(r1)
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            r6.f208171S = r1
            if (r1 != 0) goto L_0x0030
            y43.b0 r1 = y43.C79029b0.vx0()
            b63.s0 r1 = r1.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r1.f192955h
            r6.f208171S = r1
        L_0x0030:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r6.f208171S
            java.lang.String r14 = "MicroMsg.WalletLqtSaveFetchUI"
            if (r1 == 0) goto L_0x00a3
            r0.mo98818a(r12)
            te3.xr2 r1 = r0.f207662a
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = r1.f228542n
            goto L_0x0042
        L_0x0040:
            java.lang.String r1 = ""
        L_0x0042:
            r0.mo98818a(r12)
            te3.xr2 r0 = r0.f207662a
            if (r0 == 0) goto L_0x004c
            int r0 = r0.f228543o
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x0052
            r6.f208169R = r1
            goto L_0x009a
        L_0x0052:
            if (r0 != r12) goto L_0x008a
            int r0 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 2131839222(0x7f1148f6, float:1.931169E38)
            java.lang.String r1 = r6.getString(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            com.tencent.mm.wallet_core.ui.q r1 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b0 r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b0
            r3.<init>(r6)
            r1.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r3, (boolean) r12)
            int r0 = r0 + r12
            int r3 = r2.length()
            r4 = 18
            r2.setSpan(r1, r0, r3, r4)
            r6.f208169R = r2
            goto L_0x009a
        L_0x008a:
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r11] = r0
            java.lang.String r0 = "unknown func: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r0, r2)
            r6.f208169R = r1
        L_0x009a:
            android.widget.TextView r0 = r6.f208209q
            if (r0 == 0) goto L_0x00a3
            java.lang.CharSequence r0 = r6.f208169R
            r6.mo98982U7(r0)
        L_0x00a3:
            android.view.ViewGroup r0 = r6.f208197h
            if (r0 == 0) goto L_0x00aa
            r0.setVisibility(r11)
        L_0x00aa:
            te3.u53 r15 = r17.mo98978Q7()
            java.lang.String r0 = r15.f228297v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00e8
            java.lang.String r2 = r15.f228297v
            android.widget.TextView r5 = r6.f208162K
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.widget.TextView r1 = r6.f208162K
            float r1 = r1.getTextSize()
            int r3 = (int) r1
            r4 = 1
            r16 = 0
            r1 = r17
            r13 = r5
            r5 = r16
            android.text.SpannableString r0 = r0.mo107051Lq(r1, r2, r3, r4, r5)
            r13.setText(r0)
            android.widget.TextView r0 = r6.f208162K
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r6.f208162K
            r0.setVisibility(r11)
            goto L_0x00ed
        L_0x00e8:
            android.widget.TextView r0 = r6.f208162K
            r0.setVisibility(r10)
        L_0x00ed:
            java.lang.String r0 = r15.f228289n
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0102
            android.widget.TextView r0 = r6.f208161J
            java.lang.String r1 = r15.f228289n
            r0.setText(r1)
            android.widget.TextView r0 = r6.f208161J
            r0.setVisibility(r11)
            goto L_0x0107
        L_0x0102:
            android.widget.TextView r0 = r6.f208161J
            r0.setVisibility(r10)
        L_0x0107:
            boolean r0 = r6.f208189c1
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "saveForm has been clicked, no need to show reliefDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            di3.d r0 = di3.C86312j.m106911c(r8)
            ub3.b r0 = (ub3.C78144b) r0
            com.tencent.mm.wallet_core.model.q0 r0 = r0.mo107980OI()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo119993e(r7, r1)
            goto L_0x01d6
        L_0x0121:
            di3.d r0 = di3.C86312j.m106911c(r8)
            ub3.b r0 = (ub3.C78144b) r0
            com.tencent.mm.wallet_core.model.q0 r0 = r0.mo107980OI()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.mo119992d(r7, r1)
            if (r0 == 0) goto L_0x013e
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x013e
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x013f
        L_0x013e:
            r0 = 1
        L_0x013f:
            if (r0 == 0) goto L_0x01d6
            int r0 = r6.f208187a1
            r1 = 14
            if (r0 != r1) goto L_0x01d6
            java.lang.String r0 = r15.f228299x
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01d6
            qo3.e0 r0 = r6.f208188b1
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.mo140661h()
            if (r0 != 0) goto L_0x01d6
        L_0x0159:
            qo3.e0 r0 = new qo3.e0
            androidx.appcompat.app.AppCompatActivity r1 = r17.getContext()
            r0.<init>(r1, r9, r11)
            r6.f208188b1 = r0
            android.content.res.Resources r1 = r17.getResources()
            r2 = 2131821557(0x7f1103f5, float:1.927586E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo140677w(r1)
            qo3.e0 r0 = r6.f208188b1
            r0.mo140676v(r12)
            qo3.e0 r0 = r6.f208188b1
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c0 r1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$c0
            r1.<init>(r6)
            r0.f296375F = r1
            androidx.appcompat.app.AppCompatActivity r0 = r17.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131496351(0x7f0c0d9f, float:1.8616264E38)
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r2)
            r1 = 2131312147(0x7f093e13, float:1.8242654E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90240d(r1)
            java.lang.String r2 = r15.f228299x
            r1.setText(r2)
            r1 = 2131312146(0x7f093e12, float:1.8242652E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r2 == 0) goto L_0x01b7
            r2 = 2131233759(0x7f080bdf, float:1.8083665E38)
            r1.setBackgroundResource(r2)
            goto L_0x01bd
        L_0x01b7:
            r2 = 2131233758(0x7f080bde, float:1.8083663E38)
            r1.setBackgroundResource(r2)
        L_0x01bd:
            qo3.e0 r1 = r6.f208188b1
            r1.mo140663j(r0)
            qo3.e0 r0 = r6.f208188b1
            r0.mo140655A()
            di3.d r0 = di3.C86312j.m106911c(r8)
            ub3.b r0 = (ub3.C78144b) r0
            com.tencent.mm.wallet_core.model.q0 r0 = r0.mo107980OI()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.mo119993e(r7, r1)
        L_0x01d6:
            com.tencent.mm.plugin.wallet.balance.model.lqt.n0 r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0.m84120b()
            te3.y53 r0 = r0.mo98815a()
            if (r0 == 0) goto L_0x01f1
            boolean r1 = r0.f228560p
            if (r1 == 0) goto L_0x01f1
            te3.qf3 r1 = r0.f228561q
            if (r1 == 0) goto L_0x01f1
            androidx.appcompat.app.AppCompatActivity r1 = r17.getContext()
            te3.qf3 r0 = r0.f228561q
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71649o1.m84127b(r1, r0)
        L_0x01f1:
            boolean r0 = r6.f208179W
            if (r0 == 0) goto L_0x01fb
            r6.f208179W = r11
            r6.mo98979R7(r11)
            goto L_0x020c
        L_0x01fb:
            r6.mo98979R7(r12)
            goto L_0x020c
        L_0x01ff:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout r0 = r6.f208159H
            boolean r0 = r0.f207907h
            if (r0 == 0) goto L_0x0209
            r6.mo98979R7(r11)
            goto L_0x020c
        L_0x0209:
            r6.mo98979R7(r12)
        L_0x020c:
            int r0 = r6.f208173T
            if (r0 != r12) goto L_0x0218
            te3.u53 r0 = r17.mo98978Q7()
            java.util.LinkedList<te3.wy> r0 = r0.f228298w
            r9 = 1
            goto L_0x0226
        L_0x0218:
            com.tencent.mm.plugin.wallet.balance.model.lqt.n0 r0 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71647n0.m84120b()
            te3.y53 r0 = r0.mo98815a()
            if (r0 != 0) goto L_0x0224
            goto L_0x029d
        L_0x0224:
            java.util.LinkedList<te3.wy> r0 = r0.f228548A
        L_0x0226:
            android.widget.LinearLayout r1 = r6.f208154C
            r1.removeAllViews()
            if (r0 == 0) goto L_0x029d
            int r1 = r0.size()
            if (r1 > 0) goto L_0x0234
            goto L_0x029d
        L_0x0234:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r7.<init>(r1, r1)
            int r1 = kg3.C76577a.m92151b(r6, r10)
            r7.topMargin = r1
            java.util.Iterator r8 = r0.iterator()
        L_0x0244:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x029d
            java.lang.Object r0 = r8.next()
            te3.wy r0 = (te3.C51892wy) r0
            float r1 = kg3.C76577a.m92165p(r17)
            float r2 = kg3.C76577a.m92169t(r17)
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106153J(r1, r2)
            if (r2 != 0) goto L_0x0268
            float r2 = kg3.C76577a.m92170u(r17)
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106153J(r1, r2)
            if (r2 == 0) goto L_0x026c
        L_0x0268:
            float r1 = kg3.C76577a.m92168s(r17)
        L_0x026c:
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r6)
            r2 = 1096810496(0x41600000, float:14.0)
            float r1 = r1 * r2
            int r1 = kg3.C76577a.m92150a(r6, r1)
            float r1 = (float) r1
            r4.setTextSize(r11, r1)
            r1 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r1 = kg3.C76577a.m92153d(r6, r1)
            r4.setTextColor(r1)
            android.widget.LinearLayout r1 = r6.f208154C
            r1.addView(r4, r7)
            java.lang.String r1 = r0.f144345d
            java.lang.String r2 = r0.f144346e
            java.lang.String r3 = r0.f144348g
            com.tencent.mm.plugin.wallet.balance.ui.lqt.p2 r5 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.p2
            r5.<init>(r6, r0, r9)
            r0 = r17
            r0.mo98983V7(r1, r2, r3, r4, r5)
            goto L_0x0244
        L_0x029d:
            boolean r0 = r6.f208190d1
            if (r0 == 0) goto L_0x02a6
            r6.f208190d1 = r11
            r17.showNormalStWcKb()
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI.mo98991d8():void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfa;
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "isHandleAutoShowNormalStWcKb() mWxKbInterceptState:%s isAutoShowNormalStWcKb:%s", Boolean.valueOf(this.f208172S0), Boolean.valueOf(this.mWcKeyboard.mo104746j()));
        return !this.f208172S0 && this.mWcKeyboard.mo104746j();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        List<Orders.Commodity> list;
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "onActivityResult() requestCode:%s", Integer.valueOf(i));
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f208195g.f207645d.mo98814b(this.f208173T, this.f208208p0, 1).mo123062e(new WalletLqtSaveFetchUI$$x(this));
        } else if (i == 4097) {
            setResult(i2);
            finish();
        } else {
            if (intent != null) {
                intent.putExtra("key_bind_serial", this.f208181X);
            }
            C71624d1 d1Var = this.f208193f;
            d1Var.getClass();
            if (i == 123 && i2 == -1) {
                String stringExtra = intent.getStringExtra("key_bind_serial");
                Orders orders = (Orders) intent.getParcelableExtra("key_orders");
                if (orders != null && (list = orders.f209542M) != null && ((ArrayList) list).size() > 0) {
                    Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doQueryPurchaseResult, accountType: %s, reqkey: %s", Integer.valueOf(d1Var.hashCode()), Integer.valueOf(d1Var.f207609h), orders.f209563e);
                    d1Var.f207605d = ((Orders.Commodity) ((ArrayList) orders.f209542M).get(0)).f209606r;
                    String str = (String) ((HashMap) d1Var.f207614m).get(orders.f209563e);
                    if (!Util.isNullOrNil(str)) {
                        d1Var.f207604c = str;
                    }
                    WalletBaseUI walletBaseUI = d1Var.f207603b;
                    if (walletBaseUI instanceof WalletLqtSaveFetchUI) {
                        WalletLqtSaveFetchUI walletLqtSaveFetchUI = (WalletLqtSaveFetchUI) walletBaseUI;
                        walletLqtSaveFetchUI.f208172S0 = true;
                        walletLqtSaveFetchUI.mo98981T7();
                    }
                    d1Var.mo98810b(stringExtra, 0);
                }
            } else if (i == 456 && i2 == -1) {
                String stringExtra2 = intent.getStringExtra("key_bind_serial");
                String stringExtra3 = intent.getStringExtra("lqt_fetch_enc_pwd");
                String stringExtra4 = intent.getStringExtra("lqt_redeem_listid");
                Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s onActivityResult, doRedeemFund, accountType: %s, redeemListId: %s", Integer.valueOf(d1Var.hashCode()), Integer.valueOf(d1Var.f207609h), stringExtra4);
                WalletBaseUI walletBaseUI2 = d1Var.f207603b;
                if (walletBaseUI2 instanceof WalletLqtSaveFetchUI) {
                    WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = (WalletLqtSaveFetchUI) walletBaseUI2;
                    walletLqtSaveFetchUI2.f208172S0 = true;
                    walletLqtSaveFetchUI2.mo98981T7();
                }
                Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s doRedeemFund, redeemListId: %s", Integer.valueOf(d1Var.hashCode()), stringExtra4);
                if (Util.isNullOrNil(d1Var.f207608g)) {
                    Log.m105925i("MicroMsg.LqtSaveFetchLogic", "%s redeemListId is null!!, update from activity result: %s", Integer.valueOf(d1Var.hashCode()), stringExtra4);
                    d1Var.f207608g = stringExtra4;
                }
                String stringExtra5 = d1Var.f207603b.getIntent().getStringExtra("operate_id");
                d1Var.f207603b.showLoading(true);
                C71617b1.C71620c cVar = d1Var.f207602a.f207592d;
                int i3 = d1Var.f207607f;
                String str2 = d1Var.f207608g;
                int i4 = d1Var.f207609h;
                cVar.getClass();
                ((C88633e) C88643g.m110551i(Integer.valueOf(i3), stringExtra3, str2, Integer.valueOf(i4), stringExtra5)).mo123061d(cVar).mo123062e(new C71623c1(d1Var, stringExtra2)).mo123065b(new C71640l1(d1Var));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.a7_));
        hideActionbarLine();
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "WalletLqtSaveFetchUI onCreate");
        this.f208182X0 = new C43337b(this);
        this.f208199i = (WalletFormView) findViewById(C0966R.C0970id.gbd);
        this.f208207p = (ImageView) findViewById(C0966R.C0970id.f357503a72);
        this.f208209q = (TextView) findViewById(C0966R.C0970id.gba);
        this.f208210r = (TextView) findViewById(C0966R.C0970id.gbb);
        this.f208201j = (TextView) findViewById(C0966R.C0970id.gbe);
        TextView textView = (TextView) findViewById(C0966R.C0970id.g9c);
        this.f208205n = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f208157F = (TextView) findViewById(C0966R.C0970id.ljn);
        this.f208161J = (TextView) findViewById(C0966R.C0970id.gbi);
        this.f208162K = (TextView) findViewById(C0966R.C0970id.g9p);
        this.f208166P = (TextView) findViewById(C0966R.C0970id.gbc);
        this.f208211s = (ViewGroup) findViewById(C0966R.C0970id.gbf);
        this.f208212t = (TextView) findViewById(C0966R.C0970id.gbh);
        this.f208213u = (CheckBox) findViewById(C0966R.C0970id.gbg);
        this.f208197h = (ViewGroup) findViewById(C0966R.C0970id.gkr);
        this.f208214v = (TextView) findViewById(C0966R.C0970id.ew6);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.ew7);
        this.f208215w = (LinearLayout) findViewById(C0966R.C0970id.i8q);
        this.f208216x = (LinearLayout) findViewById(C0966R.C0970id.g9m);
        this.f208218y = (LinearLayout) findViewById(C0966R.C0970id.g9k);
        this.f208220z = (TextView) findViewById(C0966R.C0970id.g9l);
        this.f208152A = (LinearLayout) findViewById(C0966R.C0970id.g9h);
        this.f208153B = (LinearLayout) findViewById(C0966R.C0970id.g9j);
        this.f208154C = (LinearLayout) findViewById(C0966R.C0970id.gam);
        this.f208156E = (TextView) findViewById(C0966R.C0970id.g9g);
        this.f208206o = (TextView) findViewById(C0966R.C0970id.a5f);
        this.f208159H = (WalletLqtArriveTimeLayout) findViewById(C0966R.C0970id.gb9);
        this.f208160I = (ScrollView) findViewById(C0966R.C0970id.gb5);
        this.f208163L = (LinearLayout) findViewById(C0966R.C0970id.gab);
        this.f208164M = (TextView) findViewById(C0966R.C0970id.gac);
        this.f208165N = (TextView) findViewById(C0966R.C0970id.gad);
        this.f208155D = (LinearLayout) findViewById(C0966R.C0970id.ew_);
        C85875k4.m106189j0(this.f208165N.getPaint(), 0.8f);
        this.f208173T = getIntent().getIntExtra("lqt_save_fetch_mode", 1);
        int intExtra = getIntent().getIntExtra("entrance_type", 0);
        this.f208187a1 = intExtra;
        C71624d1 d1Var = this.f208193f;
        d1Var.f207611j = this.f208173T;
        d1Var.f207612k = intExtra;
        getIntent().getIntExtra("lqt_max_redeem_amount", -1);
        getIntent().getStringExtra("lqt_redeem_invalid_amount_hint");
        this.f208208p0 = getIntent().getIntExtra("lqt_account_type", 0);
        if (C85875k4.m106211z()) {
            this.f208215w.setBackground(getResources().getDrawable(C0966R.C0969drawable.ad_));
        }
        if (this.f208173T == 1) {
            C86709a0.m107528h();
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LQT_DEFAULTCARD_SAVE_STRING_SYNC, "");
            this.f208181X = str;
            if (Util.isNullOrNil(str)) {
                C86709a0.m107528h();
                this.f208181X = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LQT_DEFAULTCARD_STRING_SYNC, "");
            }
            this.f208185Z = getIntent().getStringExtra("card_serial");
            this.f208216x.setVisibility(8);
            this.f208218y.setVisibility(0);
            this.f208152A.setVisibility(8);
            this.f208153B.setVisibility(0);
        }
        this.f208190d1 = getIntent().getBooleanExtra("need_pull_keyboard", false);
        Log.m105925i("MicroMsg.WalletLqtSaveFetchUI", "onCreate, accountType: %s, mode: %s, mCurrentSerial: %s", Integer.valueOf(this.f208208p0), Integer.valueOf(this.f208173T), this.f208181X);
        this.f208199i.getTitleTv().setText(C45121z0.m49962b());
        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.mWcKeyboard = wcPayKeyboard;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) wcPayKeyboard.getLayoutParams();
        layoutParams.addRule(12);
        this.mWcKeyboard.setLayoutParams(layoutParams);
        if (this.f208173T == 1) {
            setWPKeyboard(this.f208199i.getContentEt(), false, false);
            this.mWcKeyboard.setActionText(getString(C0966R.string.kyy));
            ((C12945b) C39818r.f106831a.mo62444c(getContext()).mo75002a(C12945b.class)).setValue("keyboard_title_key", getString(C0966R.string.kyy));
        } else {
            this.isVKBFirstTimeShown = false;
            setWPKeyboard(this.f208199i.getContentEt(), false, false);
            this.mWcKeyboard.setActionText(getString(C0966R.string.kxb));
            ((C12945b) C39818r.f106831a.mo62444c(getContext()).mo75002a(C12945b.class)).setValue("keyboard_title_key", getString(C0966R.string.kxb));
        }
        if (C11171e.m11045b(27)) {
            this.f208199i.mo105095m();
        }
        setWcKbHeightListener(this);
        int i = this.f208173T;
        if (i == 1) {
            this.f208201j.setText(getString(C0966R.string.kyq));
            this.f208157F.setText(getString(C0966R.string.kyt));
            LqtSaveKeyboardToolBarLayout lqtSaveKeyboardToolBarLayout = new LqtSaveKeyboardToolBarLayout(getContext());
            this.f208167Q = lqtSaveKeyboardToolBarLayout;
            lqtSaveKeyboardToolBarLayout.setOnSelectAmount(new WalletLqtSaveFetchUI$$a(this));
        } else if (i == 2) {
            this.f208201j.setText(getString(C0966R.string.kwq));
            this.f208157F.setText(getString(C0966R.string.kwy));
        }
        if (this.f208187a1 == 14) {
            this.f208199i.getContentEt().setOnTouchListener(new C71845y1(this));
        }
        this.f208199i.mo105069a(new C71846z1(this));
        setTenpayKBStateListener(new C71780a2(this));
        this.f208199i.getContentEt().setOnEditorActionListener(new C71786b2(this));
        if (this.f208173T == 2) {
            this.f208159H.setCallback(new C71788c2(this));
        }
        int width = this.f208157F.getWidth();
        Log.m105919d("MicroMsg.WalletLqtSaveFetchUI", "saveFetchHintWordingTv width: %d", Integer.valueOf(width));
        if (width <= 0) {
            this.f208157F.post(new C71791d2(this));
        } else {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f208155D.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = width;
            }
            this.f208155D.setLayoutParams(layoutParams2);
        }
        mo98982U7("");
        this.f208209q.setClickable(true);
        this.f208209q.setOnTouchListener(new C75355a0(this));
        mo98972K7(false);
        this.f208164M.setClickable(true);
        this.f208164M.setOnTouchListener(new C75355a0(this));
        this.f208165N.setClickable(true);
        this.f208165N.setOnTouchListener(new C75355a0(this));
        if (this.f208173T == 1) {
            this.f208197h.setVisibility(4);
            int i2 = this.f208187a1;
            if (i2 == 8 || i2 == 14) {
                setMMTitle((int) C0966R.string.kyx);
            } else {
                setMMTitle((int) C0966R.string.kyy);
            }
        } else {
            setMMTitle((int) C0966R.string.kxb);
        }
        if (this.f208205n.findViewById(C0966R.C0970id.ljm) != null) {
            View findViewById = this.f208205n.findViewById(C0966R.C0970id.ljm);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        WalletLqtSaveFetchUI$$i walletLqtSaveFetchUI$$i = new WalletLqtSaveFetchUI$$i(this);
        this.f208205n.setOnClickListener(walletLqtSaveFetchUI$$i);
        if (findViewById(C0966R.C0970id.g9d) != null) {
            findViewById(C0966R.C0970id.g9d).setOnClickListener(walletLqtSaveFetchUI$$i);
        }
        C71654w wVar = C71654w.f207659q;
        wVar.f207677p.add(this.f208192e1);
        mo98991d8();
        this.f208197h.setOnTouchListener(new WalletLqtSaveFetchUI$$k(this));
        this.f208200i1 = 1;
        String stringExtra = getIntent().getStringExtra("fill_money");
        if (Util.getDouble(stringExtra, 0.0d) > 0.0d) {
            this.f208199i.setText(stringExtra);
            mo98990c8(stringExtra, false);
        }
        EditText contentEt = this.f208199i.getContentEt();
        TextView titleTv = this.f208199i.getTitleTv();
        float p = C76577a.m92165p(this);
        float f = C88494d.f255615g;
        if (p != 1.0f || f != 1.0f) {
            if (p > 1.4f) {
                p = 1.4f;
            }
            float textSize = (contentEt.getTextSize() / p) / f;
            contentEt.setTextSize(0, textSize);
            float textSize2 = (titleTv.getTextSize() / p) / f;
            titleTv.setTextSize(0, textSize2);
            Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "et:" + textSize + " tv:" + textSize2 + " fontScale:" + p + " viewScale:" + f);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo98981T7();
        C71654w wVar = C71654w.f207659q;
        wVar.f207677p.remove(this.f208192e1);
        wVar.f207663b = null;
        this.f208193f = null;
        this.f208195g = null;
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f208202j1, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.mWcKeyboard;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "onNewIntent");
        super.onNewIntent(intent);
        this.f208195g.f207645d.mo98814b(this.f208173T, this.f208208p0, 1).mo123062e(new WalletLqtSaveFetchUI$$j(this, mo98977P7()));
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "onPause()");
        this.f208198h1.dead();
        if (!this.mWcKeyboard.mo104747k()) {
            this.f208200i1 = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "onResume() ");
        this.f208198h1.alive();
        if (this.f208200i1 == 3 && isHandleAutoShowNormalStWcKb()) {
            MMHandlerThread.postToMainThreadDelayed(this.f208203k1, 300);
        }
        this.f208200i1 = 2;
        if (this.f208170R0) {
            showLoading(false);
            this.f208170R0 = false;
            WCPayUpdateSaveFetchUIEvent wCPayUpdateSaveFetchUIEvent = new WCPayUpdateSaveFetchUIEvent();
            wCPayUpdateSaveFetchUIEvent.f194032d.f194033a = this.f208173T;
            wCPayUpdateSaveFetchUIEvent.publish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C71624d1 d1Var = this.f208193f;
        d1Var.getClass();
        Log.m105925i("MicroMsg.LqtSaveFetchLogic", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (yVar instanceof C78342e0) {
            d1Var.f207610i = C79029b0.vx0().wx0().f192955h;
            C46888b bVar = d1Var.f207613l;
            if (bVar != null) {
                bVar.mo72093c(yVar);
                d1Var.f207613l.resume();
            }
        }
        Log.m105924i("MicroMsg.WalletLqtSaveFetchUI", "onSceneEnd");
        mo98991d8();
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12945b.class);
    }
}
