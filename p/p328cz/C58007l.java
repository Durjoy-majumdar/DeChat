package p328cz;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.thumbplayer.view.MMThumbPlayerTextureView;
import com.tencent.p014mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import m03.C61425b;
import m03.C61426c;
import m03.C99783d;
import n03.C61598b;
import n03.C61600d;
import p501dz.C58467i;

@C86522b
/* renamed from: cz.l */
public final class C58007l extends C86301e implements C58467i {
    public C61425b L30(Context context) {
        C87412m.m108594g(context, "context");
        return new MMThumbPlayerTextureView(context);
    }

    public C61426c Nu0(Context context) {
        C87412m.m108594g(context, "context");
        return new MultiMediaEffectVideoLayout(context);
    }

    /* renamed from: TF */
    public C99783d mo82809TF(Context context, AttributeSet attributeSet, int i) {
        C87412m.m108594g(context, "context");
        return new ThumbPlayerVideoView(context, attributeSet, i);
    }

    public C61598b s60(AppCompatActivity appCompatActivity, int i, int i2) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C61600d(appCompatActivity, i, i2);
    }
}
