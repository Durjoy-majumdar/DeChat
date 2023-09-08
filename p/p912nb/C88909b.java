package p912nb;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85924r4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C85004y;
import com.tencent.p014mm.sdk.platformtools.Log;
import in3.C87771d;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import qt0.C89843b;
import qt0.C89850f;
import rj0.C89977d;
import to0.C90561a;

/* renamed from: nb.b */
public class C88909b extends C84983t0 {

    /* renamed from: G */
    public static C76848b f256405G;

    /* renamed from: H */
    public static boolean f256406H;

    /* renamed from: D */
    public C88910a f256407D;

    /* renamed from: E */
    public WAGamePanelInputEditText f256408E;

    /* renamed from: F */
    public View.OnClickListener f256409F;

    /* renamed from: nb.b$b */
    public interface C76848b {
    }

    /* renamed from: nb.b$a */
    public static final class C88910a extends FrameLayout implements C84983t0.C68721g {

        /* renamed from: d */
        public View f256410d;

        public C88910a(Context context) {
            super(context);
            C76848b bVar = C88909b.f256405G;
            if (bVar != null) {
                ((C89977d.C89978a) bVar).getClass();
                LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cd_, this, true);
            } else {
                LayoutInflater.from(context).inflate(C0966R.C0971layout.f6408e1, this, true);
            }
            ((Button) findViewById(C0966R.C0970id.ekb)).setText(C0966R.string.a5y);
            setClickable(true);
        }

        /* renamed from: a */
        public void mo94518a(boolean z) {
            setVisibility(z ? 8 : 0);
        }

        /* renamed from: b */
        public View mo123300b() {
            if (this.f256410d == null) {
                this.f256410d = findViewById(C0966R.C0970id.ekb);
            }
            return this.f256410d;
        }
    }

    public C88909b(Context context, boolean z) {
        super(context, (C90561a) null, z);
    }

    /* renamed from: O */
    public static C88909b m110989O(View view) {
        return (C88909b) view.getRootView().findViewById(C0966R.C0970id.f5891rj);
    }

    /* renamed from: P */
    public static C88909b m110990P(View view, boolean z) {
        C88909b bVar;
        C85004y d = C85004y.m104825d(view);
        C85004y.m104826e(view);
        C84983t0 y = C84983t0.m104783y(view);
        if (y != null && (y.getParent() instanceof ViewGroup)) {
            ((ViewGroup) y.getParent()).removeView(y);
        }
        C88909b O = m110989O(view);
        if (!(f256406H == z || O == null)) {
            d.removeView(O);
            O = null;
        }
        f256406H = z;
        if (bVar == null) {
            bVar = view instanceof C88909b ? (C88909b) view : new C88909b(view.getContext(), z);
            d.mo117919a(bVar, false);
        }
        return bVar;
    }

    public static void setGameInputEditBarLayoutFactory(C76848b bVar) {
        f256405G = bVar;
    }

    /* renamed from: C */
    public void mo117864C() {
    }

    /* renamed from: D */
    public void mo117865D() {
        ImageButton imageButton;
        View b = this.f256407D.mo123300b();
        int i = (((this.f256408E.getInputType() & 131072) > 0) || ((imageButton = this.f247677s) != null && imageButton.getVisibility() == 0)) ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(b, "com/tencent/luggage/game/widget/input/WAGameInputPanel", "onPreShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: E */
    public void mo117866E() {
        m110990P(this, f256406H);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ Exception -> 0x0064 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ Exception -> 0x0064 }] */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo117869I() {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.widget.input.i1 r0 = r6.f247683y
            android.app.Activity r0 = r0.getHostActivity()
            if (r0 == 0) goto L_0x0071
            r0 = 0
            r1 = 1
            com.tencent.mm.plugin.appbrand.widget.input.y r2 = com.tencent.p014mm.plugin.appbrand.widget.input.C85004y.m104825d(r6)     // Catch:{ Exception -> 0x0064 }
            st0.a r2 = r2.getOnLayoutListener()     // Catch:{ Exception -> 0x0064 }
            com.tencent.mm.plugin.appbrand.widget.input.l0 r2 = (com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0) r2     // Catch:{ Exception -> 0x0064 }
            com.tencent.mm.plugin.appbrand.widget.input.i1 r3 = r6.f247683y     // Catch:{ Exception -> 0x0064 }
            android.app.Activity r3 = r3.getHostActivity()     // Catch:{ Exception -> 0x0064 }
            boolean r3 = com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3.m104133j(r3)     // Catch:{ Exception -> 0x0064 }
            if (r3 != 0) goto L_0x0051
            com.tencent.mm.plugin.appbrand.widget.input.i1 r3 = r6.f247683y     // Catch:{ Exception -> 0x0064 }
            android.app.Activity r3 = r3.getHostActivity()     // Catch:{ Exception -> 0x0064 }
            boolean r4 = r3 instanceof android.app.Activity     // Catch:{ Exception -> 0x0064 }
            r5 = 2
            if (r4 != 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ Exception -> 0x0064 }
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch:{ Exception -> 0x0064 }
            int r3 = r3.orientation     // Catch:{ Exception -> 0x0064 }
            if (r3 != r5) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            if (r3 == 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            com.tencent.mm.plugin.appbrand.widget.input.i1 r3 = r6.f247683y     // Catch:{ Exception -> 0x0064 }
            android.app.Activity r3 = r3.getHostActivity()     // Catch:{ Exception -> 0x0064 }
            android.view.Window r3 = r3.getWindow()     // Catch:{ Exception -> 0x0064 }
            r4 = 48
            r3.setSoftInputMode(r4)     // Catch:{ Exception -> 0x0064 }
            r2.mo117848g(r5)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0071
        L_0x0051:
            com.tencent.mm.plugin.appbrand.widget.input.i1 r3 = r6.f247683y     // Catch:{ Exception -> 0x0064 }
            android.app.Activity r3 = r3.getHostActivity()     // Catch:{ Exception -> 0x0064 }
            android.view.Window r3 = r3.getWindow()     // Catch:{ Exception -> 0x0064 }
            r4 = 16
            r3.setSoftInputMode(r4)     // Catch:{ Exception -> 0x0064 }
            r2.mo117848g(r1)     // Catch:{ Exception -> 0x0064 }
            goto L_0x0071
        L_0x0064:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            java.lang.String r0 = "MicroMsg.WAGameInputPanel"
            java.lang.String r2 = "show() fix SoftInputMode for game, get exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x0071:
            com.tencent.luggage.game.widget.input.WAGamePanelInputEditText r0 = r6.f256408E
            r6.f247681w = r0
            r0.requestFocus()
            super.mo117869I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p912nb.C88909b.mo117869I():void");
    }

    /* renamed from: L */
    public void mo117872L() {
        this.f256407D.mo94518a(false);
    }

    /* renamed from: d */
    public void mo117850d(boolean z) {
        super.mo117850d(z);
        if (!z) {
            C87771d.m109203b(this.f247683y.getHostActivity()).mo122181e();
        }
    }

    /* renamed from: e */
    public void mo117851e(int i) {
        WindowInsets b;
        if (i > 0 && 2 == ((C84967l0) C85004y.m104825d(this).getOnLayoutListener()).f247624a) {
            Activity hostActivity = this.f247683y.getHostActivity();
            if (C84545i3.m104132i(hostActivity) && (b = C85924r4.m106237b(hostActivity)) != null) {
                Log.m105919d("MicroMsg.WAGameInputPanel", "refreshHeight height:%d, append insetBottom:%d", Integer.valueOf(i), Integer.valueOf(b.getStableInsetBottom()));
                i += b.getStableInsetBottom();
            }
        }
        super.mo117851e(i);
    }

    public void setOnConfirmClickListener(View.OnClickListener onClickListener) {
        this.f256409F = onClickListener;
    }

    public void setOnEmoticonOperationListener(C89850f fVar) {
        C89843b bVar = this.f247674p;
        if (bVar != null) {
            bVar.setOnEmoticonOperationListener(fVar);
        }
    }

    /* renamed from: t */
    public final int mo117891t() {
        return C0966R.C0970id.f5891rj;
    }

    /* renamed from: x */
    public View mo117892x() {
        C88910a aVar = new C88910a(getContext());
        this.f256408E = (WAGamePanelInputEditText) aVar.findViewById(C0966R.C0970id.ekc);
        aVar.mo123300b().setOnClickListener(new C76847a(this));
        this.f247681w = this.f256408E;
        this.f247677s = mo117868H(aVar);
        boolean z = this.f247678t;
        View findViewById = aVar.findViewById(C0966R.C0970id.jnw);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/luggage/game/widget/input/WAGameInputPanel$EditBar", "setSmileySwitchBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/luggage/game/widget/input/WAGameInputPanel$EditBar", "setSmileySwitchBtnVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Context context = getContext();
        LinearLayout linearLayout = (LinearLayout) aVar.findViewById(C0966R.C0970id.eka);
        WeImageButton weImageButton = (WeImageButton) aVar.findViewById(C0966R.C0970id.jnw);
        if (f256406H) {
            linearLayout.setBackground(C76577a.m92158i(context, C0966R.color.f2950a7));
            weImageButton.setIconColor(C76577a.m92153d(context, C0966R.color.BW_100_Alpha_0_8));
        } else {
            linearLayout.setBackground(C76577a.m92158i(context, C0966R.color.BW_97));
            weImageButton.setIconColor(C76577a.m92153d(context, C0966R.color.FG_0));
        }
        this.f256407D = aVar;
        return aVar;
    }

    public WAGamePanelInputEditText getAttachedEditText() {
        return (WAGamePanelInputEditText) super.getAttachedEditText();
    }
}
