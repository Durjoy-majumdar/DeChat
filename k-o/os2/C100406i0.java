package os2;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import vr2.C102236a0;

/* renamed from: os2.i0 */
public class C100406i0 {

    /* renamed from: a */
    public int f294121a;

    /* renamed from: b */
    public long f294122b;

    /* renamed from: c */
    public int f294123c;

    /* renamed from: d */
    public String f294124d;

    /* renamed from: e */
    public long f294125e;

    /* renamed from: f */
    public int f294126f;

    /* renamed from: g */
    public int f294127g;

    /* renamed from: h */
    public String f294128h;

    /* renamed from: i */
    public int f294129i;

    /* renamed from: j */
    public int f294130j;

    /* renamed from: k */
    public long f294131k;

    /* renamed from: l */
    public String f294132l;

    /* renamed from: m */
    public byte[] f294133m;

    /* renamed from: a */
    public void mo139847a(Cursor cursor) {
        SnsMethodCalculate.markStartTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = cursor.getInt(0);
        SnsMethodCalculate.markStartTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294121a = i;
        SnsMethodCalculate.markEndTimeMs("setLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j = cursor.getLong(1);
        SnsMethodCalculate.markStartTimeMs("setServerId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294122b = j;
        mo139856j(C102236a0.m134765q0(j));
        SnsMethodCalculate.markEndTimeMs("setServerId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i2 = cursor.getInt(2);
        SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294123c = i2;
        SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j2 = cursor.getLong(3);
        SnsMethodCalculate.markStartTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294125e = j2;
        SnsMethodCalculate.markEndTimeMs("setCreateTime", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        String string = cursor.getString(4);
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294124d = string;
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i3 = cursor.getInt(5);
        SnsMethodCalculate.markStartTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294127g = i3;
        SnsMethodCalculate.markEndTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        mo139855i(cursor.getInt(6));
        int i4 = cursor.getInt(7);
        SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294129i = i4;
        SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        mo139857k(cursor.getString(8));
        int i5 = cursor.getInt(9);
        SnsMethodCalculate.markStartTimeMs("setTryNnums", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294130j = i5;
        SnsMethodCalculate.markEndTimeMs("setTryNnums", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        long j3 = cursor.getLong(10);
        SnsMethodCalculate.markStartTimeMs("setTryTimes", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294131k = j3;
        SnsMethodCalculate.markEndTimeMs("setTryTimes", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        mo139856j(cursor.getString(11));
        mo139858l(cursor.getBlob(12));
        SnsMethodCalculate.markEndTimeMs("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    /* renamed from: b */
    public ContentValues mo139848b() {
        SnsMethodCalculate.markStartTimeMs("convertToMedia", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        ContentValues contentValues = new ContentValues();
        contentValues.put("seqId", Long.valueOf(this.f294122b));
        contentValues.put("type", Integer.valueOf(this.f294123c));
        contentValues.put("createTime", Long.valueOf(this.f294125e));
        contentValues.put("userName", this.f294124d);
        contentValues.put("totallen", Integer.valueOf(this.f294127g));
        contentValues.put("offset", Integer.valueOf(this.f294126f));
        contentValues.put("local_flag", Integer.valueOf(this.f294129i));
        contentValues.put("tmp_path", this.f294128h);
        contentValues.put("nums", Integer.valueOf(this.f294130j));
        contentValues.put("try_times", Long.valueOf(this.f294131k));
        contentValues.put("StrId", this.f294132l);
        contentValues.put("upload_buf", this.f294133m);
        SnsMethodCalculate.markEndTimeMs("convertToMedia", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return contentValues;
    }

    /* renamed from: c */
    public int mo139849c() {
        SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = this.f294121a;
        SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i;
    }

    /* renamed from: d */
    public int mo139850d() {
        SnsMethodCalculate.markStartTimeMs("getOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = this.f294126f;
        SnsMethodCalculate.markEndTimeMs("getOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i;
    }

    /* renamed from: e */
    public String mo139851e() {
        SnsMethodCalculate.markStartTimeMs("getTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        String str = this.f294128h;
        SnsMethodCalculate.markEndTimeMs("getTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return str;
    }

    /* renamed from: f */
    public int mo139852f() {
        SnsMethodCalculate.markStartTimeMs("getTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = this.f294127g;
        SnsMethodCalculate.markEndTimeMs("getTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i;
    }

    /* renamed from: g */
    public int mo139853g() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        int i = this.f294123c;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return i;
    }

    /* renamed from: h */
    public byte[] mo139854h() {
        SnsMethodCalculate.markStartTimeMs("getUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        byte[] bArr = this.f294133m;
        SnsMethodCalculate.markEndTimeMs("getUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        return bArr;
    }

    /* renamed from: i */
    public void mo139855i(int i) {
        SnsMethodCalculate.markStartTimeMs("setOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294126f = i;
        SnsMethodCalculate.markEndTimeMs("setOffset", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    /* renamed from: j */
    public void mo139856j(String str) {
        SnsMethodCalculate.markStartTimeMs("setStrId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294132l = str;
        SnsMethodCalculate.markEndTimeMs("setStrId", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    /* renamed from: k */
    public void mo139857k(String str) {
        SnsMethodCalculate.markStartTimeMs("setTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294128h = str;
        SnsMethodCalculate.markEndTimeMs("setTmpPath", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    /* renamed from: l */
    public void mo139858l(byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("setUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294133m = bArr;
        SnsMethodCalculate.markEndTimeMs("setUploadBuf", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }

    /* renamed from: m */
    public void mo139859m() {
        SnsMethodCalculate.markStartTimeMs("unSetUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        SnsMethodCalculate.markStartTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        this.f294129i &= -5;
        SnsMethodCalculate.markEndTimeMs("setLocalFlag", "com.tencent.mm.plugin.sns.storage.SnsMedia");
        SnsMethodCalculate.markEndTimeMs("unSetUpload", "com.tencent.mm.plugin.sns.storage.SnsMedia");
    }
}
