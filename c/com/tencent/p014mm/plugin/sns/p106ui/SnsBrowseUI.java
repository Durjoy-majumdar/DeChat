package com.tencent.p014mm.plugin.sns.p106ui;

import a70.C112760b;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import as2.C92086h;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.scanner.MultiCodeMaskView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.model.C96783i1;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import nj3.C88989a;
import ob0.C11385n;
import os2.C100416r;
import te3.C101789j00;
import te3.C101799k1;
import te3.C101804kv2;
import te3.C101829pp1;
import vo3.C90852c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI */
public class SnsBrowseUI extends SnsBaseGalleryUI {

    /* renamed from: g1 */
    public static final /* synthetic */ int f277783g1 = 0;

    /* renamed from: P */
    public String f277784P;

    /* renamed from: Q */
    public String f277785Q;

    /* renamed from: Q0 */
    public Rect f277786Q0;

    /* renamed from: R */
    public int f277787R = 0;

    /* renamed from: R0 */
    public View f277788R0;

    /* renamed from: S */
    public int f277789S = 0;

    /* renamed from: S0 */
    public C45059m0 f277790S0;

    /* renamed from: T */
    public boolean f277791T = false;

    /* renamed from: T0 */
    public MMHandler f277792T0 = new MMHandler();

    /* renamed from: U */
    public boolean f277793U = false;

    /* renamed from: U0 */
    public int f277794U0 = 0;

    /* renamed from: V */
    public boolean f277795V = false;

    /* renamed from: V0 */
    public Bundle f277796V0;

    /* renamed from: W */
    public boolean f277797W = false;

    /* renamed from: W0 */
    public int f277798W0 = 0;

    /* renamed from: X */
    public C96783i1 f277799X;

    /* renamed from: X0 */
    public boolean f277800X0 = false;

    /* renamed from: Y */
    public int f277801Y;

    /* renamed from: Y0 */
    public Intent f277802Y0;

    /* renamed from: Z */
    public int f277803Z;

    /* renamed from: Z0 */
    public boolean f277804Z0 = false;

    /* renamed from: a1 */
    public long f277805a1 = 0;

    /* renamed from: b1 */
    public boolean f277806b1 = false;

    /* renamed from: c1 */
    public float f277807c1 = 1.0f;

    /* renamed from: d1 */
    public int f277808d1 = 0;

    /* renamed from: e1 */
    public int f277809e1 = 0;

    /* renamed from: f1 */
    public C11385n f277810f1 = new SnsBrowseUI$$f(this);

    /* renamed from: p0 */
    public int f277811p0 = 0;

    /* renamed from: x0 */
    public int f277812x0 = 0;

    /* renamed from: y0 */
    public ImageView f277813y0;

    /* renamed from: c8 */
    public static /* synthetic */ int m121946c8(SnsBrowseUI snsBrowseUI) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        int i = snsBrowseUI.f277812x0;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return i;
    }

    /* renamed from: R7 */
    public int mo132589R7() {
        SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    /* renamed from: S7 */
    public int mo132590S7() {
        SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return 3;
    }

    /* renamed from: U7 */
    public boolean mo132592U7() {
        SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return true;
    }

    /* renamed from: d8 */
    public final void mo132607d8() {
        ViewStub viewStub;
        SnsMethodCalculate.markStartTimeMs("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.f277804Z0 && (viewStub = (ViewStub) findViewById(C0966R.C0970id.nvq)) != null) {
            Log.m105924i("MicroMsg.SnsPopMediasUI", "checkShowForbidAccessLayout: show Not Access Layout!");
            viewStub.inflate();
            this.f277804Z0 = true;
        }
        SnsMethodCalculate.markEndTimeMs("checkShowForbidAccessLayout", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsPopMediasUI", "dispatchKeyEvent");
            MultiCodeMaskView multiCodeMaskView = this.f277766t;
            if (multiCodeMaskView == null || multiCodeMaskView.getVisibility() != 0) {
                this.f277802Y0 = new Intent();
                mo132583L7();
                mo132609f8();
                SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
                return true;
            }
            long j = 0;
            SnsInfoFlip snsInfoFlip = this.f277761o;
            if (snsInfoFlip != null) {
                j = snsInfoFlip.f276778F.longValue();
            }
            this.f277766t.mo67041d(j, false);
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return dispatchKeyEvent;
    }

    /* renamed from: e8 */
    public void mo132608e8() {
        SnsMethodCalculate.markStartTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105918d("MicroMsg.SnsPopMediasUI", "runDragAnimation: ");
        MMViewPager gallery = this.f277761o.getGallery();
        gallery.setGalleryScaleListener(new SnsBrowseUI$$e(this, gallery));
        SnsMethodCalculate.markEndTimeMs("runDragAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* renamed from: f8 */
    public void mo132609f8() {
        SnsMethodCalculate.markStartTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105918d("MicroMsg.SnsPopMediasUI", "runExitAnimation: ");
        if (this.f277786Q0 == null) {
            this.f277786Q0 = new Rect();
        }
        View view = this.f277788R0;
        if (view != null && view.getVisibility() == 0) {
            View view2 = this.f277788R0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "runExitAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!this.f277793U) {
            GalleryPhotoInfoEvent galleryPhotoInfoEvent = new GalleryPhotoInfoEvent();
            galleryPhotoInfoEvent.f264882d.f264885b = this.f277761o.getGallery().getCurrentItem();
            GalleryPhotoInfoEvent.C92522a aVar2 = galleryPhotoInfoEvent.f264882d;
            aVar2.f264884a = this.f277789S;
            aVar2.f264887d = this.f277784P;
            galleryPhotoInfoEvent.publish();
            Rect rect = this.f277786Q0;
            GalleryPhotoInfoEvent.C92523b bVar = galleryPhotoInfoEvent.f264883e;
            int i = bVar.f264888a;
            rect.left = i;
            int i2 = bVar.f264889b;
            rect.top = i2;
            rect.right = bVar.f264890c + i;
            rect.bottom = bVar.f264891d + i2;
        }
        this.f277801Y = this.f277761o.getWidth();
        this.f277803Z = this.f277761o.getHeight();
        C94866e1.Fx0();
        String m = C94901o.m120385m(this.f277761o.getCntMedia());
        if (m != null) {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(m);
            int i3 = (int) ((((float) this.f277801Y) / ((float) imageOptions.outWidth)) * ((float) imageOptions.outHeight));
            this.f277803Z = i3;
            if (i3 > this.f277761o.getHeight()) {
                if (((double) this.f277803Z) < ((double) this.f277761o.getHeight()) * 2.5d) {
                    this.f277794U0 = this.f277803Z - this.f277761o.getHeight();
                    if (this.f277761o.getCount() == 1) {
                        int height = (this.f277761o.getHeight() * this.f277786Q0.height()) / this.f277803Z;
                        Rect rect2 = this.f277786Q0;
                        rect2.bottom = rect2.top + height;
                        this.f277794U0 = 0;
                    }
                }
                this.f277803Z = this.f277761o.getHeight();
            }
        }
        C45059m0 m0Var = this.f277790S0;
        int i4 = this.f277801Y;
        int i5 = this.f277803Z;
        m0Var.f122226f = i4;
        m0Var.f122227g = i5;
        Rect rect3 = this.f277786Q0;
        m0Var.mo70410e(rect3.left, rect3.top, rect3.width(), this.f277786Q0.height());
        float f = this.f277807c1;
        if (((double) f) != 1.0d) {
            this.f277790S0.f122234n = 1.0f / f;
            if (!(this.f277808d1 == 0 && this.f277809e1 == 0)) {
                int width = ((int) (((float) (this.f277761o.getWidth() / 2)) * (1.0f - this.f277807c1))) + this.f277808d1;
                C45059m0 m0Var2 = this.f277790S0;
                m0Var2.f122235o = width;
                m0Var2.f122236p = (int) (((float) ((this.f277761o.getHeight() / 2) + this.f277809e1)) - (((float) (this.f277803Z / 2)) * this.f277807c1));
            }
        }
        C45059m0 m0Var3 = this.f277790S0;
        m0Var3.f122238r = this.f277794U0;
        m0Var3.mo70409d(this.f277761o, this.f277813y0, new SnsBrowseUI$$c(this), new SnsBrowseUI$$d(this));
        SnsMethodCalculate.markEndTimeMs("runExitAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public void finish() {
        SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.f277805a1 != 0 && !this.f277806b1) {
            if (this.f277802Y0 == null) {
                this.f277802Y0 = new Intent();
            }
            Log.m105924i("MicroMsg.SnsPopMediasUI", "finish: set access back");
            this.f277802Y0.putExtra("result_forbid_access", this.f277804Z0);
            this.f277802Y0.putExtra("result_access_sns_id", this.f277805a1);
        }
        Intent intent = this.f277802Y0;
        if (intent != null) {
            setResult(-1, intent);
        }
        Log.m105918d("MicroMsg.SnsPopMediasUI", "finish: ");
        super.finish();
        SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        return C0966R.C0971layout.c2b;
    }

    public void initView() {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        this.f277790S0 = new C45059m0(getContext());
        this.f277797W = false;
        String nullAs = Util.nullAs(getIntent().getStringExtra("sns_gallery_userName"), "");
        this.f277784P = Util.nullAs(getIntent().getStringExtra("sns_gallery_localId"), "");
        this.f277785Q = Util.nullAs(getIntent().getStringExtra("sns_gallery_pcid"), "");
        this.f277787R = getIntent().getIntExtra("sns_gallery_position", 0);
        this.f277789S = getIntent().getIntExtra("sns_position", 0);
        this.f277791T = getIntent().getBooleanExtra("k_is_from_sns_main_timeline", false);
        this.f277793U = getIntent().getBooleanExtra("k_is_from_sns_msg_ui", false);
        this.f277795V = getIntent().getBooleanExtra("sns_soon_enter_photoedit_ui", false);
        this.f277798W0 = getIntent().getIntExtra("K_source", 0);
        SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f277784P);
        if (DN == null) {
            DN = C94866e1.Yx0().mo139807TE(this.f277785Q);
        }
        SnsInfo snsInfo = DN;
        if (snsInfo == null) {
            finish();
            SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return;
        }
        this.f277813y0 = (ImageView) findViewById(C0966R.C0970id.ehi);
        SnsInfoFlip snsInfoFlip = new SnsInfoFlip(this);
        this.f277761o = snsInfoFlip;
        snsInfoFlip.setIsFromMainTimeline(this.f277791T);
        this.f277761o.setNeedScanImage(true);
        String str = this.f277784P;
        int i = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("getMediasList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        ArrayList arrayList = new ArrayList();
        int i2 = 2;
        if (C94866e1.qy0()) {
            SnsMethodCalculate.markEndTimeMs("getMediasList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        } else {
            SnsInfo b = C100416r.m131409b(str);
            if (b == null) {
                SnsMethodCalculate.markEndTimeMs("getMediasList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                TimeLineObject timeLine = b.getTimeLine();
                C101789j00 j002 = timeLine.ContentObj;
                if (j002 == null || j002.f298427h.size() == 0) {
                    SnsMethodCalculate.markEndTimeMs("getMediasList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                } else {
                    arrayList.clear();
                    if (b.getTypeFlag() == 7) {
                        Iterator<C101804kv2> it = timeLine.ContentObj.f298427h.iterator();
                        C101804kv2 kv22 = null;
                        while (it.hasNext()) {
                            C101804kv2 next = it.next();
                            if (next.f298690e == i2 && (kv22 == null || next.f298698p.f298876e > kv22.f298698p.f298876e)) {
                                kv22 = next;
                            }
                            i2 = 2;
                        }
                        if (kv22 != null) {
                            C101829pp1 pp12 = new C101829pp1();
                            pp12.f299180d = kv22;
                            pp12.f299181e = str;
                            pp12.f299182f = timeLine.CreateTime;
                            pp12.f299183g = 0;
                            arrayList.add(pp12);
                        }
                    } else {
                        Iterator<C101804kv2> it4 = timeLine.ContentObj.f298427h.iterator();
                        int i3 = 0;
                        while (it4.hasNext()) {
                            C101829pp1 pp13 = new C101829pp1();
                            pp13.f299180d = it4.next();
                            pp13.f299181e = str;
                            pp13.f299182f = timeLine.CreateTime;
                            pp13.f299183g = i3;
                            arrayList.add(pp13);
                            i3++;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("getMediasList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                }
            }
        }
        if (this.f277784P.equals("")) {
            String str2 = this.f277785Q;
            SnsMethodCalculate.markStartTimeMs("getMediasListBySnsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            arrayList = new ArrayList();
            if (C94866e1.qy0()) {
                SnsMethodCalculate.markEndTimeMs("getMediasListBySnsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                SnsInfo TE = C94866e1.Yx0().mo139807TE(str2);
                if (TE == null) {
                    SnsMethodCalculate.markEndTimeMs("getMediasListBySnsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                } else {
                    TimeLineObject timeLine2 = TE.getTimeLine();
                    C101789j00 j003 = timeLine2.ContentObj;
                    if (j003 == null || j003.f298427h.size() == 0) {
                        SnsMethodCalculate.markEndTimeMs("getMediasListBySnsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    } else {
                        arrayList.clear();
                        if (TE.getTypeFlag() == 7) {
                            Iterator<C101804kv2> it5 = timeLine2.ContentObj.f298427h.iterator();
                            C101804kv2 kv23 = null;
                            while (it5.hasNext()) {
                                C101804kv2 next2 = it5.next();
                                if (next2.f298690e == 2 && (kv23 == null || next2.f298698p.f298876e > kv23.f298698p.f298876e)) {
                                    kv23 = next2;
                                }
                            }
                            if (kv23 != null) {
                                C101829pp1 pp14 = new C101829pp1();
                                pp14.f299180d = kv23;
                                pp14.f299181e = "";
                                pp14.f299182f = timeLine2.CreateTime;
                                pp14.f299183g = 0;
                                arrayList.add(pp14);
                            }
                        } else {
                            Iterator<C101804kv2> it6 = timeLine2.ContentObj.f298427h.iterator();
                            int i4 = 0;
                            while (it6.hasNext()) {
                                C101829pp1 pp15 = new C101829pp1();
                                pp15.f299180d = it6.next();
                                pp15.f299181e = "";
                                pp15.f299182f = timeLine2.CreateTime;
                                pp15.f299183g = i4;
                                arrayList.add(pp15);
                                i4++;
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("getMediasListBySnsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        this.f277761o.setShowPageControl(true);
        this.f277761o.setTouchFinish(true);
        this.f277761o.setIsSoonEnterPhotoEditUI(this.f277795V);
        if (this.f277753d) {
            this.f277761o.mo132797z(arrayList2, nullAs, this.f277787R, mo132587P7(), this);
        } else {
            this.f277761o.mo132797z(arrayList2, nullAs, this.f277787R, mo132586O7(), this);
        }
        SnsInfoFlip snsInfoFlip2 = this.f277761o;
        C96983o3 c = C96983o3.m124651c();
        c.f284145b = snsInfo.field_createTime;
        snsInfoFlip2.setFromScene(c);
        this.f277761o.setUIFromScene(mo132588Q7());
        this.f277761o.setOnPageSelectListener(this);
        addView(this.f277761o);
        if (snsInfo.isAd()) {
            this.f277761o.setIsAd(true);
        }
        SnsMethodCalculate.markStartTimeMs("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        this.f277762p = (Button) findViewById(C0966R.C0970id.emf);
        int c2 = C75044y4.m89991c(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f277762p.getLayoutParams();
        marginLayoutParams.bottomMargin = c2 + getResources().getDimensionPixelSize(C0966R.dimen.aod);
        this.f277762p.setLayoutParams(marginLayoutParams);
        TimeLineObject timeLine3 = snsInfo.getTimeLine();
        C101799k1 k1Var = timeLine3 != null ? timeLine3.actionInfo : null;
        C96275w6 w6Var = new C96275w6();
        C96318y1.m123547a(this, w6Var, timeLine3.actionInfo);
        if (w6Var.f281365Y) {
            this.f277762p.setVisibility(0);
            this.f277762p.setText(w6Var.f281366Z);
            this.f277762p.setOnClickListener(new C96312x3(this, k1Var, timeLine3));
        } else {
            this.f277762p.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("initGameMoreButton", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (!C92086h.m115754a(snsInfo)) {
            Log.m105920e("MicroMsg.SnsPopMediasUI", "error see photo !! " + snsInfo.getUserName() + " " + snsInfo.field_snsId);
            finish();
            SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
            return;
        }
        if (snsInfo.getTypeFlag() == 21 && !snsInfo.getUserName().equals(C75592q0.m90789s())) {
            C96783i1 i1Var = new C96783i1(C112760b.m154230f0() + "/Pictures/Screenshots/", new SnsBrowseUI$$b(this));
            this.f277799X = i1Var;
            i1Var.startWatching();
        }
        this.f277788R0 = findViewById(C0966R.C0970id.oeq);
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_sns_can_share_url_exceprt, false) || !snsInfo.getTimeLine().isExcerpt) {
            View view = this.f277788R0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f277788R0;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsBrowseUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f277788R0.setOnClickListener(new SnsBrowseUI$$a(this, snsInfo.getTimeLine().snsExcerptUrl, snsInfo.field_snsId));
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* renamed from: m1 */
    public void mo132030m1(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        this.f277787R = i;
        if (this.f277798W0 == 2) {
            SnsInfo b = C100416r.m131409b(str);
            SnsReportHelper.f275506m0.mo131368b(b, i);
            SnsReportHelper.f275506m0.mo131387t(b, i);
        }
        SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105925i("MicroMsg.SnsPopMediasUI", "[notifyData] opType:%s reset:%s localId;%s", Integer.valueOf(i), Boolean.valueOf(z), str);
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            if (z) {
                snsInfoFlip.mo132768C(true);
            } else {
                snsInfoFlip.mo132796y();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105924i("MicroMsg.SnsPopMediasUI", "onActivityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Log.m105924i("MicroMsg.SnsPopMediasUI", "onCreate: ");
        C85875k4.m106195m0(this);
        super.onCreate(bundle);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(210, this.f277810f1);
        this.f277804Z0 = getIntent().getBooleanExtra("k_forbid_access", false);
        this.f277805a1 = getIntent().getLongExtra("k_feedid_need_check_forbid_access", 0);
        mo132607d8();
        hideTitleView();
        C85875k4.m106195m0(this);
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        getWindow().setFlags(134218752, 134218752);
        getWindow().addFlags(67108864);
        setLightNavigationbarIcon();
        initView();
        this.f277796V0 = bundle;
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r29 = this;
            r0 = r29
            java.lang.String r1 = "onDestroy"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsBrowseUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            f40.C86709a0.m107528h()
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 210(0xd2, float:2.94E-43)
            ob0.n r5 = r0.f277810f1
            r3.mo123470p(r4, r5)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r3 = r0.f277761o
            java.lang.String r7 = "MicroMsg.SnsInfoFlip"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip"
            r9 = -1
            r14 = 0
            if (r3 == 0) goto L_0x02ac
            android.content.Intent r3 = r29.getIntent()
            java.lang.String r15 = "K_ad_scene"
            int r3 = r3.getIntExtra(r15, r9)
            android.content.Intent r15 = r29.getIntent()
            java.lang.String r9 = "K_ad_source"
            int r9 = r15.getIntExtra(r9, r14)
            android.content.Intent r15 = r29.getIntent()
            java.lang.String r4 = "sns_ad_exposure_start_time"
            r5 = 0
            long r11 = r15.getLongExtra(r4, r5)
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r4 = r0.f277761o
            java.lang.String r15 = r0.f277784P
            r4.getClass()
            java.lang.String r14 = "reportAd"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r8)
            boolean r10 = r4.f278171p0
            if (r10 != 0) goto L_0x0062
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
        L_0x0059:
            r25 = r1
            r24 = r2
            r27 = r7
            r1 = r8
            goto L_0x028d
        L_0x0062:
            if (r3 >= 0) goto L_0x007d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pass by scene "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
            goto L_0x0059
        L_0x007d:
            os2.e0 r10 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r10.mo139798DN(r15)
            if (r10 != 0) goto L_0x008b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r8)
            goto L_0x0059
        L_0x008b:
            int r15 = r4.f278161f1
            if (r15 < 0) goto L_0x0115
            java.util.HashMap<java.lang.Integer, java.lang.Long> r13 = r4.f278142Q0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r13 = r13.containsKey(r15)
            if (r13 == 0) goto L_0x00ae
            java.util.HashMap<java.lang.Integer, java.lang.Long> r13 = r4.f278142Q0
            int r15 = r4.f278161f1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Object r13 = r13.get(r15)
            java.lang.Long r13 = (java.lang.Long) r13
            long r16 = r13.longValue()
            goto L_0x00b0
        L_0x00ae:
            r16 = r5
        L_0x00b0:
            int r13 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0115
            java.util.HashMap<java.lang.Integer, java.lang.Long> r13 = r4.f278143R0
            int r15 = r4.f278161f1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            boolean r13 = r13.containsKey(r15)
            if (r13 == 0) goto L_0x00d4
            java.util.HashMap<java.lang.Integer, java.lang.Long> r5 = r4.f278143R0
            int r6 = r4.f278161f1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
        L_0x00d4:
            r13 = r1
            r15 = r2
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r16)
            long r5 = r5 + r1
            r24 = r15
            java.util.HashMap<java.lang.Integer, java.lang.Long> r15 = r4.f278143R0
            r25 = r13
            int r13 = r4.f278161f1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r15.put(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r13 = "curSelectPosition "
            r0.append(r13)
            int r13 = r4.f278161f1
            r0.append(r13)
            java.lang.String r13 = " curtime "
            r0.append(r13)
            r0.append(r5)
            java.lang.String r5 = " passtime "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x0119
        L_0x0115:
            r25 = r1
            r24 = r2
        L_0x0119:
            com.tencent.mm.plugin.sns.storage.AdSnsInfo r0 = r10.getAdSnsInfo()
            r1 = 2
            if (r9 != r1) goto L_0x0124
            r10.getAtAdInfo()
            goto L_0x0127
        L_0x0124:
            r10.getAdInfo()
        L_0x0127:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r5 = "<desc>"
            r1.append(r5)
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r5 = r4.f278173y0
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0140:
            boolean r6 = r5.hasNext()
            java.lang.String r13 = "&"
            if (r6 == 0) goto L_0x01d6
            java.lang.Object r6 = r5.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r15 = r4.f278173y0
            java.lang.Object r15 = r15.get(r6)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r16 = r5
            java.util.HashMap<java.lang.Integer, java.lang.Long> r5 = r4.f278143R0
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto L_0x017c
            java.util.HashMap<java.lang.Integer, java.lang.Long> r5 = r4.f278143R0
            java.lang.Object r5 = r5.get(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r17 = r5.longValue()
            r19 = 1
            r5 = r7
            r26 = r8
            long r7 = r17 * r19
            int r8 = (int) r7
            r27 = r5
            r7 = 3
            goto L_0x0182
        L_0x017c:
            r26 = r8
            r27 = r7
            r7 = 3
            r8 = 0
        L_0x0182:
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r17 = 0
            r5[r17] = r6
            java.lang.Integer r18 = java.lang.Integer.valueOf(r8)
            r19 = 1
            r5[r19] = r18
            java.lang.Integer r18 = java.lang.Integer.valueOf(r15)
            r20 = 2
            r5[r20] = r18
            java.lang.String r7 = "<item><id>%d</id><duration>%d</duration><count>%d</count></item>"
            java.lang.String r5 = java.lang.String.format(r7, r5)
            r1.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r28 = r14
            r7 = 3
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r17] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r14[r19] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r14[r20] = r6
            java.lang.String r6 = "%d|%d|%d"
            java.lang.String r6 = java.lang.String.format(r6, r14)
            r5.append(r6)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            r2.append(r5)
            r5 = r16
            r8 = r26
            r7 = r27
            r14 = r28
            goto L_0x0140
        L_0x01d6:
            r27 = r7
            r26 = r8
            r28 = r14
            java.lang.String r5 = "</desc>"
            r1.append(r5)
            java.lang.String r1 = r2.toString()
            boolean r2 = r1.endsWith(r13)
            if (r2 == 0) goto L_0x01f7
            int r2 = r1.length()
            r5 = 1
            int r2 = r2 - r5
            r6 = 0
            java.lang.String r1 = r1.substring(r6, r2)
            goto L_0x01f9
        L_0x01f7:
            r5 = 1
            r6 = 0
        L_0x01f9:
            boolean r2 = r10.isRecExpAd()
            if (r2 == 0) goto L_0x0200
            goto L_0x024c
        L_0x0200:
            jp2.q r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r13 = r10.field_snsId
            r8 = 7
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r8 = vr2.C102236a0.m134765q0(r13)
            r15[r6] = r8
            java.lang.String r6 = r10.getUxinfo()
            r15[r5] = r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r15[r5] = r3
            long r5 = r4.f278164i1
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 3
            r15[r5] = r3
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r5 = 4
            r15[r5] = r3
            r3 = 5
            r15[r3] = r1
            int r1 = r4.getCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 6
            r15[r3] = r1
            java.lang.String r1 = jp2.C98962n.m128836a(r13, r15)
            r3 = 0
            r7[r3] = r1
            r1 = 12014(0x2eee, float:1.6835E-41)
            r2.mo59225h(r1, r7)
        L_0x024c:
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r0.getAdXml()
            boolean r0 = r0.isCardAd()
            if (r0 != 0) goto L_0x0273
            com.tencent.mm.modelsns.SnsAdClick r0 = new com.tencent.mm.modelsns.SnsAdClick
            if (r9 != 0) goto L_0x025d
            r18 = 1
            goto L_0x025f
        L_0x025d:
            r18 = 2
        L_0x025f:
            long r1 = r10.field_snsId
            r21 = 6
            r22 = 0
            r16 = r0
            r17 = r9
            r19 = r1
            r16.<init>(r17, r18, r19, r21, r22)
            r0.f267480r = r11
            vr2.C102236a0.m134773u0(r0)
        L_0x0273:
            r0 = 729(0x2d9, float:1.022E-42)
            ad0.C91998s.m115550d(r0)
            long r0 = r10.field_snsId
            vr2.C102236a0.m134765q0(r0)
            r10.getUxinfo()
            java.lang.System.currentTimeMillis()
            r4.getCount()
            r1 = r26
            r0 = r28
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
        L_0x028d:
            android.content.Intent r0 = r29.getIntent()
            ad0.s r0 = ad0.C91998s.m115551f(r0)
            if (r0 == 0) goto L_0x02a9
            r0 = r29
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r0.f277761o
            r2.getSelectCount()
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r0.f277761o
            r2.getNumOfFileExist()
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r0.f277761o
            r2.getCount()
            goto L_0x02b3
        L_0x02a9:
            r0 = r29
            goto L_0x02b3
        L_0x02ac:
            r25 = r1
            r24 = r2
            r27 = r7
            r1 = r8
        L_0x02b3:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131089I(r0)
            boolean r2 = r0.f277791T
            if (r2 == 0) goto L_0x0580
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r2 = r0.f277761o
            if (r2 == 0) goto L_0x0580
            r2.getClass()
            java.lang.String r3 = "reportBigPicLoadInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f> r4 = r2.f278170o1
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x02d5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0574
            java.lang.Object r5 = r4.next()
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f r5 = (com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip.C95553f) r5
            int r6 = r5.f278180b
            java.lang.String r7 = "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d ,publishid:%d,startTimes:%d,width:%d,height:%d,size:%d,mediaType:%d,path:%s"
            r8 = 12
            r14 = -1
            if (r6 == r14) goto L_0x0416
            os2.e0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r15 = r5.f278186h
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r6.mo139798DN(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r9 = r5.f278187i
            java.lang.String r9 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r14, r9)
            r15.append(r9)
            te3.kv2 r9 = r5.f278182d
            java.lang.String r9 = vr2.C102236a0.m134717L(r9)
            r15.append(r9)
            java.lang.String r9 = r15.toString()
            android.graphics.BitmapFactory$Options r14 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r9)
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r11 = (int) r10
            if (r14 == 0) goto L_0x032b
            int r10 = r14.outWidth
            int r11 = r14.outHeight
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r9)
            int r13 = (int) r12
            r12 = r11
            r11 = r13
            goto L_0x032d
        L_0x032b:
            r10 = 0
            r12 = 0
        L_0x032d:
            int r13 = vr2.C102236a0.m134709D(r9)
            te3.kv2 r14 = r5.f278182d
            int r14 = r14.f298685S
            if (r14 == 0) goto L_0x0338
            r13 = r14
        L_0x0338:
            if (r6 == 0) goto L_0x0412
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r8]
            int r15 = r5.f278179a
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r21 = 0
            r8[r21] = r15
            int r15 = r5.f278180b
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r22 = 1
            r8[r22] = r15
            r22 = r14
            long r14 = r5.f278185g
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 2
            r8[r15] = r14
            int r14 = r5.f278181c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 3
            r8[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            r15 = 4
            r8[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r21)
            r15 = 5
            r8[r15] = r14
            long r14 = r6.field_snsId
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 6
            r8[r15] = r14
            long r14 = r5.f278183e
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 7
            r8[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r15 = 8
            r8[r15] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r15 = 9
            r8[r15] = r14
            r15 = r22
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            r17 = 10
            r8[r17] = r19
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 11
            r8[r14] = r13
            r13 = 11601(0x2d51, float:1.6256E-41)
            r15.mo160131h(r13, r8)
            java.lang.Object[] r8 = new java.lang.Object[r14]
            int r13 = r5.f278179a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 0
            r8[r14] = r13
            int r13 = r5.f278180b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 1
            r8[r14] = r13
            long r13 = r5.f278185g
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r14 = 2
            r8[r14] = r13
            int r13 = r5.f278181c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14 = 3
            r8[r14] = r13
            long r13 = r6.field_snsId
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r13 = 4
            r8[r13] = r6
            long r5 = r5.f278183e
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 5
            r8[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r6 = 6
            r8[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r6 = 7
            r8[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r6 = 8
            r8[r6] = r5
            int r5 = vr2.C102236a0.m134709D(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 9
            r8[r6] = r5
            r5 = 10
            r8[r5] = r9
            r6 = r27
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r8)
            goto L_0x055f
        L_0x0412:
            r6 = r27
            goto L_0x055f
        L_0x0416:
            r6 = r27
            long r9 = r5.f278183e
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x055f
            long r9 = r5.f278184f
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x042a
            r9 = 1
            r5.f278180b = r9
            goto L_0x0433
        L_0x042a:
            r9 = 2
            r5.f278180b = r9
            long r9 = java.lang.System.currentTimeMillis()
            r5.f278184f = r9
        L_0x0433:
            long r9 = r5.f278184f
            long r11 = r5.f278183e
            long r9 = r9 - r11
            r5.f278185g = r9
            os2.e0 r9 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r10 = r5.f278186h
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r9.mo139798DN(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r12 = r5.f278187i
            java.lang.String r11 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r11, r12)
            r10.append(r11)
            te3.kv2 r11 = r5.f278182d
            java.lang.String r11 = vr2.C102236a0.m134717L(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            android.graphics.BitmapFactory$Options r11 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r10)
            long r12 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
            int r13 = (int) r12
            if (r11 == 0) goto L_0x0478
            int r12 = r11.outWidth
            int r11 = r11.outHeight
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r10)
            int r13 = (int) r14
            goto L_0x047a
        L_0x0478:
            r11 = 0
            r12 = 0
        L_0x047a:
            int r14 = vr2.C102236a0.m134709D(r10)
            te3.kv2 r15 = r5.f278182d
            int r15 = r15.f298685S
            if (r15 == 0) goto L_0x0485
            goto L_0x0486
        L_0x0485:
            r15 = r14
        L_0x0486:
            if (r9 == 0) goto L_0x055f
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r21 = r4
            int r4 = r5.f278179a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r22 = 0
            r8[r22] = r4
            int r4 = r5.f278180b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r23 = 1
            r8[r23] = r4
            r26 = r1
            long r0 = r5.f278185g
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 2
            r8[r1] = r0
            int r0 = r5.f278181c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 3
            r8[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r1 = 4
            r8[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r1 = 5
            r8[r1] = r0
            long r0 = r9.field_snsId
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 6
            r8[r1] = r0
            long r0 = r5.f278183e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 7
            r8[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1 = 8
            r8[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1 = 9
            r8[r1] = r0
            r0 = r14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r4 = 10
            r8[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r4 = 11
            r8[r4] = r1
            r1 = 11601(0x2d51, float:1.6256E-41)
            r0.mo160131h(r1, r8)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r5.f278179a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r0[r4] = r1
            int r1 = r5.f278180b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8 = 1
            r0[r8] = r1
            long r14 = r5.f278185g
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 2
            r0[r15] = r14
            int r14 = r5.f278181c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r16 = 3
            r0[r16] = r14
            long r8 = r9.field_snsId
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 4
            r0[r9] = r8
            long r4 = r5.f278183e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r8 = 6
            r0[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r11 = 7
            r0[r11] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12 = 8
            r0[r12] = r4
            int r4 = vr2.C102236a0.m134709D(r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1 = 9
            r0[r1] = r4
            r1 = 10
            r0[r1] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r7, r0)
            goto L_0x056a
        L_0x055f:
            r26 = r1
            r21 = r4
            r5 = 5
            r8 = 6
            r9 = 4
            r11 = 7
            r15 = 2
            r16 = 3
        L_0x056a:
            r0 = r29
            r27 = r6
            r4 = r21
            r1 = r26
            goto L_0x02d5
        L_0x0574:
            r26 = r1
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.ui.SnsInfoFlip$f> r0 = r2.f278170o1
            r0.clear()
            r0 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
        L_0x0580:
            r0 = r29
            com.tencent.mm.pluginsdk.model.i1 r1 = r0.f277799X
            if (r1 == 0) goto L_0x0589
            r1.stopWatching()
        L_0x0589:
            super.onDestroy()
            r1 = r24
            r2 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsBrowseUI.onDestroy():void");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132767B();
        }
        super.onPause();
        C103928o.m138642b();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        super.onResume();
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            snsInfoFlip.mo132768C(false);
        }
        C103928o.m138641a(true, true, true);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        Bundle bundle = this.f277796V0;
        SnsMethodCalculate.markStartTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        if (this.f277797W) {
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        } else {
            this.f277797W = true;
            Rect rect = (Rect) getIntent().getParcelableExtra("sns_gallery_thumb_location");
            this.f277786Q0 = rect;
            if (rect == null) {
                this.f277786Q0 = new Rect();
            }
            C45059m0 m0Var = this.f277790S0;
            Rect rect2 = this.f277786Q0;
            m0Var.mo70410e(rect2.left, rect2.top, rect2.width(), this.f277786Q0.height());
            if (bundle == null) {
                this.f277761o.getViewTreeObserver().addOnPreDrawListener(new C96320y3(this));
            }
            SnsMethodCalculate.markEndTimeMs("handleAnimation", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        }
        super.onStart();
        Log.m105918d("MicroMsg.SnsPopMediasUI", "onStart ");
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }

    /* renamed from: v4 */
    public void mo132180v4() {
        SnsMethodCalculate.markStartTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        SnsMethodCalculate.markEndTimeMs("toggleTitleBar", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
    }
}
