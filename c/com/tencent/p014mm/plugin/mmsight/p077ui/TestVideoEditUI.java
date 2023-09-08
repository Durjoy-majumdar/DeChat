package com.tencent.p014mm.plugin.mmsight.p077ui;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.io.IOException;
import p248ug.C111159e;
import p248ug.C111161j0;
import p248ug.C111163p0;
import p248ug.C111164r0;
import p248ug.C111167t;
import p248ug.C111168v;
import p511ew.C58849b;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI */
public class TestVideoEditUI extends MMActivity implements C111168v {

    /* renamed from: e */
    public static final /* synthetic */ int f313899e = 0;

    /* renamed from: d */
    public C111164r0 f313900d;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI$b */
    public class C85289b implements C111161j0 {
        public C85289b(TestVideoEditUI testVideoEditUI) {
        }

        /* renamed from: a */
        public void mo79184a(Bitmap bitmap, boolean z) {
            Log.m105925i("MicroMsg.TestVideoEditUI", "[onSuccess] w:%s h:%s", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
            try {
                BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, C112760b.m154239k() + String.format("%s%d.%s", new Object[]{"wx_photo_edit_", Long.valueOf(System.currentTimeMillis()), "png"}), true);
            } catch (IOException unused) {
            }
        }

        /* renamed from: b */
        public void mo79185b(Exception exc) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.TestVideoEditUI$a */
    public class C105515a implements C111163p0 {
        public C105515a() {
        }

        /* renamed from: a */
        public void mo150361a(C111167t tVar) {
            Log.m105925i("MicroMsg.TestVideoEditUI", "[onSelectedFeature] features:%s", tVar.name());
        }

        /* renamed from: b */
        public void mo150362b(boolean z) {
            if (z) {
                TestVideoEditUI.this.showVKB();
                return;
            }
            TestVideoEditUI testVideoEditUI = TestVideoEditUI.this;
            int i = TestVideoEditUI.f313899e;
            testVideoEditUI.hideVKB(testVideoEditUI.getContentView());
        }

        /* renamed from: c */
        public void mo150363c(C111167t tVar, int i, Object obj) {
            Log.m105925i("MicroMsg.TestVideoEditUI", "[onSelectedDetailFeature] features:%s index:%s", tVar.name(), Integer.valueOf(i));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c8t;
    }

    /* renamed from: o0 */
    public void mo79182o0() {
        finish();
    }

    public void onBackPressed() {
        if (!this.f313900d.mo162896e()) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fullScreenNoTitleBar(true);
        C111164r0 ZD = ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD();
        this.f313900d = ZD;
        C111164r0.C111165a aVar = new C111164r0.C111165a();
        aVar.f332925b = false;
        aVar.f332926c = true;
        aVar.f332928e = new Rect(0, 0, 1080, 1080);
        aVar.f332924a = C111164r0.C111166b.VIDEO;
        ZD.mo162895d(aVar);
        C111159e c = this.f313900d.mo162894c(getContext());
        c.setActionBarCallback(this);
        ((FrameLayout) findViewById(C0966R.C0970id.br8)).addView(c, new FrameLayout.LayoutParams(-1, -1));
        c.setSelectedFeatureListener(new C105515a());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f313900d.mo162897f();
    }

    public void onFinish() {
        this.f313900d.mo162898g(new C85289b(this));
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
