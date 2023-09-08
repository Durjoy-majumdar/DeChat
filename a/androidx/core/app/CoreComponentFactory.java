package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$a */
    public interface C112863a {
        /* renamed from: a */
        Object mo164777a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((androidx.core.app.CoreComponentFactory.C112863a) r1).mo164777a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T m154416a(T r1) {
        /*
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.C112863a
            if (r0 == 0) goto L_0x000e
            r0 = r1
            androidx.core.app.CoreComponentFactory$a r0 = (androidx.core.app.CoreComponentFactory.C112863a) r0
            java.lang.Object r0 = r0.mo164777a()
            if (r0 == 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.CoreComponentFactory.m154416a(java.lang.Object):java.lang.Object");
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) m154416a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) m154416a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) m154416a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) m154416a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) m154416a(super.instantiateService(classLoader, str, intent));
    }
}
