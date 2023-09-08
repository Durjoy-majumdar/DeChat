package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import n11.C109669c;
import te3.C64643pz;
import te3.C64670qz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.a0 */
public class C105127a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64670qz f312145d;

    /* renamed from: e */
    public final /* synthetic */ int f312146e;

    /* renamed from: f */
    public final /* synthetic */ C105129b0 f312147f;

    public C105127a0(C105129b0 b0Var, C64670qz qzVar, int i) {
        this.f312147f = b0Var;
        this.f312145d = qzVar;
        this.f312146e = i;
    }

    public void run() {
        LinkedList<C64643pz> linkedList;
        LinkedList<C64643pz> linkedList2;
        C105165o oVar = this.f312147f.f312150a.f312376f;
        C64670qz qzVar = this.f312145d;
        oVar.f312278a.clear();
        if (!(qzVar == null || (linkedList2 = qzVar.f185099f) == null || linkedList2.size() == 0)) {
            Log.m105926v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "updateMembers imroomid: " + qzVar.f185097d + " roomid: " + qzVar.f185098e + " member_change_from: " + qzVar.f185101h + " member_change_seq: " + qzVar.f185100g + " member_list: " + qzVar.f185099f.size());
            Iterator<C64643pz> it = qzVar.f185099f.iterator();
            while (it.hasNext()) {
                C64643pz next = it.next();
                C109669c cVar = new C109669c();
                cVar.f328293a = next.f184926d;
                cVar.f328294b = next.f184927e;
                cVar.f328295c = next.f184929g;
                oVar.f312278a.add(cVar);
                Log.m105926v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "updateMembers " + cVar.toString());
            }
        }
        C105140f1 f1Var = this.f312147f.f312150a.f312378h;
        C64670qz qzVar2 = this.f312145d;
        f1Var.getClass();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId");
        if (!(qzVar2 == null || (linkedList = qzVar2.f185099f) == null || linkedList.size() == 0)) {
            LinkedList<C64643pz> linkedList3 = qzVar2.f185099f;
            synchronized (f1Var.f312169b) {
                Iterator<C64643pz> it4 = linkedList3.iterator();
                while (it4.hasNext()) {
                    C64643pz next2 = it4.next();
                    for (Map.Entry value : ((HashMap) f1Var.f312169b).entrySet()) {
                        C105130c cVar2 = (C105130c) value.getValue();
                        if (cVar2 != null) {
                            if (cVar2.getOpenId().equals(next2.f184927e)) {
                                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceVideoMgr", "updateMemberId viewId: " + cVar2.getViewId() + " openId: " + cVar2.getOpenId() + " mid: [" + cVar2.getMemberId() + "->" + next2.f184926d);
                                cVar2.mo149436h(next2.f184926d);
                            }
                        }
                    }
                }
            }
        }
        C105181w wVar = this.f312147f.f312150a;
        if (wVar.f312381n == C105181w.C85161i.InRoom) {
            C85147b<ArrayList<C109669c>> bVar = wVar.f312392x;
            if (bVar == null) {
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentMemeberChangeCallback is null");
            } else if (this.f312146e == 0) {
                bVar.mo118169a(0, 0, "ok", wVar.f312376f.f312278a);
            } else {
                Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "hy: invalid member list change. will ignore");
                this.f312147f.f312150a.f312392x.mo118169a(-10087, this.f312146e, "error in member change", null);
            }
        } else {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
        }
    }
}
