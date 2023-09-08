package w93;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: w93.h */
public class C53094h {

    /* renamed from: a */
    public static String f148185a;

    /* renamed from: b */
    public static String f148186b;

    /* renamed from: c */
    public static int f148187c;

    public C53094h(Intent intent) {
        if (intent != null) {
            f148185a = Util.nullAsNil(intent.getStringExtra("KPublisherId"));
            f148186b = Util.nullAsNil(intent.getStringExtra("geta8key_username"));
            f148187c = Util.nullAsNil(Integer.valueOf(intent.getIntExtra("geta8key_scene", 0)));
        }
    }
}
