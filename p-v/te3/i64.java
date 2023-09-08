package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class i64 extends C101820nt3 {

    /* renamed from: d */
    public long f135129d;

    /* renamed from: e */
    public int f135130e;

    /* renamed from: f */
    public C51018qv3 f135131f;

    /* renamed from: g */
    public int f135132g;

    /* renamed from: h */
    public C51018qv3 f135133h;

    /* renamed from: i */
    public int f135134i;

    /* renamed from: j */
    public C52156yq3 f135135j;

    /* renamed from: n */
    public int f135136n;

    /* renamed from: o */
    public int f135137o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i64)) {
            return false;
        }
        i64 i64 = (i64) aVar;
        return C46238a.m51546a(this.BaseRequest, i64.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f135129d), Long.valueOf(i64.f135129d)) && C46238a.m51546a(Integer.valueOf(this.f135130e), Integer.valueOf(i64.f135130e)) && C46238a.m51546a(this.f135131f, i64.f135131f) && C46238a.m51546a(Integer.valueOf(this.f135132g), Integer.valueOf(i64.f135132g)) && C46238a.m51546a(this.f135133h, i64.f135133h) && C46238a.m51546a(Integer.valueOf(this.f135134i), Integer.valueOf(i64.f135134i)) && C46238a.m51546a(this.f135135j, i64.f135135j) && C46238a.m51546a(Integer.valueOf(this.f135136n), Integer.valueOf(i64.f135136n)) && C46238a.m51546a(Integer.valueOf(this.f135137o), Integer.valueOf(i64.f135137o));
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
            aVar.mo74321h(2, this.f135129d);
            aVar.mo74318e(3, this.f135130e);
            C51018qv3 qv32 = this.f135131f;
            if (qv32 != null) {
                aVar.mo74322i(4, qv32.computeSize());
                this.f135131f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f135132g);
            C51018qv3 qv33 = this.f135133h;
            if (qv33 != null) {
                aVar.mo74322i(6, qv33.computeSize());
                this.f135133h.writeFields(aVar);
            }
            aVar.mo74318e(7, this.f135134i);
            C52156yq3 yq32 = this.f135135j;
            if (yq32 != null) {
                aVar.mo74322i(8, yq32.computeSize());
                this.f135135j.writeFields(aVar);
            }
            aVar.mo74318e(9, this.f135136n);
            aVar.mo74318e(10, this.f135137o);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f135129d) + C52418a.m58678e(3, this.f135130e);
            C51018qv3 qv34 = this.f135131f;
            if (qv34 != null) {
                h += C52418a.m58682i(4, qv34.computeSize());
            }
            int e = h + C52418a.m58678e(5, this.f135132g);
            C51018qv3 qv35 = this.f135133h;
            if (qv35 != null) {
                e += C52418a.m58682i(6, qv35.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f135134i);
            C52156yq3 yq33 = this.f135135j;
            if (yq33 != null) {
                e2 += C52418a.m58682i(8, yq33.computeSize());
            }
            return e2 + C52418a.m58678e(9, this.f135136n) + C52418a.m58678e(10, this.f135137o);
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
            i64 i64 = objArr[1];
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
                        i64.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    i64.f135129d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    i64.f135130e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv36.mo73348f(bArr2);
                        }
                        i64.f135131f = qv36;
                    }
                    return 0;
                case 5:
                    i64.f135132g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv37.mo73348f(bArr3);
                        }
                        i64.f135133h = qv37;
                    }
                    return 0;
                case 7:
                    i64.f135134i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C52156yq3 yq34 = new C52156yq3();
                        if (bArr4 != null && bArr4.length > 0) {
                            yq34.parseFrom(bArr4);
                        }
                        i64.f135135j = yq34;
                    }
                    return 0;
                case 9:
                    i64.f135136n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    i64.f135137o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
