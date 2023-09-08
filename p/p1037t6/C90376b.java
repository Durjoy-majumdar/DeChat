package p1037t6;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import p673r6.C89876b;

/* renamed from: t6.b */
public class C90376b extends FilterInputStream {

    /* renamed from: d */
    public long f259388d = 0;

    public C90376b(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    public void mark(int i) {
        try {
            this.f259388d = ((FileInputStream) this.in).getChannel().position();
        } catch (Exception e) {
            C89876b.m112386c("MicroMsg.FileSeekingInputStream", e, "Failed seeking FileChannel.", new Object[0]);
        }
    }

    public boolean markSupported() {
        return true;
    }

    public void reset() {
        ((FileInputStream) this.in).getChannel().position(this.f259388d);
    }
}
