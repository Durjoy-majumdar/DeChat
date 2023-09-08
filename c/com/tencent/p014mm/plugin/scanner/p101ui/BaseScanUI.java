package com.tencent.p014mm.plugin.scanner.p101ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import aw0.C103928o;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLivePauseActionEvent;
import com.tencent.p014mm.autogen.events.PublishScanCodeResultEvent;
import com.tencent.p014mm.autogen.events.ScanDarkDetectEvent;
import com.tencent.p014mm.autogen.events.ScanFlashSwitchEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.android_scanner_performanceStruct;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import com.tencent.p014mm.plugin.scanner.model.C106071g1;
import com.tencent.p014mm.plugin.scanner.model.C106072h1;
import com.tencent.p014mm.plugin.scanner.model.C19002a1;
import com.tencent.p014mm.plugin.scanner.model.C19003b;
import com.tencent.p014mm.plugin.scanner.model.C19006b1;
import com.tencent.p014mm.plugin.scanner.model.C19011d;
import com.tencent.p014mm.plugin.scanner.model.C19013d1;
import com.tencent.p014mm.plugin.scanner.model.C19016e1;
import com.tencent.p014mm.plugin.scanner.model.C19019f1;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C19030n0;
import com.tencent.p014mm.plugin.scanner.model.C19032z0;
import com.tencent.p014mm.plugin.scanner.model.C71004i;
import com.tencent.p014mm.plugin.scanner.model.C71007x0;
import com.tencent.p014mm.plugin.scanner.model.C85412x;
import com.tencent.p014mm.plugin.scanner.model.ScanProductInfo;
import com.tencent.p014mm.plugin.scanner.p101ui.ScanUIRectView;
import com.tencent.p014mm.plugin.scanner.p101ui.component.ScanUITopOpButtonComponent;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanDebugView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanInfoMaskView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanProductMaskDecorView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanScrollTabView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import com.tencent.p014mm.plugin.scanner.view.BaseScanMaskView;
import com.tencent.p014mm.plugin.scanner.view.C71029e;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.p014mm.plugin.scanner.view.ScanProductDetectRectView;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.qbar.C19931a;
import com.tencent.qbar.C19933b;
import com.tencent.qbar.C19934c;
import com.tencent.qbar.ScanDecodeFrameData;
import com.tencent.qbar.ScanIdentifyReportInfo;
import com.tencent.qbar.WxQBarResult;
import com.tencent.qbar.WxQbarNative;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import dl2.C20461a;
import dl2.C20466b;
import dl2.C20469e;
import f12.C7970a;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32224a;
import gy3.C87412m;
import ht3.C108258a;
import ht3.C108267t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ml2.C10931f;
import ml2.C21513a;
import ml2.C99930e;
import ml2.C99932g;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88989a;
import nl2.C109753o;
import nl2.C21671i;
import nl2.C21672j;
import nl2.C21680p;
import nl2.C21681q;
import nl2.C21683r;
import p140cw.C7138g;
import p200lx.C99712h0;
import p206nj.C11171e;
import p447aw.C103918d;
import p565ir.C60606n;
import p918s2.C90111a;
import qo3.C77407n;
import qs3.C22126b;
import qs3.C36079a;
import rx3.C13598b0;
import rx3.C13604l;
import ul2.C111200e0;
import ul2.C111203g0;
import ul2.C111206i0;
import ul2.C111213p0;
import ul2.C111215q0;
import ul2.C37482h0;
import ul2.C78231w;
import ul2.C90698f0;
import vk2.C111554i;
import vk2.C52949l;
import vk2.C52958x;
import vl2.C111557w;
import vl2.C14900n;
import vl2.C37751c0;
import vl2.C37756o;
import vo3.C90852c;
import wl2.C102461j;
import zt3.C119157j;
import zt3.C119179t;

@C86737h0
@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.scanner.ui.BaseScanUI */
public class BaseScanUI extends MMSecDataActivity implements C99930e.C99931a, C94528d, C71004i {

    /* renamed from: k1 */
    public static final /* synthetic */ int f53521k1 = 0;

    /* renamed from: A */
    public int f53522A;

    /* renamed from: B */
    public boolean f53523B = true;

    /* renamed from: C */
    public boolean f53524C = true;

    /* renamed from: D */
    public boolean f53525D = true;

    /* renamed from: E */
    public boolean f53526E = true;

    /* renamed from: F */
    public boolean f53527F = false;

    /* renamed from: G */
    public int[] f53528G;

    /* renamed from: H */
    public int f53529H;

    /* renamed from: I */
    public boolean f53530I;

    /* renamed from: J */
    public boolean f53531J;

    /* renamed from: K */
    public boolean f53532K;

    /* renamed from: L */
    public boolean f53533L;

    /* renamed from: M */
    public boolean f53534M;

    /* renamed from: N */
    public BaseScanRequest f53535N;

    /* renamed from: P */
    public boolean f53536P;

    /* renamed from: Q */
    public int f53537Q;

    /* renamed from: Q0 */
    public boolean f53538Q0 = false;

    /* renamed from: R */
    public boolean f53539R = false;

    /* renamed from: R0 */
    public boolean f53540R0 = false;

    /* renamed from: S */
    public boolean f53541S = true;

    /* renamed from: S0 */
    public boolean f53542S0 = true;

    /* renamed from: T */
    public boolean f53543T = true;

    /* renamed from: T0 */
    public boolean f53544T0 = true;

    /* renamed from: U */
    public C71007x0 f53545U = new C71007x0();

    /* renamed from: U0 */
    public int f53546U0 = 4;

    /* renamed from: V */
    public boolean f53547V = true;

    /* renamed from: V0 */
    public ArrayList<Integer> f53548V0 = new ArrayList<>();

    /* renamed from: W */
    public android_scanner_performanceStruct f53549W = new android_scanner_performanceStruct();

    /* renamed from: W0 */
    public final C21671i f53550W0 = new C21671i() {
        /* renamed from: a */
        public void mo24282a(C21680p pVar) {
            ScanProductMaskDecorView scanProductMaskDecorView = BaseScanUI.this.f53566g;
            if (scanProductMaskDecorView != null) {
                int b = scanProductMaskDecorView.mo151815b(pVar.f61356d);
                Log.m105924i("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageSuccess pos:" + b);
            }
        }

        /* renamed from: b */
        public void mo24283b(C21680p pVar, int i, String str) {
            C21680p pVar2 = pVar;
            ScanProductMaskDecorView scanProductMaskDecorView = BaseScanUI.this.f53566g;
            if (scanProductMaskDecorView != null) {
                ArrayList<C109753o> arrayList = pVar2.f61356d;
                int b = scanProductMaskDecorView.mo151815b(arrayList);
                Log.m105928w("MicroMsg.ScanUI", "AiScanProductHandleCallback onRetrievalImageFailed pos:" + b);
                if (b > 0 && b <= arrayList.size()) {
                    C109753o oVar = arrayList.get(b - 1);
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    C19016e1.m20084r(baseScanUI.f53522A, baseScanUI.f53537Q, 3, b, baseScanUI.f53566g.getTotalProductCount(), BaseScanUI.this.f53589z, pVar2.f61354b, pVar2.f61355c, oVar.f328508o, oVar.f328507n, oVar.f328505l, 1004);
                }
            }
        }

        /* renamed from: c */
        public boolean mo24284c(final C21683r rVar) {
            if (!BaseScanUI.m20122H7(BaseScanUI.this, rVar)) {
                Log.m105928w("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResult can not add now");
                return false;
            }
            Log.m105924i("MicroMsg.ScanUI", "AiScanProductHandleCallback onAddScanProductResult");
            if (BaseScanUI.this.f53566g == null) {
                return false;
            }
            ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                public void run() {
                    ScanProductMaskDecorView.C106130d dVar;
                    Iterator<C21681q> it;
                    boolean z;
                    boolean z2;
                    ScanProductMaskDecorView scanProductMaskDecorView = BaseScanUI.this.f53566g;
                    C21683r rVar = rVar;
                    C190851 r3 = new C32224a<C13598b0>() {
                        public Object invoke() {
                            BaseScanUI.this.f53562e.mo24420w(true);
                            return null;
                        }
                    };
                    scanProductMaskDecorView.getClass();
                    if (rVar != null) {
                        ArrayList<C21681q> arrayList = rVar.f61383d;
                        if (!(arrayList == null || arrayList.isEmpty())) {
                            ArrayList arrayList2 = new ArrayList();
                            int totalProductCount = scanProductMaskDecorView.getTotalProductCount();
                            Iterator<C21681q> it4 = arrayList.iterator();
                            boolean z3 = false;
                            while (it4.hasNext()) {
                                C21681q next = it4.next();
                                C21681q qVar = null;
                                if (next != null) {
                                    if (next.f61358a.getId() > scanProductMaskDecorView.f316092j && next.f61358a.getShouldShow()) {
                                        scanProductMaskDecorView.f316092j = next.f61358a.getId();
                                        qVar = next;
                                    }
                                    Rect rect = new Rect();
                                    float width = (float) scanProductMaskDecorView.getWidth();
                                    float height = (float) scanProductMaskDecorView.getHeight();
                                    rect.set((int) (next.f61358a.getX1() * width), (int) (next.f61358a.getY1() * height), (int) (width * next.f61358a.getX2()), (int) (height * next.f61358a.getY2()));
                                    if (qVar != null) {
                                        if (!z3) {
                                            ScanProductInfo scanProductInfo = new ScanProductInfo();
                                            ScanProductInfo scanProductInfo2 = qVar.f61358a;
                                            scanProductInfo.setShouldShow(scanProductInfo2.getShouldShow());
                                            scanProductInfo.setProb(scanProductInfo2.getProb());
                                            scanProductInfo.setId(scanProductInfo2.getId());
                                            scanProductInfo.setAge(scanProductInfo2.getAge());
                                            scanProductInfo.setClassId(scanProductInfo2.getClassId());
                                            scanProductInfo.setHit(scanProductInfo2.getHit());
                                            scanProductInfo.setX1(scanProductInfo2.getX1());
                                            scanProductInfo.setY1(scanProductInfo2.getY1());
                                            scanProductInfo.setX2(scanProductInfo2.getX2());
                                            scanProductInfo.setY2(scanProductInfo2.getY2());
                                            C21681q qVar2 = new C21681q(scanProductInfo);
                                            qVar2.f61360c = qVar.f61360c;
                                            qVar2.f61361d = qVar.f61361d;
                                            qVar2.f61359b = qVar.f61359b;
                                            if (scanProductMaskDecorView.f316091i == 0) {
                                                Log.m105924i("MicroMsg.ScanProductMaskDecorView", "addNewProduct:" + qVar2.f61358a.getId());
                                                ScanProductDetectRectView scanProductDetectRectView = new ScanProductDetectRectView(scanProductMaskDecorView.getContext());
                                                scanProductDetectRectView.setRect(rect);
                                                scanProductDetectRectView.setPivotX(rect.exactCenterX());
                                                scanProductDetectRectView.setPivotY(rect.exactCenterY());
                                                scanProductMaskDecorView.addView(scanProductDetectRectView);
                                                float width2 = scanProductMaskDecorView.f316089g / ((float) rect.width());
                                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                                ofFloat.setDuration(1000);
                                                ScanProductMaskDecorView.C106127b bVar = scanProductMaskDecorView.f316088f;
                                                if (bVar != null) {
                                                    int id = qVar2.f61358a.getId();
                                                    synchronized (bVar.f316100j) {
                                                        HashMap<Integer, C109753o> hashMap = bVar.f316100j;
                                                        Integer valueOf = Integer.valueOf(id);
                                                        C109753o oVar = new C109753o();
                                                        it = it4;
                                                        oVar.f328501h = qVar2.f61358a.getId();
                                                        oVar.f328498e = qVar2.f61360c;
                                                        oVar.f328499f = qVar2.f61361d;
                                                        oVar.f328500g = 1;
                                                        hashMap.put(valueOf, oVar);
                                                        C13598b0 b0Var = C13598b0.f38549a;
                                                    }
                                                } else {
                                                    it = it4;
                                                }
                                                ofFloat.addListener(new C111200e0(scanProductMaskDecorView, scanProductDetectRectView, qVar2, r3));
                                                ofFloat.addUpdateListener(new C90698f0(scanProductDetectRectView, width2));
                                                ofFloat.start();
                                                z2 = true;
                                            } else {
                                                it = it4;
                                                Log.m105928w("MicroMsg.ScanProductMaskDecorView", "addNewProduct fail, scanProductListState:" + scanProductMaskDecorView.f316091i);
                                                z2 = false;
                                            }
                                            if (!z2) {
                                                z = false;
                                                z3 = z;
                                            }
                                        } else {
                                            it = it4;
                                        }
                                        z = true;
                                        z3 = z;
                                    } else {
                                        it = it4;
                                    }
                                    Log.m105924i("MicroMsg.ScanProductMaskDecorView", "updateProductInfo  info:" + next + "   ");
                                    arrayList2.add(rect);
                                } else {
                                    it = it4;
                                }
                                it4 = it;
                            }
                            if (z3 && (dVar = scanProductMaskDecorView.f316090h) != null) {
                                dVar.mo24351b(rVar.f61382c, rVar.f61381b, totalProductCount + 1);
                            }
                        }
                    }
                }
            });
            return true;
        }

        /* renamed from: d */
        public void mo24285d(C21680p pVar, int i, String str) {
            C21680p pVar2 = pVar;
            ScanProductMaskDecorView scanProductMaskDecorView = BaseScanUI.this.f53566g;
            if (scanProductMaskDecorView != null) {
                ArrayList<C109753o> arrayList = pVar2.f61356d;
                int b = scanProductMaskDecorView.mo151815b(arrayList);
                Log.m105928w("MicroMsg.ScanUI", "AiScanProductHandleCallback onUploadImageFailed pos:" + b);
                if (b > 0 && b <= arrayList.size()) {
                    int i2 = i;
                    int i3 = i2 != 1001 ? 1002 : i2;
                    C109753o oVar = arrayList.get(b - 1);
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    C19016e1.m20084r(baseScanUI.f53522A, baseScanUI.f53537Q, 3, b, baseScanUI.f53566g.getTotalProductCount(), BaseScanUI.this.f53589z, pVar2.f61354b, pVar2.f61355c, oVar.f328508o, oVar.f328507n, oVar.f328505l, i3);
                }
            }
        }

        /* renamed from: e */
        public void mo24286e(C21680p pVar) {
            C109753o oVar;
            C21680p pVar2 = pVar;
            ScanProductMaskDecorView scanProductMaskDecorView = BaseScanUI.this.f53566g;
            if (scanProductMaskDecorView != null) {
                ArrayList<C109753o> arrayList = pVar2.f61356d;
                int b = scanProductMaskDecorView.mo151815b(arrayList);
                Log.m105924i("MicroMsg.ScanUI", "AiScanProductHandleCallback onRetrievalImageSuccess pos:" + b);
                if (b > 0 && b <= arrayList.size() && (oVar = arrayList.get(b - 1)) != null && oVar.f328500g == 4) {
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    C19016e1.m20084r(baseScanUI.f53522A, baseScanUI.f53537Q, 4, b, baseScanUI.f53566g.getTotalProductCount(), BaseScanUI.this.f53589z, pVar2.f61354b, pVar2.f61355c, oVar.f328508o, oVar.f328507n, oVar.f328505l, 0);
                }
            }
        }
    };

    /* renamed from: X */
    public int f53551X;

    /* renamed from: X0 */
    public final C19006b1 f53552X0 = new C19006b1(new C52949l() {
        /* renamed from: a */
        public void mo24321a(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.ScanUI", "alvinluo scanProductDialog onDismiss exitType: %d", Integer.valueOf(i));
            BaseScanUI baseScanUI = BaseScanUI.this;
            baseScanUI.f53543T = true;
            if (baseScanUI.f53558b1 == 0) {
                ScanUITopOpButtonComponent scanUITopOpButtonComponent = baseScanUI.f53574n;
                scanUITopOpButtonComponent.getClass();
                C111557w.m152066b(scanUITopOpButtonComponent, true, (Animator.AnimatorListener) null);
                BaseScanUI.this.mo24303c8();
            }
            BaseScanUI baseScanUI2 = BaseScanUI.this;
            baseScanUI2.f53526E = true;
            baseScanUI2.f53544T0 = true;
            baseScanUI2.mo24289O7(true);
            C19016e1.m20071b(12, System.currentTimeMillis());
            BaseScanUI baseScanUI3 = BaseScanUI.this;
            C19016e1.m20090x(baseScanUI3.f53578q, 12, i, baseScanUI3.f53535N);
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.ScanUI", "alvinluo scanProductDialog onCancel");
            BaseScanUI baseScanUI = BaseScanUI.this;
            baseScanUI.f53539R = false;
            baseScanUI.f53543T = true;
            baseScanUI.f53526E = true;
            baseScanUI.f53544T0 = true;
        }

        public void onShow(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.ScanUI", "alvinluo scanProductDialog onShow");
            ScanUITopOpButtonComponent scanUITopOpButtonComponent = BaseScanUI.this.f53574n;
            scanUITopOpButtonComponent.getClass();
            C111557w.m152066b(scanUITopOpButtonComponent, false, (Animator.AnimatorListener) null);
            BaseScanUI.this.mo24289O7(false);
            C19016e1.m20068B(12, System.currentTimeMillis());
        }
    });

    /* renamed from: Y */
    public boolean f53553Y = false;

    /* renamed from: Y0 */
    public C19032z0 f53554Y0 = null;

    /* renamed from: Z */
    public boolean f53555Z = false;

    /* renamed from: Z0 */
    public final C19032z0.C19033a f53556Z0 = new C19032z0.C19033a() {
        /* renamed from: a */
        public void mo24280a(C21680p pVar, int i, long j, int i2, String str) {
            Log.m105921e("MicroMsg.ScanUI", "onScanFailed session: %d, source: %d, errCode: %d, errMsg: %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str);
            if (Util.isNullOrNil(str)) {
                str = BaseScanUI.this.getResources().getString(C0966R.string.iew);
            }
            BaseScanUI baseScanUI = BaseScanUI.this;
            C76879j.m92754y(baseScanUI, str, "", baseScanUI.getResources().getString(C0966R.string.a18), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseScanUI.this.mo24303c8();
                    C19016e1.m20092z(BaseScanUI.this.f53522A);
                }
            });
            BaseScanUI baseScanUI2 = BaseScanUI.this;
            C19016e1.m20085s(baseScanUI2.f53522A, baseScanUI2.f53537Q, 14, baseScanUI2.f53589z, pVar.f61354b);
            int i3 = pVar.f61353a;
            if (i3 == 4) {
                C19016e1.m20086t(false, i3);
            }
        }

        /* renamed from: b */
        public void mo24281b(C21680p pVar) {
            if (!pVar.f61356d.isEmpty()) {
                BaseScanUI.m20123I7(BaseScanUI.this, pVar.f61356d.get(0), true, -1, -1);
            }
            BaseScanUI baseScanUI = BaseScanUI.this;
            C19016e1.m20085s(baseScanUI.f53522A, baseScanUI.f53537Q, 15, baseScanUI.f53589z, pVar.f61354b);
            C19011d.m20064a(42, pVar.f61357e);
            int i = pVar.f61353a;
            if (i == 4) {
                C19016e1.m20086t(true, i);
            }
        }
    };

    /* renamed from: a1 */
    public final ScanProductMaskDecorView.C106131e f53557a1 = new ScanProductMaskDecorView.C106131e() {
        /* renamed from: a */
        public void mo24349a(View view, C109753o oVar, int i, int i2) {
            C21681q qVar = oVar.f328497d;
            if (qVar != null) {
                C19011d.C19012a aVar = qVar.f61364g;
                if (aVar != null) {
                    aVar.f53413c = oVar.f328507n;
                    aVar.f53414d = oVar.f328508o;
                }
                C19011d.m20064a(3, aVar);
                C19011d.m20064a(38, aVar);
            }
            BaseScanUI.m20123I7(BaseScanUI.this, oVar, false, i, i2);
        }
    };

    /* renamed from: b1 */
    public int f53558b1 = 0;

    /* renamed from: c1 */
    public final ScanProductMaskDecorView.C106130d f53559c1 = new ScanProductMaskDecorView.C106130d() {
        /* renamed from: a */
        public void mo24350a(int i) {
            Log.m105924i("MicroMsg.ScanUI", "onProductListStateChange:" + i);
            BaseScanUI baseScanUI = BaseScanUI.this;
            baseScanUI.f53558b1 = i;
            if (i == 0) {
                baseScanUI.f53562e.mo24423z();
            } else if (i == 6) {
                C119179t tVar = C119157j.f356862d;
                C190721 r0 = new Runnable() {
                    public void run() {
                        BaseScanUI.this.mo24303c8();
                        BaseScanUI.this.mo24307g8(true);
                        ScanUITopOpButtonComponent scanUITopOpButtonComponent = BaseScanUI.this.f53574n;
                        scanUITopOpButtonComponent.getClass();
                        C111557w.m152066b(scanUITopOpButtonComponent, true, (Animator.AnimatorListener) null);
                    }
                };
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(r0, 250, false);
            } else if (i == 2) {
                baseScanUI.f53562e.mo24367A();
            } else if (i == 3) {
                Log.m105924i("MicroMsg.ScanUI", "alvinluo pauseScan");
                ScanUIRectView scanUIRectView = baseScanUI.f53562e;
                if (scanUIRectView != null) {
                    scanUIRectView.mo24372e();
                    scanUIRectView.mo24381j();
                }
                BaseScanUI.this.f53562e.getScanMaskView().setScanSource(3);
                BaseScanUI.this.f53562e.getScanMaskView().mo151679i(BaseScanUI.this.f53562e.getTextrueView());
                BaseScanUI.this.mo24307g8(false);
                ScanUITopOpButtonComponent scanUITopOpButtonComponent = BaseScanUI.this.f53574n;
                scanUITopOpButtonComponent.getClass();
                C111557w.m152066b(scanUITopOpButtonComponent, false, (Animator.AnimatorListener) null);
            }
        }

        /* renamed from: b */
        public void mo24351b(int i, long j, int i2) {
            BaseScanUI.m20124J7(BaseScanUI.this);
            BaseScanUI baseScanUI = BaseScanUI.this;
            C19016e1.m20082p(baseScanUI.f53522A, baseScanUI.f53537Q, 1, 1, i2, baseScanUI.f53589z, j, i);
            C19011d.m20064a(35, (C19011d.C19012a) null);
            if (i2 == 1) {
                C115669n.INSTANCE.mo175911u(1259, 84);
                BaseScanUI baseScanUI2 = BaseScanUI.this;
                C19016e1.m20082p(baseScanUI2.f53522A, baseScanUI2.f53537Q, 2, 1, i2, baseScanUI2.f53589z, j, i);
            }
        }
    };

    /* renamed from: d */
    public FrameLayout f53560d;

    /* renamed from: d1 */
    public ScanUIRectView.ScanCallBack f53561d1 = new ScanUIRectView.ScanCallBack() {
        /* renamed from: a */
        public void mo24353a(long j, Bundle bundle) {
            Bundle bundle2 = bundle;
            BaseScanUI baseScanUI = BaseScanUI.this;
            if (!baseScanUI.f53541S) {
                Log.m105929w("MicroMsg.ScanUI", "alvinluo onScanSuccess can not process code result currentMode: %d", Integer.valueOf(baseScanUI.f53522A));
            } else if (baseScanUI.f53579r != null && bundle2 != null) {
                Log.m105925i("MicroMsg.ScanUI", "scan code cost time: %d", Long.valueOf(System.currentTimeMillis() - BaseScanUI.this.f53589z));
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("result_qbar_result_list");
                if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
                    Log.m105928w("MicroMsg.ScanUI", "alvinluo onScanSuccess qbarResult invalid");
                    return;
                }
                int i = bundle2.getInt("result_code_point_count", 0);
                long j2 = bundle2.getLong("decode_success_cost_time", 0);
                BaseScanUI baseScanUI2 = BaseScanUI.this;
                C19016e1.m20081o(baseScanUI2.f53522A, true, baseScanUI2.f53577p0 ? 3 : 1, i);
                C19011d.m20064a(1, (C19011d.C19012a) null);
                BaseScanUI.this.mo24301a8();
                BaseScanUI.this.mo24299Y7(true, i > 1);
                BaseScanUI.this.mo24305e8(false);
                int i2 = BaseScanUI.this.f53522A;
                C19016e1.C19017a aVar = new C19016e1.C19017a(parcelableArrayList, j2);
                C19016e1.f53432i = aVar;
                try {
                    String f = C19016e1.m20074f(i2);
                    aVar.f53436c = f != null ? Long.parseLong(f) : System.currentTimeMillis();
                    C19016e1.C19017a aVar2 = C19016e1.f53432i;
                    if (aVar2 != null) {
                        String e = C19016e1.m20073e(i2);
                        aVar2.f53437d = e != null ? Long.parseLong(e) : System.currentTimeMillis();
                    }
                    C19016e1.C19017a aVar3 = C19016e1.f53432i;
                    if (aVar3 != null) {
                        aVar3.f53438e = System.currentTimeMillis();
                    }
                } catch (Exception unused) {
                }
                boolean z = BaseScanUI.this.f53564f.f53787g;
                WxQBarResult wxQBarResult = (WxQBarResult) parcelableArrayList.get(0);
                if (wxQBarResult == null) {
                    Log.m105924i("MicroMsg.ScanUI", "firstQBarResult is null");
                    return;
                }
                if (BaseScanUI.m20125K7(BaseScanUI.this, wxQBarResult, parcelableArrayList.size() <= 1)) {
                    Log.m105928w("MicroMsg.ScanUI", "scan code has deal with");
                    return;
                }
                bundle2.putInt("qbar_string_scan_source", 0);
                if (i <= 0 || BaseScanUI.this.f53562e == null) {
                    BaseScanUI.this.mo24305e8(true);
                    if (!BaseScanUI.m20125K7(BaseScanUI.this, wxQBarResult, true)) {
                        BaseScanUI.m20126L7(BaseScanUI.this, j, bundle2, wxQBarResult);
                        return;
                    }
                    return;
                }
                ScanDecodeFrameData scanDecodeFrameData = (ScanDecodeFrameData) bundle2.getParcelable("decode_success_frame_data");
                if (scanDecodeFrameData != null) {
                    BaseScanUI.this.f53562e.setDecodeSuccessFrameData(scanDecodeFrameData);
                }
                BaseScanUI baseScanUI3 = BaseScanUI.this;
                baseScanUI3.f53538Q0 = i > 1;
                if (i > 1) {
                    baseScanUI3.f53574n.mo151659a(false);
                    BaseScanUI.this.f53574n.mo151660b(true, (Animator.AnimatorListener) null);
                    BaseScanUI.this.mo24307g8(false);
                }
                BaseScanUI baseScanUI4 = BaseScanUI.this;
                baseScanUI4.f53539R = true;
                final ArrayList arrayList = parcelableArrayList;
                final int i3 = i;
                C190741 r102 = r0;
                final long j3 = j;
                ScanUIRectView scanUIRectView = baseScanUI4.f53562e;
                final Bundle bundle3 = bundle;
                C190741 r0 = new C106071g1() {
                    /* renamed from: a */
                    public void mo24354a(int i, View view) {
                        Log.m105925i("MicroMsg.ScanUI", "alvinluo onScanSuccess onClick mark index: %d", Integer.valueOf(i));
                        if (i < arrayList.size() && i3 > 1) {
                            BaseScanUI.this.f53539R = false;
                            WxQBarResult wxQBarResult = (WxQBarResult) arrayList.get(i);
                            if (!BaseScanUI.m20125K7(BaseScanUI.this, wxQBarResult, true)) {
                                BaseScanUI.m20126L7(BaseScanUI.this, j3, bundle3, wxQBarResult);
                            }
                            C19016e1.m20078l(2, i, BaseScanUI.this.f53577p0);
                            Log.m105926v("MicroMsg.ScanReporter", "alvinluo reportMultiCodeClick");
                            C115669n.INSTANCE.mo175911u(1259, !C19016e1.f53431h ? 63 : 83);
                        }
                    }
                };
                scanUIRectView.setSuccessMarkClickListener(r102);
                BaseScanUI.this.mo24287M7(2);
                BaseScanUI.this.mo24308i8(false, false);
                BaseScanUI.m20124J7(BaseScanUI.this);
                ScanUIRectView scanUIRectView2 = BaseScanUI.this.f53562e;
                scanUIRectView2.getClass();
                if (C37756o.f100005b) {
                    if (scanUIRectView2.f53722s == null) {
                        Context context = scanUIRectView2.getContext();
                        C87412m.m108594g(context, "context");
                        ScanDebugView scanDebugView = new ScanDebugView(context, (AttributeSet) null);
                        scanUIRectView2.f53722s = scanDebugView;
                        scanUIRectView2.addView(scanDebugView);
                    }
                    ScanDebugView scanDebugView2 = scanUIRectView2.f53722s;
                    if (scanDebugView2 != null) {
                        String string = bundle2.getString("decode_debug_string");
                        if (!(string == null || string.length() == 0)) {
                            scanDebugView2.setVisibility(0);
                            TextView textView = scanDebugView2.f20603d;
                            if (textView != null) {
                                textView.setText(string);
                            } else {
                                C87412m.m108603p("debugInfo");
                                throw null;
                            }
                        } else {
                            scanDebugView2.setVisibility(8);
                            TextView textView2 = scanDebugView2.f20603d;
                            if (textView2 != null) {
                                textView2.setText("");
                            } else {
                                C87412m.m108603p("debugInfo");
                                throw null;
                            }
                        }
                    }
                }
                final int i4 = i;
                final ArrayList arrayList2 = parcelableArrayList;
                final WxQBarResult wxQBarResult2 = wxQBarResult;
                final long j4 = j;
                final Bundle bundle4 = bundle;
                BaseScanUI.this.f53562e.mo24390p(parcelableArrayList, new C71029e() {
                    /* renamed from: a */
                    public void mo24256a(boolean z) {
                        if (z || i4 == 1 || arrayList2.size() == 1) {
                            BaseScanUI baseScanUI = BaseScanUI.this;
                            baseScanUI.f53539R = false;
                            if (!BaseScanUI.m20125K7(baseScanUI, wxQBarResult2, true)) {
                                BaseScanUI.m20126L7(BaseScanUI.this, j4, bundle4, wxQBarResult2);
                            }
                            C19016e1.m20078l(1, 0, BaseScanUI.this.f53577p0);
                            return;
                        }
                        BaseScanUI.this.f53581t.mo162949b(false);
                    }

                    /* renamed from: b */
                    public void mo24257b() {
                    }
                }, z, true);
            }
        }
    };

    /* renamed from: e */
    public ScanUIRectView f53562e;

    /* renamed from: e1 */
    public final C20461a.C20465d f53563e1 = new C20461a.C20465d() {
        /* renamed from: a */
        public void mo24353a(long j, Bundle bundle) {
            BaseScanUI baseScanUI = BaseScanUI.this;
            if (baseScanUI.f53582u) {
                Log.m105928w("MicroMsg.ScanUI", "alvinluo onScanSuccess isScrolling and ignore");
            } else if (baseScanUI.f53579r != null && bundle != null) {
                baseScanUI.f53551X++;
                int i = bundle.getInt("scan_source", 0);
                Log.m105925i("MicroMsg.ScanUI", "alvinluo onScanSuccess cost time %d, scanImageCount: %d, source: %d, session: %d", Long.valueOf(System.currentTimeMillis() - BaseScanUI.this.f53589z), Integer.valueOf(BaseScanUI.this.f53551X), Integer.valueOf(i), Long.valueOf(j));
                if (i == 1) {
                    BaseScanUI baseScanUI2 = BaseScanUI.this;
                    if (!baseScanUI2.f53539R) {
                        BaseScanRequest baseScanRequest = baseScanUI2.f53535N;
                        if (baseScanRequest instanceof ScanGoodsRequest) {
                            bundle.putParcelable("key_scan_request", baseScanRequest);
                            bundle.putInt("key_scan_goods_mode", ((ScanGoodsRequest) BaseScanUI.this.f53535N).f248902j);
                        }
                        BaseScanUI.this.f53579r.mo360a(j, bundle);
                        return;
                    }
                }
                if (i == 2) {
                    BaseScanRequest baseScanRequest2 = BaseScanUI.this.f53535N;
                    if (baseScanRequest2 instanceof ScanGoodsRequest) {
                        bundle.putParcelable("key_scan_request", baseScanRequest2);
                    }
                    BaseScanUI.this.f53579r.mo360a(j, bundle);
                }
            }
        }

        /* renamed from: b */
        public void mo24355b(long j, int i, int i2, String str) {
            Log.m105921e("MicroMsg.ScanUI", "alvinluo onScanFailed session: %d, source: %d, errCode: %d, errMsg: %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str);
            if (Util.isNullOrNil(str)) {
                str = BaseScanUI.this.getResources().getString(C0966R.string.iew);
            }
            BaseScanUI baseScanUI = BaseScanUI.this;
            C76879j.m92754y(baseScanUI, str, "", baseScanUI.getResources().getString(C0966R.string.a18), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseScanUI.this.mo24303c8();
                    C19016e1.m20092z(BaseScanUI.this.f53522A);
                }
            });
            C19016e1.m20072c(i, false, System.currentTimeMillis(), false);
        }
    };

    /* renamed from: f */
    public ScannerFlashSwitcher f53564f;

    /* renamed from: f1 */
    public final C21513a.C21515b f53565f1 = new C21513a.C21515b() {
        /* renamed from: a */
        public void mo24315a(int i, long j, int i2, String str) {
            if (i == 2) {
                Log.m105921e("MicroMsg.ScanUI", "alvinluo onScanResultFailed scan from gallery failed errCode: %d, errMsg: %s", Integer.valueOf(i2), str);
                C19016e1.m20072c(i, false, System.currentTimeMillis(), false);
                C19016e1.m20086t(false, i);
                BaseScanUI baseScanUI = BaseScanUI.this;
                baseScanUI.getClass();
                Log.m105924i("MicroMsg.ScanUI", "alvinluo pauseScan");
                ScanUIRectView scanUIRectView = baseScanUI.f53562e;
                if (scanUIRectView != null) {
                    scanUIRectView.mo24372e();
                    scanUIRectView.mo24381j();
                }
                BaseScanUI.this.mo24301a8();
                BaseScanMaskView baseScanMaskView = BaseScanUI.this.f53562e.f53721r;
                if (baseScanMaskView != null) {
                    baseScanMaskView.mo151685s(false, (DialogInterface.OnCancelListener) null);
                }
                if (Util.isNullOrNil(str)) {
                    str = BaseScanUI.this.getResources().getString(C0966R.string.iew);
                }
                BaseScanUI baseScanUI2 = BaseScanUI.this;
                C76879j.m92754y(baseScanUI2, str, "", baseScanUI2.getResources().getString(C0966R.string.a18), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BaseScanUI.this.mo24303c8();
                        C19016e1.m20092z(BaseScanUI.this.f53522A);
                    }
                });
            } else if (i == 1 && i2 == 1003) {
                Log.m105920e("MicroMsg.ScanUI", "alvinluo onScanResultFailed stop upload and show alert");
                C10931f fVar = BaseScanUI.this.f53579r;
                if (fVar != null) {
                    fVar.mo11131c(j, false);
                }
                BaseScanUI baseScanUI3 = BaseScanUI.this;
                baseScanUI3.getClass();
                Log.m105924i("MicroMsg.ScanUI", "alvinluo pauseScan");
                ScanUIRectView scanUIRectView2 = baseScanUI3.f53562e;
                if (scanUIRectView2 != null) {
                    scanUIRectView2.mo24372e();
                    scanUIRectView2.mo24381j();
                }
                BaseScanUI.this.mo24301a8();
                if (Util.isNullOrNil(str)) {
                    str = BaseScanUI.this.getResources().getString(C0966R.string.iex);
                }
                BaseScanUI baseScanUI4 = BaseScanUI.this;
                C76879j.m92754y(baseScanUI4, str, "", baseScanUI4.getResources().getString(C0966R.string.a18), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        BaseScanUI.this.mo24303c8();
                        C19016e1.m20092z(BaseScanUI.this.f53522A);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo24316b(int i, long j, int i2) {
            Log.m105925i("MicroMsg.ScanUI", "notifyEvent source: %d, session: %d, event: %d", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
        }

        /* renamed from: c */
        public void mo24317c(C19030n0 n0Var) {
            BaseScanUI baseScanUI = BaseScanUI.this;
            if (baseScanUI.f53522A != 12) {
                Log.m105924i("MicroMsg.ScanUI", "alvnluo onScanResultSuccess not SELECT_SCAN_MODE_GOODS and ignore");
            } else if (baseScanUI.f53582u || (n0Var.f53512i == 1 && baseScanUI.f53539R)) {
                Log.m105921e("MicroMsg.ScanUI", "alvinluo onScanResultSuccess source:%d, isScrolling: %b or needPauseScan: %b and ignore", Integer.valueOf(n0Var.f53512i), Boolean.valueOf(BaseScanUI.this.f53582u), Boolean.valueOf(BaseScanUI.this.f53539R));
            } else {
                baseScanUI.getClass();
                Log.m105919d("MicroMsg.ScanUI", "alvinluo showScanGoodsResult sessionId: %s, scanId: %s, showResult: %b, reqKey: %s, isScrolling: %b", Long.valueOf(n0Var.f53509f), Integer.valueOf(n0Var.f53510g), Boolean.valueOf(n0Var.f53504a), n0Var.f53508e, Boolean.valueOf(baseScanUI.f53582u));
                if (n0Var.f53504a) {
                    boolean z = baseScanUI.f53564f.f53787g;
                    baseScanUI.mo24295U7(n0Var.f53509f, n0Var.f53512i);
                    baseScanUI.mo24298X7(true);
                    C19016e1.m20086t(true, n0Var.f53512i);
                    C19016e1.m20072c(n0Var.f53512i, true, System.currentTimeMillis(), false);
                    baseScanUI.f53562e.mo24390p(n0Var, new C71029e(n0Var) {

                        /* renamed from: a */
                        public final /* synthetic */ C19030n0 f53593a;

                        {
                            this.f53593a = r2;
                        }

                        /* renamed from: a */
                        public void mo24256a(boolean z) {
                            BaseScanUI.this.f53562e.post(new Runnable() {
                                /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
                                    r2 = ((com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r2).f248904o;
                                    r3 = r0.f53511h;
                                 */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public void run() {
                                    /*
                                        r9 = this;
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$11 r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1903811.this
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                                        boolean r0 = r0.isFinishing()
                                        if (r0 != 0) goto L_0x0119
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$11 r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1903811.this
                                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r1 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                                        com.tencent.mm.plugin.scanner.model.n0 r0 = r0.f53593a
                                        if (r0 != 0) goto L_0x0019
                                        int r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.f53521k1
                                        r1.getClass()
                                        goto L_0x0119
                                    L_0x0019:
                                        com.tencent.mm.plugin.scanner.api.BaseScanRequest r2 = r1.f53535N
                                        boolean r3 = r2 instanceof com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest
                                        r4 = 1
                                        r5 = 0
                                        if (r3 == 0) goto L_0x002d
                                        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest r2 = (com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r2
                                        int r2 = r2.f248904o
                                        int r3 = r0.f53511h
                                        if (r2 != r3) goto L_0x002d
                                        if (r3 != r4) goto L_0x002d
                                        r2 = 1
                                        goto L_0x002e
                                    L_0x002d:
                                        r2 = 0
                                    L_0x002e:
                                        r3 = 3
                                        java.lang.Object[] r3 = new java.lang.Object[r3]
                                        int r6 = r0.f53507d
                                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                        r3[r5] = r6
                                        int r6 = r0.f53511h
                                        java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                                        r3[r4] = r6
                                        java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                                        r7 = 2
                                        r3[r7] = r6
                                        java.lang.String r6 = "MicroMsg.ScanUI"
                                        java.lang.String r8 = "alvinluo showBoxDialog jumpType: %d, returnType: %d, directFinishWithResult: %b"
                                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r3)
                                        r3 = 12
                                        if (r2 == 0) goto L_0x0071
                                        int r2 = r1.f53578q
                                        int r4 = r0.f53512i
                                        com.tencent.mm.plugin.scanner.api.BaseScanRequest r5 = r1.f53535N
                                        com.tencent.p014mm.plugin.scanner.model.C19016e1.m20087u(r2, r3, r4, r5, r7)
                                        android.content.Intent r2 = new android.content.Intent
                                        r2.<init>()
                                        java.lang.String r0 = r0.f53508e
                                        java.lang.String r3 = "key_scan_goods_result_req_key"
                                        r2.putExtra(r3, r0)
                                        r0 = -1
                                        r1.setResult(r0, r2)
                                        r1.mo6125q()
                                        goto L_0x0119
                                    L_0x0071:
                                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView r2 = r1.f53562e
                                        if (r2 == 0) goto L_0x0119
                                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView r2 = r2.getScanMaskView()
                                        boolean r6 = r2 instanceof com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView
                                        if (r6 != 0) goto L_0x0081
                                        boolean r6 = r2 instanceof com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView
                                        if (r6 == 0) goto L_0x0119
                                    L_0x0081:
                                        vk2.x r6 = r1.f53576p
                                        if (r6 == 0) goto L_0x0088
                                        r6.mo73692h(r5)
                                    L_0x0088:
                                        qo3.n r5 = r1.f53575o
                                        if (r5 == 0) goto L_0x0097
                                        boolean r5 = r5.mo107563h()
                                        if (r5 == 0) goto L_0x0097
                                        qo3.n r5 = r1.f53575o
                                        r5.mo107572p()
                                    L_0x0097:
                                        int r5 = r1.f53578q
                                        int r6 = r0.f53512i
                                        com.tencent.mm.plugin.scanner.api.BaseScanRequest r8 = r1.f53535N
                                        com.tencent.p014mm.plugin.scanner.model.C19016e1.m20087u(r5, r3, r6, r8, r4)
                                        android.os.Bundle r5 = new android.os.Bundle
                                        r5.<init>()
                                        java.lang.String r6 = "template_type"
                                        r5.putInt(r6, r4)
                                        java.lang.String r6 = r0.f53508e
                                        java.lang.String r8 = "req_key"
                                        r5.putString(r8, r6)
                                        java.lang.String r6 = com.tencent.p014mm.plugin.scanner.model.C19016e1.f53425b
                                        java.lang.String r8 = "enter_session"
                                        r5.putString(r8, r6)
                                        java.lang.String r6 = com.tencent.p014mm.plugin.scanner.model.C19016e1.m20074f(r3)
                                        java.lang.String r8 = "tab_session"
                                        r5.putString(r8, r6)
                                        java.lang.String r3 = com.tencent.p014mm.plugin.scanner.model.C19016e1.m20073e(r3)
                                        java.lang.String r6 = "scan_session"
                                        r5.putString(r6, r3)
                                        int r0 = r0.f53512i
                                        if (r0 == r4) goto L_0x00d4
                                        if (r0 != r7) goto L_0x00dc
                                    L_0x00d4:
                                        java.lang.String r0 = "scanTabMerge"
                                        java.lang.String r3 = "0"
                                        r5.putString(r0, r3)
                                    L_0x00dc:
                                        com.tencent.mm.plugin.scanner.api.BaseScanRequest r0 = r1.f53535N
                                        boolean r3 = r0 instanceof com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest
                                        if (r3 == 0) goto L_0x00ed
                                        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest r0 = (com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest) r0
                                        int r0 = r0.f248909t
                                        if (r0 <= 0) goto L_0x00ed
                                        java.lang.String r3 = "fixed_dialog_height"
                                        r5.putInt(r3, r0)
                                    L_0x00ed:
                                        vk2.l r0 = r1.f53567g1
                                        vk2.x r0 = vk2.C52943a0.m59244b(r1, r5, r0)
                                        r1.f53576p = r0
                                        r3 = r2
                                        vk2.i r3 = (vk2.C111554i) r3
                                        java.lang.String r4 = "viewModel"
                                        gy3.C87412m.m108594g(r3, r4)
                                        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r0.f147817s
                                        if (r0 == 0) goto L_0x0105
                                        r0.setBackgroundViewModel(r3)
                                    L_0x0105:
                                        vk2.x r0 = r1.f53576p
                                        vk2.k r2 = (vk2.C111555k) r2
                                        r0.getClass()
                                        java.lang.String r1 = "listener"
                                        gy3.C87412m.m108594g(r2, r1)
                                        com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r0.f147817s
                                        if (r0 == 0) goto L_0x0119
                                        r0.setBackgroundListener(r2)
                                    L_0x0119:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1903811.C190391.run():void");
                                }
                            });
                        }

                        /* renamed from: b */
                        public void mo24257b() {
                        }
                    }, z, true);
                }
            }
        }
    };

    /* renamed from: g */
    public ScanProductMaskDecorView f53566g;

    /* renamed from: g1 */
    public final C52949l f53567g1 = new C52949l() {
        /* renamed from: a */
        public void mo24321a(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.ScanUI", "alvinluo ScanBoxDialog onDismiss exitType: %d", Integer.valueOf(i));
            BaseScanUI baseScanUI = BaseScanUI.this;
            baseScanUI.f53543T = true;
            baseScanUI.f53526E = true;
            ScanUITopOpButtonComponent scanUITopOpButtonComponent = baseScanUI.f53574n;
            scanUITopOpButtonComponent.getClass();
            C111557w.m152066b(scanUITopOpButtonComponent, true, (Animator.AnimatorListener) null);
            BaseScanUI.this.mo24303c8();
            BaseScanUI.this.mo24289O7(true);
            C19016e1.m20071b(12, System.currentTimeMillis());
            BaseScanUI baseScanUI2 = BaseScanUI.this;
            C19016e1.m20090x(baseScanUI2.f53578q, 12, i, baseScanUI2.f53535N);
            C19016e1.m20092z(12);
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.ScanUI", "alvinluo ScanBoxDialog onCancel");
            BaseScanUI baseScanUI = BaseScanUI.this;
            baseScanUI.f53539R = false;
            baseScanUI.f53543T = true;
            baseScanUI.f53526E = true;
        }

        public void onShow(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.ScanUI", "alvinluo ScanBoxDialog onShow");
            ScanUITopOpButtonComponent scanUITopOpButtonComponent = BaseScanUI.this.f53574n;
            scanUITopOpButtonComponent.getClass();
            C111557w.m152066b(scanUITopOpButtonComponent, false, (Animator.AnimatorListener) null);
            BaseScanUI.this.mo24289O7(false);
            C19016e1.m20068B(12, System.currentTimeMillis());
        }
    };

    /* renamed from: h */
    public View f53568h;

    /* renamed from: h1 */
    public C29060q f53569h1 = new C29060q.C29061a() {
        public void onNetworkChange(final int i) {
            MMHandlerThread.postToMainThread(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
                /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r8 = this;
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$28 r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1905128.this
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                        int r1 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.f53521k1
                        boolean r1 = r0.mo24294T7()
                        r2 = 0
                        r3 = 1
                        if (r1 == 0) goto L_0x0013
                        boolean r1 = r0.f53538Q0
                        if (r1 == 0) goto L_0x0013
                        goto L_0x0028
                    L_0x0013:
                        int r1 = r0.f53522A
                        r4 = 12
                        if (r1 != r4) goto L_0x001b
                        r1 = 1
                        goto L_0x001c
                    L_0x001b:
                        r1 = 0
                    L_0x001c:
                        if (r1 == 0) goto L_0x002a
                        vk2.x r0 = r0.f53576p
                        if (r0 == 0) goto L_0x002a
                        boolean r0 = r0.isShowing()
                        if (r0 == 0) goto L_0x002a
                    L_0x0028:
                        r0 = 0
                        goto L_0x002b
                    L_0x002a:
                        r0 = 1
                    L_0x002b:
                        r1 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r1]
                        ob0.b0 r4 = f40.C86709a0.m107524d()
                        int r4 = r4.mo123467m()
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                        r1[r2] = r4
                        java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                        r1[r3] = r4
                        java.lang.String r4 = "MicroMsg.ScanUI"
                        java.lang.String r5 = "onNetWorkChange %d, canResume: %b"
                        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$28 r1 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1905128.this
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r1 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                        com.tencent.mm.plugin.scanner.ui.ScanUIRectView r1 = r1.f53562e
                        r4 = 4
                        r5 = 6
                        if (r1 == 0) goto L_0x0097
                        int r6 = r2
                        ob0.b0 r7 = f40.C86709a0.m107524d()
                        int r7 = r7.mo123467m()
                        if (r7 == r5) goto L_0x0077
                        ob0.b0 r7 = f40.C86709a0.m107524d()
                        int r7 = r7.mo123467m()
                        if (r7 != r4) goto L_0x006b
                        goto L_0x0077
                    L_0x006b:
                        r1.f53676E = r2
                        boolean r0 = r1.mo24383l()
                        if (r0 != 0) goto L_0x0084
                        r1.mo24372e()
                        goto L_0x0084
                    L_0x0077:
                        r1.f53676E = r3
                        boolean r7 = r1.mo24383l()
                        if (r7 != 0) goto L_0x0084
                        if (r0 == 0) goto L_0x0084
                        r1.mo24373f()
                    L_0x0084:
                        com.tencent.mm.plugin.scanner.view.BaseScanMaskView r0 = r1.f53721r
                        if (r0 == 0) goto L_0x008b
                        r0.mo151840k(r6)
                    L_0x008b:
                        com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r0 = r1.f53720q
                        if (r0 == 0) goto L_0x0097
                        r0.mo24473d()
                        int r1 = r0.f53812o
                        r0.mo24483i(r1)
                    L_0x0097:
                        ob0.b0 r0 = f40.C86709a0.m107524d()
                        int r0 = r0.mo123467m()
                        if (r0 == r5) goto L_0x00bb
                        ob0.b0 r0 = f40.C86709a0.m107524d()
                        int r0 = r0.mo123467m()
                        if (r0 != r4) goto L_0x00ac
                        goto L_0x00bb
                    L_0x00ac:
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$28 r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1905128.this
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                        boolean r1 = r0.f53525D
                        if (r1 != 0) goto L_0x00b5
                        return
                    L_0x00b5:
                        r0.f53525D = r2
                        r0.mo24313n8()
                        goto L_0x00c9
                    L_0x00bb:
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI$28 r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1905128.this
                        com.tencent.mm.plugin.scanner.ui.BaseScanUI r0 = com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.this
                        boolean r1 = r0.f53525D
                        if (r1 == 0) goto L_0x00c4
                        return
                    L_0x00c4:
                        r0.f53525D = r3
                        r0.mo24313n8()
                    L_0x00c9:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.C1905128.C190521.run():void");
                }
            });
        }
    };

    /* renamed from: i */
    public ScanSharedMaskView f53570i;

    /* renamed from: i1 */
    public IListener f53571i1;

    /* renamed from: j */
    public ScanInfoMaskView f53572j;

    /* renamed from: j1 */
    public IListener<VoipEvent> f53573j1;

    /* renamed from: n */
    public ScanUITopOpButtonComponent f53574n;

    /* renamed from: o */
    public C77407n f53575o;

    /* renamed from: p */
    public C52958x f53576p = null;

    /* renamed from: p0 */
    public boolean f53577p0 = false;

    /* renamed from: q */
    public int f53578q = 0;

    /* renamed from: r */
    public C10931f f53579r;

    /* renamed from: s */
    public Vibrator f53580s;

    /* renamed from: t */
    public C111203g0 f53581t;

    /* renamed from: u */
    public boolean f53582u = false;

    /* renamed from: v */
    public boolean f53583v = true;

    /* renamed from: w */
    public boolean f53584w = true;

    /* renamed from: x */
    public boolean f53585x = false;

    /* renamed from: x0 */
    public boolean f53586x0 = false;

    /* renamed from: y */
    public boolean f53587y = true;

    /* renamed from: y0 */
    public boolean f53588y0 = false;

    /* renamed from: z */
    public long f53589z;

    public BaseScanUI() {
        C40008f fVar = C40008f.f107254d;
        this.f53571i1 = new IListener<ScanDarkDetectEvent>(fVar) {
            {
                this.__eventId = -890853388;
            }

            public boolean callback(IEvent iEvent) {
                ScanDarkDetectEvent scanDarkDetectEvent = (ScanDarkDetectEvent) iEvent;
                BaseScanUI baseScanUI = BaseScanUI.this;
                int i = BaseScanUI.f53521k1;
                if ((!(baseScanUI.f53522A == 3)) && baseScanUI.f53526E) {
                    if (scanDarkDetectEvent.f48120d.f48121a) {
                        baseScanUI.mo24308i8(true, true);
                    } else {
                        baseScanUI.mo24308i8(false, true);
                    }
                }
                return false;
            }
        };
        this.f53573j1 = new IListener<VoipEvent>(fVar) {
            {
                this.__eventId = -797557590;
            }

            public boolean callback(IEvent iEvent) {
                VoipEvent voipEvent = (VoipEvent) iEvent;
                if (voipEvent instanceof VoipEvent) {
                    if (!C86709a0.m107522a()) {
                        return false;
                    }
                    if (voipEvent.f194019d.f194022b == 3) {
                        ScanUIRectView scanUIRectView = BaseScanUI.this.f53562e;
                        if (scanUIRectView != null) {
                            scanUIRectView.mo24385n();
                        }
                        BaseScanUI.this.finish();
                    }
                }
                return true;
            }
        };
    }

    /* renamed from: H7 */
    public static boolean m20122H7(BaseScanUI baseScanUI, C21683r rVar) {
        if (!baseScanUI.f53544T0 || baseScanUI.f53582u || (rVar != null && rVar.f61380a == 3 && baseScanUI.f53539R)) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(rVar != null ? rVar.f61380a : -1);
            objArr[1] = Boolean.valueOf(baseScanUI.f53582u);
            objArr[2] = Boolean.valueOf(baseScanUI.f53539R);
            objArr[3] = Boolean.valueOf(baseScanUI.f53544T0);
            Log.m105921e("MicroMsg.ScanUI", "checkCanAddScanNewProduct source:%d, isScrolling: %b or needPauseScan: %b or canAddScanProduct: %s, and ignore", objArr);
        } else if (baseScanUI.mo24294T7()) {
            return true;
        } else {
            Log.m105928w("MicroMsg.ScanUI", "onScanResult not scan code mode and ignore");
        }
        return false;
    }

    /* renamed from: I7 */
    public static void m20123I7(BaseScanUI baseScanUI, C109753o oVar, boolean z, int i, int i2) {
        BaseScanUI baseScanUI2 = baseScanUI;
        C109753o oVar2 = oVar;
        final boolean z2 = z;
        if (oVar2 == null) {
            baseScanUI.getClass();
            return;
        }
        if (i > 0) {
            C19016e1.m20084r(baseScanUI2.f53522A, baseScanUI2.f53537Q, 5, i2, i, baseScanUI2.f53589z, oVar2.f328495b, oVar2.f328496c, oVar2.f328508o, oVar2.f328507n, oVar2.f328505l, 0);
        }
        boolean z3 = false;
        baseScanUI2.f53544T0 = false;
        C19006b1 b1Var = baseScanUI2.f53552X0;
        C190674 r5 = new C19006b1.C19007a() {
            /* renamed from: a */
            public void mo24253a(C52958x xVar) {
                if (!BaseScanUI.this.isFinishing()) {
                    C52958x xVar2 = BaseScanUI.this.f53576p;
                    if (xVar2 != null) {
                        xVar2.mo73692h(0);
                    }
                    C77407n nVar = BaseScanUI.this.f53575o;
                    if (nVar != null && nVar.mo107563h()) {
                        BaseScanUI.this.f53575o.mo107572p();
                    }
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    baseScanUI.f53576p = xVar;
                    BaseScanMaskView scanMaskView = baseScanUI.f53562e.getScanMaskView();
                    if (scanMaskView instanceof ScanCodeProductMergeMaskView) {
                        C52958x xVar3 = BaseScanUI.this.f53576p;
                        ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = (ScanCodeProductMergeMaskView) scanMaskView;
                        xVar3.getClass();
                        C87412m.m108594g(scanCodeProductMergeMaskView, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                        BaseBoxDialogView baseBoxDialogView = xVar3.f147817s;
                        if (baseBoxDialogView != null) {
                            baseBoxDialogView.setBackgroundListener(scanCodeProductMergeMaskView);
                        }
                    }
                    if ((scanMaskView instanceof C111554i) && z2) {
                        C52958x xVar4 = BaseScanUI.this.f53576p;
                        C111554i iVar = (C111554i) scanMaskView;
                        xVar4.getClass();
                        C87412m.m108594g(iVar, "viewModel");
                        BaseBoxDialogView baseBoxDialogView2 = xVar4.f147817s;
                        if (baseBoxDialogView2 != null) {
                            baseBoxDialogView2.setBackgroundViewModel(iVar);
                        }
                    }
                }
            }

            /* renamed from: b */
            public void mo24346b(C109753o oVar) {
                BaseScanUI baseScanUI = BaseScanUI.this;
                long j = oVar.f328495b;
                int i = oVar.f328494a;
                int i2 = BaseScanUI.f53521k1;
                baseScanUI.mo24295U7(j, i);
            }
        };
        b1Var.getClass();
        r5.mo24346b(oVar2);
        ScanUIRectView scanUIRectView = baseScanUI2.f53562e;
        ScannerFlashSwitcher scannerFlashSwitcher = baseScanUI2.f53564f;
        boolean z4 = scannerFlashSwitcher != null && scannerFlashSwitcher.f53787g;
        ScanCodeProductMergeMaskView.C106118a aVar = new ScanCodeProductMergeMaskView.C106118a(oVar2, z2);
        if (!(scanUIRectView instanceof ScanUIRectView)) {
            scanUIRectView = null;
        }
        if (scanUIRectView != null) {
            C19013d1 d1Var = new C19013d1(baseScanUI2, oVar2, b1Var, r5);
            if (baseScanUI2.f53558b1 != 1) {
                z3 = true;
            }
            scanUIRectView.mo24390p(aVar, d1Var, z4, z3);
        }
    }

    /* renamed from: J7 */
    public static void m20124J7(BaseScanUI baseScanUI) {
        baseScanUI.getClass();
        ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
            public void run() {
                PlaySound.play(BaseScanUI.this, C0966R.string.hq6);
            }
        });
        baseScanUI.f53580s.vibrate(10);
    }

    /* renamed from: K7 */
    public static boolean m20125K7(BaseScanUI baseScanUI, WxQBarResult wxQBarResult, boolean z) {
        if (!baseScanUI.f53531J) {
            return false;
        }
        if (wxQBarResult == null) {
            Log.m105920e("MicroMsg.ScanUI", "dealWithReturnCode qBarResult is null");
        } else if (!baseScanUI.f53588y0 || z) {
            Log.m105924i("MicroMsg.ScanUI", "dealWithReturnCode deal with qBarResult");
            String str = wxQBarResult.f56828e;
            PublishScanCodeResultEvent publishScanCodeResultEvent = new PublishScanCodeResultEvent();
            String str2 = wxQBarResult.f56829f;
            PublishScanCodeResultEvent.C67760a aVar = publishScanCodeResultEvent.f193844d;
            aVar.f193848c = str2;
            aVar.f193847b = str;
            aVar.f193846a = 0;
            publishScanCodeResultEvent.publish();
            Intent intent = new Intent();
            intent.putExtra("key_scan_result", str2);
            intent.putExtra("key_scan_result_raw", wxQBarResult.f56830g);
            intent.putExtra("key_scan_result_code_name", str);
            intent.putExtra("key_scan_result_code_version", wxQBarResult.f56823j);
            baseScanUI.setResult(-1, intent);
            baseScanUI.mo6125q();
        } else {
            Log.m105928w("MicroMsg.ScanUI", "dealWithReturnCode do not direct deal with multicode");
            return false;
        }
        return true;
    }

    /* renamed from: L7 */
    public static void m20126L7(BaseScanUI baseScanUI, long j, Bundle bundle, WxQBarResult wxQBarResult) {
        if (baseScanUI.f53579r != null && wxQBarResult != null && bundle != null) {
            bundle.putInt("result_code_format", wxQBarResult.f56827d);
            bundle.putString("result_content", wxQBarResult.f56829f);
            bundle.putString("result_code_name", wxQBarResult.f56828e);
            bundle.putByteArray("result_raw_data", wxQBarResult.f56830g);
            bundle.putInt("result_code_version", wxQBarResult.f56823j);
            bundle.putBoolean("key_disable_bar_code_jump_scan_goods", baseScanUI.f53577p0);
            bundle.putIntegerArrayList("key_scan_tab_bar_type_list", baseScanUI.f53548V0);
            baseScanUI.f53579r.mo360a(j, new C99932g.C34591a(1, bundle));
        }
    }

    /* renamed from: M7 */
    public final void mo24287M7(int i) {
        Log.m105919d("MicroMsg.ScanUI", "alvinluo checkAndOperateFlash operation: %d", Integer.valueOf(i));
        if (i == 1 && !this.f53564f.f53787g) {
            mo24296V7(i);
        } else if (i == 2 && this.f53564f.f53787g) {
            mo24296V7(i);
        }
    }

    /* renamed from: N7 */
    public final void mo24288N7() {
        if (!this.f53553Y) {
            if ((this.f53522A == 12) || (mo24294T7() && this.f53577p0)) {
                this.f53553Y = true;
                C19021i0 i0Var = C19021i0.f53455a;
                Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "checkAndUpdateScanEngineConfig");
                C19021i0 i0Var2 = C19021i0.f53455a;
                i0Var2.mo24268b();
                if (i0Var2.mo24269i(2)) {
                    i0Var2.mo24271n(2);
                }
                if (i0Var2.mo24269i(3)) {
                    i0Var2.mo24271n(3);
                }
                if (i0Var2.mo24269i(4)) {
                    i0Var2.mo24271n(4);
                }
                i0Var2.mo24271n(6);
            }
        }
    }

    /* renamed from: O7 */
    public final void mo24289O7(boolean z) {
        if (z) {
            getController().mo177103x0(getResources().getColor(C0966R.color.aaa));
        } else if (C85875k4.m106211z()) {
            getController().mo177103x0(getResources().getColor(C0966R.color.aaa));
        } else {
            getController().mo177103x0(getContext().getResources().getColor(C0966R.color.f2928b));
        }
    }

    /* renamed from: P7 */
    public final void mo24290P7() {
        C117292a.m165355a("com/tencent/mm/plugin/scanner/ui/BaseScanUI", "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "goBack", "()V", this);
        setResult(0);
        finish();
        overridePendingTransition(0, 0);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "goBack", "()V");
    }

    /* renamed from: Q7 */
    public final void mo24291Q7() {
        ScanSharedMaskView sharedMaskView = this.f53562e.getSharedMaskView();
        if (sharedMaskView != null) {
            this.f53564f = sharedMaskView.getFlashSwitcherView();
        }
        ScannerFlashSwitcher scannerFlashSwitcher = this.f53564f;
        if (scannerFlashSwitcher != null) {
            scannerFlashSwitcher.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    C19933b bVar = C19933b.f56833H;
                    if (bVar.f56856o != 2) {
                        bVar.f56856o = 2;
                    }
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    if (!baseScanUI.f53564f.f53787g) {
                        baseScanUI.mo24296V7(1);
                    } else {
                        baseScanUI.mo24296V7(2);
                    }
                    BaseScanUI baseScanUI2 = BaseScanUI.this;
                    C19016e1.m20088v(baseScanUI2.f53522A, 2, baseScanUI2.f53577p0);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f53562e.setFlashStatus(this.f53564f.f53788h);
            if (this.f53522A == 3) {
                mo24287M7(2);
                this.f53564f.mo24460b();
            }
        }
    }

    /* renamed from: R7 */
    public final void mo24292R7() {
        ScanSharedMaskView sharedMaskView = this.f53562e.getSharedMaskView();
        if (sharedMaskView != null) {
            if (!this.f53533L) {
                View galleryButton = sharedMaskView.getGalleryButton();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = galleryButton;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                galleryButton.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sharedMaskView.setOnGalleryClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view);
                        Object[] array = arrayList.toArray();
                        arrayList.clear();
                        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                        BaseScanUI baseScanUI = BaseScanUI.this;
                        Class cls = C7138g.class;
                        if (baseScanUI.f53543T) {
                            boolean z = true;
                            Log.m105925i("MicroMsg.ScanUI", "alvinluo selectImageFromGallery currentMode: %d", Integer.valueOf(baseScanUI.f53522A));
                            if (baseScanUI.mo24294T7()) {
                                baseScanUI.f53539R = true;
                                Intent intent = new Intent();
                                intent.putExtra("preview_ui_title", C0966R.string.ieh);
                                ((C7138g) C86312j.m106911c(cls)).mo8329zT(baseScanUI, 4660, intent);
                                C19016e1.m20067A(baseScanUI.f53522A);
                                C19016e1.m20080n(baseScanUI.f53522A);
                            } else {
                                int i = baseScanUI.f53522A;
                                if (i == 12) {
                                    baseScanUI.f53539R = true;
                                    ((C7138g) C86312j.m106911c(cls)).mo8329zT(baseScanUI, 2000, new Intent());
                                    C19016e1.m20067A(baseScanUI.f53522A);
                                    C19016e1.m20080n(baseScanUI.f53522A);
                                } else {
                                    if (i != 3) {
                                        z = false;
                                    }
                                    if (z) {
                                        ((C7138g) C86312j.m106911c(cls)).mo8324nq(baseScanUI, 561, 1, 0, 1, false, (Intent) null);
                                    }
                                }
                            }
                        }
                        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                return;
            }
            View galleryButton2 = sharedMaskView.getGalleryButton();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(galleryButton2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            galleryButton2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(galleryButton2, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "initGalleryButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: S7 */
    public final void mo24293S7() {
        C71007x0 x0Var = this.f53545U;
        if (x0Var != null) {
            x0Var.getClass();
            x0Var.f205484a = this;
            ScanUIRectView scanUIRectView = this.f53562e;
            if (scanUIRectView != null) {
                C71007x0 x0Var2 = this.f53545U;
                BaseScanMaskView<BaseScanRequest> scanMaskView = scanUIRectView.getScanMaskView();
                ScanSharedMaskView sharedMaskView = this.f53562e.getSharedMaskView();
                ScanInfoMaskView scanInfoMaskView = this.f53572j;
                x0Var2.f205485b = scanMaskView;
                x0Var2.f205486c = sharedMaskView;
                x0Var2.f205487d = scanInfoMaskView;
            }
        }
    }

    /* renamed from: T7 */
    public final boolean mo24294T7() {
        return C37751c0.m41521a(this.f53522A);
    }

    /* renamed from: U7 */
    public final void mo24295U7(long j, int i) {
        mo24287M7(2);
        mo24308i8(false, false);
        this.f53526E = false;
        this.f53543T = false;
        this.f53539R = true;
        this.f53544T0 = true;
        mo24305e8(false);
        C10931f fVar = this.f53579r;
        if (fVar != null) {
            fVar.mo11131c(j, true);
        }
        BaseScanMaskView baseScanMaskView = this.f53562e.f53721r;
        if (baseScanMaskView != null) {
            baseScanMaskView.mo151685s(false, (DialogInterface.OnCancelListener) null);
        }
        this.f53562e.setScanSource(i);
        mo24301a8();
    }

    /* renamed from: V7 */
    public final void mo24296V7(int i) {
        Log.m105925i("MicroMsg.ScanUI", "alvinluo operateFlash operation: %d", Integer.valueOf(i));
        ScanFlashSwitchEvent scanFlashSwitchEvent = new ScanFlashSwitchEvent();
        scanFlashSwitchEvent.f48122d.f48123a = i;
        scanFlashSwitchEvent.publish();
        ScannerFlashSwitcher scannerFlashSwitcher = this.f53564f;
        if (scannerFlashSwitcher == null) {
            return;
        }
        if (i == 1) {
            Log.m105924i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
            scannerFlashSwitcher.f53787g = true;
            scannerFlashSwitcher.f53784d.setImageResource(C0966R.raw.scanner_flash_open_on);
            scannerFlashSwitcher.f53785e.setText(C0966R.string.f361231ic2);
            return;
        }
        scannerFlashSwitcher.mo24459a();
    }

    /* renamed from: W7 */
    public final boolean mo24297W7() {
        boolean z;
        C71007x0 x0Var;
        int i;
        Log.m105925i("MicroMsg.ScanUI", "alvinluo processCancel isShowingMultiCodeResult: %b, infoViewType: %d", Boolean.valueOf(this.f53538Q0), Integer.valueOf(this.f53545U.f205490g));
        ScanUITopOpButtonComponent scanUITopOpButtonComponent = this.f53574n;
        C1904824 r1 = new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                BaseScanUI.this.mo24303c8();
            }
        };
        TextView textView = scanUITopOpButtonComponent.f315885f;
        if (textView != null) {
            if (textView.getVisibility() == 0) {
                scanUITopOpButtonComponent.mo151659a(true);
                scanUITopOpButtonComponent.mo151660b(false, r1);
                z = true;
            } else {
                z = false;
            }
            mo24307g8(true);
            if (mo24294T7() && this.f53538Q0) {
                this.f53538Q0 = false;
                C19016e1.m20078l(3, -1, this.f53577p0);
                Log.m105926v("MicroMsg.ScanReporter", "alvinluo reportMultiCodeCancel");
                C115669n.INSTANCE.mo175911u(1259, !C19016e1.f53431h ? 62 : 82);
            }
            if (mo24294T7() && (x0Var = this.f53545U) != null && ((i = x0Var.f205490g) == 3 || i == 4)) {
                C19016e1.m20079m(5, this.f53577p0, this.f53522A, this.f53546U0);
            }
            return z;
        }
        C87412m.m108603p("cancelButton");
        throw null;
    }

    /* renamed from: X7 */
    public final void mo24298X7(boolean z) {
        C19016e1 e1Var = C19016e1.f53424a;
        C19021i0.m20105l(new C19019f1(12, z));
    }

    /* renamed from: Y7 */
    public final void mo24299Y7(boolean z, boolean z2) {
        Log.m105927v("MicroMsg.ScanUI", "alvinluo reportScanPerformance success: %b, isMultiCode: %b", Boolean.valueOf(z), Boolean.FALSE);
        android_scanner_performanceStruct android_scanner_performancestruct = this.f53549W;
        android_scanner_performancestruct.f48690d = z ? 1 : 0;
        android_scanner_performancestruct.f48691e = System.currentTimeMillis() - this.f53589z;
        android_scanner_performanceStruct android_scanner_performancestruct2 = this.f53549W;
        C108267t tVar = this.f53562e.f56970e;
        android_scanner_performancestruct2.f48692f = tVar != null ? ((C108258a) tVar).mo158646h(false) : false ? 0 : 1;
        android_scanner_performanceStruct android_scanner_performancestruct3 = this.f53549W;
        android_scanner_performancestruct3.f48694h = (long) this.f53522A;
        android_scanner_performancestruct3.f48693g = (long) C19933b.f56833H.f56844c;
        android_scanner_performancestruct3.mo86054n();
        if (mo24294T7()) {
            int i = C37756o.m41531e() == 1 ? 1722 : 1229;
            Log.m105924i("MicroMsg.ScanUI", "reportScanPerformance idKey:" + i);
            C115669n nVar = C115669n.INSTANCE;
            long j = (long) i;
            long j2 = j;
            nVar.mo175913w(j, 0, 1);
            nVar.mo175913w(j2, 1, z ? 1 : 0);
            if (z) {
                C108267t tVar2 = this.f53562e.f56970e;
                if (tVar2 != null ? ((C108258a) tVar2).mo158646h(false) : false) {
                    nVar.mo175913w(j2, 5, 1);
                } else {
                    nVar.mo175913w(j2, 3, 1);
                }
                C115669n nVar2 = nVar;
                long j3 = j2;
                nVar2.mo175913w(j3, 7, this.f53549W.f48691e);
                nVar2.mo175913w(j3, 9, this.f53549W.f48693g);
                if (z && z2) {
                    Log.m105927v("MicroMsg.ScanUI", "alvinluo reportScanPerformance scanTime: %s, totalFrames: %d", Long.valueOf(this.f53549W.f48691e), Long.valueOf(this.f53549W.f48693g));
                    C115669n nVar3 = nVar;
                    long j4 = j2;
                    nVar3.mo175913w(j4, 11, 1);
                    nVar3.mo175913w(j4, 12, this.f53549W.f48691e);
                    nVar3.mo175913w(j4, 14, this.f53549W.f48693g);
                }
            }
        }
    }

    /* renamed from: Z7 */
    public final void mo24300Z7(int i) {
        int i2 = i;
        Log.m105925i("MicroMsg.ScanUI", "reportScanUIEvent eventType = %d, enterScene = %d", Integer.valueOf(i), Integer.valueOf(this.f53537Q));
        int h = C19016e1.m20075h(this.f53535N);
        int i3 = this.f53522A;
        BaseScanRequest baseScanRequest = this.f53535N;
        int i4 = this.f53537Q;
        boolean z = this.f53577p0;
        C19016e1 e1Var = C19016e1.f53424a;
        int i5 = e1Var.mo24261i(i3, z);
        long currentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (i2 == 1) {
            C19016e1.f53433j = currentTimeMillis;
        } else if (i2 == 2) {
            long j2 = C19016e1.f53433j;
            if (j2 > 0) {
                C19016e1.f53433j = 0;
                j = currentTimeMillis - j2;
            }
        }
        C13604l<String, String> d = e1Var.mo24259d(baseScanRequest);
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(20275, d.f38555d, d.f38556e, C19016e1.f53425b, Integer.valueOf(h), Integer.valueOf(i5), Integer.valueOf(i), Long.valueOf(currentTimeMillis), Long.valueOf(j), Integer.valueOf(i4));
        if (i2 == 1 && (baseScanRequest instanceof ScanGoodsRequest) && ((ScanGoodsRequest) baseScanRequest).f248902j == 5) {
            nVar.mo175911u(1259, 108);
        }
    }

    /* renamed from: a8 */
    public final void mo24301a8() {
        C19016e1.m20067A(this.f53522A);
    }

    /* renamed from: b8 */
    public final void mo24302b8(int i, int i2) {
        boolean z = true;
        Log.m105927v("MicroMsg.ScanUI", "alvinluo reportSwitchTab %b", Boolean.valueOf(this.f53523B));
        boolean z2 = this.f53577p0;
        if (!(C19016e1.f53425b.length() == 0)) {
            int i3 = C19016e1.f53424a.mo24261i(i, z2);
            int i4 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? -1 : 4 : 1 : 2 : 3 : 0;
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo reportScanTabSelected logId: %d, tabType: %d, tabAction: %d, session: %s", 18557, Integer.valueOf(i3), Integer.valueOf(i4), C19016e1.f53425b);
            C115669n.INSTANCE.mo160131h(18557, 0, Integer.valueOf(i3), Integer.valueOf(i4), C19016e1.f53425b);
        }
        C19016e1.f53427d.put(Integer.valueOf(i), String.valueOf(System.currentTimeMillis()));
        Log.m105919d("MicroMsg.ScanReporter", "alvinluo createTabSession tabId: %d, session: %s", Integer.valueOf(i), C19016e1.f53427d.get(Integer.valueOf(i)));
        C19016e1.m20070a(i);
        C19016e1.m20092z(i);
        if (!mo24294T7() || !this.f53577p0) {
            z = false;
        }
        if (z) {
            C19011d.m20064a(0, (C19011d.C19012a) null);
        }
    }

    /* renamed from: c8 */
    public void mo24303c8() {
        Log.m105924i("MicroMsg.ScanUI", "alvinluo resumeScan");
        this.f53589z = System.currentTimeMillis();
        this.f53539R = false;
        ScanUIRectView scanUIRectView = this.f53562e;
        if (scanUIRectView != null) {
            scanUIRectView.mo24373f();
        }
        mo24305e8(true);
    }

    /* renamed from: d8 */
    public final void mo24304d8() {
        int i = this.f53522A;
        if (!(i == 1 || i == 8)) {
            if (i == 12) {
                this.f53562e.setScanCallback(this.f53563e1);
                C21513a aVar = new C21513a(this.f53522A, this.f53562e, this, this.f53565f1);
                this.f53579r = aVar;
                aVar.f60916i = null;
                C19003b bVar = aVar.f60918n;
                if (bVar != null) {
                    bVar.f53392f = null;
                    return;
                }
                return;
            } else if (i == 3) {
                this.f53579r = new C106072h1(this);
                return;
            } else if (i != 4) {
                this.f53562e.setScanCallback((ScanUIRectView.ScanCallBack) null);
                return;
            }
        }
        this.f53562e.setScanCallback(this.f53561d1);
        this.f53579r = new C99932g(this.f53522A, this.f53529H, true, this.f53562e, this, this, this.f53550W0);
    }

    /* renamed from: e8 */
    public final void mo24305e8(boolean z) {
        Log.m105925i("MicroMsg.ScanUI", "alvinluo setEnableSwitchTab enable: %b, %b", Boolean.valueOf(z), Boolean.valueOf(this.f53583v));
        C111203g0 g0Var = this.f53581t;
        if (g0Var != null) {
            if (!z) {
                g0Var.mo162950c(false);
            } else if (this.f53583v) {
                g0Var.mo162950c(true);
            }
        }
        ScanUIRectView scanUIRectView = this.f53562e;
        if (scanUIRectView == null) {
            return;
        }
        if (!z) {
            scanUIRectView.setEnableScrollSwitchTab(false);
        } else if (this.f53583v) {
            scanUIRectView.setEnableScrollSwitchTab(true);
        }
    }

    /* renamed from: f8 */
    public final void mo24306f8() {
        int i = 3;
        if (!C37751c0.m41521a(this.f53522A)) {
            int i2 = this.f53522A;
            if (i2 == 12) {
                C19933b bVar = C19933b.f56833H;
                i = 2;
            } else if (i2 == 3) {
                C19933b bVar2 = C19933b.f56833H;
            } else {
                i = 0;
            }
        } else if (this.f53577p0) {
            C19933b bVar3 = C19933b.f56833H;
            i = 4;
        } else {
            C19933b bVar4 = C19933b.f56833H;
            i = 1;
        }
        C19933b bVar5 = C19933b.f56833H;
        bVar5.getClass();
        Log.m105925i("MicroMsg.QBarEngineReporter", "alvinluo setReportTabType tabType: %d", Integer.valueOf(i));
        bVar5.f56857p = i;
    }

    public void finish() {
        super.finish();
        Log.m105924i("MicroMsg.ScanUI", "finish()");
    }

    /* renamed from: g8 */
    public final void mo24307g8(boolean z) {
        C111203g0 g0Var = this.f53581t;
        if (g0Var != null) {
            g0Var.getClass();
            Log.m105925i("MicroMsg.ScanScrollTabController", "alvinluo setEnable %b", Boolean.valueOf(z));
            g0Var.mo162950c(z);
            ScanScrollTabView scanScrollTabView = g0Var.f333019b;
            if (scanScrollTabView != null) {
                scanScrollTabView.setEnabled(z);
            }
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.buj;
    }

    /* renamed from: i8 */
    public final void mo24308i8(boolean z, boolean z2) {
        Log.m105927v("MicroMsg.ScanUI", "alvinluo showFlash show: %b, withAnimation: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (z) {
            ScannerFlashSwitcher scannerFlashSwitcher = this.f53564f;
            if (scannerFlashSwitcher != null && !scannerFlashSwitcher.isShown()) {
                ScanUIRectView scanUIRectView = this.f53562e;
                ScanSharedMaskView scanSharedMaskView = scanUIRectView.f53720q;
                if (scanSharedMaskView != null && !scanUIRectView.f53723t.f53788h) {
                    scanSharedMaskView.mo24474e(true);
                }
                BaseScanMaskView baseScanMaskView = scanUIRectView.f53721r;
                if (baseScanMaskView != null && !scanUIRectView.f53723t.f53788h) {
                    baseScanMaskView.f316129n = true;
                }
                if (z2) {
                    this.f53564f.mo24462d();
                } else {
                    this.f53564f.setVisibility(0);
                }
                C19933b bVar = C19933b.f56833H;
                if (bVar.f56856o != 2) {
                    bVar.f56856o = 1;
                }
                C19016e1.m20088v(this.f53522A, 1, this.f53577p0);
                return;
            }
            return;
        }
        ScannerFlashSwitcher scannerFlashSwitcher2 = this.f53564f;
        if (scannerFlashSwitcher2 != null && !scannerFlashSwitcher2.f53787g) {
            ScanUIRectView scanUIRectView2 = this.f53562e;
            ScanSharedMaskView scanSharedMaskView2 = scanUIRectView2.f53720q;
            if (scanSharedMaskView2 != null && scanUIRectView2.f53723t.f53788h) {
                scanSharedMaskView2.mo24474e(false);
            }
            BaseScanMaskView baseScanMaskView2 = scanUIRectView2.f53721r;
            if (baseScanMaskView2 != null && scanUIRectView2.f53723t.f53788h) {
                baseScanMaskView2.f316129n = false;
            }
            if (z2) {
                this.f53564f.mo24460b();
            } else {
                this.f53564f.setVisibility(8);
            }
        }
    }

    public void initView() {
        C111203g0.C37481a aVar;
        this.f53560d = (FrameLayout) findViewById(C0966R.C0970id.j1a);
        this.f53581t = new C111203g0(this, this.f53577p0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        if (C11171e.m11046c(19)) {
            getWindow().addFlags(67109888);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f53568h = findViewById(C0966R.C0970id.j1i);
        ScanInfoMaskView scanInfoMaskView = (ScanInfoMaskView) findViewById(C0966R.C0970id.j1d);
        this.f53572j = scanInfoMaskView;
        scanInfoMaskView.getInfoLayout().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (BaseScanUI.this.f53572j.getInfoLayout().getVisibility() == 0) {
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    baseScanUI.f53546U0 = 2;
                    baseScanUI.onBackPressed();
                    BaseScanUI.this.f53546U0 = 4;
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        setBackBtn(new MenuItem.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem menuItem) {
                BaseScanUI baseScanUI = BaseScanUI.this;
                int i = BaseScanUI.f53521k1;
                baseScanUI.mo24290P7();
                return true;
            }
        });
        this.f53574n = (ScanUITopOpButtonComponent) findViewById(C0966R.C0970id.kr7);
        ScanUIRectView scanUIRectView = new ScanUIRectView(this);
        this.f53562e = scanUIRectView;
        scanUIRectView.f53678G = this;
        scanUIRectView.setScanRequest(this.f53535N);
        this.f53562e.setEnableScanGoodsDynamicWording(this.f53540R0);
        this.f53562e.setEnableOpenCamera(this.f53542S0);
        this.f53562e.setEnableScanCodeProductMerge(this.f53577p0);
        this.f53562e.setDisableScanProductInMergeMode(this.f53586x0);
        this.f53562e.f53691S = this.f53537Q;
        ScanScrollTabView scanScrollTabView = (ScanScrollTabView) findViewById(C0966R.C0970id.j1y);
        C111203g0 g0Var = this.f53581t;
        g0Var.getClass();
        C87412m.m108594g(scanScrollTabView, "scrollTabView");
        g0Var.f333019b = scanScrollTabView;
        scanScrollTabView.mo151706i();
        ScanScrollTabView scanScrollTabView2 = g0Var.f333019b;
        if (scanScrollTabView2 != null) {
            scanScrollTabView2.setOnTabScrollListener(new C37482h0());
        }
        g0Var.f333020c.clear();
        int i = 0;
        for (C111203g0.C37481a a : g0Var.f333022e) {
            if (g0Var.mo162948a(i, a)) {
                i++;
            }
        }
        C111203g0 g0Var2 = this.f53581t;
        C1904925 r1 = new C111215q0() {
            /* renamed from: a */
            public void mo24331a(int i, int i2) {
                Log.m105925i("MicroMsg.ScanUI", "alvinluo onTabSelected tabId: %d, tabSelectedAction: %d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i == 12 && !WeChatBrands.Business.Entries.DiscoveryScanRecognize.checkAvailable(BaseScanUI.this.getContext())) {
                    BaseScanUI.this.mo6125q();
                } else if (i != 3 || WeChatBrands.Business.Entries.DiscoveryScanTranslate.checkAvailable(BaseScanUI.this.getContext())) {
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    if (!baseScanUI.f53523B) {
                        baseScanUI.mo24302b8(i, i2);
                    } else {
                        baseScanUI.f53523B = false;
                    }
                    BaseScanUI baseScanUI2 = BaseScanUI.this;
                    if (baseScanUI2.f53522A != i) {
                        if (i == 12 && i2 == 4) {
                            C19016e1.m20079m(7, baseScanUI2.f53577p0, i, 0);
                            BaseScanUI baseScanUI3 = BaseScanUI.this;
                            baseScanUI3.f53578q = 3;
                            baseScanUI3.f53547V = true;
                            baseScanUI3.mo24305e8(false);
                            ScanUIRectView scanUIRectView = baseScanUI3.f53562e;
                            if (scanUIRectView != null) {
                                scanUIRectView.setIgnorePreviewFrame(true);
                            }
                            ScanSharedMaskView scanSharedMaskView = BaseScanUI.this.f53570i;
                            if (scanSharedMaskView != null) {
                                scanSharedMaskView.setShowToast(true);
                                BaseScanUI baseScanUI4 = BaseScanUI.this;
                                baseScanUI4.f53570i.setScanToast(baseScanUI4.getResources().getString(C0966R.string.ibe));
                            }
                        } else {
                            baseScanUI2.f53578q = C19016e1.m20075h(baseScanUI2.f53535N);
                            BaseScanUI baseScanUI5 = BaseScanUI.this;
                            baseScanUI5.f53547V = false;
                            ScanSharedMaskView scanSharedMaskView2 = baseScanUI5.f53570i;
                            if (scanSharedMaskView2 != null) {
                                scanSharedMaskView2.setShowToast(false);
                            }
                        }
                        Log.m105925i("MicroMsg.ScanUI", "alvinluo onTabSelected scanGoodsScene: %d, needAnimateHideBlurBackground: %b", Integer.valueOf(BaseScanUI.this.f53578q), Boolean.valueOf(BaseScanUI.this.f53547V));
                        BaseScanUI baseScanUI6 = BaseScanUI.this;
                        baseScanUI6.getClass();
                        Log.m105925i("MicroMsg.ScanUI", "select scan mode %d", Integer.valueOf(i));
                        baseScanUI6.f53589z = System.currentTimeMillis();
                        baseScanUI6.f53551X = 0;
                        baseScanUI6.f53538Q0 = false;
                        baseScanUI6.f53522A = i;
                        C10931f fVar = baseScanUI6.f53579r;
                        if (fVar != null) {
                            fVar.destroy();
                        }
                        baseScanUI6.mo24304d8();
                        baseScanUI6.f53562e.setScanMode(baseScanUI6.f53522A);
                        baseScanUI6.f53562e.mo24372e();
                        baseScanUI6.mo24311l8(false);
                        baseScanUI6.mo24313n8();
                        baseScanUI6.mo24292R7();
                        baseScanUI6.f53562e.mo24422y();
                        baseScanUI6.f53566g = baseScanUI6.f53562e.getScanProductMaskDecorView();
                        baseScanUI6.mo24293S7();
                        baseScanUI6.mo24291Q7();
                        baseScanUI6.mo24314o8();
                        if (!baseScanUI6.isPaused()) {
                            baseScanUI6.f53562e.mo24373f();
                        }
                        baseScanUI6.f53562e.mo24418t(true);
                        baseScanUI6.f53585x = false;
                        baseScanUI6.mo24288N7();
                    }
                    if (C37751c0.m41521a(i)) {
                        BaseScanUI.this.f53541S = true;
                    }
                    BaseScanUI.this.mo24306f8();
                } else {
                    BaseScanUI.this.mo6125q();
                }
            }

            /* renamed from: b */
            public void mo24332b(int i) {
                Log.m105925i("MicroMsg.ScanUI", "alvinluo onTabUnSelected tabId: %d", Integer.valueOf(i));
                if (C37751c0.m41521a(i)) {
                    BaseScanUI.this.f53541S = false;
                }
                BaseScanUI baseScanUI = BaseScanUI.this;
                int i2 = BaseScanUI.f53521k1;
                baseScanUI.getClass();
                C19016e1.m20067A(i);
                if (i == 12) {
                    BaseScanUI.this.mo24298X7(false);
                }
            }
        };
        g0Var2.getClass();
        C111206i0 i0Var = new C111206i0(g0Var2, r1);
        ScanScrollTabView scanScrollTabView3 = g0Var2.f333019b;
        if (scanScrollTabView3 != null) {
            scanScrollTabView3.setOnTabChangedListener(i0Var);
        }
        C111203g0 g0Var3 = this.f53581t;
        C1908626 r15 = new C111213p0() {
            /* renamed from: a */
            public void mo24361a(int i) {
                if (i == 1) {
                    BaseScanUI.this.f53582u = false;
                } else if (i == 3 || i == 2) {
                    BaseScanUI.this.f53582u = true;
                }
                Log.m105927v("MicroMsg.ScanUI", "alvinluo onScrollStateChanged state: %d, isScrolling: %b", Integer.valueOf(i), Boolean.valueOf(BaseScanUI.this.f53582u));
            }

            /* renamed from: b */
            public void mo24362b(int i, float f, float f2) {
                Log.m105927v("MicroMsg.ScanUI", "alvinluo onScroll offsetX: %f", Float.valueOf(f));
            }
        };
        g0Var3.getClass();
        ScanScrollTabView scanScrollTabView4 = g0Var3.f333019b;
        if (scanScrollTabView4 != null) {
            scanScrollTabView4.setOnTabScrollListener(r15);
        }
        ScanUIRectView scanUIRectView2 = this.f53562e;
        if (scanUIRectView2 != null) {
            scanUIRectView2.setScrollTabController(this.f53581t);
        }
        this.f53548V0.clear();
        if (this.f53530I || this.f53522A == 8) {
            this.f53534M = true;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            if (!this.f53577p0) {
                arrayList.add(12);
                this.f53548V0.add(1);
                this.f53548V0.add(2);
            } else {
                this.f53548V0.add(4);
            }
            if (!C76850a.m92641m()) {
                arrayList.add(3);
                this.f53548V0.add(3);
            } else if (C37751c0.m41522b()) {
                arrayList.add(3);
                this.f53548V0.add(3);
            }
            if (arrayList.size() == 1) {
                this.f53534M = true;
            }
            C111203g0 g0Var4 = this.f53581t;
            g0Var4.getClass();
            Log.m105927v("MicroMsg.ScanScrollTabController", "alvinluo setEnableTab tabIdList size: %d", Integer.valueOf(arrayList.size()));
            ScanScrollTabView scanScrollTabView5 = g0Var4.f333019b;
            if (scanScrollTabView5 != null) {
                scanScrollTabView5.mo151706i();
            }
            g0Var4.f333020c.clear();
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                Log.m105927v("MicroMsg.ScanScrollTabController", "alvinluo setEnableTab tabId: %d", Integer.valueOf(intValue));
                Iterator<T> it4 = g0Var4.f333022e.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (C111203g0.C37481a) it4.next();
                    if (aVar.f99037a == intValue) {
                        break;
                    }
                }
                if (aVar == null) {
                    break;
                } else if (g0Var4.mo162948a(i2, aVar)) {
                    i2++;
                }
            }
        }
        BaseScanRequest baseScanRequest = this.f53535N;
        if (baseScanRequest != null) {
            if (baseScanRequest.f248896d) {
                this.f53534M = true;
            }
            if (baseScanRequest.f248899g) {
                this.f53533L = true;
            }
            if (baseScanRequest.f248900h) {
                this.f53532K = true;
            }
        }
        if (this.f53534M) {
            ScanScrollTabView scanScrollTabView6 = this.f53581t.f333019b;
            if (scanScrollTabView6 != null) {
                scanScrollTabView6.setVisibility(8);
            }
            this.f53583v = false;
            this.f53562e.setBottomExtraHeight(0);
            this.f53548V0.clear();
        } else {
            ScanScrollTabView scanScrollTabView7 = this.f53581t.f333019b;
            if (scanScrollTabView7 != null) {
                scanScrollTabView7.setVisibility(0);
            }
            this.f53562e.setBottomExtraHeight(getResources().getDimensionPixelSize(C0966R.dimen.alv));
            this.f53583v = true;
        }
        mo24305e8(this.f53583v);
        Log.m105925i("MicroMsg.ScanUI", "alvinluo initView currentMode: %d, showOnlyScanCode: %b, hideScrollTab: %b, scanRequest: %s", Integer.valueOf(this.f53522A), Boolean.valueOf(this.f53530I), Boolean.valueOf(this.f53534M), this.f53535N);
        this.f53562e.setActivity(this);
        this.f53560d.addView(this.f53562e, 0, new FrameLayout.LayoutParams(-1, -1));
        this.f53562e.mo24384m();
        ScanSharedMaskView sharedMaskView = this.f53562e.getSharedMaskView();
        this.f53570i = sharedMaskView;
        sharedMaskView.getClass();
        sharedMaskView.f53811n = this;
        this.f53562e.setShowScanTips(this.f53524C);
        this.f53562e.setNetworkAvailable(this.f53525D);
        this.f53562e.setScanMode(this.f53522A);
        this.f53562e.setScanProductOnItemClickListener(this.f53557a1);
        this.f53562e.setScanProductCallback(this.f53559c1);
        this.f53562e.mo24422y();
        this.f53566g = this.f53562e.getScanProductMaskDecorView();
        mo24302b8(this.f53522A, 0);
        mo24293S7();
        C19016e1.m20092z(this.f53522A);
        mo24306f8();
        if (this.f53527F) {
            this.f53562e.setBlackInterval(C36079a.f96165a);
        }
        mo24292R7();
        mo24304d8();
        int[] iArr = this.f53528G;
        if (iArr != null && iArr.length > 0) {
            this.f53562e.setScanCodeReaders(iArr);
        }
        if (this.f53536P) {
            this.f53562e.setMyQrCodeVisible(false);
        }
        this.f53581t.mo162951d(this.f53522A, 0);
        mo24291Q7();
        this.f53574n.setOnCloseClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BaseScanUI baseScanUI = BaseScanUI.this;
                int i = BaseScanUI.f53521k1;
                baseScanUI.mo24298X7(false);
                BaseScanUI.this.mo24301a8();
                BaseScanUI.this.mo24290P7();
                C19016e1.m20078l(3, -1, BaseScanUI.this.f53577p0);
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f53574n.setOnCancelClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                BaseScanUI baseScanUI = BaseScanUI.this;
                baseScanUI.f53546U0 = 1;
                baseScanUI.onBackPressed();
                BaseScanUI.this.f53546U0 = 4;
                C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        mo24314o8();
        C20469e.f57530v.f57535c = new C20469e.C20473d() {
            /* renamed from: a */
            public void mo24327a(C21683r rVar) {
                if (rVar != null) {
                    if (!BaseScanUI.m20122H7(BaseScanUI.this, rVar)) {
                        Log.m105928w("MicroMsg.ScanUI", "onScanResult can not add now and ignore");
                        return;
                    }
                    C99932g.C34591a aVar = new C99932g.C34591a(2, rVar);
                    C10931f fVar = BaseScanUI.this.f53579r;
                    if (fVar instanceof C99932g) {
                        fVar.mo360a(rVar.f61381b, aVar);
                        return;
                    }
                    Log.m105929w("MicroMsg.ScanUI", "onScanResult resultHandler not expected: %s", fVar);
                }
            }
        };
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00be, code lost:
        if (r3 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0164, code lost:
        if (r0 == null) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01a6 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01b3 A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01bf A[Catch:{ Exception -> 0x01cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0109 A[Catch:{ Exception -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0116 A[Catch:{ Exception -> 0x0133 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0122 A[Catch:{ Exception -> 0x0133 }] */
    /* renamed from: j8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24309j8(int r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r27
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r26)
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "MicroMsg.ScanUI"
            java.lang.String r7 = "alvinluo showInfoView type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            r4 = 2
            r5 = 3
            r7 = 4
            if (r2 == r3) goto L_0x0022
            if (r2 == r4) goto L_0x0022
            if (r2 == r5) goto L_0x0022
            if (r2 != r7) goto L_0x037a
        L_0x0022:
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r8 = r1.f53570i
            if (r8 == 0) goto L_0x003b
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView r9 = r1.f53562e
            android.view.TextureView r9 = r9.getTextrueView()
            r8.f53814q = r9
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r8 = r1.f53570i
            if (r2 == r5) goto L_0x0037
            if (r2 != r7) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r9 = 0
            goto L_0x0038
        L_0x0037:
            r9 = 1
        L_0x0038:
            r8.setAnimateBackgroundView(r9)
        L_0x003b:
            r1.f53539R = r3
            if (r2 == r5) goto L_0x0044
            if (r2 != r7) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r8 = 0
            goto L_0x0045
        L_0x0044:
            r8 = 1
        L_0x0045:
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r9 = r1.f53574n
            r9.mo151659a(r6)
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r9 = r1.f53574n
            r10 = 0
            r9.mo151660b(r8, r10)
            com.tencent.mm.plugin.scanner.model.x0 r8 = r1.f53545U
            if (r8 == 0) goto L_0x036f
            r8.getClass()
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView<com.tencent.mm.plugin.scanner.api.BaseScanRequest> r9 = r8.f205485b
            if (r9 == 0) goto L_0x0060
            android.view.View r9 = r9.getTargetSuccessMarkView()
            goto L_0x0061
        L_0x0060:
            r9 = r10
        L_0x0061:
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView r11 = r8.f205487d
            if (r11 == 0) goto L_0x0068
            r11.setAnchorView(r9)
        L_0x0068:
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView r9 = r8.f205486c
            if (r9 == 0) goto L_0x0081
            android.widget.RelativeLayout r11 = r9.f53804d
            if (r11 == 0) goto L_0x007b
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 200(0xc8, double:9.9E-322)
            r16 = 0
            vl2.C111557w.m152065a(r11, r12, r13, r14, r16)
            goto L_0x0081
        L_0x007b:
            java.lang.String r0 = "contentLayout"
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x0081:
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView<com.tencent.mm.plugin.scanner.api.BaseScanRequest> r9 = r8.f205485b
            if (r9 == 0) goto L_0x0088
            r9.mo151735p(r3)
        L_0x0088:
            if (r0 == 0) goto L_0x0091
            java.lang.String r9 = "key_offline_scan_show_tips"
            boolean r9 = r0.getBoolean(r9, r3)
            goto L_0x0092
        L_0x0091:
            r9 = 1
        L_0x0092:
            java.lang.String r11 = "context.resources.getStr…network_unavailable_tips)"
            r12 = 2131835274(0x7f11398a, float:1.9303682E38)
            java.lang.String r13 = ""
            if (r2 == r3) goto L_0x020d
            if (r2 == r4) goto L_0x01f1
            java.lang.String r11 = "if (subTitle.isNullOrEmp…le_default) else subTitle"
            java.lang.String r12 = "if (title.isNullOrEmpty(…title_default) else title"
            java.lang.String r15 = "context.resources.getStr…_goods_sub_title_default)"
            java.lang.String r14 = "context.resources.getStr…scan_goods_title_default)"
            java.lang.String r10 = "buildViewParams parse BizScanBarcodeResponse from byte array exception"
            java.lang.String r4 = "MicroMsg.ScanInfoPageViewHelper"
            java.lang.String r3 = "key_scan_bar_code_response"
            if (r2 == r5) goto L_0x0158
            if (r2 == r7) goto L_0x00b5
            r0 = -1
            r0 = r13
            r9 = 0
            r14 = -1
            goto L_0x0231
        L_0x00b5:
            r5 = 2131835187(0x7f113933, float:1.9303505E38)
            if (r0 == 0) goto L_0x00c0
            byte[] r3 = r0.getByteArray(r3)     // Catch:{ Exception -> 0x0133 }
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            byte[] r3 = new byte[r6]     // Catch:{ Exception -> 0x0133 }
        L_0x00c2:
            if (r0 == 0) goto L_0x00cb
            java.lang.String r7 = "key_scan_bar_code_string"
            java.lang.String r0 = r0.getString(r7)     // Catch:{ Exception -> 0x0133 }
            goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r13 = r0
        L_0x00d0:
            r8.f205491h = r13     // Catch:{ Exception -> 0x0133 }
            te3.sh r0 = new te3.sh     // Catch:{ Exception -> 0x0133 }
            r0.<init>()     // Catch:{ Exception -> 0x0133 }
            r0.parseFrom(r3)     // Catch:{ Exception -> 0x0133 }
            java.util.LinkedList<te3.pi> r3 = r0.f141508f     // Catch:{ Exception -> 0x0133 }
            if (r3 == 0) goto L_0x00e9
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r6)     // Catch:{ Exception -> 0x0133 }
            te3.pi r3 = (te3.C50832pi) r3     // Catch:{ Exception -> 0x0133 }
            if (r3 == 0) goto L_0x00e9
            java.lang.String r3 = r3.f139773e     // Catch:{ Exception -> 0x0133 }
            goto L_0x00ea
        L_0x00e9:
            r3 = 0
        L_0x00ea:
            java.util.LinkedList<te3.pi> r0 = r0.f141508f     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x00fa
            r7 = 1
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r7)     // Catch:{ Exception -> 0x0133 }
            te3.pi r0 = (te3.C50832pi) r0     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = r0.f139773e     // Catch:{ Exception -> 0x0133 }
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            if (r3 == 0) goto L_0x0106
            int r7 = r3.length()     // Catch:{ Exception -> 0x0133 }
            if (r7 != 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r7 = 0
            goto L_0x0107
        L_0x0106:
            r7 = 1
        L_0x0107:
            if (r7 == 0) goto L_0x0111
            android.content.res.Resources r3 = r25.getResources()     // Catch:{ Exception -> 0x0133 }
            java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x0133 }
        L_0x0111:
            gy3.C87412m.m108593f(r3, r12)     // Catch:{ Exception -> 0x0133 }
            if (r0 == 0) goto L_0x011f
            int r7 = r0.length()     // Catch:{ Exception -> 0x0133 }
            if (r7 != 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r7 = 0
            goto L_0x0120
        L_0x011f:
            r7 = 1
        L_0x0120:
            if (r7 == 0) goto L_0x012d
            android.content.res.Resources r0 = r25.getResources()     // Catch:{ Exception -> 0x0133 }
            r7 = 2131835186(0x7f113932, float:1.9303503E38)
            java.lang.String r0 = r0.getString(r7)     // Catch:{ Exception -> 0x0133 }
        L_0x012d:
            gy3.C87412m.m108593f(r0, r11)     // Catch:{ Exception -> 0x0133 }
            r13 = r0
            r0 = r3
            goto L_0x0153
        L_0x0133:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r10, r3)
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getString(r5)
            gy3.C87412m.m108593f(r0, r14)
            android.content.res.Resources r3 = r25.getResources()
            r4 = 2131835186(0x7f113932, float:1.9303503E38)
            java.lang.String r3 = r3.getString(r4)
            gy3.C87412m.m108593f(r3, r15)
            r13 = r3
        L_0x0153:
            r14 = 2131756919(0x7f100777, float:1.914476E38)
            goto L_0x0231
        L_0x0158:
            r5 = 2131835183(0x7f11392f, float:1.9303497E38)
            r7 = 2131835184(0x7f113930, float:1.93035E38)
            if (r0 == 0) goto L_0x0166
            byte[] r0 = r0.getByteArray(r3)     // Catch:{ Exception -> 0x01cb }
            if (r0 != 0) goto L_0x0168
        L_0x0166:
            byte[] r0 = new byte[r6]     // Catch:{ Exception -> 0x01cb }
        L_0x0168:
            te3.sh r3 = new te3.sh     // Catch:{ Exception -> 0x01cb }
            r3.<init>()     // Catch:{ Exception -> 0x01cb }
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x01cb }
            java.util.LinkedList<te3.pi> r0 = r3.f141508f     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x017f
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r6)     // Catch:{ Exception -> 0x01cb }
            te3.pi r0 = (te3.C50832pi) r0     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x017f
            java.lang.String r0 = r0.f139773e     // Catch:{ Exception -> 0x01cb }
            goto L_0x0180
        L_0x017f:
            r0 = 0
        L_0x0180:
            java.util.LinkedList<te3.pi> r3 = r3.f141508f     // Catch:{ Exception -> 0x01cb }
            if (r3 == 0) goto L_0x0190
            r13 = 1
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r13)     // Catch:{ Exception -> 0x01cb }
            te3.pi r3 = (te3.C50832pi) r3     // Catch:{ Exception -> 0x01cb }
            if (r3 == 0) goto L_0x0190
            java.lang.String r3 = r3.f139773e     // Catch:{ Exception -> 0x01cb }
            goto L_0x0191
        L_0x0190:
            r3 = 0
        L_0x0191:
            com.tencent.mm.plugin.scanner.model.v0 r13 = new com.tencent.mm.plugin.scanner.model.v0     // Catch:{ Exception -> 0x01cb }
            r13.<init>(r8)     // Catch:{ Exception -> 0x01cb }
            if (r0 == 0) goto L_0x01a2
            int r17 = r0.length()     // Catch:{ Exception -> 0x01cb }
            if (r17 != 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            r17 = 0
            goto L_0x01a4
        L_0x01a2:
            r17 = 1
        L_0x01a4:
            if (r17 == 0) goto L_0x01ae
            android.content.res.Resources r0 = r25.getResources()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r0 = r0.getString(r7)     // Catch:{ Exception -> 0x01cb }
        L_0x01ae:
            gy3.C87412m.m108593f(r0, r12)     // Catch:{ Exception -> 0x01cb }
            if (r3 == 0) goto L_0x01bc
            int r12 = r3.length()     // Catch:{ Exception -> 0x01cb }
            if (r12 != 0) goto L_0x01ba
            goto L_0x01bc
        L_0x01ba:
            r12 = 0
            goto L_0x01bd
        L_0x01bc:
            r12 = 1
        L_0x01bd:
            if (r12 == 0) goto L_0x01c7
            android.content.res.Resources r3 = r25.getResources()     // Catch:{ Exception -> 0x01cb }
            java.lang.String r3 = r3.getString(r5)     // Catch:{ Exception -> 0x01cb }
        L_0x01c7:
            gy3.C87412m.m108593f(r3, r11)     // Catch:{ Exception -> 0x01cb }
            goto L_0x01ec
        L_0x01cb:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r10, r3)
            com.tencent.mm.plugin.scanner.model.w0 r13 = new com.tencent.mm.plugin.scanner.model.w0
            r13.<init>(r8)
            android.content.res.Resources r0 = r25.getResources()
            java.lang.String r0 = r0.getString(r7)
            gy3.C87412m.m108593f(r0, r14)
            android.content.res.Resources r3 = r25.getResources()
            java.lang.String r3 = r3.getString(r5)
            gy3.C87412m.m108593f(r3, r15)
        L_0x01ec:
            r7 = 1
            r14 = 2131756919(0x7f100777, float:1.914476E38)
            goto L_0x0234
        L_0x01f1:
            android.content.res.Resources r0 = r25.getResources()
            r3 = 2131835276(0x7f11398c, float:1.9303686E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "context.resources.getStr…can_offline_network_weak)"
            gy3.C87412m.m108593f(r0, r3)
            android.content.res.Resources r3 = r25.getResources()
            java.lang.String r3 = r3.getString(r12)
            gy3.C87412m.m108593f(r3, r11)
            goto L_0x0228
        L_0x020d:
            android.content.res.Resources r0 = r25.getResources()
            r3 = 2131835273(0x7f113989, float:1.930368E38)
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "context.resources.getStr…line_network_unavailable)"
            gy3.C87412m.m108593f(r0, r3)
            android.content.res.Resources r3 = r25.getResources()
            java.lang.String r3 = r3.getString(r12)
            gy3.C87412m.m108593f(r3, r11)
        L_0x0228:
            r13 = r0
            r0 = 2131756918(0x7f100776, float:1.9144757E38)
            r0 = r13
            r14 = 2131756918(0x7f100776, float:1.9144757E38)
            r13 = r3
        L_0x0231:
            r3 = r13
            r7 = 0
            r13 = 0
        L_0x0234:
            r8.f205490g = r2
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView r4 = r8.f205487d
            if (r4 == 0) goto L_0x036f
            r5 = 4
            java.lang.Object[] r8 = new java.lang.Object[r5]
            boolean r5 = r4.f205556y
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r8[r6] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            r10 = 1
            r8[r10] = r5
            r5 = 2
            r8[r5] = r0
            r5 = 3
            r8[r5] = r3
            java.lang.String r5 = "MicroMsg.ScanInfoMaskView"
            java.lang.String r10 = "alvinluo showInfoView needTranslateInfoIcon: %b, showTips: %b, title: %s, subTitle: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r8)
            android.view.View r5 = r4.f205542h
            java.lang.String r8 = "infoLayout"
            if (r5 == 0) goto L_0x036a
            r10 = 2131312762(0x7f09407a, float:1.8243902E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 != 0) goto L_0x026b
            goto L_0x026e
        L_0x026b:
            r10.setText(r0)
        L_0x026e:
            r0 = 2131312761(0x7f094079, float:1.82439E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = 8
            if (r0 == 0) goto L_0x0287
            r0.setText(r3)
            if (r9 == 0) goto L_0x0282
            r3 = 0
            goto L_0x0284
        L_0x0282:
            r3 = 8
        L_0x0284:
            r0.setVisibility(r3)
        L_0x0287:
            android.widget.ImageView r0 = r4.f205543i
            if (r0 == 0) goto L_0x0363
            r0.setImageResource(r14)
            android.widget.TextView r0 = r4.f205544j
            java.lang.String r3 = "opButton"
            if (r0 == 0) goto L_0x035e
            if (r7 == 0) goto L_0x0299
            r7 = 0
            goto L_0x029b
        L_0x0299:
            r7 = 8
        L_0x029b:
            r0.setVisibility(r7)
            android.widget.TextView r0 = r4.f205544j
            if (r0 == 0) goto L_0x0359
            r0.setOnClickListener(r13)
            android.view.View r0 = r4.f205540f
            if (r0 == 0) goto L_0x0351
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r5)
            java.lang.Object[] r18 = r3.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r20 = "showInfoView"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/scanner/view/IScanInfoView$ScanInfoViewParams;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r18 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r19 = "showInfoView"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/scanner/view/IScanInfoView$ScanInfoViewParams;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = r4.f205556y
            if (r0 != 0) goto L_0x02f6
            r4.f205556y = r6
            r4.mo97661a(r6)
            goto L_0x036f
        L_0x02f6:
            r4.f205550s = r6
            r3 = 1
            r4.f205551t = r3
            android.view.View r0 = r4.f205542h
            if (r0 == 0) goto L_0x034c
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r12 = "showInfoView"
            java.lang.String r13 = "(Lcom/tencent/mm/plugin/scanner/view/IScanInfoView$ScanInfoViewParams;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r0
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView"
            java.lang.String r11 = "showInfoView"
            java.lang.String r12 = "(Lcom/tencent/mm/plugin/scanner/view/IScanInfoView$ScanInfoViewParams;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            r3 = 4
            r4.setVisibility(r3)
            ul2.y r0 = new ul2.y
            r0.<init>(r4)
            r4.post(r0)
            goto L_0x036f
        L_0x034c:
            gy3.C87412m.m108603p(r8)
            r2 = 0
            throw r2
        L_0x0351:
            r2 = 0
            java.lang.String r0 = "loadingLayout"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x0359:
            r2 = 0
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x035e:
            r2 = 0
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x0363:
            r2 = 0
            java.lang.String r0 = "infoIcon"
            gy3.C87412m.m108603p(r0)
            throw r2
        L_0x036a:
            r2 = 0
            gy3.C87412m.m108603p(r8)
            throw r2
        L_0x036f:
            r3 = 3
            if (r2 != r3) goto L_0x037a
            boolean r0 = r1.f53577p0
            int r2 = r1.f53522A
            r3 = 4
            com.tencent.p014mm.plugin.scanner.model.C19016e1.m20079m(r3, r0, r2, r6)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.mo24309j8(int, android.os.Bundle):void");
    }

    /* renamed from: k8 */
    public void mo24310k8(boolean z, boolean z2, C94528d.C94529a aVar) {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(z);
        C71007x0 x0Var = this.f53545U;
        objArr[1] = Boolean.valueOf(x0Var != null && x0Var.f205488e);
        objArr[2] = Boolean.valueOf(z2);
        Log.m105925i("MicroMsg.ScanUI", "alvinluo showLoadingView show: %b, isLoadingShow: %b, withAnimation: %b", objArr);
        this.f53539R = z;
        C71007x0 x0Var2 = this.f53545U;
        if (x0Var2 != null) {
            x0Var2.f205489f = aVar;
            if (x0Var2.f205488e != z) {
                x0Var2.mo97655a(z, z2);
                if (z) {
                    this.f53574n.mo151659a(false);
                    this.f53574n.mo151660b(false, (Animator.AnimatorListener) null);
                }
            }
        }
    }

    /* renamed from: l8 */
    public final void mo24311l8(boolean z) {
        if (z) {
            View view = this.f53568h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            BaseScanMaskView baseScanMaskView = this.f53562e.f53721r;
            if (baseScanMaskView != null && (baseScanMaskView instanceof ScanCodeMaskView)) {
                ((ScanCodeMaskView) baseScanMaskView).mo151722D();
            }
            this.f53568h.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/BaseScanUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    baseScanUI.f53551X = 0;
                    baseScanUI.mo24311l8(false);
                    BaseScanUI.this.mo24303c8();
                    C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/BaseScanUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            ScanUIRectView scanUIRectView = this.f53562e;
            if (scanUIRectView != null) {
                scanUIRectView.mo24392r(true);
            }
            this.f53574n.mo151659a(false);
            mo24308i8(false, true);
            return;
        }
        View view2 = this.f53568h;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/ui/BaseScanUI", "showNoScanContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ScanUIRectView scanUIRectView2 = this.f53562e;
        if (scanUIRectView2 != null) {
            scanUIRectView2.mo24392r(false);
        }
        this.f53574n.mo151659a(true);
    }

    /* renamed from: m8 */
    public void mo24312m8(int i) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        final int i2 = i;
        mo24307g8(true);
        this.f53539R = false;
        if (i2 == 12 && this.f53545U != null) {
            this.f53574n.mo151660b(false, (Animator.AnimatorListener) null);
            ScanSharedMaskView scanSharedMaskView = this.f53570i;
            if (scanSharedMaskView != null) {
                scanSharedMaskView.mo24470a(true, (AnimatorListenerAdapter) null);
            }
            C71007x0 x0Var = this.f53545U;
            C1906639 r6 = new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    BaseScanUI.this.f53581t.mo162951d(i2, 4);
                }
            };
            ScanInfoMaskView scanInfoMaskView = x0Var.f205487d;
            if (scanInfoMaskView != null) {
                View view = scanInfoMaskView.f205542h;
                if (view == null) {
                    C87412m.m108603p("infoLayout");
                    throw null;
                } else if (view.getVisibility() == 0) {
                    View view2 = scanInfoMaskView.f205540f;
                    if (view2 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateSwitch", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateSwitch", "(Landroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view4 = scanInfoMaskView.f205542h;
                        if (view4 != null) {
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(Float.valueOf(1.0f));
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateViewAlpha", "(Landroid/view/View;ZJLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view4.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "animateViewAlpha", "(Landroid/view/View;ZJLandroid/animation/AnimatorListenerAdapter;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            Log.m105925i("MicroMsg.ScanInfoMaskView", "alvinluo animateViewAlpha view: %s, show: %b", view4, Boolean.FALSE);
                            ViewPropertyAnimator animate = view4.animate();
                            if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(150)) == null || (listener = duration.setListener(new C78231w(view4, false, r6))) == null)) {
                                listener.start();
                            }
                        } else {
                            C87412m.m108603p("infoLayout");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("loadingLayout");
                        throw null;
                    }
                }
            }
            C119179t tVar = C119157j.f356862d;
            C1906840 r5 = new Runnable() {
                public void run() {
                    ScanSharedMaskView scanSharedMaskView;
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    if (!baseScanUI.f53547V || (scanSharedMaskView = baseScanUI.f53570i) == null) {
                        baseScanUI.mo24305e8(true);
                        ScanUIRectView scanUIRectView = baseScanUI.f53562e;
                        if (scanUIRectView != null) {
                            scanUIRectView.setIgnorePreviewFrame(false);
                            baseScanUI.f53562e.mo24382k(0);
                            return;
                        }
                        return;
                    }
                    baseScanUI.f53547V = false;
                    scanSharedMaskView.mo24470a(false, new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            BaseScanUI baseScanUI = BaseScanUI.this;
                            int i = BaseScanUI.f53521k1;
                            baseScanUI.mo24305e8(true);
                            ScanUIRectView scanUIRectView = baseScanUI.f53562e;
                            if (scanUIRectView != null) {
                                scanUIRectView.setIgnorePreviewFrame(false);
                                baseScanUI.f53562e.mo24382k(0);
                            }
                        }
                    });
                }
            };
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(r5, 1000, false);
        }
    }

    /* renamed from: n8 */
    public final void mo24313n8() {
        if (this.f53577p0) {
            MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
            boolean z = multiProcessMMKV != null ? multiProcessMMKV.getBoolean("scan_config_disable_scan_product", false) : false;
            Log.m105924i("MicroMsg.ScanFastFocusEngineManager", "disableScanProductInMergeMode: " + z);
            if (this.f53525D) {
                this.f53586x0 = z || this.f53555Z;
            } else {
                this.f53586x0 = true;
            }
            ScanUIRectView scanUIRectView = this.f53562e;
            if (scanUIRectView != null) {
                scanUIRectView.setDisableScanProductInMergeMode(this.f53586x0);
            }
            Log.m105925i("MicroMsg.ScanUI", "updateDisableScanProductInMergeMode config: %s, current: %s, currentNetwork: %s, willCrash: %s", Boolean.valueOf(z), Boolean.valueOf(this.f53586x0), Boolean.valueOf(this.f53525D), Boolean.valueOf(this.f53555Z));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if ((r1 == 3) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r5.f53536P == false) goto L_0x0027;
     */
    /* renamed from: o8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24314o8() {
        /*
            r5 = this;
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r0 = r5.f53574n
            boolean r1 = r5.mo24294T7()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001d
            int r1 = r5.f53522A
            r4 = 12
            if (r1 != r4) goto L_0x0012
            r4 = 1
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 != 0) goto L_0x001d
            r4 = 3
            if (r1 != r4) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 == 0) goto L_0x0026
        L_0x001d:
            boolean r1 = r5.f53532K
            if (r1 != 0) goto L_0x0026
            boolean r1 = r5.f53536P
            if (r1 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            r0.setShowMoreButton(r2)
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r0 = r5.f53574n
            com.tencent.mm.plugin.scanner.ui.BaseScanUI$21 r1 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI$21
            r1.<init>()
            r0.setOnMoreClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.mo24314o8():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        BaseScanMaskView baseScanMaskView;
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i3 != 561) {
            if (i3 != 2000) {
                if (i3 != 4660) {
                    if (i3 == 1001) {
                        finish();
                    } else if (i3 == 1002) {
                        finish();
                        return;
                    } else {
                        return;
                    }
                } else if (i4 != -1 || intent2 == null) {
                    mo24303c8();
                    if (i4 == 0 && C37751c0.m41521a(this.f53522A)) {
                        C19016e1.m20077k(this.f53522A);
                        return;
                    }
                    return;
                } else {
                    C19016e1.m20089w(this.f53522A);
                    String b = C7013o.m7260b(this, intent2, C7970a.m8127a());
                    Log.m105925i("MicroMsg.ScanUI", "select: [%s]", b);
                    if (!Util.isNullOrNil(b)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C19933b.f56834I.mo27313f(1);
                        C19016e1.m20085s(this.f53522A, this.f53537Q, 11, this.f53589z, currentTimeMillis);
                        if (!mo24294T7() || !this.f53577p0) {
                            z = false;
                        }
                        if (z) {
                            C19011d.m20064a(40, (C19011d.C19012a) null);
                        }
                        C99712h0.C99714b bVar = new C99712h0.C99714b();
                        bVar.f292250b = 4;
                        final long j = currentTimeMillis;
                        final String str = b;
                        final int i5 = i2;
                        final Intent intent3 = intent;
                        C19934c.f56868h.mo27314a(this, currentTimeMillis, b, (Bitmap) null, new C99712h0.C99713a() {
                            /* renamed from: a */
                            public void mo24342a(long j, C99712h0.C99715c cVar) {
                                List<WxQbarNative.QBarReportMsg> list = null;
                                final List<C19931a.C19932a> list2 = cVar != null ? cVar.f292251a : null;
                                if (cVar != null) {
                                    list = cVar.f292253c;
                                }
                                final List<WxQbarNative.QBarReportMsg> list3 = list;
                                BaseScanUI baseScanUI = BaseScanUI.this;
                                final int i = baseScanUI.f53577p0 ? 4 : 2;
                                if (j == j && baseScanUI.mo24294T7()) {
                                    final long j2 = j;
                                    ((C119157j) C119157j.f356862d).mo183895z(new Runnable() {
                                        public void run() {
                                            List list = list2;
                                            if (list == null || list.isEmpty()) {
                                                BaseScanUI baseScanUI = BaseScanUI.this;
                                                baseScanUI.f53539R = true;
                                                C19016e1.m20081o(baseScanUI.f53522A, false, i, 1);
                                                BaseScanUI baseScanUI2 = BaseScanUI.this;
                                                if (baseScanUI2.f53577p0) {
                                                    C19032z0 z0Var = baseScanUI2.f53554Y0;
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    C1906337 r3 = C1906337.this;
                                                    int i = i5;
                                                    Intent intent = intent3;
                                                    BaseScanUI baseScanUI3 = BaseScanUI.this;
                                                    int i2 = baseScanUI3.f53522A;
                                                    int i3 = i;
                                                    C19032z0.C19033a aVar = baseScanUI3.f53556Z0;
                                                    z0Var.getClass();
                                                    C87412m.m108594g(aVar, "callback");
                                                    Object[] objArr = new Object[2];
                                                    objArr[0] = Integer.valueOf(i);
                                                    objArr[1] = Boolean.valueOf(intent == null);
                                                    Log.m105925i("MicroMsg.ScanProductForGalleryHelper", "handleScanGalleryImage resultCode: %d, data == null: %b", objArr);
                                                    z0Var.f53516c = currentTimeMillis;
                                                    if (i == -1) {
                                                        z0Var.f53515b = aVar;
                                                        BaseScanUI baseScanUI4 = (BaseScanUI) z0Var.f53514a;
                                                        baseScanUI4.getClass();
                                                        String b = C7013o.m7260b(baseScanUI4, intent, C7970a.m8127a());
                                                        Object[] objArr2 = new Object[4];
                                                        objArr2[0] = Long.valueOf(currentTimeMillis);
                                                        objArr2[1] = Integer.valueOf(i);
                                                        objArr2[2] = b;
                                                        objArr2[3] = Boolean.valueOf(intent == null);
                                                        Log.m105919d("MicroMsg.ScanProductForGalleryHelper", "handleScanGalleryImage session: %d, resultCode: %d, filePath: %s, data == null: %b", objArr2);
                                                        ScanUIRectView scanUIRectView = ((BaseScanUI) z0Var.f53514a).f53562e;
                                                        BaseScanMaskView scanMaskView = scanUIRectView != null ? scanUIRectView.getScanMaskView() : null;
                                                        if (scanMaskView != null) {
                                                            scanMaskView.setScanSource(i3);
                                                        }
                                                        int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(b);
                                                        long currentTimeMillis2 = System.currentTimeMillis();
                                                        Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(b);
                                                        long currentTimeMillis3 = System.currentTimeMillis();
                                                        if (exifOrientation == 90 || exifOrientation == 270) {
                                                            decodeFileWithSample = BitmapUtil.rotate(decodeFileWithSample, (float) exifOrientation);
                                                        }
                                                        Log.m105925i("MicroMsg.ScanProductForGalleryHelper", "handleScanGalleryImage decode image cost: %d, rotation: %s", Long.valueOf(currentTimeMillis3 - currentTimeMillis2), Integer.valueOf(exifOrientation));
                                                        if (decodeFileWithSample != null && !decodeFileWithSample.isRecycled()) {
                                                            ScanUIRectView scanUIRectView2 = ((BaseScanUI) z0Var.f53514a).f53562e;
                                                            BaseScanMaskView scanMaskView2 = scanUIRectView2 != null ? scanUIRectView2.getScanMaskView() : null;
                                                            if (scanMaskView2 instanceof ScanGoodsMaskView) {
                                                                ScanGoodsMaskView scanGoodsMaskView = (ScanGoodsMaskView) scanMaskView2;
                                                                scanGoodsMaskView.f315918S = true;
                                                                scanGoodsMaskView.f315920T = false;
                                                                scanGoodsMaskView.mo151692y(decodeFileWithSample);
                                                            } else if (scanMaskView2 instanceof ScanCodeProductMergeMaskView) {
                                                                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = (ScanCodeProductMergeMaskView) scanMaskView2;
                                                                scanCodeProductMergeMaskView.f316036b1 = true;
                                                                scanCodeProductMergeMaskView.f316037c1 = false;
                                                                scanCodeProductMergeMaskView.mo151777F(decodeFileWithSample);
                                                                View myQrCodeButton = scanCodeProductMergeMaskView.getMyQrCodeButton();
                                                                C9556a aVar2 = new C9556a();
                                                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                                                aVar2.mo10233c(Float.valueOf(0.0f));
                                                                View view = myQrCodeButton;
                                                                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onGalleryImageProcessStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                                                myQrCodeButton.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                                                                C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView", "onGalleryImageProcessStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                                                ScanProductMaskDecorView scanProductMaskDecorView = scanCodeProductMergeMaskView.f316031W0;
                                                                if (scanProductMaskDecorView != null) {
                                                                    scanProductMaskDecorView.setAlpha(0.0f);
                                                                } else {
                                                                    C87412m.m108603p("scanProductListView");
                                                                    throw null;
                                                                }
                                                            }
                                                        }
                                                        z0Var.f53519f = new C19002a1(z0Var, currentTimeMillis);
                                                        ScanUIRectView scanUIRectView3 = ((BaseScanUI) z0Var.f53514a).f53562e;
                                                        BaseScanMaskView scanMaskView3 = scanUIRectView3 != null ? scanUIRectView3.getScanMaskView() : null;
                                                        if (scanMaskView3 != null) {
                                                            scanMaskView3.mo151685s(true, z0Var.f53519f);
                                                        }
                                                        C87412m.m108593f(b, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                                                        byte[] b2 = C102461j.m135248b(b, exifOrientation, 122880, (C102461j.C102462a) null);
                                                        boolean z = b2 != null && b2.length <= 122880;
                                                        C19011d.C19012a aVar3 = new C19011d.C19012a(0);
                                                        if (z) {
                                                            Object[] objArr3 = new Object[1];
                                                            objArr3[0] = b2 != null ? Integer.valueOf(b2.length) : null;
                                                            Log.m105925i("MicroMsg.ScanProductForGalleryHelper", "scanProductForFile compressImage success final data length: %d", objArr3);
                                                            if (z0Var.f53518e == null) {
                                                                z0Var.f53518e = new C21672j(z0Var.f53517d);
                                                            }
                                                            C21672j jVar = z0Var.f53518e;
                                                            if (jVar != null) {
                                                                C21683r rVar = new C21683r();
                                                                rVar.f61380a = i3;
                                                                rVar.f61381b = currentTimeMillis;
                                                                rVar.f61384e = 1;
                                                                ArrayList<C21681q> arrayList = rVar.f61383d;
                                                                ScanProductInfo scanProductInfo = new ScanProductInfo();
                                                                scanProductInfo.setId(-1);
                                                                C21681q qVar = new C21681q(scanProductInfo);
                                                                aVar3.f53412b = b2.length;
                                                                aVar3.f53411a = 1;
                                                                qVar.f61364g = aVar3;
                                                                qVar.f61362e = b2;
                                                                arrayList.add(qVar);
                                                                C13598b0 b0Var = C13598b0.f38549a;
                                                                jVar.mo360a(currentTimeMillis, rVar);
                                                            }
                                                        } else {
                                                            Log.m105920e("MicroMsg.ScanProductForGalleryHelper", "scanProductByFile compressImage failed");
                                                            if (z0Var.f53516c == currentTimeMillis) {
                                                                C19011d.m20064a(11, aVar3);
                                                                C19032z0.C19034b bVar = z0Var.f53517d;
                                                                C21680p pVar = new C21680p(i3, currentTimeMillis, 2);
                                                                pVar.f61357e = aVar3;
                                                                bVar.mo24285d(pVar, 1001, "scan by file compressImage failed");
                                                            }
                                                        }
                                                    } else {
                                                        ((BaseScanUI) z0Var.f53514a).mo24303c8();
                                                        if (i == 0) {
                                                            C19016e1.m20077k(12);
                                                        }
                                                    }
                                                    C1906337 r1 = C1906337.this;
                                                    BaseScanUI baseScanUI5 = BaseScanUI.this;
                                                    C19016e1.m20085s(baseScanUI5.f53522A, baseScanUI5.f53537Q, 13, baseScanUI5.f53589z, j);
                                                    return;
                                                }
                                                baseScanUI2.mo24311l8(true);
                                                return;
                                            }
                                            BaseScanUI baseScanUI6 = BaseScanUI.this;
                                            List<C19931a.C19932a> list2 = list2;
                                            int i4 = BaseScanUI.f53521k1;
                                            baseScanUI6.getClass();
                                            if (list2 != null && !list2.isEmpty()) {
                                                ArrayList arrayList2 = new ArrayList();
                                                ArrayList arrayList3 = null;
                                                for (C19931a.C19932a aVar4 : list2) {
                                                    if (aVar4 != null) {
                                                        if (C36079a.m40902a(aVar4.f56829f)) {
                                                            Log.m105924i("MicroMsg.ScanUI", "resortCodeList badCode:" + aVar4.f56829f);
                                                            if (arrayList3 == null) {
                                                                arrayList3 = new ArrayList();
                                                            }
                                                            arrayList3.add(aVar4);
                                                        } else {
                                                            arrayList2.add(aVar4);
                                                        }
                                                    }
                                                }
                                                if (arrayList3 == null || arrayList3.isEmpty()) {
                                                    Log.m105924i("MicroMsg.ScanUI", "resortCodeList no bad code");
                                                } else {
                                                    Iterator it = arrayList3.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList2.add((C19931a.C19932a) it.next());
                                                    }
                                                    list2 = arrayList2;
                                                }
                                            }
                                            BaseScanUI.this.f53539R = false;
                                            Bundle bundle = new Bundle();
                                            C19931a.C19932a aVar5 = (C19931a.C19932a) list2.get(0);
                                            String str = aVar5.f56829f;
                                            bundle.putString("result_content", str);
                                            bundle.putInt("result_code_format", aVar5.f56827d);
                                            bundle.putString("result_code_name", aVar5.f56828e);
                                            byte[] bArr = aVar5.f56830g;
                                            if (bArr != null) {
                                                bundle.putByteArray("result_raw_data", bArr);
                                            }
                                            List list3 = list3;
                                            int i5 = (list3 == null || list3.isEmpty()) ? 0 : ((WxQbarNative.QBarReportMsg) list3.get(0)).qrcodeVersion;
                                            bundle.putInt("result_code_version", i5);
                                            bundle.putParcelable("ScanIdentifyReportInfo.DecodeKey", new ScanIdentifyReportInfo((byte[]) null, (Point) null, str));
                                            C19016e1.m20081o(BaseScanUI.this.f53522A, true, i, 1);
                                            C19011d.m20064a(41, (C19011d.C19012a) null);
                                            if (BaseScanUI.this.f53531J) {
                                                Intent intent2 = new Intent();
                                                intent2.putExtra("key_scan_result", bundle.getString("result_content"));
                                                intent2.putExtra("key_scan_result_raw", bundle.getByteArray("result_raw_data"));
                                                intent2.putExtra("key_scan_result_code_name", bundle.getString("result_code_name"));
                                                intent2.putExtra("key_scan_result_code_version", i5);
                                                BaseScanUI.this.setResult(-1, intent2);
                                                BaseScanUI.this.mo6125q();
                                                return;
                                            }
                                            bundle.putInt("qbar_string_scan_source", 1);
                                            C10931f fVar = BaseScanUI.this.f53579r;
                                            if (fVar != null) {
                                                fVar.mo360a(j2, new C99932g.C34591a(1, bundle));
                                                C115669n.INSTANCE.mo160131h(19332, Long.valueOf(j2), 1, str, Integer.valueOf(aVar5.f56832i), 1, str, Integer.valueOf(aVar5.f56832i), 0, "", aVar5.f56828e, Long.valueOf(System.currentTimeMillis()), 1, 0, 0, 8);
                                            }
                                            BaseScanUI.m20124J7(BaseScanUI.this);
                                            C1906337 r15 = C1906337.this;
                                            BaseScanUI baseScanUI7 = BaseScanUI.this;
                                            C19016e1.m20085s(baseScanUI7.f53522A, baseScanUI7.f53537Q, 12, baseScanUI7.f53589z, j);
                                        }
                                    });
                                }
                            }
                        }, this.f53528G, bVar);
                        return;
                    }
                    return;
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i2);
            objArr[1] = Boolean.valueOf(intent2 == null);
            Log.m105925i("MicroMsg.ScanUI", "alvinluo processGoodsImage resultCode: %d, data == null: %b", objArr);
            if (i4 == -1) {
                C19016e1.m20089w(this.f53522A);
                C19016e1.m20069C(2, System.currentTimeMillis());
                String b2 = C7013o.m7260b(this, intent2, C7970a.m8127a());
                final long currentTimeMillis2 = System.currentTimeMillis();
                Object[] objArr2 = new Object[4];
                objArr2[0] = Long.valueOf(currentTimeMillis2);
                objArr2[1] = Integer.valueOf(i2);
                objArr2[2] = b2;
                objArr2[3] = Boolean.valueOf(intent2 == null);
                Log.m105919d("MicroMsg.ScanUI", "alvinluo processGoodsImage session: %d, resultCode: %d, filePath: %s, data == null: %b", objArr2);
                ScanUIRectView scanUIRectView = this.f53562e;
                if (scanUIRectView != null) {
                    scanUIRectView.setScanSource(2);
                }
                int exifOrientation = BackwardSupportUtil.ExifHelper.getExifOrientation(b2);
                long currentTimeMillis3 = System.currentTimeMillis();
                Bitmap decodeFileWithSample = BitmapUtil.decodeFileWithSample(b2);
                long currentTimeMillis4 = System.currentTimeMillis();
                if (exifOrientation == 90 || exifOrientation == 270) {
                    decodeFileWithSample = BitmapUtil.rotate(decodeFileWithSample, (float) exifOrientation);
                }
                Log.m105925i("MicroMsg.ScanUI", "alvinluo processGoodsImage decode image cost: %d, rotation: %s", Long.valueOf(currentTimeMillis4 - currentTimeMillis3), Integer.valueOf(exifOrientation));
                if (decodeFileWithSample != null && !decodeFileWithSample.isRecycled()) {
                    BaseScanMaskView scanMaskView = this.f53562e.getScanMaskView();
                    if (scanMaskView instanceof ScanGoodsMaskView) {
                        ScanGoodsMaskView scanGoodsMaskView = (ScanGoodsMaskView) scanMaskView;
                        scanGoodsMaskView.f315918S = true;
                        scanGoodsMaskView.f315920T = false;
                        scanGoodsMaskView.mo151692y(decodeFileWithSample);
                    } else if (scanMaskView instanceof ScanCodeProductMergeMaskView) {
                        ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = (ScanCodeProductMergeMaskView) scanMaskView;
                        scanCodeProductMergeMaskView.f316036b1 = true;
                        scanCodeProductMergeMaskView.f316037c1 = false;
                        scanCodeProductMergeMaskView.mo151777F(decodeFileWithSample);
                    }
                }
                C1906538 r5 = new DialogInterface.OnCancelListener(2) {
                    public void onCancel(DialogInterface dialogInterface) {
                        Log.m105924i("MicroMsg.ScanUI", "alvinluo processGoodsImage onCancel and resumeScan");
                        C10931f fVar = BaseScanUI.this.f53579r;
                        if (fVar instanceof C21513a) {
                            C21513a aVar = (C21513a) fVar;
                            long j = currentTimeMillis2;
                            C19003b bVar = aVar.f60918n;
                            if (bVar != null) {
                                bVar.mo24243a(j);
                            }
                            C19003b bVar2 = aVar.f60917j;
                            if (bVar2 != null) {
                                bVar2.mo24243a(j);
                            }
                        }
                        C19016e1.m20072c(2, false, System.currentTimeMillis(), true);
                        BaseScanUI.this.mo24303c8();
                    }
                };
                ScanUIRectView scanUIRectView2 = this.f53562e;
                if (!(scanUIRectView2 == null || (baseScanMaskView = scanUIRectView2.f53721r) == null)) {
                    baseScanMaskView.mo151685s(true, r5);
                }
                C20461a aVar = C20461a.f57497j;
                C20461a.C20465d dVar = this.f53563e1;
                aVar.getClass();
                Log.m105927v("MicroMsg.AiScanImageDecodeQueueNew", "alvinluo addDecodeTask filePath: %s, source: %s, rotation: %s", b2, 2, Integer.valueOf(exifOrientation));
                C19021i0.m20105l(new C20466b(aVar, b2, exifOrientation, 2, dVar, currentTimeMillis2));
                return;
            }
            mo24303c8();
            if (i4 == 0) {
                C19016e1.m20077k(12);
            }
        } else if (i4 == -1) {
            String b3 = C7013o.m7260b(this, intent2, C7970a.m8127a());
            Log.m105925i("MicroMsg.ScanUI", "alvinluo scanTranslate select image: [%s]", b3);
            if (this.f53579r != null) {
                Bundle bundle = new Bundle();
                bundle.putString("key_translate_file_path", b3);
                this.f53579r.mo360a(System.currentTimeMillis(), bundle);
            }
        }
    }

    public void onBackPressed() {
        boolean z;
        Log.m105926v("MicroMsg.ScanUI", "alvinluo onBackPressed");
        C52958x xVar = this.f53576p;
        if (xVar == null || !xVar.mo73697E()) {
            C71007x0 x0Var = this.f53545U;
            if (x0Var == null || !x0Var.f205488e) {
                z = false;
            } else {
                Log.m105924i("MicroMsg.ScanUI", "alvinluo cancelLoading");
                C71007x0 x0Var2 = this.f53545U;
                C94528d.C94529a aVar = x0Var2.f205489f;
                if (aVar != null) {
                    aVar.mo55548a((C94528d) null);
                }
                x0Var2.f205489f = null;
                this.f53545U.mo97655a(false, false);
                z = true;
            }
            if (z) {
                if (!mo24297W7()) {
                    mo24303c8();
                }
            } else if (!mo24297W7()) {
                ScanProductMaskDecorView scanProductMaskDecorView = this.f53566g;
                if (scanProductMaskDecorView == null || !scanProductMaskDecorView.mo151816c()) {
                    if (this.f53522A == 12) {
                        mo24298X7(false);
                    }
                    mo24301a8();
                    mo24290P7();
                }
            }
        } else {
            this.f53576p.dismiss();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Log.m105925i("MicroMsg.ScanUI", "screen orientation %d", Integer.valueOf(configuration.orientation));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x04e0, code lost:
        if (r1.f154734d.f154735a != false) goto L_0x04e2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0372  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0404  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = ""
            super.onCreate(r25)
            r3 = 1
            r1.mo24289O7(r3)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            r4 = 6
            r5 = 4
            r6 = 0
            if (r0 == r4) goto L_0x0026
            ob0.b0 r0 = f40.C86709a0.m107524d()
            int r0 = r0.mo123467m()
            if (r0 != r5) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            r1.f53525D = r6
            goto L_0x0028
        L_0x0026:
            r1.f53525D = r3
        L_0x0028:
            java.lang.String r0 = "vibrator"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.os.Vibrator r0 = (android.os.Vibrator) r0
            r1.f53580s = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_support_scan_code_type"
            int[] r0 = r0.getIntArrayExtra(r7)
            r1.f53528G = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_scan_entry_scene"
            int r0 = r0.getIntExtra(r7, r6)
            r1.f53529H = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_scan_report_enter_scene"
            int r0 = r0.getIntExtra(r7, r6)
            r1.f53537Q = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "BaseScanUI_only_scan_qrcode_with_zbar"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53530I = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_set_result_after_scan"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53531J = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_is_hide_right_btn"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53532K = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "BaseScanUI_select_scan_mode"
            int r0 = r0.getIntExtra(r7, r3)
            r1.f53522A = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_show_scan_tips"
            boolean r0 = r0.getBooleanExtra(r7, r3)
            r1.f53524C = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_config_black_interval"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53527F = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_enable_multi_code"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53588y0 = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_enable_scan_code_product_merge"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53577p0 = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_scan_goods_enable_dynamic_wording"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53540R0 = r0
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_for_jsapi_use"
            boolean r0 = r0.getBooleanExtra(r7, r6)
            r1.f53536P = r0
            boolean r0 = r1.f53532K
            r1.f53533L = r0
            int r0 = r1.f53522A
            r7 = 12
            if (r0 != r7) goto L_0x00db
            r0 = 1
            goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            if (r0 == 0) goto L_0x00f2
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r7 = "key_scan_request"
            android.os.Parcelable r0 = r0.getParcelableExtra(r7)
            com.tencent.mm.plugin.scanner.api.BaseScanRequest r0 = (com.tencent.p014mm.plugin.scanner.api.BaseScanRequest) r0
            r1.f53535N = r0
            int r0 = com.tencent.p014mm.plugin.scanner.model.C19016e1.m20075h(r0)
            r1.f53578q = r0
        L_0x00f2:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r7 = r1.f53537Q
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r6] = r7
            int r7 = r1.f53529H
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r3] = r7
            boolean r7 = r1.f53588y0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 2
            r0[r8] = r7
            boolean r7 = r1.f53577p0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r9 = 3
            r0[r9] = r7
            int r7 = r1.f53522A
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r5] = r7
            r7 = 5
            boolean r10 = r1.f53531J
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0[r7] = r10
            java.lang.String r7 = "MicroMsg.ScanUI"
            java.lang.String r10 = "onCreate() enterScene:%d, scanEntryScene:%d, enableMultiCode:%b enableScanCodeProductMerge:%b  currentMode:%d  setResultAfterScan:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r10, r0)
            boolean r0 = vl2.C37764q.f100032d
            java.lang.String r10 = "MicroMsg.ScanProductSkipFrameManager"
            java.lang.String r11 = "scan_product_server_detect_frame_count"
            java.lang.String r12 = "scan_config_server_detect_frame_count"
            if (r0 != 0) goto L_0x014b
            boolean r0 = vl2.C37764q.f100031c
            if (r0 != 0) goto L_0x014b
            java.lang.String r0 = "not enable adjust skip frame"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r16 = r2
            r19 = r7
            goto L_0x02e5
        L_0x014b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = ss3.C36788a.f97694i
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = ss3.C36788a.f97694i
            java.lang.String r13 = "scan_code_last_frame_cost"
            if (r0 == 0) goto L_0x0159
            int r0 = r0.getInt(r13, r6)
            goto L_0x015a
        L_0x0159:
            r0 = 0
        L_0x015a:
            if (r0 > 0) goto L_0x0162
            r16 = r2
            r19 = r7
            goto L_0x02a7
        L_0x0162:
            r14 = 250(0xfa, float:3.5E-43)
            java.lang.String r15 = "scan_product_engine_detect_skip_frame_count"
            if (r0 < r14) goto L_0x0186
            int r14 = vl2.C37764q.f100034f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "computeEngineSkipFrame use minSkipFrame frameCost: "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            r16 = r2
            r19 = r7
            r3 = r10
            goto L_0x023a
        L_0x0186:
            double r4 = (double) r0
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r16 / r4
            double r4 = java.lang.Math.floor(r4)
            int r4 = (int) r4
            int r5 = r4 / 2
            int r14 = r0 * 2
            r19 = r7
            double r6 = (double) r14
            double r6 = r16 / r6
            r20 = r10
            double r9 = (double) r3
            double r6 = r6 - r9
            int r14 = r5 * r0
            r21 = r4
            double r3 = (double) r14
            double r16 = r16 / r3
            double r3 = r16 - r9
            double r9 = java.lang.Math.floor(r3)
            double r16 = java.lang.Math.ceil(r6)
            r22 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r9 = r9 + r16
            double r9 = r9 * r22
            r16 = r2
            double r1 = (double) r8
            double r9 = r9 / r1
            double r1 = java.lang.Math.floor(r9)
            int r1 = (int) r1
            int r2 = vl2.C37764q.f100033e
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = vl2.C37764q.f100034f
            int r1 = java.lang.Math.max(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "computeEngineSkipFrame frameCost: "
            r2.append(r9)
            r2.append(r0)
            java.lang.String r9 = ", scanCodeFrameCount: "
            r2.append(r9)
            r9 = r21
            r2.append(r9)
            java.lang.String r9 = ", maxScanProductFrameCount: "
            r2.append(r9)
            r2.append(r5)
            java.lang.String r5 = ", maxSkipFrame: "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = ", minSkipFrame: "
            r2.append(r5)
            r2.append(r3)
            java.lang.String r3 = ", skipFrame: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = vl2.C37764q.f100030b
            r4 = 0
            if (r2 == 0) goto L_0x0218
            int r18 = r2.getInt(r15, r4)
            r2 = r18
            goto L_0x0219
        L_0x0218:
            r2 = 0
        L_0x0219:
            if (r2 == 0) goto L_0x0239
            int r5 = r1 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r5 < r8) goto L_0x0239
            java.lang.Object[] r5 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r4] = r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6 = 1
            r5[r6] = r4
            java.lang.String r4 = "computeEngineSkipFrame current: %d, last: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r5)
            int r1 = r1 + r2
            int r1 = r1 / r8
        L_0x0239:
            r14 = r1
        L_0x023a:
            int r1 = vl2.C37764q.f100037i
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            int r4 = r14 + 1
            int r0 = r0 * r4
            float r0 = (float) r0
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            int r1 = vl2.C37764q.f100035g
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = vl2.C37764q.f100036h
            int r0 = java.lang.Math.max(r0, r1)
            com.tencent.mm.plugin.scanner.model.i0 r1 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53455a
            int r1 = cl2.C28609a.f78506f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53459e
            if (r4 == 0) goto L_0x0266
            int r1 = r4.getInt(r12, r1)
        L_0x0266:
            float r0 = (float) r0
            float r0 = r0 * r2
            float r1 = (float) r1
            float r0 = r0 * r1
            r1 = 20
            float r1 = (float) r1
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r0 = (float) r0
            int r0 = (int) r0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = vl2.C37764q.f100030b
            if (r1 == 0) goto L_0x028a
            android.content.SharedPreferences$Editor r1 = r1.putInt(r15, r14)
            if (r1 == 0) goto L_0x028a
            android.content.SharedPreferences$Editor r1 = r1.putInt(r11, r0)
            if (r1 == 0) goto L_0x028a
            r1.apply()
        L_0x028a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateSkipFrame engineDetectSkipFrame: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = ", serverDetectFrame: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x02a7:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = ss3.C36788a.f97694i
            r1 = 0
            if (r0 == 0) goto L_0x02b1
            int r18 = r0.getInt(r13, r1)
            goto L_0x02b3
        L_0x02b1:
            r18 = 0
        L_0x02b3:
            int r0 = vl2.C37764q.m41536a()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = ss3.C36788a.f97694i
            if (r2 == 0) goto L_0x02c3
            java.lang.String r3 = "scan_code_decode_cost"
            int r2 = r2.getInt(r3, r1)
            goto L_0x02c4
        L_0x02c3:
            r2 = 0
        L_0x02c4:
            if (r18 <= 0) goto L_0x02e5
            if (r2 <= 0) goto L_0x02e5
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 24741(0x60a5, float:3.467E-41)
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r6[r1] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r6[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6[r8] = r0
            r3.mo160131h(r4, r6)
        L_0x02e5:
            int r0 = qs3.C36079a.f96165a
            java.lang.String r1 = "MicroMsg.QBarAIModHelper"
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r0)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_scan_code_black_list_delay_frames
            r4 = 6
            int r2 = r2.mo58779Qe(r3, r4)
            if (r2 <= 0) goto L_0x02fc
            qs3.C36079a.f96165a = r2
        L_0x02fc:
            java.util.List<java.lang.String> r3 = qs3.C36079a.f96167c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.util.List<java.lang.String> r3 = qs3.C36079a.f96167c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.String r4 = "https://qr.alipay.com/"
            r3.add(r4)
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x035a }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x035a }
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_scan_code_black_list     // Catch:{ Exception -> 0x035a }
            r4 = r16
            java.lang.String r0 = r0.Y60(r3, r4)     // Catch:{ Exception -> 0x0358 }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0358 }
            if (r3 != 0) goto L_0x032e
            java.lang.String r3 = ";"
            java.lang.String[] r3 = r0.split(r3)     // Catch:{ Exception -> 0x0358 }
            int r5 = r3.length     // Catch:{ Exception -> 0x0358 }
            if (r5 <= 0) goto L_0x032e
            java.util.List<java.lang.String> r5 = qs3.C36079a.f96167c     // Catch:{ Exception -> 0x0358 }
            java.util.Collections.addAll(r5, r3)     // Catch:{ Exception -> 0x0358 }
        L_0x032e:
            java.lang.String r3 = "alvinluo updateBlackList config: %d, blackListDelayFrames: %d, blackListConfigValue: %s, blackListSize: %d"
            r5 = 4
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0358 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0358 }
            r5 = 0
            r6[r5] = r2     // Catch:{ Exception -> 0x0358 }
            int r2 = qs3.C36079a.f96165a     // Catch:{ Exception -> 0x0358 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0358 }
            r5 = 1
            r6[r5] = r2     // Catch:{ Exception -> 0x0358 }
            r6[r8] = r0     // Catch:{ Exception -> 0x0358 }
            java.util.List<java.lang.String> r0 = qs3.C36079a.f96167c     // Catch:{ Exception -> 0x0358 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x0358 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0358 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0358 }
            r2 = 3
            r6[r2] = r0     // Catch:{ Exception -> 0x0358 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r6)     // Catch:{ Exception -> 0x0358 }
            goto L_0x0365
        L_0x0358:
            r0 = move-exception
            goto L_0x035d
        L_0x035a:
            r0 = move-exception
            r4 = r16
        L_0x035d:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "alvinluo updateBlackList exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
        L_0x0365:
            com.tencent.qbar.C19936d.m21744i()
            vl2.C37751c0.m41526f()
            vl2.C37751c0.m41525e()
            java.lang.Boolean r0 = vl2.C37751c0.f99996b
            if (r0 != 0) goto L_0x0375
            vl2.C37751c0.m41525e()
        L_0x0375:
            java.lang.Boolean r0 = vl2.C37751c0.f99996b
            boolean r0 = r0.booleanValue()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            r1[r3] = r2
            r2 = r24
            boolean r3 = r2.f53588y0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r5 = 1
            r1[r5] = r3
            java.lang.String r3 = "alvinluo initEnableMultiCode configEnableMultiCode: %b, entryEnableMultiCode: %b"
            r5 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r1)
            if (r0 == 0) goto L_0x039e
            boolean r1 = r2.f53588y0
            if (r1 == 0) goto L_0x039e
            r1 = 1
            goto L_0x039f
        L_0x039e:
            r1 = 0
        L_0x039f:
            r2.f53588y0 = r1
            com.tencent.qbar.f r3 = com.tencent.qbar.C19938f.f56890w
            if (r0 == 0) goto L_0x03a9
            if (r1 == 0) goto L_0x03a9
            r0 = 1
            goto L_0x03aa
        L_0x03a9:
            r0 = 0
        L_0x03aa:
            r3.f56892b = r0
            com.tencent.qbar.e r1 = r3.f56903m
            com.tencent.qbar.a r1 = r1.f59752b
            com.tencent.qbar.d r1 = (com.tencent.qbar.C19936d) r1
            r1.getClass()
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r7 = 0
            r6[r7] = r3
            java.lang.String r3 = "MicroMsg.WxQBar"
            java.lang.String r7 = "setEnableMultiCode: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            r1.f56888e = r0
            cl2.C28609a.m38282b()
            boolean r0 = cl2.C28609a.f78503c
            if (r0 == 0) goto L_0x03d6
            boolean r1 = r2.f53577p0
            if (r1 == 0) goto L_0x03d6
            r1 = 1
            goto L_0x03d7
        L_0x03d6:
            r1 = 0
        L_0x03d7:
            vl2.n r3 = vl2.C14900n.f40927a
            r3.mo13962a()
            boolean r3 = vl2.C14900n.f40930d
            r2.f53555Z = r3
            r3 = 3
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            r6[r3] = r0
            boolean r0 = r2.f53577p0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 1
            r6[r3] = r0
            boolean r0 = r2.f53555Z
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6[r8] = r0
            java.lang.String r0 = "initEnableScanCodeProductMerge configEnableScanMerge: %b, enableScanCodeProductMerge: %b, willCrash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)
            r2.f53577p0 = r1
            if (r1 == 0) goto L_0x0468
            r24.mo24313n8()
            com.tencent.mm.plugin.scanner.model.z0 r0 = new com.tencent.mm.plugin.scanner.model.z0
            r0.<init>(r2)
            r2.f53554Y0 = r0
            dl2.e r0 = dl2.C20469e.f57530v
            r0.getClass()
            dl2.e$c r3 = new dl2.e$c
            r3.<init>(r0)
            r0.f57536d = r3
            r3 = 1
            r0.f57537e = r3
            int r0 = vl2.C37764q.m41536a()
            dl2.C20469e.f57529u = r0
            com.tencent.p014mm.plugin.scanner.model.C85412x.f248925b = r3
            boolean r0 = vl2.C37756o.m41529a()
            if (r0 == 0) goto L_0x046b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            int r3 = vl2.C37764q.m41536a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 0
            r0[r6] = r3
            com.tencent.mm.plugin.scanner.model.i0 r3 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53455a
            int r3 = cl2.C28609a.f78506f
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = com.tencent.p014mm.plugin.scanner.model.C19021i0.f53459e
            if (r6 == 0) goto L_0x0444
            int r3 = r6.getInt(r12, r3)
        L_0x0444:
            boolean r6 = vl2.C37764q.f100031c
            if (r6 != 0) goto L_0x0449
            goto L_0x0451
        L_0x0449:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = vl2.C37764q.f100030b
            if (r6 == 0) goto L_0x0451
            int r3 = r6.getInt(r11, r3)
        L_0x0451:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 1
            r0[r6] = r3
            java.lang.String r3 = "引擎识别跳帧数：%s，后台识别帧数：%s"
            java.lang.String r0 = java.lang.String.format(r3, r0)
            r3 = 0
            android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r2, (java.lang.CharSequence) r0, (int) r3)
            r0.show()
            goto L_0x046b
        L_0x0468:
            r3 = 0
            com.tencent.p014mm.plugin.scanner.model.C85412x.f248925b = r3
        L_0x046b:
            if (r1 == 0) goto L_0x0476
            boolean r0 = r2.f53555Z
            if (r0 == 0) goto L_0x0476
            r0 = 0
            r1 = 4
            com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r1, r0)
        L_0x0476:
            r24.mo24288N7()
            android.content.Intent r0 = r24.getIntent()
            java.lang.String r1 = "key_check_camera_using"
            r3 = 0
            boolean r0 = r0.getBooleanExtra(r1, r3)
            if (r0 == 0) goto L_0x04ea
            com.tencent.mm.plugin.scanner.ui.BaseScanUI$13 r0 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI$13
            r0.<init>()
            r1 = 1
            boolean r3 = p182kk.C61104a.m71652h(r2, r1, r0)
            if (r3 != 0) goto L_0x04e2
            boolean r1 = p182kk.C61104a.m71666v(r2, r0)
            if (r1 != 0) goto L_0x04e2
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent r1 = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent
            r1.<init>()
            r1.publish()
            java.lang.Object[] r3 = new java.lang.Object[r8]
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a r6 = r1.f154734d
            boolean r6 = r6.f154736b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 0
            r3[r7] = r6
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a r6 = r1.f154734d
            boolean r6 = r6.f154735a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 1
            r3[r7] = r6
            java.lang.String r6 = "MicroMsg.DeviceOccupy"
            java.lang.String r7 = "checkAppBrandCameraUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a r3 = r1.f154734d
            boolean r3 = r3.f154735a
            if (r3 == 0) goto L_0x04dc
            java.lang.String r3 = "app brand voip camera using"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a r3 = r1.f154734d
            boolean r3 = r3.f154735a
            java.lang.String r3 = p182kk.C61104a.m71643C(r2, r3)
            r6 = 2131821556(0x7f1103f4, float:1.9275859E38)
            java.lang.String r6 = r2.getString(r6)
            nj3.C76879j.m92754y(r2, r4, r3, r6, r0)
        L_0x04dc:
            com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent$a r0 = r1.f154734d
            boolean r0 = r0.f154735a
            if (r0 == 0) goto L_0x04ea
        L_0x04e2:
            java.lang.String r0 = "checkCameraUsing camera is using and disable camera"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r1 = 0
            r2.f53542S0 = r1
        L_0x04ea:
            r24.initView()
            long r0 = java.lang.System.currentTimeMillis()
            r2.f53589z = r0
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent> r0 = r2.f53573j1
            r0.alive()
            java.lang.Class<s00.f> r0 = s00.C90110f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            s00.f r0 = (s00.C90110f) r0
            r0.mo124152cj()
            boolean r0 = r2.f53577p0
            com.tencent.mm.plugin.scanner.model.e1 r1 = com.tencent.p014mm.plugin.scanner.model.C19016e1.f53424a
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            com.tencent.p014mm.plugin.scanner.model.C19016e1.f53425b = r1
            com.tencent.p014mm.plugin.scanner.model.C19016e1.f53431h = r0
            r1 = 1
            r2.mo24300Z7(r1)
            java.lang.Class<ox.b> r0 = p640ox.C77049b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ox.b r0 = (p640ox.C77049b) r0
            java.lang.Class<te3.um2> r3 = te3.C51567um2.class
            r4 = 3
            pe3.a r0 = r0.mo72358wi(r2, r1, r4, r3)
            te3.um2 r0 = (te3.C51567um2) r0
            if (r0 == 0) goto L_0x0548
            java.lang.String r0 = r0.f142940d
            java.lang.String r1 = "launch_type_scan_qrcode"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0548
            com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WC3DTouchHomeShortCutStruct
            r0.<init>()
            r3 = 2
            r0.f10090d = r3
            r3 = 1
            r0.f10091e = r3
            r0.mo86054n()
            r0.mo86056r()
        L_0x0548:
            boolean r0 = r2.f53577p0
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "MicroMsg.ScanCrashManager"
            java.lang.String r4 = "enterScanUI %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r3)
            boolean r3 = vl2.C14900n.f40930d
            if (r3 == 0) goto L_0x05f5
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = vl2.C14900n.f40929c
            r4 = 0
            if (r3 == 0) goto L_0x056b
            java.lang.String r6 = "key_will_crash_time_limit"
            long r4 = r3.getLong(r6, r4)
        L_0x056b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = vl2.C14900n.f40929c
            java.lang.String r6 = "key_has_report_crash_limit"
            if (r3 == 0) goto L_0x0577
            r7 = 0
            boolean r3 = r3.getBoolean(r6, r7)
            goto L_0x0578
        L_0x0577:
            r3 = 0
        L_0x0578:
            if (r3 != 0) goto L_0x05f5
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            r3 = 26691(0x6843, float:3.7402E-41)
            r7 = 1259(0x4eb, float:1.764E-42)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x05af
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = vl2.C14900n.f40929c
            r10 = 1
            if (r9 == 0) goto L_0x0593
            android.content.SharedPreferences$Editor r6 = r9.putBoolean(r6, r10)
            if (r6 == 0) goto L_0x0593
            r6.apply()
        L_0x0593:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 230(0xe6, float:3.22E-43)
            r6.mo175911u(r7, r9)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r9 = 0
            r7[r9] = r8
            long r8 = vl2.C14900n.f40932f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7[r10] = r8
            r6.mo160131h(r3, r7)
            goto L_0x05e0
        L_0x05af:
            r10 = 1
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x05e0
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = vl2.C14900n.f40929c
            if (r9 == 0) goto L_0x05c4
            android.content.SharedPreferences$Editor r6 = r9.putBoolean(r6, r10)
            if (r6 == 0) goto L_0x05c4
            r6.apply()
        L_0x05c4:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 231(0xe7, float:3.24E-43)
            r6.mo175911u(r7, r9)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 0
            r7[r9] = r8
            long r8 = vl2.C14900n.f40932f
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r7[r9] = r8
            r6.mo160131h(r3, r7)
        L_0x05e0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "reportWillCrashWhenEnter crashTimeLimit: "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
        L_0x05f5:
            if (r0 != 0) goto L_0x05fe
            java.lang.String r0 = "enterScanUI not enableScanCodeProductMerge and ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x05fc:
            r1 = 0
            goto L_0x0627
        L_0x05fe:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = vl2.C14900n.f40929c
            if (r0 == 0) goto L_0x0608
            java.lang.String r1 = "key_last_enter_will_crash"
            r3 = 1
            r0.putBoolean(r1, r3)
        L_0x0608:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = vl2.C14900n.f40929c
            if (r0 == 0) goto L_0x061b
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "key_last_enter"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r3)
            if (r0 == 0) goto L_0x061b
            r0.apply()
        L_0x061b:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = vl2.C14900n.f40929c
            if (r0 == 0) goto L_0x05fc
            int r1 = qe3.C89625d.f257841g
            java.lang.String r3 = "key_client_version"
            r0.putInt(r3, r1)
            goto L_0x05fc
        L_0x0627:
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53473s = r1
            com.tencent.p014mm.plugin.scanner.model.C19021i0.f53474t = r1
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            o31.b r1 = o31.C11345b.BaseScanUI
            l31.e r0 = r0.mo86178qr(r2, r1)
            o31.a r1 = o31.C76986a.Scan
            r0.mo86179qs(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        SharedPreferences.Editor putBoolean;
        SharedPreferences.Editor remove;
        Log.m105924i("MicroMsg.ScanUI", "onDestroy()");
        super.onDestroy();
        C14900n nVar = C14900n.f40927a;
        Log.m105924i("MicroMsg.ScanCrashManager", "exitScanUI");
        MultiProcessMMKV multiProcessMMKV = C14900n.f40929c;
        if (!(multiProcessMMKV == null || (putBoolean = multiProcessMMKV.putBoolean("key_last_enter_will_crash", false)) == null || (remove = putBoolean.remove("key_last_enter")) == null)) {
            remove.apply();
        }
        this.f53573j1.dead();
        C10931f fVar = this.f53579r;
        if (fVar != null) {
            fVar.destroy();
        }
        ScanUIRectView scanUIRectView = this.f53562e;
        if (scanUIRectView != null) {
            scanUIRectView.mo24385n();
        }
        C52958x xVar = this.f53576p;
        if (xVar != null && xVar.mo73697E()) {
            this.f53576p.dismiss();
        }
        C77407n nVar2 = this.f53575o;
        if (nVar2 != null && nVar2.mo107563h()) {
            this.f53575o.mo107572p();
        }
        mo24300Z7(2);
        C85412x.f248925b = false;
    }

    public void onPause() {
        BaseBoxDialogView baseBoxDialogView;
        super.onPause();
        Log.m105925i("MicroMsg.ScanUI", "onPause() needPauseScan: %b", Boolean.valueOf(this.f53539R));
        C103928o.m138642b();
        ScanUIRectView scanUIRectView = this.f53562e;
        if (scanUIRectView != null) {
            scanUIRectView.mo24372e();
            if (this.f53539R) {
                this.f53562e.mo24381j();
            }
        }
        if (this.f53549W.f48690d == 0) {
            mo24299Y7(false, false);
        }
        C19933b.f56833H.mo27309b();
        C22126b.f62576D.mo35209c();
        C103928o.m138642b();
        C52958x xVar = this.f53576p;
        if (xVar != null && (baseBoxDialogView = xVar.f147817s) != null) {
            Log.m105924i("MicroMsg.BaseBoxDialogView", "alvinluo onPause set canMeasured false");
            baseBoxDialogView.f315734J = false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log.m105925i("MicroMsg.ScanUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults len[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr.length), Long.valueOf(Thread.currentThread().getId()));
        if (i != 16) {
            if (i != 26) {
                if (i == 76 && iArr.length > 0 && iArr[0] == -1) {
                    this.f53585x = false;
                    C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(BaseScanUI.this.getContext());
                            BaseScanUI baseScanUI = BaseScanUI.this;
                            baseScanUI.f53585x = true;
                            baseScanUI.finish();
                        }
                    }, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            BaseScanUI baseScanUI = BaseScanUI.this;
                            baseScanUI.f53585x = true;
                            baseScanUI.finish();
                        }
                    });
                }
            } else if (iArr.length <= 0 || iArr[0] != -1) {
                ((C60606n) C86312j.m106911c(C60606n.class)).mo85027Qo(this, new BaseScanUI$$c(this), true);
            } else if (!C90111a.m112742f(this, "android.permission.RECORD_AUDIO")) {
                C76879j.m92750u(this, getString(C0966R.string.a3b), getString(C0966R.string.a0x), new BaseScanUI$$a(this), new BaseScanUI$$b(this));
            } else {
                finish();
            }
        } else if (iArr.length > 0 && iArr[0] == -1) {
            this.f53584w = false;
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(BaseScanUI.this.getContext());
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    baseScanUI.f53584w = true;
                    baseScanUI.finish();
                }
            }, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    BaseScanUI baseScanUI = BaseScanUI.this;
                    baseScanUI.f53584w = true;
                    baseScanUI.finish();
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        if (r1 == false) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r11 = this;
            super.onResume()
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r11.f53539R
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.ScanUI"
            java.lang.String r4 = "onResume() needPauseScan: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            aw0.C103928o.m138641a(r0, r0, r0)
            java.lang.Class<aw.d> r1 = p447aw.C103918d.class
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            boolean r5 = r11.f53584w
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r3] = r5
            boolean r5 = r11.f53585x
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r0] = r5
            java.lang.String r5 = "should check camera %s, location %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            boolean r4 = r11.f53584w
            if (r4 != 0) goto L_0x003d
            boolean r5 = r11.f53585x
            if (r5 == 0) goto L_0x0092
        L_0x003d:
            if (r4 == 0) goto L_0x006a
            di3.d r4 = di3.C86312j.m106911c(r1)
            r5 = r4
            aw.d r5 = (p447aw.C103918d) r5
            r8 = 16
            r9 = 0
            r10 = 0
            java.lang.String r7 = "android.permission.CAMERA"
            r6 = r11
            boolean r4 = r5.mo125788z1(r6, r7, r8, r9, r10)
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView r5 = r11.f53562e
            if (r5 == 0) goto L_0x0057
            r5.f53689R = r4
        L_0x0057:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r5[r3] = r6
            java.lang.String r6 = "summerper checkPermission checkCamera[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            if (r4 != 0) goto L_0x006a
            r11.f53587y = r3
            goto L_0x0090
        L_0x006a:
            boolean r4 = r11.f53585x
            if (r4 == 0) goto L_0x0092
            di3.d r1 = di3.C86312j.m106911c(r1)
            r4 = r1
            aw.d r4 = (p447aw.C103918d) r4
            r7 = 76
            r8 = 0
            r9 = 0
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            r5 = r11
            boolean r1 = r4.mo125788z1(r5, r6, r7, r8, r9)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r4[r3] = r5
            java.lang.String r5 = "summerper checkPermission checkLocation [%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r4)
            if (r1 != 0) goto L_0x0092
        L_0x0090:
            r1 = 0
            goto L_0x0093
        L_0x0092:
            r1 = 1
        L_0x0093:
            if (r1 == 0) goto L_0x010d
            boolean r1 = r11.f53587y
            com.tencent.mm.plugin.scanner.model.e1 r4 = com.tencent.p014mm.plugin.scanner.model.C19016e1.f53424a
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            r4[r3] = r5
            java.lang.String r5 = "MicroMsg.ScanReporter"
            java.lang.String r6 = "alvinluo setCameraPermission: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            com.tencent.p014mm.plugin.scanner.model.C19016e1.f53430g = r1
            boolean r1 = p903ij.C76359b.m91785b()
            if (r1 != 0) goto L_0x00dc
            r1 = 2131833941(0x7f113455, float:1.9300978E38)
            java.lang.String r3 = r11.getString(r1)
            r1 = 2131833973(0x7f113475, float:1.9301043E38)
            java.lang.String r4 = r11.getString(r1)
            r1 = 2131831713(0x7f112ba1, float:1.929646E38)
            java.lang.String r5 = r11.getString(r1)
            r1 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r6 = r11.getString(r1)
            r7 = 0
            com.tencent.mm.plugin.scanner.ui.BaseScanUI$31 r8 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI$31
            r8.<init>()
            com.tencent.mm.plugin.scanner.ui.BaseScanUI$32 r9 = new com.tencent.mm.plugin.scanner.ui.BaseScanUI$32
            r9.<init>()
            r2 = r11
            nj3.C76879j.m92709C(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x010d
        L_0x00dc:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r4 = r11.f53539R
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r4
            java.lang.String r3 = "alvinluo onResumeAfterChkPermission needPauseScan: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            boolean r1 = r11.f53539R
            if (r1 != 0) goto L_0x00fc
            com.tencent.mm.plugin.scanner.ui.ScanUIRectView r1 = r11.f53562e
            r1.mo24373f()
            com.tencent.mm.plugin.scanner.ui.component.ScanUITopOpButtonComponent r1 = r11.f53574n
            r1.mo151659a(r0)
            r11.mo24307g8(r0)
        L_0x00fc:
            f40.g r1 = f40.C86709a0.m107529k()
            com.tencent.mm.network.q r2 = r11.f53569h1
            r1.mo121126a(r2)
            r11.mo24313n8()
            com.tencent.mm.sdk.event.IListener r1 = r11.f53571i1
            r1.alive()
        L_0x010d:
            android.view.Window r1 = r11.getWindow()
            r2 = 128(0x80, float:1.794E-43)
            r1.addFlags(r2)
            vk2.x r1 = r11.f53576p
            if (r1 == 0) goto L_0x0120
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r1 = r1.f147817s
            if (r1 == 0) goto L_0x0120
            r1.f315734J = r0
        L_0x0120:
            com.tencent.mm.autogen.events.FinderLivePauseActionEvent r1 = new com.tencent.mm.autogen.events.FinderLivePauseActionEvent
            r1.<init>()
            com.tencent.mm.autogen.events.FinderLivePauseActionEvent$a r2 = r1.f154776d
            r2.f154778a = r0
            r1.publish()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "useXNet: "
            r0.append(r1)
            boolean r1 = cl2.C28609a.m38281a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "text"
            gy3.C87412m.m108594g(r0, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r1 == 0) goto L_0x014f
            nj3.C76912y0.m92773l(r11, r0)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.p101ui.BaseScanUI.onResume():void");
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.ScanUI", "onStart()");
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.ScanUI", "onStop()");
        ScanUIRectView scanUIRectView = this.f53562e;
        if (scanUIRectView != null) {
            scanUIRectView.mo24393s();
        }
        this.f53564f.mo24459a();
        C86709a0.m107529k().mo121129d(this.f53569h1);
        this.f53571i1.dead();
        getWindow().clearFlags(128);
        FinderLivePauseActionEvent finderLivePauseActionEvent = new FinderLivePauseActionEvent();
        finderLivePauseActionEvent.f154776d.f154778a = false;
        finderLivePauseActionEvent.publish();
        if (finderLivePauseActionEvent.f154777e.f154779a) {
            finish();
        }
    }

    /* renamed from: q */
    public void mo6125q() {
        Log.m105924i("MicroMsg.ScanUI", "finishUI");
        finish();
        overridePendingTransition(0, 0);
    }
}
