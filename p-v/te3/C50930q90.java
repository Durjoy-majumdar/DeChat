package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q90 */
public class C50930q90 extends C101820nt3 {

    /* renamed from: d */
    public String f140191d;

    /* renamed from: e */
    public String f140192e;

    /* renamed from: f */
    public int f140193f;

    /* renamed from: g */
    public int f140194g;

    /* renamed from: h */
    public int f140195h;

    /* renamed from: i */
    public C51018qv3 f140196i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50930q90)) {
            return false;
        }
        C50930q90 q902 = (C50930q90) aVar;
        return C46238a.m51546a(this.BaseRequest, q902.BaseRequest) && C46238a.m51546a(this.f140191d, q902.f140191d) && C46238a.m51546a(this.f140192e, q902.f140192e) && C46238a.m51546a(Integer.valueOf(this.f140193f), Integer.valueOf(q902.f140193f)) && C46238a.m51546a(Integer.valueOf(this.f140194g), Integer.valueOf(q902.f140194g)) && C46238a.m51546a(Integer.valueOf(this.f140195h), Integer.valueOf(q902.f140195h)) && C46238a.m51546a(this.f140196i, q902.f140196i);
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
            String str = this.f140191d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f140192e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f140193f);
            aVar.mo74318e(5, this.f140194g);
            aVar.mo74318e(6, this.f140195h);
            C51018qv3 qv32 = this.f140196i;
            if (qv32 != null) {
                aVar.mo74322i(7, qv32.computeSize());
                this.f140196i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f140191d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f140192e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            int e = i2 + C52418a.m58678e(4, this.f140193f) + C52418a.m58678e(5, this.f140194g) + C52418a.m58678e(6, this.f140195h);
            C51018qv3 qv33 = this.f140196i;
            return qv33 != null ? e + C52418a.m58682i(7, qv33.computeSize()) : e;
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
            C50930q90 q902 = objArr[1];
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
                        q902.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    q902.f140191d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    q902.f140192e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    q902.f140193f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    q902.f140194g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    q902.f140195h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        q902.f140196i = qv34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
