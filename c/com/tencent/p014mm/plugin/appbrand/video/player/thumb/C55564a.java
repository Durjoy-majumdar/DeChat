package com.tencent.p014mm.plugin.appbrand.video.player.thumb;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: com.tencent.mm.plugin.appbrand.video.player.thumb.a */
public final class C55564a {

    /* renamed from: a */
    public static final String f158196a;

    static {
        String str = VFSStrategy.m163776d("finder") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_DATA_ROOT=" + str);
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_LIVE_ROOT=" + (VFSStrategy.m163776d(WeChatBrands.Business.GROUP_LIVE) + XVFSFile.SEPARATOR_CHAR));
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_POSTING_ROOT=" + (VFSStrategy.m163776d("finderposting") + XVFSFile.SEPARATOR_CHAR));
        String str2 = str + "video/";
        Log.m105924i("MMPMediaFileCachePathRouter", "FINDER_VIDEO_DIR=" + str2);
        f158196a = str2;
    }
}
