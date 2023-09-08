package s82;

import android.database.Cursor;
import bs3.C104166f;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import dd0.C75349f;
import java.util.LinkedHashMap;

/* renamed from: s82.a */
public class C77624a extends MAutoStorage<C75349f> {

    /* renamed from: d */
    public static final String[] f226286d = {MAutoStorage.getCreateSQLs(C75349f.f221512F, "MultiTalkInfo"), "CREATE INDEX IF NOT EXISTS idx_MultiTalkInfo_key  on MultiTalkInfo  (  wxGroupId )"};

    /* renamed from: s82.a$a */
    public class C77625a extends LinkedHashMap<String, Class> {
        public C77625a() {
            Class<String> cls = String.class;
            put("wxGroupId", cls);
            put("groupId", cls);
            Class cls2 = Integer.TYPE;
            put("roomId", cls2);
            Class cls3 = Long.TYPE;
            put("roomKey", cls3);
            put("routeId", cls2);
            put("createTime", cls3);
            put("ilinkRoomId", cls3);
        }
    }

    static {
        new C77625a();
    }

    public C77624a(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C75349f.f221512F, "MultiTalkInfo", (String[]) null);
    }

    /* renamed from: Lo */
    public boolean mo107805Lo(C75349f fVar) {
        if (fVar == null) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo is null!");
            return false;
        }
        String str = fVar.field_wxGroupId;
        if (C104166f.m139002b(str)) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo wxGroupId is empty!");
            return false;
        }
        Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d, ilinkroomid=%d", str, fVar.field_groupId, Integer.valueOf(fVar.field_roomId), Long.valueOf(fVar.field_roomKey), Integer.valueOf(fVar.field_routeId), fVar.field_inviteUserName, Integer.valueOf(fVar.field_memberCount), Long.valueOf(fVar.field_createTime), Long.valueOf(fVar.field_ilinkRoomId));
        try {
            boolean insert = insert(fVar);
            Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "insert ret " + insert + " for id=%s" + str);
            return insert;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e.toString());
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo107806c(String str) {
        Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete id = %s", str);
        try {
            super.execSQL("MultiTalkInfo", "delete from MultiTalkInfo where wxGroupId = \"" + str + FastJsonResponse.QUOTE);
            return true;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "delete fail for wxGroupId = " + str);
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: jo */
    public C75349f mo107807jo(String str) {
        String str2 = str;
        Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTaklInfo for wxGroupId = %s", str2);
        Cursor rawQuery = rawQuery("select wxGroupId, groupId, roomId, roomKey, routeId, inviteUserName,memberCount,createTime,state,ilinkRoomId from MultiTalkInfo where wxGroupId = '" + str2 + "'", new String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToNext()) {
                    C75349f fVar = new C75349f();
                    fVar.field_wxGroupId = rawQuery.getString(0);
                    fVar.field_groupId = rawQuery.getString(1);
                    fVar.field_roomId = rawQuery.getInt(2);
                    fVar.field_roomKey = rawQuery.getLong(3);
                    fVar.field_routeId = rawQuery.getInt(4);
                    fVar.field_inviteUserName = rawQuery.getString(5);
                    fVar.field_memberCount = rawQuery.getInt(6);
                    fVar.field_createTime = rawQuery.getLong(7);
                    fVar.field_state = rawQuery.getInt(8);
                    fVar.field_ilinkRoomId = rawQuery.getLong(9);
                    Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d,inviteUser=%s,memberCount=%d, createTime=%d,field_state=%d, ilinkroomid=%d", fVar.field_wxGroupId, fVar.field_groupId, Integer.valueOf(fVar.field_roomId), Long.valueOf(fVar.field_roomKey), Integer.valueOf(fVar.field_routeId), fVar.field_inviteUserName, Integer.valueOf(fVar.field_memberCount), Long.valueOf(fVar.field_createTime), Integer.valueOf(fVar.field_state), Long.valueOf(fVar.field_ilinkRoomId));
                    rawQuery.close();
                    return fVar;
                }
            } catch (Exception e) {
                Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "getMultiTalkInfo error! " + e.toString());
                rawQuery.close();
                return null;
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
        }
        if (rawQuery == null) {
            return null;
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: qq */
    public boolean mo107808qq(C75349f fVar) {
        if (fVar == null) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo is null!");
            return false;
        }
        String str = fVar.field_wxGroupId;
        if (C104166f.m139002b(str)) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo wxGroupId is empty!");
            return false;
        }
        Log.m105925i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d,state=%d,ilinkroomid=%d", str, fVar.field_groupId, Integer.valueOf(fVar.field_roomId), Long.valueOf(fVar.field_roomKey), Integer.valueOf(fVar.field_routeId), fVar.field_inviteUserName, Integer.valueOf(fVar.field_memberCount), Long.valueOf(fVar.field_createTime), Integer.valueOf(fVar.field_state), Long.valueOf(fVar.field_ilinkRoomId));
        try {
            boolean update = update(fVar, "wxGroupId");
            Log.m105924i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update ret " + update + " for id=%s" + str);
            return update;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e.toString());
            return false;
        }
    }
}
