package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import os2.C100398c0;
import os2.C100399d0;
import pr2.C100844c;
import rx3.C13601g;
import rx3.C36568h;
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017R#\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010&\u001a\n \u001c*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'¨\u0006."}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsWeComImageBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "Lcom/tencent/mm/plugin/sns/model/e$h;", "", "getLayoutId", "Lrx3/b0;", "onResume", "onPause", "onDestroy", "getType", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "", "mediaId", "onThumbFinish", "snsId", "", "isOk", "onImageFinish", "onSetbg", "onSightFinish", "Lpr2/c;", "coverInfo", "loadCover", "downloadCover", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Lrx3/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Landroid/widget/ImageView;", "coverFoldImageView$delegate", "getCoverFoldImageView", "()Landroid/widget/ImageView;", "coverFoldImageView", "Lpr2/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview */
public final class SnsWeComImageBackPreview extends AbsSnsBackPreview implements C94853e.C94861h {
    public static final C94816a Companion = new C94816a((C8480h) null);
    private static final float PREVIEW_RATIO = 1.7777778f;
    private static final String TAG = "MicroMsg.SnsWeComImageBackPreview";
    private final C13601g coverFoldImageView$delegate = C36568h.m40985a(new C94817b(this));
    private C100844c coverInfo;
    private final C13601g thumbView$delegate = C36568h.m40985a(new C94818c(this));

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$a */
    public static final class C94816a {
        public C94816a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$b */
    public static final class C94817b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsWeComImageBackPreview f274667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94817b(SnsWeComImageBackPreview snsWeComImageBackPreview) {
            super(0);
            this.f274667d = snsWeComImageBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
            ImageView imageView = (ImageView) this.f274667d.findViewById(C0966R.C0970id.f357807bv3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$coverFoldImageView$2");
            return imageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$c */
    public static final class C94818c extends C87413o implements C32224a<SnsCoverFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsWeComImageBackPreview f274668d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94818c(SnsWeComImageBackPreview snsWeComImageBackPreview) {
            super(0);
            this.f274668d = snsWeComImageBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$thumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$thumbView$2");
            SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.f274668d.findViewById(C0966R.C0970id.jsm);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$thumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview$thumbView$2");
            return snsCoverFadeImageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsWeComImageBackPreview(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    private final ImageView getCoverFoldImageView() {
        SnsMethodCalculate.markStartTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        ImageView imageView = (ImageView) this.coverFoldImageView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return imageView;
    }

    private final SnsCoverFadeImageView getThumbView() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.thumbView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return snsCoverFadeImageView;
    }

    public final void downloadCover(C100844c cVar) {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("downloadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        C87412m.m108594g(cVar, "coverInfo");
        String YO = C94866e1.m120262YO();
        C87412m.m108593f(YO, "getAccSnsPath()");
        C100398c0 Yt = C94866e1.Xx0().mo139782Yt(cVar.getUserName());
        String str3 = Yt.field_bgId;
        Log.m105924i(TAG, "downloadCover, userName:" + cVar.getUserName() + ", bgId:" + str3 + ", olderBgId:" + Yt.field_older_bgId);
        String M = C102236a0.m134718M(str3);
        C87412m.m108593f(M, "getSnsBigNameWithoutEnc(newerId)");
        String str4 = cVar.getUserName() + "bg_";
        String str5 = cVar.getUserName() + "tbg_";
        String e = C94938q1.m120518e(YO, cVar.getUserName());
        C87412m.m108593f(e, "getMediaFilePath(snsPath, coverInfo.userName)");
        C86013q1.m106461v(e);
        SnsMethodCalculate.markStartTimeMs("isChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
        boolean z = true;
        if ((Yt.field_local_flag & 1) <= 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
        if (z) {
            Log.m105918d(TAG, "bg is change");
            C100399d0 Xx0 = C94866e1.Xx0();
            String userName = cVar.getUserName();
            Xx0.getClass();
            SnsMethodCalculate.markStartTimeMs("unChnage", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            C100398c0 Yt2 = Xx0.mo139782Yt(userName);
            Yt2.field_userName = userName;
            Yt2.field_local_flag &= -2;
            Xx0.mo139790nP(Yt2);
            SnsMethodCalculate.markEndTimeMs("unChnage", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            if (C86013q1.m106450k(C94938q1.m120518e(YO, cVar.getUserName()) + str4)) {
                C86013q1.m106447h(C94938q1.m120518e(YO, cVar.getUserName()) + str5);
                C86013q1.m106435Q(C94938q1.m120518e(YO, cVar.getUserName()), str4, str5);
            }
            SnsMethodCalculate.markStartTimeMs("unChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
            Yt.field_local_flag &= -2;
            SnsMethodCalculate.markEndTimeMs("unChange", "com.tencent.mm.plugin.sns.storage.SnsExt");
            C94866e1.Xx0().mo139790nP(Yt);
        }
        if (C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), str3) + M)) {
            if (!C86013q1.m106450k(C94938q1.m120518e(YO, cVar.getUserName()) + str4)) {
                C86013q1.m106442c(C94938q1.m120518e(YO, str3) + M, C94938q1.m120518e(YO, cVar.getUserName()) + str4);
                Log.m105918d(TAG, "nwer id Name update");
            }
        }
        Bitmap bitmap = null;
        if (str3 != null) {
            String str6 = e;
            String str7 = str5;
            Bitmap k = C94866e1.Fx0().mo131125k(e + str4, Yt.field_bgUrl, str3, true, C96983o3.f284139k, Yt.field_imBGaeskey, Yt.field_imBGauthkey);
            Log.m105918d(TAG, "set a new bg");
            if (k == null) {
                StringBuilder sb = new StringBuilder();
                str = str6;
                sb.append(str);
                sb.append(str4);
                C86013q1.m106447h(sb.toString());
            } else {
                str = str6;
            }
            Bitmap bitmap2 = k;
            str2 = str7;
            bitmap = bitmap2;
        } else {
            str = e;
            str2 = str5;
        }
        if (bitmap == null && str3 != null) {
            bitmap = C94866e1.Fx0().mo131125k(str + str2, Yt.field_bgUrl, str3, false, C96983o3.f284139k, Yt.field_imBGaeskey, Yt.field_imBGauthkey);
        }
        getThumbView().setImageBitmapWithFade(bitmap);
        SnsMethodCalculate.markEndTimeMs("downloadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return C0966R.C0971layout.c2t;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        return 6;
    }

    public void loadCover(C100844c cVar) {
        SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        C87412m.m108594g(cVar, "coverInfo");
        C94866e1.Vx0().mo130997v(this);
        C94866e1.Vx0().mo130978c(this);
        this.coverInfo = cVar;
        downloadCover(cVar);
        SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        C94866e1.Vx0().mo130997v(this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        Log.m105924i(TAG, "[onPostClose]");
        getCoverFoldImageView().setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        Log.m105924i(TAG, "[onPreClose]");
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        Log.m105924i(TAG, "[onPreOpen]");
        getCoverFoldImageView().setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        C100844c cVar = this.coverInfo;
        if (cVar != null) {
            downloadCover(cVar);
        }
        C94866e1.Vx0().mo130997v(this);
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.cover.preview.SnsWeComImageBackPreview");
    }
}
