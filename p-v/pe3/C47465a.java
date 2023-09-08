package pe3;

import v14.C102122a;
import w14.C102302b;
import w14.C53072a;
import y14.C53486a;
import z14.C53733a;

/* renamed from: pe3.a */
public class C47465a {
    public static final int OPCODE_COMPUTESIZE = 1;
    public static final int OPCODE_PARSEFROM = 2;
    public static final int OPCODE_POPULATEBUILDERWITHFIELD = 3;
    public static final int OPCODE_WRITEFIELDS = 0;
    public static C102302b unknownTagHandler = new C53072a();
    private boolean includeUnKnownField = false;
    private byte[] pbData;

    public static int getNextFieldNumber(C102122a aVar) {
        return aVar.mo141623a();
    }

    public boolean compareContent(C47465a aVar) {
        return equals(aVar);
    }

    public int computeSize() {
        try {
            return mo24180op(1, new Object[0]);
        } catch (Exception unused) {
            return 0;
        }
    }

    public byte[] getData() {
        return this.pbData;
    }

    public boolean isIncludeUnKnownField() {
        return this.includeUnKnownField;
    }

    /* renamed from: op */
    public int mo24180op(int i, Object... objArr) {
        throw new Error("Cannot use this method");
    }

    public C47465a parseFrom(byte[] bArr) {
        this.pbData = bArr;
        mo24180op(2, bArr);
        return this;
    }

    public boolean populateBuilderWithField(C102122a aVar, C47465a aVar2, int i) {
        boolean z = false;
        boolean z2 = mo24180op(3, aVar, aVar2, Integer.valueOf(i)) == 0;
        if (this.includeUnKnownField || !z2) {
            z = true;
        }
        this.includeUnKnownField = z;
        return z2;
    }

    public byte[] toByteArray() {
        validate();
        byte[] bArr = new byte[computeSize()];
        C53733a aVar = new C53733a(bArr);
        writeFields(aVar);
        C53486a aVar2 = aVar.f150850a;
        int i = aVar2.f150405b;
        int i2 = aVar2.f150406c;
        if (i - i2 == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    public Object toJSON() {
        return "";
    }

    public C47465a toPb(String str) {
        return this;
    }

    public C47465a validate() {
        return this;
    }

    public void writeFields(C53733a aVar) {
        mo24180op(0, aVar);
    }
}
