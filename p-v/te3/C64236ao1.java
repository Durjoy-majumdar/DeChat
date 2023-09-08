package te3;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ao1 */
public class C64236ao1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderCommentInfo> f182110d = new LinkedList<>();

    /* renamed from: e */
    public int f182111e;

    /* renamed from: f */
    public int f182112f;

    /* renamed from: g */
    public int f182113g;

    /* renamed from: h */
    public C89349b f182114h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64236ao1)) {
            return false;
        }
        C64236ao1 ao12 = (C64236ao1) aVar;
        return C46238a.m51546a(this.BaseResponse, ao12.BaseResponse) && C46238a.m51546a(this.f182110d, ao12.f182110d) && C46238a.m51546a(Integer.valueOf(this.f182111e), Integer.valueOf(ao12.f182111e)) && C46238a.m51546a(Integer.valueOf(this.f182112f), Integer.valueOf(ao12.f182112f)) && C46238a.m51546a(Integer.valueOf(this.f182113g), Integer.valueOf(ao12.f182113g)) && C46238a.m51546a(this.f182114h, ao12.f182114h);
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
            aVar.mo74320g(2, 8, this.f182110d);
            aVar.mo74318e(3, this.f182111e);
            aVar.mo74318e(4, this.f182112f);
            aVar.mo74318e(5, this.f182113g);
            C89349b bVar = this.f182114h;
            if (bVar != null) {
                aVar.mo74315b(100, bVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f182110d) + C52418a.m58678e(3, this.f182111e) + C52418a.m58678e(4, this.f182112f) + C52418a.m58678e(5, this.f182113g);
            C89349b bVar2 = this.f182114h;
            return bVar2 != null ? g + C52418a.m58675b(100, bVar2) : g;
        } else if (i == 2) {
            this.f182110d.clear();
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
            C64236ao1 ao12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    ao12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderCommentInfo.parseFrom(bArr2);
                    }
                    ao12.f182110d.add(finderCommentInfo);
                }
                return 0;
            } else if (intValue == 3) {
                ao12.f182111e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                ao12.f182112f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 5) {
                ao12.f182113g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                ao12.f182114h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
