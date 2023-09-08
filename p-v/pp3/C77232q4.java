package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.RC4EncryptedFileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.q4 */
public final class C77232q4 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C77232q4 f225342d = new C77232q4();

    public C77232q4() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        return new RC4EncryptedFileSystem(fileSystem, "msgsynchoronize");
    }
}
