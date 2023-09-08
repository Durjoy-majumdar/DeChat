package a02;

/* renamed from: a02.e */
public class C112708e {

    /* renamed from: a */
    public int f337440a;

    /* renamed from: b */
    public String f337441b;

    public C112708e(int i, String str) {
        this.f337440a = i;
        if (str == null || str.trim().length() == 0) {
            this.f337441b = C112700b.m154103f(i);
            return;
        }
        this.f337441b = str + " (response: " + C112700b.m154103f(i) + ")";
    }

    /* renamed from: a */
    public int mo164443a() {
        int i = this.f337440a;
        if (i == -2001) {
            return 3;
        }
        if (i == -1009) {
            return 5;
        }
        if (i == -1004) {
            return 3;
        }
        switch (i) {
            case -1002:
            case -1001:
            case -1000:
                return 5;
            default:
                switch (i) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        return 5;
                    case 5:
                        return 6;
                    case 7:
                        return 100000002;
                    case 8:
                        return 106;
                    default:
                        return i;
                }
        }
    }

    public String toString() {
        return "IapResult: " + this.f337441b;
    }
}
