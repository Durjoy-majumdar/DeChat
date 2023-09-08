package com.tencent.p014mm.p136ui.chatting.gallery.scan;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.p136ui.chatting.gallery.scan.ImageScanCodeManager;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gk3.C98152j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/chatting/gallery/scan/ImageScanCodeManager$mScanQRCodeResultEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RecogQBarOfImageFileResultEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1 */
public final class ImageScanCodeManager$mScanQRCodeResultEventListener$1 extends IListener<RecogQBarOfImageFileResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImageScanCodeManager f284988d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageScanCodeManager$mScanQRCodeResultEventListener$1(ImageScanCodeManager imageScanCodeManager, C40008f fVar) {
        super(fVar);
        this.f284988d = imageScanCodeManager;
    }

    public boolean callback(IEvent iEvent) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
        C87412m.m108594g(recogQBarOfImageFileResultEvent, "event");
        ImageScanCodeManager imageScanCodeManager = this.f284988d;
        imageScanCodeManager.getClass();
        String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
        if (str == null) {
            str = "";
        }
        Log.m105927v("MicroMsg.ImageScanCodeManager", "onScanCodeSuccessWrapper key: %s", str);
        ArrayList<C98152j> arrayList = imageScanCodeManager.f284972d.get(str);
        if (arrayList != null) {
            for (C98152j jVar : arrayList) {
                if (jVar != null) {
                    jVar.mo135798a(recogQBarOfImageFileResultEvent);
                }
            }
        }
        ImageScanCodeManager.C97126a remove = imageScanCodeManager.f284971c.remove(str);
        imageScanCodeManager.f284972d.remove(str);
        if (remove != null && remove.f284982d == 1) {
            Log.m105927v("MicroMsg.ImageScanCodeManager", "alvinluo updateSuccessResultCache key: %s", str);
            ImageScanCodeManager.C97127b bVar = imageScanCodeManager.f284973e.get(str);
            if (bVar == null) {
                HashMap<String, ImageScanCodeManager.C97127b> hashMap = imageScanCodeManager.f284973e;
                ImageScanCodeManager.C97127b bVar2 = new ImageScanCodeManager.C97127b();
                bVar2.f284983a = recogQBarOfImageFileResultEvent;
                bVar2.f284984b = null;
                bVar2.f284985c = true;
                hashMap.put(str, bVar2);
            } else {
                bVar.f284983a = recogQBarOfImageFileResultEvent;
                bVar.f284984b = null;
                bVar.f284985c = true;
            }
        }
        return false;
    }
}
