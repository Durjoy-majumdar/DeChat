package er1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46547x1;
import ob0.C89132b;
import pe3.C89349b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13605o;
import sx3.C110818d0;
import te3.C49946j51;
import te3.C50008jm0;
import up1.C65426w0;
import wp1.C15587j;
import z04.C112550d0;

/* renamed from: er1.n1 */
public final class C58749n1 {

    /* renamed from: a */
    public static final C58749n1 f168219a = new C58749n1();

    /* renamed from: b */
    public static final ConcurrentHashMap<Long, C31678a> f168220b = new ConcurrentHashMap<>();

    /* renamed from: er1.n1$a */
    public static final class C31678a {

        /* renamed from: a */
        public final long f84611a;

        /* renamed from: b */
        public final long f84612b;

        public C31678a(long j, long j2) {
            this.f84611a = j;
            this.f84612b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31678a)) {
                return false;
            }
            C31678a aVar = (C31678a) obj;
            return this.f84611a == aVar.f84611a && this.f84612b == aVar.f84612b;
        }

        public int hashCode() {
            long j = this.f84611a;
            long j2 = this.f84612b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "ObjectStatusReqState(lastReqTime=" + this.f84611a + ", waitTime=" + this.f84612b + ')';
        }
    }

    /* renamed from: er1.n1$b */
    public static final class C58750b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ BaseFinderFeed f168221a;

        /* renamed from: b */
        public final /* synthetic */ long f168222b;

        /* renamed from: c */
        public final /* synthetic */ long f168223c;

        public C58750b(BaseFinderFeed baseFinderFeed, long j, long j2) {
            this.f168221a = baseFinderFeed;
            this.f168222b = j;
            this.f168223c = j2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
                if (finderObject != null) {
                    BaseFinderFeed baseFinderFeed = this.f168221a;
                    C58749n1 n1Var = C58749n1.f168219a;
                    Log.m105924i("Finder.ObjectStatusRefresher", "lxl CgiGetFinderFeedComment change objectStatus, from:" + baseFinderFeed.mo3513o().getFeedObject().objectStatus + ", to:" + finderObject.objectStatus + ", waitTime:" + ((C50008jm0) cVar.f256796d).f136189j);
                    baseFinderFeed.mo3513o().getFeedObject().objectStatus = finderObject.objectStatus;
                }
                if (this.f168221a.mo3513o().isOnlySelfSee()) {
                    C58749n1 n1Var2 = C58749n1.f168219a;
                    long j = this.f168222b;
                    long j2 = this.f168223c;
                    long j3 = (long) ((C50008jm0) cVar.f256796d).f136189j;
                    Log.m105924i("Finder.ObjectStatusRefresher", "[refreshInterval] feedId=" + j + " lastReqTime=" + j2 + " waitTime=" + j3);
                    C58749n1.f168220b.put(Long.valueOf(j), new C31678a(j2, j3));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: er1.n1$c */
    public static final class C58751c<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ BaseFinderFeed f168224a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<C13605o<String, String, String>, C13598b0> f168225b;

        public C58751c(BaseFinderFeed baseFinderFeed, C32226l<? super C13605o<String, String, String>, C13598b0> lVar) {
            this.f168224a = baseFinderFeed;
            this.f168225b = lVar;
        }

        public Object call(Object obj) {
            C13598b0 b0Var = (C13598b0) obj;
            String obj2 = C112550d0.m153799i0(this.f168224a.mo3513o().getNotShareMsg()).toString();
            C58749n1 n1Var = C58749n1.f168219a;
            Log.m105924i("Finder.ObjectStatusRefresher", "[refreshObjectStatus] tips=" + obj2);
            this.f168225b.invoke(n1Var.mo83748a(obj2));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final C13605o<String, String, String> mo83748a(String str) {
        String str2;
        String str3;
        List U = C112550d0.m153785U(str, new String[]{"#"}, false, 0, 6, (Object) null);
        String str4 = "";
        if (U.size() >= 3) {
            String str5 = (String) C110818d0.m150917O(U, 0);
            if (str5 == null) {
                str5 = str4;
            }
            str3 = (String) C110818d0.m150917O(U, 1);
            if (str3 == null) {
                str3 = str4;
            }
            String str6 = (String) C110818d0.m150917O(U, 2);
            if (str6 != null) {
                str4 = str6;
            }
            str2 = str4;
            str4 = str5;
        } else {
            str2 = str4;
            str3 = str2;
        }
        if (Util.isNullOrNil(str4)) {
            str4 = C58784w3.f168295a.mo83911Y("FinderSafeSelfSeeForward", C0966R.string.eo6);
        }
        if (Util.isNullOrNil(str3)) {
            str3 = C58784w3.f168295a.mo83911Y("FinderSafeSelfSeeShare", C0966R.string.eo7);
        }
        if (Util.isNullOrNil(str2) && (str2 = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_FinderSelfSeeTipsFav")) == null) {
            str2 = C58784w3.f168295a.mo83911Y("FinderSafeSelfSeeCollect", C0966R.string.eo5);
        }
        return new C13605o<>(str4, str3, str2);
    }

    /* renamed from: b */
    public final C13605o<String, String, String> mo83749b(Context context, BaseFinderFeed baseFinderFeed, int i, C32226l<? super C13605o<String, String, String>, C13598b0> lVar) {
        Context context2 = context;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C32226l<? super C13605o<String, String, String>, C13598b0> lVar2 = lVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(baseFinderFeed2, "feed");
        C87412m.m108594g(lVar2, "cgiBack");
        long id = baseFinderFeed.mo3513o().getId();
        long j = (long) 1000;
        long a = C31543z5.m39451a() / j;
        ConcurrentHashMap<Long, C31678a> concurrentHashMap = f168220b;
        C31678a aVar = concurrentHashMap.get(Long.valueOf(id));
        boolean z = true;
        if (aVar != null && (C31543z5.m39451a() / j) - aVar.f84611a < aVar.f84612b) {
            z = false;
        }
        if (z) {
            String objectNonceId = baseFinderFeed.mo3513o().getObjectNonceId();
            String userName = baseFinderFeed.mo3513o().getUserName();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(context2);
            new C46547x1(id, objectNonceId, 3, i, userName, false, (C89349b) null, (C65426w0) null, 0, (String) null, false, true, (String) null, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 120800, (C8480h) null).mo9225i().mo123064p(new C58750b(baseFinderFeed, id, a)).mo123062e(new C58751c(baseFinderFeed2, lVar2));
        } else {
            C31678a aVar2 = concurrentHashMap.get(Long.valueOf(id));
            if (aVar2 != null) {
                Log.m105928w("Finder.ObjectStatusRefresher", "can't request. lastReqTime=" + a + " lastReqTime=" + aVar2.f84611a + " waitTime=" + aVar2.f84612b);
            }
        }
        return mo83748a(C112550d0.m153799i0(baseFinderFeed.mo3513o().getNotShareMsg()).toString());
    }
}
