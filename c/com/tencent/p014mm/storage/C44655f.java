package com.tencent.p014mm.storage;

import ai3.C112789a;
import android.database.Cursor;
import com.tencent.p014mm.app.C40010n1;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.sdk.platformtools.LVBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C77710q;

/* renamed from: com.tencent.mm.storage.f */
public class C44655f implements C112789a<String> {
    private String field_alias;
    public String field_conRemark;
    public int field_deleteFlag;
    public String field_descWording;
    public String field_descWordingId;
    public String field_descWordingQuanpin;
    public byte[] field_lvbuff;
    private String field_nickname;
    public String field_openImAppid;
    public String field_remarkDesc;
    public int field_showHead;
    public String field_signature;
    private String field_username;
    private int field_verifyFlag;
    public int field_weiboFlag;

    /* renamed from: B1 */
    public void mo69635B1(int i, long j) {
        if (i == 4) {
            this.field_verifyFlag = (int) j;
        } else if (i == 5) {
            this.field_showHead = (int) j;
        } else if (i == 6) {
            this.field_weiboFlag = (int) j;
        } else if (i == 8) {
            this.field_deleteFlag = (int) j;
        }
    }

    /* renamed from: L1 */
    public void mo69636L1(int i, String str) {
        if (i == 0) {
            this.field_username = str;
        } else if (i == 1) {
            this.field_nickname = str;
        } else if (i == 2) {
            this.field_alias = str;
        } else if (i != 3) {
            switch (i) {
                case 10:
                    this.field_descWordingId = str;
                    return;
                case 11:
                    this.field_openImAppid = str;
                    return;
                case 12:
                    this.field_descWording = str;
                    return;
                case 13:
                    this.field_descWordingQuanpin = str;
                    return;
                default:
                    return;
            }
        } else {
            this.field_conRemark = str;
        }
    }

    /* renamed from: Y */
    public void mo69637Y(int i, byte[] bArr) {
        if (i == 9) {
            this.field_lvbuff = bArr;
        }
    }

    /* renamed from: a */
    public void mo69638a(Cursor cursor) {
        this.field_username = cursor.getString(0);
        this.field_nickname = cursor.getString(1);
        this.field_alias = cursor.getString(2);
        this.field_conRemark = cursor.getString(3);
        this.field_verifyFlag = cursor.getInt(4);
        this.field_showHead = cursor.getInt(5);
        this.field_weiboFlag = cursor.getInt(6);
        cursor.getLong(7);
        this.field_deleteFlag = cursor.getInt(8);
        this.field_lvbuff = cursor.getBlob(9);
        this.field_descWordingId = cursor.getString(10);
        this.field_openImAppid = cursor.getString(11);
        if (cursor.getColumnCount() >= 14) {
            this.field_descWording = cursor.getString(12);
            this.field_descWordingQuanpin = cursor.getString(13);
        }
        mo69643e();
    }

    /* renamed from: b */
    public String mo69639b() {
        String str = this.field_conRemark;
        if (str != null && !str.trim().equals("")) {
            return this.field_conRemark;
        }
        String str2 = this.field_username;
        C40294d.C40295a aVar = C40294d.f108319U1;
        String str3 = null;
        String a = aVar != null ? ((C40010n1) aVar).mo62699a(str2) : null;
        if (a != null) {
            return a;
        }
        String str4 = this.field_nickname;
        if (str4 != null && str4.length() > 0) {
            return this.field_nickname;
        }
        String str5 = this.field_alias;
        if (!Util.isNullOrNil(str5)) {
            return str5;
        }
        String str6 = this.field_username;
        if (str6 != null) {
            if (str6.toLowerCase().endsWith("@t.qq.com")) {
                str3 = "@" + str6.replace("@t.qq.com", "");
            } else if (str6.toLowerCase().endsWith("@qqim")) {
                str3 = str6.replace("@qqim", "");
                long longValue = Long.valueOf(str3).longValue();
                if (longValue < 0) {
                    str3 = new C77710q(longValue).toString();
                }
            } else {
                str3 = str6;
            }
        }
        return (str3 == null || str3.length() == 0) ? this.field_username : str3;
    }

    /* renamed from: c */
    public String mo69640c() {
        return this.field_nickname;
    }

    /* renamed from: c1 */
    public void mo69641c1(int i, double d) {
    }

    /* renamed from: d */
    public String mo69642d() {
        return this.field_username;
    }

    /* renamed from: e */
    public void mo69643e() {
        byte[] bArr = this.field_lvbuff;
        if (bArr != null && bArr != null) {
            try {
                if (bArr.length != 0) {
                    LVBuffer lVBuffer = new LVBuffer();
                    if (lVBuffer.initParse(this.field_lvbuff) == 0) {
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(8);
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipString();
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipString();
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipPosition(4);
                        this.field_signature = lVBuffer.getString();
                        lVBuffer.skipString();
                        lVBuffer.skipString();
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipString();
                        lVBuffer.skipString();
                        lVBuffer.skipPosition(4);
                        lVBuffer.skipPosition(4);
                        if (!lVBuffer.checkGetFinish()) {
                            this.field_remarkDesc = lVBuffer.getString();
                        }
                        this.field_lvbuff = null;
                    }
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AddressUIContact", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    public Object getKey() {
        return this.field_username;
    }

    /* renamed from: q */
    public void mo69645q(int i) {
    }

    /* renamed from: w */
    public void mo69646w() {
        mo69643e();
    }
}
