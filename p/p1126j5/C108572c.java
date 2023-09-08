package p1126j5;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import coil.size.Size;
import gy3.C87412m;
import java.io.InputStream;
import o24.C21777r;
import p1106e5.C107228a;
import p972h5.C108136b;
import p972h5.C108143i;
import wx3.C15601d;

/* renamed from: j5.c */
public final class C108572c implements C108576g<Uri> {

    /* renamed from: a */
    public final Context f325027a;

    public C108572c(Context context) {
        C87412m.m108594g(context, "context");
        this.f325027a = context;
    }

    /* renamed from: a */
    public boolean mo159568a(Object obj) {
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        return C87412m.m108589b(uri.getScheme(), "content");
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
        InputStream inputStream;
        Uri uri = (Uri) obj;
        C87412m.m108594g(uri, "data");
        if (C87412m.m108589b(uri.getAuthority(), "com.android.contacts") && C87412m.m108589b(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor openAssetFileDescriptor = this.f325027a.getContentResolver().openAssetFileDescriptor(uri, "r");
            inputStream = openAssetFileDescriptor == null ? null : openAssetFileDescriptor.createInputStream();
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else {
            inputStream = this.f325027a.getContentResolver().openInputStream(uri);
            if (inputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new C108583m(C21777r.m24935b(C21777r.m24939f(inputStream)), this.f325027a.getContentResolver().getType(uri), C108136b.DISK);
    }
}
