package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: kd0.w */
public class C76549w {

    /* renamed from: a */
    public String f224048a;

    /* renamed from: b */
    public long f224049b;

    public C76549w(String str) {
        try {
            int i = 1;
            String[] split = (str.endsWith("\n") ? str.substring(0, str.length() - 1) : str).split(XVFSFile.PATH_SEPARATOR);
            if (split.length != 4 || !C72996z1.m85811N4(split[0])) {
                i = 0;
            }
            if (split.length > i) {
                this.f224048a = split[i];
            }
            int i2 = i + 1;
            if (split.length > i2) {
                this.f224049b = Util.getLong(split[i2], 0);
            }
            int i3 = i + 2;
            if (split.length > i3) {
                split[i3].equals("1");
            }
        } catch (Exception unused) {
            if (this.f224048a == null) {
                this.f224048a = "";
            }
            this.f224049b = 0;
            Log.m105920e("MicroMsg.VoiceContent", "VoiceContent parse failed.");
        }
    }

    /* renamed from: c */
    public static String m92049c(String str, long j, boolean z) {
        return str + XVFSFile.PATH_SEPARATOR + j + XVFSFile.PATH_SEPARATOR + (z ? 1 : 0) + "\n";
    }

    /* renamed from: a */
    public String mo106792a() {
        return this.f224048a;
    }

    /* renamed from: b */
    public long mo106793b() {
        return this.f224049b;
    }
}
