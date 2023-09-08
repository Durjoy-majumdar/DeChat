package p571j6;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: j6.j */
public class C33519j extends RuntimeException {
    public C33519j(String str, int i, int i2, int i3) {
        super(str + " at " + i2 + XVFSFile.PATH_SEPARATOR + i3);
    }
}
