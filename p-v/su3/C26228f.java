package su3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.xweb.util.WXWebReporter;
import pu3.C25488j;
import tu3.C26312a;

/* renamed from: su3.f */
public final class C26228f extends C26227e {

    /* renamed from: b */
    public final C26230h f73128b;

    /* renamed from: c */
    public final C26225c f73129c;

    /* renamed from: d */
    public final boolean f73130d;

    public C26228f(C26230h hVar, C26225c cVar) {
        super((C26227e) null);
        this.f73128b = hVar;
        this.f73129c = cVar;
        this.f73130d = cVar != null;
    }

    /* renamed from: a */
    public void mo53098a(int i, int i2, Object obj, int i3, int i4) {
        this.f73128b.mo53114b((short) i2);
        this.f73128b.mo53114b((short) i4);
        this.f73128b.mo53117e(i3);
        int i5 = 0;
        if (i4 == 1) {
            C26230h hVar = this.f73128b;
            hVar.getClass();
            boolean z = true;
            byte b = 0;
            for (byte b2 : (byte[]) obj) {
                if (z) {
                    b = b2 & ExifInterface.MARKER;
                    z = false;
                } else {
                    byte b3 = (b2 << 8) | b;
                    hVar.mo53114b((short) b3);
                    b = b3;
                    z = true;
                }
            }
            if (!z) {
                hVar.mo53114b((short) b);
            }
        } else if (i4 == 2) {
            C26230h hVar2 = this.f73128b;
            short[] sArr = (short[]) obj;
            hVar2.getClass();
            int length = sArr.length;
            while (i5 < length) {
                hVar2.mo53114b(sArr[i5]);
                i5++;
            }
        } else if (i4 == 4) {
            C26230h hVar3 = this.f73128b;
            int[] iArr = (int[]) obj;
            hVar3.getClass();
            int length2 = iArr.length;
            while (i5 < length2) {
                hVar3.mo53117e(iArr[i5]);
                i5++;
            }
        } else if (i4 == 8) {
            C26230h hVar4 = this.f73128b;
            long[] jArr = (long[]) obj;
            hVar4.getClass();
            int length3 = jArr.length;
            while (i5 < length3) {
                long j = jArr[i5];
                hVar4.mo53114b((short) ((int) j));
                hVar4.mo53114b((short) ((int) (j >> 16)));
                hVar4.mo53114b((short) ((int) (j >> 32)));
                hVar4.mo53114b((short) ((int) (j >> 48)));
                i5++;
            }
        } else {
            throw new C25488j("bogus element_width: " + C26312a.m33784b(i4));
        }
    }

    /* renamed from: b */
    public void mo53099b(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9, int i15) {
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
        this.f73128b.mo53116d(C26224b.m33669a(i2, C26224b.m33676h(i15, 5)), (short) i3, C26224b.m33670b(i6, i7, i8, i9));
    }

    /* renamed from: c */
    public void mo53100c(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7, int i8, int i9) {
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
        this.f73128b.mo53116d(C26224b.m33669a(i2, C26224b.m33676h(0, 4)), (short) i3, C26224b.m33670b(i6, i7, i8, i9));
    }

    /* renamed from: d */
    public void mo53101d(int i, int i2, int i3, int i4, int i5, long j, int i6) {
        if (this.f73130d) {
            i5 = this.f73129c.mo53108k(i5);
        }
        if (i2 != 34) {
            if (i2 != 36) {
                char c = 16;
                if (i2 != 38) {
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
                                        case 29:
                                        case 30:
                                            break;
                                        case 18:
                                            short s = (short) i2;
                                            C26230h hVar = this.f73128b;
                                            if (j < -8 || j > 7) {
                                                throw new C25488j("Literal out of range: " + C26312a.m33787e(j));
                                            }
                                            hVar.mo53114b(C26224b.m33669a(s, C26224b.m33676h(i6, ((int) j) & 15)));
                                            return;
                                        case 19:
                                        case 22:
                                            this.f73128b.mo53115c(C26224b.m33669a(i2, i6), C26224b.m33674f(j));
                                            return;
                                        case 20:
                                        case 23:
                                            int i7 = (int) j;
                                            if (j == ((long) i7)) {
                                                this.f73128b.mo53116d(C26224b.m33669a(i2, i6), (short) i7, (short) (i7 >> 16));
                                                return;
                                            }
                                            throw new C25488j("Literal out of range: " + C26312a.m33787e(j));
                                        case 21:
                                        case 25:
                                            if (i2 != 21) {
                                                c = '0';
                                            }
                                            this.f73128b.mo53115c(C26224b.m33669a(i2, i6), (short) ((int) (j >> c)));
                                            return;
                                        case 24:
                                            C26230h hVar2 = this.f73128b;
                                            hVar2.mo53114b(C26224b.m33669a(i2, i6));
                                            hVar2.mo53114b((short) ((int) j));
                                            hVar2.mo53114b((short) ((int) (j >> 16)));
                                            hVar2.mo53114b((short) ((int) (j >> 32)));
                                            hVar2.mo53114b((short) ((int) (j >> 48)));
                                            return;
                                        case 26:
                                            if (this.f73130d) {
                                                if (i3 > 65535) {
                                                    this.f73128b.mo53116d(C26224b.m33669a(27, i6), (short) i3, (short) (i3 >> 16));
                                                    return;
                                                }
                                                this.f73128b.mo53115c(C26224b.m33669a(i2, i6), (short) i3);
                                                return;
                                            } else if (i3 <= 65535) {
                                                this.f73128b.mo53115c(C26224b.m33669a(i2, i6), (short) i3);
                                                return;
                                            } else {
                                                throw new C25488j("string index out of bound: " + C26312a.m33786d(i3) + ", perhaps you need to enable force jumbo mode.");
                                            }
                                        case 27:
                                            this.f73128b.mo53116d(C26224b.m33669a(i2, i6), (short) i3, (short) (i3 >> 16));
                                            return;
                                        case 28:
                                        case 31:
                                            break;
                                        default:
                                            switch (i2) {
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                    this.f73128b.mo53115c(C26224b.m33669a(i2, i6), C26224b.m33675g(i5, this.f73128b.f73123b));
                                                    return;
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
                    this.f73128b.mo53114b(C26224b.m33669a(i2, i6));
                    return;
                }
                if (i2 == 43 || i2 == 44) {
                    C26230h hVar3 = this.f73128b;
                    hVar3.f73122a.mo162980f(i5, hVar3.f73123b);
                }
                C26230h hVar4 = this.f73128b;
                int i8 = i5 - hVar4.f73123b;
                hVar4.mo53116d(C26224b.m33669a(i2, i6), (short) i8, (short) (i8 >> 16));
                return;
            }
            this.f73128b.mo53116d(C26224b.m33669a(i2, C26224b.m33676h(0, 1)), (short) i3, C26224b.m33670b(i6, 0, 0, 0));
            return;
        }
        this.f73128b.mo53115c(C26224b.m33669a(i2, i6), (short) i3);
    }

    /* renamed from: e */
    public void mo53102e(int i, int i2, int i3, int[] iArr) {
        int a = this.f73128b.mo53097a();
        this.f73128b.mo53114b((short) i2);
        C26230h hVar = this.f73128b;
        int length = iArr.length;
        if ((-65536 & length) == 0) {
            hVar.mo53114b((short) length);
            this.f73128b.mo53117e(i3);
            int i4 = 0;
            if (this.f73130d) {
                int length2 = iArr.length;
                while (i4 < length2) {
                    this.f73128b.mo53117e(this.f73129c.mo53108k(iArr[i4]) - a);
                    i4++;
                }
                return;
            }
            int length3 = iArr.length;
            while (i4 < length3) {
                this.f73128b.mo53117e(iArr[i4] - a);
                i4++;
            }
            return;
        }
        throw new IllegalArgumentException("bogus unsigned code unit");
    }

    /* renamed from: f */
    public void mo53103f(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
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
        this.f73128b.mo53116d(C26224b.m33669a(i2, i7), (short) i3, C26224b.m33671c(i6));
    }

    /* renamed from: g */
    public void mo53104g(int i, int i2, int[] iArr, int[] iArr2) {
        int a = this.f73128b.mo53097a();
        this.f73128b.mo53114b((short) i2);
        C26230h hVar = this.f73128b;
        int length = iArr2.length;
        if ((-65536 & length) == 0) {
            hVar.mo53114b((short) length);
            int i3 = 0;
            for (int e : iArr) {
                this.f73128b.mo53117e(e);
            }
            if (this.f73130d) {
                int length2 = iArr2.length;
                while (i3 < length2) {
                    this.f73128b.mo53117e(this.f73129c.mo53108k(iArr2[i3]) - a);
                    i3++;
                }
                return;
            }
            int length3 = iArr2.length;
            while (i3 < length3) {
                this.f73128b.mo53117e(iArr2[i3] - a);
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("bogus unsigned code unit");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0.f73128b.mo53115c(su3.C26224b.m33669a(r2, r8), su3.C26224b.m33669a(r9, r10));
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53105h(int r1, int r2, int r3, int r4, int r5, long r6, int r8, int r9, int r10) {
        /*
            r0 = this;
            r1 = 36
            if (r2 == r1) goto L_0x0039
            switch(r2) {
                case 45: goto L_0x002b;
                case 46: goto L_0x002b;
                case 47: goto L_0x002b;
                case 48: goto L_0x002b;
                case 49: goto L_0x002b;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r2) {
                case 68: goto L_0x002b;
                case 69: goto L_0x002b;
                case 70: goto L_0x002b;
                case 71: goto L_0x002b;
                case 72: goto L_0x002b;
                case 73: goto L_0x002b;
                case 74: goto L_0x002b;
                case 75: goto L_0x002b;
                case 76: goto L_0x002b;
                case 77: goto L_0x002b;
                case 78: goto L_0x002b;
                case 79: goto L_0x002b;
                case 80: goto L_0x002b;
                case 81: goto L_0x002b;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r2) {
                case 110: goto L_0x0039;
                case 111: goto L_0x0039;
                case 112: goto L_0x0039;
                case 113: goto L_0x0039;
                case 114: goto L_0x0039;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r2) {
                case 144: goto L_0x002b;
                case 145: goto L_0x002b;
                case 146: goto L_0x002b;
                case 147: goto L_0x002b;
                case 148: goto L_0x002b;
                case 149: goto L_0x002b;
                case 150: goto L_0x002b;
                case 151: goto L_0x002b;
                case 152: goto L_0x002b;
                case 153: goto L_0x002b;
                case 154: goto L_0x002b;
                case 155: goto L_0x002b;
                case 156: goto L_0x002b;
                case 157: goto L_0x002b;
                case 158: goto L_0x002b;
                case 159: goto L_0x002b;
                case 160: goto L_0x002b;
                case 161: goto L_0x002b;
                case 162: goto L_0x002b;
                case 163: goto L_0x002b;
                case 164: goto L_0x002b;
                case 165: goto L_0x002b;
                case 166: goto L_0x002b;
                case 167: goto L_0x002b;
                case 168: goto L_0x002b;
                case 169: goto L_0x002b;
                case 170: goto L_0x002b;
                case 171: goto L_0x002b;
                case 172: goto L_0x002b;
                case 173: goto L_0x002b;
                case 174: goto L_0x002b;
                case 175: goto L_0x002b;
                default: goto L_0x0010;
            }
        L_0x0010:
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
        L_0x002b:
            su3.h r1 = r0.f73128b
            short r2 = su3.C26224b.m33669a(r2, r8)
            short r3 = su3.C26224b.m33669a(r9, r10)
            r1.mo53115c(r2, r3)
            goto L_0x004d
        L_0x0039:
            short r1 = (short) r3
            su3.h r3 = r0.f73128b
            r4 = 3
            r5 = 0
            int r4 = su3.C26224b.m33676h(r5, r4)
            short r2 = su3.C26224b.m33669a(r2, r4)
            short r4 = su3.C26224b.m33670b(r8, r9, r10, r5)
            r3.mo53116d(r2, r1, r4)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su3.C26228f.mo53105h(int, int, int, int, int, long, int, int, int):void");
    }

    /* renamed from: i */
    public void mo53106i(int i, int i2, int i3, int i4, int i5, long j, int i6, int i7) {
        if (this.f73130d) {
            i5 = this.f73129c.mo53108k(i5);
        }
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
                                this.f73128b.mo53115c(C26224b.m33669a(i2, i6), C26224b.m33672d(i7));
                                return;
                            case 3:
                            case 6:
                            case 9:
                                this.f73128b.mo53116d((short) i2, C26224b.m33671c(i6), C26224b.m33672d(i7));
                                return;
                            default:
                                switch (i2) {
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                        this.f73128b.mo53115c(C26224b.m33669a(i2, C26224b.m33676h(i6, i7)), C26224b.m33675g(i5, this.f73128b.f73123b));
                                        return;
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
                                                                        this.f73128b.mo53115c(C26224b.m33669a(i2, C26224b.m33676h(i6, i7)), C26224b.m33674f(j));
                                                                        return;
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
                                                                        C26230h hVar = this.f73128b;
                                                                        short a = C26224b.m33669a(i2, i6);
                                                                        int i8 = (int) j;
                                                                        if (j == ((long) ((byte) i8))) {
                                                                            hVar.mo53115c(a, C26224b.m33669a(i7, i8 & 255));
                                                                            return;
                                                                        }
                                                                        throw new C25488j("Literal out of range: " + C26312a.m33787e(j));
                                                                    default:
                                                                        throw new IllegalStateException("unexpected opcode: " + C26312a.m33785c(i2));
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    this.f73128b.mo53116d(C26224b.m33669a(i2, C26224b.m33676h(0, 2)), (short) i3, C26224b.m33670b(i6, i7, 0, 0));
                    return;
                }
            }
            this.f73128b.mo53114b(C26224b.m33669a((short) i2, C26224b.m33676h(i6, i7)));
            return;
        }
        this.f73128b.mo53115c(C26224b.m33669a(i2, C26224b.m33676h(i6, i7)), (short) i3);
    }

    /* renamed from: j */
    public void mo53107j(int i, int i2, int i3, int i4, int i5, long j) {
        if (this.f73130d) {
            i5 = this.f73129c.mo53108k(i5);
        }
        if (i2 == -1 || i2 == 0 || i2 == 14) {
            this.f73128b.mo53114b((short) i2);
            return;
        }
        if (i2 != 36) {
            switch (i2) {
                case 40:
                    if (this.f73130d) {
                        C26230h hVar = this.f73128b;
                        int i6 = i5 - hVar.f73123b;
                        if (i6 != ((byte) i6)) {
                            short s = (short) i6;
                            if (i6 != s) {
                                hVar.mo53116d(42, s, (short) (i6 >> 16));
                                return;
                            } else {
                                hVar.mo53115c(41, s);
                                return;
                            }
                        } else {
                            hVar.mo53114b(C26224b.m33669a(i2, i6 & 255));
                            return;
                        }
                    } else {
                        C26230h hVar2 = this.f73128b;
                        int i7 = i5 - hVar2.f73123b;
                        if (i7 == ((byte) i7)) {
                            hVar2.mo53114b(C26224b.m33669a(i2, i7 & 255));
                            return;
                        }
                        throw new C25488j("Target out of range: " + C26312a.m33783a(i7) + ", perhaps you need to enable force jumbo mode.");
                    }
                case 41:
                    if (this.f73130d) {
                        C26230h hVar3 = this.f73128b;
                        int i8 = i5 - hVar3.f73123b;
                        short s2 = (short) i8;
                        if (i8 != s2) {
                            hVar3.mo53116d(42, s2, (short) (i8 >> 16));
                            return;
                        } else {
                            hVar3.mo53115c((short) i2, s2);
                            return;
                        }
                    } else {
                        short g = C26224b.m33675g(i5, this.f73128b.f73123b);
                        this.f73128b.mo53115c((short) i2, g);
                        return;
                    }
                case 42:
                    C26230h hVar4 = this.f73128b;
                    int i9 = i5 - hVar4.f73123b;
                    hVar4.mo53116d((short) i2, (short) i9, (short) (i9 >> 16));
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
        this.f73128b.mo53116d(C26224b.m33669a(i2, C26224b.m33676h(0, 0)), (short) i3, C26224b.m33670b(0, 0, 0, 0));
    }
}
