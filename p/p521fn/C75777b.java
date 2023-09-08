package p521fn;

import com.tencent.p014mm.autogen.events.ResendVoiceMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kd0.C76546u;
import kd0.C76551y;
import kd0.C76552z;
import ob0.C77002r;

/* renamed from: fn.b */
public class C75777b extends IStaticListener<ResendVoiceMsgEvent> {
    public boolean callback(IEvent iEvent) {
        C76551y o;
        int msgId = (int) ((ResendVoiceMsgEvent) iEvent).f193917d.f193918a.getMsgId();
        HashMap<String, WeakReference<C77002r>> hashMap = C76552z.f224074a;
        Class cls = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00((long) msgId);
        if (!(b002.getMsgId() == 0 || b002.mo108765s2() == null || Util.isNullOrNil(b002.mo108765s2()) || (o = C76552z.m92077o(b002.mo108765s2())) == null || Util.isNullOrNil(o.f224051b))) {
            o.f224058i = 3;
            o.f224055f = 0;
            o.f224059j = System.currentTimeMillis() / 1000;
            o.f224060k = System.currentTimeMillis() / 1000;
            o.f224050a = 8648;
            C76552z.m92088z(o);
            Log.m105918d("MicroMsg.VoiceLogic", " file:" + o.f224051b + " msgid:" + o.f224062m + "  stat:" + o.f224058i);
            if (o.f224062m == 0 || Util.isNullOrNil(o.f224052c)) {
                Log.m105920e("MicroMsg.VoiceLogic", " failed msg id:" + o.f224062m + " user:" + o.f224052c);
            } else {
                b002.mo100991d(1);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
                C76546u.xx0().mo107480e();
            }
        }
        return false;
    }
}
