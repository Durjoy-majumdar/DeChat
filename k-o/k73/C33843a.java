package k73;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: k73.a */
public class C33843a {
    /* renamed from: a */
    public static void m40158a(Bundle bundle) {
        Intent intent = new Intent();
        intent.setPackage(MMApplicationContext.getContext().getPackageName());
        intent.setAction("com.tencent.mm.wear.message");
        intent.putExtras(bundle);
        MMApplicationContext.getContext().sendBroadcast(intent);
    }
}
