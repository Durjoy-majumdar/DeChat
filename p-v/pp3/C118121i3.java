package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.ImageGCFileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.i3 */
public final class C118121i3 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C118121i3 f353125d = new C118121i3();

    public C118121i3() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        ImageGCFileSystem imageGCFileSystem = new ImageGCFileSystem(fileSystem);
        imageGCFileSystem.mo177573a("image2", new ImageGCFileSystem.C116217b());
        return imageGCFileSystem;
    }
}
