package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.w */
public class C53032w extends C101820nt3 {

    /* renamed from: d */
    public int f148040d;

    /* renamed from: e */
    public LinkedList<C53030u> f148041e = new LinkedList<>();

    /* renamed from: f */
    public String f148042f;

    /* renamed from: g */
    public String f148043g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53032w)) {
            return false;
        }
        C53032w wVar = (C53032w) aVar;
        return C46238a.m51546a(this.BaseRequest, wVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f148040d), Integer.valueOf(wVar.f148040d)) && C46238a.m51546a(this.f148041e, wVar.f148041e) && C46238a.m51546a(this.f148042f, wVar.f148042f) && C46238a.m51546a(this.f148043g, wVar.f148043g);
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
            aVar.mo74318e(2, this.f148040d);
            aVar.mo74320g(3, 8, this.f148041e);
            String str = this.f148042f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f148043g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f148040d) + C52418a.m58680g(3, 8, this.f148041e);
            String str3 = this.f148042f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            String str4 = this.f148043g;
            return str4 != null ? e + C52418a.m58683j(5, str4) : e;
        } else if (i == 2) {
            this.f148041e.clear();
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
            C53032w wVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    wVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                wVar.f148040d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53030u uVar = new C53030u();
                    if (bArr2 != null && bArr2.length > 0) {
                        uVar.parseFrom(bArr2);
                    }
                    wVar.f148041e.add(uVar);
                }
                return 0;
            } else if (intValue == 4) {
                wVar.f148042f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wVar.f148043g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
