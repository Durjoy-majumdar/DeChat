package com.tencent.p014mm.plugin.luckymoney.sns;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69224g2;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69245l2;
import com.tencent.p014mm.plugin.luckymoney.model.C69271w1;
import com.tencent.p014mm.plugin.luckymoney.model.C69273y;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69558a3;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69631l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69727y2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyCanShareListUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyIndexUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyMoneyInputView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyMyRecordUI;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNumInputView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyTextInputView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tenpay.android.wechat.MyKeyboardWindow;
import eb0.C75592q0;
import f40.C86709a0;
import g32.C75846b;
import ie3.C76331i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C117747y;
import x32.C78767d;
import x32.C78768e;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI */
public class SnsLuckyMoneyPrepareUI extends LuckyMoneyBaseUI implements C69727y2 {

    /* renamed from: I */
    public static final /* synthetic */ int f199410I = 0;

    /* renamed from: A */
    public int f199411A;

    /* renamed from: B */
    public String f199412B;

    /* renamed from: C */
    public int f199413C;

    /* renamed from: D */
    public boolean f199414D;

    /* renamed from: E */
    public C69273y f199415E;

    /* renamed from: F */
    public String f199416F;

    /* renamed from: G */
    public int f199417G;

    /* renamed from: H */
    public MTimerHandler f199418H = null;

    /* renamed from: g */
    public LuckyMoneyNumInputView f199419g = null;

    /* renamed from: h */
    public LuckyMoneyMoneyInputView f199420h = null;

    /* renamed from: i */
    public LuckyMoneyTextInputView f199421i = null;

    /* renamed from: j */
    public TextView f199422j = null;

    /* renamed from: n */
    public Button f199423n = null;

    /* renamed from: o */
    public Button f199424o = null;

    /* renamed from: p */
    public MyKeyboardWindow f199425p;

    /* renamed from: q */
    public View f199426q;

    /* renamed from: r */
    public TextView f199427r;

    /* renamed from: s */
    public Dialog f199428s = null;

    /* renamed from: t */
    public View f199429t;

    /* renamed from: u */
    public View f199430u;

    /* renamed from: v */
    public ViewGroup f199431v;

    /* renamed from: w */
    public ScrollView f199432w;

    /* renamed from: x */
    public TextView f199433x;

    /* renamed from: y */
    public C69631l1 f199434y = new C69631l1();

    /* renamed from: z */
    public int f199435z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$a */
    public class C4835a implements Runnable {
        public C4835a() {
        }

        public void run() {
            Intent intent = new Intent();
            intent.setClass(SnsLuckyMoneyPrepareUI.this.getContext(), LuckyMoneyIndexUI.class);
            intent.addFlags(67108864);
            AppCompatActivity context = SnsLuckyMoneyPrepareUI.this.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$10", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            SnsLuckyMoneyPrepareUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$b */
    public class C4836b implements DialogInterface.OnClickListener {
        public C4836b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setClass(SnsLuckyMoneyPrepareUI.this.getContext(), LuckyMoneyMyRecordUI.class);
            intent.putExtra("key_type", 1);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = snsLuckyMoneyPrepareUI;
            C117292a.m165358d(snsLuckyMoneyPrepareUI2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsLuckyMoneyPrepareUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsLuckyMoneyPrepareUI2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$11", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$c */
    public class C4837c implements DialogInterface.OnClickListener {
        public C4837c(SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$d */
    public class C4838d implements View.OnClickListener {
        public C4838d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n nVar = C115669n.INSTANCE;
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            int i = SnsLuckyMoneyPrepareUI.f199410I;
            nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(snsLuckyMoneyPrepareUI.mo95421K7()), 9);
            Intent intent = new Intent();
            intent.setClass(SnsLuckyMoneyPrepareUI.this.getContext(), LuckyMoneyCanShareListUI.class);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = SnsLuckyMoneyPrepareUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI3 = snsLuckyMoneyPrepareUI2;
            C117292a.m165358d(snsLuckyMoneyPrepareUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsLuckyMoneyPrepareUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsLuckyMoneyPrepareUI3, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$e */
    public class C4839e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C69271w1 f19918d;

        public C4839e(C69271w1 w1Var) {
            this.f19918d = w1Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75228t.m90219L(SnsLuckyMoneyPrepareUI.this.getContext(), this.f19918d.f199358o, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$g */
    public class C4840g implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$g$a */
        public class C4841a implements Runnable {
            public C4841a() {
            }

            public void run() {
                View view = SnsLuckyMoneyPrepareUI.this.f199429t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsLuckyMoneyPrepareUI.this.mo95518I7();
            }
        }

        public C4840g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n nVar = C115669n.INSTANCE;
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            int i = SnsLuckyMoneyPrepareUI.f199410I;
            nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(snsLuckyMoneyPrepareUI.mo95421K7()), 6);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = SnsLuckyMoneyPrepareUI.this;
            C69242l1.m81603i(snsLuckyMoneyPrepareUI2, 2, snsLuckyMoneyPrepareUI2.f199435z, snsLuckyMoneyPrepareUI2.f199413C, false);
            SnsLuckyMoneyPrepareUI.this.f199429t.postDelayed(new C4841a(), 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$h */
    public class C4842h implements View.OnClickListener {
        public C4842h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = SnsLuckyMoneyPrepareUI.this.f199429t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$17", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$17", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            SnsLuckyMoneyPrepareUI.this.mo95518I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$f */
    public class C69280f implements Runnable {
        public C69280f() {
        }

        public void run() {
            View view = SnsLuckyMoneyPrepareUI.this.f199429t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(800);
            scaleAnimation.setStartOffset(200);
            scaleAnimation.setInterpolator(new BounceInterpolator());
            SnsLuckyMoneyPrepareUI.this.findViewById(C0966R.C0970id.ghw).startAnimation(scaleAnimation);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$i */
    public class C69281i implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f199437d;

        /* renamed from: e */
        public final /* synthetic */ int f199438e;

        /* renamed from: f */
        public final /* synthetic */ EditText f199439f;

        /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$i$a */
        public class C69282a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f199441d;

            public C69282a(View view) {
                this.f199441d = view;
            }

            public void run() {
                if (!SnsLuckyMoneyPrepareUI.this.f199426q.isShown() && this.f199441d.isShown()) {
                    SnsLuckyMoneyPrepareUI.m81661J7(SnsLuckyMoneyPrepareUI.this);
                }
                C69281i iVar = C69281i.this;
                SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
                snsLuckyMoneyPrepareUI.f199425p.setXMode(iVar.f199438e);
                SnsLuckyMoneyPrepareUI.this.f199425p.setInputEditText((EditText) this.f199441d);
                ((InputMethodManager) SnsLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f199441d.getWindowToken(), 0);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$i$b */
        public class C69283b implements Runnable {
            public C69283b() {
            }

            public void run() {
                SnsLuckyMoneyPrepareUI.this.hideTenpayKB();
                ((InputMethodManager) SnsLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).showSoftInput(C69281i.this.f199439f, 0);
            }
        }

        public C69281i(boolean z, int i, EditText editText) {
            this.f199437d = z;
            this.f199438e = i;
            this.f199439f = editText;
        }

        public void onFocusChange(View view, boolean z) {
            if (!view.isFocused() || this.f199437d) {
                new MMHandler().postDelayed(new C69283b(), 200);
                return;
            }
            ((InputMethodManager) SnsLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new MMHandler().postDelayed(new C69282a(view), 300);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$j */
    public class C69284j implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f199444d;

        /* renamed from: e */
        public final /* synthetic */ int f199445e;

        /* renamed from: f */
        public final /* synthetic */ EditText f199446f;

        public C69284j(boolean z, int i, EditText editText) {
            this.f199444d = z;
            this.f199445e = i;
            this.f199446f = editText;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!SnsLuckyMoneyPrepareUI.this.f199426q.isShown() && !this.f199444d) {
                SnsLuckyMoneyPrepareUI.m81661J7(SnsLuckyMoneyPrepareUI.this);
                SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
                snsLuckyMoneyPrepareUI.f199425p.setXMode(this.f199445e);
            } else if (this.f199444d) {
                SnsLuckyMoneyPrepareUI.this.hideTenpayKB();
                ((InputMethodManager) SnsLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).showSoftInput(this.f199446f, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$k */
    public class C69285k implements MenuItem.OnMenuItemClickListener {
        public C69285k() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SnsLuckyMoneyPrepareUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$l */
    public class C69286l implements View.OnClickListener {
        public C69286l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsLuckyMoneyPrepareUI.this.hideTenpayKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$m */
    public class C69287m implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ SpannableString f199450a;

        public C69287m(SpannableString spannableString) {
            this.f199450a = spannableString;
        }

        public void onClick(View view) {
            int input = SnsLuckyMoneyPrepareUI.this.f199419g.getInput();
            double input2 = SnsLuckyMoneyPrepareUI.this.f199420h.getInput();
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI.f199435z = 0;
            snsLuckyMoneyPrepareUI.f199420h.setType(0);
            SnsLuckyMoneyPrepareUI.this.f199420h.setShowGroupIcon(false);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI2.f199420h.setTitle(snsLuckyMoneyPrepareUI2.getString(C0966R.string.gjq));
            if (input2 > 0.0d && input > 0) {
                SnsLuckyMoneyPrepareUI.this.f199420h.setAmount(C75228t.m90260n(input2 / ((double) input)));
            }
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI3 = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI3.f199420h.setMaxAmount(snsLuckyMoneyPrepareUI3.f199415E.f199375h);
            SnsLuckyMoneyPrepareUI.this.f199427r.setText(this.f199450a);
            C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(SnsLuckyMoneyPrepareUI.this.mo95421K7()), 3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$n */
    public class C69288n implements C72478z.C72479a {

        /* renamed from: a */
        public final /* synthetic */ SpannableString f199452a;

        public C69288n(SpannableString spannableString) {
            this.f199452a = spannableString;
        }

        public void onClick(View view) {
            int input = SnsLuckyMoneyPrepareUI.this.f199419g.getInput();
            double input2 = SnsLuckyMoneyPrepareUI.this.f199420h.getInput();
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI.f199435z = 1;
            snsLuckyMoneyPrepareUI.f199420h.setType(1);
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI2.f199420h.setTitle(snsLuckyMoneyPrepareUI2.getString(C0966R.string.gjp));
            SnsLuckyMoneyPrepareUI.this.f199420h.setShowGroupIcon(true);
            if (input2 > 0.0d && input > 0) {
                SnsLuckyMoneyPrepareUI.this.f199420h.setAmount(C75228t.m90260n(input2 * ((double) input)));
            }
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI3 = SnsLuckyMoneyPrepareUI.this;
            snsLuckyMoneyPrepareUI3.f199420h.setMaxAmount(snsLuckyMoneyPrepareUI3.f199415E.f199372e);
            SnsLuckyMoneyPrepareUI.this.f199427r.setText(this.f199452a);
            C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(SnsLuckyMoneyPrepareUI.this.mo95421K7()), 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$o */
    public class C69289o implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$o$a */
        public class C69290a implements DialogInterface.OnCancelListener {
            public C69290a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Dialog dialog = SnsLuckyMoneyPrepareUI.this.f199428s;
                if (dialog != null && dialog.isShowing()) {
                    SnsLuckyMoneyPrepareUI.this.f199428s.hide();
                }
                if (SnsLuckyMoneyPrepareUI.this.getContentView().getVisibility() == 8 || SnsLuckyMoneyPrepareUI.this.getContentView().getVisibility() == 4) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "usr cancel, & visibility not visiable, so finish");
                    SnsLuckyMoneyPrepareUI.this.finish();
                }
                SnsLuckyMoneyPrepareUI.this.forceCancel();
            }
        }

        public C69289o() {
        }

        public void onClick(View view) {
            long j;
            long j2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n nVar = C115669n.INSTANCE;
            SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
            int i = SnsLuckyMoneyPrepareUI.f199410I;
            nVar.mo160131h(11701, 4, 0, 0, Integer.valueOf(snsLuckyMoneyPrepareUI.mo95421K7()), 4);
            if (SnsLuckyMoneyPrepareUI.this.f199420h.mo5753c() != 0) {
                C76912y0.makeText((Context) SnsLuckyMoneyPrepareUI.this.getContext(), (int) C0966R.string.kmc, 0).show();
            } else {
                int input = SnsLuckyMoneyPrepareUI.this.f199419g.getInput();
                double input2 = SnsLuckyMoneyPrepareUI.this.f199420h.getInput();
                if (SnsLuckyMoneyPrepareUI.this.f199435z == 1) {
                    long r0 = C75228t.m90269r0(input2);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(356354, Integer.valueOf(input));
                    j2 = r0;
                    j = 0;
                } else {
                    long r05 = C75228t.m90269r0(((double) input) * input2);
                    long r06 = C75228t.m90269r0(input2);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119676J(356353, Integer.valueOf(input));
                    j = r06;
                    j2 = r05;
                }
                String input3 = SnsLuckyMoneyPrepareUI.this.f199421i.getInput();
                if (Util.isNullOrNil(input3)) {
                    input3 = SnsLuckyMoneyPrepareUI.this.getString(C0966R.string.gf7);
                }
                String str = input3;
                String stringExtra = SnsLuckyMoneyPrepareUI.this.getIntent().getStringExtra("key_username");
                SnsLuckyMoneyPrepareUI.this.doSceneProgress((!SnsLuckyMoneyPrepareUI.this.f199414D || Util.isNullOrNil(stringExtra)) ? new C69224g2(input, j2, j, SnsLuckyMoneyPrepareUI.this.f199435z, str, C69242l1.m81601g(), (String) null, (String) null, C75592q0.m90789s(), C75592q0.m90783m(), SnsLuckyMoneyPrepareUI.this.f199411A, "") : new C69224g2(input, j2, j, SnsLuckyMoneyPrepareUI.this.f199435z, str, C69242l1.m81601g(), stringExtra, C69242l1.m81602h(stringExtra), C75592q0.m90789s(), C75592q0.m90783m(), SnsLuckyMoneyPrepareUI.this.f199411A, ""), false);
                SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI2 = SnsLuckyMoneyPrepareUI.this;
                Dialog dialog = snsLuckyMoneyPrepareUI2.f199428s;
                if (dialog != null) {
                    dialog.show();
                } else {
                    snsLuckyMoneyPrepareUI2.f199428s = C75197d0.m90164e(snsLuckyMoneyPrepareUI2.getContext(), true, new C69290a());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$p */
    public class C69291p implements MTimerHandler.CallBack {
        public C69291p() {
        }

        public boolean onTimerExpired() {
            double d;
            if (SnsLuckyMoneyPrepareUI.this.f199420h.mo5753c() == 3 || SnsLuckyMoneyPrepareUI.this.f199419g.mo5753c() == 3) {
                d = 0.0d;
            } else {
                int input = SnsLuckyMoneyPrepareUI.this.f199419g.getInput();
                d = SnsLuckyMoneyPrepareUI.this.f199420h.getInput();
                if (SnsLuckyMoneyPrepareUI.this.f199435z == 0) {
                    d *= (double) input;
                }
            }
            if (d != 0.0d) {
                SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = SnsLuckyMoneyPrepareUI.this;
                if (d <= snsLuckyMoneyPrepareUI.f199415E.f199372e && !snsLuckyMoneyPrepareUI.f199434y.mo95867b()) {
                    SnsLuckyMoneyPrepareUI.this.f199423n.setClickable(true);
                    SnsLuckyMoneyPrepareUI.this.f199423n.setEnabled(true);
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d + ", hasErr=" + SnsLuckyMoneyPrepareUI.this.f199434y.mo95867b());
                    SnsLuckyMoneyPrepareUI.this.f199418H.stopped();
                    return false;
                }
            }
            SnsLuckyMoneyPrepareUI.this.f199423n.setClickable(false);
            SnsLuckyMoneyPrepareUI.this.f199423n.setEnabled(false);
            Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "onTimeExpired & check: amount=" + d + ", hasErr=" + SnsLuckyMoneyPrepareUI.this.f199434y.mo95867b());
            SnsLuckyMoneyPrepareUI.this.f199418H.stopped();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI$q */
    public class C69292q implements View.OnTouchListener {
        public C69292q() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                SnsLuckyMoneyPrepareUI.this.hideTenpayKB();
                SnsLuckyMoneyPrepareUI.this.hideVKB();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.fls);
    }

    /* renamed from: J7 */
    public static void m81661J7(SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        View view = snsLuckyMoneyPrepareUI.f199426q;
        if (view != null && !view.isShown()) {
            View view2 = snsLuckyMoneyPrepareUI.f199426q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            throw null;
        }
    }

    /* renamed from: K7 */
    public final int mo95421K7() {
        if (this.f199414D) {
            return getIntent().getIntExtra("key_chatroom_num", 0) > 0 ? 2 : 1;
        }
        return 3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a7  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95263Q(boolean r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            g32.b r1 = g32.C75846b.zx0()
            com.tencent.mm.plugin.luckymoney.model.z r1 = r1.vx0()
            com.tencent.mm.plugin.luckymoney.model.y r1 = r1.mo95413a()
            r0.f199415E = r1
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f199420h
            int r1 = r1.mo5753c()
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L_0x004b
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f199419g
            int r1 = r1.mo5753c()
            if (r1 == r2) goto L_0x004b
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f199419g
            int r1 = r1.getInput()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r2 = r0.f199420h
            double r5 = r2.getInput()
            int r2 = r0.f199435z
            if (r2 != 0) goto L_0x003d
            double r1 = (double) r1
            double r5 = r5 * r1
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f199420h
            double r1 = r1.getInput()
            goto L_0x004d
        L_0x003d:
            if (r1 <= 0) goto L_0x0049
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r2 = r0.f199420h
            double r7 = r2.getInput()
            double r1 = (double) r1
            double r1 = r7 / r1
            goto L_0x004d
        L_0x0049:
            r1 = r3
            goto L_0x004d
        L_0x004b:
            r1 = r3
            r5 = r1
        L_0x004d:
            com.tencent.mm.plugin.luckymoney.ui.l1 r7 = r0.f199434y
            r8 = r17
            r9 = r18
            boolean r7 = r7.mo95866a(r9, r8)
            r8 = 0
            if (r7 == 0) goto L_0x0066
            android.widget.Button r1 = r0.f199423n
            r1.setClickable(r8)
            android.widget.Button r1 = r0.f199423n
            r1.setEnabled(r8)
            goto L_0x01b1
        L_0x0066:
            r7 = 1
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0199
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0071
            goto L_0x0199
        L_0x0071:
            com.tencent.mm.plugin.luckymoney.model.y r10 = r0.f199415E
            double r11 = r10.f199372e
            r13 = 2
            java.lang.String r14 = ""
            int r15 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b3
            int r15 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b3
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f199434y
            r2 = 2131832550(0x7f112ee6, float:1.9298157E38)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f199415E
            double r9 = r9.f199372e
            long r9 = java.lang.Math.round(r9)
            r4.append(r9)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            r3[r8] = r4
            com.tencent.mm.plugin.luckymoney.model.y r4 = r0.f199415E
            java.lang.String r4 = r4.f199381q
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r14)
            r3[r7] = r4
            java.lang.String r2 = r0.getString(r2, r3)
            r1.mo95869d(r2)
            goto L_0x0199
        L_0x00b3:
            if (r9 <= 0) goto L_0x0197
            int r9 = r0.f199435z
            if (r9 != 0) goto L_0x00f5
            double r9 = r10.f199375h
            int r12 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r12 <= 0) goto L_0x013c
            int r12 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x013c
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f199434y
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r10 = r0.f199415E
            double r11 = r10.f199375h
            long r10 = java.lang.Math.round(r11)
            r9.append(r10)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            r4[r8] = r9
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f199415E
            java.lang.String r9 = r9.f199381q
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r14)
            r4[r7] = r9
            r9 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r4 = r0.getString(r9, r4)
            r3.mo95869d(r4)
            goto L_0x013a
        L_0x00f5:
            double r9 = r10.f199376i
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x013c
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x013c
            com.tencent.mm.plugin.luckymoney.ui.l1 r3 = r0.f199434y
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.tencent.mm.plugin.luckymoney.model.y r10 = r0.f199415E
            double r10 = r10.f199376i
            long r10 = java.lang.Math.round(r10)
            r9.append(r10)
            r9.append(r14)
            java.lang.String r9 = r9.toString()
            r4[r8] = r9
            com.tencent.mm.plugin.luckymoney.model.y r9 = r0.f199415E
            java.lang.String r9 = r9.f199381q
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r14)
            r4[r7] = r9
            r9 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r4 = r0.getString(r9, r4)
            r3.mo95869d(r4)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r3 = r0.f199419g
            r3.mo5751a()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r3 = r0.f199420h
            r3.mo5751a()
        L_0x013a:
            r3 = 1
            goto L_0x013d
        L_0x013c:
            r3 = 0
        L_0x013d:
            if (r3 != 0) goto L_0x019a
            int r4 = r0.f199435z
            r9 = 2131832487(0x7f112ea7, float:1.929803E38)
            if (r4 != 0) goto L_0x016a
            com.tencent.mm.plugin.luckymoney.model.y r4 = r0.f199415E
            double r10 = r4.f199377j
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x019a
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f199434y
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r10)
            r2[r8] = r3
            com.tencent.mm.plugin.luckymoney.model.y r3 = r0.f199415E
            java.lang.String r3 = r3.f199381q
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r14)
            r2[r7] = r3
            java.lang.String r2 = r0.getString(r9, r2)
            r1.mo95869d(r2)
            goto L_0x0199
        L_0x016a:
            r10 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x019a
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f199434y
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.String r3 = "0.01"
            r2[r8] = r3
            com.tencent.mm.plugin.luckymoney.model.y r3 = r0.f199415E
            java.lang.String r3 = r3.f199381q
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r14)
            r2[r7] = r3
            java.lang.String r2 = r0.getString(r9, r2)
            r1.mo95869d(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f199419g
            r1.mo5751a()
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView r1 = r0.f199420h
            r1.mo5751a()
            goto L_0x0199
        L_0x0197:
            r3 = 0
            goto L_0x019a
        L_0x0199:
            r3 = 1
        L_0x019a:
            if (r3 == 0) goto L_0x01a7
            android.widget.Button r1 = r0.f199423n
            r1.setClickable(r8)
            android.widget.Button r1 = r0.f199423n
            r1.setEnabled(r8)
            goto L_0x01b1
        L_0x01a7:
            android.widget.Button r1 = r0.f199423n
            r1.setClickable(r7)
            android.widget.Button r1 = r0.f199423n
            r1.setEnabled(r7)
        L_0x01b1:
            android.widget.TextView r1 = r0.f199422j
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r5)
            r1.setText(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.mo95263Q(boolean, int):void");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || this.f199429t.getVisibility() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        View view = this.f199429t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo95518I7();
        return true;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b__;
    }

    public void hideTenpayKB() {
        View view = this.f199426q;
        if (view != null && view.isShown()) {
            View view2 = this.f199426q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            throw null;
        }
    }

    public void initView() {
        getResources().getDrawable(C0966R.C0969drawable.c5k);
        setBackBtn(new C69285k());
        this.f199429t = findViewById(C0966R.C0970id.ghv);
        this.f199430u = findViewById(C0966R.C0970id.ghz);
        this.f199424o = (Button) findViewById(C0966R.C0970id.ghy);
        LuckyMoneyTextInputView luckyMoneyTextInputView = (LuckyMoneyTextInputView) findViewById(C0966R.C0970id.gjm);
        this.f199421i = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(C0966R.string.gf7));
        this.f199423n = (Button) findViewById(C0966R.C0970id.ghm);
        this.f199425p = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.f199426q = findViewById(C0966R.C0970id.f359359kh1);
        this.f199427r = (TextView) findViewById(C0966R.C0970id.ghk);
        this.f199419g = (LuckyMoneyNumInputView) findViewById(C0966R.C0970id.ghg);
        this.f199420h = (LuckyMoneyMoneyInputView) findViewById(C0966R.C0970id.gbq);
        this.f199422j = (TextView) findViewById(C0966R.C0970id.f358690gi0);
        this.f199431v = (ViewGroup) findViewById(C0966R.C0970id.ght);
        this.f199432w = (ScrollView) findViewById(C0966R.C0970id.gj4);
        this.f199433x = (TextView) findViewById(C0966R.C0970id.ghr);
        if (this.f199435z == 1) {
            this.f199420h.setTitle(getString(C0966R.string.gjp));
            this.f199420h.setShowGroupIcon(true);
        } else {
            this.f199420h.setTitle(getString(C0966R.string.gjq));
            this.f199420h.setShowGroupIcon(false);
        }
        this.f199420h.setOnInputValidChangerListener(this);
        this.f199419g.setOnInputValidChangerListener(this);
        this.f199421i.setOnInputValidChangerListener(this);
        EditText editText = (EditText) this.f199420h.findViewById(C0966R.C0970id.geq);
        EditText editText2 = (EditText) this.f199419g.findViewById(C0966R.C0970id.geq);
        C75228t.m90251i0(editText);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.setOnClickListener(new C78767d(this, editText, editText2));
        C75228t.m90251i0(editText2);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new C78768e(this, editText, editText2));
        C69273y yVar = this.f199415E;
        if (yVar != null) {
            if (this.f199435z == 1) {
                this.f199420h.setMaxAmount(yVar.f199372e);
            } else {
                this.f199420h.setMaxAmount(yVar.f199375h);
            }
            this.f199420h.setMinAmount(this.f199415E.f199377j);
        }
        if (!this.f199414D) {
            this.f199419g.setNum("");
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 1) {
            this.f199419g.setNum("");
        } else {
            this.f199419g.setNum("1");
        }
        this.f199419g.setMaxNum(this.f199415E.f199371d);
        if (this.f199435z == 1) {
            this.f199419g.setMinNum(1);
        } else {
            this.f199419g.setMinNum(1);
        }
        Log.m105918d("MicroMsg.LuckyMoneyPrepareUI", "init num=" + this.f199419g.getInput());
        this.f199420h.setMaxLen(12);
        if (!this.f199414D) {
            int i = this.f199435z;
            if (i == 1) {
                this.f199427r.setText(this.f199415E.f199373f);
                this.f199427r.setVisibility(0);
            } else if (i == 0) {
                this.f199427r.setText(this.f199415E.f199374g);
                this.f199427r.setVisibility(0);
            }
        } else if (getIntent().getIntExtra("key_chatroom_num", 0) > 0) {
            String string = getString(C0966R.string.ggw);
            String string2 = getString(C0966R.string.ggt);
            String string3 = getString(C0966R.string.ggv);
            String string4 = getString(C0966R.string.ggu);
            SpannableString spannableString = new SpannableString(string + string2);
            C72478z zVar = new C72478z(this);
            spannableString.setSpan(zVar, string.length(), string.length() + string2.length(), 33);
            SpannableString spannableString2 = new SpannableString(string3 + string4);
            C72478z zVar2 = new C72478z(this);
            spannableString2.setSpan(zVar2, string3.length(), string3.length() + string4.length(), 33);
            zVar.f210835d = new C69287m(spannableString2);
            zVar2.f210835d = new C69288n(spannableString);
            this.f199427r.setMovementMethod(LinkMovementMethod.getInstance());
            this.f199427r.setText(spannableString);
            this.f199427r.setVisibility(0);
        } else {
            this.f199419g.setVisibility(8);
        }
        this.f199423n.setOnClickListener(new C69289o());
        this.f199422j.setText(C75228t.m90256l(0.0d));
        this.f199434y.mo95868c(this.f199419g);
        this.f199434y.mo95868c(this.f199420h);
        this.f199434y.mo95868c(this.f199421i);
        TextView textView = (TextView) findViewById(C0966R.C0970id.gho);
        C69631l1 l1Var = this.f199434y;
        if (textView != null) {
            l1Var.f201004d = textView;
        } else {
            l1Var.getClass();
        }
        if (this.f199414D && this.f199435z == 1) {
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.ghs);
            textView2.setText(getString(C0966R.string.ghr, new Object[]{Integer.valueOf(getIntent().getIntExtra("key_chatroom_num", 8))}));
            textView2.setVisibility(0);
        }
        this.f199418H = new MTimerHandler(new C69291p(), false);
        ScrollView scrollView = this.f199432w;
        if (scrollView != null) {
            scrollView.setOnTouchListener(new C69292q());
        }
        this.f199420h.setType(this.f199435z);
        if (!this.f199414D || getIntent().getIntExtra("key_chatroom_num", 0) != 0) {
            this.f199419g.requestFocus();
        } else {
            this.f199420h.requestFocus();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i3 != 1) {
            if (i3 == 2) {
                if (i4 == -1 && intent2 != null) {
                    String stringExtra = intent2.getStringExtra("Select_Conv_User");
                    C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95421K7()), 7, stringExtra);
                    if (!Util.isNullOrNil(stringExtra)) {
                        doSceneProgress(new C69245l2(stringExtra.replaceAll(",", "|"), this.f199412B, 1, "v1.0"));
                    } else {
                        finish();
                    }
                } else if (i4 == 0) {
                    Intent intent3 = new Intent();
                    intent3.setClass(getContext(), LuckyMoneyMyRecordUI.class);
                    intent3.putExtra("key_type", 1);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent3);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        } else if (i4 == -1) {
            C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95421K7()), 5);
            String stringExtra2 = getIntent().getStringExtra("key_username");
            if (!this.f199414D || Util.isNullOrNil(stringExtra2)) {
                mo95517H7();
                new MMHandler().postDelayed(new C69280f(), 200);
                this.f199424o.setOnClickListener(new C4840g());
                ((ImageView) findViewById(C0966R.C0970id.ghn)).setOnClickListener(new C4842h());
            } else {
                C76879j.m92726T(this, getString(C0966R.string.fjh));
                Map<String, String> parseXml = XmlParser.parseXml(this.f199416F, "msg", (String) null);
                if (parseXml == null) {
                    Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "luckymoneyPrepareUI onActivityResult values is null");
                    finish();
                    return;
                }
                String str = parseXml.get(".msg.appmsg.wcpayinfo.paymsgid");
                if (C75846b.zx0().Bx0().mo57182a(str)) {
                    Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "insert a local msg for luckymoney");
                    if (!C69242l1.m81614t(this.f199416F, stringExtra2, 1)) {
                        Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "LuckyMoneyUtil.sendLocalMsg fail!");
                        C75846b.zx0().Bx0().mo57183b(str);
                    }
                } else {
                    Log.m105920e("MicroMsg.LuckyMoneyPrepareUI", "it is a duplicate msg");
                }
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f199435z = getIntent().getIntExtra("key_type", 1);
        this.f199411A = getIntent().getIntExtra("key_way", 3);
        this.f199414D = getIntent().getIntExtra("key_from", 0) == 1;
        this.f199417G = getIntent().getIntExtra("pay_channel", -1);
        doSceneProgress(new C69271w1(0, "v1.0", 0), false);
        this.f199415E = C75846b.zx0().vx0().mo95413a();
        Log.m105918d("MicroMsg.LuckyMoneyPrepareUI", "type=" + this.f199435z + ", fromAppPanel=" + this.f199414D + ", config " + this.f199415E);
        initView();
        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95421K7()), 1);
    }

    public void onDestroy() {
        super.onDestroy();
        C69631l1 l1Var = this.f199434y;
        ((LinkedList) l1Var.f201001a).clear();
        l1Var.f201004d = null;
        this.f199418H.stopped();
        Dialog dialog = this.f199428s;
        if (dialog != null && dialog.isShowing()) {
            this.f199428s.dismiss();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        View view;
        if (i != 4 || (view = this.f199426q) == null || !view.isShown()) {
            return super.onKeyUp(i, keyEvent);
        }
        hideTenpayKB();
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C69224g2) {
            Dialog dialog = this.f199428s;
            if (dialog != null && dialog.isShowing()) {
                this.f199428s.hide();
            }
            if (i == 0 && i2 == 0) {
                C69224g2 g2Var = (C69224g2) yVar;
                this.f199413C = g2Var.f199185n;
                this.f199412B = g2Var.f199182h;
                this.f199416F = g2Var.f199184j;
                PayInfo payInfo = new PayInfo();
                payInfo.f212592j = g2Var.f199183i;
                payInfo.f212587e = 37;
                payInfo.f212589g = this.f199417G;
                C76331i.m91761e(this, payInfo, 1);
                return true;
            } else if (i2 == 401) {
                this.f199423n.setEnabled(false);
                this.f199423n.setClickable(false);
                this.f199418H.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                C76879j.m92726T(this, str);
                return true;
            } else {
                C76879j.m92726T(this, str);
                return true;
            }
        } else {
            if (yVar instanceof C69245l2) {
                if (i == 0 && i2 == 0) {
                    if (this.f199414D) {
                        C76879j.m92726T(this, getString(C0966R.string.fjh));
                        finish();
                    } else {
                        mo95517H7();
                        this.f199430u.postDelayed(new C4835a(), 1000);
                    }
                    return true;
                } else if (i2 == 402) {
                    C76879j.m92707A(getContext(), str, "", getString(C0966R.string.gj5), getString(C0966R.string.f7926wf), new C4836b(), new C4837c(this));
                    return true;
                }
            } else if (yVar instanceof C69271w1) {
                if (i == 0 && i2 == 0) {
                    C69271w1 w1Var = (C69271w1) yVar;
                    this.f199415E = C75846b.zx0().vx0().mo95413a();
                    Log.m105918d("MicroMsg.LuckyMoneyPrepareUI", "update config:" + this.f199415E);
                    if (this.f199435z == 1) {
                        this.f199420h.setMaxAmount(this.f199415E.f199372e);
                    } else {
                        this.f199420h.setMaxAmount(this.f199415E.f199375h);
                    }
                    this.f199420h.setMinAmount(this.f199415E.f199377j);
                    this.f199419g.setMaxNum(this.f199415E.f199371d);
                    if (w1Var.f199355i && this.f199414D) {
                        TextView textView = (TextView) findViewById(C0966R.C0970id.ghp);
                        textView.setOnClickListener(new C4838d());
                        C115669n.INSTANCE.mo160131h(11701, 4, 0, 0, Integer.valueOf(mo95421K7()), 8);
                        textView.setVisibility(0);
                    }
                    if (!Util.isNullOrNil(w1Var.f199357n)) {
                        Log.m105924i("MicroMsg.LuckyMoneyPrepareUI", "Put notice :" + w1Var.f199357n);
                        this.f199433x.setText(w1Var.f199357n);
                        if (!Util.isNullOrNil(w1Var.f199358o)) {
                            this.f199433x.setOnClickListener(new C4839e(w1Var));
                        }
                        this.f199433x.setVisibility(0);
                    } else {
                        this.f199433x.setVisibility(8);
                    }
                    C69558a3.C69561c cVar = new C69558a3.C69561c();
                    cVar.f200852a = getResources().getColor(C0966R.color.ajd);
                    C69558a3.m81995a(this, this.f199431v, w1Var.f199365v, cVar);
                }
                return true;
            }
            return false;
        }
    }

    public void setEditFocusListener(View view, int i, boolean z) {
        this.f199425p = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.f199426q = findViewById(C0966R.C0970id.f359359kh1);
        View findViewById = findViewById(C0966R.C0970id.kh4);
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.geq);
        if (this.f199425p != null && editText != null && this.f199426q != null) {
            C75228t.m90251i0(editText);
            editText.setOnFocusChangeListener(new C69281i(z, i, editText));
            editText.setOnClickListener(new C69284j(z, i, editText));
            findViewById.setOnClickListener(new C69286l());
        }
    }
}
