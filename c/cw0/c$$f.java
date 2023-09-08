package cw0;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import p003ay.C0235b;
import qo3.C77426q;
import qo3.C77429t;
import wn2.C111813a;

public class c$$f implements C77429t {

    /* renamed from: a */
    public final /* synthetic */ C111813a f349525a;

    /* renamed from: b */
    public final /* synthetic */ Context f349526b;

    /* renamed from: c */
    public final /* synthetic */ boolean f349527c;

    /* renamed from: d */
    public final /* synthetic */ String f349528d;

    /* renamed from: e */
    public final /* synthetic */ C77426q f349529e;

    /* renamed from: f */
    public final /* synthetic */ C0235b.C0236a f349530f;

    public c$$f(C111813a aVar, Context context, boolean z, int i, String str, C77426q qVar, C0235b.C0236a aVar2) {
        this.f349525a = aVar;
        this.f349526b = context;
        this.f349527c = z;
        this.f349528d = str;
        this.f349529e = qVar;
        this.f349530f = aVar2;
    }

    /* renamed from: a */
    public void mo8330a(boolean z, String str, boolean z2) {
        if (z) {
            this.f349525a.mo163517a(this.f349526b);
            if (this.f349527c) {
                C115669n.INSTANCE.mo160131h(15783, 2, 0, this.f349528d);
            }
        } else {
            C116542c.m164365b(this.f349529e, 2, this.f349528d, this.f349527c);
        }
        this.f349530f.mo270a(z2, this.f349528d, 2);
    }
}
