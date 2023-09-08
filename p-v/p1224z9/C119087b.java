package p1224z9;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: z9.b */
public class C119087b implements C119086a {

    /* renamed from: b */
    public final int f356634b = 1073741824;

    /* renamed from: c */
    public final int f356635c = 1024;

    /* renamed from: d */
    public final ByteBuffer[] f356636d;

    /* renamed from: e */
    public final long f356637e;

    /* renamed from: f */
    public long f356638f;

    public C119087b(File file) {
        long length = file.length();
        this.f356637e = length;
        int i = ((int) (length / ((long) 1073741824))) + 1;
        this.f356636d = new ByteBuffer[i];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i2 = 0;
        long j = 0;
        while (i2 < i) {
            try {
                this.f356636d[i2] = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, j, Math.min(this.f356637e - j, (long) (this.f356634b + this.f356635c)));
                this.f356636d[i2].order(C119086a.f356633a);
                j += (long) this.f356634b;
                i2++;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        }
        this.f356638f = 0;
        fileInputStream.close();
    }

    /* renamed from: a */
    public final int mo183755a() {
        return (int) (this.f356638f / ((long) this.f356634b));
    }

    /* renamed from: b */
    public final int mo183756b() {
        return (int) (this.f356638f % ((long) this.f356634b));
    }

    /* renamed from: c */
    public byte mo183757c() {
        byte b = this.f356636d[mo183755a()].get(mo183756b());
        this.f356638f++;
        return b;
    }

    /* renamed from: d */
    public int mo183758d() {
        int i = this.f356636d[mo183755a()].getInt(mo183756b());
        this.f356638f += 4;
        return i;
    }

    /* renamed from: e */
    public long mo183759e() {
        long j = this.f356636d[mo183755a()].getLong(mo183756b());
        this.f356638f += 8;
        return j;
    }

    /* renamed from: f */
    public short mo183760f() {
        short s = this.f356636d[mo183755a()].getShort(mo183756b());
        this.f356638f += 2;
        return s;
    }
}
