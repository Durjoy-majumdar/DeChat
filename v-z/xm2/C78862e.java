package xm2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: xm2.e */
public class C78862e {

    /* renamed from: b */
    public static C78863a f231706b;

    /* renamed from: c */
    public static C78862e f231707c;

    /* renamed from: a */
    public boolean f231708a = false;

    /* renamed from: xm2.e$a */
    public interface C78863a {
    }

    /* renamed from: a */
    public final int mo108885a(String str, int i) {
        String[] split = str.split(XVFSFile.PATH_SEPARATOR);
        if (split.length == 2 && split[0].length() == 2) {
            try {
                return Integer.parseInt(split[0], 10);
            } catch (Exception unused) {
                Log.m105925i("MicroMsg.FixToolsUplogModel", "parse int %s failed", split[0]);
            }
        } else {
            Log.m105925i("MicroMsg.FixToolsUplogModel", "hour to int %s failed", str);
        }
        return i;
    }
}
