package rs1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import rx3.C13601g;
import wl1.C66138a;

/* renamed from: rs1.ia */
public final class C63556ia implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ List<TextView> f180244d;

    /* renamed from: e */
    public final /* synthetic */ FinderThumbPlayerProxy f180245e;

    /* renamed from: f */
    public final /* synthetic */ C13194da f180246f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f180247g;

    public C63556ia(List<? extends TextView> list, FinderThumbPlayerProxy finderThumbPlayerProxy, C13194da daVar, C32224a<C13598b0> aVar) {
        this.f180244d = list;
        this.f180245e = finderThumbPlayerProxy;
        this.f180246f = daVar;
        this.f180247g = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object tag = view.getTag();
        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) tag).floatValue();
        List<TextView> list = this.f180244d;
        C13194da daVar = this.f180246f;
        for (TextView textView : list) {
            if (C87412m.m108589b(textView, view)) {
                if (textView != null) {
                    textView.setTextColor(daVar.getContext().getResources().getColor(C0966R.color.f2939n));
                }
            } else if (textView != null) {
                textView.setTextColor(-1);
            }
        }
        this.f180245e.setPlaySpeed(floatValue);
        String videoMediaId = this.f180245e.getVideoMediaId();
        C13601g<C66138a> gVar = C66138a.f190116v;
        C13601g<C66138a> gVar2 = C66138a.f190116v;
        FinderThumbPlayerProxy videoView = gVar2.getValue().mo77450A0().getVideoView();
        if (C87412m.m108589b(videoMediaId, videoView != null ? videoView.getVideoMediaId() : null)) {
            C66138a value = gVar2.getValue();
            if (!value.mo90541w()) {
                Log.m105924i("BaseFinderMiniViewHelper", "setPlaySpeed, do not have ball");
            } else {
                FinderThumbPlayerProxy videoView2 = value.mo77450A0().getVideoView();
                if (videoView2 != null) {
                    videoView2.setPlaySpeed(floatValue);
                }
            }
        }
        C13194da.m12604j3(this.f180246f, false, false, floatValue, 3, (Object) null);
        C32224a<C13598b0> aVar = this.f180247g;
        if (aVar != null) {
            aVar.invoke();
        }
        boolean z = false;
        boolean z2 = floatValue == 0.5f;
        int i = C0966R.raw.icons_outlined_channels_play_quickly_1;
        if (z2) {
            i = C0966R.raw.icons_outlined_channels_play_quickly_0_5;
        } else {
            if (!(floatValue == 1.0f)) {
                if (floatValue == 1.5f) {
                    i = C0966R.raw.icons_outlined_channels_play_quickly_1_5;
                } else {
                    if (floatValue == 2.0f) {
                        z = true;
                    }
                    if (z) {
                        i = C0966R.raw.icons_outlined_channels_play_quickly_2;
                    }
                }
            }
        }
        WeImageView weImageView = (WeImageView) this.f180246f.getActivity().findViewById(C0966R.C0970id.nag);
        if (weImageView != null) {
            weImageView.setImageResource(i);
        }
        WeImageView weImageView2 = (WeImageView) this.f180246f.getActivity().findViewById(C0966R.C0970id.hx6);
        if (weImageView2 != null) {
            weImageView2.setImageResource(i);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC$showSpeedControlArea$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
