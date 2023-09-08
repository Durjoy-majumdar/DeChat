package ee0;

import com.tencent.p014mm.sdk.platformtools.InetUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.net.InetAddress;

/* renamed from: ee0.c */
public class C45649c {

    /* renamed from: a */
    public InetAddress f123442a;

    /* renamed from: b */
    public int f123443b;

    /* renamed from: c */
    public int f123444c;

    public C45649c(InetAddress inetAddress, int i, int i2) {
        this.f123442a = inetAddress;
        this.f123443b = i;
        this.f123444c = i2;
    }

    /* renamed from: a */
    public static C45649c m50850a(String str) {
        String[] split;
        if (!(str == null || (split = str.split(XVFSFile.PATH_SEPARATOR)) == null || split.length != 3)) {
            try {
                return new C45649c(InetUtil.getByDottedAddress(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.InAddress", "exception:%s", Util.stackTraceToString(e));
            }
        }
        return null;
    }

    public String toString() {
        int i = this.f123444c;
        String str = i == 2 ? "dns" : i == 3 ? "svrdns" : i == 4 ? "waphc" : i == 5 ? "newdns" : i == 6 ? "auth" : i == 7 ? "debug" : "hc";
        return this.f123442a.getHostAddress() + XVFSFile.PATH_SEPARATOR + this.f123443b + "(" + str + ")";
    }
}
