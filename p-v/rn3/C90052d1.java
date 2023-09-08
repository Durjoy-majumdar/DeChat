package rn3;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.transmit.C85970n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;

/* renamed from: rn3.d1 */
public final class C90052d1 implements C90049b0 {

    /* renamed from: a */
    public final /* synthetic */ C85970n.C85971a f258687a;

    /* renamed from: b */
    public final /* synthetic */ C44561j f258688b;

    /* renamed from: c */
    public final /* synthetic */ WXMediaMessage f258689c;

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f258690d;

    /* renamed from: e */
    public final /* synthetic */ String f258691e;

    /* renamed from: f */
    public final /* synthetic */ String f258692f;

    /* renamed from: g */
    public final /* synthetic */ int f258693g;

    /* renamed from: h */
    public final /* synthetic */ boolean f258694h;

    /* renamed from: i */
    public final /* synthetic */ boolean f258695i;

    /* renamed from: j */
    public final /* synthetic */ String f258696j;

    /* renamed from: k */
    public final /* synthetic */ C85970n.C85973b f258697k;

    public C90052d1(C85970n.C85971a aVar, C44561j jVar, WXMediaMessage wXMediaMessage, LinkedList<String> linkedList, String str, String str2, int i, boolean z, boolean z2, String str3, C85970n.C85973b bVar) {
        this.f258687a = aVar;
        this.f258688b = jVar;
        this.f258689c = wXMediaMessage;
        this.f258690d = linkedList;
        this.f258691e = str;
        this.f258692f = str2;
        this.f258693g = i;
        this.f258694h = z;
        this.f258695i = z2;
        this.f258696j = str3;
        this.f258697k = bVar;
    }

    /* renamed from: a */
    public final void mo119879a(String str, boolean z) {
        if (!z) {
            Log.m105920e("MicroMsg.SendWXMediaMessageHelper", "thumb img CDN upload fail!");
            C85970n.C85971a aVar = this.f258687a;
            if (aVar != null) {
                C85970n.C85971a.C85972a.m106303a(aVar, 5, (Object) null, 2, (Object) null);
                return;
            }
            return;
        }
        C85970n.C85971a aVar2 = this.f258687a;
        if (aVar2 != null) {
            C85970n.C85971a.C85972a.m106303a(aVar2, 4, (Object) null, 2, (Object) null);
        }
        C85970n.f250401a.mo119888j(this.f258688b, this.f258689c, this.f258690d, this.f258691e, this.f258692f, this.f258693g, this.f258694h, this.f258695i, this.f258696j, str, (Object) null, this.f258687a, this.f258697k);
        C85970n.C85971a aVar3 = this.f258687a;
        if (aVar3 != null) {
            C85970n.C85971a.C85972a.m106303a(aVar3, 6, (Object) null, 2, (Object) null);
        }
    }
}
