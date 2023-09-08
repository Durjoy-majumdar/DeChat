package uz2;

import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.o1 */
public class C52705o1 extends C101820nt3 {

    /* renamed from: d */
    public String f147173d;

    /* renamed from: e */
    public String f147174e;

    /* renamed from: f */
    public String f147175f;

    /* renamed from: g */
    public int f147176g;

    /* renamed from: h */
    public int f147177h;

    /* renamed from: i */
    public String f147178i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52705o1)) {
            return false;
        }
        C52705o1 o1Var = (C52705o1) aVar;
        return C46238a.m51546a(this.BaseRequest, o1Var.BaseRequest) && C46238a.m51546a(this.f147173d, o1Var.f147173d) && C46238a.m51546a(this.f147174e, o1Var.f147174e) && C46238a.m51546a(this.f147175f, o1Var.f147175f) && C46238a.m51546a(Integer.valueOf(this.f147176g), Integer.valueOf(o1Var.f147176g)) && C46238a.m51546a(Integer.valueOf(this.f147177h), Integer.valueOf(o1Var.f147177h)) && C46238a.m51546a(this.f147178i, o1Var.f147178i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f147173d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147174e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147175f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f147176g);
            aVar.mo74318e(6, this.f147177h);
            String str4 = this.f147178i;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str5 = this.f147173d;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f147174e;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            String str7 = this.f147175f;
            if (str7 != null) {
                i2 += C52418a.m58683j(4, str7);
            }
            int e = i2 + C52418a.m58678e(5, this.f147176g) + C52418a.m58678e(6, this.f147177h);
            String str8 = this.f147178i;
            return str8 != null ? e + C52418a.m58683j(8, str8) : e;
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
            C52705o1 o1Var = objArr[1];
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
                        o1Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    o1Var.f147173d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    o1Var.f147174e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    o1Var.f147175f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    o1Var.f147176g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    o1Var.f147177h = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    o1Var.f147178i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C90417ia iaVar = this.BaseRequest;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "BaseRequest", iaVar, false);
            aVar.mo71655d(jSONObject, "topic_id", this.f147173d, false);
            aVar.mo71655d(jSONObject, "text_status_id", this.f147174e, false);
            aVar.mo71655d(jSONObject, "username", this.f147175f, false);
            aVar.mo71655d(jSONObject, "delete_flag", Integer.valueOf(this.f147176g), false);
            aVar.mo71655d(jSONObject, "type", Integer.valueOf(this.f147177h), false);
            aVar.mo71655d(jSONObject, ClientInfoTable.Columns.CLIENTID, this.f147178i, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
