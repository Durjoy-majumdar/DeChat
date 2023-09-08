package p593l5;

import android.net.Uri;
import d24.C20419r;
import gy3.C87412m;
import java.io.File;
import java.util.List;
import p864t5.C110905d;
import sx3.C110818d0;

/* renamed from: l5.a */
public final class C109268a implements C109269b<Uri, File> {
    /* renamed from: a */
    public boolean mo59477a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        if (C87412m.m108589b(uri.getScheme(), "file")) {
            C20419r rVar = C110905d.f331711a;
            List<String> pathSegments = uri.getPathSegments();
            C87412m.m108593f(pathSegments, "pathSegments");
            String str = (String) C110818d0.m150916N(pathSegments);
            if (str != null && !C87412m.m108589b(str, "android_asset")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public Object mo59478f(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        if (C87412m.m108589b(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(C87412m.m108600m("Uri path is null: ", uri).toString());
        }
        throw new IllegalArgumentException(C87412m.m108600m("Uri lacks 'file' scheme: ", uri).toString());
    }
}
