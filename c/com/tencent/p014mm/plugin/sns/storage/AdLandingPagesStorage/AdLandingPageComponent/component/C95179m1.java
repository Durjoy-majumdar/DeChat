package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import ps2.C100880k;
import ps2.C100891r;
import qs2.C101294u;
import te3.C52075y62;
import vr2.C102251n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1 */
public class C95179m1 extends C95295z {

    /* renamed from: s */
    public RoundCornerRelativeLayout f276222s;

    /* renamed from: t */
    public ImageView f276223t;

    /* renamed from: u */
    public ProgressBar f276224u;

    /* renamed from: v */
    public boolean f276225v = true;

    /* renamed from: w */
    public C102251n f276226w;

    /* renamed from: x */
    public volatile String f276227x = "";

    /* renamed from: y */
    public volatile String f276228y = "";

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$a */
    public class C95180a implements C100880k.C100881a {
        public C95180a() {
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
            C95179m1 m1Var = C95179m1.this;
            m1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            m1Var.f276224u.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("stopLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
            C95179m1 m1Var = C95179m1.this;
            m1Var.getClass();
            SnsMethodCalculate.markStartTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            m1Var.f276224u.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("startLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
            try {
                C95179m1 m1Var = C95179m1.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                C101294u E = m1Var.mo131693E();
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                String str2 = E.f296747z;
                C95179m1 m1Var2 = C95179m1.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                String str3 = m1Var2.f276227x;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                if (str2.equals(str3)) {
                    C95179m1 m1Var3 = C95179m1.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                    m1Var3.getClass();
                    SnsMethodCalculate.markStartTimeMs("setImageAsync", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                    ((C119157j) C119157j.f356862d).mo183875f(new C95193n1(m1Var3, str));
                    SnsMethodCalculate.markEndTimeMs("setImageAsync", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                    C95179m1 m1Var4 = C95179m1.this;
                    SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                    m1Var4.f276228y = str;
                    SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                }
            } catch (Exception e) {
                Log.m105920e("AdLandingPagePureImageComponet", "%s" + Util.stackTraceToString(e));
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$b */
    public class C95181b extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ float f276230a;

        public C95181b(C95179m1 m1Var, float f) {
            this.f276230a = f;
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$2");
            if (view != null) {
                Log.m105918d("AdLandingPagePureImageComponet", "getOutline, viewW=" + view.getWidth() + ", vewH=" + view.getHeight());
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f276230a);
            }
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$c */
    public static class C95182c implements C100880k.C100881a {

        /* renamed from: a */
        public WeakReference<C95179m1> f276231a;

        public C95182c(C95179m1 m1Var) {
            this.f276231a = new WeakReference<>(m1Var);
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
            Log.m105920e("AdLandingPagePureImageComponet", "there is something error happening when downloading qr image.");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
            C95179m1 m1Var = this.f276231a.get();
            if (m1Var != null) {
                Log.m105924i("AdLandingPagePureImageComponet", "download qr image completed, the path " + str + "; cId " + m1Var.mo131857r());
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                SnsMethodCalculate.markStartTimeMs("setImageAsync", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                ((C119157j) C119157j.f356862d).mo183875f(new C95193n1(m1Var, str));
                SnsMethodCalculate.markEndTimeMs("setImageAsync", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                m1Var.f276228y = str;
                SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            } else {
                Log.m105928w("AdLandingPagePureImageComponet", "qrCodePureImageComp is null in weak ref");
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$DownloadSmallFileTaskCallBack");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$d */
    public static class C95183d implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public WeakReference<C95179m1> f276232a;

        public C95183d(C95179m1 m1Var) {
            this.f276232a = new WeakReference<>(m1Var);
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$IOnSceneEndCallback");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$IOnSceneEndCallback");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            C95179m1 m1Var;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$IOnSceneEndCallback");
            if (i == 0 && i2 == 0) {
                try {
                    if (obj instanceof byte[]) {
                        C52075y62 y622 = new C52075y62();
                        y622.parseFrom((byte[]) obj);
                        WeakReference<C95179m1> weakReference = this.f276232a;
                        if (!(weakReference == null || (m1Var = weakReference.get()) == null || !m1Var.mo131857r().equals(y622.f145141f))) {
                            Log.m105924i("AdLandingPagePureImageComponet", "request new qr image imgUrl completed");
                            String str = y622.f145139d;
                            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            m1Var.f276227x = str;
                            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            String str2 = m1Var.f276227x;
                            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            C101294u E = m1Var.mo131693E();
                            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
                            C100891r.m132208c(str2, false, E.f296496b, 0, new C95182c(m1Var));
                        }
                        SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$IOnSceneEndCallback");
                    }
                } catch (Throwable th) {
                    Log.m105920e("AdLandingPagePureImageComponet", th.toString());
                }
            }
            Log.m105920e("AdLandingPagePureImageComponet", "request new qr image imgUrl failed");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet$IOnSceneEndCallback");
        }
    }

    public C95179m1(Context context, C101294u uVar, ViewGroup viewGroup) {
        super(context, uVar, viewGroup);
    }

    /* renamed from: E */
    public final C101294u mo131693E() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        C101294u uVar = (C101294u) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        return uVar;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        this.f276222s = (RoundCornerRelativeLayout) this.f276586n.findViewById(C0966R.C0970id.oie);
        this.f276223t = (ImageView) this.f276586n.findViewById(C0966R.C0970id.jql);
        this.f276224u = (ProgressBar) this.f276586n.findViewById(C0966R.C0970id.i89);
        if (mo131693E().f296741C) {
            Bundle bundle = new Bundle();
            bundle.putString("qrExtInfo", mo131693E().f296742D);
            this.f276226w = new C102251n(this.f276579d, mo131854m(), 1, bundle);
            ImageView imageView = this.f276223t;
            SnsMethodCalculate.markStartTimeMs("createQRLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            C95197o1 o1Var = new C95197o1(this);
            SnsMethodCalculate.markEndTimeMs("createQRLongClickListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            imageView.setOnLongClickListener(o1Var);
        }
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02e0  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67240g() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "fillItem"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.view.View r0 = r1.f276586n
            if (r0 == 0) goto L_0x03e7
            android.widget.ImageView r0 = r1.f276223t
            if (r0 == 0) goto L_0x03e7
            android.widget.ProgressBar r0 = r1.f276224u
            if (r0 != 0) goto L_0x0017
            goto L_0x03e7
        L_0x0017:
            qs2.u r0 = r21.mo131693E()
            if (r0 != 0) goto L_0x0021
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0021:
            qs2.u r0 = r21.mo131693E()
            int r0 = r0.f296745G
            r4 = 1
            if (r0 != 0) goto L_0x0032
            android.widget.ImageView r5 = r1.f276223t
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            r5.setScaleType(r6)
            goto L_0x003b
        L_0x0032:
            if (r0 != r4) goto L_0x003b
            android.widget.ImageView r5 = r1.f276223t
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
        L_0x003b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "cid="
            r5.append(r6)
            qs2.u r6 = r21.mo131693E()
            java.lang.String r6 = r6.f296495a
            r5.append(r6)
            java.lang.String r6 = ", scaleType="
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "AdLandingPagePureImageComponet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            qs2.u r0 = r21.mo131693E()
            java.lang.String r0 = r0.f296747z
            r1.f276227x = r0
            qs2.u r0 = r21.mo131693E()
            java.lang.String r0 = r0.f296739A
            qs2.u r6 = r21.mo131693E()
            float r6 = r6.f296508n
            qs2.u r7 = r21.mo131693E()
            float r7 = r7.f296507m
            qs2.u r8 = r21.mo131693E()
            boolean r8 = r8.f296740B
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x00bf
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x00bf
            if (r8 != 0) goto L_0x00bf
            int r6 = r1.f276588p
            qs2.u r8 = r21.mo131693E()
            float r8 = r8.f296499e
            int r8 = (int) r8
            int r6 = r6 - r8
            qs2.u r8 = r21.mo131693E()
            float r8 = r8.f296500f
            int r8 = (int) r8
            int r6 = r6 - r8
            float r6 = (float) r6
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = r6
        L_0x00a3:
            qs2.u r6 = r21.mo131693E()
            float r6 = r6.f296508n
            float r6 = r6 * r7
            qs2.u r8 = r21.mo131693E()
            float r8 = r8.f296507m
            float r6 = r6 / r8
            android.widget.ImageView r8 = r1.f276223t
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams
            int r7 = (int) r7
            int r6 = (int) r6
            r10.<init>(r7, r6)
            r8.setLayoutParams(r10)
            goto L_0x00e4
        L_0x00bf:
            if (r8 == 0) goto L_0x00d6
            if (r6 == 0) goto L_0x00d6
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x00d6
            android.widget.ImageView r6 = r1.f276223t
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r10 = r1.f276589q
            r7.<init>(r8, r10)
            r6.setLayoutParams(r7)
            goto L_0x00e4
        L_0x00d6:
            android.widget.ImageView r6 = r1.f276223t
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            int r8 = r1.f276588p
            int r10 = r1.f276589q
            r7.<init>(r8, r10)
            r6.setLayoutParams(r7)
        L_0x00e4:
            if (r0 == 0) goto L_0x00f7
            int r6 = r0.length()
            if (r6 <= 0) goto L_0x00f7
            android.widget.ImageView r6 = r1.f276223t     // Catch:{ Exception -> 0x00f6 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x00f6 }
            r6.setBackgroundColor(r0)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
        L_0x00f7:
            java.lang.String r0 = r1.f276227x
            if (r0 == 0) goto L_0x03de
            java.lang.String r0 = r1.f276227x
            int r0 = r0.length()
            if (r0 > 0) goto L_0x0105
            goto L_0x03de
        L_0x0105:
            java.lang.String r0 = r1.f276227x
            qs2.u r6 = r21.mo131693E()
            java.lang.String r7 = "verifyLocalCacheFileByMd5"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            java.lang.String r8 = "adId"
            java.lang.String r0 = ps2.C100891r.m132217l(r8, r0)
            r10 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$CacheHitStaticHelper"
            java.lang.String r13 = "reportImageCacheHit"
            if (r11 != 0) goto L_0x0148
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x0146 }
            if (r11 != 0) goto L_0x012a
            goto L_0x0148
        L_0x012a:
            int r11 = r6.f296519y     // Catch:{ all -> 0x0146 }
            qs2.i0 r11 = r21.mo131854m()     // Catch:{ all -> 0x0146 }
            r11.mo140742i()     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)     // Catch:{ all -> 0x0146 }
            zt3.t r11 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0146 }
            wo2.a r14 = new wo2.a     // Catch:{ all -> 0x0146 }
            r14.<init>(r4)     // Catch:{ all -> 0x0146 }
            zt3.j r11 = (zt3.C119157j) r11     // Catch:{ all -> 0x0146 }
            r11.mo183875f(r14)     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)     // Catch:{ all -> 0x0146 }
            goto L_0x016d
        L_0x0146:
            goto L_0x016d
        L_0x0148:
            java.lang.String r11 = "verifyLocalCacheFileByMd5, local file not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)     // Catch:{ all -> 0x0146 }
            int r11 = r6.f296519y     // Catch:{ all -> 0x0146 }
            qs2.i0 r11 = r21.mo131854m()     // Catch:{ all -> 0x0146 }
            r11.mo140742i()     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)     // Catch:{ all -> 0x0146 }
            zt3.t r11 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0146 }
            wo2.a r14 = new wo2.a     // Catch:{ all -> 0x0146 }
            r14.<init>(r10)     // Catch:{ all -> 0x0146 }
            zt3.j r11 = (zt3.C119157j) r11     // Catch:{ all -> 0x0146 }
            r11.mo183875f(r14)     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)     // Catch:{ all -> 0x0146 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x01d3
        L_0x016d:
            boolean r11 = r6.f296741C
            if (r11 == 0) goto L_0x017f
            boolean r11 = r6.f296743E
            if (r11 == 0) goto L_0x017f
            java.lang.String r0 = "verifyLocalCacheFileByMd5, bEnableQRScan and needUpdateQrUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x01d3
        L_0x017f:
            boolean r11 = r6.f296740B
            if (r11 == 0) goto L_0x018d
            java.lang.String r0 = "verifyLocalCacheFileByMd5, bFullScreen"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x01d3
        L_0x018d:
            java.lang.String r6 = r6.f296746H
            qs2.i0 r11 = r21.mo131854m()
            java.lang.String r11 = r11.mo140735b()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            qs2.u r12 = r21.mo131693E()
            java.lang.String r12 = r12.f296495a
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r14 = ", cid="
            r15 = 1594(0x63a, float:2.234E-42)
            if (r13 == 0) goto L_0x01d9
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 3
            r0.mo175911u(r15, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "verifyLocalCacheFileByMd5, md5 is empty, aid="
            r0.append(r6)
            r0.append(r11)
            r0.append(r14)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x01d3:
            r17 = r2
            r18 = r8
            goto L_0x029b
        L_0x01d9:
            java.lang.String r13 = "isNeedVerify"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            java.lang.Class<h81.h> r16 = h81.C32735h.class
            di3.d r16 = di3.C86312j.m106911c(r16)     // Catch:{ all -> 0x020d }
            r9 = r16
            h81.h r9 = (h81.C32735h) r9     // Catch:{ all -> 0x020d }
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_ad_pic_md5_verify     // Catch:{ all -> 0x020d }
            int r4 = r9.mo58779Qe(r4, r10)     // Catch:{ all -> 0x020d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x020d }
            r9.<init>()     // Catch:{ all -> 0x020d }
            java.lang.String r10 = "isNeedVerify="
            r9.append(r10)     // Catch:{ all -> 0x020d }
            r9.append(r4)     // Catch:{ all -> 0x020d }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x020d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)     // Catch:{ all -> 0x020d }
            if (r4 <= 0) goto L_0x0208
            r4 = 1
            goto L_0x0209
        L_0x0208:
            r4 = 0
        L_0x0209:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            goto L_0x0211
        L_0x020d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            r4 = 0
        L_0x0211:
            if (r4 == 0) goto L_0x0294
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = com.tencent.p014mm.vfs.C86013q1.m106456q(r0)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "verifyLocalCacheFileByMd5, md5="
            r13.append(r15)
            r13.append(r6)
            r17 = r2
            java.lang.String r2 = ", localMd5="
            r13.append(r2)
            r13.append(r4)
            r18 = r8
            java.lang.String r8 = ", Md5-TimeCost="
            r13.append(r8)
            long r19 = java.lang.System.currentTimeMillis()
            long r8 = r19 - r9
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r8)
            boolean r8 = r6.equals(r4)
            if (r8 != 0) goto L_0x028b
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r15)
            r8.append(r6)
            r8.append(r2)
            r8.append(r4)
            java.lang.String r2 = ", delteRet="
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = ", aid="
            r8.append(r0)
            r8.append(r11)
            r8.append(r14)
            r8.append(r12)
            java.lang.String r0 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 2
            r4 = 1594(0x63a, float:2.234E-42)
            r0.mo175911u(r4, r2)
            goto L_0x0298
        L_0x028b:
            r4 = 1594(0x63a, float:2.234E-42)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 1
            r0.mo175911u(r4, r2)
            goto L_0x0298
        L_0x0294:
            r17 = r2
            r18 = r8
        L_0x0298:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x029b:
            java.lang.String r0 = r1.f276227x
            java.lang.String r2 = "getCachedImgPath"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x02e0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r6 == 0) goto L_0x02b4
            goto L_0x02e0
        L_0x02b4:
            r6 = r18
            java.lang.String r0 = ps2.C100891r.m132217l(r6, r0)     // Catch:{ Exception -> 0x02ca }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x02ca }
            if (r6 != 0) goto L_0x02dc
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x02ca }
            if (r6 == 0) goto L_0x02dc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x02e5
        L_0x02ca:
            r0 = move-exception
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r6 = 0
            r7[r6] = r0
            java.lang.String r0 = "MicroMsg.AdLandingPagesDownloadResourceHelper"
            java.lang.String r6 = "%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r7)
        L_0x02dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            goto L_0x02e3
        L_0x02e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
        L_0x02e3:
            java.lang.String r0 = ""
        L_0x02e5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0320
            java.lang.String r2 = "setImageAsync"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            zt3.t r4 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n1 r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.n1
            r6.<init>(r1, r0)
            zt3.j r4 = (zt3.C119157j) r4
            r4.mo183875f(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r1.f276228y = r0
            r2 = 1
            r1.f276225v = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "loaded cached image with  "
            r0.append(r2)
            java.lang.String r2 = r1.f276227x
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0341
        L_0x0320:
            r2 = 0
            r1.f276225v = r2
            java.lang.String r0 = "startLoading"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            android.widget.ProgressBar r4 = r1.f276224u
            r4.setVisibility(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            java.lang.String r0 = r1.f276227x
            qs2.u r4 = r21.mo131693E()
            int r4 = r4.f296496b
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$a r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$a
            r6.<init>()
            ps2.C100891r.m132208c(r0, r2, r4, r2, r6)
        L_0x0341:
            qs2.u r0 = r21.mo131693E()
            boolean r0 = r0.f296741C
            if (r0 == 0) goto L_0x038a
            qs2.u r0 = r21.mo131693E()
            boolean r0 = r0.f296743E
            if (r0 == 0) goto L_0x038a
            java.lang.String r0 = "request new qr image imgUrl"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ all -> 0x0382 }
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r6 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch:{ all -> 0x0382 }
            java.lang.String r7 = ""
            qs2.u r0 = r21.mo131693E()     // Catch:{ all -> 0x0382 }
            java.lang.String r8 = r0.f296742D     // Catch:{ all -> 0x0382 }
            java.lang.String r9 = ""
            qs2.i0 r0 = r21.mo131854m()     // Catch:{ all -> 0x0382 }
            java.lang.String r10 = r0.mo140745l()     // Catch:{ all -> 0x0382 }
            java.lang.String r11 = r21.mo131857r()     // Catch:{ all -> 0x0382 }
            qs2.i0 r0 = r21.mo131854m()     // Catch:{ all -> 0x0382 }
            java.lang.String r12 = r0.mo140741h()     // Catch:{ all -> 0x0382 }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$d r13 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$d     // Catch:{ all -> 0x0382 }
            r13.<init>(r1)     // Catch:{ all -> 0x0382 }
            r6.doAdUpdateQrUrlScene(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0382 }
            goto L_0x038a
        L_0x0382:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x038a:
            qs2.u r0 = r21.mo131693E()
            float r0 = r0.f296744F
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x03d8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "fillItem, cornerRadius="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", cId="
            r2.append(r4)
            java.lang.String r4 = r21.mo131857r()
            r2.append(r4)
            java.lang.String r4 = ", viewHash="
            r2.append(r4)
            android.widget.ImageView r4 = r1.f276223t
            int r4 = r4.hashCode()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r2 = r1.f276222s
            r2.setRadius(r0)
            android.widget.ImageView r2 = r1.f276223t
            r4 = 1
            r2.setClipToOutline(r4)
            android.widget.ImageView r2 = r1.f276223t
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$b r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m1$b
            r4.<init>(r1, r0)
            r2.setOutlineProvider(r4)
        L_0x03d8:
            r2 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x03de:
            java.lang.String r0 = "Pure image component fillItem without imageurl."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x03e7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95179m1.mo67240g():void");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        return C0966R.C0971layout.c1f;
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            return false;
        }
        try {
            if (!this.f276225v) {
                String mD5String = MD5Util.getMD5String(this.f276227x);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("urlMd5", mD5String);
                jSONObject2.put("needDownload", 1);
                jSONObject.put("imgUrlInfo", jSONObject2);
            }
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            return true;
        } catch (JSONException e) {
            Log.printErrStackTrace("AdLandingPagePureImageComponet", e, "", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
            return false;
        }
    }

    /* renamed from: y */
    public void mo118814y() {
        SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
        ViewGroup.LayoutParams layoutParams = this.f276586n.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins((int) mo131693E().f296499e, (int) mo131693E().f296497c, (int) mo131693E().f296500f, (int) mo131693E().f296498d);
            this.f276586n.setLayoutParams(marginLayoutParams);
        }
        SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPagePureImageComponet");
    }
}
