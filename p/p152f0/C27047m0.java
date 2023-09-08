package p152f0;

import fy3.C32226l;
import p904j1.C76379b;

/* renamed from: f0.m0 */
public final class C27047m0 implements C107361l0 {

    /* renamed from: a */
    public final /* synthetic */ C32226l<C76379b, Boolean> f75219a;

    public C27047m0(C32226l<? super C76379b, Boolean> lVar) {
        this.f75219a = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010c, code lost:
        if (p904j1.C108522a.m147064a(r4, p152f0.C27045a1.f75170p) != false) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p152f0.C27046k0 mo54536a(android.view.KeyEvent r9) {
        /*
            r8 = this;
            f0.k0 r0 = p152f0.C27046k0.CUT
            f0.k0 r1 = p152f0.C27046k0.PASTE
            java.lang.String r2 = "event"
            gy3.C87412m.m108594g(r9, r2)
            fy3.l<j1.b, java.lang.Boolean> r2 = r8.f75219a
            j1.b r3 = new j1.b
            r3.<init>(r9)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L_0x0035
            boolean r2 = r9.isShiftPressed()
            if (r2 == 0) goto L_0x0035
            long r0 = p904j1.C108523c.m147065a(r9)
            int r9 = p152f0.C27045a1.f75177w
            long r4 = p152f0.C27045a1.f75160f
            boolean r9 = p904j1.C108522a.m147064a(r0, r4)
            if (r9 == 0) goto L_0x0097
            f0.k0 r0 = p152f0.C27046k0.REDO
            goto L_0x01b0
        L_0x0035:
            fy3.l<j1.b, java.lang.Boolean> r2 = r8.f75219a
            j1.b r4 = new j1.b
            r4.<init>(r9)
            java.lang.Object r2 = r2.invoke(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0091
            long r4 = p904j1.C108523c.m147065a(r9)
            int r9 = p152f0.C27045a1.f75177w
            long r6 = p152f0.C27045a1.f75156b
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0058
            r9 = 1
            goto L_0x005e
        L_0x0058:
            long r6 = p152f0.C27045a1.f75170p
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
        L_0x005e:
            if (r9 == 0) goto L_0x0064
            f0.k0 r0 = p152f0.C27046k0.COPY
            goto L_0x01b0
        L_0x0064:
            long r6 = p152f0.C27045a1.f75158d
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x006f
        L_0x006c:
            r0 = r1
            goto L_0x01b0
        L_0x006f:
            long r1 = p152f0.C27045a1.f75159e
            boolean r9 = p904j1.C108522a.m147064a(r4, r1)
            if (r9 == 0) goto L_0x0079
            goto L_0x01b0
        L_0x0079:
            long r0 = p152f0.C27045a1.f75155a
            boolean r9 = p904j1.C108522a.m147064a(r4, r0)
            if (r9 == 0) goto L_0x0085
            f0.k0 r0 = p152f0.C27046k0.SELECT_ALL
            goto L_0x01b0
        L_0x0085:
            long r0 = p152f0.C27045a1.f75160f
            boolean r9 = p904j1.C108522a.m147064a(r4, r0)
            if (r9 == 0) goto L_0x0097
            f0.k0 r0 = p152f0.C27046k0.UNDO
            goto L_0x01b0
        L_0x0091:
            boolean r2 = r9.isCtrlPressed()
            if (r2 == 0) goto L_0x009a
        L_0x0097:
            r0 = r3
            goto L_0x01b0
        L_0x009a:
            boolean r2 = r9.isShiftPressed()
            if (r2 == 0) goto L_0x0110
            long r4 = p904j1.C108523c.m147065a(r9)
            int r9 = p152f0.C27045a1.f75177w
            long r6 = p152f0.C27045a1.f75162h
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00b2
            f0.k0 r0 = p152f0.C27046k0.SELECT_LEFT_CHAR
            goto L_0x01b0
        L_0x00b2:
            long r6 = p152f0.C27045a1.f75163i
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00be
            f0.k0 r0 = p152f0.C27046k0.SELECT_RIGHT_CHAR
            goto L_0x01b0
        L_0x00be:
            long r6 = p152f0.C27045a1.f75164j
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00ca
            f0.k0 r0 = p152f0.C27046k0.SELECT_UP
            goto L_0x01b0
        L_0x00ca:
            long r6 = p152f0.C27045a1.f75165k
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00d6
            f0.k0 r0 = p152f0.C27046k0.SELECT_DOWN
            goto L_0x01b0
        L_0x00d6:
            long r6 = p152f0.C27045a1.f75166l
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00e2
            f0.k0 r0 = p152f0.C27046k0.SELECT_PAGE_UP
            goto L_0x01b0
        L_0x00e2:
            long r6 = p152f0.C27045a1.f75167m
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00ee
            f0.k0 r0 = p152f0.C27046k0.SELECT_PAGE_DOWN
            goto L_0x01b0
        L_0x00ee:
            long r6 = p152f0.C27045a1.f75168n
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x00fa
            f0.k0 r0 = p152f0.C27046k0.SELECT_LINE_START
            goto L_0x01b0
        L_0x00fa:
            long r6 = p152f0.C27045a1.f75169o
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0106
            f0.k0 r0 = p152f0.C27046k0.SELECT_LINE_END
            goto L_0x01b0
        L_0x0106:
            long r6 = p152f0.C27045a1.f75170p
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0097
            goto L_0x006c
        L_0x0110:
            long r4 = p904j1.C108523c.m147065a(r9)
            int r9 = p152f0.C27045a1.f75177w
            long r6 = p152f0.C27045a1.f75162h
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0122
            f0.k0 r0 = p152f0.C27046k0.LEFT_CHAR
            goto L_0x01b0
        L_0x0122:
            long r6 = p152f0.C27045a1.f75163i
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x012e
            f0.k0 r0 = p152f0.C27046k0.RIGHT_CHAR
            goto L_0x01b0
        L_0x012e:
            long r6 = p152f0.C27045a1.f75164j
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x013a
            f0.k0 r0 = p152f0.C27046k0.UP
            goto L_0x01b0
        L_0x013a:
            long r6 = p152f0.C27045a1.f75165k
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0146
            f0.k0 r0 = p152f0.C27046k0.DOWN
            goto L_0x01b0
        L_0x0146:
            long r6 = p152f0.C27045a1.f75166l
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0151
            f0.k0 r0 = p152f0.C27046k0.PAGE_UP
            goto L_0x01b0
        L_0x0151:
            long r6 = p152f0.C27045a1.f75167m
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x015c
            f0.k0 r0 = p152f0.C27046k0.PAGE_DOWN
            goto L_0x01b0
        L_0x015c:
            long r6 = p152f0.C27045a1.f75168n
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0167
            f0.k0 r0 = p152f0.C27046k0.LINE_START
            goto L_0x01b0
        L_0x0167:
            long r6 = p152f0.C27045a1.f75169o
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0172
            f0.k0 r0 = p152f0.C27046k0.LINE_END
            goto L_0x01b0
        L_0x0172:
            long r6 = p152f0.C27045a1.f75171q
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x017d
            f0.k0 r0 = p152f0.C27046k0.NEW_LINE
            goto L_0x01b0
        L_0x017d:
            long r6 = p152f0.C27045a1.f75172r
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0188
            f0.k0 r0 = p152f0.C27046k0.DELETE_PREV_CHAR
            goto L_0x01b0
        L_0x0188:
            long r6 = p152f0.C27045a1.f75173s
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x0193
            f0.k0 r0 = p152f0.C27046k0.DELETE_NEXT_CHAR
            goto L_0x01b0
        L_0x0193:
            long r6 = p152f0.C27045a1.f75174t
            boolean r9 = p904j1.C108522a.m147064a(r4, r6)
            if (r9 == 0) goto L_0x019d
            goto L_0x006c
        L_0x019d:
            long r1 = p152f0.C27045a1.f75175u
            boolean r9 = p904j1.C108522a.m147064a(r4, r1)
            if (r9 == 0) goto L_0x01a6
            goto L_0x01b0
        L_0x01a6:
            long r0 = p152f0.C27045a1.f75176v
            boolean r9 = p904j1.C108522a.m147064a(r4, r0)
            if (r9 == 0) goto L_0x0097
            f0.k0 r0 = p152f0.C27046k0.TAB
        L_0x01b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152f0.C27047m0.mo54536a(android.view.KeyEvent):f0.k0");
    }
}
