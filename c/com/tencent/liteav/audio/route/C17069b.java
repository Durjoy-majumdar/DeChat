package com.tencent.liteav.audio.route;

import java.util.HashMap;

/* renamed from: com.tencent.liteav.audio.route.b */
public final class C17069b {

    /* renamed from: a */
    public final C17070a f46035a;

    /* renamed from: b */
    public boolean f46036b;

    /* renamed from: c */
    public int f46037c;

    /* renamed from: com.tencent.liteav.audio.route.b$a */
    public enum C17070a {
        NONE,
        EARPHONE,
        SPEAKERPHONE,
        WIRED_HEADSET,
        BLUETOOTH_HEADSET;
        

        /* renamed from: f */
        private static final HashMap<String, C17070a> f46043f = null;

        /* access modifiers changed from: public */
        static {
            f46043f = new HashMap<String, C17070a>() {
                {
                    put("NONE", C17070a.NONE);
                    put("EARPHONE", C17070a.EARPHONE);
                    put("SPEAKERPHONE", C17070a.SPEAKERPHONE);
                    put("WIRED_HEADSET", C17070a.WIRED_HEADSET);
                    put("BLUETOOTH_HEADSET", C17070a.BLUETOOTH_HEADSET);
                }
            };
        }

        /* renamed from: a */
        public static C17070a m16848a(String str) {
            C17070a aVar = f46043f.get(str);
            return aVar == null ? NONE : aVar;
        }
    }

    public C17069b(C17070a aVar, int i, boolean z) {
        this.f46035a = aVar;
        this.f46037c = i;
        this.f46036b = z;
    }
}
