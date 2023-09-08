package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.tencent.xweb.IXWebBroadcastListener;
import j20.C117292a;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.a */
public class C16569a {

    /* renamed from: b */
    public static final int[] f44486b = {0, 4, 8};

    /* renamed from: c */
    public static SparseIntArray f44487c;

    /* renamed from: a */
    public HashMap<Integer, C16570a> f44488a = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static class C16570a {

        /* renamed from: A */
        public int f44489A = -1;

        /* renamed from: B */
        public int f44490B = -1;

        /* renamed from: C */
        public int f44491C = -1;

        /* renamed from: D */
        public int f44492D = -1;

        /* renamed from: E */
        public int f44493E = -1;

        /* renamed from: F */
        public int f44494F = -1;

        /* renamed from: G */
        public int f44495G = -1;

        /* renamed from: H */
        public int f44496H = -1;

        /* renamed from: I */
        public int f44497I = -1;

        /* renamed from: J */
        public int f44498J = 0;

        /* renamed from: K */
        public int f44499K = -1;

        /* renamed from: L */
        public int f44500L = -1;

        /* renamed from: M */
        public int f44501M = -1;

        /* renamed from: N */
        public int f44502N = -1;

        /* renamed from: O */
        public int f44503O = -1;

        /* renamed from: P */
        public int f44504P = -1;

        /* renamed from: Q */
        public float f44505Q = 0.0f;

        /* renamed from: R */
        public float f44506R = 0.0f;

        /* renamed from: S */
        public int f44507S = 0;

        /* renamed from: T */
        public int f44508T = 0;

        /* renamed from: U */
        public float f44509U = 1.0f;

        /* renamed from: V */
        public boolean f44510V = false;

        /* renamed from: W */
        public float f44511W = 0.0f;

        /* renamed from: X */
        public float f44512X = 0.0f;

        /* renamed from: Y */
        public float f44513Y = 0.0f;

        /* renamed from: Z */
        public float f44514Z = 0.0f;

        /* renamed from: a */
        public boolean f44515a = false;

        /* renamed from: a0 */
        public float f44516a0 = 1.0f;

        /* renamed from: b */
        public int f44517b;

        /* renamed from: b0 */
        public float f44518b0 = 1.0f;

        /* renamed from: c */
        public int f44519c;

        /* renamed from: c0 */
        public float f44520c0 = Float.NaN;

        /* renamed from: d */
        public int f44521d;

        /* renamed from: d0 */
        public float f44522d0 = Float.NaN;

        /* renamed from: e */
        public int f44523e = -1;

        /* renamed from: e0 */
        public float f44524e0 = 0.0f;

        /* renamed from: f */
        public int f44525f = -1;

        /* renamed from: f0 */
        public float f44526f0 = 0.0f;

        /* renamed from: g */
        public float f44527g = -1.0f;

        /* renamed from: g0 */
        public float f44528g0 = 0.0f;

        /* renamed from: h */
        public int f44529h = -1;

        /* renamed from: h0 */
        public boolean f44530h0 = false;

        /* renamed from: i */
        public int f44531i = -1;

        /* renamed from: i0 */
        public boolean f44532i0 = false;

        /* renamed from: j */
        public int f44533j = -1;

        /* renamed from: j0 */
        public int f44534j0 = 0;

        /* renamed from: k */
        public int f44535k = -1;

        /* renamed from: k0 */
        public int f44536k0 = 0;

        /* renamed from: l */
        public int f44537l = -1;

        /* renamed from: l0 */
        public int f44538l0 = -1;

        /* renamed from: m */
        public int f44539m = -1;

        /* renamed from: m0 */
        public int f44540m0 = -1;

        /* renamed from: n */
        public int f44541n = -1;

        /* renamed from: n0 */
        public int f44542n0 = -1;

        /* renamed from: o */
        public int f44543o = -1;

        /* renamed from: o0 */
        public int f44544o0 = -1;

        /* renamed from: p */
        public int f44545p = -1;

        /* renamed from: p0 */
        public float f44546p0 = 1.0f;

        /* renamed from: q */
        public int f44547q = -1;

        /* renamed from: q0 */
        public float f44548q0 = 1.0f;

        /* renamed from: r */
        public int f44549r = -1;

        /* renamed from: r0 */
        public boolean f44550r0 = false;

        /* renamed from: s */
        public int f44551s = -1;

        /* renamed from: s0 */
        public int f44552s0 = -1;

        /* renamed from: t */
        public int f44553t = -1;

        /* renamed from: t0 */
        public int f44554t0 = -1;

        /* renamed from: u */
        public float f44555u = 0.5f;

        /* renamed from: u0 */
        public int[] f44556u0;

        /* renamed from: v */
        public float f44557v = 0.5f;

        /* renamed from: v0 */
        public String f44558v0;

        /* renamed from: w */
        public String f44559w = null;

        /* renamed from: x */
        public int f44560x = -1;

        /* renamed from: y */
        public int f44561y = 0;

        /* renamed from: z */
        public float f44562z = 0.0f;

        /* renamed from: a */
        public void mo16725a(ConstraintLayout.LayoutParams layoutParams) {
            layoutParams.f44441d = this.f44529h;
            layoutParams.f44443e = this.f44531i;
            layoutParams.f44445f = this.f44533j;
            layoutParams.f44447g = this.f44535k;
            layoutParams.f44449h = this.f44537l;
            layoutParams.f44451i = this.f44539m;
            layoutParams.f44453j = this.f44541n;
            layoutParams.f44455k = this.f44543o;
            layoutParams.f44457l = this.f44545p;
            layoutParams.f44461p = this.f44547q;
            layoutParams.f44462q = this.f44549r;
            layoutParams.f44463r = this.f44551s;
            layoutParams.f44464s = this.f44553t;
            layoutParams.leftMargin = this.f44492D;
            layoutParams.rightMargin = this.f44493E;
            layoutParams.topMargin = this.f44494F;
            layoutParams.bottomMargin = this.f44495G;
            layoutParams.f44469x = this.f44504P;
            layoutParams.f44470y = this.f44503O;
            layoutParams.f44471z = this.f44555u;
            layoutParams.f44409A = this.f44557v;
            layoutParams.f44458m = this.f44560x;
            layoutParams.f44459n = this.f44561y;
            layoutParams.f44460o = this.f44562z;
            layoutParams.f44410B = this.f44559w;
            layoutParams.f44424P = this.f44489A;
            layoutParams.f44425Q = this.f44490B;
            layoutParams.f44413E = this.f44505Q;
            layoutParams.f44412D = this.f44506R;
            layoutParams.f44415G = this.f44508T;
            layoutParams.f44414F = this.f44507S;
            layoutParams.f44427S = this.f44530h0;
            layoutParams.f44428T = this.f44532i0;
            layoutParams.f44416H = this.f44534j0;
            layoutParams.f44417I = this.f44536k0;
            layoutParams.f44420L = this.f44538l0;
            layoutParams.f44421M = this.f44540m0;
            layoutParams.f44418J = this.f44542n0;
            layoutParams.f44419K = this.f44544o0;
            layoutParams.f44422N = this.f44546p0;
            layoutParams.f44423O = this.f44548q0;
            layoutParams.f44426R = this.f44491C;
            layoutParams.f44439c = this.f44527g;
            layoutParams.f44435a = this.f44523e;
            layoutParams.f44437b = this.f44525f;
            layoutParams.width = this.f44517b;
            layoutParams.height = this.f44519c;
            layoutParams.setMarginStart(this.f44497I);
            layoutParams.setMarginEnd(this.f44496H);
            layoutParams.mo16707a();
        }

        /* renamed from: b */
        public final void mo16726b(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f44521d = i;
            this.f44529h = layoutParams.f44441d;
            this.f44531i = layoutParams.f44443e;
            this.f44533j = layoutParams.f44445f;
            this.f44535k = layoutParams.f44447g;
            this.f44537l = layoutParams.f44449h;
            this.f44539m = layoutParams.f44451i;
            this.f44541n = layoutParams.f44453j;
            this.f44543o = layoutParams.f44455k;
            this.f44545p = layoutParams.f44457l;
            this.f44547q = layoutParams.f44461p;
            this.f44549r = layoutParams.f44462q;
            this.f44551s = layoutParams.f44463r;
            this.f44553t = layoutParams.f44464s;
            this.f44555u = layoutParams.f44471z;
            this.f44557v = layoutParams.f44409A;
            this.f44559w = layoutParams.f44410B;
            this.f44560x = layoutParams.f44458m;
            this.f44561y = layoutParams.f44459n;
            this.f44562z = layoutParams.f44460o;
            this.f44489A = layoutParams.f44424P;
            this.f44490B = layoutParams.f44425Q;
            this.f44491C = layoutParams.f44426R;
            this.f44527g = layoutParams.f44439c;
            this.f44523e = layoutParams.f44435a;
            this.f44525f = layoutParams.f44437b;
            this.f44517b = layoutParams.width;
            this.f44519c = layoutParams.height;
            this.f44492D = layoutParams.leftMargin;
            this.f44493E = layoutParams.rightMargin;
            this.f44494F = layoutParams.topMargin;
            this.f44495G = layoutParams.bottomMargin;
            this.f44505Q = layoutParams.f44413E;
            this.f44506R = layoutParams.f44412D;
            this.f44508T = layoutParams.f44415G;
            this.f44507S = layoutParams.f44414F;
            boolean z = layoutParams.f44427S;
            this.f44532i0 = layoutParams.f44428T;
            this.f44534j0 = layoutParams.f44416H;
            this.f44536k0 = layoutParams.f44417I;
            this.f44530h0 = z;
            this.f44538l0 = layoutParams.f44420L;
            this.f44540m0 = layoutParams.f44421M;
            this.f44542n0 = layoutParams.f44418J;
            this.f44544o0 = layoutParams.f44419K;
            this.f44546p0 = layoutParams.f44422N;
            this.f44548q0 = layoutParams.f44423O;
            this.f44496H = layoutParams.getMarginEnd();
            this.f44497I = layoutParams.getMarginStart();
        }

        /* renamed from: c */
        public final void mo16727c(int i, Constraints.LayoutParams layoutParams) {
            mo16726b(i, layoutParams);
            this.f44509U = layoutParams.f44474l0;
            this.f44512X = layoutParams.f44477o0;
            this.f44513Y = layoutParams.f44478p0;
            this.f44514Z = layoutParams.f44479q0;
            this.f44516a0 = layoutParams.f44480r0;
            this.f44518b0 = layoutParams.f44481s0;
            this.f44520c0 = layoutParams.f44482t0;
            this.f44522d0 = layoutParams.f44483u0;
            this.f44524e0 = layoutParams.f44484v0;
            this.f44526f0 = layoutParams.f44485w0;
            this.f44528g0 = 0.0f;
            this.f44511W = layoutParams.f44476n0;
            this.f44510V = layoutParams.f44475m0;
        }

        public Object clone() {
            C16570a aVar = new C16570a();
            aVar.f44515a = this.f44515a;
            aVar.f44517b = this.f44517b;
            aVar.f44519c = this.f44519c;
            aVar.f44523e = this.f44523e;
            aVar.f44525f = this.f44525f;
            aVar.f44527g = this.f44527g;
            aVar.f44529h = this.f44529h;
            aVar.f44531i = this.f44531i;
            aVar.f44533j = this.f44533j;
            aVar.f44535k = this.f44535k;
            aVar.f44537l = this.f44537l;
            aVar.f44539m = this.f44539m;
            aVar.f44541n = this.f44541n;
            aVar.f44543o = this.f44543o;
            aVar.f44545p = this.f44545p;
            aVar.f44547q = this.f44547q;
            aVar.f44549r = this.f44549r;
            aVar.f44551s = this.f44551s;
            aVar.f44553t = this.f44553t;
            aVar.f44555u = this.f44555u;
            aVar.f44557v = this.f44557v;
            aVar.f44559w = this.f44559w;
            aVar.f44489A = this.f44489A;
            aVar.f44490B = this.f44490B;
            aVar.f44555u = this.f44555u;
            aVar.f44555u = this.f44555u;
            aVar.f44555u = this.f44555u;
            aVar.f44555u = this.f44555u;
            aVar.f44555u = this.f44555u;
            aVar.f44491C = this.f44491C;
            aVar.f44492D = this.f44492D;
            aVar.f44493E = this.f44493E;
            aVar.f44494F = this.f44494F;
            aVar.f44495G = this.f44495G;
            aVar.f44496H = this.f44496H;
            aVar.f44497I = this.f44497I;
            aVar.f44498J = this.f44498J;
            aVar.f44499K = this.f44499K;
            aVar.f44500L = this.f44500L;
            aVar.f44501M = this.f44501M;
            aVar.f44502N = this.f44502N;
            aVar.f44503O = this.f44503O;
            aVar.f44504P = this.f44504P;
            aVar.f44505Q = this.f44505Q;
            aVar.f44506R = this.f44506R;
            aVar.f44507S = this.f44507S;
            aVar.f44508T = this.f44508T;
            aVar.f44509U = this.f44509U;
            aVar.f44510V = this.f44510V;
            aVar.f44511W = this.f44511W;
            aVar.f44512X = this.f44512X;
            aVar.f44513Y = this.f44513Y;
            aVar.f44514Z = this.f44514Z;
            aVar.f44516a0 = this.f44516a0;
            aVar.f44518b0 = this.f44518b0;
            aVar.f44520c0 = this.f44520c0;
            aVar.f44522d0 = this.f44522d0;
            aVar.f44524e0 = this.f44524e0;
            aVar.f44526f0 = this.f44526f0;
            aVar.f44528g0 = this.f44528g0;
            aVar.f44530h0 = this.f44530h0;
            aVar.f44532i0 = this.f44532i0;
            aVar.f44534j0 = this.f44534j0;
            aVar.f44536k0 = this.f44536k0;
            aVar.f44538l0 = this.f44538l0;
            aVar.f44540m0 = this.f44540m0;
            aVar.f44542n0 = this.f44542n0;
            aVar.f44544o0 = this.f44544o0;
            aVar.f44546p0 = this.f44546p0;
            aVar.f44548q0 = this.f44548q0;
            aVar.f44552s0 = this.f44552s0;
            aVar.f44554t0 = this.f44554t0;
            int[] iArr = this.f44556u0;
            if (iArr != null) {
                aVar.f44556u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.f44560x = this.f44560x;
            aVar.f44561y = this.f44561y;
            aVar.f44562z = this.f44562z;
            aVar.f44550r0 = this.f44550r0;
            return aVar;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f44487c = sparseIntArray;
        sparseIntArray.append(R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f44487c.append(R$styleable.ConstraintSet_layout_editor_absoluteX, 6);
        f44487c.append(R$styleable.ConstraintSet_layout_editor_absoluteY, 7);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintGuide_end, 18);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        f44487c.append(R$styleable.ConstraintSet_android_orientation, 27);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginLeft, 13);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginTop, 16);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginRight, 14);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginBottom, 11);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginStart, 15);
        f44487c.append(R$styleable.ConstraintSet_layout_goneMarginEnd, 12);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintLeft_creator, 75);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintTop_creator, 75);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintRight_creator, 75);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintBottom_creator, 75);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintBaseline_creator, 75);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginLeft, 24);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginRight, 28);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginStart, 31);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginEnd, 8);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginTop, 34);
        f44487c.append(R$styleable.ConstraintSet_android_layout_marginBottom, 2);
        f44487c.append(R$styleable.ConstraintSet_android_layout_width, 23);
        f44487c.append(R$styleable.ConstraintSet_android_layout_height, 21);
        f44487c.append(R$styleable.ConstraintSet_android_visibility, 22);
        f44487c.append(R$styleable.ConstraintSet_android_alpha, 43);
        f44487c.append(R$styleable.ConstraintSet_android_elevation, 44);
        f44487c.append(R$styleable.ConstraintSet_android_rotationX, 45);
        f44487c.append(R$styleable.ConstraintSet_android_rotationY, 46);
        f44487c.append(R$styleable.ConstraintSet_android_rotation, 60);
        f44487c.append(R$styleable.ConstraintSet_android_scaleX, 47);
        f44487c.append(R$styleable.ConstraintSet_android_scaleY, 48);
        f44487c.append(R$styleable.ConstraintSet_android_transformPivotX, 49);
        f44487c.append(R$styleable.ConstraintSet_android_transformPivotY, 50);
        f44487c.append(R$styleable.ConstraintSet_android_translationX, 51);
        f44487c.append(R$styleable.ConstraintSet_android_translationY, 52);
        f44487c.append(R$styleable.ConstraintSet_android_translationZ, 53);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintWidth_default, 54);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHeight_default, 55);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintWidth_max, 56);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHeight_max, 57);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintWidth_min, 58);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHeight_min, 59);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintCircle, 61);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintCircleAngle, 63);
        f44487c.append(R$styleable.ConstraintSet_android_id, 38);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintWidth_percent, 69);
        f44487c.append(R$styleable.ConstraintSet_layout_constraintHeight_percent, 70);
        f44487c.append(R$styleable.ConstraintSet_chainUseRtl, 71);
        f44487c.append(R$styleable.ConstraintSet_barrierDirection, 72);
        f44487c.append(R$styleable.ConstraintSet_constraint_referenced_ids, 73);
        f44487c.append(R$styleable.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: j */
    public static int m15631j(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public void mo16714a(ConstraintLayout constraintLayout) {
        int i;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f44488a.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout2.getChildAt(i2);
            int id = childAt.getId();
            if (id != -1) {
                if (this.f44488a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C16570a aVar = this.f44488a.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f44554t0 = 1;
                    }
                    int i3 = aVar.f44554t0;
                    if (i3 != -1 && i3 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f44552s0);
                        barrier.setAllowsGoneWidget(aVar.f44550r0);
                        int[] iArr = aVar.f44556u0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = aVar.f44558v0;
                            if (str != null) {
                                int[] f = mo16719f(barrier, str);
                                aVar.f44556u0 = f;
                                barrier.setReferencedIds(f);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    aVar.mo16725a(layoutParams);
                    childAt.setLayoutParams(layoutParams);
                    int i4 = aVar.f44498J;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(Integer.valueOf(i4));
                    View view = childAt;
                    C117292a.m165358d(childAt, aVar2.mo10232b(), "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C16570a aVar3 = aVar;
                    float f2 = aVar3.f44509U;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(Float.valueOf(f2));
                    View view2 = view;
                    i = childCount;
                    C117292a.m165358d(view2, aVar4.mo10232b(), "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "androidx/constraintlayout/widget/ConstraintSet", "applyToInternal", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setRotation(aVar3.f44512X);
                    view.setRotationX(aVar3.f44513Y);
                    view.setRotationY(aVar3.f44514Z);
                    view.setScaleX(aVar3.f44516a0);
                    view.setScaleY(aVar3.f44518b0);
                    if (!Float.isNaN(aVar3.f44520c0)) {
                        view.setPivotX(aVar3.f44520c0);
                    }
                    if (!Float.isNaN(aVar3.f44522d0)) {
                        view.setPivotY(aVar3.f44522d0);
                    }
                    view.setTranslationX(aVar3.f44524e0);
                    view.setTranslationY(aVar3.f44526f0);
                    view.setTranslationZ(aVar3.f44528g0);
                    if (aVar3.f44510V) {
                        view.setElevation(aVar3.f44511W);
                    }
                } else {
                    i = childCount;
                }
                i2++;
                childCount = i;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C16570a aVar5 = this.f44488a.get(num);
            int i5 = aVar5.f44554t0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = aVar5.f44556u0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = aVar5.f44558v0;
                    if (str2 != null) {
                        int[] f3 = mo16719f(barrier2, str2);
                        aVar5.f44556u0 = f3;
                        barrier2.setReferencedIds(f3);
                    }
                }
                barrier2.setType(aVar5.f44552s0);
                ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                barrier2.mo16673e();
                aVar5.mo16725a(layoutParams2);
                constraintLayout2.addView(barrier2, layoutParams2);
            }
            if (aVar5.f44515a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
                aVar5.mo16725a(layoutParams3);
                constraintLayout2.addView(guideline, layoutParams3);
            }
        }
    }

    /* renamed from: b */
    public void mo16715b(int i, int i2) {
        if (this.f44488a.containsKey(Integer.valueOf(i))) {
            C16570a aVar = this.f44488a.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    aVar.f44531i = -1;
                    aVar.f44529h = -1;
                    aVar.f44492D = -1;
                    aVar.f44499K = -1;
                    return;
                case 2:
                    aVar.f44535k = -1;
                    aVar.f44533j = -1;
                    aVar.f44493E = -1;
                    aVar.f44501M = -1;
                    return;
                case 3:
                    aVar.f44539m = -1;
                    aVar.f44537l = -1;
                    aVar.f44494F = -1;
                    aVar.f44500L = -1;
                    return;
                case 4:
                    aVar.f44541n = -1;
                    aVar.f44543o = -1;
                    aVar.f44495G = -1;
                    aVar.f44502N = -1;
                    return;
                case 5:
                    aVar.f44545p = -1;
                    return;
                case 6:
                    aVar.f44547q = -1;
                    aVar.f44549r = -1;
                    aVar.f44497I = -1;
                    aVar.f44504P = -1;
                    return;
                case 7:
                    aVar.f44551s = -1;
                    aVar.f44553t = -1;
                    aVar.f44496H = -1;
                    aVar.f44503O = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: c */
    public void mo16716c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f44488a.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!this.f44488a.containsKey(Integer.valueOf(id))) {
                    this.f44488a.put(Integer.valueOf(id), new C16570a());
                }
                C16570a aVar = this.f44488a.get(Integer.valueOf(id));
                aVar.mo16726b(id, layoutParams);
                aVar.f44498J = childAt.getVisibility();
                aVar.f44509U = childAt.getAlpha();
                aVar.f44512X = childAt.getRotation();
                aVar.f44513Y = childAt.getRotationX();
                aVar.f44514Z = childAt.getRotationY();
                aVar.f44516a0 = childAt.getScaleX();
                aVar.f44518b0 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    aVar.f44520c0 = pivotX;
                    aVar.f44522d0 = pivotY;
                }
                aVar.f44524e0 = childAt.getTranslationX();
                aVar.f44526f0 = childAt.getTranslationY();
                aVar.f44528g0 = childAt.getTranslationZ();
                if (aVar.f44510V) {
                    aVar.f44511W = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f44550r0 = barrier.f44388n.f61512m0;
                    aVar.f44556u0 = barrier.getReferencedIds();
                    aVar.f44552s0 = barrier.getType();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo16717d(int i, int i2, int i3, int i4) {
        if (!this.f44488a.containsKey(Integer.valueOf(i))) {
            this.f44488a.put(Integer.valueOf(i), new C16570a());
        }
        C16570a aVar = this.f44488a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f44529h = i3;
                    aVar.f44531i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f44531i = i3;
                    aVar.f44529h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + mo16724l(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    aVar.f44533j = i3;
                    aVar.f44535k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.f44535k = i3;
                    aVar.f44533j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    aVar.f44537l = i3;
                    aVar.f44539m = -1;
                    aVar.f44545p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.f44539m = i3;
                    aVar.f44537l = -1;
                    aVar.f44545p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    aVar.f44543o = i3;
                    aVar.f44541n = -1;
                    aVar.f44545p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.f44541n = i3;
                    aVar.f44543o = -1;
                    aVar.f44545p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    aVar.f44545p = i3;
                    aVar.f44543o = -1;
                    aVar.f44541n = -1;
                    aVar.f44537l = -1;
                    aVar.f44539m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f44549r = i3;
                    aVar.f44547q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.f44547q = i3;
                    aVar.f44549r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    aVar.f44553t = i3;
                    aVar.f44551s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.f44551s = i3;
                    aVar.f44553t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(mo16724l(i2) + " to " + mo16724l(i4) + " unknown");
        }
    }

    /* renamed from: e */
    public void mo16718e(int i, int i2, int i3, int i4, int i5) {
        if (!this.f44488a.containsKey(Integer.valueOf(i))) {
            this.f44488a.put(Integer.valueOf(i), new C16570a());
        }
        C16570a aVar = this.f44488a.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    aVar.f44529h = i3;
                    aVar.f44531i = -1;
                } else if (i4 == 2) {
                    aVar.f44531i = i3;
                    aVar.f44529h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + mo16724l(i4) + " undefined");
                }
                aVar.f44492D = i5;
                return;
            case 2:
                if (i4 == 1) {
                    aVar.f44533j = i3;
                    aVar.f44535k = -1;
                } else if (i4 == 2) {
                    aVar.f44535k = i3;
                    aVar.f44533j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
                aVar.f44493E = i5;
                return;
            case 3:
                if (i4 == 3) {
                    aVar.f44537l = i3;
                    aVar.f44539m = -1;
                    aVar.f44545p = -1;
                } else if (i4 == 4) {
                    aVar.f44539m = i3;
                    aVar.f44537l = -1;
                    aVar.f44545p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
                aVar.f44494F = i5;
                return;
            case 4:
                if (i4 == 4) {
                    aVar.f44543o = i3;
                    aVar.f44541n = -1;
                    aVar.f44545p = -1;
                } else if (i4 == 3) {
                    aVar.f44541n = i3;
                    aVar.f44543o = -1;
                    aVar.f44545p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
                aVar.f44495G = i5;
                return;
            case 5:
                if (i4 == 5) {
                    aVar.f44545p = i3;
                    aVar.f44543o = -1;
                    aVar.f44541n = -1;
                    aVar.f44537l = -1;
                    aVar.f44539m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    aVar.f44549r = i3;
                    aVar.f44547q = -1;
                } else if (i4 == 7) {
                    aVar.f44547q = i3;
                    aVar.f44549r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
                aVar.f44497I = i5;
                return;
            case 7:
                if (i4 == 7) {
                    aVar.f44553t = i3;
                    aVar.f44551s = -1;
                } else if (i4 == 6) {
                    aVar.f44551s = i3;
                    aVar.f44553t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo16724l(i4) + " undefined");
                }
                aVar.f44496H = i5;
                return;
            default:
                throw new IllegalArgumentException(mo16724l(i2) + " to " + mo16724l(i4) + " unknown");
        }
    }

    /* renamed from: f */
    public final int[] mo16719f(View view, String str) {
        int i;
        HashMap<String, Integer> hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Integer num = null;
            try {
                i = R$id.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f44406s) != null && hashMap.containsKey(trim)) {
                    num = constraintLayout.f44406s.get(trim);
                }
                if (num != null && (num instanceof Integer)) {
                    i = num.intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: g */
    public final C16570a mo16720g(Context context, AttributeSet attributeSet) {
        C16570a aVar = new C16570a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = f44487c.get(index);
            switch (i2) {
                case 1:
                    aVar.f44545p = m15631j(obtainStyledAttributes, index, aVar.f44545p);
                    break;
                case 2:
                    aVar.f44495G = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44495G);
                    break;
                case 3:
                    aVar.f44543o = m15631j(obtainStyledAttributes, index, aVar.f44543o);
                    break;
                case 4:
                    aVar.f44541n = m15631j(obtainStyledAttributes, index, aVar.f44541n);
                    break;
                case 5:
                    aVar.f44559w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.f44489A = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f44489A);
                    break;
                case 7:
                    aVar.f44490B = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f44490B);
                    break;
                case 8:
                    aVar.f44496H = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44496H);
                    break;
                case 9:
                    aVar.f44553t = m15631j(obtainStyledAttributes, index, aVar.f44553t);
                    break;
                case 10:
                    aVar.f44551s = m15631j(obtainStyledAttributes, index, aVar.f44551s);
                    break;
                case 11:
                    aVar.f44502N = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44502N);
                    break;
                case 12:
                    aVar.f44503O = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44503O);
                    break;
                case 13:
                    aVar.f44499K = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44499K);
                    break;
                case 14:
                    aVar.f44501M = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44501M);
                    break;
                case 15:
                    aVar.f44504P = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44504P);
                    break;
                case 16:
                    aVar.f44500L = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44500L);
                    break;
                case 17:
                    aVar.f44523e = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f44523e);
                    break;
                case 18:
                    aVar.f44525f = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f44525f);
                    break;
                case 19:
                    aVar.f44527g = obtainStyledAttributes.getFloat(index, aVar.f44527g);
                    break;
                case 20:
                    aVar.f44555u = obtainStyledAttributes.getFloat(index, aVar.f44555u);
                    break;
                case 21:
                    aVar.f44519c = obtainStyledAttributes.getLayoutDimension(index, aVar.f44519c);
                    break;
                case 22:
                    aVar.f44498J = f44486b[obtainStyledAttributes.getInt(index, aVar.f44498J)];
                    break;
                case 23:
                    aVar.f44517b = obtainStyledAttributes.getLayoutDimension(index, aVar.f44517b);
                    break;
                case 24:
                    aVar.f44492D = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44492D);
                    break;
                case 25:
                    aVar.f44529h = m15631j(obtainStyledAttributes, index, aVar.f44529h);
                    break;
                case 26:
                    aVar.f44531i = m15631j(obtainStyledAttributes, index, aVar.f44531i);
                    break;
                case 27:
                    aVar.f44491C = obtainStyledAttributes.getInt(index, aVar.f44491C);
                    break;
                case 28:
                    aVar.f44493E = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44493E);
                    break;
                case 29:
                    aVar.f44533j = m15631j(obtainStyledAttributes, index, aVar.f44533j);
                    break;
                case 30:
                    aVar.f44535k = m15631j(obtainStyledAttributes, index, aVar.f44535k);
                    break;
                case 31:
                    aVar.f44497I = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44497I);
                    break;
                case 32:
                    aVar.f44547q = m15631j(obtainStyledAttributes, index, aVar.f44547q);
                    break;
                case 33:
                    aVar.f44549r = m15631j(obtainStyledAttributes, index, aVar.f44549r);
                    break;
                case 34:
                    aVar.f44494F = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44494F);
                    break;
                case 35:
                    aVar.f44539m = m15631j(obtainStyledAttributes, index, aVar.f44539m);
                    break;
                case 36:
                    aVar.f44537l = m15631j(obtainStyledAttributes, index, aVar.f44537l);
                    break;
                case 37:
                    aVar.f44557v = obtainStyledAttributes.getFloat(index, aVar.f44557v);
                    break;
                case 38:
                    aVar.f44521d = obtainStyledAttributes.getResourceId(index, aVar.f44521d);
                    break;
                case 39:
                    aVar.f44506R = obtainStyledAttributes.getFloat(index, aVar.f44506R);
                    break;
                case 40:
                    aVar.f44505Q = obtainStyledAttributes.getFloat(index, aVar.f44505Q);
                    break;
                case 41:
                    aVar.f44507S = obtainStyledAttributes.getInt(index, aVar.f44507S);
                    break;
                case 42:
                    aVar.f44508T = obtainStyledAttributes.getInt(index, aVar.f44508T);
                    break;
                case 43:
                    aVar.f44509U = obtainStyledAttributes.getFloat(index, aVar.f44509U);
                    break;
                case 44:
                    aVar.f44510V = true;
                    aVar.f44511W = obtainStyledAttributes.getDimension(index, aVar.f44511W);
                    break;
                case 45:
                    aVar.f44513Y = obtainStyledAttributes.getFloat(index, aVar.f44513Y);
                    break;
                case 46:
                    aVar.f44514Z = obtainStyledAttributes.getFloat(index, aVar.f44514Z);
                    break;
                case 47:
                    aVar.f44516a0 = obtainStyledAttributes.getFloat(index, aVar.f44516a0);
                    break;
                case 48:
                    aVar.f44518b0 = obtainStyledAttributes.getFloat(index, aVar.f44518b0);
                    break;
                case 49:
                    aVar.f44520c0 = obtainStyledAttributes.getFloat(index, aVar.f44520c0);
                    break;
                case 50:
                    aVar.f44522d0 = obtainStyledAttributes.getFloat(index, aVar.f44522d0);
                    break;
                case 51:
                    aVar.f44524e0 = obtainStyledAttributes.getDimension(index, aVar.f44524e0);
                    break;
                case 52:
                    aVar.f44526f0 = obtainStyledAttributes.getDimension(index, aVar.f44526f0);
                    break;
                case 53:
                    aVar.f44528g0 = obtainStyledAttributes.getDimension(index, aVar.f44528g0);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            aVar.f44512X = obtainStyledAttributes.getFloat(index, aVar.f44512X);
                            break;
                        case 61:
                            aVar.f44560x = m15631j(obtainStyledAttributes, index, aVar.f44560x);
                            break;
                        case 62:
                            aVar.f44561y = obtainStyledAttributes.getDimensionPixelSize(index, aVar.f44561y);
                            break;
                        case 63:
                            aVar.f44562z = obtainStyledAttributes.getFloat(index, aVar.f44562z);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    aVar.f44546p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    aVar.f44548q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    aVar.f44552s0 = obtainStyledAttributes.getInt(index, aVar.f44552s0);
                                    break;
                                case 73:
                                    aVar.f44558v0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 74:
                                    aVar.f44550r0 = obtainStyledAttributes.getBoolean(index, aVar.f44550r0);
                                    break;
                                case 75:
                                    Integer.toHexString(index);
                                    f44487c.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    f44487c.get(index);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: h */
    public final C16570a mo16721h(int i) {
        if (!this.f44488a.containsKey(Integer.valueOf(i))) {
            this.f44488a.put(Integer.valueOf(i), new C16570a());
        }
        return this.f44488a.get(Integer.valueOf(i));
    }

    /* renamed from: i */
    public void mo16722i(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C16570a g = mo16720g(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        g.f44515a = true;
                    }
                    this.f44488a.put(Integer.valueOf(g.f44521d), g);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* renamed from: k */
    public void mo16723k(int i, int i2) {
        mo16721h(i).f44507S = i2;
    }

    /* renamed from: l */
    public final String mo16724l(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return IXWebBroadcastListener.STAGE_START;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }
}
