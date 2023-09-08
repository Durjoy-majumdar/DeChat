package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import b63.C67186g0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69245l2;
import com.tencent.p014mm.plugin.luckymoney.model.C69249n;
import com.tencent.p014mm.plugin.luckymoney.model.C69257p1;
import com.tencent.p014mm.plugin.luckymoney.model.C69259q1;
import com.tencent.p014mm.plugin.luckymoney.model.C69261r1;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.plugin.wallet_payu.pay.p893ui.WalletPayUPayUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C89779i0;
import te3.C77935gl2;
import vo3.C90852c;
import yq3.C79148e;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI */
public class LuckyMoneyBusiReceiveUI extends LuckyMoneyBaseUI {

    /* renamed from: J */
    public static final /* synthetic */ int f199714J = 0;

    /* renamed from: A */
    public C89779i0 f199715A = null;

    /* renamed from: B */
    public String f199716B = null;

    /* renamed from: C */
    public String f199717C = null;

    /* renamed from: D */
    public int f199718D;

    /* renamed from: E */
    public int f199719E = 0;

    /* renamed from: F */
    public int f199720F = 0;

    /* renamed from: G */
    public C69261r1 f199721G;

    /* renamed from: H */
    public RealnameGuideHelper f199722H;

    /* renamed from: I */
    public boolean f199723I = false;

    /* renamed from: g */
    public ImageView f199724g;

    /* renamed from: h */
    public TextView f199725h;

    /* renamed from: i */
    public TextView f199726i;

    /* renamed from: j */
    public TextView f199727j;

    /* renamed from: n */
    public Button f199728n;

    /* renamed from: o */
    public ImageView f199729o;

    /* renamed from: p */
    public ImageView f199730p;

    /* renamed from: q */
    public View f199731q;

    /* renamed from: r */
    public TextView f199732r;

    /* renamed from: s */
    public View f199733s;

    /* renamed from: t */
    public ImageView f199734t;

    /* renamed from: u */
    public TextView f199735u;

    /* renamed from: v */
    public View f199736v;

    /* renamed from: w */
    public TextView f199737w;

    /* renamed from: x */
    public Button f199738x;

    /* renamed from: y */
    public TextView f199739y;

    /* renamed from: z */
    public CheckBox f199740z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$a */
    public class C42523a implements DialogInterface.OnClickListener {
        public C42523a(LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$d */
    public class C42524d implements View.OnClickListener {
        public C42524d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
            bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = LuckyMoneyBusiReceiveUI.this;
            RealnameGuideHelper realnameGuideHelper = luckyMoneyBusiReceiveUI.f199722H;
            if (realnameGuideHelper == null) {
                luckyMoneyBusiReceiveUI.finish();
            } else if (!realnameGuideHelper.mo99371b(luckyMoneyBusiReceiveUI, bundle, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, true)) {
                LuckyMoneyBusiReceiveUI.this.finish();
            } else {
                LuckyMoneyBusiReceiveUI.this.f199722H = null;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$h */
    public class C42525h implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ View f115072a;

        public C42525h(LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI, View view) {
            this.f115072a = view;
        }

        public void onAnimationEnd(Animation animation) {
            View view = this.f115072a;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$6", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$j */
    public class C42526j implements View.OnClickListener {
        public C42526j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LuckyMoneyBusiReceiveUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$b */
    public class C69344b implements C79148e.C79149a {
        public C69344b(LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI) {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "re");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$c */
    public class C69345c implements DialogInterface.OnCancelListener {
        public C69345c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C89779i0 i0Var = LuckyMoneyBusiReceiveUI.this.f199715A;
            if (i0Var != null && i0Var.isShowing()) {
                LuckyMoneyBusiReceiveUI.this.f199715A.dismiss();
            }
            LuckyMoneyBusiReceiveUI.this.forceCancel();
            if (LuckyMoneyBusiReceiveUI.this.getContentView().getVisibility() == 8 || LuckyMoneyBusiReceiveUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "user cancel & finish");
                LuckyMoneyBusiReceiveUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$e */
    public class C69346e implements View.OnClickListener {
        public C69346e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(11701, 10, 0, 0, 0, 2);
            if (LuckyMoneyBusiReceiveUI.this.f199740z.isChecked()) {
                nVar.mo160131h(13050, Integer.valueOf(LuckyMoneyBusiReceiveUI.this.f199720F), 2, LuckyMoneyBusiReceiveUI.this.f199721G.f199326w);
            } else {
                nVar.mo160131h(13050, Integer.valueOf(LuckyMoneyBusiReceiveUI.this.f199720F), 2, "");
            }
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = LuckyMoneyBusiReceiveUI.this;
            String stringExtra = luckyMoneyBusiReceiveUI.getIntent().getStringExtra("key_username");
            C69261r1 r1Var = luckyMoneyBusiReceiveUI.f199721G;
            luckyMoneyBusiReceiveUI.doSceneProgress(new C69259q1(r1Var.f199315i, r1Var.f199314h, r1Var.f199316j, luckyMoneyBusiReceiveUI.getIntent().getStringExtra("packageExt"), stringExtra), false);
            luckyMoneyBusiReceiveUI.f199728n.setVisibility(8);
            C69242l1.m81617w(luckyMoneyBusiReceiveUI.f199729o, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$f */
    public class C69347f implements View.OnClickListener {
        public C69347f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(11701, 11, 0, 0, 0, 4);
            Intent intent = new Intent();
            intent.setClass(LuckyMoneyBusiReceiveUI.this.getContext(), LuckyMoneyBusiDetailUI.class);
            intent.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.this.f199716B);
            intent.putExtra("key_sendid", LuckyMoneyBusiReceiveUI.this.f199721G.f199315i);
            intent.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.this.f199720F);
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = LuckyMoneyBusiReceiveUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI2 = luckyMoneyBusiReceiveUI;
            C117292a.m165358d(luckyMoneyBusiReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyBusiReceiveUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyBusiReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyBusiReceiveUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$g */
    public class C69348g implements C72506r.C72510d {
        public C69348g() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "click intercept button");
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = LuckyMoneyBusiReceiveUI.this;
            int i = LuckyMoneyBusiReceiveUI.f199714J;
            luckyMoneyBusiReceiveUI.mo95537J7(-1, "");
            LuckyMoneyBusiReceiveUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$i */
    public class C69349i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C69259q1 f199745d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$i$a */
        public class C69350a implements View.OnClickListener {
            public C69350a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C115669n.INSTANCE.mo160131h(11701, 12, 0, 0, 0, 2);
                C69242l1.m81604j(LuckyMoneyBusiReceiveUI.this, 1, false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$i$b */
        public class C69351b implements Animation.AnimationListener {
            public C69351b() {
            }

            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                View view = LuckyMoneyBusiReceiveUI.this.f199733s;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7$2", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C69349i(C69259q1 q1Var) {
            this.f199745d = q1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = LuckyMoneyBusiReceiveUI.this.f199733s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            LuckyMoneyBusiReceiveUI.this.f199739y.setVisibility(8);
            View view4 = LuckyMoneyBusiReceiveUI.this.f199731q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69249n nVar = this.f199745d.f199305r;
            LuckyMoneyBusiReceiveUI.this.f199738x.setText((nVar == null || Util.isNullOrNil(nVar.f199279f)) ? LuckyMoneyBusiReceiveUI.this.getString(C0966R.string.gjc) : this.f199745d.f199305r.f199279f);
            LuckyMoneyBusiReceiveUI.this.f199737w.setText(this.f199745d.f199302o);
            View view6 = LuckyMoneyBusiReceiveUI.this.f199736v;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            LuckyMoneyBusiReceiveUI.this.f199738x.setOnClickListener(new C69350a());
            C69242l1.m81613s(LuckyMoneyBusiReceiveUI.this.f199733s, new C69351b());
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUI$k */
    public class C69352k implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C69259q1 f199749d;

        public C69352k(C69259q1 q1Var) {
            this.f199749d = q1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.setClass(LuckyMoneyBusiReceiveUI.this.getContext(), LuckyMoneyBusiDetailUI.class);
            RealnameGuideHelper realnameGuideHelper = this.f199749d.f199308u;
            if (realnameGuideHelper != null) {
                intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
            }
            intent.putExtra("key_native_url", LuckyMoneyBusiReceiveUI.this.f199716B);
            intent.putExtra("key_sendid", this.f199749d.f199298h);
            intent.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUI.this.f199720F);
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI = LuckyMoneyBusiReceiveUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyBusiReceiveUI luckyMoneyBusiReceiveUI2 = luckyMoneyBusiReceiveUI;
            C117292a.m165358d(luckyMoneyBusiReceiveUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyBusiReceiveUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyBusiReceiveUI2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyBusiReceiveUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: J7 */
    public final void mo95537J7(int i, String str) {
        Log.m105925i("MicroMsg.LuckyMoneyBusiReceiveUI", "markResult resultCode:%d errMsg:%s", Integer.valueOf(i), str);
        Intent intent = new Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i, intent);
    }

    public void finish() {
        super.finish();
        if (this.f199723I) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "finish from normalBusiLuckyMoney");
            overridePendingTransition(C0966R.C0968anim.f2518f8, 0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b9e;
    }

    public void init() {
        this.f199715A = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C69345c());
        int i = this.f199718D;
        if (i == 3) {
            doSceneProgress(new C69257p1(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3), false);
        } else if (i == 4) {
            doSceneProgress(new C69257p1(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), 4, getIntent().getStringExtra("key_wxapi_sign"), getIntent().getStringExtra("key_wxapi_package_name")), false);
        } else {
            try {
                this.f199717C = Uri.parse(Util.nullAsNil(this.f199716B)).getQueryParameter("sendid");
            } catch (Exception unused) {
            }
            if (!Util.isNullOrNil(this.f199717C)) {
                doSceneProgress(new C69261r1(this.f199717C, this.f199716B, this.f199718D, getIntent().getStringExtra("packageExt")), false);
            } else {
                finish();
                Log.m105928w("MicroMsg.LuckyMoneyBusiReceiveUI", "sendid null & finish");
            }
        }
        mo95537J7(0, "");
    }

    public void initView() {
        this.f199733s = findViewById(C0966R.C0970id.gby);
        this.f199724g = (ImageView) findViewById(C0966R.C0970id.f358662gc2);
        this.f199725h = (TextView) findViewById(C0966R.C0970id.f358663gc3);
        this.f199727j = (TextView) findViewById(C0966R.C0970id.gbz);
        this.f199726i = (TextView) findViewById(C0966R.C0970id.gc7);
        this.f199728n = (Button) findViewById(C0966R.C0970id.f358660gc0);
        this.f199729o = (ImageView) findViewById(C0966R.C0970id.gir);
        this.f199730p = (ImageView) findViewById(C0966R.C0970id.gc_);
        this.f199731q = findViewById(C0966R.C0970id.gbx);
        this.f199732r = (TextView) findViewById(C0966R.C0970id.gbw);
        this.f199734t = (ImageView) findViewById(C0966R.C0970id.gca);
        this.f199735u = (TextView) findViewById(C0966R.C0970id.gc9);
        this.f199736v = findViewById(C0966R.C0970id.gc4);
        this.f199737w = (TextView) findViewById(C0966R.C0970id.gc5);
        this.f199738x = (Button) findViewById(C0966R.C0970id.gcb);
        this.f199739y = (TextView) findViewById(C0966R.C0970id.f358661gc1);
        this.f199740z = (CheckBox) findViewById(C0966R.C0970id.gcc);
        this.f199730p.setOnClickListener(new C42524d());
        setContentViewVisibility(8);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            if (i == 2) {
                mo95537J7(i2, intent != null ? intent.getStringExtra("key_result_errmsg") : "");
                finish();
            }
        } else if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Conv_User");
            C115669n.INSTANCE.mo160131h(11701, 12, 0, 0, 0, 3, stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                doSceneProgress(new C69245l2(stringExtra, this.f199717C, 1, "v1.0"));
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f199716B = getIntent().getStringExtra("key_native_url");
        this.f199718D = getIntent().getIntExtra("key_way", 5);
        this.f199720F = getIntent().getIntExtra("key_static_from_scene", 0);
        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "nativeurl=" + Util.nullAsNil(this.f199716B) + ", mWay=" + this.f199718D);
        init();
        C115669n.INSTANCE.mo160131h(11701, 10, 0, 0, 0, 1);
        initView();
        addSceneEndListener(980);
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f199715A;
        if (i0Var != null && i0Var.isShowing()) {
            this.f199715A.dismiss();
        }
        removeSceneEndListener(980);
    }

    public void onNewIntent(Intent intent) {
        if (intent != null && intent.hasExtra("key_is_realname_verify_process")) {
            if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process succ");
                init();
                return;
            }
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "new intent from realname verify process cancel");
            mo95537J7(-1, "");
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        C69249n nVar;
        C69249n nVar2;
        int i3;
        C69249n nVar3;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Class cls = C79173v.class;
        if (yVar2 instanceof C69261r1) {
            if (i == 0 && i4 == 0) {
                this.f199721G = (C69261r1) yVar2;
                C67186g0 g0Var = new C67186g0();
                g0Var.field_mNativeUrl = this.f199716B;
                C69261r1 r1Var = this.f199721G;
                g0Var.field_hbType = r1Var.f199328y;
                g0Var.field_hbStatus = r1Var.f199320q;
                g0Var.field_receiveStatus = r1Var.f199321r;
                ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(g0Var);
                C69261r1 r1Var2 = this.f199721G;
                this.f199717C = r1Var2.f199315i;
                this.f199719E = r1Var2.f199328y;
                C115669n nVar4 = C115669n.INSTANCE;
                nVar4.mo160131h(13050, Integer.valueOf(this.f199720F), 1, this.f199721G.f199326w);
                if (!C69242l1.m81611q() || (nVar3 = this.f199721G.f199313B) == null || nVar3.f199277d == 1) {
                    this.f199723I = false;
                    if (this.f199721G.f199321r == 2) {
                        mo95537J7(-1, "");
                        doSceneProgress(new C69267u1(this.f199717C, 11, 0, this.f199716B, "v1.0"), false);
                    } else {
                        C89779i0 i0Var = this.f199715A;
                        if (i0Var != null && i0Var.isShowing()) {
                            this.f199715A.hide();
                        }
                        C69242l1.m81610p(this.f199724g, this.f199721G.f199317n, (String) null, true);
                        C69242l1.m81616v(getContext(), this.f199725h, this.f199721G.f199319p);
                        C69242l1.m81610p(this.f199734t, this.f199721G.f199323t, (String) null, false);
                        C69261r1 r1Var3 = this.f199721G;
                        if (r1Var3.f199321r == 1 || (i3 = r1Var3.f199320q) == 4 || i3 == 5 || i3 == 1) {
                            nVar4.mo160131h(11701, 11, 0, 0, 0, 3);
                            this.f199726i.setVisibility(4);
                            this.f199727j.setText(this.f199721G.f199322s);
                            this.f199728n.setVisibility(8);
                            this.f199729o.setVisibility(8);
                            if (this.f199719E == 1) {
                                this.f199735u.setOnClickListener(new C69347f());
                                this.f199735u.setVisibility(0);
                            } else {
                                this.f199735u.setVisibility(8);
                            }
                        } else {
                            if (!Util.isNullOrNil(r1Var3.f199326w)) {
                                C69261r1 r1Var4 = this.f199721G;
                                String str3 = r1Var4.f199326w;
                                if (r1Var4.f199327x == 1) {
                                    this.f199740z.setVisibility(8);
                                } else {
                                    Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "show checkbox for " + this.f199721G.f199326w);
                                    if (this.f199721G.f199324u == 1) {
                                        this.f199740z.setChecked(true);
                                    } else {
                                        this.f199740z.setChecked(false);
                                    }
                                    this.f199740z.setText(this.f199721G.f199325v);
                                }
                            }
                            this.f199728n.setOnClickListener(new C69346e());
                            if (!Util.isNullOrNil(this.f199721G.f199322s)) {
                                this.f199726i.setText(this.f199721G.f199322s);
                            } else {
                                this.f199726i.setVisibility(8);
                            }
                            if (!Util.isNullOrNil(this.f199721G.f199318o)) {
                                this.f199727j.setText(this.f199721G.f199318o);
                            } else {
                                this.f199727j.setVisibility(8);
                            }
                        }
                        C69242l1.m81613s(this.f199733s, (Animation.AnimationListener) null);
                        View contentView = getContentView();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = contentView;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    return true;
                }
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "is not atomic luckymoney, go to LuckyMoneyBusiReceiveUIV2");
                this.f199723I = true;
                Intent intent = getIntent();
                if (intent == null) {
                    intent = new Intent();
                }
                intent.putExtra("key_sendid", this.f199717C);
                intent.putExtra("key_type", this.f199719E);
                intent.putExtra("key_lucky_money_busi_receive_resp", this.f199721G.f199329z);
                intent.setClass(getContext(), WalletPayUPayUI.class);
                startActivityForResult(intent, 2);
                setContentViewVisibility(8);
                return true;
            }
        } else if (yVar2 instanceof C69259q1) {
            this.f199728n.setVisibility(0);
            C69242l1.m81618x(this.f199729o);
            if (i == 0 && i4 == 0) {
                mo95537J7(-1, "");
                C69259q1 q1Var = (C69259q1) yVar2;
                C67186g0 g0Var2 = new C67186g0();
                g0Var2.field_mNativeUrl = this.f199716B;
                C69158a0 a0Var = q1Var.f199307t;
                g0Var2.field_hbType = a0Var.f198964d;
                String str4 = "luckyMoneyDetail.toByteArray() fail! ";
                String str5 = "key_jump_from";
                g0Var2.field_receiveAmount = a0Var.f198974q;
                g0Var2.field_receiveTime = System.currentTimeMillis();
                C69158a0 a0Var2 = q1Var.f199307t;
                g0Var2.field_hbStatus = a0Var2.f198965e;
                g0Var2.field_receiveStatus = a0Var2.f198939A;
                if (g0Var2.field_receiveAmount > 0) {
                    ((C79173v) C86312j.m106911c(cls)).mo109172tc().replace(g0Var2);
                }
                if (C72506r.m84838d(q1Var.f199309v)) {
                    Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "should intercept");
                    setContentViewVisibility(8);
                    new C72506r(this).mo99912b(q1Var.f199309v, new C69348g());
                    return true;
                } else if (q1Var.f199300j != 2) {
                    this.f199726i.setVisibility(4);
                    this.f199727j.setText(q1Var.f199301n);
                    this.f199728n.setVisibility(8);
                    this.f199729o.setVisibility(8);
                    if (this.f199719E == 1) {
                        this.f199735u.setOnClickListener(new C69352k(q1Var));
                        this.f199735u.setVisibility(0);
                        return true;
                    }
                    this.f199735u.setVisibility(8);
                    return true;
                } else if (q1Var.f199304q <= 1 || !((nVar = q1Var.f199305r) == null || nVar.f199277d == 1)) {
                    Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "can not atomic go detail");
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_sendid", q1Var.f199298h);
                    intent2.putExtra("key_static_from_scene", this.f199720F);
                    RealnameGuideHelper realnameGuideHelper = q1Var.f199308u;
                    if (realnameGuideHelper != null) {
                        intent2.putExtra("key_realname_guide_helper", realnameGuideHelper);
                    }
                    try {
                        intent2.putExtra("key_detail_info", q1Var.f199307t.toByteArray());
                        intent2.putExtra(str5, 2);
                    } catch (IOException e) {
                        Log.m105928w("MicroMsg.LuckyMoneyBusiReceiveUI", str4 + e.getLocalizedMessage());
                    }
                    if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                        z = true;
                        intent2.putExtra("play_sound", true);
                    } else {
                        z = true;
                    }
                    C88144b.m109791i(getContext(), "luckymoney", ".ui.LuckyMoneyBusiDetailUI", intent2, (Bundle) null);
                    finish();
                    return z;
                } else {
                    View findViewById = findViewById(C0966R.C0970id.gc8);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-findViewById.getHeight()));
                    translateAnimation.setDuration(400);
                    translateAnimation.setFillAfter(true);
                    translateAnimation.setAnimationListener(new C42525h(this, findViewById));
                    findViewById.startAnimation(translateAnimation);
                    this.f199732r.setText(C75228t.m90260n(((double) q1Var.f199303p) / 100.0d));
                    this.f199725h.setText(q1Var.f199299i);
                    this.f199726i.setVisibility(8);
                    this.f199727j.setVisibility(8);
                    View view2 = this.f199731q;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f199728n.setVisibility(8);
                    this.f199729o.setVisibility(8);
                    this.f199738x.setText(!Util.isNullOrNil(q1Var.f199306s) ? q1Var.f199306s : getString(C0966R.string.gjb));
                    this.f199739y.setVisibility(0);
                    C115669n.INSTANCE.mo160131h(11701, 12, 0, 0, 0, 1);
                    Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "totalNum:" + q1Var.f199304q);
                    if (q1Var.f199304q > 1 || ((nVar2 = q1Var.f199305r) != null && nVar2.f199277d == 1)) {
                        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUI", "can atomic");
                        this.f199722H = q1Var.f199308u;
                        this.f199738x.setOnClickListener(new C69349i(q1Var));
                    } else {
                        this.f199738x.setOnClickListener(new C42526j());
                    }
                    this.f199738x.setVisibility(0);
                    return true;
                }
            } else if (i4 == 416) {
                C89779i0 i0Var2 = this.f199715A;
                if (i0Var2 != null && i0Var2.isShowing()) {
                    this.f199715A.hide();
                }
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyBusiReceiveUI");
                bundle.putString("realname_verify_process_jump_plugin", "luckymoney");
                this.f199728n.setBackgroundResource(C0966R.C0969drawable.c27);
                return C69242l1.m81596b(this, i2, str, yVar, bundle, false, new C42523a(this), new C69344b(this), 1005);
            }
        } else {
            String str6 = "luckyMoneyDetail.toByteArray() fail! ";
            String str7 = "key_jump_from";
            if (yVar2 instanceof C69245l2) {
                if (i == 0 && i4 == 0) {
                    C76879j.m92726T(this, getString(C0966R.string.fjh));
                    C115669n.INSTANCE.mo160131h(11701, 12, 0, 0, 0, 4);
                    finish();
                    return true;
                }
                C76879j.m92726T(this, str2);
                return true;
            } else if (yVar2 instanceof C69257p1) {
                if (i == 0 && i4 == 0) {
                    doSceneProgress(new C69261r1(this.f199717C, this.f199716B, this.f199718D, getIntent().getStringExtra("packageExt")));
                    return true;
                }
            } else if (yVar2 instanceof C69267u1) {
                C89779i0 i0Var3 = this.f199715A;
                if (i0Var3 != null && i0Var3.isShowing()) {
                    this.f199715A.hide();
                }
                if (i == 0 && i4 == 0) {
                    C69267u1 u1Var = (C69267u1) yVar2;
                    Intent intent3 = new Intent();
                    intent3.setClass(getContext(), LuckyMoneyBusiDetailUI.class);
                    try {
                        intent3.putExtra("key_detail_info", u1Var.f199337h.toByteArray());
                        intent3.putExtra(str7, 2);
                    } catch (IOException e2) {
                        Log.m105928w("MicroMsg.LuckyMoneyBusiReceiveUI", str6 + e2.getLocalizedMessage());
                    }
                    intent3.putExtra("key_native_url", this.f199716B);
                    intent3.putExtra("key_sendid", this.f199717C);
                    intent3.putExtra("key_static_from_scene", this.f199720F);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent3);
                    C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    finish();
                    return true;
                }
            }
        }
        if (i == 0 && i4 == 0) {
            return false;
        }
        mo95537J7(2, str2);
        return false;
    }
}
