package d60;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d50.C58115i;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;

/* renamed from: d60.f1 */
public final class C58134f1 extends C58121a {

    /* renamed from: f */
    public C58124b f166538f;

    /* renamed from: g */
    public View f166539g;

    /* renamed from: h */
    public ViewGroup f166540h;

    /* renamed from: i */
    public RelativeLayout f166541i;

    /* renamed from: j */
    public final WeImageView f166542j;

    /* renamed from: n */
    public SurfaceView f166543n;

    /* renamed from: o */
    public C60735a f166544o;

    /* renamed from: d60.f1$a */
    public static final class C58135a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58134f1 f166545d;

        public C58135a(C58134f1 f1Var) {
            this.f166545d = f1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVideoMicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f166545d.f166538f, C58124b.C58125b.LIVE_STATUS_VIDEO_MIC, (Bundle) null, 2, (Object) null);
            this.f166545d.mo82901x0(false);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVideoMicPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.f1$b */
    public static final class C58136b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58134f1 f166546d;

        public C58136b(C58134f1 f1Var) {
            this.f166546d = f1Var;
        }

        public final void onClick(View view) {
            C58115i iVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVideoMicPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            this.f166546d.mo82901x0(true);
            C60735a aVar = this.f166546d.f166544o;
            if (aVar == null || (iVar = aVar.f172989A) == null || iVar.mo82884f()) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorForgiveLinkVideoBeforeConnect");
                C115669n.INSTANCE.mo175913w(1386, 4, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVideoMicPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.f1$c */
    public static final class C58137c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58134f1 f166547d;

        public C58137c(C58134f1 f1Var) {
            this.f166547d = f1Var;
        }

        public final void onClick(View view) {
            C58115i iVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVideoMicPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = true;
            this.f166547d.mo82901x0(true);
            C60735a aVar = this.f166547d.f166544o;
            if (aVar == null || (iVar = aVar.f172989A) == null || iVar.mo82884f()) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorForgiveLinkVideoBeforeConnect");
                C115669n.INSTANCE.mo175913w(1386, 4, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVideoMicPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.f1$d */
    public static final class C58138d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58134f1 f166548d;

        public C58138d(C58134f1 f1Var) {
            this.f166548d = f1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
            r8 = r8.f166253d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/live/plugin/LiveVideoMicPlugin$4"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                d60.f1 r8 = r7.f166548d
                d60.b r8 = r8.f166538f
                d60.b$b r0 = d60.C58124b.C58125b.SWITCH_CAMERA
                r1 = 2
                r2 = 0
                d60.C58124b.C7172a.m7372a(r8, r0, r2, r1, r2)
                com.tencent.mm.live.model.RoomLiveService r8 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
                d50.h r8 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
                if (r8 == 0) goto L_0x002e
                d50.f r2 = r8.f166253d
            L_0x002e:
                if (r2 != 0) goto L_0x0031
                goto L_0x003f
            L_0x0031:
                r0 = 1
                if (r8 == 0) goto L_0x003b
                d50.f r8 = r8.f166253d
                if (r8 == 0) goto L_0x003b
                boolean r8 = r8.f166227b
                goto L_0x003c
            L_0x003b:
                r8 = 1
            L_0x003c:
                r8 = r8 ^ r0
                r2.f166227b = r8
            L_0x003f:
                java.lang.String r8 = "com/tencent/mm/live/plugin/LiveVideoMicPlugin$4"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d60.C58134f1.C58138d.onClick(android.view.View):void");
        }
    }

    /* renamed from: d60.f1$e */
    public static final class C58139e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C58134f1 f166549d;

        public C58139e(C58134f1 f1Var) {
            this.f166549d = f1Var;
        }

        public void onAnimationEnd(Animator animator) {
            this.f166549d.mo10792g(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58134f1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166538f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.g05);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…eo_mic_dialog_blank_area)");
        this.f166539g = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.g07);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…mic_dialog_content_group)");
        this.f166540h = (ViewGroup) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.g3w);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.local_camera_view)");
        this.f166541i = (RelativeLayout) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.g09);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…_video_mic_dialog_ok_btn)");
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.g06);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.l…eo_mic_dialog_cancel_btn)");
        WeImageView weImageView = (WeImageView) viewGroup.findViewById(C0966R.C0970id.g0_);
        this.f166542j = weImageView;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.b7p, (ViewGroup) null);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.SurfaceView");
        this.f166543n = (SurfaceView) inflate;
        ((Button) findViewById4).setOnClickListener(new C58135a(this));
        ((Button) findViewById5).setOnClickListener(new C58136b(this));
        this.f166539g.setOnClickListener(new C58137c(this));
        weImageView.setOnClickListener(new C58138d(this));
        this.f166540h.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        if (viewGroup.findViewById(C0966R.C0970id.bsc) != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            if (!mo82893g0()) {
                layoutParams.bottomMargin = C75044y4.m89991c(viewGroup.getContext());
            }
            layoutParams.width = C75044y4.m89990b(viewGroup.getContext()).y;
            layoutParams.addRule(14);
            ((RelativeLayout) viewGroup.findViewById(C0966R.C0970id.bsc)).setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        mo82901x0(true);
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C58115i iVar;
        C58115i iVar2;
        C58115i iVar3;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z = true;
        if (ordinal == 10) {
            C60735a aVar = this.f166544o;
            if (aVar == null || (iVar = aVar.f172989A) == null || !iVar.mo82884f()) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorSwitchCameraWhileWaitingConnect");
                C115669n.INSTANCE.mo175913w(1386, 6, 1);
                return;
            }
            Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorSwitchCameraWhileWaitingConnect");
            C115669n.INSTANCE.mo175913w(1386, 5, 1);
        } else if (ordinal != 17) {
            switch (ordinal) {
                case 42:
                    mo10792g(0);
                    ViewParent parent = this.f166543n.getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(this.f166543n);
                    }
                    this.f166541i.addView(this.f166543n);
                    this.f166542j.bringToFront();
                    this.f166540h.animate().translationY(0.0f).setListener((Animator.AnimatorListener) null).start();
                    return;
                case 43:
                    C60735a aVar2 = this.f166544o;
                    if (aVar2 == null || (iVar3 = aVar2.f172989A) == null || !iVar3.mo82884f()) {
                        z = false;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorChangeToAudioAfterLinkVideo");
                        C115669n.INSTANCE.mo175913w(1386, 10, 1);
                        return;
                    }
                    return;
                case 44:
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    RoomLiveService.f157184P = true;
                    return;
                default:
                    return;
            }
        } else {
            C60735a aVar3 = this.f166544o;
            if (aVar3 == null || (iVar2 = aVar3.f172989A) == null || !iVar2.mo82884f()) {
                z = false;
            }
            if (z) {
                Log.m105924i("MicroMsg.LiveLinkMicIDKeyStat", "markVisitorHangUpLinkMicAfterLinkVideo");
                C115669n.INSTANCE.mo175913w(1386, 9, 1);
            }
        }
    }

    /* renamed from: x0 */
    public final void mo82901x0(boolean z) {
        this.f166540h.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setListener(new C58139e(this)).start();
        if (z) {
            C58124b.C7172a.m7372a(this.f166538f, C58124b.C58125b.LIVE_STATUS_SWITCH_AUDIO_MIC, (Bundle) null, 2, (Object) null);
        }
        this.f166541i.removeView(this.f166543n);
    }
}
