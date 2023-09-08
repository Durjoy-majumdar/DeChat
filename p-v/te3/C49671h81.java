package te3;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h81 */
public class C49671h81 extends C49335eu3 {

    /* renamed from: d */
    public int f134493d;

    /* renamed from: e */
    public String f134494e;

    /* renamed from: f */
    public FinderObject f134495f;

    /* renamed from: g */
    public int f134496g;

    /* renamed from: h */
    public FinderJumpInfo f134497h;

    /* renamed from: i */
    public C89349b f134498i;

    /* renamed from: j */
    public int f134499j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49671h81)) {
            return false;
        }
        C49671h81 h812 = (C49671h81) aVar;
        return C46238a.m51546a(this.BaseResponse, h812.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134493d), Integer.valueOf(h812.f134493d)) && C46238a.m51546a(this.f134494e, h812.f134494e) && C46238a.m51546a(this.f134495f, h812.f134495f) && C46238a.m51546a(Integer.valueOf(this.f134496g), Integer.valueOf(h812.f134496g)) && C46238a.m51546a(this.f134497h, h812.f134497h) && C46238a.m51546a(this.f134498i, h812.f134498i) && C46238a.m51546a(Integer.valueOf(this.f134499j), Integer.valueOf(h812.f134499j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f134493d);
            String str = this.f134494e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            FinderObject finderObject = this.f134495f;
            if (finderObject != null) {
                aVar.mo74322i(4, finderObject.computeSize());
                this.f134495f.writeFields(aVar);
            }
            aVar.mo74318e(5, this.f134496g);
            FinderJumpInfo finderJumpInfo = this.f134497h;
            if (finderJumpInfo != null) {
                aVar.mo74322i(6, finderJumpInfo.computeSize());
                this.f134497h.writeFields(aVar);
            }
            C89349b bVar = this.f134498i;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74318e(8, this.f134499j);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134493d);
            String str2 = this.f134494e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            FinderObject finderObject2 = this.f134495f;
            if (finderObject2 != null) {
                e += C52418a.m58682i(4, finderObject2.computeSize());
            }
            int e2 = e + C52418a.m58678e(5, this.f134496g);
            FinderJumpInfo finderJumpInfo2 = this.f134497h;
            if (finderJumpInfo2 != null) {
                e2 += C52418a.m58682i(6, finderJumpInfo2.computeSize());
            }
            C89349b bVar2 = this.f134498i;
            if (bVar2 != null) {
                e2 += C52418a.m58675b(7, bVar2);
            }
            return e2 + C52418a.m58678e(8, this.f134499j);
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
            C49671h81 h812 = objArr[1];
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
                        h812.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    h812.f134493d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    h812.f134494e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject3 = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject3.parseFrom(bArr2);
                        }
                        h812.f134495f = finderObject3;
                    }
                    return 0;
                case 5:
                    h812.f134496g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        FinderJumpInfo finderJumpInfo3 = new FinderJumpInfo();
                        if (bArr3 != null && bArr3.length > 0) {
                            finderJumpInfo3.parseFrom(bArr3);
                        }
                        h812.f134497h = finderJumpInfo3;
                    }
                    return 0;
                case 7:
                    h812.f134498i = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    h812.f134499j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
