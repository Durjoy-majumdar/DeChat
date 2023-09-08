package uc0;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.xweb.FileReaderHelper;

/* renamed from: uc0.e0 */
public class C101995e0 implements C86011o1 {
    public boolean accept(C86009m1 m1Var) {
        return m1Var.getName().endsWith(FileReaderHelper.TXT_EXT);
    }
}
