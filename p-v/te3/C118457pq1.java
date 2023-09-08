package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pq1 */
public class C118457pq1 extends C47465a {

    /* renamed from: d */
    public fh4 f354239d;

    /* renamed from: e */
    public String f354240e = "";

    /* renamed from: f */
    public boolean f354241f = false;

    /* renamed from: g */
    public String f354242g = "";

    /* renamed from: h */
    public boolean f354243h = false;

    /* renamed from: i */
    public long f354244i = 0;

    /* renamed from: j */
    public int f354245j = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118457pq1)) {
            return false;
        }
        C118457pq1 pq12 = (C118457pq1) aVar;
        return C46238a.m51546a(this.f354239d, pq12.f354239d) && C46238a.m51546a(this.f354240e, pq12.f354240e) && C46238a.m51546a(Boolean.valueOf(this.f354241f), Boolean.valueOf(pq12.f354241f)) && C46238a.m51546a(this.f354242g, pq12.f354242g) && C46238a.m51546a(Boolean.valueOf(this.f354243h), Boolean.valueOf(pq12.f354243h)) && C46238a.m51546a(Long.valueOf(this.f354244i), Long.valueOf(pq12.f354244i)) && C46238a.m51546a(Integer.valueOf(this.f354245j), Integer.valueOf(pq12.f354245j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            fh4 fh4 = this.f354239d;
            if (fh4 != null) {
                aVar.mo74322i(1, fh4.computeSize());
                this.f354239d.writeFields(aVar);
            }
            String str = this.f354240e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f354241f);
            String str2 = this.f354242g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f354243h);
            aVar.mo74321h(6, this.f354244i);
            aVar.mo74318e(7, this.f354245j);
            return 0;
        } else if (i == 1) {
            fh4 fh42 = this.f354239d;
            if (fh42 != null) {
                i2 = 0 + C52418a.m58682i(1, fh42.computeSize());
            }
            String str3 = this.f354240e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int a = i2 + C52418a.m58674a(3, this.f354241f);
            String str4 = this.f354242g;
            if (str4 != null) {
                a += C52418a.m58683j(4, str4);
            }
            return a + C52418a.m58674a(5, this.f354243h) + C52418a.m58681h(6, this.f354244i) + C52418a.m58678e(7, this.f354245j);
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
            C118457pq1 pq12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        fh4 fh43 = new fh4();
                        if (bArr != null && bArr.length > 0) {
                            fh43.parseFrom(bArr);
                        }
                        pq12.f354239d = fh43;
                    }
                    return 0;
                case 2:
                    pq12.f354240e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pq12.f354241f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    pq12.f354242g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    pq12.f354243h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    pq12.f354244i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    pq12.f354245j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
