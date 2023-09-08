package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fc0 */
public class C49406fc0 extends C101820nt3 {

    /* renamed from: d */
    public String f133407d;

    /* renamed from: e */
    public long f133408e;

    /* renamed from: f */
    public String f133409f;

    /* renamed from: g */
    public String f133410g;

    /* renamed from: h */
    public String f133411h;

    /* renamed from: i */
    public int f133412i;

    /* renamed from: j */
    public int f133413j;

    /* renamed from: n */
    public int f133414n;

    /* renamed from: o */
    public float f133415o;

    /* renamed from: p */
    public int f133416p;

    /* renamed from: q */
    public C89349b f133417q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49406fc0)) {
            return false;
        }
        C49406fc0 fc02 = (C49406fc0) aVar;
        return C46238a.m51546a(this.BaseRequest, fc02.BaseRequest) && C46238a.m51546a(this.f133407d, fc02.f133407d) && C46238a.m51546a(Long.valueOf(this.f133408e), Long.valueOf(fc02.f133408e)) && C46238a.m51546a(this.f133409f, fc02.f133409f) && C46238a.m51546a(this.f133410g, fc02.f133410g) && C46238a.m51546a(this.f133411h, fc02.f133411h) && C46238a.m51546a(Integer.valueOf(this.f133412i), Integer.valueOf(fc02.f133412i)) && C46238a.m51546a(Integer.valueOf(this.f133413j), Integer.valueOf(fc02.f133413j)) && C46238a.m51546a(Integer.valueOf(this.f133414n), Integer.valueOf(fc02.f133414n)) && C46238a.m51546a(Float.valueOf(this.f133415o), Float.valueOf(fc02.f133415o)) && C46238a.m51546a(Integer.valueOf(this.f133416p), Integer.valueOf(fc02.f133416p)) && C46238a.m51546a(this.f133417q, fc02.f133417q);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f133407d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f133408e);
            String str2 = this.f133409f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f133410g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f133411h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74318e(7, this.f133412i);
            aVar.mo74318e(8, this.f133413j);
            aVar.mo74318e(9, this.f133414n);
            aVar.mo74317d(10, this.f133415o);
            aVar.mo74318e(11, this.f133416p);
            C89349b bVar = this.f133417q;
            if (bVar != null) {
                aVar.mo74315b(12, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f133407d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f133408e);
            String str6 = this.f133409f;
            if (str6 != null) {
                h += C52418a.m58683j(4, str6);
            }
            String str7 = this.f133410g;
            if (str7 != null) {
                h += C52418a.m58683j(5, str7);
            }
            String str8 = this.f133411h;
            if (str8 != null) {
                h += C52418a.m58683j(6, str8);
            }
            int e = h + C52418a.m58678e(7, this.f133412i) + C52418a.m58678e(8, this.f133413j) + C52418a.m58678e(9, this.f133414n) + C52418a.m58677d(10, this.f133415o) + C52418a.m58678e(11, this.f133416p);
            C89349b bVar2 = this.f133417q;
            return bVar2 != null ? e + C52418a.m58675b(12, bVar2) : e;
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
            C49406fc0 fc02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        fc02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    fc02.f133407d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fc02.f133408e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    fc02.f133409f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fc02.f133410g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fc02.f133411h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fc02.f133412i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    fc02.f133413j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    fc02.f133414n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    fc02.f133415o = aVar3.mo141628f(intValue);
                    return 0;
                case 11:
                    fc02.f133416p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    fc02.f133417q = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
