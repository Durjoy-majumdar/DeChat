package bt2;

import android.content.Context;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import at2.C92091c;
import com.tencent.p014mm.picker.base.view.WheelView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;

/* renamed from: bt2.f */
public final class C92307f {

    /* renamed from: a */
    public final Context f264138a;

    /* renamed from: b */
    public final C54219z<C92308a> f264139b;

    /* renamed from: c */
    public final WheelView f264140c;

    /* renamed from: d */
    public final C54219z<C92091c> f264141d;

    /* renamed from: e */
    public C92308a f264142e;

    /* renamed from: bt2.f$a */
    public static final class C92308a {

        /* renamed from: a */
        public final C92091c f264143a;

        /* renamed from: b */
        public final List<C92091c> f264144b;

        /* renamed from: c */
        public final int f264145c;

        /* renamed from: d */
        public final int f264146d;

        public C92308a(C92091c cVar, List list, int i, int i2, int i3, C8480h hVar) {
            i = (i3 & 4) != 0 ? -1 : i;
            i2 = (i3 & 8) != 0 ? 1 : i2;
            C87412m.m108594g(list, "items");
            this.f264143a = cVar;
            this.f264144b = list;
            this.f264145c = i;
            this.f264146d = i2;
        }

        /* renamed from: a */
        public final List<C92091c> mo126291a() {
            SnsMethodCalculate.markStartTimeMs("getItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$PickerData");
            List<C92091c> list = this.f264144b;
            SnsMethodCalculate.markEndTimeMs("getItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController$PickerData");
            return list;
        }
    }

    public C92307f(Context context, C54219z zVar, WheelView wheelView, int i, C8480h hVar) {
        wheelView = (i & 4) != 0 ? new WheelView(context) : wheelView;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(zVar, "bindData");
        C87412m.m108594g(wheelView, "wheelView");
        this.f264138a = context;
        this.f264139b = zVar;
        this.f264140c = wheelView;
        this.f264141d = new C54219z<>();
        wheelView.setOnItemSelectedListener(new C92305d(this));
        zVar.observeForever(new C92306e(this));
    }

    /* renamed from: a */
    public static final C92091c m116081a(C92307f fVar, int i) {
        List<C92091c> a;
        C92091c cVar;
        SnsMethodCalculate.markStartTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        C92308a aVar = fVar.f264142e;
        C92091c cVar2 = null;
        if (!(aVar == null || (a = aVar.mo126291a()) == null)) {
            if (!(a.size() > i)) {
                a = null;
            }
            if (!(a == null || (cVar = a.get(i)) == null)) {
                cVar2 = cVar;
                SnsMethodCalculate.markEndTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                SnsMethodCalculate.markEndTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
                return cVar2;
            }
        }
        Log.m105928w("PickerWheelView", "onItemSelectedListener error: cannot find selectItem!");
        SnsMethodCalculate.markEndTimeMs("getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        SnsMethodCalculate.markEndTimeMs("access$getDataNode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return cVar2;
    }

    /* renamed from: b */
    public final LiveData<C92091c> mo126289b() {
        SnsMethodCalculate.markStartTimeMs("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        C54219z<C92091c> zVar = this.f264141d;
        SnsMethodCalculate.markEndTimeMs("getSelectedItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return zVar;
    }

    /* renamed from: c */
    public final WheelView mo126290c() {
        SnsMethodCalculate.markStartTimeMs("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        WheelView wheelView = this.f264140c;
        SnsMethodCalculate.markEndTimeMs("getWheelView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
        return wheelView;
    }
}
