package dn3;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64961s;
import tm3.C78048a0;
import tm3.C78052b0;
import tm3.C78066t;
import tm3.C78067u;
import tm3.C78069w;
import tm3.C78071z;
import yb2.C15946a;
import z04.C112551y;

/* renamed from: dn3.g */
public final class C75431g extends C15946a {

    /* renamed from: d */
    public final C13601g f221729d = C36568h.m40985a(new C75434c(this));

    /* renamed from: e */
    public final C13601g f221730e = C36568h.m40985a(new C75439h(this));

    /* renamed from: f */
    public final C13601g f221731f = C36568h.m40985a(new C75438g(this));

    /* renamed from: g */
    public final C13601g f221732g = C36568h.m40985a(new C75436e(this));

    /* renamed from: h */
    public final C13601g f221733h = C36568h.m40985a(new C75437f(this));

    /* renamed from: i */
    public final C13601g f221734i = C36568h.m40985a(new C75435d(this));

    /* renamed from: j */
    public final C13601g f221735j = C36568h.m40985a(new C75432a(this));

    /* renamed from: dn3.g$a */
    public static final class C75432a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75432a(C75431g gVar) {
            super(0);
            this.f221736d = gVar;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f221736d.getIntent().getBooleanExtra("key_forceLightMode", false));
        }
    }

    /* renamed from: dn3.g$b */
    public static final class C75433b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75433b(C75431g gVar) {
            super(1);
            this.f221737d = gVar;
        }

        public Object invoke(Object obj) {
            IStateActionResult result;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C75431g gVar = this.f221737d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                AppCompatActivity activity = gVar.getActivity();
                C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) activity;
                if (wVar.mo108033b()) {
                    mMActivity.addTextOptionMenu(1, (String) ((C36570n) gVar.f221730e).getValue(), new C75440h(gVar), (View.OnLongClickListener) null, MMActivityController.C73075r.m85980a(((Number) ((C36570n) gVar.f221729d).getValue()).intValue()));
                    gVar.mo105774j3(wVar);
                }
            }
            if (wVar.mo108033b()) {
                C75431g gVar2 = this.f221737d;
                IStateAction action2 = wVar.getAction();
                if (action2 != null && (action2 instanceof C78071z) && (result = ((C78071z) action2).getResult()) != null && (result instanceof C78048a0) && ((C78048a0) result).f228787b == C78048a0.C78049a.Success) {
                    gVar2.mo105774j3(wVar);
                }
                C75431g gVar3 = this.f221737d;
                IStateAction action3 = wVar.getAction();
                if (action3 != null && (action3 instanceof C78052b0)) {
                    C78052b0 b0Var = (C78052b0) action3;
                    gVar3.mo105774j3(wVar);
                }
                C75431g gVar4 = this.f221737d;
                IStateAction action4 = wVar.getAction();
                if (action4 != null && (action4 instanceof C78067u)) {
                    C78067u uVar = (C78067u) action4;
                    gVar4.mo105774j3(wVar);
                }
                C75431g gVar5 = this.f221737d;
                IStateAction action5 = wVar.getAction();
                if (action5 != null && (action5 instanceof C78066t)) {
                    C78066t tVar = (C78066t) action5;
                    gVar5.mo105774j3(wVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.g$c */
    public static final class C75434c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75434c(C75431g gVar) {
            super(0);
            this.f221738d = gVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f221738d.getIntent().getIntExtra("openMenuStyle", 0));
        }
    }

    /* renamed from: dn3.g$d */
    public static final class C75435d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75435d(C75431g gVar) {
            super(0);
            this.f221739d = gVar;
        }

        public Object invoke() {
            int i;
            String stringExtra = this.f221739d.getIntent().getStringExtra("key_rightButtonDarkColor");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    i = Color.parseColor(stringExtra);
                    return Integer.valueOf(i);
                }
            }
            i = -1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: dn3.g$e */
    public static final class C75436e extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75436e(C75431g gVar) {
            super(0);
            this.f221740d = gVar;
        }

        public Object invoke() {
            int i;
            String stringExtra = this.f221740d.getIntent().getStringExtra("key_rightButtonDarkFontColor");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    i = Color.parseColor(stringExtra);
                    return Integer.valueOf(i);
                }
            }
            i = -1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: dn3.g$f */
    public static final class C75437f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75437f(C75431g gVar) {
            super(0);
            this.f221741d = gVar;
        }

        public Object invoke() {
            int i;
            String stringExtra = this.f221741d.getIntent().getStringExtra("key_rightButtonLightColor");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    i = Color.parseColor(stringExtra);
                    return Integer.valueOf(i);
                }
            }
            i = -1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: dn3.g$g */
    public static final class C75438g extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75438g(C75431g gVar) {
            super(0);
            this.f221742d = gVar;
        }

        public Object invoke() {
            int i;
            String stringExtra = this.f221742d.getIntent().getStringExtra("key_rightButtonLightFontColor");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    i = Color.parseColor(stringExtra);
                    return Integer.valueOf(i);
                }
            }
            i = -1;
            return Integer.valueOf(i);
        }
    }

    /* renamed from: dn3.g$h */
    public static final class C75439h extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C75431g f221743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75439h(C75431g gVar) {
            super(0);
            this.f221743d = gVar;
        }

        public Object invoke() {
            String stringExtra = this.f221743d.getIntent().getStringExtra("key_rightButtonWord");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    return stringExtra;
                }
            }
            return this.f221743d.getString(C0966R.string.f8014z_);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75431g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final int mo105772g3() {
        return ((Number) ((C36570n) this.f221733h).getValue()).intValue();
    }

    /* renamed from: i3 */
    public final int mo105773i3() {
        return ((Number) ((C36570n) this.f221731f).getValue()).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016b  */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105774j3(tm3.C78069w r12) {
        /*
            r11 = this;
            java.lang.String r0 = "state"
            gy3.C87412m.m108594g(r12, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r11.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateMenu: "
            r1.append(r2)
            java.util.LinkedList<java.lang.String> r2 = r12.f228826n
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r9 = "MicroMsg.SelectContactTopMenuUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            java.util.LinkedList<java.lang.String> r1 = r12.f228826n
            int r1 = r1.size()
            r10 = 1
            r2 = 2131821539(0x7f1103e3, float:1.9275824E38)
            if (r1 <= 0) goto L_0x009f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r11.getString(r2)
            r1.append(r2)
            int r2 = r12.f228823h
            r3 = 41
            r4 = 40
            if (r2 <= 0) goto L_0x0067
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.util.LinkedList<java.lang.String> r4 = r12.f228826n
            int r4 = r4.size()
            r2.append(r4)
            r4 = 47
            r2.append(r4)
            int r4 = r12.f228823h
            goto L_0x0075
        L_0x0067:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.util.LinkedList<java.lang.String> r4 = r12.f228826n
            int r4 = r4.size()
        L_0x0075:
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.updateOptionMenuText(r10, r1)
            rx3.g r1 = r11.f221729d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.tencent.mm.ui.MMActivityController$r r1 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.m85980a(r1)
            r0.updateOptionMenuStyle(r10, r1)
            goto L_0x00bb
        L_0x009f:
            java.lang.String r1 = r11.getString(r2)
            r0.updateOptionMenuText(r10, r1)
            rx3.g r1 = r11.f221729d
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.tencent.mm.ui.MMActivityController$r r1 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.m85980a(r1)
            r0.updateOptionMenuStyle(r10, r1)
        L_0x00bb:
            r1 = 0
            rx3.g r2 = r11.f221735j     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0158 }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0158 }
            r3 = -1
            if (r2 == 0) goto L_0x00fc
            int r2 = r11.mo105773i3()     // Catch:{ Exception -> 0x0158 }
            if (r2 != r3) goto L_0x00db
            int r2 = r11.mo105772g3()     // Catch:{ Exception -> 0x0158 }
            if (r2 != r3) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            if (r2 != 0) goto L_0x00fc
            r3 = 1
            int r4 = r11.mo105773i3()     // Catch:{ Exception -> 0x0158 }
            r5 = 0
            int r6 = r11.mo105772g3()     // Catch:{ Exception -> 0x0158 }
            r7 = 0
            rx3.g r2 = r11.f221735j     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ Exception -> 0x0158 }
            boolean r8 = r2.booleanValue()     // Catch:{ Exception -> 0x0158 }
            r2 = r0
            r2.updateOptionMenuRightButtonColor(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0158 }
            goto L_0x015d
        L_0x00fc:
            int r2 = r11.mo105773i3()     // Catch:{ Exception -> 0x0158 }
            if (r2 != r3) goto L_0x0112
            rx3.g r2 = r11.f221732g     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x0158 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0158 }
            if (r2 == r3) goto L_0x0128
        L_0x0112:
            int r2 = r11.mo105772g3()     // Catch:{ Exception -> 0x0158 }
            if (r2 != r3) goto L_0x012a
            rx3.g r2 = r11.f221734i     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x0158 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0158 }
            if (r2 != r3) goto L_0x012a
        L_0x0128:
            r2 = 1
            goto L_0x012b
        L_0x012a:
            r2 = 0
        L_0x012b:
            if (r2 != 0) goto L_0x015d
            r3 = 1
            int r4 = r11.mo105773i3()     // Catch:{ Exception -> 0x0158 }
            rx3.g r2 = r11.f221732g     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x0158 }
            int r5 = r2.intValue()     // Catch:{ Exception -> 0x0158 }
            int r6 = r11.mo105772g3()     // Catch:{ Exception -> 0x0158 }
            rx3.g r2 = r11.f221734i     // Catch:{ Exception -> 0x0158 }
            rx3.n r2 = (rx3.C36570n) r2     // Catch:{ Exception -> 0x0158 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0158 }
            java.lang.Number r2 = (java.lang.Number) r2     // Catch:{ Exception -> 0x0158 }
            int r7 = r2.intValue()     // Catch:{ Exception -> 0x0158 }
            r8 = 0
            r2 = r0
            r2.updateOptionMenuRightButtonColor(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0158 }
            goto L_0x015d
        L_0x0158:
            java.lang.String r2 = "parse color exception"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
        L_0x015d:
            java.util.LinkedList<java.lang.String> r2 = r12.f228826n
            int r2 = r2.size()
            int r12 = r12.f228824i
            if (r2 <= r12) goto L_0x016b
            r0.enableOptionMenu(r10, r10)
            goto L_0x016e
        L_0x016b:
            r0.enableOptionMenu(r10, r1)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dn3.C75431g.mo105774j3(tm3.w):void");
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        super.onCreate(bundle);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C75433b(this));
        }
    }
}
