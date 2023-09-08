package com.tencent.p014mm.plugin.expansions;

import android.util.Pair;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import kj2.C117407d;

/* renamed from: com.tencent.mm.plugin.expansions.o */
public final class C29890o {

    /* renamed from: a */
    public static final ArrayList<IDKey> f80973a = new ArrayList<>();

    /* renamed from: b */
    public static final List<Pair<String, Object>> f80974b = new ArrayList();

    /* renamed from: a */
    public static void m38898a(String str, String str2) {
        ((ArrayList) f80974b).add(new Pair(str, str2));
    }

    /* renamed from: b */
    public static void m38899b(int i, int i2) {
        MultiProcessMMKV.getDefault().putInt("expansions_error_reason", i2);
        if (C86709a0.m107528h().f251724a.f251792d) {
            C117407d.INSTANCE.idkeyStat((long) i, (long) i2, 1, false);
            return;
        }
        IDKey iDKey = new IDKey(i, i2, 1);
        ArrayList<IDKey> arrayList = f80973a;
        synchronized (arrayList) {
            arrayList.add(iDKey);
        }
    }
}
