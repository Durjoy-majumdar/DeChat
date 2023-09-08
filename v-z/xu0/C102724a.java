package xu0;

import com.tencent.p014mm.modelavatar.C68081f;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.sdk.pipeline.Pipeline;
import com.tencent.p014mm.sdk.pipeline.PipelineState;
import com.tencent.p014mm.sdk.pipeline.ProcessorPipelineComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.BaseStateAction;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import vu0.C102291a;
import vu0.C102292b;
import vu0.C102297f;
import wx3.C15601d;
import z04.C112551y;

/* renamed from: xu0.a */
public final class C102724a extends ProcessorPipelineComponent<C102291a, C102292b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102724a(Pipeline pipeline) {
        super(pipeline);
        C87412m.m108594g(pipeline, "pipeline");
    }

    public Object processAction(PipelineState pipelineState, BaseStateAction baseStateAction, C15601d dVar) {
        C102292b bVar;
        C102291a aVar = (C102291a) baseStateAction;
        C102297f fVar = C102297f.NotExpired;
        C102297f fVar2 = C102297f.Expired;
        int intOrInterrupt = pipelineState.getIntOrInterrupt("Avatar_HdFlag");
        C68097n nVar = (C68097n) pipelineState.get("Avatar_ImgFlag");
        if (nVar != null) {
            boolean z = true;
            String c = intOrInterrupt == 1 ? nVar.mo93594c() : nVar.mo93597f();
            if (c != null && !C112551y.m153811k(c)) {
                z = false;
            }
            if (!z) {
                String d = C68081f.m80469d(nVar, intOrInterrupt);
                String i = new C86009m1(aVar.f301270b, d).mo119971i();
                C87412m.m108593f(i, "VFSFile(action.tempFolder, checkKey).absolutePath");
                if (C86013q1.m106450k(i)) {
                    Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not expired " + aVar.f301269a + ' ' + d);
                    C87412m.m108593f(d, "checkKey");
                    bVar = new C102292b(fVar, d);
                } else {
                    Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag expired " + aVar.f301269a + ' ' + d);
                    C87412m.m108593f(d, "checkKey");
                    bVar = new C102292b(fVar2, d);
                }
                return bVar;
            } else if (nVar.f195729b != 4) {
                String d2 = C68081f.m80469d(nVar, intOrInterrupt);
                String i2 = new C86009m1(aVar.f301270b, d2).mo119971i();
                C87412m.m108593f(i2, "VFSFile(action.tempFolder, checkKey).absolutePath");
                if (C86013q1.m106450k(i2)) {
                    Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but exist head img and expired " + nVar.f195729b + ' ' + aVar.f301269a + ' ' + d2);
                    C87412m.m108593f(d2, "checkKey");
                    return new C102292b(fVar, d2);
                }
                Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but not exist head img " + nVar.f195729b + ' ' + aVar.f301269a + ' ' + d2);
                C87412m.m108593f(d2, "checkKey");
                return new C102292b(fVar2, d2);
            } else {
                Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag url is empty username:" + aVar.f301269a + " hdFlag:" + intOrInterrupt);
                return new C102292b(C102297f.Empty, "");
            }
        } else {
            Log.m105924i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not exist " + aVar.f301269a);
            return new C102292b(C102297f.NotExist, "");
        }
    }
}
