package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoingInitContactEvent;
import com.tencent.p014mm.autogen.events.ForceRefreshAllUnreadEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import eb0.C45629t0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.conversation.ConversationUnreadHelper */
public class ConversationUnreadHelper implements MStorageEx.IOnStorageChange, IStorageObserver<C72996z1> {

    /* renamed from: g */
    public static ConversationUnreadHelper f219386g = new ConversationUnreadHelper();

    /* renamed from: h */
    public static final HashMap<String, Integer> f219387h = new HashMap<>();

    /* renamed from: d */
    public volatile boolean f219388d;

    /* renamed from: e */
    public IListener<DoingInitContactEvent> f219389e;

    /* renamed from: f */
    public IListener<ForceRefreshAllUnreadEvent> f219390f;

    public ConversationUnreadHelper() {
        C40008f fVar = C40008f.f107254d;
        this.f219389e = new IListener<DoingInitContactEvent>(fVar) {
            {
                this.__eventId = -1611655951;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((DoingInitContactEvent) iEvent).f9047d.f9048a;
                if (i == 1) {
                    Log.m105924i("MicroMsg.ConversationUnreadHelper", "do init start");
                    ConversationUnreadHelper.this.f219388d = true;
                } else if (i == 2) {
                    Log.m105924i("MicroMsg.ConversationUnreadHelper", "do init end");
                    ConversationUnreadHelper.this.f219388d = false;
                    ConversationUnreadHelper.m89353a(ConversationUnreadHelper.this);
                }
                return false;
            }
        };
        this.f219390f = new IListener<ForceRefreshAllUnreadEvent>(fVar) {
            {
                this.__eventId = 918896522;
            }

            public boolean callback(IEvent iEvent) {
                ForceRefreshAllUnreadEvent forceRefreshAllUnreadEvent = (ForceRefreshAllUnreadEvent) iEvent;
                Log.m105924i("MicroMsg.ConversationUnreadHelper", "force refreshAll");
                if (ConversationUnreadHelper.this.f219388d) {
                    return true;
                }
                ConversationUnreadHelper.m89353a(ConversationUnreadHelper.this);
                return true;
            }
        };
        this.f219389e.alive();
        this.f219390f.alive();
    }

    /* renamed from: a */
    public static void m89353a(ConversationUnreadHelper conversationUnreadHelper) {
        conversationUnreadHelper.getClass();
        long currentTicks = Util.currentTicks();
        HashMap<String, Integer> hashMap = f219387h;
        synchronized (hashMap) {
            hashMap.clear();
        }
        Log.m105925i("MicroMsg.ConversationUnreadHelper", "refreshAll cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: b */
    public static int m89354b() {
        long j;
        int i;
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175911u(931, 25);
        HashMap<String, Integer> hashMap = f219387h;
        synchronized (hashMap) {
            if (hashMap.isEmpty()) {
                long currentTicks = Util.currentTicks();
                HashMap<String, C72976h2> f = C45629t0.m50819f(1);
                for (String next : f.keySet()) {
                    f219387h.put(next, Integer.valueOf(f.get(next).mo108786G2()));
                }
                C115669n.INSTANCE.mo175911u(931, 26);
                j = Util.ticksToNow(currentTicks);
            } else {
                nVar.mo175911u(931, 27);
                j = 0;
            }
            i = 0;
            for (String str : f219387h.keySet()) {
                i += f219387h.get(str).intValue();
            }
        }
        Log.m105925i("MicroMsg.ConversationUnreadHelper", "getTotalUnread totalUnread:%s cost:%s", Integer.valueOf(i), Long.valueOf(j));
        return i;
    }

    /* renamed from: c */
    public final boolean mo103776c(StorageObserverEvent<C72996z1> storageObserverEvent) {
        C72996z1 obj;
        if (storageObserverEvent.getEventId() == StorageEventId.getDELETE() || storageObserverEvent.getEventId() == StorageEventId.getINSERT() || (obj = storageObserverEvent.getObj()) == null || ((int) obj.f108320R1) <= 0 || C72996z1.m85796D5(obj.getUsername())) {
            return false;
        }
        Log.m105925i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact %s isMute %s, ChatRoomNotify %d", obj.getUsername(), Boolean.valueOf(C45628s0.m50746K(obj)), Integer.valueOf(obj.f149512S));
        return true;
    }

    public void onChanged(Object obj) {
        boolean z;
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        if (!this.f219388d) {
            if (storageObserverEvent.getEventId() == StorageEventId.getBATCH_EVENT()) {
                if (storageObserverEvent.getObjEventMap() != null) {
                    Iterator it = storageObserverEvent.getObjEventMap().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (mo103776c((StorageObserverEvent) ((Map.Entry) it.next()).getValue())) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (z) {
                    HashMap<String, Integer> hashMap = f219387h;
                    synchronized (hashMap) {
                        hashMap.clear();
                    }
                }
                Log.m105925i("MicroMsg.ConversationUnreadHelper", "batch event %s", Boolean.valueOf(z));
            } else if (mo103776c(storageObserverEvent)) {
                HashMap<String, Integer> hashMap2 = f219387h;
                synchronized (hashMap2) {
                    hashMap2.clear();
                }
            }
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (!(obj instanceof String)) {
            Log.m105919d("MicroMsg.ConversationUnreadHelper", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(this.f219388d);
        objArr[2] = mStorageEx != null ? mStorageEx.toString() : "null";
        Log.m105925i("MicroMsg.ConversationUnreadHelper", "onNotifyChange username:%s isIniting:%s stg:%s", objArr);
        if (mStorageEx instanceof C30783v3) {
            if (((ArrayList) C45629t0.m50820g()).contains(str)) {
                return;
            }
            if (i == 5) {
                HashMap<String, Integer> hashMap = f219387h;
                synchronized (hashMap) {
                    hashMap.clear();
                }
                return;
            }
            long currentTicks = Util.currentTicks();
            HashMap<String, Integer> hashMap2 = f219387h;
            synchronized (hashMap2) {
                Log.m105924i("MicroMsg.ConversationUnreadHelper", "refreshPartial start");
                if (!hashMap2.isEmpty()) {
                    int intValue = hashMap2.containsKey(str) ? hashMap2.get(str).intValue() : 0;
                    Log.m105925i("MicroMsg.ConversationUnreadHelper", "refreshPartial getUnread %s", str);
                    int d = !C45629t0.m50821h(str) ? C45629t0.m50817d(str, C45628s0.f123397c) : 0;
                    hashMap2.put(str, Integer.valueOf(d));
                    Log.m105925i("MicroMsg.ConversationUnreadHelper", "refreshPartial username %s, preUnread %d, unread %d", str, Integer.valueOf(intValue), Integer.valueOf(d));
                    Log.m105925i("MicroMsg.ConversationUnreadHelper", "refreshPartial cost %d ms", Long.valueOf(Util.ticksToNow(currentTicks)));
                }
            }
        } else if ((mStorageEx instanceof C44668u3) && i != 5 && i != 2 && !this.f219388d) {
            if (!Util.isNullOrNil(str)) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                if (z1Var != null && ((int) z1Var.f108320R1) > 0 && !C72996z1.m85796D5(str)) {
                    Log.m105925i("MicroMsg.ConversationUnreadHelper", "onContactStorageNotifyChange contact isMute %s, ChatRoomNotify %d", Boolean.valueOf(C45628s0.m50746K(z1Var)), Integer.valueOf(z1Var.f149512S));
                } else {
                    return;
                }
            } else {
                Log.m105924i("MicroMsg.ConversationUnreadHelper", "username is null");
            }
            HashMap<String, Integer> hashMap3 = f219387h;
            synchronized (hashMap3) {
                hashMap3.clear();
            }
        }
    }
}
