package kn3;

import a11.C39479c;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b60.C54426a;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57833e1;
import com.tencent.p014mm.p136ui.LiveTalkRoomTipsBar;
import com.tencent.p014mm.p136ui.tipsbar.ChatTipsBarGroup;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import fn3.C75778d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jq3.C60905o;
import ln3.C61317f;
import mn3.C61507f;
import nj3.C11184p0;
import p629ny.C76979h;
import p744wt.C66190c;

/* renamed from: kn3.e */
public final class C61124e extends C61118a<C61317f> {

    /* renamed from: e */
    public final C67391b f174029e;

    /* renamed from: f */
    public final ChatTipsBarGroup.C74825d f174030f;

    /* renamed from: g */
    public final C61507f f174031g;

    /* renamed from: kn3.e$a */
    public static final class C61125a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f174032d;

        /* renamed from: e */
        public final /* synthetic */ C61124e f174033e;

        /* renamed from: f */
        public final /* synthetic */ C54426a f174034f;

        /* renamed from: g */
        public final /* synthetic */ C60905o f174035g;

        public C61125a(String str, C61124e eVar, C54426a aVar, C60905o oVar) {
            this.f174032d = str;
            this.f174033e = eVar;
            this.f174034f = aVar;
            this.f174035g = oVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75778d dVar = C75778d.f222377a;
            String str = this.f174032d;
            C87412m.m108593f(str, "hostRoomId");
            List<? extends C54426a> list = this.f174033e.f174031g.f174858f;
            dVar.mo106088b(str, (long) (list != null ? list.size() : 0), String.valueOf(this.f174034f.mo55880H()), 4, System.currentTimeMillis());
            LiveTalkRoomTipsBar.m66362b(this.f174034f, this.f174035g.f173499A);
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.e$b */
    public static final class C61126b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61317f f174036d;

        /* renamed from: e */
        public final /* synthetic */ String f174037e;

        /* renamed from: f */
        public final /* synthetic */ C61124e f174038f;

        /* renamed from: g */
        public final /* synthetic */ C54426a f174039g;

        public C61126b(C61317f fVar, String str, C61124e eVar, C54426a aVar) {
            this.f174036d = fVar;
            this.f174037e = str;
            this.f174038f = eVar;
            this.f174039g = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f174036d.f224436e = 3;
            C75778d dVar = C75778d.f222377a;
            String str = this.f174037e;
            C87412m.m108593f(str, "hostRoomId");
            List<? extends C54426a> list = this.f174038f.f174031g.f174858f;
            dVar.mo106088b(str, (long) (list != null ? list.size() : 0), String.valueOf(this.f174039g.mo55880H()), 3, System.currentTimeMillis());
            ((C66190c) C86312j.m106911c(C66190c.class)).o40().mo55889d(this.f174039g.mo55880H());
            this.f174038f.f174031g.mo107034Z5();
            C117292a.m165361g(this, "com/tencent/mm/ui/tipsbar/convert/LiveTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kn3.e$c */
    public static final class C61127c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f174040d;

        public C61127c(RelativeLayout relativeLayout) {
            this.f174040d = relativeLayout;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            if (menuItem.getItemId() == 0) {
                this.f174040d.performClick();
            }
        }
    }

    public C61124e(C67391b bVar, ChatTipsBarGroup.C74825d dVar, C61507f fVar) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(dVar, "tipsBarContext");
        C87412m.m108594g(fVar, "processor");
        this.f174029e = bVar;
        this.f174030f = dVar;
        this.f174031g = fVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359860cw2;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo44e(C60905o oVar, C61317f fVar, int i, int i2, boolean z, List<Object> list) {
        String str;
        Class cls = C76979h.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(fVar, "item");
        super.mo86076k(oVar, fVar, i, i2, z, list);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f358591fz2);
        View D = oVar.mo85812D(C0966R.C0970id.fz5);
        C87412m.m108593f(D, "holder.getView<RelativeL…d.live_tipsbar_close_btn)");
        RelativeLayout relativeLayout = (RelativeLayout) D;
        View view = oVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C54426a aVar = fVar.f174435u;
        String r = this.f174029e.mo91577r();
        relativeLayout.setVisibility(8);
        ((TextView) oVar.mo85812D(C0966R.C0970id.fz_)).setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(oVar.f173499A, aVar.mo55879G()));
        StringBuilder sb = new StringBuilder();
        sb.append("主播：");
        C76979h hVar = (C76979h) C86312j.m106911c(cls);
        Context context = oVar.f173499A;
        String Y1 = aVar.mo55882Y1();
        HashSet<C57833e1.C57835b> hashSet = C57833e1.f165458d;
        Class cls2 = C75339i.class;
        if (Y1 == null) {
            str = "";
        } else {
            String Si = ((C75339i) C86312j.m106911c(cls2)).mo62515Si(Y1);
            if (Util.isNullOrNil(Si)) {
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(r);
                if (Lo == null) {
                    str = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(Y1);
                } else {
                    Si = Lo.mo69789q2(Y1);
                    if (Util.isNullOrNil(Si)) {
                        str = ((C75339i) C86312j.m106911c(cls2)).getDisplayName(Y1);
                    }
                }
            }
            str = Si;
        }
        sb.append(hVar.yp0(context, str, textView.getTextSize()));
        textView.setText(sb.toString());
        view.setOnClickListener(new C61125a(r, this, aVar, oVar));
        relativeLayout.setOnClickListener(new C61126b(fVar, r, this, aVar));
        mo86075j(view, i, this.f174030f, new C61127c(relativeLayout));
    }
}
