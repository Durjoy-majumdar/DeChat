package p1126j5;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import coil.size.Size;
import d24.C20419r;
import fy3.C32226l;
import gy3.C87412m;
import java.io.InputStream;
import java.util.List;
import o24.C21768j;
import o24.C21777r;
import p1106e5.C107228a;
import p864t5.C110905d;
import p972h5.C108136b;
import p972h5.C108143i;
import sx3.C110818d0;
import wx3.C15601d;

/* renamed from: j5.a */
public final class C108570a implements C108576g<Uri> {

    /* renamed from: a */
    public final Context f325026a;

    public C108570a(Context context) {
        C87412m.m108594g(context, "context");
        this.f325026a = context;
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        if (C87412m.m108589b(uri.getScheme(), "file")) {
            C20419r rVar = C110905d.f331711a;
            List<String> pathSegments = uri.getPathSegments();
            C87412m.m108593f(pathSegments, "pathSegments");
            if (C87412m.m108589b((String) C110818d0.m150916N(pathSegments), "android_asset")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        String uri2 = uri.toString();
        C87412m.m108593f(uri2, "data.toString()");
        return uri2;
    }

    /* renamed from: c */
    public Object mo159570c(C107228a aVar, Object obj, Size size, C108143i iVar, C15601d dVar) {
        List<String> pathSegments = ((Uri) obj).getPathSegments();
        C87412m.m108593f(pathSegments, "data.pathSegments");
        String S = C110818d0.m150921S(C110818d0.m150907F(pathSegments, 1), "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        InputStream open = this.f325026a.getAssets().open(S);
        C87412m.m108593f(open, "context.assets.open(path)");
        C21768j b = C21777r.m24935b(C21777r.m24939f(open));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        C87412m.m108593f(singleton, "getSingleton()");
        return new C108583m(b, C110905d.m151205a(singleton, S), C108136b.DISK);
    }
}
