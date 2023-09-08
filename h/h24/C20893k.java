package h24;

import d24.C116554w;
import java.net.ProtocolException;

/* renamed from: h24.k */
public final class C20893k {

    /* renamed from: a */
    public final C116554w f59035a;

    /* renamed from: b */
    public final int f59036b;

    /* renamed from: c */
    public final String f59037c;

    public C20893k(C116554w wVar, int i, String str) {
        this.f59035a = wVar;
        this.f59036b = i;
        this.f59037c = str;
    }

    /* renamed from: a */
    public static C20893k m22984a(String str) {
        String str2;
        C116554w wVar = C116554w.HTTP_1_0;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    wVar = C116554w.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C20893k(wVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f59035a == C116554w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f59036b);
        if (this.f59037c != null) {
            sb.append(' ');
            sb.append(this.f59037c);
        }
        return sb.toString();
    }
}
