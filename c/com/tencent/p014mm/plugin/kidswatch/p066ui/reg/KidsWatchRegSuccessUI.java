package com.tencent.p014mm.plugin.kidswatch.p066ui.reg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fk0.C86910b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import nj3.C88989a;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v12.C14406l;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI */
public final class KidsWatchRegSuccessUI extends MMActivity {

    /* renamed from: d */
    public String f19764d;

    /* renamed from: e */
    public String f19765e;

    /* renamed from: f */
    public String f19766f;

    /* renamed from: g */
    public final C13601g f19767g = C36568h.m40985a(new C4748c(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI$a */
    public static final class C4746a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegSuccessUI f19768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4746a(KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
            super(0);
            this.f19768d = kidsWatchRegSuccessUI;
        }

        public Object invoke() {
            C16094a aVar = C16094a.f43246a;
            AppCompatActivity context = this.f19768d.getContext();
            C87412m.m108593f(context, "context");
            String str = this.f19768d.f19764d;
            if (str != null) {
                aVar.mo14690a(context, str, false);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("loginUrl");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI$b */
    public static final class C4747b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegSuccessUI f19769d;

        public C4747b(KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
            this.f19769d = kidsWatchRegSuccessUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Object[] objArr = new Object[1];
            String str = this.f19769d.f19766f;
            if (str != null) {
                objArr[0] = str;
                String format = String.format("/pages/home/home.html?scene=register&openid=%s", Arrays.copyOf(objArr, 1));
                C87412m.m108593f(format, "format(format, *args)");
                Log.m105924i("MicroMsg.KidsWatchRegSuccessUI", "goWebUIBtn, path:" + format);
                C16094a aVar = C16094a.f43246a;
                AppCompatActivity context = this.f19769d.getContext();
                C87412m.m108593f(context, "context");
                aVar.mo14690a(context, "", true);
                AppCompatActivity context2 = this.f19769d.getContext();
                C87412m.m108593f(context2, "context");
                aVar.mo14691b(context2, "wxaaff6b96fc2cd3c6", format, C86910b.CTRL_INDEX, "2");
                C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("openId");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI$c */
    public static final class C4748c extends C87413o implements C32224a<C14406l> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegSuccessUI f19770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4748c(KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
            super(0);
            this.f19770d = kidsWatchRegSuccessUI;
        }

        public Object invoke() {
            View findViewById = this.f19770d.findViewById(C0966R.C0970id.mez);
            int i = C0966R.C0970id.ag4;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
            if (linearLayout != null) {
                i = C0966R.C0970id.f357848c23;
                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f357848c23);
                if (textView != null) {
                    i = C0966R.C0970id.eps;
                    Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.eps);
                    if (button != null) {
                        i = C0966R.C0970id.f358387eu1;
                        KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                        if (kidsWatchHeadComponent != null) {
                            i = C0966R.C0970id.f7d;
                            InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                            if (inputPanelLinearLayout != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                i = C0966R.C0970id.gkn;
                                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.gkn);
                                if (linearLayout2 != null) {
                                    return new C14406l(relativeLayout, linearLayout, textView, button, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout, linearLayout2);
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
    public final C14406l mo5650H7() {
        return (C14406l) ((C36570n) this.f19767g).getValue();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3c;
    }

    public void initView() {
        setMMTitle("");
        KidsWatchHeadComponent kidsWatchHeadComponent = mo5650H7().f39993d;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo5650H7().f39993d.setCloseBtnCallBack(new C4746a(this));
        String stringExtra = getIntent().getStringExtra("intent.key.login.url");
        C87412m.m108591d(stringExtra);
        this.f19764d = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("intent.key.reg.nickname");
        C87412m.m108591d(stringExtra2);
        this.f19765e = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("intent.key.reg.openid");
        C87412m.m108591d(stringExtra3);
        this.f19766f = stringExtra3;
        Object[] objArr = new Object[1];
        String str = this.f19765e;
        if (str != null) {
            objArr[0] = str;
            String string2 = getString(C0966R.string.g1h, objArr);
            C87412m.m108593f(string2, "getString(R.string.kids_…t_content_desc, nickname)");
            mo5650H7().f39991b.setText(string2);
            mo5650H7().f39992c.setOnClickListener(new C4747b(this));
            C16094a aVar = C16094a.f43246a;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            aVar.mo14692c(context, mo5650H7().f39994e, mo5650H7().f39990a);
            return;
        }
        C87412m.m108603p("nickname");
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
}
