package y52;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import p910lj.C76701a;

/* renamed from: y52.h */
public class C53497h implements C72837v1 {

    /* renamed from: a */
    public Context f150443a;

    public C53497h(Context context) {
        this.f150443a = context;
    }

    /* renamed from: X1 */
    public void mo65586X1(IEmojiInfo iEmojiInfo) {
        Context context = this.f150443a;
        C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.gpe), 0).show();
    }

    /* renamed from: a */
    public void mo65587a() {
    }

    /* renamed from: b */
    public void mo65588b(boolean z, int i) {
    }
}
