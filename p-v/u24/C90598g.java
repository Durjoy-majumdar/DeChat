package u24;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import w24.C90891d;
import x24.C91135a;

/* renamed from: u24.g */
public class C90598g {
    static {
        String.valueOf('\"');
    }

    /* renamed from: a */
    public static String m113502a(String str) {
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            m113503b(stringWriter, str, true, true);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C37334j(e);
        }
    }

    /* renamed from: b */
    public static void m113503b(Writer writer, String str, boolean z, boolean z2) {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        } else if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt > 4095) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("\\u");
                    stringBuffer.append(m113504c(charAt));
                    writer.write(stringBuffer.toString());
                } else if (charAt > 255) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("\\u0");
                    stringBuffer2.append(m113504c(charAt));
                    writer.write(stringBuffer2.toString());
                } else if (charAt > 127) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("\\u00");
                    stringBuffer3.append(m113504c(charAt));
                    writer.write(stringBuffer3.toString());
                } else if (charAt < ' ') {
                    switch (charAt) {
                        case 8:
                            writer.write(92);
                            writer.write(98);
                            break;
                        case 9:
                            writer.write(92);
                            writer.write(116);
                            break;
                        case 10:
                            writer.write(92);
                            writer.write(110);
                            break;
                        case 12:
                            writer.write(92);
                            writer.write(102);
                            break;
                        case 13:
                            writer.write(92);
                            writer.write(114);
                            break;
                        default:
                            if (charAt <= 15) {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("\\u000");
                                stringBuffer4.append(m113504c(charAt));
                                writer.write(stringBuffer4.toString());
                                break;
                            } else {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("\\u00");
                                stringBuffer5.append(m113504c(charAt));
                                writer.write(stringBuffer5.toString());
                                break;
                            }
                    }
                } else if (charAt == '\"') {
                    writer.write(92);
                    writer.write(34);
                } else if (charAt == '\'') {
                    if (z) {
                        writer.write(92);
                    }
                    writer.write(39);
                } else if (charAt == '/') {
                    if (z2) {
                        writer.write(92);
                    }
                    writer.write(47);
                } else if (charAt != '\\') {
                    writer.write(charAt);
                } else {
                    writer.write(92);
                    writer.write(92);
                }
            }
        }
    }

    /* renamed from: c */
    public static String m113504c(char c) {
        return Integer.toHexString(c).toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: d */
    public static String m113505d(String str) {
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length());
            m113506e(stringWriter, str);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C37334j(e);
        }
    }

    /* renamed from: e */
    public static void m113506e(Writer writer, String str) {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        } else if (str != null) {
            int length = str.length();
            C91135a aVar = new C91135a(4);
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (z2) {
                    aVar.mo125202b(aVar.f261354e + 1);
                    char[] cArr = aVar.f261353d;
                    int i2 = aVar.f261354e;
                    int i3 = i2 + 1;
                    aVar.f261354e = i3;
                    cArr[i2] = charAt;
                    if (i3 == 4) {
                        try {
                            writer.write((char) Integer.parseInt(aVar.toString(), 16));
                            int i4 = aVar.f261354e;
                            if (i4 > 0) {
                                aVar.f261354e = 0;
                            } else if (i4 < 0) {
                                aVar.mo125202b(0);
                                aVar.f261354e = 0;
                                for (int i5 = aVar.f261354e; i5 < 0; i5++) {
                                    aVar.f261353d[i5] = 0;
                                }
                            }
                            z = false;
                            z2 = false;
                        } catch (NumberFormatException e) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Unable to parse unicode value: ");
                            stringBuffer.append(aVar);
                            throw new C90891d(stringBuffer.toString(), e);
                        }
                    }
                } else if (z) {
                    if (charAt == '\"') {
                        writer.write(34);
                    } else if (charAt == '\'') {
                        writer.write(39);
                    } else if (charAt == '\\') {
                        writer.write(92);
                    } else if (charAt == 'b') {
                        writer.write(8);
                    } else if (charAt == 'f') {
                        writer.write(12);
                    } else if (charAt == 'n') {
                        writer.write(10);
                    } else if (charAt == 'r') {
                        writer.write(13);
                    } else if (charAt == 't') {
                        writer.write(9);
                    } else if (charAt != 'u') {
                        writer.write(charAt);
                    } else {
                        z = false;
                        z2 = true;
                    }
                    z = false;
                } else if (charAt == '\\') {
                    z = true;
                } else {
                    writer.write(charAt);
                }
            }
            if (z) {
                writer.write(92);
            }
        }
    }

    /* renamed from: f */
    public static String m113507f(String str) {
        if (str == null) {
            return null;
        }
        C118563c cVar = C118563c.f354837e;
        cVar.getClass();
        int indexOf = str.indexOf(38);
        if (indexOf < 0) {
            return str;
        }
        StringWriter stringWriter = new StringWriter((int) (((double) str.length()) + (((double) str.length()) * 0.1d)));
        try {
            cVar.mo183328b(stringWriter, str, indexOf);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C37334j(e);
        }
    }
}
