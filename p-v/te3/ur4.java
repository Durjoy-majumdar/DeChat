package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ur4 extends C47465a {

    /* renamed from: d */
    public C49777i00 f143053d;

    /* renamed from: e */
    public boolean f143054e = true;

    /* renamed from: f */
    public br4 f143055f;

    /* renamed from: g */
    public String f143056g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ur4)) {
            return false;
        }
        ur4 ur4 = (ur4) aVar;
        return C46238a.m51546a(this.f143053d, ur4.f143053d) && C46238a.m51546a(Boolean.valueOf(this.f143054e), Boolean.valueOf(ur4.f143054e)) && C46238a.m51546a(this.f143055f, ur4.f143055f) && C46238a.m51546a(this.f143056g, ur4.f143056g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49777i00 i002 = this.f143053d;
            if (i002 != null) {
                aVar.mo74322i(1, i002.computeSize());
                this.f143053d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f143054e);
            br4 br4 = this.f143055f;
            if (br4 != null) {
                aVar.mo74322i(3, br4.computeSize());
                this.f143055f.writeFields(aVar);
            }
            String str = this.f143056g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C49777i00 i003 = this.f143053d;
            if (i003 != null) {
                i2 = 0 + C52418a.m58682i(1, i003.computeSize());
            }
            int a = i2 + C52418a.m58674a(2, this.f143054e);
            br4 br42 = this.f143055f;
            if (br42 != null) {
                a += C52418a.m58682i(3, br42.computeSize());
            }
            String str2 = this.f143056g;
            return str2 != null ? a + C52418a.m58683j(4, str2) : a;
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
            ur4 ur4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49777i00 i004 = new C49777i00();
                    if (bArr != null && bArr.length > 0) {
                        i004.parseFrom(bArr);
                    }
                    ur4.f143053d = i004;
                }
                return 0;
            } else if (intValue == 2) {
                ur4.f143054e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    br4 br43 = new br4();
                    if (bArr2 != null && bArr2.length > 0) {
                        br43.parseFrom(bArr2);
                    }
                    ur4.f143055f = br43;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ur4.f143056g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C49777i00 i002 = this.f143053d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "ContentId", i002, false);
            aVar.mo71655d(jSONObject, "Valid", Boolean.valueOf(this.f143054e), false);
            aVar.mo71655d(jSONObject, "VideoCdnInfo", this.f143055f, false);
            aVar.mo71655d(jSONObject, "VideoApi", this.f143056g, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
