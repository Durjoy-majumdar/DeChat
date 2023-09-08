package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y7 */
public class C118481y7 extends C47465a {

    /* renamed from: A */
    public int f354579A;

    /* renamed from: B */
    public C51018qv3 f354580B;

    /* renamed from: C */
    public C51018qv3 f354581C;

    /* renamed from: D */
    public int f354582D;

    /* renamed from: d */
    public int f354583d;

    /* renamed from: e */
    public C64306d60 f354584e;

    /* renamed from: f */
    public C51018qv3 f354585f;

    /* renamed from: g */
    public C51018qv3 f354586g;

    /* renamed from: h */
    public int f354587h;

    /* renamed from: i */
    public C51018qv3 f354588i;

    /* renamed from: j */
    public by4 f354589j;

    /* renamed from: n */
    public j45 f354590n;

    /* renamed from: o */
    public C51018qv3 f354591o;

    /* renamed from: p */
    public C51018qv3 f354592p;

    /* renamed from: q */
    public String f354593q;

    /* renamed from: r */
    public C51018qv3 f354594r;

    /* renamed from: s */
    public String f354595s;

    /* renamed from: t */
    public d54 f354596t;

    /* renamed from: u */
    public String f354597u;

    /* renamed from: v */
    public int f354598v;

    /* renamed from: w */
    public int f354599w;

    /* renamed from: x */
    public int f354600x;

    /* renamed from: y */
    public String f354601y;

    /* renamed from: z */
    public int f354602z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118481y7)) {
            return false;
        }
        C118481y7 y7Var = (C118481y7) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354583d), Integer.valueOf(y7Var.f354583d)) && C46238a.m51546a(this.f354584e, y7Var.f354584e) && C46238a.m51546a(this.f354585f, y7Var.f354585f) && C46238a.m51546a(this.f354586g, y7Var.f354586g) && C46238a.m51546a(Integer.valueOf(this.f354587h), Integer.valueOf(y7Var.f354587h)) && C46238a.m51546a(this.f354588i, y7Var.f354588i) && C46238a.m51546a(this.f354589j, y7Var.f354589j) && C46238a.m51546a(this.f354590n, y7Var.f354590n) && C46238a.m51546a(this.f354591o, y7Var.f354591o) && C46238a.m51546a(this.f354592p, y7Var.f354592p) && C46238a.m51546a(this.f354593q, y7Var.f354593q) && C46238a.m51546a(this.f354594r, y7Var.f354594r) && C46238a.m51546a(this.f354595s, y7Var.f354595s) && C46238a.m51546a(this.f354596t, y7Var.f354596t) && C46238a.m51546a(this.f354597u, y7Var.f354597u) && C46238a.m51546a(Integer.valueOf(this.f354598v), Integer.valueOf(y7Var.f354598v)) && C46238a.m51546a(Integer.valueOf(this.f354599w), Integer.valueOf(y7Var.f354599w)) && C46238a.m51546a(Integer.valueOf(this.f354600x), Integer.valueOf(y7Var.f354600x)) && C46238a.m51546a(this.f354601y, y7Var.f354601y) && C46238a.m51546a(Integer.valueOf(this.f354602z), Integer.valueOf(y7Var.f354602z)) && C46238a.m51546a(Integer.valueOf(this.f354579A), Integer.valueOf(y7Var.f354579A)) && C46238a.m51546a(this.f354580B, y7Var.f354580B) && C46238a.m51546a(this.f354581C, y7Var.f354581C) && C46238a.m51546a(Integer.valueOf(this.f354582D), Integer.valueOf(y7Var.f354582D));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354584e == null) {
                throw new C52419b("Not all required fields were included: SvrPubECDHKey");
            } else if (this.f354585f == null) {
                throw new C52419b("Not all required fields were included: SessionKey");
            } else if (this.f354586g == null) {
                throw new C52419b("Not all required fields were included: AutoAuthKey");
            } else if (this.f354580B == null) {
                throw new C52419b("Not all required fields were included: ClientSessionKey");
            } else if (this.f354581C != null) {
                aVar.mo74318e(1, this.f354583d);
                C64306d60 d602 = this.f354584e;
                if (d602 != null) {
                    aVar.mo74322i(2, d602.computeSize());
                    this.f354584e.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f354585f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f354585f.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f354586g;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f354586g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f354587h);
                C51018qv3 qv34 = this.f354588i;
                if (qv34 != null) {
                    aVar.mo74322i(6, qv34.computeSize());
                    this.f354588i.writeFields(aVar);
                }
                by4 by4 = this.f354589j;
                if (by4 != null) {
                    aVar.mo74322i(7, by4.computeSize());
                    this.f354589j.writeFields(aVar);
                }
                j45 j45 = this.f354590n;
                if (j45 != null) {
                    aVar.mo74322i(8, j45.computeSize());
                    this.f354590n.writeFields(aVar);
                }
                C51018qv3 qv35 = this.f354591o;
                if (qv35 != null) {
                    aVar.mo74322i(9, qv35.computeSize());
                    this.f354591o.writeFields(aVar);
                }
                C51018qv3 qv36 = this.f354592p;
                if (qv36 != null) {
                    aVar.mo74322i(10, qv36.computeSize());
                    this.f354592p.writeFields(aVar);
                }
                String str = this.f354593q;
                if (str != null) {
                    aVar.mo74323j(11, str);
                }
                C51018qv3 qv37 = this.f354594r;
                if (qv37 != null) {
                    aVar.mo74322i(12, qv37.computeSize());
                    this.f354594r.writeFields(aVar);
                }
                String str2 = this.f354595s;
                if (str2 != null) {
                    aVar.mo74323j(14, str2);
                }
                d54 d54 = this.f354596t;
                if (d54 != null) {
                    aVar.mo74322i(15, d54.computeSize());
                    this.f354596t.writeFields(aVar);
                }
                String str3 = this.f354597u;
                if (str3 != null) {
                    aVar.mo74323j(16, str3);
                }
                aVar.mo74318e(17, this.f354598v);
                aVar.mo74318e(18, this.f354599w);
                aVar.mo74318e(19, this.f354600x);
                String str4 = this.f354601y;
                if (str4 != null) {
                    aVar.mo74323j(20, str4);
                }
                aVar.mo74318e(21, this.f354602z);
                aVar.mo74318e(22, this.f354579A);
                C51018qv3 qv38 = this.f354580B;
                if (qv38 != null) {
                    aVar.mo74322i(23, qv38.computeSize());
                    this.f354580B.writeFields(aVar);
                }
                C51018qv3 qv39 = this.f354581C;
                if (qv39 != null) {
                    aVar.mo74322i(24, qv39.computeSize());
                    this.f354581C.writeFields(aVar);
                }
                aVar.mo74318e(25, this.f354582D);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServerSessionKey");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f354583d) + 0;
            C64306d60 d603 = this.f354584e;
            if (d603 != null) {
                e += C52418a.m58682i(2, d603.computeSize());
            }
            C51018qv3 qv310 = this.f354585f;
            if (qv310 != null) {
                e += C52418a.m58682i(3, qv310.computeSize());
            }
            C51018qv3 qv311 = this.f354586g;
            if (qv311 != null) {
                e += C52418a.m58682i(4, qv311.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f354587h);
            C51018qv3 qv312 = this.f354588i;
            if (qv312 != null) {
                e2 += C52418a.m58682i(6, qv312.computeSize());
            }
            by4 by42 = this.f354589j;
            if (by42 != null) {
                e2 += C52418a.m58682i(7, by42.computeSize());
            }
            j45 j452 = this.f354590n;
            if (j452 != null) {
                e2 += C52418a.m58682i(8, j452.computeSize());
            }
            C51018qv3 qv313 = this.f354591o;
            if (qv313 != null) {
                e2 += C52418a.m58682i(9, qv313.computeSize());
            }
            C51018qv3 qv314 = this.f354592p;
            if (qv314 != null) {
                e2 += C52418a.m58682i(10, qv314.computeSize());
            }
            String str5 = this.f354593q;
            if (str5 != null) {
                e2 += C52418a.m58683j(11, str5);
            }
            C51018qv3 qv315 = this.f354594r;
            if (qv315 != null) {
                e2 += C52418a.m58682i(12, qv315.computeSize());
            }
            String str6 = this.f354595s;
            if (str6 != null) {
                e2 += C52418a.m58683j(14, str6);
            }
            d54 d542 = this.f354596t;
            if (d542 != null) {
                e2 += C52418a.m58682i(15, d542.computeSize());
            }
            String str7 = this.f354597u;
            if (str7 != null) {
                e2 += C52418a.m58683j(16, str7);
            }
            int e3 = e2 + C52418a.m58678e(17, this.f354598v) + C52418a.m58678e(18, this.f354599w) + C52418a.m58678e(19, this.f354600x);
            String str8 = this.f354601y;
            if (str8 != null) {
                e3 += C52418a.m58683j(20, str8);
            }
            int e4 = e3 + C52418a.m58678e(21, this.f354602z) + C52418a.m58678e(22, this.f354579A);
            C51018qv3 qv316 = this.f354580B;
            if (qv316 != null) {
                e4 += C52418a.m58682i(23, qv316.computeSize());
            }
            C51018qv3 qv317 = this.f354581C;
            if (qv317 != null) {
                e4 += C52418a.m58682i(24, qv317.computeSize());
            }
            return e4 + C52418a.m58678e(25, this.f354582D);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354584e == null) {
                throw new C52419b("Not all required fields were included: SvrPubECDHKey");
            } else if (this.f354585f == null) {
                throw new C52419b("Not all required fields were included: SessionKey");
            } else if (this.f354586g == null) {
                throw new C52419b("Not all required fields were included: AutoAuthKey");
            } else if (this.f354580B == null) {
                throw new C52419b("Not all required fields were included: ClientSessionKey");
            } else if (this.f354581C != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ServerSessionKey");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118481y7 y7Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    y7Var.f354583d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64306d60 d604 = new C64306d60();
                        if (bArr != null && bArr.length > 0) {
                            d604.parseFrom(bArr);
                        }
                        y7Var.f354584e = d604;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv318 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv318.mo73348f(bArr2);
                        }
                        y7Var.f354585f = qv318;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv319 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv319.mo73348f(bArr3);
                        }
                        y7Var.f354586g = qv319;
                    }
                    return 0;
                case 5:
                    y7Var.f354587h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv320 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv320.mo73348f(bArr4);
                        }
                        y7Var.f354588i = qv320;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        by4 by43 = new by4();
                        if (bArr5 != null && bArr5.length > 0) {
                            by43.parseFrom(bArr5);
                        }
                        y7Var.f354589j = by43;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        j45 j453 = new j45();
                        if (bArr6 != null && bArr6.length > 0) {
                            j453.parseFrom(bArr6);
                        }
                        y7Var.f354590n = j453;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51018qv3 qv321 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv321.mo73348f(bArr7);
                        }
                        y7Var.f354591o = qv321;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C51018qv3 qv322 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv322.mo73348f(bArr8);
                        }
                        y7Var.f354592p = qv322;
                    }
                    return 0;
                case 11:
                    y7Var.f354593q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C51018qv3 qv323 = new C51018qv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            qv323.mo73348f(bArr9);
                        }
                        y7Var.f354594r = qv323;
                    }
                    return 0;
                case 14:
                    y7Var.f354595s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        d54 d543 = new d54();
                        if (bArr10 != null && bArr10.length > 0) {
                            d543.parseFrom(bArr10);
                        }
                        y7Var.f354596t = d543;
                    }
                    return 0;
                case 16:
                    y7Var.f354597u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    y7Var.f354598v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    y7Var.f354599w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    y7Var.f354600x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    y7Var.f354601y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    y7Var.f354602z = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    y7Var.f354579A = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i18 = 0; i18 < size11; i18++) {
                        byte[] bArr11 = j16.get(i18);
                        C51018qv3 qv324 = new C51018qv3();
                        if (bArr11 != null && bArr11.length > 0) {
                            qv324.mo73348f(bArr11);
                        }
                        y7Var.f354580B = qv324;
                    }
                    return 0;
                case 24:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i19 = 0; i19 < size12; i19++) {
                        byte[] bArr12 = j17.get(i19);
                        C51018qv3 qv325 = new C51018qv3();
                        if (bArr12 != null && bArr12.length > 0) {
                            qv325.mo73348f(bArr12);
                        }
                        y7Var.f354581C = qv325;
                    }
                    return 0;
                case 25:
                    y7Var.f354582D = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
