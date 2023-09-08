package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p192l4.C10462b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ux1.C52636c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "plugin-game_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment */
public final class GameRoomListFragment extends AbsGameRoomFragment {

    /* renamed from: d */
    public final String f114255d;

    /* renamed from: e */
    public final boolean f114256e;

    /* renamed from: f */
    public C52636c f114257f;

    /* renamed from: g */
    public final C13601g f114258g = C36568h.m40985a(new C4569a(this));

    /* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameRoomListFragment$a */
    public static final class C4569a extends C87413o implements C32224a<ChatTabTopArea> {

        /* renamed from: d */
        public final /* synthetic */ GameRoomListFragment f19316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4569a(GameRoomListFragment gameRoomListFragment) {
            super(0);
            this.f19316d = gameRoomListFragment;
        }

        public Object invoke() {
            return new ChatTabTopArea(this.f19316d.requireContext());
        }
    }

    public GameRoomListFragment(String str, boolean z) {
        this.f114255d = str;
        this.f114256e = z;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.cpa, viewGroup, false);
        ChatRoomListView chatRoomListView = (ChatRoomListView) C10462b.m10395a(inflate, C0966R.C0970id.env);
        if (chatRoomListView != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.f114257f = new C52636c(frameLayout, chatRoomListView);
            C87412m.m108593f(frameLayout, "binding.root");
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(C0966R.C0970id.env)));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f114257f = null;
    }

    public void onResume() {
        super.onResume();
        ((ChatTabTopArea) ((C36570n) this.f114258g).getValue()).f19314d.mo66303B1();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r8, r0)
            super.onViewCreated(r8, r9)
            ux1.c r8 = r7.f114257f
            gy3.C87412m.m108591d(r8)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r8 = r8.f146969a
            rx3.g r9 = r7.f114258g
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            com.tencent.mm.plugin.game.ui.chat_tab.ChatTabTopArea r9 = (com.tencent.p014mm.plugin.game.p061ui.chat_tab.ChatTabTopArea) r9
            r8.addHeaderView(r9)
            ux1.c r8 = r7.f114257f
            gy3.C87412m.m108591d(r8)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r8 = r8.f146969a
            java.lang.String r9 = r7.f114255d
            r8.getClass()
            com.tencent.mm.autogen.events.GamePBCacheEvent r0 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r1 = r0.f107561d
            r2 = 1
            r1.f107562a = r2
            java.lang.String r3 = "cache_chatroom_recommend"
            r1.f107563b = r3
            r0.publish()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r0 = r0.f107561d
            byte[] r0 = r0.f107564c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            r3 = 0
            java.lang.String r4 = "MicroMsg.ChatRoomListView"
            r5 = 0
            if (r1 != 0) goto L_0x0063
            com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse r1 = new com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse     // Catch:{ IOException -> 0x0054 }
            r1.<init>()     // Catch:{ IOException -> 0x0054 }
            r1.parseFrom(r0)     // Catch:{ IOException -> 0x0052 }
            r0 = 1
            goto L_0x0057
        L_0x0052:
            goto L_0x0056
        L_0x0054:
            r1 = r3
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r1 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "recommend chatroom, user cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r8.mo65466B1(r1, r2)
        L_0x0063:
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r0 = jx1.C46577a.f125475f
            if (r0 == 0) goto L_0x006e
            java.lang.String r1 = "use prefetch my chatroom data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            r1 = 1
            goto L_0x009d
        L_0x006e:
            com.tencent.mm.autogen.events.GamePBCacheEvent r0 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r0.<init>()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r1 = r0.f107561d
            r1.f107562a = r2
            java.lang.String r6 = "cache_my_chatroom"
            r1.f107563b = r6
            r0.publish()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r0 = r0.f107561d
            byte[] r0 = r0.f107564c
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r1 != 0) goto L_0x0096
            com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom r1 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalMyChatRoom     // Catch:{ IOException -> 0x0093 }
            r1.<init>()     // Catch:{ IOException -> 0x0093 }
            r1.parseFrom(r0)     // Catch:{ IOException -> 0x0092 }
            r3 = r1
            goto L_0x0096
        L_0x0092:
            r3 = r1
        L_0x0093:
            r0 = r3
            r1 = 0
            goto L_0x0098
        L_0x0096:
            r0 = r3
            r1 = 1
        L_0x0098:
            java.lang.String r3 = "local my chatroom, user cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
        L_0x009d:
            if (r0 == 0) goto L_0x00b0
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r3 = r0.my_chatroom_info_list
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x00b0
            if (r1 == 0) goto L_0x00b0
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$e r1 = r8.f112394D1
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo> r0 = r0.my_chatroom_info_list
            r1.mo65475O4(r0)
        L_0x00b0:
            jx1.a r0 = jx1.C46577a.f125473d
            hx1.b r1 = jx1.C46577a.f125474e
            r1.f124306o = r2
            r0.mo71881a(r9)
            java.lang.Class<aw.d> r9 = p447aw.C103918d.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            aw.d r9 = (p447aw.C103918d) r9
            android.content.Context r0 = r8.f112393C1
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r9 = r9.Lb0(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            r0[r5] = r1
            java.lang.String r1 = "grant location permission, result:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            if (r9 == 0) goto L_0x00f1
            java.lang.Class<ts.c> r9 = p702ts.C78085c.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ts.c r9 = (p702ts.C78085c) r9
            cc0.b r9 = r9.mo108056ms()
            cc0.b$a r8 = r8.f112408R1
            r9.mo126409c(r8, r2, r5)
            r8 = 22
            r9 = 10
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r8, r9)
            goto L_0x00ff
        L_0x00f1:
            bx1.j r9 = new bx1.j
            com.tencent.mm.plugin.game.autogen.chatroom.Lbs r8 = r8.f112395E1
            r9.<init>(r8)
            ob0.b0 r8 = f40.C86709a0.m107524d()
            r8.mo123460f(r9)
        L_0x00ff:
            boolean r8 = r7.f114256e
            if (r8 == 0) goto L_0x010d
            ux1.c r8 = r7.f114257f
            gy3.C87412m.m108591d(r8)
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r8 = r8.f146969a
            r8.mo65467C1()
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.chat_tab.GameRoomListFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
