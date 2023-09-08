package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115898a;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.h */
public final class C115888h extends C115898a {

    /* renamed from: A */
    public final boolean f347706A;

    /* renamed from: m */
    public final boolean f347707m;

    /* renamed from: n */
    public final int f347708n;

    /* renamed from: o */
    public final int f347709o;

    /* renamed from: p */
    public final long f347710p;

    /* renamed from: q */
    public final String f347711q;

    /* renamed from: r */
    public final byte[] f347712r;

    /* renamed from: s */
    public final String f347713s;

    /* renamed from: t */
    public final boolean f347714t;

    /* renamed from: u */
    public final boolean f347715u;

    /* renamed from: v */
    public final String f347716v;

    /* renamed from: w */
    public final int f347717w;

    /* renamed from: x */
    public final int f347718x;

    /* renamed from: y */
    public final byte[] f347719y;

    /* renamed from: z */
    public final long f347720z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C115888h(java.lang.String r16, java.lang.String r17, int r18, int r19, int r20, long r21, java.lang.String r23, int r24, int r25, long r26, java.lang.String r28, byte[] r29, java.lang.String r30, boolean r31, boolean r32, java.lang.String r33, int r34, int r35, byte[] r36, long r37, boolean r39, boolean r40, int r41) {
        /*
            r15 = this;
            r13 = r15
            r14 = r39
            java.lang.String r3 = java.lang.String.valueOf(r18)
            java.lang.String r6 = com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115890j.m163008b(r17)
            if (r14 == 0) goto L_0x0010
            java.lang.String r0 = "NewXml"
            goto L_0x0012
        L_0x0010:
            java.lang.String r0 = "CGI"
        L_0x0012:
            r11 = r0
            java.lang.String r10 = "CheckResUpdate"
            r0 = r15
            r1 = r16
            r2 = r17
            r4 = r19
            r5 = r20
            r7 = r21
            r9 = r23
            r12 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            r0 = r24
            r13.f347708n = r0
            r0 = r25
            r13.f347709o = r0
            r0 = r26
            r13.f347710p = r0
            r0 = r28
            r13.f347711q = r0
            r0 = r29
            r13.f347712r = r0
            r0 = r30
            r13.f347713s = r0
            r0 = r31
            r13.f347714t = r0
            r0 = r32
            r13.f347715u = r0
            r0 = r33
            r13.f347716v = r0
            r0 = r34
            r13.f347717w = r0
            r0 = r35
            r13.f347718x = r0
            r0 = r36
            r13.f347719y = r0
            r0 = r37
            r13.f347720z = r0
            r13.f347706A = r14
            r0 = r40
            r13.f347707m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate.C115888h.<init>(java.lang.String, java.lang.String, int, int, int, long, java.lang.String, int, int, long, java.lang.String, byte[], java.lang.String, boolean, boolean, java.lang.String, int, int, byte[], long, boolean, boolean, int):void");
    }

    /* renamed from: a */
    public C115913v mo176434a() {
        C115913v vVar = new C115913v();
        vVar.field_url = this.f347760a;
        vVar.field_urlKey = this.f347761b;
        vVar.field_fileVersion = this.f347762c;
        vVar.field_networkType = this.f347763d;
        vVar.field_maxRetryTimes = this.f347764e;
        vVar.field_retryTimes = this.f347771l;
        vVar.field_filePath = this.f347765f;
        vVar.field_status = 0;
        vVar.field_expireTime = this.f347766g;
        vVar.field_groupId1 = this.f347768i;
        vVar.field_groupId2 = this.f347769j;
        vVar.field_md5 = this.f347767h;
        vVar.field_priority = this.f347770k;
        vVar.field_fileUpdated = this.f347707m;
        vVar.field_resType = this.f347708n;
        vVar.field_subType = this.f347709o;
        vVar.field_reportId = this.f347710p;
        vVar.field_sampleId = this.f347711q;
        vVar.field_eccSignature = this.f347712r;
        vVar.field_originalMd5 = this.f347713s;
        vVar.field_fileCompress = this.f347714t;
        vVar.field_fileEncrypt = this.f347715u;
        vVar.field_encryptKey = this.f347716v;
        vVar.field_keyVersion = this.f347717w;
        vVar.field_fileSize = this.f347720z;
        vVar.field_EID = this.f347718x;
        return vVar;
    }

    public String toString() {
        return "CheckResUpdateRequest | fileUpdated=" + this.f347707m + ", resType=" + this.f347708n + ", subType=" + this.f347709o + ", reportId=" + this.f347710p + ", sampleId='" + this.f347711q + '\'' + ", originalMd5='" + this.f347713s + '\'' + ", fileCompress=" + this.f347714t + ", fileEncrypt=" + this.f347715u + ", encryptKey='" + this.f347716v + '\'' + ", keyVersion=" + this.f347717w + ", EID=" + this.f347718x + ", fileSize=" + this.f347720z + ", fromNewXml=" + this.f347706A + APLogFileUtil.SEPARATOR_LOG + super.toString();
    }
}
