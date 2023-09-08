package sb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import java.util.HashMap;
import java.util.Map;
import rb0.C48009v0;
import sf0.C77691f;

/* renamed from: sb0.k */
public class C48354k extends MAutoStorage<C48353j> {

    /* renamed from: g */
    public static final String[] f129456g = {MAutoStorage.getCreateSQLs(C48353j.f129455F, "BizChatUserInfo")};

    /* renamed from: d */
    public Map<String, String> f129457d = new HashMap();

    /* renamed from: e */
    public ISQLiteDatabase f129458e;

    /* renamed from: f */
    public final MStorageEvent<C48356b, C48356b.C48357a> f129459f = new C48355a(this);

    /* renamed from: sb0.k$a */
    public class C48355a extends MStorageEvent<C48356b, C48356b.C48357a> {
        public C48355a(C48354k kVar) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C48356b) obj).mo73079a((C48356b.C48357a) obj2);
        }
    }

    /* renamed from: sb0.k$b */
    public interface C48356b {

        /* renamed from: sb0.k$b$a */
        public static class C48357a {
        }

        /* renamed from: a */
        void mo73079a(C48357a aVar);
    }

    public C48354k(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C48353j.f129455F, "BizChatUserInfo", (String[]) null);
        this.f129458e = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("BizChatUserInfo", "CREATE INDEX IF NOT EXISTS bizUserIdIndex ON BizChatUserInfo ( userId )");
        this.f129457d.clear();
    }

    /* renamed from: Lo */
    public boolean mo73075Lo(C48353j jVar) {
        Log.m105918d("MicroMsg.BizChatUserInfoStorage", "BizChatUserInfo update");
        if (jVar == null) {
            Log.m105928w("MicroMsg.BizChatUserInfoStorage", "update wrong argument");
            return false;
        }
        if (Util.isNullOrNil(jVar.field_userName)) {
            Log.m105924i("MicroMsg.BizChatUserInfoStorage", "dealWithChatNamePY null");
        } else {
            jVar.field_userNamePY = C77691f.m93686a(jVar.field_userName);
        }
        boolean replace = super.replace(jVar);
        if (replace) {
            this.f129459f.event(new C48356b.C48357a());
            this.f129459f.doNotify();
        }
        return replace;
    }

    /* renamed from: Pk */
    public String mo73076Pk(String str) {
        if (str == null) {
            Log.m105924i("MicroMsg.BizChatUserInfoStorage", "getMyUserId brandUserName is null");
            return null;
        }
        Log.m105925i("MicroMsg.BizChatUserInfoStorage", "getMyUserId:%s", str);
        if (((HashMap) this.f129457d).containsKey(str) && ((HashMap) this.f129457d).get(str) != null) {
            return (String) ((HashMap) this.f129457d).get(str);
        }
        C36650f Lo = C48009v0.xx0().mo73049Lo(str);
        if (Lo != null) {
            Log.m105919d("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo brandUserName:%s,%s", str, Lo.field_userId);
            ((HashMap) this.f129457d).put(str, Lo.field_userId);
            return Lo.field_userId;
        }
        Log.m105929w("MicroMsg.BizChatUserInfoStorage", "getMyUserId bizChatMyUserInfo == null brandUserName:%s", str);
        return null;
    }

    public C48353j get(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatUserInfoStorage", "get  wrong argument");
            return null;
        }
        C48353j jVar = new C48353j();
        jVar.field_userId = str;
        super.get(jVar, new String[0]);
        return jVar;
    }

    /* renamed from: jo */
    public boolean insert(C48353j jVar) {
        Log.m105918d("MicroMsg.BizChatUserInfoStorage", "BizChatUserInfo insert");
        if (jVar == null) {
            Log.m105928w("MicroMsg.BizChatUserInfoStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(jVar);
        if (insert) {
            this.f129459f.event(new C48356b.C48357a());
            this.f129459f.doNotify();
        }
        return insert;
    }
}
