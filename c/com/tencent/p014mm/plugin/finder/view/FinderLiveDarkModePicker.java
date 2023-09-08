package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.CustomOptionPickNew;
import com.tencent.p014mm.picker.base.view.WheelView;
import kotlin.Metadata;
import of0.C21793a;
import p385u2.C111105a;
import qf0.C22083d;
import rf0.C22232f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveDarkModePicker;", "Lcom/tencent/mm/ui/widget/picker/CustomOptionPickNew;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker */
public final class FinderLiveDarkModePicker extends CustomOptionPickNew {

    /* renamed from: i */
    public static final /* synthetic */ int f52564i = 0;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker$a */
    public static final class C18781a implements C22083d {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveDarkModePicker f52565a;

        public C18781a(FinderLiveDarkModePicker finderLiveDarkModePicker) {
            this.f52565a = finderLiveDarkModePicker;
        }

        /* renamed from: a */
        public final void mo22631a(int i) {
            FinderLiveDarkModePicker finderLiveDarkModePicker = this.f52565a;
            int i2 = FinderLiveDarkModePicker.f52564i;
            finderLiveDarkModePicker.f56589g = i;
        }
    }

    public FinderLiveDarkModePicker(Context context) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p));
    }

    /* renamed from: b */
    public void mo23695b() {
        C21793a aVar = new C21793a(getContext(), new C18781a(this));
        aVar.f61766a.f62188e = this.f56590h;
        aVar.f61766a.f62195l = C111105a.m151500b(getContext(), C0966R.color.FG_3);
        aVar.mo34201a(this.f56587e);
        setDividerHeight((float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4175v5));
        setItemHeight(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3743cv));
        setDividerColor(C111105a.m151500b(getContext(), C0966R.color.FG_3));
        C22232f fVar = this.f56587e.f62978p;
        fVar.f62987b.setPadding(0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp), 0, getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
        WheelView wheelView = this.f56587e.f62978p.f62987b;
        wheelView.mo22032e(C111105a.m151500b(getContext(), C0966R.color.FG_0));
        wheelView.f49141d = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        wheelView.invalidate();
    }

    public FinderLiveDarkModePicker(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, C0966R.style.a4p), attributeSet);
    }

    public FinderLiveDarkModePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
