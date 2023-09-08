package p1072al;

import com.tencent.p014mm.api.IEmojiInfo;
import di3.C86312j;
import gy3.C87412m;
import p008bq.C92289q0;
import p453bl.C92273c;

/* renamed from: al.g */
public abstract class C92043g<T> {

    /* renamed from: a */
    public final IEmojiInfo f263567a;

    /* renamed from: b */
    public C92273c f263568b;

    /* renamed from: al.g$a */
    public interface C92044a<T> {
        /* renamed from: a */
        void mo65752a(int i, IEmojiInfo iEmojiInfo, T t);
    }

    public C92043g(IEmojiInfo iEmojiInfo) {
        C87412m.m108594g(iEmojiInfo, "emojiInfo");
        this.f263567a = iEmojiInfo;
    }

    /* renamed from: e */
    public static /* synthetic */ void m115671e(C92043g gVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            gVar.mo126013d(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reload");
    }

    /* renamed from: g */
    public static /* synthetic */ void m115672g(C92043g gVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            gVar.mo126010f(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
    }

    /* renamed from: a */
    public void mo126012a() {
        C92273c cVar = this.f263568b;
        if (cVar != null) {
            cVar.mo126265g(this);
        }
    }

    /* renamed from: b */
    public C92273c mo126011b() {
        return ((C92289q0) C86312j.m106911c(C92289q0.class)).En0(this.f263567a);
    }

    /* renamed from: c */
    public abstract void mo126009c(boolean z);

    /* renamed from: d */
    public void mo126013d(boolean z) {
        C92273c cVar = this.f263568b;
        if (cVar != null) {
            cVar.mo126265g(this);
        }
        C92273c b = mo126011b();
        this.f263568b = b;
        if (b != null) {
            if (b.f264102n) {
                mo126009c(b.f264101j);
            } else if (!b.f264103o.contains(this)) {
                b.f264103o.add(this);
            }
        }
        C92273c cVar2 = this.f263568b;
        if (cVar2 != null && !cVar2.f264098g) {
            cVar2.f264098g = true;
            ((C92289q0) C86312j.m106911c(C92289q0.class)).mo126047to(cVar2.mo126262e(), cVar2, z);
        }
    }

    /* renamed from: f */
    public void mo126010f(boolean z) {
        mo126013d(z);
    }
}
