package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p749xh.C112150i9;
import r33.C63359a;
import s33.C110728c;
import s33.C110732i;

/* renamed from: com.tencent.mm.plugin.voip.model.l */
public final class C106355l implements Runnable {

    /* renamed from: d */
    public static final C106355l f317384d = new C106355l();

    /* renamed from: a */
    public static final void m143307a(C112150i9 i9Var) {
        if (!C106357m.m143310c()) {
            Log.m105928w("MicroMsg.VoIPBubbleHelper", "shutDownNetScene: switch not enable, skip cgi call");
            return;
        }
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "shutDownNetScene: " + i9Var.mo163961z2() + ' ' + i9Var.mo163953r2() + ' ' + i9Var.mo163951p2());
        new C110732i((int) i9Var.mo163961z2(), i9Var.mo163927A2(), "", 8, (int) (System.currentTimeMillis() - i9Var.mo163952q2()), i9Var.mo163950o2() == 0 ? 0 : (int) (((i9Var.mo163948m2() > 0 ? i9Var.mo163948m2() : System.currentTimeMillis()) - i9Var.mo163950o2()) / ((long) 1000))).mo88544n1();
    }

    public final void run() {
        Object obj;
        long j;
        Class<C112150i9> cls = C112150i9.class;
        ArrayList arrayList = new ArrayList();
        SelectSql D2 = C112150i9.m152897D2(1);
        C87412m.m108593f(D2, "selectByRoom_state(ROOM_STATE_ROOM_CREATED)");
        List<C112150i9> multiQuery = D2.multiQuery(C63359a.f179730j.mo88266a().getDB(), cls);
        ArrayList<C112150i9> arrayList2 = new ArrayList<>();
        for (T next : multiQuery) {
            if (((C112150i9) next).mo163954s2() == 1) {
                arrayList2.add(next);
            }
        }
        for (C112150i9 i9Var : arrayList2) {
            if (i9Var.mo163947l2() != 0) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: " + i9Var.mo163961z2() + " has informed to backend");
            } else {
                if (i9Var.mo163957v2() != 1) {
                    m143307a(i9Var);
                } else if (!C106357m.m143310c()) {
                    Log.m105928w("MicroMsg.VoIPBubbleHelper", "cancelNetScene: switch not enable, skip cgi call");
                } else {
                    Log.m105924i("MicroMsg.VoIPBubbleHelper", "cancelNetScene: " + i9Var.mo163961z2() + ' ' + i9Var.mo163953r2() + ' ' + i9Var.mo163951p2());
                    new C110728c((int) i9Var.mo163961z2(), i9Var.mo163927A2(), i9Var.mo163928B2(), "", (int) i9Var.mo163953r2(), 5, (int) (System.currentTimeMillis() - i9Var.mo163952q2()), i9Var.mo163960y2()).mo88544n1();
                }
                i9Var.mo163929F2(1);
                C106357m mVar = C106357m.f317386a;
                mVar.mo152653p(i9Var);
                if (C106357m.m143308a(mVar, i9Var)) {
                    String string = MMApplicationContext.getContext().getString(i9Var.mo163957v2() == 1 ? C0966R.string.kex : C0966R.string.mze);
                    C87412m.m108593f(string, "getContext()\n           …string.voip_call_no_resp)");
                    mVar.mo152651j(i9Var, C106357m.m143309b(mVar, i9Var, string));
                    arrayList.add(i9Var);
                } else {
                    Log.m105928w("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: timeout, not allow to insert msg");
                }
            }
        }
        SelectSql D22 = C112150i9.m152897D2(2);
        C87412m.m108593f(D22, "selectByRoom_state(ROOM_STATE_ROOM_CONNECTED)");
        List<C112150i9> multiQuery2 = D22.multiQuery(C63359a.f179730j.mo88266a().getDB(), cls);
        ArrayList<C112150i9> arrayList3 = new ArrayList<>();
        for (T next2 : multiQuery2) {
            if (((C112150i9) next2).mo163954s2() == 1) {
                arrayList3.add(next2);
            }
        }
        for (C112150i9 i9Var2 : arrayList3) {
            if (i9Var2.mo163947l2() != 0) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: " + i9Var2.mo163961z2() + " has informed to backend");
            } else {
                m143307a(i9Var2);
                i9Var2.mo163929F2(1);
                C106357m mVar2 = C106357m.f317386a;
                mVar2.mo152653p(i9Var2);
                if (C106357m.m143308a(mVar2, i9Var2)) {
                    String string2 = MMApplicationContext.getContext().getString(C0966R.string.f361524ki2);
                    C87412m.m108593f(string2, "getContext()\n           …or_shutdown_without_time)");
                    mVar2.mo152651j(i9Var2, C106357m.m143309b(mVar2, i9Var2, string2));
                    arrayList.add(i9Var2);
                } else {
                    Log.m105928w("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: connected, timeout, not allow to insert msg");
                }
            }
        }
        SelectSql build = C112150i9.f335803y.select((List<? extends ISqlColumn>) new LinkedList()).where(C112150i9.f335779C.equal((Number) 0)).orderBy((List<? extends ISqlOrder>) new LinkedList()).groupBy((List<? extends Column>) new LinkedList()).build();
        C87412m.m108593f(build, "select().where(BaseVoIPB…\n                .build()");
        List<C112150i9> multiQuery3 = build.multiQuery(C63359a.f179730j.mo88266a().getDB(), cls);
        ArrayList<C112150i9> arrayList4 = new ArrayList<>();
        for (T next3 : multiQuery3) {
            if (((C112150i9) next3).mo163954s2() == 1) {
                arrayList4.add(next3);
            }
        }
        for (C112150i9 i9Var3 : arrayList4) {
            m143307a(i9Var3);
            i9Var3.mo163929F2(1);
            new UpdateExecutor(i9Var3, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseVoIPBubbleInfo").execute(C63359a.f179730j.mo88266a().getDB());
        }
        if (C106357m.m143310c()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next4 : arrayList) {
                String B2 = ((C112150i9) next4).mo163928B2();
                Object obj2 = linkedHashMap.get(B2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(B2, obj2);
                }
                ((List) obj2).add(next4);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Log.m105924i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: insert recall msg for " + ((String) entry.getKey()));
                Iterator it = ((Iterable) entry.getValue()).iterator();
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    if (it.hasNext()) {
                        long n2 = ((C112150i9) obj).mo163949n2();
                        do {
                            Object next5 = it.next();
                            long n25 = ((C112150i9) next5).mo163949n2();
                            if (n2 < n25) {
                                obj = next5;
                                n2 = n25;
                            }
                        } while (it.hasNext());
                    }
                }
                C112150i9 i9Var4 = (C112150i9) obj;
                if (i9Var4 != null) {
                    j = C106348g0.m143241b(i9Var4.mo163928B2(), MMApplicationContext.getContext().getString(C0966R.string.n68), i9Var4.mo163960y2() == 0, i9Var4.mo163949n2(), 2);
                    Log.m105924i("MicroMsg.VoIPBubbleHelper", "insertRecallData: at " + j);
                } else {
                    j = 0;
                }
                for (C112150i9 i9Var5 : (Iterable) entry.getValue()) {
                    i9Var5.mo163941R2(j);
                    new UpdateExecutor(i9Var5, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseVoIPBubbleInfo").execute(C63359a.f179730j.mo88266a().getDB());
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - ((long) Downloads.MAX_RETYR_AFTER);
        Log.m105924i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: clear info before " + currentTimeMillis + ", item num " + C112150i9.f335803y.delete().where(C112150i9.f335780D.smallerThan((Number) Long.valueOf(currentTimeMillis))).build().run(C63359a.f179730j.mo88266a().getDB()));
    }
}
