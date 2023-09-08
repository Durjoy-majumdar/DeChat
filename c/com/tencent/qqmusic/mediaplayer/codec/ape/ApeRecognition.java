package com.tencent.qqmusic.mediaplayer.codec.ape;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;

public class ApeRecognition implements IAudioRecognition {
    public static final String TAG = "ApeRecognition";

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r3 = (r3 = r0.getAudioInformation()).getAudioType();
        r0 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String r3, byte[] r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0015
            int r0 = r4.length
            if (r0 <= 0) goto L_0x0015
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r4 = "MAC"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L_0x0015
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r3 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE
            return r3
        L_0x0015:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r4 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            com.tencent.qqmusic.mediaplayer.codec.NativeDecoder r0 = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder
            r0.<init>()
            com.tencent.qqmusic.mediaplayer.upstream.FileDataSource r1 = new com.tencent.qqmusic.mediaplayer.upstream.FileDataSource
            r1.<init>(r3)
            int r3 = r0.init((com.tencent.qqmusic.mediaplayer.upstream.IDataSource) r1)
            if (r3 != 0) goto L_0x0036
            com.tencent.qqmusic.mediaplayer.AudioInformation r3 = r0.getAudioInformation()
            if (r3 == 0) goto L_0x0036
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r3 = r3.getAudioType()
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r0 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE
            if (r3 != r0) goto L_0x0036
            r4 = r0
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.ape.ApeRecognition.getAudioType(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    public AudioFormat.AudioType guessAudioType(String str) {
        return (TextUtils.isEmpty(str) || (!str.toLowerCase().contains(".ape") && !str.toLowerCase().contains(".mac"))) ? AudioFormat.AudioType.UNSUPPORT : AudioFormat.AudioType.APE;
    }
}
