package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.decoder.logger.ILog;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: ac3.e0 */
public final class C27850e0 implements ILog {
    /* renamed from: d */
    public void mo55635d(String str, String str2) {
        Log.m105918d("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2));
    }

    /* renamed from: e */
    public void mo55636e(String str, String str2) {
        Log.m105920e("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2));
    }

    /* renamed from: i */
    public void mo55638i(String str, String str2) {
        Log.m105924i("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, str2);
    }

    /* renamed from: v */
    public void mo55639v(String str, String str2) {
        Log.m105926v("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2));
    }

    /* renamed from: w */
    public void mo55640w(String str, String str2) {
        Log.m105928w("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, String.valueOf(str2));
    }

    /* renamed from: e */
    public void mo55637e(String str, String str2, Throwable th) {
        Log.printErrStackTrace("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, th, String.valueOf(str2), new Object[0]);
    }
}
