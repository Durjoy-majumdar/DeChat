package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tm3 */
public class C118470tm3 extends C47465a {

    /* renamed from: d */
    public int f354462d;

    /* renamed from: e */
    public C51163rv3 f354463e;

    /* renamed from: f */
    public C51163rv3 f354464f;

    /* renamed from: g */
    public C51163rv3 f354465g;

    /* renamed from: h */
    public C51163rv3 f354466h;

    /* renamed from: i */
    public C51163rv3 f354467i;

    /* renamed from: j */
    public C51163rv3 f354468j;

    /* renamed from: n */
    public C51163rv3 f354469n;

    /* renamed from: o */
    public C51163rv3 f354470o;

    /* renamed from: p */
    public C51163rv3 f354471p;

    /* renamed from: q */
    public C51163rv3 f354472q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118470tm3)) {
            return false;
        }
        C118470tm3 tm32 = (C118470tm3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f354462d), Integer.valueOf(tm32.f354462d)) && C46238a.m51546a(this.f354463e, tm32.f354463e) && C46238a.m51546a(this.f354464f, tm32.f354464f) && C46238a.m51546a(this.f354465g, tm32.f354465g) && C46238a.m51546a(this.f354466h, tm32.f354466h) && C46238a.m51546a(this.f354467i, tm32.f354467i) && C46238a.m51546a(this.f354468j, tm32.f354468j) && C46238a.m51546a(this.f354469n, tm32.f354469n) && C46238a.m51546a(this.f354470o, tm32.f354470o) && C46238a.m51546a(this.f354471p, tm32.f354471p) && C46238a.m51546a(this.f354472q, tm32.f354472q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f354464f == null) {
                throw new C52419b("Not all required fields were included: province");
            } else if (this.f354465g == null) {
                throw new C52419b("Not all required fields were included: city");
            } else if (this.f354466h == null) {
                throw new C52419b("Not all required fields were included: district");
            } else if (this.f354467i == null) {
                throw new C52419b("Not all required fields were included: zipcode");
            } else if (this.f354468j == null) {
                throw new C52419b("Not all required fields were included: detail");
            } else if (this.f354469n == null) {
                throw new C52419b("Not all required fields were included: name");
            } else if (this.f354470o != null) {
                aVar.mo74318e(1, this.f354462d);
                C51163rv3 rv32 = this.f354463e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f354463e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f354464f;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f354464f.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f354465g;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f354465g.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f354466h;
                if (rv35 != null) {
                    aVar.mo74322i(5, rv35.computeSize());
                    this.f354466h.writeFields(aVar);
                }
                C51163rv3 rv36 = this.f354467i;
                if (rv36 != null) {
                    aVar.mo74322i(6, rv36.computeSize());
                    this.f354467i.writeFields(aVar);
                }
                C51163rv3 rv37 = this.f354468j;
                if (rv37 != null) {
                    aVar.mo74322i(7, rv37.computeSize());
                    this.f354468j.writeFields(aVar);
                }
                C51163rv3 rv38 = this.f354469n;
                if (rv38 != null) {
                    aVar.mo74322i(8, rv38.computeSize());
                    this.f354469n.writeFields(aVar);
                }
                C51163rv3 rv39 = this.f354470o;
                if (rv39 != null) {
                    aVar.mo74322i(9, rv39.computeSize());
                    this.f354470o.writeFields(aVar);
                }
                C51163rv3 rv310 = this.f354471p;
                if (rv310 != null) {
                    aVar.mo74322i(10, rv310.computeSize());
                    this.f354471p.writeFields(aVar);
                }
                C51163rv3 rv311 = this.f354472q;
                if (rv311 != null) {
                    aVar.mo74322i(11, rv311.computeSize());
                    this.f354472q.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: phone");
            }
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f354462d) + 0;
            C51163rv3 rv312 = this.f354463e;
            if (rv312 != null) {
                e += C52418a.m58682i(2, rv312.computeSize());
            }
            C51163rv3 rv313 = this.f354464f;
            if (rv313 != null) {
                e += C52418a.m58682i(3, rv313.computeSize());
            }
            C51163rv3 rv314 = this.f354465g;
            if (rv314 != null) {
                e += C52418a.m58682i(4, rv314.computeSize());
            }
            C51163rv3 rv315 = this.f354466h;
            if (rv315 != null) {
                e += C52418a.m58682i(5, rv315.computeSize());
            }
            C51163rv3 rv316 = this.f354467i;
            if (rv316 != null) {
                e += C52418a.m58682i(6, rv316.computeSize());
            }
            C51163rv3 rv317 = this.f354468j;
            if (rv317 != null) {
                e += C52418a.m58682i(7, rv317.computeSize());
            }
            C51163rv3 rv318 = this.f354469n;
            if (rv318 != null) {
                e += C52418a.m58682i(8, rv318.computeSize());
            }
            C51163rv3 rv319 = this.f354470o;
            if (rv319 != null) {
                e += C52418a.m58682i(9, rv319.computeSize());
            }
            C51163rv3 rv320 = this.f354471p;
            if (rv320 != null) {
                e += C52418a.m58682i(10, rv320.computeSize());
            }
            C51163rv3 rv321 = this.f354472q;
            return rv321 != null ? e + C52418a.m58682i(11, rv321.computeSize()) : e;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f354464f == null) {
                throw new C52419b("Not all required fields were included: province");
            } else if (this.f354465g == null) {
                throw new C52419b("Not all required fields were included: city");
            } else if (this.f354466h == null) {
                throw new C52419b("Not all required fields were included: district");
            } else if (this.f354467i == null) {
                throw new C52419b("Not all required fields were included: zipcode");
            } else if (this.f354468j == null) {
                throw new C52419b("Not all required fields were included: detail");
            } else if (this.f354469n == null) {
                throw new C52419b("Not all required fields were included: name");
            } else if (this.f354470o != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: phone");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118470tm3 tm32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    tm32.f354462d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51163rv3 rv322 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv322.mo73356d(bArr);
                        }
                        tm32.f354463e = rv322;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv323 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv323.mo73356d(bArr2);
                        }
                        tm32.f354464f = rv323;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv324 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv324.mo73356d(bArr3);
                        }
                        tm32.f354465g = rv324;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv325 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv325.mo73356d(bArr4);
                        }
                        tm32.f354466h = rv325;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51163rv3 rv326 = new C51163rv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv326.mo73356d(bArr5);
                        }
                        tm32.f354467i = rv326;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51163rv3 rv327 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv327.mo73356d(bArr6);
                        }
                        tm32.f354468j = rv327;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51163rv3 rv328 = new C51163rv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            rv328.mo73356d(bArr7);
                        }
                        tm32.f354469n = rv328;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C51163rv3 rv329 = new C51163rv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            rv329.mo73356d(bArr8);
                        }
                        tm32.f354470o = rv329;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C51163rv3 rv330 = new C51163rv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            rv330.mo73356d(bArr9);
                        }
                        tm32.f354471p = rv330;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i17 = 0; i17 < size10; i17++) {
                        byte[] bArr10 = j15.get(i17);
                        C51163rv3 rv331 = new C51163rv3();
                        if (bArr10 != null && bArr10.length > 0) {
                            rv331.mo73356d(bArr10);
                        }
                        tm32.f354472q = rv331;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
