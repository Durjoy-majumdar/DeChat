package p684si;

import android.database.Cursor;
import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C38698x4;
import p749xh.C66261f3;

/* renamed from: si.e */
public class C36674e extends C38698x4 {

    /* renamed from: v */
    public static IAutoDBItem.MAutoDBInfo f97468v = C38698x4.initAutoDBInfo(C36674e.class);

    /* renamed from: t */
    public LinkedList<GroupToolItem> f97469t = new LinkedList<>();

    /* renamed from: u */
    public LinkedList<GroupToolItem> f97470u = new LinkedList<>();

    /* renamed from: si.e$a */
    public class C36675a implements Comparator<GroupToolItem> {
        public C36675a(C36674e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            return Long.compare(((GroupToolItem) obj2).f79320f, ((GroupToolItem) obj).f79320f);
        }
    }

    public C36674e() {
        this.field_queryState = 0;
    }

    /* renamed from: m2 */
    public static String m41039m2(List<GroupToolItem> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (GroupToolItem next : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("username", next.f79318d);
                jSONObject.put("path", next.f79319e);
                jSONObject.put(C66261f3.COL_UPDATETIME, next.f79320f);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.roomtools.GroupTools", "getToolsJsonStr() Exception:%s", e.getMessage());
        }
        return jSONArray.toString();
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
        this.f97469t.clear();
        if (!Util.isNullOrNil(this.field_stickToollist)) {
            try {
                JSONArray jSONArray = new JSONArray(this.field_stickToollist);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                    GroupToolItem groupToolItem = new GroupToolItem();
                    groupToolItem.f79318d = Util.nullAs(jSONObject.getString("username"), "");
                    groupToolItem.f79319e = Util.nullAs(jSONObject.getString("path"), "");
                    this.f97469t.add(groupToolItem);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.roomtools.GroupTools", "parseStickTools() Exception:%s", e.getMessage());
            }
        }
        this.f97470u.clear();
        if (!Util.isNullOrNil(this.field_recentUseToolList)) {
            try {
                JSONArray jSONArray2 = new JSONArray(this.field_recentUseToolList);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i2));
                    GroupToolItem groupToolItem2 = new GroupToolItem();
                    groupToolItem2.f79318d = Util.nullAs(jSONObject2.getString("username"), "");
                    groupToolItem2.f79319e = Util.nullAs(jSONObject2.getString("path"), "");
                    groupToolItem2.f79320f = jSONObject2.getLong(C66261f3.COL_UPDATETIME);
                    this.f97470u.add(groupToolItem2);
                }
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.roomtools.GroupTools", "parseRecentUseTools() Exception:%s", e2.getMessage());
            }
        }
    }

    public boolean equals(Object obj) {
        return Util.isEqual(((C36674e) obj).field_chatroomname, this.field_chatroomname);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f97468v;
    }

    /* renamed from: l2 */
    public void mo60796l2(GroupToolItem groupToolItem) {
        if (this.f97470u.contains(groupToolItem)) {
            this.f97470u.remove(groupToolItem);
        }
        this.f97470u.add(groupToolItem);
        Collections.sort(this.f97470u, new C36675a(this));
        if (this.f97470u.size() > 20) {
            LinkedList<GroupToolItem> linkedList = this.f97470u;
            linkedList.remove(linkedList.size() - 1);
        }
        this.field_recentUseToolList = m41039m2(this.f97470u);
    }

    /* renamed from: n2 */
    public boolean mo60797n2() {
        return this.f97469t.size() >= 8;
    }
}
