package xz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.HashMap;
import p749xh.C78828v4;

/* renamed from: xz1.a */
public class C79013a extends C78828v4 {

    /* renamed from: R */
    public static IAutoDBItem.MAutoDBInfo f232000R = C78828v4.initAutoDBInfo(C79013a.class);

    /* renamed from: H */
    public String f232001H = "";

    /* renamed from: I */
    public String f232002I = "";

    /* renamed from: J */
    public String f232003J = "";

    /* renamed from: K */
    public String f232004K = " ";

    /* renamed from: L */
    public int f232005L = 1;

    /* renamed from: M */
    public boolean f232006M = false;

    /* renamed from: N */
    public HashMap<Integer, C79014b> f232007N = new HashMap<>();

    /* renamed from: P */
    public boolean f232008P = false;

    /* renamed from: Q */
    public int f232009Q = 0;

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f232000R;
    }

    /* renamed from: l2 */
    public C79013a clone() {
        C79013a aVar;
        Exception e;
        try {
            aVar = new C79013a();
            try {
                aVar.systemRowid = this.systemRowid;
                aVar.field_username = this.field_username;
                aVar.field_key = this.field_key;
                aVar.field_content = this.field_content;
                aVar.field_creator = this.field_creator;
                aVar.field_num = this.field_num;
                aVar.field_firstMsgId = this.field_firstMsgId;
                aVar.field_msgSvrId = this.field_msgSvrId;
                aVar.field_active = this.field_active;
                aVar.field_lastActiveTime = this.field_lastActiveTime;
                aVar.f232001H = this.f232001H;
                aVar.f232002I = this.f232002I;
                aVar.f232003J = this.f232003J;
                aVar.f232004K = this.f232004K;
                aVar.f232005L = this.f232005L;
                aVar.f232009Q = this.f232009Q;
                aVar.f232008P = this.f232008P;
                aVar.f232007N = new HashMap<>();
                for (int i = 1; i <= this.f232007N.size(); i++) {
                    aVar.f232007N.put(Integer.valueOf(i), this.f232007N.get(Integer.valueOf(i)).clone());
                }
            } catch (Exception e2) {
                e = e2;
                Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatire", "clone() Exception:%s %s", e.getClass(), e.getMessage());
                return aVar;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            aVar = null;
            e = exc;
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatire", "clone() Exception:%s %s", e.getClass(), e.getMessage());
            return aVar;
        }
        return aVar;
    }

    public String toString() {
        return "GroupSolitatire{header='" + this.f232001H + '\'' + ", example='" + this.f232002I + '\'' + ", tail='" + this.f232003J + '\'' + ", separator='" + this.f232004K + '\'' + ", hasRealTitle=" + this.f232005L + ", content=" + this.f232007N + ", includeRepeatedContent=" + this.f232008P + ", includeWhiteContentNum=" + this.f232009Q + ", field_username='" + this.field_username + '\'' + ", field_key='" + this.field_key + '\'' + ", field_content='" + this.field_content + '\'' + ", field_creator='" + this.field_creator + '\'' + ", field_num=" + this.field_num + ", field_firstMsgId=" + this.field_firstMsgId + ", field_msgSvrId=" + this.field_msgSvrId + ", field_active=" + this.field_active + ", field_lastActiveTime=" + this.field_lastActiveTime + ", systemRowid=" + this.systemRowid + '}';
    }
}
