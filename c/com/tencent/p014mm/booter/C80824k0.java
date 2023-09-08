package com.tencent.p014mm.booter;

import com.tencent.p014mm.sdk.platformtools.Util;
import iu3.C117279h;
import oa1.C117731d;
import zt3.C119140a;
import zt3.C119154h;

/* renamed from: com.tencent.mm.booter.k0 */
public class C80824k0 implements C119154h.C91937a {

    /* renamed from: com.tencent.mm.booter.k0$a */
    public enum C80825a {
        MAIN_PROCESS {
            /* renamed from: a */
            public C119140a mo112575a(C119140a.C119142b bVar) {
                boolean isEqual = Util.isEqual(C117731d.m166007c().mo182444f("clicfg_android_kotlin_coroutine_dispatchers_hook", "1", false, true), "1");
                int i = this.f237591d;
                C119140a aVar = bVar.f356829a;
                aVar.f356823b = i * 4;
                aVar.f356822a = i * 6;
                C119140a aVar2 = bVar.f356829a;
                aVar2.f356824c = (int) Math.max(8.0f, ((float) i) * 1.5f);
                aVar2.f356825d = 259200000;
                aVar2.f356827f = true;
                aVar2.f356826e = C117279h.C108487a.f324805d;
                aVar2.f356828g = isEqual;
                return aVar2;
            }
        },
        TOOL_PROCESS {
            /* renamed from: a */
            public C119140a mo112575a(C119140a.C119142b bVar) {
                int i = this.f237591d;
                C119140a aVar = bVar.f356829a;
                aVar.f356823b = i * 4;
                aVar.f356822a = i * 6;
                int b = mo112576b();
                C119140a aVar2 = bVar.f356829a;
                aVar2.f356824c = b;
                aVar2.f356825d = 259200000;
                aVar2.f356827f = true;
                aVar2.f356826e = C117279h.C108487a.f324805d;
                return aVar2;
            }

            /* renamed from: b */
            public int mo112576b() {
                return (int) Math.max(8.0f, ((float) this.f237591d) * 1.5f);
            }
        },
        OTHER {
            /* renamed from: a */
            public C119140a mo112575a(C119140a.C119142b bVar) {
                int i = this.f237591d;
                C119140a aVar = bVar.f356829a;
                aVar.f356823b = i * 4;
                aVar.f356822a = i * 6;
                int b = mo112577b();
                C119140a aVar2 = bVar.f356829a;
                aVar2.f356824c = b;
                aVar2.f356825d = 259200000;
                aVar2.f356827f = true;
                aVar2.f356826e = C117279h.C108487a.f324805d;
                return aVar2;
            }

            /* renamed from: b */
            public int mo112577b() {
                return (int) Math.max(8.0f, ((float) this.f237591d) * 1.5f);
            }
        };
        

        /* renamed from: d */
        public int f237591d;

        /* access modifiers changed from: public */
        C80825a(C114712h0 h0Var) {
            this.f237591d = Math.min(4, Runtime.getRuntime().availableProcessors());
        }

        /* renamed from: a */
        public C119140a mo112575a(C119140a.C119142b bVar) {
            return bVar.f356829a;
        }
    }
}
