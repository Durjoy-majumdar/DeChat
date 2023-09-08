package com.tencent.p014mm.autogen.layout;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.HashSet;
import p1161wh.C111800a;
import p1161wh.C111801b;
import p1161wh.C111802c;
import p1161wh.C111803d;
import p1161wh.C111804e;
import p1161wh.C111805f;
import p1161wh.C111806g;
import p1161wh.C111807h;
import p1161wh.C111808i;
import p1161wh.C111809j;
import p1161wh.C111810k;
import wq3.C111839b;
import wq3.C111849j;

/* renamed from: com.tencent.mm.autogen.layout.BootX2CFactory */
public class BootX2CFactory extends C111839b {
    public BootX2CFactory() {
        this.f334878c = System.currentTimeMillis();
        this.f334876a = new HashMap<>(11);
        mo163579g(C0966R.C0971layout.d_a, new C111801b());
        mo163579g(C0966R.C0971layout.d_5, new C111800a());
        mo163579g(C0966R.C0971layout.d5p, new C111810k());
        mo163579g(C0966R.C0971layout.d0h, new C111802c());
        mo163579g(C0966R.C0971layout.f360008d32, new C111805f());
        mo163579g(C0966R.C0971layout.d5m, new C111806g());
        mo163579g(C0966R.C0971layout.d5n, new C111809j());
        mo163579g(C0966R.C0971layout.f360009d33, new C111807h());
        mo163579g(C0966R.C0971layout.d2v, new C111803d());
        mo163579g(C0966R.C0971layout.d0j, new C111804e());
        mo163579g(C0966R.C0971layout.f360010d34, new C111808i());
        Object[] objArr = new Object[2];
        HashMap<Integer, C111849j> hashMap = this.f334876a;
        objArr[0] = hashMap != null ? Integer.valueOf(hashMap.size()) : null;
        objArr[1] = Long.valueOf(System.currentTimeMillis() - this.f334878c);
        Log.m105919d("MicroMsg.X2C.BaseViewCreatorFactory", "onRegisterViewCreatorEnd creatorSize:%s cost:%s", objArr);
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(C0966R.C0971layout.f7088xw));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.bcy));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.c9r));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.bok));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.beo));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.bdc));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.c8w));
        hashSet.add(Integer.valueOf(C0966R.C0971layout.f359898bh1));
        this.f334877b.put("ContactInfoUI", hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.d0h));
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.d2v));
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.f360009d33));
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.f360008d32));
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.d0j));
        hashSet2.add(Integer.valueOf(C0966R.C0971layout.f360010d34));
        this.f334877b.put("SnsTimeLineUI", hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(Integer.valueOf(C0966R.C0971layout.cqs));
        hashSet3.add(Integer.valueOf(C0966R.C0971layout.asm));
        hashSet3.add(Integer.valueOf(C0966R.C0971layout.cqw));
        hashSet3.add(Integer.valueOf(C0966R.C0971layout.asz));
        hashSet3.add(Integer.valueOf(C0966R.C0971layout.f6311bc));
        this.f334877b.put("FTSDetailUI", hashSet3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add(Integer.valueOf(C0966R.C0971layout.bc7));
        hashSet4.add(Integer.valueOf(C0966R.C0971layout.b_v));
        hashSet4.add(Integer.valueOf(C0966R.C0971layout.f6312bd));
        hashSet4.add(Integer.valueOf(C0966R.C0971layout.f6305b7));
        hashSet4.add(Integer.valueOf(C0966R.C0971layout.f6306b8));
        this.f334877b.put("LauncherUI", hashSet4);
    }
}
