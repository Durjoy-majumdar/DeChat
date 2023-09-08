package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105165o;
import com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105181w;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TimerTask;
import n11.C109669c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n */
public class C105161n extends TimerTask {

    /* renamed from: d */
    public final /* synthetic */ C105165o f312274d;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n$a */
    public class C105162a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.n$a$a */
        public class C105163a implements Comparator<C109669c> {
            public C105163a(C105162a aVar) {
            }

            public int compare(Object obj, Object obj2) {
                int i = ((C109669c) obj).f328293a;
                int i2 = ((C109669c) obj2).f328293a;
                if (i > i2) {
                    return 1;
                }
                return i < i2 ? -1 : 0;
            }
        }

        public C105162a() {
        }

        public void run() {
            boolean z;
            C105161n.this.f312274d.f312281d++;
            if (C105181w.INSTANCE.f312381n == C105181w.C85161i.InRoom) {
                ArrayList<C109669c> arrayList = new ArrayList<>(5);
                Iterator<C109669c> it = C105161n.this.f312274d.f312278a.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    C109669c next = it.next();
                    C105181w.INSTANCE.getClass();
                    boolean z2 = C105172s.f312297c.GetVoiceActivity(next.f328293a) > 0;
                    if (C105161n.this.f312274d.f312281d % 5 == 0) {
                        Log.m105927v("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "hy: member %s is talking %b", next, Boolean.valueOf(z2));
                    }
                    if (z2) {
                        arrayList.add(next);
                    }
                }
                Collections.sort(arrayList, new C105163a(this));
                C105165o oVar = C105161n.this.f312274d;
                if (oVar.f312280c != null) {
                    if (arrayList.size() == oVar.f312280c.size()) {
                        int i = 0;
                        while (true) {
                            if (i >= arrayList.size()) {
                                break;
                            } else if (arrayList.get(i).f328293a != oVar.f312280c.get(i).f328293a) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    z = false;
                }
                if (!z) {
                    synchronized (C105161n.this.f312274d.f312282e) {
                        Iterator<C105165o.C105166a> it4 = C105161n.this.f312274d.f312282e.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo149470a(arrayList);
                        }
                    }
                }
                C105161n.this.f312274d.f312280c = arrayList;
                return;
            }
            Log.m105928w("MicroMsg.OpenVoice.OpenVoiceMemberMgr", "hy: not in room, ignore speaker change");
        }
    }

    public C105161n(C105165o oVar) {
        this.f312274d = oVar;
    }

    public void run() {
        C105181w.INSTANCE.mo149500g(new C105162a());
    }
}
