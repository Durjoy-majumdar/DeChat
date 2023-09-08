package p218pl;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.search.data.SimilarEmojiQueryModel;
import kotlin.Metadata;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lpl/b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: pl.b */
public final class C11974b implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        SimilarEmojiQueryModel similarEmojiQueryModel = bundle != null ? (SimilarEmojiQueryModel) bundle.getParcelable("model") : null;
        if (similarEmojiQueryModel != null) {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C100799a(similarEmojiQueryModel, new Bundle(), gVar, (C15601d<? super C100799a>) null), 2, (Object) null);
        } else if (gVar != null) {
            gVar.mo894a(null);
        }
    }
}
