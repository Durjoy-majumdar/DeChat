package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ct2 */
public class C101766ct2 extends C47465a {

    /* renamed from: d */
    public int f298049d;

    /* renamed from: e */
    public C101778ft2 f298050e;

    /* renamed from: f */
    public C101775et2 f298051f;

    /* renamed from: g */
    public C101771dt2 f298052g;

    /* renamed from: h */
    public C101761bt2 f298053h;

    /* renamed from: i */
    public C101782gt2 f298054i;

    /* renamed from: j */
    public C101785ht2 f298055j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101766ct2)) {
            return false;
        }
        C101766ct2 ct22 = (C101766ct2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f298049d), Integer.valueOf(ct22.f298049d)) && C46238a.m51546a(this.f298050e, ct22.f298050e) && C46238a.m51546a(this.f298051f, ct22.f298051f) && C46238a.m51546a(this.f298052g, ct22.f298052g) && C46238a.m51546a(this.f298053h, ct22.f298053h) && C46238a.m51546a(this.f298054i, ct22.f298054i) && C46238a.m51546a(this.f298055j, ct22.f298055j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f298049d);
            C101778ft2 ft22 = this.f298050e;
            if (ft22 != null) {
                aVar.mo74322i(2, ft22.computeSize());
                this.f298050e.writeFields(aVar);
            }
            C101775et2 et22 = this.f298051f;
            if (et22 != null) {
                aVar.mo74322i(3, et22.computeSize());
                this.f298051f.writeFields(aVar);
            }
            C101771dt2 dt22 = this.f298052g;
            if (dt22 != null) {
                aVar.mo74322i(4, dt22.computeSize());
                this.f298052g.writeFields(aVar);
            }
            C101761bt2 bt22 = this.f298053h;
            if (bt22 != null) {
                aVar.mo74322i(5, bt22.computeSize());
                this.f298053h.writeFields(aVar);
            }
            C101782gt2 gt22 = this.f298054i;
            if (gt22 != null) {
                aVar.mo74322i(6, gt22.computeSize());
                this.f298054i.writeFields(aVar);
            }
            C101785ht2 ht22 = this.f298055j;
            if (ht22 != null) {
                aVar.mo74322i(7, ht22.computeSize());
                this.f298055j.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f298049d) + 0;
            C101778ft2 ft23 = this.f298050e;
            if (ft23 != null) {
                e += C52418a.m58682i(2, ft23.computeSize());
            }
            C101775et2 et23 = this.f298051f;
            if (et23 != null) {
                e += C52418a.m58682i(3, et23.computeSize());
            }
            C101771dt2 dt23 = this.f298052g;
            if (dt23 != null) {
                e += C52418a.m58682i(4, dt23.computeSize());
            }
            C101761bt2 bt23 = this.f298053h;
            if (bt23 != null) {
                e += C52418a.m58682i(5, bt23.computeSize());
            }
            C101782gt2 gt23 = this.f298054i;
            if (gt23 != null) {
                e += C52418a.m58682i(6, gt23.computeSize());
            }
            C101785ht2 ht23 = this.f298055j;
            return ht23 != null ? e + C52418a.m58682i(7, ht23.computeSize()) : e;
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
            C101766ct2 ct22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ct22.f298049d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C101778ft2 ft24 = new C101778ft2();
                        if (bArr != null && bArr.length > 0) {
                            ft24.parseFrom(bArr);
                        }
                        ct22.f298050e = ft24;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C101775et2 et24 = new C101775et2();
                        if (bArr2 != null && bArr2.length > 0) {
                            et24.parseFrom(bArr2);
                        }
                        ct22.f298051f = et24;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C101771dt2 dt24 = new C101771dt2();
                        if (bArr3 != null && bArr3.length > 0) {
                            dt24.parseFrom(bArr3);
                        }
                        ct22.f298052g = dt24;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C101761bt2 bt24 = new C101761bt2();
                        if (bArr4 != null && bArr4.length > 0) {
                            bt24.parseFrom(bArr4);
                        }
                        ct22.f298053h = bt24;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C101782gt2 gt24 = new C101782gt2();
                        if (bArr5 != null && bArr5.length > 0) {
                            gt24.parseFrom(bArr5);
                        }
                        ct22.f298054i = gt24;
                    }
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C101785ht2 ht24 = new C101785ht2();
                        if (bArr6 != null && bArr6.length > 0) {
                            ht24.parseFrom(bArr6);
                        }
                        ct22.f298055j = ht24;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
