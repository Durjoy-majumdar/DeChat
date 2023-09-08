package or2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.C96177r2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ir2.C60616b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100417r0;
import os2.C62175s0;
import qo3.C77407n;
import qo3.C89779i0;
import up2.C102064e;
import vr2.C102236a0;
import ys2.C53558i;

/* renamed from: or2.c */
public class C100386c {

    /* renamed from: a */
    public volatile boolean f294047a = false;

    /* renamed from: b */
    public C89779i0 f294048b = null;

    /* renamed from: c */
    public C77407n f294049c;

    /* renamed from: d */
    public Context f294050d;

    /* renamed from: or2.c$a */
    public class C100387a implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ String f294051a;

        /* renamed from: b */
        public final /* synthetic */ String f294052b;

        /* renamed from: c */
        public final /* synthetic */ SnsInfo f294053c;

        /* renamed from: d */
        public final /* synthetic */ int f294054d;

        public C100387a(String str, String str2, SnsInfo snsInfo, int i) {
            this.f294051a = str;
            this.f294052b = str2;
            this.f294053c = snsInfo;
            this.f294054d = i;
        }

        public void onDismiss() {
            SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$1");
            Log.m105924i("HalfSubscribeController", "onDismiss");
            C100386c cVar = C100386c.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            boolean z = cVar.f294047a;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            if (!z) {
                C60616b.m70877b(this.f294053c, this.f294054d, new C62175s0(this.f294051a, this.f294052b, 0, -1));
            }
            SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$1");
        }
    }

    /* renamed from: or2.c$b */
    public class C100388b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77407n f294056d;

        /* renamed from: or2.c$b$a */
        public class C100389a implements Runnable {
            public C100389a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2$1");
                if (C100388b.this.f294056d.mo107563h()) {
                    Log.m105924i("HalfSubscribeController", "mmBottomSheet tryHide due to closeIv click");
                    C100388b.this.f294056d.mo107572p();
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2$1");
            }
        }

        public C100388b(C77407n nVar) {
            this.f294056d = nVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/controller/HalfSubscribeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2");
            Log.m105924i("HalfSubscribeController", "mmBottomSheet tryHide click");
            C100386c cVar = C100386c.this;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            cVar.f294047a = false;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            MMHandlerThread.postToMainThread(new C100389a());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/controller/HalfSubscribeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: or2.c$c */
    public class C100390c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsInfo f294059d;

        /* renamed from: e */
        public final /* synthetic */ AdClickActionInfo f294060e;

        /* renamed from: f */
        public final /* synthetic */ C100392d f294061f;

        /* renamed from: g */
        public final /* synthetic */ Context f294062g;

        /* renamed from: or2.c$c$a */
        public class C100391a implements Runnable {
            public C100391a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
                try {
                    C100386c cVar = C100386c.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    C89779i0 i0Var = cVar.f294048b;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    if (i0Var == null) {
                        Context context = C100390c.this.f294062g;
                        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                            C100390c cVar2 = C100390c.this;
                            C100386c cVar3 = C100386c.this;
                            C89779i0 Q = C76879j.m92723Q(cVar2.f294062g, "", "加载中", true, true, (DialogInterface.OnCancelListener) null);
                            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                            cVar3.f294048b = Q;
                            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("HalfSubscribeController", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
            }
        }

        public C100390c(SnsInfo snsInfo, AdClickActionInfo adClickActionInfo, C100392d dVar, Context context) {
            this.f294059d = snsInfo;
            this.f294060e = adClickActionInfo;
            this.f294061f = dVar;
            this.f294062g = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
            try {
                SnsInfo snsInfo = this.f294059d;
                if (snsInfo != null) {
                    C53558i iVar = new C53558i(this.f294060e.f273645d, Util.nullAs(snsInfo.getUxinfo(), ""), Util.safeParseLong(Util.nullAs(this.f294059d.getAid(), "")), this.f294060e.f273667o);
                    C86709a0.m107524d().mo123455a(2810, this.f294061f);
                    C86709a0.m107524d().mo123460f(iVar);
                    MMHandlerThread.postToMainThread(new C100391a());
                }
            } catch (Throwable th) {
                Log.m105920e("HalfSubscribeController", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/controller/HalfSubscribeController$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: or2.c$d */
    public static class C100392d implements C11385n {

        /* renamed from: d */
        public WeakReference<C100386c> f294065d;

        /* renamed from: e */
        public AdClickActionInfo f294066e;

        /* renamed from: f */
        public SnsInfo f294067f;

        /* renamed from: g */
        public int f294068g;

        /* renamed from: h */
        public C102064e.C102068b f294069h;

        /* renamed from: or2.c$d$a */
        public class C100393a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C100386c f294070d;

            public C100393a(C100392d dVar, C100386c cVar) {
                this.f294070d = cVar;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$1");
                C100386c cVar = this.f294070d;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                C89779i0 i0Var = cVar.f294048b;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                if (i0Var != null) {
                    C100386c cVar2 = this.f294070d;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    C89779i0 i0Var2 = cVar2.f294048b;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    i0Var2.dismiss();
                    C100386c cVar3 = this.f294070d;
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    cVar3.f294048b = null;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                }
                C100386c cVar4 = this.f294070d;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                C77407n nVar = cVar4.f294049c;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                if (nVar != null) {
                    C100386c cVar5 = this.f294070d;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    C77407n nVar2 = cVar5.f294049c;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    if (nVar2.mo107563h()) {
                        Log.m105924i("HalfSubscribeController", "mmBottomSheet tryHide due to send subscribe");
                        C100386c cVar6 = this.f294070d;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                        C77407n nVar3 = cVar6.f294049c;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                        nVar3.mo107572p();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$1");
            }
        }

        /* renamed from: or2.c$d$b */
        public class C100394b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f294071d;

            public C100394b(Context context) {
                this.f294071d = context;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$2");
                try {
                    C100392d dVar = C100392d.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                    C102064e.C102068b bVar = dVar.f294069h;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                    if (bVar != null) {
                        C100392d dVar2 = C100392d.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        C102064e.C102068b bVar2 = dVar2.f294069h;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        C100392d dVar3 = C100392d.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        AdClickActionInfo adClickActionInfo = dVar3.f294066e;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        ((C96177r2.C96178a) bVar2).mo133812a(adClickActionInfo);
                    }
                    Context context = this.f294071d;
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        Context context2 = this.f294071d;
                        C100392d dVar4 = C100392d.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        AdClickActionInfo adClickActionInfo2 = dVar4.f294066e;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        C76912y0.m92768g(context2, adClickActionInfo2.f273665n);
                    }
                } catch (Throwable th) {
                    Log.m105920e("HalfSubscribeController", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$2");
            }
        }

        /* renamed from: or2.c$d$c */
        public class C100395c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Context f294073d;

            public C100395c(Context context) {
                this.f294073d = context;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
                try {
                    Context context = this.f294073d;
                    if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                        Context context2 = this.f294073d;
                        C100392d dVar = C100392d.this;
                        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        AdClickActionInfo adClickActionInfo = dVar.f294066e;
                        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                        C76912y0.m92767f(context2, adClickActionInfo.f273663m);
                    }
                } catch (Throwable th) {
                    Log.m105920e("HalfSubscribeController", th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
            }
        }

        public C100392d(C100386c cVar, AdClickActionInfo adClickActionInfo, SnsInfo snsInfo, int i, C102064e.C102068b bVar) {
            this.f294065d = new WeakReference<>(cVar);
            this.f294066e = adClickActionInfo;
            this.f294067f = snsInfo;
            this.f294068g = i;
            this.f294069h = bVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
            Log.m105925i("HalfSubscribeController", "onSceneEnd errType %d,errCode %d,errMsg %s,scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(yVar.getType()));
            try {
                if (yVar instanceof C53558i) {
                    WeakReference<C100386c> weakReference = this.f294065d;
                    if (weakReference != null) {
                        if (weakReference.get() != null) {
                            C100386c cVar = this.f294065d.get();
                            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                            cVar.f294047a = true;
                            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                            MMHandlerThread.postToMainThread(new C100393a(this, cVar));
                            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                            Context context = cVar.f294050d;
                            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                            if (i == 0 && i2 == 0) {
                                Log.m105924i("HalfSubscribeController", "subscribe is success");
                                MMHandlerThread.postToMainThread(new C100394b(context));
                                C100417r0.m131422k(C102236a0.m134765q0(this.f294067f.field_snsId), String.valueOf(1));
                                AdClickActionInfo adClickActionInfo = this.f294066e;
                                C60616b.m70877b(this.f294067f, this.f294068g, new C62175s0(adClickActionInfo.f273653h, adClickActionInfo.f273645d, 1, 0));
                            } else {
                                Log.m105920e("HalfSubscribeController", "subscribe is failed");
                                MMHandlerThread.postToMainThread(new C100395c(context));
                                AdClickActionInfo adClickActionInfo2 = this.f294066e;
                                C60616b.m70877b(this.f294067f, this.f294068g, new C62175s0(adClickActionInfo2.f273653h, adClickActionInfo2.f273645d, 1, -3));
                            }
                            C86709a0.m107524d().mo123470p(yVar.getType(), this);
                        }
                    }
                    C86709a0.m107524d().mo123470p(yVar.getType(), this);
                    SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                    return;
                }
            } catch (Throwable th) {
                Log.m105920e("HalfSubscribeController", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[Catch:{ all -> 0x00d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ba A[Catch:{ all -> 0x00d3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo139672a(android.content.Context r18, com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo r19, qo3.C77407n r20, com.tencent.p014mm.plugin.sns.storage.SnsInfo r21, int r22, up2.C102064e.C102068b r23, com.tencent.p014mm.storage.C44668u3 r24) {
        /*
            r17 = this;
            r7 = r17
            r8 = r19
            r9 = r20
            java.lang.String r10 = "initHalfScreenSubscribeView"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.controller.HalfSubscribeController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r4 = r8.f273645d
            java.lang.String r3 = r8.f273653h
            java.lang.String r1 = "initView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r11)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r18)
            r2 = 2131497624(0x7f0c1298, float:1.8618846E38)
            r5 = 0
            android.view.View r12 = r0.inflate(r2, r5)
            r0 = 2131316912(0x7f0950b0, float:1.8252319E38)
            android.view.View r0 = r12.findViewById(r0)
            r2 = r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = 2131316911(0x7f0950af, float:1.8252317E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.ui.widget.RoundCornerImageView r0 = (com.tencent.p014mm.p136ui.widget.RoundCornerImageView) r0
            r6 = 2131314690(0x7f094802, float:1.8247812E38)
            android.view.View r6 = r12.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r13 = "updateAdCardActionBtnInfo"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r15 = "HalfScreenSubscribeUtils"
            if (r21 != 0) goto L_0x005b
            java.lang.String r0 = "adCardActionBtnInfo == null || snsInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)     // Catch:{ all -> 0x0056 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            r16 = r10
            goto L_0x00de
        L_0x0056:
            r0 = move-exception
            r16 = r10
            goto L_0x00d4
        L_0x005b:
            java.lang.String r5 = r8.f273671q     // Catch:{ all -> 0x0056 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = r21.getUserName()     // Catch:{ all -> 0x0056 }
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x0056 }
            if (r16 != 0) goto L_0x00a0
            r16 = r10
            r10 = r24
            com.tencent.mm.storage.z1 r10 = r10.mo69656H3(r5)     // Catch:{ all -> 0x00d3 }
            if (r10 != 0) goto L_0x0078
            goto L_0x007c
        L_0x0078:
            java.lang.String r5 = r10.mo62898f()     // Catch:{ all -> 0x00d3 }
        L_0x007c:
            boolean r10 = r21.isAd()     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x00a2
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r21.getAdXml()     // Catch:{ all -> 0x00d3 }
            boolean r9 = r10.usePreferedInfo     // Catch:{ all -> 0x00d3 }
            if (r9 == 0) goto L_0x008d
            java.lang.String r5 = r10.preferNickName     // Catch:{ all -> 0x00d3 }
            goto L_0x009d
        L_0x008d:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            if (r9 == 0) goto L_0x009d
            java.lang.String r9 = r10.nickname     // Catch:{ all -> 0x00d3 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ all -> 0x00d3 }
            if (r9 != 0) goto L_0x009d
            java.lang.String r5 = r10.nickname     // Catch:{ all -> 0x00d3 }
        L_0x009d:
            r8.f273671q = r5     // Catch:{ all -> 0x00d3 }
            goto L_0x00a2
        L_0x00a0:
            r16 = r10
        L_0x00a2:
            java.lang.String r5 = r8.f273669p     // Catch:{ all -> 0x00d3 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)     // Catch:{ all -> 0x00d3 }
            if (r5 == 0) goto L_0x00ba
            java.lang.Class<ln.f> r5 = p196ln.C76705f.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x00d3 }
            ln.f r5 = (p196ln.C76705f) r5     // Catch:{ all -> 0x00d3 }
            java.lang.String r9 = r21.getUserName()     // Catch:{ all -> 0x00d3 }
            r5.mo106849z(r0, r9)     // Catch:{ all -> 0x00d3 }
            goto L_0x00db
        L_0x00ba:
            java.lang.String r5 = r8.f273669p     // Catch:{ all -> 0x00d3 }
            r9 = 2131313892(0x7f0944e4, float:1.8246194E38)
            java.lang.Object r10 = r0.getTag(r9)     // Catch:{ all -> 0x00d3 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x00d3 }
            boolean r10 = android.text.TextUtils.equals(r10, r5)     // Catch:{ all -> 0x00d3 }
            if (r10 != 0) goto L_0x00db
            r10 = 0
            r0.setImageDrawable(r10)     // Catch:{ all -> 0x00d3 }
            ir2.C60616b.m70876a(r9, r5, r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00db
        L_0x00d3:
            r0 = move-exception
        L_0x00d4:
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
        L_0x00db:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
        L_0x00de:
            r0 = 2131314679(0x7f0947f7, float:1.824779E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5 = 2131314675(0x7f0947f3, float:1.8247782E38)
            android.view.View r9 = r12.findViewById(r5)
            android.widget.Button r9 = (android.widget.Button) r9
            java.lang.String r10 = r8.f273671q
            r2.setText(r10)
            java.lang.String r2 = r8.f273657j
            r6.setText(r2)
            java.lang.String r2 = r8.f273659k
            r0.setText(r2)
            java.lang.String r0 = r8.f273661l
            r9.setText(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r11)
            r0 = 2131299699(0x7f090d73, float:1.8217407E38)
            android.view.View r0 = r12.findViewById(r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            android.view.View r1 = r12.findViewById(r5)
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 0
            r7.f294047a = r1
            or2.c$a r10 = new or2.c$a
            r1 = r10
            r2 = r17
            r5 = r21
            r6 = r22
            r1.<init>(r3, r4, r5, r6)
            r1 = r20
            r1.f225761d = r10
            or2.c$b r2 = new or2.c$b
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            r7.f294049c = r1
            r10 = r18
            r7.f294050d = r10
            or2.c$d r0 = new or2.c$d
            r1 = r0
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r1.<init>(r2, r3, r4, r5, r6)
            or2.c$c r13 = new or2.c$c
            r1 = r13
            r3 = r21
            r4 = r19
            r5 = r0
            r6 = r18
            r1.<init>(r3, r4, r5, r6)
            r9.setOnClickListener(r13)
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: or2.C100386c.mo139672a(android.content.Context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo, qo3.n, com.tencent.mm.plugin.sns.storage.SnsInfo, int, up2.e$b, com.tencent.mm.storage.u3):android.view.View");
    }
}
