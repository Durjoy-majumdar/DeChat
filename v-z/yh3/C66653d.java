package yh3;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C57600p4;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yh3.d */
public class C66653d {

    /* renamed from: a */
    public static boolean f191653a;

    /* renamed from: a */
    public static void m78635a(C72994y1.C72995a aVar, Queue<C57600p4> queue) {
        JSONArray jSONArray;
        boolean z;
        C72994y1.C72995a aVar2 = aVar;
        if (aVar2 != null) {
            C86709a0.m107528h();
            Object obj = null;
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar2, (Object) null);
            if (!Util.isNullOrNil(str)) {
                List<C66648a> b = m78636b(str);
                if (!Util.isNullOrNil((List) b)) {
                    int i = 0;
                    while (true) {
                        LinkedList linkedList = (LinkedList) b;
                        if (i < linkedList.size()) {
                            C66648a aVar3 = (C66648a) linkedList.get(i);
                            C57600p4 p4Var = new C57600p4();
                            p4Var.f164920d = aVar3.f191647a;
                            p4Var.f164921e = aVar3.f191648b.longValue();
                            p4Var.f164922f = C66649b.f191649b.mo90705a(p4Var.f164920d);
                            queue.offer(p4Var);
                            String str2 = aVar3.f191647a;
                            C86709a0.m107528h();
                            List<C66648a> b2 = m78636b(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(aVar2, obj)));
                            if (!Util.isNullOrNil((List) b2)) {
                                if (!Util.isNullOrNil((List) b2) && !Util.isNullOrNil(str2)) {
                                    int i2 = 0;
                                    while (true) {
                                        LinkedList linkedList2 = (LinkedList) b2;
                                        if (i2 >= linkedList2.size()) {
                                            break;
                                        } else if (((C66648a) linkedList2.get(i2)).f191647a.equals(str2)) {
                                            z = true;
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                                z = false;
                                if (z) {
                                    int i3 = -1;
                                    if (!Util.isNullOrNil((List) b2) && !Util.isNullOrNil(str2)) {
                                        int i4 = 0;
                                        while (true) {
                                            LinkedList linkedList3 = (LinkedList) b2;
                                            if (i4 >= linkedList3.size()) {
                                                break;
                                            } else if (((C66648a) linkedList3.get(i4)).f191647a.equals(str2)) {
                                                i3 = i4;
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    ((LinkedList) b2).remove(i3);
                                }
                                jSONArray = new JSONArray();
                                int i5 = 0;
                                while (true) {
                                    LinkedList linkedList4 = (LinkedList) b2;
                                    if (i5 >= linkedList4.size()) {
                                        break;
                                    }
                                    C66648a aVar4 = (C66648a) linkedList4.get(i5);
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("name", aVar4.f191647a);
                                        jSONObject.put("time", aVar4.f191648b);
                                    } catch (JSONException e) {
                                        Log.m105920e("RecentForwardStorage", "deleteRecentForwardStorage: " + e.getMessage());
                                    }
                                    jSONArray.put(jSONObject);
                                    i5++;
                                }
                            } else {
                                Long valueOf = Long.valueOf(C31543z5.m39451a());
                                JSONArray jSONArray2 = new JSONArray();
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("name", str2);
                                    jSONObject2.put("time", valueOf);
                                } catch (JSONException e2) {
                                    Log.m105920e("RecentForwardStorage", "deleteRecentForwardStorage: " + e2.getMessage());
                                }
                                jSONArray2.put(jSONObject2);
                                jSONArray = jSONArray2;
                            }
                            Log.m105925i("RecentForwardStorage", "recent name list: %s", jSONArray);
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(aVar2, jSONArray.toString());
                            i++;
                            obj = null;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static List<C66648a> m78636b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                linkedList.add(new C66648a(optJSONObject.optString("name"), Long.valueOf(optJSONObject.optLong("time"))));
            }
            return linkedList;
        } catch (Throwable th) {
            Log.m105921e("RecentForwardStorage", "optListFromJSONStr err! %s", Util.stackTraceToString(th));
            return null;
        }
    }
}
