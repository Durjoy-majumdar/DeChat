package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.k0 */
public class C41806k0 implements Comparator<ChatroomMsgPack> {

    /* renamed from: d */
    public final /* synthetic */ GameChatListView.C41771f f112660d;

    public C41806k0(GameChatListView.C41771f fVar) {
        this.f112660d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e2, code lost:
        if (r8 > r9) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        if (r6 > 0) goto L_0x00e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compare(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r8 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r8
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r9 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r9
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r1 = r8.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsValue(r8)
            if (r0 != 0) goto L_0x003e
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r1 = r0.f112558f
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r2 = r8.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r0 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r0
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.add(r0)
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r1 = r8.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.remove(r1)
        L_0x003e:
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r1 = r9.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0078
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsValue(r9)
            if (r0 != 0) goto L_0x0078
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r1 = r0.f112558f
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r2 = r9.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack r0 = (com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack) r0
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.add(r0)
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            java.util.Map<java.lang.String, com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112559g
            java.lang.String r1 = r9.cli_msg_id
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.remove(r1)
        L_0x0078:
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r0 = r7.f112660d
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
            int r1 = r1.f112513J1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0084
            r4 = 1
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            if (r4 != 0) goto L_0x00a3
            int r4 = r8.channel_id
            if (r4 == r1) goto L_0x0092
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r0.f112558f
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r8)
        L_0x0092:
            int r0 = r9.channel_id
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView$f r1 = r7.f112660d
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r4 = com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView.this
            int r4 = r4.f112513J1
            if (r0 == r4) goto L_0x00a3
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r0 = r1.f112558f
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r9)
        L_0x00a3:
            long r0 = r8.seq
            long r4 = r9.seq
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00e5
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r8 = r8.msg_options
            com.tencent.mm.plugin.game.autogen.chatroom.MsgOptions r9 = r9.msg_options
            r0 = -1
            r4 = 4
            if (r8 == 0) goto L_0x00c7
            pe3.b r8 = r8.cli_local_data
            if (r8 != 0) goto L_0x00b9
            goto L_0x00c7
        L_0x00b9:
            byte[] r8 = r8.mo123703f()
            long r5 = p823sg.C90196p.m112886c(r8)
            q90.j<java.lang.String, android.graphics.Bitmap> r8 = yw1.C53601h.f150629a
            long r5 = r5 >> r4
            long r5 = r5 & r0
            int r8 = (int) r5
            goto L_0x00c8
        L_0x00c7:
            r8 = 0
        L_0x00c8:
            if (r9 == 0) goto L_0x00de
            pe3.b r9 = r9.cli_local_data
            if (r9 != 0) goto L_0x00cf
            goto L_0x00de
        L_0x00cf:
            byte[] r9 = r9.mo123703f()
            long r5 = p823sg.C90196p.m112886c(r9)
            q90.j<java.lang.String, android.graphics.Bitmap> r9 = yw1.C53601h.f150629a
            long r4 = r5 >> r4
            long r0 = r0 & r4
            int r9 = (int) r0
            goto L_0x00df
        L_0x00de:
            r9 = 0
        L_0x00df:
            if (r8 != r9) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            if (r8 <= r9) goto L_0x00e8
            goto L_0x00e9
        L_0x00e5:
            if (r6 <= 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r2 = -1
        L_0x00e9:
            r3 = r2
        L_0x00ea:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.view.C41806k0.compare(java.lang.Object, java.lang.Object):int");
    }
}
