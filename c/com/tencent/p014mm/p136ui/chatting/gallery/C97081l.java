package com.tencent.p014mm.p136ui.chatting.gallery;

import a11.C39479c;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.app.C92461m;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p823sg.C90193h;
import tc2.C118418g;

/* renamed from: com.tencent.mm.ui.chatting.gallery.l */
public class C97081l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f284794d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f284795e;

    /* renamed from: f */
    public final /* synthetic */ C92836k f284796f;

    public C97081l(String str, C72963f4 f4Var, C92836k kVar) {
        this.f284794d = str;
        this.f284795e = f4Var;
        this.f284796f = kVar;
    }

    public void run() {
        C92461m.C92464c cVar;
        C92461m.C92463b bVar = C92461m.C92463b.IMAGE;
        try {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(this.f284794d);
            if (imageOptions == null) {
                Log.m105921e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get bmp opts. msgId:%s, msgSvrId:%s", Long.valueOf(this.f284795e.getMsgId()), Long.valueOf(this.f284795e.mo108774y2()));
                return;
            }
            if (C72996z1.m85820U5(this.f284795e.mo108768t())) {
                cVar = new C92461m.C92464c(2, bVar, (C92461m.C92462a) null);
                if (this.f284795e.mo108769t2() == 1) {
                    cVar.f264626b = C75592q0.m90789s();
                    cVar.f264627c = this.f284795e.mo108768t();
                } else {
                    cVar.f264626b = C75604z3.m90847s(this.f284795e.getContent());
                    cVar.f264627c = this.f284795e.mo108768t();
                }
            } else {
                cVar = new C92461m.C92464c(1, bVar, (C92461m.C92462a) null);
                if (this.f284795e.mo108769t2() == 1) {
                    cVar.f264626b = C75592q0.m90789s();
                    cVar.f264627c = this.f284795e.mo108768t();
                } else {
                    cVar.f264626b = this.f284795e.mo108768t();
                    cVar.f264627c = C75592q0.m90789s();
                }
            }
            String[] WN = C118418g.INSTANCE.mo175804WN(this.f284794d);
            String str = WN != null ? WN[0] : "";
            C92836k kVar = this.f284796f;
            Map<String, String> parseXml = kVar != null ? XmlParser.parseXml(kVar.f267393t, "msg", (String) null) : Collections.emptyMap();
            if (parseXml == null) {
                Log.m105921e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse cdn info. msgId:%s, msgSvrId:%s", Long.valueOf(this.f284795e.getMsgId()), Long.valueOf(this.f284795e.mo108774y2()));
                return;
            }
            String str2 = this.f284796f.f267381h == 1 ? parseXml.get(".msg.img.$cdnbigimgurl") : parseXml.get(".msg.img.$cdnmidimgurl");
            cVar.f264628d = this.f284795e.mo108774y2();
            cVar.f264630f = Util.nullAsNil(str2);
            cVar.f264631g = imageOptions.outWidth;
            cVar.f264632h = imageOptions.outHeight;
            cVar.f264633i = Util.nullAsNil(parseXml.get(".msg.img.$cdnthumburl"));
            cVar.f264635k = Util.nullAsNil(str2);
            cVar.f264636l = Util.nullAsNil(parseXml.get(".msg.img.$aeskey"));
            cVar.f264637m = C90193h.m112876d(this.f284794d);
            cVar.f264638n = str;
            if (C72996z1.m85820U5(this.f284795e.mo108768t())) {
                List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f284795e.mo108768t());
                cVar.f264639o = bD != null ? ((LinkedList) bD).size() : 0;
            }
            C92461m.m116308a(cVar);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ImageGalleryAdapter", th, "[-] Exception was thrown when report.", new Object[0]);
        }
    }
}
