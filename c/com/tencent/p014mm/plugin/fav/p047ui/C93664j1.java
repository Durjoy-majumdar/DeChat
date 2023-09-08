package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C41401c;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C68901b;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import pb1.C100706g0;
import pb1.C100718j1;
import te3.C51681vd0;
import te3.C51816wd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.j1 */
public class C93664j1 implements MMTagPanel.C73201i {

    /* renamed from: d */
    public final /* synthetic */ FavTagEditUI f270442d;

    public C93664j1(FavTagEditUI favTagEditUI) {
        this.f270442d = favTagEditUI;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
        this.f270442d.f269847g.mo101812o(str);
        C68901b bVar = this.f270442d.f269851n;
        ((HashSet) bVar.f198003g).remove(str);
        bVar.notifyDataSetChanged();
        FavTagPanel favTagPanel = this.f270442d.f269846f;
        if (favTagPanel != null) {
            favTagPanel.mo101814r(str, false);
        }
        this.f270442d.mo128315H7();
    }

    /* renamed from: b */
    public void mo94791b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105918d("MicroMsg.FavTagEditUI", "on create tag, fail, tag is empty");
            return;
        }
        this.f270442d.f269847g.mo95185d(str, true);
        this.f270442d.mo128315H7();
    }

    /* renamed from: d */
    public void mo94792d(String str) {
        this.f270442d.f269847g.mo101812o(str);
        C68901b bVar = this.f270442d.f269851n;
        ((HashSet) bVar.f198003g).remove(str);
        bVar.notifyDataSetChanged();
        FavTagPanel favTagPanel = this.f270442d.f269846f;
        if (favTagPanel != null) {
            favTagPanel.mo101814r(str, false);
        }
        this.f270442d.mo128315H7();
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    /* renamed from: h */
    public void mo94799h(String str) {
        if (!Util.isNullOrNil(str)) {
            C41401c cVar = this.f270442d.f269852o;
            cVar.f111484g.clear();
            ((LinkedList) cVar.f111483f).clear();
            cVar.f111482e = Util.nullAs(str, "");
            C100706g0 NU = ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU();
            NU.getClass();
            boolean isNullOrNil = Util.isNullOrNil(str);
            ArrayList arrayList = new ArrayList(16);
            Iterator<C51816wd0> it = NU.f295054a.f144599d.iterator();
            while (it.hasNext()) {
                Iterator<C51681vd0> it4 = it.next().f143967e.iterator();
                while (it4.hasNext()) {
                    C51681vd0 next = it4.next();
                    if (isNullOrNil || next.f143434d.contains(str)) {
                        arrayList.add(next.f143434d);
                    }
                }
            }
            ((LinkedList) cVar.f111483f).addAll(arrayList);
            cVar.notifyDataSetChanged();
            this.f270442d.f269849i.setVisibility(0);
            this.f270442d.f269848h.setVisibility(8);
        } else {
            this.f270442d.f269849i.setVisibility(8);
            this.f270442d.f269848h.setVisibility(0);
        }
        FavTagEditUI favTagEditUI = this.f270442d;
        int i = FavTagEditUI.f269843q;
        favTagEditUI.mo128315H7();
    }

    /* renamed from: i */
    public void mo94800i(String str) {
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
        FavTagEditUI favTagEditUI = this.f270442d;
        favTagEditUI.f269853p = z;
        favTagEditUI.f269850j.setVisibility((!z || i <= 0) ? 8 : 0);
        FavTagEditUI favTagEditUI2 = this.f270442d;
        favTagEditUI2.f269850j.setText(favTagEditUI2.getString(C0966R.string.crz, new Object[]{Integer.valueOf(i)}));
        this.f270442d.mo128315H7();
    }
}
