package p518fb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import br0.C79778e;
import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C68712d0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Objects;
import kg3.C76577a;
import p225rc.C89923l;
import p912nb.C88909b;
import qt0.C89843b;
import rt0.C90097c;

/* renamed from: fb.h */
public class C86786h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f251894d;

    /* renamed from: e */
    public final /* synthetic */ String f251895e;

    /* renamed from: f */
    public final /* synthetic */ int f251896f;

    /* renamed from: g */
    public final /* synthetic */ boolean f251897g;

    /* renamed from: h */
    public final /* synthetic */ boolean f251898h;

    /* renamed from: i */
    public final /* synthetic */ C90097c f251899i;

    /* renamed from: j */
    public final /* synthetic */ C31988a f251900j;

    /* renamed from: n */
    public final /* synthetic */ boolean f251901n;

    /* renamed from: o */
    public final /* synthetic */ boolean f251902o;

    /* renamed from: p */
    public final /* synthetic */ boolean f251903p;

    /* renamed from: q */
    public final /* synthetic */ boolean f251904q;

    /* renamed from: r */
    public final /* synthetic */ int f251905r;

    /* renamed from: s */
    public final /* synthetic */ C86795q f251906s;

    public C86786h(C86795q qVar, C81925i2 i2Var, String str, int i, boolean z, boolean z2, C90097c cVar, C31988a aVar, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        this.f251906s = qVar;
        this.f251894d = i2Var;
        this.f251895e = str;
        this.f251896f = i;
        this.f251897g = z;
        this.f251898h = z2;
        this.f251899i = cVar;
        this.f251900j = aVar;
        this.f251901n = z3;
        this.f251902o = z4;
        this.f251903p = z5;
        this.f251904q = z6;
        this.f251905r = i2;
    }

    public void run() {
        C83780d1 l0;
        C89843b bVar;
        C89843b bVar2;
        C86795q qVar = this.f251906s;
        C81925i2 i2Var = this.f251894d;
        String str = this.f251895e;
        int i = this.f251896f;
        boolean z = this.f251897g;
        boolean z2 = this.f251898h;
        C90097c cVar = this.f251899i;
        C31988a aVar = this.f251900j;
        boolean z3 = this.f251901n;
        boolean z4 = this.f251902o;
        boolean z5 = this.f251903p;
        boolean z6 = this.f251904q;
        int i2 = this.f251905r;
        qVar.getClass();
        if (i2Var.isRunning() && (l0 = i2Var.mo114341l0()) != null) {
            float g = C76577a.m92156g(l0.getContext());
            ViewGroup viewGroup = l0.f244552D;
            Objects.requireNonNull(viewGroup);
            C88909b P = C88909b.m110990P(viewGroup, z6);
            C31988a aVar2 = C31988a.EMOJI;
            P.setCanSmileyInput(aVar2 == aVar);
            if (P.f247678t && (bVar2 = P.f247674p) != null) {
                bVar2.mo124120m(z3);
            }
            if (P.f247678t && (bVar = P.f247674p) != null) {
                bVar.mo124127r(z4);
            }
            WAGamePanelInputEditText attachedEditText = P.getAttachedEditText();
            C86787i iVar = new C86787i(qVar, P, attachedEditText);
            i2Var.getRuntime().f238113K.mo122978a(iVar);
            attachedEditText.setSingleLine(!z);
            attachedEditText.setMaxLength(i);
            C68712d0 g2 = C68712d0.m80987g(attachedEditText);
            g2.f225611e = 0;
            g2.f225610d = i;
            g2.f225607a = false;
            g2.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
            g2.mo107499d(new C86788j(qVar, attachedEditText, i2Var));
            if (!Util.isNullOrNil(str)) {
                if (str.length() > i) {
                    str = str.substring(0, i);
                }
                attachedEditText.setText(str);
                attachedEditText.setSelection(attachedEditText.getText().length());
            } else {
                attachedEditText.setText("");
            }
            attachedEditText.addTextChangedListener(new C86789k(qVar, i2Var));
            attachedEditText.setComposingDismissedListener(new C86790l(qVar, attachedEditText, i2Var));
            C86795q qVar2 = qVar;
            C86791m mVar = r1;
            C86787i iVar2 = iVar;
            C81925i2 i2Var2 = i2Var;
            WAGamePanelInputEditText wAGamePanelInputEditText = attachedEditText;
            boolean z7 = z5;
            C31988a aVar3 = aVar2;
            C90097c cVar2 = cVar;
            C88909b bVar3 = P;
            C86791m mVar2 = new C86791m(qVar2, attachedEditText, i2Var2, z2, P, iVar2);
            bVar3.setOnConfirmClickListener(mVar);
            bVar3.setOnVisibilityChangedListener(new C86792n(qVar2, wAGamePanelInputEditText, i2Var2, bVar3, g, i2));
            WAGamePanelInputEditText wAGamePanelInputEditText2 = wAGamePanelInputEditText;
            bVar3.setOnSmileyChosenListener(new C86793o(qVar, wAGamePanelInputEditText2));
            bVar3.setOnEmoticonOperationListener(new C86794p(qVar, i2Var));
            if (!z) {
                wAGamePanelInputEditText2.setOnEditorActionListener(new C86785g(qVar, wAGamePanelInputEditText2, i2Var, z2));
            }
            C79778e.C79780b a = i2Var.f240292z.getOrientationHandler().mo109917a();
            Activity R = i2Var.getRuntime().mo113026R();
            bVar3.setCanSmileyInput(aVar == aVar3);
            if (a == C79778e.C79780b.LANDSCAPE_SENSOR || a == C79778e.C79780b.LANDSCAPE_LOCKED || C79778e.C79780b.LANDSCAPE_LEFT == a || C79778e.C79780b.LANDSCAPE_RIGHT == a) {
                int a2 = C85864g1.m106126a(R);
                int g3 = C89923l.f258408a.mo117501g(R);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bVar3.f256408E.getLayoutParams();
                Log.m105925i("MicroMsg.WAGameInputPanel", "EditBar setEditText cutoutHeight(%d),leftMargin(%d).", Integer.valueOf(g3), Integer.valueOf(layoutParams.leftMargin));
                if (g3 > 0) {
                    layoutParams.setMargins(g3, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                } else {
                    layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                }
                bVar3.f256408E.setLayoutParams(layoutParams);
                C88909b.C88910a aVar4 = bVar3.f256407D;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) aVar4.f256410d.getLayoutParams();
                Log.m105925i("MicroMsg.WAGameInputPanel", "EditBar setmConfirmButtonPadding tolerate(%d),rightMargin(%d).", Integer.valueOf(a2), Integer.valueOf(layoutParams2.rightMargin));
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin + a2, layoutParams2.bottomMargin);
                aVar4.f256410d.setLayoutParams(layoutParams2);
            }
            C90097c cVar3 = cVar2 == null ? C90097c.DONE : cVar2;
            bVar3.getAttachedEditText().setImeOptions(cVar3.f258754d);
            bVar3.getAttachedEditText().setFocusable(true);
            bVar3.getAttachedEditText().setFocusableInTouchMode(true);
            bVar3.mo117869I();
            int ordinal = cVar3.ordinal();
            if (ordinal == 0) {
                ((Button) bVar3.f256407D.mo123300b()).setText(C0966R.string.a5y);
            } else if (ordinal == 1) {
                ((Button) bVar3.f256407D.mo123300b()).setText(C0966R.string.f360109a61);
            } else if (ordinal == 2) {
                ((Button) bVar3.f256407D.mo123300b()).setText(C0966R.string.f360108a60);
            } else if (ordinal == 3) {
                ((Button) bVar3.f256407D.mo123300b()).setText(C0966R.string.a5z);
            } else if (ordinal == 4) {
                ((Button) bVar3.f256407D.mo123300b()).setText(C0966R.string.f360110a62);
            }
            if (z7) {
                int i3 = C84983t0.f247662C;
                bVar3.f247683y.hideVKB();
                C84983t0.m104782w(bVar3);
                bVar3.mo117851e(C84967l0.m104750c(bVar3.f247682x));
                bVar3.f247677s.setSelected(true);
            }
        }
    }
}
