package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ji2 */
public class C49995ji2 extends C47465a {

    /* renamed from: d */
    public String f136133d;

    /* renamed from: e */
    public C77935gl2 f136134e;

    /* renamed from: f */
    public C77935gl2 f136135f;

    /* renamed from: g */
    public int f136136g;

    /* renamed from: h */
    public int f136137h;

    /* renamed from: i */
    public String f136138i;

    /* renamed from: j */
    public int f136139j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49995ji2)) {
            return false;
        }
        C49995ji2 ji22 = (C49995ji2) aVar;
        return C46238a.m51546a(this.f136133d, ji22.f136133d) && C46238a.m51546a(this.f136134e, ji22.f136134e) && C46238a.m51546a(this.f136135f, ji22.f136135f) && C46238a.m51546a(Integer.valueOf(this.f136136g), Integer.valueOf(ji22.f136136g)) && C46238a.m51546a(Integer.valueOf(this.f136137h), Integer.valueOf(ji22.f136137h)) && C46238a.m51546a(this.f136138i, ji22.f136138i) && C46238a.m51546a(Integer.valueOf(this.f136139j), Integer.valueOf(ji22.f136139j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136133d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C77935gl2 gl22 = this.f136134e;
            if (gl22 != null) {
                aVar.mo74322i(2, gl22.computeSize());
                this.f136134e.writeFields(aVar);
            }
            C77935gl2 gl23 = this.f136135f;
            if (gl23 != null) {
                aVar.mo74322i(3, gl23.computeSize());
                this.f136135f.writeFields(aVar);
            }
            aVar.mo74318e(4, this.f136136g);
            aVar.mo74318e(5, this.f136137h);
            String str2 = this.f136138i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f136139j);
            return 0;
        } else if (i == 1) {
            String str3 = this.f136133d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C77935gl2 gl24 = this.f136134e;
            if (gl24 != null) {
                i2 += C52418a.m58682i(2, gl24.computeSize());
            }
            C77935gl2 gl25 = this.f136135f;
            if (gl25 != null) {
                i2 += C52418a.m58682i(3, gl25.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f136136g) + C52418a.m58678e(5, this.f136137h);
            String str4 = this.f136138i;
            if (str4 != null) {
                e += C52418a.m58683j(6, str4);
            }
            return e + C52418a.m58678e(7, this.f136139j);
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
            C49995ji2 ji22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ji22.f136133d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77935gl2 gl26 = new C77935gl2();
                        if (bArr != null && bArr.length > 0) {
                            gl26.parseFrom(bArr);
                        }
                        ji22.f136134e = gl26;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77935gl2 gl27 = new C77935gl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            gl27.parseFrom(bArr2);
                        }
                        ji22.f136135f = gl27;
                    }
                    return 0;
                case 4:
                    ji22.f136136g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ji22.f136137h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ji22.f136138i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ji22.f136139j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
