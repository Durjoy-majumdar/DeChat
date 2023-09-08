package nt2;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.C94753a;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentDetailUI;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdCardVideoEndView;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C60890q;
import nq2.C100151a;
import nu2.C100199c;
import nu2.C100205f;
import nu2.C100207g;
import nu2.C100208h;
import nu2.C100209i;
import nu2.C100211j;
import nu2.C100214l;
import ou2.C100478e;
import p749xh.C66261f3;

/* renamed from: nt2.h */
public class C100173h extends C100165c implements C98957g {

    /* renamed from: o */
    public Activity f293464o;

    /* renamed from: p */
    public ADXml.C95018g f293465p;

    /* renamed from: q */
    public C98963o f293466q;

    /* renamed from: r */
    public boolean f293467r = false;

    /* renamed from: s */
    public C100151a.C100155d f293468s;

    /* renamed from: t */
    public C100151a f293469t = new C100151a();

    /* renamed from: u */
    public C100207g f293470u;

    /* renamed from: v */
    public View.OnClickListener f293471v = new C100174a();

    /* renamed from: w */
    public boolean f293472w = false;

    /* renamed from: x */
    public boolean f293473x = false;

    /* renamed from: y */
    public C100151a.C100156e f293474y = new C100175b();

    /* renamed from: nt2.h$a */
    public class C100174a implements View.OnClickListener {
        public C100174a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/detail/item/FullCardAdDetailItemNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$2");
            Log.m105924i("MicroMsg.FullCardAdDetailItemNew", "ProxyCardClickListener onClick");
            try {
                C100173h.this.f293418n.f280365U.onClick(view);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.FullCardAdDetailItemNew", "ProxyCardClickListener onClick, exp=" + e.toString());
            }
            C100173h hVar = C100173h.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            boolean z = hVar.f293467r;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            if (z) {
                SnsAdCardVideoEndView.m123450e(C100173h.this.f293412e, 2);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/detail/item/FullCardAdDetailItemNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nt2.h$b */
    public class C100175b implements C100151a.C100156e {
        public C100175b() {
        }

        /* renamed from: a */
        public void mo133435a(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
            int duration = z ? C100173h.m130905h(C100173h.this).f293376u.getDuration() / 1000 : C100173h.m130905h(C100173h.this).f293368m.f280504g.getDurationMs() / 1000;
            C100173h hVar = C100173h.this;
            hVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            long j = hVar.f293412e.field_snsId;
            Log.m105918d("MicroMsg.FullCardAdDetailItemNew", "doOnVideoPlaying, curTime=" + i + ", isOnlineVideo=" + z);
            C98963o oVar = hVar.f293466q;
            if (oVar != null) {
                if (hVar.f293412e != null) {
                    oVar.mo138316w(j);
                    hVar.f293466q.mo138318y(j, (long) i);
                }
                if (!hVar.f293466q.mo138310q(j)) {
                    hVar.f293466q.mo138286A(j, Util.currentTicks());
                    hVar.f293466q.mo138288C(j, duration, true);
                    hVar.f293466q.mo138298e(j, j);
                }
            }
            ADXml.C95018g gVar = hVar.f293465p;
            C100151a.C100155d dVar = hVar.f293468s;
            C60890q.m71304c(gVar, i, dVar.f293366k, dVar.f293367l);
            C94753a.m119991c(i, hVar.f293468s, hVar.f293412e);
            long j2 = (long) i;
            SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            C100207g gVar2 = hVar.f293470u;
            if (gVar2 != null) {
                gVar2.mo139502g(j2, duration);
            }
            SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            SnsMethodCalculate.markEndTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }

        /* renamed from: b */
        public void mo133436b(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
            Log.m105924i("MicroMsg.FullCardAdDetailItemNew", "onStart, isOnlineVideoView=" + z + ", duration=" + i + ", hash=" + C100173h.this.hashCode());
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }

        /* renamed from: c */
        public void mo133437c() {
            SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
            SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }

        /* renamed from: d */
        public void mo133438d(boolean z) {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
            Log.m105924i("MicroMsg.FullCardAdDetailItemNew", "onCompletion, isOnlineVideoView=" + z + ", hash=" + C100173h.this.hashCode());
            C100173h hVar = C100173h.this;
            hVar.getClass();
            SnsMethodCalculate.markStartTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            if (hVar.f293465p.f275695k == null) {
                hVar.f293469t.mo139448i(hVar.f293468s.f293355K.f293342c);
            }
            hVar.f293466q.mo138295b(hVar.f293412e.field_snsId);
            MMHandlerThread.postToMainThread(new C100172g(hVar));
            SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew$4");
        }
    }

    public C100173h(Activity activity, int i, TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        C100207g gVar;
        this.f293464o = activity;
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293466q = oVar;
        SnsMethodCalculate.markStartTimeMs("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        if (i == 35) {
            gVar = new C100199c();
        } else if (i == 39) {
            gVar = new C100478e(1);
        } else if (i != 41) {
            switch (i) {
                case 28:
                    gVar = new C100214l();
                    break;
                case 29:
                    gVar = new C100205f();
                    break;
                case 30:
                    gVar = new C100209i();
                    break;
                case 31:
                    gVar = new C100211j();
                    break;
                case 32:
                    gVar = new C100478e(0);
                    break;
                default:
                    gVar = null;
                    break;
            }
        } else {
            gVar = new C100208h();
        }
        SnsMethodCalculate.markEndTimeMs("newFullCardBusinessByType", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.FullCardAdBusinessHelper");
        this.f293470u = gVar;
    }

    /* renamed from: h */
    public static /* synthetic */ C100151a.C100155d m130905h(C100173h hVar) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        C100151a.C100155d dVar = hVar.f293468s;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        return dVar;
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        Log.m105924i("MicroMsg.FullCardAdDetailItemNew", "initView");
        this.f293413f = view;
        this.f293414g = view2;
        C100151a.C100155d g = C100151a.m130850g(view);
        this.f293468s = g;
        g.f293355K.f293340a = ((SnsCommentDetailUI) this.f293464o).mo132622j8();
        C100151a.C100155d dVar = this.f293468s;
        dVar.f293355K.f293344e = this.f293470u;
        dVar.f293379x = view.findViewById(C0966R.C0970id.egh);
        C100151a.C100155d dVar2 = this.f293468s;
        dVar2.f293377v = this.f293416i;
        dVar2.f293378w = this.f293417j;
        this.f293415h = dVar2.f293368m;
        C100207g gVar = this.f293470u;
        if (gVar != null) {
            gVar.mo139487a(this.f293464o, this.f293466q, this.f293418n, dVar2, this.f293469t);
        }
        C100151a aVar = this.f293469t;
        C100151a.C100156e eVar = this.f293474y;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        aVar.f293337i = eVar;
        SnsMethodCalculate.markEndTimeMs("setWraperInterface", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        this.f293469t.mo139446f(this.f293468s);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        r2 = r8.f293468s;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139452b() {
        /*
            r8 = this;
            java.lang.String r0 = "onPause"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onPause, hasPlayedVideo="
            r2.append(r3)
            boolean r3 = r8.f293472w
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.FullCardAdDetailItemNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            r2 = 1
            r8.f293473x = r2
            boolean r2 = r8.f293472w     // Catch:{ Exception -> 0x0068 }
            if (r2 == 0) goto L_0x0082
            nq2.a$d r2 = r8.f293468s     // Catch:{ Exception -> 0x0068 }
            com.tencent.mm.plugin.sns.ui.m2 r4 = r2.f293368m     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0082
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r4 = r4.f280504g     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0082
            nq2.a r4 = r8.f293469t     // Catch:{ Exception -> 0x0068 }
            nq2.a$c r2 = r2.f293355K     // Catch:{ Exception -> 0x0068 }
            boolean r2 = r2.f293342c     // Catch:{ Exception -> 0x0068 }
            r4.getClass()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r5 = "pausePlay"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)     // Catch:{ Exception -> 0x0068 }
            r7 = 0
            r4.mo139447h(r2, r7)     // Catch:{ Exception -> 0x0068 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r2 = "onVideoPause"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch:{ Exception -> 0x0068 }
            nu2.g r4 = r8.f293470u     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0057
            r4.onVideoPause()     // Catch:{ Exception -> 0x0068 }
        L_0x0057:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ Exception -> 0x0068 }
            jp2.o r2 = r8.f293466q     // Catch:{ Exception -> 0x0068 }
            if (r2 == 0) goto L_0x0082
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r8.f293412e     // Catch:{ Exception -> 0x0068 }
            if (r4 == 0) goto L_0x0082
            long r4 = r4.field_snsId     // Catch:{ Exception -> 0x0068 }
            r2.mo138314u(r4)     // Catch:{ Exception -> 0x0068 }
            goto L_0x0082
        L_0x0068:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onPause, exp="
            r4.append(r5)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x0082:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100173h.mo139452b():void");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        C100207g gVar = this.f293470u;
        if (gVar != null) {
            gVar.mo139488b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    /* renamed from: e */
    public void mo139453e() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
        super.mo139453e();
        C100207g gVar = this.f293470u;
        if (gVar != null) {
            gVar.mo139489c();
        }
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139454g() {
        /*
            r14 = this;
            java.lang.String r0 = "refreshView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "MicroMsg.FullCardAdDetailItemNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r14.f293412e
            java.lang.String r3 = r3.getSnsId()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = os2.C100416r.m131408a(r3)
            r14.f293412e = r3
            r4 = 0
            r14.f293465p = r4
            if (r3 == 0) goto L_0x002f
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r3.getAdXml()
            if (r3 == 0) goto L_0x002f
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r14.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r3 = r3.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$g r5 = r3.adFullCardInfo
            r14.f293465p = r5
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            nq2.a$d r5 = r14.f293468s
            nq2.a$c r5 = r5.f293355K
            boolean r3 = nq2.C100151a.m130852m(r3)
            r5.f293342c = r3
            nq2.a r3 = r14.f293469t
            nq2.a$d r5 = r14.f293468s
            com.tencent.mm.plugin.sns.storage.ADXml$g r6 = r14.f293465p
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r14.f293412e
            com.tencent.mm.protocal.protobuf.TimeLineObject r8 = r14.f293411d
            android.app.Activity r9 = r14.f293464o
            jp2.o r10 = r14.f293466q
            r3.getClass()
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            java.lang.String r12 = "initData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
            r3.f293329a = r5
            r3.f293330b = r6
            r3.f293331c = r7
            r3.f293332d = r9
            r3.f293333e = r10
            r3.f293334f = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
            nq2.a$d r3 = r14.f293468s
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r14.f293412e
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r6 = r14.f293418n
            com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.C94753a.m119990b(r3, r5, r6, r4)
            nq2.a$d r3 = r14.f293468s
            android.view.View r3 = r3.f293379x
            boolean r5 = r3 instanceof com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x007e
            com.tencent.mm.plugin.sns.ui.widget.ad.AdRoundedCornerFrameLayout r3 = (com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout) r3
            r3.setIsReportTouchDownPositon(r7)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r14.f293412e
            r3.mo134108c(r5, r6)
        L_0x007e:
            r3 = 0
            r14.f293472w = r3
            r14.f293473x = r3
            android.app.Activity r5 = r14.f293464o
            java.lang.String r8 = "window"
            java.lang.Object r5 = r5.getSystemService(r8)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            android.view.Display r8 = r5.getDefaultDisplay()
            int r8 = r8.getWidth()
            android.view.Display r5 = r5.getDefaultDisplay()
            int r5 = r5.getHeight()
            int r5 = java.lang.Math.min(r8, r5)
            android.app.Activity r8 = r14.f293464o
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131167200(0x7f0707e0, float:1.7948667E38)
            int r8 = r8.getDimensionPixelSize(r9)
            android.app.Activity r9 = r14.f293464o
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165281(0x7f070061, float:1.7944775E38)
            int r9 = r9.getDimensionPixelSize(r10)
            android.app.Activity r10 = r14.f293464o
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131165590(0x7f070196, float:1.7945401E38)
            int r10 = r10.getDimensionPixelSize(r11)
            int r5 = r5 - r8
            int r5 = r5 - r9
            int r5 = r5 - r10
            int r5 = r5 - r10
            com.tencent.mm.plugin.sns.storage.ADXml$g r8 = r14.f293465p
            java.lang.String r9 = ""
            if (r8 == 0) goto L_0x00da
            nq2.a r8 = r14.f293469t
            android.view.ViewGroup$LayoutParams r5 = r8.mo139443c(r5)
            goto L_0x0103
        L_0x00da:
            java.lang.String r5 = "invalid full card"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r14.f293412e
            if (r5 != 0) goto L_0x00e6
            r5 = r9
            goto L_0x00ec
        L_0x00e6:
            long r10 = r5.field_snsId
            java.lang.String r5 = vr2.C102236a0.m134765q0(r10)
        L_0x00ec:
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r14.f293412e
            if (r8 == 0) goto L_0x00fb
            boolean r8 = r8.isFullCardAd()
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r14.f293412e
            java.lang.String r10 = r10.getUxinfo()
            goto L_0x00fd
        L_0x00fb:
            r10 = r9
            r8 = 0
        L_0x00fd:
            java.lang.String r11 = "fullcard_info_null"
            vr2.C37817q.m41545a(r11, r5, r3, r8, r10)
            r5 = r4
        L_0x0103:
            nq2.a$d r8 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r8 = r8.f293368m
            com.tencent.mm.protocal.protobuf.TimeLineObject r10 = r14.f293411d
            com.tencent.mm.plugin.sns.storage.SnsInfo r11 = r14.f293412e
            java.lang.String r11 = r11.getLocalid()
            r8.mo133598a(r10, r3, r11, r7)
            nq2.a$d r8 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r8 = r8.f293368m
            android.widget.TextView r8 = r8.f280508k
            r10 = 8
            r8.setVisibility(r10)
            com.tencent.mm.plugin.sns.model.o r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r14.f293411d
            te3.j00 r11 = r11.ContentObj
            if (r11 == 0) goto L_0x013c
            java.util.LinkedList<te3.kv2> r11 = r11.f298427h
            int r11 = r11.size()
            if (r11 < r7) goto L_0x013c
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r14.f293411d
            te3.j00 r11 = r11.ContentObj
            java.util.LinkedList<te3.kv2> r11 = r11.f298427h
            java.lang.Object r11 = r11.get(r3)
            te3.kv2 r11 = (te3.C101804kv2) r11
            goto L_0x013d
        L_0x013c:
            r11 = r4
        L_0x013d:
            if (r11 == 0) goto L_0x0235
            nq2.a$d r4 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView r4 = r4.f293369n
            if (r4 == 0) goto L_0x0168
            com.tencent.mm.plugin.sns.storage.ADXml$g r10 = r14.f293465p
            com.tencent.mm.plugin.sns.ui.x2 r10 = r10.f275695k
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            if (r10 != 0) goto L_0x0153
            r4.mo134011c(r3)
        L_0x0153:
            r4.f281455d = r10
            r4.f281466r = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            nq2.a$d r4 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView r4 = r4.f293369n
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r14.f293412e
            boolean r4 = r4.mo134009a(r6)
            if (r4 == 0) goto L_0x0168
            r14.f293467r = r3
        L_0x0168:
            java.lang.String r4 = "onRefresh"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            nu2.g r6 = r14.f293470u
            if (r6 == 0) goto L_0x0194
            jp2.o r6 = r14.f293466q
            if (r6 == 0) goto L_0x018b
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r14.f293412e
            if (r6 == 0) goto L_0x018b
            long r12 = r6.field_snsId
            java.lang.String r6 = vr2.C102236a0.m134765q0(r12)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x018b
            jp2.o r10 = r14.f293466q
            r10.mo138294a(r6, r14)
        L_0x018b:
            nu2.g r6 = r14.f293470u
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r14.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml$g r12 = r14.f293465p
            r6.mo139490d(r3, r10, r12, r5)
        L_0x0194:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "refreshView, hash="
            r4.append(r5)
            int r5 = r14.hashCode()
            r4.append(r5)
            java.lang.String r5 = ", snsId="
            r4.append(r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r14.f293412e
            if (r5 != 0) goto L_0x01b3
            goto L_0x01b9
        L_0x01b3:
            long r5 = r5.field_snsId
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
        L_0x01b9:
            r4.append(r9)
            java.lang.String r5 = ", useOnlineVideo="
            r4.append(r5)
            nq2.a$d r5 = r14.f293468s
            nq2.a$c r5 = r5.f293355K
            boolean r5 = r5.f293342c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            nq2.a r2 = r14.f293469t
            nq2.a$d r4 = r14.f293468s
            nq2.a$c r4 = r4.f293355K
            boolean r4 = r4.f293342c
            r2.mo139445e(r11, r8, r3, r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r14.f293411d
            te3.j00 r2 = r2.ContentObj
            int r2 = r2.f298424e
            if (r2 != r7) goto L_0x01f5
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.MaskImageView r2 = r2.f293358c
            r2.setTag(r14)
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.MaskImageView r2 = r2.f293358c
            android.view.View$OnClickListener r3 = r14.f293471v
            r2.setOnClickListener(r3)
            goto L_0x0260
        L_0x01f5:
            r3 = 15
            if (r2 == r3) goto L_0x01fc
            r3 = 5
            if (r2 != r3) goto L_0x0260
        L_0x01fc:
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            android.view.View r2 = r2.f280501d
            r2.setTag(r14)
            nq2.a$d r2 = r14.f293468s
            android.view.ViewGroup r2 = r2.f293375t
            r2.setTag(r14)
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            android.view.View r2 = r2.f280501d
            android.view.View$OnClickListener r3 = r14.f293471v
            r2.setOnClickListener(r3)
            nq2.a$d r2 = r14.f293468s
            android.view.ViewGroup r2 = r2.f293375t
            android.view.View$OnClickListener r3 = r14.f293471v
            r2.setOnClickListener(r3)
            nq2.a r2 = r14.f293469t
            nq2.a$d r3 = r14.f293468s
            nq2.a$c r3 = r3.f293355K
            boolean r3 = r3.f293342c
            r2.mo139450k(r3)
            nu2.g r2 = r14.f293470u
            if (r2 == 0) goto L_0x0232
            r2.mo139491e()
        L_0x0232:
            r14.f293472w = r7
            goto L_0x0260
        L_0x0235:
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r2.f280504g
            r5 = -1
            android.app.Activity r6 = r14.f293464o
            int r6 = r6.hashCode()
            r8.mo131115f(r2, r5, r6, r3)
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            android.widget.TextView r2 = r2.f280509l
            r2.setVisibility(r10)
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.m2 r2 = r2.f293368m
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r2.f280504g
            r2.setVideoCallback(r4)
            nq2.a$d r2 = r14.f293468s
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = r2.f293376u
            if (r2 == 0) goto L_0x0260
            r2.setVideoCallback(r4)
        L_0x0260:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100173h.mo139454g():void");
    }
}
