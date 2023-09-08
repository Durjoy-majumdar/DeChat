package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import java.util.HashSet;

/* renamed from: com.tencent.mm.plugin.fav.ui.m1 */
public class C93676m1 implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ FavTagEditUI f270459d;

    public C93676m1(FavTagEditUI favTagEditUI) {
        this.f270459d = favTagEditUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
    }

    /* renamed from: b */
    public void mo94791b(String str) {
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        this.f270459d.f269847g.mo101812o(str);
        C68901b bVar = this.f270459d.f269851n;
        ((HashSet) bVar.f198003g).remove(str);
        bVar.notifyDataSetChanged();
        this.f270459d.mo128315H7();
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    /* renamed from: h */
    public void mo94799h(String str) {
    }

    /* renamed from: i */
    public void mo94800i(String str) {
        this.f270459d.f269847g.mo95185d(str, true);
        C68901b bVar = this.f270459d.f269851n;
        ((HashSet) bVar.f198003g).add(str);
        bVar.notifyDataSetChanged();
        this.f270459d.mo128315H7();
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
    }
}
