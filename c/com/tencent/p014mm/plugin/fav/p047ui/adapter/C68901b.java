package com.tencent.p014mm.plugin.fav.p047ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MMTagPanel;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavTagPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import pb1.C100706g0;
import pb1.C100718j1;
import te3.C51681vd0;

/* renamed from: com.tencent.mm.plugin.fav.ui.adapter.b */
public abstract class C68901b extends BaseAdapter implements MMTagPanel.C73201i, C100706g0.C100709d {

    /* renamed from: d */
    public Context f198000d;

    /* renamed from: e */
    public int f198001e = C0966R.color.a7f;

    /* renamed from: f */
    public int f198002f = C0966R.C0969drawable.f4996tg;

    /* renamed from: g */
    public Set<String> f198003g = new HashSet();

    /* renamed from: com.tencent.mm.plugin.fav.ui.adapter.b$a */
    public static class C68902a {

        /* renamed from: a */
        public FavTagPanel f198004a;
    }

    public C68901b(Context context) {
        this.f198000d = context;
    }

    /* renamed from: a */
    public void mo94790a(String str) {
    }

    /* renamed from: b */
    public void mo94791b(String str) {
    }

    /* renamed from: d */
    public final void mo94792d(String str) {
        ((HashSet) this.f198003g).remove(str);
        notifyDataSetChanged();
        mo94804n(str);
    }

    /* renamed from: f */
    public void mo94793f(String str) {
        Log.m105918d("MicroMsg.FavoriteTagPanelAdapter", "on removetag callback");
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public void mo94794g() {
    }

    public int getCount() {
        ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU().getClass();
        return 1;
    }

    public Object getItem(int i) {
        return ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU().mo140138d(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C68902a aVar;
        if (view == null) {
            view = View.inflate(this.f198000d, C0966R.C0971layout.a7c, (ViewGroup) null);
            aVar = new C68902a();
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.cvx);
            FavTagPanel favTagPanel = (FavTagPanel) view.findViewById(C0966R.C0970id.cwt);
            aVar.f198004a = favTagPanel;
            favTagPanel.setCallBack(this);
            aVar.f198004a.setTagNormalBG(this.f198002f);
            aVar.f198004a.setTagNormalTextColorRes(this.f198001e);
            view.setTag(aVar);
        } else {
            aVar = (C68902a) view.getTag();
        }
        FavTagPanel favTagPanel2 = aVar.f198004a;
        Set<String> set = this.f198003g;
        List<C51681vd0> d = ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128204NU().mo140138d(i);
        favTagPanel2.getClass();
        boolean z = true;
        if (d == null || d.isEmpty()) {
            Object[] objArr = new Object[1];
            if (d != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.FavTagPanel", "setTagListByTagInfo,null == tags ?%B,", objArr);
        } else {
            Log.m105925i("MicroMsg.FavTagPanel", "setTagListByTagInfo,tags.size = %d", Integer.valueOf(((LinkedList) d).size()));
            LinkedList linkedList = new LinkedList();
            for (C51681vd0 vd02 : d) {
                linkedList.add(vd02.f143434d);
            }
            favTagPanel2.mo95190q(set, linkedList);
        }
        return view;
    }

    /* renamed from: h */
    public void mo94799h(String str) {
    }

    /* renamed from: i */
    public final void mo94800i(String str) {
        ((HashSet) this.f198003g).add(str);
        notifyDataSetChanged();
        mo94803l(str);
    }

    /* renamed from: j */
    public void mo94801j(boolean z, int i) {
    }

    /* renamed from: k */
    public void mo94802k(String str) {
        Log.m105918d("MicroMsg.FavoriteTagPanelAdapter", "on addtag callback");
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public abstract void mo94803l(String str);

    /* renamed from: n */
    public abstract void mo94804n(String str);
}
