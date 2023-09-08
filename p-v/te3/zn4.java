package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class zn4 extends C101820nt3 {

    /* renamed from: d */
    public String f146142d;

    /* renamed from: e */
    public it4 f146143e;

    /* renamed from: f */
    public yn4 f146144f;

    /* renamed from: g */
    public C51018qv3 f146145g;

    /* renamed from: h */
    public int f146146h;

    /* renamed from: i */
    public String f146147i;

    /* renamed from: j */
    public String f146148j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof zn4)) {
            return false;
        }
        zn4 zn4 = (zn4) aVar;
        return C46238a.m51546a(this.BaseRequest, zn4.BaseRequest) && C46238a.m51546a(this.f146142d, zn4.f146142d) && C46238a.m51546a(this.f146143e, zn4.f146143e) && C46238a.m51546a(this.f146144f, zn4.f146144f) && C46238a.m51546a(this.f146145g, zn4.f146145g) && C46238a.m51546a(Integer.valueOf(this.f146146h), Integer.valueOf(zn4.f146146h)) && C46238a.m51546a(this.f146147i, zn4.f146147i) && C46238a.m51546a(this.f146148j, zn4.f146148j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f146143e == null) {
                throw new C52419b("Not all required fields were included: VoiceAttr");
            } else if (this.f146144f == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f146145g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f146142d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                it4 it4 = this.f146143e;
                if (it4 != null) {
                    aVar.mo74322i(3, it4.computeSize());
                    this.f146143e.writeFields(aVar);
                }
                yn4 yn4 = this.f146144f;
                if (yn4 != null) {
                    aVar.mo74322i(4, yn4.computeSize());
                    this.f146144f.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f146145g;
                if (qv32 != null) {
                    aVar.mo74322i(5, qv32.computeSize());
                    this.f146145g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f146146h);
                String str2 = this.f146147i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                String str3 = this.f146148j;
                if (str3 != null) {
                    aVar.mo74323j(8, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f146142d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            it4 it42 = this.f146143e;
            if (it42 != null) {
                i2 += C52418a.m58682i(3, it42.computeSize());
            }
            yn4 yn42 = this.f146144f;
            if (yn42 != null) {
                i2 += C52418a.m58682i(4, yn42.computeSize());
            }
            C51018qv3 qv33 = this.f146145g;
            if (qv33 != null) {
                i2 += C52418a.m58682i(5, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(6, this.f146146h);
            String str5 = this.f146147i;
            if (str5 != null) {
                e += C52418a.m58683j(7, str5);
            }
            String str6 = this.f146148j;
            return str6 != null ? e + C52418a.m58683j(8, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f146143e == null) {
                throw new C52419b("Not all required fields were included: VoiceAttr");
            } else if (this.f146144f == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f146145g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Data");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            zn4 zn4 = objArr[1];
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
                        zn4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zn4.f146142d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        it4 it43 = new it4();
                        if (bArr2 != null && bArr2.length > 0) {
                            it43.parseFrom(bArr2);
                        }
                        zn4.f146143e = it43;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        yn4 yn43 = new yn4();
                        if (bArr3 != null && bArr3.length > 0) {
                            yn43.parseFrom(bArr3);
                        }
                        zn4.f146144f = yn43;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            qv34.mo73348f(bArr4);
                        }
                        zn4.f146145g = qv34;
                    }
                    return 0;
                case 6:
                    zn4.f146146h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zn4.f146147i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zn4.f146148j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
