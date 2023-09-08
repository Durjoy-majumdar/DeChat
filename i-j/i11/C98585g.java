package i11;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116271c0;
import com.tencent.p014mm.vfs.C116274d0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.XWebSdk;
import gy3.C87412m;
import java.util.HashSet;

/* renamed from: i11.g */
public final class C98585g {

    /* renamed from: a */
    public static final String[] f289072a = {"image2", "voice2", "avatar", "emoji", "video", "bizimg", "URLImageCache", "wxaNonFlattenFileSystem", "sns", "record", "wxaFlattenFileSystem", "finder", "WxaCommCacheFiles", "WxaJsCodeCache", "WxaCodePkgsCache", "WxaCodePkgsCacheGlobal", "WxaSkylineCache"};

    /* renamed from: b */
    public static final int[] f289073b = {CodecError.DEQUEUEINPUTBUFFER_ILLEGAL, 22000, 8000, 3000, 2500, 2000, 1600, 1600, 1300, 1300, 1000, 600, 500, 400, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 500};

    /* renamed from: a */
    public static final int m128098a(int i, boolean z) {
        if ((65536 & i) == 0 && (!z || (1073741824 & i) == 0)) {
            if ((i & 4096) != 0) {
                return 2;
            }
            int i2 = i & 4095;
            return (i2 == 1 || i2 == 12 || i2 == 13) ? 0 : 1;
        }
    }

    /* renamed from: b */
    public static final void m128099b() {
        HashSet hashSet = new HashSet(4);
        Context context = MMApplicationContext.getContext();
        String[] strArr = {XWebSdk.getCurrentVersionDir(context), XWebSdk.getPredownloadVersionDir(context), XWebSdk.getNewestVersionDir(context)};
        for (int i = 0; i < 3; i++) {
            String str = strArr[i];
            if (!(str == null || str.length() == 0)) {
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                String path2 = n.getPath();
                int lastIndexOf = path2.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    path2 = path2.substring(lastIndexOf + 1);
                }
                C87412m.m108593f(path2, "VFSFile(it).name");
                if (path2.length() > 0) {
                    hashSet.add(path2);
                }
            }
        }
        C116271c0 c0Var = C116271c0.f348905a;
        C116274d0.f348935o = hashSet;
    }
}
