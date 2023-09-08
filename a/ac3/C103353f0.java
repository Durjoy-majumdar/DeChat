package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import yp3.C112478a;

/* renamed from: ac3.f0 */
public final class C103353f0 implements C112478a.C112479a {
    public int getLogLevel() {
        return 0;
    }

    public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        Log.m105918d("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, str4);
    }

    public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        Log.m105920e("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, str4);
    }

    public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        Log.m105924i("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, str4);
    }

    public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        Log.m105926v("MicroMsg.TAVKit" + XVFSFile.PATH_SEPARATOR_CHAR + str, str4);
    }

    public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        Log.m105928w("MicroMsg.TAVKit", str4);
    }
}
