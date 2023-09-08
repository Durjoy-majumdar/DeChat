package v51;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.InputStream;

/* renamed from: v51.d */
public class C52762d {
    /* renamed from: a */
    public static InputStream m59141a(Context context, String str) {
        if (context != null && !Util.isNullOrNil(str)) {
            try {
                String str2 = str.split("\\.")[0];
                Log.m105919d("MicroMsg.EmojiInfoUtil", "emoji drawable name is %s", str2);
                return context.getResources().openRawResource(context.getResources().getIdentifier(str2, "drawable", context.getPackageName()));
            } catch (Exception e) {
                Log.m105929w("MicroMsg.EmojiInfoUtil", "get emoji file fail, %s", e.getMessage());
            }
        }
        return null;
    }
}
