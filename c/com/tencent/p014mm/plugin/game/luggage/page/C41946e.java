package com.tencent.p014mm.plugin.game.luggage.page;

import android.app.Activity;
import com.tencent.p014mm.plugin.game.luggage.jsapi.C4453a;
import com.tencent.p014mm.plugin.webview.luggage.C43630l1;
import java.util.LinkedList;
import p828wa.C53096b;
import p828wa.C53100e;

/* renamed from: com.tencent.mm.plugin.game.luggage.page.e */
public class C41946e extends C43630l1 {

    /* renamed from: l */
    public C41947a f112993l;

    /* renamed from: com.tencent.mm.plugin.game.luggage.page.e$a */
    public interface C41947a {
        /* renamed from: a */
        boolean mo65725a();

        /* renamed from: b */
        void mo65726b();

        /* renamed from: c */
        void mo65727c();
    }

    public C41946e(Activity activity) {
        super(activity);
        LinkedList<Class<? extends C53096b>> linkedList;
        this.f148201a = C41962j.class;
        C53100e eVar = this.f148205e;
        synchronized (C4453a.class) {
            C4453a.f19221a = new LinkedList<>();
            C4453a.m4606b();
            linkedList = C4453a.f19221a;
        }
        eVar.getClass();
        for (Class<? extends C53096b> add : linkedList) {
            eVar.f148191a.add(add);
        }
    }
}
