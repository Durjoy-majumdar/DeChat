package gq3;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;
import nj3.C100120b1;

/* renamed from: gq3.a */
public final class C98177a extends C100120b1 {

    /* renamed from: g */
    public final Activity f287843g;

    /* renamed from: h */
    public final ArrayList<QueryImageData> f287844h;

    public C98177a(Activity activity, ArrayList<QueryImageData> arrayList) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(arrayList, "data");
        this.f287843g = activity;
        this.f287844h = arrayList;
    }

    /* renamed from: c */
    public MultiTouchImageView mo129059c(int i, boolean z) {
        return null;
    }

    /* renamed from: d */
    public Object mo129060d(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View inflate = View.inflate(this.f287843g, C0966R.C0971layout.cpc, (ViewGroup) null);
            C87412m.m108593f(inflate, "view");
            C59615b bVar = new C59615b(inflate);
            inflate.setTag(bVar);
            String str = this.f287844h.get(i).f154726g;
            C87412m.m108593f(str, "data[position].scanImagePath");
            bVar.mo84632a(str);
            return inflate;
        }
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.view.page.ImageQueryGalleryViewHolder");
        String str2 = this.f287844h.get(i).f154726g;
        C87412m.m108593f(str2, "data[position].scanImagePath");
        ((C59615b) tag).mo84632a(str2);
        return view;
    }

    /* renamed from: f */
    public WxImageView mo129061f(int i, boolean z) {
        View e = mo139420e(i);
        if (e == null) {
            return null;
        }
        View findViewById = e.findViewById(C0966R.C0970id.mdy);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.i…e_query_gallery_wx_image)");
        if (!z || findViewById.getVisibility() != 8) {
            return (WxImageView) findViewById;
        }
        return null;
    }

    public int getCount() {
        return this.f287844h.size();
    }
}
