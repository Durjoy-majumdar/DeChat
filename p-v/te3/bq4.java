package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bq4 extends C101820nt3 {

    /* renamed from: d */
    public int f131261d;

    /* renamed from: e */
    public String f131262e;

    /* renamed from: f */
    public String f131263f;

    /* renamed from: g */
    public C51163rv3 f131264g;

    /* renamed from: h */
    public C51163rv3 f131265h;

    /* renamed from: i */
    public C51163rv3 f131266i;

    /* renamed from: j */
    public C51018qv3 f131267j;

    /* renamed from: n */
    public int f131268n;

    /* renamed from: o */
    public C51018qv3 f131269o;

    /* renamed from: p */
    public C51018qv3 f131270p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bq4)) {
            return false;
        }
        bq4 bq4 = (bq4) aVar;
        return C46238a.m51546a(this.BaseRequest, bq4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f131261d), Integer.valueOf(bq4.f131261d)) && C46238a.m51546a(this.f131262e, bq4.f131262e) && C46238a.m51546a(this.f131263f, bq4.f131263f) && C46238a.m51546a(this.f131264g, bq4.f131264g) && C46238a.m51546a(this.f131265h, bq4.f131265h) && C46238a.m51546a(this.f131266i, bq4.f131266i) && C46238a.m51546a(this.f131267j, bq4.f131267j) && C46238a.m51546a(Integer.valueOf(this.f131268n), Integer.valueOf(bq4.f131268n)) && C46238a.m51546a(this.f131269o, bq4.f131269o) && C46238a.m51546a(this.f131270p, bq4.f131270p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f131261d);
            String str = this.f131262e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f131263f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C51163rv3 rv32 = this.f131264g;
            if (rv32 != null) {
                aVar.mo74322i(5, rv32.computeSize());
                this.f131264g.writeFields(aVar);
            }
            C51163rv3 rv33 = this.f131265h;
            if (rv33 != null) {
                aVar.mo74322i(6, rv33.computeSize());
                this.f131265h.writeFields(aVar);
            }
            C51163rv3 rv34 = this.f131266i;
            if (rv34 != null) {
                aVar.mo74322i(7, rv34.computeSize());
                this.f131266i.writeFields(aVar);
            }
            C51018qv3 qv32 = this.f131267j;
            if (qv32 != null) {
                aVar.mo74322i(8, qv32.computeSize());
                this.f131267j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f131268n);
            C51018qv3 qv33 = this.f131269o;
            if (qv33 != null) {
                aVar.mo74322i(10, qv33.computeSize());
                this.f131269o.writeFields(aVar);
            }
            C51018qv3 qv34 = this.f131270p;
            if (qv34 != null) {
                aVar.mo74322i(11, qv34.computeSize());
                this.f131270p.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f131261d);
            String str3 = this.f131262e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f131263f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C51163rv3 rv35 = this.f131264g;
            if (rv35 != null) {
                e += C52418a.m58682i(5, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f131265h;
            if (rv36 != null) {
                e += C52418a.m58682i(6, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f131266i;
            if (rv37 != null) {
                e += C52418a.m58682i(7, rv37.computeSize());
            }
            C51018qv3 qv35 = this.f131267j;
            if (qv35 != null) {
                e += C52418a.m58682i(8, qv35.computeSize());
            }
            int e2 = e + C52418a.m58678e(9, this.f131268n);
            C51018qv3 qv36 = this.f131269o;
            if (qv36 != null) {
                e2 += C52418a.m58682i(10, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f131270p;
            return qv37 != null ? e2 + C52418a.m58682i(11, qv37.computeSize()) : e2;
        } else if (i == 2) {
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
            bq4 bq4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        bq4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    bq4.f131261d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bq4.f131262e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bq4.f131263f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv38.mo73356d(bArr2);
                        }
                        bq4.f131264g = rv38;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51163rv3 rv39 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv39.mo73356d(bArr3);
                        }
                        bq4.f131265h = rv39;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv310.mo73356d(bArr4);
                        }
                        bq4.f131266i = rv310;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51018qv3 qv38 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv38.mo73348f(bArr5);
                        }
                        bq4.f131267j = qv38;
                    }
                    return 0;
                case 9:
                    bq4.f131268n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        byte[] bArr6 = j6.get(i8);
                        C51018qv3 qv39 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv39.mo73348f(bArr6);
                        }
                        bq4.f131269o = qv39;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i9 = 0; i9 < size7; i9++) {
                        byte[] bArr7 = j7.get(i9);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv310.mo73348f(bArr7);
                        }
                        bq4.f131270p = qv310;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
