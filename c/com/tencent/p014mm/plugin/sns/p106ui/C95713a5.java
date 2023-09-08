package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91999u;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94944s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import ks2.C99181f;
import te3.C101804kv2;
import te3.C101817mv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.a5 */
public class C95713a5 {

    /* renamed from: b */
    public static int[] f279136b = {0, 0, 1, 3, 6, 9};

    /* renamed from: c */
    public static int[] f279137c = {C0966R.C0970id.f5720ms};

    /* renamed from: d */
    public static int[] f279138d = {C0966R.C0970id.f5720ms, C0966R.C0970id.f5721mt, C0966R.C0970id.f5722mu};

    /* renamed from: e */
    public static int[] f279139e = {C0966R.C0970id.f5720ms, C0966R.C0970id.f5721mt, C0966R.C0970id.f5722mu, C0966R.C0970id.f5723mv, C0966R.C0970id.f5724mw, C0966R.C0970id.f5725mx};

    /* renamed from: f */
    public static int[] f279140f = {C0966R.C0970id.f5720ms, C0966R.C0970id.f5721mt, C0966R.C0970id.f5722mu, C0966R.C0970id.f5723mv, C0966R.C0970id.f5724mw, C0966R.C0970id.f5725mx, C0966R.C0970id.f5726my, C0966R.C0970id.f5727mz, C0966R.C0970id.f5728n0};

    /* renamed from: g */
    public static double f279141g = -1.0d;

    /* renamed from: h */
    public static double f279142h = -1.0d;

    /* renamed from: i */
    public static double f279143i = -1.0d;

    /* renamed from: j */
    public static boolean f279144j;

    /* renamed from: k */
    public static int f279145k = -1;

    /* renamed from: a */
    public Context f279146a;

    public C95713a5(Context context) {
        new LinkedList();
        this.f279146a = context;
        SnsMethodCalculate.markStartTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (this.f279146a instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) this.f279146a).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            Point point = new Point();
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
            C94866e1.uy0(point);
        }
        SnsMethodCalculate.markEndTimeMs("updateScreenSize", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        f279144j = 1 == ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_group_download, 0);
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            f279144j = true;
        }
    }

    /* renamed from: a */
    public static boolean m122518a() {
        SnsMethodCalculate.markStartTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        Log.m105919d("MicroMsg.SnsMultiLineImageLineMgr", "enableGroupDownload_cmd: %d.", Integer.valueOf(f279145k));
        int i = f279145k;
        if (i == 1) {
            Log.m105918d("MicroMsg.SnsMultiLineImageLineMgr", "enforce group download.");
            CdnLogic.setSnsImagePrivateProtocolAvalible(true);
            CdnLogic.setSnsImageStreamProtocolAvalible(true);
            SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return true;
        } else if (i != 2) {
            boolean allowBatchImageDownload = CdnLogic.allowBatchImageDownload();
            Log.m105919d("MicroMsg.SnsMultiLineImageLineMgr", "allowGroupDownload: %s, enableGroupDownload: %s.", Boolean.valueOf(allowBatchImageDownload), Boolean.valueOf(f279144j));
            if (!allowBatchImageDownload || !f279144j) {
                Log.m105924i("MicroMsg.SnsMultiLineImageLineMgr", "groupDownloadDisable!!!");
                SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return true;
        } else {
            Log.m105918d("MicroMsg.SnsMultiLineImageLineMgr", "enforce single download.");
            SnsMethodCalculate.markEndTimeMs("groupDownloadEnable", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return false;
        }
    }

    /* renamed from: b */
    public void mo133157b(PhotosContent photosContent, TimeLineObject timeLineObject, String str, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i, int i2, int i3, boolean z, boolean z2, C96983o3 o3Var, boolean z3) {
        PhotosContent photosContent2 = photosContent;
        int i4 = i2;
        int i5 = i3;
        SnsMethodCalculate.markStartTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = f279140f;
        if (i4 == 2 || i4 == 10) {
            iArr = f279137c;
        } else if (i4 == 3) {
            iArr = f279138d;
        } else if (i4 == 4) {
            iArr = f279139e;
        }
        LinkedList<C101804kv2> linkedList = timeLineObject.ContentObj.f298427h;
        if (f279141g < 0.0d) {
            f279141g = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 160.0f);
            f279142h = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 200.0f);
            f279143i = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 44.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 66.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 300.0f);
        }
        int size = linkedList.size();
        if (size == 0) {
            for (int i6 = 0; i6 < iArr.length; i6++) {
                C94866e1.Fx0().mo131091K(photosContent.mo132426b(i6));
                photosContent.mo132426b(i6).setPosition(i5);
            }
            photosContent.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        photosContent.setVisibility(0);
        if (size == 1) {
            for (int i7 = 1; i7 < iArr.length; i7++) {
                TagImageView b = photosContent.mo132426b(i7);
                b.setVisibility(8);
                C94866e1.Fx0().mo131091K(b);
                photosContent.mo132426b(i7).setPosition(i5);
            }
            photosContent.mo132426b(0).setVisibility(0);
            mo133161f(linkedList.get(0), photosContent.mo132426b(0), str, i, i3, z2, o3Var, i2, z3, (SnsInfo) null);
            SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("setHbImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* renamed from: c */
    public boolean mo133158c(QFadeImageView qFadeImageView, C101804kv2 kv22, String str, int i, int i2, int i3, boolean z, C96983o3 o3Var, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        boolean f = mo133161f(kv22, qFadeImageView, str, i, i3, z, o3Var, i2, false, snsInfo);
        SnsMethodCalculate.markEndTimeMs("setImage", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return f;
    }

    /* renamed from: d */
    public void mo133159d(PhotosContent photosContent, TimeLineObject timeLineObject, String str, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i, int i2, int i3, boolean z, boolean z2, C96983o3 o3Var, List<C101817mv2> list, String str2, SnsInfo snsInfo) {
        ArrayList arrayList;
        LinkedList<C101804kv2> linkedList;
        TagImageView tagImageView;
        C96235u4 u4Var;
        C94853e.C94863j jVar;
        String str3;
        String str4;
        int i4;
        ArrayList arrayList2;
        int i5;
        LinkedList<C101804kv2> linkedList2;
        PhotosContent photosContent2 = photosContent;
        String str5 = str;
        int i6 = i2;
        int i7 = i3;
        boolean z3 = z2;
        List<C101817mv2> list2 = list;
        SnsMethodCalculate.markStartTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        int[] iArr = f279140f;
        if (i6 == 2 || i6 == 10 || i6 == 13) {
            iArr = f279137c;
        } else if (i6 == 3) {
            iArr = f279138d;
        } else if (i6 == 4) {
            iArr = f279139e;
        }
        LinkedList<C101804kv2> linkedList3 = timeLineObject.ContentObj.f298427h;
        if (f279141g < 0.0d) {
            f279141g = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 160.0f);
            f279142h = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 200.0f);
            f279143i = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 44.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 66.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 300.0f);
        }
        int size = linkedList3.size();
        Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "snsid:%s  size:%d", snsInfo.getSnsId(), Integer.valueOf(size));
        int i8 = 8;
        if (size == 0) {
            for (int i9 = 0; i9 < iArr.length; i9++) {
                C94866e1.Fx0().mo131091K(photosContent2.mo132426b(i9));
                photosContent2.mo132426b(i9).setPosition(i7);
            }
            photosContent2.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        photosContent2.setImageViewWidth(C94866e1.Hx0());
        photosContent2.setVisibility(0);
        if (size == 1) {
            int i15 = 1;
            while (i15 < iArr.length) {
                TagImageView b = photosContent2.mo132426b(i15);
                b.setVisibility(i8);
                C94866e1.Fx0().mo131091K(b);
                photosContent2.mo132426b(i15).setPosition(i7);
                i15++;
                i8 = 8;
            }
            photosContent2.mo132426b(0).setVisibility(0);
            if (list2 == null || list.size() <= 0) {
                Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with with out size", "[image-flow]", snsInfo.getSnsId(), linkedList3.get(0).f298689d);
                mo133161f(linkedList3.get(0), photosContent2.mo132426b(0), str, i, i3, z2, o3Var, i2, false, snsInfo);
            } else {
                C101817mv2 mv22 = list2.get(0);
                Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSingle bitmap with size:[%d %d],", "[image-flow]", snsInfo.getSnsId(), linkedList3.get(0).f298689d, Float.valueOf(mv22.f298875d), Float.valueOf(mv22.f298876e));
                mo133162g(linkedList3.get(0), photosContent2.mo132426b(0), str, i, i3, z2, o3Var, i2, false, mv22, snsInfo);
            }
            SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        C94853e.C94863j jVar2 = null;
        if (!m122518a()) {
            jVar2 = new C94853e.C94863j(str2, size);
        } else {
            String str6 = str2;
        }
        C94853e.C94863j jVar3 = jVar2;
        String str7 = "com.tencent.mm.plugin.sns.model.DownloadManager";
        String str8 = "addMediaId";
        if (size == 4) {
            ArrayList arrayList3 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            int length = iArr.length - 1;
            int i16 = 3;
            while (length >= 0) {
                TagImageView b2 = photosContent2.mo132426b(length);
                b2.setPosition(i7);
                if (length == 0 || length == 1 || length == 3 || length == 4) {
                    b2.setVisibility(0);
                    arrayList3.add(b2);
                    C96235u4 u4Var2 = new C96235u4();
                    u4Var2.f281206a = str5;
                    ArrayList arrayList4 = arrayList3;
                    int i17 = i16;
                    i16 = i17 - 1;
                    u4Var2.f281207b = i17;
                    u4Var2.f281210e = z3;
                    u4Var2.f281208c = i7;
                    b2.setTag(u4Var2);
                    if (z || !m122518a()) {
                        C101804kv2 kv22 = linkedList3.get(u4Var2.f281207b);
                        int i18 = length;
                        i5 = size;
                        C94866e1.Vx0().mo130985j(kv22.f298689d, jVar3);
                        C94853e Vx0 = C94866e1.Vx0();
                        String str9 = kv22.f298689d;
                        Vx0.getClass();
                        SnsMethodCalculate.markStartTimeMs(str8, str7);
                        Vx0.f274832s.add(str9);
                        SnsMethodCalculate.markEndTimeMs(str8, str7);
                        arrayList2 = arrayList4;
                        i4 = i18;
                        str4 = str8;
                        str3 = str7;
                        linkedList2 = linkedList3;
                        jVar = jVar3;
                        mo133163h(str2, kv22, b2, i, i3, o3Var);
                    } else {
                        arrayList2 = arrayList4;
                        i4 = length;
                        str4 = str8;
                        str3 = str7;
                        i5 = size;
                        linkedList2 = linkedList3;
                        jVar = jVar3;
                    }
                    int i19 = u4Var2.f281207b;
                    sparseArray.put(i19, linkedList2.get(i19));
                    sparseArray2.put(u4Var2.f281207b, b2);
                } else {
                    b2.setVisibility(8);
                    C94866e1.Fx0().mo131091K(b2);
                    arrayList2 = arrayList3;
                    i4 = length;
                    str4 = str8;
                    str3 = str7;
                    i5 = size;
                    linkedList2 = linkedList3;
                    jVar = jVar3;
                }
                length = i4 - 1;
                photosContent2 = photosContent;
                linkedList3 = linkedList2;
                size = i5;
                arrayList3 = arrayList2;
                str8 = str4;
                str7 = str3;
                jVar3 = jVar;
                z3 = z2;
            }
            int i25 = size;
            if (!z && m122518a() && sparseArray.size() > 0) {
                mo133164i(str2, sparseArray, sparseArray2, i, o3Var, i25);
            }
            SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return;
        }
        String str10 = str8;
        String str11 = str7;
        int i26 = size;
        LinkedList<C101804kv2> linkedList4 = linkedList3;
        C94853e.C94863j jVar4 = jVar3;
        ArrayList arrayList5 = new ArrayList();
        SparseArray sparseArray3 = new SparseArray();
        SparseArray sparseArray4 = new SparseArray();
        int length2 = iArr.length - 1;
        while (length2 >= 0) {
            TagImageView b3 = photosContent.mo132426b(length2);
            b3.setPosition(i7);
            if (length2 < linkedList4.size()) {
                b3.setVisibility(0);
                arrayList5.add(b3);
                C96235u4 u4Var3 = new C96235u4();
                u4Var3.f281206a = str5;
                u4Var3.f281207b = length2;
                LinkedList<C101804kv2> linkedList5 = linkedList4;
                u4Var3.f281210e = z2;
                u4Var3.f281208c = i7;
                b3.setTag(u4Var3);
                if (z || !m122518a()) {
                    C101804kv2 kv23 = linkedList5.get(u4Var3.f281207b);
                    arrayList = arrayList5;
                    C94853e.C94863j jVar5 = jVar4;
                    C94866e1.Vx0().mo130985j(kv23.f298689d, jVar5);
                    C94853e Vx02 = C94866e1.Vx0();
                    String str12 = kv23.f298689d;
                    Vx02.getClass();
                    jVar4 = jVar5;
                    String str13 = str10;
                    String str14 = str11;
                    SnsMethodCalculate.markStartTimeMs(str13, str14);
                    Vx02.f274832s.add(str12);
                    SnsMethodCalculate.markEndTimeMs(str13, str14);
                    str11 = str14;
                    linkedList = linkedList5;
                    str10 = str13;
                    u4Var = u4Var3;
                    tagImageView = b3;
                    mo133163h(str2, kv23, b3, i, i3, o3Var);
                } else {
                    u4Var = u4Var3;
                    tagImageView = b3;
                    arrayList = arrayList5;
                    linkedList = linkedList5;
                }
                int i27 = u4Var.f281207b;
                sparseArray3.put(i27, linkedList.get(i27));
                sparseArray4.put(u4Var.f281207b, tagImageView);
            } else {
                TagImageView tagImageView2 = b3;
                arrayList = arrayList5;
                linkedList = linkedList4;
                boolean z4 = z2;
                tagImageView2.setVisibility(8);
                C94866e1.Fx0().mo131091K(tagImageView2);
            }
            length2--;
            str5 = str;
            i7 = i3;
            linkedList4 = linkedList;
            arrayList5 = arrayList;
        }
        if (!z && m122518a() && sparseArray3.size() > 0) {
            mo133164i(str2, sparseArray3, sparseArray4, i, o3Var, i26);
        }
        SnsMethodCalculate.markEndTimeMs("setImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* renamed from: e */
    public void mo133160e(SparseArray<C101804kv2> sparseArray, SparseArray<View> sparseArray2, int i, int i2, C96983o3 o3Var, String str) {
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("setImproveMultiImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (f279141g < 0.0d) {
            f279141g = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 160.0f);
            f279142h = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 200.0f);
            f279143i = (double) BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 44.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 66.0f);
            BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f279146a, 300.0f);
        }
        int size = sparseArray.size();
        Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "snsid:%s  size:%d", str2, Integer.valueOf(size));
        C94853e.C94863j jVar = null;
        if (!m122518a()) {
            jVar = new C94853e.C94863j(str2, size);
        }
        C94853e.C94863j jVar2 = jVar;
        SparseArray sparseArray3 = new SparseArray();
        if (!m122518a() || sparseArray3.size() <= 0) {
            for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                C101804kv2 kv22 = sparseArray.get(i3);
                C94866e1.Vx0().mo130985j(kv22.f298689d, jVar2);
                C94853e Vx0 = C94866e1.Vx0();
                String str3 = kv22.f298689d;
                Vx0.getClass();
                SnsMethodCalculate.markStartTimeMs("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                Vx0.f274832s.add(str3);
                SnsMethodCalculate.markEndTimeMs("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
                mo133163h(str, kv22, (TagImageView) sparseArray2.get(i3), i, i2, o3Var);
            }
        } else {
            mo133164i(str, sparseArray, sparseArray2, i, o3Var, size);
        }
        SnsMethodCalculate.markEndTimeMs("setImproveMultiImages", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* renamed from: f */
    public final boolean mo133161f(C101804kv2 kv22, QFadeImageView qFadeImageView, String str, int i, int i2, boolean z, C96983o3 o3Var, int i3, boolean z2, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        boolean g = mo133162g(kv22, qFadeImageView, str, i, i2, z, o3Var, i3, z2, new C101817mv2(), snsInfo);
        SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return g;
    }

    /* renamed from: g */
    public final boolean mo133162g(C101804kv2 kv22, QFadeImageView qFadeImageView, String str, int i, int i2, boolean z, C96983o3 o3Var, int i3, boolean z2, C101817mv2 mv22, SnsInfo snsInfo) {
        int i4;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        String str2;
        String str3;
        C101804kv2 kv23 = kv22;
        QFadeImageView qFadeImageView2 = qFadeImageView;
        int i5 = i3;
        C101817mv2 mv23 = mv22;
        SnsMethodCalculate.markStartTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        if (qFadeImageView2 == null) {
            Log.m105920e("MicroMsg.SnsMultiLineImageLineMgr", "");
            SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
            return false;
        }
        C96235u4 u4Var = new C96235u4();
        u4Var.f281206a = str;
        u4Var.f281207b = 0;
        new ArrayList().add(qFadeImageView2);
        u4Var.f281210e = z;
        u4Var.f281208c = i2;
        qFadeImageView2.setTag(u4Var);
        boolean z3 = true;
        if (i5 != 10 || !z2) {
            C96983o3 o3Var2 = o3Var;
            Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb start", "[image-flow]", snsInfo.getSnsId(), kv23.f298689d);
            C94901o Fx0 = C94866e1.Fx0();
            String snsId = snsInfo.getSnsId();
            Fx0.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            boolean b0 = Fx0.mo131108b0(kv22, qFadeImageView, -1, i, o3Var, 1, snsId);
            SnsMethodCalculate.markEndTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            i4 = 2;
            Log.m105925i("MicroMsg.SnsMultiLineImageLineMgr", "[%s][id:%s][media:%s] setSnsThumb finish with result:%b", "[image-flow]", snsInfo.getSnsId(), kv23.f298689d, Boolean.valueOf(b0));
            z3 = b0;
        } else {
            C94901o Fx02 = C94866e1.Fx0();
            String snsId2 = snsInfo.getSnsId();
            Fx02.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            SnsMethodCalculate.markStartTimeMs("setSnsBlurThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            if (kv23 == null || (str3 = kv23.f298689d) == null || str3.equals("")) {
                str2 = "setSnsBlurThumb";
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                String y = C102236a0.m134780y(4, kv23.f298689d);
                C94901o oVar = Fx02;
                String str4 = y;
                str2 = "setSnsBlurThumb";
                oVar.mo131088H(snsId2, kv22, y, o3Var, false);
                oVar.mo131128l0(qFadeImageView, str4, true, -1, i);
                String str5 = str4;
                C92714n i6 = Fx02.mo131121i(str5, kv23.f298689d);
                boolean f = C102236a0.m134742f(i6);
                Log.m105926v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + f);
                if (!f) {
                    Fx02.mo131124j0(qFadeImageView2);
                    if (((HashSet) Fx02.f275018x).contains(str5)) {
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        Fx02.mo131084D(4, kv23, o3Var);
                        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                } else {
                    Fx02.mo131094N(qFadeImageView2, str5, i6, false);
                    C99181f.m129208m(kv23.f298689d);
                    C99181f.m129209o(kv23.f298689d);
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            }
            SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            i4 = 2;
        }
        C101817mv2 mv24 = kv23.f298698p;
        if (mv24 != null) {
            d2 = (double) mv24.f298875d;
            d = (double) mv24.f298876e;
        } else {
            d2 = 0.0d;
            d = 0.0d;
        }
        if (i5 != i4 || snsInfo == null || !snsInfo.isAd() || !snsInfo.getAdXml().isShowPlayIconOnCover()) {
            if (d2 <= 0.0d || d <= 0.0d) {
                d6 = f279141g;
                d5 = d6;
            } else {
                double d7 = f279142h;
                double min = Math.min(d7 / d2, d7 / d);
                d6 = d2 * min;
                d5 = d * min;
                double d8 = f279143i;
                if (d6 < d8) {
                    double d9 = (d8 * 1.0d) / d6;
                    d6 *= d9;
                    d5 *= d9;
                }
                if (d5 < d8) {
                    double d15 = (d8 * 1.0d) / d5;
                    d6 *= d15;
                    d5 *= d15;
                }
                double d16 = f279142h;
                if (d6 > d16) {
                    d6 = d16;
                }
                if (d5 > d16) {
                    d5 = d16;
                }
            }
            d4 = d6 < 1.0d ? 1.0d : d6;
            d3 = d5 < 1.0d ? 1.0d : d5;
            if (mv23 != null) {
                float f2 = mv23.f298875d;
                if (f2 > 0.0f) {
                    float f3 = mv23.f298876e;
                    if (f3 > 0.0f) {
                        d4 = (double) f2;
                        d3 = (double) f3;
                    }
                }
            }
        } else {
            Pair<Integer, Integer> k = C91999u.m115565k((int) d2, (int) d, this.f279146a, false);
            d4 = (double) ((Integer) k.first).intValue();
            d3 = (double) ((Integer) k.second).intValue();
        }
        if (qFadeImageView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) qFadeImageView.getLayoutParams();
            if (((double) layoutParams.width) == d4 && ((double) layoutParams.height) == d3) {
                SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
                return z3;
            }
            qFadeImageView.setLayoutParams(new FrameLayout.LayoutParams((int) d4, (int) d3));
        }
        SnsMethodCalculate.markEndTimeMs("setSingle", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        return z3;
    }

    /* renamed from: h */
    public final void mo133163h(String str, C101804kv2 kv22, QFadeImageView qFadeImageView, int i, int i2, C96983o3 o3Var) {
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        C94866e1.Fx0().mo131101U(str, kv22, qFadeImageView, i, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }

    /* renamed from: i */
    public void mo133164i(String str, SparseArray<C101804kv2> sparseArray, SparseArray<View> sparseArray2, int i, C96983o3 o3Var, int i2) {
        SparseArray<C101804kv2> sparseArray3 = sparseArray;
        SparseArray<View> sparseArray4 = sparseArray2;
        SnsMethodCalculate.markStartTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
        C94901o Fx0 = C94866e1.Fx0();
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Log.m105924i("MicroMsg.LazyerImageLoader2", "enter group img download logic!");
        if (sparseArray3 == null || sparseArray.size() <= 0) {
            Log.m105920e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, medias is invalid.");
            SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (sparseArray4 == null || sparseArray2.size() <= 0) {
            Log.m105920e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, imageViews is invalid.");
            SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            int size = sparseArray.size();
            int size2 = sparseArray2.size();
            int i3 = size == size2 ? size : -1;
            boolean z = false;
            if (-1 == i3) {
                Log.m105921e("MicroMsg.LazyerImageLoader2", "setSnsMultiImg check params, mediaSize(%d) != imgViewSize(%d).", Integer.valueOf(size), Integer.valueOf(size2));
                SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            } else {
                SparseArray sparseArray5 = new SparseArray();
                SparseArray sparseArray6 = new SparseArray();
                SparseArray sparseArray7 = new SparseArray();
                int i4 = 0;
                while (i4 < i3) {
                    int keyAt = sparseArray3.keyAt(i4);
                    C101804kv2 kv22 = sparseArray3.get(keyAt);
                    View view = sparseArray4.get(keyAt);
                    view.setDrawingCacheEnabled(z);
                    String y = C102236a0.m134780y(z ? 1 : 0, kv22.f298689d);
                    C94901o oVar = Fx0;
                    View view2 = view;
                    C101804kv2 kv23 = kv22;
                    int i5 = keyAt;
                    int i6 = i4;
                    SparseArray sparseArray8 = sparseArray5;
                    oVar.mo131088H(str, kv22, y, o3Var, true);
                    String str2 = y;
                    oVar.mo131132o0(view2, str2, true, -1, i, C94901o.C94911h.IMG_SCENE_NONE);
                    C101804kv2 kv24 = kv23;
                    C92714n i7 = Fx0.mo131121i(str2, kv24.f298689d);
                    if (!C102236a0.m134742f(i7)) {
                        Log.m105924i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache miss.");
                        Fx0.mo131124j0(view2);
                        if (((HashSet) Fx0.f275018x).contains(str2)) {
                            Log.m105925i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", str2);
                            sparseArray5 = sparseArray8;
                        } else {
                            sparseArray5 = sparseArray8;
                            sparseArray5.put(i5, kv24);
                        }
                    } else {
                        sparseArray5 = sparseArray8;
                        Log.m105924i("MicroMsg.LazyerImageLoader2", "setSnsMultiImg, cache hit.");
                        C99181f.m129208m(kv24.f298689d);
                        C99181f.m129209o(kv24.f298689d);
                        Fx0.mo131094N(view2, str2, i7, false);
                    }
                    i4 = i6 + 1;
                    z = false;
                }
                if (sparseArray5.size() != 0) {
                    Log.m105924i("MicroMsg.LazyerImageLoader2", "ok, let's download.");
                    C94866e1.ky0().execute(new C94944s(Fx0, sparseArray5, sparseArray6, sparseArray7, str, o3Var, i2));
                }
                SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            }
        }
        SnsMethodCalculate.markEndTimeMs("setSnsMultiImg", "com.tencent.mm.plugin.sns.ui.SnsMultiLineImageLineMgr");
    }
}
