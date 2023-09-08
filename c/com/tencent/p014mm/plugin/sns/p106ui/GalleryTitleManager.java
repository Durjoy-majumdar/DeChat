package com.tencent.p014mm.plugin.sns.p106ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import av2.C92118i;
import av2.C92121j;
import av2.C92125p;
import av2.C92126r;
import c00.C0405n;
import c00.C92330r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.data.SnsCmdList;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import mt2.C47101a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100417r0;
import p200lx.C46896e0;
import p200lx.C46900z;
import p823sg.C90193h;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C101804kv2;
import u73.C101980n;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.GalleryTitleManager */
public class GalleryTitleManager implements C11385n {

    /* renamed from: A */
    public ArrayList<Integer> f276833A = new ArrayList<>();

    /* renamed from: B */
    public IListener f276834B;

    /* renamed from: C */
    public IListener<RecogQBarOfImageFileFailedEvent> f276835C;

    /* renamed from: D */
    public IListener f276836D;

    /* renamed from: d */
    public final Context f276837d;

    /* renamed from: e */
    public SnsCmdList f276838e = new SnsCmdList();

    /* renamed from: f */
    public C89779i0 f276839f = null;

    /* renamed from: g */
    public final C95343c f276840g;

    /* renamed from: h */
    public C92126r f276841h = null;

    /* renamed from: i */
    public String f276842i;

    /* renamed from: j */
    public boolean f276843j;

    /* renamed from: n */
    public SnsInfo f276844n;

    /* renamed from: o */
    public String f276845o;

    /* renamed from: p */
    public C101804kv2 f276846p;

    /* renamed from: q */
    public long f276847q;

    /* renamed from: r */
    public boolean f276848r = false;

    /* renamed from: s */
    public boolean f276849s = false;

    /* renamed from: t */
    public boolean f276850t = false;

    /* renamed from: u */
    public int f276851u;

    /* renamed from: v */
    public ArrayList<ImageQBarDataBean> f276852v = new ArrayList<>();

    /* renamed from: w */
    public ImageQBarDataBean f276853w = null;

    /* renamed from: x */
    public C46900z f276854x;

    /* renamed from: y */
    public FlipView$$n f276855y;

    /* renamed from: z */
    public ArrayList<Integer> f276856z = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$a */
    public class C95341a implements C46900z.C46901a {
        public C95341a() {
        }

        /* renamed from: a */
        public void mo64788a() {
            SnsMethodCalculate.markStartTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$1");
            if (GalleryTitleManager.m121496a(GalleryTitleManager.this) != null && GalleryTitleManager.m121496a(GalleryTitleManager.this).mo126104g()) {
                GalleryTitleManager galleryTitleManager = GalleryTitleManager.this;
                SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                galleryTitleManager.f276850t = true;
                SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                GalleryTitleManager galleryTitleManager2 = GalleryTitleManager.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                boolean z = galleryTitleManager2.f276843j;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                GalleryTitleManager galleryTitleManager3 = GalleryTitleManager.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                SnsInfo snsInfo = galleryTitleManager3.f276844n;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                GalleryTitleManager galleryTitleManager4 = GalleryTitleManager.this;
                SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                C101804kv2 kv22 = galleryTitleManager4.f276846p;
                SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                SnsMethodCalculate.markStartTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                galleryTitleManager2.mo132176k(z, snsInfo, kv22, galleryTitleManager2.f276848r, galleryTitleManager2.f276849s, false, 0);
                SnsMethodCalculate.markEndTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            }
            SnsMethodCalculate.markEndTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$b */
    public class C95342b implements DialogInterface.OnCancelListener {
        public C95342b(C94877g0 g0Var) {
        }

        public void onCancel(DialogInterface dialogInterface) {
            SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$7");
            GalleryTitleManager.this.getClass();
            SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$c */
    public interface C95343c {
        /* renamed from: m1 */
        void mo132030m1(String str, int i);

        /* renamed from: o2 */
        void mo132031o2(boolean z, String str, int i);

        /* renamed from: p7 */
        void mo132178p7(String str, String str2);

        /* renamed from: s */
        void mo132179s(String str, List<ImageQBarDataBean> list);

        /* renamed from: v4 */
        void mo132180v4();
    }

    public GalleryTitleManager(Context context, C95343c cVar, int i) {
        C40008f fVar = C40008f.f107254d;
        this.f276834B = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                if (GalleryTitleManager.m121496a(GalleryTitleManager.this) == null || GalleryTitleManager.m121497b(GalleryTitleManager.this) == null) {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                } else if (recogQBarOfImageFileResultEvent == null) {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "receive invalid callbak");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                } else if (!recogQBarOfImageFileResultEvent.f265015d.f265016a.equals(GalleryTitleManager.m121497b(GalleryTitleManager.this))) {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                } else {
                    GalleryTitleManager galleryTitleManager = GalleryTitleManager.this;
                    ArrayList<ImageQBarDataBean> a = C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent);
                    SnsMethodCalculate.markStartTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    galleryTitleManager.f276852v = a;
                    SnsMethodCalculate.markEndTimeMs("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    Log.m105924i("MicroMsg.GalleryTitleManager", "recog result: " + GalleryTitleManager.m121499d(GalleryTitleManager.this).size());
                    GalleryTitleManager galleryTitleManager2 = GalleryTitleManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    C95343c cVar = galleryTitleManager2.f276840g;
                    SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    cVar.mo132179s(GalleryTitleManager.m121497b(GalleryTitleManager.this), GalleryTitleManager.m121499d(GalleryTitleManager.this));
                    if (!Util.isNullOrNil((List) GalleryTitleManager.m121499d(GalleryTitleManager.this))) {
                        GalleryTitleManager galleryTitleManager3 = GalleryTitleManager.this;
                        SnsMethodCalculate.markStartTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        galleryTitleManager3.f276853w = (ImageQBarDataBean) GalleryTitleManager.m121499d(galleryTitleManager3).get(0);
                        SnsMethodCalculate.markEndTimeMs("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        if (!(GalleryTitleManager.m121498c(GalleryTitleManager.this) == null || GalleryTitleManager.m121496a(GalleryTitleManager.this) == null)) {
                            GalleryTitleManager galleryTitleManager4 = GalleryTitleManager.this;
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            galleryTitleManager4.f276850t = true;
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            ((ScanCodeSheetItemLogic) GalleryTitleManager.m121496a(GalleryTitleManager.this).mo126102e()).mo67077h(GalleryTitleManager.m121498c(GalleryTitleManager.this).f273114e, GalleryTitleManager.m121498c(GalleryTitleManager.this).f273113d);
                        }
                        GalleryTitleManager galleryTitleManager5 = GalleryTitleManager.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        boolean z = galleryTitleManager5.f276843j;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        GalleryTitleManager galleryTitleManager6 = GalleryTitleManager.this;
                        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        SnsInfo snsInfo = galleryTitleManager6.f276844n;
                        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        GalleryTitleManager galleryTitleManager7 = GalleryTitleManager.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        C101804kv2 kv22 = galleryTitleManager7.f276846p;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        SnsMethodCalculate.markStartTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        galleryTitleManager5.mo132176k(z, snsInfo, kv22, galleryTitleManager5.f276848r, galleryTitleManager5.f276849s, false, 0);
                        SnsMethodCalculate.markEndTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    }
                    GalleryTitleManager galleryTitleManager8 = GalleryTitleManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    galleryTitleManager8.f276842i = null;
                    SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$10");
                return false;
            }
        };
        this.f276835C = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
            {
                this.__eventId = 1700407223;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                if (GalleryTitleManager.m121496a(GalleryTitleManager.this) == null || GalleryTitleManager.m121497b(GalleryTitleManager.this) == null) {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else if (!recogQBarOfImageFileFailedEvent.f107738d.f107739a.equals(GalleryTitleManager.m121497b(GalleryTitleManager.this))) {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else {
                    GalleryTitleManager galleryTitleManager = GalleryTitleManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    C95343c cVar = galleryTitleManager.f276840g;
                    SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    cVar.mo132179s(GalleryTitleManager.m121497b(GalleryTitleManager.this), (List<ImageQBarDataBean>) null);
                    GalleryTitleManager galleryTitleManager2 = GalleryTitleManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    galleryTitleManager2.f276842i = null;
                    SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                return false;
            }
        };
        this.f276836D = new IListener<NotifyDealQBarStrResultEvent>(fVar) {
            {
                this.__eventId = 1280295539;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                if (notifyDealQBarStrResultEvent != null) {
                    Log.m105925i("MicroMsg.GalleryTitleManager", "notify Event: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
                    Activity activity = notifyDealQBarStrResultEvent.f264935d.f264937b;
                    GalleryTitleManager galleryTitleManager = GalleryTitleManager.this;
                    SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    Context context = galleryTitleManager.f276837d;
                    SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    if (activity != ((Activity) context) || GalleryTitleManager.m121498c(GalleryTitleManager.this) == null || !notifyDealQBarStrResultEvent.f264935d.f264936a.equals(GalleryTitleManager.m121498c(GalleryTitleManager.this).f273113d)) {
                        Log.m105920e("MicroMsg.GalleryTitleManager", "not the same");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                    } else {
                        int i = notifyDealQBarStrResultEvent.f264935d.f264938c;
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                    }
                } else {
                    Log.m105920e("MicroMsg.GalleryTitleManager", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                return false;
            }
        };
        this.f276837d = context;
        this.f276851u = i;
        this.f276840g = cVar;
        ((Activity) context).getIntent().getStringExtra("sns_gallery_pre_title");
        this.f276854x = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(context, new C95341a());
    }

    /* renamed from: a */
    public static /* synthetic */ C92126r m121496a(GalleryTitleManager galleryTitleManager) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        C92126r rVar = galleryTitleManager.f276841h;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return rVar;
    }

    /* renamed from: b */
    public static /* synthetic */ String m121497b(GalleryTitleManager galleryTitleManager) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        String str = galleryTitleManager.f276842i;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return str;
    }

    /* renamed from: c */
    public static /* synthetic */ ImageQBarDataBean m121498c(GalleryTitleManager galleryTitleManager) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        ImageQBarDataBean imageQBarDataBean = galleryTitleManager.f276853w;
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return imageQBarDataBean;
    }

    /* renamed from: d */
    public static /* synthetic */ ArrayList m121499d(GalleryTitleManager galleryTitleManager) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        ArrayList<ImageQBarDataBean> arrayList = galleryTitleManager.f276852v;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return arrayList;
    }

    /* renamed from: e */
    public static /* synthetic */ FlipView$$n m121500e(GalleryTitleManager galleryTitleManager) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        FlipView$$n flipView$$n = galleryTitleManager.f276855y;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return flipView$$n;
    }

    /* renamed from: f */
    public void mo132171f() {
        SnsMethodCalculate.markStartTimeMs("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        Intent intent = new Intent();
        intent.putExtra("sns_cmd_list", mo132173h());
        ((Activity) this.f276837d).setResult(-1, intent);
        ((Activity) this.f276837d).finish();
        SnsMethodCalculate.markEndTimeMs("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    /* renamed from: g */
    public void mo132172g(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (snsInfo.isWaitPost() || snsInfo.isDieItem()) {
            C94866e1.Yx0().mo139814bD(snsInfo.localid);
            mo132173h().mo130689a(snsInfo.localid);
            SnsMethodCalculate.markEndTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        C94866e1.Rx0().mo130947b(snsInfo.field_snsId);
        C94877g0 g0Var = new C94877g0(snsInfo.field_snsId, 1);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(g0Var);
        Context context = this.f276837d;
        this.f276839f = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f276837d.getString(C0966R.string.jbm), true, true, new C95342b(g0Var));
        SnsMethodCalculate.markEndTimeMs("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    /* renamed from: h */
    public SnsCmdList mo132173h() {
        SnsMethodCalculate.markStartTimeMs("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsCmdList snsCmdList = this.f276838e;
        SnsMethodCalculate.markEndTimeMs("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return snsCmdList;
    }

    /* renamed from: i */
    public final String mo132174i() {
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        C101804kv2 kv22 = this.f276846p;
        if (kv22 == null) {
            Log.m105924i("MicroMsg.GalleryTitleManager", "getMediaPath, mediaObj is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        SnsInfo snsInfo = this.f276844n;
        if (snsInfo == null) {
            Log.m105924i("MicroMsg.GalleryTitleManager", "getMediaPath, snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        String c = C92125p.m115798c(C92125p.m115800e(snsInfo), kv22);
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return c;
    }

    /* renamed from: j */
    public final void mo132175j(ArrayList<Integer> arrayList, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (this.f276843j) {
            SnsMethodCalculate.markStartTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            boolean z = false;
            int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC, 0);
            if (j == 0) {
                z = C47101a.f126572a;
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            } else if (j != 2) {
                if (C47101a.f126572a) {
                    Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                    C47101a.f126572a = false;
                }
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            } else {
                z = true;
                if (!C47101a.f126572a) {
                    Log.m105924i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                    C47101a.f126572a = true;
                }
                SnsMethodCalculate.markEndTimeMs("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            }
            if (z) {
                arrayList.add(1015);
            } else if (snsInfo.getLocalPrivate() <= 0) {
                arrayList.add(1000);
            } else if (!Util.isNullOrNil(C94866e1.Mx0()) && C94866e1.Mx0().equals(snsInfo.getUserName())) {
                arrayList.add(1005);
            }
            arrayList.add(-1);
        }
        SnsMethodCalculate.markEndTimeMs("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    /* renamed from: k */
    public void mo132176k(boolean z, SnsInfo snsInfo, C101804kv2 kv22, boolean z2, boolean z3, boolean z4, int i) {
        SnsInfo snsInfo2 = snsInfo;
        C101804kv2 kv23 = kv22;
        boolean z5 = z2;
        boolean z6 = z3;
        SnsMethodCalculate.markStartTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        this.f276843j = z;
        this.f276844n = snsInfo2;
        this.f276846p = kv23;
        this.f276845o = kv23.f298689d;
        this.f276848r = z5;
        this.f276849s = z6;
        if (snsInfo2 == null) {
            SnsMethodCalculate.markEndTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        snsInfo.getTimeLine();
        ArrayList arrayList = new ArrayList();
        SnsMethodCalculate.markStartTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (this.f276841h == null) {
            C92126r rVar = new C92126r((Activity) this.f276837d, this.f276843j ? 5 : 6);
            this.f276841h = rVar;
            C46900z zVar = this.f276854x;
            SnsMethodCalculate.markStartTimeMs("setImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            C87412m.m108594g(zVar, "value");
            rVar.f263724f = zVar;
            SnsMethodCalculate.markEndTimeMs("setImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        } else if (this.f276850t) {
            this.f276850t = false;
        }
        this.f276841h.mo126099b(this.f276844n, kv23);
        C92126r rVar2 = this.f276841h;
        SnsMethodCalculate.markStartTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1003);
        C88144b.m109788f("favorite");
        arrayList2.add(1006);
        if (((C101980n) C86312j.m106911c(C101980n.class)).mo134693tB() && snsInfo2.field_type == 1 && C102236a0.m134755l0(this.f276851u) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
            arrayList2.add(1010);
            if (!this.f276850t) {
                ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
                chatImageWebSearchActionStruct.mo126611w("");
                chatImageWebSearchActionStruct.mo126609u(C102236a0.m134765q0(this.f276844n.field_snsId));
                chatImageWebSearchActionStruct.f265370f = C102236a0.m134715J(this.f276851u);
                chatImageWebSearchActionStruct.f265369e = 1;
                chatImageWebSearchActionStruct.f265371g = 81;
                String str = "";
                chatImageWebSearchActionStruct.mo126608t(str);
                chatImageWebSearchActionStruct.mo126607s(str);
                chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(C94938q1.m120518e(C94866e1.m120262YO(), kv23.f298689d) + C102236a0.m134717L(kv22)));
                chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
                chatImageWebSearchActionStruct.mo86054n();
                ((C92330r) C86312j.m106911c(C92330r.class)).Ec0(chatImageWebSearchActionStruct);
            }
        }
        this.f276856z.clear();
        this.f276856z.addAll(arrayList2);
        C92126r.C92127a aVar = C92126r.f263717g;
        int[] a = aVar.mo126112a(arrayList2);
        SnsMethodCalculate.markEndTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        ArrayList arrayList3 = new ArrayList();
        int i2 = snsInfo2.field_type;
        if (i2 == 15 || i2 == 5) {
            arrayList3.add(1013);
            mo132175j(arrayList3, snsInfo2);
        } else if (i2 == 1) {
            arrayList3.add(1002);
            if (!C100417r0.m131416e(snsInfo.getLocalid())) {
                arrayList3.add(1012);
            }
            mo132175j(arrayList3, snsInfo2);
            if (z5) {
                arrayList3.add(1009);
            }
            if (z6) {
                arrayList3.add(1011);
            }
        } else {
            arrayList3.add(1014);
            mo132175j(arrayList3, snsInfo2);
        }
        ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
        exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = snsInfo.getLocalid();
        exDeviceHaveBindNetworkDeviceEvent.publish();
        if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
            arrayList3.add(1008);
        }
        this.f276833A.clear();
        this.f276833A.addAll(arrayList3);
        int[] a2 = aVar.mo126112a(arrayList3);
        SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        rVar2.mo126111n(a, a2, (C32224a<C13598b0>) null);
        this.f276841h.mo126106i(new C96175r0(this, snsInfo2));
        C92121j.m115792a(this.f276841h, (View) null, this.f276852v);
        SnsInfo snsInfo3 = this.f276844n;
        if (!(snsInfo3 == null || snsInfo3.getTimeLine() == null || !this.f276844n.getTimeLine().isExcerpt)) {
            Context context = this.f276837d;
            if (context instanceof MMActivity) {
                SnsInfo snsInfo4 = this.f276844n;
                C92118i.m115791a(this.f276841h, (MMActivity) context, snsInfo4.getTimeLine().snsExcerptUrl, snsInfo4.field_snsId);
            }
        }
        SnsMethodCalculate.markEndTimeMs("initBottomSheet", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        SnsMethodCalculate.markStartTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        this.f276841h.mo126108k(new C96214s0(this, snsInfo2, kv23, i));
        this.f276841h.mo126107j(new C96223t0(this, snsInfo2));
        this.f276841h.mo126109l();
        FlipView$$n flipView$$n = this.f276855y;
        if (flipView$$n != null) {
            flipView$$n.mo132170b(arrayList);
        }
        SnsMethodCalculate.markEndTimeMs("showAlert", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (z4) {
            C86709a0.m107528h();
            if (C86709a0.m107529k().f251779b.mo123467m() != 0) {
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                String str2 = C94938q1.m120518e(C94866e1.m120262YO(), this.f276845o) + C102236a0.m134717L(kv22);
                recogQBarOfImageFileEvent.f107731d.f107733b = str2;
                long currentTimeMillis = System.currentTimeMillis();
                this.f276847q = currentTimeMillis;
                RecogQBarOfImageFileEvent.C40158a aVar2 = recogQBarOfImageFileEvent.f107731d;
                aVar2.f107732a = currentTimeMillis;
                aVar2.f107737f = 2;
                this.f276842i = str2;
                recogQBarOfImageFileEvent.publish();
            }
        }
        SnsMethodCalculate.markEndTimeMs("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (i == 0 && i2 == 0 && yVar != null) {
            Log.m105924i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType() + " @" + hashCode());
            C89779i0 i0Var = this.f276839f;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            C94877g0 g0Var = (C94877g0) yVar;
            int m1 = g0Var.mo131050m1();
            if (m1 == -1) {
                this.f276840g.mo132031o2(true, "", g0Var.mo131050m1());
            } else if (m1 == 1) {
                mo132173h().mo130689a(g0Var.mo131049l1());
                this.f276840g.mo132031o2(true, C100417r0.m131420i("sns_table_", (long) g0Var.mo131049l1()), g0Var.mo131050m1());
            } else if (m1 == 2) {
                SnsCmdList h = mo132173h();
                int l1 = g0Var.mo131049l1();
                h.getClass();
                SnsMethodCalculate.markStartTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                ((LinkedList) h.f274673g).add(Integer.valueOf(l1));
                SnsMethodCalculate.markEndTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                this.f276840g.mo132031o2(true, "", g0Var.mo131050m1());
            } else if (m1 == 3) {
                SnsCmdList h2 = mo132173h();
                int l15 = g0Var.mo131049l1();
                h2.getClass();
                SnsMethodCalculate.markStartTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                ((LinkedList) h2.f274673g).add(Integer.valueOf(l15));
                SnsMethodCalculate.markEndTimeMs("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
                this.f276840g.mo132031o2(true, C100417r0.m131420i("sns_table_", (long) g0Var.mo131049l1()), g0Var.mo131050m1());
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }
}
