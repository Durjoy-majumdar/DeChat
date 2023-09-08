package com.tencent.p014mm.pluginsdk.res.downloader.model;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.a */
public abstract class C115898a {

    /* renamed from: a */
    public final String f347760a;

    /* renamed from: b */
    public final String f347761b;

    /* renamed from: c */
    public final String f347762c;

    /* renamed from: d */
    public final int f347763d;

    /* renamed from: e */
    public final int f347764e;

    /* renamed from: f */
    public final String f347765f;

    /* renamed from: g */
    public final long f347766g;

    /* renamed from: h */
    public final String f347767h;

    /* renamed from: i */
    public final String f347768i;

    /* renamed from: j */
    public final String f347769j;

    /* renamed from: k */
    public final int f347770k;

    /* renamed from: l */
    public volatile int f347771l;

    public C115898a(String str, String str2, String str3, int i, int i2, String str4, long j, String str5, String str6, String str7, int i3) {
        this.f347760a = str;
        this.f347761b = str2;
        this.f347762c = str3;
        this.f347763d = i;
        this.f347764e = i2;
        this.f347771l = i2;
        this.f347765f = str4;
        this.f347766g = j;
        this.f347768i = str6;
        this.f347769j = str7;
        this.f347767h = str5;
        this.f347770k = i3;
    }

    public String toString() {
        return "BaseResDownloadRequest | urlKey='" + this.f347761b + '\'' + ", networkType=" + this.f347763d + ", expireTime=" + this.f347766g + ", fileVersion=" + this.f347762c + ", maxRetryTimes=" + this.f347764e + ", md5='" + this.f347767h + '\'' + ", groupId1='" + this.f347768i + '\'' + ", groupId2='" + this.f347769j + '\'' + ", filePath='" + this.f347765f + '\'' + ", retryTimes=" + this.f347771l + ", status=" + 0 + ", priority=" + this.f347770k;
    }
}
