package com.tencent.qqmusic.mediaplayer.upstream;

import android.net.Uri;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import java.net.URL;
import java.util.Map;

public class HttpDataSource implements IDataSource {
    private final Map<String, String> headers;
    private IMediaHTTPConnection mediaHTTPConnection;
    private final IMediaHTTPService service;
    private final Uri uri;

    public HttpDataSource(Uri uri2, Map<String, String> map, IMediaHTTPService iMediaHTTPService) {
        this.uri = uri2;
        this.headers = map;
        this.service = iMediaHTTPService;
    }

    public void close() {
        IMediaHTTPConnection iMediaHTTPConnection = this.mediaHTTPConnection;
        if (iMediaHTTPConnection != null) {
            iMediaHTTPConnection.disconnect();
        }
    }

    public AudioFormat.AudioType getAudioType() {
        return FormatDetector.getAudioFormat((IDataSource) this, false);
    }

    public long getSize() {
        return this.mediaHTTPConnection.getSize();
    }

    public void open() {
        IMediaHTTPConnection makeHTTPConnection = this.service.makeHTTPConnection();
        this.mediaHTTPConnection = makeHTTPConnection;
        makeHTTPConnection.connect(new URL(this.uri.toString()), this.headers);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0010 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0011 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int readAt(long r8, byte[] r10, int r11, int r12) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            int r5 = r11 + r0
            com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection r1 = r7.mediaHTTPConnection
            long r2 = (long) r0
            long r2 = r2 + r8
            int r6 = r12 - r5
            r4 = r10
            int r1 = r1.readAt(r2, r4, r5, r6)
            if (r1 >= 0) goto L_0x0011
            return r1
        L_0x0011:
            if (r1 != 0) goto L_0x0014
            goto L_0x0017
        L_0x0014:
            int r0 = r0 + r1
            if (r0 < r12) goto L_0x0001
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.upstream.HttpDataSource.readAt(long, byte[], int, int):int");
    }
}
