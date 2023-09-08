package com.tencent.p014mm.plugin.fav.p047ui;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p200lx.C99716u;
import p749xh.C38543c8;

/* renamed from: com.tencent.mm.plugin.fav.ui.PhotoTransControl */
public class PhotoTransControl {

    /* renamed from: a */
    public C94533d.C94534a f269945a;

    /* renamed from: b */
    public C94533d f269946b;

    /* renamed from: c */
    public volatile int f269947c;

    /* renamed from: d */
    public int f269948d = 0;

    /* renamed from: e */
    public C93478b f269949e;

    /* renamed from: f */
    public MMActivity f269950f;

    /* renamed from: g */
    public ImageView f269951g;

    /* renamed from: h */
    public ImageView f269952h;

    /* renamed from: i */
    public ImageView f269953i;

    /* renamed from: j */
    public ValueAnimator f269954j;

    /* renamed from: k */
    public IListener<ScanTranslationResultEvent> f269955k = new IListener<ScanTranslationResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1699517927;
        }

        public boolean callback(IEvent iEvent) {
            ScanTranslationResultEvent scanTranslationResultEvent = (ScanTranslationResultEvent) iEvent;
            Log.m105925i("MicroMsg.PhotoTransControl", "scanTranslationResult %d, %s", Integer.valueOf(scanTranslationResultEvent.f265089d.f265090a), Boolean.valueOf(scanTranslationResultEvent.f265089d.f265092c));
            MMHandlerThread.postToMainThread(new C93495c2(this, scanTranslationResultEvent));
            return true;
        }
    };

    /* renamed from: l */
    public C29060q f269956l = new C93476a();

    /* renamed from: com.tencent.mm.plugin.fav.ui.PhotoTransControl$a */
    public class C93476a extends C29060q.C29061a {

        /* renamed from: com.tencent.mm.plugin.fav.ui.PhotoTransControl$a$a */
        public class C93477a implements Runnable {
            public C93477a() {
            }

            public void run() {
                if (C86709a0.m107524d().mo123467m() != 6 && C86709a0.m107524d().mo123467m() != 4) {
                    PhotoTransControl photoTransControl = PhotoTransControl.this;
                    if (photoTransControl.f269948d == 1) {
                        MMActivity mMActivity = photoTransControl.f269950f;
                        C76879j.m92748s(mMActivity, mMActivity.getString(C0966R.string.f360087a11), "");
                        PhotoTransControl.this.mo128355b();
                    }
                }
            }
        }

        public C93476a() {
        }

        public void onNetworkChange(int i) {
            MMHandlerThread.postToMainThread(new C93477a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.PhotoTransControl$b */
    public interface C93478b {
        /* renamed from: A4 */
        void mo86623A4();

        String getAesKey();

        /* renamed from: s2 */
        String mo86626s2();

        /* renamed from: u5 */
        String mo86627u5();

        /* renamed from: x3 */
        void mo86629x3();
    }

    public PhotoTransControl(MMActivity mMActivity, C93478b bVar, C94533d.C94534a aVar) {
        this.f269945a = aVar;
        this.f269950f = mMActivity;
        this.f269949e = bVar;
        this.f269952h = (ImageView) mMActivity.findViewById(C0966R.C0970id.j25);
        this.f269953i = (ImageView) this.f269950f.findViewById(C0966R.C0970id.f359121j23);
        this.f269951g = (ImageView) this.f269950f.findViewById(C0966R.C0970id.j26);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f269953i.getLayoutParams();
        layoutParams.bottomMargin += C85875k4.m106188j(this.f269950f);
        this.f269953i.setLayoutParams(layoutParams);
        this.f269953i.setOnClickListener(new C93497d2(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f269954j = ofFloat;
        ofFloat.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f269954j.addListener(new C93591e2(this));
        this.f269954j.addUpdateListener(new C93600f2(this, this.f269950f.getWindowManager().getDefaultDisplay().getHeight()));
        this.f269955k.alive();
    }

    /* renamed from: a */
    public void mo128354a() {
        String u5 = this.f269949e.mo86627u5();
        int i = this.f269948d;
        if ((i == 0 || i == 2) && !Util.isNullOrNil(u5)) {
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265620f = 5;
            galleryTranslateReportStruct.f265618d = this.f269948d == 2 ? 1 : 0;
            galleryTranslateReportStruct.f265619e = 3;
            galleryTranslateReportStruct.mo126621t(this.f269949e.mo86626s2());
            galleryTranslateReportStruct.mo126620s(this.f269949e.getAesKey());
            galleryTranslateReportStruct.mo86054n();
            this.f269947c = (int) (((long) C75592q0.m90789s().hashCode()) + System.currentTimeMillis());
            C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(u5);
            if (Gb0 == null || !C86013q1.m106450k(Gb0.field_resultFile)) {
                if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
                    this.f269948d = 1;
                    this.f269951g.setVisibility(0);
                    this.f269952h.setVisibility(0);
                    this.f269953i.setVisibility(0);
                    this.f269949e.mo86623A4();
                    this.f269954j.setRepeatMode(1);
                    this.f269954j.setRepeatCount(-1);
                    this.f269954j.start();
                } else {
                    MMActivity mMActivity = this.f269950f;
                    C76879j.m92748s(mMActivity, mMActivity.getString(C0966R.string.f360087a11), "");
                    mo128355b();
                }
                Log.m105925i("MicroMsg.PhotoTransControl", "try to translate img %s, sessionId %d", u5, Integer.valueOf(this.f269947c));
                ScanTranslationEvent scanTranslationEvent = new ScanTranslationEvent();
                ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
                aVar.f265086a = 2;
                aVar.f265088c = u5;
                aVar.f265087b = this.f269947c;
                scanTranslationEvent.publish();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("original_file_path", u5);
            intent.putExtra("translate_source", 5);
            intent.setClassName(this.f269950f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
            intent.putExtra("fileid", this.f269949e.mo86626s2());
            intent.putExtra("aeskey", this.f269949e.getAesKey());
            MMActivity mMActivity2 = this.f269950f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            MMActivity mMActivity3 = mMActivity2;
            C117292a.m165358d(mMActivity3, aVar2.mo10232b(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(mMActivity3, "com/tencent/mm/plugin/fav/ui/PhotoTransControl", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f269950f.finish();
            this.f269950f.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: b */
    public void mo128355b() {
        this.f269948d = 0;
        this.f269951g.setVisibility(8);
        this.f269952h.setVisibility(8);
        this.f269953i.setVisibility(8);
        this.f269949e.mo86629x3();
        this.f269954j.setRepeatMode(1);
        this.f269954j.setRepeatCount(0);
        this.f269954j.end();
    }

    /* renamed from: c */
    public void mo128356c() {
        this.f269954j.setRepeatMode(1);
        this.f269954j.setRepeatCount(0);
        this.f269954j.end();
        this.f269954j.removeAllUpdateListeners();
        this.f269955k.dead();
        C86709a0.m107529k().mo121129d(this.f269956l);
        this.f269945a = null;
        this.f269950f = null;
        this.f269949e = null;
    }

    /* renamed from: d */
    public void mo128357d(String str) {
        MMActivity mMActivity = this.f269950f;
        if (mMActivity != null && !mMActivity.isFinishing()) {
            if (this.f269946b == null) {
                this.f269946b = ((C99716u) C86312j.m106911c(C99716u.class)).B80(this.f269950f);
            }
            ((ImageWordScanDetailEngine) this.f269946b).mo130013b(str, this.f269945a);
        }
    }
}
