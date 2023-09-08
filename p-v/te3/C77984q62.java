package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q62 */
public class C77984q62 extends C49335eu3 {

    /* renamed from: d */
    public C77982pz2 f228109d;

    /* renamed from: e */
    public xo4 f228110e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77984q62)) {
            return false;
        }
        C77984q62 q622 = (C77984q62) aVar;
        return C46238a.m51546a(this.BaseResponse, q622.BaseResponse) && C46238a.m51546a(this.f228109d, q622.f228109d) && C46238a.m51546a(this.f228110e, q622.f228110e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f228109d == null) {
                throw new C52419b("Not all required fields were included: UserInfo");
            } else if (this.f228110e != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C77982pz2 pz22 = this.f228109d;
                if (pz22 != null) {
                    aVar.mo74322i(2, pz22.computeSize());
                    this.f228109d.writeFields(aVar);
                }
                xo4 xo4 = this.f228110e;
                if (xo4 != null) {
                    aVar.mo74322i(3, xo4.computeSize());
                    this.f228110e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UserInfoExt");
            }
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C77982pz2 pz23 = this.f228109d;
            if (pz23 != null) {
                i2 += C52418a.m58682i(2, pz23.computeSize());
            }
            xo4 xo42 = this.f228110e;
            return xo42 != null ? i2 + C52418a.m58682i(3, xo42.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f228109d == null) {
                throw new C52419b("Not all required fields were included: UserInfo");
            } else if (this.f228110e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: UserInfoExt");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77984q62 q622 = objArr[1];
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
                    q622.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C77982pz2 pz24 = new C77982pz2();
                    if (bArr2 != null && bArr2.length > 0) {
                        pz24.parseFrom(bArr2);
                    }
                    q622.f228109d = pz24;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    xo4 xo43 = new xo4();
                    if (bArr3 != null && bArr3.length > 0) {
                        xo43.parseFrom(bArr3);
                    }
                    q622.f228110e = xo43;
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49966ja jaVar = this.BaseResponse;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseResponse", jaVar, false);
            aVar.mo71655d(jSONObject, "UserInfo", this.f228109d, false);
            aVar.mo71655d(jSONObject, "UserInfoExt", this.f228110e, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
