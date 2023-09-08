package sb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p248ug.C52573x;
import p749xh.C53343o0;

/* renamed from: sb0.c */
public class C48334c extends C53343o0 {

    /* renamed from: S */
    public static IAutoDBItem.MAutoDBInfo f129412S = C53343o0.initAutoDBInfo(C48334c.class);

    /* renamed from: Q */
    public Map<String, C48353j> f129413Q = new HashMap();

    /* renamed from: R */
    public List<String> f129414R;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f129412S;
    }

    /* renamed from: l2 */
    public boolean mo73033l2(int i) {
        return (i & this.field_bitFlag) != 0;
    }

    /* renamed from: m2 */
    public C48353j mo73034m2(String str) {
        if (!((HashMap) this.f129413Q).containsKey(str) || ((HashMap) this.f129413Q).get(str) == null) {
            long currentTimeMillis = System.currentTimeMillis();
            C48353j jVar = ((C52573x) C86312j.m106911c(C52573x.class)).get(str);
            if (jVar != null) {
                ((HashMap) this.f129413Q).put(jVar.field_userId, jVar);
            }
            Log.m105919d("MicroMsg.BaseBizChatInfo", "willen get userInfo use time:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        if (((HashMap) this.f129413Q).containsKey(str)) {
            return (C48353j) ((HashMap) this.f129413Q).get(str);
        }
        return null;
    }

    /* renamed from: n2 */
    public String mo73035n2(String str) {
        C48353j m2 = mo73034m2(str);
        return m2 == null ? "" : Util.nullAs(m2.field_userName, "");
    }

    /* renamed from: o2 */
    public List<String> mo73036o2() {
        List<String> list = this.f129414R;
        if (list != null) {
            return list;
        }
        String str = this.field_userList;
        if (Util.isNullOrNil(str)) {
            return new LinkedList();
        }
        ArrayList<String> stringsToList = Util.stringsToList(str.split(";"));
        this.f129414R = stringsToList;
        return stringsToList;
    }

    /* renamed from: p2 */
    public boolean mo73037p2() {
        String str = this.field_bizChatServId;
        if (str == null) {
            return false;
        }
        return str.endsWith("@qy_g");
    }

    /* renamed from: q2 */
    public boolean mo73038q2() {
        if (this.field_needToUpdate) {
            return true;
        }
        if (!mo73037p2() || !Util.isNullOrNil(this.field_userList)) {
            return Util.isNullOrNil(this.field_chatNamePY) && !Util.isNullOrNil(this.field_chatName);
        }
        return true;
    }
}
