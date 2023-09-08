package com.tencent.p014mm.plugin.music.player.base;

/* renamed from: com.tencent.mm.plugin.music.player.base.h */
public class C94225h {
    /* renamed from: a */
    public static String m119167a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("errCode:" + i + ", err:");
        if (i == 66) {
            sb.append("create AudioTrack fail");
        } else if (i == 67) {
            sb.append("decode audio fail");
        } else if (i == 69) {
            sb.append("so file not found");
        } else if (i == 70) {
            sb.append("create temp file fail");
        } else if (i == 74) {
            sb.append("invalid seek or seek fail");
        } else if (i == 80) {
            sb.append("connect network fail");
        } else if (i == 101) {
            sb.append("recognition audio format error");
        } else if (i != 102) {
            switch (i) {
                case 53:
                    sb.append("file not found");
                    break;
                case 54:
                    sb.append("file can not read");
                    break;
                case 55:
                    sb.append("unknow format");
                    break;
                default:
                    switch (i) {
                        case 62:
                            sb.append("load or init native decode so fail");
                            break;
                        case 63:
                            sb.append("get audio info fail");
                            break;
                        case 64:
                            sb.append("invalid audio info");
                            break;
                        default:
                            switch (i) {
                                case 500:
                                    sb.append("error URL format");
                                    break;
                                case 501:
                                    sb.append("error player to prepare");
                                    break;
                                case 502:
                                    sb.append("error player to start");
                                    break;
                                case 503:
                                    sb.append("error player to pause");
                                    break;
                                case 504:
                                    sb.append("error player to stop");
                                    break;
                                default:
                                    switch (i) {
                                        case 600:
                                            sb.append("error create player fail, exceed max count audio players");
                                            break;
                                        case 601:
                                            sb.append("error, not found audioId");
                                            break;
                                        case 602:
                                            sb.append("error, not found param");
                                            break;
                                        case 603:
                                            sb.append("error, ready exist audioId");
                                            break;
                                        case 604:
                                            sb.append("error, invalid audioID");
                                            break;
                                        case 605:
                                            sb.append("error, invalid param");
                                            break;
                                        default:
                                            switch (i) {
                                                case 701:
                                                    sb.append("error, invalid param");
                                                    break;
                                                case 702:
                                                    sb.append("error, mmplayer set source occur error");
                                                    break;
                                                case 703:
                                                    sb.append("error, mmplayer media format error");
                                                    break;
                                                case 704:
                                                    sb.append("error, mmplayer create MediaCode error");
                                                    break;
                                                case 705:
                                                    sb.append("error, mmplayer get audio info error");
                                                    break;
                                                case 706:
                                                    sb.append("error, mmplayer decode error");
                                                    break;
                                                case 707:
                                                    sb.append("error, mmplayer create audio track orror");
                                                    break;
                                                default:
                                                    sb.append("unknow exception");
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            sb.append("write AudioTrack data fail");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        return 10001;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m119168b(int r3) {
        /*
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "MicroMsg.PlayerErrorHandler"
            java.lang.String r2 = "getErrCodeType, errorCode: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            r0 = 66
            r1 = 10001(0x2711, float:1.4014E-41)
            if (r3 == r0) goto L_0x004e
            r0 = 67
            if (r3 == r0) goto L_0x004e
            r0 = 69
            if (r3 == r0) goto L_0x004e
            r0 = 70
            if (r3 == r0) goto L_0x004e
            r0 = 74
            if (r3 == r0) goto L_0x004e
            r0 = 80
            if (r3 == r0) goto L_0x004b
            r0 = 101(0x65, float:1.42E-43)
            if (r3 == r0) goto L_0x0048
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L_0x004e
            switch(r3) {
                case 53: goto L_0x0045;
                case 54: goto L_0x0045;
                case 55: goto L_0x0048;
                default: goto L_0x0036;
            }
        L_0x0036:
            switch(r3) {
                case 62: goto L_0x004e;
                case 63: goto L_0x0048;
                case 64: goto L_0x0048;
                default: goto L_0x0039;
            }
        L_0x0039:
            switch(r3) {
                case 500: goto L_0x0044;
                case 501: goto L_0x0044;
                case 502: goto L_0x0044;
                case 503: goto L_0x0044;
                case 504: goto L_0x0044;
                default: goto L_0x003c;
            }
        L_0x003c:
            switch(r3) {
                case 600: goto L_0x0044;
                case 601: goto L_0x0044;
                case 602: goto L_0x0044;
                case 603: goto L_0x0044;
                case 604: goto L_0x0044;
                case 605: goto L_0x0044;
                default: goto L_0x003f;
            }
        L_0x003f:
            switch(r3) {
                case 701: goto L_0x0048;
                case 702: goto L_0x004e;
                case 703: goto L_0x0048;
                case 704: goto L_0x004e;
                case 705: goto L_0x0048;
                case 706: goto L_0x004e;
                case 707: goto L_0x004e;
                default: goto L_0x0042;
            }
        L_0x0042:
            r3 = -1
            return r3
        L_0x0044:
            return r1
        L_0x0045:
            r3 = 10003(0x2713, float:1.4017E-41)
            return r3
        L_0x0048:
            r3 = 10004(0x2714, float:1.4019E-41)
            return r3
        L_0x004b:
            r3 = 10002(0x2712, float:1.4016E-41)
            return r3
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.player.base.C94225h.m119168b(int):int");
    }
}
