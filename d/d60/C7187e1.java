package d60;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import d60.C58124b;
import e60.C58532b;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import z50.C16113v;

/* renamed from: d60.e1 */
public final class C7187e1 extends C58121a implements C11385n {

    /* renamed from: f */
    public final C58124b f25180f;

    /* renamed from: g */
    public final Button f25181g;

    /* renamed from: h */
    public final ImageView f25182h;

    /* renamed from: i */
    public boolean f25183i;

    /* renamed from: j */
    public String f25184j = "";

    /* renamed from: d60.e1$a */
    public static final class C7188a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7187e1 f25185d;

        public C7188a(C7187e1 e1Var) {
            this.f25185d = e1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVerifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f25185d.f25180f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVerifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.e1$b */
    public static final class C7189b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7187e1 f25186d;

        public C7189b(C7187e1 e1Var) {
            this.f25186d = e1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVerifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f25186d.f25182h.isActivated()) {
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                RoomLiveService.f157215z = false;
                this.f25186d.f25182h.setActivated(false);
                this.f25186d.f25181g.setEnabled(false);
            } else {
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                RoomLiveService.f157215z = true;
                this.f25186d.f25182h.setActivated(true);
                this.f25186d.f25181g.setEnabled(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVerifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.e1$c */
    public static final class C7190c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7187e1 f25187d;

        /* renamed from: e */
        public final /* synthetic */ RelativeLayout f25188e;

        public C7190c(C7187e1 e1Var, RelativeLayout relativeLayout) {
            this.f25187d = e1Var;
            this.f25188e = relativeLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVerifyPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f25187d.f25182h.isActivated()) {
                MultiProcessMMKV.getSingleMMKV("tag_live_core").putBoolean("anchor_verify", true);
                C86709a0.m107529k().f251779b.mo123455a(3895, this.f25187d);
                C86709a0.m107529k().f251779b.mo123460f(new C16113v());
                Log.m105924i("MicroMsg.LiveVerifyPlugin", "doscene NetSceneLiveVerify");
            } else {
                C76912y0.makeText(this.f25188e.getContext(), (CharSequence) this.f25188e.getContext().getResources().getString(C0966R.string.g8x), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVerifyPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.e1$d */
    public static final class C7191d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RelativeLayout f25189d;

        public C7191d(RelativeLayout relativeLayout) {
            this.f25189d = relativeLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVerifyPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.LiveVerifyPlugin", "jumpToVerifyAgreementLink.");
            Intent intent = new Intent();
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f25189d.getContext().getString(C0966R.string.gab));
            intent.putExtra("rawUrl", this.f25189d.getContext().getString(C0966R.string.ga_, new Object[]{LocaleUtil.getApplicationLanguage()}));
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            C88144b.m109791i(this.f25189d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVerifyPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.e1$e */
    public static final class C7192e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7187e1 f25190d;

        public C7192e(C7187e1 e1Var) {
            this.f25190d = e1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveVerifyPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25190d.f25182h.performClick();
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveVerifyPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7187e1(RelativeLayout relativeLayout, C58124b bVar) {
        super(relativeLayout, bVar);
        C87412m.m108594g(relativeLayout, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25180f = bVar;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.fzz);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_verify_ok_btn)");
        Button button = (Button) findViewById;
        this.f25181g = button;
        View findViewById2 = relativeLayout.findViewById(C0966R.C0970id.f358595g02);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_verify_top_back)");
        View findViewById3 = relativeLayout.findViewById(C0966R.C0970id.fzy);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_verify_item_selector)");
        ImageView imageView = (ImageView) findViewById3;
        this.f25182h = imageView;
        View findViewById4 = relativeLayout.findViewById(C0966R.C0970id.fzx);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_verify_icon)");
        WeImageView weImageView = (WeImageView) findViewById4;
        View findViewById5 = relativeLayout.findViewById(C0966R.C0970id.f358593g00);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_verify_title)");
        TextView textView = (TextView) findViewById5;
        View findViewById6 = relativeLayout.findViewById(C0966R.C0970id.fzw);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_verify_content_tip)");
        TextView textView2 = (TextView) findViewById6;
        View findViewById7 = relativeLayout.findViewById(C0966R.C0970id.fzu);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.l…e_verify_agreement_group)");
        View findViewById8 = relativeLayout.findViewById(C0966R.C0970id.fzt);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.live_verify_agreement)");
        ((WeImageView) findViewById2).setOnClickListener(new C7188a(this));
        imageView.setEnabled(true);
        imageView.setOnClickListener(new C7189b(this));
        button.setOnClickListener(new C7190c(this, relativeLayout));
        ((TextView) findViewById8).setOnClickListener(new C7191d(relativeLayout));
        ((LinearLayout) findViewById7).setOnClickListener(new C7192e(this));
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        this.f25180f.statusChange(C58124b.C58125b.QUIT_LIVE, new Bundle());
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C16113v) {
            C86709a0.m107529k().f251779b.mo123470p(3895, this);
            if (i == 0 && i2 == 0) {
                C16113v vVar = (C16113v) yVar;
                boolean b = C87412m.m108589b(vVar.f43286f, Boolean.TRUE);
                this.f25183i = b;
                String str2 = vVar.f43287g;
                if (str2 == null) {
                    str2 = "";
                }
                this.f25184j = str2;
                Log.m105925i("MicroMsg.LiveVerifyPlugin", "NetSceneLiveVerify, isVerify:%b, verifyUrl null?:%b", Boolean.valueOf(b), Boolean.valueOf(C87412m.m108589b(this.f25184j, "")));
                if (this.f25183i) {
                    this.f25180f.statusChange(C58124b.C58125b.LIVE_VERIFY_SUCCESS, new Bundle());
                    return;
                }
                RoomLiveService.C1270b bVar = RoomLiveService.f157210u;
                String str3 = this.f25184j;
                bVar.getClass();
                C87412m.m108594g(str3, "<set-?>");
                bVar.f10323b = str3;
                RoomLiveService.f157210u.f10324c = true;
                this.f25180f.statusChange(C58124b.C58125b.START_FACE_VERIFY, new Bundle());
                return;
            }
            Log.m105920e("MicroMsg.LiveVerifyPlugin", "NetSceneLiveVerify error, errType:" + i + " errCode:" + i2);
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 1) {
            mo10792g(0);
            RoomLiveService.f157214y = true;
        } else if (ordinal != 9) {
            mo10792g(8);
        } else {
            if (mo14483f0() == 0) {
                C58532b.m67951g(RoomLiveService.f157192c, RoomLiveService.f157214y, RoomLiveService.f157215z, RoomLiveService.f157197h.f133051e, RoomLiveService.f157213x, this.f166287d.getResources().getConfiguration().orientation, 1, 0, 128, (Object) null);
                Log.m105924i("MicroMsg.LiveAnchorIDKeyStat", "markAnchorExitBeforeStartLive");
                C115669n.INSTANCE.mo175913w(1380, 2, 1);
            }
            mo10792g(8);
        }
    }
}
