package p222qm;

import com.tencent.p014mm.app.C80610p1;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.autogen.events.ResendMsgEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import nj3.C76912y0;
import p682rz.C101488s;
import p740wo.C53193b;

/* renamed from: qm.x0 */
public class C77367x0 extends IStaticListener<ResendMsgEvent> {
    public boolean callback(IEvent iEvent) {
        C80610p1 p1Var = C80610p1.f235824f;
        C72963f4 f4Var = ((ResendMsgEvent) iEvent).f78932d.f78933a;
        if (f4Var != null) {
            Log.m105925i("MicroMsg.WorkerProfile", "resend msg, type:%d", Integer.valueOf(f4Var.getType()));
            if (f4Var.mo100995g4()) {
                C73673d4.m87251e(f4Var);
            } else if (f4Var.mo100979R3()) {
                C73673d4.m87250d(f4Var);
            } else if (f4Var.mo100973L3()) {
                C73673d4.m87249c(f4Var);
            } else if (f4Var.mo100993e4()) {
                Log.m105925i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", Long.valueOf(f4Var.getMsgId()));
                C73673d4.m87252f(f4Var);
            } else if (f4Var.mo100982U3()) {
                Log.m105925i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", Long.valueOf(f4Var.getMsgId()));
                C73673d4.m87252f(f4Var);
            } else if (f4Var.mo101022y3()) {
                C73673d4.m87247a(f4Var);
            } else if (f4Var.mo101020w3()) {
                Log.m105925i("MicroMsg.ResendMsgLogic", "resendAppMsg, msgId:%d", Long.valueOf(f4Var.getMsgId()));
                long o = C75604z3.m90843o(f4Var.mo108768t());
                if (o == f4Var.getCreateTime()) {
                    o++;
                }
                f4Var.mo108733M2(o);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                String content = f4Var.getContent();
                int t2 = f4Var.mo108769t2();
                if (((C53193b) C86312j.m106911c(C53193b.class)).i90(f4Var.mo108768t()) && content != null && t2 == 0) {
                    content = C75604z3.m90849u(content);
                }
                C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
                if ((u == null || 19 != u.f195582i) && (u == null || 24 != u.f195582i)) {
                    C72695v.m85081w(f4Var);
                } else {
                    RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
                    RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
                    aVar.f265029a = 4;
                    aVar.f265039k = f4Var;
                    aVar.f265033e = f4Var.mo108768t();
                    recordOperationEvent.publish();
                }
                C75604z3.m90834f(f4Var.getMsgId());
            } else if (f4Var.mo100975N3()) {
                C73673d4.m87248b(f4Var);
            } else if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
                Class cls = C101488s.class;
                long o2 = C75604z3.m90843o(f4Var.mo108768t());
                if (o2 == f4Var.getCreateTime()) {
                    o2++;
                }
                f4Var.mo108733M2(o2);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137720f(f4Var.mo108765s2());
                if (f != null) {
                    f.f288563j = f4Var.getCreateTime();
                    f.f288548P = 128;
                    ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137733w(f);
                    Log.m105925i("MicroMsg.ResendMsgLogic", "resendVideoMsg, msgId:%d, msgtime: %d, infotime:%d", Long.valueOf(f4Var.getMsgId()), Long.valueOf(f4Var.getCreateTime()), Long.valueOf(f.f288563j));
                }
                if (!C97625j3.m125812b().mo105883I()) {
                    C76912y0.m92772k(MMApplicationContext.getContext());
                } else {
                    C98429r0.m127797C(f4Var.mo108765s2());
                }
            } else {
                f4Var.mo100991d(5);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                Log.m105920e("MicroMsg.WorkerProfile", "resendMsg, unknown msg type");
            }
        }
        return false;
    }
}
