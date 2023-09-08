package uz2;

import com.google.android.gms.dynamite.ProviderConstants;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.h0 */
public class C52685h0 extends C47465a {

    /* renamed from: d */
    public long f147126d;

    /* renamed from: e */
    public String f147127e;

    /* renamed from: f */
    public long f147128f;

    /* renamed from: g */
    public int f147129g;

    /* renamed from: h */
    public int f147130h;

    /* renamed from: i */
    public String f147131i;

    /* renamed from: j */
    public LinkedList<C52688i0> f147132j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52685h0)) {
            return false;
        }
        C52685h0 h0Var = (C52685h0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f147126d), Long.valueOf(h0Var.f147126d)) && C46238a.m51546a(this.f147127e, h0Var.f147127e) && C46238a.m51546a(Long.valueOf(this.f147128f), Long.valueOf(h0Var.f147128f)) && C46238a.m51546a(Integer.valueOf(this.f147129g), Integer.valueOf(h0Var.f147129g)) && C46238a.m51546a(Integer.valueOf(this.f147130h), Integer.valueOf(h0Var.f147130h)) && C46238a.m51546a(this.f147131i, h0Var.f147131i) && C46238a.m51546a(this.f147132j, h0Var.f147132j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f147126d);
            String str = this.f147127e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f147128f);
            aVar.mo74318e(4, this.f147129g);
            aVar.mo74318e(5, this.f147130h);
            String str2 = this.f147131i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74320g(7, 8, this.f147132j);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f147126d) + 0;
            String str3 = this.f147127e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            int h2 = h + C52418a.m58681h(3, this.f147128f) + C52418a.m58678e(4, this.f147129g) + C52418a.m58678e(5, this.f147130h);
            String str4 = this.f147131i;
            if (str4 != null) {
                h2 += C52418a.m58683j(6, str4);
            }
            return h2 + C52418a.m58680g(7, 8, this.f147132j);
        } else if (i == 2) {
            this.f147132j.clear();
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
            C52685h0 h0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    h0Var.f147126d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    h0Var.f147127e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    h0Var.f147128f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    h0Var.f147129g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    h0Var.f147130h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    h0Var.f147131i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52688i0 i0Var = new C52688i0();
                        if (bArr != null && bArr.length > 0) {
                            i0Var.parseFrom(bArr);
                        }
                        h0Var.f147132j.add(i0Var);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f147126d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "uid", valueOf, false);
            aVar.mo71655d(jSONObject, "sub_id", this.f147127e, false);
            aVar.mo71655d(jSONObject, ProviderConstants.API_COLNAME_FEATURE_VERSION, Long.valueOf(this.f147128f), false);
            aVar.mo71655d(jSONObject, "create_time", Integer.valueOf(this.f147129g), false);
            aVar.mo71655d(jSONObject, "update_time", Integer.valueOf(this.f147130h), false);
            aVar.mo71655d(jSONObject, "description", this.f147131i, false);
            aVar.mo71655d(jSONObject, "templates", this.f147132j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
