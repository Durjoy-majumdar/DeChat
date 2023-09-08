package j04;

import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C87412m;
import vz3.C26408b;

/* renamed from: j04.t */
public final class C108521t<T> {

    /* renamed from: a */
    public final T f324845a;

    /* renamed from: b */
    public final T f324846b;

    /* renamed from: c */
    public final String f324847c;

    /* renamed from: d */
    public final C26408b f324848d;

    public C108521t(T t, T t2, String str, C26408b bVar) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(bVar, "classId");
        this.f324845a = t;
        this.f324846b = t2;
        this.f324847c = str;
        this.f324848d = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108521t)) {
            return false;
        }
        C108521t tVar = (C108521t) obj;
        return C87412m.m108589b(this.f324845a, tVar.f324845a) && C87412m.m108589b(this.f324846b, tVar.f324846b) && C87412m.m108589b(this.f324847c, tVar.f324847c) && C87412m.m108589b(this.f324848d, tVar.f324848d);
    }

    public int hashCode() {
        T t = this.f324845a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f324846b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f324847c.hashCode()) * 31) + this.f324848d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f324845a + ", expectedVersion=" + this.f324846b + ", filePath=" + this.f324847c + ", classId=" + this.f324848d + ')';
    }
}
