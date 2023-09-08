package com.tencent.p014mm.plugin.webview.luggage.menu;

import com.tencent.p014mm.plugin.webview.luggage.FavUrlTask;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.webview.luggage.menu.s */
public class C43656s {

    /* renamed from: a */
    public List<C43657t> f117902a = new LinkedList();

    /* renamed from: b */
    public Map<Integer, C43634a> f117903b = new HashMap();

    public C43656s() {
        mo67928d();
        mo67929e();
    }

    /* renamed from: a */
    public void mo67925a(C43634a aVar) {
        this.f117903b.put(Integer.valueOf(aVar.f117893a), aVar);
    }

    /* renamed from: b */
    public void mo67926b(int i, String str, boolean z) {
        this.f117902a.add(new C43657t(i, str, z, false));
    }

    /* renamed from: c */
    public void mo67927c(int i, String str, boolean z) {
        this.f117902a.add(new C43657t(i, str, z, true));
    }

    /* renamed from: d */
    public void mo67928d() {
        mo67925a(new C43648m());
        mo67925a(new C43652q());
        mo67925a(new C43654r());
        mo67925a(new C43649n());
        mo67925a(new C43645k());
        mo67925a(new C43642h());
        mo67925a(new C43640f());
        mo67925a(new C43643i());
        mo67925a(new C43647l());
        mo67925a(new C43650o());
        mo67925a(new C43651p());
        mo67925a(new C43638d());
    }

    /* renamed from: e */
    public void mo67929e() {
        this.f117902a.clear();
        mo67927c(35, "menuItem:minimize", true);
        mo67926b(1, "menuItem:share:appMessage", false);
        mo67926b(2, "menuItem:share:timeline", false);
        FavUrlTask favUrlTask = new FavUrlTask();
        favUrlTask.f283014f = 3;
        favUrlTask.mo114396f();
        if (favUrlTask.f283020o) {
            mo67926b(3, "menuItem:favorite", false);
            mo67927c(12, "menuItem:editTag", false);
            mo67927c(9, "menuItem:favorite", false);
        }
        mo67927c(31, "menuItem:search", true);
        mo67927c(6, "menuItem:copyUrl", false);
        mo67926b(7, "menuItem:openWithSafari", false);
        mo67926b(27, "menuItem:finish", true);
        mo67927c(28, "menuItem:refresh", true);
        mo67927c(29, "menuItem:addShortcut", false);
    }
}
