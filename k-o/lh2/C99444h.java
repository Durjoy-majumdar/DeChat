package lh2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import lh2.C109344g0;
import qh2.C101198e;
import te3.C101765cp3;
import th2.C110992d;

/* renamed from: lh2.h */
public final class C99444h implements View.OnClickListener, C109344g0 {

    /* renamed from: d */
    public ViewGroup f291566d;

    /* renamed from: e */
    public C101198e f291567e;

    /* renamed from: f */
    public final RelativeLayout f291568f;

    /* renamed from: g */
    public final ImageView f291569g;

    /* renamed from: h */
    public C101765cp3 f291570h = new C101765cp3();

    public C99444h(ViewGroup viewGroup, C101198e eVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(eVar, "status");
        this.f291566d = viewGroup;
        this.f291567e = eVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.cby);
        C87412m.m108593f(findViewById, "parent.findViewById(R.id…ditor_add_location_group)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f291568f = relativeLayout;
        View findViewById2 = this.f291566d.findViewById(C0966R.C0970id.cbw);
        C87412m.m108593f(findViewById2, "parent.findViewById(R.id.editor_add_location)");
        View findViewById3 = this.f291566d.findViewById(C0966R.C0970id.cbx);
        C87412m.m108593f(findViewById3, "parent.findViewById(R.id…ditor_add_location_check)");
        ImageView imageView = (ImageView) findViewById3;
        this.f291569g = imageView;
        ((ImageView) findViewById2).setImageDrawable(C74933u4.m89768e(this.f291566d.getContext(), C0966R.raw.icons_filled_location, -1));
        imageView.setImageDrawable(this.f291566d.getContext().getResources().getDrawable(C0966R.raw.popvideo_post_selected));
        relativeLayout.setOnClickListener(this);
        C75044y4.m89990b(this.f291566d.getContext());
    }

    /* renamed from: a */
    public final void mo138879a() {
        Intent intent = new Intent();
        intent.putExtra("get_poi_classify_id", this.f291570h.f298038i);
        intent.putExtra("get_poi_from_scene", "story");
        intent.putExtra("get_city", this.f291570h.f298035f);
        intent.putExtra("poi_show_none", true);
        intent.putExtra("select_radio_icon_color", "#0E9CE6");
        C88144b.m109795m(this.f291566d.getContext(), "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, 2);
        C5139t.m5183e(22, 10);
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C99444h.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (2 == i && i2 == -1 && intent != null) {
            this.f291570h.f298036g = Util.nullAs(intent.getStringExtra("get_poi_name"), "");
            this.f291570h.f298035f = Util.nullAs(intent.getStringExtra("get_city"), "");
            this.f291570h.f298034e = intent.getFloatExtra("get_lat", -1000.0f);
            this.f291570h.f298033d = intent.getFloatExtra("get_lng", -1000.0f);
            this.f291570h.f298038i = intent.getStringExtra("get_poi_classify_id");
            if (!Util.isNullOrNil(this.f291570h.f298036g) || !Util.isNullOrNil(this.f291570h.f298035f)) {
                this.f291569g.setVisibility(0);
            } else {
                this.f291569g.setVisibility(8);
            }
            Bundle bundle = new Bundle();
            bundle.putByteArray("PARAM_EDIT_POI_INFO", this.f291570h.toByteArray());
            this.f291567e.mo14585p(C101198e.C101199b.EDIT_ADD_POI, bundle);
        }
    }

    public void onAttach() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        WeChatBrands.Business.Entries entries = WeChatBrands.Business.Entries.SessionLocation;
        if (entries != null) {
            if (!entries.checkAvailable(view != null ? view.getContext() : null)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        mo138879a();
        C110992d.f332425a.mo162670d(10);
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/EditAddPoiPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
        this.f291570h = new C101765cp3();
        this.f291569g.setVisibility(8);
    }

    public void setVisibility(int i) {
        this.f291568f.setVisibility(i);
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
