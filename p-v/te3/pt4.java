package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class pt4 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f139972d;

    /* renamed from: e */
    public String f139973e;

    /* renamed from: f */
    public int f139974f;

    /* renamed from: g */
    public int f139975g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pt4)) {
            return false;
        }
        pt4 pt4 = (pt4) aVar;
        return C46238a.m51546a(this.f139972d, pt4.f139972d) && C46238a.m51546a(this.f139973e, pt4.f139973e) && C46238a.m51546a(Integer.valueOf(this.f139974f), Integer.valueOf(pt4.f139974f)) && C46238a.m51546a(Integer.valueOf(this.f139975g), Integer.valueOf(pt4.f139975g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f139972d;
            if (qv32 != null) {
                if (qv32 != null) {
                    aVar.mo74322i(1, qv32.computeSize());
                    this.f139972d.writeFields(aVar);
                }
                String str = this.f139973e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f139974f);
                aVar.mo74318e(4, this.f139975g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Text");
        } else if (i == 1) {
            C51018qv3 qv33 = this.f139972d;
            if (qv33 != null) {
                i2 = 0 + C52418a.m58682i(1, qv33.computeSize());
            }
            String str2 = this.f139973e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f139974f) + C52418a.m58678e(4, this.f139975g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139972d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Text");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            pt4 pt4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    pt4.f139972d = qv34;
                }
                return 0;
            } else if (intValue == 2) {
                pt4.f139973e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pt4.f139974f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pt4.f139975g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
