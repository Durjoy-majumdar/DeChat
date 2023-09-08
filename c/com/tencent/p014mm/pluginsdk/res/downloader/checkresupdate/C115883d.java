package com.tencent.p014mm.pluginsdk.res.downloader.checkresupdate;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C115913v;
import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.checkresupdate.d */
public final class C115883d extends C85638o {

    /* renamed from: l */
    public final long f347701l;

    /* renamed from: m */
    public final String f347702m;

    /* renamed from: n */
    public final long f347703n;

    /* renamed from: o */
    public volatile byte[] f347704o;

    /* renamed from: p */
    public volatile boolean f347705p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115883d(String str, int i, String str2, boolean z, long j, String str3, int i2, long j2, int i3, int i4) {
        super(str, C115890j.m163008b(str), String.valueOf(i), "CheckResUpdate", str3, "GET", i2, i3, i4);
        this.f347702m = str2;
        this.f347701l = j;
        this.f347703n = j2;
    }

    /* renamed from: h */
    public static C115883d m162993h(C115913v vVar) {
        return new C115883d(vVar.field_urlKey, Util.getInt(vVar.field_fileVersion, 0), vVar.field_md5, Util.nullAsNil(vVar.field_groupId2).equals("NewXml"), vVar.field_reportId, vVar.field_url, vVar.field_maxRetryTimes, vVar.field_fileSize, vVar.field_networkType, vVar.field_priority);
    }

    /* renamed from: c */
    public String mo119181c() {
        return C115890j.m163008b(this.f249581a);
    }

    /* renamed from: d */
    public String mo119182d() {
        return "CheckResUpdate";
    }
}
