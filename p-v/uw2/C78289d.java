package uw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

/* renamed from: uw2.d */
public class C78289d {

    /* renamed from: a */
    public RandomAccessFile f229328a = null;

    /* renamed from: b */
    public String f229329b;

    /* renamed from: uw2.d$a */
    public static class C78290a {

        /* renamed from: a */
        public byte[] f229330a = null;

        /* renamed from: b */
        public int f229331b = 0;

        /* renamed from: c */
        public int f229332c = 0;

        /* renamed from: d */
        public int f229333d = 0;
    }

    public C78289d(String str) {
        this.f229329b = str;
    }

    /* renamed from: b */
    public static int m94577b(String str) {
        int r;
        Assert.assertTrue(str.length() >= 0);
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && (r = (int) m1Var.mo119980r()) > 0) {
            return r;
        }
        return 0;
    }

    /* renamed from: a */
    public void mo108308a() {
        RandomAccessFile randomAccessFile = this.f229328a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f229328a = null;
                Log.m105918d("MicroMsg.SpxFileOperator", "Close :" + this.f229329b);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public C78290a mo108309c(int i, int i2) {
        C78290a aVar = new C78290a();
        if (i < 0 || i2 <= 0) {
            aVar.f229333d = -3;
            return aVar;
        }
        if (this.f229328a == null) {
            boolean z = true;
            Assert.assertTrue(this.f229329b.length() >= 0);
            Assert.assertTrue(this.f229328a == null);
            Log.m105918d("MicroMsg.SpxFileOperator", "Open file:" + this.f229328a + " forWrite:" + false);
            try {
                this.f229328a = C86013q1.m106420B(this.f229329b, false);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.f229329b + "] failed:[" + e.getMessage() + "]");
                this.f229328a = null;
                z = false;
            }
            if (!z) {
                aVar.f229333d = -2;
                return aVar;
            }
        }
        aVar.f229330a = new byte[i2];
        try {
            long length = this.f229328a.length();
            this.f229328a.seek((long) i);
            int read = this.f229328a.read(aVar.f229330a, 0, i2);
            Log.m105918d("MicroMsg.SpxFileOperator", "DBG: ReadFile[" + this.f229329b + "] readOffset:" + i + " readRet:" + read + " fileNow:" + this.f229328a.getFilePointer() + " fileSize:" + length);
            if (read < 0) {
                read = 0;
            }
            aVar.f229331b = read;
            aVar.f229332c = read + i;
            aVar.f229333d = 0;
            return aVar;
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.f229329b + "] Offset:" + i + "  failed:[" + e2.getMessage() + "] ");
            mo108308a();
            aVar.f229333d = -1;
            return aVar;
        }
    }
}
