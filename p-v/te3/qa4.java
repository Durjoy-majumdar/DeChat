package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class qa4 extends C47465a {

    /* renamed from: d */
    public long f140213d;

    /* renamed from: e */
    public long f140214e;

    /* renamed from: f */
    public String f140215f;

    /* renamed from: g */
    public String f140216g;

    /* renamed from: h */
    public int f140217h;

    /* renamed from: i */
    public C50787p60 f140218i;

    /* renamed from: j */
    public long f140219j;

    /* renamed from: n */
    public long f140220n;

    /* renamed from: o */
    public C51063r60 f140221o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qa4)) {
            return false;
        }
        qa4 qa4 = (qa4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f140213d), Long.valueOf(qa4.f140213d)) && C46238a.m51546a(Long.valueOf(this.f140214e), Long.valueOf(qa4.f140214e)) && C46238a.m51546a(this.f140215f, qa4.f140215f) && C46238a.m51546a(this.f140216g, qa4.f140216g) && C46238a.m51546a(Integer.valueOf(this.f140217h), Integer.valueOf(qa4.f140217h)) && C46238a.m51546a(this.f140218i, qa4.f140218i) && C46238a.m51546a(Long.valueOf(this.f140219j), Long.valueOf(qa4.f140219j)) && C46238a.m51546a(Long.valueOf(this.f140220n), Long.valueOf(qa4.f140220n)) && C46238a.m51546a(this.f140221o, qa4.f140221o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f140213d);
            aVar.mo74321h(2, this.f140214e);
            String str = this.f140215f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f140216g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f140217h);
            C50787p60 p602 = this.f140218i;
            if (p602 != null) {
                aVar.mo74322i(6, p602.computeSize());
                this.f140218i.writeFields(aVar);
            }
            aVar.mo74321h(7, this.f140219j);
            aVar.mo74321h(8, this.f140220n);
            C51063r60 r602 = this.f140221o;
            if (r602 != null) {
                aVar.mo74322i(9, r602.computeSize());
                this.f140221o.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f140213d) + 0 + C52418a.m58681h(2, this.f140214e);
            String str3 = this.f140215f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            String str4 = this.f140216g;
            if (str4 != null) {
                h += C52418a.m58683j(4, str4);
            }
            int e = h + C52418a.m58678e(5, this.f140217h);
            C50787p60 p603 = this.f140218i;
            if (p603 != null) {
                e += C52418a.m58682i(6, p603.computeSize());
            }
            int h2 = e + C52418a.m58681h(7, this.f140219j) + C52418a.m58681h(8, this.f140220n);
            C51063r60 r603 = this.f140221o;
            return r603 != null ? h2 + C52418a.m58682i(9, r603.computeSize()) : h2;
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
            qa4 qa4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    qa4.f140213d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    qa4.f140214e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    qa4.f140215f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    qa4.f140216g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    qa4.f140217h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50787p60 p604 = new C50787p60();
                        if (bArr != null && bArr.length > 0) {
                            p604.parseFrom(bArr);
                        }
                        qa4.f140218i = p604;
                    }
                    return 0;
                case 7:
                    qa4.f140219j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    qa4.f140220n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C51063r60 r604 = new C51063r60();
                        if (bArr2 != null && bArr2.length > 0) {
                            r604.parseFrom(bArr2);
                        }
                        qa4.f140221o = r604;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
