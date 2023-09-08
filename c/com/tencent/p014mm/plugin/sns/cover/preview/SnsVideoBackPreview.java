package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.thumbplayer.view.MMTPEffectVideoLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.core.AssetExtension;
import d03.C58010a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import j03.C60695a;
import j03.C60700d;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import o40.C61926c;
import os2.C100400e0;
import os2.C100422y;
import os2.C100423z;
import p166hy.C98563j0;
import p182kk.C61104a;
import p206nj.C100115c;
import p206nj.C100118d;
import pr2.C100844c;
import pr2.C100846e;
import pr2.C100847f;
import pr2.C100848g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101817mv2;
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001EB\u000f\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0006\u0010\u0018\u001a\u00020\bJ\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001dH\u0016R\u0018\u0010(\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R#\u00100\u001a\n +*\u0004\u0018\u00010*0*8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R#\u00105\u001a\n +*\u0004\u0018\u000101018BX\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00106R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010>¨\u0006F"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsVideoBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lnj/c$a;", "Lpr2/c;", "coverInfo", "Ld03/a;", "makeTPMediaInfo", "mediaInfo", "Lrx3/b0;", "createFinderPlayView", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTPEffectVideoLayout;", "createVideoLayout", "pauseVideo", "updateVideoMute", "", "mute", "setMute", "isTimelineUI", "enableTimelinePlay", "canPlay", "", "path", "getLocalTPMediaInfo", "loadCover", "play", "onPreOpen", "onPostOpen", "onPreClose", "onPostClose", "", "getLayoutId", "onResume", "onPause", "onDestroy", "getType", "Lpr2/g;", "snsCoverStatusProvider", "setCoverFoldStatusProvider", "focusChange", "onChange", "playView", "Lcom/tencent/mm/plugin/thumbplayer/view/MMTPEffectVideoLayout;", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Lrx3/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "foldThumbView$delegate", "getFoldThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "foldThumbView", "Lpr2/g;", "isMute", "Z", "Lpr2/c;", "Lnj/d;", "audioHelper", "Lnj/d;", "localVideoPath", "Ljava/lang/String;", "localMediaId", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "b", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview */
public final class SnsVideoBackPreview extends AbsSnsBackPreview implements C100115c.C100116a {
    public static final C94809b Companion = new C94809b((C8480h) null);
    private static final float PREVIEW_RATIO = 1.7777778f;
    private static final String TAG = "Finder.SnsVideoBackPreview";
    private final C100118d audioHelper;
    private C100844c coverInfo;
    private final C13601g foldThumbView$delegate = C36568h.m40985a(new C94812e(this));
    private boolean isMute;
    private String localMediaId;
    private String localVideoPath;
    private MMTPEffectVideoLayout playView;
    private C100848g snsCoverStatusProvider;
    private final C13601g thumbView$delegate = C36568h.m40985a(new C94815h(this));

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$a */
    public static final class C94808a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94808a(SnsVideoBackPreview snsVideoBackPreview) {
            super(1);
            this.f274659d = snsVideoBackPreview;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$1");
            Bitmap bitmap = (Bitmap) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$1");
            C87412m.m108594g(bitmap, LocaleUtil.ITALIAN);
            SnsVideoBackPreview.access$getFoldThumbView(this.f274659d).setImageBitmap(bitmap);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$b */
    public static final class C94809b {
        public C94809b(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$c */
    public static final class C94810c extends C87413o implements C32228q<SurfaceTexture, Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94810c(SnsVideoBackPreview snsVideoBackPreview) {
            super(3);
            this.f274660d = snsVideoBackPreview;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C100846e snsCoverReporter;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$1");
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            ((Number) obj2).intValue();
            ((Number) obj3).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$1");
            SnsVideoBackPreview.access$getThumbView(this.f274660d).setVisibility(8);
            C100848g access$getSnsCoverStatusProvider$p = SnsVideoBackPreview.access$getSnsCoverStatusProvider$p(this.f274660d);
            if (!(access$getSnsCoverStatusProvider$p == null || (snsCoverReporter = access$getSnsCoverStatusProvider$p.getSnsCoverReporter()) == null)) {
                snsCoverReporter.mo140317d();
            }
            Log.m105924i(SnsVideoBackPreview.TAG, "onFrameAvailable");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$d */
    public static final class C94811d extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94811d(SnsVideoBackPreview snsVideoBackPreview) {
            super(1);
            this.f274661d = snsVideoBackPreview;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
            SnsVideoBackPreview.access$getThumbView(this.f274661d).setVisibility(0);
            MMTPEffectVideoLayout access$getPlayView$p = SnsVideoBackPreview.access$getPlayView$p(this.f274661d);
            if (access$getPlayView$p != null) {
                access$getPlayView$p.setOnFirstFrameAvailable(new C94819a(this.f274661d));
            }
            Log.m105924i(SnsVideoBackPreview.TAG, "onSurfaceDestroyListener");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$createVideoLayout$1$2");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$e */
    public static final class C94812e extends C87413o implements C32224a<SnsCoverNoFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94812e(SnsVideoBackPreview snsVideoBackPreview) {
            super(0);
            this.f274662d = snsVideoBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
            SnsCoverNoFadeImageView snsCoverNoFadeImageView = (SnsCoverNoFadeImageView) this.f274662d.findViewById(C0966R.C0970id.l56);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$foldThumbView$2");
            return snsCoverNoFadeImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$f */
    public static final class C94813f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274663d;

        /* renamed from: e */
        public final /* synthetic */ C58010a f274664e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94813f(SnsVideoBackPreview snsVideoBackPreview, C58010a aVar) {
            super(0);
            this.f274663d = snsVideoBackPreview;
            this.f274664e = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
            SnsVideoBackPreview.access$createFinderPlayView(this.f274663d, this.f274664e);
            if (SnsVideoBackPreview.access$canPlay(this.f274663d)) {
                this.f274663d.play();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$loadCover$1$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$g */
    public static final class C94814g extends C87413o implements C32227p<String, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94814g(SnsVideoBackPreview snsVideoBackPreview) {
            super(2);
            this.f274665d = snsVideoBackPreview;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
            StringBuilder sb = new StringBuilder();
            sb.append("media id:");
            sb.append(str);
            sb.append(" localid:");
            sb.append(SnsVideoBackPreview.access$getLocalMediaId$p(this.f274665d));
            sb.append(" objid:");
            C100844c access$getCoverInfo$p = SnsVideoBackPreview.access$getCoverInfo$p(this.f274665d);
            Long l = null;
            sb.append(access$getCoverInfo$p != null ? access$getCoverInfo$p.mo139906u() : null);
            sb.append(" download finish ret:");
            sb.append(intValue);
            Log.m105924i(SnsVideoBackPreview.TAG, sb.toString());
            if (intValue == 0 && C87412m.m108589b(SnsVideoBackPreview.access$getLocalMediaId$p(this.f274665d), str) && C86013q1.m106450k(SnsVideoBackPreview.access$getLocalVideoPath$p(this.f274665d))) {
                Log.m105924i(SnsVideoBackPreview.TAG, "file local path:" + SnsVideoBackPreview.access$getLocalVideoPath$p(this.f274665d) + " length:" + C86013q1.m106451l(SnsVideoBackPreview.access$getLocalVideoPath$p(this.f274665d)));
                C100423z Ux0 = C94866e1.Ux0();
                C100844c access$getCoverInfo$p2 = SnsVideoBackPreview.access$getCoverInfo$p(this.f274665d);
                String userName = access$getCoverInfo$p2 != null ? access$getCoverInfo$p2.getUserName() : null;
                C100844c access$getCoverInfo$p3 = SnsVideoBackPreview.access$getCoverInfo$p(this.f274665d);
                if (access$getCoverInfo$p3 != null) {
                    l = access$getCoverInfo$p3.mo139906u();
                }
                String access$getLocalVideoPath$p = SnsVideoBackPreview.access$getLocalVideoPath$p(this.f274665d);
                Ux0.getClass();
                SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                Log.m105924i("MicroMsg.SnsCoverStorage", "downloadVideo user:" + userName + " id:" + l + " path:" + access$getLocalVideoPath$p + " size:" + C86013q1.m106451l(access$getLocalVideoPath$p));
                if (userName == null || l == null) {
                    SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                } else {
                    C100422y Yt = Ux0.mo139909Yt(userName);
                    if (!C87412m.m108589b(Yt.mo139906u(), l) || !Yt.field_success) {
                        SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                    } else {
                        Yt.field_localVideo = access$getLocalVideoPath$p;
                        Ux0.mo139910bD(Yt, false);
                        SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$h */
    public static final class C94815h extends C87413o implements C32224a<SnsCoverFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsVideoBackPreview f274666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94815h(SnsVideoBackPreview snsVideoBackPreview) {
            super(0);
            this.f274666d = snsVideoBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$thumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$thumbView$2");
            SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.f274666d.findViewById(C0966R.C0970id.jst);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$thumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$thumbView$2");
            return snsCoverFadeImageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsVideoBackPreview(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C100118d dVar = new C100118d(context);
        this.audioHelper = dVar;
        dVar.f293271c = this;
        getFoldThumbView().setImageBitmap((Bitmap) null);
        getThumbView().setSourceDecodeCallback(new C94808a(this));
    }

    public static final /* synthetic */ boolean access$canPlay(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$canPlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        boolean canPlay = snsVideoBackPreview.canPlay();
        SnsMethodCalculate.markEndTimeMs("access$canPlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return canPlay;
    }

    public static final /* synthetic */ void access$createFinderPlayView(SnsVideoBackPreview snsVideoBackPreview, C58010a aVar) {
        SnsMethodCalculate.markStartTimeMs("access$createFinderPlayView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        snsVideoBackPreview.createFinderPlayView(aVar);
        SnsMethodCalculate.markEndTimeMs("access$createFinderPlayView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public static final /* synthetic */ C100844c access$getCoverInfo$p(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getCoverInfo$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C100844c cVar = snsVideoBackPreview.coverInfo;
        SnsMethodCalculate.markEndTimeMs("access$getCoverInfo$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return cVar;
    }

    public static final /* synthetic */ SnsCoverNoFadeImageView access$getFoldThumbView(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getFoldThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsCoverNoFadeImageView foldThumbView = snsVideoBackPreview.getFoldThumbView();
        SnsMethodCalculate.markEndTimeMs("access$getFoldThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return foldThumbView;
    }

    public static final /* synthetic */ String access$getLocalMediaId$p(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getLocalMediaId$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        String str = snsVideoBackPreview.localMediaId;
        SnsMethodCalculate.markEndTimeMs("access$getLocalMediaId$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return str;
    }

    public static final /* synthetic */ String access$getLocalVideoPath$p(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getLocalVideoPath$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        String str = snsVideoBackPreview.localVideoPath;
        SnsMethodCalculate.markEndTimeMs("access$getLocalVideoPath$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return str;
    }

    public static final /* synthetic */ MMTPEffectVideoLayout access$getPlayView$p(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getPlayView$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = snsVideoBackPreview.playView;
        SnsMethodCalculate.markEndTimeMs("access$getPlayView$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return mMTPEffectVideoLayout;
    }

    public static final /* synthetic */ C100848g access$getSnsCoverStatusProvider$p(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C100848g gVar = snsVideoBackPreview.snsCoverStatusProvider;
        SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return gVar;
    }

    public static final /* synthetic */ SnsCoverFadeImageView access$getThumbView(SnsVideoBackPreview snsVideoBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsCoverFadeImageView thumbView = snsVideoBackPreview.getThumbView();
        SnsMethodCalculate.markEndTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return thumbView;
    }

    private final boolean canPlay() {
        SnsMethodCalculate.markStartTimeMs("canPlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        boolean z = (!isTimelineUI() || (isTimelineUI() && enableTimelinePlay())) && this.playView != null;
        SnsMethodCalculate.markEndTimeMs("canPlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return z;
    }

    private final void createFinderPlayView(C58010a aVar) {
        SnsMethodCalculate.markStartTimeMs("createFinderPlayView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Integer num = null;
        if (this.playView != null) {
            onDestroy();
            removeView(this.playView);
            this.playView = null;
        }
        this.playView = createVideoLayout(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append("playView[");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (mMTPEffectVideoLayout != null) {
            num = Integer.valueOf(mMTPEffectVideoLayout.hashCode());
        }
        sb.append(num);
        sb.append("]createVideoLayout");
        Log.m105924i(TAG, sb.toString());
        addView(this.playView, 0);
        SnsMethodCalculate.markEndTimeMs("createFinderPlayView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    private final MMTPEffectVideoLayout createVideoLayout(C58010a aVar) {
        int i;
        float f;
        float f2;
        SnsMethodCalculate.markStartTimeMs("createVideoLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Context context = getContext();
        C87412m.m108593f(context, "context");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = new MMTPEffectVideoLayout(context, false);
        mMTPEffectVideoLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mMTPEffectVideoLayout.mo81100f();
        mMTPEffectVideoLayout.setMediaInfo(aVar);
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
        int i2 = aVar.f165950v;
        if (i2 > 0 && (i = aVar.f165951w) > 0) {
            int i3 = aVar.f165939k;
            if (i3 == 90 || i3 == 270) {
                f = ((float) i2) * 1.0f;
                f2 = (float) i;
            } else {
                f = ((float) i) * 1.0f;
                f2 = (float) i2;
            }
            if (f / f2 < PREVIEW_RATIO) {
                mMTPEffectVideoLayout.getEffectManager().mo154924d();
            }
        }
        mMTPEffectVideoLayout.setOnFirstFrameAvailable(new C94810c(this));
        mMTPEffectVideoLayout.setOnSurfaceDestroyListener(new C94811d(this));
        SnsMethodCalculate.markEndTimeMs("createVideoLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return mMTPEffectVideoLayout;
    }

    private final boolean enableTimelinePlay() {
        SnsMethodCalculate.markStartTimeMs("enableTimelinePlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C100848g gVar = this.snsCoverStatusProvider;
        if (gVar == null || !gVar.getStatus().f295360a || !isTimelineUI()) {
            SnsMethodCalculate.markEndTimeMs("enableTimelinePlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("enableTimelinePlay", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return false;
    }

    private final SnsCoverNoFadeImageView getFoldThumbView() {
        SnsMethodCalculate.markStartTimeMs("getFoldThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsCoverNoFadeImageView snsCoverNoFadeImageView = (SnsCoverNoFadeImageView) this.foldThumbView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getFoldThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return snsCoverNoFadeImageView;
    }

    private final C58010a getLocalTPMediaInfo(String str) {
        C100846e snsCoverReporter;
        C100846e snsCoverReporter2;
        SnsMethodCalculate.markStartTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "getLocalTPMediaInfo path:" + str);
        C94554a c = C94555d.m119567c(str, true);
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
            return null;
        }
        C100848g gVar = this.snsCoverStatusProvider;
        if (!(gVar == null || (snsCoverReporter2 = gVar.getSnsCoverReporter()) == null)) {
            snsCoverReporter2.mo140319f(c.toString());
        }
        C100848g gVar2 = this.snsCoverStatusProvider;
        if (!(gVar2 == null || (snsCoverReporter = gVar2.getSnsCoverReporter()) == null)) {
            snsCoverReporter.mo140315b(true);
        }
        if (str == null) {
            str = "";
        }
        C58010a aVar = new C58010a("", str, "", c.f273445c, c.f273446d);
        aVar.f165933e = true;
        aVar.f165939k = c.f273456n;
        SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return aVar;
    }

    private final SnsCoverFadeImageView getThumbView() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.thumbView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return snsCoverFadeImageView;
    }

    private final boolean isTimelineUI() {
        C100847f status;
        SnsMethodCalculate.markStartTimeMs("isTimelineUI", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C100848g gVar = this.snsCoverStatusProvider;
        boolean z = false;
        if (!(gVar == null || (status = gVar.getStatus()) == null || status.f295361b)) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isTimelineUI", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return z;
    }

    private final C58010a makeTPMediaInfo(C100844c cVar) {
        LinkedList<C101804kv2> linkedList;
        T t;
        C100846e snsCoverReporter;
        C100846e snsCoverReporter2;
        boolean z;
        LinkedList<C101804kv2> linkedList2;
        SnsMethodCalculate.markStartTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        StringBuilder sb = new StringBuilder();
        sb.append("makeTPMediaInfo sns id:");
        Long u = cVar.mo139906u();
        C87412m.m108593f(u, "coverInfo.snsObjId");
        sb.append(C102236a0.m134765q0(u.longValue()));
        Log.m105924i(TAG, sb.toString());
        C100400e0 Yx0 = C94866e1.Yx0();
        Long u2 = cVar.mo139906u();
        SnsInfo SE = Yx0.mo139806SE(u2 == null ? -1 : u2.longValue());
        if (SE != null) {
            C101789j00 j002 = SE.getTimeLine().ContentObj;
            boolean z2 = true;
            if (((j002 == null || (linkedList2 = j002.f298427h) == null) ? 0 : linkedList2.size()) >= 1) {
                C101789j00 j003 = SE.getTimeLine().ContentObj;
                if (!(j003 == null || (linkedList = j003.f298427h) == null)) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (((C101804kv2) t).f298690e == 6) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            break;
                        }
                    }
                    C101804kv2 kv22 = (C101804kv2) t;
                    if (kv22 != null) {
                        if (C86013q1.m106450k(cVar.getVideoPath())) {
                            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_cover_video_md5_check, true);
                            Log.m105924i(TAG, "enable check md5 " + wf);
                            if (!wf || TextUtils.isEmpty(kv22.f298707y)) {
                                C58010a localTPMediaInfo = getLocalTPMediaInfo(cVar.getVideoPath());
                                SnsMethodCalculate.markEndTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
                                return localTPMediaInfo;
                            }
                            String q = C86013q1.m106456q(cVar.getVideoPath());
                            if (q == null || !q.equals(kv22.f298707y)) {
                                z2 = false;
                            }
                            if (z2) {
                                C58010a localTPMediaInfo2 = getLocalTPMediaInfo(cVar.getVideoPath());
                                SnsMethodCalculate.markEndTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
                                return localTPMediaInfo2;
                            }
                            Log.m105920e(TAG, "file md5 error,maybe play wrong vide.delete " + cVar.getVideoPath());
                            C86013q1.m106447h(cVar.getVideoPath());
                        }
                        Log.m105924i(TAG, "get online TPMediaInfo url:" + kv22.f298692g + " width:" + kv22.f298698p.f298875d + " height:" + kv22.f298698p.f298876e);
                        if (!TextUtils.isEmpty(kv22.f298692g)) {
                            this.localMediaId = kv22.f298689d;
                            String str = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + "vdieo_bg_";
                            this.localVideoPath = str;
                            String str2 = kv22.f298689d;
                            String str3 = kv22.f298692g;
                            C101817mv2 mv22 = kv22.f298698p;
                            C58010a aVar = new C58010a(str2, str, str3, (int) mv22.f298875d, (int) mv22.f298876e);
                            C100848g gVar = this.snsCoverStatusProvider;
                            if (!(gVar == null || (snsCoverReporter2 = gVar.getSnsCoverReporter()) == null)) {
                                snsCoverReporter2.mo140319f(aVar.toString());
                            }
                            C100848g gVar2 = this.snsCoverStatusProvider;
                            if (!(gVar2 == null || (snsCoverReporter = gVar2.getSnsCoverReporter()) == null)) {
                                snsCoverReporter.mo140315b(false);
                            }
                            SnsMethodCalculate.markEndTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
                            return aVar;
                        }
                    }
                }
            } else {
                Log.m105920e(TAG, "something error");
            }
        }
        if (C86013q1.m106450k(cVar.getVideoPath())) {
            C58010a localTPMediaInfo3 = getLocalTPMediaInfo(cVar.getVideoPath());
            SnsMethodCalculate.markEndTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
            return localTPMediaInfo3;
        }
        SnsMethodCalculate.markEndTimeMs("makeTPMediaInfo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return null;
    }

    private final void pauseVideo() {
        C60695a player;
        SnsMethodCalculate.markStartTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "[pauseVideo]");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            C60695a.C60696a.m70998a(player, false, 1, (Object) null);
        }
        this.audioHelper.mo139416a();
        SnsMethodCalculate.markEndTimeMs("pauseVideo", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    private final void setMute(boolean z) {
        C60695a player;
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "setMute:" + z);
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        if (!(mMTPEffectVideoLayout == null || (player = mMTPEffectVideoLayout.getPlayer()) == null)) {
            player.setMute(z);
        }
        if (z) {
            this.audioHelper.mo139416a();
        } else {
            this.audioHelper.mo139417b();
        }
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    private final void updateVideoMute() {
        SnsMethodCalculate.markStartTimeMs("updateVideoMute", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C100848g gVar = this.snsCoverStatusProvider;
        if (gVar != null) {
            boolean z = false;
            if (gVar.getStatus().f295360a || C61104a.m71668x() || C61104a.m71642B(getContext(), false)) {
                z = true;
            }
            this.isMute = z;
            setMute(z);
        }
        SnsMethodCalculate.markEndTimeMs("updateVideoMute", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return C0966R.C0971layout.c2v;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        return 2;
    }

    public void loadCover(C100844c cVar) {
        SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        this.coverInfo = cVar;
        if (cVar == null) {
            SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
            return;
        }
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
        C58010a makeTPMediaInfo = makeTPMediaInfo(cVar);
        if (makeTPMediaInfo != null) {
            C61926c.m72668M(new C94813f(this, makeTPMediaInfo));
        }
        SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onChange(int i) {
        SnsMethodCalculate.markStartTimeMs("onChange", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "focusChange " + i);
        if (i == -1) {
            pauseVideo();
        }
        SnsMethodCalculate.markEndTimeMs("onChange", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onDestroy() {
        C60695a player;
        C60695a player2;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        StringBuilder sb = new StringBuilder();
        sb.append("playView[");
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        sb.append(mMTPEffectVideoLayout != null ? Integer.valueOf(mMTPEffectVideoLayout.hashCode()) : null);
        sb.append("] onDestroy");
        Log.m105924i(TAG, sb.toString());
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.playView;
        if (!(mMTPEffectVideoLayout2 == null || (player2 = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player2.stop();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.playView;
        if (!(mMTPEffectVideoLayout3 == null || (player = mMTPEffectVideoLayout3.getPlayer()) == null)) {
            player.recycle();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout4 = this.playView;
        if (mMTPEffectVideoLayout4 != null) {
            mMTPEffectVideoLayout4.mo81101g();
        }
        this.audioHelper.mo139416a();
        C100118d dVar = this.audioHelper;
        if (dVar.f293271c == this) {
            dVar.f293271c = null;
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        pauseVideo();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        if (isTimelineUI()) {
            pauseVideo();
        } else {
            setMute(true);
        }
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        play();
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "[onPreClose]");
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        Log.m105924i(TAG, "[onPreOpen]");
        getFoldThumbView().setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        if (canPlay()) {
            play();
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public final void play() {
        C60695a player;
        C100846e snsCoverReporter;
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i(TAG, "start play " + currentTimeMillis);
        getFoldThumbView().setVisibility(4);
        C100848g gVar = this.snsCoverStatusProvider;
        if (!(gVar == null || (snsCoverReporter = gVar.getSnsCoverReporter()) == null)) {
            snsCoverReporter.mo140318e();
        }
        updateVideoMute();
        MMTPEffectVideoLayout mMTPEffectVideoLayout = this.playView;
        C60700d.C60701a aVar = null;
        C60695a player2 = mMTPEffectVideoLayout != null ? mMTPEffectVideoLayout.getPlayer() : null;
        if (player2 != null) {
            player2.mo85614i(true);
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout2 = this.playView;
        if (!(mMTPEffectVideoLayout2 == null || (player = mMTPEffectVideoLayout2.getPlayer()) == null)) {
            player.mo85619m();
        }
        MMTPEffectVideoLayout mMTPEffectVideoLayout3 = this.playView;
        C60695a player3 = mMTPEffectVideoLayout3 != null ? mMTPEffectVideoLayout3.getPlayer() : null;
        C60700d dVar = player3 instanceof C60700d ? (C60700d) player3 : null;
        if (dVar != null) {
            aVar = dVar.f172876g;
        }
        if (aVar != null) {
            aVar.f172902j = new C94814g(this);
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }

    public void setCoverFoldStatusProvider(C100848g gVar) {
        SnsMethodCalculate.markStartTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
        C87412m.m108594g(gVar, "snsCoverStatusProvider");
        super.setCoverFoldStatusProvider(gVar);
        this.snsCoverStatusProvider = gVar;
        SnsMethodCalculate.markEndTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview");
    }
}
