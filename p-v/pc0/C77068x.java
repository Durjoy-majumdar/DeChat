package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import ob0.C117747y;

/* renamed from: pc0.x */
public final class C77068x {

    /* renamed from: a */
    public static final C77068x f225120a = new C77068x();

    /* renamed from: b */
    public static final HashMap<Long, C77069a> f225121b = new HashMap<>();

    /* renamed from: pc0.x$a */
    public static final class C77069a {

        /* renamed from: a */
        public boolean f225122a;

        /* renamed from: b */
        public boolean f225123b;

        /* renamed from: c */
        public long f225124c;

        /* renamed from: d */
        public boolean f225125d;

        public C77069a() {
            this(false, false, 0, false, 15, (C8480h) null);
        }

        public C77069a(boolean z, boolean z2, long j, boolean z3, int i, C8480h hVar) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            j = (i & 4) != 0 ? -1 : j;
            z3 = (i & 8) != 0 ? true : z3;
            this.f225122a = z;
            this.f225123b = z2;
            this.f225124c = j;
            this.f225125d = z3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C77069a)) {
                return false;
            }
            C77069a aVar = (C77069a) obj;
            return this.f225122a == aVar.f225122a && this.f225123b == aVar.f225123b && this.f225124c == aVar.f225124c && this.f225125d == aVar.f225125d;
        }

        public int hashCode() {
            boolean z = this.f225122a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f225123b;
            if (z3) {
                z3 = true;
            }
            long j = this.f225124c;
            int i2 = (((i + (z3 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z4 = this.f225125d;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "MsgRevokeStatus(isSendingMsgCgi=" + this.f225122a + ", isRevokeBeforeSendingMsg=" + this.f225123b + ", revokeStartTime=" + this.f225124c + ", isRevokeAfterSend=" + this.f225125d + ')';
        }
    }

    /* renamed from: a */
    public static final boolean m92996a(long j, C117747y yVar) {
        C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int type = yVar.getType();
        HashMap<Long, C77069a> hashMap = f225121b;
        synchronized (hashMap) {
            C77069a aVar = hashMap.get(Long.valueOf(j));
            if (aVar != null && aVar.f225123b) {
                Log.m105928w("MMRevoke.RevokeMsgManager", "tryToSendMsgCgi() called with isRevokingMsg: msgId = " + j + " sceneType:" + type + " scene:" + yVar + " cancel msg send");
                return true;
            }
            Long valueOf = Long.valueOf(j);
            C77069a aVar2 = hashMap.get(valueOf);
            if (aVar2 == null) {
                aVar2 = new C77069a(false, false, 0, false, 15, (C8480h) null);
                hashMap.put(valueOf, aVar2);
            }
            aVar2.f225122a = true;
            String stack = j == 0 ? Util.getStack() : "";
            Log.m105924i("MMRevoke.RevokeMsgManager", "tryToSendMsgCgi() called with: msgId = " + j + " sceneType:" + type + ' ' + stack);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo107379b(C72963f4 f4Var, boolean z) {
        boolean z2 = z;
        C87412m.m108594g(f4Var, "oriMsg");
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(f4Var.getMsgId());
        long msgId = b002.getMsgId();
        int type = b002.getType();
        int status = b002.getStatus();
        if (!z2) {
            Log.m105924i("MMRevoke.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", type=" + type + " status:" + status + " not Support Revoke BeforeSendMsg");
            return false;
        } else if (b002.getStatus() == 2 || b002.f230728K == 1) {
            Log.m105924i("MMRevoke.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", type=" + type + " flag=" + b002.f230728K + " already sent or web flag");
            return false;
        } else {
            HashMap<Long, C77069a> hashMap = f225121b;
            synchronized (hashMap) {
                C77069a aVar = hashMap.get(Long.valueOf(msgId));
                if (aVar != null && aVar.f225122a) {
                    Log.m105924i("MMRevoke.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", type=" + type + " status=" + status + " already sending msg cgi");
                    return false;
                }
                Long valueOf = Long.valueOf(msgId);
                C77069a aVar2 = hashMap.get(valueOf);
                if (aVar2 == null) {
                    aVar2 = new C77069a(false, false, 0, false, 15, (C8480h) null);
                    hashMap.put(valueOf, aVar2);
                }
                aVar2.f225123b = true;
                Log.m105924i("MMRevoke.RevokeMsgManager", "tryToRevokeBeforeSendingMsgCgi() called with: msgId = " + msgId + ", type=" + type + " status=" + status + " isRevokeBeforeSendMsg = " + z2);
                return true;
            }
        }
    }
}
