package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import lu3.C109426i;
import lu3.C34379c;
import te3.C64643pz;
import te3.C64670qz;
import te3.et4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s */
public class C105689s {

    /* renamed from: a */
    public ArrayList<C105683r> f314253a = new ArrayList<>(10);

    /* renamed from: b */
    public long f314254b;

    /* renamed from: c */
    public long f314255c;

    /* renamed from: d */
    public String f314256d;

    /* renamed from: e */
    public ArrayList<C105683r> f314257e;

    /* renamed from: f */
    public String f314258f;

    /* renamed from: g */
    public long f314259g;

    /* renamed from: h */
    public String f314260h;

    /* renamed from: i */
    public ArrayList<C105683r> f314261i = new ArrayList<>(10);

    /* renamed from: j */
    public final ArrayList<C105693b> f314262j = new ArrayList<>(2);

    /* renamed from: k */
    public C34379c<?> f314263k;

    /* renamed from: l */
    public final C109426i f314264l = new C105690a();

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s$a */
    public class C105690a implements C109426i {

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s$a$a */
        public class C105691a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s$a$a$a */
            public class C105692a implements Comparator<C105683r> {
                public C105692a(C105691a aVar) {
                }

                public int compare(Object obj, Object obj2) {
                    int i = ((C105683r) obj).f314237a;
                    int i2 = ((C105683r) obj2).f314237a;
                    if (i > i2) {
                        return 1;
                    }
                    return i < i2 ? -1 : 0;
                }
            }

            public C105691a() {
            }

            public void run() {
                boolean z = true;
                if (C105724z.INSTANCE.f314401n == 1) {
                    ArrayList<C105683r> arrayList = new ArrayList<>(5);
                    Iterator<C105683r> it = C105689s.this.f314253a.iterator();
                    while (it.hasNext()) {
                        C105683r next = it.next();
                        C105724z.INSTANCE.getClass();
                        boolean z2 = C105714w.f314302c.GetVoiceActivity(next.f314237a) > 0;
                        Log.m105927v("MicroMsg.Multitalk.ILinkMemberMgr", "hy: member %s is talking %b", next, Boolean.valueOf(z2));
                        if (z2) {
                            arrayList.add(next);
                        }
                    }
                    Collections.sort(arrayList, new C105692a(this));
                    C105689s sVar = C105689s.this;
                    if (sVar.f314261i != null) {
                        if (arrayList.size() == sVar.f314261i.size()) {
                            int i = 0;
                            while (true) {
                                if (i >= arrayList.size()) {
                                    break;
                                } else if (arrayList.get(i).f314237a != sVar.f314261i.get(i).f314237a) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        z = false;
                    }
                    if (!z) {
                        synchronized (C105689s.this.f314262j) {
                            Iterator<C105693b> it4 = C105689s.this.f314262j.iterator();
                            while (it4.hasNext()) {
                                it4.next().mo150558a(arrayList);
                            }
                        }
                    }
                    C105689s.this.f314261i = arrayList;
                    return;
                }
                Log.m105928w("MicroMsg.Multitalk.ILinkMemberMgr", "hy: not in room, ignore speaker change");
            }
        }

        public C105690a() {
        }

        public String getKey() {
            return "ILinkMemberMgr-mCheckMemberChangeTask";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            C105724z.INSTANCE.mo150614x(new C105691a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.s$b */
    public interface C105693b {
        /* renamed from: a */
        void mo150558a(ArrayList<C105683r> arrayList);
    }

    /* renamed from: a */
    public synchronized ArrayList<C105683r> mo150549a() {
        return (ArrayList) this.f314253a.clone();
    }

    /* renamed from: b */
    public C105683r mo150550b(String str) {
        ArrayList<C105683r> arrayList = this.f314253a;
        if (arrayList == null || str == null) {
            return null;
        }
        Iterator<C105683r> it = arrayList.iterator();
        while (it.hasNext()) {
            C105683r next = it.next();
            if (next != null && next.f314239c.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo150551c(int i) {
        ArrayList<C105683r> arrayList = this.f314253a;
        if (arrayList == null) {
            return null;
        }
        Iterator<C105683r> it = arrayList.iterator();
        while (it.hasNext()) {
            C105683r next = it.next();
            if (next != null && i == next.f314237a) {
                return next.f314239c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo150552d() {
        this.f314261i.clear();
        this.f314253a.clear();
        this.f314262j.clear();
        this.f314254b = 0;
        this.f314255c = 0;
        this.f314256d = null;
        this.f314257e = null;
        this.f314258f = null;
        synchronized (this.f314262j) {
            this.f314262j.clear();
        }
        C34379c<?> cVar = this.f314263k;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    /* renamed from: e */
    public void mo150553e(C64670qz qzVar, LinkedList<et4> linkedList, String str, String str2, C105598b<String> bVar) {
        LinkedList<C64643pz> linkedList2;
        ArrayList<C105683r> arrayList = new ArrayList<>();
        if (qzVar == null || (linkedList2 = qzVar.f185099f) == null || linkedList2.size() == 0) {
            this.f314253a.clear();
        } else {
            Iterator<C64643pz> it = qzVar.f185099f.iterator();
            while (it.hasNext()) {
                C64643pz next = it.next();
                C105683r rVar = new C105683r();
                rVar.f314237a = next.f184926d;
                rVar.f314238b = next.f184927e;
                rVar.f314241e = next.f184929g;
                rVar.f314239c = "";
                Iterator<et4> it4 = linkedList.iterator();
                while (it4.hasNext()) {
                    et4 next2 = it4.next();
                    Log.m105925i("MicroMsg.Multitalk.ILinkMemberMgr", "username %s, openid:%s", next2.f133116d, next2.f133117e);
                    if (next.f184927e.equals(next2.f133117e)) {
                        rVar.f314239c = next2.f133116d;
                    }
                    if (next2.f133116d.equals(str)) {
                        rVar.f314240d = str2;
                    }
                }
                arrayList.add(rVar);
                Log.m105925i("MicroMsg.Multitalk.ILinkMemberMgr", "steve: add member, memberid:%d openid:%s, username:%s, status %d, inviteName:%s", Integer.valueOf(rVar.f314237a), rVar.f314238b, rVar.f314239c, Integer.valueOf(rVar.f314241e), rVar.f314240d);
            }
        }
        this.f314253a = arrayList;
        this.f314257e = arrayList;
        if (bVar != null) {
            bVar.mo150477a(0, 0, (String) null, null);
        }
    }

    /* renamed from: f */
    public void mo150554f(int i, int i2) {
        ArrayList<C105683r> arrayList = this.f314253a;
        if (arrayList != null) {
            Iterator<C105683r> it = arrayList.iterator();
            while (it.hasNext()) {
                C105683r next = it.next();
                if (next != null && next.f314237a == i) {
                    next.f314242f = i2;
                }
            }
        }
    }
}
