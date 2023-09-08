package cb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: cb0.a */
public final class C54711a {

    /* renamed from: a */
    public static final C54711a f153346a = new C54711a();

    /* renamed from: b */
    public static final String f153347b;

    static {
        String str = VFSStrategy.m163776d("finder") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_DATA_ROOT=" + str);
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_LIVE_ROOT=" + (VFSStrategy.m163776d(WeChatBrands.Business.GROUP_LIVE) + XVFSFile.SEPARATOR_CHAR));
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_POSTING_ROOT=" + (VFSStrategy.m163776d("finderposting") + XVFSFile.SEPARATOR_CHAR));
        String str2 = str + "video/";
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_VIDEO_DIR=" + str2);
        f153347b = str2;
    }

    /* renamed from: a */
    public final String mo75606a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(f153347b);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("finder_video_");
        sb4.append(str);
        sb4.append('_');
        if (Util.isNullOrNil(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            str2 = MD5Util.getMD5String(str3);
        }
        sb4.append(str2);
        sb.append(sb4.toString());
        return sb.toString();
    }
}
