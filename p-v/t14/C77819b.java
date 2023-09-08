package t14;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: t14.b */
public class C77819b extends C47465a {

    /* renamed from: d */
    public C77824g f226700d;

    /* renamed from: e */
    public String f226701e;

    /* renamed from: f */
    public String f226702f;

    /* renamed from: g */
    public String f226703g;

    /* renamed from: h */
    public int f226704h;

    /* renamed from: i */
    public String f226705i;

    /* renamed from: j */
    public String f226706j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77819b)) {
            return false;
        }
        C77819b bVar = (C77819b) aVar;
        return C46238a.m51546a(this.f226700d, bVar.f226700d) && C46238a.m51546a(this.f226701e, bVar.f226701e) && C46238a.m51546a(this.f226702f, bVar.f226702f) && C46238a.m51546a(this.f226703g, bVar.f226703g) && C46238a.m51546a(Integer.valueOf(this.f226704h), Integer.valueOf(bVar.f226704h)) && C46238a.m51546a(this.f226705i, bVar.f226705i) && C46238a.m51546a(this.f226706j, bVar.f226706j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C77824g gVar = this.f226700d;
            if (gVar != null) {
                aVar.mo74322i(1, gVar.computeSize());
                this.f226700d.writeFields(aVar);
            }
            String str = this.f226701e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f226702f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f226703g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f226704h);
            String str4 = this.f226705i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f226706j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            C77824g gVar2 = this.f226700d;
            if (gVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, gVar2.computeSize());
            }
            String str6 = this.f226701e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f226702f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f226703g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            int e = i2 + C52418a.m58678e(5, this.f226704h);
            String str9 = this.f226705i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f226706j;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            C77819b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C77824g gVar3 = new C77824g();
                        if (bArr != null && bArr.length > 0) {
                            gVar3.parseFrom(bArr);
                        }
                        bVar.f226700d = gVar3;
                    }
                    return 0;
                case 2:
                    bVar.f226701e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    bVar.f226702f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f226703g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    bVar.f226704h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    bVar.f226705i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bVar.f226706j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
