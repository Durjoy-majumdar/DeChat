package com.tencent.p014mm.plugin.finder.view.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import te3.C64284cg;
import tf0.C64916p1;
import vr1.C14973a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106B#\b\u0016\u0012\u0006\u00102\u001a\u000201\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b5\u00109J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b!\u0010\u000fR\u0017\u0010%\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u0017\u0010(\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u000fR0\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010)8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006:"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/card/FinderProfileCardView;", "Landroid/widget/FrameLayout;", "", "name", "Lrx3/b0;", "setName", "Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;", "authInfo", "setAuth", "text", "setRightText", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "getAvatarIv", "()Landroid/widget/ImageView;", "avatarIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getNameTv", "()Landroid/widget/TextView;", "nameTv", "Landroid/view/View;", "f", "Landroid/view/View;", "getAuthContainer", "()Landroid/view/View;", "authContainer", "g", "getAuthTv", "authTv", "h", "getAuthIv", "authIv", "i", "getRightTv", "rightTv", "j", "getArrowIv", "arrowIv", "Lkotlin/Function1;", "n", "Lfy3/l;", "getOnClick", "()Lfy3/l;", "setOnClick", "(Lfy3/l;)V", "onClick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.card.FinderProfileCardView */
public final class FinderProfileCardView extends FrameLayout {

    /* renamed from: d */
    public final ImageView f18099d;

    /* renamed from: e */
    public final TextView f18100e;

    /* renamed from: f */
    public final View f18101f;

    /* renamed from: g */
    public final TextView f18102g;

    /* renamed from: h */
    public final ImageView f18103h;

    /* renamed from: i */
    public final TextView f18104i;

    /* renamed from: j */
    public final ImageView f18105j;

    /* renamed from: n */
    public C32226l<? super View, C13598b0> f18106n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.d4o, this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        View findViewById = frameLayout.findViewById(C0966R.C0970id.nvf);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…nder_profile_card_avatar)");
        this.f18099d = (ImageView) findViewById;
        View findViewById2 = frameLayout.findViewById(C0966R.C0970id.nvg);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…finder_profile_card_name)");
        this.f18100e = (TextView) findViewById2;
        View findViewById3 = frameLayout.findViewById(C0966R.C0970id.nvc);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…file_card_auth_container)");
        this.f18101f = findViewById3;
        View findViewById4 = frameLayout.findViewById(C0966R.C0970id.nve);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…r_profile_card_auth_name)");
        this.f18102g = (TextView) findViewById4;
        View findViewById5 = frameLayout.findViewById(C0966R.C0970id.nvd);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…r_profile_card_auth_icon)");
        this.f18103h = (ImageView) findViewById5;
        View findViewById6 = frameLayout.findViewById(C0966R.C0970id.nvi);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.…_profile_card_right_text)");
        this.f18104i = (TextView) findViewById6;
        View findViewById7 = frameLayout.findViewById(C0966R.C0970id.nvh);
        C87412m.m108593f(findViewById7, "rootView.findViewById(R.…profile_card_right_arrow)");
        this.f18105j = (ImageView) findViewById7;
        frameLayout.setOnClickListener(new C14973a(this));
    }

    public final ImageView getArrowIv() {
        return this.f18105j;
    }

    public final View getAuthContainer() {
        return this.f18101f;
    }

    public final ImageView getAuthIv() {
        return this.f18103h;
    }

    public final TextView getAuthTv() {
        return this.f18102g;
    }

    public final ImageView getAvatarIv() {
        return this.f18099d;
    }

    public final TextView getNameTv() {
        return this.f18100e;
    }

    public final C32226l<View, C13598b0> getOnClick() {
        return this.f18106n;
    }

    public final TextView getRightTv() {
        return this.f18104i;
    }

    public final void setAuth(FinderAuthInfo finderAuthInfo) {
        FinderAuthInfo finderAuthInfo2 = finderAuthInfo;
        if (finderAuthInfo2 == null || finderAuthInfo2.authIconType <= 0) {
            View view = this.f18101f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView", "setAuth", "(Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView", "setAuth", "(Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f18101f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView", "setAuth", "(Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/card/FinderProfileCardView", "setAuth", "(Lcom/tencent/mm/protocal/protobuf/FinderAuthInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f18102g.setText(finderAuthInfo2.authProfession);
        C7335d c = C86312j.m106911c(C64916p1.class);
        C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
        C64916p1.C64917a.m76444k((C64916p1) c, this.f18103h, finderAuthInfo, 0, (C64284cg) null, 12, (Object) null);
    }

    public final void setName(String str) {
        C87412m.m108594g(str, "name");
        C85875k4.m106189j0(this.f18100e.getPaint(), 0.8f);
        this.f18100e.setText(str);
    }

    public final void setOnClick(C32226l<? super View, C13598b0> lVar) {
        this.f18106n = lVar;
    }

    public final void setRightText(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        this.f18104i.setVisibility(0);
        this.f18104i.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderProfileCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(getContext(), C0966R.C0971layout.d4o, this);
        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        View findViewById = frameLayout.findViewById(C0966R.C0970id.nvf);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…nder_profile_card_avatar)");
        this.f18099d = (ImageView) findViewById;
        View findViewById2 = frameLayout.findViewById(C0966R.C0970id.nvg);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…finder_profile_card_name)");
        this.f18100e = (TextView) findViewById2;
        View findViewById3 = frameLayout.findViewById(C0966R.C0970id.nvc);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…file_card_auth_container)");
        this.f18101f = findViewById3;
        View findViewById4 = frameLayout.findViewById(C0966R.C0970id.nve);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…r_profile_card_auth_name)");
        this.f18102g = (TextView) findViewById4;
        View findViewById5 = frameLayout.findViewById(C0966R.C0970id.nvd);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…r_profile_card_auth_icon)");
        this.f18103h = (ImageView) findViewById5;
        View findViewById6 = frameLayout.findViewById(C0966R.C0970id.nvi);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.…_profile_card_right_text)");
        this.f18104i = (TextView) findViewById6;
        View findViewById7 = frameLayout.findViewById(C0966R.C0970id.nvh);
        C87412m.m108593f(findViewById7, "rootView.findViewById(R.…profile_card_right_arrow)");
        this.f18105j = (ImageView) findViewById7;
        frameLayout.setOnClickListener(new C14973a(this));
    }
}
