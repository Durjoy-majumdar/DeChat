package hx1;

import ax1.C39638b;
import bx1.C39852g;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import yw1.C53591c;
import zt3.C119157j;

/* renamed from: hx1.a */
public class C46128a implements C11385n {

    /* renamed from: d */
    public C39638b f124292d;

    /* renamed from: e */
    public C39852g f124293e;

    /* renamed from: f */
    public boolean f124294f = false;

    /* renamed from: g */
    public boolean f124295g = false;

    /* renamed from: hx1.a$a */
    public class C46129a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ GetChatroomRealtimeInfoRequest f124296d;

        public C46129a(GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest) {
            this.f124296d = getChatroomRealtimeInfoRequest;
        }

        public void run() {
            C46128a aVar = C46128a.this;
            aVar.f124295g = false;
            GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest = this.f124296d;
            aVar.mo71574a(getChatroomRealtimeInfoRequest.chatroom_name, getChatroomRealtimeInfoRequest.version);
        }
    }

    public C46128a(C53591c.C53594c cVar, C39638b bVar) {
        this.f124292d = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo71574a(String str, String str2) {
        boolean z = this.f124295g;
        if (!z) {
            if (this.f124294f) {
                Log.m105919d("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "runTask, chatRoomName:%s, version:%s", str, str2);
                this.f124295g = true;
                this.f124293e = new C39852g(str, str2, hashCode());
                C86709a0.m107524d().mo123460f(this.f124293e);
                return;
            }
        }
        Log.m105925i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "mIsRunning：%b, mIsAlive: %b", Boolean.valueOf(z), Boolean.valueOf(this.f124294f));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar.getType() == 4316) {
            C39852g gVar = (C39852g) yVar;
            if (gVar.f106879f != hashCode()) {
                Log.m105924i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "instanceId is diff");
                return;
            }
            C47350c cVar = gVar.f106878e;
            GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest = (GetChatroomRealtimeInfoRequest) cVar.f127055a.f127080a;
            GetChatroomRealtimeInfoResponse getChatroomRealtimeInfoResponse = (GetChatroomRealtimeInfoResponse) cVar.f127056b.f127083a;
            if (i != 0 || i2 != 0 || getChatroomRealtimeInfoResponse == null || Util.nullAsNil(getChatroomRealtimeInfoRequest.version).equals(getChatroomRealtimeInfoResponse.next_version)) {
                z = true;
            } else {
                getChatroomRealtimeInfoRequest.version = getChatroomRealtimeInfoResponse.next_version;
                C39638b bVar = this.f124292d;
                if (bVar != null) {
                    bVar.mo62190F2(C53591c.C53594c.KEEP_ALIVE_TYPE_GET_CHATROOM_REALTIME_INFO, getChatroomRealtimeInfoResponse);
                }
                z = false;
            }
            Log.m105925i("GameChatRoom.GetChatRoomRealtimeInfoKeepAliveService", "taskCallback, chatroom:%s, newVersion:%s, errType = %d, errCode = %d, errMsg = %s", getChatroomRealtimeInfoRequest.chatroom_name, getChatroomRealtimeInfoRequest.version, Integer.valueOf(i), Integer.valueOf(i2), str);
            ((C119157j) C119157j.f356862d).mo183878i(new C46129a(getChatroomRealtimeInfoRequest), z ? 2000 : 0);
        }
    }
}
