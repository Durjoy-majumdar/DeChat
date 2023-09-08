package p360m7;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p333e8.C20541m;
import p355l7.C21392a;
import p355l7.C21395c;

/* renamed from: m7.a */
public final class C21485a implements C21392a {
    /* renamed from: a */
    public Metadata mo33521a(C21395c cVar) {
        ByteBuffer byteBuffer = cVar.f67260f;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C20541m mVar = new C20541m(array, limit);
        String j = mVar.mo32099j();
        String j2 = mVar.mo32099j();
        long o = mVar.mo32104o();
        mVar.mo32114y(4);
        return new Metadata(new EventMessage(j, j2, (mVar.mo32104o() * 1000) / o, mVar.mo32104o(), Arrays.copyOfRange(array, mVar.f57810b, limit)));
    }
}
