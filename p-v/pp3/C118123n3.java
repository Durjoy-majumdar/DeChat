package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.VoiceGCFileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.n3 */
public final class C118123n3 extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public static final C118123n3 f353127d = new C118123n3();

    public C118123n3() {
        super(1);
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        VoiceGCFileSystem voiceGCFileSystem = new VoiceGCFileSystem(fileSystem);
        voiceGCFileSystem.mo177573a("voice", new VoiceGCFileSystem.C116259b());
        return voiceGCFileSystem;
    }
}
