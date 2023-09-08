package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import nj3.C76879j;
import org.json.JSONObject;
import p166hy.C98563j0;
import pr2.C100844c;
import pr2.C100846e;
import pr2.C100848g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014R#\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010!\u001a\n \u0017*\u0004\u0018\u00010\u001d0\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview;", "Lcom/tencent/mm/plugin/sns/cover/api/AbsSnsBackPreview;", "", "getLayoutId", "Lrx3/b0;", "onResume", "onPause", "onDestroy", "getType", "onPreClose", "onPreOpen", "onPostOpen", "onPostClose", "Lpr2/g;", "snsCoverStatusProvider", "setCoverFoldStatusProvider", "Lpr2/c;", "coverInfo", "loadCover", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "kotlin.jvm.PlatformType", "thumbView$delegate", "Lrx3/g;", "getThumbView", "()Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverFadeImageView;", "thumbView", "Landroid/widget/ImageView;", "coverFoldImageView$delegate", "getCoverFoldImageView", "()Landroid/widget/ImageView;", "coverFoldImageView", "Lpr2/g;", "Lpr2/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview */
public final class SnsImageBackPreview extends AbsSnsBackPreview {
    public static final C94804a Companion = new C94804a((C8480h) null);
    private static final float PREVIEW_RATIO = 1.7777778f;
    private static final String TAG = "MicroMsg.SnsImageBackPreview";
    private final C13601g coverFoldImageView$delegate = C36568h.m40985a(new C94805b(this));
    private C100844c coverInfo;
    private C100848g snsCoverStatusProvider;
    private final C13601g thumbView$delegate = C36568h.m40985a(new C94807e(this));

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$d */
    public static final class C57350d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsImageBackPreview f164323d;

        /* renamed from: e */
        public final /* synthetic */ C100844c f164324e;

        public C57350d(SnsImageBackPreview snsImageBackPreview, C100844c cVar) {
            this.f164323d = snsImageBackPreview;
            this.f164324e = cVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
            Context context = this.f164323d.getContext();
            C87412m.m108593f(context, "context");
            C100844c cVar = this.f164324e;
            SnsMethodCalculate.markStartTimeMs("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
            C87412m.m108594g(cVar, "coverInfo");
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(cVar.mo139900c());
            SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
            TextView textView = new TextView(context);
            textView.setText("path:" + cVar.mo139900c() + "\n width:" + imageOptions.outWidth + " height:" + imageOptions.outHeight + " \nsize:" + C86013q1.m106451l(cVar.mo139900c()));
            textView.setGravity(19);
            textView.setTextSize(1, 10.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            textView.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
            textView.setTypeface(Typeface.MONOSPACE);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
            textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            C76879j.m92746q(context, (String) null, textView, (DialogInterface.OnClickListener) null);
            SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
            SnsMethodCalculate.markEndTimeMs("showImageDebugInfo", "com.tencent.mm.plugin.sns.cover.edit.util.SnsCoverDebugUtil");
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$2");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/cover/preview/SnsImageBackPreview$loadCover$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$a */
    public static final class C94804a {
        public C94804a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$b */
    public static final class C94805b extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsImageBackPreview f274655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94805b(SnsImageBackPreview snsImageBackPreview) {
            super(0);
            this.f274655d = snsImageBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
            ImageView imageView = (ImageView) this.f274655d.findViewById(C0966R.C0970id.f357807bv3);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$coverFoldImageView$2");
            return imageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$c */
    public static final class C94806c extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsImageBackPreview f274656d;

        /* renamed from: e */
        public final /* synthetic */ C100844c f274657e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94806c(SnsImageBackPreview snsImageBackPreview, C100844c cVar) {
            super(1);
            this.f274656d = snsImageBackPreview;
            this.f274657e = cVar;
        }

        public Object invoke(Object obj) {
            C100846e snsCoverReporter;
            C100846e snsCoverReporter2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
            Bitmap bitmap = (Bitmap) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
            C87412m.m108594g(bitmap, LocaleUtil.ITALIAN);
            SnsImageBackPreview.access$getCoverFoldImageView(this.f274656d).setImageBitmap(bitmap);
            C100848g access$getSnsCoverStatusProvider$p = SnsImageBackPreview.access$getSnsCoverStatusProvider$p(this.f274656d);
            if (!(access$getSnsCoverStatusProvider$p == null || (snsCoverReporter2 = access$getSnsCoverStatusProvider$p.getSnsCoverReporter()) == null)) {
                snsCoverReporter2.mo140317d();
            }
            C100848g access$getSnsCoverStatusProvider$p2 = SnsImageBackPreview.access$getSnsCoverStatusProvider$p(this.f274656d);
            if (!(access$getSnsCoverStatusProvider$p2 == null || (snsCoverReporter = access$getSnsCoverStatusProvider$p2.getSnsCoverReporter()) == null)) {
                JSONObject jSONObject = new JSONObject();
                C100844c cVar = this.f274657e;
                Long u = cVar.mo139906u();
                C87412m.m108593f(u, "coverInfo.snsObjId");
                jSONObject.put("snsid", u.longValue());
                jSONObject.put("url", cVar.mo139900c());
                jSONObject.put("width", bitmap.getWidth());
                jSONObject.put("height", bitmap.getHeight());
                snsCoverReporter.mo140314a(jSONObject.toString());
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$e */
    public static final class C94807e extends C87413o implements C32224a<SnsCoverFadeImageView> {

        /* renamed from: d */
        public final /* synthetic */ SnsImageBackPreview f274658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94807e(SnsImageBackPreview snsImageBackPreview) {
            super(0);
            this.f274658d = snsImageBackPreview;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
            SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.f274658d.findViewById(C0966R.C0970id.jsm);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$thumbView$2");
            return snsCoverFadeImageView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsImageBackPreview(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public static final /* synthetic */ ImageView access$getCoverFoldImageView(SnsImageBackPreview snsImageBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        ImageView coverFoldImageView = snsImageBackPreview.getCoverFoldImageView();
        SnsMethodCalculate.markEndTimeMs("access$getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return coverFoldImageView;
    }

    public static final /* synthetic */ C100848g access$getSnsCoverStatusProvider$p(SnsImageBackPreview snsImageBackPreview) {
        SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        C100848g gVar = snsImageBackPreview.snsCoverStatusProvider;
        SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatusProvider$p", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return gVar;
    }

    private final ImageView getCoverFoldImageView() {
        SnsMethodCalculate.markStartTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        ImageView imageView = (ImageView) this.coverFoldImageView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getCoverFoldImageView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return imageView;
    }

    private final SnsCoverFadeImageView getThumbView() {
        SnsMethodCalculate.markStartTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsCoverFadeImageView snsCoverFadeImageView = (SnsCoverFadeImageView) this.thumbView$delegate.getValue();
        SnsMethodCalculate.markEndTimeMs("getThumbView", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return snsCoverFadeImageView;
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return C0966R.C0971layout.c2t;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        return 1;
    }

    public void loadCover(C100844c cVar) {
        C100846e snsCoverReporter;
        SnsMethodCalculate.markStartTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        C87412m.m108594g(cVar, "coverInfo");
        this.coverInfo = cVar;
        getThumbView().setSourceDecodeCallback(new C94806c(this, cVar));
        C100848g gVar = this.snsCoverStatusProvider;
        if (!(gVar == null || (snsCoverReporter = gVar.getSnsCoverReporter()) == null)) {
            snsCoverReporter.mo140318e();
        }
        SnsCoverFadeImageView thumbView = getThumbView();
        String userName = cVar.getUserName();
        C87412m.m108593f(userName, "coverInfo.userName");
        Long u = cVar.mo139906u();
        C87412m.m108593f(u, "coverInfo.snsObjId");
        long longValue = u.longValue();
        String c = cVar.mo139900c();
        thumbView.getClass();
        C98563j0 j0Var = thumbView.f274654f;
        if (j0Var != null) {
            j0Var.mo137936d(userName, longValue, c, true);
        }
        if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_COVER_DEBUG_INT_SYNC, 0) == 1 && WeChatEnvironment.hasDebugger()) {
            setOnLongClickListener(new C57350d(this, cVar));
        }
        SnsMethodCalculate.markEndTimeMs("loadCover", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        super.onConfigurationChanged(configuration);
        Log.m105924i(TAG, "onConfigurationChanged");
        C100844c cVar = this.coverInfo;
        if (cVar != null) {
            loadCover(cVar);
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onPostClose() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        Log.m105924i(TAG, "[onPostClose]");
        getCoverFoldImageView().setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onPostOpen() {
        SnsMethodCalculate.markStartTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onPreClose() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        Log.m105924i(TAG, "[onPreClose]");
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onPreOpen() {
        SnsMethodCalculate.markStartTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        Log.m105924i(TAG, "[onPreOpen]");
        getCoverFoldImageView().setVisibility(4);
        SnsMethodCalculate.markEndTimeMs("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }

    public void setCoverFoldStatusProvider(C100848g gVar) {
        SnsMethodCalculate.markStartTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
        super.setCoverFoldStatusProvider(gVar);
        this.snsCoverStatusProvider = gVar;
        SnsMethodCalculate.markEndTimeMs("setCoverFoldStatusProvider", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview");
    }
}
