package da1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e91.C116711b;
import ea1.C58534i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import op3.C117877b;
import op3.C117882j;
import p329d3.C58104c;
import te3.C101777fg2;
import te3.C118427eg2;
import te3.C118438ja3;
import te3.C50562nl2;

/* renamed from: da1.b */
public final class C116605b {
    /* renamed from: a */
    public static void m164445a(Object obj, C118438ja3 ja32, C118427eg2 eg22, boolean z, boolean z2) {
        C50562nl2 nl22;
        if (obj != null && !TextUtils.isEmpty(ja32.f354059d) && !TextUtils.isEmpty(ja32.f354060e)) {
            if ("0".equals(ja32.f354061f)) {
                if (!z2) {
                    return;
                }
            } else if ("2".equals(ja32.f354061f) && z2) {
                return;
            }
            C50562nl2 nl23 = ja32.f354063h;
            C101777fg2 b = m164446b(obj, ja32.f354062g, nl23 == null ? ja32.f354060e : nl23.f138657f, ja32.f354060e);
            if (b == null) {
                if (!z && (nl22 = ja32.f354063h) != null && !TextUtils.isEmpty(nl22.f138657f)) {
                    C58534i.m67953b(158);
                }
                String str = ja32.f354059d;
                String str2 = ja32.f354060e;
                b = m164446b(obj, str, str2, str2);
                if (b == null) {
                    return;
                }
            }
            if (z) {
                eg22.f353975j.add(b);
                return;
            }
            eg22.f353973h.add(b);
            C58534i.m67953b(135);
        }
    }

    /* renamed from: b */
    public static C101777fg2 m164446b(Object obj, String str, String str2, String str3) {
        String str4 = str3;
        ArrayList<C58104c> arrayList = new ArrayList<>();
        try {
            for (String split : str2.split(",")) {
                String[] split2 = split.split("\\|");
                arrayList.add(new C58104c(split2[0], split2[1]));
            }
        } catch (Exception unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            Class<?> cls2 = cls;
            Object obj2 = obj;
            for (C58104c cVar : arrayList) {
                if (cVar != null) {
                    String str5 = (String) cVar.f166179a;
                    String str6 = (String) cVar.f166180b;
                    if (!(str5 == null || str5.isEmpty() || str6 == null)) {
                        if (!str6.isEmpty()) {
                            Field declaredField = cls2.getDeclaredField(str5);
                            declaredField.setAccessible(true);
                            obj2 = declaredField.get(obj2);
                            if (str6.startsWith("[")) {
                                C117877b<String, Integer> c = m164447c(str6);
                                if (c != null) {
                                    int intValue = ((Integer) c.mo182596a(1)).intValue();
                                    Object[] objArr = (Object[]) obj2;
                                    if (objArr != null && objArr.length > 0) {
                                        if (intValue < objArr.length) {
                                            obj2 = objArr[intValue];
                                            cls2 = Class.forName((String) c.mo182596a(0));
                                        }
                                    }
                                    Log.m105920e("HABBYGE-MALI.HellSessionParamUtil", "array == null || array.length <= 0");
                                    return null;
                                }
                            } else if (str6.startsWith("Ljava/util/List;")) {
                                C117877b<String, String> d = m164448d(str6, "Ljava/util/List;");
                                if (d != null) {
                                    List list = (List) obj2;
                                    try {
                                        int parseInt = Integer.parseInt((String) d.mo182596a(1));
                                        if (list != null) {
                                            if (!list.isEmpty()) {
                                                if (parseInt < list.size()) {
                                                    obj2 = list.get(parseInt);
                                                    cls2 = Class.forName((String) d.mo182596a(0));
                                                }
                                            }
                                        }
                                        Log.m105920e("HABBYGE-MALI.HellSessionParamUtil", "list.isEmpty");
                                        return null;
                                    } catch (NumberFormatException e) {
                                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionParamUtil", e, "SessionParam, Ljava/util/List;, crash", new Object[0]);
                                        return null;
                                    }
                                }
                            } else if (str6.startsWith("Ljava/util/ArrayList;")) {
                                C117877b<String, String> d2 = m164448d(str6, "Ljava/util/ArrayList;");
                                if (d2 != null) {
                                    ArrayList arrayList2 = (ArrayList) obj2;
                                    try {
                                        int parseInt2 = Integer.parseInt((String) d2.mo182596a(1));
                                        if (arrayList2 != null) {
                                            if (!arrayList2.isEmpty()) {
                                                if (parseInt2 < arrayList2.size()) {
                                                    obj2 = arrayList2.get(parseInt2);
                                                    cls2 = Class.forName((String) d2.mo182596a(0));
                                                }
                                            }
                                        }
                                        return null;
                                    } catch (NumberFormatException e2) {
                                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionParamUtil", e2, "SessionParam, Ljava/util/ArrayList;, crash", new Object[0]);
                                        return null;
                                    }
                                }
                            } else if (str6.startsWith("Ljava/util/LinkedList;")) {
                                C117877b<String, String> d3 = m164448d(str6, "Ljava/util/LinkedList;");
                                if (d3 != null) {
                                    LinkedList linkedList = (LinkedList) obj2;
                                    try {
                                        int parseInt3 = Integer.parseInt((String) d3.mo182596a(1));
                                        if (linkedList != null) {
                                            if (!linkedList.isEmpty()) {
                                                if (parseInt3 < linkedList.size()) {
                                                    obj2 = linkedList.get(parseInt3);
                                                    cls2 = Class.forName((String) d3.mo182596a(0));
                                                }
                                            }
                                        }
                                        return null;
                                    } catch (NumberFormatException e3) {
                                        Log.printErrStackTrace("HABBYGE-MALI.HellSessionParamUtil", e3, "_doParse, Ljava/util/LinkedList;, crash", new Object[0]);
                                        return null;
                                    }
                                }
                            } else if (str6.startsWith("Ljava/util/Map;")) {
                                C117877b<String, String> d4 = m164448d(str6, "Ljava/util/Map;");
                                if (d4 != null) {
                                    Map map = (Map) obj2;
                                    if (map != null) {
                                        if (!map.isEmpty()) {
                                            obj2 = map.get(d4.mo182596a(1));
                                            if (obj2 == null) {
                                                return null;
                                            }
                                            cls2 = Class.forName((String) d4.mo182596a(0));
                                        }
                                    }
                                    return null;
                                }
                            } else if (str6.startsWith("Ljava/util/HashMap;")) {
                                C117877b<String, String> d5 = m164448d(str6, "Ljava/util/HashMap;");
                                if (d5 != null) {
                                    HashMap hashMap = (HashMap) obj2;
                                    if (hashMap != null) {
                                        if (!hashMap.isEmpty()) {
                                            obj2 = hashMap.get(d5.mo182596a(1));
                                            if (obj2 == null) {
                                                return null;
                                            }
                                            cls2 = Class.forName((String) d5.mo182596a(0));
                                        }
                                    }
                                    return null;
                                }
                            } else {
                                cls2 = Class.forName(str6);
                            }
                        }
                    }
                }
            }
            if (obj2 == null) {
                Log.m105920e("HABBYGE-MALI.HellSessionParamUtil", "SessionParams, object == NULL !!");
                return null;
            }
            C101777fg2 fg22 = new C101777fg2();
            String valueOf = String.valueOf(obj2);
            if (obj2 instanceof Long) {
                valueOf = C116711b.m164593r(Util.getLong(valueOf, 0));
            }
            Log.m105925i("HABBYGE-MALI.HellSessionParamUtil", "SessionParams, value: %s, %s", valueOf, str4);
            fg22.f298257d = valueOf;
            fg22.f298258e = str4;
            return fg22;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static C117877b<String, Integer> m164447c(String str) {
        C117877b<String, Integer> e = m164449e(str);
        if (e == null) {
            return null;
        }
        try {
            return C117882j.m166284c(str.substring(str.indexOf("[") + 1, ((Integer) e.mo182596a(1)).intValue()), Integer.valueOf(Integer.parseInt((String) e.mo182596a(0))));
        } catch (NumberFormatException e2) {
            Log.printErrStackTrace("HABBYGE-MALI.HellSessionParamUtil", e2, "HellPageParamsCatcher, getClassNameAndIndexOfArray", new Object[0]);
            return null;
        }
    }

    /* renamed from: d */
    public static C117877b<String, String> m164448d(String str, String str2) {
        C117877b<String, Integer> e = m164449e(str);
        if (e == null) {
            return null;
        }
        return C117882j.m166284c(str.substring(str2.length(), ((Integer) e.mo182596a(1)).intValue()), (String) e.mo182596a(0));
    }

    /* renamed from: e */
    public static C117877b<String, Integer> m164449e(String str) {
        int lastIndexOf = str.lastIndexOf("@");
        if (lastIndexOf <= 0 || lastIndexOf >= str.length() - 1) {
            return null;
        }
        return C117882j.m166284c(str.substring(lastIndexOf + 1), Integer.valueOf(lastIndexOf));
    }
}
