package er1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import hp3.C87581a;
import ht1.C60216z4;
import ob0.C89132b;
import rx3.C13598b0;
import rx3.C13604l;
import t91.C64208c;
import te3.C50008jm0;
import te3.C64273c21;

/* renamed from: er1.p4 */
public final class C58768p4<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ long f168255a;

    /* renamed from: b */
    public final /* synthetic */ C8477a0 f168256b;

    /* renamed from: c */
    public final /* synthetic */ String f168257c;

    /* renamed from: d */
    public final /* synthetic */ String f168258d;

    /* renamed from: e */
    public final /* synthetic */ C60216z4.C8821a<Void> f168259e;

    /* renamed from: f */
    public final /* synthetic */ C60216z4.C8821a<Integer> f168260f;

    public C58768p4(long j, C8477a0 a0Var, String str, String str2, C60216z4.C8821a<Void> aVar, C60216z4.C8821a<Integer> aVar2) {
        this.f168255a = j;
        this.f168256b = a0Var;
        this.f168257c = str;
        this.f168258d = str2;
        this.f168259e = aVar;
        this.f168260f = aVar2;
    }

    public Object call(Object obj) {
        C13598b0 b0Var;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        FinderObject finderObject = ((C50008jm0) cVar.f256796d).f136184e;
        if (finderObject == null) {
            return null;
        }
        long j = this.f168255a;
        C8477a0 a0Var = this.f168256b;
        String str = this.f168257c;
        String str2 = this.f168258d;
        C60216z4.C8821a<Void> aVar = this.f168259e;
        C60216z4.C8821a<Integer> aVar2 = this.f168260f;
        C58759o4.f168230b.put(Long.valueOf(j), new C13604l(Long.valueOf(System.currentTimeMillis()), finderObject));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            if (a0Var.f27482d) {
                C115669n.INSTANCE.mo175913w(1837, 2, 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("jumpLiveUI liveId: ");
            C64273c21 c212 = finderObject.liveInfo;
            if (c212 != null) {
                j = c212.f182392d;
            }
            sb.append(j);
            sb.append(", username:");
            String str3 = finderObject.username;
            if (str3 == null) {
                str3 = str == null ? "" : str;
            }
            sb.append(str3);
            Log.m105924i("Finder.FinderUtilApi", sb.toString());
            if (!(str2.length() > 0)) {
                str2 = null;
            }
            if (str2 != null) {
                String str4 = finderObject.username;
                if (str4 != null) {
                    str = str4;
                } else if (str == null) {
                    str = "";
                }
                C64208c.f181951a.mo89032g(str2, str);
            }
            if (aVar == null) {
                return null;
            }
            aVar.mo6382a(null);
            b0Var = C13598b0.f38549a;
        } else if (aVar2 == null) {
            return null;
        } else {
            aVar2.mo6382a(Integer.valueOf(cVar.f256794b));
            b0Var = C13598b0.f38549a;
        }
        return b0Var;
    }
}
