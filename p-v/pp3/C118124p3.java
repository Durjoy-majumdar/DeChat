package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.AttachmentGCFileSystem;
import com.tencent.p014mm.vfs.FileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.p3 */
public final class C118124p3 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C118124p3 f353128d = new C118124p3();

    public C118124p3() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        AttachmentGCFileSystem attachmentGCFileSystem = new AttachmentGCFileSystem(fileSystem);
        attachmentGCFileSystem.mo177573a("attachment", new AttachmentGCFileSystem.C116195b());
        return attachmentGCFileSystem;
    }
}
