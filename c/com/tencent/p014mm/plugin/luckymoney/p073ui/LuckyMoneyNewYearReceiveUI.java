package com.tencent.p014mm.plugin.luckymoney.p073ui;

import a63.C67008a;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69203d1;
import com.tencent.p014mm.plugin.luckymoney.model.C69210e2;
import com.tencent.p014mm.plugin.luckymoney.model.C69237j2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyAutoScrollView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72505q;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p008bq.C39833l0;
import p008bq.C67303a1;
import p196ln.C76705f;
import qo3.C89779i0;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI */
public class LuckyMoneyNewYearReceiveUI extends LuckyMoneyBaseUI {

    /* renamed from: Q */
    public static final /* synthetic */ int f200060Q = 0;

    /* renamed from: A */
    public ImageView f200061A;

    /* renamed from: B */
    public ImageView f200062B;

    /* renamed from: C */
    public MMAnimateView f200063C;

    /* renamed from: D */
    public ImageView f200064D;

    /* renamed from: E */
    public View f200065E;

    /* renamed from: F */
    public BaseEmojiView f200066F;

    /* renamed from: G */
    public int f200067G = 0;

    /* renamed from: H */
    public String f200068H;

    /* renamed from: I */
    public String f200069I = "";

    /* renamed from: J */
    public C72963f4 f200070J;

    /* renamed from: K */
    public int f200071K;

    /* renamed from: L */
    public boolean f200072L;

    /* renamed from: M */
    public IEmojiInfo f200073M;

    /* renamed from: N */
    public String f200074N;

    /* renamed from: P */
    public C39833l0.C39834a f200075P;

    /* renamed from: g */
    public String f200076g;

    /* renamed from: h */
    public View f200077h;

    /* renamed from: i */
    public LuckyMoneyAutoScrollView f200078i;

    /* renamed from: j */
    public TextView f200079j;

    /* renamed from: n */
    public TextView f200080n;

    /* renamed from: o */
    public ImageView f200081o;

    /* renamed from: p */
    public TextView f200082p;

    /* renamed from: q */
    public LinearLayout f200083q;

    /* renamed from: r */
    public TextView f200084r;

    /* renamed from: s */
    public ImageView f200085s;

    /* renamed from: t */
    public LinearLayout f200086t;

    /* renamed from: u */
    public LinearLayout f200087u;

    /* renamed from: v */
    public MMAnimateView f200088v;

    /* renamed from: w */
    public TextView f200089w;

    /* renamed from: x */
    public LinearLayout f200090x;

    /* renamed from: y */
    public TextView f200091y;

    /* renamed from: z */
    public C89779i0 f200092z = null;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$b */
    public class C42528b implements View.OnClickListener {
        public C42528b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "goto BalanceManagerUI!");
            C76331i.m91758b(LuckyMoneyNewYearReceiveUI.this.getContext(), 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$c */
    public class C42529c implements View.OnClickListener {
        public C42529c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = LuckyMoneyNewYearReceiveUI.this;
            int i = LuckyMoneyNewYearReceiveUI.f200060Q;
            luckyMoneyNewYearReceiveUI.mo95618M7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$d */
    public class C42530d implements View.OnClickListener {
        public C42530d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyNewYearReceiveUI.this.finish();
            C115669n.INSTANCE.mo160131h(13079, 6, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$e */
    public class C42531e implements View.OnClickListener {
        public C42531e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyNewYearReceiveUI.this.finish();
            C115669n.INSTANCE.mo160131h(13079, 6, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$i */
    public class C42532i implements View.OnClickListener {
        public C42532i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "goto detail!");
            Intent intent = new Intent();
            intent.putExtra("key_native_url", LuckyMoneyNewYearReceiveUI.this.f200074N);
            C88144b.m109791i(LuckyMoneyNewYearReceiveUI.this, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$a */
    public class C69426a implements C39833l0.C39834a {

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$a$a */
        public class C69427a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ IEmojiInfo f200094d;

            /* renamed from: e */
            public final /* synthetic */ boolean f200095e;

            public C69427a(IEmojiInfo iEmojiInfo, boolean z) {
                this.f200094d = iEmojiInfo;
                this.f200095e = z;
            }

            public void run() {
                IEmojiInfo iEmojiInfo;
                if (this.f200094d != null && (iEmojiInfo = LuckyMoneyNewYearReceiveUI.this.f200073M) != null && iEmojiInfo.getMd5().equals(this.f200094d.getMd5())) {
                    if (this.f200095e) {
                        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings success.");
                        LuckyMoneyNewYearReceiveUI.this.f200073M = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(LuckyMoneyNewYearReceiveUI.this.f200073M.getMd5());
                        LuckyMoneyNewYearReceiveUI.this.f200087u.setVisibility(8);
                        LuckyMoneyNewYearReceiveUI.this.f200066F.setVisibility(0);
                        LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = LuckyMoneyNewYearReceiveUI.this;
                        luckyMoneyNewYearReceiveUI.f200066F.setEmojiInfo(luckyMoneyNewYearReceiveUI.f200073M);
                        return;
                    }
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "somethings error.");
                    LuckyMoneyNewYearReceiveUI.this.f200087u.setVisibility(8);
                    LuckyMoneyNewYearReceiveUI.this.f200089w.setVisibility(0);
                }
            }
        }

        public C69426a() {
        }

        /* renamed from: a */
        public void mo62471a(boolean z, IEmojiInfo iEmojiInfo) {
            MMHandlerThread.postToMainThread(new C69427a(iEmojiInfo, z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$f */
    public class C69428f implements DialogInterface.OnCancelListener {
        public C69428f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = LuckyMoneyNewYearReceiveUI.this.f200092z;
            if (i0Var != null && i0Var.isShowing()) {
                LuckyMoneyNewYearReceiveUI.this.f200092z.dismiss();
            }
            LuckyMoneyNewYearReceiveUI.this.forceCancel();
            if (LuckyMoneyNewYearReceiveUI.this.getContentView().getVisibility() == 8 || LuckyMoneyNewYearReceiveUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "usr cancel, & visibility not visiable, so finish");
                LuckyMoneyNewYearReceiveUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$g */
    public class C69429g implements C67008a.C67019k {

        /* renamed from: a */
        public final /* synthetic */ C69237j2 f200098a;

        public C69429g(C69237j2 j2Var) {
            this.f200098a = j2Var;
        }

        public boolean run(int i, int i2, String str, boolean z) {
            int i3 = i;
            boolean z2 = z;
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showDisclaimerDialog resultCode=" + i3 + ";errCode=" + i2 + ";errMsg=" + str + ";hadAgree = " + z2);
            if (i3 == 1) {
                LuckyMoneyNewYearReceiveUI.this.finish();
            } else if (i3 == 2) {
                LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI = LuckyMoneyNewYearReceiveUI.this;
                C69237j2 j2Var = this.f200098a;
                int i4 = j2Var.f199242h;
                int i5 = j2Var.f199243i;
                String str2 = j2Var.f199244j;
                String str3 = j2Var.f199245n;
                String str4 = j2Var.f199237P;
                int i6 = LuckyMoneyNewYearReceiveUI.f200060Q;
                luckyMoneyNewYearReceiveUI.mo95616K7(i4, i5, str2, str3, str4);
            } else if (i3 == 0 && z2) {
                LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI2 = LuckyMoneyNewYearReceiveUI.this;
                C69237j2 j2Var2 = this.f200098a;
                int i7 = j2Var2.f199242h;
                int i8 = j2Var2.f199243i;
                String str5 = j2Var2.f199244j;
                String str6 = j2Var2.f199245n;
                String str7 = j2Var2.f199237P;
                int i9 = LuckyMoneyNewYearReceiveUI.f200060Q;
                luckyMoneyNewYearReceiveUI2.mo95616K7(i7, i8, str5, str6, str7);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$h */
    public class C69430h implements LuckyMoneyAutoScrollView.C69337a {

        /* renamed from: a */
        public final /* synthetic */ C69210e2 f200100a;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI$h$a */
        public class C69431a implements Animation.AnimationListener {
            public C69431a() {
            }

            public void onAnimationEnd(Animation animation) {
                if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                    C115591q5.m162472a(LuckyMoneyNewYearReceiveUI.this, C0966R.string.gek);
                }
                C69430h hVar = C69430h.this;
                RealnameGuideHelper realnameGuideHelper = hVar.f200100a.f199154p;
                if (realnameGuideHelper != null) {
                    realnameGuideHelper.mo99370a(LuckyMoneyNewYearReceiveUI.this, (Bundle) null, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null);
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                LuckyMoneyNewYearReceiveUI.this.f200080n.setVisibility(0);
            }
        }

        public C69430h(C69210e2 e2Var) {
            this.f200100a = e2Var;
        }

        /* renamed from: a */
        public void mo95516a() {
            LuckyMoneyNewYearReceiveUI.this.f200080n.setVisibility(4);
            C69242l1.m81616v(LuckyMoneyNewYearReceiveUI.this.getContext(), LuckyMoneyNewYearReceiveUI.this.f200080n, this.f200100a.f199149h.f198968h);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new C69431a());
            LuckyMoneyNewYearReceiveUI.this.f200080n.startAnimation(alphaAnimation);
        }
    }

    public LuckyMoneyNewYearReceiveUI() {
        new MMHandler();
        this.f200072L = false;
        this.f200075P = new C69426a();
    }

    /* renamed from: J7 */
    public final void mo95615J7(int i) {
        StringBuilder sb;
        Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() localReceiveStatus:%s newStatus:%s", Integer.valueOf(this.f200071K), Integer.valueOf(i));
        if (this.f200070J == null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() mEmojiInfo == null");
        } else if (!Util.isEqual(this.f200071K, i) && !Util.isEqual(this.f200071K, 2)) {
            try {
                StringBuilder sb4 = new StringBuilder(this.f200070J.getContent());
                StringBuilder sb5 = new StringBuilder();
                int indexOf = sb4.indexOf("<localreceivestatus>");
                if (indexOf <= 0 || indexOf >= sb4.length()) {
                    int indexOf2 = sb4.indexOf("<emoji>");
                    if (indexOf2 <= 0 || indexOf2 >= sb4.length()) {
                        int indexOf3 = sb4.indexOf("<wcpayinfo>");
                        sb5.append("<emoji><localreceivestatus>");
                        sb5.append(i);
                        sb5.append("</localreceivestatus></emoji>");
                        StringBuilder sb6 = new StringBuilder(sb4.substring(0, indexOf3));
                        String trim = sb4.substring(indexOf3).trim();
                        sb6.append(sb5);
                        sb6.append(trim);
                        sb = sb6;
                    } else {
                        sb5.append("<localreceivestatus>");
                        sb5.append(i);
                        sb5.append("</localreceivestatus>");
                        int i2 = indexOf2 + 7;
                        sb = new StringBuilder(sb4.substring(0, i2));
                        String trim2 = sb4.substring(i2).trim();
                        sb.append(sb5);
                        sb.append(trim2);
                    }
                } else {
                    sb = new StringBuilder(sb4.substring(0, indexOf + 20));
                    String substring = sb4.substring(indexOf + 21);
                    sb.append(i);
                    sb.append(substring);
                }
                this.f200070J.mo108732L2(sb.toString());
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f200070J.getMsgId(), this.f200070J);
                Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() success msgXml:%s", sb);
            } catch (Exception e) {
                Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUI", "dealMessageInfo() Exception:%s", e.getMessage());
            }
        }
    }

    /* renamed from: K7 */
    public final void mo95616K7(int i, int i2, String str, String str2, String str3) {
        C69210e2 e2Var = new C69210e2(i, i2, str, str2, C69242l1.m81601g(), C75592q0.m90783m(), getIntent().getStringExtra("key_username"), "v1.0", str3);
        doSceneProgress(e2Var, false);
    }

    /* renamed from: L7 */
    public final void mo95617L7(boolean z) {
        if (z) {
            this.f200090x.setVisibility(0);
            ((RelativeLayout.LayoutParams) this.f200090x.getLayoutParams()).addRule(3, C0966R.C0970id.gh7);
            this.f200091y.setText(getString(C0966R.string.giv));
            this.f200090x.setOnClickListener(new C42532i());
            return;
        }
        this.f200090x.setVisibility(0);
        this.f200090x.setOnClickListener(new C42528b());
        this.f200091y.setText(getString(C0966R.string.git));
    }

    /* renamed from: M7 */
    public final void mo95618M7() {
        Class cls = C39833l0.class;
        this.f200089w.setVisibility(8);
        IEmojiInfo r2 = ((C67303a1) C86312j.m106911c(C67303a1.class)).mo55768r2(this.f200069I);
        this.f200073M = r2;
        if (r2 == null) {
            Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "showExpression() mEmojiInfo == null ");
        } else if (C86013q1.m106451l(r2.mo62640K1()) > 0 || this.f200073M.mo62678k() || this.f200073M.mo62637I0()) {
            this.f200066F.setVisibility(0);
            this.f200066F.setEmojiInfo(this.f200073M);
        } else {
            this.f200066F.setVisibility(8);
            this.f200087u.setVisibility(0);
            this.f200088v.setImageResource(C0966R.raw.lucky_money_newyear_creat_loading);
            ((C39833l0) C86312j.m106911c(cls)).mo62465NG(this.f200075P);
            ((C39833l0) C86312j.m106911c(cls)).mo62467VJ(this.f200073M);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_4;
    }

    public void initView() {
        setActionbarColor(-839716110);
        this.f200077h = findViewById(C0966R.C0970id.gh8);
        this.f200078i = (LuckyMoneyAutoScrollView) findViewById(C0966R.C0970id.gh4);
        this.f200079j = (TextView) findViewById(C0966R.C0970id.gbt);
        this.f200080n = (TextView) findViewById(C0966R.C0970id.ghe);
        this.f200081o = (ImageView) findViewById(C0966R.C0970id.gh5);
        this.f200083q = (LinearLayout) findViewById(C0966R.C0970id.ghc);
        this.f200084r = (TextView) findViewById(C0966R.C0970id.gha);
        this.f200085s = (ImageView) findViewById(C0966R.C0970id.ghb);
        this.f200082p = (TextView) findViewById(C0966R.C0970id.ghd);
        this.f200086t = (LinearLayout) findViewById(C0966R.C0970id.gh_);
        this.f200063C = (MMAnimateView) findViewById(C0966R.C0970id.hrb);
        this.f200064D = (ImageView) findViewById(C0966R.C0970id.ggu);
        this.f200065E = findViewById(C0966R.C0970id.ggr);
        this.f200066F = (BaseEmojiView) findViewById(C0966R.C0970id.ggn);
        this.f200089w = (TextView) findViewById(C0966R.C0970id.ggz);
        this.f200087u = (LinearLayout) findViewById(C0966R.C0970id.ggw);
        this.f200088v = (MMAnimateView) findViewById(C0966R.C0970id.g3c);
        this.f200090x = (LinearLayout) findViewById(C0966R.C0970id.gcd);
        this.f200091y = (TextView) findViewById(C0966R.C0970id.gce);
        this.f200089w.setOnClickListener(new C42529c());
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f358688gh2);
        this.f200061A = imageView;
        imageView.setOnClickListener(new C42530d());
        ImageView imageView2 = (ImageView) findViewById(C0966R.C0970id.f358687gh1);
        this.f200062B = imageView2;
        imageView2.setOnClickListener(new C42531e());
        setContentViewVisibility(8);
        this.f200092z = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C69428f());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f200068H = getIntent().getStringExtra("key_username");
        this.f200069I = getIntent().getStringExtra("key_emoji_md5");
        this.f200070J = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(getIntent().getLongExtra("key_msgid", 0));
        this.f200071K = getIntent().getIntExtra("key_msg_newyear_localreceivestatus", 0);
        this.f200074N = getIntent().getStringExtra("key_native_url");
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "emojiMd5:" + this.f200069I);
        Uri parse = Uri.parse(Util.nullAsNil(this.f200074N));
        try {
            this.f200076g = parse.getQueryParameter("sendid");
        } catch (Exception e) {
            Log.m105925i("MicroMsg.LuckyMoneyNewYearReceiveUI", "onCreate() Exception:%s", e.getMessage());
        }
        initView();
        if (!Util.isNullOrNil(this.f200076g)) {
            doSceneProgress(new C69237j2(1, Util.getInt(parse.getQueryParameter("channelid"), 1), this.f200076g, this.f200074N, 1, "v1.0", ""), false);
            C89779i0 i0Var = this.f200092z;
            if (i0Var != null) {
                i0Var.show();
                return;
            }
            return;
        }
        finish();
        Log.m105928w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f200092z;
        if (i0Var != null && i0Var.isShowing()) {
            this.f200092z.dismiss();
        }
        ((C39833l0) C86312j.m106911c(C39833l0.class)).mo62465NG((C39833l0.C39834a) null);
    }

    public void onResume() {
        super.onResume();
        if (this.f200072L) {
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        C69237j2 j2Var;
        int i4;
        int i5;
        int i6 = i;
        int i7 = i2;
        C117747y yVar2 = yVar;
        Class cls = C76705f.class;
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd() errType:");
        sb.append(i6);
        sb.append(" errCode:");
        sb.append(i7);
        sb.append(" errMsg:");
        String str2 = str;
        sb.append(str2);
        sb.append(" netsceneType:");
        sb.append(yVar.getType());
        Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", sb.toString());
        if (yVar2 instanceof C69237j2) {
            if (i6 == 0 && i7 == 0) {
                C69237j2 j2Var2 = (C69237j2) yVar2;
                this.f200067G = j2Var2.f199233K;
                if (j2Var2.f199255x == 1) {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
                    if (j2Var2.f199250s != 4) {
                        this.f200086t.setVisibility(8);
                    }
                    C89779i0 i0Var = this.f200092z;
                    if (i0Var != null && i0Var.isShowing()) {
                        this.f200092z.dismiss();
                    }
                    if (j2Var2.f199250s != 5) {
                        String n = C75228t.m90260n(((double) j2Var2.f199249r) / 100.0d);
                        this.f200078i.setContentDescription(n);
                        this.f200078i.setFinalText(n);
                        this.f200078i.mo95512a();
                        C69242l1.m81616v(getContext(), this.f200080n, j2Var2.f199254w);
                        this.f200083q.setVisibility(8);
                        this.f200086t.setVisibility(0);
                        if (j2Var2.f199250s == 4) {
                            ((C76705f) C86312j.m106911c(cls)).mo106822J5(this.f200081o, this.f200068H);
                            mo95615J7(2);
                        } else {
                            this.f200081o.setVisibility(8);
                        }
                        this.f200082p.setText(j2Var2.f199252u);
                        this.f200082p.setTextSize(1, 16.0f);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f200086t.getLayoutParams();
                        layoutParams.bottomMargin = C76577a.m92151b(this, 82);
                        this.f200086t.setLayoutParams(layoutParams);
                        this.f200086t.invalidate();
                        this.f200063C.setImageResource(C0966R.raw.lucky_money_newyear_particle);
                    } else {
                        View findViewById = findViewById(C0966R.C0970id.gh6);
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setText(j2Var2.f199252u);
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setVisibility(0);
                        ((TextView) findViewById(C0966R.C0970id.gh7)).setTextSize(24.0f);
                        mo95617L7(true);
                        mo95615J7(1);
                    }
                    setContentViewVisibility(0);
                    C69242l1.m81613s(this.f200077h, (Animation.AnimationListener) null);
                    this.f200061A.setVisibility(0);
                    this.f200062B.setVisibility(8);
                    j2Var = j2Var2;
                    i4 = 1;
                    i3 = 5;
                } else {
                    Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
                    if (!TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
                        ((C76705f) C86312j.m106911c(cls)).mo106822J5(this.f200081o, getIntent().getStringExtra("key_username"));
                    } else if (!TextUtils.isEmpty(j2Var2.f199248q)) {
                        C69242l1.m81595a(this.f200081o, j2Var2.f199248q, j2Var2.f199257z);
                    }
                    this.f200082p.setTextSize(1, 16.0f);
                    AppCompatActivity context = getContext();
                    TextView textView = this.f200082p;
                    C69242l1.m81616v(context, textView, j2Var2.f199246o + getString(C0966R.string.gho));
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f200086t.getLayoutParams();
                    layoutParams2.bottomMargin = C76577a.m92151b(this, 30);
                    this.f200086t.setLayoutParams(layoutParams2);
                    this.f200086t.invalidate();
                    this.f200086t.setVisibility(0);
                    this.f200083q.setVisibility(8);
                    if (j2Var2.f199251t != 0 || (i5 = j2Var2.f199250s) == 4 || i5 == 5 || i5 == 1) {
                        j2Var = j2Var2;
                        i3 = 5;
                        C89779i0 i0Var2 = this.f200092z;
                        if (i0Var2 != null && i0Var2.isShowing()) {
                            this.f200092z.dismiss();
                        }
                        if (j2Var.f199250s != 5) {
                            String n2 = C75228t.m90260n(((double) j2Var.f199249r) / 100.0d);
                            this.f200078i.setContentDescription(n2);
                            this.f200078i.setFinalText(n2);
                            this.f200078i.mo95512a();
                            C69242l1.m81616v(getContext(), this.f200080n, j2Var.f199254w);
                            mo95615J7(2);
                            this.f200063C.setImageResource(C0966R.raw.lucky_money_newyear_particle);
                            mo95617L7(false);
                        } else {
                            this.f200090x.setVisibility(8);
                            View findViewById2 = findViewById(C0966R.C0970id.gh6);
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setText(j2Var.f199252u);
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setVisibility(0);
                            ((TextView) findViewById(C0966R.C0970id.gh7)).setTextSize(24.0f);
                            mo95615J7(1);
                        }
                        setContentViewVisibility(0);
                        C69242l1.m81613s(this.f200077h, (Animation.AnimationListener) null);
                    } else if ("0".equals(j2Var2.f199225C)) {
                        C69203d1 d1Var = this.f199660d;
                        String str3 = j2Var2.f199226D;
                        String str4 = j2Var2.f199227E;
                        String str5 = j2Var2.f199228F;
                        String str6 = j2Var2.f199229G;
                        C69429g gVar = new C69429g(j2Var2);
                        i3 = 5;
                        String str7 = str3;
                        String str8 = str4;
                        C69237j2 j2Var3 = j2Var2;
                        j2Var = j2Var3;
                        new C67008a().mo90976a(this, d1Var, str7, str8, str5, str6, gVar, true, 1005);
                    } else {
                        j2Var = j2Var2;
                        i3 = 5;
                        mo95616K7(j2Var.f199242h, j2Var.f199243i, j2Var.f199244j, j2Var.f199245n, j2Var.f199237P);
                    }
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f200083q.getLayoutParams();
                    layoutParams3.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.af6);
                    this.f200083q.setLayoutParams(layoutParams3);
                    this.f200083q.invalidate();
                    i4 = 1;
                    this.f200084r.setTextSize(1, 12.0f);
                    this.f200061A.setVisibility(8);
                    this.f200062B.setVisibility(0);
                }
                int i8 = j2Var.f199250s;
                boolean z = (i8 == i3 || i8 == i4) ? false : true;
                Log.m105924i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + j2Var.f199250s + ", isValidStatus is " + z);
                boolean z2 = Util.isEqual(this.f200067G, 1) && !Util.isNullOrNil(this.f200069I);
                if (!z2 || !z) {
                    View view3 = this.f200065E;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f200064D.setVisibility(0);
                } else {
                    View view5 = this.f200065E;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "updateView", "(Lcom/tencent/mm/plugin/luckymoney/model/NetSceneReceiveLuckyMoney;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f200064D.setVisibility(8);
                    mo95618M7();
                }
                if (!z2 || !z) {
                    this.f200080n.setTextSize(1, 21.0f);
                    this.f200079j.setTextSize(1, 18.0f);
                    this.f200078i.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357049af3), getResources().getDimensionPixelOffset(C0966R.dimen.aez));
                    this.f200078i.invalidate();
                    return true;
                }
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) this.f200080n.getLayoutParams();
                this.f200080n.setTextSize(1, 21.0f);
                this.f200079j.setTextSize(1, 15.0f);
                this.f200078i.mo95514c(getResources().getDimensionPixelOffset(C0966R.dimen.f357048af2), getResources().getDimensionPixelOffset(C0966R.dimen.aey));
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) this.f200078i.getLayoutParams();
                layoutParams5.topMargin = getResources().getDimensionPixelOffset(C0966R.dimen.ael);
                this.f200078i.setLayoutParams(layoutParams5);
                this.f200078i.invalidate();
                return true;
            }
            C89779i0 i0Var3 = this.f200092z;
            if (i0Var3 != null && i0Var3.isShowing()) {
                this.f200092z.dismiss();
            }
            return false;
        } else if (!(yVar2 instanceof C69210e2)) {
            return false;
        } else {
            C89779i0 i0Var4 = this.f200092z;
            if (i0Var4 != null && i0Var4.isShowing()) {
                this.f200092z.dismiss();
            }
            if (i6 == 0 && i7 == 0) {
                C69210e2 e2Var = (C69210e2) yVar2;
                if (C72506r.m84838d(e2Var.f199159u)) {
                    setContentViewVisibility(4);
                    C72506r rVar = new C72506r(this);
                    rVar.f210915a = true;
                    rVar.mo99912b(e2Var.f199159u, new C72505q(rVar));
                    return true;
                }
                int i9 = e2Var.f199155q;
                this.f200067G = i9;
                if (!Util.isEqual(i9, 1)) {
                    View view6 = this.f200065E;
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(8);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar5.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f200064D.setVisibility(0);
                }
                C69158a0 a0Var = e2Var.f199149h;
                this.f200084r.setText(a0Var.f198966f);
                String n3 = C75228t.m90260n(((double) e2Var.f199149h.f198974q) / 100.0d);
                this.f200078i.setContentDescription(n3);
                this.f200078i.setFinalText(n3);
                LuckyMoneyAutoScrollView luckyMoneyAutoScrollView = this.f200078i;
                luckyMoneyAutoScrollView.f199659y = new C69430h(e2Var);
                MMHandlerThread.postToMainThread(new C69572c(luckyMoneyAutoScrollView));
                if (a0Var.f198965e == 4 && !TextUtils.isEmpty(e2Var.f199149h.f198966f)) {
                    this.f200085s.setVisibility(8);
                }
                mo95617L7(false);
                setContentViewVisibility(0);
                C69242l1.m81613s(this.f200077h, (Animation.AnimationListener) null);
                mo95615J7(2);
                this.f200063C.setImageResource(C0966R.raw.lucky_money_newyear_particle);
                return true;
            } else if (i7 == 416) {
                C89779i0 i0Var5 = this.f200092z;
                if (i0Var5 != null && i0Var5.isShowing()) {
                    this.f200092z.dismiss();
                }
                this.f200072L = true;
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                return C69242l1.m81596b(this, i2, str, yVar, bundle, true, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 1004);
            } else {
                C76879j.m92713G(this, TextUtils.isEmpty(str) ? getString(C0966R.string.l_3) : str2, (String) null, false, new C42540r1(this));
                return true;
            }
        }
    }
}
