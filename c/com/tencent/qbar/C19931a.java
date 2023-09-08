package com.tencent.qbar;

import com.tencent.qbar.QbarNative;
import java.io.PrintStream;

/* renamed from: com.tencent.qbar.a */
public class C19931a {

    /* renamed from: a */
    public int f56825a = -1;

    /* renamed from: b */
    public QbarNative f56826b = new QbarNative();

    /* renamed from: com.tencent.qbar.a$a */
    public static class C19932a {

        /* renamed from: d */
        public int f56827d;

        /* renamed from: e */
        public String f56828e;

        /* renamed from: f */
        public String f56829f;

        /* renamed from: g */
        public byte[] f56830g;

        /* renamed from: h */
        public String f56831h;

        /* renamed from: i */
        public int f56832i;
    }

    /* renamed from: a */
    public int mo27306a(int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, String str, String str2, QbarNative.QbarAiModelParam qbarAiModelParam) {
        synchronized (this) {
            if (this.f56825a < 0) {
                this.f56825a = this.f56826b.Init(i, z, z2, z3, z4, i2, i3, str, str2, qbarAiModelParam);
            }
            PrintStream printStream = System.out;
            printStream.println("qbarId:" + this.f56825a);
            return this.f56825a < 0 ? -1 : 0;
        }
    }

    /* renamed from: b */
    public int mo27307b(byte[] bArr, int i, int i2) {
        synchronized (this) {
            int i3 = this.f56825a;
            if (i3 < 0) {
                return -1;
            }
            int ScanImage = this.f56826b.ScanImage(bArr, i, i2, i3);
            return ScanImage;
        }
    }
}
