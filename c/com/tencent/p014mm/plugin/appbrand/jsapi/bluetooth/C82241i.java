package com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.mars.smc.IDKey;
import hr0.C87583a;
import java.util.ArrayList;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i */
public class C82241i {
    /* renamed from: a */
    public static void m100982a(int i) {
        ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(762, (long) i, 1, false);
    }

    /* renamed from: b */
    public static void m100983b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(762);
        iDKey.SetKey(i);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(762);
        iDKey2.SetKey(i2);
        iDKey2.SetValue(1);
        arrayList.add(iDKey2);
        ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121687a(arrayList, true);
    }
}
