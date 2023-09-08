package p164hp;

import a14.C53895h;
import au3.C54328a;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86301e;
import ei3.C86522b;
import p523fp.C59265h;
import rx3.C13605o;
import wx3.C15601d;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hp.b */
public final class C32973b extends C86301e implements C59265h {

    /* renamed from: d */
    public static final C20992d f89586d = new C20992d();

    public boolean Ft0(String str) {
        f89586d.getClass();
        if (str == null || str.length() == 0) {
            return false;
        }
        return C86013q1.m106450k(C20992d.f59435c + XVFSFile.SEPARATOR_CHAR + MD5Util.getMD5String(str));
    }

    /* renamed from: Xj */
    public Object mo58904Xj(String str, boolean z, String str2, C15601d<? super C13605o<Boolean, String, String>> dVar) {
        C20992d dVar2 = f89586d;
        dVar2.getClass();
        int random = (int) (Math.random() * ((double) 10000));
        Log.m105924i("Download.SuperDownloaderWrapCore", "#getResourceFromUrl " + random + " isNeedUnzip=" + z + " url=" + str + " md5=" + str2);
        return str == null || str.length() == 0 ? new C13605o(Boolean.FALSE, "", "") : C53895h.m60469g(C54328a.f152462f, new C108254h(dVar2, str, random, str2, z, (C15601d<? super C108254h>) null), dVar);
    }

    /* renamed from: bi */
    public Object mo58905bi(String str, C15601d<? super Boolean> dVar) {
        return f89586d.mo32721e(str, dVar);
    }
}
