package sr3;

import java.io.Reader;
import java.util.HashMap;

/* renamed from: sr3.j */
public class C118299j extends C118296g {

    /* renamed from: i */
    public static final HashMap<String, Character> f353564i;

    static {
        HashMap<String, Character> hashMap = new HashMap<>(8);
        f353564i = hashMap;
        hashMap.put("amp", C118297h.f353550a);
        hashMap.put("apos", C118297h.f353551b);
        hashMap.put("gt", C118297h.f353554e);
        hashMap.put("lt", C118297h.f353555f);
        hashMap.put("quot", C118297h.f353557h);
    }

    public C118299j(Reader reader) {
        super(reader);
    }

    /* renamed from: g */
    public Object mo183086g(char c) {
        char c2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            c2 = mo183080c();
            if (!Character.isLetterOrDigit(c2) && c2 != '#') {
                break;
            }
            sb.append(Character.toLowerCase(c2));
        }
        if (c2 == ';') {
            String sb4 = sb.toString();
            if (sb4 == null || sb4.isEmpty()) {
                return "";
            }
            if (sb4.charAt(0) == '#') {
                return new String(new int[]{(sb4.charAt(1) == 'x' || sb4.charAt(1) == 'X') ? Integer.parseInt(sb4.substring(2), 16) : Integer.parseInt(sb4.substring(1))}, 0, 1);
            }
            Character ch = f353564i.get(sb4);
            if (ch != null) {
                return ch.toString();
            }
            return '&' + sb4 + ';';
        }
        throw mo183083f("Missing ';' in XML entity: &" + sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        throw mo183083f("Bad character in a name");
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[LOOP_START, PHI: r0 
      PHI: (r0v13 char) = (r0v0 char), (r0v14 char) binds: [B:12:0x001f, B:26:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo183087h() {
        /*
            r7 = this;
        L_0x0000:
            char r0 = r7.mo183080c()
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto L_0x0000
            if (r0 == 0) goto L_0x009f
            r1 = 39
            if (r0 == r1) goto L_0x0076
            r2 = 47
            if (r0 == r2) goto L_0x0073
            r3 = 33
            if (r0 == r3) goto L_0x0070
            r4 = 34
            if (r0 == r4) goto L_0x0076
            switch(r0) {
                case 60: goto L_0x0069;
                case 61: goto L_0x0066;
                case 62: goto L_0x0063;
                case 63: goto L_0x0060;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x0024:
            r5.append(r0)
            char r0 = r7.mo183080c()
            boolean r6 = java.lang.Character.isWhitespace(r0)
            if (r6 == 0) goto L_0x0036
            java.lang.String r0 = r5.toString()
            return r0
        L_0x0036:
            if (r0 == 0) goto L_0x005b
            if (r0 == r1) goto L_0x0054
            if (r0 == r2) goto L_0x004c
            r6 = 91
            if (r0 == r6) goto L_0x004c
            r6 = 93
            if (r0 == r6) goto L_0x004c
            if (r0 == r3) goto L_0x004c
            if (r0 == r4) goto L_0x0054
            switch(r0) {
                case 60: goto L_0x0054;
                case 61: goto L_0x004c;
                case 62: goto L_0x004c;
                case 63: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0024
        L_0x004c:
            r7.mo183078a()
            java.lang.String r0 = r5.toString()
            return r0
        L_0x0054:
            java.lang.String r0 = "Bad character in a name"
            sr3.b r0 = r7.mo183083f(r0)
            throw r0
        L_0x005b:
            java.lang.String r0 = r5.toString()
            return r0
        L_0x0060:
            java.lang.Character r0 = sr3.C118297h.f353556g
            return r0
        L_0x0063:
            java.lang.Character r0 = sr3.C118297h.f353554e
            return r0
        L_0x0066:
            java.lang.Character r0 = sr3.C118297h.f353553d
            return r0
        L_0x0069:
            java.lang.String r0 = "Misplaced '<'"
            sr3.b r0 = r7.mo183083f(r0)
            throw r0
        L_0x0070:
            java.lang.Character r0 = sr3.C118297h.f353552c
            return r0
        L_0x0073:
            java.lang.Character r0 = sr3.C118297h.f353558i
            return r0
        L_0x0076:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x007b:
            char r2 = r7.mo183080c()
            if (r2 == 0) goto L_0x0098
            if (r2 != r0) goto L_0x0088
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0088:
            r3 = 38
            if (r2 != r3) goto L_0x0094
            java.lang.Object r2 = r7.mo183086g(r2)
            r1.append(r2)
            goto L_0x007b
        L_0x0094:
            r1.append(r2)
            goto L_0x007b
        L_0x0098:
            java.lang.String r0 = "Unterminated string"
            sr3.b r0 = r7.mo183083f(r0)
            throw r0
        L_0x009f:
            java.lang.String r0 = "Misshaped element"
            sr3.b r0 = r7.mo183083f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118299j.mo183087h():java.lang.Object");
    }

    /* renamed from: i */
    public void mo183088i(String str) {
        boolean z;
        char c;
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        while (i < length) {
            char c2 = mo183080c();
            if (c2 != 0) {
                cArr[i] = c2;
                i++;
            } else {
                return;
            }
        }
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z = true;
                    break;
                } else if (cArr[i3] != str.charAt(i4)) {
                    z = false;
                    break;
                } else {
                    i3++;
                    if (i3 >= length) {
                        i3 -= length;
                    }
                    i4++;
                }
            }
            if (!z && (c = mo183080c()) != 0) {
                cArr[i2] = c;
                i2++;
                if (i2 >= length) {
                    i2 -= length;
                }
            } else {
                return;
            }
        }
    }
}
