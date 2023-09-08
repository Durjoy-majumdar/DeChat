package te3;

import if0.C46238a;
import java.util.LinkedList;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rk */
public class C51119rk extends C47465a {

    /* renamed from: d */
    public int f140967d;

    /* renamed from: e */
    public LinkedList<C50959qh> f140968e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<f05> f140969f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C50082k50> f140970g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<t35> f140971h = new LinkedList<>();

    /* renamed from: i */
    public C49327es3 f140972i;

    /* renamed from: j */
    public C89349b f140973j;

    /* renamed from: n */
    public LinkedList<C48835bb3> f140974n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51119rk)) {
            return false;
        }
        C51119rk rkVar = (C51119rk) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140967d), Integer.valueOf(rkVar.f140967d)) && C46238a.m51546a(this.f140968e, rkVar.f140968e) && C46238a.m51546a(this.f140969f, rkVar.f140969f) && C46238a.m51546a(this.f140970g, rkVar.f140970g) && C46238a.m51546a(this.f140971h, rkVar.f140971h) && C46238a.m51546a(this.f140972i, rkVar.f140972i) && C46238a.m51546a(this.f140973j, rkVar.f140973j) && C46238a.m51546a(this.f140974n, rkVar.f140974n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140967d);
            aVar.mo74320g(2, 8, this.f140968e);
            aVar.mo74320g(3, 8, this.f140969f);
            aVar.mo74320g(4, 8, this.f140970g);
            aVar.mo74320g(5, 8, this.f140971h);
            C49327es3 es32 = this.f140972i;
            if (es32 != null) {
                aVar.mo74322i(6, es32.computeSize());
                this.f140972i.writeFields(aVar);
            }
            C89349b bVar = this.f140973j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            aVar.mo74320g(8, 8, this.f140974n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140967d) + 0 + C52418a.m58680g(2, 8, this.f140968e) + C52418a.m58680g(3, 8, this.f140969f) + C52418a.m58680g(4, 8, this.f140970g) + C52418a.m58680g(5, 8, this.f140971h);
            C49327es3 es33 = this.f140972i;
            if (es33 != null) {
                e += C52418a.m58682i(6, es33.computeSize());
            }
            C89349b bVar2 = this.f140973j;
            if (bVar2 != null) {
                e += C52418a.m58675b(7, bVar2);
            }
            return e + C52418a.m58680g(8, 8, this.f140974n);
        } else if (i == 2) {
            this.f140968e.clear();
            this.f140969f.clear();
            this.f140970g.clear();
            this.f140971h.clear();
            this.f140974n.clear();
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
            C51119rk rkVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rkVar.f140967d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50959qh qhVar = new C50959qh();
                        if (bArr != null && bArr.length > 0) {
                            qhVar.parseFrom(bArr);
                        }
                        rkVar.f140968e.add(qhVar);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        f05 f05 = new f05();
                        if (bArr2 != null && bArr2.length > 0) {
                            f05.parseFrom(bArr2);
                        }
                        rkVar.f140969f.add(f05);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C50082k50 k502 = new C50082k50();
                        if (bArr3 != null && bArr3.length > 0) {
                            k502.parseFrom(bArr3);
                        }
                        rkVar.f140970g.add(k502);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        t35 t35 = new t35();
                        if (bArr4 != null && bArr4.length > 0) {
                            t35.parseFrom(bArr4);
                        }
                        rkVar.f140971h.add(t35);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C49327es3 es34 = new C49327es3();
                        if (bArr5 != null && bArr5.length > 0) {
                            es34.parseFrom(bArr5);
                        }
                        rkVar.f140972i = es34;
                    }
                    return 0;
                case 7:
                    rkVar.f140973j = aVar3.mo141626d(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C48835bb3 bb32 = new C48835bb3();
                        if (bArr6 != null && bArr6.length > 0) {
                            bb32.parseFrom(bArr6);
                        }
                        rkVar.f140974n.add(bb32);
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
            Integer valueOf = Integer.valueOf(this.f140967d);
            C46238a.C46239a aVar = C46238a.f124644a;
            aVar.mo71655d(jSONObject, "Type", valueOf, false);
            aVar.mo71655d(jSONObject, "BizResults", this.f140968e, false);
            aVar.mo71655d(jSONObject, "WeappResults", this.f140969f, false);
            aVar.mo71655d(jSONObject, "DocResults", this.f140970g, false);
            aVar.mo71655d(jSONObject, "WidgetResults", this.f140971h, false);
            aVar.mo71655d(jSONObject, "ReportInfo", this.f140972i, false);
            aVar.mo71655d(jSONObject, "DebugInfo", this.f140973j, false);
            aVar.mo71655d(jSONObject, "PardusResults", this.f140974n, false);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
