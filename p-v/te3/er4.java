package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class er4 extends C47465a {

    /* renamed from: d */
    public LinkedList<fr4> f133087d = new LinkedList<>();

    /* renamed from: e */
    public String f133088e;

    /* renamed from: f */
    public int f133089f;

    /* renamed from: g */
    public String f133090g;

    /* renamed from: h */
    public String f133091h;

    /* renamed from: i */
    public int f133092i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof er4)) {
            return false;
        }
        er4 er4 = (er4) aVar;
        return C46238a.m51546a(this.f133087d, er4.f133087d) && C46238a.m51546a(this.f133088e, er4.f133088e) && C46238a.m51546a(Integer.valueOf(this.f133089f), Integer.valueOf(er4.f133089f)) && C46238a.m51546a(this.f133090g, er4.f133090g) && C46238a.m51546a(this.f133091h, er4.f133091h) && C46238a.m51546a(Integer.valueOf(this.f133092i), Integer.valueOf(er4.f133092i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f133087d);
            String str = this.f133088e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f133089f);
            String str2 = this.f133090g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f133091h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f133092i);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f133087d) + 0;
            String str4 = this.f133088e;
            if (str4 != null) {
                g += C52418a.m58683j(2, str4);
            }
            int e = g + C52418a.m58678e(3, this.f133089f);
            String str5 = this.f133090g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f133091h;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            return e + C52418a.m58678e(6, this.f133092i);
        } else if (i == 2) {
            this.f133087d.clear();
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
            er4 er4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        fr4 fr4 = new fr4();
                        if (bArr != null && bArr.length > 0) {
                            fr4.parseFrom(bArr);
                        }
                        er4.f133087d.add(fr4);
                    }
                    return 0;
                case 2:
                    er4.f133088e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    er4.f133089f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    er4.f133090g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    er4.f133091h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    er4.f133092i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
