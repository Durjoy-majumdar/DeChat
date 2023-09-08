package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uv1 */
public class C101852uv1 extends C101820nt3 {

    /* renamed from: d */
    public int f299636d;

    /* renamed from: e */
    public int f299637e;

    /* renamed from: f */
    public String f299638f;

    /* renamed from: g */
    public C51018qv3 f299639g;

    /* renamed from: h */
    public int f299640h;

    /* renamed from: i */
    public String f299641i;

    /* renamed from: j */
    public String f299642j;

    /* renamed from: n */
    public C89349b f299643n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101852uv1)) {
            return false;
        }
        C101852uv1 uv12 = (C101852uv1) aVar;
        return C46238a.m51546a(this.BaseRequest, uv12.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f299636d), Integer.valueOf(uv12.f299636d)) && C46238a.m51546a(Integer.valueOf(this.f299637e), Integer.valueOf(uv12.f299637e)) && C46238a.m51546a(this.f299638f, uv12.f299638f) && C46238a.m51546a(this.f299639g, uv12.f299639g) && C46238a.m51546a(Integer.valueOf(this.f299640h), Integer.valueOf(uv12.f299640h)) && C46238a.m51546a(this.f299641i, uv12.f299641i) && C46238a.m51546a(this.f299642j, uv12.f299642j) && C46238a.m51546a(this.f299643n, uv12.f299643n);
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
            aVar.mo74318e(2, this.f299636d);
            aVar.mo74318e(3, this.f299637e);
            String str = this.f299638f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            C51018qv3 qv32 = this.f299639g;
            if (qv32 != null) {
                aVar.mo74322i(5, qv32.computeSize());
                this.f299639g.writeFields(aVar);
            }
            aVar.mo74318e(6, this.f299640h);
            String str2 = this.f299641i;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            String str3 = this.f299642j;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            C89349b bVar = this.f299643n;
            if (bVar != null) {
                aVar.mo74315b(9, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f299636d) + C52418a.m58678e(3, this.f299637e);
            String str4 = this.f299638f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C51018qv3 qv33 = this.f299639g;
            if (qv33 != null) {
                e += C52418a.m58682i(5, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f299640h);
            String str5 = this.f299641i;
            if (str5 != null) {
                e2 += C52418a.m58683j(7, str5);
            }
            String str6 = this.f299642j;
            if (str6 != null) {
                e2 += C52418a.m58683j(8, str6);
            }
            C89349b bVar2 = this.f299643n;
            return bVar2 != null ? e2 + C52418a.m58675b(9, bVar2) : e2;
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
            C101852uv1 uv12 = objArr[1];
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
                        uv12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    uv12.f299636d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    uv12.f299637e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    uv12.f299638f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        uv12.f299639g = qv34;
                    }
                    return 0;
                case 6:
                    uv12.f299640h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    uv12.f299641i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    uv12.f299642j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    uv12.f299643n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
