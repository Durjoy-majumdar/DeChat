package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m7 */
public class C64545m7 extends C47465a {

    /* renamed from: d */
    public String f184209d;

    /* renamed from: e */
    public String f184210e;

    /* renamed from: f */
    public String f184211f;

    /* renamed from: g */
    public String f184212g;

    /* renamed from: h */
    public C64570n7 f184213h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64545m7)) {
            return false;
        }
        C64545m7 m7Var = (C64545m7) aVar;
        return C46238a.m51546a(this.f184209d, m7Var.f184209d) && C46238a.m51546a(this.f184210e, m7Var.f184210e) && C46238a.m51546a(this.f184211f, m7Var.f184211f) && C46238a.m51546a(this.f184212g, m7Var.f184212g) && C46238a.m51546a(this.f184213h, m7Var.f184213h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184213h != null) {
                String str = this.f184209d;
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f184210e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f184211f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                String str4 = this.f184212g;
                if (str4 != null) {
                    aVar.mo74323j(4, str4);
                }
                C64570n7 n7Var = this.f184213h;
                if (n7Var != null) {
                    aVar.mo74322i(5, n7Var.computeSize());
                    this.f184213h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ArtisIcon");
        } else if (i == 1) {
            String str5 = this.f184209d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f184210e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f184211f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f184212g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            C64570n7 n7Var2 = this.f184213h;
            return n7Var2 != null ? i2 + C52418a.m58682i(5, n7Var2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184213h != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ArtisIcon");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64545m7 m7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m7Var.f184209d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                m7Var.f184210e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m7Var.f184211f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                m7Var.f184212g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64570n7 n7Var3 = new C64570n7();
                    if (bArr != null && bArr.length > 0) {
                        n7Var3.parseFrom(bArr);
                    }
                    m7Var.f184213h = n7Var3;
                }
                return 0;
            }
        }
    }
}
