package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OCRTranslateReportStruct;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.modelcdntran.C55384i;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.p014mm.plugin.scanner.C115670k;
import com.tencent.p014mm.plugin.scanner.C115674p;
import com.tencent.p014mm.plugin.scanner.model.C115672t;
import com.tencent.p014mm.plugin.scanner.model.C30383k1;
import com.tencent.p014mm.plugin.scanner.model.C57316i1;
import com.tencent.p014mm.plugin.scanner.model.C57318j1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import f12.C7970a;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import nj3.C88989a;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C117747y;
import p159gw.C98250h;
import p206nj.C11171e;
import p749xh.C38543c8;
import te3.bk4;
import vl2.C118679t;
import vl2.C118684u;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lob0/n;", "Lvl2/u$b;", "<init>", "()V", "a", "scan-translation_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI */
public final class ScanTranslationResultUI extends MMActivity implements C11385n, C118684u.C118686b {

    /* renamed from: E */
    public static final /* synthetic */ int f347102E = 0;

    /* renamed from: A */
    public int f347103A;

    /* renamed from: B */
    public final OCRTranslateReportStruct f347104B = new OCRTranslateReportStruct();

    /* renamed from: C */
    public final long[] f347105C = new long[2];

    /* renamed from: D */
    public C55384i f347106D;

    /* renamed from: d */
    public View f347107d;

    /* renamed from: e */
    public ImageView f347108e;

    /* renamed from: f */
    public View f347109f;

    /* renamed from: g */
    public View f347110g;

    /* renamed from: h */
    public View f347111h;

    /* renamed from: i */
    public ImageView f347112i;

    /* renamed from: j */
    public View f347113j;

    /* renamed from: n */
    public MMGestureGallery f347114n;

    /* renamed from: o */
    public C94506a f347115o;

    /* renamed from: p */
    public ValueAnimator f347116p = new ValueAnimator();

    /* renamed from: q */
    public Bitmap f347117q;

    /* renamed from: r */
    public Bitmap f347118r;

    /* renamed from: s */
    public String f347119s;

    /* renamed from: t */
    public String f347120t;

    /* renamed from: u */
    public String f347121u;

    /* renamed from: v */
    public int f347122v;

    /* renamed from: w */
    public int f347123w;

    /* renamed from: x */
    public int f347124x = -1;

    /* renamed from: y */
    public String f347125y;

    /* renamed from: z */
    public int f347126z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$a */
    public final class C94506a extends BaseAdapter {

        /* renamed from: d */
        public Bitmap f273278d;

        public C94506a() {
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
            MultiTouchImageView multiTouchImageView;
            C87412m.m108594g(viewGroup, "viewGroup");
            if (view == null) {
                multiTouchImageView = new MultiTouchImageView(ScanTranslationResultUI.this.getContext(), 0, 0);
                multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            } else {
                multiTouchImageView = (MultiTouchImageView) view;
            }
            Bitmap bitmap = this.f273278d;
            if (bitmap != null) {
                multiTouchImageView.setImageBitmap(bitmap);
                Bitmap bitmap2 = this.f273278d;
                C87412m.m108591d(bitmap2);
                int width = bitmap2.getWidth();
                Bitmap bitmap3 = this.f273278d;
                C87412m.m108591d(bitmap3);
                int height = bitmap3.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
                multiTouchImageView.mo26059d();
            }
            return multiTouchImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$e */
    public static final class C106086e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f315848d;

        public C106086e(ScanTranslationResultUI scanTranslationResultUI) {
            this.f315848d = scanTranslationResultUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ScanTranslationResultUI scanTranslationResultUI = this.f315848d;
            int i = ScanTranslationResultUI.f347102E;
            scanTranslationResultUI.mo175975I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$f */
    public static final class C106087f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f315849d;

        public C106087f(ScanTranslationResultUI scanTranslationResultUI) {
            this.f315849d = scanTranslationResultUI;
        }

        public void onAnimationEnd(Animator animator) {
            ImageView imageView = this.f315849d.f347112i;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            } else {
                C87412m.m108603p("scanLine");
                throw null;
            }
        }

        public void onAnimationStart(Animator animator) {
            ImageView imageView = this.f315849d.f347112i;
            if (imageView != null) {
                imageView.setAlpha(0.0f);
            } else {
                C87412m.m108603p("scanLine");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$g */
    public static final class C106088g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f315850d;

        public C106088g(ScanTranslationResultUI scanTranslationResultUI) {
            this.f315850d = scanTranslationResultUI;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            if (floatValue <= 0.1f) {
                ImageView imageView = this.f315850d.f347112i;
                if (imageView != null) {
                    imageView.setAlpha(((float) 10) * floatValue);
                } else {
                    C87412m.m108603p("scanLine");
                    throw null;
                }
            } else if (floatValue >= 0.9f) {
                ImageView imageView2 = this.f315850d.f347112i;
                if (imageView2 != null) {
                    imageView2.setAlpha((1.0f - floatValue) * ((float) 10));
                } else {
                    C87412m.m108603p("scanLine");
                    throw null;
                }
            }
            ScanTranslationResultUI scanTranslationResultUI = this.f315850d;
            ImageView imageView3 = scanTranslationResultUI.f347112i;
            if (imageView3 != null) {
                int i = scanTranslationResultUI.f347122v;
                if (imageView3 != null) {
                    imageView3.setTranslationY(floatValue * ((float) (i - imageView3.getHeight())));
                } else {
                    C87412m.m108603p("scanLine");
                    throw null;
                }
            } else {
                C87412m.m108603p("scanLine");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$h */
    public static final class C106089h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f315851d;

        public C106089h(ScanTranslationResultUI scanTranslationResultUI) {
            this.f315851d = scanTranslationResultUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ScanTranslationResultUI scanTranslationResultUI = this.f315851d;
            int i2 = ScanTranslationResultUI.f347102E;
            scanTranslationResultUI.mo175975I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$b */
    public static final class C115679b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f347127d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f347128e;

        /* renamed from: f */
        public final /* synthetic */ ScanTranslationResultUI f347129f;

        public C115679b(int i, Bitmap bitmap, ScanTranslationResultUI scanTranslationResultUI) {
            this.f347127d = i;
            this.f347128e = bitmap;
            this.f347129f = scanTranslationResultUI;
        }

        public final void run() {
            Log.m105924i("MicroMsg.ScanTranslationResultUI", "drawTranslationResult() called with: session = " + this.f347127d + ", newBitmap = " + this.f347128e);
            int i = this.f347127d;
            ScanTranslationResultUI scanTranslationResultUI = this.f347129f;
            if (i != scanTranslationResultUI.f347123w) {
                return;
            }
            if (this.f347128e != null) {
                OCRTranslateReportStruct oCRTranslateReportStruct = scanTranslationResultUI.f347104B;
                long currentTimeMillis = System.currentTimeMillis();
                ScanTranslationResultUI scanTranslationResultUI2 = this.f347129f;
                oCRTranslateReportStruct.f343793i = (long) ((int) (currentTimeMillis - scanTranslationResultUI2.f347105C[1]));
                scanTranslationResultUI2.f347118r = this.f347128e;
                ScanTranslationResultUI.m162752H7(scanTranslationResultUI2);
                ScanTranslationResultUI scanTranslationResultUI3 = this.f347129f;
                scanTranslationResultUI3.mo175978L7(scanTranslationResultUI3.f347118r);
                return;
            }
            scanTranslationResultUI.mo175976J7((String) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$c */
    public static final class C115680c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f347130d;

        public C115680c(ScanTranslationResultUI scanTranslationResultUI) {
            this.f347130d = scanTranslationResultUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ScanTranslationResultUI scanTranslationResultUI = this.f347130d;
            int i = scanTranslationResultUI.f347124x;
            boolean z = true;
            if (i == 3) {
                Bitmap bitmap = scanTranslationResultUI.f347117q;
                if (bitmap != null) {
                    scanTranslationResultUI.mo175978L7(bitmap);
                }
                String str = this.f347130d.f347125y;
                if (str == null || !C112551y.m153809i(str, "zh_CN", false)) {
                    z = false;
                }
                if (z) {
                    ImageView imageView = this.f347130d.f347108e;
                    if (imageView != null) {
                        imageView.setImageResource(C0966R.raw.translation_result_chinese_highlighted);
                    } else {
                        C87412m.m108603p("viewSourceBtn");
                        throw null;
                    }
                } else {
                    ImageView imageView2 = this.f347130d.f347108e;
                    if (imageView2 != null) {
                        imageView2.setImageResource(C0966R.raw.translation_result_english_highlighted);
                    } else {
                        C87412m.m108603p("viewSourceBtn");
                        throw null;
                    }
                }
                ScanTranslationResultUI scanTranslationResultUI2 = this.f347130d;
                scanTranslationResultUI2.f347124x = 2;
                scanTranslationResultUI2.f347104B.f343794j++;
            } else if (i == 2) {
                Bitmap bitmap2 = scanTranslationResultUI.f347118r;
                if (bitmap2 != null) {
                    scanTranslationResultUI.mo175978L7(bitmap2);
                }
                String str2 = this.f347130d.f347125y;
                if (str2 == null || !C112551y.m153809i(str2, "zh_CN", true)) {
                    z = false;
                }
                if (z) {
                    ImageView imageView3 = this.f347130d.f347108e;
                    if (imageView3 != null) {
                        imageView3.setImageResource(C0966R.C0969drawable.ayn);
                    } else {
                        C87412m.m108603p("viewSourceBtn");
                        throw null;
                    }
                } else {
                    ImageView imageView4 = this.f347130d.f347108e;
                    if (imageView4 != null) {
                        imageView4.setImageResource(C0966R.C0969drawable.ayp);
                    } else {
                        C87412m.m108603p("viewSourceBtn");
                        throw null;
                    }
                }
                this.f347130d.f347124x = 3;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$d */
    public static final class C115681d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ScanTranslationResultUI f347131d;

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$d$a */
        public static final class C115682a implements C98250h.C98251a {

            /* renamed from: a */
            public final /* synthetic */ ScanTranslationResultUI f347132a;

            public C115682a(ScanTranslationResultUI scanTranslationResultUI) {
                this.f347132a = scanTranslationResultUI;
            }

            /* renamed from: a */
            public void mo2055a(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                AppCompatActivity context = this.f347132a.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C75026b.m89951a(context, this.f347132a.getResources().getString(C0966R.string.ier));
            }

            /* renamed from: b */
            public void mo2056b(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                AppCompatActivity context = this.f347132a.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C75026b.m89951a(context, this.f347132a.getResources().getString(C0966R.string.iak));
            }
        }

        /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI$d$b */
        public static final class C115683b implements C98250h.C98251a {

            /* renamed from: a */
            public final /* synthetic */ ScanTranslationResultUI f347133a;

            public C115683b(ScanTranslationResultUI scanTranslationResultUI) {
                this.f347133a = scanTranslationResultUI;
            }

            /* renamed from: a */
            public void mo2055a(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                AppCompatActivity context = this.f347133a.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C75026b.m89951a(context, this.f347133a.getResources().getString(C0966R.string.ier));
            }

            /* renamed from: b */
            public void mo2056b(String str, String str2) {
                C87412m.m108594g(str, "srcPath");
                C87412m.m108594g(str2, "destPath");
                AppCompatActivity context = this.f347133a.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                C75026b.m89951a(context, this.f347133a.getResources().getString(C0966R.string.iak));
            }
        }

        public C115681d(ScanTranslationResultUI scanTranslationResultUI) {
            this.f347131d = scanTranslationResultUI;
        }

        public final void onClick(View view) {
            Class cls = C98250h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ScanTranslationResultUI scanTranslationResultUI = this.f347131d;
            int i = scanTranslationResultUI.f347124x;
            if (i == 2) {
                try {
                    scanTranslationResultUI.f347104B.f343796l = 1;
                    String str = scanTranslationResultUI.f347119s;
                    if (str != null) {
                        ((C98250h) C86312j.m106911c(cls)).mo137346Zv(scanTranslationResultUI.getContext(), str, new C115682a(scanTranslationResultUI));
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e, "copy to gallery error", new Object[0]);
                }
            } else if (i == 3) {
                try {
                    scanTranslationResultUI.f347104B.f343795k = 1;
                    if (scanTranslationResultUI.f347126z == 0) {
                        try {
                            scanTranslationResultUI.f347120t = ((C115674p) C86312j.m106911c(C115674p.class)).Ax0("jpg");
                            ScanTranslationResultUI scanTranslationResultUI2 = this.f347131d;
                            BitmapUtil.saveBitmapToImage(scanTranslationResultUI2.f347118r, 80, Bitmap.CompressFormat.JPEG, scanTranslationResultUI2.f347120t, false);
                        } catch (IOException e2) {
                            Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e2, "save translate result file error", new Object[0]);
                        }
                    }
                    ScanTranslationResultUI scanTranslationResultUI3 = this.f347131d;
                    String str2 = scanTranslationResultUI3.f347120t;
                    if (str2 != null) {
                        ((C98250h) C86312j.m106911c(cls)).mo137346Zv(scanTranslationResultUI3.getContext(), str2, new C115683b(scanTranslationResultUI3));
                    }
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e3, "save to gallery error", new Object[0]);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static final void m162752H7(ScanTranslationResultUI scanTranslationResultUI) {
        scanTranslationResultUI.getClass();
        Class cls = C115674p.class;
        Log.m105924i("MicroMsg.ScanTranslationResultUI", "alvinluo enterTranslateFinishStatus");
        scanTranslationResultUI.f347124x = 3;
        View view = scanTranslationResultUI.f347107d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateFinishStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (C112551y.m153809i(scanTranslationResultUI.f347125y, "zh_CN", true)) {
                ImageView imageView = scanTranslationResultUI.f347108e;
                if (imageView != null) {
                    imageView.setImageResource(C0966R.C0969drawable.ayn);
                } else {
                    C87412m.m108603p("viewSourceBtn");
                    throw null;
                }
            } else {
                ImageView imageView2 = scanTranslationResultUI.f347108e;
                if (imageView2 != null) {
                    imageView2.setImageResource(C0966R.C0969drawable.ayp);
                } else {
                    C87412m.m108603p("viewSourceBtn");
                    throw null;
                }
            }
            ImageView imageView3 = scanTranslationResultUI.f347112i;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
                scanTranslationResultUI.mo175979M7();
                if (scanTranslationResultUI.f347126z == 1 && Util.isNullOrNil(scanTranslationResultUI.f347120t)) {
                    String Ax0 = ((C115674p) C86312j.m106911c(cls)).Ax0("jpg");
                    scanTranslationResultUI.f347120t = Ax0;
                    try {
                        BitmapUtil.saveBitmapToImage(scanTranslationResultUI.f347118r, 80, Bitmap.CompressFormat.JPEG, Ax0, false);
                        C30383k1 k1Var = new C30383k1();
                        k1Var.field_originMD5 = MD5Util.getMD5String(scanTranslationResultUI.f347119s + C86013q1.m106452m(scanTranslationResultUI.f347119s));
                        String str = scanTranslationResultUI.f347120t;
                        k1Var.field_resultFile = str;
                        Log.m105925i("MicroMsg.ScanTranslationResultUI", "insert translate result %s", str);
                        ((C115674p) C86312j.m106911c(cls)).Cx0().mo60805Lo(k1Var);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e, "save translate result file error", new Object[0]);
                    }
                }
            } else {
                C87412m.m108603p("scanLine");
                throw null;
            }
        } else {
            C87412m.m108603p("saveContainer");
            throw null;
        }
    }

    /* renamed from: A4 */
    public final void mo175974A4() {
        this.f347104B.f343790f = 2;
        this.f347123w = (int) ((((long) C75592q0.m90789s().hashCode()) + System.currentTimeMillis()) & -1);
        this.f347124x = 1;
        mo175977K7();
        if (C112551y.m153809i(this.f347125y, "zh_CN", true)) {
            ImageView imageView = this.f347108e;
            if (imageView != null) {
                imageView.setImageResource(C0966R.raw.translation_result_chinese);
            } else {
                C87412m.m108603p("viewSourceBtn");
                throw null;
            }
        } else {
            ImageView imageView2 = this.f347108e;
            if (imageView2 != null) {
                imageView2.setImageResource(C0966R.raw.translation_result_english);
            } else {
                C87412m.m108603p("viewSourceBtn");
                throw null;
            }
        }
        View view = this.f347110g;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f347111h;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view5 = this.f347107d;
                if (view5 != null) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/scanner/ui/ScanTranslationResultUI", "enterTranslateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ImageView imageView3 = this.f347112i;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                        MMGestureGallery mMGestureGallery = this.f347114n;
                        if (mMGestureGallery != null) {
                            mMGestureGallery.setVisibility(0);
                            this.f347116p.setRepeatMode(1);
                            this.f347116p.setRepeatCount(-1);
                            this.f347116p.start();
                            try {
                                Log.m105924i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation");
                                if (!Util.isNullOrNil(this.f347119s) && this.f347117q != null) {
                                    this.f347121u = C118679t.m167368c(this.f347119s);
                                    String str = this.f347119s;
                                    int i = this.f347126z;
                                    if (i == 0) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        BitmapUtil.saveBitmapToImage(this.f347117q, 80, Bitmap.CompressFormat.JPEG, this.f347119s, false);
                                        Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation save img cost %d", Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis)));
                                        Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation fileSize %d", Long.valueOf(C86013q1.m106451l(this.f347119s)));
                                    } else if (i == 1) {
                                        C38543c8 jo = ((C115674p) C86312j.m106911c(C115674p.class)).Cx0().mo60806jo(MD5Util.getMD5String(this.f347119s + C86013q1.m106452m(this.f347119s)));
                                        if (jo != null) {
                                            Log.m105924i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation already has translation result");
                                            String str2 = jo.field_resultFile;
                                            this.f347120t = str2;
                                            Bitmap decodeFile = BitmapUtil.decodeFile(str2, new BitmapFactory.Options());
                                            this.f347118r = decodeFile;
                                            if (decodeFile != null) {
                                                MMHandlerThread.postToMainThreadDelayed(new C115692o(this), 500);
                                                return;
                                            }
                                            Log.m105928w("MicroMsg.ScanTranslationResultUI", "can not find old translation result!");
                                        }
                                        if (this.f347103A != 0) {
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            String wM = ((C115670k) C86312j.m106911c(C115670k.class)).mo57347wM("jpg");
                                            BitmapUtil.saveBitmapToImage(this.f347117q, 80, Bitmap.CompressFormat.JPEG, wM, false);
                                            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation save img cost %d", Integer.valueOf((int) (System.currentTimeMillis() - currentTimeMillis2)));
                                            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo doTranslation fileSize %d", Long.valueOf(C86013q1.m106451l(wM)));
                                            str = wM;
                                        }
                                    }
                                    this.f347105C[1] = System.currentTimeMillis();
                                    String str3 = this.f347121u;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    C118679t.m167367a(str3, str == null ? "" : str, 2, new C115693p(this, str));
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.ScanTranslationResultUI", e, "", new Object[0]);
                            }
                        } else {
                            C87412m.m108603p("gestureGallery");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("scanLine");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("saveContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("bottomBgLayer");
                throw null;
            }
        } else {
            C87412m.m108603p("topBgLayer");
            throw null;
        }
    }

    /* renamed from: I7 */
    public final void mo175975I7() {
        finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    /* renamed from: J7 */
    public final void mo175976J7(String str) {
        mo175979M7();
        OCRTranslateReportStruct oCRTranslateReportStruct = this.f347104B;
        oCRTranslateReportStruct.f343790f = 5;
        oCRTranslateReportStruct.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347105C[1]));
        String string = getResources().getString(C0966R.string.ien);
        C87412m.m108593f(string, "resources.getString(com.…an_translating_no_result)");
        if (!Util.isNullOrNil(str)) {
            string = String.valueOf(str);
        }
        C76879j.m92713G(getContext(), string, "", false, new C106089h(this));
    }

    /* renamed from: K7 */
    public final void mo175977K7() {
        if (C112551y.m153809i(LocaleUtil.getApplicationLanguage(), "zh_CN", true)) {
            this.f347125y = LocaleUtil.getCurrentLanguage(getContext());
        } else {
            this.f347125y = LocaleUtil.getCurrentLanguage(getContext());
        }
        Log.m105925i("MicroMsg.ScanTranslationResultUI", "targetLang %s", this.f347125y);
    }

    /* renamed from: L7 */
    public final void mo175978L7(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo setImageBitmap size: %s, %s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            C94506a aVar = this.f347115o;
            if (aVar != null) {
                aVar.f273278d = bitmap;
            }
            C94506a aVar2 = this.f347115o;
            if (aVar2 != null) {
                aVar2.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: M7 */
    public final void mo175979M7() {
        this.f347116p.setRepeatMode(1);
        this.f347116p.setRepeatCount(0);
        this.f347116p.end();
    }

    /* renamed from: W6 */
    public void mo175938W6(int i, Bitmap bitmap) {
        ((C119157j) C119157j.f356862d).mo183895z(new C115679b(i, bitmap, this));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b4z;
    }

    public final void init() {
        View findViewById = findViewById(C0966R.C0970id.iwf);
        C87412m.m108593f(findViewById, "findViewById(R.id.root_container)");
        this.f347113j = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ktz);
        C87412m.m108593f(findViewById2, "findViewById(R.id.translate_gallery_view)");
        this.f347114n = (MMGestureGallery) findViewById2;
        C94506a aVar = new C94506a();
        this.f347115o = aVar;
        MMGestureGallery mMGestureGallery = this.f347114n;
        if (mMGestureGallery != null) {
            mMGestureGallery.setAdapter(aVar);
            View findViewById3 = findViewById(C0966R.C0970id.j0u);
            C87412m.m108593f(findViewById3, "findViewById(R.id.save_translate_container)");
            this.f347107d = findViewById3;
            View findViewById4 = findViewById3.findViewById(C0966R.C0970id.ku4);
            C87412m.m108593f(findViewById4, "saveContainer.findViewBy…ranslate_view_source_btn)");
            ImageView imageView = (ImageView) findViewById4;
            this.f347108e = imageView;
            imageView.setOnClickListener(new C115680c(this));
            View findViewById5 = findViewById(C0966R.C0970id.f359421ku3);
            C87412m.m108593f(findViewById5, "findViewById(R.id.translate_top_bg)");
            this.f347110g = findViewById5;
            View findViewById6 = findViewById(C0966R.C0970id.ktw);
            C87412m.m108593f(findViewById6, "findViewById(R.id.translate_bottom_bg)");
            this.f347111h = findViewById6;
            hideTitleView();
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.mo91104o();
            }
            View findViewById7 = findViewById(C0966R.C0970id.j1e);
            C87412m.m108593f(findViewById7, "findViewById(R.id.scan_line)");
            this.f347112i = (ImageView) findViewById7;
            View view = this.f347107d;
            if (view != null) {
                View findViewById8 = view.findViewById(C0966R.C0970id.kty);
                C87412m.m108593f(findViewById8, "saveContainer.findViewBy…d.translate_download_btn)");
                this.f347109f = findViewById8;
                findViewById8.setOnClickListener(new C115681d(this));
                View findViewById9 = findViewById(C0966R.C0970id.bee);
                C87412m.m108593f(findViewById9, "findViewById(R.id.close_button)");
                ((WeImageView) findViewById9).setOnClickListener(new C106086e(this));
                this.f347122v = C76577a.m92159j(getContext());
                this.f347116p.setFloatValues(new float[]{0.0f, 1.0f});
                this.f347116p.addListener(new C106087f(this));
                this.f347116p.addUpdateListener(new C106088g(this));
                View view2 = this.f347107d;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin += C85875k4.m106188j(getContext());
                    View view3 = this.f347107d;
                    if (view3 != null) {
                        view3.setLayoutParams(layoutParams2);
                        this.f347116p.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        C88990b.m111194c(this, (C88990b.C61771c) null);
                        mo175977K7();
                        return;
                    }
                    C87412m.m108603p("saveContainer");
                    throw null;
                }
                C87412m.m108603p("saveContainer");
                throw null;
            }
            C87412m.m108603p("saveContainer");
            throw null;
        }
        C87412m.m108603p("gestureGallery");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 561 && i2 == -1) {
            String b = C7013o.m7260b(getContext(), intent, C7970a.m8127a());
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "select: [%s]", b);
            if (!Util.isNullOrNil(b)) {
                this.f347119s = b;
                this.f347126z = 1;
                this.f347104B.f343788d = 2;
                int orientationInDegree = Exif.fromFile(b).getOrientationInDegree();
                this.f347103A = orientationInDegree;
                Log.m105925i("MicroMsg.ScanTranslationResultUI", "degree %s", Integer.valueOf(orientationInDegree));
                Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(b);
                if (decodeFileWithSample != null) {
                    this.f347117q = BitmapUtil.rotate(decodeFileWithSample, (float) this.f347103A);
                    mo175974A4();
                    mo175978L7(this.f347117q);
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getController().mo177103x0(getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
        init();
        String stringExtra = getIntent().getStringExtra("key_translation_origin_image_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f347119s = stringExtra;
        int intExtra = getIntent().getIntExtra("key_translation_source", 0);
        this.f347126z = intExtra;
        if (intExtra == 0) {
            this.f347104B.f343789e = getIntent().getLongExtra("key_translation_capture_time", 0);
            this.f347104B.f343788d = 1;
        } else if (intExtra == 1) {
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f347104B;
            oCRTranslateReportStruct.f343789e = 0;
            oCRTranslateReportStruct.f343788d = 2;
        }
        Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo initData originPath: %s, source: %d", this.f347119s, Integer.valueOf(this.f347126z));
        String str = this.f347119s;
        C87412m.m108591d(str);
        Bitmap bitmap = C57318j1.f164194a.get(str);
        this.f347117q = bitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmap2 = this.f347117q;
            C87412m.m108591d(bitmap2);
            Bitmap bitmap3 = this.f347117q;
            C87412m.m108591d(bitmap3);
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo initData bitmap width: %d, height: %d", Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap3.getHeight()));
        }
        mo175978L7(this.f347117q);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f347116p.removeAllListeners();
        this.f347116p.removeAllUpdateListeners();
        this.f347116p.cancel();
        ConcurrentHashMap<String, Bitmap> concurrentHashMap = C57318j1.f164194a;
        ((C119157j) C119157j.f356862d).mo183875f(C57316i1.f164189d);
        C7335d c = C86312j.m106911c(C115674p.class);
        C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.PluginScanTranslation");
        C118684u Bx0 = ((C115674p) c).Bx0();
        Bx0.f355144a = 0;
        Bx0.f355145b = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C7335d c = C86312j.m106911c(C115674p.class);
        C87412m.m108592e(c, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.PluginScanTranslation");
        C118684u Bx0 = ((C115674p) c).Bx0();
        Bx0.f355144a = 0;
        Bx0.f355145b = null;
        int i2 = this.f347124x;
        if (i2 == 0) {
            mo175975I7();
        } else if (i2 == 1 || i2 == 2 || i2 == 3) {
            if (i2 == 1) {
                this.f347104B.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347105C[1]));
            }
            OCRTranslateReportStruct oCRTranslateReportStruct = this.f347104B;
            if (oCRTranslateReportStruct.f343790f != 0) {
                oCRTranslateReportStruct.mo86054n();
            }
            mo175975I7();
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107524d().mo123470p(JsApiOperateRecorder.CTRL_INDEX, this);
    }

    public void onResume() {
        super.onResume();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(2097280);
        }
        if (C11171e.m11046c(19)) {
            getWindow().addFlags(67109888);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        C103928o.m138642b();
        C86709a0.m107524d().mo123455a(JsApiOperateRecorder.CTRL_INDEX, this);
        Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo onResume curState: %d", Integer.valueOf(this.f347124x));
        if (this.f347124x == -1) {
            mo175974A4();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C115674p.class;
        C115672t tVar = yVar instanceof C115672t ? (C115672t) yVar : null;
        if (tVar != null) {
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo scanTranslate onSceneEnd errType %s, errCode %s, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            Log.m105925i("MicroMsg.ScanTranslationResultUI", "TranslationSpr useNewCgi: %d newOcrmt: %s", 1, String.valueOf(tVar.f347019n));
            if (i == 0 && i2 == 0) {
                C115672t tVar2 = (C115672t) yVar;
                if (tVar2.f347019n) {
                    this.f347106D = ((C115674p) C86312j.m106911c(cls)).Ex0(this.f347123w, tVar2, this);
                    return;
                }
                int i3 = this.f347123w;
                List<bk4> list = tVar.f347015g;
                if (list != null && tVar.f347016h == i3) {
                    this.f347104B.f343792h = (long) ((int) (System.currentTimeMillis() - tVar.f347017i));
                    LinkedList linkedList = (LinkedList) list;
                    Log.m105925i("MicroMsg.ScanTranslationResultUI", "alvinluo scanTranslate onSceneEnd angle %f, translationInfos length %d", Float.valueOf(tVar.mo175931j1()), Integer.valueOf(linkedList.size()));
                    if (linkedList.size() > 0) {
                        this.f347104B.f343790f = 1;
                        ((C115674p) C86312j.m106911c(cls)).Bx0().mo183403e(i3, list, tVar.mo175931j1(), this.f347117q, this);
                        if (!Util.isNullOrNil(tVar.mo175932k1())) {
                            this.f347125y = tVar.mo175932k1();
                            return;
                        }
                        return;
                    }
                    this.f347104B.f343793i = (long) ((int) (System.currentTimeMillis() - this.f347105C[1]));
                    String string = getResources().getString(C0966R.string.ien);
                    C87412m.m108593f(string, "resources.getString(com.…an_translating_no_result)");
                    C76879j.m92713G(getContext(), string, "", false, new C106097q(this));
                    return;
                }
                return;
            }
            mo175976J7(str);
        }
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(JsApiOperateRecorder.CTRL_INDEX, this);
    }
}
