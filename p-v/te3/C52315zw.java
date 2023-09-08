package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zw */
public class C52315zw extends C47465a {

    /* renamed from: d */
    public int f146244d;

    /* renamed from: e */
    public C51018qv3 f146245e;

    /* renamed from: f */
    public int f146246f;

    /* renamed from: g */
    public C51018qv3 f146247g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52315zw)) {
            return false;
        }
        C52315zw zwVar = (C52315zw) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146244d), Integer.valueOf(zwVar.f146244d)) && C46238a.m51546a(this.f146245e, zwVar.f146245e) && C46238a.m51546a(Integer.valueOf(this.f146246f), Integer.valueOf(zwVar.f146246f)) && C46238a.m51546a(this.f146247g, zwVar.f146247g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f146245e != null) {
                aVar.mo74318e(1, this.f146244d);
                C51018qv3 qv32 = this.f146245e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f146245e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f146246f);
                C51018qv3 qv33 = this.f146247g;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f146247g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: OperationInfo");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f146244d) + 0;
            C51018qv3 qv34 = this.f146245e;
            if (qv34 != null) {
                e += C52418a.m58682i(2, qv34.computeSize());
            }
            int e2 = e + C52418a.m58678e(3, this.f146246f);
            C51018qv3 qv35 = this.f146247g;
            return qv35 != null ? e2 + C52418a.m58682i(4, qv35.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146245e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: OperationInfo");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52315zw zwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zwVar.f146244d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv36.mo73348f(bArr);
                    }
                    zwVar.f146245e = qv36;
                }
                return 0;
            } else if (intValue == 3) {
                zwVar.f146246f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv37.mo73348f(bArr2);
                    }
                    zwVar.f146247g = qv37;
                }
                return 0;
            }
        }
    }
}
