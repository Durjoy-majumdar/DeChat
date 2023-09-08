package oh0;

import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8480h;
import gy3.C87412m;
import n60.C100075f;
import p1081gi.C98124g;
import p434ig.C98672d;
import x60.C15627c;

/* renamed from: oh0.d */
public final class C100353d implements C15627c {

    /* renamed from: d */
    public final long f293933d;

    /* renamed from: e */
    public final String f293934e;

    /* renamed from: f */
    public final C98672d f293935f;

    /* renamed from: g */
    public final String f293936g;

    /* renamed from: h */
    public final C100075f f293937h;

    /* renamed from: i */
    public final C98124g f293938i;

    public C100353d(long j, String str, C98672d dVar, String str2, C100075f fVar, C98124g gVar) {
        C87412m.m108594g(str, "talker");
        C87412m.m108594g(dVar, "albumDataItem");
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(fVar, "options");
        this.f293933d = j;
        this.f293934e = str;
        this.f293935f = dVar;
        this.f293936g = str2;
        this.f293937h = fVar;
        this.f293938i = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if ((r0.length() > 0) == true) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo11841b() {
        /*
            r3 = this;
            gi.g r0 = r3.f293938i
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r0.field_fileId
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != r1) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x0040
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            gi.g r1 = r3.f293938i
            java.lang.String r1 = r1.field_fileId
            r0.append(r1)
            r1 = 95
            r0.append(r1)
            gi.g r2 = r3.f293938i
            int r2 = r2.field_fileType
            r0.append(r2)
            r0.append(r1)
            gi.g r1 = r3.f293938i
            java.lang.String r1 = r1.field_aesKey
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0040:
            java.lang.String r0 = r3.f293936g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oh0.C100353d.mo11841b():java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C100353d)) {
            return false;
        }
        C100353d dVar = (C100353d) obj;
        return this.f293933d == dVar.f293933d && C87412m.m108589b(this.f293934e, dVar.f293934e) && C87412m.m108589b(this.f293935f, dVar.f293935f) && C87412m.m108589b(this.f293936g, dVar.f293936g) && C87412m.m108589b(this.f293937h, dVar.f293937h) && C87412m.m108589b(this.f293938i, dVar.f293938i);
    }

    public int hashCode() {
        long j = this.f293933d;
        int hashCode = ((((((((((int) (j ^ (j >>> 32))) * 31) + this.f293934e.hashCode()) * 31) + this.f293935f.hashCode()) * 31) + this.f293936g.hashCode()) * 31) + this.f293937h.hashCode()) * 31;
        C98124g gVar = this.f293938i;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public String toString() {
        return "AlbumItemBucket(msgId=" + this.f293933d + ", talker=" + this.f293934e + ", albumDataItem=" + this.f293935f + ", filePath=" + this.f293936g + ", options=" + this.f293937h + ", info=" + this.f293938i + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C100353d(long j, String str, C98672d dVar, String str2, C100075f fVar, C98124g gVar, int i, C8480h hVar) {
        this(j, str, dVar, str2, fVar, (i & 32) != 0 ? null : gVar);
    }
}
