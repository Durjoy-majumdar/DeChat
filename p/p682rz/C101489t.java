package p682rz;

import p261wl.C15510f;

/* renamed from: rz.t */
public interface C101489t {

    /* renamed from: rz.t$a */
    public interface C77595a {

        /* renamed from: rz.t$a$a */
        public static final class C77596a {

            /* renamed from: a */
            public final String f226215a;

            /* renamed from: b */
            public final C77598b f226216b;

            /* renamed from: c */
            public final C77597c f226217c;

            /* renamed from: d */
            public final int f226218d;

            public C77596a(String str, C77598b bVar, C77597c cVar, int i, long j) {
                this.f226215a = str;
                this.f226216b = bVar;
                this.f226217c = cVar;
                this.f226218d = i;
            }
        }

        /* renamed from: rz.t$a$c */
        public enum C77597c {
            NORMAL,
            UPLOAD,
            DOWNLOAD
        }

        /* renamed from: rz.t$a$b */
        public enum C77598b {
            INSERT,
            DELETE,
            UPDATE
        }

        /* renamed from: d5 */
        void mo102579d5(C77596a aVar);
    }

    /* renamed from: rz.t$b */
    public interface C101490b extends C15510f {
        /* renamed from: d5 */
        void mo140978d5(C77595a.C77596a aVar);
    }
}
