package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import te3.C48869bk2;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.t */
public final class C6609t {

    /* renamed from: a */
    public static final C6609t f23865a = new C6609t();

    /* renamed from: b */
    public static Map<String, LinkedList<C48869bk2>> f23866b = new ConcurrentHashMap();

    /* renamed from: a */
    public static final void m6916a(String str, LinkedList<C48869bk2> linkedList) {
        C87412m.m108594g(str, "url");
        if (linkedList != null) {
            Class cls = C45696d.class;
            if (((C45696d) C86709a0.m107533q(cls)).B60(str)) {
                str = ((C45696d) C86709a0.m107533q(cls)).mo70950A9(str);
            }
            Log.m105924i("MicroMsg.WebComptCache", "addJSAPIWebCompt " + linkedList.size());
            if (str != null) {
                ((ConcurrentHashMap) f23866b).put(str, linkedList);
            }
        }
    }

    /* renamed from: b */
    public final LinkedList<C48869bk2> mo7532b(String str, JSONArray jSONArray) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(jSONArray, "list");
        Class cls = C45696d.class;
        if (((C45696d) C86709a0.m107533q(cls)).B60(str)) {
            str = ((C45696d) C86709a0.m107533q(cls)).mo70950A9(str);
        }
        LinkedList<C48869bk2> linkedList = new LinkedList<>();
        LinkedList<C48869bk2> linkedList2 = (LinkedList) ((ConcurrentHashMap) f23866b).get(str);
        if (linkedList2 != null) {
            for (C48869bk2 bk22 : linkedList2) {
                int i = 0;
                int length = jSONArray.length();
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (Util.isEqual((String) jSONArray.get(i), bk22.f131168d)) {
                        linkedList.add(bk22);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return linkedList;
    }
}
