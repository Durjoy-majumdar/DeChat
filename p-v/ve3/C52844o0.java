package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.o0 */
public class C52844o0 extends C47465a {

    /* renamed from: d */
    public String f147612d;

    /* renamed from: e */
    public C52846p0 f147613e;

    /* renamed from: f */
    public long f147614f;

    /* renamed from: g */
    public String f147615g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52844o0)) {
            return false;
        }
        C52844o0 o0Var = (C52844o0) aVar;
        return C46238a.m51546a(this.f147612d, o0Var.f147612d) && C46238a.m51546a(this.f147613e, o0Var.f147613e) && C46238a.m51546a(Long.valueOf(this.f147614f), Long.valueOf(o0Var.f147614f)) && C46238a.m51546a(this.f147615g, o0Var.f147615g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147612d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C52846p0 p0Var = this.f147613e;
            if (p0Var != null) {
                aVar.mo74322i(2, p0Var.computeSize());
                this.f147613e.writeFields(aVar);
            }
            aVar.mo74321h(3, this.f147614f);
            String str2 = this.f147615g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f147612d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C52846p0 p0Var2 = this.f147613e;
            if (p0Var2 != null) {
                i2 += C52418a.m58682i(2, p0Var2.computeSize());
            }
            int h = i2 + C52418a.m58681h(3, this.f147614f);
            String str4 = this.f147615g;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C52844o0 o0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o0Var.f147612d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52846p0 p0Var3 = new C52846p0();
                    if (bArr != null && bArr.length > 0) {
                        p0Var3.parseFrom(bArr);
                    }
                    o0Var.f147613e = p0Var3;
                }
                return 0;
            } else if (intValue == 3) {
                o0Var.f147614f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o0Var.f147615g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
