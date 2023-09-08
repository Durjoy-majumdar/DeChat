package com.tencent.p014mm.plugin.textstatus.third;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import jz2.C33810m;
import ob0.C11385n;
import ob0.C117747y;
import p773yy.C66708h;
import qy2.C101318t;
import qy2.C63349b0;
import qy2.C77444c0;
import qy2.C77459z;
import rx3.C13598b0;
import uz2.C52718u;

/* renamed from: com.tencent.mm.plugin.textstatus.third.TextStatusActionTask */
public final class TextStatusActionTask implements C101318t, C11385n {

    /* renamed from: d */
    public final C77444c0 f206676d;

    /* renamed from: e */
    public final C63349b0 f206677e;

    /* renamed from: f */
    public final WeakReference<Context> f206678f;

    /* renamed from: g */
    public boolean f206679g;

    /* renamed from: h */
    public WeakReference<C117747y> f206680h;

    /* renamed from: i */
    public C33810m f206681i;

    /* renamed from: j */
    public ProgressDialog f206682j;

    /* renamed from: com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$a */
    public static final class C71359a extends C87413o implements C32226l<C52718u, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TextStatusActionTask f206683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71359a(TextStatusActionTask textStatusActionTask) {
            super(1);
            this.f206683d = textStatusActionTask;
        }

        public Object invoke(Object obj) {
            C52718u uVar = (C52718u) obj;
            C87412m.m108594g(uVar, "extInfoOut");
            TextStatusActionTask textStatusActionTask = this.f206683d;
            if (!textStatusActionTask.f206679g) {
                textStatusActionTask.mo98316a(uVar);
            }
            return C13598b0.f38549a;
        }
    }

    public TextStatusActionTask(Context context, C77444c0 c0Var, C63349b0 b0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(c0Var, "param");
        this.f206676d = c0Var;
        this.f206677e = b0Var;
        this.f206678f = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo98316a(C52718u uVar) {
        C77459z zVar = new C77459z();
        if (uVar != null) {
            zVar.f229399d = uVar;
        }
        C77444c0 c0Var = this.f206676d;
        zVar.f229404i = c0Var.f229423h;
        zVar.f229415w = c0Var.f229424i;
        zVar.f229417y = c0Var.f229427o;
        TextStatusActionTask$jumpSetStatus$setStatusCallback$1 textStatusActionTask$jumpSetStatus$setStatusCallback$1 = new TextStatusActionTask$jumpSetStatus$setStatusCallback$1(this);
        Context context = this.f206678f.get();
        if (context != null && (!(context instanceof Activity) || !((Activity) context).isFinishing())) {
            ((C66708h) C86312j.m106911c(C66708h.class)).Ph0(context, zVar, textStatusActionTask$jumpSetStatus$setStatusCallback$1);
        }
        ProgressDialog progressDialog = this.f206682j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f206682j = null;
    }

    public void cancel() {
        C117747y yVar;
        this.f206679g = true;
        WeakReference<C117747y> weakReference = this.f206680h;
        if (!(weakReference == null || (yVar = weakReference.get()) == null)) {
            C86709a0.m107524d().mo123458d(yVar);
        }
        ProgressDialog progressDialog = this.f206682j;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r7 = (r7 = r7.f147194d).f147132j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r6, int r7, java.lang.String r8, ob0.C117747y r9) {
        /*
            r5 = this;
            boolean r8 = r9 instanceof lz2.C46921d
            if (r8 == 0) goto L_0x0199
            ob0.b0 r8 = f40.C86709a0.m107524d()
            lz2.d r9 = (lz2.C46921d) r9
            r9.getClass()
            r0 = 6889(0x1ae9, float:9.654E-42)
            jz2.m r1 = r5.f206681i
            r8.mo123470p(r0, r1)
            boolean r8 = r5.f206679g
            if (r8 == 0) goto L_0x0019
            return
        L_0x0019:
            r8 = 1
            r0 = 0
            if (r6 != 0) goto L_0x0182
            if (r7 == 0) goto L_0x0021
            goto L_0x0182
        L_0x0021:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "GetBrandInfo templates:"
            r6.append(r7)
            uz2.r0 r7 = r9.f126152f
            if (r7 == 0) goto L_0x003c
            uz2.h0 r7 = r7.f147194d
            if (r7 == 0) goto L_0x003c
            java.util.LinkedList<uz2.i0> r7 = r7.f147132j
            if (r7 == 0) goto L_0x003c
            int r7 = r7.size()
            goto L_0x003d
        L_0x003c:
            r7 = -1
        L_0x003d:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.TextStatus.TextStatusActionTask"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            uz2.r0 r6 = r9.f126152f
            if (r6 == 0) goto L_0x0050
            uz2.h0 r6 = r6.f147194d
            goto L_0x0051
        L_0x0050:
            r6 = r0
        L_0x0051:
            if (r6 == 0) goto L_0x0056
            java.util.LinkedList<uz2.i0> r1 = r6.f147132j
            goto L_0x0057
        L_0x0056:
            r1 = r0
        L_0x0057:
            if (r1 == 0) goto L_0x0061
            java.util.LinkedList<uz2.i0> r6 = r6.f147132j
            int r6 = r6.size()
            if (r6 != 0) goto L_0x006a
        L_0x0061:
            java.lang.String r6 = "templates is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r5.mo98316a(r0)
        L_0x006a:
            uz2.r0 r6 = r9.f126152f
            if (r6 == 0) goto L_0x0199
            uz2.h0 r6 = r6.f147194d
            if (r6 == 0) goto L_0x0199
            java.util.LinkedList<uz2.i0> r6 = r6.f147132j
            if (r6 == 0) goto L_0x0199
            java.util.Iterator r6 = r6.iterator()
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x016a
            java.lang.Object r6 = r6.next()
            uz2.i0 r6 = (uz2.C52688i0) r6
            int r9 = r6.f147136d
            r1 = 0
            if (r9 == r8) goto L_0x011c
            r2 = 2
            if (r9 == r2) goto L_0x0097
            java.lang.String r6 = "action is weird error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r5.mo98316a(r0)
            return
        L_0x0097:
            uz2.u r9 = new uz2.u
            r9.<init>()
            java.lang.String r6 = r6.f147138f
            byte[] r6 = android.util.Base64.decode(r6, r1)
            r9.parseFrom(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "GetBrandInfo templates extInfo:"
            r6.append(r0)
            java.lang.String r0 = b03.C67129e.m79387b(r9)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$a r6 = new com.tencent.mm.plugin.textstatus.third.TextStatusActionTask$a
            r6.<init>(r5)
            xz2.a r7 = xz2.C66450a.f191209a
            xz2.w r0 = new xz2.w
            r0.<init>(r6)
            uz2.e0 r6 = r9.f147238g
            java.util.LinkedList<uz2.a0> r6 = r6.f147090g
            java.lang.String r2 = "extInfoIn.topicInfo.jumpInfos"
            gy3.C87412m.m108593f(r6, r2)
            uz2.e0 r2 = r9.f147238g
            java.lang.String r3 = "extInfoIn.topicInfo"
            gy3.C87412m.m108593f(r2, r3)
            java.util.LinkedList r2 = hz2.C60235a.m70502b(r2)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            uz2.a0 r6 = xz2.C79020s.m95585a(r6)
            uz2.a0 r2 = xz2.C79020s.m95585a(r2)
            if (r6 == 0) goto L_0x00f4
            boolean r4 = xz2.C79020s.m95586b(r6)
            if (r4 != r8) goto L_0x00f4
            r4 = 1
            goto L_0x00f5
        L_0x00f4:
            r4 = 0
        L_0x00f5:
            if (r4 == 0) goto L_0x00fa
            r3.add(r6)
        L_0x00fa:
            if (r2 == 0) goto L_0x0103
            boolean r6 = xz2.C79020s.m95586b(r2)
            if (r6 != r8) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r8 = 0
        L_0x0104:
            if (r8 == 0) goto L_0x0109
            r3.add(r2)
        L_0x0109:
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L_0x0113
            r0.invoke(r9)
            goto L_0x011b
        L_0x0113:
            xz2.b r6 = new xz2.b
            r6.<init>(r0, r9)
            r7.mo90543a(r3, r6)
        L_0x011b:
            return
        L_0x011c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = "GetBrandInfo templates url:"
            r9.append(r2)
            java.lang.String r2 = r6.f147137e
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r6 = r6.f147137e
            java.lang.String r9 = "rawUrl"
            r7.putExtra(r9, r6)
            java.lang.ref.WeakReference<android.content.Context> r6 = r5.f206678f
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r6 == 0) goto L_0x0150
            java.lang.String r9 = "webview"
            java.lang.String r2 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r6, r9, r2, r7, r0)
        L_0x0150:
            android.app.ProgressDialog r6 = r5.f206682j
            if (r6 == 0) goto L_0x0157
            r6.dismiss()
        L_0x0157:
            r5.f206682j = r0
            qy2.b0 r6 = r5.f206677e
            if (r6 == 0) goto L_0x0169
            uz2.g0 r7 = new uz2.g0
            r7.<init>()
            r7.f188443d = r8
            rx3.b0 r8 = rx3.C13598b0.f38549a
            r6.onFinishAction(r1, r0, r7)
        L_0x0169:
            return
        L_0x016a:
            qy2.b0 r6 = r5.f206677e
            if (r6 == 0) goto L_0x0178
            uz2.g0 r7 = new uz2.g0
            r7.<init>()
            java.lang.String r9 = "not valid templates found"
            r6.onFinishAction(r8, r9, r7)
        L_0x0178:
            android.app.ProgressDialog r6 = r5.f206682j
            if (r6 == 0) goto L_0x017f
            r6.dismiss()
        L_0x017f:
            r5.f206682j = r0
            goto L_0x0199
        L_0x0182:
            android.app.ProgressDialog r6 = r5.f206682j
            if (r6 == 0) goto L_0x0189
            r6.dismiss()
        L_0x0189:
            r5.f206682j = r0
            qy2.b0 r6 = r5.f206677e
            if (r6 == 0) goto L_0x0199
            uz2.g0 r7 = new uz2.g0
            r7.<init>()
            java.lang.String r9 = "err rsp"
            r6.onFinishAction(r8, r9, r7)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.third.TextStatusActionTask.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
