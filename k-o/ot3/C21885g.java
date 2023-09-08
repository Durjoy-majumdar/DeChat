package ot3;

/* renamed from: ot3.g */
public class C21885g {

    /* renamed from: a */
    public int f61886a;

    /* renamed from: b */
    public String f61887b;

    public C21885g(int i, String str) {
        this(i);
        if (!C117896h.m166297b(str)) {
            this.f61887b = str;
        }
    }

    /* renamed from: a */
    public boolean mo34909a() {
        return this.f61886a == 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C21885g) && ((C21885g) obj).f61886a == this.f61886a;
    }

    public String toString() {
        return "SoterCoreResult{errCode=" + this.f61886a + ", errMsg='" + this.f61887b + '\'' + '}';
    }

    public C21885g(int i) {
        this.f61886a = i;
        if (i == 0) {
            this.f61887b = "ok";
        } else if (i != 2) {
            this.f61887b = "errmsg not specified";
        } else {
            this.f61887b = "device not support soter";
        }
    }
}
