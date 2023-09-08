package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.offline.p085ui.C70005g0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.FavourLayout;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import f40.C86709a0;
import gr3.C76024a;
import hi3.C87515a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONException;
import org.json.JSONObject;
import p196ln.C76705f;
import p281yz.C79173v;
import pv2.C77290d;
import qo3.C77390c0;
import vt1.C78473a;
import yq3.C79145c;
import yt3.C23319f;
import zi3.C79335b;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1 */
public class C72379f1 extends C77390c0 implements C72404n {

    /* renamed from: Q0 */
    public static HashMap<String, Boolean> f210536Q0 = new HashMap<>();

    /* renamed from: A */
    public TextView f210537A;

    /* renamed from: B */
    public View f210538B;

    /* renamed from: C */
    public TextView f210539C;

    /* renamed from: D */
    public Button f210540D;

    /* renamed from: E */
    public C72386d f210541E;

    /* renamed from: F */
    public DialogInterface.OnCancelListener f210542F;

    /* renamed from: G */
    public C72394l f210543G = null;

    /* renamed from: H */
    public FavorPayInfo f210544H = new FavorPayInfo();

    /* renamed from: I */
    public boolean f210545I = false;

    /* renamed from: J */
    public boolean f210546J = true;

    /* renamed from: K */
    public Bankcard f210547K = null;

    /* renamed from: L */
    public BankcardLogoHelper f210548L = new BankcardLogoHelper();

    /* renamed from: M */
    public TextView f210549M;

    /* renamed from: N */
    public View f210550N;

    /* renamed from: P */
    public TextView f210551P;

    /* renamed from: Q */
    public ImageView f210552Q;

    /* renamed from: R */
    public int f210553R = 0;

    /* renamed from: S */
    public int f210554S = -1;

    /* renamed from: T */
    public boolean f210555T = false;

    /* renamed from: U */
    public int f210556U = 0;

    /* renamed from: V */
    public int f210557V = 0;

    /* renamed from: W */
    public Animation f210558W = null;

    /* renamed from: X */
    public PayInfo f210559X;

    /* renamed from: Y */
    public long f210560Y = -1;

    /* renamed from: Z */
    public Context f210561Z;

    /* renamed from: d */
    public View f210562d;

    /* renamed from: e */
    public ImageView f210563e;

    /* renamed from: f */
    public MyKeyboardWindow f210564f;

    /* renamed from: g */
    public View f210565g;

    /* renamed from: h */
    public TextView f210566h;

    /* renamed from: i */
    public TextView f210567i;

    /* renamed from: j */
    public TextView f210568j;

    /* renamed from: n */
    public TextView f210569n;

    /* renamed from: o */
    public TextView f210570o;

    /* renamed from: p */
    public FavourLayout f210571p;

    /* renamed from: p0 */
    public byte[] f210572p0 = new byte[0];

    /* renamed from: q */
    public CdnImageView f210573q;

    /* renamed from: r */
    public TextView f210574r;

    /* renamed from: s */
    public ImageView f210575s;

    /* renamed from: t */
    public EditHintPasswdView f210576t;

    /* renamed from: u */
    public C72388f f210577u;

    /* renamed from: v */
    public View f210578v;

    /* renamed from: w */
    public View f210579w;

    /* renamed from: x */
    public TextView f210580x;

    /* renamed from: x0 */
    public boolean f210581x0 = false;

    /* renamed from: y */
    public ImageView f210582y;

    /* renamed from: y0 */
    public boolean f210583y0 = false;

    /* renamed from: z */
    public TextView f210584z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$a */
    public class C72380a extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ PayInfo f210585g;

        /* renamed from: h */
        public final /* synthetic */ View.OnClickListener f210586h;

        /* renamed from: i */
        public final /* synthetic */ C72379f1 f210587i;

        public C72380a(PayInfo payInfo, View.OnClickListener onClickListener, C72379f1 f1Var) {
            this.f210585g = payInfo;
            this.f210586h = onClickListener;
            this.f210587i = f1Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C72379f1.f210536Q0.put(this.f210585g.f212592j, Boolean.TRUE);
            this.f210586h.onClick(view);
            if (this.f210587i.f210581x0) {
                C115669n.INSTANCE.mo160131h(14530, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$b */
    public class C72381b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OpenFingerPrintAuthEvent f210588d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$b$a */
        public class C72382a implements Animation.AnimationListener {

            /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$b$a$a */
            public class C72383a implements Runnable {
                public C72383a() {
                }

                public void run() {
                    C72379f1.this.f210551P.setVisibility(0);
                }
            }

            /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$b$a$b */
            public class C72384b implements Runnable {
                public C72384b() {
                }

                public void run() {
                    C72379f1.this.f210551P.setVisibility(8);
                    C72379f1.this.f210552Q.setVisibility(0);
                }
            }

            public C72382a() {
            }

            public void onAnimationEnd(Animation animation) {
                Log.m105924i("MicroMsg.WalletPwdDialog", "hy: on flash end");
                MMHandlerThread.postToMainThread(new C72384b());
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                Log.m105924i("MicroMsg.WalletPwdDialog", "hy: on flash start");
                MMHandlerThread.postToMainThread(new C72383a());
            }
        }

        public C72381b(OpenFingerPrintAuthEvent openFingerPrintAuthEvent) {
            this.f210588d = openFingerPrintAuthEvent;
        }

        public void run() {
            Log.m105924i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
            OpenFingerPrintAuthEvent.C67749b bVar = this.f210588d.f193785e;
            if (bVar == null) {
                C72379f1.this.f210559X.f212603x = 0;
                Log.m105924i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
                return;
            }
            int i = bVar.f193789a;
            Log.m105927v("MicroMsg.WalletPwdDialog", "alvinluo errCode: %d, errMsg: %s", Integer.valueOf(i), bVar.f193790b);
            if (i == 0) {
                Log.m105925i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", bVar.f193794f);
                PayInfo payInfo = C72379f1.this.f210559X;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 22, "");
                PayInfo payInfo2 = C72379f1.this.f210559X;
                payInfo2.f212603x = 1;
                payInfo2.f212570A = bVar.f193791c;
                payInfo2.f212571B = bVar.f193792d;
                try {
                    JSONObject jSONObject = new JSONObject(((C78473a) C86709a0.m107533q(C78473a.class)).sw0());
                    jSONObject.put("soter_type", ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91317G());
                    C72379f1.this.f210559X.f212576G = jSONObject.toString();
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WalletPwdDialog", e, "", new Object[0]);
                }
                C72379f1 f1Var = C72379f1.this;
                PayInfo payInfo3 = f1Var.f210559X;
                payInfo3.f212572C = bVar.f193793e;
                payInfo3.f212573D++;
                f1Var.f210551P.setText("");
                C72379f1.this.mo99740d();
                C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 1, 0, 2);
                C77290d.m93108f(0);
                return;
            }
            Log.m105924i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
            PayInfo payInfo4 = C72379f1.this.f210559X;
            C75155x0.m90135a(payInfo4 == null ? 0 : payInfo4.f212587e, payInfo4 == null ? "" : payInfo4.f212592j, 23, "");
            C72379f1 f1Var2 = C72379f1.this;
            f1Var2.f210559X.f212603x = 0;
            View view = f1Var2.f210550N;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C72379f1 f1Var3 = C72379f1.this;
            f1Var3.f210551P.setTextColor(f1Var3.getContext().getResources().getColor(C0966R.color.a_0));
            C72379f1.this.f210551P.setText(C0966R.string.ksy);
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            C72379f1 f1Var4 = C72379f1.this;
            int i2 = currentTimeMillis - f1Var4.f210557V;
            if (i2 > 1) {
                f1Var4.f210557V = currentTimeMillis;
                f1Var4.f210556U++;
                f1Var4.f210559X.f212573D++;
            }
            C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 1, 0, 2);
            boolean z = i == 2 || i == 10308;
            boolean z2 = bVar.f193795g == 2;
            Log.m105927v("MicroMsg.WalletPwdDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", Boolean.valueOf(z), Integer.valueOf(C72379f1.this.f210556U), Integer.valueOf(i), Boolean.valueOf(z2));
            if ((z2 || (C72379f1.this.f210556U < 3 && i2 > 1)) && !z) {
                Log.m105926v("MicroMsg.WalletPwdDialog", "alvinluo fingerprint pay");
                C72379f1 f1Var5 = C72379f1.this;
                if (f1Var5.f210558W == null) {
                    f1Var5.f210558W = C79335b.m96035a(f1Var5.getContext());
                }
                C72379f1.this.f210552Q.setVisibility(8);
                C72379f1.this.f210551P.setVisibility(4);
                C72379f1.this.f210558W.reset();
                C72379f1.this.f210558W.setAnimationListener(new C72382a());
                C72379f1 f1Var6 = C72379f1.this;
                f1Var6.f210551P.startAnimation(f1Var6.f210558W);
                C77290d.m93108f(1);
            } else if (C72379f1.this.f210556U >= 3 || z) {
                Log.m105926v("MicroMsg.WalletPwdDialog", "alvinluo change to pwd pay");
                C72379f1.this.mo99741f();
                C72379f1 f1Var7 = C72379f1.this;
                f1Var7.f210553R = 0;
                f1Var7.f210560Y = Util.currentTicks();
                C72379f1.this.f210549M.setVisibility(8);
                View view3 = C72379f1.this.f210550N;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C72379f1.this.f210551P.setVisibility(0);
                C72379f1.this.f210551P.setText(C0966R.string.ksz);
                C72379f1 f1Var8 = C72379f1.this;
                f1Var8.f210551P.setTextColor(f1Var8.getContext().getResources().getColor(C0966R.color.ajw));
                C72379f1.this.f210567i.setText(C0966R.string.l5w);
                C72379f1.this.f210576t.setVisibility(0);
                if (!C72379f1.this.f210565g.isShown()) {
                    View view5 = C72379f1.this.f210565g;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C77290d.m93108f(2);
                C72379f1.m84718r(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$c */
    public class C72385c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ DialogInterface.OnCancelListener f210593d;

        public C72385c(DialogInterface.OnCancelListener onCancelListener) {
            this.f210593d = onCancelListener;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            DialogInterface.OnCancelListener onCancelListener = this.f210593d;
            if (onCancelListener != null) {
                onCancelListener.onCancel((DialogInterface) null);
            }
            C72386d dVar = C72379f1.this.f210541E;
            if (dVar != null) {
                ((C70005g0) dVar).mo96341a();
            }
            C72379f1.this.cancel();
            if (C72379f1.this.f210549M.isShown()) {
                C115669n.INSTANCE.mo160131h(11977, 1, 0, 1, 0, 0, 0);
            } else {
                C115669n.INSTANCE.mo160131h(11977, 0, 0, 1, 0, 0, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$d */
    public interface C72386d {
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$e */
    public static class C72387e implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public DialogInterface.OnCancelListener f210595d;

        public C72387e(DialogInterface.OnCancelListener onCancelListener, C72389g1 g1Var) {
            this.f210595d = onCancelListener;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C72379f1.m84718r(false);
            DialogInterface.OnCancelListener onCancelListener = this.f210595d;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f1$f */
    public interface C72388f {
        /* renamed from: a */
        void mo96337a(String str, FavorPayInfo favorPayInfo, boolean z);
    }

    public C72379f1(Context context, int i) {
        super(context, C0966R.style.a6_);
        Log.m105926v("MicroMsg.WalletPwdDialog", "alvinluo WalletPwdDialog initView");
        this.f210561Z = context;
        View inflate = View.inflate(context, C0966R.C0971layout.cez, (ViewGroup) null);
        this.f210562d = inflate;
        this.f210563e = (ImageView) inflate.findViewById(C0966R.C0970id.lj5);
        this.f210564f = (MyKeyboardWindow) this.f210562d.findViewById(C0966R.C0970id.f359361kh3);
        this.f210565g = this.f210562d.findViewById(C0966R.C0970id.f359359kh1);
        this.f210566h = (TextView) this.f210562d.findViewById(C0966R.C0970id.br8);
        this.f210567i = (TextView) this.f210562d.findViewById(C0966R.C0970id.ljb);
        this.f210568j = (TextView) this.f210562d.findViewById(C0966R.C0970id.cy4);
        TextView textView = (TextView) this.f210562d.findViewById(C0966R.C0970id.hox);
        this.f210569n = textView;
        textView.getPaint().setFlags(16);
        this.f210570o = (TextView) this.f210562d.findViewById(C0966R.C0970id.a7c);
        this.f210571p = (FavourLayout) this.f210562d.findViewById(C0966R.C0970id.cxz);
        this.f210573q = (CdnImageView) this.f210562d.findViewById(C0966R.C0970id.f357502a71);
        this.f210578v = this.f210562d.findViewById(C0966R.C0970id.cxq);
        this.f210574r = (TextView) this.f210562d.findViewById(C0966R.C0970id.gzg);
        this.f210575s = (ImageView) this.f210562d.findViewById(C0966R.C0970id.b98);
        this.f210579w = this.f210562d.findViewById(C0966R.C0970id.a6z);
        this.f210580x = (TextView) this.f210562d.findViewById(C0966R.C0970id.jcc);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f210575s, C75228t.m90272u());
        this.f210576t = (EditHintPasswdView) this.f210562d.findViewById(C0966R.C0970id.f7k);
        this.f210582y = (ImageView) this.f210562d.findViewById(C0966R.C0970id.etk);
        this.f210549M = (TextView) this.f210562d.findViewById(C0966R.C0970id.f359559lj0);
        this.f210550N = this.f210562d.findViewById(C0966R.C0970id.e9a);
        this.f210551P = (TextView) this.f210562d.findViewById(C0966R.C0970id.e9d);
        this.f210552Q = (ImageView) this.f210562d.findViewById(C0966R.C0970id.e9_);
        this.f210584z = (TextView) this.f210562d.findViewById(C0966R.C0970id.azo);
        this.f210537A = (TextView) this.f210562d.findViewById(C0966R.C0970id.ic8);
        this.f210538B = this.f210562d.findViewById(C0966R.C0970id.cxa);
        this.f210539C = (TextView) this.f210562d.findViewById(C0966R.C0970id.cxv);
        this.f210540D = (Button) this.f210562d.findViewById(C0966R.C0970id.cqa);
        this.f210571p.setVisibility(8);
        C85875k4.m106189j0(this.f210567i.getPaint(), 0.8f);
        C85875k4.m106189j0(this.f210549M.getPaint(), 0.8f);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
        C76024a.m91321b(this.f210576t);
        this.f210576t.setOnInputValidListener(new C72389g1(this));
        this.f210576t.requestFocus();
        TextView textView2 = (TextView) this.f210562d.findViewById(C0966R.C0970id.ljb);
        if (textView2 != null) {
            textView2.setText(C75592q0.m90763K() ? context.getString(C0966R.string.l5x) : context.getString(C0966R.string.l5w));
        }
        EditText editText = (EditText) this.f210562d.findViewById(C0966R.C0970id.lg_);
        C75228t.m90251i0(editText);
        this.f210564f.setInputEditText(editText);
        C79145c cVar = new C79145c();
        this.f210564f.setSecureAccessibility(cVar);
        editText.setAccessibilityDelegate(cVar);
        editText.setOnClickListener(new C5805h1(this));
        this.f210562d.findViewById(C0966R.C0970id.kh4).setOnClickListener(new C5806i1(this));
        this.f210540D.setOnClickListener(new C72391j1(this));
    }

    /* renamed from: e */
    public static boolean m84717e() {
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, Boolean.FALSE);
        if (f != null) {
            return ((Boolean) f).booleanValue();
        }
        return false;
    }

    /* renamed from: r */
    public static void m84718r(boolean z) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x065c  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0666  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0701  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0721  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0941  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a4c  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0cca  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0cdf  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1 m84719t(android.content.Context r32, boolean r33, com.tencent.p014mm.plugin.wallet_core.model.Orders r34, com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo r35, com.tencent.p014mm.plugin.wallet_core.model.Bankcard r36, com.tencent.p014mm.pluginsdk.wallet.PayInfo r37, java.lang.String r38, com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1.C72388f r39, android.view.View.OnClickListener r40, android.content.DialogInterface.OnCancelListener r41) {
        /*
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r38
            r7 = r41
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            boolean r9 = r0 instanceof android.app.Activity
            r10 = 0
            if (r9 == 0) goto L_0x0021
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r9 = r9.isFinishing()
            if (r9 == 0) goto L_0x0021
            return r10
        L_0x0021:
            if (r2 == 0) goto L_0x0cf4
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r9 = r2.f209542M
            if (r9 == 0) goto L_0x0cf4
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            if (r9 > 0) goto L_0x0031
            goto L_0x0cf4
        L_0x0031:
            com.tencent.mm.plugin.wallet_core.ui.m r9 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.ui.l r11 = r9.mo99776a(r2)
            java.lang.String r12 = "MicroMsg.WalletPwdDialog"
            java.lang.String r13 = "showAlert with favInfo %s bindSerial %s  bankcardType %s"
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]
            if (r3 != 0) goto L_0x0043
            java.lang.String r16 = ""
            goto L_0x0047
        L_0x0043:
            java.lang.String r16 = r35.toString()
        L_0x0047:
            r10 = 0
            r15[r10] = r16
            if (r4 != 0) goto L_0x0051
            java.lang.String r16 = ""
            r14 = r16
            goto L_0x0053
        L_0x0051:
            java.lang.String r14 = r4.field_bindSerial
        L_0x0053:
            r10 = 1
            r15[r10] = r14
            if (r4 != 0) goto L_0x005b
            java.lang.String r14 = ""
            goto L_0x005d
        L_0x005b:
            java.lang.String r14 = r4.field_bankcardType
        L_0x005d:
            r10 = 2
            r15[r10] = r14
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r15)
            if (r11 == 0) goto L_0x0134
            if (r3 == 0) goto L_0x011d
            if (r4 == 0) goto L_0x011d
            java.lang.String r12 = r4.field_bankcardType
            java.lang.String r13 = "CFT"
            boolean r12 = r12.equalsIgnoreCase(r13)
            java.lang.String r13 = "MicroMsg.WalletPwdDialog"
            java.lang.String r14 = "selectedFavorCompId %s isFilterNotSupportCft %s"
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.String r10 = r3.f209524d
            r17 = 0
            r15[r17] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)
            r7 = 1
            r15[r7] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r15)
            java.lang.String r10 = r3.f209524d
            java.lang.String r10 = r11.mo99767c(r10, r12)
            java.lang.String r13 = "MicroMsg.WalletPwdDialog"
            java.lang.String r14 = "nonBankSelectedFaovrCompId %s"
            java.lang.Object[] r15 = new java.lang.Object[r7]
            r15[r17] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r14, r15)
            java.util.Map r13 = r11.mo99768d(r10, r7)
            java.util.Map r14 = r11.mo99766b(r10, r7)
            java.lang.String r7 = r4.field_bindSerial
            java.util.HashMap r13 = (java.util.HashMap) r13
            java.lang.Object r7 = r13.get(r7)
            com.tencent.mm.plugin.wallet_core.ui.l$a r7 = (com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l.C72395a) r7
            java.lang.String r13 = r4.field_bankcardType
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.Object r13 = r14.get(r13)
            com.tencent.mm.plugin.wallet_core.ui.l$a r13 = (com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l.C72395a) r13
            y43.n r12 = r11.mo99769e(r10, r12)
            java.lang.String r14 = "MicroMsg.WalletPwdDialog"
            java.lang.String r15 = "defaultComposeInfo %s wrapperSerial %s wrapper %s"
            r20 = r9
            r1 = 3
            java.lang.Object[] r9 = new java.lang.Object[r1]
            if (r12 != 0) goto L_0x00c6
            java.lang.String r1 = ""
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r1 = r12.f232085d
        L_0x00c8:
            r17 = 0
            r9[r17] = r1
            if (r7 != 0) goto L_0x00d1
            java.lang.String r1 = ""
            goto L_0x00d5
        L_0x00d1:
            java.lang.String r1 = r7.toString()
        L_0x00d5:
            r18 = 1
            r9[r18] = r1
            if (r13 != 0) goto L_0x00de
            java.lang.String r1 = ""
            goto L_0x00e2
        L_0x00de:
            java.lang.String r1 = r13.toString()
        L_0x00e2:
            r19 = 2
            r9[r19] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r9)
            if (r7 == 0) goto L_0x00fe
            y43.n r1 = r7.f210617a
            if (r1 == 0) goto L_0x00fe
            java.lang.String r1 = r1.f232085d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00fe
            y43.n r1 = r7.f210617a
            java.lang.String r1 = r1.f232085d
            r3.f209524d = r1
            goto L_0x012e
        L_0x00fe:
            if (r13 == 0) goto L_0x0113
            y43.n r1 = r13.f210617a
            if (r1 == 0) goto L_0x0113
            java.lang.String r1 = r1.f232085d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0113
            y43.n r1 = r13.f210617a
            java.lang.String r1 = r1.f232085d
            r3.f209524d = r1
            goto L_0x012e
        L_0x0113:
            if (r12 == 0) goto L_0x011a
            java.lang.String r1 = r12.f232085d
            r3.f209524d = r1
            goto L_0x012e
        L_0x011a:
            r3.f209524d = r10
            goto L_0x012e
        L_0x011d:
            r20 = r9
            y43.l r1 = r2.f209543N
            if (r1 == 0) goto L_0x012e
            java.lang.String r1 = r1.f232071g
            java.lang.String r1 = r11.mo99765a(r1)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r11.mo99771g(r1)
            goto L_0x012f
        L_0x012e:
            r1 = r3
        L_0x012f:
            java.util.List r3 = r11.mo99772i()
            goto L_0x013f
        L_0x0134:
            r20 = r9
            java.lang.String r1 = "MicroMsg.WalletPwdDialog"
            java.lang.String r7 = "getFavorLogicHelper null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r7)
            r1 = r3
            r3 = 0
        L_0x013f:
            java.lang.String r7 = ""
            android.os.Bundle r9 = r5.f212600u
            if (r9 != 0) goto L_0x0148
            java.lang.String r9 = ""
            goto L_0x0150
        L_0x0148:
            java.lang.String r10 = "extinfo_key_19"
            java.lang.String r12 = ""
            java.lang.String r9 = r9.getString(r10, r12)
        L_0x0150:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r12 = 31
            r13 = 32
            r14 = 33
            if (r10 != 0) goto L_0x015f
            r7 = r9
            goto L_0x0365
        L_0x015f:
            int r9 = r5.f212587e
            r10 = 2131839577(0x7f114a59, float:1.931241E38)
            if (r9 == r13) goto L_0x02c6
            if (r9 != r14) goto L_0x016a
            goto L_0x02c6
        L_0x016a:
            if (r9 != r12) goto L_0x01f4
            android.os.Bundle r9 = r5.f212600u
            java.lang.String r15 = "extinfo_key_1"
            java.lang.String r14 = ""
            java.lang.String r9 = r9.getString(r15, r14)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r14 != 0) goto L_0x01ea
            f40.C86709a0.m107528h()
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.mo69664N2(r9)
            if (r8 == 0) goto L_0x01cd
            java.lang.String r7 = r8.mo62909j3()
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r38)
            if (r7 == 0) goto L_0x01a7
            java.lang.String r6 = ""
            goto L_0x01bd
        L_0x01a7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "("
            r7.append(r14)
            r7.append(r6)
            java.lang.String r6 = ")"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x01bd:
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r9[r7] = r6
            java.lang.String r7 = r0.getString(r10, r9)
            goto L_0x0365
        L_0x01cd:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "can not found contact for user::"
            r8.append(r10)
            r8.append(r9)
            java.lang.String r9 = ""
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            goto L_0x0365
        L_0x01ea:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.String r8 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            goto L_0x0365
        L_0x01f4:
            r14 = 42
            if (r9 != r14) goto L_0x0283
            android.os.Bundle r9 = r5.f212600u
            java.lang.String r10 = "extinfo_key_1"
            java.lang.String r14 = ""
            java.lang.String r9 = r9.getString(r10, r14)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0279
            f40.C86709a0.m107528h()
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.mo69664N2(r9)
            if (r8 == 0) goto L_0x025c
            java.lang.String r7 = r8.mo62909j3()
            r8 = 2131839570(0x7f114a52, float:1.9312395E38)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r38)
            if (r7 == 0) goto L_0x0236
            java.lang.String r6 = ""
            goto L_0x024c
        L_0x0236:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "("
            r7.append(r14)
            r7.append(r6)
            java.lang.String r6 = ")"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x024c:
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r7 = 0
            r10[r7] = r6
            java.lang.String r7 = r0.getString(r8, r10)
            goto L_0x0365
        L_0x025c:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "can not found contact for user::"
            r8.append(r10)
            r8.append(r9)
            java.lang.String r9 = ""
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            goto L_0x0365
        L_0x0279:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.String r8 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            goto L_0x0365
        L_0x0283:
            r6 = 48
            if (r9 != r6) goto L_0x0290
            r6 = 2131834257(0x7f113591, float:1.930162E38)
            java.lang.String r7 = r0.getString(r6)
            goto L_0x0365
        L_0x0290:
            r6 = 49
            if (r9 != r6) goto L_0x0365
            android.os.Bundle r6 = r5.f212600u
            java.lang.String r8 = "extinfo_key_1"
            java.lang.String r9 = ""
            java.lang.String r6 = r6.getString(r8, r9)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r8 != 0) goto L_0x02b0
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r9 = 0
            r7[r9] = r6
            java.lang.String r7 = r0.getString(r10, r7)
            goto L_0x0365
        L_0x02b0:
            r8 = 1
            r9 = 0
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.String r10 = "userName is null, scene is %s"
            java.lang.Object[] r14 = new java.lang.Object[r8]
            int r8 = r5.f212587e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14[r9] = r8
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r10, r14)
            goto L_0x0365
        L_0x02c6:
            android.os.Bundle r9 = r5.f212600u
            java.lang.String r14 = "extinfo_key_5"
            java.lang.String r15 = ""
            java.lang.String r9 = r9.getString(r14, r15)
            android.os.Bundle r14 = r5.f212600u
            java.lang.String r15 = "extinfo_key_1"
            java.lang.String r13 = ""
            java.lang.String r13 = r14.getString(r15, r13)
            java.lang.String r10 = r0.getString(r10)
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r14 != 0) goto L_0x02e6
            r7 = r9
            goto L_0x02e7
        L_0x02e6:
            r9 = r10
        L_0x02e7:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r10 != 0) goto L_0x035d
            f40.C86709a0.m107528h()
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.mo69664N2(r13)
            if (r8 == 0) goto L_0x0341
            java.lang.String r7 = r8.mo62898f()
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r7)
            r8.append(r7)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r38)
            if (r7 == 0) goto L_0x031c
            java.lang.String r6 = ""
            goto L_0x0332
        L_0x031c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r13 = "("
            r7.append(r13)
            r7.append(r6)
            java.lang.String r6 = ")"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x0332:
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7 = 0
            r10[r7] = r6
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r9, r10)
            goto L_0x0365
        L_0x0341:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "can not found contact for user::"
            r8.append(r9)
            r8.append(r13)
            java.lang.String r9 = ""
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            goto L_0x0365
        L_0x035d:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.String r8 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
        L_0x0365:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r6 == 0) goto L_0x03bf
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r6 = r2.f209542M
            if (r6 == 0) goto L_0x03bf
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r8 = 0
            java.lang.Object r6 = r6.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r6 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r6
            if (r6 == 0) goto L_0x03c6
            java.lang.String r7 = r6.f209598g
            int r8 = r5.f212587e
            if (r8 == r12) goto L_0x038b
            r9 = 32
            if (r8 == r9) goto L_0x038b
            r9 = 33
            if (r8 != r9) goto L_0x0389
            goto L_0x038b
        L_0x0389:
            r8 = 0
            goto L_0x038c
        L_0x038b:
            r8 = 1
        L_0x038c:
            if (r8 == 0) goto L_0x03b6
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x03a5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "\n"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L_0x03a5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = r6.f209599h
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L_0x03b6:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x03c6
            java.lang.String r7 = r6.f209599h
            goto L_0x03c6
        L_0x03bf:
            java.lang.String r6 = "MicroMsg.WalletPwdDialog"
            java.lang.String r8 = "orders null?:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r8)
        L_0x03c6:
            double r8 = r2.f209566h
            r13 = 0
            if (r11 == 0) goto L_0x047f
            if (r1 == 0) goto L_0x047f
            java.lang.String r10 = r1.f209524d
            y43.n r10 = r11.mo99770f(r10)
            r11 = r7
            if (r10 == 0) goto L_0x0411
            double r6 = r10.f232091j
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0411
            double r6 = r2.f209566h
            java.lang.String r3 = r2.f209568j
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r3)
            double r6 = r10.f232090i
            java.lang.String r8 = r2.f209568j
            java.lang.String r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r8)
            double r8 = r10.f232087f
            java.lang.String r7 = r10.f232093o
            java.util.HashMap<java.lang.String, java.lang.Boolean> r15 = f210536Q0
            java.lang.String r12 = r5.f212592j
            boolean r12 = r15.containsKey(r12)
            if (r12 != 0) goto L_0x040d
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 1
            java.lang.Object[] r13 = new java.lang.Object[r15]
            r14 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r14 = 0
            r13[r14] = r15
            r14 = 14530(0x38c2, float:2.0361E-41)
            r12.mo160131h(r14, r13)
        L_0x040d:
            r12 = r3
            r3 = r6
            r6 = 0
            goto L_0x042a
        L_0x0411:
            if (r3 == 0) goto L_0x042c
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x042c
            double r6 = r10.f232090i
            java.lang.String r3 = r2.f209568j
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r3)
            r6 = 2131839573(0x7f114a55, float:1.9312401E38)
            java.lang.String r6 = r0.getString(r6)
            r7 = 0
            r12 = 0
        L_0x042a:
            r13 = 1
            goto L_0x0438
        L_0x042c:
            double r6 = r2.f209566h
            java.lang.String r3 = r2.f209568j
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r3)
            r6 = 0
            r7 = 0
            r12 = 0
            r13 = 0
        L_0x0438:
            if (r10 == 0) goto L_0x0458
            int r14 = r10.f232092n
            if (r14 == 0) goto L_0x0458
            java.lang.String r10 = r10.f232094p
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r14 != 0) goto L_0x0459
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = ","
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = r14.toString()
            goto L_0x0459
        L_0x0458:
            r10 = 0
        L_0x0459:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r14 == 0) goto L_0x0465
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r14 != 0) goto L_0x0486
        L_0x0465:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r14 == 0) goto L_0x046d
            r6 = 0
            goto L_0x0486
        L_0x046d:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = ","
            r14.append(r15)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            goto L_0x0486
        L_0x047f:
            r11 = r7
            r3 = 0
            r6 = 0
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
        L_0x0486:
            double r14 = r2.f209569n
            r21 = 0
            int r23 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r23 <= 0) goto L_0x04af
            android.content.res.Resources r14 = r32.getResources()
            r21 = r11
            r15 = 1
            java.lang.Object[] r11 = new java.lang.Object[r15]
            r15 = r6
            r22 = r7
            double r6 = r2.f209569n
            r23 = r15
            java.lang.String r15 = r2.f209568j
            java.lang.String r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r6, r15)
            r7 = 0
            r11[r7] = r6
            r6 = 2131839005(0x7f11481d, float:1.931125E38)
            java.lang.String r6 = r14.getString(r6, r11)
            goto L_0x04b6
        L_0x04af:
            r23 = r6
            r22 = r7
            r21 = r11
            r6 = 0
        L_0x04b6:
            if (r4 != 0) goto L_0x04bb
            java.lang.String r7 = ""
            goto L_0x04bd
        L_0x04bb:
            java.lang.String r7 = r4.field_desc
        L_0x04bd:
            if (r4 == 0) goto L_0x04d1
            boolean r11 = r36.mo99392r2()
            if (r11 == 0) goto L_0x04d1
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            ny.h r11 = (p629ny.C76979h) r11
            android.text.SpannableString r7 = r11.mo107057T1(r0, r7)
        L_0x04d1:
            com.tencent.mm.plugin.wallet_core.ui.f1 r11 = new com.tencent.mm.plugin.wallet_core.ui.f1
            r14 = 2131887332(0x7f1204e4, float:1.9409268E38)
            r11.<init>(r0, r14)
            r14 = r20
            com.tencent.mm.plugin.wallet_core.ui.l r14 = r14.mo99776a(r2)
            r11.f210543G = r14
            y43.l r14 = r2.f209543N
            r15 = 8
            if (r14 == 0) goto L_0x052a
            java.util.LinkedList<y43.d0> r14 = r14.f232072h
            if (r14 == 0) goto L_0x052a
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x052a
            com.tencent.mm.plugin.wallet_core.ui.l r14 = r11.f210543G
            if (r14 == 0) goto L_0x052a
            if (r1 != 0) goto L_0x0502
            y43.l r1 = r2.f209543N
            java.lang.String r1 = r1.f232071g
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r14.mo99771g(r1)
            r11.f210544H = r1
            goto L_0x0504
        L_0x0502:
            r11.f210544H = r1
        L_0x0504:
            android.widget.TextView r1 = r11.f210574r
            r14 = 0
            r1.setVisibility(r14)
            android.view.View r1 = r11.f210579w
            if (r1 == 0) goto L_0x0513
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r14 = r11.f210544H
            r1.setTag(r14)
        L_0x0513:
            r11.f210547K = r4
            android.view.View r1 = r11.f210538B
            com.tencent.mm.plugin.wallet_core.ui.m1 r14 = new com.tencent.mm.plugin.wallet_core.ui.m1
            r14.<init>(r11, r0, r2)
            r1.setOnClickListener(r14)
            com.tencent.mm.plugin.wallet_core.ui.l r1 = r11.f210543G
            junit.framework.Assert.assertNotNull(r1)
            android.widget.ImageView r1 = r11.f210582y
            r1.setVisibility(r15)
            goto L_0x052f
        L_0x052a:
            android.widget.TextView r1 = r11.f210574r
            r1.setVisibility(r15)
        L_0x052f:
            r1 = r33
            r11.mo99754v(r1)
            r11.f210546J = r1
            com.tencent.mm.plugin.wallet_core.ui.f1$e r1 = new com.tencent.mm.plugin.wallet_core.ui.f1$e
            r14 = r41
            r15 = 0
            r1.<init>(r14, r15)
            r11.mo99751s(r1)
            com.tencent.mm.plugin.wallet_core.ui.f1$e r1 = new com.tencent.mm.plugin.wallet_core.ui.f1$e
            r1.<init>(r14, r15)
            r11.setOnCancelListener(r1)
            r1 = 1
            r11.setCancelable(r1)
            android.widget.TextView r1 = r11.f210566h
            r14 = r21
            r1.setText(r14)
            r11.mo99750q(r3, r8)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0569
            android.widget.TextView r1 = r11.f210569n
            r3 = 0
            r1.setVisibility(r3)
            android.widget.TextView r1 = r11.f210569n
            r1.setText(r12)
            goto L_0x0570
        L_0x0569:
            android.widget.TextView r1 = r11.f210569n
            r3 = 8
            r1.setVisibility(r3)
        L_0x0570:
            com.tencent.mm.plugin.wallet_core.ui.f1$a r1 = new com.tencent.mm.plugin.wallet_core.ui.f1$a
            r3 = r40
            r1.<init>(r5, r3, r11)
            r11.mo99745l(r7, r1, r13)
            r11.mo99744i(r4)
            int r1 = r2.f209538I
            r3 = 1
            if (r1 != r3) goto L_0x0584
            r1 = 1
            goto L_0x0585
        L_0x0584:
            r1 = 0
        L_0x0585:
            r11.f210559X = r5
            r11.f210555T = r1
            boolean r1 = eb0.C75592q0.m90763K()
            if (r1 == 0) goto L_0x0595
        L_0x058f:
            r7 = r22
            r1 = r23
            goto L_0x0bdb
        L_0x0595:
            java.lang.Class<vt1.a> r1 = vt1.C78473a.class
            java.lang.String r3 = "MicroMsg.WalletPwdDialog"
            java.lang.String r7 = "alvinluo updateFingerprintMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r3, r7)
            byte[] r3 = r11.f210572p0
            monitor-enter(r3)
            monitor-exit(r3)     // Catch:{ all -> 0x0cf1 }
            k40.a r3 = f40.C86709a0.m107533q(r1)
            vt1.a r3 = (vt1.C78473a) r3
            boolean r7 = r3.mo107921ys()
            if (r7 == 0) goto L_0x05c4
            boolean r7 = r3.iw0()
            if (r7 == 0) goto L_0x05c4
            boolean r7 = r3.mo107884d6()
            if (r7 != 0) goto L_0x05c4
            boolean r7 = r3.mo107880J3()
            if (r7 == 0) goto L_0x05c4
            r7 = 0
            r11.f210554S = r7
            goto L_0x05e0
        L_0x05c4:
            boolean r7 = r3.Fk0()
            if (r7 == 0) goto L_0x05e0
            boolean r7 = r3.mo107913l3()
            if (r7 == 0) goto L_0x05e0
            boolean r7 = r3.mo107879H0()
            if (r7 != 0) goto L_0x05e0
            boolean r7 = r3.mo107883Zi()
            if (r7 == 0) goto L_0x05e0
            r7 = 1
            r11.f210554S = r7
            goto L_0x05e1
        L_0x05e0:
            r7 = 1
        L_0x05e1:
            java.lang.String r8 = "MicroMsg.WalletPwdDialog"
            java.lang.String r9 = "bio mode: %s"
            java.lang.Object[] r12 = new java.lang.Object[r7]
            int r7 = r11.f210554S
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 0
            r12[r13] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r12)
            r11.f210556U = r13
            android.widget.TextView r7 = r11.f210549M
            r8 = 8
            r7.setVisibility(r8)
            android.view.View r7 = r11.f210550N
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r9.mo10233c(r12)
            java.lang.Object[] r25 = r9.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r7
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r8 = 0
            java.lang.Object r9 = r9.mo10231a(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.setVisibility(r8)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r11.f210560Y = r7
            st1.h0 r7 = st1.C77761h0.IML
            boolean r8 = r7.f226592f
            java.lang.Class<yz.v> r9 = p281yz.C79173v.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            yz.v r9 = (p281yz.C79173v) r9
            b63.s0 r9 = r9.Ex0()
            if (r9 == 0) goto L_0x0661
            int r9 = r11.f210554S
            if (r9 < 0) goto L_0x0661
            boolean r9 = r3.mo107914qV()
            goto L_0x0662
        L_0x0661:
            r9 = 1
        L_0x0662:
            boolean r12 = r11.f210555T
            if (r12 == 0) goto L_0x0728
            java.lang.Class<ly.c> r12 = p602ly.C76737c.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            vt1.a r1 = (vt1.C78473a) r1
            int r13 = r1.type()
            java.lang.String r14 = "MicroMsg.WalletPwdDialog"
            r15 = 1
            if (r13 != r15) goto L_0x06b0
            boolean r13 = r1.mo107880J3()
            if (r13 != 0) goto L_0x0683
            boolean r13 = r1.mo107883Zi()
            if (r13 == 0) goto L_0x06b0
        L_0x0683:
            di3.d r13 = di3.C86312j.m106911c(r12)
            ly.c r13 = (p602ly.C76737c) r13
            boolean r13 = r13.mo59456ve()
            if (r13 == 0) goto L_0x06b0
            di3.d r12 = di3.C86312j.m106911c(r12)
            ly.c r12 = (p602ly.C76737c) r12
            boolean r12 = r12.p40()
            if (r12 == 0) goto L_0x06b0
            int r12 = lt3.C21460a.m24273g()
            if (r12 != 0) goto L_0x06b0
            java.lang.String r12 = "may treble init error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 23
            r14 = 1104(0x450, float:1.547E-42)
            r12.mo175911u(r14, r13)
            goto L_0x06f8
        L_0x06b0:
            int r12 = r1.type()
            r13 = 2
            if (r12 != r13) goto L_0x06f8
            int r12 = lt3.C21460a.m24273g()
            r13 = 1
            if (r12 != r13) goto L_0x06e6
            boolean r12 = lt3.C21460a.m24282p()
            if (r12 != 0) goto L_0x06d4
            java.lang.String r12 = "soter service disconnected"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 24
            r15 = 1104(0x450, float:1.547E-42)
            r12.mo175911u(r15, r13)
            goto L_0x06fa
        L_0x06d4:
            r15 = 1104(0x450, float:1.547E-42)
            if (r9 != 0) goto L_0x06fa
            java.lang.String r12 = "soter treble key error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 25
            r12.mo175911u(r15, r13)
            goto L_0x06fa
        L_0x06e6:
            r15 = 1104(0x450, float:1.547E-42)
            if (r9 != 0) goto L_0x06fa
            java.lang.String r12 = "soter1.0 key error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 26
            r12.mo175911u(r15, r13)
            goto L_0x06fa
        L_0x06f8:
            r15 = 1104(0x450, float:1.547E-42)
        L_0x06fa:
            int r1 = r1.type()
            r12 = 2
            if (r1 != r12) goto L_0x0716
            int r1 = lt3.C21460a.m24273g()
            if (r1 != 0) goto L_0x070f
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 28
            r1.mo175911u(r15, r12)
            goto L_0x0716
        L_0x070f:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 31
            r1.mo175911u(r15, r12)
        L_0x0716:
            if (r9 != 0) goto L_0x071f
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 27
            r1.mo175911u(r15, r12)
        L_0x071f:
            if (r8 == 0) goto L_0x0728
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 33
            r1.mo175911u(r15, r12)
        L_0x0728:
            r1 = 1
            r8 = r8 ^ r1
            r8 = r8 & r9
            if (r8 != 0) goto L_0x072f
            r7.f226592f = r1
        L_0x072f:
            java.lang.String r7 = "MicroMsg.WalletPwdDialog"
            java.lang.String r9 = "hy: soter key status: %b"
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r13 = 0
            r12[r13] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r12)
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            r7 = 100102(0x18706, float:1.40273E-40)
            r9 = 6
            if (r1 == 0) goto L_0x0750
            int r15 = r1.f212574E
            r12 = 100000(0x186a0, float:1.4013E-40)
            if (r15 == r12) goto L_0x0752
            if (r15 == r7) goto L_0x0752
        L_0x0750:
            if (r8 != 0) goto L_0x0927
        L_0x0752:
            java.lang.String r12 = "MicroMsg.WalletPwdDialog"
            java.lang.String r15 = "errCode: %s"
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            int r1 = r1.f212574E
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13 = 0
            r14[r13] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r15, r14)
            android.view.View r1 = r11.f210565g
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x07af
            android.view.View r1 = r11.f210565g
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r14)
            java.lang.Object[] r25 = r12.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r13 = 0
            java.lang.Object r12 = r12.mo10231a(r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r1.setVisibility(r12)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x07af:
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            r12 = 0
            if (r1 == 0) goto L_0x07be
            r1.f212603x = r12
            java.lang.String r13 = ""
            r1.f212570A = r13
            java.lang.String r13 = ""
            r1.f212571B = r13
        L_0x07be:
            android.view.View r1 = r11.f210550N
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r13.mo10233c(r14)
            java.lang.Object[] r25 = r13.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = 0
            java.lang.Object r13 = r13.mo10231a(r12)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r1.setVisibility(r12)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.TextView r1 = r11.f210551P
            r12 = 0
            r1.setVisibility(r12)
            android.widget.TextView r1 = r11.f210551P
            com.tencent.mm.pluginsdk.wallet.PayInfo r12 = r11.f210559X
            if (r12 == 0) goto L_0x0814
            int r12 = r12.f212574E
            if (r12 != r7) goto L_0x0814
            r12 = 2131839098(0x7f11487a, float:1.9311438E38)
            goto L_0x0817
        L_0x0814:
            r12 = 2131839091(0x7f114873, float:1.9311424E38)
        L_0x0817:
            r1.setText(r12)
            android.widget.TextView r1 = r11.f210551P
            android.content.Context r12 = r11.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131101781(0x7f060855, float:1.7815981E38)
            int r12 = r12.getColor(r13)
            r1.setTextColor(r12)
            if (r8 != 0) goto L_0x087a
            android.view.View r1 = r11.f210579w
            k20.a r8 = new k20.a
            r8.<init>()
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r8.mo10233c(r13)
            java.lang.Object[] r25 = r8.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = 0
            java.lang.Object r8 = r8.mo10231a(r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.TextView r1 = r11.f210580x
            r8 = 0
            r1.setVisibility(r8)
            goto L_0x08c5
        L_0x087a:
            android.view.View r1 = r11.f210579w
            k20.a r8 = new k20.a
            r8.<init>()
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r8.mo10233c(r13)
            java.lang.Object[] r25 = r8.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = 0
            java.lang.Object r8 = r8.mo10231a(r12)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r1.setVisibility(r8)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.TextView r1 = r11.f210580x
            r8 = 8
            r1.setVisibility(r8)
        L_0x08c5:
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            if (r1 == 0) goto L_0x08f2
            int r1 = r1.f212574E
            if (r1 != r7) goto L_0x08f2
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.mo119677K(r7, r8)
            r1 = 0
            r3.mo107878Fg(r1)
            r3.W00(r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r1.mo119677K(r3, r7)
        L_0x08f2:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3[r7] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r3[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 2
            r3[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 3
            r3[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 4
            r3[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r7 = 5
            r3[r7] = r8
            r7 = 11977(0x2ec9, float:1.6783E-41)
            r1.mo160131h(r7, r3)
            goto L_0x058f
        L_0x0927:
            if (r1 == 0) goto L_0x0933
            int r3 = r1.f212574E
            r7 = 100001(0x186a1, float:1.40131E-40)
            if (r3 != r7) goto L_0x0933
            r3 = 1
            r1.f212603x = r3
        L_0x0933:
            int r1 = r11.f210554S
            if (r1 < 0) goto L_0x0a4c
            boolean r1 = r11.f210555T
            if (r1 == 0) goto L_0x0a4c
            boolean r1 = m84717e()
            if (r1 != 0) goto L_0x0a4c
            android.widget.TextView r1 = r11.f210549M
            r3 = 0
            r1.setVisibility(r3)
            android.widget.TextView r1 = r11.f210549M
            android.content.Context r3 = r11.getContext()
            r7 = 2131839581(0x7f114a5d, float:1.9312418E38)
            java.lang.String r3 = r3.getString(r7)
            r1.setText(r3)
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView r1 = r11.f210576t
            r3 = 8
            r1.setVisibility(r3)
            android.view.View r1 = r11.f210565g
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7.mo10233c(r8)
            java.lang.Object[] r25 = r7.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r3 = r7.intValue()
            r1.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            r3 = 1
            if (r1 == 0) goto L_0x09a7
            r1.f212603x = r3
        L_0x09a7:
            int r1 = r11.f210554S
            if (r1 != 0) goto L_0x0a35
            r11.f210553R = r3
            android.view.View r1 = r11.f210550N
            k20.a r3 = new k20.a
            r3.<init>()
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r8)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r7 = 0
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.ImageView r1 = r11.f210552Q
            r3 = 0
            r1.setVisibility(r3)
            android.widget.TextView r1 = r11.f210567i
            r7 = 2131839572(0x7f114a54, float:1.93124E38)
            r1.setText(r7)
            r11.mo99742g()
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7[r8] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r12 = 2
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r13 = 3
            r7[r13] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r13 = 4
            r7[r13] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r13 = 5
            r7[r13] = r9
            r9 = 11977(0x2ec9, float:1.6783E-41)
            r1.mo160131h(r9, r7)
            goto L_0x0b68
        L_0x0a35:
            r3 = 0
            r8 = 1
            r12 = 2
            if (r1 != r8) goto L_0x0b68
            r11.f210553R = r12
            android.widget.Button r1 = r11.f210540D
            r1.setVisibility(r3)
            android.widget.TextView r1 = r11.f210567i
            r3 = 2131839571(0x7f114a53, float:1.9312397E38)
            r1.setText(r3)
            r3 = 0
            goto L_0x0b68
        L_0x0a4c:
            int r1 = r11.f210554S
            if (r1 < 0) goto L_0x0b6a
            boolean r1 = r11.f210555T
            if (r1 == 0) goto L_0x0b6a
            boolean r1 = m84717e()
            if (r1 == 0) goto L_0x0b6a
            int r1 = r11.f210554S
            if (r1 != 0) goto L_0x0a6f
            android.widget.TextView r1 = r11.f210549M
            android.content.Context r3 = r11.getContext()
            r7 = 2131839092(0x7f114874, float:1.9311426E38)
            java.lang.String r3 = r3.getString(r7)
            r1.setText(r3)
            goto L_0x0a7f
        L_0x0a6f:
            android.widget.TextView r1 = r11.f210549M
            android.content.Context r3 = r11.getContext()
            r7 = 2131839084(0x7f11486c, float:1.931141E38)
            java.lang.String r3 = r3.getString(r7)
            r1.setText(r3)
        L_0x0a7f:
            android.widget.TextView r1 = r11.f210549M
            r3 = 0
            r1.setVisibility(r3)
            r11.f210553R = r3
            android.view.View r1 = r11.f210550N
            k20.a r3 = new k20.a
            r3.<init>()
            r7 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r3.mo10233c(r8)
            java.lang.Object[] r25 = r3.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r7 = 0
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.Button r1 = r11.f210540D
            r3 = 8
            r1.setVisibility(r3)
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView r1 = r11.f210576t
            r3 = 0
            r1.setVisibility(r3)
            android.view.View r1 = r11.f210565g
            boolean r1 = r1.isShown()
            if (r1 != 0) goto L_0x0b22
            android.view.View r1 = r11.f210565g
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7.mo10233c(r8)
            java.lang.Object[] r25 = r7.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r27 = "updateFingerPrintMode"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r3 = r7.intValue()
            r1.setVisibility(r3)
            java.lang.String r25 = "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog"
            java.lang.String r26 = "updateFingerPrintMode"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x0b22:
            android.widget.TextView r1 = r11.f210567i
            r3 = 2131839578(0x7f114a5a, float:1.9312411E38)
            r1.setText(r3)
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            r3 = 0
            if (r1 == 0) goto L_0x0b31
            r1.f212603x = r3
        L_0x0b31:
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r7[r8] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r12 = 2
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r12 = 3
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r12 = 4
            r7[r12] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r12 = 5
            r7[r12] = r9
            r9 = 11977(0x2ec9, float:1.6783E-41)
            r1.mo160131h(r9, r7)
            r1 = 8
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r1, r8)
        L_0x0b68:
            r9 = 3
            goto L_0x0baa
        L_0x0b6a:
            r3 = 0
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r11.f210559X
            if (r1 == 0) goto L_0x0b71
            r1.f212603x = r3
        L_0x0b71:
            android.widget.TextView r1 = r11.f210549M
            r7 = 8
            r1.setVisibility(r7)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r9]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r7[r3] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9 = 1
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9 = 2
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9 = 3
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r12 = 4
            r7[r12] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r12 = 5
            r7[r12] = r8
            r8 = 11977(0x2ec9, float:1.6783E-41)
            r1.mo160131h(r8, r7)
        L_0x0baa:
            java.lang.String r1 = "MicroMsg.WalletPwdDialog"
            java.lang.String r7 = "canUseBioMode: %s, use_pay_touch: %s, forcePwdMode：%s"
            java.lang.Object[] r8 = new java.lang.Object[r9]
            int r9 = r11.f210554S
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r3] = r9
            boolean r3 = r11.f210555T
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r9 = 1
            r8[r9] = r3
            boolean r3 = m84717e()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r9 = 2
            r8[r9] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r8)
            android.widget.TextView r1 = r11.f210549M
            com.tencent.mm.plugin.wallet_core.ui.k1 r3 = new com.tencent.mm.plugin.wallet_core.ui.k1
            r3.<init>(r11)
            r1.setOnClickListener(r3)
            goto L_0x058f
        L_0x0bdb:
            r11.mo99747o(r7, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r1 != 0) goto L_0x0bf0
            android.widget.TextView r1 = r11.f210537A
            r1.setText(r10)
            android.widget.TextView r1 = r11.f210537A
            r3 = 0
            r1.setVisibility(r3)
            goto L_0x0bf7
        L_0x0bf0:
            android.widget.TextView r1 = r11.f210537A
            r3 = 8
            r1.setVisibility(r3)
        L_0x0bf7:
            r11.mo99746n(r6)
            r1 = r39
            r11.f210577u = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            y43.l r3 = r2.f209543N
            if (r3 == 0) goto L_0x0c44
            y43.a r3 = r3.f232082u
            if (r3 == 0) goto L_0x0c44
            java.util.LinkedList<y43.c> r3 = r3.f191293d
            java.util.Iterator r3 = r3.iterator()
        L_0x0c11:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c44
            java.lang.Object r6 = r3.next()
            y43.c r6 = (y43.C66498c) r6
            java.lang.String r7 = r6.f191295d
            java.lang.String r8 = r4.field_bindSerial
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0c11
            java.util.LinkedList<y43.d> r3 = r6.f191296e
            java.util.Iterator r3 = r3.iterator()
        L_0x0c2d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0c44
            java.lang.Object r6 = r3.next()
            y43.d r6 = (y43.C66499d) r6
            int r7 = r6.f191298e
            if (r7 != 0) goto L_0x0c3e
            goto L_0x0c2d
        L_0x0c3e:
            java.lang.String r6 = r6.f191297d
            r1.add(r6)
            goto L_0x0c2d
        L_0x0c44:
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r3 = r11.f210571p
            if (r3 == 0) goto L_0x0c61
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x0c5a
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r3 = r11.f210571p
            r3.setWording(r1)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r1 = r11.f210571p
            r3 = 0
            r1.setVisibility(r3)
            goto L_0x0c61
        L_0x0c5a:
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r1 = r11.f210571p
            r3 = 8
            r1.setVisibility(r3)
        L_0x0c61:
            java.lang.String r1 = r5.f212592j
            if (r4 != 0) goto L_0x0c66
            goto L_0x0cc7
        L_0x0c66:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r3 = f210536Q0
            boolean r1 = r3.containsKey(r1)
            if (r1 == 0) goto L_0x0c6f
            goto L_0x0cc7
        L_0x0c6f:
            y43.l r1 = r2.f209543N
            if (r1 == 0) goto L_0x0cc7
            y43.a r1 = r1.f232082u
            if (r1 == 0) goto L_0x0cc7
            java.util.LinkedList<y43.c> r1 = r1.f191293d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0ca4
            y43.l r1 = r2.f209543N
            y43.a r1 = r1.f232082u
            java.util.LinkedList<y43.c> r1 = r1.f191293d
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L_0x0c8a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0ca5
            java.lang.Object r5 = r1.next()
            y43.c r5 = (y43.C66498c) r5
            java.lang.String r5 = r5.f191295d
            if (r5 == 0) goto L_0x0c8a
            java.lang.String r6 = r4.field_bindSerial
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0c8a
            r3 = 1
            goto L_0x0c8a
        L_0x0ca4:
            r3 = 0
        L_0x0ca5:
            if (r3 == 0) goto L_0x0ca8
            goto L_0x0cc7
        L_0x0ca8:
            y43.l r1 = r2.f209543N
            y43.a r1 = r1.f232082u
            java.util.LinkedList<y43.c> r1 = r1.f191293d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0cb5
            goto L_0x0cc5
        L_0x0cb5:
            y43.l r1 = r2.f209543N
            y43.a r1 = r1.f232082u
            y43.v r1 = r1.f191294e
            if (r1 == 0) goto L_0x0cc7
            java.util.LinkedList<y43.w> r1 = r1.f191306d
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0cc7
        L_0x0cc5:
            r1 = 1
            goto L_0x0cc8
        L_0x0cc7:
            r1 = 0
        L_0x0cc8:
            if (r1 == 0) goto L_0x0cdf
            r1 = 1
            r11.mo99743h(r1)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            r1 = 14530(0x38c2, float:2.0361E-41)
            r2.mo160131h(r1, r3)
            goto L_0x0ce3
        L_0x0cdf:
            r4 = 0
            r11.mo99743h(r4)
        L_0x0ce3:
            r11.show()
            android.view.Window r1 = r11.getWindow()
            com.tencent.p014mm.p136ui.C85875k4.m106177d0(r1)
            nj3.C76879j.m92730a(r0, r11)
            return r11
        L_0x0cf1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0cf1 }
            throw r0
        L_0x0cf4:
            r0 = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1.m84719t(android.content.Context, boolean, com.tencent.mm.plugin.wallet_core.model.Orders, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo, com.tencent.mm.plugin.wallet_core.model.Bankcard, com.tencent.mm.pluginsdk.wallet.PayInfo, java.lang.String, com.tencent.mm.plugin.wallet_core.ui.f1$f, android.view.View$OnClickListener, android.content.DialogInterface$OnCancelListener):com.tencent.mm.plugin.wallet_core.ui.f1");
    }

    /* renamed from: a */
    public void mo99670a() {
        this.f210583y0 = false;
        C75592q0.m90763K();
    }

    /* renamed from: c */
    public final void mo99739c() {
        if (this.f210553R == 1) {
            this.f210549M.setText(C0966R.string.f361560kt0);
        } else {
            this.f210549M.setText(C0966R.string.kss);
        }
        this.f210553R = 0;
        this.f210560Y = Util.currentTicks();
        View view = this.f210550N;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210540D.setVisibility(8);
        this.f210576t.setVisibility(0);
        if (!this.f210565g.isShown()) {
            View view3 = this.f210565g;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f210567i.setText(C0966R.string.l5w);
        m84718r(true);
        this.f210559X.f212603x = 0;
        C115669n.INSTANCE.mo160131h(11977, 1, 0, 0, 0, 0, 1);
        C75228t.m90243e0(29, 1);
        mo99741f();
    }

    /* renamed from: d */
    public void mo99740d() {
        m84718r(false);
        dismiss();
        C72388f fVar = this.f210577u;
        if (fVar != null) {
            fVar.mo96337a(this.f210576t.getText(), this.f210544H, this.f210545I);
        }
        if (this.f210560Y < 0) {
            Log.m105920e("MicroMsg.WalletPwdDialog", "hy: not set update mode time yet. abandon");
            return;
        }
        int i = this.f210553R;
        if (i == 0) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(686, 0, 1, false);
            nVar.idkeyStat(686, 1, Util.ticksToNow(this.f210560Y), false);
        } else if (i == 1) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(686, 2, 1, false);
            nVar2.idkeyStat(686, 3, Util.ticksToNow(this.f210560Y), false);
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WalletPwdDialog", "dismiss exception, e = " + e.getMessage());
        }
        mo99741f();
        this.f210548L.mo99890a();
    }

    /* renamed from: f */
    public final void mo99741f() {
        Log.m105924i("MicroMsg.WalletPwdDialog", "hy: send release FPManager");
        ((C78473a) C86709a0.m107533q(C78473a.class)).userCancel();
    }

    /* renamed from: g */
    public final void mo99742g() {
        C77290d.m93104b();
        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new OpenFingerPrintAuthEvent();
        OpenFingerPrintAuthEvent.C67748a aVar = openFingerPrintAuthEvent.f193784d;
        aVar.f193786a = this.f210559X.f212592j;
        aVar.f193787b = 1;
        aVar.f193788c = new C72381b(openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.publish();
    }

    /* renamed from: h */
    public void mo99743h(boolean z) {
        View findViewById = this.f210562d.findViewById(C0966R.C0970id.a5o);
        if (findViewById == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210581x0 = true;
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210581x0 = false;
    }

    /* renamed from: i */
    public void mo99744i(Bankcard bankcard) {
        if (bankcard == null) {
            Log.m105920e("MicroMsg.WalletPwdDialog", "setBankcardText bankcard == null");
        } else if (bankcard.mo99388n2()) {
            this.f210573q.setImageResource(C0966R.C0969drawable.cek);
        } else if (bankcard.mo99393s2()) {
            this.f210548L.mo99895f(bankcard, this.f210573q);
        } else if (bankcard.mo99392r2()) {
            this.f210573q.setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.honey_pay_bank_logo, 0.0f));
            if (!Util.isNullOrNil(bankcard.f209391D2)) {
                this.f210573q.setUseSdcardCache(true);
                this.f210573q.setImgSavedPath(C75556b.f221973a);
                this.f210573q.mo100288c(bankcard.f209391D2, 0, 0, C0966R.raw.honey_pay_bank_logo);
            }
        } else {
            this.f210548L.mo99894e(getContext(), bankcard, this.f210573q);
        }
    }

    /* renamed from: l */
    public void mo99745l(CharSequence charSequence, View.OnClickListener onClickListener, boolean z) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f210579w.setOnClickListener(onClickListener);
            this.f210570o.setText(charSequence);
            mo99753u(this.f210546J);
            if (!z) {
                View view = this.f210578v;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f210578v;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view5 = this.f210579w;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(8);
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210580x.setVisibility(8);
    }

    /* renamed from: n */
    public void mo99746n(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f210584z.setVisibility(0);
            this.f210584z.setText(str);
            return;
        }
        Log.m105924i("MicroMsg.WalletPwdDialog", "ChargeFee is null");
        this.f210584z.setVisibility(8);
    }

    /* renamed from: o */
    public void mo99747o(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f210574r.setVisibility(0);
            this.f210574r.setText(str2);
        } else {
            this.f210574r.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f210539C.setText(str);
            this.f210539C.setVisibility(0);
            return;
        }
        this.f210539C.setVisibility(8);
    }

    public void onActivityPause() {
        this.f210583y0 = true;
        if (!C75592q0.m90763K() && this.f210553R == 1) {
            mo99739c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f210562d);
        C23319f.m27817c().mo36811b();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            DialogInterface.OnCancelListener onCancelListener = this.f210542F;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
            C72386d dVar = this.f210541E;
            if (dVar != null) {
                ((C70005g0) dVar).mo96341a();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: q */
    public void mo99750q(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            this.f210568j.setVisibility(0);
            this.f210568j.setText(str);
            if (d == 0.0d) {
                this.f210546J = false;
                mo99753u(false);
                return;
            }
            mo99753u(this.f210546J);
            return;
        }
        this.f210568j.setVisibility(8);
        this.f210546J = true;
        mo99753u(true);
    }

    /* renamed from: s */
    public void mo99751s(DialogInterface.OnCancelListener onCancelListener) {
        ImageView imageView = this.f210563e;
        if (imageView != null) {
            this.f210542F = onCancelListener;
            imageView.setVisibility(0);
            this.f210563e.setOnClickListener(new C72385c(onCancelListener));
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    /* renamed from: u */
    public final void mo99753u(boolean z) {
        if (!z) {
            View view = this.f210579w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210580x.setVisibility(8);
            return;
        }
        View view3 = this.f210579w;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210580x.setVisibility(0);
    }

    /* renamed from: v */
    public void mo99754v(boolean z) {
        if (z) {
            View view = this.f210579w;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f210579w;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
