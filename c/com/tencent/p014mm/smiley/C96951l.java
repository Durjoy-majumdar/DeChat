package com.tencent.p014mm.smiley;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: com.tencent.mm.smiley.l */
public final class C96951l {

    /* renamed from: a */
    public final C96976z f284023a;

    /* renamed from: b */
    public C96976z f284024b;

    /* renamed from: c */
    public int f284025c = 1;

    /* renamed from: d */
    public int f284026d;

    /* renamed from: e */
    public int f284027e;

    /* renamed from: f */
    public C96976z f284028f;

    /* renamed from: com.tencent.mm.smiley.l$a */
    public static final class C96952a {
        public C96952a(C8480h hVar) {
        }
    }

    static {
        new C96952a((C8480h) null);
    }

    public C96951l(C96976z zVar) {
        C87412m.m108594g(zVar, "rootNode");
        this.f284023a = zVar;
        this.f284024b = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x012e, code lost:
        if (r9 != false) goto L_0x0130;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0122  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo135537a(java.lang.CharSequence r9, int r10, int r11, com.tencent.p014mm.smiley.C96975y r12) {
        /*
            r8 = this;
            java.lang.String r0 = "processor"
            gy3.C87412m.m108594g(r12, r0)
            if (r9 == 0) goto L_0x013e
            int r0 = r9.length()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0017
            goto L_0x013e
        L_0x0017:
            if (r10 >= 0) goto L_0x001a
            r10 = 0
        L_0x001a:
            if (r11 < 0) goto L_0x0023
            int r0 = r9.length()
            if (r11 > r0) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            int r11 = r9.length()
        L_0x0027:
            if (r11 > r10) goto L_0x002a
            return
        L_0x002a:
            int r0 = java.lang.Character.codePointAt(r9, r10)
        L_0x002e:
            r3 = r0
            r0 = r10
        L_0x0030:
            r4 = 65039(0xfe0f, float:9.1139E-41)
            r5 = 2
            if (r10 >= r11) goto L_0x00f7
            if (r3 != r4) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            if (r4 == 0) goto L_0x0049
            int r4 = java.lang.Character.charCount(r3)
            int r10 = r10 + r4
            if (r10 >= r11) goto L_0x0030
            int r3 = java.lang.Character.codePointAt(r9, r10)
            goto L_0x0030
        L_0x0049:
            com.tencent.mm.smiley.z r4 = r8.f284024b
            com.tencent.mm.smiley.z r4 = r4.get(r3)
            int r6 = r8.f284025c
            r7 = 3
            if (r6 != r5) goto L_0x0092
            if (r4 == 0) goto L_0x005f
            r8.f284024b = r4
            int r4 = r8.f284027e
            int r4 = r4 + r2
            r8.f284027e = r4
        L_0x005d:
            r4 = 2
            goto L_0x00b8
        L_0x005f:
            r4 = 65038(0xfe0e, float:9.1138E-41)
            if (r3 != r4) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x0072
            r8.f284025c = r2
            com.tencent.mm.smiley.z r4 = r8.f284023a
            r8.f284024b = r4
            r8.f284027e = r1
            goto L_0x0090
        L_0x0072:
            com.tencent.mm.smiley.z r4 = r8.f284024b
            com.tencent.mm.smiley.x r4 = r4.getData()
            if (r4 == 0) goto L_0x0088
            com.tencent.mm.smiley.z r4 = r8.f284024b
            r8.f284028f = r4
            r8.f284025c = r2
            com.tencent.mm.smiley.z r4 = r8.f284023a
            r8.f284024b = r4
            r8.f284027e = r1
            r4 = 3
            goto L_0x00b8
        L_0x0088:
            r8.f284025c = r2
            com.tencent.mm.smiley.z r4 = r8.f284023a
            r8.f284024b = r4
            r8.f284027e = r1
        L_0x0090:
            r4 = 1
            goto L_0x00b8
        L_0x0092:
            if (r6 != r2) goto L_0x00a6
            if (r4 != 0) goto L_0x009f
            r8.f284025c = r2
            com.tencent.mm.smiley.z r4 = r8.f284023a
            r8.f284024b = r4
            r8.f284027e = r1
            goto L_0x0090
        L_0x009f:
            r8.f284025c = r5
            r8.f284024b = r4
            r8.f284027e = r2
            goto L_0x005d
        L_0x00a6:
            if (r4 != 0) goto L_0x00b1
            r8.f284025c = r2
            com.tencent.mm.smiley.z r4 = r8.f284023a
            r8.f284024b = r4
            r8.f284027e = r1
            goto L_0x0090
        L_0x00b1:
            r8.f284025c = r5
            r8.f284024b = r4
            r8.f284027e = r2
            goto L_0x005d
        L_0x00b8:
            r8.f284026d = r3
            if (r4 == r2) goto L_0x00e5
            if (r4 == r5) goto L_0x00d8
            if (r4 == r7) goto L_0x00c2
            goto L_0x0030
        L_0x00c2:
            com.tencent.mm.smiley.z r4 = r8.f284028f
            if (r4 == 0) goto L_0x00cb
            com.tencent.mm.smiley.x r4 = r4.getData()
            goto L_0x00cc
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            if (r4 == 0) goto L_0x00d5
            boolean r0 = r12.mo135526a(r4, r0, r10)
            if (r0 == 0) goto L_0x00d5
            return
        L_0x00d5:
            r0 = r3
            goto L_0x002e
        L_0x00d8:
            int r4 = java.lang.Character.charCount(r3)
            int r10 = r10 + r4
            if (r10 >= r11) goto L_0x0030
            int r3 = java.lang.Character.codePointAt(r9, r10)
            goto L_0x0030
        L_0x00e5:
            int r10 = java.lang.Character.codePointAt(r9, r0)
            int r10 = java.lang.Character.charCount(r10)
            int r0 = r0 + r10
            if (r0 >= r11) goto L_0x00f4
            int r3 = java.lang.Character.codePointAt(r9, r0)
        L_0x00f4:
            r10 = r0
            goto L_0x0030
        L_0x00f7:
            int r9 = r8.f284025c
            if (r9 != r5) goto L_0x0131
            com.tencent.mm.smiley.z r9 = r8.f284024b
            com.tencent.mm.smiley.x r9 = r9.getData()
            if (r9 == 0) goto L_0x0131
            int r9 = r8.f284027e
            if (r9 > r2) goto L_0x0130
            com.tencent.mm.smiley.z r9 = r8.f284024b
            com.tencent.mm.smiley.x r9 = r9.getData()
            if (r9 == 0) goto L_0x011e
            int[] r9 = r9.mo135527a()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0118
            r9 = 1
            goto L_0x0119
        L_0x0118:
            r9 = 0
        L_0x0119:
            r9 = r9 ^ r2
            if (r9 == 0) goto L_0x011e
            r9 = 1
            goto L_0x011f
        L_0x011e:
            r9 = 0
        L_0x011f:
            if (r9 == 0) goto L_0x0122
            goto L_0x012b
        L_0x0122:
            int r9 = r8.f284026d
            if (r9 != r4) goto L_0x0128
            r9 = 1
            goto L_0x0129
        L_0x0128:
            r9 = 0
        L_0x0129:
            if (r9 == 0) goto L_0x012d
        L_0x012b:
            r9 = 1
            goto L_0x012e
        L_0x012d:
            r9 = 0
        L_0x012e:
            if (r9 == 0) goto L_0x0131
        L_0x0130:
            r1 = 1
        L_0x0131:
            if (r1 == 0) goto L_0x013e
            com.tencent.mm.smiley.z r9 = r8.f284024b
            com.tencent.mm.smiley.x r9 = r9.getData()
            if (r9 == 0) goto L_0x013e
            r12.mo135526a(r9, r0, r10)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96951l.mo135537a(java.lang.CharSequence, int, int, com.tencent.mm.smiley.y):void");
    }
}
