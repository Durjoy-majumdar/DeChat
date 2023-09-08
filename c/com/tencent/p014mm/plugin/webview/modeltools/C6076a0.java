package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.a0 */
public class C6076a0 {

    /* renamed from: a */
    public HashMap<String, C6077a> f22385a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, C6077a> f22386b = new HashMap<>();

    /* renamed from: c */
    public HashSet<Integer> f22387c = new HashSet<>();

    /* renamed from: d */
    public HashMap<String, C6078b> f22388d = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.a0$a */
    public static class C6077a {

        /* renamed from: a */
        public String f22389a;

        /* renamed from: b */
        public String f22390b;

        /* renamed from: c */
        public String f22391c;

        /* renamed from: d */
        public String f22392d;
    }

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.a0$b */
    public static class C6078b {

        /* renamed from: a */
        public String f22393a;

        /* renamed from: b */
        public String f22394b;

        /* renamed from: c */
        public int f22395c;

        /* renamed from: d */
        public int f22396d;

        /* renamed from: e */
        public int f22397e;

        /* renamed from: f */
        public int f22398f;

        /* renamed from: g */
        public int f22399g;

        /* renamed from: h */
        public String f22400h;

        /* renamed from: i */
        public boolean f22401i;

        /* renamed from: j */
        public boolean f22402j;
    }

    /* renamed from: a */
    public void mo7017a(int i, String str) {
        if (Util.getBoolean(str, false)) {
            this.f22387c.add(Integer.valueOf(i));
        } else {
            this.f22387c.remove(Integer.valueOf(i));
        }
    }
}
