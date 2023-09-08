package kr0;

import di3.C7335d;
import java.util.List;

/* renamed from: kr0.c1 */
public interface C88262c1 extends C7335d {

    /* renamed from: kr0.c1$a */
    public interface C88263a {
        /* renamed from: a */
        void mo113616a(C88265c cVar);
    }

    /* renamed from: kr0.c1$b */
    public static class C88264b {

        /* renamed from: a */
        public String f255110a;

        /* renamed from: b */
        public String f255111b;

        /* renamed from: c */
        public int f255112c;

        /* renamed from: d */
        public String f255113d;

        /* renamed from: e */
        public String f255114e;

        /* renamed from: f */
        public C88263a f255115f;
    }

    /* renamed from: kr0.c1$c */
    public enum C88265c {
        Unknown,
        Fail_SvrConnectFail,
        Fail_SvrRetListEmpty,
        Fail_PkgDownloadFail,
        Success_AllPkgDownloaded,
        Success_NoNeedGetCode,
        Success_AllPkgDownloadedPrevious
    }

    /* renamed from: Dm */
    void mo113580Dm(String str, int i);

    /* renamed from: Re */
    void mo113581Re(String str, String str2, String str3, int i);

    void S60(List<String> list, C88273g1 g1Var);

    /* renamed from: VU */
    void mo113583VU(String str);

    /* renamed from: Yy */
    void mo113584Yy(List<String> list);

    /* renamed from: cs */
    void mo113585cs(C88264b bVar);

    void e60(String str, String str2, int i);

    /* renamed from: fX */
    void mo113587fX();

    /* renamed from: rf */
    void mo113588rf(List<String> list);
}
