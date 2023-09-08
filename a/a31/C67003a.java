package a31;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;

/* renamed from: a31.a */
public class C67003a {
    /* renamed from: a */
    public static void m79166a(Field field) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & -17);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.HookUtils", e.getMessage());
        }
    }
}
