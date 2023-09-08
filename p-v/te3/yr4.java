package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class yr4 extends C47465a {

    /* renamed from: d */
    public String f354607d;

    /* renamed from: e */
    public int f354608e;

    /* renamed from: f */
    public String f354609f;

    /* renamed from: g */
    public int f354610g;

    /* renamed from: h */
    public LinkedList<C118438ja3> f354611h = new LinkedList<>();

    /* renamed from: i */
    public String f354612i;

    /* renamed from: j */
    public String f354613j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yr4)) {
            return false;
        }
        yr4 yr4 = (yr4) aVar;
        return C46238a.m51546a(this.f354607d, yr4.f354607d) && C46238a.m51546a(Integer.valueOf(this.f354608e), Integer.valueOf(yr4.f354608e)) && C46238a.m51546a(this.f354609f, yr4.f354609f) && C46238a.m51546a(Integer.valueOf(this.f354610g), Integer.valueOf(yr4.f354610g)) && C46238a.m51546a(this.f354611h, yr4.f354611h) && C46238a.m51546a(this.f354612i, yr4.f354612i) && C46238a.m51546a(this.f354613j, yr4.f354613j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354607d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f354608e);
            String str2 = this.f354609f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f354610g);
            aVar.mo74320g(5, 8, this.f354611h);
            String str3 = this.f354612i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f354613j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f354607d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f354608e);
            String str6 = this.f354609f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            int e2 = e + C52418a.m58678e(4, this.f354610g) + C52418a.m58680g(5, 8, this.f354611h);
            String str7 = this.f354612i;
            if (str7 != null) {
                e2 += C52418a.m58683j(6, str7);
            }
            String str8 = this.f354613j;
            return str8 != null ? e2 + C52418a.m58683j(7, str8) : e2;
        } else if (i == 2) {
            this.f354611h.clear();
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
            yr4 yr4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    yr4.f354607d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    yr4.f354608e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yr4.f354609f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    yr4.f354610g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C118438ja3 ja32 = new C118438ja3();
                        if (bArr != null && bArr.length > 0) {
                            ja32.parseFrom(bArr);
                        }
                        yr4.f354611h.add(ja32);
                    }
                    return 0;
                case 6:
                    yr4.f354612i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    yr4.f354613j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
