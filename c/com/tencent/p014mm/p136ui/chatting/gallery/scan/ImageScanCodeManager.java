package com.tencent.p014mm.p136ui.chatting.gallery.scan;

import android.app.Activity;
import android.graphics.Bitmap;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.sdk.platformtools.Log;
import gk3.C98152j;
import gk3.C98153k;
import gk3.C98162q;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager */
public final class ImageScanCodeManager {

    /* renamed from: a */
    public Activity f284969a;

    /* renamed from: b */
    public boolean f284970b = true;

    /* renamed from: c */
    public HashMap<String, C97126a> f284971c = new HashMap<>();

    /* renamed from: d */
    public HashMap<String, ArrayList<C98152j>> f284972d = new HashMap<>();

    /* renamed from: e */
    public HashMap<String, C97127b> f284973e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, C98162q> f284974f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, ArrayList<C98153k>> f284975g = new HashMap<>();

    /* renamed from: h */
    public final ImageScanCodeManager$mScanQRCodeResultEventListener$1 f284976h;

    /* renamed from: i */
    public final ImageScanCodeManager$mScanQRCodeFailEventListener$1 f284977i;

    /* renamed from: j */
    public final ImageScanCodeManager$mNotifyDealQBarStrResultListener$1 f284978j;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$a */
    public static final class C97126a {

        /* renamed from: a */
        public long f284979a;

        /* renamed from: b */
        public String f284980b = "";

        /* renamed from: c */
        public Bitmap f284981c;

        /* renamed from: d */
        public int f284982d;
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$b */
    public static final class C97127b {

        /* renamed from: a */
        public RecogQBarOfImageFileResultEvent f284983a;

        /* renamed from: b */
        public RecogQBarOfImageFileFailedEvent f284984b;

        /* renamed from: c */
        public boolean f284985c;
    }

    public ImageScanCodeManager(Activity activity, boolean z) {
        C87412m.m108594g(activity, "context");
        C40008f fVar = C40008f.f107254d;
        ImageScanCodeManager$mScanQRCodeResultEventListener$1 imageScanCodeManager$mScanQRCodeResultEventListener$1 = new ImageScanCodeManager$mScanQRCodeResultEventListener$1(this, fVar);
        this.f284976h = imageScanCodeManager$mScanQRCodeResultEventListener$1;
        ImageScanCodeManager$mScanQRCodeFailEventListener$1 imageScanCodeManager$mScanQRCodeFailEventListener$1 = new ImageScanCodeManager$mScanQRCodeFailEventListener$1(this, fVar);
        this.f284977i = imageScanCodeManager$mScanQRCodeFailEventListener$1;
        ImageScanCodeManager$mNotifyDealQBarStrResultListener$1 imageScanCodeManager$mNotifyDealQBarStrResultListener$1 = new ImageScanCodeManager$mNotifyDealQBarStrResultListener$1(this, fVar);
        this.f284978j = imageScanCodeManager$mNotifyDealQBarStrResultListener$1;
        this.f284969a = activity;
        this.f284970b = z;
        Log.m105925i("MicroMsg.ImageScanCodeManager", "scanCode enableScan: %b", Boolean.valueOf(z));
        if (z) {
            imageScanCodeManager$mScanQRCodeResultEventListener$1.alive();
            imageScanCodeManager$mScanQRCodeFailEventListener$1.alive();
            imageScanCodeManager$mNotifyDealQBarStrResultListener$1.alive();
        }
    }

    /* renamed from: a */
    public final void mo136028a(C98162q qVar, ImageQBarDataBean imageQBarDataBean, C98153k kVar) {
        C87412m.m108594g(qVar, "codeResult");
        C87412m.m108594g(imageQBarDataBean, "codePointInfo");
        String str = imageQBarDataBean.f273113d;
        if (str == null) {
            str = "";
        }
        if (!this.f284975g.containsKey(str)) {
            this.f284975g.put(str, new ArrayList());
        }
        ArrayList<C98153k> arrayList = this.f284975g.get(str);
        C87412m.m108591d(arrayList);
        if (!arrayList.contains(kVar)) {
            ArrayList<C98153k> arrayList2 = this.f284975g.get(str);
            C87412m.m108591d(arrayList2);
            arrayList2.add(kVar);
        }
        this.f284974f.put(str, qVar);
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = this.f284969a;
        aVar.f264649a = imageQBarDataBean.f273113d;
        aVar.f264651c = imageQBarDataBean.f273114e;
        aVar.f264652d = imageQBarDataBean.f273115f;
        aVar.f264657i = 37;
        aVar.f264654f = qVar.f287789e;
        aVar.f264653e = qVar.f287790f;
        aVar.f264659k = qVar.f287792h;
        aVar.f264658j = qVar.f287793i;
        aVar.f264660l = qVar.f287791g;
        aVar.f264661m = qVar.f287794j;
        dealQBarStrEvent.publish();
    }

    /* renamed from: b */
    public final void mo136029b() {
        if (this.f284970b) {
            this.f284976h.dead();
            this.f284977i.dead();
            this.f284978j.dead();
        }
        Set<String> keySet = this.f284971c.keySet();
        C87412m.m108593f(keySet, "scanCodeRequestMap.keys");
        for (String str : keySet) {
            C97126a aVar = this.f284971c.get(str);
            CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
            CancelRecogImageFileEvent.C40046a aVar2 = cancelRecogImageFileEvent.f107390d;
            aVar2.f107392b = str;
            aVar2.f107391a = aVar != null ? aVar.f284979a : 0;
            cancelRecogImageFileEvent.publish();
        }
        this.f284971c.clear();
        this.f284972d.clear();
        this.f284973e.clear();
        Log.m105926v("MicroMsg.ImageScanCodeManager", "releaseHandleCode");
        Set<String> keySet2 = this.f284974f.keySet();
        C87412m.m108593f(keySet2, "handleCodeRequestMap.keys");
        for (String str2 : keySet2) {
            CancelDealQBarStrEvent cancelDealQBarStrEvent = new CancelDealQBarStrEvent();
            CancelDealQBarStrEvent.C92466a aVar3 = cancelDealQBarStrEvent.f264642d;
            aVar3.f264644b = this.f284969a;
            aVar3.f264643a = str2;
            cancelDealQBarStrEvent.publish();
        }
        this.f284975g.clear();
    }
}
