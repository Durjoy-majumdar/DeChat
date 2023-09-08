package es3;

/* renamed from: es3.a */
public final class C107290a {

    /* renamed from: a */
    public static final C107290a f321014a = new C107290a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.media.AudioManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.maas.camerafun.MJAudioDeviceType mo157794a(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "media_router"
            java.lang.Object r0 = r4.getSystemService(r0)
            boolean r1 = r0 instanceof android.media.MediaRouter
            r2 = 0
            if (r1 == 0) goto L_0x0013
            android.media.MediaRouter r0 = (android.media.MediaRouter) r0
            goto L_0x0014
        L_0x0013:
            r0 = r2
        L_0x0014:
            r1 = 1
            if (r0 == 0) goto L_0x001c
            android.media.MediaRouter$RouteInfo r0 = r0.getSelectedRoute(r1)
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            if (r0 != 0) goto L_0x0022
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.Unknown
            return r4
        L_0x0022:
            int r0 = r0.getDeviceType()
            if (r0 == 0) goto L_0x003c
            if (r0 == r1) goto L_0x0039
            r4 = 2
            if (r0 == r4) goto L_0x0036
            r4 = 3
            if (r0 == r4) goto L_0x0033
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.Unknown
            goto L_0x005b
        L_0x0033:
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.BlueTooth
            goto L_0x005b
        L_0x0036:
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.LoudSpeaker
            goto L_0x005b
        L_0x0039:
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.Unknown
            goto L_0x005b
        L_0x003c:
            java.lang.String r0 = "audio"
            java.lang.Object r4 = r4.getSystemService(r0)
            boolean r0 = r4 instanceof android.media.AudioManager
            if (r0 == 0) goto L_0x0049
            r2 = r4
            android.media.AudioManager r2 = (android.media.AudioManager) r2
        L_0x0049:
            r4 = 0
            if (r2 == 0) goto L_0x0053
            boolean r0 = r2.isWiredHeadsetOn()
            if (r0 != r1) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.HeadPhone
            goto L_0x005b
        L_0x0059:
            com.tencent.maas.camerafun.MJAudioDeviceType r4 = com.tencent.maas.camerafun.MJAudioDeviceType.LoudSpeaker
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: es3.C107290a.mo157794a(android.content.Context):com.tencent.maas.camerafun.MJAudioDeviceType");
    }
}
