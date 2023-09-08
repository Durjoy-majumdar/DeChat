package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
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
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoSightView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp2.C98963o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.p */
public class C95944p extends BaseTimeLineItem {

    /* renamed from: t */
    public static int[] f280136t = {C0966R.C0970id.kut, C0966R.C0970id.kuu};

    /* renamed from: u */
    public static int[] f280137u = {C0966R.C0970id.kuv};

    /* renamed from: v */
    public static int[][] f280138v = {new int[]{C0966R.C0970id.kuz, C0966R.C0970id.kux}, new int[]{C0966R.C0970id.kuy, C0966R.C0970id.kuw}, new int[]{C0966R.C0970id.kuy, C0966R.C0970id.kux}};

    /* renamed from: q */
    public int f280139q = 0;

    /* renamed from: r */
    public int f280140r = 0;

    /* renamed from: s */
    public int f280141s = 0;

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$a */
    public class C95945a implements SightPlayController.C94564e {

        /* renamed from: a */
        public final /* synthetic */ SnsTimeLineBaseAdapter f280142a;

        /* renamed from: b */
        public final /* synthetic */ long f280143b;

        /* renamed from: c */
        public final /* synthetic */ boolean f280144c;

        public C95945a(C95944p pVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, long j, boolean z) {
            this.f280142a = snsTimeLineBaseAdapter;
            this.f280143b = j;
            this.f280144c = z;
        }

        /* renamed from: a */
        public void mo130064a(SightPlayController sightPlayController, int i) {
            BaseTimeLine baseTimeLine;
            C98963o oVar;
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$1");
            if (i != -1) {
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f280142a;
                if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
                    SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$1");
                    return;
                }
                oVar.mo138296c(this.f280143b, this.f280144c);
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$b */
    public class C95946b implements SightPlayController.C94565f {

        /* renamed from: a */
        public final /* synthetic */ SnsTimeLineBaseAdapter f280145a;

        /* renamed from: b */
        public final /* synthetic */ long f280146b;

        /* renamed from: c */
        public final /* synthetic */ boolean f280147c;

        /* renamed from: d */
        public final /* synthetic */ int f280148d;

        /* renamed from: e */
        public final /* synthetic */ C96066m2 f280149e;

        public C95946b(C95944p pVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, long j, boolean z, int i, C96066m2 m2Var) {
            this.f280145a = snsTimeLineBaseAdapter;
            this.f280146b = j;
            this.f280147c = z;
            this.f280148d = i;
            this.f280149e = m2Var;
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
            BaseTimeLine baseTimeLine;
            SnsMethodCalculate.markStartTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$2");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f280145a;
            if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || baseTimeLine.f276699f == null) {
                SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$2");
                return;
            }
            if (j >= 3) {
                int f = (int) sightPlayController.mo130046f();
                this.f280145a.f278568b.f276699f.mo138287B(this.f280146b, Util.currentTicks(), this.f280147c);
                this.f280145a.f278568b.f276699f.mo138289D(this.f280146b, f, true, this.f280147c);
                C98963o oVar = this.f280145a.f278568b.f276699f;
                long j2 = this.f280146b;
                oVar.mo138298e(j2, ((long) this.f280148d) + j2);
                this.f280149e.f280502e.setOnDecodeDurationListener((SightPlayController.C94565f) null);
            }
            SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$c */
    public class C95947c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f280150d;

        /* renamed from: e */
        public final /* synthetic */ SnsTimeLineBaseAdapter f280151e;

        /* renamed from: f */
        public final /* synthetic */ C95951g f280152f;

        public C95947c(C95944p pVar, int i, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, C95951g gVar) {
            this.f280150d = i;
            this.f280151e = snsTimeLineBaseAdapter;
            this.f280152f = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$3");
            if (this.f280150d > 0) {
                this.f280151e.f278568b.f276699f.mo138299f(this.f280152f.f279952e);
            }
            this.f280151e.f278572f.f280365U.onClick(view);
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$d */
    public class C95948d implements View.OnTouchListener {
        public C95948d(C95944p pVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$4");
            SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$4");
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$e */
    public class C95949e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsTimeLineBaseAdapter f280153d;

        /* renamed from: e */
        public final /* synthetic */ int f280154e;

        /* renamed from: f */
        public final /* synthetic */ C95951g f280155f;

        public C95949e(C95944p pVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter, int i, C95951g gVar) {
            this.f280153d = snsTimeLineBaseAdapter;
            this.f280154e = i;
            this.f280155f = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$5");
            this.f280153d.f278572f.f280365U.onClick(view);
            if (this.f280154e > 0) {
                this.f280153d.f278568b.f276699f.mo138299f(this.f280155f.f279952e);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem$5");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$f */
    public static final class C95950f {

        /* renamed from: a */
        public int f280156a;

        /* renamed from: b */
        public View f280157b;

        /* renamed from: c */
        public View f280158c;

        /* renamed from: d */
        public C95951g f280159d;

        /* renamed from: e */
        public SnsInfo f280160e;

        /* renamed from: f */
        public C95950f f280161f;
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.p$g */
    public static class C95951g extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public View f280162F0;

        /* renamed from: G0 */
        public boolean f280163G0 = false;

        /* renamed from: H0 */
        public C95950f f280164H0;

        /* renamed from: I0 */
        public View f280165I0;

        /* renamed from: J0 */
        public View f280166J0;

        /* renamed from: K0 */
        public C96066m2 f280167K0 = new C96066m2();
    }

    /* renamed from: C */
    public final View mo133468C(View view, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getSubviewBy", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        if (i2 == 6) {
            View findViewById = view.findViewById(f280137u[0]);
            SnsMethodCalculate.markEndTimeMs("getSubviewBy", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
            return findViewById;
        }
        View findViewById2 = view.findViewById(f280136t[i]);
        SnsMethodCalculate.markEndTimeMs("getSubviewBy", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        return findViewById2;
    }

    /* renamed from: D */
    public final void mo133469D(C95950f fVar) {
        List<ADXml.C95027o> list;
        C95950f fVar2 = fVar;
        SnsMethodCalculate.markStartTimeMs("switchText", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        View view = fVar2.f280159d.f280165I0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = fVar2.f280159d.f280166J0;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) fVar2.f280159d.f280162F0.findViewById(C0966R.C0970id.kuy)).setText((CharSequence) null);
        ((TextView) fVar2.f280159d.f280162F0.findViewById(C0966R.C0970id.kuz)).setText((CharSequence) null);
        ((TextView) fVar2.f280159d.f280162F0.findViewById(C0966R.C0970id.kuw)).setText((CharSequence) null);
        ((TextView) fVar2.f280159d.f280162F0.findViewById(C0966R.C0970id.kux)).setText((CharSequence) null);
        ADXml adXml = fVar2.f280160e.getAdXml();
        ADXml.C95023j jVar = adXml.adTurnInfo;
        if (!(jVar == null || (list = jVar.f275721e) == null || ((ArrayList) list).size() < 2)) {
            ADXml.C95027o oVar = (ADXml.C95027o) ((ArrayList) adXml.adTurnInfo.f275721e).get(fVar2.f280156a);
            int i = oVar.f275742c;
            if (i >= 0) {
                int[][] iArr = f280138v;
                if (i < 3) {
                    int[] iArr2 = iArr[i];
                    TextView textView = (TextView) fVar2.f280159d.f280162F0.findViewById(iArr2[0]);
                    TextView textView2 = (TextView) fVar2.f280159d.f280162F0.findViewById(iArr2[1]);
                    if (Util.isNullOrNil(oVar.f275740a)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setVisibility(0);
                        textView.setText(oVar.f275740a);
                    }
                    if (Util.isNullOrNil(oVar.f275741b)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(oVar.f275741b);
                    }
                    View view3 = (View) textView.getParent();
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view4 = (View) textView2.getParent();
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "switchText", "(Lcom/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem$Holder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("switchText", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        if (this.f279904e != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f279904e.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.f280140r = displayMetrics.widthPixels;
            this.f280141s = displayMetrics.heightPixels;
            SnsMethodCalculate.markStartTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
            int min = Math.min(this.f280140r, this.f280141s);
            SnsMethodCalculate.markEndTimeMs("getScreenWidth", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
            this.f280139q = (((min - C76577a.m92151b(this.f279904e, 54)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - this.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
        }
        C95951g gVar = (C95951g) baseViewHolder;
        if (BaseTimeLineItem.m122773q(gVar) != null && !gVar.f280163G0) {
            BaseTimeLineItem.m122773q(gVar).setLayoutResource(C0966R.C0971layout.c4s);
            if (!gVar.f280163G0) {
                gVar.f280162F0 = BaseTimeLineItem.m122773q(gVar).inflate();
                gVar.f280163G0 = true;
            }
        } else if (!gVar.f280163G0) {
            gVar.f280162F0 = gVar.f279960i.findViewById(C0966R.C0970id.kus);
            gVar.f280163G0 = true;
        }
        ViewGroup.LayoutParams layoutParams = gVar.f280162F0.getLayoutParams();
        int i = this.f280139q;
        layoutParams.width = i;
        layoutParams.height = i;
        ((RoundedCornerFrameLayout) gVar.f280162F0).setRadius(8.0f);
        C96066m2 m2Var = gVar.f280167K0;
        View C = mo133468C(gVar.f280162F0, 0, 6);
        m2Var.f280505h = C;
        m2Var.f280501d = C;
        m2Var.f280502e = (VideoSightView) C.findViewById(C0966R.C0970id.f39);
        baseViewHolder.f279953e0.f280502e.setMute(true);
        m2Var.f280506i = (ImageView) m2Var.f280505h.findViewById(C0966R.C0970id.k17);
        m2Var.f280507j = (MMPinProgressBtn) m2Var.f280505h.findViewById(C0966R.C0970id.i7j);
        m2Var.f280509l = (TextView) m2Var.f280505h.findViewById(C0966R.C0970id.f357936ck1);
        m2Var.f280508k = (TextView) m2Var.f280505h.findViewById(C0966R.C0970id.ckr);
        VideoSightView videoSightView = m2Var.f280502e;
        videoSightView.f273547P = true;
        videoSightView.setScaleType(QImageView.C97274a.CENTER_CROP);
        VideoSightView videoSightView2 = m2Var.f280502e;
        int i2 = this.f280139q;
        videoSightView2.mo130072c(i2, i2);
        gVar.f280165I0 = gVar.f280162F0.findViewById(C0966R.C0970id.f359362ki0);
        gVar.f280166J0 = gVar.f280162F0.findViewById(C0966R.C0970id.khz);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        C95944p pVar;
        String str;
        String str2;
        LinkedList<C101804kv2> linkedList;
        boolean z;
        Integer num;
        int i3;
        C95950f fVar;
        View view;
        String str3;
        C95944p pVar2;
        C101804kv2 kv22;
        int i4;
        C95951g gVar;
        View view2;
        Integer num2;
        C95950f fVar2;
        String str4;
        Integer num3;
        int i5;
        SnsInfo snsInfo;
        C98963o oVar;
        int[] iArr;
        C95944p pVar3 = this;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        String str5 = "fillItem";
        String str6 = "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem";
        SnsMethodCalculate.markStartTimeMs(str5, str6);
        int i6 = 0;
        String str7 = "MiroMsg.TurnMediaTimeLineItem";
        Log.m105925i(str7, "fill turn card ad item %d", Integer.valueOf(i));
        if (baseViewHolder2.f279985u0) {
            Log.m105924i(str7, "holder is busy");
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            return;
        }
        C95951g gVar2 = (C95951g) baseViewHolder2;
        gVar2.f280162F0.setTag(gVar2);
        View view3 = gVar2.f280162F0;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        SnsMethodCalculate.markStartTimeMs("clear", str6);
        int[] iArr2 = f280136t;
        for (int i7 = 0; i7 < 2; i7++) {
            View findViewById = gVar2.f280162F0.findViewById(iArr2[i7]);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = findViewById;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "clear", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "clear", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById instanceof MaskImageView) {
                ((MaskImageView) findViewById).setScaleType(QImageView.C97274a.CENTER_CROP);
            }
        }
        int[] iArr3 = f280137u;
        int i8 = 0;
        while (i8 < 1) {
            View findViewById2 = gVar2.f280162F0.findViewById(iArr3[i8]);
            if (findViewById2 != null) {
                findViewById2.setBackground((Drawable) null);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                iArr = iArr3;
                aVar3.mo10233c(8);
                View view6 = findViewById2;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "clear", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "clear", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (findViewById2 instanceof ViewGroup) {
                    ((ViewGroup) findViewById2).setClipChildren(false);
                }
            } else {
                iArr = iArr3;
            }
            i8++;
            iArr3 = iArr;
        }
        SnsMethodCalculate.markEndTimeMs("clear", str6);
        baseViewHolder2.f279972o.setLayoutParams(new LinearLayout.LayoutParams((((((WindowManager) pVar3.f279904e.getSystemService("window")).getDefaultDisplay().getWidth() - C76577a.m92151b(pVar3.f279904e, 54)) - pVar3.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3906ig)) - pVar3.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6)) - pVar3.f279904e.getResources().getDimensionPixelSize(C0966R.dimen.f3956le), -2));
        if (!w6Var2.f281391r || i2 != 11) {
            str2 = str5;
            str = str6;
            pVar = pVar3;
        } else {
            C101789j00 j002 = timeLineObject2.ContentObj;
            if (!(j002 == null || (linkedList = j002.f298427h) == null)) {
                int i9 = 2;
                if (linkedList.size() >= 2) {
                    int i15 = gVar2.f279958h == 1 ? 1 : 0;
                    C95950f fVar3 = null;
                    C95950f fVar4 = null;
                    C95944p pVar4 = pVar3;
                    int i16 = 0;
                    while (i16 < Math.min(timeLineObject2.ContentObj.f298427h.size(), i9)) {
                        C101804kv2 kv23 = timeLineObject2.ContentObj.f298427h.get(i16);
                        C95950f fVar5 = fVar3;
                        View C = pVar4.mo133468C(gVar2.f280162F0, i16, i9);
                        C9556a aVar4 = new C9556a();
                        String str8 = str5;
                        String str9 = str7;
                        aVar4.mo10233c(4);
                        View view7 = C;
                        C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view7, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C.setTag(baseViewHolder2);
                        C.setOnClickListener(snsTimeLineBaseAdapter2.f278572f.f280365U);
                        if (kv23.f298690e == 2) {
                            C94901o Fx0 = C94866e1.Fx0();
                            int hashCode = pVar4.f279904e.hashCode();
                            C96983o3 c = C96983o3.m124651c();
                            c.f284145b = timeLineObject2.CreateTime;
                            Fx0.mo131108b0(kv23, C, -1, hashCode, c, 3, (String) null);
                            num = i6;
                        } else {
                            C94901o Fx02 = C94866e1.Fx0();
                            int hashCode2 = pVar4.f279904e.hashCode();
                            C96983o3 c2 = C96983o3.m124651c();
                            num = i6;
                            c2.f284145b = timeLineObject2.CreateTime;
                            Fx02.mo131116f0(kv23, C, hashCode2, c2);
                        }
                        if (kv23.f298690e == 6 && i15 == i16) {
                            boolean z2 = i15 > 0;
                            long j = w6Var2.f281383j;
                            C96066m2 m2Var = gVar2.f280167K0;
                            SnsInfo snsInfo2 = w6Var2.f281367a;
                            str3 = str6;
                            View view8 = m2Var.f280501d;
                            m2Var.f280498a = timeLineObject2;
                            C101804kv2 kv24 = kv23;
                            int i17 = i15;
                            View view9 = view8;
                            C96066m2 m2Var2 = m2Var;
                            fVar = fVar5;
                            view = C;
                            C95951g gVar3 = gVar2;
                            int i18 = i16;
                            SnsInfo snsInfo3 = snsInfo2;
                            long j2 = j;
                            String str10 = str9;
                            m2Var.f280502e.setOnCompletionListener(new C95945a(this, snsTimeLineBaseAdapter, j, z2));
                            if (!snsTimeLineBaseAdapter2.f278568b.f276699f.mo138310q(j2 + ((long) i18))) {
                                VideoSightView videoSightView = m2Var2.f280502e;
                                str4 = str10;
                                num3 = num;
                                int i19 = i18;
                                i5 = i18;
                                kv22 = kv24;
                                C95946b bVar = r0;
                                C95946b bVar2 = new C95946b(this, snsTimeLineBaseAdapter, j2, z2, i19, m2Var2);
                                videoSightView.setOnDecodeDurationListener(bVar);
                            } else {
                                str4 = str10;
                                num3 = num;
                                kv22 = kv24;
                                i5 = i18;
                                BaseTimeLine baseTimeLine = snsTimeLineBaseAdapter2.f278568b;
                                if (!(baseTimeLine == null || (oVar = baseTimeLine.f276699f) == null)) {
                                    oVar.mo138287B(j2, Util.currentTicks(), z2);
                                }
                            }
                            m2Var2.mo133598a(timeLineObject2, i, w6Var2.f281381h, w6Var2.f281391r);
                            m2Var2.f280508k.setVisibility(8);
                            C94901o Fx03 = C94866e1.Fx0();
                            long nanoTime = System.nanoTime();
                            boolean x = Fx03.mo131141x(kv22);
                            str7 = str4;
                            Log.m105925i(str7, "isMediaSightExist %b duration %s", Boolean.valueOf(x), Long.valueOf(System.nanoTime() - nanoTime));
                            if (!x) {
                                if (Fx03.mo131140w(kv22)) {
                                    m2Var2.f280506i.setVisibility(8);
                                    m2Var2.f280507j.setVisibility(0);
                                    m2Var2.f280507j.mo153891a();
                                    pVar2 = this;
                                    snsInfo = snsInfo3;
                                } else {
                                    snsInfo = snsInfo3;
                                    if (Fx03.mo131133p(snsInfo) == 5) {
                                        Fx03.mo131097Q(kv22);
                                        m2Var2.f280506i.setVisibility(8);
                                        m2Var2.f280507j.setVisibility(0);
                                        m2Var2.f280507j.mo153891a();
                                    } else if (Fx03.mo131137t(kv22)) {
                                        m2Var2.f280507j.setVisibility(8);
                                        m2Var2.f280506i.setImageResource(C0966R.raw.shortvideo_play_icon_err);
                                        m2Var2.f280506i.setVisibility(0);
                                    } else {
                                        Fx03.mo131098R(kv22);
                                        m2Var2.f280506i.setVisibility(0);
                                        m2Var2.f280507j.setVisibility(8);
                                        pVar2 = this;
                                        i3 = i5;
                                        m2Var2.f280506i.setImageDrawable(C76577a.m92158i(pVar2.f279904e, C0966R.raw.shortvideo_play_btn));
                                        m2Var2.f280506i.setContentDescription(pVar2.f279904e.getString(C0966R.string.f361136hk0));
                                        if (Fx03.mo131133p(snsInfo) == 4) {
                                            m2Var2.f280508k.setVisibility(0);
                                        }
                                    }
                                    pVar2 = this;
                                }
                                i3 = i5;
                            } else {
                                pVar2 = this;
                                snsInfo = snsInfo3;
                                i3 = i5;
                                if (Fx03.mo131143z(kv22)) {
                                    m2Var2.f280506i.setVisibility(0);
                                    m2Var2.f280507j.setVisibility(8);
                                    m2Var2.f280506i.setImageDrawable(C76577a.m92158i(pVar2.f279904e, C0966R.raw.shortvideo_play_btn));
                                    m2Var2.f280506i.setContentDescription(pVar2.f279904e.getString(C0966R.string.f361136hk0));
                                } else if (Fx03.mo131139v(kv22)) {
                                    m2Var2.f280506i.setVisibility(8);
                                    m2Var2.f280507j.setVisibility(8);
                                } else if (Fx03.mo131133p(snsInfo) <= 5) {
                                    m2Var2.f280506i.setVisibility(8);
                                    m2Var2.f280507j.setVisibility(8);
                                } else {
                                    Fx03.mo131098R(kv22);
                                    m2Var2.f280506i.setVisibility(0);
                                    m2Var2.f280507j.setVisibility(8);
                                    m2Var2.f280506i.setImageDrawable(C76577a.m92158i(pVar2.f279904e, C0966R.raw.shortvideo_play_btn));
                                    m2Var2.f280506i.setContentDescription(pVar2.f279904e.getString(C0966R.string.f361136hk0));
                                }
                                m2Var2.f280502e.f273545M.mo130049i();
                            }
                            ViewGroup.LayoutParams layoutParams = m2Var2.f280509l.getLayoutParams();
                            int i25 = pVar2.f280139q;
                            layoutParams.width = i25;
                            layoutParams.height = i25;
                            m2Var2.f280509l.setLayoutParams(layoutParams);
                            m2Var2.f280502e.setTagObject(m2Var2);
                            VideoSightView videoSightView2 = m2Var2.f280502e;
                            int hashCode3 = pVar2.f279904e.hashCode();
                            C96983o3 c3 = C96983o3.m124651c();
                            c3.f284145b = timeLineObject2.CreateTime;
                            Fx03.mo131112d0(snsInfo, kv22, videoSightView2, -1, hashCode3, i, c3, w6Var2.f281391r, true);
                            Fx03.mo131118g0();
                            C9556a aVar5 = new C9556a();
                            num2 = num3;
                            aVar5.mo10233c(num2);
                            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2 = view9;
                            view2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            SnsInfo snsInfo4 = snsInfo;
                            m2Var2.f280505h.setTag(baseViewHolder);
                            i4 = i17;
                            gVar = gVar3;
                            m2Var2.f280505h.setOnClickListener(new C95947c(pVar2, i4, snsTimeLineBaseAdapter2, gVar));
                            if (C86013q1.m106450k(C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134725T(kv22))) {
                                snsTimeLineBaseAdapter2.f278568b.f276699f.mo138293H(w6Var2.f281383j, 0, true, z2);
                            } else {
                                snsTimeLineBaseAdapter2.f278568b.f276699f.mo138293H(w6Var2.f281383j, 0, false, z2);
                            }
                            snsTimeLineBaseAdapter2.f278568b.f276699f.mo138291F(w6Var2.f281383j, C94866e1.Fx0().mo131133p(snsInfo4) == 5, 1, z2);
                            pVar4 = pVar2;
                        } else {
                            fVar = fVar5;
                            view = C;
                            gVar = gVar2;
                            i3 = i16;
                            kv22 = kv23;
                            str3 = str6;
                            i4 = i15;
                            num2 = num;
                            str7 = str9;
                            pVar2 = pVar3;
                            view2 = null;
                        }
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int i26 = pVar4.f280139q;
                        layoutParams2.width = i26;
                        layoutParams2.height = i26;
                        View view10 = view;
                        view10.setLayoutParams(layoutParams2);
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                            int i27 = pVar4.f280139q;
                            layoutParams3.width = i27;
                            layoutParams3.height = i27;
                            view2.setLayoutParams(layoutParams3);
                        }
                        int i28 = i3;
                        if (i4 == i28) {
                            if (kv22.f298690e == 2) {
                                C9556a aVar6 = new C9556a();
                                aVar6.mo10233c(num2);
                                View view11 = view10;
                                C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view11, "com/tencent/mm/plugin/sns/ui/item/TurnMediaTimeLineItem", "fillItem", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view10.setOnTouchListener(new C95948d(pVar4));
                            }
                        }
                        C95950f fVar6 = new C95950f();
                        fVar6.f280156a = i28;
                        if (view2 == null) {
                            view2 = view10;
                        }
                        fVar6.f280157b = view2;
                        fVar6.f280158c = view10;
                        fVar6.f280159d = gVar;
                        fVar6.f280160e = w6Var2.f281367a;
                        C95950f fVar7 = fVar;
                        if (fVar7 != null) {
                            fVar7.f280161f = fVar6;
                            fVar2 = fVar4;
                        } else {
                            fVar2 = fVar6;
                        }
                        if (i28 == timeLineObject2.ContentObj.f298427h.size() - 1) {
                            fVar6.f280161f = fVar2;
                        }
                        if (i28 == i4) {
                            gVar.f280164H0 = fVar6;
                            pVar4.mo133469D(fVar6);
                        }
                        i16 = i28 + 1;
                        baseViewHolder2 = baseViewHolder;
                        fVar4 = fVar2;
                        fVar3 = fVar6;
                        pVar3 = pVar2;
                        str5 = str8;
                        str6 = str3;
                        i9 = 2;
                        i15 = i4;
                        C95951g gVar4 = gVar;
                        i6 = num2;
                        gVar2 = gVar4;
                    }
                    C95951g gVar5 = gVar2;
                    String str11 = str5;
                    String str12 = str6;
                    int i29 = i15;
                    C95944p pVar5 = pVar3;
                    View view12 = gVar5.f279960i;
                    if (view12 == null || !(view12 instanceof FrameLayout)) {
                        z = false;
                    } else {
                        z = false;
                        ((FrameLayout) view12).setClipChildren(false);
                    }
                    LinearLayout linearLayout = gVar5.f279972o;
                    if (linearLayout != null) {
                        linearLayout.setClipChildren(z);
                    }
                    View view13 = gVar5.f279959h0;
                    if (view13 != null && (view13 instanceof LinearLayout)) {
                        ((LinearLayout) view13).setClipChildren(z);
                    }
                    gVar5.f280162F0.setOnClickListener(new C95949e(pVar4, snsTimeLineBaseAdapter2, i29, gVar5));
                    pVar = pVar4;
                    str2 = str11;
                    str = str12;
                }
            }
            C95944p pVar6 = pVar3;
            Log.m105920e(str7, "not enough medias!");
            SnsMethodCalculate.markEndTimeMs(str5, str6);
            return;
        }
        pVar.mo133391g(w6Var2, 1);
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.TurnMediaTimeLineItem");
        return "TurnMediaTimeLineItem";
    }
}
