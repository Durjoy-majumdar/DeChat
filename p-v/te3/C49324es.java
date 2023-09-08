package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.es */
public class C49324es extends C47465a {

    /* renamed from: d */
    public int f133093d;

    /* renamed from: e */
    public LinkedList<C49464fs> f133094e = new LinkedList<>();

    /* renamed from: f */
    public int f133095f;

    /* renamed from: g */
    public C51163rv3 f133096g;

    /* renamed from: h */
    public int f133097h;

    /* renamed from: i */
    public LinkedList<C49889is> f133098i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49324es)) {
            return false;
        }
        C49324es esVar = (C49324es) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133093d), Integer.valueOf(esVar.f133093d)) && C46238a.m51546a(this.f133094e, esVar.f133094e) && C46238a.m51546a(Integer.valueOf(this.f133095f), Integer.valueOf(esVar.f133095f)) && C46238a.m51546a(this.f133096g, esVar.f133096g) && C46238a.m51546a(Integer.valueOf(this.f133097h), Integer.valueOf(esVar.f133097h)) && C46238a.m51546a(this.f133098i, esVar.f133098i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133093d);
            aVar.mo74320g(2, 8, this.f133094e);
            aVar.mo74318e(3, this.f133095f);
            C51163rv3 rv32 = this.f133096g;
            if (rv32 != null) {
                aVar.mo74322i(4, rv32.computeSize());
                this.f133096g.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f133097h);
            aVar.mo74320g(6, 8, this.f133098i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133093d) + 0 + C52418a.m58680g(2, 8, this.f133094e) + C52418a.m58678e(3, this.f133095f);
            C51163rv3 rv33 = this.f133096g;
            if (rv33 != null) {
                e += C52418a.m58682i(4, rv33.computeSize());
            }
            return e + C52418a.m58678e(5, this.f133097h) + C52418a.m58680g(6, 8, this.f133098i);
        } else if (i == 2) {
            this.f133094e.clear();
            this.f133098i.clear();
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
            C49324es esVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    esVar.f133093d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49464fs fsVar = new C49464fs();
                        if (bArr != null && bArr.length > 0) {
                            fsVar.parseFrom(bArr);
                        }
                        esVar.f133094e.add(fsVar);
                    }
                    return 0;
                case 3:
                    esVar.f133095f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51163rv3 rv34 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv34.mo73356d(bArr2);
                        }
                        esVar.f133096g = rv34;
                    }
                    return 0;
                case 5:
                    esVar.f133097h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C49889is isVar = new C49889is();
                        if (bArr3 != null && bArr3.length > 0) {
                            isVar.parseFrom(bArr3);
                        }
                        esVar.f133098i.add(isVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
