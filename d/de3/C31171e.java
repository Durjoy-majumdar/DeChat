package de3;

/* renamed from: de3.e */
public class C31171e {

    /* renamed from: d */
    public static C31171e f83548d = new C31171e();

    /* renamed from: a */
    public int f83549a;

    /* renamed from: b */
    public int f83550b;

    /* renamed from: c */
    public C31173b f83551c;

    /* renamed from: de3.e$b */
    public class C31173b {

        /* renamed from: a */
        public boolean f83552a;

        /* renamed from: b */
        public C31173b[] f83553b;

        public C31173b(C31171e eVar, C31172a aVar) {
        }
    }

    /* renamed from: a */
    public void mo58012a(String str) {
        if (this.f83551c == null) {
            this.f83551c = new C31173b(this, (C31172a) null);
        }
        char[] charArray = str.toUpperCase().toCharArray();
        C31173b bVar = this.f83551c;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            this.f83549a++;
            int i2 = c <= '9' ? c - '0' : (c - 'A') + 10;
            if (bVar.f83553b == null) {
                bVar.f83553b = new C31173b[36];
                this.f83550b += 36;
            }
            C31173b[] bVarArr = bVar.f83553b;
            if (bVarArr[i2] == null) {
                bVarArr[i2] = new C31173b(this, (C31172a) null);
                this.f83550b++;
            }
            bVar = bVarArr[i2];
            if (i == charArray.length - 1) {
                bVar.f83552a = true;
            }
        }
    }
}
