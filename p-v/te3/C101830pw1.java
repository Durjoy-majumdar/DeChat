package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pw1 */
public class C101830pw1 extends C49335eu3 {

    /* renamed from: d */
    public C101795jm f299184d;

    /* renamed from: e */
    public C101795jm f299185e;

    /* renamed from: f */
    public C101795jm f299186f;

    /* renamed from: g */
    public C51018qv3 f299187g;

    /* renamed from: h */
    public C51018qv3 f299188h;

    /* renamed from: i */
    public C101795jm f299189i;

    /* renamed from: j */
    public int f299190j;

    /* renamed from: n */
    public C101788im f299191n;

    /* renamed from: o */
    public C101788im f299192o;

    /* renamed from: p */
    public int f299193p;

    /* renamed from: q */
    public C101795jm f299194q;

    /* renamed from: r */
    public h45 f299195r;

    /* renamed from: s */
    public int f299196s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101830pw1)) {
            return false;
        }
        C101830pw1 pw12 = (C101830pw1) aVar;
        return C46238a.m51546a(this.BaseResponse, pw12.BaseResponse) && C46238a.m51546a(this.f299184d, pw12.f299184d) && C46238a.m51546a(this.f299185e, pw12.f299185e) && C46238a.m51546a(this.f299186f, pw12.f299186f) && C46238a.m51546a(this.f299187g, pw12.f299187g) && C46238a.m51546a(this.f299188h, pw12.f299188h) && C46238a.m51546a(this.f299189i, pw12.f299189i) && C46238a.m51546a(Integer.valueOf(this.f299190j), Integer.valueOf(pw12.f299190j)) && C46238a.m51546a(this.f299191n, pw12.f299191n) && C46238a.m51546a(this.f299192o, pw12.f299192o) && C46238a.m51546a(Integer.valueOf(this.f299193p), Integer.valueOf(pw12.f299193p)) && C46238a.m51546a(this.f299194q, pw12.f299194q) && C46238a.m51546a(this.f299195r, pw12.f299195r) && C46238a.m51546a(Integer.valueOf(this.f299196s), Integer.valueOf(pw12.f299196s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f299184d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C101795jm jmVar = this.f299184d;
                if (jmVar != null) {
                    aVar.mo74322i(2, jmVar.computeSize());
                    this.f299184d.writeFields(aVar);
                }
                C101795jm jmVar2 = this.f299185e;
                if (jmVar2 != null) {
                    aVar.mo74322i(3, jmVar2.computeSize());
                    this.f299185e.writeFields(aVar);
                }
                C101795jm jmVar3 = this.f299186f;
                if (jmVar3 != null) {
                    aVar.mo74322i(4, jmVar3.computeSize());
                    this.f299186f.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f299187g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f299187g.writeFields(aVar);
                }
                C51018qv3 qv33 = this.f299188h;
                if (qv33 != null) {
                    aVar.mo74322i(6, qv33.computeSize());
                    this.f299188h.writeFields(aVar);
                }
                C101795jm jmVar4 = this.f299189i;
                if (jmVar4 != null) {
                    aVar.mo74322i(7, jmVar4.computeSize());
                    this.f299189i.writeFields(aVar);
                }
                aVar.mo74318e(8, this.f299190j);
                C101788im imVar = this.f299191n;
                if (imVar != null) {
                    aVar.mo74322i(9, imVar.computeSize());
                    this.f299191n.writeFields(aVar);
                }
                C101788im imVar2 = this.f299192o;
                if (imVar2 != null) {
                    aVar.mo74322i(10, imVar2.computeSize());
                    this.f299192o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f299193p);
                C101795jm jmVar5 = this.f299194q;
                if (jmVar5 != null) {
                    aVar.mo74322i(12, jmVar5.computeSize());
                    this.f299194q.writeFields(aVar);
                }
                h45 h45 = this.f299195r;
                if (h45 != null) {
                    aVar.mo74322i(13, h45.computeSize());
                    this.f299195r.writeFields(aVar);
                }
                aVar.mo74318e(14, this.f299196s);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DnsInfo");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C101795jm jmVar6 = this.f299184d;
            if (jmVar6 != null) {
                i3 += C52418a.m58682i(2, jmVar6.computeSize());
            }
            C101795jm jmVar7 = this.f299185e;
            if (jmVar7 != null) {
                i3 += C52418a.m58682i(3, jmVar7.computeSize());
            }
            C101795jm jmVar8 = this.f299186f;
            if (jmVar8 != null) {
                i3 += C52418a.m58682i(4, jmVar8.computeSize());
            }
            C51018qv3 qv34 = this.f299187g;
            if (qv34 != null) {
                i3 += C52418a.m58682i(5, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f299188h;
            if (qv35 != null) {
                i3 += C52418a.m58682i(6, qv35.computeSize());
            }
            C101795jm jmVar9 = this.f299189i;
            if (jmVar9 != null) {
                i3 += C52418a.m58682i(7, jmVar9.computeSize());
            }
            int e = i3 + C52418a.m58678e(8, this.f299190j);
            C101788im imVar3 = this.f299191n;
            if (imVar3 != null) {
                e += C52418a.m58682i(9, imVar3.computeSize());
            }
            C101788im imVar4 = this.f299192o;
            if (imVar4 != null) {
                e += C52418a.m58682i(10, imVar4.computeSize());
            }
            int e2 = e + C52418a.m58678e(11, this.f299193p);
            C101795jm jmVar10 = this.f299194q;
            if (jmVar10 != null) {
                e2 += C52418a.m58682i(12, jmVar10.computeSize());
            }
            h45 h452 = this.f299195r;
            if (h452 != null) {
                e2 += C52418a.m58682i(13, h452.computeSize());
            }
            return e2 + C52418a.m58678e(14, this.f299196s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f299184d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DnsInfo");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101830pw1 pw12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        pw12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C101795jm jmVar11 = new C101795jm();
                        if (bArr2 != null && bArr2.length > 0) {
                            jmVar11.parseFrom(bArr2);
                        }
                        pw12.f299184d = jmVar11;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C101795jm jmVar12 = new C101795jm();
                        if (bArr3 != null && bArr3.length > 0) {
                            jmVar12.parseFrom(bArr3);
                        }
                        pw12.f299185e = jmVar12;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C101795jm jmVar13 = new C101795jm();
                        if (bArr4 != null && bArr4.length > 0) {
                            jmVar13.parseFrom(bArr4);
                        }
                        pw12.f299186f = jmVar13;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        pw12.f299187g = qv36;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv37.mo73348f(bArr6);
                        }
                        pw12.f299188h = qv37;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C101795jm jmVar14 = new C101795jm();
                        if (bArr7 != null && bArr7.length > 0) {
                            jmVar14.parseFrom(bArr7);
                        }
                        pw12.f299189i = jmVar14;
                    }
                    return 0;
                case 8:
                    pw12.f299190j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C101788im imVar5 = new C101788im();
                        if (bArr8 != null && bArr8.length > 0) {
                            imVar5.parseFrom(bArr8);
                        }
                        pw12.f299191n = imVar5;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C101788im imVar6 = new C101788im();
                        if (bArr9 != null && bArr9.length > 0) {
                            imVar6.parseFrom(bArr9);
                        }
                        pw12.f299192o = imVar6;
                    }
                    return 0;
                case 11:
                    pw12.f299193p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C101795jm jmVar15 = new C101795jm();
                        if (bArr10 != null && bArr10.length > 0) {
                            jmVar15.parseFrom(bArr10);
                        }
                        pw12.f299194q = jmVar15;
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        h45 h453 = new h45();
                        if (bArr11 != null && bArr11.length > 0) {
                            h453.parseFrom(bArr11);
                        }
                        pw12.f299195r = h453;
                    }
                    return 0;
                case 14:
                    pw12.f299196s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
