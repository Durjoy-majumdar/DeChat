package te3;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.an1 */
public class C64233an1 extends C49335eu3 {

    /* renamed from: d */
    public C51024qx f182083d;

    /* renamed from: e */
    public int f182084e;

    /* renamed from: f */
    public C51018qv3 f182085f;

    /* renamed from: g */
    public LinkedList<FinderContact> f182086g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<FinderContact> f182087h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C50401mh0> f182088i = new LinkedList<>();

    /* renamed from: j */
    public int f182089j;

    /* renamed from: n */
    public C64259bh0 f182090n;

    /* renamed from: o */
    public C64517l90 f182091o;

    /* renamed from: p */
    public C89349b f182092p;

    /* renamed from: q */
    public C52252ze1 f182093q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64233an1)) {
            return false;
        }
        C64233an1 an12 = (C64233an1) aVar;
        return C46238a.m51546a(this.BaseResponse, an12.BaseResponse) && C46238a.m51546a(this.f182083d, an12.f182083d) && C46238a.m51546a(Integer.valueOf(this.f182084e), Integer.valueOf(an12.f182084e)) && C46238a.m51546a(this.f182085f, an12.f182085f) && C46238a.m51546a(this.f182086g, an12.f182086g) && C46238a.m51546a(this.f182087h, an12.f182087h) && C46238a.m51546a(this.f182088i, an12.f182088i) && C46238a.m51546a(Integer.valueOf(this.f182089j), Integer.valueOf(an12.f182089j)) && C46238a.m51546a(this.f182090n, an12.f182090n) && C46238a.m51546a(this.f182091o, an12.f182091o) && C46238a.m51546a(this.f182092p, an12.f182092p) && C46238a.m51546a(this.f182093q, an12.f182093q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            C51024qx qxVar = this.f182083d;
            if (qxVar != null) {
                aVar.mo74322i(2, qxVar.computeSize());
                this.f182083d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f182084e);
            C51018qv3 qv32 = this.f182085f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f182085f.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f182086g);
            aVar.mo74320g(6, 8, this.f182087h);
            aVar.mo74320g(7, 8, this.f182088i);
            aVar.mo74318e(8, this.f182089j);
            C64259bh0 bh02 = this.f182090n;
            if (bh02 != null) {
                aVar.mo74322i(9, bh02.computeSize());
                this.f182090n.writeFields(aVar);
            }
            C64517l90 l902 = this.f182091o;
            if (l902 != null) {
                aVar.mo74322i(10, l902.computeSize());
                this.f182091o.writeFields(aVar);
            }
            C89349b bVar = this.f182092p;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            C52252ze1 ze12 = this.f182093q;
            if (ze12 != null) {
                aVar.mo74322i(12, ze12.computeSize());
                this.f182093q.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51024qx qxVar2 = this.f182083d;
            if (qxVar2 != null) {
                i2 += C52418a.m58682i(2, qxVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f182084e);
            C51018qv3 qv33 = this.f182085f;
            if (qv33 != null) {
                e += C52418a.m58682i(4, qv33.computeSize());
            }
            int g = e + C52418a.m58680g(5, 8, this.f182086g) + C52418a.m58680g(6, 8, this.f182087h) + C52418a.m58680g(7, 8, this.f182088i) + C52418a.m58678e(8, this.f182089j);
            C64259bh0 bh03 = this.f182090n;
            if (bh03 != null) {
                g += C52418a.m58682i(9, bh03.computeSize());
            }
            C64517l90 l903 = this.f182091o;
            if (l903 != null) {
                g += C52418a.m58682i(10, l903.computeSize());
            }
            C89349b bVar2 = this.f182092p;
            if (bVar2 != null) {
                g += C52418a.m58675b(11, bVar2);
            }
            C52252ze1 ze13 = this.f182093q;
            return ze13 != null ? g + C52418a.m58682i(12, ze13.computeSize()) : g;
        } else if (i == 2) {
            this.f182086g.clear();
            this.f182087h.clear();
            this.f182088i.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64233an1 an12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        an12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51024qx qxVar3 = new C51024qx();
                        if (bArr2 != null && bArr2.length > 0) {
                            qxVar3.parseFrom(bArr2);
                        }
                        an12.f182083d = qxVar3;
                    }
                    return 0;
                case 3:
                    an12.f182084e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv34.mo73348f(bArr3);
                        }
                        an12.f182085f = qv34;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        FinderContact finderContact = new FinderContact();
                        if (bArr4 != null && bArr4.length > 0) {
                            finderContact.parseFrom(bArr4);
                        }
                        an12.f182086g.add(finderContact);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        FinderContact finderContact2 = new FinderContact();
                        if (bArr5 != null && bArr5.length > 0) {
                            finderContact2.parseFrom(bArr5);
                        }
                        an12.f182087h.add(finderContact2);
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C50401mh0 mh02 = new C50401mh0();
                        if (bArr6 != null && bArr6.length > 0) {
                            mh02.parseFrom(bArr6);
                        }
                        an12.f182088i.add(mh02);
                    }
                    return 0;
                case 8:
                    an12.f182089j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C64259bh0 bh04 = new C64259bh0();
                        if (bArr7 != null && bArr7.length > 0) {
                            bh04.parseFrom(bArr7);
                        }
                        an12.f182090n = bh04;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        byte[] bArr8 = j8.get(i15);
                        C64517l90 l904 = new C64517l90();
                        if (bArr8 != null && bArr8.length > 0) {
                            l904.parseFrom(bArr8);
                        }
                        an12.f182091o = l904;
                    }
                    return 0;
                case 11:
                    an12.f182092p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i16 = 0; i16 < size9; i16++) {
                        byte[] bArr9 = j9.get(i16);
                        C52252ze1 ze14 = new C52252ze1();
                        if (bArr9 != null && bArr9.length > 0) {
                            ze14.parseFrom(bArr9);
                        }
                        an12.f182093q = ze14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
