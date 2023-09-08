package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mf0 */
public class C50393mf0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f137980d = new LinkedList<>();

    /* renamed from: e */
    public String f137981e;

    /* renamed from: f */
    public C50291lo1 f137982f;

    /* renamed from: g */
    public FinderContact f137983g;

    /* renamed from: h */
    public int f137984h;

    /* renamed from: i */
    public int f137985i;

    /* renamed from: j */
    public C50251le1 f137986j;

    /* renamed from: n */
    public int f137987n;

    /* renamed from: o */
    public C89349b f137988o;

    /* renamed from: p */
    public int f137989p;

    /* renamed from: q */
    public LinkedList<String> f137990q = new LinkedList<>();

    /* renamed from: r */
    public int f137991r;

    /* renamed from: s */
    public C49965j93 f137992s;

    /* renamed from: t */
    public C51974xh1 f137993t;

    /* renamed from: u */
    public LinkedList<FinderObject> f137994u = new LinkedList<>();

    /* renamed from: v */
    public int f137995v;

    /* renamed from: w */
    public String f137996w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50393mf0)) {
            return false;
        }
        C50393mf0 mf02 = (C50393mf0) aVar;
        return C46238a.m51546a(this.BaseResponse, mf02.BaseResponse) && C46238a.m51546a(this.f137980d, mf02.f137980d) && C46238a.m51546a(this.f137981e, mf02.f137981e) && C46238a.m51546a(this.f137982f, mf02.f137982f) && C46238a.m51546a(this.f137983g, mf02.f137983g) && C46238a.m51546a(Integer.valueOf(this.f137984h), Integer.valueOf(mf02.f137984h)) && C46238a.m51546a(Integer.valueOf(this.f137985i), Integer.valueOf(mf02.f137985i)) && C46238a.m51546a(this.f137986j, mf02.f137986j) && C46238a.m51546a(Integer.valueOf(this.f137987n), Integer.valueOf(mf02.f137987n)) && C46238a.m51546a(this.f137988o, mf02.f137988o) && C46238a.m51546a(Integer.valueOf(this.f137989p), Integer.valueOf(mf02.f137989p)) && C46238a.m51546a(this.f137990q, mf02.f137990q) && C46238a.m51546a(Integer.valueOf(this.f137991r), Integer.valueOf(mf02.f137991r)) && C46238a.m51546a(this.f137992s, mf02.f137992s) && C46238a.m51546a(this.f137993t, mf02.f137993t) && C46238a.m51546a(this.f137994u, mf02.f137994u) && C46238a.m51546a(Integer.valueOf(this.f137995v), Integer.valueOf(mf02.f137995v)) && C46238a.m51546a(this.f137996w, mf02.f137996w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f137980d);
                String str = this.f137981e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C50291lo1 lo12 = this.f137982f;
                if (lo12 != null) {
                    aVar.mo74322i(4, lo12.computeSize());
                    this.f137982f.writeFields(aVar);
                }
                FinderContact finderContact = this.f137983g;
                if (finderContact != null) {
                    aVar.mo74322i(5, finderContact.computeSize());
                    this.f137983g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f137984h);
                aVar.mo74318e(7, this.f137985i);
                C50251le1 le12 = this.f137986j;
                if (le12 != null) {
                    aVar.mo74322i(8, le12.computeSize());
                    this.f137986j.writeFields(aVar);
                }
                aVar.mo74318e(9, this.f137987n);
                C89349b bVar = this.f137988o;
                if (bVar != null) {
                    aVar.mo74315b(10, bVar);
                }
                aVar.mo74318e(11, this.f137989p);
                aVar.mo74320g(12, 1, this.f137990q);
                aVar.mo74318e(13, this.f137991r);
                C49965j93 j932 = this.f137992s;
                if (j932 != null) {
                    aVar.mo74322i(14, j932.computeSize());
                    this.f137992s.writeFields(aVar);
                }
                C51974xh1 xh12 = this.f137993t;
                if (xh12 != null) {
                    aVar.mo74322i(15, xh12.computeSize());
                    this.f137993t.writeFields(aVar);
                }
                aVar.mo74320g(16, 8, this.f137994u);
                aVar.mo74318e(17, this.f137995v);
                String str2 = this.f137996w;
                if (str2 != null) {
                    aVar.mo74323j(18, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f137980d);
            String str3 = this.f137981e;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            C50291lo1 lo13 = this.f137982f;
            if (lo13 != null) {
                g += C52418a.m58682i(4, lo13.computeSize());
            }
            FinderContact finderContact2 = this.f137983g;
            if (finderContact2 != null) {
                g += C52418a.m58682i(5, finderContact2.computeSize());
            }
            int e = g + C52418a.m58678e(6, this.f137984h) + C52418a.m58678e(7, this.f137985i);
            C50251le1 le13 = this.f137986j;
            if (le13 != null) {
                e += C52418a.m58682i(8, le13.computeSize());
            }
            int e2 = e + C52418a.m58678e(9, this.f137987n);
            C89349b bVar2 = this.f137988o;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(10, bVar2);
            }
            int e3 = e2 + C52418a.m58678e(11, this.f137989p) + C52418a.m58680g(12, 1, this.f137990q) + C52418a.m58678e(13, this.f137991r);
            C49965j93 j933 = this.f137992s;
            if (j933 != null) {
                e3 += C52418a.m58682i(14, j933.computeSize());
            }
            C51974xh1 xh13 = this.f137993t;
            if (xh13 != null) {
                e3 += C52418a.m58682i(15, xh13.computeSize());
            }
            int g2 = e3 + C52418a.m58680g(16, 8, this.f137994u) + C52418a.m58678e(17, this.f137995v);
            String str4 = this.f137996w;
            return str4 != null ? g2 + C52418a.m58683j(18, str4) : g2;
        } else if (i2 == 2) {
            this.f137980d.clear();
            this.f137990q.clear();
            this.f137994u.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50393mf0 mf02 = objArr[1];
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
                        mf02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        mf02.f137980d.add(finderObject);
                    }
                    return 0;
                case 3:
                    mf02.f137981e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C50291lo1 lo14 = new C50291lo1();
                        if (bArr3 != null && bArr3.length > 0) {
                            lo14.parseFrom(bArr3);
                        }
                        mf02.f137982f = lo14;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact3.parseFrom(bArr4);
                        }
                        mf02.f137983g = finderContact3;
                    }
                    return 0;
                case 6:
                    mf02.f137984h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    mf02.f137985i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C50251le1 le14 = new C50251le1();
                        if (bArr5 != null && bArr5.length > 0) {
                            le14.parseFrom(bArr5);
                        }
                        mf02.f137986j = le14;
                    }
                    return 0;
                case 9:
                    mf02.f137987n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    mf02.f137988o = aVar3.mo141626d(intValue);
                    return 0;
                case 11:
                    mf02.f137989p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    mf02.f137990q.add(aVar3.mo141633k(intValue));
                    return 0;
                case 13:
                    mf02.f137991r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49965j93 j934 = new C49965j93();
                        if (bArr6 != null && bArr6.length > 0) {
                            j934.parseFrom(bArr6);
                        }
                        mf02.f137992s = j934;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr7 != null && bArr7.length > 0) {
                            xh14.parseFrom(bArr7);
                        }
                        mf02.f137993t = xh14;
                    }
                    return 0;
                case 16:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        FinderObject finderObject2 = new FinderObject();
                        if (bArr8 != null && bArr8.length > 0) {
                            finderObject2.parseFrom(bArr8);
                        }
                        mf02.f137994u.add(finderObject2);
                    }
                    return 0;
                case 17:
                    mf02.f137995v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    mf02.f137996w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
