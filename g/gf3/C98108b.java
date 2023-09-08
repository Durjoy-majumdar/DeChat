package gf3;

import a14.C53872d1;
import a14.C53895h;
import b62.C92178b;
import b62.C92179c;
import com.tencent.p014mm.plugin.mediabasic.data.MediaErrorInfo;
import gy3.C87412m;
import wx3.C15601d;

/* renamed from: gf3.b */
public abstract class C98108b implements C98109c {

    /* renamed from: a */
    public C98109c f287585a;

    /* renamed from: a */
    public Object mo137400a(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar) {
        return C53895h.m60469g(C53872d1.f151119c, new C98107a(this, bVar, cVar, (C15601d<? super C98107a>) null), dVar);
    }

    /* renamed from: b */
    public C98109c mo137401b(C98109c cVar) {
        C87412m.m108594g(cVar, "chain");
        C98109c cVar2 = this.f287585a;
        if (cVar2 == null) {
            this.f287585a = cVar;
            return this;
        }
        if (cVar2 != null) {
            cVar2.mo137401b(cVar);
        }
        return this;
    }

    /* renamed from: c */
    public abstract Object mo126328c(C92178b bVar, C92179c cVar, C15601d<? super MediaErrorInfo> dVar);
}
