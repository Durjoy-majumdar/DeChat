package sr1;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32227p;
import gr1.C59667n2;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60159d2;
import ht1.C60162e2;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k60.C60979d;
import kf1.C9833k9;
import l60.C99342a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: sr1.b */
public class C64161b extends C60162e2.C60163a<C64162a> implements C60159d2 {

    /* renamed from: a */
    public final List<C64689rq2> f181878a;

    /* renamed from: b */
    public final boolean f181879b;

    /* renamed from: c */
    public C60159d2.C60160a f181880c;

    /* renamed from: sr1.b$a */
    public static final class C64162a extends C60162e2.C60164b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64162a(View view) {
            super(view);
            C87412m.m108594g(view, "view");
        }
    }

    /* renamed from: sr1.b$b */
    public static final class C64163b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60159d2.C60160a f181881d;

        /* renamed from: e */
        public final /* synthetic */ int f181882e;

        public C64163b(C60159d2.C60160a aVar, int i) {
            this.f181881d = aVar;
            this.f181882e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/adapter/FinderFeedAlbumAdapter$onBindView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60159d2.C60160a aVar = this.f181881d;
            int i = this.f181882e;
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            aVar.mo77197a(i, view);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/adapter/FinderFeedAlbumAdapter$onBindView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C64161b(List<? extends C64689rq2> list, boolean z) {
        C87412m.m108594g(list, "mediaList");
        this.f181878a = list;
        this.f181879b = z;
    }

    /* renamed from: a */
    public void mo85131a(C60159d2.C60160a aVar) {
        this.f181880c = aVar;
    }

    /* renamed from: b */
    public int mo85137b(int i) {
        if (i == 0) {
            return this.f181878a.get(i).f185268f;
        }
        return 2;
    }

    /* renamed from: c */
    public int mo85138c() {
        return this.f181878a.size();
    }

    /* renamed from: d */
    public void mo85139d(View view, int i, C60162e2.C60164b bVar) {
        LinkedList<BaseFinderFeed> linkedList;
        BaseFinderFeed first;
        FinderItem o;
        FinderVideoCore g;
        FinderVideoLayout finderVideoLayout;
        View view2 = view;
        int i2 = i;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(view2, "itemView");
        C87412m.m108594g(bVar, "holder");
        C64689rq2 rq22 = this.f181878a.get(i2);
        int b = mo85137b(i2);
        if (i2 == 0 && b == 4 && this.f181879b) {
            View findViewById = view2.findViewById(C0966R.C0970id.d7a);
            FinderVideoLayout finderVideoLayout2 = findViewById instanceof FinderVideoLayout ? (FinderVideoLayout) findViewById : null;
            C9833k9 f = mo77195f();
            if (f != null && (linkedList = f.f30389f) != null && (first = linkedList.getFirst()) != null && (o = first.mo3513o()) != null && (g = mo77196g()) != null) {
                if (finderVideoLayout2 != null) {
                    finderVideoLayout2.setVideoCore(g);
                }
                if (finderVideoLayout2 != null) {
                    FinderVideoLayout.m65083p(finderVideoLayout2, i, FeedData.Companion.mo78884b(o), (C59667n2) null, 0, false, (C32227p) null, (C32227p) null, false, false, 508, (Object) null);
                    finderVideoLayout = finderVideoLayout2;
                } else {
                    finderVideoLayout = finderVideoLayout2;
                }
                if (finderVideoLayout != null) {
                    finderVideoLayout.setMute(true);
                }
                if (finderVideoLayout != null) {
                    finderVideoLayout.setEnableShowLoading(false);
                }
            }
        } else {
            ImageView imageView = (ImageView) view2;
            String str = rq22.f185267e;
            if (str == null || str.length() == 0) {
                imageView.setImageDrawable(new ColorDrawable(imageView.getContext().getResources().getColor(C0966R.color.BW_93)));
            } else {
                C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C62344b0 b0Var = r5;
                C62344b0 b0Var2 = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
                ((C99342a) f2.mo85956b(b0Var, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE))).mo85954d(imageView);
            }
        }
        String str2 = rq22.f185267e;
        if (!(str2 == null || str2.length() == 0)) {
            C60159d2.C60160a aVar = this.f181880c;
            if (aVar != null) {
                view2.setOnClickListener(new C64163b(aVar, i2));
                return;
            }
            return;
        }
        view2.setOnClickListener((View.OnClickListener) null);
    }

    /* renamed from: e */
    public C60162e2.C60164b mo85140e(LayoutInflater layoutInflater, FrameLayout frameLayout, int i) {
        C87412m.m108594g(layoutInflater, "layoutInflater");
        C87412m.m108594g(frameLayout, "parent");
        Context context = frameLayout.getContext();
        int b = mo85137b(i);
        if (i == 0 && b == 4 && this.f181879b) {
            View inflate = C85868k2.m106137b(frameLayout.getContext()).inflate(C0966R.C0971layout.alk, frameLayout, false);
            C87412m.m108593f(inflate, "layout");
            return new C64162a(inflate);
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new C64162a(imageView);
    }

    /* renamed from: f */
    public C9833k9 mo77195f() {
        return null;
    }

    /* renamed from: g */
    public FinderVideoCore mo77196g() {
        return null;
    }
}
