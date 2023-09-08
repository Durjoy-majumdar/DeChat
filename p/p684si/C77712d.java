package p684si;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86312j;
import eb0.C31543z5;
import java.util.ArrayList;
import p644pi.C77089d;
import zt3.C119157j;

/* renamed from: si.d */
public class C77712d extends MAutoStorage<C77711c> implements MStorageEx.IOnStorageChange {

    /* renamed from: e */
    public static final Long f226493e = Long.valueOf(FrequentLimiter.WEEK_MILLS);

    /* renamed from: f */
    public static final String[] f226494f = {MAutoStorage.getCreateSQLs(C77711c.f226491T, "GroupTodo")};

    /* renamed from: g */
    public static final String[] f226495g = {"CREATE INDEX IF NOT EXISTS todoIdIndex ON GroupTodo ( todoid )", "CREATE INDEX IF NOT EXISTS todoIdRoomNameIndex ON GroupTodo ( todoid,roomname )", "CREATE INDEX IF NOT EXISTS roomNameIndex ON GroupTodo ( roomname )"};

    /* renamed from: d */
    public ISQLiteDatabase f226496d;

    /* renamed from: si.d$a */
    public class C77713a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f226497d;

        public C77713a(C77712d dVar, String str) {
            this.f226497d = str;
        }

        public void run() {
            int i;
            C77712d wx02 = ((C77089d) C86312j.m106911c(C77089d.class)).wx0();
            String str = this.f226497d;
            wx02.getClass();
            try {
                ISQLiteDatabase iSQLiteDatabase = wx02.f226496d;
                i = iSQLiteDatabase.delete("GroupTodo", "createtime<? and username=?", new String[]{(C31543z5.m39453c() - C77712d.f226493e.longValue()) + "", str});
            } catch (Exception e) {
                Log.m105921e("MicroMsg.roomTodo.GroupTodoStorage", "deleteExpireData Exception：[%s %s]", e.getClass().getSimpleName(), e.getMessage());
                i = 0;
            }
            Log.m105925i("MicroMsg.roomTodo.GroupTodoStorage", "onNotifyChange delete expire data : %s", Boolean.valueOf(i > 0));
        }
    }

    public C77712d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C77711c.f226491T, "GroupTodo", f226495g);
        this.f226496d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public C77711c mo107864Lo(String str, String str2) {
        Cursor query;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2) || (query = this.f226496d.query("GroupTodo", C77711c.f226491T.columns, "roomname=? and todoid=?", new String[]{str, str2}, (String) null, (String) null, (String) null)) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (query.moveToNext()) {
                C77711c cVar = new C77711c();
                cVar.convertFrom(query);
                arrayList.add(cVar);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            C77711c cVar2 = (C77711c) arrayList.get(0);
            query.close();
            return cVar2;
        } finally {
            query.close();
        }
    }

    /* renamed from: jo */
    public boolean mo107865jo(C77711c cVar) {
        if (cVar == null) {
            return true;
        }
        if (cVar.systemRowid == -1) {
            C77711c Lo = mo107864Lo(cVar.field_roomname, cVar.field_todoid);
            if (Lo == null) {
                return true;
            }
            cVar.systemRowid = Lo.systemRowid;
        }
        return delete(cVar.systemRowid);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.roomTodo.GroupTodoStorage", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        if (i == 5 && (mStorageEx instanceof C30783v3)) {
            Log.m105925i("MicroMsg.roomTodo.GroupTodoStorage", "delete, username %s", Integer.valueOf(i), str);
            ((C119157j) C119157j.f356862d).mo183875f(new C77713a(this, str));
        }
    }

    /* renamed from: qq */
    public boolean insert(C77711c cVar) {
        if (cVar == null) {
            return false;
        }
        return super.insert(cVar);
    }
}
