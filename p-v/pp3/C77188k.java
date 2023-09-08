package pp3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.vfs.C75057b1;
import com.tencent.p014mm.vfs.C75061i;
import com.tencent.p014mm.vfs.CleanExpireFileSystem;
import com.tencent.p014mm.vfs.FileSystem;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: pp3.k */
public final class C77188k extends C87413o implements C32226l<FileSystem, FileSystem> {

    /* renamed from: d */
    public final /* synthetic */ C75057b1 f225297d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77188k(C75057b1 b1Var) {
        super(1);
        this.f225297d = b1Var;
    }

    public Object invoke(Object obj) {
        FileSystem fileSystem = (FileSystem) obj;
        C87412m.m108594g(fileSystem, LocaleUtil.ITALIAN);
        C75057b1 b1Var = this.f225297d;
        b1Var.getClass();
        return new CleanExpireFileSystem(fileSystem, C75061i.C75062a.m90020a(b1Var, 7), true);
    }
}
