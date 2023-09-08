package com.tencent.p014mm.p136ui.chatting.gallery.scan;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gk3.C98153k;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/ui/chatting/gallery/scan/ImageScanCodeManager$mNotifyDealQBarStrResultListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/NotifyDealQBarStrResultEvent;", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1 */
public final class ImageScanCodeManager$mNotifyDealQBarStrResultListener$1 extends IListener<NotifyDealQBarStrResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ ImageScanCodeManager f284986d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageScanCodeManager$mNotifyDealQBarStrResultListener$1(ImageScanCodeManager imageScanCodeManager, C40008f fVar) {
        super(fVar);
        this.f284986d = imageScanCodeManager;
    }

    public boolean callback(IEvent iEvent) {
        NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
        C87412m.m108594g(notifyDealQBarStrResultEvent, "event");
        ImageScanCodeManager imageScanCodeManager = this.f284986d;
        imageScanCodeManager.getClass();
        String str = notifyDealQBarStrResultEvent.f264935d.f264936a;
        if (str == null) {
            str = "";
        }
        ArrayList<C98153k> arrayList = imageScanCodeManager.f284975g.get(str);
        if (arrayList != null) {
            for (C98153k kVar : arrayList) {
                if (kVar != null) {
                    kVar.mo135819a(notifyDealQBarStrResultEvent);
                }
            }
        }
        imageScanCodeManager.f284974f.remove(str);
        return false;
    }
}
