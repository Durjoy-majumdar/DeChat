package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.c */
public class C99964c extends C47465a {

    /* renamed from: d */
    public LinkedList<C47095d> f292899d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C47095d> f292900e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C47095d> f292901f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C47095d> f292902g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C47096f> f292903h = new LinkedList<>();

    /* renamed from: i */
    public LinkedList<C47096f> f292904i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<C99965e> f292905j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
        if (aVar == null || !(aVar instanceof C99964c)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        C99964c cVar = (C99964c) aVar;
        if (!C46238a.m51546a(this.f292899d, cVar.f292899d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292900e, cVar.f292900e)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292901f, cVar.f292901f)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292902g, cVar.f292902g)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292903h, cVar.f292903h)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292904i, cVar.f292904i)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else if (!C46238a.m51546a(this.f292905j, cVar.f292905j)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f292899d);
            aVar.mo74320g(2, 8, this.f292900e);
            aVar.mo74320g(3, 8, this.f292901f);
            aVar.mo74320g(4, 8, this.f292902g);
            aVar.mo74320g(5, 8, this.f292903h);
            aVar.mo74320g(6, 8, this.f292904i);
            aVar.mo74320g(7, 8, this.f292905j);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f292899d) + 0 + C52418a.m58680g(2, 8, this.f292900e) + C52418a.m58680g(3, 8, this.f292901f) + C52418a.m58680g(4, 8, this.f292902g) + C52418a.m58680g(5, 8, this.f292903h) + C52418a.m58680g(6, 8, this.f292904i) + C52418a.m58680g(7, 8, this.f292905j);
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return g;
        } else if (i == 2) {
            this.f292899d.clear();
            this.f292900e.clear();
            this.f292901f.clear();
            this.f292902g.clear();
            this.f292903h.clear();
            this.f292904i.clear();
            this.f292905j.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return 0;
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C99964c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C47095d dVar = new C47095d();
                        if (bArr != null && bArr.length > 0) {
                            dVar.parseFrom(bArr);
                        }
                        cVar.f292899d.add(dVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C47095d dVar2 = new C47095d();
                        if (bArr2 != null && bArr2.length > 0) {
                            dVar2.parseFrom(bArr2);
                        }
                        cVar.f292900e.add(dVar2);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        byte[] bArr3 = j3.get(i4);
                        C47095d dVar3 = new C47095d();
                        if (bArr3 != null && bArr3.length > 0) {
                            dVar3.parseFrom(bArr3);
                        }
                        cVar.f292901f.add(dVar3);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        byte[] bArr4 = j4.get(i5);
                        C47095d dVar4 = new C47095d();
                        if (bArr4 != null && bArr4.length > 0) {
                            dVar4.parseFrom(bArr4);
                        }
                        cVar.f292902g.add(dVar4);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        byte[] bArr5 = j5.get(i6);
                        C47096f fVar = new C47096f();
                        if (bArr5 != null && bArr5.length > 0) {
                            fVar.parseFrom(bArr5);
                        }
                        cVar.f292903h.add(fVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 6:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        byte[] bArr6 = j6.get(i7);
                        C47096f fVar2 = new C47096f();
                        if (bArr6 != null && bArr6.length > 0) {
                            fVar2.parseFrom(bArr6);
                        }
                        cVar.f292904i.add(fVar2);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                case 7:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i8 = 0; i8 < size7; i8++) {
                        byte[] bArr7 = j7.get(i8);
                        C99965e eVar = new C99965e();
                        if (bArr7 != null && bArr7.length > 0) {
                            eVar.parseFrom(bArr7);
                        }
                        cVar.f292905j.add(eVar);
                    }
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return 0;
                default:
                    SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                    return -1;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return -1;
        }
    }
}
