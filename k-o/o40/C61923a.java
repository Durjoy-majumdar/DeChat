package o40;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C87412m;
import junit.framework.AssertionFailedError;
import o40.C11348f;
import p966fj.C86869a;

/* renamed from: o40.a */
public final class C61923a implements C11348f {

    /* renamed from: a */
    public final Long[] f176032a;

    /* renamed from: b */
    public final int f176033b;

    /* renamed from: c */
    public final String f176034c;

    /* renamed from: d */
    public final C61924a f176035d;

    /* renamed from: o40.a$a */
    public interface C61924a {
        /* renamed from: a */
        int mo84419a(String str);

        int getVersion();
    }

    public C61923a(Long[] lArr, int i, String str, C61924a aVar) {
        C87412m.m108594g(lArr, "idKeyArray");
        C87412m.m108594g(str, "name");
        C87412m.m108594g(aVar, "generator");
        this.f176032a = lArr;
        this.f176033b = i;
        this.f176034c = str;
        this.f176035d = aVar;
    }

    /* renamed from: a */
    public void mo11369a(String str, boolean z, C11348f.C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LEVEL);
        C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
        if (z) {
            mo86837c("assertFalse", str, aVar.invoke(), z2, z3, bVar);
        }
    }

    /* renamed from: b */
    public void mo11370b(String str, boolean z, C11348f.C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LEVEL);
        C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
        if (!z) {
            mo86837c("assertTrue", str, aVar.invoke(), z2, z3, bVar);
        }
    }

    /* renamed from: c */
    public final void mo86837c(String str, String str2, String str3, boolean z, boolean z2, C11348f.C11352b bVar) {
        C86869a aVar = C86869a.INSTANCE;
        int a = this.f176035d.mo84419a(str2);
        if (bVar.mo11371a() <= C11348f.C11352b.WARNING.mo11371a()) {
            String str4 = this.f176034c;
            Log.m105928w(str4, str + ": key=[" + str2 + XVFSFile.PATH_SEPARATOR_CHAR + a + "] message=" + str3);
        } else {
            String str5 = this.f176034c;
            Log.m105920e(str5, str + ": key=[" + str2 + XVFSFile.PATH_SEPARATOR_CHAR + a + "] message=" + str3);
        }
        if (z) {
            int i = a / 255;
            if (a > 0) {
                Long[] lArr = this.f176032a;
                if (lArr.length > i) {
                    aVar.mo121330b(lArr[i].longValue(), (long) a, 1);
                }
            }
            aVar.mo121331c(this.f176033b, String.valueOf(this.f176035d.getVersion()), String.valueOf(a), str3, str2, Integer.valueOf(bVar.mo11371a()));
        }
        if (z2) {
            throw new AssertionFailedError(str3);
        }
    }
}
