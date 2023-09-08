package com.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import java.io.File;

/* renamed from: com.facebook.soloader.c */
public class C80148c extends C80172q {

    /* renamed from: a */
    public Context f234649a;

    /* renamed from: b */
    public int f234650b;

    /* renamed from: c */
    public C80150e f234651c;

    public C80148c(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.f234649a = applicationContext;
        if (applicationContext == null) {
            String str = context.getApplicationInfo().nativeLibraryDir;
            this.f234649a = context;
        }
        this.f234650b = i;
        this.f234651c = new C80150e(new File(this.f234649a.getApplicationInfo().nativeLibraryDir), i);
    }

    /* renamed from: a */
    public int mo110960a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return this.f234651c.mo110960a(str, i, threadPolicy);
    }

    /* renamed from: b */
    public void mo110961b(int i) {
        this.f234651c.mo110961b(i);
    }

    /* renamed from: c */
    public boolean mo110962c() {
        File file = this.f234651c.f234655a;
        try {
            Context context = this.f234649a;
            Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            file.toString();
            file2.toString();
            int i = this.f234650b | 1;
            this.f234650b = i;
            this.f234651c = new C80150e(file2, i);
            this.f234649a = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        return this.f234651c.toString();
    }
}
