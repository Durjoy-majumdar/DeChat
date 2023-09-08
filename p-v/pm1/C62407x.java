package pm1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: pm1.x */
public final class C62407x {

    /* renamed from: a */
    public final boolean f177371a;

    /* renamed from: b */
    public final View f177372b;

    /* renamed from: c */
    public final View f177373c;

    /* renamed from: d */
    public final View f177374d;

    /* renamed from: e */
    public final View f177375e;

    /* renamed from: f */
    public final View f177376f;

    /* renamed from: g */
    public final View f177377g;

    /* renamed from: h */
    public final View f177378h;

    public C62407x(View view, int i, boolean z) {
        C87412m.m108594g(view, "view");
        this.f177371a = z;
        this.f177372b = view.findViewById(C0966R.C0970id.f357470a03);
        this.f177373c = view.findViewById(C0966R.C0970id.fmm);
        this.f177374d = view.findViewById(C0966R.C0970id.fmn);
        this.f177375e = view.findViewById(C0966R.C0970id.fmo);
        this.f177376f = view.findViewById(C0966R.C0970id.it6);
        this.f177377g = view.findViewById(C0966R.C0970id.it7);
        this.f177378h = view.findViewById(C0966R.C0970id.it8);
    }

    /* renamed from: a */
    public final boolean mo87455a() {
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_SQUARE_AUDIO_TIPS_COUNT_INT_SYNC;
        int j = i.mo119689j(aVar, 10);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(j - 1));
        return j >= 0;
    }
}
