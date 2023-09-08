package com.tencent.p014mm.p136ui.chatting.gallery;

import a11.C39479c;
import com.tencent.p014mm.app.C92461m;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import hd0.C98408n0;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p232rw.C63679m;

/* renamed from: com.tencent.mm.ui.chatting.gallery.k */
public class C97078k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f284786d;

    /* renamed from: e */
    public final /* synthetic */ String f284787e;

    /* renamed from: f */
    public final /* synthetic */ C98408n0 f284788f;

    public C97078k(C72963f4 f4Var, String str, C98408n0 n0Var) {
        this.f284786d = f4Var;
        this.f284787e = str;
        this.f284788f = n0Var;
    }

    public void run() {
        C92461m.C92464c cVar;
        C92461m.C92463b bVar = C92461m.C92463b.VIDEO;
        try {
            if (C72996z1.m85820U5(this.f284786d.mo108768t())) {
                cVar = new C92461m.C92464c(2, bVar, (C92461m.C92462a) null);
                if (this.f284786d.mo108769t2() == 1) {
                    cVar.f264626b = C75592q0.m90789s();
                    cVar.f264627c = this.f284786d.mo108768t();
                } else {
                    cVar.f264626b = C75604z3.m90847s(this.f284786d.getContent());
                    cVar.f264627c = this.f284786d.mo108768t();
                }
            } else {
                cVar = new C92461m.C92464c(1, bVar, (C92461m.C92462a) null);
                if (this.f284786d.mo108769t2() == 1) {
                    cVar.f264626b = C75592q0.m90789s();
                    cVar.f264627c = this.f284786d.mo108768t();
                } else {
                    cVar.f264626b = this.f284786d.mo108768t();
                    cVar.f264627c = C75592q0.m90789s();
                }
            }
            C63679m.C63680a b = MultiMediaVideoChecker.f273077a.mo129930b(this.f284787e);
            if (b == null) {
                Log.m105921e("MicroMsg.ImageGalleryAdapter", "[-] Fail to get video data info, skip reporting. msgId:%s, msgSvrId:%s", Long.valueOf(this.f284786d.getMsgId()), Long.valueOf(this.f284786d.mo108774y2()));
                return;
            }
            C98408n0 n0Var = this.f284788f;
            Map<String, String> parseXml = n0Var != null ? XmlParser.parseXml(n0Var.mo137705i(), "msg", (String) null) : Collections.emptyMap();
            if (parseXml == null) {
                Log.m105921e("MicroMsg.ImageGalleryAdapter", "[-] Fail to parse recv xml. msgId:%s, msgSvrId:%s", Long.valueOf(this.f284786d.getMsgId()), Long.valueOf(this.f284786d.mo108774y2()));
                return;
            }
            cVar.f264628d = this.f284786d.mo108774y2();
            cVar.f264630f = Util.nullAsNil(parseXml.get(".msg.videomsg.$cdnvideourl"));
            cVar.f264631g = b.f180525a;
            cVar.f264632h = b.f180526b;
            cVar.f264633i = Util.nullAsNil(parseXml.get(".msg.videomsg.$cdnthumburl"));
            cVar.f264634j = (int) b.f180528d;
            cVar.f264635k = Util.nullAsNil(parseXml.get(".msg.videomsg.$cdnvideourl"));
            cVar.f264636l = Util.nullAsNil(parseXml.get(".msg.videomsg.$aeskey"));
            cVar.f264637m = Util.nullAsNil(parseXml.get(".msg.videomsg.$md5"));
            if (C72996z1.m85820U5(this.f284786d.mo108768t())) {
                List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(this.f284786d.mo108768t());
                cVar.f264639o = bD != null ? ((LinkedList) bD).size() : 0;
            }
            C92461m.m116308a(cVar);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ImageGalleryAdapter", th, "[-] Exception was thrown when report.", new Object[0]);
        }
    }
}
