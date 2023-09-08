package p453bl;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import kotlin.Metadata;
import p260wk.C102457e;

/* renamed from: bl.e */
public final class C92275e extends C92273c {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lbl/e$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: bl.e$a */
    public static final class C28331a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                bundle.setClassLoader(EmojiInfo.class.getClassLoader());
                EmojiInfo emojiInfo = (EmojiInfo) bundle.getParcelable("KEY_DATA");
                if (emojiInfo != null) {
                    C102457e.f301712a.mo142073e(emojiInfo, new C28330d(gVar));
                } else if (gVar != null) {
                    gVar.mo894a(null);
                }
            } else if (gVar != null) {
                gVar.mo894a(null);
            }
        }
    }

    /* renamed from: bl.e$b */
    public static final class C92276b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C92275e f264106d;

        public C92276b(C92275e eVar) {
            this.f264106d = eVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            boolean z = false;
            if (bundle != null) {
                z = bundle.getBoolean("KEY_RESULT", false);
            }
            this.f264106d.mo126263f(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92275e(EmojiInfo emojiInfo) {
        super(emojiInfo);
        C87412m.m108594g(emojiInfo, "emojiInfo");
    }

    /* renamed from: e */
    public String mo126262e() {
        String md5 = this.f264097f.getMd5();
        C87412m.m108593f(md5, "emojiInfo.md5");
        return md5;
    }

    public void run() {
        this.f264099h = true;
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_DATA", this.f264097f);
        bundle.setClassLoader(EmojiInfo.class.getClassLoader());
        C80907o.m98781d(MMApplicationContext.getMainProcessName(), bundle, C28331a.class, new C92276b(this));
    }
}
