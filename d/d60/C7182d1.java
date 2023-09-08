package d60;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C58124b;
import di3.C86312j;
import e60.C58532b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p196ln.C76705f;
import p629ny.C76979h;

/* renamed from: d60.d1 */
public final class C7182d1 extends C58121a {

    /* renamed from: f */
    public final C58124b f25165f;

    /* renamed from: g */
    public Context f25166g;

    /* renamed from: h */
    public final ImageView f25167h;

    /* renamed from: i */
    public final TextView f25168i;

    /* renamed from: j */
    public final TextView f25169j;

    /* renamed from: n */
    public String f25170n;

    /* renamed from: o */
    public int f25171o;

    /* renamed from: d60.d1$a */
    public static final class C7183a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C7182d1 f25172d;

        public C7183a(C7182d1 d1Var) {
            this.f25172d = d1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveTitleInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Bundle bundle = new Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", this.f25172d.f25170n);
            this.f25172d.f25165f.statusChange(C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE, bundle);
            if (this.f25172d.f25165f.getLiveRole() == 0) {
                C58532b.m67948d(RoomLiveService.f157192c, RoomLiveService.f157197h.f133050d, RoomLiveService.f157199j, 8, 1, (String) null, RoomLiveService.f157197h.f133055i, 32, (Object) null);
                Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markClickAnchorAvatar");
                C115669n.INSTANCE.mo175913w(1381, 3, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveTitleInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7182d1(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25165f = bVar;
        this.f25166g = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fzi);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…e_title_info_avatar_icon)");
        ImageView imageView = (ImageView) findViewById;
        this.f25167h = imageView;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fzk);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_title_info_name_tv)");
        this.f25168i = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.fzm);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_title_info_title_tv)");
        this.f25169j = (TextView) findViewById3;
        this.f25171o = C75044y4.m89991c(viewGroup.getContext());
        imageView.setOnClickListener(new C7183a(this));
        if (viewGroup.getLayoutParams() != null && (viewGroup.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && mo82893g0()) {
            int d0 = mo82891d0();
            if (d0 == 1) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C74942w4.m89784a(viewGroup.getContext(), 16));
            } else if (d0 == 3) {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(C75044y4.m89991c(viewGroup.getContext()));
            }
        }
    }

    /* renamed from: s0 */
    public void mo3209s0() {
        int c = C75044y4.m89991c(this.f166287d.getContext());
        if (c == 0) {
            c = C74942w4.m89784a(this.f166287d.getContext(), 16);
        }
        this.f25171o = c;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal != 5) {
            if (ordinal != 7) {
                boolean z = true;
                if (ordinal != 39) {
                    if (ordinal != 65) {
                        if (!(ordinal == 27 || ordinal == 28)) {
                            return;
                        }
                    } else if (this.f166287d.getLayoutParams() != null && (this.f166287d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                        int d0 = mo82891d0();
                        if (d0 == 1) {
                            ViewGroup.LayoutParams layoutParams = this.f166287d.getLayoutParams();
                            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(C74942w4.m89784a(this.f166287d.getContext(), 16));
                            this.f166287d.requestLayout();
                            return;
                        } else if (d0 == 3) {
                            ViewGroup.LayoutParams layoutParams2 = this.f166287d.getLayoutParams();
                            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            ((ViewGroup.MarginLayoutParams) layoutParams2).setMarginStart(this.f25171o);
                            this.f166287d.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (this.f25165f.getLiveRole() == 0) {
                    if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                        z = false;
                    }
                    if (z) {
                        mo10792g(4);
                        return;
                    } else {
                        mo10792g(0);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                mo10792g(0);
                return;
            }
        }
        mo10792g(4);
    }

    /* renamed from: x0 */
    public final void mo8366x0(CharSequence charSequence, String str) {
        Class cls = C76979h.class;
        C87412m.m108594g(charSequence, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str, "username");
        this.f25170n = str;
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f25167h, str);
        this.f25169j.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f25166g, charSequence, this.f25169j.getTextSize()));
        this.f25168i.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f166287d.getContext(), RoomLiveService.f157190a.mo76443a(str), this.f25169j.getTextSize()));
        if (Util.isNullOrNil(charSequence)) {
            this.f25169j.setVisibility(8);
            this.f25168i.requestLayout();
            return;
        }
        this.f25169j.setVisibility(0);
    }
}
