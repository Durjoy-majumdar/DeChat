package js0;

import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.zlib_ng_jni.CRC32JNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;

/* renamed from: js0.g */
public final class C9513g {
    /* renamed from: a */
    public static final long m9208a(String str) {
        C86001b0 q;
        long j = 0;
        if (str != null) {
            if (!(str.length() == 0)) {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                int[] iArr = {0};
                long crc32 = CRC32JNI.crc32(str, iArr);
                if (iArr[0] != 0) {
                    Log.m105920e("MicroMsg.ChecksumUtil", "crc32 failed, errno: " + iArr[0]);
                    return 0;
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                Object[] objArr = new Object[4];
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    path2 = path2.substring(lastIndexOf + 1);
                }
                objArr[0] = path2;
                objArr[1] = Long.valueOf(crc32);
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (l.mo177810a() && (q = l.f348991a.mo119945q(l.f348992b)) != null) {
                    j = q.f250473c;
                }
                objArr[2] = Double.valueOf(((double) j) / 1024.0d);
                objArr[3] = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
                Log.m105925i("MicroMsg.ChecksumUtil", "crc32: file(%s), checksum(%d), size(%.2f)KB, cost(%d)ms", objArr);
                return crc32;
            }
        }
        return 0;
    }
}
