package sr3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/* renamed from: sr3.g */
public class C118296g {

    /* renamed from: a */
    public long f353542a;

    /* renamed from: b */
    public boolean f353543b;

    /* renamed from: c */
    public long f353544c;

    /* renamed from: d */
    public long f353545d;

    /* renamed from: e */
    public char f353546e;

    /* renamed from: f */
    public final Reader f353547f;

    /* renamed from: g */
    public boolean f353548g;

    /* renamed from: h */
    public long f353549h;

    public C118296g(Reader reader) {
        this.f353547f = !reader.markSupported() ? new BufferedReader(reader) : reader;
        this.f353543b = false;
        this.f353548g = false;
        this.f353546e = 0;
        this.f353544c = 0;
        this.f353542a = 1;
        this.f353549h = 0;
        this.f353545d = 1;
    }

    /* renamed from: a */
    public void mo183078a() {
        if (!this.f353548g) {
            long j = this.f353544c;
            if (j > 0) {
                this.f353544c = j - 1;
                char c = this.f353546e;
                if (c == 13 || c == 10) {
                    this.f353545d--;
                    this.f353542a = this.f353549h;
                } else {
                    long j2 = this.f353542a;
                    if (j2 > 0) {
                        this.f353542a = j2 - 1;
                    }
                }
                this.f353548g = true;
                this.f353543b = false;
                return;
            }
        }
        throw new C118289b("Stepping back two steps is not supported");
    }

    /* renamed from: b */
    public boolean mo183079b() {
        if (this.f353548g) {
            return true;
        }
        try {
            this.f353547f.mark(1);
            try {
                if (this.f353547f.read() <= 0) {
                    this.f353543b = true;
                    return false;
                }
                this.f353547f.reset();
                return true;
            } catch (IOException e) {
                throw new C118289b("Unable to read the next character from the stream", e);
            }
        } catch (IOException e2) {
            throw new C118289b("Unable to preserve stream position", e2);
        }
    }

    /* renamed from: c */
    public char mo183080c() {
        int i;
        if (this.f353548g) {
            this.f353548g = false;
            i = this.f353546e;
        } else {
            try {
                i = this.f353547f.read();
            } catch (IOException e) {
                throw new C118289b((Throwable) e);
            }
        }
        if (i <= 0) {
            this.f353543b = true;
            return 0;
        }
        if (i > 0) {
            this.f353544c++;
            if (i == 13) {
                this.f353545d++;
                this.f353549h = this.f353542a;
                this.f353542a = 0;
            } else if (i == 10) {
                if (this.f353546e != 13) {
                    this.f353545d++;
                    this.f353549h = this.f353542a;
                }
                this.f353542a = 0;
            } else {
                this.f353542a++;
            }
        }
        char c = (char) i;
        this.f353546e = c;
        return c;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: d */
    public char mo183081d() {
        /*
            r2 = this;
        L_0x0000:
            char r0 = r2.mo183080c()
            if (r0 == 0) goto L_0x000a
            r1 = 32
            if (r0 <= r1) goto L_0x0000
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sr3.C118296g.mo183081d():char");
    }

    /* renamed from: e */
    public Object mo183082e() {
        char d = mo183081d();
        if (d == '\"' || d == '\'') {
            StringBuilder sb = new StringBuilder();
            while (true) {
                char c = mo183080c();
                if (c != 0 && c != 10 && c != 13) {
                    if (c == '\\') {
                        char c2 = mo183080c();
                        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') {
                            sb.append(c2);
                        } else if (c2 == 'b') {
                            sb.append(8);
                        } else if (c2 == 'f') {
                            sb.append(12);
                        } else if (c2 == 'n') {
                            sb.append(10);
                        } else if (c2 == 'r') {
                            sb.append(13);
                        } else if (c2 == 't') {
                            sb.append(9);
                        } else if (c2 == 'u') {
                            try {
                                char[] cArr = new char[4];
                                int i = 0;
                                while (i < 4) {
                                    cArr[i] = mo183080c();
                                    if (!(this.f353543b && !this.f353548g)) {
                                        i++;
                                    } else {
                                        throw mo183083f("Substring bounds error");
                                    }
                                }
                                sb.append((char) Integer.parseInt(new String(cArr), 16));
                            } catch (NumberFormatException e) {
                                throw new C118289b("Illegal escape." + toString(), e);
                            }
                        } else {
                            throw mo183083f("Illegal escape.");
                        }
                    } else if (c == d) {
                        return sb.toString();
                    } else {
                        sb.append(c);
                    }
                }
            }
            throw mo183083f("Unterminated string");
        } else if (d == '[') {
            mo183078a();
            C118288a aVar = new C118288a();
            if (mo183081d() == '[') {
                char d2 = mo183081d();
                if (d2 != 0) {
                    if (d2 != ']') {
                        mo183078a();
                        while (true) {
                            if (mo183081d() == ',') {
                                mo183078a();
                                aVar.f353538d.add(C118290c.f353540c);
                            } else {
                                mo183078a();
                                aVar.f353538d.add(mo183082e());
                            }
                            char d3 = mo183081d();
                            if (d3 == 0) {
                                throw mo183083f("Expected a ',' or ']'");
                            } else if (d3 == ',') {
                                char d4 = mo183081d();
                                if (d4 == 0) {
                                    throw mo183083f("Expected a ',' or ']'");
                                } else if (d4 == ']') {
                                    break;
                                } else {
                                    mo183078a();
                                }
                            } else if (d3 != ']') {
                                throw mo183083f("Expected a ',' or ']'");
                            }
                        }
                    }
                    return aVar;
                }
                throw mo183083f("Expected a ',' or ']'");
            }
            throw mo183083f("A JSONArray text must start with '['");
        } else if (d != '{') {
            StringBuilder sb4 = new StringBuilder();
            while (d >= ' ' && ",:]}/\\\"[{;=#".indexOf(d) < 0) {
                sb4.append(d);
                d = mo183080c();
            }
            if (!this.f353543b) {
                mo183078a();
            }
            String trim = sb4.toString().trim();
            if ("".equals(trim)) {
                throw mo183083f("Missing value");
            } else if ("".equals(trim)) {
                return trim;
            } else {
                if ("true".equalsIgnoreCase(trim)) {
                    return Boolean.TRUE;
                }
                if ("false".equalsIgnoreCase(trim)) {
                    return Boolean.FALSE;
                }
                if ("null".equalsIgnoreCase(trim)) {
                    return C118290c.f353540c;
                }
                char charAt = trim.charAt(0);
                if ((charAt < '0' || charAt > '9') && charAt != '-') {
                    return trim;
                }
                try {
                    return C118290c.m166868h(trim);
                } catch (Exception unused) {
                    return trim;
                }
            }
        } else {
            mo183078a();
            return new C118290c(this);
        }
    }

    /* renamed from: f */
    public C118289b mo183083f(String str) {
        return new C118289b(str + toString());
    }

    public String toString() {
        return " at " + this.f353544c + " [character " + this.f353542a + " line " + this.f353545d + "]";
    }
}
