package com.tencent.p014mm.plugin.game.chatroom.channel;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax1.C39641d;
import ax1.C39645h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NewUserNoticeEvent;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Channel;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomJumpInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JumpInfo;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import yw1.C53591c;

/* renamed from: com.tencent.mm.plugin.game.chatroom.channel.ChatChannelFragment */
public class ChatChannelFragment extends HellAndroidXFragment implements C39645h {

    /* renamed from: d */
    public View f112125d;

    /* renamed from: e */
    public GameChatListView f112126e;

    /* renamed from: f */
    public int f112127f;

    /* renamed from: g */
    public Channel f112128g;

    /* renamed from: h */
    public List<Channel> f112129h;

    /* renamed from: i */
    public String f112130i;

    /* renamed from: j */
    public int f112131j;

    /* renamed from: n */
    public boolean f112132n = false;

    /* renamed from: o */
    public int f112133o = -1;

    /* renamed from: p */
    public C39641d f112134p;

    /* renamed from: q */
    public ChatroomJumpInfo f112135q;

    /* renamed from: r */
    public JumpInfo f112136r;

    /* renamed from: s */
    public String f112137s;

    /* renamed from: t */
    public long f112138t;

    /* renamed from: u */
    public NewUserNoticeEvent f112139u;

    /* renamed from: v */
    public IListener f112140v = new IListener<NewUserNoticeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 86036039;
        }

        public boolean callback(IEvent iEvent) {
            GameChatListView gameChatListView;
            NewUserNoticeEvent newUserNoticeEvent = (NewUserNoticeEvent) iEvent;
            int i = newUserNoticeEvent.f107660d.f107661a;
            if (i == 1) {
                ChatChannelFragment chatChannelFragment = ChatChannelFragment.this;
                if (!chatChannelFragment.f112132n || (gameChatListView = chatChannelFragment.f112126e) == null) {
                    chatChannelFragment.f112139u = newUserNoticeEvent;
                } else {
                    gameChatListView.mo65535K1(newUserNoticeEvent);
                    ChatChannelFragment.this.f112139u = null;
                }
            } else if (i == 2) {
                GameChatListView gameChatListView2 = ChatChannelFragment.this.f112126e;
                if (!(gameChatListView2 == null || gameChatListView2.f112522S1.getTag() == null)) {
                    gameChatListView2.f112522S1.setTag((Object) null);
                    View view = gameChatListView2.f112522S1;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/view/GameChatListView", "hideNewUserSpeakBubble", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ChatChannelFragment.this.f112139u = null;
            }
            return false;
        }
    };

    public ChatChannelFragment(String str, int i) {
        this.f112130i = str;
        this.f112127f = i;
    }

    /* renamed from: J */
    public void mo62213J(Map<String, C53591c.C53598g> map) {
        GameChatListView gameChatListView = this.f112126e;
        if (gameChatListView != null) {
            gameChatListView.mo62213J(map);
        }
    }

    /* renamed from: K */
    public final void mo65380K() {
        if (this.f112132n) {
            mo65381L(false);
        }
        GameChatListView gameChatListView = this.f112126e;
        if (gameChatListView == null) {
            return;
        }
        if (this.f112132n) {
            NewUserNoticeEvent newUserNoticeEvent = this.f112139u;
            gameChatListView.f112537h2 = gameChatListView.f112520Q1;
            Log.m105925i("GameChatRoom.GameChatListView", "onResume, channelId:%d", Integer.valueOf(gameChatListView.f112513J1));
            gameChatListView.f112538i2 = true;
            gameChatListView.mo65535K1(newUserNoticeEvent);
            this.f112139u = null;
            return;
        }
        Log.m105925i("GameChatRoom.GameChatListView", "onPause, channelId:%d", Integer.valueOf(gameChatListView.f112513J1));
        gameChatListView.f112538i2 = false;
        if (gameChatListView.f112513J1 == 0) {
            gameChatListView.f112506C1.mo65547O4(2, true, false);
        }
        if (gameChatListView.f112522S1.getTag() != null) {
            NewUserNoticeEvent newUserNoticeEvent2 = new NewUserNoticeEvent();
            newUserNoticeEvent2.f107660d.f107661a = 2;
            newUserNoticeEvent2.publish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65381L(boolean r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.f112125d
            if (r0 == 0) goto L_0x0172
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r0 = r7.f112126e
            if (r0 == 0) goto L_0x000a
            goto L_0x0172
        L_0x000a:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r7.f112131j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "GameChatRoom.ChatChannelFragment"
            java.lang.String r4 = "ChatChannelFragment initChatList, channelId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            android.view.View r1 = r7.f112125d
            r2 = 2131316286(0x7f094e3e, float:1.825105E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r1.inflate()
            android.view.View r1 = r7.f112125d
            r2 = 2131305370(0x7f09239a, float:1.8228909E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = (com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView) r1
            r7.f112126e = r1
            java.lang.String r2 = r7.f112130i
            r1.setChatRoomInfo(r2)
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = r7.f112126e
            int r2 = r7.f112131j
            java.util.List<com.tencent.mm.plugin.game.autogen.chatroom.Channel> r4 = r7.f112129h
            r1.mo65534J1(r2, r4)
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = r7.f112126e
            android.view.View r2 = r7.f112125d
            android.view.View r4 = r1.f112522S1
            if (r4 == 0) goto L_0x004f
            goto L_0x00a5
        L_0x004f:
            r4 = 2131315948(0x7f094cec, float:1.8250364E38)
            android.view.View r4 = r2.findViewById(r4)
            r1.f112522S1 = r4
            r4 = 2131315949(0x7f094ced, float:1.8250366E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f112523T1 = r4
            r4 = 2131315947(0x7f094ceb, float:1.8250362E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r1.f112524U1 = r4
            int r5 = r1.f112513J1
            if (r5 != 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            if (r5 != 0) goto L_0x007d
            r5 = 2131756134(0x7f100466, float:1.9143167E38)
            r4.setImageResource(r5)
        L_0x007d:
            android.view.View r4 = r1.f112522S1
            if (r4 == 0) goto L_0x0089
            com.tencent.mm.plugin.game.chatroom.view.h0 r5 = new com.tencent.mm.plugin.game.chatroom.view.h0
            r5.<init>(r1)
            r4.setOnClickListener(r5)
        L_0x0089:
            r4 = 2131297358(0x7f09044e, float:1.8212659E38)
            android.view.View r4 = r2.findViewById(r4)
            r1.f112525V1 = r4
            com.tencent.mm.plugin.game.chatroom.view.i0 r5 = new com.tencent.mm.plugin.game.chatroom.view.i0
            r5.<init>(r1)
            r4.setOnClickListener(r5)
            r4 = 2131297359(0x7f09044f, float:1.821266E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r1.f112526W1 = r2
        L_0x00a5:
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = r7.f112126e
            r1.getFirstPageData()
            ax1.d r1 = r7.f112134p
            if (r1 == 0) goto L_0x00b7
            r7.f112134p = r1
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = r7.f112126e
            if (r2 == 0) goto L_0x00b7
            r2.setHostContact(r1)
        L_0x00b7:
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomJumpInfo r1 = r7.f112135q
            if (r1 == 0) goto L_0x00c4
            r7.f112135q = r1
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = r7.f112126e
            if (r2 == 0) goto L_0x00c4
            r2.setChatRoomJumpInfo(r1)
        L_0x00c4:
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r1 = r7.f112136r
            if (r1 == 0) goto L_0x00d1
            r7.f112136r = r1
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = r7.f112126e
            if (r2 == 0) goto L_0x00d1
            r2.setPreloadInfo(r1)
        L_0x00d1:
            java.lang.String r1 = r7.f112137s
            if (r1 == 0) goto L_0x00de
            r7.f112137s = r1
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r2 = r7.f112126e
            if (r2 == 0) goto L_0x00de
            r2.setPremadeCardInfo(r1)
        L_0x00de:
            long r1 = r7.f112138t
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x00ef
            r7.f112138t = r1
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r4 = r7.f112126e
            if (r4 == 0) goto L_0x00ef
            r4.setJumpFirstSeq(r1)
        L_0x00ef:
            r7.mo65380K()
            if (r8 == 0) goto L_0x0172
            int r8 = r7.f112133o
            r1 = -1
            if (r8 != r1) goto L_0x0172
            java.lang.String r8 = r7.f112130i
            com.tencent.mm.plugin.game.chatroom.view.GameChatListView r1 = r7.f112126e
            if (r1 == 0) goto L_0x0172
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r2 == 0) goto L_0x0106
            goto L_0x0172
        L_0x0106:
            com.tencent.mm.autogen.events.GamePBCacheEvent r2 = new com.tencent.mm.autogen.events.GamePBCacheEvent
            r2.<init>()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r4 = r2.f107561d
            r4.f107562a = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cache_game_chat_msg#"
            r5.append(r6)
            r5.append(r8)
            java.lang.String r8 = r1.f112535f2
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            r4.f107563b = r8
            r2.publish()
            com.tencent.mm.autogen.events.GamePBCacheEvent$a r8 = r2.f107561d
            byte[] r8 = r8.f107564c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r8)
            if (r2 != 0) goto L_0x0172
            r2 = 0
            com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg r4 = new com.tencent.mm.plugin.game.autogen.chatroom.LocalCacheChatMsg     // Catch:{ IOException -> 0x0141 }
            r4.<init>()     // Catch:{ IOException -> 0x0141 }
            r4.parseFrom(r8)     // Catch:{ IOException -> 0x013f }
            r8 = 1
            goto L_0x0144
        L_0x013f:
            goto L_0x0143
        L_0x0141:
            r4 = r2
        L_0x0143:
            r8 = 0
        L_0x0144:
            if (r4 == 0) goto L_0x0172
            if (r8 == 0) goto L_0x0172
            java.lang.Object[] r8 = new java.lang.Object[r0]
            int r0 = r1.f112513J1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8[r3] = r0
            java.lang.String r0 = "GameChatRoom.GameChatListView"
            java.lang.String r3 = "addLastCacheData, user cache, channelId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r8)
            java.lang.Class<ax1.c> r8 = ax1.C39639c.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ax1.c r8 = (ax1.C39639c) r8
            java.lang.String r0 = r4.host_user_name
            ax1.d r8 = r8.mo62193X3(r0)
            r1.f112518O1 = r8
            if (r8 == 0) goto L_0x0172
            java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack> r8 = r4.chatroom_msg_list
            r0 = 8
            r1.mo65529E1(r8, r0, r2)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.chatroom.channel.ChatChannelFragment.mo65381L(boolean):void");
    }

    /* renamed from: W */
    public void mo62214W(int i) {
        GameChatListView gameChatListView = this.f112126e;
        if (gameChatListView != null) {
            gameChatListView.getClass();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f112140v.alive();
        if (this.f112125d == null) {
            boolean z = false;
            this.f112125d = layoutInflater.inflate(C0966R.C0971layout.f6798ou, viewGroup, false);
            this.f112133o = ((Activity) viewGroup.getContext()).getIntent().getIntExtra("target_channel_id", -1);
            int i = this.f112131j;
            if ((i == 0) || i == this.f112127f) {
                z = true;
            }
            if (z) {
                try {
                    mo65381L(z);
                } catch (Exception e) {
                    Log.m105924i("GameChatRoom.ChatChannelFragment", "err:" + e.getMessage());
                }
            }
        }
        return this.f112125d;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f112140v.dead();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f112132n = z;
        mo65380K();
    }
}
