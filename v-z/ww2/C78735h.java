package ww2;

import com.tencent.p014mm.autogen.events.ResendVoiceRemindMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import uw2.C78291e;
import uw2.C78295i;
import uw2.C78296j;

/* renamed from: ww2.h */
public class C78735h extends IStaticListener<ResendVoiceRemindMsgEvent> {
    public boolean callback(IEvent iEvent) {
        C78295i c;
        int msgId = (int) ((ResendVoiceRemindMsgEvent) iEvent).f193919d.f193920a.getMsgId();
        C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00((long) msgId);
        if (!(b002.getMsgId() == 0 || b002.mo108765s2() == null || Util.isNullOrNil(b002.mo108765s2()) || (c = C78296j.m94585c(b002.mo108765s2())) == null || Util.isNullOrNil(c.field_filename))) {
            c.field_status = 3;
            c.field_offset = 0;
            c.field_createtime = System.currentTimeMillis() / 1000;
            c.field_lastmodifytime = System.currentTimeMillis() / 1000;
            c.f229349U = 16840;
            C78296j.m94588f(c);
            Log.m105918d("MicroMsg.VoiceRemindLogic", " file:" + c.field_filename + " msgid:" + c.field_msglocalid + "  stat:" + c.field_status);
            if (c.field_msglocalid == 0 || Util.isNullOrNil(c.field_user)) {
                Log.m105920e("MicroMsg.VoiceRemindLogic", " failed msg id:" + c.field_msglocalid + " user:" + c.field_user);
            } else {
                b002.mo100991d(1);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                C78291e.wx0().mo108316c();
            }
        }
        return false;
    }
}
