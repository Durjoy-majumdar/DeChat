package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yq3 */
public class C52156yq3 extends C47465a {

    /* renamed from: d */
    public int f145465d;

    /* renamed from: e */
    public C51018qv3 f145466e;

    /* renamed from: f */
    public C51018qv3 f145467f;

    /* renamed from: g */
    public C51018qv3 f145468g;

    /* renamed from: h */
    public C51018qv3 f145469h;

    /* renamed from: i */
    public long f145470i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52156yq3)) {
            return false;
        }
        C52156yq3 yq32 = (C52156yq3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145465d), Integer.valueOf(yq32.f145465d)) && C46238a.m51546a(this.f145466e, yq32.f145466e) && C46238a.m51546a(this.f145467f, yq32.f145467f) && C46238a.m51546a(this.f145468g, yq32.f145468g) && C46238a.m51546a(this.f145469h, yq32.f145469h) && C46238a.m51546a(Long.valueOf(this.f145470i), Long.valueOf(yq32.f145470i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145465d);
            C51018qv3 qv32 = this.f145466e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f145466e.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f145467f;
            if (qv33 != null) {
                aVar.mo74322i(3, qv33.computeSize());
                this.f145467f.writeFields(aVar);
            }
            C51018qv3 qv34 = this.f145468g;
            if (qv34 != null) {
                aVar.mo74322i(4, qv34.computeSize());
                this.f145468g.writeFields(aVar);
            }
            C51018qv3 qv35 = this.f145469h;
            if (qv35 != null) {
                aVar.mo74322i(5, qv35.computeSize());
                this.f145469h.writeFields(aVar);
            }
            aVar.mo74321h(6, this.f145470i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145465d) + 0;
            C51018qv3 qv36 = this.f145466e;
            if (qv36 != null) {
                e += C52418a.m58682i(2, qv36.computeSize());
            }
            C51018qv3 qv37 = this.f145467f;
            if (qv37 != null) {
                e += C52418a.m58682i(3, qv37.computeSize());
            }
            C51018qv3 qv38 = this.f145468g;
            if (qv38 != null) {
                e += C52418a.m58682i(4, qv38.computeSize());
            }
            C51018qv3 qv39 = this.f145469h;
            if (qv39 != null) {
                e += C52418a.m58682i(5, qv39.computeSize());
            }
            return e + C52418a.m58681h(6, this.f145470i);
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
            C52156yq3 yq32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yq32.f145465d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51018qv3 qv310 = new C51018qv3();
                        if (bArr != null && bArr.length > 0) {
                            qv310.mo73348f(bArr);
                        }
                        yq32.f145466e = qv310;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51018qv3 qv311 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv311.mo73348f(bArr2);
                        }
                        yq32.f145467f = qv311;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            qv312.mo73348f(bArr3);
                        }
                        yq32.f145468g = qv312;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv313.mo73348f(bArr4);
                        }
                        yq32.f145469h = qv313;
                    }
                    return 0;
                case 6:
                    yq32.f145470i = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
