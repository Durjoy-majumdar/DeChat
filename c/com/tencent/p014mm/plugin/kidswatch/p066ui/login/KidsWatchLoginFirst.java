package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.kidswatch.p066ui.reg.KidsWatchRegGetInfoUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u12.C52417a;
import v12.C52739e;
import w12.C53066b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst */
public final class KidsWatchLoginFirst extends MMActivity {

    /* renamed from: d */
    public String f114985d;

    /* renamed from: e */
    public String f114986e;

    /* renamed from: f */
    public String f114987f;

    /* renamed from: g */
    public boolean f114988g;

    /* renamed from: h */
    public int f114989h;

    /* renamed from: i */
    public boolean f114990i;

    /* renamed from: j */
    public C52417a f114991j = C52417a.SCENE_CHOOSE_LOGIN;

    /* renamed from: n */
    public final C13601g f114992n = C36568h.m40985a(new C42479d(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$a */
    public static final class C42474a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirst f114993d;

        /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$a$a */
        public /* synthetic */ class C42475a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f114994a;

            static {
                int[] iArr = new int[C52417a.values().length];
                iArr[1] = 1;
                f114994a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42474a(KidsWatchLoginFirst kidsWatchLoginFirst) {
            super(0);
            this.f114993d = kidsWatchLoginFirst;
        }

        public Object invoke() {
            if (C42475a.f114994a[this.f114993d.f114991j.ordinal()] == 1) {
                C115669n.INSTANCE.mo160128e(21256, true, true, false, "", 3, 0);
            } else {
                C53066b bVar = C53066b.f148113a;
                C53066b.C53067a aVar = C53066b.C53067a.ACCOUNT_TYPE_NORMAL;
                KidsWatchLoginFirst kidsWatchLoginFirst = this.f114993d;
                String str = kidsWatchLoginFirst.f114985d;
                if (str != null) {
                    bVar.mo73761a(aVar, str, C53066b.C53069c.LOGIN_TYPE_DEFAULT, C53066b.C53068b.LOGIN_RESULT_CANCEL, kidsWatchLoginFirst.f114989h, 0);
                } else {
                    C87412m.m108603p("loginUrl");
                    throw null;
                }
            }
            this.f114993d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$b */
    public static final class C42476b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirst f114995d;

        public C42476b(KidsWatchLoginFirst kidsWatchLoginFirst) {
            this.f114995d = kidsWatchLoginFirst;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.KidsWatchLoginFirst", "login button clicked");
            this.f114995d.f114991j = C52417a.SCENE_CHOOSE_LOGIN;
            Intent intent = new Intent();
            String str = this.f114995d.f114985d;
            if (str != null) {
                intent.putExtra("intent.key.login.url", str);
                intent.putExtra("intent.key.device.name", this.f114995d.f114986e);
                intent.putExtra("intent.key.ok.session.list", this.f114995d.f114987f);
                intent.putExtra("intent.key.kids.cnt", this.f114995d.f114989h);
                intent.putExtra("intent.key.need.show.syncmsg.btn", this.f114995d.f114990i);
                intent.setFlags(268435456);
                intent.setClass(this.f114995d, KidsWatchLoginFirstChooseSceneUI.class);
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$c */
    public static final class C42477c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirst f114996d;

        /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$c$a */
        public static final class C42478a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ KidsWatchLoginFirst f114997d;

            public C42478a(KidsWatchLoginFirst kidsWatchLoginFirst) {
                this.f114997d = kidsWatchLoginFirst;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.KidsWatchLoginFirst", "reg button clicked, isShowRegBtn:" + this.f114997d.f114988g);
                Intent intent = new Intent();
                String str = this.f114997d.f114985d;
                if (str != null) {
                    intent.putExtra("intent.key.login.url", str);
                    intent.putExtra("intent.key.device.name", this.f114997d.f114986e);
                    intent.setFlags(268435456);
                    intent.setClass(this.f114997d, KidsWatchRegGetInfoUI.class);
                    Context context = MMApplicationContext.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    KidsWatchLoginFirst kidsWatchLoginFirst = this.f114997d;
                    kidsWatchLoginFirst.f114991j = C52417a.SCENE_CHOOSE_REG;
                    C53066b bVar = C53066b.f148113a;
                    C53066b.C53067a aVar2 = C53066b.C53067a.ACCOUNT_TYPE_NORMAL;
                    String str2 = kidsWatchLoginFirst.f114985d;
                    if (str2 != null) {
                        bVar.mo73761a(aVar2, str2, C53066b.C53069c.LOGIN_TYPE_DEFAULT, C53066b.C53068b.LOGIN_RESULT_TURN_TO_REG, kidsWatchLoginFirst.f114989h, 0);
                    } else {
                        C87412m.m108603p("loginUrl");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("loginUrl");
                    throw null;
                }
            }
        }

        public C42477c(KidsWatchLoginFirst kidsWatchLoginFirst) {
            this.f114996d = kidsWatchLoginFirst;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76879j.m92739j(this.f114996d.getContext(), C0966R.string.g06, C0966R.string.g07, C0966R.string.f7935ws, C0966R.string.f7926wf, new C42478a(this.f114996d), (DialogInterface.OnClickListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst$d */
    public static final class C42479d extends C87413o implements C32224a<C52739e> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirst f114998d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42479d(KidsWatchLoginFirst kidsWatchLoginFirst) {
            super(0);
            this.f114998d = kidsWatchLoginFirst;
        }

        public Object invoke() {
            View findViewById = this.f114998d.findViewById(C0966R.C0970id.mes);
            int i = C0966R.C0970id.arj;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
            if (linearLayout != null) {
                i = C0966R.C0970id.f358387eu1;
                KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                if (kidsWatchHeadComponent != null) {
                    i = C0966R.C0970id.f7d;
                    InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                    if (inputPanelLinearLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                        i = C0966R.C0970id.g5b;
                        Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.g5b);
                        if (button != null) {
                            i = C0966R.C0970id.ijq;
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ijq);
                            if (linearLayout2 != null) {
                                i = C0966R.C0970id.ijs;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.ijs);
                                if (textView != null) {
                                    i = C0966R.C0970id.kqv;
                                    View a = C10462b.m10395a(findViewById, C0966R.C0970id.kqv);
                                    if (a != null) {
                                        return new C52739e(relativeLayout, linearLayout, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, button, linearLayout2, textView, a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public final C52739e mo66565H7() {
        return (C52739e) ((C36570n) this.f114992n).getValue();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b36;
    }

    public void initView() {
        Log.m105924i("MicroMsg.KidsWatchLoginFirst", "initView");
        setMMTitle("");
        String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        C87412m.m108591d(stringExtra);
        this.f114985d = stringExtra;
        int i = 0;
        this.f114989h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        this.f114986e = getIntent().getStringExtra("intent.key.device.name");
        this.f114987f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f114988g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f114990i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        mo66565H7().f147327a.setCloseBtnCallBack(new C42474a(this));
        mo66565H7().f147327a.f19755e.f39983b.setVisibility(0);
        Button button = mo66565H7().f147328b;
        C87412m.m108591d(button);
        button.setOnClickListener(new C42476b(this));
        LinearLayout linearLayout = mo66565H7().f147329c;
        if (linearLayout != null) {
            if (!this.f114988g) {
                i = 4;
            }
            linearLayout.setVisibility(i);
        }
        TextView textView = mo66565H7().f147330d;
        C87412m.m108591d(textView);
        textView.setOnClickListener(new C42477c(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            Log.m105924i("KidsWatchUtil", "setWindowStyle, activity:" + this + ", isShowStatusBar:" + true + ", isShowNavigationBar: " + false);
            getWindow().getDecorView().setSystemUiVisibility(5890);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
            getWindow().setFormat(-3);
        }
    }
}
