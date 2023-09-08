package m03;

import com.tencent.p014mm.plugin.thumbplayer.view.MMMvVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32227p;
import j03.C60700d;
import rx3.C13598b0;

/* renamed from: m03.e */
public final class C109456e implements C61431n {

    /* renamed from: a */
    public final /* synthetic */ MMMvVideoLayout f327619a;

    /* renamed from: b */
    public final /* synthetic */ C60700d f327620b;

    public C109456e(MMMvVideoLayout mMMvVideoLayout, C60700d dVar) {
        this.f327619a = mMMvVideoLayout;
        this.f327620b = dVar;
    }

    /* renamed from: a */
    public void mo79982a(C58010a aVar, long j) {
        int i = 0;
        Long l = null;
        MMMvVideoLayout.m142849d(this.f327619a, false, false, 3, (Object) null);
        C58010a aVar2 = this.f327620b.f172873d;
        long j2 = 0;
        long j3 = aVar2 != null ? aVar2.f165943o : 0;
        if (aVar2 != null) {
            j2 = aVar2.f165944p;
        }
        String str = this.f327619a.f316355d;
        StringBuilder sb = new StringBuilder();
        sb.append("timeMs=");
        sb.append(j);
        sb.append(", originOffset=");
        C58010a aVar3 = this.f327620b.f172873d;
        sb.append(aVar3 != null ? Long.valueOf(aVar3.f165944p) : null);
        sb.append(", length=");
        C58010a aVar4 = this.f327620b.f172873d;
        if (aVar4 != null) {
            l = Long.valueOf(aVar4.f165943o);
        }
        sb.append(l);
        sb.append(", media=");
        if (aVar != null) {
            i = aVar.hashCode();
        }
        sb.append(i);
        Log.m105928w(str, sb.toString());
        C32227p<Long, Long, C13598b0> onProgressUpdate = this.f327619a.getOnProgressUpdate();
        if (onProgressUpdate != null) {
            onProgressUpdate.invoke(Long.valueOf(j - j2), Long.valueOf(j3));
        }
    }
}
