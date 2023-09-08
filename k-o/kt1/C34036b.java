package kt1;

import fy3.C32224a;
import gy3.C87413o;
import kt1.C61166a;
import rx3.C13604l;

/* renamed from: kt1.b */
public final class C34036b extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ String f91860d;

    /* renamed from: e */
    public final /* synthetic */ int f91861e;

    /* renamed from: f */
    public final /* synthetic */ C13604l<Boolean, C61166a.C34035b> f91862f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34036b(String str, int i, C13604l<Boolean, C61166a.C34035b> lVar) {
        super(0);
        this.f91860d = str;
        this.f91861e = i;
        this.f91862f = lVar;
    }

    public Object invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("uri:");
        sb.append(this.f91860d);
        sb.append(",errCode:");
        sb.append(this.f91861e);
        sb.append(",size:");
        C61166a.C34035b bVar = (C61166a.C34035b) this.f91862f.f38556e;
        sb.append(bVar != null ? Integer.valueOf(bVar.f91858a) : null);
        return sb.toString();
    }
}
