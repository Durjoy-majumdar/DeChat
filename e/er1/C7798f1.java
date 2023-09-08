package er1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import f40.C86709a0;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import je1.C9378t1;
import lc3.C10485b;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C50401mh0;
import te3.C51575uo1;
import te3.C51999xo1;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: er1.f1 */
public final class C7798f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f26311d;

    /* renamed from: e */
    public final /* synthetic */ int f26312e;

    /* renamed from: f */
    public final /* synthetic */ C32229r<Integer, String, String, C51575uo1, C13598b0> f26313f;

    /* renamed from: er1.f1$a */
    public static final class C7799a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32229r<Integer, String, String, C51575uo1, C13598b0> f26314a;

        /* renamed from: b */
        public final /* synthetic */ String f26315b;

        public C7799a(C32229r<? super Integer, ? super String, ? super String, ? super C51575uo1, C13598b0> rVar, String str) {
            this.f26314a = rVar;
            this.f26315b = str;
        }

        public Object call(Object obj) {
            C51575uo1 uo12;
            C51575uo1 uo13;
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C51575uo1 uo14 = null;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C51999xo1 xo12 = (C51999xo1) cVar.f256796d;
                if ((xo12 != null ? xo12.f144772d : null) != null) {
                    if (C58739j4.f168176a.mo83692U()) {
                        C51999xo1 xo13 = (C51999xo1) cVar.f256796d;
                        String str = (xo13 == null || (uo13 = xo13.f144772d) == null) ? null : uo13.f142981g;
                        if (str == null || str.length() == 0) {
                            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "img is empty", 0).show();
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("imgUrl: ");
                    C51999xo1 xo14 = (C51999xo1) cVar.f256796d;
                    sb.append((xo14 == null || (uo12 = xo14.f144772d) == null) ? null : uo12.f142981g);
                    Log.m105924i("Finder.FinderLiveMpLinkVerifier", sb.toString());
                    C32229r<Integer, String, String, C51575uo1, C13598b0> rVar = this.f26314a;
                    String str2 = this.f26315b;
                    C51999xo1 xo15 = (C51999xo1) cVar.f256796d;
                    if (xo15 != null) {
                        uo14 = xo15.f144772d;
                    }
                    rVar.mo162I(0, "", str2, uo14);
                } else {
                    this.f26314a.mo162I(-400, "", "", null);
                }
            } else {
                this.f26314a.mo162I(Integer.valueOf(cVar.f256794b), cVar.f256795c, "", null);
            }
            return C13598b0.f38549a;
        }
    }

    public C7798f1(String str, int i, C32229r<? super Integer, ? super String, ? super String, ? super C51575uo1, C13598b0> rVar) {
        this.f26311d = str;
        this.f26312e = i;
        this.f26313f = rVar;
    }

    public final void run() {
        Log.m105924i("Finder.FinderLiveMpLinkVerifier", "verify " + this.f26311d);
        try {
            String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderExtendedReadingPrefix");
            if (Util.isNullOrNil(c)) {
                c = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + ';';
            }
            C87412m.m108593f(c, "prefixs");
            List T = C112550d0.m153784T(C112550d0.m153799i0(c).toString(), new char[]{';'}, false, 0, 6, (Object) null);
            ArrayList<String> arrayList = new ArrayList<>();
            for (Object next : T) {
                if (!Util.isNullOrNil(C112550d0.m153799i0((String) next).toString())) {
                    arrayList.add(next);
                }
            }
            String str = this.f26311d;
            boolean z = false;
            for (String i0 : arrayList) {
                String lowerCase = str.toLowerCase();
                C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
                if (C112551y.m153819s(lowerCase, C112550d0.m153799i0(i0).toString(), false)) {
                    z = true;
                }
            }
            if (z) {
                new C9378t1(this.f26312e, this.f26311d, 1, (C50401mh0) null, 8, (C8480h) null).mo9225i().mo123420E(new C7799a(this.f26313f, this.f26311d));
                return;
            }
            Log.m105924i("Finder.FinderLiveMpLinkVerifier", "scheme or host not valid");
            this.f26313f.mo162I(-100, "", "", null);
        } catch (MalformedURLException e) {
            Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", e, "MalformedURLException", new Object[0]);
            this.f26313f.mo162I(-100, "", "", null);
        } catch (IOException e2) {
            Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", e2, "IOException", new Object[0]);
            this.f26313f.mo162I(-300, null, "", null);
        } catch (Throwable th) {
            Log.printErrStackTrace("Finder.FinderLiveMpLinkVerifier", th, "Throwable", new Object[0]);
            this.f26313f.mo162I(-300, "", "", null);
        }
    }
}
