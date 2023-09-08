package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class qb4 extends C101820nt3 {

    /* renamed from: d */
    public String f184988d;

    /* renamed from: e */
    public ob4 f184989e;

    /* renamed from: f */
    public ob4 f184990f;

    /* renamed from: g */
    public int f184991g;

    /* renamed from: h */
    public int f184992h;

    /* renamed from: i */
    public String f184993i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof qb4)) {
            return false;
        }
        qb4 qb4 = (qb4) aVar;
        return C46238a.m51546a(this.BaseRequest, qb4.BaseRequest) && C46238a.m51546a(this.f184988d, qb4.f184988d) && C46238a.m51546a(this.f184989e, qb4.f184989e) && C46238a.m51546a(this.f184990f, qb4.f184990f) && C46238a.m51546a(Integer.valueOf(this.f184991g), Integer.valueOf(qb4.f184991g)) && C46238a.m51546a(Integer.valueOf(this.f184992h), Integer.valueOf(qb4.f184992h)) && C46238a.m51546a(this.f184993i, qb4.f184993i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f184989e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f184988d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                ob4 ob4 = this.f184989e;
                if (ob4 != null) {
                    aVar.mo74322i(3, ob4.computeSize());
                    this.f184989e.writeFields(aVar);
                }
                ob4 ob42 = this.f184990f;
                if (ob42 != null) {
                    aVar.mo74322i(6, ob42.computeSize());
                    this.f184990f.writeFields(aVar);
                }
                aVar.mo74318e(4, this.f184991g);
                aVar.mo74318e(5, this.f184992h);
                String str2 = this.f184993i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: CommentDetail");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f184988d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            ob4 ob43 = this.f184989e;
            if (ob43 != null) {
                i2 += C52418a.m58682i(3, ob43.computeSize());
            }
            ob4 ob44 = this.f184990f;
            if (ob44 != null) {
                i2 += C52418a.m58682i(6, ob44.computeSize());
            }
            int e = i2 + C52418a.m58678e(4, this.f184991g) + C52418a.m58678e(5, this.f184992h);
            String str4 = this.f184993i;
            return str4 != null ? e + C52418a.m58683j(7, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184989e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: CommentDetail");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            qb4 qb4 = objArr[1];
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
                        qb4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    qb4.f184988d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ob4 ob45 = new ob4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ob45.parseFrom(bArr2);
                        }
                        qb4.f184989e = ob45;
                    }
                    return 0;
                case 4:
                    qb4.f184991g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    qb4.f184992h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ob4 ob46 = new ob4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ob46.parseFrom(bArr3);
                        }
                        qb4.f184990f = ob46;
                    }
                    return 0;
                case 7:
                    qb4.f184993i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
