package com.tencent.p014mm.plugin.multitalk.model;

import c92.C104328f;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import v82.C111474m;

/* renamed from: com.tencent.mm.plugin.multitalk.model.x */
public class C105853x {

    /* renamed from: a */
    public static int f314823a;

    /* renamed from: b */
    public static int f314824b;

    /* renamed from: c */
    public static int f314825c;

    /* renamed from: d */
    public static int f314826d;

    /* renamed from: e */
    public static int f314827e;

    /* renamed from: f */
    public static int f314828f;

    /* renamed from: g */
    public static int f314829g;

    /* renamed from: h */
    public static int f314830h;

    /* renamed from: i */
    public static int f314831i;

    /* renamed from: a */
    public static void m142230a(int i) {
        C115669n nVar = C115669n.INSTANCE;
        C104328f fVar = C104328f.f308805a;
        nVar.mo160131h(26010, Integer.valueOf(i), Long.valueOf(C104328f.f308806b), Long.valueOf(C104328f.f308807c), Integer.valueOf(C111474m.f333737H));
    }

    /* renamed from: b */
    public static final void m142231b() {
        C115669n.INSTANCE.idkeyStat(220, 25, 1, false);
    }

    /* renamed from: c */
    public static final void m142232c(int i, int i2) {
        C115669n.INSTANCE.idkeyStat(220, (long) i, (long) i2, false);
    }

    /* renamed from: d */
    public static final void m142233d(boolean z) {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(220);
        iDKey.SetKey(3);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        if (z) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(220);
            iDKey2.SetKey(4);
            iDKey2.SetValue(1);
            arrayList.add(iDKey2);
        }
        C115669n.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: e */
    public static final void m142234e(boolean z) {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(220);
        iDKey.SetKey(5);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        if (z) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(220);
            iDKey2.SetKey(6);
            iDKey2.SetValue(1);
            arrayList.add(iDKey2);
        }
        C115669n.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: f */
    public static final void m142235f(int i, String str) {
        Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkReceiveCall %d %s", Integer.valueOf(i), str);
        C115669n.INSTANCE.mo160131h(12723, Integer.valueOf(i), str);
    }

    /* renamed from: g */
    public static final void m142236g(int i, boolean z, int i2, String str, int i3) {
        Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkSelectContact %d %b %d %s %d", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), str, Integer.valueOf(i3));
        C115669n.INSTANCE.mo160131h(12727, Integer.valueOf(i), Integer.valueOf(z ? 1 : 2), Integer.valueOf(i2), Integer.valueOf(i), str, Integer.valueOf(i3));
    }

    /* renamed from: h */
    public static final void m142237h(int i, String str, int i2) {
        Log.m105927v("MicroMsg.MT.MultiTalkKvReportUtil", "reportMultiTalkTalkMoreArrowClick %s,%s, %s", Integer.valueOf(i), str, Integer.valueOf(i2));
        C115669n.INSTANCE.mo160131h(19424, Integer.valueOf(i), 0, Integer.valueOf(i2), str);
    }

    /* renamed from: i */
    public static void m142238i(boolean z, boolean z2) {
        int i = !z ? 2 : 1;
        int i2 = !z2 ? 2 : 1;
        C115669n nVar = C115669n.INSTANCE;
        C104328f fVar = C104328f.f308805a;
        nVar.mo160131h(19424, Integer.valueOf(i), Long.valueOf(C104328f.f308807c), Integer.valueOf(i2), C104328f.f308812h, Long.valueOf(C104328f.f308806b));
    }
}
