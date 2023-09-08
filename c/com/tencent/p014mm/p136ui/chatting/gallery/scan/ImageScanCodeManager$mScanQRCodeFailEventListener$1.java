package com.tencent.p014mm.p136ui.chatting.gallery.scan;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.p136ui.chatting.gallery.scan.ImageScanCodeManager;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gk3.C98152j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/chatting/gallery/scan/ImageScanCodeManager$mScanQRCodeFailEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RecogQBarOfImageFileFailedEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1 */
public final class ImageScanCodeManager$mScanQRCodeFailEventListener$1 extends IListener<RecogQBarOfImageFileFailedEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImageScanCodeManager f284987d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageScanCodeManager$mScanQRCodeFailEventListener$1(ImageScanCodeManager imageScanCodeManager, C40008f fVar) {
        super(fVar);
        this.f284987d = imageScanCodeManager;
    }

    public boolean callback(IEvent iEvent) {
        RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
        C87412m.m108594g(recogQBarOfImageFileFailedEvent, "event");
        ImageScanCodeManager imageScanCodeManager = this.f284987d;
        imageScanCodeManager.getClass();
        String str = recogQBarOfImageFileFailedEvent.f107738d.f107739a;
        if (str == null) {
            str = "";
        }
        ArrayList<C98152j> arrayList = imageScanCodeManager.f284972d.get(str);
        if (arrayList != null) {
            for (C98152j jVar : arrayList) {
                if (jVar != null) {
                    jVar.mo135799b(recogQBarOfImageFileFailedEvent);
                }
            }
        }
        ImageScanCodeManager.C97126a remove = imageScanCodeManager.f284971c.remove(str);
        imageScanCodeManager.f284972d.remove(str);
        boolean z = true;
        if (remove == null || remove.f284982d != 1) {
            z = false;
        }
        if (z) {
            ImageScanCodeManager.C97127b bVar = imageScanCodeManager.f284973e.get(str);
            if (bVar == null) {
                HashMap<String, ImageScanCodeManager.C97127b> hashMap = imageScanCodeManager.f284973e;
                ImageScanCodeManager.C97127b bVar2 = new ImageScanCodeManager.C97127b();
                bVar2.f284984b = recogQBarOfImageFileFailedEvent;
                bVar2.f284983a = null;
                bVar2.f284985c = false;
                hashMap.put(str, bVar2);
            } else {
                bVar.f284984b = recogQBarOfImageFileFailedEvent;
                bVar.f284983a = null;
                bVar.f284985c = false;
            }
        }
        return false;
    }
}
