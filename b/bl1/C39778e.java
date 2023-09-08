package bl1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import te3.C51836wi;

/* renamed from: bl1.e */
public final class C39778e extends C87413o implements C32226l<C51836wi, CharSequence> {

    /* renamed from: d */
    public static final C39778e f106740d = new C39778e();

    public C39778e() {
        super(1);
    }

    public Object invoke(Object obj) {
        C51836wi wiVar = (C51836wi) obj;
        C87412m.m108594g(wiVar, LocaleUtil.ITALIAN);
        return wiVar.f144061g + XVFSFile.PATH_SEPARATOR_CHAR + wiVar.f144062h + ',';
    }
}
