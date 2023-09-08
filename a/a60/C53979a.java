package a60;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: a60.a */
public final class C53979a {

    /* renamed from: a */
    public C32226l<? super Boolean, C13598b0> f151226a;

    /* renamed from: b */
    public C32224a<C13598b0> f151227b;

    /* renamed from: c */
    public C32226l<? super Long, C13598b0> f151228c;

    /* renamed from: d */
    public C32226l<? super Boolean, C13598b0> f151229d;

    /* renamed from: e */
    public C32229r<? super Long, ? super String, ? super String, ? super String, C13598b0> f151230e;

    /* renamed from: f */
    public C32224a<C13598b0> f151231f;

    /* renamed from: g */
    public C32226l<? super Boolean, C13598b0> f151232g;

    /* renamed from: h */
    public final ArrayList<C53980a> f151233h = new ArrayList<>();

    /* renamed from: i */
    public C53980a f151234i;

    /* renamed from: j */
    public String f151235j = "";

    /* renamed from: a60.a$a */
    public static final class C53980a {

        /* renamed from: a */
        public long f151236a;

        /* renamed from: b */
        public String f151237b;

        /* renamed from: c */
        public String f151238c;

        /* renamed from: d */
        public String f151239d;

        /* renamed from: e */
        public String f151240e;

        public C53980a(long j, String str, String str2, String str3, String str4) {
            C87412m.m108594g(str, "micId");
            C87412m.m108594g(str2, "audience");
            C87412m.m108594g(str3, "roomId");
            C87412m.m108594g(str4, "sdkUid");
            this.f151236a = j;
            this.f151237b = str;
            this.f151238c = str2;
            this.f151239d = str3;
            this.f151240e = str4;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C53980a) && C87412m.m108589b(((C53980a) obj).f151238c, this.f151238c);
        }

        public int hashCode() {
            long j = this.f151236a;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + this.f151237b.hashCode()) * 31) + this.f151238c.hashCode()) * 31) + this.f151239d.hashCode()) * 31) + this.f151240e.hashCode();
        }

        public String toString() {
            return "LiveMicUser(liveId=" + this.f151236a + ", micId=" + this.f151237b + ", audience=" + this.f151238c + ", roomId=" + this.f151239d + ", sdkUid=" + this.f151240e + ')';
        }
    }

    /* renamed from: a60.a$b */
    public static final class C53981b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53979a f151241d;

        public C53981b(C53979a aVar) {
            this.f151241d = aVar;
        }

        public final void run() {
            C32226l<? super Boolean, C13598b0> lVar = this.f151241d.f151226a;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: a60.a$c */
    public static final class C53982c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53979a f151242d;

        public C53982c(C53979a aVar) {
            this.f151242d = aVar;
        }

        public final void run() {
            C53979a aVar = this.f151242d;
            C32226l<? super Boolean, C13598b0> lVar = aVar.f151232g;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(aVar.mo74651a()));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo74651a() {
        C53980a aVar = this.f151234i;
        String str = aVar != null ? aVar.f151240e : null;
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        return C87412m.m108589b(str, RoomLiveService.f157197h.f133063t);
    }

    /* renamed from: b */
    public final void mo74652b() {
        this.f151234i = null;
        this.f151235j = "";
    }

    /* renamed from: c */
    public final void mo74653c(long j, String str, String str2, String str3, String str4, String str5) {
        C32224a<C13598b0> aVar;
        long j2 = j;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        C87412m.m108594g(str6, "micId");
        C87412m.m108594g(str7, "audience");
        C87412m.m108594g(str8, "headImg");
        C87412m.m108594g(str9, "nickName");
        C87412m.m108594g(str10, "sdkUid");
        String str11 = "[sysmsg]broadcast mic success.micId:" + str6 + " audience:" + str7 + " nick:" + str9 + " liveId:" + j2 + " sdkUid:" + str10;
        C87412m.m108594g(str11, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str11);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (j2 == RoomLiveService.f157197h.f133050d) {
            this.f151234i = new C53980a(j, str, str2, "", str5);
            C32229r<? super Long, ? super String, ? super String, ? super String, C13598b0> rVar = this.f151230e;
            if (rVar != null) {
                rVar.mo162I(Long.valueOf(j), str7, str8, str9);
            }
            if (!mo74651a() && (aVar = this.f151231f) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: d */
    public final void mo74654d(long j, String str, String str2) {
        C87412m.m108594g(str, "audience");
        C87412m.m108594g(str2, "micId");
        StringBuilder sb = new StringBuilder();
        sb.append("[sysmsg]broadcast close mic.liveId:");
        sb.append(j);
        sb.append(" audience:");
        sb.append(str);
        sb.append(" micId:");
        sb.append(str2);
        sb.append(" isSelf:");
        C53980a aVar = this.f151234i;
        String str3 = null;
        sb.append(C87412m.m108589b(aVar != null ? aVar.f151237b : null, str2));
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", sb4);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (j == RoomLiveService.f157197h.f133050d) {
            Iterator<C53980a> it = this.f151233h.iterator();
            C87412m.m108593f(it, "userList.iterator()");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C53980a next = it.next();
                C87412m.m108593f(next, "mIterator.next()");
                if (C87412m.m108589b(next.f151237b, str2)) {
                    it.remove();
                    break;
                }
            }
            MMHandlerThread.postToMainThread(new C53981b(this));
            C53980a aVar2 = this.f151234i;
            if (aVar2 != null) {
                str3 = aVar2.f151237b;
            }
            if (C87412m.m108589b(str2, str3)) {
                MMHandlerThread.postToMainThread(new C53982c(this));
            }
        }
    }
}
