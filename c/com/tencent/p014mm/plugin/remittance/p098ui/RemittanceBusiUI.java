package com.tencent.p014mm.plugin.remittance.p098ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import bl3.C39818r;
import c53.C67342b;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.autogen.events.F2fDynamicResultEvent;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.F2fLargeMoneyPayEvent;
import com.tencent.p014mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.F2FMoneyRemindStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.p014mm.plugin.remittance.model.C42843j;
import com.tencent.p014mm.plugin.remittance.model.C42846m;
import com.tencent.p014mm.plugin.remittance.model.C42847n;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.plugin.remittance.model.C70582d;
import com.tencent.p014mm.plugin.remittance.model.C70583e;
import com.tencent.p014mm.plugin.remittance.model.C70590i;
import com.tencent.p014mm.plugin.remittance.model.C70604k;
import com.tencent.p014mm.plugin.remittance.p098ui.C70887f0;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceRemarkInputHalfPage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import com.unionpay.C75273a;
import cr3.C75278c;
import cr3.C75279d;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76912y0;
import p196ln.C76705f;
import p206nj.C11171e;
import p629ny.C76979h;
import te3.C77907be0;
import te3.C77912ce0;
import te3.C77920eb0;
import te3.C77925f4;
import te3.C77927fb0;
import te3.C77995sj;
import te3.C78013xj;
import te3.C78018yj;
import te3.b54;
import te3.cz4;
import te3.dz4;
import te3.eh4;
import te3.ez4;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI */
public class RemittanceBusiUI extends WalletBaseUI implements WcPayKeyboard.C75086f {

    /* renamed from: l2 */
    public static final /* synthetic */ int f204504l2 = 0;

    /* renamed from: A */
    public LinearLayout f204505A;

    /* renamed from: A1 */
    public MoneyFontSize f204506A1;

    /* renamed from: B */
    public LinearLayout f204507B;

    /* renamed from: B1 */
    public boolean f204508B1 = false;

    /* renamed from: C */
    public LinearLayout f204509C;

    /* renamed from: C1 */
    public boolean f204510C1 = false;

    /* renamed from: D */
    public LinearLayout f204511D;

    /* renamed from: D1 */
    public int f204512D1 = 0;

    /* renamed from: E */
    public EditText f204513E;

    /* renamed from: E1 */
    public String f204514E1;

    /* renamed from: F */
    public TextView f204515F;

    /* renamed from: F1 */
    public Map<String, C77925f4> f204516F1 = new HashMap();

    /* renamed from: G */
    public View f204517G;

    /* renamed from: G1 */
    public RemittanceF2fDynamicCodeUI f204518G1 = null;

    /* renamed from: H */
    public TextView f204519H;

    /* renamed from: H1 */
    public boolean f204520H1 = false;

    /* renamed from: I */
    public TextView f204521I;

    /* renamed from: I1 */
    public boolean f204522I1 = false;

    /* renamed from: J */
    public Button f204523J;

    /* renamed from: J1 */
    public int f204524J1;

    /* renamed from: K */
    public RelativeLayout f204525K;

    /* renamed from: K1 */
    public boolean f204526K1 = false;

    /* renamed from: L */
    public TextView f204527L;

    /* renamed from: L1 */
    public int f204528L1;

    /* renamed from: M */
    public RelativeLayout f204529M;

    /* renamed from: M1 */
    public C70604k f204530M1;

    /* renamed from: N */
    public RelativeLayout f204531N;

    /* renamed from: N1 */
    public String f204532N1;

    /* renamed from: O1 */
    public LinearLayout f204533O1;

    /* renamed from: P */
    public WcPayKeyboard f204534P;

    /* renamed from: P1 */
    public LinearLayout f204535P1;

    /* renamed from: Q */
    public ScrollView f204536Q;

    /* renamed from: Q0 */
    public String f204537Q0;

    /* renamed from: Q1 */
    public LinearLayout f204538Q1;

    /* renamed from: R */
    public int f204539R;

    /* renamed from: R0 */
    public String f204540R0;

    /* renamed from: R1 */
    public TextView f204541R1;

    /* renamed from: S */
    public String f204542S;

    /* renamed from: S0 */
    public int f204543S0 = 4;

    /* renamed from: S1 */
    public CdnImageView f204544S1;

    /* renamed from: T */
    public double f204545T;

    /* renamed from: T0 */
    public int f204546T0;

    /* renamed from: T1 */
    public CdnImageView f204547T1;

    /* renamed from: U */
    public String f204548U;

    /* renamed from: U0 */
    public boolean f204549U0;

    /* renamed from: U1 */
    public TextView f204550U1;

    /* renamed from: V */
    public String f204551V;

    /* renamed from: V0 */
    public boolean f204552V0;

    /* renamed from: V1 */
    public int f204553V1 = 0;

    /* renamed from: W */
    public String f204554W;

    /* renamed from: W0 */
    public String f204555W0;

    /* renamed from: W1 */
    public Runnable f204556W1 = new Runnable() {
        public void run() {
            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
            if (remittanceBusiUI.f204553V1 == 2 && remittanceBusiUI.isHandleAutoShowNormalStWcKb()) {
                RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                if (!remittanceBusiUI2.f204598n1) {
                    remittanceBusiUI2.showNormalStWcKb();
                }
            }
        }
    };

    /* renamed from: X */
    public String f204557X;

    /* renamed from: X0 */
    public String f204558X0;

    /* renamed from: X1 */
    public Runnable f204559X1 = new Runnable() {
        public void run() {
            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
            boolean z = true;
            if (remittanceBusiUI.f204605q1 == null) {
                Log.m105920e("MicroMsg.RemittanceBusiUI", "busi_resp is null");
                C70590i iVar = remittanceBusiUI.f204620x1;
                if (iVar != null) {
                    iVar.f204126o = true;
                    return;
                }
                return;
            }
            double T7 = remittanceBusiUI.mo97320T7();
            remittanceBusiUI.f204545T = T7;
            int round = (int) Math.round(T7 * 100.0d);
            Log.m105925i("MicroMsg.RemittanceBusiUI", "update updateBilling %s", Integer.valueOf(round));
            if (round <= 0) {
                remittanceBusiUI.f204620x1.f204126o = true;
                remittanceBusiUI.mo97314N7(remittanceBusiUI.f204605q1.f204044f);
                C70590i iVar2 = remittanceBusiUI.f204620x1;
                if (iVar2 != null) {
                    iVar2.f204126o = true;
                    return;
                }
                return;
            }
            remittanceBusiUI.f204599o.setText(C0966R.string.hzy);
            C70590i iVar3 = remittanceBusiUI.f204620x1;
            if (iVar3.f204122h == null) {
                z = false;
            }
            remittanceBusiUI.doSceneProgress(iVar3, z);
        }
    };

    /* renamed from: Y */
    public String f204560Y;

    /* renamed from: Y0 */
    public String f204561Y0;

    /* renamed from: Y1 */
    public C75278c<C42847n> f204562Y1 = new C75278c<C42847n>() {
        /* renamed from: a */
        public void mo97352a(C75279d dVar) {
            if (dVar instanceof C42847n) {
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                String str = ((C42847n) dVar).f116037i;
                int i = RemittanceBusiUI.f204504l2;
                remittanceBusiUI.mo97316P7(true, str);
            }
        }

        /* renamed from: b */
        public boolean mo97353b(int i, int i2, C75279d dVar) {
            C42847n nVar = (C42847n) dVar;
            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
            int i3 = remittanceBusiUI.f204585h1;
            if (i3 == 0) {
                return false;
            }
            int i4 = remittanceBusiUI.f204591j1;
            if (i4 >= i3) {
                Log.m105925i("MicroMsg.RemittanceBusiUI", "mZero_start_time %s >= mZero_try_time %s say bye bye", Integer.valueOf(i4), Integer.valueOf(remittanceBusiUI.f204585h1));
                return false;
            }
            remittanceBusiUI.f204565Z1.f204702d = nVar;
            long j = 0;
            if (i == 0 && i2 == 0) {
                int i5 = nVar.f116033e.f132966d;
                if (i5 == 0 || i5 == 0 || !nVar.f116035g) {
                    return false;
                }
                int i6 = i4 + 1;
                remittanceBusiUI.f204591j1 = i6;
                Log.m105925i("MicroMsg.RemittanceBusiUI", "mZero_try_interval_ms  mZero_start_time %s mZero_try_interval_ms %s", Integer.valueOf(i6), Integer.valueOf(remittanceBusiUI.f204588i1));
                MMHandlerThread.removeRunnable(remittanceBusiUI.f204565Z1);
                ZeroCallBack zeroCallBack = remittanceBusiUI.f204565Z1;
                int i7 = remittanceBusiUI.f204588i1;
                if (i7 >= 0) {
                    j = (long) i7;
                }
                MMHandlerThread.postToMainThreadDelayed(zeroCallBack, j);
            } else {
                int i8 = i4 + 1;
                remittanceBusiUI.f204591j1 = i8;
                Log.m105925i("MicroMsg.RemittanceBusiUI", "mZero_try_interval_ms  mZero_start_time %s mZero_try_interval_ms %s", Integer.valueOf(i8), Integer.valueOf(remittanceBusiUI.f204588i1));
                MMHandlerThread.removeRunnable(remittanceBusiUI.f204565Z1);
                ZeroCallBack zeroCallBack2 = remittanceBusiUI.f204565Z1;
                int i9 = remittanceBusiUI.f204588i1;
                if (i9 >= 0) {
                    j = (long) i9;
                }
                MMHandlerThread.postToMainThreadDelayed(zeroCallBack2, j);
            }
            return true;
        }
    };

    /* renamed from: Z */
    public int f204563Z;

    /* renamed from: Z0 */
    public String f204564Z0;

    /* renamed from: Z1 */
    public ZeroCallBack f204565Z1 = new ZeroCallBack();

    /* renamed from: a1 */
    public String f204566a1;

    /* renamed from: a2 */
    public IListener<BusiF2fPaySuccEvent> f204567a2;

    /* renamed from: b1 */
    public int f204568b1;

    /* renamed from: b2 */
    public boolean f204569b2;

    /* renamed from: c1 */
    public int f204570c1;

    /* renamed from: c2 */
    public int f204571c2;

    /* renamed from: d */
    public TextView f204572d;

    /* renamed from: d1 */
    public String f204573d1;

    /* renamed from: d2 */
    public double f204574d2;

    /* renamed from: e */
    public TextView f204575e;

    /* renamed from: e1 */
    public eh4 f204576e1;

    /* renamed from: e2 */
    public String f204577e2;

    /* renamed from: f */
    public TextView f204578f;

    /* renamed from: f1 */
    public String f204579f1;

    /* renamed from: f2 */
    public String f204580f2;

    /* renamed from: g */
    public TextView f204581g;

    /* renamed from: g1 */
    public int f204582g1 = 0;

    /* renamed from: g2 */
    public IListener f204583g2;

    /* renamed from: h */
    public TextView f204584h;

    /* renamed from: h1 */
    public int f204585h1 = 0;

    /* renamed from: h2 */
    public IListener f204586h2;

    /* renamed from: i */
    public TextView f204587i;

    /* renamed from: i1 */
    public int f204588i1 = 0;

    /* renamed from: i2 */
    public IListener f204589i2;

    /* renamed from: j */
    public View f204590j;

    /* renamed from: j1 */
    public int f204591j1 = 0;

    /* renamed from: j2 */
    public IListener f204592j2;

    /* renamed from: k1 */
    public String f204593k1;

    /* renamed from: k2 */
    public IListener f204594k2;

    /* renamed from: l1 */
    public int f204595l1;

    /* renamed from: m1 */
    public String f204596m1;

    /* renamed from: n */
    public View f204597n;

    /* renamed from: n1 */
    public boolean f204598n1 = false;

    /* renamed from: o */
    public TextView f204599o;

    /* renamed from: o1 */
    public String f204600o1;

    /* renamed from: p */
    public View f204601p;

    /* renamed from: p0 */
    public String f204602p0;

    /* renamed from: p1 */
    public RemittanceRemarkInputHalfPage f204603p1;

    /* renamed from: q */
    public View f204604q;

    /* renamed from: q1 */
    public BusiRemittanceResp f204605q1;

    /* renamed from: r */
    public TextView f204606r;

    /* renamed from: r1 */
    public C70883e f204607r1 = new C70883e();

    /* renamed from: s */
    public View f204608s;

    /* renamed from: s1 */
    public C70873b f204609s1 = new C70873b();

    /* renamed from: t */
    public View f204610t;

    /* renamed from: t1 */
    public String f204611t1 = "";

    /* renamed from: u */
    public LinearLayout f204612u;

    /* renamed from: u1 */
    public String f204613u1 = "";

    /* renamed from: v */
    public TextView f204614v;

    /* renamed from: v1 */
    public boolean f204615v1 = false;

    /* renamed from: w */
    public CheckBox f204616w;

    /* renamed from: w1 */
    public double f204617w1 = -1.0d;

    /* renamed from: x */
    public View f204618x;

    /* renamed from: x0 */
    public int f204619x0;

    /* renamed from: x1 */
    public C70590i f204620x1 = null;

    /* renamed from: y */
    public CdnImageView f204621y;

    /* renamed from: y0 */
    public String f204622y0;

    /* renamed from: y1 */
    public WCPayLargeAmountTransferReportStruct f204623y1;

    /* renamed from: z */
    public WalletFormView f204624z;

    /* renamed from: z1 */
    public MoneyFontSize f204625z1;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$IRemitBusiJumpItemCallback */
    public abstract class IRemitBusiJumpItemCallback<InputType> implements C75129p.C75132c<InputType> {
        public IRemitBusiJumpItemCallback() {
        }

        /* renamed from: c */
        public void mo6028c(InputType inputtype) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
            intent.addFlags(67108864);
            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            RemittanceBusiUI remittanceBusiUI2 = remittanceBusiUI;
            C117292a.m165358d(remittanceBusiUI2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$IRemitBusiJumpItemCallback", "onExit", "(Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            remittanceBusiUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(remittanceBusiUI2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$IRemitBusiJumpItemCallback", "onExit", "(Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: d */
        public void mo6029d(InputType inputtype) {
        }

        /* renamed from: e */
        public int mo6030e() {
            return 1072;
        }

        /* renamed from: g */
        public void mo6031g(InputType inputtype) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$MoneyFontSize */
    public class MoneyFontSize {

        /* renamed from: a */
        public float f204695a;

        /* renamed from: b */
        public float f204696b;

        /* renamed from: c */
        public TenpaySecureEditText f204697c;

        /* renamed from: d */
        public TextView f204698d;

        /* renamed from: e */
        public View f204699e;

        /* renamed from: f */
        public RelativeLayout f204700f;

        public MoneyFontSize(int i, int i2, float f) {
            this.f204695a = (float) i;
            this.f204696b = (float) i2;
        }

        /* renamed from: a */
        public void mo97374a() {
            RemittanceBusiUI.this.f204581g.setTextSize(1, this.f204696b);
            RemittanceBusiUI.this.f204515F.setTextSize(1, this.f204695a);
            if (this.f204698d == null) {
                this.f204698d = (TextView) RemittanceBusiUI.this.f204624z.findViewById(C0966R.C0970id.ljn);
            }
            TextView textView = this.f204698d;
            if (textView != null) {
                textView.setTextSize(this.f204695a);
            }
            if (this.f204697c == null) {
                this.f204697c = (TenpaySecureEditText) RemittanceBusiUI.this.f204624z.findViewById(C0966R.C0970id.lg_);
            }
            TenpaySecureEditText tenpaySecureEditText = this.f204697c;
            if (tenpaySecureEditText != null) {
                tenpaySecureEditText.setTextSize(this.f204696b);
            }
            if (this.f204699e == null) {
                this.f204699e = this.f204697c.findViewById(C0966R.C0970id.gyl);
            }
            View view = this.f204699e;
            if (view != null) {
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                view.setMinimumHeight(BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceBusiUI, remittanceBusiUI.f204625z1.f204696b));
            }
            if (this.f204700f == null) {
                this.f204700f = (RelativeLayout) RemittanceBusiUI.this.findViewById(C0966R.C0970id.lh9);
            }
            RelativeLayout relativeLayout = this.f204700f;
            if (relativeLayout != null) {
                ((LinearLayout.LayoutParams) relativeLayout.getLayoutParams()).topMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(RemittanceBusiUI.this, 8.0f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$ZeroCallBack */
    public class ZeroCallBack implements Runnable {

        /* renamed from: d */
        public C75279d f204702d;

        public ZeroCallBack() {
        }

        public void run() {
            C75278c<C42847n> cVar = RemittanceBusiUI.this.f204562Y1;
            C75279d dVar = this.f204702d;
            Log.m105925i("MicroMsg.IDelayQueryOrder", "doScene rtType %s", Integer.valueOf(cVar.f221416e));
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(cVar.f221416e, cVar);
            cVar.mo97352a(dVar);
        }
    }

    public RemittanceBusiUI() {
        C40008f fVar = C40008f.f107254d;
        this.f204567a2 = new IListener<BusiF2fPaySuccEvent>(fVar) {
            {
                this.__eventId = -1359897903;
            }

            public boolean callback(IEvent iEvent) {
                BusiF2fPaySuccEvent busiF2fPaySuccEvent = (BusiF2fPaySuccEvent) iEvent;
                if (!(busiF2fPaySuccEvent instanceof BusiF2fPaySuccEvent) || !busiF2fPaySuccEvent.f193493d.f193496c) {
                    return false;
                }
                RemittanceBusiUI.this.f204520H1 = false;
                Log.m105924i("MicroMsg.RemittanceBusiUI", "BusiF2fPaySuccEvent and isKindaScanQRCode");
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                remittanceBusiUI.f204510C1 = false;
                MMHandlerThread.postToMainThreadDelayed(remittanceBusiUI.f204556W1, 300);
                int i = RemittanceBusiUI.this.f204512D1;
                if (i == 3) {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "BusiF2fPaySuccEvent and isKindaScanQRCode and mRequestCode is REQUEST_CODE_PAY_DYNAMIC_CODE");
                    RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                    BusiF2fPaySuccEvent.C67663a aVar = busiF2fPaySuccEvent.f193493d;
                    RemittanceBusiUI.m83184K7(remittanceBusiUI2, aVar.f193497d == 1, aVar.f193495b, aVar.f193498e, aVar.f193494a, aVar.f193500g);
                    return true;
                } else if (i == 1) {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "BusiF2fPaySuccEvent and isKindaScanQRCode and mRequestCode is REQUEST_CODE_PAY");
                    RemittanceBusiUI remittanceBusiUI3 = RemittanceBusiUI.this;
                    BusiF2fPaySuccEvent.C67663a aVar2 = busiF2fPaySuccEvent.f193493d;
                    RemittanceBusiUI.m83184K7(remittanceBusiUI3, aVar2.f193497d == 1, aVar2.f193495b, aVar2.f193498e, aVar2.f193494a, aVar2.f193500g);
                    return true;
                } else if (i != 2) {
                    return true;
                } else {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "BusiF2fPaySuccEvent and isKindaScanQRCode and mRequestCode is REQUEST_CODE_ZERO_PAY");
                    return true;
                }
            }
        };
        this.f204569b2 = true;
        this.f204571c2 = 0;
        this.f204574d2 = 0.0d;
        this.f204580f2 = "";
        this.f204583g2 = new IListener<F2fDynamicStartPayEvent>(fVar) {
            {
                this.__eventId = -1113934945;
            }

            public boolean callback(IEvent iEvent) {
                String str;
                F2fDynamicStartPayEvent f2fDynamicStartPayEvent = (F2fDynamicStartPayEvent) iEvent;
                if (f2fDynamicStartPayEvent.f193584d.f193587c == 1) {
                    C115669n.INSTANCE.mo160131h(15386, 4, 2);
                } else {
                    C115669n.INSTANCE.mo160131h(15386, 5, 2);
                }
                F2fDynamicStartPayEvent.C67691a aVar = f2fDynamicStartPayEvent.f193584d;
                String str2 = aVar.f193585a;
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                remittanceBusiUI.f204518G1 = (RemittanceF2fDynamicCodeUI) aVar.f193588d;
                Log.m105925i("MicroMsg.RemittanceBusiUI", "do place order %s", str2);
                if (remittanceBusiUI.f204605q1 == null) {
                    Log.m105920e("MicroMsg.RemittanceBusiUI", "doPlaceOrder busi_resp is null");
                } else if (remittanceBusiUI.f204520H1) {
                    Log.m105920e("MicroMsg.RemittanceBusiUI", "is under payment, skip busif2fplaceorder");
                } else {
                    if (!remittanceBusiUI.f204549U0) {
                        remittanceBusiUI.hideWcKb();
                    }
                    if (!Util.isNullOrNil(remittanceBusiUI.f204548U)) {
                        C86709a0.m107528h();
                        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(remittanceBusiUI.f204548U);
                        if (N2 != null) {
                            str = N2.mo62898f();
                            remittanceBusiUI.mo97317Q7((int) Math.round(remittanceBusiUI.f204545T * 100.0d), remittanceBusiUI.f204607r1.f205297b, true, f2fDynamicStartPayEvent, str2, str, "");
                        } else {
                            Log.m105920e("MicroMsg.RemittanceBusiUI", "can not found contact for user::" + remittanceBusiUI.f204548U + "");
                        }
                    }
                    str = "";
                    remittanceBusiUI.mo97317Q7((int) Math.round(remittanceBusiUI.f204545T * 100.0d), remittanceBusiUI.f204607r1.f205297b, true, f2fDynamicStartPayEvent, str2, str, "");
                }
                return false;
            }
        };
        this.f204586h2 = new IListener<RemittanceBusiUIF2fDynamicActivityResultEvent>(fVar) {
            {
                this.__eventId = 1974892094;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceBusiUIF2fDynamicActivityResultEvent.C67775a aVar;
                RemittanceBusiUIF2fDynamicActivityResultEvent remittanceBusiUIF2fDynamicActivityResultEvent = (RemittanceBusiUIF2fDynamicActivityResultEvent) iEvent;
                if (!(remittanceBusiUIF2fDynamicActivityResultEvent == null || (aVar = remittanceBusiUIF2fDynamicActivityResultEvent.f193888d) == null)) {
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    boolean z = aVar.f193889a;
                    int i = aVar.f193890b;
                    remittanceBusiUI.f204569b2 = false;
                    if (z) {
                        Log.m105924i("MicroMsg.RemittanceBusiUI", "savePayInfo isOk = true");
                        remittanceBusiUI.f204571c2 = 1;
                    } else {
                        remittanceBusiUI.f204571c2 = i;
                        remittanceBusiUI.f204574d2 = remittanceBusiUI.f204545T;
                        remittanceBusiUI.f204577e2 = remittanceBusiUI.f204557X;
                        remittanceBusiUI.f204580f2 = remittanceBusiUI.f204555W0;
                    }
                    Log.m105925i("MicroMsg.RemittanceBusiUI", "savePayInfoByDynamic() mLastPayResult:%s mLastTotalAmt:%s mLastPayerDesc:%s mLastF2fId:%s", Double.valueOf(remittanceBusiUI.f204574d2), Double.valueOf(remittanceBusiUI.f204574d2), remittanceBusiUI.f204577e2, remittanceBusiUI.f204580f2);
                }
                return false;
            }
        };
        this.f204589i2 = new IListener<F2fDynamicResultEvent>(fVar) {
            {
                this.__eventId = -1015124600;
            }

            public boolean callback(IEvent iEvent) {
                F2fDynamicResultEvent f2fDynamicResultEvent = (F2fDynamicResultEvent) iEvent;
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                int i = RemittanceBusiUI.f204504l2;
                remittanceBusiUI.mo97332f8();
                return false;
            }
        };
        this.f204592j2 = new IListener<WalletRealNameResultNotifyEvent>(fVar) {
            {
                this.__eventId = 323604482;
            }

            public boolean callback(IEvent iEvent) {
                EditText editText;
                RemittanceBusiUI.this.f204592j2.dead();
                if (((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a != -1 || (editText = RemittanceBusiUI.this.mWcKeyboard.f220918y) == null) {
                    return false;
                }
                editText.dispatchKeyEvent(new KeyEvent(1, 66));
                return false;
            }
        };
        this.f204594k2 = new IListener<F2fLargeMoneyPayEvent>(fVar) {
            {
                this.__eventId = -1303135487;
            }

            public boolean callback(IEvent iEvent) {
                F2fLargeMoneyPayEvent f2fLargeMoneyPayEvent = (F2fLargeMoneyPayEvent) iEvent;
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                remittanceBusiUI.mo97325Y7(7, remittanceBusiUI.f204530M1);
                RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                int i = f2fLargeMoneyPayEvent.f193589d.f193591b;
                remittanceBusiUI2.getClass();
                RemittanceBusiUI remittanceBusiUI3 = RemittanceBusiUI.this;
                Log.m105925i("MicroMsg.RemittanceBusiUI", "do place order by large money remind ui mQrcodeId：%s，event.data.qrCode：%s", remittanceBusiUI3.f204542S, f2fLargeMoneyPayEvent.f193589d.f193593d);
                if (remittanceBusiUI3.f204605q1 == null) {
                    Log.m105920e("MicroMsg.RemittanceBusiUI", "doPlaceOrder busi_resp is null");
                } else {
                    if (!remittanceBusiUI3.f204549U0) {
                        remittanceBusiUI3.hideWcKb();
                    }
                    if (!remittanceBusiUI3.f204542S.equals(f2fLargeMoneyPayEvent.f193589d.f193593d)) {
                        Log.m105920e("MicroMsg.RemittanceBusiUI", "mQrcodeId != event.data.qrCode,return");
                    } else {
                        C77995sj sjVar = remittanceBusiUI3.f204607r1.f205297b;
                        F2fLargeMoneyPayEvent.C67692a aVar = f2fLargeMoneyPayEvent.f193589d;
                        remittanceBusiUI3.mo97317Q7(aVar.f193591b, sjVar, false, (F2fDynamicStartPayEvent) null, "", "", aVar.f193590a);
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m83181H7(RemittanceBusiUI remittanceBusiUI) {
        remittanceBusiUI.getClass();
        Log.m105924i("MicroMsg.RemittanceBusiUI", "do place order");
        if (remittanceBusiUI.f204605q1 == null) {
            Log.m105920e("MicroMsg.RemittanceBusiUI", "doPlaceOrder busi_resp is null");
            return;
        }
        if (!remittanceBusiUI.f204549U0) {
            remittanceBusiUI.hideWcKb();
        }
        if (remittanceBusiUI.f204598n1) {
            remittanceBusiUI.hideVKB();
            remittanceBusiUI.f204513E.clearFocus();
        }
        remittanceBusiUI.mo97317Q7((int) Math.round(remittanceBusiUI.f204545T * 100.0d), remittanceBusiUI.f204607r1.f205297b, false, (F2fDynamicStartPayEvent) null, "", "", "");
    }

    /* renamed from: I7 */
    public static void m83182I7(RemittanceBusiUI remittanceBusiUI) {
        List list;
        boolean z = true;
        if (remittanceBusiUI.f204539R == 33) {
            C77995sj sjVar = remittanceBusiUI.f204605q1.f204049n;
            list = sjVar != null ? sjVar.f228220d : null;
        } else {
            C77995sj sjVar2 = remittanceBusiUI.f204607r1.f205297b;
            if (sjVar2 != null) {
                list = sjVar2 != null ? sjVar2.f228220d : new LinkedList();
                if (list.size() == 0) {
                    Log.m105925i("MicroMsg.RemittanceBusiUI", "can not find favor %s", Integer.valueOf(list.size()));
                    return;
                }
            } else {
                list = remittanceBusiUI.f204605q1.f204048j;
            }
        }
        double T7 = remittanceBusiUI.mo97320T7();
        remittanceBusiUI.f204545T = T7;
        if (((int) Math.round(T7 * 100.0d)) <= 0) {
            remittanceBusiUI.mo97328b8(list);
            return;
        }
        if (remittanceBusiUI.f204607r1.f205297b == null) {
            z = false;
        }
        if (z) {
            C70590i iVar = remittanceBusiUI.f204620x1;
            if (iVar == null) {
                remittanceBusiUI.mo97328b8(list);
            } else if (iVar.f204124j) {
                remittanceBusiUI.mo97328b8(list);
            } else {
                iVar.f204122h = new C70582d() {
                    /* renamed from: a */
                    public void mo97246a(List<C77912ce0> list) {
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        int i = RemittanceBusiUI.f204504l2;
                        remittanceBusiUI.mo97328b8(list);
                    }
                };
            }
        } else {
            remittanceBusiUI.mo97331e8(new C70582d() {
                /* renamed from: a */
                public void mo97246a(List<C77912ce0> list) {
                    if (list.size() > 0) {
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        int i = RemittanceBusiUI.f204504l2;
                        remittanceBusiUI.mo97328b8(list);
                    }
                }
            }, new C70583e() {
                /* renamed from: a */
                public void mo97345a(int i, int i2, C70590i iVar) {
                    if (i != 0 || i2 != 0) {
                        C76912y0.makeText((Context) RemittanceBusiUI.this.getContext(), (CharSequence) RemittanceBusiUI.this.getString(C0966R.string.krp), 0).show();
                    } else if (iVar.f204120f.f228302d != 0) {
                        C76912y0.makeText((Context) RemittanceBusiUI.this.getContext(), (CharSequence) iVar.f204120f.f228303e, 0).show();
                    }
                }
            }, 0);
        }
    }

    /* renamed from: J7 */
    public static void m83183J7(RemittanceBusiUI remittanceBusiUI) {
        remittanceBusiUI.getClass();
        ITransmitKvData create = ITransmitKvData.create();
        C77927fb0 b = remittanceBusiUI.f204609s1.mo97543b();
        try {
            boolean z = true;
            if (remittanceBusiUI.f204609s1.mo97543b().f227354f.size() <= 1) {
                z = false;
            }
            if (z) {
                create.putBinary("extra_buy_info_data", b.toByteArray());
            } else {
                create.putBinary("extra_buy_detail_info_data", b.f227354f.getFirst().toByteArray());
                create.putString("extra_buy_detail_title", b.f227353e);
            }
            ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("F2FPayExtraBuyUseCase", create, new UseCaseCallback() {
                public void call(ITransmitKvData iTransmitKvData) {
                    ArrayList<Long> longList = iTransmitKvData.getLongList("selected_items_id_list");
                    C70873b bVar = RemittanceBusiUI.this.f204609s1;
                    bVar.getClass();
                    Log.m105925i("MicroMsg.ExtraBuyInfoHelper", "set %s selected", TextUtils.join(", ", longList));
                    C77927fb0 fb02 = bVar.f205280b;
                    if (fb02 != null) {
                        Iterator<C77920eb0> it = fb02.f227354f.iterator();
                        while (it.hasNext()) {
                            C77920eb0 next = it.next();
                            next.f227249o = longList.contains(Long.valueOf(next.f227241d));
                        }
                    }
                    C77927fb0 fb03 = bVar.f205281c;
                    if (fb03 != null) {
                        Iterator<C77920eb0> it4 = fb03.f227354f.iterator();
                        while (it4.hasNext()) {
                            C77920eb0 next2 = it4.next();
                            next2.f227249o = longList.contains(Long.valueOf(next2.f227241d));
                        }
                    }
                    RemittanceBusiUI.this.mo97331e8((C70582d) null, (C70583e) null, 0);
                }
            });
        } catch (IOException e) {
            Log.m105920e("MicroMsg.RemittanceBusiUI", "failed set extra buy info data: " + e.getLocalizedMessage());
        }
    }

    /* renamed from: K7 */
    public static void m83184K7(RemittanceBusiUI remittanceBusiUI, boolean z, String str, double d, String str2, int i) {
        if (z) {
            if (Util.isNullOrNil(remittanceBusiUI.f204558X0)) {
                remittanceBusiUI.f204558X0 = str;
            }
            if (d >= 0.0d) {
                remittanceBusiUI.f204617w1 = d;
            }
            if (remittanceBusiUI.f204508B1) {
                C115669n.INSTANCE.mo160131h(15386, 3, 2);
            }
            Log.m105925i("MicroMsg.RemittanceBusiUI", "onBusiF2fPaySucc successAction：%s", Integer.valueOf(i));
            if (i == 1) {
                remittanceBusiUI.mo97318R7(str2);
            } else if (i != 2) {
                remittanceBusiUI.mo97321U7();
                remittanceBusiUI.mo97318R7(str2);
            } else {
                C70887f0.m83406d();
                if (C70887f0.C70888a.f205300a.mo97556b()) {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "finish finishRemitF2fDCodeAndLMRemindUI");
                } else if (remittanceBusiUI.f204518G1 != null) {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "force finish remittanceF2fDynamicCodeUI");
                    remittanceBusiUI.f204518G1.finish();
                }
                C119179t tVar = C119157j.f356862d;
                C7068137 r6 = new Runnable() {
                    public void run() {
                        Log.m105924i("MicroMsg.RemittanceBusiUI", "click kinda finish button");
                        RemittanceBusiUI.this.finish();
                    }
                };
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(r6, 100, false);
            }
        } else {
            remittanceBusiUI.getClass();
            Log.m105924i("MicroMsg.RemittanceBusiUI", "do NetSceneBusiF2fUnlockFavor");
            remittanceBusiUI.mo97332f8();
        }
    }

    /* renamed from: L7 */
    public static void m83185L7(RemittanceBusiUI remittanceBusiUI) {
        remittanceBusiUI.getClass();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
        intent.addFlags(67108864);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(remittanceBusiUI, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "finishRemitProcess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        remittanceBusiUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(remittanceBusiUI, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "finishRemitProcess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: M7 */
    public static void m83186M7(RemittanceBusiUI remittanceBusiUI) {
        if (!remittanceBusiUI.f204549U0) {
            remittanceBusiUI.showCircleStWcKb();
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(15235, 6);
        if (remittanceBusiUI.f204563Z == 56) {
            nVar.mo160131h(19821, 6, remittanceBusiUI.f204532N1, 0);
        }
        remittanceBusiUI.f204624z.clearFocus();
        String str = "";
        if (remittanceBusiUI.f204603p1 == null) {
            remittanceBusiUI.f204603p1 = new RemittanceRemarkInputHalfPage(remittanceBusiUI, 60, str, RemittanceRemarkInputHalfPage.C70828b.RemittanceBusi);
        }
        RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = remittanceBusiUI.f204603p1;
        String string = remittanceBusiUI.getContext().getString(C0966R.string.hzp);
        remittanceRemarkInputHalfPage.getClass();
        C87412m.m108594g(string, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        remittanceRemarkInputHalfPage.f205120n = string;
        if (!Util.isNullOrNil(remittanceBusiUI.f204600o1)) {
            str = remittanceBusiUI.f204600o1;
        }
        remittanceBusiUI.f204603p1.mo97491a(remittanceBusiUI.f204557X, str, new RemittanceRemarkInputHalfPage.C70829c() {
            public void onResult(boolean z, String str, String str2) {
                if (!z) {
                    if (!Util.isNullOrNil(str)) {
                        RemittanceBusiUI.this.f204557X = str;
                    } else {
                        RemittanceBusiUI.this.f204557X = "";
                    }
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    int i = RemittanceBusiUI.f204504l2;
                    remittanceBusiUI.mo97333g8();
                }
                RemittanceBusiUI.this.f204624z.mo105095m();
                RemittanceBusiUI.this.showNormalStWcKb();
            }
        });
    }

    /* renamed from: N7 */
    public final void mo97314N7(String str) {
        C70883e eVar = this.f204607r1;
        eVar.getClass();
        Log.m105924i("MicroMsg.FavorInfoPicked", "cleanBusiF2FFavor");
        eVar.f205297b = null;
        eVar.f205296a = null;
        this.f204599o.setTextColor(getContext().getResources().getColor(C0966R.color.f3563xt));
        this.f204599o.setText(str);
        if (this.f204609s1.mo97545d()) {
            C70873b bVar = this.f204609s1;
            if (bVar.f205280b != null) {
                Log.m105924i("MicroMsg.ExtraBuyInfoHelper", "clear response info");
                bVar.f205281c = null;
                Iterator<C77920eb0> it = bVar.f205280b.f227354f.iterator();
                while (it.hasNext()) {
                    it.next().f227249o = false;
                }
            }
            mo97334i8();
        }
    }

    /* renamed from: O7 */
    public final C77925f4 mo97315O7(int i) {
        C77925f4 f4Var = new C77925f4();
        f4Var.f227324f = this.f204563Z;
        f4Var.f227322d = this.f204555W0;
        f4Var.f227323e = this.f204558X0;
        f4Var.f227325g = this.f204605q1.f204045g;
        f4Var.f227326h = this.f204539R;
        f4Var.f227327i = this.f204561Y0;
        f4Var.f227328j = this.f204607r1.f205296a;
        f4Var.f227329n = this.f204548U;
        f4Var.f227330o = this.f204566a1;
        f4Var.f227331p = i;
        if (this.f204609s1.mo97545d()) {
            f4Var.f227332q = this.f204609s1.mo97543b().f227354f;
        }
        return f4Var;
    }

    /* renamed from: P7 */
    public final void mo97316P7(boolean z, String str) {
        Log.m105925i("MicroMsg.RemittanceBusiUI", "doBusiZeroCallback %s", Boolean.valueOf(z));
        C77925f4 f4Var = (C77925f4) ((HashMap) this.f204516F1).get(str);
        if (f4Var != null) {
            C42847n nVar = new C42847n(this.f204576e1, f4Var, this.f204573d1, z ? 1 : 0, this.f204579f1, str);
            if (z) {
                nVar.f116036h = true;
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(nVar);
                return;
            }
            this.f204591j1 = 0;
            doSceneForceProgress(nVar);
        }
    }

    /* renamed from: Q7 */
    public final void mo97317Q7(int i, C77995sj sjVar, boolean z, F2fDynamicStartPayEvent f2fDynamicStartPayEvent, String str, String str2, String str3) {
        boolean z2;
        if (!this.f204569b2) {
            z2 = !Util.isEqual((Object) Double.valueOf(this.f204574d2), (Object) Double.valueOf(this.f204545T));
            if (!Util.isEqual(this.f204577e2, this.f204557X)) {
                z2 |= true;
            }
        } else {
            z2 = false;
        }
        int c = ((int) this.f204609s1.mo97544c()) + i;
        C70604k.C70605a aVar = new C70604k.C70605a();
        aVar.f204245a = this.f204566a1;
        aVar.f204246b = this.f204542S;
        aVar.f204247c = this.f204539R;
        aVar.f204248d = this.f204554W;
        aVar.f204249e = this.f204557X;
        aVar.f204250f = c;
        aVar.f204251g = this.f204563Z;
        aVar.f204252h = this.f204602p0;
        aVar.f204253i = this.f204564Z0;
        aVar.f204254j = this.f204570c1;
        aVar.f204255k = this.f204568b1;
        aVar.f204256l = this.f204548U;
        aVar.f204257m = this.f204607r1.f205296a;
        aVar.f204258n = sjVar == null ? "" : sjVar.f228223g;
        BusiRemittanceResp busiRemittanceResp = this.f204605q1;
        aVar.f204259o = busiRemittanceResp.f204045g;
        aVar.f204260p = str;
        aVar.f204261q = this.f204622y0;
        aVar.f204262r = str2;
        aVar.f204263s = this.f204551V;
        aVar.f204264t = this.f204580f2;
        aVar.f204265u = this.f204571c2;
        aVar.f204266v = z2 ? 1 : 0;
        aVar.f204267w = str3;
        aVar.f204270z = i;
        aVar.f204240A = this.f204540R0;
        Boolean bool = busiRemittanceResp.f204059x;
        aVar.f204242C = bool;
        aVar.f204244E = this.f204560Y;
        if (bool.booleanValue()) {
            aVar.f204243D = Boolean.valueOf(C75273a.m90293e(MMApplicationContext.getContext()));
        }
        if (this.f204609s1.mo97545d()) {
            aVar.f204241B = this.f204609s1.mo97543b().f227354f;
        }
        C70604k kVar = new C70604k(aVar);
        if (z) {
            kVar.f204238h = f2fDynamicStartPayEvent;
            ((C78013xj) kVar.f204234d.f127055a.f127080a).f228431E = f2fDynamicStartPayEvent.f193584d.f193587c == 1 ? 1 : 0;
        }
        if (this.mKindaEnable) {
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f204518G1;
            if (remittanceF2fDynamicCodeUI != null) {
                remittanceF2fDynamicCodeUI.showSafeProgress();
            } else {
                showLoading();
            }
            doSceneProgress(kVar, false);
        } else {
            C70887f0.m83406d();
            doSceneProgress(kVar, !C70887f0.C70888a.f205300a.mo97560g());
        }
        if (this.f204522I1) {
            if (c == this.f204524J1) {
                mo97325Y7(5, this.f204530M1);
            } else {
                mo97325Y7(4, this.f204530M1);
            }
        }
        C70887f0.m83406d();
        C70887f0 f0Var = C70887f0.C70888a.f205300a;
        if (f0Var.mo97557c() != null) {
            C70887f0.m83406d();
            if (f0Var.mo97557c() instanceof RemittanceBusiUI) {
                if (this.f204526K1) {
                    if (c == this.f204528L1) {
                        mo97325Y7(13, this.f204530M1);
                    } else {
                        mo97325Y7(12, this.f204530M1);
                    }
                }
                this.f204528L1 = c;
            }
        }
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        ScrollView scrollView = this.f204536Q;
        if (scrollView != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) scrollView.getLayoutParams();
            layoutParams.bottomMargin = (int) f;
            Log.m105919d("MicroMsg.RemittanceBusiUI", "onUpdateWcPayKeyboardHeight() height: %s rootView.height: %s", Float.valueOf(f), Integer.valueOf(layoutParams.height));
            this.f204536Q.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: R7 */
    public final void mo97318R7(String str) {
        Log.m105925i("MicroMsg.RemittanceBusiUI", "do pay check: %s", str);
        C77925f4 f4Var = (C77925f4) ((HashMap) this.f204516F1).get(str);
        if (f4Var != null) {
            if (!Util.isNullOrNil(this.f204558X0)) {
                f4Var.f227323e = this.f204558X0;
            }
            doSceneProgress(new C42843j(f4Var, this.f204611t1), false);
        }
    }

    /* renamed from: S7 */
    public final long mo97319S7() {
        return Math.round(mo97320T7() * 100.0d) + this.f204609s1.mo97544c();
    }

    /* renamed from: T7 */
    public final double mo97320T7() {
        if (this.f204549U0 || this.f204539R == 33) {
            return this.f204545T;
        }
        double d = Util.getDouble(this.f204624z.getText(), 0.0d);
        this.f204545T = d;
        return d;
    }

    /* renamed from: U7 */
    public final void mo97321U7() {
        Log.m105924i("MicroMsg.RemittanceBusiUI", "goto busi result");
        Intent intent = new Intent(this, RemittanceBusiResultUI.class);
        intent.putExtra("key_pay_desc", this.f204557X);
        intent.putExtra("key_rcv_desc", this.f204554W);
        BusiRemittanceResp busiRemittanceResp = this.f204605q1;
        if (busiRemittanceResp != null) {
            intent.putExtra("BusiRemittanceResp", busiRemittanceResp);
        }
        intent.putExtra("key_mch_name", this.f204622y0);
        intent.putExtra("key_rcver_name", this.f204548U);
        intent.putExtra("key_rcver_true_name", this.f204551V);
        double d = this.f204617w1;
        if (d >= 0.0d) {
            intent.putExtra("key_money", d);
        } else {
            intent.putExtra("key_money", this.f204545T);
        }
        intent.putExtra("key_f2f_id", this.f204555W0);
        intent.putExtra("key_trans_id", this.f204558X0);
        intent.putExtra("key_check_sign", this.f204561Y0);
        intent.putExtra("key_rcvr_open_id", this.f204566a1);
        intent.putExtra("key_channel", this.f204563Z);
        intent.putExtra("key_succ_fault_config", this.f204593k1);
        BusiRemittanceResp busiRemittanceResp2 = this.f204605q1;
        if (busiRemittanceResp2 != null) {
            intent.putExtra("key_succ_show_avatar_type", busiRemittanceResp2.f204052q);
            intent.putExtra("key_succ_show_avatar_show", this.f204605q1.f204042d);
            intent.putExtra("key_succ_show_avatar_url", this.f204605q1.f204043e);
        }
        BusiRemittanceResp busiRemittanceResp3 = this.f204605q1;
        if (busiRemittanceResp3 != null) {
            intent.putExtra("key_scan_sceen", busiRemittanceResp3.f204045g);
        }
        intent.putExtra("key_succ_page_extend", this.f204613u1);
        if (this.f204563Z == 56) {
            intent.putExtra("app_id", this.f204532N1);
        }
        this.f204607r1.getClass();
        try {
            intent.putExtra("AfterPlaceOrderCommReq", mo97315O7((int) Math.round(this.f204545T * 100.0d)).toByteArray());
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.RemittanceBusiUI", e, "", new Object[0]);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "gotoBusiResultUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "gotoBusiResultUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        C70887f0.m83406d();
        if (C70887f0.C70888a.f205300a.mo97556b()) {
            Log.m105928w("MicroMsg.RemittanceBusiUI", "finish finishRemitF2fDCodeAndLMRemindUI");
        }
    }

    /* renamed from: V7 */
    public final void mo97322V7() {
        hideLoading();
        RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f204518G1;
        if (remittanceF2fDynamicCodeUI != null) {
            remittanceF2fDynamicCodeUI.hideProgress();
        }
    }

    /* renamed from: W7 */
    public final void mo97323W7(boolean z, Intent intent) {
        if (z) {
            String stringExtra = intent.getStringExtra("key_trans_id");
            double doubleExtra = intent.getDoubleExtra("key_total_fee", -1.0d);
            String stringExtra2 = intent.getStringExtra("key_reqKey");
            Log.m105925i("MicroMsg.RemittanceBusiUI", "onActivityResult _transId: %s _totalFee: %s", stringExtra, Double.valueOf(doubleExtra));
            if (Util.isNullOrNil(this.f204558X0)) {
                this.f204558X0 = stringExtra;
            }
            if (doubleExtra >= 0.0d) {
                this.f204617w1 = doubleExtra;
            }
            if (this.f204508B1) {
                C115669n.INSTANCE.mo160131h(15386, 3, 2);
            }
            mo97321U7();
            mo97318R7(stringExtra2);
        } else if (C75157y0.m90140c(intent)) {
            finish();
            return;
        } else if (!C75157y0.m90141d(intent)) {
            Log.m105924i("MicroMsg.RemittanceBusiUI", "do NetSceneBusiF2fUnlockFavor");
            mo97332f8();
        } else {
            return;
        }
        this.f204569b2 = false;
        if (z) {
            Log.m105924i("MicroMsg.RemittanceBusiUI", "savePayInfo isOk = true");
            this.f204571c2 = 1;
        } else if (intent != null) {
            this.f204571c2 = intent.getIntExtra("key_pay_reslut_type", 3);
            this.f204574d2 = this.f204545T;
            this.f204577e2 = this.f204557X;
            this.f204580f2 = this.f204555W0;
        } else {
            return;
        }
        Log.m105925i("MicroMsg.RemittanceBusiUI", "savePayInfo() mLastPayResult:%s mLastTotalAmt:%s mLastPayerDesc:%s mLastF2fId:%s", Double.valueOf(this.f204574d2), Double.valueOf(this.f204574d2), this.f204577e2, this.f204580f2);
    }

    /* renamed from: X7 */
    public final void mo97324X7(int i, int i2, String str) {
        WCPayLargeAmountTransferReportStruct wCPayLargeAmountTransferReportStruct = new WCPayLargeAmountTransferReportStruct();
        this.f204623y1 = wCPayLargeAmountTransferReportStruct;
        wCPayLargeAmountTransferReportStruct.f194676d = (long) i;
        wCPayLargeAmountTransferReportStruct.f194677e = (long) i2;
        wCPayLargeAmountTransferReportStruct.f194678f = wCPayLargeAmountTransferReportStruct.mo86045b("OrderId", str, true);
        this.f204623y1.mo86054n();
    }

    /* renamed from: Y7 */
    public void mo97325Y7(int i, C70604k kVar) {
        F2FMoneyRemindStruct f2FMoneyRemindStruct = new F2FMoneyRemindStruct();
        f2FMoneyRemindStruct.f194204d = i;
        if (kVar != null) {
            f2FMoneyRemindStruct.f194205e = f2FMoneyRemindStruct.mo86045b("F2FId", kVar.f204235e.f228602i, true);
            f2FMoneyRemindStruct.f194206f = f2FMoneyRemindStruct.mo86045b("QrCodeId", this.f204542S, true);
            f2FMoneyRemindStruct.f194207g = kVar.f204239i;
        }
        f2FMoneyRemindStruct.mo86054n();
    }

    /* renamed from: Z7 */
    public final void mo97326Z7(int i) {
        TextView textView = this.f204549U0 ? this.f204578f : this.f204550U1;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.topMargin = C76577a.m92151b(getContext(), i);
        textView.setLayoutParams(layoutParams);
    }

    /* renamed from: a8 */
    public final boolean mo97327a8(final C70604k kVar) {
        boolean z;
        boolean z2 = true;
        if (this.f204552V0 || Util.isNullOrNil(kVar.f204235e.f228600g)) {
            z = false;
        } else {
            this.f204552V0 = true;
            mo97324X7(1, 1, kVar.f204235e.f228602i);
            C70887f0.m83406d();
            C70887f0.C70888a.f205300a.mo97558e(kVar.f204235e.f228600g, getString(C0966R.string.a2d), getString(C0966R.string.hzr), getString(C0966R.string.f7926wf), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    String str = kVar.f204235e.f228602i;
                    int i2 = RemittanceBusiUI.f204504l2;
                    remittanceBusiUI.mo97324X7(1, 3, str);
                    if (!RemittanceBusiUI.this.mo97327a8(kVar)) {
                        RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                        if (remittanceBusiUI2.mKindaEnable) {
                            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = remittanceBusiUI2.f204518G1;
                            if (remittanceF2fDynamicCodeUI != null) {
                                remittanceF2fDynamicCodeUI.showSafeProgress();
                            } else {
                                remittanceBusiUI2.showLoading();
                            }
                        }
                        RemittanceBusiUI.this.mo97329c8(kVar);
                        return;
                    }
                    RemittanceBusiUI.this.mo97332f8();
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    int i2 = RemittanceBusiUI.f204504l2;
                    remittanceBusiUI.mo97332f8();
                    RemittanceBusiUI.this.mo97324X7(1, 2, kVar.f204235e.f228602i);
                }
            });
            z = true;
        }
        if (z) {
            return z;
        }
        if (kVar.f204235e.f228601h != null) {
            C70887f0.m83406d();
            C70887f0 f0Var = C70887f0.C70888a.f205300a;
            C78018yj yjVar = kVar.f204235e;
            String str = yjVar.f228598e;
            b54 b54 = yjVar.f228601h;
            f0Var.mo97558e(str, "", b54.f130958e, b54.f130957d, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m105925i("MicroMsg.RemittanceBusiUI", "goto h5: %s", kVar.f204235e.f228601h.f130959f);
                    C75228t.m90219L(RemittanceBusiUI.this.getContext(), kVar.f204235e.f228601h.f130959f, false);
                }
            }, new DialogInterface.OnClickListener(this) {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
        } else {
            z2 = false;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r7 = r7.f228220d;
     */
    /* renamed from: b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97328b8(java.util.List<te3.C77912ce0> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.tencent.mm.ui.widget.picker.r r2 = new com.tencent.mm.ui.widget.picker.r
            r2.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.tencent.mm.plugin.remittance.ui.e r4 = r0.f204607r1
            te3.be0 r4 = r4.f205296a
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            com.tencent.mm.plugin.remittance.ui.e r7 = r0.f204607r1
            te3.sj r7 = r7.f205297b
            r8 = 0
            if (r7 == 0) goto L_0x002f
            java.util.LinkedList<te3.ce0> r7 = r7.f228220d
            if (r7 == 0) goto L_0x002f
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = 0
        L_0x0030:
            if (r7 != 0) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            if (r4 == 0) goto L_0x0051
            java.util.LinkedList<te3.ce0> r4 = r4.f226996e
            java.util.Iterator r4 = r4.iterator()
        L_0x003b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0051
            java.lang.Object r7 = r4.next()
            te3.ce0 r7 = (te3.C77912ce0) r7
            long r9 = r7.f227121h
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r5.add(r7)
            goto L_0x003b
        L_0x0051:
            java.util.Iterator r4 = r18.iterator()
            r7 = 0
        L_0x0056:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0078
            java.lang.Object r9 = r4.next()
            te3.ce0 r9 = (te3.C77912ce0) r9
            long r9 = r9.f227121h
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L_0x0075
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r3.add(r9)
        L_0x0075:
            int r7 = r7 + 1
            goto L_0x0056
        L_0x0078:
            r4 = 2131834750(0x7f11377e, float:1.930262E38)
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L_0x00d0
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x00d0
            android.view.View r5 = r2.f220690e
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.mo10233c(r9)
            java.lang.Object[] r10 = r7.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/widget/picker/MultiPicker"
            java.lang.String r12 = "setTextTitle"
            java.lang.String r13 = "(Ljava/lang/CharSequence;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/ui/widget/picker/MultiPicker"
            java.lang.String r11 = "setTextTitle"
            java.lang.String r12 = "(Ljava/lang/CharSequence;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.widget.TextView r5 = r2.f220691f
            r5.setText(r4)
        L_0x00d0:
            r2.f220698m = r3
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$26 r3 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$26
            r3.<init>(r1, r6)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$27 r4 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$27
            r4.<init>(r6, r1, r2)
            r2.f220696k = r4
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$28 r1 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$28
            r1.<init>()
            r2.f220700o = r1
            nj3.e0 r1 = r2.f220697l
            r3.onCreateMMMenu(r1)
            com.tencent.mm.ui.widget.picker.r$a r1 = new com.tencent.mm.ui.widget.picker.r$a
            android.content.Context r3 = r2.f220688c
            r1.<init>(r3)
            r2.f220699n = r1
            java.util.ArrayList<java.lang.Integer> r3 = r2.f220698m
            if (r3 != 0) goto L_0x00f8
            goto L_0x0126
        L_0x00f8:
            int r3 = r1.getCount()
            if (r8 >= r3) goto L_0x0126
            com.tencent.mm.ui.widget.picker.r r3 = com.tencent.p014mm.p136ui.widget.picker.C75005r.this
            java.util.ArrayList<java.lang.Integer> r3 = r3.f220698m
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0118
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r3 = r1.f220702e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.put(r4, r5)
            goto L_0x0123
        L_0x0118:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r3 = r1.f220702e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.put(r4, r5)
        L_0x0123:
            int r8 = r8 + 1
            goto L_0x00f8
        L_0x0126:
            android.widget.ListView r1 = r2.f220689d
            com.tencent.mm.ui.widget.picker.r$a r3 = r2.f220699n
            r1.setAdapter(r3)
            android.widget.Button r1 = r2.f220692g
            com.tencent.mm.ui.widget.picker.p r3 = new com.tencent.mm.ui.widget.picker.p
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            android.widget.Button r1 = r2.f220693h
            com.tencent.mm.ui.widget.picker.q r3 = new com.tencent.mm.ui.widget.picker.q
            r3.<init>(r2)
            r1.setOnClickListener(r3)
            com.google.android.material.bottomsheet.a r1 = r2.f220686a
            if (r1 == 0) goto L_0x0166
            nj3.e0 r1 = r2.f220697l
            if (r1 == 0) goto L_0x0161
            int r1 = r1.size()
            r3 = 3
            if (r1 <= r3) goto L_0x0161
            android.view.View r1 = r2.f220687b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r3 = r2.f220694i
            r1.height = r3
            android.view.View r3 = r2.f220687b
            r3.setLayoutParams(r1)
        L_0x0161:
            com.google.android.material.bottomsheet.a r1 = r2.f220686a
            r1.show()
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.mo97328b8(java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x043e  */
    /* renamed from: c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97329c8(com.tencent.p014mm.plugin.remittance.model.C70604k r24) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            java.lang.Class<ie3.c> r1 = ie3.C76324c.class
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            te3.yj r5 = r0.f204235e
            int r5 = r5.f228609s
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.RemittanceBusiUI"
            java.lang.String r7 = "do start pay zero_pay_flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r4 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            java.lang.String r7 = "MicroMsg.RemittanceBusiDialogMgr"
            java.lang.String r9 = "finishRemitLMRemindUI()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            java.lang.ref.WeakReference<android.content.Context> r4 = r4.f205299a
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            if (r4 != 0) goto L_0x003a
            java.lang.String r4 = "getContext() == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
        L_0x0038:
            r4 = 0
            goto L_0x0049
        L_0x003a:
            boolean r9 = r4 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fLargeMoneyUI
            if (r9 == 0) goto L_0x0038
            java.lang.String r9 = "check() is RemittanceF2fLargeMoneyUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r9)
            android.app.Activity r4 = (android.app.Activity) r4
            r4.finish()
            r4 = 1
        L_0x0049:
            if (r4 == 0) goto L_0x0050
            java.lang.String r4 = "finish finishRemitLMRemindUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r4)
        L_0x0050:
            int r4 = r0.f204239i
            te3.f4 r4 = r8.mo97315O7(r4)
            java.util.Map<java.lang.String, te3.f4> r7 = r8.f204516F1
            te3.yj r9 = r0.f204235e
            java.lang.String r9 = r9.f228599f
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r9, r4)
            te3.yj r4 = r0.f204235e
            int r7 = r4.f228609s
            java.lang.String r9 = "can not found contact for user::"
            r10 = 2131839577(0x7f114a59, float:1.931241E38)
            java.lang.String r11 = "remittance"
            java.lang.String r12 = ")"
            java.lang.String r13 = "("
            r14 = 2
            java.lang.String r15 = ""
            if (r7 != r3) goto L_0x0188
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r1 = r4.f228610t
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "resp.payer_need_auth_flag %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            int r0 = r4.f228610t
            if (r0 != r3) goto L_0x00b7
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.tencent.mm.sdk.event.IListener r1 = r8.f204592j2
            r1.alive()
            java.lang.String r1 = "realname_verify_process_jump_activity"
            java.lang.String r2 = ".ui.RemittanceBusiUI"
            r0.putString(r1, r2)
            java.lang.String r1 = "realname_verify_process_jump_plugin"
            r0.putString(r1, r11)
            java.lang.String r1 = "real_name_verify_mode"
            r0.putInt(r1, r6)
            int r1 = r8.f204539R
            java.lang.String r2 = "entry_scene"
            r0.putInt(r2, r1)
            java.lang.Class<com.tencent.mm.plugin.wallet_core.id_verify.RealNameVerifyProcess> r1 = com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess.class
            r2 = 0
            yq3.C79143a.m95771j(r8, r1, r0, r2)
            goto L_0x0187
        L_0x00b7:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = r8.f204596m1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00c8
            java.lang.String r1 = r8.f204596m1
            goto L_0x0146
        L_0x00c8:
            java.lang.String r1 = r8.getString(r10)
            java.lang.String r7 = r8.f204548U
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x013f
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r7 = r8.f204548U
            com.tencent.mm.storage.z1 r2 = r2.mo69664N2(r7)
            if (r2 == 0) goto L_0x0127
            java.lang.String r2 = r2.mo62898f()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r2)
            r7.append(r2)
            java.lang.String r2 = r8.f204551V
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0105
            r2 = r15
            goto L_0x0119
        L_0x0105:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            java.lang.String r9 = r8.f204551V
            r2.append(r9)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
        L_0x0119:
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r3[r6] = r2
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r1, r3)
            goto L_0x0146
        L_0x0127:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r2 = r8.f204548U
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x0145
        L_0x013f:
            java.lang.String r1 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
        L_0x0145:
            r1 = r15
        L_0x0146:
            com.tencent.mm.plugin.remittance.ui.e r2 = r8.f204607r1
            r2.getClass()
            java.lang.String r2 = "INTENT_TITLE"
            r0.putExtra(r2, r1)
            int r1 = r8.f204582g1
            java.lang.String r2 = "INTENT_CAN_TOUCH"
            r0.putExtra(r2, r1)
            r1 = 0
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r1)
            java.lang.String r2 = "INTENT_PAYFEE"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r4.f228599f
            java.lang.String r2 = "INTENT_REQKEY"
            r0.putExtra(r2, r1)
            te3.eh4 r1 = r4.f228611u
            java.lang.String r2 = "INTENT_TOKENMESS"
            byte[] r1 = r1.toByteArray()     // Catch:{ Exception -> 0x0181 }
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x0181 }
            androidx.appcompat.app.AppCompatActivity r1 = r23.getContext()     // Catch:{ Exception -> 0x0181 }
            java.lang.String r2 = "wallet"
            java.lang.String r3 = "com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI"
            ke3.C88144b.m109795m(r1, r2, r3, r0, r14)     // Catch:{ Exception -> 0x0181 }
            goto L_0x0187
        L_0x0181:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r15, r1)
        L_0x0187:
            return
        L_0x0188:
            com.tencent.mm.pluginsdk.wallet.PayInfo r4 = new com.tencent.mm.pluginsdk.wallet.PayInfo
            r4.<init>()
            te3.yj r7 = r0.f204235e
            java.lang.String r10 = r7.f228599f
            r4.f212592j = r10
            int r10 = r8.f204539R
            r4.f212587e = r10
            int r10 = r8.f204563Z
            if (r10 <= 0) goto L_0x019d
            r4.f212589g = r10
        L_0x019d:
            pe3.b r7 = r7.f228616z
            if (r7 == 0) goto L_0x01a7
            java.lang.String r7 = r7.mo123705h()
            r4.f212604y = r7
        L_0x01a7:
            te3.yj r7 = r0.f204235e
            int r10 = r7.f228615y
            r4.f212603x = r10
            int r7 = r7.f228585A
            if (r7 != r3) goto L_0x01b3
            r7 = 1
            goto L_0x01b4
        L_0x01b3:
            r7 = 0
        L_0x01b4:
            r4.f212605z = r7
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r10 = r8.f204548U
            java.lang.String r6 = "extinfo_key_1"
            r7.putString(r6, r10)
            java.lang.String r6 = r8.f204551V
            java.lang.String r10 = "extinfo_key_2"
            r7.putString(r10, r6)
            java.lang.String r6 = r8.f204554W
            java.lang.String r10 = "extinfo_key_3"
            r7.putString(r10, r6)
            android.content.Intent r6 = r23.getIntent()
            java.lang.String r10 = "receiver_tips"
            java.lang.String r6 = r6.getStringExtra(r10)
            java.lang.String r14 = "extinfo_key_5"
            r7.putString(r14, r6)
            java.lang.String r6 = r8.f204557X
            java.lang.String r14 = "extinfo_key_7"
            r7.putString(r14, r6)
            te3.yj r6 = r0.f204235e
            java.lang.String r6 = r6.f228590F
            java.lang.String r14 = "extinfo_key_19"
            r7.putString(r14, r6)
            r4.f212600u = r7
            r4.f212581L = r3
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            te3.yj r14 = r0.f204235e
            r19 = r1
            int r1 = r14.f228586B
            r20 = r5
            r5 = 3
            if (r1 != r3) goto L_0x02b6
            int r1 = r14.f228589E
            java.lang.String r2 = "extinfo_key_15"
            r7.putInt(r2, r1)
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228587C
            java.lang.String r2 = "extinfo_key_17"
            r7.putString(r2, r1)
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228588D
            java.lang.String r2 = "extinfo_key_18"
            r7.putString(r2, r1)
            java.lang.String r1 = "key_pay_info"
            r6.putExtra(r1, r4)
            java.lang.String r1 = "from_patch_ui"
            r6.putExtra(r1, r3)
            java.lang.String r1 = r8.f204566a1
            java.lang.String r2 = "key_rcvr_open_id"
            r6.putExtra(r2, r1)
            java.lang.String r1 = r8.f204537Q0
            java.lang.String r2 = "key_mch_info"
            r6.putExtra(r2, r1)
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r1 = r8.f204605q1
            java.lang.String r1 = r1.f204043e
            java.lang.String r2 = "key_mch_photo"
            r6.putExtra(r2, r1)
            java.lang.String r1 = r8.f204542S
            java.lang.String r2 = "key_transfer_qrcode_id"
            r6.putExtra(r2, r1)
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228587C
            java.lang.String r2 = "get_dynamic_code_sign"
            r6.putExtra(r2, r1)
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228588D
            java.lang.String r2 = "get_dynamic_code_extend"
            r6.putExtra(r2, r1)
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228591G
            java.lang.String r2 = "dynamic_code_spam_wording"
            r6.putExtra(r2, r1)
            te3.yj r1 = r0.f204235e
            int r1 = r1.f228589E
            java.lang.String r2 = "dynamic_code_amount"
            r6.putExtra(r2, r1)
            te3.yj r0 = r0.f204235e
            java.lang.String r0 = r0.f228590F
            java.lang.String r1 = "show_paying_wording"
            r6.putExtra(r1, r0)
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r0 = r8.f204605q1
            int r0 = r0.f204052q
            if (r0 != r3) goto L_0x027b
            r0 = 1
            goto L_0x027c
        L_0x027b:
            r0 = 0
        L_0x027c:
            java.lang.String r1 = "show_avatar_type"
            r6.putExtra(r1, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 15386(0x3c1a, float:2.156E-41)
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r9 = 0
            r4[r9] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r3] = r2
            r0.mo160131h(r1, r4)
            com.tencent.mm.sdk.event.IListener r0 = r8.f204583g2
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r8.f204586h2
            r0.alive()
            com.tencent.mm.sdk.event.IListener r0 = r8.f204589i2
            r0.alive()
            boolean r0 = r8.mKindaEnable
            if (r0 == 0) goto L_0x02af
            r23.hideLoading()
        L_0x02af:
            java.lang.String r0 = ".ui.RemittanceF2fDynamicCodeUI"
            ke3.C88144b.m109795m(r8, r11, r0, r6, r5)
            goto L_0x04be
        L_0x02b6:
            boolean r1 = r8.mKindaEnable
            if (r1 == 0) goto L_0x0485
            r8.f204512D1 = r3
            com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI r1 = r8.f204518G1
            if (r1 == 0) goto L_0x02c2
            r8.f204512D1 = r5
        L_0x02c2:
            java.lang.String r1 = r14.f228590F
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x02d2
            te3.yj r1 = r0.f204235e
            java.lang.String r1 = r1.f228590F
        L_0x02ce:
            r6 = r20
            goto L_0x036a
        L_0x02d2:
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r1 = r1.getStringExtra(r10)
            r5 = 2131839577(0x7f114a59, float:1.931241E38)
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 != 0) goto L_0x02e9
            r5 = r1
            goto L_0x02eb
        L_0x02e9:
            r1 = r5
            r5 = r15
        L_0x02eb:
            java.lang.String r6 = r8.f204548U
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0361
            f40.C86709a0.m107528h()
            k40.a r6 = f40.C86709a0.m107533q(r2)
            f62.k0 r6 = (f62.C75700k0) r6
            com.tencent.mm.storage.u3 r6 = r6.mo96097Ni()
            java.lang.String r7 = r8.f204548U
            com.tencent.mm.storage.z1 r6 = r6.mo69664N2(r7)
            if (r6 == 0) goto L_0x0347
            java.lang.String r5 = r6.mo62898f()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r5)
            r7.append(r5)
            java.lang.String r5 = r8.f204551V
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x0324
            r5 = r15
            goto L_0x0338
        L_0x0324:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r13)
            java.lang.String r9 = r8.f204551V
            r5.append(r9)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
        L_0x0338:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r7 = 0
            r6[r7] = r5
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r1, r6)
            goto L_0x02ce
        L_0x0347:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r6 = r8.f204548U
            r1.append(r6)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r6 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
            goto L_0x0369
        L_0x0361:
            r6 = r20
            java.lang.String r1 = "mRcverName is null ,scene is MMPAY_PAY_SCENE_TRANSFER busi"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)
        L_0x0369:
            r1 = r5
        L_0x036a:
            android.os.Bundle r5 = r4.f212600u
            if (r5 != 0) goto L_0x0375
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r4.f212600u = r5
        L_0x0375:
            android.os.Bundle r5 = r4.f212600u
            java.lang.String r7 = "cashier_desc"
            r5.putString(r7, r1)
            java.lang.String r1 = r8.f204548U
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03cd
            f40.C86709a0.m107528h()
            k40.a r1 = f40.C86709a0.m107533q(r2)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            java.lang.String r2 = r8.f204548U
            com.tencent.mm.storage.z1 r1 = r1.mo69664N2(r2)
            if (r1 == 0) goto L_0x03cd
            java.lang.String r1 = r1.mo62898f()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r1)
            r2.append(r1)
            java.lang.String r1 = r8.f204551V
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x03b2
            goto L_0x03c6
        L_0x03b2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r5 = r8.f204551V
            r1.append(r5)
            r1.append(r12)
            java.lang.String r15 = r1.toString()
        L_0x03c6:
            r2.append(r15)
            java.lang.String r15 = r2.toString()
        L_0x03cd:
            android.os.Bundle r1 = r4.f212600u
            java.lang.String r2 = "prepay_page_payee"
            r1.putString(r2, r15)
            int r0 = r0.f204239i
            te3.f4 r0 = r8.mo97315O7(r0)
            android.os.Bundle r1 = r4.f212600u     // Catch:{ IOException -> 0x03e7 }
            java.lang.String r2 = "after_place_order_commreq"
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x03e7 }
            r1.putByteArray(r2, r0)     // Catch:{ IOException -> 0x03e7 }
            goto L_0x03ed
        L_0x03e7:
            java.lang.String r0 = "reqPlaceOrder parse failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x03ed:
            android.os.Bundle r0 = r4.f212600u
            java.lang.String r1 = r8.f204613u1
            java.lang.String r2 = "suc_page_extend"
            r0.putString(r2, r1)
            android.os.Bundle r0 = r4.f212600u
            int r1 = r8.f204595l1
            java.lang.String r2 = "fault_flag"
            r0.putInt(r2, r1)
            android.os.Bundle r0 = r4.f212600u
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r1 = r8.f204605q1
            java.lang.String r1 = r1.f204054s
            java.lang.String r2 = "suc_page_name"
            r0.putString(r2, r1)
            android.os.Bundle r0 = r4.f212600u
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r1 = r8.f204605q1
            java.lang.String r1 = r1.f204043e
            java.lang.String r2 = "rece_photo_url"
            r0.putString(r2, r1)
            android.os.Bundle r0 = r4.f212600u
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r1 = r8.f204605q1
            java.lang.Boolean r1 = r1.f204059x
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            java.lang.String r2 = "yunshanfu_disabled"
            r0.putBoolean(r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r1 = r8.f204605q1
            java.lang.Boolean r1 = r1.f204059x
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "start snsPay with unionPay enabled: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r0)
            int r0 = r8.f204563Z
            r1 = 56
            if (r0 != r1) goto L_0x0447
            android.os.Bundle r0 = r4.f212600u
            java.lang.String r1 = r8.f204532N1
            java.lang.String r2 = "app_id"
            r0.putString(r2, r1)
        L_0x0447:
            android.os.Bundle r0 = r4.f212600u
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r2 = "chat_type"
            r5 = 0
            int r1 = r1.getIntExtra(r2, r5)
            r0.putInt(r2, r1)
            android.os.Bundle r0 = r4.f212600u
            android.content.Intent r1 = r23.getIntent()
            java.lang.String r2 = "send_type"
            int r1 = r1.getIntExtra(r2, r5)
            r0.putInt(r2, r1)
            com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI r0 = r8.f204518G1
            if (r0 == 0) goto L_0x0477
            di3.d r0 = di3.C86312j.m106911c(r19)
            ie3.c r0 = (ie3.C76324c) r0
            com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI r1 = r8.f204518G1
            r0.startSNSPay(r1, r4)
            goto L_0x0480
        L_0x0477:
            di3.d r0 = di3.C86312j.m106911c(r19)
            ie3.c r0 = (ie3.C76324c) r0
            r0.startSNSPay(r8, r4)
        L_0x0480:
            r8.f204520H1 = r3
            r8.f204510C1 = r3
            goto L_0x04be
        L_0x0485:
            java.lang.String r1 = r0.f204237g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0490
            r8.f204508B1 = r3
            goto L_0x0493
        L_0x0490:
            r1 = 0
            r8.f204508B1 = r1
        L_0x0493:
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent r0 = r0.f204238h
            if (r0 == 0) goto L_0x04b3
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent$a r0 = r0.f193584d
            android.app.Activity r1 = r0.f193588d
            if (r1 == 0) goto L_0x04b3
            r17 = 0
            java.lang.String r2 = r8.f204551V
            int r0 = r0.f193586b
            java.lang.String r18 = ""
            r16 = r1
            r19 = r4
            r20 = r2
            r21 = r6
            r22 = r0
            ie3.C76331i.m91762f(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x04be
        L_0x04b3:
            r2 = 0
            java.lang.String r5 = r8.f204551V
            r7 = 1
            java.lang.String r3 = ""
            r1 = r23
            ie3.C76331i.m91762f(r1, r2, r3, r4, r5, r6, r7)
        L_0x04be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.mo97329c8(com.tencent.mm.plugin.remittance.model.k):void");
    }

    /* renamed from: d8 */
    public final boolean mo97330d8() {
        boolean z;
        if (!(this.f204590j == null || this.f204605q1 == null)) {
            Log.m105924i("MicroMsg.RemittanceBusiUI", "tryShowFavor ");
            C77995sj sjVar = this.f204605q1.f204049n;
            boolean z2 = sjVar != null && sjVar.f228220d.size() > 0;
            if (((LinkedList) this.f204605q1.f204048j).size() > 0) {
                z2 = true;
            }
            C77995sj sjVar2 = this.f204607r1.f205297b;
            if ((sjVar2 != null ? sjVar2.f228220d : new LinkedList<>()).size() > 0) {
                z2 = true;
            }
            boolean d = this.f204609s1.mo97545d();
            int i = 8;
            if (z2 || d) {
                View view = this.f204517G;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f204625z1.mo97374a();
                View view3 = this.f204590j;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f204597n;
                int i2 = z2 ? 0 : 8;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(Integer.valueOf(i2));
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view7 = this.f204604q;
                int i3 = d ? 0 : 8;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(Integer.valueOf(i3));
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                boolean z3 = z2 && d;
                View view9 = this.f204601p;
                if (z3) {
                    i = 0;
                }
                C9556a aVar5 = new C9556a();
                aVar5.mo10233c(Integer.valueOf(i));
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (z2) {
                    this.f204599o.setText(this.f204605q1.f204044f);
                    this.f204599o.setTextColor(getContext().getResources().getColor(C0966R.color.FG_2));
                    C70883e eVar = this.f204607r1;
                    C77907be0 be02 = eVar.f205296a;
                    if (be02 != null) {
                        this.f204599o.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
                        this.f204599o.setText(be02.f227000i);
                    } else {
                        C77995sj sjVar3 = eVar.f205297b;
                        String str = sjVar3 == null ? "" : sjVar3.f228224h;
                        if (!Util.isNullOrNil(str)) {
                            this.f204599o.setTextColor(getContext().getResources().getColor(C0966R.color.FG_2));
                            this.f204599o.setText(str);
                        }
                    }
                    this.f204597n.setOnTouchListener(new View.OnTouchListener() {
                        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
                            if (r8 != 3) goto L_0x0042;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                            /*
                                r7 = this;
                                java.util.ArrayList r0 = new java.util.ArrayList
                                r0.<init>()
                                r0.add(r8)
                                r0.add(r9)
                                java.lang.Object[] r6 = r0.toArray()
                                r0.clear()
                                java.lang.String r1 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$14"
                                java.lang.String r2 = "android/view/View$OnTouchListener"
                                java.lang.String r3 = "onTouch"
                                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                                r5 = r7
                                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                                int r8 = r9.getAction()
                                if (r8 == 0) goto L_0x0039
                                r9 = 1
                                if (r8 == r9) goto L_0x002f
                                r9 = 2
                                if (r8 == r9) goto L_0x0039
                                r9 = 3
                                if (r8 == r9) goto L_0x002f
                                goto L_0x0042
                            L_0x002f:
                                com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r8 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                                android.widget.TextView r8 = r8.f204599o
                                r9 = 1065353216(0x3f800000, float:1.0)
                                r8.setAlpha(r9)
                                goto L_0x0042
                            L_0x0039:
                                com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r8 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                                android.widget.TextView r8 = r8.f204599o
                                r9 = 1056964608(0x3f000000, float:0.5)
                                r8.setAlpha(r9)
                            L_0x0042:
                                r8 = 0
                                r0 = 0
                                java.lang.String r2 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$14"
                                java.lang.String r3 = "android/view/View$OnTouchListener"
                                java.lang.String r4 = "onTouch"
                                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                                r1 = r7
                                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                                return r8
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C506214.onTouch(android.view.View, android.view.MotionEvent):boolean");
                        }
                    });
                    this.f204597n.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(view);
                            Object[] array = arrayList.toArray();
                            arrayList.clear();
                            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.mo160131h(15235, 3);
                            if (RemittanceBusiUI.this.f204563Z == 56) {
                                nVar.mo160131h(19821, 7, RemittanceBusiUI.this.f204532N1, 0);
                            }
                            RemittanceBusiUI.m83182I7(RemittanceBusiUI.this);
                            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        }
                    });
                }
                if (d) {
                    mo97334i8();
                }
                this.f204519H.setText(C75228t.m90260n(((double) mo97319S7()) / 100.0d));
                C77907be0 be03 = this.f204607r1.f205296a;
                if (be03 != null) {
                    this.f204519H.setText(C75228t.m90260n(((double) be03.f226998g) / 100.0d));
                }
                if (Util.getDouble(this.f204519H.getText().toString(), 0.0d) == 0.0d) {
                    this.f204519H.setTextColor(getContext().getResources().getColor(C0966R.color.FG_2));
                    this.f204521I.setTextColor(getContext().getResources().getColor(C0966R.color.FG_2));
                } else {
                    this.f204519H.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
                    this.f204521I.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
                }
                z = true;
                C45056f1.m49909b(this, this.f204536Q, findViewById(C0966R.C0970id.in8), findViewById(C0966R.C0970id.in8), findViewById(C0966R.C0970id.in7), 24, (float) C76577a.m92151b(getContext(), 96), false);
                return z;
            }
            View view11 = this.f204590j;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar6.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204506A1.mo97374a();
            View view13 = this.f204517G;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(8);
            View view14 = view13;
            C117292a.m165358d(view14, aVar7.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view14, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "tryShowFavor", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        z = false;
        C45056f1.m49909b(this, this.f204536Q, findViewById(C0966R.C0970id.in8), findViewById(C0966R.C0970id.in8), findViewById(C0966R.C0970id.in7), 24, (float) C76577a.m92151b(getContext(), 96), false);
        return z;
    }

    /* renamed from: e8 */
    public final void mo97331e8(C70582d dVar, C70583e eVar, int i) {
        if (this.f204615v1) {
            this.f204519H.setText(C75228t.m90260n(((double) mo97319S7()) / 100.0d));
            this.f204519H.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
            this.f204521I.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
            MMHandlerThread.removeRunnable(this.f204559X1);
            double T7 = mo97320T7();
            this.f204545T = T7;
            long round = Math.round(T7 * 100.0d);
            int i2 = 1;
            if (round <= 0) {
                mo97314N7(this.f204605q1.f204044f);
                C70590i iVar = this.f204620x1;
                if (iVar != null) {
                    iVar.f204126o = true;
                    return;
                }
                return;
            }
            if (this.f204609s1.mo97545d()) {
                this.f204599o.setTextColor(getContext().getResources().getColor(C0966R.color.f3563xt));
                this.f204609s1.f205282d = true;
                mo97334i8();
            }
            C70590i.C70591a aVar = new C70590i.C70591a();
            int i3 = (int) round;
            aVar.f204128a = i3;
            aVar.f204129b = i3 + ((int) this.f204609s1.mo97544c());
            aVar.f204130c = this.f204563Z;
            BusiRemittanceResp busiRemittanceResp = this.f204605q1;
            aVar.f204131d = busiRemittanceResp.f204045g;
            aVar.f204132e = this.f204554W;
            aVar.f204133f = this.f204622y0;
            aVar.f204134g = busiRemittanceResp.f204046h;
            aVar.f204135h = this.f204566a1;
            aVar.f204136i = this.f204548U;
            aVar.f204137j = busiRemittanceResp.f204047i;
            if (dVar == null) {
                i2 = 0;
            }
            aVar.f204138k = i2;
            if (this.f204609s1.mo97545d()) {
                aVar.f204139l = this.f204609s1.mo97543b().f227354f;
            }
            this.f204620x1 = new C70590i(aVar, dVar, eVar);
            MMHandlerThread.postToMainThreadDelayed(this.f204559X1, (long) i);
        }
    }

    /* renamed from: f8 */
    public final void mo97332f8() {
        Log.m105924i("MicroMsg.RemittanceBusiUI", "unLockFavorimp");
        if (this.f204607r1.f205296a != null || this.f204609s1.mo97545d()) {
            doSceneProgress(new C42846m(mo97315O7((int) Math.round(this.f204545T * 100.0d)), this.f204611t1), false);
        } else {
            Log.m105924i("MicroMsg.RemittanceBusiUI", "do NetSceneBusiF2fUnlockFavor FavorComposeInfo and ExtraBuyInfo is null");
        }
    }

    /* renamed from: g8 */
    public final void mo97333g8() {
        if (!Util.isNullOrNil(this.f204557X)) {
            this.f204584h.setVisibility(0);
            this.f204587i.setVisibility(8);
            String string = getString(C0966R.string.i1o);
            SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, getString(C0966R.string.bgb, new Object[]{this.f204557X, string}));
            C75228t.m90253j0(this.f204584h, T1.toString(), T1.length() - string.length(), T1.length(), new C7092q((C7092q.C7093a) new C7092q.C7093a() {
                public void onClick(View view) {
                    RemittanceBusiUI.m83186M7(RemittanceBusiUI.this);
                }
            }, true), getContext());
            return;
        }
        this.f204584h.setVisibility(8);
        this.f204587i.setVisibility(0);
        String string2 = getString(C0966R.string.hzp);
        C75228t.m90253j0(this.f204587i, string2, 0, string2.length(), new C7092q((C7092q.C7093a) new C7092q.C7093a() {
            public void onClick(View view) {
                RemittanceBusiUI.m83186M7(RemittanceBusiUI.this);
            }
        }, true), getContext());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brh;
    }

    /* renamed from: i8 */
    public final void mo97334i8() {
        this.f204614v.setText(this.f204609s1.mo97543b().f227352d);
        TextView textView = this.f204614v;
        C70873b bVar = this.f204609s1;
        textView.setTextColor(bVar.mo97542a() > 0 ? bVar.f205279a.getResources().getColor(C0966R.color.f2960ag) : bVar.f205279a.getResources().getColor(C0966R.color.f3563xt));
        boolean z = false;
        if (!(this.f204609s1.mo97543b().f227354f.size() > 1)) {
            View view = this.f204618x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204616w.setVisibility(0);
            View view3 = this.f204610t;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((RelativeLayout.LayoutParams) this.f204612u.getLayoutParams()).addRule(0, C0966R.C0970id.cxg);
            this.f204616w.setChecked(this.f204609s1.mo97543b().f227354f.getFirst().f227249o);
            CheckBox checkBox = this.f204616w;
            C70873b bVar2 = this.f204609s1;
            if (!bVar2.f205282d && (bVar2.mo97543b().f227354f.size() != 1 || bVar2.mo97542a() > 0)) {
                z = true;
            }
            checkBox.setEnabled(z);
            this.f204604q.setOnTouchListener((View.OnTouchListener) null);
            this.f204604q.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    C70590i iVar = remittanceBusiUI.f204620x1;
                    if (iVar == null || iVar.f204124j) {
                        boolean isEnabled = remittanceBusiUI.f204616w.isEnabled();
                        Log.m105925i("MicroMsg.RemittanceBusiUI", "clicked extrabuy favor view, enabled=%b", Boolean.valueOf(isEnabled));
                        if (isEnabled) {
                            CheckBox checkBox = RemittanceBusiUI.this.f204616w;
                            checkBox.setChecked(true ^ checkBox.isChecked());
                        } else {
                            String str = RemittanceBusiUI.this.f204609s1.mo97543b().f227354f.getFirst().f227248n;
                            C70887f0.m83406d();
                            C70887f0.C70888a.f205300a.mo97558e(str, (String) null, RemittanceBusiUI.this.getContext().getString(C0966R.string.fmz), (String) null, new DialogInterface.OnClickListener(this) {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                }
                            }, (DialogInterface.OnClickListener) null);
                        }
                        C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f204608s.setOnTouchListener(new View.OnTouchListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
                    if (r14 != 3) goto L_0x00c4;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
                    /*
                        r13 = this;
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r0.add(r14)
                        r0.add(r15)
                        java.lang.Object[] r6 = r0.toArray()
                        r0.clear()
                        java.lang.String r1 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r2 = "android/view/View$OnTouchListener"
                        java.lang.String r3 = "onTouch"
                        java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        r5 = r13
                        j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                        int r14 = r15.getAction()
                        r15 = 0
                        if (r14 == 0) goto L_0x007b
                        r0 = 1
                        if (r14 == r0) goto L_0x0031
                        r0 = 2
                        if (r14 == r0) goto L_0x007b
                        r0 = 3
                        if (r14 == r0) goto L_0x0031
                        goto L_0x00c4
                    L_0x0031:
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r14 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        android.view.View r14 = r14.f204610t
                        r0 = 1065353216(0x3f800000, float:1.0)
                        k20.a r8 = new k20.a
                        r8.<init>()
                        java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                        java.lang.Float r0 = java.lang.Float.valueOf(r0)
                        r8.mo10233c(r0)
                        java.lang.Object[] r1 = r8.mo10232b()
                        java.lang.String r2 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r3 = "onTouch"
                        java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        java.lang.String r5 = "android/view/View_EXEC_"
                        java.lang.String r6 = "setAlpha"
                        java.lang.String r7 = "(F)V"
                        r0 = r14
                        j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                        java.lang.Object r0 = r8.mo10231a(r15)
                        java.lang.Float r0 = (java.lang.Float) r0
                        float r0 = r0.floatValue()
                        r14.setAlpha(r0)
                        java.lang.String r1 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r2 = "onTouch"
                        java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        java.lang.String r4 = "android/view/View_EXEC_"
                        java.lang.String r5 = "setAlpha"
                        java.lang.String r6 = "(F)V"
                        r0 = r14
                        j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                        goto L_0x00c4
                    L_0x007b:
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r14 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        android.view.View r14 = r14.f204610t
                        r0 = 1056964608(0x3f000000, float:0.5)
                        k20.a r8 = new k20.a
                        r8.<init>()
                        java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
                        java.lang.Float r0 = java.lang.Float.valueOf(r0)
                        r8.mo10233c(r0)
                        java.lang.Object[] r1 = r8.mo10232b()
                        java.lang.String r2 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r3 = "onTouch"
                        java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        java.lang.String r5 = "android/view/View_EXEC_"
                        java.lang.String r6 = "setAlpha"
                        java.lang.String r7 = "(F)V"
                        r0 = r14
                        j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                        java.lang.Object r0 = r8.mo10231a(r15)
                        java.lang.Float r0 = (java.lang.Float) r0
                        float r0 = r0.floatValue()
                        r14.setAlpha(r0)
                        java.lang.String r1 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r2 = "onTouch"
                        java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        java.lang.String r4 = "android/view/View_EXEC_"
                        java.lang.String r5 = "setAlpha"
                        java.lang.String r6 = "(F)V"
                        r0 = r14
                        j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                    L_0x00c4:
                        r7 = 0
                        java.lang.String r9 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$17"
                        java.lang.String r10 = "android/view/View$OnTouchListener"
                        java.lang.String r11 = "onTouch"
                        java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                        r8 = r13
                        j20.C117292a.m165362h(r7, r8, r9, r10, r11, r12)
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C506317.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            this.f204608s.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    RemittanceBusiUI.m83183J7(RemittanceBusiUI.this);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f204616w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C70873b bVar = RemittanceBusiUI.this.f204609s1;
                    Log.m105925i("MicroMsg.ExtraBuyInfoHelper", "set %d selected: %b", Long.valueOf(bVar.mo97543b().f227354f.getFirst().f227241d), Boolean.valueOf(z));
                    C77927fb0 fb02 = bVar.f205280b;
                    if (fb02 != null) {
                        fb02.f227354f.getFirst().f227249o = z;
                    }
                    C77927fb0 fb03 = bVar.f205281c;
                    if (fb03 != null) {
                        fb03.f227354f.getFirst().f227249o = z;
                    }
                    RemittanceBusiUI.this.mo97331e8((C70582d) null, (C70583e) null, 0);
                }
            });
            return;
        }
        View view4 = this.f204610t;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view5 = view4;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f204616w.setVisibility(8);
        View view6 = this.f204618x;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(0);
        View view7 = view6;
        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view7, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "updateExtraBuyFavorItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((RelativeLayout.LayoutParams) this.f204612u.getLayoutParams()).addRule(0, C0966R.C0970id.cxk);
        this.f204608s.setOnClickListener((View.OnClickListener) null);
        this.f204608s.setOnTouchListener((View.OnTouchListener) null);
        this.f204604q.setOnTouchListener(new View.OnTouchListener() {
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
                if (r8 != 3) goto L_0x0042;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                /*
                    r7 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r0.add(r8)
                    r0.add(r9)
                    java.lang.Object[] r6 = r0.toArray()
                    r0.clear()
                    java.lang.String r1 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$20"
                    java.lang.String r2 = "android/view/View$OnTouchListener"
                    java.lang.String r3 = "onTouch"
                    java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    r5 = r7
                    j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                    int r8 = r9.getAction()
                    if (r8 == 0) goto L_0x0039
                    r9 = 1
                    if (r8 == r9) goto L_0x002f
                    r9 = 2
                    if (r8 == r9) goto L_0x0039
                    r9 = 3
                    if (r8 == r9) goto L_0x002f
                    goto L_0x0042
                L_0x002f:
                    com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r8 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                    android.widget.TextView r8 = r8.f204614v
                    r9 = 1065353216(0x3f800000, float:1.0)
                    r8.setAlpha(r9)
                    goto L_0x0042
                L_0x0039:
                    com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r8 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                    android.widget.TextView r8 = r8.f204614v
                    r9 = 1056964608(0x3f000000, float:0.5)
                    r8.setAlpha(r9)
                L_0x0042:
                    r8 = 0
                    r0 = 0
                    java.lang.String r2 = "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$20"
                    java.lang.String r3 = "android/view/View$OnTouchListener"
                    java.lang.String r4 = "onTouch"
                    java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                    r1 = r7
                    j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C506520.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        this.f204604q.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                C70590i iVar = remittanceBusiUI.f204620x1;
                if (iVar == null || iVar.f204124j) {
                    RemittanceBusiUI.m83183J7(remittanceBusiUI);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public void initView() {
        ez4 ez4;
        C77995sj sjVar;
        final boolean z;
        Class cls = C76979h.class;
        hideActionbarLine();
        this.f204536Q = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f204533O1 = (LinearLayout) findViewById(C0966R.C0970id.in6);
        this.f204572d = (TextView) findViewById(C0966R.C0970id.ilu);
        this.f204575e = (TextView) findViewById(C0966R.C0970id.ilv);
        this.f204578f = (TextView) findViewById(C0966R.C0970id.ilr);
        this.f204581g = (TextView) findViewById(C0966R.C0970id.ilo);
        this.f204584h = (TextView) findViewById(C0966R.C0970id.ili);
        this.f204587i = (TextView) findViewById(C0966R.C0970id.ilg);
        this.f204621y = (CdnImageView) findViewById(C0966R.C0970id.ils);
        this.f204550U1 = (TextView) findViewById(C0966R.C0970id.ce4);
        this.f204624z = (WalletFormView) findViewById(C0966R.C0970id.ilt);
        this.f204505A = (LinearLayout) findViewById(C0966R.C0970id.ilp);
        this.f204507B = (LinearLayout) findViewById(C0966R.C0970id.ilk);
        this.f204531N = (RelativeLayout) findViewById(C0966R.C0970id.lh9);
        this.f204509C = (LinearLayout) findViewById(C0966R.C0970id.ilj);
        this.f204511D = (LinearLayout) findViewById(C0966R.C0970id.nyh);
        this.f204513E = (EditText) findViewById(C0966R.C0970id.nyi);
        this.f204590j = findViewById(C0966R.C0970id.ill);
        this.f204597n = findViewById(C0966R.C0970id.cxd);
        this.f204599o = (TextView) findViewById(C0966R.C0970id.nt7);
        this.f204601p = findViewById(C0966R.C0970id.cxp);
        this.f204604q = findViewById(C0966R.C0970id.cxj);
        this.f204606r = (TextView) findViewById(C0966R.C0970id.cxn);
        this.f204608s = findViewById(C0966R.C0970id.cxo);
        this.f204610t = findViewById(C0966R.C0970id.cxi);
        this.f204612u = (LinearLayout) findViewById(C0966R.C0970id.cxm);
        this.f204614v = (TextView) findViewById(C0966R.C0970id.cxl);
        this.f204616w = (CheckBox) findViewById(C0966R.C0970id.cxg);
        this.f204618x = findViewById(C0966R.C0970id.cxk);
        this.f204515F = (TextView) findViewById(C0966R.C0970id.iln);
        this.f204517G = findViewById(C0966R.C0970id.d37);
        this.f204519H = (TextView) findViewById(C0966R.C0970id.d36);
        this.f204521I = (TextView) findViewById(C0966R.C0970id.d35);
        this.f204523J = (Button) findViewById(C0966R.C0970id.ilq);
        this.f204534P = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        if (this.f204549U0) {
            if (!Util.isNullOrNil(this.f204554W)) {
                this.f204578f.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f204554W, this.f204578f.getTextSize()));
            }
            this.f204581g.setText(C75228t.m90260n(this.f204545T));
            this.f204505A.setVisibility(0);
            this.f204507B.setVisibility(8);
            this.f204531N.setVisibility(8);
            this.f204523J.setVisibility(0);
            this.f204523J.setEnabled(true);
            this.f204536Q.setOnTouchListener(new View.OnTouchListener(false) {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    if (true) {
                        RemittanceBusiUI.this.handleKeyboardTouchEvent(motionEvent);
                    } else {
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        int i = RemittanceBusiUI.f204504l2;
                        WcPayKeyboard wcPayKeyboard = remittanceBusiUI.mWcKeyboard;
                        if (wcPayKeyboard != null && wcPayKeyboard.isShown() && RemittanceBusiUI.this.mWcKeyboard.mo104748l()) {
                            RemittanceBusiUI.this.mWcKeyboard.mo104741f();
                        }
                    }
                    RemittanceBusiUI.this.hideTenpayKB();
                    RemittanceBusiUI.this.hideVKB();
                    RemittanceBusiUI.this.f204624z.getContentEt().clearFocus();
                    RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                    if (remittanceBusiUI2.f204598n1) {
                        remittanceBusiUI2.f204513E.clearFocus();
                    }
                    C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return false;
                }
            });
        } else {
            if (!Util.isNullOrNil(this.f204554W)) {
                this.f204550U1.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, this.f204554W, this.f204550U1.getTextSize()));
            }
            BusiRemittanceResp busiRemittanceResp = this.f204605q1;
            if (busiRemittanceResp != null) {
                z = ((LinkedList) busiRemittanceResp.f204048j).size() <= 0;
                C77995sj sjVar2 = this.f204605q1.f204049n;
                if (sjVar2 != null && sjVar2.f228220d.size() > 0) {
                    z = false;
                }
            } else {
                z = true;
            }
            if (this.f204598n1) {
                this.f204523J.setVisibility(0);
                this.f204523J.setEnabled(false);
                this.f204536Q.setOnTouchListener(new View.OnTouchListener(false) {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        arrayList.add(motionEvent);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                        if (true) {
                            RemittanceBusiUI.this.handleKeyboardTouchEvent(motionEvent);
                        } else {
                            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                            int i = RemittanceBusiUI.f204504l2;
                            WcPayKeyboard wcPayKeyboard = remittanceBusiUI.mWcKeyboard;
                            if (wcPayKeyboard != null && wcPayKeyboard.isShown() && RemittanceBusiUI.this.mWcKeyboard.mo104748l()) {
                                RemittanceBusiUI.this.mWcKeyboard.mo104741f();
                            }
                        }
                        RemittanceBusiUI.this.hideTenpayKB();
                        RemittanceBusiUI.this.hideVKB();
                        RemittanceBusiUI.this.f204624z.getContentEt().clearFocus();
                        RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                        if (remittanceBusiUI2.f204598n1) {
                            remittanceBusiUI2.f204513E.clearFocus();
                        }
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                });
                z = false;
            } else {
                this.f204523J.setVisibility(8);
                this.f204536Q.setOnTouchListener(new View.OnTouchListener(true) {
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        arrayList.add(motionEvent);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                        if (true) {
                            RemittanceBusiUI.this.handleKeyboardTouchEvent(motionEvent);
                        } else {
                            RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                            int i = RemittanceBusiUI.f204504l2;
                            WcPayKeyboard wcPayKeyboard = remittanceBusiUI.mWcKeyboard;
                            if (wcPayKeyboard != null && wcPayKeyboard.isShown() && RemittanceBusiUI.this.mWcKeyboard.mo104748l()) {
                                RemittanceBusiUI.this.mWcKeyboard.mo104741f();
                            }
                        }
                        RemittanceBusiUI.this.hideTenpayKB();
                        RemittanceBusiUI.this.hideVKB();
                        RemittanceBusiUI.this.f204624z.getContentEt().clearFocus();
                        RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                        if (remittanceBusiUI2.f204598n1) {
                            remittanceBusiUI2.f204513E.clearFocus();
                        }
                        C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI$58", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                });
            }
            setWPKeyboard(this.f204624z.getContentEt(), z, true);
            if (!z) {
                this.f204624z.getContentEt().clearFocus();
            }
            this.f204624z.setmContentAbnormalMoneyCheck(true);
            if (C11171e.m11046c(28)) {
                this.f204624z.getContentEt().post(new Runnable() {
                    public void run() {
                        if (z) {
                            RemittanceBusiUI.this.f204624z.getContentEt().requestFocus();
                        }
                    }
                });
            }
            if (this.f204598n1) {
                this.f204534P.setActionText(getString(C0966R.string.a18));
                ((C5058t0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5058t0.class)).setValue("keyboard_title_key", getString(C0966R.string.a18));
            } else {
                this.f204534P.setActionText(getString(C0966R.string.i05));
                ((C5058t0) C39818r.f106831a.mo62444c(getContext()).mo75002a(C5058t0.class)).setValue("keyboard_title_key", getString(C0966R.string.i05));
            }
            setWcKbHeightListener(this);
            ((RelativeLayout.LayoutParams) this.f204534P.getLayoutParams()).addRule(12);
            this.f204624z.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(View view, boolean z) {
                    if (z) {
                        RemittanceBusiUI.this.showNormalStWcKb();
                    }
                }
            });
            this.f204624z.mo105069a(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    remittanceBusiUI.f204599o.setTextColor(remittanceBusiUI.getContext().getResources().getColor(C0966R.color.FG_2));
                    RemittanceBusiUI.this.mo97335j8();
                    RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                    if (remittanceBusiUI2.f204539R == 32) {
                        BusiRemittanceResp busiRemittanceResp = remittanceBusiUI2.f204605q1;
                        remittanceBusiUI2.mo97331e8((C70582d) null, (C70583e) null, busiRemittanceResp == null ? 400 : busiRemittanceResp.f204055t);
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            this.f204624z.mo105097o(7, 2);
            this.f204505A.setVisibility(8);
            this.f204507B.setVisibility(0);
            this.f204531N.setVisibility(0);
        }
        if (C86709a0.m107522a()) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f204548U);
            if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
                C31519v2.m39436a().mo55988e(this.f204548U, "", new C75597w2.C31525a() {
                    /* renamed from: a */
                    public void mo1109a(String str, boolean z) {
                        Log.m105925i("MicroMsg.RemittanceBusiUI", "getContact %s", Boolean.valueOf(z));
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        int i = RemittanceBusiUI.f204504l2;
                        remittanceBusiUI.getClass();
                        MMHandlerThread.postToMainThread(new Runnable() {
                            public void run() {
                                String str;
                                Class cls = C76705f.class;
                                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                                remittanceBusiUI.f204572d.setText(remittanceBusiUI.f204596m1);
                                BusiRemittanceResp busiRemittanceResp = RemittanceBusiUI.this.f204605q1;
                                if (busiRemittanceResp == null || Util.isNullOrNil(busiRemittanceResp.f204053r)) {
                                    str = C75228t.m90277z(C75228t.m90268r(RemittanceBusiUI.this.f204548U), 10);
                                    if (!Util.isNullOrNil(RemittanceBusiUI.this.f204551V)) {
                                        RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                                        str = remittanceBusiUI2.getString(C0966R.string.i0b, new Object[]{str, remittanceBusiUI2.f204551V});
                                    }
                                } else {
                                    str = RemittanceBusiUI.this.f204605q1.f204053r;
                                }
                                TextView textView = RemittanceBusiUI.this.f204575e;
                                RemittanceBusiUI remittanceBusiUI3 = RemittanceBusiUI.this;
                                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(remittanceBusiUI3, str, remittanceBusiUI3.f204575e.getTextSize()));
                                RemittanceBusiUI remittanceBusiUI4 = RemittanceBusiUI.this;
                                BusiRemittanceResp busiRemittanceResp2 = remittanceBusiUI4.f204605q1;
                                if (busiRemittanceResp2 == null) {
                                    remittanceBusiUI4.f204621y.setVisibility(8);
                                } else if (busiRemittanceResp2.f204042d != 1) {
                                    remittanceBusiUI4.f204621y.setVisibility(8);
                                } else if (!Util.isNullOrNil(busiRemittanceResp2.f204043e)) {
                                    RemittanceBusiUI remittanceBusiUI5 = RemittanceBusiUI.this;
                                    if (remittanceBusiUI5.f204605q1.f204052q == 1) {
                                        remittanceBusiUI5.f204621y.setRoundCorner(true);
                                    } else {
                                        remittanceBusiUI5.f204621y.setRoundCorner(false);
                                    }
                                    int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(RemittanceBusiUI.this, 36.0f);
                                    RemittanceBusiUI remittanceBusiUI6 = RemittanceBusiUI.this;
                                    remittanceBusiUI6.f204621y.mo100288c(remittanceBusiUI6.f204605q1.f204043e, fromDPToPix, fromDPToPix, -1);
                                } else if (Util.isNullOrNil(RemittanceBusiUI.this.f204548U)) {
                                    RemittanceBusiUI.this.f204621y.setVisibility(8);
                                } else if (RemittanceBusiUI.this.f204605q1.f204052q == 1) {
                                    RemittanceBusiUI remittanceBusiUI7 = RemittanceBusiUI.this;
                                    ((C76705f) C86312j.m106911c(cls)).mo106822J5(remittanceBusiUI7.f204621y, remittanceBusiUI7.f204548U);
                                } else {
                                    RemittanceBusiUI remittanceBusiUI8 = RemittanceBusiUI.this;
                                    ((C76705f) C86312j.m106911c(cls)).mo106849z(remittanceBusiUI8.f204621y, remittanceBusiUI8.f204548U);
                                }
                            }
                        });
                    }
                });
            }
        }
        MMHandlerThread.postToMainThread(new Runnable() {
            public void run() {
                String str;
                Class cls = C76705f.class;
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                remittanceBusiUI.f204572d.setText(remittanceBusiUI.f204596m1);
                BusiRemittanceResp busiRemittanceResp = RemittanceBusiUI.this.f204605q1;
                if (busiRemittanceResp == null || Util.isNullOrNil(busiRemittanceResp.f204053r)) {
                    str = C75228t.m90277z(C75228t.m90268r(RemittanceBusiUI.this.f204548U), 10);
                    if (!Util.isNullOrNil(RemittanceBusiUI.this.f204551V)) {
                        RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                        str = remittanceBusiUI2.getString(C0966R.string.i0b, new Object[]{str, remittanceBusiUI2.f204551V});
                    }
                } else {
                    str = RemittanceBusiUI.this.f204605q1.f204053r;
                }
                TextView textView = RemittanceBusiUI.this.f204575e;
                RemittanceBusiUI remittanceBusiUI3 = RemittanceBusiUI.this;
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(remittanceBusiUI3, str, remittanceBusiUI3.f204575e.getTextSize()));
                RemittanceBusiUI remittanceBusiUI4 = RemittanceBusiUI.this;
                BusiRemittanceResp busiRemittanceResp2 = remittanceBusiUI4.f204605q1;
                if (busiRemittanceResp2 == null) {
                    remittanceBusiUI4.f204621y.setVisibility(8);
                } else if (busiRemittanceResp2.f204042d != 1) {
                    remittanceBusiUI4.f204621y.setVisibility(8);
                } else if (!Util.isNullOrNil(busiRemittanceResp2.f204043e)) {
                    RemittanceBusiUI remittanceBusiUI5 = RemittanceBusiUI.this;
                    if (remittanceBusiUI5.f204605q1.f204052q == 1) {
                        remittanceBusiUI5.f204621y.setRoundCorner(true);
                    } else {
                        remittanceBusiUI5.f204621y.setRoundCorner(false);
                    }
                    int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(RemittanceBusiUI.this, 36.0f);
                    RemittanceBusiUI remittanceBusiUI6 = RemittanceBusiUI.this;
                    remittanceBusiUI6.f204621y.mo100288c(remittanceBusiUI6.f204605q1.f204043e, fromDPToPix, fromDPToPix, -1);
                } else if (Util.isNullOrNil(RemittanceBusiUI.this.f204548U)) {
                    RemittanceBusiUI.this.f204621y.setVisibility(8);
                } else if (RemittanceBusiUI.this.f204605q1.f204052q == 1) {
                    RemittanceBusiUI remittanceBusiUI7 = RemittanceBusiUI.this;
                    ((C76705f) C86312j.m106911c(cls)).mo106822J5(remittanceBusiUI7.f204621y, remittanceBusiUI7.f204548U);
                } else {
                    RemittanceBusiUI remittanceBusiUI8 = RemittanceBusiUI.this;
                    ((C76705f) C86312j.m106911c(cls)).mo106849z(remittanceBusiUI8.f204621y, remittanceBusiUI8.f204548U);
                }
            }
        });
        if (this.f204598n1) {
            this.f204509C.setVisibility(8);
            this.f204511D.setVisibility(0);
            this.f204513E.setHint(this.f204600o1);
            this.f204513E.addTextChangedListener(new TextWatcher() {
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void afterTextChanged(android.text.Editable r7) {
                    /*
                        r6 = this;
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r0 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        boolean r1 = r0.f204598n1
                        if (r1 == 0) goto L_0x0025
                        android.widget.Button r0 = r0.f204523J
                        int r0 = r0.getVisibility()
                        if (r0 != 0) goto L_0x0025
                        int r0 = r7.length()
                        if (r0 <= 0) goto L_0x0025
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r0 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        double r1 = r0.f204545T
                        r3 = 0
                        int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                        if (r5 <= 0) goto L_0x0025
                        android.widget.Button r0 = r0.f204523J
                        r1 = 1
                        r0.setEnabled(r1)
                        goto L_0x002d
                    L_0x0025:
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r0 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        android.widget.Button r0 = r0.f204523J
                        r1 = 0
                        r0.setEnabled(r1)
                    L_0x002d:
                        int r0 = r7.length()
                        if (r0 <= 0) goto L_0x003c
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r0 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        java.lang.String r7 = r7.toString()
                        r0.f204557X = r7
                        goto L_0x0042
                    L_0x003c:
                        com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI r7 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.this
                        java.lang.String r0 = ""
                        r7.f204557X = r0
                    L_0x0042:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C7070053.afterTextChanged(android.text.Editable):void");
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            this.f204513E.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(View view, boolean z) {
                    if (view.isFocused()) {
                        RemittanceBusiUI.this.f204513E.setHint("");
                        ((InputMethodManager) RemittanceBusiUI.this.getContext().getSystemService("input_method")).showSoftInput(RemittanceBusiUI.this.f204513E, 0);
                    } else if (RemittanceBusiUI.this.f204513E.getText().length() <= 0) {
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        remittanceBusiUI.f204513E.setHint(remittanceBusiUI.f204600o1);
                    }
                }
            });
        } else {
            this.f204511D.setVisibility(8);
            this.f204509C.setVisibility(0);
            mo97333g8();
        }
        final C707088 r1 = new C7089c0() {
            /* renamed from: a */
            public void mo2066a(View view) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(15235, 5);
                if (RemittanceBusiUI.this.f204563Z == 56) {
                    nVar.mo160131h(19821, 8, RemittanceBusiUI.this.f204532N1, 0);
                }
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                if (!remittanceBusiUI.f204549U0) {
                    remittanceBusiUI.f204545T = remittanceBusiUI.mo97320T7();
                }
                RemittanceBusiUI remittanceBusiUI2 = RemittanceBusiUI.this;
                if (remittanceBusiUI2.f204545T <= 0.0d) {
                    C76912y0.makeText((Context) remittanceBusiUI2.getContext(), (int) C0966R.string.kmc, 0).show();
                    return;
                }
                long S7 = remittanceBusiUI2.mo97319S7();
                Object[] objArr = new Object[3];
                C70590i iVar = RemittanceBusiUI.this.f204620x1;
                objArr[0] = iVar;
                String str = "";
                if (iVar != null) {
                    str = RemittanceBusiUI.this.f204620x1.f204124j + str;
                }
                objArr[1] = str;
                objArr[2] = Boolean.valueOf(RemittanceBusiUI.this.f204615v1);
                Log.m105925i("MicroMsg.RemittanceBusiUI", "mPayBtn onClick %s  isFinish:%s getFavorFlag: %s", objArr);
                RemittanceBusiUI remittanceBusiUI3 = RemittanceBusiUI.this;
                if (remittanceBusiUI3.f204539R != 32) {
                    RemittanceBusiUI.m83181H7(remittanceBusiUI3);
                } else if (remittanceBusiUI3.f204615v1) {
                    C70590i iVar2 = remittanceBusiUI3.f204620x1;
                    if (iVar2 == null || iVar2.f204127p != ((int) S7)) {
                        remittanceBusiUI3.mo97331e8(new C70582d() {
                            /* renamed from: a */
                            public void mo97246a(List<C77912ce0> list) {
                                RemittanceBusiUI.m83181H7(RemittanceBusiUI.this);
                            }
                        }, (C70583e) null, 0);
                    } else if (iVar2 != null && iVar2.f204124j) {
                        RemittanceBusiUI.m83181H7(remittanceBusiUI3);
                    } else if (iVar2 != null) {
                        iVar2.f204122h = new C70582d() {
                            /* renamed from: a */
                            public void mo97246a(List<C77912ce0> list) {
                                RemittanceBusiUI.m83181H7(RemittanceBusiUI.this);
                            }
                        };
                    }
                } else {
                    RemittanceBusiUI.m83181H7(remittanceBusiUI3);
                }
            }
        };
        this.f204624z.getContentEt().setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                    Log.m105924i("MicroMsg.RemittanceBusiUI", "click enter");
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    if (remittanceBusiUI.f204598n1) {
                        remittanceBusiUI.hideWcKb();
                        RemittanceBusiUI.this.f204513E.requestFocus();
                        InputMethodManager inputMethodManager = (InputMethodManager) RemittanceBusiUI.this.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(RemittanceBusiUI.this.f204513E, 0);
                        }
                    } else {
                        r1.onClick((View) null);
                    }
                }
                return true;
            }
        });
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.lh5);
        if (C85875k4.m106211z()) {
            View findViewById = findViewById(C0966R.C0970id.lh_);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view2 = findViewById2;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf7);
        } else {
            View findViewById3 = findViewById(C0966R.C0970id.lh_);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view3 = findViewById3;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById4 = findViewById(C0966R.C0970id.lh7);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view4 = findViewById4;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setBackgroundResource(C0966R.C0969drawable.cf6);
        }
        this.f204523J.setOnClickListener(r1);
        setTenpayKBStateListener(new C75217h() {
            public void onVisibleStateChange(boolean z) {
                RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                int i = RemittanceBusiUI.f204504l2;
                remittanceBusiUI.getClass();
                if (!z) {
                    RemittanceBusiUI.this.f204536Q.scrollTo(0, 0);
                    WalletFormView walletFormView = RemittanceBusiUI.this.f204624z;
                    if (walletFormView != null && walletFormView.getVisibility() == 0) {
                        RemittanceBusiUI.this.f204624z.setFocusable(false);
                    }
                }
            }
        });
        this.f204529M = (RelativeLayout) findViewById(C0966R.C0970id.lh6);
        if (LocaleUtil.getApplicationLanguage().equals("zh_CN") || LocaleUtil.getApplicationLanguage().equals("zh_TW") || LocaleUtil.getApplicationLanguage().equals("zh_HK")) {
            this.f204525K = (RelativeLayout) findViewById(C0966R.C0970id.lh8);
            this.f204527L = (TextView) findViewById(C0966R.C0970id.lha);
            this.f204525K.post(new Runnable() {
                public void run() {
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    remittanceBusiUI.f204546T0 = remittanceBusiUI.f204525K.getWidth();
                    RemittanceBusiUI.this.f204529M.setVisibility(8);
                    Log.m105919d("MicroMsg.RemittanceBusiUI", "post: mMaxUnitWidth:%s", Integer.valueOf(RemittanceBusiUI.this.f204546T0));
                }
            });
            this.f204624z.setmWalletFormViewListener(new WalletFormView.C75211e() {
                /* renamed from: a */
                public void mo93874a(CharSequence charSequence) {
                    if (Util.isEqual(RemittanceBusiUI.this.f204543S0, 0)) {
                        Log.m105924i("MicroMsg.RemittanceBusiUI", "mAmountRemindBit == 0");
                        RemittanceBusiUI.this.f204529M.setVisibility(8);
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
                    RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                    if (i >= remittanceBusiUI.f204543S0) {
                        int i3 = remittanceBusiUI.f204624z.mo105091i(charSequence, remittanceBusiUI.f204546T0, i2);
                        if (i3 != 0) {
                            RemittanceBusiUI.this.f204529M.setVisibility(0);
                            RemittanceBusiUI.this.f204527L.setText(C75157y0.m90139b(i));
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceBusiUI.this.f204525K.getLayoutParams();
                            layoutParams.leftMargin = i3;
                            RemittanceBusiUI.this.f204525K.setLayoutParams(layoutParams);
                            return;
                        }
                        RemittanceBusiUI.this.f204529M.setVisibility(8);
                        return;
                    }
                    remittanceBusiUI.f204529M.setVisibility(8);
                }
            });
        } else {
            this.f204529M.setVisibility(8);
        }
        BusiRemittanceResp busiRemittanceResp2 = this.f204605q1;
        if (!(busiRemittanceResp2 == null || (sjVar = busiRemittanceResp2.f204049n) == null)) {
            C70883e eVar = this.f204607r1;
            eVar.f205297b = sjVar;
            eVar.mo97552a(sjVar.f228222f);
        }
        if (mo97330d8()) {
            C115669n.INSTANCE.mo160131h(15235, 2);
            this.f204624z.getContentEt().setTextSize(1, 40.0f);
            this.f204624z.getTitleTv().setTextSize(1, 40.0f);
            this.f204515F.setTextSize(1, 40.0f);
            this.f204581g.setTextSize(1, 32.0f);
            this.f204521I.setTextSize(1, 56.0f);
            this.f204519H.setTextSize(1, 56.0f);
        } else {
            this.f204624z.getContentEt().setTextSize(1, 56.0f);
            this.f204624z.getTitleTv().setTextSize(1, 56.0f);
            this.f204515F.setTextSize(1, 56.0f);
            this.f204581g.setTextSize(1, 48.0f);
            this.f204521I.setTextSize(1, 56.0f);
            this.f204519H.setTextSize(1, 56.0f);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ilz);
        this.f204535P1 = linearLayout;
        this.f204538Q1 = (LinearLayout) linearLayout.findViewById(C0966R.C0970id.f359074io2);
        this.f204541R1 = (TextView) this.f204535P1.findViewById(C0966R.C0970id.io5);
        this.f204544S1 = (CdnImageView) this.f204535P1.findViewById(C0966R.C0970id.f359075io3);
        this.f204547T1 = (CdnImageView) this.f204535P1.findViewById(C0966R.C0970id.io4);
        BusiRemittanceResp busiRemittanceResp3 = this.f204605q1;
        if (busiRemittanceResp3 != null) {
            dz4 dz4 = busiRemittanceResp3.f204050o;
            if (dz4 == null || dz4.f132590d != 1 || (ez4 = dz4.f132591e) == null || Util.isNullOrNil(ez4.f133210d)) {
                Log.m105924i("MicroMsg.RemittanceBusiUI", " do not show WarningView");
                this.f204535P1.setVisibility(8);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f204533O1.getLayoutParams();
                layoutParams.removeRule(3);
                layoutParams.topMargin = C76577a.m92151b(getContext(), 0);
                this.f204533O1.setLayoutParams(layoutParams);
                mo97326Z7(32);
            } else {
                dz4 dz42 = busiRemittanceResp3.f204050o;
                final ez4 ez42 = dz42.f132591e;
                this.f204535P1.setVisibility(0);
                Log.m105925i("MicroMsg.RemittanceBusiUI", " warning textInfo.wording:%s", ez42.f133210d);
                this.f204541R1.setText(ez42.f133210d);
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132593g)) {
                    this.f204541R1.setTextColor(C75228t.m90235a0(dz42.f132592f));
                } else {
                    this.f204541R1.setTextColor(C75228t.m90235a0(dz42.f132593g));
                }
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 20.0f);
                int fromDPToPix2 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 8.0f);
                int fromDPToPix3 = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 16.0f);
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132595i)) {
                    this.f204544S1.mo100288c(dz42.f132594h, fromDPToPix, fromDPToPix, -1);
                } else {
                    this.f204544S1.mo100288c(dz42.f132595i, fromDPToPix, fromDPToPix, -1);
                }
                if (!C85875k4.m106211z() || Util.isNullOrNil(dz42.f132597n)) {
                    this.f204547T1.mo100288c(dz42.f132596j, fromDPToPix2, fromDPToPix3, -1);
                } else {
                    this.f204547T1.mo100288c(dz42.f132597n, fromDPToPix2, fromDPToPix3, -1);
                }
                this.f204535P1.postDelayed(new Runnable() {
                    public void run() {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) RemittanceBusiUI.this.f204538Q1.getLayoutParams();
                        layoutParams.width = RemittanceBusiUI.this.f204547T1.getRight() + C76577a.m92151b(RemittanceBusiUI.this.getContext(), 8);
                        layoutParams.height = C76577a.m92151b(RemittanceBusiUI.this.getContext(), 36);
                        RemittanceBusiUI.this.f204538Q1.setLayoutParams(layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) RemittanceBusiUI.this.f204533O1.getLayoutParams();
                        layoutParams2.addRule(3, C0966R.C0970id.ilz);
                        layoutParams2.topMargin = C76577a.m92151b(RemittanceBusiUI.this.getContext(), 16);
                        RemittanceBusiUI.this.f204533O1.setLayoutParams(layoutParams2);
                        RemittanceBusiUI.this.mo97326Z7(0);
                        RemittanceBusiUI remittanceBusiUI = RemittanceBusiUI.this;
                        remittanceBusiUI.f204541R1.setMaxWidth((((remittanceBusiUI.f204535P1.getWidth() - C76577a.m92151b(RemittanceBusiUI.this.getContext(), 20)) - C76577a.m92151b(RemittanceBusiUI.this.getContext(), 8)) - C76577a.m92151b(RemittanceBusiUI.this.getContext(), 12)) - C76577a.m92151b(RemittanceBusiUI.this.getContext(), 16));
                    }
                }, 10);
                this.f204538Q1.setClickable(true);
                this.f204538Q1.setOnClickListener(new C7089c0() {
                    /* renamed from: a */
                    public void mo2066a(View view) {
                        ez4 ez4 = ez42;
                        Log.m105925i("MicroMsg.RemittanceBusiUI", " click option item : %s ,type:%s", ez4.f133210d, Integer.valueOf(ez4.f133211e.f132043d));
                        cz4 cz4 = ez42.f133211e;
                        int i = cz4.f132043d;
                        if (i == 1) {
                            Log.m105925i("MicroMsg.RemittanceBusiUI", " textInfo.jumpInfo.url ：%s", cz4.f132044e);
                            C75228t.m90219L(RemittanceBusiUI.this.getContext(), ez42.f133211e.f132044e, false);
                        } else if (i == 2) {
                            Log.m105925i("MicroMsg.RemittanceBusiUI", " textInfo.jumpInfo.username ：%s", cz4.f132045f);
                            cz4 cz42 = ez42.f133211e;
                            C75228t.m90224Q(cz42.f132045f, cz42.f132046g, 0, 1000);
                        } else if (i != 3) {
                            Log.m105920e("MicroMsg.RemittanceBusiUI", "unknow text info type");
                        } else {
                            Log.m105920e("MicroMsg.RemittanceBusiUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                        }
                    }
                });
            }
            Util.isNullOrNil(this.f204605q1.f204057v);
            if (!Util.isNullOrNil(this.f204605q1.f204058w)) {
                this.f204606r.setText(this.f204605q1.f204058w);
            }
        }
    }

    public boolean isHandleAutoShowNormalStWcKb() {
        return this.mKindaEnable ? !this.f204510C1 && !this.f204549U0 && this.f204534P.mo104746j() : !this.f204549U0 && this.f204534P.mo104746j();
    }

    /* renamed from: j8 */
    public final void mo97335j8() {
        double T7 = mo97320T7();
        this.f204545T = T7;
        if (T7 <= 0.0d) {
            this.f204597n.setClickable(false);
            this.f204597n.setEnabled(false);
            this.f204597n.setOnClickListener((View.OnClickListener) null);
            WcPayKeyboard wcPayKeyboard = this.f204534P;
            if (wcPayKeyboard != null) {
                wcPayKeyboard.mo104738c(false);
            }
            this.f204523J.setEnabled(false);
            return;
        }
        this.f204597n.setEnabled(true);
        this.f204597n.setClickable(true);
        WcPayKeyboard wcPayKeyboard2 = this.f204534P;
        if (wcPayKeyboard2 != null) {
            wcPayKeyboard2.mo104738c(true);
        }
        if (!this.f204598n1) {
            this.f204523J.setEnabled(true);
        } else if (this.f204523J.getVisibility() != 0 || Util.isNullOrNil((CharSequence) this.f204513E.getText())) {
            this.f204523J.setEnabled(false);
        } else {
            this.f204523J.setEnabled(true);
        }
        this.f204597n.setOnClickListener(new C7089c0() {
            /* renamed from: a */
            public void mo2066a(View view) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(15235, 3);
                if (RemittanceBusiUI.this.f204563Z == 56) {
                    nVar.mo160131h(19821, 7, RemittanceBusiUI.this.f204532N1, 0);
                }
                RemittanceBusiUI.m83182I7(RemittanceBusiUI.this);
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = false;
        Log.m105925i("MicroMsg.RemittanceBusiUI", "onActivityResult requestCode %s resultCode %s %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        if (i == 3) {
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = this.f204518G1;
            if (remittanceF2fDynamicCodeUI != null) {
                remittanceF2fDynamicCodeUI.hideProgress();
                this.f204518G1 = null;
            }
            if (i2 == -1) {
                z = true;
            }
            mo97323W7(z, intent);
        } else if (i == 1) {
            if (i2 == -1) {
                z = true;
            }
            mo97323W7(z, intent);
        } else if (i == 2) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("INTENT_RESULT_TOKEN");
                this.f204579f1 = stringExtra;
                this.f204617w1 = 0.0d;
                Log.m105925i("MicroMsg.RemittanceBusiUI", "onActivityResult _result_token: %s", stringExtra);
                mo97316P7(false, intent.getStringExtra("INTENT_REQKEY"));
            } else {
                mo97332f8();
            }
        } else if (i == 4) {
            this.f204526K1 = true;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r0 = "pay_channel"
            r1 = 0
            int r11 = r11.getIntExtra(r0, r1)
            r2 = 4
            r3 = 2
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 56
            if (r11 != r6) goto L_0x0049
            r11 = 2130772182(0x7f0100d6, float:1.7147475E38)
            r6 = 2130772177(0x7f0100d1, float:1.7147465E38)
            r10.overridePendingTransition(r11, r6)
            android.content.Intent r11 = r10.getIntent()
            java.lang.String r6 = "app_id"
            java.lang.String r11 = r11.getStringExtra(r6)
            r10.f204532N1 = r11
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 19821(0x4d6d, float:2.7775E-41)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r7[r1] = r8
            java.lang.String r8 = r10.f204532N1
            r7[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r7[r3] = r8
            r11.mo160131h(r6, r7)
        L_0x0049:
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 15235(0x3b83, float:2.1349E-41)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r1] = r5
            r11.mo160131h(r6, r7)
            androidx.appcompat.app.ActionBar r6 = r10.getSupportActionBar()
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131101246(0x7f06063e, float:1.7814896E38)
            int r8 = r8.getColor(r9)
            r7.<init>(r8)
            r6.mo91112w(r7)
            androidx.appcompat.app.ActionBar r6 = r10.getSupportActionBar()
            android.view.View r6 = r6.mo91099j()
            if (r6 == 0) goto L_0x0092
            r7 = 16908308(0x1020014, float:2.3877285E-38)
            android.view.View r6 = r6.findViewById(r7)
            if (r6 == 0) goto L_0x0092
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L_0x0092
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.content.res.Resources r7 = r10.getResources()
            r8 = 2131101252(0x7f060644, float:1.7814908E38)
            int r7 = r7.getColor(r8)
            r6.setTextColor(r7)
        L_0x0092:
            android.view.Window r6 = r10.getWindow()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.addFlags(r7)
            android.content.res.Resources r7 = r10.getResources()
            int r7 = r7.getColor(r9)
            r6.setStatusBarColor(r7)
            r6 = 21
            boolean r6 = p206nj.C11171e.m11046c(r6)
            if (r6 == 0) goto L_0x00cd
            r6 = 23
            boolean r6 = p206nj.C11171e.m11046c(r6)
            if (r6 == 0) goto L_0x00b7
            goto L_0x00cd
        L_0x00b7:
            android.view.Window r6 = r10.getWindow()
            androidx.appcompat.app.AppCompatActivity r7 = r10.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131099720(0x7f060048, float:1.7811801E38)
            int r7 = r7.getColor(r8)
            r6.setStatusBarColor(r7)
        L_0x00cd:
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$3 r6 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$3
            r6.<init>()
            r7 = 2131755023(0x7f10000f, float:1.9140914E38)
            r10.setBackBtn(r6, r7)
            r6 = 1633(0x661, float:2.288E-42)
            r10.addSceneEndListener(r6)
            r6 = 1241(0x4d9, float:1.739E-42)
            r10.addSceneEndListener(r6)
            r6 = 2677(0xa75, float:3.751E-42)
            r10.addSceneEndListener(r6)
            r6 = 2504(0x9c8, float:3.509E-42)
            r10.addSceneEndListener(r6)
            r6 = 2702(0xa8e, float:3.786E-42)
            r10.addSceneEndListener(r6)
            r6 = 2682(0xa7a, float:3.758E-42)
            r10.addSceneEndListener(r6)
            cr3.c<com.tencent.mm.plugin.remittance.model.n> r7 = r10.f204562Y1
            r10.regeistQueryOrder(r6, r7)
            r6 = 2131834688(0x7f113740, float:1.9302493E38)
            r10.setMMTitle((int) r6)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$1 r6 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$1
            r6.<init>()
            r10.setBackBtn(r6)
            android.content.Intent r6 = r10.getIntent()
            int r6 = r6.getIntExtra(r0, r1)
            r7 = 71
            if (r6 != r7) goto L_0x012f
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2131755025(0x7f100011, float:1.9140918E38)
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            android.graphics.drawable.Drawable r6 = r6.mutate()
            r7 = 2131099650(0x7f060002, float:1.781166E38)
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.SRC_IN
            r6.setColorFilter(r7, r8)
            r10.updateBackBtn(r6)
        L_0x012f:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            r10.f204514E1 = r6
            c53.C67342b.m79685d(r6)
            android.content.Intent r6 = r10.getIntent()
            r7 = 31
            java.lang.String r8 = "pay_scene"
            int r6 = r6.getIntExtra(r8, r7)
            r10.f204539R = r6
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r7 = "scan_remittance_id"
            java.lang.String r6 = r6.getStringExtra(r7)
            r10.f204542S = r6
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r7 = "fee"
            r8 = 0
            double r6 = r6.getDoubleExtra(r7, r8)
            r10.f204545T = r6
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r7 = "receiver_name"
            java.lang.String r6 = r6.getStringExtra(r7)
            r10.f204548U = r6
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r7 = "receiver_true_name"
            java.lang.String r6 = r6.getStringExtra(r7)
            r10.f204551V = r6
            android.content.Intent r6 = r10.getIntent()
            java.lang.String r7 = "receiver_true_name_busi"
            r6.getStringExtra(r7)
            android.content.Intent r6 = r10.getIntent()
            int r0 = r6.getIntExtra(r0, r1)
            r10.f204563Z = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "desc"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204554W = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "busi_type"
            int r0 = r0.getIntExtra(r6, r1)
            r10.f204619x0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "mch_name"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204622y0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "mch_type"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204564Z0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "mch_time"
            int r0 = r0.getIntExtra(r6, r1)
            r10.f204570c1 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "mch_info"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204537Q0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "get_pay_wifi"
            int r0 = r0.getIntExtra(r6, r1)
            r10.f204568b1 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "rcvr_open_id"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204566a1 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "rcvr_ticket"
            java.lang.String r0 = r0.getStringExtra(r6)
            r10.f204602p0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r6 = "amount_remind_bit"
            int r0 = r0.getIntExtra(r6, r2)
            r10.f204543S0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "qq_extend_info"
            java.lang.String r0 = r0.getStringExtra(r2)
            r10.f204540R0 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "qrcode_sender_username"
            java.lang.String r0 = r0.getStringExtra(r2)
            r10.f204560Y = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "receiver_tips"
            java.lang.String r0 = r0.getStringExtra(r2)
            r10.f204596m1 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "payer_desc_required"
            boolean r0 = r0.getBooleanExtra(r2, r1)
            r10.f204598n1 = r0
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "payer_desc_placeholder"
            java.lang.String r0 = r0.getStringExtra(r2)
            r10.f204600o1 = r0
            boolean r2 = r10.f204598n1
            if (r2 == 0) goto L_0x0266
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0266
            r0 = 2131834691(0x7f113743, float:1.93025E38)
            java.lang.String r0 = r10.getString(r0)
            r10.f204600o1 = r0
        L_0x0266:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r2 = "BusiRemittanceResp"
            android.os.Parcelable r0 = r0.getParcelableExtra(r2)
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r0 = (com.tencent.p014mm.plugin.remittance.model.BusiRemittanceResp) r0
            r10.f204605q1 = r0
            java.lang.String r2 = "MicroMsg.RemittanceBusiUI"
            if (r0 == 0) goto L_0x0302
            com.tencent.mm.plugin.remittance.ui.b r0 = new com.tencent.mm.plugin.remittance.ui.b
            androidx.appcompat.app.AppCompatActivity r6 = r10.getContext()
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r7 = r10.f204605q1
            te3.fb0 r7 = r7.f204056u
            r0.<init>(r6, r7)
            r10.f204609s1 = r0
            int r0 = r10.f204539R
            r6 = 32
            if (r0 != r6) goto L_0x02a1
            com.tencent.mm.plugin.remittance.model.BusiRemittanceResp r0 = r10.f204605q1
            int r6 = r0.f204051p
            if (r6 == r4) goto L_0x029f
            if (r0 == 0) goto L_0x02a1
            java.util.List<te3.ce0> r0 = r0.f204048j
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02a1
        L_0x029f:
            r0 = 1
            goto L_0x02a2
        L_0x02a1:
            r0 = 0
        L_0x02a2:
            com.tencent.mm.plugin.remittance.ui.b r6 = r10.f204609s1
            boolean r6 = r6.mo97545d()
            if (r6 != 0) goto L_0x02af
            if (r0 == 0) goto L_0x02ad
            goto L_0x02af
        L_0x02ad:
            r0 = 0
            goto L_0x02b0
        L_0x02af:
            r0 = 1
        L_0x02b0:
            r10.f204615v1 = r0
            double r6 = r10.f204545T
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x02bb
            r10.f204549U0 = r4
            goto L_0x02bd
        L_0x02bb:
            r10.f204549U0 = r1
        L_0x02bd:
            int r0 = r10.f204619x0
            if (r0 != 0) goto L_0x02ca
            java.lang.String r0 = "wrong busi type!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            r10.finish()
        L_0x02ca:
            r0 = 15386(0x3c1a, float:2.156E-41)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r1] = r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2[r4] = r1
            r11.mo160131h(r0, r2)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$MoneyFontSize r11 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$MoneyFontSize
            r0 = 40
            r1 = 1090519040(0x41000000, float:8.0)
            r11.<init>(r0, r0, r1)
            r10.f204625z1 = r11
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$MoneyFontSize r11 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$MoneyFontSize
            r11.<init>(r0, r0, r1)
            r10.f204506A1 = r11
            r10.initView()
            r10.mo97335j8()
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BusiF2fPaySuccEvent> r11 = r10.f204567a2
            r11.alive()
            com.tencent.mm.sdk.event.IListener r11 = r10.f204594k2
            r11.alive()
            boolean r11 = r10.f204549U0
            if (r11 != 0) goto L_0x0301
            r10.f204553V1 = r4
        L_0x0301:
            return
        L_0x0302:
            java.lang.String r11 = "busi resp is null, maybe recreate activity!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r11)
            r10.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f204583g2.dead();
        this.f204592j2.dead();
        this.f204586h2.dead();
        this.f204589i2.dead();
        removeSceneEndListener(1633);
        removeSceneEndListener(1241);
        removeSceneEndListener(2677);
        removeSceneEndListener(2504);
        removeSceneEndListener(2702);
        removeSceneEndListener(2682);
        this.f204567a2.dead();
        this.f204594k2.dead();
        C67342b.m79684c(this.f204514E1);
        MMHandlerThread.removeRunnable(this.f204556W1);
    }

    public void onDialogDismiss(Dialog dialog) {
        Log.m105924i("MicroMsg.RemittanceBusiUI", "onDialogDismiss()");
        MMHandlerThread.postToMainThreadDelayed(this.f204556W1, 300);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        WcPayKeyboard wcPayKeyboard = this.f204534P;
        if (wcPayKeyboard == null || !wcPayKeyboard.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        Log.m105926v("MicroMsg.RemittanceBusiUI", "onNewIntent");
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.RemittanceBusiUI", "onPause()");
        if (!this.f204549U0 && !this.f204534P.mo104747k()) {
            this.f204553V1 = 3;
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.RemittanceBusiUI", "onResume()");
        C70887f0.m83406d();
        C70887f0.C70888a.f205300a.mo97555a(this);
        if (this.f204553V1 == 3 && isHandleAutoShowNormalStWcKb() && !this.f204598n1) {
            showNormalStWcKb();
        }
        if (!this.f204549U0) {
            this.f204553V1 = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x041d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r32, int r33, java.lang.String r34, ob0.C117747y r35) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r33
            r3 = r35
            st1.h0 r4 = st1.C77761h0.IML
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.remittance.model.C70604k
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 3
            r10 = 2
            java.lang.String r11 = "MicroMsg.RemittanceBusiUI"
            if (r5 == 0) goto L_0x04a9
            r5 = r3
            com.tencent.mm.plugin.remittance.model.k r5 = (com.tencent.p014mm.plugin.remittance.model.C70604k) r5
            boolean r12 = r1.mKindaEnable
            java.lang.String r13 = "getContext() == null"
            java.lang.String r14 = "MicroMsg.RemittanceBusiDialogMgr"
            if (r12 != 0) goto L_0x0046
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r12 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            java.lang.String r15 = "hideProgress()"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r15)
            java.lang.ref.WeakReference<android.content.Context> r12 = r12.f205299a
            java.lang.Object r12 = r12.get()
            android.content.Context r12 = (android.content.Context) r12
            if (r12 != 0) goto L_0x0038
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            goto L_0x0046
        L_0x0038:
            boolean r15 = r12 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI
            if (r15 == 0) goto L_0x003d
            goto L_0x0046
        L_0x003d:
            boolean r15 = r12 instanceof com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI
            if (r15 == 0) goto L_0x0046
            com.tencent.mm.wallet_core.ui.WalletBaseUI r12 = (com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI) r12
            r12.hideProgress()
        L_0x0046:
            if (r0 != 0) goto L_0x049a
            if (r2 != 0) goto L_0x049a
            te3.yj r0 = r5.f204235e
            int r2 = r0.f228597d
            if (r2 != 0) goto L_0x0427
            r1.f204530M1 = r5
            java.lang.String r2 = r0.f228602i
            r1.f204555W0 = r2
            java.lang.String r2 = r0.f228607q
            r1.f204558X0 = r2
            java.lang.String r2 = r0.f228603j
            r1.f204561Y0 = r2
            java.lang.String r2 = r0.f228605o
            r1.f204611t1 = r2
            java.lang.String r2 = r0.f228604n
            r1.f204613u1 = r2
            java.lang.String r2 = r0.f228612v
            r1.f204573d1 = r2
            te3.eh4 r2 = r0.f228611u
            r1.f204576e1 = r2
            int r2 = r0.f228615y
            r1.f204582g1 = r2
            int r2 = r0.f228613w
            r1.f204585h1 = r2
            int r2 = r0.f228614x
            r1.f204588i1 = r2
            te3.rj r0 = r0.f228593I
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "flag"
            int r12 = r0.f228169d     // Catch:{ Exception -> 0x00a1 }
            r2.put(r3, r12)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "succpage_first_delay_ms"
            int r12 = r0.f228170e     // Catch:{ Exception -> 0x00a1 }
            r2.put(r3, r12)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "succpage_max_retry_cnt"
            int r12 = r0.f228171f     // Catch:{ Exception -> 0x00a1 }
            r2.put(r3, r12)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = "succpage_retry_waiting_ms"
            int r0 = r0.f228172g     // Catch:{ Exception -> 0x00a1 }
            r2.put(r3, r0)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00b1
        L_0x00a1:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r3[r8] = r0
            java.lang.String r0 = "MicroMsg.NetSceneBusiF2fPlaceOrder"
            java.lang.String r12 = "getBusiF2FFaultConfigJSONObject() Exception: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r12, r3)
        L_0x00b1:
            java.lang.String r0 = r2.toString()
            r1.f204593k1 = r0
            te3.yj r0 = r5.f204235e
            te3.rj r2 = r0.f228593I
            if (r2 == 0) goto L_0x00c1
            int r2 = r2.f228169d
            r1.f204595l1 = r2
        L_0x00c1:
            java.lang.Object[] r2 = new java.lang.Object[r9]
            pe3.b r3 = r0.f228616z
            r2[r8] = r3
            int r0 = r0.f228585A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r7] = r0
            java.lang.String r0 = r1.f204593k1
            r2[r10] = r0
            java.lang.String r0 = "touch_challenge: %s need_change_auth_key: %s mBusiF2FFaultConfig: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r0, r2)
            te3.yj r0 = r5.f204235e
            pe3.b r0 = r0.f228616z
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = r0.mo123705h()
            r4.f226590d = r0
        L_0x00e5:
            te3.yj r0 = r5.f204235e
            int r0 = r0.f228585A
            if (r0 != r7) goto L_0x00ed
            r0 = 1
            goto L_0x00ee
        L_0x00ed:
            r0 = 0
        L_0x00ee:
            r4.f226592f = r0
            boolean r0 = r1.mo97327a8(r5)
            if (r0 != 0) goto L_0x0422
            java.lang.String r0 = "showNameVerifyDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            te3.yj r0 = r5.f204235e
            te3.qu r0 = r0.f228596L
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "orderScene.response.check_recv_name_win is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r0)
            goto L_0x01af
        L_0x010a:
            r31.showCircleStWcKb()
            r31.mo97322V7()
            te3.yj r0 = r5.f204235e
            te3.qu r0 = r0.f228596L
            java.lang.String r3 = r0.f185072d
            java.lang.String r4 = r0.f185073e
            java.lang.String r9 = r0.f185076h
            te3.gl2 r10 = r0.f185074f
            java.lang.String r10 = r10.f227478d
            te3.gl2 r0 = r0.f185075g
            java.lang.String r0 = r0.f227478d
            com.tencent.mm.plugin.remittance.ui.k r12 = new com.tencent.mm.plugin.remittance.ui.k
            r12.<init>(r1)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$48 r15 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$48
            r15.<init>(r5)
            r12.f205320b = r15
            r15 = 2131497083(0x7f0c107b, float:1.861775E38)
            android.view.View r15 = android.view.View.inflate(r1, r15, r6)
            r2 = 2131306984(0x7f0929e8, float:1.8232183E38)
            android.view.View r2 = r15.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r6 = 2131304923(0x7f0921db, float:1.8228002E38)
            android.view.View r6 = r15.findViewById(r6)
            android.widget.EditText r6 = (android.widget.EditText) r6
            r8 = 2131300367(0x7f09100f, float:1.8218762E38)
            android.view.View r8 = r15.findViewById(r8)
            com.tencent.mm.ui.widget.MMNeat7extView r8 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r8
            r8.mo104279b(r4)
            r2.setText(r9)
            android.content.Context r2 = r12.f205319a
            qo3.a r4 = new qo3.a
            r4.<init>()
            r4.f225644a = r3
            r4.f225627J = r15
            qn3.c r3 = qn3.C77382c.m93286b(r6)
            com.tencent.mm.ui.tools.p0$a r8 = com.tencent.p014mm.p136ui.tools.C45078p0.C45079a.MODE_CHINESE_AS_1
            r3.f225612f = r8
            r3.f225611e = r7
            r3.f225610d = r7
            r8 = 0
            r3.f225607a = r8
            r8 = 0
            r3.mo107499d(r8)
            com.tencent.mm.plugin.remittance.ui.p r3 = new com.tencent.mm.plugin.remittance.ui.p
            r3.<init>(r12, r6)
            r8 = 200(0xc8, double:9.9E-322)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r8)
            r4.f225663t = r0
            r0 = -2141754475(0xffffffff80576b95, float:-8.028281E-39)
            r4.f225638U = r0
            com.tencent.mm.plugin.remittance.ui.q r0 = new com.tencent.mm.plugin.remittance.ui.q
            r0.<init>(r12, r6)
            r4.f225620C = r0
            r3 = 0
            r4.f225641X = r3
            r4.f225664u = r10
            com.tencent.mm.plugin.remittance.ui.i r0 = new com.tencent.mm.plugin.remittance.ui.i
            r0.<init>(r12)
            r4.f225621D = r0
            qo3.g r0 = new qo3.g
            r3 = 2131887328(0x7f1204e0, float:1.940926E38)
            r0.<init>(r2, r3)
            r0.mo107525e(r4)
            r0.show()
            com.tencent.mm.plugin.remittance.ui.j r2 = new com.tencent.mm.plugin.remittance.ui.j
            r2.<init>(r12, r6, r0)
            r6.addTextChangedListener(r2)
            r8 = 1
        L_0x01af:
            if (r8 != 0) goto L_0x04a6
            te3.yj r0 = r5.f204235e
            te3.t4 r2 = r0.f228594J
            r3 = 8
            if (r2 == 0) goto L_0x03a3
            java.lang.String r0 = "showMoneyRemind amount_remind_win"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r31.mo97322V7()
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            android.content.Context r2 = r0.mo97557c()
            if (r2 == 0) goto L_0x01e0
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            android.content.Context r2 = r0.mo97557c()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI
            if (r2 == 0) goto L_0x01e0
            te3.yj r2 = r5.f204235e
            te3.t4 r2 = r2.f228594J
            int r2 = r2.f141941g
            r1.f204524J1 = r2
        L_0x01e0:
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            te3.yj r2 = r5.f204235e
            te3.t4 r2 = r2.f228594J
            int r4 = r1.f204543S0
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$33 r6 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$33
            r6.<init>(r5)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$34 r8 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$34
            r8.<init>(r5)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "showAmountRemindWin() amountRemindBit:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r10, r9)
            java.lang.ref.WeakReference<android.content.Context> r9 = r0.f205299a
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            if (r9 != 0) goto L_0x0211
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            goto L_0x0372
        L_0x0211:
            java.lang.String r10 = "MicroMsg.JumpItemUtil"
            if (r2 != 0) goto L_0x021d
            java.lang.String r2 = "showAmountRemindWin() amountRemindWin == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            goto L_0x0372
        L_0x021d:
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r9)
            r12 = 2131496109(0x7f0c0cad, float:1.8615774E38)
            r13 = 0
            r14 = 0
            android.view.View r11 = r11.inflate(r12, r13, r14)
            r12 = 2131301844(0x7f0915d4, float:1.8221757E38)
            android.view.View r22 = r11.findViewById(r12)
            r12 = 2131301843(0x7f0915d3, float:1.8221755E38)
            android.view.View r12 = r11.findViewById(r12)
            com.tencent.mm.wallet_core.ui.WalletTextView r12 = (com.tencent.p014mm.wallet_core.p137ui.WalletTextView) r12
            r13 = 2131316747(0x7f09500b, float:1.8251984E38)
            android.view.View r17 = r11.findViewById(r13)
            r13 = 2131316745(0x7f095009, float:1.825198E38)
            android.view.View r13 = r11.findViewById(r13)
            r14 = 2131309463(0x7f093397, float:1.823721E38)
            android.view.View r14 = r11.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            int r15 = r2.f141941g
            r33 = r8
            double r7 = (double) r15
            r18 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r7 = r7 / r18
            java.lang.String r15 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r7)
            r12.setText(r15)
            r15 = 0
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r4, (int) r15)
            if (r16 == 0) goto L_0x02b3
            java.lang.String r4 = "mAmountRemindBit == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r3)
            java.lang.Object[] r24 = r4.mo10232b()
            java.lang.String r25 = "com/tencent/mm/wallet_core/model/JumpItemUtil"
            java.lang.String r26 = "showAmountRemindWin"
            java.lang.String r27 = "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/AmountRemindWin;ILcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;Lcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r3 = 0
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            r13.setVisibility(r3)
            java.lang.String r24 = "com/tencent/mm/wallet_core/model/JumpItemUtil"
            java.lang.String r25 = "showAmountRemindWin"
            java.lang.String r26 = "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/AmountRemindWin;ILcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;Lcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x0328
        L_0x02b3:
            r3 = 2131316750(0x7f09500e, float:1.825199E38)
            android.view.View r3 = r11.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            r15 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r10.mo10233c(r1)
            java.lang.Object[] r24 = r10.mo10232b()
            java.lang.String r25 = "com/tencent/mm/wallet_core/model/JumpItemUtil"
            java.lang.String r26 = "showAmountRemindWin"
            java.lang.String r27 = "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/AmountRemindWin;ILcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;Lcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r13
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 0
            java.lang.Object r10 = r10.mo10231a(r1)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r1 = r10.intValue()
            r13.setVisibility(r1)
            java.lang.String r24 = "com/tencent/mm/wallet_core/model/JumpItemUtil"
            java.lang.String r25 = "showAmountRemindWin"
            java.lang.String r26 = "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/AmountRemindWin;ILcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;Lcom/tencent/mm/wallet_core/model/JumpItemUtil$IJumpItemCallback;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 == 0) goto L_0x030e
            r1 = 2131235602(0x7f081312, float:1.8087403E38)
            r14.setBackgroundResource(r1)
            goto L_0x0314
        L_0x030e:
            r1 = 2131235601(0x7f081311, float:1.80874E38)
            r14.setBackgroundResource(r1)
        L_0x0314:
            com.tencent.mm.wallet_core.model.u r1 = new com.tencent.mm.wallet_core.model.u
            r16 = r1
            r18 = r7
            r20 = r4
            r21 = r12
            r23 = r13
            r24 = r3
            r16.<init>(r17, r18, r20, r21, r22, r23, r24)
            r13.post(r1)
        L_0x0328:
            java.lang.String r1 = r2.f141938d
            te3.gl2 r3 = r2.f141940f
            java.lang.String r3 = r3.f227478d
            te3.gl2 r4 = r2.f141939e
            java.lang.String r4 = r4.f227478d
            com.tencent.mm.wallet_core.model.v r10 = new com.tencent.mm.wallet_core.model.v
            r16 = r10
            r17 = r9
            r18 = r2
            r19 = r7
            r21 = r33
            r16.<init>(r17, r18, r19, r21)
            com.tencent.mm.wallet_core.model.w r12 = new com.tencent.mm.wallet_core.model.w
            r16 = r12
            r21 = r6
            r16.<init>(r17, r18, r19, r21)
            qo3.a r2 = new qo3.a
            r2.<init>()
            r2.f225644a = r1
            r2.f225627J = r11
            r2.f225663t = r3
            r2.f225620C = r10
            r2.f225664u = r4
            r2.f225621D = r12
            r1 = 0
            r2.f225668y = r1
            r1 = 1
            r2.f225669z = r1
            qo3.g r1 = new qo3.g
            r3 = 2131887328(0x7f1204e0, float:1.940926E38)
            r1.<init>(r9, r3)
            r1.mo107525e(r2)
            r1.show()
            nj3.C76879j.m92730a(r9, r1)
        L_0x0372:
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            android.content.Context r1 = r0.mo97557c()
            if (r1 == 0) goto L_0x03a0
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            android.content.Context r1 = r0.mo97557c()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI
            if (r1 == 0) goto L_0x038d
            r2 = 1
            r1 = r31
            r1.mo97325Y7(r2, r5)
            goto L_0x03ff
        L_0x038d:
            r1 = r31
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            android.content.Context r0 = r0.mo97557c()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fLargeMoneyUI
            if (r0 == 0) goto L_0x03ff
            r0 = 9
            r1.mo97325Y7(r0, r5)
            goto L_0x03ff
        L_0x03a0:
            r1 = r31
            goto L_0x03ff
        L_0x03a3:
            te3.s4 r0 = r0.f228595K
            if (r0 == 0) goto L_0x0401
            java.lang.String r0 = "showMoneyRemind amount_remind_page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r31.mo97322V7()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            int r2 = r1.f204543S0
            java.lang.String r3 = "key_amount_remind_bit"
            r0.putExtra(r3, r2)
            te3.yj r2 = r5.f204235e
            te3.s4 r2 = r2.f228595K
            java.lang.String r2 = r2.f185332d
            java.lang.String r3 = "key_title"
            r0.putExtra(r3, r2)
            te3.yj r2 = r5.f204235e
            te3.s4 r2 = r2.f228595K
            java.lang.String r2 = r2.f185333e
            java.lang.String r3 = "key_desc"
            r0.putExtra(r3, r2)
            te3.yj r2 = r5.f204235e
            te3.s4 r2 = r2.f228595K
            java.lang.String r2 = r2.f185334f
            java.lang.String r3 = "key_amount_remind_sign"
            r0.putExtra(r3, r2)
            java.lang.String r2 = r1.f204542S
            java.lang.String r3 = "key_qr_code"
            r0.putExtra(r3, r2)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f204542S
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "open large moneny UI mQrcodeId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r3)
            r2 = 4
            java.lang.String r3 = "wallet_payu"
            java.lang.String r4 = ".pay.ui.WalletPayUOrderInfoUI"
            ke3.C88144b.m109795m(r1, r3, r4, r0, r2)
            r0 = 6
            r1.mo97325Y7(r0, r5)
        L_0x03ff:
            r7 = 1
            goto L_0x041b
        L_0x0401:
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            android.content.Context r2 = r0.mo97557c()
            if (r2 == 0) goto L_0x041a
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            android.content.Context r0 = r0.mo97557c()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fLargeMoneyUI
            if (r0 == 0) goto L_0x041a
            r1.mo97325Y7(r3, r5)
        L_0x041a:
            r7 = 0
        L_0x041b:
            if (r7 != 0) goto L_0x04a6
            r1.mo97329c8(r5)
            goto L_0x04a6
        L_0x0422:
            r31.mo97322V7()
            goto L_0x04a6
        L_0x0427:
            r31.mo97322V7()
            java.lang.Object[] r0 = new java.lang.Object[r10]
            te3.yj r2 = r5.f204235e
            int r2 = r2.f228597d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r2
            te3.yj r2 = r5.f204235e
            java.lang.String r2 = r2.f228598e
            r4 = 1
            r0[r4] = r2
            java.lang.String r2 = "place order response: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
            te3.yj r0 = r5.f204235e
            te3.b54 r0 = r0.f228601h
            if (r0 == 0) goto L_0x0457
            java.lang.String r0 = r0.f130957d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0457
            r1.mo97327a8(r5)
            r8 = 1
            goto L_0x048e
        L_0x0457:
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            te3.yj r2 = r5.f204235e
            java.lang.String r2 = r2.f228598e
            java.lang.String r4 = ""
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$30 r6 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$30
            r6.<init>(r3)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r8 = 0
            r3[r8] = r7
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r8 = 1
            r3[r8] = r7
            java.lang.String r7 = "showAlert3() msg:%s, title:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r7, r3)
            java.lang.ref.WeakReference<android.content.Context> r0 = r0.f205299a
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x048b
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            goto L_0x048e
        L_0x048b:
            nj3.C76879j.m92713G(r0, r2, r4, r8, r6)
        L_0x048e:
            te3.yj r0 = r5.f204235e
            int r0 = r0.f228606p
            if (r0 != r8) goto L_0x04a6
            r2 = 0
            r4 = 0
            r1.mo97331e8(r2, r2, r4)
            goto L_0x04a6
        L_0x049a:
            r4 = 0
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r4] = r3
            java.lang.String r2 = "net error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
        L_0x04a6:
            r5 = 0
            goto L_0x0614
        L_0x04a9:
            r8 = 1
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.remittance.model.C42843j
            if (r4 == 0) goto L_0x04b5
            java.lang.String r0 = "pay check callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            return r8
        L_0x04b5:
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.remittance.model.C70590i
            if (r4 == 0) goto L_0x05c1
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r5 = 0
            r4[r5] = r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r32)
            r4[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r33)
            r4[r10] = r5
            java.lang.String r5 = "onSceneEnd %s errType %s errCode %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r4)
            com.tencent.mm.plugin.remittance.model.i r3 = (com.tencent.p014mm.plugin.remittance.model.C70590i) r3
            java.lang.String r4 = r3.f204125n
            com.tencent.mm.plugin.remittance.model.i r5 = r1.f204620x1
            java.lang.String r5 = r5.f204125n
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x05ad
            boolean r4 = r3.f204126o
            if (r4 == 0) goto L_0x04e4
            goto L_0x05ad
        L_0x04e4:
            com.tencent.mm.plugin.remittance.ui.b r4 = r1.f204609s1
            r5 = 0
            r4.f205282d = r5
            if (r0 != 0) goto L_0x0596
            if (r2 != 0) goto L_0x0596
            te3.uj r4 = r3.f204120f
            int r5 = r4.f228302d
            if (r5 != 0) goto L_0x0587
            com.tencent.mm.plugin.remittance.ui.e r0 = r1.f204607r1
            te3.sj r2 = r4.f228304f
            r0.f205297b = r2
            java.lang.String r2 = r2.f228222f
            r0.mo97552a(r2)
            com.tencent.mm.plugin.remittance.ui.e r0 = r1.f204607r1
            r0.getClass()
            com.tencent.mm.plugin.remittance.ui.b r0 = r1.f204609s1
            te3.uj r2 = r3.f204120f
            te3.fb0 r2 = r2.f228305g
            java.lang.String r4 = "MicroMsg.ExtraBuyInfoHelper"
            if (r2 != 0) goto L_0x0518
            r0.getClass()
            java.lang.String r0 = "set favor resp extra buy info (null)"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0516:
            r7 = 1
            goto L_0x0564
        L_0x0518:
            r0.f205281c = r2
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.util.LinkedList<te3.eb0> r5 = r2.f227354f
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.String r5 = "set favor resp extra buy info with %d items"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            java.util.LinkedList<te3.eb0> r0 = r2.f227354f
            java.util.Iterator r0 = r0.iterator()
        L_0x0536:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0516
            java.lang.Object r2 = r0.next()
            te3.eb0 r2 = (te3.C77920eb0) r2
            java.lang.Object[] r5 = new java.lang.Object[r9]
            long r6 = r2.f227241d
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            int r6 = r2.f227247j
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r5[r7] = r6
            boolean r2 = r2.f227249o
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r10] = r2
            java.lang.String r2 = "item updated, id=%d. unavailable=%d, selected=%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r5)
            goto L_0x0536
        L_0x0564:
            r31.mo97330d8()
            com.tencent.mm.plugin.remittance.model.d r0 = r3.f204122h
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r4 = 0
            r2[r4] = r0
            java.lang.String r4 = "GetFavorAfterAction %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r2)
            if (r0 == 0) goto L_0x05a9
            com.tencent.mm.plugin.remittance.ui.e r2 = r1.f204607r1
            te3.sj r2 = r2.f205297b
            if (r2 == 0) goto L_0x057e
            java.util.LinkedList<te3.ce0> r2 = r2.f228220d
            goto L_0x0583
        L_0x057e:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x0583:
            r0.mo97246a(r2)
            goto L_0x05a9
        L_0x0587:
            java.lang.String r4 = r4.f228303e
            r1.mo97314N7(r4)
            com.tencent.mm.plugin.remittance.model.e r4 = r3.f204123i
            if (r4 == 0) goto L_0x05a9
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$25 r4 = (com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C7066825) r4
            r4.mo97345a(r0, r2, r3)
            goto L_0x05a9
        L_0x0596:
            r4 = 2131834679(0x7f113737, float:1.9302475E38)
            java.lang.String r4 = r1.getString(r4)
            r1.mo97314N7(r4)
            com.tencent.mm.plugin.remittance.model.e r4 = r3.f204123i
            if (r4 == 0) goto L_0x05a9
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$25 r4 = (com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.C7066825) r4
            r4.mo97345a(r0, r2, r3)
        L_0x05a9:
            r4 = 1
            r3.f204124j = r4
            return r4
        L_0x05ad:
            r4 = 1
            r3.f204124j = r4
            java.lang.Object[] r0 = new java.lang.Object[r4]
            boolean r2 = r3.f204126o
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 0
            r0[r5] = r2
            java.lang.String r2 = "ignore this getFavor new coming soon %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r2, r0)
            return r4
        L_0x05c1:
            r4 = 1
            r5 = 0
            boolean r6 = r3 instanceof com.tencent.p014mm.plugin.remittance.model.C42847n
            if (r6 == 0) goto L_0x0614
            com.tencent.mm.plugin.remittance.model.n r3 = (com.tencent.p014mm.plugin.remittance.model.C42847n) r3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r6 = r3.f116036h
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r5] = r6
            java.lang.String r5 = "NetSceneBusiF2fZeroCallback getHasRetried %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r4)
            if (r0 != 0) goto L_0x05fe
            if (r2 != 0) goto L_0x05fe
            te3.ek r0 = r3.f116033e
            int r0 = r0.f132966d
            if (r0 != 0) goto L_0x05e7
            r31.mo97321U7()
            goto L_0x04a6
        L_0x05e7:
            r31.mo97332f8()
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            te3.ek r2 = r3.f116033e
            java.lang.String r2 = r2.f132967e
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$31 r3 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$31
            r3.<init>(r1)
            r4 = 0
            r5 = 0
            r0.mo97559f(r2, r4, r5, r3)
            goto L_0x0614
        L_0x05fe:
            r4 = 0
            r5 = 0
            com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.m83406d()
            com.tencent.mm.plugin.remittance.ui.f0 r0 = com.tencent.p014mm.plugin.remittance.p098ui.C70887f0.C70888a.f205300a
            r2 = 2131839734(0x7f114af6, float:1.9312728E38)
            java.lang.String r2 = r1.getString(r2)
            com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$32 r3 = new com.tencent.mm.plugin.remittance.ui.RemittanceBusiUI$32
            r3.<init>(r1)
            r0.mo97559f(r2, r4, r5, r3)
        L_0x0614:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBusiUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5058t0.class);
    }
}
