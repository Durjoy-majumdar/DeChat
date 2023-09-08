package ki3;

import com.tencent.p014mm.timelineedit.TimelineEditor;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: ki3.a */
public final class C99144a extends C87413o implements C32224a<byte[]> {

    /* renamed from: d */
    public final /* synthetic */ TimelineEditor f290698d;

    /* renamed from: e */
    public final /* synthetic */ String f290699e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99144a(TimelineEditor timelineEditor, String str) {
        super(0);
        this.f290698d = timelineEditor;
        this.f290699e = str;
    }

    public Object invoke() {
        TimelineEditor timelineEditor = this.f290698d;
        return timelineEditor.nAddWrapDurationAudioTrack(timelineEditor.f318620a, this.f290699e);
    }
}
