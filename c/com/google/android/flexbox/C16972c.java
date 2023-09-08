package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
public class C16972c {

    /* renamed from: a */
    public final C16970a f45961a;

    /* renamed from: b */
    public boolean[] f45962b;

    /* renamed from: c */
    public int[] f45963c;

    /* renamed from: d */
    public long[] f45964d;

    /* renamed from: e */
    public long[] f45965e;

    /* renamed from: com.google.android.flexbox.c$a */
    public static class C16973a {

        /* renamed from: a */
        public List<C16971b> f45966a;

        /* renamed from: b */
        public int f45967b;
    }

    /* renamed from: com.google.android.flexbox.c$b */
    public static class C16974b implements Comparable<C16974b> {

        /* renamed from: d */
        public int f45968d;

        /* renamed from: e */
        public int f45969e;

        public int compareTo(Object obj) {
            C16974b bVar = (C16974b) obj;
            int i = this.f45969e;
            int i2 = bVar.f45969e;
            return i != i2 ? i - i2 : this.f45968d - bVar.f45968d;
        }

        public String toString() {
            return "Order{order=" + this.f45969e + ", index=" + this.f45968d + '}';
        }
    }

    public C16972c(C16970a aVar) {
        this.f45961a = aVar;
    }

    /* renamed from: a */
    public final void mo18599a(List<C16971b> list, C16971b bVar, int i, int i2) {
        bVar.f45955m = i2;
        this.f45961a.mo18506e(bVar);
        bVar.f45958p = i;
        list.add(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024e, code lost:
        if (r2 < (r8 + r14)) goto L_0x0250;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0323  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03d9  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x040a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18600b(com.google.android.flexbox.C16972c.C16973a r28, int r29, int r30, int r31, int r32, int r33, java.util.List<com.google.android.flexbox.C16971b> r34) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r33
            com.google.android.flexbox.a r5 = r0.f45961a
            boolean r5 = r5.mo18539r()
            int r6 = android.view.View.MeasureSpec.getMode(r29)
            int r7 = android.view.View.MeasureSpec.getSize(r29)
            if (r34 != 0) goto L_0x0020
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            goto L_0x0022
        L_0x0020:
            r8 = r34
        L_0x0022:
            r1.f45966a = r8
            r9 = -1
            if (r4 != r9) goto L_0x0029
            r12 = 1
            goto L_0x002a
        L_0x0029:
            r12 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x0033
            com.google.android.flexbox.a r13 = r0.f45961a
            int r13 = r13.getPaddingStart()
            goto L_0x0039
        L_0x0033:
            com.google.android.flexbox.a r13 = r0.f45961a
            int r13 = r13.getPaddingTop()
        L_0x0039:
            if (r5 == 0) goto L_0x0042
            com.google.android.flexbox.a r14 = r0.f45961a
            int r14 = r14.getPaddingEnd()
            goto L_0x0048
        L_0x0042:
            com.google.android.flexbox.a r14 = r0.f45961a
            int r14 = r14.getPaddingBottom()
        L_0x0048:
            if (r5 == 0) goto L_0x0051
            com.google.android.flexbox.a r15 = r0.f45961a
            int r15 = r15.getPaddingTop()
            goto L_0x0057
        L_0x0051:
            com.google.android.flexbox.a r15 = r0.f45961a
            int r15 = r15.getPaddingStart()
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            com.google.android.flexbox.a r11 = r0.f45961a
            int r11 = r11.getPaddingBottom()
            goto L_0x0066
        L_0x0060:
            com.google.android.flexbox.a r11 = r0.f45961a
            int r11 = r11.getPaddingEnd()
        L_0x0066:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r10 = r32
            r9.f45957o = r10
            int r13 = r13 + r14
            r9.f45947e = r13
            com.google.android.flexbox.a r14 = r0.f45961a
            int r14 = r14.getFlexItemCount()
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r32 = r12
            r1 = 0
            r4 = 0
            r12 = 0
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0081:
            if (r10 >= r14) goto L_0x042a
            r19 = r12
            com.google.android.flexbox.a r12 = r0.f45961a
            android.view.View r12 = r12.mo18530l(r10)
            if (r12 != 0) goto L_0x00a5
            int r12 = r14 + -1
            if (r10 != r12) goto L_0x009c
            int r12 = r9.f45950h
            r20 = r1
            int r1 = r9.f45951i
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x009e
            r1 = 1
            goto L_0x009f
        L_0x009c:
            r20 = r1
        L_0x009e:
            r1 = 0
        L_0x009f:
            if (r1 == 0) goto L_0x00c9
            r0.mo18599a(r8, r9, r10, r4)
            goto L_0x00c9
        L_0x00a5:
            r20 = r1
            int r1 = r12.getVisibility()
            r3 = 8
            if (r1 != r3) goto L_0x00de
            int r1 = r9.f45951i
            r3 = 1
            int r1 = r1 + r3
            r9.f45951i = r1
            int r12 = r9.f45950h
            int r12 = r12 + r3
            r9.f45950h = r12
            int r3 = r14 + -1
            if (r10 != r3) goto L_0x00c3
            int r12 = r12 - r1
            if (r12 == 0) goto L_0x00c3
            r1 = 1
            goto L_0x00c4
        L_0x00c3:
            r1 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
            r0.mo18599a(r8, r9, r10, r4)
        L_0x00c9:
            r1 = r33
            r24 = r6
            r2 = r7
            r26 = r11
            r21 = r14
            r25 = r20
            r12 = -1
            r6 = r30
            r14 = r31
            r11 = r8
            r8 = r32
            goto L_0x0415
        L_0x00de:
            boolean r1 = r12 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x0120
            r1 = r12
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            com.google.android.flexbox.FlexItem r3 = (com.google.android.flexbox.FlexItem) r3
            r21 = r14
            int r14 = r3.getMinWidth()
            r22 = r8
            int r8 = r3.getMinHeight()
            android.graphics.drawable.Drawable r1 = androidx.core.widget.C92046c.m115680a(r1)
            if (r1 != 0) goto L_0x0100
            r23 = 0
            goto L_0x0104
        L_0x0100:
            int r23 = r1.getMinimumWidth()
        L_0x0104:
            if (r1 != 0) goto L_0x010a
            r1 = -1
            r24 = 0
            goto L_0x0111
        L_0x010a:
            int r1 = r1.getMinimumHeight()
            r24 = r1
            r1 = -1
        L_0x0111:
            if (r14 != r1) goto L_0x0115
            r14 = r23
        L_0x0115:
            r3.mo18499y0(r14)
            if (r8 != r1) goto L_0x011c
            r8 = r24
        L_0x011c:
            r3.mo18498h0(r8)
            goto L_0x0124
        L_0x0120:
            r22 = r8
            r21 = r14
        L_0x0124:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            com.google.android.flexbox.FlexItem r1 = (com.google.android.flexbox.FlexItem) r1
            int r3 = r1.getAlignSelf()
            r8 = 4
            if (r3 != r8) goto L_0x013c
            java.util.List<java.lang.Integer> r3 = r9.f45956n
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r8)
        L_0x013c:
            if (r5 == 0) goto L_0x0143
            int r3 = r1.getWidth()
            goto L_0x0147
        L_0x0143:
            int r3 = r1.getHeight()
        L_0x0147:
            float r8 = r1.mo18482J1()
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0160
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x0160
            float r3 = (float) r7
            float r8 = r1.mo18482J1()
            float r3 = r3 * r8
            int r3 = java.lang.Math.round(r3)
        L_0x0160:
            if (r5 == 0) goto L_0x0199
            com.google.android.flexbox.a r8 = r0.f45961a
            int r14 = r1.getMarginLeft()
            int r14 = r14 + r13
            int r23 = r1.getMarginRight()
            int r14 = r14 + r23
            int r3 = r8.mo18531m(r2, r14, r3)
            com.google.android.flexbox.a r8 = r0.f45961a
            int r14 = r15 + r11
            int r23 = r1.getMarginTop()
            int r14 = r14 + r23
            int r23 = r1.getMarginBottom()
            int r14 = r14 + r23
            int r14 = r14 + r4
            r23 = r7
            int r7 = r1.getHeight()
            r24 = r6
            r6 = r30
            int r7 = r8.mo18528j(r6, r14, r7)
            r12.measure(r3, r7)
            r0.mo18620v(r10, r3, r7, r12)
            goto L_0x01cd
        L_0x0199:
            r24 = r6
            r23 = r7
            r6 = r30
            com.google.android.flexbox.a r7 = r0.f45961a
            int r8 = r15 + r11
            int r14 = r1.getMarginLeft()
            int r8 = r8 + r14
            int r14 = r1.getMarginRight()
            int r8 = r8 + r14
            int r8 = r8 + r4
            int r14 = r1.getWidth()
            int r7 = r7.mo18531m(r6, r8, r14)
            com.google.android.flexbox.a r8 = r0.f45961a
            int r14 = r1.getMarginTop()
            int r14 = r14 + r13
            int r25 = r1.getMarginBottom()
            int r14 = r14 + r25
            int r3 = r8.mo18528j(r2, r14, r3)
            r12.measure(r7, r3)
            r0.mo18620v(r10, r7, r3, r12)
        L_0x01cd:
            com.google.android.flexbox.a r7 = r0.f45961a
            r7.mo18538q(r10, r12)
            r0.mo18601c(r12, r10)
            int r7 = r12.getMeasuredState()
            r8 = r20
            int r7 = android.view.View.combineMeasuredStates(r8, r7)
            int r8 = r9.f45947e
            if (r5 == 0) goto L_0x01e8
            int r14 = r12.getMeasuredWidth()
            goto L_0x01ec
        L_0x01e8:
            int r14 = r12.getMeasuredHeight()
        L_0x01ec:
            if (r5 == 0) goto L_0x01f3
            int r20 = r1.getMarginLeft()
            goto L_0x01f7
        L_0x01f3:
            int r20 = r1.getMarginTop()
        L_0x01f7:
            int r14 = r14 + r20
            if (r5 == 0) goto L_0x0200
            int r20 = r1.getMarginRight()
            goto L_0x0204
        L_0x0200:
            int r20 = r1.getMarginBottom()
        L_0x0204:
            int r14 = r14 + r20
            int r20 = r22.size()
            com.google.android.flexbox.a r2 = r0.f45961a
            int r2 = r2.getFlexWrap()
            if (r2 != 0) goto L_0x0213
            goto L_0x0224
        L_0x0213:
            boolean r2 = r1.mo18483M1()
            if (r2 == 0) goto L_0x0222
            r25 = r7
            r26 = r11
            r7 = r19
            r2 = r23
            goto L_0x0250
        L_0x0222:
            if (r24 != 0) goto L_0x0229
        L_0x0224:
            r25 = r7
            r26 = r11
            goto L_0x023b
        L_0x0229:
            com.google.android.flexbox.a r2 = r0.f45961a
            int r2 = r2.getMaxLine()
            r25 = r7
            r7 = -1
            r26 = r11
            if (r2 == r7) goto L_0x0240
            r7 = 1
            int r11 = r20 + 1
            if (r2 > r11) goto L_0x0240
        L_0x023b:
            r7 = r19
            r2 = r23
            goto L_0x0252
        L_0x0240:
            com.google.android.flexbox.a r2 = r0.f45961a
            r7 = r19
            int r2 = r2.mo18502b(r12, r10, r7)
            if (r2 <= 0) goto L_0x024b
            int r14 = r14 + r2
        L_0x024b:
            int r8 = r8 + r14
            r2 = r23
            if (r2 >= r8) goto L_0x0252
        L_0x0250:
            r8 = 1
            goto L_0x0253
        L_0x0252:
            r8 = 0
        L_0x0253:
            if (r8 == 0) goto L_0x02dc
            int r7 = r9.f45950h
            int r8 = r9.f45951i
            int r7 = r7 - r8
            if (r7 <= 0) goto L_0x026d
            if (r10 <= 0) goto L_0x0263
            int r7 = r10 + -1
            r11 = r22
            goto L_0x0266
        L_0x0263:
            r11 = r22
            r7 = 0
        L_0x0266:
            r0.mo18599a(r11, r9, r7, r4)
            int r7 = r9.f45949g
            int r4 = r4 + r7
            goto L_0x026f
        L_0x026d:
            r11 = r22
        L_0x026f:
            if (r5 == 0) goto L_0x029f
            int r7 = r1.getHeight()
            r8 = -1
            if (r7 != r8) goto L_0x02cc
            com.google.android.flexbox.a r7 = r0.f45961a
            int r8 = r7.getPaddingTop()
            com.google.android.flexbox.a r9 = r0.f45961a
            int r9 = r9.getPaddingBottom()
            int r8 = r8 + r9
            int r9 = r1.getMarginTop()
            int r8 = r8 + r9
            int r9 = r1.getMarginBottom()
            int r8 = r8 + r9
            int r8 = r8 + r4
            int r9 = r1.getHeight()
            int r7 = r7.mo18528j(r6, r8, r9)
            r12.measure(r3, r7)
            r0.mo18601c(r12, r10)
            goto L_0x02cc
        L_0x029f:
            int r7 = r1.getWidth()
            r8 = -1
            if (r7 != r8) goto L_0x02cc
            com.google.android.flexbox.a r7 = r0.f45961a
            int r8 = r7.getPaddingLeft()
            com.google.android.flexbox.a r9 = r0.f45961a
            int r9 = r9.getPaddingRight()
            int r8 = r8 + r9
            int r9 = r1.getMarginLeft()
            int r8 = r8 + r9
            int r9 = r1.getMarginRight()
            int r8 = r8 + r9
            int r8 = r8 + r4
            int r9 = r1.getWidth()
            int r7 = r7.mo18531m(r6, r8, r9)
            r12.measure(r7, r3)
            r0.mo18601c(r12, r10)
        L_0x02cc:
            com.google.android.flexbox.b r9 = new com.google.android.flexbox.b
            r9.<init>()
            r3 = 1
            r9.f45950h = r3
            r9.f45947e = r13
            r9.f45957o = r10
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x02e8
        L_0x02dc:
            r11 = r22
            r3 = 1
            int r8 = r9.f45950h
            int r8 = r8 + r3
            r9.f45950h = r8
            int r7 = r7 + 1
            r8 = r18
        L_0x02e8:
            boolean r14 = r9.f45959q
            float r16 = r1.getFlexGrow()
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x02f7
            r16 = 1
            goto L_0x02f9
        L_0x02f7:
            r16 = 0
        L_0x02f9:
            r14 = r14 | r16
            r9.f45959q = r14
            boolean r14 = r9.f45960r
            float r16 = r1.getFlexShrink()
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x030a
            r16 = 1
            goto L_0x030c
        L_0x030a:
            r16 = 0
        L_0x030c:
            r14 = r14 | r16
            r9.f45960r = r14
            int[] r14 = r0.f45963c
            if (r14 == 0) goto L_0x031a
            int r16 = r11.size()
            r14[r10] = r16
        L_0x031a:
            int r14 = r9.f45947e
            if (r5 == 0) goto L_0x0323
            int r16 = r12.getMeasuredWidth()
            goto L_0x0327
        L_0x0323:
            int r16 = r12.getMeasuredHeight()
        L_0x0327:
            if (r5 == 0) goto L_0x032e
            int r18 = r1.getMarginLeft()
            goto L_0x0332
        L_0x032e:
            int r18 = r1.getMarginTop()
        L_0x0332:
            int r16 = r16 + r18
            if (r5 == 0) goto L_0x033b
            int r18 = r1.getMarginRight()
            goto L_0x033f
        L_0x033b:
            int r18 = r1.getMarginBottom()
        L_0x033f:
            int r16 = r16 + r18
            int r14 = r14 + r16
            r9.f45947e = r14
            float r14 = r9.f45952j
            float r16 = r1.getFlexGrow()
            float r14 = r14 + r16
            r9.f45952j = r14
            float r14 = r9.f45953k
            float r16 = r1.getFlexShrink()
            float r14 = r14 + r16
            r9.f45953k = r14
            com.google.android.flexbox.a r14 = r0.f45961a
            r14.mo18508g(r12, r10, r7, r9)
            if (r5 == 0) goto L_0x0365
            int r14 = r12.getMeasuredHeight()
            goto L_0x0369
        L_0x0365:
            int r14 = r12.getMeasuredWidth()
        L_0x0369:
            if (r5 == 0) goto L_0x0370
            int r16 = r1.getMarginTop()
            goto L_0x0374
        L_0x0370:
            int r16 = r1.getMarginLeft()
        L_0x0374:
            int r14 = r14 + r16
            if (r5 == 0) goto L_0x037d
            int r16 = r1.getMarginBottom()
            goto L_0x0381
        L_0x037d:
            int r16 = r1.getMarginRight()
        L_0x0381:
            int r14 = r14 + r16
            com.google.android.flexbox.a r3 = r0.f45961a
            int r3 = r3.mo18500a(r12)
            int r14 = r14 + r3
            int r3 = java.lang.Math.max(r8, r14)
            int r8 = r9.f45949g
            int r8 = java.lang.Math.max(r8, r3)
            r9.f45949g = r8
            if (r5 == 0) goto L_0x03c9
            com.google.android.flexbox.a r8 = r0.f45961a
            int r8 = r8.getFlexWrap()
            r14 = 2
            if (r8 == r14) goto L_0x03b3
            int r8 = r9.f45954l
            int r12 = r12.getBaseline()
            int r1 = r1.getMarginTop()
            int r12 = r12 + r1
            int r1 = java.lang.Math.max(r8, r12)
            r9.f45954l = r1
            goto L_0x03c9
        L_0x03b3:
            int r8 = r9.f45954l
            int r14 = r12.getMeasuredHeight()
            int r12 = r12.getBaseline()
            int r14 = r14 - r12
            int r1 = r1.getMarginBottom()
            int r14 = r14 + r1
            int r1 = java.lang.Math.max(r8, r14)
            r9.f45954l = r1
        L_0x03c9:
            int r14 = r21 + -1
            if (r10 != r14) goto L_0x03d6
            int r1 = r9.f45950h
            int r8 = r9.f45951i
            int r1 = r1 - r8
            if (r1 == 0) goto L_0x03d6
            r1 = 1
            goto L_0x03d7
        L_0x03d6:
            r1 = 0
        L_0x03d7:
            if (r1 == 0) goto L_0x03df
            r0.mo18599a(r11, r9, r10, r4)
            int r1 = r9.f45949g
            int r4 = r4 + r1
        L_0x03df:
            r1 = r33
            r12 = -1
            if (r1 == r12) goto L_0x0404
            int r8 = r11.size()
            if (r8 <= 0) goto L_0x0404
            int r8 = r11.size()
            int r8 = r8 + r12
            java.lang.Object r8 = r11.get(r8)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.C16971b) r8
            int r8 = r8.f45958p
            if (r8 < r1) goto L_0x0404
            if (r10 < r1) goto L_0x0404
            if (r32 != 0) goto L_0x0404
            int r4 = r9.f45949g
            int r4 = -r4
            r14 = r31
            r8 = 1
            goto L_0x0408
        L_0x0404:
            r14 = r31
            r8 = r32
        L_0x0408:
            if (r4 <= r14) goto L_0x0411
            if (r8 == 0) goto L_0x0411
            r2 = r28
            r1 = r25
            goto L_0x042d
        L_0x0411:
            r18 = r3
            r19 = r7
        L_0x0415:
            int r10 = r10 + 1
            r7 = r2
            r3 = r6
            r32 = r8
            r8 = r11
            r12 = r19
            r14 = r21
            r6 = r24
            r1 = r25
            r11 = r26
            r2 = r29
            goto L_0x0081
        L_0x042a:
            r8 = r1
            r2 = r28
        L_0x042d:
            r2.f45967b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C16972c.mo18600b(com.google.android.flexbox.c$a, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18601c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.getMinWidth()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.getMinWidth()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.getMaxWidth()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.getMaxWidth()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.getMinHeight()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.getMinHeight()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.getMaxHeight()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.getMaxHeight()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.mo18620v(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f45961a
            r0.mo18538q(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C16972c.mo18601c(android.view.View, int):void");
    }

    /* renamed from: d */
    public void mo18602d(List<C16971b> list, int i) {
        int i2 = this.f45963c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.f45963c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f45964d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* renamed from: e */
    public final List<C16971b> mo18603e(List<C16971b> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C16971b bVar = new C16971b();
        bVar.f45949g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(bVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List<C16974b> mo18604f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C16974b bVar = new C16974b();
            bVar.f45969e = ((FlexItem) this.f45961a.mo18527i(i2).getLayoutParams()).getOrder();
            bVar.f45968d = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    /* renamed from: g */
    public void mo18605g(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.f45961a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<C16971b> flexLinesInternal = this.f45961a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.f45961a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f45949g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.f45961a.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C16971b bVar = new C16971b();
                    bVar.f45949g = i7;
                    flexLinesInternal.add(0, bVar);
                } else if (alignContent == 2) {
                    this.f45961a.setFlexLines(mo18603e(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i5) {
                            float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size3 = flexLinesInternal.size();
                            float f = 0.0f;
                            while (i6 < size3) {
                                C16971b bVar2 = flexLinesInternal.get(i6);
                                float f2 = ((float) bVar2.f45949g) + size2;
                                if (i6 == flexLinesInternal.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                bVar2.f45949g = round;
                                i6++;
                            }
                        }
                    } else if (sumOfCrossSize >= i5) {
                        this.f45961a.setFlexLines(mo18603e(flexLinesInternal, i5, sumOfCrossSize));
                    } else {
                        int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        C16971b bVar3 = new C16971b();
                        bVar3.f45949g = size4;
                        for (C16971b add : flexLinesInternal) {
                            arrayList.add(bVar3);
                            arrayList.add(add);
                            arrayList.add(bVar3);
                        }
                        this.f45961a.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i5) {
                    float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i6 < size6) {
                        arrayList2.add(flexLinesInternal.get(i6));
                        if (i6 != flexLinesInternal.size() - 1) {
                            C16971b bVar4 = new C16971b();
                            if (i6 == flexLinesInternal.size() - 2) {
                                bVar4.f45949g = Math.round(f3 + size5);
                                f3 = 0.0f;
                            } else {
                                bVar4.f45949g = Math.round(size5);
                            }
                            int i8 = bVar4.f45949g;
                            f3 += size5 - ((float) i8);
                            if (f3 > 1.0f) {
                                bVar4.f45949g = i8 + 1;
                                f3 -= 1.0f;
                            } else if (f3 < -1.0f) {
                                bVar4.f45949g = i8 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(bVar4);
                        }
                        i6++;
                    }
                    this.f45961a.setFlexLines(arrayList2);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo18606h(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int flexItemCount = this.f45961a.getFlexItemCount();
        boolean[] zArr = this.f45962b;
        int i7 = 0;
        if (zArr == null) {
            this.f45962b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f45962b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 < this.f45961a.getFlexItemCount()) {
            int flexDirection = this.f45961a.getFlexDirection();
            int flexDirection2 = this.f45961a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.f45961a.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                i6 = this.f45961a.getPaddingLeft();
                i4 = this.f45961a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.f45961a.getLargestMainSize();
                }
                i6 = this.f45961a.getPaddingTop();
                i4 = this.f45961a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i8 = i6 + i4;
            int[] iArr = this.f45963c;
            if (iArr != null) {
                i7 = iArr[i3];
            }
            List<C16971b> flexLinesInternal = this.f45961a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i7 < size2) {
                C16971b bVar = flexLinesInternal.get(i7);
                int i9 = bVar.f45947e;
                if (i9 < i5 && bVar.f45959q) {
                    mo18610l(i, i2, bVar, i5, i8, false);
                } else if (i9 > i5 && bVar.f45960r) {
                    mo18615q(i, i2, bVar, i5, i8, false);
                }
                i7++;
            }
        }
    }

    /* renamed from: i */
    public void mo18607i(int i) {
        int[] iArr = this.f45963c;
        if (iArr == null) {
            this.f45963c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f45963c = Arrays.copyOf(this.f45963c, Math.max(iArr.length * 2, i));
        }
    }

    /* renamed from: j */
    public void mo18608j(int i) {
        long[] jArr = this.f45964d;
        if (jArr == null) {
            this.f45964d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f45964d = Arrays.copyOf(this.f45964d, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: k */
    public void mo18609k(int i) {
        long[] jArr = this.f45965e;
        if (jArr == null) {
            this.f45965e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f45965e = Arrays.copyOf(this.f45965e, Math.max(jArr.length * 2, i));
        }
    }

    /* renamed from: l */
    public final void mo18610l(int i, int i2, C16971b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        double d2;
        C16971b bVar2 = bVar;
        int i8 = i3;
        float f = bVar2.f45952j;
        float f2 = 0.0f;
        if (f > 0.0f && i8 >= (i5 = bVar2.f45947e)) {
            float f3 = ((float) (i8 - i5)) / f;
            bVar2.f45947e = i4 + bVar2.f45948f;
            if (!z) {
                bVar2.f45949g = Integer.MIN_VALUE;
            }
            int i9 = 0;
            boolean z2 = false;
            int i15 = 0;
            float f4 = 0.0f;
            while (i9 < bVar2.f45950h) {
                int i16 = bVar2.f45957o + i9;
                View l = this.f45961a.mo18530l(i16);
                if (l == null || l.getVisibility() == 8) {
                    int i17 = i2;
                    i6 = i5;
                } else {
                    FlexItem flexItem = (FlexItem) l.getLayoutParams();
                    int flexDirection = this.f45961a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i5;
                        int i18 = i;
                        int measuredWidth = l.getMeasuredWidth();
                        long[] jArr = this.f45965e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i16];
                        }
                        int measuredHeight = l.getMeasuredHeight();
                        long[] jArr2 = this.f45965e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i16] >> 32);
                        }
                        if (this.f45962b[i16] || flexItem.getFlexGrow() <= 0.0f) {
                            int i19 = i2;
                        } else {
                            float flexGrow = ((float) measuredWidth) + (flexItem.getFlexGrow() * f3);
                            if (i9 == bVar2.f45950h - 1) {
                                flexGrow += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(flexGrow);
                            if (round > flexItem.getMaxWidth()) {
                                round = flexItem.getMaxWidth();
                                this.f45962b[i16] = true;
                                bVar2.f45952j -= flexItem.getFlexGrow();
                                z2 = true;
                            } else {
                                f4 += flexGrow - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    d = d3 + 1.0d;
                                }
                                f4 = (float) d;
                            }
                            int m = mo18611m(i2, flexItem, bVar2.f45955m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            l.measure(makeMeasureSpec, m);
                            int measuredWidth2 = l.getMeasuredWidth();
                            int measuredHeight2 = l.getMeasuredHeight();
                            mo18620v(i16, makeMeasureSpec, m, l);
                            this.f45961a.mo18538q(i16, l);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i15, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.f45961a.mo18500a(l));
                        bVar2.f45947e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                        i7 = max;
                    } else {
                        int measuredHeight3 = l.getMeasuredHeight();
                        long[] jArr3 = this.f45965e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i16] >> 32);
                        }
                        int measuredWidth3 = l.getMeasuredWidth();
                        long[] jArr4 = this.f45965e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i16];
                        }
                        if (this.f45962b[i16] || flexItem.getFlexGrow() <= f2) {
                            i6 = i5;
                            int i25 = i;
                        } else {
                            float flexGrow2 = ((float) measuredHeight3) + (flexItem.getFlexGrow() * f3);
                            if (i9 == bVar2.f45950h - 1) {
                                flexGrow2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(flexGrow2);
                            if (round2 > flexItem.getMaxHeight()) {
                                round2 = flexItem.getMaxHeight();
                                this.f45962b[i16] = true;
                                bVar2.f45952j -= flexItem.getFlexGrow();
                                i6 = i5;
                                z2 = true;
                            } else {
                                f4 += flexGrow2 - ((float) round2);
                                i6 = i5;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    d2 = d4 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int n = mo18612n(i, flexItem, bVar2.f45955m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            l.measure(n, makeMeasureSpec2);
                            measuredWidth3 = l.getMeasuredWidth();
                            int measuredHeight4 = l.getMeasuredHeight();
                            mo18620v(i16, n, makeMeasureSpec2, l);
                            this.f45961a.mo18538q(i16, l);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i15, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.f45961a.mo18500a(l));
                        bVar2.f45947e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                        int i26 = i2;
                    }
                    bVar2.f45949g = Math.max(bVar2.f45949g, i7);
                    i15 = i7;
                }
                i9++;
                i5 = i6;
                f2 = 0.0f;
            }
            int i27 = i2;
            int i28 = i5;
            if (z2 && i28 != bVar2.f45947e) {
                mo18610l(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: m */
    public final int mo18611m(int i, FlexItem flexItem, int i2) {
        C16970a aVar = this.f45961a;
        int j = aVar.mo18528j(i, aVar.getPaddingTop() + this.f45961a.getPaddingBottom() + flexItem.getMarginTop() + flexItem.getMarginBottom() + i2, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(j);
        return size > flexItem.getMaxHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxHeight(), View.MeasureSpec.getMode(j)) : size < flexItem.getMinHeight() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinHeight(), View.MeasureSpec.getMode(j)) : j;
    }

    /* renamed from: n */
    public final int mo18612n(int i, FlexItem flexItem, int i2) {
        C16970a aVar = this.f45961a;
        int m = aVar.mo18531m(i, aVar.getPaddingLeft() + this.f45961a.getPaddingRight() + flexItem.getMarginLeft() + flexItem.getMarginRight() + i2, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(m);
        return size > flexItem.getMaxWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMaxWidth(), View.MeasureSpec.getMode(m)) : size < flexItem.getMinWidth() ? View.MeasureSpec.makeMeasureSpec(flexItem.getMinWidth(), View.MeasureSpec.getMode(m)) : m;
    }

    /* renamed from: o */
    public void mo18613o(View view, C16971b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f45961a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = bVar.f45949g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.getMarginTop()) - flexItem.getMarginBottom()) / 2;
                    if (this.f45961a.getFlexWrap() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (this.f45961a.getFlexWrap() != 2) {
                    int max = Math.max(bVar.f45954l - view.getBaseline(), flexItem.getMarginTop());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f45954l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.getMarginBottom());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f45961a.getFlexWrap() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.getMarginBottom(), i3, i8 - flexItem.getMarginBottom());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.getMarginTop());
                return;
            }
        }
        if (this.f45961a.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.getMarginTop(), i3, i4 + flexItem.getMarginTop());
        } else {
            view.layout(i, i2 - flexItem.getMarginBottom(), i3, i4 - flexItem.getMarginBottom());
        }
    }

    /* renamed from: p */
    public void mo18614p(View view, C16971b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f45961a.getAlignItems();
        if (flexItem.getAlignSelf() != -1) {
            alignItems = flexItem.getAlignSelf();
        }
        int i5 = bVar.f45949g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.getMarginRight(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.getMarginLeft(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.getMarginLeft(), i2, i3 + flexItem.getMarginLeft(), i4);
        } else {
            view.layout(i - flexItem.getMarginRight(), i2, i3 - flexItem.getMarginRight(), i4);
        }
    }

    /* renamed from: q */
    public final void mo18615q(int i, int i2, C16971b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        C16971b bVar2 = bVar;
        int i8 = i3;
        int i9 = bVar2.f45947e;
        float f = bVar2.f45953k;
        float f2 = 0.0f;
        if (f > 0.0f && i8 <= i9) {
            float f3 = ((float) (i9 - i8)) / f;
            bVar2.f45947e = i4 + bVar2.f45948f;
            if (!z) {
                bVar2.f45949g = Integer.MIN_VALUE;
            }
            int i15 = 0;
            boolean z2 = false;
            int i16 = 0;
            float f4 = 0.0f;
            while (i15 < bVar2.f45950h) {
                int i17 = bVar2.f45957o + i15;
                View l = this.f45961a.mo18530l(i17);
                if (l == null || l.getVisibility() == 8) {
                    int i18 = i2;
                    i6 = i9;
                    i5 = i15;
                } else {
                    FlexItem flexItem = (FlexItem) l.getLayoutParams();
                    int flexDirection = this.f45961a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i9;
                        i5 = i15;
                        int i19 = i;
                        int measuredWidth = l.getMeasuredWidth();
                        long[] jArr = this.f45965e;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i17];
                        }
                        int measuredHeight = l.getMeasuredHeight();
                        long[] jArr2 = this.f45965e;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i17] >> 32);
                        }
                        if (this.f45962b[i17] || flexItem.getFlexShrink() <= 0.0f) {
                            int i25 = i2;
                        } else {
                            float flexShrink = ((float) measuredWidth) - (flexItem.getFlexShrink() * f3);
                            if (i5 == bVar2.f45950h - 1) {
                                flexShrink += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(flexShrink);
                            if (round < flexItem.getMinWidth()) {
                                round = flexItem.getMinWidth();
                                this.f45962b[i17] = true;
                                bVar2.f45953k -= flexItem.getFlexShrink();
                                z2 = true;
                            } else {
                                f4 += flexShrink - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int m = mo18611m(i2, flexItem, bVar2.f45955m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            l.measure(makeMeasureSpec, m);
                            int measuredWidth2 = l.getMeasuredWidth();
                            int measuredHeight2 = l.getMeasuredHeight();
                            mo18620v(i17, makeMeasureSpec, m, l);
                            this.f45961a.mo18538q(i17, l);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i16, measuredHeight + flexItem.getMarginTop() + flexItem.getMarginBottom() + this.f45961a.mo18500a(l));
                        bVar2.f45947e += measuredWidth + flexItem.getMarginLeft() + flexItem.getMarginRight();
                        i7 = max;
                    } else {
                        int measuredHeight3 = l.getMeasuredHeight();
                        long[] jArr3 = this.f45965e;
                        if (jArr3 != null) {
                            measuredHeight3 = (int) (jArr3[i17] >> 32);
                        }
                        int measuredWidth3 = l.getMeasuredWidth();
                        long[] jArr4 = this.f45965e;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i17];
                        }
                        if (this.f45962b[i17] || flexItem.getFlexShrink() <= f2) {
                            i6 = i9;
                            i5 = i15;
                            int i26 = i;
                        } else {
                            float flexShrink2 = ((float) measuredHeight3) - (flexItem.getFlexShrink() * f3);
                            if (i15 == bVar2.f45950h - 1) {
                                flexShrink2 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(flexShrink2);
                            if (round2 < flexItem.getMinHeight()) {
                                round2 = flexItem.getMinHeight();
                                this.f45962b[i17] = true;
                                bVar2.f45953k -= flexItem.getFlexShrink();
                                i6 = i9;
                                i5 = i15;
                                z2 = true;
                            } else {
                                f4 += flexShrink2 - ((float) round2);
                                i6 = i9;
                                i5 = i15;
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int n = mo18612n(i, flexItem, bVar2.f45955m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            l.measure(n, makeMeasureSpec2);
                            measuredWidth3 = l.getMeasuredWidth();
                            int measuredHeight4 = l.getMeasuredHeight();
                            mo18620v(i17, n, makeMeasureSpec2, l);
                            this.f45961a.mo18538q(i17, l);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i16, measuredWidth3 + flexItem.getMarginLeft() + flexItem.getMarginRight() + this.f45961a.mo18500a(l));
                        bVar2.f45947e += measuredHeight3 + flexItem.getMarginTop() + flexItem.getMarginBottom();
                        int i27 = i2;
                    }
                    bVar2.f45949g = Math.max(bVar2.f45949g, i7);
                    i16 = i7;
                }
                i15 = i5 + 1;
                i9 = i6;
                f2 = 0.0f;
            }
            int i28 = i2;
            int i29 = i9;
            if (z2 && i29 != bVar2.f45947e) {
                mo18615q(i, i2, bVar, i3, i4, true);
            }
        }
    }

    /* renamed from: r */
    public final int[] mo18616r(int i, List<C16974b> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C16974b next : list) {
            int i3 = next.f45968d;
            iArr[i2] = i3;
            sparseIntArray.append(i3, next.f45969e);
            i2++;
        }
        return iArr;
    }

    /* renamed from: s */
    public final void mo18617s(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.getMarginLeft()) - flexItem.getMarginRight()) - this.f45961a.mo18500a(view), flexItem.getMinWidth()), flexItem.getMaxWidth());
        long[] jArr = this.f45965e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        mo18620v(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f45961a.mo18538q(i2, view);
    }

    /* renamed from: t */
    public final void mo18618t(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.getMarginTop()) - flexItem.getMarginBottom()) - this.f45961a.mo18500a(view), flexItem.getMinHeight()), flexItem.getMaxHeight());
        long[] jArr = this.f45965e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        mo18620v(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f45961a.mo18538q(i2, view);
    }

    /* renamed from: u */
    public void mo18619u(int i) {
        View l;
        int i2 = i;
        if (i2 < this.f45961a.getFlexItemCount()) {
            int flexDirection = this.f45961a.getFlexDirection();
            if (this.f45961a.getAlignItems() == 4) {
                int[] iArr = this.f45963c;
                List<C16971b> flexLinesInternal = this.f45961a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    C16971b bVar = flexLinesInternal.get(i3);
                    int i4 = bVar.f45950h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = bVar.f45957o + i5;
                        if (!(i5 >= this.f45961a.getFlexItemCount() || (l = this.f45961a.mo18530l(i6)) == null || l.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) l.getLayoutParams();
                            if (flexItem.getAlignSelf() == -1 || flexItem.getAlignSelf() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    mo18618t(l, bVar.f45949g, i6);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    mo18617s(l, bVar.f45949g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C16971b next : this.f45961a.getFlexLinesInternal()) {
                Iterator it = ((ArrayList) next.f45956n).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View l2 = this.f45961a.mo18530l(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            mo18618t(l2, next.f45949g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            mo18617s(l2, next.f45949g, num.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo18620v(int i, int i2, int i3, View view) {
        long[] jArr = this.f45964d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & Util.MAX_32BIT_VALUE) | (((long) i3) << 32);
        }
        long[] jArr2 = this.f45965e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & Util.MAX_32BIT_VALUE) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
