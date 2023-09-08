package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.VideoGCFileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.k3 */
public final class C118122k3 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C118122k3 f353126d = new C118122k3();

    public C118122k3() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        VideoGCFileSystem videoGCFileSystem = new VideoGCFileSystem(fileSystem);
        videoGCFileSystem.mo177573a("video", new VideoGCFileSystem.C116256b());
        return videoGCFileSystem;
    }
}
