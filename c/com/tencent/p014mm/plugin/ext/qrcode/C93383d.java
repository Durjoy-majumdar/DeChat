package com.tencent.p014mm.plugin.ext.qrcode;

import android.graphics.Rect;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2encoder;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.ext.qrcode.d */
public class C93383d {

    /* renamed from: a */
    public static SparseArray<byte[]> f269564a = new SparseArray<>(1);

    /* renamed from: com.tencent.mm.plugin.ext.qrcode.d$a */
    public static class C93384a {
        /* renamed from: a */
        public C93385b mo128187a(String str, boolean z) {
            String str2 = null;
            if (!C86013q1.m106450k(str)) {
                Log.m105928w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: handle not exist");
                return null;
            }
            byte[] O = C86013q1.m106433O(str, 0, -1);
            if (O == null || O.length <= 14) {
                Log.m105928w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: invalid yuv handle file!!");
                return null;
            }
            if (z) {
                str2 = C90193h.m112878f(O);
            }
            String str3 = str2;
            byte[] bArr = new byte[4];
            System.arraycopy(O, 0, bArr, 0, 4);
            byte[] bArr2 = new byte[4];
            System.arraycopy(O, 4, bArr2, 0, 4);
            byte[] bArr3 = new byte[4];
            System.arraycopy(O, 8, bArr3, 0, 4);
            byte[] bArr4 = new byte[4];
            System.arraycopy(O, 12, bArr4, 0, 4);
            byte[] bArr5 = new byte[4];
            System.arraycopy(O, 16, bArr5, 0, 4);
            byte[] bArr6 = new byte[4];
            System.arraycopy(O, 20, bArr6, 0, 4);
            byte[] bArr7 = new byte[4];
            System.arraycopy(O, 24, bArr7, 0, 4);
            int length = O.length - 28;
            byte[] bArr8 = C93383d.f269564a.get(length);
            if (bArr8 == null) {
                bArr8 = new byte[length];
                C93383d.f269564a.put(length, bArr8);
            }
            System.arraycopy(O, 28, bArr8, 0, length);
            int a = C93383d.m117944a(bArr);
            int a2 = C93383d.m117944a(bArr2);
            int a3 = C93383d.m117944a(bArr3);
            int a4 = C93383d.m117944a(bArr4);
            int a5 = C93383d.m117944a(bArr5);
            int a6 = C93383d.m117944a(bArr6);
            C93385b bVar = new C93385b(bArr8, a, a2, C93383d.m117944a(bArr7), new Rect(a3, a4, a5 + a3, a6 + a4), str3);
            Log.m105925i("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: retrieved result: %s", bVar);
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ext.qrcode.d$b */
    public static class C93385b {

        /* renamed from: a */
        public byte[] f269565a;

        /* renamed from: b */
        public int f269566b;

        /* renamed from: c */
        public int f269567c;

        /* renamed from: d */
        public int f269568d;

        /* renamed from: e */
        public Rect f269569e;

        /* renamed from: f */
        public String f269570f;

        public C93385b(byte[] bArr, int i, int i2, int i3, Rect rect, String str) {
            this.f269565a = bArr;
            this.f269566b = i;
            this.f269567c = i2;
            this.f269568d = i3;
            this.f269569e = rect;
            this.f269570f = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RetrieveResult{yuvDataLength=");
            byte[] bArr = this.f269565a;
            sb.append(bArr != null ? Integer.valueOf(bArr.length) : "null");
            sb.append(", previewWidth=");
            sb.append(this.f269566b);
            sb.append(", previewHeight=");
            sb.append(this.f269567c);
            sb.append(", rotate=");
            sb.append(this.f269568d);
            sb.append(", scanRect=");
            sb.append(this.f269569e);
            sb.append(", md5=");
            sb.append(this.f269570f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m117944a(byte[] bArr) {
        return ((bArr[0] & ExifInterface.MARKER) << 24) | (bArr[3] & ExifInterface.MARKER) | ((bArr[2] & ExifInterface.MARKER) << 8) | ((bArr[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
    }
}
