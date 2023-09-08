package com.tencent.p014mm.plugin.account.friend.model;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72987n3;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C76187y0;
import hg0.C76188z;
import java.util.ArrayList;
import java.util.List;
import mg0.C76754b;
import zh3.C91753f;

/* renamed from: com.tencent.mm.plugin.account.friend.model.a */
public class C68397a {
    /* renamed from: a */
    public static C76188z m80735a(String str, String str2) {
        String str3 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + C91753f.m115264e(str2) + " AND " + "oldUsername" + " = " + C91753f.m115264e(str);
        Log.m105925i("MicroMsg.RecoverFriendLogic", "get old acct friend, sql %s", str3);
        Cursor rawQuery = ((C76754b) C86312j.m106911c(C76754b.class)).mo105753zo().rawQuery(str3, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        try {
            if (rawQuery.moveToFirst()) {
                C76188z zVar = new C76188z();
                zVar.convertFrom(rawQuery);
                return zVar;
            }
            rawQuery.close();
            return null;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    public static List<C68398a> m80736b(String str, int i) {
        String str2;
        if (i > 0) {
            str2 = "SELECT *,rowid FROM OldAccountFriend " + " WHERE showHead = " + i + " AND " + "oldUsername" + " = " + C91753f.m115264e(str) + " ORDER BY " + "pinyinName";
        } else {
            str2 = "SELECT *,rowid FROM OldAccountFriend " + " WHERE oldUsername = " + C91753f.m115264e(str) + " ORDER BY " + "showHead" + "," + "pinyinName";
        }
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = ((C76754b) C86312j.m106911c(C76754b.class)).mo105753zo().rawQuery(str2, new String[0]);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    C76188z zVar = new C76188z();
                    zVar.convertFrom(rawQuery);
                    C72985m3 Ow = ((C72987n3) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96104vj()).mo101187Ow(zVar.field_encryptUsername);
                    if (Ow == null || !zVar.field_encryptUsername.equals(Ow.field_talker)) {
                        arrayList.add(new C68398a(zVar));
                    } else {
                        arrayList.add(new C68398a(zVar, Ow));
                    }
                } finally {
                    rawQuery.close();
                }
            }
        }
        Log.m105925i("MicroMsg.RecoverFriendLogic", "get recover friend, sql %s, get %d data", str2, Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    /* renamed from: c */
    public static void m80737c(String str, int i) {
        Class cls = C76754b.class;
        if (!Util.isNullOrNil(str)) {
            String str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + C91753f.m115264e(str);
            Log.m105925i("MicroMsg.RecoverFriendLogic", "update old acct friend add state, sql %s", str2);
            Cursor rawQuery = ((C76754b) C86312j.m106911c(cls)).mo105753zo().rawQuery(str2, new String[0]);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        C76188z zVar = new C76188z();
                        zVar.convertFrom(rawQuery);
                        zVar.field_addState = i;
                        ((C76187y0) ((C76754b) C86312j.m106911c(cls)).mo105753zo()).replace(zVar);
                    }
                } finally {
                    rawQuery.close();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.friend.model.a$a */
    public static class C68398a {

        /* renamed from: a */
        public C76188z f196538a;

        /* renamed from: b */
        public C72985m3 f196539b;

        public C68398a(C76188z zVar) {
            this.f196538a = zVar;
        }

        public C68398a(C76188z zVar, C72985m3 m3Var) {
            this.f196538a = zVar;
            this.f196539b = m3Var;
        }
    }
}
