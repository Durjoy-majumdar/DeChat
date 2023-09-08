package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import n11.C109669c;
import te3.C64407gz;
import te3.C64433hz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c0 */
public class C105131c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64433hz f312151d;

    /* renamed from: e */
    public final /* synthetic */ int f312152e;

    /* renamed from: f */
    public final /* synthetic */ C105133d0 f312153f;

    public C105131c0(C105133d0 d0Var, C64433hz hzVar, int i) {
        this.f312153f = d0Var;
        this.f312151d = hzVar;
        this.f312152e = i;
    }

    public void run() {
        LinkedList<C64407gz> linkedList;
        String str;
        C105165o oVar = this.f312153f.f312157a.f312376f;
        C64433hz hzVar = this.f312151d;
        oVar.f312279b.clear();
        if (!(hzVar == null || (linkedList = hzVar.f183570f) == null || linkedList.size() == 0)) {
            Log.m105926v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "updateAvMembers imroomid: " + hzVar.f183568d + " roomid: " + hzVar.f183569e + " member_list: " + hzVar.f183570f.size());
            Iterator<C64407gz> it = hzVar.f183570f.iterator();
            while (it.hasNext()) {
                C64407gz next = it.next();
                int i = next.f183378d;
                ArrayList<C109669c> arrayList = oVar.f312278a;
                if (arrayList != null) {
                    Iterator<C109669c> it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        C109669c next2 = it4.next();
                        if (next2 != null && i == next2.f328293a) {
                            str = next2.f328294b;
                            break;
                        }
                    }
                }
                str = null;
                if (Util.isNullOrNil(str)) {
                    Log.m105926v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "updateAvMembers get openId failed, memberid: " + next.f183378d);
                } else {
                    C109669c cVar = new C109669c();
                    cVar.f328294b = str;
                    cVar.f328293a = next.f183378d;
                    cVar.f328295c = next.f183379e;
                    oVar.f312279b.add(cVar);
                    Log.m105926v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "updateAvMembers " + cVar.toString());
                }
            }
        }
        if (this.f312152e != 0) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceService", "avmembers changed error: " + this.f312152e);
            return;
        }
        C105181w wVar = this.f312153f.f312157a;
        if (wVar.f312381n != C105181w.C85161i.InRoom) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room. do not notify");
            return;
        }
        C85147b<Map<String, Object>> bVar = wVar.f312396z;
        if (bVar == null) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceService", "hy: mCurrentVideoMemberChangeCallback is null");
        } else {
            bVar.mo118169a(0, 0, "ok", wVar.f312376f.mo149484a());
        }
    }
}
