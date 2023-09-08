package gf3;

import android.os.Bundle;
import b62.C92178b;
import b62.C92179c;
import b62.C92180d;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import sx3.C110818d0;
import wx3.C15601d;

/* renamed from: gf3.f */
public final class C98115f extends C98108b {
    /* renamed from: c */
    public Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        int i;
        boolean z = true;
        C94554a c = C94555d.m119567c(((MediaSingleInfo) C110818d0.m150914L(bVar.f263829a)).f272124e, true);
        if (c != null) {
            int i2 = c.f273445c;
            int i3 = c.f273446d;
            int i4 = c.f273456n;
            if (!(i4 == 90 || i4 == 270)) {
                z = false;
            }
            if (z) {
                i = i2;
                i2 = i3;
            } else {
                i = i3;
            }
            if (i2 > i) {
                VideoTransPara videoTransPara = cVar.f263831a;
                int i5 = videoTransPara.f267167e;
                if (i2 <= i5) {
                    i5 = i2;
                }
                int i6 = (i3 * i5) / i2;
                videoTransPara.f267166d = i5;
                videoTransPara.f267167e = i6;
                Log.m105924i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i5 + ' ' + i6);
            } else {
                VideoTransPara videoTransPara2 = cVar.f263831a;
                int i7 = videoTransPara2.f267167e;
                if (i <= i7) {
                    i7 = i;
                }
                int i8 = (i2 * i7) / i;
                videoTransPara2.f267166d = i8;
                videoTransPara2.f267167e = i7;
                Log.m105924i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i8 + ' ' + i7);
            }
        }
        return new MediaErrorInfo(C92180d.MediaRemuxIgnore, 0, (String) null, (Bundle) null, 12, (C8480h) null);
    }
}
