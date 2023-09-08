package com.tencent.p014mm.compatible.loader;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: com.tencent.mm.compatible.loader.PluginResourceLoader */
public class PluginResourceLoader extends Resources {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0002 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo112583a(android.util.TypedValue r4, int r5) {
        /*
            r3 = this;
            r5 = 0
            throw r5     // Catch:{ Exception -> 0x0002 }
        L_0x0002:
            java.lang.CharSequence r0 = r4.string     // Catch:{ Exception -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ Exception -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            java.lang.CharSequence r4 = r4.string     // Catch:{ Exception -> 0x0027 }
            r4.toString()     // Catch:{ Exception -> 0x0027 }
            throw r5     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            r4 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0027 }
            java.lang.String r1 = "MicroMsg.PluginResourceLoader"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r2, r0)     // Catch:{ Exception -> 0x0027 }
            android.graphics.drawable.Drawable.createFromXml(r3, r5)     // Catch:{ Exception -> 0x0027 }
            throw r5     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.compatible.loader.PluginResourceLoader.mo112583a(android.util.TypedValue, int):android.graphics.drawable.Drawable");
    }

    public Drawable loadDrawable(TypedValue typedValue, int i) {
        mo112583a(typedValue, i);
        throw null;
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream inputStream;
        getValue(i, typedValue, true);
        try {
            inputStream = super.openRawResource(i, typedValue);
        } catch (Exception unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            return inputStream;
        }
        throw null;
    }

    public Drawable loadDrawable(TypedValue typedValue, int i, boolean z) {
        mo112583a(typedValue, i);
        throw null;
    }
}
