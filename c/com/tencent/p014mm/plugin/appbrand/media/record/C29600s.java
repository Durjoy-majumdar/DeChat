package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.s */
public class C29600s {
    /* renamed from: a */
    public static int m38829a(int i) {
        Log.m105925i("MicroMsg.Record.RecordErrorHandler", "getErrIdKey errType:%d", Integer.valueOf(i));
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                switch (i) {
                    case 15:
                        return 15;
                    case 16:
                        return 16;
                    case 17:
                        return 17;
                    case 18:
                        return 18;
                    case 19:
                        return 19;
                    case 20:
                        return 20;
                    case 21:
                        return 21;
                    case 22:
                        return 22;
                    case 23:
                        return 23;
                    case 24:
                        return 24;
                    case 25:
                        return 25;
                    case 26:
                        return 26;
                    default:
                        return 0;
                }
        }
    }
}
