package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1795c0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.ArtistBrowseUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100417r0;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.q0 */
public class C96158q0 extends LinearLayout implements C96327z0, C11385n {

    /* renamed from: d */
    public C96166k f280905d = new C96166k(this);

    /* renamed from: e */
    public Context f280906e;

    /* renamed from: f */
    public SnsInfo f280907f = null;

    /* renamed from: g */
    public C96165j f280908g;

    /* renamed from: h */
    public int f280909h = 0;

    /* renamed from: i */
    public String f280910i = "";

    /* renamed from: j */
    public int f280911j;

    /* renamed from: n */
    public boolean f280912n = false;

    /* renamed from: o */
    public View.OnTouchListener f280913o = Util.genLinearPressedListener();

    /* renamed from: p */
    public String f280914p = "";

    /* renamed from: q */
    public boolean f280915q = true;

    /* renamed from: r */
    public MMHandler f280916r = new MMHandler(Looper.getMainLooper());

    /* renamed from: s */
    public Runnable f280917s = new C96159a();

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$b */
    public class C43143b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ Context f116715d;

        public C43143b(Context context) {
            this.f116715d = context;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
            if (motionEvent.getAction() == 0) {
                C96158q0.this.f280905d.f280936k.setTextColor(this.f116715d.getResources().getColor(C0966R.color.alb));
                C96166k kVar = C96158q0.this.f280905d;
                if (!kVar.f280932g) {
                    kVar.f280931f.setIconColor(this.f116715d.getResources().getColor(C0966R.color.alb));
                }
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() == 1) {
                C96158q0.this.f280905d.f280936k.setTextColor(this.f116715d.getResources().getColor(C0966R.color.f2975b6));
                C96166k kVar2 = C96158q0.this.f280905d;
                if (!kVar2.f280932g) {
                    kVar2.f280931f.setIconColor(this.f116715d.getResources().getColor(C0966R.color.f2975b6));
                }
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$c */
    public class C43144c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ Context f116717d;

        public C43144c(Context context) {
            this.f116717d = context;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
            if (motionEvent.getAction() == 0) {
                C96158q0.this.f280905d.f280937l.setTextColor(this.f116717d.getResources().getColor(C0966R.color.alb));
                C96158q0.this.f280905d.f280933h.setIconColor(this.f116717d.getResources().getColor(C0966R.color.alb));
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() == 1) {
                C96158q0.this.f280905d.f280937l.setTextColor(this.f116717d.getResources().getColor(C0966R.color.f2975b6));
                C96158q0.this.f280905d.f280933h.setIconColor(this.f116717d.getResources().getColor(C0966R.color.f2975b6));
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$f */
    public class C43145f implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ Context f116719d;

        public C43145f(C96158q0 q0Var, Context context) {
            this.f116719d = context;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
            if (motionEvent.getAction() == 0) {
                ((TextView) view.findViewById(C0966R.C0970id.n49)).setTextColor(this.f116719d.getResources().getColor(C0966R.color.alb));
                ((WeImageView) view.findViewById(C0966R.C0970id.n48)).setIconColor(this.f116719d.getResources().getColor(C0966R.color.alb));
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else if (motionEvent.getAction() == 1) {
                ((TextView) view.findViewById(C0966R.C0970id.n49)).setTextColor(this.f116719d.getResources().getColor(C0966R.color.f2975b6));
                ((WeImageView) view.findViewById(C0966R.C0970id.n48)).setIconColor(this.f116719d.getResources().getColor(C0966R.color.f2975b6));
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            } else {
                SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$a */
    public class C96159a implements Runnable {
        public C96159a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$1");
            C96158q0.this.mo133781e();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$d */
    public class C96160d implements View.OnClickListener {
        public C96160d() {
        }

        public void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
            if (C96158q0.m123241b(C96158q0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            String str2 = "";
            if (C96158q0.m123241b(C96158q0.this).getLikeFlag() == 0) {
                if (C96158q0.m123241b(C96158q0.this).isExtFlag()) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(213, C96158q0.this);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123455a(C1795c0.CTRL_INDEX, C96158q0.this);
                    SnsInfo b = C96158q0.m123241b(C96158q0.this);
                    C96158q0 q0Var = C96158q0.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                    int i = q0Var.f280911j;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                    C5431p1.C5432a.m5341l(b, 1, "", 0, "", false, i);
                } else {
                    String str3 = C96158q0.m123241b(C96158q0.this).field_userName;
                    SnsInfo b2 = C96158q0.m123241b(C96158q0.this);
                    C96158q0 q0Var2 = C96158q0.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                    int i2 = q0Var2.f280911j;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                    C5431p1.C5432a.m5343n(str3, 5, str2, b2, i2);
                }
                C96158q0 q0Var3 = C96158q0.this;
                LinearLayout linearLayout = q0Var3.f280905d.f280930e;
                SnsMethodCalculate.markStartTimeMs("doWhileSendLiked", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
                ImageView imageView = (ImageView) linearLayout.findViewById(C0966R.C0970id.f358448f61);
                ScaleAnimation scaleAnimation = r15;
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setDuration(200);
                scaleAnimation2.setStartOffset(100);
                scaleAnimation2.setRepeatCount(0);
                imageView.clearAnimation();
                imageView.startAnimation(scaleAnimation2);
                scaleAnimation2.setAnimationListener(new C96108p0(q0Var3, linearLayout, (Runnable) null));
                str = "com.tencent.mm.plugin.sns.ui.GalleryFooterNew";
                SnsMethodCalculate.markEndTimeMs("doWhileSendLiked", str);
                C96158q0.m123241b(C96158q0.this).setLikeFlag(1);
                C94866e1.Yx0().Pq0(C96158q0.m123241b(C96158q0.this));
                SnsReportHelper.f275506m0.mo131361V().f265948s = 2;
                C94891k2.f274975a.mo131069b(C96158q0.m123241b(C96158q0.this), 3);
            } else {
                str = "com.tencent.mm.plugin.sns.ui.GalleryFooterNew";
                C96158q0.m123241b(C96158q0.this).setLikeFlag(0);
                C94866e1.Yx0().Pq0(C96158q0.m123241b(C96158q0.this));
                C5431p1.C5432a.m5338a(C96158q0.m123241b(C96158q0.this).getSnsId());
                C96158q0 q0Var4 = C96158q0.this;
                SnsInfo SE = C94866e1.Yx0().mo139806SE(C96158q0.m123241b(C96158q0.this).field_snsId);
                SnsMethodCalculate.markStartTimeMs("access$002", str);
                q0Var4.f280907f = SE;
                SnsMethodCalculate.markEndTimeMs("access$002", str);
                SnsReportHelper.f275506m0.mo131361V().f265948s = 4;
            }
            if (C96158q0.m123241b(C96158q0.this).field_snsId != 0) {
                str2 = C102236a0.m134765q0(C96158q0.m123241b(C96158q0.this).field_snsId);
            }
            C115669n.INSTANCE.mo160131h(11989, 1, str2, 0);
            C96158q0 q0Var5 = C96158q0.this;
            SnsMethodCalculate.markStartTimeMs("access$300", str);
            MMHandler mMHandler = q0Var5.f280916r;
            SnsMethodCalculate.markEndTimeMs("access$300", str);
            C96158q0 q0Var6 = C96158q0.this;
            SnsMethodCalculate.markStartTimeMs("access$200", str);
            Runnable runnable = q0Var6.f280917s;
            SnsMethodCalculate.markEndTimeMs("access$200", str);
            mMHandler.removeCallbacks(runnable);
            C96158q0 q0Var7 = C96158q0.this;
            SnsMethodCalculate.markStartTimeMs("access$300", str);
            MMHandler mMHandler2 = q0Var7.f280916r;
            SnsMethodCalculate.markEndTimeMs("access$300", str);
            C96158q0 q0Var8 = C96158q0.this;
            SnsMethodCalculate.markStartTimeMs("access$200", str);
            Runnable runnable2 = q0Var8.f280917s;
            SnsMethodCalculate.markEndTimeMs("access$200", str);
            mMHandler2.postDelayed(runnable2, 500);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$e */
    public class C96161e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f280920d;

        public C96161e(Context context) {
            this.f280920d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
            Log.m105918d("MicroMsg.GalleryFooterNew", "comment cmd");
            if (C96158q0.m123241b(C96158q0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            int i = C96158q0.m123241b(C96158q0.this).localid;
            Intent intent = new Intent();
            intent.putExtra("sns_comment_localId", i);
            C96158q0 q0Var = C96158q0.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            int i2 = q0Var.f280911j;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            intent.putExtra("sns_source", i2);
            intent.setClass(this.f280920d, SnsCommentUI.class);
            C115669n.INSTANCE.mo160131h(11989, 2, C96158q0.m123241b(C96158q0.this).field_snsId == 0 ? "" : C102236a0.m134765q0(C96158q0.m123241b(C96158q0.this).field_snsId), 0);
            Context context = this.f280920d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C94891k2.f274975a.mo131069b(C96158q0.m123241b(C96158q0.this), 3);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$g */
    public class C96162g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f280922d;

        public C96162g(Context context) {
            this.f280922d = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            if (C96158q0.m123241b(C96158q0.this) == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C115669n.INSTANCE.mo160131h(11989, 3, C96158q0.m123241b(C96158q0.this).field_snsId == 0 ? "" : C102236a0.m134765q0(C96158q0.m123241b(C96158q0.this).field_snsId), 0);
            int i = C96158q0.m123241b(C96158q0.this).localid;
            Intent intent = new Intent();
            intent.setClass(this.f280922d, SnsCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", C96158q0.m123241b(C96158q0.this).getUserName());
            intent.putExtra("INTENT_SNS_LOCAL_ID", C100417r0.m131420i("sns_table_", (long) i));
            intent.putExtra("INTENT_FROMGALLERY", true);
            ((MMActivity) this.f280922d).startActivityForResult(intent, 1);
            SnsReportHelper.f275506m0.mo131361V().f265940k = 1;
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$h */
    public class C96163h implements View.OnClickListener {
        public C96163h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$8");
            if (C96158q0.m123242c(C96158q0.this) != null) {
                ArtistBrowseUI.C95305b bVar = (ArtistBrowseUI.C95305b) C96158q0.m123242c(C96158q0.this);
                bVar.getClass();
                SnsMethodCalculate.markStartTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
                C101804kv2 cntMedia = ArtistBrowseUI.this.f277761o.getCntMedia();
                if (cntMedia == null) {
                    SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
                } else {
                    Log.m105918d("MicroMsg.ArtistBrowseUI", "set bg the meida id " + cntMedia.f298689d);
                    C91998s.m115550d(723);
                    if (!C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), cntMedia.f298689d) + C102236a0.m134717L(cntMedia))) {
                        SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
                    } else {
                        C94866e1.gy0().mo131204o(cntMedia);
                        Intent intent = new Intent();
                        intent.setClass(ArtistBrowseUI.this, SettingSnsBackgroundUI.class);
                        intent.setFlags(536870912);
                        intent.addFlags(67108864);
                        ArtistBrowseUI artistBrowseUI = ArtistBrowseUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        ArtistBrowseUI artistBrowseUI2 = artistBrowseUI;
                        C117292a.m165358d(artistBrowseUI2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        artistBrowseUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(artistBrowseUI2, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        ArtistBrowseUI.this.finish();
                        SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$8");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$i */
    public class C96164i implements View.OnClickListener {
        public C96164i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$9");
            if (C96158q0.m123242c(C96158q0.this) != null) {
                ((ArtistBrowseUI.C95305b) C96158q0.m123242c(C96158q0.this)).getClass();
                SnsMethodCalculate.markStartTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
                SnsMethodCalculate.markEndTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$9");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$j */
    public interface C96165j {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.q0$k */
    public class C96166k {

        /* renamed from: a */
        public boolean f280926a = false;

        /* renamed from: b */
        public LinearLayout f280927b;

        /* renamed from: c */
        public TextView f280928c;

        /* renamed from: d */
        public LinearLayout f280929d;

        /* renamed from: e */
        public LinearLayout f280930e;

        /* renamed from: f */
        public WeImageView f280931f;

        /* renamed from: g */
        public boolean f280932g = false;

        /* renamed from: h */
        public WeImageView f280933h;

        /* renamed from: i */
        public LinearLayout f280934i;

        /* renamed from: j */
        public LinearLayout f280935j;

        /* renamed from: k */
        public TextView f280936k;

        /* renamed from: l */
        public TextView f280937l;

        /* renamed from: m */
        public TextView f280938m;

        /* renamed from: n */
        public LinearLayout f280939n;

        /* renamed from: o */
        public ImageView f280940o;

        /* renamed from: p */
        public WeImageView f280941p;

        /* renamed from: q */
        public ImageView f280942q;

        /* renamed from: r */
        public LinearLayout f280943r;

        /* renamed from: s */
        public LinearLayout f280944s;

        /* renamed from: t */
        public TextView f280945t;

        public C96166k(C96158q0 q0Var) {
        }
    }

    public C96158q0(Context context, int i, boolean z) {
        super(context);
        this.f280909h = i;
        this.f280912n = z;
        mo133780d(context);
    }

    /* renamed from: b */
    public static /* synthetic */ SnsInfo m123241b(C96158q0 q0Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        SnsInfo snsInfo = q0Var.f280907f;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return snsInfo;
    }

    /* renamed from: c */
    public static /* synthetic */ C96165j m123242c(C96158q0 q0Var) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        C96165j jVar = q0Var.f280908g;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return jVar;
    }

    /* renamed from: a */
    public void mo133641a(String str) {
        SnsMethodCalculate.markStartTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        setFooter(str);
        SnsMethodCalculate.markEndTimeMs("onFooterIdChange", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    /* renamed from: d */
    public void mo133780d(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f280906e = context;
        if (this.f280909h == -1) {
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        this.f280914p = C75592q0.m90789s();
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cwg, this, true);
        this.f280905d.f280927b = (LinearLayout) inflate.findViewById(C0966R.C0970id.k0v);
        this.f280905d.f280939n = (LinearLayout) inflate.findViewById(C0966R.C0970id.l8g);
        this.f280905d.f280930e = (LinearLayout) inflate.findViewById(C0966R.C0970id.f358542fo0);
        this.f280905d.f280931f = (WeImageView) inflate.findViewById(C0966R.C0970id.f358448f61);
        this.f280905d.f280936k = (TextView) inflate.findViewById(C0966R.C0970id.etl);
        this.f280905d.f280930e.setOnTouchListener(new C43143b(context));
        ((WeImageView) inflate.findViewById(C0966R.C0970id.n48)).setIconColor(context.getResources().getColor(C0966R.color.f2975b6));
        this.f280905d.f280934i = (LinearLayout) inflate.findViewById(C0966R.C0970id.bju);
        this.f280905d.f280933h = (WeImageView) inflate.findViewById(C0966R.C0970id.n1i);
        this.f280905d.f280933h.setIconColor(context.getResources().getColor(C0966R.color.f2975b6));
        this.f280905d.f280937l = (TextView) inflate.findViewById(C0966R.C0970id.n1f);
        this.f280905d.f280934i.setOnTouchListener(new C43144c(context));
        this.f280905d.f280935j = (LinearLayout) inflate.findViewById(C0966R.C0970id.brx);
        this.f280905d.f280928c = (TextView) inflate.findViewById(C0966R.C0970id.jcp);
        this.f280905d.f280929d = (LinearLayout) inflate.findViewById(C0966R.C0970id.jcq);
        this.f280905d.f280938m = (TextView) inflate.findViewById(C0966R.C0970id.jsv);
        this.f280905d.f280944s = (LinearLayout) inflate.findViewById(C0966R.C0970id.f358455f70);
        this.f280905d.f280940o = (ImageView) inflate.findViewById(C0966R.C0970id.a2o);
        this.f280905d.f280941p = (WeImageView) inflate.findViewById(C0966R.C0970id.f358627g51);
        this.f280905d.f280941p.setIconColor(context.getResources().getColor(C0966R.color.f2975b6));
        this.f280905d.f280942q = (ImageView) inflate.findViewById(C0966R.C0970id.ckt);
        this.f280905d.f280943r = (LinearLayout) inflate.findViewById(C0966R.C0970id.c0f);
        this.f280905d.f280945t = (TextView) inflate.findViewById(C0966R.C0970id.c0j);
        int i = this.f280909h;
        if (i == 2) {
            this.f280905d.f280939n.setVisibility(8);
            this.f280905d.f280943r.setVisibility(8);
            this.f280905d.f280929d.setVisibility(0);
        } else if (i == 3) {
            this.f280905d.f280939n.setVisibility(8);
            this.f280905d.f280929d.setVisibility(8);
            this.f280905d.f280943r.setVisibility(0);
        } else {
            this.f280905d.f280939n.setVisibility(0);
            this.f280905d.f280929d.setVisibility(8);
            this.f280905d.f280943r.setVisibility(8);
        }
        this.f280905d.f280930e.setOnClickListener(new C96160d());
        this.f280905d.f280934i.setOnClickListener(new C96161e(context));
        this.f280905d.f280935j.setOnTouchListener(new C43145f(this, context));
        this.f280905d.f280935j.setOnClickListener(new C96162g(context));
        this.f280905d.f280928c.setOnClickListener(new C96163h());
        this.f280905d.f280945t.setOnClickListener(new C96164i());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0316  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo133781e() {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "refresh"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.GalleryFooterNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = "MicroMsg.GalleryFooterNew"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r5, r1, r4)
            int r4 = r0.f280909h
            r6 = -1
            if (r4 != r6) goto L_0x001b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x001b:
            os2.e0 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()
            java.lang.String r6 = r0.f280910i
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r4.mo139798DN(r6)
            r0.f280907f = r4
            java.lang.String r4 = r0.f280910i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x03d0
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            if (r4 != 0) goto L_0x0035
            goto L_0x03d0
        L_0x0035:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.ImageView r4 = r4.f280942q
            r6 = 8
            r4.setVisibility(r6)
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            int r4 = r4.getLocalPrivate()
            boolean r7 = r0.f280912n
            boolean r4 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120371i(r4, r7)
            r7 = 1
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            r4.f280926a = r7
            android.widget.LinearLayout r4 = r4.f280934i
            r4.setEnabled(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280930e
            r4.setEnabled(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101838(0x7f06088e, float:1.7816097E38)
            int r8 = r8.getColor(r9)
            r4.setIconColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280936k
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setTextColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280933h
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setIconColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280937l
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setTextColor(r8)
            goto L_0x012f
        L_0x00a6:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            r4.f280926a = r3
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            boolean r4 = r4.isExtFlag()
            if (r4 != 0) goto L_0x00c8
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280944s
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280939n
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280927b
            r4.setVisibility(r6)
            goto L_0x00da
        L_0x00c8:
            boolean r4 = r0.f280915q
            if (r4 == 0) goto L_0x00d3
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280927b
            r4.setVisibility(r3)
        L_0x00d3:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280939n
            r4.setVisibility(r3)
        L_0x00da:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280934i
            r4.setEnabled(r7)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280930e
            r4.setEnabled(r7)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131099940(0x7f060124, float:1.7812247E38)
            int r8 = r8.getColor(r9)
            r4.setIconColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280936k
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setTextColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280933h
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setIconColor(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280937l
            android.content.Context r8 = r0.f280906e
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r9)
            r4.setTextColor(r8)
        L_0x012f:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            com.tencent.mm.protocal.protobuf.SnsObject r4 = com.tencent.p014mm.plugin.sns.model.C94897n1.m120367e(r4)
            java.lang.String r8 = ""
            if (r4 == 0) goto L_0x0301
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r0.f280907f
            boolean r9 = r9.isExtFlag()
            if (r9 == 0) goto L_0x02c8
            int r9 = r4.CommentCount
            int r10 = r4.LikeCount
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "comment Count:"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r12 = ", like Count:"
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
            r11 = 2131756329(0x7f100529, float:1.9143562E38)
            java.lang.String r12 = ","
            r13 = 2131836939(0x7f11400b, float:1.9307059E38)
            if (r10 > 0) goto L_0x018b
            android.content.res.Resources r4 = r16.getResources()
            java.lang.String r4 = r4.getString(r13)
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.LinearLayout r5 = r5.f280930e
            android.content.res.Resources r7 = r16.getResources()
            java.lang.String r7 = r7.getString(r13)
            r5.setContentDescription(r7)
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.f280931f
            r5.setImageResource(r11)
            goto L_0x0254
        L_0x018b:
            java.lang.String r14 = java.lang.Integer.toString(r10)
            com.tencent.mm.plugin.sns.ui.q0$k r15 = r0.f280905d
            android.widget.LinearLayout r15 = r15.f280930e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r11 = r16.getResources()
            java.lang.String r11 = r11.getString(r13)
            r6.append(r11)
            r6.append(r12)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r15.setContentDescription(r6)
            com.tencent.mm.plugin.sns.ui.q0$k r6 = r0.f280905d
            r6.f280932g = r3
            java.util.LinkedList<te3.w64> r6 = r4.LikeUserList
            if (r6 == 0) goto L_0x01ff
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01ff
            java.lang.String r6 = eb0.C75592q0.m90789s()
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.util.LinkedList<te3.w64> r13 = r4.LikeUserList
            int r13 = r13.size()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11[r3] = r13
            java.lang.String r13 = "LikeUserList.size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r11)
            java.util.LinkedList<te3.w64> r4 = r4.LikeUserList
            java.util.Iterator r4 = r4.iterator()
        L_0x01db:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x01ff
            java.lang.Object r11 = r4.next()
            te3.w64 r11 = (te3.w64) r11
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.String r15 = r11.f299703d
            r13[r3] = r15
            java.lang.String r15 = "likeUser:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r15, r13)
            java.lang.String r11 = r11.f299703d
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x01db
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            r4.f280932g = r7
        L_0x01ff:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.tencent.mm.plugin.sns.ui.q0$k r6 = r0.f280905d
            boolean r6 = r6.f280932g
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4[r3] = r6
            java.lang.String r6 = "likeContainsSelf:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            boolean r5 = r4.f280932g
            if (r5 == 0) goto L_0x024b
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            r5 = 2131756063(0x7f10041f, float:1.9143023E38)
            r4.setImageResource(r5)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            boolean r5 = r4.f280926a
            if (r5 == 0) goto L_0x0238
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            android.content.Context r5 = r0.f280906e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099909(0x7f060105, float:1.7812185E38)
            int r5 = r5.getColor(r6)
            r4.setIconColor(r5)
            goto L_0x0253
        L_0x0238:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            android.content.Context r5 = r0.f280906e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r5 = r5.getColor(r6)
            r4.setIconColor(r5)
            goto L_0x0253
        L_0x024b:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280931f
            r5 = 2131756329(0x7f100529, float:1.9143562E38)
            r4.setImageResource(r5)
        L_0x0253:
            r4 = r14
        L_0x0254:
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.TextView r5 = r5.f280936k
            r5.setText(r4)
            r4 = 2131836934(0x7f114006, float:1.9307049E38)
            if (r9 > 0) goto L_0x027f
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.TextView r5 = r5.f280937l
            android.content.res.Resources r6 = r16.getResources()
            java.lang.String r6 = r6.getString(r4)
            r5.setText(r6)
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.LinearLayout r5 = r5.f280934i
            android.content.res.Resources r6 = r16.getResources()
            java.lang.String r4 = r6.getString(r4)
            r5.setContentDescription(r4)
            goto L_0x02b6
        L_0x027f:
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.TextView r5 = r5.f280937l
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.setText(r6)
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.LinearLayout r5 = r5.f280934i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            android.content.res.Resources r7 = r16.getResources()
            java.lang.String r4 = r7.getString(r4)
            r6.append(r4)
            r6.append(r12)
            r6.append(r9)
            java.lang.String r4 = r6.toString()
            r5.setContentDescription(r4)
        L_0x02b6:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r4 = r4.mo131361V()
            long r5 = (long) r9
            r4.f265945p = r5
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r4 = r4.mo131361V()
            long r5 = (long) r10
            r4.f265946q = r5
        L_0x02c8:
            java.lang.String r4 = r0.f280914p
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f280907f
            java.lang.String r5 = r5.getUserName()
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x02f7
            boolean r4 = r0.f280912n
            if (r4 == 0) goto L_0x02f7
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.ImageView r4 = r4.f280940o
            r4.setVisibility(r3)
            java.lang.Class<ln.f> r4 = p196ln.C76705f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ln.f r4 = (p196ln.C76705f) r4
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.ImageView r5 = r5.f280940o
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r0.f280907f
            java.lang.String r6 = r6.getUserName()
            r4.mo106849z(r5, r6)
            goto L_0x0301
        L_0x02f7:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.ImageView r4 = r4.f280940o
            r5 = 8
            r4.setVisibility(r5)
            goto L_0x0303
        L_0x0301:
            r5 = 8
        L_0x0303:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.getTimeLine()
            if (r4 != 0) goto L_0x0316
            com.tencent.mm.plugin.sns.ui.q0$k r3 = r0.f280905d
            android.widget.TextView r3 = r3.f280938m
            r3.setVisibility(r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x0316:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r4.getTimeLine()
            java.lang.String r4 = r4.ContentDesc
            if (r4 == 0) goto L_0x0370
            boolean r5 = r4.equals(r8)
            if (r5 == 0) goto L_0x0327
            goto L_0x0370
        L_0x0327:
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.LinearLayout r5 = r5.f280944s
            r5.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r5 = r0.f280905d
            android.widget.TextView r5 = r5.f280938m
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r7 = r16.getContext()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r4 = " "
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            com.tencent.mm.plugin.sns.ui.q0$k r8 = r0.f280905d
            android.widget.TextView r8 = r8.f280938m
            float r8 = r8.getTextSize()
            android.text.SpannableString r4 = r6.yp0(r7, r4, r8)
            r5.setText(r4)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280938m
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r4 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.SnsAlbumFeedBehaviourStruct r4 = r4.mo131361V()
            r5 = 1
            r4.f265937h = r5
            goto L_0x0391
        L_0x0370:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280938m
            r4.setText(r8)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280938m
            r5 = 8
            r4.setVisibility(r5)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            boolean r6 = r4.f280926a
            if (r6 != 0) goto L_0x038c
            android.widget.LinearLayout r4 = r4.f280944s
            r4.setVisibility(r5)
            goto L_0x0391
        L_0x038c:
            android.widget.LinearLayout r4 = r4.f280944s
            r4.setVisibility(r3)
        L_0x0391:
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            boolean r5 = r4.f280926a
            if (r5 == 0) goto L_0x03a4
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280941p
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280938m
            r4.setVisibility(r3)
            goto L_0x03ab
        L_0x03a4:
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r4.f280941p
            r5 = 8
            r4.setVisibility(r5)
        L_0x03ab:
            boolean r4 = r0.f280912n
            if (r4 == 0) goto L_0x03cc
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r0.f280907f
            boolean r4 = r4.isDieItem()
            if (r4 == 0) goto L_0x03cc
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.LinearLayout r4 = r4.f280935j
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.TextView r4 = r4.f280938m
            r4.setVisibility(r3)
            com.tencent.mm.plugin.sns.ui.q0$k r4 = r0.f280905d
            android.widget.ImageView r4 = r4.f280942q
            r4.setVisibility(r3)
        L_0x03cc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L_0x03d0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C96158q0.mo133781e():void");
    }

    public int getFooterH() {
        SnsMethodCalculate.markStartTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        LinearLayout linearLayout = this.f280905d.f280927b;
        if (linearLayout != null) {
            int height = linearLayout.getHeight();
            SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return height;
        }
        SnsMethodCalculate.markEndTimeMs("getFooterH", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        return 10;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        if (yVar.getType() == 213 || yVar.getType() == 682) {
            Log.m105925i("MicroMsg.GalleryFooterNew", "onSceneEnd, errType:%d, errCode:%d, scene:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()));
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(213, this);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(C1795c0.CTRL_INDEX, this);
            this.f280916r.removeCallbacks(this.f280917s);
            this.f280916r.post(this.f280917s);
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setCallBack(C96165j jVar) {
        SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f280908g = jVar;
        SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setFooter(String str) {
        SnsMethodCalculate.markStartTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f280910i = str;
        mo133781e();
        SnsMethodCalculate.markEndTimeMs("setFooter", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setSnsSource(int i) {
        SnsMethodCalculate.markStartTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f280911j = i;
        SnsMethodCalculate.markEndTimeMs("setSnsSource", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setType(int i) {
        SnsMethodCalculate.markStartTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        this.f280909h = i;
        mo133780d(this.f280906e);
        SnsMethodCalculate.markEndTimeMs("setType", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }

    public void setVisibility(int i) {
        SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i2 = this.f280909h;
        boolean z = true;
        if (i2 == 2 || i2 == 3) {
            super.setVisibility(i);
            if (i == 8) {
                z = false;
            }
            this.f280915q = z;
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        SnsInfo snsInfo = this.f280907f;
        if (snsInfo == null || snsInfo.isExtFlag()) {
            if (i == 8) {
                this.f280905d.f280927b.setVisibility(8);
                this.f280915q = false;
            } else if (i == 0) {
                this.f280905d.f280927b.setVisibility(0);
                this.f280915q = true;
            }
            SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
    }
}
