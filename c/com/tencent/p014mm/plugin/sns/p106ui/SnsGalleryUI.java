package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import av2.C92126r;
import av2.C92138t;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.widget.TouchMediaPreviewLayout;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C96983o3;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import os2.C100417r0;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101829pp1;
import vr2.C102236a0;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsGalleryUI */
public class SnsGalleryUI extends SnsBaseGalleryUI {

    /* renamed from: W */
    public static final /* synthetic */ int f278079W = 0;

    /* renamed from: P */
    public int f278080P = 0;

    /* renamed from: Q */
    public String f278081Q = "";

    /* renamed from: R */
    public int f278082R = 0;

    /* renamed from: S */
    public boolean f278083S = false;

    /* renamed from: T */
    public TouchMediaPreviewLayout f278084T;

    /* renamed from: U */
    public boolean f278085U = false;

    /* renamed from: V */
    public List<SnsGalleryUI$$i> f278086V = null;

    /* renamed from: c8 */
    public static void m122078c8(SnsGalleryUI snsGalleryUI) {
        SnsGalleryUI snsGalleryUI2 = snsGalleryUI;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        snsGalleryUI.getClass();
        SnsMethodCalculate.markStartTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        String selectId = snsGalleryUI2.f277761o.getSelectId();
        String selectedMediaId = snsGalleryUI2.f277761o.getSelectedMediaId();
        C101829pp1 selectItem = snsGalleryUI2.f277761o.getSelectItem();
        SnsInfoFlip snsInfoFlip = snsGalleryUI2.f277761o;
        snsInfoFlip.getClass();
        SnsMethodCalculate.markStartTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        boolean z = snsInfoFlip.f276801r;
        SnsMethodCalculate.markEndTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsInfoFlip snsInfoFlip2 = snsGalleryUI2.f277761o;
        snsInfoFlip2.getClass();
        SnsMethodCalculate.markStartTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        boolean z2 = snsInfoFlip2.f276802s;
        SnsMethodCalculate.markEndTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        Log.m105919d("MicroMsg.SnsGalleryUI", "click selectLocalId: %s, mediaId: %s, showTranslate: %s, showOcr: %s", selectId, selectedMediaId, Boolean.valueOf(z), Boolean.valueOf(z2));
        SnsInfo DN = C94866e1.Yx0().mo139798DN(selectId);
        if (DN != null && !DN.isWaitPost()) {
            snsGalleryUI2.mo132597Z7(C94901o.m120385m(selectItem.f299180d), true);
        }
        try {
            int e8 = snsGalleryUI2.mo132731e8(DN);
            GalleryTitleManager T7 = snsGalleryUI.mo132591T7();
            T7.getClass();
            SnsMethodCalculate.markStartTimeMs("clearQBarDataList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            T7.f276852v.clear();
            SnsMethodCalculate.markEndTimeMs("clearQBarDataList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            GalleryTitleManager T72 = snsGalleryUI.mo132591T7();
            boolean z3 = snsGalleryUI2.f278083S;
            C101804kv2 kv22 = selectItem.f299180d;
            SnsInfoFlip snsInfoFlip3 = snsGalleryUI2.f277761o;
            snsInfoFlip3.getClass();
            SnsMethodCalculate.markStartTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            boolean z4 = snsInfoFlip3.f276801r;
            SnsMethodCalculate.markEndTimeMs("needTranslationImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            SnsInfoFlip snsInfoFlip4 = snsGalleryUI2.f277761o;
            snsInfoFlip4.getClass();
            SnsMethodCalculate.markStartTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            boolean z5 = snsInfoFlip4.f276802s;
            SnsMethodCalculate.markEndTimeMs("needOCRImage", "com.tencent.mm.plugin.sns.ui.FlipView");
            T72.mo132176k(z3, DN, kv22, z4, z5, true, e8);
            C92138t.m115818a(snsGalleryUI);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsGalleryUI", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("showBottomSheetMenu", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: R7 */
    public int mo132589R7() {
        SnsMethodCalculate.markStartTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getImageOCRScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return 4;
    }

    /* renamed from: S7 */
    public int mo132590S7() {
        SnsMethodCalculate.markStartTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getTranslationScene", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return 4;
    }

    /* renamed from: U7 */
    public boolean mo132592U7() {
        SnsMethodCalculate.markStartTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("isTranslationImgEnable", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return true;
    }

    /* renamed from: W7 */
    public void mo132594W7(boolean z, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if ((z || z2) && mo132591T7() != null) {
            GalleryTitleManager T7 = mo132591T7();
            T7.getClass();
            SnsMethodCalculate.markStartTimeMs("isShowingMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            C92126r rVar = T7.f276841h;
            boolean z3 = rVar != null && rVar.mo126104g();
            SnsMethodCalculate.markEndTimeMs("isShowingMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (z3) {
                String selectId = this.f277761o.getSelectId();
                String selectedMediaId = this.f277761o.getSelectedMediaId();
                C101829pp1 selectItem = this.f277761o.getSelectItem();
                Log.m105925i("MicroMsg.SnsGalleryUI", "onTranslateEnd showTranslateMenu: %s, showOcrMenu: %s, selectLocalId: %s, mediaId: %s", Boolean.valueOf(z), Boolean.valueOf(z2), selectId, selectedMediaId);
                SnsInfo DN = C94866e1.Yx0().mo139798DN(selectId);
                mo132591T7().mo132176k(this.f278083S, DN, selectItem.f299180d, z, z2, true, mo132731e8(DN));
            }
        }
        SnsMethodCalculate.markEndTimeMs("onTranslateEnd", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: d8 */
    public void mo132730d8(FlipView$$l flipView$$l) {
        SnsMethodCalculate.markStartTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip == null) {
            SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        snsInfoFlip.mo132135e(flipView$$l);
        SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.SnsGalleryUI", "dispatchKeyEvent");
            SnsMethodCalculate.markStartTimeMs("backPress", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            boolean z = mo132583L7() || mo132584M7();
            SnsMethodCalculate.markEndTimeMs("backPress", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            if (z) {
                SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                return true;
            }
            Intent intent = new Intent();
            intent.putExtra("sns_cmd_list", mo132591T7().mo132173h());
            setResult(-1, intent);
            finish();
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return dispatchKeyEvent;
    }

    /* renamed from: e8 */
    public final int mo132731e8(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        int position = this.f277761o.getPosition();
        int size = snsInfo.getTimeLine().ContentObj.f298427h.size();
        int i = (size <= 1 || position <= 1 || position > size) ? 0 : position - 1;
        SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return i;
    }

    /* renamed from: f8 */
    public final C101804kv2 mo132732f8() {
        SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return null;
        }
        C101829pp1 selectItem = snsInfoFlip.getSelectItem();
        if (selectItem == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return null;
        }
        C101804kv2 kv22 = selectItem.f299180d;
        SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return kv22;
    }

    /* renamed from: g8 */
    public void mo132733g8(FlipView$$l flipView$$l) {
        SnsMethodCalculate.markStartTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip == null) {
            SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        snsInfoFlip.mo132155p(flipView$$l);
        SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        return C0966R.C0971layout.f360005c34;
    }

    public void initView() {
        C96983o3 o3Var;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        this.f278082R = getIntent().getIntExtra("sns_video_scene", 0);
        this.f278081Q = getIntent().getStringExtra("sns_gallery_userName");
        int intExtra = getIntent().getIntExtra("sns_gallery_localId", 0);
        this.f278083S = getIntent().getBooleanExtra("sns_gallery_is_self", false);
        this.f278080P = getIntent().getIntExtra("sns_gallery_position", 0);
        String i = C100417r0.m131420i("sns_table_", (long) intExtra);
        Log.m105925i("MicroMsg.SnsGalleryUI", "initView localId:%s, pos:%d", i, Integer.valueOf(this.f278080P));
        mo132030m1(i, this.f278080P);
        mo132582K7(this.f278083S, 1);
        SnsInfoFlip snsInfoFlip = new SnsInfoFlip(this);
        this.f277761o = snsInfoFlip;
        snsInfoFlip.setVideoScene(this.f278082R);
        this.f277761o.setNeedScanImage(true);
        C5431p1.C5432a dy02 = C94866e1.dy0();
        String str = this.f278081Q;
        dy02.getClass();
        SnsMethodCalculate.markStartTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        ArrayList arrayList = (ArrayList) ((HashMap) dy02.f21145p).get(str);
        SnsMethodCalculate.markEndTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        this.f277761o.setShowTitle(true);
        this.f277761o.setEnableHorLongBmpMode(false);
        if (this.f277753d) {
            this.f277761o.mo132797z(arrayList2, this.f278081Q, this.f278080P, mo132587P7(), this);
        } else {
            this.f277761o.mo132797z(arrayList2, this.f278081Q, this.f278080P, mo132586O7(), this);
        }
        this.f277761o.setOnDeleteAllAction(new SnsGalleryUI$$c(this));
        this.f277761o.setOnPageSelectListener(this);
        if (!C94847c1.m120216d()) {
            this.f277761o.getGallery().setLongClickOverListener(new SnsGalleryUI$$d(this));
        }
        C86709a0.m107528h();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f278081Q);
        if (z1Var == null || ((int) z1Var.f108320R1) <= 0 || !z1Var.mo62927s3()) {
            o3Var = this.f278081Q.equals(C75592q0.m90789s()) ? new C96983o3("album_self") : new C96983o3("album_stranger");
        } else {
            o3Var = new C96983o3("album_friend");
        }
        this.f277761o.setFromScene(o3Var);
        this.f277761o.setUIFromScene(mo132588Q7());
        SnsInfoFlip snsInfoFlip2 = this.f277761o;
        snsInfoFlip2.f278166k1 = this.f278081Q;
        addView(snsInfoFlip2);
        setBackBtn(new SnsGalleryUI$$e(this));
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new SnsGalleryUI$$f(this));
        if (C94847c1.m120216d()) {
            SnsMethodCalculate.markStartTimeMs("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            TouchMediaPreviewLayout touchMediaPreviewLayout = new TouchMediaPreviewLayout(getContext());
            this.f278084T = touchMediaPreviewLayout;
            touchMediaPreviewLayout.mo153909c(getContentView());
            this.f278084T.setScaleListener(new C96101o4(this));
            this.f278084T.setDoubleTapListener(new SnsGalleryUI$$b(this));
            SnsMethodCalculate.markEndTimeMs("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: m1 */
    public void mo132030m1(String str, int i) {
        C101789j00 j002;
        SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.mo132030m1(str, i);
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str);
        if (DN != null) {
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            String p0 = C102236a0.m134763p0(DN.field_snsId);
            if (!((ArrayList) snsReportHelper.f275566w).contains(p0)) {
                ((ArrayList) snsReportHelper.f275566w).add(p0);
            }
            SnsMethodCalculate.markEndTimeMs("browseGalleryFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            SnsReportHelper snsReportHelper2 = SnsReportHelper.f275506m0;
            snsReportHelper2.getClass();
            SnsMethodCalculate.markStartTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            String str2 = C102236a0.m134763p0(DN.field_snsId) + "_" + i;
            if (!((ArrayList) snsReportHelper2.f275567x).contains(str2)) {
                ((ArrayList) snsReportHelper2.f275567x).add(str2);
            }
            SnsMethodCalculate.markEndTimeMs("browseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            TimeLineObject timeLine = DN.getTimeLine();
            if (!(timeLine == null || (j002 = timeLine.ContentObj) == null || Util.isNullOrNil((List) j002.f298427h))) {
                SnsReportHelper snsReportHelper3 = SnsReportHelper.f275506m0;
                snsReportHelper3.getClass();
                SnsMethodCalculate.markStartTimeMs("getLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                SnsAlbumFeedBehaviourStruct peekLast = snsReportHelper3.f275513G.peekLast();
                SnsMethodCalculate.markEndTimeMs("getLastSnsAlbumFeedBehaviourStruct", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                if (peekLast == null) {
                    SnsAlbumFeedBehaviourStruct K = SnsReportHelper.f275506m0.mo131350K();
                    K.f265939j = 1;
                    K.f265935f = K.mo86045b("FeedId", C102236a0.m134763p0(DN.field_snsId), true);
                    K.f265933d = K.mo86045b("ToUsername", SnsReportHelper.f275506m0.mo131341B().f266212d, true);
                    K.f265934e = SnsReportHelper.f275506m0.mo131341B().f266213e;
                    C101789j00 j003 = timeLine.ContentObj;
                    K.f265936g = (long) j003.f298424e;
                    K.f265938i = (long) j003.f298427h.size();
                    SnsReportHelper.f275506m0.mo131388u();
                } else if (!Util.isEqual(C102236a0.m134763p0(DN.field_snsId), peekLast.f265935f)) {
                    SnsReportHelper.f275506m0.mo131377j();
                    SnsAlbumFeedBehaviourStruct K2 = SnsReportHelper.f275506m0.mo131350K();
                    K2.f265939j = 0;
                    K2.f265935f = K2.mo86045b("FeedId", C102236a0.m134763p0(DN.field_snsId), true);
                    K2.f265933d = K2.mo86045b("ToUsername", SnsReportHelper.f275506m0.mo131341B().f266212d, true);
                    K2.f265934e = SnsReportHelper.f275506m0.mo131341B().f266213e;
                    C101789j00 j004 = timeLine.ContentObj;
                    K2.f265936g = (long) j004.f298424e;
                    K2.f265938i = (long) j004.f298427h.size();
                    SnsReportHelper.f275506m0.mo131388u();
                }
                SnsReportHelper snsReportHelper4 = SnsReportHelper.f275506m0;
                snsReportHelper4.getClass();
                SnsMethodCalculate.markStartTimeMs("feedBrowseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                String str3 = C102236a0.m134763p0(DN.field_snsId) + "_" + i;
                if (!((ArrayList) snsReportHelper4.f275515I).contains(str3)) {
                    ((ArrayList) snsReportHelper4.f275515I).add(str3);
                }
                SnsMethodCalculate.markEndTimeMs("feedBrowseGalleryMedia", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: o2 */
    public void mo132031o2(boolean z, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        if (this.f277761o != null) {
            if (!Util.isNullOrNil(str) && i != 3) {
                this.f277761o.mo132770E(str);
            }
            if (z) {
                this.f277761o.mo132768C(true);
            } else {
                this.f277761o.mo132796y();
            }
        }
        SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        C101804kv2 kv22;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        Log.m105924i("MicroMsg.SnsGalleryUI", "onAcvityResult requestCode:" + i);
        if (i2 != -1) {
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
            return;
        }
        if (2 == i) {
            if (-1 == i2) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                String stringExtra2 = intent.getStringExtra("custom_send_text");
                SnsInfoFlip snsInfoFlip = this.f277761o;
                if (snsInfoFlip != null) {
                    C101804kv2 kv23 = snsInfoFlip.getSelectItem().f299180d;
                    if (kv23.f298690e != 6) {
                        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                        return;
                    } else {
                        kv22 = kv23;
                        str = this.f277761o.getSelectId();
                    }
                } else {
                    kv22 = null;
                    str = null;
                }
                if (kv22 == null || str == null) {
                    SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    return;
                }
                C92126r.f263717g.mo126113b(this, stringExtra, stringExtra2, kv22, str);
            }
        } else if (1 == i) {
            int intExtra = intent.getIntExtra("sns_gallery_op_id", 0);
            String i3 = C100417r0.m131420i("sns_table_", (long) intent.getIntExtra("sns_gallery_op_id", 0));
            GalleryTitleManager T7 = mo132591T7();
            T7.getClass();
            SnsMethodCalculate.markStartTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            if (intExtra == 0) {
                SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            } else {
                T7.f276838e.mo130689a(intExtra);
                SnsMethodCalculate.markEndTimeMs("addOpCmd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            }
            mo132031o2(true, i3, 1);
            if (intent.getBooleanExtra("sns_gallery_force_finish", false)) {
                Intent intent2 = new Intent();
                intent2.putExtra("sns_cmd_list", mo132591T7().mo132173h());
                setResult(-1, intent2);
                finish();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        C85875k4.m106195m0(this);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f3275lu));
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f3275lu));
        initView();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        snsReportHelper.f275509C = System.currentTimeMillis();
        SnsMethodCalculate.markEndTimeMs("galleryPageStart", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        getWindow().clearFlags(128);
        C94866e1.Fx0().mo131089I(this);
        super.onDestroy();
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (snsReportHelper.f275509C != 0) {
            snsReportHelper.f275510D += System.currentTimeMillis() - snsReportHelper.f275509C;
            snsReportHelper.f275509C = 0;
        }
        SnsMethodCalculate.markEndTimeMs("galleryPageStop", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsReportHelper.f275506m0.mo131389v();
        SnsReportHelper.f275506m0.mo131377j();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onPause();
        C103928o.m138642b();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onResume() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onResume();
        SnsInfoFlip snsInfoFlip = this.f277761o;
        if (snsInfoFlip != null) {
            C101804kv2 cntMedia = snsInfoFlip.getCntMedia();
            this.f277761o.mo132768C(cntMedia != null && cntMedia.f298690e == 6);
        }
        C103928o.m138641a(true, true, true);
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onStart();
        SnsReportHelper.f275506m0.mo131388u();
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.onStop();
        SnsReportHelper.f275506m0.mo131389v();
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: s */
    public void mo132179s(String str, List<ImageQBarDataBean> list) {
        SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markStartTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsGalleryUI$$a snsGalleryUI$$a = new SnsGalleryUI$$a(this, str, list);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            snsGalleryUI$$a.run();
        }
        ((C119157j) C119157j.f356862d).mo183895z(snsGalleryUI$$a);
        SnsMethodCalculate.markEndTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }

    /* renamed from: s5 */
    public void mo132601s5(C101804kv2 kv22, int i, String str) {
        TouchMediaPreviewLayout touchMediaPreviewLayout;
        SnsMethodCalculate.markStartTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        super.mo132601s5(kv22, i, str);
        if (C94847c1.m120216d() && (touchMediaPreviewLayout = this.f278084T) != null) {
            if (touchMediaPreviewLayout.getAddTouchView()) {
                this.f278084T.mo153914f();
            }
            if (kv22.f298690e == 6) {
                this.f278084T.setEnable(true);
                if (this.f278084T.getLongPressListener() == null) {
                    this.f278084T.setLongPressListener(new SnsGalleryUI$$g(this));
                }
                this.f277761o.getGallery().setLongClickOverListener((MMViewPager.C19705g) null);
            } else {
                this.f278084T.setEnable(false);
                this.f278084T.setLongPressListener((TouchMediaPreviewLayout.C97276b) null);
                if (!this.f278085U) {
                    this.f278085U = true;
                    this.f277761o.getGallery().setLongClickOverListener(new SnsGalleryUI$$h(this));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
    }
}
