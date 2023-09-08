package b62;

import android.os.Bundle;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.mediabasic.data.MediaSingleInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: b62.c */
public final class C92179c {

    /* renamed from: a */
    public VideoTransPara f263831a;

    /* renamed from: b */
    public ArrayList<MediaSingleInfo> f263832b;

    /* renamed from: c */
    public Bundle f263833c;

    public C92179c(VideoTransPara videoTransPara, ArrayList arrayList, Bundle bundle, int i, C8480h hVar) {
        bundle = (i & 4) != 0 ? null : bundle;
        C87412m.m108594g(videoTransPara, "videoParams");
        C87412m.m108594g(arrayList, "outputs");
        this.f263831a = videoTransPara;
        this.f263832b = arrayList;
        this.f263833c = bundle;
    }

    /* renamed from: a */
    public final String mo126139a() {
        T t;
        boolean z;
        Iterator<T> it = this.f263832b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((MediaSingleInfo) t).f272123d == C92177a.THUMB) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        MediaSingleInfo mediaSingleInfo = (MediaSingleInfo) t;
        if (mediaSingleInfo != null) {
            return mediaSingleInfo.f272124e;
        }
        return null;
    }

    /* renamed from: b */
    public final String mo126140b() {
        T t;
        boolean z;
        Iterator<T> it = this.f263832b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((MediaSingleInfo) t).f272123d == C92177a.VIDEO) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        MediaSingleInfo mediaSingleInfo = (MediaSingleInfo) t;
        if (mediaSingleInfo != null) {
            return mediaSingleInfo.f272124e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92179c)) {
            return false;
        }
        C92179c cVar = (C92179c) obj;
        return C87412m.m108589b(this.f263831a, cVar.f263831a) && C87412m.m108589b(this.f263832b, cVar.f263832b) && C87412m.m108589b(this.f263833c, cVar.f263833c);
    }

    public int hashCode() {
        int hashCode = ((this.f263831a.hashCode() * 31) + this.f263832b.hashCode()) * 31;
        Bundle bundle = this.f263833c;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        return "MediaOutputInfo(videoParams=" + this.f263831a + ", outputs=" + this.f263832b + ", extra=" + this.f263833c + ')';
    }
}
