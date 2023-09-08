package com.tencent.p014mm.plugin.finder.utils;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58741j5;
import er1.C58769q0;
import er1.C58774s0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import o40.C61926c;
import p599lr.C61381b;
import qo1.C63294j;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C77813z;
import up1.C37521f;
import ux3.C65486b;

/* renamed from: com.tencent.mm.plugin.finder.utils.FinderFolderClearManager */
public final class FinderFolderClearManager {

    /* renamed from: a */
    public static final FinderFolderClearManager f161637a = new FinderFolderClearManager();

    /* renamed from: b */
    public static final String f161638b = "Finder.FinderFolderClearManager";

    /* renamed from: c */
    public static long f161639c;

    /* renamed from: d */
    public static final Object f161640d = new Object();

    /* renamed from: e */
    public static int f161641e;

    /* renamed from: f */
    public static boolean f161642f;

    /* renamed from: g */
    public static long f161643g;

    /* renamed from: com.tencent.mm.plugin.finder.utils.FinderFolderClearManager$a */
    public static final class C56494a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C58769q0) ((C13604l) t).f38556e).f168265e), Integer.valueOf(((C58769q0) ((C13604l) t2).f38556e).f168265e));
        }
    }

    static {
        MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        singleDefault.putString("finder_vfs_storage_config", C37521f.f99251O7.mo60266n());
        fVar.getClass();
        singleDefault.putLong("finder_vfs_storage_first_page_config", ((long) (C37521f.f99454m2.mo60266n().intValue() + 86400)) * 1000);
        fVar.getClass();
        singleDefault.putString("finder_live_vfs_storage_config", C37521f.f99259P7.mo60266n());
        fVar.getClass();
        singleDefault.putString("finder_live_replay_vfs_storage_config", C37521f.f99268Q7.mo60266n());
        new IListener<HomeUITabChangeEvent>(C40008f.f107254d) {

            /* renamed from: d */
            public int f161644d = -1;

            public boolean callback(IEvent iEvent) {
                HomeUITabChangeEvent homeUITabChangeEvent = (HomeUITabChangeEvent) iEvent;
                C87412m.m108594g(homeUITabChangeEvent, "event");
                if (homeUITabChangeEvent.f78831d.f78832a != 2 && this.f161644d == 2 && FinderFolderClearManager.f161642f && FinderFolderClearManager.f161641e <= 0) {
                    FinderFolderClearManager.f161637a.getClass();
                    C61926c.m72658C((String) null, C58774s0.f168275d, 1, (Object) null);
                    FinderFolderClearManager.f161642f = false;
                }
                this.f161644d = homeUITabChangeEvent.f78831d.f78832a;
                return false;
            }
        }.alive();
    }

    /* renamed from: a */
    public final void mo79382a() {
        Class cls = C61381b.class;
        Log.m105924i(f161638b, "dumpAndMark");
        long a = C31543z5.m39451a();
        if (a - f161639c >= C37521f.f99374d.mo61186l()) {
            long currentTicks = Util.currentTicks();
            f161639c = a;
            ArrayList<C13604l> arrayList = new ArrayList<>();
            C58741j5 j5Var = C58741j5.f168184a;
            for (C58769q0 q0Var : C58741j5.f168197n) {
                C13604l<Integer, Long> a2 = q0Var.mo83807a(false);
                ((Number) a2.f38555d).intValue();
                long longValue = ((Number) a2.f38556e).longValue();
                f161637a.getClass();
                if (q0Var.f168264d && longValue > q0Var.f168263c) {
                    synchronized (f161640d) {
                        Log.m105924i(f161638b, "mark: size " + longValue + ", name " + q0Var.f168262b + ", path " + q0Var.f168261a);
                        MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
                        Set<String> stringSet = singleDefault.getStringSet("FINDER_MARK_DEL_FOLDERS", new HashSet());
                        C87412m.m108591d(stringSet);
                        stringSet.add(q0Var.f168261a);
                        singleDefault.putStringSet("FINDER_MARK_DEL_FOLDERS", stringSet).commit();
                    }
                }
                if (q0Var.f168265e > 0) {
                    arrayList.add(new C13604l(Long.valueOf(longValue), q0Var));
                }
            }
            if (arrayList.size() > 1) {
                C77813z.m93909o(arrayList, new C56494a());
            }
            ((C61381b) C86312j.m106911c(cls)).mo78555oT().mo12434i(Util.ticksToNow(currentTicks));
            C63294j oT = ((C61381b) C86312j.m106911c(cls)).mo78555oT();
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C13604l lVar : arrayList) {
                arrayList2.add(Long.valueOf(((Number) lVar.f38555d).longValue()));
            }
            oT.mo12431f(arrayList2);
        }
    }
}
