package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z6 */
public class C52222z6 extends C47465a {

    /* renamed from: d */
    public C48816b7 f145714d;

    /* renamed from: e */
    public C48673a7 f145715e;

    /* renamed from: f */
    public C89349b f145716f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52222z6)) {
            return false;
        }
        C52222z6 z6Var = (C52222z6) aVar;
        return C46238a.m51546a(this.f145714d, z6Var.f145714d) && C46238a.m51546a(this.f145715e, z6Var.f145715e) && C46238a.m51546a(this.f145716f, z6Var.f145716f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48816b7 b7Var = this.f145714d;
            if (b7Var == null) {
                throw new C52419b("Not all required fields were included: VoiceAttr");
            } else if (this.f145715e == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f145716f != null) {
                if (b7Var != null) {
                    aVar.mo74322i(1, b7Var.computeSize());
                    this.f145714d.writeFields(aVar);
                }
                C48673a7 a7Var = this.f145715e;
                if (a7Var != null) {
                    aVar.mo74322i(2, a7Var.computeSize());
                    this.f145715e.writeFields(aVar);
                }
                C89349b bVar = this.f145716f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: VoiceData");
            }
        } else if (i == 1) {
            C48816b7 b7Var2 = this.f145714d;
            if (b7Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, b7Var2.computeSize());
            }
            C48673a7 a7Var2 = this.f145715e;
            if (a7Var2 != null) {
                i2 += C52418a.m58682i(2, a7Var2.computeSize());
            }
            C89349b bVar2 = this.f145716f;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f145714d == null) {
                throw new C52419b("Not all required fields were included: VoiceAttr");
            } else if (this.f145715e == null) {
                throw new C52419b("Not all required fields were included: UploadCtx");
            } else if (this.f145716f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: VoiceData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C52222z6 z6Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48816b7 b7Var3 = new C48816b7();
                    if (bArr != null && bArr.length > 0) {
                        b7Var3.parseFrom(bArr);
                    }
                    z6Var.f145714d = b7Var3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48673a7 a7Var3 = new C48673a7();
                    if (bArr2 != null && bArr2.length > 0) {
                        a7Var3.parseFrom(bArr2);
                    }
                    z6Var.f145715e = a7Var3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                z6Var.f145716f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
