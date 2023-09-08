package hx1;

import ax1.C39638b;
import bx1.C39854i;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMyChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMyChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LocalMyChatRoom;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import yw1.C53591c;
import zt3.C119157j;

/* renamed from: hx1.b */
public class C46130b implements C11385n {

    /* renamed from: d */
    public C39638b f124298d;

    /* renamed from: e */
    public C53591c.C53594c f124299e;

    /* renamed from: f */
    public C39854i f124300f;

    /* renamed from: g */
    public boolean f124301g = false;

    /* renamed from: h */
    public boolean f124302h = false;

    /* renamed from: i */
    public boolean f124303i = false;

    /* renamed from: j */
    public String f124304j;

    /* renamed from: n */
    public String f124305n;

    /* renamed from: o */
    public int f124306o = 2;

    /* renamed from: p */
    public List<String> f124307p = new LinkedList();

    /* renamed from: hx1.b$a */
    public class C46131a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GetMyChatroomRequest f124308d;

        public C46131a(GetMyChatroomRequest getMyChatroomRequest) {
            this.f124308d = getMyChatroomRequest;
        }

        public void run() {
            C46130b bVar = C46130b.this;
            bVar.f124303i = false;
            GetMyChatroomRequest getMyChatroomRequest = this.f124308d;
            bVar.mo71576a(getMyChatroomRequest.chatroom_name_list, bVar.f124304j, getMyChatroomRequest.version);
        }
    }

    public C46130b(C53591c.C53594c cVar, C39638b bVar) {
        this.f124299e = cVar;
        this.f124298d = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo71576a(List<String> list, String str, String str2) {
        boolean z = this.f124303i;
        if (!z) {
            if (this.f124301g) {
                this.f124305n = str2;
                ((LinkedList) this.f124307p).clear();
                if (list != null) {
                    ((LinkedList) this.f124307p).addAll(list);
                }
                this.f124303i = true;
                this.f124300f = new C39854i(list, str, str2, this.f124306o, hashCode());
                C86709a0.m107524d().mo123460f(this.f124300f);
                return;
            }
        }
        Log.m105925i("GameChatRoom.GetMyChatRoomKeepAliveService", "mIsRunning：%b, mIsAlive: %b", Boolean.valueOf(z), Boolean.valueOf(this.f124301g));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar.getType() == 4989) {
            C39854i iVar = (C39854i) yVar;
            if (iVar.f106884f != hashCode()) {
                Log.m105924i("GameChatRoom.GetMyChatRoomKeepAliveService", "instanceId is diff");
                return;
            }
            C47350c cVar = iVar.f106883e;
            GetMyChatroomRequest getMyChatroomRequest = (GetMyChatroomRequest) cVar.f127055a.f127080a;
            GetMyChatroomResponse getMyChatroomResponse = (GetMyChatroomResponse) cVar.f127056b.f127083a;
            if (i != 0 || i2 != 0 || getMyChatroomResponse == null || Util.nullAsNil(getMyChatroomRequest.version).equals(getMyChatroomResponse.next_version)) {
                z = true;
            } else {
                getMyChatroomRequest.version = getMyChatroomResponse.next_version;
                synchronized (this) {
                    if (!(this.f124298d == null || getMyChatroomResponse.my_chatroom_info_list == null)) {
                        LocalMyChatRoom localMyChatRoom = new LocalMyChatRoom();
                        localMyChatRoom.my_chatroom_info_list.addAll(getMyChatroomResponse.my_chatroom_info_list);
                        localMyChatRoom.my_chatroom_notice = getMyChatroomResponse.my_chatroom_notice;
                        Log.m105919d("GameChatRoom.GetMyChatRoomKeepAliveService", "before reorder size:%d, after reorder size:%d", Integer.valueOf(getMyChatroomResponse.my_chatroom_info_list.size()), Integer.valueOf(localMyChatRoom.my_chatroom_info_list.size()));
                        this.f124298d.mo62190F2(this.f124299e, localMyChatRoom);
                    }
                }
                z = false;
            }
            Log.m105925i("GameChatRoom.GetMyChatRoomKeepAliveService", "hashcode = %d, newVersion:%s, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(hashCode()), getMyChatroomRequest.version, Integer.valueOf(i), Integer.valueOf(i2), str);
            ((C119157j) C119157j.f356862d).mo183878i(new C46131a(getMyChatroomRequest), z ? 2000 : 0);
        }
    }
}
