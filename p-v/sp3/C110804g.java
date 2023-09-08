package sp3;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.tav.coremedia.TextureInfo;
import gy3.C87412m;

/* renamed from: sp3.g */
public final class C110804g {

    /* renamed from: a */
    public C110801c f331491a;

    /* renamed from: b */
    public TextureInfo f331492b;

    public C110804g(C110801c cVar, TextureInfo textureInfo) {
        C87412m.m108595h(cVar, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
        C87412m.m108595h(textureInfo, "texture");
        this.f331491a = cVar;
        this.f331492b = textureInfo;
    }
}
