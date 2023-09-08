package gl3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.fts.p059ui.C93938f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gl3.C75939h;
import kg3.C76577a;
import p629ny.C76979h;
import ph3.C77087a;

/* renamed from: gl3.k */
public class C75944k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75939h.C75940a f222698d;

    /* renamed from: e */
    public final /* synthetic */ C75939h f222699e;

    /* renamed from: f */
    public final /* synthetic */ Context f222700f;

    public C75944k(C75945m mVar, C75939h.C75940a aVar, C75939h hVar, Context context) {
        this.f222698d = aVar;
        this.f222699e = hVar;
        this.f222700f = context;
    }

    public void run() {
        CharSequence charSequence;
        CharSequence charSequence2;
        try {
            int measuredWidth = ((ViewGroup) this.f222698d.f222687c.getParent()).getMeasuredWidth();
            if (measuredWidth != 0) {
                String str = "@" + this.f222699e.f222678D;
                int h = C76577a.m92157h(this.f222700f, C0966R.dimen.f3684bd);
                TextView textView = new TextView(this.f222700f);
                float f = (float) h;
                textView.getPaint().setTextSize(f);
                float measureText = textView.getPaint().measureText(" " + str);
                textView.getPaint().setTextSize(this.f222698d.f222687c.getTextSize());
                double d = (double) measuredWidth;
                if (((double) measureText) >= 0.6d * d) {
                    charSequence = TextUtils.ellipsize(this.f222699e.f222601x, textView.getPaint(), (float) (d * 0.4d), TextUtils.TruncateAt.END);
                    float measureText2 = textView.getPaint().measureText(charSequence.toString());
                    textView.getPaint().setTextSize(f);
                    charSequence2 = TextUtils.ellipsize(str, textView.getPaint(), (((float) measuredWidth) - measureText2) - 20.0f, TextUtils.TruncateAt.END);
                } else {
                    charSequence = TextUtils.ellipsize(this.f222699e.f222601x, textView.getPaint(), ((float) measuredWidth) - measureText, TextUtils.TruncateAt.END);
                    charSequence2 = str;
                }
                CharSequence charSequence3 = charSequence;
                SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f222700f, charSequence3 + " " + charSequence2);
                ColorStateList e = C76577a.m92154e(this.f222700f, C0966R.color.f2960ag);
                T1.setSpan(new TextAppearanceSpan((String) null, 0, h, e, e), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
                T1.setSpan(new C77087a(h), charSequence3.length() + 1, charSequence3.length() + 1 + charSequence2.length(), 33);
                C93938f0.m118693a(T1, this.f222698d.f222687c);
            }
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.ContactDataItemDelegate", "fillingViewItem Exception:%s %s", e2.getClass().getSimpleName(), e2.getMessage());
        }
    }
}
