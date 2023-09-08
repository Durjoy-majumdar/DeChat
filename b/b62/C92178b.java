package b62;

import android.os.Bundle;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: b62.b */
public final class C92178b {

    /* renamed from: a */
    public ArrayList<MediaSingleInfo> f263829a;

    /* renamed from: b */
    public Bundle f263830b;

    public C92178b(ArrayList<MediaSingleInfo> arrayList, Bundle bundle) {
        C87412m.m108594g(arrayList, "inputs");
        this.f263829a = arrayList;
        this.f263830b = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92178b)) {
            return false;
        }
        C92178b bVar = (C92178b) obj;
        return C87412m.m108589b(this.f263829a, bVar.f263829a) && C87412m.m108589b(this.f263830b, bVar.f263830b);
    }

    public int hashCode() {
        int hashCode = this.f263829a.hashCode() * 31;
        Bundle bundle = this.f263830b;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        return "MediaInputInfo(inputs=" + this.f263829a + ", extra=" + this.f263830b + ')';
    }
}
