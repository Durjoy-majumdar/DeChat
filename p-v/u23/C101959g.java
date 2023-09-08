package u23;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import gy3.C87412m;

/* renamed from: u23.g */
public final class C101959g extends C111127k {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101959g(C106205q0 q0Var) {
        super(q0Var);
        C87412m.m108594g(q0Var, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
    }

    /* renamed from: d */
    public long mo88221d() {
        return FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
    }
}
