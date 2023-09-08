package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.p0 */
public class C23922p0 extends IOException {

    /* renamed from: d */
    public C23845j1 f68530d = null;

    /* renamed from: com.google.protobuf.p0$a */
    public static class C23923a extends C23922p0 {
        public C23923a(String str) {
            super(str);
        }
    }

    public C23922p0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C23922p0 m29476a() {
        return new C23922p0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static C23922p0 m29477b() {
        return new C23922p0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static C23922p0 m29478c() {
        return new C23922p0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static C23923a m29479d() {
        return new C23923a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C23922p0 m29480e() {
        return new C23922p0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static C23922p0 m29481f() {
        return new C23922p0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static C23922p0 m29482g() {
        return new C23922p0("Failed to parse the message.");
    }

    /* renamed from: h */
    public static C23922p0 m29483h() {
        return new C23922p0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    public static C23922p0 m29484i() {
        return new C23922p0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: j */
    public IOException mo38013j() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public C23922p0(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}
