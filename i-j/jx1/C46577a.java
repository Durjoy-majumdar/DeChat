package jx1;

import ax1.C39638b;
import com.tencent.p014mm.autogen.events.GetChatRoomMsgEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LocalMyChatRoom;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MyChatroomNotice;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import hx1.C46130b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import pe3.C47465a;
import yw1.C53591c;

/* renamed from: jx1.a */
public final class C46577a implements C39638b<LocalMyChatRoom> {

    /* renamed from: d */
    public static final C46577a f125473d;

    /* renamed from: e */
    public static C46130b f125474e;

    /* renamed from: f */
    public static LocalMyChatRoom f125475f;

    /* renamed from: g */
    public static boolean f125476g;

    /* renamed from: h */
    public static MyChatroomNotice f125477h;

    /* renamed from: jx1.a$a */
    public /* synthetic */ class C46578a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f125478a;

        static {
            int[] iArr = new int[C53591c.C53594c.values().length];
            iArr[2] = 1;
            f125478a = iArr;
        }
    }

    static {
        C46577a aVar = new C46577a();
        f125473d = aVar;
        f125474e = new C46130b(C53591c.C53594c.KEEP_ALIVE_TYPE_GET_MY_CHAT_ROOM, aVar);
    }

    /* renamed from: F2 */
    public void mo62190F2(C53591c.C53594c cVar, C47465a aVar) {
        LocalMyChatRoom localMyChatRoom = (LocalMyChatRoom) aVar;
        if ((cVar == null ? -1 : C46578a.f125478a[cVar.ordinal()]) == 1 && localMyChatRoom != null) {
            f125475f = localMyChatRoom;
            if (f125477h == null) {
                f125477h = localMyChatRoom.my_chatroom_notice;
            }
            f125476g = false;
            if (!Util.isNullOrNil((List) localMyChatRoom.my_chatroom_info_list)) {
                Iterator<MyChatroomInfo> it = localMyChatRoom.my_chatroom_info_list.iterator();
                while (it.hasNext()) {
                    if (it.next().unread_msg_count > 0) {
                        f125476g = true;
                        C85801v1 i = C86709a0.m107535s().mo121142i();
                        C72994y1.C72995a aVar2 = C72994y1.C72995a.GAME_MSG_BOTTOM_TAB_BOOLEAN_SYNC;
                        Boolean bool = Boolean.TRUE;
                        i.mo119677K(aVar2, bool);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.GAME_MSG_CHAT_TAB_BOOLEAN_SYNC, bool);
                    }
                }
            }
            GetChatRoomMsgEvent getChatRoomMsgEvent = new GetChatRoomMsgEvent();
            getChatRoomMsgEvent.f107584d.f107585a = localMyChatRoom.toByteArray();
            getChatRoomMsgEvent.publish();
        }
    }

    /* renamed from: a */
    public final void mo71881a(String str) {
        C46130b bVar = f125474e;
        bVar.f124298d = this;
        synchronized (bVar) {
            bVar.f124304j = Util.nullAsNil(str);
            Log.m105925i("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive, topChatRoomName:%s", str);
            if (!bVar.f124301g) {
                bVar.f124301g = true;
                Log.printInfoStack("GameChatRoom.GetMyChatRoomKeepAliveService", "startKeepAlive success", new Object[0]);
                C86709a0.m107524d().mo123455a(4989, bVar);
                bVar.mo71576a((List<String>) null, bVar.f124304j, "");
            } else {
                Log.printInfoStack("GameChatRoom.GetMyChatRoomKeepAliveService", "service exist", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo71882b() {
        C46130b bVar = f125474e;
        synchronized (bVar) {
            Log.m105924i("GameChatRoom.GetMyChatRoomKeepAliveService", "stopKeepAlive");
            bVar.f124298d = null;
            bVar.f124301g = false;
            bVar.f124302h = false;
            bVar.f124303i = false;
            bVar.f124304j = "";
            bVar.f124305n = "";
            bVar.f124306o = 2;
            ((LinkedList) bVar.f124307p).clear();
            C86709a0.m107524d().mo123470p(4989, bVar);
            if (bVar.f124300f != null) {
                C86709a0.m107524d().mo123458d(bVar.f124300f);
            }
        }
        f125475f = null;
        f125477h = null;
        f125476g = false;
    }
}
