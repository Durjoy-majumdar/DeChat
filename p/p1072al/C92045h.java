package p1072al;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: al.h */
public abstract class C92045h<V extends View> extends C92043g<Drawable> {

    /* renamed from: c */
    public WeakReference<V> f263569c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92045h(EmojiInfo emojiInfo, V v) {
        super(emojiInfo);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(v, "view");
        this.f263569c = new WeakReference<>(v);
        C92043g gVar = (C92043g) v.getTag(C0966R.C0970id.cfz);
        if (gVar != null) {
            gVar.mo126012a();
        }
        v.setTag(C0966R.C0970id.cfz, this);
    }

    /* renamed from: a */
    public void mo126012a() {
        super.mo126012a();
        WeakReference<V> weakReference = this.f263569c;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            view.setTag(C0966R.C0970id.cfz, (Object) null);
        }
        this.f263569c = null;
    }
}
