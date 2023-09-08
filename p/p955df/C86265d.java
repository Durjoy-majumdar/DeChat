package p955df;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.io.File;
import java.io.FileFilter;

/* renamed from: df.d */
public final class C86265d implements FileFilter {

    /* renamed from: a */
    public final /* synthetic */ long f250867a;

    public C86265d(C86266e eVar, long j) {
        this.f250867a = j;
    }

    public final boolean accept(File file) {
        C87412m.m108594g(file, LocaleUtil.ITALIAN);
        return this.f250867a - file.lastModified() > C86266e.f250868a;
    }
}
