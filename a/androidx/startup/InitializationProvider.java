package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p1109f4.C107470a;
import p1109f4.C107472c;

public class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C107472c("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            if (C107470a.f321495d == null) {
                synchronized (C107470a.f321496e) {
                    if (C107470a.f321495d == null) {
                        C107470a.f321495d = new C107470a(context);
                    }
                }
            }
            C107470a aVar = C107470a.f321495d;
            aVar.getClass();
            try {
                Trace.beginSection("Startup");
                aVar.mo157878a(aVar.f321499c.getPackageManager().getProviderInfo(new ComponentName(aVar.f321499c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new C107472c((Throwable) e);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
