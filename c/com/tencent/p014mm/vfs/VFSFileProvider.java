package com.tencent.p014mm.vfs;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.xweb.file.XVFSFile;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.VFSFileProvider */
public class VFSFileProvider extends ContentProvider {
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final Pattern PATH_SEPARATE = Pattern.compile("/");
    private String mAuthority;

    private static Uri contentUriToVfsUri(Uri uri) {
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return null;
        }
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        String[] split = PATH_SEPARATE.split(path, 3);
        if (split.length < 2) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        String str = split[0];
        if (!str.startsWith("@")) {
            builder.scheme("wcf").authority(str).path(path.substring(str.length() + 1));
        } else if (split.length < 3) {
            return null;
        } else {
            builder.scheme(str.substring(1));
            if (split[1].equals("@")) {
                builder.authority((String) null);
            } else {
                builder.authority(split[1]);
            }
            builder.path(split[2]);
        }
        return builder.build();
    }

    public static Uri vfsUriToContentUri(Uri uri, String str) {
        String str2;
        String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file")) {
            return null;
        }
        if (scheme.equals("wcf")) {
            str2 = uri.getAuthority() + uri.getPath();
        } else {
            String authority = uri.getAuthority();
            StringBuilder sb = new StringBuilder();
            sb.append("@");
            sb.append(scheme);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            if (authority == null || authority.isEmpty()) {
                authority = "@";
            }
            sb.append(authority);
            sb.append(uri.getPath());
            str2 = sb.toString();
        }
        return new Uri.Builder().scheme("content").authority(str).path(str2).build();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.mAuthority = providerInfo.authority;
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        Uri contentUriToVfsUri = contentUriToVfsUri(uri);
        if (contentUriToVfsUri != null) {
            String path = contentUriToVfsUri.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!contentUriToVfsUri.getPath().equals(k)) {
                    contentUriToVfsUri = contentUriToVfsUri.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(contentUriToVfsUri, (C116281f0.C116288h) null);
            return (!l.mo177810a() || !l.f348991a.mo119933c(l.f348992b)) ? 0 : 1;
        }
        throw new IllegalArgumentException("No mapping found for " + uri);
    }

    public String getType(Uri uri) {
        Context context;
        Uri contentUriToVfsUri = contentUriToVfsUri(uri);
        if (contentUriToVfsUri != null) {
            String scheme = contentUriToVfsUri.getScheme();
            if (scheme != null && scheme.equals("content") && (context = getContext()) != null) {
                return context.getContentResolver().getType(contentUriToVfsUri);
            }
            String path = contentUriToVfsUri.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!contentUriToVfsUri.getPath().equals(k)) {
                    contentUriToVfsUri = contentUriToVfsUri.buildUpon().path(k).build();
                }
            }
            String path2 = contentUriToVfsUri.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            int lastIndexOf2 = path2.lastIndexOf(46);
            if (lastIndexOf2 < 0) {
                return "application/octet-stream";
            }
            String path3 = contentUriToVfsUri.getPath();
            int lastIndexOf3 = path3.lastIndexOf("/");
            if (lastIndexOf3 >= 0) {
                path3 = path3.substring(lastIndexOf3 + 1);
            }
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(path3.substring(lastIndexOf2 + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
        }
        throw new IllegalArgumentException("No mapping found for " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        Uri contentUriToVfsUri = contentUriToVfsUri(uri);
        if (contentUriToVfsUri != null) {
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(contentUriToVfsUri, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                return l.f348991a.mo119939i(l.f348992b, str);
            }
            throw new FileNotFoundException("File not found: " + uri);
        }
        throw new FileNotFoundException("File not found: " + uri);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        C86001b0 q;
        Uri contentUriToVfsUri = contentUriToVfsUri(uri);
        if (contentUriToVfsUri != null) {
            C116281f0.C116288h hVar = null;
            String path = contentUriToVfsUri.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!contentUriToVfsUri.getPath().equals(k)) {
                    contentUriToVfsUri = contentUriToVfsUri.buildUpon().path(k).build();
                }
            }
            if (strArr == null) {
                strArr = COLUMNS;
            }
            String[] strArr3 = new String[strArr.length];
            Object[] objArr = new Object[strArr.length];
            int i2 = 0;
            for (String str3 : strArr) {
                if ("_display_name".equals(str3)) {
                    strArr3[i2] = "_display_name";
                    i = i2 + 1;
                    String path2 = contentUriToVfsUri.getPath();
                    int lastIndexOf = path2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        path2 = path2.substring(lastIndexOf + 1);
                    }
                    objArr[i2] = path2;
                } else if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    hVar = C116281f0.C116289i.f348994a.mo177799l(contentUriToVfsUri, hVar);
                    long j = 0;
                    if (hVar.mo177810a() && (q = hVar.f348991a.mo119945q(hVar.f348992b)) != null) {
                        j = q.f250473c;
                    }
                    objArr[i2] = Long.valueOf(j);
                }
                i2 = i;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i2);
            MatrixCursor matrixCursor = new MatrixCursor((String[]) Arrays.copyOf(strArr3, i2), 1);
            matrixCursor.addRow(copyOf);
            return matrixCursor;
        }
        throw new IllegalArgumentException("No mapping found for " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
