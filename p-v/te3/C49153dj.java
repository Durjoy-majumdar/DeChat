package te3;

import com.google.firebase.analytics.FirebaseAnalytics;
import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dj */
public class C49153dj extends C47465a {

    /* renamed from: d */
    public C52013xs0 f132361d;

    /* renamed from: e */
    public boolean f132362e;

    /* renamed from: f */
    public int f132363f;

    /* renamed from: g */
    public boolean f132364g;

    /* renamed from: h */
    public boolean f132365h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49153dj)) {
            return false;
        }
        C49153dj djVar = (C49153dj) aVar;
        return C46238a.m51546a(this.f132361d, djVar.f132361d) && C46238a.m51546a(Boolean.valueOf(this.f132362e), Boolean.valueOf(djVar.f132362e)) && C46238a.m51546a(Integer.valueOf(this.f132363f), Integer.valueOf(djVar.f132363f)) && C46238a.m51546a(Boolean.valueOf(this.f132364g), Boolean.valueOf(djVar.f132364g)) && C46238a.m51546a(Boolean.valueOf(this.f132365h), Boolean.valueOf(djVar.f132365h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52013xs0 xs02 = this.f132361d;
            if (xs02 != null) {
                aVar.mo74322i(1, xs02.computeSize());
                this.f132361d.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f132362e);
            aVar.mo74318e(3, this.f132363f);
            aVar.mo74314a(4, this.f132364g);
            aVar.mo74314a(5, this.f132365h);
            return 0;
        } else if (i == 1) {
            C52013xs0 xs03 = this.f132361d;
            if (xs03 != null) {
                i2 = 0 + C52418a.m58682i(1, xs03.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f132362e) + C52418a.m58678e(3, this.f132363f) + C52418a.m58674a(4, this.f132364g) + C52418a.m58674a(5, this.f132365h);
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
            C49153dj djVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52013xs0 xs04 = new C52013xs0();
                    if (bArr != null && bArr.length > 0) {
                        xs04.parseFrom(bArr);
                    }
                    djVar.f132361d = xs04;
                }
                return 0;
            } else if (intValue == 2) {
                djVar.f132362e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                djVar.f132363f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                djVar.f132364g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                djVar.f132365h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            C52013xs0 xs02 = this.f132361d;
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, FirebaseAnalytics.C113379b.SOURCE, xs02, false);
            aVar.mo71655d(jSONObject, "isLocal", Boolean.valueOf(this.f132362e), false);
            aVar.mo71655d(jSONObject, "likeCount", Integer.valueOf(this.f132363f), false);
            aVar.mo71655d(jSONObject, "selfLike", Boolean.valueOf(this.f132364g), false);
            aVar.mo71655d(jSONObject, "selfOp", Boolean.valueOf(this.f132365h), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
