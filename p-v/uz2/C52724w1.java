package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.w1 */
public class C52724w1 extends C101820nt3 {

    /* renamed from: d */
    public String f147272d;

    /* renamed from: e */
    public String f147273e;

    /* renamed from: f */
    public long f147274f;

    /* renamed from: g */
    public String f147275g;

    /* renamed from: h */
    public int f147276h;

    /* renamed from: i */
    public String f147277i;

    /* renamed from: j */
    public String f147278j;

    /* renamed from: n */
    public String f147279n;

    /* renamed from: o */
    public String f147280o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52724w1)) {
            return false;
        }
        C52724w1 w1Var = (C52724w1) aVar;
        return C46238a.m51546a(this.BaseRequest, w1Var.BaseRequest) && C46238a.m51546a(this.f147272d, w1Var.f147272d) && C46238a.m51546a(this.f147273e, w1Var.f147273e) && C46238a.m51546a(Long.valueOf(this.f147274f), Long.valueOf(w1Var.f147274f)) && C46238a.m51546a(this.f147275g, w1Var.f147275g) && C46238a.m51546a(Integer.valueOf(this.f147276h), Integer.valueOf(w1Var.f147276h)) && C46238a.m51546a(this.f147277i, w1Var.f147277i) && C46238a.m51546a(this.f147278j, w1Var.f147278j) && C46238a.m51546a(this.f147279n, w1Var.f147279n) && C46238a.m51546a(this.f147280o, w1Var.f147280o);
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
            String str = this.f147272d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147273e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74321h(4, this.f147274f);
            String str3 = this.f147275g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f147276h);
            String str4 = this.f147277i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f147278j;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f147279n;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            String str7 = this.f147280o;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str8 = this.f147272d;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f147273e;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            int h = i2 + C52418a.m58681h(4, this.f147274f);
            String str10 = this.f147275g;
            if (str10 != null) {
                h += C52418a.m58683j(5, str10);
            }
            int e = h + C52418a.m58678e(6, this.f147276h);
            String str11 = this.f147277i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            String str12 = this.f147278j;
            if (str12 != null) {
                e += C52418a.m58683j(8, str12);
            }
            String str13 = this.f147279n;
            if (str13 != null) {
                e += C52418a.m58683j(9, str13);
            }
            String str14 = this.f147280o;
            return str14 != null ? e + C52418a.m58683j(10, str14) : e;
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
            C52724w1 w1Var = objArr[1];
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
                        w1Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    w1Var.f147272d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w1Var.f147273e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w1Var.f147274f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    w1Var.f147275g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w1Var.f147276h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    w1Var.f147277i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    w1Var.f147278j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    w1Var.f147279n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    w1Var.f147280o = aVar3.mo141633k(intValue);
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
            aVar.mo71655d(jSONObject, "tag", this.f147272d, false);
            aVar.mo71655d(jSONObject, "source_id", this.f147273e, false);
            aVar.mo71655d(jSONObject, "card_key", Long.valueOf(this.f147274f), false);
            aVar.mo71655d(jSONObject, "status_id", this.f147275g, false);
            aVar.mo71655d(jSONObject, "modify_count", Integer.valueOf(this.f147276h), false);
            aVar.mo71655d(jSONObject, "to_enc_username", this.f147277i, false);
            aVar.mo71655d(jSONObject, "to_hash_username", this.f147278j, false);
            aVar.mo71655d(jSONObject, "client_msg_id", this.f147279n, false);
            aVar.mo71655d(jSONObject, "session_id", this.f147280o, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
