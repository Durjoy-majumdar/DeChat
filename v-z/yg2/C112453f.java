package yg2;

import com.tencent.p014mm.plugin.api.recordView.C104733i;
import com.tencent.p014mm.plugin.mmsight.api.MMSightRecordView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.nio.ByteBuffer;
import vk0.C111546e;

/* renamed from: yg2.f */
public final class C112453f implements C104733i.C104734a {

    /* renamed from: a */
    public final /* synthetic */ MMSightRecordView.C18936f f336706a;

    /* renamed from: b */
    public final /* synthetic */ ByteBuffer f336707b;

    public C112453f(MMSightRecordView.C18936f fVar, ByteBuffer byteBuffer) {
        this.f336706a = fVar;
        this.f336707b = byteBuffer;
    }

    /* renamed from: a */
    public void mo148407a() {
        MMSightRecordView.C18936f fVar = this.f336706a;
        if (fVar != null) {
            C111546e eVar = (C111546e) fVar;
            if (!eVar.f333967c) {
                Log.m105924i("MicroMsg.FrameDataCallbackHelper", "onDateUpdate not need callback");
                return;
            }
            C111546e.C111547a aVar = new C111546e.C111547a(eVar);
            aVar.mo115161k(eVar.f333965a);
            aVar.mo115158h();
        }
    }

    public ByteBuffer getBuffer() {
        ByteBuffer byteBuffer = this.f336707b;
        C87412m.m108591d(byteBuffer);
        return byteBuffer;
    }
}
