package com.tencent.midas.plugin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.HashMap;

public class APLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private final Object[] constructorArgs = new Object[2];
    private final HashMap<String, Constructor<? extends View>> constructorMap = new HashMap<>();
    private final Class<?>[] constructorSign = {Context.class, AttributeSet.class};

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r8 = androidx.camera.core.CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        r8 = r8.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        r10 = new android.view.InflateException(r11.getPositionDescription() + ": Class not found " + r9);
        r10.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        r10 = new android.view.InflateException(r11.getPositionDescription() + ": Class is not a View " + r9);
        r10.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d7, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        r10 = new android.view.InflateException(r11.getPositionDescription() + ": Error inflating class " + r9);
        r10.initCause(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f7, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f8, code lost:
        r9 = r7.constructorArgs;
        r9[0] = r2;
        r9[1] = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f A[Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a, all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082 A[Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a, all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094 A[Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a, all -> 0x0067 }, ExcHandler: ClassNotFoundException (r8v10 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6 A[Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a, all -> 0x0067 }, ExcHandler: ClassCastException (r8v9 'e' java.lang.ClassCastException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8 A[Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a, all -> 0x0067 }, ExcHandler: NoSuchMethodException (r8v8 'e' java.lang.NoSuchMethodException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:8:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            java.lang.String r8 = "view"
            boolean r8 = r9.equals(r8)
            r0 = 0
            if (r8 == 0) goto L_0x0010
            java.lang.String r8 = "class"
            java.lang.String r9 = r11.getAttributeValue(r0, r8)
        L_0x0010:
            r8 = -1
            r1 = 46
            int r1 = r9.indexOf(r1)
            if (r8 != r1) goto L_0x001a
            return r0
        L_0x001a:
            java.lang.Object[] r8 = r7.constructorArgs
            r1 = 0
            r2 = r8[r1]
            android.content.Context r2 = (android.content.Context) r2
            r8[r1] = r10
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r8 = r7.constructorMap
            java.lang.Object r8 = r8.get(r9)
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8
            java.lang.String r3 = ": Error inflating class "
            r4 = 1
            if (r8 != 0) goto L_0x0052
            java.lang.ClassLoader r8 = r10.getClassLoader()     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004f }
            java.lang.Class r8 = r8.loadClass(r9)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004f }
            java.lang.Class<android.view.View> r10 = android.view.View.class
            java.lang.Class r8 = r8.asSubclass(r10)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004f }
            java.lang.Class<?>[] r10 = r7.constructorSign     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004d }
            java.lang.reflect.Constructor r10 = r8.getConstructor(r10)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004d }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r5 = r7.constructorMap     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004d }
            r5.put(r9, r10)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x004d }
            r6 = r10
            r10 = r8
            r8 = r6
            goto L_0x0053
        L_0x004d:
            r9 = move-exception
            goto L_0x006c
        L_0x004f:
            r9 = move-exception
            r8 = r0
            goto L_0x006c
        L_0x0052:
            r10 = r0
        L_0x0053:
            java.lang.Object[] r5 = r7.constructorArgs     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a }
            r5[r4] = r11     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a }
            r8.setAccessible(r4)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a }
            java.lang.Object r8 = r8.newInstance(r5)     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a }
            android.view.View r8 = (android.view.View) r8     // Catch:{ NoSuchMethodException -> 0x00d8, ClassCastException -> 0x00b6, ClassNotFoundException -> 0x0094, Exception -> 0x006a }
            java.lang.Object[] r9 = r7.constructorArgs
            r9[r1] = r2
            r9[r4] = r0
            return r8
        L_0x0067:
            r8 = move-exception
            goto L_0x00f8
        L_0x006a:
            r9 = move-exception
            r8 = r10
        L_0x006c:
            android.view.InflateException r10 = new android.view.InflateException     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r5.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = r11.getPositionDescription()     // Catch:{ all -> 0x0067 }
            r5.append(r11)     // Catch:{ all -> 0x0067 }
            r5.append(r3)     // Catch:{ all -> 0x0067 }
            if (r8 != 0) goto L_0x0082
            java.lang.String r8 = "<unknown>"
            goto L_0x0086
        L_0x0082:
            java.lang.String r8 = r8.getName()     // Catch:{ all -> 0x0067 }
        L_0x0086:
            r5.append(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x0067 }
            r10.<init>(r8)     // Catch:{ all -> 0x0067 }
            r10.initCause(r9)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0094:
            r8 = move-exception
            android.view.InflateException r10 = new android.view.InflateException     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r3.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = r11.getPositionDescription()     // Catch:{ all -> 0x0067 }
            r3.append(r11)     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = ": Class not found "
            r3.append(r11)     // Catch:{ all -> 0x0067 }
            r3.append(r9)     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0067 }
            r10.<init>(r9)     // Catch:{ all -> 0x0067 }
            r10.initCause(r8)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x00b6:
            r8 = move-exception
            android.view.InflateException r10 = new android.view.InflateException     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r3.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = r11.getPositionDescription()     // Catch:{ all -> 0x0067 }
            r3.append(r11)     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = ": Class is not a View "
            r3.append(r11)     // Catch:{ all -> 0x0067 }
            r3.append(r9)     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r3.toString()     // Catch:{ all -> 0x0067 }
            r10.<init>(r9)     // Catch:{ all -> 0x0067 }
            r10.initCause(r8)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x00d8:
            r8 = move-exception
            android.view.InflateException r10 = new android.view.InflateException     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r5.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r11 = r11.getPositionDescription()     // Catch:{ all -> 0x0067 }
            r5.append(r11)     // Catch:{ all -> 0x0067 }
            r5.append(r3)     // Catch:{ all -> 0x0067 }
            r5.append(r9)     // Catch:{ all -> 0x0067 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x0067 }
            r10.<init>(r9)     // Catch:{ all -> 0x0067 }
            r10.initCause(r8)     // Catch:{ all -> 0x0067 }
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x00f8:
            java.lang.Object[] r9 = r7.constructorArgs
            r9[r1] = r2
            r9[r4] = r0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APLayoutInflaterFactory.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
