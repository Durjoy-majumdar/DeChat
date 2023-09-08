package com.tencent.p014mm.hardcoder;

/* renamed from: com.tencent.mm.hardcoder.h */
public class C17774h {

    /* renamed from: a */
    public static C17775a f48943a;

    /* renamed from: com.tencent.mm.hardcoder.h$a */
    public interface C17775a {
        /* renamed from: d */
        void mo21742d(String str, String str2);

        /* renamed from: e */
        void mo21743e(String str, String str2);

        /* renamed from: i */
        void mo21744i(String str, String str2);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);
    }

    /* renamed from: a */
    public static void m18164a(String str, String str2) {
        C17775a aVar;
        if (HardCoderJNI.isHcDebug() && (aVar = f48943a) != null) {
            aVar.mo21742d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m18165b(String str, String str2) {
        C17775a aVar = f48943a;
        if (aVar != null) {
            aVar.mo21743e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m18166c(String str, String str2) {
        C17775a aVar = f48943a;
        if (aVar != null) {
            aVar.mo21744i(str, str2);
        }
    }
}
