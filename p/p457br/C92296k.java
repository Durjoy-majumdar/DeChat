package p457br;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderImageBackView;
import com.tencent.p014mm.plugin.finder.view.snscover.SnsFinderVideoBackPreview;
import com.tencent.p014mm.plugin.sns.cover.api.IAbsSnsBackPreview;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import pr2.C100849h;

@C86522b
/* renamed from: br.k */
public final class C92296k extends C86301e implements C100849h {
    public IAbsSnsBackPreview U10(Context context) {
        C87412m.m108594g(context, "context");
        return new SnsFinderVideoBackPreview(context);
    }

    public IAbsSnsBackPreview hs0(Context context) {
        C87412m.m108594g(context, "context");
        return new SnsFinderImageBackView(context);
    }
}
