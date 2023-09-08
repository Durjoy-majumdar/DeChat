package ve1;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import dq1.C7461a;
import er1.C58784w3;
import er1.C7878t0;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import hi3.C87515a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ve1.f7 */
public final class C14524f7 extends C14514f3 {

    /* renamed from: r */
    public final BaseFinderFeedLoader f40262r;

    /* renamed from: s */
    public final String f40263s;

    /* renamed from: t */
    public final boolean f40264t;

    /* renamed from: u */
    public final boolean f40265u;

    /* renamed from: ve1.f7$a */
    public static final class C14525a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60905o f40266d;

        /* renamed from: e */
        public final /* synthetic */ C14524f7 f40267e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f40268f;

        public C14525a(C60905o oVar, C14524f7 f7Var, RecyclerView recyclerView) {
            this.f40266d = oVar;
            this.f40267e = f7Var;
            this.f40268f = recyclerView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0034, code lost:
            r2 = r2.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
                r12 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r13)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert$onCreateViewHolder$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r12
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                jq3.o r13 = r12.f40266d
                java.lang.Object r13 = r13.f173503E
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r13 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r13
                ve1.f7 r0 = r12.f40267e
                androidx.recyclerview.widget.RecyclerView r1 = r12.f40268f
                android.content.Context r1 = r1.getContext()
                java.lang.String r2 = "recyclerView.context"
                gy3.C87412m.m108593f(r1, r2)
                ve1.f7 r2 = r12.f40267e
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r2 = r2.f40262r
                if (r2 == 0) goto L_0x003f
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataListJustForAdapter()
                if (r2 == 0) goto L_0x003f
                int r2 = r2.indexOf(r13)
                goto L_0x0040
            L_0x003f:
                r2 = 0
            L_0x0040:
                java.lang.String r3 = "item"
                gy3.C87412m.m108593f(r13, r3)
                r0.getClass()
                android.content.Intent r11 = new android.content.Intent
                r11.<init>()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r0.f40262r
                if (r3 == 0) goto L_0x0059
                r6 = 0
                r7 = 4
                r8 = 0
                r4 = r11
                r5 = r2
                com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(r3, r4, r5, r6, r7, r8)
            L_0x0059:
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r3 = r0.f40262r
                if (r3 == 0) goto L_0x0074
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r5 = r3.getDataListJustForAdapter()
                if (r5 == 0) goto L_0x0074
                er1.w3 r3 = er1.C58784w3.f168295a
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r0.f40262r
                pe3.b r6 = r4.getLastBuffer()
                r8 = 0
                r9 = 16
                r10 = 0
                r4 = r2
                r7 = r11
                er1.C58784w3.m68427B1(r3, r4, r5, r6, r7, r8, r9, r10)
            L_0x0074:
                r2 = 1
                java.lang.String r3 = "KEY_FROM_SCENE"
                r11.putExtra(r3, r2)
                java.lang.String r3 = r0.f40263s
                java.lang.String r4 = "KEY_USERNAME"
                r11.putExtra(r4, r3)
                boolean r3 = r0.f40264t
                java.lang.String r4 = "KEY_FINDER_SELF_FLAG"
                r11.putExtra(r4, r3)
                boolean r0 = r0.f40264t
                java.lang.String r3 = "key_from_page"
                if (r0 == 0) goto L_0x0099
                java.lang.String r0 = "force_show_ad_tip"
                r11.putExtra(r0, r2)
                r0 = 108(0x6c, float:1.51E-43)
                r11.putExtra(r3, r0)
                goto L_0x009e
            L_0x0099:
                r0 = 100
                r11.putExtra(r3, r0)
            L_0x009e:
                android.content.res.Resources r0 = r1.getResources()
                r3 = 2131826201(0x7f111619, float:1.928528E38)
                java.lang.String r0 = r0.getString(r3)
                java.lang.String r3 = "KEY_TITLE"
                r11.putExtra(r3, r0)
                rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                r0.mo12871c(r1, r11)
                java.lang.Class<er1.b> r0 = er1.C58684b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                er1.b r0 = (er1.C58684b) r0
                r0.wx0(r1, r11)
                java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                dp1.y0 r0 = (dp1.C58417y0) r0
                long r3 = r13.getItemId()
                r0.Bx0(r3, r2)
                java.lang.String r13 = "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert$onCreateViewHolder$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r12, r13, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve1.C14524f7.C14525a.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14524f7(BaseFinderFeedLoader baseFinderFeedLoader, String str, boolean z, boolean z2, int i, C8480h hVar) {
        super(C0966R.C0971layout.acw, (C7461a) null, 0, (C32229r) null, (C32224a) null, 30, (C8480h) null);
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        C87412m.m108594g(str, "username");
        this.f40262r = baseFinderFeedLoader;
        this.f40263s = str;
        this.f40264t = z;
        this.f40265u = z2;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setOnClickListener(new C14525a(oVar, this, recyclerView));
        ((ImageView) oVar.f44854d.findViewById(C0966R.C0970id.a2q)).setEnabled(false);
    }

    /* renamed from: l */
    public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        String str;
        String description;
        C60905o oVar2 = oVar;
        C11978e0.C11979a aVar = C11978e0.C11979a.COMMON;
        C27696y yVar = C27696y.THUMB_IMAGE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d_d);
        if (rq22.f185268f == 4) {
            C62344b0 b0Var = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C87412m.m108593f(imageView, "imageView");
            f2.mo85957c(b0Var, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        } else {
            C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C62344b0 b0Var2 = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
            C87412m.m108593f(imageView, "imageView");
            f25.mo85957c(b0Var2, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        }
        if (!this.f40265u || baseFinderFeed.mo3513o().getLikeCount() <= 0) {
            View D = oVar2.mo85812D(C0966R.C0970id.fay);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view = D;
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View D2 = oVar2.mo85812D(C0966R.C0970id.fay);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view2 = D2;
            C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderProfileGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((TextView) oVar2.mo85812D(C0966R.C0970id.faz)).setText(C7878t0.m8034c(2, baseFinderFeed.mo3513o().getLikeCount()));
        }
        ((ImageView) oVar2.mo85812D(C0966R.C0970id.f37)).setVisibility(8);
        WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.a2q);
        Resources resources = oVar2.f173499A.getResources();
        Integer c0 = C58784w3.m68436c0(C58784w3.f168295a, 2, false, 2, (Object) null);
        weImageView.setImageDrawable(C87515a.m108835e(resources, c0 != null ? c0.intValue() : C0966R.raw.icon_filled_awesome, 0.0f));
        View D3 = oVar2.mo85812D(C0966R.C0970id.d_c);
        if (D3 != null) {
            FinderItem o = baseFinderFeed.mo3513o();
            String str2 = "";
            if (o == null || (str = o.getNickName()) == null) {
                str = str2;
            }
            D3.setTag(C0966R.C0970id.d58, str);
            FinderItem o2 = baseFinderFeed.mo3513o();
            if (!(o2 == null || (description = o2.getDescription()) == null)) {
                str2 = description;
            }
            D3.setTag(C0966R.C0970id.d3o, str2);
        }
    }
}
