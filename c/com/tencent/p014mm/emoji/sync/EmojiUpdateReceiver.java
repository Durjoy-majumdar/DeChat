package com.tencent.p014mm.emoji.sync;

import android.content.BroadcastReceiver;

/* renamed from: com.tencent.mm.emoji.sync.EmojiUpdateReceiver */
public class EmojiUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f266698a = 0;

    /* JADX WARNING: type inference failed for: r6v3, types: [ll.t] */
    /* JADX WARNING: type inference failed for: r6v4, types: [ll.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            java.lang.String r0 = "com.tencent.mm.Emoji_Update"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "type"
            java.lang.String r0 = r7.getStringExtra(r0)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r0
            java.lang.String r3 = "MicroMsg.EmojiUpdateReceiver"
            java.lang.String r4 = "receive %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            java.lang.String r1 = "update_all_custom_emoji"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x003e
            dl.o r6 = p490dl.C97489o.m125592g()
            r6.mo136769k(r2)
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r6 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r6.<init>()
            r6.publish()
            goto L_0x00dd
        L_0x003e:
            java.lang.String r1 = "update_download_custom_emoji"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0058
            dl.o r6 = p490dl.C97489o.m125592g()
            r6.mo136771m(r2)
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r6 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r6.<init>()
            r6.publish()
            goto L_0x00dd
        L_0x0058:
            java.lang.String r1 = "update_store_emoji"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0070
            dl.o r7 = p490dl.C97489o.m125592g()
            r7.f286131c = r6
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r6 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r6.<init>()
            r6.publish()
            goto L_0x00dd
        L_0x0070:
            java.lang.String r1 = "update_group_info"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0089
            dl.o r6 = p490dl.C97489o.m125592g()
            r6.mo136772n(r2)
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r6 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r6.<init>()
            r6.publish()
            goto L_0x00dd
        L_0x0089:
            java.lang.String r1 = "update_capture_emoji"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00a2
            dl.o r6 = p490dl.C97489o.m125592g()
            r6.mo136770l(r2)
            com.tencent.mm.autogen.events.RefreshSmileyPanelEvent r6 = new com.tencent.mm.autogen.events.RefreshSmileyPanelEvent
            r6.<init>()
            r6.publish()
            goto L_0x00dd
        L_0x00a2:
            java.lang.String r1 = "TYPE_UPDATE_EMOJI_SYNC"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "data"
            android.os.Parcelable r7 = r7.getParcelableExtra(r0)
            com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC$EmojiSyncData r7 = (com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC.EmojiSyncData) r7
            com.tencent.mm.emoji.sync.a$f r0 = com.tencent.p014mm.emoji.sync.C92668a.f266699q
            if (r7 != 0) goto L_0x00b7
            goto L_0x00dd
        L_0x00b7:
            int r1 = r7.f266687d
            r3 = 0
            if (r1 != r6) goto L_0x00cd
            ll.t r6 = r0.mo126717a(r2)
            boolean r0 = r6 instanceof com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC
            if (r0 == 0) goto L_0x00c7
            r3 = r6
            com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC r3 = (com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC) r3
        L_0x00c7:
            if (r3 == 0) goto L_0x00dd
            r3.mo126706g(r7)
            goto L_0x00dd
        L_0x00cd:
            ll.t r6 = r0.mo126718b(r2)
            boolean r0 = r6 instanceof com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC
            if (r0 == 0) goto L_0x00d8
            r3 = r6
            com.tencent.mm.emoji.sync.EmojiSyncLoaderIPC r3 = (com.tencent.p014mm.emoji.sync.EmojiSyncLoaderIPC) r3
        L_0x00d8:
            if (r3 == 0) goto L_0x00dd
            r3.mo126706g(r7)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.emoji.sync.EmojiUpdateReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
