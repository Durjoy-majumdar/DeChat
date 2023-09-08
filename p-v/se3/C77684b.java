package se3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: se3.b */
public class C77684b extends C47465a {

    /* renamed from: d */
    public int f226455d;

    /* renamed from: e */
    public String f226456e;

    /* renamed from: f */
    public String f226457f;

    /* renamed from: g */
    public LinkedList<C77683a> f226458g = new LinkedList<>();

    /* renamed from: h */
    public int f226459h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77684b)) {
            return false;
        }
        C77684b bVar = (C77684b) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f226455d), Integer.valueOf(bVar.f226455d)) && C46238a.m51546a(this.f226456e, bVar.f226456e) && C46238a.m51546a(this.f226457f, bVar.f226457f) && C46238a.m51546a(this.f226458g, bVar.f226458g) && C46238a.m51546a(Integer.valueOf(this.f226459h), Integer.valueOf(bVar.f226459h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f226455d);
            String str = this.f226456e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f226457f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74320g(4, 8, this.f226458g);
            aVar.mo74318e(5, this.f226459h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f226455d) + 0;
            String str3 = this.f226456e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f226457f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58680g(4, 8, this.f226458g) + C52418a.m58678e(5, this.f226459h);
        } else if (i == 2) {
            this.f226458g.clear();
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
            C77684b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bVar.f226455d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                bVar.f226456e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                bVar.f226457f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C77683a aVar4 = new C77683a();
                    if (bArr != null && bArr.length > 0) {
                        aVar4.parseFrom(bArr);
                    }
                    bVar.f226458g.add(aVar4);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                bVar.f226459h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
