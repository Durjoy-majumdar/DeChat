package p981ie;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.CharBuffer;
import java.util.NoSuchElementException;
import p981ie.C117178r;

/* renamed from: ie.q */
public final class C117176q {

    /* renamed from: a */
    public final byte[] f351038a;

    /* renamed from: b */
    public final String f351039b;

    /* renamed from: c */
    public RandomAccessFile f351040c;

    /* renamed from: d */
    public int f351041d = -1;

    /* renamed from: e */
    public int f351042e;

    /* renamed from: f */
    public char f351043f;

    /* renamed from: g */
    public char f351044g;

    /* renamed from: h */
    public boolean f351045h = true;

    /* renamed from: i */
    public boolean f351046i = false;

    /* renamed from: ie.q$a */
    public static class C117177a extends RuntimeException {
        public C117177a(String str) {
            super(str);
        }
    }

    public C117176q(String str, byte[] bArr) {
        this.f351039b = str;
        this.f351038a = bArr;
    }

    /* renamed from: a */
    public void mo181101a() {
        RandomAccessFile randomAccessFile = this.f351040c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f351040c = null;
                throw th;
            }
            this.f351040c = null;
        }
    }

    /* renamed from: b */
    public boolean mo181102b() {
        RandomAccessFile randomAccessFile;
        if (this.f351045h && (randomAccessFile = this.f351040c) != null) {
            int i = this.f351041d;
            int i2 = this.f351042e;
            if (i <= i2 - 1) {
                if (i < i2 - 1) {
                    return true;
                }
                try {
                    this.f351042e = randomAccessFile.read(this.f351038a);
                    this.f351041d = -1;
                } catch (IOException unused) {
                    this.f351045h = false;
                    mo181101a();
                }
                return mo181102b();
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo181103c() {
        if (mo181102b()) {
            int i = this.f351041d + 1;
            this.f351041d = i;
            this.f351044g = this.f351043f;
            this.f351043f = (char) this.f351038a[i];
            this.f351046i = false;
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public CharBuffer mo181104d(char c, CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z = true;
        while (true) {
            if (!mo181102b()) {
                break;
            }
            mo181103c();
            if (c != this.f351043f) {
                if (!charBuffer.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.f351043f);
                z = false;
            } else if (!z) {
                mo181108g();
            } else {
                throw new C117177a("Couldn't read string!");
            }
        }
        if (!z) {
            charBuffer.flip();
            return charBuffer;
        }
        throw new C117177a("Couldn't read string because file ended!");
    }

    /* renamed from: e */
    public CharBuffer mo181105e(CharBuffer charBuffer) {
        charBuffer.clear();
        boolean z = true;
        while (true) {
            if (!mo181102b()) {
                break;
            }
            mo181103c();
            if (!Character.isWhitespace(this.f351043f)) {
                if (!charBuffer.hasRemaining()) {
                    CharBuffer allocate = CharBuffer.allocate(charBuffer.capacity() * 2);
                    charBuffer.flip();
                    allocate.put(charBuffer);
                    charBuffer = allocate;
                }
                charBuffer.put(this.f351043f);
                z = false;
            } else if (!z) {
                mo181108g();
            } else {
                throw new C117177a("Couldn't read string!");
            }
        }
        if (!z) {
            charBuffer.flip();
            return charBuffer;
        }
        throw new C117177a("Couldn't read string because file ended!");
    }

    /* renamed from: f */
    public C117176q mo181106f() {
        this.f351045h = true;
        RandomAccessFile randomAccessFile = this.f351040c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0);
            } catch (IOException unused) {
                mo181101a();
            }
        }
        if (this.f351040c == null) {
            try {
                this.f351040c = new RandomAccessFile(this.f351039b, "r");
            } catch (IOException e) {
                this.f351045h = false;
                mo181101a();
                throw new C117178r.C117181c("RAF err: " + e.getMessage());
            }
        }
        if (this.f351045h) {
            this.f351041d = -1;
            this.f351042e = 0;
            this.f351043f = 0;
            this.f351044g = 0;
            this.f351046i = false;
        }
        return this;
    }

    public void finalize() {
        mo181101a();
    }

    /* renamed from: g */
    public final void mo181108g() {
        if (!this.f351046i) {
            this.f351041d--;
            this.f351043f = this.f351044g;
            this.f351046i = true;
            return;
        }
        throw new C117177a("Can only rewind one step!");
    }
}
