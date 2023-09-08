package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tz1 */
public class C51468tz1 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f142489d;

    /* renamed from: e */
    public int f142490e;

    /* renamed from: f */
    public LinkedList<C101824o80> f142491f = new LinkedList<>();

    /* renamed from: g */
    public C52077y70 f142492g;

    /* renamed from: h */
    public int f142493h;

    /* renamed from: i */
    public LinkedList<C52077y70> f142494i = new LinkedList<>();

    /* renamed from: j */
    public int f142495j;

    /* renamed from: n */
    public LinkedList<C48969c80> f142496n = new LinkedList<>();

    /* renamed from: o */
    public int f142497o;

    /* renamed from: p */
    public LinkedList<C101754a80> f142498p = new LinkedList<>();

    /* renamed from: q */
    public int f142499q;

    /* renamed from: r */
    public int f142500r;

    /* renamed from: s */
    public int f142501s;

    /* renamed from: t */
    public LinkedList<C101754a80> f142502t = new LinkedList<>();

    /* renamed from: u */
    public String f142503u;

    /* renamed from: v */
    public LinkedList<C50367m80> f142504v = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51468tz1)) {
            return false;
        }
        C51468tz1 tz12 = (C51468tz1) aVar;
        return C46238a.m51546a(this.BaseResponse, tz12.BaseResponse) && C46238a.m51546a(this.f142489d, tz12.f142489d) && C46238a.m51546a(Integer.valueOf(this.f142490e), Integer.valueOf(tz12.f142490e)) && C46238a.m51546a(this.f142491f, tz12.f142491f) && C46238a.m51546a(this.f142492g, tz12.f142492g) && C46238a.m51546a(Integer.valueOf(this.f142493h), Integer.valueOf(tz12.f142493h)) && C46238a.m51546a(this.f142494i, tz12.f142494i) && C46238a.m51546a(Integer.valueOf(this.f142495j), Integer.valueOf(tz12.f142495j)) && C46238a.m51546a(this.f142496n, tz12.f142496n) && C46238a.m51546a(Integer.valueOf(this.f142497o), Integer.valueOf(tz12.f142497o)) && C46238a.m51546a(this.f142498p, tz12.f142498p) && C46238a.m51546a(Integer.valueOf(this.f142499q), Integer.valueOf(tz12.f142499q)) && C46238a.m51546a(Integer.valueOf(this.f142500r), Integer.valueOf(tz12.f142500r)) && C46238a.m51546a(Integer.valueOf(this.f142501s), Integer.valueOf(tz12.f142501s)) && C46238a.m51546a(this.f142502t, tz12.f142502t) && C46238a.m51546a(this.f142503u, tz12.f142503u) && C46238a.m51546a(this.f142504v, tz12.f142504v);
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
            } else if (this.f142489d != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f142489d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f142489d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f142490e);
                aVar.mo74320g(4, 8, this.f142491f);
                C52077y70 y702 = this.f142492g;
                if (y702 != null) {
                    aVar.mo74322i(5, y702.computeSize());
                    this.f142492g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f142493h);
                aVar.mo74320g(7, 8, this.f142494i);
                aVar.mo74318e(8, this.f142495j);
                aVar.mo74320g(9, 8, this.f142496n);
                aVar.mo74318e(10, this.f142497o);
                aVar.mo74320g(11, 8, this.f142498p);
                aVar.mo74318e(12, this.f142499q);
                aVar.mo74318e(13, this.f142500r);
                aVar.mo74318e(14, this.f142501s);
                aVar.mo74320g(15, 8, this.f142502t);
                String str = this.f142503u;
                if (str != null) {
                    aVar.mo74323j(16, str);
                }
                aVar.mo74320g(18, 8, this.f142504v);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C51018qv3 qv33 = this.f142489d;
            if (qv33 != null) {
                i3 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f142490e) + C52418a.m58680g(4, 8, this.f142491f);
            C52077y70 y703 = this.f142492g;
            if (y703 != null) {
                e += C52418a.m58682i(5, y703.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f142493h) + C52418a.m58680g(7, 8, this.f142494i) + C52418a.m58678e(8, this.f142495j) + C52418a.m58680g(9, 8, this.f142496n) + C52418a.m58678e(10, this.f142497o) + C52418a.m58680g(11, 8, this.f142498p) + C52418a.m58678e(12, this.f142499q) + C52418a.m58678e(13, this.f142500r) + C52418a.m58678e(14, this.f142501s) + C52418a.m58680g(15, 8, this.f142502t);
            String str2 = this.f142503u;
            if (str2 != null) {
                e2 += C52418a.m58683j(16, str2);
            }
            return e2 + C52418a.m58680g(18, 8, this.f142504v);
        } else if (i2 == 2) {
            this.f142491f.clear();
            this.f142494i.clear();
            this.f142496n.clear();
            this.f142498p.clear();
            this.f142502t.clear();
            this.f142504v.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f142489d != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51468tz1 tz12 = objArr[1];
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
                        tz12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        tz12.f142489d = qv34;
                    }
                    return 0;
                case 3:
                    tz12.f142490e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C101824o80 o802 = new C101824o80();
                        if (bArr3 != null && bArr3.length > 0) {
                            o802.parseFrom(bArr3);
                        }
                        tz12.f142491f.add(o802);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C52077y70 y704 = new C52077y70();
                        if (bArr4 != null && bArr4.length > 0) {
                            y704.parseFrom(bArr4);
                        }
                        tz12.f142492g = y704;
                    }
                    return 0;
                case 6:
                    tz12.f142493h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52077y70 y705 = new C52077y70();
                        if (bArr5 != null && bArr5.length > 0) {
                            y705.parseFrom(bArr5);
                        }
                        tz12.f142494i.add(y705);
                    }
                    return 0;
                case 8:
                    tz12.f142495j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C48969c80 c802 = new C48969c80();
                        if (bArr6 != null && bArr6.length > 0) {
                            c802.parseFrom(bArr6);
                        }
                        tz12.f142496n.add(c802);
                    }
                    return 0;
                case 10:
                    tz12.f142497o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C101754a80 a802 = new C101754a80();
                        if (bArr7 != null && bArr7.length > 0) {
                            a802.parseFrom(bArr7);
                        }
                        tz12.f142498p.add(a802);
                    }
                    return 0;
                case 12:
                    tz12.f142499q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    tz12.f142500r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    tz12.f142501s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C101754a80 a803 = new C101754a80();
                        if (bArr8 != null && bArr8.length > 0) {
                            a803.parseFrom(bArr8);
                        }
                        tz12.f142502t.add(a803);
                    }
                    return 0;
                case 16:
                    tz12.f142503u = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C50367m80 m802 = new C50367m80();
                        if (bArr9 != null && bArr9.length > 0) {
                            m802.parseFrom(bArr9);
                        }
                        tz12.f142504v.add(m802);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
