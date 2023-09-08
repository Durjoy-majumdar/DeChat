package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.C115750SphereImageView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.net.URLEncoder;
import org.json.JSONObject;
import ps2.C100880k;
import ps2.C100891r;
import sn0.C90259e;
import vr2.C102260r;
import zs2.C103069a;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.n */
public class C95933n extends BaseTimeLineItem {

    /* renamed from: A */
    public boolean f280100A = false;

    /* renamed from: q */
    public C103069a f280101q;

    /* renamed from: r */
    public ADXml.C95022i f280102r;

    /* renamed from: s */
    public C95941e f280103s;

    /* renamed from: t */
    public boolean f280104t = true;

    /* renamed from: u */
    public boolean f280105u = true;

    /* renamed from: v */
    public String f280106v = null;

    /* renamed from: w */
    public MMHandler f280107w = new MMHandler(Looper.getMainLooper());

    /* renamed from: x */
    public int f280108x = 0;

    /* renamed from: y */
    public C103069a.C103074e f280109y = new C95935b();

    /* renamed from: z */
    public C115750SphereImageView.C115754e f280110z = new C95936c();

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$a */
    public class C95934a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f280111d;

        /* renamed from: e */
        public final /* synthetic */ C95941e f280112e;

        public C95934a(C95933n nVar, int i, C95941e eVar) {
            this.f280111d = i;
            this.f280112e = eVar;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$1");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "enable touch, delay=" + this.f280111d);
            this.f280112e.f280128I0.setTouchEnabled(true);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$b */
    public class C95935b implements C103069a.C103074e {
        public C95935b() {
        }

        /* renamed from: a */
        public void mo131835a(boolean z, String str, Bitmap bitmap, String str2) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "ImageLoader onFinish, isSucc=" + z + ", errInfo=" + str);
            C95933n nVar = C95933n.this;
            if (nVar.f280103s == null) {
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, mViewHolder==null");
                SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
                return;
            }
            ADXml.C95022i iVar = nVar.f280102r;
            String str3 = iVar != null ? iVar.f275715g : "";
            if (str2 == null || !str2.equals(str3)) {
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onFinish, url != nowUrl");
            } else {
                C95933n.this.f280103s.f280128I0.mo176087j(bitmap, str2);
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        }

        /* renamed from: b */
        public void mo131836b(String str) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$c */
    public class C95936c implements C115750SphereImageView.C115754e {

        /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$c$a */
        public class C95937a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ C95941e f280115a;

            public C95937a(C95936c cVar, C95941e eVar) {
                this.f280115a = eVar;
            }

            public void onAnimationEnd(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
                this.f280115a.f280134O0.setVisibility(8);
                this.f280115a.f280134O0.setImageDrawable(new ColorDrawable(this.f280115a.f280134O0.getContext().getResources().getColor(C0966R.color.f2930d)));
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
            }

            public void onAnimationRepeat(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
            }

            public void onAnimationStart(Animation animation) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$c$b */
        public class C95938b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f280116d;

            /* renamed from: e */
            public final /* synthetic */ C95941e f280117e;

            public C95938b(String str, C95941e eVar) {
                this.f280116d = str;
                this.f280117e = eVar;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
                ADXml.C95022i iVar = C95933n.this.f280102r;
                String str = iVar != null ? iVar.f275715g : "";
                String str2 = this.f280116d;
                if (str2 == null || !str2.equals(str)) {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + this.f280116d + ", info.url=" + str);
                } else {
                    Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do shot");
                    C103069a.m136317f(this.f280117e.f280128I0, str, "scene_timeline");
                    C95933n.this.f280104t = false;
                }
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "enable touch and sensor after shot, isInLowPriority=" + C95933n.this.f280100A);
                if (!C95933n.this.f280100A) {
                    this.f280117e.f280128I0.setSensorEnabled(true);
                }
                this.f280117e.f280128I0.setTouchEnabled(true);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
            }
        }

        public C95936c() {
        }

        /* renamed from: a */
        public void mo131837a() {
            SnsMethodCalculate.markStartTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            C95933n nVar = C95933n.this;
            SnsMethodCalculate.markStartTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            nVar.f280108x++;
            SnsMethodCalculate.markEndTimeMs("access$008", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            SnsMethodCalculate.markEndTimeMs(C90259e.C90264e.NAME, "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        }

        /* renamed from: b */
        public void mo131838b(String str) {
            SnsMethodCalculate.markStartTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            ADXml.C95022i iVar = C95933n.this.f280102r;
            String str2 = iVar != null ? iVar.f275715g : "";
            if (str == null || str.equals(str2)) {
                C95941e eVar = C95933n.this.f280103s;
                if (eVar == null) {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, viewHolder==null");
                    SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
                    return;
                }
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, isFirstUpdateImage=" + C95933n.this.f280104t + ", visiable=" + eVar.f280134O0.getVisibility());
                if (C95933n.this.f280104t) {
                    if (eVar.f280134O0.getVisibility() == 0) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(350);
                        alphaAnimation.setAnimationListener(new C95937a(this, eVar));
                        Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do maskImage anim");
                        eVar.f280134O0.startAnimation(alphaAnimation);
                    }
                    ADXml.C95022i iVar2 = C95933n.this.f280102r;
                    if (iVar2 == null || C103069a.m136315c(iVar2.f275715g, "scene_timeline")) {
                        Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "don't need shot, enable sensor, isInLowPriority=" + C95933n.this.f280100A);
                        if (!C95933n.this.f280100A) {
                            eVar.f280128I0.setSensorEnabled(true);
                        }
                        C95933n.this.f280104t = false;
                    } else {
                        Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "disable touch before shot");
                        eVar.f280128I0.setTouchEnabled(false);
                        eVar.f280128I0.mo176088k();
                        eVar.f280128I0.mo176044d();
                        C95933n.this.f280107w.postDelayed(new C95938b(str, eVar), 800);
                    }
                }
                if (eVar.f280135P0.getVisibility() == 0) {
                    Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "hide progressView");
                    eVar.f280135P0.setVisibility(8);
                }
                SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
                return;
            }
            Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onUpdateImage, url != CardInfo.sphereImageUrl, url=" + str + ", info.url=" + str2);
            SnsMethodCalculate.markEndTimeMs("onUpdateImage", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        }

        /* renamed from: c */
        public void mo131839c() {
            SnsMethodCalculate.markStartTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            SnsMethodCalculate.markEndTimeMs("onTouchBegin", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        }

        /* renamed from: d */
        public void mo131840d() {
            SnsMethodCalculate.markStartTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            SnsMethodCalculate.markEndTimeMs("onAngleChange", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        }

        public void onDetachedFromWindow() {
            SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDetachedFromWindow reset");
            C95933n nVar = C95933n.this;
            nVar.f280104t = true;
            nVar.f280105u = true;
            nVar.f280106v = null;
            nVar.f280107w.removeCallbacksAndMessages((Object) null);
            try {
                JSONObject jSONObject = new JSONObject();
                C95933n nVar2 = C95933n.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
                int i = nVar2.f280108x;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
                jSONObject.put("panCount", i);
                jSONObject.put("type", 1);
                String encode = URLEncoder.encode(jSONObject.toString(), "UTF-8");
                C95933n nVar3 = C95933n.this;
                SnsInfo i2 = nVar3.f279906g.mo132919i(nVar3.f280103s.f279948c);
                String aid = i2.getAid();
                if (aid == null) {
                    aid = "";
                }
                C115669n.INSTANCE.mo160131h(17539, i2.getTimeLine().f283893Id, aid, i2.getAdInfo().uxInfo, 1, encode);
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "KVReport, id=17539, touchCount=" + encode + ", snsInfo.hash=" + i2.hashCode());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "kvStat exp:" + e.toString());
            }
            C95933n nVar4 = C95933n.this;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            nVar4.f280108x = 0;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
            SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$d */
    public class C95939d implements C103069a.C103074e {

        /* renamed from: a */
        public final /* synthetic */ String f280119a;

        /* renamed from: b */
        public final /* synthetic */ C95941e f280120b;

        /* renamed from: c */
        public final /* synthetic */ String f280121c;

        /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$d$a */
        public class C95940a implements C100880k.C100881a {

            /* renamed from: a */
            public String f280123a;

            public C95940a() {
                this.f280123a = C95939d.this.f280121c;
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
                Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloadError thumb");
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb, path=" + str);
                ADXml.C95022i iVar = C95933n.this.f280102r;
                String str2 = iVar != null ? iVar.f275716h : "";
                String str3 = this.f280123a;
                if (str3 == null || !str3.equals(str2)) {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded, url != nowUrl");
                } else if (C95939d.this.f280120b.f280134O0.getVisibility() == 0) {
                    try {
                        C95939d.this.f280120b.f280134O0.setImageBitmap(MMBitmapFactory.m98734c(str));
                    } catch (Throwable th) {
                        Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb exp:" + th.toString());
                    }
                }
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
            }
        }

        public C95939d(String str, C95941e eVar, String str2) {
            this.f280119a = str;
            this.f280120b = eVar;
            this.f280121c = str2;
        }

        /* renamed from: a */
        public void mo131835a(boolean z, String str, Bitmap bitmap, String str2) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
            if (str2 == null || !str2.equals(this.f280119a)) {
                SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
                return;
            }
            if (bitmap != null) {
                this.f280120b.f280134O0.setImageBitmap(bitmap);
            } else {
                Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "show progressView");
                this.f280120b.f280135P0.setVisibility(0);
                this.f280120b.f280135P0.mo153891a();
                if (!TextUtils.isEmpty(this.f280121c)) {
                    Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "no shot and thumb cache, start download thumb image");
                    C100891r.m132208c(this.f280121c, false, 133, 0, new C95940a());
                } else {
                    Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "thumbUrl is empty");
                }
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        }

        /* renamed from: b */
        public void mo131836b(String str) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.n$e */
    public static class C95941e extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public View f280125F0;

        /* renamed from: G0 */
        public View f280126G0;

        /* renamed from: H0 */
        public View f280127H0;

        /* renamed from: I0 */
        public C115750SphereImageView f280128I0;

        /* renamed from: J0 */
        public TextView f280129J0;

        /* renamed from: K0 */
        public TextView f280130K0;

        /* renamed from: L0 */
        public TextView f280131L0;

        /* renamed from: M0 */
        public TextView f280132M0;

        /* renamed from: N0 */
        public View f280133N0;

        /* renamed from: O0 */
        public ImageView f280134O0;

        /* renamed from: P0 */
        public MMPinProgressBtn f280135P0;
    }

    /* renamed from: C */
    public void mo133462C(C115750SphereImageView sphereImageView, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsInLowPriority", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        Log.m105918d("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "setIsInLowPriority, isInLowPriority=" + z + ", hash=" + sphereImageView.hashCode());
        this.f280100A = z;
        if (z) {
            sphereImageView.setSensorEnabled(false);
        } else if (!this.f280104t) {
            sphereImageView.setSensorEnabled(true);
        }
        SnsMethodCalculate.markEndTimeMs("setIsInLowPriority", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        try {
            C95941e eVar = (C95941e) baseViewHolder;
            this.f280103s = eVar;
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, holder=" + baseViewHolder.hashCode());
            if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c4k);
                if (!baseViewHolder.f279976q) {
                    eVar.f280127H0 = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                    baseViewHolder.f279976q = true;
                }
            } else if (!baseViewHolder.f279976q) {
                eVar.f280127H0 = baseViewHolder.f279960i.findViewById(C0966R.C0970id.jzb);
                baseViewHolder.f279976q = true;
            }
            eVar.f280125F0 = eVar.f279960i.findViewById(C0966R.C0970id.kri);
            eVar.f280126G0 = eVar.f279960i.findViewById(C0966R.C0970id.agt);
            eVar.f280129J0 = (TextView) eVar.f279960i.findViewById(C0966R.C0970id.krk);
            eVar.f280130K0 = (TextView) eVar.f279960i.findViewById(C0966R.C0970id.krj);
            eVar.f280131L0 = (TextView) eVar.f279960i.findViewById(C0966R.C0970id.agv);
            eVar.f280132M0 = (TextView) eVar.f279960i.findViewById(C0966R.C0970id.agu);
            eVar.f280128I0 = (C115750SphereImageView) eVar.f279960i.findViewById(C0966R.C0970id.jzc);
            eVar.f280133N0 = eVar.f279960i.findViewById(C0966R.C0970id.f357559ah3);
            eVar.f280134O0 = (ImageView) eVar.f279960i.findViewById(C0966R.C0970id.gos);
            MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) eVar.f279960i.findViewById(C0966R.C0970id.i7j);
            eVar.f280135P0 = mMPinProgressBtn;
            mMPinProgressBtn.setMax(50);
            float z = C102260r.m134886z(C0966R.dimen.anw);
            float z2 = C102260r.m134886z(C0966R.dimen.anr);
            int i = 0;
            eVar.f280129J0.setTextSize(0, z);
            eVar.f280130K0.setTextSize(0, z2);
            eVar.f280131L0.setTextSize(0, z);
            eVar.f280132M0.setTextSize(0, z2);
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent, disable touch and sensor");
            eVar.f280128I0.setTouchEnabled(false);
            eVar.f280128I0.setSensorEnabled(false);
            eVar.f280128I0.mo176086i(1.8f, 30.0f, -2.0f);
            eVar.f280128I0.setTouchSensitivity(0.45f);
            eVar.f280128I0.setEventListener(this.f280110z);
            eVar.f280128I0.setOnlyHorizontalScroll(true);
            C103069a aVar = new C103069a();
            this.f280101q = aVar;
            C103069a.C103074e eVar2 = this.f280109y;
            SnsMethodCalculate.markStartTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            aVar.f304112a = eVar2;
            SnsMethodCalculate.markEndTimeMs("setOnLoadListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader");
            ADXml.C95022i iVar = this.f280102r;
            if (iVar != null) {
                i = iVar.f275714f;
            }
            this.f280107w.postDelayed(new C95934a(this, i, eVar), (long) i);
            Log.m105924i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "viewHash=" + eVar.f280128I0.hashCode() + ", touchDelay=" + i);
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "buildContent exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x01ee A[Catch:{ all -> 0x053a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x023f A[Catch:{ all -> 0x053a }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02fe A[Catch:{ all -> 0x053a }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0496 A[SYNTHETIC, Splitter:B:76:0x0496] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r26, int r27, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r28, com.tencent.p014mm.protocal.protobuf.TimeLineObject r29, int r30, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r31) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r28
            r3 = r29
            java.lang.String r4 = "MicroMsg.SphereImageView.SphereCardAdTimeLineItem"
            java.lang.String r5 = "fillItem"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x053a }
            boolean r9 = r0.f279985u0     // Catch:{ all -> 0x053a }
            if (r9 == 0) goto L_0x0022
            java.lang.String r0 = "fillItem, holder is busy"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x053a }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0022:
            r9 = r0
            com.tencent.mm.plugin.sns.ui.item.n$e r9 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95933n.C95941e) r9     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r2.f281367a     // Catch:{ all -> 0x053a }
            if (r10 == 0) goto L_0x0036
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r10.getAdXml()     // Catch:{ all -> 0x053a }
            if (r12 == 0) goto L_0x0036
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r10.getAdXml()     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.ADXml$i r12 = r12.adSphereCardInfo     // Catch:{ all -> 0x053a }
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            r1.f280102r = r12     // Catch:{ all -> 0x053a }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x053a }
            r14 = 24
            r15 = 1
            if (r13 >= r14) goto L_0x0066
            if (r12 == 0) goto L_0x0066
            java.lang.String r14 = r1.f280106v     // Catch:{ all -> 0x053a }
            if (r14 == 0) goto L_0x004e
            java.lang.String r11 = r12.f275715g     // Catch:{ all -> 0x053a }
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x053a }
            if (r11 != 0) goto L_0x0066
        L_0x004e:
            r1.f280104t = r15     // Catch:{ all -> 0x053a }
            r1.f280105u = r15     // Catch:{ all -> 0x053a }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x053a }
            r11.<init>()     // Catch:{ all -> 0x053a }
            java.lang.String r14 = "fillItem, reset, sdk_int="
            r11.append(r14)     // Catch:{ all -> 0x053a }
            r11.append(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x053a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)     // Catch:{ all -> 0x053a }
        L_0x0066:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x053a }
            r11.<init>()     // Catch:{ all -> 0x053a }
            java.lang.String r13 = "ad fillItem, sphereCard, pos="
            r11.append(r13)     // Catch:{ all -> 0x053a }
            r13 = r27
            r11.append(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r13 = ", snsId="
            r11.append(r13)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x007f
            java.lang.String r3 = ""
            goto L_0x0081
        L_0x007f:
            java.lang.String r3 = r3.f283893Id     // Catch:{ all -> 0x053a }
        L_0x0081:
            r11.append(r3)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = ", hash="
            r11.append(r3)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x053a }
            r11.append(r3)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = ", isFirst="
            r11.append(r3)     // Catch:{ all -> 0x053a }
            boolean r3 = r1.f280105u     // Catch:{ all -> 0x053a }
            r11.append(r3)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = ", snsInfo.hash="
            r11.append(r3)     // Catch:{ all -> 0x053a }
            r3 = 0
            if (r10 == 0) goto L_0x00a9
            int r13 = r10.hashCode()     // Catch:{ all -> 0x053a }
            goto L_0x00aa
        L_0x00a9:
            r13 = 0
        L_0x00aa:
            r11.append(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x053a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)     // Catch:{ all -> 0x053a }
            android.view.View r11 = r9.f280125F0     // Catch:{ all -> 0x053a }
            k20.a r13 = new k20.a     // Catch:{ all -> 0x053a }
            r13.<init>()     // Catch:{ all -> 0x053a }
            r14 = 8
            k20.C60958c.m71442b(r14, r13)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r17 = r13.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
            java.lang.Object r13 = r13.mo10231a(r3)     // Catch:{ all -> 0x053a }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x053a }
            int r13 = r13.intValue()     // Catch:{ all -> 0x053a }
            r11.setVisibility(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r18 = "fillItem"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r11
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x053a }
            android.widget.TextView r11 = r9.f280129J0     // Catch:{ all -> 0x053a }
            r11.setVisibility(r14)     // Catch:{ all -> 0x053a }
            android.widget.TextView r11 = r9.f280130K0     // Catch:{ all -> 0x053a }
            r11.setVisibility(r14)     // Catch:{ all -> 0x053a }
            android.view.View r11 = r9.f280126G0     // Catch:{ all -> 0x053a }
            k20.a r13 = new k20.a     // Catch:{ all -> 0x053a }
            r13.<init>()     // Catch:{ all -> 0x053a }
            k20.C60958c.m71442b(r14, r13)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r17 = r13.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
            java.lang.Object r13 = r13.mo10231a(r3)     // Catch:{ all -> 0x053a }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x053a }
            int r13 = r13.intValue()     // Catch:{ all -> 0x053a }
            r11.setVisibility(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r18 = "fillItem"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r11
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x053a }
            android.widget.TextView r11 = r9.f280131L0     // Catch:{ all -> 0x053a }
            r11.setVisibility(r14)     // Catch:{ all -> 0x053a }
            android.widget.TextView r11 = r9.f280132M0     // Catch:{ all -> 0x053a }
            r11.setVisibility(r14)     // Catch:{ all -> 0x053a }
            android.view.View r11 = r9.f280133N0     // Catch:{ all -> 0x053a }
            k20.a r13 = new k20.a     // Catch:{ all -> 0x053a }
            r13.<init>()     // Catch:{ all -> 0x053a }
            k20.C60958c.m71442b(r14, r13)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r17 = r13.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r11
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
            java.lang.Object r13 = r13.mo10231a(r3)     // Catch:{ all -> 0x053a }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x053a }
            int r13 = r13.intValue()     // Catch:{ all -> 0x053a }
            r11.setVisibility(r13)     // Catch:{ all -> 0x053a }
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r18 = "fillItem"
            java.lang.String r19 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r11
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x053a }
            if (r12 == 0) goto L_0x051a
            android.app.Activity r11 = r1.f279904e     // Catch:{ all -> 0x053a }
            java.lang.String r13 = "window"
            java.lang.Object r11 = r11.getSystemService(r13)     // Catch:{ all -> 0x053a }
            android.view.WindowManager r11 = (android.view.WindowManager) r11     // Catch:{ all -> 0x053a }
            android.view.Display r13 = r11.getDefaultDisplay()     // Catch:{ all -> 0x053a }
            int r13 = r13.getWidth()     // Catch:{ all -> 0x053a }
            android.view.Display r11 = r11.getDefaultDisplay()     // Catch:{ all -> 0x053a }
            int r11 = r11.getHeight()     // Catch:{ all -> 0x053a }
            int r11 = java.lang.Math.min(r13, r11)     // Catch:{ all -> 0x053a }
            android.app.Activity r13 = r1.f279904e     // Catch:{ all -> 0x053a }
            r3 = 56
            int r3 = kg3.C76577a.m92151b(r13, r3)     // Catch:{ all -> 0x053a }
            android.app.Activity r13 = r1.f279904e     // Catch:{ all -> 0x053a }
            r14 = 14
            int r13 = kg3.C76577a.m92151b(r13, r14)     // Catch:{ all -> 0x053a }
            android.app.Activity r14 = r1.f279904e     // Catch:{ all -> 0x053a }
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ all -> 0x053a }
            r15 = 2131165590(0x7f070196, float:1.7945401E38)
            int r14 = r14.getDimensionPixelSize(r15)     // Catch:{ all -> 0x053a }
            int r11 = r11 - r3
            int r11 = r11 - r13
            int r11 = r11 - r14
            int r3 = r12.f275709a     // Catch:{ all -> 0x053a }
            r13 = -2
            if (r3 != 0) goto L_0x01de
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x053a }
            r3.<init>(r13, r13)     // Catch:{ all -> 0x053a }
            r3.width = r11     // Catch:{ all -> 0x053a }
            float r11 = (float) r11     // Catch:{ all -> 0x053a }
            r13 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r13
            int r11 = (int) r11     // Catch:{ all -> 0x053a }
            r3.height = r11     // Catch:{ all -> 0x053a }
        L_0x01dc:
            r11 = r3
            goto L_0x01ec
        L_0x01de:
            r14 = 1
            if (r3 != r14) goto L_0x01eb
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x053a }
            r3.<init>(r13, r13)     // Catch:{ all -> 0x053a }
            r3.width = r11     // Catch:{ all -> 0x053a }
            r3.height = r11     // Catch:{ all -> 0x053a }
            goto L_0x01dc
        L_0x01eb:
            r11 = 0
        L_0x01ec:
            if (r11 == 0) goto L_0x0237
            android.view.View r3 = r9.f280127H0     // Catch:{ all -> 0x053a }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ all -> 0x053a }
            int r13 = r11.width     // Catch:{ all -> 0x053a }
            r3.width = r13     // Catch:{ all -> 0x053a }
            int r13 = r11.height     // Catch:{ all -> 0x053a }
            r3.height = r13     // Catch:{ all -> 0x053a }
            android.view.View r13 = r9.f280127H0     // Catch:{ all -> 0x053a }
            r13.setLayoutParams(r3)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280127H0     // Catch:{ all -> 0x053a }
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r3 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r3     // Catch:{ all -> 0x053a }
            android.app.Activity r13 = r1.f279904e     // Catch:{ all -> 0x053a }
            r14 = 8
            int r13 = kg3.C76577a.m92151b(r13, r14)     // Catch:{ all -> 0x053a }
            float r13 = (float) r13     // Catch:{ all -> 0x053a }
            r3.setRadius(r13)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ all -> 0x053a }
            int r13 = r11.width     // Catch:{ all -> 0x053a }
            r3.width = r13     // Catch:{ all -> 0x053a }
            int r11 = r11.height     // Catch:{ all -> 0x053a }
            r3.height = r11     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r11 = r9.f280128I0     // Catch:{ all -> 0x053a }
            r11.setLayoutParams(r3)     // Catch:{ all -> 0x053a }
            android.widget.ImageView r11 = r9.f280134O0     // Catch:{ all -> 0x053a }
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()     // Catch:{ all -> 0x053a }
            int r13 = r3.width     // Catch:{ all -> 0x053a }
            r11.width = r13     // Catch:{ all -> 0x053a }
            int r3 = r3.height     // Catch:{ all -> 0x053a }
            r11.height = r3     // Catch:{ all -> 0x053a }
            android.widget.ImageView r3 = r9.f280134O0     // Catch:{ all -> 0x053a }
            r3.setLayoutParams(r11)     // Catch:{ all -> 0x053a }
        L_0x0237:
            int r3 = r12.f275713e     // Catch:{ all -> 0x053a }
            r11 = 1076048691(0x40233333, float:2.55)
            r13 = 2
            if (r3 != 0) goto L_0x02fe
            int[] r3 = new int[r13]     // Catch:{ all -> 0x053a }
            int r14 = r12.f275712d     // Catch:{ all -> 0x053a }
            float r14 = (float) r14     // Catch:{ all -> 0x053a }
            float r14 = r14 * r11
            int r14 = (int) r14     // Catch:{ all -> 0x053a }
            r15 = 0
            int r14 = android.graphics.Color.argb(r14, r15, r15, r15)     // Catch:{ all -> 0x053a }
            r3[r15] = r14     // Catch:{ all -> 0x053a }
            int r14 = android.graphics.Color.argb(r15, r15, r15, r15)     // Catch:{ all -> 0x053a }
            r16 = 1
            r3[r16] = r14     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable r14 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable$Orientation r11 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ all -> 0x053a }
            r14.<init>(r11, r3)     // Catch:{ all -> 0x053a }
            r14.setGradientType(r15)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280125F0     // Catch:{ all -> 0x053a }
            r3.setBackground(r14)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = r12.f275710b     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 == 0) goto L_0x0275
            java.lang.String r3 = r12.f275711c     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x02b6
        L_0x0275:
            android.view.View r3 = r9.f280125F0     // Catch:{ all -> 0x053a }
            k20.a r11 = new k20.a     // Catch:{ all -> 0x053a }
            r11.<init>()     // Catch:{ all -> 0x053a }
            r14 = 0
            k20.C60958c.m71442b(r14, r11)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r18 = r11.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r20 = "fillItem"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x053a }
            r14 = 0
            java.lang.Object r11 = r11.mo10231a(r14)     // Catch:{ all -> 0x053a }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x053a }
            int r11 = r11.intValue()     // Catch:{ all -> 0x053a }
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r3
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
        L_0x02b6:
            java.lang.String r3 = r12.f275710b     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x02d9
            android.widget.TextView r3 = r9.f280129J0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            android.widget.TextView r3 = r9.f280129J0     // Catch:{ all -> 0x053a }
            com.tencent.mm.smiley.p0 r11 = com.tencent.p014mm.smiley.C96963p0.wx0()     // Catch:{ all -> 0x053a }
            android.widget.TextView r14 = r9.f280129J0     // Catch:{ all -> 0x053a }
            android.content.Context r14 = r14.getContext()     // Catch:{ all -> 0x053a }
            java.lang.String r15 = r12.f275710b     // Catch:{ all -> 0x053a }
            android.text.SpannableString r11 = r11.mo83004M(r14, r15)     // Catch:{ all -> 0x053a }
            r3.setText(r11)     // Catch:{ all -> 0x053a }
        L_0x02d9:
            java.lang.String r3 = r12.f275711c     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x03da
            android.widget.TextView r3 = r9.f280130K0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            android.widget.TextView r3 = r9.f280130K0     // Catch:{ all -> 0x053a }
            com.tencent.mm.smiley.p0 r11 = com.tencent.p014mm.smiley.C96963p0.wx0()     // Catch:{ all -> 0x053a }
            android.widget.TextView r14 = r9.f280130K0     // Catch:{ all -> 0x053a }
            android.content.Context r14 = r14.getContext()     // Catch:{ all -> 0x053a }
            java.lang.String r15 = r12.f275711c     // Catch:{ all -> 0x053a }
            android.text.SpannableString r11 = r11.mo83004M(r14, r15)     // Catch:{ all -> 0x053a }
            r3.setText(r11)     // Catch:{ all -> 0x053a }
            goto L_0x03da
        L_0x02fe:
            r11 = 1
            if (r3 != r11) goto L_0x03da
            int[] r3 = new int[r13]     // Catch:{ all -> 0x053a }
            int r11 = r12.f275712d     // Catch:{ all -> 0x053a }
            float r11 = (float) r11     // Catch:{ all -> 0x053a }
            r14 = 1076048691(0x40233333, float:2.55)
            float r11 = r11 * r14
            int r11 = (int) r11     // Catch:{ all -> 0x053a }
            r14 = 0
            int r11 = android.graphics.Color.argb(r11, r14, r14, r14)     // Catch:{ all -> 0x053a }
            r3[r14] = r11     // Catch:{ all -> 0x053a }
            int r11 = android.graphics.Color.argb(r14, r14, r14, r14)     // Catch:{ all -> 0x053a }
            r15 = 1
            r3[r15] = r11     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable$Orientation r15 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP     // Catch:{ all -> 0x053a }
            r11.<init>(r15, r3)     // Catch:{ all -> 0x053a }
            r11.setGradientType(r14)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280126G0     // Catch:{ all -> 0x053a }
            r3.setBackground(r11)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = r12.f275710b     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 == 0) goto L_0x0339
            java.lang.String r3 = r12.f275711c     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x0394
        L_0x0339:
            android.view.View r3 = r9.f280126G0     // Catch:{ all -> 0x053a }
            k20.a r11 = new k20.a     // Catch:{ all -> 0x053a }
            r11.<init>()     // Catch:{ all -> 0x053a }
            r14 = 0
            k20.C60958c.m71442b(r14, r11)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r18 = r11.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r20 = "fillItem"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x053a }
            r14 = 0
            java.lang.Object r11 = r11.mo10231a(r14)     // Catch:{ all -> 0x053a }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x053a }
            int r11 = r11.intValue()     // Catch:{ all -> 0x053a }
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r3
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280133N0     // Catch:{ all -> 0x053a }
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()     // Catch:{ all -> 0x053a }
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3     // Catch:{ all -> 0x053a }
            android.view.View r11 = r9.f280127H0     // Catch:{ all -> 0x053a }
            android.content.Context r11 = r11.getContext()     // Catch:{ all -> 0x053a }
            r14 = 4
            int r11 = kg3.C76577a.m92151b(r11, r14)     // Catch:{ all -> 0x053a }
            r3.topMargin = r11     // Catch:{ all -> 0x053a }
            android.view.View r11 = r9.f280133N0     // Catch:{ all -> 0x053a }
            r11.setLayoutParams(r3)     // Catch:{ all -> 0x053a }
        L_0x0394:
            java.lang.String r3 = r12.f275710b     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x03b7
            android.widget.TextView r3 = r9.f280131L0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            android.widget.TextView r3 = r9.f280131L0     // Catch:{ all -> 0x053a }
            com.tencent.mm.smiley.p0 r11 = com.tencent.p014mm.smiley.C96963p0.wx0()     // Catch:{ all -> 0x053a }
            android.widget.TextView r14 = r9.f280131L0     // Catch:{ all -> 0x053a }
            android.content.Context r14 = r14.getContext()     // Catch:{ all -> 0x053a }
            java.lang.String r15 = r12.f275710b     // Catch:{ all -> 0x053a }
            android.text.SpannableString r11 = r11.mo83004M(r14, r15)     // Catch:{ all -> 0x053a }
            r3.setText(r11)     // Catch:{ all -> 0x053a }
        L_0x03b7:
            java.lang.String r3 = r12.f275711c     // Catch:{ all -> 0x053a }
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x053a }
            if (r3 != 0) goto L_0x03da
            android.widget.TextView r3 = r9.f280132M0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            android.widget.TextView r3 = r9.f280132M0     // Catch:{ all -> 0x053a }
            com.tencent.mm.smiley.p0 r11 = com.tencent.p014mm.smiley.C96963p0.wx0()     // Catch:{ all -> 0x053a }
            android.widget.TextView r14 = r9.f280132M0     // Catch:{ all -> 0x053a }
            android.content.Context r14 = r14.getContext()     // Catch:{ all -> 0x053a }
            java.lang.String r15 = r12.f275711c     // Catch:{ all -> 0x053a }
            android.text.SpannableString r11 = r11.mo83004M(r14, r15)     // Catch:{ all -> 0x053a }
            r3.setText(r11)     // Catch:{ all -> 0x053a }
        L_0x03da:
            if (r10 == 0) goto L_0x048f
            com.tencent.mm.plugin.sns.storage.ADInfo r3 = r10.getAdInfo()     // Catch:{ all -> 0x053a }
            boolean r3 = r3.isWeapp()     // Catch:{ all -> 0x053a }
            if (r3 == 0) goto L_0x048f
            int[] r3 = new int[r13]     // Catch:{ all -> 0x053a }
            int r10 = r12.f275712d     // Catch:{ all -> 0x053a }
            float r10 = (float) r10     // Catch:{ all -> 0x053a }
            r11 = 1076048691(0x40233333, float:2.55)
            float r10 = r10 * r11
            int r10 = (int) r10     // Catch:{ all -> 0x053a }
            r11 = 0
            int r10 = android.graphics.Color.argb(r10, r11, r11, r11)     // Catch:{ all -> 0x053a }
            r3[r11] = r10     // Catch:{ all -> 0x053a }
            int r10 = android.graphics.Color.argb(r11, r11, r11, r11)     // Catch:{ all -> 0x053a }
            r13 = 1
            r3[r13] = r10     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable     // Catch:{ all -> 0x053a }
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP     // Catch:{ all -> 0x053a }
            r10.<init>(r13, r3)     // Catch:{ all -> 0x053a }
            r10.setGradientType(r11)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280126G0     // Catch:{ all -> 0x053a }
            k20.a r13 = new k20.a     // Catch:{ all -> 0x053a }
            r13.<init>()     // Catch:{ all -> 0x053a }
            k20.C60958c.m71442b(r11, r13)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r18 = r13.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r20 = "fillItem"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x053a }
            r11 = 0
            java.lang.Object r13 = r13.mo10231a(r11)     // Catch:{ all -> 0x053a }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ all -> 0x053a }
            int r11 = r13.intValue()     // Catch:{ all -> 0x053a }
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r3
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280126G0     // Catch:{ all -> 0x053a }
            r3.setBackground(r10)     // Catch:{ all -> 0x053a }
            android.view.View r3 = r9.f280133N0     // Catch:{ all -> 0x053a }
            k20.a r10 = new k20.a     // Catch:{ all -> 0x053a }
            r10.<init>()     // Catch:{ all -> 0x053a }
            r11 = 0
            k20.C60958c.m71442b(r11, r10)     // Catch:{ all -> 0x053a }
            java.lang.Object[] r18 = r10.mo10232b()     // Catch:{ all -> 0x053a }
            java.lang.String r19 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r20 = "fillItem"
            java.lang.String r21 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r3
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x053a }
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)     // Catch:{ all -> 0x053a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x053a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x053a }
            r3.setVisibility(r10)     // Catch:{ all -> 0x053a }
            java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/item/SphereCardAdTimeLineItem"
            java.lang.String r19 = "fillItem"
            java.lang.String r20 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r3
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053a }
        L_0x048f:
            boolean r3 = r1.f280105u     // Catch:{ all -> 0x053a }
            java.lang.String r10 = "scene_timeline"
            if (r3 == 0) goto L_0x04b0
            android.widget.ImageView r3 = r9.f280134O0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            java.lang.String r3 = r12.f275715g     // Catch:{ all -> 0x053a }
            java.lang.String r11 = r12.f275716h     // Catch:{ all -> 0x053a }
            zs2.a$d r13 = new zs2.a$d     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.ui.item.n$d r14 = new com.tencent.mm.plugin.sns.ui.item.n$d     // Catch:{ all -> 0x053a }
            r14.<init>(r3, r9, r11)     // Catch:{ all -> 0x053a }
            r13.<init>(r3, r11, r10, r14)     // Catch:{ all -> 0x053a }
            r3 = 0
            java.lang.Void[] r11 = new java.lang.Void[r3]     // Catch:{ all -> 0x053a }
            r13.execute(r11)     // Catch:{ all -> 0x053a }
        L_0x04b0:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            r11 = 0
            r3.setVisibility(r11)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            r11 = r31
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r11 = r11.f278572f     // Catch:{ all -> 0x053a }
            android.view.View$OnClickListener r11 = r11.f280365U     // Catch:{ all -> 0x053a }
            r3.setOnClickListener(r11)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            r3.setTag(r0)     // Catch:{ all -> 0x053a }
            boolean r0 = r1.f280104t     // Catch:{ all -> 0x053a }
            if (r0 != 0) goto L_0x04d9
            boolean r0 = r1.f280100A     // Catch:{ all -> 0x053a }
            if (r0 != 0) goto L_0x04d9
            java.lang.String r0 = "fillItem !first, enable sensor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r0 = r9.f280128I0     // Catch:{ all -> 0x053a }
            r3 = 1
            r0.setSensorEnabled(r3)     // Catch:{ all -> 0x053a }
        L_0x04d9:
            java.lang.String r0 = r1.f280106v     // Catch:{ all -> 0x053a }
            if (r0 == 0) goto L_0x04e7
            java.lang.String r3 = r12.f275715g     // Catch:{ all -> 0x053a }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x053a }
            if (r0 == 0) goto L_0x04e7
        L_0x04e5:
            r0 = 0
            goto L_0x0517
        L_0x04e7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x053a }
            r0.<init>()     // Catch:{ all -> 0x053a }
            java.lang.String r3 = "fillItem, loadImage, hash="
            r0.append(r3)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r3 = r9.f280128I0     // Catch:{ all -> 0x053a }
            int r3 = r3.hashCode()     // Catch:{ all -> 0x053a }
            r0.append(r3)     // Catch:{ all -> 0x053a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x053a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ all -> 0x053a }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView r0 = r9.f280128I0     // Catch:{ all -> 0x053a }
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ all -> 0x053a }
            zs2.a r3 = r1.f280101q     // Catch:{ all -> 0x053a }
            java.lang.String r9 = r12.f275715g     // Catch:{ all -> 0x053a }
            int r11 = r0.width     // Catch:{ all -> 0x053a }
            int r0 = r0.height     // Catch:{ all -> 0x053a }
            r3.mo142780e(r9, r11, r0, r10)     // Catch:{ all -> 0x053a }
            java.lang.String r0 = r12.f275715g     // Catch:{ all -> 0x053a }
            r1.f280106v = r0     // Catch:{ all -> 0x053a }
            goto L_0x04e5
        L_0x0517:
            r1.f280105u = r0     // Catch:{ all -> 0x053a }
            goto L_0x0520
        L_0x051a:
            java.lang.String r0 = "sphereCardInfo==null, invalid sphereCard"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ all -> 0x053a }
        L_0x0520:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x053a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x053a }
            r0.<init>()     // Catch:{ all -> 0x053a }
            java.lang.String r3 = "fillItem total timeCost="
            r0.append(r3)     // Catch:{ all -> 0x053a }
            long r9 = r9 - r7
            r0.append(r9)     // Catch:{ all -> 0x053a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x053a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ all -> 0x053a }
            goto L_0x0553
        L_0x053a:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "fillItem exp="
            r3.append(r7)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x0553:
            r0 = 3
            r1.mo133391g(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95933n.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem");
        return "SphereCardAdTimeLineItem";
    }
}
