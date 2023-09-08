package hx1;

import ax1.C39638b;
import bx1.C39864q;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import yw1.C53591c;
import zt3.C119157j;

/* renamed from: hx1.c */
public class C46132c implements C11385n {

    /* renamed from: d */
    public C39638b f124310d;

    /* renamed from: e */
    public C39864q f124311e;

    /* renamed from: f */
    public boolean f124312f = false;

    /* renamed from: g */
    public boolean f124313g = false;

    /* renamed from: hx1.c$a */
    public class C46133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ReceiveChatroomMsgRequest f124314d;

        public C46133a(ReceiveChatroomMsgRequest receiveChatroomMsgRequest) {
            this.f124314d = receiveChatroomMsgRequest;
        }

        public void run() {
            C46132c cVar = C46132c.this;
            cVar.f124313g = false;
            ReceiveChatroomMsgRequest receiveChatroomMsgRequest = this.f124314d;
            cVar.mo71578a(receiveChatroomMsgRequest.chatroom_name, receiveChatroomMsgRequest.seq, receiveChatroomMsgRequest.version);
        }
    }

    public C46132c(C53591c.C53594c cVar, C39638b bVar) {
        this.f124310d = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo71578a(String str, long j, String str2) {
        boolean z = this.f124313g;
        if (!z) {
            if (this.f124312f) {
                this.f124313g = true;
                this.f124311e = new C39864q(str, j, str2, hashCode());
                C86709a0.m107524d().mo123460f(this.f124311e);
                return;
            }
        }
        Log.m105925i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "mIsRunning：%b, mIsAlive: %b", Boolean.valueOf(z), Boolean.valueOf(this.f124312f));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar.getType() == 4302) {
            C39864q qVar = (C39864q) yVar;
            if (qVar.f106913f != hashCode()) {
                Log.m105924i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "instanceId is diff");
                return;
            }
            C47350c cVar = qVar.f106912e;
            ReceiveChatroomMsgRequest receiveChatroomMsgRequest = (ReceiveChatroomMsgRequest) cVar.f127055a.f127080a;
            ReceiveChatroomMsgResponse receiveChatroomMsgResponse = (ReceiveChatroomMsgResponse) cVar.f127056b.f127083a;
            if (i == 0 && i2 == 0 && receiveChatroomMsgResponse != null) {
                receiveChatroomMsgRequest.seq = receiveChatroomMsgResponse.next_seq;
                receiveChatroomMsgRequest.version = receiveChatroomMsgResponse.next_version;
                C39638b bVar = this.f124310d;
                if (bVar != null) {
                    bVar.mo62190F2(C53591c.C53594c.KEEP_ALIVE_TYPE_RECEIVE_CHATROOM_MSG, receiveChatroomMsgResponse);
                }
                z = false;
            } else {
                z = true;
            }
            Log.m105925i("GameChatRoom.ReceiveChatRoomMsgKeepAliveService", "hashcode = %d, chatroom:%s, newSeq:%d, nextVersion:%s, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(hashCode()), receiveChatroomMsgRequest.chatroom_name, Long.valueOf(receiveChatroomMsgRequest.seq), receiveChatroomMsgRequest.version, Integer.valueOf(i), Integer.valueOf(i2), str);
            ((C119157j) C119157j.f356862d).mo183878i(new C46133a(receiveChatroomMsgRequest), z ? 2000 : 0);
        }
    }
}
