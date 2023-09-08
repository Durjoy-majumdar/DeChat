package if0;

import android.util.Base64;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import pe3.C47465a;
import pe3.C89349b;

/* renamed from: if0.a */
public final class C46238a {

    /* renamed from: a */
    public static final C46239a f124644a = new C46239a((C8480h) null);

    /* renamed from: if0.a$a */
    public static final class C46239a {
        public C46239a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo71652a(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return true;
            }
            if (obj == null || obj2 == null || !C87412m.m108589b(obj.getClass(), obj2.getClass())) {
                return false;
            }
            return (!(obj instanceof LinkedList) || !(obj2 instanceof LinkedList)) ? (!(obj instanceof C47465a) || !(obj2 instanceof C47465a)) ? (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? C87412m.m108589b(obj, obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2) : ((C47465a) obj).compareContent((C47465a) obj2) : mo71653b((LinkedList) obj, (LinkedList) obj2);
        }

        /* renamed from: b */
        public final boolean mo71653b(LinkedList<?> linkedList, LinkedList<?> linkedList2) {
            C87412m.m108594g(linkedList, "thisField");
            C87412m.m108594g(linkedList2, "otherField");
            if (linkedList.size() != linkedList2.size()) {
                return false;
            }
            int size = linkedList.size();
            for (int i = 0; i < size; i++) {
                if (!mo71652a(linkedList.get(i), linkedList2.get(i))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo71654c(Object obj) {
            C87412m.m108594g(obj, "value");
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                return obj instanceof Character;
            }
            return true;
        }

        /* renamed from: d */
        public final void mo71655d(JSONObject jSONObject, String str, Object obj, boolean z) {
            C87412m.m108594g(jSONObject, "obj");
            C87412m.m108594g(str, "key");
            if (obj == null) {
                jSONObject.put(str, (Object) null);
            } else if (obj instanceof LinkedList) {
                jSONObject.put(str, mo71656e((LinkedList) obj));
            } else if (obj instanceof C47465a) {
                jSONObject.put(str, ((C47465a) obj).toJSON());
            } else if (obj instanceof C89349b) {
                if (z) {
                    try {
                        jSONObject.put(str, Base64.encodeToString(((C89349b) obj).f257327a, 0));
                    } catch (Exception unused) {
                    }
                } else {
                    jSONObject.put(str, ((C89349b) obj).mo123705h());
                }
            } else if (obj instanceof byte[]) {
                jSONObject.put(str, "ByteArray[" + ((byte[]) obj).length + ']');
            } else if (mo71654c(obj)) {
                jSONObject.put(str, obj);
            }
        }

        /* renamed from: e */
        public final JSONArray mo71656e(LinkedList<?> linkedList) {
            JSONArray jSONArray = new JSONArray();
            if (linkedList != null) {
                Iterator<?> it = linkedList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof LinkedList) {
                        jSONArray.put(mo71656e((LinkedList) next));
                    } else if (next instanceof C47465a) {
                        jSONArray.put(((C47465a) next).toJSON());
                    } else if (next instanceof C89349b) {
                        try {
                            jSONArray.put(((C89349b) next).mo123705h());
                        } catch (Exception unused) {
                        }
                    } else {
                        C87412m.m108593f(next, "item");
                        if (mo71654c(next)) {
                            jSONArray.put(next);
                        }
                    }
                }
            }
            return jSONArray;
        }
    }

    /* renamed from: a */
    public static final boolean m51546a(Object obj, Object obj2) {
        return f124644a.mo71652a(obj, obj2);
    }

    /* renamed from: b */
    public static final void m51547b(JSONObject jSONObject, String str, Object obj) {
        C46239a aVar = f124644a;
        C87412m.m108594g(jSONObject, "obj");
        C87412m.m108594g(str, "key");
        aVar.mo71655d(jSONObject, str, obj, false);
    }
}
