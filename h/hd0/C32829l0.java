package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: hd0.l0 */
public class C32829l0 {

    /* renamed from: a */
    public String f89291a;

    public C32829l0(String str) {
        String[] split = (str.endsWith("\n") ? str.substring(0, str.length() - 1) : str).split(XVFSFile.PATH_SEPARATOR);
        try {
            if (split.length > 0) {
                this.f89291a = split[0];
            }
            if (split.length > 1) {
                Util.getLong(split[1], 0);
            }
            if (split.length > 2) {
                split[2].equals("1");
            }
        } catch (Exception unused) {
            if (this.f89291a == null) {
                this.f89291a = "";
            }
            Log.m105920e("MicroMsg.VideoContent", "VoiceContent parse failed.");
        }
    }

    /* renamed from: b */
    public static String m39827b(String str, long j, boolean z) {
        return str + XVFSFile.PATH_SEPARATOR + j + XVFSFile.PATH_SEPARATOR + (z ? 1 : 0) + "\n";
    }

    /* renamed from: a */
    public String mo58825a() {
        return this.f89291a;
    }
}
