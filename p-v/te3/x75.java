package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x75 extends C47465a {

    /* renamed from: d */
    public z75 f144513d;

    /* renamed from: e */
    public y75 f144514e;

    /* renamed from: f */
    public int f144515f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x75)) {
            return false;
        }
        x75 x75 = (x75) aVar;
        return C46238a.m51546a(this.f144513d, x75.f144513d) && C46238a.m51546a(this.f144514e, x75.f144514e) && C46238a.m51546a(Integer.valueOf(this.f144515f), Integer.valueOf(x75.f144515f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            z75 z75 = this.f144513d;
            if (z75 != null) {
                aVar.mo74322i(1, z75.computeSize());
                this.f144513d.writeFields(aVar);
            }
            y75 y75 = this.f144514e;
            if (y75 != null) {
                aVar.mo74322i(2, y75.computeSize());
                this.f144514e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f144515f);
            return 0;
        } else if (i == 1) {
            z75 z752 = this.f144513d;
            if (z752 != null) {
                i2 = 0 + C52418a.m58682i(1, z752.computeSize());
            }
            y75 y752 = this.f144514e;
            if (y752 != null) {
                i2 += C52418a.m58682i(2, y752.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f144515f);
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
            x75 x75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    z75 z753 = new z75();
                    if (bArr != null && bArr.length > 0) {
                        z753.parseFrom(bArr);
                    }
                    x75.f144513d = z753;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    y75 y753 = new y75();
                    if (bArr2 != null && bArr2.length > 0) {
                        y753.parseFrom(bArr2);
                    }
                    x75.f144514e = y753;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                x75.f144515f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            z75 z75 = this.f144513d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "plugin_info", z75, false);
            aVar.mo71655d(jSONObject, "scope_item", this.f144514e, false);
            aVar.mo71655d(jSONObject, "create_time", Integer.valueOf(this.f144515f), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
