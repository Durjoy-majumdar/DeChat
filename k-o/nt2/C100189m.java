package nt2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import os2.C100416r;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: nt2.m */
public class C100189m extends C100165c {

    /* renamed from: o */
    public Context f293546o;

    /* renamed from: p */
    public View f293547p;

    /* renamed from: q */
    public View f293548q;

    /* renamed from: r */
    public boolean f293549r = false;

    /* renamed from: s */
    public int f293550s;

    /* renamed from: t */
    public C98963o f293551t;

    /* renamed from: u */
    public int[] f293552u = {C0966R.C0970id.kut, C0966R.C0970id.kuu};

    /* renamed from: v */
    public final int f293553v = C0966R.C0970id.kuv;

    /* renamed from: nt2.m$a */
    public class C47298a implements View.OnTouchListener {
        public C47298a(C100189m mVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$1");
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$1");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: nt2.m$b */
    public class C100190b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f293554d;

        public C100190b(int i) {
            this.f293554d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$3");
            if (C100189m.m130957h(C100189m.this) != null && this.f293554d > 0) {
                C100189m.m130957h(C100189m.this).mo138299f(C100189m.this.f293412e.field_snsId);
            }
            C100189m.this.f293418n.f280365U.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nt2.m$c */
    public class C100191c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f293556d;

        public C100191c(boolean z) {
            this.f293556d = z;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$4");
            if (C100189m.m130957h(C100189m.this) != null && this.f293556d) {
                C100189m.m130957h(C100189m.this).mo138299f(C100189m.this.f293412e.field_snsId);
            }
            C100189m.this.f293418n.f280365U.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$4");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nt2.m$d */
    public class C100192d implements SightPlayController.C94564e {

        /* renamed from: a */
        public final /* synthetic */ long f293558a;

        /* renamed from: b */
        public final /* synthetic */ boolean f293559b;

        public C100192d(long j, boolean z) {
            this.f293558a = j;
            this.f293559b = z;
        }

        /* renamed from: a */
        public void mo130064a(SightPlayController sightPlayController, int i) {
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$5");
            if (i != -1) {
                C100189m.m130957h(C100189m.this).mo138296c(this.f293558a, this.f293559b);
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$5");
        }
    }

    /* renamed from: nt2.m$e */
    public class C100193e implements SightPlayController.C94565f {

        /* renamed from: a */
        public final /* synthetic */ long f293561a;

        /* renamed from: b */
        public final /* synthetic */ boolean f293562b;

        /* renamed from: c */
        public final /* synthetic */ int f293563c;

        public C100193e(long j, boolean z, int i) {
            this.f293561a = j;
            this.f293562b = z;
            this.f293563c = i;
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
            SnsMethodCalculate.markStartTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$6");
            if (j >= 3) {
                int f = (int) sightPlayController.mo130046f();
                if (C100189m.m130957h(C100189m.this) != null) {
                    C100189m.m130957h(C100189m.this).mo138287B(this.f293561a, Util.currentTicks(), this.f293562b);
                    C100189m.m130957h(C100189m.this).mo138289D(this.f293561a, f, true, this.f293562b);
                    C98963o h = C100189m.m130957h(C100189m.this);
                    long j2 = this.f293561a;
                    h.mo138298e(j2, ((long) this.f293563c) + j2);
                }
                C100189m.this.f293415h.f280502e.setOnDecodeDurationListener((SightPlayController.C94565f) null);
            }
            SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem$6");
        }
    }

    public C100189m(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar) {
        this.f293411d = timeLineObject;
        this.f293412e = snsInfo;
        this.f293418n = timelineClickListener;
        this.f293551t = oVar;
    }

    /* renamed from: h */
    public static /* synthetic */ C98963o m130957h(C100189m mVar) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        C98963o oVar = mVar.f293551t;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        return oVar;
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        View view3 = view;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        this.f293413f = view3;
        this.f293414g = view2;
        Context context = view.getContext();
        this.f293546o = context;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        int min = ((((Math.min(windowManager.getDefaultDisplay().getWidth(), windowManager.getDefaultDisplay().getHeight()) - C76577a.m92157h(this.f293546o, C0966R.dimen.ao_)) - C76577a.m92157h(this.f293546o, C0966R.dimen.f3963ll)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = this.f293546o.getResources().getDimensionPixelOffset(C0966R.dimen.f3913iq);
        layoutParams.bottomMargin = 0;
        layoutParams.width = min;
        layoutParams.height = min;
        view3.setLayoutParams(layoutParams);
        ((RoundedCornerFrameLayout) view3).setRadius(8.0f);
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
            ((ViewGroup) view.getParent()).setClipToPadding(false);
        }
        for (int findViewById : this.f293552u) {
            MaskImageView maskImageView = (MaskImageView) view3.findViewById(findViewById);
            maskImageView.setVisibility(8);
            maskImageView.setOnTouchListener(new C47298a(this));
        }
        View findViewById2 = view3.findViewById(this.f293553v);
        findViewById2.setBackground((Drawable) null);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view4 = findViewById2;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem", "initView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem", "initView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((ViewGroup) findViewById2).setClipChildren(false);
        C96066m2 m2Var = new C96066m2();
        this.f293415h = m2Var;
        m2Var.f280505h = findViewById2;
        m2Var.f280501d = findViewById2;
        m2Var.f280502e = (VideoSightView) findViewById2.findViewById(C0966R.C0970id.f39);
        this.f293415h.f280502e.setMute(true);
        C96066m2 m2Var2 = this.f293415h;
        m2Var2.f280506i = (ImageView) m2Var2.f280505h.findViewById(C0966R.C0970id.k17);
        C96066m2 m2Var3 = this.f293415h;
        m2Var3.f280507j = (MMPinProgressBtn) m2Var3.f280505h.findViewById(C0966R.C0970id.i7j);
        C96066m2 m2Var4 = this.f293415h;
        m2Var4.f280509l = (TextView) m2Var4.f280505h.findViewById(C0966R.C0970id.f357936ck1);
        C96066m2 m2Var5 = this.f293415h;
        m2Var5.f280508k = (TextView) m2Var5.f280505h.findViewById(C0966R.C0970id.ckr);
        this.f293415h.f280505h.setTag(this);
        this.f293415h.f280505h.setOnClickListener((View.OnClickListener) null);
        VideoSightView videoSightView = this.f293415h.f280502e;
        videoSightView.f273547P = true;
        videoSightView.setScaleType(QImageView.C97274a.CENTER_CROP);
        this.f293415h.f280502e.mo130072c(min, min);
        this.f293548q = view3.findViewById(C0966R.C0970id.f359362ki0);
        this.f293547p = view3.findViewById(C0966R.C0970id.khz);
        mo139480j(0);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        boolean z;
        long j;
        C101804kv2 kv22;
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        this.f293412e = C100416r.m131408a(this.f293412e.getSnsId());
        Log.m105924i("MicroMsg.TurnCardAdDetailItem", "refresh view");
        int width = (((((WindowManager) this.f293546o.getSystemService("window")).getDefaultDisplay().getWidth() - C76577a.m92151b(this.f293546o, 50)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f293546o.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
        int i = 2;
        if (this.f293412e.getTimeLine().ContentObj.f298427h.size() >= 2) {
            int i2 = 0;
            int i3 = this.f293412e.field_likeFlag == 1 ? 1 : 0;
            mo139480j(i3);
            int i4 = 0;
            while (i4 < i) {
                C101804kv2 kv23 = this.f293412e.getTimeLine().ContentObj.f298427h.get(i4);
                MaskImageView maskImageView = (MaskImageView) this.f293413f.findViewById(this.f293552u[i4]);
                ViewGroup.LayoutParams layoutParams = maskImageView.getLayoutParams();
                maskImageView.setTag(this);
                if (kv23.f298690e == i) {
                    C94901o Fx0 = C94866e1.Fx0();
                    int hashCode = hashCode();
                    C96983o3 o3Var = new C96983o3("comment_detail");
                    o3Var.f284145b = this.f293411d.CreateTime;
                    Fx0.mo131108b0(kv23, maskImageView, -1, hashCode, o3Var, 3, (String) null);
                } else {
                    C94901o Fx02 = C94866e1.Fx0();
                    int hashCode2 = hashCode();
                    C96983o3 o3Var2 = new C96983o3("comment_detail");
                    o3Var2.f284145b = this.f293411d.CreateTime;
                    Fx02.mo131116f0(kv23, maskImageView, hashCode2, o3Var2);
                }
                maskImageView.setScaleType(QImageView.C97274a.CENTER_CROP);
                layoutParams.width = width;
                layoutParams.height = width;
                if (i3 == i4 && kv23.f298690e == i) {
                    maskImageView.setVisibility(i2);
                    maskImageView.setOnClickListener(new C100190b(i3));
                } else {
                    maskImageView.setVisibility(8);
                    maskImageView.setOnClickListener((View.OnClickListener) null);
                }
                if (kv23.f298690e == 6 && i3 == i4) {
                    boolean z2 = i3 > 0;
                    long j2 = this.f293412e.field_snsId;
                    ViewGroup.LayoutParams layoutParams2 = this.f293415h.f280501d.getLayoutParams();
                    layoutParams2.width = width;
                    layoutParams2.height = width;
                    this.f293415h.f280502e.mo130072c(width, width);
                    View view = this.f293415h.f280501d;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(i2)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C94866e1.Fx0().mo131112d0(this.f293412e, kv23, this.f293415h.f280502e, -1, this.f293546o.hashCode(), 0, C96983o3.f284138j, this.f293412e.isAd(), true);
                    this.f293415h.f280502e.start();
                    C96066m2 m2Var = this.f293415h;
                    m2Var.f280513p = true;
                    m2Var.f280514q = i4;
                    m2Var.f280498a = this.f293411d;
                    m2Var.f280500c = i2;
                    m2Var.f280499b = this.f293412e.getLocalid();
                    this.f293415h.f280505h.setOnClickListener(new C100191c(z2));
                    this.f293415h.f280502e.setOnCompletionListener(new C100192d(j2, z2));
                    C98963o oVar = this.f293551t;
                    if (oVar == null) {
                        j = j2;
                        z = z2;
                        kv22 = kv23;
                    } else if (!oVar.mo138310q(((long) i4) + j2)) {
                        j = j2;
                        z = z2;
                        kv22 = kv23;
                        this.f293415h.f280502e.setOnDecodeDurationListener(new C100193e(j2, z2, i4));
                    } else {
                        j = j2;
                        z = z2;
                        kv22 = kv23;
                        this.f293551t.mo138287B(j, Util.currentTicks(), z);
                    }
                    this.f293415h.mo133598a(this.f293411d, 0, this.f293412e.getLocalid(), this.f293412e.isAd());
                    this.f293415h.f280508k.setVisibility(8);
                    C94901o Fx03 = C94866e1.Fx0();
                    long nanoTime = System.nanoTime();
                    boolean x = Fx03.mo131141x(kv22);
                    Log.m105925i("MicroMsg.TurnCardAdDetailItem", "isMediaSightExist %b duration %s", Boolean.valueOf(x), Long.valueOf(System.nanoTime() - nanoTime));
                    if (x) {
                        if (Fx03.mo131143z(kv22)) {
                            this.f293415h.f280506i.setVisibility(0);
                            this.f293415h.f280507j.setVisibility(8);
                            this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293546o, C0966R.raw.shortvideo_play_btn));
                            this.f293415h.f280506i.setContentDescription(this.f293546o.getString(C0966R.string.f361136hk0));
                        } else if (Fx03.mo131139v(kv22)) {
                            this.f293415h.f280506i.setVisibility(8);
                            this.f293415h.f280507j.setVisibility(8);
                        } else if (Fx03.mo131133p(this.f293412e) <= 5) {
                            this.f293415h.f280506i.setVisibility(8);
                            this.f293415h.f280507j.setVisibility(8);
                        } else {
                            Fx03.mo131098R(kv22);
                            this.f293415h.f280506i.setVisibility(0);
                            this.f293415h.f280507j.setVisibility(8);
                            this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293546o, C0966R.raw.shortvideo_play_btn));
                            this.f293415h.f280506i.setContentDescription(this.f293546o.getString(C0966R.string.f361136hk0));
                        }
                        this.f293415h.f280502e.f273545M.mo130049i();
                    } else if (Fx03.mo131140w(kv22)) {
                        this.f293415h.f280506i.setVisibility(8);
                        this.f293415h.f280507j.setVisibility(0);
                        this.f293415h.f280507j.mo153891a();
                    } else if (Fx03.mo131133p(this.f293412e) == 5) {
                        Fx03.mo131097Q(kv22);
                        this.f293415h.f280506i.setVisibility(8);
                        this.f293415h.f280507j.setVisibility(0);
                        this.f293415h.f280507j.mo153891a();
                    } else if (Fx03.mo131137t(kv22)) {
                        this.f293415h.f280507j.setVisibility(8);
                        this.f293415h.f280506i.setImageResource(C0966R.raw.shortvideo_play_icon_err);
                        this.f293415h.f280506i.setVisibility(0);
                    } else {
                        Fx03.mo131098R(kv22);
                        this.f293415h.f280506i.setVisibility(0);
                        this.f293415h.f280507j.setVisibility(8);
                        this.f293415h.f280506i.setImageDrawable(C76577a.m92158i(this.f293546o, C0966R.raw.shortvideo_play_btn));
                        this.f293415h.f280506i.setContentDescription(this.f293546o.getString(C0966R.string.f361136hk0));
                        if (Fx03.mo131133p(this.f293412e) == 4) {
                            this.f293415h.f280508k.setVisibility(0);
                        }
                    }
                    if (this.f293551t != null) {
                        String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
                        String T = C102236a0.m134725T(kv22);
                        if (C86013q1.m106450k(e + T)) {
                            this.f293551t.mo138292G(this.f293412e.field_snsId, 0, true);
                        } else {
                            this.f293551t.mo138292G(this.f293412e.field_snsId, 0, false);
                        }
                        this.f293551t.mo138291F(j, C94866e1.Fx0().mo131133p(this.f293412e) == 5, 1, z);
                        i4++;
                        i = 2;
                        i2 = 0;
                    }
                }
                i4++;
                i = 2;
                i2 = 0;
            }
        }
        SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
    }

    /* renamed from: i */
    public final View mo139479i(C101804kv2 kv22, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getPreLikedAnimationView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
        int[] iArr = {C0966R.C0970id.kut, C0966R.C0970id.kuu};
        if (z) {
            View findViewById = this.f293413f.findViewById(iArr[i]);
            SnsMethodCalculate.markEndTimeMs("getPreLikedAnimationView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
            return findViewById;
        }
        int i2 = kv22.f298690e;
        if (i2 == 6) {
            View findViewById2 = this.f293413f.findViewById(C0966R.C0970id.kuv);
            SnsMethodCalculate.markEndTimeMs("getPreLikedAnimationView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
            return findViewById2;
        } else if (i2 == 2) {
            View findViewById3 = this.f293413f.findViewById(iArr[i]);
            SnsMethodCalculate.markEndTimeMs("getPreLikedAnimationView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
            return findViewById3;
        } else {
            SnsMethodCalculate.markEndTimeMs("getPreLikedAnimationView", "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0109, code lost:
        r1 = (com.tencent.p014mm.plugin.sns.storage.ADXml.C95027o) ((java.util.ArrayList) r7.adTurnInfo.f275721e).get(r1);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo139480j(int r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "switchTurnMediaText"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.detail.item.TurnCardAdDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.view.View r12 = r0.f293548q
            if (r12 == 0) goto L_0x01ea
            android.view.View r4 = r0.f293547p
            if (r4 != 0) goto L_0x0016
            goto L_0x01ea
        L_0x0016:
            r0.f293550s = r1
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r14 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r4)
            java.lang.Object[] r5 = r13.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r7 = "switchTurnMediaText"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            r11 = 0
            java.lang.Object r4 = r13.mo10231a(r11)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r12.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r6 = "switchTurnMediaText"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r12
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r4 = r0.f293547p
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r5.mo10233c(r6)
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r18 = "switchTurnMediaText"
            java.lang.String r19 = "(I)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r4
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r11)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r17 = "switchTurnMediaText"
            java.lang.String r18 = "(I)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r4 = r0.f293413f
            r5 = 2131315647(0x7f094bbf, float:1.8249753E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 0
            r4.setText(r5)
            android.view.View r4 = r0.f293413f
            r6 = 2131315648(0x7f094bc0, float:1.8249755E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r5)
            android.view.View r4 = r0.f293413f
            r6 = 2131315645(0x7f094bbd, float:1.824975E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r5)
            android.view.View r4 = r0.f293413f
            r6 = 2131315646(0x7f094bbe, float:1.8249751E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r5)
            r4 = 3
            int[][] r5 = new int[r4][]
            r6 = 2
            int[] r7 = new int[r6]
            r7 = {2131315648, 2131315646} // fill-array
            r5[r11] = r7
            int[] r7 = new int[r6]
            r7 = {2131315647, 2131315645} // fill-array
            r8 = 1
            r5[r8] = r7
            int[] r7 = new int[r6]
            r7 = {2131315647, 2131315646} // fill-array
            r5[r6] = r7
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f293412e
            com.tencent.mm.plugin.sns.storage.ADXml r7 = r7.getAdXml()
            com.tencent.mm.plugin.sns.storage.ADXml$j r9 = r7.adTurnInfo
            if (r9 == 0) goto L_0x01e6
            java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$o> r9 = r9.f275721e
            if (r9 == 0) goto L_0x01e6
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
            if (r9 < r6) goto L_0x01e6
            com.tencent.mm.plugin.sns.storage.ADXml$j r6 = r7.adTurnInfo
            java.util.List<com.tencent.mm.plugin.sns.storage.ADXml$o> r6 = r6.f275721e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r1 = r6.get(r1)
            com.tencent.mm.plugin.sns.storage.ADXml$o r1 = (com.tencent.p014mm.plugin.sns.storage.ADXml.C95027o) r1
            int r6 = r1.f275742c
            if (r6 < 0) goto L_0x01e6
            if (r6 >= r4) goto L_0x01e6
            r4 = r5[r6]
            android.view.View r5 = r0.f293413f
            r6 = r4[r11]
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.View r6 = r0.f293413f
            r4 = r4[r8]
            android.view.View r4 = r6.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = r1.f275740a
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x013d
            r5.setVisibility(r14)
            goto L_0x0145
        L_0x013d:
            r5.setVisibility(r11)
            java.lang.String r6 = r1.f275740a
            r5.setText(r6)
        L_0x0145:
            java.lang.String r6 = r1.f275741b
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x0151
            r4.setVisibility(r14)
            goto L_0x0159
        L_0x0151:
            r4.setVisibility(r11)
            java.lang.String r1 = r1.f275741b
            r4.setText(r1)
        L_0x0159:
            android.view.ViewParent r1 = r5.getParent()
            android.view.View r1 = (android.view.View) r1
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r5.mo10233c(r6)
            java.lang.Object[] r13 = r5.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r15 = "switchTurnMediaText"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r1
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r5 = r5.mo10231a(r11)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r14 = "switchTurnMediaText"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.view.ViewParent r1 = r4.getParent()
            r4 = r1
            android.view.View r4 = (android.view.View) r4
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r1.mo10233c(r5)
            java.lang.Object[] r13 = r1.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r15 = "switchTurnMediaText"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r4
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r1 = r1.mo10231a(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4.setVisibility(r1)
            java.lang.String r5 = "com/tencent/mm/plugin/sns/ui/detail/item/TurnCardAdDetailItem"
            java.lang.String r6 = "switchTurnMediaText"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
        L_0x01e6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x01ea:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100189m.mo139480j(int):void");
    }
}
