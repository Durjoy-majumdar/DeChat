package iy1;

import android.view.View;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;

/* renamed from: iy1.f */
public final class C46379f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124974d;

    public C46379f(PostCommentDialogUI postCommentDialogUI) {
        this.f124974d = postCommentDialogUI;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.view.inputmethod.InputMethodManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r8
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel r9 = r9.f113141d
            r0 = 0
            if (r9 == 0) goto L_0x00d1
            int r9 = r9.getVisibility()
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "android/view/View$OnClickListener"
            java.lang.String r4 = "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$bindView$4"
            if (r9 != 0) goto L_0x003e
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.m45662H7(r9)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            r9.mo65907M7()
            j20.C117292a.m165361g(r8, r4, r3, r2, r1)
            return
        L_0x003e:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            com.tencent.mm.plugin.game.api.GameInputConfig r5 = r9.f113153s
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x004c
            boolean r5 = r5.stickBtmIfNonEmpty
            if (r5 != r6) goto L_0x004c
            r5 = 1
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            if (r5 == 0) goto L_0x00a2
            com.tencent.mm.ui.widget.MMEditText r9 = r9.f113142e
            java.lang.String r5 = "gameCommentInputTxt"
            if (r9 == 0) goto L_0x009e
            android.text.Editable r9 = r9.getText()
            if (r9 == 0) goto L_0x0063
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r6 = 0
        L_0x0063:
            if (r6 != 0) goto L_0x00a2
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            boolean r6 = r9.f113135A
            if (r6 == 0) goto L_0x00a2
            com.tencent.mm.ui.widget.MMEditText r9 = r9.f113142e
            if (r9 == 0) goto L_0x009a
            android.content.Context r5 = r9.getContext()
            java.lang.String r6 = "input_method"
            java.lang.Object r5 = r5.getSystemService(r6)
            boolean r6 = r5 instanceof android.view.inputmethod.InputMethodManager
            if (r6 == 0) goto L_0x0080
            r0 = r5
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
        L_0x0080:
            if (r0 == 0) goto L_0x0089
            android.os.IBinder r9 = r9.getWindowToken()
            r0.hideSoftInputFromWindow(r9, r7)
        L_0x0089:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView r9 = r9.mo65906L7()
            r0 = 8
            r9.setVisibility(r0)
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            r9.mo65907M7()
            goto L_0x00cd
        L_0x009a:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x009e:
            gy3.C87412m.m108603p(r5)
            throw r0
        L_0x00a2:
            com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI r9 = r8.f124974d
            boolean r5 = r9.f113136B
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_TOOLS
            com.tencent.mm.ipcinvoker.type.IPCString r6 = new com.tencent.mm.ipcinvoker.type.IPCString
            com.tencent.mm.plugin.game.api.GameInputConfig r7 = r9.f113153s
            if (r7 == 0) goto L_0x00b3
            java.lang.String r7 = r7.identifier
            goto L_0x00b4
        L_0x00b3:
            r7 = r0
        L_0x00b4:
            r6.<init>(r7)
            java.lang.Class<com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI$c> r7 = com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI.C42005c.class
            com.tencent.p014mm.ipcinvoker.C80907o.m98781d(r5, r6, r7, r0)
            goto L_0x00ca
        L_0x00bd:
            sw1.l r5 = sw1.C48473l.C48476c.f129682a
            com.tencent.mm.plugin.game.api.GameInputConfig r6 = r9.f113153s
            if (r6 == 0) goto L_0x00c6
            java.lang.String r6 = r6.identifier
            goto L_0x00c7
        L_0x00c6:
            r6 = r0
        L_0x00c7:
            r5.mo73119a(r6, r0)
        L_0x00ca:
            r9.finish()
        L_0x00cd:
            j20.C117292a.m165361g(r8, r4, r3, r2, r1)
            return
        L_0x00d1:
            java.lang.String r9 = "smileyPanel"
            gy3.C87412m.m108603p(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iy1.C46379f.onClick(android.view.View):void");
    }
}
