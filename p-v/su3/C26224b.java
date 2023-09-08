package su3;

import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.util.WXWebReporter;
import kk0.C88191m;
import pu3.C25488j;
import tu3.C26312a;

/* renamed from: su3.b */
public final class C26224b {
    /* renamed from: a */
    public static short m33669a(int i, int i2) {
        if ((i & -256) != 0) {
            throw new IllegalArgumentException("bogus lowByte");
        } else if ((i2 & -256) == 0) {
            return (short) (i | (i2 << 8));
        } else {
            throw new IllegalArgumentException("bogus highByte");
        }
    }

    /* renamed from: b */
    public static short m33670b(int i, int i2, int i3, int i4) {
        if ((i & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble0");
        } else if ((i2 & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble1");
        } else if ((i3 & -16) != 0) {
            throw new IllegalArgumentException("bogus nibble2");
        } else if ((i4 & -16) == 0) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        } else {
            throw new IllegalArgumentException("bogus nibble3");
        }
    }

    /* renamed from: c */
    public static short m33671c(int i) {
        if ((-65536 & i) == 0) {
            return (short) i;
        }
        throw new C25488j("Register A out of range: " + C26312a.m33787e((long) i));
    }

    /* renamed from: d */
    public static short m33672d(int i) {
        if ((-65536 & i) == 0) {
            return (short) i;
        }
        throw new C25488j("Register B out of range: " + C26312a.m33787e((long) i));
    }

    /* renamed from: e */
    public static int m33673e(int i) {
        if (i == 256 || i == 512 || i == 768) {
            return 1;
        }
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 33:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                return 1;
            case 26:
            case 27:
                return 3;
            case 28:
            case 31:
            case 32:
            case 34:
            case 35:
            case 36:
            case 37:
                return 2;
            default:
                switch (i) {
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                        return 1;
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                        return 5;
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                        return 4;
                    default:
                        switch (i) {
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                                return 4;
                            default:
                                switch (i) {
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                    case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                                    case TPOptionalID.f349338xc9bdf6cd /*143*/:
                                    case 144:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    case 151:
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 167:
                                    case 168:
                                    case 169:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case C88191m.CTRL_INDEX /*173*/:
                                    case WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE:
                                    case WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO:
                                    case WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED:
                                    case WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL:
                                    case WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED:
                                    case WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED:
                                    case 180:
                                    case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD:
                                    case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS:
                                    case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED:
                                    case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED:
                                    case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD:
                                    case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS:
                                    case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED:
                                    case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED:
                                    case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD:
                                    case 190:
                                    case 191:
                                    case 192:
                                    case 193:
                                    case 194:
                                    case 195:
                                    case 196:
                                    case WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA:
                                    case 198:
                                    case WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE:
                                    case 200:
                                    case 201:
                                    case 202:
                                    case 203:
                                    case 204:
                                    case 205:
                                    case 206:
                                    case 207:
                                    case 208:
                                    case 209:
                                    case 210:
                                    case 211:
                                    case 212:
                                    case 213:
                                    case JsApiCheckIsSupportFaceDetect.CTRL_INDEX:
                                    case 215:
                                    case 216:
                                    case 217:
                                    case 218:
                                    case 219:
                                    case 220:
                                    case 221:
                                    case WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS:
                                    case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB:
                                    case WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL:
                                    case 225:
                                    case 226:
                                        return 1;
                                    default:
                                        return 0;
                                }
                        }
                }
        }
    }

    /* renamed from: f */
    public static short m33674f(long j) {
        short s = (short) ((int) j);
        if (j == ((long) s)) {
            return s;
        }
        throw new C25488j("Literal out of range: " + C26312a.m33787e(j));
    }

    /* renamed from: g */
    public static short m33675g(int i, int i2) {
        int i3 = i - i2;
        short s = (short) i3;
        if (i3 == s) {
            return s;
        }
        throw new C25488j("Target out of range: " + C26312a.m33783a(i3) + ", perhaps you need to enable force jumbo mode.");
    }

    /* renamed from: h */
    public static int m33676h(int i, int i2) {
        if ((i & -16) != 0) {
            throw new IllegalArgumentException("bogus lowNibble");
        } else if ((i2 & -16) == 0) {
            return i | (i2 << 4);
        } else {
            throw new IllegalArgumentException("bogus highNibble");
        }
    }
}
