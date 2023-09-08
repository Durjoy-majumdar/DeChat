package d60;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c60.C54670c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.LiveUIC;
import com.tencent.p014mm.live.p016ui.LiveUID;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C9556a;
import ob0.C11385n;
import p629ny.C76979h;
import te3.C49317ep2;
import y50.C15936n0;
import y50.C66519j0;
import zt3.C119157j;

/* renamed from: d60.c */
public final class C7174c extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f25146f;

    /* renamed from: g */
    public final String f25147g = "MicroMsg.LiveAfterPlugin";

    /* renamed from: h */
    public final TextView f25148h;

    /* renamed from: i */
    public final TextView f25149i;

    /* renamed from: j */
    public final TextView f25150j;

    /* renamed from: n */
    public final TextView f25151n;

    /* renamed from: o */
    public final TextView f25152o;

    /* renamed from: p */
    public final TextView f25153p;

    /* renamed from: q */
    public final LinearLayout f25154q;

    /* renamed from: r */
    public final LinearLayout f25155r;

    /* renamed from: s */
    public final ViewGroup f25156s;

    /* renamed from: t */
    public boolean f25157t;

    /* renamed from: d60.c$a */
    public static final class C7175a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f25158d;

        public C7175a(RelativeLayout relativeLayout) {
            this.f25158d = relativeLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f25158d.getContext(), LiveUIC.class);
            Context context = this.f25158d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveAfterPlugin$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/live/plugin/LiveAfterPlugin$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.c$b */
    public static final class C7176b implements View.OnClickListener {

        /* renamed from: d */
        public static final C7176b f25159d = new C7176b();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.c$c */
    public static final class C7177c implements View.OnClickListener {

        /* renamed from: d */
        public static final C7177c f25160d = new C7177c();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.c$d */
    public static final class C7178d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7174c f25161d;

        public C7178d(C7174c cVar) {
            this.f25161d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25161d.f25146f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.c$e */
    public static final class C7179e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7174c f25162d;

        public C7179e(C7174c cVar) {
            this.f25162d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25162d.f25146f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.c$f */
    public static final class C7180f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f25163d;

        public C7180f(RelativeLayout relativeLayout) {
            this.f25163d = relativeLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveAfterPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent(this.f25163d.getContext(), LiveUID.class);
            intent.putExtra("FROM_SENCE", 2);
            Context context = this.f25163d.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveAfterPlugin$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/live/plugin/LiveAfterPlugin$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (C87412m.m108589b(RoomLiveService.f157199j, C75592q0.m90789s())) {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorEnterReplayAfterLive");
                C115669n.INSTANCE.mo175913w(1385, 6, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveAfterPlugin$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7174c(RelativeLayout relativeLayout, C58124b bVar) {
        super(relativeLayout, bVar);
        C87412m.m108594g(relativeLayout, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25146f = bVar;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.f358554fq2);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_after_back_btn)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = relativeLayout.findViewById(C0966R.C0970id.fr_);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_after_title)");
        this.f25148h = (TextView) findViewById2;
        View findViewById3 = relativeLayout.findViewById(C0966R.C0970id.fqq);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_after_over_tv)");
        this.f25149i = (TextView) findViewById3;
        View findViewById4 = relativeLayout.findViewById(C0966R.C0970id.frc);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_after_visitor)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = relativeLayout.findViewById(C0966R.C0970id.frd);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_after_visitor_count)");
        this.f25150j = (TextView) findViewById5;
        View findViewById6 = relativeLayout.findViewById(C0966R.C0970id.fq4);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_after_comment_count)");
        this.f25151n = (TextView) findViewById6;
        View findViewById7 = relativeLayout.findViewById(C0966R.C0970id.fqb);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.live_after_like_count)");
        this.f25152o = (TextView) findViewById7;
        View findViewById8 = relativeLayout.findViewById(C0966R.C0970id.fq5);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.live_after_duration_tv)");
        this.f25153p = (TextView) findViewById8;
        View findViewById9 = relativeLayout.findViewById(C0966R.C0970id.fq_);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.l…after_info_visitor_group)");
        LinearLayout linearLayout = (LinearLayout) findViewById9;
        View findViewById10 = relativeLayout.findViewById(C0966R.C0970id.fq7);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.l…after_info_comment_group)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById10;
        View findViewById11 = relativeLayout.findViewById(C0966R.C0970id.fq9);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.live_after_info_like_group)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById11;
        View findViewById12 = relativeLayout.findViewById(C0966R.C0970id.fqv);
        C87412m.m108593f(findViewById12, "root.findViewById(R.id.live_after_replay_group)");
        LinearLayout linearLayout4 = (LinearLayout) findViewById12;
        this.f25154q = linearLayout4;
        View findViewById13 = relativeLayout.findViewById(C0966R.C0970id.fqy);
        C87412m.m108593f(findViewById13, "root.findViewById(R.id.l…fter_replay_switch_group)");
        LinearLayout linearLayout5 = (LinearLayout) findViewById13;
        this.f25155r = linearLayout5;
        View findViewById14 = relativeLayout.findViewById(C0966R.C0970id.frb);
        C87412m.m108593f(findViewById14, "root.findViewById(R.id.live_after_ui_root_group)");
        this.f25156s = (ViewGroup) findViewById14;
        View findViewById15 = relativeLayout.findViewById(C0966R.C0970id.fqr);
        C87412m.m108593f(findViewById15, "root.findViewById(R.id.live_after_replay_btn)");
        Button button = (Button) findViewById15;
        linearLayout5.setVisibility(8);
        linearLayout4.setVisibility(8);
        Drawable drawable = relativeLayout.getContext().getResources().getDrawable(C0966R.raw.icons_filled_back);
        C74933u4.m89769f(drawable, -1);
        imageView.setImageDrawable(drawable);
        if (bVar.getLiveRole() == 0) {
            textView.setText(relativeLayout.getContext().getResources().getString(C0966R.string.g6e));
        } else {
            textView.setText(relativeLayout.getContext().getResources().getString(C0966R.string.g6d));
            linearLayout.setOnClickListener(new C7175a(relativeLayout));
        }
        linearLayout2.setOnClickListener(C7176b.f25159d);
        linearLayout3.setOnClickListener(C7177c.f25160d);
        imageView.setOnClickListener(new C7178d(this));
        button.setOnClickListener(new C7179e(this));
        linearLayout5.setOnClickListener(new C7180f(relativeLayout));
    }

    /* renamed from: i0 */
    public void mo8357i0() {
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        C58124b.C7172a.m7372a(this.f25146f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r1 = r1.f133068y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof z50.C16103b
            if (r2 == 0) goto L_0x00f2
            if (r17 != 0) goto L_0x0109
            if (r18 != 0) goto L_0x0109
            z50.b r1 = (z50.C16103b) r1
            te3.ep2 r1 = r1.mo14699j1()
            r2 = 0
            if (r1 == 0) goto L_0x001d
            te3.ds r1 = r1.f133068y
            if (r1 == 0) goto L_0x001d
            long r3 = r1.f132516d
            int r1 = (int) r3
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r3 = 1
            boolean r1 = o40.C61926c.m72696u(r3, r1)
            if (r1 == 0) goto L_0x0033
            android.view.ViewGroup r1 = r0.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131831973(0x7f112ca5, float:1.9296987E38)
            goto L_0x0040
        L_0x0033:
            android.view.ViewGroup r1 = r0.f166287d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131831976(0x7f112ca8, float:1.9296993E38)
        L_0x0040:
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r4 = "if (cutLive) root.contex…R.string.live_after_over)"
            gy3.C87412m.m108593f(r1, r4)
            r0.mo8359x0(r1)
            boolean r1 = r0.f25157t
            if (r1 == 0) goto L_0x0109
            d60.b r1 = r0.f25146f
            int r1 = r1.getLiveRole()
            if (r1 != r3) goto L_0x0109
            r0.f25157t = r2
            com.tencent.mm.live.model.RoomLiveService r1 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r1 = r1.f133053g
            if (r1 <= 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            int r1 = eb0.C31543z5.m39455e()
        L_0x0067:
            te3.ep2 r4 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r4 = r4.f133052f
            int r1 = r1 - r4
            java.lang.String r4 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r6 = r5.f133050d
            java.lang.String r8 = r5.f133051e
            int r5 = r5.f133055i
            int r9 = com.tencent.p014mm.live.model.RoomLiveService.f157171C
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r11 = r10.f133056j
            int r10 = r10.f133057n
            int r12 = com.tencent.p014mm.live.model.RoomLiveService.f157173E
            te3.ep2 r13 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            boolean r13 = r13.f133062s
            long r14 = (long) r1
            java.lang.String r1 = e60.C58532b.f167566a
            java.lang.String r1 = "roomId"
            gy3.C87412m.m108594g(r4, r1)
            com.tencent.mm.autogen.mmdata.rpt.LiveAnchorFinishLiveStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.LiveAnchorFinishLiveStruct
            r1.<init>()
            com.tencent.p014mm.live.model.RoomLiveService.f157173E = r2
            r3 = -1
            int r2 = com.tencent.p014mm.live.model.RoomLiveService.f157171C
            if (r2 >= r3) goto L_0x009c
            com.tencent.p014mm.live.model.RoomLiveService.f157171C = r3
            goto L_0x009f
        L_0x009c:
            r2 = 0
            com.tencent.p014mm.live.model.RoomLiveService.f157171C = r2
        L_0x009f:
            r2 = 1
            r1.f9922d = r2
            java.lang.String r2 = "roomid"
            r3 = 1
            java.lang.String r2 = r1.mo86045b(r2, r4, r3)
            r1.f9923e = r2
            r1.f9924f = r6
            java.lang.String r2 = "topic"
            java.lang.String r2 = r1.mo86045b(r2, r8, r3)
            r1.f9925g = r2
            long r2 = (long) r5
            r1.f9927i = r2
            if (r9 > 0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            long r2 = (long) r9
        L_0x00bf:
            r1.f9928j = r2
            long r2 = (long) r12
            r1.f9931m = r2
            long r2 = (long) r11
            r1.f9929k = r2
            long r2 = (long) r10
            r1.f9930l = r2
            if (r13 == 0) goto L_0x00cf
            r2 = 1
            goto L_0x00d1
        L_0x00cf:
            r2 = 0
        L_0x00d1:
            r1.f9932n = r2
            r1.f9934p = r14
            e60.a$a r2 = e60.C7599a.f25866a
            java.lang.String r3 = eb0.C75592q0.m90789s()
            java.lang.String r5 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r3, r5)
            int r3 = r2.mo8728b(r3, r4)
            long r5 = (long) r3
            r1.f9926h = r5
            int r2 = r2.mo8727a(r4)
            long r2 = (long) r2
            r1.f9933o = r2
            r1.mo86054n()
            goto L_0x0109
        L_0x00f2:
            boolean r1 = r1 instanceof z50.C16111r
            if (r1 == 0) goto L_0x0109
            if (r17 != 0) goto L_0x0102
            if (r18 != 0) goto L_0x0102
            java.lang.String r1 = r0.f25147g
            java.lang.String r2 = "open replay success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0109
        L_0x0102:
            java.lang.String r1 = r0.f25147g
            java.lang.String r2 = "open replay fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.C7174c.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C86709a0.m107529k().f251779b.mo123470p(3806, this);
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 5 || ordinal == 6 || ordinal == 7) {
            this.f25157t = true;
            mo10792g(4);
        } else if (ordinal == 27 || ordinal == 28) {
            C66519j0.f191358d.mo90599c();
            String string = this.f166287d.getContext().getResources().getString(C0966R.string.f360948g63);
            C87412m.m108593f(string, "root.context.resources.g…R.string.live_after_over)");
            mo8359x0(string);
            mo10792g(0);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            String str = RoomLiveService.f157199j;
            int color = this.f166287d.getContext().getResources().getColor(C0966R.color.a1u);
            C7181d dVar = new C7181d(this);
            ((C119157j) C119157j.f356862d).mo183875f(new C54670c(str, dVar, color));
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(1);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
    }

    /* renamed from: x0 */
    public final void mo8359x0(String str) {
        String str2;
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        this.f25149i.setText(str);
        TextView textView = this.f25148h;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = this.f166287d.getContext();
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        if (!Util.isNullOrNil(RoomLiveService.f157197h.f133051e) ? (str2 = RoomLiveService.f157197h.f133051e) == null : (str2 = RoomLiveService.f157197h.f133066w) == null) {
            str2 = "";
        }
        textView.setText(hVar.yp0(context, str2, this.f25148h.getTextSize()));
        this.f25150j.setText(String.valueOf(RoomLiveService.f157197h.f133055i));
        this.f25151n.setText(String.valueOf(RoomLiveService.f157197h.f133056j));
        this.f25152o.setText(String.valueOf(RoomLiveService.f157197h.f133057n));
        C49317ep2 ep22 = RoomLiveService.f157197h;
        boolean z = true;
        if (ep22.f133052f > 0) {
            int i = ep22.f133053g;
            if (i <= 0) {
                i = C31543z5.m39455e();
            }
            int i2 = i - RoomLiveService.f157197h.f133052f;
            String a = C15936n0.C15937a.m14866a(C15936n0.f42815a, i2, XVFSFile.PATH_SEPARATOR, i2 >= 3600, false, false, 24, (Object) null);
            String str3 = this.f25147g;
            Log.m105924i(str3, "endTime:" + i + ", duration:" + i2 + ", formatDuration:" + a);
            TextView textView2 = this.f25153p;
            String string = this.f166287d.getContext().getString(C0966R.string.f360946g61);
            C87412m.m108593f(string, "root.context.getString(R…ring.live_after_duration)");
            String format = String.format(string, Arrays.copyOf(new Object[]{a}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView2.setText(format);
        }
        C49317ep2 ep23 = RoomLiveService.f157197h;
        if (TextUtils.isEmpty(ep23.f133063t) || !Util.isEqual(ep23.f133064u, ep23.f133063t)) {
            z = false;
        }
        if (z) {
            this.f25155r.setVisibility(8);
            this.f25154q.setVisibility(0);
        } else if (RoomLiveService.f157197h.f133062s) {
            this.f25155r.setVisibility(8);
            this.f25154q.setVisibility(0);
        } else {
            this.f25155r.setVisibility(8);
            this.f25154q.setVisibility(0);
        }
    }
}
