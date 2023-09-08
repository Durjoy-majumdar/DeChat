package f24;

import java.io.IOException;
import o24.C21754b0;
import o24.C21766h;
import o24.C21771l;

/* renamed from: f24.f */
public class C20657f extends C21771l {

    /* renamed from: e */
    public boolean f58170e;

    public C20657f(C21754b0 b0Var) {
        super(b0Var);
    }

    /* renamed from: a */
    public void mo32346a(IOException iOException) {
        throw null;
    }

    public void close() {
        if (!this.f58170e) {
            try {
                super.close();
            } catch (IOException e) {
                this.f58170e = true;
                mo32346a(e);
            }
        }
    }

    public void flush() {
        if (!this.f58170e) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f58170e = true;
                mo32346a(e);
            }
        }
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        if (this.f58170e) {
            hVar.skip(j);
            return;
        }
        try {
            super.mo32354x(hVar, j);
        } catch (IOException e) {
            this.f58170e = true;
            mo32346a(e);
        }
    }
}
