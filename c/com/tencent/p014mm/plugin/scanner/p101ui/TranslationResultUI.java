package com.tencent.p014mm.plugin.scanner.p101ui;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ChattingUIPhotoInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.AnimationLayout;
import com.tencent.p014mm.view.ViewAnimHelper;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import p159gw.C98250h;
import p749xh.C38543c8;

@C88989a(35)
/* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI */
public class TranslationResultUI extends MMActivity {

    /* renamed from: B */
    public static final /* synthetic */ int f273280B = 0;

    /* renamed from: A */
    public AnimationLayout f273281A;

    /* renamed from: d */
    public String f273282d;

    /* renamed from: e */
    public long f273283e;

    /* renamed from: f */
    public int f273284f;

    /* renamed from: g */
    public String f273285g;

    /* renamed from: h */
    public String f273286h;

    /* renamed from: i */
    public C38543c8 f273287i;

    /* renamed from: j */
    public Bitmap f273288j;

    /* renamed from: n */
    public C94511d f273289n;

    /* renamed from: o */
    public MMGestureGallery f273290o;

    /* renamed from: p */
    public MultiTouchImageView f273291p;

    /* renamed from: q */
    public ImageView f273292q;

    /* renamed from: r */
    public View f273293r;

    /* renamed from: s */
    public View f273294s;

    /* renamed from: t */
    public TextView f273295t;

    /* renamed from: u */
    public Rect f273296u;

    /* renamed from: v */
    public float f273297v;

    /* renamed from: w */
    public float f273298w;

    /* renamed from: x */
    public float f273299x;

    /* renamed from: y */
    public float f273300y;

    /* renamed from: z */
    public boolean f273301z;

    /* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI$a */
    public class C94507a implements MMGestureGallery.C19842g {
        public C94507a() {
        }

        /* renamed from: a */
        public void mo26370a() {
            TranslationResultUI translationResultUI = TranslationResultUI.this;
            int i = TranslationResultUI.f273280B;
            translationResultUI.mo129990H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI$b */
    public class C94508b implements Runnable {

        /* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI$b$a */
        public class C94509a implements Runnable {
            public C94509a() {
            }

            public void run() {
                TranslationResultUI translationResultUI = TranslationResultUI.this;
                C94511d dVar = translationResultUI.f273289n;
                dVar.f273306d = translationResultUI.f273288j;
                dVar.notifyDataSetChanged();
            }
        }

        public C94508b() {
        }

        public void run() {
            TranslationResultUI translationResultUI = TranslationResultUI.this;
            translationResultUI.f273288j = BitmapUtil.decodeFile(translationResultUI.f273287i.field_resultFile, (BitmapFactory.Options) null);
            if (TranslationResultUI.this.f273288j != null) {
                MMHandlerThread.postToMainThread(new C94509a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI$c */
    public class C94510c implements View.OnClickListener {
        public C94510c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/TranslationResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265619e = 7;
            TranslationResultUI translationResultUI = TranslationResultUI.this;
            galleryTranslateReportStruct.f265620f = (long) translationResultUI.f273284f;
            galleryTranslateReportStruct.mo126621t(translationResultUI.f273285g);
            galleryTranslateReportStruct.mo126620s(TranslationResultUI.this.f273286h);
            galleryTranslateReportStruct.mo86054n();
            TranslationResultUI translationResultUI2 = TranslationResultUI.this;
            String str = translationResultUI2.f273287i.field_resultFile;
            translationResultUI2.getClass();
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(translationResultUI2, str, new C71022w(translationResultUI2));
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.TranslationResultUI$d */
    public class C94511d extends BaseAdapter {

        /* renamed from: d */
        public Bitmap f273306d;

        public C94511d(C94507a aVar) {
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
            TranslationResultUI translationResultUI = TranslationResultUI.this;
            if (translationResultUI.f273291p == null) {
                translationResultUI.f273291p = new MultiTouchImageView(TranslationResultUI.this, 0, 0);
                TranslationResultUI.this.f273291p.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                TranslationResultUI.this.f273291p.mo26059d();
            }
            Bitmap bitmap = this.f273306d;
            if (bitmap != null) {
                TranslationResultUI.this.f273291p.setImageBitmap(bitmap);
                MultiTouchImageView multiTouchImageView = TranslationResultUI.this.f273291p;
                int width = this.f273306d.getWidth();
                int height = this.f273306d.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
            }
            return TranslationResultUI.this.f273291p;
        }
    }

    /* renamed from: H7 */
    public final void mo129990H7() {
        Rect rect = this.f273296u;
        if (rect == null) {
            finish();
            overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        } else if (!this.f273301z) {
            this.f273301z = true;
            Log.m105925i("MicroMsg.TranslationResultUI", "runExitAnimation, thumbRect %s", rect);
            this.f273281A.mo136401a(this.f273292q, this.f273294s, new ViewAnimHelper.ViewInfo(this.f273296u), new C94526u(this), new C94527v(this));
        }
    }

    public boolean convertActivityFromTranslucent() {
        return false;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b0d;
    }

    public void initView() {
        this.f273294s = findViewById(C0966R.C0970id.iwf);
        this.f273293r = findViewById(C0966R.C0970id.j0t);
        this.f273292q = (ImageView) findViewById(C0966R.C0970id.ehi);
        this.f273281A = (AnimationLayout) findViewById(C0966R.C0970id.f5852qb);
        this.f273295t = (TextView) findViewById(C0966R.C0970id.f359419ku1);
        this.f273282d = getIntent().getStringExtra("original_file_path");
        this.f273283e = getIntent().getLongExtra("msg_id", -1);
        this.f273284f = getIntent().getIntExtra("translate_source", 0);
        this.f273296u = (Rect) getIntent().getParcelableExtra("thumb_location");
        this.f273285g = getIntent().getStringExtra("fileid");
        this.f273286h = getIntent().getStringExtra("aeskey");
        Log.m105925i("MicroMsg.TranslationResultUI", "file path %s", this.f273282d);
        if (!C86013q1.m106450k(this.f273282d)) {
            Log.m105920e("MicroMsg.TranslationResultUI", "translation original file not exist!");
        }
        View findViewById = findViewById(C0966R.C0970id.j0n);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.bottomMargin += C85875k4.m106188j(this);
        findViewById.setLayoutParams(layoutParams);
        getSupportActionBar().mo91104o();
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        getController().mo177103x0(getResources().getColor(C0966R.color.ahf));
        this.f273290o = (MMGestureGallery) findViewById(C0966R.C0970id.ku5);
        C94511d dVar = new C94511d((C94507a) null);
        this.f273289n = dVar;
        this.f273290o.setAdapter(dVar);
        this.f273290o.setSingleClickOverListener(new C94507a());
        C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(this.f273282d);
        this.f273287i = Gb0;
        if (Gb0 != null) {
            Bitmap bitmap = this.f273288j;
            if (bitmap == null) {
                ThreadPool.postAtFront(new C94508b(), "decode_translate_result_img");
            } else {
                C94511d dVar2 = this.f273289n;
                dVar2.f273306d = bitmap;
                dVar2.notifyDataSetChanged();
            }
            if (!Util.isNullOrNil(this.f273287i.field_brand)) {
                this.f273295t.setText(this.f273287i.field_brand);
                this.f273295t.setVisibility(0);
            }
            this.f273293r.setOnClickListener(new C94510c());
            View view = this.f273293r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/TranslationResultUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f273290o.setGalleryScaleListener(new C71021t(this));
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f273283e);
            if (this.f273283e != -1) {
                ChattingUIPhotoInfoEvent chattingUIPhotoInfoEvent = new ChattingUIPhotoInfoEvent();
                chattingUIPhotoInfoEvent.f193516d.f193518a = b002;
                chattingUIPhotoInfoEvent.publish();
                Rect rect = new Rect();
                this.f273296u = rect;
                ChattingUIPhotoInfoEvent.C67669b bVar = chattingUIPhotoInfoEvent.f193517e;
                int i = bVar.f193519a;
                rect.left = i;
                int i2 = bVar.f193520b;
                rect.top = i2;
                rect.right = bVar.f193521c + i;
                rect.bottom = bVar.f193522d + i2;
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.TranslationResultUI", "translation result not found!");
        mo129990H7();
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f273288j = null;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo129990H7();
        return true;
    }

    public void onResume() {
        super.onResume();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().getDecorView().setBackgroundDrawable((Drawable) null);
        getWindow().getDecorView().setSystemUiVisibility(5892);
    }
}
