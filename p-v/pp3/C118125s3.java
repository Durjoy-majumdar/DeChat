package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.RecordAndExtraGCFileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.s3 */
public final class C118125s3 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C118125s3 f353129d = new C118125s3();

    public C118125s3() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        RecordAndExtraGCFileSystem recordAndExtraGCFileSystem = new RecordAndExtraGCFileSystem(fileSystem);
        recordAndExtraGCFileSystem.mo177573a("record", new RecordAndExtraGCFileSystem.C116241b());
        return recordAndExtraGCFileSystem;
    }
}
