package fn0;

/* renamed from: fn0.f */
public class C87001f implements C87003h<String> {
    /* renamed from: a */
    public boolean mo121404a(byte[] bArr) {
        int i = C87002g.f252486a;
        boolean z = false;
        if (bArr != null && bArr.length > 100) {
            byte[] bArr2 = new byte[100];
            System.arraycopy(bArr, 0, bArr2, 0, 100);
            z = new String(bArr2).toLowerCase().replaceAll("\\s", "").contains("<html");
        }
        return !z;
    }
}
