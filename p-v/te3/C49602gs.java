package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gs */
public class C49602gs extends C101820nt3 {

    /* renamed from: d */
    public String f134237d;

    /* renamed from: e */
    public int f134238e;

    /* renamed from: f */
    public long f134239f;

    /* renamed from: g */
    public int f134240g;

    /* renamed from: h */
    public String f134241h;

    /* renamed from: i */
    public String f134242i;

    /* renamed from: j */
    public C51018qv3 f134243j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49602gs)) {
            return false;
        }
        C49602gs gsVar = (C49602gs) aVar;
        return C46238a.m51546a(this.BaseRequest, gsVar.BaseRequest) && C46238a.m51546a(this.f134237d, gsVar.f134237d) && C46238a.m51546a(Integer.valueOf(this.f134238e), Integer.valueOf(gsVar.f134238e)) && C46238a.m51546a(Long.valueOf(this.f134239f), Long.valueOf(gsVar.f134239f)) && C46238a.m51546a(Integer.valueOf(this.f134240g), Integer.valueOf(gsVar.f134240g)) && C46238a.m51546a(this.f134241h, gsVar.f134241h) && C46238a.m51546a(this.f134242i, gsVar.f134242i) && C46238a.m51546a(this.f134243j, gsVar.f134243j);
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
            String str = this.f134237d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f134238e);
            aVar.mo74321h(4, this.f134239f);
            aVar.mo74318e(5, this.f134240g);
            String str2 = this.f134241h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f134242i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            C51018qv3 qv32 = this.f134243j;
            if (qv32 != null) {
                aVar.mo74322i(8, qv32.computeSize());
                this.f134243j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f134237d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int e = i2 + C52418a.m58678e(3, this.f134238e) + C52418a.m58681h(4, this.f134239f) + C52418a.m58678e(5, this.f134240g);
            String str5 = this.f134241h;
            if (str5 != null) {
                e += C52418a.m58683j(6, str5);
            }
            String str6 = this.f134242i;
            if (str6 != null) {
                e += C52418a.m58683j(7, str6);
            }
            C51018qv3 qv33 = this.f134243j;
            return qv33 != null ? e + C52418a.m58682i(8, qv33.computeSize()) : e;
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
            C49602gs gsVar = objArr[1];
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
                        gsVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    gsVar.f134237d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gsVar.f134238e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gsVar.f134239f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    gsVar.f134240g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gsVar.f134241h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gsVar.f134242i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        gsVar.f134243j = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
