package te3;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zh0 */
public class C52263zh0 extends C49335eu3 {

    /* renamed from: d */
    public long f145956d;

    /* renamed from: e */
    public String f145957e;

    /* renamed from: f */
    public FinderObject f145958f;

    /* renamed from: g */
    public LinkedList<FinderCommentInfo> f145959g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52263zh0)) {
            return false;
        }
        C52263zh0 zh02 = (C52263zh0) aVar;
        return C46238a.m51546a(this.BaseResponse, zh02.BaseResponse) && C46238a.m51546a(Long.valueOf(this.f145956d), Long.valueOf(zh02.f145956d)) && C46238a.m51546a(this.f145957e, zh02.f145957e) && C46238a.m51546a(this.f145958f, zh02.f145958f) && C46238a.m51546a(this.f145959g, zh02.f145959g);
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
                aVar.mo74321h(2, this.f145956d);
                String str = this.f145957e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                FinderObject finderObject = this.f145958f;
                if (finderObject != null) {
                    aVar.mo74322i(4, finderObject.computeSize());
                    this.f145958f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f145959g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f145956d);
            String str2 = this.f145957e;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            FinderObject finderObject2 = this.f145958f;
            if (finderObject2 != null) {
                h += C52418a.m58682i(4, finderObject2.computeSize());
            }
            return h + C52418a.m58680g(5, 8, this.f145959g);
        } else if (i == 2) {
            this.f145959g.clear();
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
            C52263zh0 zh02 = objArr[1];
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
                    zh02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zh02.f145956d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                zh02.f145957e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    FinderObject finderObject3 = new FinderObject();
                    if (bArr2 != null && bArr2.length > 0) {
                        finderObject3.parseFrom(bArr2);
                    }
                    zh02.f145958f = finderObject3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderCommentInfo.parseFrom(bArr3);
                    }
                    zh02.f145959g.add(finderCommentInfo);
                }
                return 0;
            }
        }
    }
}
