package com.tencent.p014mm.plugin.kidswatch.p066ui.reg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.kidswatch.p066ui.login.KidsWatchHeadComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C88989a;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v12.C14405i;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegIntroUI */
public final class KidsWatchRegIntroUI extends MMActivity {

    /* renamed from: d */
    public String f19758d;

    /* renamed from: e */
    public final C13601g f19759e = C36568h.m40985a(new C4745d(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegIntroUI$a */
    public static final class C4742a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegIntroUI f19760d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4742a(KidsWatchRegIntroUI kidsWatchRegIntroUI) {
            super(0);
            this.f19760d = kidsWatchRegIntroUI;
        }

        public Object invoke() {
            this.f19760d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegIntroUI$b */
    public static final class C4743b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegIntroUI f19761d;

        public C4743b(KidsWatchRegIntroUI kidsWatchRegIntroUI) {
            this.f19761d = kidsWatchRegIntroUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.KidsWatchRegIntroUI", "continue reg button clicked");
            Intent intent = new Intent(this.f19761d, KidsWatchRegGetInfoUI.class);
            intent.putExtra("intent.key.login.url", this.f19761d.f19758d);
            KidsWatchRegIntroUI kidsWatchRegIntroUI = this.f19761d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            KidsWatchRegIntroUI kidsWatchRegIntroUI2 = kidsWatchRegIntroUI;
            C117292a.m165358d(kidsWatchRegIntroUI2, aVar.mo10232b(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            kidsWatchRegIntroUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(kidsWatchRegIntroUI2, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegIntroUI$c */
    public static final class C4744c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegIntroUI f19762d;

        public C4744c(KidsWatchRegIntroUI kidsWatchRegIntroUI) {
            this.f19762d = kidsWatchRegIntroUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f19762d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegIntroUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegIntroUI$d */
    public static final class C4745d extends C87413o implements C32224a<C14405i> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchRegIntroUI f19763d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4745d(KidsWatchRegIntroUI kidsWatchRegIntroUI) {
            super(0);
            this.f19763d = kidsWatchRegIntroUI;
        }

        public Object invoke() {
            View findViewById = this.f19763d.findViewById(C0966R.C0970id.mew);
            int i = C0966R.C0970id.a2x;
            Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.a2x);
            if (button != null) {
                i = C0966R.C0970id.ag4;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ag4);
                if (linearLayout != null) {
                    i = C0966R.C0970id.arj;
                    LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
                    if (linearLayout2 != null) {
                        i = C0966R.C0970id.bsp;
                        Button button2 = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.bsp);
                        if (button2 != null) {
                            i = C0966R.C0970id.f358387eu1;
                            KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                            if (kidsWatchHeadComponent != null) {
                                i = C0966R.C0970id.f7d;
                                InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f7d);
                                if (inputPanelLinearLayout != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                                    return new C14405i(relativeLayout, button, linearLayout, linearLayout2, button2, kidsWatchHeadComponent, inputPanelLinearLayout, relativeLayout);
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
    public final C14405i mo5647H7() {
        return (C14405i) ((C36570n) this.f19759e).getValue();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b3_;
    }

    public void initView() {
        setMMTitle("");
        KidsWatchHeadComponent kidsWatchHeadComponent = mo5647H7().f39989e;
        String string = getString(C0966R.string.g0g);
        C87412m.m108593f(string, "getString(R.string.kids_…ogin_enter_loading_title)");
        kidsWatchHeadComponent.setTitle(string);
        mo5647H7().f39989e.setCloseBtnCallBack(new C4742a(this));
        this.f19758d = getIntent().getStringExtra("intent.key.login.url");
        mo5647H7().f39988d.setOnClickListener(new C4743b(this));
        mo5647H7().f39985a.setOnClickListener(new C4744c(this));
        C16094a aVar = C16094a.f43246a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        aVar.mo14692c(context, mo5647H7().f39987c, mo5647H7().f39986b);
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
