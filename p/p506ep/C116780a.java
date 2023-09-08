package p506ep;

import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115890j;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C57538o;
import com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.CheckResUpdateHelper;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115908t;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import eb0.C7624i3;
import ei3.C86522b;
import f40.C86709a0;
import java.util.List;
import java.util.Locale;
import ob0.C117747y;
import p523fp.C32147e;
import p749xh.C118881x7;
import p757xv.C118903j;
import p757xv.C118904l;
import p757xv.C91346k;
import p933be.C113159b;

@C86522b
/* renamed from: ep.a */
public class C116780a extends C86301e implements C32147e {
    /* renamed from: AD */
    public String mo58507AD(int i, int i2) {
        return CheckResUpdateHelper.m162971c().mo176402b(i, i2);
    }

    /* renamed from: K7 */
    public C117747y mo58508K7(List<Integer> list) {
        return new C57538o(list);
    }

    /* renamed from: Us */
    public List<C118881x7> mo58509Us(int i) {
        CheckResUpdateHelper.m162971c().getClass();
        C115908t tVar = C115908t.C115910b.f347790a;
        String format = String.format(Locale.ENGLISH, "%s.%%.data", new Object[]{Integer.valueOf(i)});
        if (!tVar.f347788e) {
            return null;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        try {
            return tVar.f347784a.mo176462qq(format);
        } finally {
            Log.m105925i("MicroMsg.ResDownloaderCore", "queryForKeyLike %s, cost:%d", format, Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
        }
    }

    public void Y40(int i, int i2, int i3) {
        CheckResUpdateHelper.m162971c().mo176403d(i, i2, i3, true);
    }

    public void Yi0(int i) {
        CheckResUpdateHelper.m162971c().getClass();
        Class cls = C118904l.class;
        boolean z = true;
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, resType = %d", Integer.valueOf(i));
        if (((C118903j) C86312j.m106911c(C118903j.class)).mo76562e2(84)) {
            C113159b.C113163c a = C113159b.m154842h().mo165664a();
            ((C118904l) C86312j.m106911c(cls)).So0(i, a);
            if (((C91346k) C86312j.m106911c(C91346k.class)).mo125330QL()) {
                Log.m105928w("MicroMsg.ResDownloader.CheckResUpdateHelper", "skip doCheck for low energy: doze mode on!");
            } else if (!C113159b.m154843i() || a.mo165679d() || a.mo165678c()) {
                z = false;
            } else {
                Log.m105928w("MicroMsg.ResDownloader.CheckResUpdateHelper", "skip doCheck for low energy: bg & non-charging!");
            }
            if (z) {
                ((C118904l) C86312j.m106911c(cls)).mo76561bO(84);
            }
        }
        boolean m = C86709a0.m107523b().mo121115m();
        boolean equals = C7624i3.f25910c.mo19a("login_user_name", "").equals("");
        if (m || !equals) {
            C86709a0.m107529k().f251779b.mo123460f(new C57538o(i));
            return;
        }
        Log.m105924i("MicroMsg.ResDownloader.CheckResUpdateHelper", "doCheck, not login, skip");
    }

    public void b70(int i, int i2, int i3, boolean z) {
        CheckResUpdateHelper.m162971c().mo176403d(i, i2, i3, z);
    }

    /* renamed from: e6 */
    public String mo58513e6(int i, int i2) {
        CheckResUpdateHelper.m162971c().getClass();
        C115913v e = C115908t.C115910b.f347790a.mo176453e(C115890j.m163009c(i, i2));
        if (e != null) {
            return e.field_originalMd5;
        }
        Log.m105925i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalMd5, %d.%d, get null info, return", Integer.valueOf(i), Integer.valueOf(i2));
        return null;
    }

    /* renamed from: sC */
    public int mo58514sC(int i, int i2) {
        CheckResUpdateHelper.m162971c().getClass();
        C115913v e = C115908t.C115910b.f347790a.mo176453e(C115890j.m163009c(i, i2));
        if (e == null) {
            return 0;
        }
        return Util.getInt(e.field_fileVersion, 0);
    }
}
