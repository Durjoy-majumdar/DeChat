package com.tencent.p014mm.plugin.p019aa.p020ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.AnimationLayout;
import com.tencent.p014mm.view.C97331c;
import com.tencent.p014mm.view.C97333d;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p158gt.C76057w;
import p158gt.C8451i;
import p159gw.C98250h;
import p206nj.C11171e;
import qo3.C77407n;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI */
public class AAImagPreviewUI extends MMActivity {

    /* renamed from: s */
    public static final /* synthetic */ int f267559s = 0;

    /* renamed from: d */
    public MMGestureGallery f267560d;

    /* renamed from: e */
    public int f267561e;

    /* renamed from: f */
    public int f267562f;

    /* renamed from: g */
    public String f267563g;

    /* renamed from: h */
    public String f267564h;

    /* renamed from: i */
    public Dialog f267565i = null;

    /* renamed from: j */
    public AnimationLayout f267566j;

    /* renamed from: n */
    public boolean f267567n = false;

    /* renamed from: o */
    public ViewAnimHelper.ViewInfo f267568o;

    /* renamed from: p */
    public ImageView f267569p;

    /* renamed from: q */
    public View f267570q;

    /* renamed from: r */
    public int f267571r;

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$a */
    public class C92881a implements Animator.AnimatorListener {
        public C92881a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            AAImagPreviewUI.this.finish();
            AAImagPreviewUI.this.overridePendingTransition(C0966R.C0968anim.f2518f8, C0966R.C0968anim.f2519f9);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$b */
    public class C92882b implements ValueAnimator.AnimatorUpdateListener {
        public C92882b(AAImagPreviewUI aAImagPreviewUI) {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$c */
    public class C92883c implements MMGestureGallery.C19842g {
        public C92883c() {
        }

        /* renamed from: a */
        public void mo26370a() {
            AAImagPreviewUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$d */
    public class C92884d implements MMGestureGallery.C19841d {

        /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$d$a */
        public class C92885a implements C11182m0 {
            public C92885a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107125a(1, C0966R.string.g4g);
                AAImagPreviewUI aAImagPreviewUI = AAImagPreviewUI.this;
                if (aAImagPreviewUI.f267561e == 1) {
                    e0Var.mo107140d(2, aAImagPreviewUI.getContext().getResources().getColor(C0966R.color.f2966ao), AAImagPreviewUI.this.getString(C0966R.string.f360937g40));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$d$b */
        public class C92886b implements C11184p0 {
            public C92886b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Log.m105925i("MicroMsg.PreviewHdHeadImg", "onMMMenuItemSelected %s", Integer.valueOf(menuItem.getItemId()));
                int itemId = menuItem.getItemId();
                if (itemId == 1) {
                    AAImagPreviewUI aAImagPreviewUI = AAImagPreviewUI.this;
                    int i2 = AAImagPreviewUI.f267559s;
                    aAImagPreviewUI.getClass();
                    ((C98250h) C86312j.m106911c(C98250h.class)).mo137341Iy(aAImagPreviewUI, new C92895f(aAImagPreviewUI), new C55424g(aAImagPreviewUI));
                } else if (itemId == 2) {
                    AAImagPreviewUI.this.setResult(-1);
                    AAImagPreviewUI.this.finish();
                }
            }
        }

        public C92884d() {
        }

        /* renamed from: a */
        public void mo26369a() {
            C77407n nVar = new C77407n((Context) AAImagPreviewUI.this, 1, false);
            nVar.f225771i = new C92885a();
            nVar.f225782p = new C92886b();
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$e */
    public class C92887e extends C79145c {
        public C92887e() {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                AAImagPreviewUI.this.f267560d.getSingleClickOverListener().mo26370a();
            }
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(Button.class.getName());
            accessibilityNodeInfo.setContentDescription(AAImagPreviewUI.this.getString(C0966R.string.g4a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$f */
    public class C92888f implements MenuItem.OnMenuItemClickListener {
        public C92888f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AAImagPreviewUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.aa.ui.AAImagPreviewUI$g */
    public class C92889g extends BaseAdapter {
        public C92889g(C92883c cVar) {
        }

        public int getCount() {
            return 1;
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = View.inflate(AAImagPreviewUI.this.getContext(), C0966R.C0971layout.f6260y, (ViewGroup) null);
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) inflate.findViewById(C0966R.C0970id.f39);
            inflate.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            AAImagPreviewUI aAImagPreviewUI = AAImagPreviewUI.this;
            int i2 = aAImagPreviewUI.f267562f;
            if (i2 == 1) {
                Bitmap bitmap = ((C8451i) C86312j.m106911c(C8451i.class)).get(aAImagPreviewUI.f267564h);
                if (bitmap != null) {
                    aAImagPreviewUI.mo127272I7(multiTouchImageView, bitmap);
                } else {
                    aAImagPreviewUI.f267565i = C76879j.m92721O(aAImagPreviewUI, (String) null, 3, C0966R.style.f8510l3, aAImagPreviewUI.getString(C0966R.string.gas), true, true, new C92891c(aAImagPreviewUI));
                    ((C76057w) C86312j.m106911c(C76057w.class)).h60(aAImagPreviewUI.f267564h, new C92892d(aAImagPreviewUI, multiTouchImageView));
                }
            } else if (i2 == 2) {
                multiTouchImageView.post(new C92894e(aAImagPreviewUI, multiTouchImageView));
            } else {
                Log.m105921e("MicroMsg.PreviewHdHeadImg", "scene(%s) invalid", Integer.valueOf(i2));
                aAImagPreviewUI.finish();
            }
            inflate.findViewById(C0966R.C0970id.f4u).setImportantForAccessibility(2);
            return inflate;
        }
    }

    /* renamed from: H7 */
    public final void mo127271H7() {
        if (!this.f267567n) {
            this.f267567n = true;
            Log.m105924i("MicroMsg.PreviewHdHeadImg", "runExitAnimation");
            this.f267566j.mo136401a(this.f267569p, this.f267570q, this.f267568o, new C92881a(), new C92882b(this));
        }
    }

    /* renamed from: I7 */
    public final void mo127272I7(MultiTouchImageView multiTouchImageView, Bitmap bitmap) {
        MultiTouchImageView multiTouchImageView2 = multiTouchImageView;
        ForceGpuUtil.decideLayerType(multiTouchImageView2, bitmap.getWidth(), bitmap.getHeight());
        int width = multiTouchImageView.getWidth();
        int height = multiTouchImageView.getHeight();
        Matrix matrix = new Matrix();
        matrix.reset();
        float width2 = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
        float height2 = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
        Log.m105926v("MicroMsg.PreviewHdHeadImg", "whDiv is " + width2 + " hwDiv is " + height2);
        float f = 1.0f;
        if (height2 >= 2.0f && bitmap.getHeight() >= 480) {
            float f2 = (float) width;
            float width3 = f2 / ((float) bitmap.getWidth());
            if (((double) (((float) bitmap.getWidth()) / f2)) > 1.0d) {
                matrix.postScale(width3, width3);
                bitmap.getHeight();
                matrix.postTranslate((f2 - (((float) bitmap.getWidth()) * width3)) / 2.0f, 0.0f);
            } else {
                matrix.postScale(1.0f, 1.0f);
                matrix.postTranslate((float) ((width - bitmap.getWidth()) / 2), 0.0f);
            }
        } else if (width2 < 2.0f || bitmap.getWidth() < 480) {
            float f3 = (float) width;
            float width4 = f3 / ((float) bitmap.getWidth());
            float f4 = (float) height;
            float height3 = f4 / ((float) bitmap.getHeight());
            if (width4 >= height3) {
                width4 = height3;
            }
            float width5 = ((float) bitmap.getWidth()) / f3;
            float height4 = ((float) bitmap.getHeight()) / f4;
            if (width5 <= height4) {
                width5 = height4;
            }
            if (((double) width5) > 1.0d) {
                matrix.postScale(width4, width4);
                f = width4;
            }
            matrix.postTranslate((f3 - (((float) bitmap.getWidth()) * f)) / 2.0f, (f4 - (((float) bitmap.getHeight()) * f)) / 2.0f);
        } else {
            float height5 = ((float) bitmap.getHeight()) / 480.0f;
            float height6 = 480.0f / ((float) bitmap.getHeight());
            if (((double) height5) > 1.0d) {
                matrix.postScale(height5, height6);
                matrix.postTranslate(0.0f, (float) ((height - 480) / 2));
            } else {
                matrix.postScale(1.0f, 1.0f);
                float height7 = (float) ((height - bitmap.getHeight()) / 2);
                Log.m105918d("MicroMsg.PreviewHdHeadImg", " offsety " + height7);
                matrix.postTranslate(0.0f, height7);
            }
        }
        multiTouchImageView2.setImageMatrix(matrix);
        int width6 = bitmap.getWidth();
        int height8 = bitmap.getHeight();
        multiTouchImageView2.f348280o = width6;
        multiTouchImageView2.f348281p = height8;
        multiTouchImageView2.setMaxZoomDoubleTab(true);
        multiTouchImageView.setImageBitmap(bitmap);
    }

    public void finish() {
        super.finish();
        mo127271H7();
        overridePendingTransition(C0966R.C0968anim.f2518f8, C0966R.C0968anim.f2519f9);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6259x;
    }

    public void initView() {
        hideTitleView();
        fullScreenNoTitleBar(true);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f267566j = (AnimationLayout) findViewById(C0966R.C0970id.f5852qb);
        this.f267570q = findViewById(C0966R.C0970id.iwf);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f267569p = imageView;
        if (this.f267568o == null) {
            this.f267568o = ViewAnimHelper.m90033b(imageView, getContext().getWindow().getDecorView());
        }
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f267560d = mMGestureGallery;
        mMGestureGallery.setVerticalFadingEdgeEnabled(false);
        this.f267560d.setHorizontalFadingEdgeEnabled(false);
        this.f267560d.setSingleClickOverListener(new C92883c());
        this.f267560d.setLongClickOverListener(new C92884d());
        this.f267560d.setAdapter(new C92889g((C92883c) null));
        this.f267560d.setAccessibilityDelegate(new C92887e());
        setBackBtn(new C92888f());
        if (!this.f267567n) {
            this.f267567n = true;
            Log.m105924i("MicroMsg.PreviewHdHeadImg", "runEnterAnimation");
            AnimationLayout animationLayout = this.f267566j;
            ImageView imageView2 = this.f267569p;
            View view = this.f267570q;
            ViewAnimHelper.ViewInfo viewInfo = this.f267568o;
            C92890b bVar = new C92890b(this);
            animationLayout.getClass();
            C97331c cVar = new C97331c(animationLayout, view, viewInfo, imageView2, bVar, (ValueAnimator.AnimatorUpdateListener) null);
            if ((animationLayout.getMeasuredState() & -16777216) > 0) {
                cVar.run();
            } else {
                animationLayout.getViewTreeObserver().addOnPreDrawListener(new C97333d(animationLayout, cVar));
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo127271H7();
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        overridePendingTransition(C0966R.C0968anim.f2518f8, C0966R.C0968anim.f2519f9);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f267561e = getIntent().getIntExtra("use_scene", 1);
        this.f267562f = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        this.f267563g = getIntent().getStringExtra("path");
        this.f267564h = getIntent().getStringExtra("url");
        this.f267568o = (ViewAnimHelper.ViewInfo) getIntent().getParcelableExtra("view_info");
        this.f267571r = getIntent().getIntExtra("aa_type", 2);
        initView();
        setResult(0);
    }
}
