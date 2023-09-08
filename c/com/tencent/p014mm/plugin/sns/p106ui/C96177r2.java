package com.tencent.p014mm.plugin.sns.p106ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import br2.C54550e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ht1.C60187m5;
import ht1.C60208v1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lo2.C99516a;
import lp2.C46884e;
import org.json.JSONObject;
import os2.C100417r0;
import p1057w2.C90885a;
import ps2.C100853b;
import rq2.C13098l;
import up2.C102064e;
import vr2.C102236a0;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.r2 */
public class C96177r2 implements View.OnClickListener {

    /* renamed from: A */
    public int f280985A = 0;

    /* renamed from: B */
    public C102064e.C102068b f280986B = new C96178a();

    /* renamed from: d */
    public int f280987d;

    /* renamed from: e */
    public Context f280988e;

    /* renamed from: f */
    public View f280989f;

    /* renamed from: g */
    public RoundedCornerFrameLayout f280990g;

    /* renamed from: h */
    public ImageView f280991h;

    /* renamed from: i */
    public TextView f280992i;

    /* renamed from: j */
    public TextView f280993j;

    /* renamed from: n */
    public Button f280994n;

    /* renamed from: o */
    public View f280995o;

    /* renamed from: p */
    public View f280996p;

    /* renamed from: q */
    public View f280997q;

    /* renamed from: r */
    public View f280998r;

    /* renamed from: s */
    public SnsInfo f280999s;

    /* renamed from: t */
    public ADXml.AdCardActionBtnInfo f281000t;

    /* renamed from: u */
    public C98963o f281001u;

    /* renamed from: v */
    public C102064e.C102069c f281002v;

    /* renamed from: w */
    public C102064e f281003w;

    /* renamed from: x */
    public C96187h f281004x;

    /* renamed from: y */
    public List<AdViewComponent<SnsInfo>> f281005y = new ArrayList();

    /* renamed from: z */
    public int f281006z = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$i */
    public static class C57420i {

        /* renamed from: a */
        public static final HashMap<String, Integer> f164477a = new HashMap<>();

        /* renamed from: a */
        public static int m66159a(int i, long j) {
            SnsMethodCalculate.markStartTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
            HashMap<String, Integer> hashMap = f164477a;
            Integer num = hashMap.get(i + "_" + j);
            if (num == null) {
                SnsMethodCalculate.markEndTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
                return 0;
            }
            int intValue = num.intValue();
            SnsMethodCalculate.markEndTimeMs("getAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
            return intValue;
        }

        /* renamed from: b */
        public static void m66160b(int i, long j, int i2) {
            SnsMethodCalculate.markStartTimeMs("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
            HashMap<String, Integer> hashMap = f164477a;
            hashMap.put(i + "_" + j, Integer.valueOf(i2));
            SnsMethodCalculate.markEndTimeMs("putAnimChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnimInfo");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$a */
    public class C96178a implements C102064e.C102068b {
        public C96178a() {
        }

        /* renamed from: a */
        public void mo133812a(AdClickActionInfo adClickActionInfo) {
            SnsMethodCalculate.markStartTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10");
            if (adClickActionInfo == null || C96177r2.m123266f(C96177r2.this) == null) {
                Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", "adCardActionBtnInfo or mActionBtn is null, can not updateActionBtnTitle");
                SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10");
                return;
            }
            int i = adClickActionInfo.f273641b;
            if (i != 6) {
                if (i == 7) {
                    String str = adClickActionInfo.f273615C;
                    if (!Util.isNullOrNil(str)) {
                        C96177r2.m123266f(C96177r2.this).setText(str);
                    }
                } else if (i == 13) {
                    C96177r2 r2Var = C96177r2.this;
                    SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    r2Var.mo133808v();
                    SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else if (i == 16) {
                    C96177r2 r2Var2 = C96177r2.this;
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    SnsInfo snsInfo = r2Var2.f280999s;
                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    if (!(snsInfo == null || adClickActionInfo.f273654h0 == null)) {
                        C96177r2 r2Var3 = C96177r2.this;
                        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        SnsInfo snsInfo2 = r2Var3.f280999s;
                        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        String c = C99516a.m129866c(C102236a0.m134765q0(snsInfo2.field_snsId), adClickActionInfo.f273654h0);
                        C96177r2 r2Var4 = C96177r2.this;
                        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                        r2Var4.mo133811y(c);
                        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    }
                }
            } else if (!Util.isNullOrNil(adClickActionInfo.f273655i)) {
                C96177r2.m123266f(C96177r2.this).setTextColor(-7829368);
                C96177r2.m123266f(C96177r2.this).setText(adClickActionInfo.f273655i);
                C96177r2.m123266f(C96177r2.this).setEnabled(false);
                C96177r2 r2Var5 = C96177r2.this;
                SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                r2Var5.mo133805r(false);
                SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C96177r2 r2Var6 = C96177r2.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                r2Var6.mo133806t();
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            }
            SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$10");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$b */
    public class C96179b implements C102064e.C102069c {
        public C96179b() {
        }

        /* renamed from: a */
        public ViewGroup mo132650a() {
            SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$1");
            C96177r2 r2Var = C96177r2.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            View view = r2Var.f280995o;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            ViewGroup viewGroup = (ViewGroup) view;
            SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$1");
            return viewGroup;
        }

        /* renamed from: b */
        public void mo132651b() {
            SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$1");
            C96177r2 r2Var = C96177r2.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            C102064e.C102069c cVar = r2Var.f281002v;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            if (cVar != null) {
                C96177r2 r2Var2 = C96177r2.this;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                C102064e.C102069c cVar2 = r2Var2.f281002v;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                cVar2.mo132651b();
            }
            SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$c */
    public class C96180c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Button f281009d;

        public C96180c(C96177r2 r2Var, Button button) {
            this.f281009d = button;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$2");
            this.f281009d.performClick();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$d */
    public class C96181d implements Runnable {

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$d$a */
        public class C96182a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C72996z1 f281011d;

            public C96182a(C72996z1 z1Var) {
                this.f281011d = z1Var;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7$1");
                C72996z1 z1Var = this.f281011d;
                if (z1Var == null || !z1Var.mo62927s3()) {
                    C96177r2.m123266f(C96177r2.this).setText(C96177r2.m123268h(C96177r2.this).btnTitle);
                } else {
                    C96177r2.m123266f(C96177r2.this).setText(C96177r2.m123268h(C96177r2.this).clickActionInfo.f273615C);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7$1");
            }
        }

        public C96181d() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            if (Ni != null && !Util.isNullOrNil(C96177r2.m123268h(C96177r2.this).clickActionInfo.f273679y)) {
                MMHandlerThread.postToMainThread(new C96182a(Ni.get(C96177r2.m123268h(C96177r2.this).clickActionInfo.f273679y)));
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$7");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$e */
    public class C96183e implements C99516a.C99517a {
        public C96183e() {
        }

        /* renamed from: a */
        public void mo133816a(long j, int i, boolean z, String str) {
            SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8");
            if (z) {
                C96177r2 r2Var = C96177r2.this;
                SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                r2Var.mo133811y(str);
                SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            }
            SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$f */
    public class C96184f implements C60208v1.C60209a {

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$f$a */
        public class C96185a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60187m5 f281015d;

            public C96185a(C60187m5 m5Var) {
                this.f281015d = m5Var;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9$1");
                C60187m5 m5Var = this.f281015d;
                if (m5Var != null) {
                    int followFlag = m5Var.getFollowFlag();
                    C96177r2 r2Var = C96177r2.this;
                    SnsMethodCalculate.markStartTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    r2Var.f280985A = followFlag;
                    SnsMethodCalculate.markEndTimeMs("access$2302", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    Log.m105924i("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, followFlg=" + followFlag + ", userName=" + this.f281015d.getUsername());
                    C96177r2.this.mo133809w(followFlag);
                } else {
                    Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", "getFinderContact, iLocalFinderContact==null");
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9$1");
            }
        }

        public C96184f() {
        }

        /* renamed from: a */
        public void mo78737a(C60187m5 m5Var) {
            SnsMethodCalculate.markStartTimeMs("onDone", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9");
            MMHandlerThread.postToMainThread(new C96185a(m5Var));
            SnsMethodCalculate.markEndTimeMs("onDone", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$9");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$g */
    public static class C96186g extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        public String f281017a;

        /* renamed from: b */
        public String f281018b;

        /* renamed from: c */
        public Button f281019c;

        /* renamed from: d */
        public String f281020d;

        public C96186g(Button button, String str, String str2, String str3) {
            this.f281017a = str;
            this.f281018b = str2;
            this.f281019c = button;
            this.f281020d = str3;
        }

        public Object doInBackground(Object[] objArr) {
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            Void[] voidArr = (Void[]) objArr;
            SnsMethodCalculate.markStartTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            int i = C100853b.m132142e().mo140323g(MMApplicationContext.getContext(), this.f281017a) ? 1 : C100853b.m132142e().mo140322f(this.f281018b) ? 2 : 0;
            Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "apkbtn state=" + i);
            Integer valueOf = Integer.valueOf(i);
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            SnsMethodCalculate.markEndTimeMs("doInBackground", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            return valueOf;
        }

        public void onPostExecute(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            Integer num = (Integer) obj;
            SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            if (num.intValue() == 1) {
                this.f281019c.setText(C0966R.string.j9g);
            } else if (num.intValue() == 2) {
                this.f281019c.setText(C0966R.string.j9f);
            } else {
                this.f281019c.setText(this.f281020d);
            }
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
            SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$DownLoadStateRefreshTask");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h */
    public static class C96187h {

        /* renamed from: a */
        public AnimatorSet f281021a;

        /* renamed from: b */
        public C96194g<C96177r2> f281022b;

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$a */
        public class C96188a implements Animator.AnimatorListener {
            public C96188a() {
            }

            public void onAnimationCancel(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
            }

            public void onAnimationEnd(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
            }

            public void onAnimationRepeat(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
                SnsMethodCalculate.markEndTimeMs("onAnimationRepeat", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
            }

            public void onAnimationStart(Animator animator) {
                T t;
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
                C96187h hVar = C96187h.this;
                SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                C96194g<C96177r2> gVar = hVar.f281022b;
                SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                if (gVar == null) {
                    SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
                    return;
                }
                C96187h hVar2 = C96187h.this;
                SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                C96194g<C96177r2> gVar2 = hVar2.f281022b;
                SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                gVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                WeakReference<T> weakReference = gVar2.f281025a;
                if (weakReference == null) {
                    t = null;
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                } else {
                    t = weakReference.get();
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                }
                C96177r2 r2Var = (C96177r2) t;
                if (r2Var != null) {
                    SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    SnsMethodCalculate.markStartTimeMs("addChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    int i = 1;
                    r2Var.f281006z++;
                    SnsInfo snsInfo = r2Var.f280999s;
                    long j = snsInfo != null ? snsInfo.field_snsId : 0;
                    SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    if (r2Var.f280987d != 0) {
                        i = 2;
                    }
                    SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    C57420i.m66160b(i, j, r2Var.f281006z);
                    SnsMethodCalculate.markEndTimeMs("addChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$b */
        public class C96189b extends C96195h {
            public C96189b(C96187h hVar, C96194g gVar, AnimatorSet animatorSet) {
                super(gVar, animatorSet);
            }

            /* renamed from: a */
            public void mo133824a(C96177r2 r2Var, float f) {
                SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$2");
                r2Var.mo133801n(f);
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$2");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$c */
        public class C96190c extends C96195h {
            public C96190c(C96187h hVar, C96194g gVar, AnimatorSet animatorSet) {
                super(gVar, animatorSet);
            }

            /* renamed from: a */
            public void mo133824a(C96177r2 r2Var, float f) {
                SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$3");
                r2Var.mo133802o(f);
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$d */
        public class C96191d extends C96195h {
            public C96191d(C96187h hVar, C96194g gVar, AnimatorSet animatorSet) {
                super(gVar, animatorSet);
            }

            /* renamed from: a */
            public void mo133824a(C96177r2 r2Var, float f) {
                SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$4");
                r2Var.mo133802o(f);
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$4");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$e */
        public class C96192e extends C96195h {
            public C96192e(C96187h hVar, C96194g gVar, AnimatorSet animatorSet) {
                super(gVar, animatorSet);
            }

            /* renamed from: a */
            public void mo133824a(C96177r2 r2Var, float f) {
                SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$5");
                r2Var.mo133801n(f);
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$5");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$f */
        public class C96193f extends AnimatorListenerAdapter {

            /* renamed from: d */
            public boolean f281024d;

            public C96193f(C96187h hVar) {
            }

            public void onAnimationCancel(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
                this.f281024d = true;
                Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "onAnimationCancel() called with: animation = [" + animator + "]");
                SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
            }

            public void onAnimationEnd(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
                if (!this.f281024d) {
                    Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "onAnimationEnd() called and repeat");
                    animator.start();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
            }

            public void onAnimationStart(Animator animator) {
                SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
                this.f281024d = false;
                SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$6");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$g */
        public static class C96194g<T> {

            /* renamed from: a */
            public WeakReference<T> f281025a;

            public C96194g(WeakReference<T> weakReference) {
                this.f281025a = weakReference;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.ui.r2$h$h */
        public static abstract class C96195h implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public C96194g<C96177r2> f281026d;

            /* renamed from: e */
            public AnimatorSet f281027e;

            public C96195h(C96194g<C96177r2> gVar, AnimatorSet animatorSet) {
                this.f281026d = gVar;
                this.f281027e = animatorSet;
            }

            /* renamed from: a */
            public abstract void mo133824a(C96177r2 r2Var, float f);

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                T t;
                SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C96194g<C96177r2> gVar = this.f281026d;
                gVar.getClass();
                SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                WeakReference<T> weakReference = gVar.f281025a;
                if (weakReference == null) {
                    t = null;
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                } else {
                    t = weakReference.get();
                    SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$RefWrapper");
                }
                C96177r2 r2Var = (C96177r2) t;
                if (r2Var != null) {
                    mo133824a(r2Var, floatValue);
                } else {
                    this.f281027e.cancel();
                }
                SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim$SellAnimatorUpdateListener");
            }
        }

        public C96187h(WeakReference<C96177r2> weakReference, String str) {
            C96188a aVar = new C96188a();
            AnimatorSet animatorSet = new AnimatorSet();
            this.f281021a = animatorSet;
            this.f281022b = new C96194g<>(weakReference);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            long j = (long) 1000;
            ofFloat.setDuration(j);
            ofFloat.setStartDelay(3000);
            ofFloat.addUpdateListener(new C96189b(this, this.f281022b, this.f281021a));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setStartDelay((long) NetworkMonitorReceiver.MSG_DELAY_TIME);
            ofFloat2.setDuration(j);
            ofFloat2.addListener(aVar);
            ofFloat2.addUpdateListener(new C96190c(this, this.f281022b, this.f281021a));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat3.setDuration(j);
            ofFloat3.setStartDelay(10000);
            ofFloat3.addUpdateListener(new C96191d(this, this.f281022b, this.f281021a));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat4.setDuration(j);
            ofFloat4.setStartDelay((long) 10500);
            ofFloat4.addUpdateListener(new C96192e(this, this.f281022b, this.f281021a));
            ofFloat4.addListener(aVar);
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.play(ofFloat3);
            animatorSet.play(ofFloat4);
            animatorSet.addListener(new C96193f(this));
        }
    }

    public C96177r2(Context context, View view, int i, C98963o oVar, C102064e.C102069c cVar) {
        Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "init, source=" + i + ", context=" + context + ", static=" + oVar);
        this.f280988e = context;
        this.f280987d = i;
        this.f281001u = oVar;
        this.f281002v = cVar;
        this.f280989f = view;
        View findViewById = view.findViewById(C0966R.C0970id.f5398qf);
        this.f280998r = findViewById;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = this.f280989f.findViewById(C0966R.C0970id.f5397e2);
        this.f280997q = findViewById2;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = view.findViewById(C0966R.C0970id.f5396e1);
        this.f280996p = findViewById3;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(0);
        View view4 = findViewById3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "<init>", "(Landroid/content/Context;Landroid/view/View;ILcom/tencent/mm/plugin/sns/ad/model/SnsAdStatistic;Lcom/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/AdClickActionHandler$CardAnimPrepareListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f280995o = this.f280989f.findViewById(C0966R.C0970id.f358728gq1);
        this.f280990g = (RoundedCornerFrameLayout) this.f280996p.findViewById(C0966R.C0970id.f5411ee);
        this.f280991h = (ImageView) this.f280996p.findViewById(C0966R.C0970id.f5410ed);
        this.f280992i = (TextView) this.f280996p.findViewById(C0966R.C0970id.f5436f3);
        this.f280993j = (TextView) this.f280996p.findViewById(C0966R.C0970id.f5404e8);
        Button button = (Button) this.f280996p.findViewById(C0966R.C0970id.f5393dy);
        this.f280994n = button;
        button.setOnClickListener(this);
        this.f280990g.setRadius((float) C76577a.m92151b(this.f280988e, 4));
        this.f281003w = new C102064e(this.f280988e, this.f280987d, this.f281001u, this.f280986B, new C96179b());
        this.f280998r.findViewById(C0966R.C0970id.f5393dy).setOnClickListener(new C96180c(this, this.f280994n));
        SnsMethodCalculate.markStartTimeMs("initComponents", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        ((ArrayList) this.f281005y).add(new C96215s2(this, "baseActionView", sVar, this.f280989f));
        ((ArrayList) this.f281005y).add(new C96225t2(this, "sellingPointView", sVar, this.f280989f));
        ((ArrayList) this.f281005y).add(new C96233u2(this, "singleActionButton", sVar, this.f280989f));
        ((ArrayList) this.f281005y).add(new C96271w2(this, "actionButtonAnim", sVar, this.f280989f));
        SnsMethodCalculate.markEndTimeMs("initComponents", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: a */
    public static void m123261a(C96177r2 r2Var, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("updateActionBtn", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            r2Var.f280994n.setTextColor(r2Var.f280988e.getResources().getColor(C0966R.color.f3144gt));
            r2Var.f280994n.setBackground(r2Var.f280988e.getResources().getDrawable(C0966R.C0969drawable.f357355at1));
            r2Var.f280994n.setEnabled(true);
            r2Var.mo133805r(true);
            r2Var.mo133806t();
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", th.toString());
        }
        r2Var.mo133807u(snsInfo);
        SnsMethodCalculate.markEndTimeMs("updateActionBtn", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: b */
    public static /* synthetic */ Context m123262b(C96177r2 r2Var) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        Context context = r2Var.f280988e;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return context;
    }

    /* renamed from: c */
    public static int m123263c(C96177r2 r2Var, int i, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("selectColor", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (C85875k4.m106211z() && !Util.isNullOrNil(str)) {
            i = C13098l.m12543a(str, i);
        } else if (!C85875k4.m106211z() && !Util.isNullOrNil(str2)) {
            i = C13098l.m12543a(str2, i);
        }
        SnsMethodCalculate.markEndTimeMs("selectColor", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return i;
    }

    /* renamed from: d */
    public static /* synthetic */ View m123264d(C96177r2 r2Var) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        View view = r2Var.f280998r;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return view;
    }

    /* renamed from: e */
    public static /* synthetic */ View m123265e(C96177r2 r2Var) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        View view = r2Var.f280996p;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return view;
    }

    /* renamed from: f */
    public static /* synthetic */ Button m123266f(C96177r2 r2Var) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        Button button = r2Var.f280994n;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return button;
    }

    /* renamed from: g */
    public static /* synthetic */ Button m123267g(C96177r2 r2Var, Button button) {
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        r2Var.f280994n = button;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return button;
    }

    /* renamed from: h */
    public static /* synthetic */ ADXml.AdCardActionBtnInfo m123268h(C96177r2 r2Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        ADXml.AdCardActionBtnInfo adCardActionBtnInfo = r2Var.f281000t;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return adCardActionBtnInfo;
    }

    /* renamed from: l */
    public static ShapeDrawable m123269l(Context context, int i, float f) {
        SnsMethodCalculate.markStartTimeMs("getShapeDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.getPaint().setStrokeWidth(0.0f);
        SnsMethodCalculate.markEndTimeMs("getShapeDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return shapeDrawable;
    }

    /* renamed from: q */
    public static void m123270q(SnsInfo snsInfo, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("snsid", C102236a0.m134765q0(snsInfo.field_snsId));
            jSONObject.put("uxinfo", snsInfo.getUxinfo());
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("switchCount", i2);
            jSONObject.put("extInfo", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            Log.m105918d("MicroMsg.SnsAdCardActionBtnCtrl", "reportChangeCount:" + jSONObject3);
            C102260r.m134858a("timeline_sellingpoint_report", jSONObject3);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", "reportChangeCount, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: s */
    public static boolean m123271s(SnsInfo snsInfo, Context context) {
        SnsMethodCalculate.markStartTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean z = false;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            SnsMethodCalculate.markEndTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return false;
        }
        if (snsInfo.getAdXml().adSellingPointInfo != null && !C102260r.m134842K(context)) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("shouldUseSellingAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return z;
    }

    /* renamed from: i */
    public void mo133797i(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (snsInfo == null) {
            Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", "fillSnsInfo, snsInfo==null");
            SnsMethodCalculate.markEndTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return;
        }
        this.f280999s = snsInfo;
        this.f281000t = snsInfo.getAdXml().adCardActionBtnInfo;
        SnsMethodCalculate.markEndTimeMs("fillSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: j */
    public final StateListDrawable mo133798j(float f, int i) {
        SnsMethodCalculate.markStartTimeMs("genButtonBgDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m123269l(this.f280988e, C90885a.m113999d(i, -16777216, 0.125f), f));
        stateListDrawable.addState(new int[0], m123269l(this.f280988e, i, f));
        SnsMethodCalculate.markEndTimeMs("genButtonBgDrawable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return stateListDrawable;
    }

    /* renamed from: k */
    public final boolean mo133799k() {
        SnsMethodCalculate.markStartTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        Button button = this.f280994n;
        if (button == null) {
            SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return false;
        }
        Object tag = button.getTag();
        if (tag instanceof Boolean) {
            boolean booleanValue = ((Boolean) tag).booleanValue();
            SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return booleanValue;
        }
        SnsMethodCalculate.markEndTimeMs("getActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return true;
    }

    /* renamed from: m */
    public final boolean mo133800m() {
        SnsMethodCalculate.markStartTimeMs("hasSetTextColorsWithConfigInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        boolean z = false;
        try {
            if ((C85875k4.m106211z() && !Util.isNullOrNil(this.f281000t.btnDarkColor)) || (!C85875k4.m106211z() && !Util.isNullOrNil(this.f281000t.btnColor))) {
                z = true;
            }
        } catch (IllegalArgumentException unused) {
            Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", "parse color error!");
        }
        SnsMethodCalculate.markEndTimeMs("hasSetTextColorsWithConfigInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        return z;
    }

    /* renamed from: n */
    public void mo133801n(float f) {
        SnsMethodCalculate.markStartTimeMs("onNormalViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        this.f280990g.setAlpha(f);
        this.f280992i.setAlpha(f);
        this.f280993j.setAlpha(f);
        SnsMethodCalculate.markEndTimeMs("onNormalViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: o */
    public void mo133802o(float f) {
        SnsMethodCalculate.markStartTimeMs("onSellPointViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        View view = this.f280997q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Float.valueOf(f));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "onSellPointViewAnim", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "onSellPointViewAnim", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        SnsMethodCalculate.markEndTimeMs("onSellPointViewAnim", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        this.f281003w.mo141556e(view);
        try {
            TimeLineObject timeLine = this.f280999s.getTimeLine();
            if ((C54550e.m61296a(this.f280999s) && timeLine.ContentObj.f298424e == 15) || timeLine.ContentObj.f298424e == 5) {
                SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(this.f280999s);
                snsAdLivingStreamJumpEvent.publish();
            }
        } catch (Throwable unused) {
        }
        if (m123271s(this.f280999s, this.f280988e)) {
            int i = this.f280987d == 0 ? 1 : 2;
            SnsInfo snsInfo = this.f280999s;
            m123270q(snsInfo, i, C57420i.m66159a(i, snsInfo != null ? snsInfo.field_snsId : 0));
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public final void mo133804p(String str, String str2, TextView textView, TextView textView2) {
        SnsMethodCalculate.markStartTimeMs("refreshTitleAndDesc", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (!TextUtils.isEmpty(str)) {
            textView.setText(C96963p0.wx0().mo83004M(textView.getContext(), str));
            textView.setVisibility(0);
            textView.setTypeface(Typeface.defaultFromStyle(1));
            if (!TextUtils.isEmpty(str2)) {
                textView2.setText(C96963p0.wx0().mo83004M(textView2.getContext(), str2));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                textView.setText(C96963p0.wx0().mo83004M(textView.getContext(), str2));
                textView.setVisibility(0);
                textView.setTypeface(Typeface.defaultFromStyle(0));
            } else {
                textView.setVisibility(8);
            }
            textView2.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("refreshTitleAndDesc", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: r */
    public final void mo133805r(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        Button button = this.f280994n;
        if (button == null) {
            SnsMethodCalculate.markEndTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            return;
        }
        button.setTag(Boolean.valueOf(z));
        SnsMethodCalculate.markEndTimeMs("setActionButtonColorEnable", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099 A[Catch:{ IllegalArgumentException -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3 A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.Boolean, java.lang.Boolean> mo133806t() {
        /*
            r10 = this;
            java.lang.String r0 = "parse color error!"
            java.lang.String r1 = "MicroMsg.SnsAdCardActionBtnCtrl"
            java.lang.String r2 = "trySetColorsWithConfigInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            r5 = 1
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ IllegalArgumentException -> 0x0079 }
            r7 = 2131101853(0x7f06089d, float:1.7816127E38)
            if (r6 == 0) goto L_0x0046
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r6 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x0079 }
            java.lang.String r6 = r6.btnDarkColor     // Catch:{ IllegalArgumentException -> 0x0079 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            if (r6 != 0) goto L_0x0046
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r6 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x0079 }
            java.lang.String r6 = r6.btnDarkColor     // Catch:{ IllegalArgumentException -> 0x0079 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.widget.Button r8 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x0079 }
            r8.setTextColor(r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            boolean r6 = r10.mo133799k()     // Catch:{ IllegalArgumentException -> 0x0079 }
            if (r6 != 0) goto L_0x0044
            android.widget.Button r6 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.content.Context r8 = r10.f280988e     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalArgumentException -> 0x0079 }
            int r7 = r8.getColor(r7)     // Catch:{ IllegalArgumentException -> 0x0079 }
            r6.setTextColor(r7)     // Catch:{ IllegalArgumentException -> 0x0079 }
        L_0x0044:
            r6 = 1
            goto L_0x007d
        L_0x0046:
            boolean r6 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ IllegalArgumentException -> 0x0079 }
            if (r6 != 0) goto L_0x007c
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r6 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x0079 }
            java.lang.String r6 = r6.btnColor     // Catch:{ IllegalArgumentException -> 0x0079 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            if (r6 != 0) goto L_0x007c
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r6 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x0079 }
            java.lang.String r6 = r6.btnColor     // Catch:{ IllegalArgumentException -> 0x0079 }
            int r6 = android.graphics.Color.parseColor(r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.widget.Button r8 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x0079 }
            r8.setTextColor(r6)     // Catch:{ IllegalArgumentException -> 0x0079 }
            boolean r6 = r10.mo133799k()     // Catch:{ IllegalArgumentException -> 0x0079 }
            if (r6 != 0) goto L_0x0044
            android.widget.Button r6 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.content.Context r8 = r10.f280988e     // Catch:{ IllegalArgumentException -> 0x0079 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalArgumentException -> 0x0079 }
            int r7 = r8.getColor(r7)     // Catch:{ IllegalArgumentException -> 0x0079 }
            r6.setTextColor(r7)     // Catch:{ IllegalArgumentException -> 0x0079 }
            goto L_0x0044
        L_0x0079:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x007c:
            r6 = 0
        L_0x007d:
            android.content.Context r7 = r10.f280988e     // Catch:{ IllegalArgumentException -> 0x00fa }
            r8 = 1082130432(0x40800000, float:4.0)
            int r7 = zp3.C79406f.m96347a(r7, r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            float r7 = (float) r7     // Catch:{ IllegalArgumentException -> 0x00fa }
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ IllegalArgumentException -> 0x00fa }
            r9 = 2131101852(0x7f06089c, float:1.7816125E38)
            if (r8 == 0) goto L_0x00c3
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r8 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x00fa }
            java.lang.String r8 = r8.btnBgDarkColor     // Catch:{ IllegalArgumentException -> 0x00fa }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            if (r8 != 0) goto L_0x00c3
            boolean r8 = r10.mo133799k()     // Catch:{ IllegalArgumentException -> 0x00fa }
            if (r8 != 0) goto L_0x00ae
            android.content.Context r8 = r10.f280988e     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalArgumentException -> 0x00fa }
            int r8 = r8.getColor(r9)     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.graphics.drawable.StateListDrawable r4 = r10.mo133798j(r7, r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            goto L_0x00ba
        L_0x00ae:
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r8 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x00fa }
            java.lang.String r8 = r8.btnBgDarkColor     // Catch:{ IllegalArgumentException -> 0x00fa }
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.graphics.drawable.StateListDrawable r4 = r10.mo133798j(r7, r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
        L_0x00ba:
            android.widget.Button r7 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x00c1 }
            r7.setBackground(r4)     // Catch:{ IllegalArgumentException -> 0x00c1 }
        L_0x00bf:
            r4 = 1
            goto L_0x00fd
        L_0x00c1:
            r4 = 1
            goto L_0x00fa
        L_0x00c3:
            boolean r8 = com.tencent.p014mm.p136ui.C85875k4.m106211z()     // Catch:{ IllegalArgumentException -> 0x00fa }
            if (r8 != 0) goto L_0x00fd
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r8 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x00fa }
            java.lang.String r8 = r8.btnBgColor     // Catch:{ IllegalArgumentException -> 0x00fa }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            if (r8 != 0) goto L_0x00fd
            boolean r8 = r10.mo133799k()     // Catch:{ IllegalArgumentException -> 0x00fa }
            if (r8 != 0) goto L_0x00e8
            android.content.Context r8 = r10.f280988e     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IllegalArgumentException -> 0x00fa }
            int r8 = r8.getColor(r9)     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.graphics.drawable.StateListDrawable r7 = r10.mo133798j(r7, r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            goto L_0x00f4
        L_0x00e8:
            com.tencent.mm.plugin.sns.storage.ADXml$AdCardActionBtnInfo r8 = r10.f281000t     // Catch:{ IllegalArgumentException -> 0x00fa }
            java.lang.String r8 = r8.btnBgColor     // Catch:{ IllegalArgumentException -> 0x00fa }
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
            android.graphics.drawable.StateListDrawable r7 = r10.mo133798j(r7, r8)     // Catch:{ IllegalArgumentException -> 0x00fa }
        L_0x00f4:
            android.widget.Button r8 = r10.f280994n     // Catch:{ IllegalArgumentException -> 0x00fa }
            r8.setBackground(r7)     // Catch:{ IllegalArgumentException -> 0x00fa }
            goto L_0x00bf
        L_0x00fa:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x00fd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "trySetColorsWithConfigInfo! bgColorSeted="
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = "  textColorSeted="
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.<init>(r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96177r2.mo133806t():android.util.Pair");
    }

    /* renamed from: u */
    public final void mo133807u(SnsInfo snsInfo) {
        SnsInfo snsInfo2 = snsInfo;
        SnsMethodCalculate.markStartTimeMs("updateActionBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        int i = this.f281000t.clickActionInfo.f273641b;
        boolean z = false;
        if (i == 2) {
            if (TextUtils.isEmpty(this.f280994n.getText().toString())) {
                this.f280994n.setText(this.f281000t.btnTitle);
            }
            Button button = this.f280994n;
            ADXml.AdCardActionBtnInfo adCardActionBtnInfo = this.f281000t;
            AdClickActionInfo adClickActionInfo = adCardActionBtnInfo.clickActionInfo;
            new C96186g(button, adClickActionInfo.f273675u, adClickActionInfo.f273674t, adCardActionBtnInfo.btnTitle).execute(new Void[0]);
        } else if (i == 6) {
            try {
                String q0 = C102236a0.m134765q0(snsInfo2.field_snsId);
                if (!Util.isNullOrNil(q0)) {
                    if ("1".equals(C100417r0.m131412a(q0))) {
                        if (!mo133800m()) {
                            this.f280994n.setTextColor(-7829368);
                        }
                        this.f280994n.setText(this.f281000t.clickActionInfo.f273655i);
                        this.f280994n.setEnabled(false);
                        mo133805r(false);
                        mo133806t();
                    } else {
                        this.f280994n.setText(this.f281000t.btnTitle);
                    }
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdCardActionBtnCtrl", th.toString());
            }
        } else if (i == 7) {
            ((C119157j) C119157j.f356862d).mo183875f(new C96181d());
        } else if (i == 13) {
            mo133808v();
        } else if (i == 16) {
            String c = C99516a.m129866c(C102236a0.m134765q0(this.f280999s.field_snsId), this.f281000t.clickActionInfo.f273654h0);
            mo133811y(c);
            if (this.f281000t.clickActionInfo.f273654h0 != null && !"1000".equals(c)) {
                String q05 = C102236a0.m134765q0(this.f280999s.field_snsId);
                String uxinfo = this.f280999s.getUxinfo();
                long j = this.f281000t.clickActionInfo.f273654h0.f264476a;
                C96183e eVar = new C96183e();
                SnsMethodCalculate.markStartTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                long longValue = C99516a.f291746a.containsKey(Long.valueOf(j)) ? C99516a.f291746a.get(Long.valueOf(j)).longValue() : 0;
                if (longValue == 0 || System.currentTimeMillis() - longValue > 30000) {
                    C99516a.f291746a.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
                    Log.m105924i("ADAppointment.AdAppointmentHelper", "getAppointmentStatus, id=" + j + ", snsId=" + q05 + ", lastReqTime=" + longValue + ", uxInfo=" + uxinfo);
                    C46884e eVar2 = new C46884e(uxinfo, j, 2);
                    C86709a0.m107524d().mo123455a(5159, new C99516a.C99518b(q05, j, 2, eVar));
                    C86709a0.m107524d().mo123460f(eVar2);
                    SnsMethodCalculate.markEndTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                } else {
                    Log.m105918d("ADAppointment.AdAppointmentHelper", "getAppointmentStatus, too frequently, id=" + j);
                    SnsMethodCalculate.markEndTimeMs("getAppointmentStatus", "com.tencent.mm.plugin.sns.ad.helper.AdAppointmentHelper");
                }
            }
        } else {
            CharSequence text = this.f280994n.getText();
            if (text == null || TextUtils.isEmpty(text.toString())) {
                this.f280994n.setText(this.f281000t.btnTitle);
            } else {
                SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                if (snsInfo2 == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
                    SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else {
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                }
                if (!z) {
                    this.f280994n.setText(this.f281000t.btnTitle);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateActionBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: v */
    public final void mo133808v() {
        SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        mo133809w(this.f280985A);
        ((C60208v1) C86312j.m106911c(C60208v1.class)).Aw0(this.f281000t.clickActionInfo.finderUsername, new C96184f(), 4);
        SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnInfo", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: w */
    public void mo133809w(int i) {
        SnsMethodCalculate.markStartTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        if (i == 0) {
            this.f280994n.setText(this.f281000t.btnTitle);
        } else {
            this.f280994n.setText(this.f281000t.clickActionInfo.f273648e0);
        }
        SnsMethodCalculate.markEndTimeMs("updateAddFinderBtnText", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: x */
    public void mo133810x(boolean z) {
        SnsMethodCalculate.markStartTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        try {
            if (this.f280994n != null) {
                boolean k = mo133799k();
                this.f280994n.setEnabled(z);
                mo133805r(z);
                if (!mo133800m()) {
                    if (z) {
                        this.f280994n.setTextColor(this.f280988e.getResources().getColor(C0966R.color.f3144gt));
                    } else {
                        this.f280994n.setTextColor(this.f280988e.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                    }
                } else if (k != z) {
                    mo133806t();
                }
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("updateButtonState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }

    /* renamed from: y */
    public final void mo133811y(String str) {
        AdClickActionInfo adClickActionInfo;
        SnsMethodCalculate.markStartTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        ADXml.AdCardActionBtnInfo adCardActionBtnInfo = this.f281000t;
        if (!(adCardActionBtnInfo == null || (adClickActionInfo = adCardActionBtnInfo.clickActionInfo) == null || adClickActionInfo.f273654h0 == null)) {
            if ("0".equals(str)) {
                this.f280994n.setText(this.f281000t.btnTitle);
                mo133810x(true);
            } else if ("1".equals(str)) {
                this.f280994n.setText(this.f281000t.clickActionInfo.f273654h0.f264484i);
                mo133810x(true);
                mo133805r(false);
                if (!mo133800m()) {
                    this.f280994n.setTextColor(this.f280988e.getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
                } else {
                    mo133806t();
                }
            } else if ("1000".equals(str)) {
                this.f280994n.setText(this.f281000t.clickActionInfo.f273654h0.f264490o);
                mo133810x(false);
            }
        }
        SnsMethodCalculate.markEndTimeMs("updateNewOrderUI", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
    }
}
