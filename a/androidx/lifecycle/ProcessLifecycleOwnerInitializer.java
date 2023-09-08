package androidx.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.lifecycle.C112985o;
import androidx.lifecycle.C39623j;

public class ProcessLifecycleOwnerInitializer extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        if (!C112985o.f338215a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C112985o.C112986a());
        }
        Context context2 = getContext();
        C112975c0 c0Var = C112975c0.f338196o;
        c0Var.getClass();
        c0Var.f338201h = new Handler();
        c0Var.f338202i.mo145135c(C39623j.C39625b.ON_CREATE);
        ((Application) context2.getApplicationContext()).registerActivityLifecycleCallbacks(new C112978d0(c0Var));
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
