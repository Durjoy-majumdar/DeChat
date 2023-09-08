package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import junit.framework.Assert;

/* renamed from: kd0.a */
public class C76534a implements C76537d {

    /* renamed from: a */
    public RandomAccessFile f223987a = null;

    /* renamed from: b */
    public String f223988b;

    public C76534a(String str) {
        this.f223988b = str;
    }

    /* renamed from: a */
    public int mo106768a(byte[] bArr, int i, int i2) {
        boolean z;
        boolean z2 = true;
        Assert.assertTrue(bArr.length > 0 && i > 0);
        if (this.f223987a == null && !mo106773f(true)) {
            return -1;
        }
        Log.m105925i("MicroMsg.AmrFileOperator", "writeOffset:%d, bufLen:%d", Integer.valueOf(i2), Integer.valueOf(i));
        if (i2 == 0) {
            z = mo106772e(bArr);
            if (!z) {
                try {
                    this.f223987a.write("#!AMR\n".getBytes(), 0, 6);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.AmrFileOperator", "ERR: WriteHeadToFile[" + this.f223988b + "] failed:[" + e.getMessage() + "]");
                    mo106769b();
                    return -2;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            i2 += 6;
        }
        try {
            this.f223987a.seek((long) i2);
            this.f223987a.write(bArr, 0, i);
            int i3 = i2 + i;
            Assert.assertTrue(((int) this.f223987a.getFilePointer()) == i3);
            int i4 = i3 - 6;
            if (i4 < 0) {
                z2 = false;
            }
            Assert.assertTrue(z2);
            return i4;
        } catch (Exception e2) {
            Log.m105920e("MicroMsg.AmrFileOperator", "ERR: WriteFile[" + this.f223988b + "] Offset:" + i2 + " failed:[" + e2.getMessage() + "]");
            mo106769b();
            return -3;
        }
    }

    /* renamed from: b */
    public void mo106769b() {
        RandomAccessFile randomAccessFile = this.f223987a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f223987a = null;
                Log.m105918d("MicroMsg.AmrFileOperator", "Close :" + this.f223988b);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public int mo106770c(String str) {
        long r;
        Log.m105925i("MicroMsg.AmrFileOperator", "write: fromPath %s, toPath %s", str, this.f223988b);
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            Log.m105920e("MicroMsg.AmrFileOperator", "write: file not exists");
            return -1;
        }
        byte[] O = C86013q1.m106433O(str, 0, (int) m1Var.mo119980r());
        byte[] bytes = "#!AMR\n".getBytes();
        if (mo106772e(O)) {
            if (C86013q1.m106463x(str, this.f223988b)) {
                C86009m1 m1Var2 = new C86009m1(this.f223988b);
                if (m1Var2.mo119967g()) {
                    Log.m105925i("MicroMsg.AmrFileOperator", "write: copy success, file size: %d", Long.valueOf(m1Var2.mo119980r()));
                    r = m1Var2.mo119980r();
                } else {
                    Log.m105920e("MicroMsg.AmrFileOperator", "write: copy file error");
                }
            }
            return -1;
        }
        OutputStream outputStream = null;
        try {
            C86013q1.m106461v(C86013q1.m106458s(this.f223988b));
            outputStream = C86013q1.m106429K(this.f223988b, false);
            outputStream.write(bytes);
            outputStream.write(O);
            outputStream.flush();
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
            C86009m1 m1Var3 = new C86009m1(this.f223988b);
            if (!m1Var3.mo119967g()) {
                Log.m105920e("MicroMsg.AmrFileOperator", "write: write file error, new file not exists");
                return -1;
            } else if (m1Var3.mo119980r() == m1Var.mo119980r() + ((long) bytes.length)) {
                Log.m105925i("MicroMsg.AmrFileOperator", "write: new file length %d", Long.valueOf(m1Var3.mo119980r()));
                C86013q1.m106447h(str);
                r = m1Var3.mo119980r();
            } else {
                Log.m105921e("MicroMsg.AmrFileOperator", "write: write file error, length %d, oldLength %d", Long.valueOf(m1Var3.mo119980r()), Long.valueOf(m1Var.mo119980r()));
                return -1;
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AmrFileOperator", "moveWithOp: write exception", e);
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        return (int) r;
    }

    /* renamed from: d */
    public C60998j mo106771d(int i, int i2) {
        C60998j jVar = new C60998j();
        if (i < 0 || i2 <= 0) {
            jVar.f173722d = -3;
            return jVar;
        } else if (this.f223987a != null || mo106773f(false)) {
            int i3 = i + 6;
            jVar.f173719a = new byte[i2];
            try {
                long length = this.f223987a.length();
                this.f223987a.seek((long) i3);
                int read = this.f223987a.read(jVar.f173719a, 0, i2);
                Log.m105918d("MicroMsg.AmrFileOperator", "DBG: ReadFile[" + this.f223988b + "] readOffset:" + i3 + " readRet:" + read + " fileNow:" + this.f223987a.getFilePointer() + " fileSize:" + length);
                if (read < 0) {
                    read = 0;
                }
                jVar.f173720b = read;
                jVar.f173721c = (read + i3) - 6;
                jVar.f173722d = 0;
                return jVar;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AmrFileOperator", "ERR: ReadFile[" + this.f223988b + "] Offset:" + i3 + "  failed:[" + e.getMessage() + "] ");
                mo106769b();
                jVar.f173722d = -1;
                return jVar;
            }
        } else {
            jVar.f173722d = -2;
            return jVar;
        }
    }

    /* renamed from: e */
    public final boolean mo106772e(byte[] bArr) {
        String str = null;
        try {
            if (bArr.length > "#!AMR\n".getBytes().length) {
                str = new String(bArr, 0, "#!AMR\n".getBytes().length);
            }
            if (str != null && str.startsWith("#!AMR\n")) {
                Log.m105924i("MicroMsg.AmrFileOperator", "content inBuf already has amr header, ignore write header");
                return true;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AmrFileOperator", e, "", new Object[0]);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo106773f(boolean z) {
        Assert.assertTrue(this.f223988b.length() >= 0);
        Assert.assertTrue(this.f223987a == null);
        Log.m105918d("MicroMsg.AmrFileOperator", "Open file:" + this.f223987a + " forWrite:" + z);
        if (z) {
            C86013q1.m106461v(C86013q1.m106458s(this.f223988b));
        }
        try {
            this.f223987a = C86013q1.m106420B(this.f223988b, z);
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.AmrFileOperator", "ERR: OpenFile[" + this.f223988b + "] failed:[" + e.getMessage() + "]");
            this.f223987a = null;
            return false;
        }
    }

    public int getFormat() {
        return 0;
    }
}
