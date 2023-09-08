package fm3;

import js0.C88020k;

/* renamed from: fm3.a */
public class C75776a {
    /* renamed from: a */
    public static float m91027a(float f, boolean z) {
        return z ? (float) Math.ceil((double) (f / C88020k.m109556g())) : f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r2 = r11.getFirstVisiblePosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r11 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r11;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<android.util.Pair<com.tencent.p014mm.storage.C72963f4, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c>> m91028b(ck3.C67391b r11, boolean r12) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x000b
            java.lang.String r11 = "MicroMsg.MagicEmojiUtils"
            java.lang.String r12 = "hy: chatting context lost"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
            return r0
        L_0x000b:
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r11 = r11.f193286j
            boolean r1 = r11 instanceof com.tencent.p014mm.p136ui.chatting.ChattingUIFragment
            if (r1 != 0) goto L_0x0012
            return r0
        L_0x0012:
            com.tencent.mm.ui.chatting.ChattingUIFragment r11 = (com.tencent.p014mm.p136ui.chatting.ChattingUIFragment) r11
            zj3.l r1 = r11.f215303u
            if (r1 != 0) goto L_0x0019
            return r0
        L_0x0019:
            int r2 = r11.getFirstVisiblePosition()
            com.tencent.mm.pluginsdk.ui.tools.n0 r3 = r11.mo102031Z()
            int r3 = r3.getLastVisiblePosition()
            if (r3 > r2) goto L_0x0028
            return r0
        L_0x0028:
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 5
            r0.<init>(r4)
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0031:
            int r7 = r3 - r2
            if (r5 > r7) goto L_0x009a
            com.tencent.mm.pluginsdk.ui.tools.n0 r7 = r11.mo102031Z()
            android.view.View r7 = r7.getChildAt(r5)
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 != 0) goto L_0x0042
            goto L_0x004a
        L_0x0042:
            java.lang.Object r8 = r7.getTag()
            boolean r9 = r8 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c
            if (r9 != 0) goto L_0x004d
        L_0x004a:
            int r6 = r6 + 1
            goto L_0x0097
        L_0x004d:
            int r9 = r5 + r2
            int r9 = r9 - r6
            com.tencent.mm.storage.f4 r9 = r1.getItem(r9)
            if (r9 != 0) goto L_0x0057
            goto L_0x0097
        L_0x0057:
            com.tencent.mm.ui.chatting.viewitems.i$c r8 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c) r8
            android.view.View r10 = r8.getMainContainerView()
            if (r10 == 0) goto L_0x0097
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r9, r8)
            r0.add(r10)
            if (r12 == 0) goto L_0x0097
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r8 = r8.getMainContainerView()
            android.view.ViewParent r9 = r7.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.setClipToPadding(r4)
            android.view.ViewParent r9 = r7.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.setClipChildren(r4)
        L_0x0081:
            if (r8 == r7) goto L_0x0097
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            boolean r9 = r8 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0081
            r9 = r8
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r9.setClipChildren(r4)
            r9.setClipToPadding(r4)
            goto L_0x0081
        L_0x0097:
            int r5 = r5 + 1
            goto L_0x0031
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fm3.C75776a.m91028b(ck3.b, boolean):java.util.List");
    }
}
