package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class by4 extends C47465a {

    /* renamed from: d */
    public String f131395d;

    /* renamed from: e */
    public C51018qv3 f131396e;

    /* renamed from: f */
    public String f131397f;

    /* renamed from: g */
    public C51018qv3 f131398g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof by4)) {
            return false;
        }
        by4 by4 = (by4) aVar;
        return C46238a.m51546a(this.f131395d, by4.f131395d) && C46238a.m51546a(this.f131396e, by4.f131396e) && C46238a.m51546a(this.f131397f, by4.f131397f) && C46238a.m51546a(this.f131398g, by4.f131398g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f131396e == null) {
                throw new C52419b("Not all required fields were included: KSid");
            } else if (this.f131398g != null) {
                String str = this.f131395d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C51018qv3 qv32 = this.f131396e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f131396e.writeFields(aVar);
                }
                String str2 = this.f131397f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                C51018qv3 qv33 = this.f131398g;
                if (qv33 != null) {
                    aVar.mo74322i(4, qv33.computeSize());
                    this.f131398g.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i == 1) {
            String str3 = this.f131395d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C51018qv3 qv34 = this.f131396e;
            if (qv34 != null) {
                i2 += C52418a.m58682i(2, qv34.computeSize());
            }
            String str4 = this.f131397f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            C51018qv3 qv35 = this.f131398g;
            return qv35 != null ? i2 + C52418a.m58682i(4, qv35.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f131396e == null) {
                throw new C52419b("Not all required fields were included: KSid");
            } else if (this.f131398g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            by4 by4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                by4.f131395d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv36.mo73348f(bArr);
                    }
                    by4.f131396e = qv36;
                }
                return 0;
            } else if (intValue == 3) {
                by4.f131397f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv37.mo73348f(bArr2);
                    }
                    by4.f131398g = qv37;
                }
                return 0;
            }
        }
    }
}
