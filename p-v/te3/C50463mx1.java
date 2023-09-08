package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mx1 */
public class C50463mx1 extends C47465a {

    /* renamed from: d */
    public C48892bq f138266d;

    /* renamed from: e */
    public String f138267e;

    /* renamed from: f */
    public String f138268f;

    /* renamed from: g */
    public boolean f138269g;

    /* renamed from: h */
    public int f138270h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50463mx1)) {
            return false;
        }
        C50463mx1 mx12 = (C50463mx1) aVar;
        return C46238a.m51546a(this.f138266d, mx12.f138266d) && C46238a.m51546a(this.f138267e, mx12.f138267e) && C46238a.m51546a(this.f138268f, mx12.f138268f) && C46238a.m51546a(Boolean.valueOf(this.f138269g), Boolean.valueOf(mx12.f138269g)) && C46238a.m51546a(Integer.valueOf(this.f138270h), Integer.valueOf(mx12.f138270h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48892bq bqVar = this.f138266d;
            if (bqVar != null) {
                aVar.mo74322i(1, bqVar.computeSize());
                this.f138266d.writeFields(aVar);
            }
            String str = this.f138267e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138268f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f138269g);
            aVar.mo74318e(5, this.f138270h);
            return 0;
        } else if (i == 1) {
            C48892bq bqVar2 = this.f138266d;
            if (bqVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, bqVar2.computeSize());
            }
            String str3 = this.f138267e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138268f;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58674a(4, this.f138269g) + C52418a.m58678e(5, this.f138270h);
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
            C50463mx1 mx12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48892bq bqVar3 = new C48892bq();
                    if (bArr != null && bArr.length > 0) {
                        bqVar3.parseFrom(bArr);
                    }
                    mx12.f138266d = bqVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mx12.f138267e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mx12.f138268f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                mx12.f138269g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mx12.f138270h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
