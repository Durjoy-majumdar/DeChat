package fn3;

import com.tencent.p014mm.autogen.mmdata.rpt.VoiceBreakPointConPlayStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: fn3.c */
public final class C24479c {
    /* renamed from: a */
    public static final void m30627a(boolean z, boolean z2, long j, String str, long j2, long j3, long j4) {
        C87412m.m108594g(str, "voiceId");
        Log.m105924i("Report25041", "report() called with: isC2C = " + z2 + ", actionType = " + j + ", voiceId = " + str + ", totalTime = " + j2 + ", stopReason = " + j3 + ", playTime = " + j4);
        VoiceBreakPointConPlayStruct voiceBreakPointConPlayStruct = new VoiceBreakPointConPlayStruct();
        voiceBreakPointConPlayStruct.f69625d = !z ? 0 : z2 ? 1 : 2;
        voiceBreakPointConPlayStruct.f69626e = j;
        voiceBreakPointConPlayStruct.f69627f = voiceBreakPointConPlayStruct.mo86045b("ActionResult", "0", true);
        voiceBreakPointConPlayStruct.f69628g = voiceBreakPointConPlayStruct.mo86045b("VoiceId", str, true);
        voiceBreakPointConPlayStruct.f69629h = j2;
        voiceBreakPointConPlayStruct.f69630i = j3;
        voiceBreakPointConPlayStruct.f69631j = j4;
        voiceBreakPointConPlayStruct.mo86054n();
    }
}
