package com.tencent.p014mm.plugin.remittance.p098ui;

import a63.C67008a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RemittanceAccountDetailEvent;
import com.tencent.p014mm.autogen.events.RemittanceDetailUIFinishEvent;
import com.tencent.p014mm.autogen.events.RemittanceRefuseEvent;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.TransferActionStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.plugin.remittance.model.C57178n0;
import com.tencent.p014mm.plugin.remittance.model.C70585g0;
import com.tencent.p014mm.plugin.remittance.model.C70593j0;
import com.tencent.p014mm.plugin.remittance.model.C70611s0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C72501h;
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import d62.C75339i;
import di0.C86300q;
import di3.C86312j;
import e00.C45518r0;
import ep3.C97688c;
import f40.C86709a0;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import ie3.C76324c;
import ie3.C76328d;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88989a;
import p281yz.C79173v;
import p286zl.C16292g;
import p629ny.C76979h;
import qo3.C101218e0;
import qo3.C47883u;
import qo3.C77407n;
import rx3.C13598b0;
import td2.C77891a;
import te3.C49995ji2;
import te3.C64514l50;
import te3.C77935gl2;
import te3.C78006vr;
import te3.C78023zk3;
import te3.bl4;
import te3.cl4;
import te3.wf4;
import uo3.C78253a;
import y43.C79029b0;
import yq3.C79148e;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI */
public class RemittanceDetailUI extends WalletBaseUI {

    /* renamed from: z1 */
    public static final /* synthetic */ int f204704z1 = 0;

    /* renamed from: A */
    public TextView f204705A;

    /* renamed from: B */
    public TextView f204706B;

    /* renamed from: C */
    public ImageView f204707C;

    /* renamed from: D */
    public Button f204708D;

    /* renamed from: E */
    public TextView f204709E;

    /* renamed from: F */
    public View f204710F;

    /* renamed from: G */
    public View f204711G;

    /* renamed from: H */
    public View f204712H;

    /* renamed from: I */
    public Button f204713I = null;

    /* renamed from: J */
    public TextView f204714J = null;

    /* renamed from: K */
    public LinearLayout f204715K;

    /* renamed from: L */
    public LinearLayout f204716L;

    /* renamed from: M */
    public LinearLayout f204717M;

    /* renamed from: N */
    public LinearLayout f204718N;

    /* renamed from: P */
    public LinearLayout f204719P;

    /* renamed from: Q */
    public TextView f204720Q;

    /* renamed from: Q0 */
    public int f204721Q0;

    /* renamed from: R */
    public TextView f204722R;

    /* renamed from: R0 */
    public C70585g0 f204723R0;

    /* renamed from: S */
    public TextView f204724S;

    /* renamed from: S0 */
    public C57178n0 f204725S0;

    /* renamed from: T */
    public TextView f204726T;

    /* renamed from: T0 */
    public String f204727T0;

    /* renamed from: U */
    public TextView f204728U;

    /* renamed from: U0 */
    public String f204729U0;

    /* renamed from: V */
    public WcPayBannerView f204730V;

    /* renamed from: V0 */
    public String f204731V0;

    /* renamed from: W */
    public int f204732W;

    /* renamed from: W0 */
    public long f204733W0;

    /* renamed from: X */
    public String f204734X = null;

    /* renamed from: X0 */
    public String f204735X0;

    /* renamed from: Y */
    public String f204736Y = null;

    /* renamed from: Y0 */
    public String f204737Y0;

    /* renamed from: Z */
    public String f204738Z = null;

    /* renamed from: Z0 */
    public boolean f204739Z0 = false;

    /* renamed from: a1 */
    public LinearLayout f204740a1;

    /* renamed from: b1 */
    public LinearLayout f204741b1;

    /* renamed from: c1 */
    public RelativeLayout f204742c1;

    /* renamed from: d */
    public ImageView f204743d = null;

    /* renamed from: d1 */
    public LinearLayout f204744d1;

    /* renamed from: e */
    public TextView f204745e = null;

    /* renamed from: e1 */
    public LinearLayout f204746e1;

    /* renamed from: f */
    public TextView f204747f = null;

    /* renamed from: f1 */
    public TextView f204748f1;

    /* renamed from: g */
    public TextView f204749g = null;

    /* renamed from: g1 */
    public RecyclerView f204750g1;

    /* renamed from: h */
    public TextView f204751h = null;

    /* renamed from: h1 */
    public int f204752h1 = 1;

    /* renamed from: i */
    public TextView f204753i = null;

    /* renamed from: i1 */
    public String f204754i1 = "";

    /* renamed from: j */
    public TextView f204755j = null;

    /* renamed from: j1 */
    public C72506r f204756j1;

    /* renamed from: k1 */
    public long f204757k1 = 0;

    /* renamed from: l1 */
    public Bundle f204758l1;

    /* renamed from: m1 */
    public boolean f204759m1 = false;

    /* renamed from: n */
    public View f204760n;

    /* renamed from: n1 */
    public IListener<RemittanceJsapiConfirmEvent> f204761n1;

    /* renamed from: o */
    public LinearLayout f204762o;

    /* renamed from: o1 */
    public IListener<RemittanceRefuseEvent> f204763o1;

    /* renamed from: p */
    public LinearLayout f204764p;

    /* renamed from: p0 */
    public String f204765p0 = null;

    /* renamed from: p1 */
    public IListener<RemittanceDetailUIFinishEvent> f204766p1;

    /* renamed from: q */
    public LinearLayout f204767q;

    /* renamed from: q1 */
    public IListener<RevokeMsgEvent> f204768q1;

    /* renamed from: r */
    public LinearLayout f204769r;

    /* renamed from: r1 */
    public IListener<RemittanceAccountDetailEvent> f204770r1;

    /* renamed from: s */
    public LinearLayout f204771s;

    /* renamed from: s1 */
    public C78253a f204772s1;

    /* renamed from: t */
    public TextView f204773t;

    /* renamed from: t1 */
    public int f204774t1;

    /* renamed from: u */
    public TextView f204775u;

    /* renamed from: u1 */
    public int f204776u1;

    /* renamed from: v */
    public TextView f204777v;

    /* renamed from: v1 */
    public int f204778v1;

    /* renamed from: w */
    public TextView f204779w;

    /* renamed from: w1 */
    public C11184p0 f204780w1;

    /* renamed from: x */
    public TextView f204781x;

    /* renamed from: x0 */
    public int f204782x0 = 3;

    /* renamed from: x1 */
    public View.OnTouchListener f204783x1;

    /* renamed from: y */
    public ViewGroup f204784y;

    /* renamed from: y0 */
    public boolean f204785y0 = false;

    /* renamed from: y1 */
    public View.OnLongClickListener f204786y1;

    /* renamed from: z */
    public ImageView f204787z;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$a */
    public class C70717a implements C77891a.C77892a {

        /* renamed from: a */
        public final /* synthetic */ C70593j0 f204793a;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$a$a */
        public class C70718a implements C47883u {
            public C70718a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    Intent intent = new Intent();
                    intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, RemittanceDetailUI.this.f204734X);
                    intent.putExtra("transfer_id", RemittanceDetailUI.this.f204738Z);
                    intent.putExtra("receiver_name", RemittanceDetailUI.this.f204729U0);
                    intent.putExtra("resend_msg_from_flag", 3);
                    intent.putExtra("is_open_im", RemittanceDetailUI.this.f204739Z0 ? 1 : 0);
                    RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                    remittanceDetailUI.getClass();
                    C88144b.m109791i(remittanceDetailUI, "remittance", ".ui.RemittanceResendMsgUI", intent, (Bundle) null);
                }
            }
        }

        public C70717a(C70593j0 j0Var) {
            this.f204793a = j0Var;
        }

        public void onClick(View view) {
            new C70939r(RemittanceDetailUI.this).mo97594a(this.f204793a.f204189y, new C70718a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$a0 */
    public class C70719a0 implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C70585g0.C70586a f204796a;

        public C70719a0(C70585g0.C70586a aVar) {
            this.f204796a = aVar;
        }

        public void onClick(View view) {
            C115669n.INSTANCE.mo160131h(28399, "halfpage", 1, 0, 1, 3);
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0.C70597d dVar = this.f204796a.f204068c.f204230b;
            int i = RemittanceDetailUI.f204704z1;
            remittanceDetailUI.mo97384R7(dVar, 0, "", 0, (C86300q) null, (Runnable) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$b */
    public class C70720b extends C7089c0 {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$b$a */
        public class C70721a implements C67008a.C67019k {
            public C70721a() {
            }

            public boolean run(int i, int i2, String str, boolean z) {
                Log.m105925i("MicroMsg.RemittanceDetailUI", "resultCode :%s", Integer.valueOf(i));
                if (i == 2) {
                    RemittanceDetailUI.this.mo97377K7();
                    return true;
                }
                if (i == 0 && z) {
                    RemittanceDetailUI.this.mo97377K7();
                }
                return true;
            }
        }

        public C70720b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.RemittanceDetailUI", "click reveive btn");
            if (!Util.isNullOrNil(RemittanceDetailUI.this.f204754i1)) {
                C75228t.m90257l0(RemittanceDetailUI.this.getContext(), RemittanceDetailUI.this.f204754i1, (C75228t.C75238m) null);
                return;
            }
            ((C76328d) C86312j.m106911c(C76328d.class)).mo106561my(RemittanceDetailUI.this, 9, 4);
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            ((C79173v) C86312j.m106911c(C79173v.class)).f232485t.mo90979g(remittanceDetailUI, 2, remittanceDetailUI.mNetSceneMgr, new C70721a(), false, 1008, true);
            Log.m105925i("MicroMsg.RemittanceDetailUI", "click reveive btn，ret :%s", Boolean.FALSE);
            RemittanceDetailUI.this.mo97377K7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$b0 */
    public class C70722b0 implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f204800a;

        /* renamed from: b */
        public final /* synthetic */ C70585g0.C70586a f204801b;

        public C70722b0(C101218e0 e0Var, C70585g0.C70586a aVar) {
            this.f204800a = e0Var;
            this.f204801b = aVar;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f204800a.mo140680z();
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0.C70597d dVar = this.f204801b.f204069d.f204230b;
            int i = RemittanceDetailUI.f204704z1;
            remittanceDetailUI.mo97384R7(dVar, 0, "", 0, (C86300q) null, (Runnable) null);
            C115669n.INSTANCE.mo160131h(28399, "halfpage", 1, 0, 1, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c */
    public class C70723c implements C77891a.C77892a {

        /* renamed from: a */
        public final /* synthetic */ C70593j0 f204803a;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c$a */
        public class C70724a implements DialogInterface.OnClickListener {
            public C70724a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                RemittanceDetailUI.this.mo97379M7();
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c$b */
        public class C70725b implements DialogInterface.OnClickListener {
            public C70725b(C70723c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C70723c(C70593j0 j0Var) {
            this.f204803a = j0Var;
        }

        public void onClick(View view) {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C76879j.m92707A(remittanceDetailUI, remittanceDetailUI.getString(C0966R.string.f361192i11, new Object[]{remittanceDetailUI.mo97382P7(this.f204803a.f204177j, false)}), RemittanceDetailUI.this.getString(C0966R.string.a2d), RemittanceDetailUI.this.getString(C0966R.string.i16), RemittanceDetailUI.this.getString(C0966R.string.f7926wf), new C70724a(), new C70725b(this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c0 */
    public class C70726c0 implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C101218e0 f204806a;

        /* renamed from: b */
        public final /* synthetic */ C70585g0.C70586a f204807b;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c0$a */
        public class C70727a implements C86300q {
            public C70727a() {
            }

            /* renamed from: a */
            public void mo63853a() {
                Log.m105924i("MicroMsg.RemittanceDetailUI", "onAppBrandProcessDied");
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
            }

            /* renamed from: b */
            public void mo63854b(String str) {
                Log.m105924i("MicroMsg.RemittanceDetailUI", "onTriggerHalfScreenShare");
            }

            /* renamed from: c */
            public void mo63855c() {
            }

            /* renamed from: d */
            public /* synthetic */ void mo63856d() {
            }

            /* renamed from: e */
            public void mo63857e() {
                Log.m105924i("MicroMsg.RemittanceDetailUI", "onAppBrandPreconditionError");
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
            }

            /* renamed from: f */
            public void mo63858f(boolean z) {
                Log.m105925i("MicroMsg.RemittanceDetailUI", "onAppBrandUIExit：%s", Boolean.valueOf(z));
                RemittanceDetailUI.this.mo97380N7(0);
                ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106885C6(this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c0$b */
        public class C70728b implements Runnable {

            /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c0$b$a */
            public class C70729a implements Runnable {
                public C70729a() {
                }

                public void run() {
                    RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                    if (!remittanceDetailUI.f204759m1) {
                        remittanceDetailUI.mo97380N7(0);
                    } else {
                        remittanceDetailUI.f204759m1 = false;
                    }
                }
            }

            public C70728b() {
            }

            public void run() {
                ((C119157j) C119157j.f356862d).mo183895z(new C70729a());
            }
        }

        public C70726c0(C101218e0 e0Var, C70585g0.C70586a aVar) {
            this.f204806a = e0Var;
            this.f204807b = aVar;
        }

        /* renamed from: a */
        public void mo2001a() {
            this.f204806a.mo140680z();
            C70727a aVar = new C70727a();
            C70728b bVar = new C70728b();
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0.C70597d dVar = this.f204807b.f204070e.f204230b;
            int i = RemittanceDetailUI.f204704z1;
            remittanceDetailUI.mo97384R7(dVar, 0, "", 0, aVar, bVar);
            C115669n.INSTANCE.mo160131h(28399, "halfpage", 1, 0, 1, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$d */
    public class C70730d implements C77891a.C77892a {
        public C70730d() {
        }

        public void onClick(View view) {
            C76331i.m91758b(RemittanceDetailUI.this, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$d0 */
    public class C70731d0 implements C72506r.C72510d {
        public C70731d0() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            if (gl22.f227479e == 1) {
                RemittanceDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$e */
    public class C70732e implements C77891a.C77892a {

        /* renamed from: a */
        public final /* synthetic */ boolean f204814a;

        public C70732e(boolean z) {
            this.f204814a = z;
        }

        public void onClick(View view) {
            if (this.f204814a) {
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                Intent intent = new Intent();
                int i = RemittanceDetailUI.f204704z1;
                remittanceDetailUI.mo97389W7(intent, false);
                return;
            }
            C76331i.m91758b(RemittanceDetailUI.this, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$e0 */
    public class C70733e0 implements C72506r.C72510d {
        public C70733e0() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            if (gl22.f227479e == 1) {
                RemittanceDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f */
    public class C70734f implements C77891a.C77892a {

        /* renamed from: a */
        public final /* synthetic */ boolean f204817a;

        public C70734f(boolean z) {
            this.f204817a = z;
        }

        public void onClick(View view) {
            if (this.f204817a) {
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                Intent intent = new Intent();
                int i = RemittanceDetailUI.f204704z1;
                remittanceDetailUI.mo97389W7(intent, false);
                return;
            }
            C76331i.m91758b(RemittanceDetailUI.this, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f0 */
    public class C70735f0 implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f0$a */
        public class C70736a implements C72506r.C72510d {
            public C70736a() {
            }

            /* renamed from: a */
            public void mo95297a(C77935gl2 gl22) {
                if (gl22.f227479e == 1) {
                    RemittanceDetailUI.this.finish();
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f0$b */
        public class C70737b implements C72506r.C72510d {
            public C70737b() {
            }

            /* renamed from: a */
            public void mo95297a(C77935gl2 gl22) {
                if (gl22.f227479e == 1) {
                    RemittanceDetailUI.this.finish();
                }
            }
        }

        public C70735f0() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            if (remittanceDetailUI.f204739Z0) {
                C57178n0 n0Var = remittanceDetailUI.f204725S0;
                if (n0Var == null) {
                    remittanceDetailUI.finish();
                    return false;
                }
                C49995ji2 ji22 = n0Var.f163879r.f184891i;
                if (ji22 == null) {
                    remittanceDetailUI.finish();
                    return false;
                } else if (!C72506r.m84839e(ji22)) {
                    RemittanceDetailUI.this.finish();
                    return false;
                } else {
                    RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
                    remittanceDetailUI2.f204756j1.mo99913c(remittanceDetailUI2.f204725S0.f163879r.f184891i, new C70736a());
                    RemittanceDetailUI.this.f204725S0.f163879r.f184891i = null;
                }
            } else {
                C70585g0 g0Var = remittanceDetailUI.f204723R0;
                if (g0Var == null) {
                    remittanceDetailUI.finish();
                    return false;
                }
                C72501h hVar = g0Var.f204062f;
                if (hVar == null) {
                    remittanceDetailUI.finish();
                    return false;
                } else if (!C72506r.m84838d(hVar)) {
                    RemittanceDetailUI.this.finish();
                    return false;
                } else {
                    RemittanceDetailUI remittanceDetailUI3 = RemittanceDetailUI.this;
                    remittanceDetailUI3.f204756j1.mo99912b(remittanceDetailUI3.f204723R0.f204062f, new C70737b());
                    RemittanceDetailUI.this.f204723R0.f204062f = null;
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$g */
    public class C70738g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C70593j0 f204822d;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$g$a */
        public class C70739a implements C77891a.C77892a {
            public C70739a() {
            }

            public void onClick(View view) {
                RemittanceDetailUI.this.f204726T.setVisibility(8);
                RemittanceDetailUI.this.f204728U.setVisibility(0);
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                C45056f1.m49908a(remittanceDetailUI, (ViewGroup) remittanceDetailUI.findViewById(C0966R.C0970id.iwq), RemittanceDetailUI.this.findViewById(C0966R.C0970id.hr8), RemittanceDetailUI.this.findViewById(C0966R.C0970id.im9), RemittanceDetailUI.this.findViewById(C0966R.C0970id.imq), 72);
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$g$b */
        public class C70740b implements C77891a.C77892a {
            public C70740b() {
            }

            public void onClick(View view) {
                RemittanceDetailUI.this.f204726T.setVisibility(0);
                RemittanceDetailUI.this.f204728U.setVisibility(8);
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                C45056f1.m49908a(remittanceDetailUI, (ViewGroup) remittanceDetailUI.findViewById(C0966R.C0970id.iwq), RemittanceDetailUI.this.findViewById(C0966R.C0970id.hr8), RemittanceDetailUI.this.findViewById(C0966R.C0970id.im9), RemittanceDetailUI.this.findViewById(C0966R.C0970id.imq), 72);
            }
        }

        public C70738g(C70593j0 j0Var) {
            this.f204822d = j0Var;
        }

        public void run() {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            int J7 = RemittanceResultNewUI.m83355J7(remittanceDetailUI, this.f204822d.f204186v.f204193c, remittanceDetailUI.f204720Q.getWidth());
            if (!Util.isEqual(J7, this.f204822d.f204186v.f204193c.length())) {
                String string = RemittanceDetailUI.this.getString(C0966R.string.i0m);
                String str = this.f204822d.f204186v.f204193c.substring(0, J7) + "... ";
                SpannableString spannableString = new SpannableString(str + string);
                C77891a aVar = new C77891a(RemittanceDetailUI.this);
                aVar.f226941e = new C70739a();
                spannableString.setSpan(aVar, str.length(), str.length() + string.length(), 33);
                RemittanceDetailUI.this.f204726T.setOnTouchListener(new C70865a());
                RemittanceDetailUI.this.f204726T.setText(spannableString);
                String string2 = RemittanceDetailUI.this.getString(C0966R.string.i0l);
                String str2 = this.f204822d.f204186v.f204193c + "  ";
                SpannableString spannableString2 = new SpannableString(str2 + string2);
                C77891a aVar2 = new C77891a(RemittanceDetailUI.this);
                aVar2.f226941e = new C70740b();
                spannableString2.setSpan(aVar2, str2.length(), str2.length() + string2.length(), 33);
                RemittanceDetailUI.this.f204728U.setOnTouchListener(new C70865a());
                RemittanceDetailUI.this.f204728U.setText(spannableString2);
            } else {
                RemittanceDetailUI.this.f204726T.setText(this.f204822d.f204186v.f204193c);
                RemittanceDetailUI.this.f204728U.setText(this.f204822d.f204186v.f204193c);
            }
            RemittanceDetailUI.this.f204726T.setVisibility(0);
            RemittanceDetailUI.this.f204728U.setVisibility(8);
            RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
            remittanceDetailUI2.f204719P.setOnLongClickListener(remittanceDetailUI2.f204786y1);
            RemittanceDetailUI remittanceDetailUI3 = RemittanceDetailUI.this;
            remittanceDetailUI3.f204719P.setOnTouchListener(remittanceDetailUI3.f204783x1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$g0 */
    public class C70741g0 implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f204826d;

        public C70741g0(String str) {
            this.f204826d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00fe  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r19 = this;
                r0 = r19
                com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI r1 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI.this
                java.lang.String r2 = r0.f204826d
                int r3 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI.f204704z1
                r1.getClass()
                java.lang.Class<he0.j> r3 = he0.C76158j.class
                java.lang.Class<f62.k0> r4 = f62.C75700k0.class
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                r5[r6] = r2
                java.lang.String r7 = "MicroMsg.RemittanceDetailUI"
                java.lang.String r8 = "updateOpenImInfo:{}"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r5)
                java.lang.String r5 = r1.f204729U0
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                java.lang.String r8 = ""
                if (r5 == 0) goto L_0x0029
                r5 = r8
                goto L_0x002b
            L_0x0029:
                java.lang.String r5 = r1.f204729U0
            L_0x002b:
                r1.f204729U0 = r5
                java.lang.String r5 = r1.f204727T0
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x0037
                r5 = r8
                goto L_0x0039
            L_0x0037:
                java.lang.String r5 = r1.f204727T0
            L_0x0039:
                r1.f204727T0 = r5
                java.lang.String r5 = "{sender}"
                boolean r9 = r2.contains(r5)
                java.lang.String r10 = "\n@"
                java.lang.String r11 = "@"
                if (r9 == 0) goto L_0x00f2
                java.lang.String r9 = r1.f204727T0
                boolean r9 = com.tencent.p014mm.storage.C72996z1.m85843n5(r9)
                if (r9 == 0) goto L_0x00e8
                int r9 = r2.indexOf(r5)
                k40.a r12 = f40.C86709a0.m107533q(r4)
                f62.k0 r12 = (f62.C75700k0) r12
                com.tencent.mm.storage.u3 r12 = r12.mo96097Ni()
                java.lang.String r13 = r1.f204727T0
                com.tencent.mm.storage.z1 r12 = r12.get(r13)
                java.lang.String r13 = r1.f204727T0
                java.lang.String r13 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90268r(r13)
                di3.d r14 = di3.C86312j.m106911c(r3)
                he0.j r14 = (he0.C76158j) r14
                java.lang.String r15 = r12.mo73980x2()
                java.lang.String r12 = r12.mo73976t2()
                java.lang.String r12 = r14.mo106373wo(r15, r12)
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r15 = r2.substring(r6, r9)
                r14.append(r15)
                r14.append(r13)
                java.lang.String r13 = r14.toString()
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r14 == 0) goto L_0x00a6
                java.lang.String r9 = "senderBusinessName is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r9)
                java.lang.String r9 = r1.f204727T0
                android.text.SpannableString r9 = r1.mo97382P7(r9, r6)
                java.lang.String r2 = r2.replace(r5, r9)
                goto L_0x00f3
            L_0x00a6:
                boolean r5 = r1.mo97385S7(r13, r12)
                if (r5 == 0) goto L_0x00bc
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r10)
                r5.append(r12)
                java.lang.String r5 = r5.toString()
                goto L_0x00cb
            L_0x00bc:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r11)
                r5.append(r12)
                java.lang.String r5 = r5.toString()
            L_0x00cb:
                int r12 = r13.length()
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r13)
                r14.append(r5)
                int r9 = r9 + 8
                java.lang.String r2 = r2.substring(r9)
                r14.append(r2)
                java.lang.String r2 = r14.toString()
                goto L_0x00f5
            L_0x00e8:
                java.lang.String r9 = r1.f204727T0
                android.text.SpannableString r9 = r1.mo97382P7(r9, r6)
                java.lang.String r2 = r2.replace(r5, r9)
            L_0x00f2:
                r12 = r8
            L_0x00f3:
                r5 = r12
                r12 = 0
            L_0x00f5:
                java.lang.String r9 = "{recver}"
                boolean r13 = r2.contains(r9)
                if (r13 == 0) goto L_0x01a9
                java.lang.String r13 = r1.f204729U0
                boolean r13 = com.tencent.p014mm.storage.C72996z1.m85843n5(r13)
                if (r13 == 0) goto L_0x019f
                int r8 = r2.indexOf(r9)
                k40.a r4 = f40.C86709a0.m107533q(r4)
                f62.k0 r4 = (f62.C75700k0) r4
                com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()
                java.lang.String r13 = r1.f204729U0
                com.tencent.mm.storage.z1 r4 = r4.get(r13)
                java.lang.String r13 = r1.f204729U0
                java.lang.String r13 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90268r(r13)
                di3.d r3 = di3.C86312j.m106911c(r3)
                he0.j r3 = (he0.C76158j) r3
                java.lang.String r14 = r4.mo73980x2()
                java.lang.String r4 = r4.mo73976t2()
                java.lang.String r3 = r3.mo106373wo(r14, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r14 = r2.substring(r6, r8)
                r4.append(r14)
                r4.append(r13)
                java.lang.String r4 = r4.toString()
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r13 == 0) goto L_0x015d
                java.lang.String r4 = "recverBusinessName is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
                java.lang.String r4 = r1.f204729U0
                android.text.SpannableString r4 = r1.mo97382P7(r4, r6)
                java.lang.String r2 = r2.replace(r9, r4)
            L_0x015b:
                r8 = r3
                goto L_0x01a9
            L_0x015d:
                boolean r6 = r1.mo97385S7(r4, r3)
                if (r6 == 0) goto L_0x0173
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r10)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                goto L_0x0182
            L_0x0173:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r11)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
            L_0x0182:
                int r6 = r4.length()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                r7.append(r3)
                int r8 = r8 + 8
                java.lang.String r2 = r2.substring(r8)
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                goto L_0x015b
            L_0x019f:
                java.lang.String r3 = r1.f204729U0
                android.text.SpannableString r3 = r1.mo97382P7(r3, r6)
                java.lang.String r2 = r2.replace(r9, r3)
            L_0x01a9:
                android.widget.TextView r3 = r1.f204745e
                float r3 = r3.getTextSize()
                int r3 = (int) r3
                java.lang.Class<ny.h> r4 = p629ny.C76979h.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                ny.h r4 = (p629ny.C76979h) r4
                android.text.SpannableString r2 = r4.mo107057T1(r1, r2)
                r4 = 2131099865(0x7f0600d9, float:1.7812095E38)
                android.content.res.ColorStateList r4 = kg3.C76577a.m92154e(r1, r4)
                r7 = 33
                if (r12 <= 0) goto L_0x01e3
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r9 != 0) goto L_0x01e3
                android.text.style.TextAppearanceSpan r9 = new android.text.style.TextAppearanceSpan
                r14 = 0
                r15 = 0
                r13 = r9
                r16 = r3
                r17 = r4
                r18 = r4
                r13.<init>(r14, r15, r16, r17, r18)
                int r5 = r5.length()
                int r5 = r5 + r12
                r2.setSpan(r9, r12, r5, r7)
            L_0x01e3:
                if (r6 <= 0) goto L_0x0201
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r5 != 0) goto L_0x0201
                android.text.style.TextAppearanceSpan r5 = new android.text.style.TextAppearanceSpan
                r14 = 0
                r15 = 0
                r13 = r5
                r16 = r3
                r17 = r4
                r18 = r4
                r13.<init>(r14, r15, r16, r17, r18)
                int r3 = r8.length()
                int r3 = r3 + r6
                r2.setSpan(r5, r6, r3, r7)
            L_0x0201:
                android.widget.TextView r1 = r1.f204745e
                android.widget.TextView$BufferType r3 = android.widget.TextView.BufferType.SPANNABLE
                r1.setText(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI.C70741g0.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$h */
    public class C70742h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C70593j0 f204828d;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$h$a */
        public class C70743a implements C77891a.C77892a {
            public C70743a() {
            }

            public void onClick(View view) {
                RemittanceDetailUI.this.f204779w.setVisibility(8);
                RemittanceDetailUI.this.f204781x.setVisibility(0);
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                C45056f1.m49908a(remittanceDetailUI, (ViewGroup) remittanceDetailUI.findViewById(C0966R.C0970id.iwq), RemittanceDetailUI.this.findViewById(C0966R.C0970id.hr8), RemittanceDetailUI.this.findViewById(C0966R.C0970id.im9), RemittanceDetailUI.this.findViewById(C0966R.C0970id.imq), 72);
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$h$b */
        public class C70744b implements C77891a.C77892a {
            public C70744b() {
            }

            public void onClick(View view) {
                RemittanceDetailUI.this.f204779w.setVisibility(0);
                RemittanceDetailUI.this.f204781x.setVisibility(8);
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                C45056f1.m49908a(remittanceDetailUI, (ViewGroup) remittanceDetailUI.findViewById(C0966R.C0970id.iwq), RemittanceDetailUI.this.findViewById(C0966R.C0970id.hr8), RemittanceDetailUI.this.findViewById(C0966R.C0970id.im9), RemittanceDetailUI.this.findViewById(C0966R.C0970id.imq), 72);
            }
        }

        public C70742h(C70593j0 j0Var) {
            this.f204828d = j0Var;
        }

        public void run() {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            int J7 = RemittanceResultNewUI.m83355J7(remittanceDetailUI, this.f204828d.f204186v.f204193c, remittanceDetailUI.f204773t.getWidth());
            if (!Util.isEqual(J7, this.f204828d.f204186v.f204193c.length())) {
                String string = RemittanceDetailUI.this.getString(C0966R.string.i0m);
                String str = this.f204828d.f204186v.f204193c.substring(0, J7) + "... ";
                SpannableString spannableString = new SpannableString(str + string);
                C77891a aVar = new C77891a(RemittanceDetailUI.this);
                aVar.f226941e = new C70743a();
                spannableString.setSpan(aVar, str.length(), str.length() + string.length(), 33);
                RemittanceDetailUI.this.f204779w.setOnTouchListener(new C70865a());
                RemittanceDetailUI.this.f204779w.setText(spannableString);
                String string2 = RemittanceDetailUI.this.getString(C0966R.string.i0l);
                String str2 = this.f204828d.f204186v.f204193c + "  ";
                SpannableString spannableString2 = new SpannableString(str2 + string2);
                C77891a aVar2 = new C77891a(RemittanceDetailUI.this);
                aVar2.f226941e = new C70744b();
                spannableString2.setSpan(aVar2, str2.length(), str2.length() + string2.length(), 33);
                RemittanceDetailUI.this.f204781x.setOnTouchListener(new C70865a());
                RemittanceDetailUI.this.f204781x.setText(spannableString2);
            } else {
                RemittanceDetailUI.this.f204779w.setText(this.f204828d.f204186v.f204193c);
                RemittanceDetailUI.this.f204781x.setText(this.f204828d.f204186v.f204193c);
            }
            RemittanceDetailUI.this.f204779w.setVisibility(0);
            RemittanceDetailUI.this.f204781x.setVisibility(8);
            RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
            remittanceDetailUI2.f204771s.setOnLongClickListener(remittanceDetailUI2.f204786y1);
            RemittanceDetailUI remittanceDetailUI3 = RemittanceDetailUI.this;
            remittanceDetailUI3.f204771s.setOnTouchListener(remittanceDetailUI3.f204783x1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$i */
    public class C70745i extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C70593j0 f204832g;

        public C70745i(C70593j0 j0Var) {
            this.f204832g = j0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0 j0Var = this.f204832g;
            RemittanceDetailUI.m83236H7(remittanceDetailUI, j0Var.f204187w.f204202f, j0Var, 11);
            C115669n.INSTANCE.mo160131h(28399, "operationView", 1, 0, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$j */
    public class C70746j extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C70593j0 f204834g;

        public C70746j(C70593j0 j0Var) {
            this.f204834g = j0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0 j0Var = this.f204834g;
            RemittanceDetailUI.m83236H7(remittanceDetailUI, j0Var.f204187w.f204202f, j0Var, 11);
            C115669n.INSTANCE.mo160131h(28399, "operationView", 1, 0, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$k */
    public class C70747k extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C70593j0 f204836g;

        public C70747k(C70593j0 j0Var) {
            this.f204836g = j0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0 j0Var = this.f204836g;
            RemittanceDetailUI.m83236H7(remittanceDetailUI, j0Var.f204187w.f204202f, j0Var, 11);
            C115669n.INSTANCE.mo160131h(28399, "operationView", 1, 0, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$l */
    public class C70748l implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C70593j0 f204838a;

        /* renamed from: b */
        public final /* synthetic */ C70593j0.C70602g f204839b;

        /* renamed from: c */
        public final /* synthetic */ C70611s0 f204840c;

        public C70748l(C70593j0 j0Var, C70593j0.C70602g gVar, C70611s0 s0Var) {
            this.f204838a = j0Var;
            this.f204839b = gVar;
            this.f204840c = s0Var;
        }

        public void onClick(View view) {
            C70593j0 j0Var = this.f204838a;
            if (j0Var != null) {
                RemittanceDetailUI.m83236H7(RemittanceDetailUI.this, this.f204839b.f204230b, j0Var, 12);
                return;
            }
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0.C70597d dVar = this.f204839b.f204230b;
            C70611s0 s0Var = this.f204840c;
            int i = RemittanceDetailUI.f204704z1;
            remittanceDetailUI.getClass();
            remittanceDetailUI.mo97384R7(dVar, s0Var.f204284r.f228329f, remittanceDetailUI.f204738Z, 12, (C86300q) null, (Runnable) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$m */
    public class C70749m implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C70593j0 f204842a;

        /* renamed from: b */
        public final /* synthetic */ C70593j0.C70602g f204843b;

        /* renamed from: c */
        public final /* synthetic */ C70611s0 f204844c;

        public C70749m(C70593j0 j0Var, C70593j0.C70602g gVar, C70611s0 s0Var) {
            this.f204842a = j0Var;
            this.f204843b = gVar;
            this.f204844c = s0Var;
        }

        public void onClick(View view) {
            C70593j0 j0Var = this.f204842a;
            if (j0Var != null) {
                RemittanceDetailUI.m83236H7(RemittanceDetailUI.this, this.f204843b.f204230b, j0Var, 12);
                return;
            }
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C70593j0.C70597d dVar = this.f204843b.f204230b;
            C70611s0 s0Var = this.f204844c;
            int i = RemittanceDetailUI.f204704z1;
            remittanceDetailUI.getClass();
            remittanceDetailUI.mo97384R7(dVar, s0Var.f204284r.f228329f, remittanceDetailUI.f204738Z, 12, (C86300q) null, (Runnable) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$n */
    public class C70750n implements Runnable {

        /* renamed from: d */
        public boolean f204846d = false;

        /* renamed from: e */
        public final /* synthetic */ Dialog f204847e;

        public C70750n(Dialog dialog) {
            this.f204847e = dialog;
        }

        public void run() {
            Log.m105925i("MicroMsg.RemittanceDetailUI", "WalletGetUserInfoEvent callback() hasCallback:%s", Boolean.valueOf(this.f204846d));
            if (!this.f204846d) {
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                Dialog dialog = this.f204847e;
                int i = RemittanceDetailUI.f204704z1;
                remittanceDetailUI.getClass();
                if (dialog != null) {
                    dialog.dismiss();
                }
                Intent intent = new Intent(remittanceDetailUI, WalletLqtDetailUI.class);
                intent.putExtra("key_account_type", 0);
                remittanceDetailUI.mo97389W7(intent, true);
            }
            this.f204846d = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$o */
    public class C70751o implements C11184p0 {
        public C70751o() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            if (Util.isEqual(RemittanceDetailUI.this.f204778v1, (int) C0966R.C0970id.im5)) {
                str = RemittanceDetailUI.this.f204775u.getText().toString().trim();
            } else if (Util.isEqual(RemittanceDetailUI.this.f204778v1, (int) C0966R.C0970id.ilb)) {
                StringBuilder sb = new StringBuilder();
                sb.append(RemittanceDetailUI.this.f204777v.getText().toString().trim() + " ");
                String trim = RemittanceDetailUI.this.f204781x.getText().toString().trim();
                if (trim.endsWith(RemittanceDetailUI.this.getString(C0966R.string.i0l))) {
                    sb.append(trim.substring(0, trim.length() - 4));
                } else {
                    sb.append(trim);
                }
                str = sb.toString();
            } else if (Util.isEqual(RemittanceDetailUI.this.f204778v1, (int) C0966R.C0970id.im4)) {
                str = RemittanceDetailUI.this.f204722R.getText().toString().trim();
            } else if (Util.isEqual(RemittanceDetailUI.this.f204778v1, (int) C0966R.C0970id.ilc)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(RemittanceDetailUI.this.f204724S.getText().toString().trim() + " ");
                String trim2 = RemittanceDetailUI.this.f204728U.getText().toString().trim();
                if (trim2.endsWith(RemittanceDetailUI.this.getString(C0966R.string.i0l))) {
                    sb4.append(trim2.substring(0, trim2.length() - 4));
                } else {
                    sb4.append(trim2);
                }
                str = sb4.toString();
            } else {
                str = "";
            }
            ClipboardHelper.setText(MMApplicationContext.getContext(), (CharSequence) null, str);
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            C76879j.m92726T(remittanceDetailUI, remittanceDetailUI.getString(C0966R.string.f7938wv));
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$p */
    public class C70752p implements View.OnTouchListener {
        public C70752p() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$32", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                RemittanceDetailUI.this.f204774t1 = (int) motionEvent.getRawX();
                RemittanceDetailUI.this.f204776u1 = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$32", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$q */
    public class C70753q implements View.OnLongClickListener {
        public C70753q() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$33", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105918d("MicroMsg.RemittanceDetailUI", "onLongClick");
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            if (remittanceDetailUI.f204772s1 == null) {
                remittanceDetailUI.f204772s1 = new C78253a(remittanceDetailUI.getContext());
            }
            RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
            remittanceDetailUI2.f204772s1.mo108273h(view, remittanceDetailUI2, remittanceDetailUI2.f204780w1, remittanceDetailUI2.f204774t1, remittanceDetailUI2.f204776u1);
            RemittanceDetailUI.this.f204778v1 = view.getId();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$33", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$r */
    public class C70754r implements DialogInterface.OnClickListener {
        public C70754r(RemittanceDetailUI remittanceDetailUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$s */
    public class C70755s implements DialogInterface.OnClickListener {
        public C70755s(RemittanceDetailUI remittanceDetailUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$t */
    public class C70756t implements C75121j {
        public C70756t() {
        }

        /* renamed from: a */
        public void mo95711a() {
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            remittanceDetailUI.mo97381O7(remittanceDetailUI.f204723R0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$u */
    public class C70757u implements C72506r.C72510d {
        public C70757u() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            int i = gl22.f227479e;
            if (i == 2) {
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                remittanceDetailUI.mo97378L7(remittanceDetailUI.f204723R0.f204063g, "");
            } else if (i == 1) {
                RemittanceDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$v */
    public class C70758v implements C32227p<C72502o.C72503a, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f204854d;

        public C70758v(String str) {
            this.f204854d = str;
        }

        public Object invoke(Object obj, Object obj2) {
            C72502o.C72503a aVar = (C72502o.C72503a) obj;
            long longValue = ((Long) obj2).longValue();
            RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
            if (longValue != remittanceDetailUI.f204757k1) {
                Log.m105920e("MicroMsg.RemittanceDetailUI", "unexpected halfpage callback");
                return C13598b0.f38549a;
            }
            remittanceDetailUI.f204757k1 = 0;
            if (aVar == C72502o.C72503a.Continue) {
                remittanceDetailUI.mo97378L7(this.f204854d, "");
            } else if (aVar == C72502o.C72503a.Exit) {
                remittanceDetailUI.finish();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$w */
    public class C70759w implements C72506r.C72510d {
        public C70759w() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            int i = gl22.f227479e;
            if (i == 2) {
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                remittanceDetailUI.mo97378L7(remittanceDetailUI.f204725S0.f163879r.f184889g, "");
            } else if (i == 1) {
                RemittanceDetailUI.this.finish();
            } else if (i == 6) {
                RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
                remittanceDetailUI2.mo97378L7(remittanceDetailUI2.f204725S0.f163879r.f184889g, gl22.f227483i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$x */
    public class C70760x implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f204857d;

        public C70760x(boolean z) {
            this.f204857d = z;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            if (this.f204857d) {
                RemittanceDetailUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$y */
    public class C70761y implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f204859d;

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$y$a */
        public class C70762a implements C11182m0 {
            public C70762a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                C70593j0.C70597d dVar;
                Iterator it = C70761y.this.f204859d.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C70593j0.C70602g gVar = (C70593j0.C70602g) it.next();
                    if (!(Util.isNullOrNil(gVar.f204229a) || (dVar = gVar.f204230b) == null || dVar.f204203a == 0)) {
                        Log.m105925i("MicroMsg.RemittanceDetailUI", " add option :%s", gVar.f204229a);
                        e0Var.mo107142f(i, gVar.f204229a);
                    }
                    i++;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$y$b */
        public class C70763b implements C11184p0 {
            public C70763b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (menuItem.getItemId() > C70761y.this.f204859d.size() - 1) {
                    Log.m105925i("MicroMsg.RemittanceDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", Integer.valueOf(menuItem.getItemId()), Integer.valueOf(C70761y.this.f204859d.size()));
                    return;
                }
                C70593j0.C70602g gVar = (C70593j0.C70602g) C70761y.this.f204859d.get(menuItem.getItemId());
                Log.m105925i("MicroMsg.RemittanceDetailUI", " click option menu : %s ,type:%s", gVar.f204229a, Integer.valueOf(gVar.f204230b.f204203a));
                C70593j0.C70597d dVar = gVar.f204230b;
                int i2 = dVar.f204203a;
                if (i2 == 1) {
                    Log.m105925i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", dVar.f204204b);
                    C75228t.m90219L(RemittanceDetailUI.this.getContext(), gVar.f204230b.f204204b, false);
                } else if (i2 == 2) {
                    Log.m105925i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", dVar.f204205c);
                    C70593j0.C70597d dVar2 = gVar.f204230b;
                    C75228t.m90224Q(dVar2.f204205c, dVar2.f204206d, 0, 1000);
                } else if (i2 != 3) {
                    Log.m105920e("MicroMsg.RemittanceDetailUI", "unknow text info type");
                } else {
                    Log.m105920e("MicroMsg.RemittanceDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                }
            }
        }

        public C70761y(ArrayList arrayList) {
            this.f204859d = arrayList;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) RemittanceDetailUI.this, 1, false);
            nVar.f225771i = new C70762a();
            nVar.f225782p = new C70763b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$z */
    public class C70764z extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C101218e0 f204863g;

        public C70764z(RemittanceDetailUI remittanceDetailUI, C101218e0 e0Var) {
            this.f204863g = e0Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            this.f204863g.mo140680z();
        }
    }

    public RemittanceDetailUI() {
        C40008f fVar = C40008f.f107254d;
        this.f204761n1 = new IListener<RemittanceJsapiConfirmEvent>(fVar) {
            {
                this.__eventId = 884410592;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceJsapiConfirmEvent remittanceJsapiConfirmEvent = (RemittanceJsapiConfirmEvent) iEvent;
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                remittanceDetailUI.f204759m1 = true;
                remittanceDetailUI.mo97377K7();
                return true;
            }
        };
        this.f204763o1 = new IListener<RemittanceRefuseEvent>(fVar) {
            {
                this.__eventId = 1781011512;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceRefuseEvent remittanceRefuseEvent = (RemittanceRefuseEvent) iEvent;
                if (!Util.isNullOrNil(remittanceRefuseEvent.f193895d.f193896a) && !Util.isNullOrNil(remittanceRefuseEvent.f193895d.f193897b)) {
                    RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                    C76879j.m92707A(remittanceDetailUI, remittanceDetailUI.getString(C0966R.string.f361192i11, new Object[]{remittanceDetailUI.mo97382P7(remittanceDetailUI.f204727T0, false)}), "", RemittanceDetailUI.this.getString(C0966R.string.i16), RemittanceDetailUI.this.getString(C0966R.string.f7926wf), new C70945s0(this, remittanceRefuseEvent), new C70949t0(this));
                }
                return false;
            }
        };
        this.f204766p1 = new IListener<RemittanceDetailUIFinishEvent>(fVar) {
            {
                this.__eventId = 442276148;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceDetailUIFinishEvent remittanceDetailUIFinishEvent = (RemittanceDetailUIFinishEvent) iEvent;
                Log.m105924i("MicroMsg.RemittanceDetailUI", "RemittanceDetailUIFinishEvent");
                MMHandlerThread.postToMainThreadDelayed(new C70960x0(this), 500);
                return false;
            }
        };
        this.f204768q1 = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                Log.m105925i("MicroMsg.RemittanceDetailUI", "receive revoke msg: %s", Long.valueOf(revokeMsgEvent.f78943d.f78944a));
                long j = revokeMsgEvent.f78943d.f78944a;
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                if (j == remittanceDetailUI.f204733W0) {
                    AppCompatActivity context = remittanceDetailUI.getContext();
                    RemittanceDetailUI remittanceDetailUI2 = RemittanceDetailUI.this;
                    C76879j.m92754y(context, remittanceDetailUI2.getString(C0966R.string.f361201i30, new Object[]{remittanceDetailUI2.mo97382P7(remittanceDetailUI2.f204727T0, false)}), "", RemittanceDetailUI.this.getString(C0966R.string.f8029zr), new C70966z0(this));
                }
                return false;
            }
        };
        this.f204770r1 = new IListener<RemittanceAccountDetailEvent>(fVar) {
            {
                this.__eventId = -391635254;
            }

            public boolean callback(IEvent iEvent) {
                RemittanceAccountDetailEvent.C67774a aVar;
                int i;
                RemittanceAccountDetailEvent remittanceAccountDetailEvent = (RemittanceAccountDetailEvent) iEvent;
                if (remittanceAccountDetailEvent == null || (aVar = remittanceAccountDetailEvent.f193883d) == null || (i = aVar.f193884a) == 0) {
                    Log.m105924i("MicroMsg.RemittanceDetailUI", "remittanceAccountDetailEventListener event == null || event.data == null || event.data.jumpInfoType == 0");
                    return false;
                }
                C70593j0.C70597d dVar = new C70593j0.C70597d();
                dVar.f204203a = i;
                dVar.f204204b = aVar.f193885b;
                dVar.f204205c = aVar.f193886c;
                dVar.f204206d = aVar.f193887d;
                RemittanceDetailUI remittanceDetailUI = RemittanceDetailUI.this;
                int i2 = RemittanceDetailUI.f204704z1;
                remittanceDetailUI.mo97384R7(dVar, 0, "", 0, (C86300q) null, (Runnable) null);
                return false;
            }
        };
        this.f204772s1 = null;
        this.f204778v1 = 0;
        this.f204780w1 = new C70751o();
        this.f204783x1 = new C70752p();
        this.f204786y1 = new C70753q();
    }

    /* renamed from: H7 */
    public static void m83236H7(RemittanceDetailUI remittanceDetailUI, C70593j0.C70597d dVar, C70593j0 j0Var, int i) {
        remittanceDetailUI.getClass();
        remittanceDetailUI.mo97384R7(dVar, j0Var.f204175h, j0Var.f204171d, i, (C86300q) null, (Runnable) null);
    }

    /* renamed from: I7 */
    public static void m83237I7(RemittanceDetailUI remittanceDetailUI, C78023zk3 zk32, Dialog dialog, String str) {
        remittanceDetailUI.getClass();
        Log.m105924i("MicroMsg.RemittanceDetailUI", "goWalletLqtSaveFetchUI()");
        if (dialog != null) {
            dialog.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        LinkedList<C64514l50> linkedList = zk32.f228734q;
        boolean z = false;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<C64514l50> it = zk32.f228734q.iterator();
            while (it.hasNext()) {
                C64514l50 next = it.next();
                if (!Util.isNullOrNil(next.f184038d) && !Util.isNullOrNil(next.f184040f)) {
                    arrayList.add(String.format("%s||%s", new Object[]{next.f184038d, next.f184040f}));
                }
            }
        }
        Intent intent = new Intent(remittanceDetailUI, WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fund_code", zk32.f228735r);
        intent.putExtra("lqt_account_type", zk32.f228693C);
        intent.putExtra("lqt_fund_spid", zk32.f228694D);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", zk32.f228731o == 1);
        if (zk32.f228732p == 1) {
            z = true;
        }
        intent.putExtra("lqt_is_agree_protocol", z);
        intent.putExtra("operate_id", str);
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", zk32.f228745z);
        intent.putExtra("entrance_type", 2);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(remittanceDetailUI.getContext(), intent, new C70963y0(remittanceDetailUI))) {
            remittanceDetailUI.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: J7 */
    public final void mo97376J7(ArrayList<C70593j0.C70602g> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105924i("MicroMsg.RemittanceDetailUI", "ComplaintEntrance is false || mTextInfoList == null || mTextInfoList.size() ==0");
            removeAllOptionMenu();
            return;
        }
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C70761y(arrayList));
    }

    /* renamed from: K7 */
    public void mo97377K7() {
        mo97378L7("", "");
    }

    /* renamed from: L7 */
    public void mo97378L7(String str, String str2) {
        if (this.f204739Z0) {
            doSceneProgress(new C57178n0(this.f204734X, this.f204738Z, this.f204731V0, 1, str, str2));
            return;
        }
        C70585g0 g0Var = new C70585g0(this.f204734X, this.f204738Z, this.f204721Q0, "confirm", this.f204736Y, this.f204732W, str, this.f204731V0, this.f204752h1);
        g0Var.setProcessName("RemittanceProcess");
        doSceneProgress(g0Var);
    }

    /* renamed from: M7 */
    public void mo97379M7() {
        if (this.f204739Z0) {
            doSceneProgress(new C57178n0(this.f204734X, this.f204738Z, this.f204731V0, 2, "", ""));
            return;
        }
        C70585g0 g0Var = new C70585g0(this.f204734X, this.f204738Z, this.f204721Q0, "refuse", this.f204736Y, this.f204732W, this.f204731V0, this.f204752h1);
        g0Var.setProcessName("RemittanceProcess");
        doSceneProgress(g0Var);
    }

    /* renamed from: N7 */
    public void mo97380N7(int i) {
        if (this.f204739Z0) {
            doSceneProgress(new C70611s0(i, this.f204738Z, this.f204731V0), true);
            return;
        }
        doSceneProgress(new C70593j0(i, this.f204734X, this.f204738Z, this.f204732W, this.f204731V0), true);
    }

    /* renamed from: O7 */
    public final void mo97381O7(C70585g0 g0Var) {
        if ("confirm".equals(g0Var.f204060d)) {
            mo97380N7(1);
            return;
        }
        String string = getResources().getString(C0966R.string.i0v);
        Intent intent = new Intent();
        intent.putExtra("result_msg", string);
        setResult(0, intent);
        finish();
    }

    /* renamed from: P7 */
    public SpannableString mo97382P7(String str, boolean z) {
        String pb = ((C75339i) C86312j.m106911c(C75339i.class)).mo62519pb(str, this.f204731V0);
        if (pb == null) {
            return new SpannableString("");
        }
        if (z) {
            pb = C75228t.m90267q0(pb, 9);
        }
        return ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), pb);
    }

    /* renamed from: Q7 */
    public final String mo97383Q7(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        if (this.f204739Z0) {
            if (C72996z1.m85843n5(this.f204729U0) || C72996z1.m85843n5(this.f204727T0)) {
                this.f204745e.post(new C70741g0(str));
            }
            if (str.contains("{recver}") && !Util.isNullOrNil(this.f204729U0)) {
                str = str.replace("{recver}", mo97382P7(this.f204729U0, false));
            }
            return (!str.contains("{sender}") || Util.isNullOrNil(this.f204727T0)) ? str : str.replace("{sender}", mo97382P7(this.f204727T0, false));
        }
        if (str.contains("%s") && !Util.isNullOrNil(this.f204729U0)) {
            str = str.trim().replace("%s", mo97382P7(this.f204729U0, false));
        }
        return (!str.contains("%d") || Util.isNullOrNil(this.f204727T0)) ? str : str.trim().replace("%d", mo97382P7(this.f204727T0, false));
    }

    /* renamed from: R7 */
    public final void mo97384R7(C70593j0.C70597d dVar, int i, String str, int i2, C86300q qVar, Runnable runnable) {
        C43290f0.C43292b bVar;
        Log.m105925i("MicroMsg.RemittanceDetailUI", "jump() jumpInfo=%s", dVar.toString());
        TransferActionStruct transferActionStruct = new TransferActionStruct();
        transferActionStruct.f194630d = 31;
        transferActionStruct.f194631e = (long) i2;
        transferActionStruct.f194632f = (long) i;
        transferActionStruct.f194633g = transferActionStruct.mo86045b("TransferId", str, true);
        transferActionStruct.mo86054n();
        int i3 = dVar.f204203a;
        if (i3 == 1) {
            if (runnable != null) {
                ((C45518r0) C86312j.m106911c(C45518r0.class)).bk0(dVar.f204204b, runnable);
            }
            ((C16292g) C86312j.m106911c(C16292g.class)).nr0(this, dVar.f204204b, 0, true);
        } else if (i3 != 2) {
            if (i3 == 3) {
                Dialog d = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
                if (!Util.isNullOrNil(dVar.f204204b) && (dVar.f204204b.startsWith("weixin://wcpay/lqt/detail") || dVar.f204204b.equals("qryusrfunddetail"))) {
                    C71648n1.m84124b(dVar.f204204b);
                    if (C79029b0.vx0().wx0().f192955h == null) {
                        Log.m105924i("MicroMsg.RemittanceDetailUI", "publish WalletGetUserInfoEvent");
                        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                        WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
                        aVar.f194040a = 1;
                        aVar.f194041b = true;
                        aVar.f194042c = true;
                        walletGetUserInfoEvent.f194039e.f194055a = new C70750n(d);
                        walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
                        return;
                    }
                    if (d != null) {
                        d.dismiss();
                    }
                    Intent intent = new Intent(this, WalletLqtDetailUI.class);
                    intent.putExtra("key_account_type", 0);
                    mo97389W7(intent, true);
                } else if (!Util.isNullOrNil(dVar.f204204b) && (dVar.f204204b.startsWith("weixin://wcpay/lqt/save") || dVar.f204204b.equals("purchasefund"))) {
                    C71648n1.m84124b(dVar.f204204b);
                    String a = C71648n1.m84123a(dVar.f204204b);
                    C43290f0 f0Var = (C43290f0) new C97688c().mo136940b(this, C43290f0.class);
                    if (f0Var == null || (bVar = f0Var.f117126b) == null) {
                        Log.m105924i("MicroMsg.RemittanceDetailUI", "fetchDetail() interactorGlueApi == null || interactorGlueApi.fetchLqtDetail == null");
                    } else {
                        bVar.mo67528b().mo123062e(new C70957w0(this, f0Var, d, a)).mo123065b(new C70951u0(this, d));
                    }
                } else if (!Util.isNullOrNil(dVar.f204204b) && dVar.f204204b.equals("weixin://wcpay/transfer/detail_action/refund")) {
                    if (d != null) {
                        d.dismiss();
                    }
                    RemittanceRefuseEvent remittanceRefuseEvent = new RemittanceRefuseEvent();
                    remittanceRefuseEvent.f193895d.f193896a = this.f204758l1.getString(FirebaseAnalytics.C113379b.TRANSACTION_ID);
                    remittanceRefuseEvent.f193895d.f193897b = this.f204758l1.getString("transfer_id");
                    remittanceRefuseEvent.f193895d.f193898c = this.f204758l1.getInt("total_fee");
                    remittanceRefuseEvent.f193895d.f193899d = this.f204758l1.getString("sender_name");
                    this.f204763o1.callback(remittanceRefuseEvent);
                } else if (d != null) {
                    d.dismiss();
                }
            }
        } else if (qVar != null) {
            C75228t.m90225R(dVar.f204205c, dVar.f204206d, 0, 1034, qVar);
        } else {
            C75228t.m90224Q(dVar.f204205c, dVar.f204206d, 0, 1034);
        }
    }

    /* renamed from: S7 */
    public final boolean mo97385S7(String str, String str2) {
        TextPaint paint = this.f204745e.getPaint();
        int width = this.f204745e.getWidth();
        float measureText = paint.measureText(str + "@");
        float measureText2 = paint.measureText(str2);
        float f = (float) width;
        return ((int) (measureText / f)) != ((int) ((measureText2 + measureText) / f));
    }

    /* JADX WARNING: type inference failed for: r1v109, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r1v112 */
    /* JADX WARNING: type inference failed for: r1v113 */
    /* JADX WARNING: type inference failed for: r1v125 */
    /* JADX WARNING: type inference failed for: r1v137, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r1v145 */
    /* JADX WARNING: type inference failed for: r1v151 */
    /* JADX WARNING: type inference failed for: r1v166 */
    /* JADX WARNING: type inference failed for: r1v167 */
    /* JADX WARNING: type inference failed for: r2v103, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v104 */
    /* JADX WARNING: type inference failed for: r2v105 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r8.f204178n != false) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0725  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x08a5  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02c6  */
    /* renamed from: T7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97386T7(com.tencent.p014mm.plugin.remittance.model.C70593j0 r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            r9 = 1
            r10 = 0
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0ba1
            r12 = 2
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r2 = r7.f204731V0
            r1[r10] = r2
            int r2 = r8.f204167A
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r9] = r2
            java.lang.String r2 = "MicroMsg.RemittanceDetailUI"
            java.lang.String r3 = "groupname: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            java.lang.String r1 = r7.f204731V0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0044
            int r1 = r8.f204167A
            if (r1 <= 0) goto L_0x0044
            java.lang.String r3 = r8.f204177j
            r7.f204727T0 = r3
            java.lang.String r3 = r8.f204176i
            r7.f204729U0 = r3
            if (r1 != r9) goto L_0x003d
            boolean r1 = r8.f204178n
            if (r1 == 0) goto L_0x005e
            goto L_0x0052
        L_0x003d:
            if (r1 != r12) goto L_0x0042
            r1 = 3
            r13 = 3
            goto L_0x005f
        L_0x0042:
            r13 = 0
            goto L_0x005f
        L_0x0044:
            boolean r1 = r8.f204178n
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = eb0.C75592q0.m90789s()
            r7.f204727T0 = r1
            java.lang.String r1 = r7.f204736Y
            r7.f204729U0 = r1
        L_0x0052:
            r13 = 1
            goto L_0x005f
        L_0x0054:
            java.lang.String r1 = r7.f204736Y
            r7.f204727T0 = r1
            java.lang.String r1 = eb0.C75592q0.m90789s()
            r7.f204729U0 = r1
        L_0x005e:
            r13 = 2
        L_0x005f:
            eb0.C75592q0.m90789s()
            android.widget.TextView r1 = r7.f204747f
            double r3 = r8.f204173f
            java.lang.String r5 = r8.f204174g
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r3, r5)
            r1.setText(r3)
            android.widget.TextView r1 = r7.f204747f
            r3 = 1111490560(0x42400000, float:48.0)
            r1.setTextSize(r9, r3)
            java.lang.String r1 = r8.f204182r
            java.lang.String r3 = r7.mo97383Q7(r1)
            java.lang.String r14 = r8.f204183s
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r1 = r7.f204734X
            java.lang.String r4 = "transaction_id"
            r15.putString(r4, r1)
            java.lang.String r1 = r7.f204729U0
            java.lang.String r4 = "receiver_name"
            r15.putString(r4, r1)
            java.lang.String r1 = r7.f204738Z
            java.lang.String r4 = "transfer_id"
            r15.putString(r4, r1)
            int r1 = r7.f204721Q0
            java.lang.String r4 = "total_fee"
            r15.putInt(r4, r1)
            java.lang.String r1 = r7.f204736Y
            java.lang.String r4 = "sender_name"
            r15.putString(r4, r1)
            int r1 = r7.f204732W
            java.lang.String r4 = "invalid_time"
            r15.putInt(r4, r1)
            com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo r1 = r8.f204189y
            java.lang.String r4 = "resend_msg_info"
            r15.putParcelable(r4, r1)
            boolean r1 = r7.f204739Z0
            java.lang.String r4 = "is_open_im"
            r15.putInt(r4, r1)
            r7.f204758l1 = r15
            android.widget.TextView r1 = r7.f204753i
            r1.setClickable(r9)
            android.widget.TextView r1 = r7.f204745e
            r1.setClickable(r9)
            android.widget.TextView r1 = r7.f204714J
            r1.setClickable(r9)
            int r1 = r8.f204175h
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4[r10] = r5
            java.lang.String r5 = "status: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r4)
            java.lang.String r6 = "LQT"
            java.lang.String r10 = "CFT"
            r4 = 2131834717(0x7f11375d, float:1.9302552E38)
            r5 = 8
            switch(r1) {
                case 2000: goto L_0x08a5;
                case 2001: goto L_0x0725;
                case 2002: goto L_0x054f;
                case 2003: goto L_0x054f;
                case 2004: goto L_0x02c6;
                case 2005: goto L_0x00f3;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r18.finish()
            goto L_0x0b9a
        L_0x00f3:
            android.widget.ImageView r1 = r7.f204743d
            r2 = 2131756895(0x7f10075f, float:1.914471E38)
            r1.setImageResource(r2)
            if (r13 == r9) goto L_0x0178
            if (r13 != r12) goto L_0x0101
            goto L_0x0178
        L_0x0101:
            android.widget.ImageView r1 = r7.f204743d
            r1.setImageResource(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x0137
            android.widget.TextView r10 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r6 = 1
            r2 = r18
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            r13 = 8
            r5 = r6
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r1)
            android.widget.TextView r1 = r7.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x0141
        L_0x0137:
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            r13 = 8
            android.widget.TextView r1 = r7.f204745e
            r1.setText(r4)
        L_0x0141:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x01da
            android.widget.TextView r10 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r3 = r14
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x01da
        L_0x0178:
            r4 = 8
            r5 = 2131834744(0x7f113778, float:1.9302607E38)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x01e2
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x01e2
            android.widget.TextView r10 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r6 = (int) r2
            r12 = 1
            r2 = r18
            r13 = 8
            r4 = r6
            r6 = 2131834744(0x7f113778, float:1.9302607E38)
            r5 = r12
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r1)
            android.widget.TextView r10 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r3 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x01da:
            r1 = 8
            r2 = 0
            r5 = 2131834744(0x7f113778, float:1.9302607E38)
            goto L_0x027b
        L_0x01e2:
            r1 = 8
            java.lang.String r0 = r8.f204182r
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01f4
            android.widget.TextView r0 = r7.f204745e
            java.lang.String r2 = r8.f204182r
            r0.setText(r2)
            goto L_0x01fc
        L_0x01f4:
            android.widget.TextView r0 = r7.f204745e
            r2 = 2131834729(0x7f113769, float:1.9302577E38)
            r0.setText(r2)
        L_0x01fc:
            java.lang.String r0 = r8.f204183s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0265
            java.lang.String r0 = r8.f204180p
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x021d
            java.lang.String r0 = r8.f204180p
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0215
            goto L_0x021d
        L_0x0215:
            android.widget.TextView r0 = r7.f204753i
            java.lang.String r2 = r8.f204183s
            r0.setText(r2)
            goto L_0x027a
        L_0x021d:
            java.lang.String r0 = r8.f204180p
            boolean r0 = r6.equals(r0)
            java.lang.String r2 = r8.f204183s
            if (r0 == 0) goto L_0x022b
            r3 = 2131834712(0x7f113758, float:1.9302542E38)
            goto L_0x022e
        L_0x022b:
            r3 = 2131834709(0x7f113755, float:1.9302536E38)
        L_0x022e:
            java.lang.String r3 = r7.getString(r3)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            td2.a r3 = new td2.a
            r3.<init>(r7)
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f r6 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$f
            r6.<init>(r0)
            r3.f226941e = r6
            int r0 = r2.length()
            int r2 = r4.length()
            r6 = 18
            r4.setSpan(r3, r0, r2, r6)
            android.widget.TextView r0 = r7.f204753i
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r2)
            android.widget.TextView r0 = r7.f204753i
            r0.setText(r4)
            goto L_0x027a
        L_0x0265:
            if (r13 != r12) goto L_0x0270
            android.widget.TextView r0 = r7.f204753i
            r2 = 2131834719(0x7f11375f, float:1.9302556E38)
            r0.setText(r2)
            goto L_0x027a
        L_0x0270:
            if (r13 != r9) goto L_0x027a
            android.widget.TextView r0 = r7.f204753i
            r2 = 2131834740(0x7f113774, float:1.9302599E38)
            r0.setText(r2)
        L_0x027a:
            r2 = 0
        L_0x027b:
            r7.mo97391Y7(r2, r2, r8)
            android.widget.TextView r0 = r7.f204749g
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r4 = r8.f204172e
            java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r4)
            r3[r2] = r4
            java.lang.String r3 = r7.getString(r5, r3)
            r0.setText(r3)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r1)
            int r0 = r8.f204179o
            if (r0 <= 0) goto L_0x02bf
            android.widget.TextView r3 = r7.f204751h
            r4 = 2131834708(0x7f113754, float:1.9302534E38)
            java.lang.Object[] r5 = new java.lang.Object[r9]
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r0)
            r5[r2] = r0
            java.lang.String r0 = r7.getString(r4, r5)
            r3.setText(r0)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r1)
            goto L_0x0b9a
        L_0x02bf:
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r1)
            goto L_0x0b9a
        L_0x02c6:
            r1 = 8
            r5 = 2131834744(0x7f113778, float:1.9302607E38)
            if (r13 != r12) goto L_0x038f
            android.widget.ImageView r2 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            androidx.appcompat.app.AppCompatActivity r6 = r18.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131099737(0x7f060059, float:1.7811836E38)
            int r6 = r6.getColor(r10)
            r10 = 2131756178(0x7f100492, float:1.9143256E38)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r10, r6)
            r2.setImageDrawable(r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x0350
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 != 0) goto L_0x0350
            android.widget.TextView r10 = r7.f204745e
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            android.widget.TextView r4 = r7.f204745e
            float r4 = r4.getTextSize()
            int r4 = (int) r4
            r6 = 1
            r12 = 8
            r1 = r2
            r2 = r18
            r13 = 2131834718(0x7f11375e, float:1.9302554E38)
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            r5 = r6
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r1)
            android.widget.TextView r10 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r3 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r10.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x0389
        L_0x0350:
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            r13 = 2131834718(0x7f11375e, float:1.9302554E38)
            java.lang.String r0 = r8.f204182r
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0366
            android.widget.TextView r0 = r7.f204745e
            java.lang.String r1 = r8.f204182r
            r0.setText(r1)
            goto L_0x036e
        L_0x0366:
            android.widget.TextView r0 = r7.f204745e
            r1 = 2131834731(0x7f11376b, float:1.930258E38)
            r0.setText(r1)
        L_0x036e:
            java.lang.String r0 = r8.f204183s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0384
            android.widget.TextView r0 = r7.f204753i
            java.lang.String r1 = r8.f204183s
            r0.setText(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x0389
        L_0x0384:
            android.widget.TextView r0 = r7.f204753i
            r0.setText(r11)
        L_0x0389:
            r1 = 0
            r10 = 2131834718(0x7f11375e, float:1.9302554E38)
            goto L_0x050e
        L_0x038f:
            r10 = 2131834718(0x7f11375e, float:1.9302554E38)
            r12 = 2131834744(0x7f113778, float:1.9302607E38)
            if (r13 != r9) goto L_0x0483
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            androidx.appcompat.app.AppCompatActivity r5 = r18.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099737(0x7f060059, float:1.7811836E38)
            int r5 = r5.getColor(r6)
            r6 = 2131756178(0x7f100492, float:1.9143256E38)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r6, r5)
            r1.setImageDrawable(r4)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x0414
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0414
            android.widget.TextView r13 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r16 = 1
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r1)
            android.widget.TextView r13 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r14
            r5 = r16
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x050e
        L_0x0414:
            java.lang.String r0 = r8.f204182r
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 2131834733(0x7f11376d, float:1.9302585E38)
            if (r0 != 0) goto L_0x0452
            android.widget.TextView r0 = r7.f204745e     // Catch:{ Exception -> 0x0437 }
            java.lang.String r3 = r8.f204182r     // Catch:{ Exception -> 0x0437 }
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0437 }
            java.lang.String r5 = r7.f204729U0     // Catch:{ Exception -> 0x0437 }
            android.text.SpannableString r5 = r7.mo97382P7(r5, r9)     // Catch:{ Exception -> 0x0437 }
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0437 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ Exception -> 0x0437 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0437 }
            r3 = 0
            goto L_0x0466
        L_0x0437:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r11, r4)
            android.widget.TextView r0 = r7.f204745e
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r4 = r7.f204729U0
            android.text.SpannableString r4 = r7.mo97382P7(r4, r9)
            r2[r3] = r4
            java.lang.String r1 = r7.getString(r1, r2)
            r0.setText(r1)
            goto L_0x0466
        L_0x0452:
            r3 = 0
            android.widget.TextView r0 = r7.f204745e
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r4 = r7.f204729U0
            android.text.SpannableString r4 = r7.mo97382P7(r4, r9)
            r2[r3] = r4
            java.lang.String r1 = r7.getString(r1, r2)
            r0.setText(r1)
        L_0x0466:
            java.lang.String r0 = r8.f204183s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x047d
            android.widget.TextView r0 = r7.f204753i
            java.lang.String r1 = r8.f204183s
            r0.setText(r1)
            android.widget.TextView r0 = r7.f204753i
            r0.setVisibility(r3)
        L_0x047a:
            r1 = 0
            goto L_0x050e
        L_0x047d:
            android.widget.TextView r0 = r7.f204753i
            r0.setText(r11)
            goto L_0x047a
        L_0x0483:
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            androidx.appcompat.app.AppCompatActivity r5 = r18.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099737(0x7f060059, float:1.7811836E38)
            int r5 = r5.getColor(r6)
            r6 = 2131756178(0x7f100492, float:1.9143256E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r6, r5)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x04cd
            android.widget.TextView r13 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r1)
            android.widget.TextView r1 = r7.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x04d2
        L_0x04cd:
            android.widget.TextView r1 = r7.f204745e
            r1.setText(r4)
        L_0x04d2:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x047a
            android.widget.TextView r13 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r3 = r14
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
        L_0x050e:
            r7.mo97391Y7(r1, r1, r8)
            android.widget.TextView r0 = r7.f204749g
            java.lang.Object[] r2 = new java.lang.Object[r9]
            int r3 = r8.f204172e
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r3)
            r2[r1] = r3
            java.lang.String r2 = r7.getString(r12, r2)
            r0.setText(r2)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204749g
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204751h
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r4 = r8.f204179o
            java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r4)
            r3[r1] = r4
            java.lang.String r3 = r7.getString(r10, r3)
            r0.setText(r3)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r2)
            goto L_0x0b9a
        L_0x054f:
            r2 = 2
            r12 = 8
            r16 = 2131834709(0x7f113755, float:1.9302536E38)
            r5 = 2003(0x7d3, float:2.807E-42)
            if (r1 != r5) goto L_0x0579
            android.widget.ImageView r12 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            r2 = 2131756021(0x7f1003f5, float:1.9142938E38)
            androidx.appcompat.app.AppCompatActivity r17 = r18.getContext()
            android.content.res.Resources r5 = r17.getResources()
            r9 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r5 = r5.getColor(r9)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r2, r5)
            r12.setImageDrawable(r2)
            goto L_0x0598
        L_0x0579:
            android.widget.ImageView r2 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            r5 = 2131756135(0x7f100467, float:1.9143169E38)
            androidx.appcompat.app.AppCompatActivity r9 = r18.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131099941(0x7f060125, float:1.781225E38)
            int r9 = r9.getColor(r12)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r9)
            r2.setImageDrawable(r4)
        L_0x0598:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r2 != 0) goto L_0x05c6
            android.widget.TextView r9 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r18
            r12 = 33
            r12 = r6
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r7.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x061a
        L_0x05c6:
            r12 = r6
            r2 = 2131834732(0x7f11376c, float:1.9302583E38)
            r3 = 1
            if (r13 != r3) goto L_0x0609
            r4 = 2003(0x7d3, float:2.807E-42)
            if (r1 != r4) goto L_0x05da
            android.widget.TextView r1 = r7.f204745e
            r2 = 2131834734(0x7f11376e, float:1.9302587E38)
            r1.setText(r2)
            goto L_0x061a
        L_0x05da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r7.f204729U0
            android.text.SpannableString r4 = r7.mo97382P7(r4, r3)
            r1.append(r4)
            java.lang.String r2 = r7.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.widget.TextView r2 = r7.f204745e
            di3.d r3 = di3.C86312j.m106911c(r0)
            ny.h r3 = (p629ny.C76979h) r3
            android.widget.TextView r4 = r7.f204745e
            float r4 = r4.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r7, r1, r4)
            r2.setText(r1)
            goto L_0x061a
        L_0x0609:
            r4 = 2
            if (r13 != r4) goto L_0x0612
            android.widget.TextView r1 = r7.f204745e
            r1.setText(r2)
            goto L_0x061a
        L_0x0612:
            android.widget.TextView r1 = r7.f204745e
            r2 = 2131834717(0x7f11375d, float:1.9302552E38)
            r1.setText(r2)
        L_0x061a:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x064e
            android.widget.TextView r9 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r3 = r14
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x06da
        L_0x064e:
            r1 = 1
            if (r13 != r1) goto L_0x06d2
            java.lang.String r0 = r8.f204180p
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x066b
            java.lang.String r0 = r8.f204180p
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0662
            goto L_0x066b
        L_0x0662:
            android.widget.TextView r0 = r7.f204753i
            r1 = 2131834725(0x7f113765, float:1.9302568E38)
            r0.setText(r1)
            goto L_0x06cb
        L_0x066b:
            java.lang.String r0 = r8.f204180p
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0677
            r1 = 2131834726(0x7f113766, float:1.930257E38)
            goto L_0x067a
        L_0x0677:
            r1 = 2131834724(0x7f113764, float:1.9302566E38)
        L_0x067a:
            java.lang.String r1 = r7.getString(r1)
            if (r0 == 0) goto L_0x0684
            r5 = 2131834712(0x7f113758, float:1.9302542E38)
            goto L_0x0687
        L_0x0684:
            r5 = 2131834709(0x7f113755, float:1.9302536E38)
        L_0x0687:
            java.lang.String r2 = r7.getString(r5)
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            td2.a r4 = new td2.a
            r4.<init>(r7)
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$e r5 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$e
            r5.<init>(r0)
            r4.f226941e = r5
            int r0 = r1.length()
            int r1 = r1.length()
            int r2 = r2.length()
            int r1 = r1 + r2
            r2 = 33
            r3.setSpan(r4, r0, r1, r2)
            android.widget.TextView r0 = r7.f204753i
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r7.f204753i
            r0.setText(r3)
        L_0x06cb:
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x06da
        L_0x06d2:
            r1 = 0
            android.widget.TextView r0 = r7.f204753i
            r2 = 8
            r0.setVisibility(r2)
        L_0x06da:
            r7.mo97391Y7(r1, r1, r8)
            android.widget.TextView r0 = r7.f204749g
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r8.f204172e
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r2)
            r3[r1] = r2
            r2 = 2131834744(0x7f113778, float:1.9302607E38)
            java.lang.String r2 = r7.getString(r2, r3)
            r0.setText(r2)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204749g
            r2 = 8
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204751h
            r2 = 2131834722(0x7f113762, float:1.9302562E38)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r8.f204179o
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r3)
            r4[r1] = r3
            java.lang.String r2 = r7.getString(r2, r4)
            r0.setText(r2)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204751h
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0b9a
        L_0x0725:
            r4 = 2
            r10 = 2131834718(0x7f11375e, float:1.9302554E38)
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            r5 = 2131756011(0x7f1003eb, float:1.9142917E38)
            androidx.appcompat.app.AppCompatActivity r6 = r18.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r6 = r6.getColor(r9)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r5, r6)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x07a9
            android.widget.TextView r9 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r5 = (int) r2
            r6 = 1
            r12 = 2
            r2 = r18
            r4 = r5
            r5 = r6
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r7.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0857
            android.widget.TextView r9 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r3 = r14
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x0857
        L_0x07a9:
            r12 = 2
            r1 = 2131834730(0x7f11376a, float:1.9302579E38)
            if (r13 != r12) goto L_0x07ea
            android.widget.TextView r0 = r7.f204745e
            r0.setText(r1)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r1 = 2131834709(0x7f113755, float:1.9302536E38)
            java.lang.String r1 = r7.getString(r1)
            r0.<init>(r1)
            td2.a r1 = new td2.a
            r1.<init>(r7)
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$d r2 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$d
            r2.<init>()
            r1.f226941e = r2
            int r2 = r0.length()
            r3 = 18
            r4 = 0
            r0.setSpan(r1, r4, r2, r3)
            android.widget.TextView r1 = r7.f204753i
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            android.widget.TextView r1 = r7.f204753i
            r1.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            r0.setVisibility(r4)
            goto L_0x0857
        L_0x07ea:
            r2 = 1
            if (r13 != r2) goto L_0x0823
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r7.f204729U0
            android.text.SpannableString r4 = r7.mo97382P7(r4, r2)
            r3.append(r4)
            java.lang.String r1 = r7.getString(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.widget.TextView r2 = r7.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.widget.TextView r3 = r7.f204745e
            float r3 = r3.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r7, r1, r3)
            r2.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x0857
        L_0x0823:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x084f
            android.widget.TextView r9 = r7.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204745e
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x0857
        L_0x084f:
            android.widget.TextView r0 = r7.f204745e
            r1 = 2131834717(0x7f11375d, float:1.9302552E38)
            r0.setText(r1)
        L_0x0857:
            if (r13 != r12) goto L_0x085f
            r1 = 1
            r2 = 0
            r7.mo97391Y7(r2, r1, r8)
            goto L_0x0864
        L_0x085f:
            r1 = 1
            r2 = 0
            r7.mo97391Y7(r2, r2, r8)
        L_0x0864:
            android.widget.TextView r0 = r7.f204749g
            java.lang.Object[] r3 = new java.lang.Object[r1]
            int r4 = r8.f204172e
            java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r4)
            r3[r2] = r4
            r4 = 2131834744(0x7f113778, float:1.9302607E38)
            java.lang.String r3 = r7.getString(r4, r3)
            r0.setText(r3)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204749g
            r3 = 8
            r0.setVisibility(r3)
            android.widget.TextView r0 = r7.f204751h
            java.lang.Object[] r4 = new java.lang.Object[r1]
            int r5 = r8.f204179o
            java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r5)
            r4[r2] = r5
            java.lang.String r4 = r7.getString(r10, r4)
            r0.setText(r4)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r3)
            goto L_0x0b9a
        L_0x08a5:
            r1 = 1
            if (r13 != r1) goto L_0x09a4
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099737(0x7f060059, float:1.7811836E38)
            int r4 = r4.getColor(r5)
            r5 = 2131756178(0x7f100492, float:1.9143256E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r5, r4)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x091d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x091d
            android.widget.TextView r9 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r10 = 1
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r14
            r5 = r10
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x099e
        L_0x091d:
            r1 = 2131834736(0x7f113770, float:1.930259E38)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r7.f204729U0
            android.text.SpannableString r4 = r7.mo97382P7(r4, r2)
            r5 = 0
            r3[r5] = r4
            java.lang.String r1 = r7.getString(r1, r3)
            android.widget.TextView r3 = r7.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.widget.TextView r4 = r7.f204745e
            float r4 = r4.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r7, r1, r4)
            r3.setText(r0)
            r0 = 2131834742(0x7f113776, float:1.9302603E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r7.f204782x0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r0 = r7.getString(r0, r1)
            r1 = 2131834786(0x7f1137a2, float:1.9302692E38)
            java.lang.String r1 = r7.getString(r1)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            td2.a r3 = new td2.a
            r3.<init>(r7)
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$a r4 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$a
            r4.<init>(r8)
            r3.f226941e = r4
            int r4 = r0.length()
            int r0 = r0.length()
            int r1 = r1.length()
            int r0 = r0 + r1
            r1 = 33
            r2.setSpan(r3, r4, r0, r1)
            android.widget.TextView r0 = r7.f204753i
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r7.f204753i
            r0.setText(r2)
        L_0x099e:
            r1 = 0
            r7.mo97391Y7(r1, r1, r8)
            goto L_0x0ae3
        L_0x09a4:
            if (r13 != r12) goto L_0x0ae6
            java.lang.String r1 = "set click reveive btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            r5 = 2131756466(0x7f1005b2, float:1.914384E38)
            androidx.appcompat.app.AppCompatActivity r6 = r18.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131099737(0x7f060059, float:1.7811836E38)
            int r6 = r6.getColor(r9)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r6)
            r1.setImageDrawable(r4)
            android.widget.Button r1 = r7.f204713I
            r4 = 0
            r1.setVisibility(r4)
            android.widget.Button r1 = r7.f204713I
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$b r4 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$b
            r4.<init>()
            r1.setOnClickListener(r4)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x0a33
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0a33
            android.widget.TextView r9 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r10 = 1
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r7.f204714J
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204714J
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r14
            r5 = r10
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204714J
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x0a2f:
            r1 = 1
            r2 = 0
            goto L_0x0ae0
        L_0x0a33:
            android.widget.TextView r0 = r7.f204745e
            r1 = 2131834735(0x7f11376f, float:1.9302589E38)
            r0.setText(r1)
            int r0 = r8.f204184t
            r1 = 2131834738(0x7f113772, float:1.9302595E38)
            if (r0 == 0) goto L_0x0a87
            java.lang.String r0 = r8.f204183s
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0a4d
            java.lang.String r0 = r8.f204183s
            goto L_0x0a97
        L_0x0a4d:
            java.lang.String r0 = "use hardcode wording"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            int r0 = r8.f204184t
            r2 = 1
            if (r0 != r2) goto L_0x0a5b
            java.lang.String r0 = "24"
            goto L_0x0a5d
        L_0x0a5b:
            java.lang.String r0 = "2"
        L_0x0a5d:
            r3 = 2131834737(0x7f113771, float:1.9302593E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r5 = 0
            r4[r5] = r0
            java.lang.String r0 = r7.getString(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r4 = r7.f204782x0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            java.lang.String r1 = r7.getString(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x0a97
        L_0x0a87:
            r2 = 1
            r5 = 0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            int r2 = r7.f204782x0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r0 = r7.getString(r1, r0)
        L_0x0a97:
            r1 = 2131834727(0x7f113767, float:1.9302572E38)
            java.lang.String r1 = r7.getString(r1)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            td2.a r3 = new td2.a
            r3.<init>(r7)
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c r4 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$c
            r4.<init>(r8)
            r3.f226941e = r4
            int r4 = r0.length()
            int r0 = r0.length()
            int r1 = r1.length()
            int r0 = r0 + r1
            r1 = 33
            r2.setSpan(r3, r4, r0, r1)
            android.widget.TextView r0 = r7.f204714J
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r7.f204714J
            r0.setText(r2)
            goto L_0x0a2f
        L_0x0ae0:
            r7.mo97391Y7(r1, r2, r8)
        L_0x0ae3:
            r1 = 0
            goto L_0x0b72
        L_0x0ae6:
            android.widget.ImageView r1 = r7.f204743d
            androidx.appcompat.app.AppCompatActivity r2 = r18.getContext()
            androidx.appcompat.app.AppCompatActivity r4 = r18.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099737(0x7f060059, float:1.7811836E38)
            int r4 = r4.getColor(r5)
            r5 = 2131756178(0x7f100492, float:1.9143256E38)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r5, r4)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x0b30
            android.widget.TextView r9 = r7.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r7.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r18
            r6 = r15
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r7.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x0b38
        L_0x0b30:
            android.widget.TextView r1 = r7.f204745e
            r2 = 2131834717(0x7f11375d, float:1.9302552E38)
            r1.setText(r2)
        L_0x0b38:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0b6e
            android.widget.TextView r9 = r7.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r7.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r18
            r3 = r14
            r6 = r15
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r7.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x0b6e:
            r1 = 0
            r7.mo97391Y7(r1, r1, r8)
        L_0x0b72:
            android.widget.TextView r0 = r7.f204749g
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r2 = r8.f204172e
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90262o(r2)
            r3[r1] = r2
            r2 = 2131834744(0x7f113778, float:1.9302607E38)
            java.lang.String r2 = r7.getString(r2, r3)
            r0.setText(r2)
            android.widget.TextView r0 = r7.f204749g
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204749g
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r7.f204751h
            r0.setVisibility(r1)
        L_0x0b9a:
            com.tencent.mm.wallet_core.ui.WcPayBannerView r0 = r7.f204730V
            te3.g43 r1 = r8.f204168B
            r0.setBannerData(r1)
        L_0x0ba1:
            int r0 = r8.f204184t
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_STRING
            java.lang.Object r0 = r0.mo119685f(r1, r11)
            java.lang.String r0 = (java.lang.String) r0
            r7.f204765p0 = r0
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            java.lang.String r0 = r7.f204765p0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r1 = 0
            if (r0 == 0) goto L_0x0be3
            cr3.i r0 = r7.mNetSceneMgr
            r2 = 1
            v53.C78348k0.m94629j1(r2, r0, r1)
            goto L_0x0be9
        L_0x0be3:
            cr3.i r0 = r7.mNetSceneMgr
            r2 = 0
            v53.C78348k0.m94629j1(r2, r0, r1)
        L_0x0be9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI.mo97386T7(com.tencent.mm.plugin.remittance.model.j0):void");
    }

    /* renamed from: U7 */
    public void mo97387U7(MMActivity mMActivity, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = mMActivity.getString(C0966R.string.l_3);
        }
        C76879j.m92713G(mMActivity, str, (String) null, false, new C70760x(z));
    }

    /* renamed from: V7 */
    public final void mo97388V7(C70585g0.C70586a aVar) {
        float f;
        int i;
        C70585g0.C70586a aVar2 = aVar;
        int i2 = Util.isNullOrNil(aVar2.f204066a) ? 0 : 3;
        C101218e0 e0Var = new C101218e0(getContext(), 1, i2);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.d5y, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f357486a34);
        imageView.setOnClickListener(new C70764z(this, e0Var));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        if (!Util.isNullOrNil(aVar2.f204066a)) {
            textView.setText(aVar2.f204066a);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view = inflate;
            f = 0.8f;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(0);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            e0Var.mo140672r(inflate);
            i = 8;
        } else {
            f = 0.8f;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view2 = inflate;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i = 8;
            imageView.setVisibility(8);
        }
        View inflate2 = View.inflate(getContext(), C0966R.C0971layout.d5x, (ViewGroup) null);
        View findViewById = inflate2.findViewById(C0966R.C0970id.l78);
        if (i2 == 0) {
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(Integer.valueOf(i));
            View view4 = findViewById;
            C117292a.m165358d(view4, aVar6.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "showOpenMiniMhGuide", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceConfirm$OpenMinimchGuide;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.f358384et2);
        if (!Util.isNullOrNil(aVar2.f204067b)) {
            textView2.setText(aVar2.f204067b);
        }
        C85875k4.m106189j0(textView2.getPaint(), f);
        TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.nwb);
        String str = aVar2.f204068c.f204229a;
        if (str.length() == 0) {
            textView3.setVisibility(i);
        }
        C75228t.m90253j0(textView3, str, 0, str.length(), new C7092q((C7092q.C7093a) new C70719a0(aVar2), true), getContext());
        e0Var.mo140663j(inflate2);
        e0Var.mo140667n(aVar2.f204069d.f204229a, aVar2.f204070e.f204229a);
        C70722b0 b0Var = new C70722b0(e0Var, aVar2);
        C70726c0 c0Var = new C70726c0(e0Var, aVar2);
        e0Var.f296373D = b0Var;
        e0Var.f296374E = c0Var;
        e0Var.mo140655A();
        C115669n.INSTANCE.mo160131h(28399, "halfpage", 2, 0, 1, 0);
    }

    /* renamed from: W7 */
    public final void mo97389W7(Intent intent, boolean z) {
        if (((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(getContext(), intent)) {
            return;
        }
        if (z) {
            C88144b.m109795m(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, 2);
        } else {
            C88144b.m109791i(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, (Bundle) null);
        }
    }

    /* renamed from: X7 */
    public final void mo97390X7(ArrayList<C70593j0.C70595b> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            this.f204741b1.setVisibility(8);
            Log.m105924i("MicroMsg.RemittanceDetailUI", "mDescItemList == null || mDescItemList.size() ==0");
            return;
        }
        this.f204740a1.removeAllViews();
        this.f204741b1.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f204741b1.getLayoutParams();
        if (!Util.isNullOrNil(this.f204753i.getText())) {
            this.f204753i.setVisibility(0);
        } else {
            this.f204753i.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f204753i.getText()) && this.f204753i.getText().toString().equals(" ")) {
            this.f204753i.setImportantForAccessibility(2);
        }
        if (this.f204753i.getVisibility() == 0) {
            layoutParams.topMargin = C76577a.m92151b(getContext(), 32);
            this.f204741b1.setLayoutParams(layoutParams);
        } else {
            layoutParams.topMargin = C76577a.m92151b(getContext(), 32);
            this.f204741b1.setLayoutParams(layoutParams);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C70593j0.C70595b bVar = arrayList.get(i);
            if (bVar != null) {
                if (bVar.f204196c) {
                    View view = new View(getContext());
                    view.setBackgroundColor(getContext().getResources().getColor(C0966R.color.abr));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C74942w4.m89784a(getContext(), 1) / 2);
                    layoutParams2.topMargin = C74942w4.m89784a(getContext(), 21);
                    layoutParams2.bottomMargin = C74942w4.m89784a(getContext(), 10);
                    this.f204740a1.addView(view, layoutParams2);
                } else {
                    LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(C0966R.C0971layout.bri, this.f204740a1, false);
                    ((TextView) linearLayout.findViewById(C0966R.C0970id.imh)).setText(bVar.f204194a);
                    TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.imc);
                    if (bVar.f204195b.contains("¥")) {
                        SpannableString spannableString = new SpannableString(bVar.f204195b);
                        WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new WcPayTextApppearanceSpan((String) null, 0, (int) textView.getTextSize(), ColorStateList.valueOf(getResources().getColor(C0966R.color.FG_0)), (ColorStateList) null);
                        wcPayTextApppearanceSpan.f210885d = C75228t.m90274w(getContext(), 7);
                        spannableString.setSpan(wcPayTextApppearanceSpan, 0, spannableString.length(), 17);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(bVar.f204195b);
                    }
                    textView.setOnLongClickListener(new C70868a1(this, textView));
                    this.f204740a1.addView(linearLayout);
                }
            }
        }
    }

    /* renamed from: Y7 */
    public final void mo97391Y7(boolean z, boolean z2, C70593j0 j0Var) {
        boolean z3;
        C70593j0 j0Var2 = j0Var;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WX_PAY_REMITTANCE_RECV_ACCOUNT_LAST_CHOICE_INT_SYNC;
        if (z) {
            this.f204762o.setVisibility(8);
            this.f204742c1.setVisibility(8);
            this.f204715K.setVisibility(0);
            this.f204744d1.setVisibility(0);
            String str = "  ";
            C45056f1.m49908a(this, (ViewGroup) findViewById(C0966R.C0970id.iwq), findViewById(C0966R.C0970id.hr8), findViewById(C0966R.C0970id.im9), findViewById(C0966R.C0970id.imo), 72);
            if (!Util.isNullOrNil(j0Var2.f204186v.f204191a)) {
                this.f204716L.setVisibility(0);
                if (!Util.isNullOrNil(j0Var2.f204185u)) {
                    this.f204717M.setVisibility(0);
                    this.f204722R.setText(j0Var2.f204185u);
                    this.f204722R.setOnLongClickListener(this.f204786y1);
                    this.f204722R.setOnTouchListener(this.f204783x1);
                } else {
                    this.f204717M.setVisibility(8);
                }
                if (!Util.isNullOrNil(j0Var2.f204186v.f204191a)) {
                    this.f204718N.setVisibility(0);
                    TextView textView = this.f204724S;
                    textView.setText(j0Var2.f204186v.f204191a + str + j0Var2.f204186v.f204192b);
                    this.f204720Q.post(new C70738g(j0Var2));
                } else {
                    this.f204718N.setVisibility(8);
                }
            } else {
                this.f204716L.setVisibility(8);
            }
        } else {
            String str2 = "  ";
            this.f204762o.setVisibility(0);
            this.f204742c1.setVisibility(0);
            this.f204715K.setVisibility(8);
            this.f204744d1.setVisibility(8);
            if (!Util.isNullOrNil(j0Var2.f204186v.f204191a)) {
                this.f204764p.setVisibility(0);
                if (!Util.isNullOrNil(j0Var2.f204185u)) {
                    this.f204767q.setVisibility(0);
                    this.f204775u.setText(j0Var2.f204185u);
                    this.f204775u.setOnLongClickListener(this.f204786y1);
                    this.f204775u.setOnTouchListener(this.f204783x1);
                } else {
                    this.f204767q.setVisibility(8);
                }
                if (!Util.isNullOrNil(j0Var2.f204186v.f204191a)) {
                    this.f204769r.setVisibility(0);
                    TextView textView2 = this.f204777v;
                    textView2.setText(j0Var2.f204186v.f204191a + str2 + j0Var2.f204186v.f204192b);
                    this.f204773t.post(new C70742h(j0Var2));
                } else {
                    this.f204769r.setVisibility(8);
                }
            } else {
                View view = this.f204711G;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f204767q.setVisibility(8);
                this.f204769r.setVisibility(8);
                View view3 = this.f204712H;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f204764p.setVisibility(8);
            }
        }
        if (!z2 || Util.isNullOrNil(j0Var2.f204187w.f204197a)) {
            View view5 = this.f204712H;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204784y.setVisibility(8);
            View view7 = this.f204710F;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f204762o.setVisibility(0);
            this.f204742c1.setVisibility(0);
            this.f204764p.setVisibility(0);
            View view9 = this.f204712H;
            C9556a aVar6 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar6.mo10233c(0);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204784y.setVisibility(0);
            View view11 = this.f204710F;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C20828a.m22825b().mo32518g(j0Var2.f204187w.f204197a, this.f204787z);
            this.f204705A.setText(j0Var2.f204187w.f204198b);
            this.f204706B.setText(j0Var2.f204187w.f204199c);
            C70593j0.C70596c cVar = j0Var2.f204187w;
            if (cVar.f204200d > 0) {
                this.f204708D.setText(cVar.f204201e);
                this.f204707C.setVisibility(8);
                this.f204708D.setVisibility(0);
                this.f204708D.setOnClickListener(new C70745i(j0Var2));
                C75228t.m90252j(this.f204708D, 200);
            } else {
                this.f204707C.setVisibility(0);
                this.f204708D.setVisibility(8);
                this.f204707C.setOnClickListener(new C70746j(j0Var2));
                this.f204784y.setOnClickListener(new C70747k(j0Var2));
            }
            C115669n.INSTANCE.mo160131h(28399, "operationView", 2, 0, 1);
        }
        mo97393a8(j0Var2, (C70611s0) null);
        mo97390X7(j0Var2.f204190z);
        C70593j0.C70598e eVar = j0Var2.f204169C;
        if (eVar == null) {
            Log.m105920e("MicroMsg.RemittanceDetailUI", "updateRemittanceRecvAccountInfoView data is null");
            this.f204746e1.setVisibility(8);
        } else {
            if (!Util.isNullOrNil(eVar.f204208b)) {
                this.f204754i1 = eVar.f204208b;
            }
            ArrayList<C70593j0.C70599f> arrayList = eVar.f204210d;
            if (arrayList == null || arrayList.size() <= 0) {
                Log.m105924i("MicroMsg.RemittanceDetailUI", "data.recv_channel == null || data.recv_channel.size() <= 0");
                this.f204746e1.setVisibility(8);
            } else {
                this.f204746e1.setVisibility(0);
                if (!Util.isNullOrNil(eVar.f204209c)) {
                    this.f204748f1.setText(eVar.f204209c);
                }
                C70909l0 l0Var = new C70909l0(getContext());
                ArrayList<C70593j0.C70599f> arrayList2 = eVar.f204210d;
                l0Var.f205338e = arrayList2;
                C87412m.m108593f(arrayList2, "accountInfo.recv_channel");
                if (!arrayList2.isEmpty()) {
                    Iterator<C70593j0.C70599f> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C70593j0.C70599f next = it.next();
                        if (next.f204215e == 1) {
                            if (l0Var.f205342i == 0) {
                                l0Var.f205342i = next.f204211a;
                            }
                            Object f = C86709a0.m107535s().mo121142i().mo119685f(aVar, 1);
                            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
                            if (((Integer) f).intValue() == next.f204211a) {
                                l0Var.f205343j = true;
                            }
                        }
                    }
                    Object f2 = C86709a0.m107535s().mo121142i().mo119685f(aVar, 1);
                    C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) f2).intValue();
                    if (!l0Var.f205343j || intValue == 0) {
                        l0Var.f205341h = l0Var.f205342i;
                    } else {
                        l0Var.f205341h = intValue;
                    }
                    Log.m105924i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "defalut selectChannelType：" + l0Var.f205341h);
                }
                Object f3 = C86709a0.m107535s().mo121142i().mo119685f(aVar, 1);
                C87412m.m108592e(f3, "null cannot be cast to non-null type kotlin.Int");
                int intValue2 = ((Integer) f3).intValue();
                if (eVar.f204210d.size() > 0) {
                    Iterator<C70593j0.C70599f> it4 = eVar.f204210d.iterator();
                    z3 = false;
                    while (it4.hasNext()) {
                        C70593j0.C70599f next2 = it4.next();
                        int i = next2.f204211a;
                        if (i == intValue2 && next2.f204223m != null) {
                            int g = C86709a0.m107523b().mo121110g();
                            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
                            C87412m.m108593f(mmkv, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
                            if (!mmkv.getBoolean(g + "once_usage_tips" + i, false)) {
                                int i2 = next2.f204211a;
                                int g2 = C86709a0.m107523b().mo121110g();
                                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("remittance_recv_account_choose_setting");
                                C87412m.m108593f(mmkv2, "getMMKV(ConstantsStorage…V_ACCOUNT_CHOOSE_SETTING)");
                                SharedPreferences.Editor edit = mmkv2.edit();
                                edit.putBoolean(g2 + "once_usage_tips" + i2, true);
                                Context context = l0Var.f205337d;
                                C70593j0.C70603h hVar = next2.f204223m;
                                C75228t.m90261n0(context, hVar.f204231a, hVar.f204232b, hVar.f204233c, (C75228t.C75238m) null);
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                C70593j0.C70603h hVar2 = eVar.f204207a;
                if (hVar2 != null) {
                    String str3 = hVar2.f204231a;
                    if (!(str3 == null || str3.length() == 0) && !z3) {
                        Context context2 = l0Var.f205337d;
                        C70593j0.C70603h hVar3 = eVar.f204207a;
                        C75228t.m90261n0(context2, hVar3.f204231a, hVar3.f204232b, hVar3.f204233c, (C75228t.C75238m) null);
                        z3 = true;
                    }
                }
                ArrayList<C70593j0.C70599f> arrayList3 = eVar.f204210d;
                if (!arrayList3.isEmpty()) {
                    Iterator<C70593j0.C70599f> it5 = arrayList3.iterator();
                    boolean z4 = false;
                    while (it5.hasNext()) {
                        C70593j0.C70599f next3 = it5.next();
                        if (next3.f204211a == l0Var.f205341h) {
                            int i3 = next3.f204211a;
                            l0Var.f205341h = i3;
                            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i3));
                        }
                        if (next3.f204211a == intValue2) {
                            if (next3.f204215e == 2 && !l0Var.f205343j && l0Var.f205342i != 0) {
                                ArrayList<C70593j0.C70599f.C70601b> arrayList4 = next3.f204222l;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    Iterator<C70593j0.C70599f.C70601b> it6 = next3.f204222l.iterator();
                                    while (it6.hasNext()) {
                                        C70593j0.C70599f.C70601b next4 = it6.next();
                                        if (next4.f204227a == l0Var.f205342i) {
                                            Context context3 = l0Var.f205337d;
                                            C70593j0.C70603h hVar4 = next4.f204228b;
                                            C75228t.m90261n0(context3, hVar4.f204231a, hVar4.f204232b, hVar4.f204233c, new C70924m0(l0Var, next3));
                                            z4 = true;
                                        }
                                    }
                                } else if (!z3) {
                                    String str4 = next3.f204219i.f204231a;
                                    if (!(str4 == null || str4.length() == 0)) {
                                        Context context4 = l0Var.f205337d;
                                        C70593j0.C70603h hVar5 = next3.f204219i;
                                        C75228t.m90261n0(context4, hVar5.f204231a, hVar5.f204232b, hVar5.f204233c, new C70926n0(l0Var, next3));
                                        z4 = true;
                                    }
                                }
                                l0Var.f205343j = true;
                            }
                        }
                        boolean z5 = !z3 && !z4;
                        if (next3.f204211a == l0Var.f205341h) {
                            l0Var.mo97579F4(next3, z5);
                        }
                    }
                }
                this.f204752h1 = l0Var.f205341h;
                l0Var.notifyDataSetChanged();
                this.f204750g1.setAdapter(l0Var);
                this.f204750g1.setLayoutManager(new LinearLayoutManager(getContext()));
                l0Var.f205339f = new C70875b1(this, l0Var);
                l0Var.f205340g = new C70878c1(this);
            }
        }
        mo97376J7(j0Var2.f204170D);
        C45056f1.m49908a(this, (ViewGroup) findViewById(C0966R.C0970id.iwq), findViewById(C0966R.C0970id.hr8), findViewById(C0966R.C0970id.im9), findViewById(C0966R.C0970id.imq), 72);
    }

    /* renamed from: Z7 */
    public final void mo97392Z7(boolean z, boolean z2, C70611s0 s0Var) {
        C70611s0 s0Var2 = s0Var;
        C78006vr vrVar = s0Var2.f204284r;
        this.f204709E.setVisibility(8);
        if (z) {
            this.f204762o.setVisibility(8);
            this.f204742c1.setVisibility(8);
            this.f204715K.setVisibility(0);
            this.f204744d1.setVisibility(0);
            C45056f1.m49908a(this, (ViewGroup) findViewById(C0966R.C0970id.iwq), findViewById(C0966R.C0970id.hr8), findViewById(C0966R.C0970id.im9), findViewById(C0966R.C0970id.imo), 72);
            this.f204716L.setVisibility(8);
        } else {
            this.f204762o.setVisibility(0);
            this.f204742c1.setVisibility(0);
            this.f204715K.setVisibility(8);
            this.f204744d1.setVisibility(8);
            View view = this.f204711G;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204767q.setVisibility(8);
            this.f204769r.setVisibility(8);
            View view3 = this.f204712H;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204764p.setVisibility(8);
            if (!Util.isNullOrNil(vrVar.f228337q)) {
                this.f204709E.setVisibility(0);
            }
        }
        View view5 = this.f204712H;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f204784y.setVisibility(8);
        View view7 = this.f204710F;
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        View view8 = view7;
        C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(view8, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateRemittanceInfo", "(ZZLcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo97393a8((C70593j0) null, s0Var2);
        ArrayList arrayList = new ArrayList();
        LinkedList<bl4> linkedList = s0Var2.f204284r.f228335o;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<bl4> it = s0Var2.f204284r.f228335o.iterator();
            while (it.hasNext()) {
                bl4 next = it.next();
                C70593j0.C70595b bVar = new C70593j0.C70595b();
                bVar.f204194a = next.f131189d;
                bVar.f204195b = next.f131190e;
                arrayList.add(bVar);
            }
        }
        mo97390X7(arrayList);
        ArrayList arrayList2 = new ArrayList();
        LinkedList<wf4> linkedList2 = s0Var2.f204284r.f228336p;
        if (linkedList2 != null && linkedList2.size() > 0) {
            Iterator<wf4> it4 = s0Var2.f204284r.f228336p.iterator();
            while (it4.hasNext()) {
                wf4 next2 = it4.next();
                C70593j0.C70602g gVar = new C70593j0.C70602g();
                gVar.f204229a = next2.f186089d;
                cl4 cl4 = next2.f186090e;
                C70593j0.C70597d dVar = new C70593j0.C70597d();
                dVar.f204203a = cl4.f182526d;
                dVar.f204204b = cl4.f182527e;
                dVar.f204205c = cl4.f182528f;
                dVar.f204206d = cl4.f182529g;
                gVar.f204230b = dVar;
                arrayList2.add(gVar);
            }
        }
        mo97376J7(arrayList2);
        C45056f1.m49908a(this, (ViewGroup) findViewById(C0966R.C0970id.iwq), findViewById(C0966R.C0970id.hr8), findViewById(C0966R.C0970id.im9), findViewById(C0966R.C0970id.imq), 72);
    }

    /* renamed from: a8 */
    public final void mo97393a8(C70593j0 j0Var, C70611s0 s0Var) {
        C70593j0 j0Var2 = j0Var;
        C70611s0 s0Var2 = s0Var;
        C70593j0.C70602g gVar = j0Var2 != null ? j0Var2.f204188x : null;
        if (gVar != null && !Util.isNullOrNil(gVar.f204229a)) {
            if (!this.f204753i.isShown() || Util.isNullOrNil(this.f204753i.getText())) {
                this.f204755j.setVisibility(8);
                View view = this.f204760n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateTextInfoLayout", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;Lcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateTextInfoLayout", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;Lcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((RelativeLayout.LayoutParams) this.f204753i.getLayoutParams()).addRule(13);
                TextView textView = this.f204753i;
                String str = gVar.f204229a;
                C75228t.m90253j0(textView, str, 0, str.length(), new C7092q((C7092q.C7093a) new C70749m(j0Var2, gVar, s0Var2), false), this);
                return;
            }
            this.f204755j.setVisibility(0);
            View view3 = this.f204760n;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateTextInfoLayout", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;Lcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI", "updateTextInfoLayout", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneTenpayRemittanceQuery;Lcom/tencent/mm/plugin/remittance/model/NetSceneUnionTransferQuery;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((RelativeLayout.LayoutParams) this.f204753i.getLayoutParams()).removeRule(13);
            TextView textView2 = this.f204755j;
            String str2 = gVar.f204229a;
            C75228t.m90255k0(textView2, str2, 0, str2.length(), new C7092q((C7092q.C7093a) new C70748l(j0Var2, gVar, s0Var2), false), this, false);
        }
    }

    public void finish() {
        Bundle bundle = new Bundle();
        bundle.putString("realname_verify_process_jump_plugin", "remittance");
        bundle.putString("realname_verify_process_jump_activity", ".ui.RemittanceDetailUI");
        if (this.f204739Z0) {
            C57178n0 n0Var = this.f204725S0;
            if (n0Var != null) {
                if (C67008a.m79170e(this, 0, n0Var.mo80778r1(), bundle, false, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 1008, 1)) {
                    this.f204725S0 = null;
                    return;
                }
            }
            super.finish();
            return;
        }
        C70585g0 g0Var = this.f204723R0;
        if (g0Var == null || !C67008a.m79171f(this, g0Var, bundle, true, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 1008, 1)) {
            super.finish();
        } else {
            this.f204723R0 = null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brj;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setNavigationbarColor(getResources().getColor(C0966R.color.al6));
        this.f204743d = (ImageView) findViewById(C0966R.C0970id.imd);
        this.f204745e = (TextView) findViewById(C0966R.C0970id.imp);
        this.f204747f = (TextView) findViewById(C0966R.C0970id.imi);
        this.f204753i = (TextView) findViewById(C0966R.C0970id.imj);
        this.f204755j = (TextView) findViewById(C0966R.C0970id.imk);
        this.f204760n = findViewById(C0966R.C0970id.c2f);
        this.f204762o = (LinearLayout) findViewById(C0966R.C0970id.ima);
        this.f204764p = (LinearLayout) findViewById(C0966R.C0970id.imz);
        this.f204767q = (LinearLayout) findViewById(C0966R.C0970id.f359067im3);
        this.f204769r = (LinearLayout) findViewById(C0966R.C0970id.il_);
        this.f204771s = (LinearLayout) findViewById(C0966R.C0970id.ilb);
        this.f204773t = (TextView) findViewById(C0966R.C0970id.im8);
        this.f204775u = (TextView) findViewById(C0966R.C0970id.im5);
        this.f204777v = (TextView) findViewById(C0966R.C0970id.h_c);
        this.f204779w = (TextView) findViewById(C0966R.C0970id.f5618jz);
        this.f204781x = (TextView) findViewById(C0966R.C0970id.f5617jy);
        this.f204784y = (ViewGroup) findViewById(C0966R.C0970id.ina);
        this.f204787z = (ImageView) findViewById(C0966R.C0970id.inc);
        this.f204705A = (TextView) findViewById(C0966R.C0970id.ine);
        this.f204706B = (TextView) findViewById(C0966R.C0970id.inf);
        this.f204707C = (ImageView) findViewById(C0966R.C0970id.in_);
        this.f204708D = (Button) findViewById(C0966R.C0970id.hfe);
        this.f204709E = (TextView) findViewById(C0966R.C0970id.f359064im0);
        TextView textView = (TextView) findViewById(C0966R.C0970id.imk);
        this.f204710F = findViewById(C0966R.C0970id.ind);
        this.f204711G = findViewById(C0966R.C0970id.f359068in0);
        this.f204712H = findViewById(C0966R.C0970id.f359069in1);
        this.f204713I = (Button) findViewById(C0966R.C0970id.im_);
        this.f204714J = (TextView) findViewById(C0966R.C0970id.iml);
        this.f204715K = (LinearLayout) findViewById(C0966R.C0970id.imm);
        this.f204716L = (LinearLayout) findViewById(C0966R.C0970id.f359070in2);
        this.f204717M = (LinearLayout) findViewById(C0966R.C0970id.im6);
        this.f204718N = (LinearLayout) findViewById(C0966R.C0970id.ild);
        this.f204719P = (LinearLayout) findViewById(C0966R.C0970id.ilc);
        this.f204720Q = (TextView) findViewById(C0966R.C0970id.im7);
        this.f204722R = (TextView) findViewById(C0966R.C0970id.im4);
        this.f204724S = (TextView) findViewById(C0966R.C0970id.h_b);
        this.f204726T = (TextView) findViewById(C0966R.C0970id.f5615jw);
        this.f204728U = (TextView) findViewById(C0966R.C0970id.f5616jx);
        this.f204749g = (TextView) findViewById(C0966R.C0970id.imr);
        this.f204751h = (TextView) findViewById(C0966R.C0970id.ims);
        this.f204740a1 = (LinearLayout) findViewById(C0966R.C0970id.ime);
        this.f204741b1 = (LinearLayout) findViewById(C0966R.C0970id.imb);
        this.f204742c1 = (RelativeLayout) findViewById(C0966R.C0970id.imn);
        this.f204744d1 = (LinearLayout) findViewById(C0966R.C0970id.imo);
        this.f204746e1 = (LinearLayout) findViewById(C0966R.C0970id.nyk);
        this.f204748f1 = (TextView) findViewById(C0966R.C0970id.nym);
        this.f204750g1 = (RecyclerView) findViewById(C0966R.C0970id.nyl);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f204730V = wcPayBannerView;
        wcPayBannerView.mo105020a();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.RemittanceDetailUI", "onActivityResult %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        super.onActivityResult(i, i2, intent);
        if (i == 2) {
            mo97380N7(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f204756j1 = new C72506r(this);
        addSceneEndListener(2838);
        addSceneEndListener(2717);
        setBackBtn(new C70735f0());
        this.f204732W = getIntent().getIntExtra("invalid_time", 0);
        getIntent().getIntExtra("appmsg_type", 0);
        this.f204734X = getIntent().getStringExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID);
        getIntent().getStringExtra("bill_id");
        this.f204738Z = getIntent().getStringExtra("transfer_id");
        this.f204736Y = getIntent().getStringExtra("sender_name");
        this.f204782x0 = getIntent().getIntExtra("effective_date", 3);
        this.f204721Q0 = getIntent().getIntExtra("total_fee", 0);
        this.f204733W0 = getIntent().getLongExtra("key_msg_id", 0);
        this.f204735X0 = getIntent().getStringExtra("payer_name");
        this.f204737Y0 = getIntent().getStringExtra("receiver_name");
        if (C72996z1.m85820U5(this.f204736Y)) {
            this.f204731V0 = this.f204736Y;
        } else if (Util.isNullOrNil(this.f204735X0)) {
            this.f204735X0 = this.f204736Y;
        }
        this.f204739Z0 = C72996z1.m85843n5(this.f204735X0) || C72996z1.m85843n5(this.f204737Y0);
        initView();
        mo97380N7(0);
        getIntent();
        this.f204761n1.alive();
        this.f204763o1.alive();
        this.f204766p1.alive();
        this.f204768q1.alive();
        this.f204770r1.alive();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f204743d.getLayoutParams();
        layoutParams.width = C76577a.m92151b(MMApplicationContext.getContext(), 64);
        layoutParams.height = C76577a.m92151b(MMApplicationContext.getContext(), 64);
        this.f204743d.setLayoutParams(layoutParams);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        contextMenu.add(0, 0, 0, getString(C0966R.string.f7936wt));
    }

    public void onDestroy() {
        this.f204761n1.dead();
        this.f204763o1.dead();
        IListener<RemittanceDetailUIFinishEvent> iListener = this.f204766p1;
        if (iListener != null) {
            iListener.dead();
        }
        this.f204768q1.dead();
        IListener<RemittanceAccountDetailEvent> iListener2 = this.f204770r1;
        if (iListener2 != null) {
            iListener2.dead();
        }
        super.onDestroy();
        removeSceneEndListener(2838);
        removeSceneEndListener(2717);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        if (this.f204739Z0) {
            C57178n0 n0Var = this.f204725S0;
            if (n0Var == null) {
                return super.onKeyUp(i, keyEvent);
            }
            C49995ji2 ji22 = n0Var.f163879r.f184891i;
            if (ji22 == null) {
                return super.onKeyUp(i, keyEvent);
            }
            if (!C72506r.m84839e(ji22)) {
                return super.onKeyUp(i, keyEvent);
            }
            this.f204756j1.mo99913c(this.f204725S0.f163879r.f184891i, new C70731d0());
            this.f204725S0.f163879r.f184891i = null;
            return true;
        }
        C70585g0 g0Var = this.f204723R0;
        if (g0Var == null) {
            return super.onKeyUp(i, keyEvent);
        }
        C72501h hVar = g0Var.f204062f;
        if (hVar == null) {
            return super.onKeyUp(i, keyEvent);
        }
        if (!C72506r.m84838d(hVar)) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f204756j1.mo99912b(this.f204723R0.f204062f, new C70733e0());
        this.f204723R0.f204062f = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x084e  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0ad4  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0ad6  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0b2e  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0b36  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0b42  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSceneEnd(int r23, int r24, java.lang.String r25, ob0.C117747y r26) {
        /*
            r22 = this;
            r10 = r22
            r0 = r24
            r3 = r25
            r4 = r26
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.remittance.model.C70593j0
            r8 = 3
            r9 = 2004(0x7d4, float:2.808E-42)
            r11 = 2003(0x7d3, float:2.807E-42)
            r14 = 2
            r15 = 1
            r7 = 2002(0x7d2, float:2.805E-42)
            java.lang.String r12 = "1"
            r13 = 2001(0x7d1, float:2.804E-42)
            r2 = 2000(0x7d0, float:2.803E-42)
            r6 = 4
            java.lang.String r5 = "0"
            if (r1 == 0) goto L_0x00b6
            r1 = r4
            com.tencent.mm.plugin.remittance.model.j0 r1 = (com.tencent.p014mm.plugin.remittance.model.C70593j0) r1
            if (r23 != 0) goto L_0x00b3
            if (r0 != 0) goto L_0x00b3
            oi2.f r0 = oi2.C77010f.vx0()
            vi2.d r0 = r0.yx0()
            java.lang.String r3 = r10.f204738Z
            vi2.c r0 = r0.mo108368Lo(r3)
            if (r0 == 0) goto L_0x006d
            r0.field_hasClicked = r15
            int r3 = r1.f204175h
            if (r3 != r2) goto L_0x003c
            goto L_0x0058
        L_0x003c:
            if (r3 != r13) goto L_0x0041
            r0.field_receiveStatus = r8
            goto L_0x0058
        L_0x0041:
            if (r3 != r7) goto L_0x0046
            r0.field_receiveStatus = r6
            goto L_0x0058
        L_0x0046:
            if (r3 != r11) goto L_0x004b
            r0.field_receiveStatus = r14
            goto L_0x0058
        L_0x004b:
            if (r3 != r9) goto L_0x0051
            r2 = 5
            r0.field_receiveStatus = r2
            goto L_0x0058
        L_0x0051:
            r2 = 2005(0x7d5, float:2.81E-42)
            if (r3 != r2) goto L_0x0058
            r2 = 6
            r0.field_receiveStatus = r2
        L_0x0058:
            oi2.f r2 = oi2.C77010f.vx0()
            vi2.d r2 = r2.yx0()
            r2.replace(r0)
            oi2.f r2 = oi2.C77010f.vx0()
            java.lang.String r3 = r0.field_talker
            r4 = 0
            r2.Bx0(r3, r4, r0)
        L_0x006d:
            r10.mo97386T7(r1)
            int r0 = r1.f204181q
            if (r0 != r15) goto L_0x00b2
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 327729(0x50031, float:4.59246E-40)
            java.lang.Object r0 = r0.mo119684e(r1, r5)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00b2
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            int r1 = com.tencent.p014mm.wallet_core.model.C45121z0.m49963c()
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$r r2 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$r
            r2.<init>(r10)
            r3 = 2131839633(0x7f114a91, float:1.9312523E38)
            nj3.C76879j.m92742m(r0, r1, r3, r2)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 327729(0x50031, float:4.59246E-40)
            r0.mo119676J(r1, r12)
        L_0x00b2:
            return r15
        L_0x00b3:
            r1 = 1
            goto L_0x0d4f
        L_0x00b6:
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.remittance.model.C70611s0
            r20 = r5
            java.lang.String r5 = "MicroMsg.RemittanceDetailUI"
            if (r1 == 0) goto L_0x0b92
            com.tencent.mm.plugin.remittance.model.s0 r4 = (com.tencent.p014mm.plugin.remittance.model.C70611s0) r4
            te3.vr r1 = r4.f204284r
            if (r23 != 0) goto L_0x0b8d
            if (r0 != 0) goto L_0x0b8d
            int r0 = r1.f228327d
            if (r0 != 0) goto L_0x0b86
            oi2.f r0 = oi2.C77010f.vx0()
            vi2.d r0 = r0.yx0()
            java.lang.String r3 = r10.f204738Z
            vi2.c r0 = r0.mo108368Lo(r3)
            if (r0 == 0) goto L_0x0112
            r0.field_hasClicked = r15
            int r1 = r1.f228329f
            if (r1 != r2) goto L_0x00e1
            goto L_0x00fd
        L_0x00e1:
            if (r1 != r13) goto L_0x00e6
            r0.field_receiveStatus = r8
            goto L_0x00fd
        L_0x00e6:
            if (r1 != r7) goto L_0x00eb
            r0.field_receiveStatus = r6
            goto L_0x00fd
        L_0x00eb:
            if (r1 != r11) goto L_0x00f0
            r0.field_receiveStatus = r14
            goto L_0x00fd
        L_0x00f0:
            if (r1 != r9) goto L_0x00f6
            r2 = 5
            r0.field_receiveStatus = r2
            goto L_0x00fd
        L_0x00f6:
            r2 = 2005(0x7d5, float:2.81E-42)
            if (r1 != r2) goto L_0x00fd
            r1 = 6
            r0.field_receiveStatus = r1
        L_0x00fd:
            oi2.f r1 = oi2.C77010f.vx0()
            vi2.d r1 = r1.yx0()
            r1.replace(r0)
            oi2.f r1 = oi2.C77010f.vx0()
            java.lang.String r2 = r0.field_talker
            r3 = 0
            r1.Bx0(r2, r3, r0)
        L_0x0112:
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            java.lang.String r7 = ""
            te3.vr r1 = r4.f204284r
            java.lang.String r2 = r1.f228338r
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0133
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r3 = r1.f228338r
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x012f
            r10.f204785y0 = r15
            goto L_0x014d
        L_0x012f:
            r2 = 0
            r10.f204785y0 = r2
            goto L_0x014d
        L_0x0133:
            r2 = 0
            java.lang.String r3 = r10.f204735X0
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x014d
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r9 = r10.f204735X0
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x014b
            r10.f204785y0 = r15
            goto L_0x014d
        L_0x014b:
            r10.f204785y0 = r2
        L_0x014d:
            java.lang.String r2 = r10.f204731V0
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0189
            java.lang.String r2 = r10.f204735X0
            r10.f204727T0 = r2
            java.lang.String r2 = r10.f204737Y0
            r10.f204729U0 = r2
            java.lang.String r2 = r1.f228338r
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0169
            java.lang.String r2 = r1.f228338r
            r10.f204727T0 = r2
        L_0x0169:
            java.lang.String r2 = r1.f228339s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0175
            java.lang.String r2 = r1.f228339s
            r10.f204729U0 = r2
        L_0x0175:
            boolean r2 = r10.f204785y0
            if (r2 == 0) goto L_0x017a
            goto L_0x0197
        L_0x017a:
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r3 = r10.f204729U0
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0187
            goto L_0x01a3
        L_0x0187:
            r9 = 3
            goto L_0x01a4
        L_0x0189:
            boolean r2 = r10.f204785y0
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r10.f204727T0 = r2
            java.lang.String r2 = r10.f204736Y
            r10.f204729U0 = r2
        L_0x0197:
            r9 = 1
            goto L_0x01a4
        L_0x0199:
            java.lang.String r2 = r10.f204736Y
            r10.f204727T0 = r2
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r10.f204729U0 = r2
        L_0x01a3:
            r9 = 2
        L_0x01a4:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.String r3 = r10.f204731V0
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = r1.f228338r
            r2[r15] = r3
            java.lang.String r3 = r1.f228339s
            r2[r14] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2[r8] = r3
            java.lang.String r3 = "refreshUIAfterQuery groupname:%s payer:%s receiver:%s role:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r2)
            android.widget.TextView r2 = r10.f204747f
            r8 = r12
            long r11 = r1.f228330g
            double r11 = (double) r11
            r17 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r11 = r11 / r17
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r11)
            r2.setText(r3)
            android.widget.TextView r2 = r10.f204747f
            r3 = 1111490560(0x42400000, float:48.0)
            r2.setTextSize(r15, r3)
            java.lang.String r2 = r1.f228331h
            java.lang.String r11 = r10.mo97383Q7(r2)
            java.lang.String r12 = r1.f228332i
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r2 = r10.f204734X
            java.lang.String r3 = "transaction_id"
            r6.putString(r3, r2)
            java.lang.String r2 = r10.f204729U0
            java.lang.String r3 = "receiver_name"
            r6.putString(r3, r2)
            java.lang.String r2 = r10.f204738Z
            java.lang.String r3 = "transfer_id"
            r6.putString(r3, r2)
            int r2 = r10.f204721Q0
            java.lang.String r3 = "total_fee"
            r6.putInt(r3, r2)
            java.lang.String r2 = r10.f204736Y
            java.lang.String r3 = "sender_name"
            r6.putString(r3, r2)
            int r2 = r10.f204732W
            java.lang.String r3 = "invalid_time"
            r6.putInt(r3, r2)
            com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo r2 = r4.mo97258r1()
            java.lang.String r3 = "resend_msg_info"
            r6.putParcelable(r3, r2)
            boolean r2 = r10.f204739Z0
            java.lang.String r3 = "is_open_im"
            r6.putInt(r3, r2)
            android.widget.TextView r2 = r10.f204753i
            r2.setClickable(r15)
            android.widget.TextView r2 = r10.f204745e
            r2.setClickable(r15)
            android.widget.TextView r2 = r10.f204714J
            r2.setClickable(r15)
            int r3 = r1.f228329f
            java.lang.Object[] r2 = new java.lang.Object[r15]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r2[r16] = r17
            java.lang.String r13 = "status: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r13, r2)
            java.lang.String r2 = r1.f228337q
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0285
            android.widget.TextView r13 = r10.f204709E
            di3.d r2 = di3.C86312j.m106911c(r0)
            ny.h r2 = (p629ny.C76979h) r2
            java.lang.String r1 = r1.f228337q
            android.widget.TextView r14 = r10.f204709E
            float r14 = r14.getTextSize()
            int r14 = (int) r14
            r18 = 1
            r19 = r1
            r1 = r2
            r2 = r22
            r15 = r3
            r3 = r19
            r19 = r8
            r8 = r4
            r4 = r14
            r14 = r5
            r21 = r20
            r5 = r18
            r18 = r6
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r1)
            android.widget.TextView r1 = r10.f204709E
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x028e
        L_0x0285:
            r15 = r3
            r14 = r5
            r18 = r6
            r19 = r8
            r21 = r20
            r8 = r4
        L_0x028e:
            r1 = 2131834717(0x7f11375d, float:1.9302552E38)
            r2 = 2131756178(0x7f100492, float:1.9143256E38)
            r3 = 2131099737(0x7f060059, float:1.7811836E38)
            r13 = 8
            switch(r15) {
                case 2000: goto L_0x084e;
                case 2001: goto L_0x0704;
                case 2002: goto L_0x05e6;
                case 2003: goto L_0x05e6;
                case 2004: goto L_0x03bf;
                case 2005: goto L_0x02a1;
                default: goto L_0x029c;
            }
        L_0x029c:
            r22.finish()
            goto L_0x0acc
        L_0x02a1:
            android.widget.ImageView r2 = r10.f204743d
            r3 = 2131756895(0x7f10075f, float:1.914471E38)
            r2.setImageResource(r3)
            r2 = 1
            if (r9 == r2) goto L_0x0321
            r2 = 2
            if (r9 != r2) goto L_0x02b1
            goto L_0x0321
        L_0x02b1:
            android.widget.ImageView r2 = r10.f204743d
            r2.setImageResource(r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x02e3
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r10.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x02e8
        L_0x02e3:
            android.widget.TextView r2 = r10.f204745e
            r2.setText(r1)
        L_0x02e8:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x03af
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r12
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x03af
        L_0x0321:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x0378
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x0378
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r14 = 1
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r12
            r5 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x03af
        L_0x0378:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x0384
            android.widget.TextView r0 = r10.f204745e
            r0.setText(r11)
            goto L_0x038c
        L_0x0384:
            android.widget.TextView r0 = r10.f204745e
            r1 = 2131834729(0x7f113769, float:1.9302577E38)
            r0.setText(r1)
        L_0x038c:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 != 0) goto L_0x0398
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r12)
            goto L_0x03af
        L_0x0398:
            r0 = 2
            if (r9 != r0) goto L_0x03a4
            android.widget.TextView r0 = r10.f204753i
            r1 = 2131834719(0x7f11375f, float:1.9302556E38)
            r0.setText(r1)
            goto L_0x03af
        L_0x03a4:
            r1 = 1
            if (r9 != r1) goto L_0x03af
            android.widget.TextView r0 = r10.f204753i
            r1 = 2131834740(0x7f113774, float:1.9302599E38)
            r0.setText(r1)
        L_0x03af:
            r1 = 0
            r10.mo97392Z7(r1, r1, r8)
            android.widget.TextView r0 = r10.f204749g
            r0.setVisibility(r13)
            android.widget.TextView r0 = r10.f204751h
            r0.setVisibility(r13)
            goto L_0x0acc
        L_0x03bf:
            r4 = 2
            if (r9 != r4) goto L_0x0467
            android.widget.ImageView r1 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r22.getContext()
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r3 = r5.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r2, r3)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x0439
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x0439
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r14 = 1
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r12
            r5 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x05d7
        L_0x0439:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x0445
            android.widget.TextView r0 = r10.f204745e
            r0.setText(r11)
            goto L_0x044d
        L_0x0445:
            android.widget.TextView r0 = r10.f204745e
            r1 = 2131834731(0x7f11376b, float:1.930258E38)
            r0.setText(r1)
        L_0x044d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 != 0) goto L_0x0460
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r12)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x05d7
        L_0x0460:
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r7)
            goto L_0x05d6
        L_0x0467:
            r4 = 1
            if (r9 != r4) goto L_0x054d
            android.widget.ImageView r1 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r22.getContext()
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r3 = r5.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r2, r3)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x04e1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x04e1
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r14 = 1
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r12
            r5 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x05d7
        L_0x04e1:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            r1 = 2131834733(0x7f11376d, float:1.9302585E38)
            if (r0 != 0) goto L_0x051f
            android.widget.TextView r0 = r10.f204745e     // Catch:{ Exception -> 0x0503 }
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0503 }
            java.lang.String r4 = r10.f204729U0     // Catch:{ Exception -> 0x0503 }
            android.text.SpannableString r4 = r10.mo97382P7(r4, r2)     // Catch:{ Exception -> 0x0503 }
            r2 = 0
            r3[r2] = r4     // Catch:{ Exception -> 0x0501 }
            java.lang.String r2 = java.lang.String.format(r11, r3)     // Catch:{ Exception -> 0x0503 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0503 }
            r2 = 0
            goto L_0x0534
        L_0x0501:
            r0 = move-exception
            goto L_0x0505
        L_0x0503:
            r0 = move-exception
            r2 = 0
        L_0x0505:
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r14, r0, r7, r3)
            android.widget.TextView r0 = r10.f204745e
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r10.f204729U0
            android.text.SpannableString r5 = r10.mo97382P7(r5, r3)
            r4[r2] = r5
            java.lang.String r1 = r10.getString(r1, r4)
            r0.setText(r1)
            goto L_0x0534
        L_0x051f:
            r2 = 0
            r3 = 1
            android.widget.TextView r0 = r10.f204745e
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r10.f204729U0
            android.text.SpannableString r5 = r10.mo97382P7(r5, r3)
            r4[r2] = r5
            java.lang.String r1 = r10.getString(r1, r4)
            r0.setText(r1)
        L_0x0534:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 != 0) goto L_0x0546
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r12)
            android.widget.TextView r0 = r10.f204753i
            r0.setVisibility(r2)
            goto L_0x05d6
        L_0x0546:
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r7)
            goto L_0x05d6
        L_0x054d:
            android.widget.ImageView r4 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r3 = r6.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r2, r3)
            r4.setImageDrawable(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x0593
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r10.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x0598
        L_0x0593:
            android.widget.TextView r2 = r10.f204745e
            r2.setText(r1)
        L_0x0598:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x05d6
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r12
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x05d7
        L_0x05d6:
            r1 = 0
        L_0x05d7:
            r10.mo97392Z7(r1, r1, r8)
            android.widget.TextView r0 = r10.f204749g
            r0.setVisibility(r13)
            android.widget.TextView r0 = r10.f204751h
            r0.setVisibility(r13)
            goto L_0x0acc
        L_0x05e6:
            r2 = 2003(0x7d3, float:2.807E-42)
            if (r15 != r2) goto L_0x060c
            r14 = 8
            android.widget.ImageView r2 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            r4 = 2131756021(0x7f1003f5, float:1.9142938E38)
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r5 = r5.getColor(r6)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r5)
            r2.setImageDrawable(r3)
            goto L_0x062d
        L_0x060c:
            r14 = 8
            android.widget.ImageView r2 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            r4 = 2131756135(0x7f100467, float:1.9143169E38)
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099941(0x7f060125, float:1.781225E38)
            int r5 = r5.getColor(r6)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r5)
            r2.setImageDrawable(r3)
        L_0x062d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x065a
            android.widget.TextView r13 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r1)
            android.widget.TextView r1 = r10.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x06aa
        L_0x065a:
            r2 = 2131834732(0x7f11376c, float:1.9302583E38)
            r3 = 1
            if (r9 != r3) goto L_0x069c
            r4 = 2003(0x7d3, float:2.807E-42)
            if (r15 != r4) goto L_0x066d
            android.widget.TextView r1 = r10.f204745e
            r2 = 2131834734(0x7f11376e, float:1.9302587E38)
            r1.setText(r2)
            goto L_0x06aa
        L_0x066d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r10.f204729U0
            android.text.SpannableString r4 = r10.mo97382P7(r4, r3)
            r1.append(r4)
            java.lang.String r2 = r10.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.widget.TextView r2 = r10.f204745e
            di3.d r3 = di3.C86312j.m106911c(r0)
            ny.h r3 = (p629ny.C76979h) r3
            android.widget.TextView r4 = r10.f204745e
            float r4 = r4.getTextSize()
            android.text.SpannableString r1 = r3.yp0(r10, r1, r4)
            r2.setText(r1)
            goto L_0x06aa
        L_0x069c:
            r3 = 2
            if (r9 != r3) goto L_0x06a5
            android.widget.TextView r1 = r10.f204745e
            r1.setText(r2)
            goto L_0x06aa
        L_0x06a5:
            android.widget.TextView r2 = r10.f204745e
            r2.setText(r1)
        L_0x06aa:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x06de
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r12
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
            goto L_0x06f5
        L_0x06de:
            r1 = 0
            r2 = 1
            if (r9 != r2) goto L_0x06f0
            android.widget.TextView r0 = r10.f204753i
            r2 = 2131834725(0x7f113765, float:1.9302568E38)
            r0.setText(r2)
            android.widget.TextView r0 = r10.f204753i
            r0.setVisibility(r1)
            goto L_0x06f5
        L_0x06f0:
            android.widget.TextView r0 = r10.f204753i
            r0.setVisibility(r14)
        L_0x06f5:
            r10.mo97392Z7(r1, r1, r8)
            android.widget.TextView r0 = r10.f204749g
            r0.setVisibility(r14)
            android.widget.TextView r0 = r10.f204751h
            r0.setVisibility(r14)
            goto L_0x0acc
        L_0x0704:
            r14 = 8
            android.widget.ImageView r2 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            r4 = 2131756011(0x7f1003eb, float:1.9142917E38)
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099756(0x7f06006c, float:1.7811874E38)
            int r5 = r5.getColor(r6)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r4, r5)
            r2.setImageDrawable(r3)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x0787
            android.widget.TextView r13 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r13.setText(r1)
            android.widget.TextView r1 = r10.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x0784
            android.widget.TextView r11 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r12
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r11.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            r1 = 0
            r0.setVisibility(r1)
        L_0x0784:
            r0 = 2
            goto L_0x0835
        L_0x0787:
            r2 = 2131834730(0x7f11376a, float:1.9302579E38)
            r3 = 2
            if (r9 != r3) goto L_0x07c8
            android.widget.TextView r0 = r10.f204745e
            r0.setText(r2)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r1 = 2131834709(0x7f113755, float:1.9302536E38)
            java.lang.String r1 = r10.getString(r1)
            r0.<init>(r1)
            td2.a r1 = new td2.a
            r1.<init>(r10)
            com.tencent.mm.plugin.remittance.ui.r0 r2 = new com.tencent.mm.plugin.remittance.ui.r0
            r2.<init>(r10)
            r1.f226941e = r2
            int r2 = r0.length()
            r3 = 18
            r4 = 0
            r0.setSpan(r1, r4, r2, r3)
            android.widget.TextView r1 = r10.f204753i
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            android.widget.TextView r1 = r10.f204753i
            r1.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            r0.setVisibility(r4)
            goto L_0x0784
        L_0x07c8:
            r3 = 1
            if (r9 != r3) goto L_0x07ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r10.f204729U0
            android.text.SpannableString r4 = r10.mo97382P7(r4, r3)
            r1.append(r4)
            java.lang.String r2 = r10.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.widget.TextView r2 = r10.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.widget.TextView r3 = r10.f204745e
            float r3 = r3.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r10, r1, r3)
            r2.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            r0.setVisibility(r14)
            goto L_0x0784
        L_0x07ff:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x082e
            android.widget.TextView r12 = r10.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204745e
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r12.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x0784
        L_0x082e:
            android.widget.TextView r0 = r10.f204745e
            r0.setText(r1)
            goto L_0x0784
        L_0x0835:
            if (r9 != r0) goto L_0x083d
            r1 = 0
            r4 = 1
            r10.mo97392Z7(r1, r4, r8)
            goto L_0x0842
        L_0x083d:
            r1 = 0
            r4 = 1
            r10.mo97392Z7(r1, r1, r8)
        L_0x0842:
            android.widget.TextView r0 = r10.f204749g
            r0.setVisibility(r14)
            android.widget.TextView r0 = r10.f204751h
            r0.setVisibility(r14)
            goto L_0x0acc
        L_0x084e:
            r4 = 1
            r5 = 33
            if (r9 != r4) goto L_0x0949
            android.widget.ImageView r1 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r4 = r22.getContext()
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r3 = r6.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r2, r3)
            r1.setImageDrawable(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x08c4
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x08c4
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r14 = 1
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r12
            r5 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x0943
        L_0x08c4:
            r1 = 2131834736(0x7f113770, float:1.930259E38)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r10.f204729U0
            android.text.SpannableString r4 = r10.mo97382P7(r4, r2)
            r6 = 0
            r3[r6] = r4
            java.lang.String r1 = r10.getString(r1, r3)
            android.widget.TextView r3 = r10.f204745e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            android.widget.TextView r4 = r10.f204745e
            float r4 = r4.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r10, r1, r4)
            r3.setText(r0)
            r0 = 2131834742(0x7f113776, float:1.9302603E38)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r2 = r10.f204782x0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r0 = r10.getString(r0, r1)
            r1 = 2131834786(0x7f1137a2, float:1.9302692E38)
            java.lang.String r1 = r10.getString(r1)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            td2.a r3 = new td2.a
            r3.<init>(r10)
            com.tencent.mm.plugin.remittance.ui.o0 r4 = new com.tencent.mm.plugin.remittance.ui.o0
            r4.<init>(r10, r8)
            r3.f226941e = r4
            int r4 = r0.length()
            int r0 = r0.length()
            int r1 = r1.length()
            int r0 = r0 + r1
            r2.setSpan(r3, r4, r0, r5)
            android.widget.TextView r0 = r10.f204753i
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r10.f204753i
            r0.setText(r2)
        L_0x0943:
            r1 = 0
            r10.mo97392Z7(r1, r1, r8)
            goto L_0x0ac2
        L_0x0949:
            r4 = 2
            if (r9 != r4) goto L_0x0a3c
            java.lang.String r1 = "set click reveive btn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            android.widget.ImageView r1 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r2 = r22.getContext()
            r4 = 2131756466(0x7f1005b2, float:1.914384E38)
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r3 = r6.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r2, r4, r3)
            r1.setImageDrawable(r2)
            android.widget.Button r1 = r10.f204713I
            r2 = 0
            r1.setVisibility(r2)
            android.widget.Button r1 = r10.f204713I
            com.tencent.mm.plugin.remittance.ui.p0 r2 = new com.tencent.mm.plugin.remittance.ui.p0
            r2.<init>(r10)
            r1.setOnClickListener(r2)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x09d5
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x09d5
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r14 = 1
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r9 = r10.f204714J
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204714J
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r3 = r12
            r5 = r14
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204745e
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204714J
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            goto L_0x0a35
        L_0x09d5:
            android.widget.TextView r0 = r10.f204745e
            r1 = 2131834735(0x7f11376f, float:1.9302589E38)
            r0.setText(r1)
            r0 = 2131834738(0x7f113772, float:1.9302595E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r1 = r10.f204782x0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r2[r3] = r1
            java.lang.String r0 = r10.getString(r0, r2)
            r1 = 2131834727(0x7f113767, float:1.9302572E38)
            java.lang.String r1 = r10.getString(r1)
            android.text.SpannableString r2 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            td2.a r3 = new td2.a
            r3.<init>(r10)
            com.tencent.mm.plugin.remittance.ui.q0 r4 = new com.tencent.mm.plugin.remittance.ui.q0
            r4.<init>(r10)
            r3.f226941e = r4
            int r4 = r0.length()
            int r0 = r0.length()
            int r1 = r1.length()
            int r0 = r0 + r1
            r2.setSpan(r3, r4, r0, r5)
            android.widget.TextView r0 = r10.f204714J
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            android.widget.TextView r0 = r10.f204714J
            r0.setText(r2)
        L_0x0a35:
            r1 = 1
            r2 = 0
            r10.mo97392Z7(r1, r2, r8)
            goto L_0x0ac2
        L_0x0a3c:
            android.widget.ImageView r4 = r10.f204743d
            androidx.appcompat.app.AppCompatActivity r5 = r22.getContext()
            androidx.appcompat.app.AppCompatActivity r6 = r22.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r3 = r6.getColor(r3)
            android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r2, r3)
            r4.setImageDrawable(r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r2 != 0) goto L_0x0a82
            android.widget.TextView r9 = r10.f204745e
            di3.d r1 = di3.C86312j.m106911c(r0)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r2 = r10.f204745e
            float r2 = r2.getTextSize()
            int r4 = (int) r2
            r5 = 1
            r2 = r22
            r3 = r11
            r6 = r18
            android.text.SpannableString r1 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r1)
            android.widget.TextView r1 = r10.f204745e
            de3.a0 r2 = new de3.a0
            r2.<init>()
            r1.setOnTouchListener(r2)
            goto L_0x0a87
        L_0x0a82:
            android.widget.TextView r2 = r10.f204745e
            r2.setText(r1)
        L_0x0a87:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r1 != 0) goto L_0x0abe
            android.widget.TextView r9 = r10.f204753i
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r10.f204753i
            float r0 = r0.getTextSize()
            int r4 = (int) r0
            r5 = 1
            r2 = r22
            r3 = r12
            r6 = r18
            android.text.SpannableString r0 = r1.mo107051Lq(r2, r3, r4, r5, r6)
            r9.setText(r0)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
            android.widget.TextView r0 = r10.f204753i
            de3.a0 r1 = new de3.a0
            r1.<init>()
            r0.setOnTouchListener(r1)
        L_0x0abe:
            r1 = 0
            r10.mo97392Z7(r1, r1, r8)
        L_0x0ac2:
            android.widget.TextView r0 = r10.f204749g
            r0.setVisibility(r13)
            android.widget.TextView r0 = r10.f204751h
            r0.setVisibility(r13)
        L_0x0acc:
            com.tencent.mm.wallet_core.ui.WcPayBannerView r0 = r10.f204730V
            te3.vr r1 = r8.f204284r
            te3.lr r1 = r1.f228333j
            if (r1 != 0) goto L_0x0ad6
            r4 = 0
            goto L_0x0af3
        L_0x0ad6:
            te3.g43 r4 = new te3.g43
            r4.<init>()
            te3.vr r1 = r8.f204284r
            te3.lr r1 = r1.f228333j
            int r2 = r1.f137601d
            r4.f227431d = r2
            java.lang.String r2 = r1.f137602e
            r4.f227432e = r2
            java.lang.String r2 = r1.f137603f
            r4.f227433f = r2
            java.lang.String r2 = r1.f137604g
            r4.f227434g = r2
            java.lang.String r1 = r1.f137605h
            r4.f227435h = r1
        L_0x0af3:
            r0.setBannerData(r4)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_STRING
            java.lang.Object r0 = r0.mo119685f(r1, r7)
            java.lang.String r0 = (java.lang.String) r0
            r10.f204765p0 = r0
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_DELAY_TRANSFER_DESC_URL_FLAG_INT
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            java.lang.String r0 = r10.f204765p0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0b36
            cr3.i r0 = r10.mNetSceneMgr
            r1 = 0
            r2 = 1
            v53.C78348k0.m94629j1(r2, r0, r1)
            goto L_0x0b3e
        L_0x0b36:
            r1 = 0
            r2 = 1
            cr3.i r0 = r10.mNetSceneMgr
            r3 = 0
            v53.C78348k0.m94629j1(r3, r0, r1)
        L_0x0b3e:
            int r0 = r8.f204285s
            if (r0 != r2) goto L_0x0b84
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = r21
            r1 = 327729(0x50031, float:4.59246E-40)
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0b84
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            int r1 = com.tencent.p014mm.wallet_core.model.C45121z0.m49963c()
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$s r2 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$s
            r2.<init>(r10)
            r3 = 2131839633(0x7f114a91, float:1.9312523E38)
            nj3.C76879j.m92742m(r0, r1, r3, r2)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r2 = r19
            r1 = 327729(0x50031, float:4.59246E-40)
            r0.mo119676J(r1, r2)
        L_0x0b84:
            r1 = 1
            goto L_0x0b91
        L_0x0b86:
            java.lang.String r0 = r1.f228328e
            r1 = 1
            r10.mo97387U7(r10, r0, r1)
            goto L_0x0b91
        L_0x0b8d:
            r1 = 1
            r10.mo97387U7(r10, r3, r1)
        L_0x0b91:
            return r1
        L_0x0b92:
            r14 = r5
            r1 = 0
            boolean r2 = r4 instanceof com.tencent.p014mm.plugin.remittance.model.C70585g0
            java.lang.String r5 = ".ui.RemittanceDetailUI"
            java.lang.String r6 = "realname_verify_process_jump_activity"
            java.lang.String r7 = "remittance"
            java.lang.String r8 = "realname_verify_process_jump_plugin"
            r9 = 416(0x1a0, float:5.83E-43)
            if (r2 == 0) goto L_0x0c89
            if (r23 != 0) goto L_0x0c61
            if (r0 != 0) goto L_0x0c61
            r0 = r4
            com.tencent.mm.plugin.remittance.model.g0 r0 = (com.tencent.p014mm.plugin.remittance.model.C70585g0) r0
            r10.f204723R0 = r0
            boolean r0 = r0.isJumpRemind()
            if (r0 == 0) goto L_0x0bc4
            com.tencent.mm.plugin.remittance.model.g0 r0 = r10.f204723R0
            com.tencent.mm.wallet_core.model.JumpRemind r0 = r0.getJumpRemind()
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$t r1 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$t
            r1.<init>()
            r0.mo104782f(r10, r1)
            r1 = 1
            return r1
        L_0x0bc4:
            com.tencent.mm.plugin.remittance.model.g0 r0 = r10.f204723R0
            com.tencent.mm.plugin.wallet_core.utils.h r0 = r0.f204061e
            boolean r0 = com.tencent.p014mm.plugin.wallet_core.utils.C72506r.m84838d(r0)
            if (r0 == 0) goto L_0x0be1
            com.tencent.mm.plugin.wallet_core.utils.r r0 = new com.tencent.mm.plugin.wallet_core.utils.r
            r0.<init>(r10)
            com.tencent.mm.plugin.remittance.model.g0 r1 = r10.f204723R0
            com.tencent.mm.plugin.wallet_core.utils.h r1 = r1.f204061e
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$u r2 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$u
            r2.<init>()
            r0.mo99912b(r1, r2)
            goto L_0x0c86
        L_0x0be1:
            com.tencent.mm.plugin.remittance.model.g0 r0 = r10.f204723R0
            java.lang.String r0 = r0.f204064h
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0c51
            long r2 = r10.f204757k1
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0bf9
            java.lang.String r0 = "last compliance usecase wast not stopped as expected!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
        L_0x0bf9:
            com.tencent.mm.plugin.remittance.model.g0 r0 = r10.f204723R0
            java.lang.String r2 = r0.f204063g
            java.lang.String r0 = r0.f204064h
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$v r3 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$v
            r3.<init>(r2)
            java.lang.String r2 = "base64Data"
            gy3.C87412m.m108594g(r0, r2)
            r2 = 0
            byte[] r0 = android.util.Base64.decode(r0, r2)
            java.lang.String r2 = "decode(base64Data, Base64.DEFAULT)"
            gy3.C87412m.m108593f(r0, r2)
            int r2 = r0.length
            if (r2 != 0) goto L_0x0c18
            r7 = 1
            goto L_0x0c19
        L_0x0c18:
            r7 = 0
        L_0x0c19:
            if (r7 == 0) goto L_0x0c1d
            r13 = r1
            goto L_0x0c48
        L_0x0c1d:
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.kinda.gen.ITransmitKvData r6 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.lang.String r7 = "half_page_view_data"
            r6.putBinary(r7, r0)
            java.lang.String r0 = "usecase_platform_session"
            r6.putLong(r0, r1)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            if (r0 == 0) goto L_0x0c44
            com.tencent.mm.plugin.wallet_core.utils.p r7 = new com.tencent.mm.plugin.wallet_core.utils.p
            r7.<init>(r3)
            java.lang.String r3 = "complianceHalfPage"
            r0.startUseCase(r3, r6, r7)
        L_0x0c44:
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
        L_0x0c48:
            if (r13 == 0) goto L_0x0c4e
            long r4 = r13.longValue()
        L_0x0c4e:
            r10.f204757k1 = r4
            goto L_0x0c86
        L_0x0c51:
            com.tencent.mm.plugin.remittance.model.g0 r0 = r10.f204723R0
            com.tencent.mm.plugin.remittance.model.g0$a r1 = r0.f204065i
            if (r1 == 0) goto L_0x0c5c
            r10.mo97388V7(r1)
            r1 = 1
            return r1
        L_0x0c5c:
            r1 = 1
            r10.mo97381O7(r0)
            return r1
        L_0x0c61:
            if (r0 != r9) goto L_0x0c82
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r9.putString(r8, r7)
            r9.putString(r6, r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 1008(0x3f0, float:1.413E-42)
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r9
            r9 = r11
            boolean r0 = a63.C67008a.m79169b(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0c82:
            r1 = 0
            r10.mo97387U7(r10, r3, r1)
        L_0x0c86:
            r1 = 1
            goto L_0x0d36
        L_0x0c89:
            boolean r1 = r4 instanceof com.tencent.p014mm.plugin.remittance.model.C57178n0
            if (r1 == 0) goto L_0x0d37
            if (r23 != 0) goto L_0x0d0e
            if (r0 != 0) goto L_0x0d0e
            r0 = r4
            com.tencent.mm.plugin.remittance.model.n0 r0 = (com.tencent.p014mm.plugin.remittance.model.C57178n0) r0
            r10.f204725S0 = r0
            te3.pr r0 = r0.f163879r
            int r1 = r0.f184886d
            if (r1 != 0) goto L_0x0ce2
            te3.ji2 r0 = r0.f184890h
            boolean r0 = com.tencent.p014mm.plugin.wallet_core.utils.C72506r.m84839e(r0)
            if (r0 == 0) goto L_0x0cb8
            com.tencent.mm.plugin.wallet_core.utils.r r0 = new com.tencent.mm.plugin.wallet_core.utils.r
            r0.<init>(r10)
            com.tencent.mm.plugin.remittance.model.n0 r1 = r10.f204725S0
            te3.pr r1 = r1.f163879r
            te3.ji2 r1 = r1.f184890h
            com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$w r2 = new com.tencent.mm.plugin.remittance.ui.RemittanceDetailUI$w
            r2.<init>()
            r0.mo99913c(r1, r2)
            goto L_0x0c86
        L_0x0cb8:
            com.tencent.mm.plugin.remittance.model.n0 r0 = r10.f204725S0
            int r0 = r0.f163880s
            r1 = 1
            if (r1 != r0) goto L_0x0cc3
            r10.mo97380N7(r1)
            goto L_0x0ce1
        L_0x0cc3:
            android.content.res.Resources r0 = r22.getResources()
            r1 = 2131834716(0x7f11375c, float:1.930255E38)
            java.lang.String r0 = r0.getString(r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "result_msg"
            r1.putExtra(r2, r0)
            r2 = 0
            r10.setResult(r2, r1)
            r22.finish()
            r1 = 1
        L_0x0ce1:
            return r1
        L_0x0ce2:
            if (r1 != r9) goto L_0x0d06
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putString(r8, r7)
            r4.putString(r6, r5)
            com.tencent.mm.plugin.remittance.model.n0 r0 = r10.f204725S0
            te3.pr r1 = r0.f163879r
            int r2 = r1.f184886d
            te3.dn3 r3 = r0.mo80778r1()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1008(0x3f0, float:1.413E-42)
            r9 = 2
            r1 = r22
            boolean r0 = a63.C67008a.m79170e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0d06:
            java.lang.String r0 = r0.f184887e
            r1 = 0
            r10.mo97387U7(r10, r0, r1)
            goto L_0x0c86
        L_0x0d0e:
            if (r0 != r9) goto L_0x0d30
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putString(r8, r7)
            r4.putString(r6, r5)
            com.tencent.mm.plugin.remittance.model.n0 r1 = r10.f204725S0
            te3.dn3 r3 = r1.mo80778r1()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1008(0x3f0, float:1.413E-42)
            r9 = 2
            r1 = r22
            r2 = r24
            boolean r0 = a63.C67008a.m79170e(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0d30:
            r1 = 0
            r10.mo97387U7(r10, r3, r1)
            goto L_0x0c86
        L_0x0d36:
            return r1
        L_0x0d37:
            boolean r1 = r4 instanceof v53.C78348k0
            if (r1 == 0) goto L_0x00b3
            if (r23 != 0) goto L_0x0d47
            if (r0 != 0) goto L_0x0d47
            r0 = r4
            v53.k0 r0 = (v53.C78348k0) r0
            java.lang.String r0 = r0.f229590i
            r10.f204765p0 = r0
            goto L_0x0d4d
        L_0x0d47:
            java.lang.String r0 = "net error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0d4d:
            r1 = 1
            return r1
        L_0x0d4f:
            boolean r0 = r4 instanceof z53.C79310i
            if (r0 == 0) goto L_0x0d54
            return r1
        L_0x0d54:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceDetailUI.onSceneEnd(int, int, java.lang.String, ob0.y):boolean");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5058t0.class);
    }
}
