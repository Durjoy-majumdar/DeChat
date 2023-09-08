package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import nj3.C88989a;
import p192l4.C10462b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v12.C52740f;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirstChooseHelpUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI */
public final class KidsWatchLoginFirstChooseHelpUI extends MMActivity {

    /* renamed from: d */
    public final C13601g f114999d = C36568h.m40985a(new C42481b(this));

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI$a */
    public static final class C42480a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseHelpUI f115000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42480a(KidsWatchLoginFirstChooseHelpUI kidsWatchLoginFirstChooseHelpUI) {
            super(0);
            this.f115000d = kidsWatchLoginFirstChooseHelpUI;
        }

        public Object invoke() {
            this.f115000d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseHelpUI$b */
    public static final class C42481b extends C87413o implements C32224a<C52740f> {

        /* renamed from: d */
        public final /* synthetic */ KidsWatchLoginFirstChooseHelpUI f115001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42481b(KidsWatchLoginFirstChooseHelpUI kidsWatchLoginFirstChooseHelpUI) {
            super(0);
            this.f115001d = kidsWatchLoginFirstChooseHelpUI;
        }

        public Object invoke() {
            View findViewById = this.f115001d.findViewById(C0966R.C0970id.met);
            int i = C0966R.C0970id.arj;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.arj);
            if (linearLayout != null) {
                i = C0966R.C0970id.f358387eu1;
                KidsWatchHeadComponent kidsWatchHeadComponent = (KidsWatchHeadComponent) C10462b.m10395a(findViewById, C0966R.C0970id.f358387eu1);
                if (kidsWatchHeadComponent != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) findViewById;
                    i = C0966R.C0970id.kg8;
                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.kg8);
                    if (textView != null) {
                        return new C52740f(relativeLayout, linearLayout, kidsWatchHeadComponent, relativeLayout, textView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2469dt);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b37;
    }

    public void initView() {
        ((C52740f) ((C36570n) this.f114999d).getValue()).f147333b.setCloseIconResId(C0966R.C0969drawable.bsw);
        ((C52740f) ((C36570n) this.f114999d).getValue()).f147333b.setCloseBtnCallBack(new C42480a(this));
        C16094a aVar = C16094a.f43246a;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        aVar.mo14692c(context, ((C52740f) ((C36570n) this.f114999d).getValue()).f147332a, (LinearLayout) null);
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
        Log.m105924i("MicroMsg.KidsWatchLoginChooseHelpUI", "Enter KidsWatch Login Help UI");
    }
}
