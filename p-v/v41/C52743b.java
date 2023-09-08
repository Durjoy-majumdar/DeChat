package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.b */
public class C52743b extends C47465a {

    /* renamed from: d */
    public String f147345d;

    /* renamed from: e */
    public C52759r f147346e;

    /* renamed from: f */
    public C52759r f147347f;

    /* renamed from: g */
    public String f147348g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52743b)) {
            return false;
        }
        C52743b bVar = (C52743b) aVar;
        return C46238a.m51546a(this.f147345d, bVar.f147345d) && C46238a.m51546a(this.f147346e, bVar.f147346e) && C46238a.m51546a(this.f147347f, bVar.f147347f) && C46238a.m51546a(this.f147348g, bVar.f147348g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147345d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C52759r rVar = this.f147346e;
            if (rVar != null) {
                aVar.mo74322i(2, rVar.computeSize());
                this.f147346e.writeFields(aVar);
            }
            C52759r rVar2 = this.f147347f;
            if (rVar2 != null) {
                aVar.mo74322i(3, rVar2.computeSize());
                this.f147347f.writeFields(aVar);
            }
            String str2 = this.f147348g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f147345d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            C52759r rVar3 = this.f147346e;
            if (rVar3 != null) {
                i2 += C52418a.m58682i(2, rVar3.computeSize());
            }
            C52759r rVar4 = this.f147347f;
            if (rVar4 != null) {
                i2 += C52418a.m58682i(3, rVar4.computeSize());
            }
            String str4 = this.f147348g;
            return str4 != null ? i2 + C52418a.m58683j(4, str4) : i2;
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
            C52743b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bVar.f147345d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52759r rVar5 = new C52759r();
                    if (bArr != null && bArr.length > 0) {
                        rVar5.parseFrom(bArr);
                    }
                    bVar.f147346e = rVar5;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52759r rVar6 = new C52759r();
                    if (bArr2 != null && bArr2.length > 0) {
                        rVar6.parseFrom(bArr2);
                    }
                    bVar.f147347f = rVar6;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bVar.f147348g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
