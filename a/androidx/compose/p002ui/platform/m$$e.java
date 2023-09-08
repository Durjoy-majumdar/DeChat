package androidx.compose.p002ui.platform;

import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import p1166z0.C112539e;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p246u1.C111063a;
import p246u1.C111074j;
import p246u1.C111075k;
import p246u1.C111076l;
import p246u1.C111087s;
import p246u1.C111092v;
import p246u1.C111096z;
import p631o1.C109861p;
import p735w1.C111703v;

/* renamed from: androidx.compose.ui.platform.m$$e */
public final class m$$e extends AccessibilityNodeProvider {

    /* renamed from: a */
    public final /* synthetic */ C103662m f306180a;

    public m$$e(C103662m mVar) {
        this.f306180a = mVar;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        C111087s sVar;
        String str2;
        int i2;
        C112541g gVar;
        RectF rectF;
        String str3 = str;
        Bundle bundle2 = bundle;
        C87412m.m108594g(accessibilityNodeInfo, "info");
        C87412m.m108594g(str3, "extraDataKey");
        C103662m mVar = this.f306180a;
        C103703v1 v1Var = mVar.mo144781g().get(Integer.valueOf(i));
        if (v1Var != null && (sVar = v1Var.f306289a) != null) {
            String h = mVar.mo144783h(sVar);
            C111075k kVar = sVar.f332640e;
            C111096z zVar = C111074j.f332608a;
            if (!kVar.mo162823i(zVar) || bundle2 == null || !C87412m.m108589b(str3, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                C111075k kVar2 = sVar.f332640e;
                C111096z zVar2 = C111092v.f332662q;
                if (kVar2.mo162823i(zVar2) && bundle2 != null && C87412m.m108589b(str3, "androidx.compose.ui.semantics.testTag") && (str2 = (String) C111076l.m151465a(sVar.f332640e, zVar2)) != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str3, str2);
                    return;
                }
                return;
            }
            int i3 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i4 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (h != null ? h.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    C32226l lVar = (C32226l) ((C111063a) sVar.f332640e.mo162825k(zVar)).f332591b;
                    Object obj = null;
                    if (C87412m.m108589b(lVar != null ? (Boolean) lVar.invoke(arrayList) : null, Boolean.TRUE)) {
                        C111703v vVar = (C111703v) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        int i5 = 0;
                        while (i5 < i4) {
                            int i6 = i3 + i5;
                            if (i6 >= vVar.f334371a.f334361a.length()) {
                                arrayList2.add(obj);
                                i2 = i4;
                            } else {
                                C112541g d = vVar.mo163364b(i6).mo164263d(!sVar.f332642g.mo161701A() ? C112539e.f336955b : C109861p.m149328d(sVar.mo162834c()));
                                C112541g d2 = sVar.mo162835d();
                                if (d.mo164261b(d2)) {
                                    i2 = i4;
                                    gVar = new C112541g(Math.max(d.f336961a, d2.f336961a), Math.max(d.f336962b, d2.f336962b), Math.min(d.f336963c, d2.f336963c), Math.min(d.f336964d, d2.f336964d));
                                } else {
                                    i2 = i4;
                                    gVar = null;
                                }
                                if (gVar != null) {
                                    long i7 = mVar.f306159e.mo144667i(C112540f.m153745a(gVar.f336961a, gVar.f336962b));
                                    long i8 = mVar.f306159e.mo144667i(C112540f.m153745a(gVar.f336963c, gVar.f336964d));
                                    rectF = new RectF(C112539e.m153738c(i7), C112539e.m153739d(i7), C112539e.m153738c(i8), C112539e.m153739d(i8));
                                } else {
                                    rectF = null;
                                }
                                arrayList2.add(rectF);
                            }
                            i5++;
                            i4 = i2;
                            obj = null;
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        if (array != null) {
                            extras.putParcelableArray(str3, (Parcelable[]) array);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r4 = (r4 = r4.f306028a).getLifecycle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            r16 = this;
            r0 = r17
            i2.o r1 = p560i2.C33183o.Rtl
            r2 = r16
            androidx.compose.ui.platform.m r3 = r2.f306180a
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            androidx.compose.ui.platform.AndroidComposeView$$e r4 = r4.getViewTreeOwners()
            if (r4 == 0) goto L_0x001f
            androidx.lifecycle.s r4 = r4.f306028a
            if (r4 == 0) goto L_0x001f
            androidx.lifecycle.j r4 = r4.getLifecycle()
            if (r4 == 0) goto L_0x001f
            androidx.lifecycle.j$c r4 = r4.getCurrentState()
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            androidx.lifecycle.j$c r6 = androidx.lifecycle.C39623j.C39626c.DESTROYED
            if (r4 != r6) goto L_0x0025
            goto L_0x0041
        L_0x0025:
            android.view.accessibility.AccessibilityNodeInfo r4 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            f3.d r6 = new f3.d
            r6.<init>(r4)
            java.util.Map r7 = r3.mo144781g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r17)
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.ui.platform.v1 r7 = (androidx.compose.p002ui.platform.C103703v1) r7
            if (r7 != 0) goto L_0x0044
            r4.recycle()
        L_0x0041:
            r5 = 0
            goto L_0x0a34
        L_0x0044:
            u1.s r8 = r7.f306289a
            r9 = -1
            if (r0 != r9) goto L_0x005f
            androidx.compose.ui.platform.AndroidComposeView r10 = r3.f306159e
            java.util.WeakHashMap<android.view.View, e3.a0> r11 = p849e3.C107207u.f320808a
            android.view.ViewParent r10 = p849e3.C107207u.C107208b.m145178f(r10)
            boolean r11 = r10 instanceof android.view.View
            if (r11 == 0) goto L_0x0058
            android.view.View r10 = (android.view.View) r10
            goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            r6.f321474b = r9
            r4.setParent(r10)
            goto L_0x0085
        L_0x005f:
            u1.s r10 = r8.mo162838g()
            if (r10 == 0) goto L_0x0a35
            u1.s r10 = r8.mo162838g()
            gy3.C87412m.m108591d(r10)
            int r10 = r10.f332641f
            androidx.compose.ui.platform.AndroidComposeView r11 = r3.f306159e
            u1.u r11 = r11.getSemanticsOwner()
            u1.s r11 = r11.mo162843a()
            int r11 = r11.f332641f
            if (r10 != r11) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r9 = r10
        L_0x007e:
            androidx.compose.ui.platform.AndroidComposeView r10 = r3.f306159e
            r6.f321474b = r9
            r4.setParent(r10, r9)
        L_0x0085:
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            r6.f321475c = r0
            r4.setSource(r9, r0)
            android.graphics.Rect r7 = r7.f306290b
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            int r10 = r7.left
            float r10 = (float) r10
            int r11 = r7.top
            float r11 = (float) r11
            long r10 = p1166z0.C112540f.m153745a(r10, r11)
            long r9 = r9.mo144667i(r10)
            androidx.compose.ui.platform.AndroidComposeView r11 = r3.f306159e
            int r12 = r7.right
            float r12 = (float) r12
            int r7 = r7.bottom
            float r7 = (float) r7
            long r12 = p1166z0.C112540f.m153745a(r12, r7)
            long r11 = r11.mo144667i(r12)
            android.graphics.Rect r7 = new android.graphics.Rect
            float r13 = p1166z0.C112539e.m153738c(r9)
            double r13 = (double) r13
            double r13 = java.lang.Math.floor(r13)
            float r13 = (float) r13
            int r13 = (int) r13
            float r9 = p1166z0.C112539e.m153739d(r9)
            double r9 = (double) r9
            double r9 = java.lang.Math.floor(r9)
            float r9 = (float) r9
            int r9 = (int) r9
            float r10 = p1166z0.C112539e.m153738c(r11)
            double r14 = (double) r10
            double r14 = java.lang.Math.ceil(r14)
            float r10 = (float) r14
            int r10 = (int) r10
            float r11 = p1166z0.C112539e.m153739d(r11)
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            float r11 = (float) r11
            int r11 = (int) r11
            r7.<init>(r13, r9, r10, r11)
            r6.mo157850j(r7)
            java.lang.String r7 = "semanticsNode"
            gy3.C87412m.m108594g(r8, r7)
            java.lang.String r7 = "android.view.View"
            r6.mo157852l(r7)
            u1.k r7 = r8.f332640e
            u1.z<u1.h> r9 = p246u1.C111092v.f332661p
            java.lang.Object r7 = p246u1.C111076l.m151465a(r7, r9)
            u1.h r7 = (p246u1.C111072h) r7
            r9 = 4
            r10 = 2
            r11 = 0
            r12 = 1
            if (r7 == 0) goto L_0x0185
            int r13 = r7.f332604a
            boolean r14 = r8.f332638c
            if (r14 != 0) goto L_0x010c
            java.util.List r14 = r8.mo162839h()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0183
        L_0x010c:
            int r14 = r7.f332604a
            if (r14 != r9) goto L_0x0112
            r15 = 1
            goto L_0x0113
        L_0x0112:
            r15 = 0
        L_0x0113:
            if (r15 == 0) goto L_0x0130
            androidx.compose.ui.platform.AndroidComposeView r13 = r3.f306159e
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131837605(0x7f1142a5, float:1.930841E38)
            java.lang.String r13 = r13.getString(r14)
            android.os.Bundle r14 = r4.getExtras()
            java.lang.String r15 = "AccessibilityNodeInfo.roleDescription"
            r14.putCharSequence(r15, r13)
            goto L_0x0183
        L_0x0130:
            if (r13 != 0) goto L_0x0134
            r15 = 1
            goto L_0x0135
        L_0x0134:
            r15 = 0
        L_0x0135:
            r5 = 5
            if (r15 == 0) goto L_0x013b
            java.lang.String r13 = "android.widget.Button"
            goto L_0x0165
        L_0x013b:
            if (r13 != r12) goto L_0x013f
            r15 = 1
            goto L_0x0140
        L_0x013f:
            r15 = 0
        L_0x0140:
            if (r15 == 0) goto L_0x0145
            java.lang.String r13 = "android.widget.CheckBox"
            goto L_0x0165
        L_0x0145:
            if (r13 != r10) goto L_0x0149
            r15 = 1
            goto L_0x014a
        L_0x0149:
            r15 = 0
        L_0x014a:
            if (r15 == 0) goto L_0x014f
            java.lang.String r13 = "android.widget.Switch"
            goto L_0x0165
        L_0x014f:
            r15 = 3
            if (r13 != r15) goto L_0x0154
            r15 = 1
            goto L_0x0155
        L_0x0154:
            r15 = 0
        L_0x0155:
            if (r15 == 0) goto L_0x015a
            java.lang.String r13 = "android.widget.RadioButton"
            goto L_0x0165
        L_0x015a:
            if (r13 != r5) goto L_0x015e
            r13 = 1
            goto L_0x015f
        L_0x015e:
            r13 = 0
        L_0x015f:
            if (r13 == 0) goto L_0x0164
            java.lang.String r13 = "android.widget.ImageView"
            goto L_0x0165
        L_0x0164:
            r13 = 0
        L_0x0165:
            if (r14 != r5) goto L_0x0169
            r5 = 1
            goto L_0x016a
        L_0x0169:
            r5 = 0
        L_0x016a:
            if (r5 != 0) goto L_0x0170
            r6.mo157852l(r13)
            goto L_0x0183
        L_0x0170:
            q1.j r5 = r8.f332642g
            androidx.compose.ui.platform.n r14 = androidx.compose.p002ui.platform.C103666n.f306217d
            q1.j r5 = androidx.compose.p002ui.platform.C103678q.m137969d(r5, r14)
            if (r5 == 0) goto L_0x0180
            u1.k r5 = r8.f332640e
            boolean r5 = r5.f332625e
            if (r5 == 0) goto L_0x0183
        L_0x0180:
            r6.mo157852l(r13)
        L_0x0183:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0185:
            boolean r5 = androidx.compose.p002ui.platform.C103678q.m137971f(r8)
            if (r5 == 0) goto L_0x0190
            java.lang.String r5 = "android.widget.EditText"
            r6.mo157852l(r5)
        L_0x0190:
            u1.k r5 = r8.mo162837f()
            u1.z<java.util.List<w1.a>> r13 = p246u1.C111092v.f332663r
            boolean r5 = r5.mo162823i(r13)
            if (r5 == 0) goto L_0x01a1
            java.lang.String r5 = "android.widget.TextView"
            r6.mo157852l(r5)
        L_0x01a1:
            androidx.compose.ui.platform.AndroidComposeView r5 = r3.f306159e
            android.content.Context r5 = r5.getContext()
            java.lang.String r5 = r5.getPackageName()
            r4.setPackageName(r5)
            java.util.List r4 = r8.mo162836e(r12, r11, r12)
            int r5 = r4.size()
            r13 = 0
        L_0x01b7:
            if (r13 >= r5) goto L_0x01f6
            java.lang.Object r14 = r4.get(r13)
            u1.s r14 = (p246u1.C111087s) r14
            java.util.Map r15 = r3.mo144781g()
            int r9 = r14.f332641f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r15.containsKey(r9)
            if (r9 == 0) goto L_0x01f2
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            androidx.compose.ui.platform.i0 r9 = r9.getAndroidViewsHandler$ui_release()
            java.util.HashMap r9 = r9.getLayoutNodeToHolder()
            q1.j r15 = r14.f332642g
            java.lang.Object r9 = r9.get(r15)
            k2.a r9 = (p583k2.C108830a) r9
            if (r9 == 0) goto L_0x01e9
            android.view.accessibility.AccessibilityNodeInfo r14 = r6.f321473a
            r14.addChild(r9)
            goto L_0x01f2
        L_0x01e9:
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            int r14 = r14.f332641f
            android.view.accessibility.AccessibilityNodeInfo r15 = r6.f321473a
            r15.addChild(r9, r14)
        L_0x01f2:
            int r13 = r13 + 1
            r9 = 4
            goto L_0x01b7
        L_0x01f6:
            int r4 = r3.f306164j
            if (r4 != r0) goto L_0x0203
            r6.mo157846g(r12)
            f3.d$a r4 = p1108f3.C107453d.C107454a.f321480g
            r6.mo157840b(r4)
            goto L_0x020b
        L_0x0203:
            r6.mo157846g(r11)
            f3.d$a r4 = p1108f3.C107453d.C107454a.f321479f
            r6.mo157840b(r4)
        L_0x020b:
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            b2.i$a r4 = r4.getFontFamilyResolver()
            u1.k r5 = r8.f332640e
            w1.a r5 = r3.mo144784i(r5)
            if (r5 == 0) goto L_0x0224
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            i2.d r9 = r9.getDensity()
            android.text.SpannableString r5 = p146e2.C107157a.m145000a(r5, r9, r4)
            goto L_0x0225
        L_0x0224:
            r5 = 0
        L_0x0225:
            r9 = 100000(0x186a0, float:1.4013E-40)
            java.lang.CharSequence r5 = r3.mo144796y(r5, r9)
            android.text.SpannableString r5 = (android.text.SpannableString) r5
            u1.k r13 = r8.f332640e
            u1.z<java.util.List<w1.a>> r14 = p246u1.C111092v.f332663r
            java.lang.Object r13 = p246u1.C111076l.m151465a(r13, r14)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x024d
            java.lang.Object r13 = sx3.C110818d0.m150916N(r13)
            w1.a r13 = (p735w1.C37958a) r13
            if (r13 == 0) goto L_0x024d
            androidx.compose.ui.platform.AndroidComposeView r14 = r3.f306159e
            i2.d r14 = r14.getDensity()
            android.text.SpannableString r4 = p146e2.C107157a.m145000a(r13, r14, r4)
            goto L_0x024e
        L_0x024d:
            r4 = 0
        L_0x024e:
            java.lang.CharSequence r4 = r3.mo144796y(r4, r9)
            android.text.SpannableString r4 = (android.text.SpannableString) r4
            if (r5 == 0) goto L_0x0257
            goto L_0x0258
        L_0x0257:
            r5 = r4
        L_0x0258:
            r6.mo157866y(r5)
            u1.k r4 = r8.f332640e
            u1.z<java.lang.String> r5 = p246u1.C111092v.f332670y
            boolean r4 = r4.mo162823i(r5)
            if (r4 == 0) goto L_0x0277
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setContentInvalid(r12)
            u1.k r4 = r8.f332640e
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setError(r4)
        L_0x0277:
            u1.k r4 = r8.f332640e
            u1.z<java.lang.String> r5 = p246u1.C111092v.f332647b
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6.mo157865x(r4)
            u1.k r4 = r8.f332640e
            u1.z<v1.a> r5 = p246u1.C111092v.f332668w
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            v1.a r4 = (p251v1.C14403a) r4
            if (r4 == 0) goto L_0x0313
            r6.mo157851k(r12)
            int r4 = r4.ordinal()
            if (r4 == 0) goto L_0x02e6
            if (r4 == r12) goto L_0x02ba
            if (r4 == r10) goto L_0x029f
            goto L_0x0311
        L_0x029f:
            java.lang.CharSequence r4 = r6.mo157843e()
            if (r4 != 0) goto L_0x0311
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131831445(0x7f112a95, float:1.9295916E38)
            java.lang.String r4 = r4.getString(r5)
            r6.mo157865x(r4)
            goto L_0x0311
        L_0x02ba:
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setChecked(r11)
            if (r7 != 0) goto L_0x02c2
            goto L_0x02c8
        L_0x02c2:
            int r4 = r7.f332604a
            if (r4 != r10) goto L_0x02c8
            r4 = 1
            goto L_0x02c9
        L_0x02c8:
            r4 = 0
        L_0x02c9:
            if (r4 == 0) goto L_0x0311
            java.lang.CharSequence r4 = r6.mo157843e()
            if (r4 != 0) goto L_0x0311
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131833793(0x7f1133c1, float:1.9300678E38)
            java.lang.String r4 = r4.getString(r5)
            r6.mo157865x(r4)
            goto L_0x0311
        L_0x02e6:
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setChecked(r12)
            if (r7 != 0) goto L_0x02ee
            goto L_0x02f4
        L_0x02ee:
            int r4 = r7.f332604a
            if (r4 != r10) goto L_0x02f4
            r4 = 1
            goto L_0x02f5
        L_0x02f4:
            r4 = 0
        L_0x02f5:
            if (r4 == 0) goto L_0x0311
            java.lang.CharSequence r4 = r6.mo157843e()
            if (r4 != 0) goto L_0x0311
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131833820(0x7f1133dc, float:1.9300733E38)
            java.lang.String r4 = r4.getString(r5)
            r6.mo157865x(r4)
        L_0x0311:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0313:
            u1.k r4 = r8.f332640e
            u1.z<java.lang.Boolean> r5 = p246u1.C111092v.f332667v
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x036e
            boolean r4 = r4.booleanValue()
            if (r7 != 0) goto L_0x0326
            goto L_0x032d
        L_0x0326:
            int r5 = r7.f332604a
            r7 = 4
            if (r5 != r7) goto L_0x032d
            r5 = 1
            goto L_0x032e
        L_0x032d:
            r5 = 0
        L_0x032e:
            if (r5 == 0) goto L_0x0336
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setSelected(r4)
            goto L_0x036c
        L_0x0336:
            r6.mo157851k(r12)
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setChecked(r4)
            java.lang.CharSequence r5 = r6.mo157843e()
            if (r5 != 0) goto L_0x036c
            if (r4 == 0) goto L_0x0358
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131835571(0x7f113ab3, float:1.9304284E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x0369
        L_0x0358:
            androidx.compose.ui.platform.AndroidComposeView r4 = r3.f306159e
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131833606(0x7f113306, float:1.9300299E38)
            java.lang.String r4 = r4.getString(r5)
        L_0x0369:
            r6.mo157865x(r4)
        L_0x036c:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x036e:
            u1.k r4 = r8.f332640e
            boolean r4 = r4.f332625e
            if (r4 == 0) goto L_0x037e
            java.util.List r4 = r8.mo162839h()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0395
        L_0x037e:
            u1.k r4 = r8.f332640e
            u1.z<java.util.List<java.lang.String>> r5 = p246u1.C111092v.f332646a
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0391
            java.lang.Object r4 = sx3.C110818d0.m150916N(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0392
        L_0x0391:
            r4 = 0
        L_0x0392:
            r6.mo157854n(r4)
        L_0x0395:
            u1.k r4 = r8.f332640e
            boolean r4 = r4.f332625e
            if (r4 == 0) goto L_0x039e
            r6.mo157862u(r12)
        L_0x039e:
            u1.k r4 = r8.f332640e
            u1.z<java.lang.String> r5 = p246u1.C111092v.f332662q
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x03d1
            r5 = r8
        L_0x03ab:
            if (r5 == 0) goto L_0x03c9
            u1.k r7 = r5.f332640e
            u1.z<java.lang.Boolean> r9 = p246u1.C37321w.f98712a
            boolean r7 = r7.mo162823i(r9)
            if (r7 == 0) goto L_0x03c4
            u1.k r5 = r5.f332640e
            java.lang.Object r5 = r5.mo162825k(r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x03ca
        L_0x03c4:
            u1.s r5 = r5.mo162838g()
            goto L_0x03ab
        L_0x03c9:
            r5 = 0
        L_0x03ca:
            if (r5 == 0) goto L_0x03d1
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setViewIdResourceName(r4)
        L_0x03d1:
            u1.k r4 = r8.f332640e
            u1.z<rx3.b0> r5 = p246u1.C111092v.f332653h
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            rx3.b0 r4 = (rx3.C13598b0) r4
            if (r4 == 0) goto L_0x03e2
            r6.mo157857q(r12)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x03e2:
            u1.k r4 = r8.mo162837f()
            u1.z<rx3.b0> r5 = p246u1.C111092v.f332669x
            boolean r4 = r4.mo162823i(r5)
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setPassword(r4)
            boolean r4 = androidx.compose.p002ui.platform.C103678q.m137971f(r8)
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setEditable(r4)
            boolean r4 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            r6.mo157855o(r4)
            u1.k r4 = r8.f332640e
            u1.z<java.lang.Boolean> r5 = p246u1.C111092v.f332656k
            boolean r4 = r4.mo162823i(r5)
            r6.mo157856p(r4)
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            boolean r4 = r4.isFocusable()
            if (r4 == 0) goto L_0x0434
            u1.k r4 = r8.f332640e
            java.lang.Object r4 = r4.mo162825k(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setFocused(r4)
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            boolean r4 = r4.isFocused()
            if (r4 == 0) goto L_0x0431
            r6.mo157839a(r10)
            goto L_0x0434
        L_0x0431:
            r6.mo157839a(r12)
        L_0x0434:
            boolean r4 = r8.f332638c
            if (r4 == 0) goto L_0x0445
            u1.s r4 = r8.mo162838g()
            if (r4 == 0) goto L_0x0443
            q1.s r4 = r4.mo162834c()
            goto L_0x0449
        L_0x0443:
            r4 = 0
            goto L_0x0449
        L_0x0445:
            q1.s r4 = r8.mo162834c()
        L_0x0449:
            if (r4 == 0) goto L_0x0450
            boolean r4 = r4.mo161749Q0()
            goto L_0x0451
        L_0x0450:
            r4 = 0
        L_0x0451:
            if (r4 != 0) goto L_0x045f
            u1.k r4 = r8.f332640e
            u1.z<rx3.b0> r5 = p246u1.C111092v.f332657l
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            if (r4 != 0) goto L_0x045f
            r4 = 1
            goto L_0x0460
        L_0x045f:
            r4 = 0
        L_0x0460:
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setVisibleToUser(r4)
            u1.k r4 = r8.f332640e
            u1.z<u1.e> r5 = p246u1.C111092v.f332655j
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            u1.e r4 = (p246u1.C14099e) r4
            if (r4 == 0) goto L_0x0478
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setLiveRegion(r12)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0478:
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setClickable(r11)
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.l<java.util.List<w1.v>, java.lang.Boolean>>> r5 = p246u1.C111074j.f332608a
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r5 = p246u1.C111074j.f332609b
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            u1.a r4 = (p246u1.C111063a) r4
            r5 = 16
            if (r4 == 0) goto L_0x04b6
            u1.k r7 = r8.f332640e
            u1.z<java.lang.Boolean> r9 = p246u1.C111092v.f332667v
            java.lang.Object r7 = p246u1.C111076l.m151465a(r7, r9)
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = gy3.C87412m.m108589b(r7, r9)
            r9 = r7 ^ 1
            android.view.accessibility.AccessibilityNodeInfo r10 = r6.f321473a
            r10.setClickable(r9)
            boolean r9 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r9 == 0) goto L_0x04b4
            if (r7 != 0) goto L_0x04b4
            f3.d$a r7 = new f3.d$a
            java.lang.String r4 = r4.f332590a
            r7.<init>(r5, r4)
            r6.mo157840b(r7)
        L_0x04b4:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04b6:
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            r4.setLongClickable(r11)
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r7 = p246u1.C111074j.f332610c
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r7)
            u1.a r4 = (p246u1.C111063a) r4
            r7 = 32
            if (r4 == 0) goto L_0x04e0
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.f321473a
            r9.setLongClickable(r12)
            boolean r9 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r9 == 0) goto L_0x04de
            f3.d$a r9 = new f3.d$a
            java.lang.String r4 = r4.f332590a
            r9.<init>(r7, r4)
            r6.mo157840b(r9)
        L_0x04de:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04e0:
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r9 = p246u1.C111074j.f332616i
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            u1.a r4 = (p246u1.C111063a) r4
            if (r4 == 0) goto L_0x04fa
            f3.d$a r9 = new f3.d$a
            r10 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r4 = r4.f332590a
            r9.<init>(r10, r4)
            r6.mo157840b(r9)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04fa:
            boolean r4 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r4 == 0) goto L_0x056f
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.l<w1.a, java.lang.Boolean>>> r9 = p246u1.C111074j.f332615h
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            u1.a r4 = (p246u1.C111063a) r4
            if (r4 == 0) goto L_0x051a
            f3.d$a r9 = new f3.d$a
            r10 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r4 = r4.f332590a
            r9.<init>(r10, r4)
            r6.mo157840b(r9)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x051a:
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r9 = p246u1.C111074j.f332617j
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            u1.a r4 = (p246u1.C111063a) r4
            if (r4 == 0) goto L_0x0534
            f3.d$a r9 = new f3.d$a
            r10 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r4 = r4.f332590a
            r9.<init>(r10, r4)
            r6.mo157840b(r9)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0534:
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r9 = p246u1.C111074j.f332618k
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            u1.a r4 = (p246u1.C111063a) r4
            if (r4 == 0) goto L_0x056f
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.f321473a
            boolean r9 = r9.isFocused()
            if (r9 == 0) goto L_0x056d
            androidx.compose.ui.platform.AndroidComposeView r9 = r3.f306159e
            androidx.compose.ui.platform.k r9 = r9.getClipboardManager()
            android.content.ClipboardManager r9 = r9.f306116a
            android.content.ClipDescription r9 = r9.getPrimaryClipDescription()
            if (r9 == 0) goto L_0x055d
            java.lang.String r10 = "text/plain"
            boolean r9 = r9.hasMimeType(r10)
            goto L_0x055e
        L_0x055d:
            r9 = 0
        L_0x055e:
            if (r9 == 0) goto L_0x056d
            f3.d$a r9 = new f3.d$a
            r10 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r4 = r4.f332590a
            r9.<init>(r10, r4)
            r6.mo157840b(r9)
        L_0x056d:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x056f:
            java.lang.String r4 = r3.mo144783h(r8)
            if (r4 == 0) goto L_0x057e
            int r4 = r4.length()
            if (r4 != 0) goto L_0x057c
            goto L_0x057e
        L_0x057c:
            r4 = 0
            goto L_0x057f
        L_0x057e:
            r4 = 1
        L_0x057f:
            if (r4 != 0) goto L_0x05ef
            int r4 = r3.mo144780f(r8)
            int r9 = r3.mo144779e(r8)
            android.view.accessibility.AccessibilityNodeInfo r10 = r6.f321473a
            r10.setTextSelection(r4, r9)
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.q<java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.Boolean>>> r9 = p246u1.C111074j.f332614g
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            u1.a r4 = (p246u1.C111063a) r4
            f3.d$a r9 = new f3.d$a
            r10 = 131072(0x20000, float:1.83671E-40)
            if (r4 == 0) goto L_0x05a1
            java.lang.String r4 = r4.f332590a
            goto L_0x05a2
        L_0x05a1:
            r4 = 0
        L_0x05a2:
            r9.<init>(r10, r4)
            r6.mo157840b(r9)
            r4 = 256(0x100, float:3.59E-43)
            r6.mo157839a(r4)
            r4 = 512(0x200, float:7.175E-43)
            r6.mo157839a(r4)
            r4 = 11
            android.view.accessibility.AccessibilityNodeInfo r9 = r6.f321473a
            r9.setMovementGranularities(r4)
            u1.k r4 = r8.f332640e
            u1.z<java.util.List<java.lang.String>> r9 = p246u1.C111092v.f332646a
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r9)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x05ce
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x05cc
            goto L_0x05ce
        L_0x05cc:
            r4 = 0
            goto L_0x05cf
        L_0x05ce:
            r4 = 1
        L_0x05cf:
            if (r4 == 0) goto L_0x05ef
            u1.k r4 = r8.f332640e
            u1.z<u1.a<fy3.l<java.util.List<w1.v>, java.lang.Boolean>>> r9 = p246u1.C111074j.f332608a
            boolean r4 = r4.mo162823i(r9)
            if (r4 == 0) goto L_0x05ef
            boolean r4 = androidx.compose.p002ui.platform.C103678q.m137967b(r8)
            if (r4 != 0) goto L_0x05ef
            android.view.accessibility.AccessibilityNodeInfo r4 = r6.f321473a
            int r4 = r4.getMovementGranularities()
            r9 = 4
            r4 = r4 | r9
            r4 = r4 | r5
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r5.setMovementGranularities(r4)
        L_0x05ef:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r4 < r5) goto L_0x063c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.CharSequence r9 = r6.mo157845f()
            if (r9 == 0) goto L_0x0609
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0607
            goto L_0x0609
        L_0x0607:
            r9 = 0
            goto L_0x060a
        L_0x0609:
            r9 = 1
        L_0x060a:
            if (r9 != 0) goto L_0x061b
            u1.k r9 = r8.f332640e
            u1.z<u1.a<fy3.l<java.util.List<w1.v>, java.lang.Boolean>>> r10 = p246u1.C111074j.f332608a
            boolean r9 = r9.mo162823i(r10)
            if (r9 == 0) goto L_0x061b
            java.lang.String r9 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r5.add(r9)
        L_0x061b:
            u1.k r9 = r8.f332640e
            u1.z<java.lang.String> r10 = p246u1.C111092v.f332662q
            boolean r9 = r9.mo162823i(r10)
            if (r9 == 0) goto L_0x062a
            java.lang.String r9 = "androidx.compose.ui.semantics.testTag"
            r5.add(r9)
        L_0x062a:
            boolean r9 = r5.isEmpty()
            if (r9 != 0) goto L_0x063c
            androidx.compose.ui.platform.i r9 = androidx.compose.p002ui.platform.C103630i.f306083a
            android.view.accessibility.AccessibilityNodeInfo r10 = r6.f321473a
            java.lang.String r13 = "info.unwrap()"
            gy3.C87412m.m108593f(r10, r13)
            r9.mo144731a(r10, r5)
        L_0x063c:
            u1.k r5 = r8.f332640e
            u1.z<u1.g> r9 = p246u1.C111092v.f332648c
            java.lang.Object r5 = p246u1.C111076l.m151465a(r5, r9)
            u1.g r5 = (p246u1.C37320g) r5
            r9 = 0
            if (r5 == 0) goto L_0x078d
            u1.k r10 = r8.f332640e
            u1.z<u1.a<fy3.l<java.lang.Float, java.lang.Boolean>>> r13 = p246u1.C111074j.f332613f
            boolean r10 = r10.mo162823i(r13)
            if (r10 == 0) goto L_0x0659
            java.lang.String r10 = "android.widget.SeekBar"
            r6.mo157852l(r10)
            goto L_0x065e
        L_0x0659:
            java.lang.String r10 = "android.widget.ProgressBar"
            r6.mo157852l(r10)
        L_0x065e:
            u1.g r10 = p246u1.C37320g.f98708d
            if (r5 == r10) goto L_0x0715
            my3.f<java.lang.Float> r10 = r5.f98710b
            java.lang.Comparable r10 = r10.mo59687f0()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            my3.f<java.lang.Float> r14 = r5.f98710b
            java.lang.Comparable r14 = r14.mo59688g0()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            float r15 = r5.f98709a
            f3.d$c r10 = p1108f3.C107453d.C107456c.m145564a(r12, r10, r14, r15)
            r6.mo157860t(r10)
            java.lang.CharSequence r10 = r6.mo157843e()
            if (r10 != 0) goto L_0x072f
            my3.f<java.lang.Float> r10 = r5.f98710b
            java.lang.Comparable r14 = r10.mo59688g0()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            java.lang.Comparable r15 = r10.mo59687f0()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r14 = r14 - r15
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x06a6
            r14 = 1
            goto L_0x06a7
        L_0x06a6:
            r14 = 0
        L_0x06a7:
            if (r14 == 0) goto L_0x06ab
            r14 = 0
            goto L_0x06ce
        L_0x06ab:
            float r14 = r5.f98709a
            java.lang.Comparable r15 = r10.mo59687f0()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            float r14 = r14 - r15
            java.lang.Comparable r15 = r10.mo59688g0()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            java.lang.Comparable r10 = r10.mo59687f0()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r15 = r15 - r10
            float r14 = r14 / r15
        L_0x06ce:
            r10 = 1065353216(0x3f800000, float:1.0)
            float r14 = my3.C61595o.m72296d(r14, r9, r10)
            int r15 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r15 != 0) goto L_0x06da
            r15 = 1
            goto L_0x06db
        L_0x06da:
            r15 = 0
        L_0x06db:
            r7 = 100
            if (r15 == 0) goto L_0x06e1
            r7 = 0
            goto L_0x06f8
        L_0x06e1:
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 != 0) goto L_0x06e7
            r10 = 1
            goto L_0x06e8
        L_0x06e7:
            r10 = 0
        L_0x06e8:
            if (r10 == 0) goto L_0x06eb
            goto L_0x06f8
        L_0x06eb:
            float r7 = (float) r7
            float r14 = r14 * r7
            int r7 = iy3.C60641c.m70921b(r14)
            r10 = 99
            int r7 = my3.C61595o.m72297e(r7, r12, r10)
        L_0x06f8:
            androidx.compose.ui.platform.AndroidComposeView r10 = r3.f306159e
            android.content.Context r10 = r10.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r14 = 2131837831(0x7f114387, float:1.9308868E38)
            java.lang.Object[] r15 = new java.lang.Object[r12]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15[r11] = r7
            java.lang.String r7 = r10.getString(r14, r15)
            r6.mo157865x(r7)
            goto L_0x072f
        L_0x0715:
            java.lang.CharSequence r7 = r6.mo157843e()
            if (r7 != 0) goto L_0x072f
            androidx.compose.ui.platform.AndroidComposeView r7 = r3.f306159e
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131831440(0x7f112a90, float:1.9295906E38)
            java.lang.String r7 = r7.getString(r10)
            r6.mo157865x(r7)
        L_0x072f:
            u1.k r7 = r8.f332640e
            boolean r7 = r7.mo162823i(r13)
            if (r7 == 0) goto L_0x078d
            boolean r7 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r7 == 0) goto L_0x078d
            float r7 = r5.f98709a
            my3.f<java.lang.Float> r10 = r5.f98710b
            java.lang.Comparable r10 = r10.mo59688g0()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            my3.f<java.lang.Float> r13 = r5.f98710b
            java.lang.Comparable r13 = r13.mo59687f0()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            int r14 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r14 >= 0) goto L_0x075c
            r10 = r13
        L_0x075c:
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0765
            f3.d$a r7 = p1108f3.C107453d.C107454a.f321483j
            r6.mo157840b(r7)
        L_0x0765:
            float r7 = r5.f98709a
            my3.f<java.lang.Float> r10 = r5.f98710b
            java.lang.Comparable r10 = r10.mo59687f0()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            my3.f<java.lang.Float> r5 = r5.f98710b
            java.lang.Comparable r5 = r5.mo59688g0()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r13 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0784
            r10 = r5
        L_0x0784:
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x078d
            f3.d$a r5 = p1108f3.C107453d.C107454a.f321484k
            r6.mo157840b(r5)
        L_0x078d:
            r5 = 24
            if (r4 < r5) goto L_0x0794
            androidx.compose.p002ui.platform.m$$c.m137868a(r6, r8)
        L_0x0794:
            u1.k r4 = r8.mo162837f()
            u1.z<u1.b> r5 = p246u1.C111092v.f332651f
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            u1.b r4 = (p246u1.C111065b) r4
            if (r4 == 0) goto L_0x07b3
            int r5 = r4.f332592a
            int r4 = r4.f332593b
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r4 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r5, r4, r11, r11)
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r7 = r4
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r7 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r7
            r5.setCollectionInfo(r4)
            goto L_0x080e
        L_0x07b3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            u1.k r5 = r8.mo162837f()
            u1.z<rx3.b0> r7 = p246u1.C111092v.f332650e
            java.lang.Object r5 = p246u1.C111076l.m151465a(r5, r7)
            if (r5 == 0) goto L_0x07e7
            java.util.List r5 = r8.mo162839h()
            int r7 = r5.size()
            r10 = 0
        L_0x07cd:
            if (r10 >= r7) goto L_0x07e7
            java.lang.Object r13 = r5.get(r10)
            u1.s r13 = (p246u1.C111087s) r13
            u1.k r14 = r13.mo162837f()
            u1.z<java.lang.Boolean> r15 = p246u1.C111092v.f332667v
            boolean r14 = r14.mo162823i(r15)
            if (r14 == 0) goto L_0x07e4
            r4.add(r13)
        L_0x07e4:
            int r10 = r10 + 1
            goto L_0x07cd
        L_0x07e7:
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ r12
            if (r5 == 0) goto L_0x080e
            boolean r5 = p672r1.C110481a.m150380a(r4)
            if (r5 == 0) goto L_0x07f6
            r7 = 1
            goto L_0x07fa
        L_0x07f6:
            int r7 = r4.size()
        L_0x07fa:
            if (r5 == 0) goto L_0x0801
            int r4 = r4.size()
            goto L_0x0802
        L_0x0801:
            r4 = 1
        L_0x0802:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r4 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r7, r4, r11, r11)
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
            r7 = r4
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r7 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r7
            r5.setCollectionInfo(r4)
        L_0x080e:
            p672r1.C110481a.m150382c(r8, r6)
            u1.k r4 = r8.f332640e
            u1.z<u1.i> r5 = p246u1.C111092v.f332658m
            java.lang.Object r4 = p246u1.C111076l.m151465a(r4, r5)
            u1.i r4 = (p246u1.C111073i) r4
            u1.k r5 = r8.f332640e
            u1.z<u1.a<fy3.l<java.util.List<w1.v>, java.lang.Boolean>>> r7 = p246u1.C111074j.f332608a
            u1.z<u1.a<fy3.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r7 = p246u1.C111074j.f332611d
            java.lang.Object r5 = p246u1.C111076l.m151465a(r5, r7)
            u1.a r5 = (p246u1.C111063a) r5
            if (r4 == 0) goto L_0x088b
            if (r5 == 0) goto L_0x088b
            boolean r7 = p672r1.C110481a.m150381b(r8)
            if (r7 != 0) goto L_0x0836
            java.lang.String r7 = "android.widget.HorizontalScrollView"
            r6.mo157852l(r7)
        L_0x0836:
            fy3.a<java.lang.Float> r7 = r4.f332606b
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0849
            r6.mo157863v(r12)
        L_0x0849:
            boolean r7 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r7 == 0) goto L_0x088b
            boolean r7 = androidx.compose.p002ui.platform.C103662m.m137846o(r4)
            if (r7 == 0) goto L_0x086d
            f3.d$a r7 = p1108f3.C107453d.C107454a.f321483j
            r6.mo157840b(r7)
            q1.j r7 = r8.f332642g
            i2.o r7 = r7.f329929x
            if (r7 != r1) goto L_0x0862
            r7 = 1
            goto L_0x0863
        L_0x0862:
            r7 = 0
        L_0x0863:
            if (r7 != 0) goto L_0x0868
            f3.d$a r7 = p1108f3.C107453d.C107454a.f321488o
            goto L_0x086a
        L_0x0868:
            f3.d$a r7 = p1108f3.C107453d.C107454a.f321486m
        L_0x086a:
            r6.mo157840b(r7)
        L_0x086d:
            boolean r4 = androidx.compose.p002ui.platform.C103662m.m137845n(r4)
            if (r4 == 0) goto L_0x088b
            f3.d$a r4 = p1108f3.C107453d.C107454a.f321484k
            r6.mo157840b(r4)
            q1.j r4 = r8.f332642g
            i2.o r4 = r4.f329929x
            if (r4 != r1) goto L_0x0880
            r1 = 1
            goto L_0x0881
        L_0x0880:
            r1 = 0
        L_0x0881:
            if (r1 != 0) goto L_0x0886
            f3.d$a r1 = p1108f3.C107453d.C107454a.f321486m
            goto L_0x0888
        L_0x0886:
            f3.d$a r1 = p1108f3.C107453d.C107454a.f321488o
        L_0x0888:
            r6.mo157840b(r1)
        L_0x088b:
            u1.k r1 = r8.f332640e
            u1.z<u1.i> r4 = p246u1.C111092v.f332659n
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            u1.i r1 = (p246u1.C111073i) r1
            if (r1 == 0) goto L_0x08dd
            if (r5 == 0) goto L_0x08dd
            boolean r4 = p672r1.C110481a.m150381b(r8)
            if (r4 != 0) goto L_0x08a4
            java.lang.String r4 = "android.widget.ScrollView"
            r6.mo157852l(r4)
        L_0x08a4:
            fy3.a<java.lang.Float> r4 = r1.f332606b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x08b7
            r6.mo157863v(r12)
        L_0x08b7:
            boolean r4 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r4 == 0) goto L_0x08dd
            boolean r4 = androidx.compose.p002ui.platform.C103662m.m137846o(r1)
            if (r4 == 0) goto L_0x08cd
            f3.d$a r4 = p1108f3.C107453d.C107454a.f321483j
            r6.mo157840b(r4)
            f3.d$a r4 = p1108f3.C107453d.C107454a.f321487n
            r6.mo157840b(r4)
        L_0x08cd:
            boolean r1 = androidx.compose.p002ui.platform.C103662m.m137845n(r1)
            if (r1 == 0) goto L_0x08dd
            f3.d$a r1 = p1108f3.C107453d.C107454a.f321484k
            r6.mo157840b(r1)
            f3.d$a r1 = p1108f3.C107453d.C107454a.f321485l
            r6.mo157840b(r1)
        L_0x08dd:
            u1.k r1 = r8.f332640e
            u1.z<java.lang.String> r4 = p246u1.C111092v.f332649d
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.mo157859s(r1)
            boolean r1 = androidx.compose.p002ui.platform.C103678q.m137966a(r8)
            if (r1 == 0) goto L_0x0a32
            u1.k r1 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r4 = p246u1.C111074j.f332619l
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            u1.a r1 = (p246u1.C111063a) r1
            if (r1 == 0) goto L_0x090a
            f3.d$a r4 = new f3.d$a
            r5 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r1 = r1.f332590a
            r4.<init>(r5, r1)
            r6.mo157840b(r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x090a:
            u1.k r1 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r4 = p246u1.C111074j.f332620m
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            u1.a r1 = (p246u1.C111063a) r1
            if (r1 == 0) goto L_0x0924
            f3.d$a r4 = new f3.d$a
            r5 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r1 = r1.f332590a
            r4.<init>(r5, r1)
            r6.mo157840b(r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0924:
            u1.k r1 = r8.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r4 = p246u1.C111074j.f332621n
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r4)
            u1.a r1 = (p246u1.C111063a) r1
            if (r1 == 0) goto L_0x093e
            f3.d$a r4 = new f3.d$a
            r5 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r1 = r1.f332590a
            r4.<init>(r5, r1)
            r6.mo157840b(r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x093e:
            u1.k r1 = r8.f332640e
            u1.z<java.util.List<u1.d>> r4 = p246u1.C111074j.f332623p
            boolean r1 = r1.mo162823i(r4)
            if (r1 == 0) goto L_0x0a32
            u1.k r1 = r8.f332640e
            java.lang.Object r1 = r1.mo162825k(r4)
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.size()
            int[] r5 = androidx.compose.p002ui.platform.C103662m.f306155D
            r7 = 32
            if (r4 >= r7) goto L_0x0a2a
            u.j r4 = new u.j
            r4.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            u.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r8 = r3.f306166o
            boolean r8 = r8.mo162802c(r0)
            if (r8 == 0) goto L_0x09f6
            u.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r8 = r3.f306166o
            r9 = 0
            java.lang.Object r8 = r8.mo162805e(r0, r9)
            java.util.Map r8 = (java.util.Map) r8
            java.util.List r5 = sx3.C110823p.m151002b0(r5)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r1.size()
            r12 = 0
        L_0x0983:
            if (r12 >= r10) goto L_0x09c4
            java.lang.Object r13 = r1.get(r12)
            u1.d r13 = (p246u1.C14098d) r13
            gy3.C87412m.m108591d(r8)
            r13.getClass()
            r14 = 0
            boolean r15 = r8.containsKey(r14)
            if (r15 == 0) goto L_0x09be
            java.lang.Object r13 = r8.get(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108591d(r13)
            int r15 = r13.intValue()
            r4.mo162807g(r15, r14)
            r7.put(r14, r13)
            r15 = r5
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            r15.remove(r13)
            f3.d$a r15 = new f3.d$a
            int r13 = r13.intValue()
            r15.<init>(r13, r14)
            r6.mo157840b(r15)
            goto L_0x09c1
        L_0x09be:
            r9.add(r13)
        L_0x09c1:
            int r12 = r12 + 1
            goto L_0x0983
        L_0x09c4:
            int r1 = r9.size()
        L_0x09c8:
            if (r11 >= r1) goto L_0x0a1f
            java.lang.Object r8 = r9.get(r11)
            u1.d r8 = (p246u1.C14098d) r8
            r10 = r5
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.lang.Object r10 = r10.get(r11)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r8.getClass()
            r8 = 0
            r4.mo162807g(r10, r8)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r7.put(r8, r12)
            f3.d$a r12 = new f3.d$a
            r12.<init>(r10, r8)
            r6.mo157840b(r12)
            int r11 = r11 + 1
            goto L_0x09c8
        L_0x09f6:
            int r5 = r1.size()
        L_0x09fa:
            if (r11 >= r5) goto L_0x0a1f
            java.lang.Object r8 = r1.get(r11)
            u1.d r8 = (p246u1.C14098d) r8
            int[] r9 = androidx.compose.p002ui.platform.C103662m.f306155D
            r9 = r9[r11]
            r8.getClass()
            r8 = 0
            r4.mo162807g(r9, r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r7.put(r8, r10)
            f3.d$a r10 = new f3.d$a
            r10.<init>(r9, r8)
            r6.mo157840b(r10)
            int r11 = r11 + 1
            goto L_0x09fa
        L_0x0a1f:
            u.j<u.j<java.lang.CharSequence>> r1 = r3.f306165n
            r1.mo162807g(r0, r4)
            u.j<java.util.Map<java.lang.CharSequence, java.lang.Integer>> r1 = r3.f306166o
            r1.mo162807g(r0, r7)
            goto L_0x0a32
        L_0x0a2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't have more than 32 custom actions for one widget"
            r0.<init>(r1)
            throw r0
        L_0x0a32:
            android.view.accessibility.AccessibilityNodeInfo r5 = r6.f321473a
        L_0x0a34:
            return r5
        L_0x0a35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "semanticsNode "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " has null parent"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.m$$e.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: androidx.compose.ui.platform.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: androidx.compose.ui.platform.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: androidx.compose.ui.platform.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: androidx.compose.ui.platform.d} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3, types: [androidx.compose.ui.platform.f] */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r9v38 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r9v40 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0510, code lost:
        if (r1 != 16) goto L_0x0606;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0668  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAction(int r25, int r26, android.os.Bundle r27) {
        /*
            r24 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            i2.o r3 = p560i2.C33183o.Rtl
            r7 = r24
            androidx.compose.ui.platform.m r4 = r7.f306180a
            java.util.Map r5 = r4.mo144781g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            java.lang.Object r5 = r5.get(r6)
            androidx.compose.ui.platform.v1 r5 = (androidx.compose.p002ui.platform.C103703v1) r5
            r15 = 1
            if (r5 == 0) goto L_0x06e5
            u1.s r5 = r5.f306289a
            if (r5 != 0) goto L_0x0023
            goto L_0x06e5
        L_0x0023:
            r6 = 64
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r6) goto L_0x06ad
            r6 = 128(0x80, float:1.794E-43)
            if (r0 == r6) goto L_0x068b
            r6 = 2
            r9 = 0
            r10 = -1
            r11 = 256(0x100, float:3.59E-43)
            r12 = 512(0x200, float:7.175E-43)
            if (r0 == r11) goto L_0x04ad
            if (r0 == r12) goto L_0x04ad
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r0 == r11) goto L_0x048f
            r11 = 131072(0x20000, float:1.83671E-40)
            if (r0 == r11) goto L_0x0464
            boolean r10 = androidx.compose.p002ui.platform.C103678q.m137966a(r5)
            if (r10 != 0) goto L_0x0048
            goto L_0x06e5
        L_0x0048:
            if (r0 == r15) goto L_0x0446
            if (r0 == r6) goto L_0x042a
            switch(r0) {
                case 16: goto L_0x0262;
                case 32: goto L_0x0244;
                case 4096: goto L_0x0292;
                case 8192: goto L_0x0292;
                case 32768: goto L_0x0226;
                case 65536: goto L_0x0208;
                case 262144: goto L_0x01ea;
                case 524288: goto L_0x01cc;
                case 1048576: goto L_0x01ae;
                case 2097152: goto L_0x0179;
                case 16908342: goto L_0x0098;
                case 16908349: goto L_0x0066;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case 16908344: goto L_0x0292;
                case 16908345: goto L_0x0292;
                case 16908346: goto L_0x0292;
                case 16908347: goto L_0x0292;
                default: goto L_0x0052;
            }
        L_0x0052:
            u.j<u.j<java.lang.CharSequence>> r2 = r4.f306165n
            java.lang.Object r1 = r2.mo162805e(r1, r9)
            u.j r1 = (p1042u.C111060j) r1
            if (r1 == 0) goto L_0x06e5
            java.lang.Object r0 = r1.mo162805e(r0, r9)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L_0x0402
            goto L_0x06e5
        L_0x0066:
            if (r2 == 0) goto L_0x06e5
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r2.containsKey(r0)
            if (r1 != 0) goto L_0x0072
            goto L_0x06e5
        L_0x0072:
            u1.k r1 = r5.f332640e
            u1.z<u1.a<fy3.l<java.lang.Float, java.lang.Boolean>>> r3 = p246u1.C111074j.f332613f
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r3)
            u1.a r1 = (p246u1.C111063a) r1
            if (r1 == 0) goto L_0x06e5
            T r1 = r1.f332591b
            fy3.l r1 = (fy3.C32226l) r1
            if (r1 == 0) goto L_0x06e5
            float r0 = r2.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0098:
            u1.s r0 = r5.mo162838g()
            if (r0 == 0) goto L_0x00ad
            u1.k r1 = r0.mo162837f()
            if (r1 == 0) goto L_0x00ad
            u1.z<u1.a<fy3.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r2 = p246u1.C111074j.f332611d
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r2)
            u1.a r1 = (p246u1.C111063a) r1
            goto L_0x00ae
        L_0x00ad:
            r1 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00c8
            if (r1 == 0) goto L_0x00b3
            goto L_0x00c8
        L_0x00b3:
            u1.s r0 = r0.mo162838g()
            if (r0 == 0) goto L_0x00ad
            u1.k r1 = r0.mo162837f()
            if (r1 == 0) goto L_0x00ad
            u1.z<u1.a<fy3.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r2 = p246u1.C111074j.f332611d
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r2)
            u1.a r1 = (p246u1.C111063a) r1
            goto L_0x00ae
        L_0x00c8:
            if (r0 != 0) goto L_0x00cc
            goto L_0x06e5
        L_0x00cc:
            q1.j r2 = r0.f332642g
            q1.s r2 = r2.f329895I
            z0.g r2 = p631o1.C109861p.m149325a(r2)
            q1.j r4 = r0.f332642g
            q1.s r4 = r4.f329895I
            o1.o r4 = r4.mo161180a()
            if (r4 == 0) goto L_0x00e3
            long r9 = p631o1.C109861p.m149328d(r4)
            goto L_0x00e5
        L_0x00e3:
            long r9 = p1166z0.C112539e.f336955b
        L_0x00e5:
            z0.g r2 = r2.mo164263d(r9)
            q1.j r4 = r5.f332642g
            boolean r4 = r4.mo161701A()
            if (r4 != 0) goto L_0x00f4
            long r9 = p1166z0.C112539e.f336955b
            goto L_0x00fc
        L_0x00f4:
            q1.s r4 = r5.mo162834c()
            long r9 = p631o1.C109861p.m149328d(r4)
        L_0x00fc:
            q1.s r4 = r5.mo162834c()
            long r11 = r4.f328781f
            long r11 = p560i2.C108329n.m146744b(r11)
            z0.g r4 = p1166z0.C112542h.m153752a(r9, r11)
            u1.k r6 = r0.f332640e
            u1.z<u1.i> r9 = p246u1.C111092v.f332658m
            java.lang.Object r6 = p246u1.C111076l.m151465a(r6, r9)
            u1.i r6 = (p246u1.C111073i) r6
            u1.k r0 = r0.f332640e
            u1.z<u1.i> r9 = p246u1.C111092v.f332659n
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r9)
            u1.i r0 = (p246u1.C111073i) r0
            float r9 = r4.f336961a
            float r10 = r2.f336961a
            float r9 = r9 - r10
            float r10 = r4.f336963c
            float r11 = r2.f336963c
            float r10 = r10 - r11
            float r9 = androidx.compose.p002ui.platform.C103662m.m137844m(r9, r10)
            if (r6 == 0) goto L_0x0134
            boolean r6 = r6.f332607c
            if (r6 != r15) goto L_0x0134
            r6 = 1
            goto L_0x0135
        L_0x0134:
            r6 = 0
        L_0x0135:
            if (r6 == 0) goto L_0x0138
            float r9 = -r9
        L_0x0138:
            q1.j r5 = r5.f332642g
            i2.o r5 = r5.f329929x
            if (r5 != r3) goto L_0x0140
            r3 = 1
            goto L_0x0141
        L_0x0140:
            r3 = 0
        L_0x0141:
            if (r3 == 0) goto L_0x0144
            float r9 = -r9
        L_0x0144:
            float r3 = r4.f336962b
            float r5 = r2.f336962b
            float r3 = r3 - r5
            float r4 = r4.f336964d
            float r2 = r2.f336964d
            float r4 = r4 - r2
            float r2 = androidx.compose.p002ui.platform.C103662m.m137844m(r3, r4)
            if (r0 == 0) goto L_0x0159
            boolean r0 = r0.f332607c
            if (r0 != r15) goto L_0x0159
            goto L_0x015a
        L_0x0159:
            r15 = 0
        L_0x015a:
            if (r15 == 0) goto L_0x015d
            float r2 = -r2
        L_0x015d:
            if (r1 == 0) goto L_0x06e5
            T r0 = r1.f332591b
            fy3.p r0 = (fy3.C32227p) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Float r1 = java.lang.Float.valueOf(r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0179:
            if (r2 == 0) goto L_0x0181
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r9 = r2.getString(r0)
        L_0x0181:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.l<w1.a, java.lang.Boolean>>> r1 = p246u1.C111074j.f332615h
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.l r0 = (fy3.C32226l) r0
            if (r0 == 0) goto L_0x06e5
            w1.a r8 = new w1.a
            if (r9 != 0) goto L_0x0199
            java.lang.String r9 = ""
        L_0x0199:
            r2 = r9
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x01ae:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332621n
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x01cc:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332620m
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x01ea:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332619l
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0208:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332617j
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0226:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332618k
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0244:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332610c
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0262:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r2 = p246u1.C111074j.f332609b
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r2)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x027b
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x027b
            java.lang.Object r0 = r0.invoke()
            r9 = r0
            java.lang.Boolean r9 = (java.lang.Boolean) r9
        L_0x027b:
            r2 = 1
            r3 = 0
            r5 = 0
            r6 = 12
            r10 = 0
            r0 = r4
            r1 = r25
            r4 = r5
            r5 = r6
            r6 = r10
            androidx.compose.p002ui.platform.C103662m.m137847s(r0, r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L_0x06e5
            boolean r15 = r9.booleanValue()
            goto L_0x06e7
        L_0x0292:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L_0x0298
            r1 = 1
            goto L_0x0299
        L_0x0298:
            r1 = 0
        L_0x0299:
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r0 != r2) goto L_0x029f
            r2 = 1
            goto L_0x02a0
        L_0x029f:
            r2 = 0
        L_0x02a0:
            r4 = 16908345(0x1020039, float:2.387739E-38)
            if (r0 != r4) goto L_0x02a7
            r4 = 1
            goto L_0x02a8
        L_0x02a7:
            r4 = 0
        L_0x02a8:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r0 != r6) goto L_0x02af
            r6 = 1
            goto L_0x02b0
        L_0x02af:
            r6 = 0
        L_0x02b0:
            r9 = 16908344(0x1020038, float:2.3877386E-38)
            if (r0 != r9) goto L_0x02b7
            r9 = 1
            goto L_0x02b8
        L_0x02b7:
            r9 = 0
        L_0x02b8:
            r10 = 16908346(0x102003a, float:2.3877392E-38)
            if (r0 != r10) goto L_0x02bf
            r0 = 1
            goto L_0x02c0
        L_0x02bf:
            r0 = 0
        L_0x02c0:
            if (r4 != 0) goto L_0x02cb
            if (r6 != 0) goto L_0x02cb
            if (r1 != 0) goto L_0x02cb
            if (r2 == 0) goto L_0x02c9
            goto L_0x02cb
        L_0x02c9:
            r10 = 0
            goto L_0x02cc
        L_0x02cb:
            r10 = 1
        L_0x02cc:
            if (r9 != 0) goto L_0x02d7
            if (r0 != 0) goto L_0x02d7
            if (r1 != 0) goto L_0x02d7
            if (r2 == 0) goto L_0x02d5
            goto L_0x02d7
        L_0x02d5:
            r0 = 0
            goto L_0x02d8
        L_0x02d7:
            r0 = 1
        L_0x02d8:
            if (r1 != 0) goto L_0x02dc
            if (r2 == 0) goto L_0x0356
        L_0x02dc:
            u1.k r1 = r5.f332640e
            u1.z<u1.g> r11 = p246u1.C111092v.f332648c
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r11)
            u1.g r1 = (p246u1.C37320g) r1
            u1.k r11 = r5.f332640e
            u1.z<u1.a<fy3.l<java.lang.Float, java.lang.Boolean>>> r12 = p246u1.C111074j.f332613f
            java.lang.Object r11 = p246u1.C111076l.m151465a(r11, r12)
            u1.a r11 = (p246u1.C111063a) r11
            if (r1 == 0) goto L_0x0356
            if (r11 == 0) goto L_0x0356
            my3.f<java.lang.Float> r0 = r1.f98710b
            java.lang.Comparable r0 = r0.mo59688g0()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            my3.f<java.lang.Float> r3 = r1.f98710b
            java.lang.Comparable r3 = r3.mo59687f0()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0311
            r0 = r3
        L_0x0311:
            my3.f<java.lang.Float> r3 = r1.f98710b
            java.lang.Comparable r3 = r3.mo59687f0()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            my3.f<java.lang.Float> r4 = r1.f98710b
            java.lang.Comparable r4 = r4.mo59688g0()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x032e
            r3 = r4
        L_0x032e:
            int r4 = r1.f98711c
            float r0 = r0 - r3
            if (r4 <= 0) goto L_0x0336
            int r4 = r4 + r15
            float r3 = (float) r4
            goto L_0x0339
        L_0x0336:
            r3 = 20
            float r3 = (float) r3
        L_0x0339:
            float r0 = r0 / r3
            if (r2 == 0) goto L_0x033d
            float r0 = -r0
        L_0x033d:
            T r2 = r11.f332591b
            fy3.l r2 = (fy3.C32226l) r2
            if (r2 == 0) goto L_0x06e5
            float r1 = r1.f98709a
            float r1 = r1 + r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0356:
            q1.j r1 = r5.f332642g
            q1.s r1 = r1.f329895I
            z0.g r1 = p631o1.C109861p.m149325a(r1)
            float r11 = r1.f336963c
            float r12 = r1.f336961a
            float r11 = r11 - r12
            float r12 = r1.f336964d
            float r1 = r1.f336962b
            float r12 = r12 - r1
            long r11 = p1166z0.C112546l.m153761a(r11, r12)
            u1.k r1 = r5.f332640e
            u1.z<u1.a<fy3.p<java.lang.Float, java.lang.Float, java.lang.Boolean>>> r13 = p246u1.C111074j.f332611d
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r13)
            u1.a r1 = (p246u1.C111063a) r1
            if (r1 != 0) goto L_0x037a
            goto L_0x06e5
        L_0x037a:
            u1.k r13 = r5.f332640e
            u1.z<u1.i> r14 = p246u1.C111092v.f332658m
            java.lang.Object r13 = p246u1.C111076l.m151465a(r13, r14)
            u1.i r13 = (p246u1.C111073i) r13
            r14 = 0
            if (r13 == 0) goto L_0x03c6
            if (r10 == 0) goto L_0x03c6
            float r10 = p1166z0.C112545k.m153758d(r11)
            if (r4 != 0) goto L_0x0391
            if (r2 == 0) goto L_0x0392
        L_0x0391:
            float r10 = -r10
        L_0x0392:
            boolean r8 = r13.f332607c
            if (r8 == 0) goto L_0x0397
            float r10 = -r10
        L_0x0397:
            q1.j r8 = r5.f332642g
            i2.o r8 = r8.f329929x
            if (r8 != r3) goto L_0x039e
            goto L_0x039f
        L_0x039e:
            r15 = 0
        L_0x039f:
            if (r15 == 0) goto L_0x03a6
            if (r4 != 0) goto L_0x03a5
            if (r6 == 0) goto L_0x03a6
        L_0x03a5:
            float r10 = -r10
        L_0x03a6:
            boolean r3 = androidx.compose.p002ui.platform.C103662m.m137843l(r13, r10)
            if (r3 == 0) goto L_0x03c6
            T r0 = r1.f332591b
            fy3.p r0 = (fy3.C32227p) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Float r1 = java.lang.Float.valueOf(r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x03c6:
            u1.k r3 = r5.f332640e
            u1.z<u1.i> r4 = p246u1.C111092v.f332659n
            java.lang.Object r3 = p246u1.C111076l.m151465a(r3, r4)
            u1.i r3 = (p246u1.C111073i) r3
            if (r3 == 0) goto L_0x06e5
            if (r0 == 0) goto L_0x06e5
            float r0 = p1166z0.C112545k.m153756b(r11)
            if (r9 != 0) goto L_0x03dc
            if (r2 == 0) goto L_0x03dd
        L_0x03dc:
            float r0 = -r0
        L_0x03dd:
            boolean r2 = r3.f332607c
            if (r2 == 0) goto L_0x03e2
            float r0 = -r0
        L_0x03e2:
            boolean r2 = androidx.compose.p002ui.platform.C103662m.m137843l(r3, r0)
            if (r2 == 0) goto L_0x06e5
            T r1 = r1.f332591b
            fy3.p r1 = (fy3.C32227p) r1
            if (r1 == 0) goto L_0x06e5
            java.lang.Float r2 = java.lang.Float.valueOf(r14)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0402:
            u1.k r1 = r5.f332640e
            u1.z<java.util.List<u1.d>> r2 = p246u1.C111074j.f332623p
            java.lang.Object r1 = p246u1.C111076l.m151465a(r1, r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0410
            goto L_0x06e5
        L_0x0410:
            int r2 = r1.size()
            r3 = 0
        L_0x0415:
            if (r3 >= r2) goto L_0x06e5
            java.lang.Object r4 = r1.get(r3)
            u1.d r4 = (p246u1.C14098d) r4
            r4.getClass()
            boolean r4 = gy3.C87412m.m108589b(r9, r0)
            if (r4 != 0) goto L_0x0429
            int r3 = r3 + 1
            goto L_0x0415
        L_0x0429:
            throw r9
        L_0x042a:
            u1.k r0 = r5.f332640e
            u1.z<java.lang.Boolean> r1 = p246u1.C111092v.f332656k
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x06e5
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f306159e
            y0.i r0 = r0.getFocusManager()
            r1 = 0
            p869y0.C66478i.C66479a.m78437a(r0, r1, r15, r9)
            goto L_0x06e7
        L_0x0446:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332622o
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x0464:
            if (r2 == 0) goto L_0x046d
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r0 = r2.getInt(r0, r10)
            goto L_0x046e
        L_0x046d:
            r0 = -1
        L_0x046e:
            if (r2 == 0) goto L_0x0476
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r10 = r2.getInt(r1, r10)
        L_0x0476:
            r1 = 0
            boolean r15 = r4.mo144795x(r5, r0, r10, r1)
            if (r15 == 0) goto L_0x06e7
            int r0 = r5.f332641f
            int r9 = r4.mo144787p(r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            r8 = r4
            androidx.compose.p002ui.platform.C103662m.m137847s(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x06e7
        L_0x048f:
            u1.k r0 = r5.f332640e
            u1.z<u1.a<fy3.a<java.lang.Boolean>>> r1 = p246u1.C111074j.f332616i
            java.lang.Object r0 = p246u1.C111076l.m151465a(r0, r1)
            u1.a r0 = (p246u1.C111063a) r0
            if (r0 == 0) goto L_0x06e5
            T r0 = r0.f332591b
            fy3.a r0 = (fy3.C32224a) r0
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r15 = r0.booleanValue()
            goto L_0x06e7
        L_0x04ad:
            if (r2 == 0) goto L_0x06e5
            java.lang.String r1 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r1 = r2.getInt(r1)
            java.lang.String r3 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r2 = r2.getBoolean(r3)
            if (r0 != r11) goto L_0x04bf
            r0 = 1
            goto L_0x04c0
        L_0x04bf:
            r0 = 0
        L_0x04c0:
            int r3 = r5.f332641f
            java.lang.Integer r8 = r4.f306168q
            if (r8 != 0) goto L_0x04c7
            goto L_0x04cd
        L_0x04c7:
            int r8 = r8.intValue()
            if (r3 == r8) goto L_0x04d7
        L_0x04cd:
            r4.f306167p = r10
            int r3 = r5.f332641f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.f306168q = r3
        L_0x04d7:
            java.lang.String r3 = r4.mo144783h(r5)
            if (r3 == 0) goto L_0x04e6
            int r8 = r3.length()
            if (r8 != 0) goto L_0x04e4
            goto L_0x04e6
        L_0x04e4:
            r8 = 0
            goto L_0x04e7
        L_0x04e6:
            r8 = 1
        L_0x04e7:
            if (r8 == 0) goto L_0x04eb
            goto L_0x06e5
        L_0x04eb:
            java.lang.String r8 = r4.mo144783h(r5)
            if (r8 == 0) goto L_0x04fa
            int r13 = r8.length()
            if (r13 != 0) goto L_0x04f8
            goto L_0x04fa
        L_0x04f8:
            r13 = 0
            goto L_0x04fb
        L_0x04fa:
            r13 = 1
        L_0x04fb:
            if (r13 == 0) goto L_0x04ff
            goto L_0x0606
        L_0x04ff:
            java.lang.String r13 = "view.context.resources.configuration.locale"
            if (r1 == r15) goto L_0x05e1
            if (r1 == r6) goto L_0x05b3
            r6 = 4
            java.lang.String r13 = "text"
            if (r1 == r6) goto L_0x0532
            r14 = 8
            if (r1 == r14) goto L_0x0514
            r14 = 16
            if (r1 == r14) goto L_0x0532
            goto L_0x0606
        L_0x0514:
            androidx.compose.ui.platform.e r6 = androidx.compose.p002ui.platform.C103617e.f306071c
            if (r6 != 0) goto L_0x051f
            androidx.compose.ui.platform.e r6 = new androidx.compose.ui.platform.e
            r6.<init>(r9)
            androidx.compose.p002ui.platform.C103617e.f306071c = r6
        L_0x051f:
            androidx.compose.ui.platform.e r9 = androidx.compose.p002ui.platform.C103617e.f306071c
            if (r9 == 0) goto L_0x052a
            gy3.C87412m.m108594g(r8, r13)
            r9.f306049a = r8
            goto L_0x0606
        L_0x052a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator"
            r0.<init>(r1)
            throw r0
        L_0x0532:
            u1.k r14 = r5.f332640e
            u1.z<u1.a<fy3.l<java.util.List<w1.v>, java.lang.Boolean>>> r11 = p246u1.C111074j.f332608a
            boolean r14 = r14.mo162823i(r11)
            if (r14 != 0) goto L_0x053e
            goto L_0x0606
        L_0x053e:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            u1.k r12 = r5.f332640e
            java.lang.Object r11 = r12.mo162825k(r11)
            u1.a r11 = (p246u1.C111063a) r11
            T r11 = r11.f332591b
            fy3.l r11 = (fy3.C32226l) r11
            if (r11 == 0) goto L_0x0558
            java.lang.Object r11 = r11.invoke(r14)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L_0x0559
        L_0x0558:
            r11 = r9
        L_0x0559:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r11 = gy3.C87412m.m108589b(r11, r12)
            if (r11 == 0) goto L_0x0606
            r11 = 0
            java.lang.Object r9 = r14.get(r11)
            w1.v r9 = (p735w1.C111703v) r9
            java.lang.String r11 = "layoutResult"
            if (r1 != r6) goto L_0x058e
            androidx.compose.ui.platform.c r6 = androidx.compose.p002ui.platform.C103611c.f306061d
            if (r6 != 0) goto L_0x0577
            androidx.compose.ui.platform.c r6 = new androidx.compose.ui.platform.c
            r6.<init>()
            androidx.compose.p002ui.platform.C103611c.f306061d = r6
        L_0x0577:
            androidx.compose.ui.platform.c r6 = androidx.compose.p002ui.platform.C103611c.f306061d
            if (r6 == 0) goto L_0x0586
            gy3.C87412m.m108594g(r8, r13)
            gy3.C87412m.m108594g(r9, r11)
            r6.f306049a = r8
            r6.f306062c = r9
            goto L_0x05a9
        L_0x0586:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator"
            r0.<init>(r1)
            throw r0
        L_0x058e:
            androidx.compose.ui.platform.d r6 = androidx.compose.p002ui.platform.C103615d.f306067e
            if (r6 != 0) goto L_0x0599
            androidx.compose.ui.platform.d r6 = new androidx.compose.ui.platform.d
            r6.<init>()
            androidx.compose.p002ui.platform.C103615d.f306067e = r6
        L_0x0599:
            androidx.compose.ui.platform.d r6 = androidx.compose.p002ui.platform.C103615d.f306067e
            if (r6 == 0) goto L_0x05ab
            gy3.C87412m.m108594g(r8, r13)
            gy3.C87412m.m108594g(r9, r11)
            r6.f306049a = r8
            r6.f306068c = r9
            r6.f306069d = r5
        L_0x05a9:
            r9 = r6
            goto L_0x0606
        L_0x05ab:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"
            r0.<init>(r1)
            throw r0
        L_0x05b3:
            androidx.compose.ui.platform.AndroidComposeView r6 = r4.f306159e
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            gy3.C87412m.m108593f(r6, r13)
            androidx.compose.ui.platform.g r11 = androidx.compose.p002ui.platform.C103623g.f306078d
            if (r11 != 0) goto L_0x05d1
            androidx.compose.ui.platform.g r11 = new androidx.compose.ui.platform.g
            r11.<init>(r6, r9)
            androidx.compose.p002ui.platform.C103623g.f306078d = r11
        L_0x05d1:
            androidx.compose.ui.platform.g r9 = androidx.compose.p002ui.platform.C103623g.f306078d
            if (r9 == 0) goto L_0x05d9
            r9.mo144722e(r8)
            goto L_0x0606
        L_0x05d9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator"
            r0.<init>(r1)
            throw r0
        L_0x05e1:
            androidx.compose.ui.platform.AndroidComposeView r6 = r4.f306159e
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            gy3.C87412m.m108593f(r6, r13)
            androidx.compose.ui.platform.b r11 = androidx.compose.p002ui.platform.C103607b.f306053d
            if (r11 != 0) goto L_0x05ff
            androidx.compose.ui.platform.b r11 = new androidx.compose.ui.platform.b
            r11.<init>(r6, r9)
            androidx.compose.p002ui.platform.C103607b.f306053d = r11
        L_0x05ff:
            androidx.compose.ui.platform.b r9 = androidx.compose.p002ui.platform.C103607b.f306053d
            if (r9 == 0) goto L_0x0683
            r9.mo144711e(r8)
        L_0x0606:
            if (r9 != 0) goto L_0x060a
            goto L_0x06e5
        L_0x060a:
            int r6 = r4.mo144779e(r5)
            if (r6 != r10) goto L_0x0619
            if (r0 == 0) goto L_0x0614
            r3 = 0
            goto L_0x061a
        L_0x0614:
            int r3 = r3.length()
            goto L_0x061a
        L_0x0619:
            r3 = r6
        L_0x061a:
            if (r0 == 0) goto L_0x0621
            int[] r3 = r9.mo144709a(r3)
            goto L_0x0625
        L_0x0621:
            int[] r3 = r9.mo144710b(r3)
        L_0x0625:
            if (r3 != 0) goto L_0x0629
            goto L_0x06e5
        L_0x0629:
            r6 = 0
            r20 = r3[r6]
            r21 = r3[r15]
            if (r2 == 0) goto L_0x065e
            u1.k r2 = r5.f332640e
            u1.z<java.util.List<java.lang.String>> r3 = p246u1.C111092v.f332646a
            boolean r2 = r2.mo162823i(r3)
            if (r2 != 0) goto L_0x0646
            u1.k r2 = r5.f332640e
            u1.z<w1.a> r3 = p246u1.C111092v.f332664s
            boolean r2 = r2.mo162823i(r3)
            if (r2 == 0) goto L_0x0646
            r8 = 1
            goto L_0x0647
        L_0x0646:
            r8 = 0
        L_0x0647:
            if (r8 == 0) goto L_0x065e
            int r2 = r4.mo144780f(r5)
            if (r2 != r10) goto L_0x0656
            if (r0 == 0) goto L_0x0654
            r2 = r20
            goto L_0x0656
        L_0x0654:
            r2 = r21
        L_0x0656:
            if (r0 == 0) goto L_0x065b
            r3 = r21
            goto L_0x0666
        L_0x065b:
            r3 = r20
            goto L_0x0666
        L_0x065e:
            if (r0 == 0) goto L_0x0663
            r2 = r21
            goto L_0x0665
        L_0x0663:
            r2 = r20
        L_0x0665:
            r3 = r2
        L_0x0666:
            if (r0 == 0) goto L_0x066b
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x066d
        L_0x066b:
            r18 = 512(0x200, float:7.175E-43)
        L_0x066d:
            androidx.compose.ui.platform.m$$f r0 = new androidx.compose.ui.platform.m$$f
            long r22 = android.os.SystemClock.uptimeMillis()
            r16 = r0
            r17 = r5
            r19 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r4.f306172u = r0
            r4.mo144795x(r5, r2, r3, r15)
            goto L_0x06e7
        L_0x0683:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator"
            r0.<init>(r1)
            throw r0
        L_0x068b:
            r6 = 0
            int r0 = r4.f306164j
            if (r0 != r1) goto L_0x0692
            r0 = 1
            goto L_0x0693
        L_0x0692:
            r0 = 0
        L_0x0693:
            if (r0 == 0) goto L_0x06e6
            r4.f306164j = r9
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f306159e
            r0.invalidate()
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            r5 = 0
            r6 = 12
            r8 = 0
            r0 = r4
            r1 = r25
            r4 = r5
            r5 = r6
            r6 = r8
            androidx.compose.p002ui.platform.C103662m.m137847s(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x06e7
        L_0x06ad:
            r6 = 0
            boolean r0 = r4.mo144785j()
            if (r0 != 0) goto L_0x06b5
            goto L_0x06e6
        L_0x06b5:
            int r0 = r4.f306164j
            if (r0 != r1) goto L_0x06bb
            r2 = 1
            goto L_0x06bc
        L_0x06bb:
            r2 = 0
        L_0x06bc:
            if (r2 != 0) goto L_0x06e6
            if (r0 == r9) goto L_0x06cc
            r10 = 65536(0x10000, float:9.18355E-41)
            r11 = 0
            r12 = 0
            r13 = 12
            r14 = 0
            r8 = r4
            r9 = r0
            androidx.compose.p002ui.platform.C103662m.m137847s(r8, r9, r10, r11, r12, r13, r14)
        L_0x06cc:
            r4.f306164j = r1
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f306159e
            r0.invalidate()
            r2 = 32768(0x8000, float:4.5918E-41)
            r3 = 0
            r5 = 0
            r6 = 12
            r8 = 0
            r0 = r4
            r1 = r25
            r4 = r5
            r5 = r6
            r6 = r8
            androidx.compose.p002ui.platform.C103662m.m137847s(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x06e7
        L_0x06e5:
            r6 = 0
        L_0x06e6:
            r15 = 0
        L_0x06e7:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.m$$e.performAction(int, int, android.os.Bundle):boolean");
    }
}
