package com.tencent.p014mm.plugin.emoji.p040ui.fts;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.emoji.ui.fts.f */
public class C93184f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FTSEmojiDetailPageUI f268740d;

    public C93184f(FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f268740d = fTSEmojiDetailPageUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r17) {
        /*
            r16 = this;
            r6 = r16
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r17
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r16
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI r0 = r6.f268740d
            int r1 = com.tencent.p014mm.plugin.emoji.p040ui.fts.FTSEmojiDetailPageUI.f268694P
            r0.getClass()
            java.lang.Class<c00.r> r1 = c00.C92330r.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r7 = r1
            c00.r r7 = (c00.C92330r) r7
            int r8 = r0.f268723u
            java.lang.String r9 = r0.f268724v
            java.lang.String r10 = r0.f268726x
            int r1 = r0.f268722t
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r15 = 0
            if (r1 == r4) goto L_0x0059
            if (r1 == r3) goto L_0x004f
            if (r1 == r2) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            java.lang.String r1 = r0.f268696B
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x004f:
            java.lang.String r1 = r0.f268698D
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x0059:
            java.lang.String r1 = r0.f268727y
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            java.lang.String r11 = r0.f268703I
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0072
            int r11 = r0.f268704J
            if (r11 != r5) goto L_0x0072
            r11 = 1
            goto L_0x0073
        L_0x0072:
            r11 = 0
        L_0x0073:
            if (r11 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x0077:
            r12 = r1
        L_0x0078:
            r13 = 0
            int r14 = r0.f268725w
            r11 = 3
            r7.mo126126PR(r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "isWeAppandOperateContent = "
            r1.append(r7)
            java.lang.String r7 = r0.f268701G
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0098
            int r7 = r0.f268704J
            if (r7 != r4) goto L_0x0098
            r7 = 1
            goto L_0x0099
        L_0x0098:
            r7 = 0
        L_0x0099:
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "MicroMsg.FTS.FTSEmojiDetailPageUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            java.lang.String r1 = r0.f268701G
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00b3
            int r1 = r0.f268704J
            if (r1 != r4) goto L_0x00b3
            r1 = 1
            goto L_0x00b4
        L_0x00b3:
            r1 = 0
        L_0x00b4:
            r7 = 0
            if (r1 == 0) goto L_0x00de
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = r0.f268701G
            java.lang.String r3 = "Contact_User"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "key_start_biz_profile_from_app_brand_profile"
            r1.putExtra(r2, r5)
            java.lang.String r2 = "key_use_new_contact_profile"
            r1.putExtra(r2, r5)
            java.lang.String r2 = "force_get_contact"
            r1.putExtra(r2, r5)
            java.lang.String r2 = "profile"
            java.lang.String r3 = ".ui.ContactInfoUI"
            ke3.C88144b.m109791i(r0, r2, r3, r1, r7)
            goto L_0x022c
        L_0x00de:
            java.lang.String r1 = r0.f268703I
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x00ec
            int r1 = r0.f268704J
            if (r1 != r5) goto L_0x00ec
            r1 = 1
            goto L_0x00ed
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            if (r1 == 0) goto L_0x0166
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 8
            java.lang.String r3 = "stat_scene"
            r1.putInt(r3, r2)
            java.lang.String r2 = r0.f268724v
            java.lang.String r3 = "stat_search_id"
            r1.putString(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f268724v
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            java.lang.String r4 = r0.f268726x
            r2.append(r4)
            r2.append(r3)
            int r4 = r0.f268723u
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.append(r4)
            r2.append(r3)
            int r3 = r0.f268722t
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r4 = r0.f268703I
            java.lang.String r8 = "key_username"
            r3.putExtra(r8, r4)
            java.lang.String r4 = "key_can_swipe_back"
            r3.putExtra(r4, r5)
            r4 = 6
            java.lang.String r5 = "key_from_scene"
            r3.putExtra(r5, r4)
            java.lang.String r4 = "key_scene_note"
            r3.putExtra(r4, r2)
            java.lang.String r2 = "_stat_obj"
            r3.putExtra(r2, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r0.getContext()
            java.lang.String r1 = "appbrand"
            java.lang.String r2 = ".ui.AppBrandProfileUI"
            ke3.C88144b.m109791i(r0, r1, r2, r3, r7)
            goto L_0x022c
        L_0x0166:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.Intent r5 = r0.getIntent()
            java.lang.String r8 = "preceding_scence"
            int r5 = r5.getIntExtra(r8, r15)
            r1.putExtra(r8, r5)
            r5 = 27
            java.lang.String r8 = "download_entrance_scene"
            r1.putExtra(r8, r5)
            java.lang.String r8 = r0.f268724v
            java.lang.String r9 = "searchID"
            r1.putExtra(r9, r8)
            java.lang.String r8 = r0.f268726x
            java.lang.String r9 = "docID"
            r1.putExtra(r9, r8)
            int r8 = r0.f268722t
            java.lang.String r9 = "extra_scence"
            if (r8 == r4) goto L_0x01d7
            if (r8 == r3) goto L_0x01b8
            if (r8 == r2) goto L_0x019b
            goto L_0x022c
        L_0x019b:
            java.lang.String r2 = r0.f268696B
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x022c
            java.lang.String r0 = r0.f268696B
            java.lang.String r2 = "rawUrl"
            r1.putExtra(r2, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "webview"
            java.lang.String r3 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r2, r3, r1, r7)
            goto L_0x022c
        L_0x01b8:
            java.lang.Class<com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2DesignerUI> r2 = com.tencent.p014mm.plugin.emoji.p040ui.p041v2.EmojiStoreV2DesignerUI.class
            r1.setClass(r0, r2)
            r1.putExtra(r9, r5)
            java.lang.String r2 = r0.f268698D
            java.lang.String r3 = "id"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r0.f268699E
            java.lang.String r3 = "name"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r0.f268700F
            java.lang.String r3 = "headurl"
            r1.putExtra(r3, r2)
            goto L_0x01f4
        L_0x01d7:
            java.lang.Class<com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI> r2 = com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI.class
            r1.setClass(r0, r2)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r2)
            int r2 = r0.f268723u
            r1.putExtra(r9, r2)
            int r2 = r0.f268722t
            java.lang.String r3 = "extra_type"
            r1.putExtra(r3, r2)
            java.lang.String r2 = r0.f268727y
            java.lang.String r3 = "extra_id"
            r1.putExtra(r3, r2)
        L_0x01f4:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r1)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI"
            java.lang.String r10 = "onClickBottomBar"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r1 = r2.mo10231a(r15)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.startActivity(r1)
            java.lang.String r8 = "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI"
            java.lang.String r9 = "onClickBottomBar"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x022c:
            java.lang.String r0 = "com/tencent/mm/plugin/emoji/ui/fts/FTSEmojiDetailPageUI$4"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.fts.C93184f.onClick(android.view.View):void");
    }
}
