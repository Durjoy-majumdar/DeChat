package ni3;

import gy3.C87412m;
import java.io.File;
import z04.C112551y;

/* renamed from: ni3.g */
public final class C88951g {

    /* renamed from: a */
    public static final String f256528a;

    /* renamed from: b */
    public static String f256529b;

    static {
        String str = File.separator;
        f256528a = str;
        f256529b = "testfile" + str + "temp" + str;
    }

    /* renamed from: a */
    public static final File m111055a() {
        StringBuilder sb = new StringBuilder();
        String str = f256529b;
        String str2 = f256528a;
        C87412m.m108593f(str2, "separator");
        sb.append(C112551y.m153808h(str, str2, false, 2, (Object) null) ? f256529b : C87412m.m108600m(f256529b, str2));
        sb.append("mm_compressor_");
        sb.append(System.nanoTime());
        sb.append(".file");
        File file = new File(sb.toString());
        if (file.exists()) {
            file.delete();
        }
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            String m = C87412m.m108600m("createTmpFile but cant not mkdir :", file.getParentFile().getAbsolutePath());
            C87412m.m108594g(m, "msg");
            C88946c.f256524a.mo122772e("MicroMsg.TempFile", m);
        }
        String m2 = C87412m.m108600m("createTmpFile:", file.getAbsolutePath());
        C87412m.m108594g(m2, "msg");
        C88946c.f256524a.mo122773i("MicroMsg.TempFile", m2);
        file.createNewFile();
        return file;
    }
}
