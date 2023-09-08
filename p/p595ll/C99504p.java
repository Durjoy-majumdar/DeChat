package p595ll;

import android.graphics.Bitmap;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;
import o40.C61926c;
import p1072al.C92043g;

/* renamed from: ll.p */
public final class C99504p {

    /* renamed from: a */
    public final LinkedList<C99505a> f291732a = new LinkedList<>();

    /* renamed from: b */
    public final HashMap<String, C99505a> f291733b = new HashMap<>();

    /* renamed from: c */
    public C99506b f291734c;

    /* renamed from: d */
    public final C99507c f291735d = new C99507c(this);

    /* renamed from: ll.p$a */
    public static final class C99505a {

        /* renamed from: a */
        public final EmojiInfo f291736a;

        /* renamed from: b */
        public final int f291737b;

        public C99505a(EmojiInfo emojiInfo, int i) {
            C87412m.m108594g(emojiInfo, "emojiInfo");
            this.f291736a = emojiInfo;
            this.f291737b = i;
        }
    }

    /* renamed from: ll.p$b */
    public interface C99506b {
        /* renamed from: a */
        void mo138912a(int i, C99505a aVar);
    }

    /* renamed from: ll.p$c */
    public static final class C99507c implements C92043g.C92044a<Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ C99504p f291738a;

        public C99507c(C99504p pVar) {
            this.f291738a = pVar;
        }

        /* renamed from: a */
        public void mo65752a(int i, IEmojiInfo iEmojiInfo, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            C87412m.m108594g(iEmojiInfo, "emojiInfo");
            boolean z = true;
            if (!(i == -1 || i == 1)) {
                z = false;
            }
            if (z) {
                C61926c.m72668M(new C99509r(this.f291738a, iEmojiInfo, i));
            }
        }
    }

    public C99504p(int i) {
    }
}
