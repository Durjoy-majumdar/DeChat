package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.RandomAccessFile;
import junit.framework.Assert;

/* renamed from: kd0.t */
public class C76545t implements C76537d {

    /* renamed from: a */
    public RandomAccessFile f224042a = null;

    /* renamed from: b */
    public String f224043b;

    public C76545t(String str) {
        this.f224043b = str;
    }

    /* renamed from: a */
    public int mo106768a(byte[] bArr, int i, int i2) {
        boolean z = true;
        Assert.assertTrue(bArr.length > 0 && i > 0);
        if (this.f224042a == null && !mo106790e(true)) {
            return -1;
        }
        try {
            this.f224042a.seek((long) i2);
            this.f224042a.write(bArr, 0, i);
            int i3 = i2 + i;
            Assert.assertTrue(((int) this.f224042a.getFilePointer()) == i3);
            if (i3 < 0) {
                z = false;
            }
            Assert.assertTrue(z);
            return i3;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SpxFileOperator", "ERR: WriteFile[" + this.f224043b + "] Offset:" + i2 + " failed:[" + e.getMessage() + "]");
            mo106769b();
            return -3;
        }
    }

    /* renamed from: b */
    public void mo106769b() {
        RandomAccessFile randomAccessFile = this.f224042a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.f224042a = null;
                Log.m105918d("MicroMsg.SpxFileOperator", "Close :" + this.f224043b);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public int mo106770c(String str) {
        Log.m105925i("MicroMsg.SpxFileOperator", "write: fromPath %s, toPath %s", str, this.f224043b);
        if (str.equals(this.f224043b)) {
            Log.m105924i("MicroMsg.SpxFileOperator", "write: no need to move file");
            return 0;
        }
        if (C86013q1.m106463x(str, this.f224043b)) {
            C86009m1 m1Var = new C86009m1(this.f224043b);
            if (m1Var.mo119967g()) {
                Log.m105925i("MicroMsg.SpxFileOperator", "write: copy success, file size: %d", Long.valueOf(m1Var.mo119980r()));
                return (int) m1Var.mo119980r();
            }
            Log.m105920e("MicroMsg.SpxFileOperator", "write: copy file error");
        }
        return -1;
    }

    /* renamed from: d */
    public C60998j mo106771d(int i, int i2) {
        C60998j jVar = new C60998j();
        if (i < 0 || i2 <= 0) {
            jVar.f173722d = -3;
            return jVar;
        } else if (this.f224042a != null || mo106790e(false)) {
            jVar.f173719a = new byte[i2];
            try {
                long length = this.f224042a.length();
                this.f224042a.seek((long) i);
                int read = this.f224042a.read(jVar.f173719a, 0, i2);
                Log.m105918d("MicroMsg.SpxFileOperator", "DBG: ReadFile[" + this.f224043b + "] readOffset:" + i + " readRet:" + read + " fileNow:" + this.f224042a.getFilePointer() + " fileSize:" + length);
                if (read < 0) {
                    read = 0;
                }
                jVar.f173720b = read;
                jVar.f173721c = read + i;
                jVar.f173722d = 0;
                return jVar;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SpxFileOperator", "ERR: ReadFile[" + this.f224043b + "] Offset:" + i + "  failed:[" + e.getMessage() + "] ");
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
    public final boolean mo106790e(boolean z) {
        Assert.assertTrue(this.f224043b.length() >= 0);
        Assert.assertTrue(this.f224042a == null);
        Log.m105918d("MicroMsg.SpxFileOperator", "Open file:" + this.f224042a + " forWrite:" + z);
        if (z) {
            C86013q1.m106461v(C86013q1.m106458s(this.f224043b));
        }
        try {
            this.f224042a = C86013q1.m106420B(this.f224043b, z);
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SpxFileOperator", "ERR: OpenFile[" + this.f224043b + "] failed:[" + e.getMessage() + "]");
            this.f224042a = null;
            return false;
        }
    }

    public int getFormat() {
        return 1;
    }
}
