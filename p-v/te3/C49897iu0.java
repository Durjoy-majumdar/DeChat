package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iu0 */
public class C49897iu0 extends C47465a {

    /* renamed from: d */
    public long f135665d;

    /* renamed from: e */
    public C50317lw0 f135666e;

    /* renamed from: f */
    public int f135667f;

    /* renamed from: g */
    public int f135668g;

    /* renamed from: h */
    public boolean f135669h;

    /* renamed from: i */
    public boolean f135670i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49897iu0)) {
            return false;
        }
        C49897iu0 iu02 = (C49897iu0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f135665d), Long.valueOf(iu02.f135665d)) && C46238a.m51546a(this.f135666e, iu02.f135666e) && C46238a.m51546a(Integer.valueOf(this.f135667f), Integer.valueOf(iu02.f135667f)) && C46238a.m51546a(Integer.valueOf(this.f135668g), Integer.valueOf(iu02.f135668g)) && C46238a.m51546a(Boolean.valueOf(this.f135669h), Boolean.valueOf(iu02.f135669h)) && C46238a.m51546a(Boolean.valueOf(this.f135670i), Boolean.valueOf(iu02.f135670i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f135665d);
            C50317lw0 lw02 = this.f135666e;
            if (lw02 != null) {
                aVar.mo74322i(2, lw02.computeSize());
                this.f135666e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f135667f);
            aVar.mo74318e(4, this.f135668g);
            aVar.mo74314a(5, this.f135669h);
            aVar.mo74314a(6, this.f135670i);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f135665d) + 0;
            C50317lw0 lw03 = this.f135666e;
            if (lw03 != null) {
                h += C52418a.m58682i(2, lw03.computeSize());
            }
            return h + C52418a.m58678e(3, this.f135667f) + C52418a.m58678e(4, this.f135668g) + C52418a.m58674a(5, this.f135669h) + C52418a.m58674a(6, this.f135670i);
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
            C49897iu0 iu02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    iu02.f135665d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50317lw0 lw04 = new C50317lw0();
                        if (bArr != null && bArr.length > 0) {
                            lw04.parseFrom(bArr);
                        }
                        iu02.f135666e = lw04;
                    }
                    return 0;
                case 3:
                    iu02.f135667f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    iu02.f135668g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    iu02.f135669h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    iu02.f135670i = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }

    public Object toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long valueOf = Long.valueOf(this.f135665d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "msg_seq", valueOf, false);
            aVar.mo71655d(jSONObject, "box_id", this.f135666e, false);
            aVar.mo71655d(jSONObject, "op_type", Integer.valueOf(this.f135667f), false);
            aVar.mo71655d(jSONObject, "total_like_num", Integer.valueOf(this.f135668g), false);
            aVar.mo71655d(jSONObject, "is_show_like_num", Boolean.valueOf(this.f135669h), false);
            aVar.mo71655d(jSONObject, "is_self_like", Boolean.valueOf(this.f135670i), false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
