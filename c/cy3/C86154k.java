package cy3;

import gy3.C87412m;
import hy3.C33145a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y04.C15925h;

/* renamed from: cy3.k */
public final class C86154k implements C15925h<String> {

    /* renamed from: a */
    public final BufferedReader f250681a;

    /* renamed from: cy3.k$a */
    public static final class C86155a implements Iterator<String>, C33145a {

        /* renamed from: d */
        public String f250682d;

        /* renamed from: e */
        public boolean f250683e;

        /* renamed from: f */
        public final /* synthetic */ C86154k f250684f;

        public C86155a(C86154k kVar) {
            this.f250684f = kVar;
        }

        public boolean hasNext() {
            if (this.f250682d == null && !this.f250683e) {
                String readLine = this.f250684f.f250681a.readLine();
                this.f250682d = readLine;
                if (readLine == null) {
                    this.f250683e = true;
                }
            }
            return this.f250682d != null;
        }

        public Object next() {
            if (hasNext()) {
                String str = this.f250682d;
                this.f250682d = null;
                C87412m.m108591d(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C86154k(BufferedReader bufferedReader) {
        C87412m.m108594g(bufferedReader, "reader");
        this.f250681a = bufferedReader;
    }

    public Iterator<String> iterator() {
        return new C86155a(this);
    }
}
