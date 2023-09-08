package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.storage.emotion.EmojiInfo;
import hp3.C87581a;
import ob0.C89132b;
import te3.C52081y8;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI$$d */
public class EmojiAddCustomDialogUI$$d implements C87581a<Void, C89132b.C89134c<C52081y8>> {

    /* renamed from: a */
    public final /* synthetic */ EmojiInfo f268402a;

    /* renamed from: b */
    public final /* synthetic */ EmojiAddCustomDialogUI f268403b;

    public EmojiAddCustomDialogUI$$d(EmojiAddCustomDialogUI emojiAddCustomDialogUI, EmojiInfo emojiInfo) {
        this.f268403b = emojiAddCustomDialogUI;
        this.f268402a = emojiInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r9) {
        /*
            r8 = this;
            ob0.b$c r9 = (ob0.C89132b.C89134c) r9
            int r0 = r9.f256793a
            int r1 = r9.f256794b
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.emoji.EmojiAddCustomDialogUI"
            r5 = -434(0xfffffffffffffe4e, float:NaN)
            r6 = 0
            if (r1 != r5) goto L_0x0086
            java.lang.String r9 = "[cpan] save emoji onSceneEnd error over size."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r9.mo119677K(r0, r1)
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r9 = r8.f268403b
            r9.mo127688H7()
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r9 = r8.f268403b
            r9.mo127691K7()
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r0 = 10431(0x28bf, float:1.4617E-41)
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r4 = r8.f268403b
            int r4 = r4.f268388g
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1[r2] = r4
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r2 = r8.f268403b
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r2.f268390i
            java.lang.String r2 = r2.getMd5()
            r1[r3] = r2
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r2 = r8.f268403b
            com.tencent.mm.storage.emotion.EmojiInfo r2 = r2.f268390i
            java.lang.String r4 = r2.field_designerID
            r5 = 2
            r1[r5] = r4
            r4 = 3
            java.lang.String r2 = r2.field_groupId
            r1[r4] = r2
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r1[r2] = r3
            r2 = 6
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r3 = r8.f268403b
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r3.f268390i
            int r3 = r3.field_size
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 7
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r3 = r8.f268403b
            java.lang.String r4 = r3.f268389h
            r1[r2] = r4
            r2 = 8
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r3.f268390i
            java.lang.String r3 = r3.field_activityid
            r1[r2] = r3
            r9.mo160131h(r0, r1)
            goto L_0x0133
        L_0x0086:
            if (r0 != 0) goto L_0x012e
            if (r1 != 0) goto L_0x012e
            java.lang.String r0 = "[cpan] save emoji onSceneEnd ok."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            T r9 = r9.f256796d
            te3.y8 r9 = (te3.C52081y8) r9
            if (r9 == 0) goto L_0x00c0
            java.util.LinkedList<te3.k70> r0 = r9.f145167e
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c0
            java.util.LinkedList<te3.k70> r0 = r9.f145167e
            java.util.Iterator r0 = r0.iterator()
        L_0x00a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c0
            java.lang.Object r1 = r0.next()
            te3.k70 r1 = (te3.C101800k70) r1
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r8.f268402a
            java.lang.String r5 = r5.getMd5()
            java.lang.String r7 = r1.f298586d
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00a5
            goto L_0x00c1
        L_0x00c0:
            r1 = r6
        L_0x00c1:
            if (r9 == 0) goto L_0x0128
            java.util.LinkedList<java.lang.String> r0 = r9.f145166d
            if (r0 == 0) goto L_0x0128
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0128
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.util.LinkedList<java.lang.String> r9 = r9.f145166d
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0[r2] = r9
            java.lang.String r9 = "upload size is %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r0)
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r9 = r8.f268403b
            int r0 = com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI.f268385t
            r9.getClass()
            java.lang.String r0 = "start upload emoji"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            ml.f r0 = r9.f268392n
            if (r0 == 0) goto L_0x00f4
            r0.f292775e = r6
        L_0x00f4:
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r9.f268390i
            java.lang.String r0 = r0.mo62640K1()
            qn3.b r2 = new qn3.b
            r2.<init>(r0)
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r9.f268390i
            boolean r4 = r9.f268391j
            i61.h r0 = (i61.C98602h) r0
            int r0 = r0.mo137998F(r3, r4)
            r2.f296346b = r0
            int r0 = p645pj.C77092c.m93041c()
            r2.f296347c = r0
            r2.f296348d = r0
            com.tencent.mm.plugin.emoji.ui.s r0 = new com.tencent.mm.plugin.emoji.ui.s
            r0.<init>(r9, r1)
            r2.mo140653a(r0)
            goto L_0x0133
        L_0x0128:
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r9 = r8.f268403b
            com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI.m117580F7(r9, r6, r1)
            goto L_0x0133
        L_0x012e:
            com.tencent.mm.plugin.emoji.ui.EmojiAddCustomDialogUI r9 = r8.f268403b
            com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI.m117581G7(r9)
        L_0x0133:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emoji.p040ui.EmojiAddCustomDialogUI$$d.call(java.lang.Object):java.lang.Object");
    }
}
