package w41;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.RandomAccessFile;

/* renamed from: w41.d */
public class C15036d {
    /* renamed from: a */
    public static byte[] m14203a(C86009m1 m1Var) {
        String i = m1Var.mo119971i();
        byte[] bArr = null;
        if (i != null && i.length() > 0) {
            RandomAccessFile B = C86013q1.m106420B(i, false);
            if (B.length() == 0) {
                B.close();
                Log.m105924i("MicroMsg.Channel.ZipEocdCommentTool", "apk file length is zero");
            } else {
                try {
                    bArr = C118750f.m167443a(new C86009m1(i));
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.Channel.ZipEocdCommentTool", "readComment, error: %s", e.getMessage());
                }
                B.close();
            }
        }
        return bArr;
    }
}
