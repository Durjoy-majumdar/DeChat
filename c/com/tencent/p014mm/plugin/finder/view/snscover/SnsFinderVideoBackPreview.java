package com.tencent.p014mm.plugin.finder.view.snscover;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import co1.C55041a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverFadeImageView;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverNoFadeImageView;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.ConvertUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d03.C58010a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j03.C60695a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import ks1.C61150a;
import l60.C99344b;
import o40.C61926c;
import p166hy.C60227q0;
import p166hy.C98562i0;
import p166hy.C98563j0;
import p166hy.C98564l0;
import p166hy.C98567o0;
import p182kk.C61104a;
import p185kq.C10383h;
import p206nj.C100115c;
import p206nj.C100118d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import pl1.C62367r0;
import pl1.C62372x;
import pr2.C100843b;
import pr2.C100844c;
import pr2.C100845d;
import pr2.C100846e;
import pr2.C100848g;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import t60.C64207e;
import te3.C64689rq2;
import up1.C27696y;
import x60.C102564a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001hB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\bf\u0010gJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\b\u0010\u001f\u001a\u00020\fH\u0002J\u0010\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016J\u0012\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010'\u001a\u00020\fH\u0016J\b\u0010(\u001a\u00020\fH\u0016J\b\u0010)\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\"H\u0016J\b\u0010,\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020\fH\u0016J\b\u0010.\u001a\u00020\fH\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u0010\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0016J\u0012\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u00106\u001a\u0002058\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R#\u0010@\u001a\n ;*\u0004\u0018\u00010:0:8BX\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R#\u0010E\u001a\n ;*\u0004\u0018\u00010A0A8BX\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR#\u0010J\u001a\n ;*\u0004\u0018\u00010F0F8BX\u0002¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010IR#\u0010O\u001a\n ;*\u0004\u0018\u00010K0K8BX\u0002¢\u0006\f\n\u0004\bL\u0010=\u001a\u0004\bM\u0010NR#\u0010R\u001a\n ;*\u0004\u0018\u00010K0K8BX\u0002¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010NR#\u0010W\u001a\n ;*\u0004\u0018\u00010S0S8BX\u0002¢\u0006\f\n\u0004\bT\u0010=\u001a\u0004\bU\u0010VR#\u0010\\\u001a\n ;*\u0004\u0018\u00010X0X8BX\u0002¢\u0006\f\n\u0004\bY\u0010=\u001a\u0004\bZ\u0010[R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010e¨\u0006i"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/snscover/SnsFinderVideoBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lpr2/b;", "Lnj/c$a;", "Lpr2/d;", "coverInfo", "", "coverInfoValid", "Landroid/content/Context;", "context", "Lcom/tencent/mm/protocal/protobuf/FinderObject;", "finder", "Lrx3/b0;", "loadDetailAndPlayVideo", "createFinderPlayView", "needPlay", "updateFinderObject", "Lpr2/c;", "loadLocalThumb", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTPEffectVideoLayout;", "createVideoLayout", "playVideo", "pauseVideo", "Lcom/tencent/mm/plugin/finder/storage/FeedData;", "finderItem", "Lpl1/b0;", "createThumbInfo", "Ld03/a;", "createTPMediaInfo", "enablePlay", "isTimelineUI", "updateVideoMute", "mute", "setMute", "", "focusChange", "onChange", "snsCoverInfo", "loadCover", "onPreOpen", "onPostOpen", "onPreClose", "onPostClose", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "Lpr2/g;", "snsCoverStatusProvider", "setCoverFoldStatusProvider", "finderObject", "loadFinderObject", "", "TAG", "Ljava/lang/String;", "playView", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTPEffectVideoLayout;", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Lrx3/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "foldThumbView$delegate", "getFoldThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "foldThumbView", "Landroid/widget/ImageView;", "avatarView$delegate", "getAvatarView", "()Landroid/widget/ImageView;", "avatarView", "Landroid/widget/TextView;", "authorNameView$delegate", "getAuthorNameView", "()Landroid/widget/TextView;", "authorNameView", "finderDesc$delegate", "getFinderDesc", "finderDesc", "Landroid/widget/FrameLayout;", "jumpFinderViewFl$delegate", "getJumpFinderViewFl", "()Landroid/widget/FrameLayout;", "jumpFinderViewFl", "Landroid/widget/LinearLayout;", "avatarFl$delegate", "getAvatarFl", "()Landroid/widget/LinearLayout;", "avatarFl", "Lpr2/g;", "Lnj/d;", "audioHelper", "Lnj/d;", "isMute", "Z", "Lks1/a;", "finderDetailLoader", "Lks1/a;", "<init>", "(Landroid/content/Context;)V", "b", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview */
public final class SnsFinderVideoBackPreview extends AbsSnsBackPreview implements C100843b, C100115c.C100116a {
    /* access modifiers changed from: private */
    public final String TAG = ("Finder.SnsFinderVideoBackPreview[" + hashCode() + ']');
    private final C100118d audioHelper;
    private final C13601g authorNameView$delegate = C36568h.m40985a(new C93799c(this));
    private final C13601g avatarFl$delegate = C36568h.m40985a(new C93800d(this));
    private final C13601g avatarView$delegate = C36568h.m40985a(new C93801e(this));
    private final C13601g finderDesc$delegate = C36568h.m40985a(new C93805i(this));
    /* access modifiers changed from: private */
    public final C61150a finderDetailLoader;
    private final C13601g foldThumbView$delegate = C36568h.m40985a(new C93806j(this));
    private boolean isMute;
    private final C13601g jumpFinderViewFl$delegate = C36568h.m40985a(new C93807k(this));
    /* access modifiers changed from: private */
    public MMTPEffectVideoLayout playView;
    /* access modifiers changed from: private */
    public C100848g snsCoverStatusProvider;
    private final C13601g thumbView$delegate = C36568h.m40985a(new C93810n(this));

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$a */
    public static final class C93797a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93797a(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(1);
            this.f270730d = snsFinderVideoBackPreview;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C87412m.m108594g(bitmap, LocaleUtil.ITALIAN);
            this.f270730d.getFoldThumbView().setImageBitmap(bitmap);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$b */
    public static final class C93798b implements C60200t1.C60202b {

        /* renamed from: a */
        public final C100844c f270731a;

        /* renamed from: b */
        public final boolean f270732b;

        /* renamed from: c */
        public final String f270733c = "Finder.SnsFinderVideoBackPreviewGetFinderObjectCallback";

        /* renamed from: d */
        public final WeakReference<SnsFinderVideoBackPreview> f270734d;

        public C93798b(SnsFinderVideoBackPreview snsFinderVideoBackPreview, C100844c cVar, boolean z) {
            C87412m.m108594g(snsFinderVideoBackPreview, "ui");
            C87412m.m108594g(cVar, "coverInfo");
            this.f270731a = cVar;
            this.f270732b = z;
            this.f270734d = new WeakReference<>(snsFinderVideoBackPreview);
        }

        /* renamed from: a */
        public void mo75691a(Object obj, int i, int i2) {
            Class cls = C98567o0.class;
            Class cls2 = C98562i0.class;
            SnsFinderVideoBackPreview snsFinderVideoBackPreview = this.f270734d.get();
            if (snsFinderVideoBackPreview == null) {
                Log.m105924i(this.f270733c, "ui null!");
                return;
            }
            String access$getTAG$p = snsFinderVideoBackPreview.TAG;
            Log.m105924i(access$getTAG$p, "updateFinderObject errType" + i + " errCode:" + i2);
            if (obj instanceof FinderObject) {
                C98564l0 Z0 = ((C98567o0) C86312j.m106911c(cls)).mo137591Z0();
                String userName = this.f270731a.getUserName();
                C87412m.m108593f(userName, "coverInfo.userName");
                Long u = this.f270731a.mo139906u();
                C87412m.m108593f(u, "coverInfo.snsObjId");
                FinderObject finderObject = (FinderObject) obj;
                Z0.mo137940E0(userName, u.longValue(), finderObject);
                if (this.f270732b) {
                    Context context = snsFinderVideoBackPreview.getContext();
                    C87412m.m108593f(context, "ui.context");
                    snsFinderVideoBackPreview.loadDetailAndPlayVideo(context, finderObject);
                }
            } else if ((((C98562i0) C86312j.m106911c(cls2)).Sc0() && i == 4) || !((C98562i0) C86312j.m106911c(cls2)).Sc0()) {
                Log.m105924i(snsFinderVideoBackPreview.TAG, "updateFinderObject to block");
                C98564l0 Z02 = ((C98567o0) C86312j.m106911c(cls)).mo137591Z0();
                String userName2 = this.f270731a.getUserName();
                C87412m.m108593f(userName2, "coverInfo.userName");
                Z02.mo137939D5(userName2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$c */
    public static final class C93799c extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270735d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93799c(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270735d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (TextView) this.f270735d.findViewById(C0966R.C0970id.a0u);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$d */
    public static final class C93800d extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93800d(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270736d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (LinearLayout) this.f270736d.findViewById(C0966R.C0970id.az_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$e */
    public static final class C93801e extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270737d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93801e(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270737d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (ImageView) this.f270737d.findViewById(C0966R.C0970id.a0r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$f */
    public static final class C93802f<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ SnsFinderVideoBackPreview f270738a;

        public C93802f(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            this.f270738a = snsFinderVideoBackPreview;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            this.f270738a.getThumbView().post(new C93811a((Bitmap) obj, this.f270738a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$g */
    public static final class C93803g extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93803g(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(3);
            this.f270739d = snsFinderVideoBackPreview;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C100846e snsCoverReporter;
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            this.f270739d.getThumbView().setVisibility(8);
            C100848g access$getSnsCoverStatusProvider$p = this.f270739d.snsCoverStatusProvider;
            if (!(access$getSnsCoverStatusProvider$p == null || (snsCoverReporter = access$getSnsCoverStatusProvider$p.getSnsCoverReporter()) == null)) {
                snsCoverReporter.mo140317d();
            }
            Log.m105924i(this.f270739d.TAG, "onFrameAvailable");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$h */
    public static final class C93804h extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93804h(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(1);
            this.f270740d = snsFinderVideoBackPreview;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            this.f270740d.getThumbView().setVisibility(0);
            MMTPEffectVideoLayout access$getPlayView$p = this.f270740d.playView;
            if (access$getPlayView$p != null) {
                access$getPlayView$p.setOnFirstFrameAvailable(new C93813b(this.f270740d));
            }
            Log.m105924i(this.f270740d.TAG, "onSurfaceDestroyListener");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$i */
    public static final class C93805i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270741d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93805i(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270741d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (TextView) this.f270741d.findViewById(C0966R.C0970id.jt8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$j */
    public static final class C93806j extends C87413o implements C32224a<SnsCoverNoFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93806j(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270742d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (SnsCoverNoFadeImageView) this.f270742d.findViewById(C0966R.C0970id.e8m);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$k */
    public static final class C93807k extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270743d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93807k(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270743d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (FrameLayout) this.f270743d.findViewById(C0966R.C0970id.fev);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$l */
    public static final class C93808l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270744d;

        /* renamed from: e */
        public final /* synthetic */ FinderObject f270745e;

        /* renamed from: f */
        public final /* synthetic */ Context f270746f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93808l(SnsFinderVideoBackPreview snsFinderVideoBackPreview, FinderObject finderObject, Context context) {
            super(0);
            this.f270744d = snsFinderVideoBackPreview;
            this.f270745e = finderObject;
            this.f270746f = context;
        }

        public Object invoke() {
            this.f270744d.finderDetailLoader.mo86091a(this.f270745e);
            this.f270744d.createFinderPlayView(this.f270746f, this.f270745e);
            if (this.f270744d.enablePlay()) {
                this.f270744d.playVideo();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$m */
    public static final class C93809m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93809m(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270747d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            this.f270747d.getThumbView().setVisibility(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview$n */
    public static final class C93810n extends C87413o implements C32224a<SnsCoverFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsFinderVideoBackPreview f270748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93810n(SnsFinderVideoBackPreview snsFinderVideoBackPreview) {
            super(0);
            this.f270748d = snsFinderVideoBackPreview;
        }

        public Object invoke() {
            return (SnsCoverFadeImageView) this.f270748d.findViewById(C0966R.C0970id.e8n);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsFinderVideoBackPreview(Context context) {
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
        FrameLayout jumpFinderViewFl = getJumpFinderViewFl();
        C87412m.m108593f(jumpFinderViewFl, "jumpFinderViewFl");
        this.finderDetailLoader = new C61150a(avatarView, authorNameView, finderDesc, avatarFl, jumpFinderViewFl);
        dVar.f293271c = this;
        getFoldThumbView().setImageBitmap((Bitmap) null);
        getThumbView().setSourceDecodeCallback(new C93797a(this));
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview.coverInfoValid(pr2.d):boolean");
    }

    /* access modifiers changed from: private */
    public final void createFinderPlayView(Context context, FinderObject finderObject) {
        if (this.playView != null) {
            onDestroy();
            removeView(this.playView);
        }
        MMTPEffectVideoLayout createVideoLayout = createVideoLayout(context, finderObject);
        if (createVideoLayout != null) {
            this.playView = createVideoLayout;
            addView(createVideoLayout, 0);
        }
    }

    private final C58010a createTPMediaInfo(FeedData feedData) {
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(feedData.getMediaList());
        if (rq22 != null) {
            C62367r0 a = C55041a.f154526a.mo76098a(feedData.getId(), rq22, false);
            String b = a.mo11841b();
            String path = a.getPath();
            String url = a.getUrl();
            String urlToken = a.getUrlToken();
            String decodeKey = a.getDecodeKey();
            long j = (long) rq22.f185269g;
            String g = a.mo87422g();
            C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
            String path2 = b0Var.getPath();
            String thumbUrl = b0Var.getThumbUrl();
            String thumbUrlToken = b0Var.getThumbUrlToken();
            String str = b;
            C58010a aVar = r2;
            String str2 = path;
            String str3 = url;
            String str4 = thumbUrlToken;
            int i = (int) rq22.f185270h;
            C58010a aVar2 = new C58010a(str, str2, str3, i, (int) rq22.f185271i);
            aVar.f165932d = decodeKey;
            aVar.f165931c = urlToken;
            aVar.f165935g = j;
            aVar.f165930b = g;
            aVar.f165938j = path2;
            aVar.f165936h = thumbUrl;
            aVar.f165937i = str4;
            return aVar;
        }
        Log.m105920e(this.TAG, "finderItem null mediaList");
        return null;
    }

    private final C62344b0 createThumbInfo(FeedData feedData) {
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150916N(feedData.getMediaList());
        if (rq22 != null) {
            return new C62372x(rq22, C27696y.THUMB_IMAGE, (String) null, 4, (C8480h) null);
        }
        return null;
    }

    private final MMTPEffectVideoLayout createVideoLayout(Context context, FinderObject finderObject) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        FeedData b = FeedData.Companion.mo78884b(FinderItem.Companion.mo79056a(finderObject, finderObject.objectType));
        C58010a createTPMediaInfo = createTPMediaInfo(b);
        if (createTPMediaInfo == null) {
            Log.m105920e(this.TAG, "createTPMediaInfo return null");
            return null;
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = new MMTPEffectVideoLayout(context, false);
        mMTPEffectVideoLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mMTPEffectVideoLayout.mo81100f();
        mMTPEffectVideoLayout.setMediaInfo(createTPMediaInfo);
        mMTPEffectVideoLayout.getEffectManager().mo154924d();
        mMTPEffectVideoLayout.setKeepScreenOn(true);
        C60695a player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            player.mo85614i(true);
        }
        C60695a player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            player2.setLoop(true);
        }
        C60695a player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            player3.setMute(false);
        }
        mMTPEffectVideoLayout.getEffectRenderReport().f334062b = 1;
        C62344b0 createThumbInfo = createThumbInfo(b);
        if (createThumbInfo != null) {
            C99344b<C100810g0, Bitmap> b2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(createThumbInfo, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            C93802f fVar = new C93802f(this);
            b2.getClass();
            b2.f291320d = fVar;
            b2.mo85953c();
        }
        mMTPEffectVideoLayout.setOnFirstFrameAvailable(new C93803g(this));
        mMTPEffectVideoLayout.setOnSurfaceDestroyListener(new C93804h(this));
        return mMTPEffectVideoLayout;
    }

    /* access modifiers changed from: private */
    public final boolean enablePlay() {
        C100848g gVar = this.snsCoverStatusProvider;
        return (gVar == null || !gVar.getStatus().f295360a || !isTimelineUI()) && this.playView != null;
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

    private final TextView getFinderDesc() {
        return (TextView) this.finderDesc$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final SnsCoverNoFadeImageView getFoldThumbView() {
        return (SnsCoverNoFadeImageView) this.foldThumbView$delegate.getValue();
    }

    private final FrameLayout getJumpFinderViewFl() {
        return (FrameLayout) this.jumpFinderViewFl$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final SnsCoverFadeImageView getThumbView() {
        return (SnsCoverFadeImageView) this.thumbView$delegate.getValue();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview.isTimelineUI():boolean");
    }

    /* access modifiers changed from: private */
    public final void loadDetailAndPlayVideo(Context context, FinderObject finderObject) {
        C61926c.m72668M(new C93808l(this, finderObject, context));
    }

    private final void loadLocalThumb(C100844c cVar) {
        SnsCoverFadeImageView thumbView = getThumbView();
        C87412m.m108593f(thumbView, "thumbView");
        String userName = cVar.getUserName();
        C87412m.m108593f(userName, "coverInfo.userName");
        Long u = cVar.mo139906u();
        C87412m.m108593f(u, "coverInfo.snsObjId");
        long longValue = u.longValue();
        String b = cVar.mo139899b();
        int i = SnsCoverFadeImageView.f274653g;
        C98563j0 j0Var = thumbView.f274654f;
        if (j0Var != null) {
            j0Var.mo137936d(userName, longValue, b, false);
        }
        C61926c.m72668M(new C93809m(this));
    }

    private final void pauseVideo() {
        C60695a player;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        this.audioHelper.mo139416a();
    }

    /* access modifiers changed from: private */
    public final void playVideo() {
        C100846e snsCoverReporter;
        C60695a player;
        getFoldThumbView().setVisibility(8);
        updateVideoMute();
        if (!this.isMute) {
            this.audioHelper.mo139417b();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        C60695a player2 = mMTPEffectVideoLayout != null ? mMTPEffectVideoLayout.getPlayer() : null;
        if (player2 != null) {
            player2.mo85614i(true);
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.playView;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.mo85619m();
        }
        C100848g gVar = this.snsCoverStatusProvider;
        if (gVar != null && (snsCoverReporter = gVar.getSnsCoverReporter()) != null) {
            snsCoverReporter.mo140318e();
        }
    }

    private final void setMute(boolean z) {
        C60695a player;
        String str = this.TAG;
        Log.m105924i(str, "setMute:" + z);
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player.setMute(z);
        }
        if (z) {
            this.audioHelper.mo139416a();
        } else {
            this.audioHelper.mo139417b();
        }
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
        if (finderObject != null && (Li = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76777Li(finderObject.f164794id, finderObject.objectNonceId, 123, true, false, "", new C93798b(this, dVar, z))) != null) {
            C98564l0 Z0 = ((C98567o0) C86312j.m106911c(C98567o0.class)).mo137591Z0();
            String userName = dVar.getUserName();
            C87412m.m108593f(userName, "coverInfo.userName");
            Long u = dVar.mo139906u();
            C87412m.m108593f(u, "coverInfo.snsObjId");
            Z0.mo137940E0(userName, u.longValue(), Li);
            if (z) {
                Context context = getContext();
                C87412m.m108593f(context, "context");
                loadDetailAndPlayVideo(context, Li);
            }
        }
    }

    private final void updateVideoMute() {
        C100848g gVar = this.snsCoverStatusProvider;
        if (gVar != null) {
            boolean z = false;
            if (gVar.getStatus().f295360a || C61104a.m71668x() || C61104a.m71642B(MMApplicationContext.getContext(), false)) {
                z = true;
            }
            this.isMute = z;
            setMute(z);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c2s;
    }

    public int getType() {
        return 3;
    }

    public void loadCover(C100844c cVar) {
        C100846e snsCoverReporter;
        Long l = null;
        C100845d dVar = cVar instanceof C100845d ? (C100845d) cVar : null;
        if (dVar != null) {
            String str = this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("finder obj id:");
            FinderObject finderObject = dVar.getFinderObject();
            if (finderObject != null) {
                l = Long.valueOf(finderObject.f164794id);
            }
            sb.append(l);
            Log.m105924i(str, sb.toString());
            loadLocalThumb(dVar);
            boolean coverInfoValid = coverInfoValid(dVar);
            if (coverInfoValid) {
                Context context = getContext();
                C87412m.m108593f(context, "context");
                FinderObject finderObject2 = dVar.getFinderObject();
                C87412m.m108593f(finderObject2, "coverInfo.finderObject");
                loadDetailAndPlayVideo(context, finderObject2);
            }
            updateFinderObject(dVar, !coverInfoValid);
            C100848g gVar = this.snsCoverStatusProvider;
            long j = 0;
            if (!(gVar == null || (snsCoverReporter = gVar.getSnsCoverReporter()) == null)) {
                FinderObject finderObject3 = dVar.getFinderObject();
                snsCoverReporter.mo140316c(ConvertUtils.longToString(finderObject3 != null ? finderObject3.f164794id : 0));
            }
            C60227q0 q0Var = (C60227q0) C86312j.m106911c(C60227q0.class);
            C10383h hVar = (C10383h) C86312j.m106911c(C10383h.class);
            FinderObject finderObject4 = dVar.getFinderObject();
            if (finderObject4 != null) {
                j = finderObject4.f164794id;
            }
            q0Var.Al0(hVar.mo10700XQ(j));
        }
    }

    public void loadFinderObject(FinderObject finderObject) {
        if (finderObject != null) {
            Context context = getContext();
            C87412m.m108593f(context, "context");
            createFinderPlayView(context, finderObject);
            if (this.playView != null) {
                playVideo();
            }
        }
    }

    public void onChange(int i) {
        String str = this.TAG;
        Log.m105924i(str, "onChange " + i);
        if (i == -1) {
            pauseVideo();
        }
    }

    public void onDestroy() {
        C60695a player;
        C60695a player2;
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (!(mMTPEffectVideoLayout == null || (player2 = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player2.stop();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.playView;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.playView;
        if (mMTPEffectVideoLayout3 != null) {
            mMTPEffectVideoLayout3.mo81101g();
        }
        this.audioHelper.mo139416a();
        C100118d dVar = this.audioHelper;
        if (dVar.f293271c == this) {
            dVar.f293271c = null;
        }
    }

    public void onPause() {
        pauseVideo();
    }

    public void onPostClose() {
        if (isTimelineUI()) {
            pauseVideo();
        } else {
            setMute(true);
        }
    }

    public void onPostOpen() {
        playVideo();
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
        getFoldThumbView().setVisibility(4);
    }

    public void onResume() {
        C60695a player;
        if (enablePlay()) {
            MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
            boolean z = true;
            if (mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null || !player.mo85607e()) {
                z = false;
            }
            if (z) {
                playVideo();
            }
        }
    }

    public void setCoverFoldStatusProvider(C100848g gVar) {
        C87412m.m108594g(gVar, "snsCoverStatusProvider");
        super.setCoverFoldStatusProvider(gVar);
        this.snsCoverStatusProvider = gVar;
    }
}
