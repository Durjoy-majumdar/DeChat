package te3;

import com.tencent.p014mm.protocal.protobuf.SnsObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class c94 extends C49335eu3 {

    /* renamed from: d */
    public String f298006d;

    /* renamed from: e */
    public int f298007e;

    /* renamed from: f */
    public LinkedList<SnsObject> f298008f = new LinkedList<>();

    /* renamed from: g */
    public int f298009g;

    /* renamed from: h */
    public a94 f298010h;

    /* renamed from: i */
    public int f298011i;

    /* renamed from: j */
    public int f298012j;

    /* renamed from: n */
    public j84 f298013n;

    /* renamed from: o */
    public long f298014o;

    /* renamed from: p */
    public long f298015p;

    /* renamed from: q */
    public String f298016q;

    /* renamed from: r */
    public int f298017r;

    /* renamed from: s */
    public LinkedList<q94> f298018s = new LinkedList<>();

    /* renamed from: t */
    public boolean f298019t;

    /* renamed from: u */
    public String f298020u;

    /* renamed from: v */
    public int f298021v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c94)) {
            return false;
        }
        c94 c94 = (c94) aVar;
        return C46238a.m51546a(this.BaseResponse, c94.BaseResponse) && C46238a.m51546a(this.f298006d, c94.f298006d) && C46238a.m51546a(Integer.valueOf(this.f298007e), Integer.valueOf(c94.f298007e)) && C46238a.m51546a(this.f298008f, c94.f298008f) && C46238a.m51546a(Integer.valueOf(this.f298009g), Integer.valueOf(c94.f298009g)) && C46238a.m51546a(this.f298010h, c94.f298010h) && C46238a.m51546a(Integer.valueOf(this.f298011i), Integer.valueOf(c94.f298011i)) && C46238a.m51546a(Integer.valueOf(this.f298012j), Integer.valueOf(c94.f298012j)) && C46238a.m51546a(this.f298013n, c94.f298013n) && C46238a.m51546a(Long.valueOf(this.f298014o), Long.valueOf(c94.f298014o)) && C46238a.m51546a(Long.valueOf(this.f298015p), Long.valueOf(c94.f298015p)) && C46238a.m51546a(this.f298016q, c94.f298016q) && C46238a.m51546a(Integer.valueOf(this.f298017r), Integer.valueOf(c94.f298017r)) && C46238a.m51546a(this.f298018s, c94.f298018s) && C46238a.m51546a(Boolean.valueOf(this.f298019t), Boolean.valueOf(c94.f298019t)) && C46238a.m51546a(this.f298020u, c94.f298020u) && C46238a.m51546a(Integer.valueOf(this.f298021v), Integer.valueOf(c94.f298021v));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f298006d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f298007e);
                aVar.mo74320g(4, 8, this.f298008f);
                aVar.mo74318e(5, this.f298009g);
                a94 a94 = this.f298010h;
                if (a94 != null) {
                    aVar.mo74322i(6, a94.computeSize());
                    this.f298010h.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f298011i);
                aVar.mo74318e(8, this.f298012j);
                j84 j84 = this.f298013n;
                if (j84 != null) {
                    aVar.mo74322i(9, j84.computeSize());
                    this.f298013n.writeFields(aVar);
                }
                aVar.mo74321h(10, this.f298014o);
                aVar.mo74321h(11, this.f298015p);
                String str2 = this.f298016q;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                aVar.mo74318e(13, this.f298017r);
                aVar.mo74320g(14, 8, this.f298018s);
                aVar.mo74314a(15, this.f298019t);
                String str3 = this.f298020u;
                if (str3 != null) {
                    aVar.mo74323j(16, str3);
                }
                aVar.mo74318e(17, this.f298021v);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str4 = this.f298006d;
            if (str4 != null) {
                i3 += C52418a.m58683j(2, str4);
            }
            int e = i3 + C52418a.m58678e(3, this.f298007e) + C52418a.m58680g(4, 8, this.f298008f) + C52418a.m58678e(5, this.f298009g);
            a94 a942 = this.f298010h;
            if (a942 != null) {
                e += C52418a.m58682i(6, a942.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f298011i) + C52418a.m58678e(8, this.f298012j);
            j84 j842 = this.f298013n;
            if (j842 != null) {
                e2 += C52418a.m58682i(9, j842.computeSize());
            }
            int h = e2 + C52418a.m58681h(10, this.f298014o) + C52418a.m58681h(11, this.f298015p);
            String str5 = this.f298016q;
            if (str5 != null) {
                h += C52418a.m58683j(12, str5);
            }
            int e3 = h + C52418a.m58678e(13, this.f298017r) + C52418a.m58680g(14, 8, this.f298018s) + C52418a.m58674a(15, this.f298019t);
            String str6 = this.f298020u;
            if (str6 != null) {
                e3 += C52418a.m58683j(16, str6);
            }
            return e3 + C52418a.m58678e(17, this.f298021v);
        } else if (i2 == 2) {
            this.f298008f.clear();
            this.f298018s.clear();
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
            c94 c94 = objArr[1];
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
                        c94.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    c94.f298006d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    c94.f298007e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        SnsObject snsObject = new SnsObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            snsObject.parseFrom(bArr2);
                        }
                        c94.f298008f.add(snsObject);
                    }
                    return 0;
                case 5:
                    c94.f298009g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        a94 a943 = new a94();
                        if (bArr3 != null && bArr3.length > 0) {
                            a943.parseFrom(bArr3);
                        }
                        c94.f298010h = a943;
                    }
                    return 0;
                case 7:
                    c94.f298011i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    c94.f298012j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        j84 j843 = new j84();
                        if (bArr4 != null && bArr4.length > 0) {
                            j843.parseFrom(bArr4);
                        }
                        c94.f298013n = j843;
                    }
                    return 0;
                case 10:
                    c94.f298014o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    c94.f298015p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    c94.f298016q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    c94.f298017r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        q94 q94 = new q94();
                        if (bArr5 != null && bArr5.length > 0) {
                            q94.parseFrom(bArr5);
                        }
                        c94.f298018s.add(q94);
                    }
                    return 0;
                case 15:
                    c94.f298019t = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    c94.f298020u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    c94.f298021v = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
