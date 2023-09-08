package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import x14.C102536a;
import z14.C53733a;

public class oq4 extends C101820nt3 {

    /* renamed from: d */
    public int f139319d;

    /* renamed from: e */
    public int f139320e;

    /* renamed from: f */
    public LinkedList<lq4> f139321f = new LinkedList<>();

    /* renamed from: g */
    public String f139322g;

    /* renamed from: h */
    public int f139323h;

    /* renamed from: i */
    public LinkedList<Integer> f139324i = new LinkedList<>();

    /* renamed from: j */
    public int f139325j;

    /* renamed from: n */
    public LinkedList<nq4> f139326n = new LinkedList<>();

    /* renamed from: o */
    public C51018qv3 f139327o;

    /* renamed from: p */
    public C51018qv3 f139328p;

    /* renamed from: q */
    public int f139329q;

    /* renamed from: r */
    public String f139330r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oq4)) {
            return false;
        }
        oq4 oq4 = (oq4) aVar;
        return C46238a.m51546a(this.BaseRequest, oq4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139319d), Integer.valueOf(oq4.f139319d)) && C46238a.m51546a(Integer.valueOf(this.f139320e), Integer.valueOf(oq4.f139320e)) && C46238a.m51546a(this.f139321f, oq4.f139321f) && C46238a.m51546a(this.f139322g, oq4.f139322g) && C46238a.m51546a(Integer.valueOf(this.f139323h), Integer.valueOf(oq4.f139323h)) && C46238a.m51546a(this.f139324i, oq4.f139324i) && C46238a.m51546a(Integer.valueOf(this.f139325j), Integer.valueOf(oq4.f139325j)) && C46238a.m51546a(this.f139326n, oq4.f139326n) && C46238a.m51546a(this.f139327o, oq4.f139327o) && C46238a.m51546a(this.f139328p, oq4.f139328p) && C46238a.m51546a(Integer.valueOf(this.f139329q), Integer.valueOf(oq4.f139329q)) && C46238a.m51546a(this.f139330r, oq4.f139330r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f139319d);
            aVar.mo74318e(3, this.f139320e);
            aVar.mo74320g(4, 8, this.f139321f);
            String str = this.f139322g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            aVar.mo74318e(6, this.f139323h);
            aVar.mo74324k(7, 2, this.f139324i);
            aVar.mo74318e(8, this.f139325j);
            aVar.mo74320g(9, 8, this.f139326n);
            C51018qv3 qv32 = this.f139327o;
            if (qv32 != null) {
                aVar.mo74322i(10, qv32.computeSize());
                this.f139327o.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f139328p;
            if (qv33 != null) {
                aVar.mo74322i(11, qv33.computeSize());
                this.f139328p.writeFields(aVar);
            }
            aVar.mo74318e(12, this.f139329q);
            String str2 = this.f139330r;
            if (str2 == null) {
                return 0;
            }
            aVar.mo74323j(13, str2);
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = (iaVar2 != null ? 0 + C52418a.m58682i(1, iaVar2.computeSize()) : 0) + C52418a.m58678e(2, this.f139319d) + C52418a.m58678e(3, this.f139320e) + C52418a.m58680g(4, 8, this.f139321f);
            String str3 = this.f139322g;
            if (str3 != null) {
                i3 += C52418a.m58683j(5, str3);
            }
            int e = i3 + C52418a.m58678e(6, this.f139323h) + C52418a.m58684k(7, 2, this.f139324i) + C52418a.m58678e(8, this.f139325j) + C52418a.m58680g(9, 8, this.f139326n);
            C51018qv3 qv34 = this.f139327o;
            if (qv34 != null) {
                e += C52418a.m58682i(10, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f139328p;
            if (qv35 != null) {
                e += C52418a.m58682i(11, qv35.computeSize());
            }
            int e2 = e + C52418a.m58678e(12, this.f139329q);
            String str4 = this.f139330r;
            return str4 != null ? e2 + C52418a.m58683j(13, str4) : e2;
        } else if (i2 == 2) {
            this.f139321f.clear();
            this.f139324i.clear();
            this.f139326n.clear();
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
            oq4 oq4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        oq4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    oq4.f139319d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oq4.f139320e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        lq4 lq4 = new lq4();
                        if (bArr2 != null && bArr2.length > 0) {
                            lq4.parseFrom(bArr2);
                        }
                        oq4.f139321f.add(lq4);
                    }
                    return 0;
                case 5:
                    oq4.f139322g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oq4.f139323h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    byte[] bArr3 = aVar3.mo141626d(intValue).f257327a;
                    C102536a aVar4 = new C102536a(bArr3, 0, bArr3.length);
                    LinkedList<Integer> linkedList = new LinkedList<>();
                    while (aVar4.f301908c < aVar4.f301907b) {
                        linkedList.add(Integer.valueOf(aVar4.mo142153f()));
                    }
                    oq4.f139324i = linkedList;
                    return 0;
                case 8:
                    oq4.f139325j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr4 = j3.get(i6);
                        nq4 nq4 = new nq4();
                        if (bArr4 != null && bArr4.length > 0) {
                            nq4.parseFrom(bArr4);
                        }
                        oq4.f139326n.add(nq4);
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr5 = j4.get(i7);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv36.mo73348f(bArr5);
                        }
                        oq4.f139327o = qv36;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr6 = j5.get(i8);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv37.mo73348f(bArr6);
                        }
                        oq4.f139328p = qv37;
                    }
                    return 0;
                case 12:
                    oq4.f139329q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    oq4.f139330r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
