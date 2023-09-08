package ms2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.n64;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ms2.d */
public class C47095d extends C47465a {

    /* renamed from: d */
    public String f126557d;

    /* renamed from: e */
    public n64 f126558e;

    /* renamed from: f */
    public int f126559f;

    /* renamed from: g */
    public String f126560g;

    public boolean compareContent(C47465a aVar) {
        SnsMethodCalculate.markStartTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        if (aVar == null || !(aVar instanceof C47095d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        }
        C47095d dVar = (C47095d) aVar;
        if (!C46238a.m51546a(this.f126557d, dVar.f126557d)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        } else if (!C46238a.m51546a(this.f126558e, dVar.f126558e)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        } else if (!C46238a.m51546a(Integer.valueOf(this.f126559f), Integer.valueOf(dVar.f126559f))) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        } else if (!C46238a.m51546a(this.f126560g, dVar.f126560g)) {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return true;
        }
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f126557d;
            if (str == null) {
                C52419b bVar = new C52419b("Not all required fields were included: clientID");
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                throw bVar;
            } else if (this.f126558e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                n64 n64 = this.f126558e;
                if (n64 != null) {
                    aVar.mo74322i(2, n64.computeSize());
                    this.f126558e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f126559f);
                String str2 = this.f126560g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            } else {
                C52419b bVar2 = new C52419b("Not all required fields were included: actionGroup");
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                throw bVar2;
            }
        } else if (i == 1) {
            String str3 = this.f126557d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            n64 n642 = this.f126558e;
            if (n642 != null) {
                i2 += C52418a.m58682i(2, n642.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f126559f);
            String str4 = this.f126560g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f126557d == null) {
                C52419b bVar3 = new C52419b("Not all required fields were included: clientID");
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                throw bVar3;
            } else if (this.f126558e != null) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            } else {
                C52419b bVar4 = new C52419b("Not all required fields were included: actionGroup");
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                throw bVar4;
            }
        } else if (i == 3) {
            C102122a aVar3 = objArr[0];
            C47095d dVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dVar.f126557d = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    n64 n643 = new n64();
                    if (bArr != null && bArr.length > 0) {
                        n643.parseFrom(bArr);
                    }
                    dVar.f126558e = n643;
                }
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            } else if (intValue == 3) {
                dVar.f126559f = aVar3.mo141629g(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            } else if (intValue != 4) {
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return -1;
            } else {
                dVar.f126560g = aVar3.mo141633k(intValue);
                SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
                return 0;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("op", "com.tencent.mm.plugin.sns.snstimeline.SnsCommentToSend");
            return -1;
        }
    }
}
