package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ly1 */
public class C64539ly1 extends C49335eu3 {

    /* renamed from: d */
    public long f184174d;

    /* renamed from: e */
    public String f184175e;

    /* renamed from: f */
    public boolean f184176f;

    /* renamed from: g */
    public long f184177g;

    /* renamed from: h */
    public String f184178h;

    /* renamed from: i */
    public LinkedList<C22517nn> f184179i = new LinkedList<>();

    /* renamed from: j */
    public C64597o00 f184180j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64539ly1)) {
            return false;
        }
        C64539ly1 ly12 = (C64539ly1) aVar;
        return C46238a.m51546a(this.BaseResponse, ly12.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f184174d), Long.valueOf(ly12.f184174d)) && C46238a.m51546a(this.f184175e, ly12.f184175e) && C46238a.m51546a(Boolean.valueOf(this.f184176f), Boolean.valueOf(ly12.f184176f)) && C46238a.m51546a(Long.valueOf(this.f184177g), Long.valueOf(ly12.f184177g)) && C46238a.m51546a(this.f184178h, ly12.f184178h) && C46238a.m51546a(this.f184179i, ly12.f184179i) && C46238a.m51546a(this.f184180j, ly12.f184180j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74321h(2, this.f184174d);
                String str = this.f184175e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74314a(4, this.f184176f);
                aVar.mo74321h(5, this.f184177g);
                String str2 = this.f184178h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 8, this.f184179i);
                C64597o00 o002 = this.f184180j;
                if (o002 != null) {
                    aVar.mo74322i(8, o002.computeSize());
                    this.f184180j.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f184174d);
            String str3 = this.f184175e;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            int a = h + C52418a.m58674a(4, this.f184176f) + C52418a.m58681h(5, this.f184177g);
            String str4 = this.f184178h;
            if (str4 != null) {
                a += C52418a.m58683j(6, str4);
            }
            int g = a + C52418a.m58680g(7, 8, this.f184179i);
            C64597o00 o003 = this.f184180j;
            return o003 != null ? g + C52418a.m58682i(8, o003.computeSize()) : g;
        } else if (i == 2) {
            this.f184179i.clear();
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
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64539ly1 ly12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        ly12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ly12.f184174d = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    ly12.f184175e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ly12.f184176f = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    ly12.f184177g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ly12.f184178h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C22517nn nnVar = new C22517nn();
                        if (bArr2 != null && bArr2.length > 0) {
                            nnVar.parseFrom(bArr2);
                        }
                        ly12.f184179i.add(nnVar);
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C64597o00 o004 = new C64597o00();
                        if (bArr3 != null && bArr3.length > 0) {
                            o004.parseFrom(bArr3);
                        }
                        ly12.f184180j = o004;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
