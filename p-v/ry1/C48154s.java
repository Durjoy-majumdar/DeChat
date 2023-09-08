package ry1;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.model.C42066i0;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailRankLikeView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: ry1.s */
public class C48154s extends BaseAdapter {

    /* renamed from: d */
    public Context f129077d;

    /* renamed from: e */
    public int f129078e;

    /* renamed from: f */
    public C42066i0 f129079f;

    /* renamed from: g */
    public int f129080g;

    /* renamed from: ry1.s$a */
    public class C48155a {

        /* renamed from: a */
        public TextView f129081a;

        /* renamed from: b */
        public ImageView f129082b;

        /* renamed from: c */
        public TextView f129083c;

        /* renamed from: d */
        public TextView f129084d;

        /* renamed from: e */
        public TextView f129085e;

        /* renamed from: f */
        public GameDetailRankLikeView f129086f;

        public C48155a(C48154s sVar, C48152r rVar) {
        }
    }

    public C48154s(Context context) {
        this.f129077d = context;
    }

    /* renamed from: a */
    public final void mo72903a(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) childAt;
                viewGroup2.setClipChildren(false);
                mo72903a(viewGroup2);
            }
        }
    }

    public int getCount() {
        C42066i0 i0Var = this.f129079f;
        if (i0Var == null) {
            return 0;
        }
        return i0Var.f113339b.size();
    }

    public Object getItem(int i) {
        return this.f129079f.f113339b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C48155a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f129077d).inflate(this.f129078e, viewGroup, false);
            aVar = new C48155a(this, (C48152r) null);
            aVar.f129081a = (TextView) view.findViewById(C0966R.C0970id.ejr);
            aVar.f129082b = (ImageView) view.findViewById(C0966R.C0970id.ejo);
            aVar.f129083c = (TextView) view.findViewById(C0966R.C0970id.ejq);
            aVar.f129084d = (TextView) view.findViewById(C0966R.C0970id.ejt);
            aVar.f129085e = (TextView) view.findViewById(C0966R.C0970id.ejs);
            GameDetailRankLikeView gameDetailRankLikeView = (GameDetailRankLikeView) view.findViewById(C0966R.C0970id.ejp);
            aVar.f129086f = gameDetailRankLikeView;
            gameDetailRankLikeView.setSourceScene(this.f129080g);
            mo72903a((ViewGroup) view);
            view.setTag(aVar);
        } else {
            aVar = (C48155a) view.getTag();
        }
        C42066i0.C42067a aVar2 = (C42066i0.C42067a) getItem(i);
        TextView textView = aVar.f129081a;
        textView.setText(aVar2.f113340d + "");
        ((C76705f) C86312j.m106911c(C76705f.class)).D20(aVar.f129082b, aVar2.f113341e, 0.5f);
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(aVar2.f113341e);
        if (z1Var != null) {
            aVar.f129083c.setText(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f129077d, z1Var.mo62898f(), aVar.f129083c.getTextSize())));
        } else {
            aVar.f129083c.setText("");
        }
        if (Util.isNullOrNil(aVar2.f113342f)) {
            aVar.f129084d.setVisibility(8);
        } else {
            aVar.f129084d.setVisibility(0);
            aVar.f129084d.setText(aVar2.f113342f);
        }
        if (!Util.isNullOrNil(aVar2.f113346j)) {
            aVar.f129085e.setText(aVar2.f113346j);
            aVar.f129086f.setVisibility(8);
        } else {
            TextView textView2 = aVar.f129085e;
            textView2.setText(aVar2.f113343g + "");
            GameDetailRankLikeView gameDetailRankLikeView2 = aVar.f129086f;
            C42066i0 i0Var = this.f129079f;
            gameDetailRankLikeView2.f113732d = i0Var;
            gameDetailRankLikeView2.f113733e = i0Var.f113338a;
            gameDetailRankLikeView2.f113734f = (C42066i0.C42067a) ((LinkedList) i0Var.f113339b).get(i);
            gameDetailRankLikeView2.mo66143a();
            aVar.f129086f.setVisibility(0);
        }
        return view;
    }
}
