package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wf */
public class C51825wf extends C101820nt3 {

    /* renamed from: d */
    public String f144005d;

    /* renamed from: e */
    public LinkedList<String> f144006e = new LinkedList<>();

    /* renamed from: f */
    public int f144007f;

    /* renamed from: g */
    public String f144008g;

    /* renamed from: h */
    public double f144009h;

    /* renamed from: i */
    public double f144010i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51825wf)) {
            return false;
        }
        C51825wf wfVar = (C51825wf) aVar;
        return C46238a.m51546a(this.BaseRequest, wfVar.BaseRequest) && C46238a.m51546a(this.f144005d, wfVar.f144005d) && C46238a.m51546a(this.f144006e, wfVar.f144006e) && C46238a.m51546a(Integer.valueOf(this.f144007f), Integer.valueOf(wfVar.f144007f)) && C46238a.m51546a(this.f144008g, wfVar.f144008g) && C46238a.m51546a(Double.valueOf(this.f144009h), Double.valueOf(wfVar.f144009h)) && C46238a.m51546a(Double.valueOf(this.f144010i), Double.valueOf(wfVar.f144010i));
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
            String str = this.f144005d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 1, this.f144006e);
            aVar.mo74318e(4, this.f144007f);
            String str2 = this.f144008g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74316c(6, this.f144009h);
            aVar.mo74316c(7, this.f144010i);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f144005d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f144006e) + C52418a.m58678e(4, this.f144007f);
            String str4 = this.f144008g;
            if (str4 != null) {
                g += C52418a.m58683j(5, str4);
            }
            return g + C52418a.m58676c(6, this.f144009h) + C52418a.m58676c(7, this.f144010i);
        } else if (i == 2) {
            this.f144006e.clear();
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
            C51825wf wfVar = objArr[1];
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
                        wfVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    wfVar.f144005d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wfVar.f144006e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    wfVar.f144007f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    wfVar.f144008g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wfVar.f144009h = aVar3.mo141627e(intValue);
                    return 0;
                case 7:
                    wfVar.f144010i = aVar3.mo141627e(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
