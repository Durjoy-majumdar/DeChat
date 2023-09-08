package q00;

import ac3.C54008d0;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.xeffect.IWeEffectCallback;
import com.tencent.p014mm.xeffect.IWeJsonMessageCallback;
import rh3.C101382f;

/* renamed from: q00.g */
public interface C110264g {

    /* renamed from: q00.g$a */
    public enum C47730a {
        APP_VOIP,
        APP_ZPBQ,
        APP_LIVEVLOG,
        APP_LIVEVLOG_HIGHRANK,
        APP_VOIP_HIGHRANK,
        APP_SIGHTCAMERACAP,
        APP_UNSPECIFIED
    }

    /* renamed from: q00.g$b */
    public static final class C110265b {
        /* renamed from: a */
        public static /* synthetic */ void m149906a(C110264g gVar, int i, int i2, boolean z, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    i2 = 0;
                }
                if ((i3 & 4) != 0) {
                    z = false;
                }
                gVar.mo143242i(i, i2, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: faceTrack");
        }

        /* renamed from: b */
        public static /* synthetic */ int m149907b(C110264g gVar, int i, int i2, long j, int i3, boolean z, boolean z2, boolean z3, int i4, Object obj) {
            if (obj == null) {
                return gVar.mo143234b(i, i2, (i4 & 4) != 0 ? 0 : j, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? true : z2, (i4 & 64) != 0 ? false : z3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
        }
    }

    /* renamed from: q00.g$c */
    public enum C110266c {
        SEGMENT_NONE,
        SEGMENT_GLASS
    }

    /* renamed from: q00.g$d */
    public enum C110267d {
        FaceMorph,
        SmallHead,
        CheekBone,
        LowerJawbone,
        WingOfNose,
        ChinShort,
        ChinLong,
        HairLineHigh,
        HairLineLow,
        BigEye,
        BoySlim,
        GirlSlim,
        ZhaiLian
    }

    /* renamed from: C */
    void mo143224C(int i, int i2);

    /* renamed from: a */
    void mo143233a(boolean z);

    /* renamed from: b */
    int mo143234b(int i, int i2, long j, int i3, boolean z, boolean z2, boolean z3);

    /* renamed from: d */
    void mo143236d(IWeJsonMessageCallback iWeJsonMessageCallback);

    void destroy();

    /* renamed from: e */
    void mo143238e(boolean z);

    /* renamed from: f */
    void mo143239f(String str, float f);

    /* renamed from: g */
    void mo143240g(C54008d0 d0Var);

    /* renamed from: h */
    long mo143241h(int i, String str);

    /* renamed from: i */
    void mo143242i(int i, int i2, boolean z);

    /* renamed from: j */
    long mo143243j(String str);

    /* renamed from: k */
    void mo143244k(long j, String str, int i);

    /* renamed from: l */
    void mo143245l(boolean z);

    /* renamed from: m */
    void mo143246m(C54008d0 d0Var);

    /* renamed from: n */
    void mo143247n(long j, IWeEffectCallback iWeEffectCallback);

    /* renamed from: o */
    long mo143248o();

    /* renamed from: p */
    long mo143249p(C101382f fVar);

    /* renamed from: q */
    void mo143250q(String str, float f);

    /* renamed from: r */
    void mo143251r(long j);

    /* renamed from: s */
    void mo143252s(XEffectConfig xEffectConfig);

    /* renamed from: t */
    void mo143253t(int i, int i2);

    /* renamed from: u */
    boolean mo143254u();

    /* renamed from: v */
    void mo143255v(int i, boolean z);

    /* renamed from: w */
    void mo143256w(boolean z);
}
