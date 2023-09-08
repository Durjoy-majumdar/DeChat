package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.er2 */
public class C49322er2 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52065y40> f133082d = new LinkedList<>();

    /* renamed from: e */
    public int f133083e;

    /* renamed from: f */
    public int f133084f;

    /* renamed from: g */
    public int f133085g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49322er2)) {
            return false;
        }
        C49322er2 er22 = (C49322er2) aVar;
        return C46238a.m51546a(this.f133082d, er22.f133082d) && C46238a.m51546a(Integer.valueOf(this.f133083e), Integer.valueOf(er22.f133083e)) && C46238a.m51546a(Integer.valueOf(this.f133084f), Integer.valueOf(er22.f133084f)) && C46238a.m51546a(Integer.valueOf(this.f133085g), Integer.valueOf(er22.f133085g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f133082d);
            aVar.mo74318e(2, this.f133083e);
            aVar.mo74318e(3, this.f133084f);
            aVar.mo74318e(4, this.f133085g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f133082d) + 0 + C52418a.m58678e(2, this.f133083e) + C52418a.m58678e(3, this.f133084f) + C52418a.m58678e(4, this.f133085g);
        } else {
            if (i == 2) {
                this.f133082d.clear();
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
                C49322er2 er22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52065y40 y402 = new C52065y40();
                        if (bArr != null && bArr.length > 0) {
                            y402.parseFrom(bArr);
                        }
                        er22.f133082d.add(y402);
                    }
                    return 0;
                } else if (intValue == 2) {
                    er22.f133083e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    er22.f133084f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    er22.f133085g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            LinkedList<C52065y40> linkedList = this.f133082d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "items", linkedList, false);
            aVar.mo71655d(jSONObject, "update_time", Integer.valueOf(this.f133083e), false);
            aVar.mo71655d(jSONObject, "expire_time", Integer.valueOf(this.f133084f), false);
            aVar.mo71655d(jSONObject, "max_dict_size", Integer.valueOf(this.f133085g), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
