package yj0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yj0.b */
public class C91464b {

    /* renamed from: a */
    public short f262202a = 0;

    /* renamed from: b */
    public boolean f262203b = false;

    /* renamed from: c */
    public int f262204c = 0;

    /* renamed from: d */
    public short f262205d = 0;

    /* renamed from: e */
    public int f262206e = 0;

    /* renamed from: f */
    public List<ByteBuffer> f262207f = new ArrayList();

    /* renamed from: g */
    public ByteBuffer f262208g = null;

    /* renamed from: h */
    public OutputStream f262209h = null;

    /* renamed from: i */
    public OutputStream f262210i = null;

    /* renamed from: j */
    public OutputStream f262211j = null;

    /* renamed from: k */
    public boolean f262212k;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a7 A[Catch:{ Exception -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C91464b(short r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = ".pcm"
            r3.<init>()
            r1 = 0
            r3.f262202a = r1
            r3.f262203b = r1
            r3.f262204c = r1
            r3.f262205d = r1
            r3.f262206e = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.f262207f = r2
            r2 = 0
            r3.f262208g = r2
            r3.f262209h = r2
            r3.f262210i = r2
            r3.f262211j = r2
            java.lang.System.currentTimeMillis()
            r3.f262202a = r4
            r3.f262212k = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "[hilive] create GameAudioStream sessionId: "
            r4.append(r2)
            short r2 = r3.f262202a
            r4.append(r2)
            java.lang.String r2 = ", enableDebug: "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.GameAudioStream"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            boolean r4 = r3.f262212k
            if (r4 == 0) goto L_0x00d6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r4.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = "/pcm-in-"
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            short r5 = r3.f262202a     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            r4.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00d6 }
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0079 }
            r5.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0079 }
            boolean r2 = r5.mo119967g()     // Catch:{ Exception -> 0x0079 }
            if (r2 == 0) goto L_0x0076
            r5.mo119966f()     // Catch:{ Exception -> 0x0079 }
        L_0x0076:
            r5.mo119964e()     // Catch:{ Exception -> 0x0079 }
        L_0x0079:
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r1)     // Catch:{ Exception -> 0x00d6 }
            r3.f262209h = r4     // Catch:{ Exception -> 0x00d6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r4.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = "/pcm-sl-"
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            short r5 = r3.f262202a     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            r4.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00d6 }
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00ad }
            r5.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x00ad }
            boolean r2 = r5.mo119967g()     // Catch:{ Exception -> 0x00ad }
            if (r2 == 0) goto L_0x00aa
            r5.mo119966f()     // Catch:{ Exception -> 0x00ad }
        L_0x00aa:
            r5.mo119964e()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r1)     // Catch:{ Exception -> 0x00d6 }
            r3.f262210i = r4     // Catch:{ Exception -> 0x00d6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d6 }
            r4.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = "/pcm-ou-"
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            short r5 = r3.f262202a     // Catch:{ Exception -> 0x00d6 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d6 }
            r4.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00d6 }
            java.io.OutputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r1)     // Catch:{ Exception -> 0x00d6 }
            r3.f262211j = r4     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yj0.C91464b.<init>(short, boolean):void");
    }

    /* renamed from: a */
    public byte[] mo125397a() {
        byte[] bArr;
        if (!((ArrayList) this.f262207f).isEmpty()) {
            bArr = ((ByteBuffer) ((ArrayList) this.f262207f).get(0)).array();
            ((ArrayList) this.f262207f).remove(0);
            if (this.f262212k) {
                Log.m105926v("MicroMsg.GameAudioStream", "[hilive] getData sessionId: " + this.f262202a + " channel: " + this.f262205d + " sampleRate: " + this.f262204c + " got data 0: " + bArr[0] + " 10: " + bArr[10] + " 100: " + bArr[100]);
            }
        } else {
            if (this.f262208g.position() == 0) {
                bArr = new byte[this.f262206e];
            } else {
                this.f262208g.rewind();
                bArr = this.f262208g.array();
                this.f262208g.clear();
                OutputStream outputStream = this.f262210i;
                if (outputStream != null) {
                    try {
                        outputStream.write(bArr);
                    } catch (IOException unused) {
                    }
                }
            }
            if (this.f262212k) {
                Log.m105926v("MicroMsg.GameAudioStream", "[hilive] getData default data sessionId: " + this.f262202a + " channel: " + this.f262205d + " sampleRate: " + this.f262204c + "remain: " + this.f262208g.position());
            }
        }
        System.currentTimeMillis();
        OutputStream outputStream2 = this.f262211j;
        if (outputStream2 != null) {
            try {
                outputStream2.write(bArr);
            } catch (IOException unused2) {
            }
        }
        return bArr;
    }

    /* renamed from: b */
    public final void mo125398b(short s, int i) {
        if (!this.f262203b || this.f262205d != s || this.f262204c != i) {
            this.f262203b = true;
            this.f262204c = i;
            this.f262205d = s;
            int i2 = 2 * (((s * i) * 40) / 1000);
            this.f262206e = i2;
            this.f262208g = ByteBuffer.allocate(i2);
            Log.m105924i("MicroMsg.GameAudioStream", "[hilive] onReady, sessionId: " + this.f262202a + " channel: " + s + " samplerate: " + i + " samplesize: " + this.f262206e);
        }
    }

    /* renamed from: c */
    public void mo125399c() {
        Log.m105924i("MicroMsg.GameAudioStream", "[hilive] onStop, sessionId: " + this.f262202a + " samplesize: " + this.f262206e + " remainBuffer: " + ((ArrayList) this.f262207f).size());
        try {
            OutputStream outputStream = this.f262209h;
            if (outputStream != null) {
                outputStream.close();
            }
            OutputStream outputStream2 = this.f262210i;
            if (outputStream2 != null) {
                outputStream2.close();
            }
            OutputStream outputStream3 = this.f262211j;
            if (outputStream3 != null) {
                outputStream3.close();
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: d */
    public void mo125400d(short s, int i, byte[] bArr, long j) {
        mo125398b(s, i);
        OutputStream outputStream = this.f262209h;
        if (outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (IOException unused) {
            }
        }
        if (this.f262212k) {
            Log.m105926v("MicroMsg.GameAudioStream", "[hilive] putData short sessionId: " + this.f262202a + " channel: " + this.f262205d + " samplerate: " + this.f262204c + " data: " + bArr.length + " tmp: " + this.f262208g.capacity() + " buffs: " + ((ArrayList) this.f262207f).size() + " mark: " + j);
        }
        int i2 = 0;
        while (i2 < bArr.length) {
            int min = Math.min(bArr.length - i2, this.f262208g.capacity() - this.f262208g.position());
            this.f262208g.put(bArr, i2, min);
            i2 += min;
            if (this.f262208g.position() >= this.f262208g.capacity()) {
                if (((ArrayList) this.f262207f).size() >= 100) {
                    ((ArrayList) this.f262207f).remove(0);
                    Log.m105928w("MicroMsg.GameAudioStream", "[hilive] buffer full, discard sessionId: " + this.f262202a);
                }
                ByteBuffer byteBuffer = this.f262208g;
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
                byteBuffer.rewind();
                allocate.put(byteBuffer);
                byteBuffer.rewind();
                OutputStream outputStream2 = this.f262210i;
                if (outputStream2 != null) {
                    try {
                        outputStream2.write(allocate.array());
                    } catch (IOException unused2) {
                    }
                }
                ((ArrayList) this.f262207f).add(allocate);
                this.f262208g.clear();
            }
        }
    }

    /* renamed from: e */
    public void mo125401e(short s, int i, float[] fArr) {
        mo125398b(s, i);
        ByteBuffer allocate = ByteBuffer.allocate(fArr.length * 4);
        allocate.asFloatBuffer().put(fArr);
        mo125400d(s, i, allocate.array(), System.currentTimeMillis());
    }
}
