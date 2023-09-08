package kd0;

import android.content.ContentValues;
import android.database.Cursor;
import te3.jt4;

/* renamed from: kd0.y */
public class C76551y {

    /* renamed from: a */
    public int f224050a = -1;

    /* renamed from: b */
    public String f224051b = "";

    /* renamed from: c */
    public String f224052c = "";

    /* renamed from: d */
    public String f224053d = "";

    /* renamed from: e */
    public long f224054e = 0;

    /* renamed from: f */
    public int f224055f = 0;

    /* renamed from: g */
    public int f224056g = 0;

    /* renamed from: h */
    public int f224057h = 0;

    /* renamed from: i */
    public int f224058i = 0;

    /* renamed from: j */
    public long f224059j = 0;

    /* renamed from: k */
    public long f224060k = 0;

    /* renamed from: l */
    public int f224061l = 0;

    /* renamed from: m */
    public long f224062m = 0;

    /* renamed from: n */
    public String f224063n = "";

    /* renamed from: o */
    public int f224064o = 0;

    /* renamed from: p */
    public String f224065p = "";

    /* renamed from: q */
    public String f224066q = "";

    /* renamed from: r */
    public int f224067r = 0;

    /* renamed from: s */
    public int f224068s = 0;

    /* renamed from: t */
    public long f224069t = 0;

    /* renamed from: u */
    public int f224070u = 0;

    /* renamed from: v */
    public int f224071v = 0;

    /* renamed from: w */
    public jt4 f224072w = null;

    /* renamed from: x */
    public int f224073x = 0;

    /* renamed from: a */
    public void mo106794a(Cursor cursor) {
        this.f224051b = cursor.getString(0);
        this.f224052c = cursor.getString(1);
        this.f224054e = cursor.getLong(2);
        this.f224055f = cursor.getInt(3);
        this.f224056g = cursor.getInt(4);
        this.f224057h = cursor.getInt(5);
        this.f224058i = cursor.getInt(6);
        this.f224059j = cursor.getLong(7);
        this.f224060k = cursor.getLong(8);
        this.f224053d = cursor.getString(9);
        this.f224061l = cursor.getInt(10);
        this.f224062m = cursor.getLong(11);
        this.f224063n = cursor.getString(12);
        this.f224064o = cursor.getInt(13);
        this.f224065p = cursor.getString(14);
        this.f224066q = cursor.getString(15);
        this.f224067r = cursor.getInt(16);
        this.f224068s = cursor.getInt(17);
        this.f224069t = cursor.getLong(18);
        this.f224070u = cursor.getInt(19);
        this.f224071v = cursor.getInt(20);
        try {
            byte[] blob = cursor.getBlob(21);
            if (blob != null) {
                jt4 jt4 = new jt4();
                jt4.parseFrom(blob);
                this.f224072w = jt4;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public ContentValues mo106795b() {
        jt4 jt4;
        ContentValues contentValues = new ContentValues();
        if ((this.f224050a & 1) != 0) {
            contentValues.put("FileName", this.f224051b);
        }
        if ((this.f224050a & 2) != 0) {
            contentValues.put("User", this.f224052c);
        }
        if ((this.f224050a & 4) != 0) {
            contentValues.put("MsgId", Long.valueOf(this.f224054e));
        }
        if ((this.f224050a & 8) != 0) {
            contentValues.put("NetOffset", Integer.valueOf(this.f224055f));
        }
        if ((this.f224050a & 16) != 0) {
            contentValues.put("FileNowSize", Integer.valueOf(this.f224056g));
        }
        if ((this.f224050a & 32) != 0) {
            contentValues.put("TotalLen", Integer.valueOf(this.f224057h));
        }
        if ((this.f224050a & 64) != 0) {
            contentValues.put("Status", Integer.valueOf(this.f224058i));
        }
        if ((this.f224050a & 128) != 0) {
            contentValues.put("CreateTime", Long.valueOf(this.f224059j));
        }
        if ((this.f224050a & 256) != 0) {
            contentValues.put("LastModifyTime", Long.valueOf(this.f224060k));
        }
        if ((this.f224050a & 512) != 0) {
            contentValues.put("ClientId", this.f224053d);
        }
        if ((this.f224050a & 1024) != 0) {
            contentValues.put("VoiceLength", Integer.valueOf(this.f224061l));
        }
        if ((this.f224050a & 2048) != 0) {
            contentValues.put("MsgLocalId", Long.valueOf(this.f224062m));
        }
        if ((this.f224050a & 4096) != 0) {
            contentValues.put("Human", this.f224063n);
        }
        if ((this.f224050a & 8192) != 0) {
            contentValues.put("reserved1", Integer.valueOf(this.f224064o));
        }
        if ((this.f224050a & 16384) != 0) {
            contentValues.put("reserved2", this.f224065p);
        }
        if ((this.f224050a & 32768) != 0) {
            contentValues.put("MsgSource", this.f224066q);
        }
        if ((this.f224050a & 65536) != 0) {
            contentValues.put("MsgFlag", Integer.valueOf(this.f224067r));
        }
        if ((this.f224050a & 131072) != 0) {
            contentValues.put("MsgSeq", Integer.valueOf(this.f224068s));
        }
        if ((this.f224050a & 262144) != 0) {
            contentValues.put("MasterBufId", Long.valueOf(this.f224069t));
        }
        if ((this.f224050a & 524288) != 0) {
            contentValues.put("checksum", Integer.valueOf(this.f224070u));
        }
        if ((this.f224050a & 1048576) != 0) {
            contentValues.put("VoiceFlag", Integer.valueOf(this.f224071v));
        }
        if (!((this.f224050a & 2097152) == 0 || (jt4 = this.f224072w) == null)) {
            try {
                contentValues.put("VoiceInfoExt", jt4.toByteArray());
            } catch (Exception unused) {
            }
        }
        return contentValues;
    }

    /* renamed from: c */
    public String mo106796c() {
        return this.f224051b;
    }

    /* renamed from: d */
    public String mo106797d() {
        return this.f224052c;
    }

    /* renamed from: e */
    public String mo106798e() {
        return this.f224065p;
    }
}
