package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C6784h2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import nj3.C76874e0;
import rx3.C13598b0;
import zj3.C79368l;
import zk3.C66887a;
import zk3.C66893b;
import zk3.C66894c;
import zk3.C66908d;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.h6 */
public final class C57761h6 extends C74023i {

    /* renamed from: v */
    public final String f165318v = "ChattingItemFinderLiveNotifyTmpl";

    /* renamed from: w */
    public HashMap<String, C66908d> f165319w;

    /* renamed from: x */
    public C67391b f165320x;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h6$a */
    public static final class C57762a extends C74023i.C74026c {

        /* renamed from: b */
        public HashMap<String, C66908d.C66909a> f165321b = new HashMap<>();

        /* renamed from: c */
        public View f165322c;

        public C57762a(HashMap<String, C66908d> hashMap) {
            C87412m.m108594g(hashMap, "selectors");
            Set<Map.Entry<String, C66908d>> entrySet = hashMap.entrySet();
            C87412m.m108593f(entrySet, "selectors.entries");
            for (Map.Entry entry : entrySet) {
                HashMap<String, C66908d.C66909a> hashMap2 = this.f165321b;
                Object key = entry.getKey();
                C87412m.m108593f(key, "it.key");
                hashMap2.put(key, ((C66908d) entry.getValue()).mo90893b());
            }
        }

        /* renamed from: a */
        public final <T extends C66908d.C66909a> T mo82215a(String str) {
            C87412m.m108594g(str, "tmplId");
            T t = (C66908d.C66909a) this.f165321b.get(str);
            Set<Map.Entry<String, C66908d.C66909a>> entrySet = this.f165321b.entrySet();
            C87412m.m108593f(entrySet, "holders.entries");
            ArrayList<Map.Entry> arrayList = new ArrayList<>();
            for (T next : entrySet) {
                if (true ^ C87412m.m108589b(((Map.Entry) next).getKey(), str)) {
                    arrayList.add(next);
                }
            }
            for (Map.Entry value : arrayList) {
                ((C66908d.C66909a) value.getValue()).mo90899b(false);
            }
            if (t != null) {
                t.mo90899b(true);
            }
            return t;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.h6$b */
    public static final class C57763b implements C72963f4.C72966d<C57763b> {
        public C57763b(C72963f4 f4Var) {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo82132a(Object obj) {
            C57763b bVar = (C57763b) obj;
            return false;
        }
    }

    public C57761h6() {
        HashMap<String, C66908d> hashMap = new HashMap<>();
        this.f165319w = hashMap;
        MultiProcessMMKV multiProcessMMKV = C66894c.f192192h;
        hashMap.put("TipsTempl_MultiReason_Live", new C66894c());
        HashMap<String, C66908d> hashMap2 = this.f165319w;
        int i = C66887a.f192164j;
        hashMap2.put("TipsTempl_GamePurchaseTeamUp_Live", new C66887a());
        HashMap<String, C66908d> hashMap3 = this.f165319w;
        int i2 = C66893b.f192190j;
        hashMap3.put("TipsTempl_GamePurchaseRefund_Success", new C66893b());
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view == null || view.getTag() == null) {
            view = new C6807n4(layoutInflater, C0966R.C0971layout.f6878r0);
            C57762a aVar = new C57762a(this.f165319w);
            aVar.f165322c = view.findViewById(C0966R.C0970id.b4d);
            View findViewById = view.findViewById(C0966R.C0970id.b46);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.CheckBox");
            aVar.checkBox = (CheckBox) findViewById;
            aVar.maskView = view.findViewById(C0966R.C0970id.b7h);
            View findViewById2 = view.findViewById(C0966R.C0970id.b8z);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            aVar.timeTV = (TextView) findViewById2;
            Set<Map.Entry<String, C66908d.C66909a>> entrySet = aVar.f165321b.entrySet();
            C87412m.m108593f(entrySet, "holders.entries");
            for (Map.Entry value : entrySet) {
                ((C66908d.C66909a) value.getValue()).mo90898a(view);
            }
            view.setTag(aVar);
        }
        return view;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: S */
    public boolean mo82213S() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C87412m.m108591d(view);
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int b = ((C74243t8) tag).mo103252b();
        C67391b bVar = this.f165320x;
        boolean z = false;
        if (bVar != null && !bVar.mo91584y()) {
            z = true;
        }
        if (z) {
            C87412m.m108591d(e0Var);
            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: d */
    public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
        return new C57763b(f4Var);
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C6784h2 Z4;
        C87412m.m108594g(bVar, "ui");
        this.f165320x = bVar;
        C87412m.m108591d(f4Var);
        Map<String, String> parseXml = XmlParser.parseXml(f4Var.getContent(), "msg", (String) null);
        String str2 = parseXml.get(".msg.appmsg.extinfo.notifymsg.templateid");
        String str3 = this.f165318v;
        Log.m105924i(str3, "tmplId = " + str2);
        String nullAsNil = Util.nullAsNil(parseXml.get(".msg.fromusername"));
        C66908d dVar = this.f165319w.get(str2);
        if (dVar != null) {
            C66908d.C66909a b = dVar.mo90893b();
            C74023i.C74027e p = mo103098p(bVar);
            C87412m.m108593f(p, "getLongClickListener(ui)");
            C74243t8 t8Var = new C74243t8(f4Var, nullAsNil);
            t8Var.f217970d = cVar;
            C13598b0 b0Var = C13598b0.f38549a;
            b.mo90900c(p, t8Var);
            C79368l lVar = (C79368l) bVar.f193278b.mo102812a(C79368l.class);
            if (!(lVar == null || (Z4 = lVar.mo108189Z4()) == null)) {
                dVar.mo90893b().setOnTouchListener(Z4);
            }
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemFinderLiveNotifyTmpl.FinderLiveNotifyHolder");
            dVar.mo90889a((C57762a) cVar, parseXml, f4Var, bVar);
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 1075839025;
    }
}
