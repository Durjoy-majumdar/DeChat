package ii3;

import java.lang.reflect.Field;

/* renamed from: ii3.b */
public final class C87739b {

    /* renamed from: a */
    public static String f254032a = "";

    /* renamed from: b */
    public static boolean f254033b;

    /* renamed from: c */
    public static boolean f254034c;

    /* renamed from: d */
    public static boolean f254035d;

    /* renamed from: a */
    public static final Object m109156a(String str) {
        try {
            Class<?> cls = Class.forName(f254032a + ".svg.SVGBuildConfig");
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(cls);
        } catch (NoSuchFieldException e) {
            C87740c.m109161d("MicroMSG.WeChatSVGConfig", e, "NoSuchFieldException", new Object[0]);
            return null;
        } catch (IllegalArgumentException e2) {
            C87740c.m109161d("MicroMSG.WeChatSVGConfig", e2, "IllegalArgumentException", new Object[0]);
            return null;
        } catch (ClassNotFoundException e3) {
            C87740c.m109161d("MicroMSG.WeChatSVGConfig", e3, "ClassNotFoundException", new Object[0]);
            return null;
        } catch (IllegalAccessException e4) {
            C87740c.m109161d("MicroMSG.WeChatSVGConfig", e4, "IllegalAccessException", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m109157b() {
        if (!f254033b) {
            Object a = m109156a("WxSVGCode");
            if (a == null) {
                f254034c = false;
            } else {
                f254034c = ((Boolean) a).booleanValue();
            }
            C87740c.m109160c("MicroMSG.WeChatSVGConfig", "Initialized mUsingWeChatSVGCode %s", Boolean.valueOf(f254034c));
            f254033b = true;
        }
        return !f254034c;
    }
}
