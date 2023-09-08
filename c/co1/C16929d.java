package co1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaDecoderInfo;
import com.tencent.thumbplayer.core.common.TPMediaDecoderList;
import com.tencent.thumbplayer.core.common.TPPlayerDecoderCapability;
import com.tencent.thumbplayer.core.thirdparties.LocalCache;
import gy3.C87412m;

/* renamed from: co1.d */
public final class C16929d {

    /* renamed from: a */
    public static final C16929d f45756a;

    /* renamed from: b */
    public static boolean f45757b = TPPlayerDecoderCapability.isHDRsupport(2, 0, 0);

    /* renamed from: c */
    public static boolean f45758c = TPPlayerDecoderCapability.isHDRsupport(0, 0, 0);

    /* renamed from: d */
    public static boolean f45759d = TPPlayerDecoderCapability.isHDRsupport(1, 0, 0);

    /* renamed from: e */
    public static boolean f45760e;

    static {
        C16929d dVar = new C16929d();
        f45756a = dVar;
        boolean z = false;
        synchronized (dVar) {
            TPMediaDecoderInfo[] tPMediaDecoderInfos = TPMediaDecoderList.getTPMediaDecoderInfos((LocalCache) null);
            C87412m.m108593f(tPMediaDecoderInfos, "infos");
            int length = tPMediaDecoderInfos.length;
            int i = 0;
            loop0:
            while (true) {
                if (i >= length) {
                    break;
                }
                TPMediaDecoderInfo tPMediaDecoderInfo = tPMediaDecoderInfos[i];
                if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                    TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
                    C87412m.m108593f(profileLevels, "profileLevels");
                    for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                        if (decoderProfileLevel.profile == 2) {
                            z = true;
                            break loop0;
                        }
                    }
                    continue;
                }
                i++;
            }
        }
        f45760e = z;
        StringBuilder sb = new StringBuilder();
        sb.append("isSupportDolbyVersion:");
        C16929d dVar2 = f45756a;
        sb.append(dVar2.mo18029a());
        sb.append(" isSupportHDR10:");
        sb.append(dVar2.mo18030b());
        sb.append(" isSupportHDR10PLUS:");
        Log.m105924i("HdrCapability", "isSupportHDR10PLUS:" + f45759d);
        sb.append(f45759d);
        sb.append(" isSupportHDRHLG:");
        sb.append(dVar2.mo18031c());
        Log.m105924i("HdrCapability", sb.toString());
    }

    /* renamed from: a */
    public final boolean mo18029a() {
        Log.m105924i("HdrCapability", "isSupportDolbyVersion:" + f45757b);
        return f45757b;
    }

    /* renamed from: b */
    public final boolean mo18030b() {
        Log.m105924i("HdrCapability", "isSupportHDR10:" + f45758c);
        return f45758c;
    }

    /* renamed from: c */
    public final boolean mo18031c() {
        Log.m105924i("HdrCapability", "isSupportHDRHLG:" + f45760e);
        return f45760e;
    }
}
