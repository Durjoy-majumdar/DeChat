package com.tencent.p014mm.plugin.subapp.p109ui.gallery;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
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
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
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
import p749xh.C38543c8;
import sk2.C101643c;
import sk2.C101644d;
import sk2.C101645e;
import tk2.C101903a;
import tk2.C22543c;

/* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic */
public class GestureGalleryTransAndOcrLogic {

    /* renamed from: a */
    public C94533d.C94534a f282236a;

    /* renamed from: b */
    public C94533d f282237b;

    /* renamed from: c */
    public volatile int f282238c;

    /* renamed from: d */
    public int f282239d = 0;

    /* renamed from: e */
    public C96469d f282240e;

    /* renamed from: f */
    public MMActivity f282241f;

    /* renamed from: g */
    public C96468c f282242g;

    /* renamed from: h */
    public ImageView f282243h;

    /* renamed from: i */
    public ImageView f282244i;

    /* renamed from: j */
    public ImageView f282245j;

    /* renamed from: k */
    public ValueAnimator f282246k;

    /* renamed from: l */
    public boolean f282247l;

    /* renamed from: m */
    public IListener<ScanTranslationResultEvent> f282248m = new IListener<ScanTranslationResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1699517927;
        }

        public boolean callback(IEvent iEvent) {
            ScanTranslationResultEvent scanTranslationResultEvent = (ScanTranslationResultEvent) iEvent;
            Log.m105925i("MicroMsg.GestureGalleryTransLogic", "scanTranslationResult %d, %s", Integer.valueOf(scanTranslationResultEvent.f265089d.f265090a), Boolean.valueOf(scanTranslationResultEvent.f265089d.f265092c));
            MMHandlerThread.postToMainThread(new C96511a(this, scanTranslationResultEvent));
            return true;
        }
    };

    /* renamed from: n */
    public C29060q f282249n = new C96465a();

    /* renamed from: o */
    public C101903a f282250o = null;

    /* renamed from: p */
    public long f282251p = 0;

    /* renamed from: q */
    public C22543c f282252q = new C96467b();

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$a */
    public class C96465a extends C29060q.C29061a {

        /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$a$a */
        public class C96466a implements Runnable {
            public C96466a() {
            }

            public void run() {
                if (C86709a0.m107524d().mo123467m() != 6 && C86709a0.m107524d().mo123467m() != 4) {
                    GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = GestureGalleryTransAndOcrLogic.this;
                    if (gestureGalleryTransAndOcrLogic.f282239d == 1) {
                        MMActivity mMActivity = gestureGalleryTransAndOcrLogic.f282241f;
                        C76879j.m92748s(mMActivity, mMActivity.getString(C0966R.string.f360087a11), "");
                        GestureGalleryTransAndOcrLogic.this.mo134452e();
                    }
                }
            }
        }

        public C96465a() {
        }

        public void onNetworkChange(int i) {
            MMHandlerThread.postToMainThread(new C96466a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$b */
    public class C96467b implements C22543c {
        public C96467b() {
        }

        /* renamed from: a */
        public void mo35638a(DialogInterface dialogInterface) {
            C96468c cVar = GestureGalleryTransAndOcrLogic.this.f282242g;
            if (cVar != null) {
                ((GestureGalleryUI) cVar).mo134464c8();
            }
        }

        /* renamed from: b */
        public void mo35639b(long j) {
            C96468c cVar = GestureGalleryTransAndOcrLogic.this.f282242g;
            if (cVar != null) {
                GestureGalleryUI gestureGalleryUI = (GestureGalleryUI) cVar;
                gestureGalleryUI.f282288X0 = true;
                MMGestureGallery mMGestureGallery = gestureGalleryUI.f282298e;
                if (mMGestureGallery != null) {
                    mMGestureGallery.f56433o = true;
                }
            }
        }

        /* renamed from: c */
        public void mo35640c(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.GestureGalleryTransLogic", "dealWithImageOcr onDialogShow");
            C96468c cVar = GestureGalleryTransAndOcrLogic.this.f282242g;
            if (cVar != null) {
                ((GestureGalleryUI) cVar).f282279T.setVisibility(4);
            }
            GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = GestureGalleryTransAndOcrLogic.this;
            gestureGalleryTransAndOcrLogic.f282243h.setVisibility(8);
            gestureGalleryTransAndOcrLogic.f282244i.setVisibility(8);
            gestureGalleryTransAndOcrLogic.f282245j.setVisibility(8);
            gestureGalleryTransAndOcrLogic.mo134453f();
        }

        /* renamed from: d */
        public void mo35641d(DialogInterface dialogInterface) {
            C96468c cVar = GestureGalleryTransAndOcrLogic.this.f282242g;
            if (cVar != null) {
                ((GestureGalleryUI) cVar).mo134464c8();
            }
        }

        public void onError(int i, int i2) {
            C96468c cVar = GestureGalleryTransAndOcrLogic.this.f282242g;
            if (cVar != null) {
                ((GestureGalleryUI) cVar).mo134464c8();
            }
            GestureGalleryTransAndOcrLogic gestureGalleryTransAndOcrLogic = GestureGalleryTransAndOcrLogic.this;
            gestureGalleryTransAndOcrLogic.f282243h.setVisibility(8);
            gestureGalleryTransAndOcrLogic.f282244i.setVisibility(8);
            gestureGalleryTransAndOcrLogic.f282245j.setVisibility(8);
            gestureGalleryTransAndOcrLogic.mo134453f();
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$c */
    public interface C96468c {
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryTransAndOcrLogic$d */
    public interface C96469d {
    }

    public GestureGalleryTransAndOcrLogic(GestureGalleryUI gestureGalleryUI, C96469d dVar, C94533d.C94534a aVar, C96468c cVar, boolean z) {
        this.f282236a = aVar;
        this.f282241f = gestureGalleryUI;
        this.f282240e = dVar;
        this.f282247l = z;
        this.f282242g = cVar;
        this.f282244i = (ImageView) gestureGalleryUI.findViewById(C0966R.C0970id.j25);
        this.f282245j = (ImageView) this.f282241f.findViewById(C0966R.C0970id.f359121j23);
        this.f282243h = (ImageView) this.f282241f.findViewById(C0966R.C0970id.j26);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f282245j.getLayoutParams();
        layoutParams.bottomMargin += C85875k4.m106188j(this.f282241f);
        this.f282245j.setLayoutParams(layoutParams);
        this.f282245j.setOnClickListener(new C96512b(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f282246k = ofFloat;
        ofFloat.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        this.f282246k.addListener(new C96513c(this));
        this.f282246k.addUpdateListener(new C96514d(this, this.f282241f.getWindowManager().getDefaultDisplay().getHeight()));
        this.f282248m.alive();
    }

    /* renamed from: a */
    public boolean mo134448a() {
        C101903a aVar = this.f282250o;
        if (aVar == null || aVar.mo33392i()) {
            return false;
        }
        C96468c cVar = this.f282242g;
        if (cVar != null) {
            ((GestureGalleryUI) cVar).mo134464c8();
        }
        C101903a aVar2 = this.f282250o;
        if (aVar2 == null || !aVar2.mo33387d(this.f282251p)) {
            return false;
        }
        this.f282251p = 0;
        return true;
    }

    /* renamed from: b */
    public void mo134449b(View view, View view2, String str) {
        if (this.f282250o == null) {
            C101903a z802 = ((C101643c) C86312j.m106911c(C101643c.class)).z80(this.f282241f, 1);
            this.f282250o = z802;
            z802.mo33386c(view);
        }
        C101645e eVar = new C101645e();
        eVar.f297536e = 12;
        eVar.f297532a = System.currentTimeMillis();
        eVar.f297533b = 3;
        eVar.f297541j = false;
        eVar.f297542k = true;
        eVar.f297543l = 204;
        eVar.f297535d = str;
        this.f282243h.setVisibility(0);
        this.f282244i.setVisibility(0);
        this.f282245j.setVisibility(0);
        this.f282246k.setRepeatMode(1);
        this.f282246k.setRepeatCount(-1);
        this.f282246k.start();
        this.f282250o.mo33390g(view2);
        C101644d dVar = new C101644d();
        dVar.f297531b = true;
        this.f282251p = this.f282250o.mo33385b(eVar, dVar, this.f282252q);
    }

    /* renamed from: c */
    public void mo134450c() {
        GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f265618d = this.f282239d == 2 ? 1 : 0;
        galleryTranslateReportStruct.f265619e = 2;
        galleryTranslateReportStruct.f265620f = this.f282247l ? 6 : 5;
        galleryTranslateReportStruct.mo86054n();
    }

    /* renamed from: d */
    public void mo134451d() {
        String str = ((GestureGalleryUI) this.f282240e).f282302g;
        int i = this.f282239d;
        if ((i == 0 || i == 2) && !Util.isNullOrNil(str)) {
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265618d = this.f282239d == 2 ? 1 : 0;
            galleryTranslateReportStruct.f265619e = 3;
            galleryTranslateReportStruct.f265620f = this.f282247l ? 6 : 5;
            galleryTranslateReportStruct.mo86054n();
            this.f282238c = (int) (((long) C75592q0.m90789s().hashCode()) + System.currentTimeMillis());
            C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(str);
            int i2 = 5;
            if (Gb0 == null || !C86013q1.m106450k(Gb0.field_resultFile)) {
                if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
                    this.f282239d = 1;
                    this.f282243h.setVisibility(0);
                    this.f282244i.setVisibility(0);
                    this.f282245j.setVisibility(0);
                    this.f282246k.setRepeatMode(1);
                    this.f282246k.setRepeatCount(-1);
                    this.f282246k.start();
                } else {
                    MMActivity mMActivity = this.f282241f;
                    C76879j.m92748s(mMActivity, mMActivity.getString(C0966R.string.f360087a11), "");
                    mo134452e();
                }
                Log.m105925i("MicroMsg.GestureGalleryTransLogic", "try to translate img %s, sessionId %d", str, Integer.valueOf(this.f282238c));
                ScanTranslationEvent scanTranslationEvent = new ScanTranslationEvent();
                ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
                if (this.f282247l) {
                    i2 = 6;
                }
                aVar.f265086a = i2;
                aVar.f265088c = str;
                aVar.f265087b = this.f282238c;
                scanTranslationEvent.publish();
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("original_file_path", str);
            if (this.f282247l) {
                i2 = 6;
            }
            intent.putExtra("translate_source", i2);
            intent.setClassName(this.f282241f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
            MMActivity mMActivity2 = this.f282241f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            MMActivity mMActivity3 = mMActivity2;
            C117292a.m165358d(mMActivity3, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(mMActivity3, "com/tencent/mm/plugin/subapp/ui/gallery/GestureGalleryTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f282241f.finish();
            this.f282241f.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
    }

    /* renamed from: e */
    public void mo134452e() {
        this.f282239d = 0;
        this.f282243h.setVisibility(8);
        this.f282244i.setVisibility(8);
        this.f282245j.setVisibility(8);
        mo134453f();
    }

    /* renamed from: f */
    public void mo134453f() {
        this.f282246k.setRepeatMode(1);
        this.f282246k.setRepeatCount(0);
        this.f282246k.end();
    }
}
