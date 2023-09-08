package ul1;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ul1.j */
public final class C14218j extends UIComponent {

    /* renamed from: d */
    public final String f39709d = "FinderLiveLotteryCreateUIC";

    /* renamed from: e */
    public C14209e f39710e;

    /* renamed from: f */
    public C14210f f39711f;

    /* renamed from: g */
    public KeyboardHeightProvider f39712g;

    /* renamed from: h */
    public boolean f39713h;

    /* renamed from: ul1.j$a */
    public static final class C14219a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C14218j f39714d;

        /* renamed from: ul1.j$a$a */
        public static final class C14220a implements C7020t0 {

            /* renamed from: d */
            public final /* synthetic */ C14218j f39715d;

            public C14220a(C14218j jVar) {
                this.f39715d = jVar;
            }

            /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: Q1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo531Q1(int r17, boolean r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r17
                    ul1.j r2 = r0.f39715d
                    java.lang.String r2 = r2.f39709d
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "onKeyboardHeightChanged, height:"
                    r3.append(r4)
                    r3.append(r1)
                    java.lang.String r4 = ", isResized:"
                    r3.append(r4)
                    r4 = r18
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                    ul1.j r2 = r0.f39715d
                    r3 = 1
                    r4 = 0
                    if (r1 <= 0) goto L_0x002e
                    r5 = 1
                    goto L_0x002f
                L_0x002e:
                    r5 = 0
                L_0x002f:
                    boolean r6 = r2.f39713h
                    if (r6 != r5) goto L_0x0035
                    goto L_0x0136
                L_0x0035:
                    r2.f39713h = r5
                    ul1.f r2 = r2.f39711f
                    if (r2 == 0) goto L_0x0136
                    ul1.k r2 = (ul1.C14221k) r2
                    android.view.View r6 = r2.f39719D
                    if (r6 == 0) goto L_0x0046
                    android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
                    goto L_0x0047
                L_0x0046:
                    r6 = 0
                L_0x0047:
                    boolean r8 = r6 instanceof android.widget.RelativeLayout.LayoutParams
                    if (r8 == 0) goto L_0x004e
                    android.widget.RelativeLayout$LayoutParams r6 = (android.widget.RelativeLayout.LayoutParams) r6
                    goto L_0x004f
                L_0x004e:
                    r6 = 0
                L_0x004f:
                    android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r8 = r8.getResources()
                    r9 = 2131165363(0x7f0700b3, float:1.794494E38)
                    int r8 = r8.getDimensionPixelOffset(r9)
                    if (r6 == 0) goto L_0x0136
                    r9 = 12
                    r10 = 3
                    r11 = 2
                    if (r5 == 0) goto L_0x0102
                    android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r5)
                    int r5 = r5.y
                    android.view.View r12 = r2.f39719D
                    if (r12 == 0) goto L_0x0079
                    int r12 = r12.getHeight()
                    goto L_0x007a
                L_0x0079:
                    r12 = 0
                L_0x007a:
                    int[] r13 = new int[r11]
                    android.view.View r14 = r2.f39733n
                    if (r14 == 0) goto L_0x0083
                    r14.getLocationOnScreen(r13)
                L_0x0083:
                    r3 = r13[r3]
                    android.view.View r13 = r2.f39733n
                    if (r13 == 0) goto L_0x008e
                    int r13 = r13.getHeight()
                    goto L_0x008f
                L_0x008e:
                    r13 = 0
                L_0x008f:
                    int r14 = r5 - r8
                    int r14 = r14 - r12
                    int r15 = r3 + r13
                    int r14 = r14 - r15
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    java.lang.String r7 = "adjustConfirmBtnLayout screenHeight:"
                    r15.append(r7)
                    r15.append(r5)
                    java.lang.String r5 = ", bottomSpaceHeight:"
                    r15.append(r5)
                    r15.append(r8)
                    java.lang.String r5 = ", confirmBtnContainerH:"
                    r15.append(r5)
                    r15.append(r12)
                    java.lang.String r5 = ",descContainerY:"
                    r15.append(r5)
                    r15.append(r3)
                    java.lang.String r5 = ",itemHeight:"
                    r15.append(r5)
                    r15.append(r13)
                    java.lang.String r5 = ",leftHeight:"
                    r15.append(r5)
                    r15.append(r14)
                    java.lang.String r5 = ",height:"
                    r15.append(r5)
                    r15.append(r1)
                    java.lang.String r5 = r15.toString()
                    java.lang.String r7 = "FinderLiveLotteryCreateViewCallback"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
                    if (r12 == 0) goto L_0x00ee
                    if (r3 == 0) goto L_0x00ee
                    if (r14 > r1) goto L_0x00e2
                    goto L_0x00ee
                L_0x00e2:
                    r6.removeRule(r11)
                    r6.removeRule(r10)
                    r6.addRule(r9)
                    r6.bottomMargin = r1
                    goto L_0x011c
                L_0x00ee:
                    android.view.View r1 = r2.f39732j
                    if (r1 == 0) goto L_0x011c
                    int r1 = r1.getId()
                    r6.removeRule(r11)
                    r6.removeRule(r9)
                    r6.addRule(r10, r1)
                    r6.bottomMargin = r4
                    goto L_0x011c
                L_0x0102:
                    r6.removeRule(r11)
                    r6.removeRule(r10)
                    r6.addRule(r9)
                    android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    android.content.res.Resources r1 = r1.getResources()
                    r3 = 2131165365(0x7f0700b5, float:1.7944945E38)
                    int r1 = r1.getDimensionPixelOffset(r3)
                    r6.bottomMargin = r1
                L_0x011c:
                    android.view.View r1 = r2.f39719D
                    if (r1 == 0) goto L_0x0125
                    android.view.ViewParent r1 = r1.getParent()
                    goto L_0x0126
                L_0x0125:
                    r1 = 0
                L_0x0126:
                    boolean r3 = r1 instanceof android.view.ViewGroup
                    if (r3 == 0) goto L_0x012e
                    r7 = r1
                    android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                    goto L_0x012f
                L_0x012e:
                    r7 = 0
                L_0x012f:
                    if (r7 == 0) goto L_0x0136
                    android.view.View r1 = r2.f39719D
                    r7.updateViewLayout(r1, r6)
                L_0x0136:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ul1.C14218j.C14219a.C14220a.mo531Q1(int, boolean):void");
            }
        }

        public C14219a(C14218j jVar) {
            this.f39714d = jVar;
        }

        public final void run() {
            C14218j jVar = this.f39714d;
            if (jVar.f39712g == null) {
                jVar.f39712g = new KeyboardHeightProvider(jVar.getActivity());
                C14218j jVar2 = this.f39714d;
                KeyboardHeightProvider keyboardHeightProvider = jVar2.f39712g;
                if (keyboardHeightProvider != null) {
                    keyboardHeightProvider.f220015b = new C14220a(jVar2);
                }
            }
            KeyboardHeightProvider keyboardHeightProvider2 = this.f39714d.f39712g;
            if (keyboardHeightProvider2 != null) {
                keyboardHeightProvider2.mo104022e();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14218j(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.afv;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39710e = new C14212g(getActivity());
        View rootView = getRootView();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C14221k kVar = new C14221k(rootView, (MMActivity) activity, this.f39710e);
        this.f39711f = kVar;
        C14209e eVar = this.f39710e;
        if (eVar != null) {
            eVar.onAttach(kVar);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C14209e eVar = this.f39710e;
        if (eVar != null) {
            ((C14212g) eVar).onDetach();
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f39712g;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        View decorView;
        super.onResume();
        Window window = getActivity().getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new C14219a(this));
        }
    }
}
