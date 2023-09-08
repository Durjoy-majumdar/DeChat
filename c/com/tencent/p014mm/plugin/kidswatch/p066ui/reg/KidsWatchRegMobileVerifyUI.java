package com.tencent.p014mm.plugin.kidswatch.p066ui.reg;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMClearEditText;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p192l4.C10462b;
import p214om.C11502f;
import p286zl.C112643j;
import p550hn.C108250b;
import p550hn.C108251c;
import pe3.C47465a;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C77687b;
import sf0.C77701p0;
import te3.C48832bb0;
import v12.C111313j;
import w12.C65924c;
import y12.C112368c;
import y12.C66490b;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Lcom/tencent/mm/ui/widget/a$d;", "<init>", "()V", "a", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI */
public final class KidsWatchRegMobileVerifyUI extends MMActivity implements C11385n, C74965a.C74969d {

    /* renamed from: s */
    public static final /* synthetic */ int f313463s = 0;

    /* renamed from: d */
    public String f313464d;

    /* renamed from: e */
    public String f313465e;

    /* renamed from: f */
    public String f313466f;

    /* renamed from: g */
    public String f313467g;

    /* renamed from: h */
    public String f313468h;

    /* renamed from: i */
    public C89779i0 f313469i;

    /* renamed from: j */
    public final String f313470j = "+86";

    /* renamed from: n */
    public boolean f313471n;

    /* renamed from: o */
    public String f313472o;

    /* renamed from: p */
    public String f313473p;

    /* renamed from: q */
    public C105433a f313474q;

    /* renamed from: r */
    public final C13601g f313475r = C36568h.m40985a(new C105438f(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$a */
    public final class C105433a extends CountDownTimer {
        public C105433a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = KidsWatchRegMobileVerifyUI.this;
            int i = KidsWatchRegMobileVerifyUI.f313463s;
            kidsWatchRegMobileVerifyUI.mo150177H7().f333266j.setEnabled(true);
            KidsWatchRegMobileVerifyUI.this.mo150177H7().f333266j.setText(KidsWatchRegMobileVerifyUI.this.getString(C0966R.string.g1_));
            KidsWatchRegMobileVerifyUI.this.mo150177H7().f333266j.setTextColor(KidsWatchRegMobileVerifyUI.this.getContext().getResources().getColor(C0966R.color.f3191if));
        }

        public void onTick(long j) {
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = KidsWatchRegMobileVerifyUI.this;
            int i = KidsWatchRegMobileVerifyUI.f313463s;
            Button button = kidsWatchRegMobileVerifyUI.mo150177H7().f333266j;
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI2 = KidsWatchRegMobileVerifyUI.this;
            button.setText(kidsWatchRegMobileVerifyUI2.getString(C0966R.string.g19, new Object[]{"" + (j / ((long) 1000))}));
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$b */
    public static final class C105434b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegMobileVerifyUI f313477d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105434b(KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
            super(0);
            this.f313477d = kidsWatchRegMobileVerifyUI;
        }

        public Object invoke() {
            this.f313477d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$c */
    public static final class C105435c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegMobileVerifyUI f313478d;

        public C105435c(KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
            this.f313478d = kidsWatchRegMobileVerifyUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f313478d;
            int i = KidsWatchRegMobileVerifyUI.f313463s;
            kidsWatchRegMobileVerifyUI.mo150178I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$d */
    public static final class C105436d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegMobileVerifyUI f313479d;

        public C105436d(KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
            this.f313479d = kidsWatchRegMobileVerifyUI;
        }

        public void afterTextChanged(Editable editable) {
            C87412m.m108594g(editable, "s");
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f313479d;
            int i = KidsWatchRegMobileVerifyUI.f313463s;
            kidsWatchRegMobileVerifyUI.mo150177H7().f333259c.setEnabled(!Util.isNullOrNil(editable.toString()));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C87412m.m108594g(charSequence, "s");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$e */
    public static final class C105437e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegMobileVerifyUI f313480d;

        public C105437e(KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
            this.f313480d = kidsWatchRegMobileVerifyUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "click finish button, code:24");
            this.f313480d.hideVKB();
            KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f313480d;
            kidsWatchRegMobileVerifyUI.f313469i = C76879j.m92723Q(kidsWatchRegMobileVerifyUI, kidsWatchRegMobileVerifyUI.getString(C0966R.string.a3h), this.f313480d.getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
            String obj = this.f313480d.mo150177H7().f333263g.getText().toString();
            C86709a0.m107524d().mo123455a(145, this.f313480d);
            C108251c w102 = ((C108250b) C86312j.m106911c(C108250b.class)).w10(this.f313480d.f313465e, 24, obj, 0, "");
            w102.mo91367W(this.f313480d.f313468h);
            String str = this.f313480d.f313464d;
            if (str != null) {
                w102.mo91369f0(str);
                C86709a0.m107524d().mo123460f((C117747y) w102);
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI$f */
    public static final class C105438f extends C87413o implements C32224a<C111313j> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegMobileVerifyUI f313481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105438f(KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
            super(0);
            this.f313481d = kidsWatchRegMobileVerifyUI;
        }

        public Object invoke() {
            View findViewById = this.f313481d.findViewById(C0966R.C0970id.mex);
            int i = C0966R.C0970id.ag4;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
            if (linearLayout != null) {
                i = C0966R.C0970id.ah6;
                View a = C10462b.m10395a(findViewById, C0966R.C0970id.ah6);
                if (a != null) {
                    i = C0966R.C0970id.e9n;
                    Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.e9n);
                    if (button != null) {
                        i = C0966R.C0970id.f358387eu1;
                        KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                        if (kidsWatchHeadComponent != null) {
                            i = C0966R.C0970id.f5w;
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f5w);
                            if (linearLayout2 != null) {
                                i = C0966R.C0970id.f7d;
                                InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                                if (inputPanelLinearLayout != null) {
                                    i = C0966R.C0970id.f7e;
                                    MMClearEditText mMClearEditText = (MMClearEditText) C10462b.m10395a(findViewById, C0966R.C0970id.f7e);
                                    if (mMClearEditText != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                        i = C0966R.C0970id.gkn;
                                        LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.gkn);
                                        if (linearLayout3 != null) {
                                            i = C0966R.C0970id.gvr;
                                            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.gvr);
                                            if (textView != null) {
                                                i = C0966R.C0970id.iq_;
                                                Button button2 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.iq_);
                                                if (button2 != null) {
                                                    return new C111313j(relativeLayout, linearLayout, a, button, kidsWatchHeadComponent, linearLayout2, inputPanelLinearLayout, mMClearEditText, relativeLayout, linearLayout3, textView, button2);
                                                }
                                            }
                                        }
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
    public final C111313j mo150177H7() {
        return (C111313j) ((C36570n) this.f313475r).getValue();
    }

    /* renamed from: I7 */
    public final void mo150178I7() {
        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "startSmsListener");
        C105433a aVar = this.f313474q;
        if (aVar != null) {
            aVar.cancel();
        } else {
            this.f313474q = new C105433a(60000, 1000);
        }
        mo150177H7().f333266j.setEnabled(false);
        mo150177H7().f333266j.setTextColor(getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3_k));
        C105433a aVar2 = this.f313474q;
        if (aVar2 != null) {
            aVar2.start();
        }
        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "requestSms, opCode:23");
        C86709a0.m107524d().mo123455a(145, this);
        this.f313469i = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hwo), true, true, C66490b.f191273d);
        C108251c Qd0 = ((C108250b) C86312j.m106911c(C108250b.class)).Qd0(this.f313470j + this.f313465e, 23, "", 0, "", 0);
        Qd0.mo91367W(this.f313468h);
        String str = this.f313464d;
        if (str != null) {
            Qd0.mo91369f0(str);
            C86709a0.m107524d().mo123460f((C117747y) Qd0);
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
        return C0966R.C0971layout.b3a;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        Log.m105925i("MicroMsg.KidsWatchRegMobileVerifyUI", "keyboard show %s, keyboardHeight %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            mo150177H7().f333261e.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = mo150177H7().f333257a.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3743cv);
            marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3749d0);
            mo150177H7().f333257a.setLayoutParams(marginLayoutParams);
            mo150177H7().f333262f.setPadding(mo150177H7().f333262f.getPaddingLeft(), mo150177H7().f333262f.getPaddingTop(), mo150177H7().f333262f.getPaddingRight(), i);
            mo150177H7().f333262f.requestLayout();
            return;
        }
        mo150177H7().f333261e.setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = mo150177H7().f333257a.getLayoutParams();
        C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3709c2);
        marginLayoutParams2.topMargin = 0;
        mo150177H7().f333257a.setLayoutParams(marginLayoutParams2);
        mo150177H7().f333262f.setPadding(mo150177H7().f333262f.getPaddingLeft(), mo150177H7().f333262f.getPaddingTop(), mo150177H7().f333262f.getPaddingRight(), 0);
    }

    public void initView() {
        setMMTitle("");
        KidsWatchHeadComponent kidsWatchHeadComponent = mo150177H7().f333260d;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo150177H7().f333260d.setCloseBtnCallBack(new C105434b(this));
        mo150177H7().f333262f.mo104200a(this);
        String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        C87412m.m108591d(stringExtra);
        this.f313464d = stringExtra;
        this.f313465e = getIntent().getStringExtra("intent.key.reg.mobile");
        String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        C87412m.m108591d(stringExtra2);
        this.f313466f = stringExtra2;
        this.f313468h = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f313471n = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        String stringExtra3 = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        C87412m.m108591d(stringExtra3);
        this.f313472o = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        C87412m.m108591d(stringExtra4);
        this.f313473p = stringExtra4;
        mo150178I7();
        mo150177H7().f333266j.setOnClickListener(new C105435c(this));
        mo150177H7().f333263g.addTextChangedListener(new C105436d(this));
        mo150177H7().f333259c.setEnabled(false);
        mo150177H7().f333259c.setOnClickListener(new C105437e(this));
        mo150177H7().f333265i.setText(this.f313465e);
        C16094a aVar = C16094a.f43246a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        aVar.mo14692c(context, mo150177H7().f333264h, mo150177H7().f333257a);
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

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        C105433a aVar = this.f313474q;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    public void onPause() {
        super.onPause();
        mo150177H7().f333262f.mo104200a((C74965a.C74969d) null);
        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "stopSmsListener");
        C105433a aVar = this.f313474q;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    public void onResume() {
        super.onResume();
        mo150177H7().f333262f.mo104200a(this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Class cls = C112643j.class;
        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        C89779i0 i0Var = this.f313469i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        String str3 = "";
        if (yVar2 instanceof C108251c) {
            C86709a0.m107524d().mo123470p(145, this);
            C108251c cVar = (C108251c) yVar2;
            int f = cVar.mo91368f();
            Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneBindMobileForReg, opCode:" + f);
            if (f != 23) {
                if (f == 24) {
                    if (i4 == -212) {
                        String I = cVar.mo91362I();
                        String q0 = cVar.mo91379q0();
                        if (Util.isNullOrNil(I)) {
                            Log.m105920e("MicroMsg.KidsWatchRegMobileVerifyUI", "rebind but last nickname is empty");
                        }
                        String str4 = this.f313468h;
                        C87412m.m108591d(str4);
                        Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "gotoRebindUI, regSessionId:" + str4 + ", lastNickName:" + I + ", lastHeadImgUrl:" + q0);
                        finish();
                        Intent intent = new Intent(this, KidsWatchRegRebindUI.class);
                        String str5 = this.f313464d;
                        if (str5 != null) {
                            intent.putExtra("intent.key.login.url", str5);
                            String str6 = this.f313466f;
                            if (str6 != null) {
                                intent.putExtra("intent.key.reg.nickname", str6);
                                intent.putExtra("intent.key.reg.last.nickname", I);
                                intent.putExtra("intent.key.reg.last.head.img.url", q0);
                                intent.putExtra("intent.key.reg.mobile", this.f313465e);
                                intent.putExtra("intent.key.reg.session.id", str4);
                                intent.putExtra("intent.key.hasSetAvatar", this.f313471n);
                                String str7 = this.f313472o;
                                if (str7 != null) {
                                    intent.putExtra("intent.key.reg.head_img.file.id", str7);
                                    String str8 = this.f313473p;
                                    if (str8 != null) {
                                        intent.putExtra("intent.key.reg.head_img.aes.key", str8);
                                        C9556a aVar = new C9556a();
                                        aVar.mo10233c(intent);
                                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        startActivity((Intent) aVar.mo10231a(0));
                                        C117292a.m165359e(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRebindUI", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        return;
                                    }
                                    C87412m.m108603p("headImgAesKey");
                                    throw null;
                                }
                                C87412m.m108603p("headImgFileID");
                                throw null;
                            }
                            C87412m.m108603p("nickName");
                            throw null;
                        }
                        C87412m.m108603p("loginUrl");
                        throw null;
                    } else if (i4 == -35) {
                    } else {
                        if (i4 != 0) {
                            if (!((C77687b) ((C112643j) C86312j.m106911c(cls)).mo164198dO()).mo107842c(this, new C77701p0(i3, i4, str2))) {
                                String string = getString(C0966R.string.g0w, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                                C87412m.m108593f(string, "getString(R.string.kids_…or_tip, errType, errCode)");
                                C76879j.m92748s(getContext(), string, str3);
                                return;
                            }
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("startExtReg, ");
                        String str9 = this.f313466f;
                        if (str9 != null) {
                            sb.append(str9);
                            sb.append(", ");
                            sb.append(this.f313471n);
                            sb.append(", ");
                            sb.append(this.f313468h);
                            sb.append(", 4");
                            Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", sb.toString());
                            C86709a0.m107524d().mo123455a(5888, this);
                            String str10 = this.f313466f;
                            if (str10 != null) {
                                String str11 = this.f313470j + this.f313465e;
                                boolean z = this.f313471n;
                                String str12 = this.f313464d;
                                if (str12 != null) {
                                    String str13 = this.f313472o;
                                    if (str13 != null) {
                                        String str14 = this.f313473p;
                                        if (str14 != null) {
                                            C65924c cVar2 = new C65924c(str10, str11, 4, z, str12, str13, str14);
                                            cVar2.mo89958j1(this.f313468h);
                                            C86709a0.m107524d().mo123460f(cVar2);
                                            this.f313469i = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.g1c), true, true, new C112368c(cVar2, this));
                                            return;
                                        }
                                        C87412m.m108603p("headImgAesKey");
                                        throw null;
                                    }
                                    C87412m.m108603p("headImgFileID");
                                    throw null;
                                }
                                C87412m.m108603p("loginUrl");
                                throw null;
                            }
                            C87412m.m108603p("nickName");
                            throw null;
                        }
                        C87412m.m108603p("nickName");
                        throw null;
                    }
                }
            } else if (i4 == 0) {
            } else {
                if (i4 == -41) {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                } else if (i4 == -34) {
                    C76879j.m92748s(this, getString(C0966R.string.ajx), str3);
                } else {
                    if (!((C77687b) ((C112643j) C86312j.m106911c(cls)).mo164198dO()).mo107842c(this, new C77701p0(i3, i4, str2))) {
                        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93163uP(this, i3, i4, str2);
                    }
                }
            }
        } else if (yVar2 instanceof C65924c) {
            Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", "NetSceneExtReg");
            C86709a0.m107524d().mo123470p(5888, this);
            if (i3 == 0 && i4 == 0) {
                C65924c cVar3 = (C65924c) yVar2;
                C47465a aVar2 = cVar3.f189524e.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                String str15 = ((C48832bb0) aVar2).f131030e;
                C47465a aVar3 = cVar3.f189524e.f127056b.f127083a;
                C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                String str16 = ((C48832bb0) aVar3).f131033h;
                C87412m.m108593f(str16, "rr.responseProtoBuf as ExtRegResponse).OpenID");
                this.f313467g = str16;
                if (str15 != null) {
                    str3 = str15;
                }
                C115669n.INSTANCE.mo160128e(21256, true, true, false, str3, 1, 0);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("gotoRegSuccessUI, nickName:");
                String str17 = this.f313466f;
                if (str17 != null) {
                    sb4.append(str17);
                    sb4.append(", openId:");
                    sb4.append(this.f313467g);
                    Log.m105924i("MicroMsg.KidsWatchRegMobileVerifyUI", sb4.toString());
                    finish();
                    Intent intent2 = new Intent(this, KidsWatchRegSuccessUI.class);
                    String str18 = this.f313464d;
                    if (str18 != null) {
                        intent2.putExtra("intent.key.login.url", str18);
                        String str19 = this.f313466f;
                        if (str19 != null) {
                            intent2.putExtra("intent.key.reg.nickname", str19);
                            intent2.putExtra("intent.key.reg.openid", this.f313467g);
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(intent2);
                            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar4.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return;
                        }
                        C87412m.m108603p("nickName");
                        throw null;
                    }
                    C87412m.m108603p("loginUrl");
                    throw null;
                }
                C87412m.m108603p("nickName");
                throw null;
            }
            C115669n.INSTANCE.mo160128e(21256, true, true, false, str3, 2, Integer.valueOf(i2));
            if (!((C77687b) ((C112643j) C86312j.m106911c(cls)).mo164198dO()).mo107842c(this, new C77701p0(i3, i4, str2))) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                }
                AppCompatActivity context = getContext();
                String format = String.format("注册失败，错误码(%s, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
                C87412m.m108593f(format, "format(format, *args)");
                C76879j.m92748s(context, format, str3);
            }
        }
    }
}
