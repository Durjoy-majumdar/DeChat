package com.tencent.p014mm.plugin.finder.view.snscover;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverFadeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.ConvertUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import di3.C86312j;
import em1.C58636b;
import em1.C97671a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.util.LinkedList;
import k60.C60979d;
import kotlin.Metadata;
import ks1.C61150a;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import oj3.C62036a;
import oj3.C62040b;
import org.json.JSONObject;
import p166hy.C60227q0;
import p166hy.C98562i0;
import p166hy.C98563j0;
import p166hy.C98564l0;
import p166hy.C98567o0;
import p185kq.C10383h;
import p206nj.C100115c;
import p206nj.C100118d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62372x;
import pr2.C100843b;
import pr2.C100844c;
import pr2.C100845d;
import pr2.C100846e;
import pr2.C100848g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64689rq2;
import te3.C64726td1;
import te3.C64770ve1;
import up1.C27696y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0015\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J\u0006\u0010 \u001a\u00020\u0006J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u0006H\u0016J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\u0010\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016J\u0012\u0010-\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010/\u001a\u00020.8\u0002XD¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R#\u00109\u001a\n 4*\u0004\u0018\u000103038BX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R#\u0010>\u001a\n 4*\u0004\u0018\u00010:0:8BX\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010?R#\u0010D\u001a\n 4*\u0004\u0018\u00010@0@8BX\u0002¢\u0006\f\n\u0004\bA\u00106\u001a\u0004\bB\u0010CR#\u0010I\u001a\n 4*\u0004\u0018\u00010E0E8BX\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010HR#\u0010L\u001a\n 4*\u0004\u0018\u00010E0E8BX\u0002¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\bK\u0010HR#\u0010Q\u001a\n 4*\u0004\u0018\u00010M0M8BX\u0002¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bO\u0010PR#\u0010V\u001a\n 4*\u0004\u0018\u00010R0R8BX\u0002¢\u0006\f\n\u0004\bS\u00106\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/snscover/SnsFinderImageBackView;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lpr2/b;", "Lnj/c$a;", "Lpr2/d;", "coverInfo", "Lrx3/b0;", "loadLocalThumb", "", "coverInfoValid", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "finderObject", "initDetailAndPlay", "setupBannerInfo", "Lem1/b;", "recreateMusicPlayer", "resetBanner", "Lte3/td1;", "getMusicInfo", "needPlay", "updateFinderObject", "isNeedMute", "play", "pause", "isTimelineUI", "enablePlay", "", "focusChange", "onChange", "Lpr2/c;", "snsCoverInfo", "loadCover", "initBanner", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "Lpr2/g;", "snsCoverStatusProvider", "setCoverFoldStatusProvider", "loadFinderObject", "", "TAG", "Ljava/lang/String;", "musicPlayer", "Lem1/b;", "Lcom/tencent/mm/plugin/finder/view/snscover/SnsFinderImageBanner;", "kotlin.jvm.PlatformType", "banner$delegate", "Lrx3/g;", "getBanner", "()Lcom/tencent/mm/plugin/finder/view/snscover/SnsFinderImageBanner;", "banner", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView$delegate", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Lpr2/g;", "Landroid/widget/ImageView;", "avatarView$delegate", "getAvatarView", "()Landroid/widget/ImageView;", "avatarView", "Landroid/widget/TextView;", "authorNameView$delegate", "getAuthorNameView", "()Landroid/widget/TextView;", "authorNameView", "finderDesc$delegate", "getFinderDesc", "finderDesc", "Landroid/widget/FrameLayout;", "jumpFinderView$delegate", "getJumpFinderView", "()Landroid/widget/FrameLayout;", "jumpFinderView", "Landroid/widget/LinearLayout;", "avatarFl$delegate", "getAvatarFl", "()Landroid/widget/LinearLayout;", "avatarFl", "Lnj/d;", "audioHelper", "Lnj/d;", "Lks1/a;", "finderDetailLoader", "Lks1/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView */
public final class SnsFinderImageBackView extends AbsSnsBackPreview implements C100843b, C100115c.C100116a {
    /* access modifiers changed from: private */
    public final String TAG = "SnsFinder.ImageView";
    private final C100118d audioHelper;
    private final C13601g authorNameView$delegate = C36568h.m40985a(new C93787a(this));
    private final C13601g avatarFl$delegate = C36568h.m40985a(new C93788b(this));
    private final C13601g avatarView$delegate = C36568h.m40985a(new C93789c(this));
    private final C13601g banner$delegate = C36568h.m40985a(new C93790d(this));
    private final C13601g finderDesc$delegate = C36568h.m40985a(new C93791e(this));
    /* access modifiers changed from: private */
    public final C61150a finderDetailLoader;
    private final C13601g jumpFinderView$delegate = C36568h.m40985a(new C93793h(this));
    private C58636b musicPlayer;
    private C100848g snsCoverStatusProvider;
    private final C13601g thumbView$delegate = C36568h.m40985a(new C93795j(this));

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$f */
    public static final class C56651f extends C62036a<C64689rq2, View> {

        /* renamed from: g */
        public final /* synthetic */ SnsFinderImageBackView f162389g;

        /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$f$a */
        public static final class C56652a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C64689rq2 f162390d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f162391e;

            public C56652a(C64689rq2 rq22, ImageView imageView) {
                this.f162390d = rq22;
                this.f162391e = imageView;
            }

            public final void run() {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C64689rq2 rq22 = this.f162390d;
                C87412m.m108593f(rq22, "item");
                C99344b<C100810g0, Bitmap> b = f2.mo85956b(new C62372x(rq22, C27696y.RAW_IMAGE, (String) null, 4, (C8480h) null), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                ImageView imageView = this.f162391e;
                C87412m.m108593f(imageView, "imageView");
                ((C99342a) b).mo85954d(imageView);
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$f$b */
        public static final class C56653b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C64689rq2 f162392d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f162393e;

            /* renamed from: f */
            public final /* synthetic */ SnsFinderImageBackView f162394f;

            public C56653b(C64689rq2 rq22, ImageView imageView, SnsFinderImageBackView snsFinderImageBackView) {
                this.f162392d = rq22;
                this.f162393e = imageView;
                this.f162394f = snsFinderImageBackView;
            }

            public final void run() {
                Class cls = C11990s0.class;
                Class<C60200t1> cls2 = C60200t1.class;
                C60979d<C100810g0> C = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11863C();
                C64689rq2 rq22 = this.f162392d;
                C87412m.m108593f(rq22, "item");
                C99344b<C100810g0, Bitmap> b = C.mo85956b(new C62372x(rq22, C27696y.THUMB_IMAGE, (String) null, 4, (C8480h) null), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
                ImageView imageView = this.f162393e;
                C87412m.m108593f(imageView, "bgView");
                ((C99342a) b).mo85954d(imageView);
                this.f162394f.getThumbView().setVisibility(8);
            }
        }

        public C56651f(SnsFinderImageBackView snsFinderImageBackView) {
            this.f162389g = snsFinderImageBackView;
        }

        /* renamed from: G4 */
        public void onBindViewHolder(C62040b bVar, int i) {
            C87412m.m108594g(bVar, "holder");
            super.onBindViewHolder(bVar, i);
            C64689rq2 rq22 = (C64689rq2) mo86983F4(i);
            ImageView imageView = (ImageView) bVar.f44854d.findViewById(C0966R.C0970id.icl);
            ImageView imageView2 = (ImageView) bVar.f44854d.findViewById(C0966R.C0970id.a8i);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bVar.f173499A.getResources().getDisplayMetrics().widthPixels, -2);
            layoutParams.gravity = 17;
            imageView.setLayoutParams(layoutParams);
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            imageView.post(new C56652a(rq22, imageView));
            imageView2.post(new C56653b(rq22, imageView2, this.f162389g));
        }

        /* renamed from: g5 */
        public View mo13137g5(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.c2p, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…mage_item, parent, false)");
            return inflate;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$a */
    public static final class C93787a extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93787a(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270716d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (TextView) this.f270716d.findViewById(C0966R.C0970id.a0u);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$b */
    public static final class C93788b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93788b(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270717d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (LinearLayout) this.f270717d.findViewById(C0966R.C0970id.az_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$c */
    public static final class C93789c extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93789c(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270718d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (ImageView) this.f270718d.findViewById(C0966R.C0970id.a0r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$d */
    public static final class C93790d extends C87413o implements C32224a<SnsFinderImageBanner> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93790d(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270719d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (SnsFinderImageBanner) this.f270719d.findViewById(C0966R.C0970id.jsk);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$e */
    public static final class C93791e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93791e(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270720d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (TextView) this.f270720d.findViewById(C0966R.C0970id.jt8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$g */
    public static final class C93792g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270721d;

        /* renamed from: e */
        public final /* synthetic */ FinderObject f270722e;

        public C93792g(SnsFinderImageBackView snsFinderImageBackView, FinderObject finderObject) {
            this.f270721d = snsFinderImageBackView;
            this.f270722e = finderObject;
        }

        public final void run() {
            this.f270721d.finderDetailLoader.mo86091a(this.f270722e);
            this.f270721d.setupBannerInfo(this.f270722e);
            if (this.f270721d.enablePlay()) {
                this.f270721d.play();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$h */
    public static final class C93793h extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93793h(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270723d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (FrameLayout) this.f270723d.findViewById(C0966R.C0970id.fev);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$i */
    public static final class C93794i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270724d;

        /* renamed from: e */
        public final /* synthetic */ FinderObject f270725e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93794i(SnsFinderImageBackView snsFinderImageBackView, FinderObject finderObject) {
            super(0);
            this.f270724d = snsFinderImageBackView;
            this.f270725e = finderObject;
        }

        public Object invoke() {
            this.f270724d.resetBanner(this.f270725e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$j */
    public static final class C93795j extends C87413o implements C32224a<SnsCoverFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderImageBackView f270726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93795j(SnsFinderImageBackView snsFinderImageBackView) {
            super(0);
            this.f270726d = snsFinderImageBackView;
        }

        public Object invoke() {
            return (SnsCoverFadeImageView) this.f270726d.findViewById(C0966R.C0970id.d_p);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView$k */
    public static final class C93796k implements C60200t1.C60202b {

        /* renamed from: a */
        public final /* synthetic */ SnsFinderImageBackView f270727a;

        /* renamed from: b */
        public final /* synthetic */ C100845d f270728b;

        /* renamed from: c */
        public final /* synthetic */ boolean f270729c;

        public C93796k(SnsFinderImageBackView snsFinderImageBackView, C100845d dVar, boolean z) {
            this.f270727a = snsFinderImageBackView;
            this.f270728b = dVar;
            this.f270729c = z;
        }

        /* renamed from: a */
        public final void mo75691a(Object obj, int i, int i2) {
            Class cls = C98567o0.class;
            Class cls2 = C98562i0.class;
            String access$getTAG$p = this.f270727a.TAG;
            Log.m105924i(access$getTAG$p, "updateFinderObject errType" + i + " errCode:" + i2);
            if (obj instanceof FinderObject) {
                C98564l0 Z0 = ((C98567o0) C86312j.m106911c(cls)).mo137591Z0();
                String userName = this.f270728b.getUserName();
                C87412m.m108593f(userName, "coverInfo.userName");
                Long u = this.f270728b.mo139906u();
                C87412m.m108593f(u, "coverInfo.snsObjId");
                FinderObject finderObject = (FinderObject) obj;
                Z0.mo137940E0(userName, u.longValue(), finderObject);
                if (this.f270729c) {
                    this.f270727a.initDetailAndPlay(finderObject);
                }
            } else if ((((C98562i0) C86312j.m106911c(cls2)).Sc0() && i == 4) || !((C98562i0) C86312j.m106911c(cls2)).Sc0()) {
                Log.m105924i(this.f270727a.TAG, "updateFinderObject to block");
                C98564l0 Z02 = ((C98567o0) C86312j.m106911c(cls)).mo137591Z0();
                String userName2 = this.f270728b.getUserName();
                C87412m.m108593f(userName2, "coverInfo.userName");
                Z02.mo137939D5(userName2);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsFinderImageBackView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C100118d dVar = new C100118d(context);
        this.audioHelper = dVar;
        ImageView avatarView = getAvatarView();
        C87412m.m108593f(avatarView, "avatarView");
        TextView authorNameView = getAuthorNameView();
        C87412m.m108593f(authorNameView, "authorNameView");
        TextView finderDesc = getFinderDesc();
        C87412m.m108593f(finderDesc, "finderDesc");
        LinearLayout avatarFl = getAvatarFl();
        C87412m.m108593f(avatarFl, "avatarFl");
        FrameLayout jumpFinderView = getJumpFinderView();
        C87412m.m108593f(jumpFinderView, "jumpFinderView");
        this.finderDetailLoader = new C61150a(avatarView, authorNameView, finderDesc, avatarFl, jumpFinderView);
        dVar.f293271c = this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = r2.media;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean coverInfoValid(pr2.C100845d r2) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x0018
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r2.getFinderObject()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x0014
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x0014
            int r2 = r2.size()
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 <= 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderImageBackView.coverInfoValid(pr2.d):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean enablePlay() {
        C100848g gVar = this.snsCoverStatusProvider;
        return gVar == null || !gVar.getStatus().f295360a || !isTimelineUI();
    }

    private final TextView getAuthorNameView() {
        return (TextView) this.authorNameView$delegate.getValue();
    }

    private final LinearLayout getAvatarFl() {
        return (LinearLayout) this.avatarFl$delegate.getValue();
    }

    private final ImageView getAvatarView() {
        return (ImageView) this.avatarView$delegate.getValue();
    }

    private final SnsFinderImageBanner getBanner() {
        return (SnsFinderImageBanner) this.banner$delegate.getValue();
    }

    private final TextView getFinderDesc() {
        return (TextView) this.finderDesc$delegate.getValue();
    }

    private final FrameLayout getJumpFinderView() {
        return (FrameLayout) this.jumpFinderView$delegate.getValue();
    }

    private final C64726td1 getMusicInfo(FinderObject finderObject) {
        C64770ve1 ve12;
        FinderObjectDesc finderObjectDesc = FinderItem.Companion.mo79056a(finderObject, finderObject.objectType).getFeedObject().objectDesc;
        if (finderObjectDesc == null || (ve12 = finderObjectDesc.feedBgmInfo) == null) {
            return null;
        }
        return ve12.f185873d;
    }

    /* access modifiers changed from: private */
    public final SnsCoverFadeImageView getThumbView() {
        return (SnsCoverFadeImageView) this.thumbView$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void initDetailAndPlay(FinderObject finderObject) {
        ((C119157j) C119157j.f356862d).mo183895z(new C93792g(this, finderObject));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.getStatus();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isNeedMute() {
        /*
            r3 = this;
            pr2.g r0 = r3.snsCoverStatusProvider
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            pr2.f r0 = r0.getStatus()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f295360a
            if (r0 != r1) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0027
            boolean r0 = p182kk.C61104a.m71668x()
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r3.getContext()
            boolean r0 = p182kk.C61104a.m71642B(r0, r2)
            if (r0 == 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderImageBackView.isNeedMute():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getStatus();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isTimelineUI() {
        /*
            r2 = this;
            pr2.g r0 = r2.snsCoverStatusProvider
            r1 = 0
            if (r0 == 0) goto L_0x0010
            pr2.f r0 = r0.getStatus()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f295361b
            if (r0 != 0) goto L_0x0010
            r1 = 1
        L_0x0010:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderImageBackView.isTimelineUI():boolean");
    }

    private final void loadLocalThumb(C100845d dVar) {
        SnsCoverFadeImageView thumbView = getThumbView();
        C87412m.m108593f(thumbView, "thumbView");
        String userName = dVar.getUserName();
        C87412m.m108593f(userName, "coverInfo.userName");
        Long u = dVar.mo139906u();
        C87412m.m108593f(u, "coverInfo.snsObjId");
        long longValue = u.longValue();
        String b = dVar.mo139899b();
        int i = SnsCoverFadeImageView.f274653g;
        C98563j0 j0Var = thumbView.f274654f;
        if (j0Var != null) {
            j0Var.mo137936d(userName, longValue, b, false);
        }
        getThumbView().setVisibility(0);
    }

    private final void pause() {
        Log.m105924i(this.TAG, "pause");
        C58636b bVar = this.musicPlayer;
        if (bVar != null) {
            bVar.pause();
        }
        getBanner().setAutoPlay(false);
        this.audioHelper.mo139416a();
    }

    /* access modifiers changed from: private */
    public final void play() {
        Log.m105924i(this.TAG, AssetExtension.SCENE_PLAY);
        getBanner().setAutoPlay(true);
        if (!isNeedMute()) {
            this.audioHelper.mo139417b();
            C58636b bVar = this.musicPlayer;
            if (bVar != null) {
                bVar.play();
            }
        }
    }

    private final C58636b recreateMusicPlayer(FinderObject finderObject) {
        C64726td1 musicInfo = getMusicInfo(finderObject);
        if (musicInfo == null) {
            return null;
        }
        String str = musicInfo.f185539i;
        if (!(!(str == null || str.length() == 0))) {
            musicInfo = null;
        }
        if (musicInfo == null) {
            return null;
        }
        Context context = getContext();
        C87412m.m108593f(context, "context");
        return new C97671a(context, musicInfo);
    }

    /* access modifiers changed from: private */
    public final void resetBanner(FinderObject finderObject) {
        LinkedList<C64689rq2> mediaList;
        RecyclerView.C16613e<C62040b> adapter = getBanner().getAdapter();
        C62036a aVar = adapter instanceof C62036a ? (C62036a) adapter : null;
        if (aVar != null && (mediaList = FinderItem.Companion.mo79056a(finderObject, finderObject.objectType).getMediaList()) != null) {
            aVar.f176359d = mediaList;
            aVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    public final void setupBannerInfo(FinderObject finderObject) {
        C58636b bVar = this.musicPlayer;
        if (bVar != null) {
            if (bVar != null) {
                bVar.release();
            }
            resetBanner(finderObject);
        }
        this.musicPlayer = recreateMusicPlayer(finderObject);
        initBanner();
        C61926c.m72677b(this, new C93794i(this, finderObject));
    }

    private final void updateFinderObject(C100845d dVar, boolean z) {
        FinderObject Li;
        if (!z) {
            Long O0 = dVar.mo139898O0();
            C87412m.m108593f(O0, "coverInfo.lastFinderCheckTimeMs");
            if (!((C98562i0) C86312j.m106911c(C98562i0.class)).mo58707rB(O0.longValue())) {
                return;
            }
        }
        FinderObject finderObject = dVar.getFinderObject();
        if (finderObject != null && (Li = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76777Li(finderObject.f164794id, finderObject.objectNonceId, 123, true, false, "", new C93796k(this, dVar, z))) != null) {
            C98564l0 Z0 = ((C98567o0) C86312j.m106911c(C98567o0.class)).mo137591Z0();
            String userName = dVar.getUserName();
            C87412m.m108593f(userName, "coverInfo.userName");
            Long u = dVar.mo139906u();
            C87412m.m108593f(u, "coverInfo.snsObjId");
            Z0.mo137940E0(userName, u.longValue(), Li);
            if (z) {
                initDetailAndPlay(Li);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c2q;
    }

    public int getType() {
        return 4;
    }

    public final void initBanner() {
        getBanner().getRecyclerView().setHasFixedSize(false);
        getBanner().setAdapter(new C56651f(this));
        getBanner().setAutoPlay(false);
    }

    public void loadCover(C100844c cVar) {
        C100846e snsCoverReporter;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.cover.api.ISnsCoverInfoExt");
        C100845d dVar = (C100845d) cVar;
        String str = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("finder obj id:");
        FinderObject finderObject = dVar.getFinderObject();
        sb.append(finderObject != null ? Long.valueOf(finderObject.f164794id) : null);
        Log.m105924i(str, sb.toString());
        loadLocalThumb(dVar);
        boolean coverInfoValid = coverInfoValid(dVar);
        if (coverInfoValid) {
            FinderObject finderObject2 = dVar.getFinderObject();
            C87412m.m108593f(finderObject2, "it.finderObject");
            initDetailAndPlay(finderObject2);
        }
        updateFinderObject(dVar, !coverInfoValid);
        JSONObject jSONObject = new JSONObject();
        Long u = dVar.mo139906u();
        C87412m.m108593f(u, "coverInfo.snsObjId");
        jSONObject.put("snsid", u.longValue());
        jSONObject.put("url", dVar.mo139900c());
        FinderObject finderObject3 = dVar.getFinderObject();
        long j = 0;
        jSONObject.put("finderid", ConvertUtils.longToString(finderObject3 != null ? finderObject3.f164794id : 0));
        C100848g gVar = this.snsCoverStatusProvider;
        if (!(gVar == null || (snsCoverReporter = gVar.getSnsCoverReporter()) == null)) {
            snsCoverReporter.mo140314a(jSONObject.toString());
        }
        C60227q0 q0Var = (C60227q0) C86312j.m106911c(C60227q0.class);
        C10383h hVar = (C10383h) C86312j.m106911c(C10383h.class);
        FinderObject finderObject4 = dVar.getFinderObject();
        if (finderObject4 != null) {
            j = finderObject4.f164794id;
        }
        q0Var.Al0(hVar.mo10700XQ(j));
    }

    public void loadFinderObject(FinderObject finderObject) {
        if (finderObject != null) {
            setupBannerInfo(finderObject);
            play();
        }
    }

    public void onChange(int i) {
        String str = this.TAG;
        Log.m105924i(str, "focusChange " + i);
        if (i == -1) {
            pause();
        }
    }

    public void onDestroy() {
        Log.m105924i(this.TAG, "[onDestroy]");
        C58636b bVar = this.musicPlayer;
        if (bVar != null) {
            bVar.release();
        }
        this.audioHelper.mo139416a();
        C100118d dVar = this.audioHelper;
        if (dVar.f293271c == this) {
            dVar.f293271c = null;
        }
    }

    public void onPause() {
        pause();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r0 = r0.getStatus();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostClose() {
        /*
            r2 = this;
            java.lang.String r0 = r2.TAG
            java.lang.String r1 = "[onPreClose]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            em1.b r0 = r2.musicPlayer
            if (r0 == 0) goto L_0x000e
            r0.pause()
        L_0x000e:
            pr2.g r0 = r2.snsCoverStatusProvider
            r1 = 0
            if (r0 == 0) goto L_0x001f
            pr2.f r0 = r0.getStatus()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.f295361b
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 == 0) goto L_0x0029
            com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBanner r0 = r2.getBanner()
            r0.setAutoPlay(r1)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderImageBackView.onPostClose():void");
    }

    public void onPostOpen() {
        Log.m105924i(this.TAG, "[onPostOpen]");
        play();
    }

    public void onPreClose() {
        Log.m105924i(this.TAG, "[onPreClose]");
        C61150a aVar = this.finderDetailLoader;
        aVar.f174088a.setVisibility(4);
        aVar.f174089b.setVisibility(4);
        aVar.f174090c.setVisibility(4);
        aVar.f174091d.setVisibility(4);
    }

    public void onPreOpen() {
        Log.m105924i(this.TAG, "[onPreOpen]");
        C61150a aVar = this.finderDetailLoader;
        aVar.f174088a.setVisibility(0);
        aVar.f174089b.setVisibility(0);
        aVar.f174090c.setVisibility(0);
        aVar.f174091d.setVisibility(0);
    }

    public void onResume() {
        if (!isTimelineUI() || (isTimelineUI() && enablePlay())) {
            play();
        }
    }

    public void setCoverFoldStatusProvider(C100848g gVar) {
        C87412m.m108594g(gVar, "snsCoverStatusProvider");
        super.setCoverFoldStatusProvider(gVar);
        this.snsCoverStatusProvider = gVar;
        getThumbView().setSnsCoverReporter(gVar.getSnsCoverReporter());
    }
}
