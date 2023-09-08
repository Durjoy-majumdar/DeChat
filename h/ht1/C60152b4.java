package ht1;

import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import eb0.C75592q0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49170dn1;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: ht1.b4 */
public interface C60152b4 {

    /* renamed from: ht1.b4$a */
    public static final class C8759a {

        /* renamed from: ht1.b4$a$a */
        public static final class C8760a extends C87413o implements C32226l<C55718s0, Boolean> {

            /* renamed from: d */
            public static final C8760a f28041d = new C8760a();

            public C8760a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((C55718s0) obj, LocaleUtil.ITALIAN);
                return Boolean.TRUE;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ C55718s0 m8561a(C60152b4 b4Var, C51978xi1 xi12, String str, HashSet hashSet, boolean z, C13604l lVar, C32226l lVar2, long j, boolean z2, int i, Object obj) {
            int i2 = i;
            if (obj == null) {
                return b4Var.mo77248T5(xi12, str, (i2 & 4) != 0 ? new HashSet() : hashSet, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? null : lVar, (i2 & 32) != 0 ? null : lVar2, (i2 & 64) != 0 ? 0 : j, (i2 & 128) != 0 ? false : z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addNewRedDotCtrlInfo");
        }

        /* renamed from: b */
        public static /* synthetic */ void m8562b(C60152b4 b4Var, int i, String str, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    str = C75592q0.m90778h();
                    C87412m.m108593f(str, "getDefaultFinderUsername()");
                }
                b4Var.mo77241N5(i, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearCtrlInfo");
        }

        /* renamed from: c */
        public static /* synthetic */ void m8563c(C60152b4 b4Var, String str, C32226l lVar, boolean z, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                if ((i & 8) != 0) {
                    str2 = C75592q0.m90778h();
                    C87412m.m108593f(str2, "getDefaultFinderUsername()");
                }
                b4Var.mo77266f6(str, lVar, z, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disposeRedDotAtPath");
        }

        /* renamed from: d */
        public static /* synthetic */ List m8564d(C60152b4 b4Var, String str, C32226l lVar, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    lVar = C8760a.f28041d;
                }
                if ((i & 4) != 0) {
                    str2 = C75592q0.m90778h();
                    C87412m.m108593f(str2, "getDefaultFinderUsername()");
                }
                return b4Var.mo77243O5(str, lVar, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCtrlInfoByPath");
        }
    }

    /* renamed from: G5 */
    C55718s0 mo77227G5(String str);

    /* renamed from: H5 */
    boolean mo77229H5();

    /* renamed from: I5 */
    void mo77231I5();

    /* renamed from: J5 */
    void mo77233J5(int i);

    /* renamed from: K5 */
    boolean mo77235K5();

    /* renamed from: L5 */
    C46114r3 mo77237L5();

    /* renamed from: M5 */
    void mo77239M5(String str);

    /* renamed from: N5 */
    void mo77241N5(int i, String str);

    /* renamed from: O5 */
    List<C55718s0> mo77243O5(String str, C32226l<? super C55718s0, Boolean> lVar, String str2);

    /* renamed from: P5 */
    void mo77244P5(String str);

    /* renamed from: Q5 */
    HashMap<String, Object> mo77245Q5(String str, String str2, String str3, String str4);

    /* renamed from: R5 */
    C64586nn1 mo77246R5(String str);

    /* renamed from: S5 */
    int mo77247S5();

    /* renamed from: T5 */
    C55718s0 mo77248T5(C51978xi1 xi12, String str, HashSet<String> hashSet, boolean z, C13604l<C55718s0, ? extends C64586nn1> lVar, C32226l<? super C55718s0, C13598b0> lVar2, long j, boolean z2);

    /* renamed from: U5 */
    void mo77249U5(boolean z);

    /* renamed from: V5 */
    void mo77250V5(C49170dn1 dn12, String str);

    /* renamed from: W5 */
    void mo77251W5(boolean z);

    /* renamed from: X5 */
    boolean mo77252X5(Integer num);

    /* renamed from: Y5 */
    boolean mo77253Y5();

    /* renamed from: Z5 */
    C13604l<String, Integer> mo77254Z5();

    /* renamed from: a6 */
    int mo77256a6(String str);

    /* renamed from: b6 */
    void mo77258b6();

    /* renamed from: c6 */
    void mo77260c6(boolean z);

    /* renamed from: d6 */
    C64586nn1 mo77262d6(String str, String str2);

    /* renamed from: e6 */
    int mo77264e6(String str);

    /* renamed from: f6 */
    void mo77266f6(String str, C32226l<? super C55718s0, Boolean> lVar, boolean z, String str2);

    /* renamed from: j */
    C20998d4 mo77270j();
}
