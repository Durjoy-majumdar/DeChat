package p906j4;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p1050v2.C111331h;
import p1057w2.C111712c;

/* renamed from: j4.d */
public class C108558d {

    /* renamed from: j4.d$a */
    public static class C108559a implements TypeEvaluator<C111712c.C111713a[]> {

        /* renamed from: a */
        public C111712c.C111713a[] f324959a;

        public Object evaluate(float f, Object obj, Object obj2) {
            C111712c.C111713a[] aVarArr = (C111712c.C111713a[]) obj;
            C111712c.C111713a[] aVarArr2 = (C111712c.C111713a[]) obj2;
            if (C111712c.m152278a(aVarArr, aVarArr2)) {
                C111712c.C111713a[] aVarArr3 = this.f324959a;
                if (aVarArr3 == null || !C111712c.m152278a(aVarArr3, aVarArr)) {
                    this.f324959a = C111712c.m152282e(aVarArr);
                }
                for (int i = 0; i < aVarArr.length; i++) {
                    C111712c.C111713a aVar = this.f324959a[i];
                    C111712c.C111713a aVar2 = aVarArr[i];
                    C111712c.C111713a aVar3 = aVarArr2[i];
                    aVar.getClass();
                    aVar.f334392a = aVar2.f334392a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = aVar2.f334393b;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        aVar.f334393b[i2] = (fArr[i2] * (1.0f - f)) + (aVar3.f334393b[i2] * f);
                        i2++;
                    }
                }
                return this.f324959a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0311  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m147147a(android.content.Context r29, android.content.res.Resources r30, android.content.res.Resources.Theme r31, org.xmlpull.v1.XmlPullParser r32, android.util.AttributeSet r33, android.animation.AnimatorSet r34, int r35, float r36) {
        /*
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r34
            int r12 = r32.getDepth()
            r0 = 0
            r14 = 0
        L_0x000e:
            int r1 = r32.next()
            r2 = 3
            r15 = 0
            if (r1 != r2) goto L_0x001c
            int r3 = r32.getDepth()
            if (r3 <= r12) goto L_0x033a
        L_0x001c:
            r3 = 1
            if (r1 == r3) goto L_0x033a
            r4 = 2
            if (r1 == r4) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r32.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0045
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r7
            r5 = r36
            r6 = r32
            m147151e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x0045:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0061
            r4 = 0
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            r5 = r36
            r6 = r32
            android.animation.ValueAnimator r7 = m147151e(r0, r1, r2, r3, r4, r5, r6)
        L_0x005e:
            r0 = r7
            goto L_0x030b
        L_0x0061:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0098
            android.animation.AnimatorSet r16 = new android.animation.AnimatorSet
            r16.<init>()
            int[] r0 = p906j4.C108552a.f324945h
            r7 = r33
            android.content.res.TypedArray r6 = p1050v2.C111331h.m151821h(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r17 = p1050v2.C111331h.m151817d(r6, r10, r0, r15, r15)
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r16
            r18 = r6
            r6 = r17
            r7 = r36
            m147147a(r0, r1, r2, r3, r4, r5, r6, r7)
            r18.recycle()
            r0 = r16
            goto L_0x030b
        L_0x0098:
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x031f
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r32)
            r6 = 0
        L_0x00a5:
            int r7 = r32.getEventType()
            if (r7 == r2) goto L_0x02e3
            if (r7 == r3) goto L_0x02e3
            if (r7 == r4) goto L_0x00b3
            r32.next()
            goto L_0x00a5
        L_0x00b3:
            java.lang.String r7 = r32.getName()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x02cb
            int[] r7 = p906j4.C108552a.f324946i
            android.content.res.TypedArray r7 = p1050v2.C111331h.m151821h(r8, r9, r1, r7)
            java.lang.String r13 = "propertyName"
            java.lang.String r13 = p1050v2.C111331h.m151819f(r7, r10, r13, r2)
            java.lang.String r15 = "valueType"
            r3 = 4
            int r15 = p1050v2.C111331h.m151817d(r7, r10, r15, r4, r3)
            r4 = r15
            r20 = 0
        L_0x00d3:
            int r3 = r32.next()
            r22 = r1
            if (r3 == r2) goto L_0x01c2
            r1 = 1
            if (r3 == r1) goto L_0x01c2
            java.lang.String r1 = r32.getName()
            java.lang.String r3 = "keyframe"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x01b1
            java.lang.String r1 = "value"
            r3 = 4
            if (r4 != r3) goto L_0x011f
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r32)
            int[] r4 = p906j4.C108552a.f324947j
            android.content.res.TypedArray r3 = p1050v2.C111331h.m151821h(r8, r9, r3, r4)
            boolean r4 = p1050v2.C111331h.m151820g(r10, r1)
            if (r4 != 0) goto L_0x0101
            r4 = 0
            goto L_0x0108
        L_0x0101:
            r4 = 0
            android.util.TypedValue r24 = r3.peekValue(r4)
            r4 = r24
        L_0x0108:
            if (r4 == 0) goto L_0x010d
            r24 = 1
            goto L_0x010f
        L_0x010d:
            r24 = 0
        L_0x010f:
            if (r24 == 0) goto L_0x011b
            int r4 = r4.type
            boolean r4 = m147150d(r4)
            if (r4 == 0) goto L_0x011b
            r4 = 3
            goto L_0x011c
        L_0x011b:
            r4 = 0
        L_0x011c:
            r3.recycle()
        L_0x011f:
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r32)
            int[] r2 = p906j4.C108552a.f324947j
            android.content.res.TypedArray r2 = p1050v2.C111331h.m151821h(r8, r9, r3, r2)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r25 = r5
            java.lang.String r5 = "fraction"
            r8 = 3
            float r3 = p1050v2.C111331h.m151816c(r2, r10, r5, r8, r3)
            boolean r5 = p1050v2.C111331h.m151820g(r10, r1)
            if (r5 != 0) goto L_0x013c
            r8 = 0
            goto L_0x0141
        L_0x013c:
            r5 = 0
            android.util.TypedValue r8 = r2.peekValue(r5)
        L_0x0141:
            if (r8 == 0) goto L_0x0145
            r5 = 1
            goto L_0x0146
        L_0x0145:
            r5 = 0
        L_0x0146:
            r9 = 4
            if (r4 != r9) goto L_0x0157
            if (r5 == 0) goto L_0x0155
            int r8 = r8.type
            boolean r8 = m147150d(r8)
            if (r8 == 0) goto L_0x0155
            r8 = 3
            goto L_0x0158
        L_0x0155:
            r8 = 0
            goto L_0x0158
        L_0x0157:
            r8 = r4
        L_0x0158:
            if (r5 == 0) goto L_0x017a
            if (r8 == 0) goto L_0x016f
            r5 = 1
            if (r8 == r5) goto L_0x0165
            r5 = 3
            if (r8 == r5) goto L_0x0165
            r1 = 0
            r5 = 0
            goto L_0x0186
        L_0x0165:
            r5 = 0
            int r1 = p1050v2.C111331h.m151817d(r2, r10, r1, r5, r5)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r3, r1)
            goto L_0x0186
        L_0x016f:
            r5 = 0
            r8 = 0
            float r1 = p1050v2.C111331h.m151816c(r2, r10, r1, r5, r8)
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r3, r1)
            goto L_0x0186
        L_0x017a:
            r5 = 0
            if (r8 != 0) goto L_0x0182
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r3)
            goto L_0x0186
        L_0x0182:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r3)
        L_0x0186:
            java.lang.String r3 = "interpolator"
            r8 = 1
            int r3 = p1050v2.C111331h.m151818e(r2, r10, r3, r8, r5)
            r5 = r29
            if (r3 <= 0) goto L_0x0198
            android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r5, r3)
            r1.setInterpolator(r3)
        L_0x0198:
            r2.recycle()
            r2 = r20
            if (r1 == 0) goto L_0x01ad
            if (r2 != 0) goto L_0x01a8
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            r2 = r20
        L_0x01a8:
            r2.add(r1)
            r20 = r2
        L_0x01ad:
            r32.next()
            goto L_0x01b7
        L_0x01b1:
            r25 = r5
            r2 = r20
            r5 = r29
        L_0x01b7:
            r8 = r30
            r9 = r31
            r1 = r22
            r5 = r25
            r2 = 3
            goto L_0x00d3
        L_0x01c2:
            r25 = r5
            r2 = r20
            r5 = r29
            if (r2 == 0) goto L_0x02ae
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x02ae
            r3 = 0
            java.lang.Object r8 = r2.get(r3)
            android.animation.Keyframe r8 = (android.animation.Keyframe) r8
            int r3 = r1 + -1
            java.lang.Object r3 = r2.get(r3)
            android.animation.Keyframe r3 = (android.animation.Keyframe) r3
            float r9 = r3.getFraction()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r20 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r20 >= 0) goto L_0x0200
            r20 = 0
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f3
            r3.setFraction(r5)
            goto L_0x0200
        L_0x01f3:
            int r9 = r2.size()
            android.animation.Keyframe r3 = m147148b(r3, r5)
            r2.add(r9, r3)
            int r1 = r1 + 1
        L_0x0200:
            float r3 = r8.getFraction()
            r9 = 0
            int r20 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r20 == 0) goto L_0x021b
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0211
            r8.setFraction(r9)
            goto L_0x021b
        L_0x0211:
            android.animation.Keyframe r3 = m147148b(r8, r9)
            r8 = 0
            r2.add(r8, r3)
            int r1 = r1 + 1
        L_0x021b:
            android.animation.Keyframe[] r3 = new android.animation.Keyframe[r1]
            r2.toArray(r3)
            r2 = 0
        L_0x0221:
            if (r2 >= r1) goto L_0x029f
            r8 = r3[r2]
            float r9 = r8.getFraction()
            r5 = 0
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x0292
            if (r2 != 0) goto L_0x0234
            r8.setFraction(r5)
            goto L_0x0292
        L_0x0234:
            int r5 = r1 + -1
            if (r2 != r5) goto L_0x023e
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.setFraction(r9)
            goto L_0x0292
        L_0x023e:
            r9 = 1065353216(0x3f800000, float:1.0)
            int r8 = r2 + 1
            r9 = r2
        L_0x0243:
            if (r8 >= r5) goto L_0x025a
            r21 = r3[r8]
            float r21 = r21.getFraction()
            r23 = 0
            int r21 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r21 < 0) goto L_0x0252
            goto L_0x025c
        L_0x0252:
            int r9 = r8 + 1
            r28 = r9
            r9 = r8
            r8 = r28
            goto L_0x0243
        L_0x025a:
            r23 = 0
        L_0x025c:
            int r5 = r9 + 1
            r5 = r3[r5]
            float r5 = r5.getFraction()
            int r8 = r2 + -1
            r8 = r3[r8]
            float r8 = r8.getFraction()
            float r5 = r5 - r8
            int r8 = r9 - r2
            r19 = 2
            int r8 = r8 + 2
            float r8 = (float) r8
            float r5 = r5 / r8
            r8 = r2
        L_0x0276:
            r21 = r1
            if (r8 > r9) goto L_0x0298
            r1 = r3[r8]
            int r26 = r8 + -1
            r26 = r3[r26]
            float r26 = r26.getFraction()
            r27 = r9
            float r9 = r26 + r5
            r1.setFraction(r9)
            int r8 = r8 + 1
            r1 = r21
            r9 = r27
            goto L_0x0276
        L_0x0292:
            r21 = r1
            r19 = 2
            r23 = 0
        L_0x0298:
            int r2 = r2 + 1
            r1 = r21
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0221
        L_0x029f:
            r19 = 2
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r3)
            r2 = 3
            if (r4 != r2) goto L_0x02b2
            j4.e r3 = p906j4.C76386e.f223669a
            r1.setEvaluator(r3)
            goto L_0x02b2
        L_0x02ae:
            r2 = 3
            r19 = 2
            r1 = 0
        L_0x02b2:
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x02ba
            android.animation.PropertyValuesHolder r1 = m147149c(r7, r15, r3, r4, r13)
        L_0x02ba:
            if (r1 == 0) goto L_0x02c7
            if (r6 != 0) goto L_0x02c4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = r5
        L_0x02c4:
            r6.add(r1)
        L_0x02c7:
            r7.recycle()
            goto L_0x02d3
        L_0x02cb:
            r22 = r1
            r25 = r5
            r3 = 0
            r4 = 1
            r19 = 2
        L_0x02d3:
            r32.next()
            r8 = r30
            r9 = r31
            r1 = r22
            r5 = r25
            r3 = 1
            r4 = 2
            r15 = 0
            goto L_0x00a5
        L_0x02e3:
            r3 = 0
            r4 = 1
            if (r6 == 0) goto L_0x02fb
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
            r15 = 0
        L_0x02ee:
            if (r15 >= r1) goto L_0x02fc
            java.lang.Object r3 = r6.get(r15)
            android.animation.PropertyValuesHolder r3 = (android.animation.PropertyValuesHolder) r3
            r2[r15] = r3
            int r15 = r15 + 1
            goto L_0x02ee
        L_0x02fb:
            r2 = 0
        L_0x02fc:
            if (r2 == 0) goto L_0x030a
            if (r0 == 0) goto L_0x030a
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x030a
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x030a:
            r15 = 1
        L_0x030b:
            if (r11 == 0) goto L_0x0319
            if (r15 != 0) goto L_0x0319
            if (r14 != 0) goto L_0x0316
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0316:
            r14.add(r0)
        L_0x0319:
            r8 = r30
            r9 = r31
            goto L_0x000e
        L_0x031f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r32.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x033a:
            r3 = 0
            if (r11 == 0) goto L_0x0365
            if (r14 == 0) goto L_0x0365
            int r1 = r14.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r14.iterator()
            r15 = 0
        L_0x034a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x035c
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r15 + 1
            r1[r15] = r3
            r15 = r4
            goto L_0x034a
        L_0x035c:
            if (r35 != 0) goto L_0x0362
            r11.playTogether(r1)
            goto L_0x0365
        L_0x0362:
            r11.playSequentially(r1)
        L_0x0365:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p906j4.C108558d.m147147a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m147148b(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder m147149c(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m147150d(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m147150d(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            w2.c$a[] r13 = p1057w2.C111712c.m152280c(r12)
            w2.c$a[] r14 = p1057w2.C111712c.m152280c(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0165
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            j4.d$a r0 = new j4.d$a
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = p1057w2.C111712c.m152278a(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0165
        L_0x0098:
            if (r14 == 0) goto L_0x0165
            j4.d$a r11 = new j4.d$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0165
        L_0x00a9:
            if (r12 != r7) goto L_0x00ae
            j4.e r12 = p906j4.C76386e.f223669a
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00e1
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d8
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x00f4
        L_0x00d8:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00f4
        L_0x00e1:
            if (r4 != r7) goto L_0x00e8
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ec
        L_0x00e8:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ec:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        L_0x00f4:
            r8 = r11
            goto L_0x015e
        L_0x00f7:
            if (r3 == 0) goto L_0x013d
            if (r0 != r7) goto L_0x0101
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0110
        L_0x0101:
            boolean r0 = m147150d(r0)
            if (r0 == 0) goto L_0x010c
            int r13 = r11.getColor(r13, r2)
            goto L_0x0110
        L_0x010c:
            int r13 = r11.getInt(r13, r2)
        L_0x0110:
            if (r5 == 0) goto L_0x0134
            if (r4 != r7) goto L_0x011a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0129
        L_0x011a:
            boolean r0 = m147150d(r4)
            if (r0 == 0) goto L_0x0125
            int r11 = r11.getColor(r14, r2)
            goto L_0x0129
        L_0x0125:
            int r11 = r11.getInt(r14, r2)
        L_0x0129:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015e
        L_0x0134:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015e
        L_0x013d:
            if (r5 == 0) goto L_0x015e
            if (r4 != r7) goto L_0x0147
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0156
        L_0x0147:
            boolean r13 = m147150d(r4)
            if (r13 == 0) goto L_0x0152
            int r11 = r11.getColor(r14, r2)
            goto L_0x0156
        L_0x0152:
            int r11 = r11.getInt(r14, r2)
        L_0x0156:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015e:
            if (r8 == 0) goto L_0x0165
            if (r12 == 0) goto L_0x0165
            r8.setEvaluator(r12)
        L_0x0165:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p906j4.C108558d.m147149c(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: d */
    public static boolean m147150d(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m147151e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray h = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324944g);
        TypedArray h2 = C111331h.m151821h(resources2, theme2, attributeSet2, C108552a.f324948k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long d = (long) C111331h.m151817d(h, xmlPullParser2, "duration", 1, 300);
        int i = 0;
        long d2 = (long) C111331h.m151817d(h, xmlPullParser2, "startOffset", 2, 0);
        int d3 = C111331h.m151817d(h, xmlPullParser2, "valueType", 7, 4);
        if (C111331h.m151820g(xmlPullParser2, "valueFrom") && C111331h.m151820g(xmlPullParser2, "valueTo")) {
            if (d3 == 4) {
                TypedValue peekValue = h.peekValue(5);
                boolean z = peekValue != null;
                int i2 = z ? peekValue.type : 0;
                TypedValue peekValue2 = h.peekValue(6);
                boolean z2 = peekValue2 != null;
                d3 = ((!z || !m147150d(i2)) && (!z2 || !m147150d(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder c = m147149c(h, d3, 5, 6, "");
            if (c != null) {
                valueAnimator4.setValues(new PropertyValuesHolder[]{c});
            }
        }
        valueAnimator4.setDuration(d);
        valueAnimator4.setStartDelay(d2);
        valueAnimator4.setRepeatCount(C111331h.m151817d(h, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(C111331h.m151817d(h, xmlPullParser2, "repeatMode", 4, 1));
        if (h2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String f2 = C111331h.m151819f(h2, xmlPullParser2, "pathData", 1);
            if (f2 != null) {
                String f3 = C111331h.m151819f(h2, xmlPullParser2, "propertyXName", 2);
                String f4 = C111331h.m151819f(h2, xmlPullParser2, "propertyYName", 3);
                if (f3 == null && f4 == null) {
                    throw new InflateException(h2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d4 = C111712c.m152281d(f2);
                float f5 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(d4, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f6 = 0.0f;
                do {
                    f6 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f6));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d4, false);
                int min = Math.min(100, ((int) (f6 / f5)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f7 = f6 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = h;
                int i3 = 0;
                float f8 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i >= min) {
                        break;
                    }
                    int i4 = min;
                    pathMeasure2.getPosTan(f8 - ((Float) arrayList.get(i3)).floatValue(), fArr3, (float[]) null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f8 += f7;
                    int i5 = i3 + 1;
                    if (i5 < arrayList.size() && f8 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i3 = i5;
                    }
                    i++;
                    min = i4;
                }
                PropertyValuesHolder ofFloat = f3 != null ? PropertyValuesHolder.ofFloat(f3, fArr) : null;
                if (f4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(f4, fArr2);
                }
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = h;
                objectAnimator.setPropertyName(C111331h.m151819f(h2, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = h;
        }
        TypedArray typedArray2 = typedArray;
        int e = C111331h.m151818e(typedArray2, xmlPullParser2, "interpolator", i, i);
        if (e > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, e));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (h2 != null) {
            h2.recycle();
        }
        return valueAnimator3;
    }
}
