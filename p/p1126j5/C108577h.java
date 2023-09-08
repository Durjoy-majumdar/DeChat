package p1126j5;

import android.webkit.MimeTypeMap;
import coil.size.Size;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import java.io.File;
import o24.C21768j;
import o24.C21777r;
import p1106e5.C107228a;
import p972h5.C108136b;
import p972h5.C108143i;
import wx3.C15601d;
import z04.C112550d0;

/* renamed from: j5.h */
public final class C108577h implements C108576g<File> {

    /* renamed from: a */
    public final boolean f325032a;

    public C108577h(boolean z) {
        this.f325032a = z;
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        C87412m.m108594g((File) obj, "data");
        return true;
    }

    /* renamed from: b */
    public String mo159569b(Object obj) {
        File file = (File) obj;
        C87412m.m108594g(file, "data");
        if (this.f325032a) {
            return file.getPath() + XVFSFile.PATH_SEPARATOR_CHAR + file.lastModified();
        }
        String path = file.getPath();
        C87412m.m108593f(path, "data.path");
        return path;
    }

    /* renamed from: c */
    public Object mo159570c(C107228a aVar, Object obj, Size size, C108143i iVar, C15601d dVar) {
        File file = (File) obj;
        C21768j b = C21777r.m24935b(C21777r.m24938e(file));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        C87412m.m108593f(name, "name");
        return new C108583m(b, singleton.getMimeTypeFromExtension(C112550d0.m153793c0(name, '.', "")), C108136b.DISK);
    }
}
