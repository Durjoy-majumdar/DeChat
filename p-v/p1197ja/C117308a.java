package p1197ja;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.eclipsesource.mmv8.Platform;
import fm0.C86963n;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import ll0.C88573d;
import p1005ma.C88718b;
import p1056vl.C111556a;
import p1056vl.C90824b;
import p1204oa.C117728a;
import p172io.flutter.plugin.common.MethodCall;
import p979ia.C117147b;
import tw3.C118548a;
import tw3.C118552d;

/* renamed from: ja.a */
public final class C117308a extends C118548a {
    /* renamed from: a */
    public C118548a.C118549a mo181975a(MethodCall methodCall) {
        int i;
        C87412m.m108591d(methodCall);
        String str = methodCall.method;
        Object obj = methodCall.arguments;
        C88718b.m110679a("WxaLiteApp.WxaLiteAppConsumer", C87412m.m108600m("consume method: ", str), new Object[0]);
        if (str != null) {
            switch (str.hashCode()) {
                case -1887586613:
                    if (str.equals("publishEvent")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
                case -1512194998:
                    if (str.equals("keyboardEnable")) {
                        C87412m.m108593f(obj, "args");
                        HashMap hashMap = (HashMap) obj;
                        Object obj2 = hashMap.get("activityId");
                        if (obj2 != null) {
                            String str2 = (String) obj2;
                            Object obj3 = hashMap.get("confirm");
                            if (obj3 != null) {
                                boolean booleanValue = ((Boolean) obj3).booleanValue();
                                Activity activity = C118552d.m167207g().mo183266e(str2).getActivity();
                                if (activity == null) {
                                    return mo183259b(Boolean.TRUE);
                                }
                                if (activity instanceof C117728a) {
                                    ((C117728a) activity).mo95223m2(booleanValue);
                                }
                                return mo183259b(Boolean.TRUE);
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case -1263222921:
                    if (str.equals("openApp")) {
                        C87412m.m108593f(obj, "args");
                        Object obj4 = ((HashMap) obj).get("activityId");
                        if (obj4 != null) {
                            String str3 = (String) obj4;
                            Activity activity2 = C118552d.m167207g().mo183266e(str3).getActivity();
                            if (activity2 == null) {
                                C88718b.m110681c("WxaLiteApp.WxaLiteAppConsumer", "openApp ActivityId: " + str3 + ", activity is null.", new Object[0]);
                                return mo183259b(Boolean.TRUE);
                            }
                            C88718b.m110681c("WxaLiteApp.WxaLiteAppConsumer", "openApp ActivityId: " + str3 + ", activity: " + activity2, new Object[0]);
                            if ((activity2 instanceof C117728a) && (obj instanceof Map)) {
                                ((C117728a) activity2).mo95219Z3();
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case -1242073158:
                    if (str.equals("onRenderCallback")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
                case -983638536:
                    if (str.equals(C86963n.NAME)) {
                        C87412m.m108593f(obj, "args");
                        HashMap hashMap2 = (HashMap) obj;
                        Object obj5 = hashMap2.get("activityId");
                        if (obj5 != null) {
                            Activity activity3 = C118552d.m167207g().mo183266e((String) obj5).getActivity();
                            if (activity3 == null) {
                                return mo183259b(Boolean.TRUE);
                            }
                            if ((activity3 instanceof C117728a) && (obj instanceof Map)) {
                                C117728a aVar = (C117728a) activity3;
                                Object obj6 = hashMap2.get("animation");
                                if (obj6 != null) {
                                    aVar.navigateBack(((Boolean) obj6).booleanValue());
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case -865430423:
                    if (str.equals("getCutOutHeight")) {
                        C87412m.m108593f(obj, "args");
                        Context context = C117147b.f350981b;
                        if (context != null) {
                            Boolean bool = C90824b.f260777a;
                            try {
                                Resources resources = context.getResources();
                                int identifier = resources.getIdentifier("status_bar_height", "dimen", Platform.ANDROID);
                                if (identifier != 0) {
                                    i = resources.getDimensionPixelSize(identifier);
                                    int i2 = C111556a.f333972a;
                                    return mo183259b(Double.valueOf((double) Math.round(((float) i) / context.getResources().getDisplayMetrics().density)));
                                }
                            } catch (Resources.NotFoundException e) {
                                C88718b.m110680b("MicroMsg.ResourceCompat", "get res of status_bar_height fail %s", e.toString());
                            }
                            i = 25;
                            int i25 = C111556a.f333972a;
                            return mo183259b(Double.valueOf((double) Math.round(((float) i) / context.getResources().getDisplayMetrics().density)));
                        }
                        C87412m.m108603p("appContext");
                        throw null;
                    }
                    break;
                case -802181223:
                    if (str.equals("exitFullScreen")) {
                        C87412m.m108593f(obj, "args");
                        Object obj7 = ((HashMap) obj).get("activityId");
                        if (obj7 != null) {
                            Activity activity4 = C118552d.m167207g().mo183266e((String) obj7).getActivity();
                            if (activity4 == null) {
                                return mo183259b(Boolean.TRUE);
                            }
                            if (activity4 instanceof C117728a) {
                                ((C117728a) activity4).mo95221d6();
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case -729343770:
                    if (str.equals("hasCutOut")) {
                        C87412m.m108593f(obj, "args");
                        Object obj8 = ((HashMap) obj).get("activityId");
                        if (obj8 != null) {
                            Activity activity5 = C118552d.m167207g().mo183266e((String) obj8).getActivity();
                            return activity5 == null ? mo183259b(Boolean.TRUE) : mo183259b(Boolean.valueOf(C90824b.m113903c(activity5, true)));
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case 4298127:
                    if (str.equals("generateInputEventData")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
                case 141189166:
                    if (str.equals("onStageEmpty")) {
                        C87412m.m108593f(obj, "args");
                        Object obj9 = ((HashMap) obj).get("activityId");
                        if (obj9 != null) {
                            String str4 = (String) obj9;
                            return new C118548a.C118549a(false, (Object) null);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case 362379281:
                    if (str.equals("inputOnKeyboardValueChange")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
                case 837852371:
                    if (str.equals("enterFullScreen")) {
                        C87412m.m108593f(obj, "args");
                        Object obj10 = ((HashMap) obj).get("activityId");
                        if (obj10 != null) {
                            Activity activity6 = C118552d.m167207g().mo183266e((String) obj10).getActivity();
                            if (activity6 == null) {
                                return mo183259b(Boolean.TRUE);
                            }
                            if (activity6 instanceof C117728a) {
                                ((C117728a) activity6).mo95225p();
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case 1003266075:
                    if (str.equals("getLocalFileData")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
                case 1026644591:
                    if (str.equals("openWebView")) {
                        C87412m.m108593f(obj, "args");
                        Object obj11 = ((HashMap) obj).get("activityId");
                        if (obj11 != null) {
                            Activity activity7 = C118552d.m167207g().mo183266e((String) obj11).getActivity();
                            if (activity7 == null) {
                                return mo183259b(Boolean.TRUE);
                            }
                            if ((activity7 instanceof C117728a) && (obj instanceof Map)) {
                                ((C117728a) activity7).mo95220b1((Map) obj);
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case 1065964361:
                    if (str.equals(C88573d.NAME)) {
                        C87412m.m108593f(obj, "args");
                        Object obj12 = ((HashMap) obj).get("activityId");
                        if (obj12 != null) {
                            Activity activity8 = C118552d.m167207g().mo183266e((String) obj12).getActivity();
                            if (activity8 == null) {
                                return mo183259b(Boolean.TRUE);
                            }
                            if (activity8 instanceof C117728a) {
                                ((C117728a) activity8).hideKeyboard();
                            }
                            return mo183259b(Boolean.TRUE);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    break;
                case 1230183279:
                    if (str.equals("setCanOverScroll")) {
                        return mo183259b(Boolean.TRUE);
                    }
                    break;
            }
        }
        return new C118548a.C118549a(false, (Object) null);
    }
}
