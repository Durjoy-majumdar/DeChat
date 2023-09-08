package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import gk3.C98133b;
import gk3.C98134c;
import gk3.C98136e;
import gk3.C98140g;
import gy3.C87412m;
import sk2.C101647f;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$m0 */
public class ImageGalleryUI$$m0 implements C98134c {

    /* renamed from: a */
    public final /* synthetic */ ImageGalleryUI f284523a;

    public ImageGalleryUI$$m0(ImageGalleryUI imageGalleryUI) {
        this.f284523a = imageGalleryUI;
    }

    /* renamed from: a */
    public void mo135807a(long j, Object obj) {
        C98133b bVar = (C98133b) obj;
        C101647f fVar = bVar.f287722a;
        if (fVar != null) {
            Log.m105925i("MicroMsg.ImageGalleryUI", "alvinluo searchImagePreview onCallback currentMsgId: %d, opImageType: %d, result.msgId: %d, success: %b, resultCode: %d, searchImageWording: %s, errCode: %d, errMsg: %s", Long.valueOf(this.f284523a.f284341B), Integer.valueOf(fVar.f297547a), Long.valueOf(bVar.f287723b), Boolean.valueOf(fVar.f297549c), Integer.valueOf(bVar.f287724c), fVar.f297557k, Integer.valueOf(fVar.f297551e), fVar.f297552f);
            if (fVar.f297547a != 2 || this.f284523a.f284341B != bVar.f287723b) {
                return;
            }
            if (fVar.f297549c && bVar.f287724c == 2 && (!Util.isNullOrNil(fVar.f297557k))) {
                ImageGalleryUI imageGalleryUI = this.f284523a;
                imageGalleryUI.f284467s1 = fVar;
                imageGalleryUI.f284461q1.mo137429i(3, 1);
                this.f284523a.f284461q1.mo137427g(3, new C97043d0(this));
            } else if (bVar.f287724c == 3) {
                C98140g gVar = this.f284523a.f284461q1;
                gVar.getClass();
                Log.m105925i("MicroMsg.ImageScanButtonStatusManager", "alvinluo disableAction type: %d", 1);
                C98140g.C98141a aVar = gVar.f287753b.get(1);
                if (aVar != null) {
                    aVar.setEnable(false);
                }
                gVar.f287754c.put(1, 2);
                this.f284523a.f284461q1.mo137429i(1, 5);
                this.f284523a.f284461q1.mo137429i(3, 2);
                this.f284523a.mo135738Q7(3, false);
            } else {
                this.f284523a.f284461q1.mo137429i(3, 2);
                this.f284523a.mo135738Q7(3, false);
            }
        }
    }

    /* renamed from: b */
    public void mo135808b(long j, String str) {
        C72963f4 y;
        ImageGalleryUI imageGalleryUI = this.f284523a;
        C97056h hVar = imageGalleryUI.f284432g;
        if (hVar != null && (y = hVar.mo135937y(imageGalleryUI.f284488y2)) != null) {
            boolean U5 = C72996z1.m85820U5(y.mo108768t());
            C98136e eVar = this.f284523a.f284404V1;
            long y2 = y.mo108774y2();
            int i = U5 ? 2 : 1;
            String u8 = this.f284523a.mo135789u8(y, U5);
            String t = U5 ? y.mo108768t() : "";
            C98136e.C98138b bVar = eVar.f287731c;
            if (bVar != null) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                C87412m.m108594g(valueOf, "<set-?>");
                bVar.f287738a = valueOf;
                bVar.f287741d = y2;
                bVar.f287740c = 67;
                bVar.f287743f = i;
                if (u8 == null) {
                    u8 = "";
                }
                bVar.f287742e = u8;
                if (t == null) {
                    t = "";
                }
                bVar.f287744g = t;
                if (str == null) {
                    str = "";
                }
                bVar.f287745h = str;
            }
        }
    }
}
