package rb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rb0.o */
public class C47996o {

    /* renamed from: a */
    public int f128721a;

    /* renamed from: b */
    public int f128722b;

    /* renamed from: c */
    public String f128723c;

    /* renamed from: d */
    public String f128724d;

    /* renamed from: e */
    public String f128725e;

    /* renamed from: f */
    public String f128726f;

    /* renamed from: g */
    public List<C47996o> f128727g = null;

    /* renamed from: h */
    public String f128728h;

    /* renamed from: i */
    public int f128729i;

    /* renamed from: j */
    public String f128730j;

    /* renamed from: c */
    public static LinkedList<C47996o> m53357c(Map<String, String> map) {
        int i;
        if (map != null && (i = Util.getInt(map.get(".msg.appmsg.buttonlist.$count"), 0)) > 0) {
            try {
                LinkedList<C47996o> linkedList = new LinkedList<>();
                Log.m105926v("MicroMsg.BizMenuItem", "menuItem.jsonArray.length : " + i);
                for (int i2 = 0; i2 < i; i2++) {
                    C47996o oVar = new C47996o();
                    StringBuilder sb = new StringBuilder();
                    sb.append(".msg.appmsg.buttonlist.button");
                    String str = "";
                    if (i2 != 0) {
                        str = str + i2;
                    }
                    sb.append(str);
                    String sb4 = sb.toString();
                    oVar.f128721a = Util.getInt(map.get(sb4 + ".id"), 0);
                    oVar.f128722b = Util.getInt(map.get(sb4 + ".type"), 0);
                    oVar.f128723c = map.get(sb4 + ".name");
                    oVar.f128724d = map.get(sb4 + ".key");
                    oVar.f128725e = map.get(sb4 + ".value");
                    oVar.f128729i = Util.getInt(map.get(sb4 + ".acttype"), 0);
                    linkedList.add(oVar);
                }
                return linkedList;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BizMenuItem", "exception:%s", Util.stackTraceToString(e));
            }
        }
        return null;
    }

    /* renamed from: d */
    public static List<C47996o> m53358d(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C47996o oVar = new C47996o();
                oVar.f128721a = jSONObject.getInt("id");
                oVar.f128722b = jSONObject.getInt("type");
                oVar.f128723c = jSONObject.getString("name");
                oVar.f128724d = jSONObject.getString("key");
                oVar.f128725e = jSONObject.optString("value");
                oVar.f128726f = jSONObject.optString("native_url");
                Log.m105918d("MicroMsg.BizMenuItem", "menuItem.nativeurl : " + oVar.f128726f);
                oVar.f128727g = m53358d(jSONObject.optJSONArray("sub_button_list"));
                oVar.f128729i = jSONObject.optInt("acttype");
                arrayList.add(oVar);
            }
            return arrayList;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.BizMenuItem", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: a */
    public void mo72785a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.BizMenuItem", "value null!");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pic_md5", it.next());
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pics", jSONArray);
            String jSONObject3 = jSONObject2.toString();
            this.f128730j = jSONObject3;
            Log.m105926v("MicroMsg.BizMenuItem", jSONObject3);
        } catch (JSONException e) {
            Log.m105920e("MicroMsg.BizMenuItem", e.toString());
        }
    }

    /* renamed from: b */
    public String mo72786b() {
        if (this.f128730j == null) {
            this.f128730j = "";
        }
        if (this.f128728h == null) {
            if (this.f128722b == 4) {
                this.f128728h = "menu_action_start";
            } else {
                this.f128728h = "menu_click";
            }
        }
        return String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", new Object[]{"#bizmenu#", Integer.valueOf(this.f128721a), this.f128724d, this.f128728h, this.f128730j});
    }

    public String toString() {
        Object[] objArr = new Object[7];
        objArr[0] = Integer.valueOf(this.f128721a);
        objArr[1] = Integer.valueOf(this.f128729i);
        objArr[2] = Integer.valueOf(this.f128722b);
        String str = this.f128723c;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        objArr[3] = str;
        String str3 = this.f128724d;
        if (str3 == null) {
            str3 = str2;
        }
        objArr[4] = str3;
        String str4 = this.f128725e;
        if (str4 == null) {
            str4 = str2;
        }
        objArr[5] = str4;
        String str5 = this.f128730j;
        if (str5 != null) {
            str2 = str5;
        }
        objArr[6] = str2;
        return String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", objArr);
    }
}
