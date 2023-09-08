package ve1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import dq1.C7461a;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import ps1.C12003a;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ve1.a7 */
public final class C14459a7 extends C14514f3 {

    /* renamed from: r */
    public final BaseFinderFeedLoader f40092r;

    /* renamed from: s */
    public final String f40093s;

    /* renamed from: t */
    public final boolean f40094t;

    /* renamed from: u */
    public final C12003a f40095u;

    /* renamed from: ve1.a7$a */
    public static final class C14460a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ BaseFinderFeed f40096d;

        /* renamed from: e */
        public final /* synthetic */ C14459a7 f40097e;

        /* renamed from: f */
        public final /* synthetic */ WeImageView f40098f;

        /* renamed from: g */
        public final /* synthetic */ View f40099g;

        public C14460a(BaseFinderFeed baseFinderFeed, C14459a7 a7Var, WeImageView weImageView, View view) {
            this.f40096d = baseFinderFeed;
            this.f40097e = a7Var;
            this.f40098f = weImageView;
            this.f40099g = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f40096d.mo3513o().getMentionListSelected() == 3) {
                this.f40097e.mo13728n(true, this.f40098f, this.f40099g);
                this.f40096d.mo3513o().setMentionListSelected(2);
            } else {
                this.f40097e.mo13728n(false, this.f40098f, this.f40099g);
                this.f40096d.mo3513o().setMentionListSelected(3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.a7$b */
    public static final class C14461b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14459a7 f40100d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f40101e;

        /* renamed from: f */
        public final /* synthetic */ BaseFinderFeed f40102f;

        public C14461b(C14459a7 a7Var, C60905o oVar, BaseFinderFeed baseFinderFeed) {
            this.f40100d = a7Var;
            this.f40101e = oVar;
            this.f40102f = baseFinderFeed;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x002c, code lost:
            r1 = r1.getDataListJustForAdapter();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r10)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert$onBindViewHolder$3$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                ve1.a7 r10 = r9.f40100d
                jq3.o r0 = r9.f40101e
                android.content.Context r0 = r0.f173499A
                java.lang.String r1 = "holder.context"
                gy3.C87412m.m108593f(r0, r1)
                ve1.a7 r1 = r9.f40100d
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r1 = r1.f40092r
                if (r1 == 0) goto L_0x003a
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r1 = r1.getDataListJustForAdapter()
                if (r1 == 0) goto L_0x003a
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r9.f40102f
                int r1 = r1.indexOf(r2)
                r4 = r1
                goto L_0x003c
            L_0x003a:
                r1 = 0
                r4 = 0
            L_0x003c:
                com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r9.f40102f
                r10.getClass()
                android.content.Intent r8 = new android.content.Intent
                r8.<init>()
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r2 = r10.f40092r
                if (r2 == 0) goto L_0x0051
                r5 = 0
                r6 = 4
                r7 = 0
                r3 = r8
                com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(r2, r3, r4, r5, r6, r7)
            L_0x0051:
                r2 = 1
                java.lang.String r3 = "KEY_FROM_SCENE"
                r8.putExtra(r3, r2)
                java.lang.String r3 = r10.f40093s
                java.lang.String r4 = "KEY_USERNAME"
                r8.putExtra(r4, r3)
                boolean r10 = r10.f40094t
                java.lang.String r3 = "KEY_FINDER_SELF_FLAG"
                r8.putExtra(r3, r10)
                android.content.res.Resources r10 = r0.getResources()
                r3 = 2131826201(0x7f111619, float:1.928528E38)
                java.lang.String r10 = r10.getString(r3)
                java.lang.String r3 = "KEY_TITLE"
                r8.putExtra(r3, r10)
                java.lang.String r10 = "force_show_ad_tip"
                r8.putExtra(r10, r2)
                r10 = 200(0xc8, float:2.8E-43)
                java.lang.String r3 = "key_from_page"
                r8.putExtra(r3, r10)
                rs1.s8$a r10 = rs1.C13442s8.f38060Q0
                r10.mo12871c(r0, r8)
                java.lang.Class<er1.b> r10 = er1.C58684b.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                er1.b r10 = (er1.C58684b) r10
                r10.wx0(r0, r8)
                java.lang.Class<dp1.y0> r10 = dp1.C58417y0.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                dp1.y0 r10 = (dp1.C58417y0) r10
                long r0 = r1.getItemId()
                r10.Bx0(r0, r2)
                java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert$onBindViewHolder$3$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r9, r10, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ve1.C14459a7.C14461b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14459a7(BaseFinderFeedLoader baseFinderFeedLoader, String str, boolean z, C12003a aVar) {
        super(C0966R.C0971layout.acv, (C7461a) null, 0, (C32229r) null, (C32224a) null, 30, (C8480h) null);
        C87412m.m108594g(str, "username");
        C87412m.m108594g(aVar, "atFeedState");
        this.f40092r = baseFinderFeedLoader;
        this.f40093s = str;
        this.f40094t = z;
        this.f40095u = aVar;
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: l */
    public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        String str;
        String description;
        Integer num;
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C11978e0.C11979a aVar = C11978e0.C11979a.TIMELINE;
        C27696y yVar = C27696y.THUMB_IMAGE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed2, "item");
        View findViewById = oVar2.f44854d.findViewById(C0966R.C0970id.d__);
        WeImageView weImageView = (WeImageView) oVar2.f44854d.findViewById(C0966R.C0970id.d_a);
        View findViewById2 = oVar2.f44854d.findViewById(C0966R.C0970id.d_b);
        View findViewById3 = oVar2.f44854d.findViewById(C0966R.C0970id.f37);
        Log.m105924i("Finder.ProfileAtGridConvert", "onBindViewHolder  " + baseFinderFeed.mo3513o().getMentionListSelected());
        if (!(list == null || list.isEmpty())) {
            for (T next : list) {
                if ((next instanceof C13604l) && ((Number) ((C13604l) next).f38555d).intValue() == 23) {
                    if (this.f40095u.f35000a) {
                        return;
                    }
                    if (baseFinderFeed.mo3513o().getMentionListSelected() == 2) {
                        if (findViewById3 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view = findViewById3;
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    } else if (findViewById3 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view2 = findViewById3;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f40095u.f35000a) {
            if (findViewById != null) {
                findViewById.setOnClickListener(new C14460a(baseFinderFeed2, this, weImageView, findViewById2));
                if (findViewById2 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view3 = findViewById2;
                    C117292a.m165358d(view3, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                mo13728n(baseFinderFeed.mo3513o().getMentionListSelected() == 2, weImageView, findViewById2);
            }
            if (findViewById3 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view4 = findViewById3;
                C117292a.m165358d(view4, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (findViewById2 == null) {
                num = 0;
            } else {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar6.mo10233c(8);
                View view5 = findViewById2;
                num = 0;
                C117292a.m165358d(view5, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById != null) {
                findViewById.setOnClickListener(new C14461b(this, oVar2, baseFinderFeed2));
            }
            if (baseFinderFeed.mo3513o().getMentionListSelected() == 2) {
                if (findViewById3 != null) {
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar7.mo10233c(num);
                    View view6 = findViewById3;
                    C117292a.m165358d(view6, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (findViewById3 != null) {
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                aVar8.mo10233c(8);
                View view7 = findViewById3;
                C117292a.m165358d(view7, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/convert/FinderProfileAtGridConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d_8);
        if (rq22.f185268f == 4) {
            C62344b0 b0Var = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C87412m.m108593f(imageView, "imageView");
            f2.mo85957c(b0Var, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        } else {
            C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C62344b0 b0Var2 = r4;
            C62344b0 b0Var3 = new C62344b0(rq22, yVar, (String) null, (String) null, 12, (C8480h) null);
            C87412m.m108593f(imageView, "imageView");
            f25.mo85957c(b0Var2, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        }
        View D = oVar2.mo85812D(C0966R.C0970id.d__);
        if (D != null) {
            FinderItem o = baseFinderFeed.mo3513o();
            String str2 = "";
            if (o == null || (str = o.getNickName()) == null) {
                str = str2;
            }
            D.setTag(C0966R.C0970id.d58, str);
            FinderItem o2 = baseFinderFeed.mo3513o();
            if (!(o2 == null || (description = o2.getDescription()) == null)) {
                str2 = description;
            }
            D.setTag(C0966R.C0970id.d3o, str2);
        }
    }

    /* renamed from: n */
    public final void mo13728n(boolean z, WeImageView weImageView, View view) {
        if (weImageView == null) {
            return;
        }
        if (z) {
            weImageView.setImageResource(C0966R.raw.icons_outlined_done);
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.f5045v2);
                return;
            }
            return;
        }
        weImageView.setImageDrawable((Drawable) null);
        if (view != null) {
            view.setBackgroundResource(C0966R.C0969drawable.f5046v3);
        }
    }
}
