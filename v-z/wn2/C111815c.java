package wn2;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: wn2.c */
public class C111815c extends C111814b {
    public C111815c(C111818f fVar) {
    }

    /* renamed from: a */
    public Intent mo163518a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", MMApplicationContext.getPackageName());
        return intent;
    }
}
