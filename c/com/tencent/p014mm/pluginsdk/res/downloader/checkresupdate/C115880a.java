package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.a */
public class C115880a implements C85632g.C85634b {

    /* renamed from: a */
    public final String f347681a;

    /* renamed from: b */
    public final int f347682b;

    /* renamed from: c */
    public final int f347683c;

    /* renamed from: d */
    public final int f347684d;

    /* renamed from: e */
    public final boolean f347685e;

    /* renamed from: f */
    public final String f347686f;

    /* renamed from: g */
    public final boolean f347687g;

    /* renamed from: h */
    public final boolean f347688h;

    /* renamed from: i */
    public final String f347689i;

    /* renamed from: j */
    public final int f347690j;

    /* renamed from: k */
    public final byte[] f347691k;

    /* renamed from: l */
    public final String f347692l;

    /* renamed from: m */
    public final boolean f347693m;

    /* renamed from: n */
    public final long f347694n;

    /* renamed from: o */
    public final String f347695o;

    /* renamed from: p */
    public final String f347696p;

    /* renamed from: q */
    public final int f347697q;

    /* renamed from: r */
    public final int f347698r;

    public C115880a(String str, int i, int i2, int i3, boolean z, String str2, boolean z2, boolean z3, String str3, int i4, byte[] bArr, String str4, boolean z4, long j, String str5, String str6, int i5, int i6) {
        this.f347681a = str;
        this.f347682b = i;
        this.f347683c = i2;
        this.f347684d = i3;
        this.f347685e = z;
        this.f347686f = str2;
        this.f347687g = z2;
        this.f347688h = z3;
        this.f347689i = str3;
        this.f347690j = i4;
        this.f347691k = bArr;
        this.f347692l = str4;
        this.f347693m = z4;
        this.f347694n = j;
        this.f347695o = str5;
        this.f347696p = str6;
        this.f347697q = i5;
        this.f347698r = i6;
    }

    /* renamed from: b */
    public static C115880a m162988b(C115913v vVar) {
        C115913v vVar2 = vVar;
        return new C115880a(vVar2.field_urlKey, vVar2.field_resType, vVar2.field_subType, Util.getInt(vVar2.field_fileVersion, 0), vVar2.field_fileUpdated, vVar2.field_filePath, vVar2.field_fileEncrypt, vVar2.field_fileCompress, vVar2.field_encryptKey, vVar2.field_keyVersion, vVar2.field_eccSignature, vVar2.field_originalMd5, Util.nullAsNil(vVar2.field_groupId2).equals("NewXml"), vVar2.field_reportId, vVar2.field_sampleId, vVar2.field_url, vVar2.field_maxRetryTimes, vVar2.field_retryTimes);
    }

    /* renamed from: a */
    public String mo119169a() {
        return this.f347681a;
    }
}
