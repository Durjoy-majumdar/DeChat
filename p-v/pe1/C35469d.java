package pe1;

import android.app.Activity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import rx3.C13598b0;

/* renamed from: pe1.d */
public final class C35469d extends C35464c<String> {

    /* renamed from: r */
    public final C32226l<Activity, C13598b0> f94902r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35469d(String str, C32226l<? super Activity, C13598b0> lVar) {
        super("", str);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(lVar, "onClick");
        this.f94902r = lVar;
    }

    /* renamed from: k */
    public void mo60264k(int i) {
        C32226l<Activity, C13598b0> lVar = this.f94902r;
        WeakReference<Activity> weakReference = this.f94905f;
        lVar.invoke(weakReference != null ? weakReference.get() : null);
    }

    /* renamed from: l */
    public void mo60265l() {
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ Object mo60266n() {
        return "";
    }
}
