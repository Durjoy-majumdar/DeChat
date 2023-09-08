package f03;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import x60.C15627c;

/* renamed from: f03.f */
public final class C97784f implements C15627c {

    /* renamed from: d */
    public final String f286868d;

    /* renamed from: e */
    public final String f286869e;

    /* renamed from: f */
    public final String f286870f;

    /* renamed from: g */
    public final String f286871g;

    /* renamed from: h */
    public final long f286872h = C86703c.f251712a.mo122719i();

    public C97784f(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        this.f286868d = str;
        this.f286869e = str2;
        this.f286870f = str3;
        this.f286871g = str4;
    }

    /* renamed from: b */
    public String mo11841b() {
        String str = !Util.isNullOrNil(this.f286868d) ? this.f286868d : this.f286869e;
        return str + '_' + this.f286872h + '_' + hashCode();
    }
}
