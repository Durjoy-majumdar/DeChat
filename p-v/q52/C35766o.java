package q52;

import com.tencent.p014mm.sdk.platformtools.IniParser;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C45112n1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: q52.o */
public final class C35766o {

    /* renamed from: a */
    public static final C35766o f95534a = new C35766o();

    /* renamed from: a */
    public final String mo60387a(String str) {
        C87412m.m108594g(str, "unzippath");
        try {
            Map<String, String> parse = IniParser.parse(C45112n1.m49954a(new C86009m1(str + "/mbpkg_meta.txt"), (Charset) null, 1, (Object) null));
            Log.m105924i("MBMagicPkgHelper", "readPkgPathFromUnZipPath metaMap:" + parse);
            return str + XVFSFile.SEPARATOR_CHAR + parse.get("wxapkgName");
        } catch (FileNotFoundException unused) {
            return "";
        }
    }
}
