package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ue */
public class C51531ue extends C47465a {

    /* renamed from: d */
    public String f142791d;

    /* renamed from: e */
    public LinkedList<C51820we> f142792e = new LinkedList<>();

    /* renamed from: f */
    public boolean f142793f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51531ue)) {
            return false;
        }
        C51531ue ueVar = (C51531ue) aVar;
        return C46238a.m51546a(this.f142791d, ueVar.f142791d) && C46238a.m51546a(this.f142792e, ueVar.f142792e) && C46238a.m51546a(Boolean.valueOf(this.f142793f), Boolean.valueOf(ueVar.f142793f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142791d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f142792e);
            aVar.mo74314a(3, this.f142793f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f142791d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f142792e) + C52418a.m58674a(3, this.f142793f);
        } else if (i == 2) {
            this.f142792e.clear();
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
            C51531ue ueVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ueVar.f142791d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51820we weVar = new C51820we();
                    if (bArr != null && bArr.length > 0) {
                        weVar.parseFrom(bArr);
                    }
                    ueVar.f142792e.add(weVar);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ueVar.f142793f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
