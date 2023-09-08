package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p192l4.C10462b;
import p196ln.C76706g;
import p196ln.C76708i;
import p286zl.C39376o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49305em2;
import v12.C52741g;
import w12.C53066b;
import w12.C53071f;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI */
public final class KidsWatchLoginFirstChooseSceneUI extends MMActivity implements C11385n {

    /* renamed from: d */
    public final String f115002d = "MicroMsg.KidsWatchLoginFirstChooseSceneUI";

    /* renamed from: e */
    public final int f115003e = C74942w4.m89784a(getContext(), 16);

    /* renamed from: f */
    public int f115004f;

    /* renamed from: g */
    public String f115005g;

    /* renamed from: h */
    public int f115006h;

    /* renamed from: i */
    public String f115007i;

    /* renamed from: j */
    public boolean f115008j;

    /* renamed from: n */
    public RelativeLayout f115009n;

    /* renamed from: o */
    public CheckBox f115010o;

    /* renamed from: p */
    public final C13601g f115011p = C36568h.m40985a(new C42488g(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$a */
    public static final class C42482a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115012d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42482a(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            super(0);
            this.f115012d = kidsWatchLoginFirstChooseSceneUI;
        }

        public Object invoke() {
            this.f115012d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$b */
    public static final class C42483b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115013d;

        public C42483b(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            this.f115013d = kidsWatchLoginFirstChooseSceneUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f115013d;
            kidsWatchLoginFirstChooseSceneUI.f115004f = 0;
            kidsWatchLoginFirstChooseSceneUI.mo66571J7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$c */
    public static final class C42484c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115014d;

        public C42484c(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            this.f115014d = kidsWatchLoginFirstChooseSceneUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f115014d;
            kidsWatchLoginFirstChooseSceneUI.f115004f = 1;
            kidsWatchLoginFirstChooseSceneUI.mo66571J7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$d */
    public static final class C42485d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115015d;

        public C42485d(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            this.f115015d = kidsWatchLoginFirstChooseSceneUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f115015d, KidsWatchLoginFirstChooseHelpUI.class);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f115015d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI2 = kidsWatchLoginFirstChooseSceneUI;
            C117292a.m165358d(kidsWatchLoginFirstChooseSceneUI2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            kidsWatchLoginFirstChooseSceneUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(kidsWatchLoginFirstChooseSceneUI2, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$e */
    public static final class C42486e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115016d;

        public C42486e(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            this.f115016d = kidsWatchLoginFirstChooseSceneUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI = this.f115016d;
            String str = kidsWatchLoginFirstChooseSceneUI.f115005g;
            C87412m.m108591d(str);
            KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI2 = this.f115016d;
            kidsWatchLoginFirstChooseSceneUI.mo66569H7(str, kidsWatchLoginFirstChooseSceneUI2.f115007i, kidsWatchLoginFirstChooseSceneUI2.f115004f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$f */
    public static final class C42487f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115017d;

        public C42487f(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            this.f115017d = kidsWatchLoginFirstChooseSceneUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f115017d.f115010o;
            if (checkBox == null) {
                C87412m.m108603p("syncMsgCb");
                throw null;
            } else if (checkBox != null) {
                checkBox.setChecked(!checkBox.isChecked());
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseSceneUI$initView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C87412m.m108603p("syncMsgCb");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI$g */
    public static final class C42488g extends C87413o implements C32224a<C52741g> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseSceneUI f115018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42488g(KidsWatchLoginFirstChooseSceneUI kidsWatchLoginFirstChooseSceneUI) {
            super(0);
            this.f115018d = kidsWatchLoginFirstChooseSceneUI;
        }

        public Object invoke() {
            View findViewById = this.f115018d.findViewById(C0966R.C0970id.meu);
            int i = C0966R.C0970id.a1q;
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) C10462b.m10395a(findViewById, C0966R.C0970id.a1q);
            if (roundCornerImageView != null) {
                i = C0966R.C0970id.ag4;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
                if (linearLayout != null) {
                    i = C0966R.C0970id.arj;
                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
                    if (linearLayout2 != null) {
                        i = C0966R.C0970id.f357870c72;
                        LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f357870c72);
                        if (linearLayout3 != null) {
                            i = C0966R.C0970id.f358387eu1;
                            KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                            if (kidsWatchHeadComponent != null) {
                                i = C0966R.C0970id.f7d;
                                InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                                if (inputPanelLinearLayout != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                    i = C0966R.C0970id.g5a;
                                    WeImageView weImageView = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.g5a);
                                    if (weImageView != null) {
                                        i = C0966R.C0970id.g5b;
                                        Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.g5b);
                                        if (button != null) {
                                            i = C0966R.C0970id.g5e;
                                            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(findViewById, C0966R.C0970id.g5e);
                                            if (weImageView2 != null) {
                                                i = C0966R.C0970id.kbf;
                                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.kbf);
                                                if (textView != null) {
                                                    i = C0966R.C0970id.mjh;
                                                    CheckBox checkBox = (CheckBox) C10462b.m10395a(findViewById, C0966R.C0970id.mjh);
                                                    if (checkBox != null) {
                                                        i = C0966R.C0970id.mji;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) C10462b.m10395a(findViewById, C0966R.C0970id.mji);
                                                        if (relativeLayout2 != null) {
                                                            return new C52741g(relativeLayout, roundCornerImageView, linearLayout, linearLayout2, linearLayout3, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, weImageView, button, weImageView2, textView, checkBox, relativeLayout2);
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
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: H7 */
    public final boolean mo66569H7(String str, String str2, int i) {
        String str3 = this.f115002d;
        Log.m105924i(str3, "doLoginOK, login:" + str + ", okSession:" + str2 + ", scene:" + i);
        C86709a0.m107524d().mo123455a(972, this);
        CheckBox checkBox = this.f115010o;
        if (checkBox != null) {
            C86709a0.m107524d().mo123460f(new C53071f(str, str2, checkBox.isChecked(), i, (C49305em2) null));
            return true;
        }
        C87412m.m108603p("syncMsgCb");
        throw null;
    }

    /* renamed from: I7 */
    public final C52741g mo66570I7() {
        return (C52741g) ((C36570n) this.f115011p).getValue();
    }

    /* renamed from: J7 */
    public final void mo66571J7() {
        WeImageView weImageView = mo66570I7().f147339f;
        int i = 0;
        if (weImageView != null) {
            weImageView.setVisibility(this.f115004f == 0 ? 0 : 8);
        }
        WeImageView weImageView2 = mo66570I7().f147341h;
        if (weImageView2 != null) {
            weImageView2.setVisibility(this.f115004f == 1 ? 0 : 8);
        }
        RelativeLayout relativeLayout = this.f115009n;
        if (relativeLayout != null) {
            if (!this.f115008j || this.f115004f != 0) {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            return;
        }
        C87412m.m108603p("syncMsgRl");
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
        return C0966R.C0971layout.b38;
    }

    public void initView() {
        this.f115005g = getIntent().getStringExtra("intent.key.login.url");
        int i = 0;
        this.f115006h = getIntent().getIntExtra("intent.key.kids.cnt", 0);
        getIntent().getStringExtra("intent.key.device.name");
        this.f115007i = getIntent().getStringExtra("intent.key.ok.session.list");
        this.f115008j = getIntent().getBooleanExtra("intent.key.need.show.syncmsg.btn", false);
        mo66570I7().f147338e.setCloseIconResId(C0966R.C0969drawable.bsw);
        mo66570I7().f147338e.setCloseBtnCallBack(new C42482a(this));
        View findViewById = findViewById(C0966R.C0970id.mji);
        C87412m.m108593f(findViewById, "findViewById(R.id.sync_msg_rl)");
        this.f115009n = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.mjh);
        C87412m.m108593f(findViewById2, "findViewById(R.id.sync_msg_checkbox)");
        this.f115010o = (CheckBox) findViewById2;
        String s = C75592q0.m90789s();
        RoundCornerImageView roundCornerImageView = mo66570I7().f147334a;
        int i2 = this.f115003e;
        roundCornerImageView.f220448f = i2;
        roundCornerImageView.f220449g = i2;
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(s);
        if (N50 == null) {
            N50 = AvatarStorage.m80444f(((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93559h(s, false), s, false);
        }
        if (N50 != null) {
            mo66570I7().f147334a.setImageBitmap(N50);
        }
        WeImageView weImageView = mo66570I7().f147339f;
        ViewParent parent = weImageView != null ? weImageView.getParent() : null;
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setOnClickListener(new C42483b(this));
        WeImageView weImageView2 = mo66570I7().f147341h;
        ViewParent parent2 = weImageView2 != null ? weImageView2.getParent() : null;
        C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
        ((View) parent2).setOnClickListener(new C42484c(this));
        mo66571J7();
        LinearLayout linearLayout = mo66570I7().f147337d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new C42485d(this));
        }
        mo66570I7().f147340g.setOnClickListener(new C42486e(this));
        C16094a aVar = C16094a.f43246a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        aVar.mo14692c(context, mo66570I7().f147336c, mo66570I7().f147335b);
        RelativeLayout relativeLayout = this.f115009n;
        if (relativeLayout != null) {
            if (!this.f115008j || this.f115004f != 0) {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            CheckBox checkBox = this.f115010o;
            if (checkBox != null) {
                checkBox.setChecked(true);
                RelativeLayout relativeLayout2 = this.f115009n;
                if (relativeLayout2 != null) {
                    relativeLayout2.setOnClickListener(new C42487f(this));
                } else {
                    C87412m.m108603p("syncMsgRl");
                    throw null;
                }
            } else {
                C87412m.m108603p("syncMsgCb");
                throw null;
            }
        } else {
            C87412m.m108603p("syncMsgRl");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30846) {
            String str = this.f115002d;
            Log.m105924i(str, "onActivityResult, " + i + ", " + i2);
            if (i2 == -1) {
                String str2 = this.f115005g;
                C87412m.m108591d(str2);
                mo66569H7(str2, this.f115007i, this.f115004f);
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        C87412m.m108591d(supportActionBar);
        supportActionBar.mo91104o();
        setSelfNavigationBarVisible(8);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.YellowK));
        setMMTitle("");
        initView();
        overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        C53066b.C53068b bVar = C53066b.C53068b.LOGIN_RESULT_SUCCESS;
        C53066b.C53069c cVar = C53066b.C53069c.LOGIN_TYPE_BOTH;
        C53066b.C53069c cVar2 = C53066b.C53069c.LOGIN_TYPE_WATCH_ONLY;
        C53066b.C53067a aVar = C53066b.C53067a.ACCOUNT_TYPE_NORMAL;
        String str3 = this.f115002d;
        Log.m105924i(str3, "onSceneEnd: errType = " + i + " errCode = " + i4 + " errMsg = " + str2);
        if (yVar2 instanceof C53071f) {
            String str4 = this.f115002d;
            ((C53071f) yVar2).getClass();
            Log.m105925i(str4, "onSceneEnd type[%d]", 972);
            C86709a0.m107524d().mo123470p(972, this);
            if (i3 == 0 && i4 == 0) {
                int i5 = C0966R.string.g0u;
                if (this.f115004f == 0) {
                    Log.m105924i(this.f115002d, "top");
                    C53066b bVar2 = C53066b.f148113a;
                    String str5 = this.f115005g;
                    C87412m.m108591d(str5);
                    bVar2.mo73761a(aVar, str5, cVar, bVar, this.f115006h, i2);
                } else {
                    i5 = C0966R.string.g0v;
                    C53066b bVar3 = C53066b.f148113a;
                    String str6 = this.f115005g;
                    C87412m.m108591d(str6);
                    bVar3.mo73761a(aVar, str6, cVar2, bVar, this.f115006h, i2);
                }
                String string = getContext().getString(i5);
                C87412m.m108593f(string, "context.getString(toastTip)");
                String str7 = this.f115002d;
                Log.m105924i(str7, "Tips: " + string);
                C76912y0.m92768g(getContext(), string);
                C16094a aVar2 = C16094a.f43246a;
                AppCompatActivity context = getContext();
                C87412m.m108593f(context, "context");
                aVar2.mo14690a(context, "", true);
            } else if (i3 == 4 && i4 == -9) {
                Log.m105924i(this.f115002d, "showBlockBySpam");
                ((C39376o) C86312j.m106911c(C39376o.class)).mo61889FX(this, str2, 30846);
            } else {
                C53066b bVar4 = C53066b.f148113a;
                String str8 = this.f115005g;
                C87412m.m108591d(str8);
                if (this.f115004f != 0) {
                    cVar = cVar2;
                }
                bVar4.mo73761a(aVar, str8, cVar, C53066b.C53068b.LOGIN_RESULT_FAIL, this.f115006h, i2);
                C16094a aVar3 = C16094a.f43246a;
                AppCompatActivity context2 = getContext();
                C87412m.m108593f(context2, "context");
                aVar3.mo14693d(context2, i4, str2);
            }
        }
    }
}
