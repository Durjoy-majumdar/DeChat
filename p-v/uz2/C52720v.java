package uz2;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.v */
public class C52720v extends C47465a {

    /* renamed from: d */
    public int f147260d;

    /* renamed from: e */
    public String f147261e;

    /* renamed from: f */
    public String f147262f;

    /* renamed from: g */
    public String f147263g;

    /* renamed from: h */
    public String f147264h;

    /* renamed from: i */
    public int f147265i;

    /* renamed from: j */
    public LinkedList<C65488a0> f147266j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52720v)) {
            return false;
        }
        C52720v vVar = (C52720v) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f147260d), Integer.valueOf(vVar.f147260d)) && C46238a.m51546a(this.f147261e, vVar.f147261e) && C46238a.m51546a(this.f147262f, vVar.f147262f) && C46238a.m51546a(this.f147263g, vVar.f147263g) && C46238a.m51546a(this.f147264h, vVar.f147264h) && C46238a.m51546a(Integer.valueOf(this.f147265i), Integer.valueOf(vVar.f147265i)) && C46238a.m51546a(this.f147266j, vVar.f147266j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f147260d);
            String str = this.f147261e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147262f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f147263g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f147264h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f147265i);
            aVar.mo74320g(21, 8, this.f147266j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f147260d) + 0;
            String str5 = this.f147261e;
            if (str5 != null) {
                e += C52418a.m58683j(2, str5);
            }
            String str6 = this.f147262f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            String str7 = this.f147263g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f147264h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58678e(6, this.f147265i) + C52418a.m58680g(21, 8, this.f147266j);
        } else if (i == 2) {
            this.f147266j.clear();
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
            C52720v vVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 21) {
                switch (intValue) {
                    case 1:
                        vVar.f147260d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        vVar.f147261e = aVar3.mo141633k(intValue);
                        return 0;
                    case 3:
                        vVar.f147262f = aVar3.mo141633k(intValue);
                        return 0;
                    case 4:
                        vVar.f147263g = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        vVar.f147264h = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        vVar.f147265i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C65488a0 a0Var = new C65488a0();
                    if (bArr != null && bArr.length > 0) {
                        a0Var.parseFrom(bArr);
                    }
                    vVar.f147266j.add(a0Var);
                }
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Integer valueOf = Integer.valueOf(this.f147260d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "uin", valueOf, false);
            aVar.mo71655d(jSONObject, "sourceId", this.f147261e, false);
            aVar.mo71655d(jSONObject, "sourceActivityId", this.f147262f, false);
            aVar.mo71655d(jSONObject, "sourceName", this.f147263g, false);
            aVar.mo71655d(jSONObject, "sourceIcon", this.f147264h, false);
            aVar.mo71655d(jSONObject, "createTime", Integer.valueOf(this.f147265i), false);
            aVar.mo71655d(jSONObject, "jumps", this.f147266j, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
