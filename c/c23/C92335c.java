package c23;

import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/* renamed from: c23.c */
public final class C92335c {

    /* renamed from: a */
    public final LinkedList<C92334b> f264201a = new LinkedList<>();

    /* renamed from: b */
    public final LinkedList<C92333a> f264202b = new LinkedList<>();

    public C92335c() {
        try {
            InputStream open = MMApplicationContext.getContext().getAssets().open("pag/magic/pag_magic.json");
            C87412m.m108593f(open, "getContext().assets.open(MAGIC_CONFIG)");
            String streamToString = Util.streamToString(open);
            Log.m105924i("MicroMsg.MagicListData", "initVideoTemplates config:" + streamToString);
            C26827e l = new C104289g(streamToString).optJSONArray("magicList");
            int length = l.length();
            for (int i = 0; i < length; i++) {
                C104289g o = l.mo53814m(i);
                if (o.optInt("use", 0) == 1) {
                    this.f264202b.add(new C92333a("pag/magic/" + o.optString("pag"), "pag/magic/" + o.optString("cover")));
                }
            }
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.MagicListData", "parse magic config error");
        }
    }

    /* renamed from: a */
    public final List<C67333e> mo126327a() {
        LinkedList linkedList = new LinkedList();
        if (this.f264201a.size() > 0) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.f361007gl3);
            C87412m.m108593f(string, "getContext().getString(R…g.magic_list_title_added)");
            linkedList.add(new C67334f(string));
            linkedList.addAll(this.f264201a);
        }
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.gl4);
        C87412m.m108593f(string2, "getContext().getString(R…ing.magic_list_title_all)");
        linkedList.add(new C67334f(string2));
        for (C92333a dVar : this.f264202b) {
            linkedList.add(new C92336d(dVar));
        }
        return linkedList;
    }
}
