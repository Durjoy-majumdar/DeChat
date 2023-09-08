package d60;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: d60.y */
public final class C7233y extends C58121a {

    /* renamed from: f */
    public final C58124b f25300f;

    /* renamed from: g */
    public final int f25301g = 1;

    /* renamed from: h */
    public final int f25302h = 2;

    /* renamed from: i */
    public final Button f25303i;

    /* renamed from: j */
    public final WeImageView f25304j;

    /* renamed from: n */
    public final TextView f25305n;

    /* renamed from: o */
    public final TextView f25306o;

    /* renamed from: p */
    public int f25307p;

    /* renamed from: q */
    public String f25308q;

    /* renamed from: d60.y$a */
    public static final class C7234a implements View.OnClickListener {

        /* renamed from: d */
        public static final C7234a f25309d = new C7234a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.y$b */
    public static final class C7235b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7233y f25310d;

        public C7235b(C7233y yVar) {
            this.f25310d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f25310d.f25304j.setVisibility(4);
            this.f25310d.mo10792g(8);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.y$c */
    public static final class C7236c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7233y f25311d;

        public C7236c(C7233y yVar) {
            this.f25311d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("open_custom_style_url", true);
            intent.putExtra("forceHideShare", true);
            intent.putExtra("show_native_web_view", true);
            intent.putExtra("rawUrl", this.f25311d.f25308q);
            intent.putExtra("screen_orientation", 1);
            C88144b.m109795m(this.f25311d.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 9);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.y$d */
    public static final class C7237d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7233y f25312d;

        public C7237d(C7233y yVar) {
            this.f25312d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = false;
            C58124b.C7172a.m7372a(this.f25312d.f25300f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: d60.y$e */
    public static final class C7238e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7233y f25313d;

        public C7238e(C7233y yVar) {
            this.f25313d = yVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = false;
            C7233y yVar = this.f25313d;
            yVar.f25303i.setTextColor(yVar.f166287d.getContext().getResources().getColor(C0966R.color.al7));
            this.f25313d.f25303i.setBackgroundResource(C0966R.C0969drawable.f4665jf);
            this.f25313d.mo10792g(8);
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveFaceVerifyPlugin$statusChange$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7233y(RelativeLayout relativeLayout, C58124b bVar) {
        super(relativeLayout, bVar);
        C87412m.m108594g(relativeLayout, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25300f = bVar;
        View findViewById = relativeLayout.findViewById(C0966R.C0970id.ftu);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_face_verify_ui_root)");
        View findViewById2 = relativeLayout.findViewById(C0966R.C0970id.fzz);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_verify_ok_btn)");
        this.f25303i = (Button) findViewById2;
        View findViewById3 = relativeLayout.findViewById(C0966R.C0970id.fts);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_face_verify_top_back)");
        this.f25304j = (WeImageView) findViewById3;
        View findViewById4 = relativeLayout.findViewById(C0966R.C0970id.fzx);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.live_verify_icon)");
        ImageView imageView = (ImageView) findViewById4;
        View findViewById5 = relativeLayout.findViewById(C0966R.C0970id.f358593g00);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_verify_title)");
        this.f25305n = (TextView) findViewById5;
        View findViewById6 = relativeLayout.findViewById(C0966R.C0970id.fzw);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.live_verify_content_tip)");
        this.f25306o = (TextView) findViewById6;
        this.f25307p = -1;
        this.f25308q = "";
        ((RelativeLayout) findViewById).setOnClickListener(C7234a.f25309d);
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.LiveVerifyPlugin", "onActivityResult, requestCode" + i + ", resultCode" + i2);
        if (i == 9) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = false;
            Bundle bundle = null;
            if (intent != null) {
                bundle = intent.getBundleExtra("result_data");
            }
            if (i2 == -1 && bundle != null) {
                String string = bundle.getString("go_next", "");
                String string2 = bundle.getString("result_json");
                if (!Util.isNullOrNil(string2)) {
                    int i3 = new C104289g(string2).getInt("code");
                    Log.m105924i("MicroMsg.LiveVerifyPlugin", "onActivityResult, nextStep" + string + ", code" + i3);
                    if (string.equals("roomlive_verify") && i3 == 0) {
                        mo10792g(8);
                        return;
                    } else if (i3 == 1000) {
                        mo3210u0(C58124b.C58125b.LIVE_FACE_VERIFY_NEED_BIND_BANKCARD, new Bundle());
                        return;
                    } else {
                        mo10792g(8);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("PARAM_FACE_VERIFY_ERROR", C0966R.string.g7_);
                        this.f25300f.statusChange(C58124b.C58125b.BEFORE_LIVE, bundle2);
                        return;
                    }
                }
            }
            mo10792g(8);
        }
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        boolean z = false;
        if (mo14483f0() != 0) {
            return false;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.f157209t.f157227d = false;
        int i = this.f25307p;
        if (i == this.f25302h || i == this.f25301g) {
            z = true;
        }
        if (z) {
            mo10792g(8);
            return true;
        } else if (i != 0) {
            return true;
        } else {
            C58124b.C7172a.m7372a(this.f25300f, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
            return true;
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 3) {
            this.f25307p = this.f25302h;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = true;
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setRequestedOrientation(7);
            if (mo82893g0()) {
                RoomLiveService.C1270b bVar2 = RoomLiveService.f157210u;
                if (!bVar2.f10322a) {
                    bVar2.f10322a = true;
                    return;
                }
            }
            this.f25304j.setVisibility(0);
            this.f25304j.setOnClickListener(new C7235b(this));
            this.f25308q = RoomLiveService.f157210u.f10323b;
            this.f25305n.setText(C0966R.string.g7d);
            if (RoomLiveService.f157210u.f10324c) {
                this.f25306o.setText(C0966R.string.g7f);
            } else {
                this.f25306o.setText(C0966R.string.g7e);
            }
            this.f25303i.setText(C0966R.string.g7g);
            this.f25303i.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.al7));
            this.f25303i.setBackgroundResource(C0966R.C0969drawable.f4665jf);
            this.f25303i.setOnClickListener(new C7236c(this));
            mo10792g(0);
        } else if (ordinal == 4) {
            this.f25307p = this.f25301g;
            RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = true;
            this.f25304j.setVisibility(4);
            this.f25305n.setText(C0966R.string.g7b);
            this.f25306o.setText(C0966R.string.g7c);
            this.f25303i.setText(C0966R.string.gad);
            this.f25303i.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.f3257l0));
            this.f25303i.setBackgroundResource(C0966R.C0969drawable.f4653j6);
            this.f25303i.setOnClickListener(new C7238e(this));
            mo10792g(0);
        } else if (ordinal == 63) {
            this.f25307p = 0;
            RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
            RoomLiveService.f157209t.f157227d = true;
            this.f25304j.setVisibility(4);
            this.f25305n.setText(C0966R.string.g8s);
            this.f25306o.setText(C0966R.string.g8r);
            this.f25303i.setText(C0966R.string.gad);
            this.f25303i.setTextColor(this.f166287d.getContext().getResources().getColor(C0966R.color.al7));
            this.f25303i.setBackgroundResource(C0966R.C0969drawable.f4665jf);
            this.f25303i.setOnClickListener(new C7237d(this));
            mo10792g(0);
        }
    }
}
