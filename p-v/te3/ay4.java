package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ay4 extends C47465a {

    /* renamed from: d */
    public String f297890d;

    /* renamed from: e */
    public String f297891e;

    /* renamed from: f */
    public String f297892f;

    /* renamed from: g */
    public C51018qv3 f297893g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ay4)) {
            return false;
        }
        ay4 ay4 = (ay4) aVar;
        return C46238a.m51546a(this.f297890d, ay4.f297890d) && C46238a.m51546a(this.f297891e, ay4.f297891e) && C46238a.m51546a(this.f297892f, ay4.f297892f) && C46238a.m51546a(this.f297893g, ay4.f297893g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f297893g != null) {
                String str = this.f297890d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f297891e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f297892f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                C51018qv3 qv32 = this.f297893g;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f297893g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: KSid");
        } else if (i == 1) {
            String str4 = this.f297890d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f297891e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f297892f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            C51018qv3 qv33 = this.f297893g;
            return qv33 != null ? i2 + C52418a.m58682i(4, qv33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f297893g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: KSid");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ay4 ay4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ay4.f297890d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ay4.f297891e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ay4.f297892f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    ay4.f297893g = qv34;
                }
                return 0;
            }
        }
    }
}
