package p330d7;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.util.WXWebReporter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16744h;
import p294b7.C16750m;
import p333e8.C20534h;
import p333e8.C20537k;
import p333e8.C20541m;
import p333e8.C20551y;
import p396x6.C23015n;

/* renamed from: d7.d */
public final class C20440d implements C16741e {

    /* renamed from: Z */
    public static final byte[] f57358Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f57359a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final byte[] f57360b0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c0 */
    public static final byte[] f57361c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: d0 */
    public static long f57362d0 = 10000;

    /* renamed from: e0 */
    public static final byte[] f57363e0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: f0 */
    public static final UUID f57364f0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    public long f57365A = -9223372036854775807L;

    /* renamed from: B */
    public C20534h f57366B;

    /* renamed from: C */
    public C20534h f57367C;

    /* renamed from: D */
    public boolean f57368D;

    /* renamed from: E */
    public int f57369E;

    /* renamed from: F */
    public long f57370F;

    /* renamed from: G */
    public long f57371G;

    /* renamed from: H */
    public int f57372H;

    /* renamed from: I */
    public int f57373I;

    /* renamed from: J */
    public int[] f57374J;

    /* renamed from: K */
    public int f57375K;

    /* renamed from: L */
    public int f57376L;

    /* renamed from: M */
    public int f57377M;

    /* renamed from: N */
    public int f57378N;

    /* renamed from: O */
    public boolean f57379O;

    /* renamed from: P */
    public boolean f57380P;

    /* renamed from: Q */
    public boolean f57381Q;

    /* renamed from: R */
    public boolean f57382R;

    /* renamed from: S */
    public byte f57383S;

    /* renamed from: T */
    public int f57384T;

    /* renamed from: U */
    public int f57385U;

    /* renamed from: V */
    public int f57386V;

    /* renamed from: W */
    public boolean f57387W;

    /* renamed from: X */
    public boolean f57388X;

    /* renamed from: Y */
    public C16743g f57389Y;

    /* renamed from: a */
    public final C20438b f57390a;

    /* renamed from: b */
    public final C20445f f57391b;

    /* renamed from: c */
    public final SparseArray<C20443c> f57392c;

    /* renamed from: d */
    public final boolean f57393d;

    /* renamed from: e */
    public final C20541m f57394e;

    /* renamed from: f */
    public final C20541m f57395f;

    /* renamed from: g */
    public final C20541m f57396g;

    /* renamed from: h */
    public final C20541m f57397h;

    /* renamed from: i */
    public final C20541m f57398i;

    /* renamed from: j */
    public final C20541m f57399j;

    /* renamed from: k */
    public final C20541m f57400k;

    /* renamed from: l */
    public final C20541m f57401l;

    /* renamed from: m */
    public final C20541m f57402m;

    /* renamed from: n */
    public ByteBuffer f57403n;

    /* renamed from: o */
    public long f57404o;

    /* renamed from: p */
    public long f57405p = -1;

    /* renamed from: q */
    public long f57406q = -9223372036854775807L;

    /* renamed from: r */
    public long f57407r = -9223372036854775807L;

    /* renamed from: s */
    public long f57408s = -9223372036854775807L;

    /* renamed from: t */
    public C20443c f57409t;

    /* renamed from: u */
    public boolean f57410u;

    /* renamed from: v */
    public int f57411v;

    /* renamed from: w */
    public long f57412w;

    /* renamed from: x */
    public boolean f57413x;

    /* renamed from: y */
    public long f57414y = -1;

    /* renamed from: z */
    public long f57415z = -1;

    /* renamed from: d7.d$a */
    public static class C20441a implements C16744h {
    }

    /* renamed from: d7.d$b */
    public final class C20442b implements C20439c {
        public C20442b(C20441a aVar) {
        }

        /* renamed from: a */
        public void mo31982a(int i, int i2, C16742f fVar) {
            int i3;
            byte b;
            int i4;
            int i5 = i;
            int i6 = i2;
            C16742f fVar2 = fVar;
            C20440d dVar = C20440d.this;
            dVar.getClass();
            if (i5 == 161 || i5 == 163) {
                if (dVar.f57369E == 0) {
                    dVar.f57375K = (int) dVar.f57391b.mo31986b(fVar2, false, true, 8);
                    dVar.f57376L = dVar.f57391b.f57464c;
                    dVar.f57371G = -9223372036854775807L;
                    dVar.f57369E = 1;
                    dVar.f57396g.mo32109t();
                }
                C20443c cVar = dVar.f57392c.get(dVar.f57375K);
                if (cVar == null) {
                    ((C16738b) fVar2).mo17738f(i6 - dVar.f57376L);
                    dVar.f57369E = 0;
                    return;
                }
                if (dVar.f57369E == 1) {
                    dVar.mo31977g(fVar2, 3);
                    int i7 = (dVar.f57396g.f57809a[2] & 6) >> 1;
                    if (i7 == 0) {
                        dVar.f57373I = 1;
                        int[] iArr = dVar.f57374J;
                        if (iArr == null) {
                            iArr = new int[1];
                        } else if (iArr.length < 1) {
                            iArr = new int[Math.max(iArr.length * 2, 1)];
                        }
                        dVar.f57374J = iArr;
                        iArr[0] = (i6 - dVar.f57376L) - 3;
                    } else if (i5 == 163) {
                        int i8 = 4;
                        dVar.mo31977g(fVar2, 4);
                        int i9 = (dVar.f57396g.f57809a[3] & ExifInterface.MARKER) + 1;
                        dVar.f57373I = i9;
                        int[] iArr2 = dVar.f57374J;
                        if (iArr2 == null) {
                            iArr2 = new int[i9];
                        } else if (iArr2.length < i9) {
                            iArr2 = new int[Math.max(iArr2.length * 2, i9)];
                        }
                        dVar.f57374J = iArr2;
                        if (i7 == 2) {
                            int i15 = dVar.f57373I;
                            Arrays.fill(iArr2, 0, i15, ((i6 - dVar.f57376L) - 4) / i15);
                        } else if (i7 == 1) {
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i3 = dVar.f57373I;
                                if (i16 >= i3 - 1) {
                                    break;
                                }
                                dVar.f57374J[i16] = 0;
                                do {
                                    i8++;
                                    dVar.mo31977g(fVar2, i8);
                                    b = dVar.f57396g.f57809a[i8 - 1] & ExifInterface.MARKER;
                                    int[] iArr3 = dVar.f57374J;
                                    i4 = iArr3[i16] + b;
                                    iArr3[i16] = i4;
                                } while (b == 255);
                                i17 += i4;
                                i16++;
                            }
                            dVar.f57374J[i3 - 1] = ((i6 - dVar.f57376L) - i8) - i17;
                        } else if (i7 == 3) {
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                int i25 = dVar.f57373I;
                                if (i18 >= i25 - 1) {
                                    dVar.f57374J[i25 - 1] = ((i6 - dVar.f57376L) - i8) - i19;
                                    break;
                                }
                                dVar.f57374J[i18] = 0;
                                i8++;
                                dVar.mo31977g(fVar2, i8);
                                int i26 = i8 - 1;
                                if (dVar.f57396g.f57809a[i26] != 0) {
                                    long j = 0;
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 >= 8) {
                                            break;
                                        }
                                        int i28 = 1 << (7 - i27);
                                        if ((dVar.f57396g.f57809a[i26] & i28) != 0) {
                                            i8 += i27;
                                            dVar.mo31977g(fVar2, i8);
                                            long j2 = (long) (dVar.f57396g.f57809a[i26] & ExifInterface.MARKER & (~i28));
                                            j = j2;
                                            for (int i29 = i26 + 1; i29 < i8; i29++) {
                                                j = (j << 8) | ((long) (dVar.f57396g.f57809a[i29] & ExifInterface.MARKER));
                                            }
                                            if (i18 > 0) {
                                                j -= (1 << ((i27 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i27++;
                                        }
                                    }
                                    long j3 = j;
                                    if (j3 >= -2147483648L && j3 <= 2147483647L) {
                                        int i35 = (int) j3;
                                        int[] iArr4 = dVar.f57374J;
                                        if (i18 != 0) {
                                            i35 += iArr4[i18 - 1];
                                        }
                                        iArr4[i18] = i35;
                                        i19 += i35;
                                        i18++;
                                    }
                                } else {
                                    throw new C23015n("No valid varint length mask found");
                                }
                            }
                            throw new C23015n("EBML lacing sample size out of range.");
                        } else {
                            throw new C23015n("Unexpected lacing value: " + i7);
                        }
                    } else {
                        throw new C23015n("Lacing only supported in SimpleBlocks.");
                    }
                    byte[] bArr = dVar.f57396g.f57809a;
                    dVar.f57370F = dVar.f57365A + dVar.mo31979i((long) ((bArr[1] & ExifInterface.MARKER) | (bArr[0] << 8)));
                    byte b2 = dVar.f57396g.f57809a[2];
                    dVar.f57377M = ((cVar.f57435c == 2 || (i5 == 163 && (b2 & 128) == 128)) ? 1 : 0) | ((b2 & 8) == 8 ? Integer.MIN_VALUE : 0);
                    dVar.f57369E = 2;
                    dVar.f57372H = 0;
                }
                if (i5 == 163) {
                    while (true) {
                        int i36 = dVar.f57372H;
                        if (i36 < dVar.f57373I) {
                            dVar.mo31980j(fVar2, cVar, dVar.f57374J[i36]);
                            dVar.mo31975d(cVar, dVar.f57370F + ((long) ((dVar.f57372H * cVar.f57436d) / 1000)));
                            dVar.f57372H++;
                        } else {
                            dVar.f57369E = 0;
                            return;
                        }
                    }
                } else {
                    dVar.mo31980j(fVar2, cVar, dVar.f57374J[0]);
                }
            } else if (i5 == 16981) {
                C20443c cVar2 = dVar.f57409t;
                byte[] bArr2 = new byte[i6];
                cVar2.f57438f = bArr2;
                ((C16738b) fVar2).mo17737e(bArr2, 0, i6, false);
            } else if (i5 == 18402) {
                byte[] bArr3 = new byte[i6];
                ((C16738b) fVar2).mo17737e(bArr3, 0, i6, false);
                dVar.f57409t.f57439g = new C16750m.C16751a(1, bArr3, 0, 0);
            } else if (i5 == 21419) {
                Arrays.fill(dVar.f57398i.f57809a, (byte) 0);
                ((C16738b) fVar2).mo17737e(dVar.f57398i.f57809a, 4 - i6, i6, false);
                dVar.f57398i.mo32113x(0);
                dVar.f57411v = (int) dVar.f57398i.mo32104o();
            } else if (i5 == 25506) {
                C20443c cVar3 = dVar.f57409t;
                byte[] bArr4 = new byte[i6];
                cVar3.f57440h = bArr4;
                ((C16738b) fVar2).mo17737e(bArr4, 0, i6, false);
            } else if (i5 == 30322) {
                C20443c cVar4 = dVar.f57409t;
                byte[] bArr5 = new byte[i6];
                cVar4.f57447o = bArr5;
                ((C16738b) fVar2).mo17737e(bArr5, 0, i6, false);
            } else {
                throw new C23015n("Unexpected id: " + i5);
            }
        }

        /* renamed from: b */
        public void mo31983b(int i, double d) {
            C20440d dVar = C20440d.this;
            if (i == 181) {
                dVar.f57409t.f57425I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        dVar.f57409t.f57455w = (float) d;
                        return;
                    case 21970:
                        dVar.f57409t.f57456x = (float) d;
                        return;
                    case 21971:
                        dVar.f57409t.f57457y = (float) d;
                        return;
                    case 21972:
                        dVar.f57409t.f57458z = (float) d;
                        return;
                    case 21973:
                        dVar.f57409t.f57417A = (float) d;
                        return;
                    case 21974:
                        dVar.f57409t.f57418B = (float) d;
                        return;
                    case 21975:
                        dVar.f57409t.f57419C = (float) d;
                        return;
                    case 21976:
                        dVar.f57409t.f57420D = (float) d;
                        return;
                    case 21977:
                        dVar.f57409t.f57421E = (float) d;
                        return;
                    case 21978:
                        dVar.f57409t.f57422F = (float) d;
                        return;
                    default:
                        dVar.getClass();
                        return;
                }
            } else {
                dVar.f57407r = (long) d;
            }
        }

        /* renamed from: c */
        public void mo31984c(int i, long j) {
            C20440d dVar = C20440d.this;
            dVar.getClass();
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            dVar.f57409t.f57435c = (int) j;
                            return;
                        case 136:
                            C20443c cVar = dVar.f57409t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar.f57428L = z;
                            return;
                        case 155:
                            dVar.f57371G = dVar.mo31979i(j);
                            return;
                        case 159:
                            dVar.f57409t.f57423G = (int) j;
                            return;
                        case WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED:
                            dVar.f57409t.f57442j = (int) j;
                            return;
                        case WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED:
                            C20534h hVar = dVar.f57366B;
                            long i2 = dVar.mo31979i(j);
                            int i3 = hVar.f57786a;
                            long[] jArr = hVar.f57787b;
                            if (i3 == jArr.length) {
                                hVar.f57787b = Arrays.copyOf(jArr, i3 * 2);
                            }
                            long[] jArr2 = hVar.f57787b;
                            int i4 = hVar.f57786a;
                            hVar.f57786a = i4 + 1;
                            jArr2[i4] = i2;
                            return;
                        case WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS:
                            dVar.f57409t.f57443k = (int) j;
                            return;
                        case 215:
                            dVar.f57409t.f57434b = (int) j;
                            return;
                        case 231:
                            dVar.f57365A = dVar.mo31979i(j);
                            return;
                        case 241:
                            if (!dVar.f57368D) {
                                C20534h hVar2 = dVar.f57367C;
                                int i5 = hVar2.f57786a;
                                long[] jArr3 = hVar2.f57787b;
                                if (i5 == jArr3.length) {
                                    hVar2.f57787b = Arrays.copyOf(jArr3, i5 * 2);
                                }
                                long[] jArr4 = hVar2.f57787b;
                                int i6 = hVar2.f57786a;
                                hVar2.f57786a = i6 + 1;
                                jArr4[i6] = j;
                                dVar.f57368D = true;
                                return;
                            }
                            return;
                        case 251:
                            dVar.f57388X = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                throw new C23015n("ContentCompAlgo " + j + " not supported");
                            }
                            return;
                        case 17029:
                            if (j < 1 || j > 2) {
                                throw new C23015n("DocTypeReadVersion " + j + " not supported");
                            }
                            return;
                        case 17143:
                            if (j != 1) {
                                throw new C23015n("EBMLReadVersion " + j + " not supported");
                            }
                            return;
                        case 18401:
                            if (j != 5) {
                                throw new C23015n("ContentEncAlgo " + j + " not supported");
                            }
                            return;
                        case 18408:
                            if (j != 1) {
                                throw new C23015n("AESSettingsCipherMode " + j + " not supported");
                            }
                            return;
                        case 21420:
                            dVar.f57412w = j + dVar.f57405p;
                            return;
                        case 21432:
                            int i7 = (int) j;
                            if (i7 == 0) {
                                dVar.f57409t.f57448p = 0;
                                return;
                            } else if (i7 == 1) {
                                dVar.f57409t.f57448p = 2;
                                return;
                            } else if (i7 == 3) {
                                dVar.f57409t.f57448p = 1;
                                return;
                            } else if (i7 == 15) {
                                dVar.f57409t.f57448p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            dVar.f57409t.f57444l = (int) j;
                            return;
                        case 21682:
                            dVar.f57409t.f57446n = (int) j;
                            return;
                        case 21690:
                            dVar.f57409t.f57445m = (int) j;
                            return;
                        case 21930:
                            C20443c cVar2 = dVar.f57409t;
                            if (j == 1) {
                                z = true;
                            }
                            cVar2.f57429M = z;
                            return;
                        case 22186:
                            dVar.f57409t.f57426J = j;
                            return;
                        case 22203:
                            dVar.f57409t.f57427K = j;
                            return;
                        case 25188:
                            dVar.f57409t.f57424H = (int) j;
                            return;
                        case 2352003:
                            dVar.f57409t.f57436d = (int) j;
                            return;
                        case 2807729:
                            dVar.f57406q = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i8 = (int) j;
                                    if (i8 == 1) {
                                        dVar.f57409t.f57452t = 2;
                                        return;
                                    } else if (i8 == 2) {
                                        dVar.f57409t.f57452t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i9 = (int) j;
                                    if (i9 != 1) {
                                        if (i9 == 16) {
                                            dVar.f57409t.f57451s = 6;
                                            return;
                                        } else if (i9 == 18) {
                                            dVar.f57409t.f57451s = 7;
                                            return;
                                        } else if (!(i9 == 6 || i9 == 7)) {
                                            return;
                                        }
                                    }
                                    dVar.f57409t.f57451s = 3;
                                    return;
                                case 21947:
                                    C20443c cVar3 = dVar.f57409t;
                                    cVar3.f57449q = true;
                                    int i15 = (int) j;
                                    if (i15 == 1) {
                                        cVar3.f57450r = 1;
                                        return;
                                    } else if (i15 == 9) {
                                        cVar3.f57450r = 6;
                                        return;
                                    } else if (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) {
                                        cVar3.f57450r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    dVar.f57409t.f57453u = (int) j;
                                    return;
                                case 21949:
                                    dVar.f57409t.f57454v = (int) j;
                                    return;
                                default:
                                    return;
                            }
                    }
                } else if (j != 1) {
                    throw new C23015n("ContentEncodingScope " + j + " not supported");
                }
            } else if (j != 0) {
                throw new C23015n("ContentEncodingOrder " + j + " not supported");
            }
        }
    }

    /* renamed from: d7.d$c */
    public static final class C20443c {

        /* renamed from: A */
        public float f57417A = -1.0f;

        /* renamed from: B */
        public float f57418B = -1.0f;

        /* renamed from: C */
        public float f57419C = -1.0f;

        /* renamed from: D */
        public float f57420D = -1.0f;

        /* renamed from: E */
        public float f57421E = -1.0f;

        /* renamed from: F */
        public float f57422F = -1.0f;

        /* renamed from: G */
        public int f57423G = 1;

        /* renamed from: H */
        public int f57424H = -1;

        /* renamed from: I */
        public int f57425I = 8000;

        /* renamed from: J */
        public long f57426J = 0;

        /* renamed from: K */
        public long f57427K = 0;

        /* renamed from: L */
        public boolean f57428L;

        /* renamed from: M */
        public boolean f57429M = true;

        /* renamed from: N */
        public String f57430N = "eng";

        /* renamed from: O */
        public C16750m f57431O;

        /* renamed from: P */
        public int f57432P;

        /* renamed from: a */
        public String f57433a;

        /* renamed from: b */
        public int f57434b;

        /* renamed from: c */
        public int f57435c;

        /* renamed from: d */
        public int f57436d;

        /* renamed from: e */
        public boolean f57437e;

        /* renamed from: f */
        public byte[] f57438f;

        /* renamed from: g */
        public C16750m.C16751a f57439g;

        /* renamed from: h */
        public byte[] f57440h;

        /* renamed from: i */
        public DrmInitData f57441i;

        /* renamed from: j */
        public int f57442j = -1;

        /* renamed from: k */
        public int f57443k = -1;

        /* renamed from: l */
        public int f57444l = -1;

        /* renamed from: m */
        public int f57445m = -1;

        /* renamed from: n */
        public int f57446n = 0;

        /* renamed from: o */
        public byte[] f57447o = null;

        /* renamed from: p */
        public int f57448p = -1;

        /* renamed from: q */
        public boolean f57449q = false;

        /* renamed from: r */
        public int f57450r = -1;

        /* renamed from: s */
        public int f57451s = -1;

        /* renamed from: t */
        public int f57452t = -1;

        /* renamed from: u */
        public int f57453u = 1000;

        /* renamed from: v */
        public int f57454v = 200;

        /* renamed from: w */
        public float f57455w = -1.0f;

        /* renamed from: x */
        public float f57456x = -1.0f;

        /* renamed from: y */
        public float f57457y = -1.0f;

        /* renamed from: z */
        public float f57458z = -1.0f;
    }

    public C20440d(int i) {
        C20435a aVar = new C20435a();
        this.f57390a = aVar;
        aVar.f57352d = new C20442b((C20441a) null);
        this.f57393d = (i & 1) != 0 ? false : true;
        this.f57391b = new C20445f();
        this.f57392c = new SparseArray<>();
        this.f57396g = new C20541m(4);
        this.f57397h = new C20541m(ByteBuffer.allocate(4).putInt(-1).array());
        this.f57398i = new C20541m(4);
        this.f57394e = new C20541m(C20537k.f57788a);
        this.f57395f = new C20541m(4);
        this.f57399j = new C20541m();
        this.f57400k = new C20541m();
        this.f57401l = new C20541m(8);
        this.f57402m = new C20541m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r9, p294b7.C16747k r10) {
        /*
            r8 = this;
            r0 = 0
            r8.f57387W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003d
            boolean r3 = r8.f57387W
            if (r3 != 0) goto L_0x003d
            d7.b r2 = r8.f57390a
            d7.a r2 = (p330d7.C20435a) r2
            boolean r2 = r2.mo31974a(r9)
            if (r2 == 0) goto L_0x0005
            r3 = r9
            b7.b r3 = (p294b7.C16738b) r3
            long r3 = r3.f45242c
            boolean r5 = r8.f57413x
            if (r5 == 0) goto L_0x0028
            r8.f57415z = r3
            long r3 = r8.f57414y
            r10.f45264a = r3
            r8.f57413x = r0
        L_0x0026:
            r3 = 1
            goto L_0x003a
        L_0x0028:
            boolean r3 = r8.f57410u
            if (r3 == 0) goto L_0x0039
            long r3 = r8.f57415z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            r10.f45264a = r3
            r8.f57415z = r5
            goto L_0x0026
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p330d7.C20440d.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        this.f57365A = -9223372036854775807L;
        this.f57369E = 0;
        C20435a aVar = (C20435a) this.f57390a;
        aVar.f57353e = 0;
        aVar.f57350b.clear();
        C20445f fVar = aVar.f57351c;
        fVar.f57463b = 0;
        fVar.f57464c = 0;
        C20445f fVar2 = this.f57391b;
        fVar2.f57463b = 0;
        fVar2.f57464c = 0;
        this.f57378N = 0;
        this.f57386V = 0;
        this.f57385U = 0;
        this.f57379O = false;
        this.f57380P = false;
        this.f57382R = false;
        this.f57384T = 0;
        this.f57383S = 0;
        this.f57381Q = false;
        this.f57399j.mo32109t();
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        long a;
        int i;
        C16742f fVar2 = fVar;
        C20444e eVar = new C20444e();
        C16738b bVar = (C16738b) fVar2;
        long j = bVar.f45241b;
        long j2 = 1024;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        bVar.mo17734b(eVar.f57459a.f57809a, 0, 4, false);
        eVar.f57460b = 4;
        for (long o = eVar.f57459a.mo32104o(); o != 440786851; o = ((o << 8) & -256) | ((long) (eVar.f57459a.f57809a[0] & ExifInterface.MARKER))) {
            int i4 = eVar.f57460b + 1;
            eVar.f57460b = i4;
            if (i4 == i3) {
                return false;
            }
            bVar.mo17734b(eVar.f57459a.f57809a, 0, 1, false);
        }
        long a2 = eVar.mo31985a(fVar2);
        long j3 = (long) eVar.f57460b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + a2 >= j) {
            return false;
        }
        while (true) {
            int i5 = (((long) eVar.f57460b) > (j3 + a2) ? 1 : (((long) eVar.f57460b) == (j3 + a2) ? 0 : -1));
            if (i5 >= 0) {
                return i5 == 0;
            }
            if (eVar.mo31985a(fVar2) == Long.MIN_VALUE || a < 0 || a > 2147483647L) {
                return false;
            }
            if (i != 0) {
                bVar.mo17733a((int) (a = eVar.mo31985a(fVar2)), false);
                eVar.f57460b = (int) (((long) eVar.f57460b) + a);
            }
        }
    }

    /* renamed from: d */
    public final void mo31975d(C20443c cVar, long j) {
        C20443c cVar2 = cVar;
        if ("S_TEXT/UTF8".equals(cVar2.f57433a)) {
            mo31976f(cVar, "%02d:%02d:%02d,%03d", 19, 1000, f57359a0);
        } else if ("S_TEXT/ASS".equals(cVar2.f57433a)) {
            mo31976f(cVar, "%01d:%02d:%02d:%02d", 21, f57362d0, f57363e0);
        }
        cVar2.f57431O.mo17744d(j, this.f57377M, this.f57386V, 0, cVar2.f57439g);
        this.f57387W = true;
        this.f57378N = 0;
        this.f57386V = 0;
        this.f57385U = 0;
        this.f57379O = false;
        this.f57380P = false;
        this.f57382R = false;
        this.f57384T = 0;
        this.f57383S = 0;
        this.f57381Q = false;
        this.f57399j.mo32109t();
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f57389Y = gVar;
    }

    /* renamed from: f */
    public final void mo31976f(C20443c cVar, String str, int i, long j, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.f57400k.f57809a;
        long j2 = this.f57371G;
        if (j2 == -9223372036854775807L) {
            bArr3 = bArr;
            bArr2 = bArr3;
        } else {
            int i2 = (int) (j2 / 3600000000L);
            long j3 = j2 - (((long) (i2 * 3600)) * TimeUtil.SECOND_TO_US);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * TimeUtil.SECOND_TO_US);
            int i4 = (int) (j4 / TimeUtil.SECOND_TO_US);
            int i5 = (int) ((j4 - (((long) i4) * TimeUtil.SECOND_TO_US)) / j);
            Locale locale = Locale.US;
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
            String str2 = str;
            bArr3 = String.format(locale, str, objArr).getBytes(Charset.forName("UTF-8"));
            bArr2 = bArr;
        }
        System.arraycopy(bArr3, 0, bArr4, i, bArr2.length);
        C16750m mVar = cVar.f57431O;
        C20541m mVar2 = this.f57400k;
        mVar.mo17742b(mVar2, mVar2.f57811c);
        this.f57386V += this.f57400k.f57811c;
    }

    /* renamed from: g */
    public final void mo31977g(C16742f fVar, int i) {
        C20541m mVar = this.f57396g;
        if (mVar.f57811c < i) {
            if (mVar.mo32090a() < i) {
                C20541m mVar2 = this.f57396g;
                byte[] bArr = mVar2.f57809a;
                mVar2.mo32111v(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f57396g.f57811c);
            }
            C20541m mVar3 = this.f57396g;
            byte[] bArr2 = mVar3.f57809a;
            int i2 = mVar3.f57811c;
            ((C16738b) fVar).mo17737e(bArr2, i2, i - i2, false);
            this.f57396g.mo32112w(i);
        }
    }

    /* renamed from: h */
    public final int mo31978h(C16742f fVar, C16750m mVar, int i) {
        int i2;
        C20541m mVar2 = this.f57399j;
        int i3 = mVar2.f57811c - mVar2.f57810b;
        if (i3 > 0) {
            i2 = Math.min(i, i3);
            mVar.mo17742b(this.f57399j, i2);
        } else {
            i2 = mVar.mo17743c(fVar, i, false);
        }
        this.f57378N += i2;
        this.f57386V += i2;
        return i2;
    }

    /* renamed from: i */
    public final long mo31979i(long j) {
        long j2 = this.f57406q;
        if (j2 != -9223372036854775807L) {
            return C20551y.m22320j(j, j2, 1000);
        }
        throw new C23015n("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: j */
    public final void mo31980j(C16742f fVar, C20443c cVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f57433a)) {
            mo31981k(fVar, f57358Z, i);
        } else if ("S_TEXT/ASS".equals(cVar.f57433a)) {
            mo31981k(fVar, f57361c0, i);
        } else {
            C16750m mVar = cVar.f57431O;
            if (!this.f57379O) {
                if (cVar.f57437e) {
                    this.f57377M &= -1073741825;
                    int i3 = 128;
                    if (!this.f57380P) {
                        ((C16738b) fVar).mo17737e(this.f57396g.f57809a, 0, 1, false);
                        this.f57378N++;
                        byte b = this.f57396g.f57809a[0];
                        if ((b & 128) != 128) {
                            this.f57383S = b;
                            this.f57380P = true;
                        } else {
                            throw new C23015n("Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.f57383S;
                    if ((b2 & 1) == 1) {
                        boolean z = (b2 & 2) == 2;
                        this.f57377M |= 1073741824;
                        if (!this.f57381Q) {
                            ((C16738b) fVar).mo17737e(this.f57401l.f57809a, 0, 8, false);
                            this.f57378N += 8;
                            this.f57381Q = true;
                            C20541m mVar2 = this.f57396g;
                            byte[] bArr = mVar2.f57809a;
                            if (!z) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            mVar2.mo32113x(0);
                            mVar.mo17742b(this.f57396g, 1);
                            this.f57386V++;
                            this.f57401l.mo32113x(0);
                            mVar.mo17742b(this.f57401l, 8);
                            this.f57386V += 8;
                        }
                        if (z) {
                            if (!this.f57382R) {
                                ((C16738b) fVar).mo17737e(this.f57396g.f57809a, 0, 1, false);
                                this.f57378N++;
                                this.f57396g.mo32113x(0);
                                this.f57384T = this.f57396g.mo32103n();
                                this.f57382R = true;
                            }
                            int i4 = this.f57384T * 4;
                            this.f57396g.mo32110u(i4);
                            ((C16738b) fVar).mo17737e(this.f57396g.f57809a, 0, i4, false);
                            this.f57378N += i4;
                            short s = (short) ((this.f57384T / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f57403n;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f57403n = ByteBuffer.allocate(i5);
                            }
                            this.f57403n.position(0);
                            this.f57403n.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f57384T;
                                if (i6 >= i2) {
                                    break;
                                }
                                int q = this.f57396g.mo32106q();
                                if (i6 % 2 == 0) {
                                    this.f57403n.putShort((short) (q - i7));
                                } else {
                                    this.f57403n.putInt(q - i7);
                                }
                                i6++;
                                i7 = q;
                            }
                            int i8 = (i - this.f57378N) - i7;
                            if (i2 % 2 == 1) {
                                this.f57403n.putInt(i8);
                            } else {
                                this.f57403n.putShort((short) i8);
                                this.f57403n.putInt(0);
                            }
                            this.f57402m.mo32111v(this.f57403n.array(), i5);
                            mVar.mo17742b(this.f57402m, i5);
                            this.f57386V += i5;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f57438f;
                    if (bArr2 != null) {
                        this.f57399j.mo32111v(bArr2, bArr2.length);
                    }
                }
                this.f57379O = true;
            }
            int i9 = i + this.f57399j.f57811c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f57433a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f57433a)) {
                while (true) {
                    int i15 = this.f57378N;
                    if (i15 >= i9) {
                        break;
                    }
                    mo31978h(fVar, mVar, i9 - i15);
                }
            } else {
                byte[] bArr3 = this.f57395f.f57809a;
                bArr3[0] = 0;
                bArr3[1] = 0;
                bArr3[2] = 0;
                int i16 = cVar.f57432P;
                int i17 = 4 - i16;
                while (this.f57378N < i9) {
                    int i18 = this.f57385U;
                    if (i18 == 0) {
                        C20541m mVar3 = this.f57399j;
                        int min = Math.min(i16, mVar3.f57811c - mVar3.f57810b);
                        ((C16738b) fVar).mo17737e(bArr3, i17 + min, i16 - min, false);
                        if (min > 0) {
                            this.f57399j.mo32091b(bArr3, i17, min);
                        }
                        this.f57378N += i16;
                        this.f57395f.mo32113x(0);
                        this.f57385U = this.f57395f.mo32106q();
                        this.f57394e.mo32113x(0);
                        mVar.mo17742b(this.f57394e, 4);
                        this.f57386V += 4;
                    } else {
                        this.f57385U = i18 - mo31978h(fVar, mVar, i18);
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f57433a)) {
                this.f57397h.mo32113x(0);
                mVar.mo17742b(this.f57397h, 4);
                this.f57386V += 4;
            }
        }
    }

    /* renamed from: k */
    public final void mo31981k(C16742f fVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f57400k.mo32090a() < length) {
            this.f57400k.f57809a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.f57400k.f57809a, 0, bArr.length);
        }
        ((C16738b) fVar).mo17737e(this.f57400k.f57809a, bArr.length, i, false);
        this.f57400k.mo32110u(length);
    }

    public void release() {
    }
}
