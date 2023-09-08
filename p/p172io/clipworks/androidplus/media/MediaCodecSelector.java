package p172io.clipworks.androidplus.media;

import android.media.MediaCodecInfo;
import java.util.List;

/* renamed from: io.clipworks.androidplus.media.MediaCodecSelector */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector$$a();

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z, boolean z2);
}
