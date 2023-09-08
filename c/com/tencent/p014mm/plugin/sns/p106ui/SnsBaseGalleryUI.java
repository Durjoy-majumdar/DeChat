package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import av2.C92126r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CancelDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.CancelScanTranslationEvent;
import com.tencent.p014mm.autogen.events.ReleaseDealQBarStrEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationEvent;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.autogen.events.SnsOCRImageEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateImageEvent;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.C94457b;
import com.tencent.p014mm.plugin.scanner.C94466j;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.plugin.scanner.word.ImageWordScanDetailEngine;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager;
import com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;
import nj3.C76879j;
import p200lx.C99711g0;
import p200lx.C99716u;
import p749xh.C38543c8;
import sk2.C101643c;
import sk2.C101644d;
import sk2.C101645e;
import te3.C101804kv2;
import te3.C101829pp1;
import tk2.C101903a;
import tk2.C101904b;
import tk2.C22543c;
import uk2.C14201c;
import xl2.C102690c;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI */
public abstract class SnsBaseGalleryUI extends MMActivity implements GalleryTitleManager.C95343c, SnsInfoFlip.C95554g, C94533d.C94534a<String, C102690c>, C94853e.C94861h {

    /* renamed from: N */
    public static final /* synthetic */ int f277739N = 0;

    /* renamed from: A */
    public FlipView$$n f277740A = new C95473b();

    /* renamed from: B */
    public FlipView$$o f277741B = new C95474c();

    /* renamed from: C */
    public View.OnLongClickListener f277742C = new C95475d();

    /* renamed from: D */
    public C95478g f277743D;

    /* renamed from: E */
    public long f277744E = 0;

    /* renamed from: F */
    public MMViewPager f277745F;

    /* renamed from: G */
    public C101903a f277746G = null;

    /* renamed from: H */
    public C101904b f277747H = ((C14201c) C86312j.m106911c(C14201c.class)).mo12579vD();

    /* renamed from: I */
    public C22543c f277748I = new C95476e();

    /* renamed from: J */
    public IListener<SnsTranslateImageEvent> f277749J;

    /* renamed from: K */
    public IListener<SnsOCRImageEvent> f277750K;

    /* renamed from: L */
    public IListener<ScanTranslationResultEvent> f277751L;

    /* renamed from: M */
    public C29060q f277752M;

    /* renamed from: d */
    public boolean f277753d = true;

    /* renamed from: e */
    public LinearLayout f277754e;

    /* renamed from: f */
    public C96087o0 f277755f;

    /* renamed from: g */
    public C96158q0 f277756g;

    /* renamed from: h */
    public LinearLayout f277757h;

    /* renamed from: i */
    public GalleryTitleManager f277758i;

    /* renamed from: j */
    public boolean f277759j = true;

    /* renamed from: n */
    public boolean f277760n = true;

    /* renamed from: o */
    public SnsInfoFlip f277761o;

    /* renamed from: p */
    public Button f277762p;

    /* renamed from: q */
    public int f277763q = 0;

    /* renamed from: r */
    public C94533d f277764r;

    /* renamed from: s */
    public int f277765s = 0;

    /* renamed from: t */
    public MultiCodeMaskView f277766t;

    /* renamed from: u */
    public ImageView f277767u;

    /* renamed from: v */
    public ImageView f277768v;

    /* renamed from: w */
    public ImageView f277769w;

    /* renamed from: x */
    public ValueAnimator f277770x;

    /* renamed from: y */
    public int f277771y = 0;

    /* renamed from: z */
    public int f277772z = -1;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$a */
    public class C95471a extends C29060q.C29061a {

        /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$a$a */
        public class C95472a implements Runnable {
            public C95472a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
                if (!(C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4)) {
                    SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
                    int i = SnsBaseGalleryUI.f277739N;
                    SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    int i2 = snsBaseGalleryUI.f277763q;
                    SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    if (i2 == 1) {
                        SnsBaseGalleryUI snsBaseGalleryUI2 = SnsBaseGalleryUI.this;
                        C76879j.m92748s(snsBaseGalleryUI2, snsBaseGalleryUI2.getString(C0966R.string.f360087a11), "");
                        SnsBaseGalleryUI.this.mo132602x3();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13$1");
            }
        }

        public C95471a() {
        }

        public void onNetworkChange(int i) {
            SnsMethodCalculate.markStartTimeMs("onNetworkChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
            MMHandlerThread.postToMainThread(new C95472a());
            SnsMethodCalculate.markEndTimeMs("onNetworkChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$13");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$b */
    public class C95473b implements FlipView$$n {
        public C95473b() {
        }

        /* renamed from: a */
        public void mo132169a() {
            SnsMethodCalculate.markStartTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$1");
            SnsBaseGalleryUI.m121910H7(SnsBaseGalleryUI.this).reset();
            SnsMethodCalculate.markEndTimeMs("onMenuDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$1");
        }

        /* renamed from: b */
        public void mo132170b(List<Integer> list) {
            SnsMethodCalculate.markStartTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$1");
            if (list != null && list.contains(1011)) {
                C101904b H7 = SnsBaseGalleryUI.m121910H7(SnsBaseGalleryUI.this);
                int R7 = SnsBaseGalleryUI.this.mo132589R7();
                SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                int i = snsBaseGalleryUI.f277765s;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                H7.mo10651a(2, R7, i);
            }
            SnsMethodCalculate.markEndTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$c */
    public class C95474c implements FlipView$$o {
        public C95474c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$d */
    public class C95475d implements View.OnLongClickListener {
        public C95475d() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
            SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
            if (snsInfoFlip == null) {
                SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            C101804kv2 cntMedia = snsInfoFlip.getCntMedia();
            if (cntMedia != null && cntMedia.f298690e == 2) {
                SnsBaseGalleryUI.this.mo132597Z7(C94901o.m120385m(SnsBaseGalleryUI.this.f277761o.getCntMedia()), true);
            }
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$e */
    public class C95476e implements C22543c {
        public C95476e() {
        }

        /* renamed from: a */
        public void mo35638a(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onDialogCancel", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
            SnsMethodCalculate.markEndTimeMs("onDialogCancel", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        }

        /* renamed from: b */
        public void mo35639b(long j) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
            SnsBaseGalleryUI.m121911I7(SnsBaseGalleryUI.this);
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        }

        /* renamed from: c */
        public void mo35640c(DialogInterface dialogInterface) {
            C96087o0 o0Var;
            C96158q0 q0Var;
            SnsMethodCalculate.markStartTimeMs("onDialogShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
            Log.m105924i("MicroMsg.SnsBaseGalleryUI", "alvinluo dealWithImageOcr onDialogShow");
            SnsBaseGalleryUI.m121911I7(SnsBaseGalleryUI.this);
            SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
            snsBaseGalleryUI.getClass();
            SnsMethodCalculate.markStartTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI.f277760n = false;
            snsBaseGalleryUI.setTitleVisibility(8);
            boolean z = snsBaseGalleryUI.f277753d;
            if (z && (q0Var = snsBaseGalleryUI.f277756g) != null) {
                q0Var.setVisibility(8);
            } else if (!z && (o0Var = snsBaseGalleryUI.f277755f) != null) {
                o0Var.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("titleBarGone", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            SnsBaseGalleryUI.this.mo132598a8();
            SnsMethodCalculate.markEndTimeMs("onDialogShow", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        }

        /* renamed from: d */
        public void mo35641d(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onDialogDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
            SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
            int i = SnsBaseGalleryUI.f277739N;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI.mo132593V7();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            SnsMethodCalculate.markEndTimeMs("onDialogDismiss", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        }

        public void onError(int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
            SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
            int i3 = SnsBaseGalleryUI.f277739N;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI.mo132593V7();
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            SnsBaseGalleryUI.this.mo132598a8();
            SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$f */
    public class C95477f implements View.OnClickListener {
        public C95477f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$5");
            SnsBaseGalleryUI.this.mo132583L7();
            SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            snsBaseGalleryUI.mo132584M7();
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$g */
    public interface C95478g {
        /* renamed from: a */
        void mo132606a(C101804kv2 kv22, int i, String str);
    }

    public SnsBaseGalleryUI() {
        C40008f fVar = C40008f.f107254d;
        this.f277749J = new IListener<SnsTranslateImageEvent>(fVar) {
            {
                this.__eventId = 1330515845;
            }

            public boolean callback(IEvent iEvent) {
                String str;
                String str2;
                char c;
                boolean z;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
                SnsTranslateImageEvent snsTranslateImageEvent = (SnsTranslateImageEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
                SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
                C101804kv2 kv22 = null;
                C101804kv2 cntMedia = snsInfoFlip != null ? snsInfoFlip.getCntMedia() : null;
                if (cntMedia != null && snsTranslateImageEvent.f265206d.f265207a.equals(cntMedia.f298689d)) {
                    SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
                    String m = C94901o.m120385m(cntMedia);
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    snsBaseGalleryUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("doTranslateImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    snsBaseGalleryUI.f277771y = (int) (((long) C75592q0.m90789s().hashCode()) + System.currentTimeMillis());
                    C38543c8 Gb0 = ((C94466j) C86312j.m106911c(C94466j.class)).Gb0(m);
                    if (Gb0 == null || !C86013q1.m106450k(Gb0.field_resultFile)) {
                        str2 = "doTranslateImage";
                        str = "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI";
                        SnsMethodCalculate.markStartTimeMs("enterTranslateStatus", str);
                        if (C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4) {
                            SnsInfoFlip snsInfoFlip2 = snsBaseGalleryUI.f277761o;
                            c = 1;
                            if (snsInfoFlip2 != null) {
                                snsInfoFlip2.setEnableSingleClickOver(true);
                            }
                            snsBaseGalleryUI.f277763q = 1;
                            snsBaseGalleryUI.mo132596Y7();
                            SnsMethodCalculate.markEndTimeMs("enterTranslateStatus", str);
                        } else {
                            C76879j.m92748s(snsBaseGalleryUI, snsBaseGalleryUI.getString(C0966R.string.f360087a11), "");
                            snsBaseGalleryUI.mo132602x3();
                            SnsMethodCalculate.markEndTimeMs("enterTranslateStatus", str);
                            c = 1;
                        }
                        Object[] objArr = new Object[2];
                        objArr[0] = m;
                        objArr[c] = Integer.valueOf(snsBaseGalleryUI.f277771y);
                        Log.m105925i("MicroMsg.SnsBaseGalleryUI", "try to translate img %s, sessionId %d", objArr);
                        ScanTranslationEvent scanTranslationEvent = new ScanTranslationEvent();
                        scanTranslationEvent.f265085d.f265086a = snsBaseGalleryUI.mo132590S7();
                        ScanTranslationEvent.C92559a aVar = scanTranslationEvent.f265085d;
                        aVar.f265088c = m;
                        aVar.f265087b = snsBaseGalleryUI.f277771y;
                        scanTranslationEvent.publish();
                    } else {
                        Intent intent = new Intent();
                        intent.putExtra("original_file_path", m);
                        intent.putExtra("translate_source", C94457b.m119485a(snsBaseGalleryUI.mo132590S7()));
                        if (snsBaseGalleryUI.getIntent().hasExtra("sns_gallery_thumb_location")) {
                            intent.putExtra("thumb_location", (Rect) snsBaseGalleryUI.getIntent().getParcelableExtra("sns_gallery_thumb_location"));
                        }
                        SnsInfoFlip snsInfoFlip3 = snsBaseGalleryUI.f277761o;
                        if (snsInfoFlip3 != null) {
                            kv22 = snsInfoFlip3.getCntMedia();
                        }
                        if (kv22 != null) {
                            intent.putExtra("fileid", kv22.f298692g);
                        }
                        intent.setClassName(snsBaseGalleryUI, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent);
                        SnsBaseGalleryUI snsBaseGalleryUI2 = snsBaseGalleryUI;
                        str2 = "doTranslateImage";
                        C117292a.m165358d(snsBaseGalleryUI2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI", "doTranslateImage", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        snsBaseGalleryUI.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(snsBaseGalleryUI2, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI", "doTranslateImage", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        str = "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI";
                        SnsMethodCalculate.markStartTimeMs("shouldFinishUIAfterTranslate", str);
                        if (snsBaseGalleryUI.mo132590S7() == 3) {
                            SnsMethodCalculate.markEndTimeMs("shouldFinishUIAfterTranslate", str);
                            z = true;
                        } else {
                            SnsMethodCalculate.markEndTimeMs("shouldFinishUIAfterTranslate", str);
                            z = false;
                        }
                        if (z) {
                            snsBaseGalleryUI.finish();
                        }
                        snsBaseGalleryUI.overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
                    }
                    SnsMethodCalculate.markEndTimeMs(str2, str);
                    SnsMethodCalculate.markEndTimeMs("access$700", str);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$10");
                return true;
            }
        };
        this.f277750K = new IListener<SnsOCRImageEvent>(fVar) {
            {
                this.__eventId = -1384491691;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                SnsOCRImageEvent snsOCRImageEvent = (SnsOCRImageEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                SnsInfoFlip snsInfoFlip = SnsBaseGalleryUI.this.f277761o;
                C101804kv2 cntMedia = snsInfoFlip != null ? snsInfoFlip.getCntMedia() : null;
                if (cntMedia != null && snsOCRImageEvent.f265173d.f265175b.equals(cntMedia.f298689d)) {
                    SnsBaseGalleryUI snsBaseGalleryUI = SnsBaseGalleryUI.this;
                    SnsOCRImageEvent.C92586a aVar = snsOCRImageEvent.f265173d;
                    int i = aVar.f265174a;
                    String str = aVar.f265176c;
                    SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    snsBaseGalleryUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("doOCRImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    if (snsBaseGalleryUI.f277745F == null) {
                        SnsInfoFlip snsInfoFlip2 = snsBaseGalleryUI.f277761o;
                        if (snsInfoFlip2 != null) {
                            snsBaseGalleryUI.f277745F = snsInfoFlip2.getGallery();
                        }
                        SnsMethodCalculate.markStartTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        MMViewPager mMViewPager = snsBaseGalleryUI.f277745F;
                        if (mMViewPager == null) {
                            SnsMethodCalculate.markEndTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        } else {
                            mMViewPager.setDoubleClickListener(new C96226t3(snsBaseGalleryUI));
                            SnsMethodCalculate.markEndTimeMs("initGallery", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                        }
                    }
                    if (snsBaseGalleryUI.f277746G == null) {
                        C101903a z802 = ((C101643c) C86312j.m106911c(C101643c.class)).z80(snsBaseGalleryUI, snsBaseGalleryUI.mo132589R7());
                        snsBaseGalleryUI.f277746G = z802;
                        z802.mo33386c(snsBaseGalleryUI.f277745F);
                    }
                    C101645e eVar = new C101645e();
                    eVar.f297536e = i;
                    eVar.f297532a = System.currentTimeMillis();
                    eVar.f297533b = 3;
                    eVar.f297541j = false;
                    eVar.f297542k = true;
                    try {
                        eVar.f297545n.putByteArray("key_sns_media_data", cntMedia.toByteArray());
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SnsBaseGalleryUI", e, "doOCRImage mediaObj to byte array exception", new Object[0]);
                    }
                    if (snsBaseGalleryUI instanceof SnsGalleryUI) {
                        eVar.f297543l = 203;
                    } else {
                        eVar.f297543l = 202;
                    }
                    eVar.f297544m.f297546a = str;
                    Log.m105919d("MicroMsg.SnsBaseGalleryUI", "alvinluo doOCRImage imagePath: %s, sourceUsername: %s, requestType: %s", eVar.f297535d, str, Integer.valueOf(i));
                    snsBaseGalleryUI.mo132596Y7();
                    SnsInfoFlip snsInfoFlip3 = snsBaseGalleryUI.f277761o;
                    if (snsInfoFlip3 != null) {
                        snsBaseGalleryUI.f277746G.mo33390g(snsInfoFlip3.getCurrentImageView());
                    }
                    C101644d dVar = new C101644d();
                    dVar.f297530a = snsBaseGalleryUI instanceof SnsBrowseUI;
                    dVar.f297531b = true;
                    snsBaseGalleryUI.f277747H.mo10651a(1, snsBaseGalleryUI.mo132589R7(), snsBaseGalleryUI.f277765s);
                    snsBaseGalleryUI.f277744E = snsBaseGalleryUI.f277746G.mo33385b(eVar, dVar, snsBaseGalleryUI.f277748I);
                    SnsMethodCalculate.markEndTimeMs("doOCRImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                    SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$11");
                return true;
            }
        };
        this.f277751L = new IListener<ScanTranslationResultEvent>(fVar) {
            {
                this.__eventId = -1699517927;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                ScanTranslationResultEvent scanTranslationResultEvent = (ScanTranslationResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                Log.m105925i("MicroMsg.SnsBaseGalleryUI", "scanTranslationResult %d, %s", Integer.valueOf(scanTranslationResultEvent.f265089d.f265090a), Boolean.valueOf(scanTranslationResultEvent.f265089d.f265092c));
                MMHandlerThread.postToMainThread(new C96196r3(this, scanTranslationResultEvent));
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$12");
                return true;
            }
        };
        this.f277752M = new C95471a();
    }

    /* renamed from: H7 */
    public static /* synthetic */ C101904b m121910H7(SnsBaseGalleryUI snsBaseGalleryUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        C101904b bVar = snsBaseGalleryUI.f277747H;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return bVar;
    }

    /* renamed from: I7 */
    public static void m121911I7(SnsBaseGalleryUI snsBaseGalleryUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        snsBaseGalleryUI.getClass();
        SnsMethodCalculate.markStartTimeMs("onImageOCRStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip = snsBaseGalleryUI.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(false);
            snsBaseGalleryUI.f277761o.setShowLongClickMenu(false);
        }
        MMViewPager mMViewPager = snsBaseGalleryUI.f277745F;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(false);
            snsBaseGalleryUI.f277745F.setSingleMode(true);
        }
        SnsMethodCalculate.markEndTimeMs("onImageOCRStart", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: J7 */
    public static /* synthetic */ ImageView m121912J7(SnsBaseGalleryUI snsBaseGalleryUI) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        ImageView imageView = snsBaseGalleryUI.f277767u;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return imageView;
    }

    /* renamed from: K7 */
    public void mo132582K7(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f277753d) {
            C96158q0 q0Var = new C96158q0(this, i, z);
            this.f277756g = q0Var;
            q0Var.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.f277756g.getBackground().setAlpha(50);
            this.f277757h.addView(this.f277756g, layoutParams);
            this.f277756g.setSnsSource(getIntent().getIntExtra("sns_source", 0));
        } else {
            C96087o0 o0Var = new C96087o0(this, i, z);
            this.f277755f = o0Var;
            o0Var.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            this.f277755f.getBackground().setAlpha(50);
            this.f277757h.addView(this.f277755f, layoutParams2);
            this.f277755f.setSnsSource(getIntent().getIntExtra("sns_source", 0));
        }
        SnsMethodCalculate.markEndTimeMs("buildFoot", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: L7 */
    public boolean mo132583L7() {
        SnsMethodCalculate.markStartTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        mo132593V7();
        C101903a aVar = this.f277746G;
        if (aVar == null || !aVar.mo33387d(this.f277744E)) {
            SnsMethodCalculate.markEndTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("cancelImageOCR", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return true;
    }

    /* renamed from: M7 */
    public final boolean mo132584M7() {
        SnsMethodCalculate.markStartTimeMs("cancelTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f277763q == 1) {
            CancelScanTranslationEvent cancelScanTranslationEvent = new CancelScanTranslationEvent();
            CancelScanTranslationEvent.C92467a aVar = cancelScanTranslationEvent.f264645d;
            aVar.f264646a = 1;
            aVar.f264647b = this.f277771y;
            cancelScanTranslationEvent.publish();
        }
        boolean isRunning = this.f277770x.isRunning();
        SnsMethodCalculate.markStartTimeMs("resetTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        mo132602x3();
        SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277771y = 0;
        SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("resetTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("cancelTranslate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return isRunning;
    }

    /* renamed from: N7 */
    public final void mo132585N7(String str) {
        SnsMethodCalculate.markStartTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f277764r == null) {
            this.f277764r = ((C99716u) C86312j.m106911c(C99716u.class)).B80(this);
        }
        if (!Util.isNullOrNil(str)) {
            Point point = null;
            if (!(str == null || str.length() == 0) && C86013q1.m106450k(str)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98735d(str, options);
                point = new Point(options.outWidth, options.outHeight);
            }
            if (point == null || !((C99711g0) C86312j.m106911c(C99711g0.class)).cq0(point.x, point.y)) {
                ((ImageWordScanDetailEngine) this.f277764r).mo130013b(str, this);
            } else {
                Log.m105925i("MicroMsg.SnsBaseGalleryUI", "doWordDetectImage image overRatioLimit: %s", point);
                boolean Ak0 = ((C101643c) C86312j.m106911c(C101643c.class)).Ak0();
                this.f277765s = 1;
                mo132600b8(false, Ak0);
                SnsMethodCalculate.markEndTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("doWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: O7 */
    public C96087o0 mo132586O7() {
        SnsMethodCalculate.markStartTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        C96087o0 o0Var = this.f277755f;
        SnsMethodCalculate.markEndTimeMs("getFooter", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return o0Var;
    }

    /* renamed from: P7 */
    public C96158q0 mo132587P7() {
        SnsMethodCalculate.markStartTimeMs("getFooterNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        C96158q0 q0Var = this.f277756g;
        SnsMethodCalculate.markEndTimeMs("getFooterNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return q0Var;
    }

    /* renamed from: Q7 */
    public int mo132588Q7() {
        SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int intExtra = getIntent().getIntExtra("key_from_scene", 0);
        SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return intExtra;
    }

    /* renamed from: R7 */
    public int mo132589R7() {
        SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return 3;
    }

    /* renamed from: S7 */
    public int mo132590S7() {
        SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return 3;
    }

    /* renamed from: T7 */
    public GalleryTitleManager mo132591T7() {
        SnsMethodCalculate.markStartTimeMs("gettitleManager", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        GalleryTitleManager galleryTitleManager = this.f277758i;
        SnsMethodCalculate.markEndTimeMs("gettitleManager", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return galleryTitleManager;
    }

    /* renamed from: U7 */
    public boolean mo132592U7() {
        SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return false;
    }

    /* renamed from: V7 */
    public final void mo132593V7() {
        SnsMethodCalculate.markStartTimeMs("onImageOCREnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(true);
            this.f277761o.setShowLongClickMenu(true);
        }
        MMViewPager mMViewPager = this.f277745F;
        if (mMViewPager != null) {
            mMViewPager.setEnableGalleryScale(true);
            this.f277745F.setSingleMode(false);
        }
        SnsMethodCalculate.markEndTimeMs("onImageOCREnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: W7 */
    public void mo132594W7(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: X7 */
    public final void mo132595X7(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (this.f277761o != null) {
            SnsMethodCalculate.markStartTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            boolean z2 = C30391y.f81992d;
            SnsMethodCalculate.markEndTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (z2) {
                this.f277761o.setNeedTranslationImg(true);
            } else {
                this.f277761o.setNeedTranslationImg(z);
            }
        }
        SnsMethodCalculate.markEndTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: Y7 */
    public void mo132596Y7() {
        SnsMethodCalculate.markStartTimeMs("startScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markStartTimeMs("beforeScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277767u.setVisibility(0);
        this.f277768v.setVisibility(0);
        this.f277769w.setVisibility(0);
        SnsMethodCalculate.markEndTimeMs("beforeScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277770x.setRepeatMode(1);
        this.f277770x.setRepeatCount(-1);
        this.f277770x.start();
        SnsMethodCalculate.markEndTimeMs("startScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: Z7 */
    public void mo132597Z7(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("startWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!C30391y.m39060e()) {
            Log.m105920e("MicroMsg.SnsBaseGalleryUI", "startWordDetectImage wordDetect not enable");
        } else if (!C30391y.m39059d()) {
            mo132585N7(str);
        } else if (z) {
            mo132585N7(str);
        }
        SnsMethodCalculate.markEndTimeMs("startWordDetectImage", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: a8 */
    public void mo132598a8() {
        SnsMethodCalculate.markStartTimeMs("stopScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markStartTimeMs("afterScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277767u.setVisibility(8);
        this.f277768v.setVisibility(8);
        this.f277769w.setVisibility(8);
        SnsMethodCalculate.markEndTimeMs("afterScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277770x.setRepeatMode(1);
        this.f277770x.setRepeatCount(0);
        this.f277770x.end();
        SnsMethodCalculate.markEndTimeMs("stopScanLineAnimation", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void addView(View view) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277754e.addView(view, new LinearLayout.LayoutParams(-1, -1));
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: b8 */
    public final void mo132600b8(boolean z, boolean z2) {
        MMViewPager mMViewPager;
        SnsMethodCalculate.markStartTimeMs("updateWordDetectStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            if (z2) {
                snsInfoFlip.setNeedOCRImg(true);
            }
            if (z || z2) {
                SnsInfoFlip snsInfoFlip2 = this.f277761o;
                snsInfoFlip2.getClass();
                SnsMethodCalculate.markStartTimeMs("isShowingBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
                C92126r rVar = snsInfoFlip2.f276803t;
                boolean z3 = rVar != null && rVar.mo126104g();
                SnsMethodCalculate.markEndTimeMs("isShowingBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (z3) {
                    SnsInfoFlip snsInfoFlip3 = this.f277761o;
                    snsInfoFlip3.getClass();
                    SnsMethodCalculate.markStartTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    if (snsInfoFlip3.f278149V == null || (mMViewPager = snsInfoFlip3.f278147U) == null) {
                        SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    } else {
                        try {
                            C101829pp1 l = snsInfoFlip3.f278149V.mo132802l(mMViewPager.getCurrentItem());
                            C101804kv2 kv22 = l.f299180d;
                            snsInfoFlip3.mo132156q(C94901o.m120385m(kv22), l.f299181e, kv22.f298689d, true);
                        } catch (Exception unused) {
                        }
                        SnsMethodCalculate.markEndTimeMs("showBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    }
                }
            }
            mo132594W7(z, z2);
        }
        SnsMethodCalculate.markEndTimeMs("updateWordDetectStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        return C0966R.C0971layout.f360005c34;
    }

    /* renamed from: m1 */
    public void mo132030m1(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f277759j || C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN == null || DN.field_snsId == 0) {
            enableOptionMenu(false);
        } else {
            enableOptionMenu(true);
        }
        SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        MultiCodeMaskView multiCodeMaskView = this.f277766t;
        if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
            super.onBackPressed();
            SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        long j = 0;
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            j = snsInfoFlip.f276778F.longValue();
        }
        this.f277766t.mo67041d(j, false);
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onConfigurationChanged(configuration);
        C101903a aVar = this.f277746G;
        if (aVar != null) {
            aVar.onConfigurationChanged(configuration);
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onCreate(bundle);
        SnsMethodCalculate.markStartTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        if (j == 0) {
            j = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_enhance_like_gallery, 2);
        }
        if (j == 1) {
            this.f277753d = false;
        } else {
            this.f277753d = true;
        }
        SnsMethodCalculate.markEndTimeMs("useNew", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        C94866e1.Vx0().mo131001z(3, true);
        SnsMethodCalculate.markStartTimeMs("prevView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277754e = (LinearLayout) findViewById(C0966R.C0970id.fkg);
        this.f277757h = (LinearLayout) findViewById(C0966R.C0970id.br8);
        GalleryTitleManager galleryTitleManager = new GalleryTitleManager(this, this, mo132588Q7());
        this.f277758i = galleryTitleManager;
        SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        Log.m105924i("MicroMsg.GalleryTitleManager", "onAttach");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, galleryTitleManager);
        galleryTitleManager.f276834B.alive();
        galleryTitleManager.f276835C.alive();
        galleryTitleManager.f276836D.alive();
        SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        GalleryTitleManager galleryTitleManager2 = this.f277758i;
        C96272w3 w3Var = new C96272w3(this);
        galleryTitleManager2.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        galleryTitleManager2.f276855y = w3Var;
        SnsMethodCalculate.markEndTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        this.f277766t = (MultiCodeMaskView) findViewById(C0966R.C0970id.h2z);
        SnsMethodCalculate.markEndTimeMs("prevView", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (mo132592U7()) {
            this.f277767u = (ImageView) findViewById(C0966R.C0970id.j26);
            this.f277768v = (ImageView) findViewById(C0966R.C0970id.j25);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f359121j23);
            this.f277769w = imageView;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.bottomMargin += C85875k4.m106188j(this);
            this.f277769w.setLayoutParams(layoutParams);
            this.f277769w.setOnClickListener(new C95477f());
            SnsMethodCalculate.markStartTimeMs("initScanTransAnimator", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            this.f277767u = (ImageView) findViewById(C0966R.C0970id.j26);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f277770x = ofFloat;
            ofFloat.setDuration(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            this.f277770x.addListener(new C96234u3(this));
            this.f277770x.addUpdateListener(new C96243v3(this, getWindowManager().getDefaultDisplay().getHeight()));
            SnsMethodCalculate.markEndTimeMs("initScanTransAnimator", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
        C94866e1.Vx0().mo130978c(this);
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onDestroy();
        GalleryTitleManager galleryTitleManager = this.f277758i;
        if (galleryTitleManager != null) {
            SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            Log.m105924i("MicroMsg.GalleryTitleManager", "onDetach");
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(218, galleryTitleManager);
            galleryTitleManager.f276834B.dead();
            galleryTitleManager.f276835C.dead();
            galleryTitleManager.f276836D.dead();
            SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            snsInfoFlip.f278147U.f55862j.removeMessages(1);
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            SnsInfoFlip snsInfoFlip2 = this.f277761o;
            snsInfoFlip2.getClass();
            SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            Log.m105924i("MicroMsg.SnsInfoFlip", "sns info flip on detach.");
            SnsInfoFlip.C95555h hVar = snsInfoFlip2.f278149V;
            if (hVar != null) {
                hVar.mo132804n();
                SnsInfoFlip.C95555h hVar2 = snsInfoFlip2.f278149V;
                hVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                Log.m105924i("MicroMsg.SnsGalleryAdapter", "adapter clear.");
                ((HashMap) hVar2.f278192n).clear();
                SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            }
            C94866e1.Vx0().mo130997v(snsInfoFlip2);
            SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            SnsInfoFlip snsInfoFlip3 = this.f277761o;
            snsInfoFlip3.getClass();
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
            snsInfoFlip3.f276782J.dead();
            snsInfoFlip3.f276783K.dead();
            snsInfoFlip3.f276784L.dead();
            ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new ReleaseDealQBarStrEvent();
            releaseDealQBarStrEvent.f265057d.f265058a = (Activity) snsInfoFlip3.f276797n;
            releaseDealQBarStrEvent.publish();
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
            SnsInfoFlip.C95555h hVar3 = snsInfoFlip3.f278149V;
            if (hVar3 != null) {
                hVar3.mo139421i();
                snsInfoFlip3.f278149V = null;
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        MultiCodeMaskView multiCodeMaskView = this.f277766t;
        if (multiCodeMaskView != null) {
            multiCodeMaskView.mo67038a();
        }
        if (mo132592U7()) {
            mo132602x3();
        }
        C86709a0.m107529k().mo121129d(this.f277752M);
        this.f277751L.dead();
        C94866e1.Vx0().mo130997v(this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        Log.m105925i("MicroMsg.SnsBaseGalleryUI", "[%s][media:%s]onImageFinish result:%b", "[image-flow]", str, Boolean.valueOf(z));
        if (this.f277761o != null && z && !Util.isNullOrNil(str) && str.equals(this.f277761o.getSelectedMediaId())) {
            mo132597Z7(C94901o.m120385m(this.f277761o.getCntMedia()), false);
        }
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132767B();
        }
        GalleryTitleManager galleryTitleManager = this.f277758i;
        if (galleryTitleManager != null) {
            galleryTitleManager.getClass();
            SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (galleryTitleManager.f276853w != null) {
                CancelDealQBarStrEvent cancelDealQBarStrEvent = new CancelDealQBarStrEvent();
                CancelDealQBarStrEvent.C92466a aVar = cancelDealQBarStrEvent.f264642d;
                aVar.f264644b = (Activity) galleryTitleManager.f276837d;
                aVar.f264643a = galleryTitleManager.f276853w.f273113d;
                cancelDealQBarStrEvent.publish();
                galleryTitleManager.f276853w = null;
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        super.onPause();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onResume() {
        C96087o0 o0Var;
        C96158q0 q0Var;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onResume();
        boolean z = this.f277753d;
        if (z && (q0Var = this.f277756g) != null) {
            q0Var.mo133781e();
        } else if (!z && (o0Var = this.f277755f) != null) {
            o0Var.mo133643e();
        }
        if (mo132592U7()) {
            C86709a0.m107529k().mo121126a(this.f277752M);
            this.f277749J.alive();
            this.f277751L.alive();
            this.f277750K.alive();
        }
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setOnMenuShowListener(this.f277740A);
            this.f277761o.setOnLongClickListener(this.f277742C);
            this.f277761o.setOnMultiCodeListener(this.f277741B);
            SnsMethodCalculate.markStartTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            boolean z2 = C30391y.f81992d;
            SnsMethodCalculate.markEndTimeMs("alwaysShowImageTranslateMenu", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (z2) {
                mo132595X7(true);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        super.onStop();
        this.f277749J.dead();
        this.f277750K.dead();
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: p7 */
    public void mo132178p7(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f277759j) {
            SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        setMMTitle(str);
        setMMSubTitle(str2);
        SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: s */
    public void mo132179s(String str, List list) {
        SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$IGalleryTitleM");
        SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$IGalleryTitleM");
    }

    /* renamed from: s5 */
    public void mo132601s5(C101804kv2 kv22, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.f277765s = 0;
        if (kv22.f298690e == 2) {
            if (i != this.f277772z) {
                mo132595X7(false);
                SnsInfoFlip snsInfoFlip = this.f277761o;
                if (snsInfoFlip != null) {
                    snsInfoFlip.setNeedOCRImg(false);
                }
                SnsMethodCalculate.markStartTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                this.f277771y = 0;
                SnsMethodCalculate.markEndTimeMs("resetTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            }
            this.f277772z = i;
            SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
            if (DN != null && !DN.isWaitPost()) {
                mo132597Z7(C94901o.m120385m(kv22), false);
            }
        } else {
            mo132595X7(false);
            SnsInfoFlip snsInfoFlip2 = this.f277761o;
            if (snsInfoFlip2 != null) {
                snsInfoFlip2.setNeedOCRImg(false);
            }
        }
        if (mo132591T7() != null) {
            GalleryTitleManager T7 = mo132591T7();
            T7.getClass();
            SnsMethodCalculate.markStartTimeMs("onPageChanged", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            T7.f276848r = false;
            T7.f276849s = false;
            SnsMethodCalculate.markEndTimeMs("onPageChanged", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        }
        C95478g gVar = this.f277743D;
        if (gVar != null) {
            gVar.mo132606a(kv22, i, str);
        }
        SnsMethodCalculate.markEndTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* renamed from: v4 */
    public void mo132180v4() {
        C96087o0 o0Var;
        C96158q0 q0Var;
        SnsMethodCalculate.markStartTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        if (!this.f277759j) {
            SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            return;
        }
        int i = 8;
        setTitleVisibility(this.f277760n ? 8 : 0);
        boolean z = this.f277753d;
        if (z && (q0Var = this.f277756g) != null) {
            if (!this.f277760n) {
                i = 0;
            }
            q0Var.setVisibility(i);
        } else if (!z && (o0Var = this.f277755f) != null) {
            if (!this.f277760n) {
                i = 0;
            }
            o0Var.setVisibility(i);
        }
        this.f277760n = !this.f277760n;
        SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ee  */
    /* renamed from: w3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86628w3(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            java.lang.String r0 = "onEnd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r12 = (java.lang.String) r12
            xl2.c r13 = (xl2.C102690c) r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r11.f277761o
            r3 = 0
            if (r2 == 0) goto L_0x0023
            te3.pp1 r2 = r2.getSelectItem()
            if (r2 == 0) goto L_0x0023
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r11.f277761o
            te3.pp1 r2 = r2.getSelectItem()
            te3.kv2 r2 = r2.f299180d
            goto L_0x0024
        L_0x0023:
            r2 = r3
        L_0x0024:
            if (r2 == 0) goto L_0x002a
            java.lang.String r3 = com.tencent.p014mm.plugin.sns.model.C94901o.m120385m(r2)
        L_0x002a:
            java.util.List<java.lang.Float> r2 = r13.f303305a
            int r2 = com.tencent.p014mm.plugin.scanner.C30391y.m39057b(r2)
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r3
            java.util.List<java.lang.Float> r7 = r13.f303305a
            r8 = 1
            r5[r8] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r9 = 2
            r5[r9] = r7
            java.lang.String r7 = "MicroMsg.SnsBaseGalleryUI"
            java.lang.String r10 = "local translate, img %s, result %s, ratio %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r5)
            boolean r12 = r12.equals(r3)
            if (r12 == 0) goto L_0x00f4
            java.lang.Class<lc3.b> r12 = lc3.C10485b.class
            boolean r3 = com.tencent.p014mm.plugin.scanner.C30391y.m39060e()
            java.lang.String r5 = "MicroMsg.ScannerHelper"
            if (r3 != 0) goto L_0x0060
            java.lang.String r12 = "Word Detect Closed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            goto L_0x00bf
        L_0x0060:
            k40.a r3 = f40.C86709a0.m107533q(r12)
            lc3.b r3 = (lc3.C10485b) r3
            pj.f r3 = r3.vh0()
            java.lang.String r7 = "EnableSnsPicTranslation"
            int r3 = r3.mo107404b(r7, r6)
            k40.a r12 = f40.C86709a0.m107533q(r12)
            lc3.b r12 = (lc3.C10485b) r12
            pj.f r12 = r12.vh0()
            java.lang.String r7 = "PicTranslationSupportUserLanguage"
            java.lang.String r12 = r12.mo107405c(r7)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            if (r3 != r8) goto L_0x0086
            r7 = 1
            goto L_0x0087
        L_0x0086:
            r7 = 0
        L_0x0087:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4[r6] = r7
            r4[r8] = r12
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r4[r9] = r7
            java.lang.String r7 = "enable %s, support lang %s, current lang %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            if (r3 != r8) goto L_0x00b9
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r3 != 0) goto L_0x00b9
            java.lang.String r3 = ";"
            java.lang.String[] r12 = r12.split(r3)
            if (r12 == 0) goto L_0x00b9
            java.util.List r12 = java.util.Arrays.asList(r12)
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x00b9
            goto L_0x00bd
        L_0x00b9:
            boolean r12 = qe3.C89625d.f257846l
            if (r12 == 0) goto L_0x00bf
        L_0x00bd:
            r12 = 1
            goto L_0x00c0
        L_0x00bf:
            r12 = 0
        L_0x00c0:
            if (r12 == 0) goto L_0x00dd
            boolean r12 = r11.mo132592U7()
            if (r12 == 0) goto L_0x00dd
            java.lang.String r12 = "alwaysShowImageTranslateMenu"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r1)
            boolean r3 = com.tencent.p014mm.plugin.scanner.C30391y.f81992d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r1)
            boolean r12 = com.tencent.p014mm.plugin.scanner.C30391y.m39062g(r2)
            if (r12 == 0) goto L_0x00de
            r11.mo132595X7(r8)
            r3 = 1
            goto L_0x00de
        L_0x00dd:
            r3 = 0
        L_0x00de:
            java.lang.Class<sk2.c> r12 = sk2.C101643c.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            sk2.c r12 = (sk2.C101643c) r12
            java.util.List<java.lang.Float> r13 = r13.f303305a
            boolean r12 = r12.mo140870Ax(r13)
            if (r12 == 0) goto L_0x00f1
            r11.f277765s = r6
            r6 = 1
        L_0x00f1:
            r11.mo132600b8(r3, r6)
        L_0x00f4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsBaseGalleryUI.mo86628w3(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: x3 */
    public void mo132602x3() {
        SnsMethodCalculate.markStartTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.setEnableSingleClickOver(true);
        }
        this.f277763q = 0;
        mo132598a8();
        SnsMethodCalculate.markEndTimeMs("exitTranslateStatus", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
    }
}
