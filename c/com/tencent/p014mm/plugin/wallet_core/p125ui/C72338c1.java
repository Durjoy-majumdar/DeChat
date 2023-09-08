package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.autogen.events.ReleaseFingerPrintAuthEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayCustomUI;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.FavourLayout;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gr3.C76024a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import p196ln.C76705f;
import p281yz.C79173v;
import pv2.C77290d;
import qo3.C77390c0;
import te3.eh4;
import v53.C52766c0;
import vt1.C78473a;
import yq3.C79145c;
import yt3.C23319f;
import zi3.C79335b;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1 */
public class C72338c1 extends C77390c0 implements C72404n {

    /* renamed from: P */
    public static final /* synthetic */ int f210352P = 0;

    /* renamed from: A */
    public TextView f210353A;

    /* renamed from: B */
    public View f210354B;

    /* renamed from: C */
    public TextView f210355C;

    /* renamed from: D */
    public ImageView f210356D;

    /* renamed from: E */
    public int f210357E = 0;

    /* renamed from: F */
    public boolean f210358F = false;

    /* renamed from: G */
    public int f210359G = 0;

    /* renamed from: H */
    public int f210360H = 0;

    /* renamed from: I */
    public Animation f210361I = null;

    /* renamed from: J */
    public long f210362J = -1;

    /* renamed from: K */
    public int f210363K = 0;

    /* renamed from: L */
    public String f210364L = "";

    /* renamed from: M */
    public int f210365M = 0;

    /* renamed from: N */
    public boolean f210366N = false;

    /* renamed from: d */
    public View f210367d;

    /* renamed from: e */
    public Button f210368e;

    /* renamed from: f */
    public ImageView f210369f;

    /* renamed from: g */
    public MyKeyboardWindow f210370g;

    /* renamed from: h */
    public View f210371h;

    /* renamed from: i */
    public TextView f210372i;

    /* renamed from: j */
    public TextView f210373j;

    /* renamed from: n */
    public TextView f210374n;

    /* renamed from: o */
    public FavourLayout f210375o;

    /* renamed from: p */
    public ImageView f210376p;

    /* renamed from: q */
    public EditHintPasswdView f210377q;

    /* renamed from: r */
    public C72345d f210378r;

    /* renamed from: s */
    public View f210379s;

    /* renamed from: t */
    public View f210380t;

    /* renamed from: u */
    public TextView f210381u;

    /* renamed from: v */
    public View f210382v;

    /* renamed from: w */
    public C72344c f210383w;

    /* renamed from: x */
    public DialogInterface.OnClickListener f210384x;

    /* renamed from: y */
    public DialogInterface.OnCancelListener f210385y;

    /* renamed from: z */
    public BankcardLogoHelper f210386z = new BankcardLogoHelper();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$a */
    public class C72339a implements View.OnClickListener {
        public C72339a() {
        }

        public void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C72338c1 c1Var = C72338c1.this;
            int i2 = c1Var.f210357E;
            if (i2 == 0) {
                c1Var.f210353A.setText(c1Var.getContext().getString(C0966R.string.l5z));
                c1Var.f210357E = 1;
                c1Var.f210362J = Util.currentTicks();
                View view2 = c1Var.f210354B;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c1Var.f210356D.setVisibility(0);
                c1Var.f210355C.setVisibility(8);
                c1Var.f210377q.setVisibility(8);
                View view4 = c1Var.f210371h;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c1Var.f210373j.setText(C0966R.string.l5q);
                C72338c1.m84659h(false);
                c1Var.f210363K = 1;
                C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 0, 0, 2);
                i = 1;
                C75228t.m90243e0(9, 1);
            } else {
                i = 1;
                if (i2 == 1) {
                    c1Var.mo99671c();
                }
            }
            C72338c1 c1Var2 = C72338c1.this;
            if (c1Var2.f210357E == i) {
                c1Var2.mo99673f();
                C72338c1 c1Var3 = C72338c1.this;
                Object[] objArr = new Object[i];
                objArr[0] = Boolean.valueOf(c1Var3.f210366N ^ i);
                Log.m105925i("MicroMsg.WalletPwdCustomDialog", "hy: is screen on: %b", objArr);
                if (c1Var3.f210366N ^ i) {
                    C72338c1.this.mo99674g();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$b */
    public class C72340b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ OpenFingerPrintAuthEvent f210388d;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$b$a */
        public class C72341a implements Animation.AnimationListener {

            /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$b$a$a */
            public class C72342a implements Runnable {
                public C72342a() {
                }

                public void run() {
                    C72338c1.this.f210355C.setVisibility(0);
                }
            }

            /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$b$a$b */
            public class C72343b implements Runnable {
                public C72343b() {
                }

                public void run() {
                    C72338c1.this.f210355C.setVisibility(8);
                    C72338c1.this.f210356D.setVisibility(0);
                }
            }

            public C72341a() {
            }

            public void onAnimationEnd(Animation animation) {
                Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: on flash end");
                MMHandlerThread.postToMainThread(new C72343b());
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: on flash start");
                MMHandlerThread.postToMainThread(new C72342a());
            }
        }

        public C72340b(OpenFingerPrintAuthEvent openFingerPrintAuthEvent) {
            this.f210388d = openFingerPrintAuthEvent;
        }

        public void run() {
            Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback");
            OpenFingerPrintAuthEvent.C67749b bVar = this.f210388d.f193785e;
            if (bVar == null) {
                C72338c1.this.f210363K = 0;
                Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, result == null");
                return;
            }
            int i = bVar.f193789a;
            Log.m105927v("MicroMsg.WalletPwdCustomDialog", "alvinluo errCode: %d, errMsg: %s", Integer.valueOf(i), bVar.f193790b);
            if (i == 0) {
                Log.m105925i("MicroMsg.WalletPwdCustomDialog", "hy: payInfo soterAuthReq: %s", bVar.f193794f);
                C72338c1 c1Var = C72338c1.this;
                c1Var.f210363K = 1;
                c1Var.f210364L = bVar.f193794f;
                try {
                    JSONObject jSONObject = new JSONObject(C72338c1.this.f210364L);
                    jSONObject.put("soter_type", "1");
                    C72338c1.this.f210364L = jSONObject.toString();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletPwdCustomDialog", e, "", new Object[0]);
                }
                C72338c1 c1Var2 = C72338c1.this;
                c1Var2.f210365M++;
                c1Var2.f210355C.setText("");
                C72338c1.this.mo99672d();
                C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 1, 0, 2);
                C77290d.m93108f(0);
                return;
            }
            Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
            C72338c1 c1Var3 = C72338c1.this;
            c1Var3.f210363K = 0;
            c1Var3.f210364L = "";
            View view = c1Var3.f210354B;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C72338c1 c1Var4 = C72338c1.this;
            c1Var4.f210355C.setTextColor(c1Var4.getContext().getResources().getColor(C0966R.color.a_0));
            C72338c1.this.f210355C.setText(C0966R.string.ksy);
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            C72338c1 c1Var5 = C72338c1.this;
            int i2 = currentTimeMillis - c1Var5.f210360H;
            if (i2 > 1) {
                c1Var5.f210360H = currentTimeMillis;
                c1Var5.f210359G++;
                c1Var5.f210365M++;
            }
            C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 1, 0, 2);
            boolean z = i == 2 || i == 10308;
            boolean z2 = bVar.f193795g == 2;
            Log.m105927v("MicroMsg.WalletPwdCustomDialog", "alvinluo shouldDirectlyFail: %b, mIdentifyFail: %d, errCode: %d, isSoter: %b", Boolean.valueOf(z), Integer.valueOf(C72338c1.this.f210359G), Integer.valueOf(i), Boolean.valueOf(z2));
            if ((z2 || (C72338c1.this.f210359G < 3 && i2 > 1)) && !z) {
                Log.m105926v("MicroMsg.WalletPwdCustomDialog", "alvinluo fingerprint pay");
                C72338c1 c1Var6 = C72338c1.this;
                if (c1Var6.f210361I == null) {
                    c1Var6.f210361I = C79335b.m96035a(c1Var6.getContext());
                }
                C72338c1.this.f210356D.setVisibility(8);
                C72338c1.this.f210355C.setVisibility(4);
                C72338c1.this.f210361I.reset();
                C72338c1.this.f210361I.setAnimationListener(new C72341a());
                C72338c1 c1Var7 = C72338c1.this;
                c1Var7.f210355C.startAnimation(c1Var7.f210361I);
                C77290d.m93108f(1);
            } else if (C72338c1.this.f210359G >= 3 || z) {
                Log.m105926v("MicroMsg.WalletPwdCustomDialog", "alvinluo change to pwd pay");
                C72338c1.this.mo99673f();
                C72338c1 c1Var8 = C72338c1.this;
                c1Var8.f210357E = 0;
                c1Var8.f210362J = Util.currentTicks();
                C72338c1.this.f210353A.setVisibility(8);
                View view3 = C72338c1.this.f210354B;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C72338c1.this.f210355C.setVisibility(0);
                C72338c1.this.f210355C.setText(C0966R.string.ksz);
                C72338c1 c1Var9 = C72338c1.this;
                c1Var9.f210355C.setTextColor(c1Var9.getContext().getResources().getColor(C0966R.color.ajw));
                C72338c1.this.f210373j.setText(C0966R.string.l5w);
                C72338c1.this.f210377q.setVisibility(0);
                if (!C72338c1.this.f210371h.isShown()) {
                    View view5 = C72338c1.this.f210371h;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C77290d.m93108f(2);
                C72338c1.m84659h(true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$c */
    public interface C72344c {
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c1$d */
    public interface C72345d {
    }

    public C72338c1(Context context, int i) {
        super(context, C0966R.style.a6_);
        Log.m105926v("MicroMsg.WalletPwdCustomDialog", "alvinluo WalletPwdDialog initView");
        View inflate = View.inflate(context, C0966R.C0971layout.cez, (ViewGroup) null);
        this.f210367d = inflate;
        this.f210368e = (Button) inflate.findViewById(C0966R.C0970id.guw);
        this.f210369f = (ImageView) this.f210367d.findViewById(C0966R.C0970id.lj5);
        this.f210370g = (MyKeyboardWindow) this.f210367d.findViewById(C0966R.C0970id.f359361kh3);
        this.f210371h = this.f210367d.findViewById(C0966R.C0970id.f359359kh1);
        this.f210372i = (TextView) this.f210367d.findViewById(C0966R.C0970id.br8);
        this.f210373j = (TextView) this.f210367d.findViewById(C0966R.C0970id.ljb);
        this.f210374n = (TextView) this.f210367d.findViewById(C0966R.C0970id.cy4);
        ((TextView) this.f210367d.findViewById(C0966R.C0970id.hox)).getPaint().setFlags(16);
        TextView textView = (TextView) this.f210367d.findViewById(C0966R.C0970id.a7c);
        this.f210375o = (FavourLayout) this.f210367d.findViewById(C0966R.C0970id.cxz);
        CdnImageView cdnImageView = (CdnImageView) this.f210367d.findViewById(C0966R.C0970id.f357502a71);
        this.f210379s = this.f210367d.findViewById(C0966R.C0970id.cxq);
        TextView textView2 = (TextView) this.f210367d.findViewById(C0966R.C0970id.gzg);
        this.f210376p = (ImageView) this.f210367d.findViewById(C0966R.C0970id.b98);
        this.f210380t = this.f210367d.findViewById(C0966R.C0970id.a6z);
        TextView textView3 = (TextView) this.f210367d.findViewById(C0966R.C0970id.jcc);
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f210376p, C75228t.m90272u());
        this.f210377q = (EditHintPasswdView) this.f210367d.findViewById(C0966R.C0970id.f7k);
        ImageView imageView = (ImageView) this.f210367d.findViewById(C0966R.C0970id.etk);
        this.f210353A = (TextView) this.f210367d.findViewById(C0966R.C0970id.f359559lj0);
        this.f210354B = this.f210367d.findViewById(C0966R.C0970id.e9a);
        this.f210355C = (TextView) this.f210367d.findViewById(C0966R.C0970id.e9d);
        this.f210356D = (ImageView) this.f210367d.findViewById(C0966R.C0970id.e9_);
        this.f210381u = (TextView) this.f210367d.findViewById(C0966R.C0970id.azo);
        TextView textView4 = (TextView) this.f210367d.findViewById(C0966R.C0970id.ic8);
        this.f210382v = this.f210367d.findViewById(C0966R.C0970id.cxa);
        TextView textView5 = (TextView) this.f210367d.findViewById(C0966R.C0970id.cxv);
        this.f210375o.setVisibility(8);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        if (C75228t.m90212E()) {
            getWindow().addFlags(8192);
        }
        this.f210368e.setEnabled(false);
        this.f210368e.setTextColor(context.getResources().getColorStateList(C0966R.color.aiy));
        C76024a.m91321b(this.f210377q);
        this.f210377q.setOnInputValidListener(new C72480z0(this));
        this.f210377q.requestFocus();
        TextView textView6 = (TextView) this.f210367d.findViewById(C0966R.C0970id.ljb);
        if (textView6 != null) {
            textView6.setText(C75592q0.m90763K() ? context.getString(C0966R.string.l5x) : context.getString(C0966R.string.l5w));
        }
        EditText editText = (EditText) this.f210367d.findViewById(C0966R.C0970id.lg_);
        C75228t.m90251i0(editText);
        this.f210370g.setInputEditText(editText);
        C79145c cVar = new C79145c();
        this.f210370g.setSecureAccessibility(cVar);
        editText.setAccessibilityDelegate(cVar);
        editText.setOnClickListener(new C5789a1(this));
        this.f210367d.findViewById(C0966R.C0970id.kh4).setOnClickListener(new C5790b1(this));
        mo99675i();
    }

    /* renamed from: e */
    public static boolean m84658e() {
        C86709a0.m107528h();
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, Boolean.FALSE);
        if (f != null) {
            return ((Boolean) f).booleanValue();
        }
        return false;
    }

    /* renamed from: h */
    public static void m84659h(boolean z) {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo99670a() {
        this.f210366N = false;
        C75592q0.m90763K();
    }

    /* renamed from: c */
    public final void mo99671c() {
        this.f210353A.setText(getContext().getString(C0966R.string.f361560kt0));
        this.f210357E = 0;
        this.f210362J = Util.currentTicks();
        View view = this.f210354B;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210377q.setVisibility(0);
        if (!this.f210371h.isShown()) {
            View view3 = this.f210371h;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f210373j.setText(C0966R.string.l5w);
        m84659h(true);
        this.f210363K = 0;
        this.f210364L = "";
        C115669n.INSTANCE.mo160131h(11977, 1, 0, 0, 0, 0, 1);
        C75228t.m90243e0(29, 1);
        mo99673f();
    }

    /* renamed from: d */
    public void mo99672d() {
        m84659h(false);
        DialogInterface.OnClickListener onClickListener = this.f210384x;
        if (onClickListener != null) {
            onClickListener.onClick(this, 0);
        }
        dismiss();
        if (this.f210378r != null) {
            Log.m105925i("MicroMsg.WalletPwdCustomDialog", "doOk use_touch: %s soterAuthReq: %s ", Integer.valueOf(this.f210363K), this.f210364L);
            C72345d dVar = this.f210378r;
            String text = this.f210377q.getText();
            int i = this.f210363K == 1 ? 1 : 0;
            String str = this.f210364L;
            WalletPayCustomUI.C71909a aVar = (WalletPayCustomUI.C71909a) dVar;
            aVar.getClass();
            eh4 eh4 = WalletPayCustomUI.this.f208585d;
            WalletPayCustomUI.this.doSceneProgress(new C52766c0(text, eh4.f132933g, eh4.f132930d, eh4.f132931e, eh4.f132932f, eh4.f132934h, i, str, ""), true);
        }
        if (this.f210362J < 0) {
            Log.m105920e("MicroMsg.WalletPwdCustomDialog", "hy: not set update mode time yet. abandon");
            return;
        }
        int i2 = this.f210357E;
        if (i2 == 0) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(686, 0, 1, false);
            nVar.idkeyStat(686, 1, Util.ticksToNow(this.f210362J), false);
        } else if (i2 == 1) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(686, 2, 1, false);
            nVar2.idkeyStat(686, 3, Util.ticksToNow(this.f210362J), false);
        }
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WalletPwdCustomDialog", "dismiss exception, e = " + e.getMessage());
        }
        mo99673f();
        this.f210386z.mo99890a();
    }

    /* renamed from: f */
    public final void mo99673f() {
        Log.m105924i("MicroMsg.WalletPwdCustomDialog", "hy: send release FPManager");
        new ReleaseFingerPrintAuthEvent().publish();
    }

    /* renamed from: g */
    public final void mo99674g() {
        Log.m105925i("MicroMsg.WalletPwdCustomDialog", "reqFingerPrintAuth %s", Util.getStack().toString());
        C77290d.m93104b();
        OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new OpenFingerPrintAuthEvent();
        OpenFingerPrintAuthEvent.C67748a aVar = openFingerPrintAuthEvent.f193784d;
        aVar.f193786a = null;
        aVar.f193787b = 1;
        aVar.f193788c = new C72340b(openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.asyncPublish(Looper.getMainLooper());
    }

    /* renamed from: i */
    public final void mo99675i() {
        Log.m105926v("MicroMsg.WalletPwdCustomDialog", "alvinluo updateFingerprintMode");
        this.f210359G = 0;
        this.f210353A.setVisibility(8);
        View view = this.f210354B;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210362J = Util.currentTicks();
        C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
        C78473a aVar2 = (C78473a) C86709a0.m107533q(C78473a.class);
        Log.m105925i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", Boolean.valueOf((Ex0 == null || !aVar2.mo107880J3()) ? true : aVar2.mo107914qV()));
        this.f210363K = 0;
        this.f210364L = "";
        boolean z = aVar2 != null && aVar2.mo107921ys() && !aVar2.mo107884d6();
        Log.m105927v("MicroMsg.WalletPwdCustomDialog", "alvinluo isDeviceSupportFp: %b", Boolean.valueOf(z));
        boolean z2 = aVar2 != null && aVar2.mo107880J3();
        if (z2 && z && this.f210358F && !m84658e()) {
            this.f210353A.setVisibility(0);
            this.f210353A.setText(getContext().getString(C0966R.string.l5z));
            this.f210357E = 1;
            View view2 = this.f210354B;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210356D.setVisibility(0);
            this.f210377q.setVisibility(8);
            View view4 = this.f210371h;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210373j.setText(C0966R.string.l5q);
            this.f210363K = 1;
            mo99674g();
            C115669n.INSTANCE.mo160131h(11977, 1, 1, 0, 0, 0, 0);
        } else if (!z2 || !z || !this.f210358F || !m84658e()) {
            this.f210363K = 0;
            this.f210364L = "";
            this.f210353A.setVisibility(8);
            C115669n.INSTANCE.mo160131h(11977, 0, 0, 0, 0, 0, 0);
        } else {
            this.f210353A.setText(getContext().getString(C0966R.string.f361560kt0));
            this.f210353A.setVisibility(0);
            this.f210357E = 0;
            View view6 = this.f210354B;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210377q.setVisibility(0);
            if (!this.f210371h.isShown()) {
                View view8 = this.f210371h;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(0);
                View view9 = view8;
                C117292a.m165358d(view9, aVar6.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f210373j.setText(C0966R.string.l5w);
            this.f210363K = 0;
            this.f210364L = "";
            C115669n.INSTANCE.mo160131h(11977, 1, 0, 0, 0, 0, 0);
            C75228t.m90243e0(8, 1);
        }
        Log.m105924i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + z2 + ",  isDeviceSupport:" + z + ", use_pay_touch:" + this.f210358F + ", isForcePwdMode:" + m84658e());
        this.f210353A.setOnClickListener(new C72339a());
    }

    public void onActivityPause() {
        this.f210366N = true;
        if (!C75592q0.m90763K() && this.f210357E == 1) {
            mo99671c();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f210367d);
        C23319f.m27817c().mo36811b();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            DialogInterface.OnCancelListener onCancelListener = this.f210385y;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
            C72344c cVar = this.f210383w;
            if (cVar != null) {
                WalletPayCustomUI.this.finish();
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }
}
