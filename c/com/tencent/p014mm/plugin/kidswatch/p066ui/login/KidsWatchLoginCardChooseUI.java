package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.kidswatch.model.KidsWatchAcctInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p192l4.C10462b;
import p286zl.C39376o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49305em2;
import v12.C52737c;
import w12.C53066b;
import w12.C53071f;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI */
public final class KidsWatchLoginCardChooseUI extends MMActivity implements C11385n {

    /* renamed from: o */
    public static final /* synthetic */ int f114968o = 0;

    /* renamed from: d */
    public String f114969d;

    /* renamed from: e */
    public String f114970e;

    /* renamed from: f */
    public String f114971f;

    /* renamed from: g */
    public boolean f114972g;

    /* renamed from: h */
    public int f114973h;

    /* renamed from: i */
    public boolean f114974i;

    /* renamed from: j */
    public C49305em2 f114975j;

    /* renamed from: n */
    public final C13601g f114976n = C36568h.m40985a(new C42473e(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$a */
    public static final class C42468a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginCardChooseUI f114977d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42468a(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
            super(0);
            this.f114977d = kidsWatchLoginCardChooseUI;
        }

        public Object invoke() {
            this.f114977d.finish();
            C53066b bVar = C53066b.f148113a;
            C53066b.C53067a aVar = C53066b.C53067a.ACCOUNT_TYPE_KIDS;
            KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f114977d;
            String str = kidsWatchLoginCardChooseUI.f114969d;
            if (str != null) {
                bVar.mo73761a(aVar, str, C53066b.C53069c.LOGIN_TYPE_DEFAULT, C53066b.C53068b.LOGIN_RESULT_CANCEL, kidsWatchLoginCardChooseUI.f114973h, 0);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$b */
    public static final class C42469b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginCardChooseUI f114978d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<KidsWatchAcctInfo> f114979e;

        /* renamed from: f */
        public final /* synthetic */ int f114980f;

        /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$b$a */
        public static final class C42470a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ KidsWatchLoginCardChooseUI f114981d;

            public C42470a(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
                this.f114981d = kidsWatchLoginCardChooseUI;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f114981d;
                C49305em2 em22 = kidsWatchLoginCardChooseUI.f114975j;
                C87412m.m108591d(em22);
                kidsWatchLoginCardChooseUI.mo66560I7(em22);
            }
        }

        public C42469b(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI, ArrayList<KidsWatchAcctInfo> arrayList, int i) {
            this.f114978d = kidsWatchLoginCardChooseUI;
            this.f114979e = arrayList;
            this.f114980f = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f114978d;
            KidsWatchAcctInfo kidsWatchAcctInfo = this.f114979e.get(this.f114980f);
            C87412m.m108593f(kidsWatchAcctInfo, "kidsList[i]");
            KidsWatchAcctInfo kidsWatchAcctInfo2 = kidsWatchAcctInfo;
            int i = KidsWatchLoginCardChooseUI.f114968o;
            kidsWatchLoginCardChooseUI.getClass();
            C49305em2 em22 = new C49305em2();
            em22.f133009d = kidsWatchAcctInfo2.f114957g;
            em22.f133010e = kidsWatchAcctInfo2.f114955e;
            em22.f133011f = kidsWatchAcctInfo2.f114956f;
            em22.f133012g = kidsWatchAcctInfo2.f114958h;
            em22.f133013h = kidsWatchAcctInfo2.f114954d;
            kidsWatchLoginCardChooseUI.f114975j = em22;
            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout");
            if (((KidsWatchCardLayout) view).f114959d) {
                C76879j.m92707A(this.f114978d.getContext(), this.f114978d.getString(C0966R.string.g0b), "", this.f114978d.getString(C0966R.string.g0a), this.f114978d.getString(C0966R.string.g0_), new C42470a(this.f114978d), (DialogInterface.OnClickListener) null);
            } else {
                KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI2 = this.f114978d;
                C49305em2 em23 = kidsWatchLoginCardChooseUI2.f114975j;
                C87412m.m108591d(em23);
                kidsWatchLoginCardChooseUI2.mo66560I7(em23);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$c */
    public static final class C42471c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginCardChooseUI f114982d;

        public C42471c(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
            this.f114982d = kidsWatchLoginCardChooseUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("KidsWatchLoginCardChooseUI", "click switch count button");
            Intent intent = new Intent();
            String str = this.f114982d.f114969d;
            if (str != null) {
                intent.putExtra("intent.key.login.url", str);
                intent.putExtra("intent.key.device.name", this.f114982d.f114970e);
                intent.putExtra("intent.key.ok.session.list", this.f114982d.f114971f);
                intent.putExtra("intent.key.ok.reg.btn", this.f114982d.f114972g);
                intent.putExtra("intent.key.kids.cnt", this.f114982d.f114973h);
                intent.putExtra("intent.key.enter.login.first", 2);
                intent.putExtra("intent.key.need.show.syncmsg.btn", this.f114982d.f114974i);
                intent.setFlags(268435456);
                intent.setClass(MMApplicationContext.getContext(), KidsWatchLoginFirst.class);
                Context context = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$d */
    public static final class C42472d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginCardChooseUI f114983d;

        public C42472d(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
            this.f114983d = kidsWatchLoginCardChooseUI;
        }

        public final void run() {
            KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f114983d;
            int i = KidsWatchLoginCardChooseUI.f114968o;
            kidsWatchLoginCardChooseUI.mo66559H7().f147323d.fullScroll(130);
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI$e */
    public static final class C42473e extends C87413o implements C32224a<C52737c> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginCardChooseUI f114984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42473e(KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
            super(0);
            this.f114984d = kidsWatchLoginCardChooseUI;
        }

        public Object invoke() {
            View findViewById = this.f114984d.findViewById(C0966R.C0970id.meq);
            int i = C0966R.C0970id.ag4;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
            if (linearLayout != null) {
                i = C0966R.C0970id.ag5;
                View a = C10462b.m10395a(findViewById, C0966R.C0970id.ag5);
                if (a != null) {
                    i = C0966R.C0970id.arj;
                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
                    if (linearLayout2 != null) {
                        i = C0966R.C0970id.f358387eu1;
                        KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                        if (kidsWatchHeadComponent != null) {
                            i = C0966R.C0970id.f7d;
                            InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                            if (inputPanelLinearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                i = C0966R.C0970id.j3t;
                                ScrollView scrollView = (ScrollView) C10462b.m10395a(findViewById, C0966R.C0970id.j3t);
                                if (scrollView != null) {
                                    i = C0966R.C0970id.kak;
                                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.kak);
                                    if (textView != null) {
                                        return new C52737c(relativeLayout, linearLayout, a, linearLayout2, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, scrollView, textView);
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
    public final C52737c mo66559H7() {
        return (C52737c) ((C36570n) this.f114976n).getValue();
    }

    /* renamed from: I7 */
    public final void mo66560I7(C49305em2 em22) {
        Log.m105924i("KidsWatchLoginCardChooseUI", "reLogin:" + em22 + ", userName:" + em22.f133009d);
        C86709a0.m107524d().mo123455a(972, this);
        String str = this.f114969d;
        if (str != null) {
            C86709a0.m107524d().mo123460f(new C53071f(str, this.f114971f, false, 2, em22));
            return;
        }
        C87412m.m108603p("loginUrl");
        throw null;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359843b34;
    }

    public void initView() {
        Log.m105924i("KidsWatchLoginCardChooseUI", "initView");
        KidsWatchHeadComponent kidsWatchHeadComponent = mo66559H7().f147322c;
        String string = getString(C0966R.string.g0e);
        C87412m.m108593f(string, "getString(R.string.kids_…_login_card_choose_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo66559H7().f147322c.setCloseBtnCallBack(new C42468a(this));
        String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        C87412m.m108591d(stringExtra);
        this.f114969d = stringExtra;
        this.f114970e = getIntent().getStringExtra("intent.key.device.name");
        this.f114972g = getIntent().getBooleanExtra("intent.key.ok.reg.btn", false);
        this.f114971f = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f114974i = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("intent.key.kids.list");
        C87412m.m108591d(parcelableArrayListExtra);
        this.f114973h = parcelableArrayListExtra.size();
        StringBuilder sb = new StringBuilder();
        sb.append("intent:<");
        String str = this.f114969d;
        if (str != null) {
            sb.append(str);
            sb.append(", ");
            sb.append(this.f114970e);
            sb.append(", ");
            sb.append(this.f114972g);
            sb.append(", ");
            sb.append(this.f114971f);
            sb.append(", ");
            sb.append(this.f114973h);
            sb.append('>');
            Log.m105924i("KidsWatchLoginCardChooseUI", sb.toString());
            int i = this.f114973h;
            for (int i2 = 0; i2 < i; i2++) {
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                KidsWatchCardLayout kidsWatchCardLayout = new KidsWatchCardLayout(context, (AttributeSet) null, 0);
                kidsWatchCardLayout.setId(i2);
                Object obj = parcelableArrayListExtra.get(i2);
                C87412m.m108593f(obj, "kidsList[i]");
                kidsWatchCardLayout.setData((KidsWatchAcctInfo) obj);
                if (i2 == this.f114973h - 1) {
                    ViewGroup.LayoutParams layoutParams = kidsWatchCardLayout.f114961f.f147315b.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    int round = Math.round(((float) C76577a.m92145A(kidsWatchCardLayout.getContext())) / C74942w4.m89787d(kidsWatchCardLayout.getContext()));
                    int a = C74942w4.m89784a(kidsWatchCardLayout.getContext(), 8);
                    if (round >= 375) {
                        a = C74942w4.m89784a(kidsWatchCardLayout.getContext(), 24);
                    }
                    layoutParams2.setMargins(a, 0, a, 0);
                    kidsWatchCardLayout.f114961f.f147315b.setLayoutParams(layoutParams2);
                }
                kidsWatchCardLayout.setOnClickListener(new C42469b(this, parcelableArrayListExtra, i2));
                mo66559H7().f147321b.addView(kidsWatchCardLayout);
            }
            mo66559H7().f147324e.setOnClickListener(new C42471c(this));
            mo66559H7().f147323d.post(new C42472d(this));
            return;
        }
        C87412m.m108603p("loginUrl");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C49305em2 em22;
        super.onActivityResult(i, i2, intent);
        if (i == 30846) {
            Log.m105924i("KidsWatchLoginCardChooseUI", "onActivityResult, " + i + ", " + i2);
            if (i2 == -1 && (em22 = this.f114975j) != null) {
                C87412m.m108591d(em22);
                mo66560I7(em22);
            }
        }
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C53066b.C53069c cVar = C53066b.C53069c.LOGIN_TYPE_DEFAULT;
        C53066b.C53067a aVar = C53066b.C53067a.ACCOUNT_TYPE_KIDS;
        Log.m105924i("KidsWatchLoginCardChooseUI", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str);
        if (yVar instanceof C53071f) {
            C86709a0.m107524d().mo123470p(972, this);
            if (i == 0 && i2 == 0) {
                C76912y0.m92768g(getContext(), getContext().getString(C0966R.string.g0v));
                C53066b bVar = C53066b.f148113a;
                String str2 = this.f114969d;
                if (str2 != null) {
                    bVar.mo73761a(aVar, str2, cVar, C53066b.C53068b.LOGIN_RESULT_SUCCESS, this.f114973h, i2);
                    C16094a aVar2 = C16094a.f43246a;
                    AppCompatActivity context = getContext();
                    C87412m.m108593f(context, "context");
                    aVar2.mo14690a(context, "", true);
                    return;
                }
                C87412m.m108603p("loginUrl");
                throw null;
            } else if (i == 4 && i2 == -9) {
                Log.m105924i("KidsWatchLoginCardChooseUI", i + ", " + i2 + ", showBlockBySpam");
                ((C39376o) C86312j.m106911c(C39376o.class)).mo61889FX(this, str, 30846);
            } else {
                C53066b bVar2 = C53066b.f148113a;
                String str3 = this.f114969d;
                if (str3 != null) {
                    bVar2.mo73761a(aVar, str3, cVar, C53066b.C53068b.LOGIN_RESULT_FAIL, this.f114973h, i2);
                    Log.m105924i("KidsWatchLoginCardChooseUI", i + ", " + i2 + ", showAlertWhenError");
                    C16094a aVar3 = C16094a.f43246a;
                    AppCompatActivity context2 = getContext();
                    C87412m.m108593f(context2, "context");
                    aVar3.mo14693d(context2, i2, str);
                    return;
                }
                C87412m.m108603p("loginUrl");
                throw null;
            }
        }
    }
}
