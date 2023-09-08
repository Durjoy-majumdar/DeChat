package tp3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tavkit.composition.audio.TAVAudioProcessorNode;
import gy3.C87412m;
import sp3.C110801c;

/* renamed from: tp3.a */
public final class C111047a implements C111049b {

    /* renamed from: a */
    public final C111050c f332546a;

    /* renamed from: tp3.a$a */
    public static final class C111048a implements TAVAudioProcessorNode {

        /* renamed from: a */
        public final /* synthetic */ C111047a f332547a;

        /* renamed from: b */
        public final /* synthetic */ C110801c f332548b;

        public C111048a(C111047a aVar, C110801c cVar) {
            this.f332547a = aVar;
            this.f332548b = cVar;
        }

        public TAVAudioProcessorNode.TAVAudioProcessorEffect createAudioProcessor() {
            return this.f332547a.f332546a.mo157974a(this.f332548b);
        }

        public String getIdentifier() {
            return this.f332548b.f331482t;
        }
    }

    public C111047a(C111050c cVar) {
        C87412m.m108595h(cVar, "resampleFactory");
        this.f332546a = cVar;
    }

    /* renamed from: a */
    public TAVAudioProcessorNode mo162731a(C110801c cVar) {
        C87412m.m108595h(cVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        return new C111048a(this, cVar);
    }
}
