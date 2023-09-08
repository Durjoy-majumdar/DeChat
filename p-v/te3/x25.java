package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import p749xh.C102661q8;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class x25 extends C47465a {

    /* renamed from: A */
    public String f299817A;

    /* renamed from: B */
    public C89349b f299818B;

    /* renamed from: C */
    public z64 f299819C;

    /* renamed from: D */
    public C51908x10 f299820D;

    /* renamed from: E */
    public C50670oe3 f299821E;

    /* renamed from: F */
    public int f299822F;

    /* renamed from: G */
    public C64816wv f299823G;

    /* renamed from: H */
    public ve4 f299824H;

    /* renamed from: d */
    public int f299825d;

    /* renamed from: e */
    public String f299826e;

    /* renamed from: f */
    public int f299827f;

    /* renamed from: g */
    public long f299828g;

    /* renamed from: h */
    public int f299829h;

    /* renamed from: i */
    public C48884bn2 f299830i;

    /* renamed from: j */
    public LinkedList<zo4> f299831j = new LinkedList<>();

    /* renamed from: n */
    public int f299832n;

    /* renamed from: o */
    public String f299833o;

    /* renamed from: p */
    public int f299834p;

    /* renamed from: q */
    public String f299835q;

    /* renamed from: r */
    public String f299836r;

    /* renamed from: s */
    public int f299837s;

    /* renamed from: t */
    public LinkedList<String> f299838t = new LinkedList<>();

    /* renamed from: u */
    public int f299839u = 2;

    /* renamed from: v */
    public ye4 f299840v;

    /* renamed from: w */
    public LinkedList<C49768hy> f299841w = new LinkedList<>();

    /* renamed from: x */
    public LinkedList<C64569n43> f299842x = new LinkedList<>();

    /* renamed from: y */
    public String f299843y;

    /* renamed from: z */
    public C89349b f299844z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x25)) {
            return false;
        }
        x25 x25 = (x25) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299825d), Integer.valueOf(x25.f299825d)) && C46238a.m51546a(this.f299826e, x25.f299826e) && C46238a.m51546a(Integer.valueOf(this.f299827f), Integer.valueOf(x25.f299827f)) && C46238a.m51546a(Long.valueOf(this.f299828g), Long.valueOf(x25.f299828g)) && C46238a.m51546a(Integer.valueOf(this.f299829h), Integer.valueOf(x25.f299829h)) && C46238a.m51546a(this.f299830i, x25.f299830i) && C46238a.m51546a(this.f299831j, x25.f299831j) && C46238a.m51546a(Integer.valueOf(this.f299832n), Integer.valueOf(x25.f299832n)) && C46238a.m51546a(this.f299833o, x25.f299833o) && C46238a.m51546a(Integer.valueOf(this.f299834p), Integer.valueOf(x25.f299834p)) && C46238a.m51546a(this.f299835q, x25.f299835q) && C46238a.m51546a(this.f299836r, x25.f299836r) && C46238a.m51546a(Integer.valueOf(this.f299837s), Integer.valueOf(x25.f299837s)) && C46238a.m51546a(this.f299838t, x25.f299838t) && C46238a.m51546a(Integer.valueOf(this.f299839u), Integer.valueOf(x25.f299839u)) && C46238a.m51546a(this.f299840v, x25.f299840v) && C46238a.m51546a(this.f299841w, x25.f299841w) && C46238a.m51546a(this.f299842x, x25.f299842x) && C46238a.m51546a(this.f299843y, x25.f299843y) && C46238a.m51546a(this.f299844z, x25.f299844z) && C46238a.m51546a(this.f299817A, x25.f299817A) && C46238a.m51546a(this.f299818B, x25.f299818B) && C46238a.m51546a(this.f299819C, x25.f299819C) && C46238a.m51546a(this.f299820D, x25.f299820D) && C46238a.m51546a(this.f299821E, x25.f299821E) && C46238a.m51546a(Integer.valueOf(this.f299822F), Integer.valueOf(x25.f299822F)) && C46238a.m51546a(this.f299823G, x25.f299823G) && C46238a.m51546a(this.f299824H, x25.f299824H);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f299826e != null) {
                aVar.mo74318e(1, this.f299825d);
                String str = this.f299826e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f299827f);
                aVar.mo74321h(4, this.f299828g);
                aVar.mo74318e(5, this.f299829h);
                C48884bn2 bn22 = this.f299830i;
                if (bn22 != null) {
                    aVar.mo74322i(6, bn22.computeSize());
                    this.f299830i.writeFields(aVar);
                }
                aVar.mo74320g(7, 8, this.f299831j);
                aVar.mo74318e(8, this.f299832n);
                String str2 = this.f299833o;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                aVar.mo74318e(10, this.f299834p);
                String str3 = this.f299835q;
                if (str3 != null) {
                    aVar.mo74323j(11, str3);
                }
                String str4 = this.f299836r;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                aVar.mo74318e(13, this.f299837s);
                aVar.mo74320g(14, 1, this.f299838t);
                aVar.mo74318e(15, this.f299839u);
                ye4 ye4 = this.f299840v;
                if (ye4 != null) {
                    aVar.mo74322i(16, ye4.computeSize());
                    this.f299840v.writeFields(aVar);
                }
                aVar.mo74320g(17, 8, this.f299841w);
                aVar.mo74320g(18, 8, this.f299842x);
                String str5 = this.f299843y;
                if (str5 != null) {
                    aVar.mo74323j(19, str5);
                }
                C89349b bVar = this.f299844z;
                if (bVar != null) {
                    aVar.mo74315b(20, bVar);
                }
                String str6 = this.f299817A;
                if (str6 != null) {
                    aVar.mo74323j(21, str6);
                }
                C89349b bVar2 = this.f299818B;
                if (bVar2 != null) {
                    aVar.mo74315b(22, bVar2);
                }
                z64 z64 = this.f299819C;
                if (z64 != null) {
                    aVar.mo74322i(23, z64.computeSize());
                    this.f299819C.writeFields(aVar);
                }
                C51908x10 x102 = this.f299820D;
                if (x102 != null) {
                    aVar.mo74322i(24, x102.computeSize());
                    this.f299820D.writeFields(aVar);
                }
                C50670oe3 oe32 = this.f299821E;
                if (oe32 != null) {
                    aVar.mo74322i(25, oe32.computeSize());
                    this.f299821E.writeFields(aVar);
                }
                aVar.mo74318e(26, this.f299822F);
                C64816wv wvVar = this.f299823G;
                if (wvVar != null) {
                    aVar.mo74322i(27, wvVar.computeSize());
                    this.f299823G.writeFields(aVar);
                }
                ve4 ve4 = this.f299824H;
                if (ve4 != null) {
                    aVar.mo74322i(28, ve4.computeSize());
                    this.f299824H.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Keyword");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f299825d) + 0;
            String str7 = this.f299826e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            int e2 = e + C52418a.m58678e(3, this.f299827f) + C52418a.m58681h(4, this.f299828g) + C52418a.m58678e(5, this.f299829h);
            C48884bn2 bn23 = this.f299830i;
            if (bn23 != null) {
                e2 += C52418a.m58682i(6, bn23.computeSize());
            }
            int g = e2 + C52418a.m58680g(7, 8, this.f299831j) + C52418a.m58678e(8, this.f299832n);
            String str8 = this.f299833o;
            if (str8 != null) {
                g += C52418a.m58683j(9, str8);
            }
            int e3 = g + C52418a.m58678e(10, this.f299834p);
            String str9 = this.f299835q;
            if (str9 != null) {
                e3 += C52418a.m58683j(11, str9);
            }
            String str10 = this.f299836r;
            if (str10 != null) {
                e3 += C52418a.m58683j(12, str10);
            }
            int e4 = e3 + C52418a.m58678e(13, this.f299837s) + C52418a.m58680g(14, 1, this.f299838t) + C52418a.m58678e(15, this.f299839u);
            ye4 ye42 = this.f299840v;
            if (ye42 != null) {
                e4 += C52418a.m58682i(16, ye42.computeSize());
            }
            int g2 = e4 + C52418a.m58680g(17, 8, this.f299841w) + C52418a.m58680g(18, 8, this.f299842x);
            String str11 = this.f299843y;
            if (str11 != null) {
                g2 += C52418a.m58683j(19, str11);
            }
            C89349b bVar3 = this.f299844z;
            if (bVar3 != null) {
                g2 += C52418a.m58675b(20, bVar3);
            }
            String str12 = this.f299817A;
            if (str12 != null) {
                g2 += C52418a.m58683j(21, str12);
            }
            C89349b bVar4 = this.f299818B;
            if (bVar4 != null) {
                g2 += C52418a.m58675b(22, bVar4);
            }
            z64 z642 = this.f299819C;
            if (z642 != null) {
                g2 += C52418a.m58682i(23, z642.computeSize());
            }
            C51908x10 x103 = this.f299820D;
            if (x103 != null) {
                g2 += C52418a.m58682i(24, x103.computeSize());
            }
            C50670oe3 oe33 = this.f299821E;
            if (oe33 != null) {
                g2 += C52418a.m58682i(25, oe33.computeSize());
            }
            int e5 = g2 + C52418a.m58678e(26, this.f299822F);
            C64816wv wvVar2 = this.f299823G;
            if (wvVar2 != null) {
                e5 += C52418a.m58682i(27, wvVar2.computeSize());
            }
            ve4 ve42 = this.f299824H;
            return ve42 != null ? e5 + C52418a.m58682i(28, ve42.computeSize()) : e5;
        } else if (i2 == 2) {
            this.f299831j.clear();
            this.f299838t.clear();
            this.f299841w.clear();
            this.f299842x.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f299826e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Keyword");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            x25 x25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x25.f299825d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    x25.f299826e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x25.f299827f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    x25.f299828g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    x25.f299829h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C48884bn2 bn24 = new C48884bn2();
                        if (bArr != null && bArr.length > 0) {
                            bn24.parseFrom(bArr);
                        }
                        x25.f299830i = bn24;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        zo4 zo4 = new zo4();
                        if (bArr2 != null && bArr2.length > 0) {
                            zo4.parseFrom(bArr2);
                        }
                        x25.f299831j.add(zo4);
                    }
                    return 0;
                case 8:
                    x25.f299832n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    x25.f299833o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    x25.f299834p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    x25.f299835q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    x25.f299836r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    x25.f299837s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    x25.f299838t.add(aVar3.mo141633k(intValue));
                    return 0;
                case 15:
                    x25.f299839u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ye4 ye43 = new ye4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ye43.parseFrom(bArr3);
                        }
                        x25.f299840v = ye43;
                    }
                    return 0;
                case 17:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49768hy hyVar = new C49768hy();
                        if (bArr4 != null && bArr4.length > 0) {
                            hyVar.parseFrom(bArr4);
                        }
                        x25.f299841w.add(hyVar);
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C64569n43 n432 = new C64569n43();
                        if (bArr5 != null && bArr5.length > 0) {
                            n432.parseFrom(bArr5);
                        }
                        x25.f299842x.add(n432);
                    }
                    return 0;
                case 19:
                    x25.f299843y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    x25.f299844z = aVar3.mo141626d(intValue);
                    return 0;
                case 21:
                    x25.f299817A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    x25.f299818B = aVar3.mo141626d(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        z64 z643 = new z64();
                        if (bArr6 != null && bArr6.length > 0) {
                            z643.parseFrom(bArr6);
                        }
                        x25.f299819C = z643;
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51908x10 x104 = new C51908x10();
                        if (bArr7 != null && bArr7.length > 0) {
                            x104.parseFrom(bArr7);
                        }
                        x25.f299820D = x104;
                    }
                    return 0;
                case 25:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C50670oe3 oe34 = new C50670oe3();
                        if (bArr8 != null && bArr8.length > 0) {
                            oe34.parseFrom(bArr8);
                        }
                        x25.f299821E = oe34;
                    }
                    return 0;
                case 26:
                    x25.f299822F = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C64816wv wvVar3 = new C64816wv();
                        if (bArr9 != null && bArr9.length > 0) {
                            wvVar3.parseFrom(bArr9);
                        }
                        x25.f299823G = wvVar3;
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        ve4 ve43 = new ve4();
                        if (bArr10 != null && bArr10.length > 0) {
                            ve43.parseFrom(bArr10);
                        }
                        x25.f299824H = ve43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f299825d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "IsHomePage", valueOf, false);
            aVar.mo71655d(jSONObject, "Keyword", this.f299826e, false);
            aVar.mo71655d(jSONObject, "Offset", Integer.valueOf(this.f299827f), false);
            aVar.mo71655d(jSONObject, "BusinessType", Long.valueOf(this.f299828g), false);
            aVar.mo71655d(jSONObject, "CliVersion", Integer.valueOf(this.f299829h), false);
            aVar.mo71655d(jSONObject, "Location", this.f299830i, false);
            aVar.mo71655d(jSONObject, "MatchUserList", this.f299831j, false);
            aVar.mo71655d(jSONObject, "Scene", Integer.valueOf(this.f299832n), false);
            aVar.mo71655d(jSONObject, "SearchID", this.f299833o, false);
            aVar.mo71655d(jSONObject, "SceneActionType", Integer.valueOf(this.f299834p), false);
            aVar.mo71655d(jSONObject, "SugID", this.f299835q, false);
            aVar.mo71655d(jSONObject, "PrefixSug", this.f299836r, false);
            aVar.mo71655d(jSONObject, "SugType", Integer.valueOf(this.f299837s), false);
            aVar.mo71655d(jSONObject, "PrefixQuery", this.f299838t, false);
            aVar.mo71655d(jSONObject, "DisplayPattern", Integer.valueOf(this.f299839u), false);
            aVar.mo71655d(jSONObject, "TagInfo", this.f299840v, false);
            aVar.mo71655d(jSONObject, "ExtReqParams", this.f299841w, false);
            aVar.mo71655d(jSONObject, "NumConditions", this.f299842x, false);
            aVar.mo71655d(jSONObject, "Language", this.f299843y, false);
            aVar.mo71655d(jSONObject, "WeAppCtrlInfo", this.f299844z, false);
            aVar.mo71655d(jSONObject, "SessionID", this.f299817A, false);
            aVar.mo71655d(jSONObject, "BoxCtrlInfo", this.f299818B, false);
            aVar.mo71655d(jSONObject, C102661q8.TABLE_NAME, this.f299819C, false);
            aVar.mo71655d(jSONObject, "DebugCtrlInfo", this.f299820D, false);
            aVar.mo71655d(jSONObject, "PoiInfo", this.f299821E, false);
            aVar.mo71655d(jSONObject, "DarkMode", Integer.valueOf(this.f299822F), false);
            aVar.mo71655d(jSONObject, "ChildMode", this.f299823G, false);
            aVar.mo71655d(jSONObject, "TagExtInfo", this.f299824H, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
