package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ml1 */
public class C50419ml1 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<db4> f138093d = new LinkedList<>();

    /* renamed from: e */
    public String f138094e;

    /* renamed from: f */
    public C49842ig0 f138095f;

    /* renamed from: g */
    public C49704hh0 f138096g;

    /* renamed from: h */
    public long f138097h;

    /* renamed from: i */
    public C51162rv2 f138098i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50419ml1)) {
            return false;
        }
        C50419ml1 ml12 = (C50419ml1) aVar;
        return C46238a.m51546a(this.BaseRequest, ml12.BaseRequest) && C46238a.m51546a(this.f138093d, ml12.f138093d) && C46238a.m51546a(this.f138094e, ml12.f138094e) && C46238a.m51546a(this.f138095f, ml12.f138095f) && C46238a.m51546a(this.f138096g, ml12.f138096g) && C46238a.m51546a(Long.valueOf(this.f138097h), Long.valueOf(ml12.f138097h)) && C46238a.m51546a(this.f138098i, ml12.f138098i);
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
            aVar.mo74320g(2, 8, this.f138093d);
            String str = this.f138094e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C49842ig0 ig02 = this.f138095f;
            if (ig02 != null) {
                aVar.mo74322i(4, ig02.computeSize());
                this.f138095f.writeFields(aVar);
            }
            C49704hh0 hh02 = this.f138096g;
            if (hh02 != null) {
                aVar.mo74322i(5, hh02.computeSize());
                this.f138096g.writeFields(aVar);
            }
            aVar.mo74321h(7, this.f138097h);
            C51162rv2 rv22 = this.f138098i;
            if (rv22 != null) {
                aVar.mo74322i(8, rv22.computeSize());
                this.f138098i.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f138093d);
            String str2 = this.f138094e;
            if (str2 != null) {
                g += C52418a.m58683j(3, str2);
            }
            C49842ig0 ig03 = this.f138095f;
            if (ig03 != null) {
                g += C52418a.m58682i(4, ig03.computeSize());
            }
            C49704hh0 hh03 = this.f138096g;
            if (hh03 != null) {
                g += C52418a.m58682i(5, hh03.computeSize());
            }
            int h = g + C52418a.m58681h(7, this.f138097h);
            C51162rv2 rv23 = this.f138098i;
            return rv23 != null ? h + C52418a.m58682i(8, rv23.computeSize()) : h;
        } else if (i == 2) {
            this.f138093d.clear();
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
            C50419ml1 ml12 = objArr[1];
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
                        ml12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        db4 db4 = new db4();
                        if (bArr2 != null && bArr2.length > 0) {
                            db4.parseFrom(bArr2);
                        }
                        ml12.f138093d.add(db4);
                    }
                    return 0;
                case 3:
                    ml12.f138094e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr3 != null && bArr3.length > 0) {
                            ig04.parseFrom(bArr3);
                        }
                        ml12.f138095f = ig04;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C49704hh0 hh04 = new C49704hh0();
                        if (bArr4 != null && bArr4.length > 0) {
                            hh04.parseFrom(bArr4);
                        }
                        ml12.f138096g = hh04;
                    }
                    return 0;
                case 7:
                    ml12.f138097h = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        byte[] bArr5 = j5.get(i7);
                        C51162rv2 rv24 = new C51162rv2();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv24.parseFrom(bArr5);
                        }
                        ml12.f138098i = rv24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
