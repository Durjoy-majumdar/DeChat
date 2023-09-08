package te3;

import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sv3 */
public class C77996sv3 extends C47465a {

    /* renamed from: d */
    public int f228225d;

    /* renamed from: e */
    public boolean f228226e;

    /* renamed from: b */
    public C77996sv3 mo108012b(byte[] bArr) {
        C102122a aVar = new C102122a(bArr, C47465a.unknownTagHandler);
        for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.mo141624b();
            }
        }
        mo108013d();
        return this;
    }

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C77996sv3) && this.f228225d == ((C77996sv3) aVar).f228225d;
    }

    public int computeSize() {
        return C52418a.m58678e(1, this.f228225d) + 0 + 0;
    }

    /* renamed from: d */
    public C77996sv3 mo108013d() {
        if (this.f228226e) {
            return this;
        }
        throw new C52419b("Not all required fields were included (false = not included in message),  uiVal:" + this.f228226e + "");
    }

    public /* bridge */ /* synthetic */ C47465a parseFrom(byte[] bArr) {
        mo108012b(bArr);
        return this;
    }

    public boolean populateBuilderWithField(C102122a aVar, C47465a aVar2, int i) {
        C77996sv3 sv32 = (C77996sv3) aVar2;
        if (i != 1) {
            return false;
        }
        sv32.f228225d = aVar.mo141629g(i);
        sv32.f228226e = true;
        return true;
    }

    public byte[] toByteArray() {
        mo108013d();
        return super.toByteArray();
    }

    public Object toJSON() {
        return Integer.valueOf(this.f228225d);
    }

    public String toString() {
        return (("" + C77996sv3.class.getName() + "(") + "uiVal = " + this.f228225d + "   ") + ")";
    }

    public /* bridge */ /* synthetic */ C47465a validate() {
        mo108013d();
        return this;
    }

    public void writeFields(C53733a aVar) {
        aVar.mo74318e(1, this.f228225d);
    }
}
