package su3;

import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.util.WXWebReporter;
import pu3.C25488j;
import tu3.C26312a;
import uu3.C111226b;

/* renamed from: su3.c */
public final class C26225c extends C26227e {

    /* renamed from: b */
    public final C111226b f73124b = new C111226b();

    /* renamed from: c */
    public int f73125c = 0;

    public C26225c() {
        super((C26227e) null);
    }

    /* renamed from: a */
    public void mo53098a(int i, int i2, Object obj, int i3, int i4) {
        mo53109l(i);
        int i5 = this.f73125c + 4;
        this.f73125c = i5;
        if (i4 == 1) {
            int length = ((byte[]) obj).length;
            this.f73125c = i5 + (length >> 1) + (length & 1);
        } else if (i4 == 2) {
            this.f73125c = i5 + (((short[]) obj).length * 1);
        } else if (i4 == 4) {
            this.f73125c = i5 + (((int[]) obj).length * 2);
        } else if (i4 == 8) {
            this.f73125c = i5 + (((long[]) obj).length * 4);
        } else {
            throw new C25488j("bogus element_width: " + C26312a.m33784b(i4));
        }
    }

    /* renamed from: b */
    public void mo53099b(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9, int i15) {
        mo53109l(i);
        if (i2 != 36) {
            switch (i2) {
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                    break;
                default:
                    throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
            }
        }
        this.f73125c += 3;
    }

    /* renamed from: c */
    public void mo53100c(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9) {
        mo53109l(i);
        if (i2 != 36) {
            switch (i2) {
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                    break;
                default:
                    throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
            }
        }
        this.f73125c += 3;
    }

    /* renamed from: d */
    public void mo53101d(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        mo53109l(i);
        if (i2 != 34) {
            if (!(i2 == 36 || i2 == 38)) {
                if (i2 != 39) {
                    if (!(i2 == 43 || i2 == 44)) {
                        switch (i2) {
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                break;
                            default:
                                switch (i2) {
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 29:
                                    case 30:
                                        break;
                                    case 19:
                                    case 21:
                                    case 22:
                                    case 25:
                                    case 28:
                                    case 31:
                                        break;
                                    case 20:
                                    case 23:
                                        break;
                                    case 24:
                                        this.f73125c += 5;
                                        return;
                                    case 26:
                                        if (i3 > 65535) {
                                            this.f73125c += 3;
                                            return;
                                        } else {
                                            this.f73125c += 2;
                                            return;
                                        }
                                    case 27:
                                        this.f73125c += 3;
                                        return;
                                    default:
                                        switch (i2) {
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                                break;
                                            default:
                                                switch (i2) {
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
                                                        break;
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                        break;
                                                    default:
                                                        throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
                                                }
                                        }
                                }
                        }
                    }
                }
                this.f73125c++;
                return;
            }
            this.f73125c += 3;
            return;
        }
        this.f73125c += 2;
    }

    /* renamed from: e */
    public void mo53102e(int i, int i2, int i3, int[] iArr) {
        mo53109l(i);
        int i4 = this.f73125c + 4;
        this.f73125c = i4;
        this.f73125c = i4 + (iArr.length * 2);
    }

    /* renamed from: f */
    public void mo53103f(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        mo53109l(i);
        if (i2 != 37) {
            switch (i2) {
                case 116:
                case 117:
                case 118:
                case 119:
                case 120:
                    break;
                default:
                    throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
            }
        }
        this.f73125c += 3;
    }

    /* renamed from: g */
    public void mo53104g(int i, int i2, int[] iArr, int[] iArr2) {
        mo53109l(i);
        int i3 = this.f73125c + 2;
        this.f73125c = i3;
        int length = i3 + (iArr.length * 2);
        this.f73125c = length;
        this.f73125c = length + (iArr2.length * 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0.f73125c += 2;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53105h(int r1, int r2, int r3, int r4, int r5, long r6, int r8, int r9, int r10) {
        /*
            r0 = this;
            r0.mo53109l(r1)
            r1 = 36
            if (r2 == r1) goto L_0x0035
            switch(r2) {
                case 45: goto L_0x002e;
                case 46: goto L_0x002e;
                case 47: goto L_0x002e;
                case 48: goto L_0x002e;
                case 49: goto L_0x002e;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r2) {
                case 68: goto L_0x002e;
                case 69: goto L_0x002e;
                case 70: goto L_0x002e;
                case 71: goto L_0x002e;
                case 72: goto L_0x002e;
                case 73: goto L_0x002e;
                case 74: goto L_0x002e;
                case 75: goto L_0x002e;
                case 76: goto L_0x002e;
                case 77: goto L_0x002e;
                case 78: goto L_0x002e;
                case 79: goto L_0x002e;
                case 80: goto L_0x002e;
                case 81: goto L_0x002e;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r2) {
                case 110: goto L_0x0035;
                case 111: goto L_0x0035;
                case 112: goto L_0x0035;
                case 113: goto L_0x0035;
                case 114: goto L_0x0035;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r2) {
                case 144: goto L_0x002e;
                case 145: goto L_0x002e;
                case 146: goto L_0x002e;
                case 147: goto L_0x002e;
                case 148: goto L_0x002e;
                case 149: goto L_0x002e;
                case 150: goto L_0x002e;
                case 151: goto L_0x002e;
                case 152: goto L_0x002e;
                case 153: goto L_0x002e;
                case 154: goto L_0x002e;
                case 155: goto L_0x002e;
                case 156: goto L_0x002e;
                case 157: goto L_0x002e;
                case 158: goto L_0x002e;
                case 159: goto L_0x002e;
                case 160: goto L_0x002e;
                case 161: goto L_0x002e;
                case 162: goto L_0x002e;
                case 163: goto L_0x002e;
                case 164: goto L_0x002e;
                case 165: goto L_0x002e;
                case 166: goto L_0x002e;
                case 167: goto L_0x002e;
                case 168: goto L_0x002e;
                case 169: goto L_0x002e;
                case 170: goto L_0x002e;
                case 171: goto L_0x002e;
                case 172: goto L_0x002e;
                case 173: goto L_0x002e;
                case 174: goto L_0x002e;
                case 175: goto L_0x002e;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected opcode: "
            r3.append(r4)
            java.lang.String r2 = tu3.C26312a.m33785c(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x002e:
            int r1 = r0.f73125c
            int r1 = r1 + 2
            r0.f73125c = r1
            goto L_0x003b
        L_0x0035:
            int r1 = r0.f73125c
            int r1 = r1 + 3
            r0.f73125c = r1
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su3.C26225c.mo53105h(int, int, int, int, int, long, int, int, int):void");
    }

    /* renamed from: i */
    public void mo53106i(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        mo53109l(i);
        if (i2 != 32) {
            if (i2 != 33) {
                if (i2 != 35) {
                    if (i2 != 36) {
                        switch (i2) {
                            case 1:
                            case 4:
                            case 7:
                                break;
                            case 2:
                            case 5:
                            case 8:
                                this.f73125c += 2;
                                return;
                            case 3:
                            case 6:
                            case 9:
                                break;
                            default:
                                switch (i2) {
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        switch (i2) {
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
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                        break;
                                                    default:
                                                        switch (i2) {
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
                                                                break;
                                                            default:
                                                                switch (i2) {
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
                                                                        break;
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
                                                                        break;
                                                                    default:
                                                                        throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    this.f73125c += 3;
                    return;
                }
            }
            this.f73125c++;
            return;
        }
        this.f73125c += 2;
    }

    /* renamed from: j */
    public void mo53107j(int i, int i2, int i3, int i4, int i5, long j) {
        mo53109l(i);
        if (i2 == -1 || i2 == 0 || i2 == 14) {
            this.f73125c++;
            return;
        }
        if (i2 != 36) {
            switch (i2) {
                case 40:
                    int i6 = this.f73125c;
                    int i7 = i5 - i6;
                    if (i7 == ((byte) i7)) {
                        this.f73125c = i6 + 1;
                        return;
                    } else if (i7 != ((short) i7)) {
                        this.f73125c = i6 + 3;
                        return;
                    } else {
                        this.f73125c = i6 + 2;
                        return;
                    }
                case 41:
                    int i8 = this.f73125c;
                    int i9 = i5 - i8;
                    if (i9 != ((short) i9)) {
                        this.f73125c = i8 + 3;
                        return;
                    } else {
                        this.f73125c = i8 + 2;
                        return;
                    }
                case 42:
                    this.f73125c += 3;
                    return;
                default:
                    switch (i2) {
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                            break;
                        default:
                            throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
                    }
            }
        }
        this.f73125c += 3;
    }

    /* renamed from: k */
    public int mo53108k(int i) {
        int d = this.f73124b.mo162978d(i);
        return d < 0 ? i : this.f73124b.f333062e[d];
    }

    /* renamed from: l */
    public final void mo53109l(int i) {
        int i2 = this.f73125c;
        if (i != i2) {
            this.f73124b.mo162974a(i, i2);
        }
    }
}
