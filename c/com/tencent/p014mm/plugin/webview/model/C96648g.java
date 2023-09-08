package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import java.util.LinkedList;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C52097yc0;

/* renamed from: com.tencent.mm.plugin.webview.model.g */
public class C96648g {

    /* renamed from: com.tencent.mm.plugin.webview.model.g$a */
    public static final class C6033a {

        /* renamed from: a */
        public String f22296a;

        /* renamed from: b */
        public String f22297b;

        /* renamed from: c */
        public String f22298c;

        /* renamed from: d */
        public String f22299d;

        /* renamed from: e */
        public String f22300e;

        /* renamed from: f */
        public String f22301f;

        /* renamed from: g */
        public LinkedList<C52097yc0> f22302g;

        /* renamed from: h */
        public boolean f22303h;

        /* renamed from: i */
        public String f22304i;

        /* renamed from: j */
        public C101755ad0 f22305j;
    }

    /* renamed from: a */
    public static boolean m124062a(DoFavoriteEvent doFavoriteEvent, C6033a aVar) {
        if (doFavoriteEvent == null || aVar == null || !(!Util.isNullOrNil(aVar.f22296a))) {
            Log.m105928w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or wrapper is invalid");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f264674d.f264687l = C0966R.string.f360421co1;
            return false;
        }
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        C101834rc0 rc02 = new C101834rc0();
        if (aVar.f22303h) {
            rd02.mo141278n(aVar.f22301f);
        }
        rc02.mo141242Q(aVar.f22296a);
        rc02.mo141246U(aVar.f22297b);
        rc02.mo141265u(aVar.f22298c);
        rc02.mo141267w(aVar.f22299d);
        rc02.mo141239N(aVar.f22304i);
        rc02.mo141231E(true);
        rc02.mo141232F(true);
        rc02.mo141260p(5);
        C101756ae0 ae02 = new C101756ae0();
        ae02.mo141197q(aVar.f22299d);
        ae02.mo141198r(aVar.f22297b);
        ae02.mo141194n(aVar.f22298c);
        if (aVar.f22303h) {
            ae02.f297881y = aVar.f22302g;
            ae02.f297882z = true;
        }
        kd02.mo141221s(ae02);
        kd02.mo141216n(aVar.f22305j);
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(3);
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141272d(aVar.f22300e);
        rd02.mo141276l(aVar.f22296a);
        DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
        aVar2.f264679d = rc02.f299297d;
        aVar2.f264676a = kd02;
        aVar2.f264678c = 5;
        kd02.mo141219q(rd02);
        kd02.f298618f.add(rc02);
        return true;
    }
}
