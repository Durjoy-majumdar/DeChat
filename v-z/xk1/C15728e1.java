package xk1;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.WebChromeClient;
import com.tencent.xweb.WebView;
import di3.C86312j;
import e00.C7572d0;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: xk1.e1 */
public final class C15728e1 extends UIComponent {

    /* renamed from: d */
    public final String f42433d = "Finder.FinderGameFinishUIC";

    /* renamed from: e */
    public int f42434e = 6;

    /* renamed from: f */
    public String f42435f = "";

    /* renamed from: g */
    public View f42436g;

    /* renamed from: h */
    public MMWebView f42437h;

    /* renamed from: i */
    public Button f42438i;

    /* renamed from: j */
    public TextView f42439j;

    /* renamed from: n */
    public View f42440n;

    /* renamed from: o */
    public C32224a<C13598b0> f42441o;

    /* renamed from: p */
    public final C15731c f42442p;

    /* renamed from: q */
    public MTimerHandler f42443q;

    /* renamed from: xk1.e1$a */
    public static final class C15729a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C15728e1 f42444d;

        public C15729a(C15728e1 e1Var) {
            this.f42444d = e1Var;
        }

        public final void run() {
            View view = this.f42444d.f42436g;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: xk1.e1$b */
    public static final class C15730b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C15728e1 f42445d;

        public C15730b(C15728e1 e1Var) {
            this.f42445d = e1Var;
        }

        public boolean onTimerExpired() {
            String str;
            C15728e1 e1Var = this.f42445d;
            int i = e1Var.f42434e - 1;
            e1Var.f42434e = i;
            Button button = e1Var.f42438i;
            if (button != null) {
                if (i <= 0) {
                    str = e1Var.getResources().getString(C0966R.string.e2q);
                } else {
                    str = e1Var.getResources().getString(C0966R.string.e2p, new Object[]{Integer.valueOf(e1Var.f42434e)});
                }
                button.setText(str);
            }
            C15728e1 e1Var2 = this.f42445d;
            if (e1Var2.f42434e > 0) {
                return true;
            }
            Button button2 = e1Var2.f42438i;
            if (button2 != null) {
                button2.setEnabled(true);
            }
            return false;
        }
    }

    /* renamed from: xk1.e1$c */
    public static final class C15731c extends WebChromeClient {

        /* renamed from: a */
        public final /* synthetic */ C15728e1 f42446a;

        /* renamed from: b */
        public final /* synthetic */ AppCompatActivity f42447b;

        public C15731c(C15728e1 e1Var, AppCompatActivity appCompatActivity) {
            this.f42446a = e1Var;
            this.f42447b = appCompatActivity;
        }

        public void onReceivedTitle(WebView webView, String str) {
            TextView textView;
            super.onReceivedTitle(webView, str);
            String str2 = this.f42446a.f42433d;
            Log.m105924i(str2, "onReceivedTitle title:" + str + ' ' + this.f42447b);
            if (!(str == null || str.length() == 0) && !C87412m.m108589b(this.f42446a.f42435f, str) && !((C7572d0) C86312j.m106911c(C7572d0.class)).mo8343Rs(str) && !C112551y.m153819s(str, "about:blank", false) && (textView = this.f42446a.f42439j) != null) {
                textView.setText(str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15728e1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f42442p = new C15731c(this, appCompatActivity);
        this.f42443q = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C15730b(this), true);
    }

    /* renamed from: c3 */
    public final void mo14456c3() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationX;
        ViewPropertyAnimator withEndAction;
        MMActivityController controller;
        AppCompatActivity activity = getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (!(mMActivity == null || (controller = mMActivity.getController()) == null)) {
            controller.mo177105z0(getActivity().getResources().getColor(C0966R.color.ahf));
        }
        View view = this.f42436g;
        if (view != null && (animate = view.animate()) != null && (translationX = animate.translationX(-((float) C75044y4.m89990b(getActivity()).x))) != null && (withEndAction = translationX.withEndAction(new C15729a(this))) != null) {
            withEndAction.start();
        }
    }

    /* JADX WARNING: type inference failed for: r0v18, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14457d3() {
        /*
            r11 = this;
            android.view.View r0 = r11.f42436g
            r1 = 0
            if (r0 == 0) goto L_0x000f
            r2 = 2131303501(0x7f091c4d, float:1.8225118E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            r11.f42439j = r0
            android.view.View r0 = r11.f42436g
            if (r0 == 0) goto L_0x001e
            r2 = 2131303498(0x7f091c4a, float:1.8225112E38)
            android.view.View r0 = r0.findViewById(r2)
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r11.f42440n = r0
            r11.getActivity()
            android.view.View r0 = r11.f42436g
            r2 = 2131303529(0x7f091c69, float:1.8225175E38)
            android.view.View r0 = r0.findViewById(r2)
            com.tencent.mm.ui.widget.MMWebView r0 = (com.tencent.p014mm.p136ui.widget.MMWebView) r0
            r0.getClass()
            r11.f42437h = r0
            xk1.e1$c r2 = r11.f42442p
            r0.setWebChromeClient(r2)
            android.view.View r0 = r11.f42436g
            if (r0 == 0) goto L_0x0047
            r2 = 2131303500(0x7f091c4c, float:1.8225116E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.Button r0 = (android.widget.Button) r0
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            r11.f42438i = r0
            if (r0 == 0) goto L_0x0051
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0052
        L_0x0051:
            r0 = r1
        L_0x0052:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0059
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x0072
        L_0x005d:
            androidx.appcompat.app.AppCompatActivity r2 = r11.getActivity()
            r3 = 48
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r3)
            androidx.appcompat.app.AppCompatActivity r3 = r11.getActivity()
            int r3 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r3)
            int r2 = r2 + r3
            r0.bottomMargin = r2
        L_0x0072:
            android.view.View r0 = r11.f42436g
            if (r0 == 0) goto L_0x0084
            r2 = 2131303499(0x7f091c4b, float:1.8225114E38)
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x0084
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x0085
        L_0x0084:
            r0 = r1
        L_0x0085:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x008c
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x008d
        L_0x008c:
            r0 = r1
        L_0x008d:
            if (r0 != 0) goto L_0x0090
            goto L_0x009a
        L_0x0090:
            androidx.appcompat.app.AppCompatActivity r2 = r11.getActivity()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r2)
            r0.bottomMargin = r2
        L_0x009a:
            android.widget.Button r0 = r11.f42438i
            if (r0 == 0) goto L_0x00a6
            xk1.f1 r2 = new xk1.f1
            r2.<init>(r11)
            r0.setOnClickListener(r2)
        L_0x00a6:
            android.view.View r0 = r11.f42440n
            if (r0 == 0) goto L_0x00b2
            xk1.g1 r2 = new xk1.g1
            r2.<init>(r11)
            r0.setOnClickListener(r2)
        L_0x00b2:
            android.app.Activity r0 = r11.getContext()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderGameLiveAuthUI
            r2 = 2131303527(0x7f091c67, float:1.822517E38)
            if (r0 != 0) goto L_0x00e3
            android.view.View r0 = r11.f42436g
            if (r0 == 0) goto L_0x00cc
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x00cd
        L_0x00cc:
            r0 = r1
        L_0x00cd:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00d4
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x00d5
        L_0x00d4:
            r0 = r1
        L_0x00d5:
            if (r0 != 0) goto L_0x00d8
            goto L_0x0110
        L_0x00d8:
            androidx.appcompat.app.AppCompatActivity r2 = r11.getActivity()
            int r2 = com.tencent.p014mm.p136ui.C75044y4.m89994f(r2)
            r0.topMargin = r2
            goto L_0x0110
        L_0x00e3:
            android.view.View r0 = r11.f42436g
            if (r0 == 0) goto L_0x00f2
            android.view.View r0 = r0.findViewById(r2)
            if (r0 == 0) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            goto L_0x00f3
        L_0x00f2:
            r0 = r1
        L_0x00f3:
            boolean r2 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00fa
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            goto L_0x00fb
        L_0x00fa:
            r0 = r1
        L_0x00fb:
            if (r0 != 0) goto L_0x00fe
            goto L_0x0110
        L_0x00fe:
            androidx.appcompat.app.AppCompatActivity r2 = r11.getActivity()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            r0.topMargin = r2
        L_0x0110:
            androidx.appcompat.app.AppCompatActivity r0 = r11.getActivity()
            boolean r2 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x011b
            r1 = r0
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
        L_0x011b:
            if (r1 == 0) goto L_0x0135
            com.tencent.mm.ui.MMActivityController r0 = r1.getController()
            if (r0 == 0) goto L_0x0135
            androidx.appcompat.app.AppCompatActivity r1 = r11.getActivity()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099688(0x7f060028, float:1.7811736E38)
            int r1 = r1.getColor(r2)
            r0.mo177105z0(r1)
        L_0x0135:
            android.view.View r0 = r11.f42436g
            if (r0 != 0) goto L_0x013a
            goto L_0x013e
        L_0x013a:
            r1 = 0
            r0.setTranslationX(r1)
        L_0x013e:
            android.view.View r0 = r11.f42436g
            r1 = 0
            if (r0 != 0) goto L_0x0144
            goto L_0x0187
        L_0x0144:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC"
            java.lang.String r5 = "show"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC"
            java.lang.String r4 = "show"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0187:
            java.lang.String r0 = "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement"
            r11.f42435f = r0     // Catch:{ Exception -> 0x01aa }
            com.tencent.mm.ui.widget.MMWebView r2 = r11.f42437h     // Catch:{ Exception -> 0x01aa }
            if (r2 == 0) goto L_0x0192
            r2.loadUrl(r0)     // Catch:{ Exception -> 0x01aa }
        L_0x0192:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r11.f42443q     // Catch:{ Exception -> 0x01aa }
            r0.stopTimer()     // Catch:{ Exception -> 0x01aa }
            r0 = 6
            r11.f42434e = r0     // Catch:{ Exception -> 0x01aa }
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r11.f42443q     // Catch:{ Exception -> 0x01aa }
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.startTimer(r2)     // Catch:{ Exception -> 0x01aa }
            android.widget.Button r0 = r11.f42438i     // Catch:{ Exception -> 0x01aa }
            if (r0 != 0) goto L_0x01a6
            goto L_0x01b4
        L_0x01a6:
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01b4
        L_0x01aa:
            r0 = move-exception
            java.lang.String r1 = r11.f42433d
            java.lang.String r0 = r0.getMessage()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk1.C15728e1.mo14457d3():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42436g = findViewById(C0966R.C0970id.i8f);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f42443q.stopTimer();
        MMWebView mMWebView = this.f42437h;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }
}
