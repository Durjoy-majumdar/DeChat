package p593l5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.util.List;
import z04.C112551y;

/* renamed from: l5.d */
public final class C46832d implements C109269b<Uri, Uri> {

    /* renamed from: a */
    public final Context f125971a;

    public C46832d(Context context) {
        C87412m.m108594g(context, "context");
        this.f125971a = context;
    }

    /* renamed from: a */
    public boolean mo59477a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        if (!C87412m.m108589b(uri.getScheme(), "android.resource")) {
            return false;
        }
        String authority = uri.getAuthority();
        if (authority == null || C112551y.m153811k(authority)) {
            return false;
        }
        List<String> pathSegments = uri.getPathSegments();
        C87412m.m108593f(pathSegments, "data.pathSegments");
        return pathSegments.size() == 2;
    }

    /* renamed from: f */
    public Object mo59478f(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        String authority = uri.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.f125971a.getPackageManager().getResourcesForApplication(authority);
        C87412m.m108593f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        List<String> pathSegments = uri.getPathSegments();
        C87412m.m108593f(pathSegments, "pathSegments");
        boolean z = false;
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier != 0) {
            z = true;
        }
        if (z) {
            Uri parse = Uri.parse("android.resource://" + authority + XVFSFile.SEPARATOR_CHAR + identifier);
            C87412m.m108593f(parse, "parse(this)");
            return parse;
        }
        throw new IllegalStateException(C87412m.m108600m("Invalid android.resource URI: ", uri).toString());
    }
}
