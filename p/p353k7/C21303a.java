package p353k7;

import android.media.MediaCodecInfo;
import p333e8.C20551y;

/* renamed from: k7.a */
public final class C21303a {

    /* renamed from: a */
    public final String f60160a;

    /* renamed from: b */
    public final boolean f60161b;

    /* renamed from: c */
    public final boolean f60162c;

    /* renamed from: d */
    public final boolean f60163d;

    /* renamed from: e */
    public final String f60164e;

    /* renamed from: f */
    public final MediaCodecInfo.CodecCapabilities f60165f;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        if ((p333e8.C20551y.f57835a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21303a(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            r2.getClass()
            r1.f60160a = r2
            r1.f60164e = r3
            r1.f60165f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x0027
            if (r4 == 0) goto L_0x0027
            int r5 = p333e8.C20551y.f57835a
            r0 = 19
            if (r5 < r0) goto L_0x0022
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r5 == 0) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            r1.f60161b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0042
            int r0 = p333e8.C20551y.f57835a
            if (r0 < r5) goto L_0x003d
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            r1.f60162c = r0
            if (r6 != 0) goto L_0x005d
            if (r4 == 0) goto L_0x005c
            int r6 = p333e8.C20551y.f57835a
            if (r6 < r5) goto L_0x0058
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0058
            r4 = 1
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            if (r4 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            r1.f60163d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p353k7.C21303a.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    /* renamed from: a */
    public boolean mo33304a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f60165f;
        if (codecCapabilities == null) {
            int i3 = C20551y.f57835a;
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            int i4 = C20551y.f57835a;
            return false;
        }
        int i5 = (d > -1.0d ? 1 : (d == -1.0d ? 0 : -1));
        if ((i5 == 0 || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d)) {
            return true;
        }
        if (i < i2) {
            if ((i5 == 0 || d <= 0.0d) ? videoCapabilities.isSizeSupported(i2, i) : videoCapabilities.areSizeAndRateSupported(i2, i, d)) {
                int i6 = C20551y.f57835a;
                return true;
            }
        }
        int i7 = C20551y.f57835a;
        return false;
    }
}
