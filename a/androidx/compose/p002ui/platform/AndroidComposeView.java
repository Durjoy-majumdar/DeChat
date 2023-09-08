package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.p002ui.platform.C54188u;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103757e;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54216o0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import p009c2.C104242c0;
import p009c2.C104273u;
import p009c2.C54652b0;
import p1094c4.C104292c;
import p1094c4.C104293d;
import p1111g1.C107693a;
import p1111g1.C107694b;
import p1116h1.C108009b;
import p1116h1.C108010c;
import p1140p1.C110100f;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108500f2;
import p175j0.C108511s1;
import p175j0.C60690y0;
import p190l1.C10449p;
import p190l1.C109089d0;
import p190l1.C109098h;
import p190l1.C109109q;
import p190l1.C109114u;
import p190l1.C109115v;
import p190l1.C109116w;
import p241t0.C110879z;
import p241t0.C64198e;
import p241t0.C64199g;
import p246u1.C111080o;
import p246u1.C111091u;
import p258w0.C111680a;
import p258w0.C111681b;
import p258w0.C111682c;
import p258w0.C111683d;
import p258w0.C111684e;
import p258w0.C111685g;
import p258w0.C15031f;
import p410k0.C108792d;
import p410k0.C108793e;
import p410k0.C60926c;
import p436a1.C103232f;
import p436a1.C103235g0;
import p436a1.C103265t;
import p451b2.C104008c0;
import p451b2.C104014i;
import p451b2.C104017k;
import p451b2.C104024t;
import p451b2.C28236c;
import p451b2.C54395a;
import p451b2.C54397h;
import p451b2.C54400n;
import p559i1.C108317b;
import p559i1.C33176a;
import p560i2.C108318a;
import p560i2.C108319b;
import p560i2.C108321c;
import p560i2.C108322d;
import p560i2.C33177j;
import p560i2.C33179k;
import p560i2.C33183o;
import p618n1.C109667a;
import p618n1.C34726b;
import p618n1.C34727c;
import p631o1.C109868r0;
import p658q1.C110281b0;
import p658q1.C110282c0;
import p658q1.C110291e0;
import p658q1.C110292f0;
import p658q1.C110300i0;
import p658q1.C110301j;
import p658q1.C110308p;
import p658q1.C110311s;
import p658q1.C110323u;
import p658q1.j$$i;
import p721v0.C65503j;
import p835c1.C104225a;
import p849e3.C107207u;
import p869y0.C112306b0;
import p869y0.C112308c0;
import p869y0.C112310d0;
import p869y0.C112318j;
import p869y0.C112320k;
import p869y0.C112321l;
import p869y0.C66478i;
import p904j1.C108524d;
import p904j1.C76379b;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C48096k;
import sx3.C110821n;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002»\u0001B\u0013\u0012\b\u0010¸\u0001\u001a\u00030·\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001a\u0010\n\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R.\u0010;\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0016X\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR(\u0010W\u001a\u00020N8\u0016@\u0016X\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bU\u0010V\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010]\u001a\u00020X8\u0016X\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010f\u001a\u00020^8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b_\u0010`\u0012\u0004\be\u0010V\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR/\u0010m\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00078F@BX\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR \u0010t\u001a\u00020n8\u0016X\u0004¢\u0006\u0012\n\u0004\bo\u0010p\u0012\u0004\bs\u0010V\u001a\u0004\bq\u0010rR \u0010{\u001a\u00020u8\u0016X\u0004¢\u0006\u0012\n\u0004\bv\u0010w\u0012\u0004\bz\u0010V\u001a\u0004\bx\u0010yR.\u0010\u0001\u001a\u00020|2\u0006\u0010\u0016\u001a\u00020|8V@RX\u0002¢\u0006\u0014\n\u0004\b}\u0010h\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R3\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0016\u001a\u00030\u00018V@RX\u0002¢\u0006\u0017\n\u0005\b\u0001\u0010h\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\r8VX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010¢\u0001\u001a\u00030\u00018VX\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018VX\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018VX\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018@X\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010­\u0001R\u0016\u0010°\u0001\u001a\u00020^8VX\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010bR\u0016\u0010²\u0001\u001a\u00020N8VX\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010RR\u0018\u0010¶\u0001\u001a\u00030³\u00018VX\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¼\u0001"}, mo182094d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Lq1/c0;", "", "Ll1/d0;", "Landroidx/lifecycle/e;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/AndroidComposeView$$e;", "Lrx3/b0;", "callback", "setOnViewTreeOwnersAvailable", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "Lq1/p;", "f", "Lq1/p;", "getSharedDrawScope", "()Lq1/p;", "sharedDrawScope", "Li2/d;", "<set-?>", "g", "Li2/d;", "getDensity", "()Li2/d;", "density", "Lq1/j;", "p", "Lq1/j;", "getRoot", "()Lq1/j;", "root", "Lq1/i0;", "q", "Lq1/i0;", "getRootForTest", "()Lq1/i0;", "rootForTest", "Lu1/u;", "r", "Lu1/u;", "getSemanticsOwner", "()Lu1/u;", "semanticsOwner", "Lw0/g;", "t", "Lw0/g;", "getAutofillTree", "()Lw0/g;", "autofillTree", "Landroid/content/res/Configuration;", "z", "Lfy3/l;", "getConfigurationChangeObserver", "()Lfy3/l;", "setConfigurationChangeObserver", "(Lfy3/l;)V", "configurationChangeObserver", "Landroidx/compose/ui/platform/k;", "C", "Landroidx/compose/ui/platform/k;", "getClipboardManager", "()Landroidx/compose/ui/platform/k;", "clipboardManager", "Landroidx/compose/ui/platform/j;", "D", "Landroidx/compose/ui/platform/j;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/j;", "accessibilityManager", "Lq1/f0;", "E", "Lq1/f0;", "getSnapshotObserver", "()Lq1/f0;", "snapshotObserver", "", "F", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "Landroidx/compose/ui/platform/i2;", "L", "Landroidx/compose/ui/platform/i2;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i2;", "viewConfiguration", "", "S", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "W", "Lj0/y0;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$$e;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$$e;)V", "viewTreeOwners", "Lc2/b0;", "S0", "Lc2/b0;", "getTextInputService", "()Lc2/b0;", "getTextInputService$annotations", "textInputService", "Lb2/h$a;", "T0", "Lb2/h$a;", "getFontLoader", "()Lb2/h$a;", "getFontLoader$annotations", "fontLoader", "Lb2/i$a;", "U0", "getFontFamilyResolver", "()Lb2/i$a;", "setFontFamilyResolver", "(Lb2/i$a;)V", "fontFamilyResolver", "Li2/o;", "W0", "getLayoutDirection", "()Li2/o;", "setLayoutDirection", "(Li2/o;)V", "layoutDirection", "Lg1/a;", "X0", "Lg1/a;", "getHapticFeedBack", "()Lg1/a;", "hapticFeedBack", "Landroidx/compose/ui/platform/y1;", "Z0", "Landroidx/compose/ui/platform/y1;", "getTextToolbar", "()Landroidx/compose/ui/platform/y1;", "textToolbar", "Ll1/q;", "m1", "Ll1/q;", "getPointerIconService", "()Ll1/q;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "Ly0/i;", "getFocusManager", "()Ly0/i;", "focusManager", "Landroidx/compose/ui/platform/o2;", "getWindowInfo", "()Landroidx/compose/ui/platform/o2;", "windowInfo", "Lw0/b;", "getAutofill", "()Lw0/b;", "autofill", "Landroidx/compose/ui/platform/i0;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/i0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lh1/b;", "getInputModeManager", "()Lh1/b;", "inputModeManager", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "e", "ui_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
public final class AndroidComposeView extends ViewGroup implements C110282c0, C110300i0, C109089d0, C103757e {

    /* renamed from: n1 */
    public static Class<?> f305954n1;

    /* renamed from: o1 */
    public static Method f305955o1;

    /* renamed from: A */
    public final C111680a f305956A;

    /* renamed from: B */
    public boolean f305957B;

    /* renamed from: C */
    public final C103642k f305958C;

    /* renamed from: D */
    public final C103634j f305959D;

    /* renamed from: E */
    public final C110292f0 f305960E;

    /* renamed from: F */
    public boolean f305961F;

    /* renamed from: G */
    public C103631i0 f305962G;

    /* renamed from: H */
    public C103689u0 f305963H;

    /* renamed from: I */
    public C108319b f305964I;

    /* renamed from: J */
    public boolean f305965J;

    /* renamed from: K */
    public final C110323u f305966K;

    /* renamed from: L */
    public final C103633i2 f305967L;

    /* renamed from: M */
    public long f305968M;

    /* renamed from: N */
    public final int[] f305969N;

    /* renamed from: P */
    public final float[] f305970P;

    /* renamed from: Q */
    public final float[] f305971Q;

    /* renamed from: Q0 */
    public final ViewTreeObserver.OnTouchModeChangeListener f305972Q0;

    /* renamed from: R */
    public final float[] f305973R;

    /* renamed from: R0 */
    public final C104242c0 f305974R0;

    /* renamed from: S */
    public long f305975S;

    /* renamed from: S0 */
    public final C54652b0 f305976S0;

    /* renamed from: T */
    public boolean f305977T;

    /* renamed from: T0 */
    public final C54397h.C54398a f305978T0;

    /* renamed from: U */
    public long f305979U;

    /* renamed from: U0 */
    public final C60690y0 f305980U0;

    /* renamed from: V */
    public boolean f305981V;

    /* renamed from: V0 */
    public int f305982V0;

    /* renamed from: W */
    public final C60690y0 f305983W;

    /* renamed from: W0 */
    public final C60690y0 f305984W0;

    /* renamed from: X0 */
    public final C107693a f305985X0;

    /* renamed from: Y0 */
    public final C108010c f305986Y0;

    /* renamed from: Z0 */
    public final C103709y1 f305987Z0;

    /* renamed from: a1 */
    public MotionEvent f305988a1;

    /* renamed from: b1 */
    public long f305989b1;

    /* renamed from: c1 */
    public final C103669n2<C110281b0> f305990c1;

    /* renamed from: d */
    public long f305991d = C112539e.f336957d;

    /* renamed from: d1 */
    public final C108793e<C32224a<C13598b0>> f305992d1;

    /* renamed from: e */
    public boolean f305993e = true;

    /* renamed from: e1 */
    public final AndroidComposeView$$k f305994e1;

    /* renamed from: f */
    public final C110308p f305995f = new C110308p((C104225a) null, 1, (C8480h) null);

    /* renamed from: f1 */
    public final Runnable f305996f1;

    /* renamed from: g */
    public C108322d f305997g;

    /* renamed from: g1 */
    public boolean f305998g1;

    /* renamed from: h */
    public final C112318j f305999h;

    /* renamed from: h1 */
    public final C32224a<C13598b0> f306000h1;

    /* renamed from: i */
    public final C103677p2 f306001i;

    /* renamed from: i1 */
    public final boolean f306002i1;

    /* renamed from: j */
    public final C108524d f306003j;

    /* renamed from: j1 */
    public Canvas f306004j1;

    /* renamed from: k1 */
    public int f306005k1;

    /* renamed from: l1 */
    public C10449p f306006l1;

    /* renamed from: m1 */
    public final C109109q f306007m1;

    /* renamed from: n */
    public final C65503j f306008n;

    /* renamed from: o */
    public final C103265t f306009o;

    /* renamed from: p */
    public final C110301j f306010p;

    /* renamed from: p0 */
    public C32226l<? super AndroidComposeView$$e, C13598b0> f306011p0;

    /* renamed from: q */
    public final C110300i0 f306012q;

    /* renamed from: r */
    public final C111091u f306013r;

    /* renamed from: s */
    public final C103662m f306014s;

    /* renamed from: t */
    public final C111685g f306015t;

    /* renamed from: u */
    public final List<C110281b0> f306016u;

    /* renamed from: v */
    public List<C110281b0> f306017v;

    /* renamed from: w */
    public boolean f306018w;

    /* renamed from: x */
    public final C109098h f306019x;

    /* renamed from: x0 */
    public final ViewTreeObserver.OnGlobalLayoutListener f306020x0;

    /* renamed from: y */
    public final C109116w f306021y;

    /* renamed from: y0 */
    public final ViewTreeObserver.OnScrollChangedListener f306022y0;

    /* renamed from: z */
    public C32226l<? super Configuration, C13598b0> f306023z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        this.f305997g = C108318a.m146689a(context);
        AtomicInteger atomicInteger = C111080o.f332628f;
        C111080o oVar = new C111080o(C111080o.f332628f.addAndGet(1), false, false, AndroidComposeView$$m.f306036d);
        C112318j jVar = new C112318j((C112321l) null, 1, (C8480h) null);
        this.f305999h = jVar;
        this.f306001i = new C103677p2();
        C108524d dVar = new C108524d(new AndroidComposeView$$h(this), (C32226l<? super C76379b, Boolean>) null);
        this.f306003j = dVar;
        C65503j.C65504a aVar = C65503j.C65504a.f188490d;
        AndroidComposeView$$l androidComposeView$$l = AndroidComposeView$$l.f306035d;
        C110100f<C108317b<C34727c>> fVar = C109667a.f328292a;
        C87412m.m108594g(androidComposeView$$l, "onRotaryScrollEvent");
        C65503j a = C103612c1.m137790a(aVar, C103612c1.f306063a, new C108317b(new C34726b(androidComposeView$$l), (C32226l<? super C33176a, Boolean>) null, C109667a.f328292a));
        this.f306008n = a;
        this.f306009o = new C103265t();
        C110301j jVar2 = new C110301j(false, 1, (C8480h) null);
        jVar2.mo161677e(C109868r0.f328790b);
        jVar2.mo161675a(oVar.mo74972i0(a).mo74972i0(jVar.f336327b).mo74972i0(dVar));
        jVar2.mo161678g(getDensity());
        this.f306010p = jVar2;
        this.f306012q = this;
        this.f306013r = new C111091u(getRoot());
        C103662m mVar = new C103662m(this);
        this.f306014s = mVar;
        this.f306015t = new C111685g();
        this.f306016u = new ArrayList();
        this.f306019x = new C109098h();
        this.f306021y = new C109116w(getRoot());
        this.f306023z = AndroidComposeView$$g.f306031d;
        int i = Build.VERSION.SDK_INT;
        this.f305956A = i >= 26 ? new C111680a(this, getAutofillTree()) : null;
        this.f305958C = new C103642k(context2);
        this.f305959D = new C103634j(context2);
        this.f305960E = new C110292f0(new AndroidComposeView$$n(this));
        this.f305966K = new C110323u(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C87412m.m108593f(viewConfiguration, "get(context)");
        this.f305967L = new C103628h0(viewConfiguration);
        this.f305968M = C33177j.f90050b;
        int i2 = 2;
        this.f305969N = new int[]{0, 0};
        this.f305970P = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
        this.f305971Q = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
        this.f305973R = C103235g0.m136668a((float[]) null, 1, (C8480h) null);
        this.f305975S = -1;
        this.f305979U = C112539e.f336956c;
        this.f305981V = true;
        this.f305983W = C108500f2.m146996c((Object) null, (C108497e2) null, 2, (Object) null);
        this.f306020x0 = new AndroidComposeView$$a(this);
        this.f306022y0 = new AndroidComposeView$$b(this);
        this.f305972Q0 = new AndroidComposeView$$c(this);
        C104242c0 c0Var = new C104242c0(this);
        this.f305974R0 = c0Var;
        this.f305976S0 = (C54652b0) ((C54188u.C54189a) C54188u.f152139a).invoke(c0Var);
        this.f305978T0 = new C54158a0(context2);
        this.f305980U0 = C108500f2.m146995b(new C104017k(new C54395a(context2), C28236c.m38131a(context), (C104008c0) null, (C54400n) null, (C104024t) null, 28, (C8480h) null), C108511s1.f324833a);
        Configuration configuration = context.getResources().getConfiguration();
        C87412m.m108593f(configuration, "context.resources.configuration");
        this.f305982V0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        C87412m.m108593f(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        C33183o oVar2 = C33183o.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            oVar2 = C33183o.Rtl;
        }
        this.f305984W0 = C108500f2.m146996c(oVar2, (C108497e2) null, 2, (Object) null);
        this.f305985X0 = new C107694b(this);
        this.f305986Y0 = new C108010c(isInTouchMode() ? 1 : i2, new AndroidComposeView$$f(this), (C8480h) null);
        this.f305987Z0 = new C103608b0(this);
        this.f305990c1 = new C103669n2<>();
        this.f305992d1 = new C108793e<>(new C32224a[16], 0);
        this.f305994e1 = new AndroidComposeView$$k(this);
        this.f305996f1 = new AndroidComposeView$$d(this);
        this.f306000h1 = new AndroidComposeView$$j(this);
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            C103686t.f306257a.mo144856a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        C107207u.m145168i(this, mVar);
        getRoot().mo161715k(this);
        if (i >= 29) {
            C54184r.f152133a.mo74980a(this);
        }
        String str = Build.BRAND;
        C87412m.m108593f(str, "BRAND");
        this.f306002i1 = C112550d0.m153801u(str, "vivo", false);
        this.f306007m1 = new AndroidComposeView$$i(this);
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setFontFamilyResolver(C104014i.C104015a aVar) {
        ((C108494d2) this.f305980U0).setValue(aVar);
    }

    private void setLayoutDirection(C33183o oVar) {
        ((C108494d2) this.f305984W0).setValue(oVar);
    }

    private final void setViewTreeOwners(AndroidComposeView$$e androidComposeView$$e) {
        ((C108494d2) this.f305983W).setValue(androidComposeView$$e);
    }

    /* renamed from: A */
    public final boolean mo144609A(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo144610B(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f305988a1) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
    }

    /* renamed from: C */
    public final void mo144611C(C110281b0 b0Var, boolean z) {
        C87412m.m108594g(b0Var, "layer");
        if (!z) {
            if (!this.f306018w && !this.f306016u.remove(b0Var)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.f306018w) {
            this.f306016u.add(b0Var);
        } else {
            List list = this.f306017v;
            if (list == null) {
                list = new ArrayList();
                this.f306017v = list;
            }
            list.add(b0Var);
        }
    }

    /* renamed from: D */
    public final void mo144612D(float[] fArr, float f, float f2) {
        C103235g0.m136671d(this.f305973R);
        C103235g0.m136672e(this.f305973R, f, f2, 0.0f, 4, (Object) null);
        C54188u.m60891a(fArr, this.f305973R);
    }

    /* renamed from: E */
    public final void mo144613E() {
        if (!this.f305977T) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f305975S) {
                this.f305975S = currentAnimationTimeMillis;
                C103235g0.m136671d(this.f305970P);
                mo144618J(this, this.f305970P);
                C103625g1.m137807a(this.f305970P, this.f305971Q);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.f305969N);
                int[] iArr = this.f305969N;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.f305969N;
                this.f305979U = C112540f.m153745a(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo144614F(p658q1.C110281b0 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "layer"
            gy3.C87412m.m108594g(r5, r0)
            androidx.compose.ui.platform.u0 r0 = r4.f305963H
            if (r0 == 0) goto L_0x002f
            boolean r0 = androidx.compose.p002ui.platform.C103637j2.f306102y
            if (r0 != 0) goto L_0x002f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L_0x002f
            androidx.compose.ui.platform.n2<q1.b0> r0 = r4.f305990c1
        L_0x0015:
            java.lang.ref.ReferenceQueue<T> r1 = r0.f306227b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0022
            k0.e<java.lang.ref.Reference<T>> r2 = r0.f306226a
            r2.mo159869k(r1)
        L_0x0022:
            if (r1 != 0) goto L_0x0015
            k0.e<java.lang.ref.Reference<T>> r0 = r0.f306226a
            int r0 = r0.f325786f
            r1 = 10
            if (r0 >= r1) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 == 0) goto L_0x004f
            androidx.compose.ui.platform.n2<q1.b0> r1 = r4.f305990c1
        L_0x0034:
            java.lang.ref.ReferenceQueue<T> r2 = r1.f306227b
            java.lang.ref.Reference r2 = r2.poll()
            if (r2 == 0) goto L_0x0041
            k0.e<java.lang.ref.Reference<T>> r3 = r1.f306226a
            r3.mo159869k(r2)
        L_0x0041:
            if (r2 != 0) goto L_0x0034
            k0.e<java.lang.ref.Reference<T>> r2 = r1.f306226a
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            java.lang.ref.ReferenceQueue<T> r1 = r1.f306227b
            r3.<init>(r5, r1)
            r2.mo159860b(r3)
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.mo144614F(q1.b0):boolean");
    }

    /* renamed from: G */
    public final void mo144615G(C110301j jVar) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.f305965J && jVar != null) {
                while (jVar != null && jVar.f329891E == j$$i.InMeasureBlock) {
                    jVar = jVar.mo161723s();
                }
                if (jVar == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    /* renamed from: H */
    public final int mo144616H(MotionEvent motionEvent) {
        C109115v vVar;
        C109114u a = this.f306019x.mo160342a(motionEvent, this);
        boolean z = false;
        if (a != null) {
            List<C109115v> list = a.f326732a;
            ListIterator<C109115v> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    vVar = null;
                    break;
                }
                vVar = listIterator.previous();
                if (vVar.f326738e) {
                    break;
                }
            }
            C109115v vVar2 = vVar;
            if (vVar2 != null) {
                this.f305991d = vVar2.f326737d;
            }
            int a2 = this.f306021y.mo160360a(a, this, mo144609A(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if ((a2 & 1) != 0) {
                    z = true;
                }
                if (!z) {
                    C109098h hVar = this.f306019x;
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    hVar.f326687c.delete(pointerId);
                    hVar.f326686b.delete(pointerId);
                }
            }
            return a2;
        }
        this.f306021y.mo160361b();
        return 0;
    }

    /* renamed from: I */
    public final void mo144617I(MotionEvent motionEvent, int i, long j, boolean z) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (!(i2 == 9 || i2 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i4 = 0; i4 < pointerCount; i4++) {
                pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
            }
            int i6 = 0;
            while (i6 < pointerCount) {
                int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
                motionEvent2.getPointerProperties(i7, pointerPropertiesArr[i6]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
                motionEvent2.getPointerCoords(i7, pointerCoords);
                long i8 = mo144667i(C112540f.m153745a(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = C112539e.m153738c(i8);
                pointerCoords.y = C112539e.m153739d(i8);
                i6++;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            C109098h hVar = this.f306019x;
            C87412m.m108593f(obtain, "event");
            C109114u a = hVar.mo160342a(obtain, this);
            C87412m.m108591d(a);
            this.f306021y.mo160360a(a, this, true);
            obtain.recycle();
        }
    }

    /* renamed from: J */
    public final void mo144618J(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            mo144618J((View) parent, fArr);
            mo144612D(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            mo144612D(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            view.getLocationInWindow(this.f305969N);
            mo144612D(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            int[] iArr = this.f305969N;
            mo144612D(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            C103232f.m136645a(this.f305973R, matrix);
            C54188u.m60891a(fArr, this.f305973R);
        }
    }

    /* renamed from: K */
    public final void mo144619K() {
        getLocationOnScreen(this.f305969N);
        long j = this.f305968M;
        int i = C33177j.f90051c;
        boolean z = false;
        if (!(((int) (j >> 32)) == this.f305969N[0] && C33177j.m39962a(j) == this.f305969N[1])) {
            int[] iArr = this.f305969N;
            this.f305968M = C33179k.m39964a(iArr[0], iArr[1]);
            z = true;
        }
        this.f305966K.mo161768a(z);
    }

    /* renamed from: a */
    public void mo144620a(boolean z) {
        C32224a<C13598b0> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                aVar = this.f306000h1;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            aVar = null;
        }
        if (this.f305966K.mo161771d(aVar)) {
            requestLayout();
        }
        this.f305966K.mo161768a(false);
        C13598b0 b0Var = C13598b0.f38549a;
        Trace.endSection();
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        C111680a aVar;
        C87412m.m108594g(sparseArray, "values");
        if ((Build.VERSION.SDK_INT >= 26) && (aVar = this.f305956A) != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                C111683d dVar = C111683d.f334311a;
                C87412m.m108593f(autofillValue, "value");
                if (dVar.mo163333d(autofillValue)) {
                    C111685g gVar = aVar.f334308b;
                    String obj = dVar.mo163338i(autofillValue).toString();
                    gVar.getClass();
                    C87412m.m108594g(obj, "value");
                    C15031f fVar = (C15031f) ((LinkedHashMap) gVar.f334313a).get(Integer.valueOf(keyAt));
                } else if (dVar.mo163331b(autofillValue)) {
                    throw new C48096k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                } else if (dVar.mo163332c(autofillValue)) {
                    throw new C48096k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                } else if (dVar.mo163334e(autofillValue)) {
                    throw new C48096k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    /* renamed from: b */
    public void mo144622b(C110301j jVar, boolean z) {
        C87412m.m108594g(jVar, "layoutNode");
        if (this.f305966K.mo161775h(jVar, z)) {
            mo144615G(jVar);
        }
    }

    /* renamed from: c */
    public long mo144623c(long j) {
        mo144613E();
        return C103235g0.m136669b(this.f305971Q, j);
    }

    public boolean canScrollHorizontally(int i) {
        return this.f306014s.mo144776b(false, i, this.f305991d);
    }

    public boolean canScrollVertically(int i) {
        return this.f306014s.mo144776b(true, i, this.f305991d);
    }

    /* renamed from: d */
    public void mo144626d() {
        T[] tArr;
        if (this.f305957B) {
            C110879z zVar = getSnapshotObserver().f329869a;
            C110291e0 e0Var = C110291e0.f329868d;
            zVar.getClass();
            C87412m.m108594g(e0Var, "predicate");
            synchronized (zVar.f331675d) {
                C108793e<C110879z.C110880a<?>> eVar = zVar.f331675d;
                int i = eVar.f325786f;
                if (i > 0) {
                    T[] tArr2 = eVar.f325784d;
                    int i2 = 0;
                    while (true) {
                        C108792d<T> dVar = ((C110879z.C110880a) tArr2[i2]).f331680b;
                        int i3 = dVar.f325783d;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i3) {
                            int i6 = dVar.f325780a[i4];
                            C60926c<T> cVar = dVar.f325782c[i6];
                            C87412m.m108591d(cVar);
                            int i7 = cVar.f173545d;
                            int i8 = 0;
                            int i9 = 0;
                            while (i9 < i7) {
                                Object obj = cVar.f173546e[i9];
                                if (obj != null) {
                                    if (!((Boolean) e0Var.invoke(obj)).booleanValue()) {
                                        if (i8 != i9) {
                                            tArr = tArr2;
                                            cVar.f173546e[i8] = obj;
                                        } else {
                                            tArr = tArr2;
                                        }
                                        i8++;
                                    } else {
                                        tArr = tArr2;
                                    }
                                    i9++;
                                    tArr2 = tArr;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                }
                            }
                            T[] tArr3 = tArr2;
                            int i15 = cVar.f173545d;
                            for (int i16 = i8; i16 < i15; i16++) {
                                cVar.f173546e[i16] = null;
                            }
                            cVar.f173545d = i8;
                            if (i8 > 0) {
                                if (i5 != i4) {
                                    int[] iArr = dVar.f325780a;
                                    int i17 = iArr[i5];
                                    iArr[i5] = i6;
                                    iArr[i4] = i17;
                                }
                                i5++;
                            }
                            i4++;
                            tArr2 = tArr3;
                        }
                        T[] tArr4 = tArr2;
                        int i18 = dVar.f325783d;
                        for (int i19 = i5; i19 < i18; i19++) {
                            dVar.f325781b[dVar.f325780a[i19]] = null;
                        }
                        dVar.f325783d = i5;
                        i2++;
                        if (i2 >= i) {
                            break;
                        }
                        tArr2 = tArr4;
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
            this.f305957B = false;
        }
        C103631i0 i0Var = this.f305962G;
        if (i0Var != null) {
            mo144688r(i0Var);
        }
        while (this.f305992d1.mo159868j()) {
            int i25 = this.f305992d1.f325786f;
            for (int i26 = 0; i26 < i25; i26++) {
                T[] tArr5 = this.f305992d1.f325784d;
                C32224a aVar = (C32224a) tArr5[i26];
                tArr5[i26] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            C108793e<C32224a<C13598b0>> eVar2 = this.f305992d1;
            if (i25 > 0) {
                int i27 = eVar2.f325786f;
                if (i25 < i27) {
                    T[] tArr6 = eVar2.f325784d;
                    C110821n.m150963j(tArr6, tArr6, 0, i25, i27);
                }
                int i28 = eVar2.f325786f;
                int i29 = i28 - (i25 + 0);
                int i35 = i28 - 1;
                if (i29 <= i35) {
                    int i36 = i29;
                    while (true) {
                        eVar2.f325784d[i36] = null;
                        if (i36 == i35) {
                            break;
                        }
                        i36++;
                    }
                }
                eVar2.f325786f = i29;
            } else {
                eVar2.getClass();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r7 != null) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            gy3.C87412m.m108594g(r10, r0)
            boolean r0 = r9.f306002i1
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x008c
            android.graphics.Canvas r0 = r9.f306004j1
            boolean r0 = gy3.C87412m.m108589b(r10, r0)
            if (r0 == 0) goto L_0x0016
            goto L_0x0086
        L_0x0016:
            int r0 = r9.f306005k1
            r4 = 10
            if (r0 <= r4) goto L_0x001e
            goto L_0x0088
        L_0x001e:
            android.graphics.Canvas r4 = r9.f306004j1
            java.lang.String r5 = "drawNoChildren"
            java.lang.String r6 = "Throwable().stackTrace"
            if (r4 != 0) goto L_0x004f
            int r0 = r0 + r2
            r9.f306005k1 = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            gy3.C87412m.m108593f(r0, r6)
            int r4 = r0.length
            r6 = 0
        L_0x0037:
            if (r6 >= r4) goto L_0x0049
            r7 = r0[r6]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = gy3.C87412m.m108589b(r8, r5)
            if (r8 == 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x0037
        L_0x0049:
            r7 = r1
        L_0x004a:
            if (r7 == 0) goto L_0x0088
            r9.f306004j1 = r10
            goto L_0x0086
        L_0x004f:
            boolean r0 = r10.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0058
            r9.f306005k1 = r3
            goto L_0x0088
        L_0x0058:
            int r0 = r9.f306005k1
            int r0 = r0 + r2
            r9.f306005k1 = r0
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            gy3.C87412m.m108593f(r0, r6)
            int r4 = r0.length
            r6 = 0
        L_0x006b:
            if (r6 >= r4) goto L_0x007d
            r7 = r0[r6]
            java.lang.String r8 = r7.getMethodName()
            boolean r8 = gy3.C87412m.m108589b(r8, r5)
            if (r8 == 0) goto L_0x007a
            goto L_0x007e
        L_0x007a:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x007d:
            r7 = r1
        L_0x007e:
            if (r7 == 0) goto L_0x0083
            r9.f306004j1 = r10
            goto L_0x0084
        L_0x0083:
            r7 = r1
        L_0x0084:
            if (r7 == 0) goto L_0x0088
        L_0x0086:
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r0 == 0) goto L_0x008c
            return
        L_0x008c:
            boolean r0 = r9.isAttachedToWindow()
            if (r0 != 0) goto L_0x0099
            q1.j r0 = r9.getRoot()
            r9.mo144697w(r0)
        L_0x0099:
            p658q1.C110282c0.C110283a.m149951a(r9, r3, r2, r1)
            r9.f306018w = r2
            a1.t r0 = r9.f306009o
            a1.b r1 = r0.f304485a
            android.graphics.Canvas r4 = r1.f304427a
            r1.getClass()
            r1.f304427a = r10
            a1.b r1 = r0.f304485a
            q1.j r5 = r9.getRoot()
            r5.mo161720p(r1)
            a1.b r0 = r0.f304485a
            r0.mo142963v(r4)
            java.util.List<q1.b0> r0 = r9.f306016u
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00db
            java.util.List<q1.b0> r0 = r9.f306016u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            r1 = 0
        L_0x00c9:
            if (r1 >= r0) goto L_0x00db
            java.util.List<q1.b0> r2 = r9.f306016u
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r1)
            q1.b0 r2 = (p658q1.C110281b0) r2
            r2.mo144754f()
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00db:
            androidx.compose.ui.platform.j2$c r0 = androidx.compose.p002ui.platform.C103637j2.f306096s
            boolean r0 = androidx.compose.p002ui.platform.C103637j2.f306102y
            if (r0 == 0) goto L_0x00ef
            int r0 = r10.save()
            r1 = 0
            r10.clipRect(r1, r1, r1, r1)
            super.dispatchDraw(r10)
            r10.restoreToCount(r0)
        L_0x00ef:
            java.util.List<q1.b0> r10 = r9.f306016u
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
            r9.f306018w = r3
            java.util.List<q1.b0> r10 = r9.f306017v
            if (r10 == 0) goto L_0x010b
            gy3.C87412m.m108591d(r10)
            java.util.List<q1.b0> r0 = r9.f306016u
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.addAll(r10)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.clear()
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r9, r0)
            int r0 = r9.getActionMasked()
            r1 = 0
            r2 = 1
            r3 = 8
            if (r0 != r3) goto L_0x0067
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = r9.isFromSource(r0)
            if (r0 == 0) goto L_0x005f
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            r3 = 26
            float r3 = r9.getAxisValue(r3)
            float r3 = -r3
            n1.c r4 = new n1.c
            android.content.Context r5 = r8.getContext()
            float r5 = p849e3.C107222v.m145285d(r0, r5)
            float r5 = r5 * r3
            android.content.Context r6 = r8.getContext()
            float r0 = p849e3.C107222v.m145283b(r0, r6)
            float r3 = r3 * r0
            long r6 = r9.getEventTime()
            r4.<init>(r5, r3, r6)
            y0.j r9 = r8.f305999h
            y0.l r9 = r9.f336326a
            y0.l r9 = p869y0.C112320k.m153224a(r9)
            if (r9 == 0) goto L_0x006b
            i1.b<n1.c> r9 = r9.f336336j
            if (r9 == 0) goto L_0x006b
            boolean r0 = r9.mo158779d(r4)
            if (r0 != 0) goto L_0x005d
            boolean r9 = r9.mo158778b(r4)
            if (r9 == 0) goto L_0x006b
        L_0x005d:
            r1 = 1
            goto L_0x006b
        L_0x005f:
            int r9 = r8.mo144696v(r9)
            r9 = r9 & r2
            if (r9 == 0) goto L_0x006b
            goto L_0x005d
        L_0x0067:
            boolean r1 = super.dispatchGenericMotionEvent(r9)
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010d, code lost:
        if (r3 != Integer.MIN_VALUE) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r1, r2)
            boolean r2 = r0.f305998g1
            if (r2 == 0) goto L_0x0019
            java.lang.Runnable r2 = r0.f305996f1
            r0.removeCallbacks(r2)
            java.lang.Runnable r2 = r0.f305996f1
            androidx.compose.ui.platform.AndroidComposeView$$d r2 = (androidx.compose.p002ui.platform.AndroidComposeView$$d) r2
            r2.run()
        L_0x0019:
            boolean r2 = r17.mo144699z(r18)
            r3 = 0
            if (r2 == 0) goto L_0x0021
            return r3
        L_0x0021:
            r2 = 4098(0x1002, float:5.743E-42)
            boolean r2 = r1.isFromSource(r2)
            r4 = 10
            r5 = 7
            r6 = 1
            if (r2 == 0) goto L_0x0113
            int r2 = r1.getToolType(r3)
            if (r2 != r6) goto L_0x0113
            androidx.compose.ui.platform.m r2 = r0.f306014s
            r2.getClass()
            boolean r7 = r2.mo144785j()
            if (r7 != 0) goto L_0x0040
            goto L_0x0112
        L_0x0040:
            int r7 = r18.getAction()
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == r5) goto L_0x0066
            r5 = 9
            if (r7 == r5) goto L_0x0066
            if (r7 == r4) goto L_0x0050
            goto L_0x0112
        L_0x0050:
            int r3 = r2.f306160f
            if (r3 == r8) goto L_0x0059
            r2.updateHoveredVirtualView(r8)
            goto L_0x0111
        L_0x0059:
            androidx.compose.ui.platform.AndroidComposeView r2 = r2.f306159e
            androidx.compose.ui.platform.i0 r2 = r2.getAndroidViewsHandler$ui_release()
            boolean r1 = r2.dispatchGenericMotionEvent(r1)
        L_0x0063:
            r3 = r1
            goto L_0x0112
        L_0x0066:
            float r4 = r18.getX()
            float r5 = r18.getY()
            androidx.compose.ui.platform.AndroidComposeView r7 = r2.f306159e
            r9 = 0
            p658q1.C110282c0.C110283a.m149951a(r7, r3, r6, r9)
            q1.f r3 = new q1.f
            r3.<init>()
            androidx.compose.ui.platform.AndroidComposeView r7 = r2.f306159e
            q1.j r7 = r7.getRoot()
            long r4 = p1166z0.C112540f.m153745a(r4, r5)
            q1.j$$h r10 = p658q1.C110301j.f329884p0
            r16 = 1
            r7.getClass()
            q1.a0 r10 = r7.f329896J
            q1.s r10 = r10.f329845i
            long r12 = r10.mo161739E0(r4)
            q1.a0 r4 = r7.f329896J
            q1.s r10 = r4.f329845i
            q1.s$e<u1.m, u1.m, u1.n> r11 = p658q1.C110311s.f329969G
            r15 = 1
            r14 = r3
            r10.mo161747N0(r11, r12, r14, r15, r16)
            java.lang.Object r3 = sx3.C110818d0.m150925W(r3)
            u1.m r3 = (p246u1.C111078m) r3
            if (r3 == 0) goto L_0x00af
            q1.s r3 = r3.f329961d
            q1.j r3 = r3.f329972h
            if (r3 == 0) goto L_0x00af
            u1.m r9 = p246u1.C111090t.m151491d(r3)
        L_0x00af:
            if (r9 == 0) goto L_0x00fe
            u1.k r3 = r9.mo162827c()
            M r4 = r9.f329962e
            u1.n r4 = (p246u1.C111079n) r4
            r4.getId()
            q1.s r4 = r9.f329961d
            q1.j r5 = r4.f329972h
            boolean r7 = r3.f332625e
            if (r7 == 0) goto L_0x00cd
            u1.m r4 = p246u1.C111090t.m151490c(r5)
            if (r4 != 0) goto L_0x00cb
            r4 = r9
        L_0x00cb:
            q1.s r4 = r4.f329961d
        L_0x00cd:
            u1.z<rx3.b0> r5 = p246u1.C111092v.f332657l
            boolean r3 = r3.mo162823i(r5)
            if (r3 != 0) goto L_0x00fe
            boolean r3 = r4.mo161749Q0()
            if (r3 != 0) goto L_0x00fe
            androidx.compose.ui.platform.AndroidComposeView r3 = r2.f306159e
            androidx.compose.ui.platform.i0 r3 = r3.getAndroidViewsHandler$ui_release()
            java.util.HashMap r3 = r3.getLayoutNodeToHolder()
            q1.s r4 = r9.f329961d
            q1.j r4 = r4.f329972h
            java.lang.Object r3 = r3.get(r4)
            k2.a r3 = (p583k2.C108830a) r3
            if (r3 != 0) goto L_0x00fe
            M r3 = r9.f329962e
            u1.n r3 = (p246u1.C111079n) r3
            int r3 = r3.getId()
            int r3 = r2.mo144787p(r3)
            goto L_0x0100
        L_0x00fe:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0100:
            androidx.compose.ui.platform.AndroidComposeView r4 = r2.f306159e
            androidx.compose.ui.platform.i0 r4 = r4.getAndroidViewsHandler$ui_release()
            boolean r1 = r4.dispatchGenericMotionEvent(r1)
            r2.updateHoveredVirtualView(r3)
            if (r3 != r8) goto L_0x0111
            goto L_0x0063
        L_0x0111:
            r3 = 1
        L_0x0112:
            return r3
        L_0x0113:
            int r2 = r18.getActionMasked()
            if (r2 == r5) goto L_0x0145
            if (r2 == r4) goto L_0x011c
            goto L_0x014c
        L_0x011c:
            boolean r2 = r17.mo144609A(r18)
            if (r2 == 0) goto L_0x014c
            int r2 = r1.getToolType(r3)
            r4 = 3
            if (r2 == r4) goto L_0x013e
            android.view.MotionEvent r2 = r0.f305988a1
            if (r2 == 0) goto L_0x0130
            r2.recycle()
        L_0x0130:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r18)
            r0.f305988a1 = r1
            r0.f305998g1 = r6
            java.lang.Runnable r1 = r0.f305996f1
            r0.post(r1)
            return r3
        L_0x013e:
            int r2 = r18.getButtonState()
            if (r2 == 0) goto L_0x014c
            return r3
        L_0x0145:
            boolean r2 = r17.mo144610B(r18)
            if (r2 != 0) goto L_0x014c
            return r3
        L_0x014c:
            int r1 = r17.mo144696v(r18)
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0154
            r3 = 1
        L_0x0154:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C112321l b;
        C110301j jVar;
        C87412m.m108594g(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C108524d dVar = this.f306003j;
        dVar.getClass();
        C112321l lVar = dVar.f324862f;
        if (!(lVar == null || (b = C112310d0.m153197b(lVar)) == null)) {
            C110311s sVar = b.f336341r;
            C108524d dVar2 = null;
            if (!(sVar == null || (jVar = sVar.f329972h) == null)) {
                C108793e<C108524d> eVar = b.f336344u;
                int i = eVar.f325786f;
                if (i > 0) {
                    int i2 = 0;
                    T[] tArr = eVar.f325784d;
                    do {
                        C108524d dVar3 = (C108524d) tArr[i2];
                        if (C87412m.m108589b(dVar3.f324864h, jVar)) {
                            if (dVar2 != null) {
                                C110301j jVar2 = dVar3.f324864h;
                                C108524d dVar4 = dVar2;
                                while (true) {
                                    if (!C87412m.m108589b(dVar4, dVar3)) {
                                        dVar4 = dVar4.f324863g;
                                        if (dVar4 != null) {
                                            if (!C87412m.m108589b(dVar4.f324864h, jVar2)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            dVar2 = dVar3;
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (dVar2 == null) {
                    dVar2 = b.f336343t;
                }
            }
            if (dVar2 != null) {
                if (dVar2.mo159380d(keyEvent)) {
                    return true;
                }
                return dVar2.mo159379b(keyEvent);
            }
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "motionEvent");
        if (this.f305998g1) {
            removeCallbacks(this.f305996f1);
            MotionEvent motionEvent2 = this.f305988a1;
            C87412m.m108591d(motionEvent2);
            if (motionEvent.getActionMasked() == 0) {
                if (!((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                    this.f305998g1 = false;
                }
            }
            ((AndroidComposeView$$d) this.f305996f1).run();
        }
        if (mo144699z(motionEvent)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !mo144610B(motionEvent)) {
            return false;
        }
        int v = mo144696v(motionEvent);
        if ((v & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (v & 1) != 0;
    }

    /* renamed from: e */
    public long mo144632e(long j) {
        mo144613E();
        return C103235g0.m136669b(this.f305970P, j);
    }

    /* renamed from: f */
    public void mo144633f(C110301j jVar) {
        C87412m.m108594g(jVar, "node");
        C110323u uVar = this.f305966K;
        uVar.getClass();
        uVar.f330018b.mo161683b(jVar);
        this.f305957B = true;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return mo144695t(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public void mo144635g(C110301j jVar, boolean z) {
        C87412m.m108594g(jVar, "layoutNode");
        if (this.f305966K.mo161774g(jVar, z)) {
            mo144615G((C110301j) null);
        }
    }

    public final C103631i0 getAndroidViewsHandler$ui_release() {
        if (this.f305962G == null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            C103631i0 i0Var = new C103631i0(context);
            this.f305962G = i0Var;
            addView(i0Var);
        }
        C103631i0 i0Var2 = this.f305962G;
        C87412m.m108591d(i0Var2);
        return i0Var2;
    }

    public C111681b getAutofill() {
        return this.f305956A;
    }

    public C111685g getAutofillTree() {
        return this.f306015t;
    }

    public final C32226l<Configuration, C13598b0> getConfigurationChangeObserver() {
        return this.f306023z;
    }

    public C108322d getDensity() {
        return this.f305997g;
    }

    public C66478i getFocusManager() {
        return this.f305999h;
    }

    public void getFocusedRect(Rect rect) {
        C13598b0 b0Var;
        C87412m.m108594g(rect, "rect");
        C112321l a = C112320k.m153224a(this.f305999h.f336326a);
        if (a != null) {
            C112541g d = C112310d0.m153199d(a);
            rect.left = C60641c.m70921b(d.f336961a);
            rect.top = C60641c.m70921b(d.f336962b);
            rect.right = C60641c.m70921b(d.f336963c);
            rect.bottom = C60641c.m70921b(d.f336964d);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    public C104014i.C104015a getFontFamilyResolver() {
        return (C104014i.C104015a) this.f305980U0.getValue();
    }

    public C54397h.C54398a getFontLoader() {
        return this.f305978T0;
    }

    public C107693a getHapticFeedBack() {
        return this.f305985X0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.f305966K.f330018b.f329856a.isEmpty();
    }

    public C108009b getInputModeManager() {
        return this.f305986Y0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f305975S;
    }

    public C33183o getLayoutDirection() {
        return (C33183o) this.f305984W0.getValue();
    }

    public long getMeasureIteration() {
        C110323u uVar = this.f305966K;
        if (uVar.f330019c) {
            return uVar.f330022f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public C109109q getPointerIconService() {
        return this.f306007m1;
    }

    public C110301j getRoot() {
        return this.f306010p;
    }

    public C110300i0 getRootForTest() {
        return this.f306012q;
    }

    public C111091u getSemanticsOwner() {
        return this.f306013r;
    }

    public C110308p getSharedDrawScope() {
        return this.f305995f;
    }

    public boolean getShowLayoutBounds() {
        return this.f305961F;
    }

    public C110292f0 getSnapshotObserver() {
        return this.f305960E;
    }

    public C54652b0 getTextInputService() {
        return this.f305976S0;
    }

    public C103709y1 getTextToolbar() {
        return this.f305987Z0;
    }

    public View getView() {
        return this;
    }

    public C103633i2 getViewConfiguration() {
        return this.f305967L;
    }

    public final AndroidComposeView$$e getViewTreeOwners() {
        return (AndroidComposeView$$e) this.f305983W.getValue();
    }

    public C103673o2 getWindowInfo() {
        return this.f306001i;
    }

    /* renamed from: h */
    public void mo144666h(C110301j jVar) {
        C87412m.m108594g(jVar, "node");
    }

    /* renamed from: i */
    public long mo144667i(long j) {
        mo144613E();
        long b = C103235g0.m136669b(this.f305970P, j);
        return C112540f.m153745a(C112539e.m153738c(b) + C112539e.m153738c(this.f305979U), C112539e.m153739d(b) + C112539e.m153739d(this.f305979U));
    }

    /* renamed from: j */
    public void mo144668j(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        this.f305966K.mo161770c(jVar);
    }

    /* renamed from: k */
    public void mo144669k() {
        C103662m mVar = this.f306014s;
        mVar.f306171t = true;
        if (mVar.mo144785j() && !mVar.f306177z) {
            mVar.f306177z = true;
            mVar.f306162h.post(mVar.f306156A);
        }
    }

    /* renamed from: l */
    public long mo144670l(long j) {
        mo144613E();
        return C103235g0.m136669b(this.f305971Q, C112540f.m153745a(C112539e.m153738c(j) - C112539e.m153738c(this.f305979U), C112539e.m153739d(j) - C112539e.m153739d(this.f305979U)));
    }

    /* renamed from: m */
    public void mo144671m(C110301j jVar) {
        C87412m.m108594g(jVar, "layoutNode");
        C103662m mVar = this.f306014s;
        mVar.getClass();
        mVar.f306171t = true;
        if (mVar.mo144785j()) {
            mVar.mo144786k(jVar);
        }
    }

    /* renamed from: n */
    public void mo144672n(C110282c0.C110284b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C110323u uVar = this.f305966K;
        uVar.getClass();
        uVar.f330021e.mo159860b(bVar);
        mo144615G((C110301j) null);
    }

    /* renamed from: o */
    public void mo144673o(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.f305992d1.mo159864f(aVar)) {
            this.f305992d1.mo159860b(aVar);
        }
    }

    public void onAttachedToWindow() {
        C0125s sVar;
        C39623j lifecycle;
        C0125s sVar2;
        C111680a aVar;
        super.onAttachedToWindow();
        mo144698y(getRoot());
        mo144697w(getRoot());
        getSnapshotObserver().f329869a.mo162586c();
        boolean z = true;
        if ((Build.VERSION.SDK_INT >= 26) && (aVar = this.f305956A) != null) {
            C111684e.f334312a.mo163339a(aVar);
        }
        C0125s a = C54216o0.m60904a(this);
        C104292c a2 = C104293d.m139244a(this);
        AndroidComposeView$$e viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a == null || a2 == null || (a == (sVar2 = viewTreeOwners.f306028a) && a2 == sVar2))) {
            z = false;
        }
        if (z) {
            if (a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (a2 != null) {
                if (!(viewTreeOwners == null || (sVar = viewTreeOwners.f306028a) == null || (lifecycle = sVar.getLifecycle()) == null)) {
                    lifecycle.removeObserver(this);
                }
                a.getLifecycle().addObserver(this);
                AndroidComposeView$$e androidComposeView$$e = new AndroidComposeView$$e(a, a2);
                setViewTreeOwners(androidComposeView$$e);
                C32226l<? super AndroidComposeView$$e, C13598b0> lVar = this.f306011p0;
                if (lVar != null) {
                    lVar.invoke(androidComposeView$$e);
                }
                this.f306011p0 = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        AndroidComposeView$$e viewTreeOwners2 = getViewTreeOwners();
        C87412m.m108591d(viewTreeOwners2);
        viewTreeOwners2.f306028a.getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f306020x0);
        getViewTreeObserver().addOnScrollChangedListener(this.f306022y0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f305972Q0);
    }

    public boolean onCheckIsTextEditor() {
        return this.f305974R0.f308552c;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        this.f305997g = C108318a.m146689a(context);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.f305982V0) {
            if (i >= 31) {
                i2 = configuration.fontWeightAdjustment;
            }
            this.f305982V0 = i2;
            Context context2 = getContext();
            C87412m.m108593f(context2, "context");
            setFontFamilyResolver(new C104017k(new C54395a(context2), C28236c.m38131a(context2), (C104008c0) null, (C54400n) null, (C104024t) null, 28, (C8480h) null));
        }
        this.f306023z.invoke(configuration);
    }

    public /* synthetic */ void onCreate(C0125s sVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "outAttrs"
            gy3.C87412m.m108594g(r0, r1)
            r1 = r17
            c2.c0 r2 = r1.f305974R0
            r2.getClass()
            boolean r3 = r2.f308552c
            if (r3 != 0) goto L_0x0015
            r4 = 0
            goto L_0x0246
        L_0x0015:
            c2.l r3 = r2.f308556g
            c2.z r5 = r2.f308555f
            java.lang.String r6 = "imeOptions"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.String r6 = "textFieldValue"
            gy3.C87412m.m108594g(r5, r6)
            int r6 = r3.f308598e
            r7 = 1
            if (r6 != r7) goto L_0x002a
            r9 = 1
            goto L_0x002b
        L_0x002a:
            r9 = 0
        L_0x002b:
            r10 = 2
            r11 = 3
            r12 = 6
            r13 = 5
            r14 = 7
            r15 = 4
            if (r9 == 0) goto L_0x003a
            boolean r9 = r3.f308594a
            if (r9 == 0) goto L_0x0038
            goto L_0x0077
        L_0x0038:
            r9 = 0
            goto L_0x0078
        L_0x003a:
            if (r6 != 0) goto L_0x003e
            r9 = 1
            goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r9 == 0) goto L_0x0043
            r9 = 1
            goto L_0x0078
        L_0x0043:
            if (r6 != r10) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            if (r9 == 0) goto L_0x004c
            r9 = 2
            goto L_0x0078
        L_0x004c:
            if (r6 != r12) goto L_0x0050
            r9 = 1
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            if (r9 == 0) goto L_0x0055
            r9 = 5
            goto L_0x0078
        L_0x0055:
            if (r6 != r13) goto L_0x0059
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 == 0) goto L_0x005e
            r9 = 7
            goto L_0x0078
        L_0x005e:
            if (r6 != r11) goto L_0x0062
            r9 = 1
            goto L_0x0063
        L_0x0062:
            r9 = 0
        L_0x0063:
            if (r9 == 0) goto L_0x0067
            r9 = 3
            goto L_0x0078
        L_0x0067:
            if (r6 != r15) goto L_0x006b
            r9 = 1
            goto L_0x006c
        L_0x006b:
            r9 = 0
        L_0x006c:
            if (r9 == 0) goto L_0x0070
            r9 = 4
            goto L_0x0078
        L_0x0070:
            if (r6 != r14) goto L_0x0074
            r9 = 1
            goto L_0x0075
        L_0x0074:
            r9 = 0
        L_0x0075:
            if (r9 == 0) goto L_0x0253
        L_0x0077:
            r9 = 6
        L_0x0078:
            r0.imeOptions = r9
            int r4 = r3.f308597d
            if (r4 != r7) goto L_0x0081
            r16 = 1
            goto L_0x0083
        L_0x0081:
            r16 = 0
        L_0x0083:
            r8 = 129(0x81, float:1.81E-43)
            if (r16 == 0) goto L_0x008b
            r0.inputType = r7
            goto L_0x00ed
        L_0x008b:
            if (r4 != r10) goto L_0x0090
            r16 = 1
            goto L_0x0092
        L_0x0090:
            r16 = 0
        L_0x0092:
            if (r16 == 0) goto L_0x009c
            r0.inputType = r7
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r9
            r0.imeOptions = r4
            goto L_0x00ed
        L_0x009c:
            if (r4 != r11) goto L_0x00a0
            r9 = 1
            goto L_0x00a1
        L_0x00a0:
            r9 = 0
        L_0x00a1:
            if (r9 == 0) goto L_0x00a6
            r0.inputType = r10
            goto L_0x00ed
        L_0x00a6:
            if (r4 != r15) goto L_0x00aa
            r9 = 1
            goto L_0x00ab
        L_0x00aa:
            r9 = 0
        L_0x00ab:
            if (r9 == 0) goto L_0x00b0
            r0.inputType = r11
            goto L_0x00ed
        L_0x00b0:
            if (r4 != r13) goto L_0x00b4
            r9 = 1
            goto L_0x00b5
        L_0x00b4:
            r9 = 0
        L_0x00b5:
            if (r9 == 0) goto L_0x00bc
            r4 = 17
            r0.inputType = r4
            goto L_0x00ed
        L_0x00bc:
            if (r4 != r12) goto L_0x00c0
            r9 = 1
            goto L_0x00c1
        L_0x00c0:
            r9 = 0
        L_0x00c1:
            if (r9 == 0) goto L_0x00c8
            r4 = 33
            r0.inputType = r4
            goto L_0x00ed
        L_0x00c8:
            if (r4 != r14) goto L_0x00cc
            r9 = 1
            goto L_0x00cd
        L_0x00cc:
            r9 = 0
        L_0x00cd:
            if (r9 == 0) goto L_0x00d2
            r0.inputType = r8
            goto L_0x00ed
        L_0x00d2:
            r9 = 8
            if (r4 != r9) goto L_0x00d8
            r9 = 1
            goto L_0x00d9
        L_0x00d8:
            r9 = 0
        L_0x00d9:
            if (r9 == 0) goto L_0x00e0
            r9 = 18
            r0.inputType = r9
            goto L_0x00ed
        L_0x00e0:
            r9 = 9
            if (r4 != r9) goto L_0x00e6
            r4 = 1
            goto L_0x00e7
        L_0x00e6:
            r4 = 0
        L_0x00e7:
            if (r4 == 0) goto L_0x0247
            r4 = 8194(0x2002, float:1.1482E-41)
            r0.inputType = r4
        L_0x00ed:
            boolean r4 = r3.f308594a
            if (r4 != 0) goto L_0x010f
            int r4 = r0.inputType
            r9 = r4 & 1
            if (r9 != r7) goto L_0x00f9
            r9 = 1
            goto L_0x00fa
        L_0x00f9:
            r9 = 0
        L_0x00fa:
            if (r9 == 0) goto L_0x010f
            r9 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r9
            r0.inputType = r4
            if (r6 != r7) goto L_0x0105
            r4 = 1
            goto L_0x0106
        L_0x0105:
            r4 = 0
        L_0x0106:
            if (r4 == 0) goto L_0x010f
            int r4 = r0.imeOptions
            r6 = 1073741824(0x40000000, float:2.0)
            r4 = r4 | r6
            r0.imeOptions = r4
        L_0x010f:
            int r4 = r0.inputType
            r6 = r4 & 1
            if (r6 != r7) goto L_0x0117
            r6 = 1
            goto L_0x0118
        L_0x0117:
            r6 = 0
        L_0x0118:
            if (r6 == 0) goto L_0x014b
            int r6 = r3.f308595b
            if (r6 != r7) goto L_0x0120
            r9 = 1
            goto L_0x0121
        L_0x0120:
            r9 = 0
        L_0x0121:
            if (r9 == 0) goto L_0x0128
            r4 = r4 | 4096(0x1000, float:5.74E-42)
            r0.inputType = r4
            goto L_0x013f
        L_0x0128:
            if (r6 != r10) goto L_0x012c
            r9 = 1
            goto L_0x012d
        L_0x012c:
            r9 = 0
        L_0x012d:
            if (r9 == 0) goto L_0x0134
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
            r0.inputType = r4
            goto L_0x013f
        L_0x0134:
            if (r6 != r11) goto L_0x0138
            r6 = 1
            goto L_0x0139
        L_0x0138:
            r6 = 0
        L_0x0139:
            if (r6 == 0) goto L_0x013f
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r0.inputType = r4
        L_0x013f:
            boolean r3 = r3.f308596c
            if (r3 == 0) goto L_0x014b
            int r3 = r0.inputType
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
            r0.inputType = r3
        L_0x014b:
            long r3 = r5.f78286b
            int r6 = p735w1.C38006x.f100499c
            r6 = 32
            long r11 = r3 >> r6
            int r6 = (int) r11
            r0.initialSelStart = r6
            int r3 = p735w1.C38006x.m41695c(r3)
            r0.initialSelEnd = r3
            w1.a r3 = r5.f78285a
            java.lang.String r3 = r3.f100413d
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L_0x016c
            r6 = 0
            p1113g3.C107720a.C107721a.m145919a(r0, r3, r6)
            goto L_0x022c
        L_0x016c:
            r6 = 0
            r3.getClass()
            if (r4 < r5) goto L_0x0177
            p1113g3.C107720a.C107721a.m145919a(r0, r3, r6)
            goto L_0x022c
        L_0x0177:
            int r4 = r0.initialSelStart
            int r5 = r0.initialSelEnd
            if (r4 <= r5) goto L_0x0180
            int r6 = r5 + 0
            goto L_0x0182
        L_0x0180:
            int r6 = r4 + 0
        L_0x0182:
            r9 = 0
            if (r4 <= r5) goto L_0x0187
            int r4 = r4 - r9
            goto L_0x0189
        L_0x0187:
            int r4 = r5 + 0
        L_0x0189:
            int r5 = r3.length()
            if (r6 < 0) goto L_0x0227
            if (r4 <= r5) goto L_0x0195
            r3 = 0
            r9 = 0
            goto L_0x0229
        L_0x0195:
            int r9 = r0.inputType
            r9 = r9 & 4095(0xfff, float:5.738E-42)
            if (r9 == r8) goto L_0x01a6
            r8 = 225(0xe1, float:3.15E-43)
            if (r9 == r8) goto L_0x01a6
            r8 = 18
            if (r9 != r8) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r8 = 0
            goto L_0x01a7
        L_0x01a6:
            r8 = 1
        L_0x01a7:
            if (r8 == 0) goto L_0x01b0
            r8 = 0
            r9 = 0
            p1113g3.C107720a.m145918a(r0, r8, r9, r9)
            goto L_0x022c
        L_0x01b0:
            r8 = 2048(0x800, float:2.87E-42)
            if (r5 > r8) goto L_0x01b9
            p1113g3.C107720a.m145918a(r0, r3, r6, r4)
            goto L_0x022c
        L_0x01b9:
            int r5 = r4 - r6
            r8 = 1024(0x400, float:1.435E-42)
            if (r5 <= r8) goto L_0x01c1
            r8 = 0
            goto L_0x01c2
        L_0x01c1:
            r8 = r5
        L_0x01c2:
            int r9 = r3.length()
            int r9 = r9 - r4
            int r11 = 2048 - r8
            r12 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r14 = (double) r11
            double r14 = r14 * r12
            int r12 = (int) r14
            int r12 = java.lang.Math.min(r6, r12)
            int r12 = r11 - r12
            int r9 = java.lang.Math.min(r9, r12)
            int r11 = r11 - r9
            int r11 = java.lang.Math.min(r6, r11)
            int r6 = r6 - r11
            char r12 = r3.charAt(r6)
            boolean r12 = java.lang.Character.isLowSurrogate(r12)
            if (r12 == 0) goto L_0x01f0
            int r6 = r6 + 1
            int r11 = r11 + -1
        L_0x01f0:
            int r12 = r4 + r9
            int r12 = r12 - r7
            char r12 = r3.charAt(r12)
            boolean r12 = java.lang.Character.isHighSurrogate(r12)
            if (r12 == 0) goto L_0x01ff
            int r9 = r9 + -1
        L_0x01ff:
            int r12 = r11 + r8
            int r12 = r12 + r9
            if (r8 == r5) goto L_0x021b
            int r5 = r6 + r11
            java.lang.CharSequence r5 = r3.subSequence(r6, r5)
            int r9 = r9 + r4
            java.lang.CharSequence r3 = r3.subSequence(r4, r9)
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r10]
            r9 = 0
            r4[r9] = r5
            r4[r7] = r3
            java.lang.CharSequence r3 = android.text.TextUtils.concat(r4)
            goto L_0x0221
        L_0x021b:
            r9 = 0
            int r12 = r12 + r6
            java.lang.CharSequence r3 = r3.subSequence(r6, r12)
        L_0x0221:
            int r11 = r11 + r9
            int r8 = r8 + r11
            p1113g3.C107720a.m145918a(r0, r3, r11, r8)
            goto L_0x022c
        L_0x0227:
            r9 = 0
            r3 = 0
        L_0x0229:
            p1113g3.C107720a.m145918a(r0, r3, r9, r9)
        L_0x022c:
            int r3 = r0.imeOptions
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r4
            r0.imeOptions = r3
            c2.z r0 = r2.f308555f
            c2.l r3 = r2.f308556g
            boolean r3 = r3.f308596c
            c2.e0 r4 = new c2.e0
            r4.<init>(r2)
            c2.v r5 = new c2.v
            r5.<init>(r0, r4, r3)
            r2.f308557h = r5
            r4 = r5
        L_0x0246:
            return r4
        L_0x0247:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid Keyboard Type"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0253:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "invalid ImeAction"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public /* synthetic */ void onDestroy(C0125s sVar) {
    }

    public void onDetachedFromWindow() {
        C111680a aVar;
        C0125s sVar;
        C39623j lifecycle;
        super.onDetachedFromWindow();
        C110292f0 snapshotObserver = getSnapshotObserver();
        C64198e eVar = snapshotObserver.f329869a.f331676e;
        if (eVar != null) {
            ((C64199g) eVar).dispose();
        }
        snapshotObserver.f329869a.mo162584a();
        AndroidComposeView$$e viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (sVar = viewTreeOwners.f306028a) == null || (lifecycle = sVar.getLifecycle()) == null)) {
            lifecycle.removeObserver(this);
        }
        if ((Build.VERSION.SDK_INT >= 26) && (aVar = this.f305956A) != null) {
            C111684e.f334312a.mo163340b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f306020x0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f306022y0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f305972Q0);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C112318j jVar = this.f305999h;
        if (z) {
            C112321l lVar = jVar.f336326a;
            if (lVar.f336333g == C112306b0.Inactive) {
                lVar.mo164050b(C112306b0.Active);
                return;
            }
            return;
        }
        C112308c0.m153189c(jVar.f336326a, true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f305964I = null;
        mo144619K();
        if (this.f305962G != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                mo144698y(getRoot());
            }
            C13604l<Integer, Integer> s = mo144689s(i);
            int intValue = ((Number) s.f38555d).intValue();
            int intValue2 = ((Number) s.f38556e).intValue();
            C13604l<Integer, Integer> s2 = mo144689s(i2);
            long a = C108321c.m146704a(intValue, intValue2, ((Number) s2.f38555d).intValue(), ((Number) s2.f38556e).intValue());
            C108319b bVar = this.f305964I;
            boolean z = false;
            if (bVar == null) {
                this.f305964I = new C108319b(a);
                this.f305965J = false;
            } else {
                if (bVar != null) {
                    z = C108319b.m146691b(bVar.f324343a, a);
                }
                if (!z) {
                    this.f305965J = true;
                }
            }
            this.f305966K.mo161776i(a);
            this.f305966K.mo161771d(this.f306000h1);
            setMeasuredDimension(getRoot().f329896J.f328779d, getRoot().f329896J.f328780e);
            if (this.f305962G != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f329896J.f328779d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f329896J.f328780e, 1073741824));
            }
            C13598b0 b0Var = C13598b0.f38549a;
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ void onPause(C0125s sVar) {
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C111680a aVar;
        if ((Build.VERSION.SDK_INT >= 26) && viewStructure != null && (aVar = this.f305956A) != null) {
            int a = C111682c.f334310a.mo163326a(viewStructure, aVar.f334308b.f334313a.size());
            for (Map.Entry entry : ((LinkedHashMap) aVar.f334308b.f334313a).entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                C15031f fVar = (C15031f) entry.getValue();
                C111682c cVar = C111682c.f334310a;
                ViewStructure b = cVar.mo163327b(viewStructure, a);
                if (b == null) {
                    a++;
                } else {
                    C111683d dVar = C111683d.f334311a;
                    AutofillId a2 = dVar.mo163330a(viewStructure);
                    C87412m.m108591d(a2);
                    dVar.mo163336g(b, a2, intValue);
                    cVar.mo163329d(b, intValue, aVar.f334307a.getContext().getPackageName(), (String) null, (String) null);
                    dVar.mo163337h(b, 1);
                    fVar.getClass();
                    throw null;
                }
            }
        }
    }

    public void onResume(C0125s sVar) {
        Object obj;
        C87412m.m108594g(sVar, "owner");
        boolean z = false;
        try {
            if (f305954n1 == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f305954n1 = cls;
                f305955o1 = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
            }
            Method method = f305955o1;
            Boolean bool = null;
            if (method != null) {
                obj = method.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool != null) {
                z = bool.booleanValue();
            }
        } catch (Exception unused) {
        }
        setShowLayoutBounds(z);
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.f305993e) {
            C32226l<? super C104273u, ? extends C54652b0> lVar = C54188u.f152139a;
            C33183o oVar = C33183o.Ltr;
            if (i != 0 && i == 1) {
                oVar = C33183o.Rtl;
            }
            setLayoutDirection(oVar);
            C112318j jVar = this.f305999h;
            jVar.getClass();
            jVar.f336328c = oVar;
        }
    }

    public /* synthetic */ void onStart(C0125s sVar) {
    }

    public /* synthetic */ void onStop(C0125s sVar) {
    }

    public void onWindowFocusChanged(boolean z) {
        ((C108494d2) this.f306001i.f306235a).setValue(Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
    }

    /* renamed from: p */
    public void mo144686p(C110301j jVar, long j) {
        C87412m.m108594g(jVar, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f305966K.mo161772e(jVar, j);
            this.f305966K.mo161768a(false);
            C13598b0 b0Var = C13598b0.f38549a;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A[LOOP_START] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p658q1.C110281b0 mo144687q(fy3.C32226l<? super p436a1.C103262s, rx3.C13598b0> r4, fy3.C32224a<rx3.C13598b0> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "drawBlock"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "invalidateParentLayer"
            gy3.C87412m.m108594g(r5, r0)
            androidx.compose.ui.platform.n2<q1.b0> r0 = r3.f305990c1
        L_0x000c:
            java.lang.ref.ReferenceQueue<T> r1 = r0.f306227b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0019
            k0.e<java.lang.ref.Reference<T>> r2 = r0.f306226a
            r2.mo159869k(r1)
        L_0x0019:
            if (r1 != 0) goto L_0x000c
        L_0x001b:
            k0.e<java.lang.ref.Reference<T>> r1 = r0.f306226a
            boolean r1 = r1.mo159868j()
            if (r1 == 0) goto L_0x0036
            k0.e<java.lang.ref.Reference<T>> r1 = r0.f306226a
            int r2 = r1.f325786f
            int r2 = r2 + -1
            java.lang.Object r1 = r1.mo159871m(r2)
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x001b
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            q1.b0 r1 = (p658q1.C110281b0) r1
            if (r1 == 0) goto L_0x003f
            r1.mo144750d(r4, r5)
            return r1
        L_0x003f:
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0058
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x0058
            boolean r0 = r3.f305981V
            if (r0 == 0) goto L_0x0058
            androidx.compose.ui.platform.q1 r0 = new androidx.compose.ui.platform.q1     // Catch:{ all -> 0x0055 }
            r0.<init>(r3, r4, r5)     // Catch:{ all -> 0x0055 }
            return r0
        L_0x0055:
            r0 = 0
            r3.f305981V = r0
        L_0x0058:
            androidx.compose.ui.platform.u0 r0 = r3.f305963H
            if (r0 != 0) goto L_0x0092
            androidx.compose.ui.platform.j2$c r0 = androidx.compose.p002ui.platform.C103637j2.f306096s
            boolean r1 = androidx.compose.p002ui.platform.C103637j2.f306101x
            if (r1 != 0) goto L_0x006e
            android.view.View r1 = new android.view.View
            android.content.Context r2 = r3.getContext()
            r1.<init>(r2)
            r0.mo144769a(r1)
        L_0x006e:
            boolean r0 = androidx.compose.p002ui.platform.C103637j2.f306102y
            java.lang.String r1 = "context"
            if (r0 == 0) goto L_0x0081
            androidx.compose.ui.platform.u0 r0 = new androidx.compose.ui.platform.u0
            android.content.Context r2 = r3.getContext()
            gy3.C87412m.m108593f(r2, r1)
            r0.<init>(r2)
            goto L_0x008d
        L_0x0081:
            androidx.compose.ui.platform.k2 r0 = new androidx.compose.ui.platform.k2
            android.content.Context r2 = r3.getContext()
            gy3.C87412m.m108593f(r2, r1)
            r0.<init>(r2)
        L_0x008d:
            r3.f305963H = r0
            r3.addView(r0)
        L_0x0092:
            androidx.compose.ui.platform.j2 r0 = new androidx.compose.ui.platform.j2
            androidx.compose.ui.platform.u0 r1 = r3.f305963H
            gy3.C87412m.m108591d(r1)
            r0.<init>(r3, r1, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.mo144687q(fy3.l, fy3.a):q1.b0");
    }

    /* renamed from: r */
    public final void mo144688r(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo144626d();
            } else if (childAt instanceof ViewGroup) {
                mo144688r((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: s */
    public final C13604l<Integer, Integer> mo144689s(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new C13604l<>(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new C13604l<>(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new C13604l<>(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public final void setConfigurationChangeObserver(C32226l<? super Configuration, C13598b0> lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.f306023z = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f305975S = j;
    }

    public final void setOnViewTreeOwnersAvailable(C32226l<? super AndroidComposeView$$e, C13598b0> lVar) {
        C87412m.m108594g(lVar, "callback");
        AndroidComposeView$$e viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f306011p0 = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z) {
        this.f305961F = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final View mo144695t(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (C87412m.m108589b(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C87412m.m108593f(childAt, "currentView.getChildAt(i)");
            View t = mo144695t(i, childAt);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[Catch:{ all -> 0x0080, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[Catch:{ all -> 0x0080, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4 A[Catch:{ all -> 0x0080, all -> 0x0104 }] */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo144696v(android.view.MotionEvent r13) {
        /*
            r12 = this;
            androidx.compose.ui.platform.AndroidComposeView$$k r0 = r12.f305994e1
            r12.removeCallbacks(r0)
            r0 = 0
            long r1 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x0104 }
            r12.f305975S = r1     // Catch:{ all -> 0x0104 }
            float[] r1 = r12.f305970P     // Catch:{ all -> 0x0104 }
            p436a1.C103235g0.m136671d(r1)     // Catch:{ all -> 0x0104 }
            float[] r1 = r12.f305970P     // Catch:{ all -> 0x0104 }
            r12.mo144618J(r12, r1)     // Catch:{ all -> 0x0104 }
            float[] r1 = r12.f305970P     // Catch:{ all -> 0x0104 }
            float[] r2 = r12.f305971Q     // Catch:{ all -> 0x0104 }
            androidx.compose.p002ui.platform.C103625g1.m137807a(r1, r2)     // Catch:{ all -> 0x0104 }
            float[] r1 = r12.f305970P     // Catch:{ all -> 0x0104 }
            float r2 = r13.getX()     // Catch:{ all -> 0x0104 }
            float r3 = r13.getY()     // Catch:{ all -> 0x0104 }
            long r2 = p1166z0.C112540f.m153745a(r2, r3)     // Catch:{ all -> 0x0104 }
            long r1 = p436a1.C103235g0.m136669b(r1, r2)     // Catch:{ all -> 0x0104 }
            float r3 = r13.getRawX()     // Catch:{ all -> 0x0104 }
            float r4 = p1166z0.C112539e.m153738c(r1)     // Catch:{ all -> 0x0104 }
            float r3 = r3 - r4
            float r4 = r13.getRawY()     // Catch:{ all -> 0x0104 }
            float r1 = p1166z0.C112539e.m153739d(r1)     // Catch:{ all -> 0x0104 }
            float r4 = r4 - r1
            long r1 = p1166z0.C112540f.m153745a(r3, r4)     // Catch:{ all -> 0x0104 }
            r12.f305979U = r1     // Catch:{ all -> 0x0104 }
            r1 = 1
            r12.f305977T = r1     // Catch:{ all -> 0x0104 }
            r12.mo144620a(r0)     // Catch:{ all -> 0x0104 }
            r2 = 0
            r12.f306006l1 = r2     // Catch:{ all -> 0x0104 }
            java.lang.String r2 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x0104 }
            int r2 = r13.getActionMasked()     // Catch:{ all -> 0x0080 }
            android.view.MotionEvent r9 = r12.f305988a1     // Catch:{ all -> 0x0080 }
            r10 = 3
            if (r9 == 0) goto L_0x0066
            int r3 = r9.getToolType(r0)     // Catch:{ all -> 0x0080 }
            if (r3 != r10) goto L_0x0066
            r11 = 1
            goto L_0x0067
        L_0x0066:
            r11 = 0
        L_0x0067:
            if (r9 == 0) goto L_0x00ba
            int r3 = r9.getSource()     // Catch:{ all -> 0x0080 }
            int r4 = r13.getSource()     // Catch:{ all -> 0x0080 }
            if (r3 != r4) goto L_0x0083
            int r3 = r9.getToolType(r0)     // Catch:{ all -> 0x0080 }
            int r4 = r13.getToolType(r0)     // Catch:{ all -> 0x0080 }
            if (r3 == r4) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            r3 = 0
            goto L_0x0084
        L_0x0080:
            r13 = move-exception
            goto L_0x0100
        L_0x0083:
            r3 = 1
        L_0x0084:
            if (r3 == 0) goto L_0x00ba
            int r3 = r9.getButtonState()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x008d
            goto L_0x009b
        L_0x008d:
            int r3 = r9.getActionMasked()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x009b
            r4 = 2
            if (r3 == r4) goto L_0x009b
            r4 = 6
            if (r3 == r4) goto L_0x009b
            r3 = 0
            goto L_0x009c
        L_0x009b:
            r3 = 1
        L_0x009c:
            if (r3 == 0) goto L_0x00a4
            l1.w r3 = r12.f306021y     // Catch:{ all -> 0x0080 }
            r3.mo160361b()     // Catch:{ all -> 0x0080 }
            goto L_0x00ba
        L_0x00a4:
            int r3 = r9.getActionMasked()     // Catch:{ all -> 0x0080 }
            r4 = 10
            if (r3 == r4) goto L_0x00ba
            if (r11 == 0) goto L_0x00ba
            r5 = 10
            long r6 = r9.getEventTime()     // Catch:{ all -> 0x0080 }
            r8 = 1
            r3 = r12
            r4 = r9
            r3.mo144617I(r4, r5, r6, r8)     // Catch:{ all -> 0x0080 }
        L_0x00ba:
            int r3 = r13.getToolType(r0)     // Catch:{ all -> 0x0080 }
            if (r3 != r10) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            if (r11 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            if (r2 == r10) goto L_0x00de
            r1 = 9
            if (r2 == r1) goto L_0x00de
            boolean r1 = r12.mo144609A(r13)     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x00de
            r4 = 9
            long r5 = r13.getEventTime()     // Catch:{ all -> 0x0080 }
            r7 = 1
            r2 = r12
            r3 = r13
            r2.mo144617I(r3, r4, r5, r7)     // Catch:{ all -> 0x0080 }
        L_0x00de:
            if (r9 == 0) goto L_0x00e3
            r9.recycle()     // Catch:{ all -> 0x0080 }
        L_0x00e3:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r13)     // Catch:{ all -> 0x0080 }
            r12.f305988a1 = r1     // Catch:{ all -> 0x0080 }
            int r13 = r12.mo144616H(r13)     // Catch:{ all -> 0x0080 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0104 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0104 }
            r2 = 24
            if (r1 < r2) goto L_0x00fd
            androidx.compose.ui.platform.s r1 = androidx.compose.p002ui.platform.C103684s.f306255a     // Catch:{ all -> 0x0104 }
            l1.p r2 = r12.f306006l1     // Catch:{ all -> 0x0104 }
            r1.mo144854a(r12, r2)     // Catch:{ all -> 0x0104 }
        L_0x00fd:
            r12.f305977T = r0
            return r13
        L_0x0100:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0104 }
            throw r13     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r13 = move-exception
            r12.f305977T = r0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidComposeView.mo144696v(android.view.MotionEvent):int");
    }

    /* renamed from: w */
    public final void mo144697w(C110301j jVar) {
        jVar.mo161730y();
        C108793e<C110301j> u = jVar.mo161726u();
        int i = u.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = u.f325784d;
            do {
                mo144697w((C110301j) tArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: y */
    public final void mo144698y(C110301j jVar) {
        int i = 0;
        this.f305966K.mo161775h(jVar, false);
        C108793e<C110301j> u = jVar.mo161726u();
        int i2 = u.f325786f;
        if (i2 > 0) {
            T[] tArr = u.f325784d;
            do {
                mo144698y((C110301j) tArr[i]);
                i++;
            } while (i < i2);
        }
    }

    /* renamed from: z */
    public final boolean mo144699z(MotionEvent motionEvent) {
        return Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY()) || Float.isNaN(motionEvent.getRawX()) || Float.isNaN(motionEvent.getRawY());
    }

    public C103634j getAccessibilityManager() {
        return this.f305959D;
    }

    public C103642k getClipboardManager() {
        return this.f305958C;
    }
}
