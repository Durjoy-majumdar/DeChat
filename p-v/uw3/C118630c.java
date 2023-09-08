package uw3;

import java.util.HashMap;
import p172io.flutter.plugin.common.MethodCall;
import tw3.C118548a;
import tw3.C118552d;
import ww3.C118789a;

/* renamed from: uw3.c */
public class C118630c extends C118548a {
    /* renamed from: a */
    public C118548a.C118549a mo181975a(MethodCall methodCall) {
        String str = methodCall.method;
        str.getClass();
        if (str.equals("updatePopGestureEnable")) {
            HashMap hashMap = (HashMap) methodCall.arguments;
            String str2 = (String) hashMap.get("activityId");
            boolean booleanValue = ((Boolean) hashMap.get("isPopGestureEnabled")).booleanValue();
            C118552d g = C118552d.m167207g();
            g.getClass();
            C118789a.m167472c("WxaRouter.WxaRouter", "appIsPause activityId:%s isPopGestureEnabled:%b", str2, Boolean.valueOf(booleanValue));
            if (g.f354802f.containsKey(str2)) {
                g.f354802f.get(str2).setIsPopGestureEnabled(booleanValue);
            }
            return mo183259b(Boolean.TRUE);
        } else if (!str.equals("onStageEmpty")) {
            return new C118548a.C118549a(false, (Object) null);
        } else {
            ((Integer) ((HashMap) methodCall.arguments).get("engineId")).intValue();
            return mo183259b(Boolean.TRUE);
        }
    }
}
