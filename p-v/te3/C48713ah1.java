package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ah1 */
public class C48713ah1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f130513d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f130514e;

    /* renamed from: f */
    public int f130515f;

    /* renamed from: g */
    public z74 f130516g;

    /* renamed from: h */
    public FinderContact f130517h;

    /* renamed from: i */
    public String f130518i;

    /* renamed from: j */
    public int f130519j;

    /* renamed from: n */
    public int f130520n;

    /* renamed from: o */
    public C51824we3 f130521o;

    /* renamed from: p */
    public int f130522p;

    /* renamed from: q */
    public C49003ch1 f130523q;

    /* renamed from: r */
    public int f130524r;

    /* renamed from: s */
    public int f130525s;

    /* renamed from: t */
    public int f130526t;

    /* renamed from: u */
    public C52113yg1 f130527u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48713ah1)) {
            return false;
        }
        C48713ah1 ah12 = (C48713ah1) aVar;
        return C46238a.m51546a(this.BaseResponse, ah12.BaseResponse) && C46238a.m51546a(this.f130513d, ah12.f130513d) && C46238a.m51546a(this.f130514e, ah12.f130514e) && C46238a.m51546a(Integer.valueOf(this.f130515f), Integer.valueOf(ah12.f130515f)) && C46238a.m51546a(this.f130516g, ah12.f130516g) && C46238a.m51546a(this.f130517h, ah12.f130517h) && C46238a.m51546a(this.f130518i, ah12.f130518i) && C46238a.m51546a(Integer.valueOf(this.f130519j), Integer.valueOf(ah12.f130519j)) && C46238a.m51546a(Integer.valueOf(this.f130520n), Integer.valueOf(ah12.f130520n)) && C46238a.m51546a(this.f130521o, ah12.f130521o) && C46238a.m51546a(Integer.valueOf(this.f130522p), Integer.valueOf(ah12.f130522p)) && C46238a.m51546a(this.f130523q, ah12.f130523q) && C46238a.m51546a(Integer.valueOf(this.f130524r), Integer.valueOf(ah12.f130524r)) && C46238a.m51546a(Integer.valueOf(this.f130525s), Integer.valueOf(ah12.f130525s)) && C46238a.m51546a(Integer.valueOf(this.f130526t), Integer.valueOf(ah12.f130526t)) && C46238a.m51546a(this.f130527u, ah12.f130527u);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f130513d);
            C89349b bVar = this.f130514e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f130515f);
            z74 z74 = this.f130516g;
            if (z74 != null) {
                aVar.mo74322i(5, z74.computeSize());
                this.f130516g.writeFields(aVar);
            }
            FinderContact finderContact = this.f130517h;
            if (finderContact != null) {
                aVar.mo74322i(6, finderContact.computeSize());
                this.f130517h.writeFields(aVar);
            }
            String str = this.f130518i;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            aVar.mo74318e(8, this.f130519j);
            aVar.mo74318e(9, this.f130520n);
            C51824we3 we32 = this.f130521o;
            if (we32 != null) {
                aVar.mo74322i(10, we32.computeSize());
                this.f130521o.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f130522p);
            C49003ch1 ch12 = this.f130523q;
            if (ch12 != null) {
                aVar.mo74322i(13, ch12.computeSize());
                this.f130523q.writeFields(aVar);
            }
            aVar.mo74318e(14, this.f130524r);
            aVar.mo74318e(15, this.f130525s);
            aVar.mo74318e(16, this.f130526t);
            C52113yg1 yg12 = this.f130527u;
            if (yg12 != null) {
                aVar.mo74322i(17, yg12.computeSize());
                this.f130527u.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f130513d);
            C89349b bVar2 = this.f130514e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f130515f);
            z74 z742 = this.f130516g;
            if (z742 != null) {
                e += C52418a.m58682i(5, z742.computeSize());
            }
            FinderContact finderContact2 = this.f130517h;
            if (finderContact2 != null) {
                e += C52418a.m58682i(6, finderContact2.computeSize());
            }
            String str2 = this.f130518i;
            if (str2 != null) {
                e += C52418a.m58683j(7, str2);
            }
            int e2 = e + C52418a.m58678e(8, this.f130519j) + C52418a.m58678e(9, this.f130520n);
            C51824we3 we33 = this.f130521o;
            if (we33 != null) {
                e2 += C52418a.m58682i(10, we33.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(12, this.f130522p);
            C49003ch1 ch13 = this.f130523q;
            if (ch13 != null) {
                e3 += C52418a.m58682i(13, ch13.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(14, this.f130524r) + C52418a.m58678e(15, this.f130525s) + C52418a.m58678e(16, this.f130526t);
            C52113yg1 yg13 = this.f130527u;
            return yg13 != null ? e4 + C52418a.m58682i(17, yg13.computeSize()) : e4;
        } else if (i2 == 2) {
            this.f130513d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48713ah1 ah12 = objArr[1];
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
                        ah12.BaseResponse = jaVar3;
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
                        ah12.f130513d.add(finderObject);
                    }
                    return 0;
                case 3:
                    ah12.f130514e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    ah12.f130515f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        z74 z743 = new z74();
                        if (bArr3 != null && bArr3.length > 0) {
                            z743.parseFrom(bArr3);
                        }
                        ah12.f130516g = z743;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        FinderContact finderContact3 = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact3.parseFrom(bArr4);
                        }
                        ah12.f130517h = finderContact3;
                    }
                    return 0;
                case 7:
                    ah12.f130518i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ah12.f130519j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ah12.f130520n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51824we3 we34 = new C51824we3();
                        if (bArr5 != null && bArr5.length > 0) {
                            we34.parseFrom(bArr5);
                        }
                        ah12.f130521o = we34;
                    }
                    return 0;
                case 12:
                    ah12.f130522p = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C49003ch1 ch14 = new C49003ch1();
                        if (bArr6 != null && bArr6.length > 0) {
                            ch14.parseFrom(bArr6);
                        }
                        ah12.f130523q = ch14;
                    }
                    return 0;
                case 14:
                    ah12.f130524r = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    ah12.f130525s = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    ah12.f130526t = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C52113yg1 yg14 = new C52113yg1();
                        if (bArr7 != null && bArr7.length > 0) {
                            yg14.parseFrom(bArr7);
                        }
                        ah12.f130527u = yg14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
