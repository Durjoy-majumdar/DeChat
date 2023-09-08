package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xp0 */
public class C52002xp0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f144785d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f144786e;

    /* renamed from: f */
    public int f144787f;

    /* renamed from: g */
    public long f144788g;

    /* renamed from: h */
    public C51270sn1 f144789h;

    /* renamed from: i */
    public int f144790i;

    /* renamed from: j */
    public C50862pq3 f144791j;

    /* renamed from: n */
    public C49554gf3 f144792n;

    /* renamed from: o */
    public C51974xh1 f144793o;

    /* renamed from: p */
    public int f144794p;

    /* renamed from: q */
    public int f144795q;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52002xp0)) {
            return false;
        }
        C52002xp0 xp02 = (C52002xp0) aVar;
        return C46238a.m51546a(this.BaseResponse, xp02.BaseResponse) && C46238a.m51546a(this.f144785d, xp02.f144785d) && C46238a.m51546a(this.f144786e, xp02.f144786e) && C46238a.m51546a(Integer.valueOf(this.f144787f), Integer.valueOf(xp02.f144787f)) && C46238a.m51546a(Long.valueOf(this.f144788g), Long.valueOf(xp02.f144788g)) && C46238a.m51546a(this.f144789h, xp02.f144789h) && C46238a.m51546a(Integer.valueOf(this.f144790i), Integer.valueOf(xp02.f144790i)) && C46238a.m51546a(this.f144791j, xp02.f144791j) && C46238a.m51546a(this.f144792n, xp02.f144792n) && C46238a.m51546a(this.f144793o, xp02.f144793o) && C46238a.m51546a(Integer.valueOf(this.f144794p), Integer.valueOf(xp02.f144794p)) && C46238a.m51546a(Integer.valueOf(this.f144795q), Integer.valueOf(xp02.f144795q));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f144785d);
                C89349b bVar = this.f144786e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f144787f);
                aVar.mo74321h(5, this.f144788g);
                C51270sn1 sn12 = this.f144789h;
                if (sn12 != null) {
                    aVar.mo74322i(6, sn12.computeSize());
                    this.f144789h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f144790i);
                C50862pq3 pq32 = this.f144791j;
                if (pq32 != null) {
                    aVar.mo74322i(8, pq32.computeSize());
                    this.f144791j.writeFields(aVar);
                }
                C49554gf3 gf32 = this.f144792n;
                if (gf32 != null) {
                    aVar.mo74322i(9, gf32.computeSize());
                    this.f144792n.writeFields(aVar);
                }
                C51974xh1 xh12 = this.f144793o;
                if (xh12 != null) {
                    aVar.mo74322i(10, xh12.computeSize());
                    this.f144793o.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f144794p);
                aVar.mo74318e(12, this.f144795q);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            int i3 = (jaVar2 != null ? 0 + C52418a.m58682i(1, jaVar2.computeSize()) : 0) + C52418a.m58680g(2, 8, this.f144785d);
            C89349b bVar2 = this.f144786e;
            if (bVar2 != null) {
                i3 += C52418a.m58675b(3, bVar2);
            }
            int e = i3 + C52418a.m58678e(4, this.f144787f) + C52418a.m58681h(5, this.f144788g);
            C51270sn1 sn13 = this.f144789h;
            if (sn13 != null) {
                e += C52418a.m58682i(6, sn13.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f144790i);
            C50862pq3 pq33 = this.f144791j;
            if (pq33 != null) {
                e2 += C52418a.m58682i(8, pq33.computeSize());
            }
            C49554gf3 gf33 = this.f144792n;
            if (gf33 != null) {
                e2 += C52418a.m58682i(9, gf33.computeSize());
            }
            C51974xh1 xh13 = this.f144793o;
            if (xh13 != null) {
                e2 += C52418a.m58682i(10, xh13.computeSize());
            }
            return e2 + C52418a.m58678e(11, this.f144794p) + C52418a.m58678e(12, this.f144795q);
        } else if (i2 == 2) {
            this.f144785d.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52002xp0 xp02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        xp02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        xp02.f144785d.add(finderObject);
                    }
                    return 0;
                case 3:
                    xp02.f144786e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    xp02.f144787f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    xp02.f144788g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51270sn1 sn14 = new C51270sn1();
                        if (bArr3 != null && bArr3.length > 0) {
                            sn14.parseFrom(bArr3);
                        }
                        xp02.f144789h = sn14;
                    }
                    return 0;
                case 7:
                    xp02.f144790i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50862pq3 pq34 = new C50862pq3();
                        if (bArr4 != null && bArr4.length > 0) {
                            pq34.parseFrom(bArr4);
                        }
                        xp02.f144791j = pq34;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49554gf3 gf34 = new C49554gf3();
                        if (bArr5 != null && bArr5.length > 0) {
                            gf34.parseFrom(bArr5);
                        }
                        xp02.f144792n = gf34;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr6 != null && bArr6.length > 0) {
                            xh14.parseFrom(bArr6);
                        }
                        xp02.f144793o = xh14;
                    }
                    return 0;
                case 11:
                    xp02.f144794p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    xp02.f144795q = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
