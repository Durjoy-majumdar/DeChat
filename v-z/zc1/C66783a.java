package zc1;

import bd1.C0263a;
import bd1.C0264h;
import bd1.C39757e;
import bd1.C39758f;
import bd1.C39759i;
import bd1.C54446b;
import bd1.C54447c;
import bd1.C54449g;
import bl3.C54491d;
import java.util.List;
import kotlin.Result;
import ob0.C89132b;
import te3.C49998jj0;
import te3.C50119ke1;
import te3.C51430tq0;
import wx3.C15601d;

/* renamed from: zc1.a */
public interface C66783a extends C54491d<C54449g> {

    /* renamed from: zc1.a$a */
    public static final class C66784a {
        /* renamed from: a */
        public static /* synthetic */ C54446b m78798a(C66783a aVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                return aVar.mo90661N1(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFinderAccountBy");
        }

        /* renamed from: b */
        public static /* synthetic */ List m78799b(C66783a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return aVar.mo90668b2(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFinderAccounts");
        }

        /* renamed from: c */
        public static /* synthetic */ C54446b m78800c(C66783a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return aVar.mo90678t0(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFinderDefaultAccount");
        }
    }

    /* renamed from: C2 */
    void mo90655C2(C39759i iVar);

    /* renamed from: D2 */
    void mo90656D2(C39759i iVar);

    /* renamed from: E1 */
    void mo90657E1(String str, C0264h hVar);

    /* renamed from: I1 */
    String mo90658I1();

    /* renamed from: J2 */
    Object mo90659J2(C0263a aVar, C15601d<? super Result<? extends C49998jj0>> dVar);

    /* renamed from: L2 */
    void mo90660L2(String str, C39759i iVar);

    /* renamed from: N1 */
    C54446b mo90661N1(String str, boolean z);

    /* renamed from: O5 */
    String mo90662O5();

    /* renamed from: P2 */
    C0264h mo90663P2(String str);

    /* renamed from: S */
    C89132b<C50119ke1> mo90664S(int i);

    /* renamed from: S0 */
    boolean mo90665S0(C39758f fVar, C39759i iVar);

    /* renamed from: W0 */
    Object mo90666W0(String str, C15601d<? super Result<? extends C51430tq0>> dVar);

    /* renamed from: X1 */
    void mo90667X1(String str);

    /* renamed from: b2 */
    List<C54446b> mo90668b2(boolean z);

    void initialize();

    /* renamed from: m1 */
    boolean mo90672m1(C54447c cVar, C39759i iVar);

    /* renamed from: n0 */
    C39757e mo90673n0();

    /* renamed from: o0 */
    void mo90674o0(boolean z);

    /* renamed from: o1 */
    List<String> mo90675o1(boolean z);

    /* renamed from: q0 */
    boolean mo90676q0(String str);

    /* renamed from: q1 */
    boolean mo90677q1(String str);

    /* renamed from: t0 */
    C54446b mo90678t0(boolean z);

    /* renamed from: u0 */
    Object mo90679u0(int i, C15601d<? super Result<? extends C50119ke1>> dVar);

    /* renamed from: v4 */
    C89132b<C51430tq0> mo90680v4(String str);

    /* renamed from: z1 */
    boolean mo90681z1();
}
