package co1;

import cm1.C55015f1;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Comparator;
import java.util.Iterator;
import o40.C61926c;
import pl1.C62367r0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C37521f;
import ux3.C65486b;
import wp1.C66167g;

/* renamed from: co1.a */
public final class C55041a {

    /* renamed from: a */
    public static final C55041a f154526a = new C55041a();

    /* renamed from: b */
    public static final boolean f154527b;

    /* renamed from: c */
    public static final C13601g f154528c = C36568h.m40985a(C55043b.f154529d);

    /* renamed from: co1.a$a */
    public static final class C55042a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C55015f1) t).field_fileFormat.hashCode()), Integer.valueOf(((C55015f1) t2).field_fileFormat.hashCode()));
        }
    }

    /* renamed from: co1.a$b */
    public static final class C55043b extends C87413o implements C32224a<C55048e> {

        /* renamed from: d */
        public static final C55043b f154529d = new C55043b();

        public C55043b() {
            super(0);
        }

        public Object invoke() {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0();
        }
    }

    /* renamed from: co1.a$c */
    public static final class C55044c<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C55015f1) t).field_fileFormat.hashCode()), Integer.valueOf(((C55015f1) t2).field_fileFormat.hashCode()));
        }
    }

    /* renamed from: co1.a$d */
    public static final class C55045d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C55015f1) t).field_fileFormat.hashCode()), Integer.valueOf(((C55015f1) t2).field_fileFormat.hashCode()));
        }
    }

    static {
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99186H3.mo60266n().intValue() != 1) {
            z = false;
        }
        f154527b = z;
    }

    /* renamed from: a */
    public final C62367r0 mo76098a(long j, C64689rq2 rq22, boolean z) {
        T t;
        String str;
        float f;
        String str2;
        boolean z2;
        String str3;
        float f2;
        boolean z3;
        String str4;
        float f3;
        C55015f1 d;
        float f4;
        long j2;
        float f5;
        String str5;
        float f6;
        String str6;
        C62367r0 r0Var;
        long j3 = j;
        C64689rq2 rq23 = rq22;
        boolean z4 = z;
        C87412m.m108594g(rq23, "media");
        if (f154527b) {
            long currentTimeMillis = System.currentTimeMillis();
            float f7 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Hx0().f154544J;
            C62367r0 b = ((C55048e) ((C36570n) f154528c).getValue()).mo76105b(j3, rq23);
            try {
                String str7 = "quickFindBestVideoToPlay: ";
                String str8 = "ms feedId=";
                try {
                    d = C66167g.m78055d(C66167g.f190173a, b.mo11841b(), false, 2, (Object) null);
                    long j4 = d.field_cacheSize;
                    long j5 = d.field_totalSize;
                    if (j5 <= 0) {
                        j2 = j4;
                        f4 = 0.0f;
                    } else {
                        j2 = j4;
                        f4 = (((float) j2) * 1.0f) / ((float) j5);
                    }
                } catch (Throwable th) {
                    th = th;
                    f2 = f7;
                    str2 = " mediaId=";
                    z2 = z4;
                    str3 = "FinderMediaSpecSelector";
                    str4 = str7;
                    str = str8;
                    f3 = 0.0f;
                    f = f3;
                    z3 = false;
                    Log.m105924i(str3, str4 + (System.currentTimeMillis() - currentTimeMillis) + str + C61926c.m72691p(j) + str2 + b.mo11841b() + " cachePercent=" + f + " isPreLoadCompleted=" + z3 + "allow_to_use_new_spec_max_percent:" + f2 + " checkDownloadPercent=" + z2);
                    throw th;
                }
                try {
                    boolean o2 = d.mo76074o2();
                    if (f7 == -1.0f) {
                        f5 = f7;
                        long j6 = j2;
                        z3 = o2;
                        str4 = str7;
                        f6 = f4;
                        str5 = "FinderMediaSpecSelector";
                        str = str8;
                        str6 = " mediaId=";
                        try {
                            r0Var = mo76099b(b, j6, o2, rq22, z);
                        } catch (Throwable th4) {
                            th = th4;
                            z2 = z;
                            str2 = str6;
                            str3 = str5;
                            f2 = f5;
                            f = f6;
                            Log.m105924i(str3, str4 + (System.currentTimeMillis() - currentTimeMillis) + str + C61926c.m72691p(j) + str2 + b.mo11841b() + " cachePercent=" + f + " isPreLoadCompleted=" + z3 + "allow_to_use_new_spec_max_percent:" + f2 + " checkDownloadPercent=" + z2);
                            throw th;
                        }
                    } else {
                        f5 = f7;
                        z3 = o2;
                        f6 = f4;
                        str6 = " mediaId=";
                        str4 = str7;
                        str5 = "FinderMediaSpecSelector";
                        str = str8;
                        r0Var = mo76100c(f5, b, f6, o2, rq22, z);
                    }
                    Log.m105924i(str5, str4 + (System.currentTimeMillis() - currentTimeMillis) + str + C61926c.m72691p(j) + str6 + b.mo11841b() + " cachePercent=" + f6 + " isPreLoadCompleted=" + z3 + "allow_to_use_new_spec_max_percent:" + f5 + " checkDownloadPercent=" + z);
                    return r0Var;
                } catch (Throwable th5) {
                    th = th5;
                    f2 = f7;
                    str2 = " mediaId=";
                    z2 = z4;
                    str3 = "FinderMediaSpecSelector";
                    str4 = str7;
                    str = str8;
                    f3 = f4;
                    f = f3;
                    z3 = false;
                    Log.m105924i(str3, str4 + (System.currentTimeMillis() - currentTimeMillis) + str + C61926c.m72691p(j) + str2 + b.mo11841b() + " cachePercent=" + f + " isPreLoadCompleted=" + z3 + "allow_to_use_new_spec_max_percent:" + f2 + " checkDownloadPercent=" + z2);
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                f2 = f7;
                str4 = "quickFindBestVideoToPlay: ";
                str2 = " mediaId=";
                z2 = z4;
                str3 = "FinderMediaSpecSelector";
                str = "ms feedId=";
                f3 = 0.0f;
                f = f3;
                z3 = false;
                Log.m105924i(str3, str4 + (System.currentTimeMillis() - currentTimeMillis) + str + C61926c.m72691p(j) + str2 + b.mo11841b() + " cachePercent=" + f + " isPreLoadCompleted=" + z3 + "allow_to_use_new_spec_max_percent:" + f2 + " checkDownloadPercent=" + z2);
                throw th;
            }
        } else {
            String str9 = "FinderMediaSpecSelector";
            C66167g gVar = C66167g.f190173a;
            String str10 = rq23.f185275p;
            if (str10 == null) {
                str10 = "";
            }
            Iterator<T> it = C110818d0.m150943o0(gVar.mo90235e(str10), new C55042a()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                T next = it.next();
                if (((C55015f1) next).mo76074o2()) {
                    t = next;
                    break;
                }
            }
            C55015f1 f1Var = (C55015f1) t;
            if (f1Var == null) {
                return ((C55048e) ((C36570n) f154528c).getValue()).mo76105b(j, rq23);
            }
            Log.m105924i(str9, "findBestVideoToPlay hit PreLoadCompleted cache:" + f1Var);
            return new C62367r0(rq22, C55048e.f154532L.mo53892a(f1Var.field_fileFormat), f1Var.field_fileFormat, f1Var.field_reqFormat, f1Var.field_dynamicRangeType, (String) null, 32, (C8480h) null);
        }
    }

    /* renamed from: b */
    public final C62367r0 mo76099b(C62367r0 r0Var, long j, boolean z, C64689rq2 rq22, boolean z2) {
        T t;
        if (j > 0 || z) {
            return r0Var;
        }
        C66167g gVar = C66167g.f190173a;
        String str = rq22.f185275p;
        if (str == null) {
            str = "";
        }
        Iterator<T> it = C110818d0.m150943o0(gVar.mo90235e(str), new C55044c()).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C55015f1 f1Var = (C55015f1) t;
            boolean z3 = false;
            boolean z4 = f1Var.mo76074o2() || (z2 && f1Var.mo76072m2() > 0);
            FinderPlayerPreloadCore finderPlayerPreloadCore = FinderPlayerPreloadCore.f160325a;
            String str2 = f1Var.field_mediaId;
            C87412m.m108593f(str2, "it.field_mediaId");
            boolean b = finderPlayerPreloadCore.mo78451b(str2);
            long j2 = f1Var.field_cacheSize;
            Log.m105924i("FinderMediaSpecSelector", "replaceByHitPreload: mediaId=" + f1Var.field_mediaId + ", isPreloadComplete=" + z4 + ", isPlayerPreloaded=" + b + ", cachePercent=" + f1Var.mo76072m2() + " cacheSize:" + j2);
            if (z4 || b || j2 > 0) {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C55015f1 f1Var2 = (C55015f1) t;
        if (f1Var2 == null) {
            return r0Var;
        }
        Log.m105924i("FinderMediaSpecSelector", "replaceByHitPreload: hit PreLoadCompleted cache:" + f1Var2);
        return new C62367r0(rq22, C55048e.f154532L.mo53892a(f1Var2.field_fileFormat), f1Var2.field_fileFormat, f1Var2.field_reqFormat, f1Var2.field_dynamicRangeType, (String) null, 32, (C8480h) null);
    }

    /* renamed from: c */
    public final C62367r0 mo76100c(float f, C62367r0 r0Var, float f2, boolean z, C64689rq2 rq22, boolean z2) {
        T t;
        if (f2 >= f) {
            return r0Var;
        }
        C66167g gVar = C66167g.f190173a;
        String str = rq22.f185275p;
        if (str == null) {
            str = "";
        }
        Iterator<T> it = C110818d0.m150943o0(gVar.mo90235e(str), new C55045d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            C55015f1 f1Var = (C55015f1) t;
            boolean z3 = false;
            boolean z4 = f2 >= f || (z2 && f1Var.mo76072m2() > 0);
            FinderPlayerPreloadCore finderPlayerPreloadCore = FinderPlayerPreloadCore.f160325a;
            String str2 = f1Var.field_mediaId;
            C87412m.m108593f(str2, "it.field_mediaId");
            boolean b = finderPlayerPreloadCore.mo78451b(str2);
            Log.m105924i("FinderMediaSpecSelector", "replaceByPreloadPercent: mediaId=" + f1Var.field_mediaId + ", isPreloadComplete=" + z4 + ", isPlayerPreloaded=" + b + ", cachePercent=" + f1Var.mo76072m2());
            if (z4 || b) {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C55015f1 f1Var2 = (C55015f1) t;
        if (f1Var2 == null) {
            return r0Var;
        }
        Log.m105924i("FinderMediaSpecSelector", "quickFindBestVideoToPlay: hit PreLoadCompleted cache:" + f1Var2);
        return new C62367r0(rq22, C55048e.f154532L.mo53892a(f1Var2.field_fileFormat), f1Var2.field_fileFormat, f1Var2.field_reqFormat, f1Var2.field_dynamicRangeType, (String) null, 32, (C8480h) null);
    }
}
