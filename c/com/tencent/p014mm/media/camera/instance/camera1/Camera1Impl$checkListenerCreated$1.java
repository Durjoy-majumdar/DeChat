package com.tencent.p014mm.media.camera.instance.camera1;

import android.text.TextUtils;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39623j;
import b80.C104041d;
import b80.C104042e;
import b80.C104043f;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CameraKitOperateEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraKitMethodReportStruct;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import v70.C111406s;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/media/camera/instance/camera1/Camera1Impl$checkListenerCreated$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CameraKitOperateEvent;", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.instance.camera1.Camera1Impl$checkListenerCreated$1 */
public final class Camera1Impl$checkListenerCreated$1 extends IListener<CameraKitOperateEvent> {

    /* renamed from: d */
    public final /* synthetic */ C104043f f310696d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f310697e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Camera1Impl$checkListenerCreated$1(C104043f fVar, C0125s sVar, C40008f fVar2) {
        super(fVar2);
        this.f310696d = fVar;
        this.f310697e = sVar;
    }

    public boolean callback(IEvent iEvent) {
        CameraKitOperateEvent cameraKitOperateEvent = (CameraKitOperateEvent) iEvent;
        C87412m.m108594g(cameraKitOperateEvent, "event");
        CameraKitOperateEvent.C104590a aVar = cameraKitOperateEvent.f309992d;
        String str = aVar.f309995c;
        int i = aVar.f309994b;
        Log.m105924i("MicroMsg.Camera.Camera1Impl", "receive CameraKitOperateEvent type:" + cameraKitOperateEvent.f309992d.f309993a + " event:" + i + " scene:" + str);
        String L = this.f310696d.mo145655L();
        if (!TextUtils.isEmpty(str) && !C87412m.m108589b(str, L) && i == 2) {
            Log.m105920e("MicroMsg.Camera.Camera1Impl", "happen camera grab,may be sth. error");
            C104043f fVar = this.f310696d;
            C111406s sVar = fVar.f304628g;
            if (sVar != null) {
                sVar.mo163062D("GrabStopPreview", new C104041d(fVar, str, (C15601d<? super C104041d>) null));
            }
        } else if (!TextUtils.isEmpty(str) && !C87412m.m108589b(str, L) && i == 3 && this.f310697e.getLifecycle().getCurrentState() == C39623j.C39626c.RESUMED) {
            C104043f fVar2 = this.f310696d;
            fVar2.getClass();
            CameraKitMethodReportStruct cameraKitMethodReportStruct = new CameraKitMethodReportStruct();
            cameraKitMethodReportStruct.f310057i = cameraKitMethodReportStruct.mo86045b("SessionId", String.valueOf(fVar2.f304625d), true);
            cameraKitMethodReportStruct.f310052d = cameraKitMethodReportStruct.mo86045b("MethodName", "GrabStartPreview", true);
            cameraKitMethodReportStruct.mo86054n();
            C104043f fVar3 = this.f310696d;
            C111406s sVar2 = fVar3.f304628g;
            if (sVar2 != null) {
                sVar2.mo163062D("GrabStartPreview", new C104042e(fVar3, (C15601d<? super C104042e>) null));
            }
        }
        return true;
    }
}
