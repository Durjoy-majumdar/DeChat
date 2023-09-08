package com.tencent.p014mm.plugin.kidswatch.p066ui.reg;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p192l4.C10462b;
import p286zl.C112643j;
import pe3.C47465a;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C77687b;
import sf0.C77701p0;
import te3.C48832bb0;
import v12.C111314k;
import w12.C65924c;
import y12.C112369d;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI */
public final class KidsWatchRegRebindUI extends MMActivity implements C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f313482q = 0;

    /* renamed from: d */
    public String f313483d;

    /* renamed from: e */
    public String f313484e;

    /* renamed from: f */
    public String f313485f;

    /* renamed from: g */
    public String f313486g;

    /* renamed from: h */
    public String f313487h;

    /* renamed from: i */
    public String f313488i;

    /* renamed from: j */
    public String f313489j;

    /* renamed from: n */
    public C89779i0 f313490n;

    /* renamed from: o */
    public boolean f313491o;

    /* renamed from: p */
    public final C13601g f313492p = C36568h.m40985a(new C105442d(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI$a */
    public static final class C105439a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegRebindUI f313493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105439a(KidsWatchRegRebindUI kidsWatchRegRebindUI) {
            super(0);
            this.f313493d = kidsWatchRegRebindUI;
        }

        public Object invoke() {
            this.f313493d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI$b */
    public static final class C105440b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegRebindUI f313494d;

        public C105440b(KidsWatchRegRebindUI kidsWatchRegRebindUI) {
            this.f313494d = kidsWatchRegRebindUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchRegRebindUI kidsWatchRegRebindUI = this.f313494d;
            int i = KidsWatchRegRebindUI.f313482q;
            kidsWatchRegRebindUI.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("startExtReg, ");
            String str = kidsWatchRegRebindUI.f313485f;
            if (str != null) {
                sb.append(str);
                sb.append(", ");
                sb.append(kidsWatchRegRebindUI.f313491o);
                sb.append(", ");
                sb.append(kidsWatchRegRebindUI.f313488i);
                sb.append(", 4");
                Log.m105924i("MicroMsg.KidsWatchRegRebindUI", sb.toString());
                C86709a0.m107524d().mo123455a(5888, kidsWatchRegRebindUI);
                String str2 = kidsWatchRegRebindUI.f313485f;
                if (str2 != null) {
                    String str3 = kidsWatchRegRebindUI.f313484e;
                    if (str3 != null) {
                        boolean z = kidsWatchRegRebindUI.f313491o;
                        String str4 = kidsWatchRegRebindUI.f313483d;
                        if (str4 != null) {
                            String str5 = kidsWatchRegRebindUI.f313486g;
                            if (str5 != null) {
                                String str6 = kidsWatchRegRebindUI.f313487h;
                                if (str6 != null) {
                                    C65924c cVar = new C65924c(str2, str3, 4, z, str4, str5, str6);
                                    cVar.mo89958j1(kidsWatchRegRebindUI.f313488i);
                                    C86709a0.m107524d().mo123460f(cVar);
                                    kidsWatchRegRebindUI.f313490n = C76879j.m92723Q(kidsWatchRegRebindUI, kidsWatchRegRebindUI.getString(C0966R.string.a3h), kidsWatchRegRebindUI.getString(C0966R.string.g1c), true, true, new C112369d(cVar, kidsWatchRegRebindUI));
                                    C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
                    C87412m.m108603p("mobile");
                    throw null;
                }
                C87412m.m108603p("nickName");
                throw null;
            }
            C87412m.m108603p("nickName");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI$c */
    public static final class C105441c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegRebindUI f313495d;

        public C105441c(KidsWatchRegRebindUI kidsWatchRegRebindUI) {
            this.f313495d = kidsWatchRegRebindUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchRegRebindUI kidsWatchRegRebindUI = this.f313495d;
            int i = KidsWatchRegRebindUI.f313482q;
            kidsWatchRegRebindUI.getClass();
            Intent intent = new Intent(kidsWatchRegRebindUI, KidsWatchRegGetInfoUI.class);
            String str = kidsWatchRegRebindUI.f313483d;
            if (str != null) {
                intent.putExtra("intent.key.login.url", str);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                KidsWatchRegRebindUI kidsWatchRegRebindUI2 = kidsWatchRegRebindUI;
                C117292a.m165358d(kidsWatchRegRebindUI2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                kidsWatchRegRebindUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(kidsWatchRegRebindUI2, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegRebindUI$d */
    public static final class C105442d extends C87413o implements C32224a<C111314k> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegRebindUI f313496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105442d(KidsWatchRegRebindUI kidsWatchRegRebindUI) {
            super(0);
            this.f313496d = kidsWatchRegRebindUI;
        }

        public Object invoke() {
            View findViewById = this.f313496d.findViewById(C0966R.C0970id.mey);
            int i = C0966R.C0970id.ag4;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
            if (linearLayout != null) {
                i = C0966R.C0970id.arj;
                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
                if (linearLayout2 != null) {
                    i = C0966R.C0970id.az9;
                    Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.az9);
                    if (button != null) {
                        i = C0966R.C0970id.f358387eu1;
                        KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                        if (kidsWatchHeadComponent != null) {
                            i = C0966R.C0970id.f7d;
                            InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                            if (inputPanelLinearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                i = C0966R.C0970id.fhp;
                                RoundCornerImageView roundCornerImageView = (RoundCornerImageView) C10462b.m10395a(findViewById, C0966R.C0970id.fhp);
                                if (roundCornerImageView != null) {
                                    i = C0966R.C0970id.fhq;
                                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.fhq);
                                    if (textView != null) {
                                        i = C0966R.C0970id.iet;
                                        Button button2 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.iet);
                                        if (button2 != null) {
                                            return new C111314k(relativeLayout, linearLayout, linearLayout2, button, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, roundCornerImageView, textView, button2);
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
    public final C111314k mo150186H7() {
        return (C111314k) ((C36570n) this.f313492p).getValue();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3b;
    }

    public void initView() {
        String str = "";
        setMMTitle(str);
        KidsWatchHeadComponent kidsWatchHeadComponent = mo150186H7().f333270d;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo150186H7().f333270d.setCloseBtnCallBack(new C105439a(this));
        String stringExtra = getIntent().getStringExtra("intent.key.reg.head_img.file.id");
        C87412m.m108591d(stringExtra);
        this.f313486g = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("intent.key.reg.head_img.aes.key");
        C87412m.m108591d(stringExtra2);
        this.f313487h = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("intent.key.login.url");
        C87412m.m108591d(stringExtra3);
        this.f313483d = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("intent.key.reg.mobile");
        C87412m.m108591d(stringExtra4);
        this.f313484e = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("intent.key.reg.nickname");
        C87412m.m108591d(stringExtra5);
        this.f313485f = stringExtra5;
        this.f313488i = getIntent().getStringExtra("intent.key.reg.session.id");
        this.f313491o = getIntent().getBooleanExtra("intent.key.hasSetAvatar", false);
        String stringExtra6 = getIntent().getStringExtra("intent.key.reg.last.nickname");
        String stringExtra7 = getIntent().getStringExtra("intent.key.reg.last.head.img.url");
        TextView textView = mo150186H7().f333272f;
        if (!Util.isNullOrNil(stringExtra6)) {
            str = stringExtra6;
        }
        textView.setText(str);
        if (!Util.isNullOrNil(stringExtra7)) {
            int a = C74942w4.m89784a(getContext(), 16);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59359o = C0966R.C0969drawable.bfa;
            bVar.f59365u = (float) a;
            bVar.f59364t = true;
            C20828a.m22825b().mo32519h(stringExtra7, mo150186H7().f333271e, bVar.mo32666a());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("fileID:");
        String str2 = this.f313486g;
        if (str2 != null) {
            sb.append(str2);
            sb.append(", aeskey:");
            String str3 = this.f313487h;
            if (str3 != null) {
                sb.append(str3);
                sb.append(", loginUrl:");
                String str4 = this.f313483d;
                if (str4 != null) {
                    sb.append(str4);
                    sb.append(", nickName:");
                    String str5 = this.f313485f;
                    if (str5 != null) {
                        sb.append(str5);
                        sb.append(", regSessionId:");
                        sb.append(this.f313488i);
                        sb.append(", hasSetAvatar:");
                        sb.append(this.f313491o);
                        sb.append(", lastNickName:");
                        sb.append(stringExtra6);
                        sb.append(", lastImgUrl:");
                        sb.append(stringExtra7);
                        Log.m105924i("MicroMsg.KidsWatchRegRebindUI", sb.toString());
                        mo150186H7().f333273g.setOnClickListener(new C105440b(this));
                        mo150186H7().f333269c.setOnClickListener(new C105441c(this));
                        C16094a aVar = C16094a.f43246a;
                        AppCompatActivity context = getContext();
                        C87412m.m108593f(context, "context");
                        aVar.mo14692c(context, mo150186H7().f333268b, mo150186H7().f333267a);
                        return;
                    }
                    C87412m.m108603p("nickName");
                    throw null;
                }
                C87412m.m108603p("loginUrl");
                throw null;
            }
            C87412m.m108603p("headImgAesKey");
            throw null;
        }
        C87412m.m108603p("headImgFileID");
        throw null;
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
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        if (yVar2 instanceof C65924c) {
            Log.m105924i("MicroMsg.KidsWatchRegRebindUI", "errType:" + i3 + ", errCode:" + i4 + ", errMsg:" + str2);
            C89779i0 i0Var = this.f313490n;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C86709a0.m107524d().mo123470p(5888, this);
            String str3 = "";
            if (i3 == 0 && i4 == 0) {
                C65924c cVar = (C65924c) yVar2;
                C47465a aVar = cVar.f189524e.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                String str4 = ((C48832bb0) aVar).f131030e;
                C47465a aVar2 = cVar.f189524e.f127056b.f127083a;
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ExtRegResponse");
                String str5 = ((C48832bb0) aVar2).f131033h;
                C87412m.m108593f(str5, "rr.responseProtoBuf as ExtRegResponse).OpenID");
                this.f313489j = str5;
                if (str4 != null) {
                    str3 = str4;
                }
                C115669n.INSTANCE.mo160128e(21256, true, true, false, str3, 1, 0);
                StringBuilder sb = new StringBuilder();
                sb.append("gotoRegSuccessUI, nickName:");
                String str6 = this.f313485f;
                if (str6 != null) {
                    sb.append(str6);
                    sb.append(", openId:");
                    sb.append(this.f313489j);
                    Log.m105924i("MicroMsg.KidsWatchRegRebindUI", sb.toString());
                    Intent intent = new Intent(this, KidsWatchRegSuccessUI.class);
                    String str7 = this.f313483d;
                    if (str7 != null) {
                        intent.putExtra("intent.key.login.url", str7);
                        String str8 = this.f313485f;
                        if (str8 != null) {
                            intent.putExtra("intent.key.reg.nickname", str8);
                            intent.putExtra("intent.key.reg.openid", this.f313489j);
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(intent);
                            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar3.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "gotoRegSuccessUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
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
            if (!((C77687b) ((C112643j) C86312j.m106911c(C112643j.class)).mo164198dO()).mo107842c(this, new C77701p0(i3, i4, str2))) {
                C7660a a = C7660a.m7782a(str);
                if (a != null) {
                    a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                    return;
                }
                String string = getString(C0966R.string.g0w, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                C87412m.m108593f(string, "getString(R.string.kids_…or_tip, errType, errCode)");
                C76879j.m92748s(getContext(), string, str3);
            }
        }
    }
}
