package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.me */
public class C50387me extends C47465a {

    /* renamed from: d */
    public C50117ke f137968d;

    /* renamed from: e */
    public LinkedList<C50249le> f137969e = new LinkedList<>();

    /* renamed from: f */
    public String f137970f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50387me)) {
            return false;
        }
        C50387me meVar = (C50387me) aVar;
        return C46238a.m51546a(this.f137968d, meVar.f137968d) && C46238a.m51546a(this.f137969e, meVar.f137969e) && C46238a.m51546a(this.f137970f, meVar.f137970f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50117ke keVar = this.f137968d;
            if (keVar != null) {
                aVar.mo74322i(1, keVar.computeSize());
                this.f137968d.writeFields(aVar);
            }
            aVar.mo74320g(2, 8, this.f137969e);
            String str = this.f137970f;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            return 0;
        } else if (i == 1) {
            C50117ke keVar2 = this.f137968d;
            if (keVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, keVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f137969e);
            String str2 = this.f137970f;
            return str2 != null ? g + C52418a.m58683j(6, str2) : g;
        } else if (i == 2) {
            this.f137969e.clear();
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
            C50387me meVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50117ke keVar3 = new C50117ke();
                    if (bArr != null && bArr.length > 0) {
                        keVar3.parseFrom(bArr);
                    }
                    meVar.f137968d = keVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50249le leVar = new C50249le();
                    if (bArr2 != null && bArr2.length > 0) {
                        leVar.parseFrom(bArr2);
                    }
                    meVar.f137969e.add(leVar);
                }
                return 0;
            } else if (intValue != 6) {
                return -1;
            } else {
                meVar.f137970f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
