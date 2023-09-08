package p260wk;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import java.util.HashMap;
import p1072al.C92032b;
import p1072al.C92034c;
import p1072al.C92036d;
import p1072al.C92042f;
import p1072al.C92043g;
import p453bl.C92269a;
import p453bl.C92273c;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102156f;
import v60.C102157g;
import v60.C65550c;

/* renamed from: wk.e */
public final class C102457e {

    /* renamed from: a */
    public static final C102457e f301712a = new C102457e();

    /* renamed from: b */
    public static final HashMap<String, C92273c> f301713b = new HashMap<>();

    /* renamed from: c */
    public static final C65222f<C92273c> f301714c;

    /* renamed from: d */
    public static boolean f301715d;

    /* renamed from: wk.e$a */
    public static final class C102458a implements C65550c {
        /* renamed from: a */
        public boolean mo89636a(C65220d dVar) {
            C87412m.m108594g(dVar, "task");
            return true;
        }
    }

    /* renamed from: wk.e$b */
    public static final class C102459b implements C65231j<C92273c> {
        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C92273c cVar = (C92273c) dVar;
            C87412m.m108594g(cVar, "task");
            C87412m.m108594g(nVar, "status");
            C102457e.f301713b.remove(cVar.mo126262e());
        }
    }

    static {
        C65222f<C92273c> fVar = new C65222f<>(new C102156f(new C102458a(), new C102157g(5, 5), 2, "EmojiLoader"));
        f301714c = fVar;
        fVar.mo89353f(new C102459b());
    }

    /* renamed from: a */
    public final C92273c mo142069a(EmojiInfo emojiInfo) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C92273c cVar = f301713b.get(emojiInfo.getMd5() + "_cover");
        return cVar == null ? new C92269a(emojiInfo) : cVar;
    }

    /* renamed from: b */
    public final void mo142070b(View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.EmojiLoader", "cancel: " + view);
        C92043g gVar = (C92043g) view.getTag(C0966R.C0970id.cfz);
        if (gVar != null) {
            gVar.mo126012a();
        }
    }

    /* renamed from: c */
    public final C92032b mo142071c(EmojiInfo emojiInfo, C92043g.C92044a<Bitmap> aVar) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C92032b bVar = new C92032b(emojiInfo, aVar);
        C92043g.m115672g(bVar, false, 1, (Object) null);
        return bVar;
    }

    /* renamed from: d */
    public final C92034c mo142072d(EmojiInfo emojiInfo, ImageView imageView, Drawable drawable) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(imageView, "view");
        C92034c cVar = new C92034c(emojiInfo, imageView, drawable);
        C92043g.m115672g(cVar, false, 1, (Object) null);
        return cVar;
    }

    /* renamed from: e */
    public final C92036d mo142073e(EmojiInfo emojiInfo, C92042f fVar) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        return mo142074f(emojiInfo, true, fVar);
    }

    /* renamed from: f */
    public final C92036d mo142074f(EmojiInfo emojiInfo, boolean z, C92042f fVar) {
        C87412m.m108594g(emojiInfo, "emojiInfo");
        Log.m105924i("MicroMsg.EmojiLoader", "load emoji file " + emojiInfo.getMd5());
        C92036d dVar = new C92036d(emojiInfo, fVar);
        dVar.mo126010f(z);
        return dVar;
    }
}
