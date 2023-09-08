package vh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import gy3.C87412m;
import hp3.C87581a;
import jp3.C9486a;
import jp3.C9487b;
import nr3.C89059e;
import o90.C100308d;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C101814mn2;
import te3.C50906q22;
import th3.C101892a;

/* renamed from: vh3.e */
public final class C102193e extends C102192d {

    /* renamed from: vh3.e$a */
    public static final class C102194a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C102191c f300889a;

        /* renamed from: b */
        public final /* synthetic */ String f300890b;

        public C102194a(C102191c cVar, String str) {
            this.f300889a = cVar;
            this.f300890b = str;
        }

        public Object call(Object obj) {
            C101814mn2 mn22;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            Log.m105924i("MicroMsg.GetLensInfoTask", "GetLensInfo: " + i + ", " + i2 + ", " + str);
            C101814mn2 mn23 = null;
            if (i == 0 && i2 == 0) {
                C50906q22 q222 = (C50906q22) cVar.f256796d;
                if (!(q222 == null || (mn22 = q222.f140103d) == null)) {
                    synchronized (C101892a.f300039a) {
                        long currentTicks = Util.currentTicks();
                        C100308d<String, C13604l<C101814mn2, Long>> dVar = C101892a.f300040b;
                        C13604l lVar = dVar.get(mn22.f298862d);
                        if (lVar == null) {
                            lVar = new C13604l(mn22, Long.valueOf(currentTicks));
                        }
                        dVar.put(mn22.f298862d, lVar);
                        Log.m105924i("MicroMsg.LensInfoMemCache", "update: " + mn22.f298862d + ", " + currentTicks);
                    }
                }
                C102191c cVar2 = this.f300889a;
                if (cVar2 == null) {
                    return null;
                }
                C50906q22 q223 = (C50906q22) cVar.f256796d;
                if (q223 != null) {
                    mn23 = q223.f140103d;
                }
                cVar2.mo125818a(0, mn23);
                return C13598b0.f38549a;
            } else if (i == 4 && i2 == -436) {
                C102191c cVar3 = this.f300889a;
                if (cVar3 != null) {
                    cVar3.mo125818a(2, (C101814mn2) null);
                }
                C101892a aVar = C101892a.f300039a;
                String str2 = this.f300890b;
                synchronized (aVar) {
                    C87412m.m108594g(str2, "lensId");
                    long currentTicks2 = Util.currentTicks();
                    Log.m105924i("MicroMsg.LensInfoMemCache", "markInvalid: " + str2 + ", " + currentTicks2);
                    C101892a.f300041c.put(str2, Long.valueOf(currentTicks2));
                }
                return C13598b0.f38549a;
            } else {
                C102191c cVar4 = this.f300889a;
                if (cVar4 == null) {
                    return null;
                }
                cVar4.mo125818a(1, (C101814mn2) null);
                return C13598b0.f38549a;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102193e(C9487b<C9486a> bVar, String str, C102191c cVar) {
        super(bVar, str, cVar);
        C101814mn2 mn22;
        boolean z;
        C9487b<C9486a> bVar2 = bVar;
        String str2 = str;
        C102191c cVar2 = cVar;
        C87412m.m108594g(str2, "lensId");
        Log.m105924i("MicroMsg.GetLensInfoTask", "GetLensInfoTaskImpl: " + str2);
        C101892a aVar = C101892a.f300039a;
        synchronized (aVar) {
            C100308d<String, C13604l<C101814mn2, Long>> dVar = C101892a.f300040b;
            C13604l lVar = dVar.get(str2);
            if (lVar != null) {
                if (Util.ticksToNow(((Number) lVar.f38556e).longValue()) > ApkDownloadManager.INTERVAL) {
                    dVar.remove(str2);
                    Log.m105924i("MicroMsg.LensInfoMemCache", "get: expired " + str2 + ", " + ((Number) lVar.f38556e).longValue());
                } else {
                    Log.m105924i("MicroMsg.LensInfoMemCache", "get: from cache " + str2 + ", " + ((Number) lVar.f38556e).longValue());
                    mn22 = (C101814mn2) lVar.f38555d;
                }
            }
            mn22 = null;
        }
        synchronized (aVar) {
            C100308d<String, Long> dVar2 = C101892a.f300041c;
            Long l = dVar2.get(str2);
            if (l != null) {
                long longValue = l.longValue();
                if (Util.ticksToNow(longValue) > ApkDownloadManager.INTERVAL) {
                    dVar2.remove(str2);
                    Log.m105924i("MicroMsg.LensInfoMemCache", "isInvalid: expired " + str2 + ", " + longValue);
                } else {
                    Log.m105924i("MicroMsg.LensInfoMemCache", "isInvalid: from cache " + str2 + " invalid");
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            if (cVar2 != null) {
                cVar2.mo125818a(2, (C101814mn2) null);
            }
        } else if (mn22 == null) {
            C52914a aVar2 = new C52914a(str2);
            aVar2.f256791h = true;
            C89059e i = aVar2.mo9225i();
            i.mo123419C(new C102194a(cVar2, str2));
            if (bVar2 != null) {
                i.mo11397F(bVar2);
            }
        } else if (cVar2 != null) {
            cVar2.mo125818a(0, mn22);
        }
    }
}
