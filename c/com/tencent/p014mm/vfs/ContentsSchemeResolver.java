package com.tencent.p014mm.vfs;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Pair;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;
import com.tencent.xweb.file.XVFSFile;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.ContentsSchemeResolver */
public final class ContentsSchemeResolver extends SingletonSchemeResolver {
    public static final C116203b CREATOR = new C116203b((C116202a) null);

    /* renamed from: d */
    public final ContentProviderFileSystem f348735d = new ContentProviderFileSystem(C116281f0.C116289i.f348994a.f348960d);

    /* renamed from: com.tencent.mm.vfs.ContentsSchemeResolver$ContentProviderFileSystem */
    public static final class ContentProviderFileSystem extends C116264a implements FileSystem {
        public static final Parcelable.Creator<ContentProviderFileSystem> CREATOR = null;

        /* renamed from: e */
        public final ContentResolver f348736e;

        public ContentProviderFileSystem(Context context) {
            this.f348736e = context.getContentResolver();
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            try {
                return this.f348736e.delete(Uri.parse(str), (String) null, (String[]) null) >= 1;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            return false;
        }

        /* renamed from: f */
        public int mo119936f() {
            return 1;
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            return false;
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            try {
                ParcelFileDescriptor openFileDescriptor = this.f348736e.openFileDescriptor(Uri.parse(str), str2);
                if (openFileDescriptor != null) {
                    return openFileDescriptor;
                }
                throw new FileNotFoundException("ContentResolver returns null");
            } catch (RuntimeException e) {
                throw ((FileNotFoundException) new FileNotFoundException(str + " cannot be opened: " + e.getMessage()).initCause(e));
            }
        }

        public Iterable<C86001b0> list(String str) {
            return null;
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            try {
                OutputStream openOutputStream = this.f348736e.openOutputStream(Uri.parse(str), z ? "wa" : "w");
                if (openOutputStream != null) {
                    return openOutputStream;
                }
                throw new FileNotFoundException("ContentResolver returns null");
            } catch (RuntimeException e) {
                throw ((FileNotFoundException) new FileNotFoundException(str + " cannot be opened: " + e.getMessage()).initCause(e));
            }
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            return false;
        }

        public InputStream openRead(String str) {
            try {
                InputStream openInputStream = this.f348736e.openInputStream(Uri.parse(str));
                if (openInputStream != null) {
                    return openInputStream;
                }
                throw new FileNotFoundException("ContentResolver returns null");
            } catch (RuntimeException e) {
                throw ((FileNotFoundException) new FileNotFoundException(str + " cannot be opened: " + e.getMessage()).initCause(e));
            }
        }

        /* renamed from: p */
        public FileSystem.C116215a mo119944p(String str) {
            return new FileSystem.C116215a();
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            Cursor cursor;
            Cursor cursor2 = null;
            try {
                cursor = this.f348736e.query(Uri.parse(str), (String[]) null, (String) null, (String[]) null, (String) null);
                if (cursor == null) {
                    C116299g2.m163847c(cursor);
                    return null;
                }
                try {
                    int columnIndex = cursor.getColumnIndex("_display_name");
                    int columnIndex2 = cursor.getColumnIndex("_size");
                    if (!cursor.moveToFirst()) {
                        C116299g2.m163847c(cursor);
                        return null;
                    }
                    C86001b0 b0Var = new C86001b0(this, str, cursor.getString(columnIndex), cursor.getLong(columnIndex2), 0, 0, false);
                    C116299g2.m163847c(cursor);
                    return b0Var;
                } catch (RuntimeException unused) {
                    C116299g2.m163847c(cursor);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    C116299g2.m163847c(cursor2);
                    throw th;
                }
            } catch (RuntimeException unused2) {
                cursor = null;
                C116299g2.m163847c(cursor);
                return null;
            } catch (Throwable th4) {
                th = th4;
                C116299g2.m163847c(cursor2);
                throw th;
            }
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return this;
        }

        /* renamed from: v */
        public Object mo177578v(Map map) {
            return this;
        }

        /* renamed from: w */
        public String mo119947w(String str, boolean z) {
            return null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            return mo119945q(str) != null;
        }
    }

    /* renamed from: com.tencent.mm.vfs.ContentsSchemeResolver$b */
    public static class C116203b implements Parcelable.Creator<ContentsSchemeResolver> {

        /* renamed from: a */
        public static final C116342y0<SchemeResolver, SchemeResolver.C116250a> f348737a = new C116342y0<>(new ContentsSchemeResolver());

        public C116203b(C116202a aVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            return (ContentsSchemeResolver) f348737a.f349131a;
        }

        public Object[] newArray(int i) {
            return new ContentsSchemeResolver[i];
        }
    }

    /* renamed from: b */
    public Pair<FileSystem.C85995c, String> mo177604b(C116328u0 u0Var, Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            sb.append("//");
            sb.append(authority);
        }
        String path = uri.getPath();
        if (path != null) {
            sb.append(path);
        }
        return Pair.create(this.f348735d, sb.toString());
    }
}
