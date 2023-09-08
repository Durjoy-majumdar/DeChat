package te3;

import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rv3 */
public class C51163rv3 extends C47465a {

    /* renamed from: d */
    public String f141175d;

    /* renamed from: e */
    public boolean f141176e;

    /* renamed from: b */
    public String mo73355b() {
        return this.f141175d;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51163rv3)) {
            return false;
        }
        C51163rv3 rv32 = (C51163rv3) aVar;
        String str = this.f141175d;
        if (str == null && rv32.f141175d == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(rv32.f141175d);
    }

    public int computeSize() {
        return (this.f141176e ? C52418a.m58683j(1, this.f141175d) + 0 : 0) + 0;
    }

    /* renamed from: d */
    public C51163rv3 mo73356d(byte[] bArr) {
        C102122a aVar = new C102122a(bArr, C47465a.unknownTagHandler);
        for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
            if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                aVar.mo141624b();
            }
        }
        return this;
    }

    /* renamed from: f */
    public C51163rv3 mo73357f(String str) {
        this.f141175d = str;
        this.f141176e = true;
        return this;
    }

    public /* bridge */ /* synthetic */ C47465a parseFrom(byte[] bArr) {
        mo73356d(bArr);
        return this;
    }

    public boolean populateBuilderWithField(C102122a aVar, C47465a aVar2, int i) {
        C51163rv3 rv32 = (C51163rv3) aVar2;
        if (i != 1) {
            return false;
        }
        rv32.mo73357f(aVar.mo141633k(i));
        return true;
    }

    public byte[] toByteArray() {
        return super.toByteArray();
    }

    public Object toJSON() {
        return this.f141175d;
    }

    public String toString() {
        return this.f141175d;
    }

    public C47465a validate() {
        return this;
    }

    public void writeFields(C53733a aVar) {
        if (this.f141176e) {
            aVar.mo74323j(1, this.f141175d);
        }
    }
}
