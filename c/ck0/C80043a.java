package ck0;

import com.tencent.stubs.logger.Log;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ck0.a */
public class C80043a {

    /* renamed from: ck0.a$a */
    public static class C80044a extends FilterInputStream {

        /* renamed from: d */
        public long f234482d = 0;

        public C80044a(FileInputStream fileInputStream) {
            super(fileInputStream);
        }

        public synchronized void mark(int i) {
            try {
                this.f234482d = ((FileInputStream) this.in).getChannel().position();
            } catch (IOException e) {
                Log.m106499e("Luggage.ViewAttributeHelper", (Throwable) e, "fail to mark position.");
                this.f234482d = -1;
            }
            return;
        }

        public boolean markSupported() {
            return true;
        }

        public synchronized void reset() {
            if (this.f234482d >= 0) {
                ((FileInputStream) this.in).getChannel().position(this.f234482d);
            } else {
                throw new IOException("Illegal marked position: " + this.f234482d);
            }
        }
    }

    /* renamed from: a */
    public static InputStream m97325a(InputStream inputStream) {
        return inputStream.markSupported() ? inputStream : inputStream instanceof FileInputStream ? new C80044a((FileInputStream) inputStream) : new BufferedInputStream(inputStream);
    }
}
