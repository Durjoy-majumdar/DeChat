package gl3;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: gl3.b */
public abstract class C75922b {

    /* renamed from: a */
    public final int f222604a;

    /* renamed from: b */
    public final int f222605b;

    /* renamed from: c */
    public boolean f222606c = false;

    /* renamed from: d */
    public boolean f222607d;

    /* renamed from: e */
    public boolean f222608e;

    /* renamed from: f */
    public String f222609f;

    /* renamed from: g */
    public boolean f222610g;

    /* renamed from: h */
    public boolean f222611h;

    /* renamed from: i */
    public boolean f222612i;

    /* renamed from: j */
    public boolean f222613j = false;

    /* renamed from: k */
    public boolean f222614k = false;

    /* renamed from: l */
    public boolean f222615l = false;

    /* renamed from: m */
    public boolean f222616m = false;

    /* renamed from: n */
    public boolean f222617n = false;

    /* renamed from: o */
    public boolean f222618o = true;

    /* renamed from: p */
    public String f222619p;

    /* renamed from: q */
    public String f222620q;

    /* renamed from: r */
    public String f222621r;

    /* renamed from: s */
    public int f222622s;

    /* renamed from: t */
    public int f222623t;

    /* renamed from: u */
    public int f222624u;

    /* renamed from: v */
    public int f222625v;

    /* renamed from: w */
    public boolean f222626w;

    /* renamed from: gl3.b$a */
    public interface C75923a {
    }

    /* renamed from: gl3.b$b */
    public interface C75924b {
        /* renamed from: a */
        void mo67029a(Context context, C75923a aVar, C75922b bVar, boolean z, boolean z2);

        /* renamed from: b */
        View mo67030b(Context context, ViewGroup viewGroup, View view);

        /* renamed from: c */
        boolean mo67031c(Context context, View view, C75922b bVar);
    }

    static {
        int h = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3927j7);
        int h2 = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3881hq);
        TextPaint textPaint = new TextPaint();
        TextPaint textPaint2 = new TextPaint();
        textPaint.setTextSize((float) h);
        textPaint2.setTextSize((float) h2);
    }

    public C75922b(int i, int i2) {
        this.f222604a = i;
        this.f222605b = i2;
        Log.m105925i("MicroMsg.BaseContactDataItem", "Create BaseContactDataItem viewType=%d | position=%d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: a */
    public abstract void mo67027a(Context context, C75923a aVar);

    /* renamed from: b */
    public abstract C75924b mo67028b();

    /* renamed from: c */
    public boolean mo106182c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo106183d() {
        return this.f222607d;
    }

    /* renamed from: e */
    public boolean mo106184e() {
        return this.f222608e;
    }

    /* renamed from: f */
    public void mo106185f(String str) {
        this.f222609f = str;
    }

    /* renamed from: g */
    public void mo106186g(boolean z) {
        this.f222607d = z;
    }

    /* renamed from: h */
    public void mo106187h(boolean z) {
        this.f222608e = z;
    }

    /* renamed from: i */
    public SpannableString mo106188i(Context context, String str, int i) {
        return ((C76979h) C86312j.m106911c(C76979h.class)).op0(context, str, i);
    }
}
