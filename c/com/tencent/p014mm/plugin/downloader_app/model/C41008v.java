package com.tencent.p014mm.plugin.downloader_app.model;

import java.util.Iterator;
import java.util.LinkedList;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.v */
public class C41008v {

    /* renamed from: a */
    public static LinkedList<v$$b> f110375a = new LinkedList<>();

    /* renamed from: b */
    public static LinkedList<v$$c> f110376b = new LinkedList<>();

    /* renamed from: c */
    public static LinkedList<v$$d> f110377c = new LinkedList<>();

    /* renamed from: d */
    public static LinkedList<v$$h> f110378d = new LinkedList<>();

    /* renamed from: e */
    public static LinkedList<v$$f> f110379e = new LinkedList<>();

    /* renamed from: f */
    public static LinkedList<v$$e> f110380f = new LinkedList<>();

    /* renamed from: g */
    public static LinkedList<v$$i> f110381g = new LinkedList<>();

    /* renamed from: a */
    public static void m44441a(long j) {
        Iterator<v$$e> it = f110380f.iterator();
        while (it.hasNext()) {
            it.next().mo64029f(5, j);
        }
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(v$$g.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C38174i iVar = (C38174i) bVar.next();
            if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                ((v$$g) ((C15510f) iVar.get())).mo64031f(5, j);
            }
        }
    }

    /* renamed from: b */
    public static void m44442b(boolean z) {
        Iterator<v$$d> it = f110377c.iterator();
        while (it.hasNext()) {
            it.next().mo64028a(z);
        }
    }

    /* renamed from: c */
    public static void m44443c(String str) {
        Iterator<v$$h> it = f110378d.iterator();
        while (it.hasNext()) {
            it.next().mo64032a(str);
        }
    }
}
