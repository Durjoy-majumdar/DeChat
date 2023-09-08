package d60;

import a43.C103310i;
import a60.C53979a;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveAnchorLinkMicStruct;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import e60.C58532b;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import g60.C75864h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.C48949c32;
import te3.C48964c63;
import te3.C49317ep2;
import z50.C16103b;
import z50.C16109n;

/* renamed from: d60.h */
public final class C58141h extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f166551f;

    /* renamed from: g */
    public final String f166552g = "MicroMsg.LiveAnchorMicPlugin";

    /* renamed from: h */
    public final Context f166553h;

    /* renamed from: i */
    public final LinearLayout f166554i;

    /* renamed from: j */
    public final ImageView f166555j;

    /* renamed from: n */
    public final ImageView f166556n;

    /* renamed from: o */
    public final ImageView f166557o;

    /* renamed from: p */
    public final TextView f166558p;

    /* renamed from: q */
    public final TextView f166559q;

    /* renamed from: r */
    public final ImageView f166560r;

    /* renamed from: s */
    public final RelativeLayout f166561s;

    /* renamed from: t */
    public final LiveAnchorMicUserListView f166562t;

    /* renamed from: u */
    public final C75864h f166563u;

    /* renamed from: v */
    public C54655b f166564v;

    /* renamed from: d60.h$a */
    public static final class C58142a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166565d;

        public C58142a(C58141h hVar) {
            this.f166565d = hVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            String str = RoomLiveService.f157192c;
            long j = RoomLiveService.f157197h.f133050d;
            int size = RoomLiveService.f157185Q.f151233h.size();
            boolean micPermission = this.f166565d.f166562t.getMicPermission();
            int i = RoomLiveService.f157182N;
            String str2 = C58532b.f167566a;
            C87412m.m108594g(str, "roomId");
            LiveAnchorLinkMicStruct liveAnchorLinkMicStruct = new LiveAnchorLinkMicStruct();
            RoomLiveService.f157182N = 0;
            liveAnchorLinkMicStruct.f156336d = liveAnchorLinkMicStruct.mo86045b("roomid", str, true);
            liveAnchorLinkMicStruct.f156337e = j;
            liveAnchorLinkMicStruct.f156338f = (long) size;
            liveAnchorLinkMicStruct.f156339g = micPermission ? 1 : 0;
            liveAnchorLinkMicStruct.f156341i = (long) i;
            liveAnchorLinkMicStruct.mo86054n();
        }
    }

    /* renamed from: d60.h$b */
    public static final class C58143b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58143b(C58141h hVar) {
            super(0);
            this.f166566d = hVar;
        }

        public Object invoke() {
            this.f166566d.f166563u.dismiss();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.h$c */
    public static final class C58144c extends C87413o implements C32227p<Boolean, C53979a.C53980a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58144c(C58141h hVar) {
            super(2);
            this.f166567d = hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C53979a.C53980a aVar = (C53979a.C53980a) obj2;
            String str = null;
            if (((Boolean) obj).booleanValue()) {
                this.f166567d.f166561s.setVisibility(0);
                this.f166567d.f166554i.setVisibility(4);
                Bundle bundle = new Bundle();
                if (aVar != null) {
                    str = aVar.f151238c;
                }
                bundle.putString("PARAM_LIVE_WXID", str);
                this.f166567d.f166551f.statusChange(C58124b.C58125b.LIVE_START_MIC_CGI, bundle);
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                RoomLiveService.f157183O = System.currentTimeMillis();
                RoomLiveService.f157186R = (long) RoomLiveService.f157197h.f133055i;
            } else {
                this.f166567d.mo82911z0();
                C58124b.C7172a.m7372a(this.f166567d.f166551f, C58124b.C58125b.LIVE_STOP_MIC, (Bundle) null, 2, (Object) null);
                String str2 = RoomLiveService.f157192c;
                long j = RoomLiveService.f157197h.f133050d;
                String str3 = RoomLiveService.f157199j;
                String s = C75592q0.m90789s();
                C87412m.m108593f(s, "getUsernameFromUserInfo()");
                C58532b.m67947c(str2, j, str3, 9, 4, s, RoomLiveService.f157197h.f133055i);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.h$d */
    public static final class C58145d extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58145d(C58141h hVar) {
            super(1);
            this.f166568d = hVar;
        }

        public Object invoke(Object obj) {
            this.f166568d.mo82909x0(((Boolean) obj).booleanValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.h$e */
    public static final class C58146e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58146e(C58141h hVar) {
            super(1);
            this.f166569d = hVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (this.f166569d.f166563u.isShowing()) {
                this.f166569d.f166562t.mo76461d();
            } else {
                int i = 4;
                this.f166569d.f166560r.setVisibility(booleanValue ? 0 : 4);
                ImageView imageView = this.f166569d.f166557o;
                if (booleanValue) {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.h$f */
    public static final class C58147f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58147f(C58141h hVar) {
            super(1);
            this.f166570d = hVar;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            RoomLiveService.f157185Q.mo74652b();
            Context context = this.f166570d.f166553h;
            C76912y0.makeText(context, (CharSequence) C76577a.m92166q(context, C0966R.string.g_f), 0).show();
            this.f166570d.mo82911z0();
            ((C103310i) this.f166570d.f166562t.f157236e).mo143086b("playend", true, 1, true);
            LiveAnchorMicUserListView liveAnchorMicUserListView = this.f166570d.f166562t;
            liveAnchorMicUserListView.f157243o = true;
            liveAnchorMicUserListView.f157242n = null;
            liveAnchorMicUserListView.mo76461d();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.h$g */
    public static final class C58148g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166571d;

        public C58148g(C58141h hVar) {
            this.f166571d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAnchorMicPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f166571d.f166560r.setVisibility(4);
            this.f166571d.f166557o.setVisibility(4);
            this.f166571d.f166562t.mo76461d();
            this.f166571d.f166562t.mo76460c();
            this.f166571d.f166563u.show();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAnchorMicPlugin$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h$h */
    public static final class C58149h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166572d;

        public C58149h(C58141h hVar) {
            this.f166572d = hVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAnchorMicPlugin$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f166572d.f166560r.setVisibility(4);
            this.f166572d.f166557o.setVisibility(4);
            this.f166572d.f166562t.mo76461d();
            this.f166572d.f166562t.mo76460c();
            this.f166572d.f166563u.show();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAnchorMicPlugin$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.h$i */
    public static final class C58150i extends C87413o implements C32226l<C53979a.C53980a, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C48964c63 f166573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58150i(C48964c63 c632) {
            super(1);
            this.f166573d = c632;
        }

        public Object invoke(Object obj) {
            C53979a.C53980a aVar = (C53979a.C53980a) obj;
            C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(Util.isEqual(aVar.f151238c, this.f166573d.f131548d));
        }
    }

    /* renamed from: d60.h$j */
    public static final class C58151j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58141h f166574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58151j(C58141h hVar) {
            super(0);
            this.f166574d = hVar;
        }

        public Object invoke() {
            this.f166574d.f166562t.mo76461d();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58141h(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166551f = bVar;
        this.f166553h = viewGroup.getContext();
        this.f166554i = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.fy4);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.frj);
        ImageView imageView = (ImageView) viewGroup.findViewById(C0966R.C0970id.f358588fy3);
        this.f166555j = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(C0966R.C0970id.frh);
        this.f166556n = imageView2;
        this.f166557o = (ImageView) viewGroup.findViewById(C0966R.C0970id.fy7);
        this.f166558p = (TextView) viewGroup.findViewById(C0966R.C0970id.fy5);
        this.f166559q = (TextView) viewGroup.findViewById(C0966R.C0970id.fwj);
        this.f166560r = (ImageView) viewGroup.findViewById(C0966R.C0970id.fri);
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(C0966R.C0970id.frk);
        this.f166561s = relativeLayout;
        Context context = viewGroup.getContext();
        C87412m.m108593f(context, "root.context");
        LiveAnchorMicUserListView liveAnchorMicUserListView = new LiveAnchorMicUserListView(context, (AttributeSet) null, 0);
        this.f166562t = liveAnchorMicUserListView;
        Context context2 = viewGroup.getContext();
        C87412m.m108593f(context2, "root.context");
        C75864h hVar = new C75864h(context2);
        this.f166563u = hVar;
        if (C54655b.f153178f1 == null) {
            C54655b.f153178f1 = new C54655b();
        }
        C54655b bVar2 = C54655b.f153178f1;
        C87412m.m108591d(bVar2);
        this.f166564v = bVar2;
        hVar.setContentView(liveAnchorMicUserListView);
        hVar.setOnDismissListener(new C58142a(this));
        liveAnchorMicUserListView.setHideClickListener(new C58143b(this));
        liveAnchorMicUserListView.setCallMicListener(new C58144c(this));
        liveAnchorMicUserListView.setMicPermissionListener(new C58145d(this));
        Drawable drawable = viewGroup.getResources().getDrawable(C0966R.raw.icons_filled_call);
        C74933u4.m89769f(drawable, -16777216);
        imageView2.setImageDrawable(drawable);
        Drawable drawable2 = viewGroup.getResources().getDrawable(C0966R.raw.icons_filled_call);
        C74933u4.m89769f(drawable2, -1);
        imageView.setImageDrawable(drawable2);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157185Q.f151226a = new C58146e(this);
        C53979a aVar = RoomLiveService.f157185Q;
        C58147f fVar = new C58147f(this);
        aVar.getClass();
        aVar.f151232g = fVar;
        relativeLayout.setOnClickListener(new C58148g(this));
        imageView.setOnClickListener(new C58149h(this));
    }

    /* renamed from: A0 */
    public final void mo82908A0() {
        this.f166559q.setText(this.f166287d.getContext().getString(C0966R.string.g_p));
        ImageView imageView = this.f166556n;
        Drawable drawable = this.f166287d.getResources().getDrawable(C0966R.raw.icons_filled_video_call);
        C74933u4.m89769f(drawable, -16777216);
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C49317ep2 j1;
        Log.m105924i(this.f166552g, "errType:" + i + " errCode:" + i2);
        if (yVar instanceof C16103b) {
            if (i == 0 && i2 == 0 && (j1 = ((C16103b) yVar).mo14699j1()) != null) {
                String str2 = "mic permission default:" + j1.f133061r;
                C87412m.m108594g(str2, "debugText");
                Log.m105924i("MicroMsg.LiveCoreMic", str2);
                this.f166562t.setDefaultMicState(j1.f133061r);
                mo82909x0(j1.f133061r);
            }
        } else if ((yVar instanceof C16109n) && i == 0 && i2 == 0) {
            C48949c32 c322 = ((C16109n) yVar).f43276f;
            Integer num = null;
            LinkedList<C48964c63> linkedList = c322 != null ? c322.f131480d : null;
            String str3 = this.f166552g;
            StringBuilder sb = new StringBuilder();
            sb.append("userList.size:");
            if (linkedList != null) {
                num = Integer.valueOf(linkedList.size());
            }
            sb.append(num);
            Log.m105924i(str3, sb.toString());
            if (linkedList != null) {
                for (C48964c63 c632 : linkedList) {
                    Log.m105924i(this.f166552g, "onlineMemberInfo.name:" + c632.f131548d + ", onlineMemberInfo.online:" + c632.f131549e);
                    if (!c632.f131549e) {
                        RoomLiveService roomLiveService = RoomLiveService.f157190a;
                        C64175a0.m75512t(RoomLiveService.f157185Q.f151233h, new C58150i(c632));
                    }
                }
            }
            C61926c.m72668M(new C58151j(this));
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 7) {
            if (ordinal == 13) {
                RoomLiveService.f157173E++;
                RoomLiveService.f157182N++;
                LiveAnchorMicUserListView liveAnchorMicUserListView = this.f166562t;
                liveAnchorMicUserListView.f157244p = false;
                liveAnchorMicUserListView.f157241j.notifyDataSetChanged();
                mo82910y0();
            } else if (ordinal == 16) {
                mo82910y0();
                mo82911z0();
            } else if (ordinal == 27) {
                LiveAnchorMicUserListView liveAnchorMicUserListView2 = this.f166562t;
                int i = LiveAnchorMicUserListView.f157234t;
                liveAnchorMicUserListView2.mo76459b((C32227p<? super Integer, ? super Integer, C13598b0>) null);
            }
        } else if (this.f166564v.f172989A.mo82884f()) {
            this.f166562t.setMicUser(RoomLiveService.f157185Q.f151234i);
            this.f166561s.setVisibility(0);
            this.f166554i.setVisibility(4);
            mo82908A0();
            this.f166562t.mo76461d();
        } else if (this.f166564v.f172989A.mo82882d()) {
            this.f166562t.setMicUser(RoomLiveService.f157185Q.f151234i);
            this.f166561s.setVisibility(0);
            this.f166554i.setVisibility(4);
            mo82910y0();
            this.f166562t.mo76461d();
        } else {
            mo82911z0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(3806, this);
    }

    /* renamed from: x0 */
    public final void mo82909x0(boolean z) {
        if (z) {
            ImageView imageView = this.f166555j;
            Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            this.f166558p.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7x));
            return;
        }
        Drawable drawable2 = this.f166555j.getDrawable();
        if (drawable2 != null) {
            drawable2.clearColorFilter();
        }
        this.f166555j.setImageDrawable(this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_mic_disable));
        this.f166558p.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g7x));
    }

    /* renamed from: y0 */
    public final void mo82910y0() {
        this.f166559q.setText(this.f166287d.getContext().getString(C0966R.string.g_q));
        ImageView imageView = this.f166556n;
        Drawable drawable = this.f166287d.getResources().getDrawable(C0966R.raw.icons_filled_call);
        C74933u4.m89769f(drawable, -16777216);
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: z0 */
    public final void mo82911z0() {
        this.f166561s.setVisibility(8);
        this.f166554i.setVisibility(0);
    }
}
