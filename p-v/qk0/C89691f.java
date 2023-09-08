package qk0;

import com.tencent.thumbplayer.api.TPOptionalID;

/* renamed from: qk0.f */
public class C89691f {
    /* renamed from: a */
    public static String m112154a(int i) {
        if (i == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i == 133) {
            return "GATT ERROR";
        }
        if (i == 256) {
            return "GATT CONN CANCEL ";
        }
        if (i == 257) {
            return "GATT FAILURE, TOO MANY OPEN CONNECTIONS";
        }
        switch (i) {
            case 0:
                return "GATT SUCCESS";
            case 1:
                return "GATT INVALID HANDLE";
            case 2:
                return "GATT READ NOT PERMIT";
            case 3:
                return "GATT WRITE NOT PERMIT";
            case 4:
                return "GATT INVALID PDU";
            case 5:
                return "GATT INSUF AUTHENTICATION";
            case 6:
                return "GATT REQ NOT SUPPORTED";
            case 7:
                return "GATT INVALID OFFSET";
            case 8:
                return "GATT INSUF AUTHORIZATION";
            case 9:
                return "GATT PREPARE Q FULL";
            case 10:
                return "GATT NOT FOUND";
            case 11:
                return "GATT NOT LONG";
            case 12:
                return "GATT INSUF KEY SIZE";
            case 13:
                return "GATT INVALID ATTR LEN";
            case 14:
                return "GATT ERR UNLIKELY";
            case 15:
                return "GATT INSUF ENCRYPTION";
            case 16:
                return "GATT UNSUPPORT GRP TYPE";
            case 17:
                return "GATT INSUF RESOURCE";
            default:
                switch (i) {
                    case 128:
                        return "GATT NO RESOURCES";
                    case 129:
                        return "GATT INTERNAL ERROR";
                    case 130:
                        return "GATT WRONG STATE";
                    case 131:
                        return "GATT DB FULL";
                    case 132:
                        return "GATT BUSY";
                    case 133:
                        return "GATT ERROR";
                    case 134:
                        return "GATT CMD STARTED";
                    case 135:
                        return "GATT ILLEGAL PARAMETER";
                    case 136:
                        return "GATT PENDING";
                    case 137:
                        return "GATT AUTH FAIL";
                    case 138:
                        return "GATT MORE";
                    case 139:
                        return "GATT INVALID CFG";
                    case 140:
                        return "GATT SERVICE STARTED";
                    case 141:
                        return "GATT ENCRYPTED NO MITM";
                    case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                        return "GATT NOT ENCRYPTED";
                    case TPOptionalID.f349338xc9bdf6cd /*143*/:
                        return "GATT CONGESTED";
                    default:
                        switch (i) {
                            case 253:
                                return "GATT CCCD CFG ERROR";
                            case 254:
                                return "GATT PROCEDURE IN PROGRESS";
                            case 255:
                                return "GATT VALUE OUT OF RANGE";
                            default:
                                return "UNKNOWN (" + i + ")";
                        }
                }
        }
    }
}
