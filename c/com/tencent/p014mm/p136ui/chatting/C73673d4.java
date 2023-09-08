package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.autogen.events.ResendVoiceMsgEvent;
import com.tencent.p014mm.autogen.events.ResendVoiceRemindMsgEvent;
import com.tencent.p014mm.autogen.events.SendImageMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.autogen.events.UploadEmojiMsgEvent;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import pc0.C100760a0;

/* renamed from: com.tencent.mm.ui.chatting.d4 */
public class C73673d4 {
    /* renamed from: a */
    public static void m87247a(C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", Long.valueOf(f4Var.getMsgId()));
        long o = C75604z3.m90843o(f4Var.mo108768t());
        if (o == f4Var.getCreateTime()) {
            o++;
        }
        f4Var.mo108733M2(o);
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        C72683d Yt = C72709y1.vx0().mo100150Yt(f4Var.getMsgId());
        if (Yt == null || Yt.field_msgInfoId != f4Var.getMsgId()) {
            Log.m105918d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, directly send app mag");
            C72709y1.zx0().mo100169b(f4Var.getMsgId());
            return;
        }
        Log.m105918d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, upload app attach first");
        Yt.field_status = 101;
        Yt.field_offset = 0;
        Yt.field_lastModifyTime = System.currentTimeMillis() / 1000;
        C72709y1.vx0().update(Yt, new String[0]);
        C72709y1.zx0().mo100171d();
    }

    /* renamed from: b */
    public static void m87248b(C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", Long.valueOf(f4Var.getMsgId()));
        m87252f(f4Var);
    }

    /* renamed from: c */
    public static void m87249c(C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", Long.valueOf(f4Var.getMsgId()));
        UploadEmojiMsgEvent uploadEmojiMsgEvent = new UploadEmojiMsgEvent();
        uploadEmojiMsgEvent.f194000d.f194001a = f4Var;
        uploadEmojiMsgEvent.publish();
    }

    /* renamed from: d */
    public static void m87250d(C72963f4 f4Var) {
        SendImageMsgEvent sendImageMsgEvent = new SendImageMsgEvent();
        long o = C75604z3.m90843o(f4Var.mo108768t());
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.getCreateTime()), Long.valueOf(o));
        if (o == f4Var.getCreateTime()) {
            o++;
        }
        f4Var.mo108733M2(o);
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        sendImageMsgEvent.f193926d.f193927a = f4Var;
        sendImageMsgEvent.publish();
    }

    /* renamed from: e */
    public static void m87251e(C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", Long.valueOf(f4Var.getMsgId()));
        if (C72996z1.m85803I5(f4Var.mo108768t())) {
            ResendVoiceRemindMsgEvent resendVoiceRemindMsgEvent = new ResendVoiceRemindMsgEvent();
            resendVoiceRemindMsgEvent.f193919d.f193920a = f4Var;
            resendVoiceRemindMsgEvent.publish();
            return;
        }
        ResendVoiceMsgEvent resendVoiceMsgEvent = new ResendVoiceMsgEvent();
        resendVoiceMsgEvent.f193917d.f193918a = f4Var;
        resendVoiceMsgEvent.publish();
    }

    /* renamed from: f */
    public static void m87252f(C72963f4 f4Var) {
        long msgId = f4Var.getMsgId();
        if (msgId == -1) {
            Log.m105920e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId " + msgId);
        } else if (!f4Var.mo108768t().equals("medianote") || (C75592q0.m90787q() & 16384) != 0) {
            Log.m105919d("MicroMsg.ResendMsgLogic", "sendMsgInternal, start send msgId: %d", Long.valueOf(msgId));
            C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.TEXT);
            b.f295192f = msgId;
            b.f295189c = f4Var.getContent();
            b.f295187a = f4Var.mo108768t();
            b.f295191e = 0;
            b.f295194h = 2;
            if (!b.mo140195a().mo123694a()) {
                Log.m105920e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
                f4Var.mo100991d(5);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
                sendMsgFailEvent.f193928d.f193929a = f4Var;
                sendMsgFailEvent.publish();
                return;
            }
            long o = C75604z3.m90843o(f4Var.mo108768t());
            if (o == f4Var.getCreateTime()) {
                o++;
            }
            f4Var.mo108733M2(o);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        }
    }
}
