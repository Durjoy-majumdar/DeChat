package n61;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import java.util.LinkedList;
import p260wk.C102457e;
import rx3.C13598b0;
import te3.C101800k70;
import u61.C101964h;

/* renamed from: n61.d */
public final class C100084d extends RecyclerView.C16613e<C100087e> {

    /* renamed from: d */
    public final C100085a f293203d;

    /* renamed from: e */
    public final LinkedList<C101800k70> f293204e = new LinkedList<>();

    /* renamed from: f */
    public C32224a<C13598b0> f293205f;

    /* renamed from: n61.d$a */
    public interface C100085a {
        /* renamed from: a */
        void mo94740a(C101800k70 k702, int i);
    }

    public C100084d(C100085a aVar) {
        this.f293203d = aVar;
    }

    public int getItemCount() {
        return this.f293204e.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C32224a<C13598b0> aVar;
        C100087e eVar = (C100087e) zVar;
        C87412m.m108594g(eVar, "holder");
        C101800k70 k702 = this.f293204e.get(i);
        C87412m.m108593f(k702, "data[position]");
        C101800k70 k703 = k702;
        eVar.f293209C = k703;
        C102457e eVar2 = C102457e.f301712a;
        EmojiInfo h = C101964h.m134226h(k703);
        ImageView imageView = eVar.f293208B;
        C87412m.m108593f(imageView, "emojiView");
        eVar2.mo142072d(h, imageView, (Drawable) null);
        if (i >= getItemCount() - 4 && (aVar = this.f293205f) != null) {
            aVar.invoke();
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7157x2, viewGroup, false);
        C87412m.m108593f(inflate, "itemView");
        return new C100087e(inflate, this.f293203d);
    }
}
