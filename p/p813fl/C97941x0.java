package p813fl;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import my3.C34690i;
import my3.C61595o;
import p490dl.C58320u;
import rx3.C13598b0;
import sx3.C36904l0;
import sx3.C64197v;
import wh3.C102452z;
import z51.C39315g;

/* renamed from: fl.x0 */
public final class C97941x0 extends C97887a {

    /* renamed from: d */
    public final boolean f287277d;

    /* renamed from: e */
    public int f287278e;

    public C97941x0(int i) {
        super(C97929r0.m126481c());
        ArrayList arrayList;
        EmojiGroupInfo emojiGroupInfo = new EmojiGroupInfo();
        emojiGroupInfo.field_productID = "smiley_recent";
        emojiGroupInfo.field_packName = MMApplicationContext.getContext().getString(C0966R.string.c74);
        C13598b0 b0Var = C13598b0.f38549a;
        C97903f0 f0Var = new C97903f0(new C97928r(1, emojiGroupInfo));
        List<C102452z> e = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138018e();
        int min = Math.min(e != null ? e.size() : 0, i);
        this.f287277d = min > 0;
        if (min > 0) {
            this.f287179c.add(f0Var);
            this.f287278e += min;
            C36904l0 i2 = C61595o.m72301i(0, min).iterator();
            while (((C34690i) i2).f93287f) {
                int a = i2.mo59695a();
                this.f287179c.add(new C97939w0(new C58320u(e.get(a).f301705a), true, a + 1));
            }
        }
        this.f287179c.add(this.f287178b);
        C96926b0 b = C96926b0.m124490b();
        synchronized (b.f283937d) {
            arrayList = new ArrayList(b.f283937d);
        }
        this.f287278e += arrayList.size();
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 >= 0) {
                this.f287179c.add(new C97939w0(new C58320u(((SmileyPanelConfigInfo) next).field_key), false, i4));
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public int getDataCount() {
        return this.f287278e;
    }
}
