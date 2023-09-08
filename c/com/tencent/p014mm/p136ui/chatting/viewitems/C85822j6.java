package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.text.TextUtils;
import android.widget.TextView;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import kr0.C88262c1;
import p1031sb.C90159e;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j6 */
public class C85822j6 {

    /* renamed from: a */
    public static boolean f249950a;

    /* renamed from: a */
    public static void m106040a(C74244u.C74255e eVar, C68070l.C68072b bVar, int i) {
        String trim = Util.nullAsNil(bVar.f195570f).trim();
        if (TextUtils.isEmpty(trim)) {
            eVar.f218033M.setText("");
            eVar.f218033M.setVisibility(8);
            return;
        }
        eVar.f218033M.setText(trim);
        eVar.f218033M.setVisibility(0);
        TextView textView = eVar.f218033M;
        if (!TextUtils.isEmpty(trim)) {
            textView.post(new C44866i6(textView, trim));
        }
    }

    /* renamed from: b */
    public static boolean m106041b(C68070l.C68072b bVar) {
        C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
        if (aVar != null) {
            return aVar.f237907p;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m106042c(C68070l.C68072b bVar, WxaAttributes wxaAttributes, int i) {
        boolean z;
        boolean a;
        Class cls = C80995a.class;
        if (wxaAttributes == null) {
            C80995a aVar = (C80995a) bVar.mo93555w(cls);
            z = aVar != null ? C90159e.m112822a(aVar.f237908q, i) : false;
            Log.m105925i("MicroMsg.ChattingItemForAppBrandUtils", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", Boolean.valueOf(z));
        } else {
            C80995a aVar2 = (C80995a) bVar.mo93555w(cls);
            if (wxaAttributes.mo113942o2() == null || bVar.f195467A2 <= wxaAttributes.mo113942o2().f239452d || aVar2 == null) {
                a = C90159e.m112822a(wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239501q : 0, i);
            } else {
                boolean a2 = C90159e.m112822a(aVar2.f237908q, i);
                Log.m105925i("MicroMsg.ChattingItemForAppBrandUtils", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", Integer.valueOf(bVar.f195467A2), Integer.valueOf(wxaAttributes.mo113942o2().f239452d));
                a = a2;
            }
            Log.m105925i("MicroMsg.ChattingItemForAppBrandUtils", "[isShowFlagshipTag] use attrs:%b", Boolean.valueOf(z));
        }
        return z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.wxapp_flagship_store, 0) == 1;
    }

    /* renamed from: d */
    public static void m106043d() {
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_fake_native_profile, 0) == 1) {
            z = true;
        }
        if (z && !f249950a) {
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re((String) null, "wx27a2b9eea2cf1a62", "pages/index/index.html", 15);
            f249950a = true;
        }
    }
}
