package p953d8;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;

/* renamed from: d8.a */
public interface C86199a {

    /* renamed from: d8.a$a */
    public static class C86200a extends IOException {
        public C86200a(String str) {
            super(str);
        }

        public C86200a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: d8.a$b */
    public interface C86201b {
        /* renamed from: a */
        void mo120623a(C86199a aVar, C86209g gVar);

        /* renamed from: c */
        void mo120624c(C86199a aVar, C86209g gVar);

        /* renamed from: d */
        void mo120625d(C86199a aVar, C86209g gVar, C86209g gVar2);
    }

    /* renamed from: D */
    long mo120611D(String str, long j, long j2);

    /* renamed from: E */
    long mo120612E(String str);

    /* renamed from: F */
    NavigableSet<C86209g> mo120613F(String str, C86201b bVar);

    /* renamed from: G */
    File mo120614G(String str, long j, long j2);

    /* renamed from: H */
    long mo120615H();

    /* renamed from: I */
    void mo120616I(C86209g gVar);

    /* renamed from: J */
    void mo120617J(C86209g gVar);

    /* renamed from: K */
    C86209g mo120618K(String str, long j);

    /* renamed from: L */
    void mo120619L(String str, long j);

    /* renamed from: M */
    C86209g mo120620M(String str, long j);

    /* renamed from: N */
    void mo120621N(File file);

    /* renamed from: O */
    NavigableSet<C86209g> mo120622O(String str);
}
