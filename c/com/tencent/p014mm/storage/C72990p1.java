package com.tencent.p014mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.xweb.file.XVFSFile;
import g62.C75871e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import p788aj.C67053c;
import p788aj.C67054d;
import zh3.C91753f;

/* renamed from: com.tencent.mm.storage.p1 */
public class C72990p1 extends MStorageEx implements C75871e {

    /* renamed from: d */
    public static final String[] f212824d = {MAutoStorage.getCreateSQLs(C72988o1.f212817x, "ChatroomMsgSeq")};

    /* renamed from: e */
    public static final String[] f212825e = {"CREATE INDEX IF NOT EXISTS  ChatroomMsgSeqTalkerIndex ON ChatroomMsgSeq ( username )"};

    /* renamed from: c */
    public C91753f f212826c;

    public C72990p1(C91753f fVar) {
        this.f212826c = fVar;
        fVar.execSQL("ChatroomMsgSeq", f212825e[0]);
    }

    /* renamed from: A */
    public int mo101199A(String str, long j, long j2) {
        C67054d dVar = mo101216v(str).field_seqBlockInfo;
        int i = 0;
        if (dVar == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "[getBlockCount] seqBlockInfo is null!");
            return 0;
        }
        for (C67053c next : dVar.f192605d) {
            if (j <= next.f192603f && next.f192604g <= j2) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public long mo101200B(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select lastPushSeq from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed " + str);
            return -2;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -3;
        }
    }

    /* renamed from: C */
    public long mo101201C(C72988o1 o1Var) {
        return mo101208n(o1Var, false);
    }

    /* renamed from: D */
    public boolean mo101202D() {
        long delete = (long) this.f212826c.delete("ChatroomMsgSeq", "", (String[]) null);
        Log.m105928w("MicroMsg.ChatroomMsgSeqStorage", "[deleteTable] result:" + delete + " table:" + "ChatroomMsgSeq");
        return delete >= 0;
    }

    /* renamed from: E */
    public long mo101203E(C72988o1 o1Var) {
        if (o1Var == null) {
            return -1;
        }
        ContentValues convertTo = o1Var.convertTo();
        return (long) this.f212826c.update("ChatroomMsgSeq", convertTo, "username = ?", new String[]{o1Var.field_username});
    }

    /* renamed from: c */
    public long mo101204c(String str) {
        return (long) this.f212826c.delete("ChatroomMsgSeq", "username = ?", new String[]{str});
    }

    /* renamed from: k */
    public boolean mo101205k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed " + str);
            return false;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j > 0;
        } else {
            rawQuery.close();
            return false;
        }
    }

    /* renamed from: l */
    public boolean mo101206l(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return this.f212826c.execSQL("ChatroomMsgSeq", "update ChatroomMsgSeq set lastLocalSeq =  " + j + " where " + "username" + " = \"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
    }

    /* renamed from: m */
    public boolean mo101207m(String str, C67054d dVar) {
        if (str == null || str.length() <= 0) {
            Log.m105920e("MicroMsg.ChatroomMsgSeqStorage", "updateSeqBlockInfo failed");
            return false;
        }
        byte[] bArr = new byte[0];
        try {
            bArr = dVar.toByteArray();
        } catch (Exception unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("seqBlockInfo", bArr);
        return this.f212826c.update("ChatroomMsgSeq", contentValues, "username = ?", new String[]{Util.escapeSqlValue(str)}) > 0;
    }

    /* renamed from: n */
    public long mo101208n(C72988o1 o1Var, boolean z) {
        if (o1Var == null) {
            return -1;
        }
        long q = this.f212826c.mo125627q("ChatroomMsgSeq", "username", o1Var.convertTo(), false);
        if (q >= 0) {
            C75871e.C75872a aVar = new C75871e.C75872a();
            aVar.f222517a = 4;
            aVar.f222518b = o1Var.field_username;
            aVar.f222519c = z;
            doNotify(4, this, aVar);
        }
        return q;
    }

    /* renamed from: o */
    public StringBuilder mo101209o(String str) {
        StringBuilder sb = new StringBuilder();
        C67054d dVar = mo101216v(str).field_seqBlockInfo;
        if (dVar == null) {
            return sb;
        }
        for (C67053c next : dVar.f192605d) {
            sb.append("[");
            sb.append(next.f192601d);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(next.f192602e);
            sb.append("][");
            sb.append(next.f192603f);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(next.f192604g);
            sb.append("] | ");
        }
        return sb;
    }

    /* renamed from: p */
    public long mo101210p(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select lastLocalSeq from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed " + str);
            return -2;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -3;
        }
    }

    /* renamed from: q */
    public long mo101211q(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select lastLocalCreateTime from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed " + str);
            return -2;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -3;
        }
    }

    /* renamed from: r */
    public C67054d mo101212r(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed username is null!");
            return new C67054d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select seqBlockInfo from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed " + str);
            return new C67054d();
        } else if (rawQuery.moveToFirst()) {
            byte[] blob = rawQuery.getBlob(0);
            if (Util.isNullOrNil(blob)) {
                rawQuery.close();
                return new C67054d();
            }
            C67054d dVar = new C67054d();
            try {
                dVar.parseFrom(blob);
            } catch (Exception unused) {
            }
            rawQuery.close();
            return dVar;
        } else {
            rawQuery.close();
            return new C67054d();
        }
    }

    /* renamed from: s */
    public C67053c mo101213s(String str, long j, boolean z) {
        C67054d r = mo101212r(str);
        if (r.f192605d.size() <= 0) {
            return null;
        }
        Iterator<C67053c> it = r.f192605d.iterator();
        while (it.hasNext()) {
            C67053c next = it.next();
            if (!z) {
                if (next.f192604g > j) {
                    return next;
                }
            } else if (next.f192603f > j) {
                return next;
            }
        }
        return null;
    }

    public boolean shouldProcessEvent() {
        return true;
    }

    /* renamed from: t */
    public long mo101214t(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select lastPushCreateTime from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            Log.m105924i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed " + str);
            return -2;
        } else if (rawQuery.moveToFirst()) {
            long j = rawQuery.getLong(0);
            rawQuery.close();
            return j;
        } else {
            rawQuery.close();
            return -3;
        }
    }

    /* renamed from: u */
    public boolean mo101215u(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return this.f212826c.execSQL("ChatroomMsgSeq", "update ChatroomMsgSeq set lastLocalCreateTime =  " + j + " where " + "username" + " = \"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
    }

    /* renamed from: v */
    public C72988o1 mo101216v(String str) {
        Log.m105925i("MicroMsg.ChatroomMsgSeqStorage", "[getChatroomMsgSeq] username:%s", str);
        C72988o1 o1Var = new C72988o1();
        StringBuilder sb = new StringBuilder();
        sb.append("select * from ChatroomMsgSeq where username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f212826c.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            return o1Var;
        }
        if (rawQuery.moveToFirst()) {
            o1Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o1Var;
    }

    /* renamed from: w */
    public C67053c mo101217w(String str, long j) {
        C67054d r = mo101212r(str);
        if (r.f192605d.size() <= 0) {
            return null;
        }
        LinkedList<C67053c> linkedList = r.f192605d;
        ListIterator<C67053c> listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            C67053c previous = listIterator.previous();
            if (previous.f192603f < j) {
                return previous;
            }
        }
        return null;
    }

    /* renamed from: x */
    public boolean mo101218x(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        return this.f212826c.execSQL("ChatroomMsgSeq", "update ChatroomMsgSeq set lastPushCreateTime =  " + j + " where " + "username" + " = \"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
    }

    /* renamed from: y */
    public boolean mo101219y(String str, long j) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        boolean execSQL = this.f212826c.execSQL("ChatroomMsgSeq", "update ChatroomMsgSeq set lastPushSeq =  " + j + " where " + "username" + " = \"" + Util.escapeSqlValue(str) + FastJsonResponse.QUOTE);
        if (execSQL) {
            C75871e.C75872a aVar = new C75871e.C75872a();
            aVar.f222517a = 4;
            aVar.f222518b = str;
            doNotify(2, this, aVar);
        }
        return execSQL;
    }

    /* renamed from: z */
    public C67053c mo101220z(String str) {
        C67054d r = mo101212r(str);
        if (r.f192605d.size() <= 0) {
            return null;
        }
        return r.f192605d.getLast();
    }
}
